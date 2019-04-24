package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0017 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0017";
    public static final String myFingerPrint = "2579610130ef7e25b71bc03f52006b5c0dffac10914faf6a84fb879556b1e8cd";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    
    public static SubLObject f945(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        SubLObject var6 = (SubLObject)module0017.NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0017.NIL;
        var8 = var7.first();
        while (module0017.NIL != var7) {
            var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0017.$ic0$, var8), var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return reader.bq_cons((SubLObject)module0017.$ic1$, ConsesLow.append(var6, (SubLObject)module0017.NIL));
    }
    
    public static SubLObject f946(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0017.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0017.$ic2$);
        var5 = var4.first();
        var4 = var4.rest();
        if (module0017.NIL == var4) {
            final SubLObject var6 = (SubLObject)module0017.$ic3$;
            final SubLObject var7 = (SubLObject)module0017.$ic4$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0017.$ic5$, Packages.intern(Sequences.cconcatenate((SubLObject)module0017.$ic6$, Symbols.symbol_name(var5)), (SubLObject)module0017.UNPROVIDED), (SubLObject)ConsesLow.list(var6, (SubLObject)module0017.$ic7$, var7), (SubLObject)ConsesLow.list((SubLObject)module0017.$ic8$, Strings.string_downcase(Symbols.symbol_name(var5), (SubLObject)module0017.UNPROVIDED, (SubLObject)module0017.UNPROVIDED), var6, var7), (SubLObject)module0017.$ic9$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0017.$ic2$);
        return (SubLObject)module0017.NIL;
    }
    
    public static SubLObject f947(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0017.NIL;
        SubLObject var6 = (SubLObject)module0017.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0017.$ic10$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0017.$ic10$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0017.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0017.$ic11$, (SubLObject)module0017.$ic12$, (SubLObject)module0017.$ic13$, (SubLObject)module0017.$ic14$, (SubLObject)ConsesLow.listS((SubLObject)module0017.$ic15$, var5, var6, ConsesLow.append(var7, (SubLObject)module0017.NIL))));
    }
    
    public static SubLObject f948(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0017.NIL;
        SubLObject var6 = (SubLObject)module0017.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0017.$ic10$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0017.$ic10$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0017.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0017.$ic11$, (SubLObject)module0017.$ic12$, (SubLObject)module0017.$ic13$, (SubLObject)module0017.$ic14$, (SubLObject)ConsesLow.listS((SubLObject)module0017.$ic15$, var5, var6, (SubLObject)ConsesLow.listS((SubLObject)module0017.$ic16$, (SubLObject)module0017.$ic17$, ConsesLow.append(var7, (SubLObject)module0017.NIL)), (SubLObject)module0017.$ic18$)));
    }
    
    public static SubLObject f949() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0017", "f945", "S#1757");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0017", "f946", "S#1758");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0017", "f947", "S#1759");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0017", "f948", "S#1760");
        return (SubLObject)module0017.NIL;
    }
    
    public static SubLObject f950() {
        return (SubLObject)module0017.NIL;
    }
    
    public static SubLObject f951() {
        return (SubLObject)module0017.NIL;
    }
    
    public void declareFunctions() {
        f949();
    }
    
    public void initializeVariables() {
        f950();
    }
    
    public void runTopLevelForms() {
        f951();
    }
    
    static {
        me = (SubLFile)new module0017();
        $ic0$ = SubLObjectFactory.makeSymbol("S#1758", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"));
        $ic3$ = SubLObjectFactory.makeUninternedSymbol("US#13E10CB");
        $ic4$ = SubLObjectFactory.makeUninternedSymbol("US#3E3E239");
        $ic5$ = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $ic6$ = SubLObjectFactory.makeString("CYCML-SERIALIZE-");
        $ic7$ = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $ic8$ = SubLObjectFactory.makeSymbol("S#1761", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)module0017.NIL));
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1762", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic11$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic12$ = SubLObjectFactory.makeSymbol("S#1763", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("S#1764", "CYC"), (SubLObject)SubLObjectFactory.makeString("~&"));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1765", "CYC"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#1766", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("CLET");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1767", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("S#1767", "CYC"))));
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("S#1763", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("S#1764", "CYC"), (SubLObject)SubLObjectFactory.makeString("~&")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1765", "CYC"))));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0017.class
	Total time: 30 ms
	
	Decompiled with Procyon 0.5.32.
*/