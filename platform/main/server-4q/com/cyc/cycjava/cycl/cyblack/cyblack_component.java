/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-COMPONENT
 *  source file: /cyc/top/cycl/cyblack/cyblack-component.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class cyblack_component extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_component() {
    }

    public static final SubLFile me = new cyblack_component();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_component";

    // // Definitions
    public static final SubLObject cyblack_component_p(SubLObject v_cyblack_component) {
        return interfaces.subloop_instanceof_interface(v_cyblack_component, CYBLACK_COMPONENT);
    }

    public static final SubLObject declare_cyblack_component_file() {
        declareFunction("cyblack_component_p", "CYBLACK-COMPONENT-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_component_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_component_file() {
                interfaces.new_interface(CYBLACK_COMPONENT, NIL, NIL, $list_alt1);
        return NIL;
    }



    static private final SubLList $list_alt1 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR"), list(makeSymbol("OBJECT-MONITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNMONITOR"), list(makeSymbol("OBJECT-MONITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HTML-INDENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-HTML-INDENT"), list(makeSymbol("NEW-INDENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DESCRIBE-IN-HTML"), NIL, makeKeyword("PUBLIC")) });

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_component_file();
    }

    public void initializeVariables() {
        init_cyblack_component_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_component_file();
    }
}

