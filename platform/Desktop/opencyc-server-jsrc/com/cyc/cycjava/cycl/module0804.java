package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0804 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0804";
    public static final String myFingerPrint = "cea4b21512cb02c6b0e636ec47052283a9d6e8881ae5d18068dc1484c813cd83";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    
    public static SubLObject f51243(final SubLObject var1) {
        return (SubLObject)module0804.NIL;
    }
    
    public static SubLObject f51244(final SubLObject var2) {
        return (SubLObject)module0804.$ic2$;
    }
    
    public static SubLObject f51245(final SubLObject var1) {
        return (SubLObject)module0804.NIL;
    }
    
    public static SubLObject f51246(final SubLObject var3) {
        return (SubLObject)module0804.NIL;
    }
    
    public static SubLObject f51247(final SubLObject var4) {
        return (SubLObject)module0804.NIL;
    }
    
    public static SubLObject f51248(final SubLObject var1) {
        return (SubLObject)module0804.NIL;
    }
    
    public static SubLObject f51249() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0804", "f51243", "GET-PASSAGES-FOR-ENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0804", "f51244", "RETURN-DOCUMENT-AS-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0804", "f51245", "TOPICS-RELATED-TO-ENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0804", "f51246", "ANSWER-GUI-QUESTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0804", "f51247", "IDENTIFY-ALL-GEQ-ENTITIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0804", "f51248", "GET-FOLLOWUPS-FOR-ENTITY", 1, 0, false);
        return (SubLObject)module0804.NIL;
    }
    
    public static SubLObject f51250() {
        return (SubLObject)module0804.NIL;
    }
    
    public static SubLObject f51251() {
        module0002.f38((SubLObject)module0804.$ic0$);
        module0002.f38((SubLObject)module0804.$ic1$);
        module0002.f38((SubLObject)module0804.$ic3$);
        module0002.f38((SubLObject)module0804.$ic4$);
        module0002.f38((SubLObject)module0804.$ic5$);
        module0002.f38((SubLObject)module0804.$ic6$);
        return (SubLObject)module0804.NIL;
    }
    
    public void declareFunctions() {
        f51249();
    }
    
    public void initializeVariables() {
        f51250();
    }
    
    public void runTopLevelForms() {
        f51251();
    }
    
    static {
        me = (SubLFile)new module0804();
        $ic0$ = SubLObjectFactory.makeSymbol("GET-PASSAGES-FOR-ENTITY");
        $ic1$ = SubLObjectFactory.makeSymbol("RETURN-DOCUMENT-AS-STRING");
        $ic2$ = SubLObjectFactory.makeString("");
        $ic3$ = SubLObjectFactory.makeSymbol("TOPICS-RELATED-TO-ENTITY");
        $ic4$ = SubLObjectFactory.makeSymbol("ANSWER-GUI-QUESTION");
        $ic5$ = SubLObjectFactory.makeSymbol("IDENTIFY-ALL-GEQ-ENTITIES");
        $ic6$ = SubLObjectFactory.makeSymbol("GET-FOLLOWUPS-FOR-ENTITY");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0804.class
	Total time: 28 ms
	
	Decompiled with Procyon 0.5.32.
*/