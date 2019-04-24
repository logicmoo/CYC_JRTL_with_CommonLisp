package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0693 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0693";
    public static final String myFingerPrint = "19414f1e4240ed974a7cff21ec46ededf8ee4d1992d5216f012bc3baa26e9a8f";
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
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
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    
    public static SubLObject f42411(SubLObject var1) {
        if (var1 == module0693.UNPROVIDED) {
            var1 = (SubLObject)module0693.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0693.NIL == var1) {
            var1 = (SubLObject)module0693.$ic0$;
        }
        final SubLObject var3 = module0656.f39832((SubLObject)module0693.$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0693.$ic2$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
        if (module0693.NIL != var3) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0693.T, var2);
            module0642.f39019(var1);
        }
        finally {
            module0015.$g533$.rebind(var4, var2);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0693.NIL;
    }
    
    public static SubLObject f42412(final SubLObject var5) {
        return f42413((SubLObject)module0693.UNPROVIDED);
    }
    
    public static SubLObject f42413(SubLObject var6) {
        if (var6 == module0693.UNPROVIDED) {
            var6 = (SubLObject)module0693.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = (SubLObject)module0693.$ic6$;
        final SubLObject var9 = module0015.$g538$.currentBinding(var7);
        try {
            module0015.$g538$.bind((module0693.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var7))) ? module0015.$g538$.getDynamicValue(var7) : module0057.f4173((SubLObject)module0693.UNPROVIDED, (SubLObject)module0693.UNPROVIDED, (SubLObject)module0693.UNPROVIDED), var7);
            module0642.f39020((SubLObject)module0693.$ic7$);
            module0642.f39029((SubLObject)module0693.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
            final SubLObject var10 = module0014.f672((SubLObject)module0693.$ic8$);
            module0642.f39029((SubLObject)module0693.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
            module0642.f39020((SubLObject)module0693.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
            if (module0693.NIL != var10) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
            module0642.f39020((SubLObject)module0693.$ic10$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
            module0016.f941();
            if (module0693.NIL != var8) {
                module0642.f39029((SubLObject)module0693.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var8);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0693.UNPROVIDED);
            final SubLObject var4_9 = module0015.$g535$.currentBinding(var7);
            try {
                module0015.$g535$.bind((SubLObject)module0693.T, var7);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0693.NIL != module0015.$g132$.getDynamicValue(var7)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var7)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                module0642.f39020((SubLObject)module0693.$ic13$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                final SubLObject var4_10 = module0015.$g533$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)module0693.T, var7);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                    module0642.f39020((SubLObject)module0693.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                    final SubLObject var4_11 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)module0693.T, var7);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39020((SubLObject)module0693.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39020((SubLObject)module0693.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39019((SubLObject)module0693.$ic17$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_11, var7);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0693.NIL != var8) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0693.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39019(var8);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0693.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                    }
                    if (module0693.NIL == module0577.$g4228$.getDynamicValue(var7)) {
                        module0642.f39019((SubLObject)module0693.$ic18$);
                    }
                    else {
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39020((SubLObject)module0693.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39020((SubLObject)module0693.THREE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39020((SubLObject)module0693.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39020(module0015.$g358$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39020((SubLObject)module0693.$ic19$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                        final SubLObject var4_12 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)module0693.T, var7);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                            module0642.f39020((SubLObject)module0693.$ic20$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0693.$ic21$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                            final SubLObject var4_13 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)module0693.T, var7);
                                module0642.f39020(module0015.$g362$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                                final SubLObject var4_14 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0693.T, var7);
                                    module0642.f39019((SubLObject)module0693.$ic22$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_14, var7);
                                }
                                module0642.f39020(module0015.$g363$.getGlobalValue());
                                module0642.f39020(module0015.$g362$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                                final SubLObject var4_15 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0693.T, var7);
                                    module0642.f39019((SubLObject)module0693.$ic23$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_15, var7);
                                }
                                module0642.f39020(module0015.$g363$.getGlobalValue());
                                module0642.f39020(module0015.$g362$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                                final SubLObject var4_16 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0693.T, var7);
                                    module0642.f39019((SubLObject)module0693.$ic24$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_16, var7);
                                }
                                module0642.f39020(module0015.$g363$.getGlobalValue());
                                module0642.f39020(module0015.$g362$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                                final SubLObject var4_17 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0693.T, var7);
                                    module0642.f39019((SubLObject)module0693.$ic25$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_17, var7);
                                }
                                module0642.f39020(module0015.$g363$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_13, var7);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0693.UNPROVIDED);
                            SubLObject var11 = (SubLObject)module0693.NIL;
                            if (module0693.NIL == module0655.$g5111$.getDynamicValue(var7)) {
                                var11 = (SubLObject)module0693.$ic26$;
                            }
                            SubLObject var12 = (SubLObject)module0693.NIL;
                            SubLObject var13 = (SubLObject)module0693.NIL;
                            SubLObject var14 = (SubLObject)module0693.NIL;
                            SubLObject var15 = (SubLObject)module0693.NIL;
                            var13 = module0577.$g4228$.getDynamicValue(var7);
                            var14 = var13.first();
                            for (var15 = (SubLObject)module0693.ZERO_INTEGER; module0693.NIL != var13; var13 = var13.rest(), var14 = var13.first(), var15 = Numbers.add((SubLObject)module0693.ONE_INTEGER, var15)) {
                                if (module0693.NIL != module0655.$g5111$.getDynamicValue(var7)) {
                                    if (module0693.NIL != var12) {
                                        var12 = (SubLObject)module0693.NIL;
                                    }
                                    else {
                                        var12 = (SubLObject)module0693.T;
                                    }
                                    var11 = (SubLObject)((module0693.NIL != var12) ? module0693.$ic27$ : module0693.$ic26$);
                                }
                                if (module0693.NIL == var6 || module0577.f35440(var14).eql(var6)) {
                                    final SubLObject var16 = module0577.f35439(var14);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    if (module0693.NIL != var11) {
                                        module0642.f39020(module0015.$g366$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                        module0642.f39020(var11);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                    }
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                                    final SubLObject var4_18 = module0015.$g533$.currentBinding(var7);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0693.T, var7);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39046(module0015.$g369$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0693.$ic20$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0693.$ic21$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                                        final SubLObject var4_19 = module0015.$g533$.currentBinding(var7);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0693.T, var7);
                                            final SubLObject var17 = module0577.f35442(var14);
                                            if (var17.isNumber()) {
                                                var7.resetMultipleValues();
                                                final SubLObject var18 = Time.decode_universal_time(var17, (SubLObject)module0693.UNPROVIDED);
                                                final SubLObject var19 = var7.secondMultipleValue();
                                                final SubLObject var20 = var7.thirdMultipleValue();
                                                final SubLObject var21 = var7.fourthMultipleValue();
                                                final SubLObject var22 = var7.fifthMultipleValue();
                                                final SubLObject var23 = var7.sixthMultipleValue();
                                                var7.resetMultipleValues();
                                                module0642.f39019(PrintLow.format((SubLObject)module0693.NIL, (SubLObject)module0693.$ic28$, new SubLObject[] { var23, var22, var21, var20, var19, var18 }));
                                            }
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var4_19, var7);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0693.$ic21$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                                        final SubLObject var4_20 = module0015.$g533$.currentBinding(var7);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0693.T, var7);
                                            final SubLObject var24 = module0577.f35441(var14);
                                            if (module0693.NIL != var24) {
                                                module0656.f39804(var24, (SubLObject)module0693.UNPROVIDED, (SubLObject)module0693.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var4_20, var7);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0693.$ic20$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0693.$ic21$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                                        final SubLObject var4_21 = module0015.$g533$.currentBinding(var7);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0693.T, var7);
                                            final SubLObject var25 = module0577.f35458(var14);
                                            if (module0693.NIL != var25 && var25.isFunctionSpec()) {
                                                Functions.funcall(var25, var16);
                                            }
                                            else {
                                                module0642.f39019((SubLObject)module0693.$ic29$);
                                                module0642.f39019(module0577.f35440(var14));
                                            }
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var4_21, var7);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g373$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0693.$ic21$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                                        final SubLObject var4_22 = module0015.$g533$.currentBinding(var7);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0693.T, var7);
                                            final SubLObject var26 = module0577.f35459(var14);
                                            if (module0693.NIL == var26) {
                                                module0642.f39019((SubLObject)module0693.$ic30$);
                                            }
                                            else {
                                                final SubLObject var27 = PrintLow.format((SubLObject)module0693.NIL, (SubLObject)module0693.$ic31$, var26, var16);
                                                module0642.f39020(module0015.$g381$.getGlobalValue());
                                                module0642.f39020(module0015.$g383$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                                module0642.f39020(var27);
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                                                final SubLObject var4_23 = module0015.$g533$.currentBinding(var7);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0693.T, var7);
                                                    module0642.f39019((SubLObject)module0693.$ic30$);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var4_23, var7);
                                                }
                                                module0642.f39020(module0015.$g382$.getGlobalValue());
                                            }
                                            module0642.f39027((SubLObject)module0693.$ic32$, (SubLObject)module0693.UNPROVIDED);
                                            final SubLObject var27 = PrintLow.format((SubLObject)module0693.NIL, (SubLObject)module0693.$ic33$, var16);
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                            module0642.f39020(var27);
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0693.UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0693.UNPROVIDED);
                                            final SubLObject var4_24 = module0015.$g533$.currentBinding(var7);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0693.T, var7);
                                                module0642.f39019((SubLObject)module0693.$ic34$);
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var4_24, var7);
                                            }
                                            module0642.f39020(module0015.$g382$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var4_22, var7);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_18, var7);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)module0693.UNPROVIDED);
                                }
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var4_12, var7);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                    }
                    module0642.f39029((SubLObject)module0693.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_10, var7);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0693.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_9, var7);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0693.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var9, var7);
        }
        return (SubLObject)module0693.NIL;
    }
    
    public static SubLObject f42414(final SubLObject var5) {
        final SubLObject var6 = module0665.f40432(var5);
        SubLObject var7 = Hashtables.gethash((SubLObject)module0693.$ic35$, var6, (SubLObject)module0693.UNPROVIDED).first();
        if (module0693.NIL == var7) {
            var7 = Hashtables.gethash((SubLObject)module0693.$ic36$, var6, (SubLObject)module0693.UNPROVIDED).first();
        }
        final SubLObject var8 = module0577.f35456(var7);
        if (module0693.NIL != var8) {
            module0577.f35455(var8);
        }
        f42413((SubLObject)module0693.UNPROVIDED);
        return (SubLObject)module0693.NIL;
    }
    
    public static SubLObject f42415(final SubLObject var42) {
        final SubLObject var43 = module0030.f1606((SubLObject)module0693.$ic35$, var42, (SubLObject)module0693.UNPROVIDED);
        if (module0693.NIL != var43) {
            final SubLObject var44 = module0577.f35456(var43);
            if (module0693.NIL != module0577.f35438(var44)) {
                return var44;
            }
            module0667.f40568((SubLObject)module0693.$ic38$, PrintLow.format((SubLObject)module0693.NIL, (SubLObject)module0693.$ic39$));
        }
        else {
            module0667.f40568((SubLObject)module0693.$ic38$, PrintLow.format((SubLObject)module0693.NIL, (SubLObject)module0693.$ic40$));
        }
        return (SubLObject)module0693.NIL;
    }
    
    public static SubLObject f42416() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0693", "f42411", "S#46420", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0693", "f42412", "CB-SHOW-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0693", "f42413", "S#46385", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0693", "f42414", "CB-DELETE-USER-ACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0693", "f42415", "S#46386", 1, 0, false);
        return (SubLObject)module0693.NIL;
    }
    
    public static SubLObject f42417() {
        return (SubLObject)module0693.NIL;
    }
    
    public static SubLObject f42418() {
        module0656.f39840((SubLObject)module0693.$ic3$, (SubLObject)module0693.$ic4$, (SubLObject)module0693.ONE_INTEGER);
        module0015.f873((SubLObject)module0693.$ic5$);
        module0015.f873((SubLObject)module0693.$ic37$);
        return (SubLObject)module0693.NIL;
    }
    
    public void declareFunctions() {
        f42416();
    }
    
    public void initializeVariables() {
        f42417();
    }
    
    public void runTopLevelForms() {
        f42418();
    }
    
    static {
        me = (SubLFile)new module0693();
        $ic0$ = SubLObjectFactory.makeString("[User Actions]");
        $ic1$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic2$ = SubLObjectFactory.makeString("cb-show-actions");
        $ic3$ = SubLObjectFactory.makeKeyword("USER-ACTIONS");
        $ic4$ = SubLObjectFactory.makeSymbol("S#46420", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("CB-SHOW-ACTIONS");
        $ic6$ = SubLObjectFactory.makeString("User Actions");
        $ic7$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic8$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic9$ = SubLObjectFactory.makeString("stylesheet");
        $ic10$ = SubLObjectFactory.makeString("text/css");
        $ic11$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic12$ = SubLObjectFactory.makeString("text/javascript");
        $ic13$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic14$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic15$ = SubLObjectFactory.makeString("button");
        $ic16$ = SubLObjectFactory.makeString("reload");
        $ic17$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic18$ = SubLObjectFactory.makeString("No user actions.");
        $ic19$ = SubLObjectFactory.makeString("100%");
        $ic20$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic21$ = SubLObjectFactory.makeKeyword("TOP");
        $ic22$ = SubLObjectFactory.makeString("Date");
        $ic23$ = SubLObjectFactory.makeString("User");
        $ic24$ = SubLObjectFactory.makeString("Action Description");
        $ic25$ = SubLObjectFactory.makeString("Options");
        $ic26$ = SubLObjectFactory.makeString("#cccccc");
        $ic27$ = SubLObjectFactory.makeString("#dddddd");
        $ic28$ = SubLObjectFactory.makeString("~&~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D");
        $ic29$ = SubLObjectFactory.makeString("No summary-fn for user action of type ");
        $ic30$ = SubLObjectFactory.makeString("[View]");
        $ic31$ = SubLObjectFactory.makeString("cg?~A&~A");
        $ic32$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic33$ = SubLObjectFactory.makeString("cg?cb-delete-user-action&~A");
        $ic34$ = SubLObjectFactory.makeString("[Abort]");
        $ic35$ = SubLObjectFactory.makeKeyword("USER-ACTION-ID-STRING");
        $ic36$ = SubLObjectFactory.makeKeyword("JUST-STRING");
        $ic37$ = SubLObjectFactory.makeSymbol("CB-DELETE-USER-ACTION");
        $ic38$ = SubLObjectFactory.makeString("Fatal Error");
        $ic39$ = SubLObjectFactory.makeString("could not find a user-action matching the user-action-id-string");
        $ic40$ = SubLObjectFactory.makeString("could not find a valid user-action-id-string");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0693.class
	Total time: 362 ms
	
	Decompiled with Procyon 0.5.32.
*/