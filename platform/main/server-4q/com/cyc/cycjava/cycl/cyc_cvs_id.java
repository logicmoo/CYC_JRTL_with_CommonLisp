/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CYC-CVS-ID
 * source file: /cyc/top/cycl/cyc-cvs-id.lisp
 * created:     2019/07/03 17:37:05
 */
public final class cyc_cvs_id extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cyc_cvs_id();

 public static final String myName = "com.cyc.cycjava.cycl.cyc_cvs_id";


    // defvar
    // Definitions
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $cvs_id$ = makeSymbol("*CVS-ID*");

    public static SubLObject declare_cyc_cvs_id_file() {
        return NIL;
    }

    public static SubLObject init_cyc_cvs_id_file() {
        defvar("*CVS-ID*", NIL);
        return NIL;
    }

    public static SubLObject setup_cyc_cvs_id_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cyc_cvs_id_file();
    }

    @Override
    public void initializeVariables() {
        init_cyc_cvs_id_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyc_cvs_id_file();
    }

    static {
    }
}

/**
 * Total time: 61 ms
 */
