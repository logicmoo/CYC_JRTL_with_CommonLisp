/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-MUMBLER
 *  source file: /cyc/top/cycl/uia-mumbler.lisp
 *  created:     2019/07/03 17:37:56
 */
public final class uia_mumbler extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_mumbler() {
    }

    public static final SubLFile me = new uia_mumbler();


    // // Definitions
    public static final SubLObject uia_with_my_mumbling(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject uia = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    uia = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject address = $sym1$ADDRESS;
                            return list(CLET, list(list(address, list(UIA_MUMBLE_CREATE_ADDRESS_FOR_UIA, uia))), listS(RKF_WITH_MY_MUMBLINGS, list(address), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_mumble(SubLObject uia, SubLObject message) {
        if (NIL != user_interaction_agenda.uia_can_treat_comments_as_mumblingP()) {
            {
                SubLObject signature = create_uia_mumble_address_from_uia(uia);
                uia_mumble_internal(signature, message);
            }
        } else {
            user_interaction_agenda.uia_act_new_comment(uia, message);
        }
        return uia;
    }

    public static final SubLObject uia_mumble_important(SubLObject uia, SubLObject message) {
        {
            SubLObject new_message = cconcatenate($str_alt5$Important__, message);
            return uia_mumble(uia, new_message);
        }
    }

    public static final SubLObject create_uia_mumble_address_from_uia(SubLObject uia) {
        {
            SubLObject uia_id = user_interaction_agenda.uia_id(uia);
            SubLObject uima_id = user_interaction_agenda.uima_id(user_interaction_agenda.uia_meta_agenda(uia));
            return create_uia_mumble_address(uima_id, uia_id);
        }
    }

    public static final SubLObject create_uia_mumble_address(SubLObject uima_id, SubLObject uia_id) {
        return list($RKF_MUMBLE, uima_id, uia_id);
    }

    public static final SubLObject uia_mumble_create_address_for_uia(SubLObject uia) {
        return create_uia_mumble_address_from_uia(uia);
    }

    public static final SubLObject uia_mumble_internal(SubLObject signature, SubLObject message) {
        rkf_mumbler.rkf_mumble(message, signature);
        return signature;
    }

    public static final SubLObject with_output_to_uia_mumble(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject uia = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    uia = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject string = $sym8$STRING;
                            SubLObject stream = $sym9$STREAM;
                            return list(CLET, list(string), list(CWITH_OUTPUT_TO_STRING, list(stream, string), listS(CLET, list(list($standard_output$, stream)), append(body, NIL))), list(UIA_MUMBLE, uia, string));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_fetch_mumbling(SubLObject uima_id, SubLObject uia_id) {
        {
            SubLObject signature = create_uia_mumble_address(uima_id, uia_id);
            SubLObject value = rkf_mumbler.rkf_fetch_mumble(signature);
            if (NIL == value) {
                value = $str_alt13$;
            }
            return value;
        }
    }

    public static final SubLObject _uia_heckling_from_the_back(SubLObject uima_id, SubLObject uia_id, SubLObject message) {
        {
            SubLObject signature = create_uia_mumble_address(uima_id, uia_id);
            return uia_mumble_internal(signature, message);
        }
    }

    public static final SubLObject uia_ensure_mumbling_support(SubLObject uia) {
        {
            SubLObject signature = create_uia_mumble_address_from_uia(uia);
            rkf_mumbler.ensure_rkf_event_to_mumble_ready(signature);
        }
        return user_interaction_agenda.uima_id(user_interaction_agenda.uia_meta_agenda(uia));
    }

    public static final SubLObject uia_ensure_mumbling_support_externally(SubLObject uima_id, SubLObject uia_id) {
        {
            SubLObject signature = create_uia_mumble_address(uima_id, uia_id);
            rkf_mumbler.ensure_rkf_event_to_mumble_ready(signature);
        }
        return uima_id;
    }

    public static final SubLObject declare_uia_mumbler_file() {
        declareMacro("uia_with_my_mumbling", "UIA-WITH-MY-MUMBLING");
        declareFunction("uia_mumble", "UIA-MUMBLE", 2, 0, false);
        declareFunction("uia_mumble_important", "UIA-MUMBLE-IMPORTANT", 2, 0, false);
        declareFunction("create_uia_mumble_address_from_uia", "CREATE-UIA-MUMBLE-ADDRESS-FROM-UIA", 1, 0, false);
        declareFunction("create_uia_mumble_address", "CREATE-UIA-MUMBLE-ADDRESS", 2, 0, false);
        declareFunction("uia_mumble_create_address_for_uia", "UIA-MUMBLE-CREATE-ADDRESS-FOR-UIA", 1, 0, false);
        declareFunction("uia_mumble_internal", "UIA-MUMBLE-INTERNAL", 2, 0, false);
        declareMacro("with_output_to_uia_mumble", "WITH-OUTPUT-TO-UIA-MUMBLE");
        declareFunction("uia_fetch_mumbling", "UIA-FETCH-MUMBLING", 2, 0, false);
        declareFunction("_uia_heckling_from_the_back", "_UIA-HECKLING-FROM-THE-BACK", 3, 0, false);
        declareFunction("uia_ensure_mumbling_support", "UIA-ENSURE-MUMBLING-SUPPORT", 1, 0, false);
        declareFunction("uia_ensure_mumbling_support_externally", "UIA-ENSURE-MUMBLING-SUPPORT-EXTERNALLY", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_mumbler_file() {
        return NIL;
    }

    public static final SubLObject setup_uia_mumbler_file() {
                access_macros.register_macro_helper(UIA_MUMBLE_CREATE_ADDRESS_FOR_UIA, UIA_WITH_MY_MUMBLING);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(list(makeSymbol("UIA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym1$ADDRESS = makeUninternedSymbol("ADDRESS");



    private static final SubLSymbol UIA_MUMBLE_CREATE_ADDRESS_FOR_UIA = makeSymbol("UIA-MUMBLE-CREATE-ADDRESS-FOR-UIA");

    private static final SubLSymbol RKF_WITH_MY_MUMBLINGS = makeSymbol("RKF-WITH-MY-MUMBLINGS");

    static private final SubLString $str_alt5$Important__ = makeString("Important: ");

    private static final SubLSymbol $RKF_MUMBLE = makeKeyword("RKF-MUMBLE");

    private static final SubLSymbol UIA_WITH_MY_MUMBLING = makeSymbol("UIA-WITH-MY-MUMBLING");

    static private final SubLSymbol $sym8$STRING = makeUninternedSymbol("STRING");

    static private final SubLSymbol $sym9$STREAM = makeUninternedSymbol("STREAM");



    public static final SubLSymbol $standard_output$ = makeSymbol("*STANDARD-OUTPUT*");

    private static final SubLSymbol UIA_MUMBLE = makeSymbol("UIA-MUMBLE");

    static private final SubLString $str_alt13$ = makeString("");

    // // Initializers
    public void declareFunctions() {
        declare_uia_mumbler_file();
    }

    public void initializeVariables() {
        init_uia_mumbler_file();
    }

    public void runTopLevelForms() {
        setup_uia_mumbler_file();
    }
}

