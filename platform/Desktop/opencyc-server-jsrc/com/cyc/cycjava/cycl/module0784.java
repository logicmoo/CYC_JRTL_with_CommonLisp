package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0784 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0784";
    public static final String myFingerPrint = "921fd79759a98a8deac852060ad70d2fe9e69a15b6ece7b9cf0ee0216f10b465";
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    
    public static SubLObject f50365(final SubLObject var1) {
        return module0035.f2327(var1);
    }
    
    public static SubLObject f50366() {
        return f50367((SubLObject)module0784.$ic0$);
    }
    
    public static SubLObject f50367(final SubLObject var2) {
        assert module0784.NIL != f50365(var2) : var2;
        return conses_high.copy_list(var2);
    }
    
    public static SubLObject f50368(final SubLObject var3, final SubLObject var4) {
        return conses_high.getf(var3, var4, (SubLObject)module0784.NIL);
    }
    
    public static SubLObject f50369(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        SubLObject var9 = (SubLObject)module0784.NIL;
        SubLObject var10 = (SubLObject)module0784.NIL;
        SubLObject var11 = (SubLObject)module0784.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0784.$ic2$);
        var9 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0784.$ic2$);
        var10 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0784.$ic2$);
        var11 = var8.first();
        var8 = var8.rest();
        if (module0784.NIL == var8) {
            return (SubLObject)ConsesLow.list((SubLObject)module0784.$ic3$, var9, (SubLObject)ConsesLow.list((SubLObject)module0784.$ic4$, var9, var10, var11));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)module0784.$ic2$);
        return (SubLObject)module0784.NIL;
    }
    
    public static SubLObject f50370(final SubLObject var3) {
        assert module0784.NIL != f50365(var3) : var3;
        return conses_high.getf(var3, (SubLObject)module0784.$ic5$, (SubLObject)module0784.UNPROVIDED);
    }
    
    public static SubLObject f50371(final SubLObject var3) {
        assert module0784.NIL != f50365(var3) : var3;
        return conses_high.getf(var3, (SubLObject)module0784.$ic6$, (SubLObject)module0784.UNPROVIDED);
    }
    
    public static SubLObject f50372(final SubLObject var3) {
        assert module0784.NIL != f50365(var3) : var3;
        return conses_high.getf(var3, (SubLObject)module0784.$ic7$, (SubLObject)module0784.UNPROVIDED);
    }
    
    public static SubLObject f50373(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        SubLObject var9 = (SubLObject)module0784.NIL;
        SubLObject var10 = (SubLObject)module0784.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0784.$ic8$);
        var9 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0784.$ic8$);
        var10 = var8.first();
        final SubLObject var11;
        var8 = (var11 = var8.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0784.$ic9$, var9, var10, ConsesLow.append(var11, (SubLObject)module0784.NIL));
    }
    
    public static SubLObject f50374(final SubLObject var1) {
        return module0077.f5302(var1);
    }
    
    public static SubLObject f50375() {
        return module0077.f5313(Symbols.symbol_function((SubLObject)module0784.EQUAL), (SubLObject)module0784.UNPROVIDED);
    }
    
    public static SubLObject f50376(final SubLObject var14, final SubLObject var2) {
        return module0077.f5326(var2, var14);
    }
    
    public static SubLObject f50377(final SubLObject var15) {
        final SubLObject var16 = module0035.remove_if_not((SubLObject)module0784.$ic10$, var15, (SubLObject)module0784.UNPROVIDED, (SubLObject)module0784.UNPROVIDED, (SubLObject)module0784.UNPROVIDED, (SubLObject)module0784.UNPROVIDED);
        return (module0784.NIL != var16) ? module0078.f5348(var16, Symbols.symbol_function((SubLObject)module0784.EQUAL)) : f50375();
    }
    
    public static SubLObject f50378(final SubLObject var14) {
        return module0078.f5367(module0077.f5312(var14), Symbols.symbol_function((SubLObject)module0784.EQUAL), (SubLObject)module0784.UNPROVIDED);
    }
    
    public static SubLObject f50379() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0784", "f50365", "S#54911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0784", "f50366", "S#54912", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0784", "f50367", "S#54913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0784", "f50368", "S#54914", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0784", "f50369", "S#54915");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0784", "f50370", "S#54916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0784", "f50371", "S#54917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0784", "f50372", "S#54918", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0784", "f50373", "S#54919");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0784", "f50374", "S#54920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0784", "f50375", "S#54921", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0784", "f50376", "S#54922", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0784", "f50377", "S#54923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0784", "f50378", "S#54924", 1, 0, false);
        return (SubLObject)module0784.NIL;
    }
    
    public static SubLObject f50380() {
        return (SubLObject)module0784.NIL;
    }
    
    public static SubLObject f50381() {
        return (SubLObject)module0784.NIL;
    }
    
    public void declareFunctions() {
        f50379();
    }
    
    public void initializeVariables() {
        f50380();
    }
    
    public void runTopLevelForms() {
        f50381();
    }
    
    static {
        me = (SubLFile)new module0784();
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS"), (SubLObject)module0784.T);
        $ic1$ = SubLObjectFactory.makeSymbol("S#54911", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54925", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic3$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic4$ = SubLObjectFactory.makeSymbol("PUTF");
        $ic5$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic6$ = SubLObjectFactory.makeKeyword("DENOT");
        $ic7$ = SubLObjectFactory.makeKeyword("POS-PRED");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54926", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic10$ = SubLObjectFactory.makeSymbol("S#54920", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0784.class
	Total time: 58 ms
	
	Decompiled with Procyon 0.5.32.
*/