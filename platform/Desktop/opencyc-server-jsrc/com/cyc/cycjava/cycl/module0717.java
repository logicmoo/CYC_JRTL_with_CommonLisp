package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0717 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0717";
    public static final String myFingerPrint = "0b5699993fe7cf96a7865f643b04eaa0fc6904660e81e6a0008f43ecc4f41f18";
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLInteger $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    
    public static SubLObject f44002(SubLObject var1) {
        if (var1 == module0717.UNPROVIDED) {
            var1 = (SubLObject)module0717.NIL;
        }
        if (module0717.NIL != module0543.f33698()) {
            return module0667.f40583((SubLObject)module0717.$ic0$);
        }
        return f44003(module0665.f40432(var1));
    }
    
    public static SubLObject f44003(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)module0717.NIL;
        final SubLObject var5 = Symbols.symbol_function((SubLObject)module0717.$ic2$);
        final SubLObject var6 = Symbols.symbol_function((SubLObject)module0717.$ic3$);
        SubLObject var7 = (SubLObject)module0717.NIL;
        SubLObject var8 = (SubLObject)module0717.NIL;
        if (module0717.NIL == module0665.f40419((SubLObject)module0717.$ic4$, var2)) {
            var7 = (SubLObject)module0717.T;
            module0665.f40421((SubLObject)module0717.$ic4$, var2, (SubLObject)module0717.$ic5$);
            module0665.f40421((SubLObject)module0717.$ic6$, var2, (SubLObject)module0717.$ic7$);
        }
        module0665.f40460(var2, (SubLObject)module0717.$ic8$, var4, var5, var6, module0717.$ic9$, (SubLObject)module0717.UNPROVIDED);
        if (module0717.NIL == var7 && ((module0717.$ic5$ == module0665.f40419((SubLObject)module0717.$ic4$, var2) && module0717.NIL != module0038.f2653(module0665.f40419((SubLObject)module0717.$ic10$, var2)) && module0717.NIL != module0075.f5218(module0665.f40419((SubLObject)module0717.$ic10$, var2))) || (module0717.$ic11$ == module0665.f40419((SubLObject)module0717.$ic4$, var2) && module0717.NIL != module0038.f2653(module0665.f40419((SubLObject)module0717.$ic12$, var2)) && module0717.NIL != module0589.f35907(module0665.f40419((SubLObject)module0717.$ic12$, var2), (SubLObject)module0717.UNPROVIDED)))) {
            return f44004(var2);
        }
        final SubLObject var9 = (SubLObject)module0717.$ic13$;
        final SubLObject var10 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0717.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0717.$ic14$);
            module0642.f39029((SubLObject)module0717.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var11 = module0014.f672((SubLObject)module0717.$ic15$);
            module0642.f39029((SubLObject)module0717.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
            module0642.f39020((SubLObject)module0717.$ic16$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
            if (module0717.NIL != var11) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                module0642.f39020(var11);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
            module0642.f39020((SubLObject)module0717.$ic17$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
            module0016.f941();
            if (module0717.NIL != var9) {
                module0642.f39029((SubLObject)module0717.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var9);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0717.UNPROVIDED);
            final SubLObject var10_12 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0717.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0717.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                module0642.f39020((SubLObject)module0717.$ic20$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                final SubLObject var10_13 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0717.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                    module0642.f39020((SubLObject)module0717.$ic21$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                    final SubLObject var10_14 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0717.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39020((SubLObject)module0717.$ic22$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39020((SubLObject)module0717.$ic23$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39019((SubLObject)module0717.$ic24$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_14, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0717.NIL != var9) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0717.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39019(var9);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0717.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                    }
                    module0644.f39197();
                    final SubLObject var12 = module0656.f39832((SubLObject)module0717.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                    module0642.f39020((SubLObject)module0717.$ic25$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                    if (module0717.NIL != var12) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39020(var12);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                    final SubLObject var10_15 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var13 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var14 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0717.T, var3);
                        module0015.$g541$.bind((SubLObject)module0717.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0717.$ic26$, (SubLObject)module0717.T, (SubLObject)module0717.UNPROVIDED);
                        module0656.f39870((SubLObject)module0717.$ic27$, (SubLObject)module0717.NIL, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39032((SubLObject)module0717.UNPROVIDED);
                        module0656.f39790((SubLObject)module0717.$ic28$, (SubLObject)module0717.$ic29$);
                        module0642.f39032((SubLObject)module0717.UNPROVIDED);
                        module0642.f39073((SubLObject)module0717.$ic30$);
                        module0642.f39026((SubLObject)module0717.TWO_INTEGER);
                        module0665.f40445(var2, (SubLObject)module0717.$ic31$, (SubLObject)module0717.$ic32$, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39026((SubLObject)module0717.UNPROVIDED);
                        module0642.f39051((SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0717.$ic33$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)module0717.UNPROVIDED);
                        module0665.f40437(var2, (SubLObject)module0717.$ic4$, (SubLObject)module0717.$ic5$);
                        module0642.f39032((SubLObject)module0717.UNPROVIDED);
                        module0642.f39019((SubLObject)module0717.$ic34$);
                        module0642.f39026((SubLObject)module0717.UNPROVIDED);
                        module0642.f39032((SubLObject)module0717.THREE_INTEGER);
                        SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0717.NIL == var7 && module0717.$ic5$ == module0665.f40419((SubLObject)module0717.$ic4$, var2));
                        if (module0717.NIL != var15) {
                            module0642.f39020(module0015.$g219$.getGlobalValue());
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                            module0642.f39020((SubLObject)module0717.$ic35$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                            final SubLObject var10_16 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0717.T, var3);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (module0717.NIL != module0015.$g495$.getGlobalValue()) {
                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                                    module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                                final SubLObject var10_17 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0717.T, var3);
                                    module0642.f39019((SubLObject)module0717.$ic36$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var10_17, var3);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var10_16, var3);
                            }
                            module0642.f39020(module0015.$g220$.getGlobalValue());
                            var8 = (SubLObject)module0717.T;
                        }
                        module0665.f40448(var2, (SubLObject)module0717.$ic10$, module0038.$g916$.getGlobalValue(), (SubLObject)module0717.$ic37$, (SubLObject)module0717.UNPROVIDED);
                        if (module0717.NIL != var15) {
                            module0642.f39020(module0015.$g219$.getGlobalValue());
                            if (module0717.NIL != module0015.$g495$.getGlobalValue()) {
                                module0642.f39020(module0015.$g222$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                                module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                            final SubLObject var10_18 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0717.T, var3);
                                module0642.f39019((SubLObject)module0717.$ic38$);
                            }
                            finally {
                                module0015.$g533$.rebind(var10_18, var3);
                            }
                            module0642.f39020(module0015.$g220$.getGlobalValue());
                        }
                        module0642.f39026((SubLObject)module0717.TWO_INTEGER);
                        module0665.f40437(var2, (SubLObject)module0717.$ic4$, (SubLObject)module0717.$ic11$);
                        module0642.f39032((SubLObject)module0717.UNPROVIDED);
                        module0642.f39019((SubLObject)module0717.$ic39$);
                        module0642.f39026((SubLObject)module0717.UNPROVIDED);
                        module0642.f39032((SubLObject)module0717.THREE_INTEGER);
                        var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0717.NIL == var7 && module0717.$ic11$ == module0665.f40419((SubLObject)module0717.$ic4$, var2));
                        if (module0717.NIL != var15) {
                            module0642.f39020(module0015.$g219$.getGlobalValue());
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                            module0642.f39020((SubLObject)module0717.$ic35$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                            final SubLObject var10_19 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0717.T, var3);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (module0717.NIL != module0015.$g495$.getGlobalValue()) {
                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                                    module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                                final SubLObject var10_20 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0717.T, var3);
                                    module0642.f39019((SubLObject)module0717.$ic36$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var10_20, var3);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var10_19, var3);
                            }
                            module0642.f39020(module0015.$g220$.getGlobalValue());
                            var8 = (SubLObject)module0717.T;
                        }
                        module0665.f40448(var2, (SubLObject)module0717.$ic12$, module0038.$g916$.getGlobalValue(), (SubLObject)module0717.$ic37$, (SubLObject)module0717.UNPROVIDED);
                        if (module0717.NIL != var15) {
                            module0642.f39020(module0015.$g219$.getGlobalValue());
                            if (module0717.NIL != module0015.$g495$.getGlobalValue()) {
                                module0642.f39020(module0015.$g222$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                                module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                            final SubLObject var10_21 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0717.T, var3);
                                module0642.f39019((SubLObject)module0717.$ic40$);
                            }
                            finally {
                                module0015.$g533$.rebind(var10_21, var3);
                            }
                            module0642.f39020(module0015.$g220$.getGlobalValue());
                        }
                        module0642.f39026((SubLObject)module0717.UNPROVIDED);
                        module0642.f39026((SubLObject)module0717.ONE_INTEGER);
                        module0642.f39051((SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39021((SubLObject)module0717.$ic41$);
                        module0642.f39026((SubLObject)module0717.UNPROVIDED);
                        module0642.f39032((SubLObject)module0717.TWO_INTEGER);
                        module0665.f40437(var2, (SubLObject)module0717.$ic6$, (SubLObject)module0717.$ic7$);
                        module0642.f39032((SubLObject)module0717.UNPROVIDED);
                        module0642.f39019((SubLObject)module0717.$ic42$);
                        module0642.f39026((SubLObject)module0717.UNPROVIDED);
                        module0642.f39032((SubLObject)module0717.TWO_INTEGER);
                        module0665.f40437(var2, (SubLObject)module0717.$ic6$, (SubLObject)module0717.$ic43$);
                        module0642.f39032((SubLObject)module0717.UNPROVIDED);
                        module0642.f39019((SubLObject)module0717.$ic44$);
                        module0665.f40448(var2, (SubLObject)module0717.$ic45$, module0038.$g916$.getGlobalValue(), (SubLObject)module0717.TEN_INTEGER, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39026((SubLObject)module0717.UNPROVIDED);
                        module0642.f39032((SubLObject)module0717.TWO_INTEGER);
                        module0665.f40437(var2, (SubLObject)module0717.$ic6$, (SubLObject)module0717.$ic46$);
                        module0642.f39032((SubLObject)module0717.UNPROVIDED);
                        module0642.f39019((SubLObject)module0717.$ic47$);
                        module0642.f39026((SubLObject)module0717.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0717.$ic48$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)module0717.UNPROVIDED);
                        module0642.f39032((SubLObject)module0717.TWO_INTEGER);
                        module0665.f40452(var2, (SubLObject)module0717.$ic8$, var4, var5, (SubLObject)module0717.NIL, (SubLObject)module0717.T, module0717.$ic9$);
                        module0642.f39026((SubLObject)module0717.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0683.f41673((SubLObject)module0717.$ic49$, (SubLObject)module0717.$ic50$, (SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)module0717.UNPROVIDED);
                        module0642.f39032((SubLObject)module0717.THREE_INTEGER);
                        module0665.f40448(var2, (SubLObject)module0717.$ic51$, module0038.$g916$.getGlobalValue(), (SubLObject)module0717.TEN_INTEGER, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39026((SubLObject)module0717.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0683.f41673((SubLObject)module0717.$ic52$, (SubLObject)module0717.$ic53$, (SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)module0717.UNPROVIDED);
                        module0642.f39032((SubLObject)module0717.THREE_INTEGER);
                        module0665.f40448(var2, (SubLObject)module0717.$ic54$, module0038.$g916$.getGlobalValue(), (SubLObject)module0717.TEN_INTEGER, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39026((SubLObject)module0717.TWO_INTEGER);
                        module0665.f40436(var2, (SubLObject)module0717.$ic55$, (SubLObject)module0717.T, (SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39032((SubLObject)module0717.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0683.f41673((SubLObject)module0717.$ic56$, (SubLObject)module0717.$ic57$, (SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)module0717.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0717.$ic58$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)module0717.UNPROVIDED);
                        module0642.f39032((SubLObject)module0717.THREE_INTEGER);
                        module0665.f40448(var2, (SubLObject)module0717.$ic59$, (SubLObject)module0717.$ic60$, (SubLObject)module0717.$ic37$, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39051((SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED);
                        if (module0717.NIL == var7 || module0717.NIL != var8) {
                            module0642.f39026((SubLObject)module0717.UNPROVIDED);
                            module0642.f39020(module0015.$g219$.getGlobalValue());
                            if (module0717.NIL != module0015.$g495$.getGlobalValue()) {
                                module0642.f39020(module0015.$g222$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                                module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                            final SubLObject var10_22 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0717.T, var3);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)module0717.$ic61$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var10_22, var3);
                            }
                            module0642.f39020(module0015.$g220$.getGlobalValue());
                        }
                        module0642.f39026((SubLObject)module0717.TWO_INTEGER);
                        module0665.f40445(var2, (SubLObject)module0717.$ic31$, (SubLObject)module0717.$ic32$, (SubLObject)module0717.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var14, var3);
                        module0015.$g541$.rebind(var13, var3);
                        module0015.$g533$.rebind(var10_15, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0717.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var10_13, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0717.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var10_12, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0717.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var10, var3);
        }
        return (SubLObject)module0717.NIL;
    }
    
    public static SubLObject f44004(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0665.f40419((SubLObject)module0717.$ic12$, var2);
        final SubLObject var5 = module0665.f40419((SubLObject)module0717.$ic10$, var2);
        final SubLObject var6 = module0665.f40419((SubLObject)module0717.$ic51$, var2);
        final SubLObject var7 = module0665.f40419((SubLObject)module0717.$ic54$, var2);
        final SubLObject var8 = module0665.f40419((SubLObject)module0717.$ic8$, var2);
        final SubLObject var9 = module0665.f40419((SubLObject)module0717.$ic6$, var2);
        final SubLObject var10 = module0665.f40419((SubLObject)module0717.$ic45$, var2);
        final SubLObject var11 = module0665.f40419((SubLObject)module0717.$ic55$, var2);
        SubLObject var12 = (SubLObject)ConsesLow.list((SubLObject)module0717.$ic62$, (SubLObject)module0717.T, (SubLObject)module0717.$ic63$, module0015.$g131$.getDynamicValue(var3));
        SubLObject var13 = (SubLObject)module0717.NIL;
        if (module0717.NIL != module0038.f2653(var4)) {
            var12 = conses_high.putf(var12, (SubLObject)module0717.$ic59$, var4);
        }
        if (module0717.NIL != module0038.f2653(var6)) {
            var12 = conses_high.putf(var12, (SubLObject)module0717.$ic51$, var6);
        }
        if (module0717.NIL != module0038.f2653(var7)) {
            var12 = conses_high.putf(var12, (SubLObject)module0717.$ic54$, var7);
        }
        if (module0717.NIL != module0173.f10955(var8)) {
            var12 = conses_high.putf(var12, (SubLObject)module0717.$ic8$, var8);
        }
        if (var9 == module0717.$ic7$) {
            var12 = conses_high.putf(var12, (SubLObject)module0717.$ic45$, (SubLObject)module0717.$ic60$);
        }
        else if (var9 == module0717.$ic43$) {
            if (module0717.NIL != module0038.f2653(var10)) {
                var12 = conses_high.putf(var12, (SubLObject)module0717.$ic45$, var10);
            }
        }
        else if (var9 == module0717.$ic46$) {
            var12 = conses_high.putf(var12, (SubLObject)module0717.$ic45$, (SubLObject)module0717.T);
        }
        if (module0717.NIL != var11) {
            var12 = conses_high.putf(var12, (SubLObject)module0717.$ic55$, (SubLObject)module0717.T);
        }
        final SubLObject var14 = StreamsLow.$standard_output$.currentBinding(var3);
        try {
            StreamsLow.$standard_output$.bind(module0015.$g131$.getDynamicValue(var3), var3);
            SubLObject var15 = (SubLObject)module0717.NIL;
            final SubLObject var16 = (SubLObject)module0717.$ic64$;
            final SubLObject var10_38 = module0015.$g538$.currentBinding(var3);
            try {
                module0015.$g538$.bind((module0717.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED, (SubLObject)module0717.UNPROVIDED), var3);
                module0642.f39020((SubLObject)module0717.$ic14$);
                module0642.f39029((SubLObject)module0717.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
                final SubLObject var17 = module0014.f672((SubLObject)module0717.$ic15$);
                module0642.f39029((SubLObject)module0717.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                module0642.f39020((SubLObject)module0717.$ic16$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                if (module0717.NIL != var17) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                    module0642.f39020(var17);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                module0642.f39020((SubLObject)module0717.$ic17$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                module0016.f941();
                if (module0717.NIL != var16) {
                    module0642.f39029((SubLObject)module0717.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var16);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0717.UNPROVIDED);
                final SubLObject var10_39 = module0015.$g535$.currentBinding(var3);
                try {
                    module0015.$g535$.bind((SubLObject)module0717.T, var3);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0717.NIL != module0015.$g132$.getDynamicValue(var3)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                    module0642.f39020((SubLObject)module0717.$ic20$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                    final SubLObject var10_40 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0717.T, var3);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39020((SubLObject)module0717.$ic21$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                        final SubLObject var10_41 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0717.T, var3);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                            module0642.f39020((SubLObject)module0717.$ic22$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                            module0642.f39020((SubLObject)module0717.$ic23$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                            module0642.f39019((SubLObject)module0717.$ic24$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_41, var3);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0717.NIL != var16) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0717.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                            module0642.f39019(var16);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0717.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                        }
                        module0015.f741();
                        module0642.f39020(module0015.$g203$.getGlobalValue());
                        final SubLObject var10_42 = module0015.$g537$.currentBinding(var3);
                        try {
                            module0015.$g537$.bind((SubLObject)module0717.T, var3);
                            module0642.f39011();
                            try {
                                var3.throwStack.push(module0003.$g3$.getGlobalValue());
                                final SubLObject var10_43 = Errors.$error_handler$.currentBinding(var3);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)module0717.$ic65$, var3);
                                    try {
                                        if (module0717.NIL != module0075.f5218(var5)) {
                                            if (module0717.NIL != module0038.f2653(var4)) {
                                                var13 = module0713.f43761(var4, var5, var12);
                                            }
                                            else {
                                                var13 = module0713.f43757(var5, var12);
                                            }
                                        }
                                        else {
                                            var13 = module0713.f43750(var4, var12);
                                        }
                                    }
                                    catch (Throwable var18) {
                                        Errors.handleThrowable(var18, (SubLObject)module0717.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(var10_43, var3);
                                }
                            }
                            catch (Throwable var19) {
                                var15 = Errors.handleThrowable(var19, module0003.$g3$.getGlobalValue());
                            }
                            finally {
                                var3.throwStack.pop();
                            }
                            if (module0717.NIL != var15) {
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (module0717.NIL != module0015.$g495$.getGlobalValue()) {
                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                                    module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0717.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0717.UNPROVIDED);
                                final SubLObject var10_44 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0717.T, var3);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0717.$ic66$);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var10_44, var3);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                module0642.f39026((SubLObject)module0717.UNPROVIDED);
                                module0642.f39019(var15);
                            }
                        }
                        finally {
                            module0015.$g537$.rebind(var10_42, var3);
                        }
                        module0642.f39020(module0015.$g204$.getGlobalValue());
                        module0642.f39029((SubLObject)module0717.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var10_40, var3);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0717.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var10_39, var3);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0717.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var10_38, var3);
            }
            return var13;
        }
        finally {
            StreamsLow.$standard_output$.rebind(var14, var3);
        }
    }
    
    public static SubLObject f44005() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0717", "f44002", "CB-OWL-IMPORT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0717", "f44003", "S#48177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0717", "f44004", "S#48178", 1, 0, false);
        return (SubLObject)module0717.NIL;
    }
    
    public static SubLObject f44006() {
        return (SubLObject)module0717.NIL;
    }
    
    public static SubLObject f44007() {
        module0015.f873((SubLObject)module0717.$ic1$);
        return (SubLObject)module0717.NIL;
    }
    
    public void declareFunctions() {
        f44005();
    }
    
    public void initializeVariables() {
        f44006();
    }
    
    public void runTopLevelForms() {
        f44007();
    }
    
    static {
        me = (SubLFile)new module0717();
        $ic0$ = SubLObjectFactory.makeString("OWL Importer");
        $ic1$ = SubLObjectFactory.makeSymbol("CB-OWL-IMPORT");
        $ic2$ = SubLObjectFactory.makeSymbol("S#3971", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#44216", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic5$ = SubLObjectFactory.makeKeyword("IMPORT-FROM-FILE");
        $ic6$ = SubLObjectFactory.makeKeyword("TERM-NAME-FORMAT");
        $ic7$ = SubLObjectFactory.makeKeyword("SHORT");
        $ic8$ = SubLObjectFactory.makeKeyword("ONTOLOGY-TERM");
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Ontology"));
        $ic10$ = SubLObjectFactory.makeKeyword("IMPORT-FILENAME");
        $ic11$ = SubLObjectFactory.makeKeyword("IMPORT-FROM-URI");
        $ic12$ = SubLObjectFactory.makeKeyword("IMPORT-URI");
        $ic13$ = SubLObjectFactory.makeString("Import an OWL ontology");
        $ic14$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic15$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic16$ = SubLObjectFactory.makeString("stylesheet");
        $ic17$ = SubLObjectFactory.makeString("text/css");
        $ic18$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic19$ = SubLObjectFactory.makeString("text/javascript");
        $ic20$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic21$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic22$ = SubLObjectFactory.makeString("button");
        $ic23$ = SubLObjectFactory.makeString("reload");
        $ic24$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic25$ = SubLObjectFactory.makeString("post");
        $ic26$ = SubLObjectFactory.makeString("cb-owl-import");
        $ic27$ = SubLObjectFactory.makeKeyword("CB-OWL-TO-CYCL");
        $ic28$ = SubLObjectFactory.makeKeyword("SELF");
        $ic29$ = SubLObjectFactory.makeString("Back");
        $ic30$ = SubLObjectFactory.makeString("Clear");
        $ic31$ = SubLObjectFactory.makeString("Import");
        $ic32$ = SubLObjectFactory.makeKeyword("IMPORT");
        $ic33$ = SubLObjectFactory.makeString("Choose the method for determining the import OWL:");
        $ic34$ = SubLObjectFactory.makeString("Import an ontology from a file:");
        $ic35$ = SubLObjectFactory.makeString("+2");
        $ic36$ = SubLObjectFactory.makeString("*");
        $ic37$ = SubLObjectFactory.makeInteger(60);
        $ic38$ = SubLObjectFactory.makeString(" File not found.");
        $ic39$ = SubLObjectFactory.makeString("Import an ontology from accessible URI:");
        $ic40$ = SubLObjectFactory.makeString(" Invalid URI");
        $ic41$ = SubLObjectFactory.makeString("Format for term names in #$synonymousExternalConcept assertions:");
        $ic42$ = SubLObjectFactory.makeString("Short (local names only)");
        $ic43$ = SubLObjectFactory.makeKeyword("MEDIUM");
        $ic44$ = SubLObjectFactory.makeString("Medium (prefixed names) using prefix: ");
        $ic45$ = SubLObjectFactory.makeKeyword("SYNONYMOUS-CONCEPT-PREFIX");
        $ic46$ = SubLObjectFactory.makeKeyword("LONG");
        $ic47$ = SubLObjectFactory.makeString("Long (full URIs)");
        $ic48$ = SubLObjectFactory.makeString("Use an existing Cyc term to represent the ontology:");
        $ic49$ = SubLObjectFactory.makeString("Create constants for OWL terms using prefix:");
        $ic50$ = SubLObjectFactory.makeString("Newly created constants for terms in the imported ontology will have names that start with this prefix.");
        $ic51$ = SubLObjectFactory.makeKeyword("CONSTANT-PREFIX");
        $ic52$ = SubLObjectFactory.makeString("Create constants for OWL terms using suffix:");
        $ic53$ = SubLObjectFactory.makeString("Newly created constants for terms in the imported ontology will have names that end with this suffix");
        $ic54$ = SubLObjectFactory.makeKeyword("CONSTANT-SUFFIX");
        $ic55$ = SubLObjectFactory.makeKeyword("USE-NAMESPACE-PREFIXES-AS-CONSTANT-PREFIXES");
        $ic56$ = SubLObjectFactory.makeString("Use namespace prefixes as constant prefixes");
        $ic57$ = SubLObjectFactory.makeString("When importing OWL that creates terms in multiple namespaces, use the namespace prefix from the OWL to create Cyc constants.");
        $ic58$ = SubLObjectFactory.makeString("Override the URI:");
        $ic59$ = SubLObjectFactory.makeKeyword("ONTOLOGY-URI");
        $ic60$ = SubLObjectFactory.makeString("");
        $ic61$ = SubLObjectFactory.makeString("Please fill out the starred fields");
        $ic62$ = SubLObjectFactory.makeKeyword("VERBOSE?");
        $ic63$ = SubLObjectFactory.makeKeyword("PROGRESS-STREAM");
        $ic64$ = SubLObjectFactory.makeString("Importing an OWL ontology");
        $ic65$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic66$ = SubLObjectFactory.makeString("Error during import:");
        $ic67$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0717.class
	Total time: 464 ms
	
	Decompiled with Procyon 0.5.32.
*/