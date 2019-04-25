package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        $g2216$.setGlobalValue(kb_object_manager_oc.new_kb_object_manager((SubLObject)$ic3$, var1, $g2217$.getGlobalValue(), $g2218$.getGlobalValue(), (SubLObject)$ic4$, var2));
        return (SubLObject)T;
    }
    
    public static SubLObject f11464(final SubLObject var3) {
        return kb_object_manager_oc.f10430($g2216$.getGlobalValue(), var3);
    }
    
    public static SubLObject f11465() {
        return kb_object_manager_oc.f10431($g2216$.getGlobalValue());
    }
    
    public static SubLObject f11466() {
        return kb_object_manager_oc.f10446($g2216$.getGlobalValue());
    }
    
    public static SubLObject f11467() {
        return kb_object_manager_oc.f10447($g2216$.getGlobalValue());
    }
    
    public static SubLObject f11468() {
        return kb_object_manager_oc.f10437($g2216$.getGlobalValue());
    }
    
    public static SubLObject f11469() {
        return kb_object_manager_oc.f10438($g2216$.getGlobalValue());
    }
    
    public static SubLObject f11470() {
        return Numbers.numE(module0179.f11409(), f11469());
    }
    
    public static SubLObject f11471(final SubLObject var4) {
        return kb_object_manager_oc.f10439($g2216$.getGlobalValue(), module0179.f11415(var4));
    }
    
    public static SubLObject f11472(final SubLObject var5) {
        return kb_object_manager_oc.f10442($g2216$.getGlobalValue(), var5);
    }
    
    public static SubLObject f11473() {
        return kb_object_manager_oc.f10458($g2216$.getGlobalValue());
    }
    
    public static SubLObject f11474(final SubLObject var5, final SubLObject var6) {
        return kb_object_manager_oc.f10448($g2216$.getGlobalValue(), var5, var6);
    }
    
    public static SubLObject f11475(final SubLObject var5) {
        return kb_object_manager_oc.f10449($g2216$.getGlobalValue(), var5);
    }
    
    public static SubLObject f11476(final SubLObject var5) {
        return kb_object_manager_oc.f10454($g2216$.getGlobalValue(), var5);
    }
    
    public static SubLObject f11477() {
        return kb_object_manager_oc.f10455($g2216$.getGlobalValue());
    }
    
    public static SubLObject f11478() {
        return kb_object_manager_oc.f10456($g2216$.getGlobalValue());
    }
    
    public static SubLObject f11479() {
        return kb_object_manager_oc.f10457($g2216$.getGlobalValue());
    }
    
    public static SubLObject f11480() {
        return kb_object_manager_oc.f10436($g2216$.getGlobalValue());
    }
    
    public static SubLObject f11481() {
        return kb_object_manager_oc.f10462($g2216$.getGlobalValue());
    }
    
    public static SubLObject f11482() {
        return kb_object_manager_oc.f10426($g2216$.getGlobalValue(), (SubLObject)$ic3$, (SubLObject)$ic5$);
    }
    
    public static SubLObject f11483(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        return kb_object_manager_oc.f10464($g2216$.getGlobalValue(), var7, var8);
    }
    
    public static SubLObject f11484() {
        if ($ic1$ == $g2216$.getGlobalValue()) {
            final SubLObject var1 = module0065.f4739($g2219$.getGlobalValue());
            final SubLObject var2 = Numbers.min($g2218$.getGlobalValue(), Numbers.multiply(Numbers.integerDivide(var1, (SubLObject)$ic8$), $g2217$.getGlobalValue()));
            final SubLObject var3 = module0089.f6070(var2, (SubLObject)UNPROVIDED);
            $g2216$.setGlobalValue(kb_object_manager_oc.f10429((SubLObject)$ic3$, $g2217$.getGlobalValue(), $g2218$.getGlobalValue(), $g2219$.getGlobalValue(), var3, (SubLObject)$ic1$, (SubLObject)$ic4$));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11485(final SubLObject var11, final SubLObject var12) {
        return kb_object_manager_oc.f10414($g2216$.getGlobalValue(), var11, var12);
    }
    
    public static SubLObject f11486() {
        return kb_object_manager_oc.f10417($g2216$.getGlobalValue());
    }
    
    public static SubLObject f11487() {
        return kb_object_manager_oc.f10418($g2216$.getGlobalValue());
    }
    
    public static SubLObject f11488(final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = var13.rest();
        final SubLObject var17;
        final SubLObject var16 = var17 = var15;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic9$, (SubLObject)$ic10$, ConsesLow.append(var17, (SubLObject)NIL));
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11490() {
        $g2216$ = SubLFiles.deflexical("S#14297", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2216$.getGlobalValue() : $ic1$));
        $g2217$ = SubLFiles.deflexical("S#14298", (SubLObject)FIVE_INTEGER);
        $g2218$ = SubLFiles.deflexical("S#14299", (SubLObject)$ic2$);
        $g2219$ = SubLFiles.deflexical("S#14300", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic6$)) ? $g2219$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11491() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic6$);
        module0002.f35((SubLObject)$ic7$, (SubLObject)NIL);
        return (SubLObject)NIL;
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
        $g2216$ = null;
        $g2217$ = null;
        $g2218$ = null;
        $g2219$ = null;
        $ic0$ = makeSymbol("S#14297", "CYC");
        $ic1$ = makeKeyword("UNINITIALIZED");
        $ic2$ = makeInteger(10000);
        $ic3$ = makeString("kb-hl-support");
        $ic4$ = makeSymbol("S#14301", "CYC");
        $ic5$ = makeString("kb-hl-support-index");
        $ic6$ = makeSymbol("S#14300", "CYC");
        $ic7$ = makeSymbol("S#14292", "CYC");
        $ic8$ = makeInteger(100);
        $ic9$ = makeSymbol("S#13240", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("S#14297", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 57 ms
	
	Decompiled with Procyon 0.5.32.
*/