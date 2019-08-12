/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-TOOLS-INTRODUCTION
 *  source file: /cyc/top/cycl/uia-tools-introduction.lisp
 *  created:     2019/07/03 17:37:57
 */
public final class uia_tools_introduction extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_tools_introduction() {
    }

    public static final SubLFile me = new uia_tools_introduction();

    public static final String myName = "com.cyc.cycjava.cycl.uia_tools_introduction";

    // // Definitions
    public static final SubLObject uia_act_new_sentence_relator(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sentence) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SENTENCE_RELATOR, list(cycl_sentence), UNPROVIDED);
    }

    public static final SubLObject uia_act_new_sentences_relator(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sent_a, SubLObject cycl_sent_b) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SENTENCE_RELATOR, list(cycl_sent_a, cycl_sent_b), UNPROVIDED);
    }

    public static final SubLObject uiat_sentence_relator_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject cycl_sentence = args.first();
            return cconcatenate($str_alt2$Fact_Relator___, uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED));
        }
    }

    // deflexical
    private static final SubLSymbol $sentence_relation_package$ = makeSymbol("*SENTENCE-RELATION-PACKAGE*");

    public static final SubLObject uiat_sentence_relator_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject sent_a = args.first();
            SubLObject sent_b = second(args);
            if (NIL == sent_b) {
                sent_b = $NONE;
            }
            {
                SubLObject state_sent_b = user_interaction_agenda.ui_state_lookup(interaction, $SENT_B, $UNDETERMINED);
                if ($UNDETERMINED != state_sent_b) {
                    sent_b = state_sent_b;
                }
            }
            user_interaction_agenda.ui_state_update(interaction, $SENT_A, sent_a);
            user_interaction_agenda.ui_state_update(interaction, $SENT_B, sent_b);
            {
                SubLObject relations = Mapping.mapcar(THIRD, $sentence_relation_package$.getGlobalValue());
                SubLObject v_default = user_interaction_agenda.ui_state_lookup(interaction, $DEFAULT_RELATION, relations.first());
                SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($SENT_A, sent_a, $SENT_B, sent_b, $RELATIONS, relations, $DEFAULT_RELATION, v_default));
                return request;
            }
        }
    }

    public static final SubLObject uiat_sentence_relator_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($SENTENCE_READER)) {
                {
                    SubLObject sentences = user_interaction_agenda.ui_result(child);
                    if (NIL != list_utilities.singletonP(sentences)) {
                        user_interaction_agenda.ui_state_update(parent, $SENT_B, sentences.first());
                    } else
                        if (sentences.isCons()) {
                            user_interaction_agenda.ui_state_update(parent, $SENT_B, sentences.first());
                        } else {
                            user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                        }

                }
            } else
                if (pcase_var.eql($SENTENCE_FINDER)) {
                    {
                        SubLObject sentence = user_interaction_agenda.ui_result(child);
                        if (NIL != el_utilities.possibly_sentence_p(sentence)) {
                            user_interaction_agenda.ui_state_update(parent, $SENT_B, sentence);
                        }
                    }
                }

        }
        return parent;
    }

    public static final SubLObject uiat_sentence_relator_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
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
                        SubLObject datum_1 = plist;
                        SubLObject current_2 = datum_1;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_2;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_1, $list_alt18);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_1, $list_alt18);
                            if (NIL == member(current_3, $list_alt19, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_1, $list_alt18);
                        }
                        {
                            SubLObject sent_a_tail = property_list_member($SENT_A, current_2);
                            SubLObject sent_a = (NIL != sent_a_tail) ? ((SubLObject) (cadr(sent_a_tail))) : NIL;
                            SubLObject sent_b_tail = property_list_member($SENT_B, current_2);
                            SubLObject sent_b = (NIL != sent_b_tail) ? ((SubLObject) (cadr(sent_b_tail))) : $NONE;
                            SubLObject mode_tail = property_list_member($MODE, current_2);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_sentences_relator(v_agenda, mode, sent_a, sent_b);
                        }
                    }
                } else
                    if (pcase_var.eql($REPLY)) {
                        {
                            SubLObject datum_4 = plist;
                            SubLObject current_5 = datum_4;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_5;
                            SubLObject bad = NIL;
                            SubLObject current_6 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_4, $list_alt24);
                                current_6 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_4, $list_alt24);
                                if (NIL == member(current_6, $list_alt25, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_6 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_4, $list_alt24);
                            }
                            {
                                SubLObject relationship_tail = property_list_member($RELATIONSHIP, current_5);
                                SubLObject relationship = (NIL != relationship_tail) ? ((SubLObject) (cadr(relationship_tail))) : NIL;
                                SubLObject sent_b_tail = property_list_member($SENT_B, current_5);
                                SubLObject sent_b = (NIL != sent_b_tail) ? ((SubLObject) (cadr(sent_b_tail))) : $KNOWN;
                                uiat_sentence_relator_handle_user_reply(interaction, relationship, sent_b);
                            }
                        }
                    }

            }
        }
        return NIL;
    }

    public static final SubLObject uiat_sentence_relator_handle_user_reply(SubLObject interaction, SubLObject relship, SubLObject sent_b) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject selection = find(relship, $sentence_relation_package$.getGlobalValue(), EQUALP, THIRD, UNPROVIDED, UNPROVIDED);
            SubLObject predicate = selection.first();
            user_interaction_agenda.ui_state_update(interaction, $PREDICATE, predicate);
            user_interaction_agenda.ui_state_update(interaction, $DEFAULT_RELATION, relship);
            if (sent_b == $KNOWN) {
                uiat_sentence_relator_make_assertion(interaction);
            } else
                if (NIL != uia_tools_basic.sentence_finder_trigger_stringP(sent_b)) {
                    {
                        SubLObject child = uia_tools_basic.uia_act_new_sentence_finder(v_agenda, $REQUIRED, UNPROVIDED, UNPROVIDED);
                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    }
                } else {
                    {
                        SubLObject child = cb_uiat_smart.uia_act_new_sentence_reader(v_agenda, $REQUIRED, sent_b, UNPROVIDED, UNPROVIDED);
                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    }
                }

            return NIL;
        }
    }

    public static final SubLObject uiat_sentence_relator_make_assertion(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject predicate = user_interaction_agenda.ui_state_lookup(interaction, $PREDICATE, UNPROVIDED);
            SubLObject sent_a = user_interaction_agenda.ui_state_lookup(interaction, $SENT_A, UNPROVIDED);
            SubLObject sent_b = user_interaction_agenda.ui_state_lookup(interaction, $SENT_B, UNPROVIDED);
            SubLObject sentence = el_utilities.make_binary_formula(predicate, sent_a, sent_b);
            uia_act_new_assertion_creator(v_agenda, $REQUIRED, uia_trampolines.uia_sentence_phrase(v_agenda, sentence, UNPROVIDED, UNPROVIDED), sentence, UNPROVIDED);
            user_interaction_agenda.uia_act_complete(v_agenda, interaction, sentence);
        }
        return interaction;
    }

    public static final SubLObject uia_act_new_similar_sentence(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sentence) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SIMILAR_SENTENCE, list(cycl_sentence), UNPROVIDED);
    }

    public static final SubLObject uiat_similar_sentence_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt32$Similar_Sentence____A, uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED));
            } else {
                cdestructuring_bind_error(datum, $list_alt31);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_similar_sentence_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject modified_sentence = user_interaction_agenda.ui_state_lookup(interaction, $MODIFIED_SENTENCE, $UNDETERMINED);
                    if ($UNDETERMINED == modified_sentence) {
                        {
                            SubLObject child = uia_tools_basic.uia_act_new_sentence_cloner(v_agenda, $REQUIRED, cycl_sentence, $SENTENCE, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                    } else {
                        {
                            SubLObject clarifier = uia_tools_browsing.uia_act_new_sentence_clarifier(v_agenda, $REQUIRED, modified_sentence, UNPROVIDED);
                            user_interaction_agenda.uia_act_complete(v_agenda, interaction, modified_sentence);
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt31);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_similar_sentence_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($SENTENCE_CLONER)) {
                {
                    SubLObject modified_sentence = user_interaction_agenda.ui_result(child);
                    user_interaction_agenda.ui_state_update(parent, $MODIFIED_SENTENCE, modified_sentence);
                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_similar_sentence_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
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
                        SubLObject datum_7 = plist;
                        SubLObject current_8 = datum_7;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_8;
                        SubLObject bad = NIL;
                        SubLObject current_9 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_7, $list_alt36);
                            current_9 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_7, $list_alt36);
                            if (NIL == member(current_9, $list_alt37, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_9 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_7, $list_alt36);
                        }
                        {
                            SubLObject sentence_tail = property_list_member($SENTENCE, current_8);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_8);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_similar_sentence(v_agenda, mode, sentence);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_similar_assertion(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sentence) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SIMILAR_ASSERTION, list(cycl_sentence), UNPROVIDED);
    }

    public static final SubLObject uiat_similar_assertion_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt40$Assert_Similar____A, uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED));
            } else {
                cdestructuring_bind_error(datum, $list_alt31);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_similar_assertion_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject modified_sentence = user_interaction_agenda.ui_state_lookup(interaction, $MODIFIED_SENTENCE, $UNDETERMINED);
                    if ($UNDETERMINED == modified_sentence) {
                        {
                            SubLObject child = uia_tools_basic.uia_act_new_sentence_cloner(v_agenda, $REQUIRED, cycl_sentence, $ASSERTION, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                    } else {
                        {
                            SubLObject phrase = uia_trampolines.uia_sentence_phrase(v_agenda, modified_sentence, UNPROVIDED, UNPROVIDED);
                            SubLObject child = uia_act_new_assertion_creator(v_agenda, $REQUIRED, phrase, modified_sentence, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt31);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_similar_assertion_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($SENTENCE_CLONER)) {
                {
                    SubLObject modified_sentence = user_interaction_agenda.ui_result(child);
                    user_interaction_agenda.ui_state_update(parent, $MODIFIED_SENTENCE, modified_sentence);
                }
            } else
                if (pcase_var.eql($ASSERTION_CREATOR)) {
                    user_interaction_agenda.uia_act_complete(v_agenda, parent, $DONE);
                }

        }
        return parent;
    }

    public static final SubLObject uiat_similar_assertion_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
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
                        SubLObject datum_10 = plist;
                        SubLObject current_11 = datum_10;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_11;
                        SubLObject bad = NIL;
                        SubLObject current_12 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_10, $list_alt36);
                            current_12 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_10, $list_alt36);
                            if (NIL == member(current_12, $list_alt37, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_12 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_10, $list_alt36);
                        }
                        {
                            SubLObject sentence_tail = property_list_member($SENTENCE, current_11);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_11);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_similar_assertion(v_agenda, mode, sentence);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_similar_question(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sentence) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SIMILAR_QUESTION, list(cycl_sentence), UNPROVIDED);
    }

    public static final SubLObject uiat_similar_question_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt46$Ask_Similar____A, uia_trampolines.uia_query_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else {
                cdestructuring_bind_error(datum, $list_alt31);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_similar_question_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject modified_sentence = user_interaction_agenda.ui_state_lookup(interaction, $MODIFIED_SENTENCE, $UNDETERMINED);
                    if ($UNDETERMINED == modified_sentence) {
                        {
                            SubLObject child = uia_tools_basic.uia_act_new_sentence_cloner(v_agenda, $REQUIRED, cycl_sentence, $QUESTION, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                    } else {
                        {
                            SubLObject phrase = uia_trampolines.uia_query_phrase(v_agenda, modified_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject child = cb_uia_tools_review_and_testing.uia_act_new_solution_finder(v_agenda, phrase, modified_sentence, $REQUIRED, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt31);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_similar_question_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($SENTENCE_CLONER)) {
                {
                    SubLObject modified_sentence = user_interaction_agenda.ui_result(child);
                    user_interaction_agenda.ui_state_update(parent, $MODIFIED_SENTENCE, modified_sentence);
                }
            } else
                if (pcase_var.eql($SOLUTION_FINDER)) {
                    user_interaction_agenda.uia_act_complete(v_agenda, parent, $DONE);
                }

        }
        return parent;
    }

    public static final SubLObject uiat_similar_question_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
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
                        SubLObject datum_13 = plist;
                        SubLObject current_14 = datum_13;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_14;
                        SubLObject bad = NIL;
                        SubLObject current_15 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_13, $list_alt36);
                            current_15 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_13, $list_alt36);
                            if (NIL == member(current_15, $list_alt37, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_15 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_13, $list_alt36);
                        }
                        {
                            SubLObject sentence_tail = property_list_member($SENTENCE, current_14);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_14);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_similar_question(v_agenda, mode, sentence);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_assertion_precision_editor(SubLObject v_agenda, SubLObject mode, SubLObject sentence) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $ASSERTION_PRECISION_EDITOR, list(sentence), NIL);
    }

    public static final SubLObject uiat_assertion_precision_editor_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt51);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject new_sentences = user_interaction_agenda.ui_state_lookup(interaction, $NEW_SENTENCES, $UNDETERMINED);
                    if ($UNDETERMINED == new_sentences) {
                        {
                            SubLObject child = uia_tools_misc.uia_act_new_precision_suggestor(v_agenda, $REQUIRED, sentence);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                        }
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    }
                    if (list(sentence).equal(new_sentences)) {
                        {
                            SubLObject message = $str_alt53$Either_no_precision_suggestion_wa;
                            user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                            user_interaction_agenda.uia_act_complete(v_agenda, interaction, sentence);
                        }
                    } else {
                        uia_trampolines.uia_unassert(v_agenda, sentence);
                        {
                            SubLObject cdolist_list_var = new_sentences;
                            SubLObject sentence_16 = NIL;
                            for (sentence_16 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence_16 = cdolist_list_var.first()) {
                                {
                                    SubLObject new_sentence = (NIL != uia_tools_misc.uiat_is_faceted_precision_suggestion_sentenceP(sentence_16)) ? ((SubLObject) (uia_tools_misc.uiat_faceted_precision_suggestion_sentence_get_sentence(sentence_16))) : sentence_16;
                                    SubLObject argnum = (NIL != uia_tools_misc.uiat_is_faceted_precision_suggestion_sentenceP(sentence_16)) ? ((SubLObject) (uia_tools_misc.uiat_faceted_precision_suggestion_sentence_get_argnum(sentence_16))) : NIL;
                                    SubLObject facet = (NIL != uia_tools_misc.uiat_is_faceted_precision_suggestion_sentenceP(sentence_16)) ? ((SubLObject) (uia_tools_misc.uiat_faceted_precision_suggestion_sentence_get_facet(sentence_16))) : NIL;
                                    SubLObject nl_sentence = uia_trampolines.uia_sentence_phrase(v_agenda, new_sentence, UNPROVIDED, UNPROVIDED);
                                    SubLObject child = NIL;
                                    if ((NIL != argnum) && (NIL != facet)) {
                                        child = uia_act_new_assertion_creator_with_facet(v_agenda, $REQUIRED, nl_sentence, argnum, facet, new_sentence, UNPROVIDED);
                                    } else {
                                        child = uia_act_new_assertion_creator(v_agenda, $REQUIRED, nl_sentence, new_sentence, $FALSE);
                                    }
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                }
                            }
                        }
                    }
                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt51);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_assertion_precision_editor_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($PRECISION_SUGGESTOR)) {
                {
                    SubLObject new_sentences = user_interaction_agenda.ui_result(child);
                    user_interaction_agenda.ui_state_update(parent, $NEW_SENTENCES, new_sentences);
                }
            } else
                if (pcase_var.eql($ASSERTION_CREATOR)) {
                    {
                        SubLObject new_sentences = user_interaction_agenda.ui_state_lookup(parent, $NEW_SENTENCES, $UNDETERMINED);
                        user_interaction_agenda.uia_act_complete(v_agenda, parent, new_sentences.first());
                    }
                }

        }
        return parent;
    }

    public static final SubLObject uiat_assertion_precision_editor_child_invalidated(SubLObject parent, SubLObject child) {
        return uiat_assertion_precision_editor_child_rejected(parent, child);
    }

    public static final SubLObject uiat_assertion_precision_editor_child_rejected(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($ASSERTION_CREATOR)) {
                {
                    SubLObject args = user_interaction_agenda.ui_args(parent);
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject sentence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt51);
                    sentence = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        uia_trampolines.uia_assert_exact(v_agenda, sentence, UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt51);
                    }
                }
            }
            user_interaction_agenda.uia_act_reject(v_agenda, parent);
        }
        return parent;
    }

    public static final SubLObject uiat_assertion_precision_editor_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
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
                        SubLObject datum_17 = plist;
                        SubLObject current_18 = datum_17;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_18;
                        SubLObject bad = NIL;
                        SubLObject current_19 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_17, $list_alt36);
                            current_19 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_17, $list_alt36);
                            if (NIL == member(current_19, $list_alt37, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_19 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_17, $list_alt36);
                        }
                        {
                            SubLObject sentence_tail = property_list_member($SENTENCE, current_18);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_18);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_assertion_precision_editor(v_agenda, mode, sentence);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_concept_creator(SubLObject v_agenda, SubLObject mode, SubLObject phrase, SubLObject isas, SubLObject v_genls, SubLObject similar_term, SubLObject auto_createP) {
        if (isas == UNPROVIDED) {
            isas = NIL;
        }
        if (v_genls == UNPROVIDED) {
            v_genls = NIL;
        }
        if (similar_term == UNPROVIDED) {
            similar_term = NIL;
        }
        if (auto_createP == UNPROVIDED) {
            auto_createP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != isas) || (NIL != v_genls))) {
                thread.resetMultipleValues();
                {
                    SubLObject superior = uiat_concept_creator_guess_superior(v_agenda, phrase);
                    SubLObject superior_type = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == superior) {
                    } else
                        if ($ISA == superior_type) {
                            isas = list(superior);
                        } else
                            if ($GENL == superior_type) {
                                v_genls = list(superior);
                            }


                }
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $CONCEPT_CREATOR, list(phrase, isas, v_genls, similar_term, auto_createP), UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return 0 LISTP; containing 1 or 0 possible isa or genls of a new term denoted by PHRASE.
     * @return 1 KEYWORDP; :isa or :genl - the type of superior we think it is.
     */
    public static final SubLObject uiat_concept_creator_guess_superior(SubLObject v_agenda, SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrase_words = string_utilities.string_tokenize(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject superior_type = (NIL != lexicon_accessors.string_is_posP(phrase_words.first(), $$Determiner, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) ($ISA)) : $GENL;
                if (NIL == list_utilities.lengthG(phrase_words, ONE_INTEGER, UNPROVIDED)) {
                    return NIL;
                }
                {
                    SubLObject headword_position = lexification_utilities.most_likely_headword(phrase_words);
                    SubLObject headword_guess = nth(headword_position, phrase_words);
                    SubLObject headword_denots = NIL;
                    {
                        SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                        try {
                            lexicon_vars.$lexicon_lookup_mt$.bind(user_interaction_agenda.uia_lexical_interaction_mt(v_agenda), thread);
                            headword_denots = uia_trampolines.uia_filter_irrelevant_terms(v_agenda, lexicon_accessors.denots_of_string(headword_guess, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                        } finally {
                            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject headword_guessed_type = find_if($sym61$COLLECTION_, headword_denots, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return values(headword_guessed_type, superior_type);
                    }
                }
            }
        }
    }

    public static final SubLObject uiat_concept_creator_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            if (NIL == args) {
                args = $list_alt62;
            }
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject phrase = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt63);
                phrase = current.first();
                current = current.rest();
                {
                    SubLObject toss = current;
                    return list($str_alt64$Create_concept__, $TERM, phrase);
                }
            }
        }
    }

    public static final SubLObject uiat_concept_creator_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            if (NIL == args) {
                user_interaction_agenda.uia_act_complete(v_agenda, interaction, $INCOMPLETE);
                return cb_uia_launchers.cb_uia_launch_concept_creator(UNPROVIDED);
            }
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject phrase = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt67);
                phrase = current.first();
                current = current.rest();
                {
                    SubLObject isas = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt67);
                    current = current.rest();
                    {
                        SubLObject v_genls = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt67);
                        current = current.rest();
                        {
                            SubLObject similar = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt67);
                            current = current.rest();
                            {
                                SubLObject auto_createP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt67);
                                current = current.rest();
                                if (NIL == current) {
                                    user_interaction_agenda.ui_state_update(interaction, $ISA_CONSTRAINTS, isas);
                                    user_interaction_agenda.ui_state_update(interaction, $GENLS_CONSTRAINTS, v_genls);
                                    if (NIL != similar) {
                                        user_interaction_agenda.ui_state_update(interaction, $SIMILAR_TERM, similar);
                                    }
                                    phrase = (NIL != user_interaction_agenda.ui_state_lookup(interaction, $PREFERRED_PHRASE, UNPROVIDED)) ? ((SubLObject) (user_interaction_agenda.ui_state_lookup(interaction, $PREFERRED_PHRASE, UNPROVIDED))) : phrase;
                                    user_interaction_agenda.ui_state_update(interaction, $AVAILABLE_ISA_TEMPLATES, uia_trampolines.uia_available_template_topic_isas(v_agenda, UNPROVIDED));
                                    user_interaction_agenda.ui_state_update(interaction, $AVAILABLE_GENLS_TEMPLATES, uia_trampolines.uia_available_template_topic_genls(v_agenda, UNPROVIDED));
                                    {
                                        SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, $UNDETERMINED);
                                        SubLObject ontologized = user_interaction_agenda.ui_state_lookup(interaction, $ONTOLOGIZED, NIL);
                                        if (NIL == ontologized) {
                                            if (NIL != auto_createP) {
                                                uiat_concept_creator_auto_ontologize(interaction, phrase, isas, v_genls);
                                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                            } else {
                                                {
                                                    SubLObject best_isa = uiat_concept_creator_select_best_isa(interaction, isas);
                                                    SubLObject best_genls = uiat_concept_creator_select_best_genls(interaction, v_genls);
                                                    return user_interaction_agenda.make_ui_request(interaction, $ONTOLOGIZE, list(new SubLObject[]{ $PHRASE, phrase, $TERM, v_term, $ISA, best_isa, $GENLS, best_genls, $SIMILAR, similar, $ISA_TEMPLATES, user_interaction_agenda.ui_state_lookup(interaction, $AVAILABLE_ISA_TEMPLATES, UNPROVIDED), $GENLS_TEMPLATES, user_interaction_agenda.ui_state_lookup(interaction, $AVAILABLE_GENLS_TEMPLATES, UNPROVIDED) }));
                                                }
                                            }
                                        }
                                        {
                                            SubLObject num_pending_assertions = user_interaction_agenda.ui_state_lookup(interaction, $NUM_PENDING_ASSERTIONS, $UNDETERMINED);
                                            SubLObject pcase_var = num_pending_assertions;
                                            if (pcase_var.eql($UNDETERMINED)) {
                                                return uiat_concept_creator_spawn_defining_assertion_children(interaction, phrase, v_term);
                                            } else
                                                if (pcase_var.eql(ZERO_INTEGER)) {
                                                    if (NIL != user_interaction_agenda.ui_state_lookup(interaction, $TERM_IS_LEXIFIED, UNPROVIDED)) {
                                                        return uiat_concept_creator_complete(interaction, phrase, v_term);
                                                    } else {
                                                        return uiat_concept_creator_launch_lexification(interaction, phrase, v_term);
                                                    }
                                                } else {
                                                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, v_term);
                                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                }

                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt67);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_creator_auto_ontologize(SubLObject interaction, SubLObject phrase, SubLObject isas, SubLObject v_genls) {
        uiat_concept_creator_create_term(interaction, phrase);
        {
            SubLObject best_isa = uiat_concept_creator_select_best_isa(interaction, isas);
            user_interaction_agenda.ui_state_update(interaction, $ISA_TERM, best_isa);
        }
        {
            SubLObject best_genls = uiat_concept_creator_select_best_genls(interaction, v_genls);
            user_interaction_agenda.ui_state_update(interaction, $GENL_TERM, best_genls);
        }
        user_interaction_agenda.ui_state_update(interaction, $ONTOLOGIZED, T);
        return interaction;
    }

    /**
     *
     *
     * @unknown do better in the future
     */
    public static final SubLObject uiat_concept_creator_select_best_isa(SubLObject interaction, SubLObject isas) {
        return isas.first();
    }

    /**
     *
     *
     * @unknown do better in the future
     */
    public static final SubLObject uiat_concept_creator_select_best_genls(SubLObject interaction, SubLObject v_genls) {
        return v_genls.first();
    }

    public static final SubLObject uiat_concept_creator_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                {
                    SubLObject result = user_interaction_agenda.ui_result(child);
                    SubLObject my_result_will_be = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
                    if ($NONE != result) {
                        user_interaction_agenda.ui_state_update(parent, my_result_will_be, result);
                        user_interaction_agenda.ui_state_update(parent, $ONTOLOGIZED, T);
                    }
                }
            } else
                if (pcase_var.eql($YES_NO_QUESTION)) {
                    {
                        SubLObject result = user_interaction_agenda.ui_result(child);
                        if ($YES == result) {
                            {
                                SubLObject sentence = user_interaction_agenda.ui_state_lookup(child, $SENTENCE, UNPROVIDED);
                                uia_trampolines.uia_assert_exact(user_interaction_agenda.ui_agenda(parent), sentence, UNPROVIDED);
                            }
                        }
                    }
                    uiat_concept_creator_decrement_assertion_count(parent);
                } else
                    if (pcase_var.eql($LEXIFICATION_WIZARD)) {
                        user_interaction_agenda.ui_state_update(parent, $TERM_IS_LEXIFIED, $TRUE);
                    } else
                        if (pcase_var.eql($ASSERTION_CREATOR)) {
                            uiat_concept_creator_decrement_assertion_count(parent);
                        }



        }
        return parent;
    }

    public static final SubLObject uiat_concept_creator_decrement_assertion_count(SubLObject interaction) {
        {
            SubLObject num_pending_assertions = user_interaction_agenda.ui_state_lookup(interaction, $NUM_PENDING_ASSERTIONS, $UNDETERMINED);
            if (num_pending_assertions.isInteger()) {
                {
                    SubLObject new_num = subtract(num_pending_assertions, ONE_INTEGER);
                    user_interaction_agenda.ui_state_update(interaction, $NUM_PENDING_ASSERTIONS, new_num);
                }
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_concept_creator_child_invalidated(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($ASSERTION_CREATOR)) {
                if (user_interaction_agenda.ui_state_lookup(child, $STATUS, UNPROVIDED) == $REDUNDANT) {
                    return uiat_concept_creator_decrement_assertion_count(parent);
                } else {
                    return uiat_concept_creator_child_rejected(parent, child);
                }
            } else
                if (pcase_var.eql(OTHWERWISE)) {
                    return uiat_concept_creator_child_rejected(parent, child);
                }

        }
        return NIL;
    }

    /**
     * The properties to clear to get the concept creator to start back from the point right after you entered the phrase.
     */
    // deflexical
    private static final SubLSymbol $uiat_concept_creator_state_to_clear$ = makeSymbol("*UIAT-CONCEPT-CREATOR-STATE-TO-CLEAR*");

    public static final SubLObject uiat_concept_creator_start_over(SubLObject interaction) {
        {
            SubLObject cdolist_list_var = $uiat_concept_creator_state_to_clear$.getGlobalValue();
            SubLObject property = NIL;
            for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                user_interaction_agenda.ui_state_clear(interaction, property);
            }
        }
        {
            SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, $UNDETERMINED);
            if (NIL != forts.fort_p(v_term)) {
                uiat_concept_creator_backout_assertions(interaction, v_term);
            }
        }
        return interaction;
    }

    /**
     * Backing up is trickier, because the lexification will not get repeated.
     */
    public static final SubLObject uiat_concept_creator_backout_assertions(SubLObject interaction, SubLObject fort) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject lexical_mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
            SubLObject assertions = kb_accessors.all_term_assertions(fort, UNPROVIDED);
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                if (!((lexical_mt == assertions_high.assertion_mt(assertion)) || (NIL == assertions_high.valid_assertion(assertion, UNPROVIDED)))) {
                    uia_trampolines.uia_unassert(v_agenda, assertion);
                }
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_concept_creator_auto_createP(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt67);
            phrase = current.first();
            current = current.rest();
            {
                SubLObject isas = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt67);
                current = current.rest();
                {
                    SubLObject v_genls = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt67);
                    current = current.rest();
                    {
                        SubLObject similar = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt67);
                        current = current.rest();
                        {
                            SubLObject auto_createP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt67);
                            current = current.rest();
                            if (NIL == current) {
                                return auto_createP;
                            } else {
                                cdestructuring_bind_error(datum, $list_alt67);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_creator_child_rejected(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            if (NIL != uiat_concept_creator_auto_createP(parent)) {
                {
                    SubLObject message = $str_alt95$Sorry__I_seem_to_be_unable_to_aut;
                    user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                    return user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                }
            }
            {
                SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
                if ((pcase_var.eql($CONCEPT_DISAMBIGUATOR) || pcase_var.eql($ASSERTION_CREATOR)) || pcase_var.eql($LEXIFICATION_WIZARD)) {
                    uiat_concept_creator_start_over(parent);
                    user_interaction_agenda.uia_act_invalidate_all_children(v_agenda, parent);
                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_concept_creator_spawn_defining_assertion_children(SubLObject interaction, SubLObject phrase, SubLObject v_term) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject isa_term = user_interaction_agenda.ui_state_lookup(interaction, $ISA_TERM, NIL);
            SubLObject genl_term = user_interaction_agenda.ui_state_lookup(interaction, $GENL_TERM, NIL);
            SubLObject similar_term = user_interaction_agenda.ui_state_lookup(interaction, $SIMILAR_TERM, NIL);
            SubLObject template_isa = user_interaction_agenda.ui_state_lookup(interaction, $TEMPLATE_ISA, NIL);
            SubLObject template_genls = user_interaction_agenda.ui_state_lookup(interaction, $TEMPLATE_GENLS, NIL);
            SubLObject isa_comes_from_templateP = NIL;
            SubLObject genls_comes_from_templateP = NIL;
            if ((NIL != template_isa) && (NIL == isa_term)) {
                {
                    SubLObject isa_template = nth(template_isa, user_interaction_agenda.ui_state_lookup(interaction, $AVAILABLE_ISA_TEMPLATES, UNPROVIDED));
                    isa_term = isa_template.first();
                }
                isa_comes_from_templateP = T;
                user_interaction_agenda.ui_state_update(interaction, $ISA_TERM, isa_term);
            }
            if ((NIL != template_genls) && (NIL == genl_term)) {
                {
                    SubLObject genls_template = nth(template_genls, user_interaction_agenda.ui_state_lookup(interaction, $AVAILABLE_GENLS_TEMPLATES, UNPROVIDED));
                    genl_term = genls_template.first();
                }
                genls_comes_from_templateP = T;
                user_interaction_agenda.ui_state_update(interaction, $GENL_TERM, genl_term);
            }
            if (((NIL == isa_term) && (NIL == genl_term)) && (NIL == similar_term)) {
                {
                    SubLObject message = $str_alt98$Nihil_ex_nihilo__You_must_provide;
                    uiat_concept_creator_start_over(interaction);
                    user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                }
            }
            if (NIL != similar_term) {
                {
                    SubLObject similar_sentence = el_utilities.make_binary_formula($$similarTo, v_term, similar_term);
                    if (NIL != uia_trampolines.uia_wffP(v_agenda, similar_sentence, UNPROVIDED)) {
                        uia_trampolines.uia_assert_exact(v_agenda, similar_sentence, UNPROVIDED);
                    }
                }
            }
            {
                SubLObject num_pending_assertions = ZERO_INTEGER;
                SubLObject mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
                if (NIL == isa_term) {
                    if (NIL != similar_term) {
                        {
                            SubLObject similar_isas = uiat_concept_creator_min_isa(similar_term, mt);
                            SubLObject cdolist_list_var = similar_isas;
                            SubLObject col = NIL;
                            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                {
                                    SubLObject isa_sentence = el_utilities.make_binary_formula($$isa, v_term, col);
                                    SubLObject v_question = uia_trampolines.uia_query_phrase(v_agenda, isa_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject child = NIL;
                                    if (NIL != uia_trampolines.uia_irrelevant_termP(v_agenda, col, mt)) {
                                        uiat_concept_creator_assert(v_agenda, isa_sentence);
                                    } else {
                                        child = uia_tools_basic.uia_act_new_yes_no_question(v_agenda, $REQUIRED, v_question, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        user_interaction_agenda.ui_state_update(child, $SENTENCE, isa_sentence);
                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                        num_pending_assertions = add(num_pending_assertions, ONE_INTEGER);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != genl_term) {
                    if (NIL != uiat_concept_creator_prepare_genls(v_agenda, v_term, genl_term)) {
                        {
                            SubLObject child = uia_act_new_assertion_creator(v_agenda, $REQUIRED, NIL, el_utilities.make_binary_formula($$genls, v_term, genl_term), genls_comes_from_templateP);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            num_pending_assertions = add(num_pending_assertions, ONE_INTEGER);
                        }
                    }
                }
                if (((NIL == genl_term) && (NIL != cycl_grammar.cycl_represented_term_p(similar_term))) && (NIL != fort_types_interface.isa_collectionP(similar_term, mt))) {
                    uiat_concept_creator_prepare_genls(v_agenda, v_term, similar_term);
                    {
                        SubLObject similar_genls = genls.min_genls(similar_term, mt, UNPROVIDED);
                        SubLObject cdolist_list_var = similar_genls;
                        SubLObject col = NIL;
                        for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                            {
                                SubLObject genl_sentence = el_utilities.make_binary_formula($$genls, v_term, col);
                                SubLObject v_question = uia_trampolines.uia_query_phrase(v_agenda, genl_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject child = uia_tools_basic.uia_act_new_yes_no_question(v_agenda, $REQUIRED, v_question, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                user_interaction_agenda.ui_state_update(child, $SENTENCE, genl_sentence);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                num_pending_assertions = add(num_pending_assertions, ONE_INTEGER);
                            }
                        }
                    }
                }
                if (NIL != isa_term) {
                    {
                        SubLObject child = uia_act_new_assertion_creator(v_agenda, $REQUIRED, NIL, el_utilities.make_binary_formula($$isa, v_term, isa_term), isa_comes_from_templateP);
                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                        num_pending_assertions = add(num_pending_assertions, ONE_INTEGER);
                    }
                }
                user_interaction_agenda.ui_state_update(interaction, $NUM_PENDING_ASSERTIONS, num_pending_assertions);
            }
            return user_interaction_agenda.uia_generate_next_request(v_agenda);
        }
    }

    public static final SubLObject uiat_concept_creator_launch_lexification(SubLObject interaction, SubLObject phrase, SubLObject v_term) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject child = cb_uiat_lexification_wizard.uia_act_new_lexification_wizard(v_agenda, v_term, $REQUIRED, phrase);
            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
            return user_interaction_agenda.uia_generate_next_request(v_agenda);
        }
    }

    public static final SubLObject uiat_concept_creator_complete(SubLObject interaction, SubLObject phrase, SubLObject v_term) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject isa_term = user_interaction_agenda.ui_state_lookup(interaction, $ISA_TERM, NIL);
            SubLObject genl_term = user_interaction_agenda.ui_state_lookup(interaction, $GENL_TERM, NIL);
            SubLObject similar_term = user_interaction_agenda.ui_state_lookup(interaction, $SIMILAR_TERM, NIL);
            uia_tools_salient_descriptor.uia_act_new_salient_descriptor(v_agenda, $RELEVANT, phrase, v_term);
            if (NIL != similar_term) {
                {
                    SubLObject similar_phrase = uia_trampolines.uia_term_phrase(v_agenda, similar_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject priority = ((NIL == isa_term) && (NIL == genl_term)) ? ((SubLObject) ($REQUIRED)) : $RELEVANT;
                    uia_act_new_analogy_developer(v_agenda, priority, phrase, similar_phrase, v_term, similar_term);
                }
            }
            {
                SubLObject new_term = uia_trampolines.uia_reparse_unknown_term(phrase, v_term, user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
                if (NIL != new_term) {
                    v_term = new_term;
                }
            }
            user_interaction_agenda.uia_act_complete(v_agenda, interaction, v_term);
            return user_interaction_agenda.uia_generate_next_request(v_agenda);
        }
    }

    public static final SubLObject uiat_concept_creator_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
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
                if (pcase_var.eql($ONTOLOGIZE)) {
                    {
                        SubLObject datum_20 = plist;
                        SubLObject current_21 = datum_20;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_21;
                        SubLObject bad = NIL;
                        SubLObject current_22 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_20, $list_alt103);
                            current_22 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_20, $list_alt103);
                            if (NIL == member(current_22, $list_alt104, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_22 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_20, $list_alt103);
                        }
                        {
                            SubLObject accepted_terms_tail = property_list_member($ACCEPTED_TERMS, current_21);
                            SubLObject accepted_terms = (NIL != accepted_terms_tail) ? ((SubLObject) (cadr(accepted_terms_tail))) : NIL;
                            SubLObject phrases_tail = property_list_member($PHRASES, current_21);
                            SubLObject phrases = (NIL != phrases_tail) ? ((SubLObject) (cadr(phrases_tail))) : NIL;
                            SubLObject remainder = NIL;
                            for (remainder = accepted_terms; NIL != remainder; remainder = cddr(remainder)) {
                                {
                                    SubLObject ontologize_type = remainder.first();
                                    SubLObject value = cadr(remainder);
                                    user_interaction_agenda.ui_state_update(interaction, ontologize_type, value);
                                    user_interaction_agenda.ui_state_update(interaction, $ONTOLOGIZED, T);
                                }
                            }
                            {
                                SubLObject datum_23 = phrases;
                                SubLObject current_24 = datum_23;
                                SubLObject allow_other_keys_p_25 = NIL;
                                SubLObject rest_26 = current_24;
                                SubLObject bad_27 = NIL;
                                SubLObject current_28 = NIL;
                                for (; NIL != rest_26;) {
                                    destructuring_bind_must_consp(rest_26, datum_23, $list_alt107);
                                    current_28 = rest_26.first();
                                    rest_26 = rest_26.rest();
                                    destructuring_bind_must_consp(rest_26, datum_23, $list_alt107);
                                    if (NIL == member(current_28, $list_alt108, UNPROVIDED, UNPROVIDED)) {
                                        bad_27 = T;
                                    }
                                    if (current_28 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p_25 = rest_26.first();
                                    }
                                    rest_26 = rest_26.rest();
                                }
                                if ((NIL != bad_27) && (NIL == allow_other_keys_p_25)) {
                                    cdestructuring_bind_error(datum_23, $list_alt107);
                                }
                                {
                                    SubLObject isa_term_tail = property_list_member($ISA_TERM, current_24);
                                    SubLObject isa_term = (NIL != isa_term_tail) ? ((SubLObject) (cadr(isa_term_tail))) : NIL;
                                    SubLObject genl_term_tail = property_list_member($GENL_TERM, current_24);
                                    SubLObject genl_term = (NIL != genl_term_tail) ? ((SubLObject) (cadr(genl_term_tail))) : NIL;
                                    SubLObject similar_term_tail = property_list_member($SIMILAR_TERM, current_24);
                                    SubLObject similar_term = (NIL != similar_term_tail) ? ((SubLObject) (cadr(similar_term_tail))) : NIL;
                                    SubLObject preferred_phrase_tail = property_list_member($PREFERRED_PHRASE, current_24);
                                    SubLObject preferred_phrase = (NIL != preferred_phrase_tail) ? ((SubLObject) (cadr(preferred_phrase_tail))) : NIL;
                                    if (preferred_phrase.isString()) {
                                        if ($UNDETERMINED == user_interaction_agenda.ui_state_lookup(interaction, $TERM, $UNDETERMINED)) {
                                            uiat_concept_creator_create_term(interaction, preferred_phrase);
                                        }
                                        {
                                            SubLObject children = NIL;
                                            if (NIL != isa_term) {
                                                children = cons(uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, isa_term, $ISA_TERM, $sym109$UIAT_CONCEPT_CREATOR_IS_TERM_A_COLLECTION_, UNPROVIDED, UNPROVIDED, UNPROVIDED), children);
                                            }
                                            if (NIL != genl_term) {
                                                children = cons(uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, genl_term, $GENL_TERM, $sym109$UIAT_CONCEPT_CREATOR_IS_TERM_A_COLLECTION_, UNPROVIDED, UNPROVIDED, UNPROVIDED), children);
                                            }
                                            if (NIL != similar_term) {
                                                children = cons(uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, similar_term, $SIMILAR_TERM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), children);
                                            }
                                            {
                                                SubLObject cdolist_list_var = children;
                                                SubLObject child = NIL;
                                                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_creator_create_term(SubLObject interaction, SubLObject preferred_phrase) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            SubLObject lexical_interaction_mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
            SubLObject new_term = uia_trampolines.uia_create_concept(preferred_phrase, domain_interaction_mt, lexical_interaction_mt, UNPROVIDED);
            user_interaction_agenda.ui_state_update(interaction, $TERM, new_term);
            user_interaction_agenda.ui_state_update(interaction, $PREFERRED_PHRASE, preferred_phrase);
            rkf_tools.rkf_preferred_reference(user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED), preferred_phrase, user_interaction_agenda.uia_lexical_interaction_mt(v_agenda), UNPROVIDED);
        }
        return interaction;
    }

    public static final SubLObject uiat_concept_creator_is_term_a_collectionP(SubLObject interaction, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(user_interaction_agenda.uia_domain_interaction_mt(v_agenda), thread);
                        result = fort_types_interface.isa_collectionP(v_term, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject uiat_concept_creator_min_isa(SubLObject v_term, SubLObject domain_mt) {
        return genls.min_cols(isa.all_isa(v_term, domain_mt, UNPROVIDED), domain_mt, UNPROVIDED);
    }

    public static final SubLObject uiat_concept_creator_make_collection(SubLObject v_agenda, SubLObject v_term) {
        {
            SubLObject isa_sentence = el_utilities.make_binary_formula($$isa, v_term, $$Collection);
            if (NIL != uia_trampolines.uia_wffP(v_agenda, isa_sentence, UNPROVIDED)) {
                uiat_concept_creator_assert(v_agenda, isa_sentence);
                return T;
            }
        }
        return NIL;
    }

    /**
     * For the case of specialization, inherit the isas from the genls
     * to ensure we get through wff.
     */
    public static final SubLObject uiat_concept_creator_prepare_genls(SubLObject v_agenda, SubLObject v_term, SubLObject v_genls) {
        {
            SubLObject asent = el_utilities.make_binary_formula($$genls, v_term, v_genls);
            SubLObject domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            SubLObject previous_resistance = NIL;
            SubLObject doneP = NIL;
            while (NIL == doneP) {
                {
                    SubLObject resistance = uia_trampolines.uia_why_not_assertible_compliant_unmemoized(asent, domain_mt);
                    if (NIL != resistance) {
                        {
                            SubLObject problem = find_if(OPAQUE_HL_SUPPORT_P, resistance, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if ((NIL == problem) || resistance.equalp(previous_resistance)) {
                                uia_mumbler.uia_mumble(v_agenda, format(NIL, $str_alt113$I_cannot_figure_out_how_to_make__, asent));
                                return uiat_concept_creator_make_collection(v_agenda, v_term);
                            }
                            {
                                SubLObject sentence = uiat_extract_remedial_sentence(problem);
                                uiat_concept_creator_assert(v_agenda, sentence);
                            }
                        }
                    }
                    doneP = sublisp_null(resistance);
                    previous_resistance = resistance;
                }
            } 
        }
        return T;
    }

    /**
     * Extract that part that actually needs to be asserted.
     */
    public static final SubLObject uiat_extract_remedial_sentence(SubLObject support) {
        {
            SubLObject asent = arguments.support_sentence(support);
            if ($$unknownSentence == cycl_utilities.formula_arg0(asent)) {
                return cycl_utilities.formula_arg1(asent, UNPROVIDED);
            } else {
                return asent;
            }
        }
    }

    /**
     *
     *
     * @unknown for implied sentences that the user cannot understand
     */
    public static final SubLObject uiat_concept_creator_assert(SubLObject v_agenda, SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject paraphrased = uia_trampolines.uia_sentence_phrase(v_agenda, sentence, UNPROVIDED, UNPROVIDED);
                uia_mumbler.uia_mumble(v_agenda, cconcatenate($str_alt115$I_will_go_ahead_and_assume_that_t, paraphrased));
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(NIL, thread);
                        operation_communication.set_the_cyclist($$Cyc);
                        uia_trampolines.uia_assert_exact(v_agenda, sentence, UNPROVIDED);
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return v_agenda;
        }
    }

    public static final SubLObject uia_act_new_assertion_creator(SubLObject v_agenda, SubLObject mode, SubLObject nl_sentence, SubLObject cycl_sentence, SubLObject precision_suggest) {
        if (cycl_sentence == UNPROVIDED) {
            cycl_sentence = NIL;
        }
        if (precision_suggest == UNPROVIDED) {
            precision_suggest = NIL;
        }
        {
            SubLObject plist = NIL;
            if (NIL != cycl_sentence) {
                plist = putf(plist, $CYCL_SENTENCE, cycl_sentence);
            }
            if (NIL != precision_suggest) {
                plist = putf(plist, $PRECISION_SUGGEST, precision_suggest);
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $ASSERTION_CREATOR, list(nl_sentence), plist);
        }
    }

    public static final SubLObject uia_act_new_assertion_creator_with_facet(SubLObject v_agenda, SubLObject mode, SubLObject nl_sentence, SubLObject argnum, SubLObject facet, SubLObject cycl_sentence, SubLObject precision_suggest) {
        if (cycl_sentence == UNPROVIDED) {
            cycl_sentence = NIL;
        }
        if (precision_suggest == UNPROVIDED) {
            precision_suggest = $TRUE;
        }
        {
            SubLObject interaction = uia_act_new_assertion_creator(v_agenda, mode, nl_sentence, cycl_sentence, precision_suggest);
            user_interaction_agenda.ui_state_update(interaction, $FACETED_ARGNUM, argnum);
            user_interaction_agenda.ui_state_update(interaction, $FACET, facet);
            return interaction;
        }
    }

    public static final SubLObject uiat_assertion_creator_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject facet = user_interaction_agenda.ui_state_lookup(interaction, $FACET, UNPROVIDED);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt51);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == sentence) {
                    {
                        SubLObject cycl_sentence = user_interaction_agenda.ui_state_lookup(interaction, $CYCL_SENTENCE, UNPROVIDED);
                        if (NIL != el_utilities.possibly_sentence_p(cycl_sentence)) {
                            {
                                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                                SubLObject phrase = uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
                                sentence = phrase;
                            }
                        }
                    }
                }
                if (NIL != forts.fort_p(facet)) {
                    {
                        SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                        SubLObject terminal = $str_alt122$__;
                        SubLObject facet_phrase = uia_trampolines.uia_term_phrase(v_agenda, facet, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject tail = $str_alt123$_;
                        sentence = cconcatenate(sentence, new SubLObject[]{ terminal, facet_phrase, tail });
                    }
                }
                return format(NIL, $str_alt124$Add_Fact___A, sentence);
            } else {
                cdestructuring_bind_error(datum, $list_alt51);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_assertion_creator_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt51);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject cycl_sentence = user_interaction_agenda.ui_state_lookup(interaction, $CYCL_SENTENCE, $UNDETERMINED);
                    SubLObject precision_suggest = user_interaction_agenda.ui_state_lookup(interaction, $PRECISION_SUGGEST, $TRUE);
                    SubLObject reformulated_sentence = user_interaction_agenda.ui_state_lookup(interaction, $REFORMULATED_SENTENCE, $UNDETERMINED);
                    SubLObject sentence_validated = user_interaction_agenda.ui_state_lookup(interaction, $SENTENCE_VALIDATED, $UNDETERMINED);
                    SubLObject precise_cycl_sentence = user_interaction_agenda.ui_state_lookup(interaction, $PRECISE_CYCL_SENTENCE, $UNDETERMINED);
                    SubLObject previous_precise_cycl_sentence = user_interaction_agenda.ui_state_lookup(interaction, $PREVIOUS_PRECISE_CYCL_SENTENCE, $UNDETERMINED);
                    if ($UNDETERMINED == cycl_sentence) {
                        {
                            SubLObject read_sentence = cb_uiat_smart.uia_act_new_sentence_reader(v_agenda, $REQUIRED, sentence, UNPROVIDED, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, read_sentence);
                        }
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    } else
                        if ($UNDETERMINED == reformulated_sentence) {
                            {
                                SubLObject reformulated_sentence_29 = uia_trampolines.uia_reformulate_assert_sentence(v_agenda, cycl_sentence, UNPROVIDED);
                                user_interaction_agenda.ui_state_update(interaction, $REFORMULATED_SENTENCE, reformulated_sentence_29);
                            }
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        } else
                            if ($TRUE != sentence_validated) {
                                {
                                    SubLObject validator = uia_tools_misc.uia_act_new_assertion_validator(v_agenda, $REQUIRED, reformulated_sentence);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, validator);
                                }
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            } else
                                if ($UNDETERMINED == precise_cycl_sentence) {
                                    if (reformulated_sentence.equal(previous_precise_cycl_sentence)) {
                                        user_interaction_agenda.ui_state_update(interaction, $PRECISE_CYCL_SENTENCE, previous_precise_cycl_sentence);
                                    } else
                                        if (($TRUE == precision_suggest) && (NIL != uia_tools_misc.uia_precision_suggestion_supportedP(v_agenda, reformulated_sentence))) {
                                            {
                                                SubLObject argnum = user_interaction_agenda.ui_state_lookup(interaction, $FACETED_ARGNUM, NIL);
                                                SubLObject facet = user_interaction_agenda.ui_state_lookup(interaction, $FACET, NIL);
                                                SubLObject precision_suggestor = NIL;
                                                if ((NIL != argnum) && (NIL != facet)) {
                                                    precision_suggestor = uia_tools_misc.uia_act_new_precision_suggestor_with_facet(v_agenda, $REQUIRED, reformulated_sentence, argnum, facet);
                                                } else {
                                                    precision_suggestor = uia_tools_misc.uia_act_new_precision_suggestor(v_agenda, $REQUIRED, reformulated_sentence);
                                                }
                                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, precision_suggestor);
                                            }
                                        } else {
                                            user_interaction_agenda.ui_state_update(interaction, $PRECISE_CYCL_SENTENCE, reformulated_sentence);
                                        }

                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                } else {
                                    if (NIL != list_utilities.tree_find_if(symbol_function($sym129$INTERMEDIATE_VOCAB_TERM_), precise_cycl_sentence, UNPROVIDED)) {
                                        uia_problem_reporting.uia_problem_reporting_email_autoreport($str_alt130$Attempt_to_assert_CycL_with_inter, format(NIL, $str_alt131$This_is_an_auto_mailed_message___, new SubLObject[]{ $str_alt132$uia_tools_introduction, $str_alt133$uiat_assertion_creator_generate_r, precise_cycl_sentence }), interaction);
                                    }
                                    {
                                        SubLObject sentence_phrase = uia_trampolines.uia_sentence_phrase(v_agenda, precise_cycl_sentence, UNPROVIDED, UNPROVIDED);
                                        SubLObject message = format(NIL, $str_alt134$Adding_fact___A, sentence_phrase);
                                        uia_mumbler.uia_mumble(v_agenda, message);
                                        uia_tools_basic.uia_act_new_thinking_child(interaction, UIAT_ASSERTION_CREATOR_PERFORM_ASSERT, list(v_agenda, precise_cycl_sentence), message, UNPROVIDED);
                                    }
                                }



                }
            } else {
                cdestructuring_bind_error(datum, $list_alt51);
            }
            return user_interaction_agenda.uia_generate_next_request(v_agenda);
        }
    }

    public static final SubLObject uiat_assertion_creator_perform_assert(SubLObject v_agenda, SubLObject sentence) {
        uiat_ac_perform_optimal_assert(v_agenda, sentence);
        uia_trampolines.uia_check_additional_rules(v_agenda, sentence);
        return v_agenda;
    }

    public static final SubLObject uiat_ac_perform_optimal_assert(SubLObject v_agenda, SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject hypothesizeP = uiat_ac_hypothesization_candidateP(v_agenda, sentence);
                SubLObject sub_sentence = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == hypothesizeP) {
                    return uia_trampolines.uia_commented_assert_exact(v_agenda, sentence, UNPROVIDED);
                } else {
                    {
                        SubLObject new_terms = uia_trampolines.uia_commented_hypothesize_exact(v_agenda, sub_sentence, UNPROVIDED);
                        uiat_ac_process_newly_hypothesized_terms(v_agenda, new_terms);
                    }
                }
            }
            return v_agenda;
        }
    }

    /**
     *
     *
     * @unknown do better job filtering; and required is overkill
     */
    public static final SubLObject uiat_ac_process_newly_hypothesized_terms(SubLObject v_agenda, SubLObject new_terms) {
        {
            SubLObject cdolist_list_var = new_terms;
            SubLObject new_term = NIL;
            for (new_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_term = cdolist_list_var.first()) {
                {
                    SubLObject new_term_name = NIL;
                    new_term_name = uiat_ac_temporarily_lexify_new_term(v_agenda, new_term);
                    if (NIL == uiat_ac_term_unimportant_for_uiaP(v_agenda, new_term)) {
                        {
                            SubLObject phrase = new_term_name;
                            uia_tools_salient_descriptor.uia_act_new_salient_descriptor(v_agenda, $REQUIRED, phrase, new_term);
                            uia_trampolines.uia_mark_term_as_contextual(v_agenda, new_term, phrase);
                        }
                    }
                }
            }
        }
        return v_agenda;
    }

    public static final SubLObject uiat_ac_temporarily_lexify_new_term(SubLObject v_agenda, SubLObject new_term) {
        {
            SubLObject genl = uia_trampolines.uia_salient_generalization(v_agenda, new_term);
            SubLObject phrase = (NIL != genl) ? ((SubLObject) (uia_trampolines.uia_term_phrase(v_agenda, list($$BestDetNbarFn_Definite, list($$TermParaphraseFn_Constrained, $$nonPlural_Generic, genl)), UNPROVIDED, UNPROVIDED, UNPROVIDED))) : $$$the_new_term;
            SubLObject name_string_sentence = el_utilities.make_binary_formula($$definiteDescriptions, new_term, phrase);
            uia_trampolines.uia_assert_exact(v_agenda, name_string_sentence, user_interaction_agenda.uia_lexical_interaction_mt(v_agenda));
            return phrase;
        }
    }



    /**
     *
     *
     * @unknown This is a place holder for some serious reasoning about which components
    of discourse are worth raising to the namable level.
     */
    public static final SubLObject uiat_ac_term_unimportant_for_uiaP(SubLObject v_agenda, SubLObject new_term) {
        {
            SubLObject domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            SubLObject unimportantP = NIL;
            if (NIL == unimportantP) {
                {
                    SubLObject csome_list_var = $uiat_ac_default_unimportant_term_filter_collections$.getGlobalValue();
                    SubLObject test = NIL;
                    for (test = csome_list_var.first(); !((NIL != unimportantP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , test = csome_list_var.first()) {
                        {
                            SubLObject datum = test;
                            SubLObject current = datum;
                            SubLObject predicate = NIL;
                            SubLObject collection = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt142);
                            predicate = current.first();
                            current = current.rest();
                            collection = current;
                            if (NIL != backward.removal_ask(el_utilities.make_binary_formula(predicate, new_term, collection), domain_mt, UNPROVIDED, UNPROVIDED)) {
                                unimportantP = T;
                            }
                        }
                    }
                }
            }
            return unimportantP;
        }
    }

    /**
     * The existential quantifiers that trigger hypothesization reasoning.
     */
    // deflexical
    private static final SubLSymbol $uiat_ac_existential_forms$ = makeSymbol("*UIAT-AC-EXISTENTIAL-FORMS*");

    // deflexical
    private static final SubLSymbol $uiat_ac_unary_tense_operators$ = makeSymbol("*UIAT-AC-UNARY-TENSE-OPERATORS*");

    public static final SubLObject uiat_ac_hypothesization_candidateP(SubLObject v_agenda, SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el_formula = verbosifier.el_expand_all(sentence, user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
                if (NIL == collection_defns.cycl_closed_sentenceP(el_formula)) {
                    return values(NIL, NIL);
                }
                {
                    SubLObject current_formula = el_formula;
                    SubLObject variable_count = ZERO_INTEGER;
                    while (NIL != uiat_ac_ignorable_for_hypothesizingP(current_formula)) {
                        if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(current_formula), $uiat_ac_unary_tense_operators$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                            current_formula = cycl_utilities.formula_arg1(current_formula, UNPROVIDED);
                        } else {
                            thread.resetMultipleValues();
                            {
                                SubLObject variable = uiat_ac_identify_variable_and_subformula(v_agenda, current_formula);
                                SubLObject sub_formula = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                variable_count = add(variable_count, ONE_INTEGER);
                                current_formula = sub_formula;
                            }
                        }
                    } 
                    if (variable_count.isZero() || (NIL != collection_defns.cycl_closed_sentenceP(current_formula))) {
                        return values(NIL, NIL);
                    }
                    return values(T, current_formula);
                }
            }
        }
    }

    public static final SubLObject uiat_ac_ignorable_for_hypothesizingP(SubLObject formula) {
        {
            SubLObject pred = cycl_utilities.formula_arg0(formula);
            return makeBoolean((NIL != member(pred, $uiat_ac_unary_tense_operators$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || (NIL != member(pred, $uiat_ac_existential_forms$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
        }
    }

    public static final SubLObject uiat_ac_identify_variable_and_subformula(SubLObject v_agenda, SubLObject formula) {
        {
            SubLObject variable = NIL;
            SubLObject sub_formula = NIL;
            variable = uiat_ac_identify_existential_variable(v_agenda, formula);
            sub_formula = uiat_ac_identify_existential_subformula(v_agenda, formula);
            return values(variable, sub_formula);
        }
    }

    public static final SubLObject uiat_ac_identify_existential_variable(SubLObject v_agenda, SubLObject formula) {
        {
            SubLObject predicate = cycl_utilities.formula_arg0(formula);
            SubLObject position = ask_utilities.ask_variable($ARGPOS, listS($$argIsa, predicate, $list_alt166), user_interaction_agenda.uia_domain_interaction_mt(v_agenda), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
            return cycl_utilities.formula_arg(formula, position, UNPROVIDED);
        }
    }

    public static final SubLObject uiat_ac_identify_existential_subformula(SubLObject v_agenda, SubLObject formula) {
        {
            SubLObject predicate = cycl_utilities.formula_arg0(formula);
            SubLObject position = ask_utilities.ask_variable($ARGPOS, listS($$argIsa, predicate, $list_alt167), user_interaction_agenda.uia_domain_interaction_mt(v_agenda), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
            return cycl_utilities.formula_arg(formula, position, UNPROVIDED);
        }
    }

    public static final SubLObject uiat_assertion_creator_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($SENTENCE_READER)) {
                uiat_ac_sentence_reader_child_completed(parent, child);
            } else
                if (pcase_var.eql($ASSERTION_VALIDATOR)) {
                    uiat_ac_assertion_validator_child_completed(parent, child);
                } else
                    if (pcase_var.eql($PRECISION_SUGGESTOR)) {
                        uiat_ac_precision_suggestor_child_completed(parent, child);
                    } else
                        if (pcase_var.eql($THINKING)) {
                            user_interaction_agenda.uia_act_complete(user_interaction_agenda.ui_agenda(parent), parent, $DONE);
                        } else
                            if (pcase_var.eql($ASSERTION_CREATOR)) {
                                uiat_ac_assertion_creator_child_completed(parent, child);
                            }




        }
        return parent;
    }

    public static final SubLObject uiat_ac_sentence_reader_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject cycl_sentences = user_interaction_agenda.ui_result(child);
            if (NIL == cycl_sentences) {
                user_interaction_agenda.uia_act_complete(v_agenda, parent, NIL);
            } else
                if (NIL != list_utilities.singletonP(cycl_sentences)) {
                    user_interaction_agenda.ui_state_update(parent, $CYCL_SENTENCE, cycl_sentences.first());
                } else {
                    {
                        SubLObject args = user_interaction_agenda.ui_args(parent);
                        SubLObject forked_interactions = NIL;
                        SubLObject datum = args;
                        SubLObject current = datum;
                        SubLObject nl_sentence = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt170);
                        nl_sentence = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject cdolist_list_var = cycl_sentences;
                                SubLObject cycl_sentence = NIL;
                                for (cycl_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl_sentence = cdolist_list_var.first()) {
                                    {
                                        SubLObject assertion_creator = uia_act_new_assertion_creator(v_agenda, $REQUIRED, nl_sentence, cycl_sentence, UNPROVIDED);
                                        forked_interactions = cons(assertion_creator, forked_interactions);
                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, parent, assertion_creator);
                                    }
                                }
                            }
                            user_interaction_agenda.ui_state_update(parent, $FORKED_INTERACTIONS, forked_interactions);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt170);
                        }
                    }
                }

        }
        return parent;
    }

    public static final SubLObject uiat_ac_assertion_creator_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject not_done_yetP = NIL;
            SubLObject forked_interactions = user_interaction_agenda.ui_state_lookup(parent, $FORKED_INTERACTIONS, NIL);
            if (NIL == not_done_yetP) {
                {
                    SubLObject csome_list_var = forked_interactions;
                    SubLObject fork = NIL;
                    for (fork = csome_list_var.first(); !((NIL != not_done_yetP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , fork = csome_list_var.first()) {
                        not_done_yetP = user_interaction_agenda.ui_alive_p(fork);
                    }
                }
            }
            if (NIL == not_done_yetP) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
                    user_interaction_agenda.uia_act_complete(v_agenda, parent, $DONE);
                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_ac_assertion_validator_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject status = user_interaction_agenda.ui_result(child);
            if ($OK.eql(status)) {
                user_interaction_agenda.ui_state_update(parent, $SENTENCE_VALIDATED, $TRUE);
            } else {
                user_interaction_agenda.ui_state_update(parent, $STATUS, status);
                user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
            }
        }
        return parent;
    }

    public static final SubLObject uiat_ac_precision_suggestor_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject precise_sentences = user_interaction_agenda.ui_result(child);
            if ((NIL != list_utilities.singletonP(precise_sentences)) && (NIL == uia_tools_misc.uiat_is_faceted_precision_suggestion_result_listP(precise_sentences))) {
                {
                    SubLObject precise_sentence = precise_sentences.first();
                    SubLObject previous_sentence = user_interaction_agenda.ui_state_lookup(parent, $REFORMULATED_SENTENCE, UNPROVIDED);
                    if (precise_sentence.equal(previous_sentence)) {
                        user_interaction_agenda.ui_state_update(parent, $PRECISE_CYCL_SENTENCE, precise_sentence);
                    } else {
                        user_interaction_agenda.ui_state_update(parent, $CYCL_SENTENCE, precise_sentence);
                        user_interaction_agenda.ui_state_update(parent, $PREVIOUS_PRECISE_CYCL_SENTENCE, precise_sentence);
                        user_interaction_agenda.ui_state_update(parent, $REFORMULATED_SENTENCE, $UNDETERMINED);
                        user_interaction_agenda.ui_state_update(parent, $SENTENCE_VALIDATED, $UNDETERMINED);
                    }
                }
            } else {
                {
                    SubLObject precision_suggest = $TRUE;
                    SubLObject reformulated_sentence = $UNDETERMINED;
                    SubLObject sentence_validated = $UNDETERMINED;
                    SubLObject precise_cycl_sentence = $UNDETERMINED;
                    SubLObject previous_precise_cycl_sentence = $UNDETERMINED;
                    SubLObject shared_part_of_plist = list(new SubLObject[]{ $PRECISION_SUGGEST, precision_suggest, $SENTENCE_VALIDATED, sentence_validated, $REFORMULATED_SENTENCE, reformulated_sentence, $PRECISE_CYCL_SENTENCE, precise_cycl_sentence, $PREVIOUS_PRECISE_CYCL_SENTENCE, previous_precise_cycl_sentence });
                    SubLObject forked_interactions = NIL;
                    SubLObject cdolist_list_var = precise_sentences;
                    SubLObject curr_sentence = NIL;
                    for (curr_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr_sentence = cdolist_list_var.first()) {
                        {
                            SubLObject precise_sentence = (NIL != uia_tools_misc.uiat_is_faceted_precision_suggestion_sentenceP(curr_sentence)) ? ((SubLObject) (uia_tools_misc.uiat_faceted_precision_suggestion_sentence_get_sentence(curr_sentence))) : curr_sentence;
                            SubLObject argnum = (NIL != uia_tools_misc.uiat_is_faceted_precision_suggestion_sentenceP(curr_sentence)) ? ((SubLObject) (uia_tools_misc.uiat_faceted_precision_suggestion_sentence_get_argnum(curr_sentence))) : NIL;
                            SubLObject facet = (NIL != uia_tools_misc.uiat_is_faceted_precision_suggestion_sentenceP(curr_sentence)) ? ((SubLObject) (uia_tools_misc.uiat_faceted_precision_suggestion_sentence_get_facet(curr_sentence))) : NIL;
                            SubLObject nl_sentence = uia_trampolines.uia_sentence_phrase(v_agenda, precise_sentence, UNPROVIDED, UNPROVIDED);
                            SubLObject forking_plist = append(shared_part_of_plist, list($CYCL_SENTENCE, precise_sentence));
                            SubLObject forked_interaction = NIL;
                            if ((NIL != argnum) && (NIL != facet)) {
                                forking_plist = append(forking_plist, list($FACETED_ARGNUM, argnum, $FACET, facet));
                            }
                            forked_interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, $REQUIRED, $ASSERTION_CREATOR, list(nl_sentence), forking_plist);
                            forked_interactions = cons(forked_interaction, forked_interactions);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, parent, forked_interaction);
                        }
                    }
                    user_interaction_agenda.ui_state_update(parent, $FORKED_INTERACTIONS, forked_interactions);
                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_assertion_creator_child_invalidated(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($ASSERTION_CREATOR)) {
                {
                    SubLObject still_aliveP = NIL;
                    SubLObject forked_interactions = user_interaction_agenda.ui_state_lookup(parent, $FORKED_INTERACTIONS, NIL);
                    if (NIL == still_aliveP) {
                        {
                            SubLObject csome_list_var = forked_interactions;
                            SubLObject fork = NIL;
                            for (fork = csome_list_var.first(); !((NIL != still_aliveP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , fork = csome_list_var.first()) {
                                still_aliveP = makeBoolean($INVALIDATED != user_interaction_agenda.ui_status(fork));
                            }
                        }
                    }
                    if (NIL != still_aliveP) {
                        return uiat_ac_assertion_creator_child_completed(parent, child);
                    } else {
                        {
                            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
                            return user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                        }
                    }
                }
            } else {
                user_interaction_agenda.uia_act_invalidate(user_interaction_agenda.ui_agenda(parent), parent);
            }
        }
        return parent;
    }

    public static final SubLObject uiat_assertion_creator_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
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
                        SubLObject datum_30 = plist;
                        SubLObject current_31 = datum_30;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_31;
                        SubLObject bad = NIL;
                        SubLObject current_32 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_30, $list_alt174);
                            current_32 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_30, $list_alt174);
                            if (NIL == member(current_32, $list_alt175, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_32 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_30, $list_alt174);
                        }
                        {
                            SubLObject nl_sentence_tail = property_list_member($NL_SENTENCE, current_31);
                            SubLObject nl_sentence = (NIL != nl_sentence_tail) ? ((SubLObject) (cadr(nl_sentence_tail))) : NIL;
                            SubLObject cycl_sentence_tail = property_list_member($CYCL_SENTENCE, current_31);
                            SubLObject cycl_sentence = (NIL != cycl_sentence_tail) ? ((SubLObject) (cadr(cycl_sentence_tail))) : NIL;
                            SubLObject precision_suggest_tail = property_list_member($PRECISION_SUGGEST, current_31);
                            SubLObject precision_suggest = (NIL != precision_suggest_tail) ? ((SubLObject) (cadr(precision_suggest_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_31);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_assertion_creator(v_agenda, mode, nl_sentence, cycl_sentence, precision_suggest);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_analogy_developer(SubLObject v_agenda, SubLObject mode, SubLObject target_phrase, SubLObject source_phrase, SubLObject target_term, SubLObject source_term) {
        if (target_term == UNPROVIDED) {
            target_term = NIL;
        }
        if (source_term == UNPROVIDED) {
            source_term = NIL;
        }
        {
            SubLObject plist = NIL;
            if (NIL != target_term) {
                plist = putf(plist, $TARGET_TERM, target_term);
            }
            if (NIL != source_term) {
                plist = putf(plist, $SOURCE_TERM, source_term);
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $ANALOGY_DEVELOPER, list(target_phrase, source_phrase), plist);
        }
    }

    public static final SubLObject uiat_analogy_developer_hint(SubLObject interaction) {
        {
            SubLObject source_term = user_interaction_agenda.ui_state_lookup(interaction, $SOURCE_TERM, NIL);
            SubLObject target_term = user_interaction_agenda.ui_state_lookup(interaction, $TARGET_TERM, NIL);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject datum = user_interaction_agenda.ui_args(interaction);
            SubLObject current = datum;
            SubLObject target_phrase = NIL;
            SubLObject source_phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt181);
            target_phrase = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt181);
            source_phrase = current.first();
            current = current.rest();
            if (NIL == current) {
                source_phrase = (NIL != source_term) ? ((SubLObject) (uia_trampolines.uia_term_phrase_np(v_agenda, source_term, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : format(NIL, $str_alt182$_S, source_phrase);
                target_phrase = (NIL != target_term) ? ((SubLObject) (uia_trampolines.uia_term_phrase_np(v_agenda, target_term, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : format(NIL, $str_alt182$_S, target_phrase);
                return list($str_alt183$Explore_Analogy__, $TERM, source_phrase, $str_alt184$_to_, $TERM, target_phrase);
            } else {
                cdestructuring_bind_error(datum, $list_alt181);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_analogy_developer_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject target_phrase = NIL;
            SubLObject source_phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt181);
            target_phrase = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt181);
            source_phrase = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject target_term = user_interaction_agenda.ui_state_lookup(interaction, $TARGET_TERM, $UNDETERMINED);
                    SubLObject source_term = user_interaction_agenda.ui_state_lookup(interaction, $SOURCE_TERM, $UNDETERMINED);
                    if ($UNDETERMINED == target_term) {
                        {
                            SubLObject concept_disambiguator_action = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, target_phrase, $TARGET_TERM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, concept_disambiguator_action);
                        }
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    }
                    if ($UNDETERMINED == source_term) {
                        {
                            SubLObject concept_disambiguator_action = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, source_phrase, $SOURCE_TERM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, concept_disambiguator_action);
                        }
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    }
                    {
                        SubLObject candidate_sentences = user_interaction_agenda.ui_state_lookup(interaction, $CANDIDATE_SENTENCES, $UNDETERMINED);
                        if ($UNDETERMINED == candidate_sentences) {
                            candidate_sentences = uia_trampolines.uia_analogous_sentences(v_agenda, target_term, source_term, UNPROVIDED);
                            user_interaction_agenda.ui_state_update(interaction, $CANDIDATE_SENTENCES, candidate_sentences);
                            {
                                SubLObject cdolist_list_var = reverse(candidate_sentences);
                                SubLObject sentence = NIL;
                                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                    {
                                        SubLObject uneditable_arg_positions = cycl_utilities.arg_positions_bfs(target_term, sentence, UNPROVIDED);
                                        uia_tools_basic.uia_act_new_sentence_cloner_widget(interaction, sentence, NIL, uneditable_arg_positions);
                                    }
                                }
                            }
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                        {
                            SubLObject chosen_sentences = user_interaction_agenda.ui_state_lookup(interaction, $CHOSEN_SENTENCES, $UNDETERMINED);
                            if ($UNDETERMINED == chosen_sentences) {
                                {
                                    SubLObject v_equals = misc_utilities.boolean_to_keyword(uia_trampolines.uia_equalsP(v_agenda, target_term, source_term, UNPROVIDED));
                                    return user_interaction_agenda.make_ui_request(interaction, $SHOW, list($TARGET_TERM, target_term, $SOURCE_TERM, source_term, $EQUALS, v_equals, $CANDIDATE_SENTENCES, candidate_sentences));
                                }
                            }
                            {
                                SubLObject cdolist_list_var = chosen_sentences;
                                SubLObject sentence = NIL;
                                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                    {
                                        SubLObject phrase = uia_trampolines.uia_sentence_phrase(v_agenda, sentence, UNPROVIDED, UNPROVIDED);
                                        uia_act_new_assertion_creator(v_agenda, $REQUIRED, phrase, sentence, UNPROVIDED);
                                    }
                                }
                            }
                            user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt181);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_analogy_developer_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                {
                    SubLObject v_term = user_interaction_agenda.ui_result(child);
                    SubLObject which_one = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
                    user_interaction_agenda.ui_state_update(parent, which_one, v_term);
                }
            } else
                if (pcase_var.eql($SENTENCE_CLONER)) {
                    {
                        SubLObject chosen_sentences = user_interaction_agenda.ui_state_lookup(parent, $CHOSEN_SENTENCES, NIL);
                        SubLObject new_sentence = user_interaction_agenda.ui_result(child);
                        chosen_sentences = cons(new_sentence, chosen_sentences);
                        user_interaction_agenda.ui_state_update(parent, $CHOSEN_SENTENCES, chosen_sentences);
                    }
                }

        }
        return parent;
    }

    public static final SubLObject uiat_analogy_developer_child_invalidated(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($SENTENCE_CLONER)) {
            } else {
                user_interaction_agenda.uia_act_invalidate(user_interaction_agenda.ui_agenda(parent), parent);
            }
        }
        return parent;
    }

    public static final SubLObject uiat_analogy_developer_child_rejected(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($SENTENCE_CLONER)) {
            } else {
                user_interaction_agenda.uia_act_reject(user_interaction_agenda.ui_agenda(parent), parent);
            }
        }
        return parent;
    }

    public static final SubLObject uiat_analogy_developer_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
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
                        SubLObject datum_33 = plist;
                        SubLObject current_34 = datum_33;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_34;
                        SubLObject bad = NIL;
                        SubLObject current_35 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_33, $list_alt188);
                            current_35 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_33, $list_alt188);
                            if (NIL == member(current_35, $list_alt189, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_35 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_33, $list_alt188);
                        }
                        {
                            SubLObject target_phrase_tail = property_list_member($TARGET_PHRASE, current_34);
                            SubLObject target_phrase = (NIL != target_phrase_tail) ? ((SubLObject) (cadr(target_phrase_tail))) : NIL;
                            SubLObject source_phrase_tail = property_list_member($SOURCE_PHRASE, current_34);
                            SubLObject source_phrase = (NIL != source_phrase_tail) ? ((SubLObject) (cadr(source_phrase_tail))) : NIL;
                            SubLObject target_term_tail = property_list_member($TARGET_TERM, current_34);
                            SubLObject target_term = (NIL != target_term_tail) ? ((SubLObject) (cadr(target_term_tail))) : NIL;
                            SubLObject source_term_tail = property_list_member($SOURCE_TERM, current_34);
                            SubLObject source_term = (NIL != source_term_tail) ? ((SubLObject) (cadr(source_term_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_34);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_analogy_developer(v_agenda, mode, target_phrase, source_phrase, target_term, source_term);
                        }
                    }
                } else
                    if (pcase_var.eql($ANSWER)) {
                        {
                            SubLObject datum_36 = plist;
                            SubLObject current_37 = datum_36;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_37;
                            SubLObject bad = NIL;
                            SubLObject current_38 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_36, $list_alt193);
                                current_38 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_36, $list_alt193);
                                if (NIL == member(current_38, $list_alt194, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_38 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_36, $list_alt193);
                            }
                            {
                                SubLObject chosen_sentences_tail = property_list_member($CHOSEN_SENTENCES, current_37);
                                SubLObject chosen_sentences = (NIL != chosen_sentences_tail) ? ((SubLObject) (cadr(chosen_sentences_tail))) : NIL;
                                SubLObject cdolist_list_var = chosen_sentences;
                                SubLObject sentence = NIL;
                                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                    {
                                        SubLObject phrase = uia_trampolines.uia_sentence_phrase(v_agenda, sentence, UNPROVIDED, UNPROVIDED);
                                        uia_act_new_assertion_creator(v_agenda, $REQUIRED, phrase, sentence, UNPROVIDED);
                                    }
                                }
                                user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                            }
                        }
                    } else
                        if (pcase_var.eql($WAIT)) {
                        } else
                            if (pcase_var.eql($FIRE)) {
                                {
                                    SubLObject datum_39 = plist;
                                    SubLObject current_40 = datum_39;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current_40;
                                    SubLObject bad = NIL;
                                    SubLObject current_41 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum_39, $list_alt197);
                                        current_41 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum_39, $list_alt197);
                                        if (NIL == member(current_41, $list_alt198, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_41 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum_39, $list_alt197);
                                    }
                                    {
                                        SubLObject target_term_tail = property_list_member($TARGET_TERM, current_40);
                                        SubLObject target_term = (NIL != target_term_tail) ? ((SubLObject) (cadr(target_term_tail))) : NIL;
                                        SubLObject source_term_tail = property_list_member($SOURCE_TERM, current_40);
                                        SubLObject source_term = (NIL != source_term_tail) ? ((SubLObject) (cadr(source_term_tail))) : NIL;
                                        cb_uia_collaborators.uiaext_spawn_fire_analogy(v_agenda, source_term, target_term);
                                    }
                                }
                            }



            }
        }
        return NIL;
    }

    public static final SubLObject declare_uia_tools_introduction_file() {
        declareFunction("uia_act_new_sentence_relator", "UIA-ACT-NEW-SENTENCE-RELATOR", 3, 0, false);
        declareFunction("uia_act_new_sentences_relator", "UIA-ACT-NEW-SENTENCES-RELATOR", 4, 0, false);
        declareFunction("uiat_sentence_relator_hint", "UIAT-SENTENCE-RELATOR-HINT", 1, 0, false);
        declareFunction("uiat_sentence_relator_generate_request", "UIAT-SENTENCE-RELATOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_sentence_relator_child_completed", "UIAT-SENTENCE-RELATOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_sentence_relator_handle_reply", "UIAT-SENTENCE-RELATOR-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_sentence_relator_handle_user_reply", "UIAT-SENTENCE-RELATOR-HANDLE-USER-REPLY", 3, 0, false);
        declareFunction("uiat_sentence_relator_make_assertion", "UIAT-SENTENCE-RELATOR-MAKE-ASSERTION", 1, 0, false);
        declareFunction("uia_act_new_similar_sentence", "UIA-ACT-NEW-SIMILAR-SENTENCE", 3, 0, false);
        declareFunction("uiat_similar_sentence_hint", "UIAT-SIMILAR-SENTENCE-HINT", 1, 0, false);
        declareFunction("uiat_similar_sentence_generate_request", "UIAT-SIMILAR-SENTENCE-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_similar_sentence_child_completed", "UIAT-SIMILAR-SENTENCE-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_similar_sentence_handle_reply", "UIAT-SIMILAR-SENTENCE-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_similar_assertion", "UIA-ACT-NEW-SIMILAR-ASSERTION", 3, 0, false);
        declareFunction("uiat_similar_assertion_hint", "UIAT-SIMILAR-ASSERTION-HINT", 1, 0, false);
        declareFunction("uiat_similar_assertion_generate_request", "UIAT-SIMILAR-ASSERTION-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_similar_assertion_child_completed", "UIAT-SIMILAR-ASSERTION-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_similar_assertion_handle_reply", "UIAT-SIMILAR-ASSERTION-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_similar_question", "UIA-ACT-NEW-SIMILAR-QUESTION", 3, 0, false);
        declareFunction("uiat_similar_question_hint", "UIAT-SIMILAR-QUESTION-HINT", 1, 0, false);
        declareFunction("uiat_similar_question_generate_request", "UIAT-SIMILAR-QUESTION-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_similar_question_child_completed", "UIAT-SIMILAR-QUESTION-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_similar_question_handle_reply", "UIAT-SIMILAR-QUESTION-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_assertion_precision_editor", "UIA-ACT-NEW-ASSERTION-PRECISION-EDITOR", 3, 0, false);
        declareFunction("uiat_assertion_precision_editor_generate_request", "UIAT-ASSERTION-PRECISION-EDITOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_assertion_precision_editor_child_completed", "UIAT-ASSERTION-PRECISION-EDITOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_assertion_precision_editor_child_invalidated", "UIAT-ASSERTION-PRECISION-EDITOR-CHILD-INVALIDATED", 2, 0, false);
        declareFunction("uiat_assertion_precision_editor_child_rejected", "UIAT-ASSERTION-PRECISION-EDITOR-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_assertion_precision_editor_handle_reply", "UIAT-ASSERTION-PRECISION-EDITOR-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_concept_creator", "UIA-ACT-NEW-CONCEPT-CREATOR", 3, 4, false);
        declareFunction("uiat_concept_creator_guess_superior", "UIAT-CONCEPT-CREATOR-GUESS-SUPERIOR", 2, 0, false);
        declareFunction("uiat_concept_creator_hint", "UIAT-CONCEPT-CREATOR-HINT", 1, 0, false);
        declareFunction("uiat_concept_creator_generate_request", "UIAT-CONCEPT-CREATOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_concept_creator_auto_ontologize", "UIAT-CONCEPT-CREATOR-AUTO-ONTOLOGIZE", 4, 0, false);
        declareFunction("uiat_concept_creator_select_best_isa", "UIAT-CONCEPT-CREATOR-SELECT-BEST-ISA", 2, 0, false);
        declareFunction("uiat_concept_creator_select_best_genls", "UIAT-CONCEPT-CREATOR-SELECT-BEST-GENLS", 2, 0, false);
        declareFunction("uiat_concept_creator_child_completed", "UIAT-CONCEPT-CREATOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_concept_creator_decrement_assertion_count", "UIAT-CONCEPT-CREATOR-DECREMENT-ASSERTION-COUNT", 1, 0, false);
        declareFunction("uiat_concept_creator_child_invalidated", "UIAT-CONCEPT-CREATOR-CHILD-INVALIDATED", 2, 0, false);
        declareFunction("uiat_concept_creator_start_over", "UIAT-CONCEPT-CREATOR-START-OVER", 1, 0, false);
        declareFunction("uiat_concept_creator_backout_assertions", "UIAT-CONCEPT-CREATOR-BACKOUT-ASSERTIONS", 2, 0, false);
        declareFunction("uiat_concept_creator_auto_createP", "UIAT-CONCEPT-CREATOR-AUTO-CREATE?", 1, 0, false);
        declareFunction("uiat_concept_creator_child_rejected", "UIAT-CONCEPT-CREATOR-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_concept_creator_spawn_defining_assertion_children", "UIAT-CONCEPT-CREATOR-SPAWN-DEFINING-ASSERTION-CHILDREN", 3, 0, false);
        declareFunction("uiat_concept_creator_launch_lexification", "UIAT-CONCEPT-CREATOR-LAUNCH-LEXIFICATION", 3, 0, false);
        declareFunction("uiat_concept_creator_complete", "UIAT-CONCEPT-CREATOR-COMPLETE", 3, 0, false);
        declareFunction("uiat_concept_creator_handle_reply", "UIAT-CONCEPT-CREATOR-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_concept_creator_create_term", "UIAT-CONCEPT-CREATOR-CREATE-TERM", 2, 0, false);
        declareFunction("uiat_concept_creator_is_term_a_collectionP", "UIAT-CONCEPT-CREATOR-IS-TERM-A-COLLECTION?", 2, 0, false);
        declareFunction("uiat_concept_creator_min_isa", "UIAT-CONCEPT-CREATOR-MIN-ISA", 2, 0, false);
        declareFunction("uiat_concept_creator_make_collection", "UIAT-CONCEPT-CREATOR-MAKE-COLLECTION", 2, 0, false);
        declareFunction("uiat_concept_creator_prepare_genls", "UIAT-CONCEPT-CREATOR-PREPARE-GENLS", 3, 0, false);
        declareFunction("uiat_extract_remedial_sentence", "UIAT-EXTRACT-REMEDIAL-SENTENCE", 1, 0, false);
        declareFunction("uiat_concept_creator_assert", "UIAT-CONCEPT-CREATOR-ASSERT", 2, 0, false);
        declareFunction("uia_act_new_assertion_creator", "UIA-ACT-NEW-ASSERTION-CREATOR", 3, 2, false);
        declareFunction("uia_act_new_assertion_creator_with_facet", "UIA-ACT-NEW-ASSERTION-CREATOR-WITH-FACET", 5, 2, false);
        declareFunction("uiat_assertion_creator_hint", "UIAT-ASSERTION-CREATOR-HINT", 1, 0, false);
        declareFunction("uiat_assertion_creator_generate_request", "UIAT-ASSERTION-CREATOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_assertion_creator_perform_assert", "UIAT-ASSERTION-CREATOR-PERFORM-ASSERT", 2, 0, false);
        declareFunction("uiat_ac_perform_optimal_assert", "UIAT-AC-PERFORM-OPTIMAL-ASSERT", 2, 0, false);
        declareFunction("uiat_ac_process_newly_hypothesized_terms", "UIAT-AC-PROCESS-NEWLY-HYPOTHESIZED-TERMS", 2, 0, false);
        declareFunction("uiat_ac_temporarily_lexify_new_term", "UIAT-AC-TEMPORARILY-LEXIFY-NEW-TERM", 2, 0, false);
        declareFunction("uiat_ac_term_unimportant_for_uiaP", "UIAT-AC-TERM-UNIMPORTANT-FOR-UIA?", 2, 0, false);
        declareFunction("uiat_ac_hypothesization_candidateP", "UIAT-AC-HYPOTHESIZATION-CANDIDATE?", 2, 0, false);
        declareFunction("uiat_ac_ignorable_for_hypothesizingP", "UIAT-AC-IGNORABLE-FOR-HYPOTHESIZING?", 1, 0, false);
        declareFunction("uiat_ac_identify_variable_and_subformula", "UIAT-AC-IDENTIFY-VARIABLE-AND-SUBFORMULA", 2, 0, false);
        declareFunction("uiat_ac_identify_existential_variable", "UIAT-AC-IDENTIFY-EXISTENTIAL-VARIABLE", 2, 0, false);
        declareFunction("uiat_ac_identify_existential_subformula", "UIAT-AC-IDENTIFY-EXISTENTIAL-SUBFORMULA", 2, 0, false);
        declareFunction("uiat_assertion_creator_child_completed", "UIAT-ASSERTION-CREATOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_ac_sentence_reader_child_completed", "UIAT-AC-SENTENCE-READER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_ac_assertion_creator_child_completed", "UIAT-AC-ASSERTION-CREATOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_ac_assertion_validator_child_completed", "UIAT-AC-ASSERTION-VALIDATOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_ac_precision_suggestor_child_completed", "UIAT-AC-PRECISION-SUGGESTOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_assertion_creator_child_invalidated", "UIAT-ASSERTION-CREATOR-CHILD-INVALIDATED", 2, 0, false);
        declareFunction("uiat_assertion_creator_handle_reply", "UIAT-ASSERTION-CREATOR-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_analogy_developer", "UIA-ACT-NEW-ANALOGY-DEVELOPER", 4, 2, false);
        declareFunction("uiat_analogy_developer_hint", "UIAT-ANALOGY-DEVELOPER-HINT", 1, 0, false);
        declareFunction("uiat_analogy_developer_generate_request", "UIAT-ANALOGY-DEVELOPER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_analogy_developer_child_completed", "UIAT-ANALOGY-DEVELOPER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_analogy_developer_child_invalidated", "UIAT-ANALOGY-DEVELOPER-CHILD-INVALIDATED", 2, 0, false);
        declareFunction("uiat_analogy_developer_child_rejected", "UIAT-ANALOGY-DEVELOPER-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_analogy_developer_handle_reply", "UIAT-ANALOGY-DEVELOPER-HANDLE-REPLY", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_tools_introduction_file() {
        deflexical("*SENTENCE-RELATION-PACKAGE*", $list_alt3);
        deflexical("*UIAT-CONCEPT-CREATOR-STATE-TO-CLEAR*", $list_alt94);
        deflexical("*UIAT-AC-DEFAULT-UNIMPORTANT-TERM-FILTER-COLLECTIONS*", NIL != boundp($uiat_ac_default_unimportant_term_filter_collections$) ? ((SubLObject) ($uiat_ac_default_unimportant_term_filter_collections$.getGlobalValue())) : NIL);
        deflexical("*UIAT-AC-EXISTENTIAL-FORMS*", list($$thereExists, $$thereExistAtLeast, $$thereExistAtLeast_RelHolds, $$thereExistAtMost, $$thereExistExactly, $$thereExistRange));
        deflexical("*UIAT-AC-UNARY-TENSE-OPERATORS*", list(new SubLObject[]{ $$pastPerfectProgressive, $$futurePerfectProgressive, $$perfectProgressive, $$futurePerfect, $$pastPerfect, $$simpleFuture, $$simplePast, $$futureProgressive, $$pastProgressive, $$presentPerfect, $$presentProgressive, $$willAlwaysBe, $$was, $$hasAlwaysBeen, $$aspectProgressive }));
        return NIL;
    }

    public static final SubLObject setup_uia_tools_introduction_file() {
                uia_tool_declaration.declare_uia_tool($SENTENCE_RELATOR, $list_alt1);
        uia_tool_declaration.declare_uia_tool($SIMILAR_SENTENCE, $list_alt30);
        uia_tool_declaration.declare_uia_tool($SIMILAR_ASSERTION, $list_alt39);
        uia_tool_declaration.declare_uia_tool($SIMILAR_QUESTION, $list_alt45);
        uia_tool_declaration.declare_uia_tool($ASSERTION_PRECISION_EDITOR, $list_alt50);
        uia_tool_declaration.declare_uia_tool($CONCEPT_CREATOR, $list_alt57);
        uia_tool_declaration.declare_uia_tool($ASSERTION_CREATOR, $list_alt117);
        subl_macro_promotions.declare_defglobal($uiat_ac_default_unimportant_term_filter_collections$);
        uia_tool_declaration.declare_uia_tool($ANALOGY_DEVELOPER, $list_alt178);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $SENTENCE_RELATOR = makeKeyword("SENTENCE-RELATOR");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ $NAME, makeString("Fact Relator"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-SENTENCE-RELATOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-SENTENCE-RELATOR-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-SENTENCE-RELATOR-CHILD-COMPLETED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-SENTENCE-RELATOR-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycFactRelatorTool")) });

    static private final SubLString $str_alt2$Fact_Relator___ = makeString("Fact Relator : ");

    static private final SubLList $list_alt3 = list(list(constant_handles.reader_make_constant_shell(makeString("explains-PropProp")), list(makeKeyword("SENTENCE"), makeKeyword("SENTENCE")), makeString("explains")), list(constant_handles.reader_make_constant_shell(makeString("causes-PropProp")), list(makeKeyword("SENTENCE"), makeKeyword("SENTENCE")), makeString("causes")), list(constant_handles.reader_make_constant_shell(makeString("preconditionFor-Props")), list(makeKeyword("SENTENCE"), makeKeyword("SENTENCE")), makeString("is a precondition for")));



    private static final SubLSymbol $SENT_B = makeKeyword("SENT-B");



    private static final SubLSymbol $SENT_A = makeKeyword("SENT-A");



    private static final SubLSymbol $DEFAULT_RELATION = makeKeyword("DEFAULT-RELATION");



    private static final SubLSymbol $RELATIONS = makeKeyword("RELATIONS");

    private static final SubLSymbol $SENTENCE_READER = makeKeyword("SENTENCE-READER");

    private static final SubLSymbol $SENTENCE_FINDER = makeKeyword("SENTENCE-FINDER");

    static private final SubLList $list_alt14 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("TEMP-PLIST"));





    private static final SubLSymbol $LAUNCH = makeKeyword("LAUNCH");

    static private final SubLList $list_alt18 = list(makeSymbol("&KEY"), makeSymbol("SENT-A"), list(makeSymbol("SENT-B"), $NONE), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt19 = list(makeKeyword("SENT-A"), makeKeyword("SENT-B"), $MODE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol $REPLY = makeKeyword("REPLY");

    static private final SubLList $list_alt24 = list(makeSymbol("&KEY"), makeSymbol("RELATIONSHIP"), list(makeSymbol("SENT-B"), makeKeyword("KNOWN")));

    static private final SubLList $list_alt25 = list(makeKeyword("RELATIONSHIP"), makeKeyword("SENT-B"));

    private static final SubLSymbol $RELATIONSHIP = makeKeyword("RELATIONSHIP");





    private static final SubLSymbol $SIMILAR_SENTENCE = makeKeyword("SIMILAR-SENTENCE");

    static private final SubLList $list_alt30 = list(new SubLObject[]{ $NAME, makeString("Similar Sentence"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-SIMILAR-SENTENCE-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-SIMILAR-SENTENCE-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-SIMILAR-SENTENCE-CHILD-COMPLETED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-SIMILAR-SENTENCE-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycSimilarSentenceTool")) });

    static private final SubLList $list_alt31 = list(makeSymbol("CYCL-SENTENCE"));

    static private final SubLString $str_alt32$Similar_Sentence____A = makeString("Similar Sentence : ~A");

    private static final SubLSymbol $MODIFIED_SENTENCE = makeKeyword("MODIFIED-SENTENCE");



    private static final SubLSymbol $SENTENCE_CLONER = makeKeyword("SENTENCE-CLONER");

    static private final SubLList $list_alt36 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt37 = list(makeKeyword("SENTENCE"), $MODE);

    private static final SubLSymbol $SIMILAR_ASSERTION = makeKeyword("SIMILAR-ASSERTION");

    static private final SubLList $list_alt39 = list(new SubLObject[]{ $NAME, makeString("Similar Assertion"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-SIMILAR-ASSERTION-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-SIMILAR-ASSERTION-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-SIMILAR-ASSERTION-CHILD-COMPLETED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-SIMILAR-ASSERTION-HANDLE-REPLY") });

    static private final SubLString $str_alt40$Assert_Similar____A = makeString("Assert Similar : ~A");



    private static final SubLSymbol $ASSERTION_CREATOR = makeKeyword("ASSERTION-CREATOR");



    private static final SubLSymbol $SIMILAR_QUESTION = makeKeyword("SIMILAR-QUESTION");

    static private final SubLList $list_alt45 = list(new SubLObject[]{ $NAME, makeString("Similar Question"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-SIMILAR-QUESTION-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-SIMILAR-QUESTION-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-SIMILAR-QUESTION-CHILD-COMPLETED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-SIMILAR-QUESTION-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycSimilarQuestionTool")) });

    static private final SubLString $str_alt46$Ask_Similar____A = makeString("Ask Similar : ~A");



    private static final SubLSymbol $SOLUTION_FINDER = makeKeyword("SOLUTION-FINDER");

    private static final SubLSymbol $ASSERTION_PRECISION_EDITOR = makeKeyword("ASSERTION-PRECISION-EDITOR");

    static private final SubLList $list_alt50 = list(new SubLObject[]{ $NAME, makeString("Assertion Precision Editor"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-ASSERTION-PRECISION-EDITOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-ASSERTION-PRECISION-EDITOR-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-ASSERTION-PRECISION-EDITOR-CHILD-COMPLETED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-ASSERTION-PRECISION-EDITOR-CHILD-INVALIDATED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-ASSERTION-PRECISION-EDITOR-CHILD-REJECTED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-ASSERTION-PRECISION-EDITOR-HANDLE-REPLY") });

    static private final SubLList $list_alt51 = list(makeSymbol("SENTENCE"));

    private static final SubLSymbol $NEW_SENTENCES = makeKeyword("NEW-SENTENCES");

    static private final SubLString $str_alt53$Either_no_precision_suggestion_wa = makeString("Either no precision suggestion was possible, or none was selected.  The original assertion was left as is.");





    private static final SubLSymbol $CONCEPT_CREATOR = makeKeyword("CONCEPT-CREATOR");

    static private final SubLList $list_alt57 = list(new SubLObject[]{ $NAME, makeString("Concept Creator"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-CONCEPT-CREATOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-CONCEPT-CREATOR-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-CONCEPT-CREATOR-CHILD-COMPLETED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-CONCEPT-CREATOR-CHILD-INVALIDATED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-CONCEPT-CREATOR-CHILD-REJECTED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-CONCEPT-CREATOR-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycConceptCreator")) });





    public static final SubLObject $$Determiner = constant_handles.reader_make_constant_shell(makeString("Determiner"));

    static private final SubLSymbol $sym61$COLLECTION_ = makeSymbol("COLLECTION?");

    static private final SubLList $list_alt62 = list(makeString("new concept"));

    static private final SubLList $list_alt63 = list(makeSymbol("PHRASE"), makeSymbol("&REST"), makeSymbol("TOSS"));

    static private final SubLString $str_alt64$Create_concept__ = makeString("Create concept: ");





    static private final SubLList $list_alt67 = list(makeSymbol("PHRASE"), makeSymbol("&OPTIONAL"), makeSymbol("ISAS"), makeSymbol("GENLS"), makeSymbol("SIMILAR"), makeSymbol("AUTO-CREATE?"));





    private static final SubLSymbol $SIMILAR_TERM = makeKeyword("SIMILAR-TERM");

    private static final SubLSymbol $PREFERRED_PHRASE = makeKeyword("PREFERRED-PHRASE");

    private static final SubLSymbol $AVAILABLE_ISA_TEMPLATES = makeKeyword("AVAILABLE-ISA-TEMPLATES");

    private static final SubLSymbol $AVAILABLE_GENLS_TEMPLATES = makeKeyword("AVAILABLE-GENLS-TEMPLATES");

    private static final SubLSymbol $ONTOLOGIZED = makeKeyword("ONTOLOGIZED");

    private static final SubLSymbol $ONTOLOGIZE = makeKeyword("ONTOLOGIZE");







    private static final SubLSymbol $ISA_TEMPLATES = makeKeyword("ISA-TEMPLATES");

    private static final SubLSymbol $GENLS_TEMPLATES = makeKeyword("GENLS-TEMPLATES");

    private static final SubLSymbol $NUM_PENDING_ASSERTIONS = makeKeyword("NUM-PENDING-ASSERTIONS");

    private static final SubLSymbol $TERM_IS_LEXIFIED = makeKeyword("TERM-IS-LEXIFIED");

    private static final SubLSymbol $ISA_TERM = makeKeyword("ISA-TERM");

    private static final SubLSymbol $GENL_TERM = makeKeyword("GENL-TERM");

    private static final SubLSymbol $CONCEPT_DISAMBIGUATOR = makeKeyword("CONCEPT-DISAMBIGUATOR");

    private static final SubLSymbol $MY_RESULT_WILL_BE = makeKeyword("MY-RESULT-WILL-BE");

    private static final SubLSymbol $YES_NO_QUESTION = makeKeyword("YES-NO-QUESTION");











    private static final SubLSymbol OTHWERWISE = makeSymbol("OTHWERWISE");

    static private final SubLList $list_alt94 = list(makeKeyword("NUM-PENDING-ASSERTIONS"), makeKeyword("ONTOLOGIZED"), makeKeyword("ISA-TERM"), makeKeyword("GENL-TERM"), makeKeyword("SIMILAR-TERM"));

    static private final SubLString $str_alt95$Sorry__I_seem_to_be_unable_to_aut = makeString("Sorry. I seem to be unable to auto-create a new concept with those constraints.");

    private static final SubLSymbol $TEMPLATE_ISA = makeKeyword("TEMPLATE-ISA");

    private static final SubLSymbol $TEMPLATE_GENLS = makeKeyword("TEMPLATE-GENLS");

    static private final SubLString $str_alt98$Nihil_ex_nihilo__You_must_provide = makeString("Nihil ex nihilo. You must provide some information to create this concept.");

    public static final SubLObject $$similarTo = constant_handles.reader_make_constant_shell(makeString("similarTo"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));



    static private final SubLList $list_alt103 = list(makeSymbol("&KEY"), makeSymbol("ACCEPTED-TERMS"), makeSymbol("PHRASES"));

    static private final SubLList $list_alt104 = list(makeKeyword("ACCEPTED-TERMS"), makeKeyword("PHRASES"));

    private static final SubLSymbol $ACCEPTED_TERMS = makeKeyword("ACCEPTED-TERMS");



    static private final SubLList $list_alt107 = list(makeSymbol("&KEY"), makeSymbol("ISA-TERM"), makeSymbol("GENL-TERM"), makeSymbol("SIMILAR-TERM"), makeSymbol("PREFERRED-PHRASE"));

    static private final SubLList $list_alt108 = list(makeKeyword("ISA-TERM"), makeKeyword("GENL-TERM"), makeKeyword("SIMILAR-TERM"), makeKeyword("PREFERRED-PHRASE"));

    static private final SubLSymbol $sym109$UIAT_CONCEPT_CREATOR_IS_TERM_A_COLLECTION_ = makeSymbol("UIAT-CONCEPT-CREATOR-IS-TERM-A-COLLECTION?");



    public static final SubLObject $$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));

    private static final SubLSymbol OPAQUE_HL_SUPPORT_P = makeSymbol("OPAQUE-HL-SUPPORT-P");

    static private final SubLString $str_alt113$I_cannot_figure_out_how_to_make__ = makeString("I cannot figure out how to make ~A well formed.");

    public static final SubLObject $$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));

    static private final SubLString $str_alt115$I_will_go_ahead_and_assume_that_t = makeString("I will go ahead and assume that this also holds: ");

    public static final SubLObject $$Cyc = constant_handles.reader_make_constant_shell(makeString("Cyc"));

    static private final SubLList $list_alt117 = list(new SubLObject[]{ $NAME, makeString("Assertion Creator"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-ASSERTION-CREATOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-ASSERTION-CREATOR-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-ASSERTION-CREATOR-CHILD-COMPLETED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-ASSERTION-CREATOR-CHILD-INVALIDATED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-ASSERTION-CREATOR-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycAssertionConstructor")) });





    private static final SubLSymbol $FACETED_ARGNUM = makeKeyword("FACETED-ARGNUM");

    private static final SubLSymbol $FACET = makeKeyword("FACET");

    static private final SubLString $str_alt122$__ = makeString(" (");

    static private final SubLString $str_alt123$_ = makeString(")");

    static private final SubLString $str_alt124$Add_Fact___A = makeString("Add Fact: ~A");

    private static final SubLSymbol $REFORMULATED_SENTENCE = makeKeyword("REFORMULATED-SENTENCE");

    private static final SubLSymbol $SENTENCE_VALIDATED = makeKeyword("SENTENCE-VALIDATED");

    private static final SubLSymbol $PRECISE_CYCL_SENTENCE = makeKeyword("PRECISE-CYCL-SENTENCE");

    private static final SubLSymbol $PREVIOUS_PRECISE_CYCL_SENTENCE = makeKeyword("PREVIOUS-PRECISE-CYCL-SENTENCE");

    static private final SubLSymbol $sym129$INTERMEDIATE_VOCAB_TERM_ = makeSymbol("INTERMEDIATE-VOCAB-TERM?");

    static private final SubLString $str_alt130$Attempt_to_assert_CycL_with_inter = makeString("Attempt to assert CycL with intermediate vocabulary");

    static private final SubLString $str_alt131$This_is_an_auto_mailed_message___ = makeString("This is an auto-mailed message.~%(file=~A)~%(fn=~A)~%~%precise-cycl-sentence=~A~%~%");

    static private final SubLString $str_alt132$uia_tools_introduction = makeString("uia-tools-introduction");

    static private final SubLString $str_alt133$uiat_assertion_creator_generate_r = makeString("uiat-assertion-creator-generate-request");

    static private final SubLString $str_alt134$Adding_fact___A = makeString("Adding fact: ~A");

    private static final SubLSymbol UIAT_ASSERTION_CREATOR_PERFORM_ASSERT = makeSymbol("UIAT-ASSERTION-CREATOR-PERFORM-ASSERT");

    public static final SubLObject $$BestDetNbarFn_Definite = constant_handles.reader_make_constant_shell(makeString("BestDetNbarFn-Definite"));

    public static final SubLObject $$TermParaphraseFn_Constrained = constant_handles.reader_make_constant_shell(makeString("TermParaphraseFn-Constrained"));

    public static final SubLObject $$nonPlural_Generic = constant_handles.reader_make_constant_shell(makeString("nonPlural-Generic"));

    static private final SubLString $$$the_new_term = makeString("the new term");

    public static final SubLObject $$definiteDescriptions = constant_handles.reader_make_constant_shell(makeString("definiteDescriptions"));

    public static final SubLSymbol $uiat_ac_default_unimportant_term_filter_collections$ = makeSymbol("*UIAT-AC-DEFAULT-UNIMPORTANT-TERM-FILTER-COLLECTIONS*");

    static private final SubLList $list_alt142 = cons(makeSymbol("PREDICATE"), makeSymbol("COLLECTION"));

    public static final SubLObject $$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));

    public static final SubLObject $$thereExistAtLeast = constant_handles.reader_make_constant_shell(makeString("thereExistAtLeast"));

    public static final SubLObject $$thereExistAtLeast_RelHolds = constant_handles.reader_make_constant_shell(makeString("thereExistAtLeast-RelHolds"));

    public static final SubLObject $$thereExistAtMost = constant_handles.reader_make_constant_shell(makeString("thereExistAtMost"));

    public static final SubLObject $$thereExistExactly = constant_handles.reader_make_constant_shell(makeString("thereExistExactly"));

    public static final SubLObject $$thereExistRange = constant_handles.reader_make_constant_shell(makeString("thereExistRange"));

    public static final SubLObject $$pastPerfectProgressive = constant_handles.reader_make_constant_shell(makeString("pastPerfectProgressive"));

    public static final SubLObject $$futurePerfectProgressive = constant_handles.reader_make_constant_shell(makeString("futurePerfectProgressive"));

    public static final SubLObject $$perfectProgressive = constant_handles.reader_make_constant_shell(makeString("perfectProgressive"));

    public static final SubLObject $$futurePerfect = constant_handles.reader_make_constant_shell(makeString("futurePerfect"));

    public static final SubLObject $$pastPerfect = constant_handles.reader_make_constant_shell(makeString("pastPerfect"));

    public static final SubLObject $$simpleFuture = constant_handles.reader_make_constant_shell(makeString("simpleFuture"));

    public static final SubLObject $$simplePast = constant_handles.reader_make_constant_shell(makeString("simplePast"));

    public static final SubLObject $$futureProgressive = constant_handles.reader_make_constant_shell(makeString("futureProgressive"));

    public static final SubLObject $$pastProgressive = constant_handles.reader_make_constant_shell(makeString("pastProgressive"));

    public static final SubLObject $$presentPerfect = constant_handles.reader_make_constant_shell(makeString("presentPerfect"));

    public static final SubLObject $$presentProgressive = constant_handles.reader_make_constant_shell(makeString("presentProgressive"));

    public static final SubLObject $$willAlwaysBe = constant_handles.reader_make_constant_shell(makeString("willAlwaysBe"));

    public static final SubLObject $$was = constant_handles.reader_make_constant_shell(makeString("was"));

    public static final SubLObject $$hasAlwaysBeen = constant_handles.reader_make_constant_shell(makeString("hasAlwaysBeen"));

    public static final SubLObject $$aspectProgressive = constant_handles.reader_make_constant_shell(makeString("aspectProgressive"));

    private static final SubLSymbol $ARGPOS = makeKeyword("ARGPOS");

    public static final SubLObject $$argIsa = constant_handles.reader_make_constant_shell(makeString("argIsa"));

    static private final SubLList $list_alt166 = list(makeKeyword("ARGPOS"), constant_handles.reader_make_constant_shell(makeString("CycLVariable")));

    static private final SubLList $list_alt167 = list(makeKeyword("ARGPOS"), constant_handles.reader_make_constant_shell(makeString("CycLSentence-Assertible")));

    private static final SubLSymbol $ASSERTION_VALIDATOR = makeKeyword("ASSERTION-VALIDATOR");



    static private final SubLList $list_alt170 = list(makeSymbol("NL-SENTENCE"));

    private static final SubLSymbol $FORKED_INTERACTIONS = makeKeyword("FORKED-INTERACTIONS");





    static private final SubLList $list_alt174 = list(makeSymbol("&KEY"), makeSymbol("NL-SENTENCE"), makeSymbol("CYCL-SENTENCE"), makeSymbol("PRECISION-SUGGEST"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt175 = list(makeKeyword("NL-SENTENCE"), makeKeyword("CYCL-SENTENCE"), makeKeyword("PRECISION-SUGGEST"), $MODE);



    private static final SubLSymbol $ANALOGY_DEVELOPER = makeKeyword("ANALOGY-DEVELOPER");

    static private final SubLList $list_alt178 = list(new SubLObject[]{ $NAME, makeString("Analogy Developer"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-ANALOGY-DEVELOPER-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-ANALOGY-DEVELOPER-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-ANALOGY-DEVELOPER-CHILD-COMPLETED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-ANALOGY-DEVELOPER-CHILD-INVALIDATED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-ANALOGY-DEVELOPER-CHILD-REJECTED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-ANALOGY-DEVELOPER-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycAnalogyTool")) });

    private static final SubLSymbol $TARGET_TERM = makeKeyword("TARGET-TERM");

    private static final SubLSymbol $SOURCE_TERM = makeKeyword("SOURCE-TERM");

    static private final SubLList $list_alt181 = list(makeSymbol("TARGET-PHRASE"), makeSymbol("SOURCE-PHRASE"));

    static private final SubLString $str_alt182$_S = makeString("~S");

    static private final SubLString $str_alt183$Explore_Analogy__ = makeString("Explore Analogy: ");

    static private final SubLString $str_alt184$_to_ = makeString(" to ");

    private static final SubLSymbol $CANDIDATE_SENTENCES = makeKeyword("CANDIDATE-SENTENCES");

    private static final SubLSymbol $CHOSEN_SENTENCES = makeKeyword("CHOSEN-SENTENCES");



    static private final SubLList $list_alt188 = list(makeSymbol("&KEY"), makeSymbol("TARGET-PHRASE"), makeSymbol("SOURCE-PHRASE"), makeSymbol("TARGET-TERM"), makeSymbol("SOURCE-TERM"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt189 = list(makeKeyword("TARGET-PHRASE"), makeKeyword("SOURCE-PHRASE"), makeKeyword("TARGET-TERM"), makeKeyword("SOURCE-TERM"), $MODE);

    private static final SubLSymbol $TARGET_PHRASE = makeKeyword("TARGET-PHRASE");

    private static final SubLSymbol $SOURCE_PHRASE = makeKeyword("SOURCE-PHRASE");



    static private final SubLList $list_alt193 = list(makeSymbol("&KEY"), makeSymbol("CHOSEN-SENTENCES"));

    static private final SubLList $list_alt194 = list(makeKeyword("CHOSEN-SENTENCES"));

    static private final SubLList $list_alt197 = list(makeSymbol("&KEY"), makeSymbol("TARGET-TERM"), makeSymbol("SOURCE-TERM"));

    static private final SubLList $list_alt198 = list(makeKeyword("TARGET-TERM"), makeKeyword("SOURCE-TERM"));

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_uia_tools_introduction_file();
    }

    @Override
    public void initializeVariables() {
        init_uia_tools_introduction_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_uia_tools_introduction_file();
    }
}

