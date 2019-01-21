package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexical_disambiguator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.lexical_disambiguator";
    public static final String myFingerPrint = "77a9e285f2b870f29f26be336acd65dce75291cba1beaa40c9b1b36bb00ae57f";
    private static final SubLSymbol $sym0$LEXICAL_DISAMBIGUATOR;
    private static final SubLList $list1;
    
    @SubLTranslatedFile.SubL(source = "cycl/lexical-disambiguator.lisp", position = 1313L)
    public static SubLObject lexical_disambiguator_p(final SubLObject v_lexical_disambiguator) {
        return interfaces.subloop_instanceof_interface(v_lexical_disambiguator, (SubLObject)lexical_disambiguator.$sym0$LEXICAL_DISAMBIGUATOR);
    }
    
    public static SubLObject declare_lexical_disambiguator_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexical_disambiguator", "lexical_disambiguator_p", "LEXICAL-DISAMBIGUATOR-P", 1, 0, false);
        return (SubLObject)lexical_disambiguator.NIL;
    }
    
    public static SubLObject init_lexical_disambiguator_file() {
        return (SubLObject)lexical_disambiguator.NIL;
    }
    
    public static SubLObject setup_lexical_disambiguator_file() {
        interfaces.new_interface((SubLObject)lexical_disambiguator.$sym0$LEXICAL_DISAMBIGUATOR, (SubLObject)lexical_disambiguator.NIL, (SubLObject)lexical_disambiguator.NIL, (SubLObject)lexical_disambiguator.$list1);
        return (SubLObject)lexical_disambiguator.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_lexical_disambiguator_file();
    }
    
    @Override
	public void initializeVariables() {
        init_lexical_disambiguator_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_lexical_disambiguator_file();
    }
    
    static {
        me = (SubLFile)new lexical_disambiguator();
        $sym0$LEXICAL_DISAMBIGUATOR = SubLObjectFactory.makeSymbol("LEXICAL-DISAMBIGUATOR");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DISAMBIGUATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
    }
}

/*

	Total time: 62 ms
	
*/