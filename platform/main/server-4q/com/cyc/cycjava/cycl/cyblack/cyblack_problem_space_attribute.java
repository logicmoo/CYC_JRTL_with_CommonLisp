/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-PROBLEM-SPACE-ATTRIBUTE
 *  source file: /cyc/top/cycl/cyblack/cyblack-problem-space-attribute.lisp
 *  created:     2019/07/03 17:38:48
 */
public final class cyblack_problem_space_attribute extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_problem_space_attribute() {
    }

    public static final SubLFile me = new cyblack_problem_space_attribute();


    // // Definitions
    public static final SubLObject cyblack_problem_space_attribute_p(SubLObject v_cyblack_problem_space_attribute) {
        return interfaces.subloop_instanceof_interface(v_cyblack_problem_space_attribute, CYBLACK_PROBLEM_SPACE_ATTRIBUTE);
    }

    public static final SubLObject declare_cyblack_problem_space_attribute_file() {
        declareFunction("cyblack_problem_space_attribute_p", "CYBLACK-PROBLEM-SPACE-ATTRIBUTE-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_problem_space_attribute_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_problem_space_attribute_file() {
                interfaces.new_interface(CYBLACK_PROBLEM_SPACE_ATTRIBUTE, $list_alt1, $list_alt2, $list_alt3);
        interfaces.interfaces_add_interface_instance_method(UNREGISTER_ALL_PANELS, CYBLACK_PROBLEM_SPACE_ATTRIBUTE, $list_alt5, NIL, $list_alt6);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_PROBLEM_SPACE_ATTRIBUTE = makeSymbol("CYBLACK-PROBLEM-SPACE-ATTRIBUTE");

    static private final SubLList $list_alt1 = list(makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt2 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT")));

    static private final SubLList $list_alt3 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ATTRIBUTE-NAME"), list(makeSymbol("SYMBOL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ATTRIBUTE-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REGISTER-PANEL"), list(makeSymbol("NEW-PANEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNREGISTER-PANEL"), list(makeSymbol("OLD-PANEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-REGISTERED-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNREGISTER-ALL-PANELS"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol UNREGISTER_ALL_PANELS = makeSymbol("UNREGISTER-ALL-PANELS");

    static private final SubLList $list_alt5 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt6 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PANELS"), list(makeSymbol("GET-ALL-REGISTERED-PANELS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("PANEL"), makeSymbol("PANELS")), list(makeSymbol("UNREGISTER-PANEL"), makeSymbol("PANEL"))), list(RET, NIL)));

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_problem_space_attribute_file();
    }

    public void initializeVariables() {
        init_cyblack_problem_space_attribute_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_problem_space_attribute_file();
    }
}

