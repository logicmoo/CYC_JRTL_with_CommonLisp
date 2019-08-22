/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.ranges;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-ATTRIBUTES
 *  source file: /cyc/top/cycl/cyblack/cyblack-attributes.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class cyblack_attributes extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_attributes() {
    }

    public static final SubLFile me = new cyblack_attributes();


    // // Definitions
    public static final SubLObject posting_attribute_p(SubLObject v_object) {
        return v_object.isSymbol() && ((NIL != enumerations.enumerations_retrieve_enumeration(v_object)) || (NIL != ranges.ranges_retrieve_range(v_object))) ? ((SubLObject) (T)) : NIL;
    }

    public static final SubLObject posting_attribute_list_p(SubLObject v_object) {
        if (NIL == v_object) {
            return T;
        } else
            if (v_object.isCons()) {
                {
                    SubLObject current_cons = v_object;
                    while (NIL != current_cons) {
                        if (NIL == posting_attribute_p(current_cons.first())) {
                            return NIL;
                        }
                        current_cons = current_cons.rest();
                        if (NIL == current_cons) {
                            return T;
                        } else
                            if (!current_cons.isCons()) {
                                return NIL;
                            }

                    } 
                }
            }

        return NIL;
    }

    public static final SubLObject posting_attributes_p(SubLObject posting_attributes) {
        return interfaces.subloop_instanceof_interface(posting_attributes, POSTING_ATTRIBUTES);
    }

    public static final SubLObject posting_attributes_template_p(SubLObject posting_attributes_template) {
        return interfaces.subloop_instanceof_interface(posting_attributes_template, POSTING_ATTRIBUTES_TEMPLATE);
    }

    public static final SubLObject declare_cyblack_attributes_file() {
        declareFunction("posting_attribute_p", "POSTING-ATTRIBUTE-P", 1, 0, false);
        declareFunction("posting_attribute_list_p", "POSTING-ATTRIBUTE-LIST-P", 1, 0, false);
        declareFunction("posting_attributes_p", "POSTING-ATTRIBUTES-P", 1, 0, false);
        declareFunction("posting_attributes_template_p", "POSTING-ATTRIBUTES-TEMPLATE-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_attributes_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_attributes_file() {
        interfaces.new_interface(POSTING_ATTRIBUTES, NIL, NIL, $list_alt1);
        interfaces.new_interface(POSTING_ATTRIBUTES_TEMPLATE, $list_alt3, $list_alt4, $list_alt5);
        interfaces.interfaces_add_interface_instance_method(GET_ATTRIBUTES, POSTING_ATTRIBUTES_TEMPLATE, NIL, NIL, $list_alt7);
        interfaces.interfaces_add_interface_instance_method(ADD_ATTRIBUTE, POSTING_ATTRIBUTES_TEMPLATE, NIL, $list_alt9, $list_alt10);
        interfaces.interfaces_add_interface_instance_method(SET_ATTRIBUTE_VALUE, POSTING_ATTRIBUTES_TEMPLATE, NIL, $list_alt12, $list_alt13);
        interfaces.interfaces_add_interface_instance_method(GET_ATTRIBUTE_VALUE, POSTING_ATTRIBUTES_TEMPLATE, NIL, $list_alt15, $list_alt16);
        interfaces.interfaces_add_interface_instance_method(SET_ATTRIBUTES_FROM_PLIST, POSTING_ATTRIBUTES_TEMPLATE, $list_alt18, $list_alt19, $list_alt20);
        interfaces.interfaces_add_interface_instance_method(GET_ATTRIBUTES_AS_PLIST, POSTING_ATTRIBUTES_TEMPLATE, $list_alt18, NIL, $list_alt22);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol POSTING_ATTRIBUTES = makeSymbol("POSTING-ATTRIBUTES");

    static private final SubLList $list_alt1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ATTRIBUTES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-ATTRIBUTE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-ATTRIBUTE"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ATTRIBUTE-VALUE"), list(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ATTRIBUTE-VALUE"), list(makeSymbol("ATTRIBUTE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ATTRIBUTES-FROM-PLIST"), list(makeSymbol("ATTRIBUTE-PLIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ATTRIBUTES-AS-PLIST"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol POSTING_ATTRIBUTES_TEMPLATE = makeSymbol("POSTING-ATTRIBUTES-TEMPLATE");

    static private final SubLList $list_alt3 = list(makeSymbol("POSTING-ATTRIBUTES"));

    static private final SubLList $list_alt4 = list(makeKeyword("EXTENDS"), list(makeSymbol("POSTING-ATTRIBUTES")));

    static private final SubLList $list_alt5 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DICTIONARY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DICTIONARY"), list(makeSymbol("NEW-DICTIONARY")), makeKeyword("PROTECTED")));

    private static final SubLSymbol GET_ATTRIBUTES = makeSymbol("GET-ATTRIBUTES");

    static private final SubLList $list_alt7 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-DICTIONARY"), list(RET, list(makeSymbol("DICTIONARY-KEYS"), makeSymbol("TEMPLATE-DICTIONARY"))), list(RET, NIL))));

    private static final SubLSymbol ADD_ATTRIBUTE = makeSymbol("ADD-ATTRIBUTE");

    static private final SubLList $list_alt9 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-ATTRIBUTE"), NIL));

    static private final SubLList $list_alt10 = list(list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("NEW-ATTRIBUTE")), list(RET, NIL)), list(makeSymbol("MUST"), list(makeSymbol("POSTING-ATTRIBUTE-P"), makeSymbol("NEW-ATTRIBUTE")), makeString("(ADD-ATTRIBUTE ~S): ~S is not a valid posting attribute."), makeSymbol("SELF"), makeSymbol("NEW-ATTRIBUTE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("NEW-DICTIONARY"))), list(makeSymbol("SET-DICTIONARY"), makeSymbol("SELF"), makeSymbol("TEMPLATE-DICTIONARY"))), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("TEMPLATE-DICTIONARY"), makeSymbol("NEW-ATTRIBUTE"), NIL), list(RET, makeSymbol("NEW-ATTRIBUTE"))));

    private static final SubLSymbol SET_ATTRIBUTE_VALUE = makeSymbol("SET-ATTRIBUTE-VALUE");

    static private final SubLList $list_alt12 = list(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"));

    static private final SubLList $list_alt13 = list(list(makeSymbol("MUST"), list(makeSymbol("POSTING-ATTRIBUTE-P"), makeSymbol("ATTRIBUTE")), makeString("(SET-ATTRIBUTE-VALUE ~S): ~S is not a valid posting attribute."), makeSymbol("SELF"), makeSymbol("ATTRIBUTE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-TYPE-OBJECT"), list(makeSymbol("ENUMERATIONS-RETRIEVE-ENUMERATION"), makeSymbol("ATTRIBUTE")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-TYPE-OBJECT"), list(makeSymbol("MUST"), list(makeSymbol("ENUMERATION-MEMBER-P"), makeSymbol("ATTRIBUTE"), makeSymbol("VALUE")), makeString("(SET-ATTRIBUTE-VALUE ~S): ~S is not within the range of enumeration ~S."), makeSymbol("SELF"), makeSymbol("VALUE"), makeSymbol("ATTRIBUTE")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TYPE-OBJECT"), list(makeSymbol("RANGES-RETRIEVE-RANGE"), makeSymbol("ATTRIBUTE"))), list(makeSymbol("MUST"), list(makeSymbol("RANGE-MEMBER-P"), makeSymbol("ATTRIBUTE"), makeSymbol("VALUE")), makeString("(SET-ATTRIBUTE-VALUE ~S): ~S is not within the range of interval ~S."), makeSymbol("SELF"), makeSymbol("VALUE"), makeSymbol("ATTRIBUTE"))))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("NEW-DICTIONARY"))), list(makeSymbol("SET-DICTIONARY"), makeSymbol("SELF"), makeSymbol("TEMPLATE-DICTIONARY"))), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("TEMPLATE-DICTIONARY"), makeSymbol("ATTRIBUTE"), makeSymbol("VALUE")), list(RET, makeSymbol("VALUE"))));

    private static final SubLSymbol GET_ATTRIBUTE_VALUE = makeSymbol("GET-ATTRIBUTE-VALUE");

    static private final SubLList $list_alt15 = list(makeSymbol("ATTRIBUTE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL));

    static private final SubLList $list_alt16 = list(list(makeSymbol("MUST"), list(makeSymbol("POSTING-ATTRIBUTE-P"), makeSymbol("ATTRIBUTE")), makeString("(GET-ATTRIBUTE-VALUE ~S): ~S is not a valid posting attribute."), makeSymbol("SELF"), makeSymbol("ATTRIBUTE")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-DICTIONARY"), list(RET, list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("TEMPLATE-DICTIONARY"), makeSymbol("ATTRIBUTE"), makeSymbol("DEFAULT"))), list(RET, makeSymbol("DEFAULT")))));

    private static final SubLSymbol SET_ATTRIBUTES_FROM_PLIST = makeSymbol("SET-ATTRIBUTES-FROM-PLIST");

    static private final SubLList $list_alt18 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt19 = list(makeSymbol("ATTRIBUTE-PLIST"));

    static private final SubLList $list_alt20 = list(list(makeSymbol("CDOPLIST"), list(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"), makeSymbol("ATTRIBUTE-PLIST")), list(makeSymbol("SET-ATTRIBUTE-VALUE"), makeSymbol("SELF"), makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"))), list(RET, makeSymbol("ATTRIBUTE-PLIST")));

    private static final SubLSymbol GET_ATTRIBUTES_AS_PLIST = makeSymbol("GET-ATTRIBUTES-AS-PLIST");

    static private final SubLList $list_alt22 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESULTS"), NIL), list(makeSymbol("TEMPLATE-DICTIONARY"), list(makeSymbol("GET-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("TEMPLATE-KEY"), makeSymbol("TEMPLATE-VALUE"), makeSymbol("TEMPLATE-DICTIONARY")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-KEY"), makeSymbol("TEMPLATE-RESULTS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-VALUE"), makeSymbol("TEMPLATE-RESULTS"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("TEMPLATE-RESULTS")))));

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_attributes_file();
    }

    public void initializeVariables() {
        init_cyblack_attributes_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_attributes_file();
    }
}

