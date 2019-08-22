/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
 *  module:      UIA-TOOLS-WIZARDS
 *  source file: /cyc/top/cycl/uia-tools-wizards.lisp
 *  created:     2019/07/03 17:37:58
 */
public final class uia_tools_wizards extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_tools_wizards() {
    }

    public static final SubLFile me = new uia_tools_wizards();


    // // Definitions
    public static final SubLObject uia_act_new_scenario_constructor(SubLObject v_agenda, SubLObject phrase, SubLObject mode, SubLObject v_scenario) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $REQUIRED;
        }
        if (v_scenario == UNPROVIDED) {
            v_scenario = NIL;
        }
        {
            SubLObject args = (NIL != phrase) ? ((SubLObject) (list(phrase))) : NIL;
            SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SCENARIO_CONSTRUCTOR, args, UNPROVIDED);
            SubLObject sc_state = (NIL != v_scenario) ? ((SubLObject) (rkf_scenario_constructor.sc_act_new_state_with_construction_scenario(v_scenario, phrase))) : NIL != phrase ? ((SubLObject) (rkf_scenario_constructor.sc_act_new_state_with_phrase(phrase))) : rkf_scenario_constructor.sc_act_new_state();
            rkf_scenario_constructor.note_sc_state_interaction(sc_state, interaction);
            user_interaction_agenda.ui_state_update(interaction, $SC_STATE, sc_state);
            return interaction;
        }
    }

    public static final SubLObject uiat_scenario_constructor_generate_request(SubLObject interaction) {
        uiat_sc_handle_any_leftovers(interaction);
        if (NIL != uiat_sc_signal_any_errors(interaction)) {
            return user_interaction_agenda.uia_generate_next_request(user_interaction_agenda.ui_agenda(interaction));
        }
        if (NIL != uiat_sc_pending_found_sentence(interaction)) {
            {
                SubLObject current_found_sentence = uiat_sc_fetch_pending_found_sentence(interaction);
                SubLObject additional_terms = uiat_sc_fetch_additional_terms(interaction);
                return user_interaction_agenda.make_ui_request(interaction, $ADJUST_SENTENCE, list($SENTENCE, current_found_sentence, $EXTENSION, additional_terms));
            }
        }
        return user_interaction_agenda.make_ui_request(interaction, $SHOW, NIL);
    }

    public static final SubLObject uiat_scenario_constructor_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt8);
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
                if (pcase_var.eql($RELOAD_SCENARIO)) {
                    {
                        SubLObject datum_1 = plist;
                        SubLObject current_2 = datum_1;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_2;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_1, $list_alt12);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_1, $list_alt12);
                            if (NIL == member(current_3, $list_alt13, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_1, $list_alt12);
                        }
                        {
                            SubLObject scenario_term_tail = property_list_member($SCENARIO_TERM, current_2);
                            SubLObject scenario_term = (NIL != scenario_term_tail) ? ((SubLObject) (cadr(scenario_term_tail))) : NIL;
                            SubLObject scenario_phrase_tail = property_list_member($SCENARIO_PHRASE, current_2);
                            SubLObject scenario_phrase = (NIL != scenario_phrase_tail) ? ((SubLObject) (cadr(scenario_phrase_tail))) : NIL;
                            uiat_sc_handle_reload_scenario(interaction, scenario_term, scenario_phrase);
                        }
                    }
                } else
                    if (pcase_var.eql($FIND_SCENARIO)) {
                        {
                            SubLObject datum_4 = plist;
                            SubLObject current_5 = datum_4;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_5;
                            SubLObject bad = NIL;
                            SubLObject current_6 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_4, $list_alt18);
                                current_6 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_4, $list_alt18);
                                if (NIL == member(current_6, $list_alt19, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_6 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_4, $list_alt18);
                            }
                            {
                                SubLObject scenario_phrase_tail = property_list_member($SCENARIO_PHRASE, current_5);
                                SubLObject scenario_phrase = (NIL != scenario_phrase_tail) ? ((SubLObject) (cadr(scenario_phrase_tail))) : NIL;
                                uiat_sc_handle_parse_scenario(interaction, scenario_phrase);
                            }
                        }
                    } else
                        if (pcase_var.eql($SCENARIO_PARSED)) {
                            {
                                SubLObject datum_7 = plist;
                                SubLObject current_8 = datum_7;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_8;
                                SubLObject bad = NIL;
                                SubLObject current_9 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_7, $list_alt21);
                                    current_9 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_7, $list_alt21);
                                    if (NIL == member(current_9, $list_alt22, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_9 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_7, $list_alt21);
                                }
                                {
                                    SubLObject scenario_phrase_tail = property_list_member($SCENARIO_PHRASE, current_8);
                                    SubLObject scenario_phrase = (NIL != scenario_phrase_tail) ? ((SubLObject) (cadr(scenario_phrase_tail))) : NIL;
                                    SubLObject scenario_expression_tail = property_list_member($SCENARIO_EXPRESSION, current_8);
                                    SubLObject scenario_expression = (NIL != scenario_expression_tail) ? ((SubLObject) (cadr(scenario_expression_tail))) : NIL;
                                    uiat_sc_handle_scenario_parsed(interaction, scenario_phrase, scenario_expression);
                                }
                            }
                        } else
                            if (pcase_var.eql($ADD_GENERAL_TERM)) {
                                {
                                    SubLObject datum_10 = plist;
                                    SubLObject current_11 = datum_10;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current_11;
                                    SubLObject bad = NIL;
                                    SubLObject current_12 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum_10, $list_alt25);
                                        current_12 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum_10, $list_alt25);
                                        if (NIL == member(current_12, $list_alt26, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_12 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum_10, $list_alt25);
                                    }
                                    {
                                        SubLObject indexical_phrase_tail = property_list_member($INDEXICAL_PHRASE, current_11);
                                        SubLObject indexical_phrase = (NIL != indexical_phrase_tail) ? ((SubLObject) (cadr(indexical_phrase_tail))) : NIL;
                                        SubLObject isa_phrase_tail = property_list_member($ISA_PHRASE, current_11);
                                        SubLObject isa_phrase = (NIL != isa_phrase_tail) ? ((SubLObject) (cadr(isa_phrase_tail))) : NIL;
                                        SubLObject genl_phrase_tail = property_list_member($GENL_PHRASE, current_11);
                                        SubLObject genl_phrase = (NIL != genl_phrase_tail) ? ((SubLObject) (cadr(genl_phrase_tail))) : NIL;
                                        SubLObject isa_term_tail = property_list_member($ISA_TERM, current_11);
                                        SubLObject isa_term = (NIL != isa_term_tail) ? ((SubLObject) (cadr(isa_term_tail))) : NIL;
                                        SubLObject genl_term_tail = property_list_member($GENL_TERM, current_11);
                                        SubLObject genl_term = (NIL != genl_term_tail) ? ((SubLObject) (cadr(genl_term_tail))) : NIL;
                                        SubLObject exemplar_phrase_tail = property_list_member($EXEMPLAR_PHRASE, current_11);
                                        SubLObject exemplar_phrase = (NIL != exemplar_phrase_tail) ? ((SubLObject) (cadr(exemplar_phrase_tail))) : NIL;
                                        uiat_sc_handle_add_general_term(interaction, indexical_phrase, isa_phrase, genl_phrase, isa_term, genl_term, exemplar_phrase);
                                    }
                                }
                            } else
                                if (pcase_var.eql($ADD_CONSTRAINT_SENTENCE)) {
                                    {
                                        SubLObject datum_13 = plist;
                                        SubLObject current_14 = datum_13;
                                        SubLObject allow_other_keys_p = NIL;
                                        SubLObject rest = current_14;
                                        SubLObject bad = NIL;
                                        SubLObject current_15 = NIL;
                                        for (; NIL != rest;) {
                                            destructuring_bind_must_consp(rest, datum_13, $list_alt34);
                                            current_15 = rest.first();
                                            rest = rest.rest();
                                            destructuring_bind_must_consp(rest, datum_13, $list_alt34);
                                            if (NIL == member(current_15, $list_alt35, UNPROVIDED, UNPROVIDED)) {
                                                bad = T;
                                            }
                                            if (current_15 == $ALLOW_OTHER_KEYS) {
                                                allow_other_keys_p = rest.first();
                                            }
                                            rest = rest.rest();
                                        }
                                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                            cdestructuring_bind_error(datum_13, $list_alt34);
                                        }
                                        {
                                            SubLObject sentence_tail = property_list_member($SENTENCE, current_14);
                                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                                            uiat_sc_handle_add_constraint_sentence(interaction, sentence);
                                        }
                                    }
                                } else
                                    if (pcase_var.eql($DONE)) {
                                        {
                                            SubLObject datum_16 = plist;
                                            SubLObject current_17 = datum_16;
                                            SubLObject allow_other_keys_p = NIL;
                                            SubLObject rest = current_17;
                                            SubLObject bad = NIL;
                                            SubLObject current_18 = NIL;
                                            for (; NIL != rest;) {
                                                destructuring_bind_must_consp(rest, datum_16, $list_alt37);
                                                current_18 = rest.first();
                                                rest = rest.rest();
                                                destructuring_bind_must_consp(rest, datum_16, $list_alt37);
                                                if (NIL == member(current_18, $list_alt38, UNPROVIDED, UNPROVIDED)) {
                                                    bad = T;
                                                }
                                                if (current_18 == $ALLOW_OTHER_KEYS) {
                                                    allow_other_keys_p = rest.first();
                                                }
                                                rest = rest.rest();
                                            }
                                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                cdestructuring_bind_error(datum_16, $list_alt37);
                                            }
                                            {
                                                SubLObject scenario_tail = property_list_member($SCENARIO, current_17);
                                                SubLObject v_scenario = (NIL != scenario_tail) ? ((SubLObject) (cadr(scenario_tail))) : NIL;
                                                user_interaction_agenda.uia_act_complete(v_agenda, interaction, v_scenario);
                                            }
                                        }
                                    } else {
                                        uiat_scenario_constructor_implementation(interaction);
                                    }





                return NIL;
            }
        }
    }

    public static final SubLObject uiat_scenario_constructor_hint(SubLObject interaction) {
        {
            SubLObject base_form = $str_alt40$Scenario___;
            SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
            if (NIL != rkf_scenario_constructor.sc_state_p(sc_state)) {
                {
                    SubLObject session = rkf_scenario_constructor.sc_state_active_session(sc_state);
                    if (NIL != rkf_scenario_constructor.sc_session_p(session)) {
                        {
                            SubLObject v_scenario = rkf_scenario_constructor.sc_session_scenario(session);
                            if (NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario)) {
                                {
                                    SubLObject phrase = rkf_scenario_manipulator.sm_scenario_phrase(v_scenario);
                                    if (phrase.isString() && (NIL == string_utilities.empty_string_p(phrase))) {
                                        return cconcatenate(base_form, phrase);
                                    }
                                }
                            }
                            {
                                SubLObject phrase = rkf_scenario_constructor.sc_session_phrase(session);
                                if (phrase.isString() && (NIL == string_utilities.empty_string_p(phrase))) {
                                    return cconcatenate(base_form, phrase);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject args = user_interaction_agenda.ui_args(interaction);
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject phrase = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt41);
                current = current.rest();
                if (NIL == current) {
                    if (phrase.isString() && (NIL == string_utilities.empty_string_p(phrase))) {
                        return cconcatenate(base_form, phrase);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt41);
                }
            }
        }
        return $$$Scenario_Constructor;
    }

    public static final SubLObject uiat_scenario_constructor_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($DISAMBIGUATE_PHRASE) || pcase_var.eql($UNKNOWN_TERM)) {
                uiat_sc_handle_disambiguate_phrase_or_unknown_term(parent, child);
            } else
                if (pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                    uiat_sc_handle_concept_disambiguator(parent, child);
                } else
                    if (pcase_var.eql($SENTENCE_FINDER)) {
                        uiat_sc_handle_child_sentence_finder(parent, child);
                    } else
                        if (pcase_var.eql($TERM_READER)) {
                            uiat_sc_handle_child_term_reader(parent, child);
                        } else
                            if (pcase_var.eql($CONCEPT_IN_SENTENCE_DISAMBIGUATOR)) {
                                uiat_sc_handle_child_concept_in_sentence_disambiguator(parent, child);
                            } else
                                if (pcase_var.eql($SENTENCE_READER)) {
                                    uiat_sc_handle_child_sentence_reader(parent, child);
                                } else
                                    if (pcase_var.eql($ACKNOWLEDGE_MESSAGE) || pcase_var.eql($ACKNOWLEDGE_STRUCTURED_MESSAGE)) {
                                    } else
                                        if (pcase_var.eql($CONCEPT_FINDER)) {
                                            uiat_sc_handle_child_concept_finder(parent, child);
                                        } else {
                                            Errors.warn($str_alt53$Unhandled_child__A_received_by_pa, user_interaction_agenda.ui_operator(child), user_interaction_agenda.ui_operator(parent));
                                        }







        }
        return parent;
    }

    public static final SubLObject uiat_sc_handle_disambiguate_phrase_or_unknown_term(SubLObject parent, SubLObject child) {
        {
            SubLObject constraintP = user_interaction_agenda.ui_state_lookup(child, $CONSTRAINT, UNPROVIDED);
            SubLObject result = user_interaction_agenda.ui_result(child);
            if (NIL != constraintP) {
                user_interaction_agenda.ui_state_update(parent, $CONSTRAINT_CYCL_SENTENCE, result);
            } else
                if ($NONE == result) {
                    uiat_scenario_constructor_term_not_added_message(parent);
                } else {
                    user_interaction_agenda.ui_state_update(parent, $INDEXICAL_FORT, result);
                }

        }
        return parent;
    }

    public static final SubLObject uiat_sc_handle_concept_disambiguator(SubLObject parent, SubLObject child) {
        {
            SubLObject fort = user_interaction_agenda.ui_result(child);
            SubLObject my_result_will_be = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
            SubLObject pcase_var = my_result_will_be;
            if (pcase_var.eql($ISA_TERM)) {
                user_interaction_agenda.ui_state_update(parent, $ISA_TERM, fort);
            } else
                if (pcase_var.eql($GENL_TERM)) {
                    user_interaction_agenda.ui_state_update(parent, $GENL_TERM, fort);
                } else
                    if (pcase_var.eql($EXEMPLAR_TERM)) {
                        uiat_sc_handle_successful_exemplar(parent, fort);
                    }


        }
        return parent;
    }

    public static final SubLObject uiat_sc_handle_child_sentence_finder(SubLObject parent, SubLObject child) {
        {
            SubLObject cycl_sentence = user_interaction_agenda.ui_result(child);
            if (NIL != cycl_utilities.expression_find_if(symbol_function(SM_INDEXICAL_P), cycl_sentence, UNPROVIDED, UNPROVIDED)) {
                user_interaction_agenda.ui_state_update(parent, $CONSTRAINT_CYCL_SENTENCE, cycl_sentence);
            } else {
                user_interaction_agenda.ui_state_update(parent, $FOUND_CYCL_SENTENCE, cycl_sentence);
            }
        }
        return parent;
    }

    public static final SubLObject uiat_sc_pending_found_sentence(SubLObject interaction) {
        return list_utilities.sublisp_boolean(uiat_sc_lookup_pending_found_sentence(interaction, UNPROVIDED));
    }

    public static final SubLObject uiat_sc_lookup_pending_found_sentence(SubLObject interaction, SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = NIL;
        }
        {
            SubLObject found_sentence = user_interaction_agenda.ui_state_lookup(interaction, $FOUND_CYCL_SENTENCE, UNPROVIDED);
            if (NIL != clearP) {
                user_interaction_agenda.ui_state_clear(interaction, $FOUND_CYCL_SENTENCE);
            }
            return found_sentence;
        }
    }

    public static final SubLObject uiat_sc_fetch_pending_found_sentence(SubLObject interaction) {
        return uiat_sc_lookup_pending_found_sentence(interaction, $CLEAR);
    }

    public static final SubLObject uiat_sc_fetch_additional_terms(SubLObject interaction) {
        {
            SubLObject additional_terms = user_interaction_agenda.ui_state_lookup(interaction, $PASTE_RESULT_LIST, UNPROVIDED);
            user_interaction_agenda.ui_state_clear(interaction, $PASTE_RESULT_LIST);
            return additional_terms;
        }
    }

    public static final SubLObject uiat_sc_handle_child_sentence_reader(SubLObject parent, SubLObject child) {
        {
            SubLObject cycl_sentences = user_interaction_agenda.ui_result(child);
            user_interaction_agenda.ui_state_update(parent, $CONSTRAINT_CYCL_SENTENCE, $NONE);
            if (!cycl_sentences.isSymbol()) {
                {
                    SubLObject cdolist_list_var = cycl_sentences;
                    SubLObject cycl_sentence = NIL;
                    for (cycl_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl_sentence = cdolist_list_var.first()) {
                        if (NIL != cycl_utilities.expression_find_if(symbol_function(SM_INDEXICAL_P), cycl_sentence, UNPROVIDED, UNPROVIDED)) {
                            user_interaction_agenda.ui_state_update(parent, $CONSTRAINT_CYCL_SENTENCE, cycl_sentence);
                        }
                    }
                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_sc_handle_child_term_reader(SubLObject parent, SubLObject child) {
        {
            SubLObject interpretation = user_interaction_agenda.ui_result(child);
            SubLObject original_constraint = user_interaction_agenda.ui_state_lookup(child, $ORIGINAL_CONSTRAINT, UNPROVIDED);
            SubLObject original_term = user_interaction_agenda.ui_state_lookup(child, $ORIGINAL_TERM, UNPROVIDED);
            if (NIL != forts.fort_p(interpretation)) {
                nsubst(interpretation, original_term, original_constraint, EQUALP, UNPROVIDED);
            }
            if (NIL == rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(original_constraint)) {
                {
                    SubLObject cycl_constraints = user_interaction_agenda.ui_state_lookup(parent, $CONSTRAINT_CYCL_SENTENCES, UNPROVIDED);
                    cycl_constraints = cons(original_constraint, cycl_constraints);
                    user_interaction_agenda.ui_state_update(parent, $CONSTRAINT_CYCL_SENTENCES, cycl_constraints);
                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_sc_handle_child_concept_in_sentence_disambiguator(SubLObject parent, SubLObject child) {
        {
            SubLObject interpretation = user_interaction_agenda.ui_result(child);
            SubLObject cycl_constraints = user_interaction_agenda.ui_state_lookup(parent, $CONSTRAINT_CYCL_SENTENCES, UNPROVIDED);
            cycl_constraints = cons(interpretation, cycl_constraints);
            user_interaction_agenda.ui_state_update(parent, $CONSTRAINT_CYCL_SENTENCES, cycl_constraints);
        }
        return parent;
    }

    public static final SubLObject uiat_scenario_constructor_child_invalidated(SubLObject parent, SubLObject child) {
        uiat_sc_cleanup_pending_pastes(parent);
        return uiat_scenario_constructor_child_rejected(parent, child);
    }

    public static final SubLObject uiat_scenario_constructor_child_rejected(SubLObject parent, SubLObject child) {
        uiat_sc_cleanup_pending_pastes(parent);
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (((pcase_var.eql($DISAMBIGUATE_PHRASE) || pcase_var.eql($UNKNOWN_TERM)) || pcase_var.eql($SENTENCE_FINDER)) || pcase_var.eql($CONCEPT_DISAMBIGATOR)) {
                return uiat_scenario_constructor_term_not_added_message(parent);
            }
        }
        return parent;
    }

    public static final SubLObject uiat_sc_cleanup_pending_pastes(SubLObject interaction) {
        user_interaction_agenda.ui_state_clear(interaction, $PASTE_CHILD_LIST);
        user_interaction_agenda.ui_state_clear(interaction, $PASTE_RESULT_LIST);
        user_interaction_agenda.ui_state_clear(interaction, $PASTE_CYCL_SENTENCE);
        return interaction;
    }

    public static final SubLObject uiat_sc_handle_child_concept_finder(SubLObject parent, SubLObject child) {
        {
            SubLObject paste_child_list = user_interaction_agenda.ui_state_lookup(parent, $PASTE_CHILD_LIST, UNPROVIDED);
            SubLObject child_id = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
            SubLObject v_term = user_interaction_agenda.ui_result(child);
            SubLObject paste_result_list = user_interaction_agenda.ui_state_lookup(parent, $PASTE_RESULT_LIST, UNPROVIDED);
            paste_result_list = cons(v_term, paste_result_list);
            user_interaction_agenda.ui_state_update(parent, $PASTE_RESULT_LIST, paste_result_list);
            paste_child_list = delete(child_id, paste_child_list, EQUAL, FIRST, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            user_interaction_agenda.ui_state_update(parent, $PASTE_CHILD_LIST, paste_child_list);
            if (NIL == paste_child_list) {
                {
                    SubLObject sentence = user_interaction_agenda.ui_state_lookup(parent, $PASTE_CYCL_SENTENCE, UNPROVIDED);
                    if (NIL != el_utilities.el_formula_p(sentence)) {
                        user_interaction_agenda.ui_state_update(parent, $FOUND_CYCL_SENTENCE, sentence);
                        user_interaction_agenda.ui_state_update(parent, $PASTE_RESULT_LIST, nreverse(paste_result_list));
                    }
                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_scenario_constructor_term_not_added_message(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject message = $$$Term_not_added;
            SubLObject message_action = user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
            user_interaction_agenda.ui_state_clear(interaction, $INDEXICAL_FORT);
            user_interaction_agenda.ui_state_clear(interaction, $INDEXICAL_PHRASE);
            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, message_action);
        }
        return interaction;
    }

    public static final SubLObject uiat_scenario_constructor_constraint_not_understood(SubLObject interaction, SubLObject offender) {
        if (offender == UNPROVIDED) {
            offender = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject message = $str_alt72$The_constraint_could_not_be_added;
                SubLObject message_action = NIL;
                if (NIL != offender) {
                    {
                        SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
                        SubLObject rendering = NIL;
                        SubLObject session = rkf_scenario_constructor.sc_state_active_session(sc_state);
                        SubLObject v_scenario = rkf_scenario_constructor.sc_session_scenario(session);
                        SubLObject indexical_map = rkf_scenario_manipulator.sm_act_construct_indexical_table(v_scenario);
                        {
                            SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                            try {
                                pph_vars.$pph_term_paraphrase_map$.bind(indexical_map, thread);
                                rendering = uia_trampolines.uia_sentence_phrase(v_agenda, offender, UNPROVIDED, UNPROVIDED);
                            } finally {
                                pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
                            }
                        }
                        message = cconcatenate($str_alt73$You_attempted_to_add_the_constrai, new SubLObject[]{ rendering, $str_alt74$___, message });
                    }
                }
                message_action = user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, message_action);
            }
            return interaction;
        }
    }

    public static final SubLObject uiat_scenario_constructor_constraint_non_wff(SubLObject interaction, SubLObject offender) {
        if (offender == UNPROVIDED) {
            offender = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject introduction = $str_alt75$You_attempted_to_add_the_constrai;
                SubLObject explanation = $str_alt76$The_constraint_could_not_be_added;
                SubLObject reasons = user_interaction_agenda.ui_state_lookup(interaction, $THE_WFF_PROBLEM, UNPROVIDED);
                SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
                SubLObject type_violation = NIL;
                SubLObject rendering = NIL;
                SubLObject message_struct = NIL;
                SubLObject message_action = NIL;
                SubLObject datum = reasons;
                SubLObject current = datum;
                SubLObject sentence = NIL;
                SubLObject irec = NIL;
                SubLObject predicate = NIL;
                SubLObject index_col = NIL;
                SubLObject rel_col = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt78);
                sentence = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt78);
                irec = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt78);
                predicate = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt78);
                index_col = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt78);
                rel_col = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == offender) {
                        offender = sentence;
                    }
                    {
                        SubLObject session = rkf_scenario_constructor.sc_state_active_session(sc_state);
                        SubLObject v_scenario = rkf_scenario_constructor.sc_session_scenario(session);
                        SubLObject indexical_map = rkf_scenario_manipulator.sm_act_construct_indexical_table(v_scenario);
                        {
                            SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                            try {
                                pph_vars.$pph_term_paraphrase_map$.bind(indexical_map, thread);
                                rendering = uia_trampolines.uia_sentence_phrase(v_agenda, offender, UNPROVIDED, UNPROVIDED);
                            } finally {
                                pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    {
                        SubLObject header = $str_alt79$It_is_known_that___;
                        SubLObject middle = $str_alt80$But_for_the_constraint__it_would_;
                        SubLObject end = $str_alt81$And_both_cannot_hold_at_the_same_;
                        SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(irec);
                        SubLObject index_formula = list(predicate, indexical, index_col);
                        SubLObject rel_formula = list(predicate, indexical, rel_col);
                        SubLObject index_formulation = NIL;
                        SubLObject rel_formulation = NIL;
                        SubLObject session = rkf_scenario_constructor.sc_state_active_session(sc_state);
                        SubLObject v_scenario = rkf_scenario_constructor.sc_session_scenario(session);
                        SubLObject indexical_map = rkf_scenario_manipulator.sm_act_construct_indexical_table(v_scenario);
                        {
                            SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                            try {
                                pph_vars.$pph_term_paraphrase_map$.bind(indexical_map, thread);
                                index_formulation = uia_trampolines.uia_sentence_phrase(v_agenda, index_formula, UNPROVIDED, UNPROVIDED);
                                rel_formulation = uia_trampolines.uia_sentence_phrase(v_agenda, rel_formula, UNPROVIDED, UNPROVIDED);
                            } finally {
                                pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
                            }
                        }
                        type_violation = list($PARAGRAPH, header, list($BLOCKQUOTE, index_formulation), middle, list($BLOCKQUOTE, rel_formulation), end);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt78);
                }
                message_struct = list($TEXT, introduction, list($BLOCKQUOTE, rendering), explanation, type_violation);
                message_action = uia_tools_basic.uia_act_new_acknowledge_structured_message(v_agenda, message_struct);
                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, message_action);
            }
            user_interaction_agenda.ui_state_clear(interaction, $THE_WFF_PROBLEM);
            return interaction;
        }
    }

    /**
     * Take care of any activities that have accumulated on the stack.
     */
    public static final SubLObject uiat_sc_handle_any_leftovers(SubLObject interaction) {
        {
            SubLObject indexical_phrase = user_interaction_agenda.ui_state_lookup(interaction, $INDEXICAL_PHRASE, $UNDETERMINED);
            SubLObject exemplar = user_interaction_agenda.ui_state_lookup(interaction, $EXEMPLAR, UNPROVIDED);
            SubLObject exemplar_isas = user_interaction_agenda.ui_state_lookup(interaction, $EXEMPLAR_ISAS, NIL);
            SubLObject exemplar_genls = user_interaction_agenda.ui_state_lookup(interaction, $EXEMPLAR_GENLS, NIL);
            SubLObject isa_term = user_interaction_agenda.ui_state_lookup(interaction, $ISA_TERM, $UNDETERMINED);
            SubLObject genl_term = user_interaction_agenda.ui_state_lookup(interaction, $GENL_TERM, $UNDETERMINED);
            SubLObject cloned_constraints = user_interaction_agenda.ui_state_lookup(interaction, $CLONED_CONSTRAINTS, UNPROVIDED);
            SubLObject constraint_cycl_sentence = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_CYCL_SENTENCE, UNPROVIDED);
            SubLObject constraint_cycl_sentences = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_CYCL_SENTENCES, UNPROVIDED);
            if (NIL != forts.fort_p(exemplar)) {
                uiat_sc_add_new_indexical_multiple(interaction, indexical_phrase, exemplar_isas, exemplar_genls);
                user_interaction_agenda.ui_state_clear(interaction, $INDEXICAL_PHRASE);
                user_interaction_agenda.ui_state_clear(interaction, $EXEMPLAR_ISAS);
                user_interaction_agenda.ui_state_clear(interaction, $EXEMPLAR_GENLS);
                user_interaction_agenda.ui_state_clear(interaction, $ISA_TERM);
                user_interaction_agenda.ui_state_clear(interaction, $GENL_TERM);
                indexical_phrase = $UNDETERMINED;
                isa_term = $UNDETERMINED;
                genl_term = $UNDETERMINED;
            }
            if (((!isa_term.eql($UNDETERMINED)) && (!genl_term.eql($UNDETERMINED))) && (!indexical_phrase.eql($UNDETERMINED))) {
                if (genl_term.eql($NONE)) {
                    genl_term = NIL;
                }
                uiat_sc_add_new_indexical(interaction, indexical_phrase, isa_term, genl_term);
                user_interaction_agenda.ui_state_clear(interaction, $ISA_TERM);
                user_interaction_agenda.ui_state_clear(interaction, $GENL_TERM);
                user_interaction_agenda.ui_state_clear(interaction, $INDEXICAL_PHRASE);
            }
            if (NIL != forts.fort_p(exemplar)) {
                user_interaction_agenda.ui_state_clear(interaction, $EXEMPLAR);
                exemplar = NIL;
            }
            if (NIL != cloned_constraints) {
                uiat_sc_handle_cloned_constraints(interaction, cloned_constraints);
            }
            if (NIL != constraint_cycl_sentences) {
                {
                    SubLObject cdolist_list_var = constraint_cycl_sentences;
                    SubLObject constraint_sentence = NIL;
                    for (constraint_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_sentence = cdolist_list_var.first()) {
                        user_interaction_agenda.ui_state_update(interaction, $CONSTRAINT_CYCL_SENTENCE, constraint_sentence);
                        uiat_sc_handle_constraint_parse_result(interaction);
                    }
                }
                user_interaction_agenda.ui_state_clear(interaction, $CONSTRAINT_CYCL_SENTENCES);
            }
            if (NIL != constraint_cycl_sentence) {
                uiat_sc_handle_constraint_parse_result(interaction);
            }
            return interaction;
        }
    }

    public static final SubLObject uiat_sc_signal_any_errors(SubLObject interaction) {
        {
            SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
            SubLObject pcase_var = rkf_scenario_constructor.sc_state_current_act(sc_state);
            if (pcase_var.eql($EXPLAIN_CONSTRAINT_PARSE_FAILED)) {
                user_interaction_agenda.ui_state_clear(interaction, $SC_ACT);
                user_interaction_agenda.ui_state_clear(interaction, $CONSTRAINT_SENTENCE);
                uiat_scenario_constructor_constraint_not_understood(interaction, UNPROVIDED);
                return T;
            } else
                if (pcase_var.eql($EXPLAIN_NON_WFF_CONSTRAINT)) {
                    user_interaction_agenda.ui_state_clear(interaction, $SC_ACT);
                    uiat_scenario_constructor_constraint_non_wff(interaction, UNPROVIDED);
                    return T;
                }

        }
        return NIL;
    }

    public static final SubLObject uiat_scenario_constructor_implementation(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
            SubLObject session = rkf_scenario_constructor.sc_state_active_session(sc_state);
            SubLObject cloned_constraints = user_interaction_agenda.ui_state_lookup(interaction, $CLONED_CONSTRAINTS, UNPROVIDED);
            SubLObject constraint_cycl_sentence = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_CYCL_SENTENCE, UNPROVIDED);
            SubLObject constraint_cycl_sentences = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_CYCL_SENTENCES, UNPROVIDED);
            SubLObject indexical_phrase = user_interaction_agenda.ui_state_lookup(interaction, $INDEXICAL_PHRASE, UNPROVIDED);
            SubLObject isa_term = user_interaction_agenda.ui_state_lookup(interaction, $ISA_TERM, $UNDETERMINED);
            SubLObject genl_term = user_interaction_agenda.ui_state_lookup(interaction, $GENL_TERM, $UNDETERMINED);
            if (((!isa_term.eql($UNDETERMINED)) && (!genl_term.eql($UNDETERMINED))) && (!indexical_phrase.eql($UNDETERMINED))) {
                if (genl_term.eql($NONE)) {
                    genl_term = NIL;
                }
                uiat_sc_add_new_indexical(interaction, indexical_phrase, isa_term, genl_term);
                user_interaction_agenda.ui_state_clear(interaction, $ISA_TERM);
                user_interaction_agenda.ui_state_clear(interaction, $GENL_TERM);
                user_interaction_agenda.ui_state_clear(interaction, $INDEXICAL_PHRASE);
            }
            if (NIL != cloned_constraints) {
                uiat_sc_handle_cloned_constraints(interaction, cloned_constraints);
            }
            if (NIL != constraint_cycl_sentences) {
                {
                    SubLObject cdolist_list_var = constraint_cycl_sentences;
                    SubLObject constraint_sentence = NIL;
                    for (constraint_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_sentence = cdolist_list_var.first()) {
                        user_interaction_agenda.ui_state_update(interaction, $CONSTRAINT_CYCL_SENTENCE, constraint_sentence);
                        uiat_sc_handle_constraint_parse_result(interaction);
                    }
                }
                user_interaction_agenda.ui_state_clear(interaction, $CONSTRAINT_CYCL_SENTENCES);
            }
            if (NIL != constraint_cycl_sentence) {
                uiat_sc_handle_constraint_parse_result(interaction);
            }
            {
                SubLObject pcase_var = rkf_scenario_constructor.sc_state_current_act(sc_state);
                if (pcase_var.eql($PARSE_SCENARIO)) {
                    {
                        SubLObject phrase = user_interaction_agenda.ui_state_lookup(interaction, $SCENARIO_PHRASE, UNPROVIDED);
                        SubLObject scenario_expression = rkf_scenario_constructor.sc_act_determine_scenario_expression(sc_state, phrase);
                        if (NIL != rkf_scenario_manipulator.sm_scenario_expression_p(scenario_expression)) {
                            user_interaction_agenda.ui_state_update(interaction, $SCENARIO_EXPRESSION, scenario_expression);
                        } else {
                            user_interaction_agenda.ui_state_update(interaction, $SCENARIO_EXPRESSION, $NONE);
                        }
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    }
                } else
                    if (pcase_var.eql($PARSE_TERM)) {
                        return uiat_sc_handle_parse_term(interaction);
                    } else
                        if (pcase_var.eql($PARSE_CONSTRAINT)) {
                            {
                                SubLObject v_scenario = rkf_scenario_constructor.sc_session_scenario(session);
                                SubLObject constraint_nl_sentence = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_SENTENCE, UNPROVIDED);
                                if ((!constraint_nl_sentence.isString()) || (NIL != string_utilities.empty_string_p(constraint_nl_sentence))) {
                                    user_interaction_agenda.ui_state_update(interaction, $SC_ACT, $EXPLAIN_CONSTRAINT_PARSE_FAILED);
                                } else {
                                    {
                                        SubLObject indexical_table = rkf_scenario_manipulator.sm_act_construct_indexical_table(v_scenario);
                                        SubLObject constraint_table = rkf_scenario_manipulator.sm_act_construct_indexical_constraint_table(v_scenario);
                                        SubLObject child = cb_uiat_smart.uia_act_new_constraint_reader(v_agenda, $REQUIRED, constraint_nl_sentence, indexical_table, constraint_table);
                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                    }
                                }
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            }
                        } else
                            if (pcase_var.eql($PASTE_CONSTRAINT)) {
                                {
                                    SubLObject v_scenario = rkf_scenario_constructor.sc_session_scenario(session);
                                    SubLObject indexical_table = rkf_scenario_manipulator.sm_act_construct_indexical_table(v_scenario);
                                    SubLObject sentence_finder_action = uia_tools_basic.uia_act_new_sentence_finder(v_agenda, $REQUIRED, indexical_table, UNPROVIDED);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, sentence_finder_action);
                                    user_interaction_agenda.ui_state_clear(interaction, $SC_ACT);
                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                }
                            } else
                                if (pcase_var.eql($EXPLAIN_CONSTRAINT_PARSE_FAILED)) {
                                    user_interaction_agenda.ui_state_clear(interaction, $SC_ACT);
                                    user_interaction_agenda.ui_state_clear(interaction, $CONSTRAINT_SENTENCE);
                                    uiat_scenario_constructor_constraint_not_understood(interaction, UNPROVIDED);
                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                } else
                                    if (pcase_var.eql($EXPLAIN_NON_WFF_CONSTRAINT)) {
                                        user_interaction_agenda.ui_state_clear(interaction, $SC_ACT);
                                        uiat_scenario_constructor_constraint_non_wff(interaction, UNPROVIDED);
                                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                    } else {
                                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                    }





            }
        }
    }

    public static final SubLObject uiat_sc_add_new_indexical_multiple(SubLObject interaction, SubLObject indexical_phrase, SubLObject exemplar_isas, SubLObject exemplar_genls) {
        {
            SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
            SubLObject session = rkf_scenario_constructor.sc_state_active_session(sc_state);
            rkf_scenario_constructor.sc_act_add_new_indexical_multiple(session, indexical_phrase, exemplar_isas, exemplar_genls);
            uiat_sc_add_indexical_distinguishers(interaction, indexical_phrase);
        }
        return interaction;
    }

    public static final SubLObject uiat_sc_add_new_indexical(SubLObject interaction, SubLObject indexical_phrase, SubLObject isa_term, SubLObject genl_term) {
        {
            SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
            SubLObject session = rkf_scenario_constructor.sc_state_active_session(sc_state);
            rkf_scenario_constructor.sc_act_add_new_indexical(session, indexical_phrase, isa_term, genl_term);
            uiat_sc_add_indexical_distinguishers(interaction, indexical_phrase);
        }
        return interaction;
    }

    public static final SubLObject uiat_sc_add_indexical_distinguishers(SubLObject interaction, SubLObject indexical_phrase) {
        {
            SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
            SubLObject session = rkf_scenario_constructor.sc_state_active_session(sc_state);
            SubLObject indexical = rkf_scenario_constructor.sc_act_find_indexical(session, indexical_phrase);
            SubLObject differences = rkf_scenario_constructor.sc_act_suggest_differences(session, indexical);
            if (NIL != differences) {
                {
                    SubLObject cdolist_list_var = differences;
                    SubLObject difference = NIL;
                    for (difference = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , difference = cdolist_list_var.first()) {
                        {
                            SubLObject message = cconcatenate($str_alt98$Currently__we_cannot_prove_that_, new SubLObject[]{ indexical_phrase, $str_alt99$_and_, rkf_scenario_manipulator.sm_indexical_record_preferred_phrase(difference), $str_alt100$_are_always_different__, $str_alt101$so_I_will_assume_that_they_are_ });
                            uia_mumbler.uia_mumble(user_interaction_agenda.ui_agenda(interaction), message);
                            rkf_scenario_constructor.sc_act_distinguish_indexicals(session, indexical, difference);
                        }
                    }
                }
            }
            return interaction;
        }
    }

    public static final SubLObject uiat_sc_handle_parse_term(SubLObject interaction) {
        {
            SubLObject genl_term = user_interaction_agenda.ui_state_lookup(interaction, $GENL_TERM, NIL);
            SubLObject isa_term = user_interaction_agenda.ui_state_lookup(interaction, $ISA_TERM, NIL);
            SubLObject genl_phrase = user_interaction_agenda.ui_state_lookup(interaction, $GENL_PHRASE, NIL);
            SubLObject isa_phrase = user_interaction_agenda.ui_state_lookup(interaction, $ISA_PHRASE, NIL);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject children = NIL;
            user_interaction_agenda.ui_state_clear(interaction, $ISA_PHRASE);
            user_interaction_agenda.ui_state_clear(interaction, $GENL_PHRASE);
            if (NIL == genl_term) {
                genl_term = $NONE;
                if (NIL != genl_phrase) {
                    {
                        SubLObject concept_disambigator_action = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, genl_phrase, $GENL_TERM, $sym102$UIA_COLLECTION_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        children = cons(concept_disambigator_action, children);
                    }
                    if (NIL == isa_phrase) {
                        user_interaction_agenda.ui_state_update(interaction, $ISA_TERM, $$Collection);
                    }
                }
            }
            if (NIL == isa_term) {
                isa_term = $$Thing;
                if (NIL != isa_phrase) {
                    {
                        SubLObject concept_disambigator_action = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, isa_phrase, $ISA_TERM, $sym102$UIA_COLLECTION_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        children = cons(concept_disambigator_action, children);
                    }
                    if (NIL == genl_phrase) {
                        user_interaction_agenda.ui_state_update(interaction, $GENL_TERM, $NONE);
                    }
                }
            }
            if (!((NIL != genl_phrase) || (NIL != isa_phrase))) {
                user_interaction_agenda.ui_state_update(interaction, $ISA_TERM, isa_term);
                user_interaction_agenda.ui_state_update(interaction, $GENL_TERM, genl_term);
            }
            {
                SubLObject cdolist_list_var = children;
                SubLObject child = NIL;
                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                }
            }
            return user_interaction_agenda.uia_generate_next_request(v_agenda);
        }
    }

    /**
     * Given the scenario term and the scenario phrase, reload the scenario from the KB.
     *
     * @unknown it might be a current error in the code that causes the ScenarioInstanceFn
    to be such a weird piece of CycL. In that case, the two empty-list markers would
    be problematic.
     */
    public static final SubLObject uiat_sc_handle_reload_scenario(SubLObject interaction, SubLObject scenario_term, SubLObject scenario_phrase) {
        {
            SubLObject scenario_expression = el_utilities.make_formula($$ScenarioInstanceFn, list(scenario_term, $$TheEmptyList, $$TheEmptyList), UNPROVIDED);
            user_interaction_agenda.ui_state_update(interaction, $SCENARIO_PHRASE, scenario_phrase);
            return uiat_sc_handle_scenario_parsed(interaction, scenario_phrase, scenario_expression);
        }
    }

    /**
     * Parse the phrase given for the scenario if possible.
     */
    public static final SubLObject uiat_sc_handle_parse_scenario(SubLObject interaction, SubLObject scenario_phrase) {
        {
            SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
            SubLObject scenario_expression = rkf_scenario_constructor.sc_act_determine_scenario_expression(sc_state, scenario_phrase);
            if (NIL == rkf_scenario_manipulator.sm_scenario_expression_p(scenario_expression)) {
                scenario_expression = $NONE;
            }
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SCENARIO_PARSED, list($SCENARIO_PHRASE, scenario_phrase, $SCENARIO_EXPRESSION, scenario_expression));
                return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            }
        }
    }

    /**
     * Take what we got for the scenario parse and initialize the scenario state
     * appropriately.
     */
    public static final SubLObject uiat_sc_handle_scenario_parsed(SubLObject interaction, SubLObject scenario_phrase, SubLObject scenario_expression) {
        {
            SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
            SubLObject session = rkf_scenario_constructor.sc_act_initialize_construction_session(sc_state, scenario_phrase);
            if (scenario_expression == $NONE) {
                rkf_scenario_constructor.sc_act_initialize_scenario(sc_state, session, scenario_phrase);
            } else {
                {
                    SubLObject v_scenario = rkf_scenario_constructor.sc_act_initialize_scenario_from_expression(sc_state, scenario_expression, scenario_phrase);
                    rkf_scenario_constructor.sc_set_session_scenario(session, v_scenario);
                }
            }
        }
        return NIL;
    }

    /**
     * Take the indexical-phrase and the other phrases (or the terms, if available),
     * and add a new term to the scenario. If the examplar was filled in, use this as
     * a chance to snarf some constraints from there.
     */
    public static final SubLObject uiat_sc_handle_add_general_term(SubLObject interaction, SubLObject indexical_phrase, SubLObject isa_phrase, SubLObject genl_phrase, SubLObject isa_term, SubLObject genl_term, SubLObject exemplar_phrase) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject children = NIL;
            user_interaction_agenda.ui_state_update(interaction, $INDEXICAL_PHRASE, indexical_phrase);
            if (NIL != exemplar_phrase) {
                {
                    SubLObject concept_disambigator_action = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, exemplar_phrase, $EXEMPLAR_TERM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    children = cons(concept_disambigator_action, children);
                }
            }
            if (NIL == genl_term) {
                genl_term = $NONE;
                if (NIL != genl_phrase) {
                    {
                        SubLObject concept_disambigator_action = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, genl_phrase, $GENL_TERM, $sym102$UIA_COLLECTION_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        children = cons(concept_disambigator_action, children);
                    }
                    if (NIL == isa_phrase) {
                        user_interaction_agenda.ui_state_update(interaction, $ISA_TERM, $$Collection);
                    }
                }
            }
            if (NIL == isa_term) {
                isa_term = $$Thing;
                if (NIL != isa_phrase) {
                    {
                        SubLObject concept_disambigator_action = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, isa_phrase, $ISA_TERM, $sym102$UIA_COLLECTION_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        children = cons(concept_disambigator_action, children);
                    }
                    if (NIL == genl_phrase) {
                        user_interaction_agenda.ui_state_update(interaction, $GENL_TERM, $NONE);
                    }
                }
            }
            if (!((NIL != genl_phrase) || (NIL != isa_phrase))) {
                user_interaction_agenda.ui_state_update(interaction, $ISA_TERM, isa_term);
                user_interaction_agenda.ui_state_update(interaction, $GENL_TERM, genl_term);
            }
            {
                SubLObject cdolist_list_var = children;
                SubLObject child = NIL;
                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                }
            }
        }
        return NIL;
    }

    /**
     * Given an exemplar, extract its definitional information and
     * place that at the disposal of the system.
     */
    public static final SubLObject uiat_sc_handle_successful_exemplar(SubLObject interaction, SubLObject fort) {
        {
            SubLObject domain_mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
            SubLObject min_isas = uiat_sc_min_isa(fort, domain_mt);
            SubLObject min_genls = uiat_sc_min_genls(fort, domain_mt);
            user_interaction_agenda.ui_state_update(interaction, $EXEMPLAR, fort);
            user_interaction_agenda.ui_state_update(interaction, $EXEMPLAR_ISAS, min_isas);
            user_interaction_agenda.ui_state_update(interaction, $EXEMPLAR_MIN_GENLS, min_genls);
            return interaction;
        }
    }

    public static final SubLObject uiat_sc_min_isa(SubLObject v_term, SubLObject domain_mt) {
        return genls.min_cols(rkf_relevance_utilities.rkf_filter_irrelevant_terms(isa.all_isa(v_term, domain_mt, UNPROVIDED), domain_mt), domain_mt, UNPROVIDED);
    }

    public static final SubLObject uiat_sc_min_genls(SubLObject v_term, SubLObject domain_mt) {
        if (NIL != fort_types_interface.collectionP(v_term)) {
            return genls.min_cols(rkf_relevance_utilities.rkf_filter_irrelevant_terms(genls.all_genls(v_term, domain_mt, UNPROVIDED), domain_mt), domain_mt, UNPROVIDED);
        } else {
            return NIL;
        }
    }

    public static final SubLObject uiat_sc_handle_cloned_constraints(SubLObject interaction, SubLObject cloned_constraints) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject good_to_go = NIL;
            {
                SubLObject cdolist_list_var = cloned_constraints;
                SubLObject cloned_constraint = NIL;
                for (cloned_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cloned_constraint = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cloned_constraint;
                        SubLObject current = datum;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_19 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt108);
                            current_19 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt108);
                            if (NIL == member(current_19, $list_alt109, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_19 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt108);
                        }
                        {
                            SubLObject sentence_tail = property_list_member($SENTENCE, current);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject unparsed_phrases_tail = property_list_member($UNPARSED_PHRASES, current);
                            SubLObject unparsed_phrases = (NIL != unparsed_phrases_tail) ? ((SubLObject) (cadr(unparsed_phrases_tail))) : NIL;
                            SubLObject unparsed_arg_positions_tail = property_list_member($UNPARSED_ARG_POSITIONS, current);
                            SubLObject unparsed_arg_positions = (NIL != unparsed_arg_positions_tail) ? ((SubLObject) (cadr(unparsed_arg_positions_tail))) : NIL;
                            SubLObject constraint = sentence;
                            if ((NIL != unparsed_arg_positions) && (NIL != unparsed_phrases)) {
                                {
                                    SubLObject arg_positions_es = list(unparsed_arg_positions);
                                    SubLObject child = uia_tools_basic.uia_act_new_concept_in_sentence_disambiguator(v_agenda, $REQUIRED, unparsed_phrases, arg_positions_es, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    user_interaction_agenda.ui_state_update(child, $ORIGINAL_CONSTRAINT, constraint);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                }
                            } else {
                                good_to_go = cons(constraint, good_to_go);
                            }
                        }
                    }
                }
            }
            if (NIL != good_to_go) {
                {
                    SubLObject constraint_cycl_sentences = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_CYCL_SENTENCES, UNPROVIDED);
                    SubLObject cdolist_list_var = good_to_go;
                    SubLObject goodie = NIL;
                    for (goodie = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , goodie = cdolist_list_var.first()) {
                        constraint_cycl_sentences = cons(goodie, constraint_cycl_sentences);
                    }
                    user_interaction_agenda.ui_state_update(interaction, $CONSTRAINT_CYCL_SENTENCES, constraint_cycl_sentences);
                }
            }
            user_interaction_agenda.ui_state_clear(interaction, $CLONED_CONSTRAINTS);
            return v_agenda;
        }
    }

    public static final SubLObject uiat_sc_handle_constraint_parse_result(SubLObject interaction) {
        {
            SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
            SubLObject constraint_cycl_sentence = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINT_CYCL_SENTENCE, UNPROVIDED);
            user_interaction_agenda.ui_state_clear(interaction, $CONSTRAINT_CYCL_SENTENCE);
            user_interaction_agenda.ui_state_clear(interaction, $CONSTRAINT_SENTENCE);
            user_interaction_agenda.ui_state_clear(interaction, $SC_ACT);
            uiat_sc_handle_constraint_addition(interaction, sc_state, constraint_cycl_sentence);
        }
        return interaction;
    }

    public static final SubLObject uiat_sc_handle_constraint_addition(SubLObject interaction, SubLObject sc_state, SubLObject constraint_cycl_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (constraint_cycl_sentence == $NONE) {
                user_interaction_agenda.ui_state_update(interaction, $SC_ACT, $EXPLAIN_CONSTRAINT_PARSE_FAILED);
            } else
                if (NIL != list_utilities.tree_find_if($sym112$IS_SC_ADJUSTMENT_FIND_AND_PASTE_KEY_, constraint_cycl_sentence, UNPROVIDED)) {
                    uiat_sc_handle_pastes_in_constraint_addition(interaction, constraint_cycl_sentence);
                } else {
                    {
                        SubLObject session = rkf_scenario_constructor.sc_state_active_session(sc_state);
                        thread.resetMultipleValues();
                        {
                            SubLObject status = rkf_scenario_constructor.sc_act_add_new_constraint(session, constraint_cycl_sentence);
                            SubLObject irec = thread.secondMultipleValue();
                            SubLObject predicate = thread.thirdMultipleValue();
                            SubLObject index_col = thread.fourthMultipleValue();
                            SubLObject rel_col = thread.fifthMultipleValue();
                            thread.resetMultipleValues();
                            if (status == $NON_WFF) {
                                user_interaction_agenda.ui_state_update(interaction, $SC_ACT, $EXPLAIN_NON_WFF_CONSTRAINT);
                                user_interaction_agenda.ui_state_update(interaction, $THE_WFF_PROBLEM, list(constraint_cycl_sentence, irec, predicate, index_col, rel_col));
                            }
                        }
                    }
                }

            return interaction;
        }
    }

    public static final SubLObject uiat_sc_handle_add_constraint_sentence(SubLObject interaction, SubLObject sentence) {
        {
            SubLObject sc_state = user_interaction_agenda.ui_state_lookup(interaction, $SC_STATE, UNPROVIDED);
            return uiat_sc_handle_constraint_addition(interaction, sc_state, sentence);
        }
    }

    public static final SubLObject uiat_sc_handle_pastes_in_constraint_addition(SubLObject interaction, SubLObject cycl_sentence) {
        {
            SubLObject pastes_needed = list_utilities.tree_count_if($sym112$IS_SC_ADJUSTMENT_FIND_AND_PASTE_KEY_, cycl_sentence, UNPROVIDED);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject child_list = NIL;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(pastes_needed); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject child = uia_tools_basic.uia_act_new_concept_finder(v_agenda, $REQUIRED, i, UNPROVIDED);
                    user_interaction_agenda.uia_act_add_dependent(user_interaction_agenda.ui_agenda(interaction), interaction, child);
                    child_list = cons(cons(i, child), child_list);
                }
            }
            user_interaction_agenda.ui_state_update(interaction, $PASTE_CHILD_LIST, child_list);
            user_interaction_agenda.ui_state_update(interaction, $PASTE_CYCL_SENTENCE, cycl_sentence);
        }
        return interaction;
    }

    public static final SubLObject uia_act_new_process_descriptor(SubLObject v_agenda, SubLObject mode, SubLObject description_string, SubLObject v_term) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $PROCESS_DESCRIPTOR, list(description_string, v_term), UNPROVIDED);
    }

    public static final SubLObject uiat_process_descriptor_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject description = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt116);
            description = current.first();
            current = current.rest();
            {
                SubLObject v_term = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt116);
                current = current.rest();
                if (NIL == current) {
                    return format(NIL, $str_alt117$Describe_Process____A, description);
                } else {
                    cdestructuring_bind_error(datum, $list_alt116);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_process_descriptor_generate_request(SubLObject interaction) {
        if (NIL == user_interaction_agenda.ui_state_lookup(interaction, $kw118$INITIALIZED_, UNPROVIDED)) {
            uiat_procdesc_constructor(interaction);
        }
        return uiat_procdesc_generate_request_guts(interaction);
    }

    public static final SubLObject uiat_process_descriptor_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($TERM_READER) || pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                {
                    SubLObject verify_existanceP = user_interaction_agenda.ui_state_lookup(child, $VERIFY_EXISTANCE, UNPROVIDED);
                    SubLObject role_tuple = user_interaction_agenda.ui_state_lookup(child, $ROLE_TUPLE_STATE, UNPROVIDED);
                    SubLObject subscene_tuple = user_interaction_agenda.ui_state_lookup(child, $SUBSCENE_TUPLE_STATE, UNPROVIDED);
                    SubLObject solution = user_interaction_agenda.ui_result(child);
                    if (NIL != verify_existanceP) {
                        uiat_procedesc_note_existance_insights(parent, solution);
                    } else
                        if (NIL != role_tuple) {
                            uiat_procdesc_check_updatable_roletuple(parent, role_tuple, solution);
                        } else
                            if (NIL != subscene_tuple) {
                                uiat_procdesc_update_with_subscene_tuple(parent, subscene_tuple, solution);
                            }


                }
            } else
                if (pcase_var.eql($THINKING)) {
                    user_interaction_agenda.ui_state_update(parent, $PHASE, $COMPLETED);
                } else
                    if (pcase_var.eql($PROCESS_DESCRIPTOR)) {
                        {
                            SubLObject subscene_tuple = user_interaction_agenda.ui_state_lookup(child, $SUBSCENE_TUPLE_STATE, UNPROVIDED);
                            SubLObject solution = user_interaction_agenda.ui_result(child);
                            if (NIL != subscene_tuple) {
                                uiat_procdesc_update_with_subscene_tuple(parent, subscene_tuple, solution);
                            }
                        }
                    }


        }
        return parent;
    }

    public static final SubLObject uiat_process_descriptor_child_invalidated(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($TERM_READER) || pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                {
                    SubLObject verify_existanceP = user_interaction_agenda.ui_state_lookup(child, $VERIFY_EXISTANCE, UNPROVIDED);
                    SubLObject role_tuple = user_interaction_agenda.ui_state_lookup(child, $ROLE_TUPLE_STATE, UNPROVIDED);
                    SubLObject subscene_tuple = user_interaction_agenda.ui_state_lookup(child, $SUBSCENE_TUPLE_STATE, UNPROVIDED);
                    if (NIL != verify_existanceP) {
                        uiat_procedesc_note_existance_insights(parent, NIL);
                    } else
                        if (NIL != role_tuple) {
                            uiat_procdesc_check_updatable_roletuple(parent, role_tuple, $NONE);
                        } else
                            if (NIL != subscene_tuple) {
                                uiat_procdesc_update_with_subscene_tuple(parent, subscene_tuple, $NONE);
                            }


                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_process_descriptor_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt8);
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
                if (pcase_var.eql($DONE)) {
                    {
                        SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
                        if (NIL == user_interaction_agenda.ui_state_lookup(interaction, $kw126$TERM_EXISTED_, UNPROVIDED)) {
                            {
                                SubLObject phrase = user_interaction_agenda.ui_state_lookup(interaction, $PROCESS_NAME, UNPROVIDED);
                                uia_tools_salient_descriptor.uia_act_new_salient_descriptor(v_agenda, $RELEVANT, phrase, v_term);
                                cb_uiat_lexification_wizard.uia_act_new_lexification_wizard(v_agenda, v_term, $REQUIRED, UNPROVIDED);
                            }
                        }
                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, v_term);
                    }
                } else
                    if (pcase_var.eql($SELECT_EVENT)) {
                        {
                            SubLObject datum_20 = plist;
                            SubLObject current_21 = datum_20;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_21;
                            SubLObject bad = NIL;
                            SubLObject current_22 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_20, $list_alt130);
                                current_22 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_20, $list_alt130);
                                if (NIL == member(current_22, $list_alt131, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_22 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_20, $list_alt130);
                            }
                            {
                                SubLObject event_tail = property_list_member($EVENT, current_21);
                                SubLObject event = (NIL != event_tail) ? ((SubLObject) (cadr(event_tail))) : NIL;
                                SubLObject status_tail = property_list_member($STATUS, current_21);
                                SubLObject status = (NIL != status_tail) ? ((SubLObject) (cadr(status_tail))) : NIL;
                                uiat_procdesc_handle_event_select(interaction, event, status);
                            }
                        }
                    } else
                        if (pcase_var.eql($ROLES_SELECTED)) {
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
                                    SubLObject role_tuples_tail = property_list_member($ROLE_TUPLES, current_24);
                                    SubLObject role_tuples = (NIL != role_tuples_tail) ? ((SubLObject) (cadr(role_tuples_tail))) : NIL;
                                    SubLObject deletes_tail = property_list_member($DELETES, current_24);
                                    SubLObject deletes = (NIL != deletes_tail) ? ((SubLObject) (cadr(deletes_tail))) : NIL;
                                    if (NIL != deletes) {
                                        uiat_procdes_handle_deleted_previous_roles(interaction, deletes);
                                    }
                                    uiat_procdesc_handle_selected_roles(interaction, role_tuples);
                                }
                            }
                        } else
                            if (pcase_var.eql($BAD_ROLES_SHOWN)) {
                                uiat_procdesc_backup_to_get_roles(interaction);
                            } else
                                if (pcase_var.eql($SUBSCENES_DEFINED)) {
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
                                            SubLObject subscene_tuples_tail = property_list_member($SUBSCENE_TUPLES, current_27);
                                            SubLObject subscene_tuples = (NIL != subscene_tuples_tail) ? ((SubLObject) (cadr(subscene_tuples_tail))) : NIL;
                                            SubLObject deleted_subscenes_tail = property_list_member($DELETED_SUBSCENES, current_27);
                                            SubLObject deleted_subscenes = (NIL != deleted_subscenes_tail) ? ((SubLObject) (cadr(deleted_subscenes_tail))) : NIL;
                                            if (NIL != deleted_subscenes) {
                                                uiat_procdesc_handled_deleted_subscenes(interaction, deleted_subscenes);
                                            }
                                            uiat_procdesc_handle_selected_subscenes(interaction, subscene_tuples);
                                        }
                                    }
                                } else
                                    if (pcase_var.eql($RENDERED)) {
                                        {
                                            SubLObject datum_29 = plist;
                                            SubLObject current_30 = datum_29;
                                            SubLObject allow_other_keys_p = NIL;
                                            SubLObject rest = current_30;
                                            SubLObject bad = NIL;
                                            SubLObject current_31 = NIL;
                                            for (; NIL != rest;) {
                                                destructuring_bind_must_consp(rest, datum_29, $list_alt146);
                                                current_31 = rest.first();
                                                rest = rest.rest();
                                                destructuring_bind_must_consp(rest, datum_29, $list_alt146);
                                                if (NIL == member(current_31, $list_alt147, UNPROVIDED, UNPROVIDED)) {
                                                    bad = T;
                                                }
                                                if (current_31 == $ALLOW_OTHER_KEYS) {
                                                    allow_other_keys_p = rest.first();
                                                }
                                                rest = rest.rest();
                                            }
                                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                cdestructuring_bind_error(datum_29, $list_alt146);
                                            }
                                            {
                                                SubLObject code_tail = property_list_member($CODE, current_30);
                                                SubLObject code = (NIL != code_tail) ? ((SubLObject) (cadr(code_tail))) : NIL;
                                            }
                                        }
                                    } else
                                        if (pcase_var.eql($SUMMARY)) {
                                            uiat_procdesc_handle_summarization(interaction);
                                        }






            }
        }
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $uiat_procdesc_base_event$ = makeSymbol("*UIAT-PROCDESC-BASE-EVENT*");

    public static final SubLObject uiat_procdesc_generate_request_guts(SubLObject interaction) {
        {
            SubLObject phase = user_interaction_agenda.ui_state_lookup(interaction, $PHASE, UNPROVIDED);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject pcase_var = phase;
            if (pcase_var.eql($VERIFY_EXISTANCE)) {
                {
                    SubLObject procname = user_interaction_agenda.ui_state_lookup(interaction, $PROCESS_NAME, UNPROVIDED);
                    SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
                    SubLObject child = NIL;
                    if (NIL != forts.fort_p(v_term)) {
                        uiat_procedesc_note_existance_insights(interaction, v_term);
                    } else {
                        child = uiat_procdesc_launch_subproc(interaction, procname);
                        user_interaction_agenda.ui_state_update(child, $VERIFY_EXISTANCE, $TRUE);
                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                    }
                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                }
            } else
                if (pcase_var.eql($GET_EVENTS)) {
                    {
                        SubLObject procname = user_interaction_agenda.ui_state_lookup(interaction, $PROCESS_NAME, UNPROVIDED);
                        SubLObject parents = user_interaction_agenda.ui_state_lookup(interaction, $PARENTS, UNPROVIDED);
                        SubLObject current = user_interaction_agenda.ui_state_lookup(interaction, $CURRENT, UNPROVIDED);
                        SubLObject children = user_interaction_agenda.ui_state_lookup(interaction, $CHILDREN, UNPROVIDED);
                        SubLObject chosen = user_interaction_agenda.ui_state_lookup(interaction, $CHOSEN, UNPROVIDED);
                        return user_interaction_agenda.make_ui_request(interaction, $SHOW_EVENTS, list(new SubLObject[]{ $PROCNAME, procname, $PARENTS, parents, $CURRENT, current, $CHILDREN, children, $CHOSEN, chosen }));
                    }
                } else
                    if (pcase_var.eql($GET_ROLES)) {
                        {
                            SubLObject procname = user_interaction_agenda.ui_state_lookup(interaction, $PROCESS_NAME, UNPROVIDED);
                            SubLObject roles = user_interaction_agenda.ui_state_lookup(interaction, $ROLES, UNPROVIDED);
                            SubLObject roles_graph = user_interaction_agenda.ui_state_lookup(interaction, $ROLES_GRAPH, UNPROVIDED);
                            SubLObject role_examples = user_interaction_agenda.ui_state_lookup(interaction, $ROLE_EXAMPLES, UNPROVIDED);
                            SubLObject previous_roles = user_interaction_agenda.ui_state_lookup(interaction, $PREVIOUS_ROLES, UNPROVIDED);
                            return user_interaction_agenda.make_ui_request(interaction, $SHOW_ROLES, list(new SubLObject[]{ $PROCNAME, procname, $ROLES, roles, $ROLE_EXAMPLES, role_examples, $ROLES_GRAPH, roles_graph, $PREVIOUS_ROLES, previous_roles }));
                        }
                    } else
                        if (pcase_var.eql($VERIFY_ROLES)) {
                            {
                                SubLObject procname = user_interaction_agenda.ui_state_lookup(interaction, $PROCESS_NAME, UNPROVIDED);
                                SubLObject non_wff_roles = user_interaction_agenda.ui_state_lookup(interaction, $NON_WFF_ROLES, UNPROVIDED);
                                return user_interaction_agenda.make_ui_request(interaction, $BAD_ROLES, list($PROCNAME, procname, $BAD_ROLES, non_wff_roles));
                            }
                        } else
                            if (pcase_var.eql($GET_SUBSCENES)) {
                                {
                                    SubLObject procname = user_interaction_agenda.ui_state_lookup(interaction, $PROCESS_NAME, UNPROVIDED);
                                    SubLObject previous_subscenes = user_interaction_agenda.ui_state_lookup(interaction, $PREVIOUS_SUBSCENES, UNPROVIDED);
                                    return user_interaction_agenda.make_ui_request(interaction, $FETCH_SUBSCENES, list($PROCNAME, procname, $PREVIOUS_SUBSCENES, previous_subscenes));
                                }
                            } else
                                if (pcase_var.eql($SUMMARIZE)) {
                                    {
                                        SubLObject string = user_interaction_agenda.ui_state_lookup(interaction, $SCRIPT_STRING, UNPROVIDED);
                                        if (NIL == string) {
                                            uiat_procdesc_handle_summarization(interaction);
                                            string = user_interaction_agenda.ui_state_lookup(interaction, $SCRIPT_STRING, UNPROVIDED);
                                        }
                                        return user_interaction_agenda.make_ui_request(interaction, $SIMPLE_RENDER, list($STRING, string, $RETURN, ZERO_INTEGER));
                                    }
                                } else
                                    if (pcase_var.eql($SCRIPT_BUILD)) {
                                        uia_tools_basic.uia_act_new_thinking_child(interaction, UIAT_PROCDESC_PERFORM_SCRIPT_BUILD, list(interaction), UNPROVIDED, UNPROVIDED);
                                        sleep(ONE_INTEGER);
                                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                    } else
                                        if (pcase_var.eql($COMPLETED)) {
                                            {
                                                SubLObject procname = user_interaction_agenda.ui_state_lookup(interaction, $PROCESS_NAME, UNPROVIDED);
                                                SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
                                                return user_interaction_agenda.make_ui_request(interaction, $SHOW_TERM, list($PROCNAME, procname, $TERM, v_term));
                                            }
                                        }







        }
        return NIL;
    }

    public static final SubLObject uiat_procdesc_constructor(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject process_name = args.first();
            SubLObject v_term = second(args);
            user_interaction_agenda.ui_state_update(interaction, $TERM, v_term);
            user_interaction_agenda.ui_state_update(interaction, $PROCESS_NAME, process_name);
        }
        {
            SubLObject base_event = user_interaction_agenda.ui_state_lookup(interaction, $BASE_EVENT, uiat_procdesc_specify_base_event(interaction));
            user_interaction_agenda.ui_state_update(interaction, $BASE_EVENT, base_event);
            uiat_procdesc_reset_event_select(interaction);
        }
        user_interaction_agenda.ui_state_update(interaction, $BLUE_GRAPH, uiat_procdesc_allocate_blue_graph());
        user_interaction_agenda.ui_state_update(interaction, $CHOSEN, NIL);
        user_interaction_agenda.ui_state_update(interaction, $PHASE, $VERIFY_EXISTANCE);
        user_interaction_agenda.ui_state_update(interaction, $kw118$INITIALIZED_, T);
        return interaction;
    }

    /**
     *
     *
     * @unknown look this up in the KB
     */
    public static final SubLObject uiat_procdesc_specify_base_event(SubLObject interaction) {
        return $uiat_procdesc_base_event$.getGlobalValue();
    }

    public static final SubLObject uiat_procdesc_handle_summarization(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject build_stream = make_private_string_output_stream();
                {
                    SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding(thread);
                    try {
                        StreamsLow.$standard_output$.bind(build_stream, thread);
                        format(T, $str_alt181$__Process_Name___A__, user_interaction_agenda.ui_state_lookup(interaction, $PROCESS_NAME, UNPROVIDED));
                        format(T, $str_alt182$__Types__);
                        {
                            SubLObject cdolist_list_var = user_interaction_agenda.ui_state_lookup(interaction, $CHOSEN, UNPROVIDED);
                            SubLObject type = NIL;
                            for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                                format(T, $str_alt183$_A_, type);
                            }
                        }
                        format(T, $str_alt184$____Major_Players_and_Roles___);
                        {
                            SubLObject cdolist_list_var = user_interaction_agenda.ui_state_lookup(interaction, $MAJOR_PLAYERS, UNPROVIDED);
                            SubLObject tuple = NIL;
                            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                                format(T, $str_alt185$___A_as__A__, second(tuple), tuple.first());
                            }
                        }
                        format(T, $str_alt187$__Subscene_Inheriting_Players___);
                        {
                            SubLObject cdolist_list_var = user_interaction_agenda.ui_state_lookup(interaction, $SUBSCENE_PLAYERS, UNPROVIDED);
                            SubLObject player = NIL;
                            for (player = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , player = cdolist_list_var.first()) {
                                format(T, $str_alt188$___A__, player);
                            }
                        }
                        format(T, $str_alt190$__Subscenes_in_Order____);
                        {
                            SubLObject list_var = NIL;
                            SubLObject subscene = NIL;
                            SubLObject counter = NIL;
                            for (list_var = user_interaction_agenda.ui_state_lookup(interaction, $SUBSCENE_CHILDREN, UNPROVIDED), subscene = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , subscene = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                {
                                    SubLObject datum = subscene;
                                    SubLObject current = datum;
                                    SubLObject v_term = NIL;
                                    SubLObject firstP = NIL;
                                    SubLObject lastP = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt192);
                                    v_term = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt192);
                                    firstP = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt192);
                                    lastP = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        format(T, $str_alt193$__D___A, counter, v_term);
                                        if (NIL != firstP) {
                                            format(T, $str_alt194$__first_step_);
                                        } else
                                            if (NIL != lastP) {
                                                format(T, $str_alt195$__last_step_);
                                            }

                                        terpri(UNPROVIDED);
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt192);
                                    }
                                }
                            }
                        }
                    } finally {
                        StreamsLow.$standard_output$.rebind(_prev_bind_0, thread);
                    }
                }
                user_interaction_agenda.ui_state_update(interaction, $SCRIPT_STRING, get_output_stream_string(build_stream));
            }
            return NIL;
        }
    }

    public static final SubLObject uiat_procedesc_note_existance_insights(SubLObject interaction, SubLObject result) {
        user_interaction_agenda.ui_state_clear(interaction, $CURRENT_PROCESS);
        if (NIL == result) {
            user_interaction_agenda.ui_state_update(interaction, $PHASE, $GET_EVENTS);
        } else {
            {
                SubLObject interpretation = result.first();
                SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(user_interaction_agenda.ui_agenda(interaction));
                SubLObject v_genls = genls.min_genls(interpretation, mt, UNPROVIDED);
                user_interaction_agenda.ui_state_update(interaction, $TERM, interpretation);
                user_interaction_agenda.ui_state_update(interaction, $kw197$TERM_CREATED_, T);
                user_interaction_agenda.ui_state_update(interaction, $kw126$TERM_EXISTED_, T);
                user_interaction_agenda.ui_state_update(interaction, $CHOSEN, v_genls);
                uiat_procdesc_cleanup_event_select(interaction);
                uiat_procdes_generate_complete_process_graph_from_kb(interaction);
                uiat_procdesc_prepare_get_roles(interaction);
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_procdesc_handle_event_select(SubLObject interaction, SubLObject event_id, SubLObject status) {
        {
            SubLObject pcase_var = status;
            if (pcase_var.eql($DONE)) {
                uiat_procdesc_cleanup_event_select(interaction);
                uiat_procdesc_prepare_get_roles(interaction);
                return interaction;
            } else
                if (pcase_var.eql($DROP)) {
                    {
                        SubLObject events = user_interaction_agenda.ui_state_lookup(interaction, $CHOSEN, UNPROVIDED);
                        events = events.rest();
                        user_interaction_agenda.ui_state_update(interaction, $CHOSEN, events);
                        uiat_procdesc_reset_event_select(interaction);
                    }
                } else
                    if (pcase_var.eql($SELECT)) {
                        {
                            SubLObject event = user_interaction_agenda.ui_state_lookup(interaction, $CURRENT, UNPROVIDED);
                            SubLObject events = user_interaction_agenda.ui_state_lookup(interaction, $CHOSEN, UNPROVIDED);
                            events = cons(event, events);
                            user_interaction_agenda.ui_state_update(interaction, $CHOSEN, events);
                            uiat_procdesc_reset_event_select(interaction);
                        }
                    } else
                        if (pcase_var.eql($ZOOM)) {
                            uiat_procdesc_interpret_event_select(interaction, event_id);
                        }



        }
        return interaction;
    }

    public static final SubLObject uiat_procdesc_reset_event_select(SubLObject interaction) {
        {
            SubLObject event = user_interaction_agenda.ui_state_lookup(interaction, $BASE_EVENT, UNPROVIDED);
            user_interaction_agenda.ui_state_update(interaction, $PARENTS, NIL);
            user_interaction_agenda.ui_state_update(interaction, $CURRENT, event);
            user_interaction_agenda.ui_state_update(interaction, $CHILDREN, NIL);
            uiat_procdesc_compute_event_select(interaction, event);
        }
        return interaction;
    }

    public static final SubLObject uiat_procdesc_cleanup_event_select(SubLObject interaction) {
        user_interaction_agenda.ui_state_update(interaction, $PARENTS, NIL);
        user_interaction_agenda.ui_state_update(interaction, $CURRENT, NIL);
        user_interaction_agenda.ui_state_update(interaction, $CHILDREN, NIL);
        return interaction;
    }

    public static final SubLObject uiat_procdesc_interpret_event_select(SubLObject interaction, SubLObject event_id) {
        {
            SubLObject children = user_interaction_agenda.ui_state_lookup(interaction, $CHILDREN, UNPROVIDED);
            SubLObject parents = user_interaction_agenda.ui_state_lookup(interaction, $PARENTS, UNPROVIDED);
            SubLObject index = NIL;
            SubLObject event = NIL;
            if (event_id.isNegative()) {
                index = subtract(abs(event_id), ONE_INTEGER);
                event = nth(index, parents);
            } else {
                index = subtract(event_id, ONE_INTEGER);
                event = nth(index, children);
            }
            return uiat_procdesc_compute_event_select(interaction, event);
        }
    }

    public static final SubLObject uiat_procdesc_compute_event_select(SubLObject interaction, SubLObject event) {
        {
            SubLObject parents = user_interaction_agenda.ui_state_lookup(interaction, $PARENTS, UNPROVIDED);
            SubLObject current = user_interaction_agenda.ui_state_lookup(interaction, $CURRENT, UNPROVIDED);
            SubLObject children = user_interaction_agenda.ui_state_lookup(interaction, $CHILDREN, UNPROVIDED);
            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(user_interaction_agenda.ui_agenda(interaction));
            current = event;
            children = uiat_procdesc_fetch_event_children(interaction, current, mt);
            parents = genls.min_genls(current, mt, UNPROVIDED);
            user_interaction_agenda.ui_state_update(interaction, $PARENTS, parents);
            user_interaction_agenda.ui_state_update(interaction, $CURRENT, current);
            user_interaction_agenda.ui_state_update(interaction, $CHILDREN, children);
        }
        return interaction;
    }

    // defparameter
    private static final SubLSymbol $uiat_procdesc_sorting_parameter$ = makeSymbol("*UIAT-PROCDESC-SORTING-PARAMETER*");

    public static final SubLObject uiat_procdesc_fetch_event_children(SubLObject interaction, SubLObject event, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject kids = genls.specs(event, mt, UNPROVIDED);
                kids = remove_duplicates(kids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = $uiat_procdesc_sorting_parameter$.currentBinding(thread);
                    try {
                        $uiat_procdesc_sorting_parameter$.bind(interaction, thread);
                        kids = Sort.sort(kids, $sym201$STRING_, UIAT_PROCDESC_EVENT_SORTKEY);
                    } finally {
                        $uiat_procdesc_sorting_parameter$.rebind(_prev_bind_0, thread);
                    }
                }
                return kids;
            }
        }
    }

    public static final SubLObject uiat_procdesc_event_sortkey(SubLObject event) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = $uiat_procdesc_sorting_parameter$.getDynamicValue(thread);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject generation_mt = user_interaction_agenda.ui_generation_language_mt(interaction);
                SubLObject domain_mt = user_interaction_agenda.ui_generation_domain_mt(interaction);
                SubLObject event_name = uia_trampolines.uia_term_phrase(v_agenda, event, generation_mt, domain_mt, UNPROVIDED);
                return event_name;
            }
        }
    }

    public static final SubLObject uiat_procdesc_prepare_get_roles(SubLObject interaction) {
        user_interaction_agenda.ui_state_clear(interaction, $ROLE_TUPLES);
        user_interaction_agenda.ui_state_clear(interaction, $ROLE_CHILDREN);
        user_interaction_agenda.ui_state_clear(interaction, $TROUBLES);
        user_interaction_agenda.ui_state_update(interaction, $PHASE, $GET_ROLES);
        uiat_procdesc_fetch_roles(interaction);
        return interaction;
    }

    public static final SubLObject uiat_procdesc_fetch_roles(SubLObject interaction) {
        {
            SubLObject chosen = user_interaction_agenda.ui_state_lookup(interaction, $CHOSEN, UNPROVIDED);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject variable = $sym205$_WHAT;
            SubLObject query = uiat_procdesc_construct_roles_query(chosen, variable);
            SubLObject roles = NIL;
            SubLObject role_examples = NIL;
            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(user_interaction_agenda.ui_agenda(interaction));
            SubLObject results = fi.fi_ask_int(query, mt, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = results;
            SubLObject result = NIL;
            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                {
                    SubLObject tuple = assoc(variable, result, UNPROVIDED, UNPROVIDED);
                    SubLObject role = tuple.rest();
                    SubLObject example = uia_trampolines.uia_predicate_example_sentence(v_agenda, role, UNPROVIDED);
                    roles = cons(role, roles);
                    role_examples = cons(example, role_examples);
                }
            }
            user_interaction_agenda.ui_state_update(interaction, $ROLES, roles);
            user_interaction_agenda.ui_state_update(interaction, $ROLE_EXAMPLES, role_examples);
            uiat_procdesc_organize_roles(interaction, roles);
            uiat_procdesc_fetch_any_existing_roles(interaction);
        }
        return interaction;
    }

    public static final SubLObject uiat_procdesc_construct_roles_query(SubLObject chosen, SubLObject variable) {
        {
            SubLObject query = NIL;
            SubLObject cdolist_list_var = chosen;
            SubLObject choice = NIL;
            for (choice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , choice = cdolist_list_var.first()) {
                query = cons(list($$rolesForEventType, choice, variable), query);
            }
            query = cons($$or, query);
            query = list($$and, listS($$isa, variable, $list_alt210), query);
            return query;
        }
    }

    public static final SubLObject uiat_procdesc_organize_roles(SubLObject interaction, SubLObject roles) {
        {
            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(user_interaction_agenda.ui_agenda(interaction));
            SubLObject v_graph = uiat_procdesc_compute_roles_graph(roles, mt);
            user_interaction_agenda.ui_state_update(interaction, $ROLES_GRAPH, v_graph);
            return interaction;
        }
    }

    public static final SubLObject uiat_procdesc_compute_roles_graph(SubLObject roles, SubLObject mt) {
        {
            SubLObject v_graph = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            {
                SubLObject list_var = NIL;
                SubLObject role = NIL;
                SubLObject number = NIL;
                for (list_var = roles, role = list_var.first(), number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , role = list_var.first() , number = add(ONE_INTEGER, number)) {
                    {
                        SubLObject subroles_start = add(number, ONE_INTEGER);
                        SubLObject subroles = nthcdr(subroles_start, roles);
                        SubLObject cdolist_list_var = subroles;
                        SubLObject subrole = NIL;
                        for (subrole = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subrole = cdolist_list_var.first()) {
                            if (NIL != genl_predicates.genl_predP(role, subrole, mt, UNPROVIDED)) {
                                dictionary_utilities.dictionary_push(v_graph, role, subrole);
                            } else
                                if (NIL != genl_predicates.spec_predP(role, subrole, mt, UNPROVIDED)) {
                                    dictionary_utilities.dictionary_push(v_graph, subrole, role);
                                }

                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = roles;
                SubLObject role = NIL;
                for (role = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , role = cdolist_list_var.first()) {
                    {
                        SubLObject genl_preds = dictionary.dictionary_lookup(v_graph, role, UNPROVIDED);
                        SubLObject cdolist_list_var_32 = genl_preds;
                        SubLObject genl_pred = NIL;
                        for (genl_pred = cdolist_list_var_32.first(); NIL != cdolist_list_var_32; cdolist_list_var_32 = cdolist_list_var_32.rest() , genl_pred = cdolist_list_var_32.first()) {
                            dictionary.dictionary_remove(v_graph, genl_pred);
                        }
                    }
                }
            }
            return v_graph;
        }
    }

    /**
     * Determine if there are already roles that we have defined and
     * gather these assertions up.
     */
    public static final SubLObject uiat_procdesc_fetch_any_existing_roles(SubLObject interaction) {
        {
            SubLObject previous_roles = NIL;
            user_interaction_agenda.ui_state_clear(interaction, $PREVIOUS_ROLES);
            if (NIL != user_interaction_agenda.ui_state_lookup(interaction, $kw126$TERM_EXISTED_, UNPROVIDED)) {
                {
                    SubLObject roles = user_interaction_agenda.ui_state_lookup(interaction, $ROLES, UNPROVIDED);
                    SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
                    SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(user_interaction_agenda.ui_agenda(interaction));
                    SubLObject v_bindings = uiat_procdesc_fetch_role_type_bindings(v_term, mt);
                    SubLObject cdolist_list_var = v_bindings;
                    SubLObject binding = NIL;
                    for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                        {
                            SubLObject datum = binding;
                            SubLObject current = datum;
                            SubLObject curr_role = NIL;
                            SubLObject curr_type = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt211);
                            curr_role = current.first();
                            current = current.rest();
                            curr_type = current;
                            {
                                SubLObject role_index = position(curr_role, roles, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject subscenesP = uiat_procdesc_check_subscene_state(v_term, curr_type, mt);
                                previous_roles = cons(list(role_index, curr_type, subscenesP), previous_roles);
                            }
                        }
                    }
                    user_interaction_agenda.ui_state_update(interaction, $PREVIOUS_ROLES, previous_roles);
                }
            }
            return previous_roles;
        }
    }

    public static final SubLObject uiat_procdesc_fetch_role_type_bindings(SubLObject process, SubLObject mt) {
        {
            SubLObject type_var = $sym212$_TYPE;
            SubLObject role_var = $sym213$_ROLE;
            SubLObject formula = list($const214$onlyTypePlaysRoleInSubSituationTy, process, type_var, role_var);
            SubLObject v_bindings = fi.fi_ask_int(formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject results = NIL;
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                {
                    SubLObject curr_role = assoc(role_var, binding, UNPROVIDED, UNPROVIDED).rest();
                    SubLObject curr_type = assoc(type_var, binding, UNPROVIDED, UNPROVIDED).rest();
                    results = cons(cons(curr_role, curr_type), results);
                }
            }
            return results;
        }
    }

    /**
     * Check whether this is a case of subscene inheritance.
     */
    public static final SubLObject uiat_procdesc_check_subscene_state(SubLObject v_term, SubLObject type, SubLObject mt) {
        {
            SubLObject formula = list($const215$inheritRolePlayersOfType_SitTypeT, v_term, type);
            return list_utilities.sublisp_boolean(fi.fi_ask_int(formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    public static final SubLObject uiat_procdesc_handle_selected_roles(SubLObject interaction, SubLObject role_tuples) {
        user_interaction_agenda.ui_state_update(interaction, $ROLE_TUPLES, role_tuples);
        {
            SubLObject child_count = ZERO_INTEGER;
            SubLObject cdolist_list_var = role_tuples;
            SubLObject role_tuple = NIL;
            for (role_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , role_tuple = cdolist_list_var.first()) {
                uiat_procdesc_launch_role_term_disambiguator(interaction, role_tuple);
                child_count = add(child_count, ONE_INTEGER);
            }
            user_interaction_agenda.ui_state_update(interaction, $ROLE_CHILDREN, child_count);
            if (child_count.isZero()) {
                user_interaction_agenda.ui_state_update(interaction, $PHASE, $GET_SUBSCENES);
                uiat_procdesc_prepare_subscenes(interaction);
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_procdes_handle_deleted_previous_roles(SubLObject interaction, SubLObject deletes) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject previous_roles = user_interaction_agenda.ui_state_lookup(interaction, $PREVIOUS_ROLES, UNPROVIDED);
            SubLObject roles = user_interaction_agenda.ui_state_lookup(interaction, $ROLES, UNPROVIDED);
            SubLObject process_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
            SubLObject cdolist_list_var = deletes;
            SubLObject delete = NIL;
            for (delete = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , delete = cdolist_list_var.first()) {
                {
                    SubLObject prev_role_desc = find(delete, previous_roles, EQL, FIRST, UNPROVIDED, UNPROVIDED);
                    SubLObject datum = prev_role_desc;
                    SubLObject current = datum;
                    SubLObject role_index = NIL;
                    SubLObject player = NIL;
                    SubLObject subsceneP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt216);
                    role_index = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt216);
                    player = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt216);
                    subsceneP = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject role = nth(role_index, roles);
                            SubLObject formula = list($$onlyTypePlaysRoleInSituationType, process_term, player, role);
                            SubLObject message = uia_trampolines.uia_sentence_phrase(v_agenda, formula, UNPROVIDED, UNPROVIDED);
                            uia_mumbler.uia_mumble(v_agenda, cconcatenate($str_alt218$I_will_forget_what_you_told_me_pr, message));
                            uia_trampolines.uia_unassert(v_agenda, formula);
                        }
                        if (NIL != subsceneP) {
                            {
                                SubLObject formula = list($const219$inheritTypeOfRolePlayers_SitTypeT, process_term, player);
                                SubLObject message = uia_trampolines.uia_sentence_phrase(v_agenda, formula, UNPROVIDED, UNPROVIDED);
                                uia_mumbler.uia_mumble(v_agenda, cconcatenate($str_alt218$I_will_forget_what_you_told_me_pr, message));
                                uia_trampolines.uia_unassert(v_agenda, formula);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt216);
                    }
                }
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_procdesc_launch_role_term_disambiguator(SubLObject interaction, SubLObject role_tuple) {
        {
            SubLObject datum = role_tuple;
            SubLObject current = datum;
            SubLObject index = NIL;
            SubLObject term_name = NIL;
            SubLObject subscenesP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt220);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt220);
            term_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt220);
            subscenesP = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject roles = user_interaction_agenda.ui_state_lookup(interaction, $ROLES, UNPROVIDED);
                    SubLObject role = nth(index, roles);
                    SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                    SubLObject role_constraint = ask_utilities.ask_variable($ISAS, listS($$arg2Isa, role, $list_alt223), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject child = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, term_name, $ROLE_TUPLE, UIAT_PROCDESC_ROLE_TERM_CONSTRAINT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    user_interaction_agenda.ui_state_update(child, $TERM_ROLE_CONSTRAINTS, role_constraint);
                    user_interaction_agenda.ui_state_update(child, $ROLE_TUPLE_STATE, role_tuple);
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt220);
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_procdesc_role_term_constraint(SubLObject interaction, SubLObject v_term) {
        {
            SubLObject constraints = user_interaction_agenda.ui_state_lookup(interaction, $TERM_ROLE_CONSTRAINTS, UNPROVIDED);
            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(user_interaction_agenda.ui_agenda(interaction));
            SubLObject violatesP = NIL;
            SubLObject mumble_message = NIL;
            if (NIL == violatesP) {
                {
                    SubLObject csome_list_var = constraints;
                    SubLObject v_genls = NIL;
                    for (v_genls = csome_list_var.first(); !((NIL != violatesP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_genls = csome_list_var.first()) {
                        if (NIL == genls.genlsP(v_term, v_genls, mt, UNPROVIDED)) {
                            violatesP = T;
                            {
                                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                                SubLObject sentence = list($$genls, v_term, v_genls);
                                SubLObject violation = NIL;
                                if (NIL != wff.el_formula_okP(sentence, user_interaction_agenda.uia_domain_interaction_mt(v_agenda))) {
                                    violation = list($$unknownSentence, sentence);
                                } else {
                                    violation = uia_trampolines.uia_why_not_wff_compliant(v_agenda, sentence, UNPROVIDED);
                                }
                                mumble_message = cconcatenate($str_alt229$The_interpretation__, new SubLObject[]{ uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str_alt230$__can_be_eliminated_because__, uia_trampolines.uia_sentence_phrase(v_agenda, violation, UNPROVIDED, UNPROVIDED) });
                            }
                        }
                    }
                }
            }
            return values(makeBoolean(NIL == violatesP), mumble_message);
        }
    }

    public static final SubLObject uiat_procdesc_check_updatable_roletuple(SubLObject interaction, SubLObject role_tuple, SubLObject solution) {
        {
            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(user_interaction_agenda.ui_agenda(interaction));
            uiat_procdesc_update_rolechild_bookkeeping(interaction);
            if (!((solution != $NONE) && (NIL != at_admitted.admitted_argumentP(solution, TWO_INTEGER, $$onlyTypePlaysRoleInSituationType, mt)))) {
                {
                    SubLObject troubles = user_interaction_agenda.ui_state_lookup(interaction, $TROUBLES, UNPROVIDED);
                    troubles = cons(list(role_tuple, solution), troubles);
                    user_interaction_agenda.ui_state_update(interaction, $TROUBLES, troubles);
                }
                return NIL;
            }
            return uiat_procdesc_update_with_roletuple(interaction, role_tuple, solution);
        }
    }

    public static final SubLObject uiat_procdesc_update_rolechild_bookkeeping(SubLObject interaction) {
        {
            SubLObject child_count = user_interaction_agenda.ui_state_lookup(interaction, $ROLE_CHILDREN, UNPROVIDED);
            child_count = subtract(child_count, ONE_INTEGER);
            user_interaction_agenda.ui_state_update(interaction, $ROLE_CHILDREN, child_count);
            if (child_count.isZero()) {
                user_interaction_agenda.ui_state_update(interaction, $PHASE, $VERIFY_ROLES);
                uiat_procdesc_prepare_role_verification(interaction);
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_procdesc_update_with_roletuple(SubLObject interaction, SubLObject role_tuple, SubLObject solution) {
        {
            SubLObject roles = user_interaction_agenda.ui_state_lookup(interaction, $ROLES, UNPROVIDED);
            SubLObject subscene_players = user_interaction_agenda.ui_state_lookup(interaction, $SUBSCENE_PLAYERS, UNPROVIDED);
            SubLObject major_players = user_interaction_agenda.ui_state_lookup(interaction, $MAJOR_PLAYERS, UNPROVIDED);
            SubLObject datum = role_tuple;
            SubLObject current = datum;
            SubLObject index = NIL;
            SubLObject term_name = NIL;
            SubLObject subscenesP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt220);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt220);
            term_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt220);
            subscenesP = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject role = nth(index, roles);
                    major_players = cons(list(role, solution), major_players);
                    if (NIL != subscenesP) {
                        subscene_players = cons(solution, subscene_players);
                    }
                }
                user_interaction_agenda.ui_state_update(interaction, $SUBSCENE_PLAYERS, subscene_players);
                user_interaction_agenda.ui_state_update(interaction, $MAJOR_PLAYERS, major_players);
            } else {
                cdestructuring_bind_error(datum, $list_alt220);
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_procdesc_prepare_role_verification(SubLObject interaction) {
        {
            SubLObject troubles = user_interaction_agenda.ui_state_lookup(interaction, $TROUBLES, UNPROVIDED);
            SubLObject roles = user_interaction_agenda.ui_state_lookup(interaction, $ROLES, UNPROVIDED);
            SubLObject problems = NIL;
            if (NIL == troubles) {
                uiat_procdesc_done_verifying_roles(interaction);
                return NIL;
            }
            {
                SubLObject cdolist_list_var = troubles;
                SubLObject trouble = NIL;
                for (trouble = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , trouble = cdolist_list_var.first()) {
                    {
                        SubLObject datum = trouble;
                        SubLObject current = datum;
                        SubLObject role_tuple = NIL;
                        SubLObject solution = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt231);
                        role_tuple = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt231);
                        solution = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject datum_33 = role_tuple;
                                SubLObject current_34 = datum_33;
                                SubLObject index = NIL;
                                SubLObject term_name = NIL;
                                SubLObject subscenesP = NIL;
                                destructuring_bind_must_consp(current_34, datum_33, $list_alt220);
                                index = current_34.first();
                                current_34 = current_34.rest();
                                destructuring_bind_must_consp(current_34, datum_33, $list_alt220);
                                term_name = current_34.first();
                                current_34 = current_34.rest();
                                destructuring_bind_must_consp(current_34, datum_33, $list_alt220);
                                subscenesP = current_34.first();
                                current_34 = current_34.rest();
                                if (NIL == current_34) {
                                    {
                                        SubLObject role = nth(index, roles);
                                        SubLObject sentence = uia_trampolines.uia_term_clarifying_sentences(user_interaction_agenda.ui_agenda(interaction), solution, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                                        problems = cons(list(role, term_name, solution, sentence), problems);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_33, $list_alt220);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt231);
                        }
                    }
                }
            }
            user_interaction_agenda.ui_state_update(interaction, $NON_WFF_ROLES, problems);
        }
        return NIL;
    }

    public static final SubLObject uiat_procdesc_backup_to_get_roles(SubLObject interaction) {
        return uiat_procdesc_prepare_get_roles(interaction);
    }

    public static final SubLObject uiat_procdesc_done_verifying_roles(SubLObject interaction) {
        user_interaction_agenda.ui_state_update(interaction, $PHASE, $GET_SUBSCENES);
        uiat_procdesc_prepare_subscenes(interaction);
        return NIL;
    }

    public static final SubLObject uiat_procdesc_prepare_subscenes(SubLObject interaction) {
        user_interaction_agenda.ui_state_update(interaction, $SUBSCENE_COUNT, ZERO_INTEGER);
        user_interaction_agenda.ui_state_update(interaction, $SUBSCENE_CHILDREN, NIL);
        if (NIL != user_interaction_agenda.ui_state_lookup(interaction, $kw126$TERM_EXISTED_, UNPROVIDED)) {
            uiat_procdesc_gather_previous_subscenes(interaction);
        }
        return interaction;
    }

    public static final SubLObject uiat_procdesc_gather_previous_subscenes(SubLObject interaction) {
        {
            SubLObject process = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(user_interaction_agenda.ui_agenda(interaction));
            SubLObject v_graph = uiat_procdesc_fetch_subprocess_bindings(process, mt);
            user_interaction_agenda.ui_state_update(interaction, $PREVIOUS_SUBSCENES, v_graph);
        }
        return interaction;
    }

    /**
     * Collect the subprocesses of the process passed in.
     */
    public static final SubLObject uiat_procdesc_fetch_subprocess_bindings(SubLObject process, SubLObject mt) {
        {
            SubLObject v_graph = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject first_step = NIL;
            first_step = ask_utilities.ask_variable($PROCESS_VAR, listS($$firstProperSubSituationTypes, process, $list_alt235), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
            if (NIL == first_step) {
                first_step = ask_utilities.ask_variable($PROCESS_VAR, listS($$properSubSituationTypes, process, $list_alt235), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
            }
            dictionary.dictionary_enter(v_graph, process, first_step);
            uiat_procdesc_complete_subprocess_graph(process, mt, v_graph);
            return v_graph;
        }
    }

    public static final SubLObject uiat_procdesc_complete_subprocess_graph(SubLObject process, SubLObject mt, SubLObject v_graph) {
        {
            SubLObject first_step = dictionary.dictionary_lookup(v_graph, process, UNPROVIDED);
            SubLObject seen = set.new_set(EQL, UNPROVIDED);
            SubLObject todo = queues.create_queue();
            queues.enqueue(first_step, todo);
            set.set_add(first_step, seen);
            while (NIL == queues.queue_empty_p(todo)) {
                {
                    SubLObject current = NIL;
                    SubLObject children = NIL;
                    current = queues.dequeue(todo);
                    children = ask_utilities.ask_variable($PROCESS_VAR, list($$startsAfterStartOfInSituationType, process, $PROCESS_VAR, current), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    dictionary.dictionary_enter(v_graph, current, children);
                    {
                        SubLObject cdolist_list_var = children;
                        SubLObject child = NIL;
                        for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                            if (NIL == set.set_memberP(child, seen)) {
                                set.set_add(child, seen);
                                queues.enqueue(child, todo);
                            }
                        }
                    }
                }
            } 
        }
        return process;
    }

    public static final SubLObject uiat_procdesc_handle_selected_subscenes(SubLObject interaction, SubLObject subscene_tuples) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject subscene_count = user_interaction_agenda.ui_state_lookup(interaction, $SUBSCENE_COUNT, ZERO_INTEGER);
            user_interaction_agenda.ui_state_update(interaction, $SUBSCENE_TUPLES, subscene_tuples);
            user_interaction_agenda.ui_state_update(interaction, $SUBSCENE_CHILDREN, copy_tree(subscene_tuples));
            {
                SubLObject cdolist_list_var = reverse(subscene_tuples);
                SubLObject tuple = NIL;
                for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                    {
                        SubLObject datum = tuple;
                        SubLObject current = datum;
                        SubLObject subscene_name = NIL;
                        SubLObject firstP = NIL;
                        SubLObject lastP = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt238);
                        subscene_name = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt238);
                        firstP = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt238);
                        lastP = current.first();
                        current = current.rest();
                        {
                            SubLObject step_number = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt238);
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject child = uiat_procdesc_launch_subproc(interaction, subscene_name);
                                    user_interaction_agenda.ui_state_update(child, $SUBSCENE_TUPLE_STATE, tuple);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                    subscene_count = add(subscene_count, ONE_INTEGER);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt238);
                            }
                        }
                    }
                }
            }
            user_interaction_agenda.ui_state_update(interaction, $SUBSCENE_COUNT, subscene_count);
            if (subscene_count.isZero()) {
                user_interaction_agenda.ui_state_update(interaction, $PHASE, $SCRIPT_BUILD);
                uiat_procdesc_prepare_script_build(interaction);
            }
        }
        return interaction;
    }

    /**
     * Support preexisting cases.
     */
    public static final SubLObject uiat_procdesc_launch_subproc(SubLObject interaction, SubLObject name) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject isas = list($$ScriptedEventType);
            SubLObject v_genls = list(uiat_procdesc_specify_base_event(interaction));
            SubLObject existance_checkP = T;
            SubLObject child = cb_uiat_smart.uia_act_new_term_reader(v_agenda, $REQUIRED, name, isas, v_genls, existance_checkP);
            return child;
        }
    }

    /**
     *
     *
     * @unknown Do better later on.
     */
    public static final SubLObject uiat_procdesc_compute_subproc_base_event(SubLObject interaction) {
        {
            SubLObject choices = user_interaction_agenda.ui_state_lookup(interaction, $CHOSEN, UNPROVIDED);
            return choices.first();
        }
    }

    public static final SubLObject uiat_procdesc_update_with_subscene_tuple(SubLObject interaction, SubLObject subscene_tuple, SubLObject solution) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject child_count = user_interaction_agenda.ui_state_lookup(interaction, $SUBSCENE_COUNT, UNPROVIDED);
            SubLObject subscene_children = user_interaction_agenda.ui_state_lookup(interaction, $SUBSCENE_CHILDREN, UNPROVIDED);
            SubLObject subscene = (NIL != forts.fort_p(solution)) ? ((SubLObject) (solution)) : solution.first();
            SubLObject datum = subscene_tuple;
            SubLObject current = datum;
            SubLObject subscene_name = NIL;
            SubLObject firstP = NIL;
            SubLObject lastP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt238);
            subscene_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt238);
            firstP = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt238);
            lastP = current.first();
            current = current.rest();
            {
                SubLObject step_number = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt238);
                current = current.rest();
                if (NIL == current) {
                    if ((NIL == solution) || (solution == $NONE)) {
                        {
                            SubLObject child = uia_act_new_process_descriptor(v_agenda, $REQUIRED, subscene_name, UNPROVIDED);
                            SubLObject base_event = uiat_procdesc_compute_subproc_base_event(interaction);
                            user_interaction_agenda.ui_state_update(child, $SUBSCENE_TUPLE_STATE, subscene_tuple);
                            user_interaction_agenda.ui_state_update(child, $BASE_EVENT, base_event);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            return interaction;
                        }
                    }
                    {
                        SubLObject new_tuple = list(subscene, firstP, lastP, step_number);
                        nsubst(new_tuple, subscene_tuple, subscene_children, EQUAL, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt238);
                }
            }
            user_interaction_agenda.ui_state_update(interaction, $SUBSCENE_CHILDREN, subscene_children);
            child_count = subtract(child_count, ONE_INTEGER);
            user_interaction_agenda.ui_state_update(interaction, $SUBSCENE_COUNT, child_count);
            if (child_count.isZero()) {
                user_interaction_agenda.ui_state_update(interaction, $PHASE, $SCRIPT_BUILD);
                uiat_procdesc_prepare_script_build(interaction);
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_procdesc_handled_deleted_subscenes(SubLObject interaction, SubLObject deletes) {
        {
            SubLObject cdolist_list_var = deletes;
            SubLObject delete = NIL;
            for (delete = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , delete = cdolist_list_var.first()) {
                {
                    SubLObject datum = delete;
                    SubLObject current = datum;
                    SubLObject head = NIL;
                    SubLObject follower = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt240);
                    head = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt240);
                    follower = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        uiat_procdesc_perform_one_subscene_deletion(interaction, head, follower);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt240);
                    }
                }
            }
        }
        return interaction;
    }

    /**
     * first pass -- do better on graph cleanup
     */
    public static final SubLObject uiat_procdesc_perform_one_subscene_deletion(SubLObject interaction, SubLObject head, SubLObject follower) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject process = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
            SubLObject sentence = list($$startsAfterStartOfInSituationType, process, head, follower);
            uia_mumbler.uia_mumble(v_agenda, cconcatenate($str_alt218$I_will_forget_what_you_told_me_pr, uia_trampolines.uia_sentence_phrase(v_agenda, sentence, UNPROVIDED, UNPROVIDED)));
            uia_trampolines.uia_unassert(v_agenda, sentence);
        }
        return interaction;
    }

    public static final SubLObject uiat_procdesc_prepare_script_build(SubLObject interaction) {
        user_interaction_agenda.ui_state_update(interaction, $THE_CYCLIST, operation_communication.the_cyclist());
        return interaction;
    }

    /**
     * Enabled for :thinking protocol.
     */
    public static final SubLObject uiat_procdesc_perform_script_build(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject the_cyclist = user_interaction_agenda.ui_state_lookup(interaction, $THE_CYCLIST, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(the_cyclist, thread);
                        {
                            SubLObject process_name = user_interaction_agenda.ui_state_lookup(interaction, $PROCESS_NAME, UNPROVIDED);
                            SubLObject message = NIL;
                            if (NIL == user_interaction_agenda.ui_state_lookup(interaction, $kw197$TERM_CREATED_, UNPROVIDED)) {
                                message = cconcatenate($str_alt242$Instantiating_the_process_, new SubLObject[]{ process_name, $str_alt243$_itself_ });
                                uia_tools_basic.uiat_thinking_note_progress_message(message, UNPROVIDED);
                                uia_mumbler.uia_mumble(user_interaction_agenda.ui_agenda(interaction), message);
                                uiat_procdesc_instantiate_process(interaction);
                            }
                            if (NIL == user_interaction_agenda.ui_state_lookup(interaction, $kw244$MAJOR_PLAYERS_INSTANTIATED_, UNPROVIDED)) {
                                message = cconcatenate($str_alt245$Assigning_the_key_roles_within_pr, new SubLObject[]{ process_name, $str_alt246$_ });
                                uia_tools_basic.uiat_thinking_note_progress_message(message, UNPROVIDED);
                                uia_mumbler.uia_mumble(user_interaction_agenda.ui_agenda(interaction), message);
                                uiat_procdesc_instantiate_major_players(interaction);
                            }
                            if (NIL == user_interaction_agenda.ui_state_lookup(interaction, $kw247$SUBSCENES_INSTANTIATED_, UNPROVIDED)) {
                                message = cconcatenate($str_alt248$Hooking_up_the_sub_scenes_of_proc, new SubLObject[]{ process_name, $str_alt246$_ });
                                uia_tools_basic.uiat_thinking_note_progress_message(message, UNPROVIDED);
                                uia_mumbler.uia_mumble(user_interaction_agenda.ui_agenda(interaction), message);
                                uiat_procdesc_instantiate_subscenes(interaction);
                            }
                        }
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return interaction;
        }
    }

    public static final SubLObject uiat_procdesc_instantiate_process(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject v_term = NIL;
                if (NIL == user_interaction_agenda.ui_state_lookup(interaction, $kw126$TERM_EXISTED_, UNPROVIDED)) {
                    {
                        SubLObject preferred_name = user_interaction_agenda.ui_state_lookup(interaction, $PROCESS_NAME, UNPROVIDED);
                        SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                        SubLObject lexical_interaction_mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
                        v_term = uia_trampolines.uia_create_concept(preferred_name, domain_interaction_mt, lexical_interaction_mt, UNPROVIDED);
                    }
                    {
                        SubLObject types = user_interaction_agenda.ui_state_lookup(interaction, $CHOSEN, UNPROVIDED);
                        SubLObject tool_key = user_interaction_agenda.ui_operator(interaction);
                        SubLObject tool_cycl = uia_tool_declaration.ui_operator_cycl(tool_key);
                        {
                            SubLObject _prev_bind_0 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
                            try {
                                rkf_macros.$rkf_asserting_tool$.bind(tool_cycl, thread);
                                uia_trampolines.uia_assert(v_agenda, listS($$isa, v_term, $list_alt249), UNPROVIDED);
                                {
                                    SubLObject cdolist_list_var = types;
                                    SubLObject type = NIL;
                                    for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                                        uia_trampolines.uia_assert(v_agenda, list($$genls, v_term, type), UNPROVIDED);
                                    }
                                }
                            } finally {
                                rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    user_interaction_agenda.ui_state_update(interaction, $TERM, v_term);
                    user_interaction_agenda.ui_state_update(interaction, $kw197$TERM_CREATED_, T);
                }
            }
            return interaction;
        }
    }

    public static final SubLObject uiat_procdesc_instantiate_major_players(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
                SubLObject tool_key = user_interaction_agenda.ui_operator(interaction);
                SubLObject tool_cycl = uia_tool_declaration.ui_operator_cycl(tool_key);
                {
                    SubLObject _prev_bind_0 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
                    try {
                        rkf_macros.$rkf_asserting_tool$.bind(tool_cycl, thread);
                        {
                            SubLObject cdolist_list_var = user_interaction_agenda.ui_state_lookup(interaction, $MAJOR_PLAYERS, UNPROVIDED);
                            SubLObject tuple = NIL;
                            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                                {
                                    SubLObject actor = second(tuple);
                                    SubLObject role = tuple.first();
                                    uia_trampolines.uia_assert(v_agenda, list($$onlyTypePlaysRoleInSituationType, v_term, actor, role), UNPROVIDED);
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = user_interaction_agenda.ui_state_lookup(interaction, $SUBSCENE_PLAYERS, UNPROVIDED);
                            SubLObject player = NIL;
                            for (player = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , player = cdolist_list_var.first()) {
                                uia_trampolines.uia_assert(v_agenda, list($const215$inheritRolePlayersOfType_SitTypeT, v_term, player), UNPROVIDED);
                            }
                        }
                    } finally {
                        rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_0, thread);
                    }
                }
                user_interaction_agenda.ui_state_update(interaction, $kw244$MAJOR_PLAYERS_INSTANTIATED_, T);
            }
            return interaction;
        }
    }

    public static final SubLObject uiat_procdesc_instantiate_subscenes(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
                SubLObject subscene_children = user_interaction_agenda.ui_state_lookup(interaction, $SUBSCENE_CHILDREN, UNPROVIDED);
                SubLObject step_table = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject circular_processP = T;
                SubLObject highest = ONE_INTEGER;
                SubLObject tool_key = user_interaction_agenda.ui_operator(interaction);
                SubLObject tool_cycl = uia_tool_declaration.ui_operator_cycl(tool_key);
                {
                    SubLObject _prev_bind_0 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
                    try {
                        rkf_macros.$rkf_asserting_tool$.bind(tool_cycl, thread);
                        {
                            SubLObject list_var = NIL;
                            SubLObject subscene = NIL;
                            SubLObject counter = NIL;
                            for (list_var = subscene_children, subscene = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , subscene = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                {
                                    SubLObject datum = subscene;
                                    SubLObject current = datum;
                                    SubLObject subproc_term = NIL;
                                    SubLObject firstP = NIL;
                                    SubLObject lastP = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt250);
                                    subproc_term = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt250);
                                    firstP = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt250);
                                    lastP = current.first();
                                    current = current.rest();
                                    {
                                        SubLObject step_number = (current.isCons()) ? ((SubLObject) (current.first())) : highest;
                                        destructuring_bind_must_listp(current, datum, $list_alt250);
                                        current = current.rest();
                                        if (NIL == current) {
                                            uia_trampolines.uia_assert(v_agenda, list($$candidateProperSubSituationTypes, v_term, subproc_term), UNPROVIDED);
                                            {
                                                SubLObject table_entry = dictionary.dictionary_lookup(step_table, step_number, UNPROVIDED);
                                                table_entry = cons(subproc_term, table_entry);
                                                dictionary.dictionary_enter(step_table, step_number, table_entry);
                                            }
                                            if ((NIL != circular_processP) && ((NIL != firstP) || (NIL != lastP))) {
                                                circular_processP = NIL;
                                            }
                                            highest = max(highest, step_number);
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt250);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject steps = Sort.sort(dictionary.dictionary_keys(step_table), symbol_function($sym252$_), UNPROVIDED);
                                SubLObject previous = NIL;
                                SubLObject cdolist_list_var = steps;
                                SubLObject step = NIL;
                                for (step = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , step = cdolist_list_var.first()) {
                                    {
                                        SubLObject subproc_terms = dictionary.dictionary_lookup(step_table, step, UNPROVIDED);
                                        SubLObject cdolist_list_var_35 = subproc_terms;
                                        SubLObject subproc_term = NIL;
                                        for (subproc_term = cdolist_list_var_35.first(); NIL != cdolist_list_var_35; cdolist_list_var_35 = cdolist_list_var_35.rest() , subproc_term = cdolist_list_var_35.first()) {
                                            if ((NIL == previous) && (NIL == circular_processP)) {
                                                uia_trampolines.uia_assert(v_agenda, list($$firstProperSubSituationTpes, v_term, subproc_term), UNPROVIDED);
                                            } else
                                                if (step.numE(highest) && (NIL == circular_processP)) {
                                                    uia_trampolines.uia_assert(v_agenda, list($$lastProperSubSituationTypes, v_term, subproc_term), UNPROVIDED);
                                                }

                                            if (NIL != previous) {
                                                {
                                                    SubLObject cdolist_list_var_36 = previous;
                                                    SubLObject previous_term = NIL;
                                                    for (previous_term = cdolist_list_var_36.first(); NIL != cdolist_list_var_36; cdolist_list_var_36 = cdolist_list_var_36.rest() , previous_term = cdolist_list_var_36.first()) {
                                                        uia_trampolines.uia_assert(v_agenda, list($$startsAfterStartOfInSituationType, v_term, subproc_term, previous_term), UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                        previous = subproc_terms;
                                    }
                                }
                            }
                        }
                    } finally {
                        rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            user_interaction_agenda.ui_state_update(interaction, $kw247$SUBSCENES_INSTANTIATED_, T);
            return interaction;
        }
    }

    public static final SubLObject uiat_procdesc_allocate_blue_graph() {
        {
            SubLObject blue_graph = blue_grapher_utilities.new_blue_graph();
            blue_grapher_utilities.blue_graph_add_node_type(blue_graph, $DEFAULT, $GREY);
            blue_grapher_utilities.blue_graph_add_node_type(blue_graph, $PROCESS, $DARK_BLUE);
            blue_grapher_utilities.blue_graph_add_edge_type(blue_graph, $DEFAULT, $CYAN, UNPROVIDED);
            blue_grapher_utilities.blue_graph_add_edge_type(blue_graph, $ROLE_PLAYER, $RED, UNPROVIDED);
            blue_grapher_utilities.blue_graph_add_edge_type(blue_graph, $STARTS_AFTER, $GREEN, $RIGHT);
            blue_grapher_utilities.blue_graph_add_edge_type(blue_graph, $SUBPROCESS, $YELLOW, $DOWN);
            return blue_graph;
        }
    }

    public static final SubLObject uiat_procdes_generate_complete_process_graph_from_kb(SubLObject interaction) {
        {
            SubLObject blue_graph = user_interaction_agenda.ui_state_lookup(interaction, $BLUE_GRAPH, UNPROVIDED);
            SubLObject process = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(user_interaction_agenda.ui_agenda(interaction));
            SubLObject seen = set.new_set(EQL, UNPROVIDED);
            SubLObject todo = queues.create_queue();
            queues.enqueue(process, todo);
            set.set_add(process, seen);
            while (NIL == queues.queue_empty_p(todo)) {
                {
                    SubLObject current = NIL;
                    SubLObject children = NIL;
                    current = queues.dequeue(todo);
                    uiat_procdesc_generate_process_graph_from_kb(interaction, blue_graph, current, mt);
                    children = ask_utilities.ask_variable($SUB_PROCESSES, listS($$properSubSituationTypes, current, $list_alt269), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = children;
                        SubLObject child = NIL;
                        for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                            if (NIL == set.set_memberP(child, seen)) {
                                set.set_add(child, seen);
                                queues.enqueue(child, todo);
                            }
                        }
                    }
                }
            } 
        }
        return interaction;
    }

    public static final SubLObject uiat_procdesc_generate_process_graph_from_kb(SubLObject interaction, SubLObject blue_graph, SubLObject process, SubLObject mt) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            uiat_procdesc_add_fort_to_blue_graph(blue_graph, v_agenda, process, $PROCESS);
            uiat_procdesc_add_role_types_from_kb_to_blue_graph(blue_graph, v_agenda, process, mt);
            uiat_procdesc_add_subprocesses_from_kb_to_blue_graph(blue_graph, v_agenda, process, mt);
        }
        return interaction;
    }

    public static final SubLObject uiat_procdesc_add_role_types_from_kb_to_blue_graph(SubLObject blue_graph, SubLObject v_agenda, SubLObject process, SubLObject mt) {
        {
            SubLObject v_bindings = uiat_procdesc_fetch_role_type_bindings(process, mt);
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                {
                    SubLObject datum = binding;
                    SubLObject current = datum;
                    SubLObject curr_role = NIL;
                    SubLObject curr_type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt211);
                    curr_role = current.first();
                    current = current.rest();
                    curr_type = current;
                    uiat_procdesc_add_fort_to_blue_graph(blue_graph, v_agenda, curr_type, UNPROVIDED);
                    uiat_procdesc_add_fort_labeled_edge_to_blue_graph(blue_graph, v_agenda, process, curr_type, curr_role, $ROLE_PLAYER);
                }
            }
        }
        return blue_graph;
    }

    public static final SubLObject uiat_procdesc_add_subprocesses_from_kb_to_blue_graph(SubLObject blue_graph, SubLObject v_agenda, SubLObject process, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subprocess_graph = uiat_procdesc_fetch_subprocess_bindings(process, mt);
                SubLObject first = NIL;
                SubLObject last = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(subprocess_graph));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject node = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject followers = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (node == process) {
                            first = followers;
                        } else
                            if (NIL == followers) {
                                last = followers;
                            } else {
                                uiat_procdesc_add_fort_to_blue_graph(blue_graph, v_agenda, node, $PROCESS);
                                {
                                    SubLObject cdolist_list_var = followers;
                                    SubLObject follower = NIL;
                                    for (follower = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , follower = cdolist_list_var.first()) {
                                        uiat_procdesc_add_fort_to_blue_graph(blue_graph, v_agenda, follower, $PROCESS);
                                        uiat_procdesc_add_fort_edge_to_blue_graph(blue_graph, v_agenda, node, follower, $SUBPROCESS);
                                    }
                                }
                            }

                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                if ((NIL != first) && (NIL != last)) {
                    uiat_procdesc_add_fort_labeled_edge_to_blue_graph(blue_graph, v_agenda, process, first, $$firstProperSubSituationTypes, $SUBPROCESS);
                    uiat_procdesc_add_fort_labeled_edge_to_blue_graph(blue_graph, v_agenda, process, last, $$lastProperSubSituationTypes, $SUBPROCESS);
                }
                return blue_graph;
            }
        }
    }

    public static final SubLObject uiat_procdesc_add_process_node_to_blue_graph(SubLObject blue_graph, SubLObject interaction) {
        {
            SubLObject procname = user_interaction_agenda.ui_state_lookup(interaction, $PROCESS_NAME, UNPROVIDED);
            blue_grapher_utilities.blue_graph_maybe_add_node(blue_graph, procname, $PROCESS);
        }
        return blue_graph;
    }

    public static final SubLObject uiat_procdesc_add_process_edge_to_blue_graph(SubLObject blue_graph, SubLObject interaction, SubLObject to_fort, SubLObject type, SubLObject fort_label) {
        if (type == UNPROVIDED) {
            type = $DEFAULT;
        }
        if (fort_label == UNPROVIDED) {
            fort_label = NIL;
        }
        {
            SubLObject procname = user_interaction_agenda.ui_state_lookup(interaction, $PROCESS_NAME, UNPROVIDED);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject edge_label = (NIL != forts.fort_p(fort_label)) ? ((SubLObject) (uia_trampolines.uia_term_phrase(v_agenda, fort_label, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : $str_alt270$;
            blue_grapher_utilities.blue_graph_add_edge(blue_graph, procname, uia_trampolines.uia_term_phrase(v_agenda, to_fort, UNPROVIDED, UNPROVIDED, UNPROVIDED), type, edge_label);
        }
        return blue_graph;
    }

    public static final SubLObject uiat_procdesc_add_fort_to_blue_graph(SubLObject blue_graph, SubLObject v_agenda, SubLObject fort, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $DEFAULT;
        }
        blue_grapher_utilities.blue_graph_maybe_add_node(blue_graph, uia_trampolines.uia_term_phrase(v_agenda, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED), type);
        return blue_graph;
    }

    public static final SubLObject uiat_procdesc_add_fort_edge_to_blue_graph(SubLObject blue_graph, SubLObject v_agenda, SubLObject fort1, SubLObject fort2, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $DEFAULT;
        }
        blue_grapher_utilities.blue_graph_add_edge(blue_graph, uia_trampolines.uia_term_phrase(v_agenda, fort1, UNPROVIDED, UNPROVIDED, UNPROVIDED), uia_trampolines.uia_term_phrase(v_agenda, fort2, UNPROVIDED, UNPROVIDED, UNPROVIDED), type, UNPROVIDED);
        return blue_graph;
    }

    public static final SubLObject uiat_procdesc_add_fort_labeled_edge_to_blue_graph(SubLObject blue_graph, SubLObject v_agenda, SubLObject fort1, SubLObject fort2, SubLObject fort_label, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $DEFAULT;
        }
        blue_grapher_utilities.blue_graph_add_edge(blue_graph, uia_trampolines.uia_term_phrase(v_agenda, fort1, UNPROVIDED, UNPROVIDED, UNPROVIDED), uia_trampolines.uia_term_phrase(v_agenda, fort2, UNPROVIDED, UNPROVIDED, UNPROVIDED), type, uia_trampolines.uia_term_phrase(v_agenda, fort_label, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return blue_graph;
    }

    public static final SubLObject declare_uia_tools_wizards_file() {
        declareFunction("uia_act_new_scenario_constructor", "UIA-ACT-NEW-SCENARIO-CONSTRUCTOR", 1, 3, false);
        declareFunction("uiat_scenario_constructor_generate_request", "UIAT-SCENARIO-CONSTRUCTOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_scenario_constructor_handle_reply", "UIAT-SCENARIO-CONSTRUCTOR-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_scenario_constructor_hint", "UIAT-SCENARIO-CONSTRUCTOR-HINT", 1, 0, false);
        declareFunction("uiat_scenario_constructor_child_completed", "UIAT-SCENARIO-CONSTRUCTOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_sc_handle_disambiguate_phrase_or_unknown_term", "UIAT-SC-HANDLE-DISAMBIGUATE-PHRASE-OR-UNKNOWN-TERM", 2, 0, false);
        declareFunction("uiat_sc_handle_concept_disambiguator", "UIAT-SC-HANDLE-CONCEPT-DISAMBIGUATOR", 2, 0, false);
        declareFunction("uiat_sc_handle_child_sentence_finder", "UIAT-SC-HANDLE-CHILD-SENTENCE-FINDER", 2, 0, false);
        declareFunction("uiat_sc_pending_found_sentence", "UIAT-SC-PENDING-FOUND-SENTENCE", 1, 0, false);
        declareFunction("uiat_sc_lookup_pending_found_sentence", "UIAT-SC-LOOKUP-PENDING-FOUND-SENTENCE", 1, 1, false);
        declareFunction("uiat_sc_fetch_pending_found_sentence", "UIAT-SC-FETCH-PENDING-FOUND-SENTENCE", 1, 0, false);
        declareFunction("uiat_sc_fetch_additional_terms", "UIAT-SC-FETCH-ADDITIONAL-TERMS", 1, 0, false);
        declareFunction("uiat_sc_handle_child_sentence_reader", "UIAT-SC-HANDLE-CHILD-SENTENCE-READER", 2, 0, false);
        declareFunction("uiat_sc_handle_child_term_reader", "UIAT-SC-HANDLE-CHILD-TERM-READER", 2, 0, false);
        declareFunction("uiat_sc_handle_child_concept_in_sentence_disambiguator", "UIAT-SC-HANDLE-CHILD-CONCEPT-IN-SENTENCE-DISAMBIGUATOR", 2, 0, false);
        declareFunction("uiat_scenario_constructor_child_invalidated", "UIAT-SCENARIO-CONSTRUCTOR-CHILD-INVALIDATED", 2, 0, false);
        declareFunction("uiat_scenario_constructor_child_rejected", "UIAT-SCENARIO-CONSTRUCTOR-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_sc_cleanup_pending_pastes", "UIAT-SC-CLEANUP-PENDING-PASTES", 1, 0, false);
        declareFunction("uiat_sc_handle_child_concept_finder", "UIAT-SC-HANDLE-CHILD-CONCEPT-FINDER", 2, 0, false);
        declareFunction("uiat_scenario_constructor_term_not_added_message", "UIAT-SCENARIO-CONSTRUCTOR-TERM-NOT-ADDED-MESSAGE", 1, 0, false);
        declareFunction("uiat_scenario_constructor_constraint_not_understood", "UIAT-SCENARIO-CONSTRUCTOR-CONSTRAINT-NOT-UNDERSTOOD", 1, 1, false);
        declareFunction("uiat_scenario_constructor_constraint_non_wff", "UIAT-SCENARIO-CONSTRUCTOR-CONSTRAINT-NON-WFF", 1, 1, false);
        declareFunction("uiat_sc_handle_any_leftovers", "UIAT-SC-HANDLE-ANY-LEFTOVERS", 1, 0, false);
        declareFunction("uiat_sc_signal_any_errors", "UIAT-SC-SIGNAL-ANY-ERRORS", 1, 0, false);
        declareFunction("uiat_scenario_constructor_implementation", "UIAT-SCENARIO-CONSTRUCTOR-IMPLEMENTATION", 1, 0, false);
        declareFunction("uiat_sc_add_new_indexical_multiple", "UIAT-SC-ADD-NEW-INDEXICAL-MULTIPLE", 4, 0, false);
        declareFunction("uiat_sc_add_new_indexical", "UIAT-SC-ADD-NEW-INDEXICAL", 4, 0, false);
        declareFunction("uiat_sc_add_indexical_distinguishers", "UIAT-SC-ADD-INDEXICAL-DISTINGUISHERS", 2, 0, false);
        declareFunction("uiat_sc_handle_parse_term", "UIAT-SC-HANDLE-PARSE-TERM", 1, 0, false);
        declareFunction("uiat_sc_handle_reload_scenario", "UIAT-SC-HANDLE-RELOAD-SCENARIO", 3, 0, false);
        declareFunction("uiat_sc_handle_parse_scenario", "UIAT-SC-HANDLE-PARSE-SCENARIO", 2, 0, false);
        declareFunction("uiat_sc_handle_scenario_parsed", "UIAT-SC-HANDLE-SCENARIO-PARSED", 3, 0, false);
        declareFunction("uiat_sc_handle_add_general_term", "UIAT-SC-HANDLE-ADD-GENERAL-TERM", 7, 0, false);
        declareFunction("uiat_sc_handle_successful_exemplar", "UIAT-SC-HANDLE-SUCCESSFUL-EXEMPLAR", 2, 0, false);
        declareFunction("uiat_sc_min_isa", "UIAT-SC-MIN-ISA", 2, 0, false);
        declareFunction("uiat_sc_min_genls", "UIAT-SC-MIN-GENLS", 2, 0, false);
        declareFunction("uiat_sc_handle_cloned_constraints", "UIAT-SC-HANDLE-CLONED-CONSTRAINTS", 2, 0, false);
        declareFunction("uiat_sc_handle_constraint_parse_result", "UIAT-SC-HANDLE-CONSTRAINT-PARSE-RESULT", 1, 0, false);
        declareFunction("uiat_sc_handle_constraint_addition", "UIAT-SC-HANDLE-CONSTRAINT-ADDITION", 3, 0, false);
        declareFunction("uiat_sc_handle_add_constraint_sentence", "UIAT-SC-HANDLE-ADD-CONSTRAINT-SENTENCE", 2, 0, false);
        declareFunction("uiat_sc_handle_pastes_in_constraint_addition", "UIAT-SC-HANDLE-PASTES-IN-CONSTRAINT-ADDITION", 2, 0, false);
        declareFunction("uia_act_new_process_descriptor", "UIA-ACT-NEW-PROCESS-DESCRIPTOR", 3, 1, false);
        declareFunction("uiat_process_descriptor_hint", "UIAT-PROCESS-DESCRIPTOR-HINT", 1, 0, false);
        declareFunction("uiat_process_descriptor_generate_request", "UIAT-PROCESS-DESCRIPTOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_process_descriptor_child_completed", "UIAT-PROCESS-DESCRIPTOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_process_descriptor_child_invalidated", "UIAT-PROCESS-DESCRIPTOR-CHILD-INVALIDATED", 2, 0, false);
        declareFunction("uiat_process_descriptor_handle_reply", "UIAT-PROCESS-DESCRIPTOR-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_procdesc_generate_request_guts", "UIAT-PROCDESC-GENERATE-REQUEST-GUTS", 1, 0, false);
        declareFunction("uiat_procdesc_constructor", "UIAT-PROCDESC-CONSTRUCTOR", 1, 0, false);
        declareFunction("uiat_procdesc_specify_base_event", "UIAT-PROCDESC-SPECIFY-BASE-EVENT", 1, 0, false);
        declareFunction("uiat_procdesc_handle_summarization", "UIAT-PROCDESC-HANDLE-SUMMARIZATION", 1, 0, false);
        declareFunction("uiat_procedesc_note_existance_insights", "UIAT-PROCEDESC-NOTE-EXISTANCE-INSIGHTS", 2, 0, false);
        declareFunction("uiat_procdesc_handle_event_select", "UIAT-PROCDESC-HANDLE-EVENT-SELECT", 3, 0, false);
        declareFunction("uiat_procdesc_reset_event_select", "UIAT-PROCDESC-RESET-EVENT-SELECT", 1, 0, false);
        declareFunction("uiat_procdesc_cleanup_event_select", "UIAT-PROCDESC-CLEANUP-EVENT-SELECT", 1, 0, false);
        declareFunction("uiat_procdesc_interpret_event_select", "UIAT-PROCDESC-INTERPRET-EVENT-SELECT", 2, 0, false);
        declareFunction("uiat_procdesc_compute_event_select", "UIAT-PROCDESC-COMPUTE-EVENT-SELECT", 2, 0, false);
        declareFunction("uiat_procdesc_fetch_event_children", "UIAT-PROCDESC-FETCH-EVENT-CHILDREN", 3, 0, false);
        declareFunction("uiat_procdesc_event_sortkey", "UIAT-PROCDESC-EVENT-SORTKEY", 1, 0, false);
        declareFunction("uiat_procdesc_prepare_get_roles", "UIAT-PROCDESC-PREPARE-GET-ROLES", 1, 0, false);
        declareFunction("uiat_procdesc_fetch_roles", "UIAT-PROCDESC-FETCH-ROLES", 1, 0, false);
        declareFunction("uiat_procdesc_construct_roles_query", "UIAT-PROCDESC-CONSTRUCT-ROLES-QUERY", 2, 0, false);
        declareFunction("uiat_procdesc_organize_roles", "UIAT-PROCDESC-ORGANIZE-ROLES", 2, 0, false);
        declareFunction("uiat_procdesc_compute_roles_graph", "UIAT-PROCDESC-COMPUTE-ROLES-GRAPH", 2, 0, false);
        declareFunction("uiat_procdesc_fetch_any_existing_roles", "UIAT-PROCDESC-FETCH-ANY-EXISTING-ROLES", 1, 0, false);
        declareFunction("uiat_procdesc_fetch_role_type_bindings", "UIAT-PROCDESC-FETCH-ROLE-TYPE-BINDINGS", 2, 0, false);
        declareFunction("uiat_procdesc_check_subscene_state", "UIAT-PROCDESC-CHECK-SUBSCENE-STATE", 3, 0, false);
        declareFunction("uiat_procdesc_handle_selected_roles", "UIAT-PROCDESC-HANDLE-SELECTED-ROLES", 2, 0, false);
        declareFunction("uiat_procdes_handle_deleted_previous_roles", "UIAT-PROCDES-HANDLE-DELETED-PREVIOUS-ROLES", 2, 0, false);
        declareFunction("uiat_procdesc_launch_role_term_disambiguator", "UIAT-PROCDESC-LAUNCH-ROLE-TERM-DISAMBIGUATOR", 2, 0, false);
        declareFunction("uiat_procdesc_role_term_constraint", "UIAT-PROCDESC-ROLE-TERM-CONSTRAINT", 2, 0, false);
        declareFunction("uiat_procdesc_check_updatable_roletuple", "UIAT-PROCDESC-CHECK-UPDATABLE-ROLETUPLE", 3, 0, false);
        declareFunction("uiat_procdesc_update_rolechild_bookkeeping", "UIAT-PROCDESC-UPDATE-ROLECHILD-BOOKKEEPING", 1, 0, false);
        declareFunction("uiat_procdesc_update_with_roletuple", "UIAT-PROCDESC-UPDATE-WITH-ROLETUPLE", 3, 0, false);
        declareFunction("uiat_procdesc_prepare_role_verification", "UIAT-PROCDESC-PREPARE-ROLE-VERIFICATION", 1, 0, false);
        declareFunction("uiat_procdesc_backup_to_get_roles", "UIAT-PROCDESC-BACKUP-TO-GET-ROLES", 1, 0, false);
        declareFunction("uiat_procdesc_done_verifying_roles", "UIAT-PROCDESC-DONE-VERIFYING-ROLES", 1, 0, false);
        declareFunction("uiat_procdesc_prepare_subscenes", "UIAT-PROCDESC-PREPARE-SUBSCENES", 1, 0, false);
        declareFunction("uiat_procdesc_gather_previous_subscenes", "UIAT-PROCDESC-GATHER-PREVIOUS-SUBSCENES", 1, 0, false);
        declareFunction("uiat_procdesc_fetch_subprocess_bindings", "UIAT-PROCDESC-FETCH-SUBPROCESS-BINDINGS", 2, 0, false);
        declareFunction("uiat_procdesc_complete_subprocess_graph", "UIAT-PROCDESC-COMPLETE-SUBPROCESS-GRAPH", 3, 0, false);
        declareFunction("uiat_procdesc_handle_selected_subscenes", "UIAT-PROCDESC-HANDLE-SELECTED-SUBSCENES", 2, 0, false);
        declareFunction("uiat_procdesc_launch_subproc", "UIAT-PROCDESC-LAUNCH-SUBPROC", 2, 0, false);
        declareFunction("uiat_procdesc_compute_subproc_base_event", "UIAT-PROCDESC-COMPUTE-SUBPROC-BASE-EVENT", 1, 0, false);
        declareFunction("uiat_procdesc_update_with_subscene_tuple", "UIAT-PROCDESC-UPDATE-WITH-SUBSCENE-TUPLE", 3, 0, false);
        declareFunction("uiat_procdesc_handled_deleted_subscenes", "UIAT-PROCDESC-HANDLED-DELETED-SUBSCENES", 2, 0, false);
        declareFunction("uiat_procdesc_perform_one_subscene_deletion", "UIAT-PROCDESC-PERFORM-ONE-SUBSCENE-DELETION", 3, 0, false);
        declareFunction("uiat_procdesc_prepare_script_build", "UIAT-PROCDESC-PREPARE-SCRIPT-BUILD", 1, 0, false);
        declareFunction("uiat_procdesc_perform_script_build", "UIAT-PROCDESC-PERFORM-SCRIPT-BUILD", 1, 0, false);
        declareFunction("uiat_procdesc_instantiate_process", "UIAT-PROCDESC-INSTANTIATE-PROCESS", 1, 0, false);
        declareFunction("uiat_procdesc_instantiate_major_players", "UIAT-PROCDESC-INSTANTIATE-MAJOR-PLAYERS", 1, 0, false);
        declareFunction("uiat_procdesc_instantiate_subscenes", "UIAT-PROCDESC-INSTANTIATE-SUBSCENES", 1, 0, false);
        declareFunction("uiat_procdesc_allocate_blue_graph", "UIAT-PROCDESC-ALLOCATE-BLUE-GRAPH", 0, 0, false);
        declareFunction("uiat_procdes_generate_complete_process_graph_from_kb", "UIAT-PROCDES-GENERATE-COMPLETE-PROCESS-GRAPH-FROM-KB", 1, 0, false);
        declareFunction("uiat_procdesc_generate_process_graph_from_kb", "UIAT-PROCDESC-GENERATE-PROCESS-GRAPH-FROM-KB", 4, 0, false);
        declareFunction("uiat_procdesc_add_role_types_from_kb_to_blue_graph", "UIAT-PROCDESC-ADD-ROLE-TYPES-FROM-KB-TO-BLUE-GRAPH", 4, 0, false);
        declareFunction("uiat_procdesc_add_subprocesses_from_kb_to_blue_graph", "UIAT-PROCDESC-ADD-SUBPROCESSES-FROM-KB-TO-BLUE-GRAPH", 4, 0, false);
        declareFunction("uiat_procdesc_add_process_node_to_blue_graph", "UIAT-PROCDESC-ADD-PROCESS-NODE-TO-BLUE-GRAPH", 2, 0, false);
        declareFunction("uiat_procdesc_add_process_edge_to_blue_graph", "UIAT-PROCDESC-ADD-PROCESS-EDGE-TO-BLUE-GRAPH", 3, 2, false);
        declareFunction("uiat_procdesc_add_fort_to_blue_graph", "UIAT-PROCDESC-ADD-FORT-TO-BLUE-GRAPH", 3, 1, false);
        declareFunction("uiat_procdesc_add_fort_edge_to_blue_graph", "UIAT-PROCDESC-ADD-FORT-EDGE-TO-BLUE-GRAPH", 4, 1, false);
        declareFunction("uiat_procdesc_add_fort_labeled_edge_to_blue_graph", "UIAT-PROCDESC-ADD-FORT-LABELED-EDGE-TO-BLUE-GRAPH", 5, 1, false);
        return NIL;
    }

    public static final SubLObject init_uia_tools_wizards_file() {
        deflexical("*UIAT-PROCDESC-BASE-EVENT*", $$CreationOrDestructionEvent);
        defparameter("*UIAT-PROCDESC-SORTING-PARAMETER*", NIL);
        return NIL;
    }

    public static final SubLObject setup_uia_tools_wizards_file() {
                uia_tool_declaration.declare_uia_tool($SCENARIO_CONSTRUCTOR, $list_alt1);
        uia_tool_declaration.declare_uia_tool($PROCESS_DESCRIPTOR, $list_alt115);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $SCENARIO_CONSTRUCTOR = makeKeyword("SCENARIO-CONSTRUCTOR");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ $NAME, makeString("Scenario Constructor"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-SCENARIO-CONSTRUCTOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-SCENARIO-CONSTRUCTOR-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-SCENARIO-CONSTRUCTOR-HANDLE-REPLY"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-SCENARIO-CONSTRUCTOR-CHILD-COMPLETED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-SCENARIO-CONSTRUCTOR-CHILD-INVALIDATED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-SCENARIO-CONSTRUCTOR-CHILD-REJECTED"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycScenarioDescriber")) });



    private static final SubLSymbol $SC_STATE = makeKeyword("SC-STATE");

    private static final SubLSymbol $ADJUST_SENTENCE = makeKeyword("ADJUST-SENTENCE");



    private static final SubLSymbol $EXTENSION = makeKeyword("EXTENSION");



    static private final SubLList $list_alt8 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("TEMP-PLIST"));





    private static final SubLSymbol $RELOAD_SCENARIO = makeKeyword("RELOAD-SCENARIO");

    static private final SubLList $list_alt12 = list(makeSymbol("&KEY"), makeSymbol("SCENARIO-TERM"), makeSymbol("SCENARIO-PHRASE"));

    static private final SubLList $list_alt13 = list(makeKeyword("SCENARIO-TERM"), makeKeyword("SCENARIO-PHRASE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $SCENARIO_TERM = makeKeyword("SCENARIO-TERM");



    private static final SubLSymbol $FIND_SCENARIO = makeKeyword("FIND-SCENARIO");

    static private final SubLList $list_alt18 = list(makeSymbol("&KEY"), makeSymbol("SCENARIO-PHRASE"));

    static private final SubLList $list_alt19 = list(makeKeyword("SCENARIO-PHRASE"));

    private static final SubLSymbol $SCENARIO_PARSED = makeKeyword("SCENARIO-PARSED");

    static private final SubLList $list_alt21 = list(makeSymbol("&KEY"), makeSymbol("SCENARIO-PHRASE"), makeSymbol("SCENARIO-EXPRESSION"));

    static private final SubLList $list_alt22 = list(makeKeyword("SCENARIO-PHRASE"), makeKeyword("SCENARIO-EXPRESSION"));

    private static final SubLSymbol $SCENARIO_EXPRESSION = makeKeyword("SCENARIO-EXPRESSION");

    private static final SubLSymbol $ADD_GENERAL_TERM = makeKeyword("ADD-GENERAL-TERM");

    static private final SubLList $list_alt25 = list(makeSymbol("&KEY"), makeSymbol("INDEXICAL-PHRASE"), makeSymbol("ISA-PHRASE"), makeSymbol("GENL-PHRASE"), makeSymbol("ISA-TERM"), makeSymbol("GENL-TERM"), makeSymbol("EXEMPLAR-PHRASE"));

    static private final SubLList $list_alt26 = list(makeKeyword("INDEXICAL-PHRASE"), makeKeyword("ISA-PHRASE"), makeKeyword("GENL-PHRASE"), makeKeyword("ISA-TERM"), makeKeyword("GENL-TERM"), makeKeyword("EXEMPLAR-PHRASE"));



    private static final SubLSymbol $ISA_PHRASE = makeKeyword("ISA-PHRASE");

    private static final SubLSymbol $GENL_PHRASE = makeKeyword("GENL-PHRASE");

    private static final SubLSymbol $ISA_TERM = makeKeyword("ISA-TERM");

    private static final SubLSymbol $GENL_TERM = makeKeyword("GENL-TERM");

    private static final SubLSymbol $EXEMPLAR_PHRASE = makeKeyword("EXEMPLAR-PHRASE");

    private static final SubLSymbol $ADD_CONSTRAINT_SENTENCE = makeKeyword("ADD-CONSTRAINT-SENTENCE");

    static private final SubLList $list_alt34 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"));

    static private final SubLList $list_alt35 = list(makeKeyword("SENTENCE"));



    static private final SubLList $list_alt37 = list(makeSymbol("&KEY"), makeSymbol("SCENARIO"));

    static private final SubLList $list_alt38 = list(makeKeyword("SCENARIO"));



    static private final SubLString $str_alt40$Scenario___ = makeString("Scenario : ");

    static private final SubLList $list_alt41 = list(makeSymbol("&OPTIONAL"), makeSymbol("PHRASE"));

    static private final SubLString $$$Scenario_Constructor = makeString("Scenario Constructor");

    private static final SubLSymbol $DISAMBIGUATE_PHRASE = makeKeyword("DISAMBIGUATE-PHRASE");

    private static final SubLSymbol $UNKNOWN_TERM = makeKeyword("UNKNOWN-TERM");

    private static final SubLSymbol $CONCEPT_DISAMBIGUATOR = makeKeyword("CONCEPT-DISAMBIGUATOR");

    private static final SubLSymbol $SENTENCE_FINDER = makeKeyword("SENTENCE-FINDER");

    private static final SubLSymbol $TERM_READER = makeKeyword("TERM-READER");

    private static final SubLSymbol $CONCEPT_IN_SENTENCE_DISAMBIGUATOR = makeKeyword("CONCEPT-IN-SENTENCE-DISAMBIGUATOR");

    private static final SubLSymbol $SENTENCE_READER = makeKeyword("SENTENCE-READER");



    private static final SubLSymbol $ACKNOWLEDGE_STRUCTURED_MESSAGE = makeKeyword("ACKNOWLEDGE-STRUCTURED-MESSAGE");

    private static final SubLSymbol $CONCEPT_FINDER = makeKeyword("CONCEPT-FINDER");

    static private final SubLString $str_alt53$Unhandled_child__A_received_by_pa = makeString("Unhandled child ~A received by parent ~A.~%");



    private static final SubLSymbol $CONSTRAINT_CYCL_SENTENCE = makeKeyword("CONSTRAINT-CYCL-SENTENCE");



    private static final SubLSymbol $INDEXICAL_FORT = makeKeyword("INDEXICAL-FORT");

    private static final SubLSymbol $MY_RESULT_WILL_BE = makeKeyword("MY-RESULT-WILL-BE");

    private static final SubLSymbol $EXEMPLAR_TERM = makeKeyword("EXEMPLAR-TERM");

    private static final SubLSymbol SM_INDEXICAL_P = makeSymbol("SM-INDEXICAL-P");

    private static final SubLSymbol $FOUND_CYCL_SENTENCE = makeKeyword("FOUND-CYCL-SENTENCE");



    private static final SubLSymbol $PASTE_RESULT_LIST = makeKeyword("PASTE-RESULT-LIST");

    private static final SubLSymbol $ORIGINAL_CONSTRAINT = makeKeyword("ORIGINAL-CONSTRAINT");

    private static final SubLSymbol $ORIGINAL_TERM = makeKeyword("ORIGINAL-TERM");

    private static final SubLSymbol $CONSTRAINT_CYCL_SENTENCES = makeKeyword("CONSTRAINT-CYCL-SENTENCES");

    private static final SubLSymbol $CONCEPT_DISAMBIGATOR = makeKeyword("CONCEPT-DISAMBIGATOR");

    private static final SubLSymbol $PASTE_CHILD_LIST = makeKeyword("PASTE-CHILD-LIST");

    private static final SubLSymbol $PASTE_CYCL_SENTENCE = makeKeyword("PASTE-CYCL-SENTENCE");



    static private final SubLString $$$Term_not_added = makeString("Term not added");

    static private final SubLString $str_alt72$The_constraint_could_not_be_added = makeString("The constraint could not be added, either because it was not understood or because it contained none of the current terms.");

    static private final SubLString $str_alt73$You_attempted_to_add_the_constrai = makeString("You attempted to add the constraint: '");

    static private final SubLString $str_alt74$___ = makeString("'. ");

    static private final SubLString $str_alt75$You_attempted_to_add_the_constrai = makeString("You attempted to add the constraint: ");

    static private final SubLString $str_alt76$The_constraint_could_not_be_added = makeString("The constraint could not be added, because it conflicted with existing constraints on -- or knowledge about -- the current terms.");

    private static final SubLSymbol $THE_WFF_PROBLEM = makeKeyword("THE-WFF-PROBLEM");

    static private final SubLList $list_alt78 = list(makeSymbol("SENTENCE"), makeSymbol("IREC"), makeSymbol("PREDICATE"), makeSymbol("INDEX-COL"), makeSymbol("REL-COL"));

    static private final SubLString $str_alt79$It_is_known_that___ = makeString("It is known that : ");

    static private final SubLString $str_alt80$But_for_the_constraint__it_would_ = makeString("But for the constraint, it would have to be the case that : ");

    static private final SubLString $str_alt81$And_both_cannot_hold_at_the_same_ = makeString("And both cannot hold at the same time.");



    private static final SubLSymbol $BLOCKQUOTE = makeKeyword("BLOCKQUOTE");





    private static final SubLSymbol $EXEMPLAR = makeKeyword("EXEMPLAR");

    private static final SubLSymbol $EXEMPLAR_ISAS = makeKeyword("EXEMPLAR-ISAS");

    private static final SubLSymbol $EXEMPLAR_GENLS = makeKeyword("EXEMPLAR-GENLS");

    private static final SubLSymbol $CLONED_CONSTRAINTS = makeKeyword("CLONED-CONSTRAINTS");

    private static final SubLSymbol $EXPLAIN_CONSTRAINT_PARSE_FAILED = makeKeyword("EXPLAIN-CONSTRAINT-PARSE-FAILED");





    private static final SubLSymbol $EXPLAIN_NON_WFF_CONSTRAINT = makeKeyword("EXPLAIN-NON-WFF-CONSTRAINT");







    private static final SubLSymbol $PASTE_CONSTRAINT = makeKeyword("PASTE-CONSTRAINT");

    static private final SubLString $str_alt98$Currently__we_cannot_prove_that_ = makeString("Currently, we cannot prove that ");

    static private final SubLString $str_alt99$_and_ = makeString(" and ");

    static private final SubLString $str_alt100$_are_always_different__ = makeString(" are always different, ");

    static private final SubLString $str_alt101$so_I_will_assume_that_they_are_ = makeString("so I will assume that they are.");

    static private final SubLSymbol $sym102$UIA_COLLECTION_ = makeSymbol("UIA-COLLECTION?");

    public static final SubLObject $$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));

    public static final SubLObject $$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));

    public static final SubLObject $$ScenarioInstanceFn = constant_handles.reader_make_constant_shell(makeString("ScenarioInstanceFn"));

    public static final SubLObject $$TheEmptyList = constant_handles.reader_make_constant_shell(makeString("TheEmptyList"));

    private static final SubLSymbol $EXEMPLAR_MIN_GENLS = makeKeyword("EXEMPLAR-MIN-GENLS");

    static private final SubLList $list_alt108 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"), makeSymbol("UNPARSED-PHRASES"), makeSymbol("UNPARSED-ARG-POSITIONS"));

    static private final SubLList $list_alt109 = list(makeKeyword("SENTENCE"), makeKeyword("UNPARSED-PHRASES"), makeKeyword("UNPARSED-ARG-POSITIONS"));

    private static final SubLSymbol $UNPARSED_PHRASES = makeKeyword("UNPARSED-PHRASES");

    private static final SubLSymbol $UNPARSED_ARG_POSITIONS = makeKeyword("UNPARSED-ARG-POSITIONS");

    static private final SubLSymbol $sym112$IS_SC_ADJUSTMENT_FIND_AND_PASTE_KEY_ = makeSymbol("IS-SC-ADJUSTMENT-FIND-AND-PASTE-KEY?");



    private static final SubLSymbol $PROCESS_DESCRIPTOR = makeKeyword("PROCESS-DESCRIPTOR");

    static private final SubLList $list_alt115 = list(new SubLObject[]{ $NAME, makeString("Process Descriptor"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-PROCESS-DESCRIPTOR-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-PROCESS-DESCRIPTOR-CHILD-COMPLETED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-PROCESS-DESCRIPTOR-CHILD-INVALIDATED"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-PROCESS-DESCRIPTOR-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-PROCESS-DESCRIPTOR-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycProcessDescriptor")) });

    static private final SubLList $list_alt116 = list(makeSymbol("DESCRIPTION"), makeSymbol("&OPTIONAL"), makeSymbol("TERM"));

    static private final SubLString $str_alt117$Describe_Process____A = makeString("Describe Process : ~A");

    public static final SubLSymbol $kw118$INITIALIZED_ = makeKeyword("INITIALIZED?");

    private static final SubLSymbol $VERIFY_EXISTANCE = makeKeyword("VERIFY-EXISTANCE");

    private static final SubLSymbol $ROLE_TUPLE_STATE = makeKeyword("ROLE-TUPLE-STATE");

    private static final SubLSymbol $SUBSCENE_TUPLE_STATE = makeKeyword("SUBSCENE-TUPLE-STATE");









    public static final SubLSymbol $kw126$TERM_EXISTED_ = makeKeyword("TERM-EXISTED?");

    private static final SubLSymbol $PROCESS_NAME = makeKeyword("PROCESS-NAME");



    private static final SubLSymbol $SELECT_EVENT = makeKeyword("SELECT-EVENT");

    static private final SubLList $list_alt130 = list(makeSymbol("&KEY"), makeSymbol("EVENT"), makeSymbol("STATUS"));

    static private final SubLList $list_alt131 = list(makeKeyword("EVENT"), makeKeyword("STATUS"));





    private static final SubLSymbol $ROLES_SELECTED = makeKeyword("ROLES-SELECTED");

    static private final SubLList $list_alt135 = list(makeSymbol("&KEY"), makeSymbol("ROLE-TUPLES"), makeSymbol("DELETES"));

    static private final SubLList $list_alt136 = list(makeKeyword("ROLE-TUPLES"), makeKeyword("DELETES"));

    private static final SubLSymbol $ROLE_TUPLES = makeKeyword("ROLE-TUPLES");

    private static final SubLSymbol $DELETES = makeKeyword("DELETES");

    private static final SubLSymbol $BAD_ROLES_SHOWN = makeKeyword("BAD-ROLES-SHOWN");

    private static final SubLSymbol $SUBSCENES_DEFINED = makeKeyword("SUBSCENES-DEFINED");

    static private final SubLList $list_alt141 = list(makeSymbol("&KEY"), makeSymbol("SUBSCENE-TUPLES"), makeSymbol("DELETED-SUBSCENES"));

    static private final SubLList $list_alt142 = list(makeKeyword("SUBSCENE-TUPLES"), makeKeyword("DELETED-SUBSCENES"));

    private static final SubLSymbol $SUBSCENE_TUPLES = makeKeyword("SUBSCENE-TUPLES");

    private static final SubLSymbol $DELETED_SUBSCENES = makeKeyword("DELETED-SUBSCENES");

    private static final SubLSymbol $RENDERED = makeKeyword("RENDERED");

    static private final SubLList $list_alt146 = list(makeSymbol("&KEY"), makeSymbol("CODE"));

    static private final SubLList $list_alt147 = list($CODE);



    private static final SubLSymbol $SUMMARY = makeKeyword("SUMMARY");

    public static final SubLObject $$CreationOrDestructionEvent = constant_handles.reader_make_constant_shell(makeString("CreationOrDestructionEvent"));



    private static final SubLSymbol $GET_EVENTS = makeKeyword("GET-EVENTS");







    private static final SubLSymbol $CHOSEN = makeKeyword("CHOSEN");

    private static final SubLSymbol $SHOW_EVENTS = makeKeyword("SHOW-EVENTS");

    private static final SubLSymbol $PROCNAME = makeKeyword("PROCNAME");

    private static final SubLSymbol $GET_ROLES = makeKeyword("GET-ROLES");

    private static final SubLSymbol $ROLES = makeKeyword("ROLES");

    private static final SubLSymbol $ROLES_GRAPH = makeKeyword("ROLES-GRAPH");

    private static final SubLSymbol $ROLE_EXAMPLES = makeKeyword("ROLE-EXAMPLES");

    private static final SubLSymbol $PREVIOUS_ROLES = makeKeyword("PREVIOUS-ROLES");

    private static final SubLSymbol $SHOW_ROLES = makeKeyword("SHOW-ROLES");

    private static final SubLSymbol $VERIFY_ROLES = makeKeyword("VERIFY-ROLES");

    private static final SubLSymbol $NON_WFF_ROLES = makeKeyword("NON-WFF-ROLES");

    private static final SubLSymbol $BAD_ROLES = makeKeyword("BAD-ROLES");

    private static final SubLSymbol $GET_SUBSCENES = makeKeyword("GET-SUBSCENES");

    private static final SubLSymbol $PREVIOUS_SUBSCENES = makeKeyword("PREVIOUS-SUBSCENES");

    private static final SubLSymbol $FETCH_SUBSCENES = makeKeyword("FETCH-SUBSCENES");

    private static final SubLSymbol $SUMMARIZE = makeKeyword("SUMMARIZE");

    private static final SubLSymbol $SCRIPT_STRING = makeKeyword("SCRIPT-STRING");

    private static final SubLSymbol $SIMPLE_RENDER = makeKeyword("SIMPLE-RENDER");





    private static final SubLSymbol $SCRIPT_BUILD = makeKeyword("SCRIPT-BUILD");

    private static final SubLSymbol UIAT_PROCDESC_PERFORM_SCRIPT_BUILD = makeSymbol("UIAT-PROCDESC-PERFORM-SCRIPT-BUILD");

    private static final SubLSymbol $SHOW_TERM = makeKeyword("SHOW-TERM");

    private static final SubLSymbol $BASE_EVENT = makeKeyword("BASE-EVENT");

    private static final SubLSymbol $BLUE_GRAPH = makeKeyword("BLUE-GRAPH");

    static private final SubLString $str_alt181$__Process_Name___A__ = makeString("~%Process Name: ~A~%");

    static private final SubLString $str_alt182$__Types__ = makeString("~%Types: ");

    static private final SubLString $str_alt183$_A_ = makeString("~A ");

    static private final SubLString $str_alt184$____Major_Players_and_Roles___ = makeString("~%~%Major Players and Roles:~%");

    static private final SubLString $str_alt185$___A_as__A__ = makeString("  ~A as ~A~%");

    private static final SubLSymbol $MAJOR_PLAYERS = makeKeyword("MAJOR-PLAYERS");

    static private final SubLString $str_alt187$__Subscene_Inheriting_Players___ = makeString("~%Subscene Inheriting Players:~%");

    static private final SubLString $str_alt188$___A__ = makeString("  ~A~%");

    private static final SubLSymbol $SUBSCENE_PLAYERS = makeKeyword("SUBSCENE-PLAYERS");

    static private final SubLString $str_alt190$__Subscenes_in_Order____ = makeString("~%Subscenes in Order: ~%");

    private static final SubLSymbol $SUBSCENE_CHILDREN = makeKeyword("SUBSCENE-CHILDREN");

    static private final SubLList $list_alt192 = list(makeSymbol("TERM"), makeSymbol("FIRST?"), makeSymbol("LAST?"));

    static private final SubLString $str_alt193$__D___A = makeString(" ~D: ~A");

    static private final SubLString $str_alt194$__first_step_ = makeString(" (first step)");

    static private final SubLString $str_alt195$__last_step_ = makeString(" (last step)");



    public static final SubLSymbol $kw197$TERM_CREATED_ = makeKeyword("TERM-CREATED?");




    static private final SubLSymbol $sym201$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol UIAT_PROCDESC_EVENT_SORTKEY = makeSymbol("UIAT-PROCDESC-EVENT-SORTKEY");

    private static final SubLSymbol $ROLE_CHILDREN = makeKeyword("ROLE-CHILDREN");

    private static final SubLSymbol $TROUBLES = makeKeyword("TROUBLES");

    static private final SubLSymbol $sym205$_WHAT = makeSymbol("?WHAT");

    public static final SubLObject $$rolesForEventType = constant_handles.reader_make_constant_shell(makeString("rolesForEventType"));

    public static final SubLObject $$or = constant_handles.reader_make_constant_shell(makeString("or"));

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt210 = list(constant_handles.reader_make_constant_shell(makeString("ActorSlot")));

    static private final SubLList $list_alt211 = cons(makeSymbol("CURR-ROLE"), makeSymbol("CURR-TYPE"));

    static private final SubLSymbol $sym212$_TYPE = makeSymbol("?TYPE");

    static private final SubLSymbol $sym213$_ROLE = makeSymbol("?ROLE");

    public static final SubLObject $const214$onlyTypePlaysRoleInSubSituationTy = constant_handles.reader_make_constant_shell(makeString("onlyTypePlaysRoleInSubSituationType"));

    public static final SubLObject $const215$inheritRolePlayersOfType_SitTypeT = constant_handles.reader_make_constant_shell(makeString("inheritRolePlayersOfType-SitTypeToSubSitType-Unique"));

    static private final SubLList $list_alt216 = list(makeSymbol("ROLE-INDEX"), makeSymbol("PLAYER"), makeSymbol("SUBSCENE?"));

    public static final SubLObject $$onlyTypePlaysRoleInSituationType = constant_handles.reader_make_constant_shell(makeString("onlyTypePlaysRoleInSituationType"));

    static private final SubLString $str_alt218$I_will_forget_what_you_told_me_pr = makeString("I will forget what you told me previously: ");

    public static final SubLObject $const219$inheritTypeOfRolePlayers_SitTypeT = constant_handles.reader_make_constant_shell(makeString("inheritTypeOfRolePlayers-SitTypeToSubSitType-Unique"));

    static private final SubLList $list_alt220 = list(makeSymbol("INDEX"), makeSymbol("TERM-NAME"), makeSymbol("SUBSCENES?"));



    public static final SubLObject $$arg2Isa = constant_handles.reader_make_constant_shell(makeString("arg2Isa"));

    static private final SubLList $list_alt223 = list($ISAS);

    private static final SubLSymbol $ROLE_TUPLE = makeKeyword("ROLE-TUPLE");

    private static final SubLSymbol UIAT_PROCDESC_ROLE_TERM_CONSTRAINT = makeSymbol("UIAT-PROCDESC-ROLE-TERM-CONSTRAINT");

    private static final SubLSymbol $TERM_ROLE_CONSTRAINTS = makeKeyword("TERM-ROLE-CONSTRAINTS");

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    public static final SubLObject $$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));

    static private final SubLString $str_alt229$The_interpretation__ = makeString("The interpretation '");

    static private final SubLString $str_alt230$__can_be_eliminated_because__ = makeString("' can be eliminated because: ");

    static private final SubLList $list_alt231 = list(makeSymbol("ROLE-TUPLE"), makeSymbol("SOLUTION"));

    private static final SubLSymbol $SUBSCENE_COUNT = makeKeyword("SUBSCENE-COUNT");

    private static final SubLSymbol $PROCESS_VAR = makeKeyword("PROCESS-VAR");

    public static final SubLObject $$firstProperSubSituationTypes = constant_handles.reader_make_constant_shell(makeString("firstProperSubSituationTypes"));

    static private final SubLList $list_alt235 = list(makeKeyword("PROCESS-VAR"));

    public static final SubLObject $$properSubSituationTypes = constant_handles.reader_make_constant_shell(makeString("properSubSituationTypes"));

    public static final SubLObject $$startsAfterStartOfInSituationType = constant_handles.reader_make_constant_shell(makeString("startsAfterStartOfInSituationType"));

    static private final SubLList $list_alt238 = list(makeSymbol("SUBSCENE-NAME"), makeSymbol("FIRST?"), makeSymbol("LAST?"), makeSymbol("&OPTIONAL"), makeSymbol("STEP-NUMBER"));

    public static final SubLObject $$ScriptedEventType = constant_handles.reader_make_constant_shell(makeString("ScriptedEventType"));

    static private final SubLList $list_alt240 = list(makeSymbol("HEAD"), makeSymbol("FOLLOWER"));



    static private final SubLString $str_alt242$Instantiating_the_process_ = makeString("Instantiating the process ");

    static private final SubLString $str_alt243$_itself_ = makeString(" itself.");

    public static final SubLSymbol $kw244$MAJOR_PLAYERS_INSTANTIATED_ = makeKeyword("MAJOR-PLAYERS-INSTANTIATED?");

    static private final SubLString $str_alt245$Assigning_the_key_roles_within_pr = makeString("Assigning the key roles within process ");

    static private final SubLString $str_alt246$_ = makeString(".");

    public static final SubLSymbol $kw247$SUBSCENES_INSTANTIATED_ = makeKeyword("SUBSCENES-INSTANTIATED?");

    static private final SubLString $str_alt248$Hooking_up_the_sub_scenes_of_proc = makeString("Hooking up the sub-scenes of process ");

    static private final SubLList $list_alt249 = list(constant_handles.reader_make_constant_shell(makeString("ScriptedEventType")));

    static private final SubLList $list_alt250 = list(makeSymbol("SUBPROC-TERM"), makeSymbol("FIRST?"), makeSymbol("LAST?"), makeSymbol("&OPTIONAL"), list(makeSymbol("STEP-NUMBER"), makeSymbol("HIGHEST")));

    public static final SubLObject $$candidateProperSubSituationTypes = constant_handles.reader_make_constant_shell(makeString("candidateProperSubSituationTypes"));

    static private final SubLSymbol $sym252$_ = makeSymbol("<");

    public static final SubLObject $$firstProperSubSituationTpes = constant_handles.reader_make_constant_shell(makeString("firstProperSubSituationTpes"));

    public static final SubLObject $$lastProperSubSituationTypes = constant_handles.reader_make_constant_shell(makeString("lastProperSubSituationTypes"));




    private static final SubLSymbol $ROLE_PLAYER = makeKeyword("ROLE-PLAYER");



    private static final SubLSymbol $STARTS_AFTER = makeKeyword("STARTS-AFTER");





    private static final SubLSymbol $SUBPROCESS = makeKeyword("SUBPROCESS");





    private static final SubLSymbol $SUB_PROCESSES = makeKeyword("SUB-PROCESSES");

    static private final SubLList $list_alt269 = list(makeKeyword("SUB-PROCESSES"));

    static private final SubLString $str_alt270$ = makeString("");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_uia_tools_wizards_file();
    }

    @Override
    public void initializeVariables() {
        init_uia_tools_wizards_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_uia_tools_wizards_file();
    }
}

