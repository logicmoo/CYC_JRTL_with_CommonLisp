package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0779 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0779";
    public static final String myFingerPrint = "3218613cd8a65096a4961d758c1fe5c8bff7014a30d25244f4eabde3d9219130";
    private static SubLSymbol $g6283$;
    private static SubLSymbol $g6284$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLInteger $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLInteger $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLInteger $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLObject $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLList $ic123$;
    private static final SubLString $ic124$;
    
    public static SubLObject f50236(SubLObject var1) {
        if (var1 == module0779.UNPROVIDED) {
            var1 = (SubLObject)module0779.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0779.NIL == var1) {
            var1 = (SubLObject)module0779.$ic0$;
        }
        final SubLObject var3 = module0656.f39832((SubLObject)module0779.$ic1$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0779.$ic2$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
        if (module0779.NIL != var3) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0779.T, var2);
            module0642.f39019(var1);
        }
        finally {
            module0015.$g533$.rebind(var4, var2);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0779.NIL;
    }
    
    public static SubLObject f50237(SubLObject var5) {
        if (var5 == module0779.UNPROVIDED) {
            var5 = (SubLObject)module0779.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        module0778.f50230((SubLObject)module0779.UNPROVIDED);
        if (module0779.NIL == module0778.f50150(module0778.$g6268$.getDynamicValue(var6)) && module0779.NIL == module0780.f50266((SubLObject)module0779.UNPROVIDED)) {
            f50238((SubLObject)module0779.UNPROVIDED);
            if (module0779.NIL != module0780.f50266((SubLObject)module0779.UNPROVIDED)) {
                f50237((SubLObject)module0779.UNPROVIDED);
            }
        }
        if (module0779.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0779.$ic7$);
            return (SubLObject)module0779.NIL;
        }
        module0778.$g6279$.setDynamicValue((SubLObject)module0779.NIL, var6);
        final SubLObject var7 = module0642.f39104((SubLObject)module0779.$ic8$, var5);
        final SubLObject var8 = module0778.f50207(var7);
        final SubLObject var9 = (module0779.NIL != var8) ? module0778.f50204(var8) : module0778.f50204(module0778.$g6268$.getDynamicValue(var6));
        final SubLObject var10 = module0778.f50205();
        final SubLObject var11 = module0777.f50124(module0778.f50150(var9));
        final SubLObject var12 = module0603.f36871(var11);
        final SubLObject var13 = module0778.f50155(var9);
        final SubLObject var14 = (SubLObject)SubLObjectFactory.makeBoolean(module0779.NIL != module0777.f50125(var12) && module0779.NIL == var13);
        final SubLObject var15 = (module0779.NIL != var14) ? module0584.$g4443$.getDynamicValue(var6) : module0584.$g4441$.getDynamicValue(var6);
        SubLObject var16 = module0777.f50124(module0778.f50152(var9));
        final SubLObject var17 = module0777.f50124(module0778.f50151(var9));
        final SubLObject var18 = (SubLObject)module0779.$ic9$;
        module0642.f39020((SubLObject)module0779.$ic10$);
        module0642.f39029((SubLObject)module0779.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)module0779.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0779.$ic11$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0666.f40471();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0779.UNPROVIDED);
        final SubLObject var19 = module0015.$g132$.getDynamicValue(var6);
        final SubLObject var20 = module0015.$g535$.currentBinding(var6);
        try {
            module0015.$g535$.bind((SubLObject)module0779.T, var6);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (module0779.NIL != var19) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                module0642.f39020(module0642.f39042(var19));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
            final SubLObject var4_19 = module0015.$g533$.currentBinding(var6);
            try {
                module0015.$g533$.bind((SubLObject)module0779.T, var6);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)module0779.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                module0642.f39019((SubLObject)module0779.$ic11$);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)module0779.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var6));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                if (module0779.NIL != module0015.$g290$.getGlobalValue()) {
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                    module0642.f39020(module0015.$g290$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                final SubLObject var4_20 = module0015.$g533$.currentBinding(var6);
                final SubLObject var21 = module0015.$g541$.currentBinding(var6);
                final SubLObject var22 = module0015.$g539$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)module0779.T, var6);
                    module0015.$g541$.bind((SubLObject)module0779.T, var6);
                    module0015.$g539$.bind(module0015.f797(), var6);
                    module0642.f39069((SubLObject)module0779.$ic12$, (SubLObject)module0779.T, (SubLObject)module0779.UNPROVIDED);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)module0779.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                    module0656.f39870((SubLObject)module0779.$ic5$, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                    module0642.f39019((SubLObject)module0779.$ic13$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)module0779.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                    module0642.f39074((SubLObject)module0779.$ic14$, (SubLObject)module0779.$ic15$, (SubLObject)module0779.UNPROVIDED);
                    module0642.f39026((SubLObject)module0779.TWO_INTEGER);
                    module0778.f50206(var10, var9);
                    module0642.f39069((SubLObject)module0779.$ic8$, var10, (SubLObject)module0779.UNPROVIDED);
                    module0666.f40467((SubLObject)module0779.$ic16$, (SubLObject)module0779.$ic17$, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                    module0642.f39032((SubLObject)module0779.ONE_INTEGER);
                    SubLObject var23 = (SubLObject)((module0779.NIL != var12) ? module0779.$ic18$ : module0779.$ic19$);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (module0779.NIL != var23) {
                        module0642.f39020(module0015.$g222$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                        module0642.f39020(module0642.f39042(var23));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                    final SubLObject var4_21 = module0015.$g533$.currentBinding(var6);
                    try {
                        module0015.$g533$.bind((SubLObject)module0779.T, var6);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0779.$ic20$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_21, var6);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39032((SubLObject)module0779.ONE_INTEGER);
                    module0642.f39075((SubLObject)module0779.$ic16$, var11, (SubLObject)module0779.$ic21$);
                    module0642.f39032((SubLObject)module0779.ONE_INTEGER);
                    module0644.f39184((SubLObject)module0779.$ic16$, (SubLObject)module0779.$ic22$);
                    if (module0779.NIL == var12 && module0038.f2631(var11, (SubLObject)module0779.ZERO_INTEGER).eql((SubLObject)Characters.CHAR_lparen)) {
                        module0642.f39068((SubLObject)module0779.$ic23$, (SubLObject)module0779.NIL, (SubLObject)module0779.NIL, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                        module0642.f39032((SubLObject)module0779.ONE_INTEGER);
                        module0642.f39019((SubLObject)module0779.$ic24$);
                    }
                    module0642.f39026((SubLObject)module0779.UNPROVIDED);
                    final SubLObject var24 = (SubLObject)module0779.$ic25$;
                    final SubLObject var25 = (SubLObject)((module0779.NIL != var14 || module0779.NIL != module0038.f2653(var17)) ? module0779.$ic18$ : module0779.$ic19$);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (module0779.NIL != var25) {
                        module0642.f39020(module0015.$g222$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                        module0642.f39020(module0642.f39042(var25));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                    final SubLObject var4_22 = module0015.$g533$.currentBinding(var6);
                    try {
                        module0015.$g533$.bind((SubLObject)module0779.T, var6);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019(var24);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_22, var6);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39032((SubLObject)module0779.ONE_INTEGER);
                    module0642.f39075((SubLObject)module0779.$ic26$, var17, (SubLObject)module0779.$ic21$);
                    module0642.f39032((SubLObject)module0779.ONE_INTEGER);
                    module0644.f39184((SubLObject)module0779.$ic26$, (SubLObject)module0779.$ic27$);
                    module0642.f39026((SubLObject)module0779.UNPROVIDED);
                    final SubLObject var26 = Equality.eq(module0778.f50153(var9), (SubLObject)module0779.T);
                    module0642.f39032(Numbers.add((SubLObject)module0779.ONE_INTEGER, Sequences.length(var24)));
                    module0642.f39068((SubLObject)module0779.$ic28$, var26, var26, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                    module0642.f39032((SubLObject)module0779.ONE_INTEGER);
                    module0642.f39019((SubLObject)module0779.$ic29$);
                    final SubLObject var27 = Equality.eq(module0778.f50153(var9), (SubLObject)module0779.$ic30$);
                    module0642.f39032((SubLObject)module0779.ONE_INTEGER);
                    module0642.f39068((SubLObject)module0779.$ic31$, var27, var27, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                    module0642.f39032((SubLObject)module0779.ONE_INTEGER);
                    module0642.f39019((SubLObject)module0779.$ic32$);
                    module0642.f39032((SubLObject)module0779.TWO_INTEGER);
                    module0642.f39068((SubLObject)module0779.$ic33$, module0778.f50154(var9), module0778.f50154(var9), (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                    module0642.f39032((SubLObject)module0779.ONE_INTEGER);
                    module0642.f39019((SubLObject)module0779.$ic34$);
                    if (module0779.NIL != module0777.f50125(var12)) {
                        module0642.f39032((SubLObject)module0779.TWO_INTEGER);
                        module0642.f39068((SubLObject)module0779.$ic35$, var13, var13, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                        module0642.f39032((SubLObject)module0779.ONE_INTEGER);
                        module0642.f39019((SubLObject)module0779.$ic36$);
                    }
                    module0642.f39026((SubLObject)module0779.UNPROVIDED);
                    if (module0779.NIL == module0038.f2653(var16)) {
                        var16 = var15;
                    }
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0779.$ic37$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39129((SubLObject)module0779.$ic38$, module0778.$g6274$.getGlobalValue(), module0603.f36861(var16));
                    module0642.f39026((SubLObject)module0779.UNPROVIDED);
                    if (module0779.NIL != module0778.f50154(var9)) {
                        f50239(var9, var11, var17, var16);
                    }
                    else if (module0779.NIL != var14) {
                        f50240(var9, var11, var17, var16);
                    }
                    else {
                        f50241(var9, var11, var17, var16);
                    }
                    if (module0779.NIL != module0778.f50165(var9)) {
                        module0642.f39019((SubLObject)module0779.$ic39$);
                        module0642.f39032((SubLObject)module0779.TWO_INTEGER);
                        module0656.f39804(module0778.f50165(var9), (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                        module0642.f39026((SubLObject)module0779.UNPROVIDED);
                        if (module0778.f50163(var9) == module0779.$ic40$) {
                            PrintLow.format(module0015.$g131$.getDynamicValue(var6), (SubLObject)module0779.$ic41$);
                        }
                    }
                    module0642.f39026((SubLObject)module0779.UNPROVIDED);
                    if (module0779.NIL != module0778.f50162(var9)) {
                        module0642.f39026((SubLObject)module0779.UNPROVIDED);
                        var23 = (SubLObject)module0779.$ic42$;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (module0779.NIL != var23) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                            module0642.f39020(module0642.f39042(var23));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                        final SubLObject var4_23 = module0015.$g533$.currentBinding(var6);
                        try {
                            module0015.$g533$.bind((SubLObject)module0779.T, var6);
                            module0642.f39019((SubLObject)module0779.$ic43$);
                            module0642.f39032((SubLObject)module0779.ONE_INTEGER);
                            module0642.f39019(module0778.f50162(var9));
                        }
                        finally {
                            module0015.$g533$.rebind(var4_23, var6);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39026((SubLObject)module0779.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                    module0642.f39020((SubLObject)module0779.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                    final SubLObject var4_24 = module0015.$g533$.currentBinding(var6);
                    try {
                        module0015.$g533$.bind((SubLObject)module0779.T, var6);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                        final SubLObject var4_25 = module0015.$g533$.currentBinding(var6);
                        try {
                            module0015.$g533$.bind((SubLObject)module0779.T, var6);
                            SubLObject var28 = (SubLObject)module0779.$ic44$;
                            if (module0779.NIL == module0778.f50162(var9) && module0778.f50163(var9) != module0779.$ic45$) {
                                if (module0779.NIL == module0778.f50165(var9)) {
                                    var28 = (SubLObject)module0779.$ic46$;
                                }
                                if (module0778.f50163(var9) == module0779.$ic40$) {
                                    var28 = (SubLObject)module0779.$ic47$;
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                                    final SubLObject var4_26 = module0015.$g533$.currentBinding(var6);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0779.T, var6);
                                        module0642.f39074((SubLObject)module0779.$ic48$, (SubLObject)module0779.$ic49$, (SubLObject)module0779.UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_26, var6);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                            }
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                            final SubLObject var4_27 = module0015.$g533$.currentBinding(var6);
                            try {
                                module0015.$g533$.bind((SubLObject)module0779.T, var6);
                                module0642.f39074(var28, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_27, var6);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            if (module0778.f50163(var9) == module0779.$ic45$) {
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                                final SubLObject var4_28 = module0015.$g533$.currentBinding(var6);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0779.T, var6);
                                    module0642.f39032((SubLObject)module0779.$ic21$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_28, var6);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                if (module0779.NIL != module0777.f50121(var11) && module0779.NIL != module0780.f50266((SubLObject)module0779.UNPROVIDED)) {
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                                    final SubLObject var4_29 = module0015.$g533$.currentBinding(var6);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0779.T, var6);
                                        module0642.f39074((SubLObject)module0779.$ic50$, (SubLObject)module0779.$ic51$, (SubLObject)module0779.UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_29, var6);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                if (module0779.NIL != module0778.f50167(var9)) {
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
                                    final SubLObject var4_30 = module0015.$g533$.currentBinding(var6);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0779.T, var6);
                                        module0642.f39074((SubLObject)module0779.$ic52$, (SubLObject)module0779.$ic53$, (SubLObject)module0779.UNPROVIDED);
                                        module0642.f39026((SubLObject)module0779.UNPROVIDED);
                                        PrintLow.format(module0015.$g131$.getDynamicValue(var6), (SubLObject)module0779.$ic54$);
                                        module0642.f39075((SubLObject)module0779.$ic55$, var18, (SubLObject)module0779.$ic21$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_30, var6);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                if (module0779.NIL != module0778.$g6279$.getDynamicValue(var6)) {
                                    module0642.f39026((SubLObject)module0779.UNPROVIDED);
                                    module0642.f39019((SubLObject)module0779.$ic56$);
                                    module0642.f39032((SubLObject)module0779.ONE_INTEGER);
                                    module0667.f40571((SubLObject)module0779.$ic57$, (SubLObject)module0779.NIL, (SubLObject)module0779.$ic58$, (SubLObject)module0779.$ic59$, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                                }
                            }
                            module0642.f39026((SubLObject)module0779.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_25, var6);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0779.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_24, var6);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    if (module0779.NIL != var12) {
                        module0642.f39051((SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                        if (module0779.NIL != module0778.$g6282$.getGlobalValue()) {
                            module0669.f40705(var12, (SubLObject)module0779.T);
                            module0642.f39026((SubLObject)module0779.UNPROVIDED);
                            module0669.f40721(var12);
                            module0642.f39026((SubLObject)module0779.UNPROVIDED);
                            f50242(var12);
                            module0642.f39026((SubLObject)module0779.UNPROVIDED);
                        }
                        module0742.f45924(var12, (SubLObject)module0779.UNPROVIDED);
                        module0642.f39026((SubLObject)module0779.UNPROVIDED);
                    }
                    module0015.f799(module0015.$g539$.getDynamicValue(var6));
                }
                finally {
                    module0015.$g539$.rebind(var22, var6);
                    module0015.$g541$.rebind(var21, var6);
                    module0015.$g533$.rebind(var4_20, var6);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)module0779.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_19, var6);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0779.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var20, var6);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0779.UNPROVIDED);
        module0778.f50219(var9, module0777.$g6247$.getGlobalValue());
        return (SubLObject)module0779.T;
    }
    
    public static SubLObject f50239(final SubLObject var8, final SubLObject var10, final SubLObject var16, final SubLObject var15) {
        final SubLObject var17 = module0777.f50124(module0778.f50156(var8));
        final SubLObject var18 = module0778.f50229(var10);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0779.$ic61$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39032((SubLObject)module0779.ONE_INTEGER);
        module0642.f39129((SubLObject)module0779.$ic62$, var18, var17);
        module0642.f39026((SubLObject)module0779.UNPROVIDED);
        return (SubLObject)module0779.NIL;
    }
    
    public static SubLObject f50240(final SubLObject var8, final SubLObject var10, final SubLObject var16, final SubLObject var15) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = module0777.f50124(module0778.f50157(var8));
        final SubLObject var19 = module0778.f50158(var8);
        if (module0779.NIL != module0777.f50121(var18) && module0779.NIL != module0038.f2653(var16)) {
            var18 = var16;
        }
        if (module0778.f50171(var8).equal(module0603.f36871(module0584.$g4441$.getDynamicValue(var17)))) {
            module0778.f50195(var8, module0603.f36871(module0584.$g4445$.getDynamicValue(var17)));
        }
        final SubLObject var20 = module0603.f36871(module0778.f50150(var8));
        final SubLObject var21 = (SubLObject)module0779.$ic19$;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0779.NIL != var21) {
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020(module0642.f39042(var21));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
        final SubLObject var22 = module0015.$g533$.currentBinding(var17);
        try {
            module0015.$g533$.bind((SubLObject)module0779.T, var17);
            module0642.f39019((SubLObject)module0779.$ic63$);
            module0656.f39837((SubLObject)module0779.$ic64$, var20, (SubLObject)module0779.$ic65$, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
            module0642.f39026((SubLObject)module0779.TWO_INTEGER);
        }
        finally {
            module0015.$g533$.rebind(var22, var17);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        SubLObject var23 = (SubLObject)((module0779.NIL != module0038.f2653(var18)) ? module0779.$ic18$ : module0779.$ic19$);
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0779.NIL != var23) {
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020(module0642.f39042(var23));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
        SubLObject var24 = module0015.$g533$.currentBinding(var17);
        try {
            module0015.$g533$.bind((SubLObject)module0779.T, var17);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)module0779.$ic66$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var24, var17);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39032((SubLObject)module0779.ONE_INTEGER);
        module0642.f39030((SubLObject)module0779.UNPROVIDED);
        module0642.f39075((SubLObject)module0779.$ic67$, var18, (SubLObject)module0779.$ic68$);
        module0642.f39032((SubLObject)module0779.ONE_INTEGER);
        module0644.f39184((SubLObject)module0779.$ic67$, (SubLObject)module0779.$ic69$);
        module0642.f39026((SubLObject)module0779.UNPROVIDED);
        module0642.f39068((SubLObject)module0779.$ic70$, module0778.f50159(var8), module0778.f50159(var8), (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
        module0642.f39019((SubLObject)module0779.$ic71$);
        module0642.f39026((SubLObject)module0779.UNPROVIDED);
        var23 = (SubLObject)((module0779.NIL != module0038.f2653(var19)) ? module0779.$ic18$ : module0779.$ic19$);
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0779.NIL != var23) {
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020(module0642.f39042(var23));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
        var24 = module0015.$g533$.currentBinding(var17);
        try {
            module0015.$g533$.bind((SubLObject)module0779.T, var17);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)module0779.$ic72$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var24, var17);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39032((SubLObject)module0779.ONE_INTEGER);
        module0642.f39075((SubLObject)module0779.$ic73$, var19, (SubLObject)module0779.$ic68$);
        module0642.f39032((SubLObject)module0779.ONE_INTEGER);
        module0644.f39184((SubLObject)module0779.$ic73$, (SubLObject)module0779.$ic74$);
        module0642.f39026((SubLObject)module0779.UNPROVIDED);
        if (module0779.NIL != module0778.$g6279$.getDynamicValue(var17)) {
            f50243(var8);
        }
        return (SubLObject)module0779.NIL;
    }
    
    public static SubLObject f50243(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0777.f50124(module0778.f50168(var8));
        final SubLObject var11 = module0777.f50124(module0778.f50169(var8));
        module0642.f39019((SubLObject)module0779.$ic75$);
        module0642.f39026((SubLObject)module0779.UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0779.$ic37$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39129((SubLObject)module0779.$ic76$, module0778.$g6280$.getGlobalValue(), var10);
        if (module0779.NIL != module0655.$g5102$.getDynamicValue(var9)) {
            module0642.f39020(module0015.$g336$.getGlobalValue());
            module0642.f39020(module0015.$g338$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020((SubLObject)module0779.$ic77$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020(module0015.$g340$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020((SubLObject)module0779.$ic78$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020(module0015.$g339$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020((SubLObject)module0779.FIVE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020(module0015.$g350$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020((SubLObject)module0779.$ic79$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
            final SubLObject var12 = module0015.$g533$.currentBinding(var9);
            try {
                module0015.$g533$.bind((SubLObject)module0779.T, var9);
                module0642.f39019(var11);
            }
            finally {
                module0015.$g533$.rebind(var12, var9);
            }
            module0642.f39020(module0015.$g337$.getGlobalValue());
        }
        else {
            module0642.f39020(module0015.$g336$.getGlobalValue());
            module0642.f39020(module0015.$g338$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020((SubLObject)module0779.$ic77$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020(module0015.$g340$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020((SubLObject)module0779.$ic78$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020(module0015.$g339$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020((SubLObject)module0779.FIVE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
            final SubLObject var12 = module0015.$g533$.currentBinding(var9);
            try {
                module0015.$g533$.bind((SubLObject)module0779.T, var9);
                module0642.f39019(var11);
            }
            finally {
                module0015.$g533$.rebind(var12, var9);
            }
            module0642.f39020(module0015.$g337$.getGlobalValue());
        }
        module0642.f39026((SubLObject)module0779.UNPROVIDED);
        return (SubLObject)module0779.NIL;
    }
    
    public static SubLObject f50241(final SubLObject var8, SubLObject var10, SubLObject var16, SubLObject var15) {
        if (var10 == module0779.UNPROVIDED) {
            var10 = (SubLObject)module0779.NIL;
        }
        if (var16 == module0779.UNPROVIDED) {
            var16 = (SubLObject)module0779.NIL;
        }
        if (var15 == module0779.UNPROVIDED) {
            var15 = (SubLObject)module0779.NIL;
        }
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = (SubLObject)((module0779.NIL != module0038.f2653(var16)) ? module0777.f50108(var16, (SubLObject)module0779.NIL) : module0779.NIL);
        final SubLObject var19 = Sequences.length(var18);
        final SubLObject var20 = module0777.f50124(module0778.f50160(var8));
        final SubLObject var21 = module0778.f50210(var20, var19);
        final SubLObject var22 = (SubLObject)(var21.numG((SubLObject)module0779.ZERO_INTEGER) ? Sequences.elt(var18, Numbers.subtract(var21, (SubLObject)module0779.ONE_INTEGER)) : module0779.$ic9$);
        final SubLObject var23 = module0777.f50124(module0778.f50161(var8));
        final SubLObject var24 = module0603.f36871(var23);
        final SubLObject var25 = module0778.f50172(var8);
        if (var19.numE((SubLObject)module0779.ZERO_INTEGER)) {
            return (SubLObject)module0779.NIL;
        }
        if (var19.numG((SubLObject)module0779.ONE_INTEGER)) {
            final SubLObject var26 = Numbers.numE(var21, (SubLObject)module0779.ONE_INTEGER);
            final SubLObject var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0779.NIL == var26 && var21.numE(var19));
            final SubLObject var28 = (SubLObject)SubLObjectFactory.makeBoolean(module0779.NIL != module0038.f2653(var20) && module0779.NIL == var26 && module0779.NIL == var27);
            final SubLObject var29 = (SubLObject)((module0779.NIL != module0038.f2653(var20)) ? module0779.$ic18$ : module0779.$ic19$);
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (module0779.NIL != var29) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
                module0642.f39020(module0642.f39042(var29));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
            final SubLObject var30 = module0015.$g533$.currentBinding(var17);
            try {
                module0015.$g533$.bind((SubLObject)module0779.T, var17);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)module0779.$ic80$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39032((SubLObject)module0779.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var30, var17);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
            module0642.f39072((SubLObject)module0779.$ic81$, (SubLObject)module0779.$ic82$, var26, (SubLObject)module0779.UNPROVIDED);
            module0642.f39032((SubLObject)module0779.UNPROVIDED);
            module0642.f39019((SubLObject)module0779.$ic82$);
            module0642.f39032((SubLObject)module0779.UNPROVIDED);
            module0642.f39072((SubLObject)module0779.$ic81$, (SubLObject)module0779.$ic83$, var27, (SubLObject)module0779.UNPROVIDED);
            module0642.f39032((SubLObject)module0779.UNPROVIDED);
            module0642.f39019((SubLObject)module0779.$ic83$);
            module0642.f39032((SubLObject)module0779.UNPROVIDED);
            if (var19.numG((SubLObject)module0779.TWO_INTEGER)) {
                module0642.f39072((SubLObject)module0779.$ic81$, (SubLObject)module0779.$ic84$, var28, (SubLObject)module0779.UNPROVIDED);
                module0642.f39032((SubLObject)module0779.UNPROVIDED);
                PrintLow.format(module0015.$g131$.getDynamicValue(var17), (SubLObject)module0779.$ic85$, (SubLObject)module0779.ONE_INTEGER, var19);
                module0642.f39032((SubLObject)module0779.UNPROVIDED);
                module0642.f39075((SubLObject)module0779.$ic86$, (SubLObject)((module0779.NIL != var28) ? var20 : module0779.NIL), (SubLObject)module0779.TWO_INTEGER);
            }
            module0642.f39026((SubLObject)module0779.UNPROVIDED);
        }
        final SubLObject var31 = (SubLObject)((module0779.NIL != module0038.f2653(var23)) ? module0779.$ic18$ : module0779.$ic19$);
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0779.NIL != var31) {
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
            module0642.f39020(module0642.f39042(var31));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0779.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0779.UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var17);
        try {
            module0015.$g533$.bind((SubLObject)module0779.T, var17);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)module0779.$ic87$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39032((SubLObject)module0779.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var32, var17);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        final SubLObject var33 = module0038.f2653(var22);
        final SubLObject var34 = (SubLObject)((module0779.NIL != var33) ? module0731.f44745(var22, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED) : module0779.NIL);
        SubLObject var36;
        final SubLObject var35 = var36 = ((module0779.NIL != var33) ? var34 : module0778.$g6270$.getGlobalValue());
        SubLObject var37 = (SubLObject)module0779.NIL;
        var37 = var36.first();
        while (module0779.NIL != var36) {
            if (module0779.NIL == var33 || module0779.NIL != conses_high.member(var37, var34, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED)) {
                final SubLObject var38 = module0777.f50123(var37);
                final SubLObject var39 = Equality.equal(var38, var23);
                module0642.f39072((SubLObject)module0779.$ic88$, var38, var39, (SubLObject)module0779.UNPROVIDED);
                module0642.f39032((SubLObject)module0779.UNPROVIDED);
                module0642.f39019(var38);
            }
            var36 = var36.rest();
            var37 = var36.first();
        }
        final SubLObject var40 = conses_high.member(var24, var35, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
        final SubLObject var41 = (SubLObject)SubLObjectFactory.makeBoolean(module0779.NIL != var24 && module0779.NIL == var40);
        module0642.f39072((SubLObject)module0779.$ic88$, (SubLObject)module0779.$ic84$, var41, (SubLObject)module0779.UNPROVIDED);
        module0642.f39032((SubLObject)module0779.UNPROVIDED);
        module0642.f39019((SubLObject)module0779.$ic84$);
        module0642.f39032((SubLObject)module0779.UNPROVIDED);
        module0642.f39129((SubLObject)module0779.$ic89$, module0778.$g6271$.getGlobalValue(), var23);
        if (module0779.NIL != var24) {
            final SubLObject var42 = conses_high.member(var24, var34, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
            if (module0779.NIL == var42) {
                module0642.f39068((SubLObject)module0779.$ic90$, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                module0642.f39019((SubLObject)module0779.$ic91$);
                module0642.f39026((SubLObject)module0779.UNPROVIDED);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0779.$ic92$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0642.f39129((SubLObject)module0779.$ic93$, module0778.$g6274$.getGlobalValue(), module0603.f36861(var25));
            }
        }
        module0642.f39026((SubLObject)module0779.UNPROVIDED);
        return (SubLObject)module0779.NIL;
    }
    
    public static SubLObject f50244(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0642.f39104((SubLObject)module0779.$ic8$, var5);
        final SubLObject var8 = module0778.f50207(var7);
        final SubLObject var9 = module0778.f50204(var8);
        final SubLObject var10 = module0642.f39104((SubLObject)module0779.$ic16$, var5);
        final SubLObject var11 = module0642.f39104((SubLObject)module0779.$ic23$, var5);
        SubLObject var12 = module0603.f36871(var10);
        final SubLObject var13 = module0642.f39104((SubLObject)module0779.$ic38$, var5);
        final SubLObject var14 = module0603.f36871(var13);
        final SubLObject var15 = module0038.f2735(module0642.f39111((SubLObject)module0779.$ic26$, var5, (SubLObject)module0779.UNPROVIDED));
        final SubLObject var16 = module0642.f39112((SubLObject)module0779.$ic28$, var5, (SubLObject)module0779.UNPROVIDED);
        final SubLObject var17 = module0642.f39104((SubLObject)module0779.$ic31$, var5);
        final SubLObject var18 = module0642.f39104((SubLObject)module0779.$ic33$, var5);
        final SubLObject var19 = module0642.f39104((SubLObject)module0779.$ic35$, var5);
        final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(module0779.NIL != module0777.f50125(var12) && module0779.NIL == var19);
        final SubLObject var21 = module0642.f39104((SubLObject)module0779.$ic15$, var5);
        final SubLObject var22 = module0642.f39104((SubLObject)module0779.$ic51$, var5);
        final SubLObject var23 = module0642.f39104((SubLObject)module0779.$ic53$, var5);
        final SubLObject var24 = module0642.f39104((SubLObject)module0779.$ic55$, var5);
        final SubLObject var25 = module0642.f39104((SubLObject)module0779.$ic49$, var5);
        SubLObject var26 = (SubLObject)module0779.NIL;
        SubLObject var27 = (SubLObject)module0779.NIL;
        if (module0779.NIL != var21) {
            module0778.f50228((SubLObject)module0779.UNPROVIDED);
            return f50237((SubLObject)module0779.UNPROVIDED);
        }
        if (module0779.NIL != var22) {
            return f50245();
        }
        if (module0779.NIL != var23) {
            if (module0779.NIL != module0038.f2653(var24)) {
                module0543.f33628((SubLObject)ConsesLow.list(module0779.$ic95$, (SubLObject)ConsesLow.list(module0779.$ic96$, (SubLObject)ConsesLow.list(module0779.$ic97$, var12, var15)), var24), var14, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
            }
            module0084.f5762(module0779.$g6283$.getGlobalValue(), module0574.f35152(), var12);
            module0780.f50265(var8, module0778.f50167(var8));
            if (module0779.NIL == module0780.f50267((SubLObject)module0779.UNPROVIDED)) {
                f50238((SubLObject)module0779.TEN_INTEGER);
            }
            final SubLObject var28 = f50245();
            return (module0779.NIL != var28) ? var28 : f50237((SubLObject)module0779.UNPROVIDED);
        }
        module0778.f50186(var8, (SubLObject)module0779.NIL);
        module0778.f50174(var8, var10);
        module0778.f50175(var8, var15);
        module0778.f50176(var8, var13);
        module0778.f50177(var8, var16);
        if (module0779.NIL != var17) {
            module0778.f50177(var8, (SubLObject)module0779.$ic30$);
        }
        module0778.f50178(var8, var18);
        module0778.f50179(var8, var19);
        if (module0779.NIL != var11) {
            var12 = module0603.f36875(var10);
        }
        if (module0779.NIL != module0038.f2653(var10) && module0779.NIL == var12) {
            module0778.f50186(var8, (SubLObject)module0779.$ic98$);
        }
        else if (module0779.NIL != module0038.f2653(var13) && module0779.NIL == var14) {
            module0778.f50186(var8, (SubLObject)module0779.$ic99$);
        }
        else if (module0779.NIL != var18) {
            var27 = f50246(var8, var12, var15, var5);
        }
        else if (module0779.NIL != var20) {
            var27 = f50247(var8, var12, var15, var5);
        }
        else {
            var27 = f50248(var8, var12, var15, var5);
        }
        module0778.f50188(var8, (SubLObject)SubLObjectFactory.makeBoolean(module0779.NIL != module0777.f50047((SubLObject)ConsesLow.list(var10, var13, var15)) && module0779.NIL != var27));
        final SubLObject var29 = module0778.f50202(var8);
        final SubLObject var30 = module0778.f50202(var9);
        if (!var29.equalp(var30)) {
            if (module0777.$g6251$.getDynamicValue(var6).numGE(Numbers.max(module0777.$g6251$.getDynamicValue(var6), module0777.$g6245$.getGlobalValue()))) {
                PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(var6), (SubLObject)module0779.$ic100$, conses_high.set_difference(var29, var30, Symbols.symbol_function((SubLObject)module0779.EQUALP), (SubLObject)module0779.UNPROVIDED));
                streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(var6));
            }
            var26 = (SubLObject)module0779.T;
        }
        SubLObject var31 = (SubLObject)module0779.NIL;
        final SubLObject var32 = module0778.f50163(var8);
        if (var32.eql((SubLObject)module0779.$ic45$) || var32.eql((SubLObject)module0779.$ic101$)) {
            if (module0779.NIL != module0778.f50164(var8) && module0779.NIL == module0778.f50162(var8)) {
                module0778.f50187(var8, (SubLObject)module0779.$ic40$);
            }
            else {
                module0778.f50187(var8, (SubLObject)module0779.$ic101$);
            }
        }
        else if (var32.eql((SubLObject)module0779.$ic40$)) {
            if (module0779.NIL != var26) {
                module0778.f50187(var8, (SubLObject)module0779.$ic101$);
            }
            else if (module0779.NIL != module0778.f50218(var8)) {
                module0778.f50228(var8);
                module0778.f50228((SubLObject)module0779.UNPROVIDED);
                var31 = (SubLObject)module0779.T;
            }
        }
        if (module0779.NIL == module0778.f50162(var8) && module0779.NIL != module0778.f50165(var8)) {
            module0778.f50186(var8, module0777.f50071(module0778.f50165(var8), var14));
        }
        if (module0779.NIL != module0778.f50162(var8)) {
            module0778.f50187(var8, (SubLObject)module0779.$ic101$);
        }
        module0778.f50219(var8, (SubLObject)module0779.UNPROVIDED);
        if (module0779.NIL != var31) {
            f50249(var12, var15, var14, var25);
        }
        else {
            f50237(var5);
        }
        return (SubLObject)module0779.T;
    }
    
    public static SubLObject f50249(final SubLObject var11, final SubLObject var16, final SubLObject var15, final SubLObject var76) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        if (module0779.NIL != constant_handles_oc.f8449(var11)) {
            module0677.f41359(var11);
        }
        else if (module0779.NIL != module0167.f10813(var11)) {
            module0677.f41360(var11);
        }
        SubLObject var78 = (SubLObject)module0779.NIL;
        SubLObject var79 = (SubLObject)module0779.NIL;
        final SubLObject var80 = module0584.$g4396$.currentBinding(var77);
        try {
            module0584.$g4396$.bind(var15, var77);
            var78 = module0004.f104(var11, module0731.f44783(var16, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED), (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
        }
        finally {
            module0584.$g4396$.rebind(var80, var77);
        }
        var79 = ((module0779.NIL != var78) ? PrintLow.format((SubLObject)module0779.NIL, (SubLObject)module0779.$ic103$, var16) : PrintLow.format((SubLObject)module0779.NIL, (SubLObject)module0779.$ic104$, var16));
        if (module0779.NIL != var76) {
            module0780.f50263(var11, module0111.$g1405$.getDynamicValue(var77), var16, (SubLObject)module0779.UNPROVIDED);
        }
        else {
            f50250(var11);
            if (module0779.NIL == module0780.f50267((SubLObject)module0779.UNPROVIDED)) {
                f50238((SubLObject)module0779.UNPROVIDED);
            }
        }
        if (module0779.NIL != module0780.f50266((SubLObject)module0779.UNPROVIDED)) {
            f50245();
        }
        else {
            module0656.f39793(var79, (SubLObject)module0779.T);
        }
        return var78;
    }
    
    public static SubLObject f50246(final SubLObject var8, final SubLObject var11, final SubLObject var16, final SubLObject var5) {
        final SubLObject var17 = module0642.f39111((SubLObject)module0779.$ic62$, var5, module0778.f50156(var8));
        final SubLObject var18 = module0603.f36871(var17);
        final SubLObject var19 = module0777.f50047((SubLObject)ConsesLow.list(var11, var16, var18));
        module0778.f50180(var8, var17);
        if (module0779.NIL != var19) {
            module0778.f50223(var8);
        }
        return var19;
    }
    
    public static SubLObject f50247(final SubLObject var8, final SubLObject var11, final SubLObject var16, final SubLObject var5) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0642.f39111((SubLObject)module0779.$ic67$, var5, (SubLObject)module0779.UNPROVIDED);
        final SubLObject var19 = module0778.f50209(var18);
        final SubLObject var20 = module0642.f39111((SubLObject)module0779.$ic73$, var5, (SubLObject)module0779.UNPROVIDED);
        final SubLObject var21 = module0778.f50208(var20);
        final SubLObject var22 = (SubLObject)((module0779.NIL != var11) ? module0777.f50113(var11) : module0779.ZERO_INTEGER);
        final SubLObject var23 = module0642.f39104((SubLObject)module0779.$ic70$, var5);
        final SubLObject var24 = module0777.f50047((SubLObject)ConsesLow.list(var11, var16, var18, var20));
        module0778.f50186(var8, (SubLObject)module0779.NIL);
        if (module0779.NIL == var23) {
            if (module0779.NIL != module0038.f2653(var18) && module0779.NIL == Sequences.position((SubLObject)Characters.CHAR_tilde, var18, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED)) {
                module0778.f50186(var8, (SubLObject)module0779.$ic105$);
            }
            if (var22.numG((SubLObject)module0779.ZERO_INTEGER) && var19.numG(var22)) {
                module0778.f50186(var8, (SubLObject)module0779.$ic106$);
            }
            if (module0779.NIL != var21 && !var19.numE(Sequences.length(var21))) {
                module0778.f50186(var8, (SubLObject)module0779.$ic107$);
            }
            if (module0779.NIL != var21 && !var22.numGE(Sequences.length(var21))) {
                module0778.f50186(var8, (SubLObject)module0779.$ic108$);
            }
        }
        if (module0778.f50152(var8).equal(module0584.$g4441$.getDynamicValue(var17)) && module0778.f50163(var8) == module0779.$ic45$) {
            module0778.f50176(var8, module0584.$g4443$.getDynamicValue(var17));
        }
        if (module0779.NIL != module0038.f2653(var20) && !var20.equalp((SubLObject)module0779.$ic109$) && module0779.NIL == var21) {
            module0778.f50186(var8, (SubLObject)module0779.$ic110$);
        }
        if (module0779.NIL != module0778.$g6279$.getDynamicValue(var17)) {
            f50251(var8, var5);
        }
        module0778.f50181(var8, var18);
        module0778.f50182(var8, var20);
        module0778.f50183(var8, var23);
        if (module0779.NIL != var24 && module0779.NIL == module0778.f50162(var8)) {
            module0778.f50224(var8);
        }
        return var24;
    }
    
    public static SubLObject f50251(final SubLObject var8, final SubLObject var5) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0642.f39111((SubLObject)module0779.$ic76$, var5, module0584.$g4444$.getDynamicValue(var9));
        final SubLObject var11 = module0642.f39111((SubLObject)module0779.$ic77$, var5, (SubLObject)module0779.UNPROVIDED);
        module0778.f50219(var8, (SubLObject)module0779.UNPROVIDED);
        module0778.f50192(var8, var10);
        module0778.f50193(var8, var11);
        module0778.f50219(var8, (SubLObject)module0779.UNPROVIDED);
        if (module0779.NIL != module0038.f2653(var11)) {
            module0778.f50227(var8);
        }
        return (SubLObject)module0779.T;
    }
    
    public static SubLObject f50248(final SubLObject var8, final SubLObject var11, final SubLObject var16, final SubLObject var5) {
        final SubLObject var17 = (SubLObject)((module0779.NIL != module0038.f2653(var16)) ? module0777.f50108(var16, (SubLObject)module0779.NIL) : module0779.NIL);
        final SubLObject var18 = Sequences.length(var17);
        SubLObject var19 = module0642.f39111((SubLObject)module0779.$ic81$, var5, (SubLObject)module0779.UNPROVIDED);
        SubLObject var20 = module0642.f39111((SubLObject)module0779.$ic88$, var5, (SubLObject)module0779.UNPROVIDED);
        final SubLObject var21 = module0642.f39111((SubLObject)module0779.$ic89$, var5, (SubLObject)module0779.UNPROVIDED);
        final SubLObject var22 = module0642.f39104((SubLObject)module0779.$ic90$, var5);
        final SubLObject var23 = module0603.f36871(module0642.f39104((SubLObject)module0779.$ic93$, var5));
        SubLObject var24 = (SubLObject)module0779.NIL;
        if (var19.equal((SubLObject)module0779.$ic84$) || module0779.NIL != module0777.f50121(var19)) {
            var19 = module0642.f39111((SubLObject)module0779.$ic86$, var5, (SubLObject)module0779.UNPROVIDED);
        }
        if (var19.equal((SubLObject)module0779.$ic9$) && var18.numE((SubLObject)module0779.ONE_INTEGER)) {
            var19 = (SubLObject)module0779.$ic111$;
        }
        final SubLObject var25 = module0778.f50210(var19, var18);
        final SubLObject var26 = (SubLObject)(var25.numG((SubLObject)module0779.ZERO_INTEGER) ? Sequences.elt(var17, Numbers.subtract(var25, (SubLObject)module0779.ONE_INTEGER)) : module0779.$ic9$);
        if (var20.equal((SubLObject)module0779.$ic84$) || module0779.NIL != module0777.f50121(var20)) {
            var20 = var21;
        }
        if (var25.numG((SubLObject)module0779.MINUS_ONE_INTEGER)) {
            module0778.f50184(var8, var25);
        }
        module0778.f50185(var8, var20);
        if (module0779.NIL != var22 && module0779.NIL != module0038.f2653(var26)) {
            module0778.f50215(var26, module0603.f36871(var20), var23, (SubLObject)module0779.UNPROVIDED);
        }
        var24 = module0777.f50047((SubLObject)ConsesLow.list(var19, var20));
        if (module0779.NIL != var24) {
            module0778.f50225(var8);
        }
        return var24;
    }
    
    public static SubLObject f50245() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0779.NIL;
        final SubLObject var4 = module0778.$g6279$.currentBinding(var2);
        try {
            module0778.$g6279$.bind((SubLObject)module0779.NIL, var2);
            if (module0779.NIL == module0780.f50267((SubLObject)module0779.UNPROVIDED)) {
                f50238((SubLObject)module0779.UNPROVIDED);
            }
            var3 = module0780.f50270((SubLObject)module0779.UNPROVIDED);
        }
        finally {
            module0778.$g6279$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f50238(SubLObject var96) {
        if (var96 == module0779.UNPROVIDED) {
            var96 = (SubLObject)module0779.ONE_INTEGER;
        }
        final SubLThread var97 = SubLProcess.currentSubLThread();
        if (module0779.NIL == module0780.f50266(module0111.$g1405$.getDynamicValue(var97))) {
            SubLObject var99;
            final SubLObject var98 = var99 = f50252(var96);
            SubLObject var100 = (SubLObject)module0779.NIL;
            var100 = var99.first();
            while (module0779.NIL != var99) {
                module0780.f50263(var100.first(), module0111.$g1405$.getDynamicValue(var97), conses_high.second(var100), (SubLObject)module0779.UNPROVIDED);
                var99 = var99.rest();
                var100 = var99.first();
            }
        }
        return (SubLObject)module0779.NIL;
    }
    
    public static SubLObject f50252(final SubLObject var98) {
        final SubLThread var99 = SubLProcess.currentSubLThread();
        final SubLObject var100 = module0434.f30578((SubLObject)module0779.$ic112$, (SubLObject)ConsesLow.list(module0779.$ic113$, (SubLObject)module0779.$ic112$, module0538.f33465()), module0779.$ic114$, (SubLObject)module0779.UNPROVIDED);
        final SubLObject var102;
        final SubLObject var101 = var102 = module0034.f1854((SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
        final SubLObject var103 = module0034.$g879$.currentBinding(var99);
        try {
            module0034.$g879$.bind(var102, var99);
            SubLObject var104 = (SubLObject)module0779.NIL;
            if (module0779.NIL != var102 && module0779.NIL == module0034.f1842(var102)) {
                var104 = module0034.f1869(var102);
                final SubLObject var105 = Threads.current_process();
                if (module0779.NIL == var104) {
                    module0034.f1873(var102, var105);
                }
                else if (!var104.eql(var105)) {
                    Errors.error((SubLObject)module0779.$ic115$);
                }
            }
            try {
                return f50253(Sort.sort(var100, Symbols.symbol_function((SubLObject)module0779.$ic117$), (SubLObject)module0779.$ic118$), var98, (SubLObject)module0779.UNPROVIDED);
            }
            finally {
                final SubLObject var4_104 = Threads.$is_thread_performing_cleanupP$.currentBinding(var99);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0779.T, var99);
                    if (module0779.NIL != var102 && module0779.NIL == var104) {
                        module0034.f1873(var102, (SubLObject)module0779.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var4_104, var99);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var103, var99);
        }
    }
    
    public static SubLObject f50253(final SubLObject var99, final SubLObject var105, SubLObject var106) {
        if (var106 == module0779.UNPROVIDED) {
            var106 = (SubLObject)module0779.NIL;
        }
        module0732.f44982();
        SubLObject var107 = (SubLObject)module0779.NIL;
        SubLObject var108 = (SubLObject)module0779.NIL;
        if (module0779.NIL == var108) {
            SubLObject var109 = var99;
            SubLObject var110 = (SubLObject)module0779.NIL;
            var110 = var109.first();
            while (module0779.NIL == var108 && module0779.NIL != var109) {
                if (module0779.NIL != module0777.f50031(var110, (SubLObject)module0779.UNPROVIDED) && module0779.NIL == module0004.f104(var110, module0067.f4885(module0779.$g6283$.getGlobalValue(), module0574.f35152(), (SubLObject)module0779.NIL), (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED)) {
                    final SubLObject var111 = module0770.f49049(var110, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                    var107 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var110, var111), var107);
                    if (var105 != module0779.NIL && Sequences.length(var107).numGE(var105)) {
                        var108 = (SubLObject)module0779.T;
                    }
                }
                var109 = var109.rest();
                var110 = var109.first();
            }
        }
        return var107;
    }
    
    public static SubLObject f50254(final SubLObject var110, SubLObject var106) {
        if (var106 == module0779.UNPROVIDED) {
            var106 = (SubLObject)module0779.T;
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        final SubLObject var112 = module0259.f16848(var110, module0779.$ic119$, (SubLObject)module0779.UNPROVIDED);
        SubLObject var114;
        final SubLObject var113 = var114 = f50253(var112, (SubLObject)module0779.NIL, var106);
        SubLObject var115 = (SubLObject)module0779.NIL;
        var115 = var114.first();
        while (module0779.NIL != var114) {
            SubLObject var117;
            final SubLObject var116 = var117 = var115;
            SubLObject var118 = (SubLObject)module0779.NIL;
            SubLObject var119 = (SubLObject)module0779.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var117, var116, (SubLObject)module0779.$ic120$);
            var118 = var117.first();
            var117 = var117.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var117, var116, (SubLObject)module0779.$ic120$);
            var119 = var117.first();
            var117 = var117.rest();
            if (module0779.NIL == var117) {
                module0780.f50263(var118, module0111.$g1405$.getDynamicValue(var111), var119, (SubLObject)module0779.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0779.$ic120$);
            }
            var114 = var114.rest();
            var115 = var114.first();
        }
        return (SubLObject)module0779.NIL;
    }
    
    public static SubLObject f50250(final SubLObject var42) {
        if (module0779.NIL == module0077.f5302(module0779.$g6284$.getGlobalValue())) {
            module0779.$g6284$.setGlobalValue(module0077.f5313((SubLObject)module0779.EQUAL, (SubLObject)module0779.UNPROVIDED));
        }
        return module0077.f5326(var42, module0779.$g6284$.getGlobalValue());
    }
    
    public static SubLObject f50255(final SubLObject var42) {
        return module0077.f5320(var42, module0779.$g6284$.getGlobalValue());
    }
    
    public static SubLObject f50242(final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        final SubLObject var44 = module0219.f14509(var42, (SubLObject)module0779.ONE_INTEGER, module0779.$ic122$, module0172.f10922((SubLObject)module0779.$ic123$), (SubLObject)module0779.UNPROVIDED);
        if (module0779.NIL != var44) {
            SubLObject var45 = var44;
            SubLObject var46 = (SubLObject)module0779.NIL;
            var46 = var45.first();
            while (module0779.NIL != var45) {
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0779.$ic124$);
                module0656.f39804(module0178.f11287(var46), (SubLObject)module0779.UNPROVIDED, (SubLObject)module0779.UNPROVIDED);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0642.f39026((SubLObject)module0779.UNPROVIDED);
                module0656.f39916(var46, module0655.$g5095$.getDynamicValue(var43), (SubLObject)module0779.NIL);
                module0642.f39026((SubLObject)module0779.UNPROVIDED);
                var45 = var45.rest();
                var46 = var45.first();
            }
        }
        return (SubLObject)module0779.NIL;
    }
    
    public static SubLObject f50256() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50236", "S#54812", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50237", "INVOKE-LEXIFICATION-WIZARD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50239", "S#54813", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50240", "S#54814", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50243", "S#54815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50241", "S#54816", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50244", "HANDLE-LEXIFICATION-WIZARD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50249", "S#54817", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50246", "S#54818", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50247", "S#54819", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50251", "S#54820", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50248", "S#54821", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50245", "S#54822", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50238", "S#54823", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50252", "S#54824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50253", "S#54825", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50254", "S#54826", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50250", "S#54827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50255", "S#54828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0779", "f50242", "S#54829", 1, 0, false);
        return (SubLObject)module0779.NIL;
    }
    
    public static SubLObject f50257() {
        module0779.$g6283$ = SubLFiles.deflexical("S#54830", (module0779.NIL != Symbols.boundp((SubLObject)module0779.$ic94$)) ? module0779.$g6283$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0779.EQL), (SubLObject)module0779.UNPROVIDED));
        module0779.$g6284$ = SubLFiles.deflexical("S#54831", (module0779.NIL != Symbols.boundp((SubLObject)module0779.$ic121$)) ? module0779.$g6284$.getGlobalValue() : module0077.f5313((SubLObject)module0779.EQUAL, (SubLObject)module0779.UNPROVIDED));
        return (SubLObject)module0779.NIL;
    }
    
    public static SubLObject f50258() {
        module0656.f39840((SubLObject)module0779.$ic3$, (SubLObject)module0779.$ic4$, (SubLObject)module0779.ONE_INTEGER);
        Hashtables.sethash((SubLObject)module0779.$ic5$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0779.$ic6$, (SubLObject)module0779.NIL));
        module0015.f873((SubLObject)module0779.$ic60$);
        module0003.f57((SubLObject)module0779.$ic94$);
        module0015.f873((SubLObject)module0779.$ic102$);
        module0003.f57((SubLObject)module0779.$ic121$);
        return (SubLObject)module0779.NIL;
    }
    
    public void declareFunctions() {
        f50256();
    }
    
    public void initializeVariables() {
        f50257();
    }
    
    public void runTopLevelForms() {
        f50258();
    }
    
    static {
        me = (SubLFile)new module0779();
        module0779.$g6283$ = null;
        module0779.$g6284$ = null;
        $ic0$ = SubLObjectFactory.makeString("lexification-wizard");
        $ic1$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic2$ = SubLObjectFactory.makeString("invoke-lexification-wizard");
        $ic3$ = SubLObjectFactory.makeKeyword("LEXIFICATION-WIZARD");
        $ic4$ = SubLObjectFactory.makeSymbol("S#54812", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("LEXWIZ");
        $ic6$ = SubLObjectFactory.makeString("lexwiz.html");
        $ic7$ = SubLObjectFactory.makeString("the Lexification Assistant");
        $ic8$ = SubLObjectFactory.makeString(":id");
        $ic9$ = SubLObjectFactory.makeString("");
        $ic10$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic11$ = SubLObjectFactory.makeString("Cycorp Lexification Assistant");
        $ic12$ = SubLObjectFactory.makeString("handle-lexification-wizard");
        $ic13$ = SubLObjectFactory.makeString(" Specify the parameters needed for lexification");
        $ic14$ = SubLObjectFactory.makeString("Reset All");
        $ic15$ = SubLObjectFactory.makeString(":reset");
        $ic16$ = SubLObjectFactory.makeString(":cyc-term");
        $ic17$ = SubLObjectFactory.makeString("Complete");
        $ic18$ = SubLObjectFactory.makeKeyword("BLACK");
        $ic19$ = SubLObjectFactory.makeKeyword("BLUE");
        $ic20$ = SubLObjectFactory.makeString("Term :");
        $ic21$ = SubLObjectFactory.makeInteger(40);
        $ic22$ = SubLObjectFactory.makeString("Clear Term");
        $ic23$ = SubLObjectFactory.makeString(":create-term");
        $ic24$ = SubLObjectFactory.makeString("Create Term?");
        $ic25$ = SubLObjectFactory.makeString("Phrase :");
        $ic26$ = SubLObjectFactory.makeString(":phrase");
        $ic27$ = SubLObjectFactory.makeString("Clear Phrase");
        $ic28$ = SubLObjectFactory.makeString(":is-preferred");
        $ic29$ = SubLObjectFactory.makeString("Is preferred?");
        $ic30$ = SubLObjectFactory.makeKeyword("PRECISE");
        $ic31$ = SubLObjectFactory.makeString(":is-precise");
        $ic32$ = SubLObjectFactory.makeString("Is precise?");
        $ic33$ = SubLObjectFactory.makeString(":is-proper-name");
        $ic34$ = SubLObjectFactory.makeString("Is proper name?");
        $ic35$ = SubLObjectFactory.makeString(":nonrelational");
        $ic36$ = SubLObjectFactory.makeString("Nonrelational lexification?");
        $ic37$ = SubLObjectFactory.makeString("Mt :");
        $ic38$ = SubLObjectFactory.makeString(":lexification-mt");
        $ic39$ = SubLObjectFactory.makeString("Formula :");
        $ic40$ = SubLObjectFactory.makeKeyword("DONE");
        $ic41$ = SubLObjectFactory.makeString("Status : OK");
        $ic42$ = SubLObjectFactory.makeKeyword("RED");
        $ic43$ = SubLObjectFactory.makeString("Error :");
        $ic44$ = SubLObjectFactory.makeString("Next->");
        $ic45$ = SubLObjectFactory.makeKeyword("FRESH");
        $ic46$ = SubLObjectFactory.makeString("Lexify");
        $ic47$ = SubLObjectFactory.makeString("Finish");
        $ic48$ = SubLObjectFactory.makeString("Finish and Relexify");
        $ic49$ = SubLObjectFactory.makeString(":relexify");
        $ic50$ = SubLObjectFactory.makeString("Get Next Lexification");
        $ic51$ = SubLObjectFactory.makeString(":next-action");
        $ic52$ = SubLObjectFactory.makeString("Skip Lexification");
        $ic53$ = SubLObjectFactory.makeString(":skip-action");
        $ic54$ = SubLObjectFactory.makeString("Reason (optional): ");
        $ic55$ = SubLObjectFactory.makeString(":comment");
        $ic56$ = SubLObjectFactory.makeString("Return to");
        $ic57$ = SubLObjectFactory.makeKeyword("CYC-NAVIGATOR");
        $ic58$ = SubLObjectFactory.makeKeyword("TOP");
        $ic59$ = SubLObjectFactory.makeString("Navigator");
        $ic60$ = SubLObjectFactory.makeSymbol("INVOKE-LEXIFICATION-WIZARD");
        $ic61$ = SubLObjectFactory.makeString("Proper name predicate :");
        $ic62$ = SubLObjectFactory.makeString(":lexification-predicate");
        $ic63$ = SubLObjectFactory.makeString("Note: The relation support is obsolete.  Please use the lexwiz: ");
        $ic64$ = SubLObjectFactory.makeKeyword("SME-LEXIFY-TERM");
        $ic65$ = SubLObjectFactory.makeString("[Invoke Dictionary Assistant]");
        $ic66$ = SubLObjectFactory.makeString("Generation template :");
        $ic67$ = SubLObjectFactory.makeString(":lexification-template");
        $ic68$ = SubLObjectFactory.makeInteger(60);
        $ic69$ = SubLObjectFactory.makeString("Clear Template");
        $ic70$ = SubLObjectFactory.makeString(":skip-arity-checks");
        $ic71$ = SubLObjectFactory.makeString(" Skip arity checks?");
        $ic72$ = SubLObjectFactory.makeString("Argument specification :");
        $ic73$ = SubLObjectFactory.makeString(":lexification-args");
        $ic74$ = SubLObjectFactory.makeString("Clear ArgSpec");
        $ic75$ = SubLObjectFactory.makeString("Parse Template Specification");
        $ic76$ = SubLObjectFactory.makeString(":parse-template-mt");
        $ic77$ = SubLObjectFactory.makeString(":parse-template");
        $ic78$ = SubLObjectFactory.makeInteger(80);
        $ic79$ = SubLObjectFactory.makeString("virtual");
        $ic80$ = SubLObjectFactory.makeString("Headword position :");
        $ic81$ = SubLObjectFactory.makeString(":headword-position");
        $ic82$ = SubLObjectFactory.makeString("First");
        $ic83$ = SubLObjectFactory.makeString("Last");
        $ic84$ = SubLObjectFactory.makeString("Other");
        $ic85$ = SubLObjectFactory.makeString("Other (~a-~a) ");
        $ic86$ = SubLObjectFactory.makeString(":other-position");
        $ic87$ = SubLObjectFactory.makeString("Headword part of speech :");
        $ic88$ = SubLObjectFactory.makeString(":headword-part-of-speech");
        $ic89$ = SubLObjectFactory.makeString(":choose-part-of-speech");
        $ic90$ = SubLObjectFactory.makeString(":add-syntactic-mapping");
        $ic91$ = SubLObjectFactory.makeString(" Add mapping?");
        $ic92$ = SubLObjectFactory.makeString("Mapping Mt: ");
        $ic93$ = SubLObjectFactory.makeString(":syntactic-mt");
        $ic94$ = SubLObjectFactory.makeSymbol("S#54830", "CYC");
        $ic95$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("cyclistNotes"));
        $ic96$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("needsHandLexification"));
        $ic97$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $ic98$ = SubLObjectFactory.makeString("Invalid Cyc term");
        $ic99$ = SubLObjectFactory.makeString("Invalid Cyc MT");
        $ic100$ = SubLObjectFactory.makeString("setting change: ~s~%");
        $ic101$ = SubLObjectFactory.makeKeyword("NEED-INPUT");
        $ic102$ = SubLObjectFactory.makeSymbol("HANDLE-LEXIFICATION-WIZARD");
        $ic103$ = SubLObjectFactory.makeString("Lexification successful: ~S");
        $ic104$ = SubLObjectFactory.makeString("Unable to confirm lexification: ~S");
        $ic105$ = SubLObjectFactory.makeString("Template positional arguments required (e.g., ~A)");
        $ic106$ = SubLObjectFactory.makeString("Too many template positional arguments (e.g., ~A)");
        $ic107$ = SubLObjectFactory.makeString("Mismatch in number of template positional arguments and those in argument specification");
        $ic108$ = SubLObjectFactory.makeString("Mismatch in relation arity and specified arguments");
        $ic109$ = SubLObjectFactory.makeString("NIL");
        $ic110$ = SubLObjectFactory.makeString("Invalid argument specification (check parentheses and keyword syntax)");
        $ic111$ = SubLObjectFactory.makeString("1");
        $ic112$ = SubLObjectFactory.makeSymbol("?TERM");
        $ic113$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose"));
        $ic114$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $ic115$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic116$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol(">");
        $ic118$ = SubLObjectFactory.makeSymbol("S#54832", "CYC");
        $ic119$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic120$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37358", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $ic121$ = SubLObjectFactory.makeSymbol("S#54831", "CYC");
        $ic122$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept"));
        $ic123$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ContextOfPCWFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CCF-SemanticDBOntology")));
        $ic124$ = SubLObjectFactory.makeString("Mt: ");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0779.class
	Total time: 633 ms
	
	Decompiled with Procyon 0.5.32.
*/