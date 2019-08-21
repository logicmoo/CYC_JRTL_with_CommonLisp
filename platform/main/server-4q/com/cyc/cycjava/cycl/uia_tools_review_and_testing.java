/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.quirk.question;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-TOOLS-REVIEW-AND-TESTING
 *  source file: /cyc/top/cycl/uia-tools-review-and-testing.lisp
 *  created:     2019/07/03 17:37:58
 */
public final class uia_tools_review_and_testing extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_tools_review_and_testing() {
    }

    public static final SubLFile me = new uia_tools_review_and_testing();


    // // Definitions
    public static final SubLObject uia_act_new_common_queries(SubLObject v_agenda, SubLObject mode, SubLObject focus_term) {
        if (focus_term == UNPROVIDED) {
            focus_term = $UNDETERMINED;
        }
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $COMMON_QUERIES, NIL, list($FOCUS_REQUESTED, $FALSE, $FOCUS_TERM, focus_term));
    }

    public static final SubLObject uia_act_new_common_queries_about(SubLObject v_agenda, SubLObject mode) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $COMMON_QUERIES, NIL, list($FOCUS_REQUESTED, $TRUE));
    }

    public static final SubLObject uiat_common_queries_hint(SubLObject interaction) {
        {
            SubLObject focus_term = user_interaction_agenda.ui_state_lookup(interaction, $FOCUS_TERM, $UNDETERMINED);
            if ($UNDETERMINED == focus_term) {
                return $$$Common_Queries;
            }
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject phrase = uia_trampolines.uia_term_phrase(v_agenda, focus_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return format(NIL, $str_alt8$Queries_for__A, phrase);
            }
        }
    }

    public static final SubLObject uiat_common_queries_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject operator = user_interaction_agenda.ui_operator(child);
            SubLObject pcase_var = operator;
            if (pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                {
                    SubLObject v_term = user_interaction_agenda.ui_result(child);
                    user_interaction_agenda.ui_state_update(parent, $FOCUS_TERM, v_term);
                }
            } else
                if (pcase_var.eql($THINKING)) {
                }

        }
        return NIL;
    }

    public static final SubLObject uiat_common_queries_child_rejected(SubLObject parent, SubLObject child) {
        {
            SubLObject operator = user_interaction_agenda.ui_operator(child);
            SubLObject pcase_var = operator;
            if (pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                user_interaction_agenda.ui_state_update(parent, $FOCUS_REQUESTED, $FALSE);
                user_interaction_agenda.ui_state_update(parent, $FOCUS_TERM, $UNDETERMINED);
            } else
                if (pcase_var.eql($THINKING)) {
                    {
                        SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
                        user_interaction_agenda.uia_act_reject(v_agenda, parent);
                    }
                }

        }
        return NIL;
    }

    public static final SubLObject uiat_common_queries_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            if (NIL != args) {
                user_interaction_agenda.ui_state_update(interaction, $FOCUS_REQUESTED, $TRUE);
            }
            {
                SubLObject focus_term = user_interaction_agenda.ui_state_lookup(interaction, $FOCUS_TERM, $UNDETERMINED);
                SubLObject initialized = uiat_common_queries_initialized(v_agenda);
                if (NIL == initialized) {
                    uia_tools_basic.uia_act_new_thinking_child(interaction, UIAT_COMMON_QUERIES_INITIALIZE, list(v_agenda), UNPROVIDED, UNPROVIDED);
                    sleep(ONE_INTEGER);
                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                }
                if ($UNDETERMINED != focus_term) {
                    {
                        SubLObject query_formulas = uiat_common_queries_focus(v_agenda, focus_term);
                        SubLObject query_specs = uiat_common_query_specs_focus(v_agenda, focus_term);
                        return user_interaction_agenda.make_ui_request(interaction, $FOCUS_RESULTS, list($TERM, focus_term, $QUERY_FORMULAS, query_formulas, $QUERY_SPECS, query_specs));
                    }
                }
            }
            if ($TRUE == user_interaction_agenda.ui_state_lookup(interaction, $FOCUS_REQUESTED, $FALSE)) {
                return user_interaction_agenda.make_ui_request(interaction, $FOCUS_REQUESTED, list($ARGS, args));
            }
            {
                SubLObject queries = uia_trampolines.uia_example_queries(v_agenda);
                return user_interaction_agenda.make_ui_request(interaction, $SHOW_ALL, list($QUERIES, queries));
            }
        }
    }

    public static final SubLObject uiat_common_queries_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt19);
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
                if (pcase_var.eql($ASK)) {
                    {
                        SubLObject datum_1 = plist;
                        SubLObject current_2 = datum_1;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_2;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_1, $list_alt23);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_1, $list_alt23);
                            if (NIL == member(current_3, $list_alt24, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_1, $list_alt23);
                        }
                        {
                            SubLObject query_type_tail = property_list_member($QUERY_TYPE, current_2);
                            SubLObject query_type = (NIL != query_type_tail) ? ((SubLObject) (cadr(query_type_tail))) : NIL;
                            SubLObject query_tail = property_list_member($QUERY, current_2);
                            SubLObject query = (NIL != query_tail) ? ((SubLObject) (cadr(query_tail))) : NIL;
                            SubLObject child = NIL;
                            SubLObject pcase_var_4 = query_type;
                            if (pcase_var_4.eql($QUERY)) {
                                {
                                    SubLObject text = uia_trampolines.uia_query_phrase(v_agenda, query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    child = cb_uia_tools_review_and_testing.uia_act_new_solution_finder(v_agenda, text, query, $REQUIRED, $list_alt29);
                                }
                            } else
                                if (pcase_var_4.eql($QUERY_SPEC)) {
                                    {
                                        SubLObject query_formula = new_cycl_query_specification.new_cycl_query_specification_formula(query);
                                        SubLObject text = uia_trampolines.uia_query_phrase(v_agenda, query_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        child = cb_uia_tools_review_and_testing.uia_act_new_solution_finder_from_query_spec(v_agenda, query, text, $REQUIRED);
                                    }
                                }

                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                        }
                    }
                } else
                    if (pcase_var.eql($FOCUS_REQUESTED)) {
                        user_interaction_agenda.ui_state_update(interaction, $FOCUS_REQUESTED, $TRUE);
                        user_interaction_agenda.ui_state_update(interaction, $FOCUS_TERM, $UNDETERMINED);
                    } else
                        if (pcase_var.eql($FOCUS_CLEARED)) {
                            user_interaction_agenda.ui_state_update(interaction, $FOCUS_REQUESTED, $FALSE);
                            user_interaction_agenda.ui_state_update(interaction, $FOCUS_TERM, $UNDETERMINED);
                        } else
                            if (pcase_var.eql($FOCUS_SPECIFIED)) {
                                {
                                    SubLObject datum_5 = plist;
                                    SubLObject current_6 = datum_5;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current_6;
                                    SubLObject bad = NIL;
                                    SubLObject current_7 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum_5, $list_alt33);
                                        current_7 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum_5, $list_alt33);
                                        if (NIL == member(current_7, $list_alt34, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_7 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum_5, $list_alt33);
                                    }
                                    {
                                        SubLObject phrase_tail = property_list_member($PHRASE, current_6);
                                        SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                                        SubLObject child = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                    }
                                }
                            }



            }
        }
        return NIL;
    }

    public static final SubLObject uiat_common_queries_initialized(SubLObject v_agenda) {
        return uia_trampolines.uia_example_queries_already_memoized(v_agenda);
    }

    public static final SubLObject uiat_common_queries_focus(SubLObject v_agenda, SubLObject focus_term) {
        return uia_trampolines.uia_example_term_queries(v_agenda, focus_term);
    }

    public static final SubLObject uiat_common_query_specs_focus(SubLObject v_agenda, SubLObject focus_term) {
        return uia_trampolines.uia_test_questions_for_term(v_agenda, focus_term);
    }

    /**
     * Initialize the example queries for AGENDA.  Suitable for a :thinking process.
     */
    public static final SubLObject uiat_common_queries_initialize(SubLObject v_agenda) {
        {
            SubLObject queries = NIL;
            uia_tools_basic.uiat_thinking_note_progress_message($str_alt36$Computing_example_queries_, UNPROVIDED);
            queries = uia_trampolines.uia_example_queries(v_agenda);
            uia_trampolines.uia_precache_html_sentence_phrases(v_agenda, queries, $str_alt37$Translating_example_queries_, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_quirk_question(SubLObject v_agenda, SubLObject sentence, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = $REQUIRED;
        }
        {
            SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $ASK_QUIRK, list(sentence), UNPROVIDED);
            return interaction;
        }
    }

    public static final SubLObject uiat_ask_quirk_hint(SubLObject interaction) {
        {
            SubLObject v_question = user_interaction_agenda.ui_args(interaction).first();
            if (v_question.isString()) {
                return cconcatenate($str_alt40$Search_Text_Corpora_for_Answers_t, new SubLObject[]{ v_question, $str_alt41$__ });
            }
        }
        return NIL;
    }

    // deflexical
    public static final SubLSymbol $uiat_no_quirk_message$ = makeSymbol("*UIAT-NO-QUIRK-MESSAGE*");

    public static final SubLObject uiat_ask_quirk_generate_request(SubLObject interaction) {
        if (NIL != system_info.cycorp_execution_context_p()) {
            {
                SubLObject query_interaction = user_interaction_agenda.ui_state_lookup(interaction, $QUERY_INTERACTION, UNPROVIDED);
                if (NIL == query_interaction) {
                    {
                        SubLObject child = uia_tools_basic.uia_act_new_thinking_child(interaction, UIAT_ASK_QUIRK_CORPUS, user_interaction_agenda.ui_args(interaction), $str_alt45$Searching_text_corpora_____, UNPROVIDED);
                        user_interaction_agenda.ui_state_update(interaction, $QUERY_INTERACTION, child);
                        sleep(ONE_INTEGER);
                        return user_interaction_agenda.uia_generate_next_request(user_interaction_agenda.ui_agenda(interaction));
                    }
                } else {
                    {
                        SubLObject results = user_interaction_agenda.ui_state_lookup(interaction, $QUIRK_RESULTS, UNPROVIDED);
                        return user_interaction_agenda.make_ui_request(interaction, $SHOW, list($ANSWERS, results));
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_ask_quirk_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt19);
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
                if (pcase_var.eql($LEARN_FACTOID)) {
                    {
                        SubLObject datum_8 = plist;
                        SubLObject current_9 = datum_8;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_9;
                        SubLObject bad = NIL;
                        SubLObject current_10 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_8, $list_alt50);
                            current_10 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_8, $list_alt50);
                            if (NIL == member(current_10, $list_alt51, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_10 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_8, $list_alt50);
                        }
                        {
                            SubLObject answer_object_tail = property_list_member($ANSWER_OBJECT, current_9);
                            SubLObject answer_object = (NIL != answer_object_tail) ? ((SubLObject) (cadr(answer_object_tail))) : NIL;
                            SubLObject nl_sentence_tail = property_list_member($NL_SENTENCE, current_9);
                            SubLObject nl_sentence = (NIL != nl_sentence_tail) ? ((SubLObject) (cadr(nl_sentence_tail))) : NIL;
                            SubLObject child = uia_tools_introduction.uia_act_new_assertion_creator(v_agenda, $REQUIRED, nl_sentence, UNPROVIDED, UNPROVIDED);
                            user_interaction_agenda.ui_state_update(interaction, $MY_RESULT_WILL_BE, answer_object);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_ask_quirk_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($THINKING)) {
                {
                    SubLObject results = user_interaction_agenda.ui_state_lookup(child, $QUIRK_RESULTS, UNPROVIDED);
                    user_interaction_agenda.ui_state_update(parent, $QUIRK_RESULTS, results);
                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_ask_quirk_child_rejected(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($THINKING)) {
                user_interaction_agenda.uia_act_reject(user_interaction_agenda.ui_agenda(parent), parent);
            }
        }
        return parent;
    }

    public static final SubLObject uiat_ask_quirk_child_invalidated(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($THINKING)) {
                user_interaction_agenda.uia_act_invalidate(user_interaction_agenda.ui_agenda(parent), parent);
            }
        }
        return parent;
    }

    public static final SubLObject uiat_ask_quirk_corpus(SubLObject sentence) {
        {
            SubLObject results = NIL;
            SubLObject v_question = question.new_question(sentence, $list_alt55, UNPROVIDED);
            SubLObject self = uia_tools_basic.uiat_thinking_interaction();
            results = methods.funcall_instance_method_with_0_args(v_question, ANSWER);
            uia_mumbler.uia_mumble(user_interaction_agenda.ui_agenda(self), format(NIL, $str_alt57$I_received__A_from_QUIRK_, results));
            user_interaction_agenda.ui_state_update(self, $QUIRK_RESULTS, results);
            return results;
        }
    }

    public static final SubLObject uiat_act_new_knowledge_reviewer(SubLObject v_agenda, SubLObject mode, SubLObject sort) {
        if (sort == UNPROVIDED) {
            sort = $TERM;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frameless = user_interaction_agenda.$uia_frameless_environmentP$.getDynamicValue(thread);
                SubLObject frame = (NIL != frameless) ? ((SubLObject) (NIL)) : $UIA_INTERACTION;
                return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $KNOWLEDGE_REVIEWER, NIL, list($SORT, sort, $FRAMELESS, frameless, $FRAME, frame));
            }
        }
    }

    /**
     * For a self-updating knowledge reviewer, have things changed since it last refreshed?
     */
    public static final SubLObject uia_knowledge_reviewer_need_refreshP(SubLObject v_agenda) {
        return user_interaction_agenda.uia_state_lookup(v_agenda, $KREVIEWER_NEEDS_REFRESH, NIL);
    }

    /**
     * For self-updating knowledge reviewer, note that it has just been refreshed
     */
    public static final SubLObject uia_knowledge_reviewer_refreshed(SubLObject v_agenda) {
        user_interaction_agenda.uia_state_update(v_agenda, $KREVIEWER_NEEDS_REFRESH, NIL);
        return NIL;
    }

    /**
     * For self-updating knowledge reviewer, note that things have changed, and update is now appropriate
     */
    public static final SubLObject uia_knowledge_reviewer_note_refresh_required(SubLObject v_agenda) {
        user_interaction_agenda.uia_state_update(v_agenda, $KREVIEWER_NEEDS_REFRESH, T);
        return NIL;
    }

    /**
     *
     *
     * @param META-AGENDA-ID
     * 		integer
     * @param AGENDA-ID
     * 		integer
     */
    public static final SubLObject uia_knowledge_reviewer_need_refresh_from_global_infoP(SubLObject meta_agenda_id, SubLObject agenda_id) {
        {
            SubLObject uia = user_interaction_agenda.uia_from_ids(meta_agenda_id, agenda_id);
            SubLObject refreshP = uia_knowledge_reviewer_need_refreshP(uia);
            uia_knowledge_reviewer_refreshed(uia);
            return refreshP;
        }
    }

    public static final SubLObject uiat_knowledge_reviewer_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($FILE_BROWSER)) {
                {
                    SubLObject filename = user_interaction_agenda.ui_result(child);
                    SubLObject type = uia_tools_basic.file_browser_type(user_interaction_agenda.ui_state_lookup(child, $FB_STATE, UNPROVIDED));
                    SubLObject pcase_var_11 = type;
                    if (pcase_var_11.eql($SAVE)) {
                        {
                            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
                            uiat_kreview_save(v_agenda, filename);
                            uiat_kjournal_save(v_agenda, UNPROVIDED);
                        }
                    }
                }
                user_interaction_agenda.ui_state_update(parent, $CONTENTS, NIL);
            }
        }
        return parent;
    }

    public static final SubLObject uiat_knowledge_reviewer_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject contents = user_interaction_agenda.ui_state_lookup(interaction, $CONTENTS, UNPROVIDED);
            if (NIL == contents) {
                uiat_knowledge_reviewer_constructor(interaction);
            }
            return uiat_knowledge_reviewer_request_guts(interaction);
        }
    }

    public static final SubLObject uiat_knowledge_reviewer_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt19);
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
                if (pcase_var.eql($SAVE)) {
                    {
                        SubLObject child = uia_tools_basic.uia_act_save_file_masked(v_agenda, $str_alt69$_, uia_tools_setup.$uiat_agenda_state_filemask$.getGlobalValue());
                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                    }
                } else
                    if (pcase_var.eql($GET_REVIEWED)) {
                        uiat_kreview_submit_knowledge_for_review(interaction, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($REFRESH)) {
                            uiat_act_new_knowledge_reviewer(v_agenda, $REQUIRED, UNPROVIDED);
                        }


            }
        }
        return NIL;
    }

    public static final SubLObject uiat_knowledge_reviewer_request_guts(SubLObject interaction) {
        {
            SubLObject contents = user_interaction_agenda.ui_state_lookup(interaction, $CONTENTS, UNPROVIDED);
            SubLObject misc_contents = user_interaction_agenda.ui_state_lookup(interaction, $MISC_CONTENTS, UNPROVIDED);
            SubLObject help_text = user_interaction_agenda.ui_state_lookup(interaction, $HELP_TEXT, UNPROVIDED);
            SubLObject request = NIL;
            request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($CONTENTS, contents, $MISC_CONTENTS, misc_contents, $HELP_TEXT, help_text));
            user_interaction_agenda.uia_act_complete(user_interaction_agenda.ui_agenda(interaction), interaction, $DONE);
            return request;
        }
    }

    /**
     *
     *
     * @param ASSERTIONS-BY-TERM
     * 		list; which obeys the following grammar:
     * 		item -> (item1 ... itemn)
     * 		item -> CycL Sentence or assertion
     * 		item -> (cycl-term (item1 ... itemn))
     * @param MT
     * 		microtheory
     * @return list; a list of lists, where each sublist contains a CycL term and plist.
    things that might be found on the plist include a :formula, an :mt, a :creator, an :assertion
    and :justifications, which is a list of meta-supports.
     * @return integer; number of sentences/assertions contained in entire list
     * @unknown when changes are made to this function, corresponding changes should not only be made in the cb-version, but also
    to children of @xref UIAT-KREVIEW-SUBMIT-ALL-TERMS-FOR-REVIEW
     */
    public static final SubLObject uiat_knowledge_reviewer_assertion_by_term_mapper(SubLObject structured_assertions, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject sentence_count = ZERO_INTEGER;
                SubLObject cdolist_list_var = structured_assertions;
                SubLObject elt = NIL;
                for (elt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elt = cdolist_list_var.first()) {
                    if (NIL != assertion_handles.assertion_p(elt)) {
                        sentence_count = add(sentence_count, ONE_INTEGER);
                        result = cons(uia_term_review_assertion_plist(elt), result);
                    } else
                        if (NIL != uiat_kreview_termP(elt)) {
                            result = cons(elt, result);
                        } else
                            if (NIL != cycl_grammar.cycl_sentence_p(elt)) {
                                sentence_count = add(sentence_count, ONE_INTEGER);
                                result = cons(uia_term_review_formula_plist(elt, mt), result);
                            } else
                                if (elt.isList()) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject list_result = uiat_knowledge_reviewer_assertion_by_term_mapper(elt, mt);
                                        SubLObject count = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        sentence_count = add(sentence_count, count);
                                        result = cons(list_result, result);
                                    }
                                } else {
                                    Errors.warn($str_alt75$found_something_that_doesn_t_fit_, elt);
                                }



                }
                return values(nreverse(result), sentence_count);
            }
        }
    }

    public static final SubLObject uia_term_review_assertion_plist(SubLObject v_assert) {
        {
            SubLObject assert_plist = NIL;
            assert_plist = putf(assert_plist, $FORMULA, uncanonicalizer.assertion_el_formula(v_assert));
            assert_plist = putf(assert_plist, $ASSERTION, v_assert);
            assert_plist = putf(assert_plist, $MT, assertions_high.assertion_mt(v_assert));
            if (NIL != el_utilities.el_implication_p(getf(assert_plist, $FORMULA, UNPROVIDED))) {
                assert_plist = putf(assert_plist, $INTERVIEW, $TRUE);
            }
            if ((NIL != assertions_high.asserted_assertionP(v_assert)) && (NIL == uia_term_review_cyc_assertedP(v_assert))) {
                assert_plist = putf(assert_plist, $CREATOR, $USER);
            } else
                if (NIL != assertions_high.forward_deduced_assertionP(v_assert, UNPROVIDED_SYM)) {
                    assert_plist = putf(assert_plist, $CREATOR, $DERIVED);
                    assert_plist = putf(assert_plist, $JUSTIFICATIONS, uia_trampolines.uia_meta_supports(v_assert));
                } else {
                    assert_plist = putf(assert_plist, $CREATOR, $CYC);
                    assert_plist = putf(assert_plist, $JUSTIFICATIONS, uia_trampolines.uia_meta_supports(v_assert));
                }

            return assert_plist;
        }
    }

    public static final SubLObject uia_term_review_cyc_assertedP(SubLObject assertion) {
        return makeBoolean((assertions_high.asserted_by(assertion) == $$Cyc) || (NIL != cb_uia_display_primitives.uia_assertion_tool(assertion)));
    }

    public static final SubLObject uia_term_review_formula_plist(SubLObject formula, SubLObject mt) {
        {
            SubLObject plist = NIL;
            plist = putf(plist, $FORMULA, formula);
            plist = putf(plist, $MT, mt);
            plist = putf(plist, $CREATOR, $CYC);
            return plist;
        }
    }

    public static final SubLObject uiat_knowledge_reviewer_constructor(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject sort_type = user_interaction_agenda.ui_state_lookup(interaction, $SORT, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject contents_by_term = uiat_knowledge_reviewer_get_assertions_by_term(v_agenda, sort_type);
                    SubLObject misc_contents = thread.secondMultipleValue();
                    SubLObject sentence_count = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject help_text = (NIL != contents_by_term) ? ((SubLObject) (user_interaction_agenda.ui_help_text(interaction))) : NIL;
                        user_interaction_agenda.ui_state_update(interaction, $CONTENTS, contents_by_term);
                        user_interaction_agenda.ui_state_update(interaction, $MISC_CONTENTS, misc_contents);
                        user_interaction_agenda.ui_state_update(interaction, $HELP_TEXT, help_text);
                        user_interaction_agenda.ui_state_update(interaction, $SENTENCE_COUNT, sentence_count);
                    }
                }
                return interaction;
            }
        }
    }

    public static final SubLObject uiat_knowledge_reviewer_get_assertions_by_term(SubLObject v_agenda, SubLObject sort_type) {
        if (sort_type == UNPROVIDED) {
            sort_type = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                SubLObject terms = uiat_kreview_fetch_terms(mt);
                SubLObject contents = ($TOPIC_SORT == sort_type) ? ((SubLObject) (uiat_kreview_fetch_contents_by_topic_ordering_principles(v_agenda, terms))) : uiat_kreview_fetch_contents_for_terms(mt, terms);
                SubLObject misc_sentence_tuples = NIL;
                SubLObject misc_contents = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject digested_contents = uiat_knowledge_reviewer_assertion_by_term_mapper(contents, mt);
                    SubLObject sentence_count = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    misc_contents = find($MISC_ASSERTS, digested_contents, EQ, FIRST, UNPROVIDED, UNPROVIDED);
                    if (NIL != misc_contents) {
                        misc_sentence_tuples = second(misc_contents);
                    }
                    if (NIL != misc_contents) {
                        digested_contents = remove(misc_contents, digested_contents, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return values(digested_contents, misc_sentence_tuples, sentence_count);
                }
            }
        }
    }

    // defparameter
    private static final SubLSymbol $uiat_kreview_filter_function$ = makeSymbol("*UIAT-KREVIEW-FILTER-FUNCTION*");

    public static final SubLObject uiat_kreview_filter_assertion(SubLObject assertion, SubLObject cycl_sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return funcall($uiat_kreview_filter_function$.getDynamicValue(thread), assertion, cycl_sentence, mt);
        }
    }

    public static final SubLObject uiat_kreview_submit_filter_assertionP(SubLObject assertion, SubLObject cycl_sentence, SubLObject mt) {
        if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(cycl_sentence), $list_alt91, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    /**
     * Should ASSERTION be filtered before showing in the knowledge reviewer?
     */
    public static final SubLObject uiat_kreview_onscreen_filter_assertionP(SubLObject assertion, SubLObject cycl_sentence, SubLObject mt) {
        if ((NIL != member(cycl_utilities.formula_arg0(cycl_sentence), $list_alt91, UNPROVIDED, UNPROVIDED)) || (NIL != uia_trampolines.uia_irrelevant_formula_memoizedP(cycl_sentence, mt))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject uiat_kreview_fetch_assertions_for_terms(SubLObject terms, SubLObject mt) {
        {
            SubLObject asserts_by_term = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject sorted_asserts_by_time = Sort.sort(uiat_kreview_fetch_assertions_for_term(v_term, mt), UIAT_KREVIEW_TEMPORAL_ORDER, UNPROVIDED);
                    SubLObject sorted_asserts = Sort.sort(sorted_asserts_by_time, UIAT_KREVIEW_DEFINING_ASSERTIONS_FIRST, UNPROVIDED);
                    asserts_by_term = cons(list(uiat_kreview_make_term(v_term), sorted_asserts), asserts_by_term);
                }
            }
            return asserts_by_term;
        }
    }

    /**
     * Just get the raw assertion formulas, because we will use a different
     * classification algorithm than the terms.
     */
    public static final SubLObject uiat_kreview_bag_assertions_for_terms(SubLObject terms, SubLObject mt) {
        {
            SubLObject assertions_bag = set.new_set(UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_12 = uiat_kreview_fetch_assertions_for_term(v_term, mt);
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , assertion = cdolist_list_var_12.first()) {
                        if (NIL == uiat_kreview_filter_assertion(assertion, uncanonicalizer.assertion_el_formula(assertion), mt)) {
                            set.set_add(assertion, assertions_bag);
                        }
                    }
                }
            }
            return assertions_bag;
        }
    }

    /**
     *
     *
     * @param TERM
     * 		cycl-term
     * @param MT
     * 		microtheory
     * @return list; a list of interesting assertions visible from MT that use TERM or a NART that
    contains TERM
     */
    public static final SubLObject uiat_kreview_fetch_assertions_for_term(SubLObject v_term, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject narts = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        {
                            SubLObject cdolist_list_var = kb_mapping.gather_index(v_term, UNPROVIDED);
                            SubLObject v_assert = NIL;
                            for (v_assert = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_assert = cdolist_list_var.first()) {
                                if (NIL != function_terms.tou_assertionP(v_assert)) {
                                    if (NIL == uiat_kreview_filter_assertion(v_assert, assertions_high.gaf_arg1(v_assert), mt)) {
                                        narts = cons(assertions_high.gaf_arg1(v_assert), narts);
                                    }
                                }
                                if (NIL == uiat_kreview_filter_assertion(v_assert, uncanonicalizer.assertion_el_formula(v_assert), mt)) {
                                    result = cons(v_assert, result);
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = narts;
                            SubLObject nart = NIL;
                            for (nart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nart = cdolist_list_var.first()) {
                                {
                                    SubLObject cdolist_list_var_13 = kb_mapping.gather_index(nart, UNPROVIDED);
                                    SubLObject v_assert = NIL;
                                    for (v_assert = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , v_assert = cdolist_list_var_13.first()) {
                                        if (NIL == uiat_kreview_filter_assertion(v_assert, uncanonicalizer.assertion_el_formula(v_assert), mt)) {
                                            result = cons(v_assert, result);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * get all relevant assertions for review by the user.  For each term in TERMS,
     * build a list of all assertions using that term.  Add a separate list of assertions
     * that appear in MT but are not related to any of the TERMS, so that they can be
     * show separately to the user.
     *
     * @param MT
     * 		microtheory
     * @param TERMS
     * 		list; a list of Cycl terms
     * @return list; a list of the form ((TERM1 (assert1 assert2...)) (term2 (assert3 ...))
    (:misc-asserts (assert4 assert5 ...)))
     */
    public static final SubLObject uiat_kreview_fetch_contents_for_terms(SubLObject mt, SubLObject terms) {
        {
            SubLObject asserts_by_term = uiat_kreview_fetch_assertions_for_terms(terms, mt);
            SubLObject known_asserts_for_terms = set.new_set(UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = asserts_by_term;
            SubLObject asserts_for_one_term = NIL;
            for (asserts_for_one_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asserts_for_one_term = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_14 = second(asserts_for_one_term);
                    SubLObject v_assert = NIL;
                    for (v_assert = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , v_assert = cdolist_list_var_14.first()) {
                        set.set_add(v_assert, known_asserts_for_terms);
                    }
                }
            }
            {
                SubLObject misc_asserts = uiat_kreview_fetch_miscellaneous_assertions(mt, known_asserts_for_terms);
                if (NIL != misc_asserts) {
                    asserts_by_term = cons(list(uiat_kreview_make_term(rkf_knowledge_sorter.$rkf_classification_other$.getGlobalValue()), misc_asserts), asserts_by_term);
                }
            }
            return asserts_by_term;
        }
    }

    /**
     * Gather all assertions in our Mt content that we did not get any other way, e.g.
     * not by terms.
     */
    public static final SubLObject uiat_kreview_fetch_miscellaneous_assertions(SubLObject mt, SubLObject known_assertion_set) {
        {
            SubLObject misc_asserts = NIL;
            SubLObject all_assertions_by_user = NIL;
            all_assertions_by_user = uiat_kreview_find_all_assertions_by_user(mt);
            {
                SubLObject cdolist_list_var = all_assertions_by_user;
                SubLObject v_assert = NIL;
                for (v_assert = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_assert = cdolist_list_var.first()) {
                    if (NIL == uiat_kreview_filter_assertion(v_assert, uncanonicalizer.assertion_el_formula(v_assert), mt)) {
                        if (NIL == set.set_memberP(v_assert, known_assertion_set)) {
                            misc_asserts = cons(v_assert, misc_asserts);
                        }
                    }
                }
            }
            return misc_asserts;
        }
    }

    // defparameter
    private static final SubLSymbol $uiat_kreview_accumulator$ = makeSymbol("*UIAT-KREVIEW-ACCUMULATOR*");

    /**
     *
     *
     * @unknown eventually, this will be harder and involve more info than just the Mt
     */
    public static final SubLObject uiat_kreview_find_all_assertions_by_user(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_contents = NIL;
                {
                    SubLObject _prev_bind_0 = $uiat_kreview_accumulator$.currentBinding(thread);
                    try {
                        $uiat_kreview_accumulator$.bind(NIL, thread);
                        {
                            SubLObject _prev_bind_0_15 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                mt_relevance_macros.$mt$.bind(mt, thread);
                                kb_mapping.map_mt_contents(UIAT_KREVIEW_HARVESTER, mt, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_15, thread);
                            }
                        }
                        mt_contents = $uiat_kreview_accumulator$.getDynamicValue(thread);
                    } finally {
                        $uiat_kreview_accumulator$.rebind(_prev_bind_0, thread);
                    }
                }
                return mt_contents;
            }
        }
    }

    public static final SubLObject uiat_kreview_fetch_contents_by_topic_ordering_principles(SubLObject v_agenda, SubLObject terms) {
        {
            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            SubLObject domain_mt = user_interaction_agenda.uia_domain_mt(v_agenda);
            SubLObject classifier = rkf_knowledge_sorter.rkf_get_domain_classifier_for_assertions(domain_mt);
            SubLObject base_assertion_set = uiat_kreview_bag_assertions_for_terms(terms, mt);
            SubLObject other_assertion_list = uiat_kreview_find_all_assertions_by_user(mt);
            SubLObject classification = NIL;
            SubLObject classification_order = NIL;
            SubLObject cdolist_list_var = other_assertion_list;
            SubLObject other_assertion = NIL;
            for (other_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_assertion = cdolist_list_var.first()) {
                if (NIL == uiat_kreview_filter_assertion(other_assertion, uncanonicalizer.assertion_el_formula(other_assertion), mt)) {
                    set.set_add(other_assertion, base_assertion_set);
                }
            }
            classification = uia_trampolines.uia_classify_assertion_set_precise(v_agenda, set.set_element_list(base_assertion_set), classifier, UNPROVIDED);
            classification = uiat_kreview_perform_sub_organizations(classification, terms);
            classification_order = uia_trampolines.uia_get_ordering_categories_from_classifier(v_agenda, classifier, UNPROVIDED);
            classification_order = append(classification_order, list(rkf_knowledge_sorter.$rkf_classification_other$.getGlobalValue()));
            classification = uiat_kreview_convert_classification_set_to_list(classification, classification_order);
            return values(classification, classification_order);
        }
    }

    public static final SubLObject uiat_kreview_perform_sub_organizations(SubLObject classification, SubLObject terms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_classification = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject term_set = set_utilities.construct_set_from_list(terms, UNPROVIDED, UNPROVIDED);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(classification));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject principle = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject assertions = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject reordered = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var = assertions;
                            SubLObject assertion = NIL;
                            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                {
                                    SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
                                    SubLObject placed = NIL;
                                    SubLObject terms_16 = cycl_utilities.formula_terms(formula, $IGNORE);
                                    SubLObject cdolist_list_var_17 = terms_16;
                                    SubLObject v_term = NIL;
                                    for (v_term = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , v_term = cdolist_list_var_17.first()) {
                                        if (NIL != set.set_memberP(v_term, term_set)) {
                                            dictionary_utilities.dictionary_push(reordered, v_term, assertion);
                                            placed = T;
                                        }
                                    }
                                    if (NIL == placed) {
                                        dictionary_utilities.dictionary_push(reordered, rkf_knowledge_sorter.$rkf_classification_other$.getGlobalValue(), assertion);
                                    }
                                }
                            }
                            {
                                SubLObject subordered = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                                SubLObject iteration_state_18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(reordered));
                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_18)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state_18);
                                        SubLObject assertions_19 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        dictionary.dictionary_enter(subordered, v_term, Sort.sort(assertions_19, UIAT_KREVIEW_TEMPORAL_ORDER, UNPROVIDED));
                                        iteration_state_18 = dictionary_contents.do_dictionary_contents_next(iteration_state_18);
                                    }
                                } 
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_18);
                                reordered = subordered;
                            }
                            dictionary.dictionary_enter(new_classification, principle, reordered);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return new_classification;
            }
        }
    }

    public static final SubLObject uiat_kreview_convert_classification_set_to_list(SubLObject classification, SubLObject classification_order) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject serialized_classification = NIL;
                SubLObject cdolist_list_var = classification_order;
                SubLObject category = NIL;
                for (category = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , category = cdolist_list_var.first()) {
                    {
                        SubLObject pieces = dictionary.dictionary_lookup(classification, category, UNPROVIDED);
                        SubLObject assertion_list = NIL;
                        if (NIL != dictionary.dictionary_p(pieces)) {
                            {
                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pieces));
                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        SubLObject assertions = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        assertion_list = cons(list(uiat_kreview_make_term(v_term), assertions), assertion_list);
                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                    }
                                } 
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                            serialized_classification = cons(list(uiat_kreview_make_term(category), assertion_list), serialized_classification);
                        }
                    }
                }
                return nreverse(serialized_classification);
            }
        }
    }

    /**
     * sort assertions such that defining assertions come first
     */
    public static final SubLObject uiat_kreview_defining_assertions_first(SubLObject assertion_a, SubLObject assertion_b) {
        if (NIL != uia_trampolines.uia_defining_assertion_p(assertion_a)) {
            return NIL;
        }
        if (NIL != uia_trampolines.uia_defining_assertion_p(assertion_b)) {
            return T;
        }
        return NIL;
    }

    /**
     * Sort assertions by time stamp
     */
    public static final SubLObject uiat_kreview_temporal_order(SubLObject assertion_a, SubLObject assertion_b) {
        {
            SubLObject time_a = assertions_high.asserted_when(assertion_a);
            SubLObject second_a = assertions_high.asserted_second(assertion_a);
            SubLObject time_b = assertions_high.asserted_when(assertion_b);
            SubLObject second_b = assertions_high.asserted_second(assertion_b);
            if (NIL == time_a) {
                time_a = ZERO_INTEGER;
            }
            if (NIL == time_b) {
                time_b = ZERO_INTEGER;
            }
            if (!time_a.isNumber()) {
                return T;
            } else
                if (!time_b.isNumber()) {
                    return NIL;
                } else
                    if (time_a.numL(time_b)) {
                        return T;
                    } else
                        if (time_a.numG(time_b)) {
                            return NIL;
                        } else {
                            if (NIL == second_a) {
                                second_a = ZERO_INTEGER;
                            }
                            if (NIL == second_b) {
                                second_b = ZERO_INTEGER;
                            }
                            if (!second_a.isNumber()) {
                                return T;
                            } else
                                if (!second_b.isNumber()) {
                                    return NIL;
                                } else
                                    if (second_a.numL(second_b)) {
                                        return T;
                                    } else
                                        if (second_a.numG(second_b)) {
                                            return NIL;
                                        } else {
                                            return T;
                                        }



                        }



        }
    }

    public static final SubLObject uiat_kreview_fetch_terms(SubLObject mt) {
        return rkf_term_utilities.rkf_terms_created_in_interaction_mt(mt);
    }

    public static final SubLObject uiat_knowledge_reviewer_assertion_mapper(SubLObject assertions, SubLObject mt) {
        {
            SubLObject sentences = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                if (NIL != assertions_high.asserted_assertionP(assertion)) {
                    {
                        SubLObject cycl_sentence = uncanonicalizer.assertion_el_formula(assertion);
                        if (NIL == uiat_kreview_filter_assertion(assertion, cycl_sentence, mt)) {
                            {
                                SubLObject item_var = cycl_sentence;
                                if (NIL == member(item_var, sentences, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    sentences = cons(item_var, sentences);
                                }
                            }
                        }
                    }
                }
            }
            return sentences;
        }
    }

    public static final SubLObject uiat_kreview_fetch_contents(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject contents = NIL;
                {
                    SubLObject _prev_bind_0 = $uiat_kreview_accumulator$.currentBinding(thread);
                    try {
                        $uiat_kreview_accumulator$.bind(NIL, thread);
                        {
                            SubLObject _prev_bind_0_20 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                mt_relevance_macros.$mt$.bind(mt, thread);
                                kb_mapping.map_mt_contents(UIAT_KREVIEW_HARVESTER, mt, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_20, thread);
                            }
                        }
                        contents = $uiat_kreview_accumulator$.getDynamicValue(thread);
                    } finally {
                        $uiat_kreview_accumulator$.rebind(_prev_bind_0, thread);
                    }
                }
                return Sort.sort(contents, UIAT_KREVIEW_TEMPORAL_ORDER, UNPROVIDED);
            }
        }
    }

    public static final SubLObject uiat_kreview_harvester(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == isa.isa_in_any_mtP(cycl_utilities.formula_arg1(assertion, UNPROVIDED), $$RKFInteractionContextMicrotheory)) {
                $uiat_kreview_accumulator$.setDynamicValue(cons(assertion, $uiat_kreview_accumulator$.getDynamicValue(thread)), thread);
            }
            return assertion;
        }
    }

    public static final SubLObject uiat_kreview_submit_knowledge_for_review(SubLObject interaction, SubLObject message, SubLObject subject) {
        if (message == UNPROVIDED) {
            message = $COMPUTE;
        }
        if (subject == UNPROVIDED) {
            subject = $COMPUTE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject from = uiat_kreview_get_my_email_address(v_agenda);
                SubLObject to = uiat_kreview_get_supervisor_email_address(v_agenda);
                SubLObject host = uiat_kreview_get_smtp_host(v_agenda);
                {
                    SubLObject _prev_bind_0 = $uiat_kreview_filter_function$.currentBinding(thread);
                    try {
                        $uiat_kreview_filter_function$.bind($sym99$UIAT_KREVIEW_SUBMIT_FILTER_ASSERTION_, thread);
                        if (message == $COMPUTE) {
                            message = uiat_kreview_gather_up_message_from_agenda(v_agenda);
                        }
                        if (subject == $COMPUTE) {
                            subject = uiat_kreview_generate_subject(interaction);
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject sentP = mail_utilities.mail_message(from, list(to, from), message, subject, host, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject error_message = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                            } else
                                if (NIL != sentP) {
                                    user_interaction_agenda.uia_act_new_comment(v_agenda, format(NIL, $str_alt100$Sent__A_the_following_knowledge_f, to, message));
                                } else
                                    if (NIL != error_message) {
                                        user_interaction_agenda.uia_act_new_comment(v_agenda, format(NIL, $str_alt101$Got_the_error_message__S_while_tr, new SubLObject[]{ error_message, to, subject }));
                                    }


                        }
                    } finally {
                        $uiat_kreview_filter_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return interaction;
        }
    }

    /**
     * a list of ('old-name' 'new-name') pairs
     */
    // defparameter
    private static final SubLSymbol $uiat_kreview_submit_renames$ = makeSymbol("*UIAT-KREVIEW-SUBMIT-RENAMES*");

    public static final SubLObject uiat_kreview_gather_up_message_from_agenda(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = NIL;
                SubLObject lexical_interaction_mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
                SubLObject generation_interaction_mt = user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED);
                SubLObject parsing_interaction_mt = user_interaction_agenda.uia_parsing_interaction_mt(v_agenda);
                SubLObject domain_mt = user_interaction_agenda.uia_domain_mt(v_agenda);
                SubLObject lexical_mt = user_interaction_agenda.uia_language_lexical_mt(v_agenda);
                SubLObject generation_mt = user_interaction_agenda.uia_generation_mt(v_agenda, UNPROVIDED);
                SubLObject parsing_mt = user_interaction_agenda.uia_parsing_mt(v_agenda);
                {
                    SubLObject _prev_bind_0 = $uiat_kreview_submit_renames$.currentBinding(thread);
                    try {
                        $uiat_kreview_submit_renames$.bind(NIL, thread);
                        {
                            SubLObject filename = format(NIL, $str_alt102$_cyc_projects_rkf_ke_ke_finalizat, numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), get_universal_time());
                            SubLObject error = NIL;
                            thread.resetMultipleValues();
                            {
                                SubLObject contents_by_term = uiat_knowledge_reviewer_get_assertions_by_term(v_agenda, UNPROVIDED);
                                SubLObject misc_contents = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject stream = NIL;
                                    try {
                                        stream = make_private_string_output_stream();
                                        uiat_kreview_gather_up_message_internal(stream, domain_mt, contents_by_term, misc_contents, lexical_mt, uiat_kreview_fetch_terms(lexical_interaction_mt), uiat_knowledge_reviewer_assertion_mapper(uiat_kreview_fetch_contents(lexical_interaction_mt), lexical_interaction_mt), generation_mt, uiat_knowledge_reviewer_assertion_mapper(uiat_kreview_fetch_contents(generation_interaction_mt), generation_interaction_mt), parsing_mt, uiat_knowledge_reviewer_assertion_mapper(uiat_kreview_fetch_contents(parsing_interaction_mt), parsing_interaction_mt));
                                        message = get_output_stream_string(stream);
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                close(stream, UNPROVIDED);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                            }
                                        }
                                    }
                                }
                                Errors.warn($str_alt103$_S__, $uiat_kreview_submit_renames$.getDynamicValue(thread));
                                {
                                    SubLObject cdolist_list_var = $uiat_kreview_submit_renames$.getDynamicValue(thread);
                                    SubLObject rename = NIL;
                                    for (rename = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rename = cdolist_list_var.first()) {
                                        {
                                            SubLObject datum = rename;
                                            SubLObject current = datum;
                                            SubLObject old_name = NIL;
                                            SubLObject new_name = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt104);
                                            old_name = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt104);
                                            new_name = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                message = string_utilities.string_substitute(new_name, old_name, message, UNPROVIDED);
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt104);
                                            }
                                        }
                                    }
                                }
                                message = string_utilities.remove_substring(message, $str_alt105$__);
                            }
                            try {
                                {
                                    SubLObject _prev_bind_0_22 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            {
                                                SubLObject stream_var = NIL;
                                                try {
                                                    stream_var = StreamsLow.open(filename, new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_DOES_NOT_EXIST, $CREATE });
                                                    {
                                                        SubLObject stream = stream_var;
                                                        format(stream, $str_alt111$_A__, message);
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != stream_var) {
                                                                close(stream_var, UNPROVIDED);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_23, thread);
                                                        }
                                                    }
                                                }
                                                message = format(NIL, $str_alt112$UIA_KE_file_to_load___A__, filename);
                                            }
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_22, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            if (NIL != error) {
                                message = format(NIL, $str_alt113$Unable_to_save_file__A__Received_, new SubLObject[]{ filename, error, message });
                            }
                        }
                    } finally {
                        $uiat_kreview_submit_renames$.rebind(_prev_bind_0, thread);
                    }
                }
                return message;
            }
        }
    }

    /**
     * new kreview entry point.
     *
     * @unknown this function is no longer used 10Apr2003
     */
    public static final SubLObject uiat_kreview_gather_up_message(SubLObject interaction) {
        if (NIL == user_interaction_agenda.ui_state_lookup(interaction, $LEX_LEXICAL_CONTENTS, UNPROVIDED)) {
            uiat_lex_knowledge_reviewer_constructor(interaction);
        }
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject message = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                uiat_kreview_gather_up_message_internal(stream, user_interaction_agenda.uia_domain_interaction_mt(v_agenda), user_interaction_agenda.ui_state_lookup(interaction, $CONTENTS, UNPROVIDED), user_interaction_agenda.ui_state_lookup(interaction, $MISC_CONTENTS, UNPROVIDED), user_interaction_agenda.uia_lexical_interaction_mt(v_agenda), user_interaction_agenda.ui_state_lookup(interaction, $LEX_TERMS, UNPROVIDED), user_interaction_agenda.ui_state_lookup(interaction, $LEX_LEXICAL_CONTENTS, UNPROVIDED), user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED), user_interaction_agenda.ui_state_lookup(interaction, $LEX_GENERATION_CONTENTS, UNPROVIDED), user_interaction_agenda.uia_parsing_interaction_mt(v_agenda), user_interaction_agenda.ui_state_lookup(interaction, $LEX_PARSING_CONTENTS, UNPROVIDED));
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
            return message;
        }
    }

    public static final SubLObject uiat_kreview_gather_up_message_internal(SubLObject stream, SubLObject domain_mt, SubLObject domain_mt_terms_and_formulas, SubLObject domain_mt_misc_formulas, SubLObject language_lexical_mt, SubLObject language_lexical_mt_terms, SubLObject language_lexical_mt_contents, SubLObject language_generation_mt, SubLObject language_generation_mt_contents, SubLObject language_parsing_mt, SubLObject language_parsing_mt_contents) {
        uiat_kreview_format_terms_and_formulas(stream, domain_mt_terms_and_formulas, domain_mt, UNPROVIDED);
        format(stream, $str_alt118$_________________);
        uiat_kreview_format_terms(stream, language_lexical_mt_terms, language_lexical_mt, $$$Lexical_Terms);
        uiat_kreview_format_contents(stream, language_lexical_mt_contents, language_lexical_mt, $$$Lexical_Mappings);
        uiat_kreview_format_contents(stream, language_generation_mt_contents, language_generation_mt, $$$Generation_Templates);
        uiat_kreview_format_contents(stream, language_parsing_mt_contents, language_parsing_mt, $$$Parsing_Templates);
        return NIL;
    }

    public static final SubLObject uiat_kreview_format_terms_and_formulas(SubLObject stream, SubLObject terms_and_formulas, SubLObject mt, SubLObject label) {
        if (label == UNPROVIDED) {
            label = NIL;
        }
        if (NIL != string_utilities.non_empty_stringP(label)) {
            format(stream, $str_alt123$__________a____, label);
        }
        {
            SubLObject remaining_terms = NIL;
            {
                SubLObject cdolist_list_var = terms_and_formulas;
                SubLObject term_and_formulas = NIL;
                for (term_and_formulas = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term_and_formulas = cdolist_list_var.first()) {
                    remaining_terms = cons(uiat_kreview_get_term(term_and_formulas.first()), remaining_terms);
                }
            }
            terms_and_formulas = Sort.stable_sort(terms_and_formulas, CONSTANTS_FIRST, UIAT_KREVIEW_GET_TERM);
            {
                SubLObject cdolist_list_var = terms_and_formulas;
                SubLObject term_and_formulas = NIL;
                for (term_and_formulas = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term_and_formulas = cdolist_list_var.first()) {
                    {
                        SubLObject term_plist = term_and_formulas.first();
                        SubLObject v_term = uiat_kreview_get_term(term_plist);
                        SubLObject defining_mt = uia_trampolines.uia_best_defining_mt_for_fort(v_term, mt);
                        remaining_terms = remove(v_term, remaining_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if ((NIL != constant_handles.constant_p(v_term)) && (v_term != $$UIANonClassifiedAssertion)) {
                            format(stream, $str_alt127$____Constant___A___, kb_paths.fort_name(v_term));
                        } else {
                            format(stream, $str_alt128$_______Miscellaneous_Assertions__);
                        }
                        uiat_kreview_format_formulas(stream, second(term_and_formulas), defining_mt, remaining_terms, v_term, UNPROVIDED);
                        if (NIL != forts.fort_p(v_term)) {
                            uiat_kreview_note_term_rename(v_term);
                        }
                    }
                }
            }
        }
        return T;
    }

    public static final SubLObject constants_first(SubLObject thing1, SubLObject thing2) {
        return makeBoolean((NIL != constant_handles.constant_p(thing1)) && (NIL == constant_handles.constant_p(thing2)));
    }

    /**
     * If a term should be renamed before it's finalized, note that on *uiat-kreview-submit-renames*
     */
    public static final SubLObject uiat_kreview_note_term_rename(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject present_name = kb_paths.fort_name(v_term);
                SubLObject new_name = present_name;
                SubLObject shortened_name = string_utilities.substring(new_name, FOUR_INTEGER, UNPROVIDED);
                if (string_utilities.substring(present_name, ZERO_INTEGER, FOUR_INTEGER).equalp($str_alt129$RKF_) && (NIL != constant_completion_high.constant_name_available(shortened_name))) {
                    new_name = shortened_name;
                }
                if (!new_name.equalp(present_name)) {
                    $uiat_kreview_submit_renames$.setDynamicValue(cons(list(present_name, new_name), $uiat_kreview_submit_renames$.getDynamicValue(thread)), thread);
                }
            }
            return T;
        }
    }

    /**
     *
     *
     * @param REMAINING-TERMS
     * 		list; a list of terms that haven't yet had their Constants created.  Therefore, they shouldn't be mentioned in the KE file just yet.
     */
    public static final SubLObject uiat_kreview_format_formulas(SubLObject stream, SubLObject formulas, SubLObject mt, SubLObject remaining_terms, SubLObject v_term, SubLObject label) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (label == UNPROVIDED) {
            label = NIL;
        }
        if (NIL != string_utilities.non_empty_stringP(label)) {
            format(stream, $str_alt123$__________a____, label);
        }
        formulas = uiat_kreview_sort_formulas(formulas);
        {
            SubLObject cdolist_list_var = formulas;
            SubLObject formula_plist = NIL;
            for (formula_plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_plist = cdolist_list_var.first()) {
                {
                    SubLObject formula = getf(formula_plist, $FORMULA, UNPROVIDED);
                    SubLObject mt_for_assertion = uia_trampolines.uia_best_defining_mt_for_fort_and_sentence(v_term, formula, mt);
                    SubLObject mt_name = kb_paths.fort_name(mt_for_assertion);
                    SubLObject deducedP = equal($CYC, getf(formula_plist, $CREATOR, UNPROVIDED));
                    SubLObject contains_unmentioned_term = NIL;
                    SubLObject comment_string = $str_alt130$;
                    if (NIL == contains_unmentioned_term) {
                        {
                            SubLObject csome_list_var = remaining_terms;
                            SubLObject remaining_term = NIL;
                            for (remaining_term = csome_list_var.first(); !((NIL != contains_unmentioned_term) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , remaining_term = csome_list_var.first()) {
                                if (NIL != cycl_utilities.expression_find(remaining_term, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    contains_unmentioned_term = T;
                                }
                            }
                        }
                    }
                    if (NIL == contains_unmentioned_term) {
                        if (NIL == deducedP) {
                            format(stream, $str_alt131$in_Mt___A___, mt_name);
                            format(stream, $str_alt132$f___S___, formula);
                            format(stream, $str_alt133$In_Mt__UIABookkeepingMt___);
                            format(stream, $str_alt134$f___assertedUsingTool__ist__A__A_, mt_name, formula);
                        }
                    }
                }
            }
        }
        return T;
    }

    /**
     * in a KE file, should FORMULA1 precede FORMULA2?  The basic idea is that definitional assertions should precede all other assertions.
     */
    public static final SubLObject ke_submit_precedes(SubLObject formula1, SubLObject formula2) {
        if (cycl_utilities.formula_arg0(formula1) == $$isa) {
            return T;
        } else
            if (cycl_utilities.formula_arg0(formula2) == $$isa) {
                return NIL;
            } else
                if (cycl_utilities.formula_arg0(formula2) == $$genls) {
                    return NIL;
                } else
                    if (cycl_utilities.formula_arg0(formula1) == $$genStringAssertion) {
                        return NIL;
                    } else {
                        return T;
                    }



    }

    public static final SubLObject uiat_kreview_sort_formulas(SubLObject formulas) {
        {
            SubLObject result = NIL;
            result = Sort.stable_sort(formulas, GENSTRINGASSERTION_LATER, UIAT_KREVIEW_GET_FORMULA);
            result = Sort.stable_sort(result, NARTS_LATER, UIAT_KREVIEW_GET_FORMULA);
            result = Sort.stable_sort(result, GENLS_FIRST, UIAT_KREVIEW_GET_FORMULA);
            result = Sort.stable_sort(result, ISA_FIRST, UIAT_KREVIEW_GET_FORMULA);
            return result;
        }
    }

    /**
     *
     *
     * @unknown sometimes just formulas are sent to get sorted, not plists...
     */
    public static final SubLObject uiat_kreview_get_formula(SubLObject plist) {
        return NIL != getf(plist, $FORMULA, UNPROVIDED) ? ((SubLObject) (getf(plist, $FORMULA, UNPROVIDED))) : plist;
    }

    public static final SubLObject isa_first(SubLObject formula1, SubLObject formula2) {
        if (cycl_utilities.formula_arg0(formula1) == cycl_utilities.formula_arg0(formula2)) {
            return NIL;
        } else
            if (cycl_utilities.formula_arg0(formula1) == $$isa) {
                return T;
            } else {
                return NIL;
            }

    }

    public static final SubLObject genls_first(SubLObject formula1, SubLObject formula2) {
        if (cycl_utilities.formula_arg0(formula1) == cycl_utilities.formula_arg0(formula2)) {
            return NIL;
        } else
            if (cycl_utilities.formula_arg0(formula1) == $$genls) {
                return T;
            } else {
                return NIL;
            }

    }

    public static final SubLObject narts_later(SubLObject formula1, SubLObject formula2) {
        return numL(list_utilities.tree_count_if($sym143$FORT_OR_NAUT_WITH_CORRESPONDING_NART_, formula1, UNPROVIDED), list_utilities.tree_count_if($sym143$FORT_OR_NAUT_WITH_CORRESPONDING_NART_, formula2, UNPROVIDED));
    }

    public static final SubLObject genstringassertion_later(SubLObject formula1, SubLObject formula2) {
        if (cycl_utilities.formula_arg0(formula2) == cycl_utilities.formula_arg0(formula1)) {
            return NIL;
        } else
            if (cycl_utilities.formula_arg0(formula2) == $$genStringAssertion) {
                return T;
            } else {
                return NIL;
            }

    }

    /**
     * Format the new-terms section named LABEL to STREAM for TERMS and specifying placement in MT
     */
    public static final SubLObject uiat_kreview_format_terms(SubLObject stream, SubLObject terms, SubLObject mt, SubLObject label) {
        if (label == UNPROVIDED) {
            label = NIL;
        }
        {
            SubLObject mt_name = kb_paths.fort_name(mt);
            if (NIL != string_utilities.non_empty_stringP(label)) {
                format(stream, $str_alt123$__________a____, label);
            }
            format(stream, $str_alt144$__Default_Mt___A_____, mt_name);
            {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    {
                        SubLObject cyc_term = (NIL != uiat_kreview_termP(v_term)) ? ((SubLObject) (uiat_kreview_get_term(v_term))) : v_term;
                        format(stream, $str_alt145$Constant___A___, cyc_term);
                        uiat_kreview_note_term_rename(cyc_term);
                    }
                }
            }
            format(stream, $str_alt146$__);
        }
        return T;
    }

    public static final SubLObject uiat_kreview_termP(SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL != getf(v_object, $TERM, UNPROVIDED)));
    }

    /**
     *
     *
     * @param UIAT-KREVIEW-TERM?
     * 		
     * @return CycL term
     */
    public static final SubLObject uiat_kreview_get_term(SubLObject term_object) {
        return getf(term_object, $TERM, UNPROVIDED);
    }

    /**
     *
     *
     * @param UIAT-KREVIEW-TERM?
     * 		
     * @return launcher-description (i.e. a keyword)
     */
    public static final SubLObject uiat_kreview_term_get_launcher(SubLObject term_object) {
        return getf(term_object, $SALIENT_DESCRIPTOR_LAUNCHER, UNPROVIDED);
    }

    /**
     *
     *
     * @param UIAT-KREVIEW-TERM?
     * 		
     * @return boolean; Can we start a salient descriptor for this term?
     */
    public static final SubLObject uiat_kreview_term_sd_allowedP(SubLObject term_object) {
        return eq($TRUE, getf(term_object, $kw148$SALIENT_DESCRIPTOR_ALLOWED_, $FALSE));
    }

    /**
     *
     *
     * @param UIAT-KREVIEW-TERM?
     * 		
     * @return BOOLEAN; Can we kill this term?
     */
    public static final SubLObject uiat_kreview_term_forgettableP(SubLObject term_object) {
        return eq($TRUE, getf(term_object, $kw149$FORGETTABLE_, $FALSE));
    }

    /**
     *
     *
     * @param TERM
     * 		CycL term
     * @return plist; containing :term and any other appropriate keywords
     */
    public static final SubLObject uiat_kreview_make_term(SubLObject v_term) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            SubLObject salient_descriptor_launcher = cb_uia_launchers.cb_uia_salient_descriptor_launcher_for_term(v_term, domain_mt);
            SubLObject salient_descriptorP = cb_uia_launchers.cb_uia_launcher_allow_salient_descriptionP(v_term, domain_mt);
            SubLObject forgettableP = uia_trampolines.is_sme_term_in_mtP(v_term, domain_mt);
            SubLObject result = NIL;
            result = putf(result, $TERM, v_term);
            if (NIL != forgettableP) {
                result = putf(result, $kw149$FORGETTABLE_, $TRUE);
            }
            if (NIL != salient_descriptorP) {
                result = putf(result, $kw148$SALIENT_DESCRIPTOR_ALLOWED_, $TRUE);
            }
            if (NIL != salient_descriptor_launcher) {
                result = putf(result, $SALIENT_DESCRIPTOR_LAUNCHER, salient_descriptor_launcher);
            }
            return result;
        }
    }

    /**
     * Format the assertions section named LABEL to STREAM using formulas from CONTENTS and specifying placement in MT
     */
    public static final SubLObject uiat_kreview_format_contents(SubLObject stream, SubLObject contents, SubLObject mt, SubLObject label) {
        if (label == UNPROVIDED) {
            label = NIL;
        }
        if (NIL != contents) {
            {
                SubLObject sorted_contents = uiat_kreview_sort_formulas(contents);
                if (NIL != string_utilities.non_empty_stringP(label)) {
                    format(stream, $str_alt123$__________a____, label);
                }
                {
                    SubLObject cdolist_list_var = sorted_contents;
                    SubLObject content = NIL;
                    for (content = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , content = cdolist_list_var.first()) {
                        {
                            SubLObject mt_name = kb_paths.fort_name(uia_trampolines.uia_best_defining_mt_for_fort_and_sentence(NIL, content, mt));
                            format(stream, $str_alt150$____In_Mt___A___, mt_name);
                            format(stream, $str_alt132$f___S___, content);
                            format(stream, $str_alt151$f_____assertedUsingTool__ist__A__, mt_name, content);
                        }
                    }
                }
            }
        }
        return T;
    }

    public static final SubLObject uiat_kreview_get_my_email_address(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject email = user_interaction_agenda.uia_state_lookup(v_agenda, $MY_EMAIL_ADDRESS, UNPROVIDED);
                if (NIL == email) {
                    {
                        SubLObject user = user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED);
                        thread.resetMultipleValues();
                        {
                            SubLObject my_email = uiat_kreview_find_email_for_cyclist(v_agenda, user);
                            SubLObject found = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            email = my_email;
                            if (found == $FOUND) {
                                user_interaction_agenda.uia_state_update(v_agenda, $MY_EMAIL_ADDRESS, my_email);
                            }
                        }
                    }
                }
                return email;
            }
        }
    }

    // deflexical
    private static final SubLSymbol $uiat_kreview_default_ke_reviewer$ = makeSymbol("*UIAT-KREVIEW-DEFAULT-KE-REVIEWER*");

    public static final SubLObject uiat_kreview_find_email_for_cyclist(SubLObject v_agenda, SubLObject cyclist) {
        {
            SubLObject emails = ask_utilities.ask_variable($sym155$_EMAIL, listS($$preferredEMailAddressText, cyclist, $list_alt157), $$CyclistsMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == emails) {
                return values($uiat_kreview_default_ke_reviewer$.getGlobalValue(), $NOT_FOUND);
            } else {
                return values(emails.first(), $FOUND);
            }
        }
    }

    /**
     *
     *
     * @unknown do better here
     */
    public static final SubLObject uiat_kreview_get_supervisor_email_address(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supervisor = user_interaction_agenda.uia_state_lookup(v_agenda, $MY_SUPERVISOR, UNPROVIDED);
                if (NIL != supervisor) {
                    thread.resetMultipleValues();
                    {
                        SubLObject email = uiat_kreview_find_email_for_cyclist(v_agenda, supervisor);
                        SubLObject foundP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != foundP) {
                            return email;
                        }
                    }
                }
            }
            return $uiat_kreview_default_ke_reviewer$.getGlobalValue();
        }
    }

    /**
     *
     *
     * @unknown do better here
     */
    public static final SubLObject uiat_kreview_generate_subject(SubLObject interaction) {
        return $str_alt161$Please_review_the_following_knowl;
    }

    /**
     *
     *
     * @unknown do better here
     */
    public static final SubLObject uiat_kreview_get_smtp_host(SubLObject v_agenda) {
        return mail_utilities.$smtp_host_cycorp$.getGlobalValue();
    }

    /**
     * Save out the entire KB state created for AGENDA in FILENAME.
     */
    public static final SubLObject uiat_kreview_save(SubLObject v_agenda, SubLObject filename) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(filename, STRINGP);
        return uia_serialize.uia_act_serialize_agenda(v_agenda, filename);
    }

    public static final SubLObject uiat_kjournal_save(SubLObject v_agenda, SubLObject informP) {
        if (informP == UNPROVIDED) {
            informP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filename = uiat_kjournal_construct_knowledge_journal_filename(v_agenda);
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt164$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_24 = stream;
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                            try {
                                html_macros.$html_stream$.bind(stream_24, thread);
                                cb_uia_tools_review_and_testing.show_uia_knowledge_journal(UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject message = cconcatenate($str_alt165$Knowledge_Journal_was_successfull, new SubLObject[]{ filename, $str_alt69$_ });
                    if (NIL != informP) {
                        user_interaction_agenda.uia_act_new_message(v_agenda, message);
                    } else {
                        uia_mumbler.uia_mumble(v_agenda, message);
                    }
                }
            }
            return v_agenda;
        }
    }

    // deflexical
    private static final SubLSymbol $uia_knowledge_journal_base$ = makeSymbol("*UIA-KNOWLEDGE-JOURNAL-BASE*");

    public static final SubLObject uiat_kjournal_construct_knowledge_journal_filename(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sme_name = uia_setup_state.uima_user(user_interaction_agenda.uia_meta_agenda(v_agenda));
                SubLObject sme_name_string = uia_trampolines.uia_term_phrase(v_agenda, sme_name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject acceptable_name_string = file_utilities.clean_filename(sme_name_string);
                SubLObject time_stamp = file_utilities.clean_filename(numeric_date_utilities.timestring(UNPROVIDED));
                SubLObject filename = NIL;
                {
                    SubLObject _prev_bind_0 = transcript_utilities.$transcript_suffix$.currentBinding(thread);
                    try {
                        transcript_utilities.$transcript_suffix$.bind($$$html, thread);
                        filename = transcript_utilities.construct_transcript_filename(cconcatenate($uia_knowledge_journal_base$.getGlobalValue(), new SubLObject[]{ $str_alt168$_, acceptable_name_string, $str_alt168$_, time_stamp }));
                    } finally {
                        transcript_utilities.$transcript_suffix$.rebind(_prev_bind_0, thread);
                    }
                }
                return filename;
            }
        }
    }

    /**
     * Create a new interaction for lexical knowledge review
     */
    public static final SubLObject uiat_act_new_lex_knowledge_reviewer(SubLObject v_agenda, SubLObject mode) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $LEX_KNOWLEDGE_REVIEWER, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Handle completion of a child interaction
     *
     * @unknown The interactions are currently disabled in the inteface
     */
    public static final SubLObject uiat_lex_knowledge_reviewer_child_completed(SubLObject parent, SubLObject child) {
        return uiat_knowledge_reviewer_child_completed(parent, child);
    }

    /**
     * Initiate the lexical knowledge review by gathering assertions and then requesting display
     */
    public static final SubLObject uiat_lex_knowledge_reviewer_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject contents = user_interaction_agenda.ui_state_lookup(interaction, $LEX_LEXICAL_CONTENTS, UNPROVIDED);
            if (NIL == contents) {
                uiat_lex_knowledge_reviewer_constructor(interaction);
            }
            return uiat_lex_knowledge_reviewer_request_guts(interaction);
        }
    }

    /**
     * Process the :save and :refresh actions
     *
     * @unknown These are disabled in the inteface
     */
    public static final SubLObject uiat_lex_knowledge_reviewer_handle_reply(SubLObject reply) {
        return uiat_knowledge_reviewer_handle_reply(reply);
    }

    /**
     * Create a request for displaying thevarious lexical properties (e.g., :lex-terms :lex-lexical-contents, :lex-generation-contents, etc.)
     */
    public static final SubLObject uiat_lex_knowledge_reviewer_request_guts(SubLObject interaction) {
        {
            SubLObject lex_contents = user_interaction_agenda.ui_state_lookup(interaction, $LEX_LEXICAL_CONTENTS, UNPROVIDED);
            SubLObject generation_contents = user_interaction_agenda.ui_state_lookup(interaction, $LEX_GENERATION_CONTENTS, UNPROVIDED);
            SubLObject parsing_contents = user_interaction_agenda.ui_state_lookup(interaction, $LEX_PARSING_CONTENTS, UNPROVIDED);
            SubLObject terms = user_interaction_agenda.ui_state_lookup(interaction, $LEX_TERMS, UNPROVIDED);
            SubLObject request = NIL;
            request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($TERMS, terms, $LEX_LEXICAL_CONTENTS, lex_contents, $LEX_GENERATION_CONTENTS, generation_contents, $LEX_PARSING_CONTENTS, parsing_contents));
            user_interaction_agenda.uia_act_complete(user_interaction_agenda.ui_agenda(interaction), interaction, $DONE);
            return request;
        }
    }

    /**
     * Gather the new lexical terms (word units) and lexical assertions made during INTERACTION.
     * This sets the interaction's :lex-lexical-contents, :lex-generation-contents, and :lex-parsing-contents properties to the assertion formulas from the respective lexical interaction MT's and the :terms properly to the list of terms in :lexical-interaction-mt
     */
    public static final SubLObject uiat_lex_knowledge_reviewer_constructor(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            user_interaction_agenda.ui_state_update(interaction, $LEX_TERMS, uiat_lex_kreview_fetch_terms(user_interaction_agenda.uia_lexical_interaction_mt(v_agenda)));
            uiat_lex_kreview_update_contents(interaction, $LEX_LEXICAL_CONTENTS, user_interaction_agenda.uia_lexical_interaction_mt(v_agenda));
            uiat_lex_kreview_update_contents(interaction, $LEX_GENERATION_CONTENTS, user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED));
            uiat_lex_kreview_update_contents(interaction, $LEX_PARSING_CONTENTS, user_interaction_agenda.uia_parsing_interaction_mt(v_agenda));
        }
        return interaction;
    }

    /**
     * Set PROPERTY in INTERACTION's state with lexical assertions in MT
     */
    public static final SubLObject uiat_lex_kreview_update_contents(SubLObject interaction, SubLObject property, SubLObject mt) {
        {
            SubLObject assertions = uiat_knowledge_reviewer_assertion_mapper(uiat_lex_kreview_fetch_contents(mt), mt);
            user_interaction_agenda.ui_state_update(interaction, property, assertions);
        }
        return T;
    }

    /**
     * Predicates for which assertions will not be paraphrased in lexical knowledge review
     */
    // deflexical
    private static final SubLSymbol $lex_kreview_predicates_to_ignore$ = makeSymbol("*LEX-KREVIEW-PREDICATES-TO-IGNORE*");

    /**
     *
     *
     * @return boolean ; whether lexical assertions ASSERTION should not be displayed in review
     */
    public static final SubLObject uiat_lex_kreview_filter_assertion(SubLObject assertion, SubLObject cycl_sentence) {
        if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(cycl_sentence), $lex_kreview_predicates_to_ignore$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return list : formulas for the assertions in MT
     */
    public static final SubLObject uiat_lex_kreview_fetch_contents(SubLObject mt) {
        return uiat_kreview_fetch_contents(mt);
    }

    /**
     *
     *
     * @return list : forts for Cyc terms defined as dependent on MT
     */
    public static final SubLObject uiat_lex_kreview_fetch_terms(SubLObject mt) {
        return uiat_kreview_fetch_terms(mt);
    }

    public static final SubLObject uia_test_suite_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject tsuite = user_interaction_agenda.ui_state_lookup(interaction, $TEST_SUITE, UNPROVIDED);
            if (NIL == tsuite) {
                return $$$New_Test_Suite;
            } else {
                return cconcatenate($str_alt177$New_Test_Suite__, test_query_suite.test_query_suite_comment(tsuite));
            }
        }
    }

    public static final SubLObject uia_test_suite_get_possible_suite_names(SubLObject interaction) {
        {
            SubLObject mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
            SubLObject tsuites = ask_utilities.ask_variable($sym178$_SUITE_ID, $list_alt179, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return tsuites;
        }
    }

    public static final SubLObject uia_valid_query_p(SubLObject obj) {
        return cycl_query_specification.cycl_query_specification_p(obj);
    }

    public static final SubLObject uia_test_suite_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($CONCEPT_CREATOR)) {
                {
                    SubLObject result = user_interaction_agenda.ui_result(child);
                    SubLObject test_suite_name = parsing_utilities.strip_nl_tags(result, UNPROVIDED);
                    user_interaction_agenda.ui_state_update(parent, $TEST_SUITE_NAME, test_suite_name);
                }
            }
        }
        return parent;
    }

    public static final SubLObject uia_test_suite_finalize(SubLObject interaction) {
        {
            SubLObject old_inference = user_interaction_agenda.ui_state_lookup(interaction, $INFERENCE, UNPROVIDED);
            if (NIL != inference_datastructures_inference.inference_p(old_inference)) {
                inference_datastructures_inference.destroy_inference(old_inference);
            }
        }
        user_interaction_agenda.ui_state_clear(interaction, $INFERENCE);
        return interaction;
    }

    public static final SubLObject uia_test_suite_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt19);
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
                if (pcase_var.eql($RUN_TEST_SUITE_TOOL_QUERY)) {
                    {
                        SubLObject datum_25 = plist;
                        SubLObject current_26 = datum_25;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_26;
                        SubLObject bad = NIL;
                        SubLObject current_27 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_25, $list_alt184);
                            current_27 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_25, $list_alt184);
                            if (NIL == member(current_27, $list_alt185, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_27 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_25, $list_alt184);
                        }
                        {
                            SubLObject query_tail = property_list_member($QUERY, current_26);
                            SubLObject query = (NIL != query_tail) ? ((SubLObject) (cadr(query_tail))) : NIL;
                            if (NIL != cycl_query_specification.cycl_query_specification_formula(query)) {
                                if (NIL == cycl_query_specification.cycl_query_specification_mt(query)) {
                                    cycl_query_specification.cycl_query_specification_set_mt(query, user_interaction_agenda.ui_domain_interaction_mt(interaction));
                                }
                                {
                                    SubLObject old_inference = user_interaction_agenda.ui_state_lookup(interaction, $INFERENCE, UNPROVIDED);
                                    SubLObject new_inference = cycl_query_specification.new_continuable_inference_from_cycl_query_spec(query);
                                    SubLObject result = $ERROR;
                                    SubLObject error_string = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                            try {
                                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                                try {
                                                    result = cycl_query_specification.continue_cycl_query_spec_inference(query, new_inference);
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                rebind(Errors.$error_handler$, _prev_bind_0);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_string = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != inference_datastructures_inference.inference_p(old_inference)) {
                                        inference_datastructures_inference.destroy_inference(old_inference);
                                    }
                                    user_interaction_agenda.ui_state_update(interaction, $INFERENCE, new_inference);
                                    user_interaction_agenda.ui_state_update(interaction, $QUERY_RESULT, result);
                                    if (error_string.isString()) {
                                        user_interaction_agenda.ui_state_update(interaction, $ERROR_MESSAGE, error_string);
                                    }
                                    user_interaction_agenda.ui_state_update(interaction, $QUERY, query);
                                }
                            } else {
                                user_interaction_agenda.ui_state_update(interaction, $QUERY_RESULT, $ERROR);
                                user_interaction_agenda.ui_state_update(interaction, $ERROR_MESSAGE, $str_alt189$No_formula_for_this_query_);
                                user_interaction_agenda.ui_state_update(interaction, $QUERY, query);
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($RUN_TEST_SUITE_TOOL_ALL_QUERIES)) {
                        {
                            SubLObject mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
                            SubLObject test_suite_name = user_interaction_agenda.ui_state_lookup(interaction, $TEST_SUITE_NAME, $UNDETERMINED);
                            SubLObject new_test_suite = test_query_suite.test_query_suite_sort_by_comment(test_query_suite.test_query_suite_get(test_suite_name, mt));
                            SubLObject queries = test_query_suite.test_query_suite_queries(new_test_suite);
                            SubLObject results = NIL;
                            SubLObject new_queries = NIL;
                            SubLObject cdolist_list_var = queries;
                            SubLObject query = NIL;
                            for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                                {
                                    SubLObject new_query = query;
                                    SubLObject result = NIL;
                                    if (NIL == cycl_query_specification.cycl_query_specification_mt(new_query)) {
                                        cycl_query_specification.cycl_query_specification_set_mt(new_query, mt);
                                    }
                                    result = cycl_query_specification.cycl_query_specification_rkf_ask(new_query);
                                    new_queries = cons(new_query, new_queries);
                                    results = cons(result, results);
                                }
                            }
                            test_query_suite.test_query_suite_set_queries(new_test_suite, new_queries);
                            user_interaction_agenda.ui_state_update(interaction, $ALL_QUERY_RESULTS, results);
                            user_interaction_agenda.ui_state_update(interaction, $ALL_QUERY_TEST_SUITE, new_test_suite);
                        }
                    } else
                        if (pcase_var.eql($SET_TEST_SUITE_NAME)) {
                            {
                                SubLObject datum_28 = plist;
                                SubLObject current_29 = datum_28;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_29;
                                SubLObject bad = NIL;
                                SubLObject current_30 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_28, $list_alt194);
                                    current_30 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_28, $list_alt194);
                                    if (NIL == member(current_30, $list_alt195, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_30 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_28, $list_alt194);
                                }
                                {
                                    SubLObject test_suite_name_tail = property_list_member($TEST_SUITE_NAME, current_29);
                                    SubLObject test_suite_name = (NIL != test_suite_name_tail) ? ((SubLObject) (cadr(test_suite_name_tail))) : NIL;
                                    if (NIL != uia_test_suite_tool_is_new_test_suite_tag_p(test_suite_name)) {
                                        {
                                            SubLObject child = uia_tools_introduction.uia_act_new_concept_creator(v_agenda, $REQUIRED, $$$my_new_test_suite, list($const197$SMEKnowledgeEntryTestSpecificatio), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                        }
                                    } else {
                                        user_interaction_agenda.ui_state_update(interaction, $TEST_SUITE_NAME, test_suite_name);
                                    }
                                }
                            }
                        } else
                            if (pcase_var.eql($REDISPLAY_RESULT)) {
                                {
                                    SubLObject datum_31 = plist;
                                    SubLObject current_32 = datum_31;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current_32;
                                    SubLObject bad = NIL;
                                    SubLObject current_33 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum_31, $list_alt184);
                                        current_33 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum_31, $list_alt184);
                                        if (NIL == member(current_33, $list_alt185, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_33 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum_31, $list_alt184);
                                    }
                                    {
                                        SubLObject query_tail = property_list_member($QUERY, current_32);
                                        SubLObject query = (NIL != query_tail) ? ((SubLObject) (cadr(query_tail))) : NIL;
                                        user_interaction_agenda.ui_state_update(interaction, $QUERY, query);
                                    }
                                }
                            }



            }
        }
        return NIL;
    }

    public static final SubLObject uia_test_suite_tool_is_new_test_suite_tag_p(SubLObject test_suite_name) {
        return eq(test_suite_name, $const199$SMEKnowledgeEntryTestSpecificatio);
    }

    public static final SubLObject uia_test_suite_generate_request(SubLObject interaction) {
        {
            SubLObject mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
            SubLObject test_suite_name = user_interaction_agenda.ui_state_lookup(interaction, $TEST_SUITE_NAME, $UNDETERMINED);
            SubLObject tsuite = user_interaction_agenda.ui_state_lookup(interaction, $TEST_SUITE, $UNDETERMINED);
            SubLObject query = user_interaction_agenda.ui_state_lookup(interaction, $QUERY, $UNDETERMINED);
            SubLObject all_query_results = user_interaction_agenda.ui_state_lookup(interaction, $ALL_QUERY_RESULTS, $UNDETERMINED);
            SubLObject all_query_test_suite = user_interaction_agenda.ui_state_lookup(interaction, $ALL_QUERY_TEST_SUITE, $UNDETERMINED);
            if (test_suite_name == $UNDETERMINED) {
                {
                    SubLObject test_suite_names = uia_test_suite_get_possible_suite_names(interaction);
                    return user_interaction_agenda.make_ui_request(interaction, $CHOOSE_TEST_SUITE, list($TEST_SUITE_NAMES, test_suite_names));
                }
            } else
                if (all_query_results != $UNDETERMINED) {
                    user_interaction_agenda.ui_state_update(interaction, $ALL_QUERY_RESULTS_STORE, all_query_results);
                    user_interaction_agenda.ui_state_clear(interaction, $ALL_QUERY_RESULTS);
                    return user_interaction_agenda.make_ui_request(interaction, $SHOW_ALL_QUERY_RESULTS, list($TEST_SUITE, all_query_test_suite, $RESULTS, all_query_results));
                } else
                    if (NIL != cycl_query_specification.cycl_query_specification_p(query)) {
                        {
                            SubLObject result = user_interaction_agenda.ui_state_lookup(interaction, $QUERY_RESULT, $UNDETERMINED);
                            user_interaction_agenda.ui_state_clear(interaction, $QUERY);
                            return user_interaction_agenda.make_ui_request(interaction, $SHOW_TEST_RESULT, list($QUERY_RESULT, result, $QUERY, query));
                        }
                    }


            if ((tsuite == $UNDETERMINED) && (test_suite_name != $UNDETERMINED)) {
                {
                    SubLObject new_tsuite = test_query_suite.test_query_suite_sort_by_comment(test_query_suite.test_query_suite_get(test_suite_name, mt));
                    user_interaction_agenda.ui_state_update(interaction, $TEST_SUITE, new_tsuite);
                    tsuite = new_tsuite;
                }
            }
            return user_interaction_agenda.make_ui_request(interaction, $SHOW_TEST_SUITE, list($TEST_SUITE, tsuite));
        }
    }

    public static final SubLObject declare_uia_tools_review_and_testing_file() {
        declareFunction("uia_act_new_common_queries", "UIA-ACT-NEW-COMMON-QUERIES", 2, 1, false);
        declareFunction("uia_act_new_common_queries_about", "UIA-ACT-NEW-COMMON-QUERIES-ABOUT", 2, 0, false);
        declareFunction("uiat_common_queries_hint", "UIAT-COMMON-QUERIES-HINT", 1, 0, false);
        declareFunction("uiat_common_queries_child_completed", "UIAT-COMMON-QUERIES-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_common_queries_child_rejected", "UIAT-COMMON-QUERIES-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_common_queries_generate_request", "UIAT-COMMON-QUERIES-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_common_queries_handle_reply", "UIAT-COMMON-QUERIES-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_common_queries_initialized", "UIAT-COMMON-QUERIES-INITIALIZED", 1, 0, false);
        declareFunction("uiat_common_queries_focus", "UIAT-COMMON-QUERIES-FOCUS", 2, 0, false);
        declareFunction("uiat_common_query_specs_focus", "UIAT-COMMON-QUERY-SPECS-FOCUS", 2, 0, false);
        declareFunction("uiat_common_queries_initialize", "UIAT-COMMON-QUERIES-INITIALIZE", 1, 0, false);
        declareFunction("uia_act_new_quirk_question", "UIA-ACT-NEW-QUIRK-QUESTION", 2, 1, false);
        declareFunction("uiat_ask_quirk_hint", "UIAT-ASK-QUIRK-HINT", 1, 0, false);
        declareFunction("uiat_ask_quirk_generate_request", "UIAT-ASK-QUIRK-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_ask_quirk_handle_reply", "UIAT-ASK-QUIRK-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_ask_quirk_child_completed", "UIAT-ASK-QUIRK-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_ask_quirk_child_rejected", "UIAT-ASK-QUIRK-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_ask_quirk_child_invalidated", "UIAT-ASK-QUIRK-CHILD-INVALIDATED", 2, 0, false);
        declareFunction("uiat_ask_quirk_corpus", "UIAT-ASK-QUIRK-CORPUS", 1, 0, false);
        declareFunction("uiat_act_new_knowledge_reviewer", "UIAT-ACT-NEW-KNOWLEDGE-REVIEWER", 2, 1, false);
        declareFunction("uia_knowledge_reviewer_need_refreshP", "UIA-KNOWLEDGE-REVIEWER-NEED-REFRESH?", 1, 0, false);
        declareFunction("uia_knowledge_reviewer_refreshed", "UIA-KNOWLEDGE-REVIEWER-REFRESHED", 1, 0, false);
        declareFunction("uia_knowledge_reviewer_note_refresh_required", "UIA-KNOWLEDGE-REVIEWER-NOTE-REFRESH-REQUIRED", 1, 0, false);
        declareFunction("uia_knowledge_reviewer_need_refresh_from_global_infoP", "UIA-KNOWLEDGE-REVIEWER-NEED-REFRESH-FROM-GLOBAL-INFO?", 2, 0, false);
        declareFunction("uiat_knowledge_reviewer_child_completed", "UIAT-KNOWLEDGE-REVIEWER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_knowledge_reviewer_generate_request", "UIAT-KNOWLEDGE-REVIEWER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_knowledge_reviewer_handle_reply", "UIAT-KNOWLEDGE-REVIEWER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_knowledge_reviewer_request_guts", "UIAT-KNOWLEDGE-REVIEWER-REQUEST-GUTS", 1, 0, false);
        declareFunction("uiat_knowledge_reviewer_assertion_by_term_mapper", "UIAT-KNOWLEDGE-REVIEWER-ASSERTION-BY-TERM-MAPPER", 2, 0, false);
        declareFunction("uia_term_review_assertion_plist", "UIA-TERM-REVIEW-ASSERTION-PLIST", 1, 0, false);
        declareFunction("uia_term_review_cyc_assertedP", "UIA-TERM-REVIEW-CYC-ASSERTED?", 1, 0, false);
        declareFunction("uia_term_review_formula_plist", "UIA-TERM-REVIEW-FORMULA-PLIST", 2, 0, false);
        declareFunction("uiat_knowledge_reviewer_constructor", "UIAT-KNOWLEDGE-REVIEWER-CONSTRUCTOR", 1, 0, false);
        declareFunction("uiat_knowledge_reviewer_get_assertions_by_term", "UIAT-KNOWLEDGE-REVIEWER-GET-ASSERTIONS-BY-TERM", 1, 1, false);
        declareFunction("uiat_kreview_filter_assertion", "UIAT-KREVIEW-FILTER-ASSERTION", 3, 0, false);
        declareFunction("uiat_kreview_submit_filter_assertionP", "UIAT-KREVIEW-SUBMIT-FILTER-ASSERTION?", 3, 0, false);
        declareFunction("uiat_kreview_onscreen_filter_assertionP", "UIAT-KREVIEW-ONSCREEN-FILTER-ASSERTION?", 3, 0, false);
        declareFunction("uiat_kreview_fetch_assertions_for_terms", "UIAT-KREVIEW-FETCH-ASSERTIONS-FOR-TERMS", 2, 0, false);
        declareFunction("uiat_kreview_bag_assertions_for_terms", "UIAT-KREVIEW-BAG-ASSERTIONS-FOR-TERMS", 2, 0, false);
        declareFunction("uiat_kreview_fetch_assertions_for_term", "UIAT-KREVIEW-FETCH-ASSERTIONS-FOR-TERM", 2, 0, false);
        declareFunction("uiat_kreview_fetch_contents_for_terms", "UIAT-KREVIEW-FETCH-CONTENTS-FOR-TERMS", 2, 0, false);
        declareFunction("uiat_kreview_fetch_miscellaneous_assertions", "UIAT-KREVIEW-FETCH-MISCELLANEOUS-ASSERTIONS", 2, 0, false);
        declareFunction("uiat_kreview_find_all_assertions_by_user", "UIAT-KREVIEW-FIND-ALL-ASSERTIONS-BY-USER", 1, 0, false);
        declareFunction("uiat_kreview_fetch_contents_by_topic_ordering_principles", "UIAT-KREVIEW-FETCH-CONTENTS-BY-TOPIC-ORDERING-PRINCIPLES", 2, 0, false);
        declareFunction("uiat_kreview_perform_sub_organizations", "UIAT-KREVIEW-PERFORM-SUB-ORGANIZATIONS", 2, 0, false);
        declareFunction("uiat_kreview_convert_classification_set_to_list", "UIAT-KREVIEW-CONVERT-CLASSIFICATION-SET-TO-LIST", 2, 0, false);
        declareFunction("uiat_kreview_defining_assertions_first", "UIAT-KREVIEW-DEFINING-ASSERTIONS-FIRST", 2, 0, false);
        declareFunction("uiat_kreview_temporal_order", "UIAT-KREVIEW-TEMPORAL-ORDER", 2, 0, false);
        declareFunction("uiat_kreview_fetch_terms", "UIAT-KREVIEW-FETCH-TERMS", 1, 0, false);
        declareFunction("uiat_knowledge_reviewer_assertion_mapper", "UIAT-KNOWLEDGE-REVIEWER-ASSERTION-MAPPER", 2, 0, false);
        declareFunction("uiat_kreview_fetch_contents", "UIAT-KREVIEW-FETCH-CONTENTS", 1, 0, false);
        declareFunction("uiat_kreview_harvester", "UIAT-KREVIEW-HARVESTER", 1, 0, false);
        declareFunction("uiat_kreview_submit_knowledge_for_review", "UIAT-KREVIEW-SUBMIT-KNOWLEDGE-FOR-REVIEW", 1, 2, false);
        declareFunction("uiat_kreview_gather_up_message_from_agenda", "UIAT-KREVIEW-GATHER-UP-MESSAGE-FROM-AGENDA", 1, 0, false);
        declareFunction("uiat_kreview_gather_up_message", "UIAT-KREVIEW-GATHER-UP-MESSAGE", 1, 0, false);
        declareFunction("uiat_kreview_gather_up_message_internal", "UIAT-KREVIEW-GATHER-UP-MESSAGE-INTERNAL", 11, 0, false);
        declareFunction("uiat_kreview_format_terms_and_formulas", "UIAT-KREVIEW-FORMAT-TERMS-AND-FORMULAS", 3, 1, false);
        declareFunction("constants_first", "CONSTANTS-FIRST", 2, 0, false);
        declareFunction("uiat_kreview_note_term_rename", "UIAT-KREVIEW-NOTE-TERM-RENAME", 1, 0, false);
        declareFunction("uiat_kreview_format_formulas", "UIAT-KREVIEW-FORMAT-FORMULAS", 4, 2, false);
        declareFunction("ke_submit_precedes", "KE-SUBMIT-PRECEDES", 2, 0, false);
        declareFunction("uiat_kreview_sort_formulas", "UIAT-KREVIEW-SORT-FORMULAS", 1, 0, false);
        declareFunction("uiat_kreview_get_formula", "UIAT-KREVIEW-GET-FORMULA", 1, 0, false);
        declareFunction("isa_first", "ISA-FIRST", 2, 0, false);
        declareFunction("genls_first", "GENLS-FIRST", 2, 0, false);
        declareFunction("narts_later", "NARTS-LATER", 2, 0, false);
        declareFunction("genstringassertion_later", "GENSTRINGASSERTION-LATER", 2, 0, false);
        declareFunction("uiat_kreview_format_terms", "UIAT-KREVIEW-FORMAT-TERMS", 3, 1, false);
        declareFunction("uiat_kreview_termP", "UIAT-KREVIEW-TERM?", 1, 0, false);
        declareFunction("uiat_kreview_get_term", "UIAT-KREVIEW-GET-TERM", 1, 0, false);
        declareFunction("uiat_kreview_term_get_launcher", "UIAT-KREVIEW-TERM-GET-LAUNCHER", 1, 0, false);
        declareFunction("uiat_kreview_term_sd_allowedP", "UIAT-KREVIEW-TERM-SD-ALLOWED?", 1, 0, false);
        declareFunction("uiat_kreview_term_forgettableP", "UIAT-KREVIEW-TERM-FORGETTABLE?", 1, 0, false);
        declareFunction("uiat_kreview_make_term", "UIAT-KREVIEW-MAKE-TERM", 1, 0, false);
        declareFunction("uiat_kreview_format_contents", "UIAT-KREVIEW-FORMAT-CONTENTS", 3, 1, false);
        declareFunction("uiat_kreview_get_my_email_address", "UIAT-KREVIEW-GET-MY-EMAIL-ADDRESS", 1, 0, false);
        declareFunction("uiat_kreview_find_email_for_cyclist", "UIAT-KREVIEW-FIND-EMAIL-FOR-CYCLIST", 2, 0, false);
        declareFunction("uiat_kreview_get_supervisor_email_address", "UIAT-KREVIEW-GET-SUPERVISOR-EMAIL-ADDRESS", 1, 0, false);
        declareFunction("uiat_kreview_generate_subject", "UIAT-KREVIEW-GENERATE-SUBJECT", 1, 0, false);
        declareFunction("uiat_kreview_get_smtp_host", "UIAT-KREVIEW-GET-SMTP-HOST", 1, 0, false);
        declareFunction("uiat_kreview_save", "UIAT-KREVIEW-SAVE", 2, 0, false);
        declareFunction("uiat_kjournal_save", "UIAT-KJOURNAL-SAVE", 1, 1, false);
        declareFunction("uiat_kjournal_construct_knowledge_journal_filename", "UIAT-KJOURNAL-CONSTRUCT-KNOWLEDGE-JOURNAL-FILENAME", 1, 0, false);
        declareFunction("uiat_act_new_lex_knowledge_reviewer", "UIAT-ACT-NEW-LEX-KNOWLEDGE-REVIEWER", 2, 0, false);
        declareFunction("uiat_lex_knowledge_reviewer_child_completed", "UIAT-LEX-KNOWLEDGE-REVIEWER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_lex_knowledge_reviewer_generate_request", "UIAT-LEX-KNOWLEDGE-REVIEWER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_lex_knowledge_reviewer_handle_reply", "UIAT-LEX-KNOWLEDGE-REVIEWER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_lex_knowledge_reviewer_request_guts", "UIAT-LEX-KNOWLEDGE-REVIEWER-REQUEST-GUTS", 1, 0, false);
        declareFunction("uiat_lex_knowledge_reviewer_constructor", "UIAT-LEX-KNOWLEDGE-REVIEWER-CONSTRUCTOR", 1, 0, false);
        declareFunction("uiat_lex_kreview_update_contents", "UIAT-LEX-KREVIEW-UPDATE-CONTENTS", 3, 0, false);
        declareFunction("uiat_lex_kreview_filter_assertion", "UIAT-LEX-KREVIEW-FILTER-ASSERTION", 2, 0, false);
        declareFunction("uiat_lex_kreview_fetch_contents", "UIAT-LEX-KREVIEW-FETCH-CONTENTS", 1, 0, false);
        declareFunction("uiat_lex_kreview_fetch_terms", "UIAT-LEX-KREVIEW-FETCH-TERMS", 1, 0, false);
        declareFunction("uia_test_suite_hint", "UIA-TEST-SUITE-HINT", 1, 0, false);
        declareFunction("uia_test_suite_get_possible_suite_names", "UIA-TEST-SUITE-GET-POSSIBLE-SUITE-NAMES", 1, 0, false);
        declareFunction("uia_valid_query_p", "UIA-VALID-QUERY-P", 1, 0, false);
        declareFunction("uia_test_suite_child_completed", "UIA-TEST-SUITE-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uia_test_suite_finalize", "UIA-TEST-SUITE-FINALIZE", 1, 0, false);
        declareFunction("uia_test_suite_handle_reply", "UIA-TEST-SUITE-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_test_suite_tool_is_new_test_suite_tag_p", "UIA-TEST-SUITE-TOOL-IS-NEW-TEST-SUITE-TAG-P", 1, 0, false);
        declareFunction("uia_test_suite_generate_request", "UIA-TEST-SUITE-GENERATE-REQUEST", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_tools_review_and_testing_file() {
        deflexical("*UIAT-NO-QUIRK-MESSAGE*", $str_alt42$Asking_the_Text_Corpora_is_not_su);
        defparameter("*UIAT-KREVIEW-FILTER-FUNCTION*", $sym90$UIAT_KREVIEW_ONSCREEN_FILTER_ASSERTION_);
        defparameter("*UIAT-KREVIEW-ACCUMULATOR*", NIL);
        defparameter("*UIAT-KREVIEW-SUBMIT-RENAMES*", NIL);
        deflexical("*UIAT-KREVIEW-DEFAULT-KE-REVIEWER*", $str_alt154$rkf_ke_review_cyc_com);
        deflexical("*UIA-KNOWLEDGE-JOURNAL-BASE*", $str_alt166$uia_kjournal_of_sme);
        deflexical("*LEX-KREVIEW-PREDICATES-TO-IGNORE*", $list_alt172);
        return NIL;
    }

    public static final SubLObject setup_uia_tools_review_and_testing_file() {
                uia_tool_declaration.declare_uia_tool($COMMON_QUERIES, $list_alt1);
        uia_tool_declaration.declare_uia_tool($ASK_QUIRK, $list_alt39);
        uia_tool_declaration.declare_uia_tool($KNOWLEDGE_REVIEWER, $list_alt59);
        uia_tool_declaration.declare_uia_tool($LEX_KNOWLEDGE_REVIEWER, $list_alt170);
        uia_tool_declaration.declare_uia_tool($TEST_SUITE_TOOL, $list_alt174);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $COMMON_QUERIES = makeKeyword("COMMON-QUERIES");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ $NAME, makeString("Common Queries"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-COMMON-QUERIES-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-COMMON-QUERIES-CHILD-COMPLETED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-COMMON-QUERIES-CHILD-REJECTED"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-COMMON-QUERIES-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-COMMON-QUERIES-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycCommonQueriesTool")) });



    private static final SubLSymbol $FOCUS_REQUESTED = makeKeyword("FOCUS-REQUESTED");



    private static final SubLSymbol $FOCUS_TERM = makeKeyword("FOCUS-TERM");



    static private final SubLString $$$Common_Queries = makeString("Common Queries");

    static private final SubLString $str_alt8$Queries_for__A = makeString("Queries for ~A");

    private static final SubLSymbol $CONCEPT_DISAMBIGUATOR = makeKeyword("CONCEPT-DISAMBIGUATOR");



    private static final SubLSymbol UIAT_COMMON_QUERIES_INITIALIZE = makeSymbol("UIAT-COMMON-QUERIES-INITIALIZE");

    private static final SubLSymbol $FOCUS_RESULTS = makeKeyword("FOCUS-RESULTS");



    private static final SubLSymbol $QUERY_FORMULAS = makeKeyword("QUERY-FORMULAS");

    private static final SubLSymbol $QUERY_SPECS = makeKeyword("QUERY-SPECS");



    private static final SubLSymbol $SHOW_ALL = makeKeyword("SHOW-ALL");



    static private final SubLList $list_alt19 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("TEMP-PLIST"));







    static private final SubLList $list_alt23 = list(makeSymbol("&KEY"), makeSymbol("QUERY-TYPE"), makeSymbol("QUERY"));

    static private final SubLList $list_alt24 = list(makeKeyword("QUERY-TYPE"), makeKeyword("QUERY"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $QUERY_TYPE = makeKeyword("QUERY-TYPE");





    static private final SubLList $list_alt29 = list(ONE_INTEGER, TEN_INTEGER, makeInteger(30), NIL);



    private static final SubLSymbol $FOCUS_CLEARED = makeKeyword("FOCUS-CLEARED");

    private static final SubLSymbol $FOCUS_SPECIFIED = makeKeyword("FOCUS-SPECIFIED");

    static private final SubLList $list_alt33 = list(makeSymbol("&KEY"), makeSymbol("PHRASE"));

    static private final SubLList $list_alt34 = list(makeKeyword("PHRASE"));



    static private final SubLString $str_alt36$Computing_example_queries_ = makeString("Computing example queries.");

    static private final SubLString $str_alt37$Translating_example_queries_ = makeString("Translating example queries.");



    static private final SubLList $list_alt39 = list(new SubLObject[]{ $NAME, makeString("Ask QUIRK"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-ASK-QUIRK-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-ASK-QUIRK-CHILD-COMPLETED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-ASK-QUIRK-CHILD-INVALIDATED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-ASK-QUIRK-CHILD-REJECTED"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-ASK-QUIRK-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-ASK-QUIRK-HANDLE-REPLY") });

    static private final SubLString $str_alt40$Search_Text_Corpora_for_Answers_t = makeString("Search Text Corpora for Answers to '");

    static private final SubLString $str_alt41$__ = makeString("'.");

    static private final SubLString $str_alt42$Asking_the_Text_Corpora_is_not_su = makeString("Asking the Text Corpora is not supported in this version of CYC.");

    private static final SubLSymbol $QUERY_INTERACTION = makeKeyword("QUERY-INTERACTION");

    private static final SubLSymbol UIAT_ASK_QUIRK_CORPUS = makeSymbol("UIAT-ASK-QUIRK-CORPUS");

    static private final SubLString $str_alt45$Searching_text_corpora_____ = makeString("Searching text corpora ....");

    private static final SubLSymbol $QUIRK_RESULTS = makeKeyword("QUIRK-RESULTS");





    private static final SubLSymbol $LEARN_FACTOID = makeKeyword("LEARN-FACTOID");

    static private final SubLList $list_alt50 = list(makeSymbol("&KEY"), makeSymbol("ANSWER-OBJECT"), makeSymbol("NL-SENTENCE"));

    static private final SubLList $list_alt51 = list(makeKeyword("ANSWER-OBJECT"), makeKeyword("NL-SENTENCE"));

    private static final SubLSymbol $ANSWER_OBJECT = makeKeyword("ANSWER-OBJECT");



    private static final SubLSymbol $MY_RESULT_WILL_BE = makeKeyword("MY-RESULT-WILL-BE");

    static private final SubLList $list_alt55 = list(makeString("CNS"), makeString("AQUAINT"));



    static private final SubLString $str_alt57$I_received__A_from_QUIRK_ = makeString("I received ~A from QUIRK.");

    private static final SubLSymbol $KNOWLEDGE_REVIEWER = makeKeyword("KNOWLEDGE-REVIEWER");

    static private final SubLList $list_alt59 = list(new SubLObject[]{ $NAME, makeString("Knowledge Reviewer"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-KNOWLEDGE-REVIEWER-CHILD-COMPLETED"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-KNOWLEDGE-REVIEWER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-KNOWLEDGE-REVIEWER-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycKnowledgeReviewer")) });

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");


    private static final SubLSymbol $FRAMELESS = makeKeyword("FRAMELESS");



    private static final SubLSymbol $KREVIEWER_NEEDS_REFRESH = makeKeyword("KREVIEWER-NEEDS-REFRESH");

    private static final SubLSymbol $FILE_BROWSER = makeKeyword("FILE-BROWSER");

    private static final SubLSymbol $FB_STATE = makeKeyword("FB-STATE");





    static private final SubLString $str_alt69$_ = makeString(".");

    private static final SubLSymbol $GET_REVIEWED = makeKeyword("GET-REVIEWED");



    private static final SubLSymbol $MISC_CONTENTS = makeKeyword("MISC-CONTENTS");

    private static final SubLSymbol $HELP_TEXT = makeKeyword("HELP-TEXT");



    static private final SubLString $str_alt75$found_something_that_doesn_t_fit_ = makeString("found something that doesn't fit in the uia-term-mapper: ~S~%");







    private static final SubLSymbol $INTERVIEW = makeKeyword("INTERVIEW");











    public static final SubLObject $$Cyc = constant_handles.reader_make_constant_shell(makeString("Cyc"));

    private static final SubLSymbol $SENTENCE_COUNT = makeKeyword("SENTENCE-COUNT");

    private static final SubLSymbol $TOPIC_SORT = makeKeyword("TOPIC-SORT");

    private static final SubLSymbol $MISC_ASSERTS = makeKeyword("MISC-ASSERTS");



    static private final SubLSymbol $sym90$UIAT_KREVIEW_ONSCREEN_FILTER_ASSERTION_ = makeSymbol("UIAT-KREVIEW-ONSCREEN-FILTER-ASSERTION?");

    static private final SubLList $list_alt91 = list(constant_handles.reader_make_constant_shell(makeString("uiaDisplayTerm")), constant_handles.reader_make_constant_shell(makeString("termDependsOn")));

    private static final SubLSymbol UIAT_KREVIEW_TEMPORAL_ORDER = makeSymbol("UIAT-KREVIEW-TEMPORAL-ORDER");

    private static final SubLSymbol UIAT_KREVIEW_DEFINING_ASSERTIONS_FIRST = makeSymbol("UIAT-KREVIEW-DEFINING-ASSERTIONS-FIRST");



    private static final SubLSymbol UIAT_KREVIEW_HARVESTER = makeSymbol("UIAT-KREVIEW-HARVESTER");



    public static final SubLObject $$RKFInteractionContextMicrotheory = constant_handles.reader_make_constant_shell(makeString("RKFInteractionContextMicrotheory"));



    static private final SubLSymbol $sym99$UIAT_KREVIEW_SUBMIT_FILTER_ASSERTION_ = makeSymbol("UIAT-KREVIEW-SUBMIT-FILTER-ASSERTION?");

    static private final SubLString $str_alt100$Sent__A_the_following_knowledge_f = makeString("Sent ~A the following knowledge for review:~%~S~%");

    static private final SubLString $str_alt101$Got_the_error_message__S_while_tr = makeString("Got the error message ~S while trying to send ~A the following message:~%~S~%");

    static private final SubLString $str_alt102$_cyc_projects_rkf_ke_ke_finalizat = makeString("/cyc/projects/rkf/ke/ke-finalization/ke-~A-~A.ke");

    static private final SubLString $str_alt103$_S__ = makeString("~S~%");

    static private final SubLList $list_alt104 = list(makeSymbol("OLD-NAME"), makeSymbol("NEW-NAME"));

    static private final SubLString $str_alt105$__ = makeString("#$");







    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");



    static private final SubLString $str_alt111$_A__ = makeString("~A~%");

    static private final SubLString $str_alt112$UIA_KE_file_to_load___A__ = makeString("UIA KE file to load: ~A~%");

    static private final SubLString $str_alt113$Unable_to_save_file__A__Received_ = makeString("Unable to save file ~A~%Received error: ~A~%KE for file: ~A");

    private static final SubLSymbol $LEX_LEXICAL_CONTENTS = makeKeyword("LEX-LEXICAL-CONTENTS");

    private static final SubLSymbol $LEX_TERMS = makeKeyword("LEX-TERMS");

    private static final SubLSymbol $LEX_GENERATION_CONTENTS = makeKeyword("LEX-GENERATION-CONTENTS");

    private static final SubLSymbol $LEX_PARSING_CONTENTS = makeKeyword("LEX-PARSING-CONTENTS");

    static private final SubLString $str_alt118$_________________ = makeString("~&~%;;---------~%");

    static private final SubLString $$$Lexical_Terms = makeString("Lexical Terms");

    static private final SubLString $$$Lexical_Mappings = makeString("Lexical Mappings");

    static private final SubLString $$$Generation_Templates = makeString("Generation Templates");

    static private final SubLString $$$Parsing_Templates = makeString("Parsing Templates");

    static private final SubLString $str_alt123$__________a____ = makeString("~&~%~%;; ~a~%~%");

    private static final SubLSymbol CONSTANTS_FIRST = makeSymbol("CONSTANTS-FIRST");

    private static final SubLSymbol UIAT_KREVIEW_GET_TERM = makeSymbol("UIAT-KREVIEW-GET-TERM");

    public static final SubLObject $$UIANonClassifiedAssertion = constant_handles.reader_make_constant_shell(makeString("UIANonClassifiedAssertion"));

    static private final SubLString $str_alt127$____Constant___A___ = makeString("~&~%Constant: ~A.~%");

    static private final SubLString $str_alt128$_______Miscellaneous_Assertions__ = makeString("~&~%;; Miscellaneous Assertions~%~%");

    static private final SubLString $str_alt129$RKF_ = makeString("RKF-");

    static private final SubLString $str_alt130$ = makeString("");

    static private final SubLString $str_alt131$in_Mt___A___ = makeString("in Mt: ~A.~%");

    static private final SubLString $str_alt132$f___S___ = makeString("f: ~S.~%");

    static private final SubLString $str_alt133$In_Mt__UIABookkeepingMt___ = makeString("In Mt: UIABookkeepingMt.~%");

    static private final SubLString $str_alt134$f___assertedUsingTool__ist__A__A_ = makeString("f: (assertedUsingTool (ist ~A ~A) #$UIA-CycProgram).~%~%");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    public static final SubLObject $$genStringAssertion = constant_handles.reader_make_constant_shell(makeString("genStringAssertion"));

    private static final SubLSymbol GENSTRINGASSERTION_LATER = makeSymbol("GENSTRINGASSERTION-LATER");

    private static final SubLSymbol UIAT_KREVIEW_GET_FORMULA = makeSymbol("UIAT-KREVIEW-GET-FORMULA");

    private static final SubLSymbol NARTS_LATER = makeSymbol("NARTS-LATER");

    private static final SubLSymbol GENLS_FIRST = makeSymbol("GENLS-FIRST");

    private static final SubLSymbol ISA_FIRST = makeSymbol("ISA-FIRST");

    static private final SubLSymbol $sym143$FORT_OR_NAUT_WITH_CORRESPONDING_NART_ = makeSymbol("FORT-OR-NAUT-WITH-CORRESPONDING-NART?");

    static private final SubLString $str_alt144$__Default_Mt___A_____ = makeString("~&Default Mt: ~A.~%~%");

    static private final SubLString $str_alt145$Constant___A___ = makeString("Constant: ~A.~%");

    static private final SubLString $str_alt146$__ = makeString("~%");

    private static final SubLSymbol $SALIENT_DESCRIPTOR_LAUNCHER = makeKeyword("SALIENT-DESCRIPTOR-LAUNCHER");

    public static final SubLSymbol $kw148$SALIENT_DESCRIPTOR_ALLOWED_ = makeKeyword("SALIENT-DESCRIPTOR-ALLOWED?");

    public static final SubLSymbol $kw149$FORGETTABLE_ = makeKeyword("FORGETTABLE?");

    static private final SubLString $str_alt150$____In_Mt___A___ = makeString("~&~%In Mt: ~A.~%");

    static private final SubLString $str_alt151$f_____assertedUsingTool__ist__A__ = makeString("f: (#$assertedUsingTool (ist ~A ~S) #$UIA-CycProgram).~%");

    private static final SubLSymbol $MY_EMAIL_ADDRESS = makeKeyword("MY-EMAIL-ADDRESS");



    static private final SubLString $str_alt154$rkf_ke_review_cyc_com = makeString("rkf-ke-review@cyc.com");

    static private final SubLSymbol $sym155$_EMAIL = makeSymbol("?EMAIL");

    public static final SubLObject $$preferredEMailAddressText = constant_handles.reader_make_constant_shell(makeString("preferredEMailAddressText"));

    static private final SubLList $list_alt157 = list(makeSymbol("?EMAIL"));

    public static final SubLObject $$CyclistsMt = constant_handles.reader_make_constant_shell(makeString("CyclistsMt"));



    private static final SubLSymbol $MY_SUPERVISOR = makeKeyword("MY-SUPERVISOR");

    static private final SubLString $str_alt161$Please_review_the_following_knowl = makeString("Please review the following knowledge");

    private static final SubLSymbol USER_INTERACTION_AGENDA_P = makeSymbol("USER-INTERACTION-AGENDA-P");



    static private final SubLString $str_alt164$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt165$Knowledge_Journal_was_successfull = makeString("Knowledge Journal was successfully saved to ");

    static private final SubLString $str_alt166$uia_kjournal_of_sme = makeString("uia-kjournal-of-sme");

    static private final SubLString $$$html = makeString("html");

    static private final SubLString $str_alt168$_ = makeString("-");

    private static final SubLSymbol $LEX_KNOWLEDGE_REVIEWER = makeKeyword("LEX-KNOWLEDGE-REVIEWER");

    static private final SubLList $list_alt170 = list($NAME, makeString("Lexical Knowledge Reviewer"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-LEX-KNOWLEDGE-REVIEWER-CHILD-COMPLETED"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-LEX-KNOWLEDGE-REVIEWER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-LEX-KNOWLEDGE-REVIEWER-HANDLE-REPLY"));



    static private final SubLList $list_alt172 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("termDependsOn")), constant_handles.reader_make_constant_shell(makeString("termStrings")), constant_handles.reader_make_constant_shell(makeString("uiaDisplayTerm")));

    private static final SubLSymbol $TEST_SUITE_TOOL = makeKeyword("TEST-SUITE-TOOL");

    static private final SubLList $list_alt174 = list(new SubLObject[]{ $NAME, makeString("Test Suite Tool"), makeKeyword("HINT-METHOD"), makeSymbol("UIA-TEST-SUITE-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIA-TEST-SUITE-CHILD-COMPLETED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIA-TSUITE-CHILD-INVALIDATED-METHOD"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIA-TSUITE-CHILD-REJECTED-METHOD"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIA-TEST-SUITE-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIA-TEST-SUITE-HANDLE-REPLY"), makeKeyword("FINALIZE-METHOD"), makeSymbol("UIA-TEST-SUITE-FINALIZE"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycTestSuiteTool")) });

    private static final SubLSymbol $TEST_SUITE = makeKeyword("TEST-SUITE");

    static private final SubLString $$$New_Test_Suite = makeString("New Test Suite");

    static private final SubLString $str_alt177$New_Test_Suite__ = makeString("New Test Suite: ");

    static private final SubLSymbol $sym178$_SUITE_ID = makeSymbol("?SUITE-ID");

    static private final SubLList $list_alt179 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?SUITE-ID"), constant_handles.reader_make_constant_shell(makeString("SMEKnowledgeEntryTestSpecificationType")));

    private static final SubLSymbol $CONCEPT_CREATOR = makeKeyword("CONCEPT-CREATOR");

    private static final SubLSymbol $TEST_SUITE_NAME = makeKeyword("TEST-SUITE-NAME");



    private static final SubLSymbol $RUN_TEST_SUITE_TOOL_QUERY = makeKeyword("RUN-TEST-SUITE-TOOL-QUERY");

    static private final SubLList $list_alt184 = list(makeSymbol("&KEY"), makeSymbol("QUERY"));

    static private final SubLList $list_alt185 = list(makeKeyword("QUERY"));



    private static final SubLSymbol $QUERY_RESULT = makeKeyword("QUERY-RESULT");



    static private final SubLString $str_alt189$No_formula_for_this_query_ = makeString("No formula for this query.");

    private static final SubLSymbol $RUN_TEST_SUITE_TOOL_ALL_QUERIES = makeKeyword("RUN-TEST-SUITE-TOOL-ALL-QUERIES");

    private static final SubLSymbol $ALL_QUERY_RESULTS = makeKeyword("ALL-QUERY-RESULTS");

    private static final SubLSymbol $ALL_QUERY_TEST_SUITE = makeKeyword("ALL-QUERY-TEST-SUITE");

    private static final SubLSymbol $SET_TEST_SUITE_NAME = makeKeyword("SET-TEST-SUITE-NAME");

    static private final SubLList $list_alt194 = list(makeSymbol("&KEY"), makeSymbol("TEST-SUITE-NAME"));

    static private final SubLList $list_alt195 = list(makeKeyword("TEST-SUITE-NAME"));

    static private final SubLString $$$my_new_test_suite = makeString("my new test suite");

    public static final SubLObject $const197$SMEKnowledgeEntryTestSpecificatio = constant_handles.reader_make_constant_shell(makeString("SMEKnowledgeEntryTestSpecificationType"));

    private static final SubLSymbol $REDISPLAY_RESULT = makeKeyword("REDISPLAY-RESULT");

    public static final SubLObject $const199$SMEKnowledgeEntryTestSpecificatio = constant_handles.reader_make_constant_shell(makeString("SMEKnowledgeEntryTestSpecification"));

    private static final SubLSymbol $CHOOSE_TEST_SUITE = makeKeyword("CHOOSE-TEST-SUITE");

    private static final SubLSymbol $TEST_SUITE_NAMES = makeKeyword("TEST-SUITE-NAMES");

    private static final SubLSymbol $ALL_QUERY_RESULTS_STORE = makeKeyword("ALL-QUERY-RESULTS-STORE");

    private static final SubLSymbol $SHOW_ALL_QUERY_RESULTS = makeKeyword("SHOW-ALL-QUERY-RESULTS");



    private static final SubLSymbol $SHOW_TEST_RESULT = makeKeyword("SHOW-TEST-RESULT");

    private static final SubLSymbol $SHOW_TEST_SUITE = makeKeyword("SHOW-TEST-SUITE");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_uia_tools_review_and_testing_file();
    }

    @Override
    public void initializeVariables() {
        init_uia_tools_review_and_testing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_uia_tools_review_and_testing_file();
    }
}

