/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
 *  module:      CB-PHRASE-STRUCTURE-PARSER
 *  source file: /cyc/top/cycl/cb-phrase-structure-parser.lisp
 *  created:     2019/07/03 17:38:25
 */
public final class cb_phrase_structure_parser extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_phrase_structure_parser() {
    }

    public static final SubLFile me = new cb_phrase_structure_parser();

    public static final String myName = "com.cyc.cycjava.cycl.cb_phrase_structure_parser";

    // // Definitions
    // deflexical
    private static final SubLSymbol $cb_psp_categories$ = makeSymbol("*CB-PSP-CATEGORIES*");

    // deflexical
    private static final SubLSymbol $cb_psp_paraphrase_resultsP$ = makeSymbol("*CB-PSP-PARAPHRASE-RESULTS?*");

    // deflexical
    private static final SubLSymbol $cb_psp_best_onlyP$ = makeSymbol("*CB-PSP-BEST-ONLY?*");

    // deflexical
    private static final SubLSymbol $cb_psp_clear_cachesP$ = makeSymbol("*CB-PSP-CLEAR-CACHES?*");

    public static final SubLObject cb_psp_categories() {
        return Mapping.mapcar(symbol_function(CDR), $cb_psp_categories$.getGlobalValue());
    }

    public static final SubLObject cb_psp_category_labels() {
        return Mapping.mapcar(symbol_function(CAR), $cb_psp_categories$.getGlobalValue());
    }

    public static final SubLObject cb_psp_label_for_cat(SubLObject category) {
        return rassoc(function_terms.nart_to_naut(category), $cb_psp_categories$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED).first();
    }

    public static final SubLObject cb_phrase_structure_parsing(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Phrase_Structure_Parsing_Tool;
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
                                    html_utilities.html_markup($str_alt9$yui_skin_sam);
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
                                                    html_utilities.html_hidden_input($str_alt10$cb_handle_phrase_structure_parsin, T, UNPROVIDED);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_submit_input($$$Parse, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_newline(TWO_INTEGER);
                                                    html_utilities.html_princ($str_alt12$Use_NL_Tags__);
                                                    html_utilities.html_checkbox_input($str_alt13$nl_tags_, $$$t, parsing_vars.$npp_use_nl_tagsP$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_princ($str_alt15$Reformulate_results__);
                                                    html_utilities.html_checkbox_input($str_alt16$reformulate_, $$$t, parsing_vars.$psp_reformulateP$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_princ($str_alt17$Paraphrase_results__);
                                                    html_utilities.html_checkbox_input($str_alt18$paraphrase_, $$$t, $cb_psp_paraphrase_resultsP$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_princ($str_alt19$Best_only__);
                                                    html_utilities.html_checkbox_input($str_alt20$best_only_, $$$t, $cb_psp_best_onlyP$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_princ($str_alt21$Clear_caches_first__);
                                                    html_utilities.html_checkbox_input($str_alt22$clear_caches_, $$$t, $cb_psp_clear_cachesP$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt23$Phrase_);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_script_utilities.html_clear_input_button($$$phrase, UNPROVIDED);
                                                    html_utilities.html_text_input($$$phrase, $str_alt25$, $int$80);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt27$Phrase_Category___);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                            html_utilities.create_dropdown_list($$$category, cb_psp_category_labels(), cb_psp_categories(), FIVE_INTEGER, ZERO_INTEGER);
                                                        } finally {
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_5, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_4, thread);
                                                        }
                                                    }
                                                    html_utilities.html_newline(UNPROVIDED);
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

    public static final SubLObject cb_handle_phrase_structure_parsing(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrase = html_utilities.html_extract_input($$$phrase, args);
                SubLObject category_string = html_utilities.html_extract_input($$$category, args);
                SubLObject category = (NIL != function_terms.nat_formula_p(read_from_string(category_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) ? ((SubLObject) (narts_high.find_nart(read_from_string(category_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) : read_from_string(category_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = parsing_vars.$psp_reformulateP$.currentBinding(thread);
                    try {
                        parsing_vars.$npp_use_nl_tagsP$.bind(list_utilities.sublisp_boolean(html_utilities.html_extract_input($str_alt13$nl_tags_, args)), thread);
                        parsing_vars.$psp_reformulateP$.bind(list_utilities.sublisp_boolean(html_utilities.html_extract_input($str_alt16$reformulate_, args)), thread);
                        {
                            SubLObject best_onlyP = list_utilities.sublisp_boolean(html_utilities.html_extract_input($str_alt20$best_only_, args));
                            SubLObject clear_cachesP = list_utilities.sublisp_boolean(html_utilities.html_extract_input($str_alt22$clear_caches_, args));
                            {
                                SubLObject _prev_bind_0_6 = parsing_vars.$psp_clear_caches_each_parseP$.currentBinding(thread);
                                SubLObject _prev_bind_1_7 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                                try {
                                    parsing_vars.$psp_clear_caches_each_parseP$.bind(clear_cachesP, thread);
                                    parsing_vars.$psp_return_mode$.bind(NIL != best_onlyP ? ((SubLObject) ($BEST_ONLY)) : $EVERYTHING, thread);
                                    {
                                        SubLObject parsing_function = PS_GET_CYCLS_FOR_PHRASE;
                                        SubLObject title_string = format(NIL, $str_alt35$Phrase_Structure_Parse_Results_fo, phrase);
                                        $cb_psp_paraphrase_resultsP$.setGlobalValue(list_utilities.sublisp_boolean(html_utilities.html_extract_input($str_alt18$paraphrase_, args)));
                                        $cb_psp_best_onlyP$.setGlobalValue(best_onlyP);
                                        $cb_psp_clear_cachesP$.setGlobalValue(clear_cachesP);
                                        {
                                            SubLObject title_var = title_string;
                                            {
                                                SubLObject _prev_bind_0_8 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_9 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                                                html_utilities.html_markup($str_alt9$yui_skin_sam);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_12 = html_macros.$within_html_form$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_macros.$within_html_form$.bind(T, thread);
                                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                            {
                                                                                SubLObject parses = funcall(parsing_function, phrase, category);
                                                                                if (NIL == parses) {
                                                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                    html_utilities.html_newline(TWO_INTEGER);
                                                                                    html_utilities.html_princ($str_alt36$Sorry__no_parses_for_);
                                                                                    cb_utilities.cb_form(phrase, UNPROVIDED, UNPROVIDED);
                                                                                    html_utilities.html_princ($str_alt37$_of_category_);
                                                                                    html_utilities.html_princ(cb_psp_label_for_cat(category));
                                                                                    html_utilities.html_princ($str_alt38$_were_found_);
                                                                                    html_utilities.html_newline(TWO_INTEGER);
                                                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                } else {
                                                                                    html_print_psp_parse_list(parses, category);
                                                                                }
                                                                            }
                                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                        } finally {
                                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                            html_macros.$within_html_form$.rebind(_prev_bind_1_12, thread);
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                    html_utilities.html_copyright_notice();
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0_8, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    parsing_vars.$psp_return_mode$.rebind(_prev_bind_1_7, thread);
                                    parsing_vars.$psp_clear_caches_each_parseP$.rebind(_prev_bind_0_6, thread);
                                }
                            }
                        }
                    } finally {
                        parsing_vars.$psp_reformulateP$.rebind(_prev_bind_1, thread);
                        parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject html_print_psp_parse_list(SubLObject parses, SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parse_count = length(parses);
                SubLObject one_parseP = eql(parse_count, ONE_INTEGER);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt40$The_following__A_with_category__S, new SubLObject[]{ NIL != one_parseP ? ((SubLObject) ($$$parse)) : format(NIL, $str_alt42$_D_parses, parse_count), cb_psp_label_for_cat(category), NIL != one_parseP ? ((SubLObject) ($$$was)) : $$$were });
            }
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
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject width = THREE_INTEGER;
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                if (NIL != width) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(width);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject color_toggle = T;
                        SubLObject color1 = html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread);
                        SubLObject color2 = html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread);
                        SubLObject paraphrases = pph_main.generate_disambiguation_phrases(parses, $NONE, $ANY, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), $HTML, UNPROVIDED);
                        SubLObject list_var = NIL;
                        SubLObject parse = NIL;
                        SubLObject count = NIL;
                        for (list_var = parses, parse = list_var.first(), count = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , parse = list_var.first() , count = add(ONE_INTEGER, count)) {
                            {
                                SubLObject bgcolor = (NIL != color_toggle) ? ((SubLObject) (color1)) : color2;
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                if (NIL != bgcolor) {
                                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(bgcolor);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
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
                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ(number_utilities.f_1X(count));
                                                html_utilities.html_princ($str_alt50$_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
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
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_utilities.cb_form(parse, ZERO_INTEGER, T);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                            color_toggle = makeBoolean(NIL == color_toggle);
                            if (NIL != $cb_psp_paraphrase_resultsP$.getGlobalValue()) {
                                {
                                    SubLObject bgcolor = (NIL != color_toggle) ? ((SubLObject) (color1)) : color2;
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    if (NIL != bgcolor) {
                                        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(bgcolor);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
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
                                                SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
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
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt52$_);
                                                    html_utilities.html_markup(second(nth(count, paraphrases)));
                                                    html_utilities.html_princ($str_alt52$_);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
                                color_toggle = makeBoolean(NIL == color_toggle);
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

    public static final SubLObject cb_link_phrase_structure_parsing(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Phrase_Structure_Parsing;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt55$cb_phrase_structure_parsing);
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

    public static final SubLObject declare_cb_phrase_structure_parser_file() {
        declareFunction("cb_psp_categories", "CB-PSP-CATEGORIES", 0, 0, false);
        declareFunction("cb_psp_category_labels", "CB-PSP-CATEGORY-LABELS", 0, 0, false);
        declareFunction("cb_psp_label_for_cat", "CB-PSP-LABEL-FOR-CAT", 1, 0, false);
        declareFunction("cb_phrase_structure_parsing", "CB-PHRASE-STRUCTURE-PARSING", 0, 1, false);
        declareFunction("cb_handle_phrase_structure_parsing", "CB-HANDLE-PHRASE-STRUCTURE-PARSING", 1, 0, false);
        declareFunction("html_print_psp_parse_list", "HTML-PRINT-PSP-PARSE-LIST", 2, 0, false);
        declareFunction("cb_link_phrase_structure_parsing", "CB-LINK-PHRASE-STRUCTURE-PARSING", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_cb_phrase_structure_parser_file() {
        deflexical("*CB-PSP-CATEGORIES*", $list_alt0);
        deflexical("*CB-PSP-PARAPHRASE-RESULTS?*", NIL != boundp($sym1$_CB_PSP_PARAPHRASE_RESULTS__) ? ((SubLObject) ($cb_psp_paraphrase_resultsP$.getGlobalValue())) : T);
        deflexical("*CB-PSP-BEST-ONLY?*", NIL != boundp($sym2$_CB_PSP_BEST_ONLY__) ? ((SubLObject) ($cb_psp_best_onlyP$.getGlobalValue())) : T);
        deflexical("*CB-PSP-CLEAR-CACHES?*", NIL != boundp($sym3$_CB_PSP_CLEAR_CACHES__) ? ((SubLObject) ($cb_psp_clear_cachesP$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_phrase_structure_parser_file() {
                subl_macro_promotions.declare_defglobal($sym1$_CB_PSP_PARAPHRASE_RESULTS__);
        subl_macro_promotions.declare_defglobal($sym2$_CB_PSP_BEST_ONLY__);
        subl_macro_promotions.declare_defglobal($sym3$_CB_PSP_CLEAR_CACHES__);
        html_macros.note_html_handler_function(CB_PHRASE_STRUCTURE_PARSING);
        html_macros.note_html_handler_function(CB_HANDLE_PHRASE_STRUCTURE_PARSING);
        cb_utilities.setup_cb_link_method($PHRASE_STRUCTURE_PARSING, CB_LINK_PHRASE_STRUCTURE_PARSING, ONE_INTEGER);
        cb_utilities.declare_cb_tool($PHRASE_STRUCTURE_PARSING, $$$Phrase_Structure_Parse, $$$PSP, $str_alt60$Parsing_via_phrase_structure_pars);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(cons(makeString("NP"), constant_handles.reader_make_constant_shell(makeString("NounPhrase"))), list(makeString("Nbar"), constant_handles.reader_make_constant_shell(makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell(makeString("Noun"))), cons(makeString("PP"), constant_handles.reader_make_constant_shell(makeString("PrepositionalPhrase"))), list(makeString("Vbar"), constant_handles.reader_make_constant_shell(makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell(makeString("Verb"))), cons(makeString("Noun"), constant_handles.reader_make_constant_shell(makeString("Noun"))), cons(makeString("Verb"), constant_handles.reader_make_constant_shell(makeString("Verb"))));

    static private final SubLSymbol $sym1$_CB_PSP_PARAPHRASE_RESULTS__ = makeSymbol("*CB-PSP-PARAPHRASE-RESULTS?*");

    static private final SubLSymbol $sym2$_CB_PSP_BEST_ONLY__ = makeSymbol("*CB-PSP-BEST-ONLY?*");

    static private final SubLSymbol $sym3$_CB_PSP_CLEAR_CACHES__ = makeSymbol("*CB-PSP-CLEAR-CACHES?*");





    static private final SubLString $$$Phrase_Structure_Parsing_Tool = makeString("Phrase Structure Parsing Tool");



    static private final SubLString $str_alt8$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt9$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt10$cb_handle_phrase_structure_parsin = makeString("cb-handle-phrase-structure-parsing");

    static private final SubLString $$$Parse = makeString("Parse");

    static private final SubLString $str_alt12$Use_NL_Tags__ = makeString("Use NL Tags? ");

    static private final SubLString $str_alt13$nl_tags_ = makeString("nl-tags?");

    static private final SubLString $$$t = makeString("t");

    static private final SubLString $str_alt15$Reformulate_results__ = makeString("Reformulate results? ");

    static private final SubLString $str_alt16$reformulate_ = makeString("reformulate?");

    static private final SubLString $str_alt17$Paraphrase_results__ = makeString("Paraphrase results? ");

    static private final SubLString $str_alt18$paraphrase_ = makeString("paraphrase?");

    static private final SubLString $str_alt19$Best_only__ = makeString("Best only? ");

    static private final SubLString $str_alt20$best_only_ = makeString("best only?");

    static private final SubLString $str_alt21$Clear_caches_first__ = makeString("Clear caches first? ");

    static private final SubLString $str_alt22$clear_caches_ = makeString("clear caches?");

    static private final SubLString $str_alt23$Phrase_ = makeString("Phrase:");

    static private final SubLString $$$phrase = makeString("phrase");

    static private final SubLString $str_alt25$ = makeString("");

    public static final SubLInteger $int$80 = makeInteger(80);

    static private final SubLString $str_alt27$Phrase_Category___ = makeString("Phrase Category : ");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLString $$$category = makeString("category");

    private static final SubLSymbol CB_PHRASE_STRUCTURE_PARSING = makeSymbol("CB-PHRASE-STRUCTURE-PARSING");





    private static final SubLSymbol PS_GET_CYCLS_FOR_PHRASE = makeSymbol("PS-GET-CYCLS-FOR-PHRASE");

    static private final SubLString $str_alt35$Phrase_Structure_Parse_Results_fo = makeString("Phrase Structure Parse Results for ~S");

    static private final SubLString $str_alt36$Sorry__no_parses_for_ = makeString("Sorry, no parses for ");

    static private final SubLString $str_alt37$_of_category_ = makeString(" of category ");

    static private final SubLString $str_alt38$_were_found_ = makeString(" were found.");

    private static final SubLSymbol CB_HANDLE_PHRASE_STRUCTURE_PARSING = makeSymbol("CB-HANDLE-PHRASE-STRUCTURE-PARSING");

    static private final SubLString $str_alt40$The_following__A_with_category__S = makeString("The following ~A with category ~S ~A found: ");

    static private final SubLString $$$parse = makeString("parse");

    static private final SubLString $str_alt42$_D_parses = makeString("~D parses");

    static private final SubLString $$$was = makeString("was");

    static private final SubLString $$$were = makeString("were");











    static private final SubLString $str_alt50$_ = makeString(".");



    static private final SubLString $str_alt52$_ = makeString("\"");

    static private final SubLString $$$Phrase_Structure_Parsing = makeString("Phrase Structure Parsing");



    static private final SubLString $str_alt55$cb_phrase_structure_parsing = makeString("cb-phrase-structure-parsing");

    private static final SubLSymbol $PHRASE_STRUCTURE_PARSING = makeKeyword("PHRASE-STRUCTURE-PARSING");

    private static final SubLSymbol CB_LINK_PHRASE_STRUCTURE_PARSING = makeSymbol("CB-LINK-PHRASE-STRUCTURE-PARSING");

    static private final SubLString $$$Phrase_Structure_Parse = makeString("Phrase Structure Parse");

    static private final SubLString $$$PSP = makeString("PSP");

    static private final SubLString $str_alt60$Parsing_via_phrase_structure_pars = makeString("Parsing via phrase structure parser");

    // // Initializers
    public void declareFunctions() {
        declare_cb_phrase_structure_parser_file();
    }

    public void initializeVariables() {
        init_cb_phrase_structure_parser_file();
    }

    public void runTopLevelForms() {
        setup_cb_phrase_structure_parser_file();
    }
}

