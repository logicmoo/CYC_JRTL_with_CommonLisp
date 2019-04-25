package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0431 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0431";
    public static final String myFingerPrint = "6dbd3f02d8302c3e5fc2393c02078f6537475f084e4c4d8499b30fe729948178";
    public static SubLSymbol $g3507$;
    private static SubLSymbol $g3508$;
    public static SubLSymbol $g3509$;
    private static SubLSymbol $g3510$;
    private static SubLSymbol $g3511$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLList $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLList $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLInteger $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLInteger $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    
    public static SubLObject f30442(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isCons() && $ic1$ == var1.first());
    }
    
    public static SubLObject f30443(final SubLObject var1) {
        assert NIL != f30442(var1) : var1;
        return conses_high.second(var1);
    }
    
    public static SubLObject f30444(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f30442(var1) || (NIL != constant_handles_oc.f8449(var1) && NIL != module0269.f17710(var1)));
    }
    
    public static SubLObject f30445(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != f30444(var1) : var1;
        if (NIL != f30442(var1)) {
            return (SubLObject)ConsesLow.list(f30443(var1));
        }
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0147.f9540($ic5$);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        final SubLObject var6 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var7 = module0147.$g2096$.currentBinding(var2);
        try {
            module0147.$g2095$.bind(module0147.f9545(var4), var2);
            module0147.$g2094$.bind(module0147.f9546(var4), var2);
            module0147.$g2096$.bind(module0147.f9549(var4), var2);
            var3 = Sequences.remove_if((SubLObject)$ic6$, module0259.f16848(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var7, var2);
            module0147.$g2094$.rebind(var6, var2);
            module0147.$g2095$.rebind(var5, var2);
        }
        return var3;
    }
    
    public static SubLObject f30446(final SubLObject var8) {
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = Time.get_internal_real_time();
        var9 = module0540.f33516((SubLObject)ConsesLow.listS($ic7$, var8, (SubLObject)$ic8$), (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
        var10 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var11), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(var9, var10);
    }
    
    public static SubLObject f30447(final SubLObject var8) {
        return module0540.f33518((SubLObject)ConsesLow.listS($ic7$, var8, (SubLObject)$ic8$), (SubLObject)$ic9$);
    }
    
    public static SubLObject f30448(final SubLObject var8) {
        return module0347.f23344((SubLObject)$ic10$, (SubLObject)ConsesLow.list($ic11$, (SubLObject)$ic10$, module0172.f10921((SubLObject)$ic12$), (SubLObject)ConsesLow.list($ic13$, var8)), $ic14$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30449(final SubLObject var12) {
        final SubLObject var13 = module0409.f28506((SubLObject)ConsesLow.listS($ic15$, (SubLObject)ConsesLow.list($ic16$, var12), (SubLObject)$ic17$), $ic18$, (SubLObject)$ic19$);
        if (NIL != var13) {
            return var13.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30450(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = module0018.$g739$.currentBinding(var13);
        try {
            module0018.$g739$.bind((SubLObject)NIL, var13);
            var14 = module0424.f29713(var12, $g3510$.getGlobalValue(), (SubLObject)$ic22$, (SubLObject)NIL, (SubLObject)T);
        }
        finally {
            module0018.$g739$.rebind(var15, var13);
        }
        return var14;
    }
    
    public static SubLObject f30451(final SubLObject var14) {
        final SubLObject var15 = module0424.f29795(var14);
        final SubLObject var16 = module0424.f29678(var15);
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = var16;
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            var17 = (SubLObject)ConsesLow.cons(conses_high.getf(var21, (SubLObject)$ic23$, (SubLObject)UNPROVIDED), var17);
            var18 = (SubLObject)ConsesLow.cons(conses_high.getf(var21, (SubLObject)$ic24$, (SubLObject)UNPROVIDED), var18);
            var19 = (SubLObject)ConsesLow.cons(conses_high.getf(var21, (SubLObject)$ic25$, (SubLObject)UNPROVIDED), var19);
            var20 = var20.rest();
            var21 = var20.first();
        }
        return Values.values(var17, var18, var19);
    }
    
    public static SubLObject f30452(final SubLObject var8, final SubLObject var22, final SubLObject var23, final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        f30453(var8, (SubLObject)ConsesLow.list((SubLObject)$ic26$, var8), var22);
        var25.resetMultipleValues();
        final SubLObject var26 = f30446(var8);
        final SubLObject var27 = var25.secondMultipleValue();
        var25.resetMultipleValues();
        if (NIL == var26) {
            Errors.warn((SubLObject)$ic27$);
            return (SubLObject)NIL;
        }
        f30453(var8, (SubLObject)ConsesLow.list((SubLObject)$ic23$, var27), var22);
        final SubLObject var28 = f30448(var8);
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = var28;
        SubLObject var33 = (SubLObject)NIL;
        var33 = var32.first();
        while (NIL != var32) {
            var30 = f30450(var33);
            var31 = (SubLObject)ConsesLow.cons(var30, var31);
            module0424.f29758(var30, var24);
            var32 = var32.rest();
            var33 = var32.first();
        }
        final SubLObject var34 = Sequences.length(var31);
        final SubLObject var35 = f30454(var31);
        final SubLObject var36 = f30455(var31);
        final SubLObject var37 = Sequences.length(var35);
        final SubLObject var38 = Sequences.length(var36);
        final SubLObject var39 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic28$, var37, var38);
        var29 = conses_high.putf(var29, (SubLObject)$ic26$, var8);
        var29 = conses_high.putf(var29, (SubLObject)$ic23$, var27);
        var29 = conses_high.putf(var29, (SubLObject)$ic29$, var34);
        var29 = conses_high.putf(var29, (SubLObject)$ic24$, var37);
        var29 = conses_high.putf(var29, (SubLObject)$ic25$, var38);
        module0424.f29758(var29, var23);
        f30453(var8, (SubLObject)ConsesLow.list((SubLObject)$ic29$, var34), var22);
        f30453(var8, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var39), var22);
        f30453(var8, (SubLObject)ConsesLow.list((SubLObject)$ic24$, var35), var22);
        f30453(var8, (SubLObject)ConsesLow.list((SubLObject)$ic25$, var36), var22);
        f30447(var8);
        return var8;
    }
    
    public static SubLObject f30456(SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != f30442(var1)) {
            var1 = f30443(var1);
        }
        final SubLObject var3 = Time.get_universal_time();
        final SubLObject var4 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic31$, new SubLObject[] { $g3508$.getDynamicValue(var2), constants_high_oc.f10743(var1), var3 });
        f30457(var1, var4, var3);
        $g3509$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic32$, constants_high_oc.f10743(var1), var3), var2);
        return var4;
    }
    
    public static SubLObject f30458(final SubLObject var39, final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var42 = module0015.$g533$.currentBinding(var41);
        try {
            module0015.$g533$.bind((SubLObject)T, var41);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_41 = module0015.$g533$.currentBinding(var41);
            try {
                module0015.$g533$.bind((SubLObject)T, var41);
                module0642.f39021(var39);
            }
            finally {
                module0015.$g533$.rebind(var5_41, var41);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_42 = module0015.$g533$.currentBinding(var41);
            try {
                module0015.$g533$.bind((SubLObject)T, var41);
                PrintLow.format(module0015.$g131$.getDynamicValue(var41), (SubLObject)$ic33$, var40);
            }
            finally {
                module0015.$g533$.rebind(var5_42, var41);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var42, var41);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return var40;
    }
    
    public static SubLObject f30459(final SubLObject var39, final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var42 = module0015.$g533$.currentBinding(var41);
        try {
            module0015.$g533$.bind((SubLObject)T, var41);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_43 = module0015.$g533$.currentBinding(var41);
            try {
                module0015.$g533$.bind((SubLObject)T, var41);
                module0642.f39019(var39);
            }
            finally {
                module0015.$g533$.rebind(var5_43, var41);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_44 = module0015.$g533$.currentBinding(var41);
            try {
                module0015.$g533$.bind((SubLObject)T, var41);
                PrintLow.format(module0015.$g131$.getDynamicValue(var41), (SubLObject)$ic33$, var40);
            }
            finally {
                module0015.$g533$.rebind(var5_44, var41);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var42, var41);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return var40;
    }
    
    public static SubLObject f30457(final SubLObject var1, final SubLObject var22, final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        SubLObject var47 = (SubLObject)NIL;
        try {
            var47 = compatibility.open_text(var22, (SubLObject)$ic34$);
            if (!var47.isStream()) {
                Errors.error((SubLObject)$ic35$, var22);
            }
            final SubLObject var47_48 = var47;
            final SubLObject var48 = module0015.$g131$.currentBinding(var46);
            try {
                module0015.$g131$.bind(var47_48, var46);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_49 = module0015.$g533$.currentBinding(var46);
                try {
                    module0015.$g533$.bind((SubLObject)T, var46);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_50 = module0015.$g533$.currentBinding(var46);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var46);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_51 = module0015.$g533$.currentBinding(var46);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var46);
                            module0642.f39021((SubLObject)$ic36$);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_51, var46);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_52 = module0015.$g533$.currentBinding(var46);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var46);
                            module0656.f39800(module0051.f3557(var45, (SubLObject)UNPROVIDED));
                        }
                        finally {
                            module0015.$g533$.rebind(var5_52, var46);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_50, var46);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    f30458((SubLObject)$ic37$, module0018.f971());
                    f30458((SubLObject)$ic38$, module0011.f351());
                    f30458((SubLObject)$ic39$, var1);
                }
                finally {
                    module0015.$g533$.rebind(var5_49, var46);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
            finally {
                module0015.$g131$.rebind(var48, var46);
            }
        }
        finally {
            final SubLObject var49 = Threads.$is_thread_performing_cleanupP$.currentBinding(var46);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var46);
                if (var47.isStream()) {
                    streams_high.close(var47, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var49, var46);
            }
        }
        return var1;
    }
    
    public static SubLObject f30453(final SubLObject var8, final SubLObject var53, final SubLObject var22) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        SubLObject var55 = (SubLObject)NIL;
        try {
            var55 = compatibility.open_text(var22, (SubLObject)$ic40$);
            if (!var55.isStream()) {
                Errors.error((SubLObject)$ic35$, var22);
            }
            final SubLObject var47_55 = var55;
            final SubLObject var56 = module0015.$g131$.currentBinding(var54);
            try {
                module0015.$g131$.bind(var47_55, var54);
                SubLObject var57;
                SubLObject var58;
                SubLObject var59;
                SubLObject var60;
                SubLObject var61;
                SubLObject var62;
                SubLObject var63;
                SubLObject var64;
                for (var57 = (SubLObject)NIL, var57 = var53; NIL != var57; var57 = conses_high.cddr(var57)) {
                    var58 = var57.first();
                    var59 = conses_high.cadr(var57);
                    var60 = var58;
                    if (var60.eql((SubLObject)$ic26$)) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39013((SubLObject)$ic41$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39021((SubLObject)$ic42$);
                        module0642.f39031((SubLObject)EIGHTEEN_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        PrintLow.format(module0015.$g131$.getDynamicValue(var54), (SubLObject)$ic33$, var59);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39011();
                    }
                    else if (var60.eql((SubLObject)$ic23$)) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic43$);
                        module0642.f39031((SubLObject)EIGHT_INTEGER);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var54), (SubLObject)$ic33$, var59);
                        module0642.f39011();
                    }
                    else if (var60.eql((SubLObject)$ic29$)) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic44$);
                        module0642.f39031((SubLObject)FOUR_INTEGER);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var54), (SubLObject)$ic33$, var59);
                    }
                    else if (var60.eql((SubLObject)$ic30$)) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var54), (SubLObject)$ic45$, var59);
                    }
                    else if (var60.eql((SubLObject)$ic24$)) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39013((SubLObject)$ic46$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39031((SubLObject)FIVE_INTEGER);
                        var61 = (SubLObject)ZERO_INTEGER;
                        var62 = var59;
                        var63 = (SubLObject)NIL;
                        var63 = var62.first();
                        while (NIL != var62) {
                            module0642.f39026((SubLObject)UNPROVIDED);
                            var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                            f30460(var8, var63, var61);
                            var62 = var62.rest();
                            var63 = var62.first();
                        }
                    }
                    else if (var60.eql((SubLObject)$ic25$)) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39013((SubLObject)$ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        var61 = (SubLObject)ZERO_INTEGER;
                        var62 = var59;
                        var64 = (SubLObject)NIL;
                        var64 = var62.first();
                        while (NIL != var62) {
                            module0642.f39026((SubLObject)UNPROVIDED);
                            var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                            f30460(var8, var64, var61);
                            var62 = var62.rest();
                            var64 = var62.first();
                        }
                    }
                }
            }
            finally {
                module0015.$g131$.rebind(var56, var54);
            }
        }
        finally {
            final SubLObject var65 = Threads.$is_thread_performing_cleanupP$.currentBinding(var54);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var54);
                if (var55.isStream()) {
                    streams_high.close(var55, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var65, var54);
            }
        }
        return var8;
    }
    
    public static SubLObject f30460(final SubLObject var8, final SubLObject var29, final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        final SubLObject var61 = conses_high.getf(var29, (SubLObject)$ic48$, (SubLObject)UNPROVIDED);
        final SubLObject var62 = conses_high.getf(var29, (SubLObject)$ic49$, (SubLObject)UNPROVIDED);
        final SubLObject var63 = f30449(var61);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var64 = module0015.$g533$.currentBinding(var60);
        try {
            module0015.$g533$.bind((SubLObject)T, var60);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_64 = module0015.$g533$.currentBinding(var60);
            try {
                module0015.$g533$.bind((SubLObject)T, var60);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g375$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)TEN_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_65 = module0015.$g533$.currentBinding(var60);
                try {
                    module0015.$g533$.bind((SubLObject)T, var60);
                    module0642.f39031((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var5_65, var60);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_66 = module0015.$g533$.currentBinding(var60);
                try {
                    module0015.$g533$.bind((SubLObject)T, var60);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_67 = module0015.$g533$.currentBinding(var60);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var60);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_68 = module0015.$g533$.currentBinding(var60);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var60);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_69 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var60);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                PrintLow.format(module0015.$g131$.getDynamicValue(var60), (SubLObject)$ic33$, var63);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var5_69, var60);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_68, var60);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_70 = module0015.$g533$.currentBinding(var60);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var60);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_71 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var60);
                                var60.resetMultipleValues();
                                final SubLObject var65 = module0423.f29604(var61);
                                final SubLObject var66 = var60.secondMultipleValue();
                                final SubLObject var67 = var60.thirdMultipleValue();
                                var60.resetMultipleValues();
                                module0642.f39019(var65);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_71, var60);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_70, var60);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_72 = module0015.$g533$.currentBinding(var60);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var60);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g375$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TEN_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_73 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var60);
                                module0642.f39031((SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_73, var60);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var5_74 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var60);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g352$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)ZERO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var5_75 = module0015.$g533$.currentBinding(var60);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var60);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_76 = module0015.$g533$.currentBinding(var60);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var60);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic50$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic51$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var5_77 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var60);
                                            module0642.f39019((SubLObject)$ic52$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_77, var60);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var5_78 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var60);
                                            PrintLow.format(module0015.$g131$.getDynamicValue(var60), (SubLObject)$ic33$, var62);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_78, var60);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_76, var60);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_79 = module0015.$g533$.currentBinding(var60);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var60);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic50$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic51$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var5_80 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var60);
                                            module0642.f39019((SubLObject)$ic53$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_80, var60);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        final SubLObject var68 = conses_high.getf(var29, (SubLObject)$ic54$, (SubLObject)UNPROVIDED);
                                        f30461(var8, var68, var59, var62, var63);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_79, var60);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_81 = module0015.$g533$.currentBinding(var60);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var60);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic50$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic51$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var5_82 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var60);
                                            module0642.f39019((SubLObject)$ic55$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_82, var60);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var5_83 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var60);
                                            PrintLow.format(module0015.$g131$.getDynamicValue(var60), (SubLObject)$ic33$, conses_high.getf(var29, (SubLObject)$ic56$, (SubLObject)UNPROVIDED));
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_83, var60);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_81, var60);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var5_84 = module0015.$g533$.currentBinding(var60);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var60);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic50$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic51$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var5_85 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var60);
                                            module0642.f39019((SubLObject)$ic57$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_85, var60);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var5_86 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var60);
                                            PrintLow.format(module0015.$g131$.getDynamicValue(var60), (SubLObject)$ic33$, conses_high.getf(var29, (SubLObject)$ic58$, (SubLObject)UNPROVIDED));
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_86, var60);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_84, var60);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var5_75, var60);
                                }
                                module0642.f39020(module0015.$g347$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var5_74, var60);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var5_72, var60);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var5_67, var60);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var5_66, var60);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var5_64, var60);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var64, var60);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        module0642.f39011();
        return var61;
    }
    
    public static SubLObject f30461(final SubLObject var8, final SubLObject var13, final SubLObject var59, final SubLObject var62, final SubLObject var63) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        if (NIL == var13) {
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var65 = module0015.$g533$.currentBinding(var64);
            try {
                module0015.$g533$.bind((SubLObject)T, var64);
                PrintLow.format(module0015.$g131$.getDynamicValue(var64), (SubLObject)$ic33$, var13);
            }
            finally {
                module0015.$g533$.rebind(var65, var64);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            return (SubLObject)NIL;
        }
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = (SubLObject)NIL;
        if (var62.numG((SubLObject)TEN_INTEGER)) {
            if (NIL != constant_handles_oc.f8449(var8)) {
                var66 = constants_high_oc.f10743(var8);
            }
            else if (NIL != module0167.f10813(var8)) {
                var66 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic59$, module0167.f10803(var8));
            }
            var67 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic60$, new SubLObject[] { $g3508$.getDynamicValue(var64), $g3509$.getDynamicValue(var64), var66, var59 });
        }
        if (NIL == var66) {
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var68 = module0015.$g533$.currentBinding(var64);
            try {
                module0015.$g533$.bind((SubLObject)T, var64);
                SubLObject var69 = var13;
                SubLObject var70 = (SubLObject)NIL;
                var70 = var69.first();
                while (NIL != var69) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var64), (SubLObject)$ic33$, var70);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    var69 = var69.rest();
                    var70 = var69.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var68, var64);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            return (SubLObject)NIL;
        }
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var68 = module0015.$g533$.currentBinding(var64);
        try {
            module0015.$g533$.bind((SubLObject)T, var64);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var67);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var5_91 = module0015.$g533$.currentBinding(var64);
            try {
                module0015.$g533$.bind((SubLObject)T, var64);
                module0642.f39019((SubLObject)$ic61$);
            }
            finally {
                module0015.$g533$.rebind(var5_91, var64);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var68, var64);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        SubLObject var71 = (SubLObject)NIL;
        try {
            var71 = compatibility.open_text(var67, (SubLObject)$ic34$);
            if (!var71.isStream()) {
                Errors.error((SubLObject)$ic35$, var67);
            }
            final SubLObject var47_93 = var71;
            final SubLObject var72 = module0015.$g131$.currentBinding(var64);
            try {
                module0015.$g131$.bind(var47_93, var64);
                final SubLObject var73 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic62$, $g3508$.getDynamicValue(var64), $g3509$.getDynamicValue(var64));
                module0642.f39020(module0015.$g381$.getGlobalValue());
                module0642.f39020(module0015.$g383$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var73);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_92 = module0015.$g533$.currentBinding(var64);
                try {
                    module0015.$g533$.bind((SubLObject)T, var64);
                    module0642.f39019((SubLObject)$ic63$);
                }
                finally {
                    module0015.$g533$.rebind(var5_92, var64);
                }
                module0642.f39020(module0015.$g382$.getGlobalValue());
                module0642.f39026((SubLObject)TWO_INTEGER);
                module0642.f39021((SubLObject)$ic64$);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                PrintLow.format(module0015.$g131$.getDynamicValue(var64), (SubLObject)$ic33$, var63);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39026((SubLObject)TWO_INTEGER);
                module0642.f39021((SubLObject)$ic65$);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_93 = module0015.$g533$.currentBinding(var64);
                try {
                    module0015.$g533$.bind((SubLObject)T, var64);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var5_94 = module0015.$g533$.currentBinding(var64);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var64);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g375$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)TEN_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_95 = module0015.$g533$.currentBinding(var64);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var64);
                            module0642.f39031((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_95, var64);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var5_96 = module0015.$g533$.currentBinding(var64);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var64);
                            SubLObject var74 = var13;
                            SubLObject var75 = (SubLObject)NIL;
                            var75 = var74.first();
                            while (NIL != var74) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var64), (SubLObject)$ic33$, var75);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                var74 = var74.rest();
                                var75 = var74.first();
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var5_96, var64);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var5_94, var64);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var5_93, var64);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
                module0642.f39011();
            }
            finally {
                module0015.$g131$.rebind(var72, var64);
            }
        }
        finally {
            final SubLObject var76 = Threads.$is_thread_performing_cleanupP$.currentBinding(var64);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var64);
                if (var71.isStream()) {
                    streams_high.close(var71, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var76, var64);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30462(final SubLObject var22, final SubLObject var14, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        var101.resetMultipleValues();
        final SubLObject var102 = f30451(var14);
        final SubLObject var103 = var101.secondMultipleValue();
        final SubLObject var104 = var101.thirdMultipleValue();
        var101.resetMultipleValues();
        SubLObject var105 = (SubLObject)NIL;
        try {
            var105 = compatibility.open_text(var22, (SubLObject)$ic40$);
            if (!var105.isStream()) {
                Errors.error((SubLObject)$ic35$, var22);
            }
            final SubLObject var47_102 = var105;
            final SubLObject var106 = module0015.$g131$.currentBinding(var101);
            try {
                module0015.$g131$.bind(var47_102, var101);
                module0642.f39026((SubLObject)TWO_INTEGER);
                module0642.f39013((SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39021((SubLObject)$ic67$);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var5_103 = module0015.$g533$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)T, var101);
                    f30459((SubLObject)$ic68$, module0048.f3387(var102, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                    f30459((SubLObject)$ic69$, module0048.f3384(var102));
                    f30459((SubLObject)$ic70$, module0048.f3387(var103, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                    f30459((SubLObject)$ic71$, module0048.f3384(var103));
                    f30459((SubLObject)$ic72$, module0048.f3387(var104, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                    f30459((SubLObject)$ic73$, module0048.f3384(var104));
                }
                finally {
                    module0015.$g533$.rebind(var5_103, var101);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
            finally {
                module0015.$g131$.rebind(var106, var101);
            }
        }
        finally {
            final SubLObject var107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var101);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var101);
                if (var105.isStream()) {
                    streams_high.close(var105, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var107, var101);
            }
        }
        return var22;
    }
    
    public static SubLObject f30463(final SubLObject var1, SubLObject var104) {
        if (var104 == UNPROVIDED) {
            var104 = (SubLObject)NIL;
        }
        final SubLThread var105 = SubLProcess.currentSubLThread();
        assert NIL != f30444(var1) : var1;
        SubLObject var106 = f30445(var1);
        final SubLObject var107 = f30456(var1);
        final SubLObject var108 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic74$, $g3508$.getDynamicValue(var105), $g3509$.getDynamicValue(var105));
        final SubLObject var109 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic75$, $g3508$.getDynamicValue(var105), $g3509$.getDynamicValue(var105));
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = (SubLObject)NIL;
        if (var104.isInteger()) {
            var106 = module0035.f2124(var104, var106);
        }
        if (NIL != var108) {
            var110 = module0424.f29756(var108, (SubLObject)UNPROVIDED);
        }
        if (NIL != var109) {
            var111 = module0424.f29756(var109, (SubLObject)UNPROVIDED);
        }
        if (NIL != var110) {
            module0424.f29757(var110, var107);
        }
        if (NIL != var111) {
            module0424.f29757(var111, var107);
        }
        SubLObject var112 = var106;
        SubLObject var113 = (SubLObject)NIL;
        var113 = var112.first();
        while (NIL != var112) {
            if (NIL == module0012.$silent_progressP$.getDynamicValue(var105)) {
                print_high.princ((SubLObject)$ic76$, StreamsLow.$standard_output$.getDynamicValue(var105));
                streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var105));
            }
            f30452(var113, var107, var110, var111);
            var112 = var112.rest();
            var113 = var112.first();
        }
        if (var110.isStream()) {
            streams_high.close(var110, (SubLObject)UNPROVIDED);
        }
        if (var111.isStream()) {
            streams_high.close(var111, (SubLObject)UNPROVIDED);
        }
        f30462(var107, var108, var109);
        return var1;
    }
    
    public static SubLObject f30464(SubLObject var104) {
        if (var104 == UNPROVIDED) {
            var104 = (SubLObject)NIL;
        }
        final SubLThread var105 = SubLProcess.currentSubLThread();
        SubLObject var106 = (SubLObject)NIL;
        PrintLow.format((SubLObject)T, (SubLObject)$ic77$, module0051.f3552((SubLObject)UNPROVIDED));
        streams_high.force_output((SubLObject)UNPROVIDED);
        final SubLObject var107 = Time.get_internal_real_time();
        SubLObject var108 = $g3507$.getDynamicValue(var105);
        SubLObject var109 = (SubLObject)NIL;
        var109 = var108.first();
        while (NIL != var108) {
            f30463(var109, var104);
            var108 = var108.rest();
            var109 = var108.first();
        }
        var106 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var107), time_high.$internal_time_units_per_second$.getGlobalValue());
        PrintLow.format((SubLObject)T, (SubLObject)$ic78$, module0051.f3552((SubLObject)UNPROVIDED));
        streams_high.force_output((SubLObject)UNPROVIDED);
        PrintLow.format((SubLObject)T, (SubLObject)$ic79$, module0051.f3602(Numbers.truncate(var106, (SubLObject)UNPROVIDED)));
        streams_high.force_output((SubLObject)UNPROVIDED);
        return var106;
    }
    
    public static SubLObject f30465(final SubLObject var106, final SubLObject var107, SubLObject var104) {
        if (var104 == UNPROVIDED) {
            var104 = (SubLObject)NIL;
        }
        final SubLThread var108 = SubLProcess.currentSubLThread();
        SubLObject var109 = (SubLObject)NIL;
        final SubLObject var110 = $g3507$.currentBinding(var108);
        final SubLObject var111 = $g3508$.currentBinding(var108);
        try {
            $g3507$.bind((SubLObject)ConsesLow.list(var106), var108);
            $g3508$.bind(var107, var108);
            var109 = f30464(var104);
        }
        finally {
            $g3508$.rebind(var111, var108);
            $g3507$.rebind(var110, var108);
        }
        return var109;
    }
    
    public static SubLObject f30466(final SubLObject var108, final SubLObject var107, SubLObject var104) {
        if (var104 == UNPROVIDED) {
            var104 = (SubLObject)NIL;
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        assert NIL != constant_handles_oc.f8449(var108) : var108;
        SubLObject var110 = (SubLObject)NIL;
        final SubLObject var111 = $g3507$.currentBinding(var109);
        final SubLObject var112 = $g3508$.currentBinding(var109);
        try {
            $g3507$.bind((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic1$, var108)), var109);
            $g3508$.bind(var107, var109);
            var110 = f30464(var104);
        }
        finally {
            $g3508$.rebind(var112, var109);
            $g3507$.rebind(var111, var109);
        }
        return var110;
    }
    
    public static SubLObject f30467() {
        f30464((SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30468(final SubLObject var16, final SubLObject var109, SubLObject var110) {
        if (var110 == UNPROVIDED) {
            var110 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = var16;
        SubLObject var113 = (SubLObject)NIL;
        var113 = var112.first();
        while (NIL != var112) {
            if (NIL != Functions.funcall(var109, Functions.funcall(var110, var113))) {
                var111 = (SubLObject)ConsesLow.cons(var113, var111);
            }
            var112 = var112.rest();
            var113 = var112.first();
        }
        return Sequences.nreverse(var111);
    }
    
    public static SubLObject f30469(final SubLObject var16, final SubLObject var57, final SubLObject var40, SubLObject var109) {
        if (var109 == UNPROVIDED) {
            var109 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = var16;
        SubLObject var112 = (SubLObject)NIL;
        var112 = var111.first();
        while (NIL != var111) {
            if (NIL != Functions.funcall(var109, var40, module0424.f29640(var112, var57, var40))) {
                var110 = (SubLObject)ConsesLow.cons(var112, var110);
            }
            var111 = var111.rest();
            var112 = var111.first();
        }
        return Sequences.nreverse(var110);
    }
    
    public static SubLObject f30454(final SubLObject var16) {
        return f30468(var16, Symbols.symbol_function((SubLObject)$ic81$), Symbols.symbol_function((SubLObject)$ic82$));
    }
    
    public static SubLObject f30455(final SubLObject var16) {
        return f30469(var16, (SubLObject)$ic49$, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30470() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30442", "S#33680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30443", "S#33681", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30444", "S#33682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30445", "S#33683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30446", "S#33684", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30447", "S#33685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30448", "S#33686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30449", "S#33687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30450", "S#33688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30451", "S#33689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30452", "S#33690", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30456", "S#33691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30458", "S#33692", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30459", "S#33693", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30457", "S#33694", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30453", "S#33695", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30460", "S#33696", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30461", "S#33697", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30462", "S#33698", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30463", "S#33699", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30464", "S#33700", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30465", "S#33701", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30466", "S#33702", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30467", "S#33703", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30468", "S#33704", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30469", "S#33705", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30454", "S#33706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0431", "f30455", "S#33707", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30471() {
        $g3507$ = SubLFiles.defvar("S#33708", (SubLObject)$ic0$);
        $g3508$ = SubLFiles.defparameter("S#33709", (SubLObject)$ic3$);
        $g3509$ = SubLFiles.defvar("S#33710", (SubLObject)NIL);
        $g3510$ = SubLFiles.deflexical("S#33711", (SubLObject)$ic20$);
        $g3511$ = SubLFiles.deflexical("S#33712", (SubLObject)$ic21$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30472() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f30470();
    }
    
    public void initializeVariables() {
        f30471();
    }
    
    public void runTopLevelForms() {
        f30472();
    }
    
    static {
        me = (SubLFile)new module0431();
        $g3507$ = null;
        $g3508$ = null;
        $g3509$ = null;
        $g3510$ = null;
        $g3511$ = null;
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Terrorist")), constant_handles_oc.f8479((SubLObject)makeString("TerroristGroup")), constant_handles_oc.f8479((SubLObject)makeString("IndependentCountry")));
        $ic1$ = makeKeyword("TERM");
        $ic2$ = makeSymbol("S#33680", "CYC");
        $ic3$ = makeString("/cyc/projects/Topsail/query-suggestor");
        $ic4$ = makeSymbol("S#33682", "CYC");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("TKBSourceSpindleCollectorMt"));
        $ic6$ = makeSymbol("S#16406", "CYC");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("conceptPertinentToDegree"));
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("HighAmountFn")), constant_handles_oc.f8479((SubLObject)makeString("Relevance"))));
        $ic9$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TaskModelMtFn")), constant_handles_oc.f8479((SubLObject)makeString("Allotment-8")));
        $ic10$ = makeSymbol("?QUERY");
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("cycLQuerySpecificationPertinentToDegree"));
        $ic12$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("VeryHighAmountFn")), constant_handles_oc.f8479((SubLObject)makeString("Relevance")));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("formulaTemplateGloss"));
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("TemplateFromTestQueryFn"));
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("?GLOSS"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("TestVocabularyMt"));
        $ic19$ = ConsesLow.list((SubLObject)makeKeyword("RETURN"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)makeSymbol("?GLOSS")));
        $ic20$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER-COUNT"), (SubLObject)makeKeyword("TIME-TO-FIRST-ANSWER"), (SubLObject)makeKeyword("TOTAL-TIME"), (SubLObject)makeKeyword("COMPLETE-TOTAL-TIME"));
        $ic21$ = ConsesLow.list((SubLObject)makeKeyword("QUIESCENCE"), (SubLObject)makeKeyword("TOTAL"), (SubLObject)makeKeyword("ANSWERABLES"), (SubLObject)makeKeyword("UNANSWERABLES"));
        $ic22$ = makeInteger(600);
        $ic23$ = makeKeyword("QUIESCENCE");
        $ic24$ = makeKeyword("ANSWERABLES");
        $ic25$ = makeKeyword("UNANSWERABLES");
        $ic26$ = makeKeyword("CONCEPT");
        $ic27$ = makeString("Concept not asserted to be pertinent");
        $ic28$ = makeString("~a/~a");
        $ic29$ = makeKeyword("TOTAL");
        $ic30$ = makeKeyword("RATIO");
        $ic31$ = makeString("~a/~a-~a.htm");
        $ic32$ = makeString("~a-~a");
        $ic33$ = makeString("~a");
        $ic34$ = makeKeyword("OUTPUT");
        $ic35$ = makeString("Unable to open ~S");
        $ic36$ = makeString("Test Date: ");
        $ic37$ = makeString("KB: ");
        $ic38$ = makeString("System: ");
        $ic39$ = makeString("Test Type: ");
        $ic40$ = makeKeyword("APPEND");
        $ic41$ = makeString(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        $ic42$ = makeString("Concept: ");
        $ic43$ = makeString("Time to Quiescence:");
        $ic44$ = makeString("Total Number of Queries:");
        $ic45$ = makeString("Answerable/Unanswerable: ~A");
        $ic46$ = makeString("Answerable Queries:");
        $ic47$ = makeString("Unanswerable Queries:");
        $ic48$ = makeKeyword("QUERY");
        $ic49$ = makeKeyword("ANSWER-COUNT");
        $ic50$ = makeKeyword("TOP");
        $ic51$ = makeInteger(150);
        $ic52$ = makeString("Number of Bindings: ");
        $ic53$ = makeString("Bindings: ");
        $ic54$ = makeKeyword("RESULT");
        $ic55$ = makeString("Time To First Answer: ");
        $ic56$ = makeKeyword("TIME-TO-FIRST-ANSWER");
        $ic57$ = makeString("Complete Total Time: ");
        $ic58$ = makeKeyword("COMPLETE-TOTAL-TIME");
        $ic59$ = makeString("n~a");
        $ic60$ = makeString("~a/extra-answers/~a-~a-~a.htm");
        $ic61$ = makeString("Bindings for Query");
        $ic62$ = makeString("~a/~a.htm");
        $ic63$ = makeString("Back to Main Test Run");
        $ic64$ = makeString("Query: ");
        $ic65$ = makeString("Bindings:");
        $ic66$ = makeString("****************************************");
        $ic67$ = makeString("Test run Summary");
        $ic68$ = makeString("Median Quiescence Time: ");
        $ic69$ = makeString("Mean Quiescence Time: ");
        $ic70$ = makeString("Median Answerables: ");
        $ic71$ = makeString("Mean Answerables: ");
        $ic72$ = makeString("Median Unanswerables: ");
        $ic73$ = makeString("Mean Unanswerables: ");
        $ic74$ = makeString("~a/~a-concepts.cfasl");
        $ic75$ = makeString("~a/~a-queries.cfasl");
        $ic76$ = makeString("*");
        $ic77$ = makeString("~%Run starting at ~A");
        $ic78$ = makeString("~%Run ended at ~A");
        $ic79$ = makeString("~%Elapsed time: ~A");
        $ic80$ = makeSymbol("CONSTANT-P");
        $ic81$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic82$ = makeSymbol("S#32805", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 674 ms
	
	Decompiled with Procyon 0.5.32.
*/