/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-MACROS
 *  source file: /cyc/top/cycl/uia-macros.lisp
 *  created:     2019/07/03 17:37:56
 */
public final class uia_macros extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_macros() {
    }

    public static final SubLFile me = new uia_macros();


    // // Definitions
    // defparameter
    public static final SubLSymbol $focused_uia_interaction$ = makeSymbol("*FOCUSED-UIA-INTERACTION*");

    public static final SubLObject with_focused_uia_interaction(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt1, append(body, NIL));
        }
    }

    public static final SubLObject with_focused_main_window_uia_interaction(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_agenda = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    v_agenda = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(WITH_FOCUSED_UIA_INTERACTION, listS(UIA_LAUNCH_ACTION_IN_FRAME, $UIA_INTERACTION, v_agenda, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt2);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_destructure_request(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject interaction_var = NIL;
                    SubLObject action_type_var = NIL;
                    SubLObject plist_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    interaction_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    action_type_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    plist_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject request = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt6);
                            request = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                SubLObject operator = $sym7$OPERATOR;
                                SubLObject signature = $sym8$SIGNATURE;
                                return list(CDESTRUCTURING_BIND, listS(operator, action_type_var, signature, plist_var), request, list(IGNORE, operator), listS(CLET, list(list(interaction_var, list(FIND_UI_BY_SIGNATURE, signature))), append(body, NIL)));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt6);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * sometimes binds INTERACTION-VAR to NIL, depending on whether :signature is on the plist
     */
    public static final SubLObject uiat_destructure_reply(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject agenda_var = NIL;
                    SubLObject interaction_var = NIL;
                    SubLObject action_type_var = NIL;
                    SubLObject plist_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    agenda_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    interaction_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    action_type_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    plist_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject reply = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt12);
                            reply = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                SubLObject operator = $sym13$OPERATOR;
                                SubLObject signature = $sym14$SIGNATURE;
                                SubLObject agenda_signature = $sym15$AGENDA_SIGNATURE;
                                SubLObject temp_plist = $sym16$TEMP_PLIST;
                                return list(CDESTRUCTURING_BIND, listS(operator, action_type_var, temp_plist), reply, list(IGNORE, operator), listS(CLET, list(list(signature, listS(GETF, temp_plist, $list_alt18)), list(agenda_signature, listS(GETF, temp_plist, $list_alt19)), list(plist_var, listS(REMF, listS(REMF, list(COPY_LIST, temp_plist), $list_alt18), $list_alt19)), list(interaction_var, list(FWHEN, signature, list(FIND_UI_BY_SIGNATURE, signature))), list(agenda_var, list(FIF, interaction_var, list(UI_AGENDA, interaction_var), list(FIND_UIA_BY_SIGNATURE, agenda_signature)))), append(body, NIL)));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt12);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_with_asserting_tool_keyword(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject tool_key = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    tool_key = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject tool_cycl = $sym27$TOOL_CYCL;
                            return list(CLET, list(list(tool_cycl, list(UI_OPERATOR_CYCL, tool_key))), listS(RKF_WITH_ASSERTING_TOOL_CYCL, list(tool_cycl), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt26);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_with_asserting_tool_for_interaction(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject interaction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    interaction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject tool_key = $sym31$TOOL_KEY;
                            return list(CLET, list(list(tool_key, list(UI_OPERATOR, interaction))), listS(UIA_WITH_ASSERTING_TOOL_KEYWORD, list(tool_key), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt30);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_dialog_turn(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt34);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_agenda = NIL;
                    SubLObject utterance_type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    v_agenda = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    utterance_type = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(WITH_UIA_DIALOG_PARTICIPANTS_FOR_UTTERANCE_TYPE, list(v_agenda, utterance_type), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt34);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject ignore_uia_dialog_participants(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt36, append(body, NIL));
        }
    }

    public static final SubLObject with_uia_dialog_participants_for_utterance_type(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt34);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_agenda = NIL;
                    SubLObject utterance_type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    v_agenda = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    utterance_type = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($rkf_addressee$, list(UIA_ADDRESSEE_FOR_UTTERANCE_TYPE, v_agenda, utterance_type)), list($rkf_speaker$, list(UIA_SPEAKER_FOR_UTTERANCE_TYPE, v_agenda, utterance_type))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt34);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_addressee_for_utterance_type(SubLObject v_agenda, SubLObject utterance_type) {
        {
            SubLObject pcase_var = utterance_type;
            if (pcase_var.eql($CYC_TO_USER)) {
                return uia_setup_state.uia_user(v_agenda);
            } else
                if (pcase_var.eql($USER_TO_CYC)) {
                    return $$Cyc;
                }

        }
        return NIL;
    }

    public static final SubLObject uia_speaker_for_utterance_type(SubLObject v_agenda, SubLObject utterance_type) {
        {
            SubLObject pcase_var = utterance_type;
            if (pcase_var.eql($CYC_TO_USER)) {
                return $$Cyc;
            } else
                if (pcase_var.eql($USER_TO_CYC)) {
                    return uia_setup_state.uia_user(v_agenda);
                }

        }
        return NIL;
    }

    public static final SubLObject uiat_sc_with_scenario_term_paraphrasing(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt45);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_scenario = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt45);
                    v_scenario = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject indexical_map = $sym46$INDEXICAL_MAP;
                            return list(CLET, list(list(indexical_map, list(SM_ACT_CONSTRUCT_INDEXICAL_TABLE, v_scenario))), listS(WITH_PARAPHRASE_MAPPINGS, indexical_map, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt45);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_sc_with_sc_state_term_paraphrasing(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt49);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sc_state = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt49);
                    sc_state = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject session = $sym50$SESSION;
                            SubLObject v_scenario = $sym51$SCENARIO;
                            return list(CLET, list(list(session, list(SC_STATE_ACTIVE_SESSION, sc_state)), list(v_scenario, list(SC_SESSION_SCENARIO, session))), listS(UIAT_SC_WITH_SCENARIO_TERM_PARAPHRASING, list(v_scenario), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt49);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_uia_macros_file() {
        declareMacro("with_focused_uia_interaction", "WITH-FOCUSED-UIA-INTERACTION");
        declareMacro("with_focused_main_window_uia_interaction", "WITH-FOCUSED-MAIN-WINDOW-UIA-INTERACTION");
        declareMacro("uiat_destructure_request", "UIAT-DESTRUCTURE-REQUEST");
        declareMacro("uiat_destructure_reply", "UIAT-DESTRUCTURE-REPLY");
        declareMacro("uia_with_asserting_tool_keyword", "UIA-WITH-ASSERTING-TOOL-KEYWORD");
        declareMacro("uia_with_asserting_tool_for_interaction", "UIA-WITH-ASSERTING-TOOL-FOR-INTERACTION");
        declareMacro("uia_dialog_turn", "UIA-DIALOG-TURN");
        declareMacro("ignore_uia_dialog_participants", "IGNORE-UIA-DIALOG-PARTICIPANTS");
        declareMacro("with_uia_dialog_participants_for_utterance_type", "WITH-UIA-DIALOG-PARTICIPANTS-FOR-UTTERANCE-TYPE");
        declareFunction("uia_addressee_for_utterance_type", "UIA-ADDRESSEE-FOR-UTTERANCE-TYPE", 2, 0, false);
        declareFunction("uia_speaker_for_utterance_type", "UIA-SPEAKER-FOR-UTTERANCE-TYPE", 2, 0, false);
        declareMacro("uiat_sc_with_scenario_term_paraphrasing", "UIAT-SC-WITH-SCENARIO-TERM-PARAPHRASING");
        declareMacro("uiat_sc_with_sc_state_term_paraphrasing", "UIAT-SC-WITH-SC-STATE-TERM-PARAPHRASING");
        return NIL;
    }

    public static final SubLObject init_uia_macros_file() {
        defparameter("*FOCUSED-UIA-INTERACTION*", NIL);
        return NIL;
    }

    public static final SubLObject setup_uia_macros_file() {
                access_macros.register_macro_helper(WITH_UIA_DIALOG_PARTICIPANTS_FOR_UTTERANCE_TYPE, UIA_DIALOG_TURN);
        access_macros.register_macro_helper(UIA_ADDRESSEE_FOR_UTTERANCE_TYPE, WITH_UIA_DIALOG_PARTICIPANTS_FOR_UTTERANCE_TYPE);
        access_macros.register_macro_helper(UIA_SPEAKER_FOR_UTTERANCE_TYPE, WITH_UIA_DIALOG_PARTICIPANTS_FOR_UTTERANCE_TYPE);
        return NIL;
    }



    static private final SubLList $list_alt1 = list(list(makeSymbol("*FOCUSED-UIA-INTERACTION*"), T));

    static private final SubLList $list_alt2 = list(list(makeSymbol("AGENDA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_FOCUSED_UIA_INTERACTION = makeSymbol("WITH-FOCUSED-UIA-INTERACTION");

    private static final SubLSymbol UIA_LAUNCH_ACTION_IN_FRAME = makeSymbol("UIA-LAUNCH-ACTION-IN-FRAME");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLList $list_alt6 = list(list(makeSymbol("INTERACTION-VAR"), makeSymbol("ACTION-TYPE-VAR"), makeSymbol("PLIST-VAR")), makeSymbol("REQUEST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym7$OPERATOR = makeUninternedSymbol("OPERATOR");

    static private final SubLSymbol $sym8$SIGNATURE = makeUninternedSymbol("SIGNATURE");





    private static final SubLSymbol FIND_UI_BY_SIGNATURE = makeSymbol("FIND-UI-BY-SIGNATURE");

    static private final SubLList $list_alt12 = list(list(makeSymbol("AGENDA-VAR"), makeSymbol("INTERACTION-VAR"), makeSymbol("ACTION-TYPE-VAR"), makeSymbol("PLIST-VAR")), makeSymbol("REPLY"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym13$OPERATOR = makeUninternedSymbol("OPERATOR");

    static private final SubLSymbol $sym14$SIGNATURE = makeUninternedSymbol("SIGNATURE");

    static private final SubLSymbol $sym15$AGENDA_SIGNATURE = makeUninternedSymbol("AGENDA-SIGNATURE");

    static private final SubLSymbol $sym16$TEMP_PLIST = makeUninternedSymbol("TEMP-PLIST");



    static private final SubLList $list_alt18 = list(makeKeyword("SIGNATURE"));

    static private final SubLList $list_alt19 = list(makeKeyword("AGENDA-SIGNATURE"));

    private static final SubLSymbol REMF = makeSymbol("REMF");









    private static final SubLSymbol FIND_UIA_BY_SIGNATURE = makeSymbol("FIND-UIA-BY-SIGNATURE");

    static private final SubLList $list_alt26 = list(list(makeSymbol("TOOL-KEY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym27$TOOL_CYCL = makeUninternedSymbol("TOOL-CYCL");

    private static final SubLSymbol UI_OPERATOR_CYCL = makeSymbol("UI-OPERATOR-CYCL");

    private static final SubLSymbol RKF_WITH_ASSERTING_TOOL_CYCL = makeSymbol("RKF-WITH-ASSERTING-TOOL-CYCL");

    static private final SubLList $list_alt30 = list(list(makeSymbol("INTERACTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym31$TOOL_KEY = makeUninternedSymbol("TOOL-KEY");

    private static final SubLSymbol UI_OPERATOR = makeSymbol("UI-OPERATOR");

    private static final SubLSymbol UIA_WITH_ASSERTING_TOOL_KEYWORD = makeSymbol("UIA-WITH-ASSERTING-TOOL-KEYWORD");

    static private final SubLList $list_alt34 = list(list(makeSymbol("AGENDA"), makeSymbol("UTTERANCE-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_UIA_DIALOG_PARTICIPANTS_FOR_UTTERANCE_TYPE = makeSymbol("WITH-UIA-DIALOG-PARTICIPANTS-FOR-UTTERANCE-TYPE");

    static private final SubLList $list_alt36 = list(list(makeSymbol("*RKF-ADDRESSEE*"), $NONE), list(makeSymbol("*RKF-SPEAKER*"), NIL));

    private static final SubLSymbol UIA_DIALOG_TURN = makeSymbol("UIA-DIALOG-TURN");

    public static final SubLSymbol $rkf_addressee$ = makeSymbol("*RKF-ADDRESSEE*");

    private static final SubLSymbol UIA_ADDRESSEE_FOR_UTTERANCE_TYPE = makeSymbol("UIA-ADDRESSEE-FOR-UTTERANCE-TYPE");

    public static final SubLSymbol $rkf_speaker$ = makeSymbol("*RKF-SPEAKER*");

    private static final SubLSymbol UIA_SPEAKER_FOR_UTTERANCE_TYPE = makeSymbol("UIA-SPEAKER-FOR-UTTERANCE-TYPE");

    private static final SubLSymbol $CYC_TO_USER = makeKeyword("CYC-TO-USER");

    private static final SubLSymbol $USER_TO_CYC = makeKeyword("USER-TO-CYC");

    public static final SubLObject $$Cyc = constant_handles.reader_make_constant_shell(makeString("Cyc"));

    static private final SubLList $list_alt45 = list(list(makeSymbol("SCENARIO")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym46$INDEXICAL_MAP = makeUninternedSymbol("INDEXICAL-MAP");

    private static final SubLSymbol SM_ACT_CONSTRUCT_INDEXICAL_TABLE = makeSymbol("SM-ACT-CONSTRUCT-INDEXICAL-TABLE");

    private static final SubLSymbol WITH_PARAPHRASE_MAPPINGS = makeSymbol("WITH-PARAPHRASE-MAPPINGS");

    static private final SubLList $list_alt49 = list(list(makeSymbol("SC-STATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym50$SESSION = makeUninternedSymbol("SESSION");

    static private final SubLSymbol $sym51$SCENARIO = makeUninternedSymbol("SCENARIO");

    private static final SubLSymbol SC_STATE_ACTIVE_SESSION = makeSymbol("SC-STATE-ACTIVE-SESSION");

    private static final SubLSymbol SC_SESSION_SCENARIO = makeSymbol("SC-SESSION-SCENARIO");

    private static final SubLSymbol UIAT_SC_WITH_SCENARIO_TERM_PARAPHRASING = makeSymbol("UIAT-SC-WITH-SCENARIO-TERM-PARAPHRASING");

    // // Initializers
    public void declareFunctions() {
        declare_uia_macros_file();
    }

    public void initializeVariables() {
        init_uia_macros_file();
    }

    public void runTopLevelForms() {
        setup_uia_macros_file();
    }
}

