/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V12;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      JANUS-MACROS
 * source file: /cyc/top/cycl/inference/janus-macros.lisp
 * created:     2019/07/03 17:37:35
 */
public final class janus_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new janus_macros();

 public static final String myName = "com.cyc.cycjava.cycl.inference.janus_macros";


    static private final SubLList $list1 = list(list(makeSymbol("*JANUS-WITHIN-SOMETHING?*"), T));

    static private final SubLList $list2 = list(list(makeSymbol("*JANUS-WITHIN-SOMETHING?*"), T), list(makeSymbol("*JANUS-EXTRACTION-DEDUCE-SPECS*"), NIL));

    // Definitions
    public static final SubLObject janus_within_create_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt1, append(body, NIL));
        }
    }

    public static SubLObject janus_within_create(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    public static final SubLObject janus_within_assert_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt2, append(body, NIL));
        }
    }

    public static SubLObject janus_within_assert(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list2, append(body, NIL));
    }

    public static final SubLObject janus_within_query_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt1, append(body, NIL));
        }
    }

    public static SubLObject janus_within_query(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    public static SubLObject declare_janus_macros_file() {
        declareMacro("janus_within_create", "JANUS-WITHIN-CREATE");
        declareMacro("janus_within_assert", "JANUS-WITHIN-ASSERT");
        declareMacro("janus_within_query", "JANUS-WITHIN-QUERY");
        return NIL;
    }

    public static SubLObject init_janus_macros_file() {
        return NIL;
    }

    public static SubLObject setup_janus_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_janus_macros_file();
    }

    static private final SubLList $list_alt1 = list(list(makeSymbol("*JANUS-WITHIN-SOMETHING?*"), T));

    @Override
    public void initializeVariables() {
        init_janus_macros_file();
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("*JANUS-WITHIN-SOMETHING?*"), T), list(makeSymbol("*JANUS-EXTRACTION-DEDUCE-SPECS*"), NIL));

    @Override
    public void runTopLevelForms() {
        setup_janus_macros_file();
    }

    static {
    }
}

/**
 * Total time: 63 ms
 */
