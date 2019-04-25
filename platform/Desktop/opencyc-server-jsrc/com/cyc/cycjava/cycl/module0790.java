package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        for (var4 = module0032.f1741(var3), var5 = (SubLObject)NIL, var5 = module0032.f1742(var4, var3); NIL == module0032.f1744(var4, var5); var5 = module0032.f1743(var5)) {
            var6 = module0032.f1745(var4, var5);
            if (NIL != module0032.f1746(var5, var6) && var1.eql(module0059.f4334(var6))) {
                return var6;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50528(final SubLObject var7, final SubLObject var8, final SubLObject var1) {
        assert NIL != Types.function_spec_p(var8) : var8;
        assert NIL != Types.function_spec_p(var1) : var1;
        module0067.f4886($g6312$.getGlobalValue(), var7, var1);
        module0067.f4886($g6311$.getGlobalValue(), var7, var8);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50529(final SubLObject var7) {
        return module0067.f4884($g6311$.getGlobalValue(), var7, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50530(final SubLObject var7) {
        return module0067.f4884($g6312$.getGlobalValue(), var7, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50531(final SubLObject var9) {
        return Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(var9), new SubLObject[] { $ic3$, $ic4$ }), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50532(final SubLObject var10, final SubLObject var11, final SubLObject var12) {
        if (NIL != var11) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic6$, var11, var10);
        }
        if (NIL != var10) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic7$, var10);
        }
        return var12;
    }
    
    public static SubLObject f50533(final SubLObject var13, final SubLObject var14) {
        SubLObject var16;
        final SubLObject var15 = var16 = var13.rest();
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic8$);
        var17 = var16.first();
        var16 = var16.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic8$);
        final SubLObject var18 = var16.rest();
        var16 = var16.first();
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic8$);
        var19 = var16.first();
        var16 = var16.rest();
        if (NIL == var16) {
            var16 = var18;
            cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic8$);
            final SubLObject var20_21 = var16.rest();
            var16 = var16.first();
            SubLObject var20 = (SubLObject)NIL;
            SubLObject var21 = var16;
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var25_26 = (SubLObject)NIL;
            while (NIL != var21) {
                cdestructuring_bind.destructuring_bind_must_consp(var21, var15, (SubLObject)$ic8$);
                var25_26 = var21.first();
                var21 = var21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var21, var15, (SubLObject)$ic8$);
                if (NIL == conses_high.member(var25_26, (SubLObject)$ic9$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var22 = (SubLObject)T;
                }
                if (var25_26 == $ic10$) {
                    var20 = var21.first();
                }
                var21 = var21.rest();
            }
            if (NIL != var22 && NIL == var20) {
                cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)$ic8$);
            }
            final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var16);
            final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : NIL);
            final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var16);
            final SubLObject var26 = (SubLObject)((NIL != var25) ? conses_high.cadr(var25) : NIL);
            final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var16);
            final SubLObject var28 = (SubLObject)((NIL != var27) ? conses_high.cadr(var27) : NIL);
            final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)$ic14$, var16);
            final SubLObject var30 = (SubLObject)((NIL != var29) ? conses_high.cadr(var29) : NIL);
            final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)$ic15$, var16);
            final SubLObject var32 = (SubLObject)((NIL != var31) ? conses_high.cadr(var31) : NIL);
            final SubLObject var33;
            var16 = (var33 = var20_21);
            final SubLObject var34 = f50531(var17);
            final SubLObject var35 = Strings.string_downcase(Symbols.symbol_name(var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var34, (SubLObject)$ic18$, (SubLObject)ConsesLow.list((SubLObject)$ic19$, (SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)ConsesLow.listS((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.listS((SubLObject)$ic23$, (SubLObject)ConsesLow.list((SubLObject)$ic24$, var24), var24, (SubLObject)$ic25$))), ConsesLow.append(var33, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic26$, var17, (SubLObject)ConsesLow.list(var19), (SubLObject)ConsesLow.listS((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic27$, (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)ConsesLow.list((SubLObject)$ic28$, var24), var19))), (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.listS((SubLObject)$ic30$, (SubLObject)$ic31$, var35, (SubLObject)$ic32$), f50532(var28, var30, var26), var32), (SubLObject)$ic33$)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var15, (SubLObject)$ic8$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50534() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0790", "f50527", "S#55064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0790", "f50528", "S#55065", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0790", "f50529", "S#55066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0790", "f50530", "S#55067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0790", "f50531", "S#55068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0790", "f50532", "S#55069", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0790", "f50533", "S#55070");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50535() {
        $g6311$ = SubLFiles.deflexical("S#55071", module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)ZERO_INTEGER));
        $g6312$ = SubLFiles.deflexical("S#55072", module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)ZERO_INTEGER));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50536() {
        module0002.f50((SubLObject)$ic1$, (SubLObject)$ic2$);
        module0002.f50((SubLObject)$ic5$, (SubLObject)$ic2$);
        return (SubLObject)NIL;
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
        $g6311$ = null;
        $g6312$ = null;
        $ic0$ = makeSymbol("FUNCTION-SPEC-P");
        $ic1$ = makeSymbol("S#55068", "CYC");
        $ic2$ = makeSymbol("S#55070", "CYC");
        $ic3$ = makeString("-");
        $ic4$ = makeString("HANDLER");
        $ic5$ = makeSymbol("S#55069", "CYC");
        $ic6$ = makeSymbol("S#42805", "CYC");
        $ic7$ = makeSymbol("S#1531", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#6956", "CYC"), (SubLObject)makeSymbol("S#43646", "CYC"), (SubLObject)makeSymbol("S#9329", "CYC"), (SubLObject)makeSymbol("S#1553", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic9$ = ConsesLow.list((SubLObject)makeKeyword("INDEX"), (SubLObject)makeKeyword("CONTENTS"), (SubLObject)makeKeyword("TEXT"), (SubLObject)makeKeyword("IMAGE"), (SubLObject)makeKeyword("TARGET"));
        $ic10$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic11$ = makeKeyword("INDEX");
        $ic12$ = makeKeyword("CONTENTS");
        $ic13$ = makeKeyword("TEXT");
        $ic14$ = makeKeyword("IMAGE");
        $ic15$ = makeKeyword("TARGET");
        $ic16$ = makeSymbol("PROGN");
        $ic17$ = makeSymbol("S#1079", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("S#105", "CYC"));
        $ic19$ = makeSymbol("CDESTRUCTURING-BIND");
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#55073", "CYC"));
        $ic21$ = makeSymbol("S#105", "CYC");
        $ic22$ = makeSymbol("CLET");
        $ic23$ = makeSymbol("FUNCALL");
        $ic24$ = makeSymbol("S#55066", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("READ-FROM-STRING-IGNORING-ERRORS"), (SubLObject)makeSymbol("S#55073", "CYC")));
        $ic26$ = makeSymbol("DEFINE-PRIVATE");
        $ic27$ = makeSymbol("S#1519", "CYC");
        $ic28$ = makeSymbol("S#55067", "CYC");
        $ic29$ = makeSymbol("S#43668", "CYC");
        $ic30$ = makeSymbol("S#919", "CYC");
        $ic31$ = makeString("~a&~a");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)NIL));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 78 ms
	
	Decompiled with Procyon 0.5.32.
*/