package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0680 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0680";
    public static final String myFingerPrint = "a4d421045f97ebd2a10d9fb8f4f3c7b2c7421673f5d3ff7c09edcf0381b4af18";
    private static SubLSymbol $g5344$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLList $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLInteger $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    
    public static SubLObject f41597(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0656.f39943(var1, (SubLObject)module0680.UNPROVIDED);
        if (module0680.NIL == module0173.f10955(var3)) {
            return module0656.f39789((SubLObject)module0680.$ic2$, var1, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
        }
        final SubLObject var4 = f41598(var3);
        SubLObject var5 = (SubLObject)module0680.NIL;
        SubLObject var6 = (SubLObject)module0680.T;
        final SubLObject var7 = (SubLObject)module0680.$ic3$;
        final SubLObject var8 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0680.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0680.$ic4$);
            module0642.f39029((SubLObject)module0680.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var9 = module0014.f672((SubLObject)module0680.$ic5$);
            module0642.f39029((SubLObject)module0680.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            module0642.f39020((SubLObject)module0680.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            if (module0680.NIL != var9) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                module0642.f39020(var9);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            module0642.f39020((SubLObject)module0680.$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
            module0016.f941();
            if (module0680.NIL != var7) {
                module0642.f39029((SubLObject)module0680.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var7);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0680.UNPROVIDED);
            final SubLObject var8_10 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0680.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0680.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                module0642.f39020((SubLObject)module0680.$ic10$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                final SubLObject var8_11 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0680.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39020((SubLObject)module0680.$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                    final SubLObject var8_12 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0680.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020((SubLObject)module0680.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020((SubLObject)module0680.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39019((SubLObject)module0680.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_12, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0680.NIL != var7) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0680.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39019(var7);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0680.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                    final SubLObject var8_13 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var10 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var11 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0680.T, var2);
                        module0015.$g541$.bind((SubLObject)module0680.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0656.f39870((SubLObject)module0680.$ic0$, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0680.$ic15$);
                        module0656.f39915(var3, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39019((SubLObject)module0680.$ic16$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39051((SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                        SubLObject var12 = var4;
                        SubLObject var13 = (SubLObject)module0680.NIL;
                        var13 = var12.first();
                        while (module0680.NIL != var12) {
                            SubLObject var15;
                            final SubLObject var14 = var15 = var13;
                            SubLObject var16 = (SubLObject)module0680.NIL;
                            SubLObject var17 = (SubLObject)module0680.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0680.$ic17$);
                            var16 = var15.first();
                            var15 = var15.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0680.$ic17$);
                            var17 = var15.first();
                            var15 = var15.rest();
                            if (module0680.NIL == var15) {
                                var17 = module0213.f13926(Sequences.remove_duplicates(var17, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED), (SubLObject)module0680.NIL, (SubLObject)module0680.NIL, (SubLObject)module0680.T, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                                if (module0680.NIL == module0018.$g715$.getDynamicValue(var2)) {
                                    SubLObject var16_22 = var17;
                                    SubLObject var18 = (SubLObject)module0680.NIL;
                                    var18 = var16_22.first();
                                    while (module0680.NIL != var16_22) {
                                        if (module0680.NIL == module0259.f16854(var18, module0680.$ic18$, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED)) {
                                            final SubLObject var19 = var18;
                                            if (module0680.NIL == conses_high.member(var19, var5, Symbols.symbol_function((SubLObject)module0680.EQL), Symbols.symbol_function((SubLObject)module0680.IDENTITY))) {
                                                var5 = (SubLObject)ConsesLow.cons(var19, var5);
                                            }
                                        }
                                        var16_22 = var16_22.rest();
                                        var18 = var16_22.first();
                                    }
                                    var17 = Sequences.nreverse(var5);
                                }
                                if (module0680.NIL != module0018.$g716$.getDynamicValue(var2)) {
                                    module0642.f39026((SubLObject)module0680.UNPROVIDED);
                                    module0669.f40724(var16);
                                    module0642.f39020(module0015.$g346$.getGlobalValue());
                                    module0642.f39020(module0015.$g352$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0680.ZERO_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                                    module0642.f39020(module0015.$g353$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0680.FIVE_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                                    module0642.f39020(module0015.$g354$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0680.ZERO_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                                    final SubLObject var8_14 = module0015.$g533$.currentBinding(var2);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0680.T, var2);
                                        SubLObject var20 = (SubLObject)module0680.NIL;
                                        if (module0680.NIL == module0655.$g5111$.getDynamicValue(var2)) {
                                            var20 = module0015.$g493$.getGlobalValue();
                                        }
                                        SubLObject var21 = (SubLObject)module0680.NIL;
                                        SubLObject var22 = (SubLObject)module0680.NIL;
                                        SubLObject var23 = (SubLObject)module0680.NIL;
                                        SubLObject var24 = (SubLObject)module0680.NIL;
                                        var22 = var17;
                                        var23 = var22.first();
                                        for (var24 = (SubLObject)module0680.ZERO_INTEGER; module0680.NIL != var22; var22 = var22.rest(), var23 = var22.first(), var24 = Numbers.add((SubLObject)module0680.ONE_INTEGER, var24)) {
                                            if (module0680.NIL != module0655.$g5111$.getDynamicValue(var2)) {
                                                if (module0680.NIL != var21) {
                                                    var21 = (SubLObject)module0680.NIL;
                                                }
                                                else {
                                                    var21 = (SubLObject)module0680.T;
                                                }
                                                var20 = (SubLObject)((module0680.NIL != var21) ? module0680.$ic19$ : module0015.$g493$.getGlobalValue());
                                            }
                                            if (module0680.NIL != module0269.f17715(var23)) {
                                                module0659.f40117((SubLObject)module0680.$ic20$, (SubLObject)module0680.$ic21$, (SubLObject)module0680.$ic22$, var3, var16, var23, module0680.$ic23$);
                                            }
                                            else if (module0680.NIL != module0269.f17723(var23)) {
                                                module0659.f40117((SubLObject)module0680.$ic24$, (SubLObject)module0680.$ic21$, (SubLObject)module0680.$ic22$, var3, var16, var23, module0680.$ic23$);
                                            }
                                            module0642.f39020(module0015.$g364$.getGlobalValue());
                                            if (module0680.NIL != var20) {
                                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                                                module0642.f39020(var20);
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                                            }
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                                            final SubLObject var8_15 = module0015.$g533$.currentBinding(var2);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0680.T, var2);
                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                                                final SubLObject var8_16 = module0015.$g533$.currentBinding(var2);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0680.T, var2);
                                                    module0656.f39915(var23, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                                                    if (module0680.NIL != module0018.$g717$.getDynamicValue(var2)) {
                                                        module0642.f39026((SubLObject)module0680.UNPROVIDED);
                                                        module0642.f39032((SubLObject)module0680.FOUR_INTEGER);
                                                        final SubLObject var8_17 = module0147.$g2094$.currentBinding(var2);
                                                        final SubLObject var14_33 = module0147.$g2095$.currentBinding(var2);
                                                        try {
                                                            module0147.$g2094$.bind((SubLObject)module0680.$ic25$, var2);
                                                            module0147.$g2095$.bind(module0680.$ic26$, var2);
                                                            if (module0680.NIL == module0259.f16854(var23, module0680.$ic18$, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED) && module0680.NIL == module0259.f16854(var23, module0680.$ic27$, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED) && (module0680.NIL != module0269.f17706(var23) || module0680.NIL != module0269.f17708(var23))) {
                                                                final SubLObject var25 = module0751.f47156(var23, (SubLObject)module0680.T);
                                                                module0035.f2044(var16, var3, var25);
                                                                SubLObject var26 = (SubLObject)module0680.NIL;
                                                                try {
                                                                    var2.throwStack.push(module0680.$ic28$);
                                                                    final SubLObject var8_18 = Errors.$error_handler$.currentBinding(var2);
                                                                    try {
                                                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0680.$ic29$), var2);
                                                                        try {
                                                                            module0642.f39019(module0770.f49049(var25, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED));
                                                                        }
                                                                        catch (Throwable var27) {
                                                                            Errors.handleThrowable(var27, (SubLObject)module0680.NIL);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        Errors.$error_handler$.rebind(var8_18, var2);
                                                                    }
                                                                }
                                                                catch (Throwable var28) {
                                                                    var26 = Errors.handleThrowable(var28, (SubLObject)module0680.$ic28$);
                                                                }
                                                                finally {
                                                                    var2.throwStack.pop();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0147.$g2095$.rebind(var14_33, var2);
                                                            module0147.$g2094$.rebind(var8_17, var2);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var8_16, var2);
                                                }
                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var8_15, var2);
                                            }
                                            module0642.f39020(module0015.$g365$.getGlobalValue());
                                            module0642.f39029((SubLObject)module0680.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var8_14, var2);
                                    }
                                    module0642.f39020(module0015.$g347$.getGlobalValue());
                                }
                                else {
                                    if (module0680.NIL != var6) {
                                        var6 = (SubLObject)module0680.NIL;
                                    }
                                    else {
                                        module0642.f39026((SubLObject)module0680.UNPROVIDED);
                                        module0642.f39051((SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                                    }
                                    module0669.f40724(var16);
                                    module0642.f39026((SubLObject)module0680.UNPROVIDED);
                                    SubLObject var16_23 = var17;
                                    SubLObject var18 = (SubLObject)module0680.NIL;
                                    var18 = var16_23.first();
                                    while (module0680.NIL != var16_23) {
                                        if (module0680.NIL != module0269.f17715(var18)) {
                                            module0659.f40117((SubLObject)module0680.$ic20$, (SubLObject)module0680.$ic21$, (SubLObject)module0680.$ic22$, var3, var16, var18, module0680.$ic23$);
                                        }
                                        else if (module0680.NIL != module0269.f17723(var18)) {
                                            module0659.f40117((SubLObject)module0680.$ic24$, (SubLObject)module0680.$ic21$, (SubLObject)module0680.$ic22$, var3, var16, var18, module0680.$ic23$);
                                        }
                                        module0642.f39020(module0015.$g459$.getGlobalValue());
                                        module0656.f39915(var18, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                                        module0642.f39020(module0015.$g460$.getGlobalValue());
                                        module0642.f39032((SubLObject)module0680.TWO_INTEGER);
                                        module0642.f39028((SubLObject)module0680.UNPROVIDED);
                                        module0642.f39032((SubLObject)module0680.TWO_INTEGER);
                                        var16_23 = var16_23.rest();
                                        var18 = var16_23.first();
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)module0680.$ic17$);
                            }
                            var12 = var12.rest();
                            var13 = var12.first();
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var11, var2);
                        module0015.$g541$.rebind(var10, var2);
                        module0015.$g533$.rebind(var8_13, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0680.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var8_11, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0680.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var8_10, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0680.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var8, var2);
        }
        return (SubLObject)module0680.NIL;
    }
    
    public static SubLObject f41599(final SubLObject var3, SubLObject var40) {
        if (var40 == module0680.UNPROVIDED) {
            var40 = (SubLObject)module0680.NIL;
        }
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0680.NIL == var40) {
            var40 = (SubLObject)module0680.$ic3$;
        }
        final SubLObject var42 = module0656.f39832((SubLObject)module0680.$ic31$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var41), (SubLObject)module0680.$ic32$, module0656.f39842(var3));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
        if (module0680.NIL != var42) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            module0642.f39020(var42);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
        final SubLObject var43 = module0015.$g533$.currentBinding(var41);
        try {
            module0015.$g533$.bind((SubLObject)module0680.T, var41);
            module0642.f39019(var40);
        }
        finally {
            module0015.$g533$.rebind(var43, var41);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var3;
    }
    
    public static SubLObject f41598(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0680.NIL != module0173.f10955(var3) : var3;
        SubLObject var5 = (SubLObject)module0680.NIL;
        final SubLObject var6 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)module0680.$ic25$, var4);
            module0147.$g2095$.bind(module0680.$ic26$, var4);
            final SubLObject var8 = module0269.f17705(var3);
            final SubLObject var9 = module0256.f16531(module0680.$ic36$, (SubLObject)module0680.NIL, (SubLObject)module0680.UNPROVIDED);
            SubLObject var10 = module0259.f16840(var3, (SubLObject)module0680.NIL, (SubLObject)module0680.UNPROVIDED);
            var10 = conses_high.nunion(var10, var9, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
            var10 = Sort.sort(var10, Symbols.symbol_function((SubLObject)module0680.$ic37$), Symbols.symbol_function((SubLObject)module0680.$ic38$));
            SubLObject var11 = module0146.$g1959$.getGlobalValue();
            SubLObject var12 = (SubLObject)module0680.NIL;
            var12 = var11.first();
            while (module0680.NIL != var11) {
                final SubLObject var13 = module0226.f14903(var12, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                SubLObject var14 = (SubLObject)module0680.NIL;
                SubLObject var16_48 = var10;
                SubLObject var15 = (SubLObject)module0680.NIL;
                var15 = var16_48.first();
                while (module0680.NIL != var16_48) {
                    SubLObject var16_49;
                    final SubLObject var16 = var16_49 = module0220.f14562(var15, var13, (SubLObject)module0680.TWO_INTEGER, (SubLObject)module0680.ONE_INTEGER, (SubLObject)module0680.UNPROVIDED);
                    SubLObject var17 = (SubLObject)module0680.NIL;
                    var17 = var16_49.first();
                    while (module0680.NIL != var16_49) {
                        SubLObject var18 = (SubLObject)module0680.NIL;
                        if (module0217.f14221(var17, (SubLObject)module0680.ONE_INTEGER, var13, (SubLObject)module0680.UNPROVIDED).numG((SubLObject)module0680.ONE_INTEGER)) {
                            SubLObject var19 = (SubLObject)module0680.NIL;
                            final SubLObject var20 = var13;
                            if (module0680.NIL != module0158.f10010(var17, (SubLObject)module0680.ONE_INTEGER, var20)) {
                                final SubLObject var21 = module0158.f10011(var17, (SubLObject)module0680.ONE_INTEGER, var20);
                                SubLObject var22 = var18;
                                final SubLObject var23 = (SubLObject)module0680.NIL;
                                while (module0680.NIL == var22) {
                                    final SubLObject var24 = module0052.f3695(var21, var23);
                                    final SubLObject var25 = (SubLObject)SubLObjectFactory.makeBoolean(!var23.eql(var24));
                                    if (module0680.NIL != var25) {
                                        SubLObject var26 = (SubLObject)module0680.NIL;
                                        try {
                                            var26 = module0158.f10316(var24, (SubLObject)module0680.$ic39$, (SubLObject)module0680.$ic40$, (SubLObject)module0680.NIL);
                                            SubLObject var57_62 = var18;
                                            final SubLObject var58_63 = (SubLObject)module0680.NIL;
                                            while (module0680.NIL == var57_62) {
                                                final SubLObject var27 = module0052.f3695(var26, var58_63);
                                                final SubLObject var60_65 = (SubLObject)SubLObjectFactory.makeBoolean(!var58_63.eql(var27));
                                                if (module0680.NIL != var60_65) {
                                                    var19 = module0178.f11331(var27, (SubLObject)module0680.TWO_INTEGER);
                                                    if (!var19.eql(var15)) {
                                                        var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0680.NIL == module0259.f16854(var3, var19, (SubLObject)module0680.NIL, (SubLObject)module0680.UNPROVIDED));
                                                    }
                                                }
                                                var57_62 = (SubLObject)SubLObjectFactory.makeBoolean(module0680.NIL == var60_65 || module0680.NIL != var18);
                                            }
                                        }
                                        finally {
                                            final SubLObject var8_66 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0680.T, var4);
                                                if (module0680.NIL != var26) {
                                                    module0158.f10319(var26);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var8_66, var4);
                                            }
                                        }
                                    }
                                    var22 = (SubLObject)SubLObjectFactory.makeBoolean(module0680.NIL == var25 || module0680.NIL != var18);
                                }
                            }
                        }
                        if (module0680.NIL == var18) {
                            final SubLObject var28 = module0226.f14947(var12, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                            if (module0217.f14221(var17, (SubLObject)module0680.ONE_INTEGER, var28, (SubLObject)module0680.UNPROVIDED).numG((SubLObject)module0680.ZERO_INTEGER)) {
                                var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0680.NIL == var8);
                                SubLObject var29 = (SubLObject)module0680.NIL;
                                final SubLObject var30 = var28;
                                if (module0680.NIL != module0158.f10010(var17, (SubLObject)module0680.ONE_INTEGER, var30)) {
                                    final SubLObject var31 = module0158.f10011(var17, (SubLObject)module0680.ONE_INTEGER, var30);
                                    SubLObject var32 = var18;
                                    final SubLObject var33 = (SubLObject)module0680.NIL;
                                    while (module0680.NIL == var32) {
                                        final SubLObject var34 = module0052.f3695(var31, var33);
                                        final SubLObject var35 = (SubLObject)SubLObjectFactory.makeBoolean(!var33.eql(var34));
                                        if (module0680.NIL != var35) {
                                            SubLObject var36 = (SubLObject)module0680.NIL;
                                            try {
                                                var36 = module0158.f10316(var34, (SubLObject)module0680.$ic39$, (SubLObject)module0680.$ic40$, (SubLObject)module0680.NIL);
                                                SubLObject var57_63 = var18;
                                                final SubLObject var58_64 = (SubLObject)module0680.NIL;
                                                while (module0680.NIL == var57_63) {
                                                    final SubLObject var37 = module0052.f3695(var36, var58_64);
                                                    final SubLObject var60_66 = (SubLObject)SubLObjectFactory.makeBoolean(!var58_64.eql(var37));
                                                    if (module0680.NIL != var60_66) {
                                                        var29 = module0178.f11331(var37, (SubLObject)module0680.TWO_INTEGER);
                                                        var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0680.NIL == module0256.f16596(var3, var29, (SubLObject)module0680.NIL, (SubLObject)module0680.UNPROVIDED));
                                                    }
                                                    var57_63 = (SubLObject)SubLObjectFactory.makeBoolean(module0680.NIL == var60_66 || module0680.NIL != var18);
                                                }
                                            }
                                            finally {
                                                final SubLObject var8_67 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0680.T, var4);
                                                    if (module0680.NIL != var36) {
                                                        module0158.f10319(var36);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var8_67, var4);
                                                }
                                            }
                                        }
                                        var32 = (SubLObject)SubLObjectFactory.makeBoolean(module0680.NIL == var35 || module0680.NIL != var18);
                                    }
                                }
                            }
                        }
                        if (module0680.NIL == var18) {
                            var14 = (SubLObject)ConsesLow.cons(var17, var14);
                        }
                        var16_49 = var16_49.rest();
                        var17 = var16_49.first();
                    }
                    var16_48 = var16_48.rest();
                    var15 = var16_48.first();
                }
                if (module0680.NIL != var14) {
                    var14 = Sequences.nreverse(var14);
                    var5 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var12, var14), var5);
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var7, var4);
            module0147.$g2094$.rebind(var6, var4);
        }
        return Sequences.nreverse(var5);
    }
    
    public static SubLObject f41600(SubLObject var40) {
        if (var40 == module0680.UNPROVIDED) {
            var40 = (SubLObject)module0680.NIL;
        }
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0680.NIL == var40) {
            var40 = (SubLObject)module0680.$ic41$;
        }
        final SubLObject var42 = module0656.f39832((SubLObject)module0680.$ic22$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0680.$ic42$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
        if (module0680.NIL != var42) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            module0642.f39020(var42);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
        final SubLObject var43 = module0015.$g533$.currentBinding(var41);
        try {
            module0015.$g533$.bind((SubLObject)module0680.T, var41);
            module0642.f39019(var40);
        }
        finally {
            module0015.$g533$.rebind(var43, var41);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0680.NIL;
    }
    
    public static SubLObject f41601(SubLObject var1) {
        if (var1 == module0680.UNPROVIDED) {
            var1 = (SubLObject)module0680.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)module0680.$ic45$;
        final SubLObject var4 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0680.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0680.$ic4$);
            module0642.f39029((SubLObject)module0680.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var5 = module0014.f672((SubLObject)module0680.$ic5$);
            module0642.f39029((SubLObject)module0680.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            module0642.f39020((SubLObject)module0680.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            if (module0680.NIL != var5) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                module0642.f39020(var5);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            module0642.f39020((SubLObject)module0680.$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
            module0016.f941();
            if (module0680.NIL != var3) {
                module0642.f39029((SubLObject)module0680.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var3);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0680.UNPROVIDED);
            final SubLObject var8_72 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0680.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0680.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                module0642.f39020((SubLObject)module0680.$ic10$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                final SubLObject var8_73 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0680.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39020((SubLObject)module0680.$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                    final SubLObject var8_74 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0680.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020((SubLObject)module0680.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020((SubLObject)module0680.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39019((SubLObject)module0680.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_74, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0680.NIL != var3) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0680.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0680.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                    }
                    final SubLObject var6 = module0656.f39832((SubLObject)module0680.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39020((SubLObject)module0680.$ic46$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    if (module0680.NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                    final SubLObject var8_75 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0680.T, var2);
                        module0015.$g541$.bind((SubLObject)module0680.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069((SubLObject)module0680.$ic47$, (SubLObject)module0680.T, (SubLObject)module0680.UNPROVIDED);
                        module0656.f39870((SubLObject)module0680.$ic48$, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39074((SubLObject)module0680.$ic49$, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39032((SubLObject)module0680.THREE_INTEGER);
                        module0642.f39073((SubLObject)module0680.$ic50$);
                        module0642.f39026((SubLObject)module0680.UNPROVIDED);
                        SubLObject var9;
                        SubLObject var10;
                        for (var9 = (SubLObject)module0680.NIL, var9 = (SubLObject)module0680.ZERO_INTEGER; var9.numL((SubLObject)module0680.TWO_INTEGER); var9 = Numbers.add(var9, (SubLObject)module0680.ONE_INTEGER)) {
                            var10 = (SubLObject)ConsesLow.list((SubLObject)module0680.$ic51$, Sequences.cconcatenate((SubLObject)module0680.$ic52$, module0006.f203(var9)), (SubLObject)module0680.$ic53$, Sequences.cconcatenate((SubLObject)module0680.$ic54$, module0006.f205(var9)), (SubLObject)module0680.$ic55$, (SubLObject)module0680.$ic56$, (SubLObject)module0680.$ic57$, (SubLObject)module0680.ONE_INTEGER);
                            module0642.f39026((SubLObject)module0680.UNPROVIDED);
                            module0657.f40033((SubLObject)module0680.NIL, var10);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var2);
                        module0015.$g541$.rebind(var7, var2);
                        module0015.$g533$.rebind(var8_75, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0680.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var8_73, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0680.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var8_72, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0680.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var4, var2);
        }
        return (SubLObject)module0680.NIL;
    }
    
    public static SubLObject f41602(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0680.NIL;
        SubLObject var4;
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var4 = (SubLObject)module0680.NIL, var4 = (SubLObject)module0680.ZERO_INTEGER; var4.numL((SubLObject)module0680.TWO_INTEGER); var4 = Numbers.add(var4, (SubLObject)module0680.ONE_INTEGER)) {
            var5 = (SubLObject)ConsesLow.list((SubLObject)module0680.$ic51$, Sequences.cconcatenate((SubLObject)module0680.$ic52$, module0006.f203(var4)), (SubLObject)module0680.$ic59$, (SubLObject)module0680.T, (SubLObject)module0680.$ic60$, (SubLObject)module0680.T);
            var2.resetMultipleValues();
            var6 = module0657.f40035(var1, var5);
            var7 = var2.secondMultipleValue();
            var8 = var2.thirdMultipleValue();
            var2.resetMultipleValues();
            if (module0680.NIL != var7) {
                return module0657.f40039(var7, var8, (SubLObject)module0680.UNPROVIDED);
            }
            var3 = (SubLObject)ConsesLow.cons(var6, var3);
        }
        var3 = Sequences.nreverse(var3);
        final SubLObject var9 = f41603(var3);
        final SubLObject var10 = (SubLObject)module0680.$ic61$;
        final SubLObject var11 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0680.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0680.$ic4$);
            module0642.f39029((SubLObject)module0680.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var12 = module0014.f672((SubLObject)module0680.$ic5$);
            module0642.f39029((SubLObject)module0680.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            module0642.f39020((SubLObject)module0680.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            if (module0680.NIL != var12) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                module0642.f39020(var12);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            module0642.f39020((SubLObject)module0680.$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
            module0016.f941();
            if (module0680.NIL != var10) {
                module0642.f39029((SubLObject)module0680.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var10);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0680.UNPROVIDED);
            final SubLObject var8_84 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0680.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0680.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                module0642.f39020((SubLObject)module0680.$ic10$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                final SubLObject var8_85 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0680.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39020((SubLObject)module0680.$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                    final SubLObject var8_86 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0680.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020((SubLObject)module0680.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020((SubLObject)module0680.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39019((SubLObject)module0680.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_86, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0680.NIL != var10) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0680.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39019(var10);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0680.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                    final SubLObject var8_87 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0680.T, var2);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0680.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0680.UNPROVIDED);
                        final SubLObject var8_88 = module0015.$g533$.currentBinding(var2);
                        final SubLObject var13 = module0015.$g541$.currentBinding(var2);
                        final SubLObject var14 = module0015.$g539$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0680.T, var2);
                            module0015.$g541$.bind((SubLObject)module0680.T, var2);
                            module0015.$g539$.bind(module0015.f797(), var2);
                            module0656.f39870((SubLObject)module0680.$ic48$, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                            module0642.f39026((SubLObject)module0680.TWO_INTEGER);
                            module0642.f39021((SubLObject)module0680.$ic62$);
                            SubLObject var15 = var3;
                            SubLObject var16 = (SubLObject)module0680.NIL;
                            var16 = var15.first();
                            while (module0680.NIL != var15) {
                                module0642.f39032((SubLObject)module0680.TWO_INTEGER);
                                module0656.f39915(var16, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                                var15 = var15.rest();
                                var16 = var15.first();
                            }
                            module0642.f39026((SubLObject)module0680.UNPROVIDED);
                            module0642.f39011();
                            SubLObject var19;
                            for (SubLObject var17 = (SubLObject)module0680.NIL; module0680.NIL == var17; var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0680.NIL == var19)) {
                                var2.resetMultipleValues();
                                final SubLObject var18 = module0052.f3693(var9);
                                var19 = var2.secondMultipleValue();
                                var2.resetMultipleValues();
                                if (module0680.NIL != var19) {
                                    module0642.f39026((SubLObject)module0680.UNPROVIDED);
                                    module0656.f39837((SubLObject)module0680.$ic63$, var18, (SubLObject)module0680.$ic64$, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                                    module0642.f39032((SubLObject)module0680.UNPROVIDED);
                                    module0656.f39837((SubLObject)module0680.$ic65$, var18, (SubLObject)module0680.$ic66$, (SubLObject)module0680.$ic67$, (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
                                    module0642.f39032((SubLObject)module0680.UNPROVIDED);
                                    module0642.f39032((SubLObject)module0680.TWO_INTEGER);
                                    module0656.f39915(var18, (SubLObject)module0680.ZERO_INTEGER, (SubLObject)module0680.NIL);
                                    module0642.f39011();
                                }
                            }
                            module0015.f799(module0015.$g539$.getDynamicValue(var2));
                        }
                        finally {
                            module0015.$g539$.rebind(var14, var2);
                            module0015.$g541$.rebind(var13, var2);
                            module0015.$g533$.rebind(var8_88, var2);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var8_87, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    module0642.f39029((SubLObject)module0680.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var8_85, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0680.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var8_84, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0680.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var11, var2);
        }
        return (SubLObject)module0680.NIL;
    }
    
    public static SubLObject f41603(final SubLObject var79) {
        return module0310.f21108(var79, module0680.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0680.$ic69$, (SubLObject)module0680.THREE_INTEGER, (SubLObject)module0680.$ic70$, module0680.$ic71$));
    }
    
    public static SubLObject f41604() {
        final SubLObject var92 = module0680.$g5344$.getGlobalValue();
        if (module0680.NIL != var92) {
            module0034.f1818(var92);
        }
        return (SubLObject)module0680.NIL;
    }
    
    public static SubLObject f41605(final SubLObject var79) {
        return module0034.f1829(module0680.$g5344$.getGlobalValue(), (SubLObject)ConsesLow.list(var79), (SubLObject)module0680.UNPROVIDED, (SubLObject)module0680.UNPROVIDED);
    }
    
    public static SubLObject f41606(final SubLObject var79) {
        return module0310.f21102(var79, module0680.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0680.$ic73$, (SubLObject)module0680.$ic74$, (SubLObject)module0680.$ic69$, (SubLObject)module0680.TEN_INTEGER, (SubLObject)module0680.$ic70$, module0680.$ic71$));
    }
    
    public static SubLObject f41607(final SubLObject var79) {
        SubLObject var80 = module0680.$g5344$.getGlobalValue();
        if (module0680.NIL == var80) {
            var80 = module0034.f1934((SubLObject)module0680.$ic72$, (SubLObject)module0680.$ic75$, (SubLObject)module0680.TEN_INTEGER, (SubLObject)module0680.EQUAL, (SubLObject)module0680.ONE_INTEGER, (SubLObject)module0680.ZERO_INTEGER);
        }
        SubLObject var81 = module0034.f1814(var80, var79, (SubLObject)module0680.$ic76$);
        if (var81 == module0680.$ic76$) {
            var81 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f41606(var79)));
            module0034.f1816(var80, var79, var81, (SubLObject)module0680.UNPROVIDED);
        }
        return module0034.f1959(var81);
    }
    
    public static SubLObject f41608() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0680", "f41597", "CB-APPLICABLE-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0680", "f41599", "S#45587", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0680", "f41598", "S#45588", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0680", "f41600", "S#45589", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0680", "f41601", "CB-GAF-SUGGESTOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0680", "f41602", "CB-HANDLE-GAF-SUGGESTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0680", "f41603", "S#45590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0680", "f41604", "S#45591", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0680", "f41605", "S#45592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0680", "f41606", "S#45593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0680", "f41607", "S#45594", 1, 0, false);
        return (SubLObject)module0680.NIL;
    }
    
    public static SubLObject f41609() {
        module0680.$g5344$ = SubLFiles.deflexical("S#45595", (SubLObject)module0680.NIL);
        return (SubLObject)module0680.NIL;
    }
    
    public static SubLObject f41610() {
        Hashtables.sethash((SubLObject)module0680.$ic0$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0680.$ic1$, (SubLObject)module0680.NIL));
        module0015.f873((SubLObject)module0680.$ic30$);
        module0656.f39840((SubLObject)module0680.$ic33$, (SubLObject)module0680.$ic34$, (SubLObject)module0680.TWO_INTEGER);
        module0656.f39840((SubLObject)module0680.$ic43$, (SubLObject)module0680.$ic44$, (SubLObject)module0680.ONE_INTEGER);
        module0015.f873((SubLObject)module0680.$ic58$);
        module0015.f873((SubLObject)module0680.$ic68$);
        module0034.f1909((SubLObject)module0680.$ic72$);
        return (SubLObject)module0680.NIL;
    }
    
    public void declareFunctions() {
        f41608();
    }
    
    public void initializeVariables() {
        f41609();
    }
    
    public void runTopLevelForms() {
        f41610();
    }
    
    static {
        me = (SubLFile)new module0680();
        module0680.$g5344$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("CB-APPLICABLE-RELATIONS");
        $ic1$ = SubLObjectFactory.makeString("cb-applicable-relations.html");
        $ic2$ = SubLObjectFactory.makeString("Unable to determine a term from ~S");
        $ic3$ = SubLObjectFactory.makeString("Applicable Relations");
        $ic4$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic5$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic6$ = SubLObjectFactory.makeString("stylesheet");
        $ic7$ = SubLObjectFactory.makeString("text/css");
        $ic8$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic9$ = SubLObjectFactory.makeString("text/javascript");
        $ic10$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic11$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic12$ = SubLObjectFactory.makeString("button");
        $ic13$ = SubLObjectFactory.makeString("reload");
        $ic14$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic15$ = SubLObjectFactory.makeString("Relations which apply to ");
        $ic16$ = SubLObjectFactory.makeString(" : ");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#202", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43604", "CYC"));
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFunction"));
        $ic19$ = SubLObjectFactory.makeString("#dddddd");
        $ic20$ = SubLObjectFactory.makeKeyword("GAF-ARG-PREDICATE");
        $ic21$ = SubLObjectFactory.makeSymbol("S#44164", "CYC");
        $ic22$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic23$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic24$ = SubLObjectFactory.makeKeyword("NART-ARG-FUNCTION");
        $ic25$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic26$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic27$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLGenerationFunction"));
        $ic28$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic29$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic30$ = SubLObjectFactory.makeSymbol("CB-APPLICABLE-RELATIONS");
        $ic31$ = SubLObjectFactory.makeKeyword("CONTENT");
        $ic32$ = SubLObjectFactory.makeString("cb-applicable-relations&~A");
        $ic33$ = SubLObjectFactory.makeKeyword("APPLICABLE-RELATIONS");
        $ic34$ = SubLObjectFactory.makeSymbol("S#45587", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic36$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLReifiableDenotationalTerm"));
        $ic37$ = SubLObjectFactory.makeSymbol("<");
        $ic38$ = SubLObjectFactory.makeSymbol("SPEC-CARDINALITY");
        $ic39$ = SubLObjectFactory.makeKeyword("GAF");
        $ic40$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic41$ = SubLObjectFactory.makeString("[GAF Suggestor]");
        $ic42$ = SubLObjectFactory.makeString("cb-gaf-suggestor");
        $ic43$ = SubLObjectFactory.makeKeyword("GAF-SUGGESTOR");
        $ic44$ = SubLObjectFactory.makeSymbol("S#45589", "CYC");
        $ic45$ = SubLObjectFactory.makeString("GAF Suggestor");
        $ic46$ = SubLObjectFactory.makeString("post");
        $ic47$ = SubLObjectFactory.makeString("cb-handle-gaf-suggestor");
        $ic48$ = SubLObjectFactory.makeKeyword("CB-GAF-SUGGESTOR");
        $ic49$ = SubLObjectFactory.makeString("Suggest GAFs");
        $ic50$ = SubLObjectFactory.makeString("Clear");
        $ic51$ = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $ic52$ = SubLObjectFactory.makeString("term");
        $ic53$ = SubLObjectFactory.makeKeyword("PRETTY-NAME");
        $ic54$ = SubLObjectFactory.makeString("Term ");
        $ic55$ = SubLObjectFactory.makeKeyword("COMPLETE-LABEL");
        $ic56$ = SubLObjectFactory.makeString("Complete");
        $ic57$ = SubLObjectFactory.makeKeyword("HEIGHT");
        $ic58$ = SubLObjectFactory.makeSymbol("CB-GAF-SUGGESTOR");
        $ic59$ = SubLObjectFactory.makeKeyword("REQUIRED?");
        $ic60$ = SubLObjectFactory.makeKeyword("AUTO-CYCLIFY");
        $ic61$ = SubLObjectFactory.makeString("GAF Suggestions");
        $ic62$ = SubLObjectFactory.makeString("Terms :");
        $ic63$ = SubLObjectFactory.makeKeyword("SENTENCE-QUERY-SIMILAR");
        $ic64$ = SubLObjectFactory.makeString("[Query]");
        $ic65$ = SubLObjectFactory.makeKeyword("ASSERT-FORMULA");
        $ic66$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic67$ = SubLObjectFactory.makeString("[Assert]");
        $ic68$ = SubLObjectFactory.makeSymbol("CB-HANDLE-GAF-SUGGESTOR");
        $ic69$ = SubLObjectFactory.makeKeyword("USAGE-THRESHOLD");
        $ic70$ = SubLObjectFactory.makeKeyword("ISA-HORIZON");
        $ic71$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Individual"));
        $ic72$ = SubLObjectFactory.makeSymbol("S#45594", "CYC");
        $ic73$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic74$ = SubLObjectFactory.makeInteger(100);
        $ic75$ = SubLObjectFactory.makeSymbol("S#45595", "CYC");
        $ic76$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0680.class
	Total time: 809 ms
	
	Decompiled with Procyon 0.5.32.
*/