package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0790 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0790";
    public static final String myFingerPrint = "d621bb6761b3d2fcb91687c1fa30ac2a9062bcf507f5a277907094508507b620";
    private static SubLSymbol $g6311$;
    private static SubLSymbol $g6312$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    
    public static SubLObject f50527(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0077.f5333(var2);
        SubLObject var4;
        SubLObject var5;
        SubLObject var6;
        for (var4 = module0032.f1741(var3), var5 = (SubLObject)module0790.NIL, var5 = module0032.f1742(var4, var3); module0790.NIL == module0032.f1744(var4, var5); var5 = module0032.f1743(var5)) {
            var6 = module0032.f1745(var4, var5);
            if (module0790.NIL != module0032.f1746(var5, var6) && var1.eql(module0059.f4334(var6))) {
                return var6;
            }
        }
        return (SubLObject)module0790.NIL;
    }
    
    public static SubLObject f50528(final SubLObject var7, final SubLObject var8, final SubLObject var1) {
        assert module0790.NIL != Types.function_spec_p(var8) : var8;
        assert module0790.NIL != Types.function_spec_p(var1) : var1;
        module0067.f4886(module0790.$g6312$.getGlobalValue(), var7, var1);
        module0067.f4886(module0790.$g6311$.getGlobalValue(), var7, var8);
        return (SubLObject)module0790.NIL;
    }
    
    public static SubLObject f50529(final SubLObject var7) {
        return module0067.f4884(module0790.$g6311$.getGlobalValue(), var7, (SubLObject)module0790.UNPROVIDED);
    }
    
    public static SubLObject f50530(final SubLObject var7) {
        return module0067.f4884(module0790.$g6312$.getGlobalValue(), var7, (SubLObject)module0790.UNPROVIDED);
    }
    
    public static SubLObject f50531(final SubLObject var9) {
        return Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(var9), new SubLObject[] { module0790.$ic3$, module0790.$ic4$ }), (SubLObject)module0790.UNPROVIDED);
    }
    
    public static SubLObject f50532(final SubLObject var10, final SubLObject var11, final SubLObject var12) {
        if (module0790.NIL != var11) {
            return (SubLObject)ConsesLow.list((SubLObject)module0790.$ic6$, var11, var10);
        }
        if (module0790.NIL != var10) {
            return (SubLObject)ConsesLow.list((SubLObject)module0790.$ic7$, var10);
        }
        return var12;
    }
    
    public static SubLObject f50533(final SubLObject var13, final SubLObject var14) {
        SubLObject var16;
        final SubLObject var15 = var16 = var13.rest();
        SubLObject var17 = (SubLObject)module0790.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0790.$ic8$);
        var17 = var16.first();
        var16 = var16.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0790.$ic8$);
        final SubLObject var18 = var16.rest();
        var16 = var16.first();
        SubLObject var19 = (SubLObject)module0790.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0790.$ic8$);
        var19 = var16.first();
        var16 = var16.rest();
        if (module0790.NIL == var16) {
            var16 = var18;
            cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0790.$ic8$);
            final SubLObject var20_21 = var16.rest();
            var16 = var16.first();
            SubLObject var20 = (SubLObject)module0790.NIL;
            SubLObject var21 = var16;
            SubLObject var22 = (SubLObject)module0790.NIL;
            SubLObject var25_26 = (SubLObject)module0790.NIL;
            while (module0790.NIL != var21) {
                cdestructuring_bind.destructuring_bind_must_consp(var21, var15, (SubLObject)module0790.$ic8$);
                var25_26 = var21.first();
                var21 = var21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var21, var15, (SubLObject)module0790.$ic8$);
                if (module0790.NIL == conses_high.member(var25_26, (SubLObject)module0790.$ic9$, (SubLObject)module0790.UNPROVIDED, (SubLObject)module0790.UNPROVIDED)) {
                    var22 = (SubLObject)module0790.T;
                }
                if (var25_26 == module0790.$ic10$) {
                    var20 = var21.first();
                }
                var21 = var21.rest();
            }
            if (module0790.NIL != var22 && module0790.NIL == var20) {
                cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)module0790.$ic8$);
            }
            final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)module0790.$ic11$, var16);
            final SubLObject var24 = (SubLObject)((module0790.NIL != var23) ? conses_high.cadr(var23) : module0790.NIL);
            final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)module0790.$ic12$, var16);
            final SubLObject var26 = (SubLObject)((module0790.NIL != var25) ? conses_high.cadr(var25) : module0790.NIL);
            final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)module0790.$ic13$, var16);
            final SubLObject var28 = (SubLObject)((module0790.NIL != var27) ? conses_high.cadr(var27) : module0790.NIL);
            final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)module0790.$ic14$, var16);
            final SubLObject var30 = (SubLObject)((module0790.NIL != var29) ? conses_high.cadr(var29) : module0790.NIL);
            final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)module0790.$ic15$, var16);
            final SubLObject var32 = (SubLObject)((module0790.NIL != var31) ? conses_high.cadr(var31) : module0790.NIL);
            final SubLObject var33;
            var16 = (var33 = var20_21);
            final SubLObject var34 = f50531(var17);
            final SubLObject var35 = Strings.string_downcase(Symbols.symbol_name(var34), (SubLObject)module0790.UNPROVIDED, (SubLObject)module0790.UNPROVIDED);
            return (SubLObject)ConsesLow.list((SubLObject)module0790.$ic16$, (SubLObject)ConsesLow.list((SubLObject)module0790.$ic17$, var34, (SubLObject)module0790.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0790.$ic19$, (SubLObject)module0790.$ic20$, (SubLObject)module0790.$ic21$, (SubLObject)ConsesLow.listS((SubLObject)module0790.$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.listS((SubLObject)module0790.$ic23$, (SubLObject)ConsesLow.list((SubLObject)module0790.$ic24$, var24), var24, (SubLObject)module0790.$ic25$))), ConsesLow.append(var33, (SubLObject)module0790.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0790.$ic26$, var17, (SubLObject)ConsesLow.list(var19), (SubLObject)ConsesLow.listS((SubLObject)module0790.$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0790.$ic27$, (SubLObject)ConsesLow.list((SubLObject)module0790.$ic23$, (SubLObject)ConsesLow.list((SubLObject)module0790.$ic28$, var24), var19))), (SubLObject)ConsesLow.list((SubLObject)module0790.$ic29$, (SubLObject)ConsesLow.listS((SubLObject)module0790.$ic30$, (SubLObject)module0790.$ic31$, var35, (SubLObject)module0790.$ic32$), f50532(var28, var30, var26), var32), (SubLObject)module0790.$ic33$)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)module0790.$ic8$);
        return (SubLObject)module0790.NIL;
    }
    
    public static SubLObject f50534() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0790", "f50527", "S#55064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0790", "f50528", "S#55065", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0790", "f50529", "S#55066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0790", "f50530", "S#55067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0790", "f50531", "S#55068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0790", "f50532", "S#55069", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0790", "f50533", "S#55070");
        return (SubLObject)module0790.NIL;
    }
    
    public static SubLObject f50535() {
        module0790.$g6311$ = SubLFiles.deflexical("S#55071", module0067.f4880(Symbols.symbol_function((SubLObject)module0790.EQL), (SubLObject)module0790.ZERO_INTEGER));
        module0790.$g6312$ = SubLFiles.deflexical("S#55072", module0067.f4880(Symbols.symbol_function((SubLObject)module0790.EQL), (SubLObject)module0790.ZERO_INTEGER));
        return (SubLObject)module0790.NIL;
    }
    
    public static SubLObject f50536() {
        module0002.f50((SubLObject)module0790.$ic1$, (SubLObject)module0790.$ic2$);
        module0002.f50((SubLObject)module0790.$ic5$, (SubLObject)module0790.$ic2$);
        return (SubLObject)module0790.NIL;
    }
    
    public void declareFunctions() {
        f50534();
    }
    
    public void initializeVariables() {
        f50535();
    }
    
    public void runTopLevelForms() {
        f50536();
    }
    
    static {
        me = (SubLFile)new module0790();
        module0790.$g6311$ = null;
        module0790.$g6312$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic1$ = SubLObjectFactory.makeSymbol("S#55068", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#55070", "CYC");
        $ic3$ = SubLObjectFactory.makeString("-");
        $ic4$ = SubLObjectFactory.makeString("HANDLER");
        $ic5$ = SubLObjectFactory.makeSymbol("S#55069", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#42805", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#1531", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6956", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43646", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9329", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1553", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("CONTENTS"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("IMAGE"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"));
        $ic10$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic11$ = SubLObjectFactory.makeKeyword("INDEX");
        $ic12$ = SubLObjectFactory.makeKeyword("CONTENTS");
        $ic13$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic14$ = SubLObjectFactory.makeKeyword("IMAGE");
        $ic15$ = SubLObjectFactory.makeKeyword("TARGET");
        $ic16$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic17$ = SubLObjectFactory.makeSymbol("S#1079", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic19$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#55073", "CYC"));
        $ic21$ = SubLObjectFactory.makeSymbol("S#105", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("CLET");
        $ic23$ = SubLObjectFactory.makeSymbol("FUNCALL");
        $ic24$ = SubLObjectFactory.makeSymbol("S#55066", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING-IGNORING-ERRORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#55073", "CYC")));
        $ic26$ = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $ic27$ = SubLObjectFactory.makeSymbol("S#1519", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#55067", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#43668", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#919", "CYC");
        $ic31$ = SubLObjectFactory.makeString("~a&~a");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)module0790.NIL));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0790.class
	Total time: 78 ms
	
	Decompiled with Procyon 0.5.32.
*/