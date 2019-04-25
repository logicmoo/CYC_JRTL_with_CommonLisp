package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0688 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0688";
    public static final String myFingerPrint = "e439d995bf3969eefb04bad44b0fab0097f1b79e01f8197f1bfd2c17775a9d0d";
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    
    public static SubLObject f42237(final SubLObject var1) {
        return f42238(var1);
    }
    
    public static SubLObject f42238(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0688.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0688.$ic7$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (module0688.NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0688.$ic7$);
            return (SubLObject)module0688.NIL;
        }
        final SubLObject var4 = module0656.f39970(var2);
        if (module0688.NIL == assertion_handles_oc.f11035(var4)) {
            return module0656.f39789((SubLObject)module0688.$ic8$, var2, (SubLObject)module0688.UNPROVIDED, (SubLObject)module0688.UNPROVIDED, (SubLObject)module0688.UNPROVIDED, (SubLObject)module0688.UNPROVIDED);
        }
        return f42239(var4);
    }
    
    public static SubLObject f42239(final SubLObject var5) {
        module0677.f41336(var5);
        return f42240(var5);
    }
    
    public static SubLObject f42241(SubLObject var1) {
        if (var1 == module0688.UNPROVIDED) {
            var1 = (SubLObject)module0688.NIL;
        }
        SubLObject var3;
        final SubLObject var2 = var3 = var1;
        SubLObject var4 = (SubLObject)module0688.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)module0688.$ic10$);
        var4 = var3.first();
        var3 = var3.rest();
        if (module0688.NIL == var3) {
            final SubLObject var5 = module0656.f39970(var4);
            if (module0688.NIL == assertion_handles_oc.f11035(var5)) {
                module0656.f39789((SubLObject)module0688.$ic11$, var4, (SubLObject)module0688.UNPROVIDED, (SubLObject)module0688.UNPROVIDED, (SubLObject)module0688.UNPROVIDED, (SubLObject)module0688.UNPROVIDED);
                return (SubLObject)module0688.NIL;
            }
            f42240(var5);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0688.$ic10$);
        }
        return (SubLObject)module0688.NIL;
    }
    
    public static SubLObject f42242(final SubLObject var5, SubLObject var9) {
        if (var9 == module0688.UNPROVIDED) {
            var9 = (SubLObject)module0688.NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0688.NIL == var9) {
            var9 = (SubLObject)module0688.$ic13$;
        }
        final SubLObject var11 = module0656.f39832((SubLObject)module0688.$ic14$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var10), (SubLObject)module0688.$ic15$, assertion_handles_oc.f11025(var5));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
        if (module0688.NIL != var11) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
        final SubLObject var12 = module0015.$g533$.currentBinding(var10);
        try {
            module0015.$g533$.bind((SubLObject)module0688.T, var10);
            module0642.f39019(var9);
        }
        finally {
            module0015.$g533$.rebind(var12, var10);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0688.NIL;
    }
    
    public static SubLObject f42240(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0290.f19495(var5);
        final SubLObject var8 = module0178.f11287(var5);
        var6.resetMultipleValues();
        final SubLObject var9 = module0543.f33699((SubLObject)ConsesLow.list((SubLObject)module0688.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0688.$ic19$, var7), (SubLObject)ConsesLow.list((SubLObject)module0688.$ic19$, var8)));
        final SubLObject var10 = var6.secondMultipleValue();
        var6.resetMultipleValues();
        if (module0688.NIL != var9) {
            return f42243(var5);
        }
        if (module0688.NIL != var10) {
            return module0656.f39791(var10);
        }
        return f42244(var5);
    }
    
    public static SubLObject f42244(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0289.f19396(var5);
        final SubLObject var8 = module0178.f11287(var5);
        final SubLObject var9 = (SubLObject)module0688.$ic22$;
        final SubLObject var10 = module0015.$g538$.currentBinding(var6);
        try {
            module0015.$g538$.bind((module0688.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var6))) ? module0015.$g538$.getDynamicValue(var6) : module0057.f4173((SubLObject)module0688.UNPROVIDED, (SubLObject)module0688.UNPROVIDED, (SubLObject)module0688.UNPROVIDED), var6);
            module0642.f39020((SubLObject)module0688.$ic23$);
            module0642.f39029((SubLObject)module0688.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var6), module0655.$g5142$.getDynamicValue(var6));
            final SubLObject var11 = module0014.f672((SubLObject)module0688.$ic24$);
            module0642.f39029((SubLObject)module0688.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
            module0642.f39020((SubLObject)module0688.$ic25$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
            if (module0688.NIL != var11) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                module0642.f39020(var11);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
            module0642.f39020((SubLObject)module0688.$ic26$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
            module0016.f941();
            if (module0688.NIL != var9) {
                module0642.f39029((SubLObject)module0688.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var9);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0688.UNPROVIDED);
            final SubLObject var12_19 = module0015.$g535$.currentBinding(var6);
            try {
                module0015.$g535$.bind((SubLObject)module0688.T, var6);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0688.NIL != module0015.$g132$.getDynamicValue(var6)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var6)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                module0642.f39020((SubLObject)module0688.$ic29$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
                final SubLObject var12_20 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)module0688.T, var6);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                    module0642.f39020((SubLObject)module0688.$ic30$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
                    final SubLObject var12_21 = module0015.$g533$.currentBinding(var6);
                    try {
                        module0015.$g533$.bind((SubLObject)module0688.T, var6);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39020((SubLObject)module0688.$ic31$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39020((SubLObject)module0688.$ic32$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39019((SubLObject)module0688.$ic33$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var12_21, var6);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0688.NIL != var9) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0688.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39019(var9);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0688.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var6));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
                    final SubLObject var12_22 = module0015.$g533$.currentBinding(var6);
                    final SubLObject var12 = module0015.$g541$.currentBinding(var6);
                    final SubLObject var13 = module0015.$g539$.currentBinding(var6);
                    try {
                        module0015.$g533$.bind((SubLObject)module0688.T, var6);
                        module0015.$g541$.bind((SubLObject)module0688.T, var6);
                        module0015.$g539$.bind(module0015.f797(), var6);
                        module0656.f39870((SubLObject)module0688.$ic20$, (SubLObject)module0688.NIL, (SubLObject)module0688.UNPROVIDED);
                        module0656.f39790((SubLObject)module0688.$ic34$, (SubLObject)module0688.$ic35$);
                        module0642.f39026((SubLObject)module0688.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0688.$ic36$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)module0688.UNPROVIDED);
                        module0656.f39916(var5, (SubLObject)module0688.T, (SubLObject)module0688.T);
                        module0015.f741();
                        module0642.f39020(module0015.$g203$.getGlobalValue());
                        final SubLObject var12_23 = module0015.$g537$.currentBinding(var6);
                        try {
                            module0015.$g537$.bind((SubLObject)module0688.T, var6);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0688.$ic37$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0688.UNPROVIDED);
                            module0642.f39034(module0274.f18195(var7, var8, (SubLObject)module0688.UNPROVIDED), (SubLObject)module0688.UNPROVIDED);
                        }
                        finally {
                            module0015.$g537$.rebind(var12_23, var6);
                        }
                        module0642.f39020(module0015.$g204$.getGlobalValue());
                        module0015.f799(module0015.$g539$.getDynamicValue(var6));
                    }
                    finally {
                        module0015.$g539$.rebind(var13, var6);
                        module0015.$g541$.rebind(var12, var6);
                        module0015.$g533$.rebind(var12_22, var6);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0688.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var12_20, var6);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0688.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var12_19, var6);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0688.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var10, var6);
        }
        return (SubLObject)module0688.NIL;
    }
    
    public static SubLObject f42243(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = (SubLObject)module0688.$ic38$;
        final SubLObject var8 = module0015.$g538$.currentBinding(var6);
        try {
            module0015.$g538$.bind((module0688.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var6))) ? module0015.$g538$.getDynamicValue(var6) : module0057.f4173((SubLObject)module0688.UNPROVIDED, (SubLObject)module0688.UNPROVIDED, (SubLObject)module0688.UNPROVIDED), var6);
            module0642.f39020((SubLObject)module0688.$ic23$);
            module0642.f39029((SubLObject)module0688.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var6), module0655.$g5142$.getDynamicValue(var6));
            final SubLObject var9 = module0014.f672((SubLObject)module0688.$ic24$);
            module0642.f39029((SubLObject)module0688.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
            module0642.f39020((SubLObject)module0688.$ic25$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
            if (module0688.NIL != var9) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                module0642.f39020(var9);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
            module0642.f39020((SubLObject)module0688.$ic26$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
            module0016.f941();
            if (module0688.NIL != var7) {
                module0642.f39029((SubLObject)module0688.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var7);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0688.UNPROVIDED);
            final SubLObject var12_26 = module0015.$g535$.currentBinding(var6);
            try {
                module0015.$g535$.bind((SubLObject)module0688.T, var6);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0688.NIL != module0015.$g132$.getDynamicValue(var6)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var6)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                module0642.f39020((SubLObject)module0688.$ic29$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
                final SubLObject var12_27 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)module0688.T, var6);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                    module0642.f39020((SubLObject)module0688.$ic30$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
                    final SubLObject var12_28 = module0015.$g533$.currentBinding(var6);
                    try {
                        module0015.$g533$.bind((SubLObject)module0688.T, var6);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39020((SubLObject)module0688.$ic31$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39020((SubLObject)module0688.$ic32$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39019((SubLObject)module0688.$ic33$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var12_28, var6);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0688.NIL != var7) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0688.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
                        module0642.f39019(var7);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0688.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var6));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0688.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0688.UNPROVIDED);
                    final SubLObject var12_29 = module0015.$g533$.currentBinding(var6);
                    final SubLObject var10 = module0015.$g541$.currentBinding(var6);
                    final SubLObject var11 = module0015.$g539$.currentBinding(var6);
                    try {
                        module0015.$g533$.bind((SubLObject)module0688.T, var6);
                        module0015.$g541$.bind((SubLObject)module0688.T, var6);
                        module0015.$g539$.bind(module0015.f797(), var6);
                        module0656.f39870((SubLObject)module0688.$ic20$, (SubLObject)module0688.NIL, (SubLObject)module0688.UNPROVIDED);
                        module0656.f39790((SubLObject)module0688.$ic34$, (SubLObject)module0688.$ic35$);
                        module0642.f39026((SubLObject)module0688.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0688.$ic36$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)module0688.UNPROVIDED);
                        module0656.f39916(var5, (SubLObject)module0688.T, (SubLObject)module0688.T);
                        module0642.f39026((SubLObject)module0688.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0688.$ic39$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019((SubLObject)module0688.$ic40$);
                        module0015.f799(module0015.$g539$.getDynamicValue(var6));
                    }
                    finally {
                        module0015.$g539$.rebind(var11, var6);
                        module0015.$g541$.rebind(var10, var6);
                        module0015.$g533$.rebind(var12_29, var6);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0688.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var12_27, var6);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0688.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var12_26, var6);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0688.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var8, var6);
        }
        return (SubLObject)module0688.NIL;
    }
    
    public static SubLObject f42245() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0688", "f42237", "CB-ENW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0688", "f42238", "CB-EXPLAIN-NON-WFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0688", "f42239", "S#46251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0688", "f42241", "CB-WFF-ASSERTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0688", "f42242", "S#46252", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0688", "f42240", "S#46253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0688", "f42244", "S#46254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0688", "f42243", "S#46255", 1, 0, false);
        return (SubLObject)module0688.NIL;
    }
    
    public static SubLObject f42246() {
        return (SubLObject)module0688.NIL;
    }
    
    public static SubLObject f42247() {
        Hashtables.sethash((SubLObject)module0688.$ic0$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0688.$ic1$, (SubLObject)module0688.$ic2$));
        final SubLObject var30 = module0659.$g5197$.getGlobalValue();
        final SubLObject var31 = module0659.f40098((SubLObject)module0688.$ic3$);
        module0659.f40083(var31, (SubLObject)module0688.$ic4$);
        module0659.$g5197$.setGlobalValue((SubLObject)ConsesLow.cons(var31, Sequences.delete((SubLObject)module0688.$ic4$, var30, Symbols.symbol_function((SubLObject)module0688.EQUAL), Symbols.symbol_function((SubLObject)module0688.$ic5$), (SubLObject)module0688.UNPROVIDED, (SubLObject)module0688.UNPROVIDED, (SubLObject)module0688.UNPROVIDED)));
        module0015.f873((SubLObject)module0688.$ic6$);
        module0015.f873((SubLObject)module0688.$ic9$);
        module0015.f873((SubLObject)module0688.$ic12$);
        module0656.f39840((SubLObject)module0688.$ic16$, (SubLObject)module0688.$ic17$, (SubLObject)module0688.TWO_INTEGER);
        Hashtables.sethash((SubLObject)module0688.$ic20$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0688.$ic21$, (SubLObject)module0688.NIL));
        return (SubLObject)module0688.NIL;
    }
    
    public void declareFunctions() {
        f42245();
    }
    
    public void initializeVariables() {
        f42246();
    }
    
    public void runTopLevelForms() {
        f42247();
    }
    
    static {
        me = (SubLFile)new module0688();
        $ic0$ = SubLObjectFactory.makeKeyword("NONWFF");
        $ic1$ = SubLObjectFactory.makeString("nonwff.gif");
        $ic2$ = SubLObjectFactory.makeString("[Not WFF!]");
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0688.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("NONWFF"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[Not WFF!]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("S#20423", "CYC"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-enw"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Links to an explanation of why this assertion is not WFF.") });
        $ic4$ = SubLObjectFactory.makeSymbol("S#46256", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#44084", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("CB-ENW");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ID"));
        $ic8$ = SubLObjectFactory.makeString("Could not determine an assertion from ~a");
        $ic9$ = SubLObjectFactory.makeSymbol("CB-EXPLAIN-NON-WFF");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"));
        $ic11$ = SubLObjectFactory.makeString("~a does not specify an assertion");
        $ic12$ = SubLObjectFactory.makeSymbol("CB-WFF-ASSERTION");
        $ic13$ = SubLObjectFactory.makeString("[WFF Check]");
        $ic14$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic15$ = SubLObjectFactory.makeString("cb-wff-assertion&~a");
        $ic16$ = SubLObjectFactory.makeKeyword("WFF-ASSERTION");
        $ic17$ = SubLObjectFactory.makeSymbol("S#46252", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#20445", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic20$ = SubLObjectFactory.makeKeyword("CB-WFF-CHECK-FORMULA");
        $ic21$ = SubLObjectFactory.makeString("cb-wff-check-formula.html");
        $ic22$ = SubLObjectFactory.makeString("Assertion not Well-Formed");
        $ic23$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic24$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic25$ = SubLObjectFactory.makeString("stylesheet");
        $ic26$ = SubLObjectFactory.makeString("text/css");
        $ic27$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic28$ = SubLObjectFactory.makeString("text/javascript");
        $ic29$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic30$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic31$ = SubLObjectFactory.makeString("button");
        $ic32$ = SubLObjectFactory.makeString("reload");
        $ic33$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic34$ = SubLObjectFactory.makeKeyword("SELF");
        $ic35$ = SubLObjectFactory.makeString("Back");
        $ic36$ = SubLObjectFactory.makeString("Assertion : ");
        $ic37$ = SubLObjectFactory.makeString("Explanation : ");
        $ic38$ = SubLObjectFactory.makeString("Assertion is Well-Formed");
        $ic39$ = SubLObjectFactory.makeString("WFF-Status : ");
        $ic40$ = SubLObjectFactory.makeString("OK");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0688.class
	Total time: 182 ms
	
	Decompiled with Procyon 0.5.32.
*/