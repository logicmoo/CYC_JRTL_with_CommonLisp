package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0681 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0681";
    public static final String myFingerPrint = "554e1a12a942f08d937484f458a68142c1d93bd4271899122baa9eaae89ad45f";
    public static SubLSymbol $g5345$;
    public static SubLSymbol $g5346$;
    private static SubLSymbol $g5347$;
    private static SubLSymbol $g5348$;
    private static SubLSymbol $g5349$;
    private static final SubLObject $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLSymbol $ic48$;
    
    public static SubLObject f41611(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0681.UNPROVIDED) {
            var2 = (SubLObject)module0681.$ic2$;
        }
        if (var3 == module0681.UNPROVIDED) {
            var3 = (SubLObject)module0681.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0681.NIL == var3) {
            var3 = (SubLObject)module0681.$ic3$;
        }
        final SubLObject var5 = module0656.f39832((SubLObject)module0681.$ic4$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var4), (SubLObject)module0681.$ic5$, module0174.f11025(var1), module0655.f39759(var2));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
        if (module0681.NIL != var5) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
            module0642.f39020(var5);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0681.UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var4);
        try {
            module0015.$g533$.bind((SubLObject)module0681.T, var4);
            module0642.f39019(var3);
        }
        finally {
            module0015.$g533$.rebind(var6, var4);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f41612(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)module0681.NIL;
        SubLObject var10 = (SubLObject)module0681.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var7, (SubLObject)module0681.$ic8$);
        var9 = var7.first();
        SubLObject var11 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var7, (SubLObject)module0681.$ic8$);
        var10 = var11.first();
        var11 = var11.rest();
        if (module0681.NIL == var11) {
            final SubLObject var12 = module0656.f39970(var9);
            final SubLObject var13 = module0655.f39758(var10);
            final SubLObject var14 = (SubLObject)module0681.$ic9$;
            final SubLObject var15 = module0015.$g538$.currentBinding(var8);
            try {
                module0015.$g538$.bind((module0681.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var8))) ? module0015.$g538$.getDynamicValue(var8) : module0057.f4173((SubLObject)module0681.UNPROVIDED, (SubLObject)module0681.UNPROVIDED, (SubLObject)module0681.UNPROVIDED), var8);
                module0642.f39020((SubLObject)module0681.$ic10$);
                module0642.f39029((SubLObject)module0681.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var8), module0655.$g5142$.getDynamicValue(var8));
                final SubLObject var16 = module0014.f672((SubLObject)module0681.$ic11$);
                module0642.f39029((SubLObject)module0681.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                module0642.f39020((SubLObject)module0681.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                if (module0681.NIL != var16) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                    module0642.f39020(var16);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                module0642.f39020((SubLObject)module0681.$ic13$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0681.UNPROVIDED);
                module0016.f941();
                if (module0681.NIL != var14) {
                    module0642.f39029((SubLObject)module0681.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var14);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0681.UNPROVIDED);
                final SubLObject var6_14 = module0015.$g535$.currentBinding(var8);
                try {
                    module0015.$g535$.bind((SubLObject)module0681.T, var8);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0681.NIL != module0015.$g132$.getDynamicValue(var8)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var8)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                    module0642.f39020((SubLObject)module0681.$ic16$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0681.UNPROVIDED);
                    final SubLObject var6_15 = module0015.$g533$.currentBinding(var8);
                    try {
                        module0015.$g533$.bind((SubLObject)module0681.T, var8);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                        module0642.f39020((SubLObject)module0681.$ic17$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0681.UNPROVIDED);
                        final SubLObject var6_16 = module0015.$g533$.currentBinding(var8);
                        try {
                            module0015.$g533$.bind((SubLObject)module0681.T, var8);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                            module0642.f39020((SubLObject)module0681.$ic18$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                            module0642.f39020((SubLObject)module0681.$ic19$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                            module0642.f39019((SubLObject)module0681.$ic20$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0681.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0681.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var6_16, var8);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0681.NIL != var14) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0681.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0681.UNPROVIDED);
                            module0642.f39019(var14);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0681.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0681.UNPROVIDED);
                        }
                        module0642.f39019((SubLObject)module0681.$ic21$);
                        module0656.f39804(var12, (SubLObject)module0681.UNPROVIDED, (SubLObject)module0681.UNPROVIDED);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)module0681.$ic22$, (SubLObject)((module0681.$ic2$ == var13) ? module0681.$ic23$ : Sequences.length(var13)));
                        module0642.f39026((SubLObject)module0681.UNPROVIDED);
                        streams_high.force_output(module0015.$g131$.getDynamicValue(var8));
                        module0642.f39051((SubLObject)module0681.UNPROVIDED, (SubLObject)module0681.UNPROVIDED);
                        var8.resetMultipleValues();
                        final SubLObject var17 = module0531.f33181(var12, var13, module0681.$ic24$, module0681.$g5347$.getDynamicValue(var8));
                        final SubLObject var18 = var8.secondMultipleValue();
                        var8.resetMultipleValues();
                        if (module0681.$ic25$ == var18) {
                            PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)module0681.$ic26$, module0681.$g5347$.getDynamicValue(var8), module0681.$g5347$.getDynamicValue(var8));
                        }
                        else {
                            SubLObject var19 = var17;
                            SubLObject var20 = (SubLObject)module0681.NIL;
                            var20 = var19.first();
                            while (module0681.NIL != var19) {
                                f41613(var20);
                                module0642.f39051((SubLObject)module0681.UNPROVIDED, (SubLObject)module0681.UNPROVIDED);
                                var19 = var19.rest();
                                var20 = var19.first();
                            }
                        }
                        module0642.f39029((SubLObject)module0681.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var6_15, var8);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0681.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var6_14, var8);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0681.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var15, var8);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)module0681.$ic8$);
        }
        return (SubLObject)module0681.NIL;
    }
    
    public static SubLObject f41613(final SubLObject var20) {
        SubLObject var21 = (SubLObject)module0681.NIL;
        SubLObject var22 = (SubLObject)module0681.NIL;
        SubLObject var23 = (SubLObject)module0681.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)module0681.$ic28$);
        var21 = var20.first();
        SubLObject var24 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)module0681.$ic28$);
        var22 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)module0681.$ic28$);
        var23 = var24.first();
        var24 = var24.rest();
        if (module0681.NIL == var24) {
            module0642.f39021((SubLObject)module0681.$ic29$);
            module0656.f39804(var22, (SubLObject)module0681.UNPROVIDED, (SubLObject)module0681.UNPROVIDED);
            module0642.f39026((SubLObject)module0681.ONE_INTEGER);
            final SubLObject var25 = module0202.f12782(var22, var21);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0656.f39837((SubLObject)module0681.$ic30$, var25, (SubLObject)module0681.$ic31$, (SubLObject)module0681.UNPROVIDED, (SubLObject)module0681.UNPROVIDED, (SubLObject)module0681.UNPROVIDED);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39032((SubLObject)module0681.UNPROVIDED);
            module0656.f39804(var21, (SubLObject)module0681.UNPROVIDED, (SubLObject)module0681.UNPROVIDED);
            module0642.f39026((SubLObject)module0681.TWO_INTEGER);
            module0642.f39021((SubLObject)module0681.$ic32$);
            module0642.f39026((SubLObject)module0681.UNPROVIDED);
            module0671.f41013(var23, (SubLObject)module0681.UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0681.$ic28$);
        }
        return (SubLObject)module0681.NIL;
    }
    
    public static SubLObject f41614() {
        final SubLObject var27 = module0681.$g5348$.getGlobalValue();
        if (module0681.NIL != var27) {
            module0034.f1818(var27);
        }
        return (SubLObject)module0681.NIL;
    }
    
    public static SubLObject f41615(final SubLObject var24) {
        return module0034.f1829(module0681.$g5348$.getGlobalValue(), (SubLObject)ConsesLow.list(var24), (SubLObject)module0681.UNPROVIDED, (SubLObject)module0681.UNPROVIDED);
    }
    
    public static SubLObject f41616(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        assert module0681.NIL != module0161.f10481(var24) : var24;
        final SubLObject var26 = module0077.f5313(Symbols.symbol_function((SubLObject)module0681.EQL), (SubLObject)module0681.UNPROVIDED);
        final SubLObject var27 = module0158.f10289(var24);
        if (var27.eql((SubLObject)module0681.$ic35$)) {
            if (module0681.NIL != module0158.f10270(var24, (SubLObject)module0681.NIL)) {
                final SubLObject var28 = module0158.f10271(var24);
                SubLObject var29 = (SubLObject)module0681.NIL;
                try {
                    var29 = module0158.f10316(var28, (SubLObject)module0681.NIL, (SubLObject)module0681.NIL, (SubLObject)module0681.NIL);
                    SubLObject var30 = (SubLObject)module0681.NIL;
                    final SubLObject var31 = (SubLObject)module0681.NIL;
                    while (module0681.NIL == var30) {
                        final SubLObject var32 = module0052.f3695(var29, var31);
                        final SubLObject var33 = (SubLObject)SubLObjectFactory.makeBoolean(!var31.eql(var32));
                        if (module0681.NIL != var33 && module0681.NIL != module0178.f11290(var32)) {
                            module0077.f5326(var32, var26);
                        }
                        var30 = (SubLObject)SubLObjectFactory.makeBoolean(module0681.NIL == var33);
                    }
                }
                finally {
                    final SubLObject var34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0681.T, var25);
                        if (module0681.NIL != var29) {
                            module0158.f10319(var29);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var34, var25);
                    }
                }
            }
        }
        else if (var27.eql((SubLObject)module0681.$ic36$) && module0681.NIL != module0158.f10286(var24, (SubLObject)module0681.NIL)) {
            final SubLObject var35 = module0174.f11010();
            final SubLObject var36 = (SubLObject)module0681.$ic37$;
            final SubLObject var37 = module0065.f4733(var35);
            SubLObject var38 = (SubLObject)module0681.ZERO_INTEGER;
            assert module0681.NIL != Types.stringp(var36) : var36;
            final SubLObject var39 = module0012.$g75$.currentBinding(var25);
            final SubLObject var40 = module0012.$g76$.currentBinding(var25);
            final SubLObject var41 = module0012.$g77$.currentBinding(var25);
            final SubLObject var42 = module0012.$g78$.currentBinding(var25);
            try {
                module0012.$g75$.bind((SubLObject)module0681.ZERO_INTEGER, var25);
                module0012.$g76$.bind((SubLObject)module0681.NIL, var25);
                module0012.$g77$.bind((SubLObject)module0681.T, var25);
                module0012.$g78$.bind(Time.get_universal_time(), var25);
                module0012.f478(var36);
                final SubLObject var43_44 = var35;
                if (module0681.NIL == module0065.f4772(var43_44, (SubLObject)module0681.$ic39$)) {
                    final SubLObject var45_46 = var43_44;
                    if (module0681.NIL == module0065.f4775(var45_46, (SubLObject)module0681.$ic39$)) {
                        final SubLObject var43 = module0065.f4740(var45_46);
                        final SubLObject var44 = (SubLObject)module0681.NIL;
                        SubLObject var45;
                        SubLObject var46;
                        SubLObject var47;
                        SubLObject var48;
                        for (var45 = Sequences.length(var43), var46 = (SubLObject)module0681.NIL, var46 = (SubLObject)module0681.ZERO_INTEGER; var46.numL(var45); var46 = Numbers.add(var46, (SubLObject)module0681.ONE_INTEGER)) {
                            var47 = ((module0681.NIL != var44) ? Numbers.subtract(var45, var46, (SubLObject)module0681.ONE_INTEGER) : var46);
                            var48 = Vectors.aref(var43, var47);
                            if (module0681.NIL == module0065.f4749(var48) || module0681.NIL == module0065.f4773((SubLObject)module0681.$ic39$)) {
                                if (module0681.NIL != module0065.f4749(var48)) {
                                    var48 = (SubLObject)module0681.$ic39$;
                                }
                                module0012.note_percent_progress(var38, var37);
                                var38 = Numbers.add(var38, (SubLObject)module0681.ONE_INTEGER);
                                if (module0681.NIL != module0158.f10287(var48, var24, (SubLObject)module0681.NIL, (SubLObject)module0681.NIL) && module0681.NIL != module0178.f11290(var48)) {
                                    module0077.f5326(var48, var26);
                                }
                            }
                        }
                    }
                    final SubLObject var52_53 = var43_44;
                    if (module0681.NIL == module0065.f4777(var52_53) || module0681.NIL == module0065.f4773((SubLObject)module0681.$ic39$)) {
                        final SubLObject var49 = module0065.f4738(var52_53);
                        SubLObject var50 = module0065.f4739(var52_53);
                        final SubLObject var51 = module0065.f4734(var52_53);
                        final SubLObject var52 = (SubLObject)((module0681.NIL != module0065.f4773((SubLObject)module0681.$ic39$)) ? module0681.NIL : module0681.$ic39$);
                        while (var50.numL(var51)) {
                            final SubLObject var53 = Hashtables.gethash_without_values(var50, var49, var52);
                            if (module0681.NIL == module0065.f4773((SubLObject)module0681.$ic39$) || module0681.NIL == module0065.f4749(var53)) {
                                module0012.note_percent_progress(var38, var37);
                                var38 = Numbers.add(var38, (SubLObject)module0681.ONE_INTEGER);
                                if (module0681.NIL != module0158.f10287(var53, var24, (SubLObject)module0681.NIL, (SubLObject)module0681.NIL) && module0681.NIL != module0178.f11290(var53)) {
                                    module0077.f5326(var53, var26);
                                }
                            }
                            var50 = Numbers.add(var50, (SubLObject)module0681.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var42, var25);
                module0012.$g77$.rebind(var41, var25);
                module0012.$g76$.rebind(var40, var25);
                module0012.$g75$.rebind(var39, var25);
            }
        }
        return module0077.f5312(var26);
    }
    
    public static SubLObject f41617(final SubLObject var24) {
        SubLObject var25 = module0681.$g5348$.getGlobalValue();
        if (module0681.NIL == var25) {
            var25 = module0034.f1934((SubLObject)module0681.$ic33$, (SubLObject)module0681.$ic40$, (SubLObject)module0681.NIL, (SubLObject)module0681.EQL, (SubLObject)module0681.ONE_INTEGER, (SubLObject)module0681.ZERO_INTEGER);
        }
        SubLObject var26 = module0034.f1814(var25, var24, (SubLObject)module0681.$ic41$);
        if (var26 == module0681.$ic41$) {
            var26 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f41616(var24)));
            module0034.f1816(var25, var24, var26, (SubLObject)module0681.UNPROVIDED);
        }
        return module0034.f1959(var26);
    }
    
    public static SubLObject f41618() {
        final SubLObject var27 = module0681.$g5349$.getGlobalValue();
        if (module0681.NIL != var27) {
            module0034.f1818(var27);
        }
        return (SubLObject)module0681.NIL;
    }
    
    public static SubLObject f41619() {
        return module0034.f1829(module0681.$g5349$.getGlobalValue(), (SubLObject)ConsesLow.list(module0681.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0681.UNPROVIDED, (SubLObject)module0681.UNPROVIDED);
    }
    
    public static SubLObject f41620() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0077.f5313(Symbols.symbol_function((SubLObject)module0681.EQL), (SubLObject)module0681.UNPROVIDED);
        final SubLObject var6 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)module0681.$ic43$, var4);
            module0147.$g2095$.bind(module0681.$ic44$, var4);
            final SubLObject var8 = module0681.$ic45$;
            if (module0681.NIL != module0158.f10038(var8)) {
                final SubLObject var9 = (SubLObject)module0681.NIL;
                final SubLObject var6_61 = module0012.$g73$.currentBinding(var4);
                final SubLObject var40_62 = module0012.$g65$.currentBinding(var4);
                final SubLObject var10 = module0012.$g67$.currentBinding(var4);
                final SubLObject var11 = module0012.$g68$.currentBinding(var4);
                final SubLObject var12 = module0012.$g66$.currentBinding(var4);
                final SubLObject var13 = module0012.$g69$.currentBinding(var4);
                final SubLObject var14 = module0012.$g70$.currentBinding(var4);
                final SubLObject var15 = module0012.$silent_progressP$.currentBinding(var4);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var4);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var4), var4);
                    module0012.$g67$.bind((SubLObject)module0681.ONE_INTEGER, var4);
                    module0012.$g68$.bind((SubLObject)module0681.ZERO_INTEGER, var4);
                    module0012.$g66$.bind((SubLObject)module0681.ZERO_INTEGER, var4);
                    module0012.$g69$.bind((SubLObject)module0681.ZERO_INTEGER, var4);
                    module0012.$g70$.bind((SubLObject)module0681.T, var4);
                    module0012.$silent_progressP$.bind((SubLObject)((module0681.NIL != var9) ? module0012.$silent_progressP$.getDynamicValue(var4) : module0681.T), var4);
                    module0012.f474(var9);
                    final SubLObject var16 = module0158.f10039(var8);
                    SubLObject var17 = (SubLObject)module0681.NIL;
                    final SubLObject var18 = (SubLObject)module0681.NIL;
                    while (module0681.NIL == var17) {
                        final SubLObject var19 = module0052.f3695(var16, var18);
                        final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                        if (module0681.NIL != var20) {
                            module0012.f476();
                            SubLObject var21 = (SubLObject)module0681.NIL;
                            try {
                                var21 = module0158.f10316(var19, (SubLObject)module0681.$ic46$, (SubLObject)module0681.NIL, (SubLObject)module0681.NIL);
                                SubLObject var32_69 = (SubLObject)module0681.NIL;
                                final SubLObject var33_70 = (SubLObject)module0681.NIL;
                                while (module0681.NIL == var32_69) {
                                    final SubLObject var22 = module0052.f3695(var21, var33_70);
                                    final SubLObject var35_71 = (SubLObject)SubLObjectFactory.makeBoolean(!var33_70.eql(var22));
                                    if (module0681.NIL != var35_71) {
                                        final SubLObject var23 = module0178.f11334(var22);
                                        final SubLObject var24 = module0178.f11335(var22);
                                        if (module0681.NIL != module0259.f16854(var23, module0681.$ic47$, (SubLObject)module0681.UNPROVIDED, (SubLObject)module0681.UNPROVIDED)) {
                                            module0077.f5326(var24, var5);
                                        }
                                    }
                                    var32_69 = (SubLObject)SubLObjectFactory.makeBoolean(module0681.NIL == var35_71);
                                }
                            }
                            finally {
                                final SubLObject var6_62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0681.T, var4);
                                    if (module0681.NIL != var21) {
                                        module0158.f10319(var21);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var6_62, var4);
                                }
                            }
                        }
                        var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0681.NIL == var20);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var15, var4);
                    module0012.$g70$.rebind(var14, var4);
                    module0012.$g69$.rebind(var13, var4);
                    module0012.$g66$.rebind(var12, var4);
                    module0012.$g68$.rebind(var11, var4);
                    module0012.$g67$.rebind(var10, var4);
                    module0012.$g65$.rebind(var40_62, var4);
                    module0012.$g73$.rebind(var6_61, var4);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var7, var4);
            module0147.$g2094$.rebind(var6, var4);
        }
        return module0077.f5312(var5);
    }
    
    public static SubLObject f41621() {
        SubLObject var57 = module0681.$g5349$.getGlobalValue();
        if (module0681.NIL == var57) {
            var57 = module0034.f1934((SubLObject)module0681.$ic42$, (SubLObject)module0681.$ic48$, (SubLObject)module0681.NIL, (SubLObject)module0681.EQL, (SubLObject)module0681.ZERO_INTEGER, (SubLObject)module0681.ZERO_INTEGER);
        }
        SubLObject var58 = module0034.f1810(var57, (SubLObject)module0681.UNPROVIDED);
        if (var58 == module0681.$ic41$) {
            var58 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f41620()));
            module0034.f1812(var57, var58, (SubLObject)module0681.UNPROVIDED);
        }
        return module0034.f1959(var58);
    }
    
    public static SubLObject f41622() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0681", "f41611", "S#45596", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0681", "f41612", "CB-SHOW-CONSEQUENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0681", "f41613", "S#45597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0681", "f41614", "S#45598", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0681", "f41615", "S#45599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0681", "f41616", "S#45600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0681", "f41617", "S#45601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0681", "f41618", "S#45602", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0681", "f41619", "S#45603", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0681", "f41620", "S#45604", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0681", "f41621", "S#45605", 0, 0, false);
        return (SubLObject)module0681.NIL;
    }
    
    public static SubLObject f41623() {
        module0681.$g5345$ = SubLFiles.defparameter("S#45606", (SubLObject)module0681.NIL);
        module0681.$g5346$ = SubLFiles.defparameter("S#45607", module0681.$ic0$);
        module0681.$g5347$ = SubLFiles.defparameter("S#45608", (SubLObject)module0681.$ic1$);
        module0681.$g5348$ = SubLFiles.deflexical("S#45609", (SubLObject)module0681.NIL);
        module0681.$g5349$ = SubLFiles.deflexical("S#45610", (SubLObject)module0681.NIL);
        return (SubLObject)module0681.NIL;
    }
    
    public static SubLObject f41624() {
        module0656.f39840((SubLObject)module0681.$ic6$, (SubLObject)module0681.$ic7$, (SubLObject)module0681.THREE_INTEGER);
        module0015.f873((SubLObject)module0681.$ic27$);
        module0034.f1909((SubLObject)module0681.$ic33$);
        module0034.f1909((SubLObject)module0681.$ic42$);
        return (SubLObject)module0681.NIL;
    }
    
    public void declareFunctions() {
        f41622();
    }
    
    public void initializeVariables() {
        f41623();
    }
    
    public void runTopLevelForms() {
        f41624();
    }
    
    static {
        me = (SubLFile)new module0681();
        module0681.$g5345$ = null;
        module0681.$g5346$ = null;
        module0681.$g5347$ = null;
        module0681.$g5348$ = null;
        module0681.$g5349$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BiologyMt"));
        $ic1$ = SubLObjectFactory.makeInteger(30);
        $ic2$ = SubLObjectFactory.makeKeyword("ALL");
        $ic3$ = SubLObjectFactory.makeString("[Show Consequences]");
        $ic4$ = SubLObjectFactory.makeKeyword("SELF");
        $ic5$ = SubLObjectFactory.makeString("cb-show-consequences&~a&~a");
        $ic6$ = SubLObjectFactory.makeKeyword("SHOW-CONSEQUENCES");
        $ic7$ = SubLObjectFactory.makeSymbol("S#45596", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ID"), (SubLObject)SubLObjectFactory.makeSymbol("S#45611", "CYC"));
        $ic9$ = SubLObjectFactory.makeString("Show Consequences");
        $ic10$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic11$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic12$ = SubLObjectFactory.makeString("stylesheet");
        $ic13$ = SubLObjectFactory.makeString("text/css");
        $ic14$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic15$ = SubLObjectFactory.makeString("text/javascript");
        $ic16$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic17$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic18$ = SubLObjectFactory.makeString("button");
        $ic19$ = SubLObjectFactory.makeString("reload");
        $ic20$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic21$ = SubLObjectFactory.makeString("Generating consequences of ");
        $ic22$ = SubLObjectFactory.makeString(", considering ~a rules...");
        $ic23$ = SubLObjectFactory.makeString("all");
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic25$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic26$ = SubLObjectFactory.makeString("Timed out after ~a second~P.");
        $ic27$ = SubLObjectFactory.makeSymbol("CB-SHOW-CONSEQUENCES");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45612", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14271", "CYC"));
        $ic29$ = SubLObjectFactory.makeString("In Mt: ");
        $ic30$ = SubLObjectFactory.makeKeyword("SENTENCE-QUERY-SIMILAR");
        $ic31$ = SubLObjectFactory.makeString("[Query]");
        $ic32$ = SubLObjectFactory.makeString("Justification:");
        $ic33$ = SubLObjectFactory.makeSymbol("S#45601", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic35$ = SubLObjectFactory.makeKeyword("MT");
        $ic36$ = SubLObjectFactory.makeKeyword("BROAD-MT");
        $ic37$ = SubLObjectFactory.makeString("do-broad-mt-index");
        $ic38$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic39$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic40$ = SubLObjectFactory.makeSymbol("S#45609", "CYC");
        $ic41$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic42$ = SubLObjectFactory.makeSymbol("S#45605", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic44$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic45$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("queryPracticeRules"));
        $ic46$ = SubLObjectFactory.makeKeyword("GAF");
        $ic47$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CytologicalProcessProjectKBContentTestQuery"));
        $ic48$ = SubLObjectFactory.makeSymbol("S#45610", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0681.class
	Total time: 285 ms
	
	Decompiled with Procyon 0.5.32.
*/