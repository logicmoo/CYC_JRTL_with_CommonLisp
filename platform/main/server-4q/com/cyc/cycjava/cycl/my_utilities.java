/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      MY-UTILITIES
 *  source file: /cyc/top/cycl/my-utilities.lisp
 *  created:     2019/07/03 17:39:07
 */
public final class my_utilities extends SubLTranslatedFile implements V02 {
    // // Constructor
    private my_utilities() {
    }

    public static final SubLFile me = new my_utilities();


    // // Definitions
    public static final SubLObject declare_my_utilities_file() {
        return NIL;
    }

    public static final SubLObject init_my_utilities_file() {
        return NIL;
    }

    public static final SubLObject setup_my_utilities_file() {
                return NIL;
    }

    // // Initializers
    public void declareFunctions() {
        declare_my_utilities_file();
    }

    public void initializeVariables() {
        init_my_utilities_file();
    }

    public void runTopLevelForms() {
        setup_my_utilities_file();
    }
}

