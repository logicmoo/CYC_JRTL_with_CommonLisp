/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-STORY-CONSTRUCTOR
 *  source file: /cyc/top/cycl/cb-story-constructor.lisp
 *  created:     2019/07/03 17:39:05
 */
public final class cb_story_constructor extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_story_constructor() {
    }

    public static final SubLFile me = new cb_story_constructor();


    // // Definitions
    // defvar
    private static final SubLSymbol $cb_story_last_terms$ = makeSymbol("*CB-STORY-LAST-TERMS*");

    // defvar
    private static final SubLSymbol $cb_story_reuse_previous_termsP$ = makeSymbol("*CB-STORY-REUSE-PREVIOUS-TERMS?*");

    public static final SubLObject cb_reference_sets() {
        return isa.all_fort_instances($$TypicalityReferenceSet, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_reference_set_labels() {
        return Mapping.mapcar(symbol_function(CONSTANT_NAME), cb_reference_sets());
    }

    public static final SubLObject cb_storytelling(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Cyc_Storytelling_Prototype;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        html_complete.html_autocomplete_css();
                        html_complete.html_autocomplete_scripts();
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt5$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
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
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt6$cb_handle_storytelling, T, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt7$Reference_Set__);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                            html_utilities.create_dropdown_list($str_alt10$reference_set, cb_reference_set_labels(), cb_reference_sets(), FIVE_INTEGER, ZERO_INTEGER);
                                                        } finally {
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_5, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_4, thread);
                                                        }
                                                    }
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    if (NIL != $cb_story_last_terms$.getDynamicValue(thread)) {
                                                        html_utilities.html_princ($str_alt11$Reuse_previous_terms_if_available);
                                                        html_utilities.html_checkbox_input($str_alt12$reuse_terms_, $$$t, $cb_story_reuse_previous_termsP$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                    }
                                                    html_utilities.html_submit_input($$$Continue, UNPROVIDED, UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_handle_storytelling(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject reference_set_string = html_utilities.html_extract_input($str_alt10$reference_set, args);
                SubLObject reuse_termsP = list_utilities.sublisp_boolean(html_utilities.html_extract_input($str_alt12$reuse_terms_, args));
                SubLObject reference_set = cb_utilities.cb_guess_fort(reference_set_string, UNPROVIDED);
                SubLObject term1 = NIL;
                SubLObject term2 = NIL;
                $cb_story_reuse_previous_termsP$.setDynamicValue(reuse_termsP, thread);
                if (NIL != reuse_termsP) {
                    {
                        SubLObject previous_terms = list_utilities.alist_lookup($cb_story_last_terms$.getDynamicValue(thread), reference_set, UNPROVIDED, UNPROVIDED);
                        if (NIL != previous_terms) {
                            {
                                SubLObject datum_evaluated_var = previous_terms;
                                term1 = datum_evaluated_var.first();
                                term2 = cadr(datum_evaluated_var);
                            }
                        }
                    }
                }
                if ((NIL != term1) && (NIL != term2)) {
                    cb_storytelling_display_results(reference_set, term1, term2);
                } else {
                    cb_storytelling_pick_terms(reference_set);
                }
                return NIL;
            }
        }
    }

    public static final SubLObject cb_storytelling_display_results(SubLObject reference_set, SubLObject term1, SubLObject term2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject reference_set_members = typicality_reference_set.typicality_reference_set_members(reference_set);
                SubLObject mt = typicality_reference_set.typicality_reference_set_mt(reference_set);
                if (NIL == term1) {
                    while (NIL == story_constructor.story_term_okP(term1, mt, UNPROVIDED)) {
                        term1 = list_utilities.random_element(reference_set_members);
                    } 
                }
                if (NIL == term2) {
                    while (NIL == story_constructor.story_term_okP(term2, mt, UNPROVIDED)) {
                        term2 = list_utilities.random_element(remove(term1, reference_set_members, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    } 
                }
            }
            $cb_story_last_terms$.setDynamicValue(list_utilities.alist_enter($cb_story_last_terms$.getDynamicValue(thread), reference_set, list(term1, term2), UNPROVIDED), thread);
            {
                SubLObject title_string = $$$Storytelling_Prototype;
                SubLObject title_var = title_string;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_6 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt5$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
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
                                                SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt18$cb_handle_storytelling_results_di, T, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_10 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2_11 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            html_utilities.html_submit_input($$$New_Story, $str_alt20$new_story, UNPROVIDED);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            story_constructor.html_show_story_pair(reference_set, term1, term2);
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2_11, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1_10, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_6, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_handle_storytelling_results_display(SubLObject args) {
        if (NIL != html_utilities.html_extract_input($str_alt20$new_story, args)) {
            cb_storytelling(NIL);
        }
        return NIL;
    }

    public static final SubLObject cb_storytelling_pick_terms(SubLObject reference_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Cyc_Storytelling_Prototype;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        html_complete.html_autocomplete_css();
                        html_complete.html_autocomplete_scripts();
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt5$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
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
                                                SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt22$cb_handle_storytelling_term_picke, T, UNPROVIDED);
                                                    html_utilities.html_hidden_input($str_alt10$reference_set, reference_set, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt23$Reference_Set___A, pph_main.generate_phrase(reference_set, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    {
                                                        SubLObject ok_terms = cons($$$Random, Sort.sort(story_constructor.ok_reference_set_terms_for_story(reference_set), symbol_function($sym25$STRING_), CB_STORYTELLING_TERM_LABEL));
                                                        html_utilities.html_princ($str_alt27$Term_1_);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_utilities.create_dropdown_list($$$term1, Mapping.mapcar(CB_STORYTELLING_TERM_LABEL, ok_terms), ok_terms, FIVE_INTEGER, ZERO_INTEGER);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_utilities.html_princ($str_alt29$Term_2_);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_utilities.create_dropdown_list($$$term2, Mapping.mapcar(CB_STORYTELLING_TERM_LABEL, ok_terms), ok_terms, FIVE_INTEGER, ZERO_INTEGER);
                                                    }
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    cb_utilities.cb_back_button(UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_submit_input($$$Show_Story, UNPROVIDED, UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_12, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return reference_set;
        }
    }

    public static final SubLObject cb_storytelling_term_label(SubLObject v_term) {
        {
            SubLObject max_length = $int$80;
            SubLObject term_string = story_constructor.story_term_paraphrase(v_term);
            SubLObject label = (NIL != list_utilities.lengthG(term_string, max_length, UNPROVIDED)) ? ((SubLObject) (cconcatenate(string_utilities.substring(term_string, ZERO_INTEGER, subtract(max_length, THREE_INTEGER)), $str_alt33$___))) : term_string;
            if (NIL != list_utilities.lengthG(label, max_length, UNPROVIDED)) {
                Errors.sublisp_break($str_alt34$_S_for__S, new SubLObject[]{ label, v_term });
            }
            return label;
        }
    }

    public static final SubLObject cb_handle_storytelling_term_picker(SubLObject args) {
        {
            SubLObject reference_set_string = html_utilities.html_extract_input($str_alt10$reference_set, args);
            SubLObject reference_set = cb_utilities.cb_guess_fort(reference_set_string, UNPROVIDED);
            SubLObject term1_string = html_utilities.html_extract_input($$$term1, args);
            SubLObject term1 = cb_utilities.cb_guess_fort(term1_string, UNPROVIDED);
            SubLObject term2_string = html_utilities.html_extract_input($$$term2, args);
            SubLObject term2 = cb_utilities.cb_guess_fort(term2_string, UNPROVIDED);
            cb_storytelling_display_results(reference_set, term1, term2);
        }
        return NIL;
    }

    public static final SubLObject cb_link_storytelling(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Storytelling_Prototype;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt37$cb_storytelling);
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
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject declare_cb_story_constructor_file() {
        declareFunction("cb_reference_sets", "CB-REFERENCE-SETS", 0, 0, false);
        declareFunction("cb_reference_set_labels", "CB-REFERENCE-SET-LABELS", 0, 0, false);
        declareFunction("cb_storytelling", "CB-STORYTELLING", 0, 1, false);
        declareFunction("cb_handle_storytelling", "CB-HANDLE-STORYTELLING", 1, 0, false);
        declareFunction("cb_storytelling_display_results", "CB-STORYTELLING-DISPLAY-RESULTS", 3, 0, false);
        declareFunction("cb_handle_storytelling_results_display", "CB-HANDLE-STORYTELLING-RESULTS-DISPLAY", 1, 0, false);
        declareFunction("cb_storytelling_pick_terms", "CB-STORYTELLING-PICK-TERMS", 1, 0, false);
        declareFunction("cb_storytelling_term_label", "CB-STORYTELLING-TERM-LABEL", 1, 0, false);
        declareFunction("cb_handle_storytelling_term_picker", "CB-HANDLE-STORYTELLING-TERM-PICKER", 1, 0, false);
        declareFunction("cb_link_storytelling", "CB-LINK-STORYTELLING", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_cb_story_constructor_file() {
        defvar("*CB-STORY-LAST-TERMS*", NIL);
        defvar("*CB-STORY-REUSE-PREVIOUS-TERMS?*", T);
        return NIL;
    }

    public static final SubLObject setup_cb_story_constructor_file() {
                html_macros.note_html_handler_function(CB_STORYTELLING);
        html_macros.note_html_handler_function(CB_HANDLE_STORYTELLING);
        html_macros.note_html_handler_function(CB_HANDLE_STORYTELLING_RESULTS_DISPLAY);
        html_macros.note_html_handler_function(CB_HANDLE_STORYTELLING_TERM_PICKER);
        cb_utilities.setup_cb_link_method($STORYTELLING, CB_LINK_STORYTELLING, ONE_INTEGER);
        cb_utilities.declare_cb_tool($STORYTELLING, $$$Storytelling_Prototype, $$$Story, $str_alt41$Demo_of_Storytelling_with_Referen);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$TypicalityReferenceSet = constant_handles.reader_make_constant_shell(makeString("TypicalityReferenceSet"));



    static private final SubLString $$$Cyc_Storytelling_Prototype = makeString("Cyc Storytelling Prototype");



    static private final SubLString $str_alt4$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt5$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt6$cb_handle_storytelling = makeString("cb-handle-storytelling");

    static private final SubLString $str_alt7$Reference_Set__ = makeString("Reference Set: ");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLString $str_alt10$reference_set = makeString("reference_set");

    static private final SubLString $str_alt11$Reuse_previous_terms_if_available = makeString("Reuse previous terms if available? ");

    static private final SubLString $str_alt12$reuse_terms_ = makeString("reuse terms?");

    static private final SubLString $$$t = makeString("t");

    static private final SubLString $$$Continue = makeString("Continue");

    private static final SubLSymbol CB_STORYTELLING = makeSymbol("CB-STORYTELLING");

    private static final SubLSymbol CB_HANDLE_STORYTELLING = makeSymbol("CB-HANDLE-STORYTELLING");

    static private final SubLString $$$Storytelling_Prototype = makeString("Storytelling Prototype");

    static private final SubLString $str_alt18$cb_handle_storytelling_results_di = makeString("cb-handle-storytelling-results-display");

    static private final SubLString $$$New_Story = makeString("New Story");

    static private final SubLString $str_alt20$new_story = makeString("new-story");

    private static final SubLSymbol CB_HANDLE_STORYTELLING_RESULTS_DISPLAY = makeSymbol("CB-HANDLE-STORYTELLING-RESULTS-DISPLAY");

    static private final SubLString $str_alt22$cb_handle_storytelling_term_picke = makeString("cb-handle-storytelling-term-picker");

    static private final SubLString $str_alt23$Reference_Set___A = makeString("Reference Set: ~A");

    static private final SubLString $$$Random = makeString("Random");

    static private final SubLSymbol $sym25$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol CB_STORYTELLING_TERM_LABEL = makeSymbol("CB-STORYTELLING-TERM-LABEL");

    static private final SubLString $str_alt27$Term_1_ = makeString("Term 1:");

    static private final SubLString $$$term1 = makeString("term1");

    static private final SubLString $str_alt29$Term_2_ = makeString("Term 2:");

    static private final SubLString $$$term2 = makeString("term2");

    static private final SubLString $$$Show_Story = makeString("Show Story");

    public static final SubLInteger $int$80 = makeInteger(80);

    static private final SubLString $str_alt33$___ = makeString("...");

    static private final SubLString $str_alt34$_S_for__S = makeString("~S for ~S");

    private static final SubLSymbol CB_HANDLE_STORYTELLING_TERM_PICKER = makeSymbol("CB-HANDLE-STORYTELLING-TERM-PICKER");



    static private final SubLString $str_alt37$cb_storytelling = makeString("cb-storytelling");

    private static final SubLSymbol $STORYTELLING = makeKeyword("STORYTELLING");

    private static final SubLSymbol CB_LINK_STORYTELLING = makeSymbol("CB-LINK-STORYTELLING");

    static private final SubLString $$$Story = makeString("Story");

    static private final SubLString $str_alt41$Demo_of_Storytelling_with_Referen = makeString("Demo of Storytelling with Reference Sets");

    // // Initializers
    public void declareFunctions() {
        declare_cb_story_constructor_file();
    }

    public void initializeVariables() {
        init_cb_story_constructor_file();
    }

    public void runTopLevelForms() {
        setup_cb_story_constructor_file();
    }
}

