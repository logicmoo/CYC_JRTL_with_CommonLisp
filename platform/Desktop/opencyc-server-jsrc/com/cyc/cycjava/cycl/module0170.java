package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0170 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0170";
    public static final String myFingerPrint = "c25d894d038ed3a335049d3c96f2893a47ada00f086618ca1a6a6602de7c73c7";
    private static SubLSymbol $g2186$;
    private static SubLSymbol $g2187$;
    private static SubLSymbol $g2188$;
    private static SubLSymbol $g2189$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLInteger $ic8$;
    
    public static SubLObject f10873(final SubLObject var1, final SubLObject var2) {
        module0170.$g2186$.setGlobalValue(oc_kb_object_manager.new_kb_object_manager((SubLObject)module0170.$ic3$, var1, module0170.$g2187$.getGlobalValue(), module0170.$g2188$.getGlobalValue(), (SubLObject)module0170.$ic4$, var2));
        return (SubLObject)module0170.T;
    }
    
    public static SubLObject f10874(final SubLObject var3) {
        return oc_kb_object_manager.f10430(module0170.$g2186$.getGlobalValue(), var3);
    }
    
    public static SubLObject f10875() {
        return oc_kb_object_manager.f10431(module0170.$g2186$.getGlobalValue());
    }
    
    public static SubLObject f10876() {
        return oc_kb_object_manager.f10446(module0170.$g2186$.getGlobalValue());
    }
    
    public static SubLObject f10877() {
        return oc_kb_object_manager.f10447(module0170.$g2186$.getGlobalValue());
    }
    
    public static SubLObject f10878() {
        return oc_kb_object_manager.f10437(module0170.$g2186$.getGlobalValue());
    }
    
    public static SubLObject f10879() {
        return oc_kb_object_manager.f10438(module0170.$g2186$.getGlobalValue());
    }
    
    public static SubLObject f10880() {
        return Numbers.numE(module0167.f10796(), f10879());
    }
    
    public static SubLObject f10881(final SubLObject var4) {
        return oc_kb_object_manager.f10442(module0170.$g2186$.getGlobalValue(), var4);
    }
    
    public static SubLObject f10882() {
        return oc_kb_object_manager.f10458(module0170.$g2186$.getGlobalValue());
    }
    
    public static SubLObject f10883() {
        if (module0167.f10796().isZero()) {
            return (SubLObject)module0170.NIL;
        }
        return oc_kb_object_manager.f10445(module0170.$g2186$.getGlobalValue());
    }
    
    public static SubLObject f10884(final SubLObject var4, final SubLObject var5) {
        return oc_kb_object_manager.f10448(module0170.$g2186$.getGlobalValue(), var4, var5);
    }
    
    public static SubLObject f10885(final SubLObject var4) {
        return oc_kb_object_manager.f10449(module0170.$g2186$.getGlobalValue(), var4);
    }
    
    public static SubLObject f10886(final SubLObject var4) {
        return oc_kb_object_manager.f10454(module0170.$g2186$.getGlobalValue(), var4);
    }
    
    public static SubLObject f10887() {
        return oc_kb_object_manager.f10455(module0170.$g2186$.getGlobalValue());
    }
    
    public static SubLObject f10888() {
        return oc_kb_object_manager.f10456(module0170.$g2186$.getGlobalValue());
    }
    
    public static SubLObject f10889() {
        return oc_kb_object_manager.f10457(module0170.$g2186$.getGlobalValue());
    }
    
    public static SubLObject f10890() {
        return oc_kb_object_manager.f10436(module0170.$g2186$.getGlobalValue());
    }
    
    public static SubLObject f10891() {
        return oc_kb_object_manager.f10462(module0170.$g2186$.getGlobalValue());
    }
    
    public static SubLObject f10892() {
        return oc_kb_object_manager.f10426(module0170.$g2186$.getGlobalValue(), (SubLObject)module0170.$ic3$, (SubLObject)module0170.$ic5$);
    }
    
    public static SubLObject f10893() {
        return module0107.f7629(module0170.$g2186$.getGlobalValue());
    }
    
    public static SubLObject f10894() {
        if (module0170.$ic1$ == module0170.$g2186$.getGlobalValue()) {
            final SubLObject var1 = module0065.f4739(module0170.$g2189$.getGlobalValue());
            final SubLObject var2 = Numbers.min(module0170.$g2188$.getGlobalValue(), Numbers.multiply(Numbers.integerDivide(var1, (SubLObject)module0170.$ic8$), module0170.$g2187$.getGlobalValue()));
            final SubLObject var3 = module0089.f6070(var2, (SubLObject)module0170.UNPROVIDED);
            module0170.$g2186$.setGlobalValue(oc_kb_object_manager.f10429((SubLObject)module0170.$ic3$, module0170.$g2187$.getGlobalValue(), module0170.$g2188$.getGlobalValue(), module0170.$g2189$.getGlobalValue(), var3, (SubLObject)module0170.$ic1$, (SubLObject)module0170.$ic4$));
            return (SubLObject)module0170.T;
        }
        return (SubLObject)module0170.NIL;
    }
    
    public static SubLObject f10895() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10873", "S#13689", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10874", "S#13690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10875", "S#13606", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10876", "S#13691", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10877", "S#13692", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10878", "S#13693", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10879", "S#13694", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10880", "S#13695", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10881", "S#13696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10882", "S#13599", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10883", "S#13697", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10884", "S#13698", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10885", "S#13699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10886", "S#13700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10887", "S#13701", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10888", "S#13702", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10889", "S#13703", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10890", "S#13704", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10891", "S#13705", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10892", "S#9547", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10893", "S#13706", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0170", "f10894", "S#13707", 0, 0, false);
        return (SubLObject)module0170.NIL;
    }
    
    public static SubLObject f10896() {
        module0170.$g2186$ = SubLFiles.deflexical("S#13708", (SubLObject)((module0170.NIL != Symbols.boundp((SubLObject)module0170.$ic0$)) ? module0170.$g2186$.getGlobalValue() : module0170.$ic1$));
        module0170.$g2187$ = SubLFiles.deflexical("S#13709", (SubLObject)module0170.FIVE_INTEGER);
        module0170.$g2188$ = SubLFiles.deflexical("S#13710", (SubLObject)module0170.$ic2$);
        module0170.$g2189$ = SubLFiles.deflexical("S#13711", (SubLObject)((module0170.NIL != Symbols.boundp((SubLObject)module0170.$ic6$)) ? module0170.$g2189$.getGlobalValue() : module0170.NIL));
        return (SubLObject)module0170.NIL;
    }
    
    public static SubLObject f10897() {
        module0003.f57((SubLObject)module0170.$ic0$);
        module0003.f57((SubLObject)module0170.$ic6$);
        module0002.f35((SubLObject)module0170.$ic7$, (SubLObject)module0170.NIL);
        return (SubLObject)module0170.NIL;
    }
    
    public void declareFunctions() {
        f10895();
    }
    
    public void initializeVariables() {
        f10896();
    }
    
    public void runTopLevelForms() {
        f10897();
    }
    
    static {
        me = (SubLFile)new module0170();
        module0170.$g2186$ = null;
        module0170.$g2187$ = null;
        module0170.$g2188$ = null;
        module0170.$g2189$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#13708", "CYC");
        $ic1$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic2$ = SubLObjectFactory.makeInteger(10000);
        $ic3$ = SubLObjectFactory.makeString("nart-hl-formula");
        $ic4$ = SubLObjectFactory.makeSymbol("S#13712", "CYC");
        $ic5$ = SubLObjectFactory.makeString("nart-hl-formula-index");
        $ic6$ = SubLObjectFactory.makeSymbol("S#13711", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#13707", "CYC");
        $ic8$ = SubLObjectFactory.makeInteger(100);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0170.class
	Total time: 54 ms
	
	Decompiled with Procyon 0.5.32.
*/