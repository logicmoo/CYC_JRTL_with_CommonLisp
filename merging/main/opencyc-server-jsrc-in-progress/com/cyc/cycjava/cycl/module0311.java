package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0311 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0311";
    public static final String myFingerPrint = "6e4977cf3a3a9c64cf07c2d4c5158acc2f5d0c1aea7964806b7a8586f01da7f7";
    public static SubLSymbol $g2799$;
    public static SubLSymbol $g2800$;
    public static SubLSymbol $g2801$;
    public static SubLSymbol $g2802$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    
    public static SubLObject f21123(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic1$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f21124(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic2$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f21125(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return reader.bq_cons((SubLObject)$ic3$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f21126(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        final SubLObject var6 = (SubLObject)$ic4$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic0$, reader.bq_cons(reader.bq_cons(var6, (SubLObject)$ic5$), (SubLObject)$ic6$), (SubLObject)ConsesLow.list((SubLObject)$ic7$, reader.bq_cons((SubLObject)$ic3$, ConsesLow.append(var5, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic8$, var6)));
    }
    
    public static SubLObject f21127(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        final SubLObject var6 = (SubLObject)$ic9$;
        final SubLObject var7 = (SubLObject)$ic10$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic0$, (SubLObject)ConsesLow.listS(reader.bq_cons(var6, (SubLObject)$ic11$), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.listS((SubLObject)$ic12$, var6, (SubLObject)$ic5$)), (SubLObject)$ic6$), (SubLObject)ConsesLow.list((SubLObject)$ic7$, reader.bq_cons((SubLObject)$ic3$, ConsesLow.append(var5, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic13$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var7))));
    }
    
    public static SubLObject f21128() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0311", "f21123", "S#23739");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0311", "f21124", "S#23740");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0311", "f21125", "S#23741");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0311", "f21126", "S#23742");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0311", "f21127", "S#23743");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21129() {
        $g2799$ = SubLFiles.defparameter("S#23744", (SubLObject)NIL);
        $g2800$ = SubLFiles.defparameter("S#23745", (SubLObject)NIL);
        $g2801$ = SubLFiles.defparameter("S#23746", (SubLObject)NIL);
        $g2802$ = SubLFiles.defparameter("S#23747", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21130() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f21128();
    }
    
    public void initializeVariables() {
        f21129();
    }
    
    public void runTopLevelForms() {
        f21130();
    }
    
    static {
        me = (SubLFile)new module0311();
        $g2799$ = null;
        $g2800$ = null;
        $g2801$ = null;
        $g2802$ = null;
        $ic0$ = makeSymbol("CLET");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#23748", "CYC"), (SubLObject)T));
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#23748", "CYC"), (SubLObject)NIL));
        $ic3$ = makeSymbol("PROGN");
        $ic4$ = makeUninternedSymbol("US#352BA47");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#23749", "CYC")));
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#23747", "CYC"), (SubLObject)T));
        $ic7$ = makeSymbol("CUNWIND-PROTECT");
        $ic8$ = makeSymbol("S#23750", "CYC");
        $ic9$ = makeUninternedSymbol("US#428B99E");
        $ic10$ = makeUninternedSymbol("US#352BA47");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#23747", "CYC"));
        $ic12$ = makeSymbol("FUNLESS");
        $ic13$ = makeSymbol("PUNLESS");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 22 ms
	
	Decompiled with Procyon 0.5.32.
*/