package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        SubLObject var2 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic0$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (NIL == var3) {
            final SubLObject var4 = module0656.f39970(var2);
            if (NIL == assertion_handles_oc.f11035(var4)) {
                return module0656.f39789((SubLObject)$ic1$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            f41265(var4);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic0$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41266(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
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
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        return f41266(var1);
    }
    
    public static SubLObject f41269(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)$ic8$, var1);
        final SubLObject var3 = (SubLObject)((NIL != var2) ? module0656.f39943(var2, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var4 = module0642.f39104((SubLObject)$ic9$, var1);
        final SubLObject var5 = module0642.f39104((SubLObject)$ic10$, var1);
        final SubLObject var6 = module0642.f39104((SubLObject)$ic11$, var1);
        if (NIL != var2) {
            module0543.f33628((SubLObject)ConsesLow.list($ic12$, var3, module0574.f35152()), $ic13$, (SubLObject)$ic14$, (SubLObject)$ic15$);
        }
        if (NIL != var6 && NIL != var2 && NIL != var5) {
            module0543.f33628((SubLObject)ConsesLow.list($ic16$, var3, var6), module0132.$g1572$.getGlobalValue(), (SubLObject)$ic17$, (SubLObject)$ic18$);
        }
        module0674.f41154((SubLObject)$ic19$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41267(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        module0543.f33621();
        final SubLObject var13 = module0656.f39943(var11, (SubLObject)UNPROVIDED);
        if (NIL != module0173.f10955(var13)) {
            if (NIL != module0167.f10813(var13)) {
                module0677.f41360(var13);
            }
            else {
                module0677.f41359(var13);
            }
            final SubLObject var14 = module0656.f39842(var13);
            final SubLObject var15 = module0656.f39832((SubLObject)NIL);
            module0642.f39020(module0015.$g282$.getGlobalValue());
            module0642.f39020(module0015.$g284$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0110.$g570$.getDynamicValue(var12));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g285$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic22$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var15) {
                module0642.f39020(module0015.$g286$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var15);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var16 = module0015.$g533$.currentBinding(var12);
            final SubLObject var17 = module0015.$g541$.currentBinding(var12);
            final SubLObject var18 = module0015.$g539$.currentBinding(var12);
            try {
                module0015.$g533$.bind((SubLObject)T, var12);
                module0015.$g541$.bind((SubLObject)T, var12);
                module0015.$g539$.bind(module0015.f797(), var12);
                module0642.f39069((SubLObject)$ic23$, (SubLObject)T, (SubLObject)UNPROVIDED);
                module0656.f39870((SubLObject)$ic20$, (SubLObject)$ic24$, (SubLObject)$ic25$);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0656.f39790((SubLObject)$ic24$, (SubLObject)$ic26$);
                module0642.f39032((SubLObject)UNPROVIDED);
                module0642.f39073((SubLObject)$ic27$);
                module0642.f39032((SubLObject)UNPROVIDED);
                module0642.f39074((SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39020(module0015.$g234$.getGlobalValue());
                PrintLow.format(module0015.$g131$.getDynamicValue(var12), (SubLObject)$ic29$, var13, var14);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39026((SubLObject)TWO_INTEGER);
                module0642.f39068((SubLObject)$ic8$, var13, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)TWO_INTEGER);
                module0642.f39019((SubLObject)$ic30$);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39068((SubLObject)$ic9$, (SubLObject)T, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)TWO_INTEGER);
                module0642.f39019((SubLObject)$ic31$);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39068((SubLObject)$ic10$, (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)TWO_INTEGER);
                module0642.f39019((SubLObject)$ic32$);
                module0642.f39026((SubLObject)TWO_INTEGER);
                if (NIL != module0655.$g5102$.getDynamicValue(var12)) {
                    module0642.f39020(module0015.$g336$.getGlobalValue());
                    module0642.f39020(module0015.$g338$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g340$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g339$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)TWENTY_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g350$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic34$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var15_18 = module0015.$g533$.currentBinding(var12);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var12);
                    }
                    finally {
                        module0015.$g533$.rebind(var15_18, var12);
                    }
                    module0642.f39020(module0015.$g337$.getGlobalValue());
                }
                else {
                    module0642.f39020(module0015.$g336$.getGlobalValue());
                    module0642.f39020(module0015.$g338$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g340$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g339$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)TWENTY_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var15_19 = module0015.$g533$.currentBinding(var12);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var12);
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
            module0656.f39789((SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41265(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        module0543.f33621();
        module0677.f41336(var5);
        final SubLObject var7 = assertion_handles_oc.f11025(var5);
        final SubLObject var8 = module0656.f39832((SubLObject)NIL);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var6));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic22$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var8) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var8);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var9 = module0015.$g533$.currentBinding(var6);
        final SubLObject var10 = module0015.$g541$.currentBinding(var6);
        final SubLObject var11 = module0015.$g539$.currentBinding(var6);
        try {
            module0015.$g533$.bind((SubLObject)T, var6);
            module0015.$g541$.bind((SubLObject)T, var6);
            module0015.$g539$.bind(module0015.f797(), var6);
            module0642.f39069((SubLObject)$ic36$, (SubLObject)T, (SubLObject)UNPROVIDED);
            module0656.f39870((SubLObject)$ic37$, (SubLObject)$ic24$, (SubLObject)$ic38$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0656.f39790((SubLObject)$ic24$, (SubLObject)$ic26$);
            module0642.f39032((SubLObject)UNPROVIDED);
            module0642.f39073((SubLObject)$ic27$);
            module0642.f39032((SubLObject)UNPROVIDED);
            module0642.f39074((SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g207$.getGlobalValue());
            module0642.f39020(module0015.$g234$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var6), (SubLObject)$ic39$, var7);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39020(module0015.$g208$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            module0671.f40981(var5);
            module0671.f40982(var5);
            if (NIL != module0211.f13700(var5)) {
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic40$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39026((SubLObject)TWO_INTEGER);
                module0669.f40734(var5);
            }
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39068((SubLObject)$ic41$, var7, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic42$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39068((SubLObject)$ic9$, (SubLObject)T, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic31$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39068((SubLObject)$ic10$, (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic32$);
            module0642.f39026((SubLObject)TWO_INTEGER);
            if (NIL != module0655.$g5102$.getDynamicValue(var6)) {
                module0642.f39020(module0015.$g336$.getGlobalValue());
                module0642.f39020(module0015.$g338$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic11$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g340$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic33$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g339$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)TWENTY_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g350$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic34$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var15_21 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)T, var6);
                }
                finally {
                    module0015.$g533$.rebind(var15_21, var6);
                }
                module0642.f39020(module0015.$g337$.getGlobalValue());
            }
            else {
                module0642.f39020(module0015.$g336$.getGlobalValue());
                module0642.f39020(module0015.$g338$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic11$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g340$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic33$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g339$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)TWENTY_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var15_22 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)T, var6);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41271(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)$ic41$, var1);
        final SubLObject var3 = (SubLObject)((NIL != var2) ? assertion_handles_oc.f11053(reader.parse_integer(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : NIL);
        final SubLObject var4 = (SubLObject)((NIL != var3) ? module0289.f19396(var3) : NIL);
        final SubLObject var5 = module0178.f11287(var3);
        final SubLObject var6 = module0642.f39104((SubLObject)$ic10$, var1);
        final SubLObject var7 = module0642.f39104((SubLObject)$ic11$, var1);
        if (NIL != var2 && NIL != var3) {
            module0543.f33628((SubLObject)ConsesLow.list($ic12$, (SubLObject)ConsesLow.list($ic43$, var5, var4), module0574.f35152()), $ic13$, (SubLObject)$ic14$, (SubLObject)$ic18$);
        }
        if (NIL != var7 && !var7.equal((SubLObject)$ic44$) && NIL != var2 && NIL != var6) {
            module0543.f33628((SubLObject)ConsesLow.list($ic16$, var4, var7), var5, (SubLObject)$ic17$, (SubLObject)$ic18$);
        }
        module0674.f41154((SubLObject)$ic45$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41274(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = module0617.f37872(var25, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL == module0226.f15075(var25, (SubLObject)UNPROVIDED) && NIL != var27 && module0655.$g5138$.getDynamicValue(var26).numLE(var27) && var27.numLE(module0655.$g5139$.getDynamicValue(var26)));
    }
    
    public static SubLObject f41275(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == module0659.f40063(var5) && NIL == module0004.f104(module0656.f39864(var5), module0655.$g5137$.getDynamicValue(var6), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0178.f11296(var5) && module0655.$g5138$.getDynamicValue(var6).numLE(module0178.f11296(var5)) && module0178.f11296(var5).numLE(module0655.$g5139$.getDynamicValue(var6)) && NIL == module0656.f39974(var5));
    }
    
    public static SubLObject f41276(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)$ic48$;
        final SubLObject var4 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
            module0642.f39020((SubLObject)$ic49$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var5 = module0014.f672((SubLObject)$ic50$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic51$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var5) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var5);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic52$);
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
            final SubLObject var15_29 = module0015.$g535$.currentBinding(var2);
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
                module0642.f39020((SubLObject)$ic55$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var15_30 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic56$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var15_31 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic57$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic58$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic59$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var15_31, var2);
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
                    module0642.f39020((SubLObject)$ic22$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var15_32 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0015.$g541$.bind((SubLObject)T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069((SubLObject)$ic60$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic46$, (SubLObject)$ic24$, (SubLObject)$ic61$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0656.f39790((SubLObject)$ic24$, (SubLObject)$ic26$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39073((SubLObject)$ic27$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39074((SubLObject)$ic62$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g207$.getGlobalValue());
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic63$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39020(module0015.$g208$.getGlobalValue());
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39046(module0015.$g348$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var15_33 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var15_34 = module0015.$g533$.currentBinding(var2);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var2);
                                module0642.f39019((SubLObject)$ic64$);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic65$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic66$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var15_35 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var2);
                                    final SubLObject var9 = module0659.f40102((SubLObject)$ic67$);
                                    module0642.f39068((SubLObject)$ic68$, (SubLObject)T, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39032((SubLObject)TWO_INTEGER);
                                    module0642.f39019((SubLObject)$ic69$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var15_35, var2);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic65$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic66$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var15_36 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var2);
                                    final SubLObject var10 = module0659.f40102((SubLObject)$ic70$);
                                    module0642.f39068((SubLObject)$ic71$, (SubLObject)T, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39032((SubLObject)TWO_INTEGER);
                                    module0642.f39019((SubLObject)$ic72$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var15_33, var2);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic73$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)THREE_INTEGER);
                        module0642.f39019((SubLObject)$ic74$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0656.f39972(module0655.$g5138$.getDynamicValue(var2), (SubLObject)$ic75$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic76$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0656.f39972(module0655.$g5139$.getDynamicValue(var2), (SubLObject)$ic77$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic78$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)THREE_INTEGER);
                        module0642.f39019((SubLObject)$ic79$);
                        Functions.apply(Symbols.symbol_function((SubLObject)$ic80$), (SubLObject)$ic81$, module0655.f39755());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)THREE_INTEGER);
                        module0642.f39068((SubLObject)$ic82$, (SubLObject)NIL, (SubLObject)makeBoolean(NIL != module0655.f39755() && NIL == module0661.f40283()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic83$);
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var2);
                        module0015.$g541$.rebind(var7, var2);
                        module0015.$g533$.rebind(var15_32, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var15_30, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var15_29, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var4, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41277(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)$ic68$, var1);
        final SubLObject var3 = module0642.f39104((SubLObject)$ic71$, var1);
        module0659.f40103((SubLObject)$ic67$, var2);
        module0659.f40103((SubLObject)$ic70$, var3);
        module0655.$g5138$.setDynamicValue(module0656.f39973((SubLObject)$ic75$, var1));
        module0655.$g5139$.setDynamicValue(module0656.f39973((SubLObject)$ic77$, var1));
        module0655.f39756(module0661.f40258((SubLObject)$ic81$, var1));
        if (NIL != module0655.f39755() && NIL != module0642.f39104((SubLObject)$ic82$, var1)) {
            module0661.f40249((SubLObject)$ic85$, (SubLObject)UNPROVIDED);
            module0661.f40284(module0655.f39755());
        }
        f41278();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41278() {
        module0656.f39793((SubLObject)$ic87$, (SubLObject)T);
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41280() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41281() {
        module0015.f873((SubLObject)$ic2$);
        module0015.f873((SubLObject)$ic3$);
        module0015.f873((SubLObject)$ic4$);
        module0015.f873((SubLObject)$ic5$);
        module0015.f873((SubLObject)$ic6$);
        module0015.f873((SubLObject)$ic7$);
        Hashtables.sethash((SubLObject)$ic20$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)NIL));
        Hashtables.sethash((SubLObject)$ic46$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic84$);
        module0015.f873((SubLObject)$ic86$);
        return (SubLObject)NIL;
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
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION-ID"));
        $ic1$ = makeString("Could not determine an assertion from ~a");
        $ic2$ = makeSymbol("CB-KE-EDIT");
        $ic3$ = makeSymbol("CB-KEC-EDIT");
        $ic4$ = makeSymbol("CB-CONSTANT-REVIEW-HANDLER");
        $ic5$ = makeSymbol("CB-ASSERTION-REVIEW-HANDLER");
        $ic6$ = makeSymbol("CB-TAF");
        $ic7$ = makeSymbol("CB-TCF");
        $ic8$ = makeString("Approve-Constant");
        $ic9$ = makeString("Email-Comments");
        $ic10$ = makeString("Assert-Comments");
        $ic11$ = makeString("comment");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("myReviewer"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic14$ = makeKeyword("MONOTONIC");
        $ic15$ = makeKeyword("BACKWARD");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("cyclistNotes"));
        $ic17$ = makeKeyword("DEFAULT");
        $ic18$ = makeKeyword("FORWARD");
        $ic19$ = makeString("Approved Constant");
        $ic20$ = makeKeyword("CB-CONSTANT-REVIEW");
        $ic21$ = makeString("cb-constant-review.html");
        $ic22$ = makeString("post");
        $ic23$ = makeString("cb-constant-review-handler");
        $ic24$ = makeKeyword("SELF");
        $ic25$ = makeString("Review the Cyc Constant");
        $ic26$ = makeString("Cancel");
        $ic27$ = makeString("Current Values");
        $ic28$ = makeString("Submit Values");
        $ic29$ = makeString("Cyc Constant ~A, ID: #~A");
        $ic30$ = makeString("Approve the Constant for Addition to Cyc");
        $ic31$ = makeString("Copy the Comment Field to myCreator via Email");
        $ic32$ = makeString("Assert the Comments as a #$cyclistNotes");
        $ic33$ = makeInteger(80);
        $ic34$ = makeString("virtual");
        $ic35$ = makeString("The requested term is not available.");
        $ic36$ = makeString("cb-assertion-review-handler");
        $ic37$ = makeString("cb-assertion-review");
        $ic38$ = makeString("Review the Cyc Assertion");
        $ic39$ = makeString("Cyc Assertion  ID: #~A");
        $ic40$ = makeString("Meta Assertions :");
        $ic41$ = makeString("Approve-Assertion");
        $ic42$ = makeString("Approve the Assertion for Addition to Cyc");
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic44$ = makeString("");
        $ic45$ = makeString("Approved Assertion");
        $ic46$ = makeKeyword("KE-REVIEW");
        $ic47$ = makeString("ke-review.html");
        $ic48$ = makeString("Knowledge Entry Review Tools");
        $ic49$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic50$ = makeKeyword("CB-CYC");
        $ic51$ = makeString("stylesheet");
        $ic52$ = makeString("text/css");
        $ic53$ = makeKeyword("SHA1");
        $ic54$ = makeString("text/javascript");
        $ic55$ = makeString("yui-skin-sam");
        $ic56$ = makeString("reloadFrameButton");
        $ic57$ = makeString("button");
        $ic58$ = makeString("reload");
        $ic59$ = makeString("Refresh Frames");
        $ic60$ = makeString("ke-review-handler");
        $ic61$ = makeString("Knowledge Entry Review Options");
        $ic62$ = makeString("Change KE Options");
        $ic63$ = makeString("General KE Review Options");
        $ic64$ = makeString("Allow KE Review Tags and links");
        $ic65$ = makeKeyword("LEFT");
        $ic66$ = makeKeyword("TOP");
        $ic67$ = makeSymbol("S#44167", "CYC");
        $ic68$ = makeString("enable-ke-assertion-review");
        $ic69$ = makeString("on assertions");
        $ic70$ = makeSymbol("S#44166", "CYC");
        $ic71$ = makeString("enable-ke-constant-review");
        $ic72$ = makeString("on constants");
        $ic73$ = makeString("Enter in the start date:");
        $ic74$ = makeString("Tools will be limited to constants and assertions for which #$myCreationTime is between the start and end date.");
        $ic75$ = makeString("cb-show-start");
        $ic76$ = makeString("Enter in the ending date:");
        $ic77$ = makeString("cb-show-end");
        $ic78$ = makeString("Enter the cyclist(s) to examine (blank indicates to examine ALL cyclists):");
        $ic79$ = makeString("Tools will be limited to constants and assertions which the below cyclists are the #$myCreator for.");
        $ic80$ = makeSymbol("S#44310", "CYC");
        $ic81$ = makeString("foo");
        $ic82$ = makeString("narrow-filter-too");
        $ic83$ = makeString("Also narrow our viewpoint to include only these cyclists as the myCreator");
        $ic84$ = makeSymbol("KE-REVIEW");
        $ic85$ = makeSymbol("S#44389", "CYC");
        $ic86$ = makeSymbol("KE-REVIEW-HANDLER");
        $ic87$ = makeString("KE Review Options have been modified");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 361 ms
	
	Decompiled with Procyon 0.5.32.
*/