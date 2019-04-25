package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0696 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0696";
    public static final String myFingerPrint = "2e5ba4f2f256e745670f500ff0bb1afdfe3b6c78cd45c76b05e87681fbcbde77";
    public static SubLSymbol $g5475$;
    public static SubLSymbol $g5476$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
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
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
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
    private static final SubLInteger $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    
    public static SubLObject f42478(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic4$);
        }
        else {
            final SubLObject var3 = (SubLObject)$ic5$;
            final SubLObject var4 = module0015.$g538$.currentBinding(var2);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
                module0642.f39020((SubLObject)$ic6$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
                final SubLObject var5 = module0014.f672((SubLObject)$ic7$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic8$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var5) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var5);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic9$);
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
                final SubLObject var4_6 = module0015.$g535$.currentBinding(var2);
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
                    final SubLObject var4_7 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_8 = module0015.$g533$.currentBinding(var2);
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
                            module0015.$g533$.rebind(var4_8, var2);
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
                        module0642.f39020((SubLObject)$ic17$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var6) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var6);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_9 = module0015.$g533$.currentBinding(var2);
                        final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                        final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            module0015.$g541$.bind((SubLObject)T, var2);
                            module0015.$g539$.bind(module0015.f797(), var2);
                            module0642.f39069((SubLObject)$ic18$, (SubLObject)T, (SubLObject)UNPROVIDED);
                            module0656.f39870((SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            module0656.f39790((SubLObject)$ic19$, (SubLObject)$ic20$);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39074((SubLObject)$ic21$, (SubLObject)$ic22$, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic23$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39020(module0015.$g217$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic24$);
                            module0642.f39020(module0015.$g218$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g346$.getGlobalValue());
                            module0642.f39020(module0015.$g352$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)ZERO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_10 = module0015.$g533$.currentBinding(var2);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var2);
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_11 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var2);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_12 = module0015.$g533$.currentBinding(var2);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var2);
                                        module0642.f39073((SubLObject)$ic25$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_12, var2);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_13 = module0015.$g533$.currentBinding(var2);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var2);
                                        module0666.f40467((SubLObject)$ic26$, (SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_13, var2);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_14 = module0015.$g533$.currentBinding(var2);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var2);
                                        module0642.f39032((SubLObject)FIVE_INTEGER);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_14, var2);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_15 = module0015.$g533$.currentBinding(var2);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var2);
                                        module0642.f39068((SubLObject)$ic28$, (SubLObject)$ic28$, $g5475$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic29$);
                                        module0642.f39026((SubLObject)UNPROVIDED);
                                        module0642.f39068((SubLObject)$ic30$, (SubLObject)$ic30$, $g5476$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic31$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_15, var2);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_11, var2);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_10, var2);
                            }
                            module0642.f39020(module0015.$g347$.getGlobalValue());
                            if (NIL != module0655.$g5102$.getDynamicValue(var2)) {
                                module0642.f39020(module0015.$g336$.getGlobalValue());
                                module0642.f39020(module0015.$g338$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic26$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g340$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic32$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g339$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic33$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g350$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic34$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_16 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var2);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_16, var2);
                                }
                                module0642.f39020(module0015.$g337$.getGlobalValue());
                            }
                            else {
                                module0642.f39020(module0015.$g336$.getGlobalValue());
                                module0642.f39020(module0015.$g338$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic26$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g340$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic32$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g339$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic33$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_17 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var2);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_17, var2);
                                }
                                module0642.f39020(module0015.$g337$.getGlobalValue());
                            }
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var2));
                        }
                        finally {
                            module0015.$g539$.rebind(var8, var2);
                            module0015.$g541$.rebind(var7, var2);
                            module0015.$g533$.rebind(var4_9, var2);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_7, var2);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var4_6, var2);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var4, var2);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42479(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)$ic30$, var1);
        final SubLObject var3 = module0642.f39104((SubLObject)$ic26$, var1);
        final SubLObject var4 = Types.sublisp_null(module0642.f39104((SubLObject)$ic36$, var1));
        if (NIL != var4) {
            module0695.f42474((SubLObject)ConsesLow.list((SubLObject)$ic37$, (SubLObject)ConsesLow.list((SubLObject)$ic38$, var3), (SubLObject)ConsesLow.list((SubLObject)$ic39$, (SubLObject)((NIL != var2) ? $ic40$ : $ic41$))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42480() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0696", "f42478", "KE-COMPOSE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0696", "f42479", "HANDLE-COMPOSE-INPUT", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42481() {
        $g5475$ = SubLFiles.defparameter("S#46469", (SubLObject)NIL);
        $g5476$ = SubLFiles.defparameter("S#46470", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42482() {
        module0012.f441((SubLObject)$ic0$);
        module0012.f441((SubLObject)$ic1$);
        Hashtables.sethash((SubLObject)$ic2$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic35$);
        module0015.f873((SubLObject)$ic42$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f42480();
    }
    
    public void initializeVariables() {
        f42481();
    }
    
    public void runTopLevelForms() {
        f42482();
    }
    
    static {
        me = (SubLFile)new module0696();
        $g5475$ = null;
        $g5476$ = null;
        $ic0$ = makeSymbol("S#46469", "CYC");
        $ic1$ = makeSymbol("S#46470", "CYC");
        $ic2$ = makeKeyword("KE-COMPOSE");
        $ic3$ = makeString("ke-compose.html");
        $ic4$ = makeString("KE File");
        $ic5$ = makeString("Compose KE Text Expressions");
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
        $ic18$ = makeString("handle-compose-input");
        $ic19$ = makeKeyword("SELF");
        $ic20$ = makeString("Cancel Compose");
        $ic21$ = makeString("Eval");
        $ic22$ = makeString("eval-ke-text");
        $ic23$ = makeString("Type KE text below.  ");
        $ic24$ = makeString("Include a period after each expression.");
        $ic25$ = makeString("Clear");
        $ic26$ = makeString("compose-text");
        $ic27$ = makeString("Complete");
        $ic28$ = makeString("remove");
        $ic29$ = makeString(" Remove non-printing characters in strings");
        $ic30$ = makeString("check");
        $ic31$ = makeString(" Check for existing assertions");
        $ic32$ = makeInteger(80);
        $ic33$ = makeInteger(30);
        $ic34$ = makeString("virtual");
        $ic35$ = makeSymbol("KE-COMPOSE");
        $ic36$ = makeString("use-old-ke-text");
        $ic37$ = makeString("t");
        $ic38$ = makeString(":ke-text");
        $ic39$ = makeString(":?check-existing");
        $ic40$ = makeString("check-and-show");
        $ic41$ = makeString("nil");
        $ic42$ = makeSymbol("HANDLE-COMPOSE-INPUT");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 230 ms
	
	Decompiled with Procyon 0.5.32.
*/