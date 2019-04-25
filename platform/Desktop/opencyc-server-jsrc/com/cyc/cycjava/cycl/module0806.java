package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0806 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0806";
    public static final String myFingerPrint = "2f3e74ce010cddec1c42a7e43c611715b609546b428ee69c3b57b130903b1bd5";
    private static SubLSymbol $g6403$;
    public static SubLSymbol $g6404$;
    public static SubLSymbol $g6405$;
    private static SubLSymbol $g6406$;
    private static SubLSymbol $g6407$;
    private static SubLSymbol $g6408$;
    private static SubLSymbol $g6409$;
    private static SubLSymbol $g6410$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLInteger $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLList $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLList $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLList $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLInteger $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLList $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLInteger $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLList $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLList $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLList $ic116$;
    private static final SubLList $ic117$;
    private static final SubLList $ic118$;
    private static final SubLList $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLObject $ic126$;
    private static final SubLList $ic127$;
    private static final SubLList $ic128$;
    private static final SubLList $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLObject $ic132$;
    private static final SubLList $ic133$;
    private static final SubLList $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLList $ic136$;
    private static final SubLObject $ic137$;
    private static final SubLObject $ic138$;
    private static final SubLObject $ic139$;
    private static final SubLObject $ic140$;
    private static final SubLObject $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLObject $ic148$;
    private static final SubLList $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLObject $ic153$;
    private static final SubLList $ic154$;
    
    public static SubLObject f51270(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        SubLObject var5 = (SubLObject)NIL;
        var4 = conses_high.putf(var4, (SubLObject)$ic0$, (SubLObject)T);
        final SubLObject var6 = (SubLObject)$ic1$;
        final SubLObject var7 = f51271(var1, var6);
        final SubLObject var8 = f51271(var2, var6);
        final SubLObject var9 = module0202.f12774(var7, var8);
        final SubLObject var10 = module0409.f28506(var9, var3, var4);
        var5 = module0540.f33526(var10);
        return var5;
    }
    
    public static SubLObject f51272(final SubLObject var11, final SubLObject var3, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        SubLObject var13 = (SubLObject)NIL;
        if (NIL != module0202.f12925(var11)) {
            var13 = f51273(var13, var11, var3);
            final SubLObject var14 = module0205.f13132(var11);
            if (NIL != conses_high.member(var14, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var15 = f51274(var11);
                if (var14.eql($ic3$) && !ZERO_INTEGER.eql(module0205.f13345(var11, (SubLObject)UNPROVIDED))) {
                    final SubLObject var16 = module0202.f12817((SubLObject)ZERO_INTEGER, $ic4$, conses_high.butlast(var11, (SubLObject)UNPROVIDED));
                    var13 = (SubLObject)ConsesLow.cons(var16, var13);
                    f51275(var12, var16, var11);
                    SubLObject var17 = var15;
                    SubLObject var18 = (SubLObject)NIL;
                    var18 = var17.first();
                    while (NIL != var17) {
                        f51275(var12, var16, var18);
                        var17 = var17.rest();
                        var18 = var17.first();
                    }
                }
                SubLObject var19 = var15;
                SubLObject var20 = (SubLObject)NIL;
                var20 = var19.first();
                while (NIL != var19) {
                    var13 = (SubLObject)ConsesLow.cons(var20, var13);
                    module0084.f5762(var12, var20, var11);
                    var19 = var19.rest();
                    var20 = var19.first();
                }
            }
            else if (var14.eql($ic5$)) {
                final SubLObject var21 = module0205.f13204(var11, (SubLObject)UNPROVIDED);
                final SubLObject var22 = (SubLObject)$ic6$;
                SubLObject var17 = f51276(var21);
                SubLObject var23 = (SubLObject)NIL;
                var23 = var17.first();
                while (NIL != var17) {
                    final SubLObject var24 = module0202.f12776(var22, module0276.f18287((SubLObject)ConsesLow.list(module0202.f12817((SubLObject)TWO_INTEGER, var22, var11), (SubLObject)ConsesLow.list($ic7$, var23, var22)), (SubLObject)UNPROVIDED));
                    var13 = (SubLObject)ConsesLow.cons(var24, var13);
                    f51275(var12, var24, var11);
                    var17 = var17.rest();
                    var23 = var17.first();
                }
            }
            else if (NIL != module0260.f17089(var14, $ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var25 = module0205.f13204(var11, (SubLObject)UNPROVIDED);
                final SubLObject var26 = (SubLObject)$ic6$;
                SubLObject var17 = f51277(var25, var3);
                SubLObject var27 = (SubLObject)NIL;
                var27 = var17.first();
                while (NIL != var17) {
                    final SubLObject var24 = module0202.f12776(var26, module0276.f18287((SubLObject)ConsesLow.list(module0202.f12817((SubLObject)TWO_INTEGER, var26, var11), (SubLObject)ConsesLow.list($ic9$, var27, var26)), (SubLObject)UNPROVIDED));
                    var13 = (SubLObject)ConsesLow.cons(var24, var13);
                    f51275(var12, var24, var11);
                    var17 = var17.rest();
                    var27 = var17.first();
                }
                var17 = f51278(var25);
                SubLObject var28 = (SubLObject)NIL;
                var28 = var17.first();
                while (NIL != var17) {
                    final SubLObject var24 = module0202.f12776(var26, module0276.f18287((SubLObject)ConsesLow.list(module0202.f12817((SubLObject)TWO_INTEGER, var26, var11), (SubLObject)ConsesLow.list($ic10$, var26, var28)), (SubLObject)UNPROVIDED));
                    var13 = (SubLObject)ConsesLow.cons(var24, var13);
                    f51275(var12, var24, var11);
                    var17 = var17.rest();
                    var28 = var17.first();
                }
            }
            var13 = f51279(var13, var11, var3, var12);
            var13 = Sequences.nreverse(var13);
        }
        else if (NIL != module0202.f12606(var11)) {
            var13 = f51280(var13, var11, var3, var12);
        }
        return Values.values(var13, var12);
    }
    
    public static SubLObject f51273(SubLObject var5, final SubLObject var11, final SubLObject var3) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        var12.resetMultipleValues();
        SubLObject var13 = module0337.f22630(var11, (SubLObject)$ic11$);
        SubLObject var14 = var12.secondMultipleValue();
        var12.resetMultipleValues();
        if (NIL != var13) {
            final SubLObject var15 = module0035.f2294(var14, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var16 = module0035.f2294(var14, (SubLObject)$ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == module0260.f17089(var16, $ic10$, var3, (SubLObject)UNPROVIDED)) {
                final SubLObject var17 = (SubLObject)$ic6$;
                final SubLObject var19;
                final SubLObject var18 = var19 = module0202.f12776(var17, (SubLObject)ConsesLow.list(var16, (SubLObject)$ic14$, var17));
                if (NIL == conses_high.member(var19, var5, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var5 = (SubLObject)ConsesLow.cons(var19, var5);
                }
                SubLObject var20 = module0259.f16822(var15, var3, (SubLObject)UNPROVIDED);
                SubLObject var21 = (SubLObject)NIL;
                var21 = var20.first();
                while (NIL != var20) {
                    final SubLObject var22;
                    final SubLObject var30_33 = var22 = module0202.f12776(var17, module0276.f18287((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list($ic10$, var17, var21), (SubLObject)ConsesLow.list(var16, (SubLObject)$ic14$, var17)), (SubLObject)UNPROVIDED));
                    if (NIL == conses_high.member(var22, var5, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var5 = (SubLObject)ConsesLow.cons(var22, var5);
                    }
                    var20 = var20.rest();
                    var21 = var20.first();
                }
            }
        }
        var12.resetMultipleValues();
        var13 = module0337.f22630(var11, (SubLObject)$ic15$);
        var14 = var12.secondMultipleValue();
        var12.resetMultipleValues();
        if (NIL != var13) {
            final SubLObject var15 = module0035.f2294(var14, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var16 = module0035.f2294(var14, (SubLObject)$ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var17 = (SubLObject)$ic6$;
            final SubLObject var19;
            final SubLObject var18 = var19 = module0202.f12776(var17, (SubLObject)ConsesLow.listS(var16, var17, (SubLObject)$ic16$));
            if (NIL == conses_high.member(var19, var5, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var5 = (SubLObject)ConsesLow.cons(var19, var5);
            }
            SubLObject var20 = module0259.f16822(var15, var3, (SubLObject)UNPROVIDED);
            SubLObject var21 = (SubLObject)NIL;
            var21 = var20.first();
            while (NIL != var20) {
                final SubLObject var22;
                final SubLObject var30_34 = var22 = module0202.f12776(var17, module0276.f18287((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list($ic10$, var17, var21), (SubLObject)ConsesLow.listS(var16, var17, (SubLObject)$ic16$)), (SubLObject)UNPROVIDED));
                if (NIL == conses_high.member(var22, var5, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var5 = (SubLObject)ConsesLow.cons(var22, var5);
                }
                var20 = var20.rest();
                var21 = var20.first();
            }
        }
        return var5;
    }
    
    public static SubLObject f51279(SubLObject var5, final SubLObject var11, final SubLObject var3, final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        var5 = f51281(var5, var11, var3, var12);
        final SubLObject var14 = module0147.f9540(var3);
        final SubLObject var15 = module0147.$g2095$.currentBinding(var13);
        final SubLObject var16 = module0147.$g2094$.currentBinding(var13);
        final SubLObject var17 = module0147.$g2096$.currentBinding(var13);
        try {
            module0147.$g2095$.bind(module0147.f9545(var14), var13);
            module0147.$g2094$.bind(module0147.f9546(var14), var13);
            module0147.$g2096$.bind(module0147.f9549(var14), var13);
            var5 = f51282(var5, var11, var12, var3);
            var5 = f51283(var5, var11, var12);
        }
        finally {
            module0147.$g2096$.rebind(var17, var13);
            module0147.$g2094$.rebind(var16, var13);
            module0147.$g2095$.rebind(var15, var13);
        }
        return var5;
    }
    
    public static SubLObject f51281(SubLObject var5, final SubLObject var11, final SubLObject var3, final SubLObject var12) {
        final SubLObject var13 = Sequences.position_if((SubLObject)$ic17$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var13) {
            final SubLObject var14 = module0205.f13134(var11, var13, (SubLObject)UNPROVIDED);
            final SubLObject var15 = module0205.f13368(var14, (SubLObject)UNPROVIDED);
            final SubLObject var16 = (SubLObject)$ic6$;
            final SubLObject var17 = module0202.f12776(var16, module0276.f18287((SubLObject)ConsesLow.list(module0202.f12817(var13, var16, var11), (SubLObject)ConsesLow.list($ic10$, var16, var15)), (SubLObject)UNPROVIDED));
            var5 = (SubLObject)ConsesLow.cons(var17, var5);
            f51275(var12, var17, var11);
        }
        return var5;
    }
    
    public static SubLObject f51282(SubLObject var5, final SubLObject var11, final SubLObject var12, final SubLObject var3) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0205.f13132(var11);
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = (SubLObject)THREE_INTEGER;
        final SubLObject var17 = (SubLObject)$ic18$;
        SubLObject var18 = (SubLObject)NIL;
        if (NIL == var18) {
            final SubLObject var19 = var14;
            final SubLObject var20 = (SubLObject)(($ic19$ == $ic20$) ? $ic21$ : $ic22$);
            final SubLObject var21 = module0056.f4145(var20);
            SubLObject var22 = (SubLObject)NIL;
            final SubLObject var23 = module0139.$g1635$.currentBinding(var13);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var13);
                final SubLObject var24 = (SubLObject)NIL;
                final SubLObject var36_51 = module0141.$g1714$.currentBinding(var13);
                final SubLObject var25 = module0141.$g1715$.currentBinding(var13);
                try {
                    module0141.$g1714$.bind((NIL != var24) ? var24 : module0141.f9283(), var13);
                    module0141.$g1715$.bind((SubLObject)((NIL != var24) ? $ic23$ : module0141.$g1715$.getDynamicValue(var13)), var13);
                    if (NIL != var24 && NIL != module0136.f8864() && NIL == module0141.f9279(var24)) {
                        final SubLObject var26 = module0136.$g1591$.getDynamicValue(var13);
                        if (var26.eql((SubLObject)$ic24$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic25$, var24, (SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var26.eql((SubLObject)$ic27$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic28$, (SubLObject)$ic25$, var24, (SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var26.eql((SubLObject)$ic29$)) {
                            Errors.warn((SubLObject)$ic25$, var24, (SubLObject)$ic26$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic30$, module0136.$g1591$.getDynamicValue(var13));
                            Errors.cerror((SubLObject)$ic28$, (SubLObject)$ic25$, var24, (SubLObject)$ic26$);
                        }
                    }
                    final SubLObject var36_52 = module0141.$g1670$.currentBinding(var13);
                    final SubLObject var37_54 = module0141.$g1671$.currentBinding(var13);
                    final SubLObject var27 = module0141.$g1672$.currentBinding(var13);
                    final SubLObject var28 = module0141.$g1674$.currentBinding(var13);
                    final SubLObject var29 = module0137.$g1605$.currentBinding(var13);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic31$), var13);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic31$)), var13);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic31$)), var13);
                        module0141.$g1674$.bind((SubLObject)NIL, var13);
                        module0137.$g1605$.bind(module0137.f8955($ic31$), var13);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var14, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var36_53 = module0141.$g1677$.currentBinding(var13);
                            final SubLObject var37_55 = module0138.$g1619$.currentBinding(var13);
                            final SubLObject var38_59 = module0141.$g1674$.currentBinding(var13);
                            try {
                                module0141.$g1677$.bind(module0141.f9208(), var13);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic31$)), var13);
                                module0141.$g1674$.bind((SubLObject)NIL, var13);
                                module0249.f16055(var19, (SubLObject)UNPROVIDED);
                                for (var22 = (SubLObject)ConsesLow.list(var14, module0141.f9195()); NIL != var22 && NIL == var18; var22 = module0056.f4150(var21)) {
                                    final SubLObject var46_60 = var22.first();
                                    final SubLObject var30 = conses_high.second(var22);
                                    final SubLObject var31 = var46_60;
                                    final SubLObject var36_54 = module0141.$g1674$.currentBinding(var13);
                                    try {
                                        module0141.$g1674$.bind(var30, var13);
                                        if (NIL != module0250.f16115(module0141.f9190(), var46_60)) {
                                            var18 = Numbers.numG(module0549.f33906(var31), var17);
                                            if (NIL == var18 && !var31.eql(var14) && NIL != constant_handles_oc.f8449(var31)) {
                                                final SubLObject var32 = module0202.f12817((SubLObject)ZERO_INTEGER, var31, var11);
                                                var15 = (SubLObject)ConsesLow.cons(var32, var15);
                                                var18 = module0035.f2000(var15, var16, (SubLObject)UNPROVIDED);
                                                if (NIL == var18) {
                                                    SubLObject var33 = f51272(var32, var3, var12);
                                                    SubLObject var34 = (SubLObject)NIL;
                                                    var34 = var33.first();
                                                    while (NIL == var18 && NIL != var33) {
                                                        final SubLObject var35 = var34;
                                                        if (NIL == conses_high.member(var35, var15, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                            var15 = (SubLObject)ConsesLow.cons(var35, var15);
                                                        }
                                                        var18 = module0035.f2000(var15, var16, (SubLObject)UNPROVIDED);
                                                        var33 = var33.rest();
                                                        var34 = var33.first();
                                                    }
                                                }
                                                f51275(var12, var32, var11);
                                            }
                                        }
                                        final SubLObject var36 = module0200.f12443(module0137.f8955($ic31$));
                                        SubLObject var37;
                                        SubLObject var38;
                                        SubLObject var36_55;
                                        SubLObject var37_56;
                                        SubLObject var39;
                                        SubLObject var40;
                                        SubLObject var41;
                                        SubLObject var42;
                                        SubLObject var75_76;
                                        SubLObject var43;
                                        SubLObject var36_56;
                                        SubLObject var74_79;
                                        SubLObject var44;
                                        SubLObject var45;
                                        SubLObject var36_57;
                                        SubLObject var46;
                                        SubLObject var47;
                                        SubLObject var48;
                                        SubLObject var49;
                                        SubLObject var50;
                                        SubLObject var51;
                                        SubLObject var52;
                                        SubLObject var53;
                                        SubLObject var67_89;
                                        SubLObject var54;
                                        SubLObject var36_58;
                                        SubLObject var56;
                                        SubLObject var55;
                                        SubLObject var57;
                                        SubLObject var58;
                                        SubLObject var59;
                                        SubLObject var60;
                                        SubLObject var61;
                                        SubLObject var62;
                                        for (var37 = (SubLObject)NIL, var37 = var36; NIL == var18 && NIL != var37; var37 = var37.rest()) {
                                            var38 = var37.first();
                                            var36_55 = module0137.$g1605$.currentBinding(var13);
                                            var37_56 = module0141.$g1674$.currentBinding(var13);
                                            try {
                                                module0137.$g1605$.bind(var38, var13);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var13)) : module0141.$g1674$.getDynamicValue(var13)), var13);
                                                var39 = module0228.f15229(var46_60);
                                                if (NIL != module0138.f8992(var39)) {
                                                    var40 = module0242.f15664(var39, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var40) {
                                                        var41 = module0245.f15834(var40, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var41) {
                                                            for (var42 = module0066.f4838(module0067.f4891(var41)); NIL == var18 && NIL == module0066.f4841(var42); var42 = module0066.f4840(var42)) {
                                                                var13.resetMultipleValues();
                                                                var75_76 = module0066.f4839(var42);
                                                                var43 = var13.secondMultipleValue();
                                                                var13.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var75_76)) {
                                                                    var36_56 = module0138.$g1623$.currentBinding(var13);
                                                                    try {
                                                                        module0138.$g1623$.bind(var75_76, var13);
                                                                        for (var74_79 = module0066.f4838(module0067.f4891(var43)); NIL == var18 && NIL == module0066.f4841(var74_79); var74_79 = module0066.f4840(var74_79)) {
                                                                            var13.resetMultipleValues();
                                                                            var44 = module0066.f4839(var74_79);
                                                                            var45 = var13.secondMultipleValue();
                                                                            var13.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var44)) {
                                                                                var36_57 = module0138.$g1624$.currentBinding(var13);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var44, var13);
                                                                                    var46 = var45;
                                                                                    if (NIL != module0077.f5302(var46)) {
                                                                                        var47 = module0077.f5333(var46);
                                                                                        for (var48 = module0032.f1741(var47), var49 = (SubLObject)NIL, var49 = module0032.f1742(var48, var47); NIL == var18 && NIL == module0032.f1744(var48, var49); var49 = module0032.f1743(var49)) {
                                                                                            var50 = module0032.f1745(var48, var49);
                                                                                            if (NIL != module0032.f1746(var49, var50) && NIL == module0249.f16059(var50, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var50, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var50, module0141.f9195()), var21);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var46.isList()) {
                                                                                        if (NIL == var18) {
                                                                                            var51 = var46;
                                                                                            var52 = (SubLObject)NIL;
                                                                                            var52 = var51.first();
                                                                                            while (NIL == var18 && NIL != var51) {
                                                                                                if (NIL == module0249.f16059(var52, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var52, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var52, module0141.f9195()), var21);
                                                                                                }
                                                                                                var51 = var51.rest();
                                                                                                var52 = var51.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic32$, var46);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var36_57, var13);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var74_79);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var36_56, var13);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var42);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var39, (SubLObject)UNPROVIDED)) {
                                                    var53 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var13), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var13), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    for (var67_89 = (SubLObject)NIL, var67_89 = var53; NIL == var18 && NIL != var67_89; var67_89 = var67_89.rest()) {
                                                        var54 = var67_89.first();
                                                        var36_58 = module0138.$g1625$.currentBinding(var13);
                                                        try {
                                                            module0138.$g1625$.bind(var54, var13);
                                                            var55 = (var56 = Functions.funcall(var54, var39));
                                                            if (NIL != module0077.f5302(var56)) {
                                                                var57 = module0077.f5333(var56);
                                                                for (var58 = module0032.f1741(var57), var59 = (SubLObject)NIL, var59 = module0032.f1742(var58, var57); NIL == var18 && NIL == module0032.f1744(var58, var59); var59 = module0032.f1743(var59)) {
                                                                    var60 = module0032.f1745(var58, var59);
                                                                    if (NIL != module0032.f1746(var59, var60) && NIL == module0249.f16059(var60, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var60, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var60, module0141.f9195()), var21);
                                                                    }
                                                                }
                                                            }
                                                            else if (var56.isList()) {
                                                                if (NIL == var18) {
                                                                    var61 = var56;
                                                                    var62 = (SubLObject)NIL;
                                                                    var62 = var61.first();
                                                                    while (NIL == var18 && NIL != var61) {
                                                                        if (NIL == module0249.f16059(var62, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var62, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var62, module0141.f9195()), var21);
                                                                        }
                                                                        var61 = var61.rest();
                                                                        var62 = var61.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic32$, var56);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var36_58, var13);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var37_56, var13);
                                                module0137.$g1605$.rebind(var36_55, var13);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var36_54, var13);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var38_59, var13);
                                module0138.$g1619$.rebind(var37_55, var13);
                                module0141.$g1677$.rebind(var36_53, var13);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic34$, var14, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var29, var13);
                        module0141.$g1674$.rebind(var28, var13);
                        module0141.$g1672$.rebind(var27, var13);
                        module0141.$g1671$.rebind(var37_54, var13);
                        module0141.$g1670$.rebind(var36_52, var13);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var25, var13);
                    module0141.$g1714$.rebind(var36_51, var13);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var13));
            }
            finally {
                module0139.$g1635$.rebind(var23, var13);
            }
        }
        if (NIL != var15) {
            var5 = ConsesLow.append(Sequences.nreverse(var15), var5);
        }
        return var5;
    }
    
    public static SubLObject f51283(SubLObject var5, final SubLObject var11, final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0205.f13132(var11);
        if (NIL != module0337.f22630(var11, (SubLObject)$ic35$) && NIL != conses_high.member($ic36$, module0599.f36724(var14, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var15 = (SubLObject)NIL;
            final SubLObject var16 = (SubLObject)THREE_INTEGER;
            final SubLObject var17 = (SubLObject)$ic18$;
            SubLObject var18 = (SubLObject)NIL;
            final SubLObject var19 = module0205.f13388(var11, (SubLObject)UNPROVIDED);
            if (NIL == var18) {
                SubLObject var20 = var19;
                final SubLObject var21 = (SubLObject)(($ic19$ == $ic19$) ? $ic22$ : $ic21$);
                final SubLObject var22 = module0056.f4145(var21);
                final SubLObject var23 = module0139.$g1635$.currentBinding(var13);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var13);
                    final SubLObject var24 = (SubLObject)NIL;
                    final SubLObject var36_96 = module0141.$g1714$.currentBinding(var13);
                    final SubLObject var25 = module0141.$g1715$.currentBinding(var13);
                    try {
                        module0141.$g1714$.bind((NIL != var24) ? var24 : module0141.f9283(), var13);
                        module0141.$g1715$.bind((SubLObject)((NIL != var24) ? $ic23$ : module0141.$g1715$.getDynamicValue(var13)), var13);
                        if (NIL != var24 && NIL != module0136.f8864() && NIL == module0141.f9279(var24)) {
                            final SubLObject var26 = module0136.$g1591$.getDynamicValue(var13);
                            if (var26.eql((SubLObject)$ic24$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic25$, var24, (SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var26.eql((SubLObject)$ic27$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic28$, (SubLObject)$ic25$, var24, (SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var26.eql((SubLObject)$ic29$)) {
                                Errors.warn((SubLObject)$ic25$, var24, (SubLObject)$ic26$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic30$, module0136.$g1591$.getDynamicValue(var13));
                                Errors.cerror((SubLObject)$ic28$, (SubLObject)$ic25$, var24, (SubLObject)$ic26$);
                            }
                        }
                        final SubLObject var36_97 = module0141.$g1670$.currentBinding(var13);
                        final SubLObject var37_98 = module0141.$g1671$.currentBinding(var13);
                        final SubLObject var27 = module0141.$g1672$.currentBinding(var13);
                        final SubLObject var28 = module0141.$g1674$.currentBinding(var13);
                        final SubLObject var29 = module0137.$g1605$.currentBinding(var13);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic36$), var13);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic36$)), var13);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic36$)), var13);
                            module0141.$g1674$.bind((SubLObject)NIL, var13);
                            module0137.$g1605$.bind(module0137.f8955($ic36$), var13);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var19, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var36_98 = module0141.$g1677$.currentBinding(var13);
                                final SubLObject var37_99 = module0138.$g1619$.currentBinding(var13);
                                final SubLObject var38_101 = module0141.$g1674$.currentBinding(var13);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var13);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic36$)), var13);
                                    module0141.$g1674$.bind((SubLObject)NIL, var13);
                                    module0249.f16055(var20, (SubLObject)UNPROVIDED);
                                    while (NIL != var20 && NIL == var18) {
                                        final SubLObject var30 = var20;
                                        var18 = Numbers.numG(module0549.f33906(var30), var17);
                                        if (NIL == var18 && !var30.eql(var19)) {
                                            final SubLObject var31 = module0202.f12817((SubLObject)TWO_INTEGER, var30, var11);
                                            var15 = (SubLObject)ConsesLow.cons(var31, var15);
                                            var18 = module0035.f2000(var15, var16, (SubLObject)UNPROVIDED);
                                            f51275(var12, var31, var11);
                                        }
                                        final SubLObject var32 = module0200.f12443(module0137.f8955($ic36$));
                                        SubLObject var33;
                                        SubLObject var34;
                                        SubLObject var36_99;
                                        SubLObject var37_100;
                                        SubLObject var35;
                                        SubLObject var36;
                                        SubLObject var37;
                                        SubLObject var38;
                                        SubLObject var39;
                                        SubLObject var40;
                                        SubLObject var36_100;
                                        SubLObject var74_106;
                                        SubLObject var41;
                                        SubLObject var42;
                                        SubLObject var36_101;
                                        SubLObject var43;
                                        SubLObject var44;
                                        SubLObject var45;
                                        SubLObject var46;
                                        SubLObject var47;
                                        SubLObject var48;
                                        SubLObject var49;
                                        SubLObject var50;
                                        SubLObject var67_109;
                                        SubLObject var51;
                                        SubLObject var36_102;
                                        SubLObject var53;
                                        SubLObject var52;
                                        SubLObject var54;
                                        SubLObject var55;
                                        SubLObject var56;
                                        SubLObject var57;
                                        SubLObject var58;
                                        SubLObject var59;
                                        for (var33 = (SubLObject)NIL, var33 = var32; NIL == var18 && NIL != var33; var33 = var33.rest()) {
                                            var34 = var33.first();
                                            var36_99 = module0137.$g1605$.currentBinding(var13);
                                            var37_100 = module0141.$g1674$.currentBinding(var13);
                                            try {
                                                module0137.$g1605$.bind(var34, var13);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var13)) : module0141.$g1674$.getDynamicValue(var13)), var13);
                                                var35 = module0228.f15229(var20);
                                                if (NIL != module0138.f8992(var35)) {
                                                    var36 = module0242.f15664(var35, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var36) {
                                                        var37 = module0245.f15834(var36, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var37) {
                                                            for (var38 = module0066.f4838(module0067.f4891(var37)); NIL == var18 && NIL == module0066.f4841(var38); var38 = module0066.f4840(var38)) {
                                                                var13.resetMultipleValues();
                                                                var39 = module0066.f4839(var38);
                                                                var40 = var13.secondMultipleValue();
                                                                var13.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var39)) {
                                                                    var36_100 = module0138.$g1623$.currentBinding(var13);
                                                                    try {
                                                                        module0138.$g1623$.bind(var39, var13);
                                                                        for (var74_106 = module0066.f4838(module0067.f4891(var40)); NIL == var18 && NIL == module0066.f4841(var74_106); var74_106 = module0066.f4840(var74_106)) {
                                                                            var13.resetMultipleValues();
                                                                            var41 = module0066.f4839(var74_106);
                                                                            var42 = var13.secondMultipleValue();
                                                                            var13.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var41)) {
                                                                                var36_101 = module0138.$g1624$.currentBinding(var13);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var41, var13);
                                                                                    var43 = var42;
                                                                                    if (NIL != module0077.f5302(var43)) {
                                                                                        var44 = module0077.f5333(var43);
                                                                                        for (var45 = module0032.f1741(var44), var46 = (SubLObject)NIL, var46 = module0032.f1742(var45, var44); NIL == var18 && NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                                                                            var47 = module0032.f1745(var45, var46);
                                                                                            if (NIL != module0032.f1746(var46, var47) && NIL == module0249.f16059(var47, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var47, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var47, var22);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var43.isList()) {
                                                                                        if (NIL == var18) {
                                                                                            var48 = var43;
                                                                                            var49 = (SubLObject)NIL;
                                                                                            var49 = var48.first();
                                                                                            while (NIL == var18 && NIL != var48) {
                                                                                                if (NIL == module0249.f16059(var49, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var49, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var49, var22);
                                                                                                }
                                                                                                var48 = var48.rest();
                                                                                                var49 = var48.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic32$, var43);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var36_101, var13);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var74_106);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var36_100, var13);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var38);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var35, (SubLObject)UNPROVIDED)) {
                                                    var50 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var13), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var13), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    for (var67_109 = (SubLObject)NIL, var67_109 = var50; NIL == var18 && NIL != var67_109; var67_109 = var67_109.rest()) {
                                                        var51 = var67_109.first();
                                                        var36_102 = module0138.$g1625$.currentBinding(var13);
                                                        try {
                                                            module0138.$g1625$.bind(var51, var13);
                                                            var52 = (var53 = Functions.funcall(var51, var35));
                                                            if (NIL != module0077.f5302(var53)) {
                                                                var54 = module0077.f5333(var53);
                                                                for (var55 = module0032.f1741(var54), var56 = (SubLObject)NIL, var56 = module0032.f1742(var55, var54); NIL == var18 && NIL == module0032.f1744(var55, var56); var56 = module0032.f1743(var56)) {
                                                                    var57 = module0032.f1745(var55, var56);
                                                                    if (NIL != module0032.f1746(var56, var57) && NIL == module0249.f16059(var57, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var57, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var57, var22);
                                                                    }
                                                                }
                                                            }
                                                            else if (var53.isList()) {
                                                                if (NIL == var18) {
                                                                    var58 = var53;
                                                                    var59 = (SubLObject)NIL;
                                                                    var59 = var58.first();
                                                                    while (NIL == var18 && NIL != var58) {
                                                                        if (NIL == module0249.f16059(var59, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var59, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var59, var22);
                                                                        }
                                                                        var58 = var58.rest();
                                                                        var59 = var58.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic32$, var53);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var36_102, var13);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var37_100, var13);
                                                module0137.$g1605$.rebind(var36_99, var13);
                                            }
                                        }
                                        var20 = module0056.f4150(var22);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var38_101, var13);
                                    module0138.$g1619$.rebind(var37_99, var13);
                                    module0141.$g1677$.rebind(var36_98, var13);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic34$, var19, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var29, var13);
                            module0141.$g1674$.rebind(var28, var13);
                            module0141.$g1672$.rebind(var27, var13);
                            module0141.$g1671$.rebind(var37_98, var13);
                            module0141.$g1670$.rebind(var36_97, var13);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var25, var13);
                        module0141.$g1714$.rebind(var36_96, var13);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var13));
                }
                finally {
                    module0139.$g1635$.rebind(var23, var13);
                }
            }
            if (NIL != var15) {
                var5 = ConsesLow.append(Sequences.nreverse(var15), var5);
            }
        }
        return var5;
    }
    
    public static SubLObject f51280(SubLObject var5, final SubLObject var11, final SubLObject var3, final SubLObject var12) {
        assert NIL != module0202.f12606(var11) : var11;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var15;
        final SubLObject var14 = var15 = module0205.f13207(var11, (SubLObject)UNPROVIDED);
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic38$);
        var16 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic38$);
        var17 = var15.first();
        var15 = var15.rest();
        if (NIL == var15) {
            if (NIL != module0202.f12595(var17)) {
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var21;
                final SubLObject var20 = var21 = module0205.f13207(var17, (SubLObject)$ic39$);
                SubLObject var22 = (SubLObject)NIL;
                var22 = var21.first();
                while (NIL != var21) {
                    if (NIL != module0205.f13220((SubLObject)$ic14$, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var18 = (SubLObject)ConsesLow.cons(var22, var18);
                    }
                    else {
                        var19 = (SubLObject)ConsesLow.cons(var22, var19);
                    }
                    var21 = var21.rest();
                    var22 = var21.first();
                }
                if (NIL != var19) {
                    SubLObject var23 = module0035.f2382(var19);
                    SubLObject var24 = (SubLObject)NIL;
                    var24 = var23.first();
                    while (NIL != var23) {
                        if (!var24.equal(var19)) {
                            final SubLObject var25 = ConsesLow.append(var18, var24);
                            final SubLObject var26 = (NIL != module0035.f1997(var25)) ? var25.first() : module0276.f18287(var25, (SubLObject)UNPROVIDED);
                            final SubLObject var27 = module0202.f12776(var16, var26);
                            var13 = (SubLObject)ConsesLow.cons(var27, var13);
                            f51275(var12, var27, var11);
                        }
                        var23 = var23.rest();
                        var24 = var23.first();
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic38$);
        }
        final SubLObject var28 = f51284(var11);
        if (!var28.equal(var11)) {
            SubLObject var29 = f51272(var28, var3, var12);
            SubLObject var30 = (SubLObject)NIL;
            var30 = var29.first();
            while (NIL != var29) {
                final SubLObject var31 = var30;
                if (NIL == conses_high.member(var31, var13, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var13 = (SubLObject)ConsesLow.cons(var31, var13);
                }
                f51275(var12, var30, var11);
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        if (NIL != var13) {
            var5 = ConsesLow.append(var13, var5);
        }
        return var5;
    }
    
    public static SubLObject f51275(final SubLObject var12, final SubLObject var15, final SubLObject var124) {
        module0084.f5762(var12, var15, var124);
        return var12;
    }
    
    public static SubLObject f51285(final SubLObject var125) {
        return (SubLObject)makeBoolean(NIL != module0202.f12658(var125) && module0205.f13276(var125).eql($ic40$));
    }
    
    public static SubLObject f51274(final SubLObject var11) {
        final SubLObject var12 = Sequences.position_if((SubLObject)$ic41$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = module0205.f13134(var11, var12, (SubLObject)UNPROVIDED);
        final SubLObject var15 = (SubLObject)$ic6$;
        if (NIL != module0004.f105(var14)) {
            var13 = (SubLObject)ConsesLow.list(module0202.f12776(var15, module0276.f18287((SubLObject)ConsesLow.list(module0202.f12817(var12, var15, var11), (SubLObject)ConsesLow.list($ic42$, var15, var14)), (SubLObject)UNPROVIDED)));
        }
        return var13;
    }
    
    public static SubLObject f51276(final SubLObject var18) {
        SubLObject var19 = (SubLObject)NIL;
        if (NIL != module0612.f37382(var18)) {
            var19 = Sequences.remove(var18, module0035.remove_if_not((SubLObject)$ic43$, (SubLObject)ConsesLow.list(module0612.f37469(var18), module0612.f37470(var18), module0612.f37483(var18), module0612.f37482(var18), module0612.f37449(var18)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var19;
    }
    
    public static SubLObject f51277(final SubLObject var21, final SubLObject var3) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)NIL;
        if ((NIL != module0172.f10917(var21) || NIL != module0167.f10813(var21)) && module0205.f13276(var21).eql($ic44$)) {
            final SubLObject var24 = module0205.f13368(var21, (SubLObject)UNPROVIDED);
            var23 = (SubLObject)ConsesLow.cons(var24, f51277(var24, var3));
        }
        else if (NIL == module0212.f13762(var21)) {
            var23 = (SubLObject)NIL;
        }
        if (NIL != module0167.f10813(module0172.f10921((SubLObject)ConsesLow.list($ic45$, var21)))) {
            var23 = ConsesLow.append(var23, f51277(module0172.f10921((SubLObject)ConsesLow.list($ic45$, var21)), var3));
        }
        if (NIL != module0259.f16891(var21, $ic46$)) {
            final SubLObject var25 = module0434.f30579((SubLObject)$ic47$, (SubLObject)ConsesLow.list($ic48$, (SubLObject)$ic47$, var21), var3, (SubLObject)NIL, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
            if (NIL != var25) {
                var23 = ConsesLow.append(var23, f51277(var25, var3));
            }
        }
        if (NIL != module0259.f16854(var21, $ic49$, var3, (SubLObject)UNPROVIDED) && NIL == module0259.f16854(var21, $ic50$, var3, (SubLObject)UNPROVIDED)) {
            final SubLObject var26 = module0434.f30579((SubLObject)$ic51$, (SubLObject)ConsesLow.listS($ic52$, var21, (SubLObject)$ic53$), var3, (SubLObject)NIL, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
            if (NIL != var26) {
                var23 = ConsesLow.append(var23, f51277(var26, var3));
            }
        }
        else {
            SubLObject var27 = module0434.f30579((SubLObject)$ic54$, (SubLObject)ConsesLow.list($ic9$, (SubLObject)$ic54$, var21), var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var28 = module0147.$g2094$.currentBinding(var22);
            final SubLObject var29 = module0147.$g2095$.currentBinding(var22);
            try {
                module0147.$g2094$.bind((SubLObject)$ic55$, var22);
                module0147.$g2095$.bind($ic56$, var22);
                var27 = Sequences.remove_if((SubLObject)$ic57$, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var29, var22);
                module0147.$g2094$.rebind(var28, var22);
            }
            var23 = ConsesLow.append(var23, var27);
        }
        if (NIL == var23) {
            Errors.warn((SubLObject)$ic58$, var21);
        }
        return Sequences.delete_duplicates(var23, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51286(final SubLObject var21) {
        return module0004.f104(module0172.f10922(var21), f51287(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51288() {
        final SubLObject var134 = $g6403$.getGlobalValue();
        if (NIL != var134) {
            module0034.f1818(var134);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51289() {
        return module0034.f1829($g6403$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51290() {
        SubLObject var135 = (SubLObject)NIL;
        SubLObject var136 = (SubLObject)$ic60$;
        SubLObject var137 = (SubLObject)NIL;
        var137 = var136.first();
        while (NIL != var136) {
            SubLObject var16_136 = module0259.f16848(var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var138 = (SubLObject)NIL;
            var138 = var16_136.first();
            while (NIL != var16_136) {
                var135 = (SubLObject)ConsesLow.cons(var138, var135);
                var16_136 = var16_136.rest();
                var138 = var16_136.first();
            }
            var136 = var136.rest();
            var137 = var136.first();
        }
        return var135;
    }
    
    public static SubLObject f51287() {
        SubLObject var137 = $g6403$.getGlobalValue();
        if (NIL == var137) {
            var137 = module0034.f1934((SubLObject)$ic59$, (SubLObject)$ic61$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var138 = module0034.f1810(var137, (SubLObject)UNPROVIDED);
        if (var138 == $ic62$) {
            var138 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51290()));
            module0034.f1812(var137, var138, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var138);
    }
    
    public static SubLObject f51278(final SubLObject var21) {
        if (NIL == module0167.f10813(var21) && NIL == module0172.f10917(var21)) {
            return (SubLObject)NIL;
        }
        final SubLObject var22 = module0205.f13276(var21);
        if (var22.eql($ic40$)) {
            return (SubLObject)ConsesLow.list(module0205.f13368(var21, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51284(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)NIL;
        var12.resetMultipleValues();
        SubLObject var14 = module0337.f22630(var11, (SubLObject)$ic63$);
        SubLObject var15 = var12.secondMultipleValue();
        var12.resetMultipleValues();
        if (NIL != var14) {
            final SubLObject var16 = module0035.f2294(var15, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var17 = module0035.f2294(var15, (SubLObject)$ic64$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var18 = module0035.f2294(var15, (SubLObject)$ic65$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var19 = module0147.$g2094$.currentBinding(var12);
            final SubLObject var20 = module0147.$g2095$.currentBinding(var12);
            try {
                module0147.$g2094$.bind((SubLObject)$ic55$, var12);
                module0147.$g2095$.bind($ic56$, var12);
                final SubLObject var21 = module0599.f36726(var18, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
                if (NIL != module0004.f104(var17, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var13 = (SubLObject)ConsesLow.list(var18, (SubLObject)$ic14$, var16);
                }
            }
            finally {
                module0147.$g2095$.rebind(var20, var12);
                module0147.$g2094$.rebind(var19, var12);
            }
        }
        if (NIL == var13) {
            var12.resetMultipleValues();
            var14 = module0337.f22630(var11, (SubLObject)$ic66$);
            var15 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            if (NIL != var14) {
                final SubLObject var16 = module0035.f2294(var15, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var17 = module0035.f2294(var15, (SubLObject)$ic64$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var18 = module0035.f2294(var15, (SubLObject)$ic65$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var19 = module0147.$g2094$.currentBinding(var12);
                final SubLObject var20 = module0147.$g2095$.currentBinding(var12);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic55$, var12);
                    module0147.$g2095$.bind($ic56$, var12);
                    final SubLObject var21 = module0599.f36726(var18, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
                    if (NIL != module0004.f104(var17, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var13 = (SubLObject)ConsesLow.list(var18, (SubLObject)$ic14$, var16);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var20, var12);
                    module0147.$g2094$.rebind(var19, var12);
                }
            }
        }
        if (NIL == var13) {
            var12.resetMultipleValues();
            var14 = module0337.f22630(var11, (SubLObject)$ic67$);
            var15 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            if (NIL != var14) {
                final SubLObject var16 = module0035.f2294(var15, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0035.f2294(var15, (SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var18 = module0035.f2294(var15, (SubLObject)$ic65$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var13 = (SubLObject)ConsesLow.list($ic3$, var18, (SubLObject)$ic14$, var22, (SubLObject)ConsesLow.list($ic69$, var16));
            }
        }
        if (NIL == var13) {
            var12.resetMultipleValues();
            var14 = module0337.f22630(var11, (SubLObject)$ic70$);
            var15 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            if (NIL != var14) {
                final SubLObject var16 = module0035.f2294(var15, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0035.f2294(var15, (SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var18 = module0035.f2294(var15, (SubLObject)$ic65$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var13 = (SubLObject)ConsesLow.list($ic3$, var18, (SubLObject)$ic14$, var22, (SubLObject)ConsesLow.list($ic71$, var16));
            }
        }
        if (NIL == var13) {
            var12.resetMultipleValues();
            var14 = module0337.f22630(var11, (SubLObject)$ic72$);
            var15 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            if (NIL != var14) {
                final SubLObject var16 = module0035.f2294(var15, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0035.f2294(var15, (SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var23 = module0035.f2294(var15, (SubLObject)$ic73$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var13 = (SubLObject)ConsesLow.list(var23, (SubLObject)$ic14$, var22, (SubLObject)ConsesLow.list($ic71$, var16));
            }
        }
        if (NIL == var13) {
            var12.resetMultipleValues();
            var14 = module0337.f22630(var11, (SubLObject)$ic74$);
            var15 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            if (NIL != var14) {
                final SubLObject var16 = module0035.f2294(var15, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0035.f2294(var15, (SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var23 = module0035.f2294(var15, (SubLObject)$ic73$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var13 = (SubLObject)ConsesLow.list(var23, (SubLObject)$ic14$, var22, (SubLObject)ConsesLow.list($ic71$, var16));
            }
        }
        if (NIL == var13) {
            var12.resetMultipleValues();
            var14 = module0337.f22630(var11, (SubLObject)$ic75$);
            var15 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            if (NIL != var14) {
                final SubLObject var16 = module0035.f2294(var15, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0035.f2294(var15, (SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var23 = module0035.f2294(var15, (SubLObject)$ic73$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var13 = (SubLObject)ConsesLow.list(var23, (SubLObject)$ic14$, var22, (SubLObject)ConsesLow.list($ic69$, var16));
            }
        }
        if (NIL == var13) {
            var12.resetMultipleValues();
            var14 = module0337.f22630(var11, (SubLObject)$ic76$);
            var15 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            if (NIL != var14) {
                final SubLObject var16 = module0035.f2294(var15, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0035.f2294(var15, (SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var23 = module0035.f2294(var15, (SubLObject)$ic73$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var13 = (SubLObject)ConsesLow.list(var23, (SubLObject)$ic14$, var22, (SubLObject)ConsesLow.list($ic69$, var16));
            }
        }
        if (NIL == var13) {
            var12.resetMultipleValues();
            var14 = module0337.f22630(var11, (SubLObject)$ic77$);
            var15 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            if (NIL != var14) {
                final SubLObject var16 = module0035.f2294(var15, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0035.f2294(var15, (SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var18 = module0035.f2294(var15, (SubLObject)$ic65$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var13 = (SubLObject)ConsesLow.list($ic3$, var18, (SubLObject)$ic14$, var22, (SubLObject)ConsesLow.list($ic71$, var16));
            }
        }
        return (NIL != var13) ? var13 : var11;
    }
    
    public static SubLObject f51291(final SubLObject var144, final SubLObject var145) {
        SubLObject var146 = (SubLObject)NIL;
        SubLObject var147 = var144;
        SubLObject var148 = (SubLObject)NIL;
        var148 = var147.first();
        while (NIL != var147) {
            var146 = (SubLObject)ConsesLow.cons(f51271(var148, var145), var146);
            var147 = var147.rest();
            var148 = var147.first();
        }
        return Sequences.nreverse(var146);
    }
    
    public static SubLObject f51271(final SubLObject var11, final SubLObject var145) {
        return module0205.f13250(var145, (SubLObject)$ic14$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51292(final SubLObject var11) {
        final SubLObject var12 = module0279.f18513(var11, (SubLObject)$ic78$);
        final SubLObject var13 = f51271(var11, var12);
        if (NIL != module0337.f22630(var13, (SubLObject)ConsesLow.listS($ic10$, var12, (SubLObject)$ic79$))) {
            return module0205.f13204(var13, (SubLObject)UNPROVIDED);
        }
        return module0202.f12768($ic80$, var12, var13);
    }
    
    public static SubLObject f51293(final SubLObject var146, final SubLObject var145) {
        SubLObject var147 = (SubLObject)NIL;
        SubLObject var148 = var146;
        SubLObject var149 = (SubLObject)NIL;
        var149 = var148.first();
        while (NIL != var148) {
            var147 = (SubLObject)ConsesLow.cons(f51294(var149, var145), var147);
            var148 = var148.rest();
            var149 = var148.first();
        }
        return Sequences.nreverse(var147);
    }
    
    public static SubLObject f51294(final SubLObject var148, final SubLObject var145) {
        return module0205.f13250((SubLObject)$ic14$, var145, var148, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51295(final SubLObject var11, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLObject var12 = module0279.f18513(var11, (SubLObject)$ic78$);
        final SubLObject var13 = f51271(var11, var12);
        return module0434.f30578(var12, var13, var3, var4);
    }
    
    public static SubLObject f51296(final SubLObject var11, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLObject var12 = f51292(var11);
        final SubLObject var13 = module0279.f18513(var12, (SubLObject)$ic81$);
        final SubLObject var14 = module0202.f12768($ic82$, var12, var13);
        final SubLObject var15 = conses_high.putf(var4, (SubLObject)$ic83$, (SubLObject)ConsesLow.list((SubLObject)$ic84$, var13));
        final SubLObject var16 = module0409.f28506(var14, var3, var15);
        return (SubLObject)((NIL != var16) ? var16.first() : ZERO_INTEGER);
    }
    
    public static SubLObject f51297(final SubLObject var145, final SubLObject var11, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLObject var146 = f51271(var11, var145);
        final SubLObject var147 = module0409.f28506(var146, var3, var4);
        return module0540.f33526(var147);
    }
    
    public static SubLObject f51298(final SubLObject var145, final SubLObject var3) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        final SubLObject var147 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        final SubLObject var148 = module0147.f9540(var3);
        final SubLObject var149 = module0147.$g2095$.currentBinding(var146);
        final SubLObject var150 = module0147.$g2094$.currentBinding(var146);
        final SubLObject var151 = module0147.$g2096$.currentBinding(var146);
        try {
            module0147.$g2095$.bind(module0147.f9545(var148), var146);
            module0147.$g2094$.bind(module0147.f9546(var148), var146);
            module0147.$g2096$.bind(module0147.f9549(var148), var146);
            final SubLObject var152 = (SubLObject)NIL;
            if (NIL != module0158.f10010(var145, (SubLObject)NIL, var152)) {
                final SubLObject var153 = module0158.f10011(var145, (SubLObject)NIL, var152);
                SubLObject var154 = (SubLObject)NIL;
                final SubLObject var155 = (SubLObject)NIL;
                while (NIL == var154) {
                    final SubLObject var156 = module0052.f3695(var153, var155);
                    final SubLObject var157 = (SubLObject)makeBoolean(!var155.eql(var156));
                    if (NIL != var157) {
                        SubLObject var158 = (SubLObject)NIL;
                        try {
                            var158 = module0158.f10316(var156, (SubLObject)$ic85$, (SubLObject)$ic86$, (SubLObject)NIL);
                            SubLObject var155_160 = (SubLObject)NIL;
                            final SubLObject var156_161 = (SubLObject)NIL;
                            while (NIL == var155_160) {
                                final SubLObject var159 = module0052.f3695(var158, var156_161);
                                final SubLObject var158_163 = (SubLObject)makeBoolean(!var156_161.eql(var159));
                                if (NIL != var158_163 && NIL == f51299(var159, var145, var3)) {
                                    final SubLObject var160 = f51294(module0178.f11285(var159), var145);
                                    module0077.f5326(var160, var147);
                                }
                                var155_160 = (SubLObject)makeBoolean(NIL == var158_163);
                            }
                        }
                        finally {
                            final SubLObject var36_164 = Threads.$is_thread_performing_cleanupP$.currentBinding(var146);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var146);
                                if (NIL != var158) {
                                    module0158.f10319(var158);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var36_164, var146);
                            }
                        }
                    }
                    var154 = (SubLObject)makeBoolean(NIL == var157);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var151, var146);
            module0147.$g2094$.rebind(var150, var146);
            module0147.$g2095$.rebind(var149, var146);
        }
        return var147;
    }
    
    public static SubLObject f51299(final SubLObject var162, final SubLObject var145, final SubLObject var165) {
        final SubLObject var166 = module0178.f11333(var162);
        final SubLObject var167 = module0205.f13357(var162, var145, (SubLObject)UNPROVIDED);
        SubLObject var168 = (SubLObject)NIL;
        if (NIL == var168) {
            SubLObject var169 = var167;
            SubLObject var170 = (SubLObject)NIL;
            var170 = var169.first();
            while (NIL == var168 && NIL != var169) {
                if (NIL != module0226.f14837(var166, var170)) {
                    var168 = (SubLObject)T;
                }
                var169 = var169.rest();
                var170 = var169.first();
            }
        }
        return var168;
    }
    
    public static SubLObject f51300() {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)NIL;
        if (NIL != module0361.f24109($g6404$.getDynamicValue(var25))) {
            if (NIL != f51301()) {
                var26 = (SubLObject)T;
            }
            else {
                module0361.f24005($g6404$.getDynamicValue(var25));
                $g6404$.setDynamicValue(module0361.f24136((SubLObject)UNPROVIDED), var25);
            }
            return Values.values($g6404$.getDynamicValue(var25), var26);
        }
        return Values.values(module0361.f24136((SubLObject)UNPROVIDED), var26);
    }
    
    public static SubLObject f51301() {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        return Numbers.numL(module0361.f24112($g6404$.getDynamicValue(var25)), (SubLObject)$ic87$);
    }
    
    public static SubLObject f51302(final SubLObject var170, final SubLObject var171) {
        final SubLObject var172 = var170.rest();
        final SubLObject var174;
        final SubLObject var173 = var174 = var172;
        final SubLObject var175 = (SubLObject)$ic88$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic89$, (SubLObject)ConsesLow.list((SubLObject)$ic90$, var175), (SubLObject)$ic91$, (SubLObject)ConsesLow.list((SubLObject)$ic92$, reader.bq_cons((SubLObject)$ic93$, ConsesLow.append(var174, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic94$, var175, (SubLObject)$ic95$)));
    }
    
    public static SubLObject f51303(final SubLObject var125) {
        return module0259.f16891(var125, $ic96$);
    }
    
    public static SubLObject f51304(final SubLObject var11, final SubLObject var3) {
        final SubLObject var12 = (SubLObject)$ic97$;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = f51305(var11);
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            final SubLObject var16 = f51306(var15, var12);
            final SubLObject var17 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic83$, ConsesLow.list((SubLObject)$ic84$, var12), $ic98$, THREE_INTEGER, $ic99$, ONE_INTEGER, $ic100$, $ic101$, $ic102$, f51300() });
            SubLObject var16_177;
            final SubLObject var18 = var16_177 = module0409.f28506(var16, var3, var17);
            SubLObject var19 = (SubLObject)NIL;
            var19 = var16_177.first();
            while (NIL != var16_177) {
                final SubLObject var20 = var19;
                if (NIL == conses_high.member(var20, var13, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var13 = (SubLObject)ConsesLow.cons(var20, var13);
                }
                var16_177 = var16_177.rest();
                var19 = var16_177.first();
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return var13;
    }
    
    public static SubLObject f51307(final SubLObject var179) {
        final SubLObject var180 = module0434.f30579((SubLObject)$ic103$, (SubLObject)ConsesLow.listS($ic104$, var179, (SubLObject)$ic105$), $ic106$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var180) {
            return var180.first();
        }
        return module0770.f49049(var179, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51306(final SubLObject var11, final SubLObject var6) {
        SubLObject var12 = (SubLObject)ConsesLow.list($ic107$, var11, var6);
        SubLObject var14;
        final SubLObject var13 = var14 = module0155.f9795(var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            var12 = module0202.f12776(var15, var12);
            var14 = var14.rest();
            var15 = var14.first();
        }
        return var12;
    }
    
    public static SubLObject f51305(final SubLObject var11) {
        if (NIL != f51308(var11)) {
            return f51305(f51309(var11));
        }
        if (NIL != module0202.f12606(var11)) {
            return f51305(module0205.f13204(var11, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0202.f12595(var11)) {
            SubLObject var12 = (SubLObject)NIL;
            SubLObject var14;
            final SubLObject var13 = var14 = module0205.f13207(var11, (SubLObject)$ic39$);
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                SubLObject var16_184 = f51305(var15);
                SubLObject var16 = (SubLObject)NIL;
                var16 = var16_184.first();
                while (NIL != var16_184) {
                    if (NIL != module0205.f13220((SubLObject)$ic14$, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var12 = (SubLObject)ConsesLow.cons(var16, var12);
                    }
                    var16_184 = var16_184.rest();
                    var16 = var16_184.first();
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return var12;
        }
        if (NIL != module0205.f13220((SubLObject)$ic14$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51310(final SubLObject var125) {
        return module0004.f104(var125, $g6405$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51311(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)NIL;
        if (NIL != f51308(var11)) {
            return f51311(module0205.f13203(var11, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0202.f12606(var11)) {
            var13 = f51312(var11);
        }
        else if (NIL != f51313(module0205.f13132(var11))) {
            var13 = f51314(var11);
        }
        else if (NIL != module0202.f12595(var11)) {
            var13 = f51315(var11);
        }
        else if (NIL != f51316(var11)) {
            var13 = f51317(var11);
        }
        else if (NIL != module0202.f12608(var11)) {
            var13 = f51318(var11);
        }
        else if (NIL != module0337.f22630(var11, (SubLObject)$ic109$)) {
            var13 = (SubLObject)ConsesLow.list((SubLObject)$ic110$);
        }
        else if (NIL != module0337.f22630(var11, (SubLObject)$ic111$)) {
            var13 = (SubLObject)ConsesLow.list((SubLObject)$ic112$);
        }
        else if (NIL != module0205.f13145((SubLObject)$ic43$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var13 = (SubLObject)ConsesLow.list((SubLObject)$ic113$);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && NIL != var13 && NIL == module0035.f2192((SubLObject)$ic114$, var13)) {
            Errors.error((SubLObject)$ic115$, var13);
        }
        return var13;
    }
    
    public static SubLObject f51313(final SubLObject var125) {
        return module0004.f104(var125, $g6406$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51316(final SubLObject var11) {
        return module0337.f22630(var11, (SubLObject)$ic117$);
    }
    
    public static SubLObject f51319() {
        final SubLObject var134 = $g6409$.getGlobalValue();
        if (NIL != var134) {
            module0034.f1818(var134);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51320() {
        return module0034.f1829($g6409$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51321() {
        SubLObject var186 = $g6408$.getGlobalValue();
        SubLObject var187 = $g6407$.getGlobalValue();
        SubLObject var188 = (SubLObject)NIL;
        var188 = var187.first();
        while (NIL != var187) {
            SubLObject var190;
            final SubLObject var189 = var190 = var188;
            SubLObject var191 = (SubLObject)NIL;
            SubLObject var192 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var190, var189, (SubLObject)$ic121$);
            var191 = var190.first();
            var190 = (var192 = var190.rest());
            var186 = module0035.f2063(var186, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic122$, var191), (SubLObject)$ic123$), var192, (SubLObject)UNPROVIDED);
            var187 = var187.rest();
            var188 = var187.first();
        }
        return var186;
    }
    
    public static SubLObject f51322() {
        SubLObject var137 = $g6409$.getGlobalValue();
        if (NIL == var137) {
            var137 = module0034.f1934((SubLObject)$ic120$, (SubLObject)$ic124$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER);
        }
        SubLObject var138 = module0034.f1810(var137, (SubLObject)UNPROVIDED);
        if (var138 == $ic62$) {
            var138 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51321()));
            module0034.f1812(var137, var138, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var138);
    }
    
    public static SubLObject f51317(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)NIL;
        assert NIL != f51316(var11) : var11;
        final SubLObject var14 = module0147.f9540($ic126$);
        final SubLObject var15 = module0147.$g2095$.currentBinding(var12);
        final SubLObject var16 = module0147.$g2094$.currentBinding(var12);
        final SubLObject var17 = module0147.$g2096$.currentBinding(var12);
        try {
            module0147.$g2095$.bind(module0147.f9545(var14), var12);
            module0147.$g2094$.bind(module0147.f9546(var14), var12);
            module0147.$g2096$.bind(module0147.f9549(var14), var12);
            SubLObject var18 = f51322();
            SubLObject var19 = (SubLObject)NIL;
            var19 = var18.first();
            while (NIL != var18) {
                SubLObject var21;
                final SubLObject var20 = var21 = var19;
                SubLObject var22 = (SubLObject)NIL;
                SubLObject var23 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic127$);
                var22 = var21.first();
                var21 = (var23 = var21.rest());
                if (NIL != module0337.f22630(var11, var22)) {
                    var13 = (SubLObject)ConsesLow.cons(var23, var13);
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var17, var12);
            module0147.$g2094$.rebind(var16, var12);
            module0147.$g2095$.rebind(var15, var12);
        }
        return Sequences.delete_duplicates(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51318(final SubLObject var11) {
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = $g6410$.getGlobalValue();
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            SubLObject var16;
            final SubLObject var15 = var16 = var14;
            SubLObject var17 = (SubLObject)NIL;
            SubLObject var18 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic127$);
            var17 = var16.first();
            var16 = (var18 = var16.rest());
            if (NIL != module0337.f22630(var11, var17)) {
                var12 = (SubLObject)ConsesLow.cons(var18, var12);
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return var12;
    }
    
    public static SubLObject f51314(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = (SubLObject)$ic129$;
        var12.resetMultipleValues();
        final SubLObject var14 = module0337.f22630(var11, var13);
        final SubLObject var15 = var12.secondMultipleValue();
        var12.resetMultipleValues();
        if (NIL != var14) {
            final SubLObject var16 = module0035.f2294(var15, (SubLObject)$ic130$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var17 = module0035.f2294(var15, (SubLObject)$ic131$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var18 = module0035.f2294(var15, (SubLObject)$ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return f51311((SubLObject)ConsesLow.list(var18, var17, (SubLObject)ConsesLow.list($ic132$, var16)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51312(final SubLObject var11) {
        assert NIL != module0202.f12606(var11) : var11;
        SubLObject var13;
        final SubLObject var12 = var13 = module0205.f13207(var11, (SubLObject)UNPROVIDED);
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic133$);
        var14 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic133$);
        var15 = var13.first();
        var13 = var13.rest();
        if (NIL == var13) {
            final SubLObject var16 = module0205.f13250((SubLObject)$ic134$, var14, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return f51311(var16);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic133$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51315(final SubLObject var11) {
        assert NIL != module0202.f12595(var11) : var11;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = module0205.f13207(var11, (SubLObject)UNPROVIDED);
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            if (NIL != module0552.f34030(var14)) {
                var12 = ConsesLow.append(f51311(var14), var12);
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return var12;
    }
    
    public static SubLObject f51323(final SubLObject var198) {
        if (NIL != module0337.f22630(var198, (SubLObject)$ic136$)) {
            return (SubLObject)T;
        }
        if (NIL == module0210.f13565(var198)) {
            return (SubLObject)NIL;
        }
        if (NIL != f51324(var198) || NIL != module0259.f16854(var198, $ic137$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0256.f16576(var198, $ic138$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0256.f16576(var198, $ic139$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0256.f16576(var198, $ic140$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0256.f16576(var198, $ic141$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0256.f16576(var198, $ic142$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0256.f16576(var198, $ic143$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0256.f16576(var198, $ic144$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0256.f16576(var198, $ic145$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0256.f16576(var198, $ic146$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0256.f16576(var198, $ic147$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0256.f16576(var198, $ic148$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51324(final SubLObject var198) {
        final SubLThread var199 = SubLProcess.currentSubLThread();
        SubLObject var200 = (SubLObject)NIL;
        if (NIL != module0552.f34002(var198)) {
            var199.resetMultipleValues();
            final SubLObject var201 = module0337.f22630(module0172.f10920(var198), (SubLObject)$ic149$);
            final SubLObject var202 = var199.secondMultipleValue();
            var199.resetMultipleValues();
            if (NIL != var201) {
                final SubLObject var203 = module0035.f2294(var202, (SubLObject)$ic150$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var200 = f51323(var203);
            }
        }
        return var200;
    }
    
    public static SubLObject f51325(final SubLObject var11, final SubLObject var3) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0205.f13132(var11);
        final SubLObject var14 = module0205.f13397((SubLObject)$ic14$, var11, (SubLObject)UNPROVIDED);
        SubLObject var15 = (SubLObject)NIL;
        if (NIL == var15) {
            final SubLObject var16 = var13;
            final SubLObject var17 = (SubLObject)(($ic19$ == $ic20$) ? $ic21$ : $ic22$);
            final SubLObject var18 = module0056.f4145(var17);
            SubLObject var19 = (SubLObject)NIL;
            final SubLObject var20 = module0139.$g1635$.currentBinding(var12);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var12);
                final SubLObject var36_202 = module0147.$g2095$.currentBinding(var12);
                final SubLObject var21 = module0147.$g2094$.currentBinding(var12);
                final SubLObject var22 = module0147.$g2096$.currentBinding(var12);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var3), var12);
                    module0147.$g2094$.bind(module0147.f9546(var3), var12);
                    module0147.$g2096$.bind(module0147.f9549(var3), var12);
                    final SubLObject var23 = $ic151$;
                    final SubLObject var36_203 = module0141.$g1714$.currentBinding(var12);
                    final SubLObject var37_204 = module0141.$g1715$.currentBinding(var12);
                    try {
                        module0141.$g1714$.bind((NIL != var23) ? var23 : module0141.f9283(), var12);
                        module0141.$g1715$.bind((SubLObject)((NIL != var23) ? $ic23$ : module0141.$g1715$.getDynamicValue(var12)), var12);
                        if (NIL != var23 && NIL != module0136.f8864() && NIL == module0141.f9279(var23)) {
                            final SubLObject var24 = module0136.$g1591$.getDynamicValue(var12);
                            if (var24.eql((SubLObject)$ic24$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic25$, var23, (SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var24.eql((SubLObject)$ic27$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic28$, (SubLObject)$ic25$, var23, (SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var24.eql((SubLObject)$ic29$)) {
                                Errors.warn((SubLObject)$ic25$, var23, (SubLObject)$ic26$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic30$, module0136.$g1591$.getDynamicValue(var12));
                                Errors.cerror((SubLObject)$ic28$, (SubLObject)$ic25$, var23, (SubLObject)$ic26$);
                            }
                        }
                        final SubLObject var36_204 = module0141.$g1670$.currentBinding(var12);
                        final SubLObject var37_205 = module0141.$g1671$.currentBinding(var12);
                        final SubLObject var38_207 = module0141.$g1672$.currentBinding(var12);
                        final SubLObject var25 = module0141.$g1674$.currentBinding(var12);
                        final SubLObject var26 = module0137.$g1605$.currentBinding(var12);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic31$), var12);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic31$)), var12);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic31$)), var12);
                            module0141.$g1674$.bind((SubLObject)NIL, var12);
                            module0137.$g1605$.bind(module0137.f8955($ic31$), var12);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var13, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var36_205 = module0141.$g1677$.currentBinding(var12);
                                final SubLObject var37_206 = module0138.$g1619$.currentBinding(var12);
                                final SubLObject var38_208 = module0141.$g1674$.currentBinding(var12);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var12);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic31$)), var12);
                                    module0141.$g1674$.bind((SubLObject)NIL, var12);
                                    module0249.f16055(var16, (SubLObject)UNPROVIDED);
                                    for (var19 = (SubLObject)ConsesLow.list(var13, module0141.f9195()); NIL != var19 && NIL == var15; var19 = module0056.f4150(var18)) {
                                        final SubLObject var46_211 = var19.first();
                                        final SubLObject var27 = conses_high.second(var19);
                                        final SubLObject var28 = var46_211;
                                        final SubLObject var36_206 = module0141.$g1674$.currentBinding(var12);
                                        try {
                                            module0141.$g1674$.bind(var27, var12);
                                            if (NIL != module0250.f16115(module0141.f9190(), var46_211)) {
                                                final SubLObject var29 = module0226.f15069(var28, var3);
                                                if (var29.isInteger() && NIL == module0004.f104((SubLObject)ConsesLow.list(var29), var14, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                                                    var15 = (SubLObject)T;
                                                }
                                                if (NIL == var15) {
                                                    SubLObject var30 = module0220.f14563(var28, $ic152$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    SubLObject var31 = (SubLObject)NIL;
                                                    var31 = var30.first();
                                                    while (NIL == var15 && NIL != var30) {
                                                        if (NIL != module0004.f104((SubLObject)ConsesLow.list(var31), var14, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                                                            var15 = (SubLObject)T;
                                                        }
                                                        var30 = var30.rest();
                                                        var31 = var30.first();
                                                    }
                                                }
                                            }
                                            final SubLObject var32 = module0200.f12443(module0137.f8955($ic31$));
                                            SubLObject var33;
                                            SubLObject var34;
                                            SubLObject var36_207;
                                            SubLObject var37_207;
                                            SubLObject var35;
                                            SubLObject var36;
                                            SubLObject var37;
                                            SubLObject var38;
                                            SubLObject var75_217;
                                            SubLObject var39;
                                            SubLObject var36_208;
                                            SubLObject var74_219;
                                            SubLObject var40;
                                            SubLObject var41;
                                            SubLObject var36_209;
                                            SubLObject var42;
                                            SubLObject var43;
                                            SubLObject var44;
                                            SubLObject var45;
                                            SubLObject var46;
                                            SubLObject var47;
                                            SubLObject var48;
                                            SubLObject var49;
                                            SubLObject var67_221;
                                            SubLObject var50;
                                            SubLObject var36_210;
                                            SubLObject var52;
                                            SubLObject var51;
                                            SubLObject var53;
                                            SubLObject var54;
                                            SubLObject var55;
                                            SubLObject var56;
                                            SubLObject var57;
                                            SubLObject var58;
                                            for (var33 = (SubLObject)NIL, var33 = var32; NIL == var15 && NIL != var33; var33 = var33.rest()) {
                                                var34 = var33.first();
                                                var36_207 = module0137.$g1605$.currentBinding(var12);
                                                var37_207 = module0141.$g1674$.currentBinding(var12);
                                                try {
                                                    module0137.$g1605$.bind(var34, var12);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var12)) : module0141.$g1674$.getDynamicValue(var12)), var12);
                                                    var35 = module0228.f15229(var46_211);
                                                    if (NIL != module0138.f8992(var35)) {
                                                        var36 = module0242.f15664(var35, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var36) {
                                                            var37 = module0245.f15834(var36, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var37) {
                                                                for (var38 = module0066.f4838(module0067.f4891(var37)); NIL == var15 && NIL == module0066.f4841(var38); var38 = module0066.f4840(var38)) {
                                                                    var12.resetMultipleValues();
                                                                    var75_217 = module0066.f4839(var38);
                                                                    var39 = var12.secondMultipleValue();
                                                                    var12.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var75_217)) {
                                                                        var36_208 = module0138.$g1623$.currentBinding(var12);
                                                                        try {
                                                                            module0138.$g1623$.bind(var75_217, var12);
                                                                            for (var74_219 = module0066.f4838(module0067.f4891(var39)); NIL == var15 && NIL == module0066.f4841(var74_219); var74_219 = module0066.f4840(var74_219)) {
                                                                                var12.resetMultipleValues();
                                                                                var40 = module0066.f4839(var74_219);
                                                                                var41 = var12.secondMultipleValue();
                                                                                var12.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var40)) {
                                                                                    var36_209 = module0138.$g1624$.currentBinding(var12);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var40, var12);
                                                                                        var42 = var41;
                                                                                        if (NIL != module0077.f5302(var42)) {
                                                                                            var43 = module0077.f5333(var42);
                                                                                            for (var44 = module0032.f1741(var43), var45 = (SubLObject)NIL, var45 = module0032.f1742(var44, var43); NIL == var15 && NIL == module0032.f1744(var44, var45); var45 = module0032.f1743(var45)) {
                                                                                                var46 = module0032.f1745(var44, var45);
                                                                                                if (NIL != module0032.f1746(var45, var46) && NIL == module0249.f16059(var46, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var46, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var46, module0141.f9195()), var18);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var42.isList()) {
                                                                                            if (NIL == var15) {
                                                                                                var47 = var42;
                                                                                                var48 = (SubLObject)NIL;
                                                                                                var48 = var47.first();
                                                                                                while (NIL == var15 && NIL != var47) {
                                                                                                    if (NIL == module0249.f16059(var48, (SubLObject)UNPROVIDED)) {
                                                                                                        module0249.f16055(var48, (SubLObject)UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var48, module0141.f9195()), var18);
                                                                                                    }
                                                                                                    var47 = var47.rest();
                                                                                                    var48 = var47.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic32$, var42);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var36_209, var12);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var74_219);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var36_208, var12);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var38);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var35, (SubLObject)UNPROVIDED)) {
                                                        var49 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var12), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var12), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        for (var67_221 = (SubLObject)NIL, var67_221 = var49; NIL == var15 && NIL != var67_221; var67_221 = var67_221.rest()) {
                                                            var50 = var67_221.first();
                                                            var36_210 = module0138.$g1625$.currentBinding(var12);
                                                            try {
                                                                module0138.$g1625$.bind(var50, var12);
                                                                var51 = (var52 = Functions.funcall(var50, var35));
                                                                if (NIL != module0077.f5302(var52)) {
                                                                    var53 = module0077.f5333(var52);
                                                                    for (var54 = module0032.f1741(var53), var55 = (SubLObject)NIL, var55 = module0032.f1742(var54, var53); NIL == var15 && NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
                                                                        var56 = module0032.f1745(var54, var55);
                                                                        if (NIL != module0032.f1746(var55, var56) && NIL == module0249.f16059(var56, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var56, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var56, module0141.f9195()), var18);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var52.isList()) {
                                                                    if (NIL == var15) {
                                                                        var57 = var52;
                                                                        var58 = (SubLObject)NIL;
                                                                        var58 = var57.first();
                                                                        while (NIL == var15 && NIL != var57) {
                                                                            if (NIL == module0249.f16059(var58, (SubLObject)UNPROVIDED)) {
                                                                                module0249.f16055(var58, (SubLObject)UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var58, module0141.f9195()), var18);
                                                                            }
                                                                            var57 = var57.rest();
                                                                            var58 = var57.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic32$, var52);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var36_210, var12);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var37_207, var12);
                                                    module0137.$g1605$.rebind(var36_207, var12);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var36_206, var12);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var38_208, var12);
                                    module0138.$g1619$.rebind(var37_206, var12);
                                    module0141.$g1677$.rebind(var36_205, var12);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic34$, var13, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var26, var12);
                            module0141.$g1674$.rebind(var25, var12);
                            module0141.$g1672$.rebind(var38_207, var12);
                            module0141.$g1671$.rebind(var37_205, var12);
                            module0141.$g1670$.rebind(var36_204, var12);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var37_204, var12);
                        module0141.$g1714$.rebind(var36_203, var12);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var22, var12);
                    module0147.$g2094$.rebind(var21, var12);
                    module0147.$g2095$.rebind(var36_202, var12);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var12));
            }
            finally {
                module0139.$g1635$.rebind(var20, var12);
            }
        }
        return var15;
    }
    
    public static SubLObject f51326(final SubLObject var11) {
        return module0202.f12643($ic153$, var11);
    }
    
    public static SubLObject f51309(final SubLObject var11) {
        return module0205.f13203(var11, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51308(final SubLObject var11) {
        return module0337.f22630(var11, (SubLObject)$ic154$);
    }
    
    public static SubLObject f51327() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51270", "S#55858", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51272", "S#55859", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51273", "S#55860", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51279", "S#55861", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51281", "S#55862", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51282", "S#55863", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51283", "S#55864", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51280", "S#55865", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51275", "S#55866", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51285", "S#55867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51274", "S#55868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51276", "S#55869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51277", "S#55870", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51286", "S#55871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51288", "S#55872", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51289", "S#55873", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51290", "S#55874", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51287", "S#55875", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51278", "S#55876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51284", "S#55877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51291", "S#55878", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51271", "S#55879", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51292", "S#55880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51293", "S#55881", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51294", "S#55882", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51295", "S#55883", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51296", "S#55884", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51297", "S#55885", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51298", "S#55886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51299", "S#21055", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51300", "S#55887", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51301", "S#55888", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0806", "f51302", "S#55889");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51303", "S#55890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51304", "S#55891", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51307", "S#55892", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51306", "S#55893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51305", "S#55894", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51310", "S#55895", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51311", "S#55896", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51313", "S#55897", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51316", "S#55898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51319", "S#55899", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51320", "S#55900", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51321", "S#55901", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51322", "S#55902", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51317", "S#55903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51318", "S#55904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51314", "S#55905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51312", "S#55906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51315", "S#55907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51323", "S#55908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51324", "S#55909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51325", "S#55910", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51326", "S#55911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51309", "S#55912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0806", "f51308", "S#55913", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51328() {
        $g6403$ = SubLFiles.deflexical("S#55914", (SubLObject)NIL);
        $g6404$ = SubLFiles.defparameter("S#55915", (SubLObject)NIL);
        $g6405$ = SubLFiles.deflexical("S#55916", (SubLObject)$ic108$);
        $g6406$ = SubLFiles.deflexical("S#55917", (SubLObject)$ic116$);
        $g6407$ = SubLFiles.deflexical("S#55918", (SubLObject)$ic118$);
        $g6408$ = SubLFiles.deflexical("S#55919", (SubLObject)$ic119$);
        $g6409$ = SubLFiles.deflexical("S#55920", (SubLObject)NIL);
        $g6410$ = SubLFiles.deflexical("S#55921", (SubLObject)$ic128$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51329() {
        module0034.f1909((SubLObject)$ic59$);
        module0034.f1909((SubLObject)$ic120$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f51327();
    }
    
    public void initializeVariables() {
        f51328();
    }
    
    public void runTopLevelForms() {
        f51329();
    }
    
    static {
        me = (SubLFile)new module0806();
        $g6403$ = null;
        $g6404$ = null;
        $g6405$ = null;
        $g6406$ = null;
        $g6407$ = null;
        $g6408$ = null;
        $g6409$ = null;
        $g6410$ = null;
        $ic0$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic1$ = makeSymbol("?TERM");
        $ic2$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("injuryCount")), constant_handles_oc.f8479((SubLObject)makeString("deathToll")), constant_handles_oc.f8479((SubLObject)makeString("casualtyCount")), constant_handles_oc.f8479((SubLObject)makeString("numberOfHostagesTaken")), constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsCount")));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsCount"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExists"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent"));
        $ic6$ = makeSymbol("?VALUE");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("situationLocation"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("geographicalSubRegions"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#155", "CYC")), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#132", "CYC")));
        $ic12$ = makeSymbol("S#132", "CYC");
        $ic13$ = makeSymbol("S#155", "CYC");
        $ic14$ = makeKeyword("TERM");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#155", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#132", "CYC")), (SubLObject)makeKeyword("TERM"));
        $ic16$ = ConsesLow.list((SubLObject)makeKeyword("TERM"));
        $ic17$ = makeSymbol("S#55867", "CYC");
        $ic18$ = makeInteger(150000);
        $ic19$ = makeKeyword("BREADTH");
        $ic20$ = makeKeyword("DEPTH");
        $ic21$ = makeKeyword("STACK");
        $ic22$ = makeKeyword("QUEUE");
        $ic23$ = makeSymbol("S#11450", "CYC");
        $ic24$ = makeKeyword("ERROR");
        $ic25$ = makeString("~A is not a ~A");
        $ic26$ = makeSymbol("S#11592", "CYC");
        $ic27$ = makeKeyword("CERROR");
        $ic28$ = makeString("continue anyway");
        $ic29$ = makeKeyword("WARN");
        $ic30$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic32$ = makeString("~A is neither SET-P nor LISTP.");
        $ic33$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic34$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic35$ = ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("TERM"), (SubLObject)makeKeyword("FORT"));
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic37$ = makeSymbol("S#13455", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic39$ = makeKeyword("IGNORE");
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("InstanceNamedFn"));
        $ic41$ = makeSymbol("INTEGERP");
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("greaterThanOrEqualTo"));
        $ic43$ = makeSymbol("S#24728", "CYC");
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("CityNamedFn"));
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("TerritoryFn"));
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("City"));
        $ic47$ = makeSymbol("?COUNTRY");
        $ic48$ = constant_handles_oc.f8479((SubLObject)makeString("countryOfCity"));
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("GeographicalAgent"));
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("GeographicalRegion"));
        $ic51$ = makeSymbol("?TERRITORY");
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("territoryOf"));
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("?TERRITORY"));
        $ic54$ = makeSymbol("?BIG");
        $ic55$ = makeSymbol("S#12274", "CYC");
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic57$ = makeSymbol("S#55871", "CYC");
        $ic58$ = makeString("Couldn't find bigger places for ~S");
        $ic59$ = makeSymbol("S#55875", "CYC");
        $ic60$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Planet")), constant_handles_oc.f8479((SubLObject)makeString("GeographicalHemisphere")), constant_handles_oc.f8479((SubLObject)makeString("Continent")));
        $ic61$ = makeSymbol("S#55914", "CYC");
        $ic62$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic63$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24413", "CYC")), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("EL-VAR?"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24428", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#132", "CYC")), (SubLObject)makeKeyword("ANYTHING"))));
        $ic64$ = makeSymbol("S#24428", "CYC");
        $ic65$ = makeSymbol("S#24413", "CYC");
        $ic66$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24428", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#132", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24413", "CYC")), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("EL-VAR?")))));
        $ic67$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#132", "CYC"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsCount")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24413", "CYC")), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC")), (SubLObject)makeKeyword("ANYTHING"))));
        $ic68$ = makeSymbol("S#12458", "CYC");
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalMinFn"));
        $ic70$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#132", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("EL-VAR?"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsCount")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24413", "CYC")), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC")), (SubLObject)makeKeyword("ANYTHING"))));
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalMaxFn"));
        $ic72$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#132", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("EL-VAR?"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55922", "CYC")), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC")), (SubLObject)makeKeyword("ANYTHING"))));
        $ic73$ = makeSymbol("S#55922", "CYC");
        $ic74$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55922", "CYC")), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#132", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("EL-VAR?")))));
        $ic75$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#132", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55922", "CYC")), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC")), (SubLObject)makeKeyword("ANYTHING"))));
        $ic76$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55922", "CYC")), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("EL-VAR?")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#132", "CYC")))));
        $ic77$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsCount")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24413", "CYC")), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12458", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("greaterThanOrEqualTo")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#132", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("EL-VAR?")))));
        $ic78$ = makeSymbol("?VAR");
        $ic79$ = ConsesLow.list((SubLObject)makeKeyword("ANYTHING"));
        $ic80$ = constant_handles_oc.f8479((SubLObject)makeString("TheSetOf"));
        $ic81$ = makeSymbol("?CARDINALITY");
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("extentCardinality"));
        $ic83$ = makeKeyword("RETURN");
        $ic84$ = makeKeyword("TEMPLATE");
        $ic85$ = makeKeyword("GAF");
        $ic86$ = makeKeyword("TRUE");
        $ic87$ = makeInteger(100000);
        $ic88$ = makeUninternedSymbol("US#E7B245");
        $ic89$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic90$ = makeSymbol("S#55915", "CYC");
        $ic91$ = ConsesLow.list((SubLObject)makeSymbol("S#55887", "CYC"));
        $ic92$ = makeSymbol("CUNWIND-PROTECT");
        $ic93$ = makeSymbol("PROGN");
        $ic94$ = makeSymbol("PUNLESS");
        $ic95$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("DESTROY-PROBLEM-STORE"), (SubLObject)makeSymbol("S#55915", "CYC")));
        $ic96$ = constant_handles_oc.f8479((SubLObject)makeString("TypicalityReferenceSetPropertyType"));
        $ic97$ = makeSymbol("?PROPERTY-TYPE");
        $ic98$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic99$ = makeKeyword("MAX-NUMBER");
        $ic100$ = makeKeyword("MAX-TIME");
        $ic101$ = makeInteger(60);
        $ic102$ = makeKeyword("PROBLEM-STORE");
        $ic103$ = makeSymbol("?STRING");
        $ic104$ = constant_handles_oc.f8479((SubLObject)makeString("termStrings"));
        $ic105$ = ConsesLow.list((SubLObject)makeSymbol("?STRING"));
        $ic106$ = constant_handles_oc.f8479((SubLObject)makeString("EnglishMt"));
        $ic107$ = constant_handles_oc.f8479((SubLObject)makeString("typicalityReferenceSetPropertyTypes"));
        $ic108$ = ConsesLow.list(new SubLObject[] { makeKeyword("DATE"), makeKeyword("LOCATION"), makeKeyword("PERPETRATOR"), makeKeyword("ATTACK-TYPE"), makeKeyword("TARGET"), makeKeyword("INHABITANTS"), makeKeyword("ECONOMY"), makeKeyword("RELIGION"), makeKeyword("CONTROL"), makeKeyword("CAPABILITIES"), makeKeyword("PERSONAL"), makeKeyword("CONTACT"), makeKeyword("LANGUAGE"), makeKeyword("SUB-EVENT"), makeKeyword("SUPER-EVENT"), makeKeyword("MOTIVATION") });
        $ic109$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("GENL-PRED"), constant_handles_oc.f8479((SubLObject)makeString("subEvents"))), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("TERM"));
        $ic110$ = makeKeyword("SUPER-EVENT");
        $ic111$ = ConsesLow.listS(constant_handles_oc.f8479((SubLObject)makeString("pointOfContactInfo")), (SubLObject)makeKeyword("TERM"), (SubLObject)makeKeyword("ANYTHING"));
        $ic112$ = makeKeyword("CONTACT");
        $ic113$ = makeKeyword("DATE");
        $ic114$ = makeSymbol("S#55895", "CYC");
        $ic115$ = makeString("~S is not a list of property types.");
        $ic116$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsCount")), constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExists")), constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsRange")), constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsMany")), constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsMax")), constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsMin")), constant_handles_oc.f8479((SubLObject)makeString("num-GenQuantRelnFrom")));
        $ic117$ = ConsesLow.list((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("TERM"), (SubLObject)makeKeyword("ANYTHING"));
        $ic118$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("startingDate")), (SubLObject)makeKeyword("DATE")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("endingDate")), (SubLObject)makeKeyword("DATE")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("age")), (SubLObject)makeKeyword("DATE")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("situationLocation")), (SubLObject)makeKeyword("LOCATION")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("eventPartiallyOccursAt")), (SubLObject)makeKeyword("LOCATION")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("politiesBorderEachOther")), (SubLObject)makeKeyword("LOCATION")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("comesFrom-Generic")), (SubLObject)makeKeyword("LOCATION")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("subEvents")), (SubLObject)makeKeyword("SUB-EVENT")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("perpetrator")), (SubLObject)makeKeyword("PERPETRATOR")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("directingAgent")), (SubLObject)makeKeyword("PERPETRATOR")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("eventPlannedBy")), (SubLObject)makeKeyword("PERPETRATOR")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("inReactionTo")), (SubLObject)makeKeyword("MOTIVATION")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("imports")), (SubLObject)makeKeyword("ECONOMY")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("regionProduces")), (SubLObject)makeKeyword("ECONOMY")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("inhabitantTypes")), (SubLObject)makeKeyword("INHABITANTS")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("residentsOfRegion")), (SubLObject)makeKeyword("INHABITANTS")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("religionOfRule")), (SubLObject)makeKeyword("RELIGION")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("cultureReligions")), (SubLObject)makeKeyword("RELIGION")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("majorReligions")), (SubLObject)makeKeyword("RELIGION")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("minorReligions")), (SubLObject)makeKeyword("RELIGION")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("ableToControl")), (SubLObject)makeKeyword("CONTROL")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("owns")), (SubLObject)makeKeyword("CONTROL")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("personalFeatures")), (SubLObject)makeKeyword("PERSONAL")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("likes-Generic")), (SubLObject)makeKeyword("PERSONAL")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("eatsWillingly")), (SubLObject)makeKeyword("PERSONAL")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("relatives")), (SubLObject)makeKeyword("PERSONAL")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("acquaintedWith")), (SubLObject)makeKeyword("PERSONAL")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("eMailAddressText")), (SubLObject)makeKeyword("CONTACT")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("programsIn")), (SubLObject)makeKeyword("CAPABILITIES")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("educationLevel")), (SubLObject)makeKeyword("CAPABILITIES")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("fieldsOfCompetence")), (SubLObject)makeKeyword("CAPABILITIES")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("languagesSpokenHere")), (SubLObject)makeKeyword("LANGUAGE")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("languageSpoken")), (SubLObject)makeKeyword("LANGUAGE")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("organismKilled")), (SubLObject)makeKeyword("TARGET")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("thingHarmed")), (SubLObject)makeKeyword("TARGET")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("instrumentalRole")), (SubLObject)makeKeyword("ATTACK-TYPE")) });
        $ic119$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("GENL-PRED"), constant_handles_oc.f8479((SubLObject)makeString("isa"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("SPEC-PRED"), constant_handles_oc.f8479((SubLObject)makeString("isa")))), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#55908", "CYC"))), (SubLObject)makeKeyword("ATTACK-TYPE")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("GENL-PRED"), constant_handles_oc.f8479((SubLObject)makeString("isa"))), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("GENLS"), constant_handles_oc.f8479((SubLObject)makeString("Graduate"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ISA"), constant_handles_oc.f8479((SubLObject)makeString("PersonTypeByEducationLevel"))))), (SubLObject)makeKeyword("CAPABILITIES")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("GENL-PRED"), constant_handles_oc.f8479((SubLObject)makeString("isa"))), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ISA"), constant_handles_oc.f8479((SubLObject)makeString("PersonTypeByCulture")))), (SubLObject)makeKeyword("PERSONAL")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("SPEC-PRED"), constant_handles_oc.f8479((SubLObject)makeString("perpetrator"))), (SubLObject)makeKeyword("TERM"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PERPETRATOR")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)makeString("occursDuring")), constant_handles_oc.f8479((SubLObject)makeString("temporallyIntersects"))), (SubLObject)makeKeyword("TERM"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("DATE")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)makeString("intendedAttackTargets")), constant_handles_oc.f8479((SubLObject)makeString("intendedTargetTypeOfAttack")), constant_handles_oc.f8479((SubLObject)makeString("intendedVictim")), constant_handles_oc.f8479((SubLObject)makeString("numberOfHostagesTaken")), constant_handles_oc.f8479((SubLObject)makeString("target")), constant_handles_oc.f8479((SubLObject)makeString("bodilyActedOn")), constant_handles_oc.f8479((SubLObject)makeString("objectAttacked"))), (SubLObject)makeKeyword("TERM"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("TARGET")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("TERM"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24728", "CYC"))), (SubLObject)makeKeyword("DATE")));
        $ic120$ = makeSymbol("S#55902", "CYC");
        $ic121$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#55923", "CYC"));
        $ic122$ = makeKeyword("GENL-PRED");
        $ic123$ = ConsesLow.list((SubLObject)makeKeyword("TERM"), (SubLObject)makeKeyword("ANYTHING"));
        $ic124$ = makeSymbol("S#55920", "CYC");
        $ic125$ = makeSymbol("S#55898", "CYC");
        $ic126$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic127$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#32", "CYC"), (SubLObject)makeSymbol("S#55923", "CYC"));
        $ic128$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)makeString("injuryCount")), constant_handles_oc.f8479((SubLObject)makeString("deathToll")), constant_handles_oc.f8479((SubLObject)makeString("casualtyCount"))), (SubLObject)makeKeyword("TERM"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("TARGET")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(constant_handles_oc.f8479((SubLObject)makeString("subSceneOfType")), (SubLObject)makeKeyword("TERM"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("SUB-EVENT")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(constant_handles_oc.f8479((SubLObject)makeString("capableOf")), (SubLObject)makeKeyword("TERM"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("CAPABILITIES")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("sponsorsAgentInAction")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("TERM")), (SubLObject)makeKeyword("PERPETRATOR")));
        $ic129$ = ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#55897", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#155", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("TYPE")), (SubLObject)makeKeyword("ANYTHING"));
        $ic130$ = makeSymbol("TYPE");
        $ic131$ = makeSymbol("S#12141", "CYC");
        $ic132$ = constant_handles_oc.f8479((SubLObject)makeString("SomeFn"));
        $ic133$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#55924", "CYC"));
        $ic134$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SomeFn")), constant_handles_oc.f8479((SubLObject)makeString("Thing")));
        $ic135$ = makeSymbol("S#13276", "CYC");
        $ic136$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("InstanceNamedFn")), (SubLObject)makeKeyword("STRING"), constant_handles_oc.f8479((SubLObject)makeString("AttackType")));
        $ic137$ = constant_handles_oc.f8479((SubLObject)makeString("AttackType"));
        $ic138$ = constant_handles_oc.f8479((SubLObject)makeString("AttackOnObject"));
        $ic139$ = constant_handles_oc.f8479((SubLObject)makeString("HostileSocialAction"));
        $ic140$ = constant_handles_oc.f8479((SubLObject)makeString("KillingByOrganism"));
        $ic141$ = constant_handles_oc.f8479((SubLObject)makeString("CapturingSomething"));
        $ic142$ = constant_handles_oc.f8479((SubLObject)makeString("IncurringDamage"));
        $ic143$ = constant_handles_oc.f8479((SubLObject)makeString("ManMadeDisaster"));
        $ic144$ = constant_handles_oc.f8479((SubLObject)makeString("ObstructionEvent"));
        $ic145$ = constant_handles_oc.f8479((SubLObject)makeString("MilitaryEvent"));
        $ic146$ = constant_handles_oc.f8479((SubLObject)makeString("ExposureToSubstance"));
        $ic147$ = constant_handles_oc.f8479((SubLObject)makeString("ActsCommonlyConsideredCriminal"));
        $ic148$ = constant_handles_oc.f8479((SubLObject)makeString("ShootingAProjectileWeapon"));
        $ic149$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("AttemptingFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#55925", "CYC")));
        $ic150$ = makeSymbol("S#55925", "CYC");
        $ic151$ = constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth"));
        $ic152$ = constant_handles_oc.f8479((SubLObject)makeString("functionalInArgs"));
        $ic153$ = constant_handles_oc.f8479((SubLObject)makeString("unknownSentence"));
        $ic154$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("unknownSentence")), (SubLObject)makeKeyword("ANYTHING"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1396 ms
	
	Decompiled with Procyon 0.5.32.
*/