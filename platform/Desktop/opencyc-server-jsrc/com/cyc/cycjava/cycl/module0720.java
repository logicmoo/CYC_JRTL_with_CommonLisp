package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0720 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0720";
    public static final String myFingerPrint = "136f77b02f0ba0757713e09a05d9db7a12dced47318f4fc8c58b6b4714cd8dae";
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
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
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLList $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLList $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLList $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLList $ic133$;
    private static final SubLString $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLList $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    
    public static SubLObject f44142() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0720.$ic2$;
        final SubLObject var3 = module0015.$g538$.currentBinding(var1);
        try {
            module0015.$g538$.bind((module0720.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var1))) ? module0015.$g538$.getDynamicValue(var1) : module0057.f4173((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED), var1);
            module0642.f39020((SubLObject)module0720.$ic3$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var1), module0655.$g5142$.getDynamicValue(var1));
            final SubLObject var4 = module0014.f672((SubLObject)module0720.$ic4$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            if (module0720.NIL != var4) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020(var4);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
            module0016.f941();
            if (module0720.NIL != var2) {
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var2);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0644.f39213();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            final SubLObject var3_5 = module0015.$g535$.currentBinding(var1);
            try {
                module0015.$g535$.bind((SubLObject)module0720.T, var1);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0720.NIL != module0015.$g132$.getDynamicValue(var1)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var1)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020((SubLObject)module0720.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                final SubLObject var3_6 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0720.T, var1);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_7 = module0015.$g533$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var1);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019((SubLObject)module0720.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_7, var1);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0720.NIL != var2) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019(var2);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    module0016.f892();
                    module0016.f895();
                    final SubLObject var5 = module0656.f39832((SubLObject)module0720.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var1));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    if (module0720.NIL != var5) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(var5);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_8 = module0015.$g533$.currentBinding(var1);
                    final SubLObject var6 = module0015.$g541$.currentBinding(var1);
                    final SubLObject var7 = module0015.$g539$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var1);
                        module0015.$g541$.bind((SubLObject)module0720.T, var1);
                        module0015.$g539$.bind(module0015.f797(), var1);
                        module0642.f39069((SubLObject)module0720.$ic15$, (SubLObject)module0720.T, (SubLObject)module0720.UNPROVIDED);
                        module0656.f39870((SubLObject)module0720.$ic0$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39032((SubLObject)module0720.UNPROVIDED);
                        module0642.f39073((SubLObject)module0720.$ic16$);
                        module0642.f39032((SubLObject)module0720.UNPROVIDED);
                        module0642.f39074((SubLObject)module0720.$ic17$, (SubLObject)module0720.$ic18$, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39051((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                        module0016.f920((SubLObject)module0720.$ic19$, (SubLObject)module0720.$ic20$, (SubLObject)module0720.$ic21$);
                        module0642.f39020(module0015.$g207$.getGlobalValue());
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0720.$ic22$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39020(module0015.$g208$.getGlobalValue());
                        module0642.f39026((SubLObject)module0720.UNPROVIDED);
                        final SubLObject var8 = (SubLObject)module0720.$ic23$;
                        module0016.f908((SubLObject)module0720.$ic19$, var8, (SubLObject)module0720.$ic24$);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic19$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                        final SubLObject var3_9 = module0015.$g533$.currentBinding(var1);
                        try {
                            module0015.$g533$.bind((SubLObject)module0720.T, var1);
                            module0657.f39992((SubLObject)module0720.NIL, (SubLObject)module0720.$ic25$);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_9, var1);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        module0642.f39029((SubLObject)module0720.UNPROVIDED);
                        module0642.f39026((SubLObject)module0720.UNPROVIDED);
                        module0657.f40017((SubLObject)module0720.NIL, (SubLObject)module0720.$ic26$);
                        module0642.f39026((SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0720.$ic27$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)module0720.UNPROVIDED);
                        module0642.f39074((SubLObject)module0720.$ic28$, (SubLObject)module0720.$ic29$, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39074((SubLObject)module0720.$ic30$, (SubLObject)module0720.$ic31$, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39074((SubLObject)module0720.$ic32$, (SubLObject)module0720.$ic33$, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39074((SubLObject)module0720.$ic34$, (SubLObject)module0720.$ic35$, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39074((SubLObject)module0720.$ic36$, (SubLObject)module0720.$ic37$, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39074((SubLObject)module0720.$ic38$, (SubLObject)module0720.$ic39$, (SubLObject)module0720.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var1));
                    }
                    finally {
                        module0015.$g539$.rebind(var7, var1);
                        module0015.$g541$.rebind(var6, var1);
                        module0015.$g533$.rebind(var3_8, var1);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0720.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_6, var1);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_5, var1);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var3, var1);
        }
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44143(final SubLObject var14, SubLObject var15) {
        if (var15 == module0720.UNPROVIDED) {
            var15 = (SubLObject)module0720.NIL;
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0720.NIL == var15) {
            var15 = (SubLObject)module0720.$ic40$;
        }
        assert module0720.NIL != oc_inference_datastructures_inference.f25275(var14) : var14;
        final SubLObject var17 = module0656.f39832((SubLObject)module0720.$ic42$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var16), (SubLObject)module0720.$ic43$, module0683.f41670(var14));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        if (module0720.NIL != var17) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020(var17);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
        final SubLObject var18 = module0015.$g533$.currentBinding(var16);
        try {
            module0015.$g533$.bind((SubLObject)module0720.T, var16);
            module0642.f39019(var15);
        }
        finally {
            module0015.$g533$.rebind(var18, var16);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44144(final SubLObject var17) {
        SubLObject var18 = (SubLObject)module0720.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var17, (SubLObject)module0720.$ic46$);
        var18 = var17.first();
        final SubLObject var19 = var17.rest();
        if (module0720.NIL != var19) {
            cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0720.$ic46$);
            return (SubLObject)module0720.NIL;
        }
        final SubLObject var20 = module0683.f41671(var18);
        if (module0720.NIL == oc_inference_datastructures_inference.f25275(var20)) {
            return module0656.f39789((SubLObject)module0720.$ic47$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        }
        return f44145(var20);
    }
    
    public static SubLObject f44145(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = (SubLObject)module0720.$ic49$;
        final SubLObject var17 = module0015.$g538$.currentBinding(var15);
        try {
            module0015.$g538$.bind((module0720.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var15))) ? module0015.$g538$.getDynamicValue(var15) : module0057.f4173((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED), var15);
            module0642.f39020((SubLObject)module0720.$ic3$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var15), module0655.$g5142$.getDynamicValue(var15));
            final SubLObject var18 = module0014.f672((SubLObject)module0720.$ic4$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            if (module0720.NIL != var18) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020(var18);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
            module0016.f941();
            if (module0720.NIL != var16) {
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var16);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            final SubLObject var3_21 = module0015.$g535$.currentBinding(var15);
            try {
                module0015.$g535$.bind((SubLObject)module0720.T, var15);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0720.NIL != module0015.$g132$.getDynamicValue(var15)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var15)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020((SubLObject)module0720.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                final SubLObject var3_22 = module0015.$g533$.currentBinding(var15);
                try {
                    module0015.$g533$.bind((SubLObject)module0720.T, var15);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_23 = module0015.$g533$.currentBinding(var15);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var15);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019((SubLObject)module0720.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_23, var15);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0720.NIL != var16) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019(var16);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    module0016.f892();
                    module0016.f895();
                    final SubLObject var19 = module0656.f39832((SubLObject)module0720.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var15));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    if (module0720.NIL != var19) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(var19);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_24 = module0015.$g533$.currentBinding(var15);
                    final SubLObject var20 = module0015.$g541$.currentBinding(var15);
                    final SubLObject var21 = module0015.$g539$.currentBinding(var15);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var15);
                        module0015.$g541$.bind((SubLObject)module0720.T, var15);
                        module0015.$g539$.bind(module0015.f797(), var15);
                        module0642.f39069((SubLObject)module0720.$ic15$, (SubLObject)module0720.T, (SubLObject)module0720.UNPROVIDED);
                        module0656.f39870((SubLObject)module0720.$ic0$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39069((SubLObject)module0720.$ic50$, module0683.f41670(var14), (SubLObject)module0720.UNPROVIDED);
                        module0642.f39032((SubLObject)module0720.UNPROVIDED);
                        f44146(var14, (SubLObject)module0720.$ic44$);
                        module0642.f39051((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0720.$ic27$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)module0720.UNPROVIDED);
                        SubLObject var22 = (SubLObject)module0720.$ic53$;
                        SubLObject var23 = (SubLObject)module0720.NIL;
                        var23 = var22.first();
                        while (module0720.NIL != var22) {
                            SubLObject var25;
                            final SubLObject var24 = var25 = var23;
                            SubLObject var26 = (SubLObject)module0720.NIL;
                            SubLObject var27 = (SubLObject)module0720.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0720.$ic51$);
                            var26 = var25.first();
                            var25 = var25.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)module0720.$ic51$);
                            var27 = var25.first();
                            var25 = var25.rest();
                            if (module0720.NIL == var25) {
                                module0656.f39837((SubLObject)module0720.$ic52$, var14, var26, var27, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                                module0642.f39032((SubLObject)module0720.TWO_INTEGER);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)module0720.$ic51$);
                            }
                            var22 = var22.rest();
                            var23 = var22.first();
                        }
                        module0642.f39051((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                        module0683.f41828(var14, (SubLObject)module0720.NIL);
                        module0015.f799(module0015.$g539$.getDynamicValue(var15));
                    }
                    finally {
                        module0015.$g539$.rebind(var21, var15);
                        module0015.$g541$.rebind(var20, var15);
                        module0015.$g533$.rebind(var3_24, var15);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0720.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_22, var15);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_21, var15);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var17, var15);
        }
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44146(final SubLObject var14, SubLObject var31) {
        if (var31 == module0720.UNPROVIDED) {
            var31 = (SubLObject)module0720.NIL;
        }
        if (module0720.NIL != var31) {
            module0642.f39032((SubLObject)module0720.FOUR_INTEGER);
            module0656.f39837(var31, var14, (SubLObject)module0720.$ic54$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        }
        module0642.f39026((SubLObject)module0720.UNPROVIDED);
        module0642.f39026((SubLObject)module0720.TWO_INTEGER);
        oc_cb_query_browser.f41964(var14, (SubLObject)module0720.UNPROVIDED);
        return var14;
    }
    
    public static SubLObject f44147(final SubLObject var17) {
        if (module0720.NIL != module0642.f39104((SubLObject)module0720.$ic18$, var17)) {
            return f44148(var17);
        }
        if (module0720.NIL != module0642.f39104((SubLObject)module0720.$ic29$, var17)) {
            return f44149(var17);
        }
        if (module0720.NIL != module0642.f39104((SubLObject)module0720.$ic31$, var17)) {
            return f44150(var17);
        }
        if (module0720.NIL != module0642.f39104((SubLObject)module0720.$ic33$, var17)) {
            return f44151(var17);
        }
        if (module0720.NIL != module0642.f39104((SubLObject)module0720.$ic35$, var17)) {
            return f44152(var17);
        }
        if (module0720.NIL != module0642.f39104((SubLObject)module0720.$ic37$, var17)) {
            return f44153(var17);
        }
        if (module0720.NIL != module0642.f39104((SubLObject)module0720.$ic39$, var17)) {
            return f44154(var17);
        }
        return module0656.f39789((SubLObject)module0720.$ic55$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
    }
    
    public static SubLObject f44155(final SubLObject var14, final SubLObject var29, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0656.f39832((SubLObject)module0720.$ic42$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var31), (SubLObject)module0720.$ic57$, new SubLObject[] { var29, var30, module0683.f41670(var14) });
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        if (module0720.NIL != var32) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020(var32);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
        final SubLObject var33 = module0015.$g533$.currentBinding(var31);
        try {
            module0015.$g533$.bind((SubLObject)module0720.T, var31);
            module0642.f39019(var30);
        }
        finally {
            module0015.$g533$.rebind(var33, var31);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44149(final SubLObject var17) {
        return f44156(var17);
    }
    
    public static SubLObject f44150(final SubLObject var17) {
        return f44157(var17);
    }
    
    public static SubLObject f44151(final SubLObject var17) {
        return f44158(var17);
    }
    
    public static SubLObject f44152(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        SubLObject var19 = (SubLObject)module0720.NIL;
        var18.resetMultipleValues();
        final SubLObject var20 = f44159(var17);
        final SubLObject var21 = var18.secondMultipleValue();
        final SubLObject var22 = var18.thirdMultipleValue();
        var18.resetMultipleValues();
        final SubLObject var23 = (SubLObject)((module0720.NIL != var22) ? var22 : ConsesLow.list(var20, var21));
        var19 = (SubLObject)ConsesLow.list((SubLObject)module0720.$ic62$, var23);
        return f44160(var19);
    }
    
    public static SubLObject f44153(final SubLObject var17) {
        return f44161(var17);
    }
    
    public static SubLObject f44154(final SubLObject var17) {
        return f44162(var17);
    }
    
    public static SubLObject f44163(final SubLObject var17) {
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44164(final SubLObject var17) {
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44148(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        var18.resetMultipleValues();
        final SubLObject var19 = f44159(var17);
        final SubLObject var20 = var18.secondMultipleValue();
        var18.resetMultipleValues();
        module0642.f39020((SubLObject)module0720.$ic3$);
        module0642.f39029((SubLObject)module0720.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)module0720.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0720.$ic68$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0016.f892();
        module0016.f895();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0720.UNPROVIDED);
        final SubLObject var21 = module0015.$g535$.currentBinding(var18);
        try {
            module0015.$g535$.bind((SubLObject)module0720.T, var18);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
            final SubLObject var3_36 = module0015.$g533$.currentBinding(var18);
            try {
                module0015.$g533$.bind((SubLObject)module0720.T, var18);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                final SubLObject var3_37 = module0015.$g533$.currentBinding(var18);
                final SubLObject var22 = module0015.$g541$.currentBinding(var18);
                final SubLObject var23 = module0015.$g539$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)module0720.T, var18);
                    module0015.$g541$.bind((SubLObject)module0720.T, var18);
                    module0015.$g539$.bind(module0015.f797(), var18);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)module0720.ONE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39019((SubLObject)module0720.$ic68$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)module0720.ONE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    module0016.f892();
                    module0016.f895();
                    module0683.f41800(var19, var20, (SubLObject)module0720.UNPROVIDED);
                    module0015.f799(module0015.$g539$.getDynamicValue(var18));
                }
                finally {
                    module0015.$g539$.rebind(var23, var18);
                    module0015.$g541$.rebind(var22, var18);
                    module0015.$g533$.rebind(var3_37, var18);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var3_36, var18);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var21, var18);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0720.UNPROVIDED);
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44156(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = (SubLObject)module0720.$ic69$;
        final SubLObject var20 = module0015.$g538$.currentBinding(var18);
        try {
            module0015.$g538$.bind((module0720.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED), var18);
            module0642.f39020((SubLObject)module0720.$ic3$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
            final SubLObject var21 = module0014.f672((SubLObject)module0720.$ic4$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            if (module0720.NIL != var21) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020(var21);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
            module0016.f941();
            if (module0720.NIL != var19) {
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var19);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            final SubLObject var3_38 = module0015.$g535$.currentBinding(var18);
            try {
                module0015.$g535$.bind((SubLObject)module0720.T, var18);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0720.NIL != module0015.$g132$.getDynamicValue(var18)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020((SubLObject)module0720.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                final SubLObject var3_39 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)module0720.T, var18);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_40 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var18);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019((SubLObject)module0720.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_40, var18);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0720.NIL != var19) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019(var19);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    final SubLObject var22 = module0656.f39832((SubLObject)module0720.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    if (module0720.NIL != var22) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(var22);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_41 = module0015.$g533$.currentBinding(var18);
                    final SubLObject var23 = module0015.$g541$.currentBinding(var18);
                    final SubLObject var24 = module0015.$g539$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var18);
                        module0015.$g541$.bind((SubLObject)module0720.T, var18);
                        module0015.$g539$.bind(module0015.f797(), var18);
                        module0642.f39069((SubLObject)module0720.$ic70$, (SubLObject)module0720.T, (SubLObject)module0720.UNPROVIDED);
                        f44165(var17);
                        f44166((SubLObject)module0720.$ic71$, (SubLObject)module0720.$ic72$, (SubLObject)module0720.$ic73$);
                        f44167((SubLObject)module0720.T, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                        f44168(var17);
                        module0015.f799(module0015.$g539$.getDynamicValue(var18));
                    }
                    finally {
                        module0015.$g539$.rebind(var24, var18);
                        module0015.$g541$.rebind(var23, var18);
                        module0015.$g533$.rebind(var3_41, var18);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0720.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_39, var18);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_38, var18);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var20, var18);
        }
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44169(final SubLObject var17) {
        return f44170(var17, (SubLObject)module0720.$ic73$);
    }
    
    public static SubLObject f44157(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = (SubLObject)module0720.$ic75$;
        final SubLObject var20 = module0015.$g538$.currentBinding(var18);
        try {
            module0015.$g538$.bind((module0720.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED), var18);
            module0642.f39020((SubLObject)module0720.$ic3$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
            final SubLObject var21 = module0014.f672((SubLObject)module0720.$ic4$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            if (module0720.NIL != var21) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020(var21);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
            module0016.f941();
            if (module0720.NIL != var19) {
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var19);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0644.f39213();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            final SubLObject var3_42 = module0015.$g535$.currentBinding(var18);
            try {
                module0015.$g535$.bind((SubLObject)module0720.T, var18);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0720.NIL != module0015.$g132$.getDynamicValue(var18)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020((SubLObject)module0720.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                final SubLObject var3_43 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)module0720.T, var18);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_44 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var18);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019((SubLObject)module0720.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_44, var18);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0720.NIL != var19) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019(var19);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    final SubLObject var22 = module0656.f39832((SubLObject)module0720.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    if (module0720.NIL != var22) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(var22);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_45 = module0015.$g533$.currentBinding(var18);
                    final SubLObject var23 = module0015.$g541$.currentBinding(var18);
                    final SubLObject var24 = module0015.$g539$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var18);
                        module0015.$g541$.bind((SubLObject)module0720.T, var18);
                        module0015.$g539$.bind(module0015.f797(), var18);
                        module0642.f39069((SubLObject)module0720.$ic76$, (SubLObject)module0720.T, (SubLObject)module0720.UNPROVIDED);
                        f44165(var17);
                        f44166((SubLObject)module0720.$ic77$, (SubLObject)module0720.$ic78$, (SubLObject)module0720.$ic79$);
                        f44167((SubLObject)module0720.NIL, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                        f44168(var17);
                        module0015.f799(module0015.$g539$.getDynamicValue(var18));
                    }
                    finally {
                        module0015.$g539$.rebind(var24, var18);
                        module0015.$g541$.rebind(var23, var18);
                        module0015.$g533$.rebind(var3_45, var18);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0720.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_43, var18);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_42, var18);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var20, var18);
        }
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44171(final SubLObject var17) {
        return f44170(var17, (SubLObject)module0720.$ic79$);
    }
    
    public static SubLObject f44158(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = (SubLObject)module0720.$ic81$;
        final SubLObject var20 = module0015.$g538$.currentBinding(var18);
        try {
            module0015.$g538$.bind((module0720.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED), var18);
            module0642.f39020((SubLObject)module0720.$ic3$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
            final SubLObject var21 = module0014.f672((SubLObject)module0720.$ic4$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            if (module0720.NIL != var21) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020(var21);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
            module0016.f941();
            if (module0720.NIL != var19) {
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var19);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0644.f39213();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            final SubLObject var3_46 = module0015.$g535$.currentBinding(var18);
            try {
                module0015.$g535$.bind((SubLObject)module0720.T, var18);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0720.NIL != module0015.$g132$.getDynamicValue(var18)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020((SubLObject)module0720.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                final SubLObject var3_47 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)module0720.T, var18);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_48 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var18);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019((SubLObject)module0720.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_48, var18);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0720.NIL != var19) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019(var19);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    final SubLObject var22 = module0656.f39832((SubLObject)module0720.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    if (module0720.NIL != var22) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(var22);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_49 = module0015.$g533$.currentBinding(var18);
                    final SubLObject var23 = module0015.$g541$.currentBinding(var18);
                    final SubLObject var24 = module0015.$g539$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var18);
                        module0015.$g541$.bind((SubLObject)module0720.T, var18);
                        module0015.$g539$.bind(module0015.f797(), var18);
                        module0642.f39069((SubLObject)module0720.$ic82$, (SubLObject)module0720.T, (SubLObject)module0720.UNPROVIDED);
                        f44165(var17);
                        f44166((SubLObject)module0720.$ic83$, (SubLObject)module0720.$ic84$, (SubLObject)module0720.$ic85$);
                        final SubLObject var25 = module0657.f40022(var17, (SubLObject)module0720.$ic86$);
                        final SubLObject var26 = module0642.f39104((SubLObject)module0720.$ic87$, var17);
                        final SubLObject var27 = (SubLObject)((module0720.NIL != module0038.f2653(var26)) ? module0674.f41209(var26) : module0720.NIL);
                        f44167((SubLObject)module0720.T, var25, var27, (SubLObject)module0720.UNPROVIDED);
                        f44168(var17);
                        module0015.f799(module0015.$g539$.getDynamicValue(var18));
                    }
                    finally {
                        module0015.$g539$.rebind(var24, var18);
                        module0015.$g541$.rebind(var23, var18);
                        module0015.$g533$.rebind(var3_49, var18);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0720.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_47, var18);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_46, var18);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var20, var18);
        }
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44172(final SubLObject var17) {
        return f44170(var17, (SubLObject)module0720.$ic85$);
    }
    
    public static SubLObject f44161(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = (SubLObject)module0720.$ic89$;
        final SubLObject var20 = module0015.$g538$.currentBinding(var18);
        try {
            module0015.$g538$.bind((module0720.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED), var18);
            module0642.f39020((SubLObject)module0720.$ic3$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
            final SubLObject var21 = module0014.f672((SubLObject)module0720.$ic4$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            if (module0720.NIL != var21) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020(var21);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
            module0016.f941();
            if (module0720.NIL != var19) {
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var19);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            final SubLObject var3_53 = module0015.$g535$.currentBinding(var18);
            try {
                module0015.$g535$.bind((SubLObject)module0720.T, var18);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0720.NIL != module0015.$g132$.getDynamicValue(var18)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020((SubLObject)module0720.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                final SubLObject var3_54 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)module0720.T, var18);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_55 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var18);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019((SubLObject)module0720.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_55, var18);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0720.NIL != var19) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019(var19);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    final SubLObject var22 = module0656.f39832((SubLObject)module0720.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    if (module0720.NIL != var22) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(var22);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_56 = module0015.$g533$.currentBinding(var18);
                    final SubLObject var23 = module0015.$g541$.currentBinding(var18);
                    final SubLObject var24 = module0015.$g539$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var18);
                        module0015.$g541$.bind((SubLObject)module0720.T, var18);
                        module0015.$g539$.bind(module0015.f797(), var18);
                        module0642.f39069((SubLObject)module0720.$ic90$, (SubLObject)module0720.T, (SubLObject)module0720.UNPROVIDED);
                        f44165(var17);
                        f44166((SubLObject)module0720.$ic91$, (SubLObject)module0720.$ic92$, (SubLObject)module0720.$ic93$);
                        f44167((SubLObject)module0720.NIL, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                        f44168(var17);
                        module0015.f799(module0015.$g539$.getDynamicValue(var18));
                    }
                    finally {
                        module0015.$g539$.rebind(var24, var18);
                        module0015.$g541$.rebind(var23, var18);
                        module0015.$g533$.rebind(var3_56, var18);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0720.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_54, var18);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_53, var18);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var20, var18);
        }
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44173(final SubLObject var17) {
        return f44170(var17, (SubLObject)module0720.$ic93$);
    }
    
    public static SubLObject f44162(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = (SubLObject)module0720.$ic95$;
        final SubLObject var20 = module0015.$g538$.currentBinding(var18);
        try {
            module0015.$g538$.bind((module0720.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED), var18);
            module0642.f39020((SubLObject)module0720.$ic3$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
            final SubLObject var21 = module0014.f672((SubLObject)module0720.$ic4$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            if (module0720.NIL != var21) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020(var21);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
            module0016.f941();
            if (module0720.NIL != var19) {
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var19);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0644.f39213();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            final SubLObject var3_57 = module0015.$g535$.currentBinding(var18);
            try {
                module0015.$g535$.bind((SubLObject)module0720.T, var18);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0720.NIL != module0015.$g132$.getDynamicValue(var18)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020((SubLObject)module0720.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                final SubLObject var3_58 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)module0720.T, var18);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_59 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var18);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019((SubLObject)module0720.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_59, var18);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0720.NIL != var19) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019(var19);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    final SubLObject var22 = module0656.f39832((SubLObject)module0720.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    if (module0720.NIL != var22) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(var22);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_60 = module0015.$g533$.currentBinding(var18);
                    final SubLObject var23 = module0015.$g541$.currentBinding(var18);
                    final SubLObject var24 = module0015.$g539$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var18);
                        module0015.$g541$.bind((SubLObject)module0720.T, var18);
                        module0015.$g539$.bind(module0015.f797(), var18);
                        module0642.f39069((SubLObject)module0720.$ic96$, (SubLObject)module0720.T, (SubLObject)module0720.UNPROVIDED);
                        f44165(var17);
                        f44166((SubLObject)module0720.$ic97$, (SubLObject)module0720.$ic98$, (SubLObject)module0720.$ic99$);
                        f44167((SubLObject)module0720.NIL, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                        f44168(var17);
                        module0015.f799(module0015.$g539$.getDynamicValue(var18));
                    }
                    finally {
                        module0015.$g539$.rebind(var24, var18);
                        module0015.$g541$.rebind(var23, var18);
                        module0015.$g533$.rebind(var3_60, var18);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0720.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_58, var18);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_57, var18);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var20, var18);
        }
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44174(final SubLObject var17) {
        return f44170(var17, (SubLObject)module0720.$ic99$);
    }
    
    public static SubLObject f44170(final SubLObject var17, final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        final SubLObject var63 = f44175(var17);
        SubLObject var64 = (SubLObject)module0720.NIL;
        SubLObject var65 = (SubLObject)module0720.NIL;
        SubLObject var66 = (SubLObject)module0720.NIL;
        SubLObject var67 = (SubLObject)module0720.NIL;
        var62.resetMultipleValues();
        final SubLObject var65_66 = f44176(var17, (SubLObject)module0720.$ic101$);
        final SubLObject var67_68 = var62.secondMultipleValue();
        final SubLObject var69_70 = var62.thirdMultipleValue();
        var62.resetMultipleValues();
        var64 = var65_66;
        var65 = var67_68;
        var66 = var69_70;
        if (module0720.NIL != Strings.string_equal(var61, (SubLObject)module0720.$ic73$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED) || module0720.NIL != Strings.string_equal(var61, (SubLObject)module0720.$ic85$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
            var62.resetMultipleValues();
            final SubLObject var68 = module0674.f41203(var17, (SubLObject)module0720.UNPROVIDED);
            final SubLObject var69 = var62.secondMultipleValue();
            var62.resetMultipleValues();
            final SubLObject var70 = (SubLObject)((module0720.NIL != var66) ? ConsesLow.list(var64, var66, var68, var69) : ConsesLow.list(var64, var65, var68, var69));
            var67 = (SubLObject)ConsesLow.list(var61, var63, var70);
        }
        else if (module0720.NIL != Strings.string_equal(var61, (SubLObject)module0720.$ic79$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED) || module0720.NIL != Strings.string_equal(var61, (SubLObject)module0720.$ic93$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED) || module0720.NIL != Strings.string_equal(var61, (SubLObject)module0720.$ic99$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
            var67 = (SubLObject)((module0720.NIL != var66) ? ConsesLow.list(var61, var63, (SubLObject)ConsesLow.list(var64, var66)) : ConsesLow.list(var61, var63, (SubLObject)ConsesLow.list(var64, var65)));
        }
        return f44160(var67);
    }
    
    public static SubLObject f44176(final SubLObject var17, SubLObject var74) {
        if (var74 == module0720.UNPROVIDED) {
            var74 = (SubLObject)module0720.$ic101$;
        }
        final SubLThread var75 = SubLProcess.currentSubLThread();
        final SubLObject var76 = Sequences.cconcatenate(var74, (SubLObject)module0720.$ic102$);
        final SubLObject var77 = Sequences.cconcatenate(var74, (SubLObject)module0720.$ic103$);
        var75.resetMultipleValues();
        final SubLObject var78 = module0657.f40003(var17, (SubLObject)module0720.NIL, (SubLObject)ConsesLow.listS((SubLObject)module0720.$ic104$, var77, (SubLObject)module0720.$ic105$));
        final SubLObject var79 = var75.secondMultipleValue();
        final SubLObject var80 = var75.thirdMultipleValue();
        var75.resetMultipleValues();
        if (module0720.NIL != var79) {
            return module0657.f40013(var79, var80);
        }
        var75.resetMultipleValues();
        final SubLObject var81 = module0657.f40022(var17, (SubLObject)ConsesLow.list((SubLObject)module0720.$ic104$, var76));
        final SubLObject var82 = var75.secondMultipleValue();
        final SubLObject var83 = var75.thirdMultipleValue();
        var75.resetMultipleValues();
        if (module0720.NIL != var82) {
            return module0657.f40031(var82, var83, (SubLObject)module0720.UNPROVIDED);
        }
        final SubLObject var84 = module0656.f39943(module0642.f39104(var77, var17), (SubLObject)module0720.UNPROVIDED);
        return Values.values(var81, var78, var84);
    }
    
    public static SubLObject f44175(final SubLObject var17) {
        final SubLObject var18 = module0642.f39104((SubLObject)module0720.$ic50$, var17);
        if (module0720.NIL != var18) {
            return module0683.f41671(var18);
        }
        return (SubLObject)ConsesLow.list(reader.read_from_string_ignoring_errors(module0642.f39104((SubLObject)module0720.$ic106$, var17), (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED), module0674.f41209(module0642.f39104((SubLObject)module0720.$ic107$, var17)));
    }
    
    public static SubLObject f44160(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = conses_high.second(var32);
        SubLObject var35 = (SubLObject)module0720.NIL;
        SubLObject var36 = (SubLObject)module0720.NIL;
        SubLObject var37 = (SubLObject)module0720.NIL;
        SubLObject var38 = (SubLObject)module0720.NIL;
        if (module0720.NIL != oc_inference_datastructures_inference.f25275(var34)) {
            final SubLObject var39 = var34;
            var37 = oc_inference_datastructures_inference.f25423(var39);
            var38 = oc_inference_datastructures_inference.f25424(var39);
            var35 = module0409.f28530(var39);
            var36 = oc_inference_datastructures_inference.f25433(var39);
        }
        else {
            var37 = var34.first();
            var38 = conses_high.second(var34);
            var33.resetMultipleValues();
            final SubLObject var86_87 = module0409.f28506(var37, var38, (SubLObject)module0720.UNPROVIDED);
            final SubLObject var88_89 = var33.secondMultipleValue();
            var33.resetMultipleValues();
            var35 = var86_87;
            var36 = var88_89;
        }
        final SubLObject var40 = f44177(var35, var32, var36, var37, var38);
        if (module0720.NIL != var40) {
            f44178((SubLObject)ConsesLow.list(var40));
        }
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44177(final SubLObject var82, final SubLObject var32, final SubLObject var83, final SubLObject var91, final SubLObject var34) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        if (module0720.NIL != module0360.f23871(var83)) {
            oc_cb_query_browser.f41966(var83);
            return (SubLObject)module0720.NIL;
        }
        final SubLObject var93 = var32.first();
        final SubLObject var94 = conses_high.third(var32);
        SubLObject var95 = (SubLObject)module0720.NIL;
        SubLObject var96 = (SubLObject)module0720.NIL;
        SubLObject var97 = (SubLObject)module0720.NIL;
        SubLObject var98 = (SubLObject)module0720.NIL;
        SubLObject var99 = (SubLObject)module0720.NIL;
        SubLObject var100 = (SubLObject)module0720.NIL;
        var92.resetMultipleValues();
        final SubLObject var99_100 = f44179(var94);
        final SubLObject var101_102 = var92.secondMultipleValue();
        final SubLObject var103_104 = var92.thirdMultipleValue();
        final SubLObject var105_106 = var92.fourthMultipleValue();
        var92.resetMultipleValues();
        var95 = var99_100;
        var96 = var101_102;
        var97 = var103_104;
        var98 = var105_106;
        if (module0720.NIL != Strings.string_equal(var93, (SubLObject)module0720.$ic73$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED) || module0720.NIL != Strings.string_equal(var93, (SubLObject)module0720.$ic85$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
            if (module0720.NIL == var97) {
                var97 = (SubLObject)module0720.$ic108$;
            }
            if (module0720.NIL == var98) {
                if (module0720.NIL != module0202.f12925(var95)) {
                    var98 = (SubLObject)module0720.$ic109$;
                }
                else {
                    var98 = (SubLObject)module0720.$ic110$;
                }
            }
        }
        SubLObject var101 = var82;
        SubLObject var102 = (SubLObject)module0720.NIL;
        var102 = var101.first();
        while (module0720.NIL != var101) {
            SubLObject var103 = (SubLObject)module0720.NIL;
            SubLObject var104 = (SubLObject)module0720.NIL;
            SubLObject var105 = (SubLObject)module0720.NIL;
            SubLObject var106 = (SubLObject)module0720.NIL;
            var92.resetMultipleValues();
            final SubLObject var112_113 = f44180(var102, var95, var96, var93);
            final SubLObject var114_115 = var92.secondMultipleValue();
            var92.resetMultipleValues();
            var103 = var112_113;
            var104 = var114_115;
            if (module0720.NIL != Strings.string_equal(var93, (SubLObject)module0720.$ic62$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
                var105 = var103;
                var106 = (SubLObject)ConsesLow.list((SubLObject)module0720.$ic111$, var105);
                var99 = (SubLObject)ConsesLow.cons(var106, var99);
            }
            else if (module0720.NIL != Strings.string_equal(var93, (SubLObject)module0720.$ic73$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
                var106 = (SubLObject)ConsesLow.list((SubLObject)module0720.$ic112$, (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var103), (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var104), (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var97), (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var98));
                var99 = (SubLObject)ConsesLow.cons(var106, var99);
            }
            else if (module0720.NIL != Strings.string_equal(var93, (SubLObject)module0720.$ic79$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
                var106 = (SubLObject)ConsesLow.list((SubLObject)module0720.$ic114$, (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var103), (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var104));
                var99 = (SubLObject)ConsesLow.cons(var106, var99);
            }
            else if (module0720.NIL != Strings.string_equal(var93, (SubLObject)module0720.$ic85$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
                var92.resetMultipleValues();
                final SubLObject var107 = f44180(var102, var91, var34, var93);
                final SubLObject var108 = var92.secondMultipleValue();
                var92.resetMultipleValues();
                var106 = (SubLObject)ConsesLow.list((SubLObject)module0720.$ic114$, (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var107), (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var108));
                var99 = (SubLObject)ConsesLow.cons(var106, var99);
                var106 = (SubLObject)ConsesLow.list((SubLObject)module0720.$ic112$, (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var103), (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var104), (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var97), (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var98));
                var99 = (SubLObject)ConsesLow.cons(var106, var99);
            }
            else if (module0720.NIL != Strings.string_equal(var93, (SubLObject)module0720.$ic93$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
                var106 = (SubLObject)ConsesLow.list((SubLObject)module0720.$ic115$, (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var103), (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var104));
                var99 = (SubLObject)ConsesLow.cons(var106, var99);
            }
            else if (module0720.NIL != Strings.string_equal(var93, (SubLObject)module0720.$ic99$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED) && module0720.NIL != module0288.f19338(var103, var104)) {
                var106 = (SubLObject)ConsesLow.list((SubLObject)module0720.$ic116$, (SubLObject)ConsesLow.list((SubLObject)module0720.$ic117$, (SubLObject)ConsesLow.list((SubLObject)module0720.$ic113$, var103), var104));
                var99 = (SubLObject)ConsesLow.cons(var106, var99);
            }
            var101 = var101.rest();
            var102 = var101.first();
        }
        var99 = Sequences.nreverse(var99);
        var99 = module0035.f2269(var99, Symbols.symbol_function((SubLObject)module0720.EQUAL), (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        var100 = module0577.f35454((SubLObject)ConsesLow.list((SubLObject)module0720.$ic118$, module0111.$g1405$.getDynamicValue(var92), (SubLObject)module0720.$ic119$, (SubLObject)module0720.$ic120$, (SubLObject)module0720.$ic121$, (SubLObject)ConsesLow.list(var32, var99)));
        return module0577.f35439(var100);
    }
    
    public static SubLObject f44181(final SubLObject var32) {
        final SubLObject var33 = var32.first();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0720.$ic122$);
        module0642.f39019(Strings.string_capitalize(var33, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED));
        module0642.f39019((SubLObject)module0720.$ic123$);
        final SubLObject var34 = module0656.f39943(conses_high.second(conses_high.third(var32)), (SubLObject)module0720.UNPROVIDED);
        if (module0720.NIL != var34) {
            module0656.f39804(var34, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        }
        else {
            module0656.f39804(conses_high.second(conses_high.third(var32)), (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        }
        module0642.f39019((SubLObject)module0720.$ic124$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0720.UNPROVIDED);
        if (module0720.NIL != Strings.string_equal(var33, (SubLObject)module0720.$ic73$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
            return f44182(var32);
        }
        if (module0720.NIL != Strings.string_equal(var33, (SubLObject)module0720.$ic79$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
            return f44182(var32);
        }
        if (module0720.NIL != Strings.string_equal(var33, (SubLObject)module0720.$ic85$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
            return f44182(var32);
        }
        if (module0720.NIL != Strings.string_equal(var33, (SubLObject)module0720.$ic93$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
            return f44182(var32);
        }
        if (module0720.NIL != Strings.string_equal(var33, (SubLObject)module0720.$ic99$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
            return f44182(var32);
        }
        return module0656.f39789((SubLObject)module0720.$ic125$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
    }
    
    public static SubLObject f44182(final SubLObject var32) {
        final SubLObject var33 = conses_high.third(var32).first();
        module0656.f39804(var33, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        module0642.f39026((SubLObject)module0720.UNPROVIDED);
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44183(final SubLObject var118) {
        final SubLObject var119 = module0577.f35456(var118);
        final SubLObject var120 = module0577.f35443(var119).first();
        final SubLObject var121 = var120.first();
        final SubLObject var122 = conses_high.second(module0577.f35443(var119));
        module0642.f39019((SubLObject)module0720.$ic127$);
        module0642.f39019(Sequences.length(var122));
        module0642.f39019((SubLObject)module0720.$ic128$);
        module0642.f39019(var121);
        module0642.f39019((SubLObject)module0720.$ic129$);
        if (module0720.NIL == Strings.string_equal(var121, (SubLObject)module0720.$ic62$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
            module0642.f39026((SubLObject)module0720.UNPROVIDED);
            module0656.f39804(conses_high.third(var120).first(), (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
            module0642.f39026((SubLObject)module0720.UNPROVIDED);
            module0642.f39019((SubLObject)module0720.$ic130$);
            module0656.f39804(conses_high.second(conses_high.third(var120)), (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        }
        module0642.f39026((SubLObject)module0720.UNPROVIDED);
        module0642.f39019((SubLObject)module0720.$ic131$);
        final SubLObject var123 = conses_high.second(var120);
        if (module0720.NIL != oc_inference_datastructures_inference.f25275(var123)) {
            final SubLObject var124 = var123;
            module0656.f39804(var124, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
            module0642.f39019((SubLObject)module0720.$ic132$);
            module0642.f39026((SubLObject)module0720.UNPROVIDED);
            module0656.f39804(oc_inference_datastructures_inference.f25423(var124), (SubLObject)module0720.ZERO_INTEGER, (SubLObject)module0720.T);
            module0642.f39026((SubLObject)module0720.UNPROVIDED);
            module0642.f39019((SubLObject)module0720.$ic130$);
            module0656.f39804(oc_inference_datastructures_inference.f25424(var124), (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        }
        else {
            SubLObject var126;
            final SubLObject var125 = var126 = var123;
            SubLObject var127 = (SubLObject)module0720.NIL;
            SubLObject var128 = (SubLObject)module0720.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var126, var125, (SubLObject)module0720.$ic133$);
            var127 = var126.first();
            var126 = var126.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var126, var125, (SubLObject)module0720.$ic133$);
            var128 = var126.first();
            var126 = var126.rest();
            if (module0720.NIL == var126) {
                module0642.f39019((SubLObject)module0720.$ic134$);
                module0642.f39026((SubLObject)module0720.UNPROVIDED);
                module0656.f39804(var127, (SubLObject)module0720.ZERO_INTEGER, (SubLObject)module0720.T);
                module0642.f39026((SubLObject)module0720.UNPROVIDED);
                module0642.f39019((SubLObject)module0720.$ic130$);
                module0656.f39804(var128, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var125, (SubLObject)module0720.$ic133$);
            }
        }
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44178(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = var17.first();
        final SubLObject var20 = module0577.f35456(var19);
        final SubLObject var21 = module0577.f35443(var20).first();
        final SubLObject var22 = conses_high.second(var21);
        final SubLObject var23 = (SubLObject)((module0720.NIL != oc_inference_datastructures_inference.f25275(var22)) ? var22 : module0720.NIL);
        final SubLObject var24 = (SubLObject)((module0720.NIL != oc_inference_datastructures_inference.f25275(var22)) ? module0720.NIL : var22.first());
        final SubLObject var25 = (SubLObject)((module0720.NIL != oc_inference_datastructures_inference.f25275(var22)) ? module0720.NIL : conses_high.second(var22));
        final SubLObject var26 = conses_high.second(module0577.f35443(var20));
        final SubLObject var27 = (SubLObject)module0720.$ic137$;
        final SubLObject var28 = module0015.$g538$.currentBinding(var18);
        try {
            module0015.$g538$.bind((module0720.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED), var18);
            module0642.f39020((SubLObject)module0720.$ic3$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
            final SubLObject var29 = module0014.f672((SubLObject)module0720.$ic4$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            if (module0720.NIL != var29) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020(var29);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
            module0016.f941();
            if (module0720.NIL != var27) {
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var27);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            final SubLObject var3_123 = module0015.$g535$.currentBinding(var18);
            try {
                module0015.$g535$.bind((SubLObject)module0720.T, var18);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0720.NIL != module0015.$g132$.getDynamicValue(var18)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020((SubLObject)module0720.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                final SubLObject var3_124 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)module0720.T, var18);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_125 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var18);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019((SubLObject)module0720.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_125, var18);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0720.NIL != var27) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019(var27);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    module0644.f39208();
                    final SubLObject var30 = module0656.f39832((SubLObject)module0720.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    if (module0720.NIL != var30) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(var30);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_126 = module0015.$g533$.currentBinding(var18);
                    final SubLObject var31 = module0015.$g541$.currentBinding(var18);
                    final SubLObject var32 = module0015.$g539$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var18);
                        module0015.$g541$.bind((SubLObject)module0720.T, var18);
                        module0015.$g539$.bind(module0015.f797(), var18);
                        module0642.f39069((SubLObject)module0720.$ic138$, (SubLObject)module0720.T, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39069((SubLObject)module0720.$ic139$, var19, (SubLObject)module0720.UNPROVIDED);
                        module0656.f39870((SubLObject)module0720.$ic135$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39026((SubLObject)module0720.UNPROVIDED);
                        if (module0720.NIL != var23) {
                            module0642.f39021((SubLObject)module0720.$ic140$);
                            oc_cb_query_browser.f41964(var23, (SubLObject)module0720.UNPROVIDED);
                        }
                        else {
                            module0683.f41820(var24, var25, (SubLObject)module0720.$ic141$);
                        }
                        module0642.f39051((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                        if (module0720.NIL == Strings.string_equal(var21.first(), (SubLObject)module0720.$ic62$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
                            f44181(var21);
                            module0642.f39051((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                        }
                        f44184(var26);
                        module0015.f799(module0015.$g539$.getDynamicValue(var18));
                    }
                    finally {
                        module0015.$g539$.rebind(var32, var18);
                        module0015.$g541$.rebind(var31, var18);
                        module0015.$g533$.rebind(var3_126, var18);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0720.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_124, var18);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_123, var18);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var28, var18);
        }
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44184(final SubLObject var120) {
        final SubLThread var121 = SubLProcess.currentSubLThread();
        SubLObject var122 = (SubLObject)module0720.MINUS_ONE_INTEGER;
        module0642.f39074((SubLObject)module0720.$ic143$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        module0642.f39026((SubLObject)module0720.TWO_INTEGER);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        module0642.f39020((SubLObject)module0720.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        module0642.f39020((SubLObject)module0720.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        module0642.f39020((SubLObject)module0720.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        module0642.f39020(module0015.$g358$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        module0642.f39020((SubLObject)module0720.$ic144$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
        final SubLObject var123 = module0015.$g533$.currentBinding(var121);
        try {
            module0015.$g533$.bind((SubLObject)module0720.T, var121);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
            final SubLObject var3_128 = module0015.$g533$.currentBinding(var121);
            try {
                module0015.$g533$.bind((SubLObject)module0720.T, var121);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                final SubLObject var3_129 = module0015.$g533$.currentBinding(var121);
                try {
                    module0015.$g533$.bind((SubLObject)module0720.T, var121);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0720.$ic145$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var3_129, var121);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                final SubLObject var3_130 = module0015.$g533$.currentBinding(var121);
                try {
                    module0015.$g533$.bind((SubLObject)module0720.T, var121);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    module0642.f39020(module0015.$g221$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic146$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_131 = module0015.$g533$.currentBinding(var121);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var121);
                        module0642.f39019((SubLObject)module0720.$ic147$);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_131, var121);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var3_130, var121);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var3_128, var121);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            SubLObject var124 = (SubLObject)module0720.NIL;
            if (module0720.NIL == module0655.$g5111$.getDynamicValue(var121)) {
                var124 = (SubLObject)module0720.$ic148$;
            }
            SubLObject var125 = (SubLObject)module0720.NIL;
            SubLObject var126 = (SubLObject)module0720.NIL;
            SubLObject var127 = (SubLObject)module0720.NIL;
            SubLObject var128 = (SubLObject)module0720.NIL;
            var126 = var120;
            var127 = var126.first();
            for (var128 = (SubLObject)module0720.ZERO_INTEGER; module0720.NIL != var126; var126 = var126.rest(), var127 = var126.first(), var128 = Numbers.add((SubLObject)module0720.ONE_INTEGER, var128)) {
                if (module0720.NIL != module0655.$g5111$.getDynamicValue(var121)) {
                    if (module0720.NIL != var125) {
                        var125 = (SubLObject)module0720.NIL;
                    }
                    else {
                        var125 = (SubLObject)module0720.T;
                    }
                    var124 = (SubLObject)((module0720.NIL != var125) ? module0720.$ic149$ : module0720.$ic148$);
                }
                var122 = Numbers.add(var122, (SubLObject)module0720.ONE_INTEGER);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                if (module0720.NIL != var124) {
                    module0642.f39020(module0015.$g366$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(var124);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                final SubLObject var3_132 = module0015.$g533$.currentBinding(var121);
                try {
                    module0015.$g533$.bind((SubLObject)module0720.T, var121);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0720.$ic150$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_133 = module0015.$g533$.currentBinding(var121);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var121);
                        module0642.f39068(var122, (SubLObject)module0720.T, (SubLObject)module0720.T, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_133, var121);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0720.$ic150$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_134 = module0015.$g533$.currentBinding(var121);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var121);
                        module0656.f39804(var127, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_134, var121);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var3_132, var121);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var123, var121);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        module0642.f39026((SubLObject)module0720.UNPROVIDED);
        module0644.f39209((SubLObject)module0720.$ic151$, (SubLObject)module0720.$ic152$, (SubLObject)module0720.$ic153$, (SubLObject)module0720.$ic154$);
        module0642.f39032((SubLObject)module0720.UNPROVIDED);
        module0644.f39209((SubLObject)module0720.$ic155$, (SubLObject)module0720.$ic152$, (SubLObject)module0720.$ic153$, (SubLObject)module0720.$ic156$);
        module0642.f39069((SubLObject)module0720.$ic157$, var122, (SubLObject)module0720.UNPROVIDED);
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44185(final SubLObject var17) {
        final SubLObject var18 = module0642.f39104((SubLObject)module0720.$ic157$, var17);
        final SubLObject var19 = reader.read_from_string(var18, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        final SubLObject var20 = module0642.f39104((SubLObject)module0720.$ic139$, var17);
        final SubLObject var21 = conses_high.second(module0577.f35443(module0577.f35456(var20)));
        SubLObject var22;
        for (var22 = (SubLObject)module0720.NIL, var22 = (SubLObject)module0720.ZERO_INTEGER; !var22.numG(var19); var22 = module0048.f_1X(var22)) {
            if (module0720.NIL != module0642.f39104(PrintLow.format((SubLObject)module0720.NIL, (SubLObject)module0720.$ic158$, var22), var17)) {
                Eval.eval(ConsesLow.nth(var22, var21));
            }
        }
        module0577.f35455(module0577.f35456(var20));
        module0656.f39793((SubLObject)module0720.$ic159$, (SubLObject)module0720.T);
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44179(final SubLObject var93) {
        SubLObject var94 = var93.first();
        final SubLObject var95 = conses_high.second(var93);
        SubLObject var96 = conses_high.third(var93);
        SubLObject var97 = conses_high.fourth(var93);
        if (var94.isString()) {
            var94 = reader.read_from_string(var94, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        }
        if (var96.isString()) {
            var96 = reader.read_from_string(var96, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        }
        if (var97.isString()) {
            var97 = reader.read_from_string(var97, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        }
        return Values.values(var94, var95, var96, var97);
    }
    
    public static SubLObject f44180(final SubLObject var107, final SubLObject var94, final SubLObject var85, final SubLObject var92) {
        SubLObject var108 = var94;
        SubLObject var109 = var85;
        SubLObject var110 = var107;
        SubLObject var111 = (SubLObject)module0720.NIL;
        var111 = var110.first();
        while (module0720.NIL != var110) {
            final SubLObject var112 = var111.rest();
            final SubLObject var113 = module0205.f13144(var112);
            final SubLObject var114 = var111.first();
            if (module0720.NIL != Strings.string_equal(var92, (SubLObject)module0720.$ic62$, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED)) {
                var108 = module0035.f2241(var113);
            }
            else {
                var109 = conses_high.subst(var113, var114, var109, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
                var108 = conses_high.subst(var113, var114, var108, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
            }
            var110 = var110.rest();
            var111 = var110.first();
        }
        return Values.values(var108, var109);
    }
    
    public static SubLObject f44165(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        var18.resetMultipleValues();
        final SubLObject var19 = f44159(var17);
        final SubLObject var20 = var18.secondMultipleValue();
        final SubLObject var21 = var18.thirdMultipleValue();
        var18.resetMultipleValues();
        if (module0720.NIL != var21) {
            module0642.f39069((SubLObject)module0720.$ic50$, module0683.f41670(var21), (SubLObject)module0720.UNPROVIDED);
            f44146(var21, (SubLObject)module0720.UNPROVIDED);
        }
        else {
            module0642.f39069((SubLObject)module0720.$ic106$, PrintLow.format((SubLObject)module0720.NIL, (SubLObject)module0720.$ic161$, var19), (SubLObject)module0720.UNPROVIDED);
            module0642.f39069((SubLObject)module0720.$ic107$, module0656.f39967(var20), (SubLObject)module0720.UNPROVIDED);
            module0683.f41820(var19, var20, (SubLObject)module0720.$ic141$);
        }
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44168(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        var18.resetMultipleValues();
        final SubLObject var19 = f44159(var17);
        final SubLObject var20 = var18.secondMultipleValue();
        final SubLObject var21 = var18.thirdMultipleValue();
        var18.resetMultipleValues();
        if (module0720.NIL != var21) {
            module0642.f39051((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
            module0683.f41828(var21, (SubLObject)module0720.NIL);
        }
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44166(final SubLObject var146, final SubLObject var147, final SubLObject var148) {
        module0642.f39051((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(var146);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39032((SubLObject)module0720.UNPROVIDED);
        module0642.f39074(var147, var148, (SubLObject)module0720.UNPROVIDED);
        module0642.f39026((SubLObject)module0720.UNPROVIDED);
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44167(final SubLObject var149, SubLObject var50, SubLObject var52, SubLObject var150) {
        if (var50 == module0720.UNPROVIDED) {
            var50 = (SubLObject)module0720.NIL;
        }
        if (var52 == module0720.UNPROVIDED) {
            var52 = (SubLObject)module0720.NIL;
        }
        if (var150 == module0720.UNPROVIDED) {
            var150 = (SubLObject)module0720.$ic101$;
        }
        module0642.f39026((SubLObject)module0720.UNPROVIDED);
        module0657.f39992(var52, (SubLObject)ConsesLow.listS((SubLObject)module0720.$ic104$, Sequences.cconcatenate(var150, (SubLObject)module0720.$ic103$), (SubLObject)module0720.$ic25$));
        if (module0720.NIL != var149) {
            module0674.f41206((SubLObject)module0720.$ic162$, (SubLObject)module0720.$ic163$, (SubLObject)module0720.UNPROVIDED);
        }
        else {
            module0642.f39026((SubLObject)module0720.UNPROVIDED);
        }
        module0657.f40017(var50, (SubLObject)ConsesLow.listS((SubLObject)module0720.$ic104$, Sequences.cconcatenate(var150, (SubLObject)module0720.$ic102$), (SubLObject)module0720.$ic164$));
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44186() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = (SubLObject)module0720.$ic165$;
        final SubLObject var3 = module0015.$g538$.currentBinding(var1);
        try {
            module0015.$g538$.bind((module0720.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var1))) ? module0015.$g538$.getDynamicValue(var1) : module0057.f4173((SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED), var1);
            module0642.f39020((SubLObject)module0720.$ic3$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var1), module0655.$g5142$.getDynamicValue(var1));
            final SubLObject var4 = module0014.f672((SubLObject)module0720.$ic4$);
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            if (module0720.NIL != var4) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020(var4);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39020((SubLObject)module0720.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
            module0016.f941();
            if (module0720.NIL != var2) {
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var2);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
            final SubLObject var3_151 = module0015.$g535$.currentBinding(var1);
            try {
                module0015.$g535$.bind((SubLObject)module0720.T, var1);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0720.NIL != module0015.$g132$.getDynamicValue(var1)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var1)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39020((SubLObject)module0720.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                final SubLObject var3_152 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0720.T, var1);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39020((SubLObject)module0720.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_153 = module0015.$g533$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var1);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020((SubLObject)module0720.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019((SubLObject)module0720.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_153, var1);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0720.NIL != var2) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39019(var2);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0720.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    final SubLObject var5 = (SubLObject)module0720.SIX_INTEGER;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (module0720.NIL != var5) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                        module0642.f39020(var5);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0720.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0720.UNPROVIDED);
                    final SubLObject var3_154 = module0015.$g533$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)module0720.T, var1);
                        module0642.f39019((SubLObject)module0720.$ic166$);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_154, var1);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39067();
                    module0642.f39067();
                    module0642.f39019((SubLObject)module0720.$ic167$);
                    module0642.f39067();
                    module0642.f39029((SubLObject)module0720.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_152, var1);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0720.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_151, var1);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0720.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var3, var1);
        }
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44159(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = module0642.f39104((SubLObject)module0720.$ic50$, var17);
        final SubLObject var20 = module0683.f41671(var19);
        if (module0720.NIL != var20) {
            return Values.values((SubLObject)module0720.NIL, (SubLObject)module0720.NIL, var20);
        }
        var18.resetMultipleValues();
        final SubLObject var21 = module0657.f40003(var17, (SubLObject)module0720.UNPROVIDED, (SubLObject)module0720.UNPROVIDED);
        final SubLObject var22 = var18.secondMultipleValue();
        final SubLObject var23 = var18.thirdMultipleValue();
        var18.resetMultipleValues();
        if (module0720.NIL != var22) {
            return module0657.f40013(var22, var23);
        }
        var18.resetMultipleValues();
        final SubLObject var24 = module0657.f40022(var17, (SubLObject)module0720.$ic86$);
        final SubLObject var25 = var18.secondMultipleValue();
        final SubLObject var26 = var18.thirdMultipleValue();
        var18.resetMultipleValues();
        if (module0720.NIL != var25) {
            return module0657.f40031(var25, var26, (SubLObject)module0720.UNPROVIDED);
        }
        return Values.values(var24, var21, (SubLObject)module0720.NIL);
    }
    
    public static SubLObject f44187() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44142", "S#48336", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44143", "S#48337", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44144", "CB-TOE-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44145", "S#48338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44146", "S#48339", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44147", "CB-HANDLE-TEMPLATE-OE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44155", "S#48340", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44149", "CB-TEMPLATE-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44150", "CB-TEMPLATE-UNASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44151", "CB-TEMPLATE-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44152", "CB-TEMPLATE-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44153", "CB-TEMPLATE-BLAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44154", "CB-TEMPLATE-REPROPAGATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44163", "CB-TEMPLATE-CHANGE-ASSERTION-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44164", "CB-TEMPLATE-MERGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44148", "S#48341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44156", "S#48342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44169", "CB-HANDLE-TEMPLATE-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44157", "S#48343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44171", "CB-HANDLE-TEMPLATE-UNASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44158", "S#48344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44172", "CB-HANDLE-TEMPLATE-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44161", "S#48345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44173", "CB-HANDLE-TEMPLATE-BLAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44162", "S#48346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44174", "CB-HANDLE-TEMPLATE-REPROPAGATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44170", "S#48347", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44176", "S#48348", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44175", "S#48349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44160", "S#48350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44177", "S#48351", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44181", "S#48352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44182", "S#48353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44183", "S#48354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44178", "CB-TOE-OPERATIONS-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44184", "S#48355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44185", "CB-TOE-OPERATIONS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44179", "S#48356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44180", "S#48357", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44165", "S#48358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44168", "S#48359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44166", "S#48360", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44167", "S#48361", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44186", "S#48362", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0720", "f44159", "S#48363", 1, 0, false);
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44188() {
        return (SubLObject)module0720.NIL;
    }
    
    public static SubLObject f44189() {
        Hashtables.sethash((SubLObject)module0720.$ic0$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0720.$ic1$, (SubLObject)module0720.NIL));
        module0656.f39840((SubLObject)module0720.$ic44$, (SubLObject)module0720.$ic45$, (SubLObject)module0720.TWO_INTEGER);
        module0015.f873((SubLObject)module0720.$ic48$);
        module0015.f873((SubLObject)module0720.$ic56$);
        module0656.f39840((SubLObject)module0720.$ic52$, (SubLObject)module0720.$ic58$, (SubLObject)module0720.THREE_INTEGER);
        module0015.f873((SubLObject)module0720.$ic59$);
        module0015.f873((SubLObject)module0720.$ic60$);
        module0015.f873((SubLObject)module0720.$ic61$);
        module0015.f873((SubLObject)module0720.$ic63$);
        module0015.f873((SubLObject)module0720.$ic64$);
        module0015.f873((SubLObject)module0720.$ic65$);
        module0015.f873((SubLObject)module0720.$ic66$);
        module0015.f873((SubLObject)module0720.$ic67$);
        module0015.f873((SubLObject)module0720.$ic74$);
        module0015.f873((SubLObject)module0720.$ic80$);
        module0015.f873((SubLObject)module0720.$ic88$);
        module0015.f873((SubLObject)module0720.$ic94$);
        module0015.f873((SubLObject)module0720.$ic100$);
        final SubLObject var156 = module0577.f35431((SubLObject)module0720.$ic126$);
        module0577.f35427(var156, (SubLObject)module0720.$ic120$);
        Hashtables.sethash(module0577.f35423(var156), module0577.$g4225$.getDynamicValue(), var156);
        Hashtables.sethash((SubLObject)module0720.$ic135$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0720.$ic136$, (SubLObject)module0720.NIL));
        module0015.f873((SubLObject)module0720.$ic142$);
        module0015.f873((SubLObject)module0720.$ic160$);
        return (SubLObject)module0720.NIL;
    }
    
    public void declareFunctions() {
        f44187();
    }
    
    public void initializeVariables() {
        f44188();
    }
    
    public void runTopLevelForms() {
        f44189();
    }
    
    static {
        me = (SubLFile)new module0720();
        $ic0$ = SubLObjectFactory.makeKeyword("CB-TOE");
        $ic1$ = SubLObjectFactory.makeString("cb-toe.html");
        $ic2$ = SubLObjectFactory.makeString("Template OE: Query Specification");
        $ic3$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic4$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic5$ = SubLObjectFactory.makeString("stylesheet");
        $ic6$ = SubLObjectFactory.makeString("text/css");
        $ic7$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic8$ = SubLObjectFactory.makeString("text/javascript");
        $ic9$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic10$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic11$ = SubLObjectFactory.makeString("button");
        $ic12$ = SubLObjectFactory.makeString("reload");
        $ic13$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic14$ = SubLObjectFactory.makeString("post");
        $ic15$ = SubLObjectFactory.makeString("cb-handle-template-oe");
        $ic16$ = SubLObjectFactory.makeString("Clear All Fields");
        $ic17$ = SubLObjectFactory.makeString("Run Query");
        $ic18$ = SubLObjectFactory.makeString("query-test");
        $ic19$ = SubLObjectFactory.makeString("cb-toe-parameters");
        $ic20$ = SubLObjectFactory.makeString("Show");
        $ic21$ = SubLObjectFactory.makeString("Hide");
        $ic22$ = SubLObjectFactory.makeString("Query Context");
        $ic23$ = SubLObjectFactory.makeKeyword("INVISIBLE");
        $ic24$ = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTIME-PSC-ALLOWED?"), (SubLObject)module0720.NIL);
        $ic26$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INPUT-NAME"), SubLObjectFactory.makeString("query-sentence"), SubLObjectFactory.makeKeyword("COMPLETE-LABEL"), SubLObjectFactory.makeString("Complete"), SubLObjectFactory.makeKeyword("CYCLIFY-LABEL"), SubLObjectFactory.makeString("Cyclify"), SubLObjectFactory.makeKeyword("CLEAR-LABEL"), SubLObjectFactory.makeString("Clear Sentence"), SubLObjectFactory.makeKeyword("HEIGHT"), module0720.TEN_INTEGER, SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeInteger(80) });
        $ic27$ = SubLObjectFactory.makeString("Available Templates:");
        $ic28$ = SubLObjectFactory.makeString("Assert");
        $ic29$ = SubLObjectFactory.makeString("template-assert");
        $ic30$ = SubLObjectFactory.makeString("Unassert");
        $ic31$ = SubLObjectFactory.makeString("template-unassert");
        $ic32$ = SubLObjectFactory.makeString("Edit");
        $ic33$ = SubLObjectFactory.makeString("template-edit");
        $ic34$ = SubLObjectFactory.makeString("Kill");
        $ic35$ = SubLObjectFactory.makeString("template-kill");
        $ic36$ = SubLObjectFactory.makeString("Blast");
        $ic37$ = SubLObjectFactory.makeString("template-blast");
        $ic38$ = SubLObjectFactory.makeString("Repropagate");
        $ic39$ = SubLObjectFactory.makeString("template-repropagate");
        $ic40$ = SubLObjectFactory.makeString("[Template OE]");
        $ic41$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic42$ = SubLObjectFactory.makeKeyword("SELF");
        $ic43$ = SubLObjectFactory.makeString("cb-toe-inference&~A");
        $ic44$ = SubLObjectFactory.makeKeyword("TEMPLATE-OE-INFERENCE");
        $ic45$ = SubLObjectFactory.makeSymbol("S#48337", "CYC");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48364", "CYC"));
        $ic47$ = SubLObjectFactory.makeString("That inference is no longer available.");
        $ic48$ = SubLObjectFactory.makeSymbol("CB-TOE-INFERENCE");
        $ic49$ = SubLObjectFactory.makeString("Template OE: Inference");
        $ic50$ = SubLObjectFactory.makeString("inference");
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1755", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1572", "CYC"));
        $ic52$ = SubLObjectFactory.makeKeyword("TEMPLATE-OE-INFERENCE-HANDLER");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template-assert"), (SubLObject)SubLObjectFactory.makeString("[Assert]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template-unassert"), (SubLObject)SubLObjectFactory.makeString("[Unassert]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template-edit"), (SubLObject)SubLObjectFactory.makeString("[Edit]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template-kill"), (SubLObject)SubLObjectFactory.makeString("[Kill]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template-blast"), (SubLObject)SubLObjectFactory.makeString("[Blast]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("template-repropagate"), (SubLObject)SubLObjectFactory.makeString("[Repropagate]")));
        $ic54$ = SubLObjectFactory.makeString("[Refresh]");
        $ic55$ = SubLObjectFactory.makeString("Submission was not understood.");
        $ic56$ = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-OE");
        $ic57$ = SubLObjectFactory.makeString("cb-handle-template-oe&~A=~A&inference=~A");
        $ic58$ = SubLObjectFactory.makeSymbol("S#48340", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("CB-TEMPLATE-ASSERT");
        $ic60$ = SubLObjectFactory.makeSymbol("CB-TEMPLATE-UNASSERT");
        $ic61$ = SubLObjectFactory.makeSymbol("CB-TEMPLATE-EDIT");
        $ic62$ = SubLObjectFactory.makeString("kill");
        $ic63$ = SubLObjectFactory.makeSymbol("CB-TEMPLATE-KILL");
        $ic64$ = SubLObjectFactory.makeSymbol("CB-TEMPLATE-BLAST");
        $ic65$ = SubLObjectFactory.makeSymbol("CB-TEMPLATE-REPROPAGATE");
        $ic66$ = SubLObjectFactory.makeSymbol("CB-TEMPLATE-CHANGE-ASSERTION-PROPERTIES");
        $ic67$ = SubLObjectFactory.makeSymbol("CB-TEMPLATE-MERGE");
        $ic68$ = SubLObjectFactory.makeString("Template OE: Query Results");
        $ic69$ = SubLObjectFactory.makeString("Template OE: Assert");
        $ic70$ = SubLObjectFactory.makeString("cb-handle-template-assert");
        $ic71$ = SubLObjectFactory.makeString("Assert Specification");
        $ic72$ = SubLObjectFactory.makeString("Run Template Assert");
        $ic73$ = SubLObjectFactory.makeString("assert");
        $ic74$ = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-ASSERT");
        $ic75$ = SubLObjectFactory.makeString("Template OE: Unassert");
        $ic76$ = SubLObjectFactory.makeString("cb-handle-template-unassert");
        $ic77$ = SubLObjectFactory.makeString("Unassert Specification");
        $ic78$ = SubLObjectFactory.makeString("Run Template Unassert");
        $ic79$ = SubLObjectFactory.makeString("unassert");
        $ic80$ = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-UNASSERT");
        $ic81$ = SubLObjectFactory.makeString("Template OE: Edit");
        $ic82$ = SubLObjectFactory.makeString("cb-handle-template-edit");
        $ic83$ = SubLObjectFactory.makeString("Edit Specification");
        $ic84$ = SubLObjectFactory.makeString("Run Template Edit");
        $ic85$ = SubLObjectFactory.makeString("edit");
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("query-sentence"));
        $ic87$ = SubLObjectFactory.makeString("mt-monad");
        $ic88$ = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-EDIT");
        $ic89$ = SubLObjectFactory.makeString("Template OE: Blast");
        $ic90$ = SubLObjectFactory.makeString("cb-handle-template-blast");
        $ic91$ = SubLObjectFactory.makeString("Blast Specification");
        $ic92$ = SubLObjectFactory.makeString("Run Template Blast");
        $ic93$ = SubLObjectFactory.makeString("blast");
        $ic94$ = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-BLAST");
        $ic95$ = SubLObjectFactory.makeString("Template OE: Repropagate");
        $ic96$ = SubLObjectFactory.makeString("cb-handle-template-repropagate");
        $ic97$ = SubLObjectFactory.makeString("Repropagate Specification");
        $ic98$ = SubLObjectFactory.makeString("Run Template Repropagate");
        $ic99$ = SubLObjectFactory.makeString("repropagate");
        $ic100$ = SubLObjectFactory.makeSymbol("CB-HANDLE-TEMPLATE-REPROPAGATE");
        $ic101$ = SubLObjectFactory.makeString("template");
        $ic102$ = SubLObjectFactory.makeString("-sentence");
        $ic103$ = SubLObjectFactory.makeString("-mt");
        $ic104$ = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $ic105$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-VARIABLE?"), (SubLObject)module0720.T);
        $ic106$ = SubLObjectFactory.makeString("query-spec");
        $ic107$ = SubLObjectFactory.makeString("query-mt");
        $ic108$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic109$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic110$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic111$ = SubLObjectFactory.makeSymbol("KE-KILL");
        $ic112$ = SubLObjectFactory.makeSymbol("KE-ASSERT");
        $ic113$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic114$ = SubLObjectFactory.makeSymbol("KE-UNASSERT");
        $ic115$ = SubLObjectFactory.makeSymbol("FI-BLAST");
        $ic116$ = SubLObjectFactory.makeSymbol("S#37039", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("FIND-ASSERTION-CYCL");
        $ic118$ = SubLObjectFactory.makeKeyword("CYCLIST");
        $ic119$ = SubLObjectFactory.makeKeyword("TYPE-KEY");
        $ic120$ = SubLObjectFactory.makeKeyword("TOE-OPERATIONS");
        $ic121$ = SubLObjectFactory.makeKeyword("DATA");
        $ic122$ = SubLObjectFactory.makeString("Current ");
        $ic123$ = SubLObjectFactory.makeString(" Template in ");
        $ic124$ = SubLObjectFactory.makeString(" :");
        $ic125$ = SubLObjectFactory.makeString("Submission was not understood");
        $ic126$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUMMARY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("S#48354", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-TOE-OPERATIONS-DISPLAY"), (SubLObject)SubLObjectFactory.makeKeyword("HANDLER-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-TOE-OPERATIONS-HANDLER"));
        $ic127$ = SubLObjectFactory.makeString("Evaluate ");
        $ic128$ = SubLObjectFactory.makeString(" forms from ");
        $ic129$ = SubLObjectFactory.makeString(" template ");
        $ic130$ = SubLObjectFactory.makeString(" in ");
        $ic131$ = SubLObjectFactory.makeString(" with bindings from ");
        $ic132$ = SubLObjectFactory.makeString(" with query");
        $ic133$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9148", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic134$ = SubLObjectFactory.makeString("query ");
        $ic135$ = SubLObjectFactory.makeKeyword("CB-TOE-TEMPLATE-RESULTS");
        $ic136$ = SubLObjectFactory.makeString("cb-toe-template-results.html");
        $ic137$ = SubLObjectFactory.makeString("Template OE: Resulting Forms");
        $ic138$ = SubLObjectFactory.makeString("cb-toe-operations-handler");
        $ic139$ = SubLObjectFactory.makeString("id-string");
        $ic140$ = SubLObjectFactory.makeString("Current Inference : ");
        $ic141$ = SubLObjectFactory.makeString("Current query");
        $ic142$ = SubLObjectFactory.makeSymbol("CB-TOE-OPERATIONS-DISPLAY");
        $ic143$ = SubLObjectFactory.makeString("Add Forms to Agenda");
        $ic144$ = SubLObjectFactory.makeString("100%");
        $ic145$ = SubLObjectFactory.makeString("OK?");
        $ic146$ = SubLObjectFactory.makeString("+2");
        $ic147$ = SubLObjectFactory.makeString("Operations:");
        $ic148$ = SubLObjectFactory.makeString("#cccccc");
        $ic149$ = SubLObjectFactory.makeString("#dddddd");
        $ic150$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic151$ = SubLObjectFactory.makeString("[Check All]");
        $ic152$ = SubLObjectFactory.makeString("this.document.forms[0]");
        $ic153$ = SubLObjectFactory.makeString(".*");
        $ic154$ = SubLObjectFactory.makeString("T");
        $ic155$ = SubLObjectFactory.makeString("[Uncheck All]");
        $ic156$ = SubLObjectFactory.makeString("NIL");
        $ic157$ = SubLObjectFactory.makeString("boxes");
        $ic158$ = SubLObjectFactory.makeString("~A");
        $ic159$ = SubLObjectFactory.makeString("TOE: Forms Added to Agenda");
        $ic160$ = SubLObjectFactory.makeSymbol("CB-TOE-OPERATIONS-HANDLER");
        $ic161$ = SubLObjectFactory.makeString("~S");
        $ic162$ = SubLObjectFactory.makeString("strength");
        $ic163$ = SubLObjectFactory.makeString("direction");
        $ic164$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("COMPLETE-LABEL"), SubLObjectFactory.makeString("Complete"), SubLObjectFactory.makeKeyword("CYCLIFY-LABEL"), SubLObjectFactory.makeString("Cyclify"), SubLObjectFactory.makeKeyword("CLEAR-LABEL"), SubLObjectFactory.makeString("Clear Sentence"), SubLObjectFactory.makeKeyword("HEIGHT"), module0720.TEN_INTEGER, SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeInteger(80) });
        $ic165$ = SubLObjectFactory.makeString("Template OE: Error");
        $ic166$ = SubLObjectFactory.makeString("Cyc Error");
        $ic167$ = SubLObjectFactory.makeString("The Mt you have entered is invalid.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0720.class
	Total time: 933 ms
	
	Decompiled with Procyon 0.5.32.
*/