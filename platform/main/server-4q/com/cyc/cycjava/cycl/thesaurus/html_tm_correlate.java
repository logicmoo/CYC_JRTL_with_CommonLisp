/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.ke_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      HTML-TM-CORRELATE
 *  source file: /cyc/top/cycl/thesaurus/html-tm-correlate.lisp
 *  created:     2019/07/03 17:38:32
 */
public final class html_tm_correlate extends SubLTranslatedFile implements V02 {
    // // Constructor
    private html_tm_correlate() {
    }

    public static final SubLFile me = new html_tm_correlate();


    // // Definitions
    public static final SubLObject tm_correlate_guts() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject existing_searches = tm_io.tm_correlation_searches_in_progress();
                if (NIL != existing_searches) {
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt0$New_or_Existing_Correlation_);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    html_utilities.html_br();
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
                            SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_radio_input($$$type, $$$new, makeBoolean(NIL == existing_searches));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($$$Start_a_New_Correlation);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                        html_utilities.html_princ($str_alt4$Enter_Term_as_Starting_Point__opt);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_text_input($str_alt5$start_term, $str_alt6$, $int$40);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        if (NIL != existing_searches) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_radio_input($$$type, $$$continue, existing_searches);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($$$Continue_Existing_Correlation);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
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
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            html_utilities.html_br();
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ($str_alt10$Choose_Thesaurus_to_Correlate_);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_br();
            {
                SubLObject cdolist_list_var = tm_internals.all_thesauri_sorted();
                SubLObject thesaurus = NIL;
                for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                    html_utilities.html_radio_input($$$thesaurus, tm_internals.thesaurus_name(thesaurus), equal(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CORRELATE_THESAURUS), thesaurus));
                    html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                    if (NIL != tm_io.tm_correlation_search(thesaurus)) {
                        html_utilities.html_princ($str_alt13$__search_in_progress_);
                    }
                    html_utilities.html_br();
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_correlate(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Correlate_Thesaurus);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$Correlate_Thesaurus);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$Correlate_Thesaurus);
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                    html_utilities.html_princ($str_alt16$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt17$tm_correlate);
                                    if (NIL != tm_internals.editing_allowedP()) {
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
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt18$tm_handle_correlate, T, UNPROVIDED);
                                                tm_correlate_guts();
                                                html_utilities.html_br();
                                                html_utilities.html_submit_input($$$Correlate, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_reset_input(UNPROVIDED);
                                                if (NIL != tm_io.tm_correlation_searches_in_progress()) {
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt20$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    html_utilities.html_princ($str_alt21$tm_clear_correlation_state);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt22$_Clear_Correlation_State_for_All_);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                }
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    } else {
                                        html_thesaurus.tm_report_editing_disabled();
                                    }
                                }
                                html_thesaurus.tm_footer();
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

    public static final SubLObject tm_clear_correlation_state(SubLObject args) {
        tm_io.tm_clear_all_correlation_searches();
        return tm_correlate(UNPROVIDED);
    }

    public static final SubLObject tm_handle_correlate(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = html_utilities.html_extract_input($str_alt5$start_term, args);
                SubLObject type = html_utilities.html_extract_input($$$type, args);
                SubLObject thesaurus_name = html_utilities.html_extract_input($$$thesaurus, args);
                SubLObject thesaurus = NIL;
                SubLObject sign = NIL;
                SubLObject v_search = NIL;
                SubLObject lexpred = NIL;
                if (NIL == type) {
                    return html_thesaurus.tm_error($str_alt25$You_must_choose_either_to_start_a, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL == thesaurus_name) {
                    return html_thesaurus.tm_error($str_alt26$You_must_choose_a_thesaurus_on_wh, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
                if (NIL == tm_internals.thesaurusP(thesaurus)) {
                    return html_thesaurus.tm_error($str_alt27$Implementation_error___A_is_not_a, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL == subl_promotions.memberP(thesaurus, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI), UNPROVIDED, UNPROVIDED)) {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, thesaurus, $CONS);
                }
                if (type.equalp($$$new)) {
                    if (v_term.equalp($str_alt6$)) {
                        v_search = tm_io.tm_new_correlation_search(thesaurus, UNPROVIDED);
                    } else {
                        try {
                            sign = tm_datastructures.unique_lexpred_sign_in_thesaurus(v_term, $$preferredTerm, thesaurus);
                        } catch (Throwable ccatch_env_var) {
                            lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
                        }
                        if (NIL != lexpred) {
                            return html_thesaurus.tm_error($str_alt32$Can_t_start_correlation____A__has, v_term, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != tm_datastructures.signp(sign)) {
                            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM, tm_datastructures.sign_concept(sign), UNPROVIDED);
                            v_search = tm_io.tm_new_correlation_search(thesaurus, tm_datastructures.sign_concept(sign));
                        } else {
                            return html_thesaurus.tm_error($str_alt34$Can_t_start_correlation____A__is_, v_term, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    if (NIL == v_search) {
                        return html_thesaurus.tm_error($str_alt35$Implementation_error__Start_corre, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CORRELATE_THESAURUS, thesaurus, UNPROVIDED);
                } else
                    if (type.equalp($$$continue)) {
                        v_search = tm_io.tm_correlation_search(thesaurus);
                        if (NIL == v_search) {
                            return tm_get_start_term_for_correlation(thesaurus);
                        }
                        tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CORRELATE_THESAURUS, thesaurus, UNPROVIDED);
                    } else {
                        return html_thesaurus.tm_error($str_alt36$Implementation_error___S_is_not_a, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }

                tm_do_correlation(v_search);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_get_start_term_for_correlation(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$No_Correlation_to_Continue);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$No_Correlation_to_Continue);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$No_Correlation_to_Continue);
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                    html_utilities.html_princ($str_alt16$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt39$tm_get_start_term_for_correlation);
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
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt18$tm_handle_correlate, T, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt40$There_is_no_correlation_in_progre, tm_internals.thesaurus_name(thesaurus));
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            tm_correlate_guts();
                                            html_utilities.html_br();
                                            html_utilities.html_submit_input($$$Correlate, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_reset_input(UNPROVIDED);
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
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

    public static final SubLObject tm_do_correlation(SubLObject v_search) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject options = tm_io.tm_continue_correlation_search(v_search, UNPROVIDED, UNPROVIDED);
                SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject failedP = NIL;
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt41$Correlate_Thesaurus_Search_Result);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($str_alt41$Correlate_Thesaurus_Search_Result);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($str_alt41$Correlate_Thesaurus_Search_Result);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt16$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt42$tm_do_correlation);
                                        if (reason == $EXHAUST) {
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($$$Correlation_Search_Finished);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_br();
                                        }
                                        html_utilities.html_princ($str_alt45$The_search_for_correlation_candid);
                                        {
                                            SubLObject pcase_var = reason;
                                            if (pcase_var.eql($NUMBER)) {
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt47$the_default_number___A__were_foun, tm_io.$tm_corr_number_cutoff$.getDynamicValue(thread));
                                            } else
                                                if (pcase_var.eql($TIME)) {
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt49$it_timed_out_at__A_seconds_, tm_io.$tm_corr_time_cutoff$.getDynamicValue(thread));
                                                } else
                                                    if (pcase_var.eql($EXHAUST)) {
                                                        html_utilities.html_princ($str_alt50$all_possibilities_from_the_curren);
                                                    } else {
                                                        failedP = T;
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt51$of_an_unknown_halt_reason__A, reason);
                                                    }


                                        }
                                        if (NIL == failedP) {
                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
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
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt52$tm_handle_do_correlation, T, UNPROVIDED);
                                                    if (NIL == options) {
                                                        html_utilities.html_princ($str_alt53$No_correlation_candidates_were_fo);
                                                        html_utilities.html_br();
                                                        html_utilities.html_princ($str_alt54$If_you_wish_to_continue_correlati);
                                                        html_utilities.html_br();
                                                        tm_correlate_guts();
                                                    } else {
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt55$For_each_of_the_following__A_term, length(options));
                                                        html_utilities.html_br();
                                                        {
                                                            SubLObject number = ZERO_INTEGER;
                                                            SubLObject cdolist_list_var = options;
                                                            SubLObject option = NIL;
                                                            for (option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , option = cdolist_list_var.first()) {
                                                                number = add(number, ONE_INTEGER);
                                                                html_utilities.html_br();
                                                                {
                                                                    SubLObject concept = option.first();
                                                                    SubLObject candidates = option.rest();
                                                                    SubLObject concept_tag = format(NIL, $str_alt56$concept__A, number);
                                                                    SubLObject candidate_tag = format(NIL, $str_alt57$candidate__A, number);
                                                                    if (NIL != candidates) {
                                                                        if (NIL == tm_internals.thesaurus_gensymP(concept)) {
                                                                            html_thesaurus.tm_link($CYC_CONCEPT, concept, UNPROVIDED, UNPROVIDED);
                                                                            html_utilities.html_indent(ONE_INTEGER);
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                        html_tm_browsing.tm_thesaurus_constant(concept, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        html_utilities.html_hidden_input(concept_tag, cb_utilities.cb_fort_identifier(concept), UNPROVIDED);
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
                                                                            SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_27 = html_macros.$html_indent_table_max$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                                                                                {
                                                                                    SubLObject cdolist_list_var_28 = candidates;
                                                                                    SubLObject candidate = NIL;
                                                                                    for (candidate = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , candidate = cdolist_list_var_28.first()) {
                                                                                        if (NIL == intersection(tm_internals.thesauri_of_concept(concept), tm_internals.thesauri_of_concept(candidate), UNPROVIDED, UNPROVIDED)) {
                                                                                            {
                                                                                                SubLObject indent = TWO_INTEGER;
                                                                                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                        html_utilities.html_indent_row_internal(indent);
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                        if (NIL != span) {
                                                                                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                            html_utilities.html_markup(span);
                                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        }
                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                                                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                        html_utilities.html_radio_input(candidate_tag, cb_utilities.cb_fort_identifier(candidate), UNPROVIDED);
                                                                                                                    } finally {
                                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
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
                                                                                                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                        tm_concept_info(candidate);
                                                                                                                    } finally {
                                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_indent_table_internal(ZERO_INTEGER);
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_indent_table_max$.rebind(_prev_bind_1_27, thread);
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_submit_input($$$Do_It, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_reset_input(UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
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
            }
            return NIL;
        }
    }

    public static final SubLObject tm_string_for_correlated_concept(SubLObject concept) {
        {
            SubLObject mts = tm_internals.thesauri_of_concept(concept);
            SubLObject string = tm_internals.tm_string_for_constant(concept, NIL, mts, T);
            if (string.equalp($str_alt6$)) {
                string = pph_main.generate_phrase(concept, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return string;
        }
    }

    public static final SubLObject log_correlate(SubLObject concept_thesauri, SubLObject concept_string, SubLObject choice_thesauri, SubLObject choice_string) {
        {
            SubLObject list_index = ONE_INTEGER;
            SubLObject concept_thesauri_names = $str_alt6$;
            SubLObject choice_thesauri_names = $str_alt6$;
            SubLObject log_string = NIL;
            SubLObject cdolist_list_var = list(concept_thesauri, choice_thesauri);
            SubLObject thes_list = NIL;
            for (thes_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thes_list = cdolist_list_var.first()) {
                {
                    SubLObject thes_names = list_utilities.remove_if_not(symbol_function($sym61$NON_EMPTY_STRING_), Mapping.mapcar(symbol_function(THESAURUS_NAME), thes_list), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject rest_names = thes_names.rest();
                    SubLObject last_name = last(thes_names, UNPROVIDED).first();
                    if (NIL != thes_names) {
                        {
                            SubLObject pcase_var = list_index;
                            if (pcase_var.eql(ONE_INTEGER)) {
                                concept_thesauri_names = thes_names.first();
                                {
                                    SubLObject cdolist_list_var_33 = rest_names;
                                    SubLObject name = NIL;
                                    for (name = cdolist_list_var_33.first(); NIL != cdolist_list_var_33; cdolist_list_var_33 = cdolist_list_var_33.rest() , name = cdolist_list_var_33.first()) {
                                        if ((NIL != string_utilities.non_empty_stringP(name)) && name.equalp(last_name)) {
                                            concept_thesauri_names = format(NIL, $str_alt63$_a_a_a, new SubLObject[]{ concept_thesauri_names, $str_alt64$_and_, name });
                                        } else {
                                            concept_thesauri_names = format(NIL, $str_alt65$_a___a, concept_thesauri_names, name);
                                        }
                                    }
                                }
                                concept_thesauri_names = format(NIL, $str_alt66$in__a_, concept_thesauri_names);
                            } else
                                if (pcase_var.eql(TWO_INTEGER)) {
                                    choice_thesauri_names = thes_names.first();
                                    {
                                        SubLObject cdolist_list_var_34 = rest_names;
                                        SubLObject name = NIL;
                                        for (name = cdolist_list_var_34.first(); NIL != cdolist_list_var_34; cdolist_list_var_34 = cdolist_list_var_34.rest() , name = cdolist_list_var_34.first()) {
                                            if ((NIL != string_utilities.non_empty_stringP(name)) && name.equalp(last_name)) {
                                                choice_thesauri_names = format(NIL, $str_alt63$_a_a_a, new SubLObject[]{ choice_thesauri_names, $str_alt64$_and_, name });
                                            } else {
                                                choice_thesauri_names = format(NIL, $str_alt65$_a___a, choice_thesauri_names, name);
                                            }
                                        }
                                    }
                                    choice_thesauri_names = format(NIL, $str_alt66$in__a_, choice_thesauri_names);
                                }

                        }
                    }
                }
                list_index = add(list_index, ONE_INTEGER);
            }
            if (NIL == string_utilities.non_empty_stringP(choice_thesauri_names)) {
                choice_thesauri_names = $$$in_the_Cyc_KB;
            }
            log_string = format(NIL, $str_alt68$Correlation_of___A___awith___A___, new SubLObject[]{ concept_string, concept_thesauri_names, choice_string, choice_thesauri_names });
            {
                SubLObject concept_ids = list_utilities.remove_if_not(symbol_function(TM_LOG_ID_P), Mapping.mapcar(symbol_function(TM_LOG_ID), concept_thesauri), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject choice_ids = list_utilities.remove_if_not(symbol_function(TM_LOG_ID_P), Mapping.mapcar(symbol_function(TM_LOG_ID), choice_thesauri), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                tm_logging.tm_enqueue_op_for_log(log_string, $OK, NIL, append(concept_ids, choice_ids, $list_alt72));
            }
        }
        return NIL;
    }

    public static final SubLObject tm_handle_do_correlation(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type = html_utilities.html_extract_input($$$type, args);
                if (NIL != type) {
                    return tm_handle_correlate(args);
                }
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CORRELATION_MESSAGES, NIL, UNPROVIDED);
                {
                    SubLObject num = NIL;
                    for (num = ZERO_INTEGER; num.numL(tm_io.$tm_corr_number_cutoff$.getDynamicValue(thread)); num = add(num, ONE_INTEGER)) {
                        {
                            SubLObject number = add(num, ONE_INTEGER);
                            SubLObject concept_tag = format(NIL, $str_alt56$concept__A, number);
                            SubLObject choice_tag = format(NIL, $str_alt57$candidate__A, number);
                            SubLObject concept_id = html_utilities.html_extract_input(concept_tag, args);
                            SubLObject choice_id = html_utilities.html_extract_input(choice_tag, args);
                            SubLObject concept = NIL;
                            SubLObject choice = NIL;
                            if (NIL != concept_id) {
                                concept = html_thesaurus.tm_guess_fort(concept_id);
                                if (NIL != choice_id) {
                                    choice_id = read_from_string_ignoring_errors(choice_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                choice = html_thesaurus.tm_guess_fort(choice_id);
                                {
                                    SubLObject concept_string = tm_internals.tm_string_for_constant(concept, NIL, NIL, T);
                                    SubLObject choice_string = tm_string_for_correlated_concept(choice);
                                    if ((NIL != forts.valid_fortP(choice)) && (NIL != forts.valid_fortP(concept))) {
                                        {
                                            SubLObject choice_thesauri = tm_internals.thesauri_of_concept(choice);
                                            SubLObject concept_thesauri = tm_internals.thesauri_of_concept(concept);
                                            SubLObject intersection = intersection(choice_thesauri, concept_thesauri, UNPROVIDED, UNPROVIDED);
                                            if (NIL != intersection) {
                                                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CORRELATION_MESSAGES, format(NIL, $str_alt74$__A__and___A__cannot_be_correlate, new SubLObject[]{ concept_string, choice_string, length(intersection).numG(ONE_INTEGER) ? ((SubLObject) ($$$i)) : $$$us, Mapping.mapcar(symbol_function(THESAURUS_NAME), intersection) }), $CONS);
                                            } else {
                                                {
                                                    SubLObject result = tm_io.tm_merge_concepts(concept, choice);
                                                    if (tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM) == concept) {
                                                        tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM, result, UNPROVIDED);
                                                    }
                                                    if (NIL != result) {
                                                        tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CORRELATION_MESSAGES, format(NIL, $str_alt77$Correlate___A__with___A__succeede, concept_string, choice_string), $CONS);
                                                        log_correlate(concept_thesauri, concept_string, choice_thesauri, choice_string);
                                                    } else {
                                                        tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CORRELATION_MESSAGES, format(NIL, $str_alt78$Correlate___A__with___A__failed_, concept_string, choice_string), $CONS);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CORRELATION_MESSAGES, format(NIL, $str_alt79$_A_not_correlated_, concept_string), $CONS);
                                    }
                                }
                            }
                        }
                    }
                }
                tm_show_correlation_messages(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_show_correlation_messages(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Correlation_Results);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$Correlation_Results);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$Correlation_Results);
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                    html_utilities.html_princ($str_alt16$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt82$tm_show_correlation_messages);
                                    {
                                        SubLObject messages = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CORRELATION_MESSAGES);
                                        SubLObject cdolist_list_var = nreverse(messages);
                                        SubLObject message = NIL;
                                        for (message = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , message = cdolist_list_var.first()) {
                                            html_utilities.html_princ(message);
                                            html_utilities.html_br();
                                        }
                                    }
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
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
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt18$tm_handle_correlate, T, UNPROVIDED);
                                            html_utilities.html_princ($str_alt83$If_you_wish_to_continue_correlati);
                                            html_utilities.html_br();
                                            tm_correlate_guts();
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            html_utilities.html_submit_input($$$Correlate, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_reset_input(UNPROVIDED);
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
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

    /**
     * Prints a section of information about a cyc concept, thesaurus term, or both
     */
    public static final SubLObject tm_concept_info(SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cyc_comment = NIL;
                SubLObject cyc_name = (NIL != constant_handles.constant_p(concept)) ? ((SubLObject) (constants_high.constant_name(concept))) : string_utilities.object_to_string(narts_high.nart_el_formula(concept));
                SubLObject thesauri = tm_internals.thesauri_of_concept(concept);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        cyc_comment = kb_accessors.comment(concept, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != thesauri) {
                    if (NIL == tm_internals.thesaurus_gensymP(concept)) {
                        html_thesaurus.tm_link($CYC_CONCEPT, concept, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_indent(ONE_INTEGER);
                    }
                    html_tm_browsing.tm_thesaurus_constant(concept, NIL, T, T, thesauri, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_br();
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
                        if (NIL == tm_internals.thesaurus_gensymP(concept)) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt87$Cyc_concept__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
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
                                        SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (cyc_name.isString()) {
                                                html_utilities.html_princ(cyc_name);
                                            } else {
                                                html_utilities.html_princ(pph_main.generate_text(concept, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != cyc_comment) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt88$Cyc_comment__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
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
                                        SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(cyc_comment);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
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
            }
            return NIL;
        }
    }

    public static final SubLObject tm_correlate_concept_page(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = args.first();
                SubLObject concept = NIL;
                concept = html_thesaurus.tm_guess_fort(id);
                if (NIL == concept) {
                    return html_thesaurus.tm_error($str_alt89$Implementation_error__No_concept_, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(format(NIL, $str_alt90$Correlate_Concept___A_, tm_internals.tm_string_for_constant(concept, NIL, tm_internals.thesauri_of_concept(concept), UNPROVIDED)));
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(format(NIL, $str_alt90$Correlate_Concept___A_, tm_internals.tm_string_for_constant(concept, NIL, tm_internals.thesauri_of_concept(concept), UNPROVIDED)));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(format(NIL, $str_alt90$Correlate_Concept___A_, tm_internals.tm_string_for_constant(concept, NIL, tm_internals.thesauri_of_concept(concept), UNPROVIDED)));
                                    html_complete.html_complete_script();
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt16$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.tm_help_link($str_alt91$tm_correlate_concept_page);
                                        if (NIL != tm_internals.editing_allowedP()) {
                                            {
                                                SubLObject matching_concepts = tm_io.tm_correlate_concept(concept, UNPROVIDED);
                                                tm_present_correlate_concept_choices(concept, matching_concepts);
                                            }
                                        } else {
                                            html_thesaurus.tm_report_editing_disabled();
                                        }
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
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
            }
            return NIL;
        }
    }

    /**
     * Presents a form with results of finding possible concepts to correlate, and lets user choose.
     */
    public static final SubLObject tm_present_correlate_concept_choices(SubLObject concept, SubLObject matching_concepts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject candidate_thesauri = set_difference(tm_internals.all_thesauri_sorted(), tm_internals.thesauri_of_concept(concept), UNPROVIDED, UNPROVIDED);
                if (NIL == tm_internals.thesaurus_gensymP(concept)) {
                    matching_concepts = list_utilities.remove_if_not(symbol_function($sym93$THESAURUS_GENSYM_), matching_concepts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject _prev_bind_0 = tm_io.$correlated_term_thesauri$.currentBinding(thread);
                    try {
                        tm_io.$correlated_term_thesauri$.bind(tm_internals.thesauri_of_concept(concept), thread);
                        matching_concepts = remove_if(symbol_function($sym94$IN_CORRELATED_TERM_THESAURI_), matching_concepts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        tm_io.$correlated_term_thesauri$.rebind(_prev_bind_0, thread);
                    }
                }
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
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input($str_alt95$tm_handle_correlate_concept, T, UNPROVIDED);
                        html_utilities.html_hidden_input($$$concept, cb_utilities.cb_fort_identifier(concept), UNPROVIDED);
                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                        if (NIL == matching_concepts) {
                            html_utilities.html_princ($str_alt53$No_correlation_candidates_were_fo);
                            html_utilities.html_br();
                        } else {
                            if ((NIL == candidate_thesauri) && (NIL == tm_internals.thesaurus_gensymP(concept))) {
                                html_utilities.html_hidden_input($$$type, $$$candidate, UNPROVIDED);
                            } else {
                                html_utilities.html_radio_input($$$type, $$$candidate, UNPROVIDED);
                            }
                            html_utilities.html_princ($str_alt98$Choose_one_of_the_following_conce);
                            if (NIL == tm_internals.thesaurus_gensymP(concept)) {
                                html_thesaurus.tm_link($CYC_CONCEPT, concept, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_indent(ONE_INTEGER);
                            }
                            html_tm_browsing.tm_thesaurus_constant(concept, NIL, NIL, NIL, tm_internals.thesauri_of_concept(concept), UNPROVIDED, UNPROVIDED);
                            html_utilities.html_princ($str_alt99$_);
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
                                SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                SubLObject _prev_bind_1_49 = html_macros.$html_indent_table_max$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                                    {
                                        SubLObject indent = ONE_INTEGER;
                                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_indent_row_internal(indent);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (NIL != span) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(span);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = matching_concepts;
                                                            SubLObject matching_concept = NIL;
                                                            for (matching_concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , matching_concept = cdolist_list_var.first()) {
                                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                                    SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_radio_input($$$match, cb_utilities.cb_fort_identifier(matching_concept), UNPROVIDED);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
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
                                                                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        tm_concept_info(matching_concept);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_indent_table_internal(FIVE_INTEGER);
                                    }
                                } finally {
                                    html_macros.$html_indent_table_max$.rebind(_prev_bind_1_49, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        if (NIL != candidate_thesauri) {
                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                            if ((NIL == matching_concepts) && (NIL == tm_internals.thesaurus_gensymP(concept))) {
                                html_utilities.html_hidden_input($$$type, $$$specify, UNPROVIDED);
                            } else {
                                html_utilities.html_radio_input($$$type, $$$specify, UNPROVIDED);
                            }
                            html_utilities.html_princ($str_alt102$Specify_a_term_in_another_thesaur);
                            if (NIL == tm_internals.thesaurus_gensymP(concept)) {
                                html_thesaurus.tm_link($CYC_CONCEPT, concept, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_indent(ONE_INTEGER);
                            }
                            html_tm_browsing.tm_thesaurus_constant(concept, NIL, NIL, NIL, tm_internals.thesauri_of_concept(concept), UNPROVIDED, UNPROVIDED);
                            html_utilities.html_princ($str_alt99$_);
                            html_utilities.html_br();
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
                                SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                SubLObject _prev_bind_1_57 = html_macros.$html_indent_table_max$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                                    {
                                        SubLObject indent = ONE_INTEGER;
                                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_indent_row_internal(indent);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (NIL != span) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(span);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_text_input($str_alt103$typein_term, $str_alt6$, $int$50);
                                                        html_utilities.html_br();
                                                        html_thesaurus.tm_thesaurus_selection(candidate_thesauri, NIL, $$$thesaurus, NIL);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_indent_table_internal(FIVE_INTEGER);
                                    }
                                } finally {
                                    html_macros.$html_indent_table_max$.rebind(_prev_bind_1_57, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        if (NIL != tm_internals.thesaurus_gensymP(concept)) {
                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                            if ((NIL == matching_concepts) && (NIL == candidate_thesauri)) {
                                html_utilities.html_hidden_input($$$type, $$$cyc, UNPROVIDED);
                            } else {
                                html_utilities.html_radio_input($$$type, $$$cyc, UNPROVIDED);
                            }
                            html_utilities.html_princ($str_alt106$Enter_a_Cyc_term_to_correlate_wit);
                            html_tm_browsing.tm_thesaurus_constant(concept, NIL, NIL, NIL, tm_internals.thesauri_of_concept(concept), UNPROVIDED, UNPROVIDED);
                            html_utilities.html_princ($str_alt107$__);
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
                                SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                SubLObject _prev_bind_1_61 = html_macros.$html_indent_table_max$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                                    {
                                        SubLObject indent = ONE_INTEGER;
                                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_indent_row_internal(indent);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (NIL != span) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(span);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_text_input($str_alt108$cyc_concept, $str_alt6$, $int$50);
                                                        html_utilities.html_br();
                                                        html_complete.html_complete_button($str_alt108$cyc_concept, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED_SYM);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_indent_table_internal(FIVE_INTEGER);
                                    }
                                } finally {
                                    html_macros.$html_indent_table_max$.rebind(_prev_bind_1_61, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        if (!(((NIL == matching_concepts) && (NIL == candidate_thesauri)) && (NIL == tm_internals.thesaurus_gensymP(concept)))) {
                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                            html_utilities.html_submit_input($$$Correlate_Them, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_reset_input(UNPROVIDED);
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

    /**
     * attempts to parse STRING as a Cyc constant specification, and returns it
     */
    public static final SubLObject tm_parse_input_constant(SubLObject string) {
        SubLSystemTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject result = NIL;
            if (length(string).numE(ZERO_INTEGER)) {
                return NIL;
            } else
                if (NIL != string_utilities.starts_with(string, $str_alt112$_)) {
                    {
                        SubLObject v_term = ke_utilities.fort_from_string(string);
                        if (NIL != constant_handles.constant_p(v_term)) {
                            result = v_term;
                        }
                    }
                } else
                    if (NIL != string_utilities.string_starts_with_constant_reader_prefix_p(string)) {
                        result = constant_completion_high.constant_complete(string_utilities.string_remove_constant_reader_prefix(string), T, T, UNPROVIDED, UNPROVIDED).first();
                    } else
                        if (length(string).numGE(ONE_INTEGER)) {
                            {
                                SubLObject exact = constant_completion_high.constant_complete(string, T, T, UNPROVIDED, UNPROVIDED);
                                result = exact.first();
                            }
                        }



            return result;
        }
    }

    /**
     * Merges two concepts and reports back
     */
    public static final SubLObject tm_handle_correlate_concept(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject concept_id = html_utilities.html_extract_input($$$concept, args);
                SubLObject type = html_utilities.html_extract_input($$$type, args);
                SubLObject match_id = html_utilities.html_extract_input($$$match, args);
                SubLObject typein_term = html_utilities.html_extract_input($str_alt103$typein_term, args);
                SubLObject thesaurus = html_utilities.html_extract_input($$$thesaurus, args);
                SubLObject cyc_concept_name = html_utilities.html_extract_input($str_alt108$cyc_concept, args);
                SubLObject cyc_concept = NIL;
                SubLObject concept = NIL;
                SubLObject match = NIL;
                SubLObject result = NIL;
                concept = html_thesaurus.tm_guess_fort(concept_id);
                if (NIL == forts.valid_fortP(concept)) {
                    return html_thesaurus.tm_error($str_alt89$Implementation_error__No_concept_, concept_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (type.equal($$$candidate)) {
                    if (NIL != match_id) {
                        match_id = read_from_string_ignoring_errors(match_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL == match_id) {
                        return html_thesaurus.tm_error($str_alt113$Can_t_correlate__No_matching_conc, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    match = html_thesaurus.tm_guess_fort(match_id);
                    if (NIL == forts.valid_fortP(match)) {
                        return html_thesaurus.tm_error($str_alt89$Implementation_error__No_concept_, match_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else
                    if (type.equal($$$specify)) {
                        if (NIL != typein_term) {
                            typein_term = tm_internals.canonicalize_lexical_term(typein_term);
                        }
                        if (length(typein_term).numG(ZERO_INTEGER)) {
                            if (NIL != thesaurus) {
                                {
                                    SubLObject thesaurus_constant = tm_internals.thesaurus_constant_from_name(thesaurus);
                                    SubLObject lexpred = NIL;
                                    if (NIL == tm_internals.thesaurusP(thesaurus_constant)) {
                                        return html_thesaurus.tm_error($str_alt114$Implementation_error__Can_t_deter, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    try {
                                        match = tm_datastructures.unique_lexpred_sign_in_thesaurus(typein_term, $$preferredTerm, thesaurus_constant);
                                    } catch (Throwable ccatch_env_var) {
                                        lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
                                    }
                                    if (NIL != lexpred) {
                                        return html_thesaurus.tm_error($str_alt115$Can_t_correlate_with__S_in__A__Mu, typein_term, thesaurus, typein_term, thesaurus, UNPROVIDED, UNPROVIDED);
                                    }
                                    if (NIL == tm_datastructures.signp(match)) {
                                        return html_thesaurus.tm_error($str_alt116$Can_t_correlate___S_is_not_a_term, typein_term, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    match = tm_datastructures.sign_concept(match);
                                }
                            } else {
                                return html_thesaurus.tm_error($str_alt117$Can_t_determine_a_term_from__S_be, typein_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    } else
                        if (type.equal($$$cyc)) {
                            if (NIL == tm_internals.thesaurus_gensymP(concept)) {
                                return html_thesaurus.tm_error($str_alt118$Can_t_correlate___S_is_already_co, tm_internals.tm_string_for_constant(concept, NIL, NIL, T), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL != cyc_concept_name) {
                                cyc_concept = tm_parse_input_constant(cyc_concept_name);
                            }
                            if (NIL == forts.valid_fortP(cyc_concept)) {
                                return html_thesaurus.tm_error($str_alt119$Can_t_correlate__No_Cyc_concept_c, cyc_concept_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            match = cyc_concept;
                        } else {
                            return html_thesaurus.tm_error($str_alt120$You_must_choose_which_type_of_cor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }


                if (NIL == forts.valid_fortP(match)) {
                    return html_thesaurus.tm_error($str_alt121$Implementation_error__No_match_ha, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject concept_thesauri = tm_internals.thesauri_of_concept(concept);
                    SubLObject match_thesauri = tm_internals.thesauri_of_concept(match);
                    SubLObject intersection = intersection(concept_thesauri, match_thesauri, UNPROVIDED, UNPROVIDED);
                    SubLObject concept_string = tm_internals.tm_string_for_constant(concept, NIL, NIL, T);
                    SubLObject match_string = tm_string_for_correlated_concept(match);
                    if (NIL != intersection) {
                        return html_thesaurus.tm_error($str_alt74$__A__and___A__cannot_be_correlate, concept_string, match_string, length(intersection).numG(ONE_INTEGER) ? ((SubLObject) ($$$i)) : $$$us, Mapping.mapcar(symbol_function(THESAURUS_NAME), intersection), UNPROVIDED, UNPROVIDED);
                    }
                    result = tm_io.tm_merge_concepts(concept, match);
                    if (NIL != result) {
                        log_correlate(concept_thesauri, concept_string, match_thesauri, match_string);
                    } else {
                        return html_thesaurus.tm_error($str_alt122$Correlate_concepts_failed_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM, result, UNPROVIDED);
                    {
                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ($$$Correlate_Concepts_Results);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color_value) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_value));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                        html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ($$$Correlate_Concepts_Results);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event($$$Correlate_Concepts_Results);
                                        if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                            html_utilities.html_princ($str_alt16$Sorry__you_do_not_have_permission);
                                        } else {
                                            html_thesaurus.thesaurus_heading($str_alt95$tm_handle_correlate_concept);
                                            if (NIL != set_difference(tm_internals.all_thesauri(), tm_internals.thesauri_of_concept(result), UNPROVIDED, UNPROVIDED)) {
                                                html_utilities.html_princ($str_alt124$Click_to_find_more_correlation_ca);
                                                html_tm_browsing.tm_thesaurus_constant(result, NIL, NIL, NIL, tm_internals.thesauri_of_concept(result), UNPROVIDED, UNPROVIDED);
                                                html_thesaurus.tm_link($CORRELATE_CONCEPT, cb_utilities.cb_fort_identifier(result), UNPROVIDED, UNPROVIDED);
                                            } else {
                                                html_utilities.html_princ($str_alt126$No_more_correlation_candidates_ca);
                                            }
                                            html_tm_browsing.tm_full_record_info_merged(result, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI));
                                        }
                                        html_thesaurus.tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
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
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_uncorrelate(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject concept_id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject concept = NIL;
                if (NIL != tm_internals.editing_allowedP()) {
                    concept = html_thesaurus.tm_guess_fort(concept_id);
                    if (NIL == forts.valid_fortP(concept)) {
                        return html_thesaurus.tm_error($str_alt128$Couldn_t_determine_a_thesaurus_co, concept_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    {
                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ($$$Uncorrelate_Concept);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color_value) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_value));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                        html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ($$$Uncorrelate_Concept);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event($$$Uncorrelate_Concept);
                                        if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt130$limited_editor)))) {
                                            html_utilities.html_princ($str_alt16$Sorry__you_do_not_have_permission);
                                        } else {
                                            html_thesaurus.thesaurus_heading($str_alt131$tm_uncorrelate);
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
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt132$tm_handle_uncorrelate, T, UNPROVIDED);
                                                    html_utilities.html_hidden_input($$$id, cb_utilities.cb_fort_identifier(concept), UNPROVIDED);
                                                    html_utilities.html_princ($str_alt134$Choose_thesauri_for_uncorrelating);
                                                    html_tm_browsing.tm_thesaurus_constant(concept, NIL, NIL, NIL, tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_princ($str_alt135$_);
                                                    html_utilities.html_br();
                                                    {
                                                        SubLObject editable_thesauri = (tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI) == $ALL) ? ((SubLObject) (tm_internals.all_thesauri())) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI);
                                                        SubLObject concept_editable_thesauri = intersection(tm_internals.thesauri_of_concept(concept), editable_thesauri, UNPROVIDED, UNPROVIDED);
                                                        SubLObject active_thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDIT_THESAURI);
                                                        SubLObject concept_active_thesauri = intersection(tm_internals.thesauri_of_concept(concept), active_thesauri, UNPROVIDED, UNPROVIDED);
                                                        html_thesaurus.tm_thesaurus_selection(concept_editable_thesauri, concept_active_thesauri, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_br();
                                                        html_utilities.html_submit_input($$$Uncorrelate, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_reset_input(UNPROVIDED);
                                                    }
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_thesaurus.tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
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
                } else {
                    {
                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ($$$Uncorrelate_Results);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color_value) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_value));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                        html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ($$$Uncorrelate_Results);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event($$$Uncorrelate_Results);
                                        if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt130$limited_editor)))) {
                                            html_utilities.html_princ($str_alt16$Sorry__you_do_not_have_permission);
                                        } else {
                                            html_thesaurus.thesaurus_heading($str_alt131$tm_uncorrelate);
                                            html_thesaurus.tm_report_editing_disabled();
                                        }
                                        html_thesaurus.tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
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
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_uncorrelate(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject concept_id = html_utilities.html_extract_input($$$id, args);
                SubLObject thesauri = html_utilities.html_extract_input_values($$$thesauri, args);
                SubLObject concept = NIL;
                SubLObject thesaurus_constants = NIL;
                if (NIL != tm_internals.editing_allowedP()) {
                    concept = html_thesaurus.tm_guess_fort(concept_id);
                    if (NIL == forts.valid_fortP(concept)) {
                        html_thesaurus.tm_error($str_alt143$Expected_a_FORT__got__a, concept, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    thesaurus_constants = Mapping.mapcar(symbol_function(THESAURUS_CONSTANT_FROM_NAME), thesauri);
                    {
                        SubLObject cdolist_list_var = thesaurus_constants;
                        SubLObject thesaurus_constant = NIL;
                        for (thesaurus_constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_constant = cdolist_list_var.first()) {
                            if (NIL == tm_internals.thesaurusP(thesaurus_constant)) {
                                html_thesaurus.tm_error($str_alt145$Expected_a_THESAURUS__got__a, thesaurus_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                    {
                        SubLObject results = list_utilities.remove_if_not(symbol_function($sym93$THESAURUS_GENSYM_), tm_io.tm_uncorrelate_concept(concept, thesaurus_constants), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ($$$Uncorrelate_Results);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color_value) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_value));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                        html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ($$$Uncorrelate_Results);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event($$$Uncorrelate_Results);
                                        if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt130$limited_editor)))) {
                                            html_utilities.html_princ($str_alt16$Sorry__you_do_not_have_permission);
                                        } else {
                                            html_thesaurus.thesaurus_heading($str_alt132$tm_handle_uncorrelate);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt146$New__separate_concepts_were_creat, length(results));
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_br();
                                            html_utilities.html_br();
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
                                                SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$html_indent_table_max$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                                                    {
                                                        SubLObject cdolist_list_var = results;
                                                        SubLObject result = NIL;
                                                        for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject indent = THREE_INTEGER;
                                                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_indent_row_internal(indent);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (NIL != span) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(span);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_tm_browsing.tm_thesaurus_constant(result, NIL, T, T, tm_internals.thesauri_of_concept(result), UNPROVIDED, UNPROVIDED);
                                                                                if (NIL == intersection(tm_internals.thesauri_of_concept(result), tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI), UNPROVIDED, UNPROVIDED)) {
                                                                                    html_utilities.html_princ($str_alt147$__Not_in_the_active_thesauri_);
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            }
                                                        }
                                                        html_utilities.html_indent_table_internal(ONE_INTEGER);
                                                    }
                                                } finally {
                                                    html_macros.$html_indent_table_max$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        }
                                        html_thesaurus.tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
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
                } else {
                    {
                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ($$$Uncorrelate_Results);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color_value) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_value));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                        html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ($$$Uncorrelate_Results);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event($$$Uncorrelate_Results);
                                        if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt130$limited_editor)))) {
                                            html_utilities.html_princ($str_alt16$Sorry__you_do_not_have_permission);
                                        } else {
                                            html_thesaurus.thesaurus_heading($str_alt131$tm_uncorrelate);
                                            html_thesaurus.tm_report_editing_disabled();
                                        }
                                        html_thesaurus.tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
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
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_html_tm_correlate_file() {
        declareFunction("tm_correlate_guts", "TM-CORRELATE-GUTS", 0, 0, false);
        declareFunction("tm_correlate", "TM-CORRELATE", 0, 1, false);
        declareFunction("tm_clear_correlation_state", "TM-CLEAR-CORRELATION-STATE", 1, 0, false);
        declareFunction("tm_handle_correlate", "TM-HANDLE-CORRELATE", 1, 0, false);
        declareFunction("tm_get_start_term_for_correlation", "TM-GET-START-TERM-FOR-CORRELATION", 1, 0, false);
        declareFunction("tm_do_correlation", "TM-DO-CORRELATION", 1, 0, false);
        declareFunction("tm_string_for_correlated_concept", "TM-STRING-FOR-CORRELATED-CONCEPT", 1, 0, false);
        declareFunction("log_correlate", "LOG-CORRELATE", 4, 0, false);
        declareFunction("tm_handle_do_correlation", "TM-HANDLE-DO-CORRELATION", 1, 0, false);
        declareFunction("tm_show_correlation_messages", "TM-SHOW-CORRELATION-MESSAGES", 0, 1, false);
        declareFunction("tm_concept_info", "TM-CONCEPT-INFO", 1, 0, false);
        declareFunction("tm_correlate_concept_page", "TM-CORRELATE-CONCEPT-PAGE", 1, 0, false);
        declareFunction("tm_present_correlate_concept_choices", "TM-PRESENT-CORRELATE-CONCEPT-CHOICES", 2, 0, false);
        declareFunction("tm_parse_input_constant", "TM-PARSE-INPUT-CONSTANT", 1, 0, false);
        declareFunction("tm_handle_correlate_concept", "TM-HANDLE-CORRELATE-CONCEPT", 1, 0, false);
        declareFunction("tm_uncorrelate", "TM-UNCORRELATE", 1, 0, false);
        declareFunction("tm_handle_uncorrelate", "TM-HANDLE-UNCORRELATE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_html_tm_correlate_file() {
        return NIL;
    }

    public static final SubLObject setup_html_tm_correlate_file() {
                html_macros.note_html_handler_function(TM_CORRELATE);
        html_macros.note_html_handler_function(TM_CLEAR_CORRELATION_STATE);
        html_macros.note_html_handler_function(TM_HANDLE_CORRELATE);
        html_macros.note_html_handler_function(TM_HANDLE_DO_CORRELATION);
        html_macros.note_html_handler_function(TM_SHOW_CORRELATION_MESSAGES);
        html_macros.note_html_handler_function(TM_CORRELATE_CONCEPT_PAGE);
        html_macros.note_html_handler_function(TM_HANDLE_CORRELATE_CONCEPT);
        html_macros.note_html_handler_function(TM_UNCORRELATE);
        html_macros.note_html_handler_function(TM_HANDLE_UNCORRELATE);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$New_or_Existing_Correlation_ = makeString("New or Existing Correlation?");

    static private final SubLString $$$type = makeString("type");

    static private final SubLString $$$new = makeString("new");

    static private final SubLString $$$Start_a_New_Correlation = makeString("Start a New Correlation");

    static private final SubLString $str_alt4$Enter_Term_as_Starting_Point__opt = makeString("Enter Term as Starting Point (optional):");

    static private final SubLString $str_alt5$start_term = makeString("start-term");

    static private final SubLString $str_alt6$ = makeString("");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $$$continue = makeString("continue");

    static private final SubLString $$$Continue_Existing_Correlation = makeString("Continue Existing Correlation");

    static private final SubLString $str_alt10$Choose_Thesaurus_to_Correlate_ = makeString("Choose Thesaurus to Correlate:");

    static private final SubLString $$$thesaurus = makeString("thesaurus");

    private static final SubLSymbol $CORRELATE_THESAURUS = makeKeyword("CORRELATE-THESAURUS");

    static private final SubLString $str_alt13$__search_in_progress_ = makeString(" (search in progress)");

    static private final SubLString $$$Correlate_Thesaurus = makeString("Correlate Thesaurus");

    static private final SubLString $$$administrator = makeString("administrator");

    static private final SubLString $str_alt16$Sorry__you_do_not_have_permission = makeString("Sorry, you do not have permission to access this page.");

    static private final SubLString $str_alt17$tm_correlate = makeString("tm-correlate");

    static private final SubLString $str_alt18$tm_handle_correlate = makeString("tm-handle-correlate");

    static private final SubLString $$$Correlate = makeString("Correlate");

    static private final SubLString $str_alt20$_A_ = makeString("~A?");

    static private final SubLString $str_alt21$tm_clear_correlation_state = makeString("tm-clear-correlation-state");

    static private final SubLString $str_alt22$_Clear_Correlation_State_for_All_ = makeString("[Clear Correlation State for All Thesauri]");

    private static final SubLSymbol TM_CORRELATE = makeSymbol("TM-CORRELATE");

    private static final SubLSymbol TM_CLEAR_CORRELATION_STATE = makeSymbol("TM-CLEAR-CORRELATION-STATE");

    static private final SubLString $str_alt25$You_must_choose_either_to_start_a = makeString("You must choose either to start a new correlation, or continue an existing one.");

    static private final SubLString $str_alt26$You_must_choose_a_thesaurus_on_wh = makeString("You must choose a thesaurus on which to perform the correlation.");

    static private final SubLString $str_alt27$Implementation_error___A_is_not_a = makeString("Implementation error: ~A is not a valid thesaurus.");

    private static final SubLSymbol $THESAURI = makeKeyword("THESAURI");



    private static final SubLSymbol $MULTIPLE_LEXPRED = makeKeyword("MULTIPLE-LEXPRED");

    public static final SubLObject $$preferredTerm = constant_handles.reader_make_constant_shell(makeString("preferredTerm"));

    static private final SubLString $str_alt32$Can_t_start_correlation____A__has = makeString("Can't start correlation: `~A' has multiple preferred term statements in ~A.  Integrity-check this term to fix.");



    static private final SubLString $str_alt34$Can_t_start_correlation____A__is_ = makeString("Can't start correlation: `~A' is not a PT in ~A.");

    static private final SubLString $str_alt35$Implementation_error__Start_corre = makeString("Implementation error: Start correlation failed.");

    static private final SubLString $str_alt36$Implementation_error___S_is_not_a = makeString("Implementation error: ~S is not a valid type of correlation");

    private static final SubLSymbol TM_HANDLE_CORRELATE = makeSymbol("TM-HANDLE-CORRELATE");

    static private final SubLString $$$No_Correlation_to_Continue = makeString("No Correlation to Continue");

    static private final SubLString $str_alt39$tm_get_start_term_for_correlation = makeString("tm-get-start-term-for-correlation");

    static private final SubLString $str_alt40$There_is_no_correlation_in_progre = makeString("There is no correlation in progress for ~A.  Please choose a different thesaurus, or Start New Correlation: ");

    static private final SubLString $str_alt41$Correlate_Thesaurus_Search_Result = makeString("Correlate Thesaurus Search Results");

    static private final SubLString $str_alt42$tm_do_correlation = makeString("tm-do-correlation");



    static private final SubLString $$$Correlation_Search_Finished = makeString("Correlation Search Finished");

    static private final SubLString $str_alt45$The_search_for_correlation_candid = makeString("The search for correlation candidates ended because ");



    static private final SubLString $str_alt47$the_default_number___A__were_foun = makeString("the default number (~A) were found.");



    static private final SubLString $str_alt49$it_timed_out_at__A_seconds_ = makeString("it timed out at ~A seconds.");

    static private final SubLString $str_alt50$all_possibilities_from_the_curren = makeString("all possibilities from the current starting-term were exhausted.");

    static private final SubLString $str_alt51$of_an_unknown_halt_reason__A = makeString("of an unknown halt reason ~A");

    static private final SubLString $str_alt52$tm_handle_do_correlation = makeString("tm-handle-do-correlation");

    static private final SubLString $str_alt53$No_correlation_candidates_were_fo = makeString("No correlation candidates were found.");

    static private final SubLString $str_alt54$If_you_wish_to_continue_correlati = makeString("If you wish to continue correlating, make a choice below.");

    static private final SubLString $str_alt55$For_each_of_the_following__A_term = makeString("For each of the following ~A terms, please choose zero or one correlation candidate.");

    static private final SubLString $str_alt56$concept__A = makeString("concept-~A");

    static private final SubLString $str_alt57$candidate__A = makeString("candidate-~A");

    private static final SubLSymbol $CYC_CONCEPT = makeKeyword("CYC-CONCEPT");



    static private final SubLString $$$Do_It = makeString("Do It");

    static private final SubLSymbol $sym61$NON_EMPTY_STRING_ = makeSymbol("NON-EMPTY-STRING?");



    static private final SubLString $str_alt63$_a_a_a = makeString("~a~a~a");

    static private final SubLString $str_alt64$_and_ = makeString(" and ");

    static private final SubLString $str_alt65$_a___a = makeString("~a, ~a");

    static private final SubLString $str_alt66$in__a_ = makeString("in ~a ");

    static private final SubLString $$$in_the_Cyc_KB = makeString("in the Cyc KB");

    static private final SubLString $str_alt68$Correlation_of___A___awith___A___ = makeString("Correlation of `~A' ~awith `~A' ~a");

    private static final SubLSymbol TM_LOG_ID_P = makeSymbol("TM-LOG-ID-P");

    private static final SubLSymbol TM_LOG_ID = makeSymbol("TM-LOG-ID");



    static private final SubLList $list_alt72 = list(makeKeyword("ADMIN"));

    private static final SubLSymbol $CORRELATION_MESSAGES = makeKeyword("CORRELATION-MESSAGES");

    static private final SubLString $str_alt74$__A__and___A__cannot_be_correlate = makeString("'~A' and '~A' cannot be correlated, since they exist in the same thesaur~a ~A.");

    static private final SubLString $$$i = makeString("i");

    static private final SubLString $$$us = makeString("us");

    static private final SubLString $str_alt77$Correlate___A__with___A__succeede = makeString("Correlate `~A' with `~A' succeeded.");

    static private final SubLString $str_alt78$Correlate___A__with___A__failed_ = makeString("Correlate `~A' with `~A' failed.");

    static private final SubLString $str_alt79$_A_not_correlated_ = makeString("~A not correlated.");

    private static final SubLSymbol TM_HANDLE_DO_CORRELATION = makeSymbol("TM-HANDLE-DO-CORRELATION");

    static private final SubLString $$$Correlation_Results = makeString("Correlation Results");

    static private final SubLString $str_alt82$tm_show_correlation_messages = makeString("tm-show-correlation-messages");

    static private final SubLString $str_alt83$If_you_wish_to_continue_correlati = makeString("If you wish to continue correlating, make a choice below:");

    private static final SubLSymbol TM_SHOW_CORRELATION_MESSAGES = makeSymbol("TM-SHOW-CORRELATION-MESSAGES");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLString $str_alt87$Cyc_concept__ = makeString("Cyc concept: ");

    static private final SubLString $str_alt88$Cyc_comment__ = makeString("Cyc comment: ");

    static private final SubLString $str_alt89$Implementation_error__No_concept_ = makeString("Implementation error: No concept found by id ~S");

    static private final SubLString $str_alt90$Correlate_Concept___A_ = makeString("Correlate Concept '~A'");

    static private final SubLString $str_alt91$tm_correlate_concept_page = makeString("tm-correlate-concept-page");

    private static final SubLSymbol TM_CORRELATE_CONCEPT_PAGE = makeSymbol("TM-CORRELATE-CONCEPT-PAGE");

    static private final SubLSymbol $sym93$THESAURUS_GENSYM_ = makeSymbol("THESAURUS-GENSYM?");

    static private final SubLSymbol $sym94$IN_CORRELATED_TERM_THESAURI_ = makeSymbol("IN-CORRELATED-TERM-THESAURI?");

    static private final SubLString $str_alt95$tm_handle_correlate_concept = makeString("tm-handle-correlate-concept");

    static private final SubLString $$$concept = makeString("concept");

    static private final SubLString $$$candidate = makeString("candidate");

    static private final SubLString $str_alt98$Choose_one_of_the_following_conce = makeString("Choose one of the following concepts to correlate with ");

    static private final SubLString $str_alt99$_ = makeString(":");

    static private final SubLString $$$match = makeString("match");

    static private final SubLString $$$specify = makeString("specify");

    static private final SubLString $str_alt102$Specify_a_term_in_another_thesaur = makeString("Specify a term in another thesaurus to correlate with ");

    static private final SubLString $str_alt103$typein_term = makeString("typein-term");

    public static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLString $$$cyc = makeString("cyc");

    static private final SubLString $str_alt106$Enter_a_Cyc_term_to_correlate_wit = makeString("Enter a Cyc term to correlate with ");

    static private final SubLString $str_alt107$__ = makeString(": ");

    static private final SubLString $str_alt108$cyc_concept = makeString("cyc-concept");

    static private final SubLString $$$Complete = makeString("Complete");

    static private final SubLString $$$Correlate_Them = makeString("Correlate Them");



    static private final SubLString $str_alt112$_ = makeString("(");

    static private final SubLString $str_alt113$Can_t_correlate__No_matching_conc = makeString("Can't correlate: No matching concept was specified!");

    static private final SubLString $str_alt114$Implementation_error__Can_t_deter = makeString("Implementation error: Can't determine thesaurus from ~S");

    static private final SubLString $str_alt115$Can_t_correlate_with__S_in__A__Mu = makeString("Can't correlate with ~S in ~A: Multiple preferred term statements.  Integrity check ~S in ~A to fix.");

    static private final SubLString $str_alt116$Can_t_correlate___S_is_not_a_term = makeString("Can't correlate: ~S is not a term in ~a.");

    static private final SubLString $str_alt117$Can_t_determine_a_term_from__S_be = makeString("Can't determine a term from ~S because no thesaurus was specified.");

    static private final SubLString $str_alt118$Can_t_correlate___S_is_already_co = makeString("Can't correlate: ~S is already correlated with a Cyc concept.");

    static private final SubLString $str_alt119$Can_t_correlate__No_Cyc_concept_c = makeString("Can't correlate: No Cyc concept could be determined from ~S.");

    static private final SubLString $str_alt120$You_must_choose_which_type_of_cor = makeString("You must choose which type of correlation to do.");

    static private final SubLString $str_alt121$Implementation_error__No_match_ha = makeString("Implementation error: No match has been determined.");

    static private final SubLString $str_alt122$Correlate_concepts_failed_ = makeString("Correlate concepts failed.");

    static private final SubLString $$$Correlate_Concepts_Results = makeString("Correlate Concepts Results");

    static private final SubLString $str_alt124$Click_to_find_more_correlation_ca = makeString("Click to find more correlation candidates for ");

    private static final SubLSymbol $CORRELATE_CONCEPT = makeKeyword("CORRELATE-CONCEPT");

    static private final SubLString $str_alt126$No_more_correlation_candidates_ca = makeString("No more correlation candidates can be found.");

    private static final SubLSymbol TM_HANDLE_CORRELATE_CONCEPT = makeSymbol("TM-HANDLE-CORRELATE-CONCEPT");

    static private final SubLString $str_alt128$Couldn_t_determine_a_thesaurus_co = makeString("Couldn't determine a thesaurus concept from ~A");

    static private final SubLString $$$Uncorrelate_Concept = makeString("Uncorrelate Concept");

    static private final SubLString $str_alt130$limited_editor = makeString("limited-editor");

    static private final SubLString $str_alt131$tm_uncorrelate = makeString("tm-uncorrelate");

    static private final SubLString $str_alt132$tm_handle_uncorrelate = makeString("tm-handle-uncorrelate");

    static private final SubLString $$$id = makeString("id");

    static private final SubLString $str_alt134$Choose_thesauri_for_uncorrelating = makeString("Choose thesauri for uncorrelating ");

    static private final SubLString $str_alt135$_ = makeString(".");

    private static final SubLSymbol $EDITABLE_THESAURI = makeKeyword("EDITABLE-THESAURI");



    private static final SubLSymbol $EDIT_THESAURI = makeKeyword("EDIT-THESAURI");

    static private final SubLString $$$Uncorrelate = makeString("Uncorrelate");

    static private final SubLString $$$Uncorrelate_Results = makeString("Uncorrelate Results");

    private static final SubLSymbol TM_UNCORRELATE = makeSymbol("TM-UNCORRELATE");

    static private final SubLString $$$thesauri = makeString("thesauri");

    static private final SubLString $str_alt143$Expected_a_FORT__got__a = makeString("Expected a FORT, got ~a");

    private static final SubLSymbol THESAURUS_CONSTANT_FROM_NAME = makeSymbol("THESAURUS-CONSTANT-FROM-NAME");

    static private final SubLString $str_alt145$Expected_a_THESAURUS__got__a = makeString("Expected a THESAURUS, got ~a");

    static private final SubLString $str_alt146$New__separate_concepts_were_creat = makeString("New, separate concepts were created to represent these terms:");

    static private final SubLString $str_alt147$__Not_in_the_active_thesauri_ = makeString(" (Not in the active thesauri)");

    private static final SubLSymbol TM_HANDLE_UNCORRELATE = makeSymbol("TM-HANDLE-UNCORRELATE");

    // // Initializers
    public void declareFunctions() {
        declare_html_tm_correlate_file();
    }

    public void initializeVariables() {
        init_html_tm_correlate_file();
    }

    public void runTopLevelForms() {
        setup_html_tm_correlate_file();
    }
}

