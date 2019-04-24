package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0098 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0098";
    public static final String myFingerPrint = "a799f1ffbae1489d24bcb65be8dfdf1a8866494d20364bfbfc7aa191a1c9f075";
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    
    public static SubLObject f7022(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0098.NIL;
        SubLObject var6 = (SubLObject)module0098.NIL;
        SubLObject var7 = (SubLObject)module0098.NIL;
        SubLObject var8 = (SubLObject)module0098.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0098.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0098.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0098.$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0098.$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0098.NIL == var4) {
            final SubLObject var9 = (SubLObject)module0098.$ic1$;
            final SubLObject var10 = (SubLObject)module0098.$ic2$;
            final SubLObject var11 = (SubLObject)module0098.$ic3$;
            final SubLObject var12 = (SubLObject)module0098.$ic4$;
            final SubLObject var13 = (SubLObject)module0098.$ic5$;
            final SubLObject var14 = (SubLObject)module0098.$ic6$;
            return (SubLObject)ConsesLow.list((SubLObject)module0098.$ic7$, var5, var7, (SubLObject)ConsesLow.list((SubLObject)module0098.$ic8$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)module0098.$ic9$, (SubLObject)ConsesLow.list((SubLObject)module0098.$ic10$, var6), reader.bq_cons((SubLObject)module0098.$ic11$, ConsesLow.append(var7, (SubLObject)module0098.NIL))))), (SubLObject)ConsesLow.listS((SubLObject)module0098.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0098.$ic13$, var9), (SubLObject)ConsesLow.list((SubLObject)module0098.$ic14$, (SubLObject)module0098.$ic15$, var9), (SubLObject)module0098.$ic16$), (SubLObject)ConsesLow.list((SubLObject)module0098.$ic8$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)module0098.$ic17$, var9)), var13), (SubLObject)ConsesLow.list((SubLObject)module0098.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0098.$ic19$, (SubLObject)ConsesLow.list((SubLObject)module0098.$ic20$, var9)), (SubLObject)ConsesLow.list((SubLObject)module0098.$ic21$, var9), (SubLObject)ConsesLow.list((SubLObject)module0098.$ic8$, (SubLObject)ConsesLow.list(reader.bq_cons(var11, (SubLObject)module0098.$ic22$), var14), (SubLObject)ConsesLow.list((SubLObject)module0098.$ic23$, (SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.list((SubLObject)module0098.$ic10$, var8)), (SubLObject)ConsesLow.list((SubLObject)module0098.$ic24$, var11), (SubLObject)ConsesLow.list((SubLObject)module0098.$ic25$, (SubLObject)ConsesLow.list((SubLObject)module0098.$ic26$, var11, var10), (SubLObject)ConsesLow.list((SubLObject)module0098.$ic27$, var12, var14), (SubLObject)ConsesLow.list((SubLObject)module0098.$ic27$, (SubLObject)ConsesLow.list((SubLObject)module0098.$ic28$, var9, var11), var14))), (SubLObject)ConsesLow.list((SubLObject)module0098.$ic27$, (SubLObject)ConsesLow.list((SubLObject)module0098.$ic29$, var14), var13))), (SubLObject)ConsesLow.list((SubLObject)module0098.$ic30$, (SubLObject)ConsesLow.list((SubLObject)module0098.$ic29$, var13)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0098.$ic0$);
        return (SubLObject)module0098.NIL;
    }
    
    public static SubLObject f7023() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0098", "f7022", "S#8828");
        return (SubLObject)module0098.NIL;
    }
    
    public static SubLObject f7024() {
        return (SubLObject)module0098.NIL;
    }
    
    public static SubLObject f7025() {
        return (SubLObject)module0098.NIL;
    }
    
    public void declareFunctions() {
        f7023();
    }
    
    public void initializeVariables() {
        f7024();
    }
    
    public void runTopLevelForms() {
        f7025();
    }
    
    static {
        me = (SubLFile)new module0098();
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8829", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8830", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8831", "CYC"));
        $ic1$ = SubLObjectFactory.makeUninternedSymbol("US#6A2E4B9");
        $ic2$ = SubLObjectFactory.makeUninternedSymbol("US#410E874");
        $ic3$ = SubLObjectFactory.makeUninternedSymbol("US#24883");
        $ic4$ = SubLObjectFactory.makeUninternedSymbol("US#3165895");
        $ic5$ = SubLObjectFactory.makeUninternedSymbol("US#563B6C3");
        $ic6$ = SubLObjectFactory.makeUninternedSymbol("US#5D5B406");
        $ic7$ = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $ic8$ = SubLObjectFactory.makeSymbol("CLET");
        $ic9$ = SubLObjectFactory.makeSymbol("APPLY");
        $ic10$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic11$ = SubLObjectFactory.makeSymbol("LIST");
        $ic12$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic13$ = SubLObjectFactory.makeSymbol("S#8832", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("WARN");
        $ic15$ = SubLObjectFactory.makeString("SQLC error: ~A");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)module0098.NIL));
        $ic17$ = SubLObjectFactory.makeSymbol("S#8833", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic19$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic20$ = SubLObjectFactory.makeSymbol("S#8834", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#8835", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)module0098.ZERO_INTEGER);
        $ic23$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic24$ = SubLObjectFactory.makeSymbol("CINC");
        $ic25$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic26$ = SubLObjectFactory.makeSymbol("<=");
        $ic27$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic28$ = SubLObjectFactory.makeSymbol("S#8836", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("NREVERSE");
        $ic30$ = SubLObjectFactory.makeSymbol("RET");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0098.class
	Total time: 30 ms
	
	Decompiled with Procyon 0.5.32.
*/