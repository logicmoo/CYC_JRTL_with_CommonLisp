/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_testing;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.sunit_external;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-TESTING-UTILITIES
 * source file: /cyc/top/cycl/sksi/sksi-testing/sksi-testing-utilities.lisp
 * created:     2019/07/03 17:37:52
 */
public final class sksi_testing_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_testing_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_testing_utilities";


    // Internal Constants
    static private final SubLString $$$SKSI_Category = makeString("SKSI Category");

    static private final SubLString $$$SKSI = makeString("SKSI");

    static private final SubLList $list2 = list(makeString("SKSI Category"));

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

    static private final SubLList $list_alt2 = list(makeString("SKSI Category"));

    static {
    }
}

/**
 * Total time: 95 ms
 */
