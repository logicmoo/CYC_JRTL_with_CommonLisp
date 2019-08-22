/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 *  module:      CB-UIA-TOOLS-BROWSING
 *  source file: /cyc/top/cycl/cb-uia-tools-browsing.lisp
 *  created:     2019/07/03 17:38:10
 */
public final class cb_uia_tools_browsing extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_tools_browsing() {
    }

    public static final SubLFile me = new cb_uia_tools_browsing();

    public static final String myName = "com.cyc.cycjava.cycl.cb_uia_tools_browsing";

    // // Definitions
    public static final SubLObject cb_uiat_concept_clarifier_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_1 = plist;
                        SubLObject current_2 = datum_1;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_2;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_1, $list_alt4);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_1, $list_alt4);
                            if (NIL == member(current_3, $list_alt5, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_1, $list_alt4);
                        }
                        {
                            SubLObject term_tail = property_list_member($TERM, current_2);
                            SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                            SubLObject clarifying_sentences_tail = property_list_member($CLARIFYING_SENTENCES, current_2);
                            SubLObject clarifying_sentences = (NIL != clarifying_sentences_tail) ? ((SubLObject) (cadr(clarifying_sentences_tail))) : NIL;
                            SubLObject is_sme_term_tail = property_list_member($IS_SME_TERM, current_2);
                            SubLObject is_sme_term = (NIL != is_sme_term_tail) ? ((SubLObject) (cadr(is_sme_term_tail))) : NIL;
                            SubLObject select_tail = property_list_member($SELECT, current_2);
                            SubLObject select = (NIL != select_tail) ? ((SubLObject) (cadr(select_tail))) : NIL;
                            SubLObject alt_phrases_tail = property_list_member($ALT_PHRASES, current_2);
                            SubLObject alt_phrases = (NIL != alt_phrases_tail) ? ((SubLObject) (cadr(alt_phrases_tail))) : NIL;
                            SubLObject highlight_tail = property_list_member($HIGHLIGHT, current_2);
                            SubLObject highlight = (NIL != highlight_tail) ? ((SubLObject) (cadr(highlight_tail))) : NIL;
                            SubLObject examples_tail = property_list_member($EXAMPLES, current_2);
                            SubLObject examples = (NIL != examples_tail) ? ((SubLObject) (cadr(examples_tail))) : NIL;
                            return cb_uiat_concept_clarifier_guts(user_interaction_agenda.ui_agenda(interaction), interaction, v_term, clarifying_sentences, is_sme_term, misc_utilities.keyword_to_boolean(select), alt_phrases, highlight, examples);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_concept_clarifier_guts(SubLObject v_agenda, SubLObject interaction, SubLObject v_term, SubLObject clarifying_sentences, SubLObject is_sme_term, SubLObject selectP, SubLObject alt_phrases, SubLObject highlight, SubLObject examples) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                        html_utilities.html_hidden_input($str_alt14$cb_concept_clarifier_handler, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$term, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, v_term), UNPROVIDED);
                        html_utilities.html_hidden_input($$$interaction, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, interaction), UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        cb_uia_macros.cb_uiat_document_expiration();
                        cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        {
                            SubLObject _prev_bind_0_4 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                            html_script_utilities.html_js_focus_window();
                                        }
                                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject _prev_bind_0_6 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                {
                                                    SubLObject reuseP = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    try {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject _prev_bind_0_7 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                            try {
                                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                {
                                                                    SubLObject new_or_reused = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject _prev_bind_0_8 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                        try {
                                                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                            {
                                                                                SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                {
                                                                                    SubLObject _prev_bind_0_9 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                                                            Errors.error($str_alt17$Invalid_attempt_to_reuse_memoizat);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                                cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                            } finally {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                    try {
                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                        html_utilities.html_newline(UNPROVIDED);
                                                                                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                                        cb_uia_display_primitives.cb_uia_show_term(v_term, UNPROVIDED);
                                                                                                        html_utilities.html_princ($str_alt20$___);
                                                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                                                                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                                                                        if (NIL != clarifying_sentences) {
                                                                                                            {
                                                                                                                SubLObject cdolist_list_var = clarifying_sentences;
                                                                                                                SubLObject sentence = NIL;
                                                                                                                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                                                                                                    cb_uia_display_primitives.cb_uia_show_sentence(sentence, UNPROVIDED);
                                                                                                                    html_utilities.html_newline(UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                                                                        if (NIL != alt_phrases) {
                                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt21$Alternative_phrases_);
                                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                                            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                                                                            {
                                                                                                                SubLObject cdolist_list_var = alt_phrases;
                                                                                                                SubLObject phrase = NIL;
                                                                                                                for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt22$_s_, phrase);
                                                                                                                }
                                                                                                            }
                                                                                                            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                                        }
                                                                                                        if (NIL != examples) {
                                                                                                            html_utilities.html_princ($str_alt23$Usage_Example_s__);
                                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                                            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                                                                            {
                                                                                                                SubLObject cdolist_list_var = examples;
                                                                                                                SubLObject sentence = NIL;
                                                                                                                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                                                                                                    cb_uia_display_primitives.cb_uia_show_sentence(sentence, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
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
                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                if (NIL != selectP) {
                                                                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                            if (true) {
                                                                                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                                html_utilities.html_markup(FOUR_INTEGER);
                                                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                            }
                                                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                                                                    cb_utilities.cb_link($UIA_CONCEPT_FINDER_THROW, v_term, NIL, NIL, NIL, NIL);
                                                                                                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                                                                } finally {
                                                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                        } finally {
                                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                cb_utilities.cb_link($UIA_ASSERTED_SENTENCES_GUTS, v_term, $str_alt26$_Show_all_assertions_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                cb_utilities.cb_link($UIA_CONCEPT_RELATOR_GUTS, v_term, $str_alt28$_Related_terms_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                cb_utilities.cb_link($UIA_SALIENT_DESCRIPTOR_REQUIRED, v_term, $str_alt30$_Interview_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                cb_utilities.cb_link($UIA_LEXIFICATION_WIZARD_GUTS, v_term, $str_alt32$_Lexify_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                    } finally {
                                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                {
                                                                                                                                    SubLObject domain_interaction_mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
                                                                                                                                    cb_utilities.cb_link($UIA_ONTOLOGY_BROWSER_START, v_term, domain_interaction_mt, $str_alt34$_Browse_Ontology_, UNPROVIDED, UNPROVIDED);
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                cb_utilities.cb_link($UIA_ADD_TERM_TO_SCRAP_BOOK, v_term, $str_alt36$_Add_to_Scrapbook_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        if (true) {
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                            html_utilities.html_markup(TWO_INTEGER);
                                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                        }
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                if (NIL != forts.fort_p(v_term)) {
                                                                                                                                    cb_uia_display_primitives.cb_uia_show_term_oe_link(v_term, $str_alt37$_OE_);
                                                                                                                                    html_utilities.html_princ($str_alt38$__for_Cyclists_only_);
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                    } finally {
                                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                                                                            SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                cb_utilities.cb_link($UIAT_COMMON_QUERIES_FOCUS_TERM, v_term, $str_alt40$_Relevant_Queries_for_This_Term_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        if (true) {
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                            html_utilities.html_markup(TWO_INTEGER);
                                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                        }
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                cb_utilities.cb_link($UIA_BLUE_CONCEPT_RECOGNIZER_EVENT, v_agenda, $str_alt42$_Visualize_, list(v_term), ONE_INTEGER, $list_alt43);
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                    } finally {
                                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                                                if (NIL != highlight) {
                                                                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                                                                                SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                    {
                                                                                                                                        SubLObject pcase_var = highlight;
                                                                                                                                        if (pcase_var.eql($HIGH_LIGHTED)) {
                                                                                                                                            cb_utilities.cb_link($UIAEXT_NUSKETCH_UNHIGHLIGHT, v_term, format(NIL, $str_alt46$_Un_Highlight__A_in_nuSketch_, v_term), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                        } else
                                                                                                                                            if (pcase_var.eql($NOT_HIGH_LIGHTED)) {
                                                                                                                                                cb_utilities.cb_link($UIAEXT_NUSKETCH_HIGHLIGHT, v_term, format(NIL, $str_alt49$_Highlight__A_in_nuSketch_, v_term), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                            }

                                                                                                                                    }
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
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                        if ($TRUE == is_sme_term) {
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                            if (true) {
                                                                                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                                html_utilities.html_markup(TWO_INTEGER);
                                                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                            }
                                                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                    cb_utilities.cb_link($UIA_CONCEPT_KILLER, v_term, $str_alt52$_Forget_This_Term_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                } finally {
                                                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                                            } finally {
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                                                        html_utilities.html_newline(TWO_INTEGER);
                                                                                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                                                        if (true) {
                                                                                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_markup(ZERO_INTEGER);
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        }
                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                html_utilities.html_submit_input($$$Compare, $$$compare, UNPROVIDED);
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                html_utilities.html_princ($str_alt55$Compare_and_contrast_);
                                                                                                                                cb_uia_display_primitives.cb_uia_show_term(v_term, UNPROVIDED);
                                                                                                                                html_utilities.html_princ($str_alt56$_with_);
                                                                                                                                html_utilities.html_text_input($str_alt57$compare_with, NIL, TWENTY_INTEGER);
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                    } finally {
                                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                html_utilities.html_submit_input($$$State_Analogy, $$$analogy1, UNPROVIDED);
                                                                                                                                html_utilities.html_indent(TWO_INTEGER);
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                cb_uia_display_primitives.cb_uia_fancy_show_term(v_term, $list_alt60);
                                                                                                                                html_utilities.html_princ($str_alt61$_is_like_);
                                                                                                                                html_utilities.html_text_input($str_alt62$analogy_source, NIL, TWENTY_INTEGER);
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
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
                                                                                                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                html_utilities.html_submit_input($$$State_Analogy, $$$analogy2, UNPROVIDED);
                                                                                                                                html_utilities.html_indent(TWO_INTEGER);
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                html_utilities.html_text_input($str_alt64$analogy_target, NIL, TWENTY_INTEGER);
                                                                                                                                html_utilities.html_princ($str_alt61$_is_like_);
                                                                                                                                cb_uia_display_primitives.cb_uia_show_term(v_term, UNPROVIDED);
                                                                                                                            } finally {
                                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                    } finally {
                                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                                                if (T == cb_user_interaction_agenda.cb_uia_launcher_applicableP($RELATIONSHIP_SUGGESTOR)) {
                                                                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                    html_utilities.html_submit_input($$$Suggest_a_Relation, $$$relate1, UNPROVIDED);
                                                                                                                                    html_utilities.html_indent(TWO_INTEGER);
                                                                                                                                } finally {
                                                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                    html_utilities.html_princ($str_alt68$How_could_I_relate_);
                                                                                                                                    html_utilities.html_text_input($str_alt69$relate_term1, NIL, TWENTY_INTEGER);
                                                                                                                                    html_utilities.html_princ($str_alt70$_and_);
                                                                                                                                    cb_uia_display_primitives.cb_uia_show_term(v_term, UNPROVIDED);
                                                                                                                                    html_utilities.html_princ($str_alt71$_);
                                                                                                                                } finally {
                                                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                        } finally {
                                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                    html_utilities.html_submit_input($$$Suggest_a_Relation, $$$relate2, UNPROVIDED);
                                                                                                                                    html_utilities.html_indent(TWO_INTEGER);
                                                                                                                                } finally {
                                                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                                    html_utilities.html_princ($str_alt68$How_could_I_relate_);
                                                                                                                                    cb_uia_display_primitives.cb_uia_show_term(v_term, UNPROVIDED);
                                                                                                                                    html_utilities.html_princ($str_alt70$_and_);
                                                                                                                                    html_utilities.html_text_input($str_alt73$relate_term2, NIL, TWENTY_INTEGER);
                                                                                                                                    html_utilities.html_princ($str_alt71$_);
                                                                                                                                } finally {
                                                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                        } finally {
                                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                                                        html_utilities.html_newline(UNPROVIDED);
                                                                                                        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        html_utilities.html_indent(TWO_INTEGER);
                                                                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_9, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_8, thread);
                                                                        }
                                                                    }
                                                                    if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                    }
                                                                }
                                                            } finally {
                                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_7, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL == reuseP) {
                                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_46, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_4, thread);
                            }
                        }
                        cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_concept_clarifier_page_for_hoverover(SubLObject v_term, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject term_phrase_mappings = uia_tools_basic.uia_sentence_finder_indexical_table_peek(v_agenda);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($LEFT));
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
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
                            SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt77$Meaning__);
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        cb_uia_display_primitives.cb_uia_fancy_show_term(v_term, $list_alt78);
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject precise_raw_html = NIL;
                            {
                                SubLObject _prev_bind_0_50 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_term_paraphrase_map$.bind(term_phrase_mappings, thread);
                                    precise_raw_html = uia_trampolines.uia_html_term_phrase_precise(v_agenda, v_term, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0_50, thread);
                                }
                            }
                            if (!precise_raw_html.equal(uia_trampolines.uia_html_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED))) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt79$Precisely__);
                                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                html_utilities.html_markup(precise_raw_html);
                                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt80$CycL__);
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        cb_utilities.cb_form(v_term, ZERO_INTEGER, T);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
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

    public static final SubLObject cb_concept_clarifier_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject v_term = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input($$$term, args));
            SubLObject phrase = uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject compareP = list_utilities.sublisp_boolean(html_utilities.html_extract_input($$$compare, args));
            SubLObject analogy1P = list_utilities.sublisp_boolean(html_utilities.html_extract_input($$$analogy1, args));
            SubLObject analogy2P = list_utilities.sublisp_boolean(html_utilities.html_extract_input($$$analogy2, args));
            SubLObject relate1P = list_utilities.sublisp_boolean(html_utilities.html_extract_input($$$relate1, args));
            SubLObject relate2P = list_utilities.sublisp_boolean(html_utilities.html_extract_input($$$relate2, args));
            SubLObject reply = NIL;
            if (NIL != compareP) {
                {
                    SubLObject compare_with = html_utilities.html_extract_input($str_alt57$compare_with, args);
                    if (NIL != compare_with) {
                        reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $CONCEPT_COMPARATOR, $LAUNCH, list($PHRASE1, phrase, $PHRASE2, compare_with, $TERM1, v_term));
                    }
                }
            } else
                if (NIL != analogy1P) {
                    {
                        SubLObject source = html_utilities.html_extract_input($str_alt62$analogy_source, args);
                        if (NIL != source) {
                            reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $ANALOGY_DEVELOPER, $LAUNCH, list($TARGET_PHRASE, phrase, $SOURCE_PHRASE, source, $TARGET_TERM, v_term, $SOURCE_TERM, NIL));
                        }
                    }
                } else
                    if (NIL != analogy2P) {
                        {
                            SubLObject target = html_utilities.html_extract_input($str_alt64$analogy_target, args);
                            if (NIL != target) {
                                reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $ANALOGY_DEVELOPER, $LAUNCH, list($TARGET_PHRASE, target, $SOURCE_PHRASE, phrase, $TARGET_TERM, NIL, $SOURCE_TERM, v_term));
                            }
                        }
                    } else
                        if (NIL != relate1P) {
                            {
                                SubLObject phrase1 = html_utilities.html_extract_input($str_alt69$relate_term1, args);
                                if (NIL != phrase1) {
                                    reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $RELATIONSHIP_SUGGESTOR, $LAUNCH, list($PHRASE1, phrase1, $PHRASE2, phrase, $TERM1, NIL, $TERM2, v_term));
                                }
                            }
                        } else
                            if (NIL != relate2P) {
                                {
                                    SubLObject phrase2 = html_utilities.html_extract_input($str_alt73$relate_term2, args);
                                    if (NIL != phrase2) {
                                        reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $RELATIONSHIP_SUGGESTOR, $LAUNCH, list($PHRASE1, phrase, $PHRASE2, phrase2, $TERM1, v_term, $TERM2, NIL));
                                    }
                                }
                            }




            if (NIL != reply) {
                return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            } else {
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
        }
    }

    public static final SubLObject cb_link_uia_concept_clarifier(SubLObject v_term, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != html_script_utilities.cb_hoverover_recursion_disallowedP()) || (NIL == html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread))) {
                {
                    SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    cb_parameters.cyc_cgi_url_int();
                    {
                        SubLObject arglist = list(v_term);
                        cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt94$cb_uia_concept_clarifier, arglist);
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
                            html_utilities.html_markup(linktext);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                }
            } else {
                {
                    SubLObject _prev_bind_0 = html_script_utilities.$cb_hoverover_recursion_limit$.currentBinding(thread);
                    try {
                        html_script_utilities.$cb_hoverover_recursion_limit$.bind(subtract(html_script_utilities.$cb_hoverover_recursion_limit$.getDynamicValue(thread), ONE_INTEGER), thread);
                        {
                            SubLObject hoverover_html = NIL;
                            SubLObject stream = NIL;
                            try {
                                stream = make_private_string_output_stream();
                                {
                                    SubLObject _prev_bind_0_57 = html_macros.$html_stream$.currentBinding(thread);
                                    try {
                                        html_macros.$html_stream$.bind(stream, thread);
                                        cb_uiat_concept_clarifier_page_for_hoverover(v_term, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_stream$.rebind(_prev_bind_0_57, thread);
                                    }
                                }
                                hoverover_html = get_output_stream_string(stream);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_58 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        close(stream, UNPROVIDED);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_58, thread);
                                    }
                                }
                            }
                            {
                                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                                if (hoverover_html.isString()) {
                                    {
                                        SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover(hoverover_html, $str_alt95$_, $int$300, T);
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        cb_parameters.cyc_cgi_url_int();
                                        {
                                            SubLObject arglist = list(v_term);
                                            cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt94$cb_uia_concept_clarifier, arglist);
                                        }
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != frame_name_var) {
                                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(frame_name_var);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(onmouseover);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt97$nd___);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(linktext);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                }
                            }
                        }
                    } finally {
                        html_script_utilities.$cb_hoverover_recursion_limit$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_concept_clarifier(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt100);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $CONCEPT_CLARIFIER, $LAUNCH, list($TERM, v_term));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt100);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_concept_clarifier_fort_id(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject fort_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt102);
            fort_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject fort = cb_utilities.cb_guess_fort(fort_id, UNPROVIDED);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $CONCEPT_CLARIFIER, $LAUNCH, list($TERM, fort));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt102);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_add_term_to_scrap_book(SubLObject v_term, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(v_term);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt105$cb_uia_add_term_to_scrap_book, arglist);
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

    public static final SubLObject cb_uia_add_term_to_scrap_book(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt100);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $KNOWLEDGE_SCRAPBOOK, $ADD, list($ENTITY, v_term, $TYPE, $TERM));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt100);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_sentence_clarifier_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW_GAF)) {
                    {
                        SubLObject datum_60 = plist;
                        SubLObject current_61 = datum_60;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_61;
                        SubLObject bad = NIL;
                        SubLObject current_62 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_60, $list_alt115);
                            current_62 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_60, $list_alt115);
                            if (NIL == member(current_62, $list_alt116, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_62 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_60, $list_alt115);
                        }
                        {
                            SubLObject sentence_tail = property_list_member($SENTENCE, current_61);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject unassertible_tail = property_list_member($UNASSERTIBLE, current_61);
                            SubLObject unassertible = (NIL != unassertible_tail) ? ((SubLObject) (cadr(unassertible_tail))) : NIL;
                            SubLObject known_tail = property_list_member($KNOWN, current_61);
                            SubLObject known = (NIL != known_tail) ? ((SubLObject) (cadr(known_tail))) : NIL;
                            SubLObject justification_tail = property_list_member($JUSTIFICATION, current_61);
                            SubLObject justification = (NIL != justification_tail) ? ((SubLObject) (cadr(justification_tail))) : NIL;
                            SubLObject select_tail = property_list_member($SELECT, current_61);
                            SubLObject select = (NIL != select_tail) ? ((SubLObject) (cadr(select_tail))) : NIL;
                            SubLObject term_phrase_mappings_tail = property_list_member($TERM_PHRASE_MAPPINGS, current_61);
                            SubLObject term_phrase_mappings = (NIL != term_phrase_mappings_tail) ? ((SubLObject) (cadr(term_phrase_mappings_tail))) : NIL;
                            return cb_uiat_sentence_clarifier_gaf_guts(user_interaction_agenda.ui_agenda(interaction), interaction, sentence, unassertible, known, justification, misc_utilities.keyword_to_boolean(select), term_phrase_mappings);
                        }
                    }
                } else
                    if (pcase_var.eql($SHOW_RULE)) {
                        {
                            SubLObject datum_63 = plist;
                            SubLObject current_64 = datum_63;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_64;
                            SubLObject bad = NIL;
                            SubLObject current_65 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_63, $list_alt123);
                                current_65 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_63, $list_alt123);
                                if (NIL == member(current_65, $list_alt124, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_65 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_63, $list_alt123);
                            }
                            {
                                SubLObject sentence_tail = property_list_member($SENTENCE, current_64);
                                SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                                SubLObject unassertible_tail = property_list_member($UNASSERTIBLE, current_64);
                                SubLObject unassertible = (NIL != unassertible_tail) ? ((SubLObject) (cadr(unassertible_tail))) : NIL;
                                SubLObject term_phrase_mappings_tail = property_list_member($TERM_PHRASE_MAPPINGS, current_64);
                                SubLObject term_phrase_mappings = (NIL != term_phrase_mappings_tail) ? ((SubLObject) (cadr(term_phrase_mappings_tail))) : NIL;
                                SubLObject assertion_tail = property_list_member($ASSERTION, current_64);
                                SubLObject assertion = (NIL != assertion_tail) ? ((SubLObject) (cadr(assertion_tail))) : NIL;
                                return cb_uiat_sentence_clarifier_rule_guts(user_interaction_agenda.ui_agenda(interaction), interaction, sentence, unassertible, term_phrase_mappings, assertion);
                            }
                        }
                    } else
                        if (pcase_var.eql($SHOW_QUESTION)) {
                            {
                                SubLObject datum_66 = plist;
                                SubLObject current_67 = datum_66;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_67;
                                SubLObject bad = NIL;
                                SubLObject current_68 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_66, $list_alt127);
                                    current_68 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_66, $list_alt127);
                                    if (NIL == member(current_68, $list_alt128, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_68 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_66, $list_alt127);
                                }
                                {
                                    SubLObject query_sentence_tail = property_list_member($QUERY_SENTENCE, current_67);
                                    SubLObject query_sentence = (NIL != query_sentence_tail) ? ((SubLObject) (cadr(query_sentence_tail))) : NIL;
                                    SubLObject no_vars_tail = property_list_member($NO_VARS, current_67);
                                    SubLObject no_vars = (NIL != no_vars_tail) ? ((SubLObject) (cadr(no_vars_tail))) : NIL;
                                    SubLObject term_phrase_mappings_tail = property_list_member($TERM_PHRASE_MAPPINGS, current_67);
                                    SubLObject term_phrase_mappings = (NIL != term_phrase_mappings_tail) ? ((SubLObject) (cadr(term_phrase_mappings_tail))) : NIL;
                                    return cb_uiat_sentence_clarifier_question_guts(user_interaction_agenda.ui_agenda(interaction), interaction, query_sentence, no_vars, term_phrase_mappings);
                                }
                            }
                        }


            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_sentence_clarifier_gaf_guts(SubLObject v_agenda, SubLObject interaction, SubLObject cycl_sentence, SubLObject unassertible, SubLObject known, SubLObject justification, SubLObject selectP, SubLObject term_phrase_mappings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                        html_utilities.html_hidden_input($str_alt131$cb_uiat_sentence_clarifier_handle, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_hidden_input($str_alt133$cycl_sentence, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, cycl_sentence), UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        cb_uia_macros.cb_uiat_document_expiration();
                        cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        {
                            SubLObject _prev_bind_0_69 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                            html_script_utilities.html_js_focus_window();
                                        }
                                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        if ($TRUE == unassertible) {
                                            html_utilities.html_princ($str_alt134$You_told_me_the_following_fact_);
                                        } else
                                            if ($TRUE == known) {
                                                html_utilities.html_princ($str_alt135$I_know_the_following_fact_);
                                            } else {
                                                html_utilities.html_princ($str_alt136$The_following_is_a_sentence_which);
                                            }

                                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        cb_uia_display_primitives.cb_uia_fancy_show_sentence(cycl_sentence, list($TERM_PHRASE_MAPPINGS, term_phrase_mappings));
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        if (NIL != justification) {
                                            cb_uia_tools_misc.cb_uiat_showXhide_sentence_justification(v_agenda, cycl_sentence, justification, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                        {
                                            SubLObject precise_raw_html = NIL;
                                            {
                                                SubLObject _prev_bind_0_71 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                                                try {
                                                    pph_vars.$pph_term_paraphrase_map$.bind(term_phrase_mappings, thread);
                                                    precise_raw_html = uia_trampolines.uia_html_sentence_phrase_precise(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0_71, thread);
                                                }
                                            }
                                            if (!precise_raw_html.equal(uia_trampolines.uia_html_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED))) {
                                                html_utilities.html_princ($str_alt137$More_precisely__);
                                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_markup(precise_raw_html);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
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
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != selectP) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(THREE_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                    cb_utilities.cb_link($UIA_SENTENCE_FINDER_THROW, cycl_sentence, NIL, NIL, NIL, NIL);
                                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                                if (NIL == disable_uia_sentence_editingP(cycl_sentence)) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(THREE_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_uia_display_primitives.cb_uia_show_arg_type_warning_for_sentence_strong(cycl_sentence, v_agenda);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_utilities.cb_link($UIA_SIMILAR_ASSERTION, cycl_sentence, $str_alt140$_Create_Similar_Fact_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_utilities.cb_link($UIA_SIMILAR_QUESTION, cycl_sentence, $str_alt142$_Ask_Similar_Question_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_utilities.cb_link($UIA_SIMILAR_SENTENCE, cycl_sentence, $str_alt144$_See__without_asserting__Similar_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_utilities.cb_link($UIA_ADD_ASSERTION_TO_SCRAP_BOOK, cycl_sentence, $str_alt36$_Add_to_Scrapbook_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        {
                                                            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(cycl_sentence);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_utilities.cb_link($UIA_CONCEPT_CLARIFIER, predicate, $str_alt146$_Examine_This_Predicate_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_utilities.cb_link($UIA_LEXIFICATION_WIZARD_GUTS, predicate, $str_alt147$_Lexify_This_Predicate_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject variationsP = uia_trampolines.uia_sentence_has_variations(v_agenda, cycl_sentence, UNPROVIDED);
                                                            if (NIL != variationsP) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        cb_utilities.cb_link($UIA_SENTENCE_VARIATIONS, cycl_sentence, $str_alt149$_Variations_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            }
                                                            if ($TRUE == unassertible) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        cb_utilities.cb_link($UIA_ASSERTION_PRECISION_EDITOR, cycl_sentence, $str_alt151$_Strengthen_Weaken_This_Fact_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_utilities.cb_link($UIA_SHOW_CYCL, cycl_sentence, $str_alt37$_OE_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    html_utilities.html_princ($str_alt153$__for_Cycorp_employees_only_);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if ($TRUE != known) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_submit_input($$$New_Fact, $$$assert, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent(TWO_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt156$I_want_to_tell_you_the_above_fact);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_submit_input($$$Relate_this, $$$relate, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_indent(TWO_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt159$I_want_to_relate_this_fact_to_ano);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                if ($TRUE == unassertible) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_submit_input($$$Forget_This, $$$unassert, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent(TWO_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt162$I_want_you_to_forget_the_above_se);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_newline(TWO_INTEGER);
                                        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_69, thread);
                            }
                        }
                        cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            return cycl_sentence;
        }
    }

    public static final SubLObject cb_uiat_sentence_clarifier_rule_guts(SubLObject v_agenda, SubLObject interaction, SubLObject cycl_sentence, SubLObject unassertible, SubLObject term_phrase_mappings, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (($TRUE == unassertible) && (NIL == assertion_handles.assertion_p(assertion))) {
                assertion = czer_meta.find_assertion_cycl(cycl_sentence, user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
            }
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
                        html_utilities.html_hidden_input($str_alt131$cb_uiat_sentence_clarifier_handle, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_hidden_input($str_alt133$cycl_sentence, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, cycl_sentence), UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        cb_uia_macros.cb_uiat_document_expiration();
                        cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        {
                            SubLObject _prev_bind_0_102 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                            html_script_utilities.html_js_focus_window();
                                        }
                                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        if ($TRUE == unassertible) {
                                            html_utilities.html_princ($str_alt163$You_told_me_the_following_rule_);
                                        } else {
                                            html_utilities.html_princ($str_alt164$The_following_is_either_a_rule_th);
                                        }
                                        {
                                            SubLObject _prev_bind_0_104 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                                            try {
                                                pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                cb_uia_display_primitives.cb_uia_fancy_show_sentence(cycl_sentence, list($TERM_PHRASE_MAPPINGS, term_phrase_mappings));
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                            } finally {
                                                pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_104, thread);
                                            }
                                        }
                                        cb_uiat_sentence_clarifier_rule_links(assertion, cycl_sentence, unassertible);
                                        cb_uiat_sentence_clarifier_rule_clauses(interaction, cycl_sentence);
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_102, thread);
                            }
                        }
                        cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            return cycl_sentence;
        }
    }

    /**
     * Display the clauses of RULE-SENTENCE.
     */
    public static final SubLObject cb_uiat_sentence_clarifier_rule_clauses(SubLObject interaction, SubLObject rule_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject cnfs = clausifier.cnf_clausal_form(uia_trampolines.uia_existentially_unbind(v_agenda, rule_sentence), user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
                SubLObject object_id = $str_alt165$rule_clauses;
                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt166$text_css);
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
                        html_utilities.html_terpri(UNPROVIDED);
                        dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
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
                dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $$$Rule_Clauses);
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
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject cdolist_list_var = cnfs;
                                    SubLObject cnf = NIL;
                                    for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                                        {
                                            SubLObject cdolist_list_var_106 = clauses.neg_lits(cnf);
                                            SubLObject neg_lit = NIL;
                                            for (neg_lit = cdolist_list_var_106.first(); NIL != cdolist_list_var_106; cdolist_list_var_106 = cdolist_list_var_106.rest() , neg_lit = cdolist_list_var_106.first()) {
                                                cb_uiat_sentence_clarifier_show_rule_lit(interaction, neg_lit);
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var_107 = clauses.pos_lits(cnf);
                                            SubLObject pos_lit = NIL;
                                            for (pos_lit = cdolist_list_var_107.first(); NIL != cdolist_list_var_107; cdolist_list_var_107 = cdolist_list_var_107.rest() , pos_lit = cdolist_list_var_107.first()) {
                                                cb_uiat_sentence_clarifier_show_rule_lit(interaction, pos_lit);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_105, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            }
            return interaction;
        }
    }

    /**
     * Display one literal.
     */
    public static final SubLObject cb_uiat_sentence_clarifier_show_rule_lit(SubLObject interaction, SubLObject lit) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bound_lit = uia_tools_browsing.uiat_instantiate_variables(interaction, lit);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_108 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_uia_display_primitives.cb_uia_show_sentence(bound_lit, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_108, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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

    public static final SubLObject cb_uiat_sentence_clarifier_rule_links(SubLObject assertion, SubLObject cycl_sentence, SubLObject unassertible) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
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
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_109 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_110 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != assertion_handles.assertion_p(assertion)) {
                                        cb_utilities.cb_link($UIA_SALIENT_DESCRIPTOR_REQUIRED, assertion, $str_alt30$_Interview_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_110, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_111 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_utilities.cb_link($UIA_SIMILAR_ASSERTION, cycl_sentence, $str_alt172$_Tweak_Similar_Rule_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_111, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            if (NIL != rkf_rule_constructor.rc_valid_implication(cycl_sentence)) {
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_112 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_utilities.cb_link($UIA_RULE_CONSTRUCTOR_FROM_CYCL, cycl_sentence, $str_alt174$_Construct_Similar_Rule_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_112, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_113 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_utilities.cb_link($UIA_SIMILAR_SENTENCE, cycl_sentence, $str_alt175$_See__without_asserting__Similar_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_113, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_109, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_114 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_115 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_utilities.cb_link($UIA_ADD_ASSERTION_TO_SCRAP_BOOK, cycl_sentence, $str_alt36$_Add_to_Scrapbook_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_115, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            if (NIL != el_utilities.el_implication_p(cycl_sentence)) {
                                {
                                    SubLObject antecedent = cycl_utilities.formula_arg1(cycl_sentence, UNPROVIDED);
                                    SubLObject consequent = cycl_utilities.formula_arg2(cycl_sentence, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_116 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_link($UIA_SIMILAR_QUESTION, antecedent, $str_alt176$_Ask_if_part_as_Question_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_116, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_117 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_link($UIA_SIMILAR_QUESTION, consequent, $str_alt177$_Ask_else_part_as_Question_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_117, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                            } else
                                if (NIL == el_utilities.cyc_const_logical_operator_p(cycl_utilities.formula_operator(cycl_sentence))) {
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_118 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_link($UIA_SIMILAR_QUESTION, cycl_sentence, $str_alt142$_Ask_Similar_Question_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_118, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }

                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_119 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_utilities.cb_link($UIA_SHOW_CYCL, cycl_sentence, $str_alt37$_OE_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_princ($str_alt38$__for_Cyclists_only_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_119, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_114, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_120 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_121 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_submit_input($$$Relate_this, $$$relate, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_121, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(TWO_INTEGER);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_122 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($str_alt159$I_want_to_relate_this_fact_to_ano);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_122, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_120, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    if ($TRUE == unassertible) {
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_123 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_124 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_submit_input($$$Forget_This, $$$unassert, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_124, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_125 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt178$I_want_you_to_forget_the_above_ru);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_125, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_123, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return assertion;
        }
    }

    public static final SubLObject cb_uiat_sentence_clarifier_question_guts(SubLObject v_agenda, SubLObject interaction, SubLObject query_sentence, SubLObject no_vars, SubLObject term_phrase_mappings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                        html_utilities.html_hidden_input($str_alt131$cb_uiat_sentence_clarifier_handle, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        html_utilities.html_hidden_input($str_alt133$cycl_sentence, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, query_sentence), UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        cb_uia_macros.cb_uiat_document_expiration();
                        cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        {
                            SubLObject _prev_bind_0_126 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_127 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                            html_script_utilities.html_js_focus_window();
                                        }
                                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_princ($str_alt179$The_following_is_a_question_that_);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        cb_uia_display_primitives.cb_uia_fancy_show_sentence(query_sentence, list($TERM_PHRASE_MAPPINGS, term_phrase_mappings, $FORCE, $QUESTION));
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
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
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_128 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_129 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_130 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_utilities.cb_link($UIA_SIMILAR_QUESTION, query_sentence, $str_alt142$_Ask_Similar_Question_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_130, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_131 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_utilities.cb_link($UIA_SIMILAR_ASSERTION, no_vars, $str_alt140$_Create_Similar_Fact_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_131, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_132 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_utilities.cb_link($UIA_SIMILAR_SENTENCE, no_vars, $str_alt144$_See__without_asserting__Similar_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_132, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_129, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_128, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_127, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_126, thread);
                            }
                        }
                        cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            return query_sentence;
        }
    }

    /**
     * List of predicate types which should not be edited by Sentence Cloner in UIA
     *
     * @unknown NLPredicate's are disabled since the parser currently cannot handle
    the paraphrases (e.g., quoted string support)
     */
    // deflexical
    public static final SubLSymbol $predicate_types_not_uia_editable$ = makeSymbol("*PREDICATE-TYPES-NOT-UIA-EDITABLE*");

    /**
     *
     *
     * @return boolean ; whether editing of CYCL-SENTENCE should not be enabled
     */
    public static final SubLObject disable_uia_sentence_editingP(SubLObject cycl_sentence) {
        {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(cycl_sentence);
            SubLObject disableP = NIL;
            if (NIL == disableP) {
                {
                    SubLObject csome_list_var = $predicate_types_not_uia_editable$.getGlobalValue();
                    SubLObject skip_type = NIL;
                    for (skip_type = csome_list_var.first(); !((NIL != disableP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , skip_type = csome_list_var.first()) {
                        disableP = isa.isa_in_any_mtP(predicate, skip_type);
                    }
                }
            }
            return disableP;
        }
    }

    public static final SubLObject cb_uiat_sentence_clarifier_page_for_hoverover(SubLObject cycl_sentence, SubLObject verbose, SubLObject force) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        if (force == UNPROVIDED) {
            force = $DECLARATIVE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject atomicP = el_utilities.atomic_sentenceP(cycl_sentence);
                SubLObject predicate = (NIL != atomicP) ? ((SubLObject) (cycl_utilities.atomic_sentence_predicate(cycl_sentence))) : NIL;
                SubLObject unassertible = (NIL != verbose) ? ((SubLObject) (misc_utilities.boolean_to_keyword(uia_trampolines.uia_unassertibleP(v_agenda, cycl_sentence)))) : $TRUE;
                SubLObject term_phrase_mappings = uia_tools_basic.uia_sentence_finder_indexical_table_peek(v_agenda);
                if (NIL != el_utilities.cafP(cycl_sentence)) {
                    {
                        SubLObject known = misc_utilities.boolean_to_keyword(makeBoolean(($TRUE == unassertible) || (NIL != uia_trampolines.uia_knownP(v_agenda, cycl_sentence, UNPROVIDED))));
                        if (NIL != verbose) {
                            if ($QUESTION == force) {
                                html_utilities.html_princ($str_alt179$The_following_is_a_question_that_);
                            } else
                                if ($TRUE == unassertible) {
                                    html_utilities.html_princ($str_alt134$You_told_me_the_following_fact_);
                                } else
                                    if ($TRUE == known) {
                                        html_utilities.html_princ($str_alt135$I_know_the_following_fact_);
                                    } else {
                                        html_utilities.html_princ($str_alt136$The_following_is_a_sentence_which);
                                    }


                            html_utilities.html_newline(TWO_INTEGER);
                        }
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
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
                                    SubLObject _prev_bind_0_133 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_134 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt77$Meaning__);
                                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_134, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_135 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                cb_uia_display_primitives.cb_uia_fancy_show_sentence(cycl_sentence, list($SENTENCE_LINK, $NONE, $TERM_PHRASE_MAPPINGS, term_phrase_mappings, $FORCE, force));
                                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_135, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_133, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                if ($DECLARATIVE == force) {
                                    {
                                        SubLObject precise_raw_html = NIL;
                                        {
                                            SubLObject _prev_bind_0_136 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                                            try {
                                                pph_vars.$pph_term_paraphrase_map$.bind(term_phrase_mappings, thread);
                                                precise_raw_html = uia_trampolines.uia_html_sentence_phrase_precise(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0_136, thread);
                                            }
                                        }
                                        if (!precise_raw_html.equal(uia_trampolines.uia_html_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED))) {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_137 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_138 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt79$Precisely__);
                                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_138, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_139 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                            html_utilities.html_markup(precise_raw_html);
                                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_139, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_137, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_140 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_141 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt80$CycL__);
                                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_142 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                        cb_utilities.cb_form(cycl_sentence, ZERO_INTEGER, T);
                                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_142, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_141, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_140, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                {
                                    SubLObject warning_string = uia_tools_basic.uiat_arg_type_warning_string_for_sentence(cycl_sentence, v_agenda);
                                    if (warning_string.isString()) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_143 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_144 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt186$Note__);
                                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_144, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_145 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                        html_utilities.html_princ(warning_string);
                                                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_145, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_143, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        if (NIL != forts.fort_p(predicate)) {
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_utilities.cb_link($UIA_CONCEPT_CLARIFIER, predicate, $str_alt187$_Examine_Predicate_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_utilities.html_princ($str_alt95$_);
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_utilities.cb_link($UIA_SENTENCE_CLARIFIER, cycl_sentence, $str_alt189$_Examine_Entire_Sentence_, force, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_princ($str_alt95$_);
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_utilities.cb_link($REPORT_GENERIC_PROBLEM, $str_alt191$_Report_Bad_Generation_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_princ($str_alt95$_);
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    }
                } else {
                    if (NIL != verbose) {
                        if ($QUESTION == force) {
                            html_utilities.html_princ($str_alt179$The_following_is_a_question_that_);
                        } else
                            if ($TRUE == unassertible) {
                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt163$You_told_me_the_following_rule_);
                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                            } else {
                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt164$The_following_is_either_a_rule_th);
                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                            }

                        html_utilities.html_newline(TWO_INTEGER);
                    }
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($LEFT));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(ZERO_INTEGER);
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
                                SubLObject _prev_bind_0_146 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_147 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt77$Meaning__);
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_147, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_148 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            cb_uia_display_primitives.cb_uia_fancy_show_sentence(cycl_sentence, list($TERM_PHRASE_MAPPINGS, term_phrase_mappings, $FORCE, force));
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_148, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_146, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_149 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_150 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt80$CycL__);
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_150, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_151 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            cb_utilities.cb_form(cycl_sentence, ZERO_INTEGER, T);
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_151, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_149, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_utilities.html_newline(TWO_INTEGER);
                    html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_sentence_clarifier_handler(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject cycl_sentence = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input($str_alt133$cycl_sentence, args));
            SubLObject nl_sentence = uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
            SubLObject num_args = el_utilities.formula_arity(cycl_sentence, UNPROVIDED);
            SubLObject assertion_creatorP = list_utilities.sublisp_boolean(html_utilities.html_extract_input($$$assert, args));
            SubLObject unassertP = list_utilities.sublisp_boolean(html_utilities.html_extract_input($$$unassert, args));
            SubLObject relateP = list_utilities.sublisp_boolean(html_utilities.html_extract_input($$$relate, args));
            SubLObject reply = NIL;
            if (NIL != assertion_creatorP) {
                reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $ASSERTION_CREATOR, $LAUNCH, list($NL_SENTENCE, nl_sentence, $CYCL_SENTENCE, cycl_sentence));
            } else
                if (NIL != unassertP) {
                    reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $ASSERTION_KILLER, $LAUNCH, list($SENTENCE, cycl_sentence));
                } else
                    if (NIL != relateP) {
                        reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $SENTENCE_RELATOR, $LAUNCH, list($SENT_A, cycl_sentence));
                    } else {
                        {
                            SubLObject index = NIL;
                            for (index = ZERO_INTEGER; index.numL(num_args); index = add(index, ONE_INTEGER)) {
                                {
                                    SubLObject name = cconcatenate($$$similar, string_utilities.str(index));
                                    SubLObject this_oneP = list_utilities.sublisp_boolean(html_utilities.html_extract_input(name, args));
                                    if (NIL != this_oneP) {
                                        {
                                            SubLObject input_name = cconcatenate($$$input, string_utilities.str(index));
                                            SubLObject new_term_string = html_utilities.html_extract_input(input_name, args);
                                            SubLObject argnum = add(ONE_INTEGER, index);
                                            reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $SIMILAR_ASSERTION, $LAUNCH, list($SENTENCE, cycl_sentence, $ARGNUM, argnum, $NEW_TERM_PHRASE, new_term_string));
                                        }
                                    }
                                }
                            }
                        }
                    }


            if (NIL != reply) {
                return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            } else {
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            }
        }
    }

    public static final SubLObject cb_link_uia_sentence_clarifier(SubLObject cycl_sentence, SubLObject linktext, SubLObject force) {
        if (force == UNPROVIDED) {
            force = $DECLARATIVE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != html_script_utilities.cb_hoverover_recursion_disallowedP()) || (NIL == html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread))) {
                {
                    SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    cb_parameters.cyc_cgi_url_int();
                    {
                        SubLObject arglist = list(cycl_sentence, force);
                        cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt204$cb_uiat_sentence_clarifier_link_h, arglist);
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
            } else {
                {
                    SubLObject _prev_bind_0 = html_script_utilities.$cb_hoverover_recursion_limit$.currentBinding(thread);
                    try {
                        html_script_utilities.$cb_hoverover_recursion_limit$.bind(subtract(html_script_utilities.$cb_hoverover_recursion_limit$.getDynamicValue(thread), ONE_INTEGER), thread);
                        {
                            SubLObject hoverover_html = NIL;
                            SubLObject stream = NIL;
                            try {
                                stream = make_private_string_output_stream();
                                {
                                    SubLObject _prev_bind_0_152 = html_macros.$html_stream$.currentBinding(thread);
                                    try {
                                        html_macros.$html_stream$.bind(stream, thread);
                                        cb_uiat_sentence_clarifier_page_for_hoverover(cycl_sentence, NIL, force);
                                    } finally {
                                        html_macros.$html_stream$.rebind(_prev_bind_0_152, thread);
                                    }
                                }
                                hoverover_html = get_output_stream_string(stream);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_153 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        close(stream, UNPROVIDED);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_153, thread);
                                    }
                                }
                            }
                            {
                                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                                if (hoverover_html.isString()) {
                                    {
                                        SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover(hoverover_html, $str_alt95$_, $int$400, T);
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        cb_parameters.cyc_cgi_url_int();
                                        {
                                            SubLObject arglist = list(cycl_sentence, force);
                                            cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt204$cb_uiat_sentence_clarifier_link_h, arglist);
                                        }
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != frame_name_var) {
                                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(frame_name_var);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(onmouseover);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt97$nd___);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_154 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ(linktext);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_154, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                }
                            }
                        }
                    } finally {
                        html_script_utilities.$cb_hoverover_recursion_limit$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_display_non_linking_sentence_hoverover(SubLObject cycl_sentence, SubLObject force, SubLObject linktext) {
        if (force == UNPROVIDED) {
            force = $DECLARATIVE;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt207$___;
            }
            {
                SubLObject _prev_bind_0 = html_script_utilities.$cb_hoverover_recursion_limit$.currentBinding(thread);
                try {
                    html_script_utilities.$cb_hoverover_recursion_limit$.bind(subtract(html_script_utilities.$cb_hoverover_recursion_limit$.getDynamicValue(thread), ONE_INTEGER), thread);
                    {
                        SubLObject hoverover_html = NIL;
                        SubLObject stream = NIL;
                        try {
                            stream = make_private_string_output_stream();
                            {
                                SubLObject _prev_bind_0_155 = html_macros.$html_stream$.currentBinding(thread);
                                try {
                                    html_macros.$html_stream$.bind(stream, thread);
                                    cb_uiat_sentence_clarifier_page_for_hoverover(cycl_sentence, NIL, force);
                                } finally {
                                    html_macros.$html_stream$.rebind(_prev_bind_0_155, thread);
                                }
                            }
                            hoverover_html = get_output_stream_string(stream);
                        } finally {
                            {
                                SubLObject _prev_bind_0_156 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    close(stream, UNPROVIDED);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_156, thread);
                                }
                            }
                        }
                        {
                            SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                            if (hoverover_html.isString()) {
                                {
                                    SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover(hoverover_html, $str_alt95$_, $int$400, T);
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    cb_parameters.cyc_cgi_url_int();
                                    html_utilities.html_princ($str_alt208$cb_uia_next_interaction);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != frame_name_var) {
                                        html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(frame_name_var);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(onmouseover);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt97$nd___);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_157 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(linktext);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_157, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                            }
                        }
                    }
                } finally {
                    html_script_utilities.$cb_hoverover_recursion_limit$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_sentence_clarifier_link_handler(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            SubLObject force = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt209);
            cycl_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt209);
            force = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $SENTENCE_CLARIFIER, $LAUNCH, list($SENTENCE, cycl_sentence, $FORCE, force));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt209);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_add_assertion_to_scrap_book(SubLObject cycl_sentence, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(cycl_sentence);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt211$cb_uiat_add_assertion_to_scrap_bo, arglist);
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

    public static final SubLObject cb_uiat_add_assertion_to_scrap_book_handler(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt213);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $KNOWLEDGE_SCRAPBOOK, $ADD, list($TYPE, $SENTENCE, $ENTITY, cycl_sentence));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt213);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_assertion_precision_editor(SubLObject cycl_sentence, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(cycl_sentence);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt215$cb_uiat_assertion_precision_edito, arglist);
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

    public static final SubLObject cb_uiat_assertion_precision_editor_handler(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt213);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $ASSERTION_PRECISION_EDITOR, $LAUNCH, list($SENTENCE, cycl_sentence));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt213);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_show_cycl(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
                SubLObject current = datum;
                SubLObject cycl = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt219);
                cycl = current.first();
                current = current.rest();
                if (NIL == current) {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_158 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                        cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                    }
                                    if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                        html_script_utilities.cb_hoverover_page_init();
                                    }
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($$$Show_CycL);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_indent(FOUR_INTEGER);
                                    cb_utilities.cb_link($UIA_SHOW_CYCL, cycl, $str_alt221$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_newline(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt222$CycL__);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_newline(UNPROVIDED);
                                    cb_utilities.cb_form(cycl, ZERO_INTEGER, T);
                                    html_utilities.html_newline(UNPROVIDED);
                                    cb_uiat_show_cycl_sentence_translations(v_agenda, cycl);
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_158, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } else {
                    cdestructuring_bind_error(datum, $list_alt219);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_show_cycl(SubLObject cycl, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(cycl);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt224$cb_uiat_show_cycl, arglist);
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

    public static final SubLObject cb_uiat_show_cycl_sentence_translations(SubLObject v_agenda, SubLObject sentence) {
        {
            SubLObject generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
            SubLObject domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
            SubLObject raw_html = uia_trampolines.uia_html_sentence_phrase_memoized(sentence, generation_mt, domain_mt, UNPROVIDED);
            SubLObject precise_raw_html = uia_trampolines.uia_html_sentence_phrase_precise_memoized(sentence, generation_mt, domain_mt, UNPROVIDED);
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($str_alt226$Translation__);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            cb_uia_display_primitives.cb_uia_show_sentence_link(sentence, $str_alt227$___, UNPROVIDED);
            html_utilities.html_indent(UNPROVIDED);
            html_utilities.html_markup(raw_html);
            if (!raw_html.equal(precise_raw_html)) {
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt228$More_Precisely__);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(precise_raw_html);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_justification_browser_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_159 = plist;
                        SubLObject current_160 = datum_159;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_160;
                        SubLObject bad = NIL;
                        SubLObject current_161 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_159, $list_alt231);
                            current_161 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_159, $list_alt231);
                            if (NIL == member(current_161, $list_alt232, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_161 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_159, $list_alt231);
                        }
                        {
                            SubLObject inference_answer_tail = property_list_member($INFERENCE_ANSWER, current_160);
                            SubLObject inference_answer = (NIL != inference_answer_tail) ? ((SubLObject) (cadr(inference_answer_tail))) : NIL;
                            return cb_uiat_justification_browser_guts(interaction, inference_answer);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_justification_browser_guts(SubLObject interaction, SubLObject inference_answer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            cb_uia_macros.cb_uiat_document_expiration();
            cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_162 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                            }
                            if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                html_script_utilities.cb_hoverover_page_init();
                            }
                            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                html_script_utilities.html_js_focus_window();
                            }
                            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                            html_utilities.html_newline(UNPROVIDED);
                            cb_utilities.cb_link($UIAT_JUSTIFICATION_BROWSER_DONE, interaction, $str_alt235$_Done_Browsing_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_indent(TWO_INTEGER);
                            cb_utilities.cb_link($UIA_JUSTIFICATION_BROWSER, inference_answer, $str_alt221$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_indent(TWO_INTEGER);
                            cb_utilities.cb_link($INFERENCE_ANSWER, inference_answer, NIL, $str_alt237$_Browse_in_Inference_Browser_, $MAIN, UNPROVIDED);
                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_163 = pph_vars.$pph_significant_digits_cutoff$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_significant_digits_cutoff$.bind(FIVE_INTEGER, thread);
                                    {
                                        SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
                                        SubLObject query_sentence = inference_datastructures_inference.inference_input_el_query(inference);
                                        SubLObject dom_id = $str_alt239$el_query;
                                        {
                                            SubLObject _prev_bind_0_164 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                                            try {
                                                pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                dhtml_macros.dhtml_switch_visibility_links_arrows(dom_id, $str_alt240$Query_Formulation_);
                                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                dhtml_macros.dhtml_set_switched_visibility(dom_id, $INVISIBLE, $TEXT);
                                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                if (NIL != dom_id) {
                                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(dom_id);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_165 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_166 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                                                            try {
                                                                rkf_macros.$rkf_addressee$.bind($NONE, thread);
                                                                rkf_macros.$rkf_speaker$.bind(NIL, thread);
                                                                cb_uia_display_primitives.cb_uia_show_query_with_clarifying_link(query_sentence, UNPROVIDED);
                                                            } finally {
                                                                rkf_macros.$rkf_speaker$.rebind(_prev_bind_1, thread);
                                                                rkf_macros.$rkf_addressee$.rebind(_prev_bind_0_166, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_165, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_164, thread);
                                            }
                                        }
                                        {
                                            SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
                                            html_utilities.html_newline(TWO_INTEGER);
                                            if (NIL != v_bindings) {
                                                html_utilities.html_princ_strong($str_alt241$Answer_);
                                                html_utilities.html_newline(UNPROVIDED);
                                                cb_uia_show_bindings_vertical(v_bindings, UNPROVIDED);
                                            } else {
                                                html_utilities.html_princ_strong($str_alt242$Answer__Yes_);
                                                html_utilities.html_newline(UNPROVIDED);
                                            }
                                        }
                                        html_utilities.html_newline(ONE_INTEGER);
                                        html_utilities.html_princ_strong($str_alt243$Proof_s__);
                                        cb_uia_display_primitives.cb_uia_show_inference_answer_proofs(inference_answer);
                                    }
                                } finally {
                                    pph_vars.$pph_significant_digits_cutoff$.rebind(_prev_bind_0_163, thread);
                                }
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_162, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return interaction;
        }
    }

    /**
     * SHOW the bindings for SELECTED-VARIABLES of BINDINGS in a vertical table
     * SELECTED-VARIABLES must be a list of variables in BINDINGS or :ALL .
     * Bindings are shown in the order given by SELECTED-VARIABLES.
     * If SELECTED-VARIABLES is :ALL, the order given in BINDINGS is used.
     */
    public static final SubLObject cb_uia_show_bindings_vertical(SubLObject v_bindings, SubLObject selected_variables) {
        if (selected_variables == UNPROVIDED) {
            selected_variables = $ALL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ZERO_INTEGER);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
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
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if ($ALL == selected_variables) {
                        if (NIL != list_utilities.singletonP(v_bindings)) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_167 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_168 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject datum = v_bindings.first();
                                                SubLObject current = datum;
                                                SubLObject variable = NIL;
                                                SubLObject value = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt245);
                                                variable = current.first();
                                                current = current.rest();
                                                value = current;
                                                cb_uia_display_primitives.cb_uia_show_term(variable, UNPROVIDED);
                                                html_utilities.html_glyph($NBSP, UNPROVIDED);
                                                html_utilities.html_glyph($RIGHTWARDS_ARROW, UNPROVIDED);
                                                html_utilities.html_glyph($NBSP, UNPROVIDED);
                                                cb_uia_display_primitives.cb_uia_show_term(value, UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_168, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_167, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } else {
                            {
                                SubLObject cdolist_list_var = v_bindings;
                                SubLObject binding = NIL;
                                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                                    cb_uia_show_binding_vertical(binding);
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject cdolist_list_var = selected_variables;
                            SubLObject selected_variable = NIL;
                            for (selected_variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , selected_variable = cdolist_list_var.first()) {
                                {
                                    SubLObject binding = bindings.get_variable_binding(selected_variable, v_bindings);
                                    if (NIL != binding) {
                                        cb_uia_show_binding_vertical(binding);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_uia_show_binding_vertical(SubLObject binding) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = binding;
                SubLObject current = datum;
                SubLObject variable = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt245);
                variable = current.first();
                current = current.rest();
                value = current;
                {
                    SubLObject valign = $BOTTOM;
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != valign) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(valign));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_169 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_uia_display_primitives.cb_uia_show_term(variable, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_169, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != valign) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(valign));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_170 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_glyph($NBSP, UNPROVIDED);
                                    html_utilities.html_glyph($RIGHTWARDS_ARROW, UNPROVIDED);
                                    html_utilities.html_glyph($NBSP, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_170, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != valign) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align(valign));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_171 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_uia_display_primitives.cb_uia_show_term(value, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_171, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return binding;
        }
    }

    public static final SubLObject cb_link_uiat_justification_browser_done(SubLObject interaction, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt251$cb_uiat_justification_browser_don, arglist);
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

    public static final SubLObject cb_uiat_justification_browser_done(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt253);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DONE, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt253);
            }
        }
        return NIL;
    }

    /**
     * Start up the UIA with a justification browser for INFERENCE-ANSWER pushed onto the current agenda.
     */
    public static final SubLObject cb_link_uia_justification_browser_external(SubLObject inference_answer, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = $str_alt256$_Browse_Justification_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(inference_answer);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt257$cb_uiat_justification_browser_lin, arglist);
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

    public static final SubLObject cb_uiat_justification_browser_link_handler_external(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject inference_answer = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt260);
            inference_answer = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    if (NIL == cb_uiat_justification_browser_nextP(v_agenda, inference_answer)) {
                        uia_tools_browsing.uia_act_new_justification_browser(v_agenda, $REQUIRED, inference_answer);
                    }
                    return cb_user_interaction_agenda.cb_uia_start(UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt260);
            }
        }
        return NIL;
    }

    /**
     * Check if we already have a justification browser for INFERENCE-ANSWER.
     */
    public static final SubLObject cb_uiat_justification_browser_nextP(SubLObject v_agenda, SubLObject inference_answer) {
        {
            SubLObject next_action = user_interaction_agenda.uia_next_action(v_agenda);
            return makeBoolean(((NIL != user_interaction_agenda.user_interaction_p(next_action)) && (user_interaction_agenda.ui_operator(next_action) == $JUSTIFICATION_BROWSER)) && (user_interaction_agenda.ui_args(next_action).first() == inference_answer));
        }
    }

    /**
     * Push a justification browser for INFERENCE-ANSWER onto the current agenda and display it.
     */
    public static final SubLObject cb_link_uia_justification_browser(SubLObject inference_answer, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = $str_alt256$_Browse_Justification_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(inference_answer);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt263$cb_uiat_justification_browser_lin, arglist);
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

    public static final SubLObject cb_uiat_justification_browser_link_handler(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject inference_answer = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt260);
            inference_answer = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    if (NIL != cb_uiat_justification_browser_nextP(v_agenda, inference_answer)) {
                        cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                    } else {
                        {
                            SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $JUSTIFICATION_BROWSER, $LAUNCH, list($INFERENCE_ANSWER, inference_answer));
                            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt260);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_sentence_variations_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_172 = plist;
                        SubLObject current_173 = datum_172;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_173;
                        SubLObject bad = NIL;
                        SubLObject current_174 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_172, $list_alt268);
                            current_174 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_172, $list_alt268);
                            if (NIL == member(current_174, $list_alt269, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_174 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_172, $list_alt268);
                        }
                        {
                            SubLObject sentence_tail = property_list_member($SENTENCE, current_173);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject variations_tail = property_list_member($VARIATIONS, current_173);
                            SubLObject variations = (NIL != variations_tail) ? ((SubLObject) (cadr(variations_tail))) : NIL;
                            return cb_uiat_sentence_variations_show(interaction, sentence, variations);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_sentence_variations_show(SubLObject interaction, SubLObject sentence, SubLObject variations) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            cb_uia_macros.cb_uiat_document_expiration();
            cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_175 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                            }
                            if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                html_script_utilities.cb_hoverover_page_init();
                            }
                            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                html_script_utilities.html_js_focus_window();
                            }
                            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                            html_utilities.html_newline(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ($str_alt271$Sentence__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_indent(FOUR_INTEGER);
                            cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_indent(TWO_INTEGER);
                            html_utilities.html_newline(TWO_INTEGER);
                            cb_uia_display_primitives.cb_uia_show_sentence(sentence, UNPROVIDED);
                            html_utilities.html_newline(TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ($str_alt272$Variations__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            {
                                SubLObject cdolist_list_var = variations;
                                SubLObject variation = NIL;
                                for (variation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variation = cdolist_list_var.first()) {
                                    html_utilities.html_newline(TWO_INTEGER);
                                    cb_uia_display_primitives.cb_uia_show_sentence(variation, UNPROVIDED);
                                }
                            }
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_175, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_handle_sentence_variations(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt273);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                uia_tools_browsing.uia_act_new_sentence_variations(v_agenda, $REQUIRED, sentence);
                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            } else {
                cdestructuring_bind_error(datum, $list_alt273);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_uia_sentence_variations(SubLObject sentence, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(sentence);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt275$cb_uiat_handle_sentence_variation, arglist);
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

    public static final SubLObject cb_uiat_domain_examples_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_176 = plist;
                        SubLObject current_177 = datum_176;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_177;
                        SubLObject bad = NIL;
                        SubLObject current_178 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_176, $list_alt279);
                            current_178 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_176, $list_alt279);
                            if (NIL == member(current_178, $list_alt280, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_178 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_176, $list_alt279);
                        }
                        {
                            SubLObject sentence_sections_tail = property_list_member($SENTENCE_SECTIONS, current_177);
                            SubLObject sentence_sections = (NIL != sentence_sections_tail) ? ((SubLObject) (cadr(sentence_sections_tail))) : NIL;
                            SubLObject sample_sentence_tail = property_list_member($SAMPLE_SENTENCE, current_177);
                            SubLObject sample_sentence = (NIL != sample_sentence_tail) ? ((SubLObject) (cadr(sample_sentence_tail))) : NIL;
                            SubLObject filter_term_tail = property_list_member($FILTER_TERM, current_177);
                            SubLObject filter_term = (NIL != filter_term_tail) ? ((SubLObject) (cadr(filter_term_tail))) : NIL;
                            SubLObject sort_method_tail = property_list_member($SORT_METHOD, current_177);
                            SubLObject sort_method = (NIL != sort_method_tail) ? ((SubLObject) (cadr(sort_method_tail))) : NIL;
                            SubLObject subgraphs_tail = property_list_member($SUBGRAPHS, current_177);
                            SubLObject subgraphs = (NIL != subgraphs_tail) ? ((SubLObject) (cadr(subgraphs_tail))) : NIL;
                            return cb_uiat_domain_examples_show(interaction, sentence_sections, sample_sentence, filter_term, sort_method, subgraphs);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Show the examples in the individual sections.
     */
    public static final SubLObject cb_uiat_domain_examples_show(SubLObject interaction, SubLObject sentence_sections, SubLObject sample_sentence, SubLObject filter_term, SubLObject sort_method, SubLObject subgraphs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total_sections = length(sentence_sections);
                SubLObject include_indexP = makeBoolean(!ONE_INTEGER.numE(total_sections));
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
                        html_utilities.html_hidden_input($str_alt286$cb_uiat_handle_domain_examples_sh, T, UNPROVIDED);
                        cb_uiat_domain_examples_emit_doms(subgraphs);
                        cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                        cb_uiat_domain_examples_manipulate_section(interaction, sample_sentence, filter_term, sort_method);
                        cb_uiat_domain_examples_render_example_section(sentence_sections, include_indexP);
                        if (NIL == include_indexP) {
                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                            cb_uiat_domain_examples_goto_links(NIL);
                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        }
                        if (NIL != include_indexP) {
                            cb_uiat_domain_examples_render_index(sentence_sections);
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
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_domain_examples_emit_doms(SubLObject subgraphs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = NIL;
                for (id = ZERO_INTEGER; id.numL(subgraphs); id = add(id, ONE_INTEGER)) {
                    {
                        SubLObject subgraph_id = cb_uiat_domain_examples_generate_subgraph_id(id);
                        html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                        html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt166$text_css);
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
                                html_utilities.html_terpri(UNPROVIDED);
                                dhtml_macros.dhtml_dom_wrapper_preamble(subgraph_id);
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
                    }
                }
            }
            return subgraphs;
        }
    }

    public static final SubLObject cb_uiat_domain_examples_generate_subgraph_id(SubLObject id) {
        return format(NIL, $str_alt287$subgraph__A, id);
    }

    // defparameter
    private static final SubLSymbol $cb_uiat_domain_examples_current_subgraph_id$ = makeSymbol("*CB-UIAT-DOMAIN-EXAMPLES-CURRENT-SUBGRAPH-ID*");

    public static final SubLObject cb_uiat_domain_examples_next_subgraph_id() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subgraph_id = cb_uiat_domain_examples_generate_subgraph_id($cb_uiat_domain_examples_current_subgraph_id$.getDynamicValue(thread));
                $cb_uiat_domain_examples_current_subgraph_id$.setDynamicValue(add($cb_uiat_domain_examples_current_subgraph_id$.getDynamicValue(thread), ONE_INTEGER), thread);
                return subgraph_id;
            }
        }
    }

    public static final SubLObject cb_uiat_domain_examples_render_example_section(SubLObject sentence_sections, SubLObject include_indexP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $cb_uiat_domain_examples_current_subgraph_id$.currentBinding(thread);
                try {
                    $cb_uiat_domain_examples_current_subgraph_id$.bind(ZERO_INTEGER, thread);
                    {
                        SubLObject list_var = NIL;
                        SubLObject sentence_section = NIL;
                        SubLObject section_number = NIL;
                        for (list_var = sentence_sections, sentence_section = list_var.first(), section_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence_section = list_var.first() , section_number = add(ONE_INTEGER, section_number)) {
                            html_utilities.html_target_definition(format(NIL, $str_alt288$section__A, section_number));
                            if (ZERO_INTEGER.numE(section_number)) {
                                html_utilities.html_target_definition($$$start);
                            }
                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject datum = sentence_section;
                                SubLObject current = datum;
                                SubLObject section_key = NIL;
                                SubLObject sentence_infos = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt290);
                                section_key = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt290);
                                sentence_infos = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != section_key) {
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt291$Section__);
                                        html_utilities.html_indent(UNPROVIDED);
                                        cb_uia_display_primitives.cb_uia_show_term(section_key, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_indent(FOUR_INTEGER);
                                    }
                                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                    cb_uiat_domain_examples_goto_links(include_indexP);
                                    html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                    html_utilities.html_newline(TWO_INTEGER);
                                    {
                                        SubLObject list_var_179 = NIL;
                                        SubLObject sentence_info = NIL;
                                        SubLObject counter = NIL;
                                        for (list_var_179 = sentence_infos, sentence_info = list_var_179.first(), counter = ZERO_INTEGER; NIL != list_var_179; list_var_179 = list_var_179.rest() , sentence_info = list_var_179.first() , counter = add(ONE_INTEGER, counter)) {
                                            if (!counter.isZero()) {
                                                html_utilities.html_newline(TWO_INTEGER);
                                            }
                                            cb_uiat_domain_examples_render_sentence_info(sentence_info);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt290);
                                }
                            }
                        }
                    }
                } finally {
                    $cb_uiat_domain_examples_current_subgraph_id$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_target_definition($$$end);
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_domain_examples_render_sentence_info(SubLObject sentence_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = sentence_info;
                SubLObject current = datum;
                SubLObject sentence = NIL;
                SubLObject variationsP = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt293);
                sentence = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt293);
                variationsP = current.first();
                current = current.rest();
                {
                    SubLObject specs = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt293);
                    current = current.rest();
                    if (NIL == current) {
                        cb_uia_display_primitives.cb_uia_show_sentence(sentence, UNPROVIDED);
                        html_utilities.html_newline(UNPROVIDED);
                        cb_uia_display_primitives.cb_uia_show_arg_type_warning_for_sentence(sentence, cb_user_interaction_agenda.cb_current_uia());
                        if (NIL != variationsP) {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_utilities.cb_link($UIA_SENTENCE_VARIATIONS, sentence, $str_alt149$_Variations_, NIL, NIL, NIL);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_indent(TWO_INTEGER);
                        }
                        if (NIL != specs) {
                            {
                                SubLObject subgraph_id = cb_uiat_domain_examples_next_subgraph_id();
                                dhtml_macros.dhtml_switch_visibility_links_arrows(subgraph_id, $$$More_Specific_Examples);
                                dhtml_macros.dhtml_set_switched_visibility(subgraph_id, $INVISIBLE, $TEXT);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                if (NIL != subgraph_id) {
                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(subgraph_id);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                        {
                                            SubLObject list_var = NIL;
                                            SubLObject spec_sentence_info = NIL;
                                            SubLObject counter = NIL;
                                            for (list_var = specs, spec_sentence_info = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , spec_sentence_info = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                                                if (!counter.isZero()) {
                                                    html_utilities.html_newline(UNPROVIDED);
                                                }
                                                cb_uiat_domain_examples_render_sentence_info(spec_sentence_info);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt293);
                    }
                }
            }
            return sentence_info;
        }
    }

    public static final SubLObject cb_uiat_domain_examples_render_index(SubLObject sentence_sections) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_target_definition($$$index);
            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ($$$Section_Index);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_utilities.html_indent(FOUR_INTEGER);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            cb_uiat_domain_examples_goto_links(NIL);
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            {
                SubLObject list_var = NIL;
                SubLObject sentence_section = NIL;
                SubLObject section_number = NIL;
                for (list_var = sentence_sections, sentence_section = list_var.first(), section_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence_section = list_var.first() , section_number = add(ONE_INTEGER, section_number)) {
                    {
                        SubLObject datum = sentence_section;
                        SubLObject current = datum;
                        SubLObject section_key = NIL;
                        SubLObject sentences = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt297);
                        section_key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt297);
                        sentences = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != section_key) {
                                html_utilities.html_newline(UNPROVIDED);
                                {
                                    SubLObject target = cconcatenate($str_alt298$section_, string_utilities.to_string(section_number));
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_hash, UNPROVIDED);
                                    html_utilities.html_markup(target);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (section_key.isString()) {
                                                html_utilities.html_princ(section_key);
                                            } else {
                                                cb_uia_display_primitives.cb_uia_show_term_without_link(section_key, UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    html_utilities.html_indent(UNPROVIDED);
                                    if (NIL == list_utilities.singletonP(sentences)) {
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt299$__S_examples_, length(sentences));
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt297);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_domain_examples_goto_links(SubLObject include_indexP) {
        if (include_indexP == UNPROVIDED) {
            include_indexP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_hash, UNPROVIDED);
            html_utilities.html_markup($$$top);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_princ($str_alt301$_Top_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_indent(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_hash, UNPROVIDED);
            html_utilities.html_markup($$$start);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_princ($str_alt302$_Start_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_indent(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_hash, UNPROVIDED);
            html_utilities.html_markup($$$end);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_princ($str_alt303$_End_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_indent(UNPROVIDED);
            if (NIL != include_indexP) {
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_hash, UNPROVIDED);
                html_utilities.html_markup($$$index);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($str_alt304$_Index_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_utilities.html_indent(UNPROVIDED);
            }
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_domain_examples_manipulate_section_bgcolor$ = makeSymbol("*CB-UIAT-DOMAIN-EXAMPLES-MANIPULATE-SECTION-BGCOLOR*");

    public static final SubLObject cb_uiat_domain_examples_manipulate_section(SubLObject interaction, SubLObject sample_sentence, SubLObject filter_term, SubLObject sort_method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_hidden_input($$$id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
            {
                SubLObject bgcolor = $cb_uiat_domain_examples_manipulate_section_bgcolor$.getGlobalValue();
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(FOUR_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != bgcolor) {
                    html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(bgcolor);
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
                            SubLObject _prev_bind_0_180 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_181 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
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
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_182 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_183 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_184 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_user_interaction_agenda.cb_uia_show_title(user_interaction_agenda.ui_operator(interaction));
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_184, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_185 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_indent(TWO_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_185, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_186 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_utilities.cb_link($UIA_COMPLETE_INTERACTION, interaction, $str_alt309$_Finished_with_Domain_Examples_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_186, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_183, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_182, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
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
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_187 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_188 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_189 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                                                html_utilities.html_princ($$$Sort_examples);
                                                                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                                                html_utilities.html_indent(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($str_alt311$sort_method);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(ONE_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_190 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject sort_method_table = uia_tools_browsing.uiat_domain_examples_sort_method_table();
                                                                            SubLObject list_var = NIL;
                                                                            SubLObject sort_method_info = NIL;
                                                                            SubLObject index = NIL;
                                                                            for (list_var = sort_method_table, sort_method_info = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sort_method_info = list_var.first() , index = add(ONE_INTEGER, index)) {
                                                                                {
                                                                                    SubLObject datum = sort_method_info;
                                                                                    SubLObject current = datum;
                                                                                    SubLObject method = NIL;
                                                                                    SubLObject prompt = NIL;
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt312);
                                                                                    method = current.first();
                                                                                    current = current.rest();
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt312);
                                                                                    prompt = current.first();
                                                                                    current = current.rest();
                                                                                    if (NIL == current) {
                                                                                        {
                                                                                            SubLObject selected = eq(method, sort_method);
                                                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                            if (NIL != selected) {
                                                                                                html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                                            }
                                                                                            if (NIL != index) {
                                                                                                html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_utilities.html_markup(index);
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            }
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_191 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_utilities.html_princ(prompt);
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_191, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                        }
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum, $list_alt312);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_190, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_189, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_192 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_utilities.cb_help($UIA_DOMAIN_EXAMPLES, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_192, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_188, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_187, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
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
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_193 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_194 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                                            SubLObject _prev_bind_0_195 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($str_alt313$sample_sentence);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($int$40);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(THREE_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($$$virtual);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_196 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (sample_sentence.isString()) {
                                                                            html_utilities.html_princ(sample_sentence);
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_196, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_195, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_194, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_193, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
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
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_197 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_198 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_199 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_radio_input($$$filter, $$$none, sublisp_null(filter_term));
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_199, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_200 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_glyph($NBSP, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_200, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_201 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($$$Show_all_examples);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_201, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_198, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                if (NIL != filter_term) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_202 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_203 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_radio_input($$$filter, $$$term, T);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_203, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_204 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_glyph($NBSP, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_204, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_205 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($$$Show_examples_applicable_to);
                                                                    html_utilities.html_indent(UNPROVIDED);
                                                                    cb_uia_display_primitives.cb_uia_show_term(filter_term, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_205, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_202, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_206 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_207 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_radio_input($$$filter, $$$specify, NIL);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_207, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_208 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_glyph($NBSP, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_208, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_209 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($$$Show_examples_applicable_to);
                                                                html_utilities.html_indent(UNPROVIDED);
                                                                html_utilities.html_text_input($str_alt320$filter_phrase, NIL, TWENTY_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_209, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_206, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_197, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
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
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_210 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_211 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_212 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_reset_input($$$Reset_settings);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_212, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_213 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_glyph($NBSP, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_213, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_214 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_submit_input($$$Redisplay_with_these_settings, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_214, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_211, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_210, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_181, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_180, thread);
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

    public static final SubLObject cb_uiat_handle_domain_examples_show(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject id_string = html_utilities.html_extract_input($$$id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
            SubLObject sample_sentence = html_utilities.html_extract_input($str_alt313$sample_sentence, args);
            SubLObject filter_string = html_utilities.html_extract_input($$$filter, args);
            SubLObject sort_method_string = html_utilities.html_extract_input($str_alt311$sort_method, args);
            SubLObject filter_term = NIL;
            SubLObject filter_phrase = NIL;
            SubLObject sort_method = NIL;
            if (NIL != string_utilities.empty_string_p(sample_sentence)) {
                sample_sentence = NIL;
            }
            if ($$$term.equal(filter_string)) {
                filter_term = user_interaction_agenda.ui_state_lookup(interaction, $FILTER_TERM, UNPROVIDED);
            } else
                if ($$$specify.equal(filter_string)) {
                    filter_phrase = html_utilities.html_extract_input($str_alt320$filter_phrase, args);
                }

            sort_method = nth(read_from_string_ignoring_errors(sort_method_string, NIL, ZERO_INTEGER, UNPROVIDED, UNPROVIDED), uia_tools_browsing.uiat_domain_examples_sort_method_table()).first();
            {
                SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, nconc(new SubLObject[]{ NIL != sample_sentence ? ((SubLObject) (list($SAMPLE_SENTENCE, sample_sentence))) : NIL, NIL != filter_term ? ((SubLObject) (list($FILTER_TERM, filter_term))) : NIL, NIL != filter_phrase ? ((SubLObject) (list($FILTER_PHRASE, filter_phrase))) : NIL, list($SORT_METHOD, sort_method) }));
                return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
            }
        }
    }

    public static final SubLObject cb_uiat_domain_examples_launch(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_browsing.uia_act_new_domain_examples(v_agenda, $REQUIRED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_link_uia_domain_examples_launch(SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_url_princ($str_alt327$cb_uiat_domain_examples_launch);
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

    public static final SubLObject cb_uiat_knowledge_scrapbook_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_215 = plist;
                        SubLObject current_216 = datum_215;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_216;
                        SubLObject bad = NIL;
                        SubLObject current_217 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_215, $list_alt331);
                            current_217 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_215, $list_alt331);
                            if (NIL == member(current_217, $list_alt332, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_217 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_215, $list_alt331);
                        }
                        {
                            SubLObject terms_tail = property_list_member($TERMS, current_216);
                            SubLObject terms = (NIL != terms_tail) ? ((SubLObject) (cadr(terms_tail))) : NIL;
                            SubLObject assertions_tail = property_list_member($ASSERTIONS, current_216);
                            SubLObject assertions = (NIL != assertions_tail) ? ((SubLObject) (cadr(assertions_tail))) : NIL;
                            SubLObject sentences_tail = property_list_member($SENTENCES, current_216);
                            SubLObject sentences = (NIL != sentences_tail) ? ((SubLObject) (cadr(sentences_tail))) : NIL;
                            SubLObject crumb_terms_tail = property_list_member($CRUMB_TERMS, current_216);
                            SubLObject crumb_terms = (NIL != crumb_terms_tail) ? ((SubLObject) (cadr(crumb_terms_tail))) : NIL;
                            SubLObject crumb_assertions_tail = property_list_member($CRUMB_ASSERTIONS, current_216);
                            SubLObject crumb_assertions = (NIL != crumb_assertions_tail) ? ((SubLObject) (cadr(crumb_assertions_tail))) : NIL;
                            SubLObject select_terms_tail = property_list_member($SELECT_TERMS, current_216);
                            SubLObject select_terms = (NIL != select_terms_tail) ? ((SubLObject) (cadr(select_terms_tail))) : NIL;
                            SubLObject select_sentences_tail = property_list_member($SELECT_SENTENCES, current_216);
                            SubLObject select_sentences = (NIL != select_sentences_tail) ? ((SubLObject) (cadr(select_sentences_tail))) : NIL;
                            return cb_uiat_knowledge_scrapbook_guts(interaction, terms, assertions, sentences, crumb_terms, crumb_assertions, misc_utilities.keyword_to_boolean(select_terms), misc_utilities.keyword_to_boolean(select_sentences));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_knowledge_scrapbook_guts(SubLObject interaction, SubLObject terms, SubLObject assertions, SubLObject sentences, SubLObject crumb_terms, SubLObject crumb_assertions, SubLObject select_termsP, SubLObject select_sentencesP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                        html_utilities.html_hidden_input($str_alt340$cb_uiat_handle_knowledge_scrapboo, T, UNPROVIDED);
                        html_utilities.html_hidden_input($str_alt341$ui_id, user_interaction_agenda.ui_id(interaction), UNPROVIDED);
                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                            html_script_utilities.html_js_focus_window();
                        }
                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
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
                            html_utilities.html_markup($str_alt342$100_);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_218 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_219 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_220 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_uiat_knowledge_scrapbook_buttons(interaction);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_220, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_219, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_218, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_newline(UNPROVIDED);
                        cb_uiat_knowledge_scrapbook_render_terms(interaction, terms, crumb_terms, select_termsP);
                        html_utilities.html_newline(UNPROVIDED);
                        cb_uiat_knowledge_scrapbook_render_assertibles(interaction, assertions, sentences, crumb_assertions, select_sentencesP);
                        html_utilities.html_newline(UNPROVIDED);
                        cb_uiat_knowledge_scrapbook_buttons(interaction);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_knowledge_scrapbook_buttons(SubLObject interaction) {
        cb_utilities.cb_link($UIAT_KESCRAP_CONTINUE, interaction, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_indent(UNPROVIDED);
        cb_utilities.cb_link($UIAT_KESCRAP_LOAD, interaction, $str_alt345$_Load_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_indent(UNPROVIDED);
        cb_utilities.cb_link($UIAT_KESCRAP_SAVE, interaction, $str_alt347$_Save_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_indent(UNPROVIDED);
        return interaction;
    }

    public static final SubLObject cb_link_uiat_kescrap_continue(SubLObject interaction, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt348$cb_uiat_kescrap_continue, arglist);
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

    public static final SubLObject cb_link_uiat_kescrap_load(SubLObject interaction, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt350$cb_uiat_kescrap_load, arglist);
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

    public static final SubLObject cb_link_uiat_kescrap_save(SubLObject interaction, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt352$cb_uiat_kescrap_save, arglist);
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

    public static final SubLObject cb_uiat_knowledge_scrapbook_render_terms(SubLObject interaction, SubLObject terms, SubLObject crumb_terms, SubLObject selectP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_newline(ONE_INTEGER);
            if (NIL != terms) {
                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($$$Scrapbook_Terms);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
            }
            if ((NIL == terms) && (NIL == crumb_terms)) {
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                html_utilities.html_princ($str_alt355$Add_terms_by_entering_them_below_);
                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            }
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
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject list_var = NIL;
                        SubLObject v_term = NIL;
                        SubLObject index = NIL;
                        for (list_var = terms, v_term = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , index = add(ONE_INTEGER, index)) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_221 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_222 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_link($UIAT_KESCRAP_DROP_TERM, interaction, index, $str_alt357$_Drop_, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_222, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_223 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_223, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_224 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != selectP) {
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                cb_utilities.cb_link($UIA_CONCEPT_FINDER_THROW, v_term, NIL, NIL, NIL, NIL);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_224, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_225 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_225, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_226 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_uia_display_primitives.cb_uia_show_term_with_clarifying_link(v_term, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_226, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_221, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_227 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_227, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_228 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(FIVE_INTEGER);
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
                                SubLObject _prev_bind_0_229 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ($$$Recently_Mentioned_Terms);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_229, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_228, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject list_var = NIL;
                        SubLObject crumb_term = NIL;
                        SubLObject index = NIL;
                        for (list_var = crumb_terms, crumb_term = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , crumb_term = list_var.first() , index = add(ONE_INTEGER, index)) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_230 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_231 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_231, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_232 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != selectP) {
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                cb_utilities.cb_link($UIA_CONCEPT_FINDER_THROW, crumb_term, NIL, NIL, NIL, NIL);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_232, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_233 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_233, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_234 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_uia_display_primitives.cb_uia_show_term_with_clarifying_link(crumb_term, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_234, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_230, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_235 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_236 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_submit_input($$$Add_term, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_236, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_237 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_text_input($$$newterm, $str_alt361$, $int$40);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_237, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_235, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return interaction;
        }
    }

    public static final SubLObject cb_link_uiat_kescrap_drop_term(SubLObject interaction, SubLObject index, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, index);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt362$cb_uiat_kescrap_drop_term, arglist);
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

    public static final SubLObject cb_uiat_knowledge_scrapbook_render_assertibles(SubLObject interaction, SubLObject assertions, SubLObject sentences, SubLObject crumb_assertions, SubLObject selectP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sentences) {
                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($$$Scrapbook_Sentences);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
            }
            if (((NIL == sentences) && (NIL == assertions)) && (NIL == crumb_assertions)) {
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                html_utilities.html_princ($str_alt365$Add_sentences_by_entering_them_be);
                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            }
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
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject list_var = NIL;
                        SubLObject assertion = NIL;
                        SubLObject index = NIL;
                        for (list_var = assertions, assertion = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , assertion = list_var.first() , index = add(ONE_INTEGER, index)) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_238 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_239 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_link($UIAT_KESCRAP_DROP_ASSERTION, interaction, index, $str_alt357$_Drop_, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_239, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_240 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_240, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_241 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != selectP) {
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                cb_utilities.cb_link($UIA_SENTENCE_FINDER_THROW, assertion, NIL, NIL, NIL, NIL);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_241, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_242 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_242, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_243 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_uia_display_primitives.cb_uia_show_sentence(assertion, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_243, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_238, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                    {
                        SubLObject list_var = NIL;
                        SubLObject sentence = NIL;
                        SubLObject index = NIL;
                        for (list_var = sentences, sentence = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , index = add(ONE_INTEGER, index)) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_244 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_245 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_utilities.cb_link($UIAT_KESCRAP_DROP_SENTENCE, interaction, index, $str_alt357$_Drop_, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_245, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_246 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_246, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_247 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != selectP) {
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                cb_utilities.cb_link($UIA_SENTENCE_FINDER_THROW, sentence, NIL, NIL, NIL, NIL);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_247, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_248 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_248, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_249 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_uia_display_primitives.cb_uia_show_sentence(sentence, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_249, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_244, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_250 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(THREE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_251 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_251, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_252 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_uia_display_primitives.cb_uia_show_arg_type_warning_for_sentence_strong(sentence, v_agenda);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_252, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_250, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_253 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_253, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_254 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(FIVE_INTEGER);
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
                                SubLObject _prev_bind_0_255 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ($$$Recently_mentioned_sentences);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_255, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_254, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject list_var = NIL;
                        SubLObject crumb_assertion = NIL;
                        SubLObject index = NIL;
                        for (list_var = crumb_assertions, crumb_assertion = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , crumb_assertion = list_var.first() , index = add(ONE_INTEGER, index)) {
                            {
                                SubLObject sentence = getf(crumb_assertion, $SENTENCE, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_256 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_257 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_indent(TWO_INTEGER);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_257, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_258 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != selectP) {
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    cb_utilities.cb_link($UIA_SENTENCE_FINDER_THROW, sentence, NIL, NIL, NIL, NIL);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_258, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_259 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_indent(TWO_INTEGER);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_259, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_260 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_uia_tools_basic.cb_uia_crumb_trail_show_fact(crumb_assertion);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_260, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_256, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_261 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_262 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_submit_input($$$Add_fact, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_262, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_263 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_text_input($$$newsentence, $str_alt361$, $int$40);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_263, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_261, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return interaction;
        }
    }

    public static final SubLObject cb_link_uia_knowledge_scrapbook_launch(SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_url_princ($str_alt371$cb_uiat_knowledge_scrapbook_launc);
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

    public static final SubLObject cb_uiat_knowledge_scrapbook_launch(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_browsing.uia_act_new_knowledge_scrapbook(v_agenda, $REQUIRED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_link_uiat_kescrap_drop_assertion(SubLObject interaction, SubLObject index, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, index);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt375$cb_uiat_kescrap_drop_assertion, arglist);
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

    public static final SubLObject cb_link_uiat_kescrap_select_assertion(SubLObject interaction, SubLObject index, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, index);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt377$cb_uiat_kescrap_select_assertion, arglist);
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

    public static final SubLObject cb_link_uiat_kescrap_drop_sentence(SubLObject interaction, SubLObject index, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, index);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt380$cb_uiat_kescrap_drop_sentence, arglist);
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

    public static final SubLObject cb_link_uiat_kescrap_select_sentence(SubLObject interaction, SubLObject index, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction, index);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt382$cb_uiat_kescrap_select_sentence, arglist);
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

    public static final SubLObject cb_uiat_handle_knowledge_scrapbook_guts(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject sentence = html_utilities.html_extract_input($$$newsentence, args);
            SubLObject v_term = html_utilities.html_extract_input($$$newterm, args);
            SubLObject ui_id = html_utilities.html_extract_input($str_alt341$ui_id, args);
            SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, ui_id);
            SubLObject phrase = NIL;
            SubLObject type = NIL;
            SubLObject reply = NIL;
            if (length(sentence).isPositive()) {
                phrase = sentence;
                type = $SENTENCE;
            } else {
                phrase = v_term;
                type = $TERM;
            }
            reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ADD_NEW, list($TYPE, type, $PHRASE, phrase));
            return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
        }
    }

    public static final SubLObject cb_uiat_kescrap_continue(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt253);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DONE, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt253);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_kescrap_load(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt253);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $LOAD, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt253);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_kescrap_save(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt253);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SAVE, NIL);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt253);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_kescrap_select_assertion(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject index = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt393);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt393);
            index = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SELECT, list($TYPE, $ASSERTION, $ID, index));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt393);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_kescrap_drop_assertion(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject index = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt393);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt393);
            index = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DROP, list($TYPE, $ASSERTION, $ID, index));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt393);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_kescrap_select_sentence(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject index = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt393);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt393);
            index = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SELECT, list($TYPE, $SENTENCE, $ID, index));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt393);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_kescrap_drop_sentence(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject index = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt393);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt393);
            index = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DROP, list($TYPE, $SENTENCE, $ID, index));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt393);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_kescrap_select_term(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject index = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt393);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt393);
            index = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $SELECT, list($TYPE, $TERM, $ID, index));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt393);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_kescrap_drop_term(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            SubLObject index = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt393);
            interaction = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt393);
            index = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DROP, list($TYPE, $TERM, $ID, index));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt393);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_ontology_browser_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($EXAMPLES)) {
                    {
                        SubLObject datum_264 = plist;
                        SubLObject current_265 = datum_264;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_265;
                        SubLObject bad = NIL;
                        SubLObject current_266 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_264, $list_alt404);
                            current_266 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_264, $list_alt404);
                            if (NIL == member(current_266, $list_alt405, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_266 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_264, $list_alt404);
                        }
                        {
                            SubLObject select_tail = property_list_member($SELECT, current_265);
                            SubLObject select = (NIL != select_tail) ? ((SubLObject) (cadr(select_tail))) : NIL;
                            SubLObject selectP = misc_utilities.keyword_to_boolean(select);
                            return cb_uiat_ontology_browser.cb_uiat_ontology_browser_examples(interaction, selectP);
                        }
                    }
                } else
                    if (pcase_var.eql($SHOW)) {
                        {
                            SubLObject datum_267 = plist;
                            SubLObject current_268 = datum_267;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_268;
                            SubLObject bad = NIL;
                            SubLObject current_269 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_267, $list_alt406);
                                current_269 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_267, $list_alt406);
                                if (NIL == member(current_269, $list_alt407, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_269 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_267, $list_alt406);
                            }
                            {
                                SubLObject term_tail = property_list_member($TERM, current_268);
                                SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                                SubLObject select_tail = property_list_member($SELECT, current_268);
                                SubLObject select = (NIL != select_tail) ? ((SubLObject) (cadr(select_tail))) : NIL;
                                SubLObject highlight_tail = property_list_member($HIGHLIGHT, current_268);
                                SubLObject highlight = (NIL != highlight_tail) ? ((SubLObject) (cadr(highlight_tail))) : NIL;
                                SubLObject selectP = misc_utilities.keyword_to_boolean(select);
                                return cb_uiat_ontology_browser.cb_uiat_ontology_browser_show(interaction, v_term, selectP, highlight);
                            }
                        }
                    }

            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_concept_recognizer_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_270 = plist;
                        SubLObject current_271 = datum_270;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_271;
                        SubLObject bad = NIL;
                        SubLObject current_272 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_270, $list_alt410);
                            current_272 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_270, $list_alt410);
                            if (NIL == member(current_272, $list_alt411, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_272 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_270, $list_alt410);
                        }
                        {
                            SubLObject phrase_tail = property_list_member($PHRASE, current_271);
                            SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                            SubLObject candidate_terms_tail = property_list_member($CANDIDATE_TERMS, current_271);
                            SubLObject candidate_terms = (NIL != candidate_terms_tail) ? ((SubLObject) (cadr(candidate_terms_tail))) : NIL;
                            SubLObject term_info_table_tail = property_list_member($TERM_INFO_TABLE, current_271);
                            SubLObject term_info_table = (NIL != term_info_table_tail) ? ((SubLObject) (cadr(term_info_table_tail))) : NIL;
                            SubLObject within_concept_creatorP_tail = property_list_member($kw414$WITHIN_CONCEPT_CREATOR_, current_271);
                            SubLObject within_concept_creatorP = (NIL != within_concept_creatorP_tail) ? ((SubLObject) (cadr(within_concept_creatorP_tail))) : NIL;
                            return cb_uiat_concept_recognizer_guts(interaction, phrase, candidate_terms, term_info_table, within_concept_creatorP);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_concept_recognizer_guts(SubLObject interaction, SubLObject phrase, SubLObject candidate_terms, SubLObject term_info_table, SubLObject within_concept_creatorP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            cb_uia_macros.cb_uiat_document_expiration();
            cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_273 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                            }
                            if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                html_script_utilities.cb_hoverover_page_init();
                            }
                            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                html_script_utilities.html_js_focus_window();
                            }
                            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                            html_utilities.html_newline(TWO_INTEGER);
                            if (NIL != within_concept_creatorP) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt415$The_following_meanings_for__S_alr, phrase);
                            } else {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt416$The_phrase__S_could_mean_, phrase);
                            }
                            cb_uia_tools_basic.cb_uiat_show_phrase_meanings(interaction, term_info_table, $TRUE, NIL, NIL, NIL, candidate_terms);
                            html_utilities.html_newline(UNPROVIDED);
                            if (NIL != within_concept_creatorP) {
                                html_utilities.html_princ($str_alt417$You_may_wish_to_use_one_of_these_);
                                html_utilities.html_newline(UNPROVIDED);
                            }
                            cb_utilities.cb_link($UIA_CONCEPT_CREATOR, phrase, format(NIL, $str_alt419$_Add_a_new_meaning_for__S_, phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_newline(UNPROVIDED);
                            cb_utilities.cb_link($UIA_BLUE_CONCEPT_RECOGNIZER_EVENT, user_interaction_agenda.ui_agenda(interaction), $str_alt420$_Visualize_meanings_, candidate_terms, ONE_INTEGER, $list_alt43);
                            html_utilities.html_newline(UNPROVIDED);
                            cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_273, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_asserted_sentences_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_274 = plist;
                        SubLObject current_275 = datum_274;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_275;
                        SubLObject bad = NIL;
                        SubLObject current_276 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_274, $list_alt423);
                            current_276 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_274, $list_alt423);
                            if (NIL == member(current_276, $list_alt424, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_276 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_274, $list_alt423);
                        }
                        {
                            SubLObject term_tail = property_list_member($TERM, current_275);
                            SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                            SubLObject sentences_tail = property_list_member($SENTENCES, current_275);
                            SubLObject sentences = (NIL != sentences_tail) ? ((SubLObject) (cadr(sentences_tail))) : NIL;
                            return cb_uiat_asserted_sentences_guts(interaction, v_term, sentences);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * MT-SENTENCE-LIST-PAIRS is an MT, followed by a list of plists, each of which represents a sentence found
     * in the Mt.  @see UIAT-KNOWLEDGE-REVIEWER-ASSERTION-BY-TERM-MAPPER for information about the format
     */
    public static final SubLObject cb_uiat_asserted_sentences_guts(SubLObject interaction, SubLObject v_term, SubLObject mt_sentence_list_pairs) {
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
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject topic = uia_setup_state.uia_topic(v_agenda);
                SubLObject term_np = uia_trampolines.uia_html_term_phrase_np(v_agenda, v_term, UNPROVIDED, UNPROVIDED);
                SubLObject topic_name = uia_trampolines.uia_html_term_phrase_np(v_agenda, topic, UNPROVIDED, UNPROVIDED);
                cb_uia_asserted_sentences_buttons(interaction, v_term);
                cb_uia_asserted_sentences_show_term(interaction, v_term);
                html_utilities.html_newline(TWO_INTEGER);
                if (NIL == mt_sentence_list_pairs) {
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_princ($str_alt425$Apparently__I_haven_t_been_told_a);
                    cb_uia_display_primitives.cb_uia_show_term(v_term, term_np);
                    html_utilities.html_princ($str_alt426$_that_is_relevant_to_);
                    cb_uia_display_primitives.cb_uia_show_term(topic, topic_name);
                    html_utilities.html_princ($str_alt427$_);
                } else {
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
                                        SubLObject _prev_bind_0_277 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                        try {
                                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                            {
                                                SubLObject new_or_reused = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject _prev_bind_0_278 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                    try {
                                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                        {
                                                            SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                            {
                                                                SubLObject _prev_bind_0_279 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                                        Errors.error($str_alt17$Invalid_attempt_to_reuse_memoizat);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        try {
                                                                            {
                                                                                SubLObject _prev_bind_0_280 = rkf_macros.$rkf_addressee$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1 = rkf_macros.$rkf_speaker$.currentBinding(thread);
                                                                                try {
                                                                                    rkf_macros.$rkf_addressee$.bind(uia_macros.uia_addressee_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                                                                                    rkf_macros.$rkf_speaker$.bind(uia_macros.uia_speaker_for_utterance_type(v_agenda, $CYC_TO_USER), thread);
                                                                                    {
                                                                                        SubLObject mt_index = ZERO_INTEGER;
                                                                                        SubLObject list_var = NIL;
                                                                                        SubLObject mt_sentences = NIL;
                                                                                        SubLObject index = NIL;
                                                                                        for (list_var = mt_sentence_list_pairs, mt_sentences = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , mt_sentences = list_var.first() , index = add(ONE_INTEGER, index)) {
                                                                                            {
                                                                                                SubLObject mt = mt_sentences.first();
                                                                                                SubLObject sentence_plists = second(mt_sentences);
                                                                                                html_utilities.html_princ($str_alt429$From_);
                                                                                                cb_uia_display_primitives.cb_uia_show_term(mt, UNPROVIDED);
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
                                                                                                    html_utilities.html_markup($str_alt342$100_);
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                }
                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_281 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                        cb_uia_display_primitives.cb_uia_show_sentence_plist_set(sentence_plists, cconcatenate($str_alt430$asserted_sentence, princ_to_string(index)), UNPROVIDED, UNPROVIDED);
                                                                                                    } finally {
                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_281, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                                                html_utilities.html_newline(ONE_INTEGER);
                                                                                                mt_index = add(mt_index, ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    rkf_macros.$rkf_speaker$.rebind(_prev_bind_1, thread);
                                                                                    rkf_macros.$rkf_addressee$.rebind(_prev_bind_0_280, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_282 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_282, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_279, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_278, thread);
                                                    }
                                                }
                                                if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                }
                                            }
                                        } finally {
                                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_277, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_283 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (NIL == reuseP) {
                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_283, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                cb_uia_asserted_sentences_buttons(interaction, v_term);
            }
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_uia_asserted_sentences_show_term(SubLObject interaction, SubLObject v_term) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject term_phrase = uia_trampolines.uia_html_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED);
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_uia_display_primitives.cb_uia_show_term(v_term, term_phrase);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_utilities.html_indent(TWO_INTEGER);
            {
                SubLObject salient_descriptor_text = $str_alt30$_Interview_;
                cb_utilities.cb_link($UIA_SALIENT_DESCRIPTOR_REQUIRED, v_term, salient_descriptor_text, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return interaction;
    }

    public static final SubLObject cb_uia_asserted_sentences_buttons(SubLObject interaction, SubLObject v_term) {
        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_utilities.html_newline(UNPROVIDED);
        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        {
            SubLObject cycl_query = asserted_sentences_query_for(v_term);
            SubLObject term_phrase = uia_trampolines.uia_term_phrase_np(user_interaction_agenda.ui_agenda(interaction), v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject text = cconcatenate($str_alt431$What_do_you_know_about_, new SubLObject[]{ term_phrase, $str_alt71$_ });
            html_utilities.html_indent(TWO_INTEGER);
            cb_utilities.cb_link($UIAT_SOLUTION_FINDER_CYCL, cycl_query, text, $str_alt433$_Ask_for_known_facts_in_Query_Too, UNPROVIDED, UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_link_uia_asserted_sentences_guts(SubLObject v_term, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(v_term);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt434$cb_uia_asserted_sentences_guts, arglist);
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

    public static final SubLObject cb_uia_asserted_sentences_guts(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt100);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject phrase = uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_agenda(v_agenda, $ASSERTED_SENTENCES, $LAUNCH, list($PHRASE, phrase, $TERM, v_term));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt100);
            }
        }
        return NIL;
    }

    public static final SubLObject asserted_sentences_query_for(SubLObject v_term) {
        return el_utilities.list_to_elf(listS($$keAssertedTermSentences, v_term, $list_alt438));
    }

    public static final SubLObject cb_uiat_concept_comparator_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_284 = plist;
                        SubLObject current_285 = datum_284;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_285;
                        SubLObject bad = NIL;
                        SubLObject current_286 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_284, $list_alt440);
                            current_286 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_284, $list_alt440);
                            if (NIL == member(current_286, $list_alt441, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_286 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_284, $list_alt440);
                        }
                        {
                            SubLObject term1_tail = property_list_member($TERM1, current_285);
                            SubLObject term1 = (NIL != term1_tail) ? ((SubLObject) (cadr(term1_tail))) : NIL;
                            SubLObject term2_tail = property_list_member($TERM2, current_285);
                            SubLObject term2 = (NIL != term2_tail) ? ((SubLObject) (cadr(term2_tail))) : NIL;
                            SubLObject phrase1_tail = property_list_member($PHRASE1, current_285);
                            SubLObject phrase1 = (NIL != phrase1_tail) ? ((SubLObject) (cadr(phrase1_tail))) : NIL;
                            SubLObject phrase2_tail = property_list_member($PHRASE2, current_285);
                            SubLObject phrase2 = (NIL != phrase2_tail) ? ((SubLObject) (cadr(phrase2_tail))) : NIL;
                            SubLObject equals_tail = property_list_member($EQUALS, current_285);
                            SubLObject v_equals = (NIL != equals_tail) ? ((SubLObject) (cadr(equals_tail))) : NIL;
                            SubLObject common_sentences_tail = property_list_member($COMMON_SENTENCES, current_285);
                            SubLObject common_sentences = (NIL != common_sentences_tail) ? ((SubLObject) (cadr(common_sentences_tail))) : NIL;
                            SubLObject term1_unique_sentences_tail = property_list_member($TERM1_UNIQUE_SENTENCES, current_285);
                            SubLObject term1_unique_sentences = (NIL != term1_unique_sentences_tail) ? ((SubLObject) (cadr(term1_unique_sentences_tail))) : NIL;
                            SubLObject term2_unique_sentences_tail = property_list_member($TERM2_UNIQUE_SENTENCES, current_285);
                            SubLObject term2_unique_sentences = (NIL != term2_unique_sentences_tail) ? ((SubLObject) (cadr(term2_unique_sentences_tail))) : NIL;
                            return cb_uiat_concept_comparator_guts(interaction, term1, term2, phrase1, phrase2, v_equals, common_sentences, term1_unique_sentences, term2_unique_sentences);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_concept_comparator_guts(SubLObject interaction, SubLObject term1, SubLObject term2, SubLObject phrase1, SubLObject phrase2, SubLObject v_equals, SubLObject common_sentences, SubLObject term1_unique_sentences, SubLObject term2_unique_sentences) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            cb_uia_macros.cb_uiat_document_expiration();
            cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_287 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                            }
                            if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                html_script_utilities.cb_hoverover_page_init();
                            }
                            if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                html_script_utilities.html_js_focus_window();
                            }
                            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                            if ($TRUE == v_equals) {
                                html_utilities.html_newline(UNPROVIDED);
                                cb_uia_display_primitives.cb_uia_show_term(term1, UNPROVIDED);
                                html_utilities.html_princ($str_alt70$_and_);
                                cb_uia_display_primitives.cb_uia_show_term(term2, UNPROVIDED);
                                html_utilities.html_princ($str_alt446$_are_exactly_the_same_);
                            } else {
                                html_utilities.html_newline(UNPROVIDED);
                                cb_utilities.cb_link($UIAT_CONCEPT_COMPARATOR_DONE, interaction, $str_alt448$_Done_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_newline(TWO_INTEGER);
                                cb_utilities.cb_link($UIA_ANALOGY_DEVELOPER_GUTS, term1, term2, format(NIL, $str_alt450$_Tell_me_more_about_how__a_is_lik, phrase1, phrase2), UNPROVIDED, UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                cb_utilities.cb_link($UIA_ANALOGY_DEVELOPER_GUTS, term2, term1, format(NIL, $str_alt450$_Tell_me_more_about_how__a_is_lik, phrase2, phrase1), UNPROVIDED, UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                cb_utilities.cb_link($UIA_BLUE_CONCEPT_COMPARATOR_EVENT, user_interaction_agenda.ui_agenda(interaction), $str_alt452$_Visualize_the_comparison_, list(term1, term2), ONE_INTEGER, $list_alt43);
                                html_utilities.html_newline(UNPROVIDED);
                                cb_concept_comparator_show_common_sentences(term1, term2, common_sentences);
                                html_utilities.html_newline(UNPROVIDED);
                                cb_concept_comparator_show_unique_sentences(term1, term2, term1_unique_sentences);
                                html_utilities.html_newline(UNPROVIDED);
                                cb_concept_comparator_show_unique_sentences(term2, term1, term2_unique_sentences);
                            }
                            html_utilities.html_newline(TWO_INTEGER);
                            cb_utilities.cb_link($UIAT_CONCEPT_COMPARATOR_DONE, interaction, $str_alt448$_Done_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_287, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_link_uiat_concept_comparator_done(SubLObject interaction, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(interaction);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt453$cb_uiat_concept_comparator_done, arglist);
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

    public static final SubLObject cb_uiat_concept_comparator_done(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject interaction = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt253);
            interaction = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $DONE, NIL);
                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt253);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_concept_comparator_show_common_sentences(SubLObject term1, SubLObject term2, SubLObject common_sentences) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != common_sentences) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    cb_uia_display_primitives.cb_uia_fancy_show_term(term1, $list_alt456);
                    html_utilities.html_princ($str_alt70$_and_);
                    cb_uia_display_primitives.cb_uia_show_term(term2, UNPROVIDED);
                    html_utilities.html_princ($str_alt20$___);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_indent(FOUR_INTEGER);
                    {
                        SubLObject cycl_query = comparison_sentences_query_for(term1, term2);
                        SubLObject text = format(NIL, $str_alt457$How_are__a_and__a_similar_, uia_trampolines.uia_term_phrase(v_agenda, term1, UNPROVIDED, UNPROVIDED, UNPROVIDED), uia_trampolines.uia_term_phrase(v_agenda, term2, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        cb_utilities.cb_link($UIAT_SOLUTION_FINDER_CYCL, cycl_query, text, $str_alt458$_Convert_to_Question_, UNPROVIDED, UNPROVIDED);
                    }
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(ZERO_INTEGER);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject sentence_phrase_pairs = cb_concept_comparator_paraphrases(common_sentences, v_agenda);
                                SubLObject cdolist_list_var = sentence_phrase_pairs;
                                SubLObject sentence_phrase_pair = NIL;
                                for (sentence_phrase_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence_phrase_pair = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = sentence_phrase_pair;
                                        SubLObject current = datum;
                                        SubLObject common_sentence = NIL;
                                        SubLObject phrase = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt459);
                                        common_sentence = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt459);
                                        phrase = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject other_sentence = rkf_tools.rkf_substitute_terms_in_sentence(term2, term1, common_sentence);
                                                SubLObject count_test = (NIL != rkf_tools.$rkf_common_sentences_recurseP$.getDynamicValue(thread)) ? ((SubLObject) (symbol_function(EXPRESSION_FIND))) : symbol_function(EQL);
                                                SubLObject term2_count = count(term2, other_sentence, count_test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                SubLObject multiple_mentionsP = numG(term2_count, ONE_INTEGER);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_288 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_289 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uia_display_primitives.cb_uia_show_sentence(common_sentence, phrase);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_289, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_290 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_indent(TWO_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_290, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_291 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                if (NIL != multiple_mentionsP) {
                                                                    cb_uia_display_primitives.cb_uia_show_sentence(other_sentence, UNPROVIDED);
                                                                } else {
                                                                    cb_uia_display_primitives.cb_uia_show_sentence_link(other_sentence, UNPROVIDED, UNPROVIDED);
                                                                    html_utilities.html_princ($str_alt95$_);
                                                                    cb_uia_display_primitives.cb_uia_fancy_show_term(term2, $list_alt461);
                                                                    html_utilities.html_princ($str_alt462$_too_);
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_291, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_288, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt459);
                                        }
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
            } else {
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                cb_uia_display_primitives.cb_uia_fancy_show_term(term1, $list_alt463);
                html_utilities.html_princ($str_alt70$_and_);
                cb_uia_display_primitives.cb_uia_show_term_without_link(term2, UNPROVIDED);
                html_utilities.html_princ($str_alt464$_have_nothing_in_common_that_I_kn);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_concept_comparator_show_unique_sentences(SubLObject term1, SubLObject term2, SubLObject term1_unique_sentences) {
        if (NIL != term1_unique_sentences) {
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt465$Just_);
                cb_uia_display_primitives.cb_uia_show_term(term1, UNPROVIDED);
                html_utilities.html_princ($str_alt20$___);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_indent(FOUR_INTEGER);
                {
                    SubLObject cycl_query = contrasting_sentences_query_for(term1, term2);
                    SubLObject text = format(NIL, $str_alt466$How_does__a_differ_from__a_, uia_trampolines.uia_term_phrase(v_agenda, term1, UNPROVIDED, UNPROVIDED, UNPROVIDED), uia_trampolines.uia_term_phrase(v_agenda, term2, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    cb_utilities.cb_link($UIAT_SOLUTION_FINDER_CYCL, cycl_query, text, $str_alt458$_Convert_to_Question_, UNPROVIDED, UNPROVIDED);
                }
                html_utilities.html_newline(UNPROVIDED);
                {
                    SubLObject sentence_phrase_pairs = cb_concept_comparator_paraphrases(term1_unique_sentences, v_agenda);
                    SubLObject cdolist_list_var = sentence_phrase_pairs;
                    SubLObject sentence_phrase_pair = NIL;
                    for (sentence_phrase_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence_phrase_pair = cdolist_list_var.first()) {
                        {
                            SubLObject datum = sentence_phrase_pair;
                            SubLObject current = datum;
                            SubLObject unique_sentence = NIL;
                            SubLObject phrase = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt467);
                            unique_sentence = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt467);
                            phrase = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                html_utilities.html_newline(UNPROVIDED);
                                cb_uia_display_primitives.cb_uia_show_sentence(unique_sentence, phrase);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt467);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP of (<CycL sentence> <English paraphrase>) pairs.
     * @unknown baxter
     */
    public static final SubLObject cb_concept_comparator_paraphrases(SubLObject sentences, SubLObject v_agenda) {
        {
            SubLObject generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
            SubLObject domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
            SubLObject one_time_shotP = NIL;
            SubLObject clarify_linksP = T;
            SubLObject sentence_phrase_pairs = uia_trampolines.uia_terms_distinguishing_phrases(v_agenda, sentences, generation_mt, domain_mt, one_time_shotP, $DECLARATIVE, clarify_linksP, UNPROVIDED, UNPROVIDED);
            return sentence_phrase_pairs;
        }
    }

    public static final SubLObject comparison_sentences_query_for(SubLObject term1, SubLObject term2) {
        return el_utilities.list_to_elf(listS($$keComparisonSentences, term1, term2, $list_alt438));
    }

    public static final SubLObject contrasting_sentences_query_for(SubLObject term1, SubLObject term2) {
        return el_utilities.list_to_elf(listS($$keContrastingSentences, term1, term2, $list_alt438));
    }

    public static final SubLObject uia_act_new_concept_relator(SubLObject v_agenda, SubLObject mode, SubLObject phrase, SubLObject v_term) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        {
            SubLObject plist = NIL;
            if (NIL != v_term) {
                plist = putf(plist, $TERM, v_term);
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $CONCEPT_RELATOR, list(phrase), plist);
        }
    }

    public static final SubLObject uiat_concept_relator_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt473);
            phrase = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt474$Related_Terms____A, phrase);
            } else {
                cdestructuring_bind_error(datum, $list_alt473);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_relator_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_term = user_interaction_agenda.ui_result(child);
            user_interaction_agenda.ui_state_update(parent, $TERM, v_term);
        }
        return parent;
    }

    public static final SubLObject cb_uiat_concept_relator_display(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject args = user_interaction_agenda.ui_args(interaction);
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject phrase = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt473);
                phrase = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, $UNDETERMINED);
                        if ($UNDETERMINED == v_term) {
                            {
                                SubLObject concept_disambiguator_action = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, concept_disambiguator_action);
                                return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        cb_uia_macros.cb_uiat_document_expiration();
                        cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_292 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                            html_script_utilities.html_js_focus_window();
                                        }
                                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                                        cb_concept_relator_guts(v_term);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_292, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                            }
                        }
                        cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                        return NIL;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt473);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_concept_relator_guts(SubLObject v_term) {
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
                                SubLObject _prev_bind_0_293 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                    {
                                        SubLObject new_or_reused = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject _prev_bind_0_294 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                {
                                                    SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                    {
                                                        SubLObject _prev_bind_0_295 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                                Errors.error($str_alt17$Invalid_attempt_to_reuse_memoizat);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                try {
                                                                    {
                                                                        SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                                                                        SubLObject topic = uia_setup_state.uia_topic(v_agenda);
                                                                        SubLObject topic_name = uia_trampolines.uia_html_term_phrase_np(v_agenda, topic, UNPROVIDED, UNPROVIDED);
                                                                        SubLObject term_phrase = uia_trampolines.uia_html_term_phrase_np(v_agenda, v_term, UNPROVIDED, UNPROVIDED);
                                                                        html_utilities.html_newline(UNPROVIDED);
                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt476$Concepts_related_to_);
                                                                        cb_uia_display_primitives.cb_uia_show_term(v_term, term_phrase);
                                                                        html_utilities.html_princ($str_alt477$_);
                                                                        html_utilities.html_newline(UNPROVIDED);
                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        {
                                                                            SubLObject related_terms = uia_trampolines.uia_related_terms(v_agenda, v_term, UNPROVIDED);
                                                                            related_terms = uia_trampolines.uia_sort_terms(v_agenda, related_terms, UNPROVIDED, UNPROVIDED);
                                                                            if (NIL != related_terms) {
                                                                                {
                                                                                    SubLObject cdolist_list_var = related_terms;
                                                                                    SubLObject related_term = NIL;
                                                                                    for (related_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , related_term = cdolist_list_var.first()) {
                                                                                        html_utilities.html_newline(UNPROVIDED);
                                                                                        cb_uia_display_primitives.cb_uia_show_term(related_term, UNPROVIDED);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                html_utilities.html_princ($str_alt478$Sorry__I_don_t_know_of_anything_r);
                                                                                cb_uia_display_primitives.cb_uia_show_term(v_term, term_phrase);
                                                                                html_utilities.html_princ($str_alt479$_with_respect_to_our_current_topi);
                                                                                cb_uia_display_primitives.cb_uia_show_term(topic, topic_name);
                                                                                html_utilities.html_princ($str_alt427$_);
                                                                            }
                                                                        }
                                                                        html_utilities.html_newline(TWO_INTEGER);
                                                                        cb_utilities.cb_link($UIA_NEXT_INTERACTION, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_296 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_296, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_295, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_294, thread);
                                            }
                                        }
                                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                        }
                                    }
                                } finally {
                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_293, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_297 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL == reuseP) {
                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_297, thread);
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

    public static final SubLObject cb_uiat_concept_relator_guts(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt100);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject phrase = uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    uia_act_new_concept_relator(v_agenda, $REQUIRED, phrase, v_term);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt100);
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_link_uia_concept_relator_guts(SubLObject v_term, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(v_term);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt481$cb_uiat_concept_relator_guts, arglist);
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

    public static final SubLObject cb_uiat_relationship_suggestor_render_request(SubLObject request) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = request;
                SubLObject current = datum;
                SubLObject operator = NIL;
                SubLObject action_type = NIL;
                SubLObject signature = NIL;
                SubLObject plist = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt2);
                operator = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt2);
                action_type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt2);
                signature = current.first();
                current = current.rest();
                plist = current;
                {
                    SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                    SubLObject pcase_var = action_type;
                    if (pcase_var.eql($SHOW)) {
                        {
                            SubLObject datum_298 = plist;
                            SubLObject current_299 = datum_298;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_299;
                            SubLObject bad = NIL;
                            SubLObject current_300 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_298, $list_alt484);
                                current_300 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_298, $list_alt484);
                                if (NIL == member(current_300, $list_alt485, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_300 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_298, $list_alt484);
                            }
                            {
                                SubLObject terms_tail = property_list_member($TERMS, current_299);
                                SubLObject terms = (NIL != terms_tail) ? ((SubLObject) (cadr(terms_tail))) : NIL;
                                SubLObject sentences_tail = property_list_member($SENTENCES, current_299);
                                SubLObject sentences = (NIL != sentences_tail) ? ((SubLObject) (cadr(sentences_tail))) : NIL;
                                if (NIL != list_utilities.lengthE(terms, TWO_INTEGER, UNPROVIDED)) {
                                    {
                                        SubLObject term1 = terms.first();
                                        SubLObject term2 = second(terms);
                                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                        cb_uia_macros.cb_uiat_document_expiration();
                                        cb_uia_display_primitives.cb_uiat_show_load_pacifier(NIL, UNPROVIDED);
                                        dhtml_macros.dhtml_with_dom_script();
                                        dhtml_macros.dhtml_with_toggle_visibility_support();
                                        {
                                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                            try {
                                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_301 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                                        }
                                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                                            html_script_utilities.cb_hoverover_page_init();
                                                        }
                                                        if (NIL != cb_uia_macros.cb_ui_should_be_focused(interaction)) {
                                                            html_script_utilities.html_js_focus_window();
                                                        }
                                                        cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                                                        cb_relationship_suggestor_guts(term1, term2, sentences);
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_301, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
                                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_relationship_suggestor_guts(SubLObject term1, SubLObject term2, SubLObject sentences) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_princ($$$Possible_relationships_between);
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            cb_uia_display_primitives.cb_uia_show_term(term1, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            html_utilities.html_princ($str_alt70$_and_);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            cb_uia_display_primitives.cb_uia_show_term(term2, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            if (NIL == sentences) {
                html_utilities.html_princ($str_alt487$No_suggestions_);
            } else {
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject _prev_bind_0_302 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                            try {
                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                {
                                    SubLObject reuseP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    try {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject _prev_bind_0_303 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                {
                                                    SubLObject new_or_reused = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject _prev_bind_0_304 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                        try {
                                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                            {
                                                                SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                {
                                                                    SubLObject _prev_bind_0_305 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                                            Errors.error($str_alt17$Invalid_attempt_to_reuse_memoizat);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            try {
                                                                                {
                                                                                    SubLObject cdolist_list_var = sentences;
                                                                                    SubLObject sentence = NIL;
                                                                                    for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_306 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
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
                                                                                                    SubLObject _prev_bind_0_307 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                        cb_uia_display_primitives.cb_uia_show_sentence(sentence, UNPROVIDED);
                                                                                                    } finally {
                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_307, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_306, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                {
                                                                                    SubLObject _prev_bind_0_308 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                        }
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_308, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_305, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_304, thread);
                                                        }
                                                    }
                                                    if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_303, thread);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_309 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL == reuseP) {
                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_309, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_302, thread);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_predicate_suggestor_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_310 = plist;
                        SubLObject current_311 = datum_310;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_311;
                        SubLObject bad = NIL;
                        SubLObject current_312 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_310, $list_alt490);
                            current_312 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_310, $list_alt490);
                            if (NIL == member(current_312, $list_alt491, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_312 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_310, $list_alt490);
                        }
                        {
                            SubLObject term_tail = property_list_member($TERM, current_311);
                            SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                            SubLObject sentence_sections_tail = property_list_member($SENTENCE_SECTIONS, current_311);
                            SubLObject sentence_sections = (NIL != sentence_sections_tail) ? ((SubLObject) (cadr(sentence_sections_tail))) : NIL;
                            cb_uiat_predicate_suggestor_show(interaction, v_term, sentence_sections);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_predicate_suggestor_show(SubLObject interaction, SubLObject v_term, SubLObject sentence_sections) {
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
                                SubLObject _prev_bind_0_313 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                    {
                                        SubLObject new_or_reused = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject _prev_bind_0_314 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                {
                                                    SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                    {
                                                        SubLObject _prev_bind_0_315 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                                Errors.error($str_alt17$Invalid_attempt_to_reuse_memoizat);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                try {
                                                                    html_utilities.html_newline(UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                    html_utilities.html_princ($$$Search_Results);
                                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                    html_utilities.html_indent(FOUR_INTEGER);
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_316 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            cb_utilities.cb_link($UIA_COMPLETE_INTERACTION, interaction, $str_alt19$_Continue_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            html_utilities.html_indent(UNPROVIDED);
                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                            html_utilities.html_princ($str_alt493$Here_are_some_example_sentences_s);
                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                            html_utilities.html_indent(FOUR_INTEGER);
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            cb_uia_display_primitives.cb_uia_show_term(v_term, UNPROVIDED);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            {
                                                                                SubLObject cdolist_list_var = sentence_sections;
                                                                                SubLObject sentence_section = NIL;
                                                                                for (sentence_section = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence_section = cdolist_list_var.first()) {
                                                                                    {
                                                                                        SubLObject datum = sentence_section;
                                                                                        SubLObject current = datum;
                                                                                        SubLObject collection = NIL;
                                                                                        SubLObject sentences = NIL;
                                                                                        destructuring_bind_must_consp(current, datum, $list_alt494);
                                                                                        collection = current.first();
                                                                                        current = current.rest();
                                                                                        destructuring_bind_must_consp(current, datum, $list_alt494);
                                                                                        sentences = current.first();
                                                                                        current = current.rest();
                                                                                        if (NIL == current) {
                                                                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                            html_utilities.html_princ($str_alt429$From_);
                                                                                            cb_uia_display_primitives.cb_uia_show_term(collection, UNPROVIDED);
                                                                                            html_utilities.html_princ($str_alt20$___);
                                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                            {
                                                                                                SubLObject cdolist_list_var_317 = sentences;
                                                                                                SubLObject sentence = NIL;
                                                                                                for (sentence = cdolist_list_var_317.first(); NIL != cdolist_list_var_317; cdolist_list_var_317 = cdolist_list_var_317.rest() , sentence = cdolist_list_var_317.first()) {
                                                                                                    html_utilities.html_newline(TWO_INTEGER);
                                                                                                    cb_uia_display_primitives.cb_uia_show_sentence(sentence, UNPROVIDED);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            cdestructuring_bind_error(datum, $list_alt494);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_316, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_315, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_314, thread);
                                            }
                                        }
                                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                        }
                                    }
                                } finally {
                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_313, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_318 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL == reuseP) {
                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_318, thread);
                                }
                            }
                        }
                    }
                } finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0, thread);
                }
            }
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Wrapper around @xref cb-uiat-lexicon-search-guts
     */
    public static final SubLObject cb_uiat_lexicon_search_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_319 = plist;
                        SubLObject current_320 = datum_319;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_320;
                        SubLObject bad = NIL;
                        SubLObject current_321 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_319, $list_alt497);
                            current_321 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_319, $list_alt497);
                            if (NIL == member(current_321, $list_alt498, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_321 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_319, $list_alt497);
                        }
                        {
                            SubLObject pattern_tail = property_list_member($PATTERN, current_320);
                            SubLObject pattern = (NIL != pattern_tail) ? ((SubLObject) (cadr(pattern_tail))) : NIL;
                            SubLObject search_type_tail = property_list_member($SEARCH_TYPE, current_320);
                            SubLObject search_type = (NIL != search_type_tail) ? ((SubLObject) (cadr(search_type_tail))) : NIL;
                            SubLObject result_page_num_tail = property_list_member($RESULT_PAGE_NUM, current_320);
                            SubLObject result_page_num = (NIL != result_page_num_tail) ? ((SubLObject) (cadr(result_page_num_tail))) : NIL;
                            SubLObject matching_index_entries_tail = property_list_member($MATCHING_INDEX_ENTRIES, current_320);
                            SubLObject matching_index_entries = (NIL != matching_index_entries_tail) ? ((SubLObject) (cadr(matching_index_entries_tail))) : NIL;
                            return cb_uiat_lexicon_search_guts(interaction, pattern, search_type, result_page_num, matching_index_entries);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Formats the display of the matching index entries
     */
    public static final SubLObject cb_uiat_lexicon_search_guts(SubLObject interaction, SubLObject pattern, SubLObject search_type, SubLObject result_page_num, SubLObject matching_index_entries) {
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
            cb_utilities.cb_link($UIA_REJECT_INTERACTION, interaction, $str_alt448$_Done_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject entries_to_display = cb_uiat_lexicon_search_items_to_display(result_page_num, matching_index_entries, uia_tools_browsing.$uia_lexicon_search_display_increment$.getGlobalValue(), interaction);
                if (NIL == entries_to_display) {
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_princ($str_alt504$Sorry__I_could_not_find_any_conce);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt505$_s, pattern);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_princ($str_alt506$_in_their_names_);
                    return NIL;
                }
                cb_uiat_lexicon_search_show_page_num(result_page_num, interaction, matching_index_entries);
                html_utilities.html_newline(UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt507$The_following_concepts_have_the_w);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt505$_s, pattern);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_indent(UNPROVIDED);
                html_utilities.html_princ($str_alt508$_occurring_);
                html_utilities.html_indent(UNPROVIDED);
                html_utilities.html_princ(uia_tools_browsing.uiat_search_type_description(search_type));
                html_utilities.html_princ($str_alt20$___);
                {
                    SubLObject bgcolor = NIL;
                    if (NIL == entries_to_display) {
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ($$$no_results_found);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    } else {
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
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
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt510$95_);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                thread.resetMultipleValues();
                                {
                                    SubLObject _prev_bind_0_322 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                        {
                                            SubLObject reuseP = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            try {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject _prev_bind_0_323 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                    try {
                                                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                        {
                                                            SubLObject new_or_reused = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject _prev_bind_0_324 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                try {
                                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                    {
                                                                        SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                        {
                                                                            SubLObject _prev_bind_0_325 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                                                    Errors.error($str_alt17$Invalid_attempt_to_reuse_memoizat);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (NIL == cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                                                                            bgcolor = html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread);
                                                                                        }
                                                                                        {
                                                                                            SubLObject color_toggle = NIL;
                                                                                            SubLObject list_var = NIL;
                                                                                            SubLObject item = NIL;
                                                                                            SubLObject ignore_me = NIL;
                                                                                            for (list_var = entries_to_display, item = list_var.first(), ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                                                                                if (NIL != cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                                                                                    if (NIL != color_toggle) {
                                                                                                        color_toggle = NIL;
                                                                                                    } else {
                                                                                                        color_toggle = T;
                                                                                                    }
                                                                                                    bgcolor = (NIL != color_toggle) ? ((SubLObject) (html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread))) : html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread);
                                                                                                }
                                                                                                {
                                                                                                    SubLObject datum = item;
                                                                                                    SubLObject current = datum;
                                                                                                    SubLObject v_term = NIL;
                                                                                                    SubLObject term_phrase = NIL;
                                                                                                    SubLObject via_string = NIL;
                                                                                                    destructuring_bind_must_consp(current, datum, $list_alt511);
                                                                                                    v_term = current.first();
                                                                                                    current = current.rest();
                                                                                                    destructuring_bind_must_consp(current, datum, $list_alt511);
                                                                                                    term_phrase = current.first();
                                                                                                    current = current.rest();
                                                                                                    destructuring_bind_must_consp(current, datum, $list_alt511);
                                                                                                    via_string = current.first();
                                                                                                    current = current.rest();
                                                                                                    if (NIL == current) {
                                                                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                        if (NIL != bgcolor) {
                                                                                                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_markup(bgcolor);
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        }
                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_326 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                if (true) {
                                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                    html_utilities.html_markup($str_alt512$70_);
                                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                                }
                                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_327 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                        cb_uia_display_primitives.cb_uia_show_term(v_term, term_phrase);
                                                                                                                    } finally {
                                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_327, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                if (NIL != string_utilities.non_empty_stringP(via_string)) {
                                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_328 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt513$via__S, via_string);
                                                                                                                        } finally {
                                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_328, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                                }
                                                                                                            } finally {
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_326, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                                    } else {
                                                                                                        cdestructuring_bind_error(datum, $list_alt511);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_329 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                                }
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_329, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_325, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_324, thread);
                                                                }
                                                            }
                                                            if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                            }
                                                        }
                                                    } finally {
                                                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_323, thread);
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_330 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if (NIL == reuseP) {
                                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_330, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_322, thread);
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    }
                    cb_uiat_lexicon_search_show_nav_links(result_page_num, interaction, matching_index_entries);
                }
            }
            cb_uia_display_primitives.cb_uiat_hide_load_pacifier(NIL);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Show links for the user to navigate to previous/subsequent result pages.
     */
    public static final SubLObject cb_uiat_lexicon_search_show_nav_links(SubLObject result_page_num, SubLObject interaction, SubLObject matching_index_entries) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result_pages = user_interaction_agenda.ui_state_lookup(interaction, $RESULT_PAGES, NIL);
                if ((NIL != list_utilities.lengthG(result_pages, ONE_INTEGER, UNPROVIDED)) || (NIL != cb_uiat_lexicon_search_more_matchesP(interaction, result_page_num, matching_index_entries))) {
                    html_utilities.html_princ($str_alt515$__);
                    {
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(result_page_num); i = add(i, ONE_INTEGER)) {
                            cb_utilities.cb_link($UIAT_LEXICON_SEARCH_GOTO_PAGE, interaction, i, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_indent(UNPROVIDED);
                        }
                    }
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt517$_S_, number_utilities.f_1X(result_page_num));
                    {
                        SubLObject curr = number_utilities.f_1X(result_page_num);
                        while (NIL != list_utilities.lengthG(result_pages, curr, UNPROVIDED)) {
                            cb_utilities.cb_link($UIAT_LEXICON_SEARCH_GOTO_PAGE, interaction, curr, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            curr = add(curr, ONE_INTEGER);
                            html_utilities.html_indent(UNPROVIDED);
                        } 
                        if (NIL != cb_uiat_lexicon_search_more_matchesP(interaction, curr, matching_index_entries)) {
                            cb_utilities.cb_link($UIAT_LEXICON_SEARCH_GOTO_PAGE, interaction, curr, $str_alt518$_more_, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    html_utilities.html_princ($str_alt519$__);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_lexicon_search_show_page_num(SubLObject result_page_num, SubLObject interaction, SubLObject matching_index_entries) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_1_indexed_result_page_num = number_utilities.f_1X(result_page_num);
                SubLObject start_index = user_interaction_agenda.ui_state_lookup(interaction, $START_INDEX, ZERO_INTEGER);
                SubLObject result_pages = user_interaction_agenda.ui_state_lookup(interaction, $RESULT_PAGES, UNPROVIDED);
                SubLObject total_pages = cb_uiat_lexicon_search_total_page_estimate(length(matching_index_entries), length(result_pages), start_index);
                SubLObject approximateP = makeBoolean(NIL == list_utilities.lengthE(result_pages, total_pages, UNPROVIDED));
                html_utilities.html_newline(UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt521$Page__strong__S__strong__of_A__st, new SubLObject[]{ v_1_indexed_result_page_num, NIL != approximateP ? ((SubLObject) ($str_alt522$_approximately)) : $str_alt361$, total_pages });
                return total_pages;
            }
        }
    }

    public static final SubLObject cb_uiat_lexicon_search_total_page_estimate(SubLObject total_num, SubLObject result_page_num, SubLObject start_index) {
        {
            SubLObject remaining_items = subtract(total_num, start_index);
            SubLObject remaining_whole_pages = integerDivide(remaining_items, uia_tools_browsing.$uia_lexicon_search_display_increment$.getGlobalValue());
            SubLObject remaining_pages = (mod(remaining_items, uia_tools_browsing.$uia_lexicon_search_display_increment$.getGlobalValue()).isZero()) ? ((SubLObject) (remaining_whole_pages)) : number_utilities.f_1X(remaining_whole_pages);
            return add(result_page_num, remaining_pages);
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Are there more matches to show?
     */
    public static final SubLObject cb_uiat_lexicon_search_more_matchesP(SubLObject interaction, SubLObject result_page_num, SubLObject matching_index_entries) {
        {
            SubLObject result_pages = user_interaction_agenda.ui_state_lookup(interaction, $RESULT_PAGES, UNPROVIDED);
            SubLObject start_index = user_interaction_agenda.ui_state_lookup(interaction, $START_INDEX, UNPROVIDED);
            return makeBoolean((NIL != list_utilities.lengthG(result_pages, number_utilities.f_1X(result_page_num), UNPROVIDED)) || (NIL != list_utilities.lengthG(matching_index_entries, start_index, UNPROVIDED)));
        }
    }

    /**
     * Get up to the next MAX term-unique items from CANDIDATES.
     *
     * @return LISTP of (TERM TERM-PHRASE VIA-STRING) tuples
     */
    public static final SubLObject cb_uiat_lexicon_search_items_to_display(SubLObject result_page_num, SubLObject candidates, SubLObject max, SubLObject interaction) {
        {
            SubLObject result_pages = user_interaction_agenda.ui_state_lookup(interaction, $RESULT_PAGES, UNPROVIDED);
            SubLObject ans = nth(result_page_num, result_pages);
            if (NIL != list_utilities.lengthE(result_pages, result_page_num, UNPROVIDED)) {
                {
                    SubLObject doneP = NIL;
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject num_done = ZERO_INTEGER;
                    SubLObject start_index = user_interaction_agenda.ui_state_lookup(interaction, $START_INDEX, ZERO_INTEGER);
                    SubLObject new_start_index = start_index;
                    SubLObject list_var = NIL;
                    SubLObject item = NIL;
                    SubLObject i = NIL;
                    for (list_var = candidates, item = list_var.first(), i = ZERO_INTEGER; !((NIL != doneP) || (NIL == list_var)); list_var = list_var.rest() , item = list_var.first() , i = add(ONE_INTEGER, i)) {
                        if (i.numGE(start_index)) {
                            new_start_index = add(new_start_index, ONE_INTEGER);
                            {
                                SubLObject v_term = nl_trie_accessors.nl_trie_index_item_term(item);
                                if ((($NOT_FOUND == list_utilities.alist_lookup(ans, v_term, symbol_function(EQUAL), $NOT_FOUND)) && (NIL == cb_uiat_lexicon_search_previously_shownP(v_term, result_pages))) && (NIL != uia_tools_browsing.uia_suitable_phrase_index_entry(v_agenda, item))) {
                                    num_done = add(num_done, ONE_INTEGER);
                                    {
                                        SubLObject item_phrase = nl_trie_accessors.nl_trie_index_item_phrase(item);
                                        SubLObject term_phrase = uia_trampolines.uia_html_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED);
                                        SubLObject via_string = item_phrase;
                                        ans = list_utilities.alist_enter(ans, v_term, list(term_phrase, via_string), UNPROVIDED);
                                    }
                                    doneP = numGE(num_done, max);
                                }
                            }
                        }
                    }
                    user_interaction_agenda.ui_state_update(interaction, $START_INDEX, new_start_index);
                }
                if (NIL != ans) {
                    ans = Sort.sort(ans, symbol_function($sym524$STRING_), symbol_function(SECOND));
                    ans = Sort.stable_sort(ans, symbol_function(LESSER_LENGTH_P), symbol_function(SECOND));
                    ans = Sort.stable_sort(ans, symbol_function(LESSER_LENGTH_P), symbol_function(THIRD));
                    user_interaction_agenda.ui_state_update(interaction, $RESULT_PAGES, append(result_pages, list(ans)));
                }
            }
            return ans;
        }
    }

    public static final SubLObject cb_uiat_lexicon_search_previously_shownP(SubLObject v_term, SubLObject result_pages) {
        {
            SubLObject foundP = NIL;
            if (NIL == foundP) {
                {
                    SubLObject csome_list_var = result_pages;
                    SubLObject result_page = NIL;
                    for (result_page = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , result_page = csome_list_var.first()) {
                        if ($NOT_FOUND != list_utilities.alist_lookup(result_page, v_term, symbol_function(EQUAL), $NOT_FOUND)) {
                            foundP = T;
                        }
                    }
                }
            }
            return foundP;
        }
    }

    public static final SubLObject cb_link_uiat_lexicon_search_goto_page(SubLObject interaction, SubLObject goto_page_num, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = princ_to_string(number_utilities.f_1X(goto_page_num));
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(user_interaction_agenda.ui_id(interaction), goto_page_num);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt528$cb_uiat_lexicon_search_goto_page, arglist);
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

    public static final SubLObject cb_uiat_lexicon_search_goto_page(SubLObject args) {
        {
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject ui_id = NIL;
            SubLObject goto_page_num = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt530);
            ui_id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt530);
            goto_page_num = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                    SubLObject interaction = user_interaction_agenda.uia_find_by_id(v_agenda, ui_id);
                    SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $GOTO_PAGE, list($GOTO_PAGE_NUM, goto_page_num));
                    return cb_user_interaction_agenda.cb_uia_handle_reply(v_agenda, reply);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt530);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_cb_uia_tools_browsing_file() {
        declareFunction("cb_uiat_concept_clarifier_render_request", "CB-UIAT-CONCEPT-CLARIFIER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_concept_clarifier_guts", "CB-UIAT-CONCEPT-CLARIFIER-GUTS", 9, 0, false);
        declareFunction("cb_uiat_concept_clarifier_page_for_hoverover", "CB-UIAT-CONCEPT-CLARIFIER-PAGE-FOR-HOVEROVER", 1, 1, false);
        declareFunction("cb_concept_clarifier_handler", "CB-CONCEPT-CLARIFIER-HANDLER", 1, 0, false);
        declareFunction("cb_link_uia_concept_clarifier", "CB-LINK-UIA-CONCEPT-CLARIFIER", 2, 0, false);
        declareFunction("cb_uia_concept_clarifier", "CB-UIA-CONCEPT-CLARIFIER", 1, 0, false);
        declareFunction("cb_uia_concept_clarifier_fort_id", "CB-UIA-CONCEPT-CLARIFIER-FORT-ID", 1, 0, false);
        declareFunction("cb_link_uia_add_term_to_scrap_book", "CB-LINK-UIA-ADD-TERM-TO-SCRAP-BOOK", 2, 0, false);
        declareFunction("cb_uia_add_term_to_scrap_book", "CB-UIA-ADD-TERM-TO-SCRAP-BOOK", 1, 0, false);
        declareFunction("cb_uiat_sentence_clarifier_render_request", "CB-UIAT-SENTENCE-CLARIFIER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_sentence_clarifier_gaf_guts", "CB-UIAT-SENTENCE-CLARIFIER-GAF-GUTS", 8, 0, false);
        declareFunction("cb_uiat_sentence_clarifier_rule_guts", "CB-UIAT-SENTENCE-CLARIFIER-RULE-GUTS", 6, 0, false);
        declareFunction("cb_uiat_sentence_clarifier_rule_clauses", "CB-UIAT-SENTENCE-CLARIFIER-RULE-CLAUSES", 2, 0, false);
        declareFunction("cb_uiat_sentence_clarifier_show_rule_lit", "CB-UIAT-SENTENCE-CLARIFIER-SHOW-RULE-LIT", 2, 0, false);
        declareFunction("cb_uiat_sentence_clarifier_rule_links", "CB-UIAT-SENTENCE-CLARIFIER-RULE-LINKS", 3, 0, false);
        declareFunction("cb_uiat_sentence_clarifier_question_guts", "CB-UIAT-SENTENCE-CLARIFIER-QUESTION-GUTS", 5, 0, false);
        declareFunction("disable_uia_sentence_editingP", "DISABLE-UIA-SENTENCE-EDITING?", 1, 0, false);
        declareFunction("cb_uiat_sentence_clarifier_page_for_hoverover", "CB-UIAT-SENTENCE-CLARIFIER-PAGE-FOR-HOVEROVER", 1, 2, false);
        declareFunction("cb_uiat_sentence_clarifier_handler", "CB-UIAT-SENTENCE-CLARIFIER-HANDLER", 1, 0, false);
        declareFunction("cb_link_uia_sentence_clarifier", "CB-LINK-UIA-SENTENCE-CLARIFIER", 2, 1, false);
        declareFunction("cb_uia_display_non_linking_sentence_hoverover", "CB-UIA-DISPLAY-NON-LINKING-SENTENCE-HOVEROVER", 1, 2, false);
        declareFunction("cb_uiat_sentence_clarifier_link_handler", "CB-UIAT-SENTENCE-CLARIFIER-LINK-HANDLER", 0, 1, false);
        declareFunction("cb_link_uia_add_assertion_to_scrap_book", "CB-LINK-UIA-ADD-ASSERTION-TO-SCRAP-BOOK", 2, 0, false);
        declareFunction("cb_uiat_add_assertion_to_scrap_book_handler", "CB-UIAT-ADD-ASSERTION-TO-SCRAP-BOOK-HANDLER", 1, 0, false);
        declareFunction("cb_link_uia_assertion_precision_editor", "CB-LINK-UIA-ASSERTION-PRECISION-EDITOR", 2, 0, false);
        declareFunction("cb_uiat_assertion_precision_editor_handler", "CB-UIAT-ASSERTION-PRECISION-EDITOR-HANDLER", 1, 0, false);
        declareFunction("cb_uiat_show_cycl", "CB-UIAT-SHOW-CYCL", 1, 0, false);
        declareFunction("cb_link_uia_show_cycl", "CB-LINK-UIA-SHOW-CYCL", 2, 0, false);
        declareFunction("cb_uiat_show_cycl_sentence_translations", "CB-UIAT-SHOW-CYCL-SENTENCE-TRANSLATIONS", 2, 0, false);
        declareFunction("cb_uiat_justification_browser_render_request", "CB-UIAT-JUSTIFICATION-BROWSER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_justification_browser_guts", "CB-UIAT-JUSTIFICATION-BROWSER-GUTS", 2, 0, false);
        declareFunction("cb_uia_show_bindings_vertical", "CB-UIA-SHOW-BINDINGS-VERTICAL", 1, 1, false);
        declareFunction("cb_uia_show_binding_vertical", "CB-UIA-SHOW-BINDING-VERTICAL", 1, 0, false);
        declareFunction("cb_link_uiat_justification_browser_done", "CB-LINK-UIAT-JUSTIFICATION-BROWSER-DONE", 2, 0, false);
        declareFunction("cb_uiat_justification_browser_done", "CB-UIAT-JUSTIFICATION-BROWSER-DONE", 1, 0, false);
        declareFunction("cb_link_uia_justification_browser_external", "CB-LINK-UIA-JUSTIFICATION-BROWSER-EXTERNAL", 1, 1, false);
        declareFunction("cb_uiat_justification_browser_link_handler_external", "CB-UIAT-JUSTIFICATION-BROWSER-LINK-HANDLER-EXTERNAL", 0, 1, false);
        declareFunction("cb_uiat_justification_browser_nextP", "CB-UIAT-JUSTIFICATION-BROWSER-NEXT?", 2, 0, false);
        declareFunction("cb_link_uia_justification_browser", "CB-LINK-UIA-JUSTIFICATION-BROWSER", 1, 1, false);
        declareFunction("cb_uiat_justification_browser_link_handler", "CB-UIAT-JUSTIFICATION-BROWSER-LINK-HANDLER", 0, 1, false);
        declareFunction("cb_uiat_sentence_variations_render_request", "CB-UIAT-SENTENCE-VARIATIONS-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_sentence_variations_show", "CB-UIAT-SENTENCE-VARIATIONS-SHOW", 3, 0, false);
        declareFunction("cb_uiat_handle_sentence_variations", "CB-UIAT-HANDLE-SENTENCE-VARIATIONS", 1, 0, false);
        declareFunction("cb_link_uia_sentence_variations", "CB-LINK-UIA-SENTENCE-VARIATIONS", 2, 0, false);
        declareFunction("cb_uiat_domain_examples_render_request", "CB-UIAT-DOMAIN-EXAMPLES-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_domain_examples_show", "CB-UIAT-DOMAIN-EXAMPLES-SHOW", 6, 0, false);
        declareFunction("cb_uiat_domain_examples_emit_doms", "CB-UIAT-DOMAIN-EXAMPLES-EMIT-DOMS", 1, 0, false);
        declareFunction("cb_uiat_domain_examples_generate_subgraph_id", "CB-UIAT-DOMAIN-EXAMPLES-GENERATE-SUBGRAPH-ID", 1, 0, false);
        declareFunction("cb_uiat_domain_examples_next_subgraph_id", "CB-UIAT-DOMAIN-EXAMPLES-NEXT-SUBGRAPH-ID", 0, 0, false);
        declareFunction("cb_uiat_domain_examples_render_example_section", "CB-UIAT-DOMAIN-EXAMPLES-RENDER-EXAMPLE-SECTION", 2, 0, false);
        declareFunction("cb_uiat_domain_examples_render_sentence_info", "CB-UIAT-DOMAIN-EXAMPLES-RENDER-SENTENCE-INFO", 1, 0, false);
        declareFunction("cb_uiat_domain_examples_render_index", "CB-UIAT-DOMAIN-EXAMPLES-RENDER-INDEX", 1, 0, false);
        declareFunction("cb_uiat_domain_examples_goto_links", "CB-UIAT-DOMAIN-EXAMPLES-GOTO-LINKS", 0, 1, false);
        declareFunction("cb_uiat_domain_examples_manipulate_section", "CB-UIAT-DOMAIN-EXAMPLES-MANIPULATE-SECTION", 4, 0, false);
        declareFunction("cb_uiat_handle_domain_examples_show", "CB-UIAT-HANDLE-DOMAIN-EXAMPLES-SHOW", 1, 0, false);
        declareFunction("cb_uiat_domain_examples_launch", "CB-UIAT-DOMAIN-EXAMPLES-LAUNCH", 1, 0, false);
        declareFunction("cb_link_uia_domain_examples_launch", "CB-LINK-UIA-DOMAIN-EXAMPLES-LAUNCH", 1, 0, false);
        declareFunction("cb_uiat_knowledge_scrapbook_render_request", "CB-UIAT-KNOWLEDGE-SCRAPBOOK-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_knowledge_scrapbook_guts", "CB-UIAT-KNOWLEDGE-SCRAPBOOK-GUTS", 8, 0, false);
        declareFunction("cb_uiat_knowledge_scrapbook_buttons", "CB-UIAT-KNOWLEDGE-SCRAPBOOK-BUTTONS", 1, 0, false);
        declareFunction("cb_link_uiat_kescrap_continue", "CB-LINK-UIAT-KESCRAP-CONTINUE", 2, 0, false);
        declareFunction("cb_link_uiat_kescrap_load", "CB-LINK-UIAT-KESCRAP-LOAD", 2, 0, false);
        declareFunction("cb_link_uiat_kescrap_save", "CB-LINK-UIAT-KESCRAP-SAVE", 2, 0, false);
        declareFunction("cb_uiat_knowledge_scrapbook_render_terms", "CB-UIAT-KNOWLEDGE-SCRAPBOOK-RENDER-TERMS", 4, 0, false);
        declareFunction("cb_link_uiat_kescrap_drop_term", "CB-LINK-UIAT-KESCRAP-DROP-TERM", 3, 0, false);
        declareFunction("cb_uiat_knowledge_scrapbook_render_assertibles", "CB-UIAT-KNOWLEDGE-SCRAPBOOK-RENDER-ASSERTIBLES", 5, 0, false);
        declareFunction("cb_link_uia_knowledge_scrapbook_launch", "CB-LINK-UIA-KNOWLEDGE-SCRAPBOOK-LAUNCH", 1, 0, false);
        declareFunction("cb_uiat_knowledge_scrapbook_launch", "CB-UIAT-KNOWLEDGE-SCRAPBOOK-LAUNCH", 1, 0, false);
        declareFunction("cb_link_uiat_kescrap_drop_assertion", "CB-LINK-UIAT-KESCRAP-DROP-ASSERTION", 3, 0, false);
        declareFunction("cb_link_uiat_kescrap_select_assertion", "CB-LINK-UIAT-KESCRAP-SELECT-ASSERTION", 3, 0, false);
        declareFunction("cb_link_uiat_kescrap_drop_sentence", "CB-LINK-UIAT-KESCRAP-DROP-SENTENCE", 3, 0, false);
        declareFunction("cb_link_uiat_kescrap_select_sentence", "CB-LINK-UIAT-KESCRAP-SELECT-SENTENCE", 3, 0, false);
        declareFunction("cb_uiat_handle_knowledge_scrapbook_guts", "CB-UIAT-HANDLE-KNOWLEDGE-SCRAPBOOK-GUTS", 1, 0, false);
        declareFunction("cb_uiat_kescrap_continue", "CB-UIAT-KESCRAP-CONTINUE", 1, 0, false);
        declareFunction("cb_uiat_kescrap_load", "CB-UIAT-KESCRAP-LOAD", 1, 0, false);
        declareFunction("cb_uiat_kescrap_save", "CB-UIAT-KESCRAP-SAVE", 1, 0, false);
        declareFunction("cb_uiat_kescrap_select_assertion", "CB-UIAT-KESCRAP-SELECT-ASSERTION", 1, 0, false);
        declareFunction("cb_uiat_kescrap_drop_assertion", "CB-UIAT-KESCRAP-DROP-ASSERTION", 1, 0, false);
        declareFunction("cb_uiat_kescrap_select_sentence", "CB-UIAT-KESCRAP-SELECT-SENTENCE", 1, 0, false);
        declareFunction("cb_uiat_kescrap_drop_sentence", "CB-UIAT-KESCRAP-DROP-SENTENCE", 1, 0, false);
        declareFunction("cb_uiat_kescrap_select_term", "CB-UIAT-KESCRAP-SELECT-TERM", 1, 0, false);
        declareFunction("cb_uiat_kescrap_drop_term", "CB-UIAT-KESCRAP-DROP-TERM", 1, 0, false);
        declareFunction("cb_uiat_ontology_browser_render_request", "CB-UIAT-ONTOLOGY-BROWSER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_concept_recognizer_render_request", "CB-UIAT-CONCEPT-RECOGNIZER-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_concept_recognizer_guts", "CB-UIAT-CONCEPT-RECOGNIZER-GUTS", 5, 0, false);
        declareFunction("cb_uiat_asserted_sentences_render_request", "CB-UIAT-ASSERTED-SENTENCES-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_asserted_sentences_guts", "CB-UIAT-ASSERTED-SENTENCES-GUTS", 3, 0, false);
        declareFunction("cb_uia_asserted_sentences_show_term", "CB-UIA-ASSERTED-SENTENCES-SHOW-TERM", 2, 0, false);
        declareFunction("cb_uia_asserted_sentences_buttons", "CB-UIA-ASSERTED-SENTENCES-BUTTONS", 2, 0, false);
        declareFunction("cb_link_uia_asserted_sentences_guts", "CB-LINK-UIA-ASSERTED-SENTENCES-GUTS", 2, 0, false);
        declareFunction("cb_uia_asserted_sentences_guts", "CB-UIA-ASSERTED-SENTENCES-GUTS", 1, 0, false);
        declareFunction("asserted_sentences_query_for", "ASSERTED-SENTENCES-QUERY-FOR", 1, 0, false);
        declareFunction("cb_uiat_concept_comparator_render_request", "CB-UIAT-CONCEPT-COMPARATOR-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_concept_comparator_guts", "CB-UIAT-CONCEPT-COMPARATOR-GUTS", 9, 0, false);
        declareFunction("cb_link_uiat_concept_comparator_done", "CB-LINK-UIAT-CONCEPT-COMPARATOR-DONE", 2, 0, false);
        declareFunction("cb_uiat_concept_comparator_done", "CB-UIAT-CONCEPT-COMPARATOR-DONE", 1, 0, false);
        declareFunction("cb_concept_comparator_show_common_sentences", "CB-CONCEPT-COMPARATOR-SHOW-COMMON-SENTENCES", 3, 0, false);
        declareFunction("cb_concept_comparator_show_unique_sentences", "CB-CONCEPT-COMPARATOR-SHOW-UNIQUE-SENTENCES", 3, 0, false);
        declareFunction("cb_concept_comparator_paraphrases", "CB-CONCEPT-COMPARATOR-PARAPHRASES", 2, 0, false);
        declareFunction("comparison_sentences_query_for", "COMPARISON-SENTENCES-QUERY-FOR", 2, 0, false);
        declareFunction("contrasting_sentences_query_for", "CONTRASTING-SENTENCES-QUERY-FOR", 2, 0, false);
        declareFunction("uia_act_new_concept_relator", "UIA-ACT-NEW-CONCEPT-RELATOR", 3, 1, false);
        declareFunction("uiat_concept_relator_hint", "UIAT-CONCEPT-RELATOR-HINT", 1, 0, false);
        declareFunction("uiat_concept_relator_child_completed", "UIAT-CONCEPT-RELATOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("cb_uiat_concept_relator_display", "CB-UIAT-CONCEPT-RELATOR-DISPLAY", 1, 0, false);
        declareFunction("cb_concept_relator_guts", "CB-CONCEPT-RELATOR-GUTS", 1, 0, false);
        declareFunction("cb_uiat_concept_relator_guts", "CB-UIAT-CONCEPT-RELATOR-GUTS", 1, 0, false);
        declareFunction("cb_link_uia_concept_relator_guts", "CB-LINK-UIA-CONCEPT-RELATOR-GUTS", 2, 0, false);
        declareFunction("cb_uiat_relationship_suggestor_render_request", "CB-UIAT-RELATIONSHIP-SUGGESTOR-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_relationship_suggestor_guts", "CB-RELATIONSHIP-SUGGESTOR-GUTS", 3, 0, false);
        declareFunction("cb_uiat_predicate_suggestor_render_request", "CB-UIAT-PREDICATE-SUGGESTOR-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_predicate_suggestor_show", "CB-UIAT-PREDICATE-SUGGESTOR-SHOW", 3, 0, false);
        declareFunction("cb_uiat_lexicon_search_render_request", "CB-UIAT-LEXICON-SEARCH-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_uiat_lexicon_search_guts", "CB-UIAT-LEXICON-SEARCH-GUTS", 5, 0, false);
        declareFunction("cb_uiat_lexicon_search_show_nav_links", "CB-UIAT-LEXICON-SEARCH-SHOW-NAV-LINKS", 3, 0, false);
        declareFunction("cb_uiat_lexicon_search_show_page_num", "CB-UIAT-LEXICON-SEARCH-SHOW-PAGE-NUM", 3, 0, false);
        declareFunction("cb_uiat_lexicon_search_total_page_estimate", "CB-UIAT-LEXICON-SEARCH-TOTAL-PAGE-ESTIMATE", 3, 0, false);
        declareFunction("cb_uiat_lexicon_search_more_matchesP", "CB-UIAT-LEXICON-SEARCH-MORE-MATCHES?", 3, 0, false);
        declareFunction("cb_uiat_lexicon_search_items_to_display", "CB-UIAT-LEXICON-SEARCH-ITEMS-TO-DISPLAY", 4, 0, false);
        declareFunction("cb_uiat_lexicon_search_previously_shownP", "CB-UIAT-LEXICON-SEARCH-PREVIOUSLY-SHOWN?", 2, 0, false);
        declareFunction("cb_link_uiat_lexicon_search_goto_page", "CB-LINK-UIAT-LEXICON-SEARCH-GOTO-PAGE", 2, 1, false);
        declareFunction("cb_uiat_lexicon_search_goto_page", "CB-UIAT-LEXICON-SEARCH-GOTO-PAGE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_tools_browsing_file() {
        deflexical("*PREDICATE-TYPES-NOT-UIA-EDITABLE*", $list_alt182);
        defparameter("*CB-UIAT-DOMAIN-EXAMPLES-CURRENT-SUBGRAPH-ID*", NIL);
        deflexical("*CB-UIAT-DOMAIN-EXAMPLES-MANIPULATE-SECTION-BGCOLOR*", $$$FFFFDF);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_tools_browsing_file() {
                cb_uia_tool_declaration.declare_cb_uia_tool($CONCEPT_CLARIFIER, $list_alt1);
        html_macros.note_html_handler_function(CB_CONCEPT_CLARIFIER_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_CONCEPT_CLARIFIER, CB_LINK_UIA_CONCEPT_CLARIFIER, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_CONCEPT_CLARIFIER);
        html_macros.note_html_handler_function(CB_UIA_CONCEPT_CLARIFIER_FORT_ID);
        cb_utilities.setup_cb_link_method($UIA_ADD_TERM_TO_SCRAP_BOOK, CB_LINK_UIA_ADD_TERM_TO_SCRAP_BOOK, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_ADD_TERM_TO_SCRAP_BOOK);
        cb_uia_tool_declaration.declare_cb_uia_tool($SENTENCE_CLARIFIER, $list_alt113);
        html_macros.note_html_handler_function(CB_UIAT_SENTENCE_CLARIFIER_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_SENTENCE_CLARIFIER, CB_LINK_UIA_SENTENCE_CLARIFIER, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_SENTENCE_CLARIFIER_LINK_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_ADD_ASSERTION_TO_SCRAP_BOOK, CB_LINK_UIA_ADD_ASSERTION_TO_SCRAP_BOOK, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_ADD_ASSERTION_TO_SCRAP_BOOK_HANDLER);
        cb_utilities.setup_cb_link_method($UIA_ASSERTION_PRECISION_EDITOR, CB_LINK_UIA_ASSERTION_PRECISION_EDITOR, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_ASSERTION_PRECISION_EDITOR_HANDLER);
        html_macros.note_html_handler_function(CB_UIAT_SHOW_CYCL);
        cb_utilities.setup_cb_link_method($UIA_SHOW_CYCL, CB_LINK_UIA_SHOW_CYCL, TWO_INTEGER);
        cb_uia_tool_declaration.declare_cb_uia_tool($JUSTIFICATION_BROWSER, $list_alt230);
        cb_utilities.setup_cb_link_method($UIAT_JUSTIFICATION_BROWSER_DONE, CB_LINK_UIAT_JUSTIFICATION_BROWSER_DONE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_JUSTIFICATION_BROWSER_DONE);
        cb_utilities.setup_cb_link_method($UIA_JUSTIFICATION_BROWSER_EXTERNAL, CB_LINK_UIA_JUSTIFICATION_BROWSER_EXTERNAL, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_JUSTIFICATION_BROWSER_LINK_HANDLER_EXTERNAL);
        cb_utilities.setup_cb_link_method($UIA_JUSTIFICATION_BROWSER, CB_LINK_UIA_JUSTIFICATION_BROWSER, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_JUSTIFICATION_BROWSER_LINK_HANDLER);
        cb_uia_tool_declaration.declare_cb_uia_tool($SENTENCE_VARIATIONS, $list_alt267);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_SENTENCE_VARIATIONS);
        cb_utilities.setup_cb_link_method($UIA_SENTENCE_VARIATIONS, CB_LINK_UIA_SENTENCE_VARIATIONS, TWO_INTEGER);
        cb_uia_tool_declaration.declare_cb_uia_tool($DOMAIN_EXAMPLES, $list_alt278);
        sethash($UIA_DOMAIN_EXAMPLES, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str_alt307$uia_domain_examples_html, NIL));
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_DOMAIN_EXAMPLES_SHOW);
        html_macros.note_html_handler_function(CB_UIAT_DOMAIN_EXAMPLES_LAUNCH);
        cb_utilities.setup_cb_link_method($UIA_DOMAIN_EXAMPLES_LAUNCH, CB_LINK_UIA_DOMAIN_EXAMPLES_LAUNCH, ONE_INTEGER);
        cb_uia_tool_declaration.declare_cb_uia_tool($KNOWLEDGE_SCRAPBOOK, $list_alt330);
        cb_utilities.setup_cb_link_method($UIAT_KESCRAP_CONTINUE, CB_LINK_UIAT_KESCRAP_CONTINUE, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($UIAT_KESCRAP_LOAD, CB_LINK_UIAT_KESCRAP_LOAD, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($UIAT_KESCRAP_SAVE, CB_LINK_UIAT_KESCRAP_SAVE, TWO_INTEGER);
        cb_utilities.setup_cb_link_method($UIAT_KESCRAP_DROP_TERM, CB_LINK_UIAT_KESCRAP_DROP_TERM, THREE_INTEGER);
        cb_utilities.setup_cb_link_method($UIA_KNOWLEDGE_SCRAPBOOK_LAUNCH, CB_LINK_UIA_KNOWLEDGE_SCRAPBOOK_LAUNCH, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_KNOWLEDGE_SCRAPBOOK_LAUNCH);
        cb_utilities.setup_cb_link_method($UIAT_KESCRAP_DROP_ASSERTION, CB_LINK_UIAT_KESCRAP_DROP_ASSERTION, THREE_INTEGER);
        cb_utilities.setup_cb_link_method($UIAT_KESCRAP_SELECT_ASSERTION, CB_LINK_UIAT_KESCRAP_SELECT_ASSERTION, THREE_INTEGER);
        cb_utilities.setup_cb_link_method($UIAT_KESCRAP_DROP_SENTENCE, CB_LINK_UIAT_KESCRAP_DROP_SENTENCE, THREE_INTEGER);
        cb_utilities.setup_cb_link_method($UIAT_KESCRAP_SELECT_SENTENCE, CB_LINK_UIAT_KESCRAP_SELECT_SENTENCE, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_HANDLE_KNOWLEDGE_SCRAPBOOK_GUTS);
        html_macros.note_html_handler_function(CB_UIAT_KESCRAP_CONTINUE);
        html_macros.note_html_handler_function(CB_UIAT_KESCRAP_LOAD);
        html_macros.note_html_handler_function(CB_UIAT_KESCRAP_SAVE);
        html_macros.note_html_handler_function(CB_UIAT_KESCRAP_SELECT_ASSERTION);
        html_macros.note_html_handler_function(CB_UIAT_KESCRAP_DROP_ASSERTION);
        html_macros.note_html_handler_function(CB_UIAT_KESCRAP_SELECT_SENTENCE);
        html_macros.note_html_handler_function(CB_UIAT_KESCRAP_DROP_SENTENCE);
        html_macros.note_html_handler_function(CB_UIAT_KESCRAP_SELECT_TERM);
        html_macros.note_html_handler_function(CB_UIAT_KESCRAP_DROP_TERM);
        cb_uia_tool_declaration.declare_cb_uia_tool($ONTOLOGY_BROWSER, $list_alt403);
        cb_uia_tool_declaration.declare_cb_uia_tool($CONCEPT_RECOGNIZER, $list_alt409);
        cb_uia_tool_declaration.declare_cb_uia_tool($ASSERTED_SENTENCES, $list_alt422);
        cb_utilities.setup_cb_link_method($UIA_ASSERTED_SENTENCES_GUTS, CB_LINK_UIA_ASSERTED_SENTENCES_GUTS, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIA_ASSERTED_SENTENCES_GUTS);
        cb_uia_tool_declaration.declare_cb_uia_tool($CONCEPT_COMPARATOR, $list_alt439);
        cb_utilities.setup_cb_link_method($UIAT_CONCEPT_COMPARATOR_DONE, CB_LINK_UIAT_CONCEPT_COMPARATOR_DONE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_CONCEPT_COMPARATOR_DONE);
        uia_tool_declaration.declare_uia_tool($CONCEPT_RELATOR, $list_alt471);
        cb_uia_tool_declaration.declare_cb_uia_tool($CONCEPT_RELATOR, $list_alt472);
        html_macros.note_html_handler_function(CB_UIAT_CONCEPT_RELATOR_GUTS);
        cb_utilities.setup_cb_link_method($UIA_CONCEPT_RELATOR_GUTS, CB_LINK_UIA_CONCEPT_RELATOR_GUTS, TWO_INTEGER);
        cb_uia_tool_declaration.declare_cb_uia_tool($RELATIONSHIP_SUGGESTOR, $list_alt483);
        cb_uia_tool_declaration.declare_cb_uia_tool($PREDICATE_SUGGESTOR, $list_alt489);
        cb_uia_tool_declaration.declare_cb_uia_tool($LEXICON_SEARCH, $list_alt496);
        cb_utilities.setup_cb_link_method($UIAT_LEXICON_SEARCH_GOTO_PAGE, CB_LINK_UIAT_LEXICON_SEARCH_GOTO_PAGE, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_UIAT_LEXICON_SEARCH_GOTO_PAGE);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $CONCEPT_CLARIFIER = makeKeyword("CONCEPT-CLARIFIER");

    static private final SubLList $list_alt1 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-CONCEPT-CLARIFIER-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycConceptClarifierTool")));

    static private final SubLList $list_alt2 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("SIGNATURE"), makeSymbol("PLIST"));



    static private final SubLList $list_alt4 = list(makeSymbol("&KEY"), makeSymbol("TERM"), makeSymbol("CLARIFYING-SENTENCES"), makeSymbol("IS-SME-TERM"), makeSymbol("SELECT"), makeSymbol("ALT-PHRASES"), makeSymbol("HIGHLIGHT"), makeSymbol("EXAMPLES"));

    static private final SubLList $list_alt5 = list($TERM, makeKeyword("CLARIFYING-SENTENCES"), makeKeyword("IS-SME-TERM"), makeKeyword("SELECT"), makeKeyword("ALT-PHRASES"), makeKeyword("HIGHLIGHT"), makeKeyword("EXAMPLES"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $CLARIFYING_SENTENCES = makeKeyword("CLARIFYING-SENTENCES");

    private static final SubLSymbol $IS_SME_TERM = makeKeyword("IS-SME-TERM");



    private static final SubLSymbol $ALT_PHRASES = makeKeyword("ALT-PHRASES");

    private static final SubLSymbol $HIGHLIGHT = makeKeyword("HIGHLIGHT");



    static private final SubLString $str_alt14$cb_concept_clarifier_handler = makeString("cb-concept-clarifier-handler");

    static private final SubLString $$$term = makeString("term");

    static private final SubLString $$$interaction = makeString("interaction");

    static private final SubLString $str_alt17$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    private static final SubLSymbol $UIA_NEXT_INTERACTION = makeKeyword("UIA-NEXT-INTERACTION");

    static private final SubLString $str_alt19$_Continue_ = makeString("[Continue]");

    static private final SubLString $str_alt20$___ = makeString(" : ");

    static private final SubLString $str_alt21$Alternative_phrases_ = makeString("Alternative phrases:");

    static private final SubLString $str_alt22$_s_ = makeString("~s ");

    static private final SubLString $str_alt23$Usage_Example_s__ = makeString("Usage Example(s):");

    private static final SubLSymbol $UIA_CONCEPT_FINDER_THROW = makeKeyword("UIA-CONCEPT-FINDER-THROW");

    private static final SubLSymbol $UIA_ASSERTED_SENTENCES_GUTS = makeKeyword("UIA-ASSERTED-SENTENCES-GUTS");

    static private final SubLString $str_alt26$_Show_all_assertions_ = makeString("[Show all assertions]");

    private static final SubLSymbol $UIA_CONCEPT_RELATOR_GUTS = makeKeyword("UIA-CONCEPT-RELATOR-GUTS");

    static private final SubLString $str_alt28$_Related_terms_ = makeString("[Related terms]");

    private static final SubLSymbol $UIA_SALIENT_DESCRIPTOR_REQUIRED = makeKeyword("UIA-SALIENT-DESCRIPTOR-REQUIRED");

    static private final SubLString $str_alt30$_Interview_ = makeString("[Interview]");

    private static final SubLSymbol $UIA_LEXIFICATION_WIZARD_GUTS = makeKeyword("UIA-LEXIFICATION-WIZARD-GUTS");

    static private final SubLString $str_alt32$_Lexify_ = makeString("[Lexify]");

    private static final SubLSymbol $UIA_ONTOLOGY_BROWSER_START = makeKeyword("UIA-ONTOLOGY-BROWSER-START");

    static private final SubLString $str_alt34$_Browse_Ontology_ = makeString("[Browse Ontology]");

    private static final SubLSymbol $UIA_ADD_TERM_TO_SCRAP_BOOK = makeKeyword("UIA-ADD-TERM-TO-SCRAP-BOOK");

    static private final SubLString $str_alt36$_Add_to_Scrapbook_ = makeString("[Add to Scrapbook]");

    static private final SubLString $str_alt37$_OE_ = makeString("[OE]");

    static private final SubLString $str_alt38$__for_Cyclists_only_ = makeString(" (for Cyclists only)");

    private static final SubLSymbol $UIAT_COMMON_QUERIES_FOCUS_TERM = makeKeyword("UIAT-COMMON-QUERIES-FOCUS-TERM");

    static private final SubLString $str_alt40$_Relevant_Queries_for_This_Term_ = makeString("[Relevant Queries for This Term]");

    private static final SubLSymbol $UIA_BLUE_CONCEPT_RECOGNIZER_EVENT = makeKeyword("UIA-BLUE-CONCEPT-RECOGNIZER-EVENT");

    static private final SubLString $str_alt42$_Visualize_ = makeString("[Visualize]");

    static private final SubLList $list_alt43 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")));

    private static final SubLSymbol $HIGH_LIGHTED = makeKeyword("HIGH-LIGHTED");

    private static final SubLSymbol $UIAEXT_NUSKETCH_UNHIGHLIGHT = makeKeyword("UIAEXT-NUSKETCH-UNHIGHLIGHT");

    static private final SubLString $str_alt46$_Un_Highlight__A_in_nuSketch_ = makeString("[Un-Highlight ~A in nuSketch]");

    private static final SubLSymbol $NOT_HIGH_LIGHTED = makeKeyword("NOT-HIGH-LIGHTED");

    private static final SubLSymbol $UIAEXT_NUSKETCH_HIGHLIGHT = makeKeyword("UIAEXT-NUSKETCH-HIGHLIGHT");

    static private final SubLString $str_alt49$_Highlight__A_in_nuSketch_ = makeString("[Highlight ~A in nuSketch]");



    private static final SubLSymbol $UIA_CONCEPT_KILLER = makeKeyword("UIA-CONCEPT-KILLER");

    static private final SubLString $str_alt52$_Forget_This_Term_ = makeString("[Forget This Term]");

    static private final SubLString $$$Compare = makeString("Compare");

    static private final SubLString $$$compare = makeString("compare");

    static private final SubLString $str_alt55$Compare_and_contrast_ = makeString("Compare and contrast ");

    static private final SubLString $str_alt56$_with_ = makeString(" with ");

    static private final SubLString $str_alt57$compare_with = makeString("compare-with");

    static private final SubLString $$$State_Analogy = makeString("State Analogy");

    static private final SubLString $$$analogy1 = makeString("analogy1");

    static private final SubLList $list_alt60 = list(makeKeyword("CAPITALIZE?"), T);

    static private final SubLString $str_alt61$_is_like_ = makeString(" is like ");

    static private final SubLString $str_alt62$analogy_source = makeString("analogy-source");

    static private final SubLString $$$analogy2 = makeString("analogy2");

    static private final SubLString $str_alt64$analogy_target = makeString("analogy-target");

    private static final SubLSymbol $RELATIONSHIP_SUGGESTOR = makeKeyword("RELATIONSHIP-SUGGESTOR");

    static private final SubLString $$$Suggest_a_Relation = makeString("Suggest a Relation");

    static private final SubLString $$$relate1 = makeString("relate1");

    static private final SubLString $str_alt68$How_could_I_relate_ = makeString("How could I relate ");

    static private final SubLString $str_alt69$relate_term1 = makeString("relate-term1");

    static private final SubLString $str_alt70$_and_ = makeString(" and ");

    static private final SubLString $str_alt71$_ = makeString("?");

    static private final SubLString $$$relate2 = makeString("relate2");

    static private final SubLString $str_alt73$relate_term2 = makeString("relate-term2");







    static private final SubLString $str_alt77$Meaning__ = makeString("Meaning: ");

    static private final SubLList $list_alt78 = list($LINK, $NONE);

    static private final SubLString $str_alt79$Precisely__ = makeString("Precisely: ");

    static private final SubLString $str_alt80$CycL__ = makeString("CycL: ");

    private static final SubLSymbol $CONCEPT_COMPARATOR = makeKeyword("CONCEPT-COMPARATOR");

    private static final SubLSymbol $LAUNCH = makeKeyword("LAUNCH");

    private static final SubLSymbol $PHRASE1 = makeKeyword("PHRASE1");

    private static final SubLSymbol $PHRASE2 = makeKeyword("PHRASE2");



    private static final SubLSymbol $ANALOGY_DEVELOPER = makeKeyword("ANALOGY-DEVELOPER");

    private static final SubLSymbol $TARGET_PHRASE = makeKeyword("TARGET-PHRASE");

    private static final SubLSymbol $SOURCE_PHRASE = makeKeyword("SOURCE-PHRASE");

    private static final SubLSymbol $TARGET_TERM = makeKeyword("TARGET-TERM");

    private static final SubLSymbol $SOURCE_TERM = makeKeyword("SOURCE-TERM");



    private static final SubLSymbol CB_CONCEPT_CLARIFIER_HANDLER = makeSymbol("CB-CONCEPT-CLARIFIER-HANDLER");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt94$cb_uia_concept_clarifier = makeString("cb-uia-concept-clarifier");

    static private final SubLString $str_alt95$_ = makeString(" ");

    public static final SubLInteger $int$300 = makeInteger(300);

    static private final SubLString $str_alt97$nd___ = makeString("nd();");

    private static final SubLSymbol $UIA_CONCEPT_CLARIFIER = makeKeyword("UIA-CONCEPT-CLARIFIER");

    private static final SubLSymbol CB_LINK_UIA_CONCEPT_CLARIFIER = makeSymbol("CB-LINK-UIA-CONCEPT-CLARIFIER");

    static private final SubLList $list_alt100 = list(makeSymbol("TERM"));

    private static final SubLSymbol CB_UIA_CONCEPT_CLARIFIER = makeSymbol("CB-UIA-CONCEPT-CLARIFIER");

    static private final SubLList $list_alt102 = list(makeSymbol("FORT-ID"));

    private static final SubLSymbol CB_UIA_CONCEPT_CLARIFIER_FORT_ID = makeSymbol("CB-UIA-CONCEPT-CLARIFIER-FORT-ID");



    static private final SubLString $str_alt105$cb_uia_add_term_to_scrap_book = makeString("cb-uia-add-term-to-scrap-book");

    private static final SubLSymbol CB_LINK_UIA_ADD_TERM_TO_SCRAP_BOOK = makeSymbol("CB-LINK-UIA-ADD-TERM-TO-SCRAP-BOOK");

    private static final SubLSymbol $KNOWLEDGE_SCRAPBOOK = makeKeyword("KNOWLEDGE-SCRAPBOOK");



    private static final SubLSymbol $ENTITY = makeKeyword("ENTITY");



    private static final SubLSymbol CB_UIA_ADD_TERM_TO_SCRAP_BOOK = makeSymbol("CB-UIA-ADD-TERM-TO-SCRAP-BOOK");

    private static final SubLSymbol $SENTENCE_CLARIFIER = makeKeyword("SENTENCE-CLARIFIER");

    static private final SubLList $list_alt113 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-SENTENCE-CLARIFIER-RENDER-REQUEST"));

    private static final SubLSymbol $SHOW_GAF = makeKeyword("SHOW-GAF");

    static private final SubLList $list_alt115 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"), makeSymbol("UNASSERTIBLE"), makeSymbol("KNOWN"), makeSymbol("JUSTIFICATION"), makeSymbol("SELECT"), makeSymbol("TERM-PHRASE-MAPPINGS"));

    static private final SubLList $list_alt116 = list(makeKeyword("SENTENCE"), makeKeyword("UNASSERTIBLE"), makeKeyword("KNOWN"), makeKeyword("JUSTIFICATION"), makeKeyword("SELECT"), makeKeyword("TERM-PHRASE-MAPPINGS"));



    private static final SubLSymbol $UNASSERTIBLE = makeKeyword("UNASSERTIBLE");





    private static final SubLSymbol $TERM_PHRASE_MAPPINGS = makeKeyword("TERM-PHRASE-MAPPINGS");

    private static final SubLSymbol $SHOW_RULE = makeKeyword("SHOW-RULE");

    static private final SubLList $list_alt123 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"), makeSymbol("UNASSERTIBLE"), makeSymbol("TERM-PHRASE-MAPPINGS"), makeSymbol("ASSERTION"));

    static private final SubLList $list_alt124 = list(makeKeyword("SENTENCE"), makeKeyword("UNASSERTIBLE"), makeKeyword("TERM-PHRASE-MAPPINGS"), makeKeyword("ASSERTION"));



    private static final SubLSymbol $SHOW_QUESTION = makeKeyword("SHOW-QUESTION");

    static private final SubLList $list_alt127 = list(makeSymbol("&KEY"), makeSymbol("QUERY-SENTENCE"), makeSymbol("NO-VARS"), makeSymbol("TERM-PHRASE-MAPPINGS"));

    static private final SubLList $list_alt128 = list(makeKeyword("QUERY-SENTENCE"), makeKeyword("NO-VARS"), makeKeyword("TERM-PHRASE-MAPPINGS"));



    private static final SubLSymbol $NO_VARS = makeKeyword("NO-VARS");

    static private final SubLString $str_alt131$cb_uiat_sentence_clarifier_handle = makeString("cb-uiat-sentence-clarifier-handler");

    static private final SubLString $$$id = makeString("id");

    static private final SubLString $str_alt133$cycl_sentence = makeString("cycl-sentence");

    static private final SubLString $str_alt134$You_told_me_the_following_fact_ = makeString("You told me the following fact:");

    static private final SubLString $str_alt135$I_know_the_following_fact_ = makeString("I know the following fact:");

    static private final SubLString $str_alt136$The_following_is_a_sentence_which = makeString("The following is a sentence which may or may not be true or well-formed:");

    static private final SubLString $str_alt137$More_precisely__ = makeString("More precisely :");

    private static final SubLSymbol $UIA_SENTENCE_FINDER_THROW = makeKeyword("UIA-SENTENCE-FINDER-THROW");

    private static final SubLSymbol $UIA_SIMILAR_ASSERTION = makeKeyword("UIA-SIMILAR-ASSERTION");

    static private final SubLString $str_alt140$_Create_Similar_Fact_ = makeString("[Create Similar Fact]");

    private static final SubLSymbol $UIA_SIMILAR_QUESTION = makeKeyword("UIA-SIMILAR-QUESTION");

    static private final SubLString $str_alt142$_Ask_Similar_Question_ = makeString("[Ask Similar Question]");

    private static final SubLSymbol $UIA_SIMILAR_SENTENCE = makeKeyword("UIA-SIMILAR-SENTENCE");

    static private final SubLString $str_alt144$_See__without_asserting__Similar_ = makeString("[See (without asserting) Similar Sentence]");

    private static final SubLSymbol $UIA_ADD_ASSERTION_TO_SCRAP_BOOK = makeKeyword("UIA-ADD-ASSERTION-TO-SCRAP-BOOK");

    static private final SubLString $str_alt146$_Examine_This_Predicate_ = makeString("[Examine This Predicate]");

    static private final SubLString $str_alt147$_Lexify_This_Predicate_ = makeString("[Lexify This Predicate]");

    private static final SubLSymbol $UIA_SENTENCE_VARIATIONS = makeKeyword("UIA-SENTENCE-VARIATIONS");

    static private final SubLString $str_alt149$_Variations_ = makeString("[Variations]");

    private static final SubLSymbol $UIA_ASSERTION_PRECISION_EDITOR = makeKeyword("UIA-ASSERTION-PRECISION-EDITOR");

    static private final SubLString $str_alt151$_Strengthen_Weaken_This_Fact_ = makeString("[Strengthen/Weaken This Fact]");

    private static final SubLSymbol $UIA_SHOW_CYCL = makeKeyword("UIA-SHOW-CYCL");

    static private final SubLString $str_alt153$__for_Cycorp_employees_only_ = makeString(" (for Cycorp employees only)");

    static private final SubLString $$$New_Fact = makeString("New Fact");

    static private final SubLString $$$assert = makeString("assert");

    static private final SubLString $str_alt156$I_want_to_tell_you_the_above_fact = makeString("I want to tell you the above fact.");

    static private final SubLString $$$Relate_this = makeString("Relate this");

    static private final SubLString $$$relate = makeString("relate");

    static private final SubLString $str_alt159$I_want_to_relate_this_fact_to_ano = makeString("I want to relate this fact to another fact.");

    static private final SubLString $$$Forget_This = makeString("Forget This");

    static private final SubLString $$$unassert = makeString("unassert");

    static private final SubLString $str_alt162$I_want_you_to_forget_the_above_se = makeString("I want you to forget the above sentence.");

    static private final SubLString $str_alt163$You_told_me_the_following_rule_ = makeString("You told me the following rule:");

    static private final SubLString $str_alt164$The_following_is_either_a_rule_th = makeString("The following is either a rule that I have been told or a rule which may or may not be true or well-formed:");

    static private final SubLString $str_alt165$rule_clauses = makeString("rule_clauses");

    static private final SubLString $str_alt166$text_css = makeString("text/css");

    static private final SubLString $$$screen = makeString("screen");

    static private final SubLString $$$none = makeString("none");

    static private final SubLString $$$Rule_Clauses = makeString("Rule Clauses");





    static private final SubLString $str_alt172$_Tweak_Similar_Rule_ = makeString("[Tweak Similar Rule]");

    private static final SubLSymbol $UIA_RULE_CONSTRUCTOR_FROM_CYCL = makeKeyword("UIA-RULE-CONSTRUCTOR-FROM-CYCL");

    static private final SubLString $str_alt174$_Construct_Similar_Rule_ = makeString("[Construct Similar Rule]");

    static private final SubLString $str_alt175$_See__without_asserting__Similar_ = makeString("[See (without asserting) Similar Rule]");

    static private final SubLString $str_alt176$_Ask_if_part_as_Question_ = makeString("[Ask if-part as Question]");

    static private final SubLString $str_alt177$_Ask_else_part_as_Question_ = makeString("[Ask else-part as Question]");

    static private final SubLString $str_alt178$I_want_you_to_forget_the_above_ru = makeString("I want you to forget the above rule.");

    static private final SubLString $str_alt179$The_following_is_a_question_that_ = makeString("The following is a question that could be asked:");





    static private final SubLList $list_alt182 = list(constant_handles.reader_make_constant_shell(makeString("NLPredicate")));



    private static final SubLSymbol $SENTENCE_LINK = makeKeyword("SENTENCE-LINK");



    static private final SubLString $str_alt186$Note__ = makeString("Note: ");

    static private final SubLString $str_alt187$_Examine_Predicate_ = makeString("[Examine Predicate]");

    private static final SubLSymbol $UIA_SENTENCE_CLARIFIER = makeKeyword("UIA-SENTENCE-CLARIFIER");

    static private final SubLString $str_alt189$_Examine_Entire_Sentence_ = makeString("[Examine Entire Sentence]");

    private static final SubLSymbol $REPORT_GENERIC_PROBLEM = makeKeyword("REPORT-GENERIC-PROBLEM");

    static private final SubLString $str_alt191$_Report_Bad_Generation_ = makeString("[Report Bad Generation]");

    private static final SubLSymbol $ASSERTION_CREATOR = makeKeyword("ASSERTION-CREATOR");





    private static final SubLSymbol $ASSERTION_KILLER = makeKeyword("ASSERTION-KILLER");

    private static final SubLSymbol $SENTENCE_RELATOR = makeKeyword("SENTENCE-RELATOR");

    private static final SubLSymbol $SENT_A = makeKeyword("SENT-A");

    static private final SubLString $$$similar = makeString("similar");

    static private final SubLString $$$input = makeString("input");

    private static final SubLSymbol $SIMILAR_ASSERTION = makeKeyword("SIMILAR-ASSERTION");



    private static final SubLSymbol $NEW_TERM_PHRASE = makeKeyword("NEW-TERM-PHRASE");

    private static final SubLSymbol CB_UIAT_SENTENCE_CLARIFIER_HANDLER = makeSymbol("CB-UIAT-SENTENCE-CLARIFIER-HANDLER");

    static private final SubLString $str_alt204$cb_uiat_sentence_clarifier_link_h = makeString("cb-uiat-sentence-clarifier-link-handler");

    public static final SubLInteger $int$400 = makeInteger(400);

    private static final SubLSymbol CB_LINK_UIA_SENTENCE_CLARIFIER = makeSymbol("CB-LINK-UIA-SENTENCE-CLARIFIER");

    static private final SubLString $str_alt207$___ = makeString("(*)");

    static private final SubLString $str_alt208$cb_uia_next_interaction = makeString("cb-uia-next-interaction");

    static private final SubLList $list_alt209 = list(makeSymbol("CYCL-SENTENCE"), makeSymbol("FORCE"));

    private static final SubLSymbol CB_UIAT_SENTENCE_CLARIFIER_LINK_HANDLER = makeSymbol("CB-UIAT-SENTENCE-CLARIFIER-LINK-HANDLER");

    static private final SubLString $str_alt211$cb_uiat_add_assertion_to_scrap_bo = makeString("cb-uiat-add-assertion-to-scrap-book-handler");

    private static final SubLSymbol CB_LINK_UIA_ADD_ASSERTION_TO_SCRAP_BOOK = makeSymbol("CB-LINK-UIA-ADD-ASSERTION-TO-SCRAP-BOOK");

    static private final SubLList $list_alt213 = list(makeSymbol("CYCL-SENTENCE"));

    private static final SubLSymbol CB_UIAT_ADD_ASSERTION_TO_SCRAP_BOOK_HANDLER = makeSymbol("CB-UIAT-ADD-ASSERTION-TO-SCRAP-BOOK-HANDLER");

    static private final SubLString $str_alt215$cb_uiat_assertion_precision_edito = makeString("cb-uiat-assertion-precision-editor-handler");

    private static final SubLSymbol CB_LINK_UIA_ASSERTION_PRECISION_EDITOR = makeSymbol("CB-LINK-UIA-ASSERTION-PRECISION-EDITOR");

    private static final SubLSymbol $ASSERTION_PRECISION_EDITOR = makeKeyword("ASSERTION-PRECISION-EDITOR");

    private static final SubLSymbol CB_UIAT_ASSERTION_PRECISION_EDITOR_HANDLER = makeSymbol("CB-UIAT-ASSERTION-PRECISION-EDITOR-HANDLER");

    static private final SubLList $list_alt219 = list(makeSymbol("CYCL"));

    static private final SubLString $$$Show_CycL = makeString("Show CycL");

    static private final SubLString $str_alt221$_Refresh_ = makeString("[Refresh]");

    static private final SubLString $str_alt222$CycL__ = makeString("CycL :");

    private static final SubLSymbol CB_UIAT_SHOW_CYCL = makeSymbol("CB-UIAT-SHOW-CYCL");

    static private final SubLString $str_alt224$cb_uiat_show_cycl = makeString("cb-uiat-show-cycl");

    private static final SubLSymbol CB_LINK_UIA_SHOW_CYCL = makeSymbol("CB-LINK-UIA-SHOW-CYCL");

    static private final SubLString $str_alt226$Translation__ = makeString("Translation :");

    static private final SubLString $str_alt227$___ = makeString("[+]");

    static private final SubLString $str_alt228$More_Precisely__ = makeString("More Precisely :");

    private static final SubLSymbol $JUSTIFICATION_BROWSER = makeKeyword("JUSTIFICATION-BROWSER");

    static private final SubLList $list_alt230 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-JUSTIFICATION-BROWSER-RENDER-REQUEST"));

    static private final SubLList $list_alt231 = list(makeSymbol("&KEY"), makeSymbol("INFERENCE-ANSWER"));

    static private final SubLList $list_alt232 = list(makeKeyword("INFERENCE-ANSWER"));



    private static final SubLSymbol $UIAT_JUSTIFICATION_BROWSER_DONE = makeKeyword("UIAT-JUSTIFICATION-BROWSER-DONE");

    static private final SubLString $str_alt235$_Done_Browsing_ = makeString("[Done Browsing]");

    private static final SubLSymbol $UIA_JUSTIFICATION_BROWSER = makeKeyword("UIA-JUSTIFICATION-BROWSER");

    static private final SubLString $str_alt237$_Browse_in_Inference_Browser_ = makeString("[Browse in Inference Browser]");



    static private final SubLString $str_alt239$el_query = makeString("el_query");

    static private final SubLString $str_alt240$Query_Formulation_ = makeString("Query Formulation:");

    static private final SubLString $str_alt241$Answer_ = makeString("Answer:");

    static private final SubLString $str_alt242$Answer__Yes_ = makeString("Answer: Yes.");

    static private final SubLString $str_alt243$Proof_s__ = makeString("Proof(s):");



    static private final SubLList $list_alt245 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));











    static private final SubLString $str_alt251$cb_uiat_justification_browser_don = makeString("cb-uiat-justification-browser-done");

    private static final SubLSymbol CB_LINK_UIAT_JUSTIFICATION_BROWSER_DONE = makeSymbol("CB-LINK-UIAT-JUSTIFICATION-BROWSER-DONE");

    static private final SubLList $list_alt253 = list(makeSymbol("INTERACTION"));



    private static final SubLSymbol CB_UIAT_JUSTIFICATION_BROWSER_DONE = makeSymbol("CB-UIAT-JUSTIFICATION-BROWSER-DONE");

    static private final SubLString $str_alt256$_Browse_Justification_ = makeString("[Browse Justification]");

    static private final SubLString $str_alt257$cb_uiat_justification_browser_lin = makeString("cb-uiat-justification-browser-link-handler-external");

    private static final SubLSymbol $UIA_JUSTIFICATION_BROWSER_EXTERNAL = makeKeyword("UIA-JUSTIFICATION-BROWSER-EXTERNAL");

    private static final SubLSymbol CB_LINK_UIA_JUSTIFICATION_BROWSER_EXTERNAL = makeSymbol("CB-LINK-UIA-JUSTIFICATION-BROWSER-EXTERNAL");

    static private final SubLList $list_alt260 = list(makeSymbol("INFERENCE-ANSWER"));



    private static final SubLSymbol CB_UIAT_JUSTIFICATION_BROWSER_LINK_HANDLER_EXTERNAL = makeSymbol("CB-UIAT-JUSTIFICATION-BROWSER-LINK-HANDLER-EXTERNAL");

    static private final SubLString $str_alt263$cb_uiat_justification_browser_lin = makeString("cb-uiat-justification-browser-link-handler");

    private static final SubLSymbol CB_LINK_UIA_JUSTIFICATION_BROWSER = makeSymbol("CB-LINK-UIA-JUSTIFICATION-BROWSER");

    private static final SubLSymbol CB_UIAT_JUSTIFICATION_BROWSER_LINK_HANDLER = makeSymbol("CB-UIAT-JUSTIFICATION-BROWSER-LINK-HANDLER");

    private static final SubLSymbol $SENTENCE_VARIATIONS = makeKeyword("SENTENCE-VARIATIONS");

    static private final SubLList $list_alt267 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-SENTENCE-VARIATIONS-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycSentenceVariationsTool")));

    static private final SubLList $list_alt268 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"), makeSymbol("VARIATIONS"));

    static private final SubLList $list_alt269 = list(makeKeyword("SENTENCE"), makeKeyword("VARIATIONS"));

    private static final SubLSymbol $VARIATIONS = makeKeyword("VARIATIONS");

    static private final SubLString $str_alt271$Sentence__ = makeString("Sentence :");

    static private final SubLString $str_alt272$Variations__ = makeString("Variations :");

    static private final SubLList $list_alt273 = list(makeSymbol("SENTENCE"));

    private static final SubLSymbol CB_UIAT_HANDLE_SENTENCE_VARIATIONS = makeSymbol("CB-UIAT-HANDLE-SENTENCE-VARIATIONS");

    static private final SubLString $str_alt275$cb_uiat_handle_sentence_variation = makeString("cb-uiat-handle-sentence-variations");

    private static final SubLSymbol CB_LINK_UIA_SENTENCE_VARIATIONS = makeSymbol("CB-LINK-UIA-SENTENCE-VARIATIONS");

    private static final SubLSymbol $DOMAIN_EXAMPLES = makeKeyword("DOMAIN-EXAMPLES");

    static private final SubLList $list_alt278 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-DOMAIN-EXAMPLES-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycDomainExamplesTool")));

    static private final SubLList $list_alt279 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE-SECTIONS"), makeSymbol("SAMPLE-SENTENCE"), makeSymbol("FILTER-TERM"), makeSymbol("SORT-METHOD"), makeSymbol("SUBGRAPHS"));

    static private final SubLList $list_alt280 = list(makeKeyword("SENTENCE-SECTIONS"), makeKeyword("SAMPLE-SENTENCE"), makeKeyword("FILTER-TERM"), makeKeyword("SORT-METHOD"), makeKeyword("SUBGRAPHS"));

    private static final SubLSymbol $SENTENCE_SECTIONS = makeKeyword("SENTENCE-SECTIONS");





    private static final SubLSymbol $SORT_METHOD = makeKeyword("SORT-METHOD");

    private static final SubLSymbol $SUBGRAPHS = makeKeyword("SUBGRAPHS");

    static private final SubLString $str_alt286$cb_uiat_handle_domain_examples_sh = makeString("cb-uiat-handle-domain-examples-show");

    static private final SubLString $str_alt287$subgraph__A = makeString("subgraph-~A");

    static private final SubLString $str_alt288$section__A = makeString("section-~A");

    static private final SubLString $$$start = makeString("start");

    static private final SubLList $list_alt290 = list(makeSymbol("SECTION-KEY"), makeSymbol("SENTENCE-INFOS"));

    static private final SubLString $str_alt291$Section__ = makeString("Section :");

    static private final SubLString $$$end = makeString("end");

    static private final SubLList $list_alt293 = list(makeSymbol("SENTENCE"), makeSymbol("VARIATIONS?"), makeSymbol("&OPTIONAL"), makeSymbol("SPECS"));

    static private final SubLString $$$More_Specific_Examples = makeString("More Specific Examples");

    static private final SubLString $$$index = makeString("index");

    static private final SubLString $$$Section_Index = makeString("Section Index");

    static private final SubLList $list_alt297 = list(makeSymbol("SECTION-KEY"), makeSymbol("SENTENCES"));

    static private final SubLString $str_alt298$section_ = makeString("section-");

    static private final SubLString $str_alt299$__S_examples_ = makeString("(~S examples)");

    static private final SubLString $$$top = makeString("top");

    static private final SubLString $str_alt301$_Top_ = makeString("[Top]");

    static private final SubLString $str_alt302$_Start_ = makeString("[Start]");

    static private final SubLString $str_alt303$_End_ = makeString("[End]");

    static private final SubLString $str_alt304$_Index_ = makeString("[Index]");

    static private final SubLString $$$FFFFDF = makeString("FFFFDF");

    private static final SubLSymbol $UIA_DOMAIN_EXAMPLES = makeKeyword("UIA-DOMAIN-EXAMPLES");

    static private final SubLString $str_alt307$uia_domain_examples_html = makeString("uia-domain-examples.html");

    private static final SubLSymbol $UIA_COMPLETE_INTERACTION = makeKeyword("UIA-COMPLETE-INTERACTION");

    static private final SubLString $str_alt309$_Finished_with_Domain_Examples_ = makeString("[Finished with Domain Examples]");

    static private final SubLString $$$Sort_examples = makeString("Sort examples");

    static private final SubLString $str_alt311$sort_method = makeString("sort-method");

    static private final SubLList $list_alt312 = list(makeSymbol("METHOD"), makeSymbol("PROMPT"));

    static private final SubLString $str_alt313$sample_sentence = makeString("sample-sentence");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $$$virtual = makeString("virtual");

    static private final SubLString $$$filter = makeString("filter");

    static private final SubLString $$$Show_all_examples = makeString("Show all examples");

    static private final SubLString $$$Show_examples_applicable_to = makeString("Show examples applicable to");

    static private final SubLString $$$specify = makeString("specify");

    static private final SubLString $str_alt320$filter_phrase = makeString("filter-phrase");

    static private final SubLString $$$Reset_settings = makeString("Reset settings");

    static private final SubLString $$$Redisplay_with_these_settings = makeString("Redisplay with these settings");



    private static final SubLSymbol $FILTER_PHRASE = makeKeyword("FILTER-PHRASE");

    private static final SubLSymbol CB_UIAT_HANDLE_DOMAIN_EXAMPLES_SHOW = makeSymbol("CB-UIAT-HANDLE-DOMAIN-EXAMPLES-SHOW");

    private static final SubLSymbol CB_UIAT_DOMAIN_EXAMPLES_LAUNCH = makeSymbol("CB-UIAT-DOMAIN-EXAMPLES-LAUNCH");

    static private final SubLString $str_alt327$cb_uiat_domain_examples_launch = makeString("cb-uiat-domain-examples-launch");

    private static final SubLSymbol $UIA_DOMAIN_EXAMPLES_LAUNCH = makeKeyword("UIA-DOMAIN-EXAMPLES-LAUNCH");

    private static final SubLSymbol CB_LINK_UIA_DOMAIN_EXAMPLES_LAUNCH = makeSymbol("CB-LINK-UIA-DOMAIN-EXAMPLES-LAUNCH");

    static private final SubLList $list_alt330 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-KNOWLEDGE-SCRAPBOOK-RENDER-REQUEST"));

    static private final SubLList $list_alt331 = list(makeSymbol("&KEY"), makeSymbol("TERMS"), makeSymbol("ASSERTIONS"), makeSymbol("SENTENCES"), makeSymbol("CRUMB-TERMS"), makeSymbol("CRUMB-ASSERTIONS"), makeSymbol("SELECT-TERMS"), makeSymbol("SELECT-SENTENCES"));

    static private final SubLList $list_alt332 = list(makeKeyword("TERMS"), makeKeyword("ASSERTIONS"), makeKeyword("SENTENCES"), makeKeyword("CRUMB-TERMS"), makeKeyword("CRUMB-ASSERTIONS"), makeKeyword("SELECT-TERMS"), makeKeyword("SELECT-SENTENCES"));







    private static final SubLSymbol $CRUMB_TERMS = makeKeyword("CRUMB-TERMS");

    private static final SubLSymbol $CRUMB_ASSERTIONS = makeKeyword("CRUMB-ASSERTIONS");

    private static final SubLSymbol $SELECT_TERMS = makeKeyword("SELECT-TERMS");

    private static final SubLSymbol $SELECT_SENTENCES = makeKeyword("SELECT-SENTENCES");

    static private final SubLString $str_alt340$cb_uiat_handle_knowledge_scrapboo = makeString("cb-uiat-handle-knowledge-scrapbook-guts");

    static private final SubLString $str_alt341$ui_id = makeString("ui-id");

    static private final SubLString $str_alt342$100_ = makeString("100%");

    private static final SubLSymbol $UIAT_KESCRAP_CONTINUE = makeKeyword("UIAT-KESCRAP-CONTINUE");

    private static final SubLSymbol $UIAT_KESCRAP_LOAD = makeKeyword("UIAT-KESCRAP-LOAD");

    static private final SubLString $str_alt345$_Load_ = makeString("[Load]");

    private static final SubLSymbol $UIAT_KESCRAP_SAVE = makeKeyword("UIAT-KESCRAP-SAVE");

    static private final SubLString $str_alt347$_Save_ = makeString("[Save]");

    static private final SubLString $str_alt348$cb_uiat_kescrap_continue = makeString("cb-uiat-kescrap-continue");

    private static final SubLSymbol CB_LINK_UIAT_KESCRAP_CONTINUE = makeSymbol("CB-LINK-UIAT-KESCRAP-CONTINUE");

    static private final SubLString $str_alt350$cb_uiat_kescrap_load = makeString("cb-uiat-kescrap-load");

    private static final SubLSymbol CB_LINK_UIAT_KESCRAP_LOAD = makeSymbol("CB-LINK-UIAT-KESCRAP-LOAD");

    static private final SubLString $str_alt352$cb_uiat_kescrap_save = makeString("cb-uiat-kescrap-save");

    private static final SubLSymbol CB_LINK_UIAT_KESCRAP_SAVE = makeSymbol("CB-LINK-UIAT-KESCRAP-SAVE");

    static private final SubLString $$$Scrapbook_Terms = makeString("Scrapbook Terms");

    static private final SubLString $str_alt355$Add_terms_by_entering_them_below_ = makeString("Add terms by entering them below.");

    private static final SubLSymbol $UIAT_KESCRAP_DROP_TERM = makeKeyword("UIAT-KESCRAP-DROP-TERM");

    static private final SubLString $str_alt357$_Drop_ = makeString("[Drop]");

    static private final SubLString $$$Recently_Mentioned_Terms = makeString("Recently Mentioned Terms");

    static private final SubLString $$$Add_term = makeString("Add term");

    static private final SubLString $$$newterm = makeString("newterm");

    static private final SubLString $str_alt361$ = makeString("");

    static private final SubLString $str_alt362$cb_uiat_kescrap_drop_term = makeString("cb-uiat-kescrap-drop-term");

    private static final SubLSymbol CB_LINK_UIAT_KESCRAP_DROP_TERM = makeSymbol("CB-LINK-UIAT-KESCRAP-DROP-TERM");

    static private final SubLString $$$Scrapbook_Sentences = makeString("Scrapbook Sentences");

    static private final SubLString $str_alt365$Add_sentences_by_entering_them_be = makeString("Add sentences by entering them below.");

    private static final SubLSymbol $UIAT_KESCRAP_DROP_ASSERTION = makeKeyword("UIAT-KESCRAP-DROP-ASSERTION");

    private static final SubLSymbol $UIAT_KESCRAP_DROP_SENTENCE = makeKeyword("UIAT-KESCRAP-DROP-SENTENCE");

    static private final SubLString $$$Recently_mentioned_sentences = makeString("Recently mentioned sentences");

    static private final SubLString $$$Add_fact = makeString("Add fact");

    static private final SubLString $$$newsentence = makeString("newsentence");

    static private final SubLString $str_alt371$cb_uiat_knowledge_scrapbook_launc = makeString("cb-uiat-knowledge-scrapbook-launch");

    private static final SubLSymbol $UIA_KNOWLEDGE_SCRAPBOOK_LAUNCH = makeKeyword("UIA-KNOWLEDGE-SCRAPBOOK-LAUNCH");

    private static final SubLSymbol CB_LINK_UIA_KNOWLEDGE_SCRAPBOOK_LAUNCH = makeSymbol("CB-LINK-UIA-KNOWLEDGE-SCRAPBOOK-LAUNCH");

    private static final SubLSymbol CB_UIAT_KNOWLEDGE_SCRAPBOOK_LAUNCH = makeSymbol("CB-UIAT-KNOWLEDGE-SCRAPBOOK-LAUNCH");

    static private final SubLString $str_alt375$cb_uiat_kescrap_drop_assertion = makeString("cb-uiat-kescrap-drop-assertion");

    private static final SubLSymbol CB_LINK_UIAT_KESCRAP_DROP_ASSERTION = makeSymbol("CB-LINK-UIAT-KESCRAP-DROP-ASSERTION");

    static private final SubLString $str_alt377$cb_uiat_kescrap_select_assertion = makeString("cb-uiat-kescrap-select-assertion");

    private static final SubLSymbol $UIAT_KESCRAP_SELECT_ASSERTION = makeKeyword("UIAT-KESCRAP-SELECT-ASSERTION");

    private static final SubLSymbol CB_LINK_UIAT_KESCRAP_SELECT_ASSERTION = makeSymbol("CB-LINK-UIAT-KESCRAP-SELECT-ASSERTION");

    static private final SubLString $str_alt380$cb_uiat_kescrap_drop_sentence = makeString("cb-uiat-kescrap-drop-sentence");

    private static final SubLSymbol CB_LINK_UIAT_KESCRAP_DROP_SENTENCE = makeSymbol("CB-LINK-UIAT-KESCRAP-DROP-SENTENCE");

    static private final SubLString $str_alt382$cb_uiat_kescrap_select_sentence = makeString("cb-uiat-kescrap-select-sentence");

    private static final SubLSymbol $UIAT_KESCRAP_SELECT_SENTENCE = makeKeyword("UIAT-KESCRAP-SELECT-SENTENCE");

    private static final SubLSymbol CB_LINK_UIAT_KESCRAP_SELECT_SENTENCE = makeSymbol("CB-LINK-UIAT-KESCRAP-SELECT-SENTENCE");

    private static final SubLSymbol $ADD_NEW = makeKeyword("ADD-NEW");



    private static final SubLSymbol CB_UIAT_HANDLE_KNOWLEDGE_SCRAPBOOK_GUTS = makeSymbol("CB-UIAT-HANDLE-KNOWLEDGE-SCRAPBOOK-GUTS");

    private static final SubLSymbol CB_UIAT_KESCRAP_CONTINUE = makeSymbol("CB-UIAT-KESCRAP-CONTINUE");


    private static final SubLSymbol CB_UIAT_KESCRAP_LOAD = makeSymbol("CB-UIAT-KESCRAP-LOAD");



    private static final SubLSymbol CB_UIAT_KESCRAP_SAVE = makeSymbol("CB-UIAT-KESCRAP-SAVE");

    static private final SubLList $list_alt393 = list(makeSymbol("INTERACTION"), makeSymbol("INDEX"));



    private static final SubLSymbol CB_UIAT_KESCRAP_SELECT_ASSERTION = makeSymbol("CB-UIAT-KESCRAP-SELECT-ASSERTION");



    private static final SubLSymbol CB_UIAT_KESCRAP_DROP_ASSERTION = makeSymbol("CB-UIAT-KESCRAP-DROP-ASSERTION");

    private static final SubLSymbol CB_UIAT_KESCRAP_SELECT_SENTENCE = makeSymbol("CB-UIAT-KESCRAP-SELECT-SENTENCE");

    private static final SubLSymbol CB_UIAT_KESCRAP_DROP_SENTENCE = makeSymbol("CB-UIAT-KESCRAP-DROP-SENTENCE");

    private static final SubLSymbol CB_UIAT_KESCRAP_SELECT_TERM = makeSymbol("CB-UIAT-KESCRAP-SELECT-TERM");

    private static final SubLSymbol CB_UIAT_KESCRAP_DROP_TERM = makeSymbol("CB-UIAT-KESCRAP-DROP-TERM");

    private static final SubLSymbol $ONTOLOGY_BROWSER = makeKeyword("ONTOLOGY-BROWSER");

    static private final SubLList $list_alt403 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-ONTOLOGY-BROWSER-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycUIAOntologyBrowser")));

    static private final SubLList $list_alt404 = list(makeSymbol("&KEY"), makeSymbol("SELECT"));

    static private final SubLList $list_alt405 = list(makeKeyword("SELECT"));

    static private final SubLList $list_alt406 = list(makeSymbol("&KEY"), makeSymbol("TERM"), makeSymbol("SELECT"), makeSymbol("HIGHLIGHT"));

    static private final SubLList $list_alt407 = list($TERM, makeKeyword("SELECT"), makeKeyword("HIGHLIGHT"));

    private static final SubLSymbol $CONCEPT_RECOGNIZER = makeKeyword("CONCEPT-RECOGNIZER");

    static private final SubLList $list_alt409 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-CONCEPT-RECOGNIZER-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycConceptRecognizer")));

    static private final SubLList $list_alt410 = list(makeSymbol("&KEY"), makeSymbol("PHRASE"), makeSymbol("CANDIDATE-TERMS"), makeSymbol("TERM-INFO-TABLE"), makeSymbol("WITHIN-CONCEPT-CREATOR?"));

    static private final SubLList $list_alt411 = list(makeKeyword("PHRASE"), makeKeyword("CANDIDATE-TERMS"), makeKeyword("TERM-INFO-TABLE"), makeKeyword("WITHIN-CONCEPT-CREATOR?"));



    private static final SubLSymbol $TERM_INFO_TABLE = makeKeyword("TERM-INFO-TABLE");

    public static final SubLSymbol $kw414$WITHIN_CONCEPT_CREATOR_ = makeKeyword("WITHIN-CONCEPT-CREATOR?");

    static private final SubLString $str_alt415$The_following_meanings_for__S_alr = makeString("The following meanings for ~S already appear to exist:");

    static private final SubLString $str_alt416$The_phrase__S_could_mean_ = makeString("The phrase ~S could mean:");

    static private final SubLString $str_alt417$You_may_wish_to_use_one_of_these_ = makeString("You may wish to use one of these existing meanings, or ");

    private static final SubLSymbol $UIA_CONCEPT_CREATOR = makeKeyword("UIA-CONCEPT-CREATOR");

    static private final SubLString $str_alt419$_Add_a_new_meaning_for__S_ = makeString("[Add a new meaning for ~S]");

    static private final SubLString $str_alt420$_Visualize_meanings_ = makeString("[Visualize meanings]");

    private static final SubLSymbol $ASSERTED_SENTENCES = makeKeyword("ASSERTED-SENTENCES");

    static private final SubLList $list_alt422 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-ASSERTED-SENTENCES-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycAssertedSentencesTool")));

    static private final SubLList $list_alt423 = list(makeSymbol("&KEY"), makeSymbol("TERM"), makeSymbol("SENTENCES"));

    static private final SubLList $list_alt424 = list($TERM, makeKeyword("SENTENCES"));

    static private final SubLString $str_alt425$Apparently__I_haven_t_been_told_a = makeString("Apparently, I haven't been told anything about ");

    static private final SubLString $str_alt426$_that_is_relevant_to_ = makeString(" that is relevant to ");

    static private final SubLString $str_alt427$_ = makeString(".");

    private static final SubLSymbol $CYC_TO_USER = makeKeyword("CYC-TO-USER");

    static private final SubLString $str_alt429$From_ = makeString("From ");

    static private final SubLString $str_alt430$asserted_sentence = makeString("asserted-sentence");

    static private final SubLString $str_alt431$What_do_you_know_about_ = makeString("What do you know about ");

    private static final SubLSymbol $UIAT_SOLUTION_FINDER_CYCL = makeKeyword("UIAT-SOLUTION-FINDER-CYCL");

    static private final SubLString $str_alt433$_Ask_for_known_facts_in_Query_Too = makeString("[Ask for known facts in Query Tool]");

    static private final SubLString $str_alt434$cb_uia_asserted_sentences_guts = makeString("cb-uia-asserted-sentences-guts");

    private static final SubLSymbol CB_LINK_UIA_ASSERTED_SENTENCES_GUTS = makeSymbol("CB-LINK-UIA-ASSERTED-SENTENCES-GUTS");

    private static final SubLSymbol CB_UIA_ASSERTED_SENTENCES_GUTS = makeSymbol("CB-UIA-ASSERTED-SENTENCES-GUTS");

    public static final SubLObject $$keAssertedTermSentences = constant_handles.reader_make_constant_shell(makeString("keAssertedTermSentences"));

    static private final SubLList $list_alt438 = list(makeSymbol("?WHAT"));

    static private final SubLList $list_alt439 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-CONCEPT-COMPARATOR-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycComparatorContrastor")));

    static private final SubLList $list_alt440 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("TERM1"), makeSymbol("TERM2"), makeSymbol("PHRASE1"), makeSymbol("PHRASE2"), makeSymbol("EQUALS"), makeSymbol("COMMON-SENTENCES"), makeSymbol("TERM1-UNIQUE-SENTENCES"), makeSymbol("TERM2-UNIQUE-SENTENCES") });

    static private final SubLList $list_alt441 = list(makeKeyword("TERM1"), makeKeyword("TERM2"), makeKeyword("PHRASE1"), makeKeyword("PHRASE2"), makeKeyword("EQUALS"), makeKeyword("COMMON-SENTENCES"), makeKeyword("TERM1-UNIQUE-SENTENCES"), makeKeyword("TERM2-UNIQUE-SENTENCES"));



    private static final SubLSymbol $COMMON_SENTENCES = makeKeyword("COMMON-SENTENCES");

    private static final SubLSymbol $TERM1_UNIQUE_SENTENCES = makeKeyword("TERM1-UNIQUE-SENTENCES");

    private static final SubLSymbol $TERM2_UNIQUE_SENTENCES = makeKeyword("TERM2-UNIQUE-SENTENCES");

    static private final SubLString $str_alt446$_are_exactly_the_same_ = makeString(" are exactly the same.");

    private static final SubLSymbol $UIAT_CONCEPT_COMPARATOR_DONE = makeKeyword("UIAT-CONCEPT-COMPARATOR-DONE");

    static private final SubLString $str_alt448$_Done_ = makeString("[Done]");

    private static final SubLSymbol $UIA_ANALOGY_DEVELOPER_GUTS = makeKeyword("UIA-ANALOGY-DEVELOPER-GUTS");

    static private final SubLString $str_alt450$_Tell_me_more_about_how__a_is_lik = makeString("[Tell me more about how ~a is like ~a]");

    private static final SubLSymbol $UIA_BLUE_CONCEPT_COMPARATOR_EVENT = makeKeyword("UIA-BLUE-CONCEPT-COMPARATOR-EVENT");

    static private final SubLString $str_alt452$_Visualize_the_comparison_ = makeString("[Visualize the comparison]");

    static private final SubLString $str_alt453$cb_uiat_concept_comparator_done = makeString("cb-uiat-concept-comparator-done");

    private static final SubLSymbol CB_LINK_UIAT_CONCEPT_COMPARATOR_DONE = makeSymbol("CB-LINK-UIAT-CONCEPT-COMPARATOR-DONE");

    private static final SubLSymbol CB_UIAT_CONCEPT_COMPARATOR_DONE = makeSymbol("CB-UIAT-CONCEPT-COMPARATOR-DONE");

    static private final SubLList $list_alt456 = list(makeKeyword("CAPITALIZE?"), $TRUE);

    static private final SubLString $str_alt457$How_are__a_and__a_similar_ = makeString("How are ~a and ~a similar?");

    static private final SubLString $str_alt458$_Convert_to_Question_ = makeString("[Convert to Question]");

    static private final SubLList $list_alt459 = list(makeSymbol("COMMON-SENTENCE"), makeSymbol("PHRASE"));

    private static final SubLSymbol EXPRESSION_FIND = makeSymbol("EXPRESSION-FIND");

    static private final SubLList $list_alt461 = list(makeKeyword("CAPITALIZE?"), T, $LINK, $NONE);

    static private final SubLString $str_alt462$_too_ = makeString(" too.");

    static private final SubLList $list_alt463 = list(makeKeyword("CAPITALIZE?"), $TRUE, $LINK, $NONE);

    static private final SubLString $str_alt464$_have_nothing_in_common_that_I_kn = makeString(" have nothing in common that I know of.");

    static private final SubLString $str_alt465$Just_ = makeString("Just ");

    static private final SubLString $str_alt466$How_does__a_differ_from__a_ = makeString("How does ~a differ from ~a?");

    static private final SubLList $list_alt467 = list(makeSymbol("UNIQUE-SENTENCE"), makeSymbol("PHRASE"));

    public static final SubLObject $$keComparisonSentences = constant_handles.reader_make_constant_shell(makeString("keComparisonSentences"));

    public static final SubLObject $$keContrastingSentences = constant_handles.reader_make_constant_shell(makeString("keContrastingSentences"));

    private static final SubLSymbol $CONCEPT_RELATOR = makeKeyword("CONCEPT-RELATOR");

    static private final SubLList $list_alt471 = list($NAME, makeString("Concept Relator"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-CONCEPT-RELATOR-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-CONCEPT-RELATOR-CHILD-COMPLETED"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycConceptRelatorTool")));

    static private final SubLList $list_alt472 = list(makeKeyword("DISPLAY-METHOD"), makeSymbol("CB-UIAT-CONCEPT-RELATOR-DISPLAY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycConceptRelatorTool")));

    static private final SubLList $list_alt473 = list(makeSymbol("PHRASE"));

    static private final SubLString $str_alt474$Related_Terms____A = makeString("Related Terms : ~A");



    static private final SubLString $str_alt476$Concepts_related_to_ = makeString("Concepts related to ");

    static private final SubLString $str_alt477$_ = makeString(":");

    static private final SubLString $str_alt478$Sorry__I_don_t_know_of_anything_r = makeString("Sorry, I don't know of anything related to ");

    static private final SubLString $str_alt479$_with_respect_to_our_current_topi = makeString(" with respect to our current topic of ");

    private static final SubLSymbol CB_UIAT_CONCEPT_RELATOR_GUTS = makeSymbol("CB-UIAT-CONCEPT-RELATOR-GUTS");

    static private final SubLString $str_alt481$cb_uiat_concept_relator_guts = makeString("cb-uiat-concept-relator-guts");

    private static final SubLSymbol CB_LINK_UIA_CONCEPT_RELATOR_GUTS = makeSymbol("CB-LINK-UIA-CONCEPT-RELATOR-GUTS");

    static private final SubLList $list_alt483 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-RELATIONSHIP-SUGGESTOR-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycRelationshipSuggestor")));

    static private final SubLList $list_alt484 = list(makeSymbol("&KEY"), makeSymbol("TERMS"), makeSymbol("SENTENCES"));

    static private final SubLList $list_alt485 = list(makeKeyword("TERMS"), makeKeyword("SENTENCES"));

    static private final SubLString $$$Possible_relationships_between = makeString("Possible relationships between");

    static private final SubLString $str_alt487$No_suggestions_ = makeString("No suggestions.");

    private static final SubLSymbol $PREDICATE_SUGGESTOR = makeKeyword("PREDICATE-SUGGESTOR");

    static private final SubLList $list_alt489 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-PREDICATE-SUGGESTOR-RENDER-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycPredicateSuggestor")));

    static private final SubLList $list_alt490 = list(makeSymbol("&KEY"), makeSymbol("TERM"), makeSymbol("SENTENCE-SECTIONS"));

    static private final SubLList $list_alt491 = list($TERM, makeKeyword("SENTENCE-SECTIONS"));

    static private final SubLString $$$Search_Results = makeString("Search Results");

    static private final SubLString $str_alt493$Here_are_some_example_sentences_s = makeString("Here are some example sentences sorted by relevance to :");

    static private final SubLList $list_alt494 = list(makeSymbol("COLLECTION"), makeSymbol("SENTENCES"));

    private static final SubLSymbol $LEXICON_SEARCH = makeKeyword("LEXICON-SEARCH");

    static private final SubLList $list_alt496 = list(makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIAT-LEXICON-SEARCH-RENDER-REQUEST"));

    static private final SubLList $list_alt497 = list(makeSymbol("&KEY"), makeSymbol("PATTERN"), makeSymbol("SEARCH-TYPE"), makeSymbol("RESULT-PAGE-NUM"), makeSymbol("MATCHING-INDEX-ENTRIES"));

    static private final SubLList $list_alt498 = list(makeKeyword("PATTERN"), makeKeyword("SEARCH-TYPE"), makeKeyword("RESULT-PAGE-NUM"), makeKeyword("MATCHING-INDEX-ENTRIES"));





    private static final SubLSymbol $RESULT_PAGE_NUM = makeKeyword("RESULT-PAGE-NUM");

    private static final SubLSymbol $MATCHING_INDEX_ENTRIES = makeKeyword("MATCHING-INDEX-ENTRIES");

    private static final SubLSymbol $UIA_REJECT_INTERACTION = makeKeyword("UIA-REJECT-INTERACTION");

    static private final SubLString $str_alt504$Sorry__I_could_not_find_any_conce = makeString("Sorry. I could not find any concepts with ");

    static private final SubLString $str_alt505$_s = makeString("~s");

    static private final SubLString $str_alt506$_in_their_names_ = makeString(" in their names.");

    static private final SubLString $str_alt507$The_following_concepts_have_the_w = makeString("The following concepts have the words ");

    static private final SubLString $str_alt508$_occurring_ = makeString(" occurring ");

    static private final SubLString $$$no_results_found = makeString("no results found");

    static private final SubLString $str_alt510$95_ = makeString("95%");

    static private final SubLList $list_alt511 = list(makeSymbol("TERM"), makeSymbol("TERM-PHRASE"), makeSymbol("VIA-STRING"));

    static private final SubLString $str_alt512$70_ = makeString("70%");

    static private final SubLString $str_alt513$via__S = makeString("via ~S");

    private static final SubLSymbol $RESULT_PAGES = makeKeyword("RESULT-PAGES");

    static private final SubLString $str_alt515$__ = makeString("< ");

    private static final SubLSymbol $UIAT_LEXICON_SEARCH_GOTO_PAGE = makeKeyword("UIAT-LEXICON-SEARCH-GOTO-PAGE");

    static private final SubLString $str_alt517$_S_ = makeString("~S ");

    static private final SubLString $str_alt518$_more_ = makeString("[more]");

    static private final SubLString $str_alt519$__ = makeString(" >");

    private static final SubLSymbol $START_INDEX = makeKeyword("START-INDEX");

    static private final SubLString $str_alt521$Page__strong__S__strong__of_A__st = makeString("Page <strong>~S</strong> of~A <strong>~S</strong>.");

    static private final SubLString $str_alt522$_approximately = makeString(" approximately");



    static private final SubLSymbol $sym524$STRING_ = makeSymbol("STRING<");



    private static final SubLSymbol LESSER_LENGTH_P = makeSymbol("LESSER-LENGTH-P");



    static private final SubLString $str_alt528$cb_uiat_lexicon_search_goto_page = makeString("cb-uiat-lexicon-search-goto-page");

    private static final SubLSymbol CB_LINK_UIAT_LEXICON_SEARCH_GOTO_PAGE = makeSymbol("CB-LINK-UIAT-LEXICON-SEARCH-GOTO-PAGE");

    static private final SubLList $list_alt530 = list(makeSymbol("UI-ID"), makeSymbol("GOTO-PAGE-NUM"));

    private static final SubLSymbol $GOTO_PAGE = makeKeyword("GOTO-PAGE");

    private static final SubLSymbol $GOTO_PAGE_NUM = makeKeyword("GOTO-PAGE-NUM");

    private static final SubLSymbol CB_UIAT_LEXICON_SEARCH_GOTO_PAGE = makeSymbol("CB-UIAT-LEXICON-SEARCH-GOTO-PAGE");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cb_uia_tools_browsing_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_uia_tools_browsing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_uia_tools_browsing_file();
    }
}

