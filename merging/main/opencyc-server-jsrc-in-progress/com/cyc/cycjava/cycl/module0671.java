package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0671 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0671";
    public static final String myFingerPrint = "c96d603c015017aee9031254d3412bc487f28c08710027d0636c038c352c2db9";
    public static SubLSymbol $g5302$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLList $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLString $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLString $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLInteger $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLList $ic170$;
    private static final SubLString $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLString $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLString $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLString $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLString $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLString $ic184$;
    private static final SubLString $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    private static final SubLString $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLString $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLString $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLString $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLString $ic207$;
    private static final SubLString $ic208$;
    private static final SubLString $ic209$;
    private static final SubLString $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLString $ic213$;
    private static final SubLString $ic214$;
    private static final SubLString $ic215$;
    private static final SubLString $ic216$;
    private static final SubLString $ic217$;
    private static final SubLString $ic218$;
    private static final SubLString $ic219$;
    private static final SubLSymbol $ic220$;
    
    public static SubLObject f40971(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        return f40972((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40972(final SubLObject var2, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = $ic5$;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0015.$g538$.currentBinding(var6);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var6))) ? module0015.$g538$.getDynamicValue(var6) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var6);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var6), module0655.$g5142$.getDynamicValue(var6));
            final SubLObject var8 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var8) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var8);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var2) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var2);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var8_10 = module0015.$g535$.currentBinding(var6);
            try {
                module0015.$g535$.bind((SubLObject)T, var6);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var6)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var6)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_11 = module0015.$g533$.currentBinding(var6);
                try {
                    module0015.$g533$.bind((SubLObject)T, var6);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_12 = module0015.$g533$.currentBinding(var6);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var6);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_12, var6);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var2) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var2);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var9 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var6));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic17$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var9) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var9);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_13 = module0015.$g533$.currentBinding(var6);
                    final SubLObject var10 = module0015.$g541$.currentBinding(var6);
                    final SubLObject var11 = module0015.$g539$.currentBinding(var6);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var6);
                        module0015.$g541$.bind((SubLObject)T, var6);
                        module0015.$g539$.bind(module0015.f797(), var6);
                        module0642.f39069(var3, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic3$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                        module0642.f39073((SubLObject)$ic18$);
                        module0642.f39032((SubLObject)ONE_INTEGER);
                        module0642.f39074((SubLObject)$ic0$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)ONE_INTEGER);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0657.f39992(var5, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0657.f40017(var4, (SubLObject)$ic19$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39068((SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39021((SubLObject)$ic22$);
                        module0015.f799(module0015.$g539$.getDynamicValue(var6));
                    }
                    finally {
                        module0015.$g539$.rebind(var11, var6);
                        module0015.$g541$.rebind(var10, var6);
                        module0015.$g533$.rebind(var8_13, var6);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var8_11, var6);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var8_10, var6);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var7, var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40973(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL == var17) {
            var17 = (SubLObject)$ic0$;
        }
        final SubLObject var19 = module0656.f39832((SubLObject)$ic23$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic24$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var19) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var19);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0015.$g533$.currentBinding(var18);
        try {
            module0015.$g533$.bind((SubLObject)T, var18);
            module0642.f39019(var17);
        }
        finally {
            module0015.$g533$.rebind(var20, var18);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40974(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = f40975(var1);
        final SubLObject var4 = var2.secondMultipleValue();
        final SubLObject var5 = var2.thirdMultipleValue();
        final SubLObject var6 = var2.fourthMultipleValue();
        var2.resetMultipleValues();
        if (NIL != var3) {
            return (SubLObject)NIL;
        }
        var2.resetMultipleValues();
        final SubLObject var7 = module0288.f19353(var5, var4, var6);
        final SubLObject var8 = var2.secondMultipleValue();
        final SubLObject var9 = var2.thirdMultipleValue();
        var2.resetMultipleValues();
        if (NIL != var9) {
            return module0656.f39789((SubLObject)$ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == var7) {
            return module0656.f39789((SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0035.f1997(var7) && NIL != var8) {
            return f40976(var7.first());
        }
        final SubLObject var10 = (SubLObject)$ic0$;
        final SubLObject var11 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var12 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var12) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var12);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var10) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var10);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var8_24 = module0015.$g535$.currentBinding(var2);
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
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_25 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_26 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_26, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var10) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var10);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39021((SubLObject)$ic31$);
                    SubLObject var13 = var7;
                    SubLObject var14 = (SubLObject)NIL;
                    var14 = var13.first();
                    while (NIL != var13) {
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0656.f39916(var14, (SubLObject)T, (SubLObject)T);
                        var13 = var13.rest();
                        var14 = var13.first();
                    }
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var8_25, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var8_24, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var11, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40975(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = module0657.f40003(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var4 = var2.secondMultipleValue();
        final SubLObject var5 = var2.thirdMultipleValue();
        var2.resetMultipleValues();
        if (NIL != var4) {
            module0657.f40013(var4, var5);
            return Values.values(var4, (SubLObject)NIL, (SubLObject)NIL);
        }
        var2.resetMultipleValues();
        final SubLObject var6 = module0657.f40022(var1, (SubLObject)$ic33$);
        final SubLObject var7 = var2.secondMultipleValue();
        final SubLObject var8 = var2.thirdMultipleValue();
        var2.resetMultipleValues();
        if (NIL != var7) {
            module0657.f40031(var7, var8, (SubLObject)UNPROVIDED);
            return Values.values(var7, (SubLObject)NIL, (SubLObject)NIL);
        }
        final SubLObject var9 = module0642.f39104((SubLObject)$ic20$, var1);
        return Values.values((SubLObject)NIL, var3, var6, var9);
    }
    
    public static SubLObject f40977(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic34$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic34$);
            return (SubLObject)NIL;
        }
        final SubLObject var4 = module0656.f39970(var2);
        if (NIL == assertion_handles_oc.f11035(var4)) {
            return module0656.f39789((SubLObject)$ic35$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var5 = module0178.f11287(var4);
        final SubLObject var6 = module0543.f33671(var4);
        return f40972((SubLObject)$ic36$, (SubLObject)$ic1$, var6, var5);
    }
    
    public static SubLObject f40978(final SubLObject var28, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var28) : var28;
        if (NIL == var17) {
            var17 = (SubLObject)$ic39$;
        }
        final SubLObject var30 = assertion_handles_oc.f11025(var28);
        final SubLObject var31 = module0656.f39832((SubLObject)$ic40$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic41$, var30);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            module0642.f39019(var17);
        }
        finally {
            module0015.$g533$.rebind(var32, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var28;
    }
    
    public static SubLObject f40979(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic34$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (NIL == var3) {
            final SubLObject var4 = module0656.f39970(var2);
            if (NIL == assertion_handles_oc.f11035(var4)) {
                return module0656.f39789((SubLObject)$ic35$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            f40976(var4);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic34$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40980(final SubLObject var1) {
        return f40979(var1);
    }
    
    public static SubLObject f40976(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        module0677.f41336(var28);
        final SubLObject var30 = assertion_handles_oc.f11025(var28);
        final SubLObject var31 = (SubLObject)NIL;
        final SubLObject var33;
        final SubLObject var32 = var33 = Sequences.cconcatenate(module0006.f203((SubLObject)((NIL != var31) ? $ic46$ : $ic47$)), new SubLObject[] { $ic48$, module0006.f203(var30) });
        final SubLObject var34 = module0015.$g538$.currentBinding(var29);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var29))) ? module0015.$g538$.getDynamicValue(var29) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var29);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var29), module0655.$g5142$.getDynamicValue(var29));
            final SubLObject var35 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var35) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var35);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var33) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var33);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var8_41 = module0015.$g535$.currentBinding(var29);
            try {
                module0015.$g535$.bind((SubLObject)T, var29);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var29)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var29)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_42 = module0015.$g533$.currentBinding(var29);
                try {
                    module0015.$g533$.bind((SubLObject)T, var29);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_43 = module0015.$g533$.currentBinding(var29);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var29);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_43, var29);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var33) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var33);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0644.f39197();
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var29));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_44 = module0015.$g533$.currentBinding(var29);
                    final SubLObject var36 = module0015.$g541$.currentBinding(var29);
                    final SubLObject var37 = module0015.$g539$.currentBinding(var29);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var29);
                        module0015.$g541$.bind((SubLObject)T, var29);
                        module0015.$g539$.bind(module0015.f797(), var29);
                        module0674.f41165(var28);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        f40981(var28);
                        f40982(var28);
                        if (NIL != module0211.f13700(var28)) {
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g207$.getGlobalValue());
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic49$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39020(module0015.$g208$.getGlobalValue());
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0669.f40734(var28);
                            if (module0217.f14318(var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                f40983(var28);
                            }
                            if (module0217.f14327(var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                f40984(var28);
                            }
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var29));
                    }
                    finally {
                        module0015.$g539$.rebind(var37, var29);
                        module0015.$g541$.rebind(var36, var29);
                        module0015.$g533$.rebind(var8_44, var29);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var8_42, var29);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var8_41, var29);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var34, var29);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40981(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if ($ic50$ == module0178.f11292(var28)) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic51$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0656.f39795((SubLObject)$ic50$);
        }
        else {
            final SubLObject var30 = module0178.f11293(var28);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic52$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0656.f39796(var30);
        }
        final SubLObject var31 = module0178.f11291(var28);
        module0642.f39032((SubLObject)TWO_INTEGER);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic53$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0656.f39797(var31);
        final SubLObject var32 = module0178.f11299(var28);
        module0642.f39032((SubLObject)TWO_INTEGER);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0656.f39837((SubLObject)$ic54$, var28, (SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39019(Sequences.length(var32));
        final SubLObject var33 = module0178.f11301(var28);
        module0642.f39032((SubLObject)TWO_INTEGER);
        if (NIL != var33) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0656.f39837((SubLObject)$ic56$, var28, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic58$, Sequences.length(var33), Sequences.length(module0211.f13634(var28)));
        }
        else {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic59$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        if (NIL != module0178.f11375(var28)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            f40985(var28);
        }
        if (NIL != module0178.f11290(var28)) {
            module0642.f39026((SubLObject)TWO_INTEGER);
            f40986(var28);
        }
        else {
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        f40987(var28);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40986(final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var51 = module0015.$g533$.currentBinding(var50);
        try {
            module0015.$g533$.bind((SubLObject)T, var50);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var8_50 = module0015.$g533$.currentBinding(var50);
            try {
                module0015.$g533$.bind((SubLObject)T, var50);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_51 = module0015.$g533$.currentBinding(var50);
                try {
                    module0015.$g533$.bind((SubLObject)T, var50);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic60$, (SubLObject)$ic61$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var8_51, var50);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_52 = module0015.$g533$.currentBinding(var50);
                try {
                    module0015.$g533$.bind((SubLObject)T, var50);
                    module0642.f39027((SubLObject)$ic62$, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var8_52, var50);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_53 = module0015.$g533$.currentBinding(var50);
                try {
                    module0015.$g533$.bind((SubLObject)T, var50);
                    module0683.f41884(var49, (SubLObject)$ic63$);
                    if (NIL != module0655.$g5115$.getDynamicValue(var50) && module0414.f28895(var49).isPositive()) {
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0656.f39837((SubLObject)$ic64$, var49, (SubLObject)$ic65$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var8_53, var50);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var8_50, var50);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            if (NIL != module0178.f11314(var49) && NIL != module0413.$g3371$.getDynamicValue(var50)) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_54 = module0015.$g533$.currentBinding(var50);
                try {
                    module0015.$g533$.bind((SubLObject)T, var50);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_55 = module0015.$g533$.currentBinding(var50);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var50);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0656.f39837((SubLObject)$ic66$, var49, (SubLObject)$ic67$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var8_55, var50);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_56 = module0015.$g533$.currentBinding(var50);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var50);
                        module0642.f39027((SubLObject)$ic62$, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_56, var50);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_57 = module0015.$g533$.currentBinding(var50);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var50);
                        module0683.f41922(var49);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_57, var50);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var8_54, var50);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var51, var50);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        final SubLObject var52 = module0211.f13711(var49);
        final SubLObject var53 = module0211.f13716(var49);
        if (NIL != var52 || NIL != var53) {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g353$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g354$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var54 = module0015.$g533$.currentBinding(var50);
            try {
                module0015.$g533$.bind((SubLObject)T, var50);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_58 = module0015.$g533$.currentBinding(var50);
                try {
                    module0015.$g533$.bind((SubLObject)T, var50);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_59 = module0015.$g533$.currentBinding(var50);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var50);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic68$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var8_59, var50);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_60 = module0015.$g533$.currentBinding(var50);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var50);
                        module0642.f39027((SubLObject)$ic62$, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_60, var50);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_61 = module0015.$g533$.currentBinding(var50);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var50);
                        if (NIL != var52) {
                            module0642.f39019((SubLObject)$ic69$);
                        }
                        if (NIL != var53) {
                            module0642.f39019((SubLObject)$ic70$);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var8_61, var50);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var8_58, var50);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var54, var50);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40982(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL != module0655.$g5115$.getDynamicValue(var29) && NIL == module0674.f41166(var28)) {
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39020(module0015.$g207$.getGlobalValue());
            module0642.f39019((SubLObject)$ic71$);
            module0642.f39020(module0015.$g208$.getGlobalValue());
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        if (NIL != module0655.$g5100$.getDynamicValue(var29)) {
            f40988(var28);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40989(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var28) : var28;
        var29.resetMultipleValues();
        final SubLObject var30 = module0656.f39925(var28, (SubLObject)UNPROVIDED);
        final SubLObject var31 = var29.secondMultipleValue();
        var29.resetMultipleValues();
        return (SubLObject)makeBoolean(NIL == module0004.f104(var28, module0538.f33373(var30, var31), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f40988(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)NIL;
        if (NIL != f40989(var28)) {
            var30 = (SubLObject)T;
            module0642.f39026((SubLObject)TWO_INTEGER);
            final SubLObject var31 = (SubLObject)$ic72$;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var31) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var31));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var32 = module0015.$g533$.currentBinding(var29);
            try {
                module0015.$g533$.bind((SubLObject)T, var29);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39019((SubLObject)$ic73$);
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var32, var29);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic74$);
        }
        final SubLObject var33 = module0289.f19396(var28);
        final SubLObject var34 = module0178.f11287(var28);
        if (NIL == module0274.f18060(var33, var34, (SubLObject)UNPROVIDED)) {
            var30 = (SubLObject)T;
            module0015.f741();
            module0642.f39020(module0015.$g203$.getGlobalValue());
            final SubLObject var35 = module0015.$g537$.currentBinding(var29);
            try {
                module0015.$g537$.bind((SubLObject)T, var29);
                final SubLObject var36 = (SubLObject)$ic72$;
                module0642.f39020(module0015.$g219$.getGlobalValue());
                if (NIL != var36) {
                    module0642.f39020(module0015.$g222$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(var36));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_69 = module0015.$g533$.currentBinding(var29);
                try {
                    module0015.$g533$.bind((SubLObject)T, var29);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39020(module0015.$g207$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic75$);
                    module0642.f39020(module0015.$g208$.getGlobalValue());
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var8_69, var29);
                }
                module0642.f39020(module0015.$g220$.getGlobalValue());
                module0274.f18187(var33, var34, module0015.$g131$.getDynamicValue(var29));
            }
            finally {
                module0015.$g537$.rebind(var35, var29);
            }
            module0642.f39020(module0015.$g204$.getGlobalValue());
        }
        return var30;
    }
    
    public static SubLObject f40987(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0538.f33367(var28, (SubLObject)UNPROVIDED);
        SubLObject var31 = module0642.$g4968$.currentBinding(var29);
        try {
            module0642.$g4968$.bind((SubLObject)NIL, var29);
            module0642.f39026((SubLObject)UNPROVIDED);
            if (NIL != module0655.$g5096$.getDynamicValue(var29)) {
                var29.resetMultipleValues();
                final SubLObject var32 = module0656.f39925(var28, var30);
                final SubLObject var33 = var29.secondMultipleValue();
                var29.resetMultipleValues();
                if (module0538.f33483(module0172.f10930(var32)).equal(module0538.f33483(module0172.f10930(var30))) && NIL != module0655.$g5097$.getDynamicValue(var29)) {
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic76$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                else {
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic77$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0669.f40763(var33, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    final SubLObject var8_71 = module0656.$g5161$.currentBinding(var29);
                    try {
                        module0656.$g5161$.bind((SubLObject)((NIL != module0178.f11290(var28)) ? module0202.f12919(var32) : NIL), var29);
                        module0656.f39877(var28, var32, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                    }
                    finally {
                        module0656.$g5161$.rebind(var8_71, var29);
                    }
                    module0642.f39026((SubLObject)TWO_INTEGER);
                }
            }
            if (NIL != module0655.$g5097$.getDynamicValue(var29)) {
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic78$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39026((SubLObject)UNPROVIDED);
                module0669.f40763(module0178.f11287(var28), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0656.f39804(var28, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                module0642.f39026((SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0642.$g4968$.rebind(var31, var29);
        }
        if (NIL != module0655.$g5101$.getDynamicValue(var29) || $ic79$ == module0018.$g707$.getDynamicValue(var29)) {
            var31 = module0018.$g707$.currentBinding(var29);
            final SubLObject var34 = module0579.$g4238$.currentBinding(var29);
            try {
                module0018.$g707$.bind((SubLObject)$ic79$, var29);
                module0579.$g4238$.bind((SubLObject)T, var29);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic80$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39026((SubLObject)UNPROVIDED);
                module0656.f39916(var28, (SubLObject)NIL, (SubLObject)NIL);
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            finally {
                module0579.$g4238$.rebind(var34, var29);
                module0018.$g707$.rebind(var31, var29);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40983(final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        final SubLObject var51 = module0580.$g4361$.currentBinding(var50);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var50);
            var50.resetMultipleValues();
            final SubLObject var8_72 = module0580.$g4362$.currentBinding(var50);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var50);
                final SubLObject var52 = var50.secondMultipleValue();
                var50.resetMultipleValues();
                try {
                    var50.resetMultipleValues();
                    final SubLObject var8_73 = module0580.$g4358$.currentBinding(var50);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var50);
                        final SubLObject var53 = var50.secondMultipleValue();
                        var50.resetMultipleValues();
                        final SubLObject var8_74 = module0580.$g4359$.currentBinding(var50);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var50);
                            final SubLObject var54 = module0580.$g4358$.getDynamicValue(var50);
                            final SubLObject var8_75 = module0034.$g879$.currentBinding(var50);
                            try {
                                module0034.$g879$.bind(var54, var50);
                                SubLObject var55 = (SubLObject)NIL;
                                if (NIL != var54 && NIL == module0034.f1842(var54)) {
                                    var55 = module0034.f1869(var54);
                                    final SubLObject var56 = Threads.current_process();
                                    if (NIL == var55) {
                                        module0034.f1873(var54, var56);
                                    }
                                    else if (!var55.eql(var56)) {
                                        Errors.error((SubLObject)$ic81$);
                                    }
                                }
                                try {
                                    final SubLObject var8_76 = module0579.$g4260$.currentBinding(var50);
                                    final SubLObject var57 = module0579.$g4259$.currentBinding(var50);
                                    final SubLObject var58 = module0656.$g5172$.currentBinding(var50);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var50);
                                        module0579.$g4259$.bind((SubLObject)$ic82$, var50);
                                        module0656.$g5172$.bind(module0661.f40305(), var50);
                                        module0642.f39020(module0015.$g234$.getGlobalValue());
                                        module0642.f39020(module0015.$g207$.getGlobalValue());
                                        module0642.f39019((SubLObject)$ic83$);
                                        module0642.f39020(module0015.$g208$.getGlobalValue());
                                        module0642.f39020(module0015.$g235$.getGlobalValue());
                                        module0642.f39026((SubLObject)UNPROVIDED);
                                        f40990(var49);
                                    }
                                    finally {
                                        module0656.$g5172$.rebind(var58, var50);
                                        module0579.$g4259$.rebind(var57, var50);
                                        module0579.$g4260$.rebind(var8_76, var50);
                                    }
                                }
                                finally {
                                    final SubLObject var8_77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var50);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var50);
                                        if (NIL != var54 && NIL == var55) {
                                            module0034.f1873(var54, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_77, var50);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var8_75, var50);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var8_74, var50);
                        }
                        if (var53 == $ic84$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var50))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var50));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var8_73, var50);
                    }
                }
                finally {
                    final SubLObject var8_78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var50);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var50);
                        if (NIL == var52) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var50));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var8_78, var50);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var8_72, var50);
            }
        }
        finally {
            module0580.$g4361$.rebind(var51, var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40990(final SubLObject var49) {
        SubLObject var51;
        final SubLObject var50 = var51 = module0217.f14322(var49, (SubLObject)UNPROVIDED);
        SubLObject var52 = (SubLObject)NIL;
        var52 = var51.first();
        while (NIL != var51) {
            f40991(var49, var52);
            var51 = var51.rest();
            var52 = var51.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40991(final SubLObject var49, final SubLObject var5) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        module0669.f40763(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var51 = (NIL != module0669.f40692(var49)) ? Symbols.symbol_function((SubLObject)$ic86$) : Symbols.symbol_function((SubLObject)$ic88$);
        final SubLObject var52 = module0655.$g5129$.currentBinding(var50);
        final SubLObject var53 = module0655.$g5130$.currentBinding(var50);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var50);
            module0655.$g5130$.bind((SubLObject)NIL, var50);
            module0219.f14488(var51, var49, (SubLObject)NIL, var5);
        }
        finally {
            module0655.$g5130$.rebind(var53, var50);
            module0655.$g5129$.rebind(var52, var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40984(final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        final SubLObject var51 = module0580.$g4361$.currentBinding(var50);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var50);
            var50.resetMultipleValues();
            final SubLObject var8_86 = module0580.$g4362$.currentBinding(var50);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var50);
                final SubLObject var52 = var50.secondMultipleValue();
                var50.resetMultipleValues();
                try {
                    var50.resetMultipleValues();
                    final SubLObject var8_87 = module0580.$g4358$.currentBinding(var50);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var50);
                        final SubLObject var53 = var50.secondMultipleValue();
                        var50.resetMultipleValues();
                        final SubLObject var8_88 = module0580.$g4359$.currentBinding(var50);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var50);
                            final SubLObject var54 = module0580.$g4358$.getDynamicValue(var50);
                            final SubLObject var8_89 = module0034.$g879$.currentBinding(var50);
                            try {
                                module0034.$g879$.bind(var54, var50);
                                SubLObject var55 = (SubLObject)NIL;
                                if (NIL != var54 && NIL == module0034.f1842(var54)) {
                                    var55 = module0034.f1869(var54);
                                    final SubLObject var56 = Threads.current_process();
                                    if (NIL == var55) {
                                        module0034.f1873(var54, var56);
                                    }
                                    else if (!var55.eql(var56)) {
                                        Errors.error((SubLObject)$ic81$);
                                    }
                                }
                                try {
                                    final SubLObject var8_90 = module0579.$g4260$.currentBinding(var50);
                                    final SubLObject var57 = module0579.$g4259$.currentBinding(var50);
                                    final SubLObject var58 = module0656.$g5172$.currentBinding(var50);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var50);
                                        module0579.$g4259$.bind((SubLObject)$ic82$, var50);
                                        module0656.$g5172$.bind(module0661.f40305(), var50);
                                        module0642.f39020(module0015.$g234$.getGlobalValue());
                                        module0642.f39020(module0015.$g207$.getGlobalValue());
                                        module0642.f39019((SubLObject)$ic89$);
                                        module0642.f39020(module0015.$g208$.getGlobalValue());
                                        module0642.f39020(module0015.$g235$.getGlobalValue());
                                        module0642.f39026((SubLObject)UNPROVIDED);
                                        f40992(var49);
                                    }
                                    finally {
                                        module0656.$g5172$.rebind(var58, var50);
                                        module0579.$g4259$.rebind(var57, var50);
                                        module0579.$g4260$.rebind(var8_90, var50);
                                    }
                                }
                                finally {
                                    final SubLObject var8_91 = Threads.$is_thread_performing_cleanupP$.currentBinding(var50);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var50);
                                        if (NIL != var54 && NIL == var55) {
                                            module0034.f1873(var54, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_91, var50);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var8_89, var50);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var8_88, var50);
                        }
                        if (var53 == $ic84$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var50))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var50));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var8_87, var50);
                    }
                }
                finally {
                    final SubLObject var8_92 = Threads.$is_thread_performing_cleanupP$.currentBinding(var50);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var50);
                        if (NIL == var52) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var50));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var8_92, var50);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var8_86, var50);
            }
        }
        finally {
            module0580.$g4361$.rebind(var51, var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40992(final SubLObject var49) {
        SubLObject var51;
        final SubLObject var50 = var51 = module0217.f14331(var49, (SubLObject)UNPROVIDED);
        SubLObject var52 = (SubLObject)NIL;
        var52 = var51.first();
        while (NIL != var51) {
            f40993(var49, var52);
            var51 = var51.rest();
            var52 = var51.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40993(final SubLObject var49, final SubLObject var5) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        module0669.f40763(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var51 = (NIL != module0669.f40692(var49)) ? Symbols.symbol_function((SubLObject)$ic86$) : Symbols.symbol_function((SubLObject)$ic88$);
        final SubLObject var52 = module0655.$g5129$.currentBinding(var50);
        final SubLObject var53 = module0655.$g5130$.currentBinding(var50);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var50);
            module0655.$g5130$.bind((SubLObject)NIL, var50);
            module0219.f14489(var51, var49, (SubLObject)NIL, var5);
        }
        finally {
            module0655.$g5130$.rebind(var53, var50);
            module0655.$g5129$.rebind(var52, var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40994(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0655.$g5101$.currentBinding(var2);
        try {
            module0655.$g5101$.bind((SubLObject)T, var2);
            f40979(var1);
        }
        finally {
            module0655.$g5101$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40995(final SubLObject var28, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL == var17) {
            var17 = (SubLObject)$ic91$;
        }
        final SubLObject var30 = module0656.f39832((SubLObject)$ic23$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic92$, assertion_handles_oc.f11025(var28));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            module0642.f39019(var17);
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var28;
    }
    
    public static SubLObject f40996(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0655.$g5096$.currentBinding(var2);
        try {
            module0655.$g5096$.bind((SubLObject)T, var2);
            f40979(var1);
        }
        finally {
            module0655.$g5096$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40997(final SubLObject var28, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL == var17) {
            var17 = (SubLObject)$ic96$;
        }
        final SubLObject var30 = module0656.f39832((SubLObject)$ic23$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic97$, assertion_handles_oc.f11025(var28));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            module0642.f39019(var17);
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var28;
    }
    
    public static SubLObject f40998(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0656.f39970(var1);
        if (NIL == assertion_handles_oc.f11035(var3)) {
            module0656.f39789((SubLObject)$ic102$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        final SubLObject var5;
        final SubLObject var4 = var5 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic103$, assertion_handles_oc.f11025(var3));
        final SubLObject var6 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var7 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var7) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var7);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var5) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var5);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var8_93 = module0015.$g535$.currentBinding(var2);
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
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_94 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_95 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_95, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var5) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var5);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_96 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0015.$g541$.bind((SubLObject)T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0656.f39870((SubLObject)$ic100$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g207$.getGlobalValue());
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic104$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39020(module0015.$g208$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f40999(var3, (SubLObject)NIL);
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var9, var2);
                        module0015.$g541$.rebind(var8, var2);
                        module0015.$g533$.rebind(var8_96, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var8_94, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var8_93, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var6, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41000(final SubLObject var28, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0656.f39832((SubLObject)$ic23$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic106$, assertion_handles_oc.f11025(var28));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            if (NIL != var17) {
                module0642.f39019(var17);
            }
            else {
                module0642.f39019(Sequences.length(module0178.f11299(var28)));
            }
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41001(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0656.f39970(var1);
        if (NIL == assertion_handles_oc.f11035(var3)) {
            module0656.f39789((SubLObject)$ic102$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        final SubLObject var4 = module0178.f11301(var3);
        final SubLObject var5 = Sequences.length(var4);
        final SubLObject var6 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), var5);
        final SubLObject var7 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic110$, assertion_handles_oc.f11025(var3));
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            module0084.f5762(var6, module0188.f11788(var9), var9);
            var8 = var8.rest();
            var9 = var8.first();
        }
        final SubLObject var10 = var7;
        final SubLObject var11 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var12 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var12) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var12);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var10) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var10);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var8_101 = module0015.$g535$.currentBinding(var2);
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
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_102 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_103 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_103, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var10) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var10);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_104 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var13 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var14 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0015.$g541$.bind((SubLObject)T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0656.f39870((SubLObject)$ic108$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g207$.getGlobalValue());
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic104$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39020(module0015.$g208$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0656.f39916(var3, module0655.$g5095$.getDynamicValue(var2), (SubLObject)T);
                        final SubLObject var15 = module0067.f4861(var6);
                        SubLObject var16 = (SubLObject)ZERO_INTEGER;
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        if (var15.numG((SubLObject)ONE_INTEGER)) {
                            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic111$, var15);
                        }
                        else {
                            PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic112$, var15);
                        }
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        SubLObject var17;
                        for (var17 = module0066.f4838(module0067.f4891(var6)); NIL == module0066.f4841(var17); var17 = module0066.f4840(var17)) {
                            var2.resetMultipleValues();
                            final SubLObject var18 = module0066.f4839(var17);
                            final SubLObject var97_109 = var2.secondMultipleValue();
                            var2.resetMultipleValues();
                            var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            if (NIL != assertion_handles_oc.f11035(var18)) {
                                module0656.f39916(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else {
                                f41002(var18, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)THREE_INTEGER);
                            module0642.f39019((SubLObject)$ic113$);
                            SubLObject var19 = var97_109;
                            SubLObject var20 = (SubLObject)NIL;
                            var20 = var19.first();
                            while (NIL != var19) {
                                module0642.f39032((SubLObject)UNPROVIDED);
                                final SubLObject var21 = deduction_handles_oc.f11649(var20);
                                final SubLObject var22 = Sequences.cconcatenate((SubLObject)$ic114$, new SubLObject[] { module0006.f203(var21), $ic115$ });
                                module0656.f39837((SubLObject)$ic116$, var20, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                var19 = var19.rest();
                                var20 = var19.first();
                            }
                        }
                        module0066.f4842(var17);
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var14, var2);
                        module0015.$g541$.rebind(var13, var2);
                        module0015.$g533$.rebind(var8_104, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var8_102, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var8_101, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var11, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41003(final SubLObject var28, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0656.f39832((SubLObject)$ic23$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic118$, assertion_handles_oc.f11025(var28));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            if (NIL != var17) {
                module0642.f39019(var17);
            }
            else {
                module0642.f39019(module0178.f11381(var28));
            }
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41004(final SubLObject var1) {
        final SubLObject var2 = module0656.f39971(var1);
        if (NIL == deduction_handles_oc.f11659(var2)) {
            module0656.f39789((SubLObject)$ic120$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        return f41005(var2);
    }
    
    public static SubLObject f41006(final SubLObject var100, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var101 = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles_oc.f11659(var100) : var100;
        final SubLObject var102 = deduction_handles_oc.f11649(var100);
        module0659.f40116((SubLObject)$ic116$, (SubLObject)$ic23$, var100, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var103 = module0656.f39832((SubLObject)$ic23$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var101), (SubLObject)$ic123$, var102);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var103) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var103);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var104 = module0015.$g533$.currentBinding(var101);
        try {
            module0015.$g533$.bind((SubLObject)T, var101);
            if (NIL != var17) {
                module0642.f39019(var17);
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var101), (SubLObject)$ic124$, var102);
            }
        }
        finally {
            module0015.$g533$.rebind(var104, var101);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var100;
    }
    
    public static SubLObject f41007(final SubLObject var100, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var101 = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles_oc.f11659(var100) : var100;
        final SubLObject var102 = deduction_handles_oc.f11649(var100);
        final SubLObject var103 = module0656.f39832((SubLObject)$ic23$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var101), (SubLObject)$ic123$, var102);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var103) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var103);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var104 = module0015.$g533$.currentBinding(var101);
        try {
            module0015.$g533$.bind((SubLObject)T, var101);
            if (NIL != var17) {
                module0642.f39019(var17);
            }
            else {
                module0642.f39020(module0015.$g459$.getGlobalValue());
                if (var102.isInteger()) {
                    module0642.f39019((SubLObject)$ic126$);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var101), (SubLObject)$ic127$, var102);
                    module0642.f39019((SubLObject)$ic128$);
                }
                else {
                    module0642.f39019((SubLObject)$ic129$);
                }
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
        }
        finally {
            module0015.$g533$.rebind(var104, var101);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var100;
    }
    
    public static SubLObject f41008(final SubLObject var110, SubLObject var111, SubLObject var112) {
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)NIL;
        }
        if (var112 == UNPROVIDED) {
            var112 = (SubLObject)NIL;
        }
        module0656.f39837((SubLObject)$ic130$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41005(final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles_oc.f11659(var100) : var100;
        module0642.f39020((SubLObject)$ic6$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var101), module0655.$g5142$.getDynamicValue(var101));
        final SubLObject var102 = module0014.f672((SubLObject)$ic7$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic8$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var102) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var102);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic9$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic133$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var103 = module0015.$g535$.currentBinding(var101);
        try {
            module0015.$g535$.bind((SubLObject)T, var101);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var8_113 = module0015.$g533$.currentBinding(var101);
            try {
                module0015.$g533$.bind((SubLObject)T, var101);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var101));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_114 = module0015.$g533$.currentBinding(var101);
                final SubLObject var104 = module0015.$g541$.currentBinding(var101);
                final SubLObject var105 = module0015.$g539$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)T, var101);
                    module0015.$g541$.bind((SubLObject)T, var101);
                    module0015.$g539$.bind(module0015.f797(), var101);
                    f41009(var100);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f41010(var100);
                    f41011(var100);
                    module0015.f799(module0015.$g539$.getDynamicValue(var101));
                }
                finally {
                    module0015.$g539$.rebind(var105, var101);
                    module0015.$g541$.rebind(var104, var101);
                    module0015.$g533$.rebind(var8_114, var101);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var8_113, var101);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var103, var101);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return var100;
    }
    
    public static SubLObject f41009(final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        if (NIL != deduction_handles_oc.f11659(var100)) {
            final SubLObject var102 = deduction_handles_oc.f11649(var100);
            final SubLObject var103 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic136$, var102);
            module0656.f39870((SubLObject)$ic134$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g207$.getGlobalValue());
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019(var103);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39020(module0015.$g208$.getGlobalValue());
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0656.f39837((SubLObject)$ic116$, var100, (SubLObject)$ic137$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0655.$g5115$.getDynamicValue(var101)) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0656.f39837((SubLObject)$ic138$, var100, (SubLObject)$ic139$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41010(final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        final SubLObject var102 = module0188.f11781(var100);
        final SubLObject var103 = module0191.f11924(var100);
        if ($ic50$ != var103) {
            final SubLObject var104 = module0191.f11928(var100);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic52$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0656.f39796(var104);
            module0642.f39032((SubLObject)TWO_INTEGER);
        }
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic51$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0656.f39795(var103);
        module0642.f39032((SubLObject)TWO_INTEGER);
        if (NIL != module0191.f11955(var102, (SubLObject)UNPROVIDED)) {
            if (!var103.equal(module0191.f11978(var102))) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                final SubLObject var105 = (SubLObject)$ic72$;
                module0642.f39020(module0015.$g219$.getGlobalValue());
                if (NIL != var105) {
                    module0642.f39020(module0015.$g222$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(var105));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var106 = module0015.$g533$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)T, var101);
                    module0642.f39019((SubLObject)$ic140$);
                }
                finally {
                    module0015.$g533$.rebind(var106, var101);
                }
                module0642.f39020(module0015.$g220$.getGlobalValue());
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39032((SubLObject)TWO_INTEGER);
            }
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic141$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            final SubLObject var107 = module0191.f11976(var102);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic142$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0656.f39804(var107, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != assertion_handles_oc.f11035(var102)) {
                f40987(var102);
            }
            else {
                f41012(var102);
            }
        }
        else {
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic143$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41011(final SubLObject var100) {
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic144$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        final SubLObject var101 = module0188.f11770(var100);
        module0642.f39026((SubLObject)UNPROVIDED);
        f41013(var101, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41014(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0656.f39970(var1);
        if (NIL == assertion_handles_oc.f11035(var3)) {
            module0656.f39789((SubLObject)$ic102$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        if (NIL == $g5302$.getDynamicValue(var2)) {
            $g5302$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic148$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
        }
        Hashtables.clrhash($g5302$.getDynamicValue(var2));
        Hashtables.sethash(var3, $g5302$.getDynamicValue(var2), (SubLObject)T);
        final SubLObject var5;
        final SubLObject var4 = var5 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic149$, assertion_handles_oc.f11025(var3));
        final SubLObject var6 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var7 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var7) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var7);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var5) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var5);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var8_118 = module0015.$g535$.currentBinding(var2);
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
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_119 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_120 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_120, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var5) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var5);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_121 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0015.$g541$.bind((SubLObject)T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0656.f39870((SubLObject)$ic146$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g207$.getGlobalValue());
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic150$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39020(module0015.$g208$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f40999(var3, (SubLObject)T);
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var9, var2);
                        module0015.$g541$.rebind(var8, var2);
                        module0015.$g533$.rebind(var8_121, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var8_119, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var8_118, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var6, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41015(final SubLObject var28, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL == var17) {
            var17 = (SubLObject)$ic152$;
        }
        final SubLObject var30 = module0656.f39832((SubLObject)$ic23$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic153$, assertion_handles_oc.f11025(var28));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            module0642.f39019(var17);
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var28;
    }
    
    public static SubLObject f40999(final SubLObject var28, SubLObject var122) {
        if (var122 == UNPROVIDED) {
            var122 = (SubLObject)T;
        }
        final SubLThread var123 = SubLProcess.currentSubLThread();
        module0656.f39916(var28, module0655.$g5095$.getDynamicValue(var123), (SubLObject)T);
        module0642.f39026((SubLObject)TWO_INTEGER);
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        if (NIL != var122) {
            module0642.f39019((SubLObject)$ic156$);
        }
        else {
            module0642.f39019((SubLObject)$ic157$);
        }
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var124 = module0178.f11299(var28);
        final SubLObject var125 = module0178.f11378(var28);
        if (NIL != var125) {
            f40985(var28);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        SubLObject var126 = var124;
        SubLObject var127 = (SubLObject)NIL;
        var127 = var126.first();
        while (NIL != var126) {
            if (!var127.eql(var125)) {
                if (!var127.eql(var124.first())) {
                    module0642.f39026((SubLObject)UNPROVIDED);
                }
                f41016(var127, var122);
            }
            var126 = var126.rest();
            var127 = var126.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41016(final SubLObject var100, SubLObject var122) {
        if (var122 == UNPROVIDED) {
            var122 = (SubLObject)T;
        }
        module0642.f39019((SubLObject)$ic158$);
        module0656.f39837((SubLObject)$ic116$, var100, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        SubLObject var124;
        final SubLObject var123 = var124 = module0188.f11770(var100);
        SubLObject var125 = (SubLObject)NIL;
        var125 = var124.first();
        while (NIL != var124) {
            f41017(var125, var122);
            module0642.f39026((SubLObject)UNPROVIDED);
            var124 = var124.rest();
            var125 = var124.first();
        }
        return var100;
    }
    
    public static SubLObject f41017(final SubLObject var125, SubLObject var122) {
        if (var122 == UNPROVIDED) {
            var122 = (SubLObject)T;
        }
        final SubLThread var126 = SubLProcess.currentSubLThread();
        f41002(var125, (SubLObject)UNPROVIDED);
        if (NIL != var122 && NIL != assertion_handles_oc.f11035(var125)) {
            if (NIL != Hashtables.gethash(var125, $g5302$.getDynamicValue(var126), (SubLObject)UNPROVIDED)) {
                if (NIL == module0178.f11375(var125)) {
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic159$);
                }
            }
            else {
                Hashtables.sethash(var125, $g5302$.getDynamicValue(var126), (SubLObject)T);
                final SubLObject var127 = module0178.f11299(var125);
                final SubLObject var128 = module0178.f11378(var125);
                if (NIL != module0035.f1997(var127)) {
                    if (NIL == var128) {
                        module0642.f39020(module0015.$g264$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var129 = module0015.$g533$.currentBinding(var126);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var126);
                            module0642.f39020(module0015.$g275$.getGlobalValue());
                            module0642.f39020(module0015.$g281$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic160$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var8_126 = module0015.$g533$.currentBinding(var126);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var126);
                                f41016(var127.first(), (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var8_126, var126);
                            }
                            module0642.f39020(module0015.$g276$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var129, var126);
                        }
                        module0642.f39020(module0015.$g265$.getGlobalValue());
                    }
                }
                else {
                    module0642.f39020(module0015.$g262$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var129 = module0015.$g533$.currentBinding(var126);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var126);
                        if (NIL != var128) {
                            module0642.f39020(module0015.$g275$.getGlobalValue());
                            module0642.f39020(module0015.$g281$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic161$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var8_127 = module0015.$g533$.currentBinding(var126);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var126);
                                f40985(var125);
                            }
                            finally {
                                module0015.$g533$.rebind(var8_127, var126);
                            }
                            module0642.f39020(module0015.$g276$.getGlobalValue());
                        }
                        SubLObject var130 = var127;
                        SubLObject var131 = (SubLObject)NIL;
                        var131 = var130.first();
                        while (NIL != var130) {
                            if (!var131.eql(var128)) {
                                module0642.f39020(module0015.$g275$.getGlobalValue());
                                module0642.f39020(module0015.$g281$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic161$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var8_128 = module0015.$g533$.currentBinding(var126);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var126);
                                    f41016(var131, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var8_128, var126);
                                }
                                module0642.f39020(module0015.$g276$.getGlobalValue());
                            }
                            var130 = var130.rest();
                            var131 = var130.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var129, var126);
                    }
                    module0642.f39020(module0015.$g263$.getGlobalValue());
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40985(final SubLObject var28) {
        final SubLObject var29 = module0178.f11295(var28);
        final SubLObject var30 = module0178.f11296(var28);
        final SubLObject var31 = module0178.f11297(var28);
        final SubLObject var32 = module0178.f11298(var28);
        module0642.f39019((SubLObject)$ic162$);
        if (NIL != var29) {
            module0642.f39019((SubLObject)$ic163$);
            module0656.f39802(var29);
        }
        if (NIL != var30) {
            module0642.f39019((SubLObject)$ic164$);
            module0656.f39800(var30);
        }
        if (NIL != var32) {
            module0642.f39019((SubLObject)$ic165$);
            module0656.f39801(var32);
        }
        if (NIL != var31) {
            module0642.f39019((SubLObject)$ic166$);
            module0656.f39804(var31, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var28;
    }
    
    public static SubLObject f41002(final SubLObject var125, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)$ic167$;
        }
        if (NIL != assertion_handles_oc.f11035(var125)) {
            module0656.f39916(var125, (SubLObject)T, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0179.f11424(var125)) {
            final SubLObject var134 = module0183.f11557(var125);
            module0656.f39922(var134, var133);
        }
        else {
            module0656.f39922(var125, var133);
        }
        return var125;
    }
    
    public static SubLObject f41013(final SubLObject var135, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)$ic167$;
        }
        final SubLThread var136 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
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
        final SubLObject var137 = module0015.$g533$.currentBinding(var136);
        try {
            module0015.$g533$.bind((SubLObject)T, var136);
            SubLObject var138 = var135;
            SubLObject var139 = (SubLObject)NIL;
            var139 = var138.first();
            while (NIL != var138) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_136 = module0015.$g533$.currentBinding(var136);
                try {
                    module0015.$g533$.bind((SubLObject)T, var136);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic168$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic169$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_137 = module0015.$g533$.currentBinding(var136);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var136);
                        f41002(var139, var133);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_137, var136);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var8_136, var136);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                var138 = var138.rest();
                var139 = var138.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var137, var136);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41018(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic170$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)$ic170$);
        var3 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic170$);
            return (SubLObject)NIL;
        }
        final SubLObject var5 = f41019(var2);
        final SubLObject var6 = Symbols.make_keyword(var3);
        if (NIL == module0191.f11952(var5)) {
            module0656.f39789((SubLObject)$ic171$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        return f41020(var5, var6);
    }
    
    public static SubLObject f41021(final SubLObject var134, SubLObject var133, SubLObject var17) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)$ic167$;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var135 = SubLProcess.currentSubLThread();
        assert NIL != module0191.f11952(var134) : var134;
        assert NIL != module0360.f23913(var133) : var133;
        final SubLObject var136 = f41022(var134);
        final SubLObject var137 = module0656.f39832((SubLObject)$ic23$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var135), (SubLObject)$ic175$, var136, var133);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var137) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var137);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var138 = module0015.$g533$.currentBinding(var135);
        try {
            module0015.$g533$.bind((SubLObject)T, var135);
            if (NIL != var17) {
                module0642.f39019(var17);
            }
            else {
                module0642.f39024(module0191.f11965(var134));
            }
        }
        finally {
            module0015.$g533$.rebind(var138, var135);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var134;
    }
    
    public static SubLObject f41020(final SubLObject var134, final SubLObject var133) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic6$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var135), module0655.$g5142$.getDynamicValue(var135));
        final SubLObject var136 = module0014.f672((SubLObject)$ic7$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic8$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var136) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var136);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic9$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic178$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var137 = module0015.$g535$.currentBinding(var135);
        try {
            module0015.$g535$.bind((SubLObject)T, var135);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var8_141 = module0015.$g533$.currentBinding(var135);
            try {
                module0015.$g533$.bind((SubLObject)T, var135);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var135));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_142 = module0015.$g533$.currentBinding(var135);
                final SubLObject var138 = module0015.$g541$.currentBinding(var135);
                final SubLObject var139 = module0015.$g539$.currentBinding(var135);
                try {
                    module0015.$g533$.bind((SubLObject)T, var135);
                    module0015.$g541$.bind((SubLObject)T, var135);
                    module0015.$g539$.bind(module0015.f797(), var135);
                    f41023(var134, var133);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f41024(var134);
                    f41025(var134);
                    module0015.f799(module0015.$g539$.getDynamicValue(var135));
                }
                finally {
                    module0015.$g539$.rebind(var139, var135);
                    module0015.$g541$.rebind(var138, var135);
                    module0015.$g533$.rebind(var8_142, var135);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var8_141, var135);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var137, var135);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return var134;
    }
    
    public static SubLObject f41023(final SubLObject var134, final SubLObject var133) {
        if (NIL != module0191.f11952(var134)) {
            module0656.f39870((SubLObject)$ic179$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g207$.getGlobalValue());
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic178$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39020(module0015.$g208$.getGlobalValue());
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0656.f39837((SubLObject)$ic181$, var134, var133, (SubLObject)$ic182$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0656.f39837((SubLObject)$ic176$, var134, var133, (SubLObject)$ic137$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0656.f39837((SubLObject)$ic183$, var134, (SubLObject)$ic184$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41024(final SubLObject var134) {
        if ($ic50$ == module0191.f11978(var134)) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic51$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39019((SubLObject)$ic185$);
        }
        else {
            final SubLObject var135 = module0191.f11980(var134);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic52$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0656.f39796(var135);
        }
        final SubLObject var136 = module0191.f11965(var134);
        module0642.f39032((SubLObject)TWO_INTEGER);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic186$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0656.f39798(var136);
        final SubLObject var137 = module0191.f11976(var134);
        module0642.f39026((SubLObject)TWO_INTEGER);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic142$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0656.f39804(var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f41012(var134);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41012(final SubLObject var134) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        final SubLObject var136 = (SubLObject)((NIL != module0179.f11424(var134)) ? var134 : ((NIL != module0191.f11952(var134)) ? module0183.f11552(var134) : NIL));
        final SubLObject var137 = module0191.f11969(var134);
        if (NIL != module0655.$g5097$.getDynamicValue(var135) || NIL != module0655.$g5096$.getDynamicValue(var135)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic78$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            module0656.f39804(var137, (SubLObject)ZERO_INTEGER, (SubLObject)T);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        if (NIL != module0179.f11424(var136)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic187$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            SubLObject var138 = module0180.f11455(var136);
            SubLObject var139 = (SubLObject)NIL;
            var139 = var138.first();
            while (NIL != var138) {
                module0656.f39837((SubLObject)$ic116$, var139, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic188$);
                module0656.f39804(module0188.f11781(var139), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
                var138 = var138.rest();
                var139 = var138.first();
            }
        }
        if (NIL != module0655.$g5101$.getDynamicValue(var135)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic80$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var140 = module0018.$g707$.currentBinding(var135);
            final SubLObject var141 = module0579.$g4262$.currentBinding(var135);
            try {
                module0018.$g707$.bind((SubLObject)$ic79$, var135);
                module0579.$g4262$.bind(module0191.f11976(var134), var135);
                module0656.f39923(var137);
            }
            finally {
                module0579.$g4262$.rebind(var141, var135);
                module0018.$g707$.rebind(var140, var135);
            }
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41025(final SubLObject var134) {
        final SubLObject var135 = module0191.f11977(var134);
        return f41026(var134, var135);
    }
    
    public static SubLObject f41026(final SubLObject var134, final SubLObject var135) {
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic144$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (NIL == var135) {
            module0642.f39019((SubLObject)$ic189$);
        }
        else if (NIL != module0035.f1997(var135) && var134.equal(var135.first())) {
            module0642.f39019((SubLObject)$ic190$);
        }
        else {
            SubLObject var136 = var135;
            SubLObject var137 = (SubLObject)NIL;
            var137 = var136.first();
            while (NIL != var136) {
                module0642.f39026((SubLObject)UNPROVIDED);
                f41002(var137, (SubLObject)UNPROVIDED);
                var136 = var136.rest();
                var137 = var136.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41022(final SubLObject var134) {
        return module0655.f39759(var134);
    }
    
    public static SubLObject f41019(final SubLObject var1) {
        if (var1.isInteger()) {
            return module0655.f39757(var1);
        }
        if (NIL != module0191.f11952(var1)) {
            return var1;
        }
        if (NIL == var1) {
            return (SubLObject)NIL;
        }
        if (var1.isString()) {
            final SubLObject var2 = reader.read_from_string_ignoring_errors(var1, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return f41019(var2);
        }
        if (var1.isCons()) {
            return f41019(var1.first());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41027(final SubLObject var134, final SubLObject var133, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var135 = SubLProcess.currentSubLThread();
        assert NIL != module0191.f11952(var134) : var134;
        assert NIL != module0360.f23913(var133) : var133;
        if (var133 == $ic167$) {
            return var134;
        }
        if (NIL == var17) {
            var17 = (SubLObject)$ic182$;
        }
        final SubLObject var136 = f41022(var134);
        final SubLObject var137 = module0656.f39832((SubLObject)$ic40$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var135), (SubLObject)$ic191$, var136, var133);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var137) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var137);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var138 = module0015.$g533$.currentBinding(var135);
        try {
            module0015.$g533$.bind((SubLObject)T, var135);
            module0642.f39019(var17);
        }
        finally {
            module0015.$g533$.rebind(var138, var135);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var134;
    }
    
    public static SubLObject f41028(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic170$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)$ic170$);
        var3 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic170$);
            return (SubLObject)NIL;
        }
        final SubLObject var5 = f41019(var2);
        final SubLObject var6 = Symbols.make_keyword(var3);
        if (NIL == var5) {
            return module0656.f39789((SubLObject)$ic193$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var7 = module0191.f11970(var5);
        final SubLObject var8 = module0191.f11974(var5);
        final SubLObject var9 = module0333.f22437(var5, var6);
        return module0674.f41156(var7, var8, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41029(final SubLObject var134, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var135 = SubLProcess.currentSubLThread();
        assert NIL != module0191.f11952(var134) : var134;
        if (NIL == var17) {
            var17 = (SubLObject)$ic184$;
        }
        final SubLObject var136 = f41022(var134);
        final SubLObject var137 = module0656.f39832((SubLObject)$ic40$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var135), (SubLObject)$ic195$, var136);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var137) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var137);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var138 = module0015.$g533$.currentBinding(var135);
        try {
            module0015.$g533$.bind((SubLObject)T, var135);
            module0642.f39019(var17);
        }
        finally {
            module0015.$g533$.rebind(var138, var135);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var134;
    }
    
    public static SubLObject f41030(final SubLObject var1) {
        final SubLObject var2 = f41019(var1);
        if (NIL == var2) {
            return module0656.f39789((SubLObject)$ic193$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var3 = module0191.f11970(var2);
        final SubLObject var4 = module0191.f11974(var2);
        return module0683.f41803(var3, var4, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41031(final SubLObject var1) {
        final SubLObject var2 = f41032(var1);
        if (NIL == module0192.f12006(var2)) {
            module0656.f39789((SubLObject)$ic198$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        return f41033(var2);
    }
    
    public static SubLObject f41034(final SubLObject var149, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var150 = SubLProcess.currentSubLThread();
        assert NIL != module0192.f12006(var149) : var149;
        final SubLObject var151 = module0192.f12025(var149);
        final SubLObject var152 = module0656.f39832((SubLObject)$ic23$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var150), (SubLObject)$ic201$, var151);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var152) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var152);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var153 = module0015.$g533$.currentBinding(var150);
        try {
            module0015.$g533$.bind((SubLObject)T, var150);
            if (NIL != var17) {
                module0642.f39019(var17);
            }
            else {
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39019((SubLObject)$ic126$);
                PrintLow.format(module0015.$g131$.getDynamicValue(var150), (SubLObject)$ic202$, var151);
                module0642.f39019((SubLObject)$ic128$);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
        }
        finally {
            module0015.$g533$.rebind(var153, var150);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var149;
    }
    
    public static SubLObject f41035(final SubLObject var110, SubLObject var111, SubLObject var112) {
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)NIL;
        }
        if (var112 == UNPROVIDED) {
            var112 = (SubLObject)NIL;
        }
        module0656.f39837((SubLObject)$ic203$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41033(final SubLObject var149) {
        final SubLThread var150 = SubLProcess.currentSubLThread();
        final SubLObject var151 = module0192.f12017(var149);
        final SubLObject var153;
        final SubLObject var152 = var153 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic208$, module0192.f12025(var149));
        final SubLObject var154 = module0015.$g538$.currentBinding(var150);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var150))) ? module0015.$g538$.getDynamicValue(var150) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var150);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var150), module0655.$g5142$.getDynamicValue(var150));
            final SubLObject var155 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var155) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var155);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var153) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var153);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var8_151 = module0015.$g535$.currentBinding(var150);
            try {
                module0015.$g535$.bind((SubLObject)T, var150);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var150)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var150)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var8_152 = module0015.$g533$.currentBinding(var150);
                try {
                    module0015.$g533$.bind((SubLObject)T, var150);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_153 = module0015.$g533$.currentBinding(var150);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var150);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_153, var150);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var153) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var153);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var150));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_154 = module0015.$g533$.currentBinding(var150);
                    final SubLObject var156 = module0015.$g541$.currentBinding(var150);
                    final SubLObject var157 = module0015.$g539$.currentBinding(var150);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var150);
                        module0015.$g541$.bind((SubLObject)T, var150);
                        module0015.$g539$.bind(module0015.f797(), var150);
                        module0656.f39870((SubLObject)$ic206$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39020(module0015.$g207$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic209$);
                        module0642.f39020(module0015.$g208$.getGlobalValue());
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g240$.getGlobalValue());
                        f41036(module0232.f15306(var151), module0232.f15308(var151));
                        module0642.f39020(module0015.$g241$.getGlobalValue());
                        final SubLObject var158 = module0192.f12029(var149);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39020(module0015.$g207$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic210$);
                        module0642.f39020(module0015.$g208$.getGlobalValue());
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        SubLObject var159 = var158;
                        SubLObject var160 = (SubLObject)NIL;
                        var160 = var159.first();
                        while (NIL != var159) {
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0656.f39916(var160, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            var159 = var159.rest();
                            var160 = var159.first();
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var150));
                    }
                    finally {
                        module0015.$g539$.rebind(var157, var150);
                        module0015.$g541$.rebind(var156, var150);
                        module0015.$g533$.rebind(var8_154, var150);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var8_152, var150);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var8_151, var150);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var154, var150);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41036(final SubLObject var155, final SubLObject var156) {
        module0642.f39019((SubLObject)$ic211$);
        SubLObject var157 = (SubLObject)T;
        SubLObject var158 = var155;
        SubLObject var159 = (SubLObject)NIL;
        var159 = var158.first();
        while (NIL != var158) {
            if (NIL == var157) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39027((SubLObject)$ic62$, (SubLObject)TWO_INTEGER);
            }
            module0656.f39804(var159, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
            var157 = (SubLObject)NIL;
            var158 = var158.rest();
            var159 = var158.first();
        }
        module0642.f39019((SubLObject)$ic212$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39027((SubLObject)$ic62$, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic213$);
        var157 = (SubLObject)T;
        var158 = var156;
        var159 = (SubLObject)NIL;
        var159 = var158.first();
        while (NIL != var158) {
            if (NIL == var157) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39027((SubLObject)$ic62$, (SubLObject)TWO_INTEGER);
            }
            module0656.f39804(var159, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
            var157 = (SubLObject)NIL;
            var158 = var158.rest();
            var159 = var158.first();
        }
        module0642.f39019((SubLObject)$ic214$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41032(final SubLObject var1) {
        if (var1.isInteger()) {
            return module0192.f12032(var1);
        }
        if (NIL != module0192.f12006(var1)) {
            return var1;
        }
        if (NIL == var1) {
            return (SubLObject)NIL;
        }
        if (var1.isString()) {
            final SubLObject var2 = reader.read_from_string_ignoring_errors(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (var2.isInteger()) {
                return module0192.f12032(var2);
            }
            return (SubLObject)NIL;
        }
        else {
            if (var1.isCons()) {
                return f41032(var1.first());
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f41037(final SubLObject var1) {
        final SubLObject var2 = reader.read_from_string(module0642.f39104((SubLObject)$ic215$, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var3 = assertion_handles_oc.f11053(var2);
        final SubLObject var4 = module0289.f19396(var3);
        final SubLObject var5 = module0642.f39104((SubLObject)$ic216$, var1);
        final SubLObject var6 = module0038.f2965(module0642.f39104((SubLObject)$ic217$, var1));
        final SubLObject var7 = module0642.f39104((SubLObject)$ic218$, var1);
        final SubLObject var8 = module0038.f2965(module0642.f39104((SubLObject)$ic219$, var1));
        if (NIL == module0038.f2608(var5)) {}
        if (NIL == module0038.f2608(var7)) {}
        f40976(var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41038() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40971", "CB-FIND-ASSERTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40972", "S#45068", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40973", "S#45069", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40974", "CB-HANDLE-FIND-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40975", "S#45070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40977", "CB-FIND-SIMILAR-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40978", "S#45071", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40979", "CB-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40980", "CB-AF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40976", "S#44183", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40981", "S#45072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40986", "S#45073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40982", "S#45074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40989", "S#45075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40988", "S#45076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40987", "S#45077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40983", "S#45078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40990", "S#45079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40991", "S#45080", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40984", "S#45081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40992", "S#45082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40993", "S#45083", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40994", "CB-ASSERTION-WITH-SHOW-ENGLISH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40995", "S#45084", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40996", "CB-ASSERTION-WITH-SHOW-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40997", "S#45085", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40998", "CB-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41000", "S#45086", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41001", "CB-DEPENDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41003", "S#45087", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41004", "CB-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41006", "S#45088", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41007", "S#45089", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41008", "S#45090", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41005", "S#44184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41009", "S#45091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41010", "S#45092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41011", "S#45093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41014", "CB-JUSTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41015", "S#45094", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40999", "S#45095", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41016", "S#45096", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41017", "S#45097", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f40985", "S#45098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41002", "S#45099", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41013", "S#45100", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41018", "CB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41021", "S#45101", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41020", "S#45102", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41023", "S#45103", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41024", "S#45104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41012", "S#45105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41025", "S#45106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41026", "S#45107", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41022", "S#45108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41019", "S#45109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41027", "S#45110", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41028", "CB-HL-VALIDATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41029", "S#45111", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41030", "CB-HL-SUPPORT-SIMILAR-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41031", "CB-CLAUSE-STRUC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41034", "S#45112", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41035", "S#45113", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41033", "S#45114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41036", "S#45115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41032", "S#45116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0671", "f41037", "CB-PROCESS-SUGGESTED-ENGLISH", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41039() {
        $g5302$ = SubLFiles.defparameter("S#45117", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41040() {
        module0015.f873((SubLObject)$ic2$);
        Hashtables.sethash((SubLObject)$ic3$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)NIL));
        module0656.f39840((SubLObject)$ic25$, (SubLObject)$ic26$, (SubLObject)ONE_INTEGER);
        module0656.f39819((SubLObject)$ic25$, (SubLObject)$ic0$, (SubLObject)$ic27$, (SubLObject)$ic28$);
        module0015.f873((SubLObject)$ic32$);
        module0015.f873((SubLObject)$ic37$);
        module0656.f39840((SubLObject)$ic42$, (SubLObject)$ic43$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic44$);
        module0015.f873((SubLObject)$ic45$);
        module0015.f873((SubLObject)$ic90$);
        module0656.f39840((SubLObject)$ic93$, (SubLObject)$ic94$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic95$);
        module0656.f39840((SubLObject)$ic98$, (SubLObject)$ic99$, (SubLObject)TWO_INTEGER);
        Hashtables.sethash((SubLObject)$ic100$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic101$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic105$);
        module0656.f39840((SubLObject)$ic54$, (SubLObject)$ic107$, (SubLObject)TWO_INTEGER);
        Hashtables.sethash((SubLObject)$ic108$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic109$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic117$);
        module0656.f39840((SubLObject)$ic56$, (SubLObject)$ic119$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic121$);
        module0656.f39840((SubLObject)$ic116$, (SubLObject)$ic125$, (SubLObject)TWO_INTEGER);
        module0656.f39840((SubLObject)$ic130$, (SubLObject)$ic131$, (SubLObject)TWO_INTEGER);
        Structures.register_method(module0656.$g5160$.getGlobalValue(), deduction_handles_oc.$g2229$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic132$));
        Hashtables.sethash((SubLObject)$ic134$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic135$, (SubLObject)NIL));
        module0012.f441((SubLObject)$ic145$);
        Hashtables.sethash((SubLObject)$ic146$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic147$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic151$);
        module0656.f39840((SubLObject)$ic154$, (SubLObject)$ic155$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic172$);
        module0656.f39840((SubLObject)$ic176$, (SubLObject)$ic177$, (SubLObject)THREE_INTEGER);
        Hashtables.sethash((SubLObject)$ic179$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic180$, (SubLObject)NIL));
        module0656.f39840((SubLObject)$ic181$, (SubLObject)$ic192$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic194$);
        module0656.f39840((SubLObject)$ic183$, (SubLObject)$ic196$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic197$);
        module0015.f873((SubLObject)$ic199$);
        module0656.f39840((SubLObject)$ic203$, (SubLObject)$ic204$, (SubLObject)TWO_INTEGER);
        Structures.register_method(module0656.$g5160$.getGlobalValue(), module0192.$g2252$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic205$));
        Hashtables.sethash((SubLObject)$ic206$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic207$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic220$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f41038();
    }
    
    public void initializeVariables() {
        f41039();
    }
    
    public void runTopLevelForms() {
        f41040();
    }
    
    static {
        me = (SubLFile)new module0671();
        $g5302$ = null;
        $ic0$ = makeString("Find Assertion");
        $ic1$ = makeString("cb-handle-find-assertion");
        $ic2$ = makeSymbol("CB-FIND-ASSERTION");
        $ic3$ = makeKeyword("CB-FIND-ASSERTION");
        $ic4$ = makeString("cb-find-assertion.html");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic6$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic7$ = makeKeyword("CB-CYC");
        $ic8$ = makeString("stylesheet");
        $ic9$ = makeString("text/css");
        $ic10$ = makeKeyword("SHA1");
        $ic11$ = makeString("text/javascript");
        $ic12$ = makeString("yui-skin-sam");
        $ic13$ = makeString("reloadFrameButton");
        $ic14$ = makeString("button");
        $ic15$ = makeString("reload");
        $ic16$ = makeString("Refresh Frames");
        $ic17$ = makeString("post");
        $ic18$ = makeString("Reset");
        $ic19$ = ConsesLow.list(new SubLObject[] { makeKeyword("INPUT-NAME"), makeString("sentence"), makeKeyword("COMPLETE-LABEL"), makeString("Complete"), makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("CLEAR-LABEL"), makeString("Clear Sentence"), makeKeyword("HEIGHT"), TWENTY_INTEGER, makeKeyword("WIDTH"), makeInteger(80) });
        $ic20$ = makeString("use-genl-mts");
        $ic21$ = makeString("t");
        $ic22$ = makeString("Additionally search genlMts for this assertion");
        $ic23$ = makeKeyword("MAIN");
        $ic24$ = makeString("cb-find-assertion");
        $ic25$ = makeKeyword("FIND-ASSERTION");
        $ic26$ = makeSymbol("S#45069", "CYC");
        $ic27$ = makeString("FindAsrt");
        $ic28$ = makeString("Find a CycL Assertion");
        $ic29$ = makeString("Sentence was not well-formed.");
        $ic30$ = makeString("No assertions were found.");
        $ic31$ = makeString("Some assertions were found :");
        $ic32$ = makeSymbol("CB-HANDLE-FIND-ASSERTION");
        $ic33$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("sentence"));
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION-ID"));
        $ic35$ = makeString("Could not determine an assertion from ~a");
        $ic36$ = makeString("Find Similar Assertion");
        $ic37$ = makeSymbol("CB-FIND-SIMILAR-ASSERTION");
        $ic38$ = makeSymbol("ASSERTION-P");
        $ic39$ = makeString("[Find Similar]");
        $ic40$ = makeKeyword("SELF");
        $ic41$ = makeString("cb-find-similar-assertion&~A");
        $ic42$ = makeKeyword("FIND-SIMILAR-ASSERTION");
        $ic43$ = makeSymbol("S#45071", "CYC");
        $ic44$ = makeSymbol("CB-ASSERTION");
        $ic45$ = makeSymbol("CB-AF");
        $ic46$ = makeString("Public ");
        $ic47$ = makeString("");
        $ic48$ = makeString("Cyc Assertion #");
        $ic49$ = makeString("Meta Assertions :");
        $ic50$ = makeKeyword("UNKNOWN");
        $ic51$ = makeString("Truth : ");
        $ic52$ = makeString("Strength : ");
        $ic53$ = makeString("Direction : ");
        $ic54$ = makeKeyword("ARGUMENTS");
        $ic55$ = makeString("Arguments : ");
        $ic56$ = makeKeyword("DEPENDENTS");
        $ic57$ = makeString("Dependents : ");
        $ic58$ = makeString("~A (~A assertion~:P)");
        $ic59$ = makeString("No Dependents");
        $ic60$ = makeKeyword("TRANSFORMATION-RULE-STATISTICS");
        $ic61$ = makeString("Backward Inference Statistics :");
        $ic62$ = makeKeyword("NBSP");
        $ic63$ = makeKeyword("VERBOSE");
        $ic64$ = makeKeyword("CLEAR-TRANSFORMATION-RULE-STATISTICS");
        $ic65$ = makeString("[Clear]");
        $ic66$ = makeKeyword("RULE-FORWARD-INFERENCE-METRICS");
        $ic67$ = makeString("Forward Inference Statistics :");
        $ic68$ = makeString("Rule properties: ");
        $ic69$ = makeString("Self-Looping ");
        $ic70$ = makeString("Self-Expanding ");
        $ic71$ = makeString("Modification of this Assertion is not permitted.");
        $ic72$ = makeKeyword("RED");
        $ic73$ = makeString("Assertion Access Problem :");
        $ic74$ = makeString("Assertion is either miscanonicalized or incorrectly indexed.");
        $ic75$ = makeString("Assertion Not Well-formed :");
        $ic76$ = makeString("EL and ");
        $ic77$ = makeString("EL Formula : ");
        $ic78$ = makeString("HL Formula : ");
        $ic79$ = makeKeyword("NL");
        $ic80$ = makeString("English Translation : ");
        $ic81$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic82$ = makeKeyword("HTML");
        $ic83$ = makeString("Exceptions :");
        $ic84$ = makeKeyword("NEW");
        $ic85$ = makeSymbol("S#43751", "CYC");
        $ic86$ = makeSymbol("S#43752", "CYC");
        $ic87$ = makeSymbol("S#43753", "CYC");
        $ic88$ = makeSymbol("S#43754", "CYC");
        $ic89$ = makeString("Pragmatic Requirements :");
        $ic90$ = makeSymbol("CB-ASSERTION-WITH-SHOW-ENGLISH");
        $ic91$ = makeString("[Show English]");
        $ic92$ = makeString("cb-assertion-with-show-english&~a");
        $ic93$ = makeKeyword("SHOW-ENGLISH");
        $ic94$ = makeSymbol("S#45084", "CYC");
        $ic95$ = makeSymbol("CB-ASSERTION-WITH-SHOW-EL-FORMULA");
        $ic96$ = makeString("[EL Formula]");
        $ic97$ = makeString("cb-assertion-with-show-el-formula&~a");
        $ic98$ = makeKeyword("SHOW-EL-FORMULA");
        $ic99$ = makeSymbol("S#45085", "CYC");
        $ic100$ = makeKeyword("CB-ARGUMENTS");
        $ic101$ = makeString("cb-arguments.html");
        $ic102$ = makeString("~A does not specify an assertion");
        $ic103$ = makeString("Arguments for Assertion #~S");
        $ic104$ = makeString("Assertion : ");
        $ic105$ = makeSymbol("CB-ARGUMENTS");
        $ic106$ = makeString("cb-arguments&~A");
        $ic107$ = makeSymbol("S#45086", "CYC");
        $ic108$ = makeKeyword("CB-DEPENDENTS");
        $ic109$ = makeString("cb-dependents.html");
        $ic110$ = makeString("Dependents for Assertion #~S");
        $ic111$ = makeString("~A Assertions Deduced using Assertion: ");
        $ic112$ = makeString("Assertion Deduced using Assertion: ");
        $ic113$ = makeString("Supports : ");
        $ic114$ = makeString("[Deduction ");
        $ic115$ = makeString("]");
        $ic116$ = makeKeyword("DEDUCTION");
        $ic117$ = makeSymbol("CB-DEPENDENTS");
        $ic118$ = makeString("cb-dependents&~A");
        $ic119$ = makeSymbol("S#45087", "CYC");
        $ic120$ = makeString("~A does not specify an argument");
        $ic121$ = makeSymbol("CB-DEDUCTION");
        $ic122$ = makeSymbol("DEDUCTION-P");
        $ic123$ = makeString("cb-deduction&~A");
        $ic124$ = makeString("Deduction #~A");
        $ic125$ = makeSymbol("S#45088", "CYC");
        $ic126$ = makeString("#<");
        $ic127$ = makeString("DEDUCTION #~A");
        $ic128$ = makeString(">");
        $ic129$ = makeString("#<DEDUCTION ?>");
        $ic130$ = makeKeyword("DEDUCTION-STRUCT");
        $ic131$ = makeSymbol("S#45089", "CYC");
        $ic132$ = makeSymbol("S#45090", "CYC");
        $ic133$ = makeString("Deduced Argument detail");
        $ic134$ = makeKeyword("CB-SOURCE");
        $ic135$ = makeString("cb-source.html");
        $ic136$ = makeString("Deduced Argument #~S");
        $ic137$ = makeString("[Refresh]");
        $ic138$ = makeKeyword("REMOVE-DEDUCTION");
        $ic139$ = makeString("[Remove Deduction]");
        $ic140$ = makeString("Argument was Overruled");
        $ic141$ = makeString("Conclusion :");
        $ic142$ = makeString("Mt : ");
        $ic143$ = makeString("Supported conclusion is invalid!");
        $ic144$ = makeString("Justification : ");
        $ic145$ = makeSymbol("S#45117", "CYC");
        $ic146$ = makeKeyword("CB-JUSTIFY");
        $ic147$ = makeString("cb-justify.html");
        $ic148$ = makeInteger(100);
        $ic149$ = makeString("Full justification for Assertion #~S");
        $ic150$ = makeString("Assertion Supported :");
        $ic151$ = makeSymbol("CB-JUSTIFY");
        $ic152$ = makeString("[Justify]");
        $ic153$ = makeString("cb-justify&~A");
        $ic154$ = makeKeyword("JUSTIFY");
        $ic155$ = makeSymbol("S#45094", "CYC");
        $ic156$ = makeString("Complete Justification for Assertion :");
        $ic157$ = makeString("Arguments Supporting Assertion :");
        $ic158$ = makeString("Argument : ");
        $ic159$ = makeString("Justified Above");
        $ic160$ = makeString("disc");
        $ic161$ = makeString("1");
        $ic162$ = makeString("Asserted locally");
        $ic163$ = makeString(" by ");
        $ic164$ = makeString(" on ");
        $ic165$ = makeString(" at ");
        $ic166$ = makeString(" for ");
        $ic167$ = makeKeyword("NONE");
        $ic168$ = makeKeyword("LEFT");
        $ic169$ = makeKeyword("TOP");
        $ic170$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#45118", "CYC"));
        $ic171$ = makeString("~A does not specify an HL support");
        $ic172$ = makeSymbol("CB-HL-SUPPORT");
        $ic173$ = makeSymbol("HL-SUPPORT-P");
        $ic174$ = makeSymbol("S#26605", "CYC");
        $ic175$ = makeString("cb-hl-support&~A&~A");
        $ic176$ = makeKeyword("HL-SUPPORT");
        $ic177$ = makeSymbol("S#45101", "CYC");
        $ic178$ = makeString("HL Support Detail");
        $ic179$ = makeKeyword("CB-HL-SUPPORT");
        $ic180$ = makeString("cb-hl-support.html");
        $ic181$ = makeKeyword("HL-SUPPORT-VALIDATE");
        $ic182$ = makeString("[Validate]");
        $ic183$ = makeKeyword("HL-SUPPORT-SIMILAR-QUERY");
        $ic184$ = makeString("[Query Similar]");
        $ic185$ = makeString("Unknown");
        $ic186$ = makeString("Module : ");
        $ic187$ = makeString("KB HL Support dependents: ");
        $ic188$ = makeString(" : ");
        $ic189$ = makeString("None available");
        $ic190$ = makeString("Nothing deeper available");
        $ic191$ = makeString("cb-hl-validate&~A&~A");
        $ic192$ = makeSymbol("S#45110", "CYC");
        $ic193$ = makeString("The hl-support is not available.");
        $ic194$ = makeSymbol("CB-HL-VALIDATE");
        $ic195$ = makeString("cb-hl-support-similar-query&~A");
        $ic196$ = makeSymbol("S#45111", "CYC");
        $ic197$ = makeSymbol("CB-HL-SUPPORT-SIMILAR-QUERY");
        $ic198$ = makeString("~A does not specify an HL clause-struc");
        $ic199$ = makeSymbol("CB-CLAUSE-STRUC");
        $ic200$ = makeSymbol("S#13957", "CYC");
        $ic201$ = makeString("cb-clause-struc&~A");
        $ic202$ = makeString("CLAUSE-STRUC #~S");
        $ic203$ = makeKeyword("CLAUSE-STRUC");
        $ic204$ = makeSymbol("S#45112", "CYC");
        $ic205$ = makeSymbol("S#45113", "CYC");
        $ic206$ = makeKeyword("CB-CLAUSE-STRUC");
        $ic207$ = makeString("cb-clause-struc.html");
        $ic208$ = makeString("Clause Struc #~S");
        $ic209$ = makeString("CNF clause : ");
        $ic210$ = makeString("Assertions using this clause : ");
        $ic211$ = makeString("((");
        $ic212$ = makeString(")");
        $ic213$ = makeString("(");
        $ic214$ = makeString("))");
        $ic215$ = makeString("assertion-id");
        $ic216$ = makeString("sentence");
        $ic217$ = makeString("sentence-type");
        $ic218$ = makeString("question");
        $ic219$ = makeString("question-type");
        $ic220$ = makeSymbol("CB-PROCESS-SUGGESTED-ENGLISH");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1377 ms
	
	Decompiled with Procyon 0.5.32.
*/