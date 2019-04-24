package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0587 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0587";
    public static final String myFingerPrint = "e417cdcddd60e927d56dc3653771fc4c7837808975ce82f42bff99eafddcaefd";
    public static SubLSymbol $g4457$;
    public static SubLSymbol $g4458$;
    public static SubLSymbol $g4459$;
    public static SubLSymbol $g4460$;
    public static SubLSymbol $g4461$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    
    public static SubLObject f35862() {
        return (SubLObject)module0587.NIL;
    }
    
    public static SubLObject f35863() {
        module0587.$g4457$ = SubLFiles.defparameter("S#1764", (SubLObject)module0587.T);
        module0587.$g4458$ = SubLFiles.defparameter("S#39591", (SubLObject)module0587.$ic0$);
        module0587.$g4459$ = SubLFiles.deflexical("S#39592", (SubLObject)module0587.$ic1$);
        module0587.$g4460$ = SubLFiles.deflexical("S#39593", (SubLObject)module0587.$ic2$);
        module0587.$g4461$ = SubLFiles.defparameter("S#39594", module0107.f7627());
        return (SubLObject)module0587.NIL;
    }
    
    public static SubLObject f35864() {
        return (SubLObject)module0587.NIL;
    }
    
    public void declareFunctions() {
        f35862();
    }
    
    public void initializeVariables() {
        f35863();
    }
    
    public void runTopLevelForms() {
        f35864();
    }
    
    static {
        me = (SubLFile)new module0587();
        module0587.$g4457$ = null;
        module0587.$g4458$ = null;
        module0587.$g4459$ = null;
        module0587.$g4460$ = null;
        module0587.$g4461$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_ampersand, (SubLObject)SubLObjectFactory.makeString("amp")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_less, (SubLObject)SubLObjectFactory.makeString("lt")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_greater, (SubLObject)SubLObjectFactory.makeString("gt")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_quotation, (SubLObject)SubLObjectFactory.makeString("quot")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_quote, (SubLObject)SubLObjectFactory.makeString("apos")));
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0587.NINE_INTEGER, (SubLObject)module0587.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)module0587.TEN_INTEGER, (SubLObject)module0587.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)module0587.THIRTEEN_INTEGER, (SubLObject)module0587.THIRTEEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(32), (SubLObject)SubLObjectFactory.makeInteger(32)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(33), (SubLObject)SubLObjectFactory.makeInteger(55295)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(57344), (SubLObject)SubLObjectFactory.makeInteger(65533)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(65536), (SubLObject)SubLObjectFactory.makeInteger(1114111)));
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("quot"), (SubLObject)SubLObjectFactory.makeInteger(34)), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("amp"), (SubLObject)SubLObjectFactory.makeInteger(38)), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("apos"), (SubLObject)SubLObjectFactory.makeInteger(39)), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lt"), (SubLObject)SubLObjectFactory.makeInteger(60)), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("gt"), (SubLObject)SubLObjectFactory.makeInteger(62)));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0587.class
	Total time: 22 ms
	
	Decompiled with Procyon 0.5.32.
*/