package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0689 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0689";
    public static final String myFingerPrint = "8b9d81308d84621cc60b22e15899ce1a37a3b5ddea59b2e84c0b53776718691b";
    public static SubLSymbol $g5437$;
    public static SubLSymbol $g5438$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLInteger $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLInteger $ic42$;
    private static final SubLSymbol $ic43$;
    
    public static SubLObject f42248(SubLObject var1, SubLObject var2) {
        if (var1 == module0689.UNPROVIDED) {
            var1 = (SubLObject)module0689.NIL;
        }
        if (var2 == module0689.UNPROVIDED) {
            var2 = (SubLObject)module0689.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0689.NIL == var2) {
            var2 = (SubLObject)module0689.$ic0$;
        }
        final SubLObject var4 = module0656.f39832(var1);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0689.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0689.$ic1$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0689.UNPROVIDED);
        if (module0689.NIL != var4) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0689.UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0689.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0689.T, var3);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0689.NIL;
    }
    
    public static SubLObject f42249(SubLObject var2) {
        if (var2 == module0689.UNPROVIDED) {
            var2 = (SubLObject)module0689.NIL;
        }
        return module0656.f39837((SubLObject)module0689.$ic2$, (SubLObject)module0689.$ic7$, var2, (SubLObject)module0689.UNPROVIDED, (SubLObject)module0689.UNPROVIDED, (SubLObject)module0689.UNPROVIDED);
    }
    
    public static SubLObject f42250() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0689.NIL == module0689.$g5437$.getDynamicValue(var3)) {
            module0689.$g5437$.setDynamicValue(Environment.get_network_name(Environment.get_machine_name((SubLObject)module0689.$ic10$)), var3);
        }
        return module0689.$g5437$.getDynamicValue(var3);
    }
    
    public static SubLObject f42251() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0689.NIL == module0689.$g5438$.getDynamicValue(var3)) {
            module0689.$g5438$.setDynamicValue(module0110.$g1378$.getDynamicValue(var3), var3);
        }
        return module0689.$g5438$.getDynamicValue(var3);
    }
    
    public static SubLObject f42252(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        if (module0689.NIL != var8) {
            module0004.f78((SubLObject)module0689.$ic12$, (SubLObject)module0689.$ic13$, (SubLObject)ConsesLow.list(var6, var7));
        }
        f42253(var6, var7);
        return (SubLObject)module0689.NIL;
    }
    
    public static SubLObject f42253(final SubLObject var6, final SubLObject var7) {
        module0689.$g5437$.setDynamicValue(var6);
        module0689.$g5438$.setDynamicValue(var7);
        return (SubLObject)module0689.NIL;
    }
    
    public static SubLObject f42254(final SubLObject var9) {
        final SubLObject var10 = Strings.string_trim((SubLObject)module0689.$ic14$, module0642.f39104((SubLObject)module0689.$ic15$, var9));
        final SubLObject var11 = module0038.f2642(module0642.f39104((SubLObject)module0689.$ic16$, var9));
        final SubLObject var12 = module0035.sublisp_boolean(module0642.f39104((SubLObject)module0689.$ic17$, var9));
        f42252(var10, var11, var12);
        module0642.f39020((SubLObject)module0689.$ic18$);
        module0642.f39029((SubLObject)module0689.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0689.ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
        module0642.f39019((SubLObject)module0689.$ic19$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0689.ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
        module0642.f39026((SubLObject)module0689.UNPROVIDED);
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0689.FOUR_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
        module0642.f39019((SubLObject)module0689.$ic20$);
        module0642.f39019(module0038.f2624(var10));
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0689.FOUR_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
        module0642.f39026((SubLObject)module0689.UNPROVIDED);
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0689.FOUR_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
        module0642.f39019((SubLObject)module0689.$ic21$);
        module0642.f39019(module0038.f2624(var11));
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0689.FOUR_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
        module0642.f39026((SubLObject)module0689.UNPROVIDED);
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0689.UNPROVIDED);
        return (SubLObject)module0689.NIL;
    }
    
    public static SubLObject f42255(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        module0689.$g5437$.setDynamicValue(Environment.get_network_name(Environment.get_machine_name((SubLObject)module0689.$ic10$)), var10);
        module0689.$g5438$.setDynamicValue(module0110.$g1378$.getDynamicValue(var10), var10);
        return f42256(var9);
    }
    
    public static SubLObject f42256(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)module0689.$ic18$);
        module0642.f39029((SubLObject)module0689.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0689.ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
        module0642.f39019((SubLObject)module0689.$ic24$);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0689.UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var10));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0689.UNPROVIDED);
        if (module0689.NIL != module0015.$g290$.getGlobalValue()) {
            module0642.f39020(module0015.$g285$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0689.UNPROVIDED);
            module0642.f39020(module0015.$g290$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0689.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
        SubLObject var11 = module0015.$g533$.currentBinding(var10);
        SubLObject var12 = module0015.$g541$.currentBinding(var10);
        SubLObject var13 = module0015.$g539$.currentBinding(var10);
        try {
            module0015.$g533$.bind((SubLObject)module0689.T, var10);
            module0015.$g541$.bind((SubLObject)module0689.T, var10);
            module0015.$g539$.bind(module0015.f797(), var10);
            module0642.f39069((SubLObject)module0689.$ic25$, (SubLObject)module0689.T, (SubLObject)module0689.UNPROVIDED);
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)module0689.FOUR_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
            module0642.f39019((SubLObject)module0689.$ic26$);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)module0689.FOUR_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)module0689.FIVE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
            module0642.f39026((SubLObject)module0689.UNPROVIDED);
            module0642.f39019((SubLObject)module0689.$ic20$);
            module0642.f39026((SubLObject)module0689.UNPROVIDED);
            module0642.f39075((SubLObject)module0689.$ic15$, f42250(), (SubLObject)module0689.$ic27$);
            module0642.f39026((SubLObject)module0689.UNPROVIDED);
            module0642.f39026((SubLObject)module0689.UNPROVIDED);
            module0642.f39019((SubLObject)module0689.$ic28$);
            module0642.f39026((SubLObject)module0689.UNPROVIDED);
            module0642.f39075((SubLObject)module0689.$ic16$, f42251(), (SubLObject)module0689.$ic27$);
            module0642.f39026((SubLObject)module0689.UNPROVIDED);
            module0642.f39026((SubLObject)module0689.UNPROVIDED);
            module0642.f39019((SubLObject)module0689.$ic29$);
            module0642.f39026((SubLObject)module0689.UNPROVIDED);
            module0642.f39068((SubLObject)module0689.$ic17$, (SubLObject)module0689.NIL, (SubLObject)module0689.UNPROVIDED, (SubLObject)module0689.UNPROVIDED, (SubLObject)module0689.UNPROVIDED, (SubLObject)module0689.UNPROVIDED);
            module0642.f39019((SubLObject)module0689.$ic30$);
            module0642.f39026((SubLObject)module0689.UNPROVIDED);
            module0642.f39026((SubLObject)module0689.UNPROVIDED);
            module0642.f39074((SubLObject)module0689.$ic31$, (SubLObject)module0689.UNPROVIDED, (SubLObject)module0689.UNPROVIDED);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)module0689.FIVE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
            module0015.f799(module0015.$g539$.getDynamicValue(var10));
        }
        finally {
            module0015.$g539$.rebind(var13, var10);
            module0015.$g541$.rebind(var12, var10);
            module0015.$g533$.rebind(var11, var10);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0689.UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var10));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0689.UNPROVIDED);
        if (module0689.NIL != module0015.$g290$.getGlobalValue()) {
            module0642.f39020(module0015.$g285$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0689.UNPROVIDED);
            module0642.f39020(module0015.$g290$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0689.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
        var11 = module0015.$g533$.currentBinding(var10);
        var12 = module0015.$g541$.currentBinding(var10);
        var13 = module0015.$g539$.currentBinding(var10);
        try {
            module0015.$g533$.bind((SubLObject)module0689.T, var10);
            module0015.$g541$.bind((SubLObject)module0689.T, var10);
            module0015.$g539$.bind(module0015.f797(), var10);
            module0642.f39069((SubLObject)module0689.$ic32$, (SubLObject)module0689.T, (SubLObject)module0689.UNPROVIDED);
            module0642.f39074((SubLObject)module0689.$ic33$, (SubLObject)module0689.UNPROVIDED, (SubLObject)module0689.UNPROVIDED);
            module0015.f799(module0015.$g539$.getDynamicValue(var10));
        }
        finally {
            module0015.$g539$.rebind(var13, var10);
            module0015.$g541$.rebind(var12, var10);
            module0015.$g533$.rebind(var11, var10);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0689.ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0689.UNPROVIDED);
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0689.UNPROVIDED);
        return (SubLObject)module0689.NIL;
    }
    
    public static SubLObject f42257(final SubLObject var13, final SubLObject var14) {
        SubLObject var16;
        final SubLObject var15 = var16 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0689.$ic36$);
        final SubLObject var17 = var16.rest();
        var16 = var16.first();
        SubLObject var18 = (SubLObject)module0689.NIL;
        SubLObject var19 = var16;
        SubLObject var20 = (SubLObject)module0689.NIL;
        SubLObject var21_22 = (SubLObject)module0689.NIL;
        while (module0689.NIL != var19) {
            cdestructuring_bind.destructuring_bind_must_consp(var19, var15, (SubLObject)module0689.$ic36$);
            var21_22 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var15, (SubLObject)module0689.$ic36$);
            if (module0689.NIL == conses_high.member(var21_22, (SubLObject)module0689.$ic37$, (SubLObject)module0689.UNPROVIDED, (SubLObject)module0689.UNPROVIDED)) {
                var20 = (SubLObject)module0689.T;
            }
            if (var21_22 == module0689.$ic38$) {
                var18 = var19.first();
            }
            var19 = var19.rest();
        }
        if (module0689.NIL != var20 && module0689.NIL == var18) {
            cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)module0689.$ic36$);
        }
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0689.$ic39$, var16);
        final SubLObject var22 = (SubLObject)((module0689.NIL != var21) ? conses_high.cadr(var21) : module0689.$ic40$);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)module0689.$ic41$, var16);
        final SubLObject var24 = (SubLObject)((module0689.NIL != var23) ? conses_high.cadr(var23) : module0689.$ic42$);
        final SubLObject var25;
        var16 = (var25 = var17);
        return (SubLObject)ConsesLow.listS((SubLObject)module0689.$ic43$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0689.$ic9$, var22), (SubLObject)ConsesLow.list((SubLObject)module0689.$ic11$, var24)), ConsesLow.append(var25, (SubLObject)module0689.NIL));
    }
    
    public static SubLObject f42258() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0689", "f42248", "S#46257", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0689", "f42249", "S#46258", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0689", "f42250", "S#46259", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0689", "f42251", "S#46260", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0689", "f42252", "S#46261", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0689", "f42253", "S#46262", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0689", "f42254", "CB-UIA-HANDLE-FORWARDING-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0689", "f42255", "CB-UIA-HANDLE-FORWARDING-DEFAULT-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0689", "f42256", "CB-UIA-FORWARDING-HANDLER", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0689", "f42257", "WITH-MACHINE-AND-BASE-PORT-FORWARDING");
        return (SubLObject)module0689.NIL;
    }
    
    public static SubLObject f42259() {
        module0689.$g5437$ = SubLFiles.defparameter("S#46263", (SubLObject)module0689.NIL);
        module0689.$g5438$ = SubLFiles.defparameter("S#46264", (SubLObject)module0689.NIL);
        return (SubLObject)module0689.NIL;
    }
    
    public static SubLObject f42260() {
        module0656.f39840((SubLObject)module0689.$ic2$, (SubLObject)module0689.$ic3$, (SubLObject)module0689.TWO_INTEGER);
        module0656.f39819((SubLObject)module0689.$ic4$, (SubLObject)module0689.$ic5$, (SubLObject)module0689.$ic5$, (SubLObject)module0689.$ic6$);
        module0656.f39840((SubLObject)module0689.$ic4$, (SubLObject)module0689.$ic8$, (SubLObject)module0689.ONE_INTEGER);
        module0012.f441((SubLObject)module0689.$ic9$);
        module0012.f441((SubLObject)module0689.$ic11$);
        module0015.f873((SubLObject)module0689.$ic22$);
        module0015.f873((SubLObject)module0689.$ic23$);
        module0015.f873((SubLObject)module0689.$ic34$);
        module0002.f38((SubLObject)module0689.$ic35$);
        return (SubLObject)module0689.NIL;
    }
    
    public void declareFunctions() {
        f42258();
    }
    
    public void initializeVariables() {
        f42259();
    }
    
    public void runTopLevelForms() {
        f42260();
    }
    
    static {
        me = (SubLFile)new module0689();
        module0689.$g5437$ = null;
        module0689.$g5438$ = null;
        $ic0$ = SubLObjectFactory.makeString("[Forwarding]");
        $ic1$ = SubLObjectFactory.makeString("cb-uia-forwarding-handler");
        $ic2$ = SubLObjectFactory.makeKeyword("CB-UIA-FORWARDING");
        $ic3$ = SubLObjectFactory.makeSymbol("S#46257", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("UIA-FORWARDING");
        $ic5$ = SubLObjectFactory.makeString("Forwarding");
        $ic6$ = SubLObjectFactory.makeString("Specify forwarding port that connnects to Cyc server.");
        $ic7$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic8$ = SubLObjectFactory.makeSymbol("S#46258", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#46263", "CYC");
        $ic10$ = SubLObjectFactory.makeString("unknown");
        $ic11$ = SubLObjectFactory.makeSymbol("S#46264", "CYC");
        $ic12$ = SubLObjectFactory.makeString("Set forwarding descriptor");
        $ic13$ = SubLObjectFactory.makeSymbol("S#46262", "CYC");
        $ic14$ = SubLObjectFactory.makeString(" ");
        $ic15$ = SubLObjectFactory.makeString("forwarding-machine");
        $ic16$ = SubLObjectFactory.makeString("forwarding-port");
        $ic17$ = SubLObjectFactory.makeString("global");
        $ic18$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic19$ = SubLObjectFactory.makeString("Set Forwarding Parameters");
        $ic20$ = SubLObjectFactory.makeString("Machine: ");
        $ic21$ = SubLObjectFactory.makeString("Port: ");
        $ic22$ = SubLObjectFactory.makeSymbol("CB-UIA-HANDLE-FORWARDING-INFO");
        $ic23$ = SubLObjectFactory.makeSymbol("CB-UIA-HANDLE-FORWARDING-DEFAULT-INFO");
        $ic24$ = SubLObjectFactory.makeString("Forwarding Parameters");
        $ic25$ = SubLObjectFactory.makeString("cb-uia-handle-forwarding-info");
        $ic26$ = SubLObjectFactory.makeString(" Specify the machine name and base port number that will be doing the forwarding to the Cyc server (or the Cyc server machine itself and the server's base port number if not port forwarding).");
        $ic27$ = SubLObjectFactory.makeInteger(40);
        $ic28$ = SubLObjectFactory.makeString("Base Port: ");
        $ic29$ = SubLObjectFactory.makeString("Set for all users, including Java applications?  ");
        $ic30$ = SubLObjectFactory.makeString("Beware of using this option on shared images.");
        $ic31$ = SubLObjectFactory.makeString("Submit");
        $ic32$ = SubLObjectFactory.makeString("cb-uia-handle-forwarding-default-info");
        $ic33$ = SubLObjectFactory.makeString("Default");
        $ic34$ = SubLObjectFactory.makeSymbol("CB-UIA-FORWARDING-HANDLER");
        $ic35$ = SubLObjectFactory.makeSymbol("WITH-MACHINE-AND-BASE-PORT-FORWARDING");
        $ic36$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#688", "CYC"), (SubLObject)SubLObjectFactory.makeString("localhost")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46265", "CYC"), (SubLObject)SubLObjectFactory.makeInteger(3600))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MACHINE"), (SubLObject)SubLObjectFactory.makeKeyword("BASE-PORT"));
        $ic38$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic39$ = SubLObjectFactory.makeKeyword("MACHINE");
        $ic40$ = SubLObjectFactory.makeString("localhost");
        $ic41$ = SubLObjectFactory.makeKeyword("BASE-PORT");
        $ic42$ = SubLObjectFactory.makeInteger(3600);
        $ic43$ = SubLObjectFactory.makeSymbol("CLET");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0689.class
	Total time: 139 ms
	
	Decompiled with Procyon 0.5.32.
*/