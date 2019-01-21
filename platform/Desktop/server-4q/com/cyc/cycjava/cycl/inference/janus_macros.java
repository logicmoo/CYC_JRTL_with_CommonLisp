package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class janus_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.janus_macros";
    public static final String myFingerPrint = "2c8a2f76005522b75216eea405c2cb75a3289f863ce0c828abae8f87502c3493";
    private static final SubLSymbol $sym0$CLET;
    private static final SubLList $list1;
    private static final SubLList $list2;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus-macros.lisp", position = 864L)
    public static SubLObject janus_within_create(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)janus_macros.$sym0$CLET, (SubLObject)janus_macros.$list1, ConsesLow.append(body, (SubLObject)janus_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus-macros.lisp", position = 988L)
    public static SubLObject janus_within_assert(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)janus_macros.$sym0$CLET, (SubLObject)janus_macros.$list2, ConsesLow.append(body, (SubLObject)janus_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/janus-macros.lisp", position = 1146L)
    public static SubLObject janus_within_query(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)janus_macros.$sym0$CLET, (SubLObject)janus_macros.$list1, ConsesLow.append(body, (SubLObject)janus_macros.NIL));
    }
    
    public static SubLObject declare_janus_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.janus_macros", "janus_within_create", "JANUS-WITHIN-CREATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.janus_macros", "janus_within_assert", "JANUS-WITHIN-ASSERT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.janus_macros", "janus_within_query", "JANUS-WITHIN-QUERY");
        return (SubLObject)janus_macros.NIL;
    }
    
    public static SubLObject init_janus_macros_file() {
        return (SubLObject)janus_macros.NIL;
    }
    
    public static SubLObject setup_janus_macros_file() {
        return (SubLObject)janus_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_janus_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_janus_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_janus_macros_file();
    }
    
    static {
        me = (SubLFile)new janus_macros();
        $sym0$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*JANUS-WITHIN-SOMETHING?*"), (SubLObject)janus_macros.T));
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*JANUS-WITHIN-SOMETHING?*"), (SubLObject)janus_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*JANUS-EXTRACTION-DEDUCE-SPECS*"), (SubLObject)janus_macros.NIL));
    }
}

/*

	Total time: 63 ms
	
*/