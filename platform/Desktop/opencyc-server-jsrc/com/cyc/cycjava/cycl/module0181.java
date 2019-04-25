package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0181 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0181";
    public static final String myFingerPrint = "50f3d7856877689f9dc981b9d404119e44f8e98d3ed5b0ba54fdc9a7743c57cf";
    public static SubLSymbol $g2216$;
    private static SubLSymbol $g2217$;
    private static SubLSymbol $g2218$;
    private static SubLSymbol $g2219$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLInteger $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    
    public static SubLObject f11463(final SubLObject var1, final SubLObject var2) {
        module0181.$g2216$.setGlobalValue(oc_kb_object_manager.new_kb_object_manager((SubLObject)module0181.$ic3$, var1, module0181.$g2217$.getGlobalValue(), module0181.$g2218$.getGlobalValue(), (SubLObject)module0181.$ic4$, var2));
        return (SubLObject)module0181.T;
    }
    
    public static SubLObject f11464(final SubLObject var3) {
        return oc_kb_object_manager.f10430(module0181.$g2216$.getGlobalValue(), var3);
    }
    
    public static SubLObject f11465() {
        return oc_kb_object_manager.f10431(module0181.$g2216$.getGlobalValue());
    }
    
    public static SubLObject f11466() {
        return oc_kb_object_manager.f10446(module0181.$g2216$.getGlobalValue());
    }
    
    public static SubLObject f11467() {
        return oc_kb_object_manager.f10447(module0181.$g2216$.getGlobalValue());
    }
    
    public static SubLObject f11468() {
        return oc_kb_object_manager.f10437(module0181.$g2216$.getGlobalValue());
    }
    
    public static SubLObject f11469() {
        return oc_kb_object_manager.f10438(module0181.$g2216$.getGlobalValue());
    }
    
    public static SubLObject f11470() {
        return Numbers.numE(module0179.f11409(), f11469());
    }
    
    public static SubLObject f11471(final SubLObject var4) {
        return oc_kb_object_manager.f10439(module0181.$g2216$.getGlobalValue(), module0179.f11415(var4));
    }
    
    public static SubLObject f11472(final SubLObject var5) {
        return oc_kb_object_manager.f10442(module0181.$g2216$.getGlobalValue(), var5);
    }
    
    public static SubLObject f11473() {
        return oc_kb_object_manager.f10458(module0181.$g2216$.getGlobalValue());
    }
    
    public static SubLObject f11474(final SubLObject var5, final SubLObject var6) {
        return oc_kb_object_manager.f10448(module0181.$g2216$.getGlobalValue(), var5, var6);
    }
    
    public static SubLObject f11475(final SubLObject var5) {
        return oc_kb_object_manager.f10449(module0181.$g2216$.getGlobalValue(), var5);
    }
    
    public static SubLObject f11476(final SubLObject var5) {
        return oc_kb_object_manager.f10454(module0181.$g2216$.getGlobalValue(), var5);
    }
    
    public static SubLObject f11477() {
        return oc_kb_object_manager.f10455(module0181.$g2216$.getGlobalValue());
    }
    
    public static SubLObject f11478() {
        return oc_kb_object_manager.f10456(module0181.$g2216$.getGlobalValue());
    }
    
    public static SubLObject f11479() {
        return oc_kb_object_manager.f10457(module0181.$g2216$.getGlobalValue());
    }
    
    public static SubLObject f11480() {
        return oc_kb_object_manager.f10436(module0181.$g2216$.getGlobalValue());
    }
    
    public static SubLObject f11481() {
        return oc_kb_object_manager.f10462(module0181.$g2216$.getGlobalValue());
    }
    
    public static SubLObject f11482() {
        return oc_kb_object_manager.f10426(module0181.$g2216$.getGlobalValue(), (SubLObject)module0181.$ic3$, (SubLObject)module0181.$ic5$);
    }
    
    public static SubLObject f11483(final SubLObject var7, SubLObject var8) {
        if (var8 == module0181.UNPROVIDED) {
            var8 = (SubLObject)module0181.NIL;
        }
        return oc_kb_object_manager.f10464(module0181.$g2216$.getGlobalValue(), var7, var8);
    }
    
    public static SubLObject f11484() {
        if (module0181.$ic1$ == module0181.$g2216$.getGlobalValue()) {
            final SubLObject var1 = module0065.f4739(module0181.$g2219$.getGlobalValue());
            final SubLObject var2 = Numbers.min(module0181.$g2218$.getGlobalValue(), Numbers.multiply(Numbers.integerDivide(var1, (SubLObject)module0181.$ic8$), module0181.$g2217$.getGlobalValue()));
            final SubLObject var3 = module0089.f6070(var2, (SubLObject)module0181.UNPROVIDED);
            module0181.$g2216$.setGlobalValue(oc_kb_object_manager.f10429((SubLObject)module0181.$ic3$, module0181.$g2217$.getGlobalValue(), module0181.$g2218$.getGlobalValue(), module0181.$g2219$.getGlobalValue(), var3, (SubLObject)module0181.$ic1$, (SubLObject)module0181.$ic4$));
            return (SubLObject)module0181.T;
        }
        return (SubLObject)module0181.NIL;
    }
    
    public static SubLObject f11485(final SubLObject var11, final SubLObject var12) {
        return oc_kb_object_manager.f10414(module0181.$g2216$.getGlobalValue(), var11, var12);
    }
    
    public static SubLObject f11486() {
        return oc_kb_object_manager.f10417(module0181.$g2216$.getGlobalValue());
    }
    
    public static SubLObject f11487() {
        return oc_kb_object_manager.f10418(module0181.$g2216$.getGlobalValue());
    }
    
    public static SubLObject f11488(final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = var13.rest();
        final SubLObject var17;
        final SubLObject var16 = var17 = var15;
        return (SubLObject)ConsesLow.listS((SubLObject)module0181.$ic9$, (SubLObject)module0181.$ic10$, ConsesLow.append(var17, (SubLObject)module0181.NIL));
    }
    
    public static SubLObject f11489() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11463", "S#14193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11464", "S#14194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11465", "S#14195", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11466", "S#14275", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11467", "S#14276", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11468", "S#14277", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11469", "S#14278", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11470", "S#14279", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11471", "S#14280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11472", "S#14281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11473", "S#14282", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11474", "S#14283", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11475", "S#14284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11476", "S#14285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11477", "S#14286", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11478", "S#14287", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11479", "S#14288", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11480", "S#14289", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11481", "S#14290", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11482", "S#9550", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11483", "S#14291", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11484", "S#14292", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11485", "S#14293", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11486", "S#14294", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0181", "f11487", "S#14295", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0181", "f11488", "S#14296");
        return (SubLObject)module0181.NIL;
    }
    
    public static SubLObject f11490() {
        module0181.$g2216$ = SubLFiles.deflexical("S#14297", (SubLObject)((module0181.NIL != Symbols.boundp((SubLObject)module0181.$ic0$)) ? module0181.$g2216$.getGlobalValue() : module0181.$ic1$));
        module0181.$g2217$ = SubLFiles.deflexical("S#14298", (SubLObject)module0181.FIVE_INTEGER);
        module0181.$g2218$ = SubLFiles.deflexical("S#14299", (SubLObject)module0181.$ic2$);
        module0181.$g2219$ = SubLFiles.deflexical("S#14300", (SubLObject)((module0181.NIL != Symbols.boundp((SubLObject)module0181.$ic6$)) ? module0181.$g2219$.getGlobalValue() : module0181.NIL));
        return (SubLObject)module0181.NIL;
    }
    
    public static SubLObject f11491() {
        module0003.f57((SubLObject)module0181.$ic0$);
        module0003.f57((SubLObject)module0181.$ic6$);
        module0002.f35((SubLObject)module0181.$ic7$, (SubLObject)module0181.NIL);
        return (SubLObject)module0181.NIL;
    }
    
    public void declareFunctions() {
        f11489();
    }
    
    public void initializeVariables() {
        f11490();
    }
    
    public void runTopLevelForms() {
        f11491();
    }
    
    static {
        me = (SubLFile)new module0181();
        module0181.$g2216$ = null;
        module0181.$g2217$ = null;
        module0181.$g2218$ = null;
        module0181.$g2219$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#14297", "CYC");
        $ic1$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic2$ = SubLObjectFactory.makeInteger(10000);
        $ic3$ = SubLObjectFactory.makeString("kb-hl-support");
        $ic4$ = SubLObjectFactory.makeSymbol("S#14301", "CYC");
        $ic5$ = SubLObjectFactory.makeString("kb-hl-support-index");
        $ic6$ = SubLObjectFactory.makeSymbol("S#14300", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#14292", "CYC");
        $ic8$ = SubLObjectFactory.makeInteger(100);
        $ic9$ = SubLObjectFactory.makeSymbol("S#13240", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14297", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0181.class
	Total time: 57 ms
	
	Decompiled with Procyon 0.5.32.
*/