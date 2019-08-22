/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-UIA-COA-LAUNCHERS
 *  source file: /cyc/top/cycl/cb-uia-coa-launchers.lisp
 *  created:     2019/07/03 17:38:11
 */
public final class cb_uia_coa_launchers extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_coa_launchers() {
    }

    public static final SubLFile me = new cb_uia_coa_launchers();


    // // Definitions
    public static final SubLObject cb_uia_launch_coa_dimensions_salient_descriptor(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject coas = uia_coa_utilities.uia_relevant_coas_for_refinement(v_agenda);
                SubLObject dimensions = uia_coa_utilities.uia_get_coa_specification_dimensions(v_agenda);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Concept_Refinement_Interview);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                cb_uia_macros.cb_uiat_document_expiration();
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                    cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                }
                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                    html_script_utilities.cb_hoverover_page_init();
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
                                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt1$cb_uia_handle_launch_coa_salient_, T, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($$$Concept_Refinement_Interview);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_hidden_input($$$dimensions, dimensions, UNPROVIDED);
                                            if (NIL == coas) {
                                                cb_coa_launchers_no_known_coas($$$refine_along_COA_dimensions);
                                            } else {
                                                cb_display_coa_refinement_options(dimensions, coas, $str_alt4$COA_Dimension_Refinement_Intervie, $str_alt5$Dimension_s__to_use_in_COA_refine, $$$refine_along_COA_dimensions);
                                            }
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                }
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
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
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_launch_mett_tc_salient_descriptor(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject coas = uia_coa_utilities.uia_relevant_coas_for_refinement(v_agenda);
                SubLObject principles = uia_coa_utilities.uia_get_mett_tc_evaluation_types(v_agenda);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Concept_Refinement_Interview);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                cb_uia_macros.cb_uiat_document_expiration();
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                    cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                }
                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                    html_script_utilities.cb_hoverover_page_init();
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
                                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt1$cb_uia_handle_launch_coa_salient_, T, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($$$Concept_Refinement_Interview);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_hidden_input($$$dimensions, principles, UNPROVIDED);
                                            if (NIL == coas) {
                                                cb_coa_launchers_no_known_coas($str_alt13$refine_along_METT_TC_principles);
                                            } else {
                                                cb_display_coa_refinement_options(principles, coas, $str_alt14$METT_TC_COA_Refinement_Interview, $str_alt15$Principle_s__to_use_in_COA_refine, $str_alt13$refine_along_METT_TC_principles);
                                            }
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                }
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
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
            }
            return NIL;
        }
    }

    public static final SubLObject cb_display_coa_refinement_options(SubLObject dimensions, SubLObject coas, SubLObject title, SubLObject dimension_header, SubLObject coa_header_infinitive) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ(title);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
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
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ(dimension_header);
                            html_utilities.html_newline(UNPROVIDED);
                            cb_display_current_coa_dimensions(dimensions);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_indent(FIVE_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($TOP));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_display_current_coas(coas, coa_header_infinitive);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            html_utilities.html_newline(UNPROVIDED);
            html_utilities.html_submit_input($$$Interview, UNPROVIDED, UNPROVIDED);
            return coas;
        }
    }

    public static final SubLObject cb_display_current_coas(SubLObject coas, SubLObject action) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = NIL;
                SubLObject check_coa_boxP = list_utilities.lengthE(coas, ONE_INTEGER, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
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
                        html_utilities.html_princ($str_alt19$COA_s__to_);
                        html_utilities.html_princ(action);
                        html_utilities.html_princ($str_alt20$_);
                        html_utilities.html_newline(UNPROVIDED);
                        if (NIL == cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                            bgcolor = html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread);
                        }
                        {
                            SubLObject color_toggle = NIL;
                            SubLObject list_var = NIL;
                            SubLObject coa = NIL;
                            SubLObject ignore_me = NIL;
                            for (list_var = coas, coa = list_var.first(), ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , coa = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                if (NIL != cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                    if (NIL != color_toggle) {
                                        color_toggle = NIL;
                                    } else {
                                        color_toggle = T;
                                    }
                                    bgcolor = (NIL != color_toggle) ? ((SubLObject) (html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread))) : html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (NIL != bgcolor) {
                                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(bgcolor);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_checkbox_input(cb_coa_name(coa), coa, check_coa_boxP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_display_primitives.cb_uia_show_term(coa, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
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
            }
            return coas;
        }
    }

    public static final SubLObject cb_display_current_coa_dimensions(SubLObject dimensions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bgcolor = NIL;
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
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
                        if (NIL == cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                            bgcolor = html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread);
                        }
                        {
                            SubLObject color_toggle = NIL;
                            SubLObject list_var = NIL;
                            SubLObject v_term = NIL;
                            SubLObject ignore_me = NIL;
                            for (list_var = dimensions, v_term = list_var.first(), ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                if (NIL != cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                    if (NIL != color_toggle) {
                                        color_toggle = NIL;
                                    } else {
                                        color_toggle = T;
                                    }
                                    bgcolor = (NIL != color_toggle) ? ((SubLObject) (html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread))) : html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (NIL != bgcolor) {
                                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(bgcolor);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_checkbox_input(cb_coa_specification_dimension_name(v_term), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_display_primitives.cb_uia_show_term(v_term, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
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
                return dimensions;
            }
        }
    }

    public static final SubLObject cb_coa_specification_dimension_name(SubLObject dimension) {
        return cb_utilities.cb_string_for_fort(dimension);
    }

    public static final SubLObject cb_coa_specification_dimension_from_name(SubLObject dimension_name) {
        return cb_utilities.cb_guess_fort(dimension_name, UNPROVIDED);
    }

    public static final SubLObject cb_coa_name(SubLObject coa) {
        return cb_utilities.cb_string_for_fort(coa);
    }

    public static final SubLObject cb_coa_from_name(SubLObject coa_name) {
        return cb_utilities.cb_guess_fort(coa_name, UNPROVIDED);
    }

    public static final SubLObject cb_coa_launchers_no_known_coas(SubLObject action) {
        html_utilities.html_newline(UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_utilities.html_princ($str_alt21$There_are_no_known_COAs_to_);
        html_utilities.html_princ(action);
        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_utilities.html_newline(TWO_INTEGER);
        html_utilities.html_submit_input($$$Continue, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_uia_handle_launch_coa_salient_descriptor(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject dimensions = read_from_string(html_utilities.html_extract_input($$$dimensions, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject chosen_dimensions = NIL;
            SubLObject coas = NIL;
            {
                SubLObject cdolist_list_var = dimensions;
                SubLObject dimension = NIL;
                for (dimension = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dimension = cdolist_list_var.first()) {
                    {
                        SubLObject dimension_field_name = cb_coa_specification_dimension_name(dimension);
                        if (NIL != html_utilities.html_extract_input(dimension_field_name, args)) {
                            chosen_dimensions = cons(dimension, chosen_dimensions);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = uia_coa_utilities.uia_relevant_coas_for_refinement(v_agenda);
                SubLObject coa = NIL;
                for (coa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , coa = cdolist_list_var.first()) {
                    {
                        SubLObject coa_field_name = cb_coa_name(coa);
                        if (NIL != html_utilities.html_extract_input(coa_field_name, args)) {
                            coas = cons(coa, coas);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = coas;
                SubLObject coa = NIL;
                for (coa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , coa = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_12 = chosen_dimensions;
                        SubLObject dimension = NIL;
                        for (dimension = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , dimension = cdolist_list_var_12.first()) {
                            {
                                SubLObject dimension_for_coa = uia_coa_utilities.get_coa_assessment_nart(dimension, coa);
                                SubLObject phrase = uia_trampolines.uia_term_phrase(v_agenda, dimension_for_coa, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                uia_tools_salient_descriptor.uia_act_new_salient_descriptor(v_agenda, $REQUIRED, phrase, dimension_for_coa);
                            }
                        }
                    }
                }
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uia_launch_mett_tc_coa_evaluator(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject coas = uia_coa_utilities.uia_relevant_coas_for_refinement(v_agenda);
                if ((NIL != uima_interface_parameter_declaration.uia_forge_aheadP(v_agenda)) && (NIL != list_utilities.singletonP(coas))) {
                    cb_mett_tc_evaluate_single_coa(v_agenda, coas.first());
                }
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Rule_Constructor);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                cb_uia_macros.cb_uiat_document_expiration();
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                    cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                }
                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                    html_script_utilities.cb_hoverover_page_init();
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
                                            html_utilities.html_hidden_input($str_alt30$cb_uia_handle_launch_mett_tc_coa_, T, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($$$Rule_Constructor);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                            html_utilities.html_newline(UNPROVIDED);
                                            if (NIL == coas) {
                                                cb_coa_launchers_no_known_coas($$$evaluate);
                                            } else {
                                                cb_mett_tc_display_coa_evaluation_options(v_agenda, coas, $$$evaluate);
                                            }
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_submit_input($$$Evaluate, UNPROVIDED, UNPROVIDED);
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
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
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
            }
            return NIL;
        }
    }

    public static final SubLObject cb_mett_tc_display_coa_evaluation_options(SubLObject v_agenda, SubLObject coas, SubLObject action) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_newline(UNPROVIDED);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt34$__Please_select_the__A_you_wish_t, uia_trampolines.uia_term_phrase(v_agenda, $$CourseOfAction, UNPROVIDED, UNPROVIDED, UNPROVIDED), action);
            html_utilities.html_newline(TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            cb_display_current_coas(coas, action);
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_uia_handle_launch_mett_tc_coa_evaluator(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject coas = NIL;
            {
                SubLObject cdolist_list_var = uia_coa_utilities.uia_relevant_coas_for_refinement(v_agenda);
                SubLObject coa = NIL;
                for (coa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , coa = cdolist_list_var.first()) {
                    if (NIL != html_utilities.html_extract_input(cb_coa_name(coa), args)) {
                        coas = cons(coa, coas);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = coas;
                SubLObject coa = NIL;
                for (coa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , coa = cdolist_list_var.first()) {
                    uia_tools_misc.uia_act_new_coa_evaluator(v_agenda, $REQUIRED, coa);
                }
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_mett_tc_evaluate_single_coa(SubLObject v_agenda, SubLObject coa) {
        uia_tools_misc.uia_act_new_coa_evaluator(v_agenda, $REQUIRED, coa);
        return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
    }

    public static final SubLObject cb_uia_launch_mett_tc_knowledge_reviewer(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_tools_review_and_testing.uiat_act_new_knowledge_reviewer(v_agenda, $REQUIRED, $TOPIC_SORT);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject declare_cb_uia_coa_launchers_file() {
        declareFunction("cb_uia_launch_coa_dimensions_salient_descriptor", "CB-UIA-LAUNCH-COA-DIMENSIONS-SALIENT-DESCRIPTOR", 0, 1, false);
        declareFunction("cb_uia_launch_mett_tc_salient_descriptor", "CB-UIA-LAUNCH-METT-TC-SALIENT-DESCRIPTOR", 0, 1, false);
        declareFunction("cb_display_coa_refinement_options", "CB-DISPLAY-COA-REFINEMENT-OPTIONS", 5, 0, false);
        declareFunction("cb_display_current_coas", "CB-DISPLAY-CURRENT-COAS", 2, 0, false);
        declareFunction("cb_display_current_coa_dimensions", "CB-DISPLAY-CURRENT-COA-DIMENSIONS", 1, 0, false);
        declareFunction("cb_coa_specification_dimension_name", "CB-COA-SPECIFICATION-DIMENSION-NAME", 1, 0, false);
        declareFunction("cb_coa_specification_dimension_from_name", "CB-COA-SPECIFICATION-DIMENSION-FROM-NAME", 1, 0, false);
        declareFunction("cb_coa_name", "CB-COA-NAME", 1, 0, false);
        declareFunction("cb_coa_from_name", "CB-COA-FROM-NAME", 1, 0, false);
        declareFunction("cb_coa_launchers_no_known_coas", "CB-COA-LAUNCHERS-NO-KNOWN-COAS", 1, 0, false);
        declareFunction("cb_uia_handle_launch_coa_salient_descriptor", "CB-UIA-HANDLE-LAUNCH-COA-SALIENT-DESCRIPTOR", 1, 0, false);
        declareFunction("cb_uia_launch_mett_tc_coa_evaluator", "CB-UIA-LAUNCH-METT-TC-COA-EVALUATOR", 1, 0, false);
        declareFunction("cb_mett_tc_display_coa_evaluation_options", "CB-METT-TC-DISPLAY-COA-EVALUATION-OPTIONS", 3, 0, false);
        declareFunction("cb_uia_handle_launch_mett_tc_coa_evaluator", "CB-UIA-HANDLE-LAUNCH-METT-TC-COA-EVALUATOR", 1, 0, false);
        declareFunction("cb_mett_tc_evaluate_single_coa", "CB-METT-TC-EVALUATE-SINGLE-COA", 2, 0, false);
        declareFunction("cb_uia_launch_mett_tc_knowledge_reviewer", "CB-UIA-LAUNCH-METT-TC-KNOWLEDGE-REVIEWER", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_coa_launchers_file() {
        return NIL;
    }

    public static final SubLObject setup_cb_uia_coa_launchers_file() {
                html_macros.note_html_handler_function(CB_UIA_LAUNCH_COA_DIMENSIONS_SALIENT_DESCRIPTOR);
        cb_uia_launchers.declare_cb_uia_launcher_internal($COA_DIMENSIONS_SALIENT_DESCRIPTOR, $INTRODUCTION, $$$COA_Dimensions, $str_alt10$cb_uia_launch_coa_dimensions_sali, NIL, NIL, $str_alt11$Refine_COA_Along_Predefined_Dimen, $$METT_TC_COARefinementTool, NIL);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_METT_TC_SALIENT_DESCRIPTOR);
        cb_uia_launchers.declare_cb_uia_launcher_internal($METT_TC_SALIENT_DESCRIPTOR, $INTRODUCTION, $str_alt24$METT_TC_principles, $str_alt25$cb_uia_launch_mett_tc_salient_des, NIL, NIL, $str_alt26$Refine_METT_TC_Principles, $$METT_TC_COARefinementTool, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_COA_SALIENT_DESCRIPTOR);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_METT_TC_COA_EVALUATOR);
        cb_uia_launchers.declare_cb_uia_launcher_internal($METT_TC_COA_EVALUATOR, $REVIEW, $$$COA_Evaluation, $str_alt39$cb_uia_launch_mett_tc_coa_evaluat, NIL, NIL, $str_alt40$Evaluate_COA_along_METT_TC_Princi, $$METT_TC_COACritiquingTool, NIL);
        html_macros.note_html_handler_function(CB_UIA_HANDLE_LAUNCH_METT_TC_COA_EVALUATOR);
        html_macros.note_html_handler_function(CB_UIA_LAUNCH_METT_TC_KNOWLEDGE_REVIEWER);
        cb_uia_launchers.declare_cb_uia_launcher_internal($METT_TC_KNOWLEDGE_REVIEWER, $REVIEW, $str_alt46$Review_METT_TC_Knowledge, $str_alt47$cb_uia_launch_mett_tc_knowledge_r, NIL, NIL, $str_alt46$Review_METT_TC_Knowledge, $$METT_TC_KnowledgeReviewer, NIL);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $$$Concept_Refinement_Interview = makeString("Concept Refinement Interview");

    static private final SubLString $str_alt1$cb_uia_handle_launch_coa_salient_ = makeString("cb-uia-handle-launch-coa-salient-descriptor");

    static private final SubLString $$$dimensions = makeString("dimensions");

    static private final SubLString $$$refine_along_COA_dimensions = makeString("refine along COA dimensions");

    static private final SubLString $str_alt4$COA_Dimension_Refinement_Intervie = makeString("COA Dimension Refinement Interview");

    static private final SubLString $str_alt5$Dimension_s__to_use_in_COA_refine = makeString("Dimension(s) to use in COA refinement interview:");

    private static final SubLSymbol CB_UIA_LAUNCH_COA_DIMENSIONS_SALIENT_DESCRIPTOR = makeSymbol("CB-UIA-LAUNCH-COA-DIMENSIONS-SALIENT-DESCRIPTOR");

    private static final SubLSymbol $COA_DIMENSIONS_SALIENT_DESCRIPTOR = makeKeyword("COA-DIMENSIONS-SALIENT-DESCRIPTOR");

    private static final SubLSymbol $INTRODUCTION = makeKeyword("INTRODUCTION");

    static private final SubLString $$$COA_Dimensions = makeString("COA Dimensions");

    static private final SubLString $str_alt10$cb_uia_launch_coa_dimensions_sali = makeString("cb-uia-launch-coa-dimensions-salient-descriptor");

    static private final SubLString $str_alt11$Refine_COA_Along_Predefined_Dimen = makeString("Refine COA Along Predefined Dimensions");

    public static final SubLObject $$METT_TC_COARefinementTool = constant_handles.reader_make_constant_shell(makeString("METT-TC-COARefinementTool"));

    static private final SubLString $str_alt13$refine_along_METT_TC_principles = makeString("refine along METT-TC principles");

    static private final SubLString $str_alt14$METT_TC_COA_Refinement_Interview = makeString("METT-TC COA Refinement Interview");

    static private final SubLString $str_alt15$Principle_s__to_use_in_COA_refine = makeString("Principle(s) to use in COA refinement interview:");

    private static final SubLSymbol CB_UIA_LAUNCH_METT_TC_SALIENT_DESCRIPTOR = makeSymbol("CB-UIA-LAUNCH-METT-TC-SALIENT-DESCRIPTOR");



    static private final SubLString $$$Interview = makeString("Interview");

    static private final SubLString $str_alt19$COA_s__to_ = makeString("COA(s) to ");

    static private final SubLString $str_alt20$_ = makeString(":");

    static private final SubLString $str_alt21$There_are_no_known_COAs_to_ = makeString("There are no known COAs to ");

    static private final SubLString $$$Continue = makeString("Continue");

    private static final SubLSymbol $METT_TC_SALIENT_DESCRIPTOR = makeKeyword("METT-TC-SALIENT-DESCRIPTOR");

    static private final SubLString $str_alt24$METT_TC_principles = makeString("METT-TC principles");

    static private final SubLString $str_alt25$cb_uia_launch_mett_tc_salient_des = makeString("cb-uia-launch-mett-tc-salient-descriptor");

    static private final SubLString $str_alt26$Refine_METT_TC_Principles = makeString("Refine METT-TC Principles");



    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_COA_SALIENT_DESCRIPTOR = makeSymbol("CB-UIA-HANDLE-LAUNCH-COA-SALIENT-DESCRIPTOR");

    static private final SubLString $$$Rule_Constructor = makeString("Rule Constructor");

    static private final SubLString $str_alt30$cb_uia_handle_launch_mett_tc_coa_ = makeString("cb-uia-handle-launch-mett-tc-coa-evaluator");

    static private final SubLString $$$evaluate = makeString("evaluate");

    static private final SubLString $$$Evaluate = makeString("Evaluate");

    private static final SubLSymbol CB_UIA_LAUNCH_METT_TC_COA_EVALUATOR = makeSymbol("CB-UIA-LAUNCH-METT-TC-COA-EVALUATOR");

    static private final SubLString $str_alt34$__Please_select_the__A_you_wish_t = makeString("~%Please select the ~A you wish to ~A: ");

    public static final SubLObject $$CourseOfAction = constant_handles.reader_make_constant_shell(makeString("CourseOfAction"));

    private static final SubLSymbol $METT_TC_COA_EVALUATOR = makeKeyword("METT-TC-COA-EVALUATOR");

    private static final SubLSymbol $REVIEW = makeKeyword("REVIEW");

    static private final SubLString $$$COA_Evaluation = makeString("COA Evaluation");

    static private final SubLString $str_alt39$cb_uia_launch_mett_tc_coa_evaluat = makeString("cb-uia-launch-mett-tc-coa-evaluator");

    static private final SubLString $str_alt40$Evaluate_COA_along_METT_TC_Princi = makeString("Evaluate COA along METT-TC Principles");

    public static final SubLObject $$METT_TC_COACritiquingTool = constant_handles.reader_make_constant_shell(makeString("METT-TC-COACritiquingTool"));

    private static final SubLSymbol CB_UIA_HANDLE_LAUNCH_METT_TC_COA_EVALUATOR = makeSymbol("CB-UIA-HANDLE-LAUNCH-METT-TC-COA-EVALUATOR");

    private static final SubLSymbol $TOPIC_SORT = makeKeyword("TOPIC-SORT");

    private static final SubLSymbol CB_UIA_LAUNCH_METT_TC_KNOWLEDGE_REVIEWER = makeSymbol("CB-UIA-LAUNCH-METT-TC-KNOWLEDGE-REVIEWER");

    private static final SubLSymbol $METT_TC_KNOWLEDGE_REVIEWER = makeKeyword("METT-TC-KNOWLEDGE-REVIEWER");

    static private final SubLString $str_alt46$Review_METT_TC_Knowledge = makeString("Review METT-TC Knowledge");

    static private final SubLString $str_alt47$cb_uia_launch_mett_tc_knowledge_r = makeString("cb-uia-launch-mett-tc-knowledge-reviewer");

    public static final SubLObject $$METT_TC_KnowledgeReviewer = constant_handles.reader_make_constant_shell(makeString("METT-TC-KnowledgeReviewer"));

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_coa_launchers_file();
    }

    public void initializeVariables() {
        init_cb_uia_coa_launchers_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_coa_launchers_file();
    }
}

