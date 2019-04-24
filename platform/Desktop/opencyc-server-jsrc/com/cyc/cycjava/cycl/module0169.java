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

public final class module0169 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0169";
    public static final String myFingerPrint = "66925210595cb77c6b9eae59bd2094cbadd0400eadf67e75887c5d9dc8e4dc1c";
    public static SubLSymbol $g2183$;
    private static SubLSymbol $g2184$;
    private static SubLSymbol $g2185$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    
    public static SubLObject f10847(final SubLObject var1, final SubLObject var2) {
        module0169.$g2183$.setGlobalValue(module0160.f10412((SubLObject)module0169.$ic3$, var1, module0169.$g2184$.getGlobalValue(), module0169.$g2185$.getGlobalValue(), (SubLObject)module0169.$ic4$, var2));
        return (SubLObject)module0169.T;
    }
    
    public static SubLObject f10848(final SubLObject var3) {
        return module0160.f10430(module0169.$g2183$.getGlobalValue(), var3);
    }
    
    public static SubLObject f10849() {
        return module0160.f10431(module0169.$g2183$.getGlobalValue());
    }
    
    public static SubLObject f10850() {
        return module0160.f10446(module0169.$g2183$.getGlobalValue());
    }
    
    public static SubLObject f10851() {
        return module0160.f10447(module0169.$g2183$.getGlobalValue());
    }
    
    public static SubLObject f10852() {
        return module0160.f10437(module0169.$g2183$.getGlobalValue());
    }
    
    public static SubLObject f10853() {
        return module0160.f10438(module0169.$g2183$.getGlobalValue());
    }
    
    public static SubLObject f10854() {
        return Numbers.numE(module0167.f10796(), f10853());
    }
    
    public static SubLObject f10855(final SubLObject var4) {
        return module0160.f10442(module0169.$g2183$.getGlobalValue(), var4);
    }
    
    public static SubLObject f10856(final SubLObject var4) {
        return module0160.f10439(module0169.$g2183$.getGlobalValue(), var4);
    }
    
    public static SubLObject f10857(final SubLObject var4, final SubLObject var5) {
        return module0160.f10448(module0169.$g2183$.getGlobalValue(), var4, var5);
    }
    
    public static SubLObject f10858(final SubLObject var4) {
        return module0160.f10449(module0169.$g2183$.getGlobalValue(), var4);
    }
    
    public static SubLObject f10859(final SubLObject var4) {
        return module0160.f10454(module0169.$g2183$.getGlobalValue(), var4);
    }
    
    public static SubLObject f10860() {
        return module0160.f10455(module0169.$g2183$.getGlobalValue());
    }
    
    public static SubLObject f10861() {
        return module0160.f10456(module0169.$g2183$.getGlobalValue());
    }
    
    public static SubLObject f10862() {
        return module0160.f10457(module0169.$g2183$.getGlobalValue());
    }
    
    public static SubLObject f10863() {
        return module0160.f10436(module0169.$g2183$.getGlobalValue());
    }
    
    public static SubLObject f10864() {
        return module0160.f10462(module0169.$g2183$.getGlobalValue());
    }
    
    public static SubLObject f10865() {
        return module0160.f10426(module0169.$g2183$.getGlobalValue(), (SubLObject)module0169.$ic5$, (SubLObject)module0169.$ic6$);
    }
    
    public static SubLObject f10866(final SubLObject var6, final SubLObject var7) {
        return module0160.f10414(module0169.$g2183$.getGlobalValue(), var6, var7);
    }
    
    public static SubLObject f10867() {
        return module0160.f10417(module0169.$g2183$.getGlobalValue());
    }
    
    public static SubLObject f10868() {
        return module0160.f10418(module0169.$g2183$.getGlobalValue());
    }
    
    public static SubLObject f10869(final SubLObject var8, final SubLObject var9) {
        final SubLObject var10 = var8.rest();
        final SubLObject var12;
        final SubLObject var11 = var12 = var10;
        return (SubLObject)ConsesLow.listS((SubLObject)module0169.$ic7$, (SubLObject)module0169.$ic8$, ConsesLow.append(var12, (SubLObject)module0169.NIL));
    }
    
    public static SubLObject f10870() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10847", "S#13664", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10848", "S#13665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10849", "S#13666", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10850", "S#13667", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10851", "S#13668", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10852", "S#13669", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10853", "S#13670", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10854", "S#9557", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10855", "S#13671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10856", "S#13672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10857", "S#13673", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10858", "S#13674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10859", "S#13675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10860", "S#13676", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10861", "S#13677", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10862", "S#13678", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10863", "S#13679", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10864", "S#13680", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10865", "S#9546", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10866", "S#13681", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10867", "S#13682", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0169", "f10868", "S#13683", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0169", "f10869", "S#13684");
        return (SubLObject)module0169.NIL;
    }
    
    public static SubLObject f10871() {
        module0169.$g2183$ = SubLFiles.deflexical("S#13685", (SubLObject)((module0169.NIL != Symbols.boundp((SubLObject)module0169.$ic0$)) ? module0169.$g2183$.getGlobalValue() : module0169.$ic1$));
        module0169.$g2184$ = SubLFiles.deflexical("S#13686", (SubLObject)module0169.TWENTY_INTEGER);
        module0169.$g2185$ = SubLFiles.deflexical("S#13687", (SubLObject)module0169.$ic2$);
        return (SubLObject)module0169.NIL;
    }
    
    public static SubLObject f10872() {
        module0003.f57((SubLObject)module0169.$ic0$);
        return (SubLObject)module0169.NIL;
    }
    
    public void declareFunctions() {
        f10870();
    }
    
    public void initializeVariables() {
        f10871();
    }
    
    public void runTopLevelForms() {
        f10872();
    }
    
    static {
        me = (SubLFile)new module0169();
        module0169.$g2183$ = null;
        module0169.$g2184$ = null;
        module0169.$g2185$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#13685", "CYC");
        $ic1$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic2$ = SubLObjectFactory.makeInteger(30000);
        $ic3$ = SubLObjectFactory.makeString("nart-index");
        $ic4$ = SubLObjectFactory.makeSymbol("S#13688", "CYC");
        $ic5$ = SubLObjectFactory.makeString("nat-indices");
        $ic6$ = SubLObjectFactory.makeString("nat-indices-index");
        $ic7$ = SubLObjectFactory.makeSymbol("S#13240", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13685", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0169.class
	Total time: 44 ms
	
	Decompiled with Procyon 0.5.32.
*/