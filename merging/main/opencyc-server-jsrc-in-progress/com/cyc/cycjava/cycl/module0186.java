package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0186 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0186";
    public static final String myFingerPrint = "94ab4958a1474942237def14f3a2b7deb6a415e01e7f35f919b321e15e4850a4";
    public static SubLSymbol $g2230$;
    private static SubLSymbol $g2231$;
    private static SubLSymbol $g2232$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLString $ic7$;
    
    public static SubLObject f11692(final SubLObject var1, final SubLObject var2) {
        $g2230$.setGlobalValue(kb_object_manager_oc.new_kb_object_manager((SubLObject)$ic3$, var1, $g2231$.getGlobalValue(), $g2232$.getGlobalValue(), (SubLObject)$ic4$, var2));
        return (SubLObject)T;
    }
    
    public static SubLObject f11693(final SubLObject var3) {
        return kb_object_manager_oc.f10430($g2230$.getGlobalValue(), var3);
    }
    
    public static SubLObject f11694() {
        return kb_object_manager_oc.f10431($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11695() {
        return kb_object_manager_oc.f10446($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11696() {
        return kb_object_manager_oc.f10447($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11697() {
        return kb_object_manager_oc.f10437($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11698() {
        return kb_object_manager_oc.f10447($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11699() {
        return kb_object_manager_oc.f10446($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11700() {
        return kb_object_manager_oc.f10437($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11701(final SubLObject var4, final SubLObject var5) {
        return kb_object_manager_oc.f10414($g2230$.getGlobalValue(), var4, var5);
    }
    
    public static SubLObject f11702() {
        return kb_object_manager_oc.f10417($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11703() {
        return kb_object_manager_oc.f10418($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11704(final SubLObject var6, final SubLObject var7) {
        final SubLObject var8 = var6.rest();
        final SubLObject var10;
        final SubLObject var9 = var10 = var8;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic6$, ConsesLow.append(var10, (SubLObject)NIL));
    }
    
    public static SubLObject f11705() {
        return kb_object_manager_oc.f10438($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11706() {
        return Numbers.numE(deduction_handles_oc.f11643(), f11705());
    }
    
    public static SubLObject f11707(final SubLObject var11) {
        return kb_object_manager_oc.f10439($g2230$.getGlobalValue(), deduction_handles_oc.f11649(var11));
    }
    
    public static SubLObject f11708(final SubLObject var12) {
        return kb_object_manager_oc.f10442($g2230$.getGlobalValue(), var12);
    }
    
    public static SubLObject f11709() {
        return kb_object_manager_oc.f10458($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11710(final SubLObject var12, final SubLObject var13) {
        return kb_object_manager_oc.f10448($g2230$.getGlobalValue(), var12, var13);
    }
    
    public static SubLObject f11711(final SubLObject var12) {
        return kb_object_manager_oc.f10449($g2230$.getGlobalValue(), var12);
    }
    
    public static SubLObject f11712(final SubLObject var12) {
        return kb_object_manager_oc.f10454($g2230$.getGlobalValue(), var12);
    }
    
    public static SubLObject f11713() {
        return kb_object_manager_oc.f10455($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11714() {
        return kb_object_manager_oc.f10456($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11715() {
        return kb_object_manager_oc.f10457($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11716() {
        return kb_object_manager_oc.f10436($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11717() {
        return kb_object_manager_oc.f10462($g2230$.getGlobalValue());
    }
    
    public static SubLObject f11718() {
        return kb_object_manager_oc.f10426($g2230$.getGlobalValue(), (SubLObject)$ic3$, (SubLObject)$ic7$);
    }
    
    public static SubLObject f11719() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11692", "S#14511", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11693", "S#14447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11694", "S#14453", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11695", "S#14512", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11696", "S#14513", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11697", "S#14514", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11698", "S#14515", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11699", "S#14516", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11700", "S#14517", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11701", "S#14518", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11702", "S#14519", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11703", "S#14520", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0186", "f11704", "S#14521");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11705", "S#14522", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11706", "S#9554", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11707", "S#14523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11708", "S#14524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11709", "S#14448", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11710", "S#14525", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11711", "S#14526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11712", "S#14527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11713", "S#14528", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11714", "S#14529", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11715", "S#14530", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11716", "S#14531", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11717", "S#14532", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0186", "f11718", "S#9543", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11720() {
        $g2230$ = SubLFiles.deflexical("S#14533", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2230$.getGlobalValue() : $ic1$));
        $g2231$ = SubLFiles.deflexical("S#14534", (SubLObject)EIGHT_INTEGER);
        $g2232$ = SubLFiles.deflexical("S#14535", (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11721() {
        module0003.f57((SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f11719();
    }
    
    public void initializeVariables() {
        f11720();
    }
    
    public void runTopLevelForms() {
        f11721();
    }
    
    static {
        me = (SubLFile)new module0186();
        $g2230$ = null;
        $g2231$ = null;
        $g2232$ = null;
        $ic0$ = makeSymbol("S#14533", "CYC");
        $ic1$ = makeKeyword("UNINITIALIZED");
        $ic2$ = makeInteger(400000);
        $ic3$ = makeString("deduction");
        $ic4$ = makeSymbol("S#14536", "CYC");
        $ic5$ = makeSymbol("S#13240", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#14533", "CYC"));
        $ic7$ = makeString("deduction-index");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 47 ms
	
	Decompiled with Procyon 0.5.32.
*/