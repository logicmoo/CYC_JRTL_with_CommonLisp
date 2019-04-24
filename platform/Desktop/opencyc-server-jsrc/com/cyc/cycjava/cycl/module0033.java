package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0033 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0033";
    public static final String myFingerPrint = "843c982214b095576ef079cccf0a5ede01e5bd34071066bddd1f26e87a1450a2";
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
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    
    public static SubLObject f1758(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0033.$ic0$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0033.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0033.$ic0$);
        var7 = var5.first();
        var5 = var5.rest();
        if (module0033.NIL != var5) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0033.$ic0$);
            return (SubLObject)module0033.NIL;
        }
        final SubLObject var8;
        var5 = (var8 = var6);
        if (module0033.NIL != Sequences.find((SubLObject)module0033.$ic1$, reader.$features$.getDynamicValue(var3), (SubLObject)module0033.UNPROVIDED, (SubLObject)module0033.UNPROVIDED, (SubLObject)module0033.UNPROVIDED, (SubLObject)module0033.UNPROVIDED)) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0033.$ic2$, var7, ConsesLow.append(var8, (SubLObject)module0033.NIL));
        }
        final SubLObject var9 = (SubLObject)module0033.$ic3$;
        return (SubLObject)ConsesLow.list((SubLObject)module0033.$ic4$, (SubLObject)module0033.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0033.$ic2$, var7, ConsesLow.append(var8, (SubLObject)module0033.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0033.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var7)), (SubLObject)ConsesLow.list((SubLObject)module0033.$ic6$, var9), (SubLObject)ConsesLow.list((SubLObject)module0033.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0033.$ic8$, var9)), (SubLObject)ConsesLow.listS((SubLObject)module0033.$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0033.$ic9$, var9)), (SubLObject)ConsesLow.list((SubLObject)module0033.$ic10$, var9), ConsesLow.append(var8, (SubLObject)module0033.NIL)))));
    }
    
    public static SubLObject f1759(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0033.$ic0$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0033.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0033.$ic0$);
        var7 = var5.first();
        var5 = var5.rest();
        if (module0033.NIL != var5) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0033.$ic0$);
            return (SubLObject)module0033.NIL;
        }
        final SubLObject var8;
        var5 = (var8 = var6);
        if (module0033.NIL != Sequences.find((SubLObject)module0033.$ic1$, reader.$features$.getDynamicValue(var3), (SubLObject)module0033.UNPROVIDED, (SubLObject)module0033.UNPROVIDED, (SubLObject)module0033.UNPROVIDED, (SubLObject)module0033.UNPROVIDED)) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0033.$ic11$, var7, ConsesLow.append(var8, (SubLObject)module0033.NIL));
        }
        final SubLObject var9 = (SubLObject)module0033.$ic12$;
        return (SubLObject)ConsesLow.list((SubLObject)module0033.$ic4$, (SubLObject)module0033.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0033.$ic11$, var7, ConsesLow.append(var8, (SubLObject)module0033.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0033.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var7)), (SubLObject)ConsesLow.list((SubLObject)module0033.$ic13$, (SubLObject)ConsesLow.list((SubLObject)module0033.$ic14$, (SubLObject)ConsesLow.list((SubLObject)module0033.$ic15$, var9), (SubLObject)ConsesLow.listS((SubLObject)module0033.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0033.$ic16$, (SubLObject)ConsesLow.listS((SubLObject)module0033.$ic17$, var9, (SubLObject)module0033.$ic18$))), ConsesLow.append(var8, (SubLObject)module0033.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0033.$ic19$, var9))));
    }
    
    public static SubLObject f1760(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0033.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0033.$ic21$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0033.$ic22$;
        final SubLObject var8 = (SubLObject)module0033.$ic23$;
        return (SubLObject)ConsesLow.list((SubLObject)module0033.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5), reader.bq_cons(var8, (SubLObject)module0033.$ic24$)), (SubLObject)ConsesLow.list((SubLObject)module0033.$ic13$, (SubLObject)ConsesLow.listS((SubLObject)module0033.$ic14$, (SubLObject)ConsesLow.list((SubLObject)module0033.$ic25$, var8, (SubLObject)ConsesLow.list((SubLObject)module0033.$ic26$, var7)), ConsesLow.append(var6, (SubLObject)module0033.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0033.$ic27$, var8, (SubLObject)ConsesLow.list((SubLObject)module0033.$ic28$, var7))));
    }
    
    public static SubLObject f1761(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0033.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0033.$ic21$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0033.$ic30$;
        final SubLObject var8 = (SubLObject)module0033.$ic31$;
        return (SubLObject)ConsesLow.list((SubLObject)module0033.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5), reader.bq_cons(var8, (SubLObject)module0033.$ic24$)), (SubLObject)ConsesLow.list((SubLObject)module0033.$ic13$, (SubLObject)ConsesLow.listS((SubLObject)module0033.$ic14$, (SubLObject)ConsesLow.list((SubLObject)module0033.$ic25$, var8, (SubLObject)ConsesLow.list((SubLObject)module0033.$ic32$, var7)), ConsesLow.append(var6, (SubLObject)module0033.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0033.$ic27$, var8, (SubLObject)ConsesLow.list((SubLObject)module0033.$ic33$, var7))));
    }
    
    public static SubLObject f1762() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0033", "f1758", "S#3018");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0033", "f1759", "S#3019");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0033", "f1760", "S#3020");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0033", "f1761", "S#3021");
        return (SubLObject)module0033.NIL;
    }
    
    public static SubLObject f1763() {
        return (SubLObject)module0033.NIL;
    }
    
    public static SubLObject f1764() {
        module0002.f50((SubLObject)module0033.$ic2$, (SubLObject)module0033.$ic20$);
        module0002.f50((SubLObject)module0033.$ic11$, (SubLObject)module0033.$ic29$);
        return (SubLObject)module0033.NIL;
    }
    
    public void declareFunctions() {
        f1762();
    }
    
    public void initializeVariables() {
        f1763();
    }
    
    public void runTopLevelForms() {
        f1764();
    }
    
    static {
        me = (SubLFile)new module0033();
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3022", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeKeyword("SL2JAVA");
        $ic2$ = SubLObjectFactory.makeSymbol("S#3020", "CYC");
        $ic3$ = SubLObjectFactory.makeUninternedSymbol("US#28B71F0");
        $ic4$ = SubLObjectFactory.makeSymbol("PIF-FEATURE");
        $ic5$ = SubLObjectFactory.makeSymbol("CLET");
        $ic6$ = SubLObjectFactory.makeSymbol("S#3023", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $ic8$ = SubLObjectFactory.makeSymbol("S#3024", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#3025", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#3026", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#3021", "CYC");
        $ic12$ = SubLObjectFactory.makeUninternedSymbol("US#28B71F0");
        $ic13$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic14$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic15$ = SubLObjectFactory.makeSymbol("S#3027", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#3028", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("CONS");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3028", "CYC"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#3029", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#3018", "CYC");
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3022", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic22$ = SubLObjectFactory.makeUninternedSymbol("US#28B71F0");
        $ic23$ = SubLObjectFactory.makeUninternedSymbol("US#1442163");
        $ic24$ = ConsesLow.list((SubLObject)module0033.NIL);
        $ic25$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic26$ = SubLObjectFactory.makeSymbol("RW-LOCK-SEIZE-WRITE-LOCK");
        $ic27$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic28$ = SubLObjectFactory.makeSymbol("RW-LOCK-RELEASE-WRITE-LOCK");
        $ic29$ = SubLObjectFactory.makeSymbol("S#3019", "CYC");
        $ic30$ = SubLObjectFactory.makeUninternedSymbol("US#28B71F0");
        $ic31$ = SubLObjectFactory.makeUninternedSymbol("US#1442163");
        $ic32$ = SubLObjectFactory.makeSymbol("RW-LOCK-SEIZE-READ-LOCK");
        $ic33$ = SubLObjectFactory.makeSymbol("RW-LOCK-RELEASE-READ-LOCK");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0033.class
	Total time: 49 ms
	
	Decompiled with Procyon 0.5.32.
*/