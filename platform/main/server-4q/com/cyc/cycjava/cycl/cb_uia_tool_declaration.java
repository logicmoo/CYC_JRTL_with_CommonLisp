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
 *  module:      CB-UIA-TOOL-DECLARATION
 *  source file: /cyc/top/cycl/cb-uia-tool-declaration.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_uia_tool_declaration extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_tool_declaration() {
    }

    public static final SubLFile me = new cb_uia_tool_declaration();




    /**
     * <slot-key type required?>
     */
    // defconstant
    private static final SubLSymbol $cb_uia_tool_slots$ = makeSymbol("*CB-UIA-TOOL-SLOTS*");

    public static final SubLObject declare_cb_uia_tool(SubLObject operator, SubLObject plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(operator, UI_OPERATOR_P);
            {
                SubLObject info = NIL;
                SubLObject cdolist_list_var = $cb_uia_tool_slots$.getGlobalValue();
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
                                            Errors.error($str_alt6$The__S_slot_to_DECLARE_CB_UIA_TOO, slot_key, type);
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
                dictionary.dictionary_enter($cb_uia_tool_info_dictionary$.getGlobalValue(), operator, nreverse(info));
            }
            return operator;
        }
    }

    public static final SubLObject set_cb_uia_operator_slot(SubLObject operator, SubLObject slot, SubLObject value) {
        {
            SubLObject entry = dictionary.dictionary_lookup($cb_uia_tool_info_dictionary$.getGlobalValue(), operator, UNPROVIDED);
            SubLObject slot_index = position(slot, $cb_uia_tool_slots$.getGlobalValue(), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
            if ((entry.isList() && slot_index.isInteger()) && (NIL != list_utilities.lengthG(entry, slot_index, UNPROVIDED))) {
                set_nth(slot_index, entry, value);
            }
        }
        return value;
    }

    public static final SubLObject get_cb_uia_operator_slot(SubLObject operator, SubLObject slot) {
        {
            SubLObject entry = dictionary.dictionary_lookup($cb_uia_tool_info_dictionary$.getGlobalValue(), operator, UNPROVIDED);
            SubLObject slot_index = position(slot, $cb_uia_tool_slots$.getGlobalValue(), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
            if ((entry.isList() && slot_index.isInteger()) && (NIL != list_utilities.lengthG(entry, slot_index, UNPROVIDED))) {
                return nth(slot_index, entry);
            }
        }
        return NIL;
    }

    public static final SubLObject undeclare_cb_uia_tool(SubLObject operator) {
        SubLTrampolineFile.checkType(operator, UI_OPERATOR_P);
        dictionary.dictionary_remove($cb_uia_tool_info_dictionary$.getGlobalValue(), operator);
        return operator;
    }

    public static final SubLObject cb_uia_operator_render_request_method(SubLObject operator) {
        {
            SubLObject method = get_cb_uia_operator_slot(operator, $RENDER_REQUEST_METHOD);
            if (method.isFunctionSpec()) {
                return method;
            }
            return cb_uia_operator_render_request_method($UNKNOWN_INTERACTION);
        }
    }

    public static final SubLObject cb_uia_operator_display_method(SubLObject operator) {
        {
            SubLObject method = get_cb_uia_operator_slot(operator, $DISPLAY_METHOD);
            if (method.isFunctionSpec()) {
                return method;
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_hint_for_operator(SubLObject operator) {
        return get_cb_uia_operator_slot(operator, $HINT_NAME);
    }

    public static final SubLObject declare_cb_uia_tool_declaration_file() {
        declareFunction("declare_cb_uia_tool", "DECLARE-CB-UIA-TOOL", 2, 0, false);
        declareFunction("set_cb_uia_operator_slot", "SET-CB-UIA-OPERATOR-SLOT", 3, 0, false);
        declareFunction("get_cb_uia_operator_slot", "GET-CB-UIA-OPERATOR-SLOT", 2, 0, false);
        declareFunction("undeclare_cb_uia_tool", "UNDECLARE-CB-UIA-TOOL", 1, 0, false);
        declareFunction("cb_uia_operator_render_request_method", "CB-UIA-OPERATOR-RENDER-REQUEST-METHOD", 1, 0, false);
        declareFunction("cb_uia_operator_display_method", "CB-UIA-OPERATOR-DISPLAY-METHOD", 1, 0, false);
        declareFunction("cb_uia_hint_for_operator", "CB-UIA-HINT-FOR-OPERATOR", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_tool_declaration_file() {
        deflexical("*CB-UIA-TOOL-INFO-DICTIONARY*", NIL != boundp($cb_uia_tool_info_dictionary$) ? ((SubLObject) ($cb_uia_tool_info_dictionary$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), $int$70));
        defconstant("*CB-UIA-TOOL-SLOTS*", $list_alt2);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_tool_declaration_file() {
                subl_macro_promotions.declare_defglobal($cb_uia_tool_info_dictionary$);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $cb_uia_tool_info_dictionary$ = makeSymbol("*CB-UIA-TOOL-INFO-DICTIONARY*");

    public static final SubLInteger $int$70 = makeInteger(70);

    static private final SubLList $list_alt2 = list(list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("SYMBOLP"), NIL), list(makeKeyword("DISPLAY-METHOD"), makeSymbol("SYMBOLP"), NIL), list(makeKeyword("HINT-NAME"), makeSymbol("STRINGP"), NIL), list($CYCL, makeSymbol("FORT-P"), NIL));

    private static final SubLSymbol UI_OPERATOR_P = makeSymbol("UI-OPERATOR-P");

    static private final SubLList $list_alt4 = list(makeSymbol("SLOT-KEY"), makeSymbol("TYPE"), makeSymbol("REQUIRED?"));



    static private final SubLString $str_alt6$The__S_slot_to_DECLARE_CB_UIA_TOO = makeString("The ~S slot to DECLARE-CB-UIA-TOOL must be a ~S.");



    private static final SubLSymbol $RENDER_REQUEST_METHOD = makeKeyword("RENDER-REQUEST-METHOD");



    private static final SubLSymbol $DISPLAY_METHOD = makeKeyword("DISPLAY-METHOD");

    private static final SubLSymbol $HINT_NAME = makeKeyword("HINT-NAME");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_tool_declaration_file();
    }

    public void initializeVariables() {
        init_cb_uia_tool_declaration_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_tool_declaration_file();
    }
}

