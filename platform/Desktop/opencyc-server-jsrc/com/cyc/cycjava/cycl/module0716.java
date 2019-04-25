package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0716 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0716";
    public static final String myFingerPrint = "5b8f42c4887d30956244a867a1cb2c84d24315cc1267fed1296d5a450de0b915";
    private static SubLSymbol $g5674$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
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
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLInteger $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    
    public static SubLObject f43993(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (NIL != module0543.f33698()) {
            return module0667.f40583((SubLObject)$ic2$);
        }
        return f43994(module0665.f40432(var1));
    }
    
    public static SubLObject f43994(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = Symbols.symbol_function((SubLObject)$ic4$);
        final SubLObject var6 = Symbols.symbol_function((SubLObject)$ic5$);
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        if (NIL == module0665.f40419((SubLObject)$ic6$, var2)) {
            var7 = (SubLObject)T;
            module0665.f40421((SubLObject)$ic6$, var2, (SubLObject)$ic7$);
            module0665.f40421((SubLObject)$ic8$, var2, (SubLObject)$ic9$);
            module0665.f40421((SubLObject)$ic10$, var2, (SubLObject)$ic9$);
        }
        final SubLObject var9 = module0665.f40419((SubLObject)$ic11$, var2);
        final SubLObject var10 = module0665.f40419((SubLObject)$ic12$, var2);
        SubLObject var11 = (SubLObject)NIL;
        if (var9.isInteger() && var10.isInteger()) {
            final SubLObject var12 = module0361.f24195(var9, var10);
            if (NIL != inference_datastructures_inference_oc.f25275(var12)) {
                final SubLObject var13 = inference_datastructures_inference_oc.f25492(var12);
                if (NIL == module0065.f4772(var13, (SubLObject)$ic13$)) {
                    final SubLObject var14_15 = var13;
                    if (NIL == module0065.f4775(var14_15, (SubLObject)$ic13$)) {
                        final SubLObject var14 = module0065.f4740(var14_15);
                        final SubLObject var15 = (SubLObject)NIL;
                        SubLObject var16;
                        SubLObject var17;
                        SubLObject var18;
                        SubLObject var19;
                        SubLObject var20;
                        SubLObject var21;
                        SubLObject var22;
                        SubLObject var23;
                        SubLObject var24;
                        SubLObject var25;
                        SubLObject var22_29;
                        SubLObject var26;
                        SubLObject var27;
                        SubLObject var22_30;
                        SubLObject var28;
                        SubLObject var29;
                        for (var16 = Sequences.length(var14), var17 = (SubLObject)NIL, var17 = (SubLObject)ZERO_INTEGER; var17.numL(var16); var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER)) {
                            var18 = ((NIL != var15) ? Numbers.subtract(var16, var17, (SubLObject)ONE_INTEGER) : var17);
                            var19 = Vectors.aref(var14, var18);
                            if (NIL == module0065.f4749(var19) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                                if (NIL != module0065.f4749(var19)) {
                                    var19 = (SubLObject)$ic13$;
                                }
                                var20 = inference_datastructures_inference_oc.f25687(var19);
                                var21 = (SubLObject)NIL;
                                var21 = var20.first();
                                while (NIL != var20) {
                                    var22 = var21.rest();
                                    if (NIL != module0173.f10955(var22)) {
                                        var23 = var22;
                                        if (NIL == conses_high.member(var23, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                            var11 = (SubLObject)ConsesLow.cons(var23, var11);
                                        }
                                    }
                                    var20 = var20.rest();
                                    var21 = var20.first();
                                }
                                if (NIL != $g5674$.getDynamicValue(var3)) {
                                    var20 = inference_datastructures_inference_oc.f25744(var19);
                                    var24 = (SubLObject)NIL;
                                    var24 = var20.first();
                                    while (NIL != var20) {
                                        var25 = inference_datastructures_inference_oc.f25775(var24);
                                        var26 = (var22_29 = module0333.f22430(var25));
                                        var27 = (SubLObject)NIL;
                                        var27 = var22_29.first();
                                        while (NIL != var22_29) {
                                            if (NIL != assertion_handles_oc.f11035(var27)) {
                                                var27 = module0178.f11303(var27);
                                            }
                                            if (var27.isList()) {
                                                var22_30 = module0035.f2110((SubLObject)$ic14$, var27, (SubLObject)UNPROVIDED);
                                                var28 = (SubLObject)NIL;
                                                var28 = var22_30.first();
                                                while (NIL != var22_30) {
                                                    var29 = var28;
                                                    if (NIL == conses_high.member(var29, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                        var11 = (SubLObject)ConsesLow.cons(var29, var11);
                                                    }
                                                    var22_30 = var22_30.rest();
                                                    var28 = var22_30.first();
                                                }
                                            }
                                            var22_29 = var22_29.rest();
                                            var27 = var22_29.first();
                                        }
                                        var20 = var20.rest();
                                        var24 = var20.first();
                                    }
                                }
                            }
                        }
                    }
                    final SubLObject var32_33 = var13;
                    if (NIL == module0065.f4777(var32_33)) {
                        final SubLObject var30 = module0065.f4738(var32_33);
                        SubLObject var31 = (SubLObject)NIL;
                        SubLObject var32 = (SubLObject)NIL;
                        final Iterator var33 = Hashtables.getEntrySetIterator(var30);
                        try {
                            while (Hashtables.iteratorHasNext(var33)) {
                                final Map.Entry var34 = Hashtables.iteratorNextEntry(var33);
                                var31 = Hashtables.getEntryKey(var34);
                                var32 = Hashtables.getEntryValue(var34);
                                SubLObject var35 = inference_datastructures_inference_oc.f25687(var32);
                                SubLObject var36 = (SubLObject)NIL;
                                var36 = var35.first();
                                while (NIL != var35) {
                                    final SubLObject var37 = var36.rest();
                                    if (NIL != module0173.f10955(var37)) {
                                        final SubLObject var38 = var37;
                                        if (NIL == conses_high.member(var38, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                            var11 = (SubLObject)ConsesLow.cons(var38, var11);
                                        }
                                    }
                                    var35 = var35.rest();
                                    var36 = var35.first();
                                }
                                if (NIL != $g5674$.getDynamicValue(var3)) {
                                    var35 = inference_datastructures_inference_oc.f25744(var32);
                                    SubLObject var39 = (SubLObject)NIL;
                                    var39 = var35.first();
                                    while (NIL != var35) {
                                        final SubLObject var40 = inference_datastructures_inference_oc.f25775(var39);
                                        SubLObject var22_31;
                                        final SubLObject var41 = var22_31 = module0333.f22430(var40);
                                        SubLObject var42 = (SubLObject)NIL;
                                        var42 = var22_31.first();
                                        while (NIL != var22_31) {
                                            if (NIL != assertion_handles_oc.f11035(var42)) {
                                                var42 = module0178.f11303(var42);
                                            }
                                            if (var42.isList()) {
                                                SubLObject var22_32 = module0035.f2110((SubLObject)$ic14$, var42, (SubLObject)UNPROVIDED);
                                                SubLObject var43 = (SubLObject)NIL;
                                                var43 = var22_32.first();
                                                while (NIL != var22_32) {
                                                    final SubLObject var44 = var43;
                                                    if (NIL == conses_high.member(var44, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                        var11 = (SubLObject)ConsesLow.cons(var44, var11);
                                                    }
                                                    var22_32 = var22_32.rest();
                                                    var43 = var22_32.first();
                                                }
                                            }
                                            var22_31 = var22_31.rest();
                                            var42 = var22_31.first();
                                        }
                                        var35 = var35.rest();
                                        var39 = var35.first();
                                    }
                                }
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(var33);
                        }
                    }
                }
            }
        }
        if (NIL != var11) {
            module0665.f40421((SubLObject)$ic6$, var2, (SubLObject)$ic15$);
            module0665.f40421((SubLObject)$ic16$, var2, Sequences.length(var11));
            module0665.f40458(var2, (SubLObject)$ic15$, module0665.f40463(Sequences.length(var11)), var11, var5);
        }
        module0665.f40460(var2, (SubLObject)$ic7$, var4, var5, var6, $ic17$, (SubLObject)UNPROVIDED);
        final SubLObject var45 = (SubLObject)(module0665.f40419((SubLObject)$ic16$, var2).isInteger() ? Numbers.add((SubLObject)ONE_INTEGER, module0665.f40419((SubLObject)$ic16$, var2)) : TWO_INTEGER);
        module0665.f40462(var2, (SubLObject)$ic15$, module0665.f40463(var45), var4, var5, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var46 = (SubLObject)$ic18$;
        final SubLObject var47 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic19$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var48 = module0014.f672((SubLObject)$ic20$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var48) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var48);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var46) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var46);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var41_43 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic25$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var41_44 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic26$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var41_45 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic27$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic28$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic29$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var41_45, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var46) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var46);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0644.f39197();
                    final SubLObject var49 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic30$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var49) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var49);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var41_46 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var50 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var51 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic31$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic0$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0656.f39790((SubLObject)$ic32$, (SubLObject)$ic33$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39073((SubLObject)$ic34$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic35$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0665.f40437(var2, (SubLObject)$ic6$, (SubLObject)$ic7$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic36$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        final SubLObject var52 = (SubLObject)makeBoolean(NIL == var7 && $ic7$ == module0665.f40419((SubLObject)$ic6$, var2));
                        module0665.f40452(var2, (SubLObject)$ic7$, var4, var5, var52, (SubLObject)T, $ic17$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)ONE_INTEGER);
                        final SubLObject var53 = module0665.f40420((SubLObject)$ic15$, var2);
                        final SubLObject var54 = (SubLObject)((NIL == var7 && $ic15$ == module0665.f40419((SubLObject)$ic6$, var2)) ? ONE_INTEGER : ZERO_INTEGER);
                        module0665.f40437(var2, (SubLObject)$ic6$, (SubLObject)$ic15$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic37$);
                        module0665.f40441(var2, (SubLObject)$ic16$, Sequences.length(var53), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0665.f40461(var2, (SubLObject)$ic15$, module0665.f40463(Numbers.add((SubLObject)ONE_INTEGER, Sequences.length(var53))), var4, var5, var54, (SubLObject)ONE_INTEGER, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic38$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0665.f40436(var2, (SubLObject)$ic39$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic40$);
                        module0642.f39026((SubLObject)ONE_INTEGER);
                        if (NIL != module0665.f40419((SubLObject)$ic39$, var2) && NIL == module0665.f40419((SubLObject)$ic41$, var2)) {
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g219$.getGlobalValue());
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic42$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var41_47 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != module0015.$g495$.getGlobalValue()) {
                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var41_48 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39019((SubLObject)$ic43$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var41_48, var3);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var41_47, var3);
                            }
                            module0642.f39020(module0015.$g220$.getGlobalValue());
                            var8 = (SubLObject)T;
                        }
                        else {
                            module0642.f39032((SubLObject)TWO_INTEGER);
                        }
                        module0665.f40452(var2, (SubLObject)$ic41$, var4, var5, (SubLObject)NIL, (SubLObject)T, $ic44$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0665.f40436(var2, (SubLObject)$ic45$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic46$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        if (NIL != module0665.f40419((SubLObject)$ic45$, var2) && NIL != module0038.f2608(module0665.f40419((SubLObject)$ic47$, var2))) {
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g219$.getGlobalValue());
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic42$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var41_49 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != module0015.$g495$.getGlobalValue()) {
                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var41_50 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39019((SubLObject)$ic43$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var41_50, var3);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var41_49, var3);
                            }
                            module0642.f39020(module0015.$g220$.getGlobalValue());
                            var8 = (SubLObject)T;
                        }
                        else {
                            module0642.f39032((SubLObject)FOUR_INTEGER);
                        }
                        module0665.f40448(var2, (SubLObject)$ic47$, (SubLObject)$ic48$, (SubLObject)$ic49$, (SubLObject)$ic50$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0665.f40437(var2, (SubLObject)$ic10$, (SubLObject)$ic9$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic51$);
                        module0656.f39804($ic52$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic53$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0665.f40437(var2, (SubLObject)$ic10$, (SubLObject)$ic54$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic55$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        if ($ic54$ == module0665.f40419((SubLObject)$ic10$, var2) && NIL != module0038.f2608(module0665.f40419((SubLObject)$ic56$, var2))) {
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g219$.getGlobalValue());
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic42$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var41_51 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != module0015.$g495$.getGlobalValue()) {
                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var41_52 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39019((SubLObject)$ic43$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var41_52, var3);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var41_51, var3);
                            }
                            module0642.f39020(module0015.$g220$.getGlobalValue());
                            var8 = (SubLObject)T;
                        }
                        else {
                            module0642.f39032((SubLObject)FOUR_INTEGER);
                        }
                        module0665.f40448(var2, (SubLObject)$ic56$, (SubLObject)$ic48$, (SubLObject)$ic49$, (SubLObject)$ic50$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0665.f40437(var2, (SubLObject)$ic10$, (SubLObject)$ic57$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic58$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39019((SubLObject)$ic59$);
                        module0656.f39804($ic60$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic61$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0665.f40436(var2, (SubLObject)$ic62$, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic63$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0665.f40436(var2, (SubLObject)$ic62$, (SubLObject)$ic64$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic65$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0665.f40436(var2, (SubLObject)$ic62$, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic67$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0665.f40436(var2, (SubLObject)$ic68$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic69$);
                        module0656.f39804($ic70$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic71$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0665.f40436(var2, (SubLObject)$ic72$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic69$);
                        module0656.f39804($ic73$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic71$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0665.f40436(var2, (SubLObject)$ic74$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic69$);
                        module0656.f39804($ic75$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic71$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0665.f40437(var2, (SubLObject)$ic8$, (SubLObject)$ic9$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic76$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0665.f40437(var2, (SubLObject)$ic8$, (SubLObject)$ic77$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic78$);
                        module0656.f39804($ic79$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic80$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0665.f40437(var2, (SubLObject)$ic8$, (SubLObject)$ic57$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic81$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0665.f40436(var2, (SubLObject)$ic82$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic83$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0665.f40436(var2, (SubLObject)$ic84$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic85$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0665.f40436(var2, (SubLObject)$ic86$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic87$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        if (NIL == var8 && (($ic7$ == module0665.f40419((SubLObject)$ic6$, var2) && NIL != module0173.f10955(module0665.f40419((SubLObject)$ic7$, var2))) || ($ic15$ == module0665.f40419((SubLObject)$ic6$, var2) && NIL != module0035.sublisp_boolean(module0665.f40420((SubLObject)$ic15$, var2))))) {
                            module0665.f40445(var2, (SubLObject)$ic88$, (SubLObject)$ic89$, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0656.f39837((SubLObject)$ic90$, (SubLObject)$ic91$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (NIL == var7 || NIL != var8) {
                            module0642.f39020(module0015.$g219$.getGlobalValue());
                            if (NIL != module0015.$g495$.getGlobalValue()) {
                                module0642.f39020(module0015.$g222$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var41_53 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic92$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var41_53, var3);
                            }
                            module0642.f39020(module0015.$g220$.getGlobalValue());
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0665.f40445(var2, (SubLObject)$ic93$, (SubLObject)$ic89$, (SubLObject)UNPROVIDED);
                        }
                        else {
                            module0665.f40445(var2, (SubLObject)$ic94$, (SubLObject)$ic89$, (SubLObject)UNPROVIDED);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var51, var3);
                        module0015.$g541$.rebind(var50, var3);
                        module0015.$g533$.rebind(var41_46, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var41_44, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var41_43, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var47, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43995(final SubLObject var59, final SubLObject var2) {
        f43996(var2, var59, (SubLObject)$ic95$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43996(final SubLObject var2, final SubLObject var59, SubLObject var60) {
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)$ic95$;
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = (SubLObject)NIL;
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019(module0665.f40434(var2, var60));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var62) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var62);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var61), (SubLObject)$ic97$);
        module0655.f39768();
        module0642.f39019(module0665.f40434(var2, var60));
        PrintLow.format(module0015.$g131$.getDynamicValue(var61), (SubLObject)$ic98$);
        PrintLow.format(module0015.$g131$.getDynamicValue(var61), (SubLObject)$ic100$);
        PrintLow.format(module0015.$g131$.getDynamicValue(var61), (SubLObject)$ic101$, (SubLObject)$ic48$);
        PrintLow.format(module0015.$g131$.getDynamicValue(var61), (SubLObject)$ic102$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var63 = module0015.$g533$.currentBinding(var61);
        try {
            module0015.$g533$.bind((SubLObject)T, var61);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39019(var59);
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var63, var61);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43997(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0665.f40432(var1);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL != module0665.f40419((SubLObject)$ic105$, var3)) {
            var4 = conses_high.putf(var4, (SubLObject)$ic105$, module0665.f40419((SubLObject)$ic105$, var3));
        }
        if (NIL != module0665.f40420((SubLObject)$ic62$, var3)) {
            var4 = conses_high.putf(var4, (SubLObject)$ic62$, module0665.f40420((SubLObject)$ic62$, var3));
        }
        if (NIL != module0665.f40419((SubLObject)$ic39$, var3)) {
            var4 = conses_high.putf(var4, (SubLObject)$ic41$, module0665.f40419((SubLObject)$ic41$, var3));
        }
        if (NIL != module0665.f40419((SubLObject)$ic45$, var3)) {
            var4 = conses_high.putf(var4, (SubLObject)$ic47$, module0665.f40419((SubLObject)$ic47$, var3));
        }
        if ($ic57$ == module0665.f40419((SubLObject)$ic10$, var3)) {
            var4 = conses_high.putf(var4, (SubLObject)$ic106$, (SubLObject)$ic107$);
        }
        if ($ic54$ == module0665.f40419((SubLObject)$ic10$, var3)) {
            var4 = conses_high.putf(var4, (SubLObject)$ic106$, module0665.f40419((SubLObject)$ic56$, var3));
        }
        if (NIL != module0665.f40419((SubLObject)$ic68$, var3)) {
            var4 = conses_high.putf(var4, (SubLObject)$ic68$, (SubLObject)T);
        }
        if (NIL != module0665.f40419((SubLObject)$ic72$, var3)) {
            var4 = conses_high.putf(var4, (SubLObject)$ic72$, (SubLObject)T);
        }
        if (NIL != module0665.f40419((SubLObject)$ic74$, var3)) {
            var4 = conses_high.putf(var4, (SubLObject)$ic74$, (SubLObject)T);
        }
        var4 = conses_high.putf(var4, (SubLObject)$ic8$, module0665.f40419((SubLObject)$ic8$, var3));
        if (NIL != module0665.f40419((SubLObject)$ic82$, var3)) {
            var4 = conses_high.putf(var4, (SubLObject)$ic82$, (SubLObject)T);
        }
        if (NIL != module0665.f40419((SubLObject)$ic84$, var3)) {
            var4 = conses_high.putf(var4, (SubLObject)$ic84$, (SubLObject)T);
        }
        if ($ic7$ == module0665.f40419((SubLObject)$ic6$, var3) && NIL != module0173.f10955(module0665.f40419((SubLObject)$ic7$, var3))) {
            module0714.f43869(module0665.f40419((SubLObject)$ic7$, var3), module0015.$g131$.getDynamicValue(var2), var4);
        }
        else if ($ic15$ == module0665.f40419((SubLObject)$ic6$, var3) && NIL != module0035.sublisp_boolean(module0665.f40420((SubLObject)$ic15$, var3))) {
            if (NIL != module0665.f40419((SubLObject)$ic86$, var3)) {
                module0712.f43691(module0665.f40420((SubLObject)$ic15$, var3), module0015.$g131$.getDynamicValue(var2), (SubLObject)UNPROVIDED);
            }
            else {
                module0714.f43871(module0665.f40420((SubLObject)$ic15$, var3), module0015.$g131$.getDynamicValue(var2), var4);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43998(final SubLObject var12, SubLObject var59) {
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL == var59) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            var59 = (SubLObject)$ic108$;
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var12) : var12;
        final SubLObject var61 = module0665.f40432((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic110$, module0006.f202(module0361.f23996(inference_datastructures_inference_oc.f25421(var12)))), (SubLObject)ConsesLow.list((SubLObject)$ic111$, module0006.f202(inference_datastructures_inference_oc.f25422(var12)))));
        final SubLObject var62 = module0665.f40434(var61, (SubLObject)$ic31$);
        final SubLObject var63 = module0656.f39832((SubLObject)$ic32$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019(var62);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var63) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var63);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var64 = module0015.$g533$.currentBinding(var60);
        try {
            module0015.$g533$.bind((SubLObject)T, var60);
            module0642.f39019(var59);
        }
        finally {
            module0015.$g533$.rebind(var64, var60);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43999() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0716", "f43993", "CB-OWL-EXPORT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0716", "f43994", "S#48172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0716", "f43995", "S#48173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0716", "f43996", "S#48174", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0716", "f43997", "CB-OWL-EXPORT-XML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0716", "f43998", "S#48175", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44000() {
        $g5674$ = SubLFiles.defparameter("S#48176", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44001() {
        Hashtables.sethash((SubLObject)$ic0$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic3$);
        module0656.f39840((SubLObject)$ic90$, (SubLObject)$ic96$, (SubLObject)TWO_INTEGER);
        module0015.f877((SubLObject)$ic103$, (SubLObject)$ic104$);
        module0015.f873((SubLObject)$ic103$);
        module0656.f39840((SubLObject)$ic112$, (SubLObject)$ic113$, (SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f43999();
    }
    
    public void initializeVariables() {
        f44000();
    }
    
    public void runTopLevelForms() {
        f44001();
    }
    
    static {
        me = (SubLFile)new module0716();
        $g5674$ = null;
        $ic0$ = makeKeyword("CB-CYCL-TO-OWL");
        $ic1$ = makeString("cb-cycl-to-owl.html");
        $ic2$ = makeString("OWL Exporter");
        $ic3$ = makeSymbol("CB-OWL-EXPORT");
        $ic4$ = makeSymbol("S#3971", "CYC");
        $ic5$ = makeSymbol("S#44216", "CYC");
        $ic6$ = makeKeyword("TYPE");
        $ic7$ = makeKeyword("ONTOLOGY");
        $ic8$ = makeKeyword("PREFER-URIS");
        $ic9$ = makeKeyword("DEFAULT");
        $ic10$ = makeKeyword("OVERRIDE-ONTOLOGY-BASE-URI");
        $ic11$ = makeKeyword("STORE-ID");
        $ic12$ = makeKeyword("INFERENCE-ID");
        $ic13$ = makeKeyword("SKIP");
        $ic14$ = makeSymbol("FORT-P");
        $ic15$ = makeKeyword("TERMS");
        $ic16$ = makeKeyword("TERMS-COUNT");
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("Ontology"));
        $ic18$ = makeString("Export an OWL ontology");
        $ic19$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic20$ = makeKeyword("CB-CYC");
        $ic21$ = makeString("stylesheet");
        $ic22$ = makeString("text/css");
        $ic23$ = makeKeyword("SHA1");
        $ic24$ = makeString("text/javascript");
        $ic25$ = makeString("yui-skin-sam");
        $ic26$ = makeString("reloadFrameButton");
        $ic27$ = makeString("button");
        $ic28$ = makeString("reload");
        $ic29$ = makeString("Refresh Frames");
        $ic30$ = makeString("post");
        $ic31$ = makeString("cb-owl-export");
        $ic32$ = makeKeyword("SELF");
        $ic33$ = makeString("Back");
        $ic34$ = makeString("Clear");
        $ic35$ = makeString("Choose the method for determining the terms to export:");
        $ic36$ = makeString("Export an ontology defined in Cyc :");
        $ic37$ = makeString("Export a list of terms:");
        $ic38$ = makeString("Choose export options:");
        $ic39$ = makeKeyword("OVERRIDE-ONTOLOGY-MT");
        $ic40$ = makeString("Override the ontology microtheory");
        $ic41$ = makeKeyword("ONTOLOGY-MT");
        $ic42$ = makeString("+2");
        $ic43$ = makeString("*");
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("Microtheory"));
        $ic45$ = makeKeyword("OVERRIDE-ONTOLOGY-URI");
        $ic46$ = makeString("Override the ontology URI");
        $ic47$ = makeKeyword("ONTOLOGY-URI");
        $ic48$ = makeString("");
        $ic49$ = makeInteger(40);
        $ic50$ = makeKeyword("STRING");
        $ic51$ = makeString("(Default) Use the ontology Base URI (from the ");
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("baseNamespaceForSKS"));
        $ic53$ = makeString(" assertion)");
        $ic54$ = makeKeyword("CUSTOM");
        $ic55$ = makeString("Override the ontology Base URI");
        $ic56$ = makeKeyword("ONTOLOGY-BASE-URI");
        $ic57$ = makeKeyword("OPENCYC");
        $ic58$ = makeString("Use OpenCyc as the Base URI");
        $ic59$ = makeString("Add these URIs as ");
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("owl:sameAs"));
        $ic61$ = makeString(" triples:");
        $ic62$ = makeKeyword("SAME-AS-URIS");
        $ic63$ = makeString(" Readable OpenCyc URIs (when applicable)");
        $ic64$ = makeKeyword("CYC");
        $ic65$ = makeString(" Cyc Compact External ID URIs");
        $ic66$ = makeKeyword("DBPEDIA");
        $ic67$ = makeString(" DBpedia URIs (when applicable)");
        $ic68$ = makeKeyword("ADD-COMMENTS");
        $ic69$ = makeString("Add ");
        $ic70$ = constant_handles_oc.f8479((SubLObject)makeString("comment"));
        $ic71$ = makeString(" triples");
        $ic72$ = makeKeyword("ADD-PRETTY-STRINGS");
        $ic73$ = constant_handles_oc.f8479((SubLObject)makeString("prettyString"));
        $ic74$ = makeKeyword("ADD-PRETTY-STRING-CANONICAL");
        $ic75$ = constant_handles_oc.f8479((SubLObject)makeString("prettyString-Canonical"));
        $ic76$ = makeString("(Default) Prefer the ontology URIs ");
        $ic77$ = makeKeyword("SYNONYMOUS-EXTERNAL-CONCEPT");
        $ic78$ = makeString("Prefer ");
        $ic79$ = constant_handles_oc.f8479((SubLObject)makeString("synonymousExternalConcept"));
        $ic80$ = makeString(" URIs over the ontology URIs");
        $ic81$ = makeString("Prefer OpenCyc URIs over the ontology URIs");
        $ic82$ = makeKeyword("RESTRICT-CONTEXT?");
        $ic83$ = makeString("Restrict export to only assertions in the ontology microtheory");
        $ic84$ = makeKeyword("SUPPRESS-EXPORT-OF-DERIVED-KNOWLEDGE?");
        $ic85$ = makeString("Suppress export of derived knowledge");
        $ic86$ = makeKeyword("LEGACY-EXPORT");
        $ic87$ = makeString("Use legacy exporter (List of terms only; does not support above options)");
        $ic88$ = makeString("Rebuild Export Link");
        $ic89$ = makeKeyword("EXPORT");
        $ic90$ = makeKeyword("CB-OWL-EXPORT-XML");
        $ic91$ = makeString("Download Export");
        $ic92$ = makeString("Please fill out the starred fields");
        $ic93$ = makeString("Retry Get Export Link");
        $ic94$ = makeString("Get Export Link");
        $ic95$ = makeString("cb-owl-export-xml");
        $ic96$ = makeSymbol("S#48173", "CYC");
        $ic97$ = makeString("window.open('");
        $ic98$ = makeString("',");
        $ic99$ = makeString("'~A'");
        $ic100$ = makeString("null");
        $ic101$ = makeString(",'~A'); ");
        $ic102$ = makeString("return false;");
        $ic103$ = makeSymbol("CB-OWL-EXPORT-XML");
        $ic104$ = makeString("text/xml");
        $ic105$ = makeKeyword("PREFER-OPENCYC-URIS");
        $ic106$ = makeKeyword("BASE-URI");
        $ic107$ = makeString("http://sw.opencyc.org/2009/04/07/concept/en");
        $ic108$ = makeString("[OWL Export]");
        $ic109$ = makeSymbol("INFERENCE-P");
        $ic110$ = makeString(":.store-id");
        $ic111$ = makeString(":.inference-id");
        $ic112$ = makeKeyword("CB-OWL-EXPORT-INFERENCE-ANSWERS");
        $ic113$ = makeSymbol("S#48175", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 884 ms
	
	Decompiled with Procyon 0.5.32.
*/