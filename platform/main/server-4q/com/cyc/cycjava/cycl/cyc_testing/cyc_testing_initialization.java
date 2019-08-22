package com.cyc.cycjava.cycl.cyc_testing;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cyc_testing_initialization extends SubLTranslatedFile {
    public static final SubLFile me = new cyc_testing_initialization();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.cyc_testing_initialization";

    public static final String myFingerPrint = "5fea9cf2f48195f20d426294846e8ac1302ca513af9e64c1dfd87705c4cfefdd";

    // deflexical
    // Definitions
    /**
     * Set to t after initializations have been performed. IF YOU RECOMPILE THIS
     * (thereby setting it back to nil), IT WILL BREAK CYC-TESTING. If you start
     * getting errors like 'FOO is not a GENERIC-TEST-CASE-TABLE-P', you need to
     * rerun perform-cyc-testing-initializations.
     */
    private static final SubLSymbol $cyc_tests_initializedP$ = makeSymbol("*CYC-TESTS-INITIALIZED?*");

    private static final SubLSymbol $sym0$_CYC_TESTS_INITIALIZED__ = makeSymbol("*CYC-TESTS-INITIALIZED?*");

    public static SubLObject cyc_tests_initializedP() {
        return $cyc_tests_initializedP$.getGlobalValue();
    }

    public static SubLObject perform_cyc_testing_initializations() {
        cyc_testing.index_all_cyc_tests_by_name();
        $cyc_tests_initializedP$.setGlobalValue(T);
        return NIL;
    }

    public static SubLObject declare_cyc_testing_initialization_file() {
        declareFunction(me, "cyc_tests_initializedP", "CYC-TESTS-INITIALIZED?", 0, 0, false);
        declareFunction(me, "perform_cyc_testing_initializations", "PERFORM-CYC-TESTING-INITIALIZATIONS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_cyc_testing_initialization_file() {
        deflexical("*CYC-TESTS-INITIALIZED?*", SubLTrampolineFile.maybeDefault($sym0$_CYC_TESTS_INITIALIZED__, $cyc_tests_initializedP$, NIL));
        return NIL;
    }

    public static SubLObject setup_cyc_testing_initialization_file() {
        declare_defglobal($sym0$_CYC_TESTS_INITIALIZED__);
        return NIL;
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

    
}

/**
 * Total time: 63 ms
 */
