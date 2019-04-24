package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0588 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0588";
    public static final String myFingerPrint = "e49eb82d73110ba847862928793a365b707f8db08904bfc0d2fb740faa6b2d5f";
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    
    public static SubLObject f35865(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0588.NIL;
        SubLObject var6 = (SubLObject)module0588.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0588.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0588.$ic0$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        if (module0588.NIL != var7) {
            final SubLObject var8 = (SubLObject)module0588.$ic1$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0588.$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, var5)), (SubLObject)ConsesLow.listS((SubLObject)module0588.$ic3$, var8, var6, (SubLObject)module0588.$ic4$), ConsesLow.append(var7, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0588.$ic5$, var8))));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0588.$ic3$, var5, var6, (SubLObject)module0588.$ic6$);
    }
    
    public static SubLObject f35866(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0588.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0588.$ic7$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0588.$ic8$, (SubLObject)module0588.$ic9$, var5, ConsesLow.append(var6, (SubLObject)module0588.NIL));
    }
    
    public static SubLObject f35867() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0588", "f35865", "S#1766");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0588", "f35866", "S#39595");
        return (SubLObject)module0588.NIL;
    }
    
    public static SubLObject f35868() {
        return (SubLObject)module0588.NIL;
    }
    
    public static SubLObject f35869() {
        return (SubLObject)module0588.NIL;
    }
    
    public void declareFunctions() {
        f35867();
    }
    
    public void initializeVariables() {
        f35868();
    }
    
    public void runTopLevelForms() {
        f35869();
    }
    
    static {
        me = (SubLFile)new module0588();
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1762", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeUninternedSymbol("US#333F606");
        $ic2$ = SubLObjectFactory.makeSymbol("CLET");
        $ic3$ = SubLObjectFactory.makeSymbol("S#39596", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)module0588.NIL);
        $ic5$ = SubLObjectFactory.makeSymbol("S#39597", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)module0588.T);
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1502", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic8$ = SubLObjectFactory.makeSymbol("FORMAT");
        $ic9$ = SubLObjectFactory.makeSymbol("S#1764", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0588.class
	Total time: 19 ms
	
	Decompiled with Procyon 0.5.32.
*/