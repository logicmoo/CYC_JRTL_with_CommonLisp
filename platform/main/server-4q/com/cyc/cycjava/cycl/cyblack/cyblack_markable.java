/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
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
 *  module:      CYBLACK-MARKABLE
 *  source file: /cyc/top/cycl/cyblack/cyblack-markable.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class cyblack_markable extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_markable() {
    }

    public static final SubLFile me = new cyblack_markable();


    // // Definitions
    public static final SubLObject cyblack_markable_p(SubLObject v_cyblack_markable) {
        return interfaces.subloop_instanceof_interface(v_cyblack_markable, CYBLACK_MARKABLE);
    }

    public static final SubLObject cyblack_markable_template_p(SubLObject cyblack_markable_template) {
        return interfaces.subloop_instanceof_interface(cyblack_markable_template, CYBLACK_MARKABLE_TEMPLATE);
    }

    public static final SubLObject declare_cyblack_markable_file() {
        declareFunction("cyblack_markable_p", "CYBLACK-MARKABLE-P", 1, 0, false);
        declareFunction("cyblack_markable_template_p", "CYBLACK-MARKABLE-TEMPLATE-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_markable_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_markable_file() {
                interfaces.new_interface(CYBLACK_MARKABLE, NIL, NIL, $list_alt1);
        interfaces.new_interface(CYBLACK_MARKABLE_TEMPLATE, $list_alt3, $list_alt4, $list_alt5);
        interfaces.interfaces_add_interface_instance_method(CLEAR_ALL_MARKS, CYBLACK_MARKABLE_TEMPLATE, $list_alt7, NIL, $list_alt8);
        interfaces.interfaces_add_interface_instance_method(ADD_MARK, CYBLACK_MARKABLE_TEMPLATE, $list_alt7, $list_alt10, $list_alt11);
        interfaces.interfaces_add_interface_instance_method(REMOVE_MARK, CYBLACK_MARKABLE_TEMPLATE, $list_alt7, $list_alt10, $list_alt13);
        interfaces.interfaces_add_interface_instance_method(HAS_MARK_P, CYBLACK_MARKABLE_TEMPLATE, $list_alt7, $list_alt10, $list_alt15);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_MARKABLE = makeSymbol("CYBLACK-MARKABLE");

    static private final SubLList $list_alt1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-ALL-MARKS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MARK"), list(makeSymbol("MARK")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-MARK"), list(makeSymbol("MARK")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-MARK-P"), list(makeSymbol("MARK")), makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_MARKABLE_TEMPLATE = makeSymbol("CYBLACK-MARKABLE-TEMPLATE");

    static private final SubLList $list_alt3 = list(makeSymbol("CYBLACK-MARKABLE"));

    static private final SubLList $list_alt4 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-MARKABLE")));

    static private final SubLList $list_alt5 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MARKS-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MARKS-INTERNAL"), list(makeSymbol("NEW-MARKS")), makeKeyword("PROTECTED")));



    static private final SubLList $list_alt7 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt8 = list(list(makeSymbol("SET-MARKS-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, NIL));



    static private final SubLList $list_alt10 = list(makeSymbol("MARK"));

    static private final SubLList $list_alt11 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LIST-OF-MARKS"), list(makeSymbol("GET-MARKS-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("MARK"), makeSymbol("LIST-OF-MARKS")), list(makeSymbol("CPUSH"), makeSymbol("MARK"), makeSymbol("LIST-OF-MARKS")), list(makeSymbol("SET-MARKS-INTERNAL"), makeSymbol("SELF"), makeSymbol("LIST-OF-MARKS")))), list(RET, makeSymbol("MARK")));



    static private final SubLList $list_alt13 = list(list(makeSymbol("SET-MARKS-INTERNAL"), makeSymbol("SELF"), list(makeSymbol("DELETE"), makeSymbol("MARK"), list(makeSymbol("GET-MARKS-INTERNAL"), makeSymbol("SELF")))), list(RET, makeSymbol("MARK")));



    static private final SubLList $list_alt15 = list(list(RET, list(makeSymbol("FIF"), list(makeSymbol("MEMBER"), makeSymbol("MARK"), list(makeSymbol("GET-MARKS-INTERNAL"), makeSymbol("SELF"))), T, NIL)));

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_markable_file();
    }

    public void initializeVariables() {
        init_cyblack_markable_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_markable_file();
    }
}

