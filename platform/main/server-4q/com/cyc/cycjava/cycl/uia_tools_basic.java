/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.rtp.recognition;
import com.cyc.cycjava.cycl.rtp.rtp_datastructures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-TOOLS-BASIC
 *  source file: /cyc/top/cycl/uia-tools-basic.lisp
 *  created:     2019/07/03 17:37:57
 */
public final class uia_tools_basic extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_tools_basic() {
    }

    public static final SubLFile me = new uia_tools_basic();

    public static final String myName = "com.cyc.cycjava.cycl.uia_tools_basic";

    // // Definitions
    public static final SubLObject uia_act_new_reset_agenda(SubLObject v_agenda) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, $REQUIRED, $RESET_AGENDA, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject uiat_reset_agenda_generate_request(SubLObject interaction) {
        return user_interaction_agenda.make_ui_request(interaction, $SHOW, NIL);
    }

    public static final SubLObject uiat_reset_agenda_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                user_interaction_agenda.uia_act_complete(v_agenda, interaction, action_type);
                uiat_reset_perform_reset_action(v_agenda, action_type);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_reset_perform_reset_action(SubLObject v_agenda, SubLObject action_type) {
        {
            SubLObject pcase_var = action_type;
            if (pcase_var.eql($CLEAR_MEMOIZATION)) {
                uia_reset_forget_caches(v_agenda);
            } else
                if (pcase_var.eql($RESET_NL_TRIE)) {
                    uia_reset_nl_trie(v_agenda);
                } else
                    if (pcase_var.eql($REJECT_ALL)) {
                        user_interaction_agenda.uia_act_reject_all(v_agenda);
                    } else
                        if (pcase_var.eql($RESTART_TOPIC)) {
                            user_interaction_agenda.uia_act_reset(v_agenda, UNPROVIDED);
                            user_interaction_agenda.uia_act_standard_initialization(v_agenda);
                        } else
                            if (pcase_var.eql($RESTART_N_FORGET)) {
                                uiat_reset_forget_the_terms(v_agenda);
                                uiat_reset_perform_reset_action(v_agenda, $RESTART_TOPIC);
                            } else
                                if (pcase_var.eql($COMPLETE_RESTART)) {
                                    {
                                        SubLObject meta_agenda = user_interaction_agenda.uia_meta_agenda(v_agenda);
                                        user_interaction_agenda.uima_act_reset(meta_agenda, UNPROVIDED);
                                    }
                                }





        }
        return NIL;
    }

    public static final SubLObject uia_reset_forget_caches(SubLObject v_agenda) {
        user_interaction_agenda.uia_act_clear_memoization(v_agenda);
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        recognition.reset_all_recognizer_caches();
        rkf_relevance_utilities.clear_cached_rkf_irrelevant_fort();
        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        psp_main.clear_psp_caches();
        return NIL;
    }

    public static final SubLObject uiat_reset_forget_the_terms(SubLObject v_agenda) {
        return uia_setup_state.uia_tear_down_state(v_agenda);
    }

    public static final SubLObject uia_reset_nl_trie(SubLObject v_agenda) {
        return nl_trie.triefy_mt(user_interaction_agenda.uia_lexical_interaction_mt(v_agenda), UNPROVIDED);
    }

    public static final SubLObject uiat_empty_agenda_generate_request(SubLObject interaction) {
        return user_interaction_agenda.make_empty_ui_request();
    }

    public static final SubLObject uiat_unknown_interaction_generate_request(SubLObject interaction) {
        {
            SubLObject operator = user_interaction_agenda.ui_operator(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject state = user_interaction_agenda.ui_state(interaction);
            return user_interaction_agenda.make_ui_request(interaction, $SHOW, list($OPERATOR, operator, $ARGS, args, $STATE, state));
        }
    }

    public static final SubLObject uiat_message_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject message = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            message = current.first();
            current = current.rest();
            {
                SubLObject secs = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt22);
                current = current.rest();
                if (NIL == current) {
                    return format(NIL, $str_alt23$Message____A, message);
                } else {
                    cdestructuring_bind_error(datum, $list_alt22);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_message_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject message = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            message = current.first();
            current = current.rest();
            {
                SubLObject refresh = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt24);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($MESSAGE, message, $REFRESH, refresh));
                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                        return request;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt24);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_acknowledge_message_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject message = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            message = current.first();
            current = current.rest();
            {
                SubLObject refresh = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt24);
                current = current.rest();
                if (NIL == current) {
                    return format(NIL, $str_alt29$Acknowledge____A, message);
                } else {
                    cdestructuring_bind_error(datum, $list_alt24);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_acknowledge_message_generate_request(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject message_struct = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            message_struct = current.first();
            current = current.rest();
            {
                SubLObject refresh = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt30);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($MESSAGE, message_struct, $REFRESH, refresh));
                        if (refresh.isFixnum()) {
                            user_interaction_agenda.uia_act_complete(user_interaction_agenda.ui_agenda(interaction), interaction, $REFRESH);
                        }
                        return request;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt30);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_acknowledge_structured_message(SubLObject v_agenda, SubLObject message_struct) {
        return uia_act_new_timed_acknowledge_structured_message(v_agenda, message_struct, NIL);
    }

    public static final SubLObject uia_act_new_timed_acknowledge_structured_message(SubLObject v_agenda, SubLObject message_struct, SubLObject refresh) {
        if (message_struct.first() != $TEXT) {
            message_struct = cons($TEXT, message_struct);
        }
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, $REQUIRED, $ACKNOWLEDGE_STRUCTURED_MESSAGE, list(message_struct, refresh), UNPROVIDED);
    }

    public static final SubLObject uiat_acknowledge_structured_message_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject parent_message = user_interaction_agenda.ui_hint(user_interaction_agenda.ui_parent_interaction(interaction), v_agenda);
            return cconcatenate($str_alt34$Acknowledge_Message_for_, parent_message);
        }
    }

    public static final SubLObject uiat_acknowledge_structured_message_generate_request(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject message_struct = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            message_struct = current.first();
            current = current.rest();
            {
                SubLObject refresh = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt30);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($MESSAGE_STRUCT, message_struct, $REFRESH, refresh));
                        if (refresh.isFixnum()) {
                            user_interaction_agenda.uia_act_complete(user_interaction_agenda.ui_agenda(interaction), interaction, $REFRESH);
                        }
                        return request;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt30);
                }
            }
        }
        return NIL;
    }

    /**
     * A variant on @xref UIA-ACT-NEW-YES-NO-QUESTION. Ask the user to confirm or deny the truth of CYCL.
     */
    public static final SubLObject uia_act_new_cycl_confirm(SubLObject v_agenda, SubLObject mode, SubLObject cycl, SubLObject v_question, SubLObject callback, SubLObject unknown_allowedP, SubLObject indexical_table) {
        if (v_question == UNPROVIDED) {
            v_question = NIL;
        }
        if (callback == UNPROVIDED) {
            callback = NIL;
        }
        if (unknown_allowedP == UNPROVIDED) {
            unknown_allowedP = NIL;
        }
        if (indexical_table == UNPROVIDED) {
            indexical_table = NIL;
        }
        if (!v_question.isString()) {
            v_question = $str_alt38$Is_the_following_sentence_true_;
        }
        return uia_act_new_yes_no_question(v_agenda, mode, v_question, callback, unknown_allowedP, indexical_table, cycl);
    }

    public static final SubLObject uia_act_new_yes_no_question(SubLObject v_agenda, SubLObject mode, SubLObject v_question, SubLObject callback, SubLObject unknown_allowedP, SubLObject indexical_table, SubLObject cycl) {
        if (callback == UNPROVIDED) {
            callback = NIL;
        }
        if (unknown_allowedP == UNPROVIDED) {
            unknown_allowedP = NIL;
        }
        if (indexical_table == UNPROVIDED) {
            indexical_table = NIL;
        }
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        {
            SubLObject args = list(v_question, callback, unknown_allowedP, indexical_table, cycl);
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $YES_NO_QUESTION, args, UNPROVIDED);
        }
    }

    public static final SubLObject uiat_yes_no_question_generate_request(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject v_question = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            v_question = current.first();
            current = current.rest();
            {
                SubLObject callback = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt39);
                current = current.rest();
                {
                    SubLObject unknown = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt39);
                    current = current.rest();
                    {
                        SubLObject indexical_table = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt39);
                        current = current.rest();
                        {
                            SubLObject cycl = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt39);
                            current = current.rest();
                            if (NIL == current) {
                                return user_interaction_agenda.make_ui_request(interaction, $SHOW, list(new SubLObject[]{ $QUESTION, v_question, $CALLBACK, callback, $UNKNOWN_ALLOWED, unknown, $INDEXICAL_TABLE, indexical_table, $CYCL, cycl }));
                            } else {
                                cdestructuring_bind_error(datum, $list_alt39);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_yes_no_question_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($ANSWER)) {
                    {
                        SubLObject datum_1 = plist;
                        SubLObject current_2 = datum_1;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_2;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_1, $list_alt46);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_1, $list_alt46);
                            if (NIL == member(current_3, $list_alt47, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_1, $list_alt46);
                        }
                        {
                            SubLObject answer_tail = property_list_member($ANSWER, current_2);
                            SubLObject v_answer = (NIL != answer_tail) ? ((SubLObject) (cadr(answer_tail))) : NIL;
                            user_interaction_agenda.uia_act_complete(v_agenda, interaction, v_answer);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_input_box(SubLObject v_agenda, SubLObject mode, SubLObject prompt, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            SubLObject plist = NIL;
            if (NIL != v_default) {
                plist = putf(plist, $DEFAULT, v_default);
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $INPUT_BOX, list(prompt), plist);
        }
    }

    public static final SubLObject uiat_input_box_generate_request(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject prompt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt52);
            prompt = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_default = user_interaction_agenda.ui_state_lookup(interaction, $DEFAULT, $str_alt53$);
                    return user_interaction_agenda.make_ui_request(interaction, $SHOW, list($PROMPT, prompt, $DEFAULT, v_default));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt52);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_input_box_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_4 = plist;
                        SubLObject current_5 = datum_4;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_5;
                        SubLObject bad = NIL;
                        SubLObject current_6 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_4, $list_alt56);
                            current_6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_4, $list_alt56);
                            if (NIL == member(current_6, $list_alt57, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_4, $list_alt56);
                        }
                        {
                            SubLObject prompt_tail = property_list_member($PROMPT, current_5);
                            SubLObject prompt = (NIL != prompt_tail) ? ((SubLObject) (cadr(prompt_tail))) : NIL;
                            SubLObject default_tail = property_list_member($DEFAULT, current_5);
                            SubLObject v_default = (NIL != default_tail) ? ((SubLObject) (cadr(default_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_5);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_input_box(v_agenda, mode, prompt, v_default);
                        }
                    }
                } else
                    if (pcase_var.eql($ANSWER)) {
                        {
                            SubLObject datum_7 = plist;
                            SubLObject current_8 = datum_7;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_8;
                            SubLObject bad = NIL;
                            SubLObject current_9 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_7, $list_alt46);
                                current_9 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_7, $list_alt46);
                                if (NIL == member(current_9, $list_alt47, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_9 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_7, $list_alt46);
                            }
                            {
                                SubLObject answer_tail = property_list_member($ANSWER, current_8);
                                SubLObject v_answer = (NIL != answer_tail) ? ((SubLObject) (cadr(answer_tail))) : NIL;
                                user_interaction_agenda.uia_act_complete(v_agenda, interaction, v_answer);
                            }
                        }
                    }

            }
        }
        return NIL;
    }

    /**
     * Add a new :thinking interaction as a child of PARENT.
     * The form (apply FUNCTION ARGS) is evaluated in a separate thread.
     * The result of the evaluation will be the result of the interaction.
     */
    public static final SubLObject uia_act_new_thinking_child(SubLObject parent, SubLObject function, SubLObject args, SubLObject progress_message, SubLObject my_result_will_be) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (progress_message == UNPROVIDED) {
            progress_message = $$$Thinking;
        }
        if (my_result_will_be == UNPROVIDED) {
            my_result_will_be = NIL;
        }
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject mode = user_interaction_agenda.ui_mode(parent);
            SubLObject child = uia_act_new_thinking(v_agenda, mode, function, args, progress_message);
            user_interaction_agenda.uia_act_add_dependent(v_agenda, parent, child);
            if (NIL != my_result_will_be) {
                user_interaction_agenda.ui_state_update(child, $MY_RESULT_WILL_BE, my_result_will_be);
            }
            uiat_thinking_start(child);
            return child;
        }
    }

    /**
     * Prepare and start a new :thinking interaction.
     * The form (apply FUNCTION ARGS) will be evaluated in a separate thread.
     */
    public static final SubLObject uia_act_new_thinking_task(SubLObject v_agenda, SubLObject mode, SubLObject function, SubLObject args, SubLObject progress_message) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (progress_message == UNPROVIDED) {
            progress_message = $$$Thinking;
        }
        {
            SubLObject interaction = uia_act_new_thinking(v_agenda, mode, function, args, progress_message);
            uiat_thinking_start(interaction);
            return interaction;
        }
    }

    /**
     * Prepare a new :thinking interaction.
     * The form (apply FUNCTION ARGS) will be evaluated in a separate thread
     * once the thinking interaction is started (by UIAT-THINKING-START).
     */
    public static final SubLObject uia_act_new_thinking(SubLObject v_agenda, SubLObject mode, SubLObject function, SubLObject args, SubLObject progress_message) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (progress_message == UNPROVIDED) {
            progress_message = $$$Thinking;
        }
        {
            SubLObject lock = make_lock($$$UIA_Thinking);
            SubLObject interaction_args = list(function, args);
            SubLObject thinking = process_utilities.new_thinking_task($$$UIA_Thinking, progress_message, UNPROVIDED);
            SubLObject interaction_plist = list($LOCK, lock, $THINKING_TASK, thinking, $PROGRESS_MESSAGE, progress_message);
            SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $THINKING, interaction_args, interaction_plist);
            process_utilities.thinking_note_property(thinking, $INTERACTION, interaction);
            return interaction;
        }
    }

    public static final SubLObject uiat_thinking_finalize(SubLObject interaction) {
        uiat_thinking_stop(interaction);
        return interaction;
    }

    public static final SubLObject uiat_thinking_hint(SubLObject interaction) {
        {
            SubLObject thinking = user_interaction_agenda.ui_state_lookup(interaction, $THINKING_TASK, UNPROVIDED);
            SubLObject progress_message = process_utilities.thinking_progress_message(thinking);
            SubLObject sleepingP = ui_thinking_sleepingP(interaction);
            SubLObject hint = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                if (NIL != sleepingP) {
                    princ($str_alt68$Currently_Inactive_, stream);
                }
                princ($$$Thinking, stream);
                if (NIL != progress_message) {
                    format(stream, $str_alt69$____A, progress_message);
                }
                hint = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return hint;
        }
    }

    public static final SubLObject uiat_thinking_generate_request(SubLObject interaction) {
        return user_interaction_agenda.make_ui_request(interaction, $SHOW, uiat_thinking_progress_summary(interaction));
    }

    /**
     *
     *
     * @return BOOLEAN; Is the thinking interaction INTERACTION sleeping?
     */
    public static final SubLObject ui_thinking_sleepingP(SubLObject interaction) {
        {
            SubLObject thinking = user_interaction_agenda.ui_state_lookup(interaction, $THINKING_TASK, UNPROVIDED);
            SubLObject thread = process_utilities.thinking_thread(thinking);
            SubLObject sleepingP = (NIL != processp(thread)) ? ((SubLObject) (equal(process_whostate(thread), $$$Sleeping))) : NIL;
            return sleepingP;
        }
    }

    // defparameter
    private static final SubLSymbol $uiat_thinking_interaction$ = makeSymbol("*UIAT-THINKING-INTERACTION*");

    /**
     * Return the encompassing :thinking interaction of this process, if any.
     */
    public static final SubLObject uiat_thinking_interaction() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $uiat_thinking_interaction$.getDynamicValue(thread);
        }
    }

    /**
     * Return the agenda of the encompassing :thinking interaction of this process, if any.
     */
    public static final SubLObject uiat_thinking_agenda() {
        {
            SubLObject interaction = uiat_thinking_interaction();
            if (NIL != interaction) {
                return user_interaction_agenda.ui_agenda(interaction);
            }
        }
        return NIL;
    }

    /**
     * Return the meta-agenda of the encompassing :thinking interaction of this process, if any.
     */
    public static final SubLObject uiat_thinking_meta_agenda() {
        {
            SubLObject interaction = uiat_thinking_interaction();
            if (NIL != interaction) {
                return user_interaction_agenda.ui_meta_agenda(interaction);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_thinking_thread(SubLObject function, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thinking = process_utilities.thinking_task();
                SubLObject interaction = process_utilities.thinking_property(thinking, $INTERACTION);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject result = NIL;
                SubLObject success = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = $uiat_thinking_interaction$.currentBinding(thread);
                        try {
                            $uiat_thinking_interaction$.bind(interaction, thread);
                            success = NIL;
                            result = apply(function, args);
                            success = T;
                        } finally {
                            $uiat_thinking_interaction$.rebind(_prev_bind_0, thread);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != success) {
                                user_interaction_agenda.uia_act_complete(v_agenda, interaction, result);
                            } else {
                                user_interaction_agenda.uia_act_invalidate(v_agenda, interaction);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return NIL;
            }
        }
    }

    /**
     * Start the thread of a :thinking INTERACTION.
     * If successful, return the thread, else NIL.
     */
    public static final SubLObject uiat_thinking_start(SubLObject interaction) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        if (($THINKING == user_interaction_agenda.ui_operator(interaction)) && ($PENDING == user_interaction_agenda.ui_status(interaction))) {
            {
                SubLObject thinking = user_interaction_agenda.ui_state_lookup(interaction, $THINKING_TASK, UNPROVIDED);
                SubLObject v_answer = NIL;
                SubLObject arg_package = user_interaction_agenda.ui_args(interaction);
                v_answer = process_utilities.thinking_start(thinking, UIAT_THINKING_THREAD, arg_package);
                return v_answer;
            }
        }
        return NIL;
    }

    /**
     * Stop the thread of a :thinking INTERACTION.
     * Return T iff the thread was stopped.
     */
    public static final SubLObject uiat_thinking_stop(SubLObject interaction) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        if ($THINKING == user_interaction_agenda.ui_operator(interaction)) {
            {
                SubLObject thinking = user_interaction_agenda.ui_state_lookup(interaction, $THINKING_TASK, UNPROVIDED);
                SubLObject v_answer = NIL;
                if (NIL != process_utilities.thinking_task_p(thinking)) {
                    v_answer = process_utilities.thinking_stop(thinking);
                }
                return v_answer;
            }
        }
        return NIL;
    }

    /**
     * Return a PLIST which is a progress summary of INTERACTION.
     */
    public static final SubLObject uiat_thinking_progress_summary(SubLObject interaction) {
        if (interaction == UNPROVIDED) {
            interaction = uiat_thinking_interaction();
        }
        {
            SubLObject thinking = user_interaction_agenda.ui_state_lookup(interaction, $THINKING_TASK, UNPROVIDED);
            SubLObject thread = process_utilities.thinking_thread(thinking);
            SubLObject mode = process_utilities.thinking_status(thinking);
            SubLObject message = process_utilities.thinking_progress_message(thinking);
            SubLObject sofar = process_utilities.thinking_progress_sofar(thinking);
            SubLObject total = process_utilities.thinking_progress_total(thinking);
            SubLObject start_time = process_utilities.thinking_start_time(thinking);
            SubLObject finish_time = process_utilities.thinking_finish_time(thinking);
            SubLObject run_time = (NIL != finish_time) ? ((SubLObject) (subtract(finish_time, start_time))) : NIL != start_time ? ((SubLObject) (subtract(get_universal_time(), start_time))) : NIL;
            if (NIL != processp(thread)) {
                mode = $RUNNING;
            }
            return nconc(list($MODE, mode, $MESSAGE, message), nconc(new SubLObject[]{ NIL != sofar ? ((SubLObject) (list($SOFAR, sofar))) : NIL, NIL != total ? ((SubLObject) (list($TOTAL, total))) : NIL, NIL != run_time ? ((SubLObject) (list($RUN_TIME, run_time))) : NIL, NIL != finish_time ? ((SubLObject) (list($FINISH_TIME, finish_time))) : NIL }));
        }
    }

    /**
     * Change the PROGRESS-MESSAGE of a :thinking INTERACTION.
     */
    public static final SubLObject uiat_thinking_note_progress_message(SubLObject progress_message, SubLObject interaction) {
        if (interaction == UNPROVIDED) {
            interaction = uiat_thinking_interaction();
        }
        SubLTrampolineFile.checkType(progress_message, STRINGP);
        if (NIL != interaction) {
            {
                SubLObject thinking = user_interaction_agenda.ui_state_lookup(interaction, $THINKING_TASK, UNPROVIDED);
                process_utilities.thinking_note_progress_message(thinking, progress_message);
            }
        }
        return interaction;
    }

    /**
     * Note numeric progress of SOFAR items in a :thinking INTERACTION.
     */
    public static final SubLObject uiat_thinking_note_numeric_progress(SubLObject sofar, SubLObject interaction) {
        if (interaction == UNPROVIDED) {
            interaction = uiat_thinking_interaction();
        }
        SubLTrampolineFile.checkType(sofar, INTEGERP);
        if (NIL != interaction) {
            {
                SubLObject thinking = user_interaction_agenda.ui_state_lookup(interaction, $THINKING_TASK, UNPROVIDED);
                process_utilities.thinking_note_progress_sofar(thinking, sofar);
            }
        }
        return interaction;
    }

    /**
     * Note a percent progress of SOFAR of TOTAL items in a :thinking INTERACTION.
     */
    public static final SubLObject uiat_thinking_note_percent_progress(SubLObject sofar, SubLObject total, SubLObject interaction) {
        if (interaction == UNPROVIDED) {
            interaction = uiat_thinking_interaction();
        }
        SubLTrampolineFile.checkType(sofar, INTEGERP);
        SubLTrampolineFile.checkType(total, INTEGERP);
        if (NIL != interaction) {
            {
                SubLObject thinking = user_interaction_agenda.ui_state_lookup(interaction, $THINKING_TASK, UNPROVIDED);
                process_utilities.thinking_note_progress_sofar(thinking, sofar);
                process_utilities.thinking_note_progress_total(thinking, total);
            }
        }
        return interaction;
    }

    public static final SubLObject uia_act_new_unknown_term(SubLObject v_agenda, SubLObject mode, SubLObject phrase, SubLObject nl_tags, SubLObject v_context, SubLObject suppressors, SubLObject isas, SubLObject v_genls) {
        if (v_context == UNPROVIDED) {
            v_context = NIL;
        }
        if (suppressors == UNPROVIDED) {
            suppressors = NIL;
        }
        if (isas == UNPROVIDED) {
            isas = NIL;
        }
        if (v_genls == UNPROVIDED) {
            v_genls = NIL;
        }
        {
            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            isas = uiat_unknown_term_remove_genls(isas, mt);
            v_genls = uiat_unknown_term_remove_genls(v_genls, mt);
        }
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $UNKNOWN_TERM, list(phrase, nl_tags, v_context, suppressors, isas, v_genls), UNPROVIDED);
    }

    public static final SubLObject uiat_unknown_term_remove_genls(SubLObject cols, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject remaining = NIL;
                for (remaining = cols; NIL != remaining; remaining = remaining.rest()) {
                    {
                        SubLObject datum = remaining;
                        SubLObject current = datum;
                        SubLObject this_col = NIL;
                        SubLObject others = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt83);
                        this_col = current.first();
                        current = current.rest();
                        others = current;
                        {
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    if (!((NIL != subl_promotions.memberP(this_col, others, $sym84$SPEC_, UNPROVIDED)) || (NIL != member(this_col, ans, $sym84$SPEC_, UNPROVIDED)))) {
                                        ans = cons(this_col, ans);
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject uiat_unknown_term_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt85);
            phrase = current.first();
            current = current.rest();
            {
                SubLObject gobble = current;
                return list($str_alt86$Determine_how_to_handle_unidentif, $TERM, phrase, $str_alt88$_);
            }
        }
    }

    public static final SubLObject uiat_unknown_term_generate_request(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject args = user_interaction_agenda.ui_args(interaction);
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject phrase = NIL;
                SubLObject nl_tags = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt89);
                phrase = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt89);
                nl_tags = current.first();
                current = current.rest();
                {
                    SubLObject v_context = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt89);
                    current = current.rest();
                    {
                        SubLObject suppressors = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt89);
                        current = current.rest();
                        {
                            SubLObject isas = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt89);
                            current = current.rest();
                            {
                                SubLObject v_genls = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt89);
                                current = current.rest();
                                if (NIL == current) {
                                    user_interaction_agenda.ui_state_update(interaction, $NL_TAGS, nl_tags);
                                    user_interaction_agenda.ui_state_update(interaction, $ISA_CONSTRAINTS, isas);
                                    user_interaction_agenda.ui_state_update(interaction, $GENLS_CONSTRAINTS, v_genls);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject isa_sentences = uiat_unknown_term_construct_isa_and_genls_constraints(interaction, phrase, isas, v_genls);
                                        SubLObject genls_sentences = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != uima_interface_parameter_declaration.uia_forge_aheadP(user_interaction_agenda.ui_agenda(interaction))) {
                                            uiat_unknown_term_comment_on_known_constraints(interaction, isa_sentences, genls_sentences);
                                        }
                                        return user_interaction_agenda.make_ui_request(interaction, $SHOW, list(new SubLObject[]{ $PHRASE, phrase, $CONTEXT, v_context, $SUPPRESSORS, suppressors, $ISA_CONSTRAINTS, isa_sentences, $GENLS_CONSTRAINTS, genls_sentences }));
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt89);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @unknown The unrefactored sentence reader calls this twice for bad but hard to fix reasons.
     */
    public static final SubLObject uiat_unknown_term_comment_on_known_constraints(SubLObject interaction, SubLObject isa_sentences, SubLObject genls_sentences) {
        if (NIL == user_interaction_agenda.ui_state_lookup(interaction, $COMMENTED_ON_SENTENCES, UNPROVIDED)) {
            {
                SubLObject remark = uiat_unknown_term_formulate_constraints(interaction, isa_sentences, genls_sentences);
                if (remark.isString() && (NIL == string_utilities.empty_string_p(remark))) {
                    user_interaction_agenda.uia_act_new_comment(user_interaction_agenda.ui_agenda(interaction), remark);
                }
                user_interaction_agenda.ui_state_update(interaction, $COMMENTED_ON_SENTENCES, $TRUE);
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_unknown_term_formulate_constraints(SubLObject interaction, SubLObject isa_sentences, SubLObject genls_sentences) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject message = NIL;
            if ((NIL != isa_sentences) || (NIL != genls_sentences)) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        format(stream, $str_alt98$From_context__I_assume_that_);
                        {
                            SubLObject cdolist_list_var = list(isa_sentences, genls_sentences);
                            SubLObject sentences = NIL;
                            for (sentences = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentences = cdolist_list_var.first()) {
                                {
                                    SubLObject cdolist_list_var_10 = sentences;
                                    SubLObject sentence = NIL;
                                    for (sentence = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , sentence = cdolist_list_var_10.first()) {
                                        terpri(stream);
                                        write_string($str_alt99$___, stream, UNPROVIDED, UNPROVIDED);
                                        write_string(uia_trampolines.uia_sentence_phrase(v_agenda, sentence, UNPROVIDED, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                        }
                        message = get_output_stream_string(stream);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                close(stream, UNPROVIDED);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
            return message;
        }
    }

    public static final SubLObject uiat_unknown_term_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject original_term = user_interaction_agenda.ui_result(child);
            SubLObject nl_tags = user_interaction_agenda.ui_state_lookup(parent, $NL_TAGS, UNPROVIDED);
            SubLObject v_term = uiat_unknown_term_best_nl_tags_for_term(original_term, nl_tags);
            SubLObject pcase_var = v_term;
            if (pcase_var.eql($NONE)) {
                user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
            } else {
                user_interaction_agenda.uia_act_complete(v_agenda, parent, v_term);
            }
        }
        return parent;
    }

    /**
     *
     *
     * @unknown stub--should really allow the possibility of clarification with the user
     * @param TERM
     * 		a CycL term
     * @param NL-TAGS
     * 		list; a list of CycL formulas, with :TERM in the place where TERM should go
     */
    public static final SubLObject uiat_unknown_term_best_nl_tags_for_term(SubLObject v_term, SubLObject nl_tags) {
        if (NIL == nl_tags) {
            return v_term;
        }
        if (nl_tags.first() == $TERM) {
            return v_term;
        }
        return subst(v_term, $TERM, nl_tags.first(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject uiat_unknown_term_construct_isa_and_genls_constraints(SubLObject interaction, SubLObject phrase, SubLObject isas, SubLObject v_genls) {
        {
            SubLObject isa_sentences = user_interaction_agenda.ui_state_lookup(interaction, $ISA_SENTENCES, NIL);
            SubLObject genls_sentences = user_interaction_agenda.ui_state_lookup(interaction, $GENLS_SENTENCES, NIL);
            if ((NIL == isa_sentences) && (NIL == genls_sentences)) {
                {
                    SubLObject v_term = phrase;
                    {
                        SubLObject cdolist_list_var = isas;
                        SubLObject v_isa = NIL;
                        for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                            {
                                SubLObject sentence = list($$isa, v_term, v_isa);
                                isa_sentences = cons(sentence, isa_sentences);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = v_genls;
                        SubLObject genl = NIL;
                        for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                            {
                                SubLObject sentence = list($$genls, v_term, genl);
                                genls_sentences = cons(sentence, genls_sentences);
                            }
                        }
                    }
                }
                user_interaction_agenda.ui_state_update(interaction, $ISA_SENTENCES, isa_sentences);
                user_interaction_agenda.ui_state_update(interaction, $GENLS_SENTENCES, genls_sentences);
            }
            return values(isa_sentences, genls_sentences);
        }
    }

    public static final SubLObject uiat_unknown_term_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject isas = user_interaction_agenda.ui_state_lookup(interaction, $ISA_CONSTRAINTS, UNPROVIDED);
                SubLObject v_genls = user_interaction_agenda.ui_state_lookup(interaction, $GENLS_CONSTRAINTS, UNPROVIDED);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($REJECT)) {
                    user_interaction_agenda.uia_act_reject(v_agenda, interaction);
                } else
                    if (pcase_var.eql($CREATE)) {
                        {
                            SubLObject datum_11 = plist;
                            SubLObject current_12 = datum_11;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_12;
                            SubLObject bad = NIL;
                            SubLObject current_13 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_11, $list_alt107);
                                current_13 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_11, $list_alt107);
                                if (NIL == member(current_13, $list_alt108, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_13 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_11, $list_alt107);
                            }
                            {
                                SubLObject phrase_tail = property_list_member($PHRASE, current_12);
                                SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                                SubLObject mode_tail = property_list_member($MODE, current_12);
                                SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : NIL;
                                SubLObject concept_creator_action = uia_tools_introduction.uia_act_new_concept_creator(v_agenda, mode, phrase, isas, v_genls, UNPROVIDED, UNPROVIDED);
                                if ($REQUIRED == mode) {
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, concept_creator_action);
                                } else {
                                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, $NONE);
                                }
                            }
                        }
                    } else
                        if (pcase_var.eql($AUTO_CREATE)) {
                            {
                                SubLObject datum_14 = plist;
                                SubLObject current_15 = datum_14;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_15;
                                SubLObject bad = NIL;
                                SubLObject current_16 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_14, $list_alt107);
                                    current_16 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_14, $list_alt107);
                                    if (NIL == member(current_16, $list_alt108, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_16 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_14, $list_alt107);
                                }
                                {
                                    SubLObject phrase_tail = property_list_member($PHRASE, current_15);
                                    SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                                    SubLObject mode_tail = property_list_member($MODE, current_15);
                                    SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : NIL;
                                    SubLObject similar = NIL;
                                    SubLObject auto_createP = T;
                                    SubLObject concept_creator_action = uia_tools_introduction.uia_act_new_concept_creator(v_agenda, mode, phrase, isas, v_genls, similar, auto_createP);
                                    if ($REQUIRED == mode) {
                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, concept_creator_action);
                                    } else {
                                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, $NONE);
                                    }
                                }
                            }
                        } else
                            if (pcase_var.eql($FIND)) {
                                {
                                    SubLObject datum_17 = plist;
                                    SubLObject current_18 = datum_17;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current_18;
                                    SubLObject bad = NIL;
                                    SubLObject current_19 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum_17, $list_alt107);
                                        current_19 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum_17, $list_alt107);
                                        if (NIL == member(current_19, $list_alt108, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_19 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum_17, $list_alt107);
                                    }
                                    {
                                        SubLObject phrase_tail = property_list_member($PHRASE, current_18);
                                        SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                                        SubLObject mode_tail = property_list_member($MODE, current_18);
                                        SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : NIL;
                                        SubLObject concept_finder_action = uia_act_new_concept_finder(v_agenda, mode, phrase, UNPROVIDED);
                                        if ($REQUIRED == mode) {
                                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, concept_finder_action);
                                        } else {
                                            user_interaction_agenda.uia_act_complete(v_agenda, interaction, $NONE);
                                        }
                                    }
                                }
                            }



            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_disambiguate_phrase_wXplist(SubLObject v_agenda, SubLObject mode, SubLObject phrase, SubLObject plist) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $DISAMBIGUATE_PHRASE, list(phrase), plist);
    }

    /**
     *
     *
     * @param :clarify-links
     * 		:true or :false
     * @param indistinguished;
     * 		whether to compute distinguishing sentences
     */
    public static final SubLObject uia_act_new_disambiguate_phrase(SubLObject v_agenda, SubLObject mode, SubLObject phrase, SubLObject candidate_terms, SubLObject clarify_links, SubLObject my_result_will_be, SubLObject indistinguished, SubLObject rejects, SubLObject indexical_table, SubLObject force) {
        if (clarify_links == UNPROVIDED) {
            clarify_links = NIL;
        }
        if (my_result_will_be == UNPROVIDED) {
            my_result_will_be = NIL;
        }
        if (indistinguished == UNPROVIDED) {
            indistinguished = NIL;
        }
        if (rejects == UNPROVIDED) {
            rejects = NIL;
        }
        if (indexical_table == UNPROVIDED) {
            indexical_table = NIL;
        }
        if (force == UNPROVIDED) {
            force = NIL;
        }
        {
            SubLObject plist = list($CANDIDATE_TERMS, candidate_terms);
            if (NIL != my_result_will_be) {
                plist = putf(plist, $MY_RESULT_WILL_BE, my_result_will_be);
            }
            if (NIL != clarify_links) {
                plist = putf(plist, $CLARIFY_LINKS, clarify_links);
            }
            if (NIL != indistinguished) {
                plist = putf(plist, $INDISTINGUISHED, $TRUE);
            }
            if (NIL != rejects) {
                plist = putf(plist, $REJECTS, rejects);
            }
            if (NIL != indexical_table) {
                plist = putf(plist, $INDEXICAL_TABLE, indexical_table);
            }
            if (((NIL == force) || (force == $NONE)) && (NIL != find_if(CYCL_SENTENCE_P, candidate_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                force = $DECLARATIVE;
            }
            if (NIL != force) {
                plist = putf(plist, $FORCE, force);
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $DISAMBIGUATE_PHRASE, list(phrase), plist);
        }
    }

    public static final SubLObject uiat_disambiguate_phrase_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt120);
            phrase = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt121$Select_meaning_for_phrase___S, phrase);
            } else {
                cdestructuring_bind_error(datum, $list_alt120);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_disambiguate_phrase_generate_request(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject show_clarify_links = user_interaction_agenda.ui_state_lookup(interaction, $CLARIFY_LINKS, $TRUE);
            SubLObject indistinguished = user_interaction_agenda.ui_state_lookup(interaction, $INDISTINGUISHED, $FALSE);
            SubLObject candidate_terms = user_interaction_agenda.ui_state_lookup(interaction, $CANDIDATE_TERMS, UNPROVIDED);
            SubLObject rejected_terms = user_interaction_agenda.ui_state_lookup(interaction, $REJECTS, $UNSPECIFIED);
            SubLObject indexical_table = user_interaction_agenda.ui_state_lookup(interaction, $INDEXICAL_TABLE, UNPROVIDED);
            SubLObject negate_terms = user_interaction_agenda.ui_state_lookup(interaction, $NEGATE_TERMS, UNPROVIDED);
            SubLObject force = user_interaction_agenda.ui_state_lookup(interaction, $FORCE, $NONE);
            SubLObject resort_rejected_termsP = equal(rejected_terms, $UNSPECIFIED);
            SubLObject show_comparison_links = eq(force, $NONE);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt120);
            phrase = current.first();
            current = current.rest();
            if (NIL == current) {
                if ($TRUE == negate_terms) {
                    rejected_terms = uiat_disambiguate_phrase_negate_terms(rejected_terms);
                    candidate_terms = uiat_disambiguate_phrase_negate_terms(candidate_terms);
                }
                if (NIL != resort_rejected_termsP) {
                    {
                        SubLObject datum_evaluated_var = uia_disambiguate_phrase_sort_out_rejects(candidate_terms);
                        candidate_terms = datum_evaluated_var.first();
                        rejected_terms = cadr(datum_evaluated_var);
                    }
                    user_interaction_agenda.ui_state_update(interaction, $REJECTS, rejected_terms);
                    user_interaction_agenda.ui_state_update(interaction, $CANDIDATE_TERMS, candidate_terms);
                }
                if ((NIL != list_utilities.singletonP(candidate_terms)) && (NIL != uima_interface_parameter_declaration.uia_forge_aheadP(user_interaction_agenda.ui_agenda(interaction)))) {
                    {
                        SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                        SubLObject v_term = candidate_terms.first();
                        SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, list($CHOSEN_TERM, v_term));
                        uia_disambiguate_phrase_forge_ahead_comment(v_agenda, v_term, phrase);
                        return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                    }
                }
                {
                    SubLObject all_terms = append(candidate_terms, rejected_terms);
                    SubLObject term_info_table = uiat_disambiguate_terms_info_table(interaction, all_terms, indistinguished, indexical_table);
                    return user_interaction_agenda.make_ui_request(interaction, $SHOW, list(new SubLObject[]{ $PHRASE, phrase, $CANDIDATE_TERMS, candidate_terms, $REJECTED_TERMS, rejected_terms, $TERM_INFO_TABLE, term_info_table, $SHOW_CLARIFY_LINKS, show_clarify_links, $SHOW_COMPARISON_LINKS, show_comparison_links }));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt120);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_disambiguate_phrase_negate_terms(SubLObject terms) {
        if (terms.isList()) {
            terms = Mapping.mapcar(MAKE_NEGATION, terms);
        }
        return terms;
    }

    public static final SubLObject uia_disambiguate_phrase_sort_out_rejects(SubLObject terms) {
        {
            SubLObject datum = uia_trampolines.uia_forts_and_non_forts(terms);
            SubLObject current = datum;
            SubLObject likely = NIL;
            SubLObject unlikely = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt131);
            likely = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt131);
            unlikely = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == likely) {
                    {
                        SubLObject swap_var = likely;
                        likely = unlikely;
                        unlikely = swap_var;
                    }
                }
                return list(likely, unlikely);
            } else {
                cdestructuring_bind_error(datum, $list_alt131);
            }
        }
        return NIL;
    }

    public static final SubLObject uia_disambiguate_phrase_forge_ahead_comment(SubLObject v_agenda, SubLObject v_term, SubLObject phrase) {
        {
            SubLObject generated_phrase = uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject string = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                if (NIL != Strings.string_equal(generated_phrase, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    format(stream, $str_alt132$I_know_what__S_means_, generated_phrase);
                } else {
                    format(stream, $str_alt133$I_assume_you_meant__S_when_saying, generated_phrase, phrase);
                }
                string = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            user_interaction_agenda.uia_act_new_comment(v_agenda, string);
        }
        return v_agenda;
    }

    /**
     *
     *
     * @param TERM-LIST
     * 		list;  a list of cycl-terms
     * @return list; a list of NLTagFn functional wrappers that are wrapped around the terms in term list.
    The location of the stuff inside the functional wrappers is marked with :TERM
     */
    public static final SubLObject uiat_get_nl_tags(SubLObject term_list) {
        {
            SubLObject result = NIL;
            if (term_list.isCons() && term_list.first().isCons()) {
                {
                    SubLObject cdolist_list_var = term_list;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                        {
                            SubLObject tags_for_term = uiat_nl_tags_for_term(v_term, $TERM);
                            if (NIL != tags_for_term) {
                                result = cons(tags_for_term, result);
                            }
                        }
                    }
                }
            }
            if (NIL == result) {
                return $list_alt134;
            }
            return result;
        }
    }

    public static final SubLObject uiat_nl_tags_for_term(SubLObject v_term, SubLObject proxy) {
        if (NIL == v_term) {
            return proxy;
        } else
            if (NIL != parsing_utilities.ternary_nl_tagged_termP(v_term, UNPROVIDED)) {
                return el_utilities.make_ternary_formula(cycl_utilities.formula_arg0(v_term), cycl_utilities.formula_arg1(v_term, UNPROVIDED), uiat_nl_tags_for_term(cycl_utilities.formula_arg2(v_term, UNPROVIDED), proxy), cycl_utilities.formula_arg3(v_term, UNPROVIDED));
            } else
                if (NIL != parsing_utilities.nl_tagged_termP(v_term)) {
                    return el_utilities.make_binary_formula(cycl_utilities.formula_arg0(v_term), cycl_utilities.formula_arg1(v_term, UNPROVIDED), uiat_nl_tags_for_term(cycl_utilities.formula_arg2(v_term, UNPROVIDED), proxy));
                } else {
                    return proxy;
                }


    }

    public static final SubLObject uiat_disambiguate_phrase_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($ANSWER)) {
                    {
                        SubLObject datum_20 = plist;
                        SubLObject current_21 = datum_20;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_21;
                        SubLObject bad = NIL;
                        SubLObject current_22 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_20, $list_alt135);
                            current_22 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_20, $list_alt135);
                            if (NIL == member(current_22, $list_alt136, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_22 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_20, $list_alt135);
                        }
                        {
                            SubLObject chosen_term_tail = property_list_member($CHOSEN_TERM, current_21);
                            SubLObject chosen_term = (NIL != chosen_term_tail) ? ((SubLObject) (cadr(chosen_term_tail))) : NIL;
                            if (($TRUE == user_interaction_agenda.ui_state_lookup(interaction, $NEGATE_TERMS, UNPROVIDED)) && (cycl_utilities.formula_operator(chosen_term) == $$not)) {
                                chosen_term = cycl_utilities.sentence_arg1(chosen_term, UNPROVIDED);
                            }
                            return user_interaction_agenda.uia_act_complete(v_agenda, interaction, chosen_term);
                        }
                    }
                } else
                    if (pcase_var.eql($MAKE_SIMILAR)) {
                        {
                            SubLObject datum_23 = plist;
                            SubLObject current_24 = datum_23;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_24;
                            SubLObject bad = NIL;
                            SubLObject current_25 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_23, $list_alt135);
                                current_25 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_23, $list_alt135);
                                if (NIL == member(current_25, $list_alt136, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_25 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_23, $list_alt135);
                            }
                            {
                                SubLObject chosen_term_tail = property_list_member($CHOSEN_TERM, current_24);
                                SubLObject chosen_term = (NIL != chosen_term_tail) ? ((SubLObject) (cadr(chosen_term_tail))) : NIL;
                                if (($TRUE == user_interaction_agenda.ui_state_lookup(interaction, $NEGATE_TERMS, UNPROVIDED)) && (cycl_utilities.formula_operator(chosen_term) == $$not)) {
                                    chosen_term = cycl_utilities.sentence_arg1(chosen_term, UNPROVIDED);
                                }
                                {
                                    SubLObject child = uia_act_new_sentence_cloner(v_agenda, $REQUIRED, chosen_term, $SENTENCE, UNPROVIDED);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                }
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            }
                        }
                    } else
                        if (pcase_var.eql($NEW)) {
                            {
                                SubLObject datum_26 = plist;
                                SubLObject current_27 = datum_26;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_27;
                                SubLObject bad = NIL;
                                SubLObject current_28 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_26, $list_alt141);
                                    current_28 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_26, $list_alt141);
                                    if (NIL == member(current_28, $list_alt142, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_28 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_26, $list_alt141);
                                }
                                {
                                    SubLObject phrase_tail = property_list_member($PHRASE, current_27);
                                    SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                                    SubLObject nl_tags = uiat_get_nl_tags(second(user_interaction_agenda.ui_args(interaction)));
                                    SubLObject child = uia_act_new_unknown_term(v_agenda, $REQUIRED, phrase, nl_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                }
                            }
                        } else
                            if (pcase_var.eql($COMPARE)) {
                                {
                                    SubLObject datum_29 = plist;
                                    SubLObject current_30 = datum_29;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current_30;
                                    SubLObject bad = NIL;
                                    SubLObject current_31 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum_29, $list_alt144);
                                        current_31 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum_29, $list_alt144);
                                        if (NIL == member(current_31, $list_alt145, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_31 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum_29, $list_alt144);
                                    }
                                    {
                                        SubLObject term1_tail = property_list_member($TERM1, current_30);
                                        SubLObject term1 = (NIL != term1_tail) ? ((SubLObject) (cadr(term1_tail))) : NIL;
                                        SubLObject term2_tail = property_list_member($TERM2, current_30);
                                        SubLObject term2 = (NIL != term2_tail) ? ((SubLObject) (cadr(term2_tail))) : NIL;
                                        SubLObject generation_mt = user_interaction_agenda.uia_generation_mt(v_agenda, UNPROVIDED);
                                        SubLObject domain_mt = user_interaction_agenda.uia_domain_mt(v_agenda);
                                        SubLObject phrases = uia_trampolines.uia_terms_distinguishing_phrases(v_agenda, list(term1, term2), generation_mt, domain_mt, NIL, $NONE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject phrase1 = list_utilities.cadar(phrases);
                                        SubLObject phrase2 = second(second(phrases));
                                        SubLObject child = uia_tools_browsing.uia_act_new_concept_comparator(v_agenda, $REQUIRED, phrase1, phrase2, term1, term2);
                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                    }
                                }
                            }



            }
        }
        return NIL;
    }

    public static final SubLObject uiat_disambiguate_phrase_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($CONCEPT_COMPARATOR)) {
            } else
                if (pcase_var.eql($DISAMBIGUATE_PHRASE)) {
                    {
                        SubLObject v_term = user_interaction_agenda.ui_result(child);
                        SubLObject pcase_var_32 = v_term;
                        if (pcase_var_32.eql($NONE)) {
                            {
                                SubLObject args = user_interaction_agenda.ui_args(child);
                                SubLObject datum = args;
                                SubLObject current = datum;
                                SubLObject phrase = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt120);
                                phrase = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject unknown_term_action = uia_act_new_unknown_term(v_agenda, $REQUIRED, phrase, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, parent, unknown_term_action);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt120);
                                }
                            }
                        } else {
                            user_interaction_agenda.uia_act_complete(v_agenda, parent, v_term);
                        }
                    }
                } else
                    if (pcase_var.eql($UNKNOWN_TERM) || pcase_var.eql($CONCEPT_FINDER)) {
                        {
                            SubLObject v_term = user_interaction_agenda.ui_result(child);
                            SubLObject pcase_var_33 = v_term;
                            if (pcase_var_33.eql($NONE)) {
                                user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                            } else {
                                user_interaction_agenda.ui_state_update(parent, $TYPE, $NEW);
                                user_interaction_agenda.uia_act_complete(v_agenda, parent, v_term);
                            }
                        }
                    } else
                        if (pcase_var.eql($SENTENCE_CLONER)) {
                            user_interaction_agenda.uia_act_complete(v_agenda, parent, user_interaction_agenda.ui_result(child));
                        } else {
                            user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                        }



        }
        return parent;
    }

    /**
     *
     *
     * @param indistinguished;
     * 		whether to compute and paraphrase object types
     * @param indexical-table;
     * 		information on how to override term rendering for some cases
     */
    public static final SubLObject uiat_disambiguate_terms_info_table(SubLObject interaction, SubLObject all_terms, SubLObject indistinguished, SubLObject indexical_table) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_info_table = NIL;
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject generation_mt = user_interaction_agenda.ui_generation_language_mt(interaction);
                SubLObject domain_mt = user_interaction_agenda.ui_generation_domain_mt(interaction);
                SubLObject force = (NIL != user_interaction_agenda.ui_state_lookup(interaction, $FORCE, UNPROVIDED)) ? ((SubLObject) (user_interaction_agenda.ui_state_lookup(interaction, $FORCE, UNPROVIDED))) : $NONE;
                SubLObject clarify_linksP = user_interaction_agenda.ui_state_lookup(interaction, $CLARIFY_LINKS, $TRUE);
                SubLObject picturesP = makeBoolean(indistinguished != $TRUE);
                SubLObject include_typesP = makeBoolean(indistinguished != $TRUE);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        if (!((NIL == include_typesP) || (NIL != list_utilities.find_if_not(CYCL_SENTENCE_P, all_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                            include_typesP = NIL;
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject distinguishing_phrases = NIL;
                    SubLObject distinguishing_pictures = NIL;
                    {
                        SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                        try {
                            pph_vars.$pph_term_paraphrase_map$.bind(indexical_table, thread);
                            distinguishing_phrases = uia_trampolines.uia_terms_distinguishing_phrases(v_agenda, all_terms, generation_mt, domain_mt, T, force, clarify_linksP, include_typesP, UNPROVIDED);
                        } finally {
                            pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != picturesP) {
                        distinguishing_pictures = uia_trampolines.uia_terms_distinguishing_pictures(v_agenda, all_terms, domain_mt);
                    }
                    {
                        SubLObject cdolist_list_var = distinguishing_phrases;
                        SubLObject term_info = NIL;
                        for (term_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term_info = cdolist_list_var.first()) {
                            {
                                SubLObject datum = term_info;
                                SubLObject current = datum;
                                SubLObject v_term = NIL;
                                SubLObject phrase = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt154);
                                v_term = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt154);
                                phrase = current.first();
                                current = current.rest();
                                {
                                    SubLObject type = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                    destructuring_bind_must_listp(current, datum, $list_alt154);
                                    current = current.rest();
                                    {
                                        SubLObject type_phrase = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                        destructuring_bind_must_listp(current, datum, $list_alt154);
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject distinguishing_picture = NIL;
                                                if (NIL != picturesP) {
                                                    distinguishing_picture = second(assoc(v_term, distinguishing_pictures, UNPROVIDED, UNPROVIDED));
                                                }
                                                if ((NIL != uiat_disambig_concept_nthfn_termP(indexical_table, parsing_utilities.strip_nl_tags(v_term, UNPROVIDED))) && type_phrase.isString()) {
                                                    type_phrase = $str_alt155$the_term_you_were_just_talking_ab;
                                                }
                                                term_info_table = cons(list(v_term, phrase, type, type_phrase, distinguishing_picture), term_info_table);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt154);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return term_info_table;
            }
        }
    }

    public static final SubLObject uiat_disambig_concept_nthfn_termP(SubLObject indexical_table, SubLObject v_term) {
        {
            SubLObject formula = cycl_utilities.hl_term_to_el_term(v_term);
            return makeBoolean((NIL != indexical_table) && (cycl_utilities.formula_arg0(formula) == $$TheNthFn));
        }
    }

    /**
     *
     *
     * @param CONSTRAINT-FUNC;
     * 		a binary function (taking an interaction and a term)                           to filter the candidate terms.
     */
    public static final SubLObject uia_act_new_concept_disambiguator(SubLObject v_agenda, SubLObject mode, SubLObject phrase, SubLObject my_result_will_be, SubLObject constraint_func, SubLObject parse_template, SubLObject isas, SubLObject v_genls) {
        if (my_result_will_be == UNPROVIDED) {
            my_result_will_be = NIL;
        }
        if (constraint_func == UNPROVIDED) {
            constraint_func = NIL;
        }
        if (parse_template == UNPROVIDED) {
            parse_template = NIL;
        }
        if (isas == UNPROVIDED) {
            isas = NIL;
        }
        if (v_genls == UNPROVIDED) {
            v_genls = NIL;
        }
        {
            SubLObject plist = NIL;
            if (NIL != my_result_will_be) {
                plist = putf(plist, $MY_RESULT_WILL_BE, my_result_will_be);
            }
            if (NIL != constraint_func) {
                plist = putf(plist, $CONSTRAINT_FUNC, constraint_func);
            }
            if (NIL != parse_template) {
                plist = putf(plist, $PARSE_TEMPLATE, parse_template);
            }
            if (NIL != isas) {
                plist = putf(plist, $ISAS, isas);
            }
            if (NIL != v_genls) {
                plist = putf(plist, $GENLS, v_genls);
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $CONCEPT_DISAMBIGUATOR, list(phrase), plist);
        }
    }

    public static final SubLObject uiat_concept_disambiguator_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt120);
            phrase = current.first();
            current = current.rest();
            if (NIL == current) {
                return list($str_alt163$Select_meaning_for_concept__, $TERM, phrase);
            } else {
                cdestructuring_bind_error(datum, $list_alt120);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_disambiguator_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt120);
            phrase = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject candidate_terms = user_interaction_agenda.ui_state_lookup(interaction, $CANDIDATE_TERMS, $UNDETERMINED);
                    SubLObject parse_template = user_interaction_agenda.ui_state_lookup(interaction, $PARSE_TEMPLATE, NIL);
                    if ($UNDETERMINED == candidate_terms) {
                        if (NIL == concept_finder_trigger_stringP(phrase)) {
                            {
                                SubLObject message = format(NIL, $str_alt165$Reading__S, phrase);
                                SubLObject parsing_mt = user_interaction_agenda.uia_parsing_interaction_mt(v_agenda);
                                SubLObject domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                                uia_mumbler.uia_mumble(v_agenda, message);
                                uia_act_new_thinking_child(interaction, UIA_PHRASE_CANDIDATE_TERMS, list(v_agenda, phrase, parsing_mt, domain_mt, parse_template), message, $CANDIDATE_TERMS);
                            }
                        } else
                            if (NIL != uiat_sentence_finder_templateP(v_agenda, parse_template)) {
                                {
                                    SubLObject child = uia_act_new_sentence_finder(v_agenda, $REQUIRED, UNPROVIDED, UNPROVIDED);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                }
                            } else {
                                {
                                    SubLObject child = uia_act_new_concept_finder(v_agenda, $REQUIRED, NIL, parse_template);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                }
                            }

                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    }
                    {
                        SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, $UNDETERMINED);
                        if ($UNDETERMINED != v_term) {
                            user_interaction_agenda.uia_act_complete(v_agenda, interaction, v_term);
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                    }
                    user_interaction_agenda.uia_act_invalidate(v_agenda, interaction);
                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt120);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_disambiguator_spawn_unknown_term(SubLObject interaction, SubLObject phrase) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject nl_tags = NIL;
            SubLObject v_context = NIL;
            SubLObject suppressors = NIL;
            SubLObject isas = user_interaction_agenda.ui_state_lookup(interaction, $ISAS, UNPROVIDED);
            SubLObject v_genls = user_interaction_agenda.ui_state_lookup(interaction, $GENLS, UNPROVIDED);
            SubLObject unknown_term_action = uia_act_new_unknown_term(v_agenda, $REQUIRED, phrase, nl_tags, v_context, suppressors, isas, v_genls);
            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, unknown_term_action);
        }
        return interaction;
    }

    public static final SubLObject uiat_concept_disambiguator_constrain_candidate_terms(SubLObject interaction, SubLObject candidate_terms) {
        {
            SubLObject constraint_func = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_FUNC, $NONE);
            if (constraint_func != $NONE) {
                {
                    SubLObject permissables = NIL;
                    SubLObject cdolist_list_var = candidate_terms;
                    SubLObject candidate_term = NIL;
                    for (candidate_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_term = cdolist_list_var.first()) {
                        if (NIL != uiat_concept_disambiguator_constrain_one_term(interaction, candidate_term)) {
                            permissables = cons(candidate_term, permissables);
                        }
                    }
                    return permissables;
                }
            }
            return candidate_terms;
        }
    }

    public static final SubLObject uiat_concept_disambiguator_constrain_one_term(SubLObject interaction, SubLObject candidate_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject constraint_func = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_FUNC, $NONE);
                if (constraint_func != $NONE) {
                    thread.resetMultipleValues();
                    {
                        SubLObject permissableP = funcall(constraint_func, interaction, candidate_term);
                        SubLObject mumble_string = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == permissableP) {
                            if (NIL != mumble_string) {
                                user_interaction_agenda.uia_act_new_comment(v_agenda, mumble_string);
                            } else {
                                user_interaction_agenda.uia_act_new_comment(v_agenda, cconcatenate($str_alt167$The_intepretation__, new SubLObject[]{ uia_trampolines.uia_term_phrase(v_agenda, candidate_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str_alt168$__can_be_safely_eliminated_ }));
                            }
                            return NIL;
                        }
                    }
                }
                return candidate_term;
            }
        }
    }

    public static final SubLObject uiat_concept_disambiguator_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($DISAMBIGUATE_PHRASE)) {
                {
                    SubLObject v_term = user_interaction_agenda.ui_result(child);
                    SubLObject pcase_var_34 = v_term;
                    if (pcase_var_34.eql($NONE)) {
                        {
                            SubLObject args = user_interaction_agenda.ui_args(child);
                            SubLObject datum = args;
                            SubLObject current = datum;
                            SubLObject phrase = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt169);
                            phrase = current.first();
                            current = current.rest();
                            {
                                SubLObject candidate_terms = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt169);
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject unknown_term_action = uia_act_new_unknown_term(v_agenda, $REQUIRED, phrase, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, parent, unknown_term_action);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt169);
                                }
                            }
                        }
                    } else {
                        user_interaction_agenda.uia_act_complete(v_agenda, parent, v_term);
                    }
                }
            } else
                if ((pcase_var.eql($UNKNOWN_TERM) || pcase_var.eql($CONCEPT_FINDER)) || pcase_var.eql($SENTENCE_FINDER)) {
                    {
                        SubLObject v_term = user_interaction_agenda.ui_result(child);
                        if (((NIL == v_term) || (v_term == $NONE)) || (NIL == uiat_concept_disambiguator_constrain_one_term(parent, v_term))) {
                            user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                        } else {
                            user_interaction_agenda.uia_act_complete(v_agenda, parent, v_term);
                        }
                    }
                } else
                    if (pcase_var.eql($THINKING)) {
                        {
                            SubLObject phrase = user_interaction_agenda.ui_args(parent).first();
                            SubLObject candidate_terms = user_interaction_agenda.ui_result(child);
                            candidate_terms = uia_trampolines.uia_sort_terms(v_agenda, candidate_terms, UNPROVIDED, UNPROVIDED);
                            candidate_terms = uiat_concept_disambiguator_constrain_candidate_terms(parent, candidate_terms);
                            if (NIL == candidate_terms) {
                                uiat_concept_disambiguator_spawn_unknown_term(parent, phrase);
                            } else {
                                {
                                    SubLObject clarify_links = user_interaction_agenda.ui_state_lookup(parent, $CLARIFY_LINKS, $TRUE);
                                    SubLObject disambiguate_action = uia_act_new_disambiguate_phrase(v_agenda, $REQUIRED, phrase, candidate_terms, clarify_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, parent, disambiguate_action);
                                }
                            }
                        }
                    } else {
                        user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                    }


        }
        return parent;
    }

    /**
     * Possible values are :cartesian-product and :sentence-reader
     */
    // deflexical
    private static final SubLSymbol $concept_in_sentence_disambiguator_method$ = makeSymbol("*CONCEPT-IN-SENTENCE-DISAMBIGUATOR-METHOD*");

    public static final SubLObject uia_act_new_concept_in_sentence_disambiguator(SubLObject v_agenda, SubLObject mode, SubLObject phrases, SubLObject arg_positions_es, SubLObject sentence, SubLObject my_result_will_be, SubLObject negated, SubLObject isas_es, SubLObject genls_es) {
        if (my_result_will_be == UNPROVIDED) {
            my_result_will_be = NIL;
        }
        if (negated == UNPROVIDED) {
            negated = NIL;
        }
        if (isas_es == UNPROVIDED) {
            isas_es = NIL;
        }
        if (genls_es == UNPROVIDED) {
            genls_es = NIL;
        }
        {
            SubLObject plist = NIL;
            if (NIL != my_result_will_be) {
                plist = putf(plist, $MY_RESULT_WILL_BE, my_result_will_be);
            }
            if (NIL != negated) {
                plist = putf(plist, $NEGATED, negated);
            }
            if (NIL != isas_es) {
                plist = putf(plist, $ISAS_ES, isas_es);
            }
            if (NIL != genls_es) {
                plist = putf(plist, $GENLS_ES, genls_es);
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $CONCEPT_IN_SENTENCE_DISAMBIGUATOR, list(phrases, arg_positions_es, sentence), plist);
        }
    }

    public static final SubLObject uiat_concept_in_sentence_disambiguator_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrases = NIL;
            SubLObject arg_positions_es = NIL;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt177);
            phrases = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt177);
            arg_positions_es = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt177);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject tweaked_sentence = replace_arg_positions_es_with_phrases_in_sentence(sentence, arg_positions_es, phrases);
                    SubLObject sentence_force = user_interaction_agenda.ui_state_lookup(interaction, $SENTENCE_FORCE, $NONE);
                    SubLObject sentence_phrase = ($QUESTION == sentence_force) ? ((SubLObject) (uia_trampolines.uia_query_phrase(v_agenda, tweaked_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : uia_trampolines.uia_sentence_phrase(v_agenda, tweaked_sentence, UNPROVIDED, UNPROVIDED);
                    return list($str_alt163$Select_meaning_for_concept__, $TERM, sentence_phrase);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt177);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_in_sentence_disambiguator_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrases = NIL;
            SubLObject arg_positions_es = NIL;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt177);
            phrases = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt177);
            arg_positions_es = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt177);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pending_concept_finders = user_interaction_agenda.ui_state_lookup(interaction, $CONCEPT_FINDERS, $UNDETERMINED);
                    SubLObject pending_sentences_to_parse = user_interaction_agenda.ui_state_lookup(interaction, $SENTENCES_TO_PARSE, $UNDETERMINED);
                    SubLObject modified_sentence = user_interaction_agenda.ui_state_lookup(interaction, $MODIFIED_SENTENCE, sentence);
                    SubLObject candidate_sentences = user_interaction_agenda.ui_state_lookup(interaction, $CANDIDATE_SENTENCES, $UNDETERMINED);
                    SubLObject phrases_to_parse = user_interaction_agenda.ui_state_lookup(interaction, $PHRASES_TO_PARSE, $UNDETERMINED);
                    SubLObject good_arg_positions_es = user_interaction_agenda.ui_state_lookup(interaction, $GOOD_ARG_POSITIONS_ES, $UNDETERMINED);
                    SubLObject isas_es = user_interaction_agenda.ui_state_lookup(interaction, $ISAS_ES, NIL);
                    user_interaction_agenda.ui_state_update(interaction, $MODIFIED_SENTENCE, modified_sentence);
                    if ($UNDETERMINED == pending_concept_finders) {
                        {
                            SubLObject concept_finders = NIL;
                            SubLObject sentences_to_parse = NIL;
                            SubLObject phrases_to_parse_35 = NIL;
                            SubLObject good_arg_positions_es_36 = NIL;
                            SubLObject phrase = NIL;
                            SubLObject phrase_37 = NIL;
                            SubLObject arg_positions = NIL;
                            SubLObject arg_positions_38 = NIL;
                            SubLObject stipulated_isas = NIL;
                            SubLObject stipulated_isas_39 = NIL;
                            for (phrase = phrases, phrase_37 = phrase.first(), arg_positions = arg_positions_es, arg_positions_38 = arg_positions.first(), stipulated_isas = isas_es, stipulated_isas_39 = stipulated_isas.first(); !(((NIL == stipulated_isas) && (NIL == arg_positions)) && (NIL == phrase)); phrase = phrase.rest() , phrase_37 = phrase.first() , arg_positions = arg_positions.rest() , arg_positions_38 = arg_positions.first() , stipulated_isas = stipulated_isas.rest() , stipulated_isas_39 = stipulated_isas.first()) {
                                if (NIL != concept_finder_trigger_stringP(phrase_37)) {
                                    concept_finders = cons(arg_positions_38, concept_finders);
                                    {
                                        SubLObject child = uia_act_new_concept_finder(v_agenda, $REQUIRED, arg_positions_38, UNPROVIDED);
                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                    }
                                } else
                                    if (NIL != member($$CycLSentence_Assertible, stipulated_isas_39, $sym84$SPEC_, UNPROVIDED)) {
                                        sentences_to_parse = cons(arg_positions_38, sentences_to_parse);
                                        {
                                            SubLObject child = cb_uiat_smart.uia_act_new_sentence_reader(v_agenda, $REQUIRED, phrase_37, arg_positions_38, UNPROVIDED);
                                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                        }
                                    } else {
                                        phrases_to_parse_35 = cons(phrase_37, phrases_to_parse_35);
                                        good_arg_positions_es_36 = cons(arg_positions_38, good_arg_positions_es_36);
                                    }

                            }
                            user_interaction_agenda.ui_state_update(interaction, $CONCEPT_FINDERS, concept_finders);
                            user_interaction_agenda.ui_state_update(interaction, $SENTENCES_TO_PARSE, sentences_to_parse);
                            user_interaction_agenda.ui_state_update(interaction, $PHRASES_TO_PARSE, phrases_to_parse_35);
                            user_interaction_agenda.ui_state_update(interaction, $GOOD_ARG_POSITIONS_ES, good_arg_positions_es_36);
                        }
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    } else
                        if (((NIL == pending_concept_finders) && (NIL == pending_sentences_to_parse)) && ($UNDETERMINED == candidate_sentences)) {
                            if (NIL == phrases_to_parse) {
                                user_interaction_agenda.uia_act_complete(v_agenda, interaction, modified_sentence);
                            } else {
                                uiat_cis_disambiguator_report_preds(interaction, good_arg_positions_es, phrases_to_parse, modified_sentence);
                                {
                                    SubLObject pcase_var = $concept_in_sentence_disambiguator_method$.getGlobalValue();
                                    if (pcase_var.eql($CARTESIAN_PRODUCT)) {
                                        if (NIL != uiat_cis_disambiguator_all_arg_positions_parsed_p(interaction)) {
                                            uiat_cis_disambiguator_do_cartesian_product(interaction, modified_sentence);
                                        } else {
                                            uiat_cis_disambiguator_parse_phrases(interaction, phrases_to_parse, good_arg_positions_es, modified_sentence);
                                        }
                                    } else
                                        if (pcase_var.eql($SENTENCE_READER)) {
                                            uiat_cis_disambiguator_invoke_sentence_reader(interaction, phrases_to_parse, good_arg_positions_es, modified_sentence);
                                        }

                                }
                            }
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        } else {
                            user_interaction_agenda.uia_act_invalidate(v_agenda, interaction);
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }

                }
            } else {
                cdestructuring_bind_error(datum, $list_alt177);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_in_sentence_disambiguator_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($DISAMBIGUATE_PHRASE)) {
                {
                    SubLObject sentence = user_interaction_agenda.ui_result(child);
                    SubLObject pcase_var_40 = sentence;
                    if (pcase_var_40.eql($NONE)) {
                        user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                    } else {
                        user_interaction_agenda.uia_act_complete(v_agenda, parent, sentence);
                    }
                }
            } else
                if (pcase_var.eql($CONCEPT_FINDER)) {
                    {
                        SubLObject v_term = user_interaction_agenda.ui_result(child);
                        SubLObject arg_positions = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
                        SubLObject concept_finders = user_interaction_agenda.ui_state_lookup(parent, $CONCEPT_FINDERS, UNPROVIDED);
                        SubLObject concept_finders_minus_these_ones = set_difference(concept_finders, arg_positions, symbol_function(EQUAL), UNPROVIDED);
                        SubLObject old_sentence = user_interaction_agenda.ui_state_lookup(parent, $MODIFIED_SENTENCE, UNPROVIDED);
                        SubLObject new_sentence = el_utilities.copy_expression(old_sentence);
                        SubLObject cdolist_list_var = arg_positions;
                        SubLObject arg_position = NIL;
                        for (arg_position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_position = cdolist_list_var.first()) {
                            new_sentence = el_utilities.nreplace_formula_arg_position(arg_position, v_term, new_sentence);
                        }
                        user_interaction_agenda.ui_state_update(parent, $CONCEPT_FINDERS, concept_finders_minus_these_ones);
                        user_interaction_agenda.ui_state_update(parent, $MODIFIED_SENTENCE, new_sentence);
                    }
                } else
                    if (pcase_var.eql($SENTENCE_READER)) {
                        {
                            SubLObject my_result_will_be = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
                            SubLObject sentences = user_interaction_agenda.ui_result(child);
                            SubLObject sentence = sentences.first();
                            if ($WHOLE_SENTENCE == my_result_will_be) {
                                user_interaction_agenda.uia_act_complete(v_agenda, parent, sentence);
                            } else {
                                {
                                    SubLObject arg_positions = my_result_will_be;
                                    SubLObject sentences_to_parse = user_interaction_agenda.ui_state_lookup(parent, $SENTENCES_TO_PARSE, NIL);
                                    SubLObject remaining_sentences = set_difference(sentences_to_parse, arg_positions, symbol_function(EQUAL), UNPROVIDED);
                                    SubLObject old_sentence = user_interaction_agenda.ui_state_lookup(parent, $MODIFIED_SENTENCE, UNPROVIDED);
                                    SubLObject new_sentence = el_utilities.copy_expression(old_sentence);
                                    SubLObject cdolist_list_var = arg_positions;
                                    SubLObject arg_position = NIL;
                                    for (arg_position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_position = cdolist_list_var.first()) {
                                        new_sentence = el_utilities.nreplace_formula_arg_position(arg_position, sentence, new_sentence);
                                    }
                                    user_interaction_agenda.ui_state_update(parent, $SENTENCES_TO_PARSE, remaining_sentences);
                                    user_interaction_agenda.ui_state_update(parent, $MODIFIED_SENTENCE, new_sentence);
                                }
                            }
                        }
                    } else
                        if (pcase_var.eql($UNKNOWN_TERM)) {
                            {
                                SubLObject arg_positions = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
                                SubLObject v_term = user_interaction_agenda.ui_result(child);
                                if ($NONE == v_term) {
                                    user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                                } else {
                                    uiat_cis_disambiguator_record_phrase_parses(parent, arg_positions, list(v_term));
                                }
                            }
                        } else {
                            user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                        }



        }
        return parent;
    }

    public static final SubLObject uiat_cis_disambiguator_report_preds(SubLObject interaction, SubLObject arg_positions_es, SubLObject phrases_to_parse, SubLObject modified_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                {
                                    SubLObject arg_positions = NIL;
                                    SubLObject arg_positions_41 = NIL;
                                    SubLObject phrase_to_parse = NIL;
                                    SubLObject phrase_to_parse_42 = NIL;
                                    for (arg_positions = arg_positions_es, arg_positions_41 = arg_positions.first(), phrase_to_parse = phrases_to_parse, phrase_to_parse_42 = phrase_to_parse.first(); !((NIL == phrase_to_parse) && (NIL == arg_positions)); arg_positions = arg_positions.rest() , arg_positions_41 = arg_positions.first() , phrase_to_parse = phrase_to_parse.rest() , phrase_to_parse_42 = phrase_to_parse.first()) {
                                        {
                                            SubLObject arg_position = arg_positions_41.first();
                                            SubLObject v_term = cycl_utilities.formula_arg_position(modified_sentence, arg_position, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_43 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                    if (NIL != fort_types_interface.predicate_p(v_term)) {
                                                        uia_problem_reporting.uia_problem_reporting_email_form_mailer($str_alt190$Replaced_a_pred_in_sentence_clone, format(NIL, $str_alt191$While_in_the_sentence_cloner__I_d, new SubLObject[]{ v_term, phrase_to_parse_42, modified_sentence }), interaction);
                                                    }
                                                } finally {
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_43, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
            }
            return interaction;
        }
    }

    /**
     * Try to resolve INTERACTION by looking up all the parses for the phrases that needed parsing,
     * exploding them out into candidate sentences by plugging them all into TEMPLATE-SENTENCE,
     * reformulating, and (if necessary) disambiguating.
     */
    public static final SubLObject uiat_cis_disambiguator_do_cartesian_product(SubLObject interaction, SubLObject template_sentence) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject pre_candidate_sentences = uiat_cis_disambiguator_get_pre_candidate_sentences(interaction, template_sentence);
            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            SubLObject candidate_sentences = NIL;
            SubLObject cdolist_list_var = pre_candidate_sentences;
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                {
                    SubLObject reformed = reformulator_utilities.reformulate_cycl_wff_options(sentence, mt, UNPROVIDED);
                    if (NIL != cycl_grammar.cycl_sentence_p(reformed)) {
                        reformed = list(reformed);
                    }
                    {
                        SubLObject cdolist_list_var_44 = reformed;
                        SubLObject new_sent = NIL;
                        for (new_sent = cdolist_list_var_44.first(); NIL != cdolist_list_var_44; cdolist_list_var_44 = cdolist_list_var_44.rest() , new_sent = cdolist_list_var_44.first()) {
                            {
                                SubLObject item_var = reformulator_hub.reformulate_cycl(new_sent, mt, UNPROVIDED);
                                if (NIL == member(item_var, candidate_sentences, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    candidate_sentences = cons(item_var, candidate_sentences);
                                }
                            }
                        }
                    }
                }
            }
            candidate_sentences = uia_trampolines.uia_sort_terms(v_agenda, candidate_sentences, UNPROVIDED, UNPROVIDED);
            user_interaction_agenda.ui_state_update(interaction, $CANDIDATE_SENTENCES, candidate_sentences);
            if (NIL == candidate_sentences) {
                {
                    SubLObject phrases = user_interaction_agenda.ui_args(interaction).first();
                    SubLObject message = format(NIL, $str_alt192$Sorry__I_couldn_t_make_sense_of_s, phrases, uia_trampolines.uia_sentence_phrase(v_agenda, template_sentence, UNPROVIDED, UNPROVIDED));
                    user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                    user_interaction_agenda.uia_act_invalidate(v_agenda, interaction);
                }
            } else
                if (NIL != list_utilities.singletonP(candidate_sentences)) {
                    {
                        SubLObject result_sentence = candidate_sentences.first();
                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, result_sentence);
                    }
                } else {
                    {
                        SubLObject arg_positions_es = user_interaction_agenda.ui_state_lookup(interaction, $GOOD_ARG_POSITIONS_ES, NIL);
                        SubLObject phrases_to_parse = user_interaction_agenda.ui_state_lookup(interaction, $PHRASES_TO_PARSE, UNPROVIDED);
                        SubLObject tweaked_sentence = replace_arg_positions_es_with_phrases_in_sentence(template_sentence, arg_positions_es, phrases_to_parse);
                        SubLObject sentence_force = user_interaction_agenda.ui_state_lookup(interaction, $SENTENCE_FORCE, $NONE);
                        SubLObject sentence_phrase = (sentence_force == $QUESTION) ? ((SubLObject) (uia_trampolines.uia_query_phrase(v_agenda, tweaked_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : uia_trampolines.uia_sentence_phrase(v_agenda, tweaked_sentence, UNPROVIDED, UNPROVIDED);
                        SubLObject negate_terms = user_interaction_agenda.ui_state_lookup(interaction, $NEGATED, UNPROVIDED);
                        SubLObject clarify_links = user_interaction_agenda.ui_state_lookup(interaction, $CLARIFY_LINKS, $TRUE);
                        SubLObject disambiguate_action = uia_act_new_disambiguate_phrase_wXplist(v_agenda, $REQUIRED, sentence_phrase, list(new SubLObject[]{ $CLARIFY_LINKS, clarify_links, $INDISTINGUISHED, $TRUE, $NEGATE_TERMS, negate_terms, $FORCE, sentence_force, $CANDIDATE_TERMS, candidate_sentences }));
                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, disambiguate_action);
                    }
                }

        }
        return interaction;
    }

    /**
     *
     *
     * @return LISTP of CycL Sentences.
     */
    public static final SubLObject uiat_cis_disambiguator_get_pre_candidate_sentences(SubLObject interaction, SubLObject template_sentence) {
        {
            SubLObject parse_dictionary = user_interaction_agenda.ui_state_lookup(interaction, $PARSE_DICTIONARY, $ERROR);
            SubLObject parsing_mt = user_interaction_agenda.ui_parsing_interaction_mt(interaction);
            SubLObject arg_positions = dictionary.dictionary_keys(parse_dictionary);
            SubLObject options = NIL;
            SubLObject candidate_sentences = NIL;
            {
                SubLObject cdolist_list_var = arg_positions;
                SubLObject arg_position = NIL;
                for (arg_position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_position = cdolist_list_var.first()) {
                    options = cons(list_utilities.num_list(length(dictionary.dictionary_lookup(parse_dictionary, arg_position, NIL)), UNPROVIDED), options);
                }
            }
            options = nreverse(options);
            {
                SubLObject permutations = list_utilities.cartesian_product(options, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = permutations;
                SubLObject permutation = NIL;
                for (permutation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , permutation = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_45 = uiat_cis_disambiguator_pre_candidate_sentences_int(template_sentence, permutation, arg_positions, parse_dictionary, parsing_mt);
                        SubLObject candidate_sentence = NIL;
                        for (candidate_sentence = cdolist_list_var_45.first(); NIL != cdolist_list_var_45; cdolist_list_var_45 = cdolist_list_var_45.rest() , candidate_sentence = cdolist_list_var_45.first()) {
                            {
                                SubLObject item_var = candidate_sentence;
                                if (NIL == member(item_var, candidate_sentences, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    candidate_sentences = cons(item_var, candidate_sentences);
                                }
                            }
                        }
                    }
                }
            }
            return candidate_sentences;
        }
    }

    public static final SubLObject uiat_cis_disambiguator_pre_candidate_sentences_int(SubLObject template_sentence, SubLObject permutation, SubLObject arg_positions_es, SubLObject parse_dictionary, SubLObject parsing_mt) {
        {
            SubLObject new_sentence = el_utilities.copy_formula(template_sentence);
            SubLObject candidate_sentences = NIL;
            SubLObject index = NIL;
            SubLObject index_46 = NIL;
            SubLObject arg_positions = NIL;
            SubLObject arg_positions_47 = NIL;
            for (index = permutation, index_46 = index.first(), arg_positions = arg_positions_es, arg_positions_47 = arg_positions.first(); !((NIL == arg_positions) && (NIL == index)); index = index.rest() , index_46 = index.first() , arg_positions = arg_positions.rest() , arg_positions_47 = arg_positions.first()) {
                {
                    SubLObject candidate_terms = dictionary.dictionary_lookup(parse_dictionary, arg_positions_47, NIL);
                    SubLObject candidate_term = nth(index_46, candidate_terms);
                    SubLObject cdolist_list_var = arg_positions_47;
                    SubLObject arg_position = NIL;
                    for (arg_position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_position = cdolist_list_var.first()) {
                        new_sentence = el_utilities.nreplace_formula_arg_position(arg_position, candidate_term, new_sentence);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = rkf_formula_optimizer.rkf_reformulate_into_many(new_sentence, parsing_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject reformulated = NIL;
                for (reformulated = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reformulated = cdolist_list_var.first()) {
                    {
                        SubLObject item_var = reformulated;
                        if (NIL == member(item_var, candidate_sentences, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            candidate_sentences = cons(item_var, candidate_sentences);
                        }
                    }
                }
            }
            return candidate_sentences;
        }
    }

    public static final SubLObject uiat_cis_disambiguator_parse_phrases(SubLObject interaction, SubLObject phrases_to_parse, SubLObject arg_positions_es, SubLObject template_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isas_es = user_interaction_agenda.ui_state_lookup(interaction, $ISAS_ES, UNPROVIDED);
                SubLObject genls_es = user_interaction_agenda.ui_state_lookup(interaction, $GENLS_ES, UNPROVIDED);
                SubLObject phrase = NIL;
                SubLObject phrase_48 = NIL;
                SubLObject arg_positions = NIL;
                SubLObject arg_positions_49 = NIL;
                SubLObject stipulated_isas = NIL;
                SubLObject stipulated_isas_50 = NIL;
                SubLObject stipulated_genls = NIL;
                SubLObject stipulated_genls_51 = NIL;
                for (phrase = phrases_to_parse, phrase_48 = phrase.first(), arg_positions = arg_positions_es, arg_positions_49 = arg_positions.first(), stipulated_isas = isas_es, stipulated_isas_50 = stipulated_isas.first(), stipulated_genls = genls_es, stipulated_genls_51 = stipulated_genls.first(); !((((NIL == stipulated_genls) && (NIL == stipulated_isas)) && (NIL == arg_positions)) && (NIL == phrase)); phrase = phrase.rest() , phrase_48 = phrase.first() , arg_positions = arg_positions.rest() , arg_positions_49 = arg_positions.first() , stipulated_isas = stipulated_isas.rest() , stipulated_isas_50 = stipulated_isas.first() , stipulated_genls = stipulated_genls.rest() , stipulated_genls_51 = stipulated_genls.first()) {
                    {
                        SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                        SubLObject candidate_terms = NIL;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                if (NIL != member($$CharacterString, stipulated_isas_50, $sym84$SPEC_, UNPROVIDED)) {
                                    candidate_terms = list(string_utilities.trim_sides(phrase_48, CHAR_quotation));
                                } else {
                                    candidate_terms = uia_trampolines.uia_phrase_candidate_terms_in_sentence(v_agenda, phrase_48, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL == candidate_terms) {
                            thread.resetMultipleValues();
                            {
                                SubLObject isas = uiat_cis_arg_position_constraints(interaction, arg_positions_49, template_sentence, stipulated_isas_50, stipulated_genls_51);
                                SubLObject v_genls = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject unknown_term_act = uia_act_new_unknown_term(v_agenda, $REQUIRED, phrase_48, NIL, NIL, NIL, isas, v_genls);
                                    user_interaction_agenda.ui_state_update(unknown_term_act, $MY_RESULT_WILL_BE, arg_positions_49);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, unknown_term_act);
                                }
                            }
                        } else {
                            uiat_cis_disambiguator_record_phrase_parses(interaction, arg_positions_49, candidate_terms);
                        }
                    }
                }
            }
            return interaction;
        }
    }

    public static final SubLObject uiat_cis_arg_position_constraints(SubLObject interaction, SubLObject arg_positions, SubLObject template_sentence, SubLObject stipulated_isas, SubLObject stipulated_genls) {
        {
            SubLObject domain_mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
            SubLObject isas = stipulated_isas;
            SubLObject v_genls = stipulated_genls;
            SubLObject cdolist_list_var = arg_positions;
            SubLObject arg_position = NIL;
            for (arg_position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_position = cdolist_list_var.first()) {
                {
                    SubLObject datum = arg_position;
                    SubLObject current = datum;
                    SubLObject path = NIL;
                    SubLObject argnum = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt196);
                    path = current.first();
                    current = current.rest();
                    argnum = current;
                    if (NIL != subl_promotions.positive_integer_p(argnum)) {
                        {
                            SubLObject pred_arg_position = append(path, $list_alt197);
                            SubLObject pred = cycl_utilities.formula_arg_position(template_sentence, pred_arg_position, UNPROVIDED);
                            if (NIL == isas) {
                                isas = kb_accessors.argn_isa(pred, argnum, domain_mt);
                            }
                            if (NIL == v_genls) {
                                v_genls = kb_accessors.argn_genl(pred, argnum, domain_mt);
                            }
                        }
                    }
                }
            }
            return values(isas, v_genls);
        }
    }

    public static final SubLObject uiat_cis_disambiguator_record_phrase_parses(SubLObject interaction, SubLObject arg_positions, SubLObject parses) {
        {
            SubLObject parse_dictionary = user_interaction_agenda.ui_state_lookup(interaction, $PARSE_DICTIONARY, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
            dictionary.dictionary_enter(parse_dictionary, arg_positions, parses);
            user_interaction_agenda.ui_state_update(interaction, $PARSE_DICTIONARY, parse_dictionary);
        }
        return interaction;
    }

    public static final SubLObject uiat_cis_disambiguator_all_arg_positions_parsed_p(SubLObject interaction) {
        {
            SubLObject arg_positions_es = user_interaction_agenda.ui_state_lookup(interaction, $GOOD_ARG_POSITIONS_ES, NIL);
            SubLObject parse_dictionary = user_interaction_agenda.ui_state_lookup(interaction, $PARSE_DICTIONARY, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
            SubLObject not_doneP = NIL;
            if (NIL == not_doneP) {
                {
                    SubLObject csome_list_var = arg_positions_es;
                    SubLObject arg_positions = NIL;
                    for (arg_positions = csome_list_var.first(); !((NIL != not_doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg_positions = csome_list_var.first()) {
                        if (NIL == dictionary.dictionary_lookup(parse_dictionary, arg_positions, NIL)) {
                            not_doneP = T;
                        }
                    }
                }
            }
            return makeBoolean(NIL == not_doneP);
        }
    }

    public static final SubLObject uiat_cis_disambiguator_invoke_sentence_reader(SubLObject interaction, SubLObject phrases_to_parse, SubLObject good_arg_positions_es, SubLObject modified_sentence) {
        {
            SubLObject tweaked_sentence = replace_arg_positions_es_with_phrases_in_sentence(modified_sentence, good_arg_positions_es, phrases_to_parse);
            SubLObject sentence_force = user_interaction_agenda.ui_state_lookup(interaction, $SENTENCE_FORCE, $NONE);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject sentence_phrase = (sentence_force == $QUESTION) ? ((SubLObject) (uia_trampolines.uia_query_phrase(v_agenda, tweaked_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : uia_trampolines.uia_sentence_phrase(v_agenda, tweaked_sentence, UNPROVIDED, UNPROVIDED);
            SubLObject total_num_words = string_utilities.number_of_words(sentence_phrase);
            SubLObject v_parse_tree = NIL;
            SubLObject accum = ZERO_INTEGER;
            SubLObject phrase = NIL;
            SubLObject phrase_52 = NIL;
            SubLObject arg_positions = NIL;
            SubLObject arg_positions_53 = NIL;
            for (phrase = phrases_to_parse, phrase_52 = phrase.first(), arg_positions = good_arg_positions_es, arg_positions_53 = arg_positions.first(); !((NIL == arg_positions) && (NIL == phrase)); phrase = phrase.rest() , phrase_52 = phrase.first() , arg_positions = arg_positions.rest() , arg_positions_53 = arg_positions.first()) {
                {
                    SubLObject num_words = string_utilities.number_of_words(phrase_52);
                    SubLObject span = list_utilities.new_num_list(num_words, accum);
                    SubLObject candidate_terms = uia_trampolines.uia_phrase_candidate_terms_in_sentence(v_agenda, phrase_52, UNPROVIDED, UNPROVIDED);
                    SubLObject parse_tree_leaf = list(span, candidate_terms);
                    accum = add(accum, num_words);
                    v_parse_tree = cons(parse_tree_leaf, v_parse_tree);
                }
            }
            v_parse_tree = nreverse(v_parse_tree);
            {
                SubLObject big_span = list_utilities.new_num_list(total_num_words, UNPROVIDED);
                SubLObject big_parse_tree_leaf = list(big_span, list(tweaked_sentence));
                v_parse_tree = cons(big_parse_tree_leaf, v_parse_tree);
            }
            {
                SubLObject child = cb_uiat_smart.uia_act_new_sentence_reader(v_agenda, $REQUIRED, sentence_phrase, $WHOLE_SENTENCE, v_parse_tree);
                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
            }
        }
        return interaction;
    }

    /**
     *
     *
     * @return LISTP of isas for ARG-POSITION in SENTENCE.
     */
    public static final SubLObject uiat_isas_for_arg_position(SubLObject interaction, SubLObject sentence, SubLObject arg_position) {
        if (NIL != list_utilities.singletonP(arg_position)) {
            return list(uia_tools_browsing.uiat_salient_isa_for_argnum(interaction, arg_position.first(), sentence));
        } else {
            {
                SubLObject subformula = cycl_utilities.formula_arg(sentence, arg_position.first(), UNPROVIDED);
                SubLObject sub_arg_position = arg_position.rest();
                return uiat_isas_for_arg_position(interaction, subformula, sub_arg_position);
            }
        }
    }

    /**
     *
     *
     * @unknown this makes up spans which are both bogus and wrong.
     */
    public static final SubLObject replace_arg_positions_es_with_phrases_in_sentence(SubLObject sentence, SubLObject arg_positions_es, SubLObject phrases) {
        {
            SubLObject new_sentence = el_utilities.copy_formula(sentence);
            SubLObject accum = ZERO_INTEGER;
            SubLObject arg_positions = NIL;
            SubLObject arg_positions_54 = NIL;
            SubLObject phrase = NIL;
            SubLObject phrase_55 = NIL;
            for (arg_positions = arg_positions_es, arg_positions_54 = arg_positions.first(), phrase = phrases, phrase_55 = phrase.first(); !((NIL == phrase) && (NIL == arg_positions)); arg_positions = arg_positions.rest() , arg_positions_54 = arg_positions.first() , phrase = phrase.rest() , phrase_55 = phrase.first()) {
                {
                    SubLObject cdolist_list_var = arg_positions_54;
                    SubLObject arg_position = NIL;
                    for (arg_position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_position = cdolist_list_var.first()) {
                        {
                            SubLObject num_words = string_utilities.number_of_words(phrase_55);
                            SubLObject span = list_utilities.new_num_list(num_words, accum);
                            new_sentence = nreplace_arg_position_with_phrase_in_sentence(new_sentence, arg_position, phrase_55, span);
                            accum = add(accum, num_words);
                        }
                    }
                }
            }
            return new_sentence;
        }
    }

    public static final SubLObject nreplace_arg_position_with_phrase_in_sentence(SubLObject sentence, SubLObject arg_position, SubLObject phrase, SubLObject span) {
        {
            SubLObject new_arg = list($$TheResultOfParsing, phrase, bq_cons($$TheList, span));
            return el_utilities.nreplace_formula_arg_position(arg_position, new_arg, sentence);
        }
    }

    public static final SubLObject uia_act_new_concept_finder(SubLObject v_agenda, SubLObject mode, SubLObject my_result_will_be, SubLObject parse_template) {
        if (my_result_will_be == UNPROVIDED) {
            my_result_will_be = NIL;
        }
        if (parse_template == UNPROVIDED) {
            parse_template = NIL;
        }
        {
            SubLObject plist = NIL;
            if (NIL != my_result_will_be) {
                plist = putf(plist, $MY_RESULT_WILL_BE, my_result_will_be);
            }
            if (NIL != parse_template) {
                if (NIL != uiat_sentence_finder_templateP(v_agenda, parse_template)) {
                    Errors.warn($str_alt201$Concept_Finder_launched_for_Sente, parse_template);
                    return uia_act_new_sentence_finder(v_agenda, mode, NIL, my_result_will_be);
                }
                plist = putf(plist, $PARSE_TEMPLATE, parse_template);
            }
            {
                SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $CONCEPT_FINDER, NIL, plist);
                return interaction;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is PARSE-TEMPLATE suitable for CycL sentences?
     */
    public static final SubLObject uiat_sentence_finder_templateP(SubLObject v_agenda, SubLObject parse_template) {
        return makeBoolean((NIL != forts.fort_p(parse_template)) && (NIL != genls.genlP(parse_template, $$CycLSentence, UNPROVIDED, UNPROVIDED)));
    }

    // deflexical
    public static final SubLSymbol $uiat_default_trigger_string_for_finding$ = makeSymbol("*UIAT-DEFAULT-TRIGGER-STRING-FOR-FINDING*");

    // deflexical
    private static final SubLSymbol $concept_finder_trigger_strings$ = makeSymbol("*CONCEPT-FINDER-TRIGGER-STRINGS*");

    public static final SubLObject concept_finder_trigger_stringP(SubLObject string) {
        return subl_promotions.memberP(string, $concept_finder_trigger_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
    }

    public static final SubLObject uiat_concept_finder_generate_request(SubLObject interaction) {
        uiat_concept_finder_ensure_pending(interaction);
        {
            SubLObject allow_nusketchP = uia_coa_utilities.uia_coa_valid_nusketch_connectionP(user_interaction_agenda.ui_agenda(interaction));
            return user_interaction_agenda.make_ui_request(interaction, $SHOW, list($NUSKETCH, allow_nusketchP));
        }
    }

    public static final SubLObject uiat_concept_finder_ensure_pending(SubLObject interaction) {
        if (NIL == uia_concept_finder_peek(user_interaction_agenda.ui_agenda(interaction))) {
            uia_concept_finder_push(user_interaction_agenda.ui_agenda(interaction), interaction);
        }
        return interaction;
    }

    public static final SubLObject uiat_concept_finder_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            uia_concept_finder_remove(v_agenda, parent);
            {
                SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
                if (pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                    {
                        SubLObject result = user_interaction_agenda.ui_result(child);
                        if ($DONE == result) {
                            user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                        } else {
                            user_interaction_agenda.uia_act_complete(v_agenda, parent, result);
                        }
                    }
                } else
                    if (pcase_var.eql($THINKING)) {
                        {
                            SubLObject result = user_interaction_agenda.ui_result(child);
                            if ($ERROR == result) {
                                user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, $str_alt205$Sorry__somehow_nuSketch_and_KRAKE);
                                user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                            } else {
                                {
                                    SubLObject found_term = result.first();
                                    user_interaction_agenda.uia_act_complete(v_agenda, parent, found_term);
                                }
                            }
                        }
                    }

            }
        }
        return parent;
    }

    public static final SubLObject uiat_concept_finder_child_invalidated(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            uia_concept_finder_remove(v_agenda, parent);
            user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
        }
        return parent;
    }

    public static final SubLObject uiat_concept_finder_child_rejected(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            uia_concept_finder_remove(v_agenda, parent);
            user_interaction_agenda.uia_act_reject(v_agenda, parent);
        }
        return parent;
    }

    public static final SubLObject uiat_concept_finder_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_56 = plist;
                        SubLObject current_57 = datum_56;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_57;
                        SubLObject bad = NIL;
                        SubLObject current_58 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_56, $list_alt206);
                            current_58 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_56, $list_alt206);
                            if (NIL == member(current_58, $list_alt207, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_58 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_56, $list_alt206);
                        }
                        {
                            SubLObject mode_tail = property_list_member($MODE, current_57);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_concept_finder(v_agenda, mode, UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else
                    if (pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                        {
                            SubLObject datum_59 = plist;
                            SubLObject current_60 = datum_59;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_60;
                            SubLObject bad = NIL;
                            SubLObject current_61 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_59, $list_alt208);
                                current_61 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_59, $list_alt208);
                                if (NIL == member(current_61, $list_alt209, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_61 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_59, $list_alt208);
                            }
                            {
                                SubLObject phrase_tail = property_list_member($PHRASE, current_60);
                                SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                                SubLObject mode_tail = property_list_member($MODE, current_60);
                                SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                                SubLObject parse_template_tail = property_list_member($PARSE_TEMPLATE, current_60);
                                SubLObject parse_template = (NIL != parse_template_tail) ? ((SubLObject) (cadr(parse_template_tail))) : NIL;
                                SubLObject child = uia_act_new_concept_disambiguator(v_agenda, mode, phrase, NIL, NIL, parse_template, UNPROVIDED, UNPROVIDED);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            }
                        }
                    } else
                        if (pcase_var.eql($WAIT_FOR_NUSKETCH)) {
                            uiat_concept_finder_setup_wait_for_nusketch(interaction);
                        } else
                            if (pcase_var.eql($CATCH)) {
                                {
                                    SubLObject datum_62 = plist;
                                    SubLObject current_63 = datum_62;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current_63;
                                    SubLObject bad = NIL;
                                    SubLObject current_64 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum_62, $list_alt212);
                                        current_64 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum_62, $list_alt212);
                                        if (NIL == member(current_64, $list_alt134, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_64 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum_62, $list_alt212);
                                    }
                                    {
                                        SubLObject term_tail = property_list_member($TERM, current_63);
                                        SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                                        SubLObject concept_finder_interaction = uia_concept_finder_pop(v_agenda);
                                        user_interaction_agenda.uia_act_complete(v_agenda, concept_finder_interaction, v_term);
                                    }
                                }
                            }



            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_finder_setup_wait_for_nusketch(SubLObject interaction) {
        {
            SubLObject title = $$$KRAKEN;
            SubLObject prompt = $str_alt214$Please_select_the_glyph_you_want_;
            SubLObject acceptable_glyph_lists = list($ALL_GLYPHS);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject request_id = NIL;
            request_id = uia_coa_utilities.uia_coa_request_glyphs_from_nusketch(v_agenda, title, prompt, acceptable_glyph_lists, NIL);
            {
                SubLObject child = uia_act_new_thinking_child(interaction, UIA_COA_NUSKETCH_WAITER_THINKING_THREAD, list(v_agenda, request_id), $str_alt217$Please_make_your_selection_on_nuS, request_id);
                return child;
            }
        }
    }

    /**
     * Adds CONCEPT-FINDER-INTERACTION to AGENDA's state.
     */
    public static final SubLObject uia_concept_finder_push(SubLObject v_agenda, SubLObject concept_finder_interaction) {
        SubLTrampolineFile.checkType(concept_finder_interaction, USER_INTERACTION_P);
        return user_interaction_agenda.uia_state_update(v_agenda, $LAST_CONCEPT_FINDER, concept_finder_interaction);
    }

    /**
     * Pops CONCEPT-FINDER-INTERACTION from AGENDA's state.
     */
    public static final SubLObject uia_concept_finder_pop(SubLObject v_agenda) {
        {
            SubLObject interaction = uia_concept_finder_peek(v_agenda);
            uia_concept_finder_remove(v_agenda, interaction);
            return interaction;
        }
    }

    /**
     * Returns the most recent Concept Finder interaction on AGENDA's state,
     * or NIL if there are none.
     */
    public static final SubLObject uia_concept_finder_peek(SubLObject v_agenda) {
        return user_interaction_agenda.uia_state_lookup(v_agenda, $LAST_CONCEPT_FINDER, NIL);
    }

    /**
     * Clears CONCEPT-FINDER-INTERACTION from AGENDA's state.
     */
    public static final SubLObject uia_concept_finder_remove(SubLObject v_agenda, SubLObject concept_finder_interaction) {
        {
            SubLObject interaction = uia_concept_finder_peek(v_agenda);
            if (interaction.equal(concept_finder_interaction)) {
                uia_concept_finder_clear(v_agenda);
                return T;
            }
        }
        return NIL;
    }

    /**
     * Clears all concept finder interactions from AGENDA's state.
     */
    public static final SubLObject uia_concept_finder_clear(SubLObject v_agenda) {
        return user_interaction_agenda.uia_state_clear(v_agenda, $LAST_CONCEPT_FINDER);
    }

    /**
     *
     *
     * @return boolean; t iff we are within (in the general sense of the word)
    a Concept Finder interaction.
     */
    public static final SubLObject uia_within_concept_finderP(SubLObject v_agenda) {
        return list_utilities.sublisp_boolean(uia_concept_finder_peek(v_agenda));
    }

    public static final SubLObject uia_act_new_sentence_finder(SubLObject v_agenda, SubLObject mode, SubLObject indexical_table, SubLObject my_result_will_be) {
        if (indexical_table == UNPROVIDED) {
            indexical_table = NIL;
        }
        if (my_result_will_be == UNPROVIDED) {
            my_result_will_be = NIL;
        }
        {
            SubLObject plist = NIL;
            if (NIL != indexical_table) {
                plist = putf(plist, $INDEXICAL_TABLE, indexical_table);
            }
            if (NIL != my_result_will_be) {
                plist = putf(plist, $MY_RESULT_WILL_BE, my_result_will_be);
            }
            {
                SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SENTENCE_FINDER, NIL, plist);
                uia_sentence_finder_push(v_agenda, interaction);
                return interaction;
            }
        }
    }

    // deflexical
    private static final SubLSymbol $sentence_finder_trigger_strings$ = makeSymbol("*SENTENCE-FINDER-TRIGGER-STRINGS*");

    public static final SubLObject sentence_finder_trigger_stringP(SubLObject string) {
        return subl_promotions.memberP(string, $sentence_finder_trigger_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
    }

    public static final SubLObject uiat_sentence_finder_generate_request(SubLObject interaction) {
        return user_interaction_agenda.make_ui_request(interaction, $SHOW, NIL);
    }

    public static final SubLObject uiat_sentence_finder_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            uia_sentence_finder_remove(v_agenda, parent);
            {
                SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
                if (pcase_var.eql($KNOWLEDGE_SCRAPBOOK) || pcase_var.eql($ONTOLOGY_BROWSER)) {
                    {
                        SubLObject sentence = user_interaction_agenda.ui_result(child);
                        if (NIL != el_utilities.possibly_sentence_p(sentence)) {
                            user_interaction_agenda.uia_act_complete(v_agenda, parent, sentence);
                        } else {
                            user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                        }
                    }
                } else
                    if (pcase_var.eql($SENTENCE_READER)) {
                        {
                            SubLObject sentences = user_interaction_agenda.ui_result(child);
                            if (NIL != list_utilities.singletonP(sentences)) {
                                user_interaction_agenda.uia_act_complete(v_agenda, parent, sentences.first());
                            } else
                                if (sentences.isCons()) {
                                    user_interaction_agenda.uia_act_complete(v_agenda, parent, sentences.first());
                                } else {
                                    user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                                }

                        }
                    }

            }
        }
        return parent;
    }

    public static final SubLObject uiat_sentence_finder_child_invalidated(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            uia_sentence_finder_remove(v_agenda, parent);
            user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
        }
        return parent;
    }

    public static final SubLObject uiat_sentence_finder_child_rejected(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            uia_sentence_finder_remove(v_agenda, parent);
            user_interaction_agenda.uia_act_reject(v_agenda, parent);
        }
        return parent;
    }

    public static final SubLObject uiat_sentence_finder_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_65 = plist;
                        SubLObject current_66 = datum_65;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_66;
                        SubLObject bad = NIL;
                        SubLObject current_67 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_65, $list_alt206);
                            current_67 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_65, $list_alt206);
                            if (NIL == member(current_67, $list_alt207, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_67 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_65, $list_alt206);
                        }
                        {
                            SubLObject mode_tail = property_list_member($MODE, current_66);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_sentence_finder(v_agenda, mode, UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else
                    if (pcase_var.eql($SENTENCE_READER)) {
                        {
                            SubLObject datum_68 = plist;
                            SubLObject current_69 = datum_68;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_69;
                            SubLObject bad = NIL;
                            SubLObject current_70 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_68, $list_alt222);
                                current_70 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_68, $list_alt222);
                                if (NIL == member(current_70, $list_alt223, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_70 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_68, $list_alt222);
                            }
                            {
                                SubLObject text_tail = property_list_member($TEXT, current_69);
                                SubLObject text = (NIL != text_tail) ? ((SubLObject) (cadr(text_tail))) : NIL;
                                SubLObject mode_tail = property_list_member($MODE, current_69);
                                SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                                SubLObject child = cb_uiat_smart.uia_act_new_sentence_reader(v_agenda, mode, text, UNPROVIDED, UNPROVIDED);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            }
                        }
                    } else
                        if (pcase_var.eql($CATCH)) {
                            {
                                SubLObject datum_71 = plist;
                                SubLObject current_72 = datum_71;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_72;
                                SubLObject bad = NIL;
                                SubLObject current_73 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_71, $list_alt224);
                                    current_73 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_71, $list_alt224);
                                    if (NIL == member(current_73, $list_alt225, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_73 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_71, $list_alt224);
                                }
                                {
                                    SubLObject sentence_tail = property_list_member($SENTENCE, current_72);
                                    SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                                    SubLObject sentence_finder_interaction = uia_sentence_finder_pop(v_agenda);
                                    user_interaction_agenda.uia_act_complete(v_agenda, sentence_finder_interaction, sentence);
                                }
                            }
                        }


            }
        }
        return NIL;
    }

    /**
     * Adds SENTENCE-FINDER-INTERACTION to AGENDA's state.
     */
    public static final SubLObject uia_sentence_finder_push(SubLObject v_agenda, SubLObject sentence_finder_interaction) {
        SubLTrampolineFile.checkType(sentence_finder_interaction, USER_INTERACTION_P);
        return user_interaction_agenda.uia_state_update(v_agenda, $LAST_SENTENCE_FINDER, sentence_finder_interaction);
    }

    /**
     * Pops SENTENCE-FINDER-INTERACTION from AGENDA's state.
     */
    public static final SubLObject uia_sentence_finder_pop(SubLObject v_agenda) {
        {
            SubLObject interaction = uia_sentence_finder_peek(v_agenda);
            uia_sentence_finder_remove(v_agenda, interaction);
            return interaction;
        }
    }

    /**
     * Returns the most recent Sentence Finder interaction on AGENDA's state,
     * or NIL if there are none.
     */
    public static final SubLObject uia_sentence_finder_peek(SubLObject v_agenda) {
        return user_interaction_agenda.uia_state_lookup(v_agenda, $LAST_SENTENCE_FINDER, NIL);
    }

    /**
     * Clears SENTENCE-FINDER-INTERACTION from AGENDA's state.
     */
    public static final SubLObject uia_sentence_finder_remove(SubLObject v_agenda, SubLObject sentence_finder_interaction) {
        {
            SubLObject interaction = uia_sentence_finder_peek(v_agenda);
            if (interaction.equal(sentence_finder_interaction)) {
                uia_sentence_finder_clear(v_agenda);
                return T;
            }
        }
        return NIL;
    }

    /**
     * Clears all sentence finder interactions from AGENDA's state.
     */
    public static final SubLObject uia_sentence_finder_clear(SubLObject v_agenda) {
        return user_interaction_agenda.uia_state_clear(v_agenda, $LAST_SENTENCE_FINDER);
    }

    /**
     *
     *
     * @return boolean; t iff we are within (in the general sense of the word)
    a Sentence Finder interaction.
     */
    public static final SubLObject uia_within_sentence_finderP(SubLObject v_agenda) {
        return list_utilities.sublisp_boolean(uia_sentence_finder_peek(v_agenda));
    }

    public static final SubLObject uiat_sentence_finder_indexical_table(SubLObject interaction) {
        return user_interaction_agenda.ui_state_lookup(interaction, $INDEXICAL_TABLE, NIL);
    }

    public static final SubLObject uia_sentence_finder_indexical_table_peek(SubLObject v_agenda) {
        {
            SubLObject interaction = uia_sentence_finder_peek(v_agenda);
            if (NIL != interaction) {
                return uiat_sentence_finder_indexical_table(interaction);
            }
        }
        return NIL;
    }

    public static final class $file_browser_native extends SubLStructNative {
        @Override
	public SubLStructDecl getStructDecl() {
            return uia_tools_basic.$file_browser_native.structDecl;
        }

        @Override
	public SubLObject getField2() {
            return $directory;
        }

        @Override
	public SubLObject getField3() {
            return $filterfn;
        }

        @Override
	public SubLObject getField4() {
            return $type;
        }

        @Override
	public SubLObject getField5() {
            return $result;
        }

        @Override
	public SubLObject getField6() {
            return $path;
        }

        @Override
	public SubLObject getField7() {
            return $params;
        }

        @Override
	public SubLObject setField2(SubLObject value) {
            return $directory = value;
        }

        @Override
	public SubLObject setField3(SubLObject value) {
            return $filterfn = value;
        }

        @Override
	public SubLObject setField4(SubLObject value) {
            return $type = value;
        }

        @Override
	public SubLObject setField5(SubLObject value) {
            return $result = value;
        }

        @Override
	public SubLObject setField6(SubLObject value) {
            return $path = value;
        }

        @Override
	public SubLObject setField7(SubLObject value) {
            return $params = value;
        }

        public SubLObject $directory = Lisp.NIL;

        public SubLObject $filterfn = Lisp.NIL;

        public SubLObject $type = Lisp.NIL;

        public SubLObject $result = Lisp.NIL;

        public SubLObject $path = Lisp.NIL;

        public SubLObject $params = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(uia_tools_basic.$file_browser_native.class, FILE_BROWSER, FILE_BROWSER_P, $list_alt229, $list_alt230, new String[]{ "$directory", "$filterfn", "$type", "$result", "$path", "$params" }, $list_alt231, $list_alt232, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_file_browser$ = makeSymbol("*DTP-FILE-BROWSER*");

    public static final SubLObject file_browser_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject file_browser_p(SubLObject v_object) {
        return v_object.getClass() == uia_tools_basic.$file_browser_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $file_browser_p$UnaryFunction extends UnaryFunction {
        public $file_browser_p$UnaryFunction() {
            super(extractFunctionNamed("FILE-BROWSER-P"));
        }

        @Override
	public SubLObject processItem(SubLObject arg1) {
            return file_browser_p(arg1);
        }
    }

    public static final SubLObject file_browser_directory(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_BROWSER_P);
        return v_object.getField2();
    }

    public static final SubLObject file_browser_filterfn(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_BROWSER_P);
        return v_object.getField3();
    }

    public static final SubLObject file_browser_type(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_BROWSER_P);
        return v_object.getField4();
    }

    public static final SubLObject file_browser_result(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_BROWSER_P);
        return v_object.getField5();
    }

    public static final SubLObject file_browser_path(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_BROWSER_P);
        return v_object.getField6();
    }

    public static final SubLObject file_browser_params(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_BROWSER_P);
        return v_object.getField7();
    }

    public static final SubLObject _csetf_file_browser_directory(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_BROWSER_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_file_browser_filterfn(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_BROWSER_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_file_browser_type(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_BROWSER_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_file_browser_result(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_BROWSER_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_file_browser_path(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_BROWSER_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_file_browser_params(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_BROWSER_P);
        return v_object.setField7(value);
    }

    public static final SubLObject make_file_browser(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new uia_tools_basic.$file_browser_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($DIRECTORY)) {
                        _csetf_file_browser_directory(v_new, current_value);
                    } else
                        if (pcase_var.eql($FILTERFN)) {
                            _csetf_file_browser_filterfn(v_new, current_value);
                        } else
                            if (pcase_var.eql($TYPE)) {
                                _csetf_file_browser_type(v_new, current_value);
                            } else
                                if (pcase_var.eql($RESULT)) {
                                    _csetf_file_browser_result(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PATH)) {
                                        _csetf_file_browser_path(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PARAMS)) {
                                            _csetf_file_browser_params(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt252$Invalid_slot__S_for_construction_, current_arg);
                                        }





                }
            }
            return v_new;
        }
    }

    public static final SubLObject new_file_browser(SubLObject directory, SubLObject filterfn, SubLObject type) {
        {
            SubLObject fb = make_file_browser(UNPROVIDED);
            _csetf_file_browser_directory(fb, directory);
            _csetf_file_browser_filterfn(fb, filterfn);
            _csetf_file_browser_type(fb, type);
            _csetf_file_browser_result(fb, NIL);
            _csetf_file_browser_params(fb, NIL);
            return fb;
        }
    }

    public static final SubLObject uia_act_new_file_browser(SubLObject v_agenda, SubLObject directory, SubLObject type, SubLObject filterfn) {
        if (type == UNPROVIDED) {
            type = $LOAD;
        }
        if (filterfn == UNPROVIDED) {
            filterfn = UIAT_FB_MATCH_ANYTHING;
        }
        {
            SubLObject fb_state = uiat_new_file_browser(directory, type, filterfn);
            SubLObject child = user_interaction_agenda.uia_act_new_interaction(v_agenda, $REQUIRED, $FILE_BROWSER, list(fb_state), UNPROVIDED);
            return child;
        }
    }

    public static final SubLObject uiat_new_file_browser(SubLObject directory, SubLObject type, SubLObject filterfn) {
        if (type == UNPROVIDED) {
            type = $LOAD;
        }
        if (filterfn == UNPROVIDED) {
            filterfn = UIAT_FB_MATCH_ANYTHING;
        }
        return new_file_browser(directory, filterfn, type);
    }

    public static final SubLObject uia_act_load_file_masked(SubLObject v_agenda, SubLObject directory, SubLObject mask) {
        {
            SubLObject fb = uiat_new_file_browser(directory, $LOAD, UIAT_FB_MATCHING_FILENAME);
            _csetf_file_browser_params(fb, mask);
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, $REQUIRED, $FILE_BROWSER, list(fb), UNPROVIDED);
        }
    }

    public static final SubLObject uia_act_save_file_masked(SubLObject v_agenda, SubLObject directory, SubLObject mask) {
        {
            SubLObject fb = uiat_new_file_browser(directory, $SAVE, UIAT_FB_MATCHING_FILENAME);
            _csetf_file_browser_params(fb, mask);
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, $REQUIRED, $FILE_BROWSER, list(fb), UNPROVIDED);
        }
    }

    public static final SubLObject uiat_fb_match_anything(SubLObject filename, SubLObject fb) {
        return filename;
    }

    public static final SubLObject uiat_fb_matching_filename(SubLObject filename, SubLObject fb) {
        {
            SubLObject mask = file_browser_params(fb);
            SubLObject match_size = subtract(length(filename), length(mask));
            return Strings.string_equal(filename, mask, match_size, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject uiat_file_browser_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject fb = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt259);
            fb = current.first();
            current = current.rest();
            if (NIL == current) {
                return cconcatenate(file_browser_type(fb) == $LOAD ? ((SubLObject) ($$$Load)) : $$$Save, new SubLObject[]{ $str_alt262$___, file_browser_directory(fb) });
            } else {
                cdestructuring_bind_error(datum, $list_alt259);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_file_browser_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject fb_state = user_interaction_agenda.ui_state_lookup(interaction, $FB_STATE, UNPROVIDED);
            if (NIL == fb_state) {
                uiat_fb_constructor(interaction);
                fb_state = user_interaction_agenda.ui_state_lookup(interaction, $FB_STATE, UNPROVIDED);
            }
            uiat_fb_compute_current_state(interaction, fb_state);
            return user_interaction_agenda.make_ui_request(interaction, $SHOW, list(new SubLObject[]{ $DIRECTORY, file_browser_path(fb_state), $TYPE, file_browser_type(fb_state), $DIRS, user_interaction_agenda.ui_state_lookup(interaction, $DIRS, UNPROVIDED), $FILES, user_interaction_agenda.ui_state_lookup(interaction, $FILES, UNPROVIDED), $kw266$HAS_PARENT_, user_interaction_agenda.ui_state_lookup(interaction, $kw266$HAS_PARENT_, UNPROVIDED) }));
        }
    }

    public static final SubLObject uiat_fb_constructor(SubLObject interaction) {
        {
            SubLObject fb_state = user_interaction_agenda.ui_args(interaction).first();
            if (fb_state.isString()) {
                fb_state = apply(UIAT_NEW_FILE_BROWSER, user_interaction_agenda.ui_args(interaction));
            }
            user_interaction_agenda.ui_state_update(interaction, $FB_STATE, fb_state);
        }
        return interaction;
    }

    public static final SubLObject uiat_fb_compute_current_state(SubLObject interaction, SubLObject fb_state) {
        {
            SubLObject directory = file_browser_directory(fb_state);
            SubLObject files_full = Filesys.directory(directory, T);
            SubLObject files_short = Filesys.directory(directory, UNPROVIDED);
            SubLObject path = uiat_fb_compute_path(directory, files_full, files_short);
            SubLObject files = NIL;
            SubLObject dirs = NIL;
            _csetf_file_browser_path(fb_state, path);
            {
                SubLObject filterfn = file_browser_filterfn(fb_state);
                SubLObject list_var = NIL;
                SubLObject filename = NIL;
                SubLObject index = NIL;
                for (list_var = files_full, filename = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , filename = list_var.first() , index = add(ONE_INTEGER, index)) {
                    {
                        SubLObject short_file = nth(index, files_short);
                        SubLObject directoryP = NIL;
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                try {
                                    bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                    try {
                                        directoryP = uiat_fb_is_directoryP(filename);
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    rebind(Errors.$error_handler$, _prev_bind_0);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        }
                        if (NIL != directoryP) {
                            dirs = cons(short_file, dirs);
                        } else {
                            if (NIL != funcall(filterfn, filename, fb_state)) {
                                files = cons(short_file, files);
                            }
                        }
                    }
                }
            }
            user_interaction_agenda.ui_state_update(interaction, $FILES, Sort.sort(files, STRING_LESSP, UNPROVIDED));
            user_interaction_agenda.ui_state_update(interaction, $DIRS, Sort.sort(dirs, STRING_LESSP, UNPROVIDED));
            user_interaction_agenda.ui_state_update(interaction, $kw266$HAS_PARENT_, Filesys.directory(cconcatenate(directory, $str_alt269$___), UNPROVIDED));
        }
        return interaction;
    }

    public static final SubLObject uiat_fb_is_directoryP(SubLObject dirname) {
        return Filesys.directory_p(cconcatenate(dirname, $str_alt270$_));
    }

    public static final SubLObject uiat_fb_compute_path(SubLObject directory, SubLObject longdir, SubLObject shortdir) {
        {
            SubLObject path = uiat_fb_isolate_path(longdir, shortdir);
            if (NIL == path) {
                path = cconcatenate(directory, $str_alt270$_);
            }
            return path;
        }
    }

    /**
     * Compute the current working directory
     */
    public static final SubLObject uiat_fb_isolate_path(SubLObject longdir, SubLObject shortdir) {
        if (longdir.isCons() && shortdir.isCons()) {
            {
                SubLObject full_1 = longdir.first();
                SubLObject short_1 = shortdir.first();
                return string_utilities.substring(full_1, ZERO_INTEGER, subtract(length(full_1), length(short_1)));
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_file_browser_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($DIR_CHOICE)) {
                    {
                        SubLObject datum_74 = plist;
                        SubLObject current_75 = datum_74;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_75;
                        SubLObject bad = NIL;
                        SubLObject current_76 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_74, $list_alt272);
                            current_76 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_74, $list_alt272);
                            if (NIL == member(current_76, $list_alt273, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_76 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_74, $list_alt272);
                        }
                        {
                            SubLObject directory_tail = property_list_member($DIRECTORY, current_75);
                            SubLObject directory = (NIL != directory_tail) ? ((SubLObject) (cadr(directory_tail))) : NIL;
                            SubLObject fb_state = user_interaction_agenda.ui_state_lookup(interaction, $FB_STATE, UNPROVIDED);
                            _csetf_file_browser_directory(fb_state, directory);
                            uiat_fb_compute_current_state(interaction, fb_state);
                        }
                    }
                } else
                    if (pcase_var.eql($FILE_CHOICE)) {
                        {
                            SubLObject datum_77 = plist;
                            SubLObject current_78 = datum_77;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_78;
                            SubLObject bad = NIL;
                            SubLObject current_79 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_77, $list_alt275);
                                current_79 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_77, $list_alt275);
                                if (NIL == member(current_79, $list_alt276, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_79 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_77, $list_alt275);
                            }
                            {
                                SubLObject file_tail = property_list_member($FILE, current_78);
                                SubLObject file = (NIL != file_tail) ? ((SubLObject) (cadr(file_tail))) : NIL;
                                SubLObject fb_state = user_interaction_agenda.ui_state_lookup(interaction, $FB_STATE, UNPROVIDED);
                                SubLObject filename = uiat_fb_ensure_correct_filename(file, fb_state);
                                user_interaction_agenda.uia_act_complete(v_agenda, interaction, filename);
                            }
                        }
                    }

            }
        }
        return NIL;
    }

    /**
     * Make sure that the filename entered/selected matches the
     * pattern required.
     *
     * @unknown need to be better about this
     */
    public static final SubLObject uiat_fb_ensure_correct_filename(SubLObject file, SubLObject fb_state) {
        {
            SubLObject filter_fn = file_browser_filterfn(fb_state);
            if ((filter_fn == UIAT_FB_MATCHING_FILENAME) && (NIL == funcall(filter_fn, file, fb_state))) {
                return cconcatenate(file, file_browser_params(fb_state));
            }
        }
        return file;
    }

    public static final SubLObject uia_act_new_sentence_cloner(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sentence, SubLObject clone_type, SubLObject uneditable_arg_positions) {
        if (uneditable_arg_positions == UNPROVIDED) {
            uneditable_arg_positions = NIL;
        }
        if (NIL != assertion_handles.assertion_p(cycl_sentence)) {
            cycl_sentence = uncanonicalizer.assertion_el_formula(cycl_sentence);
        }
        {
            SubLObject header_string = header_string_for_clone_type(clone_type);
            SubLObject button_text = button_text_for_clone_type(clone_type);
            SubLObject args = list(cycl_sentence, clone_type, header_string, button_text);
            SubLObject plist = NIL;
            if (NIL != uneditable_arg_positions) {
                plist = putf(plist, $UNEDITABLE_ARG_POSITIONS, uneditable_arg_positions);
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SENTENCE_CLONER, args, plist);
        }
    }

    public static final SubLObject header_string_for_clone_type(SubLObject clone_type) {
        {
            SubLObject pcase_var = clone_type;
            if (pcase_var.eql($QUESTION)) {
                return $str_alt280$Replace_as_many_of_the_terms_as_y;
            } else
                if (pcase_var.eql($SENTENCE)) {
                    return $str_alt281$Replace_as_many_of_the_terms_as_y;
                } else
                    if (pcase_var.eql($ASSERTION)) {
                        return $str_alt283$Replace_as_many_of_the_terms_as_y;
                    } else {
                        return $str_alt53$;
                    }


        }
    }

    public static final SubLObject button_text_for_clone_type(SubLObject clone_type) {
        {
            SubLObject pcase_var = clone_type;
            if (pcase_var.eql($QUESTION)) {
                return $$$Ask_Similar_Question;
            } else
                if (pcase_var.eql($SENTENCE)) {
                    return $$$Similar_Sentence;
                } else
                    if (pcase_var.eql($ASSERTION)) {
                        return $$$Similar_Fact;
                    } else {
                        return $$$Continue;
                    }


        }
    }

    public static final SubLObject uia_act_new_sentence_cloner_widget(SubLObject super_interaction, SubLObject cycl_sentence, SubLObject clone_type, SubLObject uneditable_arg_positions) {
        if (uneditable_arg_positions == UNPROVIDED) {
            uneditable_arg_positions = NIL;
        }
        {
            SubLObject args = list(cycl_sentence, clone_type, $str_alt53$, $str_alt53$);
            SubLObject plist = NIL;
            if (NIL != uneditable_arg_positions) {
                plist = putf(plist, $UNEDITABLE_ARG_POSITIONS, uneditable_arg_positions);
            }
            return user_interaction_agenda.uia_act_new_sub_interaction(super_interaction, $SENTENCE_CLONER, args, plist);
        }
    }

    public static final SubLObject uiat_sentence_cloner_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            SubLObject clone_type = NIL;
            SubLObject header_string = NIL;
            SubLObject button_text = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt288);
            cycl_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt288);
            clone_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt288);
            header_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt288);
            button_text = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject phrase = (clone_type == $QUESTION) ? ((SubLObject) (uia_trampolines.uia_query_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
                    return cconcatenate(button_text, new SubLObject[]{ $str_alt262$___, phrase });
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt288);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_sentence_cloner_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            SubLObject clone_type = NIL;
            SubLObject header_string = NIL;
            SubLObject button_text = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt288);
            cycl_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt288);
            clone_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt288);
            header_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt288);
            button_text = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject modified_sentence = user_interaction_agenda.ui_state_lookup(interaction, $MODIFIED_SENTENCE, cycl_sentence);
                    SubLObject indexical_table = uia_sentence_finder_indexical_table_peek(v_agenda);
                    if ($TRUE == user_interaction_agenda.ui_state_lookup(interaction, $RESOLVED, $FALSE)) {
                        if (NIL != user_interaction_agenda.ui_state_lookup(interaction, $kw290$NEGATED_, UNPROVIDED)) {
                            modified_sentence = cycl_utilities.negate(modified_sentence);
                        }
                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, modified_sentence);
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    } else {
                        {
                            SubLObject mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
                            SubLObject uneditable_arg_positions = user_interaction_agenda.ui_state_lookup(interaction, $UNEDITABLE_ARG_POSITIONS, NIL);
                            SubLObject editable_arg_info = uiat_sentence_cloner_editable_arg_info(modified_sentence, mt, uneditable_arg_positions);
                            SubLObject force = ($QUESTION == clone_type) ? ((SubLObject) ($INTERROGATIVE)) : $DECLARATIVE;
                            SubLObject pph_output_list = uia_trampolines.uia_phrase_output_list(v_agenda, cycl_sentence, force, UNPROVIDED, UNPROVIDED);
                            SubLObject sentence_paraphrase = pph_phrase.pph_phrase_output_list_string(pph_output_list, T);
                            if (NIL == editable_arg_info) {
                                {
                                    SubLObject message = $str_alt292$Sorry__I_m_not_sure_which_argumen;
                                    user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                                }
                                user_interaction_agenda.uia_act_invalidate(v_agenda, interaction);
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            } else {
                                editable_arg_info = uiat_sentence_cloner_sort_info(editable_arg_info, pph_output_list);
                                uiat_sentence_cloner_add_paraphrases(editable_arg_info, pph_output_list);
                                {
                                    SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list(new SubLObject[]{ $ORIGINAL_SENTENCE, cycl_sentence, $MODIFIED_SENTENCE, modified_sentence, $CLONE_TYPE, clone_type, $HEADER_STRING, header_string, $BUTTON_TEXT, button_text, $INDEXICAL_STRINGS, list_utilities.alist_values(indexical_table), $EDITABLE_ARG_INFO, editable_arg_info, $SENTENCE_PARAPHRASE, sentence_paraphrase }));
                                    user_interaction_agenda.ui_state_update(interaction, $EDITABLE_ARG_INFO, editable_arg_info);
                                    return request;
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt288);
            }
        }
        return NIL;
    }

    /**
     * Holder for sorting reference use.
     */
    // defparameter
    private static final SubLSymbol $uiat_pph_output_list$ = makeSymbol("*UIAT-PPH-OUTPUT-LIST*");

    /**
     * Sort EDITABLE-ARG-INFO by order in PPH-OUTPUT-LIST.
     */
    public static final SubLObject uiat_sentence_cloner_sort_info(SubLObject editable_arg_info, SubLObject pph_output_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $uiat_pph_output_list$.currentBinding(thread);
                try {
                    $uiat_pph_output_list$.bind(pph_output_list, thread);
                    editable_arg_info = Sort.sort(editable_arg_info, UIAT_SENTENCE_CLONER_SORTER, symbol_function(SECOND));
                } finally {
                    $uiat_pph_output_list$.rebind(_prev_bind_0, thread);
                }
            }
            return editable_arg_info;
        }
    }

    public static final SubLObject uiat_sentence_cloner_sorter(SubLObject arg_pos1, SubLObject arg_pos2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return pph_main.pph_output_list_arg_position_precedesP($uiat_pph_output_list$.getDynamicValue(thread), arg_pos1, arg_pos2);
        }
    }

    /**
     * Destructively add old-arg paraphrases from PPH-OUTPUT-LIST to EDITABLE-ARG-INFO.
     */
    public static final SubLObject uiat_sentence_cloner_add_paraphrases(SubLObject editable_arg_info, SubLObject pph_output_list) {
        {
            SubLObject cdolist_list_var = editable_arg_info;
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject arg_position = second(tuple);
                    SubLObject paraphrase = pph_main.pph_string_for_arg_position(arg_position, pph_output_list, T);
                    nconc(tuple, list(paraphrase));
                }
            }
        }
        return editable_arg_info;
    }

    public static final SubLObject uiat_sentence_cloner_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (((pcase_var.eql($CONCEPT_DISAMBIGUATOR) || pcase_var.eql($SENTENCE_READER)) || pcase_var.eql($SENTENCE_FINDER)) || pcase_var.eql($CONCEPT_FINDER)) {
                {
                    SubLObject v_term = user_interaction_agenda.ui_result(child);
                    SubLObject my_result_will_be = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
                    SubLObject modified_sentence = user_interaction_agenda.ui_state_lookup(parent, $MODIFIED_SENTENCE, UNPROVIDED);
                    if (NIL != list_utilities.every_in_list(symbol_function(INTEGERP), my_result_will_be, UNPROVIDED)) {
                        modified_sentence = el_utilities.replace_formula_arg_position(my_result_will_be, v_term, modified_sentence);
                        user_interaction_agenda.ui_state_update(parent, $MODIFIED_SENTENCE, modified_sentence);
                    }
                }
            } else
                if (pcase_var.eql($CONCEPT_IN_SENTENCE_DISAMBIGUATOR)) {
                    user_interaction_agenda.ui_state_update(parent, $RESOLVED, $TRUE);
                    user_interaction_agenda.ui_state_update(parent, $MODIFIED_SENTENCE, user_interaction_agenda.ui_result(child));
                }

        }
        return parent;
    }

    public static final SubLObject uiat_sentence_cloner_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_80 = plist;
                        SubLObject current_81 = datum_80;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_81;
                        SubLObject bad = NIL;
                        SubLObject current_82 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_80, $list_alt302);
                            current_82 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_80, $list_alt302);
                            if (NIL == member(current_82, $list_alt303, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_82 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_80, $list_alt302);
                        }
                        {
                            SubLObject sentence_tail = property_list_member($SENTENCE, current_81);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject clone_type_tail = property_list_member($CLONE_TYPE, current_81);
                            SubLObject clone_type = (NIL != clone_type_tail) ? ((SubLObject) (cadr(clone_type_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_81);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_sentence_cloner(v_agenda, mode, sentence, clone_type, UNPROVIDED);
                        }
                    }
                } else
                    if (pcase_var.eql($ABORT)) {
                        user_interaction_agenda.uia_act_reject(v_agenda, interaction);
                    } else
                        if (pcase_var.eql($ANSWER)) {
                            uiat_sentence_cloner_handle_answer_reply(interaction, plist);
                        } else
                            if (pcase_var.eql($FORMULA_ANSWER)) {
                                uiat_sentence_cloner_handle_formula_answer_reply(interaction, plist);
                            }



            }
        }
        return NIL;
    }

    public static final SubLObject uiat_sentence_cloner_handle_answer_reply(SubLObject interaction, SubLObject plist) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject original_sentence = NIL;
            SubLObject clone_type = NIL;
            SubLObject header_string = NIL;
            SubLObject button_text = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt306);
            original_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt306);
            clone_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt306);
            header_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt306);
            button_text = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject modified_sentence = user_interaction_agenda.ui_state_lookup(interaction, $MODIFIED_SENTENCE, original_sentence);
                    SubLObject indexical_table = uia_sentence_finder_indexical_table_peek(v_agenda);
                    SubLObject editable_arg_info = user_interaction_agenda.ui_state_lookup(interaction, $EDITABLE_ARG_INFO, UNPROVIDED);
                    SubLObject phrases = NIL;
                    SubLObject arg_positions_es = NIL;
                    SubLObject saw_a_sentenceP = NIL;
                    SubLObject datum_83 = plist;
                    SubLObject current_84 = datum_83;
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current_84;
                    SubLObject bad = NIL;
                    SubLObject current_85 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum_83, $list_alt307);
                        current_85 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum_83, $list_alt307);
                        if (NIL == member(current_85, $list_alt308, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_85 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum_83, $list_alt307);
                    }
                    {
                        SubLObject arg_position_phrase_pairs_tail = property_list_member($ARG_POSITION_PHRASE_PAIRS, current_84);
                        SubLObject arg_position_phrase_pairs = (NIL != arg_position_phrase_pairs_tail) ? ((SubLObject) (cadr(arg_position_phrase_pairs_tail))) : NIL;
                        SubLObject negated_tail = property_list_member($NEGATED, current_84);
                        SubLObject negated = (NIL != negated_tail) ? ((SubLObject) (cadr(negated_tail))) : NIL;
                        if (negated == $TRUE) {
                            user_interaction_agenda.ui_state_update(interaction, $kw290$NEGATED_, T);
                        }
                        if (NIL == arg_position_phrase_pairs) {
                            user_interaction_agenda.ui_state_update(interaction, $RESOLVED, $TRUE);
                        }
                        user_interaction_agenda.ui_state_clear(interaction, $CLEARED_ARG_POSITIONS);
                        {
                            SubLObject cdolist_list_var = arg_position_phrase_pairs;
                            SubLObject pair = NIL;
                            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                {
                                    SubLObject datum_86 = pair;
                                    SubLObject current_87 = datum_86;
                                    SubLObject arg_position = NIL;
                                    SubLObject new_arg_phrase = NIL;
                                    destructuring_bind_must_consp(current_87, datum_86, $list_alt311);
                                    arg_position = current_87.first();
                                    current_87 = current_87.rest();
                                    destructuring_bind_must_consp(current_87, datum_86, $list_alt311);
                                    new_arg_phrase = current_87.first();
                                    current_87 = current_87.rest();
                                    if (NIL == current_87) {
                                        {
                                            SubLObject indexical = rassoc(new_arg_phrase, indexical_table, symbol_function(EQUALP), UNPROVIDED).first();
                                            SubLObject type = rassoc(list(arg_position), editable_arg_info, symbol_function(EQUAL), UNPROVIDED).first();
                                            if (((NIL == indexical) && (NIL == concept_finder_trigger_stringP(new_arg_phrase))) && (NIL != string_utilities.ends_with(new_arg_phrase, $str_alt312$_, UNPROVIDED))) {
                                                new_arg_phrase = string_utilities.strip_final(new_arg_phrase, UNPROVIDED);
                                            }
                                            if (NIL != indexical) {
                                                modified_sentence = el_utilities.replace_formula_arg_position(arg_position, indexical, modified_sentence);
                                            } else
                                                if (($QUESTION == clone_type) && ((NIL != string_utilities.empty_string_p(new_arg_phrase)) || (NIL != uia_trampolines.uia_wh_wordP(v_agenda, new_arg_phrase)))) {
                                                    if (NIL != string_utilities.empty_string_p(new_arg_phrase)) {
                                                        new_arg_phrase = $$$what;
                                                    }
                                                    {
                                                        SubLObject v_default = cycl_variables.make_el_var(Strings.string_upcase(new_arg_phrase, UNPROVIDED, UNPROVIDED));
                                                        SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(modified_sentence, v_default);
                                                        modified_sentence = el_utilities.replace_formula_arg_position(arg_position, new_var, modified_sentence);
                                                    }
                                                } else
                                                    if ($SENTENCE == type) {
                                                        saw_a_sentenceP = T;
                                                        {
                                                            SubLObject sentence_to_read = (NIL != sentence_finder_trigger_stringP(new_arg_phrase)) ? ((SubLObject) (NIL)) : new_arg_phrase;
                                                            SubLObject my_result_will_be = arg_position;
                                                            SubLObject child = uia_act_new_sentence_finder(v_agenda, $REQUIRED, sentence_to_read, my_result_will_be);
                                                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                                        }
                                                    } else
                                                        if (NIL != concept_finder_trigger_stringP(new_arg_phrase)) {
                                                            {
                                                                SubLObject my_result_will_be = arg_position;
                                                                SubLObject child = uia_act_new_concept_finder(v_agenda, $REQUIRED, my_result_will_be, UNPROVIDED);
                                                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                                            }
                                                        } else
                                                            if (NIL != string_utilities.empty_stringP(new_arg_phrase)) {
                                                                {
                                                                    SubLObject cleared_arg_positions = user_interaction_agenda.ui_state_lookup(interaction, $CLEARED_ARG_POSITIONS, NIL);
                                                                    user_interaction_agenda.ui_state_update(interaction, $CLEARED_ARG_POSITIONS, cons(arg_position, cleared_arg_positions));
                                                                }
                                                            } else {
                                                                arg_positions_es = cons(list(arg_position), arg_positions_es);
                                                                phrases = cons(new_arg_phrase, phrases);
                                                            }




                                        }
                                    } else {
                                        cdestructuring_bind_error(datum_86, $list_alt311);
                                    }
                                }
                            }
                        }
                        if (NIL != phrases) {
                            if (NIL != saw_a_sentenceP) {
                                {
                                    SubLObject message = $str_alt314$Sorry__I_can_t_handle_replacing_a;
                                    user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                                }
                            } else {
                                phrases = nreverse(phrases);
                                arg_positions_es = nreverse(arg_positions_es);
                                {
                                    SubLObject child = uia_act_new_concept_in_sentence_disambiguator(v_agenda, $REQUIRED, phrases, arg_positions_es, modified_sentence, NIL, negated, UNPROVIDED, UNPROVIDED);
                                    SubLObject force = ($QUESTION == clone_type) ? ((SubLObject) ($QUESTION)) : $DECLARATIVE;
                                    user_interaction_agenda.ui_state_update(child, $SENTENCE_FORCE, force);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                }
                            }
                        }
                        user_interaction_agenda.ui_state_update(interaction, $MODIFIED_SENTENCE, modified_sentence);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt306);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_sentence_cloner_handle_formula_answer_reply(SubLObject interaction, SubLObject plist) {
        {
            SubLObject datum = plist;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_88 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt315);
                current_88 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt315);
                if (NIL == member(current_88, $list_alt316, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_88 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt315);
            }
            {
                SubLObject formula_tail = property_list_member($FORMULA, current);
                SubLObject formula = (NIL != formula_tail) ? ((SubLObject) (cadr(formula_tail))) : NIL;
                user_interaction_agenda.ui_state_update(interaction, $MODIFIED_SENTENCE, formula);
                user_interaction_agenda.ui_state_update(interaction, $RESOLVED, $TRUE);
                user_interaction_agenda.ui_state_clear(interaction, $kw290$NEGATED_);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_sentence_cloner_editable_arg_info(SubLObject sentence, SubLObject mt, SubLObject uneditable_arg_positions) {
        {
            SubLObject arg_info = NIL;
            if (NIL != el_utilities.atomic_sentenceP(sentence)) {
                {
                    SubLObject pred = cycl_utilities.atomic_sentence_predicate(sentence);
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject arg = NIL;
                    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                        argnum = add(argnum, ONE_INTEGER);
                        {
                            SubLObject type = uiat_sentence_cloner_arg_type(pred, arg, argnum, mt);
                            if (NIL != subl_promotions.memberP(type, $list_alt319, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject arg_position = list(argnum);
                                    if (NIL == subl_promotions.memberP(arg_position, uneditable_arg_positions, symbol_function(EQUAL), UNPROVIDED)) {
                                        arg_info = cons(list(type, arg_position), arg_info);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject subsentence = NIL;
                    for (subsentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subsentence = cdolist_list_var.first()) {
                        argnum = add(argnum, ONE_INTEGER);
                        {
                            SubLObject cdolist_list_var_89 = uiat_sentence_cloner_editable_arg_info(subsentence, mt, uneditable_arg_positions);
                            SubLObject sub_arg_info = NIL;
                            for (sub_arg_info = cdolist_list_var_89.first(); NIL != cdolist_list_var_89; cdolist_list_var_89 = cdolist_list_var_89.rest() , sub_arg_info = cdolist_list_var_89.first()) {
                                {
                                    SubLObject datum = sub_arg_info;
                                    SubLObject current = datum;
                                    SubLObject type = NIL;
                                    SubLObject sub_arg_position = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt320);
                                    type = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt320);
                                    sub_arg_position = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        {
                                            SubLObject arg_position = cons(argnum, sub_arg_position);
                                            if (NIL == subl_promotions.memberP(arg_position, uneditable_arg_positions, symbol_function(EQUAL), UNPROVIDED)) {
                                                arg_info = cons(list(type, arg_position), arg_info);
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt320);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(arg_info);
        }
    }

    public static final SubLObject uiat_sentence_cloner_arg_type(SubLObject pred, SubLObject arg, SubLObject argnum, SubLObject mt) {
        if (NIL == el_utilities.closedP(arg, UNPROVIDED)) {
            return $OPEN;
        }
        {
            SubLObject arg_isas = kb_accessors.argn_isa(pred, argnum, mt);
            if (NIL != genls.any_specP($$Predicate, arg_isas, mt, UNPROVIDED)) {
                return $PREDICATE;
            } else
                if (NIL != genls.any_specP($$CycLSentence, arg_isas, mt, UNPROVIDED)) {
                    return $SENTENCE;
                } else
                    if (NIL != genls.any_specP($$TruthFunction, arg_isas, mt, UNPROVIDED)) {
                        return $NON_PREDICATE_TRUTH_FUNCTION;
                    } else {
                        return $TERM;
                    }


        }
    }

    /**
     *
     *
     * @return CycL expression; either the atomic or composite predicate of CYCL-SENTENCE.
    In the case of a rule-macro predicate plus a binary predicate, this will return a
    composite predicate using #$QuantifiedBinaryPredicateFn.
     */
    public static final SubLObject uiat_arg_type_constraint_pred_for_sentence(SubLObject cycl_sentence) {
        {
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(cycl_sentence);
            SubLObject rmp_type = constants_high.find_constant($str_alt326$QuantificationalRuleMacroPredicat);
            SubLObject rmp_fn = constants_high.find_constant($$$QuantifiedBinaryPredicateFn);
            if (((NIL != rmp_type) && (NIL != rmp_fn)) && (NIL != isa.isa_in_any_mtP(pred, rmp_type))) {
                pred = el_utilities.make_binary_formula(rmp_fn, pred, cycl_utilities.atomic_sentence_arg1(cycl_sentence, UNPROVIDED));
            }
            return pred;
        }
    }

    /**
     * Return either an argument type string for the current CycL sentence or
     * :UNSUPPORTED if there is no way to compute it, or
     * :TRIVIAL if the arg-type constraints are at the level of #$Thing.
     */
    public static final SubLObject uiat_arg_type_warning_string_for_sentence(SubLObject cycl_sentence, SubLObject v_agenda) {
        {
            SubLObject pred = uiat_arg_type_constraint_pred_for_sentence(cycl_sentence);
            return uiat_arg_type_warning_string_for_pred(pred, v_agenda);
        }
    }

    /**
     * Return either an argument type string for the current predicate or
     * :UNSUPPORTED if there is no way to compute it, or
     * :TRIVIAL if the arg-type constraints are at the level of #$Thing.
     */
    public static final SubLObject uiat_arg_type_warning_string_for_pred(SubLObject pred, SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject warning_string = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                    try {
                        pph_vars.$pph_term_paraphrase_map$.bind(list(bq_cons(pred, $$$this_relation)), thread);
                        warning_string = uia_trampolines.uia_arg_type_summary_for_pred(v_agenda, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
                    }
                }
                return warning_string;
            }
        }
    }

    public static final SubLObject declare_uia_tools_basic_file() {
        declareFunction("uia_act_new_reset_agenda", "UIA-ACT-NEW-RESET-AGENDA", 1, 0, false);
        declareFunction("uiat_reset_agenda_generate_request", "UIAT-RESET-AGENDA-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_reset_agenda_handle_reply", "UIAT-RESET-AGENDA-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_reset_perform_reset_action", "UIAT-RESET-PERFORM-RESET-ACTION", 2, 0, false);
        declareFunction("uia_reset_forget_caches", "UIA-RESET-FORGET-CACHES", 1, 0, false);
        declareFunction("uiat_reset_forget_the_terms", "UIAT-RESET-FORGET-THE-TERMS", 1, 0, false);
        declareFunction("uia_reset_nl_trie", "UIA-RESET-NL-TRIE", 1, 0, false);
        declareFunction("uiat_empty_agenda_generate_request", "UIAT-EMPTY-AGENDA-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_unknown_interaction_generate_request", "UIAT-UNKNOWN-INTERACTION-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_message_hint", "UIAT-MESSAGE-HINT", 1, 0, false);
        declareFunction("uiat_message_generate_request", "UIAT-MESSAGE-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_acknowledge_message_hint", "UIAT-ACKNOWLEDGE-MESSAGE-HINT", 1, 0, false);
        declareFunction("uiat_acknowledge_message_generate_request", "UIAT-ACKNOWLEDGE-MESSAGE-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uia_act_new_acknowledge_structured_message", "UIA-ACT-NEW-ACKNOWLEDGE-STRUCTURED-MESSAGE", 2, 0, false);
        declareFunction("uia_act_new_timed_acknowledge_structured_message", "UIA-ACT-NEW-TIMED-ACKNOWLEDGE-STRUCTURED-MESSAGE", 3, 0, false);
        declareFunction("uiat_acknowledge_structured_message_hint", "UIAT-ACKNOWLEDGE-STRUCTURED-MESSAGE-HINT", 1, 0, false);
        declareFunction("uiat_acknowledge_structured_message_generate_request", "UIAT-ACKNOWLEDGE-STRUCTURED-MESSAGE-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uia_act_new_cycl_confirm", "UIA-ACT-NEW-CYCL-CONFIRM", 3, 4, false);
        declareFunction("uia_act_new_yes_no_question", "UIA-ACT-NEW-YES-NO-QUESTION", 3, 4, false);
        declareFunction("uiat_yes_no_question_generate_request", "UIAT-YES-NO-QUESTION-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_yes_no_question_handle_reply", "UIAT-YES-NO-QUESTION-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_input_box", "UIA-ACT-NEW-INPUT-BOX", 3, 1, false);
        declareFunction("uiat_input_box_generate_request", "UIAT-INPUT-BOX-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_input_box_handle_reply", "UIAT-INPUT-BOX-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_thinking_child", "UIA-ACT-NEW-THINKING-CHILD", 2, 3, false);
        declareFunction("uia_act_new_thinking_task", "UIA-ACT-NEW-THINKING-TASK", 3, 2, false);
        declareFunction("uia_act_new_thinking", "UIA-ACT-NEW-THINKING", 3, 2, false);
        declareFunction("uiat_thinking_finalize", "UIAT-THINKING-FINALIZE", 1, 0, false);
        declareFunction("uiat_thinking_hint", "UIAT-THINKING-HINT", 1, 0, false);
        declareFunction("uiat_thinking_generate_request", "UIAT-THINKING-GENERATE-REQUEST", 1, 0, false);
        declareFunction("ui_thinking_sleepingP", "UI-THINKING-SLEEPING?", 1, 0, false);
        declareFunction("uiat_thinking_interaction", "UIAT-THINKING-INTERACTION", 0, 0, false);
        declareFunction("uiat_thinking_agenda", "UIAT-THINKING-AGENDA", 0, 0, false);
        declareFunction("uiat_thinking_meta_agenda", "UIAT-THINKING-META-AGENDA", 0, 0, false);
        declareFunction("uiat_thinking_thread", "UIAT-THINKING-THREAD", 2, 0, false);
        declareFunction("uiat_thinking_start", "UIAT-THINKING-START", 1, 0, false);
        declareFunction("uiat_thinking_stop", "UIAT-THINKING-STOP", 1, 0, false);
        declareFunction("uiat_thinking_progress_summary", "UIAT-THINKING-PROGRESS-SUMMARY", 0, 1, false);
        declareFunction("uiat_thinking_note_progress_message", "UIAT-THINKING-NOTE-PROGRESS-MESSAGE", 1, 1, false);
        declareFunction("uiat_thinking_note_numeric_progress", "UIAT-THINKING-NOTE-NUMERIC-PROGRESS", 1, 1, false);
        declareFunction("uiat_thinking_note_percent_progress", "UIAT-THINKING-NOTE-PERCENT-PROGRESS", 2, 1, false);
        declareFunction("uia_act_new_unknown_term", "UIA-ACT-NEW-UNKNOWN-TERM", 4, 4, false);
        declareFunction("uiat_unknown_term_remove_genls", "UIAT-UNKNOWN-TERM-REMOVE-GENLS", 2, 0, false);
        declareFunction("uiat_unknown_term_hint", "UIAT-UNKNOWN-TERM-HINT", 1, 0, false);
        declareFunction("uiat_unknown_term_generate_request", "UIAT-UNKNOWN-TERM-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_unknown_term_comment_on_known_constraints", "UIAT-UNKNOWN-TERM-COMMENT-ON-KNOWN-CONSTRAINTS", 3, 0, false);
        declareFunction("uiat_unknown_term_formulate_constraints", "UIAT-UNKNOWN-TERM-FORMULATE-CONSTRAINTS", 3, 0, false);
        declareFunction("uiat_unknown_term_child_completed", "UIAT-UNKNOWN-TERM-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_unknown_term_best_nl_tags_for_term", "UIAT-UNKNOWN-TERM-BEST-NL-TAGS-FOR-TERM", 2, 0, false);
        declareFunction("uiat_unknown_term_construct_isa_and_genls_constraints", "UIAT-UNKNOWN-TERM-CONSTRUCT-ISA-AND-GENLS-CONSTRAINTS", 4, 0, false);
        declareFunction("uiat_unknown_term_handle_reply", "UIAT-UNKNOWN-TERM-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_disambiguate_phrase_wXplist", "UIA-ACT-NEW-DISAMBIGUATE-PHRASE-W/PLIST", 4, 0, false);
        declareFunction("uia_act_new_disambiguate_phrase", "UIA-ACT-NEW-DISAMBIGUATE-PHRASE", 4, 6, false);
        declareFunction("uiat_disambiguate_phrase_hint", "UIAT-DISAMBIGUATE-PHRASE-HINT", 1, 0, false);
        declareFunction("uiat_disambiguate_phrase_generate_request", "UIAT-DISAMBIGUATE-PHRASE-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_disambiguate_phrase_negate_terms", "UIAT-DISAMBIGUATE-PHRASE-NEGATE-TERMS", 1, 0, false);
        declareFunction("uia_disambiguate_phrase_sort_out_rejects", "UIA-DISAMBIGUATE-PHRASE-SORT-OUT-REJECTS", 1, 0, false);
        declareFunction("uia_disambiguate_phrase_forge_ahead_comment", "UIA-DISAMBIGUATE-PHRASE-FORGE-AHEAD-COMMENT", 3, 0, false);
        declareFunction("uiat_get_nl_tags", "UIAT-GET-NL-TAGS", 1, 0, false);
        declareFunction("uiat_nl_tags_for_term", "UIAT-NL-TAGS-FOR-TERM", 2, 0, false);
        declareFunction("uiat_disambiguate_phrase_handle_reply", "UIAT-DISAMBIGUATE-PHRASE-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_disambiguate_phrase_child_completed", "UIAT-DISAMBIGUATE-PHRASE-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_disambiguate_terms_info_table", "UIAT-DISAMBIGUATE-TERMS-INFO-TABLE", 4, 0, false);
        declareFunction("uiat_disambig_concept_nthfn_termP", "UIAT-DISAMBIG-CONCEPT-NTHFN-TERM?", 2, 0, false);
        declareFunction("uia_act_new_concept_disambiguator", "UIA-ACT-NEW-CONCEPT-DISAMBIGUATOR", 3, 5, false);
        declareFunction("uiat_concept_disambiguator_hint", "UIAT-CONCEPT-DISAMBIGUATOR-HINT", 1, 0, false);
        declareFunction("uiat_concept_disambiguator_generate_request", "UIAT-CONCEPT-DISAMBIGUATOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_concept_disambiguator_spawn_unknown_term", "UIAT-CONCEPT-DISAMBIGUATOR-SPAWN-UNKNOWN-TERM", 2, 0, false);
        declareFunction("uiat_concept_disambiguator_constrain_candidate_terms", "UIAT-CONCEPT-DISAMBIGUATOR-CONSTRAIN-CANDIDATE-TERMS", 2, 0, false);
        declareFunction("uiat_concept_disambiguator_constrain_one_term", "UIAT-CONCEPT-DISAMBIGUATOR-CONSTRAIN-ONE-TERM", 2, 0, false);
        declareFunction("uiat_concept_disambiguator_child_completed", "UIAT-CONCEPT-DISAMBIGUATOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uia_act_new_concept_in_sentence_disambiguator", "UIA-ACT-NEW-CONCEPT-IN-SENTENCE-DISAMBIGUATOR", 5, 4, false);
        declareFunction("uiat_concept_in_sentence_disambiguator_hint", "UIAT-CONCEPT-IN-SENTENCE-DISAMBIGUATOR-HINT", 1, 0, false);
        declareFunction("uiat_concept_in_sentence_disambiguator_generate_request", "UIAT-CONCEPT-IN-SENTENCE-DISAMBIGUATOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_concept_in_sentence_disambiguator_child_completed", "UIAT-CONCEPT-IN-SENTENCE-DISAMBIGUATOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_cis_disambiguator_report_preds", "UIAT-CIS-DISAMBIGUATOR-REPORT-PREDS", 4, 0, false);
        declareFunction("uiat_cis_disambiguator_do_cartesian_product", "UIAT-CIS-DISAMBIGUATOR-DO-CARTESIAN-PRODUCT", 2, 0, false);
        declareFunction("uiat_cis_disambiguator_get_pre_candidate_sentences", "UIAT-CIS-DISAMBIGUATOR-GET-PRE-CANDIDATE-SENTENCES", 2, 0, false);
        declareFunction("uiat_cis_disambiguator_pre_candidate_sentences_int", "UIAT-CIS-DISAMBIGUATOR-PRE-CANDIDATE-SENTENCES-INT", 5, 0, false);
        declareFunction("uiat_cis_disambiguator_parse_phrases", "UIAT-CIS-DISAMBIGUATOR-PARSE-PHRASES", 4, 0, false);
        declareFunction("uiat_cis_arg_position_constraints", "UIAT-CIS-ARG-POSITION-CONSTRAINTS", 5, 0, false);
        declareFunction("uiat_cis_disambiguator_record_phrase_parses", "UIAT-CIS-DISAMBIGUATOR-RECORD-PHRASE-PARSES", 3, 0, false);
        declareFunction("uiat_cis_disambiguator_all_arg_positions_parsed_p", "UIAT-CIS-DISAMBIGUATOR-ALL-ARG-POSITIONS-PARSED-P", 1, 0, false);
        declareFunction("uiat_cis_disambiguator_invoke_sentence_reader", "UIAT-CIS-DISAMBIGUATOR-INVOKE-SENTENCE-READER", 4, 0, false);
        declareFunction("uiat_isas_for_arg_position", "UIAT-ISAS-FOR-ARG-POSITION", 3, 0, false);
        declareFunction("replace_arg_positions_es_with_phrases_in_sentence", "REPLACE-ARG-POSITIONS-ES-WITH-PHRASES-IN-SENTENCE", 3, 0, false);
        declareFunction("nreplace_arg_position_with_phrase_in_sentence", "NREPLACE-ARG-POSITION-WITH-PHRASE-IN-SENTENCE", 4, 0, false);
        declareFunction("uia_act_new_concept_finder", "UIA-ACT-NEW-CONCEPT-FINDER", 2, 2, false);
        declareFunction("uiat_sentence_finder_templateP", "UIAT-SENTENCE-FINDER-TEMPLATE?", 2, 0, false);
        declareFunction("concept_finder_trigger_stringP", "CONCEPT-FINDER-TRIGGER-STRING?", 1, 0, false);
        declareFunction("uiat_concept_finder_generate_request", "UIAT-CONCEPT-FINDER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_concept_finder_ensure_pending", "UIAT-CONCEPT-FINDER-ENSURE-PENDING", 1, 0, false);
        declareFunction("uiat_concept_finder_child_completed", "UIAT-CONCEPT-FINDER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_concept_finder_child_invalidated", "UIAT-CONCEPT-FINDER-CHILD-INVALIDATED", 2, 0, false);
        declareFunction("uiat_concept_finder_child_rejected", "UIAT-CONCEPT-FINDER-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_concept_finder_handle_reply", "UIAT-CONCEPT-FINDER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_concept_finder_setup_wait_for_nusketch", "UIAT-CONCEPT-FINDER-SETUP-WAIT-FOR-NUSKETCH", 1, 0, false);
        declareFunction("uia_concept_finder_push", "UIA-CONCEPT-FINDER-PUSH", 2, 0, false);
        declareFunction("uia_concept_finder_pop", "UIA-CONCEPT-FINDER-POP", 1, 0, false);
        declareFunction("uia_concept_finder_peek", "UIA-CONCEPT-FINDER-PEEK", 1, 0, false);
        declareFunction("uia_concept_finder_remove", "UIA-CONCEPT-FINDER-REMOVE", 2, 0, false);
        declareFunction("uia_concept_finder_clear", "UIA-CONCEPT-FINDER-CLEAR", 1, 0, false);
        declareFunction("uia_within_concept_finderP", "UIA-WITHIN-CONCEPT-FINDER?", 1, 0, false);
        declareFunction("uia_act_new_sentence_finder", "UIA-ACT-NEW-SENTENCE-FINDER", 2, 2, false);
        declareFunction("sentence_finder_trigger_stringP", "SENTENCE-FINDER-TRIGGER-STRING?", 1, 0, false);
        declareFunction("uiat_sentence_finder_generate_request", "UIAT-SENTENCE-FINDER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_sentence_finder_child_completed", "UIAT-SENTENCE-FINDER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_sentence_finder_child_invalidated", "UIAT-SENTENCE-FINDER-CHILD-INVALIDATED", 2, 0, false);
        declareFunction("uiat_sentence_finder_child_rejected", "UIAT-SENTENCE-FINDER-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_sentence_finder_handle_reply", "UIAT-SENTENCE-FINDER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_sentence_finder_push", "UIA-SENTENCE-FINDER-PUSH", 2, 0, false);
        declareFunction("uia_sentence_finder_pop", "UIA-SENTENCE-FINDER-POP", 1, 0, false);
        declareFunction("uia_sentence_finder_peek", "UIA-SENTENCE-FINDER-PEEK", 1, 0, false);
        declareFunction("uia_sentence_finder_remove", "UIA-SENTENCE-FINDER-REMOVE", 2, 0, false);
        declareFunction("uia_sentence_finder_clear", "UIA-SENTENCE-FINDER-CLEAR", 1, 0, false);
        declareFunction("uia_within_sentence_finderP", "UIA-WITHIN-SENTENCE-FINDER?", 1, 0, false);
        declareFunction("uiat_sentence_finder_indexical_table", "UIAT-SENTENCE-FINDER-INDEXICAL-TABLE", 1, 0, false);
        declareFunction("uia_sentence_finder_indexical_table_peek", "UIA-SENTENCE-FINDER-INDEXICAL-TABLE-PEEK", 1, 0, false);
        declareFunction("file_browser_print_function_trampoline", "FILE-BROWSER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("file_browser_p", "FILE-BROWSER-P", 1, 0, false);
        new uia_tools_basic.$file_browser_p$UnaryFunction();
        declareFunction("file_browser_directory", "FILE-BROWSER-DIRECTORY", 1, 0, false);
        declareFunction("file_browser_filterfn", "FILE-BROWSER-FILTERFN", 1, 0, false);
        declareFunction("file_browser_type", "FILE-BROWSER-TYPE", 1, 0, false);
        declareFunction("file_browser_result", "FILE-BROWSER-RESULT", 1, 0, false);
        declareFunction("file_browser_path", "FILE-BROWSER-PATH", 1, 0, false);
        declareFunction("file_browser_params", "FILE-BROWSER-PARAMS", 1, 0, false);
        declareFunction("_csetf_file_browser_directory", "_CSETF-FILE-BROWSER-DIRECTORY", 2, 0, false);
        declareFunction("_csetf_file_browser_filterfn", "_CSETF-FILE-BROWSER-FILTERFN", 2, 0, false);
        declareFunction("_csetf_file_browser_type", "_CSETF-FILE-BROWSER-TYPE", 2, 0, false);
        declareFunction("_csetf_file_browser_result", "_CSETF-FILE-BROWSER-RESULT", 2, 0, false);
        declareFunction("_csetf_file_browser_path", "_CSETF-FILE-BROWSER-PATH", 2, 0, false);
        declareFunction("_csetf_file_browser_params", "_CSETF-FILE-BROWSER-PARAMS", 2, 0, false);
        declareFunction("make_file_browser", "MAKE-FILE-BROWSER", 0, 1, false);
        declareFunction("new_file_browser", "NEW-FILE-BROWSER", 3, 0, false);
        declareFunction("uia_act_new_file_browser", "UIA-ACT-NEW-FILE-BROWSER", 2, 2, false);
        declareFunction("uiat_new_file_browser", "UIAT-NEW-FILE-BROWSER", 1, 2, false);
        declareFunction("uia_act_load_file_masked", "UIA-ACT-LOAD-FILE-MASKED", 3, 0, false);
        declareFunction("uia_act_save_file_masked", "UIA-ACT-SAVE-FILE-MASKED", 3, 0, false);
        declareFunction("uiat_fb_match_anything", "UIAT-FB-MATCH-ANYTHING", 2, 0, false);
        declareFunction("uiat_fb_matching_filename", "UIAT-FB-MATCHING-FILENAME", 2, 0, false);
        declareFunction("uiat_file_browser_hint", "UIAT-FILE-BROWSER-HINT", 1, 0, false);
        declareFunction("uiat_file_browser_generate_request", "UIAT-FILE-BROWSER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_fb_constructor", "UIAT-FB-CONSTRUCTOR", 1, 0, false);
        declareFunction("uiat_fb_compute_current_state", "UIAT-FB-COMPUTE-CURRENT-STATE", 2, 0, false);
        declareFunction("uiat_fb_is_directoryP", "UIAT-FB-IS-DIRECTORY?", 1, 0, false);
        declareFunction("uiat_fb_compute_path", "UIAT-FB-COMPUTE-PATH", 3, 0, false);
        declareFunction("uiat_fb_isolate_path", "UIAT-FB-ISOLATE-PATH", 2, 0, false);
        declareFunction("uiat_file_browser_handle_reply", "UIAT-FILE-BROWSER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_fb_ensure_correct_filename", "UIAT-FB-ENSURE-CORRECT-FILENAME", 2, 0, false);
        declareFunction("uia_act_new_sentence_cloner", "UIA-ACT-NEW-SENTENCE-CLONER", 4, 1, false);
        declareFunction("header_string_for_clone_type", "HEADER-STRING-FOR-CLONE-TYPE", 1, 0, false);
        declareFunction("button_text_for_clone_type", "BUTTON-TEXT-FOR-CLONE-TYPE", 1, 0, false);
        declareFunction("uia_act_new_sentence_cloner_widget", "UIA-ACT-NEW-SENTENCE-CLONER-WIDGET", 3, 1, false);
        declareFunction("uiat_sentence_cloner_hint", "UIAT-SENTENCE-CLONER-HINT", 1, 0, false);
        declareFunction("uiat_sentence_cloner_generate_request", "UIAT-SENTENCE-CLONER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_sentence_cloner_sort_info", "UIAT-SENTENCE-CLONER-SORT-INFO", 2, 0, false);
        declareFunction("uiat_sentence_cloner_sorter", "UIAT-SENTENCE-CLONER-SORTER", 2, 0, false);
        declareFunction("uiat_sentence_cloner_add_paraphrases", "UIAT-SENTENCE-CLONER-ADD-PARAPHRASES", 2, 0, false);
        declareFunction("uiat_sentence_cloner_child_completed", "UIAT-SENTENCE-CLONER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_sentence_cloner_handle_reply", "UIAT-SENTENCE-CLONER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_sentence_cloner_handle_answer_reply", "UIAT-SENTENCE-CLONER-HANDLE-ANSWER-REPLY", 2, 0, false);
        declareFunction("uiat_sentence_cloner_handle_formula_answer_reply", "UIAT-SENTENCE-CLONER-HANDLE-FORMULA-ANSWER-REPLY", 2, 0, false);
        declareFunction("uiat_sentence_cloner_editable_arg_info", "UIAT-SENTENCE-CLONER-EDITABLE-ARG-INFO", 3, 0, false);
        declareFunction("uiat_sentence_cloner_arg_type", "UIAT-SENTENCE-CLONER-ARG-TYPE", 4, 0, false);
        declareFunction("uiat_arg_type_constraint_pred_for_sentence", "UIAT-ARG-TYPE-CONSTRAINT-PRED-FOR-SENTENCE", 1, 0, false);
        declareFunction("uiat_arg_type_warning_string_for_sentence", "UIAT-ARG-TYPE-WARNING-STRING-FOR-SENTENCE", 2, 0, false);
        declareFunction("uiat_arg_type_warning_string_for_pred", "UIAT-ARG-TYPE-WARNING-STRING-FOR-PRED", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_tools_basic_file() {
        defparameter("*UIAT-THINKING-INTERACTION*", NIL);
        deflexical("*CONCEPT-IN-SENTENCE-DISAMBIGUATOR-METHOD*", $CARTESIAN_PRODUCT);
        deflexical("*UIAT-DEFAULT-TRIGGER-STRING-FOR-FINDING*", $str_alt203$___);
        deflexical("*CONCEPT-FINDER-TRIGGER-STRINGS*", list($uiat_default_trigger_string_for_finding$.getGlobalValue()));
        deflexical("*SENTENCE-FINDER-TRIGGER-STRINGS*", list($uiat_default_trigger_string_for_finding$.getGlobalValue()));
        defconstant("*DTP-FILE-BROWSER*", FILE_BROWSER);
        defparameter("*UIAT-PPH-OUTPUT-LIST*", NIL);
        return NIL;
    }

    public static final SubLObject setup_uia_tools_basic_file() {
                uia_tool_declaration.declare_uia_tool($RESET_AGENDA, $list_alt1);
        uia_tool_declaration.declare_uia_tool($EMPTY_AGENDA, $list_alt14);
        uia_tool_declaration.declare_uia_tool($UNKNOWN_INTERACTION, $list_alt16);
        uia_tool_declaration.declare_uia_tool($MESSAGE, $list_alt21);
        uia_tool_declaration.declare_uia_tool($ACKNOWLEDGE_MESSAGE, $list_alt28);
        uia_tool_declaration.declare_uia_tool($ACKNOWLEDGE_STRUCTURED_MESSAGE, $list_alt32);
        uia_tool_declaration.declare_uia_tool($YES_NO_QUESTION, $list_alt37);
        uia_tool_declaration.declare_uia_tool($INPUT_BOX, $list_alt50);
        uia_tool_declaration.declare_uia_tool($THINKING, $list_alt60);
        uia_tool_declaration.declare_uia_tool($UNKNOWN_TERM, $list_alt82);
        uia_tool_declaration.declare_uia_tool($DISAMBIGUATE_PHRASE, $list_alt112);
        uia_tool_declaration.declare_uia_tool($CONCEPT_DISAMBIGUATOR, $list_alt158);
        uia_tool_declaration.declare_uia_tool($CONCEPT_IN_SENTENCE_DISAMBIGUATOR, $list_alt172);
        uia_tool_declaration.declare_uia_tool($CONCEPT_FINDER, $list_alt200);
        uia_tool_declaration.declare_uia_tool($SENTENCE_FINDER, $list_alt219);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_file_browser$.getGlobalValue(), symbol_function(FILE_BROWSER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(FILE_BROWSER_DIRECTORY, _CSETF_FILE_BROWSER_DIRECTORY);
        def_csetf(FILE_BROWSER_FILTERFN, _CSETF_FILE_BROWSER_FILTERFN);
        def_csetf(FILE_BROWSER_TYPE, _CSETF_FILE_BROWSER_TYPE);
        def_csetf(FILE_BROWSER_RESULT, _CSETF_FILE_BROWSER_RESULT);
        def_csetf(FILE_BROWSER_PATH, _CSETF_FILE_BROWSER_PATH);
        def_csetf(FILE_BROWSER_PARAMS, _CSETF_FILE_BROWSER_PARAMS);
        identity(FILE_BROWSER);
        uia_tool_declaration.declare_uia_tool($FILE_BROWSER, $list_alt254);
        uia_tool_declaration.declare_uia_tool($SENTENCE_CLONER, $list_alt278);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $RESET_AGENDA = makeKeyword("RESET-AGENDA");

    static private final SubLList $list_alt1 = list($NAME, makeString("Reset Agenda"), makeKeyword("GENERATION-REQUEST-METHOD"), makeSymbol("UIAT-RESET-AGENDA-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-RESET-AGENDA-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycResetAgendaTool")));





    static private final SubLList $list_alt4 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("TEMP-PLIST"));





    private static final SubLSymbol $CLEAR_MEMOIZATION = makeKeyword("CLEAR-MEMOIZATION");

    private static final SubLSymbol $RESET_NL_TRIE = makeKeyword("RESET-NL-TRIE");

    private static final SubLSymbol $REJECT_ALL = makeKeyword("REJECT-ALL");

    private static final SubLSymbol $RESTART_TOPIC = makeKeyword("RESTART-TOPIC");

    private static final SubLSymbol $RESTART_N_FORGET = makeKeyword("RESTART-N-FORGET");

    private static final SubLSymbol $COMPLETE_RESTART = makeKeyword("COMPLETE-RESTART");



    static private final SubLList $list_alt14 = list($NAME, makeString("Empty Agenda"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-EMPTY-AGENDA-GENERATE-REQUEST"));



    static private final SubLList $list_alt16 = list($NAME, makeString("Unknown Interaction"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-UNKNOWN-INTERACTION-GENERATE-REQUEST"));









    static private final SubLList $list_alt21 = list($NAME, makeString("Message"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-MESSAGE-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-MESSAGE-GENERATE-REQUEST"));

    static private final SubLList $list_alt22 = list(makeSymbol("MESSAGE"), makeSymbol("&OPTIONAL"), makeSymbol("SECS"));

    static private final SubLString $str_alt23$Message____A = makeString("Message : ~A");

    static private final SubLList $list_alt24 = list(makeSymbol("MESSAGE"), makeSymbol("&OPTIONAL"), makeSymbol("REFRESH"));







    static private final SubLList $list_alt28 = list($NAME, makeString("Acknowledge Message"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-ACKNOWLEDGE-MESSAGE-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-ACKNOWLEDGE-MESSAGE-GENERATE-REQUEST"));

    static private final SubLString $str_alt29$Acknowledge____A = makeString("Acknowledge : ~A");

    static private final SubLList $list_alt30 = list(makeSymbol("MESSAGE-STRUCT"), makeSymbol("&OPTIONAL"), makeSymbol("REFRESH"));

    private static final SubLSymbol $ACKNOWLEDGE_STRUCTURED_MESSAGE = makeKeyword("ACKNOWLEDGE-STRUCTURED-MESSAGE");

    static private final SubLList $list_alt32 = list($NAME, makeString("Acknowledge Message"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-ACKNOWLEDGE-STRUCTURED-MESSAGE-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-ACKNOWLEDGE-STRUCTURED-MESSAGE-GENERATE-REQUEST"));



    static private final SubLString $str_alt34$Acknowledge_Message_for_ = makeString("Acknowledge Message for ");

    private static final SubLSymbol $MESSAGE_STRUCT = makeKeyword("MESSAGE-STRUCT");

    private static final SubLSymbol $YES_NO_QUESTION = makeKeyword("YES-NO-QUESTION");

    static private final SubLList $list_alt37 = list($NAME, makeString("Yes/No Question"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-YES-NO-QUESTION-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-YES-NO-QUESTION-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycYesNoQuestionTool")));

    static private final SubLString $str_alt38$Is_the_following_sentence_true_ = makeString("Is the following sentence true?");

    static private final SubLList $list_alt39 = list(makeSymbol("QUESTION"), makeSymbol("&OPTIONAL"), makeSymbol("CALLBACK"), makeSymbol("UNKNOWN"), makeSymbol("INDEXICAL-TABLE"), makeSymbol("CYCL"));



    private static final SubLSymbol $CALLBACK = makeKeyword("CALLBACK");

    private static final SubLSymbol $UNKNOWN_ALLOWED = makeKeyword("UNKNOWN-ALLOWED");







    static private final SubLList $list_alt46 = list(makeSymbol("&KEY"), makeSymbol("ANSWER"));

    static private final SubLList $list_alt47 = list(makeKeyword("ANSWER"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $INPUT_BOX = makeKeyword("INPUT-BOX");

    static private final SubLList $list_alt50 = list($NAME, makeString("Input Box"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-INPUT-BOX-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-INPUT-BOX-HANDLE-REPLY"));



    static private final SubLList $list_alt52 = list(makeSymbol("PROMPT"));

    static private final SubLString $str_alt53$ = makeString("");



    private static final SubLSymbol $LAUNCH = makeKeyword("LAUNCH");

    static private final SubLList $list_alt56 = list(makeSymbol("&KEY"), makeSymbol("PROMPT"), makeSymbol("DEFAULT"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt57 = list(makeKeyword("PROMPT"), makeKeyword("DEFAULT"), $MODE);





    static private final SubLList $list_alt60 = list($NAME, makeString("Thinking"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-THINKING-HINT"), makeKeyword("FINALIZE-METHOD"), makeSymbol("UIAT-THINKING-FINALIZE"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-THINKING-GENERATE-REQUEST"));

    static private final SubLString $$$Thinking = makeString("Thinking");

    private static final SubLSymbol $MY_RESULT_WILL_BE = makeKeyword("MY-RESULT-WILL-BE");

    static private final SubLString $$$UIA_Thinking = makeString("UIA Thinking");



    private static final SubLSymbol $THINKING_TASK = makeKeyword("THINKING-TASK");





    static private final SubLString $str_alt68$Currently_Inactive_ = makeString("Currently Inactive ");

    static private final SubLString $str_alt69$____A = makeString(" : ~A");

    static private final SubLString $$$Sleeping = makeString("Sleeping");





    private static final SubLSymbol UIAT_THINKING_THREAD = makeSymbol("UIAT-THINKING-THREAD");







    private static final SubLSymbol $RUN_TIME = makeKeyword("RUN-TIME");







    private static final SubLSymbol $UNKNOWN_TERM = makeKeyword("UNKNOWN-TERM");

    static private final SubLList $list_alt82 = list(new SubLObject[]{ $NAME, makeString("Unknown Term"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-UNKNOWN-TERM-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-UNKNOWN-TERM-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-UNKNOWN-TERM-CHILD-COMPLETED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-UNKNOWN-TERM-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycUnknownTermTool")) });

    static private final SubLList $list_alt83 = cons(makeSymbol("THIS-COL"), makeSymbol("OTHERS"));

    static private final SubLSymbol $sym84$SPEC_ = makeSymbol("SPEC?");

    static private final SubLList $list_alt85 = list(makeSymbol("PHRASE"), makeSymbol("&REST"), makeSymbol("GOBBLE"));

    static private final SubLString $str_alt86$Determine_how_to_handle_unidentif = makeString("Determine how to handle unidentified concept: \"");



    static private final SubLString $str_alt88$_ = makeString("\"");

    static private final SubLList $list_alt89 = list(makeSymbol("PHRASE"), makeSymbol("NL-TAGS"), makeSymbol("&OPTIONAL"), makeSymbol("CONTEXT"), makeSymbol("SUPPRESSORS"), makeSymbol("ISAS"), makeSymbol("GENLS"));

    private static final SubLSymbol $NL_TAGS = makeKeyword("NL-TAGS");









    private static final SubLSymbol $SUPPRESSORS = makeKeyword("SUPPRESSORS");

    private static final SubLSymbol $COMMENTED_ON_SENTENCES = makeKeyword("COMMENTED-ON-SENTENCES");



    static private final SubLString $str_alt98$From_context__I_assume_that_ = makeString("From context, I assume that:");

    static private final SubLString $str_alt99$___ = makeString(" = ");



    private static final SubLSymbol $ISA_SENTENCES = makeKeyword("ISA-SENTENCES");

    private static final SubLSymbol $GENLS_SENTENCES = makeKeyword("GENLS-SENTENCES");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));





    static private final SubLList $list_alt107 = list(makeSymbol("&KEY"), makeSymbol("PHRASE"), makeSymbol("MODE"));

    static private final SubLList $list_alt108 = list(makeKeyword("PHRASE"), $MODE);

    private static final SubLSymbol $AUTO_CREATE = makeKeyword("AUTO-CREATE");



    private static final SubLSymbol $DISAMBIGUATE_PHRASE = makeKeyword("DISAMBIGUATE-PHRASE");

    static private final SubLList $list_alt112 = list(new SubLObject[]{ $NAME, makeString("Phrase Disambiguator"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-DISAMBIGUATE-PHRASE-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-DISAMBIGUATE-PHRASE-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-DISAMBIGUATE-PHRASE-HANDLE-REPLY"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-DISAMBIGUATE-PHRASE-CHILD-COMPLETED"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycPhraseDisambiguator")) });



    private static final SubLSymbol $CLARIFY_LINKS = makeKeyword("CLARIFY-LINKS");

    private static final SubLSymbol $INDISTINGUISHED = makeKeyword("INDISTINGUISHED");

    private static final SubLSymbol $REJECTS = makeKeyword("REJECTS");







    static private final SubLList $list_alt120 = list(makeSymbol("PHRASE"));

    static private final SubLString $str_alt121$Select_meaning_for_phrase___S = makeString("Select meaning for phrase: ~S");





    private static final SubLSymbol $NEGATE_TERMS = makeKeyword("NEGATE-TERMS");

    private static final SubLSymbol $CHOSEN_TERM = makeKeyword("CHOSEN-TERM");

    private static final SubLSymbol $REJECTED_TERMS = makeKeyword("REJECTED-TERMS");

    private static final SubLSymbol $TERM_INFO_TABLE = makeKeyword("TERM-INFO-TABLE");

    private static final SubLSymbol $SHOW_CLARIFY_LINKS = makeKeyword("SHOW-CLARIFY-LINKS");

    private static final SubLSymbol $SHOW_COMPARISON_LINKS = makeKeyword("SHOW-COMPARISON-LINKS");

    private static final SubLSymbol MAKE_NEGATION = makeSymbol("MAKE-NEGATION");

    static private final SubLList $list_alt131 = list(makeSymbol("LIKELY"), makeSymbol("UNLIKELY"));

    static private final SubLString $str_alt132$I_know_what__S_means_ = makeString("I know what ~S means.");

    static private final SubLString $str_alt133$I_assume_you_meant__S_when_saying = makeString("I assume you meant ~S when saying ~S.");

    static private final SubLList $list_alt134 = list($TERM);

    static private final SubLList $list_alt135 = list(makeSymbol("&KEY"), makeSymbol("CHOSEN-TERM"));

    static private final SubLList $list_alt136 = list(makeKeyword("CHOSEN-TERM"));

    public static final SubLObject $$not = constant_handles.reader_make_constant_shell(makeString("not"));

    private static final SubLSymbol $MAKE_SIMILAR = makeKeyword("MAKE-SIMILAR");





    static private final SubLList $list_alt141 = list(makeSymbol("&KEY"), makeSymbol("PHRASE"));

    static private final SubLList $list_alt142 = list(makeKeyword("PHRASE"));



    static private final SubLList $list_alt144 = list(makeSymbol("&KEY"), makeSymbol("TERM1"), makeSymbol("TERM2"));

    static private final SubLList $list_alt145 = list(makeKeyword("TERM1"), makeKeyword("TERM2"));





    private static final SubLSymbol $CONCEPT_COMPARATOR = makeKeyword("CONCEPT-COMPARATOR");

    private static final SubLSymbol $CONCEPT_FINDER = makeKeyword("CONCEPT-FINDER");



    private static final SubLSymbol $SENTENCE_CLONER = makeKeyword("SENTENCE-CLONER");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLList $list_alt154 = list(makeSymbol("TERM"), makeSymbol("PHRASE"), makeSymbol("&OPTIONAL"), makeSymbol("TYPE"), makeSymbol("TYPE-PHRASE"));

    static private final SubLString $str_alt155$the_term_you_were_just_talking_ab = makeString("the term you were just talking about");

    public static final SubLObject $$TheNthFn = constant_handles.reader_make_constant_shell(makeString("TheNthFn"));

    private static final SubLSymbol $CONCEPT_DISAMBIGUATOR = makeKeyword("CONCEPT-DISAMBIGUATOR");

    static private final SubLList $list_alt158 = list(new SubLObject[]{ $NAME, makeString("Concept Disambiguator"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-CONCEPT-DISAMBIGUATOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-CONCEPT-DISAMBIGUATOR-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-CONCEPT-DISAMBIGUATOR-CHILD-COMPLETED"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycConceptDisambiguatorTool")) });

    private static final SubLSymbol $CONSTRAINT_FUNC = makeKeyword("CONSTRAINT-FUNC");







    static private final SubLString $str_alt163$Select_meaning_for_concept__ = makeString("Select meaning for concept: ");



    static private final SubLString $str_alt165$Reading__S = makeString("Reading ~S");

    private static final SubLSymbol UIA_PHRASE_CANDIDATE_TERMS = makeSymbol("UIA-PHRASE-CANDIDATE-TERMS");

    static private final SubLString $str_alt167$The_intepretation__ = makeString("The intepretation '");

    static private final SubLString $str_alt168$__can_be_safely_eliminated_ = makeString("' can be safely eliminated.");

    static private final SubLList $list_alt169 = list(makeSymbol("PHRASE"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATE-TERMS"));

    private static final SubLSymbol $SENTENCE_FINDER = makeKeyword("SENTENCE-FINDER");

    private static final SubLSymbol $CONCEPT_IN_SENTENCE_DISAMBIGUATOR = makeKeyword("CONCEPT-IN-SENTENCE-DISAMBIGUATOR");

    static private final SubLList $list_alt172 = list($NAME, makeString("Concept-in-Sentence Disambiguator"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-CONCEPT-IN-SENTENCE-DISAMBIGUATOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-CONCEPT-IN-SENTENCE-DISAMBIGUATOR-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-CONCEPT-IN-SENTENCE-DISAMBIGUATOR-CHILD-COMPLETED"));

    private static final SubLSymbol $CARTESIAN_PRODUCT = makeKeyword("CARTESIAN-PRODUCT");

    private static final SubLSymbol $NEGATED = makeKeyword("NEGATED");

    private static final SubLSymbol $ISAS_ES = makeKeyword("ISAS-ES");

    private static final SubLSymbol $GENLS_ES = makeKeyword("GENLS-ES");

    static private final SubLList $list_alt177 = list(makeSymbol("PHRASES"), makeSymbol("ARG-POSITIONS-ES"), makeSymbol("SENTENCE"));

    private static final SubLSymbol $SENTENCE_FORCE = makeKeyword("SENTENCE-FORCE");

    private static final SubLSymbol $CONCEPT_FINDERS = makeKeyword("CONCEPT-FINDERS");

    private static final SubLSymbol $SENTENCES_TO_PARSE = makeKeyword("SENTENCES-TO-PARSE");

    private static final SubLSymbol $MODIFIED_SENTENCE = makeKeyword("MODIFIED-SENTENCE");

    private static final SubLSymbol $CANDIDATE_SENTENCES = makeKeyword("CANDIDATE-SENTENCES");

    private static final SubLSymbol $PHRASES_TO_PARSE = makeKeyword("PHRASES-TO-PARSE");

    private static final SubLSymbol $GOOD_ARG_POSITIONS_ES = makeKeyword("GOOD-ARG-POSITIONS-ES");

    public static final SubLObject $$CycLSentence_Assertible = constant_handles.reader_make_constant_shell(makeString("CycLSentence-Assertible"));

    private static final SubLSymbol $SENTENCE_READER = makeKeyword("SENTENCE-READER");

    private static final SubLSymbol $WHOLE_SENTENCE = makeKeyword("WHOLE-SENTENCE");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    static private final SubLString $str_alt190$Replaced_a_pred_in_sentence_clone = makeString("Replaced a pred in sentence cloner");

    static private final SubLString $str_alt191$While_in_the_sentence_cloner__I_d = makeString("While in the sentence cloner, I defied the warning about not replacing predicates and tried to replace ~%~S~%~% with ~%~%~S~%in the sentence ~%~%~S~%");

    static private final SubLString $str_alt192$Sorry__I_couldn_t_make_sense_of_s = makeString("Sorry, I couldn't make sense of substituting ~a into ~a.");

    private static final SubLSymbol $PARSE_DICTIONARY = makeKeyword("PARSE-DICTIONARY");



    public static final SubLObject $$CharacterString = constant_handles.reader_make_constant_shell(makeString("CharacterString"));

    static private final SubLList $list_alt196 = cons(makeSymbol("PATH"), makeSymbol("ARGNUM"));

    static private final SubLList $list_alt197 = list(ZERO_INTEGER);

    public static final SubLObject $$TheResultOfParsing = constant_handles.reader_make_constant_shell(makeString("TheResultOfParsing"));

    public static final SubLObject $$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));

    static private final SubLList $list_alt200 = list(new SubLObject[]{ $NAME, makeString("Concept Finder"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-CONCEPT-FINDER-CHILD-COMPLETED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-CONCEPT-FINDER-CHILD-INVALIDATED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-CONCEPT-FINDER-CHILD-REJECTED"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-CONCEPT-FINDER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-CONCEPT-FINDER-HANDLE-REPLY") });

    static private final SubLString $str_alt201$Concept_Finder_launched_for_Sente = makeString("Concept Finder launched for Sentence template: ~S");

    public static final SubLObject $$CycLSentence = constant_handles.reader_make_constant_shell(makeString("CycLSentence"));

    static private final SubLString $str_alt203$___ = makeString("???");

    private static final SubLSymbol $NUSKETCH = makeKeyword("NUSKETCH");

    static private final SubLString $str_alt205$Sorry__somehow_nuSketch_and_KRAKE = makeString("Sorry, somehow nuSketch and KRAKEN are out of sync; please retry.");

    static private final SubLList $list_alt206 = list(makeSymbol("&KEY"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt207 = list($MODE);

    static private final SubLList $list_alt208 = list(makeSymbol("&KEY"), makeSymbol("PHRASE"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")), makeSymbol("PARSE-TEMPLATE"));

    static private final SubLList $list_alt209 = list(makeKeyword("PHRASE"), $MODE, makeKeyword("PARSE-TEMPLATE"));

    private static final SubLSymbol $WAIT_FOR_NUSKETCH = makeKeyword("WAIT-FOR-NUSKETCH");

    private static final SubLSymbol $CATCH = makeKeyword("CATCH");

    static private final SubLList $list_alt212 = list(makeSymbol("&KEY"), makeSymbol("TERM"));

    static private final SubLString $$$KRAKEN = makeString("KRAKEN");

    static private final SubLString $str_alt214$Please_select_the_glyph_you_want_ = makeString("Please select the glyph you want to send to KRAKEN.");

    private static final SubLSymbol $ALL_GLYPHS = makeKeyword("ALL-GLYPHS");

    private static final SubLSymbol UIA_COA_NUSKETCH_WAITER_THINKING_THREAD = makeSymbol("UIA-COA-NUSKETCH-WAITER-THINKING-THREAD");

    static private final SubLString $str_alt217$Please_make_your_selection_on_nuS = makeString("Please make your selection on nuSketch -- click [Reject] to back out if you came here by accident.");

    private static final SubLSymbol $LAST_CONCEPT_FINDER = makeKeyword("LAST-CONCEPT-FINDER");

    static private final SubLList $list_alt219 = list(new SubLObject[]{ $NAME, makeString("Sentence Finder"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-SENTENCE-FINDER-CHILD-COMPLETED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-SENTENCE-FINDER-CHILD-INVALIDATED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-SENTENCE-FINDER-CHILD-REJECTED"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-SENTENCE-FINDER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-SENTENCE-FINDER-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycSentenceFinder")) });

    private static final SubLSymbol $KNOWLEDGE_SCRAPBOOK = makeKeyword("KNOWLEDGE-SCRAPBOOK");

    private static final SubLSymbol $ONTOLOGY_BROWSER = makeKeyword("ONTOLOGY-BROWSER");

    static private final SubLList $list_alt222 = list(makeSymbol("&KEY"), makeSymbol("TEXT"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt223 = list($TEXT, $MODE);

    static private final SubLList $list_alt224 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"));

    static private final SubLList $list_alt225 = list(makeKeyword("SENTENCE"));

    private static final SubLSymbol $LAST_SENTENCE_FINDER = makeKeyword("LAST-SENTENCE-FINDER");

    private static final SubLSymbol FILE_BROWSER = makeSymbol("FILE-BROWSER");

    private static final SubLSymbol FILE_BROWSER_P = makeSymbol("FILE-BROWSER-P");

    static private final SubLList $list_alt229 = list(makeSymbol("DIRECTORY"), makeSymbol("FILTERFN"), makeSymbol("TYPE"), makeSymbol("RESULT"), makeSymbol("PATH"), makeSymbol("PARAMS"));

    static private final SubLList $list_alt230 = list(makeKeyword("DIRECTORY"), makeKeyword("FILTERFN"), $TYPE, makeKeyword("RESULT"), $PATH, makeKeyword("PARAMS"));

    static private final SubLList $list_alt231 = list(makeSymbol("FILE-BROWSER-DIRECTORY"), makeSymbol("FILE-BROWSER-FILTERFN"), makeSymbol("FILE-BROWSER-TYPE"), makeSymbol("FILE-BROWSER-RESULT"), makeSymbol("FILE-BROWSER-PATH"), makeSymbol("FILE-BROWSER-PARAMS"));

    static private final SubLList $list_alt232 = list(makeSymbol("_CSETF-FILE-BROWSER-DIRECTORY"), makeSymbol("_CSETF-FILE-BROWSER-FILTERFN"), makeSymbol("_CSETF-FILE-BROWSER-TYPE"), makeSymbol("_CSETF-FILE-BROWSER-RESULT"), makeSymbol("_CSETF-FILE-BROWSER-PATH"), makeSymbol("_CSETF-FILE-BROWSER-PARAMS"));



    private static final SubLSymbol FILE_BROWSER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FILE-BROWSER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol FILE_BROWSER_DIRECTORY = makeSymbol("FILE-BROWSER-DIRECTORY");

    public static final SubLSymbol _CSETF_FILE_BROWSER_DIRECTORY = makeSymbol("_CSETF-FILE-BROWSER-DIRECTORY");

    private static final SubLSymbol FILE_BROWSER_FILTERFN = makeSymbol("FILE-BROWSER-FILTERFN");

    public static final SubLSymbol _CSETF_FILE_BROWSER_FILTERFN = makeSymbol("_CSETF-FILE-BROWSER-FILTERFN");

    private static final SubLSymbol FILE_BROWSER_TYPE = makeSymbol("FILE-BROWSER-TYPE");

    public static final SubLSymbol _CSETF_FILE_BROWSER_TYPE = makeSymbol("_CSETF-FILE-BROWSER-TYPE");

    private static final SubLSymbol FILE_BROWSER_RESULT = makeSymbol("FILE-BROWSER-RESULT");

    public static final SubLSymbol _CSETF_FILE_BROWSER_RESULT = makeSymbol("_CSETF-FILE-BROWSER-RESULT");

    private static final SubLSymbol FILE_BROWSER_PATH = makeSymbol("FILE-BROWSER-PATH");

    public static final SubLSymbol _CSETF_FILE_BROWSER_PATH = makeSymbol("_CSETF-FILE-BROWSER-PATH");

    private static final SubLSymbol FILE_BROWSER_PARAMS = makeSymbol("FILE-BROWSER-PARAMS");

    public static final SubLSymbol _CSETF_FILE_BROWSER_PARAMS = makeSymbol("_CSETF-FILE-BROWSER-PARAMS");



    private static final SubLSymbol $FILTERFN = makeKeyword("FILTERFN");







    static private final SubLString $str_alt252$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol $FILE_BROWSER = makeKeyword("FILE-BROWSER");

    static private final SubLList $list_alt254 = list($NAME, makeString("File Browser"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-FILE-BROWSER-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-FILE-BROWSER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-FILE-BROWSER-HANDLE-REPLY"));

    private static final SubLSymbol UIAT_FB_MATCH_ANYTHING = makeSymbol("UIAT-FB-MATCH-ANYTHING");

    private static final SubLSymbol UIAT_FB_MATCHING_FILENAME = makeSymbol("UIAT-FB-MATCHING-FILENAME");



    static private final SubLList $list_alt259 = list(makeSymbol("FB"));

    static private final SubLString $$$Load = makeString("Load");

    static private final SubLString $$$Save = makeString("Save");

    static private final SubLString $str_alt262$___ = makeString(" : ");

    private static final SubLSymbol $FB_STATE = makeKeyword("FB-STATE");

    private static final SubLSymbol $FILES = makeKeyword("FILES");

    public static final SubLSymbol $kw266$HAS_PARENT_ = makeKeyword("HAS-PARENT?");

    private static final SubLSymbol UIAT_NEW_FILE_BROWSER = makeSymbol("UIAT-NEW-FILE-BROWSER");



    static private final SubLString $str_alt269$___ = makeString("/..");

    static private final SubLString $str_alt270$_ = makeString("/");

    private static final SubLSymbol $DIR_CHOICE = makeKeyword("DIR-CHOICE");

    static private final SubLList $list_alt272 = list(makeSymbol("&KEY"), makeSymbol("DIRECTORY"));

    static private final SubLList $list_alt273 = list(makeKeyword("DIRECTORY"));

    private static final SubLSymbol $FILE_CHOICE = makeKeyword("FILE-CHOICE");

    static private final SubLList $list_alt275 = list(makeSymbol("&KEY"), makeSymbol("FILE"));

    static private final SubLList $list_alt276 = list($FILE);



    static private final SubLList $list_alt278 = list(new SubLObject[]{ $NAME, makeString("Sentence Cloner"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-SENTENCE-CLONER-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-SENTENCE-CLONER-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-SENTENCE-CLONER-CHILD-COMPLETED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-SENTENCE-CLONER-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycSentenceCloner")) });

    private static final SubLSymbol $UNEDITABLE_ARG_POSITIONS = makeKeyword("UNEDITABLE-ARG-POSITIONS");

    static private final SubLString $str_alt280$Replace_as_many_of_the_terms_as_y = makeString("Replace as many of the terms as you wish to ask me a similar question.\nIf you replace a term with a question word (e.g. \'what\', \'who\', \'where\'), I will find answers that fit for that term.");

    static private final SubLString $str_alt281$Replace_as_many_of_the_terms_as_y = makeString("Replace as many of the terms as you wish to see a similar sentence.");



    static private final SubLString $str_alt283$Replace_as_many_of_the_terms_as_y = makeString("Replace as many of the terms as you wish to tell me a similar fact.");

    static private final SubLString $$$Ask_Similar_Question = makeString("Ask Similar Question");

    static private final SubLString $$$Similar_Sentence = makeString("Similar Sentence");

    static private final SubLString $$$Similar_Fact = makeString("Similar Fact");

    static private final SubLString $$$Continue = makeString("Continue");

    static private final SubLList $list_alt288 = list(makeSymbol("CYCL-SENTENCE"), makeSymbol("CLONE-TYPE"), makeSymbol("HEADER-STRING"), makeSymbol("BUTTON-TEXT"));



    public static final SubLSymbol $kw290$NEGATED_ = makeKeyword("NEGATED?");



    static private final SubLString $str_alt292$Sorry__I_m_not_sure_which_argumen = makeString("Sorry, I'm not sure which arguments to replace in this sentence.");



    private static final SubLSymbol $CLONE_TYPE = makeKeyword("CLONE-TYPE");

    private static final SubLSymbol $HEADER_STRING = makeKeyword("HEADER-STRING");

    private static final SubLSymbol $BUTTON_TEXT = makeKeyword("BUTTON-TEXT");

    private static final SubLSymbol $INDEXICAL_STRINGS = makeKeyword("INDEXICAL-STRINGS");

    private static final SubLSymbol $EDITABLE_ARG_INFO = makeKeyword("EDITABLE-ARG-INFO");

    private static final SubLSymbol $SENTENCE_PARAPHRASE = makeKeyword("SENTENCE-PARAPHRASE");

    private static final SubLSymbol UIAT_SENTENCE_CLONER_SORTER = makeSymbol("UIAT-SENTENCE-CLONER-SORTER");



    static private final SubLList $list_alt302 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"), makeSymbol("CLONE-TYPE"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt303 = list(makeKeyword("SENTENCE"), makeKeyword("CLONE-TYPE"), $MODE);



    private static final SubLSymbol $FORMULA_ANSWER = makeKeyword("FORMULA-ANSWER");

    static private final SubLList $list_alt306 = list(makeSymbol("ORIGINAL-SENTENCE"), makeSymbol("CLONE-TYPE"), makeSymbol("HEADER-STRING"), makeSymbol("BUTTON-TEXT"));

    static private final SubLList $list_alt307 = list(makeSymbol("&KEY"), makeSymbol("ARG-POSITION-PHRASE-PAIRS"), makeSymbol("NEGATED"));

    static private final SubLList $list_alt308 = list(makeKeyword("ARG-POSITION-PHRASE-PAIRS"), makeKeyword("NEGATED"));

    private static final SubLSymbol $ARG_POSITION_PHRASE_PAIRS = makeKeyword("ARG-POSITION-PHRASE-PAIRS");

    private static final SubLSymbol $CLEARED_ARG_POSITIONS = makeKeyword("CLEARED-ARG-POSITIONS");

    static private final SubLList $list_alt311 = list(makeSymbol("ARG-POSITION"), makeSymbol("NEW-ARG-PHRASE"));

    static private final SubLString $str_alt312$_ = makeString("?");

    static private final SubLString $$$what = makeString("what");

    static private final SubLString $str_alt314$Sorry__I_can_t_handle_replacing_a = makeString("Sorry, I can't handle replacing a term and a sentence at the same time.  Try replacing one at a time.");

    static private final SubLList $list_alt315 = list(makeSymbol("&KEY"), makeSymbol("FORMULA"));

    static private final SubLList $list_alt316 = list(makeKeyword("FORMULA"));





    static private final SubLList $list_alt319 = list($TERM, makeKeyword("PREDICATE"), makeKeyword("SENTENCE"));

    static private final SubLList $list_alt320 = list(makeSymbol("TYPE"), makeSymbol("SUB-ARG-POSITION"));



    public static final SubLObject $$Predicate = constant_handles.reader_make_constant_shell(makeString("Predicate"));



    public static final SubLObject $$TruthFunction = constant_handles.reader_make_constant_shell(makeString("TruthFunction"));

    private static final SubLSymbol $NON_PREDICATE_TRUTH_FUNCTION = makeKeyword("NON-PREDICATE-TRUTH-FUNCTION");

    static private final SubLString $str_alt326$QuantificationalRuleMacroPredicat = makeString("QuantificationalRuleMacroPredicate-Canonical");

    static private final SubLString $$$QuantifiedBinaryPredicateFn = makeString("QuantifiedBinaryPredicateFn");

    static private final SubLString $$$this_relation = makeString("this relation");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_uia_tools_basic_file();
    }

    @Override
    public void initializeVariables() {
        init_uia_tools_basic_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_uia_tools_basic_file();
    }
}

