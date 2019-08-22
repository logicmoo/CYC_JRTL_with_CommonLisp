/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-UIAT-ONTOLOGY-BROWSER
 *  source file: /cyc/top/cycl/cb-uiat-ontology-browser.lisp
 *  created:     2019/07/03 17:38:11
 */
public final class cb_uiat_ontology_browser extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uiat_ontology_browser() {
    }

    public static final SubLFile me = new cb_uiat_ontology_browser();


    // // Definitions
    public static final SubLObject cb_uiat_ontology_browser_examples(SubLObject interaction, SubLObject selectP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            cb_uia_macros.cb_uiat_document_expiration();
            cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                html_script_utilities.html_js_focus_window();
            }
            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input($str_alt0$cb_uiat_ontology_browser_handle_s, T, UNPROVIDED);
                        cb_user_interaction_agenda.cb_uia_add_interaction_watermark(interaction);
                        {
                            SubLObject examples_terms = user_interaction_agenda.ui_state_lookup(interaction, $GENERAL_EXAMPLES, UNPROVIDED);
                            SubLObject domain_examples_terms = user_interaction_agenda.ui_state_lookup(interaction, $DOMAIN_EXAMPLES, UNPROVIDED);
                            SubLObject header_string = user_interaction_agenda.ui_state_lookup(interaction, $HEADER_STRING, UNPROVIDED);
                            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                            SubLObject topic = uia_setup_state.uia_topic(v_agenda);
                            {
                                SubLObject _prev_bind_0_1 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                                SubLObject _prev_bind_1_2 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                                try {
                                    rkf_macros.$rkf_addressee$.bind(uia_macros.uia_addressee_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                                    rkf_macros.$rkf_speaker$.bind(uia_macros.uia_speaker_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                                    if (NIL != header_string) {
                                        html_utilities.html_princ(header_string);
                                        html_utilities.html_newline(ONE_INTEGER);
                                    }
                                    html_utilities.html_newline(ONE_INTEGER);
                                    html_utilities.html_princ($str_alt5$Enter_a_concept_from_which_to_sta);
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_text_input($str_alt6$term_input, $str_alt7$, $int$40);
                                    html_utilities.html_indent(TWO_INTEGER);
                                    html_utilities.html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_newline(TWO_INTEGER);
                                    html_utilities.html_princ($str_alt10$Or_choose_a_starting_point_by_cli);
                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(ZERO_INTEGER);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(ZERO_INTEGER);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt11$95_);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject _prev_bind_0_4 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                    {
                                                        SubLObject reuseP = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        try {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject _prev_bind_0_5 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                                try {
                                                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                    {
                                                                        SubLObject new_or_reused = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject _prev_bind_0_6 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                            try {
                                                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                                {
                                                                                    SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_7 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                                        try {
                                                                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                                                                            {
                                                                                                final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                                                                                try {
                                                                                                    {
                                                                                                        SubLObject topic_string = uia_trampolines.uia_html_term_phrase_np(v_agenda, topic, UNPROVIDED, UNPROVIDED);
                                                                                                        SubLObject header_string_8 = cconcatenate($str_alt13$Starting_Points_related_to_, topic_string);
                                                                                                        cb_uia_ob_show_example_terms(interaction, domain_examples_terms, header_string_8, html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread));
                                                                                                    }
                                                                                                } finally {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                            html_utilities.html_newline(TWO_INTEGER);
                                                                                                            cb_uia_ob_show_example_terms(interaction, examples_terms, $$$General_Starting_Points, html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread));
                                                                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_7, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_6, thread);
                                                                            }
                                                                        }
                                                                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                        }
                                                                    }
                                                                } finally {
                                                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_5, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL == reuseP) {
                                                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                } finally {
                                    rkf_macros.$rkf_speaker$.rebind(_prev_bind_1_2, thread);
                                    rkf_macros.$rkf_addressee$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_uia_ob_show_example_terms(SubLObject interaction, SubLObject terms, SubLObject header_string, SubLObject bgcolor) {
        if (bgcolor == UNPROVIDED) {
            bgcolor = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != terms) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(FOUR_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(header_string);
                                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                while (NIL != terms) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (NIL != bgcolor) {
                        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(bgcolor);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject i = NIL;
                                for (i = ZERO_INTEGER; i.numL(FOUR_INTEGER); i = add(i, ONE_INTEGER)) {
                                    if (NIL != terms) {
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject examples_term = terms.first();
                                                    cb_uiat_ob_show_term(interaction, examples_term);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        terms = terms.rest();
                                    } else {
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } 
            }
            return NIL;
        }
    }

    /**
     * The user entered a new term, so make this into a submission for the
     * ontology browser as a starting point.
     */
    public static final SubLObject cb_uiat_ontology_browser_handle_selection(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_uia_obtain_agenda_from_watermark(args);
            SubLObject term_name = html_utilities.html_extract_input($str_alt6$term_input, args);
            SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $ONTOLOGY_BROWSER, $INTERPRET, list($TERM_NAME, term_name));
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_ob_indirect_genls_dom_id$ = makeSymbol("*CB-UIAT-OB-INDIRECT-GENLS-DOM-ID*");

    // deflexical
    private static final SubLSymbol $cb_uiat_ob_indirect_isas_dom_id$ = makeSymbol("*CB-UIAT-OB-INDIRECT-ISAS-DOM-ID*");

    // deflexical
    private static final SubLSymbol $cb_uiat_ob_indirect_specs_dom_id$ = makeSymbol("*CB-UIAT-OB-INDIRECT-SPECS-DOM-ID*");

    // deflexical
    private static final SubLSymbol $cb_uiat_ob_indirect_instances_dom_id$ = makeSymbol("*CB-UIAT-OB-INDIRECT-INSTANCES-DOM-ID*");

    // deflexical
    private static final SubLSymbol $cb_uiat_ob_relevant_connections_dom_id$ = makeSymbol("*CB-UIAT-OB-RELEVANT-CONNECTIONS-DOM-ID*");

    public static final SubLObject cb_uiat_render_dom_ids(SubLObject collectionP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
            html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup($str_alt28$text_css);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup($$$screen);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != collectionP) {
                        html_utilities.html_terpri(UNPROVIDED);
                        dhtml_macros.dhtml_dom_wrapper_preamble($cb_uiat_ob_indirect_genls_dom_id$.getGlobalValue());
                        dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                        html_utilities.html_markup($$$none);
                        dhtml_macros.dhtml_dom_attribute_postamble();
                        dhtml_macros.dhtml_dom_wrapper_postamble();
                        html_utilities.html_terpri(UNPROVIDED);
                        html_utilities.html_terpri(UNPROVIDED);
                        dhtml_macros.dhtml_dom_wrapper_preamble($cb_uiat_ob_indirect_specs_dom_id$.getGlobalValue());
                        dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                        html_utilities.html_markup($$$none);
                        dhtml_macros.dhtml_dom_attribute_postamble();
                        dhtml_macros.dhtml_dom_wrapper_postamble();
                        html_utilities.html_terpri(UNPROVIDED);
                    }
                    html_utilities.html_terpri(UNPROVIDED);
                    dhtml_macros.dhtml_dom_wrapper_preamble($cb_uiat_ob_indirect_isas_dom_id$.getGlobalValue());
                    dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                    html_utilities.html_markup($$$none);
                    dhtml_macros.dhtml_dom_attribute_postamble();
                    dhtml_macros.dhtml_dom_wrapper_postamble();
                    html_utilities.html_terpri(UNPROVIDED);
                    html_utilities.html_terpri(UNPROVIDED);
                    dhtml_macros.dhtml_dom_wrapper_preamble($cb_uiat_ob_indirect_instances_dom_id$.getGlobalValue());
                    dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                    html_utilities.html_markup($$$none);
                    dhtml_macros.dhtml_dom_attribute_postamble();
                    dhtml_macros.dhtml_dom_wrapper_postamble();
                    html_utilities.html_terpri(UNPROVIDED);
                    html_utilities.html_terpri(UNPROVIDED);
                    dhtml_macros.dhtml_dom_wrapper_preamble($cb_uiat_ob_relevant_connections_dom_id$.getGlobalValue());
                    dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                    html_utilities.html_markup($$$none);
                    dhtml_macros.dhtml_dom_attribute_postamble();
                    dhtml_macros.dhtml_dom_wrapper_postamble();
                    html_utilities.html_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
            html_utilities.html_terpri(UNPROVIDED);
            return collectionP;
        }
    }

    public static final SubLObject cb_uiat_ontology_browser_show(SubLObject interaction, SubLObject v_term, SubLObject selectP, SubLObject highlight) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_interaction_mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
                SubLObject collectionP = fort_types_interface.collectionP(v_term);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                    html_script_utilities.html_js_focus_window();
                }
                cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                cb_uiat_render_dom_ids(collectionP);
                {
                    SubLObject default_bg = cb_uiat_ob_background($DEFAULT);
                    SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input($str_alt32$cb_uia_ontology_browser_handler, T, UNPROVIDED);
                            cb_user_interaction_agenda.cb_uia_add_interaction_watermark(interaction);
                            html_utilities.html_hidden_input($$$term, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, v_term), UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(ZERO_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(TWO_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != default_bg) {
                                html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(default_bg);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt34$100_);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_uiat_ob_show_toolbar_row(interaction, v_term, collectionP, selectP, domain_interaction_mt);
                                    cb_uiat_ob_show_superior_row(interaction, v_term, collectionP, domain_interaction_mt);
                                    cb_uiat_ob_show_parent_row(interaction, v_term, collectionP, domain_interaction_mt);
                                    cb_uiat_ob_show_self_row(interaction, v_term, collectionP, selectP, highlight, domain_interaction_mt);
                                    cb_uiat_ob_show_children_row(interaction, v_term, collectionP, domain_interaction_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    cb_uiat_ob_show_footer(interaction);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_ontology_browser_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_uia_obtain_agenda_from_watermark(args);
            SubLObject encoded_term_name = html_utilities.html_extract_input($$$term, args);
            SubLObject v_term = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, encoded_term_name);
            SubLObject action = html_utilities.html_extract_input($$$action, args);
            if (NIL != html_utilities.html_extract_input($str_alt36$create_spec_button, args)) {
                action = $str_alt37$CREATE_SPEC;
            } else
                if (NIL != html_utilities.html_extract_input($str_alt38$create_instance_button, args)) {
                    action = $str_alt39$CREATE_INSTANCE;
                }

            {
                SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $ONTOLOGY_BROWSER, $OTHER, list($TERM, v_term, $REQUESTED_ACTION, action));
                return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            }
        }
    }

    public static final SubLObject cb_uiat_ob_show_toolbar_row(SubLObject interaction, SubLObject v_term, SubLObject collectionP, SubLObject selectP, SubLObject domain_interaction_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject bgcolor = cb_uiat_ob_background($TOOLBAR);
                        SubLObject colspan = (NIL != collectionP) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (NIL != colspan) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(colspan);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != bgcolor) {
                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(bgcolor);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt34$100_);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_uiat_ob_show_toolbar(interaction, v_term, selectP, domain_interaction_mt);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_ob_show_toolbar(SubLObject interaction, SubLObject v_term, SubLObject selectP, SubLObject domain_interaction_mt) {
        cb_utilities.cb_link($UIA_ONTOLOGY_BROWSER_RESTART, interaction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_indent(UNPROVIDED);
        html_utilities.html_indent(TWO_INTEGER);
        cb_uiat_ob_show_help_button(interaction);
        return NIL;
    }

    public static final SubLObject cb_uiat_ob_show_help_button(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup($str_alt46$_Help);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_princ($str_alt47$_Scroll_to_Help_Text_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_ob_show_superior_row(SubLObject interaction, SubLObject v_term, SubLObject collectionP, SubLObject domain_interaction_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != collectionP) {
                        {
                            SubLObject bgcolor = cb_uiat_ob_background($INDIRECT_GENLS);
                            SubLObject object_id = $cb_uiat_ob_indirect_genls_dom_id$.getGlobalValue();
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt49$50_);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str_alt7$);
                                    cb_uiat_ob_show_indirect_genls_title();
                                    dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                    if (NIL != object_id) {
                                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(object_id);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_uiat_ob_show_indirect_genls(interaction, v_term, domain_interaction_mt);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                    {
                        SubLObject bgcolor = cb_uiat_ob_background($INDIRECT_ISAS);
                        SubLObject object_id = $cb_uiat_ob_indirect_isas_dom_id$.getGlobalValue();
                        SubLObject colspan = (NIL != collectionP) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
                        SubLObject width = (NIL != collectionP) ? ((SubLObject) ($str_alt49$50_)) : $str_alt34$100_;
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (NIL != colspan) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(colspan);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != bgcolor) {
                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(bgcolor);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != width) {
                            html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(width);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str_alt7$);
                                cb_uiat_ob_show_indirect_isas_title();
                                dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                if (NIL != object_id) {
                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(object_id);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_uiat_ob_show_indirect_isas(interaction, v_term, domain_interaction_mt);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_ob_show_indirect_isas_title() {
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$More_Abstract_Categories);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_indent(TWO_INTEGER);
        return NIL;
    }

    public static final SubLObject cb_uiat_ob_show_indirect_isas(SubLObject interaction, SubLObject v_term, SubLObject domain_interaction_mt) {
        {
            SubLObject indirect_isas = cb_uiat_ob_sort_remote_generalizations(cb_uiat_ob_remote_isa(v_term, domain_interaction_mt), interaction);
            cb_uiat_ob_show_terms(interaction, indirect_isas);
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_ob_show_indirect_genls_title() {
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($$$More_General_Types);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_indent(TWO_INTEGER);
        return NIL;
    }

    public static final SubLObject cb_uiat_ob_show_indirect_genls(SubLObject interaction, SubLObject v_term, SubLObject domain_interaction_mt) {
        {
            SubLObject indirect_genls = cb_uiat_ob_sort_remote_generalizations(cb_uiat_ob_remote_genls(v_term, domain_interaction_mt), interaction);
            cb_uiat_ob_show_terms(interaction, indirect_genls);
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_ob_show_parent_row(SubLObject interaction, SubLObject v_term, SubLObject collectionP, SubLObject domain_interaction_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != collectionP) {
                        {
                            SubLObject bgcolor = cb_uiat_ob_background($DIRECT_GENLS);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt49$50_);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_uiat_ob_show_direct_genls(interaction, v_term, domain_interaction_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                    {
                        SubLObject bgcolor = cb_uiat_ob_background($DIRECT_ISAS);
                        SubLObject colspan = (NIL != collectionP) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
                        SubLObject width = (NIL != collectionP) ? ((SubLObject) ($str_alt49$50_)) : $str_alt34$100_;
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (NIL != colspan) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(colspan);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != bgcolor) {
                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(bgcolor);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != width) {
                            html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(width);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_uiat_ob_show_direct_isas(interaction, v_term, domain_interaction_mt);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_ob_show_direct_isas(SubLObject interaction, SubLObject v_term, SubLObject domain_interaction_mt) {
        {
            SubLObject direct_isas = cb_uiat_ob_sort_direct_generalizations(cb_uiat_ob_direct_isa(v_term, domain_interaction_mt), interaction);
            cb_uiat_ob_show_direct_isa_example_sentence(interaction, v_term, direct_isas.first());
            cb_uiat_ob_show_terms(interaction, direct_isas);
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_ob_show_direct_isa_example_sentence(SubLObject interaction, SubLObject v_term, SubLObject example_isa) {
        {
            SubLObject formula = list($$isa, v_term, example_isa);
            SubLObject sentence = cb_uiat_ob_example_sentence(interaction, formula, TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($$$Categories);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_princ($str_alt59$_e_g___);
            html_utilities.html_princ(sentence);
            html_utilities.html_princ($str_alt60$_);
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        return interaction;
    }

    public static final SubLObject cb_uiat_ob_show_direct_genls(SubLObject interaction, SubLObject v_term, SubLObject domain_interaction_mt) {
        {
            SubLObject direct_genls = cb_uiat_ob_sort_direct_generalizations(cb_uiat_ob_direct_genls(v_term, domain_interaction_mt), interaction);
            SubLObject example_genls = direct_genls.first();
            cb_uiat_ob_show_direct_genls_example_sentence(interaction, v_term, example_genls);
            cb_uiat_ob_show_terms(interaction, direct_genls);
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_ob_show_direct_genls_example_sentence(SubLObject interaction, SubLObject v_term, SubLObject example_genls) {
        {
            SubLObject formula = list($$genls, v_term, example_genls);
            SubLObject sentence = cb_uiat_ob_example_sentence(interaction, formula, TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($$$Types);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_princ($str_alt59$_e_g___);
            html_utilities.html_princ(sentence);
            html_utilities.html_princ($str_alt60$_);
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        return interaction;
    }

    public static final SubLObject cb_uiat_ob_show_self_row(SubLObject interaction, SubLObject v_term, SubLObject collectionP, SubLObject selectP, SubLObject highlight, SubLObject domain_interaction_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject bgcolor = cb_uiat_ob_background($TERM_SECTION);
                        SubLObject colspan = (NIL != collectionP) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (NIL != colspan) {
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(colspan);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($TOP));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != bgcolor) {
                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(bgcolor);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt34$100_);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_uiat_ob_show_term_section(interaction, v_term, domain_interaction_mt, selectP, highlight);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_ob_show_term_section(SubLObject interaction, SubLObject v_term, SubLObject domain_mt, SubLObject selectP, SubLObject highlight) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                SubLObject summary_sentence = user_interaction_agenda.ui_state_lookup(interaction, $SUMMARY_SENTENCE, UNPROVIDED);
                SubLObject alt_phrases = user_interaction_agenda.ui_state_lookup(interaction, $ALT_PHRASES, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup($str_alt66$90_);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt34$100_);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(FIVE_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_font_face$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($str_alt67$_arial__helvetica__courier_);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                        cb_uiat_ob_show_term(interaction, v_term);
                                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                if (NIL != string_utilities.non_empty_stringP(summary_sentence)) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(TWO_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    {
                                                                        SubLObject object_id = $str_alt68$summary_sentence;
                                                                        dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $$$Summary);
                                                                        dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                                                                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                                        if (NIL != object_id) {
                                                                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(object_id);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(summary_sentence);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                                if (NIL != alt_phrases) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt70$Alternative_phrases__);
                                                                    html_utilities.html_princ(alt_phrases);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(TWO_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                if (NIL != selectP) {
                                                                    html_utilities.html_indent(TWO_INTEGER);
                                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                    cb_utilities.cb_link($UIA_CONCEPT_FINDER_THROW, v_term, NIL, NIL, NIL, NIL);
                                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                    html_utilities.html_indent(UNPROVIDED);
                                                                }
                                                                cb_uiat_ontology_browser_show_select_menu(interaction, v_term);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uiat_ob_show_term_connections(interaction, v_term, domain_interaction_mt, selectP);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($BOTTOM));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uia_display_primitives.cb_uia_show_term_oe_link_image(v_term, $str_alt74$_OE_);
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                cb_utilities.cb_link($UIA_BLUE_CONCEPT_RECOGNIZER_EVENT, user_interaction_agenda.ui_agenda(interaction), $str_alt76$_Visualize_, list(v_term), ONE_INTEGER, $list_alt77);
                                                                if (NIL != highlight) {
                                                                    html_utilities.html_indent(TWO_INTEGER);
                                                                    {
                                                                        SubLObject pcase_var = highlight;
                                                                        if (pcase_var.eql($HIGH_LIGHTED)) {
                                                                            cb_utilities.cb_link($UIAEXT_NUSKETCH_UNHIGHLIGHT, v_term, format(NIL, $str_alt80$_Un_Highlight__A_in_nuSketch_, uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else
                                                                            if (pcase_var.eql($NOT_HIGH_LIGHTED)) {
                                                                                cb_utilities.cb_link($UIAEXT_NUSKETCH_HIGHLIGHT, v_term, format(NIL, $str_alt83$_Highlight__A_in_nuSketch_, uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            }

                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_ontology_browser_show_select_menu(SubLObject interaction, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_princ($str_alt84$Main_Window_Actions___);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_princ($str_alt85$There_may_be_a_slight_delay_befor);
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup($$$action);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            if (true) {
                html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ONE_INTEGER);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_utilities.html_markup(html_macros.$html_select_onchange$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt86$javascript_this_form_submit___);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt87$DO_NOTHING);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($str_alt88$___);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt89$ASSERTED_SENTENCES);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($$$See_All_Facts);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt91$CONCEPT_RELATOR);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($$$See_Related_Terms);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$INTERVIEW);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($$$Interview);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt95$ADD_SCRAP);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($$$Add_to_Scrapbook);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt97$COMMON_QUERIES);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($$$See_Common_Queries);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                    if ($TRUE == user_interaction_agenda.ui_state_lookup(interaction, $SME_TERM, UNPROVIDED)) {
                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt101$KILL_TERM);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ($$$Forget_This_Term);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt103$CREATE_SIMILAR);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($$$Create_Similar_Term);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                    if (NIL != fort_types_interface.collection_p(v_term)) {
                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt39$CREATE_INSTANCE);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ($$$Create_Instance);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                    }
                    if (NIL != fort_types_interface.collection_p(v_term)) {
                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt37$CREATE_SPEC);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ($$$Create_More_Specific_Type);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$LEXIFY);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($$$Add_Dictionary_Information);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$COMPARE);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ($$$Launch_Comparison);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_ob_show_term_connections(SubLObject interaction, SubLObject v_term, SubLObject domain_mt, SubLObject selectP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_relations = user_interaction_agenda.ui_state_lookup(interaction, $TERM_RELATIONS, UNPROVIDED);
                SubLObject object_id = $cb_uiat_ob_relevant_connections_dom_id$.getGlobalValue();
                if (NIL == term_relations) {
                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt112$No_relevant_relationships_);
                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    return interaction;
                }
                dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str_alt7$);
                {
                    SubLObject _prev_bind_0 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                    SubLObject _prev_bind_1 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                    try {
                        rkf_macros.$rkf_addressee$.bind(uia_macros.uia_addressee_for_utterance_type(user_interaction_agenda.ui_agenda(interaction), $CYC_TO_USER), thread);
                        rkf_macros.$rkf_speaker$.bind(uia_macros.uia_speaker_for_utterance_type(user_interaction_agenda.ui_agenda(interaction), $CYC_TO_USER), thread);
                        html_utilities.html_princ($$$Relevant_Relationships);
                        html_utilities.html_indent(TWO_INTEGER);
                        dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        if (NIL != object_id) {
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(object_id);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(ZERO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = term_relations;
                                            SubLObject connection = NIL;
                                            for (connection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , connection = cdolist_list_var.first()) {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uiat_ob_show_example_sentence(interaction, connection);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        rkf_macros.$rkf_speaker$.rebind(_prev_bind_1, thread);
                        rkf_macros.$rkf_addressee$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_ob_show_children_row(SubLObject interaction, SubLObject v_term, SubLObject collectionP, SubLObject domain_interaction_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != collectionP) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject bgcolor = cb_uiat_ob_background($DIRECT_SPECS);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt49$50_);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_uiat_ob_show_specs(interaction, v_term, domain_interaction_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        {
                            SubLObject bgcolor = cb_uiat_ob_background($DIRECT_INSTANCES);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt49$50_);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_uiat_ob_show_instances(interaction, v_term, domain_interaction_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_ob_show_instances(SubLObject interaction, SubLObject v_term, SubLObject domain_interaction_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject direct_instances_set = cb_uiat_ob_direct_instances_set(interaction, v_term);
                SubLObject direct_instances = set.set_element_list(direct_instances_set);
                SubLObject indirect_instances = cb_uiat_ob_sample_instances(v_term, domain_interaction_mt, direct_instances_set);
                SubLObject visible_instances = (NIL != list_utilities.lengthL(indirect_instances, $uia_ontology_browser_sampling_cutoff$.getDynamicValue(thread), UNPROVIDED)) ? ((SubLObject) (nconc(direct_instances, indirect_instances))) : direct_instances;
                SubLObject hidden_instances = (NIL != list_utilities.lengthL(indirect_instances, $uia_ontology_browser_sampling_cutoff$.getDynamicValue(thread), UNPROVIDED)) ? ((SubLObject) (NIL)) : indirect_instances;
                SubLObject sorted_instances = cb_uiat_ob_sort_direct_instances(visible_instances, interaction);
                SubLObject example_instance = sorted_instances.first();
                if (NIL == sorted_instances) {
                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                    html_utilities.html_princ($$$No_relevant_instances);
                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                } else {
                    cb_uiat_ob_show_direct_instance_example_sentence(interaction, v_term, example_instance);
                    {
                        SubLObject cdolist_list_var = sorted_instances;
                        SubLObject direct_instance = NIL;
                        for (direct_instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direct_instance = cdolist_list_var.first()) {
                            html_utilities.html_newline(UNPROVIDED);
                            cb_uiat_ob_show_term(interaction, direct_instance);
                        }
                    }
                    if (NIL != hidden_instances) {
                        html_utilities.html_newline(UNPROVIDED);
                        {
                            SubLObject object_id = $cb_uiat_ob_indirect_instances_dom_id$.getGlobalValue();
                            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str_alt7$);
                            cb_uiat_ob_show_indirect_instances_title(v_term);
                            dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            if (NIL != object_id) {
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(object_id);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject cdolist_list_var = hidden_instances;
                                        SubLObject instance = NIL;
                                        for (instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance = cdolist_list_var.first()) {
                                            html_utilities.html_newline(UNPROVIDED);
                                            cb_uiat_ob_show_term(interaction, instance);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                }
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_submit_input($$$Add_an_Instance, $str_alt38$create_instance_button, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_ob_show_direct_instance_example_sentence(SubLObject interaction, SubLObject v_term, SubLObject example_instance) {
        {
            SubLObject formula = list($$isa, example_instance, v_term);
            SubLObject sentence = cb_uiat_ob_example_sentence(interaction, formula, TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($$$Instances);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_princ($str_alt59$_e_g___);
            html_utilities.html_princ(sentence);
            html_utilities.html_princ($str_alt60$_);
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        return interaction;
    }

    public static final SubLObject cb_uiat_ob_show_specs(SubLObject interaction, SubLObject v_term, SubLObject domain_interaction_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject direct_specs_set = cb_uiat_ob_direct_specs_set(interaction, v_term);
                SubLObject direct_specs = set.set_element_list(direct_specs_set);
                SubLObject indirect_specs = cb_uiat_ob_sample_specs(v_term, domain_interaction_mt, direct_specs_set);
                SubLObject visible_specs = (NIL != list_utilities.lengthL(indirect_specs, $uia_ontology_browser_sampling_cutoff$.getDynamicValue(thread), UNPROVIDED)) ? ((SubLObject) (nconc(direct_specs, indirect_specs))) : direct_specs;
                SubLObject hidden_specs = (NIL != list_utilities.lengthL(indirect_specs, $uia_ontology_browser_sampling_cutoff$.getDynamicValue(thread), UNPROVIDED)) ? ((SubLObject) (NIL)) : indirect_specs;
                SubLObject sorted_specs = cb_uiat_ob_sort_direct_specs(visible_specs, interaction);
                SubLObject example_spec = sorted_specs.first();
                if (NIL == example_spec) {
                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                    html_utilities.html_princ($$$No_relevant_more_specific_types);
                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                } else {
                    cb_uiat_ob_show_specs_example_sentence(interaction, v_term, example_spec);
                    {
                        SubLObject cdolist_list_var = sorted_specs;
                        SubLObject spec = NIL;
                        for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                            html_utilities.html_newline(UNPROVIDED);
                            cb_uiat_ob_show_term(interaction, spec);
                        }
                    }
                    if (NIL != hidden_specs) {
                        html_utilities.html_newline(UNPROVIDED);
                        {
                            SubLObject object_id = $cb_uiat_ob_indirect_specs_dom_id$.getGlobalValue();
                            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str_alt7$);
                            cb_uiat_ob_show_indirect_specs_title(v_term);
                            dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            if (NIL != object_id) {
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(object_id);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject cdolist_list_var = hidden_specs;
                                        SubLObject spec = NIL;
                                        for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                                            html_utilities.html_newline(UNPROVIDED);
                                            cb_uiat_ob_show_term(interaction, spec);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                }
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_submit_input($$$Add_a_More_Specific_Type, $str_alt36$create_spec_button, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_ob_show_specs_example_sentence(SubLObject interaction, SubLObject v_term, SubLObject example_specs) {
        {
            SubLObject formula = list($$genls, example_specs, v_term);
            SubLObject sentence = cb_uiat_ob_example_sentence(interaction, formula, TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($$$More_Specific_Types);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_princ($str_alt59$_e_g___);
            html_utilities.html_princ(sentence);
            html_utilities.html_princ($str_alt60$_);
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        return interaction;
    }

    public static final SubLObject cb_uiat_ob_show_indirect_instances_title(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($$$More_Instances);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            {
                SubLObject estimate = cb_uiat_ob_estimate_all_fort_instances(v_term);
                html_utilities.html_indent(TWO_INTEGER);
                if (estimate.numG($uia_ontology_browser_sampling_cutoff$.getDynamicValue(thread))) {
                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt123$_A_total__sampled, estimate);
                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                }
            }
            return v_term;
        }
    }

    // defparameter
    private static final SubLSymbol $uia_ontology_browser_sampling_cutoff$ = makeSymbol("*UIA-ONTOLOGY-BROWSER-SAMPLING-CUTOFF*");

    public static final SubLObject cb_uiat_ob_show_indirect_specs_title(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($$$Other_More_Specific_Types);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            {
                SubLObject estimate = cb_uiat_ob_estimate_all_specs(v_term);
                html_utilities.html_indent(TWO_INTEGER);
                if (estimate.numG($uia_ontology_browser_sampling_cutoff$.getDynamicValue(thread))) {
                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt123$_A_total__sampled, estimate);
                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                }
            }
            return v_term;
        }
    }

    public static final SubLObject cb_uiat_ob_show_footer(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($$$Help);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            {
                SubLObject help_text = user_interaction_agenda.ui_state_lookup(interaction, $HELP_TEXT, UNPROVIDED);
                html_utilities.html_markup(help_text);
            }
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_ob_background_colors$ = makeSymbol("*CB-UIAT-OB-BACKGROUND-COLORS*");

    public static final SubLObject cb_uiat_ob_background(SubLObject mode) {
        return second(assoc(mode, $cb_uiat_ob_background_colors$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_uiat_ob_link_marker(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == fort_types_interface.collectionP(v_term)) {
                {
                    SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($UIAT_YL_SDI);
                    SubLObject align = $TOP;
                    SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($UIAT_YL_SDI);
                    SubLObject border = ZERO_INTEGER;
                    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(image_src);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != alt) {
                        html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(alt);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (NIL != align) {
                        html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align(align));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (NIL != border) {
                        html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(border);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                }
            } else
                if (NIL != cb_uiat_ob_leaf_p(v_term)) {
                    {
                        SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($UIAT_GR_SDI);
                        SubLObject align = $TOP;
                        SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($UIAT_GR_SDI);
                        SubLObject border = ZERO_INTEGER;
                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(image_src);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != alt) {
                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(alt);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != align) {
                            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align(align));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != border) {
                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(border);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                    }
                } else {
                    {
                        SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($UIAT_PI_SDI);
                        SubLObject align = $TOP;
                        SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($UIAT_PI_SDI);
                        SubLObject border = ZERO_INTEGER;
                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(image_src);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != alt) {
                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(alt);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != align) {
                            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align(align));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != border) {
                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(border);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                    }
                }

            return NIL;
        }
    }

    public static final SubLObject cb_uiat_ob_show_term(SubLObject interaction, SubLObject v_term) {
        cb_uia_display_primitives.cb_uia_show_term_in_interaction(v_term, interaction, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_uiat_ob_show_terms(SubLObject interaction, SubLObject terms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject _prev_bind_0 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    {
                        SubLObject reuseP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        try {
                            thread.resetMultipleValues();
                            {
                                SubLObject _prev_bind_0_60 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                    {
                                        SubLObject new_or_reused = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject _prev_bind_0_61 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                {
                                                    SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                    {
                                                        SubLObject _prev_bind_0_62 = memoization_state.$memoization_state$.currentBinding(thread);
                                                        try {
                                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                                            {
                                                                final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                                                try {
                                                                    {
                                                                        SubLObject cdolist_list_var = terms;
                                                                        SubLObject v_term = NIL;
                                                                        for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                            cb_uiat_ob_show_term(interaction, v_term);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_63 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_63, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_62, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_61, thread);
                                            }
                                        }
                                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                        }
                                    }
                                } finally {
                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_60, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL == reuseP) {
                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_64, thread);
                                }
                            }
                        }
                    }
                } finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_ontology_browser_start(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_uia_obtain_agenda_from_watermark(args);
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject v_term = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
            destructuring_bind_must_listp(current, datum, $list_alt133);
            current = current.rest();
            if (NIL == current) {
                if (NIL == v_agenda) {
                    v_agenda = cb_user_interaction_agenda.cb_current_uia();
                }
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $ONTOLOGY_BROWSER, $LAUNCH, NIL != v_term ? ((SubLObject) (list($TERM, v_term))) : NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt133);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_ontology_browser_start(SubLObject v_term, SubLObject domain_mt, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = (true) ? ((SubLObject) (cb_utilities.cb_frame_name($ONTOLOGY_BROWSER))) : NIL;
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(v_term);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt136$cb_uiat_ontology_browser_start, arglist);
                }
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt137$window_open__);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(v_term);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt136$cb_uiat_ontology_browser_start, arglist);
                }
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt138$__);
                if (true) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt139$__A_, $ONTOLOGY_BROWSER);
                } else {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$null);
                }
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt141$___A____, $str_alt7$);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt142$return_false_);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != linktext) {
                            cb_uia_display_primitives.cb_uia_princ_tool_linktext(linktext);
                        } else {
                            cb_uiat_ob_link_marker(v_term);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @unknown this should be replaced with something that will use encoded args, but we can't
    do that until the generation code is capable of encoding arguments
     */
    public static final SubLObject cb_uiat_ontology_browser_start_unencoded(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject term_num = read_from_string(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject v_term = misc_kb_utilities.term_from_id(term_num);
            if (NIL == v_agenda) {
                v_agenda = cb_user_interaction_agenda.cb_current_uia();
            }
            {
                SubLObject plist = nconc($list_alt145, NIL != v_term ? ((SubLObject) (list($TERM, v_term))) : NIL);
                SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $ONTOLOGY_BROWSER, $LAUNCH, plist);
                return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            }
        }
    }

    public static final SubLObject cb_uiat_ontology_browser_focused_start_unencoded(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject term_num = read_from_string(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject v_term = misc_kb_utilities.term_from_id(term_num);
            if (NIL == v_agenda) {
                v_agenda = cb_user_interaction_agenda.cb_current_uia();
            }
            {
                SubLObject plist = $list_alt147;
                if (NIL != v_term) {
                    plist = putf(plist, $TERM, v_term);
                }
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $ONTOLOGY_BROWSER, $LAUNCH, plist);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            }
        }
    }

    public static final SubLObject cb_uiat_ontology_browser_restart(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt149);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $RESTART, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt149);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_ontology_browser_restart(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt153$cb_uiat_ontology_browser_restart, arglist);
                }
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext($str_alt154$_Go_to_Suggested_Starting_Points_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_ontology_browser_focus(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt156);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt156);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $FOCUS, list($TERM, v_term));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt156);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_ontology_browser_focus(SubLObject interaction, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, v_term);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt159$cb_uiat_ontology_browser_focus, arglist);
                }
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_uiat_ob_link_marker(v_term);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_ontology_browser_done(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt156);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt156);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, list($TERM, v_term));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt156);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_ontology_browser_done(SubLObject interaction, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject linktext = $str_alt164$_Done_;
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, v_term);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt165$cb_uiat_ontology_browser_done, arglist);
                }
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_ob_example_sentence(SubLObject interaction, SubLObject formula, SubLObject arg_to_skip) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            return uia_trampolines.uia_sentence_phrase(v_agenda, formula, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject cb_uiat_ob_show_example_sentence(SubLObject interaction, SubLObject formula) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            cb_uia_display_primitives.cb_uia_show_assertion(formula);
        }
        return interaction;
    }

    public static final SubLObject cb_uiat_ob_direct_isa(SubLObject v_term, SubLObject domain_mt) {
        return rkf_ontology_utilities.rkf_min_isa(v_term, domain_mt);
    }

    public static final SubLObject cb_uiat_ob_remote_isa(SubLObject v_term, SubLObject domain_mt) {
        {
            SubLObject direct_isa = cb_uiat_ob_direct_isa(v_term, domain_mt);
            SubLObject all_isa = rkf_ontology_utilities.rkf_all_isa(v_term, domain_mt);
            return set_difference(all_isa, direct_isa, symbol_function(EQUAL), UNPROVIDED);
        }
    }

    public static final SubLObject cb_uiat_ob_direct_genls(SubLObject v_term, SubLObject domain_mt) {
        return rkf_ontology_utilities.rkf_min_genls(v_term, domain_mt);
    }

    public static final SubLObject cb_uiat_ob_remote_genls(SubLObject v_term, SubLObject domain_mt) {
        {
            SubLObject direct_genls = cb_uiat_ob_direct_genls(v_term, domain_mt);
            SubLObject all_genls = delete(v_term, rkf_ontology_utilities.rkf_all_genls(v_term, domain_mt), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return set_difference(all_genls, direct_genls, symbol_function(EQUAL), UNPROVIDED);
        }
    }

    public static final SubLObject cb_uiat_ob_direct_instances(SubLObject interaction, SubLObject v_term, SubLObject domain_mt) {
        {
            SubLObject v_instances = rkf_ontology_utilities.rkf_instances(v_term, domain_mt);
            user_interaction_agenda.ui_state_update(interaction, $DIRECT_INSTANCES_SET, set_utilities.make_set_from_list(v_instances, UNPROVIDED));
            return v_instances;
        }
    }

    public static final SubLObject cb_uiat_ob_direct_instances_set(SubLObject interaction, SubLObject v_term) {
        if (NIL != user_interaction_agenda.ui_state_lookup(interaction, $DIRECT_INSTANCES_SET, UNPROVIDED)) {
            return user_interaction_agenda.ui_state_lookup(interaction, $DIRECT_INSTANCES_SET, UNPROVIDED);
        }
        {
            SubLObject domain_mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
            cb_uiat_ob_direct_instances(interaction, v_term, domain_mt);
        }
        return user_interaction_agenda.ui_state_lookup(interaction, $DIRECT_INSTANCES_SET, UNPROVIDED);
    }

    public static final SubLObject cb_uiat_ob_has_direct_instancesP(SubLObject interaction, SubLObject v_term) {
        {
            SubLObject instances_set = cb_uiat_ob_direct_instances_set(interaction, v_term);
            return plusp(set.set_size(instances_set));
        }
    }

    public static final SubLObject cb_uiat_ob_sample_instances(SubLObject v_term, SubLObject domain_mt, SubLObject direct_instance_set) {
        if (direct_instance_set == UNPROVIDED) {
            direct_instance_set = NIL;
        }
        {
            SubLObject known_instance_count = (NIL != direct_instance_set) ? ((SubLObject) (set.set_size(direct_instance_set))) : ZERO_INTEGER;
            SubLObject unfiltered_instances = delete_duplicates(isa.sample_leaf_instances(v_term, add($int$30, known_instance_count), domain_mt, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = unfiltered_instances;
            SubLObject instance = NIL;
            for (instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance = cdolist_list_var.first()) {
                if (!(((NIL != direct_instance_set) && (NIL != set.set_memberP(instance, direct_instance_set))) || (NIL != rkf_relevance_utilities.rkf_irrelevant_term(instance, domain_mt)))) {
                    result = cons(instance, result);
                }
            }
            return result;
        }
    }

    public static final SubLObject cb_uiat_ob_has_sample_instancesP(SubLObject v_term, SubLObject domain_mt) {
        return isa.sample_leaf_instances(v_term, ONE_INTEGER, domain_mt, UNPROVIDED);
    }

    public static final SubLObject cb_uiat_ob_direct_specs(SubLObject interaction, SubLObject v_term, SubLObject domain_mt) {
        {
            SubLObject specs = rkf_ontology_utilities.rkf_max_specs(v_term, domain_mt);
            user_interaction_agenda.ui_state_update(interaction, $DIRECT_SPECS_SET, set_utilities.make_set_from_list(specs, UNPROVIDED));
            return specs;
        }
    }

    public static final SubLObject cb_uiat_ob_direct_specs_set(SubLObject interaction, SubLObject v_term) {
        if (NIL != user_interaction_agenda.ui_state_lookup(interaction, $DIRECT_SPECS_SET, UNPROVIDED)) {
            return user_interaction_agenda.ui_state_lookup(interaction, $DIRECT_SPECS_SET, UNPROVIDED);
        }
        {
            SubLObject domain_mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
            SubLObject direct_specs = cb_uiat_ob_direct_specs(interaction, v_term, domain_mt);
        }
        return user_interaction_agenda.ui_state_lookup(interaction, $DIRECT_SPECS_SET, UNPROVIDED);
    }

    public static final SubLObject cb_uiat_ob_has_direct_specsP(SubLObject interaction, SubLObject v_term) {
        {
            SubLObject specs_set = cb_uiat_ob_direct_specs_set(interaction, v_term);
            return plusp(set.set_size(specs_set));
        }
    }

    public static final SubLObject cb_uiat_ob_sample_specs(SubLObject v_term, SubLObject domain_mt, SubLObject direct_specs) {
        if (direct_specs == UNPROVIDED) {
            direct_specs = NIL;
        }
        {
            SubLObject known_spec_count = (NIL != direct_specs) ? ((SubLObject) (set.set_size(direct_specs))) : ZERO_INTEGER;
            SubLObject unfiltered_specs = delete_duplicates(delete(v_term, genls.sample_leaf_specs(v_term, add($int$30, known_spec_count), domain_mt, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = unfiltered_specs;
            SubLObject spec = NIL;
            for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                if (!(((NIL != direct_specs) && (NIL != set.set_memberP(spec, direct_specs))) || (NIL != rkf_relevance_utilities.rkf_irrelevant_term(spec, domain_mt)))) {
                    result = cons(spec, result);
                }
            }
            return result;
        }
    }

    public static final SubLObject cb_uiat_ob_has_sample_specsP(SubLObject v_term, SubLObject domain_mt) {
        return delete(v_term, genls.sample_leaf_specs(v_term, TWO_INTEGER, domain_mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_uiat_ob_sort_direct_generalizations(SubLObject generalizations, SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject generation_interaction_mt = user_interaction_agenda.ui_generation_language_mt(interaction);
            SubLObject domain_interaction_mt = user_interaction_agenda.ui_generation_domain_mt(interaction);
            return uia_trampolines.uia_sort_terms(v_agenda, generalizations, generation_interaction_mt, domain_interaction_mt);
        }
    }

    public static final SubLObject cb_uiat_ob_sort_remote_generalizations(SubLObject generalizations, SubLObject interaction) {
        return Sort.sort(generalizations, symbol_function($sym171$_), symbol_function(GENERALITY_ESTIMATE));
    }

    public static final SubLObject cb_uiat_ob_sort_direct_specs(SubLObject specs, SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject generation_interaction_mt = user_interaction_agenda.ui_generation_language_mt(interaction);
            SubLObject domain_interaction_mt = user_interaction_agenda.ui_generation_domain_mt(interaction);
            specs = uia_trampolines.uia_sort_terms(v_agenda, specs, generation_interaction_mt, domain_interaction_mt);
            specs = list_utilities.stable_sort_via_test(specs, symbol_function(CB_UIAT_OB_NON_LEAF_P), UNPROVIDED);
            return specs;
        }
    }

    public static final SubLObject cb_uiat_ob_sort_sample_specs(SubLObject specs, SubLObject interaction) {
        return cb_uiat_ob_sort_leaves(specs, interaction);
    }

    public static final SubLObject cb_uiat_ob_sort_direct_instances(SubLObject v_instances, SubLObject interaction) {
        return cb_uiat_ob_sort_leaves(v_instances, interaction);
    }

    public static final SubLObject cb_uiat_ob_sort_sample_instances(SubLObject v_instances, SubLObject interaction) {
        return cb_uiat_ob_sort_leaves(v_instances, interaction);
    }

    public static final SubLObject cb_uiat_ob_sort_leaves(SubLObject leaves, SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject generation_interaction_mt = user_interaction_agenda.ui_generation_language_mt(interaction);
            SubLObject domain_interaction_mt = user_interaction_agenda.ui_generation_domain_mt(interaction);
            return uia_trampolines.uia_sort_terms(v_agenda, leaves, generation_interaction_mt, domain_interaction_mt);
        }
    }

    public static final SubLObject cb_uiat_ob_estimate_all_fort_instances(SubLObject v_term) {
        return cardinality_estimates.instance_cardinality(v_term);
    }

    public static final SubLObject cb_uiat_ob_estimate_all_specs(SubLObject v_term) {
        return cardinality_estimates.spec_cardinality(v_term);
    }

    public static final SubLObject cb_uiat_ob_leaf_p(SubLObject collection) {
        return numE(ZERO_INTEGER, cb_uiat_ob_estimate_all_specs(collection));
    }

    public static final SubLObject cb_uiat_ob_non_leaf_p(SubLObject collection) {
        return makeBoolean(NIL == cb_uiat_ob_leaf_p(collection));
    }

    public static final SubLObject declare_cb_uiat_ontology_browser_file() {
        declareFunction("cb_uiat_ontology_browser_examples", "CB-UIAT-ONTOLOGY-BROWSER-EXAMPLES", 2, 0, false);
        declareFunction("cb_uia_ob_show_example_terms", "CB-UIA-OB-SHOW-EXAMPLE-TERMS", 3, 1, false);
        declareFunction("cb_uiat_ontology_browser_handle_selection", "CB-UIAT-ONTOLOGY-BROWSER-HANDLE-SELECTION", 1, 0, false);
        declareFunction("cb_uiat_render_dom_ids", "CB-UIAT-RENDER-DOM-IDS", 1, 0, false);
        declareFunction("cb_uiat_ontology_browser_show", "CB-UIAT-ONTOLOGY-BROWSER-SHOW", 4, 0, false);
        declareFunction("cb_uia_ontology_browser_handler", "CB-UIA-ONTOLOGY-BROWSER-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_ob_show_toolbar_row", "CB-UIAT-OB-SHOW-TOOLBAR-ROW", 5, 0, false);
        declareFunction("cb_uiat_ob_show_toolbar", "CB-UIAT-OB-SHOW-TOOLBAR", 4, 0, false);
        declareFunction("cb_uiat_ob_show_help_button", "CB-UIAT-OB-SHOW-HELP-BUTTON", 1, 0, false);
        declareFunction("cb_uiat_ob_show_superior_row", "CB-UIAT-OB-SHOW-SUPERIOR-ROW", 4, 0, false);
        declareFunction("cb_uiat_ob_show_indirect_isas_title", "CB-UIAT-OB-SHOW-INDIRECT-ISAS-TITLE", 0, 0, false);
        declareFunction("cb_uiat_ob_show_indirect_isas", "CB-UIAT-OB-SHOW-INDIRECT-ISAS", 3, 0, false);
        declareFunction("cb_uiat_ob_show_indirect_genls_title", "CB-UIAT-OB-SHOW-INDIRECT-GENLS-TITLE", 0, 0, false);
        declareFunction("cb_uiat_ob_show_indirect_genls", "CB-UIAT-OB-SHOW-INDIRECT-GENLS", 3, 0, false);
        declareFunction("cb_uiat_ob_show_parent_row", "CB-UIAT-OB-SHOW-PARENT-ROW", 4, 0, false);
        declareFunction("cb_uiat_ob_show_direct_isas", "CB-UIAT-OB-SHOW-DIRECT-ISAS", 3, 0, false);
        declareFunction("cb_uiat_ob_show_direct_isa_example_sentence", "CB-UIAT-OB-SHOW-DIRECT-ISA-EXAMPLE-SENTENCE", 3, 0, false);
        declareFunction("cb_uiat_ob_show_direct_genls", "CB-UIAT-OB-SHOW-DIRECT-GENLS", 3, 0, false);
        declareFunction("cb_uiat_ob_show_direct_genls_example_sentence", "CB-UIAT-OB-SHOW-DIRECT-GENLS-EXAMPLE-SENTENCE", 3, 0, false);
        declareFunction("cb_uiat_ob_show_self_row", "CB-UIAT-OB-SHOW-SELF-ROW", 6, 0, false);
        declareFunction("cb_uiat_ob_show_term_section", "CB-UIAT-OB-SHOW-TERM-SECTION", 5, 0, false);
        declareFunction("cb_uiat_ontology_browser_show_select_menu", "CB-UIAT-ONTOLOGY-BROWSER-SHOW-SELECT-MENU", 2, 0, false);
        declareFunction("cb_uiat_ob_show_term_connections", "CB-UIAT-OB-SHOW-TERM-CONNECTIONS", 4, 0, false);
        declareFunction("cb_uiat_ob_show_children_row", "CB-UIAT-OB-SHOW-CHILDREN-ROW", 4, 0, false);
        declareFunction("cb_uiat_ob_show_instances", "CB-UIAT-OB-SHOW-INSTANCES", 3, 0, false);
        declareFunction("cb_uiat_ob_show_direct_instance_example_sentence", "CB-UIAT-OB-SHOW-DIRECT-INSTANCE-EXAMPLE-SENTENCE", 3, 0, false);
        declareFunction("cb_uiat_ob_show_specs", "CB-UIAT-OB-SHOW-SPECS", 3, 0, false);
        declareFunction("cb_uiat_ob_show_specs_example_sentence", "CB-UIAT-OB-SHOW-SPECS-EXAMPLE-SENTENCE", 3, 0, false);
        declareFunction("cb_uiat_ob_show_indirect_instances_title", "CB-UIAT-OB-SHOW-INDIRECT-INSTANCES-TITLE", 1, 0, false);
        declareFunction("cb_uiat_ob_show_indirect_specs_title", "CB-UIAT-OB-SHOW-INDIRECT-SPECS-TITLE", 1, 0, false);
        declareFunction("cb_uiat_ob_show_footer", "CB-UIAT-OB-SHOW-FOOTER", 1, 0, false);
        declareFunction("cb_uiat_ob_background", "CB-UIAT-OB-BACKGROUND", 1, 0, false);
        declareFunction("cb_uiat_ob_link_marker", "CB-UIAT-OB-LINK-MARKER", 1, 0, false);
        declareFunction("cb_uiat_ob_show_term", "CB-UIAT-OB-SHOW-TERM", 2, 0, false);
        declareFunction("cb_uiat_ob_show_terms", "CB-UIAT-OB-SHOW-TERMS", 2, 0, false);
        declareFunction("cb_uiat_ontology_browser_start", "CB-UIAT-ONTOLOGY-BROWSER-START", 1, 0, false);
        declareFunction("cb_link_uia_ontology_browser_start", "CB-LINK-UIA-ONTOLOGY-BROWSER-START", 2, 1, false);
        declareFunction("cb_uiat_ontology_browser_start_unencoded", "CB-UIAT-ONTOLOGY-BROWSER-START-UNENCODED", 1, 0, false);
        declareFunction("cb_uiat_ontology_browser_focused_start_unencoded", "CB-UIAT-ONTOLOGY-BROWSER-FOCUSED-START-UNENCODED", 1, 0, false);
        declareFunction("cb_uiat_ontology_browser_restart", "CB-UIAT-ONTOLOGY-BROWSER-RESTART", 1, 0, false);
        declareFunction("cb_link_uia_ontology_browser_restart", "CB-LINK-UIA-ONTOLOGY-BROWSER-RESTART", 1, 0, false);
        declareFunction("cb_uiat_ontology_browser_focus", "CB-UIAT-ONTOLOGY-BROWSER-FOCUS", 1, 0, false);
        declareFunction("cb_link_uia_ontology_browser_focus", "CB-LINK-UIA-ONTOLOGY-BROWSER-FOCUS", 2, 0, false);
        declareFunction("cb_uiat_ontology_browser_done", "CB-UIAT-ONTOLOGY-BROWSER-DONE", 1, 0, false);
        declareFunction("cb_link_uia_ontology_browser_done", "CB-LINK-UIA-ONTOLOGY-BROWSER-DONE", 2, 0, false);
        declareFunction("cb_uiat_ob_example_sentence", "CB-UIAT-OB-EXAMPLE-SENTENCE", 3, 0, false);
        declareFunction("cb_uiat_ob_show_example_sentence", "CB-UIAT-OB-SHOW-EXAMPLE-SENTENCE", 2, 0, false);
        declareFunction("cb_uiat_ob_direct_isa", "CB-UIAT-OB-DIRECT-ISA", 2, 0, false);
        declareFunction("cb_uiat_ob_remote_isa", "CB-UIAT-OB-REMOTE-ISA", 2, 0, false);
        declareFunction("cb_uiat_ob_direct_genls", "CB-UIAT-OB-DIRECT-GENLS", 2, 0, false);
        declareFunction("cb_uiat_ob_remote_genls", "CB-UIAT-OB-REMOTE-GENLS", 2, 0, false);
        declareFunction("cb_uiat_ob_direct_instances", "CB-UIAT-OB-DIRECT-INSTANCES", 3, 0, false);
        declareFunction("cb_uiat_ob_direct_instances_set", "CB-UIAT-OB-DIRECT-INSTANCES-SET", 2, 0, false);
        declareFunction("cb_uiat_ob_has_direct_instancesP", "CB-UIAT-OB-HAS-DIRECT-INSTANCES?", 2, 0, false);
        declareFunction("cb_uiat_ob_sample_instances", "CB-UIAT-OB-SAMPLE-INSTANCES", 2, 1, false);
        declareFunction("cb_uiat_ob_has_sample_instancesP", "CB-UIAT-OB-HAS-SAMPLE-INSTANCES?", 2, 0, false);
        declareFunction("cb_uiat_ob_direct_specs", "CB-UIAT-OB-DIRECT-SPECS", 3, 0, false);
        declareFunction("cb_uiat_ob_direct_specs_set", "CB-UIAT-OB-DIRECT-SPECS-SET", 2, 0, false);
        declareFunction("cb_uiat_ob_has_direct_specsP", "CB-UIAT-OB-HAS-DIRECT-SPECS?", 2, 0, false);
        declareFunction("cb_uiat_ob_sample_specs", "CB-UIAT-OB-SAMPLE-SPECS", 2, 1, false);
        declareFunction("cb_uiat_ob_has_sample_specsP", "CB-UIAT-OB-HAS-SAMPLE-SPECS?", 2, 0, false);
        declareFunction("cb_uiat_ob_sort_direct_generalizations", "CB-UIAT-OB-SORT-DIRECT-GENERALIZATIONS", 2, 0, false);
        declareFunction("cb_uiat_ob_sort_remote_generalizations", "CB-UIAT-OB-SORT-REMOTE-GENERALIZATIONS", 2, 0, false);
        declareFunction("cb_uiat_ob_sort_direct_specs", "CB-UIAT-OB-SORT-DIRECT-SPECS", 2, 0, false);
        declareFunction("cb_uiat_ob_sort_sample_specs", "CB-UIAT-OB-SORT-SAMPLE-SPECS", 2, 0, false);
        declareFunction("cb_uiat_ob_sort_direct_instances", "CB-UIAT-OB-SORT-DIRECT-INSTANCES", 2, 0, false);
        declareFunction("cb_uiat_ob_sort_sample_instances", "CB-UIAT-OB-SORT-SAMPLE-INSTANCES", 2, 0, false);
        declareFunction("cb_uiat_ob_sort_leaves", "CB-UIAT-OB-SORT-LEAVES", 2, 0, false);
        declareFunction("cb_uiat_ob_estimate_all_fort_instances", "CB-UIAT-OB-ESTIMATE-ALL-FORT-INSTANCES", 1, 0, false);
        declareFunction("cb_uiat_ob_estimate_all_specs", "CB-UIAT-OB-ESTIMATE-ALL-SPECS", 1, 0, false);
        declareFunction("cb_uiat_ob_leaf_p", "CB-UIAT-OB-LEAF-P", 1, 0, false);
        declareFunction("cb_uiat_ob_non_leaf_p", "CB-UIAT-OB-NON-LEAF-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uiat_ontology_browser_file() {
        deflexical("*CB-UIAT-OB-INDIRECT-GENLS-DOM-ID*", $str_alt23$indirect_genls);
        deflexical("*CB-UIAT-OB-INDIRECT-ISAS-DOM-ID*", $str_alt24$indirect_isas);
        deflexical("*CB-UIAT-OB-INDIRECT-SPECS-DOM-ID*", $str_alt25$indirect_specs);
        deflexical("*CB-UIAT-OB-INDIRECT-INSTANCES-DOM-ID*", $str_alt26$indirect_instances);
        deflexical("*CB-UIAT-OB-RELEVANT-CONNECTIONS-DOM-ID*", $str_alt27$relevant_connections);
        defparameter("*UIA-ONTOLOGY-BROWSER-SAMPLING-CUTOFF*", TWENTY_INTEGER);
        deflexical("*CB-UIAT-OB-BACKGROUND-COLORS*", $list_alt127);
        return NIL;
    }

    public static final SubLObject setup_cb_uiat_ontology_browser_file() {
                html_macros.note_html_handler_function(CB_UIAT_ONTOLOGY_BROWSER_HANDLE_SELECTION);
        html_macros.note_html_handler_function(CB_UIA_ONTOLOGY_BROWSER_HANDLER);
        sethash($UIAT_YL_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt129$yl_sdi_gif, NIL));
        sethash($UIAT_GR_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt129$yl_sdi_gif, NIL));
        sethash($UIAT_PI_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt132$pi_sdi_gif, NIL));
        html_macros.note_html_handler_function(CB_UIAT_ONTOLOGY_BROWSER_START);
        cb_utilities.setup_cb_link_method($UIA_ONTOLOGY_BROWSER_START, CB_LINK_UIA_ONTOLOGY_BROWSER_START, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_ONTOLOGY_BROWSER_START_UNENCODED);
        html_macros.note_html_handler_function(CB_UIAT_ONTOLOGY_BROWSER_FOCUSED_START_UNENCODED);
        html_macros.note_html_handler_function(CB_UIAT_ONTOLOGY_BROWSER_RESTART);
        cb_utilities.setup_cb_link_method($UIA_ONTOLOGY_BROWSER_RESTART, CB_LINK_UIA_ONTOLOGY_BROWSER_RESTART, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_ONTOLOGY_BROWSER_FOCUS);
        cb_utilities.setup_cb_link_method($UIA_ONTOLOGY_BROWSER_FOCUS, CB_LINK_UIA_ONTOLOGY_BROWSER_FOCUS, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_ONTOLOGY_BROWSER_DONE);
        cb_utilities.setup_cb_link_method($UIA_ONTOLOGY_BROWSER_DONE, CB_LINK_UIA_ONTOLOGY_BROWSER_DONE, TWO_INTEGER);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$cb_uiat_ontology_browser_handle_s = makeString("cb-uiat-ontology-browser-handle-selection");

    private static final SubLSymbol $GENERAL_EXAMPLES = makeKeyword("GENERAL-EXAMPLES");

    private static final SubLSymbol $DOMAIN_EXAMPLES = makeKeyword("DOMAIN-EXAMPLES");

    private static final SubLSymbol $HEADER_STRING = makeKeyword("HEADER-STRING");

    private static final SubLSymbol $CYC_TO_USER = makeKeyword("CYC-TO-USER");

    static private final SubLString $str_alt5$Enter_a_concept_from_which_to_sta = makeString("Enter a concept from which to start:");

    static private final SubLString $str_alt6$term_input = makeString("term-input");

    static private final SubLString $str_alt7$ = makeString("");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $$$Submit = makeString("Submit");

    static private final SubLString $str_alt10$Or_choose_a_starting_point_by_cli = makeString("Or choose a starting point by clicking on one of these examples :");

    static private final SubLString $str_alt11$95_ = makeString("95%");

    static private final SubLString $str_alt12$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt13$Starting_Points_related_to_ = makeString("Starting Points related to ");

    static private final SubLString $$$General_Starting_Points = makeString("General Starting Points");









    private static final SubLSymbol $ONTOLOGY_BROWSER = makeKeyword("ONTOLOGY-BROWSER");

    private static final SubLSymbol $INTERPRET = makeKeyword("INTERPRET");



    private static final SubLSymbol CB_UIAT_ONTOLOGY_BROWSER_HANDLE_SELECTION = makeSymbol("CB-UIAT-ONTOLOGY-BROWSER-HANDLE-SELECTION");

    static private final SubLString $str_alt23$indirect_genls = makeString("indirect_genls");

    static private final SubLString $str_alt24$indirect_isas = makeString("indirect_isas");

    static private final SubLString $str_alt25$indirect_specs = makeString("indirect_specs");

    static private final SubLString $str_alt26$indirect_instances = makeString("indirect_instances");

    static private final SubLString $str_alt27$relevant_connections = makeString("relevant_connections");

    static private final SubLString $str_alt28$text_css = makeString("text/css");

    static private final SubLString $$$screen = makeString("screen");

    static private final SubLString $$$none = makeString("none");



    static private final SubLString $str_alt32$cb_uia_ontology_browser_handler = makeString("cb-uia-ontology-browser-handler");

    static private final SubLString $$$term = makeString("term");

    static private final SubLString $str_alt34$100_ = makeString("100%");

    static private final SubLString $$$action = makeString("action");

    static private final SubLString $str_alt36$create_spec_button = makeString("create-spec-button");

    static private final SubLString $str_alt37$CREATE_SPEC = makeString("CREATE-SPEC");

    static private final SubLString $str_alt38$create_instance_button = makeString("create-instance-button");

    static private final SubLString $str_alt39$CREATE_INSTANCE = makeString("CREATE-INSTANCE");





    private static final SubLSymbol $REQUESTED_ACTION = makeKeyword("REQUESTED-ACTION");

    private static final SubLSymbol CB_UIA_ONTOLOGY_BROWSER_HANDLER = makeSymbol("CB-UIA-ONTOLOGY-BROWSER-HANDLER");



    private static final SubLSymbol $UIA_ONTOLOGY_BROWSER_RESTART = makeKeyword("UIA-ONTOLOGY-BROWSER-RESTART");

    static private final SubLString $str_alt46$_Help = makeString("#Help");

    static private final SubLString $str_alt47$_Scroll_to_Help_Text_ = makeString("[Scroll to Help Text]");

    private static final SubLSymbol $INDIRECT_GENLS = makeKeyword("INDIRECT-GENLS");

    static private final SubLString $str_alt49$50_ = makeString("50%");





    private static final SubLSymbol $INDIRECT_ISAS = makeKeyword("INDIRECT-ISAS");

    static private final SubLString $$$More_Abstract_Categories = makeString("More Abstract Categories");

    static private final SubLString $$$More_General_Types = makeString("More General Types");

    private static final SubLSymbol $DIRECT_GENLS = makeKeyword("DIRECT-GENLS");

    private static final SubLSymbol $DIRECT_ISAS = makeKeyword("DIRECT-ISAS");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLString $$$Categories = makeString("Categories");

    static private final SubLString $str_alt59$_e_g___ = makeString("(e.g.: ");

    static private final SubLString $str_alt60$_ = makeString(")");

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    static private final SubLString $$$Types = makeString("Types");

    private static final SubLSymbol $TERM_SECTION = makeKeyword("TERM-SECTION");

    private static final SubLSymbol $SUMMARY_SENTENCE = makeKeyword("SUMMARY-SENTENCE");

    private static final SubLSymbol $ALT_PHRASES = makeKeyword("ALT-PHRASES");

    static private final SubLString $str_alt66$90_ = makeString("90%");

    static private final SubLString $str_alt67$_arial__helvetica__courier_ = makeString("\"arial, helvetica, courier\"");

    static private final SubLString $str_alt68$summary_sentence = makeString("summary_sentence");

    static private final SubLString $$$Summary = makeString("Summary");

    static private final SubLString $str_alt70$Alternative_phrases__ = makeString("Alternative phrases: ");

    private static final SubLSymbol $UIA_CONCEPT_FINDER_THROW = makeKeyword("UIA-CONCEPT-FINDER-THROW");





    static private final SubLString $str_alt74$_OE_ = makeString("[OE]");

    private static final SubLSymbol $UIA_BLUE_CONCEPT_RECOGNIZER_EVENT = makeKeyword("UIA-BLUE-CONCEPT-RECOGNIZER-EVENT");

    static private final SubLString $str_alt76$_Visualize_ = makeString("[Visualize]");

    static private final SubLList $list_alt77 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")));

    private static final SubLSymbol $HIGH_LIGHTED = makeKeyword("HIGH-LIGHTED");

    private static final SubLSymbol $UIAEXT_NUSKETCH_UNHIGHLIGHT = makeKeyword("UIAEXT-NUSKETCH-UNHIGHLIGHT");

    static private final SubLString $str_alt80$_Un_Highlight__A_in_nuSketch_ = makeString("[Un-Highlight ~A in nuSketch]");

    private static final SubLSymbol $NOT_HIGH_LIGHTED = makeKeyword("NOT-HIGH-LIGHTED");

    private static final SubLSymbol $UIAEXT_NUSKETCH_HIGHLIGHT = makeKeyword("UIAEXT-NUSKETCH-HIGHLIGHT");

    static private final SubLString $str_alt83$_Highlight__A_in_nuSketch_ = makeString("[Highlight ~A in nuSketch]");

    static private final SubLString $str_alt84$Main_Window_Actions___ = makeString("Main Window Actions:  ");

    static private final SubLString $str_alt85$There_may_be_a_slight_delay_befor = makeString("There may be a slight delay before the main window pops up");

    static private final SubLString $str_alt86$javascript_this_form_submit___ = makeString("javascript:this.form.submit();");

    static private final SubLString $str_alt87$DO_NOTHING = makeString("DO-NOTHING");

    static private final SubLString $str_alt88$___ = makeString("---");

    static private final SubLString $str_alt89$ASSERTED_SENTENCES = makeString("ASSERTED-SENTENCES");

    static private final SubLString $$$See_All_Facts = makeString("See All Facts");

    static private final SubLString $str_alt91$CONCEPT_RELATOR = makeString("CONCEPT-RELATOR");

    static private final SubLString $$$See_Related_Terms = makeString("See Related Terms");

    static private final SubLString $$$INTERVIEW = makeString("INTERVIEW");

    static private final SubLString $$$Interview = makeString("Interview");

    static private final SubLString $str_alt95$ADD_SCRAP = makeString("ADD-SCRAP");

    static private final SubLString $$$Add_to_Scrapbook = makeString("Add to Scrapbook");

    static private final SubLString $str_alt97$COMMON_QUERIES = makeString("COMMON-QUERIES");

    static private final SubLString $$$See_Common_Queries = makeString("See Common Queries");



    private static final SubLSymbol $SME_TERM = makeKeyword("SME-TERM");

    static private final SubLString $str_alt101$KILL_TERM = makeString("KILL-TERM");

    static private final SubLString $$$Forget_This_Term = makeString("Forget This Term");

    static private final SubLString $str_alt103$CREATE_SIMILAR = makeString("CREATE-SIMILAR");

    static private final SubLString $$$Create_Similar_Term = makeString("Create Similar Term");

    static private final SubLString $$$Create_Instance = makeString("Create Instance");

    static private final SubLString $$$Create_More_Specific_Type = makeString("Create More Specific Type");

    static private final SubLString $$$LEXIFY = makeString("LEXIFY");

    static private final SubLString $$$Add_Dictionary_Information = makeString("Add Dictionary Information");

    static private final SubLString $$$COMPARE = makeString("COMPARE");

    static private final SubLString $$$Launch_Comparison = makeString("Launch Comparison");

    private static final SubLSymbol $TERM_RELATIONS = makeKeyword("TERM-RELATIONS");

    static private final SubLString $str_alt112$No_relevant_relationships_ = makeString("No relevant relationships.");

    static private final SubLString $$$Relevant_Relationships = makeString("Relevant Relationships");

    private static final SubLSymbol $DIRECT_SPECS = makeKeyword("DIRECT-SPECS");

    private static final SubLSymbol $DIRECT_INSTANCES = makeKeyword("DIRECT-INSTANCES");

    static private final SubLString $$$No_relevant_instances = makeString("No relevant instances");

    static private final SubLString $$$Add_an_Instance = makeString("Add an Instance");

    static private final SubLString $$$Instances = makeString("Instances");

    static private final SubLString $$$No_relevant_more_specific_types = makeString("No relevant more specific types");

    static private final SubLString $$$Add_a_More_Specific_Type = makeString("Add a More Specific Type");

    static private final SubLString $$$More_Specific_Types = makeString("More Specific Types");

    static private final SubLString $$$More_Instances = makeString("More Instances");

    static private final SubLString $str_alt123$_A_total__sampled = makeString("~A total, sampled");

    static private final SubLString $$$Other_More_Specific_Types = makeString("Other More Specific Types");

    static private final SubLString $$$Help = makeString("Help");

    private static final SubLSymbol $HELP_TEXT = makeKeyword("HELP-TEXT");

    static private final SubLList $list_alt127 = list(new SubLObject[]{ list(makeKeyword("DEFAULT"), makeString("FFFFFF")), list(makeKeyword("TOOLBAR"), makeString("FFFFFF")), list(makeKeyword("INDIRECT-ISAS"), makeString("DFFFDF")), list(makeKeyword("INDIRECT-GENLS"), makeString("DFDFFF")), list(makeKeyword("DIRECT-ISAS"), makeString("CFFFCF")), list(makeKeyword("DIRECT-GENLS"), makeString("CFCFFF")), list(makeKeyword("TERM-SECTION"), makeString("FFCFCF")), list(makeKeyword("DIRECT-INSTANCES"), makeString("BFFFBF")), list(makeKeyword("DIRECT-SPECS"), makeString("BFBFFF")), list(makeKeyword("INDIRECT-SPECS"), makeString("AFAFFF")), list(makeKeyword("INDIRECT-INSTANCES"), makeString("AFFFAF")) });

    private static final SubLSymbol $UIAT_YL_SDI = makeKeyword("UIAT-YL-SDI");

    static private final SubLString $str_alt129$yl_sdi_gif = makeString("yl_sdi.gif");

    private static final SubLSymbol $UIAT_GR_SDI = makeKeyword("UIAT-GR-SDI");

    private static final SubLSymbol $UIAT_PI_SDI = makeKeyword("UIAT-PI-SDI");

    static private final SubLString $str_alt132$pi_sdi_gif = makeString("pi_sdi.gif");

    static private final SubLList $list_alt133 = list(makeSymbol("&OPTIONAL"), makeSymbol("TERM"));

    private static final SubLSymbol $LAUNCH = makeKeyword("LAUNCH");

    private static final SubLSymbol CB_UIAT_ONTOLOGY_BROWSER_START = makeSymbol("CB-UIAT-ONTOLOGY-BROWSER-START");

    static private final SubLString $str_alt136$cb_uiat_ontology_browser_start = makeString("cb-uiat-ontology-browser-start");

    static private final SubLString $str_alt137$window_open__ = makeString("window.open('");

    static private final SubLString $str_alt138$__ = makeString("',");

    static private final SubLString $str_alt139$__A_ = makeString("'~A'");

    static private final SubLString $$$null = makeString("null");

    static private final SubLString $str_alt141$___A____ = makeString(",'~A'); ");

    static private final SubLString $str_alt142$return_false_ = makeString("return false;");

    private static final SubLSymbol $UIA_ONTOLOGY_BROWSER_START = makeKeyword("UIA-ONTOLOGY-BROWSER-START");

    private static final SubLSymbol CB_LINK_UIA_ONTOLOGY_BROWSER_START = makeSymbol("CB-LINK-UIA-ONTOLOGY-BROWSER-START");

    static private final SubLList $list_alt145 = list(makeKeyword("FOCUSED-INTERACTION"), NIL);

    private static final SubLSymbol CB_UIAT_ONTOLOGY_BROWSER_START_UNENCODED = makeSymbol("CB-UIAT-ONTOLOGY-BROWSER-START-UNENCODED");

    static private final SubLList $list_alt147 = list(makeKeyword("FOCUSED-INTERACTION"), T);

    private static final SubLSymbol CB_UIAT_ONTOLOGY_BROWSER_FOCUSED_START_UNENCODED = makeSymbol("CB-UIAT-ONTOLOGY-BROWSER-FOCUSED-START-UNENCODED");

    static private final SubLList $list_alt149 = list(makeSymbol("INTERACTION"));



    private static final SubLSymbol CB_UIAT_ONTOLOGY_BROWSER_RESTART = makeSymbol("CB-UIAT-ONTOLOGY-BROWSER-RESTART");



    static private final SubLString $str_alt153$cb_uiat_ontology_browser_restart = makeString("cb-uiat-ontology-browser-restart");

    static private final SubLString $str_alt154$_Go_to_Suggested_Starting_Points_ = makeString("[Go to Suggested Starting Points]");

    private static final SubLSymbol CB_LINK_UIA_ONTOLOGY_BROWSER_RESTART = makeSymbol("CB-LINK-UIA-ONTOLOGY-BROWSER-RESTART");

    static private final SubLList $list_alt156 = list(makeSymbol("INTERACTION"), makeSymbol("TERM"));



    private static final SubLSymbol CB_UIAT_ONTOLOGY_BROWSER_FOCUS = makeSymbol("CB-UIAT-ONTOLOGY-BROWSER-FOCUS");

    static private final SubLString $str_alt159$cb_uiat_ontology_browser_focus = makeString("cb-uiat-ontology-browser-focus");

    private static final SubLSymbol $UIA_ONTOLOGY_BROWSER_FOCUS = makeKeyword("UIA-ONTOLOGY-BROWSER-FOCUS");

    private static final SubLSymbol CB_LINK_UIA_ONTOLOGY_BROWSER_FOCUS = makeSymbol("CB-LINK-UIA-ONTOLOGY-BROWSER-FOCUS");



    private static final SubLSymbol CB_UIAT_ONTOLOGY_BROWSER_DONE = makeSymbol("CB-UIAT-ONTOLOGY-BROWSER-DONE");

    static private final SubLString $str_alt164$_Done_ = makeString("[Done]");

    static private final SubLString $str_alt165$cb_uiat_ontology_browser_done = makeString("cb-uiat-ontology-browser-done");

    private static final SubLSymbol $UIA_ONTOLOGY_BROWSER_DONE = makeKeyword("UIA-ONTOLOGY-BROWSER-DONE");

    private static final SubLSymbol CB_LINK_UIA_ONTOLOGY_BROWSER_DONE = makeSymbol("CB-LINK-UIA-ONTOLOGY-BROWSER-DONE");

    private static final SubLSymbol $DIRECT_INSTANCES_SET = makeKeyword("DIRECT-INSTANCES-SET");

    public static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLSymbol $DIRECT_SPECS_SET = makeKeyword("DIRECT-SPECS-SET");

    static private final SubLSymbol $sym171$_ = makeSymbol(">");



    private static final SubLSymbol CB_UIAT_OB_NON_LEAF_P = makeSymbol("CB-UIAT-OB-NON-LEAF-P");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uiat_ontology_browser_file();
    }

    public void initializeVariables() {
        init_cb_uiat_ontology_browser_file();
    }

    public void runTopLevelForms() {
        setup_cb_uiat_ontology_browser_file();
    }
}

