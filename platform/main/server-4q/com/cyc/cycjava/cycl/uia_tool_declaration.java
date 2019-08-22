/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-TOOL-DECLARATION
 *  source file: /cyc/top/cycl/uia-tool-declaration.lisp
 *  created:     2019/07/03 17:37:56
 */
public final class uia_tool_declaration extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_tool_declaration() {
    }

    public static final SubLFile me = new uia_tool_declaration();




    /**
     * <slot-key type required?>
     */
    // defconstant
    private static final SubLSymbol $uia_tool_slots$ = makeSymbol("*UIA-TOOL-SLOTS*");

    public static final SubLObject declare_uia_tool(SubLObject operator, SubLObject plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(operator, UI_OPERATOR_P);
            {
                SubLObject info = NIL;
                SubLObject cdolist_list_var = $uia_tool_slots$.getGlobalValue();
                SubLObject slot_def = NIL;
                for (slot_def = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot_def = cdolist_list_var.first()) {
                    {
                        SubLObject datum = slot_def;
                        SubLObject current = datum;
                        SubLObject slot_key = NIL;
                        SubLObject type = NIL;
                        SubLObject requiredP = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt4);
                        slot_key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt4);
                        type = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt4);
                        requiredP = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject slot_value = getf(plist, slot_key, $UNSPECIFIED);
                                if ((slot_value != $UNSPECIFIED) || (NIL != requiredP)) {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == funcall(type, slot_value)) {
                                            Errors.error($str_alt6$The__S_slot_to_DECLARE_UIA_TOOL_m, slot_key, type);
                                        }
                                    }
                                }
                                info = cons(slot_value, info);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt4);
                        }
                    }
                }
                dictionary.dictionary_enter($uia_tool_info_dictionary$.getGlobalValue(), operator, nreverse(info));
            }
            return operator;
        }
    }

    public static final SubLObject set_ui_operator_slot(SubLObject operator, SubLObject slot, SubLObject value) {
        {
            SubLObject entry = dictionary.dictionary_lookup($uia_tool_info_dictionary$.getGlobalValue(), operator, UNPROVIDED);
            SubLObject slot_index = position(slot, $uia_tool_slots$.getGlobalValue(), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
            if ((entry.isList() && slot_index.isInteger()) && (NIL != list_utilities.lengthG(entry, slot_index, UNPROVIDED))) {
                set_nth(slot_index, entry, value);
            }
        }
        return value;
    }

    public static final SubLObject get_ui_operator_slot(SubLObject operator, SubLObject slot) {
        {
            SubLObject entry = dictionary.dictionary_lookup($uia_tool_info_dictionary$.getGlobalValue(), operator, UNPROVIDED);
            SubLObject slot_index = position(slot, $uia_tool_slots$.getGlobalValue(), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
            if ((entry.isList() && slot_index.isInteger()) && (NIL != list_utilities.lengthG(entry, slot_index, UNPROVIDED))) {
                return nth(slot_index, entry);
            }
        }
        return NIL;
    }

    public static final SubLObject undeclare_uia_tool(SubLObject operator) {
        SubLTrampolineFile.checkType(operator, UI_OPERATOR_P);
        dictionary.dictionary_remove($uia_tool_info_dictionary$.getGlobalValue(), operator);
        return operator;
    }

    public static final SubLObject ui_operator_undo_method(SubLObject operator) {
        {
            SubLObject method = get_ui_operator_slot(operator, $UNDO_METHOD);
            if (method.isFunctionSpec()) {
                return method;
            }
        }
        return NIL;
    }

    public static final SubLObject ui_operator_child_completed_method(SubLObject operator) {
        {
            SubLObject method = get_ui_operator_slot(operator, $CHILD_COMPLETED_METHOD);
            if (method.isFunctionSpec()) {
                return method;
            }
        }
        return NIL;
    }

    public static final SubLObject ui_operator_child_rejected_method(SubLObject operator) {
        {
            SubLObject method = get_ui_operator_slot(operator, $CHILD_REJECTED_METHOD);
            if (method.isFunctionSpec()) {
                return method;
            }
        }
        return NIL;
    }

    public static final SubLObject ui_operator_child_invalidated_method(SubLObject operator) {
        {
            SubLObject method = get_ui_operator_slot(operator, $CHILD_INVALIDATED_METHOD);
            if (method.isFunctionSpec()) {
                return method;
            }
        }
        return NIL;
    }

    public static final SubLObject ui_operator_finalize_method(SubLObject operator) {
        {
            SubLObject method = get_ui_operator_slot(operator, $FINALIZE_METHOD);
            if (method.isFunctionSpec()) {
                return method;
            }
        }
        return NIL;
    }

    public static final SubLObject ui_operator_name(SubLObject operator) {
        {
            SubLObject name = get_ui_operator_slot(operator, $NAME);
            if (name.isString()) {
                return name;
            }
        }
        return NIL;
    }

    public static final SubLObject ui_operator_generate_request_method(SubLObject operator) {
        {
            SubLObject method = get_ui_operator_slot(operator, $GENERATE_REQUEST_METHOD);
            if (method.isFunctionSpec()) {
                return method;
            } else {
                return ui_operator_generate_request_method($UNKNOWN_INTERACTION);
            }
        }
    }

    public static final SubLObject ui_operator_handle_reply_method(SubLObject operator) {
        {
            SubLObject method = get_ui_operator_slot(operator, $HANDLE_REPLY_METHOD);
            if (method.isFunctionSpec()) {
                return method;
            }
        }
        return NIL;
    }

    public static final SubLObject ui_operator_hint_method(SubLObject operator) {
        {
            SubLObject method = get_ui_operator_slot(operator, $HINT_METHOD);
            if (method.isFunctionSpec()) {
                return method;
            }
        }
        return NIL;
    }

    public static final SubLObject ui_operator_hint_name(SubLObject operator) {
        {
            SubLObject name = get_ui_operator_slot(operator, $HINT_NAME);
            if (name.isString()) {
                return name;
            }
        }
        return NIL;
    }

    public static final SubLObject set_ui_operator_hint_name(SubLObject operator, SubLObject name) {
        set_ui_operator_slot(operator, $HINT_NAME, name);
        return name;
    }

    public static final SubLObject ui_operator_cycl(SubLObject operator) {
        {
            SubLObject name = get_ui_operator_slot(operator, $CYCL);
            if (NIL != forts.valid_fortP(name)) {
                return name;
            }
        }
        return NIL;
    }

    public static final SubLObject ui_operator_has_feature_p(SubLObject operator, SubLObject feature) {
        {
            SubLObject features = get_ui_operator_slot(operator, $FEATURES);
            return makeBoolean(features.isList() && (NIL != subl_promotions.memberP(feature, features, UNPROVIDED, UNPROVIDED)));
        }
    }

    public static final SubLObject declare_uia_tool_declaration_file() {
        declareFunction("declare_uia_tool", "DECLARE-UIA-TOOL", 2, 0, false);
        declareFunction("set_ui_operator_slot", "SET-UI-OPERATOR-SLOT", 3, 0, false);
        declareFunction("get_ui_operator_slot", "GET-UI-OPERATOR-SLOT", 2, 0, false);
        declareFunction("undeclare_uia_tool", "UNDECLARE-UIA-TOOL", 1, 0, false);
        declareFunction("ui_operator_undo_method", "UI-OPERATOR-UNDO-METHOD", 1, 0, false);
        declareFunction("ui_operator_child_completed_method", "UI-OPERATOR-CHILD-COMPLETED-METHOD", 1, 0, false);
        declareFunction("ui_operator_child_rejected_method", "UI-OPERATOR-CHILD-REJECTED-METHOD", 1, 0, false);
        declareFunction("ui_operator_child_invalidated_method", "UI-OPERATOR-CHILD-INVALIDATED-METHOD", 1, 0, false);
        declareFunction("ui_operator_finalize_method", "UI-OPERATOR-FINALIZE-METHOD", 1, 0, false);
        declareFunction("ui_operator_name", "UI-OPERATOR-NAME", 1, 0, false);
        declareFunction("ui_operator_generate_request_method", "UI-OPERATOR-GENERATE-REQUEST-METHOD", 1, 0, false);
        declareFunction("ui_operator_handle_reply_method", "UI-OPERATOR-HANDLE-REPLY-METHOD", 1, 0, false);
        declareFunction("ui_operator_hint_method", "UI-OPERATOR-HINT-METHOD", 1, 0, false);
        declareFunction("ui_operator_hint_name", "UI-OPERATOR-HINT-NAME", 1, 0, false);
        declareFunction("set_ui_operator_hint_name", "SET-UI-OPERATOR-HINT-NAME", 2, 0, false);
        declareFunction("ui_operator_cycl", "UI-OPERATOR-CYCL", 1, 0, false);
        declareFunction("ui_operator_has_feature_p", "UI-OPERATOR-HAS-FEATURE-P", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_tool_declaration_file() {
        deflexical("*UIA-TOOL-INFO-DICTIONARY*", NIL != boundp($uia_tool_info_dictionary$) ? ((SubLObject) ($uia_tool_info_dictionary$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), $int$70));
        defconstant("*UIA-TOOL-SLOTS*", $list_alt2);
        return NIL;
    }

    public static final SubLObject setup_uia_tool_declaration_file() {
                subl_macro_promotions.declare_defglobal($uia_tool_info_dictionary$);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $uia_tool_info_dictionary$ = makeSymbol("*UIA-TOOL-INFO-DICTIONARY*");

    public static final SubLInteger $int$70 = makeInteger(70);

    static private final SubLList $list_alt2 = list(new SubLObject[]{ list(makeKeyword("UNDO-METHOD"), makeSymbol("SYMBOLP"), NIL), list(makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("SYMBOLP"), NIL), list(makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("SYMBOLP"), NIL), list(makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("SYMBOLP"), NIL), list($NAME, makeSymbol("STRINGP"), T), list(makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("SYMBOLP"), NIL), list(makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("SYMBOLP"), NIL), list(makeKeyword("HINT-METHOD"), makeSymbol("SYMBOLP"), NIL), list(makeKeyword("HINT-NAME"), makeSymbol("STRINGP"), NIL), list($CYCL, makeSymbol("FORT-P"), NIL), list(makeKeyword("FEATURES"), makeSymbol("LISTP"), NIL), list(makeKeyword("FINALIZE-METHOD"), makeSymbol("SYMBOLP"), NIL) });

    private static final SubLSymbol UI_OPERATOR_P = makeSymbol("UI-OPERATOR-P");

    static private final SubLList $list_alt4 = list(makeSymbol("SLOT-KEY"), makeSymbol("TYPE"), makeSymbol("REQUIRED?"));



    static private final SubLString $str_alt6$The__S_slot_to_DECLARE_UIA_TOOL_m = makeString("The ~S slot to DECLARE-UIA-TOOL must be a ~S.");



    private static final SubLSymbol $UNDO_METHOD = makeKeyword("UNDO-METHOD");

    private static final SubLSymbol $CHILD_COMPLETED_METHOD = makeKeyword("CHILD-COMPLETED-METHOD");

    private static final SubLSymbol $CHILD_REJECTED_METHOD = makeKeyword("CHILD-REJECTED-METHOD");

    private static final SubLSymbol $CHILD_INVALIDATED_METHOD = makeKeyword("CHILD-INVALIDATED-METHOD");

    private static final SubLSymbol $FINALIZE_METHOD = makeKeyword("FINALIZE-METHOD");



    private static final SubLSymbol $GENERATE_REQUEST_METHOD = makeKeyword("GENERATE-REQUEST-METHOD");



    private static final SubLSymbol $HANDLE_REPLY_METHOD = makeKeyword("HANDLE-REPLY-METHOD");

    private static final SubLSymbol $HINT_METHOD = makeKeyword("HINT-METHOD");

    private static final SubLSymbol $HINT_NAME = makeKeyword("HINT-NAME");





    // // Initializers
    public void declareFunctions() {
        declare_uia_tool_declaration_file();
    }

    public void initializeVariables() {
        init_uia_tool_declaration_file();
    }

    public void runTopLevelForms() {
        setup_uia_tool_declaration_file();
    }
}

