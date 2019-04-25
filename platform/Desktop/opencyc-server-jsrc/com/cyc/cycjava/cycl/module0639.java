package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0639 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0639";
    public static final String myFingerPrint = "cbdbd2cff9a78bf789f40d04e777fa5d6b726bd1f611bb52560342893fd06e1b";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    
    public static SubLObject f38960(final SubLObject var1, final SubLObject var2) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic0$, var1, var2);
    }
    
    public static SubLObject f38961(final SubLObject var3) {
        return conses_high.second(var3);
    }
    
    public static SubLObject f38962(final SubLObject var3) {
        return conses_high.third(var3);
    }
    
    public static SubLObject f38963(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        SubLObject var8;
        final SubLObject var7 = var8 = var6;
        SubLObject var9 = (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)$ic3$));
        while (NIL != var8) {
            var9 = ConsesLow.append(var9, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic2$, var8.first()), conses_high.cadr(var8)));
            var8 = conses_high.cddr(var8);
        }
        return var9;
    }
    
    public static SubLObject f38964(final SubLObject var1, final SubLObject var9) {
        for (SubLObject var10 = var1.rest(); NIL != var10; var10 = conses_high.cddr(var10)) {
            if (var10.first().eql(var9)) {
                return conses_high.cadr(var10);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38965(final SubLObject var10) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic4$, var10);
    }
    
    public static SubLObject f38966(final SubLObject var2) {
        return conses_high.second(var2);
    }
    
    public static SubLObject f38967(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic5$);
        var8 = var7.first();
        SubLObject var9;
        var7 = (var9 = var7.rest());
        SubLObject var10 = (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, var8));
        while (NIL != var9) {
            var10 = ConsesLow.append(var10, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic2$, var9.first()), conses_high.cadr(var9)));
            var9 = conses_high.cddr(var9);
        }
        return var10;
    }
    
    public static SubLObject f38968(final SubLObject var10) {
        return var10.first();
    }
    
    public static SubLObject f38969(final SubLObject var10, final SubLObject var9) {
        for (SubLObject var11 = var10.rest(); NIL != var11; var11 = conses_high.cddr(var11)) {
            if (var11.first().eql(var9)) {
                return conses_high.cadr(var11);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38970() {
        SubLObject var10 = (SubLObject)NIL;
        var10 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic6$, $ic7$, $ic8$, $ic9$, $ic10$, $ic11$, $ic12$, $ic13$, $ic14$, $ic15$, $ic16$, $ic17$, $ic18$, $ic19$, $ic20$, $ic21$, T });
        PrintLow.format((SubLObject)T, (SubLObject)$ic22$, var10);
        PrintLow.format((SubLObject)T, (SubLObject)$ic23$, f38968(var10));
        PrintLow.format((SubLObject)T, (SubLObject)$ic24$, f38969(var10, (SubLObject)$ic7$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38971() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0639", "f38960", "S#42681", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0639", "f38961", "S#42682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0639", "f38962", "S#42683", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0639", "f38963", "S#42684");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0639", "f38964", "S#42685", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0639", "f38965", "S#42686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0639", "f38966", "S#42687", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0639", "f38967", "S#42688");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0639", "f38968", "S#42689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0639", "f38969", "S#42690", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0639", "f38970", "S#42691", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38972() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38973() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f38971();
    }
    
    public void initializeVariables() {
        f38972();
    }
    
    public void runTopLevelForms() {
        f38973();
    }
    
    static {
        me = (SubLFile)new module0639();
        $ic0$ = makeSymbol("S#42692", "CYC");
        $ic1$ = makeSymbol("LIST");
        $ic2$ = makeSymbol("QUOTE");
        $ic3$ = makeSymbol("S#42693", "CYC");
        $ic4$ = makeSymbol("S#5858", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#42694", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#42695", "CYC"));
        $ic6$ = makeSymbol("S#42696", "CYC");
        $ic7$ = makeKeyword("SENDER");
        $ic8$ = makeSymbol("S#42697", "CYC");
        $ic9$ = makeKeyword("RECEIVER");
        $ic10$ = makeSymbol("S#42698", "CYC");
        $ic11$ = makeKeyword("REPLY-WITH");
        $ic12$ = makeSymbol("S#42699", "CYC");
        $ic13$ = makeKeyword("IN-REPLY-TO");
        $ic14$ = makeSymbol("S#42700", "CYC");
        $ic15$ = makeKeyword("CONTENT");
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("SOME"), (SubLObject)makeSymbol("S#1525", "CYC"));
        $ic17$ = makeKeyword("LANGUAGE");
        $ic18$ = makeSymbol("S#42701", "CYC");
        $ic19$ = makeKeyword("ONTOLOGY");
        $ic20$ = makeSymbol("S#42702", "CYC");
        $ic21$ = makeKeyword("FORCE");
        $ic22$ = makeString("~%amp-demo ~S~%");
        $ic23$ = makeString("amp-performative ~S~%");
        $ic24$ = makeString("amp-parm-value :sender ~S~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 31 ms
	
	Decompiled with Procyon 0.5.32.
*/