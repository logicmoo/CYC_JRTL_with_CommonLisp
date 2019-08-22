package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class subloop_markable extends SubLTranslatedFile {
    public static final SubLFile me = new subloop_markable();

    public static final String myName = "com.cyc.cycjava.cycl.subloop_markable";

    public static final String myFingerPrint = "eadfbb3ae0c746a8d3199acd44a8338b32efa89d8cbb366d0b8cbd4264164676";

    // Internal Constants
    public static final SubLSymbol SUBLOOP_MARKABLE = makeSymbol("SUBLOOP-MARKABLE");

    public static final SubLList $list1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-ALL-MARKS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MARK"), list(makeSymbol("MARK")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-MARK"), list(makeSymbol("MARK")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-MARK-P"), list(makeSymbol("MARK")), makeKeyword("PUBLIC")));

    public static final SubLSymbol SUBLOOP_MARKABLE_TEMPLATE = makeSymbol("SUBLOOP-MARKABLE-TEMPLATE");

    public static final SubLList $list3 = list(makeSymbol("SUBLOOP-MARKABLE"));

    public static final SubLList $list4 = list(makeKeyword("EXTENDS"), list(makeSymbol("SUBLOOP-MARKABLE")));

    public static final SubLList $list5 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MARKS-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MARKS-INTERNAL"), list(makeSymbol("NEW-MARKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-SUBLOOP-MARKABLE-TEMPLATE"), NIL, makeKeyword("PUBLIC")));



    public static final SubLList $list7 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list8 = list(list(makeSymbol("SET-MARKS-INTERNAL"), makeSymbol("SELF"), NIL), list(makeSymbol("RET"), NIL));



    public static final SubLList $list10 = list(makeSymbol("MARK"));

    public static final SubLList $list11 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LIST-OF-MARKS"), list(makeSymbol("GET-MARKS-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER"), makeSymbol("MARK"), makeSymbol("LIST-OF-MARKS")), list(makeSymbol("CPUSH"), makeSymbol("MARK"), makeSymbol("LIST-OF-MARKS")), list(makeSymbol("SET-MARKS-INTERNAL"), makeSymbol("SELF"), makeSymbol("LIST-OF-MARKS")))), list(makeSymbol("RET"), makeSymbol("MARK")));



    public static final SubLList $list13 = list(list(makeSymbol("SET-MARKS-INTERNAL"), makeSymbol("SELF"), list(makeSymbol("DELETE"), makeSymbol("MARK"), list(makeSymbol("GET-MARKS-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("RET"), makeSymbol("MARK")));



    public static final SubLList $list15 = list(list(makeSymbol("RET"), list(makeSymbol("FIF"), list(makeSymbol("MEMBER"), makeSymbol("MARK"), list(makeSymbol("GET-MARKS-INTERNAL"), makeSymbol("SELF"))), T, NIL)));

    public static final SubLSymbol INITIALIZE_QUA_SUBLOOP_MARKABLE_TEMPLATE = makeSymbol("INITIALIZE-QUA-SUBLOOP-MARKABLE-TEMPLATE");

    public static final SubLList $list17 = list(list(makeSymbol("SET-MARKS-INTERNAL"), makeSymbol("SELF"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static SubLObject subloop_markable_p(final SubLObject v_subloop_markable) {
        return interfaces.subloop_instanceof_interface(v_subloop_markable, SUBLOOP_MARKABLE);
    }

    public static SubLObject subloop_markable_template_p(final SubLObject subloop_markable_template) {
        return interfaces.subloop_instanceof_interface(subloop_markable_template, SUBLOOP_MARKABLE_TEMPLATE);
    }

    public static SubLObject declare_subloop_markable_file() {
        declareFunction(me, "subloop_markable_p", "SUBLOOP-MARKABLE-P", 1, 0, false);
        declareFunction(me, "subloop_markable_template_p", "SUBLOOP-MARKABLE-TEMPLATE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_subloop_markable_file() {
        return NIL;
    }

    public static SubLObject setup_subloop_markable_file() {
        interfaces.new_interface(SUBLOOP_MARKABLE, NIL, NIL, $list1);
        interfaces.new_interface(SUBLOOP_MARKABLE_TEMPLATE, $list3, $list4, $list5);
        interfaces.interfaces_add_interface_instance_method(CLEAR_ALL_MARKS, SUBLOOP_MARKABLE_TEMPLATE, $list7, NIL, $list8);
        interfaces.interfaces_add_interface_instance_method(ADD_MARK, SUBLOOP_MARKABLE_TEMPLATE, $list7, $list10, $list11);
        interfaces.interfaces_add_interface_instance_method(REMOVE_MARK, SUBLOOP_MARKABLE_TEMPLATE, $list7, $list10, $list13);
        interfaces.interfaces_add_interface_instance_method(HAS_MARK_P, SUBLOOP_MARKABLE_TEMPLATE, $list7, $list10, $list15);
        interfaces.interfaces_add_interface_instance_method(INITIALIZE_QUA_SUBLOOP_MARKABLE_TEMPLATE, SUBLOOP_MARKABLE_TEMPLATE, $list7, NIL, $list17);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_subloop_markable_file();
    }

    @Override
    public void initializeVariables() {
        init_subloop_markable_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subloop_markable_file();
    }

    
}

/**
 * Total time: 88 ms
 */
