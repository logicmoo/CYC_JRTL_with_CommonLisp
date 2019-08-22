/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyc_testing;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cyc_testing_initialization extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cyc_testing_initialization();

 public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.cyc_testing_initialization";




    private static final SubLSymbol $cyc_tests_initializedP$ = makeSymbol("*CYC-TESTS-INITIALIZED?*");

    public static final SubLObject cyc_tests_initializedP_alt() {
        return $cyc_tests_initializedP$.getGlobalValue();
    }

    public static SubLObject cyc_tests_initializedP() {
        return $cyc_tests_initializedP$.getGlobalValue();
    }

    public static final SubLObject perform_cyc_testing_initializations_alt() {
        cyc_testing.index_all_cyc_tests_by_name();
        $cyc_tests_initializedP$.setGlobalValue(T);
        return NIL;
    }

    public static SubLObject perform_cyc_testing_initializations() {
        cyc_testing.index_all_cyc_tests_by_name();
        $cyc_tests_initializedP$.setGlobalValue(T);
        return NIL;
    }

    public static SubLObject declare_cyc_testing_initialization_file() {
        declareFunction("cyc_tests_initializedP", "CYC-TESTS-INITIALIZED?", 0, 0, false);
        declareFunction("perform_cyc_testing_initializations", "PERFORM-CYC-TESTING-INITIALIZATIONS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyc_testing_initialization_file_alt() {
        deflexical("*CYC-TESTS-INITIALIZED?*", NIL);
        return NIL;
    }

    public static SubLObject init_cyc_testing_initialization_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*CYC-TESTS-INITIALIZED?*", SubLTrampolineFile.maybeDefault($cyc_tests_initializedP$, $cyc_tests_initializedP$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CYC-TESTS-INITIALIZED?*", NIL);
        }
        return NIL;
    }

    public static SubLObject init_cyc_testing_initialization_file_Previous() {
        deflexical("*CYC-TESTS-INITIALIZED?*", SubLTrampolineFile.maybeDefault($cyc_tests_initializedP$, $cyc_tests_initializedP$, NIL));
        return NIL;
    }

    public static SubLObject setup_cyc_testing_initialization_file() {
        declare_defglobal($cyc_tests_initializedP$);
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
