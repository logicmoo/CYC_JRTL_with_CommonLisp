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
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && module0431.$ic1$ == var1.first());
    }
    
    public static SubLObject f30443(final SubLObject var1) {
        assert module0431.NIL != f30442(var1) : var1;
        return conses_high.second(var1);
    }
    
    public static SubLObject f30444(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0431.NIL != f30442(var1) || (module0431.NIL != module0128.f8449(var1) && module0431.NIL != module0269.f17710(var1)));
    }
    
    public static SubLObject f30445(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0431.NIL != f30444(var1) : var1;
        if (module0431.NIL != f30442(var1)) {
            return (SubLObject)ConsesLow.list(f30443(var1));
        }
        SubLObject var3 = (SubLObject)module0431.NIL;
        final SubLObject var4 = module0147.f9540(module0431.$ic5$);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        final SubLObject var6 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var7 = module0147.$g2096$.currentBinding(var2);
        try {
            module0147.$g2095$.bind(module0147.f9545(var4), var2);
            module0147.$g2094$.bind(module0147.f9546(var4), var2);
            module0147.$g2096$.bind(module0147.f9549(var4), var2);
            var3 = Sequences.remove_if((SubLObject)module0431.$ic6$, module0259.f16848(var1, (SubLObject)module0431.UNPROVIDED, (SubLObject)module0431.UNPROVIDED), (SubLObject)module0431.UNPROVIDED, (SubLObject)module0431.UNPROVIDED, (SubLObject)module0431.UNPROVIDED, (SubLObject)module0431.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var7, var2);
            module0147.$g2094$.rebind(var6, var2);
            module0147.$g2095$.rebind(var5, var2);
        }
        return var3;
    }
    
    public static SubLObject f30446(final SubLObject var8) {
        SubLObject var9 = (SubLObject)module0431.NIL;
        SubLObject var10 = (SubLObject)module0431.NIL;
        final SubLObject var11 = Time.get_internal_real_time();
        var9 = module0540.f33516((SubLObject)ConsesLow.listS(module0431.$ic7$, var8, (SubLObject)module0431.$ic8$), (SubLObject)module0431.$ic9$, (SubLObject)module0431.UNPROVIDED);
        var10 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var11), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(var9, var10);
    }
    
    public static SubLObject f30447(final SubLObject var8) {
        return module0540.f33518((SubLObject)ConsesLow.listS(module0431.$ic7$, var8, (SubLObject)module0431.$ic8$), (SubLObject)module0431.$ic9$);
    }
    
    public static SubLObject f30448(final SubLObject var8) {
        return module0347.f23344((SubLObject)module0431.$ic10$, (SubLObject)ConsesLow.list(module0431.$ic11$, (SubLObject)module0431.$ic10$, module0172.f10921((SubLObject)module0431.$ic12$), (SubLObject)ConsesLow.list(module0431.$ic13$, var8)), module0431.$ic14$, (SubLObject)module0431.UNPROVIDED, (SubLObject)module0431.UNPROVIDED);
    }
    
    public static SubLObject f30449(final SubLObject var12) {
        final SubLObject var13 = module0409.f28506((SubLObject)ConsesLow.listS(module0431.$ic15$, (SubLObject)ConsesLow.list(module0431.$ic16$, var12), (SubLObject)module0431.$ic17$), module0431.$ic18$, (SubLObject)module0431.$ic19$);
        if (module0431.NIL != var13) {
            return var13.first();
        }
        return (SubLObject)module0431.NIL;
    }
    
    public static SubLObject f30450(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)module0431.NIL;
        final SubLObject var15 = module0018.$g739$.currentBinding(var13);
        try {
            module0018.$g739$.bind((SubLObject)module0431.NIL, var13);
            var14 = module0424.f29713(var12, module0431.$g3510$.getGlobalValue(), (SubLObject)module0431.$ic22$, (SubLObject)module0431.NIL, (SubLObject)module0431.T);
        }
        finally {
            module0018.$g739$.rebind(var15, var13);
        }
        return var14;
    }
    
    public static SubLObject f30451(final SubLObject var14) {
        final SubLObject var15 = module0424.f29795(var14);
        final SubLObject var16 = module0424.f29678(var15);
        SubLObject var17 = (SubLObject)module0431.NIL;
        SubLObject var18 = (SubLObject)module0431.NIL;
        SubLObject var19 = (SubLObject)module0431.NIL;
        SubLObject var20 = var16;
        SubLObject var21 = (SubLObject)module0431.NIL;
        var21 = var20.first();
        while (module0431.NIL != var20) {
            var17 = (SubLObject)ConsesLow.cons(conses_high.getf(var21, (SubLObject)module0431.$ic23$, (SubLObject)module0431.UNPROVIDED), var17);
            var18 = (SubLObject)ConsesLow.cons(conses_high.getf(var21, (SubLObject)module0431.$ic24$, (SubLObject)module0431.UNPROVIDED), var18);
            var19 = (SubLObject)ConsesLow.cons(conses_high.getf(var21, (SubLObject)module0431.$ic25$, (SubLObject)module0431.UNPROVIDED), var19);
            var20 = var20.rest();
            var21 = var20.first();
        }
        return Values.values(var17, var18, var19);
    }
    
    public static SubLObject f30452(final SubLObject var8, final SubLObject var22, final SubLObject var23, final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        f30453(var8, (SubLObject)ConsesLow.list((SubLObject)module0431.$ic26$, var8), var22);
        var25.resetMultipleValues();
        final SubLObject var26 = f30446(var8);
        final SubLObject var27 = var25.secondMultipleValue();
        var25.resetMultipleValues();
        if (module0431.NIL == var26) {
            Errors.warn((SubLObject)module0431.$ic27$);
            return (SubLObject)module0431.NIL;
        }
        f30453(var8, (SubLObject)ConsesLow.list((SubLObject)module0431.$ic23$, var27), var22);
        final SubLObject var28 = f30448(var8);
        SubLObject var29 = (SubLObject)module0431.NIL;
        SubLObject var30 = (SubLObject)module0431.NIL;
        SubLObject var31 = (SubLObject)module0431.NIL;
        SubLObject var32 = var28;
        SubLObject var33 = (SubLObject)module0431.NIL;
        var33 = var32.first();
        while (module0431.NIL != var32) {
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
        final SubLObject var39 = PrintLow.format((SubLObject)module0431.NIL, (SubLObject)module0431.$ic28$, var37, var38);
        var29 = conses_high.putf(var29, (SubLObject)module0431.$ic26$, var8);
        var29 = conses_high.putf(var29, (SubLObject)module0431.$ic23$, var27);
        var29 = conses_high.putf(var29, (SubLObject)module0431.$ic29$, var34);
        var29 = conses_high.putf(var29, (SubLObject)module0431.$ic24$, var37);
        var29 = conses_high.putf(var29, (SubLObject)module0431.$ic25$, var38);
        module0424.f29758(var29, var23);
        f30453(var8, (SubLObject)ConsesLow.list((SubLObject)module0431.$ic29$, var34), var22);
        f30453(var8, (SubLObject)ConsesLow.list((SubLObject)module0431.$ic30$, var39), var22);
        f30453(var8, (SubLObject)ConsesLow.list((SubLObject)module0431.$ic24$, var35), var22);
        f30453(var8, (SubLObject)ConsesLow.list((SubLObject)module0431.$ic25$, var36), var22);
        f30447(var8);
        return var8;
    }
    
    public static SubLObject f30456(SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0431.NIL != f30442(var1)) {
            var1 = f30443(var1);
        }
        final SubLObject var3 = Time.get_universal_time();
        final SubLObject var4 = PrintLow.format((SubLObject)module0431.NIL, (SubLObject)module0431.$ic31$, new SubLObject[] { module0431.$g3508$.getDynamicValue(var2), module0166.f10743(var1), var3 });
        f30457(var1, var4, var3);
        module0431.$g3509$.setDynamicValue(PrintLow.format((SubLObject)module0431.NIL, (SubLObject)module0431.$ic32$, module0166.f10743(var1), var3), var2);
        return var4;
    }
    
    public static SubLObject f30458(final SubLObject var39, final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
        final SubLObject var42 = module0015.$g533$.currentBinding(var41);
        try {
            module0015.$g533$.bind((SubLObject)module0431.T, var41);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
            final SubLObject var5_41 = module0015.$g533$.currentBinding(var41);
            try {
                module0015.$g533$.bind((SubLObject)module0431.T, var41);
                module0642.f39021(var39);
            }
            finally {
                module0015.$g533$.rebind(var5_41, var41);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
            final SubLObject var5_42 = module0015.$g533$.currentBinding(var41);
            try {
                module0015.$g533$.bind((SubLObject)module0431.T, var41);
                PrintLow.format(module0015.$g131$.getDynamicValue(var41), (SubLObject)module0431.$ic33$, var40);
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
        module0642.f39029((SubLObject)module0431.UNPROVIDED);
        return var40;
    }
    
    public static SubLObject f30459(final SubLObject var39, final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
        final SubLObject var42 = module0015.$g533$.currentBinding(var41);
        try {
            module0015.$g533$.bind((SubLObject)module0431.T, var41);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
            final SubLObject var5_43 = module0015.$g533$.currentBinding(var41);
            try {
                module0015.$g533$.bind((SubLObject)module0431.T, var41);
                module0642.f39019(var39);
            }
            finally {
                module0015.$g533$.rebind(var5_43, var41);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
            final SubLObject var5_44 = module0015.$g533$.currentBinding(var41);
            try {
                module0015.$g533$.bind((SubLObject)module0431.T, var41);
                PrintLow.format(module0015.$g131$.getDynamicValue(var41), (SubLObject)module0431.$ic33$, var40);
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
        module0642.f39029((SubLObject)module0431.UNPROVIDED);
        return var40;
    }
    
    public static SubLObject f30457(final SubLObject var1, final SubLObject var22, final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        SubLObject var47 = (SubLObject)module0431.NIL;
        try {
            var47 = compatibility.open_text(var22, (SubLObject)module0431.$ic34$);
            if (!var47.isStream()) {
                Errors.error((SubLObject)module0431.$ic35$, var22);
            }
            final SubLObject var47_48 = var47;
            final SubLObject var48 = module0015.$g131$.currentBinding(var46);
            try {
                module0015.$g131$.bind(var47_48, var46);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                module0642.f39020((SubLObject)module0431.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                final SubLObject var5_49 = module0015.$g533$.currentBinding(var46);
                try {
                    module0015.$g533$.bind((SubLObject)module0431.T, var46);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                    final SubLObject var5_50 = module0015.$g533$.currentBinding(var46);
                    try {
                        module0015.$g533$.bind((SubLObject)module0431.T, var46);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                        final SubLObject var5_51 = module0015.$g533$.currentBinding(var46);
                        try {
                            module0015.$g533$.bind((SubLObject)module0431.T, var46);
                            module0642.f39021((SubLObject)module0431.$ic36$);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_51, var46);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                        final SubLObject var5_52 = module0015.$g533$.currentBinding(var46);
                        try {
                            module0015.$g533$.bind((SubLObject)module0431.T, var46);
                            module0656.f39800(module0051.f3557(var45, (SubLObject)module0431.UNPROVIDED));
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
                    module0642.f39029((SubLObject)module0431.UNPROVIDED);
                    f30458((SubLObject)module0431.$ic37$, module0018.f971());
                    f30458((SubLObject)module0431.$ic38$, module0011.f351());
                    f30458((SubLObject)module0431.$ic39$, var1);
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0431.T, var46);
                if (var47.isStream()) {
                    streams_high.close(var47, (SubLObject)module0431.UNPROVIDED);
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
        SubLObject var55 = (SubLObject)module0431.NIL;
        try {
            var55 = compatibility.open_text(var22, (SubLObject)module0431.$ic40$);
            if (!var55.isStream()) {
                Errors.error((SubLObject)module0431.$ic35$, var22);
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
                for (var57 = (SubLObject)module0431.NIL, var57 = var53; module0431.NIL != var57; var57 = conses_high.cddr(var57)) {
                    var58 = var57.first();
                    var59 = conses_high.cadr(var57);
                    var60 = var58;
                    if (var60.eql((SubLObject)module0431.$ic26$)) {
                        module0642.f39026((SubLObject)module0431.UNPROVIDED);
                        module0642.f39013((SubLObject)module0431.$ic41$, (SubLObject)module0431.UNPROVIDED, (SubLObject)module0431.UNPROVIDED);
                        module0642.f39026((SubLObject)module0431.TWO_INTEGER);
                        module0642.f39021((SubLObject)module0431.$ic42$);
                        module0642.f39031((SubLObject)module0431.EIGHTEEN_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        PrintLow.format(module0015.$g131$.getDynamicValue(var54), (SubLObject)module0431.$ic33$, var59);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39011();
                    }
                    else if (var60.eql((SubLObject)module0431.$ic23$)) {
                        module0642.f39026((SubLObject)module0431.UNPROVIDED);
                        module0642.f39019((SubLObject)module0431.$ic43$);
                        module0642.f39031((SubLObject)module0431.EIGHT_INTEGER);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var54), (SubLObject)module0431.$ic33$, var59);
                        module0642.f39011();
                    }
                    else if (var60.eql((SubLObject)module0431.$ic29$)) {
                        module0642.f39026((SubLObject)module0431.UNPROVIDED);
                        module0642.f39019((SubLObject)module0431.$ic44$);
                        module0642.f39031((SubLObject)module0431.FOUR_INTEGER);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var54), (SubLObject)module0431.$ic33$, var59);
                    }
                    else if (var60.eql((SubLObject)module0431.$ic30$)) {
                        module0642.f39026((SubLObject)module0431.UNPROVIDED);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var54), (SubLObject)module0431.$ic45$, var59);
                    }
                    else if (var60.eql((SubLObject)module0431.$ic24$)) {
                        module0642.f39026((SubLObject)module0431.UNPROVIDED);
                        module0642.f39013((SubLObject)module0431.$ic46$, (SubLObject)module0431.UNPROVIDED, (SubLObject)module0431.UNPROVIDED);
                        module0642.f39031((SubLObject)module0431.FIVE_INTEGER);
                        var61 = (SubLObject)module0431.ZERO_INTEGER;
                        var62 = var59;
                        var63 = (SubLObject)module0431.NIL;
                        var63 = var62.first();
                        while (module0431.NIL != var62) {
                            module0642.f39026((SubLObject)module0431.UNPROVIDED);
                            var61 = Numbers.add(var61, (SubLObject)module0431.ONE_INTEGER);
                            f30460(var8, var63, var61);
                            var62 = var62.rest();
                            var63 = var62.first();
                        }
                    }
                    else if (var60.eql((SubLObject)module0431.$ic25$)) {
                        module0642.f39026((SubLObject)module0431.UNPROVIDED);
                        module0642.f39013((SubLObject)module0431.$ic47$, (SubLObject)module0431.UNPROVIDED, (SubLObject)module0431.UNPROVIDED);
                        var61 = (SubLObject)module0431.ZERO_INTEGER;
                        var62 = var59;
                        var64 = (SubLObject)module0431.NIL;
                        var64 = var62.first();
                        while (module0431.NIL != var62) {
                            module0642.f39026((SubLObject)module0431.UNPROVIDED);
                            var61 = Numbers.add(var61, (SubLObject)module0431.ONE_INTEGER);
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0431.T, var54);
                if (var55.isStream()) {
                    streams_high.close(var55, (SubLObject)module0431.UNPROVIDED);
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
        final SubLObject var61 = conses_high.getf(var29, (SubLObject)module0431.$ic48$, (SubLObject)module0431.UNPROVIDED);
        final SubLObject var62 = conses_high.getf(var29, (SubLObject)module0431.$ic49$, (SubLObject)module0431.UNPROVIDED);
        final SubLObject var63 = f30449(var61);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
        module0642.f39020((SubLObject)module0431.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
        final SubLObject var64 = module0015.$g533$.currentBinding(var60);
        try {
            module0015.$g533$.bind((SubLObject)module0431.T, var60);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
            final SubLObject var5_64 = module0015.$g533$.currentBinding(var60);
            try {
                module0015.$g533$.bind((SubLObject)module0431.T, var60);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g375$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                module0642.f39020((SubLObject)module0431.TEN_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                final SubLObject var5_65 = module0015.$g533$.currentBinding(var60);
                try {
                    module0015.$g533$.bind((SubLObject)module0431.T, var60);
                    module0642.f39031((SubLObject)module0431.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var5_65, var60);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                final SubLObject var5_66 = module0015.$g533$.currentBinding(var60);
                try {
                    module0015.$g533$.bind((SubLObject)module0431.T, var60);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                    module0642.f39020((SubLObject)module0431.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                    final SubLObject var5_67 = module0015.$g533$.currentBinding(var60);
                    try {
                        module0015.$g533$.bind((SubLObject)module0431.T, var60);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                        final SubLObject var5_68 = module0015.$g533$.currentBinding(var60);
                        try {
                            module0015.$g533$.bind((SubLObject)module0431.T, var60);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                            module0642.f39020((SubLObject)module0431.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                            final SubLObject var5_69 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                PrintLow.format(module0015.$g131$.getDynamicValue(var60), (SubLObject)module0431.$ic33$, var63);
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
                        module0642.f39029((SubLObject)module0431.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                        final SubLObject var5_70 = module0015.$g533$.currentBinding(var60);
                        try {
                            module0015.$g533$.bind((SubLObject)module0431.T, var60);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                            module0642.f39020((SubLObject)module0431.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                            final SubLObject var5_71 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)module0431.T, var60);
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
                        module0642.f39029((SubLObject)module0431.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                        final SubLObject var5_72 = module0015.$g533$.currentBinding(var60);
                        try {
                            module0015.$g533$.bind((SubLObject)module0431.T, var60);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g375$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                            module0642.f39020((SubLObject)module0431.TEN_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                            final SubLObject var5_73 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                module0642.f39031((SubLObject)module0431.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var5_73, var60);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                            final SubLObject var5_74 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g352$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                module0642.f39020((SubLObject)module0431.ZERO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                                final SubLObject var5_75 = module0015.$g533$.currentBinding(var60);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                                    final SubLObject var5_76 = module0015.$g533$.currentBinding(var60);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0431.$ic50$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0431.$ic51$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                                        final SubLObject var5_77 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                            module0642.f39019((SubLObject)module0431.$ic52$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_77, var60);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                                        final SubLObject var5_78 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                            PrintLow.format(module0015.$g131$.getDynamicValue(var60), (SubLObject)module0431.$ic33$, var62);
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
                                    module0642.f39029((SubLObject)module0431.UNPROVIDED);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                                    final SubLObject var5_79 = module0015.$g533$.currentBinding(var60);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0431.$ic50$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0431.$ic51$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                                        final SubLObject var5_80 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                            module0642.f39019((SubLObject)module0431.$ic53$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_80, var60);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        final SubLObject var68 = conses_high.getf(var29, (SubLObject)module0431.$ic54$, (SubLObject)module0431.UNPROVIDED);
                                        f30461(var8, var68, var59, var62, var63);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var5_79, var60);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)module0431.UNPROVIDED);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                                    final SubLObject var5_81 = module0015.$g533$.currentBinding(var60);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0431.$ic50$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0431.$ic51$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                                        final SubLObject var5_82 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                            module0642.f39019((SubLObject)module0431.$ic55$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_82, var60);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                                        final SubLObject var5_83 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                            PrintLow.format(module0015.$g131$.getDynamicValue(var60), (SubLObject)module0431.$ic33$, conses_high.getf(var29, (SubLObject)module0431.$ic56$, (SubLObject)module0431.UNPROVIDED));
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
                                    module0642.f39029((SubLObject)module0431.UNPROVIDED);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                                    final SubLObject var5_84 = module0015.$g533$.currentBinding(var60);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0431.$ic50$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0431.$ic51$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                                        final SubLObject var5_85 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                            module0642.f39019((SubLObject)module0431.$ic57$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var5_85, var60);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                                        final SubLObject var5_86 = module0015.$g533$.currentBinding(var60);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0431.T, var60);
                                            PrintLow.format(module0015.$g131$.getDynamicValue(var60), (SubLObject)module0431.$ic33$, conses_high.getf(var29, (SubLObject)module0431.$ic58$, (SubLObject)module0431.UNPROVIDED));
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
                                    module0642.f39029((SubLObject)module0431.UNPROVIDED);
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
                        module0642.f39029((SubLObject)module0431.UNPROVIDED);
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
            module0642.f39029((SubLObject)module0431.UNPROVIDED);
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
        if (module0431.NIL == var13) {
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
            final SubLObject var65 = module0015.$g533$.currentBinding(var64);
            try {
                module0015.$g533$.bind((SubLObject)module0431.T, var64);
                PrintLow.format(module0015.$g131$.getDynamicValue(var64), (SubLObject)module0431.$ic33$, var13);
            }
            finally {
                module0015.$g533$.rebind(var65, var64);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            return (SubLObject)module0431.NIL;
        }
        SubLObject var66 = (SubLObject)module0431.NIL;
        SubLObject var67 = (SubLObject)module0431.NIL;
        if (var62.numG((SubLObject)module0431.TEN_INTEGER)) {
            if (module0431.NIL != module0128.f8449(var8)) {
                var66 = module0166.f10743(var8);
            }
            else if (module0431.NIL != module0167.f10813(var8)) {
                var66 = PrintLow.format((SubLObject)module0431.NIL, (SubLObject)module0431.$ic59$, module0167.f10803(var8));
            }
            var67 = PrintLow.format((SubLObject)module0431.NIL, (SubLObject)module0431.$ic60$, new SubLObject[] { module0431.$g3508$.getDynamicValue(var64), module0431.$g3509$.getDynamicValue(var64), var66, var59 });
        }
        if (module0431.NIL == var66) {
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
            final SubLObject var68 = module0015.$g533$.currentBinding(var64);
            try {
                module0015.$g533$.bind((SubLObject)module0431.T, var64);
                SubLObject var69 = var13;
                SubLObject var70 = (SubLObject)module0431.NIL;
                var70 = var69.first();
                while (module0431.NIL != var69) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var64), (SubLObject)module0431.$ic33$, var70);
                    module0642.f39026((SubLObject)module0431.UNPROVIDED);
                    var69 = var69.rest();
                    var70 = var69.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var68, var64);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            return (SubLObject)module0431.NIL;
        }
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
        final SubLObject var68 = module0015.$g533$.currentBinding(var64);
        try {
            module0015.$g533$.bind((SubLObject)module0431.T, var64);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
            module0642.f39020(var67);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
            final SubLObject var5_91 = module0015.$g533$.currentBinding(var64);
            try {
                module0015.$g533$.bind((SubLObject)module0431.T, var64);
                module0642.f39019((SubLObject)module0431.$ic61$);
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
        SubLObject var71 = (SubLObject)module0431.NIL;
        try {
            var71 = compatibility.open_text(var67, (SubLObject)module0431.$ic34$);
            if (!var71.isStream()) {
                Errors.error((SubLObject)module0431.$ic35$, var67);
            }
            final SubLObject var47_93 = var71;
            final SubLObject var72 = module0015.$g131$.currentBinding(var64);
            try {
                module0015.$g131$.bind(var47_93, var64);
                final SubLObject var73 = PrintLow.format((SubLObject)module0431.NIL, (SubLObject)module0431.$ic62$, module0431.$g3508$.getDynamicValue(var64), module0431.$g3509$.getDynamicValue(var64));
                module0642.f39020(module0015.$g381$.getGlobalValue());
                module0642.f39020(module0015.$g383$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                module0642.f39020(var73);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                final SubLObject var5_92 = module0015.$g533$.currentBinding(var64);
                try {
                    module0015.$g533$.bind((SubLObject)module0431.T, var64);
                    module0642.f39019((SubLObject)module0431.$ic63$);
                }
                finally {
                    module0015.$g533$.rebind(var5_92, var64);
                }
                module0642.f39020(module0015.$g382$.getGlobalValue());
                module0642.f39026((SubLObject)module0431.TWO_INTEGER);
                module0642.f39021((SubLObject)module0431.$ic64$);
                module0642.f39026((SubLObject)module0431.UNPROVIDED);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                PrintLow.format(module0015.$g131$.getDynamicValue(var64), (SubLObject)module0431.$ic33$, var63);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39026((SubLObject)module0431.TWO_INTEGER);
                module0642.f39021((SubLObject)module0431.$ic65$);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                module0642.f39020((SubLObject)module0431.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                final SubLObject var5_93 = module0015.$g533$.currentBinding(var64);
                try {
                    module0015.$g533$.bind((SubLObject)module0431.T, var64);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                    final SubLObject var5_94 = module0015.$g533$.currentBinding(var64);
                    try {
                        module0015.$g533$.bind((SubLObject)module0431.T, var64);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g375$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                        module0642.f39020((SubLObject)module0431.TEN_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                        final SubLObject var5_95 = module0015.$g533$.currentBinding(var64);
                        try {
                            module0015.$g533$.bind((SubLObject)module0431.T, var64);
                            module0642.f39031((SubLObject)module0431.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var5_95, var64);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                        final SubLObject var5_96 = module0015.$g533$.currentBinding(var64);
                        try {
                            module0015.$g533$.bind((SubLObject)module0431.T, var64);
                            SubLObject var74 = var13;
                            SubLObject var75 = (SubLObject)module0431.NIL;
                            var75 = var74.first();
                            while (module0431.NIL != var74) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var64), (SubLObject)module0431.$ic33$, var75);
                                module0642.f39026((SubLObject)module0431.UNPROVIDED);
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
                    module0642.f39029((SubLObject)module0431.UNPROVIDED);
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0431.T, var64);
                if (var71.isStream()) {
                    streams_high.close(var71, (SubLObject)module0431.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var76, var64);
            }
        }
        return (SubLObject)module0431.NIL;
    }
    
    public static SubLObject f30462(final SubLObject var22, final SubLObject var14, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        var101.resetMultipleValues();
        final SubLObject var102 = f30451(var14);
        final SubLObject var103 = var101.secondMultipleValue();
        final SubLObject var104 = var101.thirdMultipleValue();
        var101.resetMultipleValues();
        SubLObject var105 = (SubLObject)module0431.NIL;
        try {
            var105 = compatibility.open_text(var22, (SubLObject)module0431.$ic40$);
            if (!var105.isStream()) {
                Errors.error((SubLObject)module0431.$ic35$, var22);
            }
            final SubLObject var47_102 = var105;
            final SubLObject var106 = module0015.$g131$.currentBinding(var101);
            try {
                module0015.$g131$.bind(var47_102, var101);
                module0642.f39026((SubLObject)module0431.TWO_INTEGER);
                module0642.f39013((SubLObject)module0431.$ic66$, (SubLObject)module0431.UNPROVIDED, (SubLObject)module0431.UNPROVIDED);
                module0642.f39026((SubLObject)module0431.UNPROVIDED);
                module0642.f39021((SubLObject)module0431.$ic67$);
                module0642.f39026((SubLObject)module0431.UNPROVIDED);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                module0642.f39020((SubLObject)module0431.ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0431.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0431.UNPROVIDED);
                final SubLObject var5_103 = module0015.$g533$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)module0431.T, var101);
                    f30459((SubLObject)module0431.$ic68$, module0048.f3387(var102, (SubLObject)module0431.UNPROVIDED, (SubLObject)module0431.UNPROVIDED));
                    f30459((SubLObject)module0431.$ic69$, module0048.f3384(var102));
                    f30459((SubLObject)module0431.$ic70$, module0048.f3387(var103, (SubLObject)module0431.UNPROVIDED, (SubLObject)module0431.UNPROVIDED));
                    f30459((SubLObject)module0431.$ic71$, module0048.f3384(var103));
                    f30459((SubLObject)module0431.$ic72$, module0048.f3387(var104, (SubLObject)module0431.UNPROVIDED, (SubLObject)module0431.UNPROVIDED));
                    f30459((SubLObject)module0431.$ic73$, module0048.f3384(var104));
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0431.T, var101);
                if (var105.isStream()) {
                    streams_high.close(var105, (SubLObject)module0431.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var107, var101);
            }
        }
        return var22;
    }
    
    public static SubLObject f30463(final SubLObject var1, SubLObject var104) {
        if (var104 == module0431.UNPROVIDED) {
            var104 = (SubLObject)module0431.NIL;
        }
        final SubLThread var105 = SubLProcess.currentSubLThread();
        assert module0431.NIL != f30444(var1) : var1;
        SubLObject var106 = f30445(var1);
        final SubLObject var107 = f30456(var1);
        final SubLObject var108 = PrintLow.format((SubLObject)module0431.NIL, (SubLObject)module0431.$ic74$, module0431.$g3508$.getDynamicValue(var105), module0431.$g3509$.getDynamicValue(var105));
        final SubLObject var109 = PrintLow.format((SubLObject)module0431.NIL, (SubLObject)module0431.$ic75$, module0431.$g3508$.getDynamicValue(var105), module0431.$g3509$.getDynamicValue(var105));
        SubLObject var110 = (SubLObject)module0431.NIL;
        SubLObject var111 = (SubLObject)module0431.NIL;
        if (var104.isInteger()) {
            var106 = module0035.f2124(var104, var106);
        }
        if (module0431.NIL != var108) {
            var110 = module0424.f29756(var108, (SubLObject)module0431.UNPROVIDED);
        }
        if (module0431.NIL != var109) {
            var111 = module0424.f29756(var109, (SubLObject)module0431.UNPROVIDED);
        }
        if (module0431.NIL != var110) {
            module0424.f29757(var110, var107);
        }
        if (module0431.NIL != var111) {
            module0424.f29757(var111, var107);
        }
        SubLObject var112 = var106;
        SubLObject var113 = (SubLObject)module0431.NIL;
        var113 = var112.first();
        while (module0431.NIL != var112) {
            if (module0431.NIL == module0012.$silent_progressP$.getDynamicValue(var105)) {
                print_high.princ((SubLObject)module0431.$ic76$, StreamsLow.$standard_output$.getDynamicValue(var105));
                streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var105));
            }
            f30452(var113, var107, var110, var111);
            var112 = var112.rest();
            var113 = var112.first();
        }
        if (var110.isStream()) {
            streams_high.close(var110, (SubLObject)module0431.UNPROVIDED);
        }
        if (var111.isStream()) {
            streams_high.close(var111, (SubLObject)module0431.UNPROVIDED);
        }
        f30462(var107, var108, var109);
        return var1;
    }
    
    public static SubLObject f30464(SubLObject var104) {
        if (var104 == module0431.UNPROVIDED) {
            var104 = (SubLObject)module0431.NIL;
        }
        final SubLThread var105 = SubLProcess.currentSubLThread();
        SubLObject var106 = (SubLObject)module0431.NIL;
        PrintLow.format((SubLObject)module0431.T, (SubLObject)module0431.$ic77$, module0051.f3552((SubLObject)module0431.UNPROVIDED));
        streams_high.force_output((SubLObject)module0431.UNPROVIDED);
        final SubLObject var107 = Time.get_internal_real_time();
        SubLObject var108 = module0431.$g3507$.getDynamicValue(var105);
        SubLObject var109 = (SubLObject)module0431.NIL;
        var109 = var108.first();
        while (module0431.NIL != var108) {
            f30463(var109, var104);
            var108 = var108.rest();
            var109 = var108.first();
        }
        var106 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var107), time_high.$internal_time_units_per_second$.getGlobalValue());
        PrintLow.format((SubLObject)module0431.T, (SubLObject)module0431.$ic78$, module0051.f3552((SubLObject)module0431.UNPROVIDED));
        streams_high.force_output((SubLObject)module0431.UNPROVIDED);
        PrintLow.format((SubLObject)module0431.T, (SubLObject)module0431.$ic79$, module0051.f3602(Numbers.truncate(var106, (SubLObject)module0431.UNPROVIDED)));
        streams_high.force_output((SubLObject)module0431.UNPROVIDED);
        return var106;
    }
    
    public static SubLObject f30465(final SubLObject var106, final SubLObject var107, SubLObject var104) {
        if (var104 == module0431.UNPROVIDED) {
            var104 = (SubLObject)module0431.NIL;
        }
        final SubLThread var108 = SubLProcess.currentSubLThread();
        SubLObject var109 = (SubLObject)module0431.NIL;
        final SubLObject var110 = module0431.$g3507$.currentBinding(var108);
        final SubLObject var111 = module0431.$g3508$.currentBinding(var108);
        try {
            module0431.$g3507$.bind((SubLObject)ConsesLow.list(var106), var108);
            module0431.$g3508$.bind(var107, var108);
            var109 = f30464(var104);
        }
        finally {
            module0431.$g3508$.rebind(var111, var108);
            module0431.$g3507$.rebind(var110, var108);
        }
        return var109;
    }
    
    public static SubLObject f30466(final SubLObject var108, final SubLObject var107, SubLObject var104) {
        if (var104 == module0431.UNPROVIDED) {
            var104 = (SubLObject)module0431.NIL;
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        assert module0431.NIL != module0128.f8449(var108) : var108;
        SubLObject var110 = (SubLObject)module0431.NIL;
        final SubLObject var111 = module0431.$g3507$.currentBinding(var109);
        final SubLObject var112 = module0431.$g3508$.currentBinding(var109);
        try {
            module0431.$g3507$.bind((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0431.$ic1$, var108)), var109);
            module0431.$g3508$.bind(var107, var109);
            var110 = f30464(var104);
        }
        finally {
            module0431.$g3508$.rebind(var112, var109);
            module0431.$g3507$.rebind(var111, var109);
        }
        return var110;
    }
    
    public static SubLObject f30467() {
        f30464((SubLObject)module0431.TWO_INTEGER);
        return (SubLObject)module0431.NIL;
    }
    
    public static SubLObject f30468(final SubLObject var16, final SubLObject var109, SubLObject var110) {
        if (var110 == module0431.UNPROVIDED) {
            var110 = Symbols.symbol_function((SubLObject)module0431.IDENTITY);
        }
        SubLObject var111 = (SubLObject)module0431.NIL;
        SubLObject var112 = var16;
        SubLObject var113 = (SubLObject)module0431.NIL;
        var113 = var112.first();
        while (module0431.NIL != var112) {
            if (module0431.NIL != Functions.funcall(var109, Functions.funcall(var110, var113))) {
                var111 = (SubLObject)ConsesLow.cons(var113, var111);
            }
            var112 = var112.rest();
            var113 = var112.first();
        }
        return Sequences.nreverse(var111);
    }
    
    public static SubLObject f30469(final SubLObject var16, final SubLObject var57, final SubLObject var40, SubLObject var109) {
        if (var109 == module0431.UNPROVIDED) {
            var109 = Symbols.symbol_function((SubLObject)module0431.EQUAL);
        }
        SubLObject var110 = (SubLObject)module0431.NIL;
        SubLObject var111 = var16;
        SubLObject var112 = (SubLObject)module0431.NIL;
        var112 = var111.first();
        while (module0431.NIL != var111) {
            if (module0431.NIL != Functions.funcall(var109, var40, module0424.f29640(var112, var57, var40))) {
                var110 = (SubLObject)ConsesLow.cons(var112, var110);
            }
            var111 = var111.rest();
            var112 = var111.first();
        }
        return Sequences.nreverse(var110);
    }
    
    public static SubLObject f30454(final SubLObject var16) {
        return f30468(var16, Symbols.symbol_function((SubLObject)module0431.$ic81$), Symbols.symbol_function((SubLObject)module0431.$ic82$));
    }
    
    public static SubLObject f30455(final SubLObject var16) {
        return f30469(var16, (SubLObject)module0431.$ic49$, (SubLObject)module0431.ZERO_INTEGER, (SubLObject)module0431.UNPROVIDED);
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
        return (SubLObject)module0431.NIL;
    }
    
    public static SubLObject f30471() {
        module0431.$g3507$ = SubLFiles.defvar("S#33708", (SubLObject)module0431.$ic0$);
        module0431.$g3508$ = SubLFiles.defparameter("S#33709", (SubLObject)module0431.$ic3$);
        module0431.$g3509$ = SubLFiles.defvar("S#33710", (SubLObject)module0431.NIL);
        module0431.$g3510$ = SubLFiles.deflexical("S#33711", (SubLObject)module0431.$ic20$);
        module0431.$g3511$ = SubLFiles.deflexical("S#33712", (SubLObject)module0431.$ic21$);
        return (SubLObject)module0431.NIL;
    }
    
    public static SubLObject f30472() {
        return (SubLObject)module0431.NIL;
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
        module0431.$g3507$ = null;
        module0431.$g3508$ = null;
        module0431.$g3509$ = null;
        module0431.$g3510$ = null;
        module0431.$g3511$ = null;
        $ic0$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Terrorist")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TerroristGroup")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("IndependentCountry")));
        $ic1$ = SubLObjectFactory.makeKeyword("TERM");
        $ic2$ = SubLObjectFactory.makeSymbol("S#33680", "CYC");
        $ic3$ = SubLObjectFactory.makeString("/cyc/projects/Topsail/query-suggestor");
        $ic4$ = SubLObjectFactory.makeSymbol("S#33682", "CYC");
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#16406", "CYC");
        $ic7$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("conceptPertinentToDegree"));
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("HighAmountFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Relevance"))));
        $ic9$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TaskModelMtFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Allotment-8")));
        $ic10$ = SubLObjectFactory.makeSymbol("?QUERY");
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("cycLQuerySpecificationPertinentToDegree"));
        $ic12$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("VeryHighAmountFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Relevance")));
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic15$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("formulaTemplateGloss"));
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TemplateFromTestQueryFn"));
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?GLOSS"));
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt"));
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?GLOSS")));
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME"));
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUIESCENCE"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWERABLES"), (SubLObject)SubLObjectFactory.makeKeyword("UNANSWERABLES"));
        $ic22$ = SubLObjectFactory.makeInteger(600);
        $ic23$ = SubLObjectFactory.makeKeyword("QUIESCENCE");
        $ic24$ = SubLObjectFactory.makeKeyword("ANSWERABLES");
        $ic25$ = SubLObjectFactory.makeKeyword("UNANSWERABLES");
        $ic26$ = SubLObjectFactory.makeKeyword("CONCEPT");
        $ic27$ = SubLObjectFactory.makeString("Concept not asserted to be pertinent");
        $ic28$ = SubLObjectFactory.makeString("~a/~a");
        $ic29$ = SubLObjectFactory.makeKeyword("TOTAL");
        $ic30$ = SubLObjectFactory.makeKeyword("RATIO");
        $ic31$ = SubLObjectFactory.makeString("~a/~a-~a.htm");
        $ic32$ = SubLObjectFactory.makeString("~a-~a");
        $ic33$ = SubLObjectFactory.makeString("~a");
        $ic34$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic35$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic36$ = SubLObjectFactory.makeString("Test Date: ");
        $ic37$ = SubLObjectFactory.makeString("KB: ");
        $ic38$ = SubLObjectFactory.makeString("System: ");
        $ic39$ = SubLObjectFactory.makeString("Test Type: ");
        $ic40$ = SubLObjectFactory.makeKeyword("APPEND");
        $ic41$ = SubLObjectFactory.makeString(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        $ic42$ = SubLObjectFactory.makeString("Concept: ");
        $ic43$ = SubLObjectFactory.makeString("Time to Quiescence:");
        $ic44$ = SubLObjectFactory.makeString("Total Number of Queries:");
        $ic45$ = SubLObjectFactory.makeString("Answerable/Unanswerable: ~A");
        $ic46$ = SubLObjectFactory.makeString("Answerable Queries:");
        $ic47$ = SubLObjectFactory.makeString("Unanswerable Queries:");
        $ic48$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic49$ = SubLObjectFactory.makeKeyword("ANSWER-COUNT");
        $ic50$ = SubLObjectFactory.makeKeyword("TOP");
        $ic51$ = SubLObjectFactory.makeInteger(150);
        $ic52$ = SubLObjectFactory.makeString("Number of Bindings: ");
        $ic53$ = SubLObjectFactory.makeString("Bindings: ");
        $ic54$ = SubLObjectFactory.makeKeyword("RESULT");
        $ic55$ = SubLObjectFactory.makeString("Time To First Answer: ");
        $ic56$ = SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER");
        $ic57$ = SubLObjectFactory.makeString("Complete Total Time: ");
        $ic58$ = SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME");
        $ic59$ = SubLObjectFactory.makeString("n~a");
        $ic60$ = SubLObjectFactory.makeString("~a/extra-answers/~a-~a-~a.htm");
        $ic61$ = SubLObjectFactory.makeString("Bindings for Query");
        $ic62$ = SubLObjectFactory.makeString("~a/~a.htm");
        $ic63$ = SubLObjectFactory.makeString("Back to Main Test Run");
        $ic64$ = SubLObjectFactory.makeString("Query: ");
        $ic65$ = SubLObjectFactory.makeString("Bindings:");
        $ic66$ = SubLObjectFactory.makeString("****************************************");
        $ic67$ = SubLObjectFactory.makeString("Test run Summary");
        $ic68$ = SubLObjectFactory.makeString("Median Quiescence Time: ");
        $ic69$ = SubLObjectFactory.makeString("Mean Quiescence Time: ");
        $ic70$ = SubLObjectFactory.makeString("Median Answerables: ");
        $ic71$ = SubLObjectFactory.makeString("Mean Answerables: ");
        $ic72$ = SubLObjectFactory.makeString("Median Unanswerables: ");
        $ic73$ = SubLObjectFactory.makeString("Mean Unanswerables: ");
        $ic74$ = SubLObjectFactory.makeString("~a/~a-concepts.cfasl");
        $ic75$ = SubLObjectFactory.makeString("~a/~a-queries.cfasl");
        $ic76$ = SubLObjectFactory.makeString("*");
        $ic77$ = SubLObjectFactory.makeString("~%Run starting at ~A");
        $ic78$ = SubLObjectFactory.makeString("~%Run ended at ~A");
        $ic79$ = SubLObjectFactory.makeString("~%Elapsed time: ~A");
        $ic80$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic81$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic82$ = SubLObjectFactory.makeSymbol("S#32805", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0431.class
	Total time: 674 ms
	
	Decompiled with Procyon 0.5.32.
*/