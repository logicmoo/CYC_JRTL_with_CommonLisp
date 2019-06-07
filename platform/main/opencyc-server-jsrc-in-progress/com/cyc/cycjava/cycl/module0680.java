package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        final SubLObject var3 = module0656.f39943(var1, (SubLObject)UNPROVIDED);
        if (NIL == module0173.f10955(var3)) {
            return module0656.f39789((SubLObject)$ic2$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var4 = f41598(var3);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)T;
        final SubLObject var7 = (SubLObject)$ic3$;
        final SubLObject var8 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var9 = module0014.f672((SubLObject)$ic5$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var9) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var9);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var7) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var7);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var8_10 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic10$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_11 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_12 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_12, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var7) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var7);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_13 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var10 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var11 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0015.$g541$.bind((SubLObject)T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0656.f39870((SubLObject)$ic0$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic15$);
                        module0656.f39915(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        SubLObject var12 = var4;
                        SubLObject var13 = (SubLObject)NIL;
                        var13 = var12.first();
                        while (NIL != var12) {
                            SubLObject var15;
                            final SubLObject var14 = var15 = var13;
                            SubLObject var16 = (SubLObject)NIL;
                            SubLObject var17 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic17$);
                            var16 = var15.first();
                            var15 = var15.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic17$);
                            var17 = var15.first();
                            var15 = var15.rest();
                            if (NIL == var15) {
                                var17 = module0213.f13926(Sequences.remove_duplicates(var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                if (NIL == module0018.$g715$.getDynamicValue(var2)) {
                                    SubLObject var16_22 = var17;
                                    SubLObject var18 = (SubLObject)NIL;
                                    var18 = var16_22.first();
                                    while (NIL != var16_22) {
                                        if (NIL == module0259.f16854(var18, $ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                            final SubLObject var19 = var18;
                                            if (NIL == conses_high.member(var19, var5, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                var5 = (SubLObject)ConsesLow.cons(var19, var5);
                                            }
                                        }
                                        var16_22 = var16_22.rest();
                                        var18 = var16_22.first();
                                    }
                                    var17 = Sequences.nreverse(var5);
                                }
                                if (NIL != module0018.$g716$.getDynamicValue(var2)) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    module0669.f40724(var16);
                                    module0642.f39020(module0015.$g346$.getGlobalValue());
                                    module0642.f39020(module0015.$g352$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)ZERO_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g353$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)FIVE_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g354$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)ZERO_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var8_14 = module0015.$g533$.currentBinding(var2);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var2);
                                        SubLObject var20 = (SubLObject)NIL;
                                        if (NIL == module0655.$g5111$.getDynamicValue(var2)) {
                                            var20 = module0015.$g493$.getGlobalValue();
                                        }
                                        SubLObject var21 = (SubLObject)NIL;
                                        SubLObject var22 = (SubLObject)NIL;
                                        SubLObject var23 = (SubLObject)NIL;
                                        SubLObject var24 = (SubLObject)NIL;
                                        var22 = var17;
                                        var23 = var22.first();
                                        for (var24 = (SubLObject)ZERO_INTEGER; NIL != var22; var22 = var22.rest(), var23 = var22.first(), var24 = Numbers.add((SubLObject)ONE_INTEGER, var24)) {
                                            if (NIL != module0655.$g5111$.getDynamicValue(var2)) {
                                                if (NIL != var21) {
                                                    var21 = (SubLObject)NIL;
                                                }
                                                else {
                                                    var21 = (SubLObject)T;
                                                }
                                                var20 = (SubLObject)((NIL != var21) ? $ic19$ : module0015.$g493$.getGlobalValue());
                                            }
                                            if (NIL != module0269.f17715(var23)) {
                                                module0659.f40117((SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)$ic22$, var3, var16, var23, $ic23$);
                                            }
                                            else if (NIL != module0269.f17723(var23)) {
                                                module0659.f40117((SubLObject)$ic24$, (SubLObject)$ic21$, (SubLObject)$ic22$, var3, var16, var23, $ic23$);
                                            }
                                            module0642.f39020(module0015.$g364$.getGlobalValue());
                                            if (NIL != var20) {
                                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                module0642.f39020(var20);
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            }
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var8_15 = module0015.$g533$.currentBinding(var2);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var2);
                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var8_16 = module0015.$g533$.currentBinding(var2);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var2);
                                                    module0656.f39915(var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    if (NIL != module0018.$g717$.getDynamicValue(var2)) {
                                                        module0642.f39026((SubLObject)UNPROVIDED);
                                                        module0642.f39032((SubLObject)FOUR_INTEGER);
                                                        final SubLObject var8_17 = module0147.$g2094$.currentBinding(var2);
                                                        final SubLObject var14_33 = module0147.$g2095$.currentBinding(var2);
                                                        try {
                                                            module0147.$g2094$.bind((SubLObject)$ic25$, var2);
                                                            module0147.$g2095$.bind($ic26$, var2);
                                                            if (NIL == module0259.f16854(var23, $ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0259.f16854(var23, $ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && (NIL != module0269.f17706(var23) || NIL != module0269.f17708(var23))) {
                                                                final SubLObject var25 = module0751.f47156(var23, (SubLObject)T);
                                                                module0035.f2044(var16, var3, var25);
                                                                SubLObject var26 = (SubLObject)NIL;
                                                                try {
                                                                    var2.throwStack.push($ic28$);
                                                                    final SubLObject var8_18 = Errors.$error_handler$.currentBinding(var2);
                                                                    try {
                                                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic29$), var2);
                                                                        try {
                                                                            module0642.f39019(module0770.f49049(var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                                                                        }
                                                                        catch (Throwable var27) {
                                                                            Errors.handleThrowable(var27, (SubLObject)NIL);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        Errors.$error_handler$.rebind(var8_18, var2);
                                                                    }
                                                                }
                                                                catch (Throwable var28) {
                                                                    var26 = Errors.handleThrowable(var28, (SubLObject)$ic28$);
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
                                            module0642.f39029((SubLObject)UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var8_14, var2);
                                    }
                                    module0642.f39020(module0015.$g347$.getGlobalValue());
                                }
                                else {
                                    if (NIL != var6) {
                                        var6 = (SubLObject)NIL;
                                    }
                                    else {
                                        module0642.f39026((SubLObject)UNPROVIDED);
                                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    module0669.f40724(var16);
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    SubLObject var16_23 = var17;
                                    SubLObject var18 = (SubLObject)NIL;
                                    var18 = var16_23.first();
                                    while (NIL != var16_23) {
                                        if (NIL != module0269.f17715(var18)) {
                                            module0659.f40117((SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)$ic22$, var3, var16, var18, $ic23$);
                                        }
                                        else if (NIL != module0269.f17723(var18)) {
                                            module0659.f40117((SubLObject)$ic24$, (SubLObject)$ic21$, (SubLObject)$ic22$, var3, var16, var18, $ic23$);
                                        }
                                        module0642.f39020(module0015.$g459$.getGlobalValue());
                                        module0656.f39915(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g460$.getGlobalValue());
                                        module0642.f39032((SubLObject)TWO_INTEGER);
                                        module0642.f39028((SubLObject)UNPROVIDED);
                                        module0642.f39032((SubLObject)TWO_INTEGER);
                                        var16_23 = var16_23.rest();
                                        var18 = var16_23.first();
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic17$);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var8_11, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var8_10, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var8, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41599(final SubLObject var3, SubLObject var40) {
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (NIL == var40) {
            var40 = (SubLObject)$ic3$;
        }
        final SubLObject var42 = module0656.f39832((SubLObject)$ic31$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var41), (SubLObject)$ic32$, module0656.f39842(var3));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var42) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var42);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var43 = module0015.$g533$.currentBinding(var41);
        try {
            module0015.$g533$.bind((SubLObject)T, var41);
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
        assert NIL != module0173.f10955(var3) : var3;
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)$ic25$, var4);
            module0147.$g2095$.bind($ic26$, var4);
            final SubLObject var8 = module0269.f17705(var3);
            final SubLObject var9 = module0256.f16531($ic36$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            SubLObject var10 = module0259.f16840(var3, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            var10 = conses_high.nunion(var10, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var10 = Sort.sort(var10, Symbols.symbol_function((SubLObject)$ic37$), Symbols.symbol_function((SubLObject)$ic38$));
            SubLObject var11 = module0146.$g1959$.getGlobalValue();
            SubLObject var12 = (SubLObject)NIL;
            var12 = var11.first();
            while (NIL != var11) {
                final SubLObject var13 = module0226.f14903(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var14 = (SubLObject)NIL;
                SubLObject var16_48 = var10;
                SubLObject var15 = (SubLObject)NIL;
                var15 = var16_48.first();
                while (NIL != var16_48) {
                    SubLObject var16_49;
                    final SubLObject var16 = var16_49 = module0220.f14562(var15, var13, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                    SubLObject var17 = (SubLObject)NIL;
                    var17 = var16_49.first();
                    while (NIL != var16_49) {
                        SubLObject var18 = (SubLObject)NIL;
                        if (module0217.f14221(var17, (SubLObject)ONE_INTEGER, var13, (SubLObject)UNPROVIDED).numG((SubLObject)ONE_INTEGER)) {
                            SubLObject var19 = (SubLObject)NIL;
                            final SubLObject var20 = var13;
                            if (NIL != module0158.f10010(var17, (SubLObject)ONE_INTEGER, var20)) {
                                final SubLObject var21 = module0158.f10011(var17, (SubLObject)ONE_INTEGER, var20);
                                SubLObject var22 = var18;
                                final SubLObject var23 = (SubLObject)NIL;
                                while (NIL == var22) {
                                    final SubLObject var24 = module0052.f3695(var21, var23);
                                    final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                                    if (NIL != var25) {
                                        SubLObject var26 = (SubLObject)NIL;
                                        try {
                                            var26 = module0158.f10316(var24, (SubLObject)$ic39$, (SubLObject)$ic40$, (SubLObject)NIL);
                                            SubLObject var57_62 = var18;
                                            final SubLObject var58_63 = (SubLObject)NIL;
                                            while (NIL == var57_62) {
                                                final SubLObject var27 = module0052.f3695(var26, var58_63);
                                                final SubLObject var60_65 = (SubLObject)makeBoolean(!var58_63.eql(var27));
                                                if (NIL != var60_65) {
                                                    var19 = module0178.f11331(var27, (SubLObject)TWO_INTEGER);
                                                    if (!var19.eql(var15)) {
                                                        var18 = (SubLObject)makeBoolean(NIL == module0259.f16854(var3, var19, (SubLObject)NIL, (SubLObject)UNPROVIDED));
                                                    }
                                                }
                                                var57_62 = (SubLObject)makeBoolean(NIL == var60_65 || NIL != var18);
                                            }
                                        }
                                        finally {
                                            final SubLObject var8_66 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                                                if (NIL != var26) {
                                                    module0158.f10319(var26);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var8_66, var4);
                                            }
                                        }
                                    }
                                    var22 = (SubLObject)makeBoolean(NIL == var25 || NIL != var18);
                                }
                            }
                        }
                        if (NIL == var18) {
                            final SubLObject var28 = module0226.f14947(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            if (module0217.f14221(var17, (SubLObject)ONE_INTEGER, var28, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                                var18 = (SubLObject)makeBoolean(NIL == var8);
                                SubLObject var29 = (SubLObject)NIL;
                                final SubLObject var30 = var28;
                                if (NIL != module0158.f10010(var17, (SubLObject)ONE_INTEGER, var30)) {
                                    final SubLObject var31 = module0158.f10011(var17, (SubLObject)ONE_INTEGER, var30);
                                    SubLObject var32 = var18;
                                    final SubLObject var33 = (SubLObject)NIL;
                                    while (NIL == var32) {
                                        final SubLObject var34 = module0052.f3695(var31, var33);
                                        final SubLObject var35 = (SubLObject)makeBoolean(!var33.eql(var34));
                                        if (NIL != var35) {
                                            SubLObject var36 = (SubLObject)NIL;
                                            try {
                                                var36 = module0158.f10316(var34, (SubLObject)$ic39$, (SubLObject)$ic40$, (SubLObject)NIL);
                                                SubLObject var57_63 = var18;
                                                final SubLObject var58_64 = (SubLObject)NIL;
                                                while (NIL == var57_63) {
                                                    final SubLObject var37 = module0052.f3695(var36, var58_64);
                                                    final SubLObject var60_66 = (SubLObject)makeBoolean(!var58_64.eql(var37));
                                                    if (NIL != var60_66) {
                                                        var29 = module0178.f11331(var37, (SubLObject)TWO_INTEGER);
                                                        var18 = (SubLObject)makeBoolean(NIL == module0256.f16596(var3, var29, (SubLObject)NIL, (SubLObject)UNPROVIDED));
                                                    }
                                                    var57_63 = (SubLObject)makeBoolean(NIL == var60_66 || NIL != var18);
                                                }
                                            }
                                            finally {
                                                final SubLObject var8_67 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var4);
                                                    if (NIL != var36) {
                                                        module0158.f10319(var36);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var8_67, var4);
                                                }
                                            }
                                        }
                                        var32 = (SubLObject)makeBoolean(NIL == var35 || NIL != var18);
                                    }
                                }
                            }
                        }
                        if (NIL == var18) {
                            var14 = (SubLObject)ConsesLow.cons(var17, var14);
                        }
                        var16_49 = var16_49.rest();
                        var17 = var16_49.first();
                    }
                    var16_48 = var16_48.rest();
                    var15 = var16_48.first();
                }
                if (NIL != var14) {
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
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (NIL == var40) {
            var40 = (SubLObject)$ic41$;
        }
        final SubLObject var42 = module0656.f39832((SubLObject)$ic22$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic42$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var42) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var42);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var43 = module0015.$g533$.currentBinding(var41);
        try {
            module0015.$g533$.bind((SubLObject)T, var41);
            module0642.f39019(var40);
        }
        finally {
            module0015.$g533$.rebind(var43, var41);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41601(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)$ic45$;
        final SubLObject var4 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var5 = module0014.f672((SubLObject)$ic5$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var5) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var5);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var3) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var3);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var8_72 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic10$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_73 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_74 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_74, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var3) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var6 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic46$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_75 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0015.$g541$.bind((SubLObject)T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069((SubLObject)$ic47$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39074((SubLObject)$ic49$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)THREE_INTEGER);
                        module0642.f39073((SubLObject)$ic50$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        SubLObject var9;
                        SubLObject var10;
                        for (var9 = (SubLObject)NIL, var9 = (SubLObject)ZERO_INTEGER; var9.numL((SubLObject)TWO_INTEGER); var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER)) {
                            var10 = (SubLObject)ConsesLow.list((SubLObject)$ic51$, Sequences.cconcatenate((SubLObject)$ic52$, module0006.f203(var9)), (SubLObject)$ic53$, Sequences.cconcatenate((SubLObject)$ic54$, module0006.f205(var9)), (SubLObject)$ic55$, (SubLObject)$ic56$, (SubLObject)$ic57$, (SubLObject)ONE_INTEGER);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0657.f40033((SubLObject)NIL, var10);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var2);
                        module0015.$g541$.rebind(var7, var2);
                        module0015.$g533$.rebind(var8_75, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var8_73, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var8_72, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var4, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41602(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4;
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var4 = (SubLObject)NIL, var4 = (SubLObject)ZERO_INTEGER; var4.numL((SubLObject)TWO_INTEGER); var4 = Numbers.add(var4, (SubLObject)ONE_INTEGER)) {
            var5 = (SubLObject)ConsesLow.list((SubLObject)$ic51$, Sequences.cconcatenate((SubLObject)$ic52$, module0006.f203(var4)), (SubLObject)$ic59$, (SubLObject)T, (SubLObject)$ic60$, (SubLObject)T);
            var2.resetMultipleValues();
            var6 = module0657.f40035(var1, var5);
            var7 = var2.secondMultipleValue();
            var8 = var2.thirdMultipleValue();
            var2.resetMultipleValues();
            if (NIL != var7) {
                return module0657.f40039(var7, var8, (SubLObject)UNPROVIDED);
            }
            var3 = (SubLObject)ConsesLow.cons(var6, var3);
        }
        var3 = Sequences.nreverse(var3);
        final SubLObject var9 = f41603(var3);
        final SubLObject var10 = (SubLObject)$ic61$;
        final SubLObject var11 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var12 = module0014.f672((SubLObject)$ic5$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var12) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var12);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var10) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var10);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var8_84 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic10$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_85 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_86 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_86, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var10) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var10);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_87 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var8_88 = module0015.$g533$.currentBinding(var2);
                        final SubLObject var13 = module0015.$g541$.currentBinding(var2);
                        final SubLObject var14 = module0015.$g539$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            module0015.$g541$.bind((SubLObject)T, var2);
                            module0015.$g539$.bind(module0015.f797(), var2);
                            module0656.f39870((SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39021((SubLObject)$ic62$);
                            SubLObject var15 = var3;
                            SubLObject var16 = (SubLObject)NIL;
                            var16 = var15.first();
                            while (NIL != var15) {
                                module0642.f39032((SubLObject)TWO_INTEGER);
                                module0656.f39915(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                var15 = var15.rest();
                                var16 = var15.first();
                            }
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39011();
                            SubLObject var19;
                            for (SubLObject var17 = (SubLObject)NIL; NIL == var17; var17 = (SubLObject)makeBoolean(NIL == var19)) {
                                var2.resetMultipleValues();
                                final SubLObject var18 = module0052.f3693(var9);
                                var19 = var2.secondMultipleValue();
                                var2.resetMultipleValues();
                                if (NIL != var19) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    module0656.f39837((SubLObject)$ic63$, var18, (SubLObject)$ic64$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39032((SubLObject)UNPROVIDED);
                                    module0656.f39837((SubLObject)$ic65$, var18, (SubLObject)$ic66$, (SubLObject)$ic67$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39032((SubLObject)UNPROVIDED);
                                    module0642.f39032((SubLObject)TWO_INTEGER);
                                    module0656.f39915(var18, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var8_85, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var8_84, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var11, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41603(final SubLObject var79) {
        return module0310.f21108(var79, $ic26$, (SubLObject)ConsesLow.list((SubLObject)$ic69$, (SubLObject)THREE_INTEGER, (SubLObject)$ic70$, $ic71$));
    }
    
    public static SubLObject f41604() {
        final SubLObject var92 = $g5344$.getGlobalValue();
        if (NIL != var92) {
            module0034.f1818(var92);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41605(final SubLObject var79) {
        return module0034.f1829($g5344$.getGlobalValue(), (SubLObject)ConsesLow.list(var79), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41606(final SubLObject var79) {
        return module0310.f21102(var79, $ic26$, (SubLObject)ConsesLow.list((SubLObject)$ic73$, (SubLObject)$ic74$, (SubLObject)$ic69$, (SubLObject)TEN_INTEGER, (SubLObject)$ic70$, $ic71$));
    }
    
    public static SubLObject f41607(final SubLObject var79) {
        SubLObject var80 = $g5344$.getGlobalValue();
        if (NIL == var80) {
            var80 = module0034.f1934((SubLObject)$ic72$, (SubLObject)$ic75$, (SubLObject)TEN_INTEGER, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var81 = module0034.f1814(var80, var79, (SubLObject)$ic76$);
        if (var81 == $ic76$) {
            var81 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f41606(var79)));
            module0034.f1816(var80, var79, var81, (SubLObject)UNPROVIDED);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41609() {
        $g5344$ = SubLFiles.deflexical("S#45595", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41610() {
        Hashtables.sethash((SubLObject)$ic0$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic30$);
        module0656.f39840((SubLObject)$ic33$, (SubLObject)$ic34$, (SubLObject)TWO_INTEGER);
        module0656.f39840((SubLObject)$ic43$, (SubLObject)$ic44$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic58$);
        module0015.f873((SubLObject)$ic68$);
        module0034.f1909((SubLObject)$ic72$);
        return (SubLObject)NIL;
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
        $g5344$ = null;
        $ic0$ = makeKeyword("CB-APPLICABLE-RELATIONS");
        $ic1$ = makeString("cb-applicable-relations.html");
        $ic2$ = makeString("Unable to determine a term from ~S");
        $ic3$ = makeString("Applicable Relations");
        $ic4$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic5$ = makeKeyword("CB-CYC");
        $ic6$ = makeString("stylesheet");
        $ic7$ = makeString("text/css");
        $ic8$ = makeKeyword("SHA1");
        $ic9$ = makeString("text/javascript");
        $ic10$ = makeString("yui-skin-sam");
        $ic11$ = makeString("reloadFrameButton");
        $ic12$ = makeString("button");
        $ic13$ = makeString("reload");
        $ic14$ = makeString("Refresh Frames");
        $ic15$ = makeString("Relations which apply to ");
        $ic16$ = makeString(" : ");
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("S#202", "CYC"), (SubLObject)makeSymbol("S#43604", "CYC"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("SkolemFunction"));
        $ic19$ = makeString("#dddddd");
        $ic20$ = makeKeyword("GAF-ARG-PREDICATE");
        $ic21$ = makeSymbol("S#44164", "CYC");
        $ic22$ = makeKeyword("MAIN");
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic24$ = makeKeyword("NART-ARG-FUNCTION");
        $ic25$ = makeSymbol("S#12274", "CYC");
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("NLGenerationFunction"));
        $ic28$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic29$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic30$ = makeSymbol("CB-APPLICABLE-RELATIONS");
        $ic31$ = makeKeyword("CONTENT");
        $ic32$ = makeString("cb-applicable-relations&~A");
        $ic33$ = makeKeyword("APPLICABLE-RELATIONS");
        $ic34$ = makeSymbol("S#45587", "CYC");
        $ic35$ = makeSymbol("FORT-P");
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("CycLReifiableDenotationalTerm"));
        $ic37$ = makeSymbol("<");
        $ic38$ = makeSymbol("SPEC-CARDINALITY");
        $ic39$ = makeKeyword("GAF");
        $ic40$ = makeKeyword("TRUE");
        $ic41$ = makeString("[GAF Suggestor]");
        $ic42$ = makeString("cb-gaf-suggestor");
        $ic43$ = makeKeyword("GAF-SUGGESTOR");
        $ic44$ = makeSymbol("S#45589", "CYC");
        $ic45$ = makeString("GAF Suggestor");
        $ic46$ = makeString("post");
        $ic47$ = makeString("cb-handle-gaf-suggestor");
        $ic48$ = makeKeyword("CB-GAF-SUGGESTOR");
        $ic49$ = makeString("Suggest GAFs");
        $ic50$ = makeString("Clear");
        $ic51$ = makeKeyword("INPUT-NAME");
        $ic52$ = makeString("term");
        $ic53$ = makeKeyword("PRETTY-NAME");
        $ic54$ = makeString("Term ");
        $ic55$ = makeKeyword("COMPLETE-LABEL");
        $ic56$ = makeString("Complete");
        $ic57$ = makeKeyword("HEIGHT");
        $ic58$ = makeSymbol("CB-GAF-SUGGESTOR");
        $ic59$ = makeKeyword("REQUIRED?");
        $ic60$ = makeKeyword("AUTO-CYCLIFY");
        $ic61$ = makeString("GAF Suggestions");
        $ic62$ = makeString("Terms :");
        $ic63$ = makeKeyword("SENTENCE-QUERY-SIMILAR");
        $ic64$ = makeString("[Query]");
        $ic65$ = makeKeyword("ASSERT-FORMULA");
        $ic66$ = makeKeyword("UNSPECIFIED");
        $ic67$ = makeString("[Assert]");
        $ic68$ = makeSymbol("CB-HANDLE-GAF-SUGGESTOR");
        $ic69$ = makeKeyword("USAGE-THRESHOLD");
        $ic70$ = makeKeyword("ISA-HORIZON");
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("Individual"));
        $ic72$ = makeSymbol("S#45594", "CYC");
        $ic73$ = makeKeyword("MAX-NUMBER");
        $ic74$ = makeInteger(100);
        $ic75$ = makeSymbol("S#45595", "CYC");
        $ic76$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 809 ms
	
	Decompiled with Procyon 0.5.32.
*/