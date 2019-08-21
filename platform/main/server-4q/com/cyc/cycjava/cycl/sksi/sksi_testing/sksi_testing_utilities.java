package com.cyc.cycjava.cycl.sksi.sksi_testing;


import com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_testing_utilities;
import com.cyc.cycjava.cycl.sunit_external;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_testing_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sksi_testing_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_testing_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_testing_utilities";

    public static final String myFingerPrint = "448d6baf1454d24808bb6cd8767e45b8d051c61335639c51f94482af46f824a4";

    // Internal Constants
    public static final SubLString $$$SKSI_Category = makeString("SKSI Category");

    public static final SubLString $$$SKSI = makeString("SKSI");

    public static final SubLList $list2 = list(makeString("SKSI Category"));

    public static SubLObject declare_sksi_testing_utilities_file() {
        return NIL;
    }

    public static SubLObject init_sksi_testing_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_sksi_testing_utilities_file() {
        sunit_external.define_test_category($$$SKSI_Category, UNPROVIDED);
        sunit_external.define_test_suite($$$SKSI, $list2, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_testing_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_testing_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_testing_utilities_file();
    }

    static {




    }
}

/**
 * Total time: 95 ms
 */
