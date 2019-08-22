/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-UTILITIES
 *  source file: /cyc/top/cycl/cyblack/cyblack-utilities.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class cyblack_utilities extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_utilities() {
    }

    public static final SubLFile me = new cyblack_utilities();


    // // Definitions
    public static final SubLObject non_null_symbol_p(SubLObject v_object) {
        return makeBoolean((NIL != v_object) && v_object.isSymbol());
    }

    public static final SubLObject optional_lambda_list_key_p(SubLObject v_object) {
        return eq(v_object, $sym0$_OPTIONAL);
    }

    public static final SubLObject cyblack_silence(SubLObject var) {
        return NIL;
    }

    public static final SubLObject cyblack_lengthE(SubLObject list1, SubLObject list2) {
        {
            SubLObject sublist1 = list1;
            SubLObject sublist2 = list2;
            while ((NIL != sublist1) && (NIL != sublist2)) {
                sublist1 = sublist1.rest();
                sublist2 = sublist2.rest();
            } 
            return eq(sublist1, sublist2);
        }
    }

    public static final SubLObject declare_cyblack_utilities_file() {
        declareFunction("non_null_symbol_p", "NON-NULL-SYMBOL-P", 1, 0, false);
        declareFunction("optional_lambda_list_key_p", "OPTIONAL-LAMBDA-LIST-KEY-P", 1, 0, false);
        declareFunction("cyblack_silence", "CYBLACK-SILENCE", 1, 0, false);
        declareFunction("cyblack_lengthE", "CYBLACK-LENGTH=", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_utilities_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_utilities_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLSymbol $sym0$_OPTIONAL = makeSymbol("&OPTIONAL");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_utilities_file();
    }

    public void initializeVariables() {
        init_cyblack_utilities_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_utilities_file();
    }
}

