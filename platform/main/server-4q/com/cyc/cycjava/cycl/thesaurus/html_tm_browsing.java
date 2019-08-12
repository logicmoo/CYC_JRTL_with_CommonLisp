/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      HTML-TM-BROWSING
 *  source file: /cyc/top/cycl/thesaurus/html-tm-browsing.lisp
 *  created:     2019/07/03 17:38:31
 */
public final class html_tm_browsing extends SubLTranslatedFile implements V02 {
    // // Constructor
    private html_tm_browsing() {
    }

    public static final SubLFile me = new html_tm_browsing();

    public static final String myName = "com.cyc.cycjava.cycl.thesaurus.html_tm_browsing";

    // // Definitions
    /**
     * Case Style Specifiers and the strings to print to describe them.
     */
    // defparameter
    private static final SubLSymbol $tm_case_style_specifiers_and_descriptors$ = makeSymbol("*TM-CASE-STYLE-SPECIFIERS-AND-DESCRIPTORS*");

    /**
     * The fort id of the previous node printed, when printing
     * inferior nodes in the hierarchical display.
     */
    // defparameter
    private static final SubLSymbol $tm_previous_node_id$ = makeSymbol("*TM-PREVIOUS-NODE-ID*");





    // defparameter
    private static final SubLSymbol $tm_parent_node_vector_default_length$ = makeSymbol("*TM-PARENT-NODE-VECTOR-DEFAULT-LENGTH*");

    // defparameter
    private static final SubLSymbol $tm_current_indent_level$ = makeSymbol("*TM-CURRENT-INDENT-LEVEL*");

    // defparameter
    private static final SubLSymbol $tm_deepest_indent_level$ = makeSymbol("*TM-DEEPEST-INDENT-LEVEL*");

    public static final SubLObject tm_make_parent_node_vector(SubLObject length) {
        if (length == UNPROVIDED) {
            length = $tm_parent_node_vector_default_length$.getDynamicValue();
        }
        {
            SubLObject v_new = make_vector(length, UNPROVIDED);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                set_aref(v_new, i, make_hash_table(TWENTY_INTEGER, symbol_function(EQUAL), UNPROVIDED));
            }
            return v_new;
        }
    }

    public static final SubLObject tm_initialize_parent_node_vector(SubLObject desired_length) {
        if (desired_length == UNPROVIDED) {
            desired_length = $tm_parent_node_vector_default_length$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($tm_parent_node_vector$.getDynamicValue(thread).isVector()) {
                {
                    SubLObject v_length = length($tm_parent_node_vector$.getDynamicValue(thread));
                    if (v_length.numGE(desired_length)) {
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(v_length); i = add(i, ONE_INTEGER)) {
                                {
                                    SubLObject table = aref($tm_parent_node_vector$.getDynamicValue(thread), i);
                                    if (table.isHashtable()) {
                                        clrhash(table);
                                    } else {
                                        set_aref($tm_parent_node_vector$.getDynamicValue(thread), i, make_hash_table(TWENTY_INTEGER, symbol_function(EQUAL), UNPROVIDED));
                                    }
                                }
                            }
                        }
                    } else {
                        $tm_parent_node_vector$.setDynamicValue(tm_make_parent_node_vector(desired_length), thread);
                    }
                }
            } else {
                $tm_parent_node_vector$.setDynamicValue(tm_make_parent_node_vector(desired_length), thread);
            }
            return $tm_parent_node_vector$.getDynamicValue(thread);
        }
    }

    public static final SubLObject tm_get_parent_node_vector(SubLObject length) {
        if (length == UNPROVIDED) {
            length = $tm_parent_node_vector_default_length$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $tm_parent_node_vector$.getDynamicValue(thread).isVector() ? ((SubLObject) ($tm_parent_node_vector$.getDynamicValue(thread))) : tm_initialize_parent_node_vector(length);
        }
    }

    public static final SubLObject tm_clear_duplicate_node_table() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($tm_duplicate_node_table$.getDynamicValue(thread).isHashtable()) {
                clrhash($tm_duplicate_node_table$.getDynamicValue(thread));
            } else {
                $tm_duplicate_node_table$.setDynamicValue(make_hash_table($int$200, symbol_function(EQUAL), UNPROVIDED), thread);
            }
            return $tm_duplicate_node_table$.getDynamicValue(thread);
        }
    }

    public static final SubLObject tm_report_no_constants(SubLObject args) {
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
                html_utilities.html_princ($$$No_Terms_Found);
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
                            SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$No_Terms_Found);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$No_Terms_Found);
                                html_thesaurus.thesaurus_heading($str_alt10$tm_report_no_constants);
                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                html_utilities.html_princ($str_alt11$The_string_);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ(args);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_princ($str_alt12$_could_not_be_matched_with_any_th);
                                html_thesaurus.tm_footer();
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

    public static final SubLObject tm_report_not_in_active_thesauri(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject concept_thesauri = tm_internals.thesauri_of_concept(constant);
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Not_in_Active_Thesauri);
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
                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$Not_in_Active_Thesauri);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$Not_in_Active_Thesauri);
                                html_thesaurus.thesaurus_heading($str_alt14$tm_report_not_in_active_thesauri);
                                tm_thesaurus_constant(constant, NIL, NIL, NIL, concept_thesauri, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_princ($str_alt15$_is_not_defined_in_the_active_the);
                                html_utilities.html_br();
                                html_utilities.html_br();
                                html_utilities.html_princ($str_alt16$Please_go_to_Preferences_and_make);
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
                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$html_indent_table_max$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                                        {
                                            SubLObject cdolist_list_var = concept_thesauri;
                                            SubLObject thesaurus = NIL;
                                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                html_utilities.html_br();
                                                {
                                                    SubLObject indent = TWO_INTEGER;
                                                    SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_thesaurus.tm_link($THESAURUS, thesaurus, UNPROVIDED, UNPROVIDED);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                                            html_utilities.html_indent_table_internal(ZERO_INTEGER);
                                        }
                                    } finally {
                                        html_macros.$html_indent_table_max$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
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

    public static final SubLObject tm_right_case(SubLObject string, SubLObject rel_abbrev) {
        if (rel_abbrev == UNPROVIDED) {
            rel_abbrev = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (string.isString() && (!rel_abbrev.equalp($$$SN))) {
                {
                    SubLObject fun = NIL;
                    SubLObject pcase_var = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DISPLAY_CASE);
                    if (pcase_var.eql($UPPER)) {
                        fun = STRING_UPCASE;
                    } else
                        if (pcase_var.eql($LOWER)) {
                            fun = STRING_DOWNCASE;
                        }

                    if (NIL != fboundp(fun)) {
                        string = funcall(fun, string);
                    }
                }
            }
            return string;
        }
    }

    public static final SubLObject tm_thesaurus_constant_internal_many_terms(SubLObject term_id, SubLObject alpha, SubLObject preferred_term_mt_pairs, SubLObject top_thesauri, SubLObject display_type) {
        {
            SubLObject one_printedP = NIL;
            SubLObject cdolist_list_var = Sort.sort(preferred_term_mt_pairs, symbol_function(STRING_LESSP), symbol_function(CAR));
            SubLObject form = NIL;
            for (form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , form = cdolist_list_var.first()) {
                {
                    SubLObject string = form.first();
                    if (string.isString()) {
                        string = tm_right_case(string, UNPROVIDED);
                    }
                    if (NIL != one_printedP) {
                        html_utilities.html_princ($str_alt24$___);
                    }
                    if (NIL != alpha) {
                        html_thesaurus.tm_link($ALPHABETICAL, string, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_indent(ONE_INTEGER);
                    }
                    html_thesaurus.tm_link($HIERARCHICAL, term_id, string, UNPROVIDED);
                    tm_handle_print_thes_list(second(form), term_id, top_thesauri, display_type);
                    one_printedP = T;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_thesaurus_constant_show_thesauri(SubLObject constant, SubLObject string_to_use, SubLObject alpha, SubLObject full, SubLObject thesauri, SubLObject top_thesauri, SubLObject display_type) {
        if (string_to_use == UNPROVIDED) {
            string_to_use = NIL;
        }
        if (alpha == UNPROVIDED) {
            alpha = T;
        }
        if (full == UNPROVIDED) {
            full = T;
        }
        if (thesauri == UNPROVIDED) {
            thesauri = NIL;
        }
        if (top_thesauri == UNPROVIDED) {
            top_thesauri = NIL;
        }
        if (display_type == UNPROVIDED) {
            display_type = NIL;
        }
        {
            SubLObject id = cb_utilities.cb_fort_identifier(constant);
            SubLObject concept_thesauri = tm_internals.thesauri_of_concept(constant);
            SubLObject thes_set = (NIL != thesauri) ? ((SubLObject) (intersection(thesauri, concept_thesauri, symbol_function(EQUAL), UNPROVIDED))) : concept_thesauri;
            SubLObject preferred_term_mt_pairs = NIL;
            SubLObject cdolist_list_var = thes_set;
            SubLObject thes = NIL;
            for (thes = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thes = cdolist_list_var.first()) {
                {
                    SubLObject prefterm = tm_datastructures.concept_term(constant, thes);
                    if (NIL != prefterm) {
                        {
                            SubLObject old = second(assoc(prefterm, preferred_term_mt_pairs, symbol_function(EQUALP), UNPROVIDED));
                            if (NIL != old) {
                                preferred_term_mt_pairs = remove(prefterm, preferred_term_mt_pairs, symbol_function(EQUALP), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            preferred_term_mt_pairs = cons(list(prefterm, bq_cons(thes, old)), preferred_term_mt_pairs);
                        }
                    }
                }
            }
            if (NIL == string_to_use) {
                string_to_use = tm_internals.tm_string_for_constant(function_terms.naut_to_nart(constant), NIL, NIL != thesauri ? ((SubLObject) (thesauri)) : thes_set, UNPROVIDED);
            }
            string_to_use = tm_right_case(string_to_use, UNPROVIDED);
            if (NIL != full) {
                html_thesaurus.tm_link($FULL_RECORD, id, UNPROVIDED, UNPROVIDED);
                html_utilities.html_indent(ONE_INTEGER);
            }
            if (((NIL != alpha) && length(thes_set).numG(ONE_INTEGER)) && length(preferred_term_mt_pairs).numG(ONE_INTEGER)) {
                tm_thesaurus_constant_internal_many_terms(id, alpha, preferred_term_mt_pairs, top_thesauri, display_type);
            } else {
                if (NIL != alpha) {
                    html_thesaurus.tm_link($ALPHABETICAL, string_to_use, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_indent(ONE_INTEGER);
                }
                html_thesaurus.tm_link($HIERARCHICAL, id, string_to_use, UNPROVIDED);
                tm_handle_print_thes_list(thes_set, id, top_thesauri, display_type);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_thesaurus_constant_no_thesauri(SubLObject constant, SubLObject string_to_use, SubLObject alpha, SubLObject full, SubLObject thesauri) {
        if (string_to_use == UNPROVIDED) {
            string_to_use = NIL;
        }
        if (alpha == UNPROVIDED) {
            alpha = T;
        }
        if (full == UNPROVIDED) {
            full = T;
        }
        if (thesauri == UNPROVIDED) {
            thesauri = NIL;
        }
        {
            SubLObject id = cb_utilities.cb_fort_identifier(constant);
            if (NIL == string_to_use) {
                string_to_use = tm_internals.tm_string_for_constant(function_terms.naut_to_nart(constant), NIL, NIL != thesauri ? ((SubLObject) (thesauri)) : NIL, UNPROVIDED);
            }
            string_to_use = tm_right_case(string_to_use, UNPROVIDED);
            if (NIL != full) {
                html_thesaurus.tm_link($FULL_RECORD, id, UNPROVIDED, UNPROVIDED);
                html_utilities.html_indent(ONE_INTEGER);
            }
            if (NIL != alpha) {
                html_thesaurus.tm_link($ALPHABETICAL, string_to_use, UNPROVIDED, UNPROVIDED);
                html_utilities.html_indent(ONE_INTEGER);
            }
            html_thesaurus.tm_link($HIERARCHICAL, id, string_to_use, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Outputs a term to an HTML page in a standard form, as an active link with
     * accompanying active symbols, and optionally with a list of the thesauri
     * in which the term occurs.  If THESAURI are given, only those thesauri are used.  If TOP-THESAURI is non-nil, and the term is a top term in some thesaurus, that information will be indicated.  DISPLAY-TYPE is used to indicate the action when the user clicks on the thesaurus symbols.
     */
    public static final SubLObject tm_thesaurus_constant(SubLObject constant, SubLObject string_to_use, SubLObject alpha, SubLObject full, SubLObject thesauri, SubLObject top_thesauri, SubLObject display_type) {
        if (string_to_use == UNPROVIDED) {
            string_to_use = NIL;
        }
        if (alpha == UNPROVIDED) {
            alpha = T;
        }
        if (full == UNPROVIDED) {
            full = T;
        }
        if (thesauri == UNPROVIDED) {
            thesauri = NIL;
        }
        if (top_thesauri == UNPROVIDED) {
            top_thesauri = NIL;
        }
        if (display_type == UNPROVIDED) {
            display_type = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject show_thesauriP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_TERM_THESAURI);
                if (NIL != show_thesauriP) {
                    return tm_thesaurus_constant_show_thesauri(constant, string_to_use, alpha, full, thesauri, top_thesauri, display_type);
                } else {
                    return tm_thesaurus_constant_no_thesauri(constant, string_to_use, alpha, full, thesauri);
                }
            }
        }
    }

    /**
     * Returns an alist of signs indexed by preferred-term strings.
     */
    public static final SubLObject tm_sort_signs_by_pt(SubLObject signs) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = signs;
            SubLObject sign = NIL;
            for (sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sign = cdolist_list_var.first()) {
                {
                    SubLObject concept = tm_datastructures.sign_concept(sign);
                    SubLObject thesaurus = tm_datastructures.sign_thesaurus(sign);
                    SubLObject pt_string = tm_datastructures.concept_term(concept, thesaurus);
                    if (NIL != assoc(pt_string, result, symbol_function(EQUALP), UNPROVIDED)) {
                        rplacd(assoc(pt_string, result, symbol_function(EQUALP), UNPROVIDED), cons(sign, assoc(pt_string, result, symbol_function(EQUALP), UNPROVIDED).rest()));
                    } else {
                        result = cons(cons(pt_string, list(sign)), result);
                    }
                }
            }
            return result;
        }
    }

    /**
     * returns an alist of signs indexed by their sign-term.
     */
    public static final SubLObject tm_sort_signs_by_term(SubLObject signs) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = signs;
            SubLObject sign = NIL;
            for (sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sign = cdolist_list_var.first()) {
                {
                    SubLObject v_term = tm_datastructures.sign_term(sign);
                    if (NIL != assoc(v_term, result, symbol_function(EQUALP), UNPROVIDED)) {
                        rplacd(assoc(v_term, result, symbol_function(EQUALP), UNPROVIDED), cons(sign, assoc(v_term, result, symbol_function(EQUALP), UNPROVIDED).rest()));
                    } else {
                        result = cons(cons(v_term, list(sign)), result);
                    }
                }
            }
            return result;
        }
    }

    public static final SubLObject tm_possibly_show_alternate_input_strings(SubLObject signs, SubLObject selected_mt, SubLObject indentP) {
        if (selected_mt == UNPROVIDED) {
            selected_mt = NIL;
        }
        if (indentP == UNPROVIDED) {
            indentP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject something_printedP = NIL;
                if (NIL != signs) {
                    {
                        SubLObject entered_string = tm_datastructures.sign_term(signs.first());
                        SubLObject cdolist_list_var = tm_lexical_index.all_lexpreds();
                        SubLObject lexpred = NIL;
                        for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                            if (lexpred != $$preferredTerm) {
                                {
                                    SubLObject lexpred_signs = tm_internals.extract_signs_matching(signs, $LEXPRED, lexpred);
                                    SubLObject relation_name = tm_internals.tm_pred_arg_symbol(lexpred, ONE_INTEGER);
                                    if (NIL != lexpred_signs) {
                                        {
                                            SubLObject sorted_signs = tm_sort_signs_by_pt(lexpred_signs);
                                            SubLObject cdolist_list_var_11 = sorted_signs;
                                            SubLObject item = NIL;
                                            for (item = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , item = cdolist_list_var_11.first()) {
                                                {
                                                    SubLObject datum = item;
                                                    SubLObject current = datum;
                                                    SubLObject pt_string = NIL;
                                                    SubLObject pt_signs = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt33);
                                                    pt_string = current.first();
                                                    current = current.rest();
                                                    pt_signs = current;
                                                    if (!pt_string.equalp(entered_string)) {
                                                        pt_string = tm_right_case(pt_string, UNPROVIDED);
                                                        {
                                                            SubLObject sorted_pt_signs = tm_sort_signs_by_term(pt_signs);
                                                            something_printedP = NIL;
                                                            {
                                                                SubLObject cdolist_list_var_12 = sorted_pt_signs;
                                                                SubLObject item2 = NIL;
                                                                for (item2 = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , item2 = cdolist_list_var_12.first()) {
                                                                    {
                                                                        SubLObject datum_13 = item2;
                                                                        SubLObject current_14 = datum_13;
                                                                        SubLObject term_string = NIL;
                                                                        SubLObject pt_term_signs = NIL;
                                                                        destructuring_bind_must_consp(current_14, datum_13, $list_alt34);
                                                                        term_string = current_14.first();
                                                                        current_14 = current_14.rest();
                                                                        pt_term_signs = current_14;
                                                                        term_string = tm_right_case(term_string, UNPROVIDED);
                                                                        {
                                                                            SubLObject first_sign = pt_term_signs.first();
                                                                            SubLObject thesaurus = tm_datastructures.sign_thesaurus(first_sign);
                                                                            if (!((NIL != selected_mt) && (thesaurus != selected_mt))) {
                                                                                {
                                                                                    SubLObject thesaurus_symbol = tm_internals.thesaurus_abbreviation(thesaurus);
                                                                                    if (NIL != indentP) {
                                                                                        html_utilities.html_indent(SIX_INTEGER);
                                                                                    }
                                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt35$__A___A___A__in___A, new SubLObject[]{ pt_string, relation_name, term_string, thesaurus_symbol });
                                                                                    something_printedP = T;
                                                                                }
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject cdolist_list_var_15 = pt_term_signs.rest();
                                                                            SubLObject sign = NIL;
                                                                            for (sign = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , sign = cdolist_list_var_15.first()) {
                                                                                {
                                                                                    SubLObject thesaurus = tm_datastructures.sign_thesaurus(sign);
                                                                                    if (!((NIL != selected_mt) && (thesaurus != selected_mt))) {
                                                                                        {
                                                                                            SubLObject thesaurus_symbol = tm_internals.thesaurus_abbreviation(thesaurus);
                                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt36$___A, thesaurus_symbol);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (NIL != something_printedP) {
                                                                            html_utilities.html_princ($str_alt37$_);
                                                                        }
                                                                    }
                                                                    html_utilities.html_br();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return something_printedP;
            }
        }
    }

    public static final SubLObject tm_choose_constant(SubLObject string, SubLObject concepts, SubLObject signs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM, string, UNPROVIDED);
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Choose_Term);
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
                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$Choose_Term);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$Choose_Term);
                                html_thesaurus.thesaurus_heading($str_alt40$tm_choose_constant);
                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_prin1(string);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_utilities.html_princ($str_alt41$_corresponds_to_the_following_pre);
                                html_utilities.html_br();
                                {
                                    SubLObject cdolist_list_var = concepts;
                                    SubLObject concept = NIL;
                                    for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                                        {
                                            SubLObject concept_signs = tm_internals.extract_signs_matching(signs, $CONCEPT, concept);
                                            tm_thesaurus_constant(concept, NIL, T, T, NIL, NIL, NIL);
                                            html_utilities.html_br();
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            tm_possibly_show_alternate_input_strings(concept_signs, NIL, T);
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        }
                                    }
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
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

    public static final SubLObject tm_hierarchy_display(SubLObject constant, SubLObject signs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = cb_utilities.cb_fort_identifier(constant);
                if (NIL != id) {
                    {
                        SubLObject pcase_var = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE);
                        if (pcase_var.eql($BASIC)) {
                            if (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread)) {
                                html_basic_thesaurus.tm_basic_print_nodes(constant, id, signs, UNPROVIDED);
                            } else {
                                tm_print_nodes(constant, id, signs);
                            }
                        } else
                            if (pcase_var.eql($ADVANCED)) {
                                tm_print_nodes(constant, id, signs);
                            } else {
                                return html_thesaurus.tm_error($$$Could_not_determine_the_interface, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }

                    }
                } else {
                    html_thesaurus.tm_error($str_alt47$_A_is_not_a_valid_ID_for_the_cons, id, constant, tm_datastructures.sign_term(signs.first()), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_print_nodes(SubLObject constant, SubLObject id, SubLObject signs) {
        if (signs == UNPROVIDED) {
            signs = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject selected_mt = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SELECTED_THESAURUS);
                SubLObject mts = (NIL != selected_mt) ? ((SubLObject) (list(selected_mt))) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
                SubLObject name = (NIL != selected_mt) ? ((SubLObject) (tm_internals.thesaurus_name(selected_mt))) : NIL;
                tm_datastructures.clear_utility_tables(tm_datastructures.$tm_user$.getDynamicValue(thread));
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_PATHS, NIL, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                        mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                        {
                            SubLObject constant_19 = html_thesaurus.tm_guess_fort(id);
                            SubLObject preferred = tm_internals.preferred_terms(constant_19);
                            preferred = Sort.sort(preferred, symbol_function(STRING_LESSP), UNPROVIDED);
                            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM, constant_19, UNPROVIDED);
                            {
                                SubLObject color_value = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_HIERARCHICAL);
                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                html_macros.html_head_content_type();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_utilities.html_princ(format(NIL, $str_alt53$Hierarchical_display_of___A__A, NIL != preferred ? ((SubLObject) (preferred.first())) : misc_kb_utilities.coerce_name(constant_19), NIL != name ? ((SubLObject) (format(NIL, $str_alt54$_in_only__A, name))) : $str_alt55$));
                                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_20 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                                html_utilities.html_princ(format(NIL, $str_alt53$Hierarchical_display_of___A__A, NIL != preferred ? ((SubLObject) (preferred.first())) : misc_kb_utilities.coerce_name(constant_19), NIL != name ? ((SubLObject) (format(NIL, $str_alt54$_in_only__A, name))) : $str_alt55$));
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(ONE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                tm_logging.tm_enqueue_event(format(NIL, $str_alt53$Hierarchical_display_of___A__A, NIL != preferred ? ((SubLObject) (preferred.first())) : misc_kb_utilities.coerce_name(constant_19), NIL != name ? ((SubLObject) (format(NIL, $str_alt54$_in_only__A, name))) : $str_alt55$));
                                                if (NIL != tm_possibly_show_alternate_input_strings(signs, selected_mt, UNPROVIDED)) {
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                }
                                                html_thesaurus.thesaurus_heading($str_alt56$tm_print_nodes);
                                                tm_print_nodes_1(constant_19);
                                                html_thesaurus.tm_footer();
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_20, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_PATHS, NIL, UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject tm_handle_print_thes_list(SubLObject thesauri, SubLObject term_id, SubLObject top_thesauri, SubLObject display_type) {
        if (top_thesauri == UNPROVIDED) {
            top_thesauri = NIL;
        }
        if (display_type == UNPROVIDED) {
            display_type = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != thesauri) {
                thesauri = Sort.sort(thesauri, symbol_function(STRING_LESSP), symbol_function(THESAURUS_ABBREVIATION));
                {
                    SubLObject size_val = TWO_INTEGER;
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                            html_utilities.html_indent(ONE_INTEGER);
                            html_utilities.html_princ($str_alt58$_);
                            {
                                SubLObject cdolist_list_var = thesauri;
                                SubLObject thes_constant = NIL;
                                for (thes_constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thes_constant = cdolist_list_var.first()) {
                                    {
                                        SubLObject thes_id = cb_utilities.cb_fort_identifier(thes_constant);
                                        SubLObject thes_abbrev = tm_internals.thesaurus_abbreviation(thes_constant);
                                        SubLObject constant = html_thesaurus.tm_guess_fort(term_id);
                                        if (thes_constant != thesauri.first()) {
                                            html_utilities.html_princ($str_alt59$__);
                                        }
                                        {
                                            SubLObject pcase_var = display_type;
                                            if (pcase_var.eql($HIERARCHICAL)) {
                                                html_thesaurus.tm_link($SELECTED_HIERARCHICAL, term_id, thes_abbrev, thes_id);
                                            } else
                                                if (pcase_var.eql($SWITCH_HIERARCHICAL) || pcase_var.eql($ADD_HIERARCHICAL)) {
                                                    html_thesaurus.tm_link(display_type, term_id, thes_abbrev, thes_id);
                                                } else {
                                                    html_thesaurus.tm_link($TERM_IN_THESAURUS, thes_id, thes_abbrev, term_id);
                                                }

                                        }
                                        if (NIL != find(thes_constant, top_thesauri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            html_utilities.html_princ($str_alt64$__);
                                            if (NIL == tm_internals.declarative_top_in_thesaurusP(constant, thes_constant)) {
                                                html_utilities.html_princ($str_alt65$computed_);
                                            }
                                            html_utilities.html_princ($str_alt66$top_);
                                        }
                                    }
                                }
                            }
                            html_utilities.html_princ($str_alt67$_);
                            html_utilities.html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    /**
     * Prints out information from all active thesauri, merged together.
     */
    public static final SubLObject tm_elaborate_thesaurus_constant(SubLObject constant, SubLObject previous, SubLObject forms, SubLObject indent_level, SubLObject display_type) {
        if (previous == UNPROVIDED) {
            previous = NIL;
        }
        if (forms == UNPROVIDED) {
            forms = NIL;
        }
        if (indent_level == UNPROVIDED) {
            indent_level = ZERO_INTEGER;
        }
        if (display_type == UNPROVIDED) {
            display_type = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject selected_thesaurus = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SELECTED_THESAURUS);
                SubLObject thesauri = (NIL != selected_thesaurus) ? ((SubLObject) (list(selected_thesaurus))) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
                SubLObject output_filter_info = NIL;
                SubLObject relation_specs = tm_io.tm_output_item(constant, thesauri, output_filter_info, NIL, symbol_function(ASSERTION_MT));
                html_utilities.html_br();
                {
                    SubLObject indent = indent_level;
                    SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != previous) {
                                        tm_hd_rel_link(forms);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt69$_);
                                    }
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    {
                                        SubLObject size_val = FIVE_INTEGER;
                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (NIL != size_val) {
                                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(size_val);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL == tm_internals.thesaurus_gensymP(constant)) {
                                                    html_thesaurus.tm_link($CYC_CONCEPT, constant, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_indent(ONE_INTEGER);
                                                }
                                                tm_thesaurus_constant(constant, tm_internals.tm_string_for_constant(constant, NIL, thesauri, UNPROVIDED), T, T, thesauri, NIL, display_type);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
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
                {
                    SubLObject cdolist_list_var = relation_specs;
                    SubLObject relation_spec = NIL;
                    for (relation_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation_spec = cdolist_list_var.first()) {
                        {
                            SubLObject rel_symbol = relation_spec.first();
                            SubLObject value_list = second(relation_spec);
                            if (NIL == find(rel_symbol, $list_alt71, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                if (NIL != value_list) {
                                    {
                                        SubLObject size_val = TWO_INTEGER;
                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (NIL != size_val) {
                                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(size_val);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject indent = indent_level;
                                                    SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                    html_thesaurus.tm_link($RELATION, rel_symbol, UNPROVIDED, UNPROVIDED);
                                                                    html_utilities.html_princ($str_alt73$__);
                                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                    value_list = tm_sort_full_record_value_list(value_list);
                                                                    {
                                                                        SubLObject cdolist_list_var_28 = value_list;
                                                                        SubLObject value_item = NIL;
                                                                        for (value_item = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , value_item = cdolist_list_var_28.first()) {
                                                                            {
                                                                                SubLObject value = value_item.first();
                                                                                SubLObject value_thesauri = second(value_item);
                                                                                SubLObject indent_29 = add(indent_level, ONE_INTEGER);
                                                                                SubLObject span_30 = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_29));
                                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_indent_row_internal(indent_29);
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                        if (NIL != span_30) {
                                                                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_utilities.html_markup(span_30);
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        }
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                if (NIL != forts.fort_p(value)) {
                                                                                                    tm_thesaurus_constant(value, NIL, T, T, value_thesauri, NIL, display_type);
                                                                                                } else {
                                                                                                    if (NIL != tm_internals.tm_url_predicateP(tm_internals.relation_constant_from_abbreviation(rel_symbol))) {
                                                                                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        html_utilities.html_markup(value);
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                            try {
                                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                                html_utilities.html_princ(value);
                                                                                                            } finally {
                                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                                    } else {
                                                                                                        html_utilities.html_princ(value);
                                                                                                    }
                                                                                                    if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_TERM_THESAURI)) {
                                                                                                        html_utilities.html_princ($str_alt64$__);
                                                                                                        html_utilities.html_princ(tm_internals.thesaurus_abbreviation(value_thesauri.first()));
                                                                                                        {
                                                                                                            SubLObject cdolist_list_var_34 = value_thesauri.rest();
                                                                                                            SubLObject thes = NIL;
                                                                                                            for (thes = cdolist_list_var_34.first(); NIL != cdolist_list_var_34; cdolist_list_var_34 = cdolist_list_var_34.rest() , thes = cdolist_list_var_34.first()) {
                                                                                                                html_utilities.html_princ($str_alt59$__);
                                                                                                                html_utilities.html_princ(tm_internals.thesaurus_abbreviation(thes));
                                                                                                            }
                                                                                                        }
                                                                                                        html_utilities.html_princ($str_alt37$_);
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                            }
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
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
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

    public static final SubLObject tm_display_tops(SubLObject constant, SubLObject thesauri_list, SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject forms = tm_internals.compute_tops(constant, thesauri_list, relation);
                if (NIL != forms) {
                    {
                        SubLObject indent = ZERO_INTEGER;
                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_br();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
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
                    {
                        SubLObject indent = ZERO_INTEGER;
                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt74$Tops_);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
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
                    if (NIL != forms) {
                        {
                            SubLObject indent = ZERO_INTEGER;
                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_br();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
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
                    {
                        SubLObject cdolist_list_var = forms;
                        SubLObject f = NIL;
                        for (f = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , f = cdolist_list_var.first()) {
                            {
                                SubLObject top = f.first();
                                SubLObject mts = second(f);
                                SubLObject indent = ZERO_INTEGER;
                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                tm_thesaurus_constant(top, NIL, T, T, thesauri_list, mts, $HIERARCHICAL);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
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
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_display_full_parent_paths(SubLObject parent_paths, SubLObject mts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_ids = Mapping.mapcar(symbol_function(CB_FORT_IDENTIFIER), mts);
                SubLObject relation = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_RELATION);
                SubLObject relation_id = cb_utilities.cb_fort_identifier(relation);
                SubLObject last_items = NIL;
                SubLObject previous = NIL;
                SubLObject cdolist_list_var = parent_paths;
                SubLObject path = NIL;
                for (path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , path = cdolist_list_var.first()) {
                    {
                        SubLObject _prev_bind_0 = $tm_current_indent_level$.currentBinding(thread);
                        try {
                            $tm_current_indent_level$.bind(ZERO_INTEGER, thread);
                            {
                                SubLObject last = last(path, UNPROVIDED).first();
                                SubLObject cdolist_list_var_39 = path;
                                SubLObject item = NIL;
                                for (item = cdolist_list_var_39.first(); NIL != cdolist_list_var_39; cdolist_list_var_39 = cdolist_list_var_39.rest() , item = cdolist_list_var_39.first()) {
                                    if (NIL != misc_kb_utilities.constant_or_natP(item)) {
                                        $tm_current_indent_level$.setDynamicValue(add($tm_current_indent_level$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject indent = $tm_current_indent_level$.getDynamicValue(thread);
                                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject previous_id = cb_utilities.cb_fort_identifier(previous);
                                                                SubLObject item_id = cb_utilities.cb_fort_identifier(item);
                                                                SubLObject id_form = list(list(relation_id, item_id, previous_id), mt_ids);
                                                                if (NIL != previous) {
                                                                    tm_hd_rel_link(id_form);
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt69$_);
                                                                }
                                                                if (item.equal(last)) {
                                                                    {
                                                                        SubLObject item_var = item_id;
                                                                        if (NIL == member(item_var, last_items, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                            last_items = cons(item_var, last_items);
                                                                        }
                                                                    }
                                                                }
                                                                tm_thesaurus_constant(item, tm_internals.tm_string_for_constant(item, UNPROVIDED, UNPROVIDED, UNPROVIDED), T, T, mts, NIL, $HIERARCHICAL);
                                                                previous = item;
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
                                        }
                                        if ($tm_current_indent_level$.getDynamicValue(thread).numG($tm_deepest_indent_level$.getDynamicValue(thread))) {
                                            $tm_deepest_indent_level$.setDynamicValue($tm_current_indent_level$.getDynamicValue(thread), thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            $tm_current_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    previous = NIL;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_fill_parent_node_vector(SubLObject parent_node_vector, SubLObject parent_paths, SubLObject n) {
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject table = aref(parent_node_vector, i);
                    SubLObject cdolist_list_var = parent_paths;
                    SubLObject path = NIL;
                    for (path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , path = cdolist_list_var.first()) {
                        {
                            SubLObject pair = list_utilities.first_n(TWO_INTEGER, nthcdr(i, path));
                            if (NIL != pair) {
                                {
                                    SubLObject key = pair.first();
                                    SubLObject item = second(pair);
                                    SubLObject val = gethash(key, table, UNPROVIDED);
                                    SubLObject v_new = (NIL != item) ? ((SubLObject) (adjoin(item, val, symbol_function(EQUAL), UNPROVIDED))) : val;
                                    if (NIL != key) {
                                        sethash(key, table, v_new);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return parent_node_vector;
    }

    public static final SubLObject tm_parent_node_vector_length(SubLObject vector) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdotimes_end_var = length(vector);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject table = aref(vector, i);
                    SubLObject size = hash_table_count(table);
                    if (size.numG(ZERO_INTEGER)) {
                        count = add(count, ONE_INTEGER);
                    }
                    if (size.numE(ZERO_INTEGER)) {
                        return count;
                    }
                }
            }
            return count;
        }
    }

    public static final SubLObject tm_trace_parent_paths(SubLObject vector, SubLObject vector_index, SubLObject tm_constant, SubLObject parent_term, SubLObject mts, SubLObject mt_ids, SubLObject relation_id, SubLObject longest) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!vector_index.numGE(longest)) {
                {
                    SubLObject table = aref(vector, vector_index);
                    SubLObject descendants = gethash(tm_constant, table, UNPROVIDED);
                    SubLObject sorted_descendants = Sort.sort(descendants, symbol_function(STRING_LESSP), symbol_function(TM_STRING_FOR_CONSTANT));
                    SubLObject seenP = gethash(tm_constant, $tm_duplicate_node_table$.getDynamicValue(thread), UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = $tm_current_indent_level$.currentBinding(thread);
                        try {
                            $tm_current_indent_level$.bind(add($tm_current_indent_level$.getDynamicValue(thread), ONE_INTEGER), thread);
                            if (NIL != misc_kb_utilities.constant_or_natP(tm_constant)) {
                                {
                                    SubLObject indent = $tm_current_indent_level$.getDynamicValue(thread);
                                    SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject previous_id = cb_utilities.cb_fort_identifier(parent_term);
                                                        SubLObject item_id = cb_utilities.cb_fort_identifier(tm_constant);
                                                        SubLObject id_form = list(list(relation_id, item_id, previous_id), mt_ids);
                                                        if (NIL != parent_term) {
                                                            tm_hd_rel_link(id_form);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt69$_);
                                                        }
                                                        tm_thesaurus_constant(tm_constant, tm_internals.tm_string_for_constant(tm_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED), T, T, mts, NIL, $HIERARCHICAL);
                                                        if ((NIL != seenP) && (NIL != descendants)) {
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt78$______see_above_);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        }
                                                        if ($tm_current_indent_level$.getDynamicValue(thread).numG($tm_deepest_indent_level$.getDynamicValue(thread))) {
                                                            $tm_deepest_indent_level$.setDynamicValue($tm_current_indent_level$.getDynamicValue(thread), thread);
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
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
                                if (NIL == seenP) {
                                    sethash(tm_constant, $tm_duplicate_node_table$.getDynamicValue(thread), T);
                                    {
                                        SubLObject cdolist_list_var = sorted_descendants;
                                        SubLObject descendant = NIL;
                                        for (descendant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , descendant = cdolist_list_var.first()) {
                                            tm_trace_parent_paths(vector, add(vector_index, ONE_INTEGER), descendant, tm_constant, mts, mt_ids, relation_id, longest);
                                        }
                                    }
                                }
                            }
                        } finally {
                            $tm_current_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_display_truncated_parent_paths(SubLObject parent_paths, SubLObject mts, SubLObject longest) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_initialize_parent_node_vector(longest);
            tm_clear_duplicate_node_table();
            {
                SubLObject vector = tm_get_parent_node_vector(UNPROVIDED);
                SubLObject mt_ids = Mapping.mapcar(symbol_function(CB_FORT_IDENTIFIER), mts);
                SubLObject relation = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_RELATION);
                SubLObject relation_id = cb_utilities.cb_fort_identifier(relation);
                {
                    SubLObject _prev_bind_0 = $tm_current_indent_level$.currentBinding(thread);
                    try {
                        $tm_current_indent_level$.bind($tm_deepest_indent_level$.getDynamicValue(thread), thread);
                        tm_fill_parent_node_vector(vector, parent_paths, longest);
                        {
                            SubLObject vector_index = ZERO_INTEGER;
                            SubLObject table = aref(vector, vector_index);
                            SubLObject keys = hash_table_utilities.list_table_keys(table);
                            SubLObject sorted_keys = Sort.sort(keys, symbol_function(STRING_LESSP), symbol_function(TM_STRING_FOR_CONSTANT));
                            SubLObject parent_term = NIL;
                            SubLObject cdolist_list_var = sorted_keys;
                            SubLObject tm_constant = NIL;
                            for (tm_constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tm_constant = cdolist_list_var.first()) {
                                tm_trace_parent_paths(vector, vector_index, tm_constant, parent_term, mts, mt_ids, relation_id, longest);
                            }
                        }
                    } finally {
                        $tm_current_indent_level$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            tm_initialize_parent_node_vector(UNPROVIDED);
            tm_clear_duplicate_node_table();
            return NIL;
        }
    }

    public static final SubLObject display_parent_paths(SubLObject parent_paths, SubLObject mts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != parent_paths) {
                {
                    SubLObject indent = ZERO_INTEGER;
                    SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_br();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
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
            if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EXPAND_PARENT_PATHS)) {
                tm_display_full_parent_paths(parent_paths, mts);
            } else {
                {
                    SubLObject longest = tm_internals.compute_longest_parent_path(parent_paths);
                    tm_initialize_parent_node_vector(longest);
                    tm_display_truncated_parent_paths(parent_paths, mts, longest);
                    tm_initialize_parent_node_vector(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject show_descendant_parameters(SubLObject child_depth_allowed, SubLObject child_depth_displayed, SubLObject specified_max_children, SubLObject children_displayed) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_DESCENDANT_PARMS)) {
                {
                    SubLObject depth_specified = (child_depth_allowed.isInteger()) ? ((SubLObject) (child_depth_allowed)) : $$$No_limit_specified;
                    SubLObject depth_displayed = (child_depth_displayed.isInteger()) ? ((SubLObject) (child_depth_displayed)) : $$$Preferred_depth;
                    SubLObject max_children = (specified_max_children.isInteger()) ? ((SubLObject) (specified_max_children)) : $$$No_limit_specified;
                    SubLObject number_displayed = (child_depth_allowed.equal(ONE_INTEGER)) ? ((SubLObject) ($$$All_available_for_level_1)) : max_children.isInteger() && children_displayed.isInteger() ? ((SubLObject) (children_displayed)) : $str_alt84$All_available__within_specified_c;
                    html_macros.verify_not_within_html_pre();
                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                    {
                        SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
                        try {
                            html_macros.$within_html_pre$.bind(T, thread);
                            {
                                SubLObject size_val = TWO_INTEGER;
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != size_val) {
                                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(size_val);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(format(NIL, $str_alt85$Preferred_maximum_NT_depth____A, depth_specified));
                                        html_utilities.html_br();
                                        html_utilities.html_princ(format(NIL, $str_alt86$Maximum_NT_depth_allowed______A, depth_displayed));
                                        html_utilities.html_br();
                                        html_utilities.html_princ(format(NIL, $str_alt87$Preferred_maximum_NT_number___A, max_children));
                                        html_utilities.html_br();
                                        html_utilities.html_princ(format(NIL, $str_alt88$Number_of_NTs_displayed_______A, number_displayed));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_display_ancestors(SubLObject constant, SubLObject height, SubLObject relation, SubLObject mts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_clear_duplicate_node_table();
            if (!height.equal(ZERO_INTEGER)) {
                {
                    SubLObject parent_paths = tm_internals.construct_parent_paths(constant, mts, height, relation, UNPROVIDED, UNPROVIDED);
                    if (NIL != parent_paths) {
                        {
                            SubLObject indent = ZERO_INTEGER;
                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_br();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
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
                        {
                            SubLObject indent = ZERO_INTEGER;
                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt89$BTs_);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            display_parent_paths(parent_paths, mts);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
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
                    } else {
                        {
                            SubLObject indent = ZERO_INTEGER;
                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_br();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
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
                        {
                            SubLObject indent = ZERO_INTEGER;
                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($$$No_broader_terms);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
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
                }
                tm_clear_duplicate_node_table();
            }
            return NIL;
        }
    }

    public static final SubLObject tm_hierarchy_display_term(SubLObject constant, SubLObject mts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.valid_fortP(constant)) {
                {
                    SubLObject previous = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_PATHS);
                    SubLObject mt_ids = Mapping.mapcar(symbol_function(CB_FORT_IDENTIFIER), mts);
                    SubLObject id = cb_utilities.cb_fort_identifier(constant);
                    SubLObject relation_id = cb_utilities.cb_fort_identifier(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_RELATION));
                    SubLObject forms = list(mt_ids);
                    {
                        SubLObject _prev_bind_0 = $tm_current_indent_level$.currentBinding(thread);
                        try {
                            $tm_current_indent_level$.bind($tm_deepest_indent_level$.getDynamicValue(thread).numG(ZERO_INTEGER) ? ((SubLObject) (add($tm_deepest_indent_level$.getDynamicValue(thread), ONE_INTEGER))) : ONE_INTEGER, thread);
                            {
                                SubLObject cdolist_list_var = previous;
                                SubLObject p = NIL;
                                for (p = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , p = cdolist_list_var.first()) {
                                    {
                                        SubLObject p_fort_id = cb_utilities.cb_fort_identifier(last(p, UNPROVIDED).first());
                                        forms = cons(list(relation_id, id, p_fort_id), forms);
                                    }
                                }
                                {
                                    SubLObject indent = ZERO_INTEGER;
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
                                                    html_utilities.html_br();
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
                                }
                                {
                                    SubLObject indent = ZERO_INTEGER;
                                    SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt91$Term_);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
                                {
                                    SubLObject indent = ZERO_INTEGER;
                                    SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_br();
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
                                if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DETAILED_HIERARCHY_TERM)) {
                                    tm_elaborate_thesaurus_constant(constant, previous, forms, $tm_current_indent_level$.getDynamicValue(thread), $HIERARCHICAL);
                                } else {
                                    {
                                        SubLObject indent = $tm_current_indent_level$.getDynamicValue(thread);
                                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != previous) {
                                                            tm_hd_rel_link(forms);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt69$_);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        {
                                                            SubLObject size_val = FIVE_INTEGER;
                                                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                            if (NIL != size_val) {
                                                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(size_val);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    if (NIL == tm_internals.thesaurus_gensymP(constant)) {
                                                                        html_thesaurus.tm_link($CYC_CONCEPT, constant, UNPROVIDED, UNPROVIDED);
                                                                        html_utilities.html_indent(ONE_INTEGER);
                                                                    }
                                                                    tm_thesaurus_constant(constant, tm_internals.tm_string_for_constant(constant, UNPROVIDED, UNPROVIDED, UNPROVIDED), T, T, mts, NIL, $HIERARCHICAL);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
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
                                if ($tm_current_indent_level$.getDynamicValue(thread).numG($tm_deepest_indent_level$.getDynamicValue(thread))) {
                                    $tm_deepest_indent_level$.setDynamicValue($tm_current_indent_level$.getDynamicValue(thread), thread);
                                }
                            }
                        } finally {
                            $tm_current_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_display_descendants(SubLObject constant, SubLObject mts, SubLObject child_depth, SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_clear_duplicate_node_table();
            if (!tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CHILD_DEPTH).equal(ZERO_INTEGER)) {
                {
                    SubLObject nodes = NIL;
                    SubLObject all_spec_preds = NIL;
                    SubLObject relations_to_use = NIL;
                    SubLObject active_relations = NIL;
                    {
                        SubLObject _prev_bind_0 = $tm_current_indent_level$.currentBinding(thread);
                        try {
                            $tm_current_indent_level$.bind(add($tm_deepest_indent_level$.getDynamicValue(thread), ONE_INTEGER), thread);
                            {
                                SubLObject _prev_bind_0_59 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    active_relations = tm_internals.tm_active_relations();
                                    all_spec_preds = genl_predicates.all_spec_preds(relation, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_59, thread);
                                }
                            }
                            relations_to_use = intersection(all_spec_preds, active_relations, UNPROVIDED, UNPROVIDED);
                            nodes = delete(constant, tm_internals.nt(constant, relation, mts, NIL, NIL, relations_to_use, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) {
                                format(T, $str_alt96$____Now_inside_scope_of__s____, TM_DISPLAY_DESCENDANTS);
                                format(T, $str_alt98$____Term___s, constant);
                                format(T, $str_alt99$____Next_nodes___s, nodes);
                            }
                            {
                                SubLObject preferred_nodes = list_utilities.delete_if_not(symbol_function(PREFERRED_TERMS), nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject sorted_nodes = NIL;
                                SubLObject depth = (child_depth.isInteger()) ? ((SubLObject) (add($tm_current_indent_level$.getDynamicValue(thread), child_depth))) : NIL;
                                if ((NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) && (NIL != preferred_nodes)) {
                                    format(T, $str_alt101$____Sorting_nodes_____);
                                }
                                sorted_nodes = Sort.sort(preferred_nodes, symbol_function(STRING_LESSP), symbol_function(TM_STRING_FOR_CONSTANT));
                                if ((NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) && (NIL != preferred_nodes)) {
                                    format(T, $str_alt102$done_);
                                }
                                if ((NIL != sorted_nodes) && (!child_depth.equal(ZERO_INTEGER))) {
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt103$NTs_);
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
                                        SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$html_indent_table_max$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$html_indent_table_max$.bind($int$50, thread);
                                            {
                                                SubLObject cdolist_list_var = sorted_nodes;
                                                SubLObject node = NIL;
                                                for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                                    tm_print_nodes_2(node, mts, depth, $tm_current_indent_level$.getDynamicValue(thread), relations_to_use);
                                                }
                                                html_utilities.html_indent_table_internal(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEPTH_SPACING));
                                            }
                                        } finally {
                                            html_macros.$html_indent_table_max$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                } else {
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($$$No_narrower_terms);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_br();
                                }
                            }
                        } finally {
                            $tm_current_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            tm_clear_duplicate_node_table();
            return NIL;
        }
    }

    public static final SubLObject tm_show_hd_relation(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relation = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_RELATION);
                SubLObject name = rassoc(bq_cons(relation, $list_alt106), tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED).first();
                if (relation != $$broaderTerm) {
                    {
                        SubLObject indent = ZERO_INTEGER;
                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt108$Key_Relation__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_thesaurus.tm_link($RELATION, name, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
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
            }
            return NIL;
        }
    }

    public static final SubLObject tm_print_nodes_1(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEPTH_SPACING)) {
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEPTH_SPACING, TWO_INTEGER, UNPROVIDED);
            }
            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $kw110$DETAILS_SHOWN_, NIL, UNPROVIDED);
            compute_allowable_depth(constant);
            {
                SubLObject _prev_bind_0 = $tm_current_indent_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = $tm_deepest_indent_level$.currentBinding(thread);
                try {
                    $tm_current_indent_level$.bind(ZERO_INTEGER, thread);
                    $tm_deepest_indent_level$.bind(ZERO_INTEGER, thread);
                    {
                        SubLObject selected = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SELECTED_THESAURUS);
                        SubLObject mts = (NIL != selected) ? ((SubLObject) (list(selected))) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
                        SubLObject relation = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_RELATION);
                        SubLObject parent_depth = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $PARENT_DEPTH);
                        SubLObject specified_child_depth = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CHILD_DEPTH);
                        SubLObject max_children = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $MAX_CHILDREN);
                        SubLObject child_depth = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $COMPUTED_MAX_DEPTH);
                        SubLObject child_count = html_thesaurus.$child_counter$.getDynamicValue(thread);
                        if (NIL == parent_depth) {
                            parent_depth = tm_datastructures.$tm_max_parent_depth_limit$.getDynamicValue(thread);
                        }
                        {
                            SubLObject _prev_bind_0_62 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1_63 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                                mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                                show_descendant_parameters(specified_child_depth, child_depth, max_children, child_count);
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
                                    SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1_65 = html_macros.$html_indent_table_max$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$html_indent_table_max$.bind($int$50, thread);
                                        tm_show_hd_relation(UNPROVIDED);
                                        tm_display_tops(constant, mts, relation);
                                        tm_display_ancestors(constant, parent_depth, relation, mts);
                                        tm_hierarchy_display_term(constant, mts);
                                        html_utilities.html_indent_table_internal(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEPTH_SPACING));
                                    } finally {
                                        html_macros.$html_indent_table_max$.rebind(_prev_bind_1_65, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_flush();
                                tm_display_descendants(constant, mts, child_depth, relation);
                                html_utilities.html_flush();
                                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SELECTED_THESAURUS, NIL, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_63, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_62, thread);
                            }
                        }
                    }
                } finally {
                    $tm_deepest_indent_level$.rebind(_prev_bind_1, thread);
                    $tm_current_indent_level$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject hd_preferred_nodes(SubLObject constant, SubLObject relation, SubLObject mts, SubLObject relations_to_use) {
        {
            SubLObject nodes = delete(constant, tm_internals.nt(constant, relation, mts, NIL, NIL, relations_to_use, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject preferred_nodes = list_utilities.delete_if_not(symbol_function(PREFERRED_TERMS), nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return preferred_nodes;
        }
    }

    public static final SubLObject tm_print_nodes_2(SubLObject constant, SubLObject mts, SubLObject max, SubLObject depth, SubLObject relations_to_use) {
        if (mts == UNPROVIDED) {
            mts = NIL;
        }
        if (max == UNPROVIDED) {
            max = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        if (relations_to_use == UNPROVIDED) {
            relations_to_use = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) {
                format(T, $str_alt114$____Entering__s, TM_PRINT_NODES_2);
                format(T, $str_alt116$___________Term___s, constant);
                format(T, $str_alt117$______Max_depth___s, max);
                format(T, $str_alt118$__Current_depth___s, depth);
            }
            {
                SubLObject previous_id = (NIL != $tm_previous_node_id$.getDynamicValue(thread)) ? ((SubLObject) ($tm_previous_node_id$.getDynamicValue(thread))) : cb_utilities.cb_fort_identifier(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM));
                SubLObject mt_ids = Mapping.mapcar(symbol_function(CB_FORT_IDENTIFIER), mts);
                SubLObject id = cb_utilities.cb_fort_identifier(constant);
                SubLObject relation = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_RELATION);
                SubLObject relation_id = cb_utilities.cb_fort_identifier(relation);
                SubLObject form = list(list(relation_id, id, previous_id), mt_ids);
                SubLObject seenP = gethash(id, $tm_duplicate_node_table$.getDynamicValue(thread), UNPROVIDED);
                SubLObject truncate_paths = makeBoolean(NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EXPAND_PARENT_PATHS));
                SubLObject preferred_nodes = NIL;
                SubLObject sorted_nodes = NIL;
                if (id.isInteger() && ((NIL == max) || depth.numL(max))) {
                    {
                        SubLObject indent = depth;
                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        tm_hd_rel_link(form);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt69$_);
                                        tm_thesaurus_constant(constant, tm_internals.tm_string_for_constant(constant, NIL, mts, UNPROVIDED), T, T, mts, NIL, $HIERARCHICAL);
                                        if (((NIL != truncate_paths) && (NIL != seenP)) || (max.isInteger() && depth.numE(subtract(max, ONE_INTEGER)))) {
                                            preferred_nodes = hd_preferred_nodes(constant, relation, mts, relations_to_use);
                                            if (NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) {
                                                format(T, $str_alt119$_____Next_nodes___s, preferred_nodes);
                                            }
                                            if (NIL != preferred_nodes) {
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt120$____);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                if ((NIL != truncate_paths) && (NIL != seenP)) {
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt121$__see_above_);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
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
                    if (!(((NIL != truncate_paths) && (NIL != seenP)) || (max.isInteger() && depth.numGE(subtract(max, ONE_INTEGER))))) {
                        if (NIL == preferred_nodes) {
                            preferred_nodes = hd_preferred_nodes(constant, relation, mts, relations_to_use);
                        }
                        if ((NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) && ((NIL == max) || depth.numL(subtract(max, ONE_INTEGER)))) {
                            format(T, $str_alt119$_____Next_nodes___s, preferred_nodes);
                        }
                        if ((NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) && (NIL != preferred_nodes)) {
                            format(T, $str_alt101$____Sorting_nodes_____);
                        }
                        sorted_nodes = Sort.sort(preferred_nodes, symbol_function(STRING_LESSP), symbol_function(TM_STRING_FOR_CONSTANT));
                        if ((NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) && (NIL != preferred_nodes)) {
                            format(T, $str_alt102$done_);
                        }
                        sethash(id, $tm_duplicate_node_table$.getDynamicValue(thread), T);
                        {
                            SubLObject _prev_bind_0 = $tm_previous_node_id$.currentBinding(thread);
                            try {
                                $tm_previous_node_id$.bind(id, thread);
                                {
                                    SubLObject cdolist_list_var = sorted_nodes;
                                    SubLObject node = NIL;
                                    for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                        tm_print_nodes_2(node, mts, max, add(depth, ONE_INTEGER), relations_to_use);
                                    }
                                }
                            } finally {
                                $tm_previous_node_id$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject compute_allowable_depth(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_thesaurus.$child_counter$.setDynamicValue(ZERO_INTEGER, thread);
            if (NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) {
                format(T, $str_alt122$____Inside_scope_of__s____, COMPUTE_ALLOWABLE_DEPTH);
            }
            {
                SubLObject child_depth = (tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE) == $BASIC) ? ((SubLObject) (tm_datastructures.$tm_basic_interface_hierarchy_depth$.getDynamicValue(thread))) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $CHILD_DEPTH);
                SubLObject max_children = (tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE) == $BASIC) ? ((SubLObject) ($int$200)) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $MAX_CHILDREN);
                SubLObject relation = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_RELATION);
                SubLObject active_relations = NIL;
                SubLObject all_spec_preds = NIL;
                SubLObject relations_to_use = NIL;
                SubLObject selected = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SELECTED_THESAURUS);
                SubLObject mts = (NIL != selected) ? ((SubLObject) (list(selected))) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
                if (NIL == child_depth) {
                    child_depth = tm_datastructures.$tm_max_child_depth_limit$.getDynamicValue(thread);
                }
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        active_relations = tm_internals.tm_active_relations();
                        all_spec_preds = genl_predicates.all_spec_preds(relation, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                relations_to_use = intersection(active_relations, all_spec_preds, UNPROVIDED, UNPROVIDED);
                if (child_depth.equal(ONE_INTEGER) || (NIL == max_children)) {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $COMPUTED_MAX_DEPTH, child_depth, UNPROVIDED);
                } else
                    if (child_depth.equal(ZERO_INTEGER)) {
                        tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $COMPUTED_MAX_DEPTH, ZERO_INTEGER, UNPROVIDED);
                    } else {
                        {
                            SubLObject level = ZERO_INTEGER;
                            SubLObject total_counted = ZERO_INTEGER;
                            SubLObject nodes = list(constant);
                            SubLObject temp = NIL;
                            for (; !(((NIL == nodes) || (total_counted.numG(max_children) && level.numG(ONE_INTEGER))) || (child_depth.isInteger() && level.numGE(child_depth)));) {
                                level = add(level, ONE_INTEGER);
                                html_thesaurus.$child_counter$.setDynamicValue(total_counted, thread);
                                {
                                    SubLObject doneP = NIL;
                                    if (NIL == doneP) {
                                        {
                                            SubLObject csome_list_var = nodes;
                                            SubLObject node = NIL;
                                            for (node = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node = csome_list_var.first()) {
                                                {
                                                    SubLObject preferred_new = hd_preferred_nodes(node, relation, mts, relations_to_use);
                                                    temp = append(temp, preferred_new);
                                                    total_counted = add(total_counted, length(preferred_new));
                                                    doneP = numG(total_counted, max_children);
                                                }
                                            }
                                        }
                                    }
                                }
                                nodes = temp;
                                temp = NIL;
                                if (NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) {
                                    format(T, $str_alt124$____);
                                    format(T, $str_alt125$Level_finished___s, level);
                                    format(T, $str_alt126$__);
                                    format(T, $str_alt127$___Total_count___s, total_counted);
                                }
                            }
                            if (total_counted.numG(max_children) && level.numG(ONE_INTEGER)) {
                                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $COMPUTED_MAX_DEPTH, level.numG(ONE_INTEGER) ? ((SubLObject) (subtract(level, ONE_INTEGER))) : ONE_INTEGER, UNPROVIDED);
                            } else {
                                html_thesaurus.$child_counter$.setDynamicValue(total_counted, thread);
                                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $COMPUTED_MAX_DEPTH, child_depth, UNPROVIDED);
                            }
                        }
                    }

            }
            return NIL;
        }
    }

    public static final SubLObject tm_name_of_ass_mt(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject string = tm_internals.thesaurus_name(mt);
            SubLObject name = (string.isString()) ? ((SubLObject) (string)) : misc_kb_utilities.coerce_name(mt);
            return name;
        }
    }

    public static final SubLObject tm_hd_relation(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = args.first();
                SubLObject form = (string.isString()) ? ((SubLObject) (read_from_string_ignoring_errors(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                SubLObject forms = butlast(form, UNPROVIDED);
                SubLObject first_form = forms.first();
                SubLObject mts = Mapping.mapcar(symbol_function(TM_GUESS_FORT), last(form, UNPROVIDED).first());
                SubLObject constant = html_thesaurus.tm_guess_fort(second(first_form));
                SubLObject relation = html_thesaurus.tm_guess_fort(first_form.first());
                SubLObject active_relations = tm_internals.tm_active_relations();
                SubLObject assertions_to_use = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject cdolist_list_var = forms;
                            SubLObject x = NIL;
                            for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                                {
                                    SubLObject arg2 = html_thesaurus.tm_guess_fort(third(x));
                                    SubLObject assertions = virtual_indexing.assertions_mentioning_terms(function_terms.unnatify_terms(list(constant, arg2)), T);
                                    SubLObject cdolist_list_var_67 = assertions;
                                    SubLObject ass = NIL;
                                    for (ass = cdolist_list_var_67.first(); NIL != cdolist_list_var_67; cdolist_list_var_67 = cdolist_list_var_67.rest() , ass = cdolist_list_var_67.first()) {
                                        {
                                            SubLObject formula = assertions_high.assertion_formula(ass);
                                            SubLObject pred = formula.first();
                                            SubLObject mt = assertions_high.assertion_mt(ass);
                                            if (((NIL != find(mt, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != find(pred, active_relations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && ((NIL != genl_predicates.genl_predP(pred, relation, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_predP(relation, pred, UNPROVIDED, UNPROVIDED)))) {
                                                {
                                                    SubLObject item_var = ass;
                                                    if (NIL == member(item_var, assertions_to_use, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        assertions_to_use = cons(item_var, assertions_to_use);
                                                    }
                                                }
                                            }
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
                assertions_to_use = Sort.sort(assertions_to_use, symbol_function(STRING_LESSP), symbol_function(TM_NAME_OF_ASS_MT));
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(format(NIL, $str_alt130$Hierarchy_Relations_for___A_, tm_internals.tm_string_for_constant(constant, NIL, mts, UNPROVIDED)));
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
                                SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(format(NIL, $str_alt130$Hierarchy_Relations_for___A_, tm_internals.tm_string_for_constant(constant, NIL, mts, UNPROVIDED)));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(format(NIL, $str_alt130$Hierarchy_Relations_for___A_, tm_internals.tm_string_for_constant(constant, NIL, mts, UNPROVIDED)));
                                    html_thesaurus.thesaurus_heading($str_alt131$tm_hd_relation);
                                    if (NIL != assertions_to_use) {
                                        {
                                            SubLObject len = length(assertions_to_use);
                                            html_utilities.html_br();
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt132$The_following_statement_A__A_true, len.numE(ONE_INTEGER) ? ((SubLObject) ($str_alt55$)) : $$$s, len.numE(ONE_INTEGER) ? ((SubLObject) ($$$is)) : $$$are);
                                            tm_thesaurus_constant(constant, tm_internals.tm_string_for_constant(constant, NIL, mts, UNPROVIDED), NIL, NIL, mts, UNPROVIDED, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt136$_);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var = assertions_to_use;
                                                    SubLObject ass = NIL;
                                                    for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                                                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_tm_editing.html_print_thesaurus_assertion(ass);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                                    } else {
                                        html_utilities.html_br();
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt137$No_valid_relationship_between___A, tm_internals.tm_string_for_constant(constant, NIL, mts, UNPROVIDED));
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
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

    public static final SubLObject tm_hd_rel_link(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_HD_RELATION_LINKS)) {
                html_thesaurus.tm_link($HD_RELATION, form, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_hd(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SELECTED_THESAURUS, NIL, UNPROVIDED);
            return tm_node_link(args);
        }
    }

    public static final SubLObject tm_node_link(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject constant = html_thesaurus.tm_guess_fort(id);
                SubLObject message = second(args);
                if (NIL != constant) {
                    {
                        SubLObject concept_thesauri = tm_internals.thesauri_of_concept(constant);
                        if (NIL != intersection(concept_thesauri, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI), UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject pcase_var = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE);
                                if (pcase_var.eql($BASIC)) {
                                    if (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread)) {
                                        html_basic_thesaurus.tm_basic_print_nodes(constant, id, NIL, message);
                                    } else {
                                        tm_print_nodes(constant, id, UNPROVIDED);
                                    }
                                } else
                                    if (pcase_var.eql($ADVANCED)) {
                                        tm_print_nodes(constant, id, UNPROVIDED);
                                    } else {
                                        return html_thesaurus.tm_error($$$Could_not_determine_interface, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }

                            }
                        } else {
                            tm_report_not_in_active_thesauri(constant);
                        }
                    }
                } else {
                    html_thesaurus.tm_error($str_alt144$Couldn_t_determine_a_thesaurus_te, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_selected_hierarchical_link(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject thesaurus_id = read_from_string_ignoring_errors(second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject constant = html_thesaurus.tm_guess_fort(term_id);
                SubLObject selected_thesaurus = html_thesaurus.tm_guess_fort(thesaurus_id);
                if (NIL != forts.valid_fortP(selected_thesaurus)) {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SELECTED_THESAURUS, selected_thesaurus, UNPROVIDED);
                } else {
                    html_thesaurus.tm_error($str_alt146$Couldn_t_determine_a_thesaurus_fr, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != forts.valid_fortP(constant)) {
                    tm_print_nodes(constant, term_id, NIL);
                } else {
                    html_thesaurus.tm_error($str_alt147$Couldn_t_determine_a_preferred_te, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_add_thesaurus_hierarchical_link(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus_id = read_from_string_ignoring_errors(second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject added_thesaurus = html_thesaurus.tm_guess_fort(thesaurus_id);
                SubLObject thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
                if (NIL == forts.valid_fortP(added_thesaurus)) {
                    return html_thesaurus.tm_error($str_alt146$Couldn_t_determine_a_thesaurus_fr, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject item_var = added_thesaurus;
                    if (NIL == member(item_var, thesauri, symbol_function(EQL), symbol_function(IDENTITY))) {
                        thesauri = cons(item_var, thesauri);
                    }
                }
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, thesauri, UNPROVIDED);
                tm_node_link(list(args.first()));
            }
            return NIL;
        }
    }

    /**
     * short name for tm-switch-thesaurus-hierarchical-link.
     */
    public static final SubLObject tm_swh(SubLObject args) {
        return tm_switch_thesaurus_hierarchical_link(args);
    }

    public static final SubLObject tm_switch_thesaurus_hierarchical_link(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus_id = read_from_string_ignoring_errors(second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject switch_to_thesaurus = html_thesaurus.tm_guess_fort(thesaurus_id);
                SubLObject current_thesaurus = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI).first();
                SubLObject message = NIL;
                if (NIL == forts.valid_fortP(switch_to_thesaurus)) {
                    return html_thesaurus.tm_error($str_alt146$Couldn_t_determine_a_thesaurus_fr, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (current_thesaurus != switch_to_thesaurus) {
                    message = cconcatenate($str_alt151$Active_Thesaurus_has_been_changed, tm_internals.thesaurus_name(switch_to_thesaurus));
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, list(switch_to_thesaurus), UNPROVIDED);
                }
                tm_node_link(list(args.first(), message));
            }
            return NIL;
        }
    }

    /**
     * Normal alpha display of a term -- either there or missing.
     */
    public static final SubLObject tm_ad(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = string_utilities.strcat(args);
                SubLObject title = (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCHING_ALL)) ? ((SubLObject) (format(NIL, $str_alt154$All_Thesauri_Alphabetical_search_, string))) : format(NIL, $str_alt155$Alphabetical_search_for___A_, string);
                SubLObject use_type = $ALPHA_TERM;
                thread.resetMultipleValues();
                {
                    SubLObject current_item = tm_internals.tm_alphabetical_placement(string, UNPROVIDED, UNPROVIDED);
                    SubLObject before_items = thread.secondMultipleValue();
                    SubLObject after_items = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != current_item) {
                        tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM, current_item.first(), UNPROVIDED);
                    } else {
                        use_type = $MISSING;
                        current_item = string;
                    }
                    tm_alpha_index(args, use_type, title, NIL, before_items, current_item, after_items);
                }
            }
            return NIL;
        }
    }

    /**
     * Redisplay current alpha display after toggling use-for display state
     */
    public static final SubLObject tm_ad_toggle(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject use_type = read_from_string_ignoring_errors(args.first(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                args = args.rest();
                {
                    SubLObject current = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $ALPHABETICAL_SHOW_USE_FORS);
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $ALPHABETICAL_SHOW_USE_FORS, makeBoolean(NIL == current), UNPROVIDED);
                    {
                        SubLObject pcase_var = use_type;
                        if (pcase_var.eql(QUOTE) || pcase_var.eql(ALPHA_TERM)) {
                            tm_ad(args);
                        } else
                            if (pcase_var.eql(QUOTE) || pcase_var.eql(MISSING)) {
                                tm_ad(args);
                            } else
                                if (pcase_var.eql(QUOTE) || pcase_var.eql(PAGEUP)) {
                                    tm_ad_pageup(args);
                                } else
                                    if (pcase_var.eql(QUOTE) || pcase_var.eql(PAGEDN)) {
                                        tm_ad_pagedn(args);
                                    } else {
                                        html_thesaurus.tm_error($str_alt165$Can_t_redisplay_alpha_use_type__S, use_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }



                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Page up the alpha display
     */
    public static final SubLObject tm_ad_pageup(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tm_ad_scroll($PAGEUP, subtract(tm_internals.$tm_alpha_total_count$.getDynamicValue(thread), ONE_INTEGER), ONE_INTEGER, args);
        }
    }

    /**
     * Page down the alpha display
     */
    public static final SubLObject tm_ad_pagedn(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tm_ad_scroll($PAGEDN, ZERO_INTEGER, tm_internals.$tm_alpha_total_count$.getDynamicValue(thread), args);
        }
    }

    /**
     * internals of tm-ad-pageup and tm-ad-pagedn
     */
    public static final SubLObject tm_ad_scroll(SubLObject use_type, SubLObject before_count, SubLObject after_count, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject post_rotation = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt171);
                post_rotation = current.first();
                current = current.rest();
                {
                    SubLObject pre_rotation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt171);
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject string = tm_datastructures.tm_rotated_index_string(post_rotation, pre_rotation);
                            SubLObject title = $$$Alphabetical_index_scroll;
                            thread.resetMultipleValues();
                            {
                                SubLObject current_item = tm_internals.tm_alphabetical_placement(string, before_count, after_count);
                                SubLObject before_items = thread.secondMultipleValue();
                                SubLObject after_items = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != current_item) {
                                    after_items = cons(current_item, after_items);
                                    current_item = NIL;
                                }
                                tm_alpha_index(args, use_type, title, NIL, before_items, NIL, after_items);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt171);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Display string with a warning message that it is not present in the thesaurus.
     */
    public static final SubLObject tm_ad_not_present(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = args.first();
                SubLObject title = format(NIL, $str_alt173$_S_not_present, string);
                SubLObject message = format(NIL, $str_alt174$_S_was_not_found_as_a_thesaurus_t, string);
                thread.resetMultipleValues();
                {
                    SubLObject current_item = tm_internals.tm_alphabetical_placement(string, UNPROVIDED, UNPROVIDED);
                    SubLObject before_items = thread.secondMultipleValue();
                    SubLObject after_items = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != current_item) {
                        after_items = cons(current_item, after_items);
                        current_item = NIL;
                    }
                    tm_alpha_index(args, $MISSING, title, message, before_items, string, after_items);
                }
            }
            return NIL;
        }
    }

    /**
     * The guts of all the alpha display handling.
     */
    public static final SubLObject tm_alpha_index(SubLObject args, SubLObject use_type, SubLObject title, SubLObject message, SubLObject before_items, SubLObject central_item, SubLObject after_items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_ALPHABETICAL);
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
                            SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(title);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(title);
                                if (NIL != message) {
                                    html_utilities.html_princ(message);
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                }
                                if ((tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE) == $BASIC) && (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread))) {
                                    html_basic_thesaurus.thesaurus_basic_heading($str_alt177$tm_basic_show_alpha_results);
                                    html_utilities.html_br();
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt178$tm_show_alpha_results);
                                }
                                tm_alpha_position_bar(use_type, before_items, after_items);
                                tm_alpha_state_toggle(use_type, args);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
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
                                    SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = before_items;
                                            SubLObject item = NIL;
                                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                tm_alphabetical_item(item, UNPROVIDED);
                                            }
                                        }
                                        if (NIL != central_item) {
                                            tm_alphabetical_central_item(use_type, central_item);
                                        }
                                        {
                                            SubLObject cdolist_list_var = after_items;
                                            SubLObject item = NIL;
                                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                tm_alphabetical_item(item, UNPROVIDED);
                                            }
                                        }
                                        tm_alphabetical_rotation_column_frob_row();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
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

    // defparameter
    public static final SubLSymbol $tm_alpha_char_order$ = makeSymbol("*TM-ALPHA-CHAR-ORDER*");

    public static final SubLObject tm_alpha_position_bar(SubLObject use_type, SubLObject before_items, SubLObject after_items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pageup_possible = NIL;
                SubLObject pageup_item = NIL;
                SubLObject pagedn_possible = NIL;
                SubLObject pagedn_item = NIL;
                SubLObject pcase_var = use_type;
                if (pcase_var.eql($PAGEUP)) {
                    pageup_possible = numE(length(before_items), subtract(tm_internals.$tm_alpha_total_count$.getDynamicValue(thread), ONE_INTEGER));
                    pagedn_possible = T;
                } else
                    if (pcase_var.eql($PAGEDN)) {
                        pageup_possible = T;
                        pagedn_possible = numE(length(after_items), tm_internals.$tm_alpha_total_count$.getDynamicValue(thread));
                    } else
                        if (pcase_var.eql($ALPHA_TERM)) {
                            pageup_possible = numE(length(before_items), tm_internals.$tm_alpha_before$.getDynamicValue(thread));
                            pagedn_possible = numE(length(after_items), subtract(tm_internals.$tm_alpha_after$.getDynamicValue(thread), ONE_INTEGER));
                        } else {
                            pageup_possible = numE(length(before_items), tm_internals.$tm_alpha_before$.getDynamicValue(thread));
                            pagedn_possible = numE(length(after_items), tm_internals.$tm_alpha_after$.getDynamicValue(thread));
                        }


                if (NIL != pageup_possible) {
                    if (NIL != before_items) {
                        pageup_item = before_items.first().first();
                    } else
                        if (NIL != after_items) {
                            pageup_item = after_items.first().first();
                        }

                }
                if (NIL != pagedn_possible) {
                    if (NIL != after_items) {
                        pagedn_item = last(after_items, UNPROVIDED).first().first();
                    } else
                        if (NIL != before_items) {
                            pagedn_item = last(before_items, UNPROVIDED).first().first();
                        }

                }
                {
                    SubLObject size_val = TWO_INTEGER;
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                            if (NIL != pageup_possible) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject pre_rotation = tm_datastructures.tm_determine_rotation_split(pageup_item);
                                    SubLObject post_rotation = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    html_thesaurus.tm_link($ALPHA_PAGEUP, post_rotation, pre_rotation, UNPROVIDED);
                                    html_utilities.html_indent(TWO_INTEGER);
                                }
                            }
                            if (NIL != pagedn_possible) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject pre_rotation = tm_datastructures.tm_determine_rotation_split(pagedn_item);
                                    SubLObject post_rotation = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    html_thesaurus.tm_link($ALPHA_PAGEDN, post_rotation, pre_rotation, UNPROVIDED);
                                    html_utilities.html_indent(TWO_INTEGER);
                                }
                            }
                            {
                                SubLObject cdotimes_end_var = length($tm_alpha_char_order$.getDynamicValue(thread));
                                SubLObject i = NIL;
                                for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                                    {
                                        SubLObject v_char = Strings.sublisp_char($tm_alpha_char_order$.getDynamicValue(thread), i);
                                        if (!i.numE(ZERO_INTEGER)) {
                                            html_utilities.html_princ($str_alt182$_);
                                        }
                                        html_thesaurus.tm_link($ALPHABETICAL, v_char, v_char, UNPROVIDED);
                                    }
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                html_utilities.html_br();
                return NIL;
            }
        }
    }

    public static final SubLObject tm_alpha_state_toggle(SubLObject use_type, SubLObject args) {
        html_thesaurus.tm_link($ALPHA_STATE_TOGGLE, use_type, args, UNPROVIDED);
        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * The width of the columnn which enforces space between the pre- and
     * post-rotation parts of a rotated entry.
     */
    // defconstant
    private static final SubLSymbol $tm_alpha_mid_rotation_width$ = makeSymbol("*TM-ALPHA-MID-ROTATION-WIDTH*");

    /**
     * Print CENTRAL-ITEM according to USE-TYPE.
     */
    public static final SubLObject tm_alphabetical_central_item(SubLObject use_type, SubLObject central_item) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (central_item.isString()) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($MIDDLE));
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
                            SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
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
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(FIVE_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color($RED));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt187$_____);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (NIL != $tm_alpha_mid_rotation_width$.getGlobalValue()) {
                            html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($tm_alpha_mid_rotation_width$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ($str_alt69$_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
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
                            SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                {
                                    SubLObject size_val = FIVE_INTEGER;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != size_val) {
                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(size_val);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt189$__A_, central_item);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                                if (use_type == $MISSING) {
                                    {
                                        SubLObject size_val = FOUR_INTEGER;
                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (NIL != size_val) {
                                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(size_val);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt190$would_be_here_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            } else {
                tm_alphabetical_item(central_item, T);
            }
            return NIL;
        }
    }

    /**
     * The minimun width in characters of the alphabetical rotation column
     */
    // defparameter
    public static final SubLSymbol $tm_minimum_alpha_rotation_column_width$ = makeSymbol("*TM-MINIMUM-ALPHA-ROTATION-COLUMN-WIDTH*");

    /**
     * Ensure that the alpha table rotation column has a minmum width
     */
    public static final SubLObject tm_alphabetical_rotation_column_frob_row() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.verify_not_within_html_pre();
                            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            {
                                SubLObject _prev_bind_0_86 = html_macros.$within_html_pre$.currentBinding(thread);
                                try {
                                    html_macros.$within_html_pre$.bind(T, thread);
                                    html_utilities.html_indent($tm_minimum_alpha_rotation_column_width$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$within_html_pre$.rebind(_prev_bind_0_86, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_terpri(UNPROVIDED);
            return NIL;
        }
    }

    /**
     * If a lexical variant is identical to its PT, don't print it in the alpha index.
     */
    // defparameter
    public static final SubLSymbol $tm_suppress_alt_terms_identical_to_ptP$ = makeSymbol("*TM-SUPPRESS-ALT-TERMS-IDENTICAL-TO-PT?*");

    /**
     * ALPHA-ITEM is of the form (<string> . <assertions>)
     * The assertions are the preferredTerm and useFor assertions corresponding to the string.
     * For the preferred terms, print the string as an active link.
     * for the use fors, print as inactive and refer user to
     * preferred term(s) as active links
     */
    public static final SubLObject tm_alphabetical_item(SubLObject alpha_item, SubLObject highlight) {
        if (highlight == UNPROVIDED) {
            highlight = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCHING_ALL)) {
                return tm_alphabetical_item_all(alpha_item, highlight);
            }
            {
                SubLObject basicP = makeBoolean((tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE) == $BASIC) && (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread)));
                SubLObject basic_thesaurus_id = (NIL != basicP) ? ((SubLObject) (cb_utilities.cb_fort_identifier(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI).first()))) : NIL;
                SubLObject datum = alpha_item;
                SubLObject current = datum;
                SubLObject string = NIL;
                SubLObject assertions = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt191);
                string = current.first();
                current = current.rest();
                assertions = current;
                string = tm_right_case(string, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject before_rotation = tm_datastructures.tm_determine_rotation_split(string);
                    SubLObject after_rotation = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject preferred_term_assertions = tm_internals.extract_signs_matching(assertions, $LEXPRED, $$preferredTerm);
                        if (NIL != preferred_term_assertions) {
                            {
                                SubLObject preferred_constants = delete_duplicates(Mapping.mapcar(symbol_function(GAF_ARG1), preferred_term_assertions), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject cdolist_list_var = preferred_constants;
                                SubLObject preferred_constant = NIL;
                                for (preferred_constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , preferred_constant = cdolist_list_var.first()) {
                                    {
                                        SubLObject id = cb_utilities.cb_fort_identifier(preferred_constant);
                                        SubLObject pt_assertions_of_preferred_constant = NIL;
                                        SubLObject preferred_thesauri = NIL;
                                        SubLObject cdolist_list_var_88 = preferred_term_assertions;
                                        SubLObject preferred_term_assertion = NIL;
                                        for (preferred_term_assertion = cdolist_list_var_88.first(); NIL != cdolist_list_var_88; cdolist_list_var_88 = cdolist_list_var_88.rest() , preferred_term_assertion = cdolist_list_var_88.first()) {
                                            if (tm_datastructures.sign_concept(preferred_term_assertion) == preferred_constant) {
                                                pt_assertions_of_preferred_constant = cons(preferred_term_assertion, pt_assertions_of_preferred_constant);
                                            }
                                        }
                                        preferred_thesauri = Mapping.mapcar(symbol_function(SIGN_THESAURUS), pt_assertions_of_preferred_constant);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($MIDDLE));
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
                                                    SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL == basicP) {
                                                            html_thesaurus.tm_link($FULL_RECORD, id, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                tm_show_pre_rotation(before_rotation, id);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (NIL != $tm_alpha_mid_rotation_width$.getGlobalValue()) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($tm_alpha_mid_rotation_width$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($str_alt69$_);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != highlight) {
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            {
                                                                SubLObject size_val = FIVE_INTEGER;
                                                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                if (NIL != size_val) {
                                                                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(size_val);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (NIL != basicP) {
                                                                            html_thesaurus.tm_link($SWITCH_HIERARCHICAL, id, after_rotation, basic_thesaurus_id);
                                                                        } else {
                                                                            html_thesaurus.tm_link($HIERARCHICAL, id, after_rotation, UNPROVIDED);
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        } else {
                                                            if (NIL != basicP) {
                                                                html_thesaurus.tm_link($SWITCH_HIERARCHICAL, id, after_rotation, basic_thesaurus_id);
                                                            } else {
                                                                html_thesaurus.tm_link($HIERARCHICAL, id, after_rotation, UNPROVIDED);
                                                            }
                                                        }
                                                        if (length(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI)).numG(ONE_INTEGER)) {
                                                            tm_handle_print_thes_list(preferred_thesauri, id, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_terpri(UNPROVIDED);
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = tm_lexical_index.all_lexpreds();
                            SubLObject lexpred = NIL;
                            for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                                if (lexpred != $$preferredTerm) {
                                    {
                                        SubLObject alt_signs = tm_internals.extract_signs_matching(assertions, $LEXPRED, lexpred);
                                        if (NIL != alt_signs) {
                                            {
                                                SubLObject alt_term_string = tm_datastructures.sign_term(alt_signs.first());
                                                SubLObject lexpred_93 = tm_datastructures.sign_relation(alt_signs.first());
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($MIDDLE));
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
                                                            SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        tm_show_pre_rotation(before_rotation, NIL);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (NIL != $tm_alpha_mid_rotation_width$.getGlobalValue()) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($tm_alpha_mid_rotation_width$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt69$_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                if (NIL != highlight) {
                                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                    {
                                                                        SubLObject size_val = FIVE_INTEGER;
                                                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                        if (NIL != size_val) {
                                                                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(size_val);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_princ(after_rotation);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                } else {
                                                                    html_utilities.html_princ(after_rotation);
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                {
                                                    SubLObject alt_concepts = delete_duplicates(Mapping.mapcar(symbol_function(SIGN_CONCEPT), alt_signs), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject alt_thesauri = Mapping.mapcar(symbol_function(SIGN_THESAURUS), alt_signs);
                                                    SubLObject cdolist_list_var_98 = alt_concepts;
                                                    SubLObject alt_concept = NIL;
                                                    for (alt_concept = cdolist_list_var_98.first(); NIL != cdolist_list_var_98; cdolist_list_var_98 = cdolist_list_var_98.rest() , alt_concept = cdolist_list_var_98.first()) {
                                                        {
                                                            SubLObject id = cb_utilities.cb_fort_identifier(alt_concept);
                                                            SubLObject pt_strings = NIL;
                                                            {
                                                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                try {
                                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                                                                    mt_relevance_macros.$relevant_mts$.bind(alt_thesauri, thread);
                                                                    pt_strings = tm_internals.preferred_terms(alt_concept);
                                                                } finally {
                                                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                                                }
                                                            }
                                                            pt_strings = delete_duplicates(pt_strings, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            {
                                                                SubLObject cdolist_list_var_99 = pt_strings;
                                                                SubLObject pt_string = NIL;
                                                                for (pt_string = cdolist_list_var_99.first(); NIL != cdolist_list_var_99; cdolist_list_var_99 = cdolist_list_var_99.rest() , pt_string = cdolist_list_var_99.first()) {
                                                                    pt_string = tm_right_case(pt_string, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($MIDDLE));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                                SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                                                    html_utilities.html_princ(tm_internals.tm_pred_arg_symbol(lexpred_93, TWO_INTEGER));
                                                                                    html_utilities.html_princ($str_alt195$__);
                                                                                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                                                    if (NIL == basicP) {
                                                                                        html_thesaurus.tm_link($FULL_RECORD, id, UNPROVIDED, UNPROVIDED);
                                                                                    }
                                                                                    if (NIL != basicP) {
                                                                                        html_thesaurus.tm_link($SWITCH_HIERARCHICAL, id, pt_string, basic_thesaurus_id);
                                                                                    } else {
                                                                                        html_thesaurus.tm_link($HIERARCHICAL, id, pt_string, UNPROVIDED);
                                                                                    }
                                                                                    if (length(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI)).numG(ONE_INTEGER)) {
                                                                                        tm_handle_print_thes_list(tm_internals.active_thesauri_where_lexterm(alt_concept, alt_term_string, lexpred_93, tm_internals.active_thesauri_where_lexterm(alt_concept, pt_string, $$preferredTerm, UNPROVIDED)), id, UNPROVIDED, UNPROVIDED);
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_terpri(UNPROVIDED);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    /**
     * ALPHA-ITEM is of the form (<string> . <assertions>)
     * The assertions are the preferredTerm and other lexical assertions corresponding to the string.
     * For the preferred terms, print the string as an active link.
     * for the use fors, print as inactive and refer user to
     * preferred term(s) as active links
     */
    public static final SubLObject tm_alphabetical_item_all(SubLObject alpha_item, SubLObject highlight) {
        if (highlight == UNPROVIDED) {
            highlight = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = alpha_item;
                SubLObject current = datum;
                SubLObject string = NIL;
                SubLObject assertions = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt191);
                string = current.first();
                current = current.rest();
                assertions = current;
                string = tm_right_case(string, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject before_rotation = tm_datastructures.tm_determine_rotation_split(string);
                    SubLObject after_rotation = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject preferred_term_assertions = tm_internals.extract_signs_matching(assertions, $LEXPRED, $$preferredTerm);
                        if (NIL != preferred_term_assertions) {
                            {
                                SubLObject cdolist_list_var = preferred_term_assertions;
                                SubLObject pt_assertion = NIL;
                                for (pt_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pt_assertion = cdolist_list_var.first()) {
                                    {
                                        SubLObject preferred_constant = tm_datastructures.sign_concept(pt_assertion);
                                        SubLObject id = cb_utilities.cb_fort_identifier(preferred_constant);
                                        SubLObject thesaurus = tm_datastructures.sign_thesaurus(pt_assertion);
                                        SubLObject thesaurus_id = cb_utilities.cb_fort_identifier(thesaurus);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($MIDDLE));
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
                                                    SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                tm_show_pre_rotation_all(before_rotation, id, thesaurus_id);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (NIL != $tm_alpha_mid_rotation_width$.getGlobalValue()) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($tm_alpha_mid_rotation_width$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($str_alt69$_);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != highlight) {
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            {
                                                                SubLObject size_val = FIVE_INTEGER;
                                                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                if (NIL != size_val) {
                                                                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(size_val);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_thesaurus.tm_link($SWITCH_HIERARCHICAL, id, after_rotation, thesaurus_id);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_105, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        } else {
                                                            html_thesaurus.tm_link($SWITCH_HIERARCHICAL, id, after_rotation, thesaurus_id);
                                                        }
                                                        html_utilities.html_spaces(TWO_INTEGER);
                                                        html_utilities.html_princ($str_alt58$_);
                                                        html_utilities.html_princ(tm_internals.thesaurus_abbreviation(thesaurus));
                                                        html_utilities.html_princ($str_alt67$_);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_104, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_terpri(UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = tm_lexical_index.all_lexpreds();
                        SubLObject lexpred = NIL;
                        for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                            if (lexpred != $$preferredTerm) {
                                {
                                    SubLObject alt_signs = tm_internals.extract_signs_matching(assertions, $LEXPRED, lexpred);
                                    if (NIL != alt_signs) {
                                        {
                                            SubLObject lexpred_106 = tm_datastructures.sign_relation(alt_signs.first());
                                            SubLObject cdolist_list_var_107 = alt_signs;
                                            SubLObject alt_sign = NIL;
                                            for (alt_sign = cdolist_list_var_107.first(); NIL != cdolist_list_var_107; cdolist_list_var_107 = cdolist_list_var_107.rest() , alt_sign = cdolist_list_var_107.first()) {
                                                {
                                                    SubLObject alt_concept = tm_datastructures.sign_concept(alt_sign);
                                                    SubLObject id = cb_utilities.cb_fort_identifier(alt_concept);
                                                    SubLObject alt_thesaurus = tm_datastructures.sign_thesaurus(alt_sign);
                                                    SubLObject thesaurus_id = cb_utilities.cb_fort_identifier(alt_thesaurus);
                                                    SubLObject pt_string = tm_datastructures.concept_term(alt_concept, alt_thesaurus);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($MIDDLE));
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
                                                                SubLObject _prev_bind_0_108 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_108, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            tm_show_pre_rotation(before_rotation, NIL);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (NIL != $tm_alpha_mid_rotation_width$.getGlobalValue()) {
                                                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($tm_alpha_mid_rotation_width$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_109 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ($str_alt69$_);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_109, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_110 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    if (NIL != highlight) {
                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                        {
                                                                            SubLObject size_val = FIVE_INTEGER;
                                                                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                            if (NIL != size_val) {
                                                                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(size_val);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_111 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ(after_rotation);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_111, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                    } else {
                                                                        html_utilities.html_princ(after_rotation);
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_110, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_terpri(UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($MIDDLE));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_112 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_112, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_113 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                                    html_utilities.html_princ(tm_internals.tm_pred_arg_symbol(lexpred_106, TWO_INTEGER));
                                                                    html_utilities.html_princ($str_alt195$__);
                                                                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                                    html_thesaurus.tm_link($SWITCH_HIERARCHICAL, id, pt_string, thesaurus_id);
                                                                    html_utilities.html_spaces(TWO_INTEGER);
                                                                    html_utilities.html_princ($str_alt58$_);
                                                                    html_utilities.html_princ(tm_internals.thesaurus_abbreviation(alt_thesaurus));
                                                                    html_utilities.html_princ($str_alt67$_);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_113, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_utilities.html_terpri(UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                            }
                                        }
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

    /**
     * Output STRING in the rotation column of the alpha display.
     * If ID is non-null, make it a link to constant with that ID.
     */
    public static final SubLObject tm_show_pre_rotation(SubLObject string, SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject basicP = makeBoolean((tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE) == $BASIC) && (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread)));
                SubLObject basic_thesaurus_id = cb_utilities.cb_fort_identifier(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI).first());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != string) {
                            if (NIL != id) {
                                if (NIL != basicP) {
                                    html_thesaurus.tm_link($SWITCH_HIERARCHICAL, id, string, basic_thesaurus_id);
                                } else {
                                    html_thesaurus.tm_link($HIERARCHICAL, id, string, UNPROVIDED);
                                }
                            } else {
                                html_utilities.html_princ(string);
                            }
                            html_utilities.html_princ($str_alt69$_);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     *
     */
    public static final SubLObject tm_show_pre_rotation_all(SubLObject string, SubLObject id, SubLObject thesaurus_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align($RIGHT));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != string) {
                        if ((NIL != id) && (NIL != thesaurus_id)) {
                            html_thesaurus.tm_link($SWITCH_HIERARCHICAL, id, string, thesaurus_id);
                        } else {
                            html_utilities.html_princ(string);
                        }
                        html_utilities.html_princ($str_alt69$_);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject tm_fd(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject constant = (NIL != cb_utilities.cb_valid_fort_identifierP(term_id)) ? ((SubLObject) (html_thesaurus.tm_guess_fort(term_id))) : NIL;
                SubLObject separateP = (args.rest().first().isString()) ? ((SubLObject) (read_from_string_ignoring_errors(args.rest().first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $kw196$FD_SEPARATE_);
                if (NIL == constant) {
                    return html_thesaurus.tm_error($str_alt197$Could_not_determine_a_concept_fro, term_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return tm_full_record(constant, separateP, UNPROVIDED);
            }
        }
    }

    /**
     * When you have the actual CONSTANT, show its full record
     */
    public static final SubLObject tm_full_record_for_constant(SubLObject constant, SubLObject separateP, SubLObject signs) {
        if (signs == UNPROVIDED) {
            signs = NIL;
        }
        return tm_full_record(constant, separateP, signs);
    }

    public static final SubLObject tm_full_record(SubLObject constant, SubLObject separateP, SubLObject signs) {
        if (signs == UNPROVIDED) {
            signs = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_string = tm_right_case(tm_internals.tm_string_for_constant(constant, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                SubLObject concept_thesauri = tm_internals.thesauri_of_concept(constant);
                if (NIL != intersection(concept_thesauri, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI), UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject color_value = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_FULL_RECORD);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(format(NIL, $str_alt200$Full_Term_Record_for___A_, term_string));
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
                                    SubLObject _prev_bind_0_114 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_115 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_116 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_116, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_115, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ(format(NIL, $str_alt200$Full_Term_Record_for___A_, term_string));
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event(format(NIL, $str_alt200$Full_Term_Record_for___A_, term_string));
                                        if (NIL != tm_possibly_show_alternate_input_strings(signs, UNPROVIDED, UNPROVIDED)) {
                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                        }
                                        tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM, constant, UNPROVIDED);
                                        html_thesaurus.thesaurus_heading($str_alt201$tm_full_record);
                                        tm_full_record_guts(constant, separateP);
                                        html_thesaurus.tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_114, thread);
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
                    tm_report_not_in_active_thesauri(constant);
                }
            }
            return NIL;
        }
    }

    /**
     * Prints out main content of full record.
     */
    public static final SubLObject tm_full_record_guts(SubLObject fort, SubLObject separateP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
                SubLObject top_thesauri = intersection(thesauri, tm_internals.declarative_top_in_which_thesauri(fort), UNPROVIDED, UNPROVIDED);
                SubLObject thesauri_of_concept = tm_internals.thesauri_of_concept(fort);
                SubLObject editable_thesauri = (tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI) == $ALL) ? ((SubLObject) (tm_internals.all_thesauri())) : tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI);
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                if (NIL == tm_internals.thesaurus_gensymP(fort)) {
                    html_thesaurus.tm_link($CYC_CONCEPT, fort, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_indent(ONE_INTEGER);
                }
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                tm_thesaurus_constant(fort, NIL, T, NIL, thesauri, top_thesauri, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_br();
                html_utilities.html_br();
                if (((NIL != tm_internals.editing_allowedP()) && (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DISPLAY_FILTER))) && (NIL != list_utilities.intersectP(thesauri_of_concept, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDIT_THESAURI), UNPROVIDED, UNPROVIDED))) {
                    html_thesaurus.tm_link($FULL_EDIT, cb_utilities.cb_fort_identifier(fort), UNPROVIDED, UNPROVIDED);
                }
                if (((NIL != tm_internals.editing_allowedP()) && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator))) && ((NIL != set_difference(tm_internals.all_thesauri(), thesauri_of_concept, UNPROVIDED, UNPROVIDED)) || (NIL != tm_internals.thesaurus_gensymP(fort)))) {
                    html_thesaurus.tm_link($CORRELATE_CONCEPT, cb_utilities.cb_fort_identifier(fort), UNPROVIDED, UNPROVIDED);
                }
                if (((NIL != tm_internals.editing_allowedP()) && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt209$limited_editor))) && ((NIL == tm_internals.thesaurus_gensymP(fort)) || ((NIL != list_utilities.intersectP(thesauri_of_concept, editable_thesauri, UNPROVIDED, UNPROVIDED)) && length(thesauri_of_concept).numG(ONE_INTEGER)))) {
                    html_thesaurus.tm_link($UNCORRELATE, cb_utilities.cb_fort_identifier(fort), UNPROVIDED, UNPROVIDED);
                }
                if (length(thesauri).numG(ONE_INTEGER) && length(thesauri_of_concept).numG(ONE_INTEGER)) {
                    if (NIL != separateP) {
                        html_thesaurus.tm_link($THESAURI_MERGED, cb_utilities.cb_fort_identifier(fort), $$$nil, UNPROVIDED);
                    } else {
                        html_thesaurus.tm_link($THESAURI_SEPARATE, cb_utilities.cb_fort_identifier(fort), $$$t, UNPROVIDED);
                    }
                }
                html_utilities.html_br();
                if ((NIL != separateP) || length(thesauri).eql(ONE_INTEGER)) {
                    tm_full_record_guts_separate(fort, thesauri);
                } else {
                    tm_full_record_guts_merged(fort, thesauri);
                }
            }
            return NIL;
        }
    }

    /**
     * Prints out full record information from all active thesauri, merged together.
     */
    public static final SubLObject tm_full_record_guts_merged(SubLObject constant, SubLObject thesauri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_filter_info = second(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DISPLAY_FILTER));
                SubLObject relation_specs = tm_io.tm_output_item(constant, thesauri, output_filter_info, NIL, symbol_function(ASSERTION_MT));
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$html_indent_table_max$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                        {
                            SubLObject cdolist_list_var = relation_specs;
                            SubLObject relation_spec = NIL;
                            for (relation_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation_spec = cdolist_list_var.first()) {
                                {
                                    SubLObject rel_symbol = relation_spec.first();
                                    SubLObject value_list = second(relation_spec);
                                    if (!rel_symbol.equalp($$$LT)) {
                                        if (NIL != value_list) {
                                            {
                                                SubLObject indent = ZERO_INTEGER;
                                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_117 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_118 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                html_thesaurus.tm_link($RELATION, rel_symbol, UNPROVIDED, UNPROVIDED);
                                                                html_utilities.html_princ($str_alt73$__);
                                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                value_list = tm_sort_full_record_value_list(value_list);
                                                                {
                                                                    SubLObject cdolist_list_var_119 = value_list;
                                                                    SubLObject value_item = NIL;
                                                                    for (value_item = cdolist_list_var_119.first(); NIL != cdolist_list_var_119; cdolist_list_var_119 = cdolist_list_var_119.rest() , value_item = cdolist_list_var_119.first()) {
                                                                        {
                                                                            SubLObject value = value_item.first();
                                                                            SubLObject value_thesauri = second(value_item);
                                                                            SubLObject indent_120 = ONE_INTEGER;
                                                                            SubLObject span_121 = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_120));
                                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_122 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_indent_row_internal(indent_120);
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    if (NIL != span_121) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(span_121);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_123 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            if (NIL != forts.fort_p(value)) {
                                                                                                tm_thesaurus_constant(value, NIL, T, T, value_thesauri, UNPROVIDED, UNPROVIDED);
                                                                                            } else {
                                                                                                if (NIL != tm_internals.tm_url_predicateP(tm_internals.relation_constant_from_abbreviation(rel_symbol))) {
                                                                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_utilities.html_markup(value);
                                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_124 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                        try {
                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                            html_utilities.html_princ(value);
                                                                                                        } finally {
                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_124, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                                } else {
                                                                                                    html_utilities.html_princ(value);
                                                                                                }
                                                                                                html_utilities.html_princ($str_alt64$__);
                                                                                                html_utilities.html_princ(tm_internals.thesaurus_abbreviation(value_thesauri.first()));
                                                                                                {
                                                                                                    SubLObject cdolist_list_var_125 = value_thesauri.rest();
                                                                                                    SubLObject thes = NIL;
                                                                                                    for (thes = cdolist_list_var_125.first(); NIL != cdolist_list_var_125; cdolist_list_var_125 = cdolist_list_var_125.rest() , thes = cdolist_list_var_125.first()) {
                                                                                                        html_utilities.html_princ($str_alt59$__);
                                                                                                        html_utilities.html_princ(tm_internals.thesaurus_abbreviation(thes));
                                                                                                    }
                                                                                                }
                                                                                                html_utilities.html_princ($str_alt37$_);
                                                                                            }
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_123, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_122, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_118, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_117, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                            html_utilities.html_indent_table_internal(FOUR_INTEGER);
                        }
                    } finally {
                        html_macros.$html_indent_table_max$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     * prints a short heading, the constant name, then the full record information.
     */
    public static final SubLObject tm_full_record_info_merged(SubLObject constant, SubLObject thesauri) {
        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($str_alt216$Full_Term_information_for_);
        html_utilities.html_br();
        if (NIL == tm_internals.thesaurus_gensymP(constant)) {
            html_thesaurus.tm_link($CYC_CONCEPT, constant, UNPROVIDED, UNPROVIDED);
            html_utilities.html_indent(ONE_INTEGER);
        }
        if (NIL != intersection(tm_internals.thesauri_of_concept(constant), thesauri, UNPROVIDED, UNPROVIDED)) {
            tm_thesaurus_constant(constant, NIL, T, T, thesauri, UNPROVIDED, UNPROVIDED);
        } else {
            tm_thesaurus_constant(constant, NIL, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_utilities.html_princ($str_alt217$__Not_in_the_active_thesauri_);
        }
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_br();
        tm_full_record_guts_merged(constant, thesauri);
        return NIL;
    }

    /**
     * Returns T iff CONSTANT is in another thesaurus, with some UF there that's not in THESAURUS.
     */
    public static final SubLObject ufs_in_other_thesaurusP(SubLObject constant, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ufs = NIL;
                SubLObject foundP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(thesaurus, thread);
                        ufs = tm_internals.use_fors(constant);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == foundP) {
                    {
                        SubLObject csome_list_var = remove(thesaurus, tm_internals.thesauri_of_concept(constant), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject other_thesaurus = NIL;
                        for (other_thesaurus = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , other_thesaurus = csome_list_var.first()) {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                    mt_relevance_macros.$mt$.bind(other_thesaurus, thread);
                                    if (NIL == foundP) {
                                        {
                                            SubLObject csome_list_var_126 = tm_internals.use_fors(constant);
                                            SubLObject other_uf = NIL;
                                            for (other_uf = csome_list_var_126.first(); !((NIL != foundP) || (NIL == csome_list_var_126)); csome_list_var_126 = csome_list_var_126.rest() , other_uf = csome_list_var_126.first()) {
                                                if (NIL == subl_promotions.memberP(other_uf, ufs, symbol_function(EQUALP), UNPROVIDED)) {
                                                    foundP = T;
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return foundP;
            }
        }
    }

    /**
     * Prints full record info from all active thesauri, in separate sections.
     */
    public static final SubLObject tm_full_record_guts_separate(SubLObject constant, SubLObject thesauri) {
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
                SubLObject _prev_bind_1 = html_macros.$html_indent_table_max$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                    {
                        SubLObject cdolist_list_var = thesauri;
                        SubLObject thesaurus = NIL;
                        for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                            {
                                SubLObject offer_importP = ufs_in_other_thesaurusP(constant, thesaurus);
                                if (NIL != subl_promotions.memberP(thesaurus, tm_internals.thesauri_of_concept(constant), UNPROVIDED, UNPROVIDED)) {
                                    {
                                        SubLObject indent = ZERO_INTEGER;
                                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_127 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_128 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.verify_not_within_html_pre();
                                                        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                        {
                                                            SubLObject _prev_bind_0_129 = html_macros.$within_html_pre$.currentBinding(thread);
                                                            try {
                                                                html_macros.$within_html_pre$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt69$_);
                                                            } finally {
                                                                html_macros.$within_html_pre$.rebind(_prev_bind_0_129, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_128, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_127, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                    {
                                        SubLObject indent = ZERO_INTEGER;
                                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_130 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_131 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt219$In_Thesaurus___A, tm_internals.thesaurus_name(thesaurus));
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        if (NIL != tm_internals.declarative_top_in_thesaurusP(constant, thesaurus)) {
                                                            html_utilities.html_princ($str_alt220$____TOP_TERM);
                                                        }
                                                        if (((NIL != tm_internals.editing_allowedP()) && (tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI).equal($ALL) || (NIL != member(thesaurus, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI), UNPROVIDED, UNPROVIDED)))) && ((NIL != offer_importP) || (NIL != kb_mapping_utilities.some_pred_value_in_mt(constant, $$useFor, thesaurus, UNPROVIDED, UNPROVIDED)))) {
                                                            html_utilities.html_br();
                                                            if (NIL != kb_mapping_utilities.some_pred_value_in_mt(constant, $$useFor, thesaurus, UNPROVIDED, UNPROVIDED)) {
                                                                html_thesaurus.tm_link($SWAP_PT_UF, cb_utilities.cb_fort_identifier(constant), cb_utilities.cb_fort_identifier(thesaurus), UNPROVIDED);
                                                            }
                                                            if (NIL != offer_importP) {
                                                                html_thesaurus.tm_link($IMPORT_UFS, cb_utilities.cb_fort_identifier(constant), cb_utilities.cb_fort_identifier(thesaurus), UNPROVIDED);
                                                            }
                                                        }
                                                        if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $kw224$SHOW_REASONS_)) {
                                                            html_utilities.html_br();
                                                            tm_show_term_timestamp(constant, thesaurus);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_131, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_130, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                    {
                                        SubLObject output_filter_info = second(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DISPLAY_FILTER));
                                        SubLObject relation_specs = tm_io.tm_output_item(constant, list(thesaurus), output_filter_info, NIL, NIL);
                                        SubLObject cdolist_list_var_132 = relation_specs;
                                        SubLObject relation_spec = NIL;
                                        for (relation_spec = cdolist_list_var_132.first(); NIL != cdolist_list_var_132; cdolist_list_var_132 = cdolist_list_var_132.rest() , relation_spec = cdolist_list_var_132.first()) {
                                            {
                                                SubLObject rel_symbol = relation_spec.first();
                                                SubLObject value_list = second(relation_spec);
                                                if (!rel_symbol.equalp($$$LT)) {
                                                    if (NIL != value_list) {
                                                        {
                                                            SubLObject indent = ONE_INTEGER;
                                                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_133 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                        SubLObject _prev_bind_0_134 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_thesaurus.tm_link($RELATION, rel_symbol, UNPROVIDED, UNPROVIDED);
                                                                            html_utilities.html_princ($str_alt73$__);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_134, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_133, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                        value_list = tm_sort_full_record_value_list(value_list);
                                                        {
                                                            SubLObject cdolist_list_var_135 = value_list;
                                                            SubLObject value_spec = NIL;
                                                            for (value_spec = cdolist_list_var_135.first(); NIL != cdolist_list_var_135; cdolist_list_var_135 = cdolist_list_var_135.rest() , value_spec = cdolist_list_var_135.first()) {
                                                                {
                                                                    SubLObject value = value_spec.first();
                                                                    SubLObject assertions = second(value_spec);
                                                                    if (value.isString()) {
                                                                        value = tm_right_case(value, rel_symbol);
                                                                    }
                                                                    {
                                                                        SubLObject indent = TWO_INTEGER;
                                                                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_136 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                                    SubLObject _prev_bind_0_137 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $kw224$SHOW_REASONS_)) {
                                                                                            {
                                                                                                SubLObject cdolist_list_var_138 = assertions;
                                                                                                SubLObject assertion = NIL;
                                                                                                for (assertion = cdolist_list_var_138.first(); NIL != cdolist_list_var_138; cdolist_list_var_138 = cdolist_list_var_138.rest() , assertion = cdolist_list_var_138.first()) {
                                                                                                    html_thesaurus.tm_link($SOURCE, assertion_handles.assertion_id(assertion), cb_utilities.cb_fort_identifier(constant), UNPROVIDED);
                                                                                                    html_utilities.html_indent(ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (NIL != forts.fort_p(value)) {
                                                                                            tm_thesaurus_constant(value, NIL, T, T, list(thesaurus), UNPROVIDED, UNPROVIDED);
                                                                                        } else {
                                                                                            if (NIL != tm_internals.tm_url_predicateP(tm_internals.relation_constant_from_abbreviation(rel_symbol))) {
                                                                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_utilities.html_markup(value);
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_139 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                        html_utilities.html_princ(value);
                                                                                                    } finally {
                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_139, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                            } else {
                                                                                                html_utilities.html_princ(value);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_137, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_136, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        html_utilities.html_indent_table_internal(FOUR_INTEGER);
                    }
                } finally {
                    html_macros.$html_indent_table_max$.rebind(_prev_bind_1, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    /**
     * Sort VALUE-LIST for display in one of the full-record pages
     */
    public static final SubLObject tm_sort_full_record_value_list(SubLObject value_list) {
        return Sort.stable_sort(value_list, symbol_function(STRING_LESSP), symbol_function(TM_FULL_RECORD_GUTS_SORT_KEY));
    }

    public static final SubLObject tm_full_record_guts_sort_key(SubLObject value_item) {
        {
            SubLObject key = value_item.first();
            if (NIL != forts.fort_p(key)) {
                return tm_internals.tm_string_for_constant(key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (key.isString()) {
                    return key;
                } else {
                    return key;
                }

        }
    }

    public static final SubLObject tm_show_term_timestamp(SubLObject constant, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pt_sign = tm_datastructures.sign_from_concept(constant, $$preferredTerm, thesaurus);
                SubLObject v_arguments = assertions_high.assertion_arguments(pt_sign);
                if (NIL == list_utilities.singletonP(v_arguments)) {
                    return html_utilities.html_princ($str_alt227$Warning__Too_many_arguments);
                }
                if (NIL == arguments.asserted_argument_p(v_arguments.first())) {
                    return html_utilities.html_princ($str_alt228$Warning__Inferred);
                }
                {
                    SubLObject who = assertions_high.asserted_by(pt_sign);
                    if (NIL != constant_handles.valid_constantP(who, UNPROVIDED)) {
                        {
                            SubLObject when = assertions_high.asserted_when(pt_sign);
                            SubLObject second = assertions_high.asserted_second(pt_sign);
                            SubLObject adder_name = tm_internals.user_name(who);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt229$Added_by__A, NIL != adder_name ? ((SubLObject) (adder_name)) : constants_high.constant_name(who));
                            if (NIL != when) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt230$_on__A, numeric_date_utilities.datestring(when));
                                if (NIL != second) {
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt231$_at__A, numeric_date_utilities.secondstring(second));
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject load_date = tm_internals.thesaurus_load_date(thesaurus);
                            SubLObject loader = tm_internals.thesaurus_loader(thesaurus);
                            SubLObject loader_name = (NIL != forts.fort_p(loader)) ? ((SubLObject) (tm_internals.user_name(loader))) : NIL;
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt232$Added_during_the_load_of__A, tm_internals.thesaurus_name(thesaurus));
                            if (NIL != loader) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt233$_by__A, NIL != loader_name ? ((SubLObject) (loader_name)) : constants_high.constant_name(loader));
                            }
                            if (NIL != load_date) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt230$_on__A, numeric_date_utilities.datestring(load_date));
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Short name for URL - tm-show-source-audit-info
     */
    public static final SubLObject tm_ssa(SubLObject args) {
        return tm_show_source_audit_info(args);
    }

    public static final SubLObject tm_show_timestamped_assertion(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject who = assertions_high.asserted_by(assertion);
                SubLObject when = assertions_high.asserted_when(assertion);
                SubLObject second = assertions_high.asserted_second(assertion);
                SubLObject asserter = (NIL != forts.fort_p(who)) ? ((SubLObject) (tm_internals.user_name(who))) : NIL;
                if (NIL == asserter) {
                    asserter = constants_high.constant_name(who);
                }
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt235$Asserted_by__A, asserter);
                if (NIL != when) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt230$_on__A, numeric_date_utilities.datestring(when));
                }
                if (NIL != second) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt231$_at__A, numeric_date_utilities.secondstring(second));
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_show_implicit_assertion(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                SubLObject load_date = tm_internals.thesaurus_load_date(thesaurus);
                SubLObject loader = tm_internals.thesaurus_loader(thesaurus);
                SubLObject loader_name = tm_internals.user_name(loader);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt232$Added_during_the_load_of__A, tm_internals.thesaurus_name(thesaurus));
                if (NIL != loader) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt233$_by__A, NIL != loader_name ? ((SubLObject) (loader_name)) : constants_high.constant_name(loader));
                }
                if (NIL != load_date) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt230$_on__A, numeric_date_utilities.datestring(load_date));
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_show_source_audit_info(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion_id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject fort_id = read_from_string_ignoring_errors(second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject assertion = assertion_handles.find_assertion_by_id(assertion_id);
                SubLObject constant = html_thesaurus.tm_guess_fort(fort_id);
                SubLObject constant_arg = position(constant, fi.assertion_fi_formula(assertion, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject value_arg = (constant_arg == ONE_INTEGER) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
                SubLObject rel_symbol = tm_internals.tm_pred_arg_symbol(assertions_high.gaf_arg0(assertion), constant_arg);
                SubLObject value = assertions_high.gaf_arg(assertion, value_arg);
                SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Show_Reasons);
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
                            SubLObject _prev_bind_0_140 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_141 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_142 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_142, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_141, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$Show_Reasons);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$Show_Reasons);
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                    html_utilities.html_princ($str_alt237$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt238$tm_show_source_audit_info);
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(ZERO_INTEGER);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_143 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_144 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_145 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt239$For_the_statement_);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_145, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_146 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ(tm_datastructures.concept_term(constant, thesaurus));
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt189$__A_, rel_symbol);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_utilities.html_princ(NIL != forts.fort_p(value) ? ((SubLObject) (tm_datastructures.concept_term(value, thesaurus))) : value);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_146, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_144, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_147 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_148 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt240$In_Thesaurus__);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_148, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_149 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_149, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_147, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_143, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    html_utilities.html_br();
                                    html_utilities.html_br();
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt241$Reasons_);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_br();
                                    {
                                        SubLObject cdolist_list_var = v_arguments;
                                        SubLObject argument = NIL;
                                        for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                            if (NIL != arguments.asserted_argument_p(argument)) {
                                                if (NIL != assertions_high.asserted_by(assertion)) {
                                                    tm_show_timestamped_assertion(assertion);
                                                } else {
                                                    tm_show_implicit_assertion(assertion);
                                                }
                                            } else {
                                                html_utilities.html_princ($str_alt242$Inferred_);
                                            }
                                            html_utilities.html_br();
                                        }
                                    }
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_140, thread);
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

    public static final SubLObject tm_show_thesauri(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesauri = tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
                SubLObject len = length(thesauri);
                SubLObject text = format(NIL, $str_alt244$_A_Available_Thesaur_A, len, len.numE(ONE_INTEGER) ? ((SubLObject) ($$$us)) : $$$i);
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(text);
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
                            SubLObject _prev_bind_0_150 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_151 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_152 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_152, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_151, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(text);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(text);
                                html_thesaurus.thesaurus_heading($str_alt247$tm_show_thesauri);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt248$There__A__A_thesaur_A_available_A, new SubLObject[]{ len.numE(ONE_INTEGER) ? ((SubLObject) ($$$is)) : $$$are, len.numE(ZERO_INTEGER) ? ((SubLObject) ($$$no_known)) : len, len.numE(ONE_INTEGER) ? ((SubLObject) ($$$us)) : $$$i, len.numE(ZERO_INTEGER) ? ((SubLObject) ($str_alt250$_)) : $str_alt136$_ });
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_br();
                                html_utilities.html_br();
                                if (NIL != thesauri) {
                                    {
                                        SubLObject cdolist_list_var = thesauri;
                                        SubLObject thes = NIL;
                                        for (thes = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thes = cdolist_list_var.first()) {
                                            html_thesaurus.tm_link($THESAURUS, thes, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_br();
                                        }
                                    }
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_150, thread);
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
     * short name for function, to use in URL refs -- AT stands for About Thesaurus.
     */
    public static final SubLObject tm_at(SubLObject args) {
        return tm_about_thesaurus(args);
    }

    public static final SubLObject get_tops_for_thesaurus(SubLObject thesaurus) {
        {
            SubLObject constants = tm_internals.thesaurus_tops(thesaurus);
            SubLObject pairs = NIL;
            SubLObject cdolist_list_var = constants;
            SubLObject c = NIL;
            for (c = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , c = cdolist_list_var.first()) {
                {
                    SubLObject preferred_term = tm_datastructures.concept_term(c, thesaurus);
                    if (NIL != preferred_term) {
                        pairs = cons(list(c, preferred_term), pairs);
                    }
                }
            }
            if (NIL != pairs) {
                pairs = Sort.sort(pairs, symbol_function(STRING_LESSP), symbol_function(SECOND));
            }
            return pairs;
        }
    }

    /**
     * page showing just the tops of THESAURI after MESSAGE
     */
    public static final SubLObject tm_show_thesaurus_tops(SubLObject thesauri, SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Top_Terms);
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
                            SubLObject _prev_bind_0_153 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_154 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_155 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_155, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_154, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$Top_Terms);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$Top_Terms);
                                html_thesaurus.thesaurus_heading($str_alt255$tm_show_thesaurus_tops);
                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                if (NIL != message) {
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ(message);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                }
                                html_utilities.html_br();
                                {
                                    SubLObject cdolist_list_var = thesauri;
                                    SubLObject thesaurus = NIL;
                                    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                        {
                                            SubLObject tops = get_tops_for_thesaurus(thesaurus);
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            if (NIL != tops) {
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt256$Tops_of__A, tm_internals.thesaurus_name(thesaurus));
                                                {
                                                    SubLObject cdolist_list_var_156 = tops;
                                                    SubLObject top = NIL;
                                                    for (top = cdolist_list_var_156.first(); NIL != cdolist_list_var_156; cdolist_list_var_156 = cdolist_list_var_156.rest() , top = cdolist_list_var_156.first()) {
                                                        html_utilities.html_br();
                                                        tm_thesaurus_constant(top.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            } else {
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt257$No_tops_for__A, tm_internals.thesaurus_name(thesaurus));
                                            }
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        }
                                    }
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_153, thread);
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
     * Call within html-pre.  Prints out information about THESAURUS.
     */
    public static final SubLObject tm_thesaurus_info_section(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                SubLObject abbreviation = tm_internals.thesaurus_abbreviation(thesaurus);
                SubLObject comment = kb_accessors.comment(thesaurus, tm_datastructures.$tm_mt$.getGlobalValue());
                SubLObject releasedP = tm_internals.released_thesaurusP(thesaurus);
                SubLObject tops = get_tops_for_thesaurus(thesaurus);
                SubLObject len = length(tops);
                SubLObject display_filter = tm_internals.tm_default_display_filter(thesaurus);
                SubLObject output_filter = tm_internals.tm_default_output_filter(thesaurus);
                SubLObject creator = bookkeeping_store.creator(thesaurus, UNPROVIDED);
                SubLObject creation_time = bookkeeping_store.creation_time(thesaurus, UNPROVIDED);
                SubLObject load_date = tm_internals.thesaurus_load_date(thesaurus);
                SubLObject loader = tm_internals.thesaurus_loader(thesaurus);
                SubLObject pt_count = tm_internals.thesaurus_preferred_term_count(thesaurus);
                SubLObject uf_count = tm_internals.thesaurus_use_for_count(thesaurus, UNPROVIDED);
                SubLObject sn_count = tm_internals.thesaurus_scope_note_count(thesaurus, UNPROVIDED);
                SubLObject rt_count = tm_internals.thesaurus_related_term_count(thesaurus, UNPROVIDED);
                SubLObject creator_name = NIL;
                SubLObject loader_name = NIL;
                if (NIL != constant_handles.valid_constantP(creator, UNPROVIDED)) {
                    creator_name = tm_internals.user_name(creator);
                }
                if (NIL != constant_handles.valid_constantP(loader, UNPROVIDED)) {
                    loader_name = tm_internals.user_name(loader);
                }
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt258$Information_about_the_thesaurus__);
                html_utilities.html_princ(thesaurus_name);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
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
                        if (NIL != abbreviation) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_157 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_158 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt259$Abbreviation_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_158, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_159 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(abbreviation);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_159, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_157, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_160 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_161 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt260$Released_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_161, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_162 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != releasedP) {
                                            html_utilities.html_princ($$$Yes);
                                        } else {
                                            html_utilities.html_princ($$$No);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_162, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_160, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        if (NIL != creator) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_163 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_164 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt263$Created_by_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_164, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_165 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(NIL != creator_name ? ((SubLObject) (creator_name)) : constants_high.constant_name(creator));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_165, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_163, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != creation_time) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_166 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_167 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt264$Creation_time_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_167, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_168 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(numeric_date_utilities.datestring(creation_time));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_168, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_166, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != loader) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_169 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_170 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt265$Loaded_by_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_170, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_171 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(NIL != loader_name ? ((SubLObject) (loader_name)) : constants_high.constant_name(loader));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_171, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_169, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != load_date) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_172 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_173 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt266$Load_time_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_173, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_174 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(numeric_date_utilities.datestring(load_date));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_174, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_172, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if ((NIL != display_filter) && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt267$full_editor))) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_175 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_176 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt268$Display_Filter_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_176, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_177 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != tm_internals.tm_filterP(display_filter)) {
                                                html_thesaurus.tm_link($OUTPUT_FILTER, display_filter, UNPROVIDED, UNPROVIDED);
                                            } else {
                                                html_utilities.html_princ($$$None);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_177, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_175, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if ((NIL != output_filter) && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt267$full_editor))) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_178 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_179 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt271$Output_Filter_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_179, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_180 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != tm_internals.tm_filterP(output_filter)) {
                                                html_thesaurus.tm_link($OUTPUT_FILTER, output_filter, UNPROVIDED, UNPROVIDED);
                                            } else {
                                                html_utilities.html_princ($$$None);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_180, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_178, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if ((NIL != tm_internals.tm_default_case_for_thesaurus(thesaurus)) && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt209$limited_editor))) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_181 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_182 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt272$Case_Style_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_182, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_183 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(assoc(tm_internals.tm_default_case_for_thesaurus(thesaurus), $tm_case_style_specifiers_and_descriptors$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_183, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_181, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_184 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != comment) {
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_185 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt274$Comment_);
                                            if ((NIL != tm_internals.editing_allowedP()) && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt267$full_editor))) {
                                                html_utilities.html_br();
                                                html_thesaurus.tm_link($ADD_OR_EDIT_COMMENT, cb_utilities.cb_fort_identifier(thesaurus), T, UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_185, thread);
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
                                        SubLObject _prev_bind_0_186 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(comment);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_186, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } else {
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_187 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if ((NIL != tm_internals.editing_allowedP()) && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt267$full_editor))) {
                                                html_thesaurus.tm_link($ADD_OR_EDIT_COMMENT, cb_utilities.cb_fort_identifier(thesaurus), NIL, UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_187, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_184, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt209$limited_editor)) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_188 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_189 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_thesaurus.tm_link($SET_OR_VIEW_APPLICABLE_RELATIONS, cb_utilities.cb_fort_identifier(thesaurus), UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_189, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_188, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if ((NIL != tm_internals.editing_allowedP()) && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator))) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_190 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_191 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_thesaurus.tm_link($SET_FILTER, thesaurus, $DISPLAY, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_191, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_192 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_192, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_190, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_193 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_194 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_thesaurus.tm_link($SET_FILTER, thesaurus, $OUTPUT, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_194, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_195 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_195, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_193, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_196 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_197 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_thesaurus.tm_link($SET_CASE_STYLE, thesaurus, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_197, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_198 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_198, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_196, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_199 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_200 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_thesaurus.tm_link($SET_OR_VIEW_INTEGRITY_RULES, thesaurus, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_200, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_201 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_201, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_199, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_202 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_203 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_thesaurus.tm_link($TOGGLE_RELEASE_STATUS, thesaurus, releasedP, UNPROVIDED);
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
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_204, thread);
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
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_utilities.html_br();
                html_utilities.html_br();
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt283$Statistics_for_the_thesaurus__);
                html_utilities.html_princ(thesaurus_name);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_br();
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
                        if (NIL != pt_count) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_205 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_206 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt284$Number_of_PTs_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_206, thread);
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
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_207 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt285$_6D, pt_count);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_207, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_205, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != uf_count) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_208 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_209 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt286$Number_of_UFs_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_209, thread);
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
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_210 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt285$_6D, uf_count);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_210, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_208, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != sn_count) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_211 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_212 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt287$Number_of_SNs_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_212, thread);
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
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_213 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt285$_6D, sn_count);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_213, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_211, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != rt_count) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_214 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_215 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt288$Number_of_RT_links_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_215, thread);
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
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_216 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt285$_6D, rt_count);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_216, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_214, thread);
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
                if (NIL != tops) {
                    html_utilities.html_br();
                    html_utilities.html_br();
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt289$_A_known_top_A_in_the_thesaurus__, len, len.numE(ONE_INTEGER) ? ((SubLObject) ($str_alt55$)) : $$$s);
                    html_utilities.html_princ(thesaurus_name);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_br();
                    tm_thesaurus_constant(caar(tops), second(tops.first()), T, T, list(thesaurus), UNPROVIDED, UNPROVIDED);
                    html_utilities.html_br();
                    {
                        SubLObject cdolist_list_var = tops.rest();
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            tm_thesaurus_constant(pair.first(), second(pair), T, T, list(thesaurus), UNPROVIDED, UNPROVIDED);
                            html_utilities.html_br();
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_about_thesaurus(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thes_id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject thes_constant = html_thesaurus.tm_guess_fort(thes_id);
                SubLObject basicP = makeBoolean((tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE) == $BASIC) && (NIL != tm_datastructures.$tm_basic_interface_availableP$.getDynamicValue(thread)));
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(format(NIL, $str_alt290$Information_about___A__thesaurus, tm_internals.thesaurus_name(thes_constant)));
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
                            SubLObject _prev_bind_0_217 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_218 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_219 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_219, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_218, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(format(NIL, $str_alt290$Information_about___A__thesaurus, tm_internals.thesaurus_name(thes_constant)));
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(format(NIL, $str_alt290$Information_about___A__thesaurus, tm_internals.thesaurus_name(thes_constant)));
                                if (NIL != basicP) {
                                    html_basic_thesaurus.thesaurus_basic_heading($str_alt291$tm_basic_about_thesaurus);
                                    html_utilities.html_br();
                                    html_basic_thesaurus.tm_basic_thesaurus_info_section(thes_constant);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt292$tm_about_thesaurus);
                                    tm_thesaurus_info_section(thes_constant);
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_217, thread);
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

    public static final SubLObject tm_add_or_edit_comment(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                    {
                        SubLObject alist = list_utilities.remove_if_not(symbol_function(CONSP), args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject editP = NIL;
                        SubLObject id = NIL;
                        {
                            SubLObject val = cadr(assoc($$$id, alist, symbol_function(STRING_EQUAL), UNPROVIDED));
                            if (NIL != val) {
                                id = funcall(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), val);
                            }
                        }
                        {
                            SubLObject val = cadr(assoc($$$edit, alist, symbol_function(STRING_EQUAL), UNPROVIDED));
                            if (NIL != val) {
                                editP = funcall(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), val);
                            }
                        }
                        {
                            SubLObject constant = html_thesaurus.tm_guess_fort(id);
                            SubLObject name = tm_internals.tm_string_for_constant(constant, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(format(NIL, $str_alt299$_A_comment_about__A, NIL != editP ? ((SubLObject) ($$$Edit_the)) : $$$Add_a, name));
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_220 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_221 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_222 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_223 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_223, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_222, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            }
                                            html_utilities.html_princ(format(NIL, $str_alt299$_A_comment_about__A, NIL != editP ? ((SubLObject) ($$$Edit_the)) : $$$Add_a, name));
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            tm_logging.tm_enqueue_event(format(NIL, $str_alt299$_A_comment_about__A, NIL != editP ? ((SubLObject) ($$$Edit_the)) : $$$Add_a, name));
                                            if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt267$full_editor)))) {
                                                html_utilities.html_princ($str_alt237$Sorry__you_do_not_have_permission);
                                            } else {
                                                html_thesaurus.thesaurus_heading($str_alt302$tm_add_or_edit_comment);
                                                html_macros.verify_not_within_html_pre();
                                                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                {
                                                    SubLObject _prev_bind_0_224 = html_macros.$within_html_pre$.currentBinding(thread);
                                                    try {
                                                        html_macros.$within_html_pre$.bind(T, thread);
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
                                                            SubLObject _prev_bind_0_225 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_226 = html_macros.$within_html_form$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                html_utilities.html_hidden_input($str_alt303$tm_handle_add_or_edit_comment, T, UNPROVIDED);
                                                                html_utilities.html_hidden_input($$$edit, NIL != editP ? ((SubLObject) ($$$T)) : $$$NIL, UNPROVIDED);
                                                                html_utilities.html_hidden_input($$$id, id, UNPROVIDED);
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt306$_A_comment_text_below_, NIL != editP ? ((SubLObject) ($$$Edit_the)) : $$$Enter);
                                                                html_utilities.html_terpri(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($$$comment);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($int$80);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(THREE_INTEGER);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_227 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (NIL != editP) {
                                                                            html_utilities.html_princ(kb_mapping_utilities.fpred_value_in_any_mt(constant, $$comment, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_227, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                                html_utilities.html_terpri(UNPROVIDED);
                                                                html_utilities.html_submit_input(NIL != editP ? ((SubLObject) ($$$Change)) : $$$Add, UNPROVIDED, UNPROVIDED);
                                                                html_utilities.html_reset_input(UNPROVIDED);
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1_226, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_225, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_224, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                            }
                                            html_thesaurus.tm_footer();
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_221, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_220, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_add_or_edit_comment(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                    {
                        SubLObject alist = list_utilities.remove_if_not(symbol_function(CONSP), args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject comment = NIL;
                        SubLObject editP = NIL;
                        SubLObject id = NIL;
                        {
                            SubLObject val = cadr(assoc($$$id, alist, symbol_function(STRING_EQUAL), UNPROVIDED));
                            if (NIL != val) {
                                id = funcall(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), val);
                            }
                        }
                        {
                            SubLObject val = cadr(assoc($$$edit, alist, symbol_function(STRING_EQUAL), UNPROVIDED));
                            if (NIL != val) {
                                editP = funcall(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), val);
                            }
                        }
                        {
                            SubLObject val = cadr(assoc($$$comment, alist, symbol_function(STRING_EQUAL), UNPROVIDED));
                            if (NIL != val) {
                                comment = funcall(symbol_function(REDUCE_WHITESPACE), val);
                            }
                        }
                        {
                            SubLObject constant = html_thesaurus.tm_guess_fort(id);
                            SubLObject op = tm_datastructures.make_tm_op(UNPROVIDED);
                            if (NIL != editP) {
                                {
                                    SubLObject op_228 = op;
                                    tm_datastructures._csetf_tm_op_opcode(op_228, $REPLACE);
                                    tm_datastructures._csetf_tm_op_relation(op_228, $$comment);
                                    tm_datastructures._csetf_tm_op_inverseP(op_228, NIL);
                                    tm_datastructures._csetf_tm_op_args(op_228, list(constant, kb_mapping_utilities.fpred_value_in_any_mt(constant, $$comment, UNPROVIDED, UNPROVIDED, UNPROVIDED), comment));
                                    tm_datastructures._csetf_tm_op_thesaurus(op_228, tm_datastructures.$tm_mt$.getGlobalValue());
                                    tm_datastructures._csetf_tm_op_status(op_228, NIL);
                                    tm_datastructures._csetf_tm_op_verifyP(op_228, NIL);
                                    tm_datastructures._csetf_tm_op_hiddenP(op_228, NIL);
                                    tm_datastructures._csetf_tm_op_description(op_228, NIL);
                                    tm_datastructures._csetf_tm_op_description_args(op_228, NIL);
                                    if (NIL.isString()) {
                                        html_tm_editing.set_op_english(op_228, NIL);
                                    } else {
                                        html_tm_editing.set_op_english(op_228, UNPROVIDED);
                                    }
                                }
                            } else {
                                {
                                    SubLObject op_229 = op;
                                    tm_datastructures._csetf_tm_op_opcode(op_229, $ADD);
                                    tm_datastructures._csetf_tm_op_relation(op_229, $$comment);
                                    tm_datastructures._csetf_tm_op_inverseP(op_229, NIL);
                                    tm_datastructures._csetf_tm_op_args(op_229, list(constant, comment));
                                    tm_datastructures._csetf_tm_op_thesaurus(op_229, tm_datastructures.$tm_mt$.getGlobalValue());
                                    tm_datastructures._csetf_tm_op_status(op_229, NIL);
                                    tm_datastructures._csetf_tm_op_verifyP(op_229, NIL);
                                    tm_datastructures._csetf_tm_op_hiddenP(op_229, NIL);
                                    tm_datastructures._csetf_tm_op_description(op_229, NIL);
                                    tm_datastructures._csetf_tm_op_description_args(op_229, NIL);
                                    if (NIL.isString()) {
                                        html_tm_editing.set_op_english(op_229, NIL);
                                    } else {
                                        html_tm_editing.set_op_english(op_229, UNPROVIDED);
                                    }
                                }
                            }
                            thread.resetMultipleValues();
                            {
                                SubLObject bad = tm_internals.check_operations(list(op));
                                SubLObject good = thread.secondMultipleValue();
                                SubLObject verifyP = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL == good) {
                                    html_tm_editing.html_show_bad_ops_page(bad);
                                } else {
                                    html_tm_editing.do_good_ops_results(bad, good, symbol_function(TM_THESAURUS_INFO_SECTION), list(constant), $$$Add_Comment, UNPROVIDED);
                                }
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_change_released_status(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject op = tm_datastructures.get_tm_op();
                SubLObject thesaurus_constant = NIL;
                SubLObject releasedP = NIL;
                SubLObject opcode = NIL;
                SubLObject ops = NIL;
                if (NIL == cb_utilities.cb_valid_fort_identifierP(id)) {
                    return html_thesaurus.tm_error($str_alt320$Implementation_error__Can_t_deter, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                thesaurus_constant = html_thesaurus.tm_guess_fort(id);
                if (NIL == tm_internals.thesaurusP(thesaurus_constant)) {
                    return html_thesaurus.tm_error($str_alt321$Implementation_error___A_is_not_a, thesaurus_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                releasedP = tm_internals.released_thesaurusP(thesaurus_constant);
                opcode = (NIL != releasedP) ? ((SubLObject) ($DELETE)) : $ADD;
                {
                    SubLObject op_230 = op;
                    tm_datastructures._csetf_tm_op_opcode(op_230, opcode);
                    tm_datastructures._csetf_tm_op_relation(op_230, tm_datastructures.$tm_released_thesaurus_pred$.getGlobalValue());
                    tm_datastructures._csetf_tm_op_inverseP(op_230, NIL);
                    tm_datastructures._csetf_tm_op_args(op_230, list(thesaurus_constant));
                    tm_datastructures._csetf_tm_op_thesaurus(op_230, tm_datastructures.$tm_mt$.getGlobalValue());
                    tm_datastructures._csetf_tm_op_status(op_230, NIL);
                    tm_datastructures._csetf_tm_op_verifyP(op_230, NIL);
                    tm_datastructures._csetf_tm_op_hiddenP(op_230, T);
                    tm_datastructures._csetf_tm_op_description(op_230, NIL);
                    tm_datastructures._csetf_tm_op_description_args(op_230, NIL);
                    if (NIL.isString()) {
                        html_tm_editing.set_op_english(op_230, NIL);
                    } else {
                        html_tm_editing.set_op_english(op_230, UNPROVIDED);
                    }
                }
                ops = cons(op, ops);
                thread.resetMultipleValues();
                {
                    SubLObject bad = tm_internals.check_operations(ops);
                    SubLObject good = thread.secondMultipleValue();
                    SubLObject verifyP = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == good) {
                        html_tm_editing.html_show_bad_ops_page(bad);
                    } else {
                        {
                            SubLObject title = (NIL != releasedP) ? ((SubLObject) ($$$Recall_Thesaurus)) : $$$Release_Thesaurus;
                            html_tm_editing.do_good_ops_results(bad, good, symbol_function(TM_THESAURUS_INFO_SECTION), list(thesaurus_constant), title, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Preconditions: First element of args is a string from which the id number of thesaurus
     * constant can be read.
     * Second element of args is one of the strings ":display" ":output"
     */
    public static final SubLObject tm_change_filter(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject filter_type = read_from_string_ignoring_errors(second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject thesaurus_constant = NIL;
                SubLObject current_filter_constant = NIL;
                if (NIL == cb_utilities.cb_valid_fort_identifierP(id)) {
                    return html_thesaurus.tm_error($str_alt320$Implementation_error__Can_t_deter, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL == subl_promotions.memberP(filter_type, $list_alt326, UNPROVIDED, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt327$Implementation_error__Can_t_deter, filter_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                thesaurus_constant = html_thesaurus.tm_guess_fort(id);
                if (NIL == tm_internals.thesaurusP(thesaurus_constant)) {
                    return html_thesaurus.tm_error($str_alt321$Implementation_error___A_is_not_a, thesaurus_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (filter_type.eql($DISPLAY)) {
                    current_filter_constant = tm_internals.tm_default_display_filter(thesaurus_constant);
                } else {
                    current_filter_constant = tm_internals.tm_default_output_filter(thesaurus_constant);
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(format(NIL, $str_alt328$Set_Default__A_Filter_for__A, Strings.string_capitalize(format(NIL, $str_alt329$_A, filter_type), UNPROVIDED, UNPROVIDED), tm_internals.thesaurus_name(thesaurus_constant)));
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
                                SubLObject _prev_bind_0_231 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_232 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_233 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_233, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_232, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(format(NIL, $str_alt328$Set_Default__A_Filter_for__A, Strings.string_capitalize(format(NIL, $str_alt329$_A, filter_type), UNPROVIDED, UNPROVIDED), tm_internals.thesaurus_name(thesaurus_constant)));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(format(NIL, $str_alt328$Set_Default__A_Filter_for__A, Strings.string_capitalize(format(NIL, $str_alt329$_A, filter_type), UNPROVIDED, UNPROVIDED), tm_internals.thesaurus_name(thesaurus_constant)));
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt237$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt330$tm_change_filter);
                                        {
                                            SubLObject all_filters = tm_internals.tm_all_filters();
                                            SubLObject select_size = max(min(length(all_filters), EIGHT_INTEGER), FOUR_INTEGER);
                                            html_utilities.html_princ($str_alt331$Choose_a_Filter_);
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
                                                SubLObject _prev_bind_0_234 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt332$tm_handle_change_filter, T, UNPROVIDED);
                                                    html_utilities.html_hidden_input($str_alt333$thesaurus_id, id, UNPROVIDED);
                                                    html_utilities.html_hidden_input($str_alt334$filter_type, second(args), UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($$$filter);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != select_size) {
                                                        html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(select_size);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_235 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                            {
                                                                SubLObject _prev_bind_0_236 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                                    if (NIL == current_filter_constant) {
                                                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_237 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ($str_alt0$_none_);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_237, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_236, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                            {
                                                                SubLObject cdolist_list_var = all_filters;
                                                                SubLObject filter_constant = NIL;
                                                                for (filter_constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter_constant = cdolist_list_var.first()) {
                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                    {
                                                                        SubLObject _prev_bind_0_238 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(NIL, thread);
                                                                            if (current_filter_constant == filter_constant) {
                                                                                html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_239 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ(tm_internals.tm_filter_name(filter_constant));
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_239, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_238, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_235, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                    html_utilities.html_br();
                                                    html_utilities.html_submit_input($$$Set_Filter, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_reset_input(UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_234, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt337$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_princ($str_alt338$tm_edit_output_filter);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_240 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($$$Define_a_New_Filter);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_240, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_231, thread);
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

    public static final SubLObject tm_handle_change_filter(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt333$thesaurus_id, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject filter = html_utilities.html_extract_input($$$filter, args);
                SubLObject filter_type = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt334$filter_type, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject thesaurus_constant = NIL;
                SubLObject current_filter_constant = NIL;
                SubLObject relation = NIL;
                SubLObject filter_constant = NIL;
                if (NIL == cb_utilities.cb_valid_fort_identifierP(id)) {
                    return html_thesaurus.tm_error($str_alt320$Implementation_error__Can_t_deter, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                thesaurus_constant = html_thesaurus.tm_guess_fort(id);
                if (NIL == tm_internals.thesaurusP(thesaurus_constant)) {
                    return html_thesaurus.tm_error($str_alt321$Implementation_error___A_is_not_a, thesaurus_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL == subl_promotions.memberP(filter_type, $list_alt341, UNPROVIDED, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt342$Implementation_error___A_is_an_un, filter_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (filter_type.eql($DISPLAY)) {
                    current_filter_constant = tm_internals.tm_default_display_filter(thesaurus_constant);
                    relation = $$tmDefaultDisplayFilter;
                } else {
                    current_filter_constant = tm_internals.tm_default_output_filter(thesaurus_constant);
                    relation = $$tmDefaultOutputFilter;
                }
                if (!filter.equalp($str_alt0$_none_)) {
                    filter_constant = tm_internals.tm_filter_from_name(filter);
                }
                if (filter_constant == current_filter_constant) {
                    return html_thesaurus.tm_message_to_user(format(NIL, $str_alt345$_A_Filter_not_Changed, Strings.string_capitalize(format(NIL, $str_alt329$_A, filter_type), UNPROVIDED, UNPROVIDED)), $str_alt346$No_change_was_requested_);
                }
                {
                    SubLObject add = tm_datastructures.get_tm_op();
                    SubLObject delete = tm_datastructures.get_tm_op();
                    SubLObject ops = NIL;
                    if (NIL != current_filter_constant) {
                        {
                            SubLObject op = delete;
                            tm_datastructures._csetf_tm_op_opcode(op, $DELETE);
                            tm_datastructures._csetf_tm_op_relation(op, relation);
                            tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                            tm_datastructures._csetf_tm_op_args(op, list(thesaurus_constant, current_filter_constant));
                            tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                            tm_datastructures._csetf_tm_op_status(op, NIL);
                            tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                            tm_datastructures._csetf_tm_op_hiddenP(op, T);
                            tm_datastructures._csetf_tm_op_description(op, NIL);
                            tm_datastructures._csetf_tm_op_description_args(op, NIL);
                            if (NIL.isString()) {
                                html_tm_editing.set_op_english(op, NIL);
                            } else {
                                html_tm_editing.set_op_english(op, UNPROVIDED);
                            }
                        }
                        ops = cons(delete, ops);
                    }
                    if (NIL != filter_constant) {
                        {
                            SubLObject op = add;
                            tm_datastructures._csetf_tm_op_opcode(op, $ADD);
                            tm_datastructures._csetf_tm_op_relation(op, relation);
                            tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                            tm_datastructures._csetf_tm_op_args(op, list(thesaurus_constant, filter_constant));
                            tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                            tm_datastructures._csetf_tm_op_status(op, NIL);
                            tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                            tm_datastructures._csetf_tm_op_hiddenP(op, T);
                            tm_datastructures._csetf_tm_op_description(op, NIL);
                            tm_datastructures._csetf_tm_op_description_args(op, NIL);
                            if (NIL.isString()) {
                                html_tm_editing.set_op_english(op, NIL);
                            } else {
                                html_tm_editing.set_op_english(op, UNPROVIDED);
                            }
                        }
                        ops = cons(add, ops);
                    }
                    ops = nreverse(ops);
                    thread.resetMultipleValues();
                    {
                        SubLObject bad = tm_internals.check_operations(ops);
                        SubLObject good = thread.secondMultipleValue();
                        SubLObject verifyP = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == good) {
                            html_tm_editing.html_show_bad_ops_page(bad);
                        } else {
                            html_tm_editing.do_good_ops_results(bad, good, symbol_function(TM_THESAURUS_INFO_SECTION), list(thesaurus_constant), format(NIL, $str_alt347$Set_Default__A_Filter, Strings.string_capitalize(format(NIL, $str_alt329$_A, filter_type), UNPROVIDED, UNPROVIDED)), UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Preconditions: First element of args is a string from which the id number of thesaurus
     * constant can be read.
     */
    public static final SubLObject tm_set_case_style(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject thesaurus_constant = NIL;
                SubLObject current_case_style_specifier = NIL;
                if (NIL == cb_utilities.cb_valid_fort_identifierP(id)) {
                    return html_thesaurus.tm_error($str_alt320$Implementation_error__Can_t_deter, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                thesaurus_constant = html_thesaurus.tm_guess_fort(id);
                if (NIL == tm_internals.thesaurusP(thesaurus_constant)) {
                    return html_thesaurus.tm_error($str_alt321$Implementation_error___A_is_not_a, thesaurus_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                current_case_style_specifier = tm_internals.tm_default_case_for_thesaurus(thesaurus_constant);
                if (NIL == current_case_style_specifier) {
                    current_case_style_specifier = tm_internals.$tm_default_case_as_is$.getGlobalValue();
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(format(NIL, $str_alt349$Set_Default_Case_Style_for__A, tm_internals.thesaurus_name(thesaurus_constant)));
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
                                SubLObject _prev_bind_0_241 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_242 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_243 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_243, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_242, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(format(NIL, $str_alt349$Set_Default_Case_Style_for__A, tm_internals.thesaurus_name(thesaurus_constant)));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(format(NIL, $str_alt349$Set_Default_Case_Style_for__A, tm_internals.thesaurus_name(thesaurus_constant)));
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt237$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt350$tm_set_case_style);
                                        {
                                            SubLObject select_size = length($tm_case_style_specifiers_and_descriptors$.getDynamicValue(thread));
                                            html_utilities.html_princ($str_alt351$Choose_a_Case_Style_);
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
                                                SubLObject _prev_bind_0_244 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt352$tm_handle_set_case_style, T, UNPROVIDED);
                                                    html_utilities.html_hidden_input($str_alt333$thesaurus_id, id, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($str_alt353$case_style);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != select_size) {
                                                        html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(select_size);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_245 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            {
                                                                SubLObject cdolist_list_var = $tm_case_style_specifiers_and_descriptors$.getDynamicValue(thread);
                                                                SubLObject case_descriptor_pair = NIL;
                                                                for (case_descriptor_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , case_descriptor_pair = cdolist_list_var.first()) {
                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                    {
                                                                        SubLObject _prev_bind_0_246 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(NIL, thread);
                                                                            if (current_case_style_specifier == case_descriptor_pair.first()) {
                                                                                html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_247 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ(case_descriptor_pair.rest());
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_247, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_246, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_245, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                    html_utilities.html_br();
                                                    html_utilities.html_submit_input($$$Set_Case, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_reset_input(UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_244, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_br();
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_241, thread);
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

    public static final SubLObject tm_handle_set_case_style(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt333$thesaurus_id, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject case_style = html_utilities.html_extract_input($str_alt353$case_style, args);
                SubLObject thesaurus_constant = NIL;
                SubLObject current_style_specifier = NIL;
                SubLObject new_style_specifier = NIL;
                if (NIL == cb_utilities.cb_valid_fort_identifierP(id)) {
                    return html_thesaurus.tm_error($str_alt320$Implementation_error__Can_t_deter, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                thesaurus_constant = html_thesaurus.tm_guess_fort(id);
                if (NIL == tm_internals.thesaurusP(thesaurus_constant)) {
                    return html_thesaurus.tm_error($str_alt321$Implementation_error___A_is_not_a, thesaurus_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                current_style_specifier = tm_internals.tm_default_case_for_thesaurus(thesaurus_constant);
                new_style_specifier = rassoc(case_style, $tm_case_style_specifiers_and_descriptors$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED).first();
                if (new_style_specifier.eql(current_style_specifier)) {
                    return html_thesaurus.tm_message_to_user(format(NIL, $str_alt356$Case_Style_for__A_not_Changed, tm_internals.thesaurus_name(thesaurus_constant)), $str_alt346$No_change_was_requested_);
                }
                tm_internals.tm_set_default_case_for_thesaurus(thesaurus_constant, new_style_specifier);
                tm_at(list(format(NIL, $str_alt329$_A, id)));
            }
            return NIL;
        }
    }

    // defparameter
    private static final SubLSymbol $tm_use_integrity_module_string$ = makeSymbol("*TM-USE-INTEGRITY-MODULE-STRING*");

    // defparameter
    private static final SubLSymbol $tm_do_not_use_integrity_module_string$ = makeSymbol("*TM-DO-NOT-USE-INTEGRITY-MODULE-STRING*");

    public static final SubLObject tm_extract_module_selections(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = tm_integrity.tm_all_integrity_modules();
                SubLObject module = NIL;
                for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                    if (NIL == tm_integrity.tm_integrity_module_required(module)) {
                        {
                            SubLObject name = tm_integrity.tm_integrity_module_name_as_string(module);
                            SubLObject value = NIL;
                            if (NIL == name) {
                                name = format(NIL, $str_alt358$_s, module);
                            }
                            value = html_utilities.html_extract_input(name, args);
                            if (value.equal($tm_use_integrity_module_string$.getDynamicValue(thread))) {
                                result = cons(list(module, tm_internals.$tm_use_integrity_module$.getGlobalValue()), result);
                            } else
                                if (value.equal($tm_do_not_use_integrity_module_string$.getDynamicValue(thread))) {
                                    result = cons(list(module, tm_internals.$tm_do_not_use_integrity_module$.getGlobalValue()), result);
                                }

                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject tm_more_information_for_integrity_module_link(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, $sym359$TMI_MODULE_);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt337$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt360$tm_more_information_for_integrity, module);
            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_princ($str_alt361$More_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            return NIL;
        }
    }

    // defparameter
    private static final SubLSymbol $tm_map_with_breaks_and_spaces$ = makeSymbol("*TM-MAP-WITH-BREAKS-AND-SPACES*");

    /**
     * Preconditions: module is the first element of args.
     */
    public static final SubLObject tm_more_information_for_integrity_module(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject module = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject space = THREE_INTEGER;
                if (NIL == tm_integrity.tmi_moduleP(module)) {
                    return html_thesaurus.tm_error($str_alt364$Unrecognized_Integrity_Rule__s_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($str_alt365$More_Information_for_Integrity_Ru);
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
                                SubLObject _prev_bind_0_248 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_249 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_250 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_250, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_249, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($str_alt365$More_Information_for_Integrity_Ru);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($str_alt365$More_Information_for_Integrity_Ru);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt237$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt366$tm_more_information_for_integrity);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        html_utilities.html_princ(tm_integrity.tm_integrity_module_short_description(module));
                                        html_utilities.html_indent(space);
                                        {
                                            SubLObject _prev_bind_0_251 = html_macros.$html_preserve_breaks$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$html_escapes_map$.currentBinding(thread);
                                            try {
                                                html_macros.$html_preserve_breaks$.bind(T, thread);
                                                html_macros.$html_escapes_map$.bind($tm_map_with_breaks_and_spaces$.getDynamicValue(thread), thread);
                                                html_utilities.html_princ(tm_integrity.tm_integrity_module_description(module));
                                            } finally {
                                                html_macros.$html_escapes_map$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_preserve_breaks$.rebind(_prev_bind_0_251, thread);
                                            }
                                        }
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_248, thread);
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
     * Preconditions:  (thesaurus? thesaurus) => T
     * Postconditions:  A table of integrity rule info has been written out to *html-stream*.
     * If selections is non-nil, then radio buttons were printed as well.
     */
    public static final SubLObject tm_integrity_rule_table(SubLObject thesaurus, SubLObject selections) {
        if (selections == UNPROVIDED) {
            selections = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_modules = tm_integrity.tm_all_integrity_modules();
                SubLObject border = FIVE_INTEGER;
                SubLObject space = TWO_INTEGER;
                SubLObject span_all = THREE_INTEGER;
                SubLObject span_buttons = TWO_INTEGER;
                SubLObject required = NIL;
                SubLObject optional = NIL;
                {
                    SubLObject cdolist_list_var = v_modules;
                    SubLObject module = NIL;
                    for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                        if (NIL != tm_integrity.tm_integrity_module_required(module)) {
                            required = cons(module, required);
                        } else {
                            optional = cons(module, optional);
                        }
                    }
                }
                required = Sort.sort(required, symbol_function(SYMBOL_SORT_PRED), UNPROVIDED);
                optional = Sort.sort(optional, symbol_function(SYMBOL_SORT_PRED), UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (NIL != border) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(border);
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
                            SubLObject _prev_bind_0_252 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_253 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ON);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_253, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_254 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$OFF);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_254, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_255 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$DESCRIPTION);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_255, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_252, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_256 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (NIL != span_all) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(span_all);
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
                                    SubLObject _prev_bind_0_257 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Optional_Integrity_Checker_Rules);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_257, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_256, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = optional;
                            SubLObject module = NIL;
                            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                                {
                                    SubLObject name = tm_integrity.tm_integrity_module_name_as_string(module);
                                    SubLObject on = (tm_internals.tm_use_integrity_module_for_thesaurusP(thesaurus, module).eql(tm_internals.$tm_use_integrity_module$.getGlobalValue())) ? ((SubLObject) (T)) : NIL;
                                    if (NIL == name) {
                                        name = format(NIL, $str_alt358$_s, module);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_258 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_259 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    if (NIL != selections) {
                                                        html_utilities.html_radio_input(name, $tm_use_integrity_module_string$.getDynamicValue(thread), on);
                                                    }
                                                    if ((NIL != selections) || (NIL != on)) {
                                                        html_utilities.html_indent(space);
                                                        html_utilities.html_princ($$$On);
                                                        html_utilities.html_indent(space);
                                                    } else {
                                                        html_utilities.html_indent(space);
                                                    }
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
                                                    if (NIL != selections) {
                                                        html_utilities.html_radio_input(name, $tm_do_not_use_integrity_module_string$.getDynamicValue(thread), NIL == on ? ((SubLObject) (T)) : NIL);
                                                    }
                                                    if ((NIL != selections) || (NIL == on)) {
                                                        html_utilities.html_indent(space);
                                                        html_utilities.html_princ($$$Off);
                                                        html_utilities.html_indent(space);
                                                    } else {
                                                        html_utilities.html_indent(space);
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_260, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_261 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ(tm_integrity.tm_integrity_module_short_description(module));
                                                    html_utilities.html_indent(space);
                                                    tm_more_information_for_integrity_module_link(module);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_261, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_258, thread);
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
                            SubLObject _prev_bind_0_262 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (NIL != span_all) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(span_all);
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
                                    SubLObject _prev_bind_0_263 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Required_Integrity_Checker_Rules);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_263, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_262, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = required;
                            SubLObject module = NIL;
                            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_264 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (NIL != span_buttons) {
                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(span_buttons);
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
                                            SubLObject _prev_bind_0_265 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($$$Required);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_265, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_266 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ(tm_integrity.tm_integrity_module_short_description(module));
                                                html_utilities.html_indent(space);
                                                tm_more_information_for_integrity_module_link(module);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_266, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_264, thread);
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
            return NIL;
        }
    }

    /**
     * Preconditions: First element of args is a string from which the id number of thesaurus
     * constant can be read.
     */
    public static final SubLObject tm_choose_integrity_modules_to_use(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject thesaurus_constant = NIL;
                if (NIL == cb_utilities.cb_valid_fort_identifierP(id)) {
                    return html_thesaurus.tm_error($str_alt320$Implementation_error__Can_t_deter, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                thesaurus_constant = html_thesaurus.tm_guess_fort(id);
                if (NIL == tm_internals.thesaurusP(thesaurus_constant)) {
                    return html_thesaurus.tm_error($str_alt321$Implementation_error___A_is_not_a, thesaurus_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(format(NIL, $str_alt378$Choose_Integrity_Rules_to_use_for, tm_internals.thesaurus_name(thesaurus_constant)));
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
                                SubLObject _prev_bind_0_267 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_268 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_269 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_269, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_268, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(format(NIL, $str_alt378$Choose_Integrity_Rules_to_use_for, tm_internals.thesaurus_name(thesaurus_constant)));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(format(NIL, $str_alt378$Choose_Integrity_Rules_to_use_for, tm_internals.thesaurus_name(thesaurus_constant)));
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt237$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt379$tm_choose_integrity_modules_to_us);
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
                                            SubLObject _prev_bind_0_270 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt380$tm_handle_choose_integrity_module, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt333$thesaurus_id, id, UNPROVIDED);
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                tm_integrity_rule_table(thesaurus_constant, T);
                                                html_utilities.html_br();
                                                html_utilities.html_submit_input($$$Use_only_these_Rules, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_reset_input(UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_270, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_utilities.html_br();
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_267, thread);
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

    public static final SubLObject tm_handle_choose_integrity_modules_to_use(SubLObject args) {
        {
            SubLObject id = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt333$thesaurus_id, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject thesaurus_constant = NIL;
            if (NIL == cb_utilities.cb_valid_fort_identifierP(id)) {
                return html_thesaurus.tm_error($str_alt320$Implementation_error__Can_t_deter, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            thesaurus_constant = html_thesaurus.tm_guess_fort(id);
            if (NIL == tm_internals.thesaurusP(thesaurus_constant)) {
                return html_thesaurus.tm_error($str_alt321$Implementation_error___A_is_not_a, thesaurus_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject cdolist_list_var = tm_extract_module_selections(args);
                SubLObject module_value_pair = NIL;
                for (module_value_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_value_pair = cdolist_list_var.first()) {
                    apply(symbol_function(TM_SET_USE_VALUE_FOR_INTEGRITY_MODULE_FOR_THESAURUS), thesaurus_constant, module_value_pair);
                }
            }
            tm_integrity_module_info_page(list(format(NIL, $str_alt329$_A, id)));
        }
        return NIL;
    }

    public static final SubLObject tm_integrity_module_info_page(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject thesaurus_constant = NIL;
                if (NIL == cb_utilities.cb_valid_fort_identifierP(id)) {
                    return html_thesaurus.tm_error($str_alt320$Implementation_error__Can_t_deter, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                thesaurus_constant = html_thesaurus.tm_guess_fort(id);
                if (NIL == tm_internals.thesaurusP(thesaurus_constant)) {
                    return html_thesaurus.tm_error($str_alt321$Implementation_error___A_is_not_a, thesaurus_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(format(NIL, $str_alt385$Integrity_Rule_Information_for__A, tm_internals.thesaurus_name(thesaurus_constant)));
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
                                SubLObject _prev_bind_0_271 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_272 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_273 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_273, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_272, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(format(NIL, $str_alt385$Integrity_Rule_Information_for__A, tm_internals.thesaurus_name(thesaurus_constant)));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(format(NIL, $str_alt385$Integrity_Rule_Information_for__A, tm_internals.thesaurus_name(thesaurus_constant)));
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt237$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt386$tm_integrity_module_info_page);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        tm_integrity_rule_table(thesaurus_constant, NIL);
                                        html_utilities.html_br();
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_271, thread);
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
                html_utilities.html_br();
            }
            return NIL;
        }
    }

    /**
     * short function name for use in urls
     */
    public static final SubLObject tm_tit(SubLObject args) {
        tm_term_in_thesaurus(args);
        return NIL;
    }

    public static final SubLObject tm_term_in_thesaurus(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thes_id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject subject_term_id = read_from_string_ignoring_errors(second(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject thes_constant = html_thesaurus.tm_guess_fort(thes_id);
                SubLObject subject_term_constant = html_thesaurus.tm_guess_fort(subject_term_id);
                SubLObject preferred = tm_datastructures.concept_term(subject_term_constant, thes_constant);
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(format(NIL, $str_alt389$Focus_on___A__in_thesaurus__A_, preferred, tm_internals.thesaurus_name(thes_constant)));
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
                            SubLObject _prev_bind_0_274 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_275 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_276 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_276, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_275, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(format(NIL, $str_alt389$Focus_on___A__in_thesaurus__A_, preferred, tm_internals.thesaurus_name(thes_constant)));
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(format(NIL, $str_alt389$Focus_on___A__in_thesaurus__A_, preferred, tm_internals.thesaurus_name(thes_constant)));
                                html_thesaurus.thesaurus_heading($str_alt390$tm_term_in_thesaurus);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                tm_thesaurus_constant(subject_term_constant, NIL, T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_br();
                                tm_full_record_guts_separate(subject_term_constant, list(thes_constant));
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_274, thread);
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

    public static final SubLObject tm_print_spec_relations(SubLObject symbol, SubLObject arg_index, SubLObject depth, SubLObject graphable_symbols, SubLObject symbols_done) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject constant = second(assoc(symbol, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
                        SubLObject spec_preds = genl_predicates.spec_predicates(constant, UNPROVIDED, UNPROVIDED);
                        SubLObject spec_symbols = NIL;
                        {
                            SubLObject cdolist_list_var = spec_preds;
                            SubLObject p = NIL;
                            for (p = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , p = cdolist_list_var.first()) {
                                spec_symbols = cons(tm_internals.tm_pred_arg_symbol(p, arg_index), spec_symbols);
                            }
                        }
                        spec_symbols = Sort.sort(spec_symbols, symbol_function($sym392$TM_PRED_SYMBOL__), UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = spec_symbols;
                            SubLObject s = NIL;
                            for (s = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , s = cdolist_list_var.first()) {
                                {
                                    SubLObject graphableP = gethash(s, graphable_symbols, UNPROVIDED);
                                    if (NIL == gethash(s, symbols_done, UNPROVIDED)) {
                                        if (NIL != graphableP) {
                                            {
                                                SubLObject indent = depth;
                                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_277 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_278 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_thesaurus.tm_link($RELATION, s, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_278, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_277, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                            sethash(s, symbols_done, T);
                                        }
                                        tm_print_spec_relations(s, arg_index, NIL != graphableP ? ((SubLObject) (add(depth, ONE_INTEGER))) : depth, graphable_symbols, symbols_done);
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
            return NIL;
        }
    }

    public static final SubLObject tm_browse_relations_entry(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.clear_utility_tables(tm_datastructures.$tm_user$.getDynamicValue(thread));
            {
                SubLObject relations = tm_internals.tm_active_relation_symbols_sorted();
                SubLObject graphable_symbols = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_1);
                SubLObject symbols_done = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_2);
                SubLObject depth = ONE_INTEGER;
                tm_internals.mark_graphable_spec_preds(relations);
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$View_Relations);
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
                                SubLObject _prev_bind_0_279 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_280 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_281 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_281, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_280, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($$$View_Relations);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($$$View_Relations);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt209$limited_editor)))) {
                                        html_utilities.html_princ($str_alt237$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt396$tm_browse_relations_entry);
                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Active_Relations);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_br();
                                        html_utilities.html_princ($str_alt398$Choose_a_relation_to_display_);
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
                                            SubLObject _prev_bind_0_282 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$html_indent_table_max$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                                                {
                                                    SubLObject cdolist_list_var = relations;
                                                    SubLObject symbol = NIL;
                                                    for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                                                        if (!((NIL != gethash(symbol, graphable_symbols, UNPROVIDED)) || (NIL != gethash(symbol, symbols_done, UNPROVIDED)))) {
                                                            {
                                                                SubLObject arg_index = third(assoc(symbol, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
                                                                SubLObject indent = depth;
                                                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_283 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                            SubLObject _prev_bind_0_284 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_thesaurus.tm_link($RELATION, symbol, UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_284, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_283, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                sethash(symbol, symbols_done, T);
                                                                tm_print_spec_relations(symbol, arg_index, add(depth, ONE_INTEGER), graphable_symbols, symbols_done);
                                                            }
                                                        }
                                                    }
                                                    html_utilities.html_indent_table_internal(THREE_INTEGER);
                                                }
                                            } finally {
                                                html_macros.$html_indent_table_max$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_282, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)) {
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt399$To_view_other__non_active__relati);
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt337$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_princ($str_alt400$tm_browse_inactive_relations);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_285 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt401$here_);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_285, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt402$To_revise_the_order_in_which_rela);
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt337$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_princ($str_alt403$tm_reorder_relations_display);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_286 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_princ($str_alt401$here_);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_286, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        }
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_279, thread);
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

    public static final SubLObject tm_show_restricted_relations_for_thesaurus(SubLObject thesaurus, SubLObject editingP, SubLObject inactiveP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject available_relations_for_thesaurus = tm_internals.relations_available_in_thesaurus(thesaurus);
                SubLObject restricted_relations = tm_internals.restricted_relations(inactiveP);
                SubLObject space = TWO_INTEGER;
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(THREE_INTEGER);
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
                            SubLObject _prev_bind_0_287 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_288 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Relations);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_288, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_289 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(space);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt407$Applies_);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_indent(space);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_289, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_287, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = restricted_relations;
                            SubLObject relation = NIL;
                            for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                                {
                                    SubLObject inverse = tm_internals.inverse_relation(relation);
                                    SubLObject appliesP = member(relation, available_relations_for_thesaurus, symbol_function(EQUALP), UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_290 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_align($$$middle));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_291 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_indent(space);
                                                    html_thesaurus.tm_link($RELATION, relation, UNPROVIDED, UNPROVIDED);
                                                    if (!(relation.equalp(inverse) || (NIL == inverse))) {
                                                        html_utilities.html_princ($str_alt408$_and_);
                                                        html_thesaurus.tm_link($RELATION, inverse, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    html_utilities.html_indent(space);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_291, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            if (NIL != appliesP) {
                                                if (NIL != editingP) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($$$middle));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_292 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_checkbox_input(relation, T, appliesP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_292, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } else {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($$$middle));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_293 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($$$YES);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_293, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                            } else {
                                                if (NIL != editingP) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($$$middle));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_294 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_checkbox_input(relation, T, appliesP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_294, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } else {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align($$$middle));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_295 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($$$NO);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_295, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_290, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
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

    public static final SubLObject tm_show_unrestricted_relations_for_editing(SubLObject inactiveP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unrestricted_relations = tm_internals.unrestricted_relations(inactiveP);
                SubLObject space = TWO_INTEGER;
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(THREE_INTEGER);
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
                            SubLObject _prev_bind_0_296 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_297 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Relations);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_297, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_298 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(space);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Make_Restricted);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_indent(space);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_298, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_296, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = unrestricted_relations;
                            SubLObject relation = NIL;
                            for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                                {
                                    SubLObject inverse = tm_internals.inverse_relation(relation);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_299 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_align($$$middle));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_300 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_indent(space);
                                                    html_thesaurus.tm_link($RELATION, relation, UNPROVIDED, UNPROVIDED);
                                                    if (!(relation.equalp(inverse) || (NIL == inverse))) {
                                                        html_utilities.html_princ($str_alt408$_and_);
                                                        html_thesaurus.tm_link($RELATION, inverse, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    html_utilities.html_indent(space);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_300, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_align($$$middle));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_301 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    tm_make_relation_restricted_link(relation);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_301, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_299, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
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

    public static final SubLObject tm_make_relation_restricted_link(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = cb_utilities.cb_fort_identifier(second(assoc(relation, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)));
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt337$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt412$tm_restrict_individual_relation__, id, relation);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($$$Make_Restricted);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject tm_print_unrestricted_spec_relations(SubLObject symbol, SubLObject arg_index, SubLObject depth, SubLObject graphable_symbols, SubLObject symbols_done) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject constant = second(assoc(symbol, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
                        SubLObject spec_preds = genl_predicates.spec_predicates(constant, UNPROVIDED, UNPROVIDED);
                        SubLObject spec_symbols = NIL;
                        {
                            SubLObject cdolist_list_var = spec_preds;
                            SubLObject p = NIL;
                            for (p = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , p = cdolist_list_var.first()) {
                                spec_symbols = cons(tm_internals.tm_pred_arg_symbol(p, arg_index), spec_symbols);
                            }
                        }
                        spec_symbols = Sort.sort(spec_symbols, symbol_function($sym392$TM_PRED_SYMBOL__), UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = spec_symbols;
                            SubLObject s = NIL;
                            for (s = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , s = cdolist_list_var.first()) {
                                {
                                    SubLObject graphableP = gethash(s, graphable_symbols, UNPROVIDED);
                                    if (NIL == gethash(s, symbols_done, UNPROVIDED)) {
                                        if (NIL != graphableP) {
                                            if (NIL == kb_mapping_utilities.some_pred_value_in_mt(second(assoc(s, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)), $$tmRelationRestrictedFrom, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                                                {
                                                    SubLObject indent = depth;
                                                    SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_302 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_303 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_thesaurus.tm_link($RELATION, s, UNPROVIDED, UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_303, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_302, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                            } else {
                                                {
                                                    SubLObject indent = depth;
                                                    SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_304 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                SubLObject _prev_bind_0_305 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt329$_A, s);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_305, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_304, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                }
                                            }
                                        }
                                        tm_print_unrestricted_spec_relations(s, arg_index, NIL != graphableP ? ((SubLObject) (add(depth, ONE_INTEGER))) : depth, graphable_symbols, symbols_done);
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
            return NIL;
        }
    }

    public static final SubLObject tm_browse_restriction_relations_entry(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject thesaurus = html_thesaurus.tm_guess_fort(id);
                SubLObject inactiveP = second(args);
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(format(NIL, $str_alt414$View_Applicable_Relations_for___A, tm_internals.thesaurus_name(thesaurus)));
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
                            SubLObject _prev_bind_0_306 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_307 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_308 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_308, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_307, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(format(NIL, $str_alt414$View_Applicable_Relations_for___A, tm_internals.thesaurus_name(thesaurus)));
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(format(NIL, $str_alt414$View_Applicable_Relations_for___A, tm_internals.thesaurus_name(thesaurus)));
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt209$limited_editor)))) {
                                    html_utilities.html_princ($str_alt237$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt415$tm_browse_restriction_relations_e);
                                    tm_browse_restriction_relations_entry_guts(id, inactiveP);
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_306, thread);
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

    public static final SubLObject tm_browse_restriction_relations_entry_guts(SubLObject id, SubLObject inactiveP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus = html_thesaurus.tm_guess_fort(id);
                SubLObject unrestricted_relations = tm_internals.unrestricted_relations(inactiveP);
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_br();
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt417$Core_Relations__);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                {
                    SubLObject cdolist_list_var = tm_datastructures.$tm_core_relations$.getGlobalValue();
                    SubLObject symbol = NIL;
                    for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                        html_thesaurus.tm_link($RELATION, symbol, UNPROVIDED, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt69$_);
                    }
                }
                html_utilities.html_br();
                html_utilities.html_br();
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($$$Unrestricted_Relations);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_br();
                html_utilities.html_br();
                {
                    SubLObject cdolist_list_var = unrestricted_relations;
                    SubLObject unrestricted_relation = NIL;
                    for (unrestricted_relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unrestricted_relation = cdolist_list_var.first()) {
                        {
                            SubLObject inverse = tm_internals.inverse_relation(unrestricted_relation);
                            html_utilities.html_indent(THREE_INTEGER);
                            html_thesaurus.tm_link($RELATION, unrestricted_relation, UNPROVIDED, UNPROVIDED);
                            if (!(unrestricted_relation.equalp(inverse) || (NIL == inverse))) {
                                html_utilities.html_princ($str_alt408$_and_);
                                html_thesaurus.tm_link($RELATION, inverse, UNPROVIDED, UNPROVIDED);
                            }
                            html_utilities.html_br();
                        }
                    }
                }
                html_utilities.html_br();
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($$$Restricted_Relations);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_br();
                html_utilities.html_br();
                tm_show_restricted_relations_for_thesaurus(thesaurus, NIL, inactiveP);
                html_utilities.html_br();
                html_utilities.html_br();
                if (NIL == inactiveP) {
                    if ((NIL != tm_internals.editing_allowedP()) && (NIL != member(thesaurus, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDIT_THESAURI), symbol_function(EQUALP), UNPROVIDED))) {
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt337$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt420$tm_restrict_relations_for_thesaur, id);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $$$Choose);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt422$___);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt337$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt423$tm_browse_restriction_relations_e, id);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $$$View);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt425$_NON_ACTIVE_Applicable_Relations_);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                html_utilities.html_br();
            }
            return NIL;
        }
    }

    public static final SubLObject tm_browse_inactive_relations(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relation_symbols = tm_internals.tm_inactive_relation_symbols_sorted();
                SubLObject graphable_symbols = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_1);
                SubLObject symbols_done = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_2);
                SubLObject depth = ONE_INTEGER;
                tm_internals.mark_graphable_spec_preds(relation_symbols);
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$View_Inactive_Relations);
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
                                SubLObject _prev_bind_0_309 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_310 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_311 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_311, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_310, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($$$View_Inactive_Relations);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($$$View_Inactive_Relations);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt237$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt400$tm_browse_inactive_relations);
                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Inactive_Relations);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_br();
                                        html_utilities.html_princ($str_alt398$Choose_a_relation_to_display_);
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
                                            SubLObject _prev_bind_0_312 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$html_indent_table_max$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                                                {
                                                    SubLObject cdolist_list_var = relation_symbols;
                                                    SubLObject symbol = NIL;
                                                    for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                                                        if (!((NIL != gethash(symbol, graphable_symbols, UNPROVIDED)) || (NIL != gethash(symbol, symbols_done, UNPROVIDED)))) {
                                                            {
                                                                SubLObject arg_index = third(assoc(symbol, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
                                                                SubLObject indent = depth;
                                                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_313 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                            SubLObject _prev_bind_0_314 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_thesaurus.tm_link($RELATION, symbol, UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_314, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_313, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                sethash(symbol, symbols_done, T);
                                                                tm_print_spec_relations(symbol, arg_index, add(depth, ONE_INTEGER), graphable_symbols, symbols_done);
                                                            }
                                                        }
                                                    }
                                                    html_utilities.html_indent_table_internal(THREE_INTEGER);
                                                }
                                            } finally {
                                                html_macros.$html_indent_table_max$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_312, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_309, thread);
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

    public static final SubLObject tm_rel(SubLObject args) {
        return tm_relation_link(args);
    }

    public static final SubLObject tm_relation_link(SubLObject args) {
        {
            SubLObject rel_symbol = args.first();
            SubLObject constant = tm_internals.relation_constant_from_abbreviation(rel_symbol);
            if (NIL != constant) {
                tm_show_relation(constant, rel_symbol);
            } else {
                html_thesaurus.tm_error($str_alt430$Couldn_t_determine_a_relation_fro, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_show_relation(SubLObject constant, SubLObject rel_symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(format(NIL, $str_alt432$Relation_info_for__A, rel_symbol));
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
                            SubLObject _prev_bind_0_315 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_316 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_317 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_317, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_316, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(format(NIL, $str_alt432$Relation_info_for__A, rel_symbol));
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(format(NIL, $str_alt432$Relation_info_for__A, rel_symbol));
                                html_thesaurus.thesaurus_heading($str_alt433$tm_show_relation);
                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                tm_show_relation_guts(constant, rel_symbol);
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_315, thread);
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

    public static final SubLObject tm_relation_uses(SubLObject constant, SubLObject rel_symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inverse_symbol = tm_internals.inverse_relation(rel_symbol);
                SubLObject total_uses = kb_indexing.num_predicate_extent_index(constant, UNPROVIDED);
                html_thesaurus.tm_link($RELATION, rel_symbol, UNPROVIDED, UNPROVIDED);
                if ((NIL != inverse_symbol) && (!inverse_symbol.equal(rel_symbol))) {
                    html_utilities.html_princ($str_alt434$_and_its_inverse__);
                    html_thesaurus.tm_link($RELATION, inverse_symbol, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_princ($str_alt435$__are);
                } else {
                    html_utilities.html_princ($str_alt436$_is);
                }
                if (total_uses.eql(ZERO_INTEGER)) {
                    html_utilities.html_princ($str_alt437$_not_used_in_any_thesauri_);
                } else {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt438$_used_a_total_of__A_times_, total_uses);
                    html_utilities.html_br();
                    html_utilities.html_br();
                    html_utilities.html_princ($str_alt439$Number_of_uses_in_particular_thes);
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
                                SubLObject cdolist_list_var = tm_internals.all_thesauri_sorted();
                                SubLObject thesaurus = NIL;
                                for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                    {
                                        SubLObject uses = kb_indexing.num_predicate_extent_index(constant, thesaurus);
                                        if (uses.numG(ZERO_INTEGER)) {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_318 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_319 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_319, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_320 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt440$____);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_320, thread);
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
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_321 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ(uses);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_321, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_318, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
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
                return NIL;
            }
        }
    }

    public static final SubLObject tm_relation_usage(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject rel_symbol = second(args);
                SubLObject constant = html_thesaurus.tm_guess_fort(id);
                if (NIL != forts.valid_fortP(constant)) {
                    {
                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ($$$Relation_Usage_Information);
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
                                    SubLObject _prev_bind_0_322 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_323 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_324 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_324, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_323, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ($$$Relation_Usage_Information);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event($$$Relation_Usage_Information);
                                        html_thesaurus.thesaurus_heading($str_alt442$tm_relation_usage);
                                        tm_relation_uses(constant, rel_symbol);
                                        html_thesaurus.tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_322, thread);
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
                    html_thesaurus.tm_error($str_alt443$Implementation_Error__Could_not_d, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_relation_heading(SubLObject constant, SubLObject rel_symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = cb_utilities.cb_fort_identifier(constant);
                html_thesaurus.tm_link($RELATION_USAGE, id, rel_symbol, UNPROVIDED);
                if ((NIL != tm_internals.editing_allowedP()) && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator))) {
                    if (NIL != tm_internals.tm_active_relation_p(constant)) {
                        if (NIL == subl_promotions.memberP(rel_symbol, tm_datastructures.$tm_core_relations$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)) {
                            html_thesaurus.tm_link($REMOVE_ACTIVE_REL, id, rel_symbol, UNPROVIDED);
                        }
                    } else {
                        html_thesaurus.tm_link($ADD_ACTIVE_REL, id, rel_symbol, UNPROVIDED);
                    }
                    if (NIL == subl_promotions.memberP(rel_symbol, tm_datastructures.$tm_core_relations$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)) {
                        html_thesaurus.tm_link($KILL_RELATION, id, rel_symbol, UNPROVIDED);
                        html_thesaurus.tm_link($EDIT_RELATION, id, rel_symbol, UNPROVIDED);
                        html_thesaurus.tm_link($RESTRICT_THESAURI, id, rel_symbol, UNPROVIDED);
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject tm_relation_type(SubLObject constant) {
        if (NIL != tm_internals.tm_lexical_predicateP(constant)) {
            return $LEXICAL;
        } else
            if (NIL != tm_internals.tm_documentation_predicateP(constant)) {
                return $DOCUMENTATION;
            } else
                if (NIL != tm_internals.tm_url_predicateP(constant)) {
                    return $URL;
                } else
                    if ((NIL != kb_accessors.transitive_predicateP(constant)) && (NIL != kb_accessors.asymmetric_predicateP(constant))) {
                        return $HIERARCHICAL;
                    } else {
                        return NIL;
                    }



    }

    public static final SubLObject tm_show_relation_guts(SubLObject constant, SubLObject rel_symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                    tm_relation_heading(constant, rel_symbol);
                    html_utilities.html_br();
                    html_utilities.html_br();
                    if ((NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)) && (NIL != tm_integrity.integrity_check_needed_for_relationP(constant))) {
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_tm_editing.tm_message_integrity_check_needed_for_relation(constant, tm_internals.relation_term_arg_from_abbreviation(rel_symbol));
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    if (((NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)) && (NIL != member(rel_symbol, tm_datastructures.$tm_core_relations$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED))) && (NIL != tm_integrity.integrity_check_in_progress_for_relationP(constant))) {
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_tm_editing.tm_message_integrity_check_in_progress_for_relation(constant, tm_internals.relation_term_arg_from_abbreviation(rel_symbol));
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    html_utilities.html_br();
                    html_utilities.html_br();
                    if (NIL != tm_relation_type(constant)) {
                        {
                            SubLObject pcase_var = tm_relation_type(constant);
                            if (pcase_var.eql($HIERARCHICAL)) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt454$_A_is_a_Hierarchical_relation_, rel_symbol);
                            } else
                                if (pcase_var.eql($LEXICAL)) {
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt455$_A_is_a_Lexical_relation_, rel_symbol);
                                } else
                                    if (pcase_var.eql($DOCUMENTATION)) {
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt456$_A_is_a_Documentation_relation_, rel_symbol);
                                    } else
                                        if (pcase_var.eql($URL)) {
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt457$_A_is_a_URL_relation_, rel_symbol);
                                        }



                        }
                        html_utilities.html_br();
                        html_utilities.html_br();
                    }
                    if (NIL != tm_internals.tm_active_relation_p(constant)) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt458$_A_is_in_the_active_relation_set_, rel_symbol);
                    } else {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt459$_A_is_not_currently_in_the_set_of, rel_symbol);
                    }
                    html_utilities.html_br();
                    html_utilities.html_br();
                    if (NIL != subl_promotions.memberP(rel_symbol, tm_datastructures.$tm_core_relations$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt460$_A_is_a_core_relation_, rel_symbol);
                    } else {
                        if (NIL != tm_internals.restrictedP(constant)) {
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt461$_A_is_a_restricted_relation_, rel_symbol);
                        } else {
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt462$_A_is_an_unrestricted_relation_, rel_symbol);
                        }
                    }
                    html_utilities.html_br();
                    html_utilities.html_br();
                    {
                        SubLObject docs = tm_internals.relation_documentation(constant);
                        if (NIL != docs) {
                            html_utilities.html_princ(docs);
                            html_utilities.html_br();
                            html_utilities.html_br();
                        }
                    }
                    {
                        SubLObject format = tm_internals.tm_classify_format(rel_symbol);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt463$_A_is__A, rel_symbol, format);
                    }
                    html_utilities.html_br();
                    html_utilities.html_br();
                    {
                        SubLObject term_arg = tm_internals.relation_term_arg_from_abbreviation(rel_symbol);
                        SubLObject other_arg = (term_arg == ONE_INTEGER) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
                        SubLObject arg1_type = tm_internals.tm_relation_argtype(constant, term_arg);
                        SubLObject arg2_type = tm_internals.tm_relation_argtype(constant, other_arg);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt464$The_first_value_for__A__A, rel_symbol, arg1_type == $CONSTANT ? ((SubLObject) ($str_alt466$must_be_a_Preferred_Term_)) : $str_alt467$cannot_be_a_Preferred_Term_);
                        html_utilities.html_br();
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt468$The_second_value_for__A__A, rel_symbol, arg2_type == $CONSTANT ? ((SubLObject) ($str_alt466$must_be_a_Preferred_Term_)) : $str_alt467$cannot_be_a_Preferred_Term_);
                        html_utilities.html_br();
                        html_utilities.html_br();
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
                        SubLObject _prev_bind_0_325 = html_macros.$html_safe_print$.currentBinding(thread);
                        SubLObject _prev_bind_1_326 = html_macros.$html_indent_table_max$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                            {
                                SubLObject broaders = tm_internals.broader_relations(rel_symbol);
                                SubLObject narrowers = tm_internals.narrower_relations(rel_symbol);
                                if (NIL != broaders) {
                                    {
                                        SubLObject indent = ZERO_INTEGER;
                                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_327 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_328 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($str_alt469$Broader_relations_);
                                                        {
                                                            SubLObject cdolist_list_var = broaders;
                                                            SubLObject broader = NIL;
                                                            for (broader = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , broader = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject indent_329 = ONE_INTEGER;
                                                                    SubLObject span_330 = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_329));
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_331 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_indent_row_internal(indent_329);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (NIL != span_330) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(span_330);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_332 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_thesaurus.tm_link($RELATION, broader, UNPROVIDED, UNPROVIDED);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_332, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_331, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_328, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_327, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                                if (NIL != narrowers) {
                                    {
                                        SubLObject indent = ZERO_INTEGER;
                                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_333 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_334 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($str_alt470$Narrower_relations_);
                                                        {
                                                            SubLObject cdolist_list_var = narrowers;
                                                            SubLObject narrower = NIL;
                                                            for (narrower = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , narrower = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject indent_335 = ONE_INTEGER;
                                                                    SubLObject span_336 = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_335));
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_337 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_indent_row_internal(indent_335);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (NIL != span_336) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(span_336);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_338 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_thesaurus.tm_link($RELATION, narrower, UNPROVIDED, UNPROVIDED);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_338, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_337, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_334, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_333, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                                {
                                    SubLObject inverse = tm_internals.inverse_relation(rel_symbol);
                                    if (NIL != inverse) {
                                        {
                                            SubLObject indent = ZERO_INTEGER;
                                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_339 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_340 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($str_alt471$Inverse_relation__);
                                                            {
                                                                SubLObject indent_341 = ONE_INTEGER;
                                                                SubLObject span_342 = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_341));
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_343 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_indent_row_internal(indent_341);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (NIL != span_342) {
                                                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(span_342);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_344 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_thesaurus.tm_link($RELATION, inverse, UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_344, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_343, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_340, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_339, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    }
                                }
                                html_utilities.html_indent_table_internal(THREE_INTEGER);
                            }
                        } finally {
                            html_macros.$html_indent_table_max$.rebind(_prev_bind_1_326, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_325, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    if (NIL != tm_internals.symmetric_relP(rel_symbol)) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt472$_A_is_symmetric_, rel_symbol);
                        html_utilities.html_br();
                    }
                    if (NIL != tm_internals.asymmetric_relP(rel_symbol)) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt473$_A_is_asymmetric_, rel_symbol);
                        html_utilities.html_br();
                    }
                    if (NIL != tm_internals.transitive_relP(rel_symbol)) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt474$_A_is_transitive_, rel_symbol);
                        html_utilities.html_br();
                    }
                    if (NIL != tm_internals.reflexive_relP(rel_symbol)) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt475$_A_is_reflexive_, rel_symbol);
                        html_utilities.html_br();
                    }
                    if (NIL != tm_internals.irreflexive_relP(rel_symbol)) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt476$_A_is_irreflexive_, rel_symbol);
                        html_utilities.html_br();
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Gives message why relation cannot be edited at this time. Relation
     * is assumed to be a constant which is a thesaurus predicate.  Index is
     * assumed to be one or two and controls whether the relation or its
     * inverse prints.
     */
    public static final SubLObject tm_no_edit_relation_page(SubLObject relation, SubLObject index) {
        if (index == UNPROVIDED) {
            index = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(relation, $sym477$THESAURUS_PREDICATE_);
            {
                SubLObject arg_index = (index.eql(ONE_INTEGER) || index.eql(TWO_INTEGER)) ? ((SubLObject) (index)) : ONE_INTEGER;
                SubLObject rel_symbol = tm_internals.tm_pred_arg_symbol(relation, arg_index);
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(format(NIL, $str_alt478$Edit_of_Relation__A_Not_Allowed, rel_symbol));
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
                            SubLObject _prev_bind_0_345 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_346 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_347 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_347, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_346, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(format(NIL, $str_alt478$Edit_of_Relation__A_Not_Allowed, rel_symbol));
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(format(NIL, $str_alt478$Edit_of_Relation__A_Not_Allowed, rel_symbol));
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                    html_utilities.html_princ($str_alt237$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt479$tm_no_edit_rel);
                                    html_utilities.html_br();
                                    if (NIL != tm_integrity.integrity_check_needed_for_relationP(relation)) {
                                        html_tm_editing.tm_message_integrity_check_needed_for_relation(relation, arg_index);
                                    }
                                    if (NIL != tm_integrity.integrity_check_in_progress_for_relationP(relation)) {
                                        html_tm_editing.tm_message_integrity_check_in_progress_for_relation(relation, arg_index);
                                    }
                                    html_utilities.html_br();
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_345, thread);
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

    public static final SubLObject tm_show_relation_in_available_thesauri(SubLObject rel, SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject available_thesauri = tm_internals.relation_available_in_thesauri(constant);
                SubLObject inverse = tm_internals.inverse_relation(rel);
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                if (inverse.equalp(rel) || (NIL == inverse)) {
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt480$_A_is_currently_available_in_the_, rel);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } else {
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt481$_A_and__A_are_currently_available, rel, inverse);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                html_utilities.html_br();
                html_utilities.html_br();
                if (NIL != available_thesauri) {
                    {
                        SubLObject cdolist_list_var = available_thesauri;
                        SubLObject thesaurus = NIL;
                        for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                            html_thesaurus.tm_link($THESAURUS, tm_internals.thesaurus_constant_from_name(thesaurus), UNPROVIDED, UNPROVIDED);
                            html_utilities.html_br();
                        }
                    }
                } else {
                    html_utilities.html_princ($$$NONE);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_search_page(SubLObject args) {
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
                html_utilities.html_princ($$$Substring_Search_Across_Thesauri);
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
                            SubLObject _prev_bind_0_348 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        SubLObject _prev_bind_0_349 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_350 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_350, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_349, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($$$Substring_Search_Across_Thesauri);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($$$Substring_Search_Across_Thesauri);
                                html_thesaurus.thesaurus_heading($str_alt484$tm_search_page);
                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt485$Enter_a_search_term__choose_optio);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_br();
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
                                    SubLObject _prev_bind_0_351 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt486$tm_handle_search_page, T, UNPROVIDED);
                                        html_utilities.html_text_input($$$string, NIL, $int$40);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Domain_Options);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_br();
                                        html_utilities.html_checkbox_input($$$ufs, $$$T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_princ($str_alt491$Include_alternative_terms__UFs_an);
                                        html_utilities.html_br();
                                        html_utilities.html_checkbox_input($$$browsing, $$$T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_princ($str_alt493$Limit_to_currently_selected_brows);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Automatic_Truncation_Options);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_input_checkbox$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_princ($str_alt495$Full_term_begins_with___agen__fin);
                                        html_utilities.html_br();
                                        html_utilities.html_checkbox_input($$$subword, $$$T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_princ($str_alt497$Any_word_begins_with___agen__find);
                                        html_utilities.html_br();
                                        html_utilities.html_checkbox_input($$$substring, $$$T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_princ($str_alt499$Contains_this_substring___agen__f);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        html_utilities.html_submit_input($$$Search, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_reset_input(UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_351, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_348, thread);
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

    public static final SubLObject tm_handle_search_page(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject search_string = html_utilities.html_extract_input($$$string, args);
                SubLObject ufsP = html_utilities.html_extract_input($$$ufs, args);
                SubLObject subwordP = html_utilities.html_extract_input($$$subword, args);
                SubLObject substringP = html_utilities.html_extract_input($$$substring, args);
                SubLObject browsing_onlyP = html_utilities.html_extract_input($$$browsing, args);
                SubLObject more_concepts = NIL;
                SubLObject concepts_from_lexicon = NIL;
                SubLObject thesaurus_abbrev_display_type = NIL;
                SubLObject thesauri = NIL;
                if (search_string.equal($str_alt55$) || (NIL == search_string)) {
                    return html_thesaurus.tm_error($str_alt502$No_search_string_was_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (length(search_string).numL(TWO_INTEGER)) {
                    return html_thesaurus.tm_error($str_alt503$Please_enter_a_string_of_at_least, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != browsing_onlyP) {
                    thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
                }
                thread.resetMultipleValues();
                {
                    SubLObject concepts = tm_internals.search_thesauri(search_string, thesauri, ufsP, NIL, subwordP, T, substringP);
                    SubLObject signs = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    more_concepts = tm_internals.search_thesauri(search_string, thesauri, ufsP, T, subwordP, T, substringP);
                    concepts_from_lexicon = set_difference(more_concepts, concepts, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(format(NIL, $str_alt504$Results_of_Search_on__S, search_string));
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
                                    SubLObject _prev_bind_0_352 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_353 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                        SubLObject _prev_bind_0_354 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_354, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_353, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ(format(NIL, $str_alt504$Results_of_Search_on__S, search_string));
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event(format(NIL, $str_alt504$Results_of_Search_on__S, search_string));
                                        html_thesaurus.thesaurus_heading($str_alt486$tm_handle_search_page);
                                        if ((NIL == concepts) && (NIL == concepts_from_lexicon)) {
                                            html_utilities.html_princ($str_alt505$No_terms_were_found_);
                                        } else {
                                            html_utilities.html_princ($str_alt506$Click_on_a_term_to_display___Or__);
                                            if ((NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt507$advanced_user)) || (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $VIEW_MULTIPLE))) {
                                                html_utilities.html_princ($str_alt509$add_that_thesaurus_to_your_active);
                                                thesaurus_abbrev_display_type = $ADD_HIERARCHICAL;
                                            } else {
                                                html_utilities.html_princ($str_alt510$switch_to_that_thesaurus_and_disp);
                                                thesaurus_abbrev_display_type = $SWITCH_HIERARCHICAL;
                                            }
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            {
                                                SubLObject cdolist_list_var = Sort.sort(concepts, symbol_function(STRING_LESSP), symbol_function(TM_STRING_FOR_SORTING_SEARCH_RESULTS));
                                                SubLObject constant = NIL;
                                                for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject thesauri_to_show = intersection(tm_internals.thesauri_of_concept(constant), tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                                        SubLObject concept_signs = tm_internals.extract_signs_matching(signs, $CONCEPT, constant);
                                                        tm_thesaurus_constant_show_thesauri(constant, NIL, T, T, thesauri_to_show, NIL, thesaurus_abbrev_display_type);
                                                        html_utilities.html_br();
                                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                        tm_possibly_show_alternate_input_strings(concept_signs, NIL, T);
                                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                    }
                                                }
                                            }
                                            if (NIL != concepts_from_lexicon) {
                                                html_utilities.html_princ($str_alt512$These_terms_were_found_by_using_C);
                                                html_utilities.html_br();
                                                {
                                                    SubLObject cdolist_list_var = Sort.sort(concepts_from_lexicon, symbol_function(STRING_LESSP), symbol_function(TM_STRING_FOR_SORTING_SEARCH_RESULTS));
                                                    SubLObject constant = NIL;
                                                    for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject thesauri_to_show = intersection(tm_internals.thesauri_of_concept(constant), tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                                            tm_thesaurus_constant_show_thesauri(constant, NIL, T, T, thesauri_to_show, NIL, thesaurus_abbrev_display_type);
                                                            html_utilities.html_br();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        html_thesaurus.tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_352, thread);
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

    public static final SubLObject declare_html_tm_browsing_file() {
        declareFunction("tm_make_parent_node_vector", "TM-MAKE-PARENT-NODE-VECTOR", 0, 1, false);
        declareFunction("tm_initialize_parent_node_vector", "TM-INITIALIZE-PARENT-NODE-VECTOR", 0, 1, false);
        declareFunction("tm_get_parent_node_vector", "TM-GET-PARENT-NODE-VECTOR", 0, 1, false);
        declareFunction("tm_clear_duplicate_node_table", "TM-CLEAR-DUPLICATE-NODE-TABLE", 0, 0, false);
        declareFunction("tm_report_no_constants", "TM-REPORT-NO-CONSTANTS", 0, 1, false);
        declareFunction("tm_report_not_in_active_thesauri", "TM-REPORT-NOT-IN-ACTIVE-THESAURI", 1, 0, false);
        declareFunction("tm_right_case", "TM-RIGHT-CASE", 1, 1, false);
        declareFunction("tm_thesaurus_constant_internal_many_terms", "TM-THESAURUS-CONSTANT-INTERNAL-MANY-TERMS", 5, 0, false);
        declareFunction("tm_thesaurus_constant_show_thesauri", "TM-THESAURUS-CONSTANT-SHOW-THESAURI", 1, 6, false);
        declareFunction("tm_thesaurus_constant_no_thesauri", "TM-THESAURUS-CONSTANT-NO-THESAURI", 1, 4, false);
        declareFunction("tm_thesaurus_constant", "TM-THESAURUS-CONSTANT", 1, 6, false);
        declareFunction("tm_sort_signs_by_pt", "TM-SORT-SIGNS-BY-PT", 1, 0, false);
        declareFunction("tm_sort_signs_by_term", "TM-SORT-SIGNS-BY-TERM", 1, 0, false);
        declareFunction("tm_possibly_show_alternate_input_strings", "TM-POSSIBLY-SHOW-ALTERNATE-INPUT-STRINGS", 1, 2, false);
        declareFunction("tm_choose_constant", "TM-CHOOSE-CONSTANT", 3, 0, false);
        declareFunction("tm_hierarchy_display", "TM-HIERARCHY-DISPLAY", 2, 0, false);
        declareFunction("tm_print_nodes", "TM-PRINT-NODES", 2, 1, false);
        declareFunction("tm_handle_print_thes_list", "TM-HANDLE-PRINT-THES-LIST", 2, 2, false);
        declareFunction("tm_elaborate_thesaurus_constant", "TM-ELABORATE-THESAURUS-CONSTANT", 1, 4, false);
        declareFunction("tm_display_tops", "TM-DISPLAY-TOPS", 3, 0, false);
        declareFunction("tm_display_full_parent_paths", "TM-DISPLAY-FULL-PARENT-PATHS", 2, 0, false);
        declareFunction("tm_fill_parent_node_vector", "TM-FILL-PARENT-NODE-VECTOR", 3, 0, false);
        declareFunction("tm_parent_node_vector_length", "TM-PARENT-NODE-VECTOR-LENGTH", 1, 0, false);
        declareFunction("tm_trace_parent_paths", "TM-TRACE-PARENT-PATHS", 8, 0, false);
        declareFunction("tm_display_truncated_parent_paths", "TM-DISPLAY-TRUNCATED-PARENT-PATHS", 3, 0, false);
        declareFunction("display_parent_paths", "DISPLAY-PARENT-PATHS", 2, 0, false);
        declareFunction("show_descendant_parameters", "SHOW-DESCENDANT-PARAMETERS", 4, 0, false);
        declareFunction("tm_display_ancestors", "TM-DISPLAY-ANCESTORS", 4, 0, false);
        declareFunction("tm_hierarchy_display_term", "TM-HIERARCHY-DISPLAY-TERM", 2, 0, false);
        declareFunction("tm_display_descendants", "TM-DISPLAY-DESCENDANTS", 4, 0, false);
        declareFunction("tm_show_hd_relation", "TM-SHOW-HD-RELATION", 0, 1, false);
        declareFunction("tm_print_nodes_1", "TM-PRINT-NODES-1", 1, 0, false);
        declareFunction("hd_preferred_nodes", "HD-PREFERRED-NODES", 4, 0, false);
        declareFunction("tm_print_nodes_2", "TM-PRINT-NODES-2", 1, 4, false);
        declareFunction("compute_allowable_depth", "COMPUTE-ALLOWABLE-DEPTH", 1, 0, false);
        declareFunction("tm_name_of_ass_mt", "TM-NAME-OF-ASS-MT", 1, 0, false);
        declareFunction("tm_hd_relation", "TM-HD-RELATION", 0, 1, false);
        declareFunction("tm_hd_rel_link", "TM-HD-REL-LINK", 1, 0, false);
        declareFunction("tm_hd", "TM-HD", 1, 0, false);
        declareFunction("tm_node_link", "TM-NODE-LINK", 1, 0, false);
        declareFunction("tm_selected_hierarchical_link", "TM-SELECTED-HIERARCHICAL-LINK", 1, 0, false);
        declareFunction("tm_add_thesaurus_hierarchical_link", "TM-ADD-THESAURUS-HIERARCHICAL-LINK", 1, 0, false);
        declareFunction("tm_swh", "TM-SWH", 1, 0, false);
        declareFunction("tm_switch_thesaurus_hierarchical_link", "TM-SWITCH-THESAURUS-HIERARCHICAL-LINK", 1, 0, false);
        declareFunction("tm_ad", "TM-AD", 1, 0, false);
        declareFunction("tm_ad_toggle", "TM-AD-TOGGLE", 1, 0, false);
        declareFunction("tm_ad_pageup", "TM-AD-PAGEUP", 1, 0, false);
        declareFunction("tm_ad_pagedn", "TM-AD-PAGEDN", 1, 0, false);
        declareFunction("tm_ad_scroll", "TM-AD-SCROLL", 4, 0, false);
        declareFunction("tm_ad_not_present", "TM-AD-NOT-PRESENT", 1, 0, false);
        declareFunction("tm_alpha_index", "TM-ALPHA-INDEX", 7, 0, false);
        declareFunction("tm_alpha_position_bar", "TM-ALPHA-POSITION-BAR", 3, 0, false);
        declareFunction("tm_alpha_state_toggle", "TM-ALPHA-STATE-TOGGLE", 2, 0, false);
        declareFunction("tm_alphabetical_central_item", "TM-ALPHABETICAL-CENTRAL-ITEM", 2, 0, false);
        declareFunction("tm_alphabetical_rotation_column_frob_row", "TM-ALPHABETICAL-ROTATION-COLUMN-FROB-ROW", 0, 0, false);
        declareFunction("tm_alphabetical_item", "TM-ALPHABETICAL-ITEM", 1, 1, false);
        declareFunction("tm_alphabetical_item_all", "TM-ALPHABETICAL-ITEM-ALL", 1, 1, false);
        declareFunction("tm_show_pre_rotation", "TM-SHOW-PRE-ROTATION", 2, 0, false);
        declareFunction("tm_show_pre_rotation_all", "TM-SHOW-PRE-ROTATION-ALL", 3, 0, false);
        declareFunction("tm_fd", "TM-FD", 1, 0, false);
        declareFunction("tm_full_record_for_constant", "TM-FULL-RECORD-FOR-CONSTANT", 2, 1, false);
        declareFunction("tm_full_record", "TM-FULL-RECORD", 2, 1, false);
        declareFunction("tm_full_record_guts", "TM-FULL-RECORD-GUTS", 2, 0, false);
        declareFunction("tm_full_record_guts_merged", "TM-FULL-RECORD-GUTS-MERGED", 2, 0, false);
        declareFunction("tm_full_record_info_merged", "TM-FULL-RECORD-INFO-MERGED", 2, 0, false);
        declareFunction("ufs_in_other_thesaurusP", "UFS-IN-OTHER-THESAURUS?", 2, 0, false);
        declareFunction("tm_full_record_guts_separate", "TM-FULL-RECORD-GUTS-SEPARATE", 2, 0, false);
        declareFunction("tm_sort_full_record_value_list", "TM-SORT-FULL-RECORD-VALUE-LIST", 1, 0, false);
        declareFunction("tm_full_record_guts_sort_key", "TM-FULL-RECORD-GUTS-SORT-KEY", 1, 0, false);
        declareFunction("tm_show_term_timestamp", "TM-SHOW-TERM-TIMESTAMP", 2, 0, false);
        declareFunction("tm_ssa", "TM-SSA", 1, 0, false);
        declareFunction("tm_show_timestamped_assertion", "TM-SHOW-TIMESTAMPED-ASSERTION", 1, 0, false);
        declareFunction("tm_show_implicit_assertion", "TM-SHOW-IMPLICIT-ASSERTION", 1, 0, false);
        declareFunction("tm_show_source_audit_info", "TM-SHOW-SOURCE-AUDIT-INFO", 1, 0, false);
        declareFunction("tm_show_thesauri", "TM-SHOW-THESAURI", 0, 1, false);
        declareFunction("tm_at", "TM-AT", 1, 0, false);
        declareFunction("get_tops_for_thesaurus", "GET-TOPS-FOR-THESAURUS", 1, 0, false);
        declareFunction("tm_show_thesaurus_tops", "TM-SHOW-THESAURUS-TOPS", 2, 0, false);
        declareFunction("tm_thesaurus_info_section", "TM-THESAURUS-INFO-SECTION", 1, 0, false);
        declareFunction("tm_about_thesaurus", "TM-ABOUT-THESAURUS", 0, 1, false);
        declareFunction("tm_add_or_edit_comment", "TM-ADD-OR-EDIT-COMMENT", 1, 0, false);
        declareFunction("tm_handle_add_or_edit_comment", "TM-HANDLE-ADD-OR-EDIT-COMMENT", 1, 0, false);
        declareFunction("tm_change_released_status", "TM-CHANGE-RELEASED-STATUS", 1, 0, false);
        declareFunction("tm_change_filter", "TM-CHANGE-FILTER", 1, 0, false);
        declareFunction("tm_handle_change_filter", "TM-HANDLE-CHANGE-FILTER", 1, 0, false);
        declareFunction("tm_set_case_style", "TM-SET-CASE-STYLE", 1, 0, false);
        declareFunction("tm_handle_set_case_style", "TM-HANDLE-SET-CASE-STYLE", 1, 0, false);
        declareFunction("tm_extract_module_selections", "TM-EXTRACT-MODULE-SELECTIONS", 1, 0, false);
        declareFunction("tm_more_information_for_integrity_module_link", "TM-MORE-INFORMATION-FOR-INTEGRITY-MODULE-LINK", 1, 0, false);
        declareFunction("tm_more_information_for_integrity_module", "TM-MORE-INFORMATION-FOR-INTEGRITY-MODULE", 1, 0, false);
        declareFunction("tm_integrity_rule_table", "TM-INTEGRITY-RULE-TABLE", 1, 1, false);
        declareFunction("tm_choose_integrity_modules_to_use", "TM-CHOOSE-INTEGRITY-MODULES-TO-USE", 1, 0, false);
        declareFunction("tm_handle_choose_integrity_modules_to_use", "TM-HANDLE-CHOOSE-INTEGRITY-MODULES-TO-USE", 1, 0, false);
        declareFunction("tm_integrity_module_info_page", "TM-INTEGRITY-MODULE-INFO-PAGE", 1, 0, false);
        declareFunction("tm_tit", "TM-TIT", 1, 0, false);
        declareFunction("tm_term_in_thesaurus", "TM-TERM-IN-THESAURUS", 1, 0, false);
        declareFunction("tm_print_spec_relations", "TM-PRINT-SPEC-RELATIONS", 5, 0, false);
        declareFunction("tm_browse_relations_entry", "TM-BROWSE-RELATIONS-ENTRY", 0, 1, false);
        declareFunction("tm_show_restricted_relations_for_thesaurus", "TM-SHOW-RESTRICTED-RELATIONS-FOR-THESAURUS", 3, 0, false);
        declareFunction("tm_show_unrestricted_relations_for_editing", "TM-SHOW-UNRESTRICTED-RELATIONS-FOR-EDITING", 1, 0, false);
        declareFunction("tm_make_relation_restricted_link", "TM-MAKE-RELATION-RESTRICTED-LINK", 1, 0, false);
        declareFunction("tm_print_unrestricted_spec_relations", "TM-PRINT-UNRESTRICTED-SPEC-RELATIONS", 5, 0, false);
        declareFunction("tm_browse_restriction_relations_entry", "TM-BROWSE-RESTRICTION-RELATIONS-ENTRY", 0, 1, false);
        declareFunction("tm_browse_restriction_relations_entry_guts", "TM-BROWSE-RESTRICTION-RELATIONS-ENTRY-GUTS", 2, 0, false);
        declareFunction("tm_browse_inactive_relations", "TM-BROWSE-INACTIVE-RELATIONS", 0, 1, false);
        declareFunction("tm_rel", "TM-REL", 1, 0, false);
        declareFunction("tm_relation_link", "TM-RELATION-LINK", 1, 0, false);
        declareFunction("tm_show_relation", "TM-SHOW-RELATION", 2, 0, false);
        declareFunction("tm_relation_uses", "TM-RELATION-USES", 2, 0, false);
        declareFunction("tm_relation_usage", "TM-RELATION-USAGE", 1, 0, false);
        declareFunction("tm_relation_heading", "TM-RELATION-HEADING", 2, 0, false);
        declareFunction("tm_relation_type", "TM-RELATION-TYPE", 1, 0, false);
        declareFunction("tm_show_relation_guts", "TM-SHOW-RELATION-GUTS", 2, 0, false);
        declareFunction("tm_no_edit_relation_page", "TM-NO-EDIT-RELATION-PAGE", 1, 1, false);
        declareFunction("tm_show_relation_in_available_thesauri", "TM-SHOW-RELATION-IN-AVAILABLE-THESAURI", 2, 0, false);
        declareFunction("tm_search_page", "TM-SEARCH-PAGE", 0, 1, false);
        declareFunction("tm_handle_search_page", "TM-HANDLE-SEARCH-PAGE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_html_tm_browsing_file() {
        defparameter("*TM-CASE-STYLE-SPECIFIERS-AND-DESCRIPTORS*", list(cons(tm_internals.$tm_default_case_as_is$.getGlobalValue(), $str_alt0$_none_), cons(tm_internals.$tm_default_case_all_upper$.getGlobalValue(), $$$ALL_CAPITALS), cons(tm_internals.$tm_default_case_all_lower$.getGlobalValue(), $$$all_lowercase), cons(tm_internals.$tm_default_case_cap_subwords$.getGlobalValue(), $$$Capitalize_Each_Subword_of_Term), cons(tm_internals.$tm_default_case_cap_first_subword$.getGlobalValue(), $$$Capitalize_first_subword_only)));
        defparameter("*TM-PREVIOUS-NODE-ID*", NIL);
        defparameter("*TM-DUPLICATE-NODE-TABLE*", NIL);
        defparameter("*TM-PARENT-NODE-VECTOR*", NIL);
        defparameter("*TM-PARENT-NODE-VECTOR-DEFAULT-LENGTH*", $int$50);
        defparameter("*TM-CURRENT-INDENT-LEVEL*", ZERO_INTEGER);
        defparameter("*TM-DEEPEST-INDENT-LEVEL*", ZERO_INTEGER);
        defparameter("*TM-ALPHA-CHAR-ORDER*", $str_alt179$0123456789ABCDEFGHIJKLMNOPQRSTUVW);
        defconstant("*TM-ALPHA-MID-ROTATION-WIDTH*", FOUR_INTEGER);
        defparameter("*TM-MINIMUM-ALPHA-ROTATION-COLUMN-WIDTH*", TWENTY_INTEGER);
        defparameter("*TM-SUPPRESS-ALT-TERMS-IDENTICAL-TO-PT?*", NIL);
        defparameter("*TM-USE-INTEGRITY-MODULE-STRING*", format(NIL, $str_alt358$_s, tm_internals.$tm_use_integrity_module$.getGlobalValue()));
        defparameter("*TM-DO-NOT-USE-INTEGRITY-MODULE-STRING*", format(NIL, $str_alt358$_s, tm_internals.$tm_do_not_use_integrity_module$.getGlobalValue()));
        defparameter("*TM-MAP-WITH-BREAKS-AND-SPACES*", cons(cons(CHAR_newline, html_macros.$html_line_break$.getGlobalValue()), cons(cons(CHAR_space, get($NBSP, $HTML_GLYPH, $str_alt69$_)), html_macros.$html_escapes_map$.getDynamicValue())));
        return NIL;
    }

    public static final SubLObject setup_html_tm_browsing_file() {
                utilities_macros.register_html_state_variable($tm_duplicate_node_table$);
        utilities_macros.register_html_state_variable($tm_parent_node_vector$);
        html_macros.note_html_handler_function(TM_SHOW_HD_RELATION);
        html_macros.note_html_handler_function(TM_HD_RELATION);
        html_macros.note_html_handler_function(TM_HD_REL_LINK);
        html_macros.note_html_handler_function(TM_HD);
        html_macros.note_html_handler_function(TM_NODE_LINK);
        html_macros.note_html_handler_function(TM_SELECTED_HIERARCHICAL_LINK);
        html_macros.note_html_handler_function(TM_ADD_THESAURUS_HIERARCHICAL_LINK);
        html_macros.note_html_handler_function(TM_SWH);
        html_macros.note_html_handler_function(TM_SWITCH_THESAURUS_HIERARCHICAL_LINK);
        html_macros.note_html_handler_function(TM_AD);
        html_macros.note_html_handler_function(TM_AD_TOGGLE);
        html_macros.note_html_handler_function(TM_AD_PAGEUP);
        html_macros.note_html_handler_function(TM_AD_PAGEDN);
        html_macros.note_html_handler_function(TM_AD_NOT_PRESENT);
        html_macros.note_html_handler_function(TM_FD);
        html_macros.note_html_handler_function(TM_SSA);
        html_macros.note_html_handler_function(TM_SHOW_SOURCE_AUDIT_INFO);
        html_macros.note_html_handler_function(TM_SHOW_THESAURI);
        html_macros.note_html_handler_function(TM_AT);
        html_macros.note_html_handler_function(TM_ABOUT_THESAURUS);
        html_macros.note_html_handler_function(TM_ADD_OR_EDIT_COMMENT);
        html_macros.note_html_handler_function(TM_HANDLE_ADD_OR_EDIT_COMMENT);
        html_macros.note_html_handler_function(TM_CHANGE_RELEASED_STATUS);
        html_macros.note_html_handler_function(TM_CHANGE_FILTER);
        html_macros.note_html_handler_function(TM_HANDLE_CHANGE_FILTER);
        html_macros.note_html_handler_function(TM_SET_CASE_STYLE);
        html_macros.note_html_handler_function(TM_HANDLE_SET_CASE_STYLE);
        html_macros.note_html_handler_function(TM_MORE_INFORMATION_FOR_INTEGRITY_MODULE);
        html_macros.note_html_handler_function(TM_CHOOSE_INTEGRITY_MODULES_TO_USE);
        html_macros.note_html_handler_function(TM_HANDLE_CHOOSE_INTEGRITY_MODULES_TO_USE);
        html_macros.note_html_handler_function(TM_INTEGRITY_MODULE_INFO_PAGE);
        html_macros.note_html_handler_function(TM_TIT);
        html_macros.note_html_handler_function(TM_TERM_IN_THESAURUS);
        html_macros.note_html_handler_function(TM_BROWSE_RELATIONS_ENTRY);
        html_macros.note_html_handler_function(TM_BROWSE_RESTRICTION_RELATIONS_ENTRY);
        html_macros.note_html_handler_function(TM_BROWSE_INACTIVE_RELATIONS);
        html_macros.note_html_handler_function(TM_REL);
        html_macros.note_html_handler_function(TM_RELATION_LINK);
        html_macros.note_html_handler_function(TM_RELATION_USAGE);
        html_macros.note_html_handler_function(TM_SEARCH_PAGE);
        html_macros.note_html_handler_function(TM_HANDLE_SEARCH_PAGE);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_none_ = makeString("(none)");

    static private final SubLString $$$ALL_CAPITALS = makeString("ALL CAPITALS");

    static private final SubLString $$$all_lowercase = makeString("all lowercase");

    static private final SubLString $$$Capitalize_Each_Subword_of_Term = makeString("Capitalize Each Subword of Term");

    static private final SubLString $$$Capitalize_first_subword_only = makeString("Capitalize first subword only");

    public static final SubLSymbol $tm_duplicate_node_table$ = makeSymbol("*TM-DUPLICATE-NODE-TABLE*");

    public static final SubLSymbol $tm_parent_node_vector$ = makeSymbol("*TM-PARENT-NODE-VECTOR*");

    public static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLInteger $int$200 = makeInteger(200);

    static private final SubLString $$$No_Terms_Found = makeString("No Terms Found");

    static private final SubLString $str_alt10$tm_report_no_constants = makeString("tm-report-no-constants");

    static private final SubLString $str_alt11$The_string_ = makeString("The string ");

    static private final SubLString $str_alt12$_could_not_be_matched_with_any_th = makeString(" could not be matched with any thesaurus terms.");

    static private final SubLString $$$Not_in_Active_Thesauri = makeString("Not in Active Thesauri");

    static private final SubLString $str_alt14$tm_report_not_in_active_thesauri = makeString("tm-report-not-in-active-thesauri");

    static private final SubLString $str_alt15$_is_not_defined_in_the_active_the = makeString(" is not defined in the active thesauri.");

    static private final SubLString $str_alt16$Please_go_to_Preferences_and_make = makeString("Please go to Preferences and make one of the following thesauri active if you wish to view this term: ");

    private static final SubLSymbol $THESAURUS = makeKeyword("THESAURUS");

    static private final SubLString $$$SN = makeString("SN");



    private static final SubLSymbol STRING_UPCASE = makeSymbol("STRING-UPCASE");





    private static final SubLSymbol $DISPLAY_CASE = makeKeyword("DISPLAY-CASE");

    static private final SubLString $str_alt24$___ = makeString(" | ");









    private static final SubLSymbol $FULL_RECORD = makeKeyword("FULL-RECORD");

    private static final SubLSymbol $SHOW_TERM_THESAURI = makeKeyword("SHOW-TERM-THESAURI");

    public static final SubLObject $$preferredTerm = constant_handles.reader_make_constant_shell(makeString("preferredTerm"));

    private static final SubLSymbol $LEXPRED = makeKeyword("LEXPRED");

    static private final SubLList $list_alt33 = cons(makeSymbol("PT-STRING"), makeSymbol("PT-SIGNS"));

    static private final SubLList $list_alt34 = cons(makeSymbol("TERM-STRING"), makeSymbol("PT-TERM-SIGNS"));

    static private final SubLString $str_alt35$__A___A___A__in___A = makeString("`~A' ~A `~A' in [~A");

    static private final SubLString $str_alt36$___A = makeString(", ~A");

    static private final SubLString $str_alt37$_ = makeString("]");



    static private final SubLString $$$Choose_Term = makeString("Choose Term");

    static private final SubLString $str_alt40$tm_choose_constant = makeString("tm-choose-constant");

    static private final SubLString $str_alt41$_corresponds_to_the_following_pre = makeString(" corresponds to the following preferred terms:");



    private static final SubLSymbol $BASIC = makeKeyword("BASIC");

    private static final SubLSymbol $ADVANCED = makeKeyword("ADVANCED");

    static private final SubLString $$$Could_not_determine_the_interface = makeString("Could not determine the interface");

    private static final SubLSymbol $INTERFACE = makeKeyword("INTERFACE");

    static private final SubLString $str_alt47$_A_is_not_a_valid_ID_for_the_cons = makeString("~A is not a valid ID for the constant ~s, which is the underlying concept for ~s.");

    private static final SubLSymbol $SELECTED_THESAURUS = makeKeyword("SELECTED-THESAURUS");

    private static final SubLSymbol $THESAURI = makeKeyword("THESAURI");

    private static final SubLSymbol $GRAPH_PATHS = makeKeyword("GRAPH-PATHS");



    private static final SubLSymbol $BG_COLOR_HIERARCHICAL = makeKeyword("BG-COLOR-HIERARCHICAL");

    static private final SubLString $str_alt53$Hierarchical_display_of___A__A = makeString("Hierarchical display of `~A'~A");

    static private final SubLString $str_alt54$_in_only__A = makeString(" in only ~A");

    static private final SubLString $str_alt55$ = makeString("");

    static private final SubLString $str_alt56$tm_print_nodes = makeString("tm-print-nodes");

    private static final SubLSymbol THESAURUS_ABBREVIATION = makeSymbol("THESAURUS-ABBREVIATION");

    static private final SubLString $str_alt58$_ = makeString("(");

    static private final SubLString $str_alt59$__ = makeString(", ");

    private static final SubLSymbol $SELECTED_HIERARCHICAL = makeKeyword("SELECTED-HIERARCHICAL");

    private static final SubLSymbol $SWITCH_HIERARCHICAL = makeKeyword("SWITCH-HIERARCHICAL");

    private static final SubLSymbol $ADD_HIERARCHICAL = makeKeyword("ADD-HIERARCHICAL");

    private static final SubLSymbol $TERM_IN_THESAURUS = makeKeyword("TERM-IN-THESAURUS");

    static private final SubLString $str_alt64$__ = makeString(" [");

    static private final SubLString $str_alt65$computed_ = makeString("computed ");

    static private final SubLString $str_alt66$top_ = makeString("top]");

    static private final SubLString $str_alt67$_ = makeString(")");



    static private final SubLString $str_alt69$_ = makeString(" ");

    private static final SubLSymbol $CYC_CONCEPT = makeKeyword("CYC-CONCEPT");

    static private final SubLList $list_alt71 = list(makeString("LT"), makeString("NT"), makeString("BT"));



    static private final SubLString $str_alt73$__ = makeString(" :");

    static private final SubLString $str_alt74$Tops_ = makeString("Tops:");

    private static final SubLSymbol CB_FORT_IDENTIFIER = makeSymbol("CB-FORT-IDENTIFIER");

    private static final SubLSymbol $GRAPH_RELATION = makeKeyword("GRAPH-RELATION");

    private static final SubLSymbol TM_STRING_FOR_CONSTANT = makeSymbol("TM-STRING-FOR-CONSTANT");

    static private final SubLString $str_alt78$______see_above_ = makeString(" ... (see above)");

    private static final SubLSymbol $EXPAND_PARENT_PATHS = makeKeyword("EXPAND-PARENT-PATHS");

    private static final SubLSymbol $SHOW_DESCENDANT_PARMS = makeKeyword("SHOW-DESCENDANT-PARMS");

    static private final SubLString $$$No_limit_specified = makeString("No limit specified");

    static private final SubLString $$$Preferred_depth = makeString("Preferred depth");

    static private final SubLString $$$All_available_for_level_1 = makeString("All available for level 1");

    static private final SubLString $str_alt84$All_available__within_specified_c = makeString("All available (within specified constraints)");

    static private final SubLString $str_alt85$Preferred_maximum_NT_depth____A = makeString("Preferred maximum NT depth:  ~A");

    static private final SubLString $str_alt86$Maximum_NT_depth_allowed______A = makeString("Maximum NT depth allowed:    ~A");

    static private final SubLString $str_alt87$Preferred_maximum_NT_number___A = makeString("Preferred maximum NT number: ~A");

    static private final SubLString $str_alt88$Number_of_NTs_displayed_______A = makeString("Number of NTs displayed:     ~A");

    static private final SubLString $str_alt89$BTs_ = makeString("BTs:");

    static private final SubLString $$$No_broader_terms = makeString("No broader terms");

    static private final SubLString $str_alt91$Term_ = makeString("Term:");

    private static final SubLSymbol $DETAILED_HIERARCHY_TERM = makeKeyword("DETAILED-HIERARCHY-TERM");

    private static final SubLSymbol $CHILD_DEPTH = makeKeyword("CHILD-DEPTH");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLString $str_alt96$____Now_inside_scope_of__s____ = makeString("~%~%Now inside scope of ~s ...");

    private static final SubLSymbol TM_DISPLAY_DESCENDANTS = makeSymbol("TM-DISPLAY-DESCENDANTS");

    static private final SubLString $str_alt98$____Term___s = makeString("~%~%Term: ~s");

    static private final SubLString $str_alt99$____Next_nodes___s = makeString("~%~%Next nodes: ~s");

    private static final SubLSymbol PREFERRED_TERMS = makeSymbol("PREFERRED-TERMS");

    static private final SubLString $str_alt101$____Sorting_nodes_____ = makeString("~%~%Sorting nodes ... ");

    static private final SubLString $str_alt102$done_ = makeString("done.");

    static private final SubLString $str_alt103$NTs_ = makeString("NTs:");

    private static final SubLSymbol $DEPTH_SPACING = makeKeyword("DEPTH-SPACING");

    static private final SubLString $$$No_narrower_terms = makeString("No narrower terms");

    static private final SubLList $list_alt106 = list(ONE_INTEGER);

    public static final SubLObject $$broaderTerm = constant_handles.reader_make_constant_shell(makeString("broaderTerm"));

    static private final SubLString $str_alt108$Key_Relation__ = makeString("Key Relation: ");

    private static final SubLSymbol TM_SHOW_HD_RELATION = makeSymbol("TM-SHOW-HD-RELATION");

    public static final SubLSymbol $kw110$DETAILS_SHOWN_ = makeKeyword("DETAILS-SHOWN?");

    private static final SubLSymbol $PARENT_DEPTH = makeKeyword("PARENT-DEPTH");

    private static final SubLSymbol $MAX_CHILDREN = makeKeyword("MAX-CHILDREN");

    private static final SubLSymbol $COMPUTED_MAX_DEPTH = makeKeyword("COMPUTED-MAX-DEPTH");

    static private final SubLString $str_alt114$____Entering__s = makeString("~%~%Entering ~s");

    private static final SubLSymbol TM_PRINT_NODES_2 = makeSymbol("TM-PRINT-NODES-2");

    static private final SubLString $str_alt116$___________Term___s = makeString("~%         Term: ~s");

    static private final SubLString $str_alt117$______Max_depth___s = makeString("~%    Max depth: ~s");

    static private final SubLString $str_alt118$__Current_depth___s = makeString("~%Current depth: ~s");

    static private final SubLString $str_alt119$_____Next_nodes___s = makeString("~%   Next nodes: ~s");

    static private final SubLString $str_alt120$____ = makeString(" ...");

    static private final SubLString $str_alt121$__see_above_ = makeString(" (see above)");

    static private final SubLString $str_alt122$____Inside_scope_of__s____ = makeString("~%~%Inside scope of ~s ...");

    private static final SubLSymbol COMPUTE_ALLOWABLE_DEPTH = makeSymbol("COMPUTE-ALLOWABLE-DEPTH");

    static private final SubLString $str_alt124$____ = makeString("~%~%");

    static private final SubLString $str_alt125$Level_finished___s = makeString("Level finished: ~s");

    static private final SubLString $str_alt126$__ = makeString("~%");

    static private final SubLString $str_alt127$___Total_count___s = makeString("   Total count: ~s");

    private static final SubLSymbol TM_GUESS_FORT = makeSymbol("TM-GUESS-FORT");

    private static final SubLSymbol TM_NAME_OF_ASS_MT = makeSymbol("TM-NAME-OF-ASS-MT");

    static private final SubLString $str_alt130$Hierarchy_Relations_for___A_ = makeString("Hierarchy Relations for `~A'");

    static private final SubLString $str_alt131$tm_hd_relation = makeString("tm-hd-relation");

    static private final SubLString $str_alt132$The_following_statement_A__A_true = makeString("The following statement~A ~A true for ");

    static private final SubLString $$$s = makeString("s");

    static private final SubLString $$$is = makeString("is");

    static private final SubLString $$$are = makeString("are");

    static private final SubLString $str_alt136$_ = makeString(":");

    static private final SubLString $str_alt137$No_valid_relationship_between___A = makeString("No valid relationship between `~A' and other thesaurus terms could be found.");

    private static final SubLSymbol TM_HD_RELATION = makeSymbol("TM-HD-RELATION");

    private static final SubLSymbol $SHOW_HD_RELATION_LINKS = makeKeyword("SHOW-HD-RELATION-LINKS");

    private static final SubLSymbol $HD_RELATION = makeKeyword("HD-RELATION");

    private static final SubLSymbol TM_HD_REL_LINK = makeSymbol("TM-HD-REL-LINK");

    private static final SubLSymbol TM_HD = makeSymbol("TM-HD");

    static private final SubLString $$$Could_not_determine_interface = makeString("Could not determine interface");

    static private final SubLString $str_alt144$Couldn_t_determine_a_thesaurus_te = makeString("Couldn't determine a thesaurus term from ~s");

    private static final SubLSymbol TM_NODE_LINK = makeSymbol("TM-NODE-LINK");

    static private final SubLString $str_alt146$Couldn_t_determine_a_thesaurus_fr = makeString("Couldn't determine a thesaurus from ~s.");

    static private final SubLString $str_alt147$Couldn_t_determine_a_preferred_te = makeString("Couldn't determine a preferred term from ~s");

    private static final SubLSymbol TM_SELECTED_HIERARCHICAL_LINK = makeSymbol("TM-SELECTED-HIERARCHICAL-LINK");

    private static final SubLSymbol TM_ADD_THESAURUS_HIERARCHICAL_LINK = makeSymbol("TM-ADD-THESAURUS-HIERARCHICAL-LINK");

    private static final SubLSymbol TM_SWH = makeSymbol("TM-SWH");

    static private final SubLString $str_alt151$Active_Thesaurus_has_been_changed = makeString("Active Thesaurus has been changed to ");

    private static final SubLSymbol TM_SWITCH_THESAURUS_HIERARCHICAL_LINK = makeSymbol("TM-SWITCH-THESAURUS-HIERARCHICAL-LINK");

    private static final SubLSymbol $SEARCHING_ALL = makeKeyword("SEARCHING-ALL");

    static private final SubLString $str_alt154$All_Thesauri_Alphabetical_search_ = makeString("All-Thesauri Alphabetical search for `~A'");

    static private final SubLString $str_alt155$Alphabetical_search_for___A_ = makeString("Alphabetical search for `~A'");





    private static final SubLSymbol TM_AD = makeSymbol("TM-AD");

    private static final SubLSymbol $ALPHABETICAL_SHOW_USE_FORS = makeKeyword("ALPHABETICAL-SHOW-USE-FORS");



    private static final SubLSymbol ALPHA_TERM = makeSymbol("ALPHA-TERM");

    private static final SubLSymbol MISSING = makeSymbol("MISSING");

    private static final SubLSymbol PAGEUP = makeSymbol("PAGEUP");

    private static final SubLSymbol PAGEDN = makeSymbol("PAGEDN");

    static private final SubLString $str_alt165$Can_t_redisplay_alpha_use_type__S = makeString("Can't redisplay alpha use type ~S");

    private static final SubLSymbol TM_AD_TOGGLE = makeSymbol("TM-AD-TOGGLE");



    private static final SubLSymbol TM_AD_PAGEUP = makeSymbol("TM-AD-PAGEUP");



    private static final SubLSymbol TM_AD_PAGEDN = makeSymbol("TM-AD-PAGEDN");

    static private final SubLList $list_alt171 = list(makeSymbol("POST-ROTATION"), makeSymbol("&OPTIONAL"), makeSymbol("PRE-ROTATION"));

    static private final SubLString $$$Alphabetical_index_scroll = makeString("Alphabetical index scroll");

    static private final SubLString $str_alt173$_S_not_present = makeString("~S not present");

    static private final SubLString $str_alt174$_S_was_not_found_as_a_thesaurus_t = makeString("~S was not found as a thesaurus term.  Please check the list below.");

    private static final SubLSymbol TM_AD_NOT_PRESENT = makeSymbol("TM-AD-NOT-PRESENT");

    private static final SubLSymbol $BG_COLOR_ALPHABETICAL = makeKeyword("BG-COLOR-ALPHABETICAL");

    static private final SubLString $str_alt177$tm_basic_show_alpha_results = makeString("tm-basic-show-alpha-results");

    static private final SubLString $str_alt178$tm_show_alpha_results = makeString("tm-show-alpha-results");

    static private final SubLString $str_alt179$0123456789ABCDEFGHIJKLMNOPQRSTUVW = makeString("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");





    static private final SubLString $str_alt182$_ = makeString("|");

    private static final SubLSymbol $ALPHA_STATE_TOGGLE = makeKeyword("ALPHA-STATE-TOGGLE");







    static private final SubLString $str_alt187$_____ = makeString("---> ");



    static private final SubLString $str_alt189$__A_ = makeString(" ~A ");

    static private final SubLString $str_alt190$would_be_here_ = makeString("would be here.");

    static private final SubLList $list_alt191 = cons(makeSymbol("STRING"), makeSymbol("ASSERTIONS"));



    private static final SubLSymbol SIGN_THESAURUS = makeSymbol("SIGN-THESAURUS");

    private static final SubLSymbol SIGN_CONCEPT = makeSymbol("SIGN-CONCEPT");

    static private final SubLString $str_alt195$__ = makeString(": ");

    public static final SubLSymbol $kw196$FD_SEPARATE_ = makeKeyword("FD-SEPARATE?");

    static private final SubLString $str_alt197$Could_not_determine_a_concept_fro = makeString("Could not determine a concept from ID ~A.");

    private static final SubLSymbol TM_FD = makeSymbol("TM-FD");

    private static final SubLSymbol $BG_COLOR_FULL_RECORD = makeKeyword("BG-COLOR-FULL-RECORD");

    static private final SubLString $str_alt200$Full_Term_Record_for___A_ = makeString("Full Term Record for `~A'");

    static private final SubLString $str_alt201$tm_full_record = makeString("tm-full-record");

    private static final SubLSymbol $EDITABLE_THESAURI = makeKeyword("EDITABLE-THESAURI");



    private static final SubLSymbol $DISPLAY_FILTER = makeKeyword("DISPLAY-FILTER");

    private static final SubLSymbol $EDIT_THESAURI = makeKeyword("EDIT-THESAURI");

    private static final SubLSymbol $FULL_EDIT = makeKeyword("FULL-EDIT");

    static private final SubLString $$$administrator = makeString("administrator");

    private static final SubLSymbol $CORRELATE_CONCEPT = makeKeyword("CORRELATE-CONCEPT");

    static private final SubLString $str_alt209$limited_editor = makeString("limited-editor");

    private static final SubLSymbol $UNCORRELATE = makeKeyword("UNCORRELATE");

    private static final SubLSymbol $THESAURI_MERGED = makeKeyword("THESAURI-MERGED");

    static private final SubLString $$$nil = makeString("nil");

    private static final SubLSymbol $THESAURI_SEPARATE = makeKeyword("THESAURI-SEPARATE");

    static private final SubLString $$$t = makeString("t");

    static private final SubLString $$$LT = makeString("LT");

    static private final SubLString $str_alt216$Full_Term_information_for_ = makeString("Full Term information for:");

    static private final SubLString $str_alt217$__Not_in_the_active_thesauri_ = makeString(" (Not in the active thesauri)");



    static private final SubLString $str_alt219$In_Thesaurus___A = makeString("In Thesaurus: ~A");

    static private final SubLString $str_alt220$____TOP_TERM = makeString(" -- TOP TERM");

    public static final SubLObject $$useFor = constant_handles.reader_make_constant_shell(makeString("useFor"));

    private static final SubLSymbol $SWAP_PT_UF = makeKeyword("SWAP-PT-UF");

    private static final SubLSymbol $IMPORT_UFS = makeKeyword("IMPORT-UFS");

    public static final SubLSymbol $kw224$SHOW_REASONS_ = makeKeyword("SHOW-REASONS?");



    private static final SubLSymbol TM_FULL_RECORD_GUTS_SORT_KEY = makeSymbol("TM-FULL-RECORD-GUTS-SORT-KEY");

    static private final SubLString $str_alt227$Warning__Too_many_arguments = makeString("Warning: Too many arguments");

    static private final SubLString $str_alt228$Warning__Inferred = makeString("Warning: Inferred");

    static private final SubLString $str_alt229$Added_by__A = makeString("Added by ~A");

    static private final SubLString $str_alt230$_on__A = makeString(" on ~A");

    static private final SubLString $str_alt231$_at__A = makeString(" at ~A");

    static private final SubLString $str_alt232$Added_during_the_load_of__A = makeString("Added during the load of ~A");

    static private final SubLString $str_alt233$_by__A = makeString(" by ~A");

    private static final SubLSymbol TM_SSA = makeSymbol("TM-SSA");

    static private final SubLString $str_alt235$Asserted_by__A = makeString("Asserted by ~A");

    static private final SubLString $$$Show_Reasons = makeString("Show Reasons");

    static private final SubLString $str_alt237$Sorry__you_do_not_have_permission = makeString("Sorry, you do not have permission to access this page.");

    static private final SubLString $str_alt238$tm_show_source_audit_info = makeString("tm-show-source-audit-info");

    static private final SubLString $str_alt239$For_the_statement_ = makeString("For the statement:");

    static private final SubLString $str_alt240$In_Thesaurus__ = makeString("In Thesaurus: ");

    static private final SubLString $str_alt241$Reasons_ = makeString("Reasons:");

    static private final SubLString $str_alt242$Inferred_ = makeString("Inferred.");

    private static final SubLSymbol TM_SHOW_SOURCE_AUDIT_INFO = makeSymbol("TM-SHOW-SOURCE-AUDIT-INFO");

    static private final SubLString $str_alt244$_A_Available_Thesaur_A = makeString("~A Available Thesaur~A");

    static private final SubLString $$$us = makeString("us");

    static private final SubLString $$$i = makeString("i");

    static private final SubLString $str_alt247$tm_show_thesauri = makeString("tm-show-thesauri");

    static private final SubLString $str_alt248$There__A__A_thesaur_A_available_A = makeString("There ~A ~A thesaur~A available~A");

    static private final SubLString $$$no_known = makeString("no known");

    static private final SubLString $str_alt250$_ = makeString(".");

    private static final SubLSymbol TM_SHOW_THESAURI = makeSymbol("TM-SHOW-THESAURI");

    private static final SubLSymbol TM_AT = makeSymbol("TM-AT");



    static private final SubLString $$$Top_Terms = makeString("Top Terms");

    static private final SubLString $str_alt255$tm_show_thesaurus_tops = makeString("tm-show-thesaurus-tops");

    static private final SubLString $str_alt256$Tops_of__A = makeString("Tops of ~A");

    static private final SubLString $str_alt257$No_tops_for__A = makeString("No tops for ~A");

    static private final SubLString $str_alt258$Information_about_the_thesaurus__ = makeString("Information about the thesaurus: ");

    static private final SubLString $str_alt259$Abbreviation_ = makeString("Abbreviation:");

    static private final SubLString $str_alt260$Released_ = makeString("Released?");

    static private final SubLString $$$Yes = makeString("Yes");

    static private final SubLString $$$No = makeString("No");

    static private final SubLString $str_alt263$Created_by_ = makeString("Created by:");

    static private final SubLString $str_alt264$Creation_time_ = makeString("Creation time:");

    static private final SubLString $str_alt265$Loaded_by_ = makeString("Loaded by:");

    static private final SubLString $str_alt266$Load_time_ = makeString("Load time:");

    static private final SubLString $str_alt267$full_editor = makeString("full-editor");

    static private final SubLString $str_alt268$Display_Filter_ = makeString("Display Filter:");

    private static final SubLSymbol $OUTPUT_FILTER = makeKeyword("OUTPUT-FILTER");

    static private final SubLString $$$None = makeString("None");

    static private final SubLString $str_alt271$Output_Filter_ = makeString("Output Filter:");

    static private final SubLString $str_alt272$Case_Style_ = makeString("Case Style:");



    static private final SubLString $str_alt274$Comment_ = makeString("Comment:");

    private static final SubLSymbol $ADD_OR_EDIT_COMMENT = makeKeyword("ADD-OR-EDIT-COMMENT");

    private static final SubLSymbol $SET_OR_VIEW_APPLICABLE_RELATIONS = makeKeyword("SET-OR-VIEW-APPLICABLE-RELATIONS");

    private static final SubLSymbol $SET_FILTER = makeKeyword("SET-FILTER");





    private static final SubLSymbol $SET_CASE_STYLE = makeKeyword("SET-CASE-STYLE");

    private static final SubLSymbol $SET_OR_VIEW_INTEGRITY_RULES = makeKeyword("SET-OR-VIEW-INTEGRITY-RULES");

    private static final SubLSymbol $TOGGLE_RELEASE_STATUS = makeKeyword("TOGGLE-RELEASE-STATUS");

    static private final SubLString $str_alt283$Statistics_for_the_thesaurus__ = makeString("Statistics for the thesaurus: ");

    static private final SubLString $str_alt284$Number_of_PTs_ = makeString("Number of PTs:");

    static private final SubLString $str_alt285$_6D = makeString("~6D");

    static private final SubLString $str_alt286$Number_of_UFs_ = makeString("Number of UFs:");

    static private final SubLString $str_alt287$Number_of_SNs_ = makeString("Number of SNs:");

    static private final SubLString $str_alt288$Number_of_RT_links_ = makeString("Number of RT links:");

    static private final SubLString $str_alt289$_A_known_top_A_in_the_thesaurus__ = makeString("~A known top~A in the thesaurus: ");

    static private final SubLString $str_alt290$Information_about___A__thesaurus = makeString("Information about '~A' thesaurus");

    static private final SubLString $str_alt291$tm_basic_about_thesaurus = makeString("tm-basic-about-thesaurus");

    static private final SubLString $str_alt292$tm_about_thesaurus = makeString("tm-about-thesaurus");

    private static final SubLSymbol TM_ABOUT_THESAURUS = makeSymbol("TM-ABOUT-THESAURUS");



    static private final SubLString $$$id = makeString("id");





    static private final SubLString $$$edit = makeString("edit");

    static private final SubLString $str_alt299$_A_comment_about__A = makeString("~A comment about ~A");

    static private final SubLString $$$Edit_the = makeString("Edit the");

    static private final SubLString $$$Add_a = makeString("Add a");

    static private final SubLString $str_alt302$tm_add_or_edit_comment = makeString("tm-add-or-edit-comment");

    static private final SubLString $str_alt303$tm_handle_add_or_edit_comment = makeString("tm-handle-add-or-edit-comment");

    static private final SubLString $$$T = makeString("T");

    static private final SubLString $$$NIL = makeString("NIL");

    static private final SubLString $str_alt306$_A_comment_text_below_ = makeString("~A comment text below:");

    static private final SubLString $$$Enter = makeString("Enter");

    static private final SubLString $$$comment = makeString("comment");

    public static final SubLInteger $int$80 = makeInteger(80);

    public static final SubLObject $$comment = constant_handles.reader_make_constant_shell(makeString("comment"));

    static private final SubLString $$$Change = makeString("Change");

    static private final SubLString $$$Add = makeString("Add");

    private static final SubLSymbol TM_ADD_OR_EDIT_COMMENT = makeSymbol("TM-ADD-OR-EDIT-COMMENT");

    private static final SubLSymbol REDUCE_WHITESPACE = makeSymbol("REDUCE-WHITESPACE");





    private static final SubLSymbol TM_THESAURUS_INFO_SECTION = makeSymbol("TM-THESAURUS-INFO-SECTION");

    static private final SubLString $$$Add_Comment = makeString("Add Comment");

    private static final SubLSymbol TM_HANDLE_ADD_OR_EDIT_COMMENT = makeSymbol("TM-HANDLE-ADD-OR-EDIT-COMMENT");

    static private final SubLString $str_alt320$Implementation_error__Can_t_deter = makeString("Implementation error: Can't determine thesaurus from ~A");

    static private final SubLString $str_alt321$Implementation_error___A_is_not_a = makeString("Implementation error: ~A is not a thesaurus.");



    static private final SubLString $$$Recall_Thesaurus = makeString("Recall Thesaurus");

    static private final SubLString $$$Release_Thesaurus = makeString("Release Thesaurus");

    private static final SubLSymbol TM_CHANGE_RELEASED_STATUS = makeSymbol("TM-CHANGE-RELEASED-STATUS");

    static private final SubLList $list_alt326 = list(makeKeyword("DISPLAY"), makeKeyword("OUTPUT"));

    static private final SubLString $str_alt327$Implementation_error__Can_t_deter = makeString("Implementation error: Can't determine filter type from ~s");

    static private final SubLString $str_alt328$Set_Default__A_Filter_for__A = makeString("Set Default ~A Filter for ~A");

    static private final SubLString $str_alt329$_A = makeString("~A");

    static private final SubLString $str_alt330$tm_change_filter = makeString("tm-change-filter");

    static private final SubLString $str_alt331$Choose_a_Filter_ = makeString("Choose a Filter:");

    static private final SubLString $str_alt332$tm_handle_change_filter = makeString("tm-handle-change-filter");

    static private final SubLString $str_alt333$thesaurus_id = makeString("thesaurus-id");

    static private final SubLString $str_alt334$filter_type = makeString("filter-type");

    static private final SubLString $$$filter = makeString("filter");

    static private final SubLString $$$Set_Filter = makeString("Set Filter");

    static private final SubLString $str_alt337$_A_ = makeString("~A?");

    static private final SubLString $str_alt338$tm_edit_output_filter = makeString("tm-edit-output-filter");

    static private final SubLString $$$Define_a_New_Filter = makeString("Define a New Filter");

    private static final SubLSymbol TM_CHANGE_FILTER = makeSymbol("TM-CHANGE-FILTER");

    static private final SubLList $list_alt341 = list(makeKeyword("OUTPUT"), makeKeyword("DISPLAY"));

    static private final SubLString $str_alt342$Implementation_error___A_is_an_un = makeString("Implementation error: ~A is an unrecognized filter type.");

    public static final SubLObject $$tmDefaultDisplayFilter = constant_handles.reader_make_constant_shell(makeString("tmDefaultDisplayFilter"));

    public static final SubLObject $$tmDefaultOutputFilter = constant_handles.reader_make_constant_shell(makeString("tmDefaultOutputFilter"));

    static private final SubLString $str_alt345$_A_Filter_not_Changed = makeString("~A Filter not Changed");

    static private final SubLString $str_alt346$No_change_was_requested_ = makeString("No change was requested.");

    static private final SubLString $str_alt347$Set_Default__A_Filter = makeString("Set Default ~A Filter");

    private static final SubLSymbol TM_HANDLE_CHANGE_FILTER = makeSymbol("TM-HANDLE-CHANGE-FILTER");

    static private final SubLString $str_alt349$Set_Default_Case_Style_for__A = makeString("Set Default Case Style for ~A");

    static private final SubLString $str_alt350$tm_set_case_style = makeString("tm-set-case-style");

    static private final SubLString $str_alt351$Choose_a_Case_Style_ = makeString("Choose a Case Style:");

    static private final SubLString $str_alt352$tm_handle_set_case_style = makeString("tm-handle-set-case-style");

    static private final SubLString $str_alt353$case_style = makeString("case-style");

    static private final SubLString $$$Set_Case = makeString("Set Case");

    private static final SubLSymbol TM_SET_CASE_STYLE = makeSymbol("TM-SET-CASE-STYLE");

    static private final SubLString $str_alt356$Case_Style_for__A_not_Changed = makeString("Case Style for ~A not Changed");

    private static final SubLSymbol TM_HANDLE_SET_CASE_STYLE = makeSymbol("TM-HANDLE-SET-CASE-STYLE");

    static private final SubLString $str_alt358$_s = makeString("~s");

    static private final SubLSymbol $sym359$TMI_MODULE_ = makeSymbol("TMI-MODULE?");

    static private final SubLString $str_alt360$tm_more_information_for_integrity = makeString("tm-more-information-for-integrity-module|~s");

    static private final SubLString $str_alt361$More_ = makeString("More.");





    static private final SubLString $str_alt364$Unrecognized_Integrity_Rule__s_ = makeString("Unrecognized Integrity Rule ~s.");

    static private final SubLString $str_alt365$More_Information_for_Integrity_Ru = makeString("More Information for Integrity Rules");

    static private final SubLString $str_alt366$tm_more_information_for_integrity = makeString("tm-more-information-for-integrity-module");

    private static final SubLSymbol TM_MORE_INFORMATION_FOR_INTEGRITY_MODULE = makeSymbol("TM-MORE-INFORMATION-FOR-INTEGRITY-MODULE");

    private static final SubLSymbol SYMBOL_SORT_PRED = makeSymbol("SYMBOL-SORT-PRED");

    static private final SubLString $$$ON = makeString("ON");

    static private final SubLString $$$OFF = makeString("OFF");

    static private final SubLString $$$DESCRIPTION = makeString("DESCRIPTION");



    static private final SubLString $$$Optional_Integrity_Checker_Rules = makeString("Optional Integrity Checker Rules");

    static private final SubLString $$$On = makeString("On");

    static private final SubLString $$$Off = makeString("Off");

    static private final SubLString $$$Required_Integrity_Checker_Rules = makeString("Required Integrity Checker Rules");

    static private final SubLString $$$Required = makeString("Required");

    static private final SubLString $str_alt378$Choose_Integrity_Rules_to_use_for = makeString("Choose Integrity Rules to use for ~A");

    static private final SubLString $str_alt379$tm_choose_integrity_modules_to_us = makeString("tm-choose-integrity-modules-to-use");

    static private final SubLString $str_alt380$tm_handle_choose_integrity_module = makeString("tm-handle-choose-integrity-modules-to-use");

    static private final SubLString $$$Use_only_these_Rules = makeString("Use only these Rules");

    private static final SubLSymbol TM_CHOOSE_INTEGRITY_MODULES_TO_USE = makeSymbol("TM-CHOOSE-INTEGRITY-MODULES-TO-USE");

    private static final SubLSymbol TM_SET_USE_VALUE_FOR_INTEGRITY_MODULE_FOR_THESAURUS = makeSymbol("TM-SET-USE-VALUE-FOR-INTEGRITY-MODULE-FOR-THESAURUS");

    private static final SubLSymbol TM_HANDLE_CHOOSE_INTEGRITY_MODULES_TO_USE = makeSymbol("TM-HANDLE-CHOOSE-INTEGRITY-MODULES-TO-USE");

    static private final SubLString $str_alt385$Integrity_Rule_Information_for__A = makeString("Integrity Rule Information for ~A");

    static private final SubLString $str_alt386$tm_integrity_module_info_page = makeString("tm-integrity-module-info-page");

    private static final SubLSymbol TM_INTEGRITY_MODULE_INFO_PAGE = makeSymbol("TM-INTEGRITY-MODULE-INFO-PAGE");

    private static final SubLSymbol TM_TIT = makeSymbol("TM-TIT");

    static private final SubLString $str_alt389$Focus_on___A__in_thesaurus__A_ = makeString("Focus on `~A' in thesaurus ~A.");

    static private final SubLString $str_alt390$tm_term_in_thesaurus = makeString("tm-term-in-thesaurus");

    private static final SubLSymbol TM_TERM_IN_THESAURUS = makeSymbol("TM-TERM-IN-THESAURUS");

    static private final SubLSymbol $sym392$TM_PRED_SYMBOL__ = makeSymbol("TM-PRED-SYMBOL-<");

    private static final SubLSymbol $UTILITY_TABLE_1 = makeKeyword("UTILITY-TABLE-1");

    private static final SubLSymbol $UTILITY_TABLE_2 = makeKeyword("UTILITY-TABLE-2");

    static private final SubLString $$$View_Relations = makeString("View Relations");

    static private final SubLString $str_alt396$tm_browse_relations_entry = makeString("tm-browse-relations-entry");

    static private final SubLString $$$Active_Relations = makeString("Active Relations");

    static private final SubLString $str_alt398$Choose_a_relation_to_display_ = makeString("Choose a relation to display:");

    static private final SubLString $str_alt399$To_view_other__non_active__relati = makeString("To view other, non-active, relations, click ");

    static private final SubLString $str_alt400$tm_browse_inactive_relations = makeString("tm-browse-inactive-relations");

    static private final SubLString $str_alt401$here_ = makeString("here.");

    static private final SubLString $str_alt402$To_revise_the_order_in_which_rela = makeString("To revise the order in which relations are displayed, click ");

    static private final SubLString $str_alt403$tm_reorder_relations_display = makeString("tm-reorder-relations-display");

    private static final SubLSymbol TM_BROWSE_RELATIONS_ENTRY = makeSymbol("TM-BROWSE-RELATIONS-ENTRY");

    static private final SubLString $$$middle = makeString("middle");

    static private final SubLString $$$Relations = makeString("Relations");

    static private final SubLString $str_alt407$Applies_ = makeString("Applies?");

    static private final SubLString $str_alt408$_and_ = makeString(" and ");

    static private final SubLString $$$YES = makeString("YES");

    static private final SubLString $$$NO = makeString("NO");

    static private final SubLString $$$Make_Restricted = makeString("Make Restricted");

    static private final SubLString $str_alt412$tm_restrict_individual_relation__ = makeString("tm-restrict-individual-relation|~S|~A");

    public static final SubLObject $$tmRelationRestrictedFrom = constant_handles.reader_make_constant_shell(makeString("tmRelationRestrictedFrom"));

    static private final SubLString $str_alt414$View_Applicable_Relations_for___A = makeString("View Applicable Relations for '~A' Thesaurus");

    static private final SubLString $str_alt415$tm_browse_restriction_relations_e = makeString("tm-browse-restriction-relations-entry");

    private static final SubLSymbol TM_BROWSE_RESTRICTION_RELATIONS_ENTRY = makeSymbol("TM-BROWSE-RESTRICTION-RELATIONS-ENTRY");

    static private final SubLString $str_alt417$Core_Relations__ = makeString("Core Relations: ");

    static private final SubLString $$$Unrestricted_Relations = makeString("Unrestricted Relations");

    static private final SubLString $$$Restricted_Relations = makeString("Restricted Relations");

    static private final SubLString $str_alt420$tm_restrict_relations_for_thesaur = makeString("tm-restrict-relations-for-thesaurus|~A|T");

    static private final SubLString $$$Choose = makeString("Choose");

    static private final SubLString $str_alt422$___ = makeString(" / ");

    static private final SubLString $str_alt423$tm_browse_restriction_relations_e = makeString("tm-browse-restriction-relations-entry|~A|T");

    static private final SubLString $$$View = makeString("View");

    static private final SubLString $str_alt425$_NON_ACTIVE_Applicable_Relations_ = makeString(" NON-ACTIVE Applicable Relations for Thesaurus.");

    static private final SubLString $$$View_Inactive_Relations = makeString("View Inactive Relations");

    static private final SubLString $$$Inactive_Relations = makeString("Inactive Relations");

    private static final SubLSymbol TM_BROWSE_INACTIVE_RELATIONS = makeSymbol("TM-BROWSE-INACTIVE-RELATIONS");

    private static final SubLSymbol TM_REL = makeSymbol("TM-REL");

    static private final SubLString $str_alt430$Couldn_t_determine_a_relation_fro = makeString("Couldn't determine a relation from ~s");

    private static final SubLSymbol TM_RELATION_LINK = makeSymbol("TM-RELATION-LINK");

    static private final SubLString $str_alt432$Relation_info_for__A = makeString("Relation info for ~A");

    static private final SubLString $str_alt433$tm_show_relation = makeString("tm-show-relation");

    static private final SubLString $str_alt434$_and_its_inverse__ = makeString(" and its inverse, ");

    static private final SubLString $str_alt435$__are = makeString(", are");

    static private final SubLString $str_alt436$_is = makeString(" is");

    static private final SubLString $str_alt437$_not_used_in_any_thesauri_ = makeString(" not used in any thesauri.");

    static private final SubLString $str_alt438$_used_a_total_of__A_times_ = makeString(" used a total of ~A times.");

    static private final SubLString $str_alt439$Number_of_uses_in_particular_thes = makeString("Number of uses in particular thesauri:");

    static private final SubLString $str_alt440$____ = makeString("    ");

    static private final SubLString $$$Relation_Usage_Information = makeString("Relation Usage Information");

    static private final SubLString $str_alt442$tm_relation_usage = makeString("tm-relation-usage");

    static private final SubLString $str_alt443$Implementation_Error__Could_not_d = makeString("Implementation Error: Could not determine a valid relation from ~A");

    private static final SubLSymbol TM_RELATION_USAGE = makeSymbol("TM-RELATION-USAGE");

    private static final SubLSymbol $RELATION_USAGE = makeKeyword("RELATION-USAGE");

    private static final SubLSymbol $REMOVE_ACTIVE_REL = makeKeyword("REMOVE-ACTIVE-REL");

    private static final SubLSymbol $ADD_ACTIVE_REL = makeKeyword("ADD-ACTIVE-REL");

    private static final SubLSymbol $KILL_RELATION = makeKeyword("KILL-RELATION");

    private static final SubLSymbol $EDIT_RELATION = makeKeyword("EDIT-RELATION");

    private static final SubLSymbol $RESTRICT_THESAURI = makeKeyword("RESTRICT-THESAURI");







    static private final SubLString $str_alt454$_A_is_a_Hierarchical_relation_ = makeString("~A is a Hierarchical relation.");

    static private final SubLString $str_alt455$_A_is_a_Lexical_relation_ = makeString("~A is a Lexical relation.");

    static private final SubLString $str_alt456$_A_is_a_Documentation_relation_ = makeString("~A is a Documentation relation.");

    static private final SubLString $str_alt457$_A_is_a_URL_relation_ = makeString("~A is a URL relation.");

    static private final SubLString $str_alt458$_A_is_in_the_active_relation_set_ = makeString("~A is in the active relation set.");

    static private final SubLString $str_alt459$_A_is_not_currently_in_the_set_of = makeString("~A is not currently in the set of active relations.");

    static private final SubLString $str_alt460$_A_is_a_core_relation_ = makeString("~A is a core relation.");

    static private final SubLString $str_alt461$_A_is_a_restricted_relation_ = makeString("~A is a restricted relation.");

    static private final SubLString $str_alt462$_A_is_an_unrestricted_relation_ = makeString("~A is an unrestricted relation.");

    static private final SubLString $str_alt463$_A_is__A = makeString("~A is ~A");

    static private final SubLString $str_alt464$The_first_value_for__A__A = makeString("The first value for ~A ~A");



    static private final SubLString $str_alt466$must_be_a_Preferred_Term_ = makeString("must be a Preferred Term.");

    static private final SubLString $str_alt467$cannot_be_a_Preferred_Term_ = makeString("cannot be a Preferred Term.");

    static private final SubLString $str_alt468$The_second_value_for__A__A = makeString("The second value for ~A ~A");

    static private final SubLString $str_alt469$Broader_relations_ = makeString("Broader relations:");

    static private final SubLString $str_alt470$Narrower_relations_ = makeString("Narrower relations:");

    static private final SubLString $str_alt471$Inverse_relation__ = makeString("Inverse relation: ");

    static private final SubLString $str_alt472$_A_is_symmetric_ = makeString("~A is symmetric.");

    static private final SubLString $str_alt473$_A_is_asymmetric_ = makeString("~A is asymmetric.");

    static private final SubLString $str_alt474$_A_is_transitive_ = makeString("~A is transitive.");

    static private final SubLString $str_alt475$_A_is_reflexive_ = makeString("~A is reflexive.");

    static private final SubLString $str_alt476$_A_is_irreflexive_ = makeString("~A is irreflexive.");

    static private final SubLSymbol $sym477$THESAURUS_PREDICATE_ = makeSymbol("THESAURUS-PREDICATE?");

    static private final SubLString $str_alt478$Edit_of_Relation__A_Not_Allowed = makeString("Edit of Relation ~A Not Allowed");

    static private final SubLString $str_alt479$tm_no_edit_rel = makeString("tm-no-edit-rel");

    static private final SubLString $str_alt480$_A_is_currently_available_in_the_ = makeString("~A is currently available in the following thesauri:");

    static private final SubLString $str_alt481$_A_and__A_are_currently_available = makeString("~A and ~A are currently available in the following thesauri:");

    static private final SubLString $$$NONE = makeString("NONE");

    static private final SubLString $$$Substring_Search_Across_Thesauri = makeString("Substring Search Across Thesauri");

    static private final SubLString $str_alt484$tm_search_page = makeString("tm-search-page");

    static private final SubLString $str_alt485$Enter_a_search_term__choose_optio = makeString("Enter a search term, choose options, select Search button.");

    static private final SubLString $str_alt486$tm_handle_search_page = makeString("tm-handle-search-page");

    static private final SubLString $$$string = makeString("string");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $$$Domain_Options = makeString("Domain Options");

    static private final SubLString $$$ufs = makeString("ufs");

    static private final SubLString $str_alt491$Include_alternative_terms__UFs_an = makeString("Include alternative terms (UFs and other names) also.");

    static private final SubLString $$$browsing = makeString("browsing");

    static private final SubLString $str_alt493$Limit_to_currently_selected_brows = makeString("Limit to currently-selected browsing thesauri.");

    static private final SubLString $$$Automatic_Truncation_Options = makeString("Automatic Truncation Options");

    static private final SubLString $str_alt495$Full_term_begins_with___agen__fin = makeString("Full term begins with (\"agen\" finds \"Agenerase\" and \"Agents affecting\".)");

    static private final SubLString $$$subword = makeString("subword");

    static private final SubLString $str_alt497$Any_word_begins_with___agen__find = makeString("Any word begins with (\"agen\" finds \"Analgesic agent\", too.)");

    static private final SubLString $$$substring = makeString("substring");

    static private final SubLString $str_alt499$Contains_this_substring___agen__f = makeString("Contains this substring (\"agen\" finds \"Reagent\", too.)");

    static private final SubLString $$$Search = makeString("Search");

    private static final SubLSymbol TM_SEARCH_PAGE = makeSymbol("TM-SEARCH-PAGE");

    static private final SubLString $str_alt502$No_search_string_was_specified_ = makeString("No search string was specified.");

    static private final SubLString $str_alt503$Please_enter_a_string_of_at_least = makeString("Please enter a string of at least two characters to search for.");

    static private final SubLString $str_alt504$Results_of_Search_on__S = makeString("Results of Search on ~S");

    static private final SubLString $str_alt505$No_terms_were_found_ = makeString("No terms were found.");

    static private final SubLString $str_alt506$Click_on_a_term_to_display___Or__ = makeString("Click on a term to display.  Or, click on a term's thesaurus abbreviation to ");

    static private final SubLString $str_alt507$advanced_user = makeString("advanced-user");

    private static final SubLSymbol $VIEW_MULTIPLE = makeKeyword("VIEW-MULTIPLE");

    static private final SubLString $str_alt509$add_that_thesaurus_to_your_active = makeString("add that thesaurus to your active thesauri and display the term.");

    static private final SubLString $str_alt510$switch_to_that_thesaurus_and_disp = makeString("switch to that thesaurus and display the term.");

    private static final SubLSymbol TM_STRING_FOR_SORTING_SEARCH_RESULTS = makeSymbol("TM-STRING-FOR-SORTING-SEARCH-RESULTS");

    static private final SubLString $str_alt512$These_terms_were_found_by_using_C = makeString("These terms were found by using Cyc:");

    private static final SubLSymbol TM_HANDLE_SEARCH_PAGE = makeSymbol("TM-HANDLE-SEARCH-PAGE");

    // // Initializers
    public void declareFunctions() {
        declare_html_tm_browsing_file();
    }

    public void initializeVariables() {
        init_html_tm_browsing_file();
    }

    public void runTopLevelForms() {
        setup_html_tm_browsing_file();
    }
}

