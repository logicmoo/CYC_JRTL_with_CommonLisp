package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0676 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0676";
    public static final String myFingerPrint = "080ee9c85ce1692d1bf8340ee3b6d126663d4c7a8ec020204bff12bf8ddfd86a";
    private static final SubLList $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
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
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    
    public static SubLObject f41264(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0676.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0676.$ic0$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (module0676.NIL == var3) {
            final SubLObject var4 = module0656.f39970(var2);
            if (module0676.NIL == assertion_handles_oc.f11035(var4)) {
                return module0656.f39789((SubLObject)module0676.$ic1$, var2, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
            }
            f41265(var4);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0676.$ic0$);
        }
        return (SubLObject)module0676.NIL;
    }
    
    public static SubLObject f41266(SubLObject var1) {
        if (var1 == module0676.UNPROVIDED) {
            var1 = (SubLObject)module0676.NIL;
        }
        return f41267(var1.first());
    }
    
    public static SubLObject f41268(final SubLObject var1) {
        return f41269(var1);
    }
    
    public static SubLObject f41270(final SubLObject var1) {
        return f41271(var1);
    }
    
    public static SubLObject f41272(final SubLObject var1) {
        return f41264(var1);
    }
    
    public static SubLObject f41273(SubLObject var1) {
        if (var1 == module0676.UNPROVIDED) {
            var1 = (SubLObject)module0676.NIL;
        }
        return f41266(var1);
    }
    
    public static SubLObject f41269(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)module0676.$ic8$, var1);
        final SubLObject var3 = (SubLObject)((module0676.NIL != var2) ? module0656.f39943(var2, (SubLObject)module0676.UNPROVIDED) : module0676.NIL);
        final SubLObject var4 = module0642.f39104((SubLObject)module0676.$ic9$, var1);
        final SubLObject var5 = module0642.f39104((SubLObject)module0676.$ic10$, var1);
        final SubLObject var6 = module0642.f39104((SubLObject)module0676.$ic11$, var1);
        if (module0676.NIL != var2) {
            module0543.f33628((SubLObject)ConsesLow.list(module0676.$ic12$, var3, module0574.f35152()), module0676.$ic13$, (SubLObject)module0676.$ic14$, (SubLObject)module0676.$ic15$);
        }
        if (module0676.NIL != var6 && module0676.NIL != var2 && module0676.NIL != var5) {
            module0543.f33628((SubLObject)ConsesLow.list(module0676.$ic16$, var3, var6), module0132.$g1572$.getGlobalValue(), (SubLObject)module0676.$ic17$, (SubLObject)module0676.$ic18$);
        }
        module0674.f41154((SubLObject)module0676.$ic19$, (SubLObject)module0676.T, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
        return (SubLObject)module0676.NIL;
    }
    
    public static SubLObject f41267(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        module0543.f33621();
        final SubLObject var13 = module0656.f39943(var11, (SubLObject)module0676.UNPROVIDED);
        if (module0676.NIL != module0173.f10955(var13)) {
            if (module0676.NIL != module0167.f10813(var13)) {
                module0677.f41360(var13);
            }
            else {
                module0677.f41359(var13);
            }
            final SubLObject var14 = module0656.f39842(var13);
            final SubLObject var15 = module0656.f39832((SubLObject)module0676.NIL);
            module0642.f39020(module0015.$g282$.getGlobalValue());
            module0642.f39020(module0015.$g284$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
            module0642.f39020(module0110.$g570$.getDynamicValue(var12));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
            module0642.f39020(module0015.$g285$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
            module0642.f39020((SubLObject)module0676.$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
            if (module0676.NIL != var15) {
                module0642.f39020(module0015.$g286$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020(var15);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
            final SubLObject var16 = module0015.$g533$.currentBinding(var12);
            final SubLObject var17 = module0015.$g541$.currentBinding(var12);
            final SubLObject var18 = module0015.$g539$.currentBinding(var12);
            try {
                module0015.$g533$.bind((SubLObject)module0676.T, var12);
                module0015.$g541$.bind((SubLObject)module0676.T, var12);
                module0015.$g539$.bind(module0015.f797(), var12);
                module0642.f39069((SubLObject)module0676.$ic23$, (SubLObject)module0676.T, (SubLObject)module0676.UNPROVIDED);
                module0656.f39870((SubLObject)module0676.$ic20$, (SubLObject)module0676.$ic24$, (SubLObject)module0676.$ic25$);
                module0642.f39026((SubLObject)module0676.UNPROVIDED);
                module0656.f39790((SubLObject)module0676.$ic24$, (SubLObject)module0676.$ic26$);
                module0642.f39032((SubLObject)module0676.UNPROVIDED);
                module0642.f39073((SubLObject)module0676.$ic27$);
                module0642.f39032((SubLObject)module0676.UNPROVIDED);
                module0642.f39074((SubLObject)module0676.$ic28$, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
                module0642.f39051((SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39020(module0015.$g234$.getGlobalValue());
                PrintLow.format(module0015.$g131$.getDynamicValue(var12), (SubLObject)module0676.$ic29$, var13, var14);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39026((SubLObject)module0676.TWO_INTEGER);
                module0642.f39068((SubLObject)module0676.$ic8$, var13, (SubLObject)module0676.NIL, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
                module0642.f39032((SubLObject)module0676.TWO_INTEGER);
                module0642.f39019((SubLObject)module0676.$ic30$);
                module0642.f39026((SubLObject)module0676.UNPROVIDED);
                module0642.f39068((SubLObject)module0676.$ic9$, (SubLObject)module0676.T, (SubLObject)module0676.NIL, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
                module0642.f39032((SubLObject)module0676.TWO_INTEGER);
                module0642.f39019((SubLObject)module0676.$ic31$);
                module0642.f39026((SubLObject)module0676.UNPROVIDED);
                module0642.f39068((SubLObject)module0676.$ic10$, (SubLObject)module0676.T, (SubLObject)module0676.T, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
                module0642.f39032((SubLObject)module0676.TWO_INTEGER);
                module0642.f39019((SubLObject)module0676.$ic32$);
                module0642.f39026((SubLObject)module0676.TWO_INTEGER);
                if (module0676.NIL != module0655.$g5102$.getDynamicValue(var12)) {
                    module0642.f39020(module0015.$g336$.getGlobalValue());
                    module0642.f39020(module0015.$g338$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020((SubLObject)module0676.$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020(module0015.$g340$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020((SubLObject)module0676.$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020(module0015.$g339$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020((SubLObject)module0676.TWENTY_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020(module0015.$g350$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020((SubLObject)module0676.$ic34$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                    final SubLObject var15_18 = module0015.$g533$.currentBinding(var12);
                    try {
                        module0015.$g533$.bind((SubLObject)module0676.T, var12);
                    }
                    finally {
                        module0015.$g533$.rebind(var15_18, var12);
                    }
                    module0642.f39020(module0015.$g337$.getGlobalValue());
                }
                else {
                    module0642.f39020(module0015.$g336$.getGlobalValue());
                    module0642.f39020(module0015.$g338$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020((SubLObject)module0676.$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020(module0015.$g340$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020((SubLObject)module0676.$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020(module0015.$g339$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020((SubLObject)module0676.TWENTY_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                    final SubLObject var15_19 = module0015.$g533$.currentBinding(var12);
                    try {
                        module0015.$g533$.bind((SubLObject)module0676.T, var12);
                    }
                    finally {
                        module0015.$g533$.rebind(var15_19, var12);
                    }
                    module0642.f39020(module0015.$g337$.getGlobalValue());
                }
                module0015.f799(module0015.$g539$.getDynamicValue(var12));
            }
            finally {
                module0015.$g539$.rebind(var18, var12);
                module0015.$g541$.rebind(var17, var12);
                module0015.$g533$.rebind(var16, var12);
            }
            module0642.f39020(module0015.$g283$.getGlobalValue());
        }
        else {
            module0656.f39789((SubLObject)module0676.$ic35$, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
        }
        return (SubLObject)module0676.NIL;
    }
    
    public static SubLObject f41265(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        module0543.f33621();
        module0677.f41336(var5);
        final SubLObject var7 = assertion_handles_oc.f11025(var5);
        final SubLObject var8 = module0656.f39832((SubLObject)module0676.NIL);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var6));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
        module0642.f39020((SubLObject)module0676.$ic22$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
        if (module0676.NIL != var8) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
            module0642.f39020(var8);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
        final SubLObject var9 = module0015.$g533$.currentBinding(var6);
        final SubLObject var10 = module0015.$g541$.currentBinding(var6);
        final SubLObject var11 = module0015.$g539$.currentBinding(var6);
        try {
            module0015.$g533$.bind((SubLObject)module0676.T, var6);
            module0015.$g541$.bind((SubLObject)module0676.T, var6);
            module0015.$g539$.bind(module0015.f797(), var6);
            module0642.f39069((SubLObject)module0676.$ic36$, (SubLObject)module0676.T, (SubLObject)module0676.UNPROVIDED);
            module0656.f39870((SubLObject)module0676.$ic37$, (SubLObject)module0676.$ic24$, (SubLObject)module0676.$ic38$);
            module0642.f39026((SubLObject)module0676.UNPROVIDED);
            module0656.f39790((SubLObject)module0676.$ic24$, (SubLObject)module0676.$ic26$);
            module0642.f39032((SubLObject)module0676.UNPROVIDED);
            module0642.f39073((SubLObject)module0676.$ic27$);
            module0642.f39032((SubLObject)module0676.UNPROVIDED);
            module0642.f39074((SubLObject)module0676.$ic28$, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
            module0642.f39051((SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
            module0642.f39020(module0015.$g207$.getGlobalValue());
            module0642.f39020(module0015.$g234$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var6), (SubLObject)module0676.$ic39$, var7);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39020(module0015.$g208$.getGlobalValue());
            module0642.f39026((SubLObject)module0676.UNPROVIDED);
            module0671.f40981(var5);
            module0671.f40982(var5);
            if (module0676.NIL != module0211.f13700(var5)) {
                module0642.f39051((SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)module0676.$ic40$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39026((SubLObject)module0676.TWO_INTEGER);
                module0669.f40734(var5);
            }
            module0642.f39051((SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
            module0642.f39068((SubLObject)module0676.$ic41$, var7, (SubLObject)module0676.NIL, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
            module0642.f39032((SubLObject)module0676.TWO_INTEGER);
            module0642.f39019((SubLObject)module0676.$ic42$);
            module0642.f39026((SubLObject)module0676.UNPROVIDED);
            module0642.f39068((SubLObject)module0676.$ic9$, (SubLObject)module0676.T, (SubLObject)module0676.NIL, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
            module0642.f39032((SubLObject)module0676.TWO_INTEGER);
            module0642.f39019((SubLObject)module0676.$ic31$);
            module0642.f39026((SubLObject)module0676.UNPROVIDED);
            module0642.f39068((SubLObject)module0676.$ic10$, (SubLObject)module0676.T, (SubLObject)module0676.T, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
            module0642.f39032((SubLObject)module0676.TWO_INTEGER);
            module0642.f39019((SubLObject)module0676.$ic32$);
            module0642.f39026((SubLObject)module0676.TWO_INTEGER);
            if (module0676.NIL != module0655.$g5102$.getDynamicValue(var6)) {
                module0642.f39020(module0015.$g336$.getGlobalValue());
                module0642.f39020(module0015.$g338$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020((SubLObject)module0676.$ic11$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020(module0015.$g340$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020((SubLObject)module0676.$ic33$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020(module0015.$g339$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020((SubLObject)module0676.TWENTY_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020(module0015.$g350$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020((SubLObject)module0676.$ic34$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                final SubLObject var15_21 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)module0676.T, var6);
                }
                finally {
                    module0015.$g533$.rebind(var15_21, var6);
                }
                module0642.f39020(module0015.$g337$.getGlobalValue());
            }
            else {
                module0642.f39020(module0015.$g336$.getGlobalValue());
                module0642.f39020(module0015.$g338$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020((SubLObject)module0676.$ic11$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020(module0015.$g340$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020((SubLObject)module0676.$ic33$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020(module0015.$g339$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020((SubLObject)module0676.TWENTY_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                final SubLObject var15_22 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)module0676.T, var6);
                }
                finally {
                    module0015.$g533$.rebind(var15_22, var6);
                }
                module0642.f39020(module0015.$g337$.getGlobalValue());
            }
            module0015.f799(module0015.$g539$.getDynamicValue(var6));
        }
        finally {
            module0015.$g539$.rebind(var11, var6);
            module0015.$g541$.rebind(var10, var6);
            module0015.$g533$.rebind(var9, var6);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        return (SubLObject)module0676.NIL;
    }
    
    public static SubLObject f41271(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)module0676.$ic41$, var1);
        final SubLObject var3 = (SubLObject)((module0676.NIL != var2) ? assertion_handles_oc.f11053(reader.parse_integer(var2, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED)) : module0676.NIL);
        final SubLObject var4 = (SubLObject)((module0676.NIL != var3) ? module0289.f19396(var3) : module0676.NIL);
        final SubLObject var5 = module0178.f11287(var3);
        final SubLObject var6 = module0642.f39104((SubLObject)module0676.$ic10$, var1);
        final SubLObject var7 = module0642.f39104((SubLObject)module0676.$ic11$, var1);
        if (module0676.NIL != var2 && module0676.NIL != var3) {
            module0543.f33628((SubLObject)ConsesLow.list(module0676.$ic12$, (SubLObject)ConsesLow.list(module0676.$ic43$, var5, var4), module0574.f35152()), module0676.$ic13$, (SubLObject)module0676.$ic14$, (SubLObject)module0676.$ic18$);
        }
        if (module0676.NIL != var7 && !var7.equal((SubLObject)module0676.$ic44$) && module0676.NIL != var2 && module0676.NIL != var6) {
            module0543.f33628((SubLObject)ConsesLow.list(module0676.$ic16$, var4, var7), var5, (SubLObject)module0676.$ic17$, (SubLObject)module0676.$ic18$);
        }
        module0674.f41154((SubLObject)module0676.$ic45$, (SubLObject)module0676.T, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
        return (SubLObject)module0676.NIL;
    }
    
    public static SubLObject f41274(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = module0617.f37872(var25, (SubLObject)module0676.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0676.NIL == module0226.f15075(var25, (SubLObject)module0676.UNPROVIDED) && module0676.NIL != var27 && module0655.$g5138$.getDynamicValue(var26).numLE(var27) && var27.numLE(module0655.$g5139$.getDynamicValue(var26)));
    }
    
    public static SubLObject f41275(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0676.NIL == module0659.f40063(var5) && module0676.NIL == module0004.f104(module0656.f39864(var5), module0655.$g5137$.getDynamicValue(var6), (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED) && module0676.NIL != module0178.f11296(var5) && module0655.$g5138$.getDynamicValue(var6).numLE(module0178.f11296(var5)) && module0178.f11296(var5).numLE(module0655.$g5139$.getDynamicValue(var6)) && module0676.NIL == module0656.f39974(var5));
    }
    
    public static SubLObject f41276(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)module0676.$ic48$;
        final SubLObject var4 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0676.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0676.$ic49$);
            module0642.f39029((SubLObject)module0676.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var5 = module0014.f672((SubLObject)module0676.$ic50$);
            module0642.f39029((SubLObject)module0676.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
            module0642.f39020((SubLObject)module0676.$ic51$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
            if (module0676.NIL != var5) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020(var5);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
            module0642.f39020((SubLObject)module0676.$ic52$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
            module0016.f941();
            if (module0676.NIL != var3) {
                module0642.f39029((SubLObject)module0676.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var3);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0676.UNPROVIDED);
            final SubLObject var15_29 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0676.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0676.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39020((SubLObject)module0676.$ic55$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                final SubLObject var15_30 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0676.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020((SubLObject)module0676.$ic56$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                    final SubLObject var15_31 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0676.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39020((SubLObject)module0676.$ic57$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39020((SubLObject)module0676.$ic58$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39019((SubLObject)module0676.$ic59$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var15_31, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0676.NIL != var3) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0676.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0676.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                    }
                    final SubLObject var6 = module0656.f39832((SubLObject)module0676.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    module0642.f39020((SubLObject)module0676.$ic22$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    if (module0676.NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                    final SubLObject var15_32 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0676.T, var2);
                        module0015.$g541$.bind((SubLObject)module0676.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069((SubLObject)module0676.$ic60$, (SubLObject)module0676.T, (SubLObject)module0676.UNPROVIDED);
                        module0656.f39870((SubLObject)module0676.$ic46$, (SubLObject)module0676.$ic24$, (SubLObject)module0676.$ic61$);
                        module0642.f39026((SubLObject)module0676.UNPROVIDED);
                        module0656.f39790((SubLObject)module0676.$ic24$, (SubLObject)module0676.$ic26$);
                        module0642.f39032((SubLObject)module0676.UNPROVIDED);
                        module0642.f39073((SubLObject)module0676.$ic27$);
                        module0642.f39032((SubLObject)module0676.UNPROVIDED);
                        module0642.f39074((SubLObject)module0676.$ic62$, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39051((SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39020(module0015.$g207$.getGlobalValue());
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0676.$ic63$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39020(module0015.$g208$.getGlobalValue());
                        module0642.f39026((SubLObject)module0676.TWO_INTEGER);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39046(module0015.$g348$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39020((SubLObject)module0676.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39020((SubLObject)module0676.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39020((SubLObject)module0676.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                        final SubLObject var15_33 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0676.T, var2);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                            final SubLObject var15_34 = module0015.$g533$.currentBinding(var2);
                            try {
                                module0015.$g533$.bind((SubLObject)module0676.T, var2);
                                module0642.f39019((SubLObject)module0676.$ic64$);
                                module0642.f39026((SubLObject)module0676.UNPROVIDED);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0676.$ic65$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0676.$ic66$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                                final SubLObject var15_35 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0676.T, var2);
                                    final SubLObject var9 = module0659.f40102((SubLObject)module0676.$ic67$);
                                    module0642.f39068((SubLObject)module0676.$ic68$, (SubLObject)module0676.T, var9, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
                                    module0642.f39032((SubLObject)module0676.TWO_INTEGER);
                                    module0642.f39019((SubLObject)module0676.$ic69$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var15_35, var2);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39026((SubLObject)module0676.UNPROVIDED);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0676.$ic65$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0676.$ic66$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0676.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0676.UNPROVIDED);
                                final SubLObject var15_36 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0676.T, var2);
                                    final SubLObject var10 = module0659.f40102((SubLObject)module0676.$ic70$);
                                    module0642.f39068((SubLObject)module0676.$ic71$, (SubLObject)module0676.T, var10, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
                                    module0642.f39032((SubLObject)module0676.TWO_INTEGER);
                                    module0642.f39019((SubLObject)module0676.$ic72$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var15_36, var2);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var15_34, var2);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0676.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var15_33, var2);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0642.f39051((SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0676.$ic73$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)module0676.UNPROVIDED);
                        module0642.f39032((SubLObject)module0676.THREE_INTEGER);
                        module0642.f39019((SubLObject)module0676.$ic74$);
                        module0642.f39026((SubLObject)module0676.UNPROVIDED);
                        module0656.f39972(module0655.$g5138$.getDynamicValue(var2), (SubLObject)module0676.$ic75$);
                        module0642.f39026((SubLObject)module0676.TWO_INTEGER);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0676.$ic76$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)module0676.UNPROVIDED);
                        module0656.f39972(module0655.$g5139$.getDynamicValue(var2), (SubLObject)module0676.$ic77$);
                        module0642.f39026((SubLObject)module0676.TWO_INTEGER);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0676.$ic78$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)module0676.UNPROVIDED);
                        module0642.f39032((SubLObject)module0676.THREE_INTEGER);
                        module0642.f39019((SubLObject)module0676.$ic79$);
                        Functions.apply(Symbols.symbol_function((SubLObject)module0676.$ic80$), (SubLObject)module0676.$ic81$, module0655.f39755());
                        module0642.f39026((SubLObject)module0676.UNPROVIDED);
                        module0642.f39032((SubLObject)module0676.THREE_INTEGER);
                        module0642.f39068((SubLObject)module0676.$ic82$, (SubLObject)module0676.NIL, (SubLObject)SubLObjectFactory.makeBoolean(module0676.NIL != module0655.f39755() && module0676.NIL == module0661.f40283()), (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED, (SubLObject)module0676.UNPROVIDED);
                        module0642.f39019((SubLObject)module0676.$ic83$);
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var2);
                        module0015.$g541$.rebind(var7, var2);
                        module0015.$g533$.rebind(var15_32, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0676.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var15_30, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0676.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var15_29, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0676.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var4, var2);
        }
        return (SubLObject)module0676.NIL;
    }
    
    public static SubLObject f41277(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)module0676.$ic68$, var1);
        final SubLObject var3 = module0642.f39104((SubLObject)module0676.$ic71$, var1);
        module0659.f40103((SubLObject)module0676.$ic67$, var2);
        module0659.f40103((SubLObject)module0676.$ic70$, var3);
        module0655.$g5138$.setDynamicValue(module0656.f39973((SubLObject)module0676.$ic75$, var1));
        module0655.$g5139$.setDynamicValue(module0656.f39973((SubLObject)module0676.$ic77$, var1));
        module0655.f39756(module0661.f40258((SubLObject)module0676.$ic81$, var1));
        if (module0676.NIL != module0655.f39755() && module0676.NIL != module0642.f39104((SubLObject)module0676.$ic82$, var1)) {
            module0661.f40249((SubLObject)module0676.$ic85$, (SubLObject)module0676.UNPROVIDED);
            module0661.f40284(module0655.f39755());
        }
        f41278();
        return (SubLObject)module0676.NIL;
    }
    
    public static SubLObject f41278() {
        module0656.f39793((SubLObject)module0676.$ic87$, (SubLObject)module0676.T);
        return (SubLObject)module0676.NIL;
    }
    
    public static SubLObject f41279() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41264", "CB-KE-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41266", "CB-KEC-EDIT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41268", "CB-CONSTANT-REVIEW-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41270", "CB-ASSERTION-REVIEW-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41272", "CB-TAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41273", "CB-TCF", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41269", "S#45286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41267", "S#45287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41265", "S#45288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41271", "S#45289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41274", "S#45290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41275", "S#44180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41276", "KE-REVIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41277", "KE-REVIEW-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0676", "f41278", "S#45291", 0, 0, false);
        return (SubLObject)module0676.NIL;
    }
    
    public static SubLObject f41280() {
        return (SubLObject)module0676.NIL;
    }
    
    public static SubLObject f41281() {
        module0015.f873((SubLObject)module0676.$ic2$);
        module0015.f873((SubLObject)module0676.$ic3$);
        module0015.f873((SubLObject)module0676.$ic4$);
        module0015.f873((SubLObject)module0676.$ic5$);
        module0015.f873((SubLObject)module0676.$ic6$);
        module0015.f873((SubLObject)module0676.$ic7$);
        Hashtables.sethash((SubLObject)module0676.$ic20$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0676.$ic21$, (SubLObject)module0676.NIL));
        Hashtables.sethash((SubLObject)module0676.$ic46$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0676.$ic47$, (SubLObject)module0676.NIL));
        module0015.f873((SubLObject)module0676.$ic84$);
        module0015.f873((SubLObject)module0676.$ic86$);
        return (SubLObject)module0676.NIL;
    }
    
    public void declareFunctions() {
        f41279();
    }
    
    public void initializeVariables() {
        f41280();
    }
    
    public void runTopLevelForms() {
        f41281();
    }
    
    static {
        me = (SubLFile)new module0676();
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ID"));
        $ic1$ = SubLObjectFactory.makeString("Could not determine an assertion from ~a");
        $ic2$ = SubLObjectFactory.makeSymbol("CB-KE-EDIT");
        $ic3$ = SubLObjectFactory.makeSymbol("CB-KEC-EDIT");
        $ic4$ = SubLObjectFactory.makeSymbol("CB-CONSTANT-REVIEW-HANDLER");
        $ic5$ = SubLObjectFactory.makeSymbol("CB-ASSERTION-REVIEW-HANDLER");
        $ic6$ = SubLObjectFactory.makeSymbol("CB-TAF");
        $ic7$ = SubLObjectFactory.makeSymbol("CB-TCF");
        $ic8$ = SubLObjectFactory.makeString("Approve-Constant");
        $ic9$ = SubLObjectFactory.makeString("Email-Comments");
        $ic10$ = SubLObjectFactory.makeString("Assert-Comments");
        $ic11$ = SubLObjectFactory.makeString("comment");
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("myReviewer"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $ic14$ = SubLObjectFactory.makeKeyword("MONOTONIC");
        $ic15$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic16$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("cyclistNotes"));
        $ic17$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic18$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic19$ = SubLObjectFactory.makeString("Approved Constant");
        $ic20$ = SubLObjectFactory.makeKeyword("CB-CONSTANT-REVIEW");
        $ic21$ = SubLObjectFactory.makeString("cb-constant-review.html");
        $ic22$ = SubLObjectFactory.makeString("post");
        $ic23$ = SubLObjectFactory.makeString("cb-constant-review-handler");
        $ic24$ = SubLObjectFactory.makeKeyword("SELF");
        $ic25$ = SubLObjectFactory.makeString("Review the Cyc Constant");
        $ic26$ = SubLObjectFactory.makeString("Cancel");
        $ic27$ = SubLObjectFactory.makeString("Current Values");
        $ic28$ = SubLObjectFactory.makeString("Submit Values");
        $ic29$ = SubLObjectFactory.makeString("Cyc Constant ~A, ID: #~A");
        $ic30$ = SubLObjectFactory.makeString("Approve the Constant for Addition to Cyc");
        $ic31$ = SubLObjectFactory.makeString("Copy the Comment Field to myCreator via Email");
        $ic32$ = SubLObjectFactory.makeString("Assert the Comments as a #$cyclistNotes");
        $ic33$ = SubLObjectFactory.makeInteger(80);
        $ic34$ = SubLObjectFactory.makeString("virtual");
        $ic35$ = SubLObjectFactory.makeString("The requested term is not available.");
        $ic36$ = SubLObjectFactory.makeString("cb-assertion-review-handler");
        $ic37$ = SubLObjectFactory.makeString("cb-assertion-review");
        $ic38$ = SubLObjectFactory.makeString("Review the Cyc Assertion");
        $ic39$ = SubLObjectFactory.makeString("Cyc Assertion  ID: #~A");
        $ic40$ = SubLObjectFactory.makeString("Meta Assertions :");
        $ic41$ = SubLObjectFactory.makeString("Approve-Assertion");
        $ic42$ = SubLObjectFactory.makeString("Approve the Assertion for Addition to Cyc");
        $ic43$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic44$ = SubLObjectFactory.makeString("");
        $ic45$ = SubLObjectFactory.makeString("Approved Assertion");
        $ic46$ = SubLObjectFactory.makeKeyword("KE-REVIEW");
        $ic47$ = SubLObjectFactory.makeString("ke-review.html");
        $ic48$ = SubLObjectFactory.makeString("Knowledge Entry Review Tools");
        $ic49$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic50$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic51$ = SubLObjectFactory.makeString("stylesheet");
        $ic52$ = SubLObjectFactory.makeString("text/css");
        $ic53$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic54$ = SubLObjectFactory.makeString("text/javascript");
        $ic55$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic56$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic57$ = SubLObjectFactory.makeString("button");
        $ic58$ = SubLObjectFactory.makeString("reload");
        $ic59$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic60$ = SubLObjectFactory.makeString("ke-review-handler");
        $ic61$ = SubLObjectFactory.makeString("Knowledge Entry Review Options");
        $ic62$ = SubLObjectFactory.makeString("Change KE Options");
        $ic63$ = SubLObjectFactory.makeString("General KE Review Options");
        $ic64$ = SubLObjectFactory.makeString("Allow KE Review Tags and links");
        $ic65$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic66$ = SubLObjectFactory.makeKeyword("TOP");
        $ic67$ = SubLObjectFactory.makeSymbol("S#44167", "CYC");
        $ic68$ = SubLObjectFactory.makeString("enable-ke-assertion-review");
        $ic69$ = SubLObjectFactory.makeString("on assertions");
        $ic70$ = SubLObjectFactory.makeSymbol("S#44166", "CYC");
        $ic71$ = SubLObjectFactory.makeString("enable-ke-constant-review");
        $ic72$ = SubLObjectFactory.makeString("on constants");
        $ic73$ = SubLObjectFactory.makeString("Enter in the start date:");
        $ic74$ = SubLObjectFactory.makeString("Tools will be limited to constants and assertions for which #$myCreationTime is between the start and end date.");
        $ic75$ = SubLObjectFactory.makeString("cb-show-start");
        $ic76$ = SubLObjectFactory.makeString("Enter in the ending date:");
        $ic77$ = SubLObjectFactory.makeString("cb-show-end");
        $ic78$ = SubLObjectFactory.makeString("Enter the cyclist(s) to examine (blank indicates to examine ALL cyclists):");
        $ic79$ = SubLObjectFactory.makeString("Tools will be limited to constants and assertions which the below cyclists are the #$myCreator for.");
        $ic80$ = SubLObjectFactory.makeSymbol("S#44310", "CYC");
        $ic81$ = SubLObjectFactory.makeString("foo");
        $ic82$ = SubLObjectFactory.makeString("narrow-filter-too");
        $ic83$ = SubLObjectFactory.makeString("Also narrow our viewpoint to include only these cyclists as the myCreator");
        $ic84$ = SubLObjectFactory.makeSymbol("KE-REVIEW");
        $ic85$ = SubLObjectFactory.makeSymbol("S#44389", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("KE-REVIEW-HANDLER");
        $ic87$ = SubLObjectFactory.makeString("KE Review Options have been modified");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0676.class
	Total time: 361 ms
	
	Decompiled with Procyon 0.5.32.
*/