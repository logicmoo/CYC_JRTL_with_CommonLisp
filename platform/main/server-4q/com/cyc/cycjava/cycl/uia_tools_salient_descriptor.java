/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_block;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 *  module:      UIA-TOOLS-SALIENT-DESCRIPTOR
 *  source file: /cyc/top/cycl/uia-tools-salient-descriptor.lisp
 *  created:     2019/07/03 17:37:58
 */
public final class uia_tools_salient_descriptor extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_tools_salient_descriptor() {
    }

    public static final SubLFile me = new uia_tools_salient_descriptor();


    // // Definitions
    /**
     * Should we thrown to the Fact Entry Tool, which requires :Cyc-JavaFrameWork
     * to be defined, or not.
     */
    // deflexical
    private static final SubLSymbol $uiat_sd_fet_is_availableP$ = makeSymbol("*UIAT-SD-FET-IS-AVAILABLE?*");

    // defparameter
    private static final SubLSymbol $uiat_sd_default_message_timeout$ = makeSymbol("*UIAT-SD-DEFAULT-MESSAGE-TIMEOUT*");

    /**
     * Should we generate requests eagerly as soon as possible, as opposed
     * to waiting until requested?
     */
    // defparameter
    private static final SubLSymbol $uiat_sd_eagerP$ = makeSymbol("*UIAT-SD-EAGER?*");

    public static final SubLObject uia_act_new_salient_descriptor(SubLObject v_agenda, SubLObject mode, SubLObject phrase, SubLObject v_term) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist = NIL;
                if (NIL != v_term) {
                    plist = putf(plist, $TERM, v_term);
                }
                {
                    SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SALIENT_DESCRIPTOR, list(phrase), plist);
                    if (NIL != $uiat_sd_eagerP$.getDynamicValue(thread)) {
                        uiat_salient_descriptor_take_next_step(interaction);
                    }
                    return interaction;
                }
            }
        }
    }

    public static final SubLObject uia_invalidate_salient_descriptors_for_term(SubLObject v_agenda, SubLObject v_term) {
        {
            SubLObject cdolist_list_var = user_interaction_agenda.uia_interaction_sequence(v_agenda);
            SubLObject interaction = NIL;
            for (interaction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interaction = cdolist_list_var.first()) {
                if (((NIL != user_interaction_agenda.ui_alive_p(interaction)) && (user_interaction_agenda.ui_operator(interaction) == $SALIENT_DESCRIPTOR)) && user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED).equal(v_term)) {
                    user_interaction_agenda.uia_act_invalidate(v_agenda, interaction);
                }
            }
        }
        return v_agenda;
    }

    public static final SubLObject ui_initialize_salient_descriptor_prompter(SubLObject interaction, SubLObject prompter) {
        if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter)) {
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject use_rulesP = uima_interface_parameter_declaration.uia_use_salient_descriptor_induction_from_rulesP(v_agenda);
                rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $kw3$USE_RULES_, use_rulesP);
            }
            ui_salient_descriptor_set_prompt_status(interaction, $GETTING_NEXT_PROMPT);
            user_interaction_agenda.ui_state_update(interaction, $PROMPTER, prompter);
            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $INTERACTION, interaction);
            ui_salient_descriptor_launch_prompt_generator(interaction);
            uiat_salient_descriptor_get_next_prompt(interaction, $INITIAL);
        }
        return interaction;
    }

    public static final SubLObject ui_salient_descriptor_launch_prompt_generator(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject term_phrase = uiat_salient_descriptor_term_phrase(interaction);
            SubLObject prompter = user_interaction_agenda.ui_state_lookup(interaction, $PROMPTER, NIL);
            SubLObject thinker = uia_tools_basic.uia_act_new_thinking(v_agenda, $POSSIBLE, UI_SALIENT_DESCRIPTOR_GENERATE_PROMPTS, list(interaction), format(NIL, $str_alt10$Interview_Questions_for__A, term_phrase));
            user_interaction_agenda.ui_state_update(thinker, $SALIENT_DESCRIPTOR, interaction);
            user_interaction_agenda.ui_state_update(thinker, $PROMPTER, prompter);
            {
                SubLObject generator_thread = uia_tools_basic.uiat_thinking_start(thinker);
                rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_note_generator_thread(prompter, generator_thread);
                return generator_thread;
            }
        }
    }

    // defparameter
    private static final SubLSymbol $uia_sd_buffer_size$ = makeSymbol("*UIA-SD-BUFFER-SIZE*");

    /**
     * While INTERACTION is still pending, take advantage of its idle time to
     * generate further prompts on it.
     */
    public static final SubLObject ui_salient_descriptor_generate_prompts(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject prompter = user_interaction_agenda.ui_state_lookup(interaction, $PROMPTER, NIL);
                SubLObject buffer_size = $uia_sd_buffer_size$.getDynamicValue(thread);
                SubLObject exhaustedP = NIL;
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_1 = rkf_macros.$rkf_always_generate_examplesP$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(uia_setup_state.uia_user(v_agenda), thread);
                        rkf_macros.$rkf_always_generate_examplesP$.bind(eq($TRUE, uima_interface_parameter_declaration.uia_generate_examples_for_all_sd_promptsP(v_agenda)), thread);
                        {
                            SubLObject wait_for_emptyP = NIL;
                            if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter)) {
                                try {
                                    while ((NIL == exhaustedP) && (NIL != ui_salient_descriptor_alive_p(interaction))) {
                                        if (rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_prompt_count(prompter).numGE(buffer_size)) {
                                            process_block();
                                        } else
                                            if ((NIL != ui_salient_descriptor_empty_p(interaction)) || (NIL != (NIL != wait_for_emptyP ? ((SubLObject) (NIL)) : ui_salient_descriptor_idle_p(interaction)))) {
                                                {
                                                    SubLObject allow_tactic_rolloverP = NIL;
                                                    SubLObject result = rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_generate_prompt(prompter, allow_tactic_rolloverP);
                                                    wait_for_emptyP = NIL;
                                                    {
                                                        SubLObject pcase_var = result;
                                                        if (pcase_var.eql($DONE)) {
                                                            exhaustedP = T;
                                                        } else
                                                            if (pcase_var.eql($TACTIC_DONE)) {
                                                                wait_for_emptyP = T;
                                                                process_block();
                                                            }

                                                    }
                                                }
                                            } else {
                                                process_block();
                                            }

                                    } 
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_clear_generator_thread(prompter);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        rkf_macros.$rkf_always_generate_examplesP$.rebind(_prev_bind_1, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return interaction;
        }
    }

    public static final SubLObject ui_salient_descriptor_alive_p(SubLObject interaction) {
        return user_interaction_agenda.ui_alive_p(interaction);
    }

    public static final SubLObject ui_salient_descriptor_idle_p(SubLObject interaction) {
        return eq($TRUE, user_interaction_agenda.ui_state_lookup(interaction, $IDLE, $FALSE));
    }

    public static final SubLObject ui_salient_descriptor_empty_p(SubLObject interaction) {
        {
            SubLObject prompt = user_interaction_agenda.ui_state_lookup(interaction, $PROMPT, $NONE);
            return makeBoolean(NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt));
        }
    }

    public static final SubLObject ui_salient_descriptor_note_idle(SubLObject interaction) {
        user_interaction_agenda.ui_state_update(interaction, $IDLE, $TRUE);
        uiat_sd_unblock_generator_thread(interaction);
        return interaction;
    }

    public static final SubLObject uiat_sd_unblock_generator_thread(SubLObject interaction) {
        {
            SubLObject prompter = user_interaction_agenda.ui_state_lookup(interaction, $PROMPTER, $NONE);
            if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter)) {
                rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_unblock_generator_thread(prompter);
            }
        }
        return interaction;
    }

    public static final SubLObject ui_salient_descriptor_note_busy(SubLObject interaction) {
        return user_interaction_agenda.ui_state_update(interaction, $IDLE, $FALSE);
    }

    public static final SubLObject uiat_salient_descriptor_hint(SubLObject interaction) {
        {
            SubLObject phrase = uiat_salient_descriptor_term_phrase(interaction);
            return list($str_alt18$Explore_possibilities_for_adding_, $TERM, phrase);
        }
    }

    public static final SubLObject uiat_salient_descriptor_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject generate_local_requestP = uiat_salient_descriptor_take_next_step(interaction);
            SubLObject term_facets = user_interaction_agenda.ui_state_lookup(interaction, $TERM_FACETS, $UNDETERMINED);
            SubLObject facets_to_do = user_interaction_agenda.ui_state_lookup(interaction, $FACETS_TO_DO, $UNDETERMINED);
            SubLObject prompt_status = user_interaction_agenda.ui_state_lookup(interaction, $PROMPT_STATUS, $UNTRIED);
            if (NIL == generate_local_requestP) {
                return user_interaction_agenda.uia_generate_next_request(v_agenda);
            } else
                if ((NIL != term_facets) && ($UNDETERMINED == facets_to_do)) {
                    {
                        SubLObject plist = NIL;
                        return user_interaction_agenda.make_ui_request(interaction, $DISPLAY_FACETS, plist);
                    }
                } else
                    if (prompt_status == $YUCK) {
                        return user_interaction_agenda.make_ui_request(interaction, $YUCK, NIL);
                    } else
                        if (prompt_status == $ASK_USER) {
                            return user_interaction_agenda.make_ui_request(interaction, $LET_USER_CHOOSE_PROMPT, NIL);
                        } else
                            if (prompt_status == $GETTING_NEXT_PROMPT) {
                                sleep(ONE_INTEGER);
                            } else
                                if (prompt_status == $READY) {
                                    return uiat_salient_descriptor_generate_ready_request(interaction);
                                } else {
                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                }





        }
        return NIL;
    }

    /**
     * Do whatever the next thing is to be done for INTERACTION.
     */
    public static final SubLObject uiat_salient_descriptor_take_next_step(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject args = user_interaction_agenda.ui_args(interaction);
                SubLObject generate_local_requestP = NIL;
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject phrase = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt29);
                phrase = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, $UNDETERMINED);
                        SubLObject fet_topics = user_interaction_agenda.ui_state_lookup(interaction, $FACT_ENTRY_TOOL_TOPICS, $UNDETERMINED);
                        SubLObject term_facets = user_interaction_agenda.ui_state_lookup(interaction, $TERM_FACETS, $UNDETERMINED);
                        SubLObject facets_to_do = user_interaction_agenda.ui_state_lookup(interaction, $FACETS_TO_DO, $UNDETERMINED);
                        SubLObject dirty = user_interaction_agenda.ui_state_lookup(interaction, $DIRTY, $FALSE);
                        SubLObject prompt_status = user_interaction_agenda.ui_state_lookup(interaction, $PROMPT_STATUS, $UNTRIED);
                        if ($UNDETERMINED == v_term) {
                            {
                                SubLObject concept_disambiguator_action = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, phrase, $TERM, $sym33$UIAT_SALIENT_DESCRIPTOR_IS_TERM_PERMISSIBLE_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, concept_disambiguator_action);
                            }
                        } else
                            if ((NIL != $uiat_sd_fet_is_availableP$.getGlobalValue()) && ($UNDETERMINED == fet_topics)) {
                                {
                                    SubLObject suggested_fet_topics = uia_trampolines.uia_salient_template_topics_for_term(v_agenda, v_term, UNPROVIDED);
                                    if (NIL == suggested_fet_topics) {
                                        user_interaction_agenda.ui_state_update(interaction, $FACT_ENTRY_TOOL_TOPICS, $UNAVAILABLE);
                                    } else {
                                        user_interaction_agenda.ui_state_update(interaction, $FACT_ENTRY_TOOL_TOPICS, suggested_fet_topics);
                                        {
                                            SubLObject child = uia_act_new_fact_entry_tool(v_agenda, $REQUIRED, v_term, suggested_fet_topics, UNPROVIDED);
                                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                        }
                                    }
                                    if (NIL == suggested_fet_topics) {
                                        generate_local_requestP = uiat_salient_descriptor_take_next_step(interaction);
                                    }
                                }
                            } else
                                if ($UNDETERMINED == term_facets) {
                                    {
                                        SubLObject message = format(NIL, $str_alt35$Getting_specialized_dimensions_fo, phrase);
                                        uia_tools_basic.uia_act_new_thinking_child(interaction, UIAT_SALIENT_DESCRIPTOR_GET_TERM_FACETS, list(interaction, v_term), message, $TERM_FACETS);
                                    }
                                } else
                                    if ((NIL != term_facets) && ($UNDETERMINED == facets_to_do)) {
                                        generate_local_requestP = T;
                                    } else
                                        if (NIL != list_utilities.non_empty_list_p(facets_to_do)) {
                                            {
                                                SubLObject datum_2 = facets_to_do;
                                                SubLObject current_3 = datum_2;
                                                SubLObject this_facet = NIL;
                                                SubLObject remaining_facets = NIL;
                                                destructuring_bind_must_consp(current_3, datum_2, $list_alt37);
                                                this_facet = current_3.first();
                                                current_3 = current_3.rest();
                                                remaining_facets = current_3;
                                                user_interaction_agenda.ui_state_update(interaction, $FACETS_TO_DO, remaining_facets);
                                                {
                                                    SubLObject mode = user_interaction_agenda.ui_mode(interaction);
                                                    SubLObject phrase_4 = uia_trampolines.uia_term_phrase(v_agenda, this_facet, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject sub_sd = uia_act_new_salient_descriptor(v_agenda, mode, phrase_4, this_facet);
                                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, sub_sd);
                                                }
                                            }
                                        } else
                                            if ((NIL == term_facets) && ($UNINITIALIZED == user_interaction_agenda.ui_state_lookup(interaction, $PROMPTER, $UNINITIALIZED))) {
                                                {
                                                    SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                                                    SubLObject prompter = rkf_salient_descriptor_datastructures.new_rkf_salient_descriptor_prompter(v_term, mt);
                                                    user_interaction_agenda.uia_add_term_to_crumb_trail(v_agenda, v_term);
                                                    user_interaction_agenda.ui_state_update(interaction, $PROMPTER, prompter);
                                                    ui_initialize_salient_descriptor_prompter(interaction, prompter);
                                                }
                                            } else
                                                if (prompt_status == $YUCK) {
                                                    generate_local_requestP = T;
                                                } else
                                                    if (prompt_status == $ASK_USER) {
                                                        uiat_salient_descriptor_ensure_unused_prompts(interaction);
                                                        generate_local_requestP = T;
                                                    } else
                                                        if (prompt_status == $GETTING_NEXT_PROMPT) {
                                                        } else
                                                            if (prompt_status == $READY) {
                                                                generate_local_requestP = T;
                                                            } else {
                                                                {
                                                                    SubLObject message = NIL;
                                                                    SubLObject pcase_var = dirty;
                                                                    if (pcase_var.eql($TRUE)) {
                                                                        message = cconcatenate($str_alt39$You_are_now_done_refining_, new SubLObject[]{ uia_trampolines.uia_term_phrase_np(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str_alt40$_ });
                                                                    } else
                                                                        if (pcase_var.eql($SORTA)) {
                                                                            message = cconcatenate($str_alt42$You_are_now_sort_of_done_refining, new SubLObject[]{ uia_trampolines.uia_term_phrase_np(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str_alt40$_ });
                                                                        } else
                                                                            if (pcase_var.eql($FALSE)) {
                                                                                message = format(NIL, $str_alt43$Couldn_t_think_of_any_questions_t, uia_trampolines.uia_term_phrase_np(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                            }


                                                                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                                                                    if (NIL != message) {
                                                                        if (dirty == $FALSE) {
                                                                            user_interaction_agenda.uia_act_new_timed_acknowledge_message(v_agenda, message, $uiat_sd_default_message_timeout$.getDynamicValue(thread));
                                                                        } else {
                                                                            user_interaction_agenda.uia_act_new_comment(v_agenda, message);
                                                                        }
                                                                    }
                                                                }
                                                            }









                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt29);
                }
                return generate_local_requestP;
            }
        }
    }

    /**
     * Generate a request if the state in which :PROMPT-STATUS is :READY.
     */
    public static final SubLObject uiat_salient_descriptor_generate_ready_request(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dirty = user_interaction_agenda.ui_state_lookup(interaction, $DIRTY, $FALSE);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject prompt = user_interaction_agenda.ui_state_lookup(interaction, $PROMPT, UNPROVIDED);
                if (NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt)) {
                    user_interaction_agenda.ui_state_clear(interaction, $kw44$ASK_AGAIN_);
                    uiat_salient_descriptor_get_next_prompt(interaction, $NON_PROMPT);
                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                }
                {
                    SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
                    SubLObject subprompt = subprompts.first();
                    SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, UNPROVIDED, UNPROVIDED);
                    thread.resetMultipleValues();
                    {
                        SubLObject problem_type = uiat_salient_descriptor_bad_promptP(interaction, prompt);
                        SubLObject more_info = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject pcase_var = problem_type;
                            if ((pcase_var.eql($NOT_WFF) || pcase_var.eql($FALSE)) || pcase_var.eql($INVALIDATED)) {
                                {
                                    SubLObject bound_assert_sentence = uia_trampolines.uia_existentially_bind(v_agenda, assert_sentence);
                                    SubLObject why_not_wff = more_info;
                                    SubLObject pcase_var_5 = problem_type;
                                    if (pcase_var_5.eql($NOT_WFF)) {
                                        uia_mumbler.uia_mumble(v_agenda, cconcatenate($str_alt48$This_is_invalid__, new SubLObject[]{ uia_trampolines.uia_sentence_phrase(v_agenda, bound_assert_sentence, UNPROVIDED, UNPROVIDED), $str_alt49$_, uia_trampolines.uia_why_not_wff_english(v_agenda, assert_sentence, why_not_wff, UNPROVIDED) }));
                                    } else
                                        if (pcase_var_5.eql($FALSE)) {
                                            uia_mumbler.uia_mumble(v_agenda, cconcatenate($str_alt50$I_know_this_to_be_false__, uia_trampolines.uia_sentence_phrase(v_agenda, bound_assert_sentence, UNPROVIDED, UNPROVIDED)));
                                        } else
                                            if (pcase_var_5.eql($INVALIDATED)) {
                                                uia_mumbler.uia_mumble(v_agenda, cconcatenate($str_alt51$I_am_no_longer_justified_in_askin, uia_trampolines.uia_sentence_phrase(v_agenda, bound_assert_sentence, UNPROVIDED, UNPROVIDED)));
                                            }


                                }
                                user_interaction_agenda.ui_state_clear(interaction, $kw44$ASK_AGAIN_);
                                uiat_salient_descriptor_get_next_prompt(interaction, $INVALID);
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            } else
                                if (pcase_var.eql($KNOWN)) {
                                    {
                                        SubLObject bound_assert_sentence = uia_trampolines.uia_existentially_bind(v_agenda, assert_sentence);
                                        SubLObject follow_upP = uiat_salient_descriptor_maybe_set_followup(interaction, bound_assert_sentence);
                                        uia_mumbler.uia_mumble(v_agenda, cconcatenate($str_alt54$I_already_know_, uia_trampolines.uia_sentence_phrase(v_agenda, bound_assert_sentence, UNPROVIDED, UNPROVIDED)));
                                        if ($NOT_ADDED == follow_upP) {
                                            uiat_salient_descriptor_get_next_prompt(interaction, $KNOWN);
                                        }
                                    }
                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                } else {
                                    uiat_salient_descriptor_ensure_unused_prompts(interaction);
                                    if (dirty == $FALSE) {
                                        user_interaction_agenda.ui_state_update(interaction, $DIRTY, $SORTA);
                                    }
                                    {
                                        SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                                        SubLObject single_entryP = (NIL != uia_trampolines.uia_salient_descriptor_single_entry_varP(v_agenda, var, assert_sentence, UNPROVIDED)) ? ((SubLObject) ($TRUE)) : $FALSE;
                                        SubLObject plist = list($kw56$SINGLE_ENTRY_, single_entryP);
                                        SubLObject request = user_interaction_agenda.make_ui_request(interaction, $DISPLAY_PROMPT, plist);
                                        return request;
                                    }
                                }

                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown KEYWORDP or NIL; Is PROMPT bad, and if so, in what sense?
     * @unknown further details.
     */
    public static final SubLObject uiat_salient_descriptor_bad_promptP(SubLObject interaction, SubLObject prompt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject state = user_interaction_agenda.uia_memoization_state(user_interaction_agenda.ui_agenda(interaction));
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt58$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                ans = uiat_salient_descriptor_bad_promptP_memoized(interaction, prompt);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject uiat_salient_descriptor_bad_promptP_memoized_internal(SubLObject interaction, SubLObject prompt) {
        {
            SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
            SubLObject subprompt = subprompts.first();
            SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, UNPROVIDED, UNPROVIDED);
            SubLObject justification = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_justification(prompt);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject why_not_wff = uia_trampolines.uia_why_not_wff(v_agenda, assert_sentence, UNPROVIDED);
            if (NIL != why_not_wff) {
                return values($NOT_WFF, why_not_wff);
            } else
                if (NIL != uia_trampolines.uia_invalid_supportsP(justification)) {
                    return values($INVALIDATED, NIL);
                } else
                    if (($TRUE != user_interaction_agenda.ui_state_lookup(interaction, $kw44$ASK_AGAIN_, UNPROVIDED)) && (NIL != uiat_salient_descriptor_knownP(interaction, rkf_salient_descriptor.rkf_salient_descriptor_subprompt_known_check_sentence(subprompt), user_interaction_agenda.uia_domain_interaction_mt(v_agenda), T))) {
                        return values($KNOWN, NIL);
                    } else
                        if (NIL != uiat_salient_descriptor_knownP(interaction, cycl_utilities.negate(rkf_salient_descriptor.rkf_salient_descriptor_subprompt_known_check_sentence(subprompt)), user_interaction_agenda.uia_domain_interaction_mt(v_agenda), NIL)) {
                            return values($FALSE, NIL);
                        } else {
                            return values(NIL, NIL);
                        }



        }
    }

    public static final SubLObject uiat_salient_descriptor_bad_promptP_memoized(SubLObject interaction, SubLObject prompt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return uiat_salient_descriptor_bad_promptP_memoized_internal(interaction, prompt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym59$UIAT_SALIENT_DESCRIPTOR_BAD_PROMPT__MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym59$UIAT_SALIENT_DESCRIPTOR_BAD_PROMPT__MEMOIZED, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym59$UIAT_SALIENT_DESCRIPTOR_BAD_PROMPT__MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(interaction, prompt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw60$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (interaction == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (prompt == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uiat_salient_descriptor_bad_promptP_memoized_internal(interaction, prompt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(interaction, prompt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLObject uiat_salient_descriptor_knownP(SubLObject interaction, SubLObject sentence, SubLObject mt, SubLObject remove_existentialsP) {
        if (remove_existentialsP == UNPROVIDED) {
            remove_existentialsP = NIL;
        }
        {
            SubLObject prompter = user_interaction_agenda.ui_state_lookup(interaction, $PROMPTER, NIL);
            SubLObject ans = NIL;
            if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter)) {
                ans = rkf_salient_descriptor_prompter.rkf_sd_prompter_knownP(prompter, sentence, mt, remove_existentialsP);
            } else {
                ans = rkf_salient_descriptor.rkf_sd_known(sentence, mt, remove_existentialsP);
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return LISTP of CycL terms that each denote a facet of TERM that we think should
    be Saliently Described before TERM is.
     */
    public static final SubLObject uiat_salient_descriptor_get_term_facets(SubLObject interaction, SubLObject v_term) {
        {
            SubLObject term_facets = NIL;
            if (NIL != uia_coa_utilities.uia_coaP(user_interaction_agenda.ui_agenda(interaction), v_term)) {
                {
                    SubLObject cdolist_list_var = uia_coa_utilities.uia_get_coa_specification_dimensions(user_interaction_agenda.ui_agenda(interaction));
                    SubLObject facet_fn = NIL;
                    for (facet_fn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , facet_fn = cdolist_list_var.first()) {
                        term_facets = cons(uia_coa_utilities.get_coa_assessment_nart(facet_fn, v_term), term_facets);
                    }
                }
                term_facets = nreverse(term_facets);
            }
            return term_facets;
        }
    }

    public static final SubLObject uiat_salient_descriptor_ensure_unused_prompts(SubLObject interaction) {
        {
            SubLObject cached_prompts = user_interaction_agenda.ui_state_lookup(interaction, $UNUSED_PROMPTS, NIL);
            SubLObject prompter = user_interaction_agenda.ui_state_lookup(interaction, $PROMPTER, UNPROVIDED);
            uiat_salient_descriptor_set_unused_prompts(interaction);
        }
        return interaction;
    }

    public static final SubLObject uiat_salient_descriptor_set_unused_prompts(SubLObject interaction) {
        {
            SubLObject prompter = user_interaction_agenda.ui_state_lookup(interaction, $PROMPTER, UNPROVIDED);
            rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_prune_unused_prompts(prompter);
            {
                SubLObject set_contents_var = set.do_set_internal(rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_unused_prompts(prompter));
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject prompt = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                            if (NIL != uiat_salient_descriptor_bad_promptP(interaction, prompt)) {
                                rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_remove_prompt(prompter, prompt);
                            }
                        }
                    }
                }
            }
            {
                SubLObject unused_prompt_list = rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_sorted_unused_prompts(prompter);
                user_interaction_agenda.ui_state_update(interaction, $UNUSED_PROMPTS, unused_prompt_list);
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_salient_descriptor_child_completed(SubLObject parent, SubLObject child) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
                SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
                if (pcase_var.eql($THINKING)) {
                    {
                        SubLObject result = user_interaction_agenda.ui_result(child);
                        SubLObject my_result_will_be = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
                        SubLObject pcase_var_7 = my_result_will_be;
                        if (pcase_var_7.eql($FOLLOW_UP)) {
                            if ($NOT_ADDED == result) {
                                {
                                    SubLObject assert_sentence = user_interaction_agenda.ui_state_lookup(parent, $CONFIRMED_SENTENCE, UNPROVIDED);
                                    uiat_salient_descriptor_add_assert_dependent(parent, assert_sentence, UNPROVIDED);
                                }
                            }
                        } else
                            if (pcase_var_7.eql($TERM_FACETS)) {
                                user_interaction_agenda.ui_state_update(parent, $TERM_FACETS, result);
                                if (NIL != $uiat_sd_eagerP$.getDynamicValue(thread)) {
                                    uiat_salient_descriptor_take_next_step(parent);
                                }
                            }

                        return result;
                    }
                } else
                    if (pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                        {
                            SubLObject v_term = user_interaction_agenda.ui_result(child);
                            SubLObject my_result_will_be = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
                            SubLObject pcase_var_8 = my_result_will_be;
                            if (pcase_var_8.eql($TERM)) {
                                v_term = function_terms.naut_to_nart(v_term);
                                user_interaction_agenda.ui_state_update(parent, $TERM, v_term);
                                if (NIL != rkf_salient_descriptor_prompter.rkf_salient_descriptor_candidate_p(v_term)) {
                                    {
                                        SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                                        SubLObject prompter = rkf_salient_descriptor_datastructures.new_rkf_salient_descriptor_prompter(v_term, mt);
                                        user_interaction_agenda.uia_add_term_to_crumb_trail(v_agenda, v_term);
                                        ui_initialize_salient_descriptor_prompter(parent, prompter);
                                    }
                                }
                            }
                        }
                    } else
                        if (pcase_var.eql($CONCEPT_IN_SENTENCE_DISAMBIGUATOR)) {
                            {
                                SubLObject assert_sentence = user_interaction_agenda.ui_result(child);
                                if (NIL != el_utilities.el_formula_p(assert_sentence)) {
                                    uiat_salient_descriptor_add_assert_dependent(parent, assert_sentence, UNPROVIDED);
                                } else {
                                    user_interaction_agenda.uia_act_reject(v_agenda, child);
                                }
                            }
                        } else
                            if (pcase_var.eql($YES_NO_QUESTION)) {
                                {
                                    SubLObject v_answer = user_interaction_agenda.ui_result(child);
                                    SubLObject subprompts = uiat_salient_descriptor_get_subprompts(parent);
                                    SubLObject subprompt = subprompts.first();
                                    SubLObject cycl_sentence = second(subprompt);
                                    SubLObject nl_sentence = (NIL != cycl_sentence) ? ((SubLObject) (uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED))) : NIL;
                                    SubLObject pcase_var_9 = v_answer;
                                    if (pcase_var_9.eql($YES)) {
                                        uiat_salient_descriptor_add_assert_dependent(parent, cycl_sentence, nl_sentence);
                                    } else
                                        if (pcase_var_9.eql($NO)) {
                                            uiat_salient_descriptor_get_next_prompt(parent, $DENIED);
                                        } else
                                            if (pcase_var_9.eql($UNKNOWN)) {
                                                uiat_salient_descriptor_get_next_prompt(parent, $DONT_KNOW);
                                            }


                                }
                            } else
                                if (pcase_var.eql($ASSERTION_CREATOR)) {
                                    user_interaction_agenda.ui_state_update(parent, $DIRTY, $TRUE);
                                    uiat_sd_report_successful_assertions(child);
                                    uiat_salient_descriptor_get_next_prompt(parent, $DONE);
                                } else
                                    if (pcase_var.eql($RULE_CONSTRUCTOR)) {
                                        {
                                            SubLObject new_rule = user_interaction_agenda.ui_result(child);
                                            SubLObject subprompts = uiat_salient_descriptor_get_subprompts(parent);
                                            SubLObject subprompt = subprompts.first();
                                            SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, UNPROVIDED, UNPROVIDED);
                                            SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                                            SubLObject knownP = uia_trampolines.uia_knownP(v_agenda, assert_sentence, mt);
                                            if (NIL != knownP) {
                                                uiat_salient_descriptor_get_next_prompt(parent, $KNOWN);
                                            } else {
                                                {
                                                    SubLObject message = format(NIL, $str_alt76$I_am_still_unable_to_answer_the_q, uia_trampolines.uia_query_phrase(v_agenda, assert_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                    user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                                                }
                                            }
                                        }
                                    } else
                                        if (pcase_var.eql($FACT_ENTRY_TOOL)) {
                                            uia_listeners.uia_assume_kb_changes_occurred_outside_uia(v_agenda);
                                        }






            }
            return parent;
        }
    }

    public static final SubLObject uiat_sd_report_successful_assertions(SubLObject child) {
        {
            SubLObject final_cycl = user_interaction_agenda.ui_state_lookup(child, $PRECISE_CYCL_SENTENCE, NIL);
            SubLObject forks = user_interaction_agenda.ui_state_lookup(child, $FORKED_INTERACTIONS, NIL);
            if (NIL != el_utilities.el_formula_p(final_cycl)) {
                uiat_sd_report_successful_assertion(child, final_cycl);
            } else
                if (NIL != forks) {
                    {
                        SubLObject cdolist_list_var = forks;
                        SubLObject grandchild = NIL;
                        for (grandchild = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , grandchild = cdolist_list_var.first()) {
                            if ($COMPLETED == user_interaction_agenda.ui_status(grandchild)) {
                                uiat_sd_report_successful_assertions(grandchild);
                            }
                        }
                    }
                }

        }
        return child;
    }

    public static final SubLObject uiat_sd_report_successful_assertion(SubLObject child, SubLObject assert_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(child);
                SubLObject message = format(NIL, $str_alt81$I_now_know_the_following___A, uia_trampolines.uia_sentence_phrase(v_agenda, assert_sentence, UNPROVIDED, UNPROVIDED));
                return user_interaction_agenda.uia_act_new_timed_acknowledge_message(v_agenda, message, $uiat_sd_default_message_timeout$.getDynamicValue(thread));
            }
        }
    }

    /**
     * Add a dependent to PARENT arranging for an assertion with TERM as the specified
     * value for the current prompt.
     */
    public static final SubLObject uiat_salient_descriptor_add_specified_term_dependent(SubLObject parent, SubLObject v_term) {
        {
            SubLObject subprompts = uiat_salient_descriptor_get_subprompts(parent);
            SubLObject subprompt = subprompts.first();
            SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
            SubLObject constraint_sentence_template = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_constraint_sentence(subprompt);
            SubLObject constraint_sentence = cycl_utilities.expression_subst(v_term, var, constraint_sentence_template, UNPROVIDED, UNPROVIDED);
            SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, v_term, var);
            return uiat_salient_descriptor_handle_specify_guts_result(parent, constraint_sentence, assert_sentence);
        }
    }

    public static final SubLObject uiat_salient_descriptor_specify_guts_2_multiple(SubLObject interaction) {
        {
            SubLObject num_terms = user_interaction_agenda.ui_state_lookup(interaction, $NUM_TERMS_TO_SPECIFY, UNPROVIDED);
            if (num_terms.isInteger()) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject subprompts = uiat_salient_descriptor_get_subprompts(interaction);
                    SubLObject subprompt = list_utilities.last_one(subprompts);
                    SubLObject assert_sentence_template = fourth(subprompt);
                    SubLObject constraint_sentence_template = third(subprompt);
                    SubLObject n = NIL;
                    for (n = ZERO_INTEGER; n.numL(num_terms); n = add(n, ONE_INTEGER)) {
                        {
                            SubLObject nstr = string_utilities.str(n);
                            SubLObject indicator = make_keyword(cconcatenate($str_alt83$SPECIFIED_TERM, nstr));
                            SubLObject term_n = user_interaction_agenda.ui_state_lookup(interaction, indicator, $UNDETERMINED);
                            if ($UNDETERMINED == term_n) {
                                return interaction;
                            }
                        }
                    }
                    {
                        SubLObject constraint_sentence = constraint_sentence_template;
                        SubLObject list_var = NIL;
                        SubLObject subprompt_10 = NIL;
                        SubLObject index = NIL;
                        for (list_var = subprompts, subprompt_10 = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , subprompt_10 = list_var.first() , index = add(ONE_INTEGER, index)) {
                            {
                                SubLObject nstr = string_utilities.str(index);
                                SubLObject indicator = make_keyword(cconcatenate($str_alt83$SPECIFIED_TERM, nstr));
                                SubLObject term_n = user_interaction_agenda.ui_state_lookup(interaction, indicator, UNPROVIDED);
                                SubLObject var = second(subprompt_10);
                                constraint_sentence = cycl_utilities.expression_subst(term_n, var, constraint_sentence, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        if (NIL == uiat_salient_descriptor_constraint_okP(interaction, constraint_sentence)) {
                            {
                                SubLObject message = format(NIL, $str_alt84$Sorry__for_some_reason_I_m_having, uia_trampolines.uia_sentence_phrase(v_agenda, constraint_sentence, UNPROVIDED, UNPROVIDED));
                                SubLObject message_act = user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, message_act);
                            }
                        }
                    }
                    {
                        SubLObject assert_sentence = assert_sentence_template;
                        SubLObject list_var = NIL;
                        SubLObject subprompt_11 = NIL;
                        SubLObject index = NIL;
                        for (list_var = subprompts, subprompt_11 = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , subprompt_11 = list_var.first() , index = add(ONE_INTEGER, index)) {
                            {
                                SubLObject nstr = string_utilities.str(index);
                                SubLObject indicator = make_keyword(cconcatenate($str_alt83$SPECIFIED_TERM, nstr));
                                SubLObject term_n = user_interaction_agenda.ui_state_lookup(interaction, indicator, UNPROVIDED);
                                SubLObject var = second(subprompt_11);
                                assert_sentence = cycl_utilities.expression_subst(term_n, var, assert_sentence, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        uiat_salient_descriptor_add_assert_dependent(interaction, assert_sentence, UNPROVIDED);
                    }
                }
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_salient_descriptor_handle_specify_guts_result(SubLObject interaction, SubLObject constraint_sentence, SubLObject assert_sentence) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            if (NIL != uiat_salient_descriptor_constraint_okP(interaction, constraint_sentence)) {
                uiat_salient_descriptor_add_assert_dependent(interaction, assert_sentence, UNPROVIDED);
            } else {
                {
                    SubLObject message = format(NIL, $str_alt84$Sorry__for_some_reason_I_m_having, uia_trampolines.uia_sentence_phrase(v_agenda, constraint_sentence, UNPROVIDED, UNPROVIDED));
                    SubLObject message_act = user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, message_act);
                }
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_salient_descriptor_get_subprompts(SubLObject interaction) {
        {
            SubLObject prompt = user_interaction_agenda.ui_state_lookup(interaction, $PROMPT, UNPROVIDED);
            return NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt) ? ((SubLObject) (rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt))) : NIL;
        }
    }

    public static final SubLObject uiat_salient_descriptor_get_justification(SubLObject interaction) {
        {
            SubLObject prompt = user_interaction_agenda.ui_state_lookup(interaction, $PROMPT, UNPROVIDED);
            SubLObject supports = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_justification(prompt);
            return supports;
        }
    }

    public static final SubLObject uiat_salient_descriptor_child_invalidated(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($ASSERTION_CREATOR) || pcase_var.eql($CONCEPT_IN_SENTENCE_DISAMBIGUATOR)) {
                user_interaction_agenda.ui_recompute_status(parent);
            } else
                if (pcase_var.eql($RULE_CONSTRUCTOR)) {
                    user_interaction_agenda.ui_recompute_status(parent);
                } else
                    if (pcase_var.eql($FACT_ENTRY_TOOL)) {
                        uia_listeners.uia_assume_kb_changes_occurred_outside_uia(v_agenda);
                    } else {
                        user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                    }


        }
        return parent;
    }

    public static final SubLObject uiat_salient_descriptor_child_rejected(SubLObject parent, SubLObject child) {
        return uiat_salient_descriptor_child_invalidated(parent, child);
    }

    public static final SubLObject uiat_sd_finalize(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            cb_uia_collaborators.uiaext_unhighlight_all_terms(v_agenda);
        }
        uiat_sd_unblock_generator_thread(interaction);
        {
            SubLObject prompter = user_interaction_agenda.ui_state_lookup(interaction, $PROMPTER, UNPROVIDED);
            if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter)) {
                rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_finalize(prompter);
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_salient_descriptor_potentially_highlight_all_entities(SubLObject v_agenda, SubLObject v_term, SubLObject assert_sentence) {
        if (NIL != cb_uia_collaborators.is_nusketch_server_availableP()) {
            cb_uia_collaborators.uiaext_unhighlight_all_terms(v_agenda);
            if ((NIL != cb_uia_collaborators.is_nusketch_term_highlightableP(v_agenda, v_term)) || (NIL != cb_uia_collaborators.is_nusketch_sentence_highlightableP(v_agenda, assert_sentence))) {
                cb_uia_collaborators.uiaext_nusketch_potentially_highlight_term(v_agenda, v_term);
                cb_uia_collaborators.uiaext_nusketch_potentially_highlight_sentence(v_agenda, assert_sentence);
                return T;
            }
        }
        return NIL;
    }

    /**
     * Who picks the next prompt? Possible values: :USER, :CYC
     */
    // defparameter
    private static final SubLSymbol $uiat_salient_descriptor_prompt_picker$ = makeSymbol("*UIAT-SALIENT-DESCRIPTOR-PROMPT-PICKER*");

    public static final SubLObject uiat_salient_descriptor_do_get_next_prompt(SubLObject interaction) {
        ui_salient_descriptor_set_prompt_status(interaction, $GETTING_NEXT_PROMPT);
        ui_salient_descriptor_set_prompt(interaction, $NONE);
        user_interaction_agenda.ui_state_clear(interaction, $CONFIRMED_SENTENCE);
        {
            SubLObject prompter = user_interaction_agenda.ui_state_lookup(interaction, $PROMPTER, UNPROVIDED);
            SubLObject prompt = $DONE;
            if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter)) {
                prompt = rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_next(prompter, UNPROVIDED);
            }
            ui_salient_descriptor_set_prompt(interaction, prompt);
            return prompt;
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Should we let the user pick the next prompt to work on?
     */
    public static final SubLObject uiat_salient_descriptor_let_user_choose_promptP(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if ($USER == $uiat_salient_descriptor_prompt_picker$.getDynamicValue(thread)) {
                    ans = uiat_salient_descriptor_has_unused_prompts_p(interaction);
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Are there any available unused prompts to pick from?
     */
    public static final SubLObject uiat_salient_descriptor_has_unused_prompts_p(SubLObject interaction) {
        uiat_salient_descriptor_ensure_unused_prompts(interaction);
        {
            SubLObject unused_prompts = user_interaction_agenda.ui_state_lookup(interaction, $UNUSED_PROMPTS, NIL);
            return list_utilities.lengthG(unused_prompts, ONE_INTEGER, UNPROVIDED);
        }
    }

    public static final SubLObject ui_salient_descriptor_set_prompt(SubLObject interaction, SubLObject prompt) {
        user_interaction_agenda.ui_state_update(interaction, $PROMPT, prompt);
        if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt)) {
            ui_salient_descriptor_set_prompt_status(interaction, $READY);
        } else
            if ($DONE == prompt) {
                ui_salient_descriptor_set_prompt_status(interaction, $DONE);
            }

        return interaction;
    }

    public static final SubLObject ui_salient_descriptor_set_prompt_status(SubLObject interaction, SubLObject status) {
        return user_interaction_agenda.ui_state_update(interaction, $PROMPT_STATUS, status);
    }

    public static final SubLObject uiat_salient_descriptor_get_next_prompt(SubLObject interaction, SubLObject reason) {
        if (reason == UNPROVIDED) {
            reason = $UNSPECIFIED;
        }
        if (NIL != uiat_salient_descriptor_let_user_choose_promptP(interaction)) {
            return uiat_salient_descriptor_get_next_prompt_from_user(interaction);
        } else
            if ($TRUE == user_interaction_agenda.ui_state_lookup(interaction, $kw44$ASK_AGAIN_, $FALSE)) {
            } else {
                return uiat_salient_descriptor_get_next_prompt_from_prompter(interaction);
            }

        return NIL;
    }

    public static final SubLObject uiat_salient_descriptor_get_next_prompt_from_user(SubLObject interaction) {
        ui_salient_descriptor_set_prompt_status(interaction, $ASK_USER);
        user_interaction_agenda.ui_state_clear(interaction, $BAD_EXAMPLE_DICTIONARY);
        return user_interaction_agenda.uia_generate_next_request(user_interaction_agenda.ui_agenda(interaction));
    }

    /**
     * BOOLEAN; Do we show 'tactic' info to the user?
     */
    // defparameter
    private static final SubLSymbol $show_salient_descriptor_tacticsP$ = makeSymbol("*SHOW-SALIENT-DESCRIPTOR-TACTICS?*");

    public static final SubLObject show_salient_descriptor_tacticsP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $show_salient_descriptor_tacticsP$.getDynamicValue(thread);
        }
    }

    public static final SubLObject uiat_salient_descriptor_get_next_prompt_from_prompter(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            user_interaction_agenda.ui_state_clear(interaction, $BAD_EXAMPLE_DICTIONARY);
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject tactic_string = uiat_salient_descriptor_current_tactic_string(interaction);
                SubLObject phrase = uiat_salient_descriptor_term_phrase(interaction);
                SubLObject message = NIL;
                uia_mumbler.uia_mumble(v_agenda, format(NIL, $str_alt89$Getting_prompt_for__A__Initial_ta, phrase, tactic_string));
                {
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        format(stream, $str_alt90$Getting_interview_questions_for__, phrase);
                        if (NIL != $show_salient_descriptor_tacticsP$.getDynamicValue(thread)) {
                            format(stream, $str_alt91$__Initial_tactic___A____, tactic_string);
                        }
                        message = get_output_stream_string(stream);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                close(stream, UNPROVIDED);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return uia_tools_basic.uia_act_new_thinking_child(interaction, UIAT_SALIENT_DESCRIPTOR_DO_GET_NEXT_PROMPT, list(interaction), message, UNPROVIDED);
            }
        }
    }

    public static final SubLObject uiat_salient_descriptor_current_tactic_string(SubLObject interaction) {
        {
            SubLObject prompter = user_interaction_agenda.ui_state_lookup(interaction, $PROMPTER, UNPROVIDED);
            if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter)) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject language_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
                    return rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_current_tactic_string(prompter, language_mt);
                }
            }
            return cb_salient_descriptor_unknown_tactic_string(interaction);
        }
    }

    public static final SubLObject cb_salient_descriptor_unknown_tactic_string(SubLObject interaction) {
        return $$$Unknown;
    }

    public static final SubLObject cb_salient_descriptor_tactic_string(SubLObject interaction) {
        {
            SubLObject prompt = user_interaction_agenda.ui_state_lookup(interaction, $PROMPT, UNPROVIDED);
            if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt)) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject language_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
                    return rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompt_tactic_string(prompt, language_mt);
                }
            }
            return cb_salient_descriptor_unknown_tactic_string(interaction);
        }
    }

    public static final SubLObject uiat_salient_descriptor_term_phrase(SubLObject interaction) {
        {
            SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
            SubLObject arg_phrase = user_interaction_agenda.ui_args(interaction).first();
            SubLObject phrase = (NIL != assertions_high.rule_assertionP(v_term)) ? ((SubLObject) ($$$the_rule)) : NIL != string_utilities.empty_string_p(arg_phrase) ? ((SubLObject) (uia_trampolines.uia_term_phrase_np(user_interaction_agenda.ui_agenda(interaction), v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : arg_phrase;
            return phrase;
        }
    }

    public static final SubLObject uiat_salient_descriptor_constraint_okP(SubLObject interaction, SubLObject constraint_sentence) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            return makeBoolean((NIL == constraint_sentence) || (NIL == uia_trampolines.uia_rejected_sentence(v_agenda, constraint_sentence, UNPROVIDED)));
        }
    }

    public static final SubLObject uiat_salient_descriptor_handle_reply(SubLObject reply) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = reply;
                SubLObject current = datum;
                SubLObject operator = NIL;
                SubLObject action_type = NIL;
                SubLObject temp_plist = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt95);
                operator = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt95);
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
                    if (pcase_var.eql($END_INTERVIEW)) {
                        uiat_salient_descriptor_maybe_assert_confirmed(interaction);
                        ui_salient_descriptor_set_prompt_status(interaction, $DONE);
                        return user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                    } else
                        if (pcase_var.eql($COULDNT_PROCESS)) {
                            {
                                SubLObject message = $str_alt100$Sorry__for_some_reason_I_couldn_t;
                                SubLObject message_act = user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, message_act);
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            }
                        } else
                            if (pcase_var.eql($ASSERT)) {
                                {
                                    SubLObject datum_12 = plist;
                                    SubLObject current_13 = datum_12;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current_13;
                                    SubLObject bad = NIL;
                                    SubLObject current_14 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum_12, $list_alt102);
                                        current_14 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum_12, $list_alt102);
                                        if (NIL == member(current_14, $list_alt103, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_14 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum_12, $list_alt102);
                                    }
                                    {
                                        SubLObject assert_sentence_tail = property_list_member($ASSERT_SENTENCE, current_13);
                                        SubLObject assert_sentence = (NIL != assert_sentence_tail) ? ((SubLObject) (cadr(assert_sentence_tail))) : NIL;
                                        if (NIL != el_utilities.el_formula_p(assert_sentence)) {
                                            {
                                                SubLObject message = $str_alt106$Thinking_of_follow_up_question_;
                                                uia_mumbler.uia_mumble(v_agenda, message);
                                                uia_tools_basic.uia_act_new_thinking_child(interaction, UIAT_SALIENT_DESCRIPTOR_MAYBE_SET_FOLLOWUP, list(interaction, assert_sentence), message, $FOLLOW_UP);
                                            }
                                        }
                                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                    }
                                }
                            } else
                                if (pcase_var.eql($GKE_SUBMIT)) {
                                    {
                                        SubLObject datum_15 = plist;
                                        SubLObject current_16 = datum_15;
                                        SubLObject allow_other_keys_p = NIL;
                                        SubLObject rest = current_16;
                                        SubLObject bad = NIL;
                                        SubLObject current_17 = NIL;
                                        for (; NIL != rest;) {
                                            destructuring_bind_must_consp(rest, datum_15, $list_alt109);
                                            current_17 = rest.first();
                                            rest = rest.rest();
                                            destructuring_bind_must_consp(rest, datum_15, $list_alt109);
                                            if (NIL == member(current_17, $list_alt110, UNPROVIDED, UNPROVIDED)) {
                                                bad = T;
                                            }
                                            if (current_17 == $ALLOW_OTHER_KEYS) {
                                                allow_other_keys_p = rest.first();
                                            }
                                            rest = rest.rest();
                                        }
                                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                            cdestructuring_bind_error(datum_15, $list_alt109);
                                        }
                                        {
                                            SubLObject formula_tail = property_list_member($FORMULA, current_16);
                                            SubLObject formula = (NIL != formula_tail) ? ((SubLObject) (cadr(formula_tail))) : NIL;
                                            SubLObject constraint_sentence = NIL;
                                            uiat_salient_descriptor_handle_specify_guts_result(interaction, constraint_sentence, formula);
                                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                        }
                                    }
                                } else
                                    if (pcase_var.eql($ACCEPTED_EXAMPLES)) {
                                        {
                                            SubLObject datum_18 = plist;
                                            SubLObject current_19 = datum_18;
                                            SubLObject allow_other_keys_p = NIL;
                                            SubLObject rest = current_19;
                                            SubLObject bad = NIL;
                                            SubLObject current_20 = NIL;
                                            for (; NIL != rest;) {
                                                destructuring_bind_must_consp(rest, datum_18, $list_alt113);
                                                current_20 = rest.first();
                                                rest = rest.rest();
                                                destructuring_bind_must_consp(rest, datum_18, $list_alt113);
                                                if (NIL == member(current_20, $list_alt114, UNPROVIDED, UNPROVIDED)) {
                                                    bad = T;
                                                }
                                                if (current_20 == $ALLOW_OTHER_KEYS) {
                                                    allow_other_keys_p = rest.first();
                                                }
                                                rest = rest.rest();
                                            }
                                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                cdestructuring_bind_error(datum_18, $list_alt113);
                                            }
                                            {
                                                SubLObject accepted_examples_tail = property_list_member($ACCEPTED_EXAMPLES, current_19);
                                                SubLObject accepted_examples = (NIL != accepted_examples_tail) ? ((SubLObject) (cadr(accepted_examples_tail))) : NIL;
                                                SubLObject cdolist_list_var = accepted_examples;
                                                SubLObject accepted_example = NIL;
                                                for (accepted_example = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accepted_example = cdolist_list_var.first()) {
                                                    uiat_salient_descriptor_add_specified_term_dependent(interaction, accepted_example);
                                                }
                                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                            }
                                        }
                                    } else
                                        if (pcase_var.eql($ASSERT_CHOICES)) {
                                            {
                                                SubLObject datum_21 = plist;
                                                SubLObject current_22 = datum_21;
                                                SubLObject allow_other_keys_p = NIL;
                                                SubLObject rest = current_22;
                                                SubLObject bad = NIL;
                                                SubLObject current_23 = NIL;
                                                for (; NIL != rest;) {
                                                    destructuring_bind_must_consp(rest, datum_21, $list_alt116);
                                                    current_23 = rest.first();
                                                    rest = rest.rest();
                                                    destructuring_bind_must_consp(rest, datum_21, $list_alt116);
                                                    if (NIL == member(current_23, $list_alt117, UNPROVIDED, UNPROVIDED)) {
                                                        bad = T;
                                                    }
                                                    if (current_23 == $ALLOW_OTHER_KEYS) {
                                                        allow_other_keys_p = rest.first();
                                                    }
                                                    rest = rest.rest();
                                                }
                                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                    cdestructuring_bind_error(datum_21, $list_alt116);
                                                }
                                                {
                                                    SubLObject accepted_choices_tail = property_list_member($ACCEPTED_CHOICES, current_22);
                                                    SubLObject accepted_choices = (NIL != accepted_choices_tail) ? ((SubLObject) (cadr(accepted_choices_tail))) : NIL;
                                                    SubLObject cdolist_list_var = accepted_choices;
                                                    SubLObject choice = NIL;
                                                    for (choice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , choice = cdolist_list_var.first()) {
                                                        uiat_salient_descriptor_assert_choice(interaction, choice);
                                                    }
                                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                }
                                            }
                                        } else
                                            if (pcase_var.eql($CONCEPT_IN_SENTENCE_DISAMBIGUATOR)) {
                                                {
                                                    SubLObject datum_24 = plist;
                                                    SubLObject current_25 = datum_24;
                                                    SubLObject allow_other_keys_p = NIL;
                                                    SubLObject rest = current_25;
                                                    SubLObject bad = NIL;
                                                    SubLObject current_26 = NIL;
                                                    for (; NIL != rest;) {
                                                        destructuring_bind_must_consp(rest, datum_24, $list_alt119);
                                                        current_26 = rest.first();
                                                        rest = rest.rest();
                                                        destructuring_bind_must_consp(rest, datum_24, $list_alt119);
                                                        if (NIL == member(current_26, $list_alt120, UNPROVIDED, UNPROVIDED)) {
                                                            bad = T;
                                                        }
                                                        if (current_26 == $ALLOW_OTHER_KEYS) {
                                                            allow_other_keys_p = rest.first();
                                                        }
                                                        rest = rest.rest();
                                                    }
                                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                        cdestructuring_bind_error(datum_24, $list_alt119);
                                                    }
                                                    {
                                                        SubLObject phrases_tail = property_list_member($PHRASES, current_25);
                                                        SubLObject phrases = (NIL != phrases_tail) ? ((SubLObject) (cadr(phrases_tail))) : NIL;
                                                        SubLObject subprompts = uiat_salient_descriptor_get_subprompts(interaction);
                                                        SubLObject subprompt = subprompts.first();
                                                        SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                                                        SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, $SPECIFIED_TERM, var);
                                                        SubLObject arg_positions = cycl_utilities.arg_positions_bfs($SPECIFIED_TERM, assert_sentence, UNPROVIDED);
                                                        SubLObject arg_positions_es = list(arg_positions);
                                                        SubLObject isas_es = list(uiat_salient_descriptor_isas(subprompt));
                                                        SubLObject genls_es = list(uiat_salient_descriptor_genls(subprompt));
                                                        SubLObject concept_disambiguator = uia_tools_basic.uia_act_new_concept_in_sentence_disambiguator(v_agenda, $REQUIRED, phrases, arg_positions_es, assert_sentence, NIL, NIL, isas_es, genls_es);
                                                        user_interaction_agenda.ui_state_update(concept_disambiguator, $SENTENCE_FORCE, $DECLARATIVE);
                                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, concept_disambiguator);
                                                    }
                                                }
                                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                            } else
                                                if (pcase_var.eql($MULTI_CONCEPT_IN_SENTENCE_DISAMBIGUATOR)) {
                                                    {
                                                        SubLObject datum_27 = plist;
                                                        SubLObject current_28 = datum_27;
                                                        SubLObject allow_other_keys_p = NIL;
                                                        SubLObject rest = current_28;
                                                        SubLObject bad = NIL;
                                                        SubLObject current_29 = NIL;
                                                        for (; NIL != rest;) {
                                                            destructuring_bind_must_consp(rest, datum_27, $list_alt126);
                                                            current_29 = rest.first();
                                                            rest = rest.rest();
                                                            destructuring_bind_must_consp(rest, datum_27, $list_alt126);
                                                            if (NIL == member(current_29, $list_alt127, UNPROVIDED, UNPROVIDED)) {
                                                                bad = T;
                                                            }
                                                            if (current_29 == $ALLOW_OTHER_KEYS) {
                                                                allow_other_keys_p = rest.first();
                                                            }
                                                            rest = rest.rest();
                                                        }
                                                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                            cdestructuring_bind_error(datum_27, $list_alt126);
                                                        }
                                                        {
                                                            SubLObject phrases_tail = property_list_member($PHRASES, current_28);
                                                            SubLObject phrases = (NIL != phrases_tail) ? ((SubLObject) (cadr(phrases_tail))) : NIL;
                                                            SubLObject terms_tail = property_list_member($TERMS, current_28);
                                                            SubLObject terms = (NIL != terms_tail) ? ((SubLObject) (cadr(terms_tail))) : NIL;
                                                            SubLObject subprompts = uiat_salient_descriptor_get_subprompts(interaction);
                                                            SubLObject subprompt = list_utilities.last_one(subprompts);
                                                            SubLObject phrases_to_parse = NIL;
                                                            SubLObject assert_sentence = el_utilities.copy_expression(rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, UNPROVIDED, UNPROVIDED));
                                                            SubLObject arg_positions_es = NIL;
                                                            SubLObject isas_es = NIL;
                                                            SubLObject genls_es = NIL;
                                                            {
                                                                SubLObject remainder = NIL;
                                                                for (remainder = terms; NIL != remainder; remainder = cddr(remainder)) {
                                                                    {
                                                                        SubLObject n = remainder.first();
                                                                        SubLObject v_term = cadr(remainder);
                                                                        SubLObject subprompt_30 = nth(n, subprompts);
                                                                        SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt_30);
                                                                        assert_sentence = cycl_utilities.expression_nsubst(v_term, var, assert_sentence, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                            {
                                                                SubLObject remainder = NIL;
                                                                for (remainder = phrases; NIL != remainder; remainder = cddr(remainder)) {
                                                                    {
                                                                        SubLObject n = remainder.first();
                                                                        SubLObject phrase = cadr(remainder);
                                                                        SubLObject subprompt_31 = nth(n, subprompts);
                                                                        SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt_31);
                                                                        SubLObject arg_positions = cycl_utilities.arg_positions_bfs(var, assert_sentence, UNPROVIDED);
                                                                        phrases_to_parse = cons(phrase, phrases_to_parse);
                                                                        arg_positions_es = cons(arg_positions, arg_positions_es);
                                                                        isas_es = cons(uiat_salient_descriptor_isas(subprompt_31), isas_es);
                                                                        genls_es = cons(uiat_salient_descriptor_genls(subprompt_31), genls_es);
                                                                    }
                                                                }
                                                            }
                                                            if (NIL == phrases_to_parse) {
                                                                uiat_salient_descriptor_add_assert_dependent(interaction, assert_sentence, UNPROVIDED);
                                                            } else {
                                                                {
                                                                    SubLObject concept_disambiguator = uia_tools_basic.uia_act_new_concept_in_sentence_disambiguator(v_agenda, $REQUIRED, phrases_to_parse, arg_positions_es, assert_sentence, NIL, NIL, isas_es, genls_es);
                                                                    user_interaction_agenda.ui_state_update(concept_disambiguator, $SENTENCE_FORCE, $DECLARATIVE);
                                                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, concept_disambiguator);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                } else
                                                    if (pcase_var.eql($SKIP_TACTIC)) {
                                                        uiat_salient_descriptor_pop_tactic(interaction);
                                                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                    } else
                                                        if (pcase_var.eql($NEW_RULE)) {
                                                            {
                                                                SubLObject subprompts = uiat_salient_descriptor_get_subprompts(interaction);
                                                                SubLObject subprompt = subprompts.first();
                                                                SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, UNPROVIDED, UNPROVIDED);
                                                                SubLObject new_rule_child = cb_uia_tools_introduction.uia_act_new_rule_constructor_for_consequent(v_agenda, assert_sentence, $REQUIRED);
                                                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, new_rule_child);
                                                            }
                                                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                        } else
                                                            if (pcase_var.eql($REPLACE_EXAMPLES)) {
                                                                {
                                                                    SubLObject datum_32 = plist;
                                                                    SubLObject current_33 = datum_32;
                                                                    SubLObject allow_other_keys_p = NIL;
                                                                    SubLObject rest = current_33;
                                                                    SubLObject bad = NIL;
                                                                    SubLObject current_34 = NIL;
                                                                    for (; NIL != rest;) {
                                                                        destructuring_bind_must_consp(rest, datum_32, $list_alt132);
                                                                        current_34 = rest.first();
                                                                        rest = rest.rest();
                                                                        destructuring_bind_must_consp(rest, datum_32, $list_alt132);
                                                                        if (NIL == member(current_34, $list_alt133, UNPROVIDED, UNPROVIDED)) {
                                                                            bad = T;
                                                                        }
                                                                        if (current_34 == $ALLOW_OTHER_KEYS) {
                                                                            allow_other_keys_p = rest.first();
                                                                        }
                                                                        rest = rest.rest();
                                                                    }
                                                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                                        cdestructuring_bind_error(datum_32, $list_alt132);
                                                                    }
                                                                    {
                                                                        SubLObject new_example_nums_tail = property_list_member($NEW_EXAMPLE_NUMS, current_33);
                                                                        SubLObject new_example_nums = (NIL != new_example_nums_tail) ? ((SubLObject) (cadr(new_example_nums_tail))) : NIL;
                                                                        ui_salient_descriptor_replace_examples(interaction, new_example_nums);
                                                                    }
                                                                }
                                                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                            } else
                                                                if (pcase_var.eql($YUCK)) {
                                                                    ui_salient_descriptor_set_prompt_status(interaction, $YUCK);
                                                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                                } else
                                                                    if (pcase_var.eql($YUCK_RESULT)) {
                                                                        {
                                                                            SubLObject datum_35 = plist;
                                                                            SubLObject current_36 = datum_35;
                                                                            SubLObject allow_other_keys_p = NIL;
                                                                            SubLObject rest = current_36;
                                                                            SubLObject bad = NIL;
                                                                            SubLObject current_37 = NIL;
                                                                            for (; NIL != rest;) {
                                                                                destructuring_bind_must_consp(rest, datum_35, $list_alt136);
                                                                                current_37 = rest.first();
                                                                                rest = rest.rest();
                                                                                destructuring_bind_must_consp(rest, datum_35, $list_alt136);
                                                                                if (NIL == member(current_37, $list_alt137, UNPROVIDED, UNPROVIDED)) {
                                                                                    bad = T;
                                                                                }
                                                                                if (current_37 == $ALLOW_OTHER_KEYS) {
                                                                                    allow_other_keys_p = rest.first();
                                                                                }
                                                                                rest = rest.rest();
                                                                            }
                                                                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                                                cdestructuring_bind_error(datum_35, $list_alt136);
                                                                            }
                                                                            {
                                                                                SubLObject reportP_tail = property_list_member($kw138$REPORT_, current_36);
                                                                                SubLObject reportP = (NIL != reportP_tail) ? ((SubLObject) (cadr(reportP_tail))) : NIL;
                                                                                SubLObject smiteP_tail = property_list_member($kw139$SMITE_, current_36);
                                                                                SubLObject smiteP = (NIL != smiteP_tail) ? ((SubLObject) (cadr(smiteP_tail))) : NIL;
                                                                                SubLObject message_tail = property_list_member($MESSAGE, current_36);
                                                                                SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : NIL;
                                                                                if (NIL != reportP) {
                                                                                    uiat_salient_descriptor_report_yucky_prompt(interaction, message);
                                                                                }
                                                                                if (NIL != smiteP) {
                                                                                    uiat_salient_descriptor_disable_yucky_prompt(interaction);
                                                                                }
                                                                                if ((NIL != reportP) || (NIL != smiteP)) {
                                                                                    uiat_salient_descriptor_maybe_assert_confirmed(interaction);
                                                                                    uiat_salient_descriptor_get_next_prompt(interaction, $SKIP_PROMPT);
                                                                                } else {
                                                                                    ui_salient_descriptor_set_prompt_status(interaction, $READY);
                                                                                }
                                                                            }
                                                                        }
                                                                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                                    } else
                                                                        if (pcase_var.eql($CHOOSE_NEW_PROMPT)) {
                                                                            {
                                                                                SubLObject _prev_bind_0 = $uiat_salient_descriptor_prompt_picker$.currentBinding(thread);
                                                                                try {
                                                                                    $uiat_salient_descriptor_prompt_picker$.bind($USER, thread);
                                                                                    uiat_salient_descriptor_get_next_prompt(interaction, UNPROVIDED);
                                                                                } finally {
                                                                                    $uiat_salient_descriptor_prompt_picker$.rebind(_prev_bind_0, thread);
                                                                                }
                                                                            }
                                                                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                                        } else
                                                                            if (pcase_var.eql($CHOOSE_PROMPT)) {
                                                                                {
                                                                                    SubLObject datum_38 = plist;
                                                                                    SubLObject current_39 = datum_38;
                                                                                    SubLObject allow_other_keys_p = NIL;
                                                                                    SubLObject rest = current_39;
                                                                                    SubLObject bad = NIL;
                                                                                    SubLObject current_40 = NIL;
                                                                                    for (; NIL != rest;) {
                                                                                        destructuring_bind_must_consp(rest, datum_38, $list_alt144);
                                                                                        current_40 = rest.first();
                                                                                        rest = rest.rest();
                                                                                        destructuring_bind_must_consp(rest, datum_38, $list_alt144);
                                                                                        if (NIL == member(current_40, $list_alt145, UNPROVIDED, UNPROVIDED)) {
                                                                                            bad = T;
                                                                                        }
                                                                                        if (current_40 == $ALLOW_OTHER_KEYS) {
                                                                                            allow_other_keys_p = rest.first();
                                                                                        }
                                                                                        rest = rest.rest();
                                                                                    }
                                                                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                                                        cdestructuring_bind_error(datum_38, $list_alt144);
                                                                                    }
                                                                                    {
                                                                                        SubLObject skip_allP_tail = property_list_member($kw146$SKIP_ALL_, current_39);
                                                                                        SubLObject skip_allP = (NIL != skip_allP_tail) ? ((SubLObject) (cadr(skip_allP_tail))) : NIL;
                                                                                        SubLObject choice_tail = property_list_member($CHOICE, current_39);
                                                                                        SubLObject choice = (NIL != choice_tail) ? ((SubLObject) (cadr(choice_tail))) : NIL;
                                                                                        SubLObject prompter = user_interaction_agenda.ui_state_lookup(interaction, $PROMPTER, UNPROVIDED);
                                                                                        if (NIL != skip_allP) {
                                                                                            {
                                                                                                SubLObject cdolist_list_var = user_interaction_agenda.ui_state_lookup(interaction, $UNUSED_PROMPTS, UNPROVIDED);
                                                                                                SubLObject prompt = NIL;
                                                                                                for (prompt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , prompt = cdolist_list_var.first()) {
                                                                                                    if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt)) {
                                                                                                        rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_remove_prompt(prompter, prompt);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            user_interaction_agenda.ui_state_clear(interaction, $UNUSED_PROMPTS);
                                                                                            uiat_salient_descriptor_get_next_prompt(interaction, UNPROVIDED);
                                                                                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                                                        } else
                                                                                            if (!choice.isString()) {
                                                                                                {
                                                                                                    SubLObject message = format(NIL, $str_alt148$Sorry__you_must_choose_a_question);
                                                                                                    SubLObject message_act = user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                                                                                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, message_act);
                                                                                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                                                                }
                                                                                            } else {
                                                                                                {
                                                                                                    SubLObject prompt_id = parse_integer(choice, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    SubLObject current_prompt = user_interaction_agenda.ui_state_lookup(interaction, $PROMPT, UNPROVIDED);
                                                                                                    SubLObject chosen_prompt = ((NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter)) && prompt_id.isInteger()) ? ((SubLObject) (rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_find_prompt_by_id(prompter, prompt_id))) : NIL;
                                                                                                    if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(chosen_prompt)) {
                                                                                                        rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_next(prompter, chosen_prompt);
                                                                                                    } else {
                                                                                                        chosen_prompt = $DONE;
                                                                                                    }
                                                                                                    if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(current_prompt)) {
                                                                                                        rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_replace_prompt(prompter, current_prompt);
                                                                                                    }
                                                                                                    ui_salient_descriptor_set_prompt(interaction, chosen_prompt);
                                                                                                    user_interaction_agenda.ui_state_clear(interaction, $UNUSED_PROMPTS);
                                                                                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                                                                }
                                                                                            }

                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (pcase_var.eql($SKIP_PROMPT)) {
                                                                                    ui_salient_descriptor_set_prompt(interaction, $NONE);
                                                                                    uiat_salient_descriptor_get_next_prompt(interaction, $SKIP_PROMPT);
                                                                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                                                } else
                                                                                    if (pcase_var.eql($DONT_KNOW)) {
                                                                                        uiat_salient_descriptor_record_dont_know(interaction);
                                                                                        uiat_salient_descriptor_maybe_assert_confirmed(interaction);
                                                                                        uiat_salient_descriptor_get_next_prompt(interaction, $SKIP_PROMPT);
                                                                                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                                                    } else
                                                                                        if (pcase_var.eql($SKIP_ALL_FACETS)) {
                                                                                            user_interaction_agenda.ui_state_update(interaction, $FACETS_TO_DO, NIL);
                                                                                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                                                        } else
                                                                                            if (pcase_var.eql($SET_FACETS)) {
                                                                                                {
                                                                                                    SubLObject datum_41 = plist;
                                                                                                    SubLObject current_42 = datum_41;
                                                                                                    SubLObject allow_other_keys_p = NIL;
                                                                                                    SubLObject rest = current_42;
                                                                                                    SubLObject bad = NIL;
                                                                                                    SubLObject current_43 = NIL;
                                                                                                    for (; NIL != rest;) {
                                                                                                        destructuring_bind_must_consp(rest, datum_41, $list_alt151);
                                                                                                        current_43 = rest.first();
                                                                                                        rest = rest.rest();
                                                                                                        destructuring_bind_must_consp(rest, datum_41, $list_alt151);
                                                                                                        if (NIL == member(current_43, $list_alt152, UNPROVIDED, UNPROVIDED)) {
                                                                                                            bad = T;
                                                                                                        }
                                                                                                        if (current_43 == $ALLOW_OTHER_KEYS) {
                                                                                                            allow_other_keys_p = rest.first();
                                                                                                        }
                                                                                                        rest = rest.rest();
                                                                                                    }
                                                                                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                                                                        cdestructuring_bind_error(datum_41, $list_alt151);
                                                                                                    }
                                                                                                    {
                                                                                                        SubLObject facets_tail = property_list_member($FACETS, current_42);
                                                                                                        SubLObject v_facets = (NIL != facets_tail) ? ((SubLObject) (cadr(facets_tail))) : NIL;
                                                                                                        user_interaction_agenda.ui_state_update(interaction, $FACETS_TO_DO, v_facets);
                                                                                                    }
                                                                                                }
                                                                                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                                                                            }


















                }
            }
            return NIL;
        }
    }

    /**
     * Add dependent to INTERACTION to assert SENTENCE.
     */
    public static final SubLObject uiat_salient_descriptor_add_assert_dependent(SubLObject interaction, SubLObject sentence, SubLObject sentence_paraphrase) {
        if (sentence_paraphrase == UNPROVIDED) {
            sentence_paraphrase = NIL;
        }
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            if (NIL != uiat_sd_inducedP(interaction)) {
                uiat_salient_descriptor_report_induced_rule(interaction, sentence);
            }
            if (NIL == sentence_paraphrase) {
                sentence_paraphrase = uia_trampolines.uia_sentence_phrase(v_agenda, sentence, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject assertion_creator = uia_tools_introduction.uia_act_new_assertion_creator(v_agenda, $REQUIRED, sentence_paraphrase, sentence, UNPROVIDED);
                return user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, assertion_creator);
            }
        }
    }

    public static final SubLObject uiat_salient_descriptor_isas(SubLObject subprompt) {
        {
            SubLObject constraint_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_constraint_sentence(subprompt);
            return uiat_salient_descriptor_isa_cols(constraint_sentence);
        }
    }

    public static final SubLObject uiat_salient_descriptor_genls(SubLObject subprompt) {
        {
            SubLObject constraint_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_constraint_sentence(subprompt);
            return uiat_salient_descriptor_genl_cols(constraint_sentence);
        }
    }

    public static final SubLObject uiat_salient_descriptor_isa_cols(SubLObject constraint_sentence) {
        {
            SubLObject isas = NIL;
            if (NIL != formula_pattern_match.formula_matches_pattern(constraint_sentence, $list_alt154)) {
                isas = cons(cycl_utilities.formula_arg2(constraint_sentence, UNPROVIDED), isas);
            } else
                if (NIL != el_utilities.el_conjunction_p(constraint_sentence)) {
                    {
                        SubLObject args = cycl_utilities.formula_args(constraint_sentence, $IGNORE);
                        SubLObject cdolist_list_var = args;
                        SubLObject conjunct = NIL;
                        for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                            {
                                SubLObject cdolist_list_var_44 = uiat_salient_descriptor_isa_cols(conjunct);
                                SubLObject isa_col = NIL;
                                for (isa_col = cdolist_list_var_44.first(); NIL != cdolist_list_var_44; cdolist_list_var_44 = cdolist_list_var_44.rest() , isa_col = cdolist_list_var_44.first()) {
                                    {
                                        SubLObject item_var = isa_col;
                                        if (NIL == member(item_var, isas, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            isas = cons(item_var, isas);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            return isas;
        }
    }

    public static final SubLObject uiat_salient_descriptor_genl_cols(SubLObject constraint_sentence) {
        {
            SubLObject v_genls = NIL;
            if (NIL != formula_pattern_match.formula_matches_pattern(constraint_sentence, $list_alt156)) {
                v_genls = cons(cycl_utilities.formula_arg2(constraint_sentence, UNPROVIDED), v_genls);
            } else
                if (NIL != el_utilities.el_conjunction_p(constraint_sentence)) {
                    {
                        SubLObject args = cycl_utilities.formula_args(constraint_sentence, $IGNORE);
                        SubLObject cdolist_list_var = args;
                        SubLObject conjunct = NIL;
                        for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                            {
                                SubLObject cdolist_list_var_45 = uiat_salient_descriptor_genl_cols(conjunct);
                                SubLObject genl_col = NIL;
                                for (genl_col = cdolist_list_var_45.first(); NIL != cdolist_list_var_45; cdolist_list_var_45 = cdolist_list_var_45.rest() , genl_col = cdolist_list_var_45.first()) {
                                    {
                                        SubLObject item_var = genl_col;
                                        if (NIL == member(item_var, v_genls, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            v_genls = cons(item_var, v_genls);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            return v_genls;
        }
    }

    public static final SubLObject uiat_sd_inducedP(SubLObject interaction) {
        {
            SubLObject justification = uiat_salient_descriptor_get_justification(interaction);
            return rkf_salient_descriptor.rkf_salient_descriptor_rule_spec_p(justification);
        }
    }

    /**
     * Report the use of an induced Salient Descriptor rule.
     */
    public static final SubLObject uiat_salient_descriptor_report_induced_rule(SubLObject interaction, SubLObject sentence) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject rule_spec = uiat_salient_descriptor_get_justification(interaction);
            SubLObject rule = rkf_salient_descriptor.rkf_salient_descriptor_rule_from_spec(rule_spec, UNPROVIDED);
            if (NIL != el_utilities.el_formula_p(rule)) {
                {
                    SubLObject user = user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED);
                    SubLObject subject = $$$Induced_Salient_Descriptor_rule;
                    SubLObject focus_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED);
                    SubLObject message = format(NIL, $str_alt158$While_refining_the_concept__S___S, new SubLObject[]{ focus_term, uia_trampolines.uia_term_phrase(v_agenda, focus_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), uia_trampolines.uia_term_phrase(v_agenda, user, UNPROVIDED, UNPROVIDED, UNPROVIDED), sentence, uia_trampolines.uia_sentence_phrase(v_agenda, sentence, UNPROVIDED, UNPROVIDED), rule, uia_trampolines.uia_sentence_phrase(v_agenda, rule, UNPROVIDED, UNPROVIDED) });
                    uia_tools_review_and_testing.uiat_kreview_submit_knowledge_for_review(interaction, message, subject);
                }
            }
        }
        return NIL;
    }

    /**
     * Replace the examples indexed by BAD-EXAMPLE-NUMS in the prompt for INTERACTION.
     */
    public static final SubLObject ui_salient_descriptor_replace_examples(SubLObject interaction, SubLObject bad_example_nums) {
        {
            SubLObject subprompts = uiat_salient_descriptor_get_subprompts(interaction);
            SubLObject cdolist_list_var = bad_example_nums;
            SubLObject bad_example_num = NIL;
            for (bad_example_num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bad_example_num = cdolist_list_var.first()) {
                {
                    SubLObject bad_example_subprompt = nth(bad_example_num, subprompts);
                    SubLObject new_bad_examples = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples(bad_example_subprompt);
                    uiat_salient_descriptor_record_bad_examples(interaction, bad_example_num, new_bad_examples);
                    uiat_salient_descriptor_get_new_examples(interaction, bad_example_num);
                }
            }
        }
        return interaction;
    }

    /**
     * Record the information that NEW-BAD-EXAMPLES are bad examples for the subprompt indexed
     * by BAD-EXAMPLE-NUM in INTERACTION.
     */
    public static final SubLObject uiat_salient_descriptor_record_bad_examples(SubLObject interaction, SubLObject bad_example_num, SubLObject new_bad_examples) {
        if (NIL != list_utilities.proper_list_p(new_bad_examples)) {
            {
                SubLObject bad_example_dict = uiat_salient_descriptor_get_bad_example_dict(interaction);
                SubLObject cdolist_list_var = new_bad_examples;
                SubLObject new_bad_example = NIL;
                for (new_bad_example = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_bad_example = cdolist_list_var.first()) {
                    dictionary_utilities.dictionary_pushnew(bad_example_dict, bad_example_num, new_bad_example, symbol_function(EQUAL), UNPROVIDED);
                }
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_salient_descriptor_get_bad_example_dict(SubLObject interaction) {
        {
            SubLObject dict = user_interaction_agenda.ui_state_lookup(interaction, $BAD_EXAMPLE_DICTIONARY, $NONE);
            if (NIL == dictionary.dictionary_p(dict)) {
                dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
                user_interaction_agenda.ui_state_update(interaction, $BAD_EXAMPLE_DICTIONARY, dict);
            }
            return dict;
        }
    }

    public static final SubLObject uiat_salient_descriptor_get_new_examples(SubLObject interaction, SubLObject bad_example_num) {
        {
            SubLObject bad_example_dict = uiat_salient_descriptor_get_bad_example_dict(interaction);
            SubLObject bad_examples = dictionary.dictionary_lookup(bad_example_dict, bad_example_num, NIL);
            SubLObject prompt = user_interaction_agenda.ui_state_lookup(interaction, $PROMPT, UNPROVIDED);
            SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
            SubLObject subprompt = nth(bad_example_num, subprompts);
            SubLObject new_examples = rkf_salient_descriptor_prompter.rkf_sd_examples_for_prompt(prompt, bad_example_num, bad_examples);
            rkf_salient_descriptor.rkf_salient_descriptor_subprompt_set_examples(subprompt, new_examples);
        }
        return interaction;
    }

    public static final SubLObject uiat_salient_descriptor_record_dont_know(SubLObject interaction) {
        {
            SubLObject subprompts = uiat_salient_descriptor_get_subprompts(interaction);
            SubLObject current = user_interaction_agenda.ui_state_lookup(interaction, $DONT_KNOW, $UNINITIALIZED);
            if (current == $UNINITIALIZED) {
                current = set.new_set(UNPROVIDED, UNPROVIDED);
                user_interaction_agenda.ui_state_update(interaction, $DONT_KNOW, current);
            }
            set.set_add(subprompts, current);
        }
        return interaction;
    }

    public static final SubLObject uiat_salient_descriptor_maybe_assert_confirmed(SubLObject interaction) {
        {
            SubLObject confirmed_sentence = user_interaction_agenda.ui_state_lookup(interaction, $CONFIRMED_SENTENCE, UNPROVIDED);
            if (NIL != el_utilities.el_formula_p(confirmed_sentence)) {
                uiat_salient_descriptor_add_assert_dependent(interaction, confirmed_sentence, UNPROVIDED);
            }
        }
        return interaction;
    }

    /**
     * An adjective string we use to describe yucky subprompts
     */
    // defparameter
    private static final SubLSymbol $yucky_adjective$ = makeSymbol("*YUCKY-ADJECTIVE*");

    /**
     *
     *
     * @return STRINGP; Message reporting that YUCKY-PROMPT is yucky.
     */
    public static final SubLObject uiat_salient_descriptor_default_yuck_message(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject user = user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $USER, UNPROVIDED);
                SubLObject message = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    format(stream, $str_alt160$While_refining_the_concept__S__I_, user_interaction_agenda.ui_state_lookup(interaction, $TERM, UNPROVIDED));
                    uiat_salient_descriptor_yuck_message_subprompts(interaction, stream);
                    format(stream, $str_alt161$_____justified_by_the_following_j);
                    uiat_salient_descriptor_yuck_message_justification(interaction, stream);
                    {
                        SubLObject _prev_bind_0 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                        SubLObject _prev_bind_1 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                        try {
                            rkf_macros.$rkf_addressee$.bind($NONE, thread);
                            rkf_macros.$rkf_speaker$.bind(NIL, thread);
                            format(stream, $str_alt162$__I_found_this_to_be__A__Please_i, $yucky_adjective$.getDynamicValue(thread), uia_trampolines.uia_term_phrase(v_agenda, user, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        } finally {
                            rkf_macros.$rkf_speaker$.rebind(_prev_bind_1, thread);
                            rkf_macros.$rkf_addressee$.rebind(_prev_bind_0, thread);
                        }
                    }
                    message = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return message;
            }
        }
    }

    public static final SubLObject uiat_salient_descriptor_yuck_message_subprompts(SubLObject interaction, SubLObject stream) {
        {
            SubLObject cdolist_list_var = uiat_salient_descriptor_get_subprompts(interaction);
            SubLObject subprompt = NIL;
            for (subprompt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subprompt = cdolist_list_var.first()) {
                {
                    SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, UNPROVIDED, UNPROVIDED);
                    print(uia_trampolines.uia_query_phrase(user_interaction_agenda.ui_agenda(interaction), assert_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED), stream);
                }
                print(subprompt, stream);
                terpri(stream);
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_salient_descriptor_yuck_message_justification(SubLObject interaction, SubLObject stream) {
        {
            SubLObject justification = uiat_salient_descriptor_get_justification(interaction);
            if (NIL != uiat_sd_inducedP(interaction)) {
                {
                    SubLObject rule = rkf_salient_descriptor.rkf_salient_descriptor_rule_from_spec(justification, UNPROVIDED);
                    print(uia_trampolines.uia_sentence_phrase(user_interaction_agenda.ui_agenda(interaction), rule, UNPROVIDED, UNPROVIDED), stream);
                    print(justification, stream);
                    terpri(stream);
                }
            } else {
                {
                    SubLObject cdolist_list_var = justification;
                    SubLObject support = NIL;
                    for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                        {
                            SubLObject support_sentence = arguments.support_el_sentence(support);
                            print(uia_trampolines.uia_sentence_phrase(user_interaction_agenda.ui_agenda(interaction), support_sentence, UNPROVIDED, UNPROVIDED), stream);
                        }
                        print(support, stream);
                        terpri(stream);
                    }
                }
            }
        }
        return interaction;
    }

    /**
     * Report the fact that the current user found the current SD to be yucky.
     */
    public static final SubLObject uiat_salient_descriptor_report_yucky_prompt(SubLObject interaction, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subject = format(NIL, $str_alt163$_A_Salient_Descriptor_Subprompt, string_utilities.upcase_leading($yucky_adjective$.getDynamicValue(thread)));
                if (NIL == message) {
                    message = uiat_salient_descriptor_default_yuck_message(interaction);
                }
                uia_tools_review_and_testing.uiat_kreview_submit_knowledge_for_review(interaction, message, subject);
            }
            return interaction;
        }
    }

    /**
     * Mark the current prompt as something not to use for the current topic.
     */
    public static final SubLObject uiat_salient_descriptor_disable_yucky_prompt(SubLObject interaction) {
        {
            SubLObject justification = uiat_salient_descriptor_get_justification(interaction);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            if (NIL != rkf_salient_descriptor.rkf_salient_descriptor_rule_spec_p(justification)) {
                return uia_trampolines.uia_deprecate_salient_descriptor_rule_spec(v_agenda, justification);
            } else {
                {
                    SubLObject doomed_assertion = uiat_sd_find_doomed_assertion(justification);
                    if (NIL != assertion_handles.assertion_p(doomed_assertion)) {
                        return uia_trampolines.uia_deprecate_salient_descriptor_rule_assertion(v_agenda, doomed_assertion);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_salient_descriptor_has_justification_p(SubLObject interaction) {
        return list_utilities.sublisp_boolean(uiat_salient_descriptor_get_justification(interaction));
    }

    public static final SubLObject uiat_sd_find_doomed_assertion(SubLObject justification) {
        {
            SubLObject doomed_assertion = NIL;
            SubLObject cdolist_list_var = justification;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if ((NIL != assertion_handles.assertion_p(support)) && ((NIL == assertion_handles.assertion_p(doomed_assertion)) || (NIL != uiat_sd_prefer_assertionP(support, doomed_assertion)))) {
                    doomed_assertion = support;
                }
            }
            return doomed_assertion;
        }
    }

    /**
     * We want to smite the least general assertion that has a #$KEFacilitationPredicate pos-lit.
     */
    public static final SubLObject uiat_sd_prefer_assertionP(SubLObject as1, SubLObject as2) {
        {
            SubLObject ans = NIL;
            if (NIL != assertions_high.rule_assertionP(as2)) {
                {
                    SubLObject sd_pred_lit = uiat_sd_find_sd_lit(as1);
                    SubLObject sd_pred1 = (NIL != sd_pred_lit) ? ((SubLObject) (cycl_utilities.atomic_sentence_arg0(sd_pred_lit))) : NIL;
                    ans = makeBoolean((NIL != sd_pred1) && (NIL != cycl_utilities.expression_find(sd_pred1, clauses.neg_lits(assertions_high.assertion_cnf(as2)), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                }
            }
            return ans;
        }
    }

    public static final SubLObject uiat_sd_find_sd_lit(SubLObject as) {
        {
            SubLObject cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(as));
            SubLObject pos_lit = NIL;
            for (pos_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos_lit = cdolist_list_var.first()) {
                if (NIL != isa.isa_in_any_mtP(cycl_utilities.atomic_sentence_arg0(pos_lit), $$KEFacilitationPredicate)) {
                    return pos_lit;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_salient_descriptor_is_term_permissibleP(SubLObject interaction, SubLObject v_term) {
        {
            SubLObject prompt = user_interaction_agenda.ui_state_lookup(interaction, $PROMPT, UNPROVIDED);
            SubLObject permissableP = T;
            SubLObject mumble_phrase = NIL;
            if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt)) {
                {
                    SubLObject my_result_will_be = user_interaction_agenda.ui_state_lookup(interaction, $MY_RESULT_WILL_BE, UNPROVIDED);
                    SubLObject my_result_string = symbol_name(my_result_will_be);
                    SubLObject integer_suffix = (NIL != string_utilities.integer_suffix(my_result_string)) ? ((SubLObject) (string_utilities.integer_suffix(my_result_string))) : ZERO_INTEGER;
                    SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
                    SubLObject subprompt = nth(integer_suffix, subprompts);
                    SubLObject pcase_var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_type(subprompt);
                    if (pcase_var.eql($SPECIFY) || pcase_var.eql($CONFIRM)) {
                        {
                            SubLObject constraint = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_constraint_sentence(subprompt);
                            SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                            SubLObject constraint_sentence = cycl_utilities.expression_subst(v_term, var, constraint, UNPROVIDED, UNPROVIDED);
                            permissableP = uiat_salient_descriptor_constraint_okP(interaction, constraint_sentence);
                            if (NIL == permissableP) {
                                {
                                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                                    SubLObject term_phrase = uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject ask_phrase = uia_trampolines.uia_sentence_phrase(v_agenda, constraint_sentence, UNPROVIDED, UNPROVIDED);
                                    mumble_phrase = format(NIL, $str_alt167$The_interpretation___A__is_being_, term_phrase, ask_phrase);
                                }
                            }
                        }
                    }
                }
            }
            return values(permissableP, mumble_phrase);
        }
    }

    public static final SubLObject uiat_salient_descriptor_maybe_set_followup(SubLObject interaction, SubLObject confirmed_sentence) {
        {
            SubLObject old_prompt = user_interaction_agenda.ui_state_lookup(interaction, $PROMPT, UNPROVIDED);
            SubLObject old_subprompts = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(old_prompt);
            SubLObject follow_up_prompt = NIL;
            user_interaction_agenda.ui_state_update(interaction, $CONFIRMED_SENTENCE, confirmed_sentence);
            {
                SubLObject prompter = user_interaction_agenda.ui_state_lookup(interaction, $PROMPTER, UNPROVIDED);
                if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter)) {
                    follow_up_prompt = rkf_salient_descriptor_prompter.rkf_salient_descriptor_followup_prompt_via_prompter(prompter, old_prompt, confirmed_sentence);
                }
            }
            if ((NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(follow_up_prompt)) && (!old_subprompts.equal(rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(follow_up_prompt)))) {
                user_interaction_agenda.ui_state_update(interaction, $PROMPT, follow_up_prompt);
                return $ADDED;
            }
        }
        return $NOT_ADDED;
    }

    public static final SubLObject uiat_salient_descriptor_pop_tactic(SubLObject interaction) {
        {
            SubLObject prompter = user_interaction_agenda.ui_state_lookup(interaction, $PROMPTER, UNPROVIDED);
            SubLObject prompt = user_interaction_agenda.ui_state_lookup(interaction, $PROMPT, UNPROVIDED);
            SubLObject message = format(NIL, $str_alt169$Popping_tactic_associated_with_pr, prompt);
            uia_mumbler.uia_mumble(user_interaction_agenda.ui_agenda(interaction), message);
            if ((NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter)) && (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt))) {
                rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_pop_prompt_tactic(prompter, prompt);
            }
            uiat_salient_descriptor_maybe_assert_confirmed(interaction);
            uiat_salient_descriptor_get_next_prompt(interaction, $POP_TACTIC);
        }
        user_interaction_agenda.ui_state_clear(interaction, $UNUSED_PROMPTS);
        return interaction;
    }

    public static final SubLObject uiat_salient_descriptor_assert_choice(SubLObject interaction, SubLObject chosen_term) {
        {
            SubLObject subprompts = uiat_salient_descriptor_get_subprompts(interaction);
            SubLObject subprompt = subprompts.first();
            SubLObject var = second(subprompt);
            SubLObject cycl_sentence = fourth(subprompt);
            SubLObject assert_sentence = cycl_utilities.expression_subst(chosen_term, var, cycl_sentence, UNPROVIDED, UNPROVIDED);
            return NIL != assert_sentence ? ((SubLObject) (uiat_salient_descriptor_add_assert_dependent(interaction, assert_sentence, UNPROVIDED))) : NIL;
        }
    }

    public static final SubLObject uia_act_new_fact_entry_tool(SubLObject v_agenda, SubLObject mode, SubLObject v_term, SubLObject topics, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $FACT_ENTRY_TOOL, list(v_term, topics), plist);
    }

    public static final SubLObject uiat_fact_entry_generate_request(SubLObject interaction) {
        uiat_fet_ensure_initialized(interaction);
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject v_term = uiat_fet_get_current_term(interaction);
            SubLObject topic = uiat_fet_get_current_topic(interaction);
            if (NIL == topic) {
                user_interaction_agenda.uia_act_complete(v_agenda, interaction, v_term);
                return user_interaction_agenda.uia_generate_next_request(v_agenda);
            } else {
                return user_interaction_agenda.make_ui_request(interaction, $SHOW, list($TERM, v_term, $TOPIC, topic));
            }
        }
    }

    public static final SubLObject uiat_fet_ensure_initialized(SubLObject interaction) {
        {
            SubLObject initializedP = user_interaction_agenda.ui_state_lookup(interaction, $kw174$INITIALIZED_, $FALSE);
            if (initializedP != $TRUE) {
                {
                    SubLObject datum = user_interaction_agenda.ui_args(interaction);
                    SubLObject current = datum;
                    SubLObject v_term = NIL;
                    SubLObject topics = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt175);
                    v_term = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt175);
                    topics = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        user_interaction_agenda.ui_state_update(interaction, $TERM, v_term);
                        user_interaction_agenda.ui_state_update(interaction, $TOPICS_TO_DO, topics);
                        user_interaction_agenda.ui_state_update(interaction, $TOPICS_DONE, NIL);
                        user_interaction_agenda.ui_state_update(interaction, $kw174$INITIALIZED_, $TRUE);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt175);
                    }
                }
            }
        }
        return interaction;
    }

    public static final SubLObject uiat_fact_entry_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt95);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt95);
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
                if (pcase_var.eql($NEXT)) {
                    uiat_fet_activate_next_topic(interaction);
                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_fet_activate_next_topic(SubLObject interaction) {
        {
            SubLObject topics_to_do = uiat_fet_get_current_topics(interaction);
            SubLObject topics_done = uiat_fet_get_completed_topics(interaction);
            topics_done = cons(topics_to_do.first(), topics_done);
            uiat_fet_update_current_topics(interaction, topics_to_do.rest());
            uiat_fet_update_completed_topics(interaction, topics_done);
            return interaction;
        }
    }

    public static final SubLObject uiat_fet_get_current_term(SubLObject interaction) {
        return user_interaction_agenda.ui_state_lookup(interaction, $TERM, NIL);
    }

    public static final SubLObject uiat_fet_get_current_topic(SubLObject interaction) {
        return uiat_fet_get_current_topics(interaction).first();
    }

    public static final SubLObject uiat_fet_get_current_topics(SubLObject interaction) {
        return user_interaction_agenda.ui_state_lookup(interaction, $TOPICS_TO_DO, NIL);
    }

    public static final SubLObject uiat_fet_update_current_topics(SubLObject interaction, SubLObject topics) {
        return user_interaction_agenda.ui_state_update(interaction, $TOPICS_TO_DO, topics);
    }

    public static final SubLObject uiat_fet_get_completed_topics(SubLObject interaction) {
        return user_interaction_agenda.ui_state_lookup(interaction, $TOPICS_DONE, NIL);
    }

    public static final SubLObject uiat_fet_update_completed_topics(SubLObject interaction, SubLObject topics_done) {
        return user_interaction_agenda.ui_state_update(interaction, $TOPICS_DONE, topics_done);
    }

    public static final SubLObject declare_uia_tools_salient_descriptor_file() {
        declareFunction("uia_act_new_salient_descriptor", "UIA-ACT-NEW-SALIENT-DESCRIPTOR", 3, 1, false);
        declareFunction("uia_invalidate_salient_descriptors_for_term", "UIA-INVALIDATE-SALIENT-DESCRIPTORS-FOR-TERM", 2, 0, false);
        declareFunction("ui_initialize_salient_descriptor_prompter", "UI-INITIALIZE-SALIENT-DESCRIPTOR-PROMPTER", 2, 0, false);
        declareFunction("ui_salient_descriptor_launch_prompt_generator", "UI-SALIENT-DESCRIPTOR-LAUNCH-PROMPT-GENERATOR", 1, 0, false);
        declareFunction("ui_salient_descriptor_generate_prompts", "UI-SALIENT-DESCRIPTOR-GENERATE-PROMPTS", 1, 0, false);
        declareFunction("ui_salient_descriptor_alive_p", "UI-SALIENT-DESCRIPTOR-ALIVE-P", 1, 0, false);
        declareFunction("ui_salient_descriptor_idle_p", "UI-SALIENT-DESCRIPTOR-IDLE-P", 1, 0, false);
        declareFunction("ui_salient_descriptor_empty_p", "UI-SALIENT-DESCRIPTOR-EMPTY-P", 1, 0, false);
        declareFunction("ui_salient_descriptor_note_idle", "UI-SALIENT-DESCRIPTOR-NOTE-IDLE", 1, 0, false);
        declareFunction("uiat_sd_unblock_generator_thread", "UIAT-SD-UNBLOCK-GENERATOR-THREAD", 1, 0, false);
        declareFunction("ui_salient_descriptor_note_busy", "UI-SALIENT-DESCRIPTOR-NOTE-BUSY", 1, 0, false);
        declareFunction("uiat_salient_descriptor_hint", "UIAT-SALIENT-DESCRIPTOR-HINT", 1, 0, false);
        declareFunction("uiat_salient_descriptor_generate_request", "UIAT-SALIENT-DESCRIPTOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_salient_descriptor_take_next_step", "UIAT-SALIENT-DESCRIPTOR-TAKE-NEXT-STEP", 1, 0, false);
        declareFunction("uiat_salient_descriptor_generate_ready_request", "UIAT-SALIENT-DESCRIPTOR-GENERATE-READY-REQUEST", 1, 0, false);
        declareFunction("uiat_salient_descriptor_bad_promptP", "UIAT-SALIENT-DESCRIPTOR-BAD-PROMPT?", 2, 0, false);
        declareFunction("uiat_salient_descriptor_bad_promptP_memoized_internal", "UIAT-SALIENT-DESCRIPTOR-BAD-PROMPT?-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("uiat_salient_descriptor_bad_promptP_memoized", "UIAT-SALIENT-DESCRIPTOR-BAD-PROMPT?-MEMOIZED", 2, 0, false);
        declareFunction("uiat_salient_descriptor_knownP", "UIAT-SALIENT-DESCRIPTOR-KNOWN?", 3, 1, false);
        declareFunction("uiat_salient_descriptor_get_term_facets", "UIAT-SALIENT-DESCRIPTOR-GET-TERM-FACETS", 2, 0, false);
        declareFunction("uiat_salient_descriptor_ensure_unused_prompts", "UIAT-SALIENT-DESCRIPTOR-ENSURE-UNUSED-PROMPTS", 1, 0, false);
        declareFunction("uiat_salient_descriptor_set_unused_prompts", "UIAT-SALIENT-DESCRIPTOR-SET-UNUSED-PROMPTS", 1, 0, false);
        declareFunction("uiat_salient_descriptor_child_completed", "UIAT-SALIENT-DESCRIPTOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_sd_report_successful_assertions", "UIAT-SD-REPORT-SUCCESSFUL-ASSERTIONS", 1, 0, false);
        declareFunction("uiat_sd_report_successful_assertion", "UIAT-SD-REPORT-SUCCESSFUL-ASSERTION", 2, 0, false);
        declareFunction("uiat_salient_descriptor_add_specified_term_dependent", "UIAT-SALIENT-DESCRIPTOR-ADD-SPECIFIED-TERM-DEPENDENT", 2, 0, false);
        declareFunction("uiat_salient_descriptor_specify_guts_2_multiple", "UIAT-SALIENT-DESCRIPTOR-SPECIFY-GUTS-2-MULTIPLE", 1, 0, false);
        declareFunction("uiat_salient_descriptor_handle_specify_guts_result", "UIAT-SALIENT-DESCRIPTOR-HANDLE-SPECIFY-GUTS-RESULT", 3, 0, false);
        declareFunction("uiat_salient_descriptor_get_subprompts", "UIAT-SALIENT-DESCRIPTOR-GET-SUBPROMPTS", 1, 0, false);
        declareFunction("uiat_salient_descriptor_get_justification", "UIAT-SALIENT-DESCRIPTOR-GET-JUSTIFICATION", 1, 0, false);
        declareFunction("uiat_salient_descriptor_child_invalidated", "UIAT-SALIENT-DESCRIPTOR-CHILD-INVALIDATED", 2, 0, false);
        declareFunction("uiat_salient_descriptor_child_rejected", "UIAT-SALIENT-DESCRIPTOR-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_sd_finalize", "UIAT-SD-FINALIZE", 1, 0, false);
        declareFunction("uiat_salient_descriptor_potentially_highlight_all_entities", "UIAT-SALIENT-DESCRIPTOR-POTENTIALLY-HIGHLIGHT-ALL-ENTITIES", 3, 0, false);
        declareFunction("uiat_salient_descriptor_do_get_next_prompt", "UIAT-SALIENT-DESCRIPTOR-DO-GET-NEXT-PROMPT", 1, 0, false);
        declareFunction("uiat_salient_descriptor_let_user_choose_promptP", "UIAT-SALIENT-DESCRIPTOR-LET-USER-CHOOSE-PROMPT?", 1, 0, false);
        declareFunction("uiat_salient_descriptor_has_unused_prompts_p", "UIAT-SALIENT-DESCRIPTOR-HAS-UNUSED-PROMPTS-P", 1, 0, false);
        declareFunction("ui_salient_descriptor_set_prompt", "UI-SALIENT-DESCRIPTOR-SET-PROMPT", 2, 0, false);
        declareFunction("ui_salient_descriptor_set_prompt_status", "UI-SALIENT-DESCRIPTOR-SET-PROMPT-STATUS", 2, 0, false);
        declareFunction("uiat_salient_descriptor_get_next_prompt", "UIAT-SALIENT-DESCRIPTOR-GET-NEXT-PROMPT", 1, 1, false);
        declareFunction("uiat_salient_descriptor_get_next_prompt_from_user", "UIAT-SALIENT-DESCRIPTOR-GET-NEXT-PROMPT-FROM-USER", 1, 0, false);
        declareFunction("show_salient_descriptor_tacticsP", "SHOW-SALIENT-DESCRIPTOR-TACTICS?", 0, 0, false);
        declareFunction("uiat_salient_descriptor_get_next_prompt_from_prompter", "UIAT-SALIENT-DESCRIPTOR-GET-NEXT-PROMPT-FROM-PROMPTER", 1, 0, false);
        declareFunction("uiat_salient_descriptor_current_tactic_string", "UIAT-SALIENT-DESCRIPTOR-CURRENT-TACTIC-STRING", 1, 0, false);
        declareFunction("cb_salient_descriptor_unknown_tactic_string", "CB-SALIENT-DESCRIPTOR-UNKNOWN-TACTIC-STRING", 1, 0, false);
        declareFunction("cb_salient_descriptor_tactic_string", "CB-SALIENT-DESCRIPTOR-TACTIC-STRING", 1, 0, false);
        declareFunction("uiat_salient_descriptor_term_phrase", "UIAT-SALIENT-DESCRIPTOR-TERM-PHRASE", 1, 0, false);
        declareFunction("uiat_salient_descriptor_constraint_okP", "UIAT-SALIENT-DESCRIPTOR-CONSTRAINT-OK?", 2, 0, false);
        declareFunction("uiat_salient_descriptor_handle_reply", "UIAT-SALIENT-DESCRIPTOR-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_salient_descriptor_add_assert_dependent", "UIAT-SALIENT-DESCRIPTOR-ADD-ASSERT-DEPENDENT", 2, 1, false);
        declareFunction("uiat_salient_descriptor_isas", "UIAT-SALIENT-DESCRIPTOR-ISAS", 1, 0, false);
        declareFunction("uiat_salient_descriptor_genls", "UIAT-SALIENT-DESCRIPTOR-GENLS", 1, 0, false);
        declareFunction("uiat_salient_descriptor_isa_cols", "UIAT-SALIENT-DESCRIPTOR-ISA-COLS", 1, 0, false);
        declareFunction("uiat_salient_descriptor_genl_cols", "UIAT-SALIENT-DESCRIPTOR-GENL-COLS", 1, 0, false);
        declareFunction("uiat_sd_inducedP", "UIAT-SD-INDUCED?", 1, 0, false);
        declareFunction("uiat_salient_descriptor_report_induced_rule", "UIAT-SALIENT-DESCRIPTOR-REPORT-INDUCED-RULE", 2, 0, false);
        declareFunction("ui_salient_descriptor_replace_examples", "UI-SALIENT-DESCRIPTOR-REPLACE-EXAMPLES", 2, 0, false);
        declareFunction("uiat_salient_descriptor_record_bad_examples", "UIAT-SALIENT-DESCRIPTOR-RECORD-BAD-EXAMPLES", 3, 0, false);
        declareFunction("uiat_salient_descriptor_get_bad_example_dict", "UIAT-SALIENT-DESCRIPTOR-GET-BAD-EXAMPLE-DICT", 1, 0, false);
        declareFunction("uiat_salient_descriptor_get_new_examples", "UIAT-SALIENT-DESCRIPTOR-GET-NEW-EXAMPLES", 2, 0, false);
        declareFunction("uiat_salient_descriptor_record_dont_know", "UIAT-SALIENT-DESCRIPTOR-RECORD-DONT-KNOW", 1, 0, false);
        declareFunction("uiat_salient_descriptor_maybe_assert_confirmed", "UIAT-SALIENT-DESCRIPTOR-MAYBE-ASSERT-CONFIRMED", 1, 0, false);
        declareFunction("uiat_salient_descriptor_default_yuck_message", "UIAT-SALIENT-DESCRIPTOR-DEFAULT-YUCK-MESSAGE", 1, 0, false);
        declareFunction("uiat_salient_descriptor_yuck_message_subprompts", "UIAT-SALIENT-DESCRIPTOR-YUCK-MESSAGE-SUBPROMPTS", 2, 0, false);
        declareFunction("uiat_salient_descriptor_yuck_message_justification", "UIAT-SALIENT-DESCRIPTOR-YUCK-MESSAGE-JUSTIFICATION", 2, 0, false);
        declareFunction("uiat_salient_descriptor_report_yucky_prompt", "UIAT-SALIENT-DESCRIPTOR-REPORT-YUCKY-PROMPT", 1, 1, false);
        declareFunction("uiat_salient_descriptor_disable_yucky_prompt", "UIAT-SALIENT-DESCRIPTOR-DISABLE-YUCKY-PROMPT", 1, 0, false);
        declareFunction("uiat_salient_descriptor_has_justification_p", "UIAT-SALIENT-DESCRIPTOR-HAS-JUSTIFICATION-P", 1, 0, false);
        declareFunction("uiat_sd_find_doomed_assertion", "UIAT-SD-FIND-DOOMED-ASSERTION", 1, 0, false);
        declareFunction("uiat_sd_prefer_assertionP", "UIAT-SD-PREFER-ASSERTION?", 2, 0, false);
        declareFunction("uiat_sd_find_sd_lit", "UIAT-SD-FIND-SD-LIT", 1, 0, false);
        declareFunction("uiat_salient_descriptor_is_term_permissibleP", "UIAT-SALIENT-DESCRIPTOR-IS-TERM-PERMISSIBLE?", 2, 0, false);
        declareFunction("uiat_salient_descriptor_maybe_set_followup", "UIAT-SALIENT-DESCRIPTOR-MAYBE-SET-FOLLOWUP", 2, 0, false);
        declareFunction("uiat_salient_descriptor_pop_tactic", "UIAT-SALIENT-DESCRIPTOR-POP-TACTIC", 1, 0, false);
        declareFunction("uiat_salient_descriptor_assert_choice", "UIAT-SALIENT-DESCRIPTOR-ASSERT-CHOICE", 2, 0, false);
        declareFunction("uia_act_new_fact_entry_tool", "UIA-ACT-NEW-FACT-ENTRY-TOOL", 4, 1, false);
        declareFunction("uiat_fact_entry_generate_request", "UIAT-FACT-ENTRY-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_fet_ensure_initialized", "UIAT-FET-ENSURE-INITIALIZED", 1, 0, false);
        declareFunction("uiat_fact_entry_handle_reply", "UIAT-FACT-ENTRY-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_fet_activate_next_topic", "UIAT-FET-ACTIVATE-NEXT-TOPIC", 1, 0, false);
        declareFunction("uiat_fet_get_current_term", "UIAT-FET-GET-CURRENT-TERM", 1, 0, false);
        declareFunction("uiat_fet_get_current_topic", "UIAT-FET-GET-CURRENT-TOPIC", 1, 0, false);
        declareFunction("uiat_fet_get_current_topics", "UIAT-FET-GET-CURRENT-TOPICS", 1, 0, false);
        declareFunction("uiat_fet_update_current_topics", "UIAT-FET-UPDATE-CURRENT-TOPICS", 2, 0, false);
        declareFunction("uiat_fet_get_completed_topics", "UIAT-FET-GET-COMPLETED-TOPICS", 1, 0, false);
        declareFunction("uiat_fet_update_completed_topics", "UIAT-FET-UPDATE-COMPLETED-TOPICS", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_tools_salient_descriptor_file() {
        deflexical("*UIAT-SD-FET-IS-AVAILABLE?*", T);
        defparameter("*UIAT-SD-DEFAULT-MESSAGE-TIMEOUT*", FIVE_INTEGER);
        defparameter("*UIAT-SD-EAGER?*", T);
        defparameter("*UIA-SD-BUFFER-SIZE*", EIGHT_INTEGER);
        defparameter("*UIAT-SALIENT-DESCRIPTOR-PROMPT-PICKER*", $CYC);
        defparameter("*SHOW-SALIENT-DESCRIPTOR-TACTICS?*", NIL);
        defparameter("*YUCKY-ADJECTIVE*", $$$inappropriate);
        return NIL;
    }

    public static final SubLObject setup_uia_tools_salient_descriptor_file() {
                uia_tool_declaration.declare_uia_tool($SALIENT_DESCRIPTOR, $list_alt1);
        memoization_state.note_memoized_function($sym59$UIAT_SALIENT_DESCRIPTOR_BAD_PROMPT__MEMOIZED);
        uia_tool_declaration.declare_uia_tool($FACT_ENTRY_TOOL, $list_alt171);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $SALIENT_DESCRIPTOR = makeKeyword("SALIENT-DESCRIPTOR");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ $NAME, makeString("Concept Refinement Interview"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-SALIENT-DESCRIPTOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-SALIENT-DESCRIPTOR-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-SALIENT-DESCRIPTOR-HANDLE-REPLY"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-SALIENT-DESCRIPTOR-CHILD-COMPLETED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-SALIENT-DESCRIPTOR-CHILD-INVALIDATED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-SALIENT-DESCRIPTOR-CHILD-REJECTED"), makeKeyword("FINALIZE-METHOD"), makeSymbol("UIAT-SD-FINALIZE"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycSalientDescriptor")) });



    public static final SubLSymbol $kw3$USE_RULES_ = makeKeyword("USE-RULES?");

    private static final SubLSymbol $GETTING_NEXT_PROMPT = makeKeyword("GETTING-NEXT-PROMPT");









    private static final SubLSymbol UI_SALIENT_DESCRIPTOR_GENERATE_PROMPTS = makeSymbol("UI-SALIENT-DESCRIPTOR-GENERATE-PROMPTS");

    static private final SubLString $str_alt10$Interview_Questions_for__A = makeString("Interview Questions for ~A");












    static private final SubLString $str_alt18$Explore_possibilities_for_adding_ = makeString("Explore possibilities for adding knowledge related to ");

    private static final SubLSymbol $TERM_FACETS = makeKeyword("TERM-FACETS");



    private static final SubLSymbol $FACETS_TO_DO = makeKeyword("FACETS-TO-DO");

    private static final SubLSymbol $PROMPT_STATUS = makeKeyword("PROMPT-STATUS");

    private static final SubLSymbol $UNTRIED = makeKeyword("UNTRIED");

    private static final SubLSymbol $DISPLAY_FACETS = makeKeyword("DISPLAY-FACETS");

    private static final SubLSymbol $ASK_USER = makeKeyword("ASK-USER");

    private static final SubLSymbol $LET_USER_CHOOSE_PROMPT = makeKeyword("LET-USER-CHOOSE-PROMPT");



    static private final SubLList $list_alt29 = list(makeSymbol("PHRASE"));

    private static final SubLSymbol $FACT_ENTRY_TOOL_TOPICS = makeKeyword("FACT-ENTRY-TOOL-TOPICS");

    private static final SubLSymbol $DIRTY = makeKeyword("DIRTY");



    static private final SubLSymbol $sym33$UIAT_SALIENT_DESCRIPTOR_IS_TERM_PERMISSIBLE_ = makeSymbol("UIAT-SALIENT-DESCRIPTOR-IS-TERM-PERMISSIBLE?");



    static private final SubLString $str_alt35$Getting_specialized_dimensions_fo = makeString("Getting specialized dimensions for ~A");

    private static final SubLSymbol UIAT_SALIENT_DESCRIPTOR_GET_TERM_FACETS = makeSymbol("UIAT-SALIENT-DESCRIPTOR-GET-TERM-FACETS");

    static private final SubLList $list_alt37 = cons(makeSymbol("THIS-FACET"), makeSymbol("REMAINING-FACETS"));



    static private final SubLString $str_alt39$You_are_now_done_refining_ = makeString("You are now done refining ");

    static private final SubLString $str_alt40$_ = makeString(".");

    private static final SubLSymbol $SORTA = makeKeyword("SORTA");

    static private final SubLString $str_alt42$You_are_now_sort_of_done_refining = makeString("You are now sort of done refining ");

    static private final SubLString $str_alt43$Couldn_t_think_of_any_questions_t = makeString("Couldn't think of any questions to ask about ~S.");

    public static final SubLSymbol $kw44$ASK_AGAIN_ = makeKeyword("ASK-AGAIN?");

    private static final SubLSymbol $NON_PROMPT = makeKeyword("NON-PROMPT");





    static private final SubLString $str_alt48$This_is_invalid__ = makeString("This is invalid: ");

    static private final SubLString $str_alt49$_ = makeString(" ");

    static private final SubLString $str_alt50$I_know_this_to_be_false__ = makeString("I know this to be false: ");

    static private final SubLString $str_alt51$I_am_no_longer_justified_in_askin = makeString("I am no longer justified in asking this: ");





    static private final SubLString $str_alt54$I_already_know_ = makeString("I already know ");



    public static final SubLSymbol $kw56$SINGLE_ENTRY_ = makeKeyword("SINGLE-ENTRY?");

    private static final SubLSymbol $DISPLAY_PROMPT = makeKeyword("DISPLAY-PROMPT");

    static private final SubLString $str_alt58$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLSymbol $sym59$UIAT_SALIENT_DESCRIPTOR_BAD_PROMPT__MEMOIZED = makeSymbol("UIAT-SALIENT-DESCRIPTOR-BAD-PROMPT?-MEMOIZED");

    public static final SubLSymbol $kw60$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");





    private static final SubLSymbol $MY_RESULT_WILL_BE = makeKeyword("MY-RESULT-WILL-BE");

    private static final SubLSymbol $FOLLOW_UP = makeKeyword("FOLLOW-UP");

    private static final SubLSymbol $CONFIRMED_SENTENCE = makeKeyword("CONFIRMED-SENTENCE");

    private static final SubLSymbol $CONCEPT_DISAMBIGUATOR = makeKeyword("CONCEPT-DISAMBIGUATOR");

    private static final SubLSymbol $CONCEPT_IN_SENTENCE_DISAMBIGUATOR = makeKeyword("CONCEPT-IN-SENTENCE-DISAMBIGUATOR");

    private static final SubLSymbol $YES_NO_QUESTION = makeKeyword("YES-NO-QUESTION");





    private static final SubLSymbol $DENIED = makeKeyword("DENIED");



    private static final SubLSymbol $DONT_KNOW = makeKeyword("DONT-KNOW");

    private static final SubLSymbol $ASSERTION_CREATOR = makeKeyword("ASSERTION-CREATOR");

    private static final SubLSymbol $RULE_CONSTRUCTOR = makeKeyword("RULE-CONSTRUCTOR");

    static private final SubLString $str_alt76$I_am_still_unable_to_answer_the_q = makeString("I am still unable to answer the question ~A");

    private static final SubLSymbol $FACT_ENTRY_TOOL = makeKeyword("FACT-ENTRY-TOOL");

    private static final SubLSymbol $PRECISE_CYCL_SENTENCE = makeKeyword("PRECISE-CYCL-SENTENCE");

    private static final SubLSymbol $FORKED_INTERACTIONS = makeKeyword("FORKED-INTERACTIONS");



    static private final SubLString $str_alt81$I_now_know_the_following___A = makeString("I now know the following: ~A");

    private static final SubLSymbol $NUM_TERMS_TO_SPECIFY = makeKeyword("NUM-TERMS-TO-SPECIFY");

    static private final SubLString $str_alt83$SPECIFIED_TERM = makeString("SPECIFIED-TERM");

    static private final SubLString $str_alt84$Sorry__for_some_reason_I_m_having = makeString("Sorry, for some reason I'm having difficulty believing this: ~A");







    private static final SubLSymbol $BAD_EXAMPLE_DICTIONARY = makeKeyword("BAD-EXAMPLE-DICTIONARY");

    static private final SubLString $str_alt89$Getting_prompt_for__A__Initial_ta = makeString("Getting prompt for ~A. Initial tactic: ~A");

    static private final SubLString $str_alt90$Getting_interview_questions_for__ = makeString("Getting interview questions for ~A.");

    static private final SubLString $str_alt91$__Initial_tactic___A____ = makeString(" (Initial tactic: ~A...)");

    private static final SubLSymbol UIAT_SALIENT_DESCRIPTOR_DO_GET_NEXT_PROMPT = makeSymbol("UIAT-SALIENT-DESCRIPTOR-DO-GET-NEXT-PROMPT");

    static private final SubLString $$$Unknown = makeString("Unknown");

    static private final SubLString $$$the_rule = makeString("the rule");

    static private final SubLList $list_alt95 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("TEMP-PLIST"));





    private static final SubLSymbol $END_INTERVIEW = makeKeyword("END-INTERVIEW");

    private static final SubLSymbol $COULDNT_PROCESS = makeKeyword("COULDNT-PROCESS");

    static private final SubLString $str_alt100$Sorry__for_some_reason_I_couldn_t = makeString("Sorry, for some reason I couldn't process your answer.");



    static private final SubLList $list_alt102 = list(makeSymbol("&KEY"), makeSymbol("ASSERT-SENTENCE"));

    static private final SubLList $list_alt103 = list(makeKeyword("ASSERT-SENTENCE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    static private final SubLString $str_alt106$Thinking_of_follow_up_question_ = makeString("Thinking of follow-up question.");

    private static final SubLSymbol UIAT_SALIENT_DESCRIPTOR_MAYBE_SET_FOLLOWUP = makeSymbol("UIAT-SALIENT-DESCRIPTOR-MAYBE-SET-FOLLOWUP");

    private static final SubLSymbol $GKE_SUBMIT = makeKeyword("GKE-SUBMIT");

    static private final SubLList $list_alt109 = list(makeSymbol("&KEY"), makeSymbol("FORMULA"));

    static private final SubLList $list_alt110 = list(makeKeyword("FORMULA"));



    private static final SubLSymbol $ACCEPTED_EXAMPLES = makeKeyword("ACCEPTED-EXAMPLES");

    static private final SubLList $list_alt113 = list(makeSymbol("&KEY"), makeSymbol("ACCEPTED-EXAMPLES"));

    static private final SubLList $list_alt114 = list(makeKeyword("ACCEPTED-EXAMPLES"));

    private static final SubLSymbol $ASSERT_CHOICES = makeKeyword("ASSERT-CHOICES");

    static private final SubLList $list_alt116 = list(makeSymbol("&KEY"), makeSymbol("ACCEPTED-CHOICES"));

    static private final SubLList $list_alt117 = list(makeKeyword("ACCEPTED-CHOICES"));

    private static final SubLSymbol $ACCEPTED_CHOICES = makeKeyword("ACCEPTED-CHOICES");

    static private final SubLList $list_alt119 = list(makeSymbol("&KEY"), makeSymbol("PHRASES"));

    static private final SubLList $list_alt120 = list(makeKeyword("PHRASES"));



    private static final SubLSymbol $SPECIFIED_TERM = makeKeyword("SPECIFIED-TERM");

    private static final SubLSymbol $SENTENCE_FORCE = makeKeyword("SENTENCE-FORCE");



    private static final SubLSymbol $MULTI_CONCEPT_IN_SENTENCE_DISAMBIGUATOR = makeKeyword("MULTI-CONCEPT-IN-SENTENCE-DISAMBIGUATOR");

    static private final SubLList $list_alt126 = list(makeSymbol("&KEY"), makeSymbol("PHRASES"), makeSymbol("TERMS"));

    static private final SubLList $list_alt127 = list(makeKeyword("PHRASES"), makeKeyword("TERMS"));



    private static final SubLSymbol $SKIP_TACTIC = makeKeyword("SKIP-TACTIC");

    private static final SubLSymbol $NEW_RULE = makeKeyword("NEW-RULE");

    private static final SubLSymbol $REPLACE_EXAMPLES = makeKeyword("REPLACE-EXAMPLES");

    static private final SubLList $list_alt132 = list(makeSymbol("&KEY"), makeSymbol("NEW-EXAMPLE-NUMS"));

    static private final SubLList $list_alt133 = list(makeKeyword("NEW-EXAMPLE-NUMS"));

    private static final SubLSymbol $NEW_EXAMPLE_NUMS = makeKeyword("NEW-EXAMPLE-NUMS");

    private static final SubLSymbol $YUCK_RESULT = makeKeyword("YUCK-RESULT");

    private static final SubLSymbol $YUCK = makeKeyword("YUCK");

    static private final SubLList $list_alt136 = list(makeSymbol("&KEY"), makeSymbol("REPORT?"), makeSymbol("SMITE?"), makeSymbol("MESSAGE"));

    static private final SubLList $list_alt137 = list(makeKeyword("REPORT?"), makeKeyword("SMITE?"), makeKeyword("MESSAGE"));

    public static final SubLSymbol $kw138$REPORT_ = makeKeyword("REPORT?");

    public static final SubLSymbol $kw139$SMITE_ = makeKeyword("SMITE?");



    private static final SubLSymbol $SKIP_PROMPT = makeKeyword("SKIP-PROMPT");

    private static final SubLSymbol $CHOOSE_NEW_PROMPT = makeKeyword("CHOOSE-NEW-PROMPT");

    private static final SubLSymbol $CHOOSE_PROMPT = makeKeyword("CHOOSE-PROMPT");

    static private final SubLList $list_alt144 = list(makeSymbol("&KEY"), makeSymbol("SKIP-ALL?"), makeSymbol("CHOICE"));

    static private final SubLList $list_alt145 = list(makeKeyword("SKIP-ALL?"), makeKeyword("CHOICE"));

    public static final SubLSymbol $kw146$SKIP_ALL_ = makeKeyword("SKIP-ALL?");



    static private final SubLString $str_alt148$Sorry__you_must_choose_a_question = makeString("Sorry, you must choose a question or skip them all.");

    private static final SubLSymbol $SKIP_ALL_FACETS = makeKeyword("SKIP-ALL-FACETS");

    private static final SubLSymbol $SET_FACETS = makeKeyword("SET-FACETS");

    static private final SubLList $list_alt151 = list(makeSymbol("&KEY"), makeSymbol("FACETS"));

    static private final SubLList $list_alt152 = list(makeKeyword("FACETS"));

    private static final SubLSymbol $FACETS = makeKeyword("FACETS");

    static private final SubLList $list_alt154 = list(constant_handles.reader_make_constant_shell(makeString("isa")), list($TEST, makeSymbol("EL-VAR?")), $FORT);



    static private final SubLList $list_alt156 = list(constant_handles.reader_make_constant_shell(makeString("genls")), list($TEST, makeSymbol("EL-VAR?")), $FORT);

    static private final SubLString $$$Induced_Salient_Descriptor_rule = makeString("Induced Salient Descriptor rule");

    static private final SubLString $str_alt158$While_refining_the_concept__S___S = makeString("While refining the concept ~S (~S), ~A entered the sentence~%~%    ~S~%     NL: ~A~%~%...which could have been prompted by the following rule:~%~% ~S~% NL: ~A~%~%Please consider adding this rule, or something similar, to our store of salient descriptor rules.");

    static private final SubLString $$$inappropriate = makeString("inappropriate");

    static private final SubLString $str_alt160$While_refining_the_concept__S__I_ = makeString("While refining the concept ~S, I was presented with the following prompt:~%~%");

    static private final SubLString $str_alt161$_____justified_by_the_following_j = makeString("~%...justified by the following justification:~%~%");

    static private final SubLString $str_alt162$__I_found_this_to_be__A__Please_i = makeString("~%I found this to be ~A. Please investigate.~%~% - ~A");

    static private final SubLString $str_alt163$_A_Salient_Descriptor_Subprompt = makeString("~A Salient Descriptor Subprompt");

    public static final SubLObject $$KEFacilitationPredicate = constant_handles.reader_make_constant_shell(makeString("KEFacilitationPredicate"));





    static private final SubLString $str_alt167$The_interpretation___A__is_being_ = makeString("The interpretation '~A' is being eliminated, because it does not pass the constraint: ~A~%");



    static private final SubLString $str_alt169$Popping_tactic_associated_with_pr = makeString("Popping tactic associated with prompt: ~%~A");

    private static final SubLSymbol $POP_TACTIC = makeKeyword("POP-TACTIC");

    static private final SubLList $list_alt171 = list(new SubLObject[]{ $NAME, makeString("Fact Entry Tool"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-FACT-ENTRY-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-FACT-ENTRY-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-FACT-ENTRY-HANDLE-REPLY"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-FACT-ENTRY-CHILD-COMPLETED"), makeKeyword("CHILD-INVALIDATED-METHOD"), makeSymbol("UIAT-FACT-ENTRY-CHILD-INVALIDATED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-FACT-ENTRY-CHILD-REJECTED") });





    public static final SubLSymbol $kw174$INITIALIZED_ = makeKeyword("INITIALIZED?");

    static private final SubLList $list_alt175 = list(makeSymbol("TERM"), makeSymbol("TOPICS"));

    private static final SubLSymbol $TOPICS_TO_DO = makeKeyword("TOPICS-TO-DO");

    private static final SubLSymbol $TOPICS_DONE = makeKeyword("TOPICS-DONE");



    // // Initializers
    @Override
    public void declareFunctions() {
        declare_uia_tools_salient_descriptor_file();
    }

    @Override
    public void initializeVariables() {
        init_uia_tools_salient_descriptor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_uia_tools_salient_descriptor_file();
    }
}

