/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.operation_queues;
import com.cyc.cycjava.cycl.pph_methods_formulas;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
 *  module:      HTML-TM-UPDATE
 *  source file: /cyc/top/cycl/thesaurus/html-tm-update.lisp
 *  created:     2019/07/03 17:38:31
 */
public final class html_tm_update extends SubLTranslatedFile implements V02 {
    // // Constructor
    private html_tm_update() {
    }

    public static final SubLFile me = new html_tm_update();


    // // Definitions
    public static final SubLObject tm_update_load_in_thinker(SubLObject pathname, SubLObject thesaurus, SubLObject format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thinking = tm_thinking.tm_new_thinking(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD);
                SubLObject thread_1 = tm_thinking.tm_thinking_start(thinking, TM_UPDATE_LOAD_WRAPPER, list(pathname, thesaurus, format));
                return thread_1;
            }
        }
    }

    public static final SubLObject tm_update_load_wrapper(SubLObject pathname, SubLObject thesaurus, SubLObject format) {
        {
            SubLObject success = NIL;
            try {
                tm_io.tm_update_load(pathname, thesaurus, format);
                success = T;
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        tm_datastructures.tm_finish_read_operation(thesaurus);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            if (NIL != success) {
                return $$$SUCCESS;
            } else {
                return $$$INCOMPLETE;
            }
        }
    }

    public static final SubLObject tm_update_loadable_thesauri() {
        {
            SubLObject thesauri = tm_internals.all_thesauri();
            SubLObject cdolist_list_var = tm_internals.all_thesauri();
            SubLObject thesaurus = NIL;
            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                if (NIL != tm_io.tm_update_load_state_for_thesaurus(thesaurus)) {
                    thesauri = remove(thesaurus, thesauri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return Sort.sort(thesauri, symbol_function($sym4$TERM__), symbol_function(THESAURUS_NAME));
        }
    }

    public static final SubLObject tm_update_load_page(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != tm_internals.editing_allowedP()) {
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$Begin_Update_Load_Analysis);
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
                                SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($$$Begin_Update_Load_Analysis);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($$$Begin_Update_Load_Analysis);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt8$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt9$tm_update_load_page);
                                        html_utilities.html_princ($str_alt10$Update_Load_will_look_for_the_fil);
                                        html_utilities.html_br();
                                        html_utilities.html_princ(NIL != tm_control_vars.$tm_special_load_thesaurus_directory$.getDynamicValue(thread) ? ((SubLObject) (tm_control_vars.$tm_special_load_thesaurus_directory$.getDynamicValue(thread))) : tm_datastructures.$tm_load_thesaurus_directory$.getGlobalValue());
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        html_utilities.html_princ($str_alt11$Update_Load_has_two_phases_);
                                        html_utilities.html_markup(html_macros.$html_ordered_list_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt12$Analysis_phase___);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt13$Submitting_this_page_launches_the);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt14$Decision_phase___);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt15$The_decision_phase_may_be_started);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_ordered_list_tail$.getGlobalValue());
                                        html_utilities.html_br();
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
                                            SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt16$tm_handle_update_load, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                                                        html_utilities.html_princ($str_alt17$Choose_Thesaurus__);
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
                                                                        html_macros.verify_not_within_html_pre();
                                                                        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                                        {
                                                                            SubLObject _prev_bind_0_13 = html_macros.$within_html_pre$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$within_html_pre$.bind(T, thread);
                                                                                html_utilities.html_princ($str_alt18$__);
                                                                            } finally {
                                                                                html_macros.$within_html_pre$.rebind(_prev_bind_0_13, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt19$Choose_Input_Format_);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                    SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject thesauri = intersection(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI) == $ALL ? ((SubLObject) (tm_internals.all_thesauri())) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI), tm_update_loadable_thesauri(), UNPROVIDED, UNPROVIDED);
                                                                            html_thesaurus.tm_thesaurus_selection(thesauri, NIL, $$$thesaurus, UNPROVIDED);
                                                                        }
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
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
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
                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject select_size = max(FOUR_INTEGER, min(EIGHT_INTEGER, length(tm_io.$tm_load_read_methods$.getDynamicValue(thread))));
                                                                            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup($$$format);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            if (NIL != select_size) {
                                                                                html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(select_size);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    {
                                                                                        SubLObject cdolist_list_var = tm_io.$tm_load_read_methods$.getDynamicValue(thread);
                                                                                        SubLObject output_format = NIL;
                                                                                        for (output_format = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , output_format = cdolist_list_var.first()) {
                                                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_utilities.html_princ(string_utilities.string_from_keyword(output_format.first()));
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_princ($str_alt26$Enter_input_filename__including_e);
                                                html_utilities.html_br();
                                                html_utilities.html_text_input($$$filename, $str_alt28$, $int$60);
                                                html_utilities.html_br();
                                                html_utilities.html_submit_input($$$Analyze, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_reset_input(UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
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
                    html_utilities.html_princ($$$Update_Load);
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
                                SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($$$Update_Load);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($$$Update_Load);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt8$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.tm_report_editing_disabled();
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
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

    public static final SubLObject tm_handle_update_load(SubLObject args) {
        {
            SubLObject thesaurus_name = html_utilities.html_extract_input($$$thesaurus, args);
            SubLObject filename = html_utilities.html_extract_input($$$filename, args);
            SubLObject format_name = html_utilities.html_extract_input($$$format, args);
            SubLObject thesaurus = NIL;
            SubLObject format = NIL;
            SubLObject pathname = NIL;
            if (!thesaurus_name.isString()) {
                return html_thesaurus.tm_error($str_alt33$Please_choose_a_thesaurus_to_upda, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
            if (NIL == tm_internals.thesaurusP(thesaurus)) {
                return html_thesaurus.tm_error($str_alt34$Could_not_find_a_thesaurus_named_, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (!format_name.isString()) {
                return html_thesaurus.tm_error($str_alt35$Please_choose_an_input_format_for, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            format = string_utilities.keyword_from_string(Strings.string_upcase(format_name, UNPROVIDED, UNPROVIDED));
            if (!(filename.isString() && length(filename).numG(ZERO_INTEGER))) {
                return html_thesaurus.tm_error($str_alt36$Please_enter_a_filename_for_the_u, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pathname = html_tm_utilities.tm_make_load_thesaurus_pathname(filename);
            if (NIL == Filesys.probe_file(pathname)) {
                return html_thesaurus.tm_error($str_alt37$Update_Load__file__S_cannot_be_op, filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            tm_handle_update_load_internal(pathname, thesaurus, format);
        }
        return NIL;
    }

    public static final SubLObject tm_handle_update_load_internal(SubLObject pathname, SubLObject thesaurus, SubLObject format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                SubLObject title = format(NIL, $str_alt39$Performing_an_Update_Load_of__A, thesaurus_name);
                SubLObject successP = NIL;
                successP = tm_datastructures.tm_start_read_operation(thesaurus);
                if (NIL != successP) {
                    {
                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title);
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
                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ(title);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event(title);
                                        html_thesaurus.thesaurus_heading($str_alt16$tm_handle_update_load);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt40$Updating_the__A_thesaurus_from_fi, thesaurus_name);
                                        html_utilities.html_br();
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt41$_S, pathname);
                                        html_utilities.html_br();
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt42$in__A_format_, string_utilities.string_from_keyword(format));
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        html_utilities.html_princ($str_alt43$Click_on_the_Status_button_to_vie);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        html_utilities.html_princ($str_alt44$After_the_update_analysis_is_fini);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        html_thesaurus.tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
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
                        html_utilities.html_flush();
                        tm_update_load_in_thinker(pathname, thesaurus, format);
                    }
                } else {
                    {
                        SubLObject message = cconcatenate($str_alt45$Update_Load_Analysis_of_thesaurus, new SubLObject[]{ thesaurus_name, $str_alt46$_is_not_permitted_at_this_time__s });
                        html_thesaurus.tm_message_to_user($$$Update_Load_Analysis_Not_Started, message);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * The number of changes to present to the user at one time
     */
    // defparameter
    public static final SubLSymbol $tm_update_change_increment$ = makeSymbol("*TM-UPDATE-CHANGE-INCREMENT*");

    public static final SubLObject tm_update_parse_and_dispatch_changes(SubLObject args, SubLObject action) {
        {
            SubLObject thesaurus_id = args.first();
            SubLObject type = second(args);
            SubLObject thesaurus = NIL;
            thesaurus = html_thesaurus.tm_guess_fort(thesaurus_id);
            if (NIL == tm_internals.thesaurusP(thesaurus)) {
                return html_thesaurus.tm_error($str_alt48$Implementation_error__Could_not_d, thesaurus_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject pcase_var = action;
                if (pcase_var.eql($ADD_VIEW)) {
                    tm_update_view_additions_internal(thesaurus, string_utilities.keyword_from_string(Strings.string_upcase(type, UNPROVIDED, UNPROVIDED)));
                } else
                    if (pcase_var.eql($ADD_NONE)) {
                        tm_update_add_none_internal(thesaurus, string_utilities.keyword_from_string(Strings.string_upcase(type, UNPROVIDED, UNPROVIDED)));
                    } else
                        if (pcase_var.eql($ADD_ALL)) {
                            tm_update_add_all_internal(thesaurus, string_utilities.keyword_from_string(Strings.string_upcase(type, UNPROVIDED, UNPROVIDED)));
                        } else
                            if (pcase_var.eql($ADD_INCREMENTAL)) {
                                tm_update_add_incremental_internal(thesaurus, string_utilities.keyword_from_string(Strings.string_upcase(type, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
                            } else
                                if (pcase_var.eql($DELETE_VIEW)) {
                                    tm_update_view_deletions_internal(thesaurus);
                                } else
                                    if (pcase_var.eql($DELETE_NONE)) {
                                        tm_update_delete_none_internal(thesaurus);
                                    } else
                                        if (pcase_var.eql($DELETE_ALL)) {
                                            tm_update_delete_all_internal(thesaurus);
                                        } else
                                            if (pcase_var.eql($DELETE_INCREMENTAL)) {
                                                tm_update_delete_incremental_internal(thesaurus, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($DECIDE)) {
                                                    tm_decide_update_load_changes_internal(thesaurus, UNPROVIDED);
                                                } else
                                                    if (pcase_var.eql($REUSE_MODE)) {
                                                        tm_request_concept_reuse_info(thesaurus);
                                                    }









            }
        }
        return NIL;
    }

    public static final SubLObject tm_decide_update_load_changes(SubLObject args) {
        {
            SubLObject thesaurus_id = args.first();
            SubLObject thesaurus = NIL;
            thesaurus = html_thesaurus.tm_guess_fort(thesaurus_id);
            if (NIL == tm_internals.thesaurusP(thesaurus)) {
                return html_thesaurus.tm_error($str_alt48$Implementation_error__Could_not_d, thesaurus_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
                if (NIL == load_state) {
                    return tm_report_no_load_state(thesaurus);
                } else {
                    {
                        SubLObject reuse_info = fifth(load_state);
                        SubLObject new_terms_hash = second(load_state);
                        if (((reuse_info == $UNKNOWN) && new_terms_hash.isHashtable()) && hash_table_count(new_terms_hash).numG(ZERO_INTEGER)) {
                            return tm_update_parse_and_dispatch_changes(args, $REUSE_MODE);
                        } else {
                            return tm_update_parse_and_dispatch_changes(args, $DECIDE);
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject tm_decide_update_load_changes_internal(SubLObject thesaurus, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        {
            SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
            if (NIL == load_state) {
                return tm_report_no_load_state(thesaurus);
            } else {
                {
                    SubLObject datum = load_state;
                    SubLObject current = datum;
                    SubLObject thes = NIL;
                    SubLObject new_terms_hash = NIL;
                    SubLObject additions_hash = NIL;
                    SubLObject deletions_hash = NIL;
                    SubLObject concept_reuse_info = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt61);
                    thes = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt61);
                    new_terms_hash = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt61);
                    additions_hash = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt61);
                    deletions_hash = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt61);
                    concept_reuse_info = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (new_terms_hash.isHashtable()) {
                            return tm_present_update_additions(load_state, $NEW, message);
                        }
                        if (additions_hash.isHashtable()) {
                            return tm_present_update_additions(load_state, $OLD, message);
                        }
                        if (deletions_hash.isHashtable()) {
                            return tm_present_update_deletions(load_state, message);
                        }
                        return tm_finish_update(load_state);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt61);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_request_concept_reuse_info(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
                if (NIL == load_state) {
                    return tm_report_no_load_state(thesaurus);
                } else {
                    {
                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ($$$Specify_Concept_Reuse_Mode);
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
                                    SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ($$$Specify_Concept_Reuse_Mode);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event($$$Specify_Concept_Reuse_Mode);
                                        if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                            html_utilities.html_princ($str_alt8$Sorry__you_do_not_have_permission);
                                        } else {
                                            html_thesaurus.thesaurus_heading($str_alt65$tm_request_concept_reuse_info);
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
                                                SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt66$tm_handle_concept_reuse, T, UNPROVIDED);
                                                    html_utilities.html_hidden_input($$$thesaurus, tm_internals.thesaurus_name(thesaurus), UNPROVIDED);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt67$The_update_load_of__A_has_identif, tm_internals.thesaurus_name(thesaurus));
                                                    html_utilities.html_princ($str_alt68$Choose_a_concept_reuse_mode_for_t);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    {
                                                        SubLObject data = $list_alt69;
                                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(ZERO_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = data;
                                                                    SubLObject item = NIL;
                                                                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_radio_input($str_alt70$reuse_mode, item.first(), equal(item.first(), $$$none));
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_princ(second(item));
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
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
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                    }
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_submit_input($$$Set_Reuse_Mode, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_reset_input(UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_thesaurus.tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
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

    public static final SubLObject tm_handle_concept_reuse(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject load_thesaurus_name = html_utilities.html_extract_input($$$thesaurus, args);
                SubLObject reuse_specs = html_utilities.html_extract_input_values($str_alt73$reuse_thesauri, args);
                SubLObject next_thesaurus_name = html_utilities.html_extract_input($str_alt74$next_thesaurus, args);
                SubLObject reuse_mode = html_utilities.html_extract_input($str_alt70$reuse_mode, args);
                SubLObject do_adds = makeBoolean((NIL != html_utilities.html_extract_input($str_alt75$do_adds, args)) || (!reuse_mode.equal($$$priority)));
                SubLObject title = format(NIL, $str_alt77$Specify_Concept_Reuse_Thesauri_fo, load_thesaurus_name);
                SubLObject reuse_thesauri_count = (NIL != next_thesaurus_name) ? ((SubLObject) (add(ONE_INTEGER, length(reuse_specs)))) : length(reuse_specs);
                SubLObject reuse_thesauri = make_vector(reuse_thesauri_count, UNPROVIDED);
                SubLObject load_thesaurus = tm_internals.thesaurus_constant_from_name(load_thesaurus_name);
                SubLObject next_thesaurus = tm_internals.thesaurus_constant_from_name(next_thesaurus_name);
                SubLObject next_position = length(reuse_specs);
                if (NIL != do_adds) {
                    tm_set_reuse_mode_and_perform_adds(args);
                }
                if (NIL != next_thesaurus_name) {
                    if (NIL == constant_handles.valid_constant(next_thesaurus, UNPROVIDED)) {
                        return html_thesaurus.tm_error($str_alt78$Error___S_is_not_the_name_of_a_va, next_thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                {
                    SubLObject cdolist_list_var = reuse_specs;
                    SubLObject reuse_spec = NIL;
                    for (reuse_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reuse_spec = cdolist_list_var.first()) {
                        {
                            SubLObject item = read_from_string_ignoring_errors(reuse_spec, NIL, $EOF, UNPROVIDED, UNPROVIDED);
                            SubLObject datum = item;
                            SubLObject current = datum;
                            SubLObject position = NIL;
                            SubLObject thesaurus_name = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            position = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            thesaurus_name = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
                                    if (NIL != constant_handles.valid_constant(thesaurus, UNPROVIDED)) {
                                        set_aref(reuse_thesauri, position, thesaurus);
                                    } else {
                                        return html_thesaurus.tm_error($str_alt78$Error___S_is_not_the_name_of_a_va, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt80);
                            }
                        }
                    }
                }
                if (NIL != next_thesaurus) {
                    set_aref(reuse_thesauri, next_position, next_thesaurus);
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title);
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
                                    html_utilities.html_princ(title);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(title);
                                    html_thesaurus.thesaurus_heading($str_alt66$tm_handle_concept_reuse);
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
                                            html_utilities.html_hidden_input($str_alt66$tm_handle_concept_reuse, T, UNPROVIDED);
                                            html_utilities.html_hidden_input($$$thesaurus, load_thesaurus_name, UNPROVIDED);
                                            html_utilities.html_hidden_input($str_alt70$reuse_mode, reuse_mode, UNPROVIDED);
                                            {
                                                SubLObject vector_var = reuse_thesauri;
                                                SubLObject backwardP_var = NIL;
                                                SubLObject length = length(vector_var);
                                                SubLObject v_iteration = NIL;
                                                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                    {
                                                        SubLObject position = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                        SubLObject thesaurus = aref(vector_var, position);
                                                        html_utilities.html_hidden_input($str_alt73$reuse_thesauri, format(NIL, $str_alt81$__A__S_, position, tm_internals.thesaurus_name(thesaurus)), UNPROVIDED);
                                                    }
                                                }
                                            }
                                            if (!length(reuse_thesauri).numE(ZERO_INTEGER)) {
                                                html_utilities.html_princ($str_alt82$When_adding_new_terms_to_);
                                                html_utilities.html_princ(load_thesaurus_name);
                                                html_utilities.html_princ($str_alt83$__concepts_from_only_these_thesau);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_princ($str_alt84$They_are_shown_in_order__from_mos);
                                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                {
                                                    SubLObject vector_var = reuse_thesauri;
                                                    SubLObject backwardP_var = NIL;
                                                    SubLObject length = length(vector_var);
                                                    SubLObject v_iteration = NIL;
                                                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                        {
                                                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                            SubLObject thesaurus = aref(vector_var, element_num);
                                                            html_thesaurus.tm_link($THESAURUS, thesaurus, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                        }
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                html_utilities.html_newline(TWO_INTEGER);
                                            }
                                            {
                                                SubLObject next = add(length(reuse_thesauri), ONE_INTEGER);
                                                SubLObject candidates = NIL;
                                                candidates = remove(load_thesaurus, tm_internals.all_thesauri(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                {
                                                    SubLObject vector_var = reuse_thesauri;
                                                    SubLObject backwardP_var = NIL;
                                                    SubLObject length = length(vector_var);
                                                    SubLObject v_iteration = NIL;
                                                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                        {
                                                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                            SubLObject thesaurus = aref(vector_var, element_num);
                                                            candidates = remove(thesaurus, candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    }
                                                }
                                                html_utilities.html_princ($str_alt86$Select_the_);
                                                html_utilities.html_princ(pph_methods_formulas.ordinal_form(next));
                                                html_utilities.html_princ($str_alt87$_thesaurus_to_prefer_for_concept_);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_thesaurus.tm_thesaurus_selection(candidates, NIL, $str_alt74$next_thesaurus, UNPROVIDED);
                                            }
                                            html_utilities.html_newline(TWO_INTEGER);
                                            html_utilities.html_submit_input($str_alt88$Append_this_thesaurus_to_the_reus, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_newline(UNPROVIDED);
                                            html_utilities.html_submit_input($str_alt89$Don_t_add_another__add_the_new_te, $str_alt75$do_adds, UNPROVIDED);
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
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
            }
            return NIL;
        }
    }

    public static final SubLObject tm_set_reuse_mode_and_perform_adds(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus_name = html_utilities.html_extract_input($$$thesaurus, args);
                SubLObject reuse_mode_string = html_utilities.html_extract_input($str_alt70$reuse_mode, args);
                SubLObject reuse_specs = html_utilities.html_extract_input_values($str_alt73$reuse_thesauri, args);
                SubLObject thesaurus = NIL;
                SubLObject reuse_mode = NIL;
                SubLObject reuse_thesauri = NIL;
                SubLObject temp = NIL;
                if (!thesaurus_name.isString()) {
                    return html_thesaurus.tm_error($str_alt91$The_thesaurus_is_not_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
                if (NIL == tm_internals.thesaurusP(thesaurus)) {
                    return html_thesaurus.tm_error($str_alt34$Could_not_find_a_thesaurus_named_, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (reuse_mode_string.isString()) {
                    reuse_mode = string_utilities.keyword_from_string(Strings.string_upcase(reuse_mode_string, UNPROVIDED, UNPROVIDED));
                } else {
                    reuse_mode = $NONE;
                }
                if (NIL == subl_promotions.memberP(reuse_mode, $list_alt93, UNPROVIDED, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt94$Unknown_reuse_mode__S, reuse_mode, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject cdolist_list_var = reuse_specs;
                    SubLObject reuse_spec = NIL;
                    for (reuse_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reuse_spec = cdolist_list_var.first()) {
                        {
                            SubLObject item = read_from_string_ignoring_errors(reuse_spec, NIL, $EOF, UNPROVIDED, UNPROVIDED);
                            SubLObject datum = item;
                            SubLObject current = datum;
                            SubLObject position = NIL;
                            SubLObject thesaurus_name_39 = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            position = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt80);
                            thesaurus_name_39 = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject thesaurus_40 = tm_internals.thesaurus_constant_from_name(thesaurus_name_39);
                                    if (NIL != constant_handles.valid_constant(thesaurus_40, UNPROVIDED)) {
                                        temp = cons(list(position, thesaurus_40), temp);
                                    } else {
                                        return html_thesaurus.tm_error($str_alt78$Error___S_is_not_the_name_of_a_va, thesaurus_name_39, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt80);
                            }
                        }
                    }
                }
                temp = Sort.sort(temp, symbol_function($sym95$_), symbol_function(FIRST));
                reuse_thesauri = Mapping.mapcar(symbol_function(SECOND), temp);
                {
                    SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
                    SubLObject reuse_info = reuse_mode;
                    if (reuse_info == $PRIORITY) {
                        reuse_info = list($PRIORITY, reuse_thesauri);
                    }
                    {
                        SubLObject lock = tm_io.$tm_update_load_state_lock$.getDynamicValue(thread);
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock);
                            tm_io.$tm_update_load_state$.setDynamicValue(remove(thesaurus, tm_io.$tm_update_load_state$.getDynamicValue(thread), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            load_state = nsubstitute(reuse_info, $UNKNOWN, load_state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            tm_io.$tm_update_load_state$.setDynamicValue(cons(load_state, tm_io.$tm_update_load_state$.getDynamicValue(thread)), thread);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock);
                            }
                        }
                    }
                }
                return tm_decide_update_load_changes_internal(thesaurus, UNPROVIDED);
            }
        }
    }

    /**
     * Remove BATCH-SIZE entries from TABLE, store a list of (key value)
     * duples on the user vector, and return that list.
     */
    public static final SubLObject tm_update_check_out_changes(SubLObject table, SubLObject thesaurus, SubLObject type, SubLObject batch_size) {
        if (batch_size == UNPROVIDED) {
            batch_size = $tm_update_change_increment$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject changes = NIL;
                SubLObject lock = tm_io.$tm_update_load_state_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    tm_update_check_in_changes();
                    {
                        SubLObject catch_var = NIL;
                        try {
                            {
                                SubLObject key = NIL;
                                SubLObject val = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(table);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            key = getEntryKey(cdohash_entry);
                                            val = getEntryValue(cdohash_entry);
                                            changes = cons(list(key, val), changes);
                                            remhash(key, table);
                                            if (length(changes).numGE(batch_size)) {
                                                utilities_macros.mapping_finished();
                                            }
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                        }
                    }
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_CHANGES, changes, UNPROVIDED);
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_THESAURUS, thesaurus, UNPROVIDED);
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_TYPE, type, UNPROVIDED);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return changes;
            }
        }
    }

    public static final SubLObject tm_update_table_for_thesaurus_type(SubLObject thesaurus, SubLObject type) {
        {
            SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
            SubLObject table = NIL;
            if (((NIL != load_state) && (NIL != thesaurus)) && (NIL != type)) {
                {
                    SubLObject datum = load_state;
                    SubLObject current = datum;
                    SubLObject thes = NIL;
                    SubLObject new_term_hash = NIL;
                    SubLObject additions_hash = NIL;
                    SubLObject deletions_hash = NIL;
                    SubLObject concept_reuse_info = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    thes = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    new_term_hash = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    additions_hash = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    deletions_hash = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    concept_reuse_info = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = type;
                            if (pcase_var.eql($NEW)) {
                                table = new_term_hash;
                            } else
                                if (pcase_var.eql($OLD)) {
                                    table = additions_hash;
                                } else
                                    if (pcase_var.eql($DELETE)) {
                                        table = deletions_hash;
                                    } else {
                                        Errors.error($str_alt106$Unknown_type_for_TM_UPDATE_TABLE_);
                                    }


                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt104);
                    }
                }
            }
            return table;
        }
    }

    public static final SubLObject tm_update_table_emptyP(SubLObject thesaurus, SubLObject type) {
        {
            SubLObject table = tm_update_table_for_thesaurus_type(thesaurus, type);
            return makeBoolean((NIL == table) || (hash_table_count(table) == ZERO_INTEGER));
        }
    }

    public static final SubLObject tm_update_changes_checked_outP(SubLObject thesaurus, SubLObject type) {
        {
            SubLObject users_with_checked_out_changes = NIL;
            SubLObject cdolist_list_var = tm_datastructures.$tm_state$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject user = pair.first();
                    SubLObject changes = tm_datastructures.tm_value(user, $UPDATE_LOAD_CHANGES);
                    if (((NIL != changes) && (thesaurus == tm_datastructures.tm_value(user, $UPDATE_LOAD_THESAURUS))) && (type == tm_datastructures.tm_value(user, $UPDATE_LOAD_TYPE))) {
                        {
                            SubLObject item_var = user;
                            if (NIL == member(item_var, users_with_checked_out_changes, symbol_function(EQL), symbol_function(IDENTITY))) {
                                users_with_checked_out_changes = cons(item_var, users_with_checked_out_changes);
                            }
                        }
                    }
                }
            }
            return users_with_checked_out_changes;
        }
    }

    public static final SubLObject tm_update_clear_table_from_load_state(SubLObject thesaurus, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = tm_io.$tm_update_load_state_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject table = tm_update_table_for_thesaurus_type(thesaurus, type);
                        SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
                        if (table.isHashtable()) {
                            clrhash(table);
                            tm_io.$tm_update_load_state$.setDynamicValue(remove(thesaurus, tm_io.$tm_update_load_state$.getDynamicValue(thread), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            load_state = nsubstitute(NIL, table, load_state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            tm_io.$tm_update_load_state$.setDynamicValue(cons(load_state, tm_io.$tm_update_load_state$.getDynamicValue(thread)), thread);
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return tm_io.$tm_update_load_state$.getDynamicValue(thread);
        }
    }

    public static final SubLObject tm_update_check_in_changes() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_CHANGES)) {
                {
                    SubLObject lock = tm_io.$tm_update_load_state_lock$.getDynamicValue(thread);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        {
                            SubLObject changes = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_CHANGES);
                            SubLObject thesaurus = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_THESAURUS);
                            SubLObject type = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_TYPE);
                            SubLObject table = tm_update_table_for_thesaurus_type(thesaurus, type);
                            if ((NIL != table) && (NIL != changes)) {
                                {
                                    SubLObject cdolist_list_var = changes;
                                    SubLObject change = NIL;
                                    for (change = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , change = cdolist_list_var.first()) {
                                        {
                                            SubLObject datum = change;
                                            SubLObject current = datum;
                                            SubLObject key = NIL;
                                            SubLObject val = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt107);
                                            key = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt107);
                                            val = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                sethash(key, table, val);
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt107);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_CHANGES, NIL, UNPROVIDED);
                        tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_THESAURUS, NIL, UNPROVIDED);
                        tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_TYPE, NIL, UNPROVIDED);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_report_no_load_state(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$No_Update_Load_State_Found);
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
                            SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$No_Update_Load_State_Found);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$No_Update_Load_State_Found);
                                html_thesaurus.thesaurus_heading($str_alt109$tm_report_no_load_state);
                                html_utilities.html_princ($str_alt110$No_Update_Load_state_information_);
                                html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                html_utilities.html_princ($str_alt111$___Perhaps_you_submitted_a_stale_);
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
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

    public static final SubLObject tm_present_update_additions(SubLObject load_state, SubLObject type, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title = NIL;
                SubLObject subtitle = NIL;
                SubLObject table = NIL;
                SubLObject datum = load_state;
                SubLObject current = datum;
                SubLObject thesaurus = NIL;
                SubLObject new_term_hash = NIL;
                SubLObject additions_hash = NIL;
                SubLObject deletions_hash = NIL;
                SubLObject concept_reuse_info = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt112);
                thesaurus = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt112);
                new_term_hash = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt112);
                additions_hash = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt112);
                deletions_hash = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt112);
                concept_reuse_info = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = type;
                        if (pcase_var.eql($NEW)) {
                            title = $$$Decide_Update_Load_Term_Additions;
                            subtitle = $$$New_Terms;
                            table = new_term_hash;
                        } else
                            if (pcase_var.eql($OLD)) {
                                title = $$$Decide_Update_Load_Fact_Additions;
                                subtitle = $$$Terms_with_New_Thesaurus_Facts;
                                table = additions_hash;
                            } else {
                                Errors.error($str_alt117$Unknown_type_for_TM_PRESENT_UPDAT);
                            }

                    }
                    tm_update_check_in_changes();
                    {
                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title);
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
                                    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ(title);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event(title);
                                        if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                            html_utilities.html_princ($str_alt8$Sorry__you_do_not_have_permission);
                                        } else {
                                            html_thesaurus.thesaurus_heading($str_alt118$tm_handle_update_additions);
                                            if (NIL != message) {
                                                html_utilities.html_princ(message);
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                            }
                                            {
                                                SubLObject number_of_additions = hash_table_count(table);
                                                SubLObject thesaurus_id = cb_utilities.cb_fort_identifier(thesaurus);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ(subtitle);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_princ($str_alt119$There_are_);
                                                if (number_of_additions.numG(ZERO_INTEGER)) {
                                                    html_utilities.html_princ(number_of_additions);
                                                } else {
                                                    html_utilities.html_princ($$$no);
                                                }
                                                html_utilities.html_princ($str_alt121$_remaining_);
                                                html_utilities.html_princ(subtitle);
                                                html_utilities.html_princ($str_alt122$_proposed_for_addition_to_);
                                                html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                                html_utilities.html_princ($str_alt123$_);
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                if (number_of_additions.numG(ZERO_INTEGER)) {
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt125$tm_update_view_additions__a__a, thesaurus_id, string_utilities.string_from_keyword(type));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt126$View_all_proposed_additions_);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    html_utilities.html_br();
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt127$tm_update_add_all__a__a, thesaurus_id, string_utilities.string_from_keyword(type));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt128$Make_all_proposed_additions_);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    html_utilities.html_br();
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt129$tm_update_add_none__a__a, thesaurus_id, string_utilities.string_from_keyword(type));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt130$Clear_them_all_without_adding_);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    html_utilities.html_br();
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt131$tm_update_add_incremental__a__a, thesaurus_id, string_utilities.string_from_keyword(type));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt132$Verify_each_proposed_addition_);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    html_utilities.html_br();
                                                    html_utilities.html_br();
                                                } else {
                                                    {
                                                        SubLObject users = tm_update_changes_checked_outP(thesaurus, type);
                                                        if (NIL != users) {
                                                            if (length(users).numG(ONE_INTEGER)) {
                                                                html_utilities.html_princ($str_alt133$However__these_users_have_);
                                                            } else {
                                                                html_utilities.html_princ($str_alt134$However__this_user_has_);
                                                            }
                                                            if (type == $NEW) {
                                                                html_utilities.html_princ($str_alt135$New_Term_additions_pending_for_);
                                                            } else {
                                                                html_utilities.html_princ($str_alt136$New_Fact_additions_pending_for_);
                                                            }
                                                            html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                                            html_utilities.html_princ($str_alt137$_);
                                                            html_utilities.html_br();
                                                            html_utilities.html_indent(FOUR_INTEGER);
                                                            html_utilities.html_princ(string_utilities.stringify_items(users, symbol_function(IDENTITY), $str_alt138$__, $str_alt139$_and_));
                                                            html_utilities.html_br();
                                                            html_utilities.html_princ($str_alt140$These_decisions_must_be_concluded);
                                                        } else {
                                                            tm_update_clear_table_from_load_state(thesaurus, type);
                                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt141$tm_decide_update_load_changes__a, thesaurus_id);
                                                            if (type == $NEW) {
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt142$__a, $OLD);
                                                            }
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($$$Continue);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                            html_utilities.html_br();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        html_thesaurus.tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
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
                    cdestructuring_bind_error(datum, $list_alt112);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_update_view_additions(SubLObject args) {
        return tm_update_parse_and_dispatch_changes(args, $ADD_VIEW);
    }

    public static final SubLObject tm_update_add_none(SubLObject args) {
        return tm_update_parse_and_dispatch_changes(args, $ADD_NONE);
    }

    public static final SubLObject tm_update_add_all(SubLObject args) {
        return tm_update_parse_and_dispatch_changes(args, $ADD_ALL);
    }

    public static final SubLObject tm_update_add_incremental(SubLObject args) {
        return tm_update_parse_and_dispatch_changes(args, $ADD_INCREMENTAL);
    }

    public static final SubLObject tm_print_assertion_spec(SubLObject assertion_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = assertion_spec.first();
                SubLObject rel_symbol = tm_internals.tm_pred_arg_symbol(predicate, ONE_INTEGER);
                SubLObject arg1 = second(assertion_spec);
                SubLObject arg2 = third(assertion_spec);
                SubLObject arg1_type = tm_internals.tm_relation_argtype(predicate, ONE_INTEGER);
                SubLObject arg2_type = tm_internals.tm_relation_argtype(predicate, TWO_INTEGER);
                SubLObject pcase_var = arg1_type;
                if (pcase_var.eql($CONSTANT)) {
                    {
                        SubLObject pcase_var_52 = arg2_type;
                        if (pcase_var_52.eql($CONSTANT)) {
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt149$__a___a___a_, new SubLObject[]{ arg1, rel_symbol, arg2 });
                        } else
                            if (pcase_var_52.eql($STRING)) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt151$__a___a__s, new SubLObject[]{ arg1, rel_symbol, arg2 });
                            }

                    }
                } else
                    if (pcase_var.eql($STRING)) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt152$_s__a___a_, new SubLObject[]{ arg1, rel_symbol, arg2 });
                    }

            }
            return NIL;
        }
    }

    public static final SubLObject tm_update_view_additions_internal(SubLObject thesaurus, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
                if (NIL == load_state) {
                    return tm_report_no_load_state(thesaurus);
                } else {
                    {
                        SubLObject datum = load_state;
                        SubLObject current = datum;
                        SubLObject thes = NIL;
                        SubLObject new_term_hash = NIL;
                        SubLObject additions_hash = NIL;
                        SubLObject deletions_hash = NIL;
                        SubLObject concept_reuse_info = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt104);
                        thes = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt104);
                        new_term_hash = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt104);
                        additions_hash = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt104);
                        deletions_hash = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt104);
                        concept_reuse_info = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject thesaurus_id = cb_utilities.cb_fort_identifier(thesaurus);
                                SubLObject title = NIL;
                                SubLObject table = NIL;
                                SubLObject pcase_var = type;
                                if (pcase_var.eql($NEW)) {
                                    title = cconcatenate($str_alt153$New_Terms_proposed_for_, tm_internals.thesaurus_name(thesaurus));
                                    table = new_term_hash;
                                } else
                                    if (pcase_var.eql($OLD)) {
                                        title = cconcatenate($str_alt154$Additions_to_existing_terms_propo, tm_internals.thesaurus_name(thesaurus));
                                        table = additions_hash;
                                    } else {
                                        Errors.error($str_alt155$Unknown_type_for_TM_UPDATE_VIEW_A);
                                    }

                                {
                                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                    html_macros.html_head_content_type();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                    html_utilities.html_princ(title);
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
                                                SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    }
                                                    html_utilities.html_princ(title);
                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_utilities.html_markup(ONE_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    tm_logging.tm_enqueue_event(title);
                                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                                        html_utilities.html_princ($str_alt8$Sorry__you_do_not_have_permission);
                                                    } else {
                                                        html_thesaurus.thesaurus_heading($str_alt156$tm_update_view_additions_internal);
                                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt157$tm_update_add_all__A__A, thesaurus_id, string_utilities.string_from_keyword(type));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt128$Make_all_proposed_additions_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                        html_utilities.html_br();
                                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt158$tm_update_add_none__a__A, thesaurus_id, string_utilities.string_from_keyword(type));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt130$Clear_them_all_without_adding_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                        html_utilities.html_br();
                                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt159$tm_update_add_incremental__A__A, thesaurus_id, string_utilities.string_from_keyword(type));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt132$Verify_each_proposed_addition_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                        {
                                                            SubLObject table_var = table;
                                                            utilities_macros.$progress_note$.setDynamicValue($$$Printing_assertion_specs, thread);
                                                            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                                            utilities_macros.$progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                                                            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                                            {
                                                                SubLObject _prev_bind_0_59 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                                                try {
                                                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                                                    {
                                                                        SubLObject pt_string = NIL;
                                                                        SubLObject assertion_specs = NIL;
                                                                        {
                                                                            final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                                                            try {
                                                                                while (iteratorHasNext(cdohash_iterator)) {
                                                                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                                    pt_string = getEntryKey(cdohash_entry);
                                                                                    assertion_specs = getEntryValue(cdohash_entry);
                                                                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                                    html_utilities.html_br();
                                                                                    html_utilities.html_br();
                                                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                    html_utilities.html_princ(pt_string);
                                                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                    {
                                                                                        SubLObject cdolist_list_var = assertion_specs;
                                                                                        SubLObject assertion_spec = NIL;
                                                                                        for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_spec = cdolist_list_var.first()) {
                                                                                            html_utilities.html_br();
                                                                                            tm_print_assertion_spec(assertion_spec);
                                                                                        }
                                                                                    }
                                                                                } 
                                                                            } finally {
                                                                                releaseEntrySetIterator(cdohash_iterator);
                                                                            }
                                                                        }
                                                                    }
                                                                    utilities_macros.noting_percent_progress_postamble();
                                                                } finally {
                                                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_59, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    html_thesaurus.tm_footer();
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
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
                        } else {
                            cdestructuring_bind_error(datum, $list_alt104);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_update_add_none_internal(SubLObject thesaurus, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
                SubLObject title = NIL;
                if (NIL == load_state) {
                    return tm_report_no_load_state(thesaurus);
                } else {
                    {
                        SubLObject pcase_var = type;
                        if (pcase_var.eql($NEW)) {
                            title = cconcatenate($str_alt161$New_Terms_cleared_for_, tm_internals.thesaurus_name(thesaurus));
                        } else
                            if (pcase_var.eql($OLD)) {
                                title = cconcatenate($str_alt162$Additions_to_existing_terms_clear, tm_internals.thesaurus_name(thesaurus));
                            } else {
                                Errors.error($str_alt163$Unknown_type_for_TM_UPDATE_ADD_NO);
                            }

                    }
                    tm_update_check_in_changes();
                    tm_update_clear_table_from_load_state(thesaurus, type);
                    {
                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title);
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
                                    SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ(title);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event(title);
                                        if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                            html_utilities.html_princ($str_alt8$Sorry__you_do_not_have_permission);
                                        } else {
                                            html_thesaurus.thesaurus_heading($str_alt164$tm_update_add_none_internal);
                                            {
                                                SubLObject pcase_var = type;
                                                if (pcase_var.eql($NEW)) {
                                                    html_utilities.html_princ($$$New_Term_additions);
                                                } else
                                                    if (pcase_var.eql($OLD)) {
                                                        html_utilities.html_princ($$$Additions_to_existing_terms);
                                                    }

                                            }
                                            html_utilities.html_princ($str_alt167$_proposed_by_Update_Load_have_bee);
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt141$tm_decide_update_load_changes__a, cb_utilities.cb_fort_identifier(thesaurus));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt168$Continue_deciding_changes_propose);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                        }
                                        html_thesaurus.tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
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

    public static final SubLObject tm_update_add_additions(SubLObject assertion_specs, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
                SubLObject reuse_info = fifth(load_state);
                SubLObject reuse_mode = NIL;
                SubLObject reuse_thesauri = NIL;
                SubLObject pcase_var = reuse_info;
                if ((pcase_var.eql($ANY) || pcase_var.eql($NONE)) || pcase_var.eql($UNIQUE)) {
                    reuse_mode = reuse_info;
                } else
                    if (pcase_var.eql($UNKNOWN)) {
                    } else {
                        if (reuse_info.first() == $PRIORITY) {
                            reuse_mode = $PRIORITY;
                            reuse_thesauri = second(reuse_info);
                        } else {
                            html_thesaurus.tm_error($str_alt171$Implementation_error__Unknown_reu, reuse_info.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }

                assertion_specs = tm_io.tm_load_construct_fi_assert_specs_with_reuse_mode_and_thesauri(assertion_specs, thesaurus, reuse_mode, reuse_thesauri);
            }
            {
                SubLObject cdolist_list_var = assertion_specs;
                SubLObject assertion_spec = NIL;
                for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_spec = cdolist_list_var.first()) {
                    tm_io.tm_load_assert(tm_internals.tm_canonicalize_gaf_strings_for_thesaurus(assertion_spec, thesaurus), thesaurus, UNPROVIDED);
                }
            }
            if (operation_queues.transcript_queue_size().numG(tm_io.$tm_load_transcript_queue_worry_size$.getDynamicValue(thread))) {
                operation_communication.save_transcript_ops();
            }
            return NIL;
        }
    }

    public static final SubLObject tm_update_add_all_internal(SubLObject thesaurus, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
                SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                if (NIL != tm_datastructures.tm_thesaurus_unwritableP(thesaurus)) {
                    {
                        SubLObject message = cconcatenate($str_alt172$Making_changes_to_thesaurus_, new SubLObject[]{ thesaurus_name, $str_alt173$_is_not_currently_permitted__beca });
                        html_thesaurus.tm_message_to_user($str_alt174$Update_Load_Additions_Not_Perform, message);
                    }
                } else {
                    if (NIL == load_state) {
                        return tm_report_no_load_state(thesaurus);
                    } else {
                        {
                            SubLObject datum = load_state;
                            SubLObject current = datum;
                            SubLObject thes = NIL;
                            SubLObject new_term_hash = NIL;
                            SubLObject additions_hash = NIL;
                            SubLObject deletions_hash = NIL;
                            SubLObject concept_reuse_info = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            thes = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            new_term_hash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            additions_hash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            deletions_hash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            concept_reuse_info = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject title = NIL;
                                    SubLObject table = NIL;
                                    {
                                        SubLObject pcase_var = type;
                                        if (pcase_var.eql($NEW)) {
                                            title = cconcatenate($str_alt175$Adding_all_New_Terms_for_, new SubLObject[]{ tm_internals.thesaurus_name(thesaurus), $str_alt176$____ });
                                            table = new_term_hash;
                                        } else
                                            if (pcase_var.eql($OLD)) {
                                                title = cconcatenate($str_alt177$Adding_all_Additions_to_existing_, new SubLObject[]{ tm_internals.thesaurus_name(thesaurus), $str_alt176$____ });
                                                table = additions_hash;
                                            } else {
                                                Errors.error($str_alt178$Unknown_type_for_TM_UPDATE_ADD_AL);
                                            }

                                    }
                                    {
                                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                        html_macros.html_head_content_type();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                        html_utilities.html_princ(title);
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
                                                        html_utilities.html_princ(title);
                                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                        html_utilities.html_markup(ONE_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        tm_logging.tm_enqueue_event(title);
                                                        if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                                            html_utilities.html_princ($str_alt8$Sorry__you_do_not_have_permission);
                                                        } else {
                                                            html_thesaurus.thesaurus_heading($str_alt179$tm_update_add_all_internal);
                                                            html_utilities.html_princ($str_alt180$All_additions_of_);
                                                            {
                                                                SubLObject pcase_var = type;
                                                                if (pcase_var.eql($NEW)) {
                                                                    html_utilities.html_princ($$$new_terms);
                                                                } else
                                                                    if (pcase_var.eql($OLD)) {
                                                                        html_utilities.html_princ($$$thesaurus_facts_to_existing_terms);
                                                                    }

                                                            }
                                                            html_utilities.html_princ($str_alt183$_proposed_by_Update_Load_are_now_);
                                                            html_utilities.html_br();
                                                            html_utilities.html_br();
                                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt141$tm_decide_update_load_changes__a, cb_utilities.cb_fort_identifier(thesaurus));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt168$Continue_deciding_changes_propose);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                            html_utilities.html_br();
                                                            html_utilities.html_br();
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
                                    html_utilities.html_flush();
                                    {
                                        SubLObject table_var = table;
                                        utilities_macros.$progress_note$.setDynamicValue(title, thread);
                                        utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                        utilities_macros.$progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                        {
                                            SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                                {
                                                    SubLObject pt_string = NIL;
                                                    SubLObject assertion_specs = NIL;
                                                    {
                                                        final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                                        try {
                                                            while (iteratorHasNext(cdohash_iterator)) {
                                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                pt_string = getEntryKey(cdohash_entry);
                                                                assertion_specs = getEntryValue(cdohash_entry);
                                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                tm_update_add_additions(assertion_specs, thesaurus);
                                                            } 
                                                        } finally {
                                                            releaseEntrySetIterator(cdohash_iterator);
                                                        }
                                                    }
                                                }
                                                utilities_macros.noting_percent_progress_postamble();
                                            } finally {
                                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                    tm_update_clear_table_from_load_state(thesaurus, type);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt104);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_update_add_incremental_internal(SubLObject thesaurus, SubLObject type, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
                SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                if (NIL != tm_datastructures.tm_thesaurus_unwritableP(thesaurus)) {
                    {
                        SubLObject message_68 = cconcatenate($str_alt172$Making_changes_to_thesaurus_, new SubLObject[]{ thesaurus_name, $str_alt173$_is_not_currently_permitted__beca });
                        html_thesaurus.tm_message_to_user($str_alt174$Update_Load_Additions_Not_Perform, message_68);
                    }
                } else {
                    if (NIL == load_state) {
                        return tm_report_no_load_state(thesaurus);
                    } else {
                        {
                            SubLObject datum = load_state;
                            SubLObject current = datum;
                            SubLObject thes = NIL;
                            SubLObject new_term_hash = NIL;
                            SubLObject additions_hash = NIL;
                            SubLObject deletions_hash = NIL;
                            SubLObject concept_reuse_info = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            thes = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            new_term_hash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            additions_hash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            deletions_hash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            concept_reuse_info = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject title = NIL;
                                    SubLObject table = NIL;
                                    SubLObject pcase_var = type;
                                    if (pcase_var.eql($NEW)) {
                                        title = cconcatenate($str_alt184$Verify_some_New_Term_additions_fo, new SubLObject[]{ tm_internals.thesaurus_name(thesaurus), $str_alt176$____ });
                                        table = new_term_hash;
                                    } else
                                        if (pcase_var.eql($OLD)) {
                                            title = cconcatenate($str_alt185$Verify_some_Additions_to_existing, new SubLObject[]{ tm_internals.thesaurus_name(thesaurus), $str_alt176$____ });
                                            table = additions_hash;
                                        } else {
                                            Errors.error($str_alt186$Unknown_type_for_TM_UPDATE_ADD_IN);
                                        }

                                    {
                                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                        html_macros.html_head_content_type();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                        html_utilities.html_princ(title);
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
                                                    SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                        SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                        }
                                                        html_utilities.html_princ(title);
                                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                        html_utilities.html_markup(ONE_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        tm_logging.tm_enqueue_event(title);
                                                        if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                                            html_utilities.html_princ($str_alt8$Sorry__you_do_not_have_permission);
                                                        } else {
                                                            html_thesaurus.thesaurus_heading($str_alt187$tm_update_add_incremental_interna);
                                                            if (NIL != message) {
                                                                html_utilities.html_princ(message);
                                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
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
                                                                SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_macros.$within_html_form$.bind(T, thread);
                                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                    html_utilities.html_hidden_input($str_alt188$tm_delay_add_incremental, T, UNPROVIDED);
                                                                    html_utilities.html_submit_input($$$Wait_and_do_nothing_now, UNPROVIDED, UNPROVIDED);
                                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                } finally {
                                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
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
                                                                SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_macros.$within_html_form$.bind(T, thread);
                                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                    html_utilities.html_hidden_input($str_alt190$tm_handle_add_incremental, T, UNPROVIDED);
                                                                    {
                                                                        SubLObject additions = tm_update_check_out_changes(table, thesaurus, type, UNPROVIDED);
                                                                        SubLObject addition_number = ZERO_INTEGER;
                                                                        SubLObject cdolist_list_var = additions;
                                                                        SubLObject addition = NIL;
                                                                        for (addition = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , addition = cdolist_list_var.first()) {
                                                                            {
                                                                                SubLObject datum_74 = addition;
                                                                                SubLObject current_75 = datum_74;
                                                                                SubLObject pt_string = NIL;
                                                                                SubLObject assertion_specs = NIL;
                                                                                destructuring_bind_must_consp(current_75, datum_74, $list_alt191);
                                                                                pt_string = current_75.first();
                                                                                current_75 = current_75.rest();
                                                                                destructuring_bind_must_consp(current_75, datum_74, $list_alt191);
                                                                                assertion_specs = current_75.first();
                                                                                current_75 = current_75.rest();
                                                                                if (NIL == current_75) {
                                                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                    html_utilities.html_princ(pt_string);
                                                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                    html_utilities.html_br();
                                                                                    {
                                                                                        SubLObject fact_number = ZERO_INTEGER;
                                                                                        html_utilities.html_radio_input(format(NIL, $str_alt192$add__a, addition_number), $$$no, UNPROVIDED);
                                                                                        html_utilities.html_princ($str_alt193$__Don_t_add_these_facts);
                                                                                        html_utilities.html_br();
                                                                                        html_utilities.html_radio_input(format(NIL, $str_alt192$add__a, addition_number), $$$all, T);
                                                                                        html_utilities.html_princ($str_alt195$__Add_these_facts);
                                                                                        html_utilities.html_br();
                                                                                        html_utilities.html_radio_input(format(NIL, $str_alt192$add__a, addition_number), $$$select, UNPROVIDED);
                                                                                        html_utilities.html_princ($str_alt197$__Select_individual_facts);
                                                                                        html_utilities.html_br();
                                                                                        {
                                                                                            SubLObject cdolist_list_var_76 = assertion_specs;
                                                                                            SubLObject assertion_spec = NIL;
                                                                                            for (assertion_spec = cdolist_list_var_76.first(); NIL != cdolist_list_var_76; cdolist_list_var_76 = cdolist_list_var_76.rest() , assertion_spec = cdolist_list_var_76.first()) {
                                                                                                html_utilities.html_indent(SIX_INTEGER);
                                                                                                html_utilities.html_checkbox_input(format(NIL, $str_alt198$fact__a, addition_number), fact_number, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                html_utilities.html_indent(TWO_INTEGER);
                                                                                                tm_print_assertion_spec(assertion_spec);
                                                                                                html_utilities.html_br();
                                                                                                fact_number = add(fact_number, ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    cdestructuring_bind_error(datum_74, $list_alt191);
                                                                                }
                                                                            }
                                                                            addition_number = add(addition_number, ONE_INTEGER);
                                                                            html_utilities.html_br();
                                                                        }
                                                                    }
                                                                    html_utilities.html_submit_input($$$Make_Selected_Additions, UNPROVIDED, UNPROVIDED);
                                                                    html_utilities.html_reset_input(UNPROVIDED);
                                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                } finally {
                                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                        }
                                                        html_thesaurus.tm_footer();
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
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
                            } else {
                                cdestructuring_bind_error(datum, $list_alt104);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_delay_add_incremental(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_THESAURUS);
                tm_update_check_in_changes();
                tm_decide_update_load_changes_internal(thesaurus, $str_alt200$Individual_verification_has_been_);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_add_incremental(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject additions = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_CHANGES);
                SubLObject thesaurus = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_THESAURUS);
                SubLObject type = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_TYPE);
                SubLObject assertion_specs_to_assert = NIL;
                if (NIL == additions) {
                    return html_thesaurus.tm_error($str_alt202$No_changes_were_found___Perhaps_y, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject cdotimes_end_var = length(additions);
                    SubLObject count = NIL;
                    for (count = ZERO_INTEGER; count.numL(cdotimes_end_var); count = add(count, ONE_INTEGER)) {
                        {
                            SubLObject add_all_var = format(NIL, $str_alt192$add__a, count);
                            SubLObject fact_var = format(NIL, $str_alt198$fact__a, count);
                            SubLObject addP = string_utilities.keyword_from_string(Strings.string_upcase(html_utilities.html_extract_input(add_all_var, args), UNPROVIDED, UNPROVIDED));
                            SubLObject add_facts = html_utilities.html_extract_input_values(fact_var, args);
                            SubLObject addition = elt(additions, count);
                            SubLObject assertion_specs = second(addition);
                            SubLObject fact_ids = NIL;
                            SubLObject pcase_var = addP;
                            if (pcase_var.eql($NO)) {
                            } else
                                if (pcase_var.eql($ALL)) {
                                    assertion_specs_to_assert = nconc(assertion_specs, assertion_specs_to_assert);
                                } else
                                    if (pcase_var.eql($SELECT)) {
                                        fact_ids = Mapping.mapcar(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), add_facts);
                                        {
                                            SubLObject cdolist_list_var = fact_ids;
                                            SubLObject fact_id = NIL;
                                            for (fact_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fact_id = cdolist_list_var.first()) {
                                                assertion_specs_to_assert = cons(elt(assertion_specs, fact_id), assertion_specs_to_assert);
                                            }
                                        }
                                    } else {
                                        Errors.error($str_alt206$Unrecognized_ADD_VAR_value_);
                                    }


                            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_CHANGES, remove(addition, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_CHANGES), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                        }
                    }
                }
                if (NIL != assertion_specs_to_assert) {
                    tm_update_add_additions(assertion_specs_to_assert, thesaurus);
                }
                if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_CHANGES)) {
                    tm_update_check_in_changes();
                }
                if ((NIL != tm_update_table_emptyP(thesaurus, type)) && (NIL == tm_update_changes_checked_outP(thesaurus, type))) {
                    tm_update_clear_table_from_load_state(thesaurus, type);
                    {
                        SubLObject message = cconcatenate($str_alt207$All_decisions_about_, new SubLObject[]{ type == $NEW ? ((SubLObject) ($$$New_Terms)) : $$$thesaurus_fact_Additions, $str_alt209$_have_been_made_ });
                        return tm_decide_update_load_changes_internal(thesaurus, message);
                    }
                }
                {
                    SubLObject number_added = length(assertion_specs_to_assert);
                    SubLObject message = (number_added == ZERO_INTEGER) ? ((SubLObject) ($str_alt210$No_thesaurus_facts_were_added_)) : number_added == ONE_INTEGER ? ((SubLObject) ($$$One_thesaurus_fact_was_added)) : format(NIL, $str_alt212$_a_thesaurus_facts_were_added, number_added);
                    tm_update_add_incremental_internal(thesaurus, type, message);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_present_update_deletions(SubLObject load_state, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
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
                html_utilities.html_princ($$$Decide_Update_Load_Deletions);
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
                            SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$Decide_Update_Load_Deletions);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$Decide_Update_Load_Deletions);
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                    html_utilities.html_princ($str_alt8$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt215$tm_handle_update_deletions);
                                    if (NIL != message) {
                                        html_utilities.html_princ(message);
                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    }
                                    {
                                        SubLObject datum = load_state;
                                        SubLObject current = datum;
                                        SubLObject thesaurus = NIL;
                                        SubLObject new_term_hash = NIL;
                                        SubLObject additions_hash = NIL;
                                        SubLObject deletions_hash = NIL;
                                        SubLObject concept_reuse_info = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt112);
                                        thesaurus = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt112);
                                        new_term_hash = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt112);
                                        additions_hash = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt112);
                                        deletions_hash = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt112);
                                        concept_reuse_info = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            tm_update_check_in_changes();
                                            {
                                                SubLObject number_of_deletions = hash_table_count(deletions_hash);
                                                SubLObject thesaurus_id = cb_utilities.cb_fort_identifier(thesaurus);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($$$Deletions);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_princ($str_alt119$There_are_);
                                                if (number_of_deletions.numG(ZERO_INTEGER)) {
                                                    html_utilities.html_princ(number_of_deletions);
                                                } else {
                                                    html_utilities.html_princ($$$no);
                                                }
                                                html_utilities.html_princ($str_alt217$_terms_having_facts_proposed_for_);
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                if (number_of_deletions.numG(ZERO_INTEGER)) {
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt218$tm_update_view_deletions__a, thesaurus_id);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt219$View_them_all_);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    html_utilities.html_br();
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt220$tm_update_delete_all__a, thesaurus_id);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt221$Make_all_proposed_deletions_);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    html_utilities.html_br();
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt222$tm_update_delete_none__a, thesaurus_id);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt223$Clear_the_proposal_without_deleti);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    html_utilities.html_br();
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt224$tm_update_delete_incremental__a, thesaurus_id);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt225$Verify_each_deletion_);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    html_utilities.html_br();
                                                } else {
                                                    {
                                                        SubLObject users = tm_update_changes_checked_outP(thesaurus, $DELETE);
                                                        if (NIL != users) {
                                                            if (length(users).numG(ONE_INTEGER)) {
                                                                html_utilities.html_princ($str_alt133$However__these_users_have_);
                                                            } else {
                                                                html_utilities.html_princ($str_alt134$However__this_user_has_);
                                                            }
                                                            html_utilities.html_princ($str_alt226$Deletions_pending_for_);
                                                            html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                                            html_utilities.html_princ($str_alt137$_);
                                                            html_utilities.html_br();
                                                            html_utilities.html_indent(FOUR_INTEGER);
                                                            html_utilities.html_princ(string_utilities.stringify_items(users, symbol_function(IDENTITY), $str_alt138$__, $str_alt139$_and_));
                                                            html_utilities.html_br();
                                                            html_utilities.html_princ($str_alt227$These_decisions_must_be_concluded);
                                                        } else {
                                                            tm_update_clear_table_from_load_state(thesaurus, $DELETE);
                                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt141$tm_decide_update_load_changes__a, thesaurus_id);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($$$Continue);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                            html_utilities.html_br();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt112);
                                        }
                                    }
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
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

    public static final SubLObject tm_update_view_deletions(SubLObject args) {
        return tm_update_parse_and_dispatch_changes(args, $DELETE_VIEW);
    }

    public static final SubLObject tm_update_delete_all(SubLObject args) {
        return tm_update_parse_and_dispatch_changes(args, $DELETE_ALL);
    }

    public static final SubLObject tm_update_delete_none(SubLObject args) {
        return tm_update_parse_and_dispatch_changes(args, $DELETE_NONE);
    }

    public static final SubLObject tm_update_delete_incremental(SubLObject args) {
        return tm_update_parse_and_dispatch_changes(args, $DELETE_INCREMENTAL);
    }

    public static final SubLObject tm_update_view_deletions_internal(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
                if (NIL == load_state) {
                    return tm_report_no_load_state(thesaurus);
                } else {
                    {
                        SubLObject datum = load_state;
                        SubLObject current = datum;
                        SubLObject thes = NIL;
                        SubLObject new_term_hash = NIL;
                        SubLObject additions_hash = NIL;
                        SubLObject deletions_hash = NIL;
                        SubLObject concept_reuse_info = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt104);
                        thes = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt104);
                        new_term_hash = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt104);
                        additions_hash = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt104);
                        deletions_hash = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt104);
                        concept_reuse_info = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject thesaurus_id = cb_utilities.cb_fort_identifier(thesaurus);
                                SubLObject title = cconcatenate($str_alt232$Thesaurus_facts_proposed_for_dele, tm_internals.thesaurus_name(thesaurus));
                                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                html_macros.html_head_content_type();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_utilities.html_princ(title);
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
                                            SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                }
                                                html_utilities.html_princ(title);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(ONE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                tm_logging.tm_enqueue_event(title);
                                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                                    html_utilities.html_princ($str_alt8$Sorry__you_do_not_have_permission);
                                                } else {
                                                    html_thesaurus.thesaurus_heading($str_alt233$tm_update_view_deletions_internal);
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt234$tm_update_delete_all__A, thesaurus_id);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt221$Make_all_proposed_deletions_);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    html_utilities.html_br();
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt222$tm_update_delete_none__a, thesaurus_id);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt223$Clear_the_proposal_without_deleti);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    html_utilities.html_br();
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt235$tm_update_delete_incremental__A, thesaurus_id);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt225$Verify_each_deletion_);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    {
                                                        SubLObject table_var = deletions_hash;
                                                        utilities_macros.$progress_note$.setDynamicValue($$$Printing_deletion_assertions, thread);
                                                        utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                                        utilities_macros.$progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                                                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                                        {
                                                            SubLObject _prev_bind_0_91 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                                            try {
                                                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                                                {
                                                                    SubLObject constant = NIL;
                                                                    SubLObject assertions = NIL;
                                                                    {
                                                                        final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                                                        try {
                                                                            while (iteratorHasNext(cdohash_iterator)) {
                                                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                                constant = getEntryKey(cdohash_entry);
                                                                                assertions = getEntryValue(cdohash_entry);
                                                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                                html_utilities.html_br();
                                                                                html_utilities.html_br();
                                                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                html_tm_browsing.tm_thesaurus_constant(constant, tm_datastructures.concept_term(constant, thesaurus), NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                if (NIL != subl_promotions.memberP($$preferredTerm, assertions, symbol_function(EQL), symbol_function(GAF_ARG0))) {
                                                                                    html_utilities.html_br();
                                                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                    html_utilities.html_princ($$$Delete_this_term_entirely);
                                                                                    if (length(assertions).numG(ONE_INTEGER)) {
                                                                                        html_utilities.html_princ($str_alt240$__including_);
                                                                                    } else {
                                                                                        html_utilities.html_princ($str_alt123$_);
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                }
                                                                                {
                                                                                    SubLObject cdolist_list_var = assertions;
                                                                                    SubLObject assertion = NIL;
                                                                                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                                                                        if ((NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) && (assertions_high.gaf_arg0(assertion) != $$preferredTerm)) {
                                                                                            html_utilities.html_br();
                                                                                            html_tm_editing.html_print_thesaurus_assertion(assertion);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } 
                                                                        } finally {
                                                                            releaseEntrySetIterator(cdohash_iterator);
                                                                        }
                                                                    }
                                                                }
                                                                utilities_macros.noting_percent_progress_postamble();
                                                            } finally {
                                                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_91, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                html_thesaurus.tm_footer();
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
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
                            cdestructuring_bind_error(datum, $list_alt104);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_update_delete_assertion(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject formula = assertions_high.assertion_formula(assertion);
                SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_3 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        api_control_vars.$the_cyclist$.bind(tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                        ans = fi.fi_unassert(formula, thesaurus);
                    } finally {
                        kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_4, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_3, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (operation_queues.transcript_queue_size().numG(tm_io.$tm_load_transcript_queue_worry_size$.getDynamicValue(thread))) {
                    operation_communication.save_transcript_ops();
                }
                return ans;
            }
        }
    }

    public static final SubLObject tm_update_delete_all_internal(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
                SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                if (NIL != tm_datastructures.tm_thesaurus_unwritableP(thesaurus)) {
                    {
                        SubLObject message = cconcatenate($str_alt172$Making_changes_to_thesaurus_, new SubLObject[]{ thesaurus_name, $str_alt173$_is_not_currently_permitted__beca });
                        html_thesaurus.tm_message_to_user($str_alt241$Update_Load_Deletions_Not_Perform, message);
                    }
                } else {
                    if (NIL == load_state) {
                        return tm_report_no_load_state(thesaurus);
                    } else {
                        {
                            SubLObject datum = load_state;
                            SubLObject current = datum;
                            SubLObject thes = NIL;
                            SubLObject new_term_hash = NIL;
                            SubLObject additions_hash = NIL;
                            SubLObject deletions_hash = NIL;
                            SubLObject concept_reuse_info = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            thes = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            new_term_hash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            additions_hash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            deletions_hash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            concept_reuse_info = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject title = cconcatenate($str_alt242$Deleting_all_proposed_deletions_f, tm_internals.thesaurus_name(thesaurus));
                                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                    html_macros.html_head_content_type();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                    html_utilities.html_princ(title);
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
                                                SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                    SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    }
                                                    html_utilities.html_princ(title);
                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_utilities.html_markup(ONE_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    tm_logging.tm_enqueue_event(title);
                                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                                        html_utilities.html_princ($str_alt8$Sorry__you_do_not_have_permission);
                                                    } else {
                                                        html_thesaurus.thesaurus_heading($str_alt243$tm_update_delete_all_internal);
                                                        html_utilities.html_princ($str_alt244$All_deletions_proposed_by_Update_);
                                                        html_utilities.html_br();
                                                        html_utilities.html_br();
                                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt141$tm_decide_update_load_changes__a, cb_utilities.cb_fort_identifier(thesaurus));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt168$Continue_deciding_changes_propose);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                        html_utilities.html_br();
                                                        html_utilities.html_br();
                                                    }
                                                    html_thesaurus.tm_footer();
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
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
                                    html_utilities.html_flush();
                                    {
                                        SubLObject table_var = deletions_hash;
                                        utilities_macros.$progress_note$.setDynamicValue(title, thread);
                                        utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                        utilities_macros.$progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                        {
                                            SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                                {
                                                    SubLObject constant = NIL;
                                                    SubLObject assertions = NIL;
                                                    {
                                                        final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                                        try {
                                                            while (iteratorHasNext(cdohash_iterator)) {
                                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                constant = getEntryKey(cdohash_entry);
                                                                assertions = getEntryValue(cdohash_entry);
                                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                {
                                                                    SubLObject cdolist_list_var = assertions;
                                                                    SubLObject assertion = NIL;
                                                                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                                                        if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                                                            tm_update_delete_assertion(assertion);
                                                                        }
                                                                    }
                                                                }
                                                            } 
                                                        } finally {
                                                            releaseEntrySetIterator(cdohash_iterator);
                                                        }
                                                    }
                                                }
                                                utilities_macros.noting_percent_progress_postamble();
                                            } finally {
                                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                    tm_update_clear_table_from_load_state(thesaurus, $DELETE);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt104);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_update_delete_none_internal(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
                if (NIL == load_state) {
                    return tm_report_no_load_state(thesaurus);
                }
            }
            tm_update_clear_table_from_load_state(thesaurus, $DELETE);
            {
                SubLObject title = cconcatenate($str_alt245$Deletions_cleared_for_, tm_internals.thesaurus_name(thesaurus));
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(title);
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
                            SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(title);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(title);
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                    html_utilities.html_princ($str_alt8$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt246$tm_update_delete_none_internal);
                                    html_utilities.html_princ($str_alt247$All_deletions_proposed_by_Update_);
                                    html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                    html_utilities.html_princ($str_alt248$_have_been_cleared_without_perfor);
                                    html_utilities.html_br();
                                    html_utilities.html_br();
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt141$tm_decide_update_load_changes__a, cb_utilities.cb_fort_identifier(thesaurus));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt168$Continue_deciding_changes_propose);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    html_utilities.html_br();
                                    html_utilities.html_br();
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
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

    public static final SubLObject tm_update_delete_incremental_internal(SubLObject thesaurus, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject load_state = tm_io.tm_update_load_state_for_thesaurus(thesaurus);
                SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                if (NIL != tm_datastructures.tm_thesaurus_unwritableP(thesaurus)) {
                    {
                        SubLObject message_100 = cconcatenate($str_alt172$Making_changes_to_thesaurus_, new SubLObject[]{ thesaurus_name, $str_alt173$_is_not_currently_permitted__beca });
                        html_thesaurus.tm_message_to_user($str_alt241$Update_Load_Deletions_Not_Perform, message_100);
                    }
                } else {
                    if (NIL == load_state) {
                        return tm_report_no_load_state(thesaurus);
                    } else {
                        {
                            SubLObject datum = load_state;
                            SubLObject current = datum;
                            SubLObject thes = NIL;
                            SubLObject new_term_hash = NIL;
                            SubLObject additions_hash = NIL;
                            SubLObject deletions_hash = NIL;
                            SubLObject concept_reuse_info = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            thes = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            new_term_hash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            additions_hash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            deletions_hash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt104);
                            concept_reuse_info = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject title = cconcatenate($str_alt249$Verify_some_Deletions_from_, tm_internals.thesaurus_name(thesaurus));
                                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                    html_macros.html_head_content_type();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                    html_utilities.html_princ(title);
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
                                                SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                    SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    }
                                                    html_utilities.html_princ(title);
                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_utilities.html_markup(ONE_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    tm_logging.tm_enqueue_event(title);
                                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                                        html_utilities.html_princ($str_alt8$Sorry__you_do_not_have_permission);
                                                    } else {
                                                        html_thesaurus.thesaurus_heading($str_alt250$tm_update_delete_incremental_inte);
                                                        if (NIL != message) {
                                                            html_utilities.html_princ(message);
                                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
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
                                                            SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                html_utilities.html_hidden_input($str_alt251$tm_delay_delete_incremental, T, UNPROVIDED);
                                                                html_utilities.html_submit_input($$$Wait_and_do_nothing_now, UNPROVIDED, UNPROVIDED);
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_104, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
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
                                                            SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                html_utilities.html_hidden_input($str_alt252$tm_handle_delete_incremental, T, UNPROVIDED);
                                                                {
                                                                    SubLObject deletions = tm_update_check_out_changes(deletions_hash, thesaurus, $DELETE, UNPROVIDED);
                                                                    SubLObject deletion_number = ZERO_INTEGER;
                                                                    SubLObject cdolist_list_var = deletions;
                                                                    SubLObject deletion = NIL;
                                                                    for (deletion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deletion = cdolist_list_var.first()) {
                                                                        {
                                                                            SubLObject datum_106 = deletion;
                                                                            SubLObject current_107 = datum_106;
                                                                            SubLObject constant = NIL;
                                                                            SubLObject assertions = NIL;
                                                                            destructuring_bind_must_consp(current_107, datum_106, $list_alt253);
                                                                            constant = current_107.first();
                                                                            current_107 = current_107.rest();
                                                                            destructuring_bind_must_consp(current_107, datum_106, $list_alt253);
                                                                            assertions = current_107.first();
                                                                            current_107 = current_107.rest();
                                                                            if (NIL == current_107) {
                                                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                html_tm_browsing.tm_thesaurus_constant(constant, tm_datastructures.concept_term(constant, thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                html_utilities.html_br();
                                                                                {
                                                                                    SubLObject fact_number = ZERO_INTEGER;
                                                                                    SubLObject option_to_delete_ptP = member($$preferredTerm, assertions, symbol_function(EQL), symbol_function(GAF_ARG0));
                                                                                    if (NIL != option_to_delete_ptP) {
                                                                                        html_utilities.html_radio_input(format(NIL, $str_alt254$delete__a, deletion_number), $$$pt, T);
                                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                        html_utilities.html_princ($str_alt256$__Delete_this_term_entirely);
                                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                        html_utilities.html_br();
                                                                                    }
                                                                                    html_utilities.html_radio_input(format(NIL, $str_alt254$delete__a, deletion_number), $$$no, UNPROVIDED);
                                                                                    html_utilities.html_princ($str_alt257$__Don_t_delete_any_facts);
                                                                                    html_utilities.html_br();
                                                                                    {
                                                                                        SubLObject delete_count = (NIL != option_to_delete_ptP) ? ((SubLObject) (subtract(length(assertions), ONE_INTEGER))) : length(assertions);
                                                                                        if (delete_count.numG(ZERO_INTEGER)) {
                                                                                            html_utilities.html_radio_input(format(NIL, $str_alt254$delete__a, deletion_number), $$$all, makeBoolean(NIL == option_to_delete_ptP));
                                                                                            html_utilities.html_princ($str_alt258$__Delete_these_facts);
                                                                                            html_utilities.html_br();
                                                                                            html_utilities.html_radio_input(format(NIL, $str_alt254$delete__a, deletion_number), $$$select, UNPROVIDED);
                                                                                            html_utilities.html_princ($str_alt259$__Select_individual_facts_to_dele);
                                                                                            html_utilities.html_br();
                                                                                            {
                                                                                                SubLObject cdolist_list_var_108 = assertions;
                                                                                                SubLObject assertion = NIL;
                                                                                                for (assertion = cdolist_list_var_108.first(); NIL != cdolist_list_var_108; cdolist_list_var_108 = cdolist_list_var_108.rest() , assertion = cdolist_list_var_108.first()) {
                                                                                                    if (assertions_high.gaf_arg0(assertion) != $$preferredTerm) {
                                                                                                        html_utilities.html_indent(SIX_INTEGER);
                                                                                                        html_utilities.html_checkbox_input(format(NIL, $str_alt198$fact__a, deletion_number), fact_number, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        html_utilities.html_indent(TWO_INTEGER);
                                                                                                        html_tm_editing.html_print_thesaurus_assertion(assertion);
                                                                                                        html_utilities.html_br();
                                                                                                    }
                                                                                                    fact_number = add(fact_number, ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                cdestructuring_bind_error(datum_106, $list_alt253);
                                                                            }
                                                                        }
                                                                        deletion_number = add(deletion_number, ONE_INTEGER);
                                                                        html_utilities.html_br();
                                                                    }
                                                                }
                                                                html_utilities.html_submit_input($$$Make_Selected_Deletions, UNPROVIDED, UNPROVIDED);
                                                                html_utilities.html_reset_input(UNPROVIDED);
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_105, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    }
                                                    html_thesaurus.tm_footer();
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
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
                                cdestructuring_bind_error(datum, $list_alt104);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_delay_delete_incremental(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_THESAURUS);
                tm_update_check_in_changes();
                tm_decide_update_load_changes_internal(thesaurus, $str_alt200$Individual_verification_has_been_);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_delete_incremental(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject deletions = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_CHANGES);
                SubLObject thesaurus = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_THESAURUS);
                SubLObject type = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_TYPE);
                SubLObject assertions_to_unassert = NIL;
                if (NIL == deletions) {
                    return html_thesaurus.tm_error($str_alt202$No_changes_were_found___Perhaps_y, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject cdotimes_end_var = length(deletions);
                    SubLObject count = NIL;
                    for (count = ZERO_INTEGER; count.numL(cdotimes_end_var); count = add(count, ONE_INTEGER)) {
                        {
                            SubLObject delete_all_var = format(NIL, $str_alt254$delete__a, count);
                            SubLObject fact_var = format(NIL, $str_alt198$fact__a, count);
                            SubLObject deleteP = string_utilities.keyword_from_string(Strings.string_upcase(html_utilities.html_extract_input(delete_all_var, args), UNPROVIDED, UNPROVIDED));
                            SubLObject delete_facts = html_utilities.html_extract_input_values(fact_var, args);
                            SubLObject deletion = elt(deletions, count);
                            SubLObject assertions = second(deletion);
                            SubLObject fact_ids = NIL;
                            SubLObject pcase_var = deleteP;
                            if (pcase_var.eql($PT)) {
                                assertions_to_unassert = nconc(assertions, assertions_to_unassert);
                            } else
                                if (pcase_var.eql($NO)) {
                                } else
                                    if (pcase_var.eql($ALL)) {
                                        assertions_to_unassert = nconc(remove_if(symbol_function($sym263$PT_SIGN_), assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), assertions_to_unassert);
                                    } else
                                        if (pcase_var.eql($SELECT)) {
                                            fact_ids = Mapping.mapcar(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), delete_facts);
                                            {
                                                SubLObject cdolist_list_var = fact_ids;
                                                SubLObject fact_id = NIL;
                                                for (fact_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fact_id = cdolist_list_var.first()) {
                                                    assertions_to_unassert = cons(elt(assertions, fact_id), assertions_to_unassert);
                                                }
                                            }
                                        } else {
                                            Errors.error($str_alt264$Unrecognized_DELETE_VAR_value_);
                                        }



                            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_CHANGES, remove(deletion, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_CHANGES), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                        }
                    }
                }
                if (NIL != assertions_to_unassert) {
                    {
                        SubLObject cdolist_list_var = assertions_to_unassert;
                        SubLObject unassert = NIL;
                        for (unassert = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unassert = cdolist_list_var.first()) {
                            tm_update_delete_assertion(unassert);
                        }
                    }
                }
                if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UPDATE_LOAD_CHANGES)) {
                    tm_update_check_in_changes();
                }
                if ((NIL != tm_update_table_emptyP(thesaurus, type)) && (NIL == tm_update_changes_checked_outP(thesaurus, type))) {
                    tm_update_clear_table_from_load_state(thesaurus, type);
                    {
                        SubLObject message = $str_alt265$All_decisions_about_thesaurus_fac;
                        return tm_decide_update_load_changes_internal(thesaurus, message);
                    }
                }
                {
                    SubLObject number_deleted = length(assertions_to_unassert);
                    SubLObject message = (number_deleted == ZERO_INTEGER) ? ((SubLObject) ($str_alt266$No_thesaurus_facts_were_deleted_)) : number_deleted == ONE_INTEGER ? ((SubLObject) ($$$One_thesaurus_fact_was_deleted)) : format(NIL, $str_alt268$_a_thesaurus_facts_were_deleted, number_deleted);
                    tm_update_delete_incremental_internal(thesaurus, message);
                }
            }
            return NIL;
        }
    }

    /**
     * Remove existing timestamp information and set it to the current time and user.
     */
    public static final SubLObject tm_update_change_thesaurus_timestamp(SubLObject thesaurus) {
        {
            SubLObject assertions = nconc(kb_mapping.gather_gaf_arg_index(thesaurus, ONE_INTEGER, $$thesaurusLoadDate, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED), kb_mapping.gather_gaf_arg_index(thesaurus, ONE_INTEGER, $$thesaurusLoadedBy, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED));
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                {
                    SubLObject formula = assertions_high.gaf_formula(assertion);
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    tm_integrity.tm_integrity_unassert(formula, mt);
                }
            }
        }
        tm_io.tm_set_thesaurus_timestamp(thesaurus);
        return thesaurus;
    }

    public static final SubLObject tm_finish_update(SubLObject load_state) {
        {
            SubLObject thesaurus = load_state.first();
            SubLObject message = cconcatenate($str_alt272$The_Update_Load_for_, new SubLObject[]{ tm_internals.thesaurus_name(thesaurus), $str_alt273$_is_now_complete___You_should_now });
            tm_io.tm_update_load_postprocessing(thesaurus);
            tm_io.tm_clear_thesaurus_from_update_load_state(thesaurus);
            html_thesaurus.tm_message_to_user($$$Update_Load_Complete, message);
        }
        return NIL;
    }

    public static final SubLObject declare_html_tm_update_file() {
        declareFunction("tm_update_load_in_thinker", "TM-UPDATE-LOAD-IN-THINKER", 3, 0, false);
        declareFunction("tm_update_load_wrapper", "TM-UPDATE-LOAD-WRAPPER", 3, 0, false);
        declareFunction("tm_update_loadable_thesauri", "TM-UPDATE-LOADABLE-THESAURI", 0, 0, false);
        declareFunction("tm_update_load_page", "TM-UPDATE-LOAD-PAGE", 0, 1, false);
        declareFunction("tm_handle_update_load", "TM-HANDLE-UPDATE-LOAD", 1, 0, false);
        declareFunction("tm_handle_update_load_internal", "TM-HANDLE-UPDATE-LOAD-INTERNAL", 3, 0, false);
        declareFunction("tm_update_parse_and_dispatch_changes", "TM-UPDATE-PARSE-AND-DISPATCH-CHANGES", 2, 0, false);
        declareFunction("tm_decide_update_load_changes", "TM-DECIDE-UPDATE-LOAD-CHANGES", 1, 0, false);
        declareFunction("tm_decide_update_load_changes_internal", "TM-DECIDE-UPDATE-LOAD-CHANGES-INTERNAL", 1, 1, false);
        declareFunction("tm_request_concept_reuse_info", "TM-REQUEST-CONCEPT-REUSE-INFO", 1, 0, false);
        declareFunction("tm_handle_concept_reuse", "TM-HANDLE-CONCEPT-REUSE", 1, 0, false);
        declareFunction("tm_set_reuse_mode_and_perform_adds", "TM-SET-REUSE-MODE-AND-PERFORM-ADDS", 1, 0, false);
        declareFunction("tm_update_check_out_changes", "TM-UPDATE-CHECK-OUT-CHANGES", 3, 1, false);
        declareFunction("tm_update_table_for_thesaurus_type", "TM-UPDATE-TABLE-FOR-THESAURUS-TYPE", 2, 0, false);
        declareFunction("tm_update_table_emptyP", "TM-UPDATE-TABLE-EMPTY?", 2, 0, false);
        declareFunction("tm_update_changes_checked_outP", "TM-UPDATE-CHANGES-CHECKED-OUT?", 2, 0, false);
        declareFunction("tm_update_clear_table_from_load_state", "TM-UPDATE-CLEAR-TABLE-FROM-LOAD-STATE", 2, 0, false);
        declareFunction("tm_update_check_in_changes", "TM-UPDATE-CHECK-IN-CHANGES", 0, 0, false);
        declareFunction("tm_report_no_load_state", "TM-REPORT-NO-LOAD-STATE", 1, 0, false);
        declareFunction("tm_present_update_additions", "TM-PRESENT-UPDATE-ADDITIONS", 2, 1, false);
        declareFunction("tm_update_view_additions", "TM-UPDATE-VIEW-ADDITIONS", 1, 0, false);
        declareFunction("tm_update_add_none", "TM-UPDATE-ADD-NONE", 1, 0, false);
        declareFunction("tm_update_add_all", "TM-UPDATE-ADD-ALL", 1, 0, false);
        declareFunction("tm_update_add_incremental", "TM-UPDATE-ADD-INCREMENTAL", 1, 0, false);
        declareFunction("tm_print_assertion_spec", "TM-PRINT-ASSERTION-SPEC", 1, 0, false);
        declareFunction("tm_update_view_additions_internal", "TM-UPDATE-VIEW-ADDITIONS-INTERNAL", 2, 0, false);
        declareFunction("tm_update_add_none_internal", "TM-UPDATE-ADD-NONE-INTERNAL", 2, 0, false);
        declareFunction("tm_update_add_additions", "TM-UPDATE-ADD-ADDITIONS", 2, 0, false);
        declareFunction("tm_update_add_all_internal", "TM-UPDATE-ADD-ALL-INTERNAL", 2, 0, false);
        declareFunction("tm_update_add_incremental_internal", "TM-UPDATE-ADD-INCREMENTAL-INTERNAL", 2, 1, false);
        declareFunction("tm_delay_add_incremental", "TM-DELAY-ADD-INCREMENTAL", 0, 1, false);
        declareFunction("tm_handle_add_incremental", "TM-HANDLE-ADD-INCREMENTAL", 1, 0, false);
        declareFunction("tm_present_update_deletions", "TM-PRESENT-UPDATE-DELETIONS", 1, 1, false);
        declareFunction("tm_update_view_deletions", "TM-UPDATE-VIEW-DELETIONS", 1, 0, false);
        declareFunction("tm_update_delete_all", "TM-UPDATE-DELETE-ALL", 1, 0, false);
        declareFunction("tm_update_delete_none", "TM-UPDATE-DELETE-NONE", 1, 0, false);
        declareFunction("tm_update_delete_incremental", "TM-UPDATE-DELETE-INCREMENTAL", 1, 0, false);
        declareFunction("tm_update_view_deletions_internal", "TM-UPDATE-VIEW-DELETIONS-INTERNAL", 1, 0, false);
        declareFunction("tm_update_delete_assertion", "TM-UPDATE-DELETE-ASSERTION", 1, 0, false);
        declareFunction("tm_update_delete_all_internal", "TM-UPDATE-DELETE-ALL-INTERNAL", 1, 0, false);
        declareFunction("tm_update_delete_none_internal", "TM-UPDATE-DELETE-NONE-INTERNAL", 1, 0, false);
        declareFunction("tm_update_delete_incremental_internal", "TM-UPDATE-DELETE-INCREMENTAL-INTERNAL", 1, 1, false);
        declareFunction("tm_delay_delete_incremental", "TM-DELAY-DELETE-INCREMENTAL", 0, 1, false);
        declareFunction("tm_handle_delete_incremental", "TM-HANDLE-DELETE-INCREMENTAL", 1, 0, false);
        declareFunction("tm_update_change_thesaurus_timestamp", "TM-UPDATE-CHANGE-THESAURUS-TIMESTAMP", 1, 0, false);
        declareFunction("tm_finish_update", "TM-FINISH-UPDATE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_html_tm_update_file() {
        defparameter("*TM-UPDATE-CHANGE-INCREMENT*", FIVE_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_html_tm_update_file() {
                html_macros.note_html_handler_function(TM_UPDATE_LOAD_PAGE);
        html_macros.note_html_handler_function(TM_HANDLE_UPDATE_LOAD);
        html_macros.note_html_handler_function(TM_DECIDE_UPDATE_LOAD_CHANGES);
        html_macros.note_html_handler_function(TM_HANDLE_CONCEPT_REUSE);
        html_macros.note_html_handler_function(TM_UPDATE_VIEW_ADDITIONS);
        html_macros.note_html_handler_function(TM_UPDATE_ADD_NONE);
        html_macros.note_html_handler_function(TM_UPDATE_ADD_ALL);
        html_macros.note_html_handler_function(TM_UPDATE_ADD_INCREMENTAL);
        html_macros.note_html_handler_function(TM_DELAY_ADD_INCREMENTAL);
        html_macros.note_html_handler_function(TM_HANDLE_ADD_INCREMENTAL);
        html_macros.note_html_handler_function(TM_UPDATE_VIEW_DELETIONS);
        html_macros.note_html_handler_function(TM_UPDATE_DELETE_ALL);
        html_macros.note_html_handler_function(TM_UPDATE_DELETE_NONE);
        html_macros.note_html_handler_function(TM_UPDATE_DELETE_INCREMENTAL);
        html_macros.note_html_handler_function(TM_DELAY_DELETE_INCREMENTAL);
        html_macros.note_html_handler_function(TM_HANDLE_DELETE_INCREMENTAL);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $UPDATE_LOAD = makeKeyword("UPDATE-LOAD");

    private static final SubLSymbol TM_UPDATE_LOAD_WRAPPER = makeSymbol("TM-UPDATE-LOAD-WRAPPER");

    static private final SubLString $$$SUCCESS = makeString("SUCCESS");

    static private final SubLString $$$INCOMPLETE = makeString("INCOMPLETE");

    static private final SubLSymbol $sym4$TERM__ = makeSymbol("TERM-<");



    static private final SubLString $$$Begin_Update_Load_Analysis = makeString("Begin Update Load Analysis");

    static private final SubLString $$$administrator = makeString("administrator");

    static private final SubLString $str_alt8$Sorry__you_do_not_have_permission = makeString("Sorry, you do not have permission to access this page.");

    static private final SubLString $str_alt9$tm_update_load_page = makeString("tm-update-load-page");

    static private final SubLString $str_alt10$Update_Load_will_look_for_the_fil = makeString("Update Load will look for the file to load in the following directory.  Make sure this directory holds your file:");

    static private final SubLString $str_alt11$Update_Load_has_two_phases_ = makeString("Update Load has two phases.");

    static private final SubLString $str_alt12$Analysis_phase___ = makeString("Analysis phase.  ");

    static private final SubLString $str_alt13$Submitting_this_page_launches_the = makeString("Submitting this page launches the Analysis phase of an Update Load, in which the existing thesaurus content is compared against a thesaurus data file.");

    static private final SubLString $str_alt14$Decision_phase___ = makeString("Decision phase.  ");

    static private final SubLString $str_alt15$The_decision_phase_may_be_started = makeString("The decision phase may be started once the analysis is complete. It involves interactively verifying additions and deletions.");

    static private final SubLString $str_alt16$tm_handle_update_load = makeString("tm-handle-update-load");

    static private final SubLString $str_alt17$Choose_Thesaurus__ = makeString("Choose Thesaurus: ");

    static private final SubLString $str_alt18$__ = makeString("  ");

    static private final SubLString $str_alt19$Choose_Input_Format_ = makeString("Choose Input Format:");





    private static final SubLSymbol $EDITABLE_THESAURI = makeKeyword("EDITABLE-THESAURI");



    static private final SubLString $$$thesaurus = makeString("thesaurus");

    static private final SubLString $$$format = makeString("format");

    static private final SubLString $str_alt26$Enter_input_filename__including_e = makeString("Enter input filename, including extension (if present): ");

    static private final SubLString $$$filename = makeString("filename");

    static private final SubLString $str_alt28$ = makeString("");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $$$Analyze = makeString("Analyze");

    static private final SubLString $$$Update_Load = makeString("Update Load");

    private static final SubLSymbol TM_UPDATE_LOAD_PAGE = makeSymbol("TM-UPDATE-LOAD-PAGE");

    static private final SubLString $str_alt33$Please_choose_a_thesaurus_to_upda = makeString("Please choose a thesaurus to update.");

    static private final SubLString $str_alt34$Could_not_find_a_thesaurus_named_ = makeString("Could not find a thesaurus named ~A");

    static private final SubLString $str_alt35$Please_choose_an_input_format_for = makeString("Please choose an input format for the update load.");

    static private final SubLString $str_alt36$Please_enter_a_filename_for_the_u = makeString("Please enter a filename for the update load.");

    static private final SubLString $str_alt37$Update_Load__file__S_cannot_be_op = makeString("Update Load: file ~S cannot be opened or does not exist");

    private static final SubLSymbol TM_HANDLE_UPDATE_LOAD = makeSymbol("TM-HANDLE-UPDATE-LOAD");

    static private final SubLString $str_alt39$Performing_an_Update_Load_of__A = makeString("Performing an Update Load of ~A");

    static private final SubLString $str_alt40$Updating_the__A_thesaurus_from_fi = makeString("Updating the ~A thesaurus from file ");

    static private final SubLString $str_alt41$_S = makeString("~S");

    static private final SubLString $str_alt42$in__A_format_ = makeString("in ~A format.");

    static private final SubLString $str_alt43$Click_on_the_Status_button_to_vie = makeString("Click on the Status button to view progress.");

    static private final SubLString $str_alt44$After_the_update_analysis_is_fini = makeString("After the update analysis is finished, you should go to the Utilities page under ``Decide Update Load Changes'' to finish the update load by deciding which proposed changes to make.");

    static private final SubLString $str_alt45$Update_Load_Analysis_of_thesaurus = makeString("Update Load Analysis of thesaurus ");

    static private final SubLString $str_alt46$_is_not_permitted_at_this_time__s = makeString(" is not permitted at this time, since that thesaurus is involved in some edit operation.  Please try again later.");

    static private final SubLString $$$Update_Load_Analysis_Not_Started = makeString("Update Load Analysis Not Started");

    static private final SubLString $str_alt48$Implementation_error__Could_not_d = makeString("Implementation error: Could not determine a thesaurus from ~A.");

    private static final SubLSymbol $ADD_VIEW = makeKeyword("ADD-VIEW");

    private static final SubLSymbol $ADD_NONE = makeKeyword("ADD-NONE");

    private static final SubLSymbol $ADD_ALL = makeKeyword("ADD-ALL");

    private static final SubLSymbol $ADD_INCREMENTAL = makeKeyword("ADD-INCREMENTAL");

    private static final SubLSymbol $DELETE_VIEW = makeKeyword("DELETE-VIEW");

    private static final SubLSymbol $DELETE_NONE = makeKeyword("DELETE-NONE");

    private static final SubLSymbol $DELETE_ALL = makeKeyword("DELETE-ALL");

    private static final SubLSymbol $DELETE_INCREMENTAL = makeKeyword("DELETE-INCREMENTAL");

    private static final SubLSymbol $DECIDE = makeKeyword("DECIDE");

    private static final SubLSymbol $REUSE_MODE = makeKeyword("REUSE-MODE");



    private static final SubLSymbol TM_DECIDE_UPDATE_LOAD_CHANGES = makeSymbol("TM-DECIDE-UPDATE-LOAD-CHANGES");

    static private final SubLList $list_alt61 = list(makeSymbol("THES"), makeSymbol("NEW-TERMS-HASH"), makeSymbol("ADDITIONS-HASH"), makeSymbol("DELETIONS-HASH"), makeSymbol("CONCEPT-REUSE-INFO"));





    static private final SubLString $$$Specify_Concept_Reuse_Mode = makeString("Specify Concept Reuse Mode");

    static private final SubLString $str_alt65$tm_request_concept_reuse_info = makeString("tm-request-concept-reuse-info");

    static private final SubLString $str_alt66$tm_handle_concept_reuse = makeString("tm-handle-concept-reuse");

    static private final SubLString $str_alt67$The_update_load_of__A_has_identif = makeString("The update load of ~A has identified at least one new term.  ");

    static private final SubLString $str_alt68$Choose_a_concept_reuse_mode_for_t = makeString("Choose a concept reuse mode for the new terms:");

    static private final SubLList $list_alt69 = list(list(makeString("none"), makeString("Always create new concepts.")), list(makeString("any"), makeString("Reuse any concept from any thesaurus.")), list(makeString("priority"), makeString("Specify a priority list of thesauri to reuse concepts from.")));

    static private final SubLString $str_alt70$reuse_mode = makeString("reuse-mode");

    static private final SubLString $$$none = makeString("none");

    static private final SubLString $$$Set_Reuse_Mode = makeString("Set Reuse Mode");

    static private final SubLString $str_alt73$reuse_thesauri = makeString("reuse-thesauri");

    static private final SubLString $str_alt74$next_thesaurus = makeString("next-thesaurus");

    static private final SubLString $str_alt75$do_adds = makeString("do-adds");

    static private final SubLString $$$priority = makeString("priority");

    static private final SubLString $str_alt77$Specify_Concept_Reuse_Thesauri_fo = makeString("Specify Concept Reuse Thesauri for the Update Load of ~A");

    static private final SubLString $str_alt78$Error___S_is_not_the_name_of_a_va = makeString("Error: ~S is not the name of a valid thesaurus.");



    static private final SubLList $list_alt80 = list(makeSymbol("POSITION"), makeSymbol("THESAURUS-NAME"));

    static private final SubLString $str_alt81$__A__S_ = makeString("(~A ~S)");

    static private final SubLString $str_alt82$When_adding_new_terms_to_ = makeString("When adding new terms to ");

    static private final SubLString $str_alt83$__concepts_from_only_these_thesau = makeString(", concepts from only these thesauri may be reused.");

    static private final SubLString $str_alt84$They_are_shown_in_order__from_mos = makeString("They are shown in order, from most preferred to least preferred.");

    private static final SubLSymbol $THESAURUS = makeKeyword("THESAURUS");

    static private final SubLString $str_alt86$Select_the_ = makeString("Select the ");

    static private final SubLString $str_alt87$_thesaurus_to_prefer_for_concept_ = makeString(" thesaurus to prefer for concept reuse.");

    static private final SubLString $str_alt88$Append_this_thesaurus_to_the_reus = makeString("Append this thesaurus to the reuse list");

    static private final SubLString $str_alt89$Don_t_add_another__add_the_new_te = makeString("Don't add another; add the new terms now");

    private static final SubLSymbol TM_HANDLE_CONCEPT_REUSE = makeSymbol("TM-HANDLE-CONCEPT-REUSE");

    static private final SubLString $str_alt91$The_thesaurus_is_not_specified_ = makeString("The thesaurus is not specified.");



    static private final SubLList $list_alt93 = list(makeKeyword("ANY"), $NONE, makeKeyword("PRIORITY"), makeKeyword("UNIQUE"));

    static private final SubLString $str_alt94$Unknown_reuse_mode__S = makeString("Unknown reuse-mode ~S");

    static private final SubLSymbol $sym95$_ = makeSymbol("<");











    private static final SubLSymbol $UPDATE_LOAD_CHANGES = makeKeyword("UPDATE-LOAD-CHANGES");

    private static final SubLSymbol $UPDATE_LOAD_THESAURUS = makeKeyword("UPDATE-LOAD-THESAURUS");

    private static final SubLSymbol $UPDATE_LOAD_TYPE = makeKeyword("UPDATE-LOAD-TYPE");

    static private final SubLList $list_alt104 = list(makeSymbol("THES"), makeSymbol("NEW-TERM-HASH"), makeSymbol("ADDITIONS-HASH"), makeSymbol("DELETIONS-HASH"), makeSymbol("CONCEPT-REUSE-INFO"));



    static private final SubLString $str_alt106$Unknown_type_for_TM_UPDATE_TABLE_ = makeString("Unknown type for TM-UPDATE-TABLE-FOR-THESAURUS-TYPE");

    static private final SubLList $list_alt107 = list(makeSymbol("KEY"), makeSymbol("VAL"));

    static private final SubLString $$$No_Update_Load_State_Found = makeString("No Update Load State Found");

    static private final SubLString $str_alt109$tm_report_no_load_state = makeString("tm-report-no-load-state");

    static private final SubLString $str_alt110$No_Update_Load_state_information_ = makeString("No Update Load state information was found for ");

    static private final SubLString $str_alt111$___Perhaps_you_submitted_a_stale_ = makeString(".  Perhaps you submitted a stale page.");

    static private final SubLList $list_alt112 = list(makeSymbol("THESAURUS"), makeSymbol("NEW-TERM-HASH"), makeSymbol("ADDITIONS-HASH"), makeSymbol("DELETIONS-HASH"), makeSymbol("CONCEPT-REUSE-INFO"));

    static private final SubLString $$$Decide_Update_Load_Term_Additions = makeString("Decide Update Load Term Additions");

    static private final SubLString $$$New_Terms = makeString("New Terms");

    static private final SubLString $$$Decide_Update_Load_Fact_Additions = makeString("Decide Update Load Fact Additions");

    static private final SubLString $$$Terms_with_New_Thesaurus_Facts = makeString("Terms with New Thesaurus Facts");

    static private final SubLString $str_alt117$Unknown_type_for_TM_PRESENT_UPDAT = makeString("Unknown type for TM-PRESENT-UPDATE-ADDITIONS.");

    static private final SubLString $str_alt118$tm_handle_update_additions = makeString("tm-handle-update-additions");

    static private final SubLString $str_alt119$There_are_ = makeString("There are ");

    static private final SubLString $$$no = makeString("no");

    static private final SubLString $str_alt121$_remaining_ = makeString(" remaining ");

    static private final SubLString $str_alt122$_proposed_for_addition_to_ = makeString(" proposed for addition to ");

    static private final SubLString $str_alt123$_ = makeString(".");

    static private final SubLString $str_alt124$_A_ = makeString("~A?");

    static private final SubLString $str_alt125$tm_update_view_additions__a__a = makeString("tm-update-view-additions|~a|~a");

    static private final SubLString $str_alt126$View_all_proposed_additions_ = makeString("View all proposed additions.");

    static private final SubLString $str_alt127$tm_update_add_all__a__a = makeString("tm-update-add-all|~a|~a");

    static private final SubLString $str_alt128$Make_all_proposed_additions_ = makeString("Make all proposed additions.");

    static private final SubLString $str_alt129$tm_update_add_none__a__a = makeString("tm-update-add-none|~a|~a");

    static private final SubLString $str_alt130$Clear_them_all_without_adding_ = makeString("Clear them all without adding.");

    static private final SubLString $str_alt131$tm_update_add_incremental__a__a = makeString("tm-update-add-incremental|~a|~a");

    static private final SubLString $str_alt132$Verify_each_proposed_addition_ = makeString("Verify each proposed addition.");

    static private final SubLString $str_alt133$However__these_users_have_ = makeString("However, these users have ");

    static private final SubLString $str_alt134$However__this_user_has_ = makeString("However, this user has ");

    static private final SubLString $str_alt135$New_Term_additions_pending_for_ = makeString("New Term additions pending for ");

    static private final SubLString $str_alt136$New_Fact_additions_pending_for_ = makeString("New Fact additions pending for ");

    static private final SubLString $str_alt137$_ = makeString(":");

    static private final SubLString $str_alt138$__ = makeString(", ");

    static private final SubLString $str_alt139$_and_ = makeString(" and ");

    static private final SubLString $str_alt140$These_decisions_must_be_concluded = makeString("These decisions must be concluded before going on to the next type of change.");

    static private final SubLString $str_alt141$tm_decide_update_load_changes__a = makeString("tm-decide-update-load-changes|~a");

    static private final SubLString $str_alt142$__a = makeString("|~a");

    static private final SubLString $$$Continue = makeString("Continue");

    private static final SubLSymbol TM_UPDATE_VIEW_ADDITIONS = makeSymbol("TM-UPDATE-VIEW-ADDITIONS");

    private static final SubLSymbol TM_UPDATE_ADD_NONE = makeSymbol("TM-UPDATE-ADD-NONE");

    private static final SubLSymbol TM_UPDATE_ADD_ALL = makeSymbol("TM-UPDATE-ADD-ALL");

    private static final SubLSymbol TM_UPDATE_ADD_INCREMENTAL = makeSymbol("TM-UPDATE-ADD-INCREMENTAL");



    static private final SubLString $str_alt149$__a___a___a_ = makeString("`~a' ~a `~a'");



    static private final SubLString $str_alt151$__a___a__s = makeString("`~a' ~a ~s");

    static private final SubLString $str_alt152$_s__a___a_ = makeString("~s ~a `~a'");

    static private final SubLString $str_alt153$New_Terms_proposed_for_ = makeString("New Terms proposed for ");

    static private final SubLString $str_alt154$Additions_to_existing_terms_propo = makeString("Additions to existing terms proposed for ");

    static private final SubLString $str_alt155$Unknown_type_for_TM_UPDATE_VIEW_A = makeString("Unknown type for TM-UPDATE-VIEW-ADDITIONS-INTERNAL");

    static private final SubLString $str_alt156$tm_update_view_additions_internal = makeString("tm-update-view-additions-internal");

    static private final SubLString $str_alt157$tm_update_add_all__A__A = makeString("tm-update-add-all|~A|~A");

    static private final SubLString $str_alt158$tm_update_add_none__a__A = makeString("tm-update-add-none|~a|~A");

    static private final SubLString $str_alt159$tm_update_add_incremental__A__A = makeString("tm-update-add-incremental|~A|~A");

    static private final SubLString $$$Printing_assertion_specs = makeString("Printing assertion specs");

    static private final SubLString $str_alt161$New_Terms_cleared_for_ = makeString("New Terms cleared for ");

    static private final SubLString $str_alt162$Additions_to_existing_terms_clear = makeString("Additions to existing terms cleared for ");

    static private final SubLString $str_alt163$Unknown_type_for_TM_UPDATE_ADD_NO = makeString("Unknown type for TM-UPDATE-ADD-NONE-INTERNAL");

    static private final SubLString $str_alt164$tm_update_add_none_internal = makeString("tm-update-add-none-internal");

    static private final SubLString $$$New_Term_additions = makeString("New Term additions");

    static private final SubLString $$$Additions_to_existing_terms = makeString("Additions to existing terms");

    static private final SubLString $str_alt167$_proposed_by_Update_Load_have_bee = makeString(" proposed by Update Load have been cleared without adding any of them.");

    static private final SubLString $str_alt168$Continue_deciding_changes_propose = makeString("Continue deciding changes proposed by Update Load.");





    static private final SubLString $str_alt171$Implementation_error__Unknown_reu = makeString("Implementation error: Unknown reuse-mode ~A");

    static private final SubLString $str_alt172$Making_changes_to_thesaurus_ = makeString("Making changes to thesaurus ");

    static private final SubLString $str_alt173$_is_not_currently_permitted__beca = makeString(" is not currently permitted, because it is currently involved in another operation.  Please try again later.");

    static private final SubLString $str_alt174$Update_Load_Additions_Not_Perform = makeString("Update Load Additions Not Performed");

    static private final SubLString $str_alt175$Adding_all_New_Terms_for_ = makeString("Adding all New Terms for ");

    static private final SubLString $str_alt176$____ = makeString(" ...");

    static private final SubLString $str_alt177$Adding_all_Additions_to_existing_ = makeString("Adding all Additions to existing terms for ");

    static private final SubLString $str_alt178$Unknown_type_for_TM_UPDATE_ADD_AL = makeString("Unknown type for TM-UPDATE-ADD-ALL-INTERNAL");

    static private final SubLString $str_alt179$tm_update_add_all_internal = makeString("tm-update-add-all-internal");

    static private final SubLString $str_alt180$All_additions_of_ = makeString("All additions of ");

    static private final SubLString $$$new_terms = makeString("new terms");

    static private final SubLString $$$thesaurus_facts_to_existing_terms = makeString("thesaurus facts to existing terms");

    static private final SubLString $str_alt183$_proposed_by_Update_Load_are_now_ = makeString(" proposed by Update Load are now being made.  Depending on the number, this may take awhile.");

    static private final SubLString $str_alt184$Verify_some_New_Term_additions_fo = makeString("Verify some New Term additions for ");

    static private final SubLString $str_alt185$Verify_some_Additions_to_existing = makeString("Verify some Additions to existing terms for ");

    static private final SubLString $str_alt186$Unknown_type_for_TM_UPDATE_ADD_IN = makeString("Unknown type for TM-UPDATE-ADD-INCREMENTAL-INTERNAL");

    static private final SubLString $str_alt187$tm_update_add_incremental_interna = makeString("tm-update-add-incremental-internal");

    static private final SubLString $str_alt188$tm_delay_add_incremental = makeString("tm-delay-add-incremental");

    static private final SubLString $$$Wait_and_do_nothing_now = makeString("Wait and do nothing now");

    static private final SubLString $str_alt190$tm_handle_add_incremental = makeString("tm-handle-add-incremental");

    static private final SubLList $list_alt191 = list(makeSymbol("PT-STRING"), makeSymbol("ASSERTION-SPECS"));

    static private final SubLString $str_alt192$add__a = makeString("add-~a");

    static private final SubLString $str_alt193$__Don_t_add_these_facts = makeString("  Don't add these facts");

    static private final SubLString $$$all = makeString("all");

    static private final SubLString $str_alt195$__Add_these_facts = makeString("  Add these facts");

    static private final SubLString $$$select = makeString("select");

    static private final SubLString $str_alt197$__Select_individual_facts = makeString("  Select individual facts");

    static private final SubLString $str_alt198$fact__a = makeString("fact-~a");

    static private final SubLString $$$Make_Selected_Additions = makeString("Make Selected Additions");

    static private final SubLString $str_alt200$Individual_verification_has_been_ = makeString("Individual verification has been deferred.");

    private static final SubLSymbol TM_DELAY_ADD_INCREMENTAL = makeSymbol("TM-DELAY-ADD-INCREMENTAL");

    static private final SubLString $str_alt202$No_changes_were_found___Perhaps_y = makeString("No changes were found.  Perhaps you submitted a stale page.");







    static private final SubLString $str_alt206$Unrecognized_ADD_VAR_value_ = makeString("Unrecognized ADD-VAR value.");

    static private final SubLString $str_alt207$All_decisions_about_ = makeString("All decisions about ");

    static private final SubLString $$$thesaurus_fact_Additions = makeString("thesaurus fact Additions");

    static private final SubLString $str_alt209$_have_been_made_ = makeString(" have been made.");

    static private final SubLString $str_alt210$No_thesaurus_facts_were_added_ = makeString("No thesaurus facts were added.");

    static private final SubLString $$$One_thesaurus_fact_was_added = makeString("One thesaurus fact was added");

    static private final SubLString $str_alt212$_a_thesaurus_facts_were_added = makeString("~a thesaurus facts were added");

    private static final SubLSymbol TM_HANDLE_ADD_INCREMENTAL = makeSymbol("TM-HANDLE-ADD-INCREMENTAL");

    static private final SubLString $$$Decide_Update_Load_Deletions = makeString("Decide Update Load Deletions");

    static private final SubLString $str_alt215$tm_handle_update_deletions = makeString("tm-handle-update-deletions");

    static private final SubLString $$$Deletions = makeString("Deletions");

    static private final SubLString $str_alt217$_terms_having_facts_proposed_for_ = makeString(" terms having facts proposed for deletion.");

    static private final SubLString $str_alt218$tm_update_view_deletions__a = makeString("tm-update-view-deletions|~a");

    static private final SubLString $str_alt219$View_them_all_ = makeString("View them all.");

    static private final SubLString $str_alt220$tm_update_delete_all__a = makeString("tm-update-delete-all|~a");

    static private final SubLString $str_alt221$Make_all_proposed_deletions_ = makeString("Make all proposed deletions.");

    static private final SubLString $str_alt222$tm_update_delete_none__a = makeString("tm-update-delete-none|~a");

    static private final SubLString $str_alt223$Clear_the_proposal_without_deleti = makeString("Clear the proposal without deleting.");

    static private final SubLString $str_alt224$tm_update_delete_incremental__a = makeString("tm-update-delete-incremental|~a");

    static private final SubLString $str_alt225$Verify_each_deletion_ = makeString("Verify each deletion.");

    static private final SubLString $str_alt226$Deletions_pending_for_ = makeString("Deletions pending for ");

    static private final SubLString $str_alt227$These_decisions_must_be_concluded = makeString("These decisions must be concluded before finishing the Update Load.");

    private static final SubLSymbol TM_UPDATE_VIEW_DELETIONS = makeSymbol("TM-UPDATE-VIEW-DELETIONS");

    private static final SubLSymbol TM_UPDATE_DELETE_ALL = makeSymbol("TM-UPDATE-DELETE-ALL");

    private static final SubLSymbol TM_UPDATE_DELETE_NONE = makeSymbol("TM-UPDATE-DELETE-NONE");

    private static final SubLSymbol TM_UPDATE_DELETE_INCREMENTAL = makeSymbol("TM-UPDATE-DELETE-INCREMENTAL");

    static private final SubLString $str_alt232$Thesaurus_facts_proposed_for_dele = makeString("Thesaurus facts proposed for deletion from ");

    static private final SubLString $str_alt233$tm_update_view_deletions_internal = makeString("tm-update-view-deletions-internal");

    static private final SubLString $str_alt234$tm_update_delete_all__A = makeString("tm-update-delete-all|~A");

    static private final SubLString $str_alt235$tm_update_delete_incremental__A = makeString("tm-update-delete-incremental|~A");

    static private final SubLString $$$Printing_deletion_assertions = makeString("Printing deletion assertions");

    public static final SubLObject $$preferredTerm = constant_handles.reader_make_constant_shell(makeString("preferredTerm"));

    private static final SubLSymbol GAF_ARG0 = makeSymbol("GAF-ARG0");

    static private final SubLString $$$Delete_this_term_entirely = makeString("Delete this term entirely");

    static private final SubLString $str_alt240$__including_ = makeString(", including:");

    static private final SubLString $str_alt241$Update_Load_Deletions_Not_Perform = makeString("Update Load Deletions Not Performed");

    static private final SubLString $str_alt242$Deleting_all_proposed_deletions_f = makeString("Deleting all proposed deletions from ");

    static private final SubLString $str_alt243$tm_update_delete_all_internal = makeString("tm-update-delete-all-internal");

    static private final SubLString $str_alt244$All_deletions_proposed_by_Update_ = makeString("All deletions proposed by Update Load are now being deleted.  Depending on the number, this may take awhile.");

    static private final SubLString $str_alt245$Deletions_cleared_for_ = makeString("Deletions cleared for ");

    static private final SubLString $str_alt246$tm_update_delete_none_internal = makeString("tm-update-delete-none-internal");

    static private final SubLString $str_alt247$All_deletions_proposed_by_Update_ = makeString("All deletions proposed by Update Load for ");

    static private final SubLString $str_alt248$_have_been_cleared_without_perfor = makeString(" have been cleared without performing any of them.");

    static private final SubLString $str_alt249$Verify_some_Deletions_from_ = makeString("Verify some Deletions from ");

    static private final SubLString $str_alt250$tm_update_delete_incremental_inte = makeString("tm-update-delete-incremental-internal");

    static private final SubLString $str_alt251$tm_delay_delete_incremental = makeString("tm-delay-delete-incremental");

    static private final SubLString $str_alt252$tm_handle_delete_incremental = makeString("tm-handle-delete-incremental");

    static private final SubLList $list_alt253 = list(makeSymbol("CONSTANT"), makeSymbol("ASSERTIONS"));

    static private final SubLString $str_alt254$delete__a = makeString("delete-~a");

    static private final SubLString $$$pt = makeString("pt");

    static private final SubLString $str_alt256$__Delete_this_term_entirely = makeString("  Delete this term entirely");

    static private final SubLString $str_alt257$__Don_t_delete_any_facts = makeString("  Don't delete any facts");

    static private final SubLString $str_alt258$__Delete_these_facts = makeString("  Delete these facts");

    static private final SubLString $str_alt259$__Select_individual_facts_to_dele = makeString("  Select individual facts to delete");

    static private final SubLString $$$Make_Selected_Deletions = makeString("Make Selected Deletions");

    private static final SubLSymbol TM_DELAY_DELETE_INCREMENTAL = makeSymbol("TM-DELAY-DELETE-INCREMENTAL");

    private static final SubLSymbol $PT = makeKeyword("PT");

    static private final SubLSymbol $sym263$PT_SIGN_ = makeSymbol("PT-SIGN?");

    static private final SubLString $str_alt264$Unrecognized_DELETE_VAR_value_ = makeString("Unrecognized DELETE-VAR value.");

    static private final SubLString $str_alt265$All_decisions_about_thesaurus_fac = makeString("All decisions about thesaurus fact deletions have been made.");

    static private final SubLString $str_alt266$No_thesaurus_facts_were_deleted_ = makeString("No thesaurus facts were deleted.");

    static private final SubLString $$$One_thesaurus_fact_was_deleted = makeString("One thesaurus fact was deleted");

    static private final SubLString $str_alt268$_a_thesaurus_facts_were_deleted = makeString("~a thesaurus facts were deleted");

    private static final SubLSymbol TM_HANDLE_DELETE_INCREMENTAL = makeSymbol("TM-HANDLE-DELETE-INCREMENTAL");

    public static final SubLObject $$thesaurusLoadDate = constant_handles.reader_make_constant_shell(makeString("thesaurusLoadDate"));

    public static final SubLObject $$thesaurusLoadedBy = constant_handles.reader_make_constant_shell(makeString("thesaurusLoadedBy"));

    static private final SubLString $str_alt272$The_Update_Load_for_ = makeString("The Update Load for ");

    static private final SubLString $str_alt273$_is_now_complete___You_should_now = makeString(" is now complete.  You should now run the Integrity Checker on this thesaurus.");

    static private final SubLString $$$Update_Load_Complete = makeString("Update Load Complete");

    // // Initializers
    public void declareFunctions() {
        declare_html_tm_update_file();
    }

    public void initializeVariables() {
        init_html_tm_update_file();
    }

    public void runTopLevelForms() {
        setup_html_tm_update_file();
    }
}

