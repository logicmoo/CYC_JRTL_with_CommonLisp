package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_testing_initialization extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.cyc_testing_initialization";
    public static final String myFingerPrint = "5fea9cf2f48195f20d426294846e8ac1302ca513af9e64c1dfd87705c4cfefdd";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-initialization.lisp", position = 1123L)
    private static SubLSymbol $cyc_tests_initializedP$;
    private static final SubLSymbol $sym0$_CYC_TESTS_INITIALIZED__;
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-initialization.lisp", position = 1451L)
    public static SubLObject cyc_tests_initializedP() {
        return cyc_testing_initialization.$cyc_tests_initializedP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-initialization.lisp", position = 1530L)
    public static SubLObject perform_cyc_testing_initializations() {
        cyc_testing.index_all_cyc_tests_by_name();
        cyc_testing_initialization.$cyc_tests_initializedP$.setGlobalValue((SubLObject)cyc_testing_initialization.T);
        return (SubLObject)cyc_testing_initialization.NIL;
    }
    
    public static SubLObject declare_cyc_testing_initialization_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_initialization", "cyc_tests_initializedP", "CYC-TESTS-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_initialization", "perform_cyc_testing_initializations", "PERFORM-CYC-TESTING-INITIALIZATIONS", 0, 0, false);
        return (SubLObject)cyc_testing_initialization.NIL;
    }
    
    public static SubLObject init_cyc_testing_initialization_file() {
        cyc_testing_initialization.$cyc_tests_initializedP$ = SubLFiles.deflexical("*CYC-TESTS-INITIALIZED?*", (SubLObject)(maybeDefault((SubLObject)cyc_testing_initialization.$sym0$_CYC_TESTS_INITIALIZED__, cyc_testing_initialization.$cyc_tests_initializedP$, cyc_testing_initialization.NIL)));
        return (SubLObject)cyc_testing_initialization.NIL;
    }
    
    public static SubLObject setup_cyc_testing_initialization_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)cyc_testing_initialization.$sym0$_CYC_TESTS_INITIALIZED__);
        return (SubLObject)cyc_testing_initialization.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cyc_testing_initialization_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cyc_testing_initialization_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cyc_testing_initialization_file();
    }
    
    static {
        me = (SubLFile)new cyc_testing_initialization();
        cyc_testing_initialization.$cyc_tests_initializedP$ = null;
        $sym0$_CYC_TESTS_INITIALIZED__ = SubLObjectFactory.makeSymbol("*CYC-TESTS-INITIALIZED?*");
    }
}

/*

	Total time: 63 ms
	
*/