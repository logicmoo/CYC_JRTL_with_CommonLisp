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

public final class module0189 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0189";
    public static final String myFingerPrint = "2638498f462baa55cb8e17c0758ca8752723d68bcbad1b3112efe71895d68ad2";
    public static SubLSymbol $g2235$;
    private static SubLSymbol $g2236$;
    private static SubLSymbol $g2237$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    
    public static SubLObject f11802(final SubLObject var1, final SubLObject var2) {
        $g2235$.setGlobalValue(kb_object_manager_oc.new_kb_object_manager((SubLObject)$ic3$, var1, $g2236$.getGlobalValue(), $g2237$.getGlobalValue(), (SubLObject)$ic4$, var2));
        return (SubLObject)T;
    }
    
    public static SubLObject f11803(final SubLObject var3) {
        return kb_object_manager_oc.f10430($g2235$.getGlobalValue(), var3);
    }
    
    public static SubLObject f11804() {
        return kb_object_manager_oc.f10431($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11805() {
        return kb_object_manager_oc.f10446($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11806() {
        return kb_object_manager_oc.f10447($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11807() {
        return kb_object_manager_oc.f10437($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11808() {
        return kb_object_manager_oc.f10438($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11809() {
        return Numbers.numE(module0190.f11858(), f11808());
    }
    
    public static SubLObject f11810(final SubLObject var4) {
        return kb_object_manager_oc.f10442($g2235$.getGlobalValue(), var4);
    }
    
    public static SubLObject f11811() {
        return kb_object_manager_oc.f10447($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11812() {
        return kb_object_manager_oc.f10446($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11813() {
        return kb_object_manager_oc.f10437($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11814(final SubLObject var5, final SubLObject var6) {
        return kb_object_manager_oc.f10414($g2235$.getGlobalValue(), var5, var6);
    }
    
    public static SubLObject f11815() {
        return kb_object_manager_oc.f10417($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11816() {
        return kb_object_manager_oc.f10418($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11817(final SubLObject var7, final SubLObject var8) {
        final SubLObject var9 = var7.rest();
        final SubLObject var11;
        final SubLObject var10 = var11 = var9;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic6$, ConsesLow.append(var11, (SubLObject)NIL));
    }
    
    public static SubLObject f11818(final SubLObject var4, final SubLObject var12) {
        return kb_object_manager_oc.f10448($g2235$.getGlobalValue(), var4, var12);
    }
    
    public static SubLObject f11819(final SubLObject var4) {
        return kb_object_manager_oc.f10449($g2235$.getGlobalValue(), var4);
    }
    
    public static SubLObject f11820(final SubLObject var4) {
        return kb_object_manager_oc.f10454($g2235$.getGlobalValue(), var4);
    }
    
    public static SubLObject f11821() {
        return kb_object_manager_oc.f10455($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11822() {
        return kb_object_manager_oc.f10456($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11823() {
        return kb_object_manager_oc.f10457($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11824() {
        return kb_object_manager_oc.f10436($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11825() {
        return kb_object_manager_oc.f10462($g2235$.getGlobalValue());
    }
    
    public static SubLObject f11826() {
        return kb_object_manager_oc.f10426($g2235$.getGlobalValue(), (SubLObject)$ic7$, (SubLObject)$ic8$);
    }
    
    public static SubLObject f11827() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11802", "S#14598", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11803", "S#14599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11804", "S#14600", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11805", "S#14601", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11806", "S#14602", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11807", "S#14603", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11808", "S#14604", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11809", "S#9558", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11810", "S#14605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11811", "S#14606", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11812", "S#14607", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11813", "S#14608", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11814", "S#14609", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11815", "S#14610", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11816", "S#14611", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0189", "f11817", "S#14612");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11818", "S#14613", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11819", "S#14614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11820", "S#14615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11821", "S#14616", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11822", "S#14617", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11823", "S#14618", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11824", "S#14619", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11825", "S#14620", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0189", "f11826", "S#9549", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11828() {
        $g2235$ = SubLFiles.deflexical("S#14621", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2235$.getGlobalValue() : $ic1$));
        $g2236$ = SubLFiles.deflexical("S#14622", (SubLObject)TEN_INTEGER);
        $g2237$ = SubLFiles.deflexical("S#14623", (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11829() {
        module0003.f57((SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f11827();
    }
    
    public void initializeVariables() {
        f11828();
    }
    
    public void runTopLevelForms() {
        f11829();
    }
    
    static {
        me = (SubLFile)new module0189();
        $g2235$ = null;
        $g2236$ = null;
        $g2237$ = null;
        $ic0$ = makeSymbol("S#14621", "CYC");
        $ic1$ = makeKeyword("UNINITIALIZED");
        $ic2$ = makeInteger(40000);
        $ic3$ = makeString("unrepresented-term-index");
        $ic4$ = makeSymbol("S#14624", "CYC");
        $ic5$ = makeSymbol("S#13240", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#14621", "CYC"));
        $ic7$ = makeString("unrepresented-term-indices");
        $ic8$ = makeString("unrepresented-term-indices-index");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 46 ms
	
	Decompiled with Procyon 0.5.32.
*/