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
 *  module:      CYBLACK-ORDINAL
 *  source file: /cyc/top/cycl/cyblack/cyblack-ordinal.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class cyblack_ordinal extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_ordinal() {
    }

    public static final SubLFile me = new cyblack_ordinal();


    // // Definitions
    public static final SubLObject cyblack_ordinal_p(SubLObject v_cyblack_ordinal) {
        return interfaces.subloop_instanceof_interface(v_cyblack_ordinal, CYBLACK_ORDINAL);
    }

    public static final SubLObject cyblack_ordinal_template_p(SubLObject cyblack_ordinal_template) {
        return interfaces.subloop_instanceof_interface(cyblack_ordinal_template, CYBLACK_ORDINAL_TEMPLATE);
    }

    public static final SubLObject declare_cyblack_ordinal_file() {
        declareFunction("cyblack_ordinal_p", "CYBLACK-ORDINAL-P", 1, 0, false);
        declareFunction("cyblack_ordinal_template_p", "CYBLACK-ORDINAL-TEMPLATE-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_ordinal_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_ordinal_file() {
                interfaces.new_interface(CYBLACK_ORDINAL, NIL, NIL, $list_alt1);
        interfaces.new_interface(CYBLACK_ORDINAL_TEMPLATE, $list_alt3, $list_alt4, $list_alt5);
        interfaces.interfaces_add_interface_instance_method(GET_ORD, CYBLACK_ORDINAL_TEMPLATE, $list_alt7, NIL, $list_alt8);
        interfaces.interfaces_add_interface_instance_method(SET_ORD, CYBLACK_ORDINAL_TEMPLATE, $list_alt7, $list_alt10, $list_alt11);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_ORDINAL = makeSymbol("CYBLACK-ORDINAL");

    static private final SubLList $list_alt1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ORD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ORD"), list(makeSymbol("NEW-ORD")), makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_ORDINAL_TEMPLATE = makeSymbol("CYBLACK-ORDINAL-TEMPLATE");

    static private final SubLList $list_alt3 = list(makeSymbol("CYBLACK-ORDINAL"));

    static private final SubLList $list_alt4 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-ORDINAL")));

    static private final SubLList $list_alt5 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-GET-ORD"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-ORD"), list(makeSymbol("NEW-ORD")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ORD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ORD"), list(makeSymbol("NEW-ORD")), makeKeyword("PUBLIC")));



    static private final SubLList $list_alt7 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt8 = list(list(RET, list(makeSymbol("INTERNAL-GET-ORD"), makeSymbol("SELF"))));

    private static final SubLSymbol SET_ORD = makeSymbol("SET-ORD");

    static private final SubLList $list_alt10 = list(makeSymbol("NEW-ORD"));

    static private final SubLList $list_alt11 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-ORD")), list(makeSymbol(">="), makeSymbol("NEW-ORD"), ZERO_INTEGER)), makeString("(SET-ORD ~S): Ordinal values must be non-negative integers.  ~S is not a non-negative integer."), makeSymbol("SELF"), makeSymbol("NEW-ORD")), list(makeSymbol("INTERNAL-SET-ORD"), makeSymbol("SELF"), makeSymbol("NEW-ORD")), list(RET, makeSymbol("NEW-ORD")));

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_ordinal_file();
    }

    public void initializeVariables() {
        init_cyblack_ordinal_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_ordinal_file();
    }
}

