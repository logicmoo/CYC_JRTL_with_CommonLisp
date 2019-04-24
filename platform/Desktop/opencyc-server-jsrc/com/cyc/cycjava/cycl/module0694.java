package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
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

public final class module0694 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0694";
    public static final String myFingerPrint = "a68669d646a9e31202d4dfdc430ff763d246d212066a497a66f64033f93f707c";
    public static SubLSymbol $g5469$;
    public static SubLSymbol $g5470$;
    private static SubLSymbol $g5471$;
    private static SubLSymbol $g5472$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLInteger $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLInteger $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLInteger $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLObject $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLObject $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLList $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLString $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLList $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLObject $ic162$;
    
    public static SubLObject f42419(SubLObject var1) {
        if (var1 == module0694.UNPROVIDED) {
            var1 = (SubLObject)module0694.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0694.NIL != module0543.f33698()) {
            return module0667.f40583((SubLObject)module0694.$ic3$);
        }
        final SubLObject var3 = (SubLObject)module0694.$ic4$;
        final SubLObject var4 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0694.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0694.$ic5$);
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var5 = module0014.f672((SubLObject)module0694.$ic6$);
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020((SubLObject)module0694.$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            if (module0694.NIL != var5) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020(var5);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020((SubLObject)module0694.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
            module0016.f941();
            if (module0694.NIL != var3) {
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var3);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            final SubLObject var4_6 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0694.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0694.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020((SubLObject)module0694.$ic11$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                final SubLObject var4_7 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0694.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020((SubLObject)module0694.$ic12$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    final SubLObject var4_8 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0694.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019((SubLObject)module0694.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_8, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0694.NIL != var3) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    }
                    final SubLObject var6 = module0656.f39832((SubLObject)module0694.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020((SubLObject)module0694.$ic16$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    if (module0694.NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    final SubLObject var4_9 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0694.T, var2);
                        module0015.$g541$.bind((SubLObject)module0694.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069((SubLObject)module0694.$ic17$, (SubLObject)module0694.T, (SubLObject)module0694.UNPROVIDED);
                        module0656.f39870((SubLObject)module0694.$ic1$, (SubLObject)module0694.NIL, (SubLObject)module0694.UNPROVIDED);
                        module0656.f39790((SubLObject)module0694.$ic18$, (SubLObject)module0694.$ic19$);
                        module0642.f39032((SubLObject)module0694.UNPROVIDED);
                        module0642.f39073((SubLObject)module0694.$ic20$);
                        module0642.f39032((SubLObject)module0694.UNPROVIDED);
                        module0642.f39074((SubLObject)module0694.$ic21$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39046(module0015.$g348$.getGlobalValue());
                        module0642.f39046(module0015.$g349$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                        final SubLObject var4_10 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0694.T, var2);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0694.$ic22$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                            final SubLObject var4_11 = module0015.$g533$.currentBinding(var2);
                            try {
                                module0015.$g533$.bind((SubLObject)module0694.T, var2);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                                final SubLObject var4_12 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0694.T, var2);
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0694.$ic23$);
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                    module0644.f39184((SubLObject)module0694.$ic24$, (SubLObject)module0694.$ic25$);
                                    module0666.f40467((SubLObject)module0694.$ic24$, (SubLObject)module0694.$ic26$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39026((SubLObject)module0694.UNPROVIDED);
                                    module0642.f39075((SubLObject)module0694.$ic24$, (SubLObject)module0694.$ic27$, (SubLObject)module0694.$ic28$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_12, var2);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g372$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                                final SubLObject var4_13 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0694.T, var2);
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0656.f39804(module0694.$ic29$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39019((SubLObject)module0694.$ic30$);
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                    module0644.f39184((SubLObject)module0694.$ic31$, (SubLObject)module0694.$ic25$);
                                    module0642.f39026((SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020(module0015.$g336$.getGlobalValue());
                                    module0642.f39020(module0015.$g338$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0694.$ic31$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020(module0015.$g340$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0694.$ic28$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020(module0015.$g339$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0694.THREE_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                                    final SubLObject var4_14 = module0015.$g533$.currentBinding(var2);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0694.T, var2);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_14, var2);
                                    }
                                    module0642.f39020(module0015.$g337$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_13, var2);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_11, var2);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0694.$ic32$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                            final SubLObject var4_15 = module0015.$g533$.currentBinding(var2);
                            try {
                                module0015.$g533$.bind((SubLObject)module0694.T, var2);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                                final SubLObject var4_16 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0694.T, var2);
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0656.f39804(module0694.$ic33$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39019((SubLObject)module0694.$ic34$);
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                    module0644.f39184((SubLObject)module0694.$ic35$, (SubLObject)module0694.$ic25$);
                                    module0666.f40467((SubLObject)module0694.$ic35$, (SubLObject)module0694.$ic26$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_16, var2);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_15, var2);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0694.$ic22$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                            final SubLObject var4_17 = module0015.$g533$.currentBinding(var2);
                            try {
                                module0015.$g533$.bind((SubLObject)module0694.T, var2);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                                final SubLObject var4_18 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0694.T, var2);
                                    module0642.f39020(module0015.$g336$.getGlobalValue());
                                    module0642.f39020(module0015.$g338$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0694.$ic35$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020(module0015.$g340$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0694.$ic36$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020(module0015.$g339$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0694.TEN_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020(module0015.$g350$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0694.$ic37$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                                    final SubLObject var4_19 = module0015.$g533$.currentBinding(var2);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0694.T, var2);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_19, var2);
                                    }
                                    module0642.f39020(module0015.$g337$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_18, var2);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_17, var2);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0694.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_10, var2);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var2);
                        module0015.$g541$.rebind(var7, var2);
                        module0015.$g533$.rebind(var4_9, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0694.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_7, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_6, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var4, var2);
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42420(final SubLObject var1) {
        if (module0694.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0694.$ic39$);
            return (SubLObject)module0694.NIL;
        }
        final SubLObject var2 = module0038.f2735(module0642.f39104((SubLObject)module0694.$ic24$, var1));
        final SubLObject var3 = module0642.f39104((SubLObject)module0694.$ic35$, var1);
        final SubLObject var4 = module0642.f39104((SubLObject)module0694.$ic31$, var1);
        SubLObject var5 = (SubLObject)module0694.NIL;
        if (!var2.isString() || var2.equal((SubLObject)module0694.$ic27$)) {
            module0656.f39789((SubLObject)module0694.$ic40$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        }
        else if (module0694.NIL == module0126.f8389(var2)) {
            module0656.f39789((SubLObject)module0694.$ic41$, var2, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        }
        else {
            final SubLObject var6 = module0166.f10737(var2);
            if (module0694.NIL != var6) {
                return f42421(var6);
            }
        }
        if (!var3.isString() || var3.equal((SubLObject)module0694.$ic27$)) {
            module0656.f39789((SubLObject)module0694.$ic42$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        }
        if (var4.isString() && !var5.equal((SubLObject)module0694.$ic27$)) {
            var5 = f42422(var4);
        }
        final SubLObject var7 = f42423(var2, var3, var5);
        if (module0694.NIL != module0128.f8449(var7)) {
            module0677.f41359(var7);
            f42421(var7);
        }
        else {
            module0656.f39789((SubLObject)module0694.$ic43$, var2, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42424(SubLObject var29) {
        if (var29 == module0694.UNPROVIDED) {
            var29 = (SubLObject)module0694.NIL;
        }
        final SubLThread var30 = SubLProcess.currentSubLThread();
        if (module0694.NIL == var29) {
            var29 = (SubLObject)module0694.$ic4$;
        }
        final SubLObject var31 = module0656.f39832((SubLObject)module0694.$ic45$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0694.$ic46$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var30);
        try {
            module0015.$g533$.bind((SubLObject)module0694.T, var30);
            module0642.f39019(var29);
        }
        finally {
            module0015.$g533$.rebind(var32, var30);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42423(final SubLObject var23, SubLObject var24, SubLObject var26) {
        if (var24 == module0694.UNPROVIDED) {
            var24 = (SubLObject)module0694.NIL;
        }
        if (var26 == module0694.UNPROVIDED) {
            var26 = (SubLObject)module0694.NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        assert module0694.NIL != Types.stringp(var23) : var23;
        SubLObject var28 = (SubLObject)module0694.NIL;
        final SubLObject var29 = module0111.$g1406$.currentBinding(var27);
        try {
            module0111.$g1406$.bind((SubLObject)module0694.NIL, var27);
            var28 = module0543.f33618(var23);
            if (module0694.NIL != var28) {
                if (var24.isString()) {
                    module0543.f33628((SubLObject)ConsesLow.list(module0694.$ic33$, var28, var24), module0132.$g1569$.getGlobalValue(), (SubLObject)module0694.$ic52$, (SubLObject)module0694.$ic53$);
                }
                SubLObject var30 = var26;
                SubLObject var31 = (SubLObject)module0694.NIL;
                var31 = var30.first();
                while (module0694.NIL != var30) {
                    assert module0694.NIL != Types.stringp(var31) : var31;
                    module0543.f33628((SubLObject)ConsesLow.list(module0694.$ic29$, var28, var31), module0694.$ic54$, (SubLObject)module0694.$ic52$, (SubLObject)module0694.$ic53$);
                    var30 = var30.rest();
                    var31 = var30.first();
                }
            }
        }
        finally {
            module0111.$g1406$.rebind(var29, var27);
        }
        return var28;
    }
    
    public static SubLObject f42422(final SubLObject var33) {
        return Sequences.delete((SubLObject)module0694.$ic27$, f42425(var33, (SubLObject)module0694.ZERO_INTEGER), Symbols.symbol_function((SubLObject)module0694.EQUAL), (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
    }
    
    public static SubLObject f42425(final SubLObject var33, SubLObject var34) {
        if (var34 == module0694.UNPROVIDED) {
            var34 = (SubLObject)module0694.ZERO_INTEGER;
        }
        final SubLObject var35 = Sequences.position_if(Symbols.symbol_function((SubLObject)module0694.$ic55$), var33, Symbols.symbol_function((SubLObject)module0694.IDENTITY), var34, (SubLObject)module0694.UNPROVIDED);
        if (var35.isInteger()) {
            return (SubLObject)ConsesLow.cons(module0038.f2735(Sequences.subseq(var33, var34, var35)), f42425(var33, Numbers.add(var35, (SubLObject)module0694.ONE_INTEGER)));
        }
        return (SubLObject)ConsesLow.list(module0038.f2735(Sequences.subseq(var33, var34, (SubLObject)module0694.UNPROVIDED)));
    }
    
    public static SubLObject f42426(final SubLObject var36) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Characters.char_code(var36).numE((SubLObject)module0694.TEN_INTEGER) || Characters.char_code(var36).numE((SubLObject)module0694.THIRTEEN_INTEGER));
    }
    
    public static SubLObject f42427(final SubLObject var1) {
        final SubLObject var2 = var1.first();
        final SubLObject var3 = module0656.f39943(var1.first(), (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL == module0173.f10955(var3)) {
            module0656.f39789((SubLObject)module0694.$ic56$, var2, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
            return (SubLObject)module0694.NIL;
        }
        return f42421(var3);
    }
    
    public static SubLObject f42428(final SubLObject var39, SubLObject var29) {
        if (var29 == module0694.UNPROVIDED) {
            var29 = (SubLObject)module0694.NIL;
        }
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (module0694.NIL == var29) {
            var29 = (SubLObject)module0694.$ic58$;
        }
        final SubLObject var41 = module0656.f39832((SubLObject)module0694.$ic45$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var40), (SubLObject)module0694.$ic59$, module0656.f39842(var39));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL != var41) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020(var41);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
        final SubLObject var42 = module0015.$g533$.currentBinding(var40);
        try {
            module0015.$g533$.bind((SubLObject)module0694.T, var40);
            module0642.f39019(var29);
        }
        finally {
            module0015.$g533$.rebind(var42, var40);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42421(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        assert module0694.NIL != module0173.f10955(var39) : var39;
        final SubLObject var41 = module0132.$g1569$.getGlobalValue();
        final SubLObject var42 = (SubLObject)module0694.$ic58$;
        final SubLObject var43 = module0015.$g538$.currentBinding(var40);
        try {
            module0015.$g538$.bind((module0694.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var40))) ? module0015.$g538$.getDynamicValue(var40) : module0057.f4173((SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED), var40);
            module0642.f39020((SubLObject)module0694.$ic5$);
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var40), module0655.$g5142$.getDynamicValue(var40));
            final SubLObject var44 = module0014.f672((SubLObject)module0694.$ic6$);
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020((SubLObject)module0694.$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            if (module0694.NIL != var44) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020(var44);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020((SubLObject)module0694.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
            module0016.f941();
            if (module0694.NIL != var42) {
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var42);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            final SubLObject var4_41 = module0015.$g535$.currentBinding(var40);
            try {
                module0015.$g535$.bind((SubLObject)module0694.T, var40);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0694.NIL != module0015.$g132$.getDynamicValue(var40)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var40)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020((SubLObject)module0694.$ic11$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                final SubLObject var4_42 = module0015.$g533$.currentBinding(var40);
                try {
                    module0015.$g533$.bind((SubLObject)module0694.T, var40);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020((SubLObject)module0694.$ic12$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    final SubLObject var4_43 = module0015.$g533$.currentBinding(var40);
                    try {
                        module0015.$g533$.bind((SubLObject)module0694.T, var40);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019((SubLObject)module0694.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_43, var40);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0694.NIL != var42) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019(var42);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    }
                    final SubLObject var45 = module0656.f39832((SubLObject)module0694.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var40));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020((SubLObject)module0694.$ic16$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    if (module0694.NIL != var45) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(var45);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    final SubLObject var4_44 = module0015.$g533$.currentBinding(var40);
                    final SubLObject var46 = module0015.$g541$.currentBinding(var40);
                    final SubLObject var47 = module0015.$g539$.currentBinding(var40);
                    try {
                        module0015.$g533$.bind((SubLObject)module0694.T, var40);
                        module0015.$g541$.bind((SubLObject)module0694.T, var40);
                        module0015.$g539$.bind(module0015.f797(), var40);
                        module0642.f39069((SubLObject)module0694.$ic66$, (SubLObject)module0694.T, (SubLObject)module0694.UNPROVIDED);
                        module0656.f39870((SubLObject)module0694.$ic63$, (SubLObject)module0694.NIL, (SubLObject)module0694.UNPROVIDED);
                        module0656.f39790((SubLObject)module0694.$ic18$, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39032((SubLObject)module0694.UNPROVIDED);
                        module0642.f39073((SubLObject)module0694.$ic25$);
                        module0642.f39032((SubLObject)module0694.UNPROVIDED);
                        module0642.f39074((SubLObject)module0694.$ic67$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39026((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0694.$ic68$);
                        module0656.f39804(var39, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019((SubLObject)module0694.$ic69$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        SubLObject var48 = module0220.f14554(var39, module0694.$ic33$, module0132.$g1572$.getGlobalValue(), (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        if (module0694.NIL == var48) {
                            var48 = module0220.f14556(var39, module0694.$ic33$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        }
                        if (var48.isString()) {
                            module0642.f39026((SubLObject)module0694.UNPROVIDED);
                            module0669.f40716(var48);
                        }
                        module0642.f39026((SubLObject)module0694.UNPROVIDED);
                        module0642.f39069((SubLObject)module0694.$ic70$, module0656.f39842(var39), (SubLObject)module0694.UNPROVIDED);
                        module0642.f39026((SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0694.$ic71$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0644.f39184((SubLObject)module0694.$ic72$, (SubLObject)module0694.$ic25$);
                        module0642.f39026((SubLObject)module0694.UNPROVIDED);
                        module0666.f40467((SubLObject)module0694.$ic72$, (SubLObject)module0694.$ic26$, module0694.$ic73$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39075((SubLObject)module0694.$ic72$, (SubLObject)((module0694.NIL != var41) ? module0656.f39942(var41) : module0694.NIL), module0655.$g5135$.getDynamicValue(var40));
                        module0642.f39026((SubLObject)module0694.UNPROVIDED);
                        module0642.f39026((SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0694.$ic74$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0644.f39184((SubLObject)module0694.$ic75$, (SubLObject)module0694.$ic25$);
                        module0642.f39026((SubLObject)module0694.UNPROVIDED);
                        module0666.f40467((SubLObject)module0694.$ic75$, (SubLObject)module0694.$ic26$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        final SubLObject var49 = module0694.$g5470$.getDynamicValue(var40).first();
                        module0642.f39075((SubLObject)module0694.$ic75$, var49, (SubLObject)module0694.$ic76$);
                        module0642.f39026((SubLObject)module0694.UNPROVIDED);
                        module0642.f39026((SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0694.$ic77$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0644.f39184((SubLObject)module0694.$ic78$, (SubLObject)module0694.$ic25$);
                        module0642.f39026((SubLObject)module0694.UNPROVIDED);
                        module0666.f40467((SubLObject)module0694.$ic78$, (SubLObject)module0694.$ic26$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        final SubLObject var50 = conses_high.second(module0694.$g5470$.getDynamicValue(var40));
                        module0642.f39075((SubLObject)module0694.$ic78$, var50, (SubLObject)module0694.$ic76$);
                        module0642.f39026((SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0694.$ic79$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0644.f39184((SubLObject)module0694.$ic80$, (SubLObject)module0694.$ic25$);
                        module0642.f39026((SubLObject)module0694.UNPROVIDED);
                        module0666.f40467((SubLObject)module0694.$ic80$, (SubLObject)module0694.$ic26$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        final SubLObject var51 = conses_high.third(module0694.$g5470$.getDynamicValue(var40));
                        module0642.f39075((SubLObject)module0694.$ic80$, var51, (SubLObject)module0694.$ic76$);
                        module0015.f799(module0015.$g539$.getDynamicValue(var40));
                    }
                    finally {
                        module0015.$g539$.rebind(var47, var40);
                        module0015.$g541$.rebind(var46, var40);
                        module0015.$g533$.rebind(var4_44, var40);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0694.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_42, var40);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_41, var40);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var43, var40);
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42429(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39104((SubLObject)module0694.$ic70$, var1);
        final SubLObject var4 = module0642.f39104((SubLObject)module0694.$ic72$, var1);
        final SubLObject var5 = module0642.f39104((SubLObject)module0694.$ic75$, var1);
        final SubLObject var6 = module0642.f39104((SubLObject)module0694.$ic78$, var1);
        final SubLObject var7 = module0642.f39104((SubLObject)module0694.$ic81$, var1);
        SubLObject var8 = (SubLObject)module0694.NIL;
        SubLObject var9 = (SubLObject)module0694.NIL;
        SubLObject var10 = (SubLObject)module0694.NIL;
        SubLObject var11 = (SubLObject)module0694.NIL;
        SubLObject var12 = (SubLObject)module0694.NIL;
        var8 = module0656.f39943(var3, (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL == module0173.f10955(var8)) {
            module0656.f39789((SubLObject)module0694.$ic56$, var3, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
            return (SubLObject)module0694.NIL;
        }
        var9 = module0656.f39943(var4, (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL == module0173.f10955(var9) || module0694.NIL == module0259.f16891(var9, module0694.$ic73$)) {
            module0656.f39789((SubLObject)module0694.$ic82$, var4, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
            return (SubLObject)module0694.NIL;
        }
        if (var5.isString() && !module0694.$ic27$.equal(var5)) {
            var10 = module0656.f39943(var5, (SubLObject)module0694.UNPROVIDED);
            if (module0694.NIL == module0173.f10955(var10)) {
                module0656.f39789((SubLObject)module0694.$ic56$, var5, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                return (SubLObject)module0694.NIL;
            }
        }
        if (var6.isString() && !module0694.$ic27$.equal(var6)) {
            var11 = module0656.f39943(var6, (SubLObject)module0694.UNPROVIDED);
            if (module0694.NIL == module0173.f10955(var11)) {
                module0656.f39789((SubLObject)module0694.$ic56$, var6, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                return (SubLObject)module0694.NIL;
            }
        }
        if (var7.isString() && !module0694.$ic27$.equal(var7)) {
            var12 = module0656.f39943(var7, (SubLObject)module0694.UNPROVIDED);
            if (module0694.NIL == module0173.f10955(var12)) {
                module0656.f39789((SubLObject)module0694.$ic56$, var7, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                return (SubLObject)module0694.NIL;
            }
        }
        if (module0694.NIL == module0694.$g5470$.getDynamicValue(var2)) {
            module0694.$g5470$.setDynamicValue((SubLObject)ConsesLow.list((SubLObject)module0694.$ic27$, (SubLObject)module0694.$ic27$, (SubLObject)module0694.$ic27$), var2);
        }
        ConsesLow.set_nth((SubLObject)module0694.ZERO_INTEGER, module0694.$g5470$.getDynamicValue(var2), var5);
        ConsesLow.set_nth((SubLObject)module0694.ONE_INTEGER, module0694.$g5470$.getDynamicValue(var2), var6);
        ConsesLow.set_nth((SubLObject)module0694.TWO_INTEGER, module0694.$g5470$.getDynamicValue(var2), var7);
        if (module0694.NIL != var10) {
            f42430(var8, var10);
        }
        if (module0694.NIL != var11) {
            f42431(var8, var11);
        }
        if (module0694.NIL != var12) {
            f42432(var8, var12);
        }
        if (module0694.NIL != var10) {
            f42433(var8, var10);
        }
        else {
            f42434(var8);
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42430(final SubLObject var39, final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        assert module0694.NIL != module0173.f10955(var39) : var39;
        assert module0694.NIL != module0173.f10955(var53) : var53;
        final SubLObject var55 = module0111.$g1406$.currentBinding(var54);
        try {
            module0111.$g1406$.bind((SubLObject)module0694.NIL, var54);
            final SubLObject var4_56 = module0147.$g2094$.currentBinding(var54);
            final SubLObject var56 = module0147.$g2095$.currentBinding(var54);
            try {
                module0147.$g2094$.bind((SubLObject)module0694.$ic85$, var54);
                module0147.$g2095$.bind(module0694.$ic86$, var54);
                final SubLObject var57 = module0694.$ic87$;
                if (module0694.NIL != module0158.f10010(var53, (SubLObject)module0694.ONE_INTEGER, var57)) {
                    final SubLObject var58 = module0158.f10011(var53, (SubLObject)module0694.ONE_INTEGER, var57);
                    SubLObject var59 = (SubLObject)module0694.NIL;
                    final SubLObject var60 = (SubLObject)module0694.NIL;
                    while (module0694.NIL == var59) {
                        final SubLObject var61 = module0052.f3695(var58, var60);
                        final SubLObject var62 = (SubLObject)SubLObjectFactory.makeBoolean(!var60.eql(var61));
                        if (module0694.NIL != var62) {
                            SubLObject var63 = (SubLObject)module0694.NIL;
                            try {
                                var63 = module0158.f10316(var61, (SubLObject)module0694.$ic88$, (SubLObject)module0694.$ic89$, (SubLObject)module0694.NIL);
                                SubLObject var59_64 = (SubLObject)module0694.NIL;
                                final SubLObject var60_65 = (SubLObject)module0694.NIL;
                                while (module0694.NIL == var59_64) {
                                    final SubLObject var64 = module0052.f3695(var63, var60_65);
                                    final SubLObject var62_67 = (SubLObject)SubLObjectFactory.makeBoolean(!var60_65.eql(var64));
                                    if (module0694.NIL != var62_67 && module0694.NIL != module0178.f11375(var64)) {
                                        final SubLObject var65 = module0178.f11287(var64);
                                        final SubLObject var66 = module0178.f11335(var64);
                                        final SubLObject var67 = module0178.f11293(var64);
                                        module0543.f33628((SubLObject)ConsesLow.list(module0694.$ic87$, var39, var66), var65, var67, (SubLObject)module0694.$ic53$);
                                    }
                                    var59_64 = (SubLObject)SubLObjectFactory.makeBoolean(module0694.NIL == var62_67);
                                }
                            }
                            finally {
                                final SubLObject var4_57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var54);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0694.T, var54);
                                    if (module0694.NIL != var63) {
                                        module0158.f10319(var63);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var4_57, var54);
                                }
                            }
                        }
                        var59 = (SubLObject)SubLObjectFactory.makeBoolean(module0694.NIL == var62);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var56, var54);
                module0147.$g2094$.rebind(var4_56, var54);
            }
            SubLObject var68 = module0694.$g5471$.getGlobalValue();
            SubLObject var69 = (SubLObject)module0694.NIL;
            var69 = var68.first();
            while (module0694.NIL != var68) {
                final SubLObject var70 = var69.first();
                final SubLObject var4_58 = module0147.$g2094$.currentBinding(var54);
                final SubLObject var71 = module0147.$g2095$.currentBinding(var54);
                try {
                    module0147.$g2094$.bind((SubLObject)module0694.$ic85$, var54);
                    module0147.$g2095$.bind(module0694.$ic86$, var54);
                    final SubLObject var72 = var70;
                    if (module0694.NIL != module0158.f10010(var53, (SubLObject)module0694.ONE_INTEGER, var72)) {
                        final SubLObject var73 = module0158.f10011(var53, (SubLObject)module0694.ONE_INTEGER, var72);
                        SubLObject var74 = (SubLObject)module0694.NIL;
                        final SubLObject var75 = (SubLObject)module0694.NIL;
                        while (module0694.NIL == var74) {
                            final SubLObject var76 = module0052.f3695(var73, var75);
                            final SubLObject var77 = (SubLObject)SubLObjectFactory.makeBoolean(!var75.eql(var76));
                            if (module0694.NIL != var77) {
                                SubLObject var78 = (SubLObject)module0694.NIL;
                                try {
                                    var78 = module0158.f10316(var76, (SubLObject)module0694.$ic88$, (SubLObject)module0694.$ic89$, (SubLObject)module0694.NIL);
                                    SubLObject var59_65 = (SubLObject)module0694.NIL;
                                    final SubLObject var60_66 = (SubLObject)module0694.NIL;
                                    while (module0694.NIL == var59_65) {
                                        final SubLObject var79 = module0052.f3695(var78, var60_66);
                                        final SubLObject var62_68 = (SubLObject)SubLObjectFactory.makeBoolean(!var60_66.eql(var79));
                                        if (module0694.NIL != var62_68 && module0694.NIL != module0178.f11375(var79)) {
                                            final SubLObject var80 = module0178.f11287(var79);
                                            final SubLObject var81 = module0178.f11335(var79);
                                            final SubLObject var82 = module0178.f11293(var79);
                                            module0543.f33628((SubLObject)ConsesLow.list(var70, var39, var81), var80, var82, (SubLObject)module0694.$ic53$);
                                        }
                                        var59_65 = (SubLObject)SubLObjectFactory.makeBoolean(module0694.NIL == var62_68);
                                    }
                                }
                                finally {
                                    final SubLObject var4_59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var54);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0694.T, var54);
                                        if (module0694.NIL != var78) {
                                            module0158.f10319(var78);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var4_59, var54);
                                    }
                                }
                            }
                            var74 = (SubLObject)SubLObjectFactory.makeBoolean(module0694.NIL == var77);
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var71, var54);
                    module0147.$g2094$.rebind(var4_58, var54);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
        }
        finally {
            module0111.$g1406$.rebind(var55, var54);
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42431(final SubLObject var39, final SubLObject var79) {
        final SubLThread var80 = SubLProcess.currentSubLThread();
        assert module0694.NIL != module0173.f10955(var39) : var39;
        assert module0694.NIL != module0173.f10955(var79) : var79;
        final SubLObject var81 = module0111.$g1406$.currentBinding(var80);
        try {
            module0111.$g1406$.bind((SubLObject)module0694.NIL, var80);
            SubLObject var83;
            final SubLObject var82 = var83 = f42435(var79);
            SubLObject var84 = (SubLObject)module0694.NIL;
            var84 = var83.first();
            while (module0694.NIL != var83) {
                module0543.f33628((SubLObject)ConsesLow.list(module0694.$ic87$, var39, var79), var84, (SubLObject)module0694.$ic90$, (SubLObject)module0694.$ic53$);
                var83 = var83.rest();
                var84 = var83.first();
            }
        }
        finally {
            module0111.$g1406$.rebind(var81, var80);
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42435(final SubLObject var79) {
        final SubLObject var80 = module0217.f14228(var79, (SubLObject)module0694.ONE_INTEGER, module0694.$ic91$);
        final SubLObject var81 = module0262.f17367(var80, (SubLObject)module0694.UNPROVIDED);
        return var81;
    }
    
    public static SubLObject f42432(final SubLObject var39, final SubLObject var55) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        assert module0694.NIL != module0173.f10955(var39) : var39;
        assert module0694.NIL != module0173.f10955(var55) : var55;
        var56.resetMultipleValues();
        final SubLObject var57 = f42436(var55);
        final SubLObject var58 = var56.secondMultipleValue();
        var56.resetMultipleValues();
        if (module0694.NIL != var57) {
            final SubLObject var59 = module0111.$g1406$.currentBinding(var56);
            try {
                module0111.$g1406$.bind((SubLObject)module0694.NIL, var56);
                module0543.f33628((SubLObject)ConsesLow.list(module0694.$ic87$, var39, var58), module0132.$g1569$.getGlobalValue(), (SubLObject)module0694.$ic90$, (SubLObject)module0694.$ic53$);
                SubLObject var61;
                final SubLObject var60 = var61 = f42437(var55, var57, var58);
                SubLObject var62 = (SubLObject)module0694.NIL;
                var62 = var61.first();
                while (module0694.NIL != var61) {
                    module0543.f33628((SubLObject)ConsesLow.list(var57, var39, var55), var62, (SubLObject)module0694.$ic90$, (SubLObject)module0694.$ic53$);
                    var61 = var61.rest();
                    var62 = var61.first();
                }
            }
            finally {
                module0111.$g1406$.rebind(var59, var56);
            }
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42436(final SubLObject var55) {
        SubLObject var56 = module0694.$g5471$.getGlobalValue();
        SubLObject var57 = (SubLObject)module0694.NIL;
        var57 = var56.first();
        while (module0694.NIL != var56) {
            SubLObject var59;
            final SubLObject var58 = var59 = var57;
            SubLObject var60 = (SubLObject)module0694.NIL;
            SubLObject var61 = (SubLObject)module0694.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)module0694.$ic92$);
            var60 = var59.first();
            var59 = var59.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)module0694.$ic92$);
            var61 = var59.first();
            var59 = var59.rest();
            if (module0694.NIL == var59) {
                if (module0694.NIL != module0259.f16891(var55, var61)) {
                    return Values.values(var60, var61);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var58, (SubLObject)module0694.$ic92$);
            }
            var56 = var56.rest();
            var57 = var56.first();
        }
        return Values.values((SubLObject)module0694.NIL, (SubLObject)module0694.NIL);
    }
    
    public static SubLObject f42437(final SubLObject var55, final SubLObject var82, final SubLObject var79) {
        final SubLObject var83 = module0217.f14228(var55, (SubLObject)module0694.ONE_INTEGER, var82);
        final SubLObject var84 = module0262.f17367(var83, (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL != var84) {
            return var84;
        }
        return module0259.f16932(var55, var79, (SubLObject)module0694.UNPROVIDED);
    }
    
    public static SubLObject f42433(final SubLObject var39, final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        assert module0694.NIL != module0173.f10955(var39) : var39;
        assert module0694.NIL != module0173.f10955(var53) : var53;
        final SubLObject var55 = module0656.f39842(var53);
        final SubLObject var56 = (SubLObject)module0694.NIL;
        final SubLObject var57 = module0015.$g538$.currentBinding(var54);
        try {
            module0015.$g538$.bind((module0694.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var54))) ? module0015.$g538$.getDynamicValue(var54) : module0057.f4173((SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED), var54);
            module0642.f39020((SubLObject)module0694.$ic5$);
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var54), module0655.$g5142$.getDynamicValue(var54));
            final SubLObject var58 = module0014.f672((SubLObject)module0694.$ic6$);
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020((SubLObject)module0694.$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            if (module0694.NIL != var58) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020(var58);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020((SubLObject)module0694.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
            module0016.f941();
            if (module0694.NIL != var56) {
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var56);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            final SubLObject var4_86 = module0015.$g535$.currentBinding(var54);
            try {
                module0015.$g535$.bind((SubLObject)module0694.T, var54);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0694.NIL != module0015.$g132$.getDynamicValue(var54)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var54)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020((SubLObject)module0694.$ic11$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                final SubLObject var4_87 = module0015.$g533$.currentBinding(var54);
                try {
                    module0015.$g533$.bind((SubLObject)module0694.T, var54);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020((SubLObject)module0694.$ic12$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    final SubLObject var4_88 = module0015.$g533$.currentBinding(var54);
                    try {
                        module0015.$g533$.bind((SubLObject)module0694.T, var54);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019((SubLObject)module0694.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_88, var54);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0694.NIL != var56) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019(var56);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    }
                    final SubLObject var59 = module0656.f39832((SubLObject)module0694.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var54));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020((SubLObject)module0694.$ic16$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    if (module0694.NIL != var59) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(var59);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    final SubLObject var4_89 = module0015.$g533$.currentBinding(var54);
                    final SubLObject var60 = module0015.$g541$.currentBinding(var54);
                    final SubLObject var61 = module0015.$g539$.currentBinding(var54);
                    try {
                        module0015.$g533$.bind((SubLObject)module0694.T, var54);
                        module0015.$g541$.bind((SubLObject)module0694.T, var54);
                        module0015.$g539$.bind(module0015.f797(), var54);
                        module0642.f39069((SubLObject)module0694.$ic95$, var55, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.ONE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019((SubLObject)module0694.$ic96$);
                        module0656.f39804(var53, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019((SubLObject)module0694.$ic97$);
                        module0656.f39804(var39, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.ONE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                        module0656.f39870((SubLObject)module0694.$ic93$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39032((SubLObject)module0694.UNPROVIDED);
                        module0642.f39074((SubLObject)module0694.$ic98$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39026((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39051((SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0694.$ic99$);
                        module0656.f39804(var53, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019((SubLObject)module0694.$ic100$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39069((SubLObject)module0694.$ic75$, var55, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39069((SubLObject)module0694.$ic70$, module0656.f39842(var39), (SubLObject)module0694.UNPROVIDED);
                        module0642.f39026((SubLObject)module0694.TWO_INTEGER);
                        final SubLObject var4_90 = module0655.$g5134$.currentBinding(var54);
                        final SubLObject var11_91 = module0655.$g5126$.currentBinding(var54);
                        try {
                            module0655.$g5134$.bind((SubLObject)module0694.$ic101$, var54);
                            module0655.$g5126$.bind((SubLObject)module0694.NIL, var54);
                            module0660.f40185(var53);
                        }
                        finally {
                            module0655.$g5126$.rebind(var11_91, var54);
                            module0655.$g5134$.rebind(var4_90, var54);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var54));
                    }
                    finally {
                        module0015.$g539$.rebind(var61, var54);
                        module0015.$g541$.rebind(var60, var54);
                        module0015.$g533$.rebind(var4_89, var54);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0694.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_87, var54);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_86, var54);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var57, var54);
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42438(final SubLObject var1) {
        if (module0694.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0694.$ic102$);
            return (SubLObject)module0694.NIL;
        }
        final SubLObject var2 = module0642.f39104((SubLObject)module0694.$ic75$, var1);
        final SubLObject var3 = module0642.f39104((SubLObject)module0694.$ic70$, var1);
        SubLObject var4 = (SubLObject)module0694.NIL;
        SubLObject var5 = (SubLObject)module0694.NIL;
        if (!var2.isString() || var2.equal((SubLObject)module0694.$ic27$)) {
            return module0656.f39789((SubLObject)module0694.$ic103$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        }
        var4 = module0656.f39943(var2, (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL == module0173.f10955(var4)) {
            return module0656.f39789((SubLObject)module0694.$ic104$, var2, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        }
        if (!var3.isString() || var3.equal((SubLObject)module0694.$ic27$)) {
            return module0656.f39789((SubLObject)module0694.$ic105$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        }
        var5 = module0656.f39943(var3, (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL == module0173.f10955(var5)) {
            return module0656.f39789((SubLObject)module0694.$ic104$, var3, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        }
        if (module0694.NIL != module0128.f8449(var5)) {
            module0677.f41359(var5);
        }
        else if (module0694.NIL != module0167.f10813(var5)) {
            module0677.f41360(var5);
        }
        final SubLObject var6 = module0173.f10958(var4);
        final SubLObject var7 = module0173.f10958(var5);
        SubLObject var8 = conses_high.nthcdr((SubLObject)module0694.THREE_INTEGER, var1);
        SubLObject var9 = (SubLObject)module0694.NIL;
        var9 = var8.first();
        while (module0694.NIL != var8) {
            final SubLObject var10 = reader.read_from_string_ignoring_errors(var9.first(), (SubLObject)module0694.NIL, (SubLObject)module0694.NIL, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
            if (var10.isInteger()) {
                final SubLObject var11 = module0174.f11053(var10);
                if (module0694.NIL != module0174.f11035(var11)) {
                    SubLObject var12 = module0543.f33671(var11);
                    final SubLObject var13 = module0178.f11287(var11);
                    final SubLObject var14 = module0178.f11293(var11);
                    final SubLObject var15 = module0178.f11291(var11);
                    if (module0694.NIL != module0035.f2428(var6, var12, Symbols.symbol_function((SubLObject)module0694.EQUAL), (SubLObject)module0694.UNPROVIDED)) {
                        var12 = conses_high.subst(var7, var6, var12, Symbols.symbol_function((SubLObject)module0694.EQUAL), (SubLObject)module0694.UNPROVIDED);
                        module0543.f33628(var12, var13, var14, var15);
                    }
                }
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return f42434(var5);
    }
    
    public static SubLObject f42439(final SubLObject var99) {
        if (module0694.NIL != module0174.f11035(var99) && module0694.NIL != module0178.f11375(var99)) {
            final SubLObject var100 = module0174.f11025(var99);
            module0642.f39068(var100, (SubLObject)module0694.T, (SubLObject)module0694.NIL, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42440(final SubLObject var39) {
        final SubLObject var40 = (SubLObject)module0694.NIL;
        return var40;
    }
    
    public static SubLObject f42434(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (module0694.NIL != var39) {
            assert module0694.NIL != module0173.f10955(var39) : var39;
            f42441();
            SubLObject var41 = f42440(var39);
            SubLObject var42 = (SubLObject)module0694.NIL;
            final SubLObject var43 = module0147.$g2094$.currentBinding(var40);
            final SubLObject var44 = module0147.$g2095$.currentBinding(var40);
            try {
                module0147.$g2094$.bind((SubLObject)module0694.$ic85$, var40);
                module0147.$g2095$.bind(module0694.$ic86$, var40);
                var42 = module0487.f31960(var39, (SubLObject)module0694.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var44, var40);
                module0147.$g2094$.rebind(var43, var40);
            }
            var41 = conses_high.set_difference(var41, var42, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
            final SubLObject var45 = (SubLObject)module0694.$ic109$;
            final SubLObject var46 = module0015.$g538$.currentBinding(var40);
            try {
                module0015.$g538$.bind((module0694.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var40))) ? module0015.$g538$.getDynamicValue(var40) : module0057.f4173((SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED), var40);
                module0642.f39020((SubLObject)module0694.$ic5$);
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var40), module0655.$g5142$.getDynamicValue(var40));
                final SubLObject var47 = module0014.f672((SubLObject)module0694.$ic6$);
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020((SubLObject)module0694.$ic7$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                if (module0694.NIL != var47) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(var47);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020((SubLObject)module0694.$ic8$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                module0016.f941();
                if (module0694.NIL != var45) {
                    module0642.f39029((SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var45);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
                final SubLObject var4_105 = module0015.$g535$.currentBinding(var40);
                try {
                    module0015.$g535$.bind((SubLObject)module0694.T, var40);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0694.NIL != module0015.$g132$.getDynamicValue(var40)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var40)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020((SubLObject)module0694.$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    final SubLObject var4_106 = module0015.$g533$.currentBinding(var40);
                    try {
                        module0015.$g533$.bind((SubLObject)module0694.T, var40);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                        final SubLObject var4_107 = module0015.$g533$.currentBinding(var40);
                        try {
                            module0015.$g533$.bind((SubLObject)module0694.T, var40);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020((SubLObject)module0694.$ic13$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020((SubLObject)module0694.$ic14$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39019((SubLObject)module0694.$ic15$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_107, var40);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0694.NIL != var45) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39019(var45);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                        }
                        final SubLObject var48 = module0656.f39832((SubLObject)module0694.NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var40));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        if (module0694.NIL != var48) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(var48);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                        final SubLObject var4_108 = module0015.$g533$.currentBinding(var40);
                        final SubLObject var49 = module0015.$g541$.currentBinding(var40);
                        final SubLObject var50 = module0015.$g539$.currentBinding(var40);
                        try {
                            module0015.$g533$.bind((SubLObject)module0694.T, var40);
                            module0015.$g541$.bind((SubLObject)module0694.T, var40);
                            module0015.$g539$.bind(module0015.f797(), var40);
                            module0642.f39069((SubLObject)module0694.$ic110$, (SubLObject)module0694.T, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39069((SubLObject)module0694.$ic111$, module0656.f39842(var39), (SubLObject)module0694.UNPROVIDED);
                            module0656.f39870((SubLObject)module0694.$ic107$, (SubLObject)module0694.NIL, (SubLObject)module0694.UNPROVIDED);
                            module0656.f39790((SubLObject)module0694.$ic18$, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39073((SubLObject)module0694.$ic112$);
                            module0642.f39026((SubLObject)module0694.TWO_INTEGER);
                            module0642.f39020(module0015.$g207$.getGlobalValue());
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0694.$ic113$);
                            module0656.f39804(var39, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39020(module0015.$g208$.getGlobalValue());
                            module0642.f39026((SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0694.$ic114$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            if (module0694.NIL != var42) {
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0656.f39837((SubLObject)module0694.$ic115$, var39, (SubLObject)module0694.$ic116$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39026((SubLObject)module0694.TWO_INTEGER);
                                SubLObject var51 = var42;
                                SubLObject var52 = (SubLObject)module0694.NIL;
                                var52 = var51.first();
                                while (module0694.NIL != var51) {
                                    module0656.f39804(var52, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39032((SubLObject)module0694.TWO_INTEGER);
                                    var51 = var51.rest();
                                    var52 = var51.first();
                                }
                            }
                            else {
                                module0642.f39019((SubLObject)module0694.$ic117$);
                            }
                            module0642.f39051((SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0694.$ic118$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0694.UNPROVIDED);
                            module0666.f40467((SubLObject)module0694.$ic72$, (SubLObject)module0694.$ic26$, module0694.$ic73$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0694.$ic119$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39075((SubLObject)module0694.$ic72$, module0038.f2638(module0132.$g1568$.getGlobalValue()), (SubLObject)module0694.$ic76$);
                            module0642.f39067();
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0694.$ic120$);
                            module0656.f39804(var39, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39019((SubLObject)module0694.$ic121$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0694.UNPROVIDED);
                            module0666.f40467((SubLObject)module0694.$ic122$, (SubLObject)module0694.$ic26$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0694.$ic123$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39075((SubLObject)module0694.$ic122$, (SubLObject)module0694.NIL, (SubLObject)module0694.$ic76$);
                            module0642.f39026((SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0694.$ic124$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39020(module0015.$g346$.getGlobalValue());
                            module0642.f39046(module0015.$g348$.getGlobalValue());
                            module0642.f39020(module0015.$g352$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020((SubLObject)module0694.ZERO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0015.$g353$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020((SubLObject)module0694.ZERO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0015.$g354$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020((SubLObject)module0694.ZERO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                            final SubLObject var4_109 = module0015.$g533$.currentBinding(var40);
                            try {
                                module0015.$g533$.bind((SubLObject)module0694.T, var40);
                                while (module0694.NIL != var41) {
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                                    final SubLObject var4_110 = module0015.$g533$.currentBinding(var40);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0694.T, var40);
                                        var41 = f42442(var41);
                                        var41 = f42442(var41);
                                        var41 = f42442(var41);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_110, var40);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)module0694.UNPROVIDED);
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var4_109, var40);
                            }
                            module0642.f39020(module0015.$g347$.getGlobalValue());
                            module0642.f39026((SubLObject)module0694.UNPROVIDED);
                            module0642.f39074((SubLObject)module0694.$ic125$, (SubLObject)module0694.$ic126$, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39019((SubLObject)module0694.$ic127$);
                            module0656.f39804((SubLObject)ConsesLow.list(module0694.$ic128$, (SubLObject)module0694.$ic129$, var39), (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39019((SubLObject)module0694.$ic130$);
                            module0642.f39026((SubLObject)module0694.UNPROVIDED);
                            module0642.f39074((SubLObject)module0694.$ic131$, (SubLObject)module0694.$ic132$, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39019((SubLObject)module0694.$ic127$);
                            module0656.f39804((SubLObject)ConsesLow.listS(module0694.$ic128$, var39, (SubLObject)module0694.$ic133$), (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39019((SubLObject)module0694.$ic130$);
                            module0015.f799(module0015.$g539$.getDynamicValue(var40));
                        }
                        finally {
                            module0015.$g539$.rebind(var50, var40);
                            module0015.$g541$.rebind(var49, var40);
                            module0015.$g533$.rebind(var4_108, var40);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)module0694.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_106, var40);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0694.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var4_105, var40);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var46, var40);
            }
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42442(final SubLObject var103) {
        final SubLThread var104 = SubLProcess.currentSubLThread();
        if (module0694.NIL != var103) {
            final SubLObject var105 = var103.first();
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
            SubLObject var106 = module0015.$g533$.currentBinding(var104);
            try {
                module0015.$g533$.bind((SubLObject)module0694.T, var104);
                f42443(var105);
            }
            finally {
                module0015.$g533$.rebind(var106, var104);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
            var106 = module0015.$g533$.currentBinding(var104);
            try {
                module0015.$g533$.bind((SubLObject)module0694.T, var104);
                module0642.f39032((SubLObject)module0694.TWO_INTEGER);
            }
            finally {
                module0015.$g533$.rebind(var106, var104);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            return var103.rest();
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42444(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)module0694.$ic111$, var1);
        final SubLObject var3 = module0656.f39943(var2, (SubLObject)module0694.UNPROVIDED);
        final SubLObject var4 = module0642.f39104((SubLObject)module0694.$ic72$, var1);
        final SubLObject var5 = module0656.f39943(var4, (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL == module0173.f10955(var3)) {
            return module0656.f39789((SubLObject)module0694.$ic134$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        }
        if (module0694.NIL == module0173.f10955(var5)) {
            return module0656.f39789((SubLObject)module0694.$ic135$, var4, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        }
        final SubLObject var6 = module0642.f39104((SubLObject)module0694.$ic132$, var1);
        final SubLObject var7 = f42445(var1);
        final SubLObject var8 = (SubLObject)((module0694.NIL != var6) ? module0694.$ic53$ : module0694.$ic136$);
        return f42446(var3, var7, var5, var8);
    }
    
    public static SubLObject f42445(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)module0694.$ic122$, var1);
        SubLObject var3 = (SubLObject)module0694.NIL;
        SubLObject var4 = (SubLObject)module0694.NIL;
        if (module0694.NIL != var2) {
            if (!Sequences.length(var2).numE((SubLObject)module0694.ZERO_INTEGER)) {
                var3 = module0656.f39937(var2);
                if (module0694.NIL == module0173.f10955(var3)) {
                    return module0656.f39789((SubLObject)module0694.$ic104$, var2, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                }
                var4 = (SubLObject)ConsesLow.cons(var3, var4);
            }
        }
        SubLObject var5 = var1;
        SubLObject var6 = (SubLObject)module0694.NIL;
        var6 = var5.first();
        while (module0694.NIL != var5) {
            if (var6.isCons() && var6.first().equal((SubLObject)module0694.$ic138$)) {
                final SubLObject var7 = module0656.f39943(conses_high.second(var6), (SubLObject)module0694.UNPROVIDED);
                if (module0694.NIL != module0173.f10955(var7)) {
                    final SubLObject var8 = var7;
                    if (module0694.NIL == conses_high.member(var8, var4, Symbols.symbol_function((SubLObject)module0694.EQL), Symbols.symbol_function((SubLObject)module0694.IDENTITY))) {
                        var4 = (SubLObject)ConsesLow.cons(var8, var4);
                    }
                }
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        var4 = Sequences.nreverse(var4);
        return var4;
    }
    
    public static SubLObject f42446(final SubLObject var38, final SubLObject var103, final SubLObject var40, final SubLObject var101) {
        final SubLThread var104 = SubLProcess.currentSubLThread();
        SubLObject var105 = (SubLObject)module0694.NIL;
        SubLObject var106 = var103;
        SubLObject var107 = (SubLObject)module0694.NIL;
        var107 = var106.first();
        while (module0694.NIL != var106) {
            SubLObject var108 = (SubLObject)module0694.NIL;
            if (var101.eql((SubLObject)module0694.$ic53$)) {
                var108 = (SubLObject)ConsesLow.list(module0694.$ic128$, var38, var107);
            }
            else if (var101.eql((SubLObject)module0694.$ic136$)) {
                var108 = (SubLObject)ConsesLow.list(module0694.$ic128$, var107, var38);
            }
            if (module0694.NIL != var108) {
                var105 = (SubLObject)ConsesLow.cons(var108, var105);
                module0543.f33628(var108, var40, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
            }
            var106 = var106.rest();
            var107 = var106.first();
        }
        var105 = Sequences.nreverse(var105);
        final SubLObject var109 = (SubLObject)module0694.$ic139$;
        final SubLObject var110 = module0015.$g538$.currentBinding(var104);
        try {
            module0015.$g538$.bind((module0694.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var104))) ? module0015.$g538$.getDynamicValue(var104) : module0057.f4173((SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED), var104);
            module0642.f39020((SubLObject)module0694.$ic5$);
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var104), module0655.$g5142$.getDynamicValue(var104));
            final SubLObject var111 = module0014.f672((SubLObject)module0694.$ic6$);
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020((SubLObject)module0694.$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            if (module0694.NIL != var111) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020(var111);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020((SubLObject)module0694.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
            module0016.f941();
            if (module0694.NIL != var109) {
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var109);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            final SubLObject var4_122 = module0015.$g535$.currentBinding(var104);
            try {
                module0015.$g535$.bind((SubLObject)module0694.T, var104);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0694.NIL != module0015.$g132$.getDynamicValue(var104)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var104)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020((SubLObject)module0694.$ic11$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                final SubLObject var4_123 = module0015.$g533$.currentBinding(var104);
                try {
                    module0015.$g533$.bind((SubLObject)module0694.T, var104);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020((SubLObject)module0694.$ic12$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    final SubLObject var4_124 = module0015.$g533$.currentBinding(var104);
                    try {
                        module0015.$g533$.bind((SubLObject)module0694.T, var104);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019((SubLObject)module0694.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_124, var104);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0694.NIL != var109) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019(var109);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var104));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    final SubLObject var4_125 = module0015.$g533$.currentBinding(var104);
                    final SubLObject var112 = module0015.$g541$.currentBinding(var104);
                    final SubLObject var113 = module0015.$g539$.currentBinding(var104);
                    try {
                        module0015.$g533$.bind((SubLObject)module0694.T, var104);
                        module0015.$g541$.bind((SubLObject)module0694.T, var104);
                        module0015.$g539$.bind(module0015.f797(), var104);
                        module0656.f39790((SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39026((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0694.$ic113$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0656.f39804(var38, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39026((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0694.$ic140$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        if (module0694.NIL != var105) {
                            SubLObject var114 = var105;
                            SubLObject var115 = (SubLObject)module0694.NIL;
                            var115 = var114.first();
                            while (module0694.NIL != var114) {
                                module0642.f39026((SubLObject)module0694.UNPROVIDED);
                                module0656.f39804(var115, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                                module0642.f39019((SubLObject)module0694.$ic141$);
                                module0656.f39804(var40, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                                var114 = var114.rest();
                                var115 = var114.first();
                            }
                        }
                        else {
                            module0642.f39019((SubLObject)module0694.$ic117$);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var104));
                    }
                    finally {
                        module0015.$g539$.rebind(var113, var104);
                        module0015.$g541$.rebind(var112, var104);
                        module0015.$g533$.rebind(var4_125, var104);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0694.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_123, var104);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_122, var104);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var110, var104);
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42447(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0656.f39943(var1, (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL == module0173.f10955(var3)) {
            return module0656.f39789((SubLObject)module0694.$ic134$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        }
        if (module0694.NIL == Symbols.fboundp((SubLObject)module0694.$ic142$)) {
            return module0656.f39789((SubLObject)module0694.$ic143$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        }
        final SubLObject var4 = (SubLObject)module0694.$ic144$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0694.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0694.$ic5$);
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var6 = module0014.f672((SubLObject)module0694.$ic6$);
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020((SubLObject)module0694.$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            if (module0694.NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020((SubLObject)module0694.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
            module0016.f941();
            if (module0694.NIL != var4) {
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            final SubLObject var4_126 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0694.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0694.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020((SubLObject)module0694.$ic11$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                final SubLObject var4_127 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0694.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020((SubLObject)module0694.$ic12$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    final SubLObject var4_128 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0694.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019((SubLObject)module0694.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_128, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0694.NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    final SubLObject var4_129 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0694.T, var2);
                        module0015.$g541$.bind((SubLObject)module0694.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0656.f39790((SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39032((SubLObject)module0694.UNPROVIDED);
                        module0642.f39026((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39020(module0015.$g207$.getGlobalValue());
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0694.$ic113$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0656.f39804(var3, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g208$.getGlobalValue());
                        module0642.f39026((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0694.$ic114$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        final SubLObject var4_130 = module0147.$g2094$.currentBinding(var2);
                        final SubLObject var11_131 = module0147.$g2095$.currentBinding(var2);
                        try {
                            module0147.$g2094$.bind((SubLObject)module0694.$ic85$, var2);
                            module0147.$g2095$.bind(module0694.$ic86$, var2);
                            final SubLObject var9 = module0487.f31960(var3, (SubLObject)module0694.UNPROVIDED);
                            module0642.f39020(module0015.$g252$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                            final SubLObject var4_131 = module0015.$g533$.currentBinding(var2);
                            try {
                                module0015.$g533$.bind((SubLObject)module0694.T, var2);
                                SubLObject var10 = var9;
                                SubLObject var11 = (SubLObject)module0694.NIL;
                                var11 = var10.first();
                                while (module0694.NIL != var10) {
                                    final SubLObject var12 = module0487.f31971(var3, var11, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020(module0015.$g254$.getGlobalValue());
                                    module0656.f39804(var11, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020(module0015.$g255$.getGlobalValue());
                                    module0642.f39020(module0015.$g256$.getGlobalValue());
                                    SubLObject var31_135 = var12;
                                    SubLObject var13 = (SubLObject)module0694.NIL;
                                    var13 = var31_135.first();
                                    while (module0694.NIL != var31_135) {
                                        module0671.f41002(var13, (SubLObject)module0694.UNPROVIDED);
                                        module0642.f39026((SubLObject)module0694.UNPROVIDED);
                                        var31_135 = var31_135.rest();
                                        var13 = var31_135.first();
                                    }
                                    module0642.f39026((SubLObject)module0694.UNPROVIDED);
                                    module0642.f39020(module0015.$g257$.getGlobalValue());
                                    var10 = var10.rest();
                                    var11 = var10.first();
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var4_131, var2);
                            }
                            module0642.f39020(module0015.$g253$.getGlobalValue());
                        }
                        finally {
                            module0147.$g2095$.rebind(var11_131, var2);
                            module0147.$g2094$.rebind(var4_130, var2);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var2);
                        module0015.$g541$.rebind(var7, var2);
                        module0015.$g533$.rebind(var4_129, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0694.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_127, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_126, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var2);
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42448(final SubLObject var38, SubLObject var29) {
        if (var29 == module0694.UNPROVIDED) {
            var29 = (SubLObject)module0694.NIL;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        assert module0694.NIL != module0173.f10955(var38) : var38;
        if (module0694.NIL == var29) {
            module0642.f39019((SubLObject)module0694.$ic116$);
        }
        final SubLObject var40 = module0656.f39832((SubLObject)module0694.$ic45$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)module0694.$ic146$, module0656.f39842(var38));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL != var40) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020(var40);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
        final SubLObject var41 = module0015.$g533$.currentBinding(var39);
        try {
            module0015.$g533$.bind((SubLObject)module0694.T, var39);
            module0642.f39019(var29);
        }
        finally {
            module0015.$g533$.rebind(var41, var39);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var38;
    }
    
    public static SubLObject f42443(final SubLObject var112) {
        module0642.f39068((SubLObject)module0694.$ic138$, module0656.f39842(var112), (SubLObject)module0694.NIL, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        module0642.f39032((SubLObject)module0694.UNPROVIDED);
        module0656.f39804(var112, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42441() {
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42449() {
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42450(final SubLObject var1) {
        final SubLObject var2 = var1.first();
        final SubLObject var3 = module0656.f39943(var1.first(), (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL == module0173.f10955(var3)) {
            module0656.f39789((SubLObject)module0694.$ic56$, var2, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
            return (SubLObject)module0694.NIL;
        }
        return f42451(var3);
    }
    
    public static SubLObject f42452(final SubLObject var39, SubLObject var29) {
        if (var29 == module0694.UNPROVIDED) {
            var29 = (SubLObject)module0694.NIL;
        }
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (module0694.NIL == var29) {
            var29 = (SubLObject)module0694.$ic149$;
        }
        final SubLObject var41 = module0656.f39832((SubLObject)module0694.$ic45$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var40), (SubLObject)module0694.$ic150$, module0656.f39842(var39));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL != var41) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020(var41);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
        final SubLObject var42 = module0015.$g533$.currentBinding(var40);
        try {
            module0015.$g533$.bind((SubLObject)module0694.T, var40);
            module0642.f39019(var29);
        }
        finally {
            module0015.$g533$.rebind(var42, var40);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42451(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        assert module0694.NIL != module0173.f10955(var39) : var39;
        final SubLObject var41 = (SubLObject)module0694.$ic149$;
        final SubLObject var42 = module0015.$g538$.currentBinding(var40);
        try {
            module0015.$g538$.bind((module0694.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var40))) ? module0015.$g538$.getDynamicValue(var40) : module0057.f4173((SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED), var40);
            module0642.f39020((SubLObject)module0694.$ic5$);
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var40), module0655.$g5142$.getDynamicValue(var40));
            final SubLObject var43 = module0014.f672((SubLObject)module0694.$ic6$);
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020((SubLObject)module0694.$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            if (module0694.NIL != var43) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020(var43);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39020((SubLObject)module0694.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
            module0016.f941();
            if (module0694.NIL != var41) {
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var41);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
            final SubLObject var4_137 = module0015.$g535$.currentBinding(var40);
            try {
                module0015.$g535$.bind((SubLObject)module0694.T, var40);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0694.NIL != module0015.$g132$.getDynamicValue(var40)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var40)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39020((SubLObject)module0694.$ic11$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                final SubLObject var4_138 = module0015.$g533$.currentBinding(var40);
                try {
                    module0015.$g533$.bind((SubLObject)module0694.T, var40);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020((SubLObject)module0694.$ic12$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    final SubLObject var4_139 = module0015.$g533$.currentBinding(var40);
                    try {
                        module0015.$g533$.bind((SubLObject)module0694.T, var40);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020((SubLObject)module0694.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019((SubLObject)module0694.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_139, var40);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0694.NIL != var41) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019(var41);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    }
                    final SubLObject var44 = module0656.f39832((SubLObject)module0694.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var40));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    module0642.f39020((SubLObject)module0694.$ic16$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    if (module0694.NIL != var44) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39020(var44);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0694.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0694.UNPROVIDED);
                    final SubLObject var4_140 = module0015.$g533$.currentBinding(var40);
                    final SubLObject var45 = module0015.$g541$.currentBinding(var40);
                    final SubLObject var46 = module0015.$g539$.currentBinding(var40);
                    try {
                        module0015.$g533$.bind((SubLObject)module0694.T, var40);
                        module0015.$g541$.bind((SubLObject)module0694.T, var40);
                        module0015.$g539$.bind(module0015.f797(), var40);
                        module0642.f39069((SubLObject)module0694.$ic155$, (SubLObject)module0694.T, (SubLObject)module0694.UNPROVIDED);
                        module0656.f39870((SubLObject)module0694.$ic153$, (SubLObject)module0694.NIL, (SubLObject)module0694.UNPROVIDED);
                        module0656.f39790((SubLObject)module0694.$ic18$, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39032((SubLObject)module0694.UNPROVIDED);
                        module0642.f39073((SubLObject)module0694.$ic25$);
                        module0642.f39032((SubLObject)module0694.UNPROVIDED);
                        module0642.f39074((SubLObject)module0694.$ic156$, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39026((SubLObject)module0694.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0694.$ic157$);
                        module0656.f39804(var39, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
                        module0642.f39019((SubLObject)module0694.$ic69$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        final SubLObject var47 = f42453(var39);
                        final SubLObject var48 = f42454(var39);
                        if (module0694.NIL != var47) {
                            module0642.f39026((SubLObject)module0694.TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0694.$ic158$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            SubLObject var49 = var47;
                            SubLObject var50 = (SubLObject)module0694.NIL;
                            var50 = var49.first();
                            while (module0694.NIL != var49) {
                                module0642.f39026((SubLObject)module0694.UNPROVIDED);
                                f42455(var39, var50);
                                var49 = var49.rest();
                                var50 = var49.first();
                            }
                        }
                        if (module0694.NIL != var48) {
                            module0642.f39026((SubLObject)module0694.TWO_INTEGER);
                            module0642.f39019((SubLObject)module0694.$ic159$);
                            SubLObject var49 = var48;
                            SubLObject var51 = (SubLObject)module0694.NIL;
                            var51 = var49.first();
                            while (module0694.NIL != var49) {
                                module0642.f39026((SubLObject)module0694.UNPROVIDED);
                                f42456(var39, var51);
                                var49 = var49.rest();
                                var51 = var49.first();
                            }
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var40));
                    }
                    finally {
                        module0015.$g539$.rebind(var46, var40);
                        module0015.$g541$.rebind(var45, var40);
                        module0015.$g533$.rebind(var4_140, var40);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0694.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_138, var40);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0694.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_137, var40);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0694.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var42, var40);
        }
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42453(final SubLObject var39) {
        final SubLObject var40 = conses_high.subst(var39, (SubLObject)module0694.$ic161$, module0694.$g5472$.getGlobalValue(), (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        final SubLObject var41 = module0538.f33428(var40, module0694.$ic162$, (SubLObject)module0694.ONE_INTEGER, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED);
        if (module0694.NIL != var41) {
            SubLObject var42 = (SubLObject)module0694.NIL;
            SubLObject var43 = (SubLObject)module0694.NIL;
            SubLObject var44 = var41;
            SubLObject var45 = (SubLObject)module0694.NIL;
            var45 = var44.first();
            while (module0694.NIL != var44) {
                final SubLObject var46 = module0233.f15370(var45.first());
                if (module0694.NIL != module0538.f33428(var46, module0694.$ic162$, (SubLObject)module0694.NIL, (SubLObject)module0694.ONE_INTEGER, (SubLObject)module0694.UNPROVIDED, (SubLObject)module0694.UNPROVIDED)) {
                    var42 = (SubLObject)ConsesLow.cons(var46, var42);
                }
                else {
                    var43 = (SubLObject)ConsesLow.cons(var46, var43);
                }
                var44 = var44.rest();
                var45 = var44.first();
            }
            var42 = Sequences.nreverse(var42);
            var43 = Sequences.nreverse(var43);
            return Values.values(var43, var42);
        }
        return Values.values((SubLObject)module0694.NIL, (SubLObject)module0694.NIL);
    }
    
    public static SubLObject f42455(final SubLObject var39, final SubLObject var142) {
        module0656.f39804(var142, (SubLObject)module0694.ZERO_INTEGER, (SubLObject)module0694.T);
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42454(final SubLObject var39) {
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42456(final SubLObject var39, final SubLObject var112) {
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42457() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42419", "CB-CREATE-TERM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42420", "CB-HANDLE-CREATE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42424", "S#46421", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42423", "S#46422", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42422", "S#46423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42425", "S#46424", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42426", "S#46425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42427", "CB-CATEGORIZE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42428", "S#46426", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42421", "S#46427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42429", "CB-HANDLE-CATEGORIZE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42430", "S#46428", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42431", "S#46429", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42435", "S#46430", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42432", "S#46431", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42436", "S#46432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42437", "S#46433", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42433", "S#46434", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42438", "CB-HANDLE-COPY-FROM-SIMILAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42439", "S#46435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42440", "S#46436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42434", "S#46437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42442", "S#46438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42444", "CB-CONCEPTUALLY-RELATED-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42445", "S#46439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42446", "S#46440", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42447", "CT-CR-JUSTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42448", "S#46441", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42443", "S#46442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42441", "S#46443", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42449", "S#46444", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42450", "CB-ELABORATE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42452", "S#46445", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42451", "S#46446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42453", "S#46447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42455", "S#46448", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42454", "S#46449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0694", "f42456", "S#46450", 2, 0, false);
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42458() {
        module0694.$g5469$ = SubLFiles.defparameter("S#46451", (SubLObject)module0694.NIL);
        module0694.$g5470$ = SubLFiles.defparameter("S#46452", (SubLObject)module0694.NIL);
        module0694.$g5471$ = SubLFiles.deflexical("S#46453", (SubLObject)module0694.$ic84$);
        module0694.$g5472$ = SubLFiles.deflexical("S#46454", (SubLObject)module0694.$ic160$);
        return (SubLObject)module0694.NIL;
    }
    
    public static SubLObject f42459() {
        module0012.f441((SubLObject)module0694.$ic0$);
        Hashtables.sethash((SubLObject)module0694.$ic1$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0694.$ic2$, (SubLObject)module0694.NIL));
        module0015.f873((SubLObject)module0694.$ic38$);
        module0015.f873((SubLObject)module0694.$ic44$);
        module0656.f39840((SubLObject)module0694.$ic47$, (SubLObject)module0694.$ic48$, (SubLObject)module0694.ONE_INTEGER);
        module0656.f39819((SubLObject)module0694.$ic47$, (SubLObject)module0694.$ic4$, (SubLObject)module0694.$ic49$, (SubLObject)module0694.$ic50$);
        module0015.f873((SubLObject)module0694.$ic57$);
        module0656.f39840((SubLObject)module0694.$ic60$, (SubLObject)module0694.$ic61$, (SubLObject)module0694.TWO_INTEGER);
        module0012.f441((SubLObject)module0694.$ic62$);
        Hashtables.sethash((SubLObject)module0694.$ic63$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0694.$ic64$, (SubLObject)module0694.NIL));
        module0015.f873((SubLObject)module0694.$ic83$);
        Hashtables.sethash((SubLObject)module0694.$ic93$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0694.$ic94$, (SubLObject)module0694.NIL));
        module0015.f873((SubLObject)module0694.$ic106$);
        Hashtables.sethash((SubLObject)module0694.$ic107$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0694.$ic108$, (SubLObject)module0694.NIL));
        module0015.f873((SubLObject)module0694.$ic137$);
        module0015.f873((SubLObject)module0694.$ic145$);
        module0656.f39840((SubLObject)module0694.$ic115$, (SubLObject)module0694.$ic147$, (SubLObject)module0694.TWO_INTEGER);
        module0015.f873((SubLObject)module0694.$ic148$);
        module0656.f39840((SubLObject)module0694.$ic151$, (SubLObject)module0694.$ic152$, (SubLObject)module0694.TWO_INTEGER);
        Hashtables.sethash((SubLObject)module0694.$ic153$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0694.$ic154$, (SubLObject)module0694.NIL));
        return (SubLObject)module0694.NIL;
    }
    
    public void declareFunctions() {
        f42457();
    }
    
    public void initializeVariables() {
        f42458();
    }
    
    public void runTopLevelForms() {
        f42459();
    }
    
    static {
        me = (SubLFile)new module0694();
        module0694.$g5469$ = null;
        module0694.$g5470$ = null;
        module0694.$g5471$ = null;
        module0694.$g5472$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#46451", "CYC");
        $ic1$ = SubLObjectFactory.makeKeyword("CB-CREATE-TERM");
        $ic2$ = SubLObjectFactory.makeString("cb-create-term.html");
        $ic3$ = SubLObjectFactory.makeString("the Create Term page");
        $ic4$ = SubLObjectFactory.makeString("Create Term");
        $ic5$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic6$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic7$ = SubLObjectFactory.makeString("stylesheet");
        $ic8$ = SubLObjectFactory.makeString("text/css");
        $ic9$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic10$ = SubLObjectFactory.makeString("text/javascript");
        $ic11$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic12$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic13$ = SubLObjectFactory.makeString("button");
        $ic14$ = SubLObjectFactory.makeString("reload");
        $ic15$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic16$ = SubLObjectFactory.makeString("post");
        $ic17$ = SubLObjectFactory.makeString("cb-handle-create-term");
        $ic18$ = SubLObjectFactory.makeKeyword("SELF");
        $ic19$ = SubLObjectFactory.makeString("Cancel Create");
        $ic20$ = SubLObjectFactory.makeString("Reset");
        $ic21$ = SubLObjectFactory.makeString("Create Constant");
        $ic22$ = SubLObjectFactory.makeKeyword("TOP");
        $ic23$ = SubLObjectFactory.makeString("Name (required) : ");
        $ic24$ = SubLObjectFactory.makeString("new-name");
        $ic25$ = SubLObjectFactory.makeString("Clear");
        $ic26$ = SubLObjectFactory.makeString("Complete");
        $ic27$ = SubLObjectFactory.makeString("");
        $ic28$ = SubLObjectFactory.makeInteger(35);
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $ic30$ = SubLObjectFactory.makeString(", one per line (optional) : ");
        $ic31$ = SubLObjectFactory.makeString("term-strings");
        $ic32$ = SubLObjectFactory.makeKeyword("BOTTOM");
        $ic33$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("comment"));
        $ic34$ = SubLObjectFactory.makeString(" (required) : ");
        $ic35$ = SubLObjectFactory.makeString("comment");
        $ic36$ = SubLObjectFactory.makeInteger(80);
        $ic37$ = SubLObjectFactory.makeString("virtual");
        $ic38$ = SubLObjectFactory.makeSymbol("CB-CREATE-TERM");
        $ic39$ = SubLObjectFactory.makeString("Creating");
        $ic40$ = SubLObjectFactory.makeString("No name was specified");
        $ic41$ = SubLObjectFactory.makeString("~S is not a valid constant name");
        $ic42$ = SubLObjectFactory.makeString("No comment was specified");
        $ic43$ = SubLObjectFactory.makeString("Unable to create a constant named ~S");
        $ic44$ = SubLObjectFactory.makeSymbol("CB-HANDLE-CREATE-TERM");
        $ic45$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic46$ = SubLObjectFactory.makeString("cb-create-term");
        $ic47$ = SubLObjectFactory.makeKeyword("CREATE-TERM");
        $ic48$ = SubLObjectFactory.makeSymbol("S#46421", "CYC");
        $ic49$ = SubLObjectFactory.makeString("Crt");
        $ic50$ = SubLObjectFactory.makeString("Cyc Constant Creation Wizard");
        $ic51$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic52$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic53$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic54$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertionsMt"));
        $ic55$ = SubLObjectFactory.makeSymbol("S#46425", "CYC");
        $ic56$ = SubLObjectFactory.makeString("~a does not specify a Cyc term");
        $ic57$ = SubLObjectFactory.makeSymbol("CB-CATEGORIZE-TERM");
        $ic58$ = SubLObjectFactory.makeString("Categorize Term");
        $ic59$ = SubLObjectFactory.makeString("cb-categorize-term&~a");
        $ic60$ = SubLObjectFactory.makeKeyword("CATEGORIZE-TERM");
        $ic61$ = SubLObjectFactory.makeSymbol("S#46426", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#46452", "CYC");
        $ic63$ = SubLObjectFactory.makeKeyword("CB-CATEGORIZE-TERM");
        $ic64$ = SubLObjectFactory.makeString("cb-categorize-term.html");
        $ic65$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic66$ = SubLObjectFactory.makeString("cb-handle-categorize-term");
        $ic67$ = SubLObjectFactory.makeString("Categorize");
        $ic68$ = SubLObjectFactory.makeString("Categorize ");
        $ic69$ = SubLObjectFactory.makeString(":");
        $ic70$ = SubLObjectFactory.makeString("term");
        $ic71$ = SubLObjectFactory.makeString("Mt : ");
        $ic72$ = SubLObjectFactory.makeString("mt");
        $ic73$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $ic74$ = SubLObjectFactory.makeString("Similar to : ");
        $ic75$ = SubLObjectFactory.makeString("similar-to");
        $ic76$ = SubLObjectFactory.makeInteger(40);
        $ic77$ = SubLObjectFactory.makeString("Instance of : ");
        $ic78$ = SubLObjectFactory.makeString("isa");
        $ic79$ = SubLObjectFactory.makeString("Specialization of : ");
        $ic80$ = SubLObjectFactory.makeString("genl");
        $ic81$ = SubLObjectFactory.makeString("generalization");
        $ic82$ = SubLObjectFactory.makeString("~a does not specify a Cyc Microtheory");
        $ic83$ = SubLObjectFactory.makeSymbol("CB-HANDLE-CATEGORIZE-TERM");
        $ic84$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Predicate"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Predicate"))));
        $ic85$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic86$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic87$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic88$ = SubLObjectFactory.makeKeyword("GAF");
        $ic89$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic90$ = SubLObjectFactory.makeKeyword("MONOTONIC");
        $ic91$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic92$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"));
        $ic93$ = SubLObjectFactory.makeKeyword("CB-COPY-FROM-SIMILAR");
        $ic94$ = SubLObjectFactory.makeString("cb-copy-from-similar.html");
        $ic95$ = SubLObjectFactory.makeString("cb-handle-copy-from-similar");
        $ic96$ = SubLObjectFactory.makeString("Copy from ");
        $ic97$ = SubLObjectFactory.makeString(" to ");
        $ic98$ = SubLObjectFactory.makeString("Copy Assertions");
        $ic99$ = SubLObjectFactory.makeString("Check the assertions from ");
        $ic100$ = SubLObjectFactory.makeString(" which you wish to copy: ");
        $ic101$ = SubLObjectFactory.makeSymbol("S#46435", "CYC");
        $ic102$ = SubLObjectFactory.makeString("copy from similar facilities");
        $ic103$ = SubLObjectFactory.makeString("No source term was specified");
        $ic104$ = SubLObjectFactory.makeString("Unable to determine a term from ~S");
        $ic105$ = SubLObjectFactory.makeString("No term was specified");
        $ic106$ = SubLObjectFactory.makeSymbol("CB-HANDLE-COPY-FROM-SIMILAR");
        $ic107$ = SubLObjectFactory.makeKeyword("CB-CONCEPTUALLY-RELATED-TERMS");
        $ic108$ = SubLObjectFactory.makeString("cb-conceptually-related-terms.html");
        $ic109$ = SubLObjectFactory.makeString("Conceptually Related Suggestions");
        $ic110$ = SubLObjectFactory.makeString("cb-conceptually-related-terms");
        $ic111$ = SubLObjectFactory.makeString("fort");
        $ic112$ = SubLObjectFactory.makeString("Clear All");
        $ic113$ = SubLObjectFactory.makeString("Term : ");
        $ic114$ = SubLObjectFactory.makeString("Existing Conceptually Related Terms : ");
        $ic115$ = SubLObjectFactory.makeKeyword("CT-CR-JUSTIFY");
        $ic116$ = SubLObjectFactory.makeString("[Justify]");
        $ic117$ = SubLObjectFactory.makeString("None");
        $ic118$ = SubLObjectFactory.makeString("Specify the Microtheory for new #$conceptuallyRelated assertions:");
        $ic119$ = SubLObjectFactory.makeString(" Mt : ");
        $ic120$ = SubLObjectFactory.makeString(" Select terms and/or type in a term to add as #$conceptuallyRelated to ");
        $ic121$ = SubLObjectFactory.makeString(": ");
        $ic122$ = SubLObjectFactory.makeString("entered");
        $ic123$ = SubLObjectFactory.makeString(" Term : ");
        $ic124$ = SubLObjectFactory.makeString("Possible Terms to Add : ");
        $ic125$ = SubLObjectFactory.makeString("Add Terms Backward");
        $ic126$ = SubLObjectFactory.makeString("add-backward");
        $ic127$ = SubLObjectFactory.makeString(" as ");
        $ic128$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated"));
        $ic129$ = SubLObjectFactory.makeSymbol("S#12141", "CYC");
        $ic130$ = SubLObjectFactory.makeString(" in MT");
        $ic131$ = SubLObjectFactory.makeString("Add Terms Forward");
        $ic132$ = SubLObjectFactory.makeString("add-forward");
        $ic133$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"));
        $ic134$ = SubLObjectFactory.makeString("Unable to determine last term (why?)");
        $ic135$ = SubLObjectFactory.makeString("Invalid Mt specified : ~S");
        $ic136$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic137$ = SubLObjectFactory.makeSymbol("CB-CONCEPTUALLY-RELATED-TERMS");
        $ic138$ = SubLObjectFactory.makeString("id");
        $ic139$ = SubLObjectFactory.makeString("Formulas Asserted");
        $ic140$ = SubLObjectFactory.makeString("Formulas Asserted :");
        $ic141$ = SubLObjectFactory.makeString(" in ");
        $ic142$ = SubLObjectFactory.makeSymbol("S#24950", "CYC");
        $ic143$ = SubLObjectFactory.makeString("Sorry, System 74.92 or later is required for justification to work.");
        $ic144$ = SubLObjectFactory.makeString("Justify Conceptually Related");
        $ic145$ = SubLObjectFactory.makeSymbol("CT-CR-JUSTIFY");
        $ic146$ = SubLObjectFactory.makeString("ct-cr-justify&~a");
        $ic147$ = SubLObjectFactory.makeSymbol("S#46441", "CYC");
        $ic148$ = SubLObjectFactory.makeSymbol("CB-ELABORATE-TERM");
        $ic149$ = SubLObjectFactory.makeString("Elaborate Term");
        $ic150$ = SubLObjectFactory.makeString("cb-elaborate-term&~a");
        $ic151$ = SubLObjectFactory.makeKeyword("ELABORATE-TERM");
        $ic152$ = SubLObjectFactory.makeSymbol("S#46445", "CYC");
        $ic153$ = SubLObjectFactory.makeKeyword("CB-ELABORATE-TERM");
        $ic154$ = SubLObjectFactory.makeString("cb-elaborate-term.html");
        $ic155$ = SubLObjectFactory.makeString("cb-handle-elaborate-term");
        $ic156$ = SubLObjectFactory.makeString("Elaborate");
        $ic157$ = SubLObjectFactory.makeString("Elaborate ");
        $ic158$ = SubLObjectFactory.makeString("Requirements : ");
        $ic159$ = SubLObjectFactory.makeString("Suggestions : ");
        $ic160$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("keRequirement")), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA"));
        $ic161$ = SubLObjectFactory.makeKeyword("TERM");
        $ic162$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0694.class
	Total time: 1140 ms
	
	Decompiled with Procyon 0.5.32.
*/