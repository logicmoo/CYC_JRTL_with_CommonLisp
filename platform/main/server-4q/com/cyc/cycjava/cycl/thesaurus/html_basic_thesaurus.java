/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.misc_kb_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      HTML-BASIC-THESAURUS
 *  source file: /cyc/top/cycl/thesaurus/html-basic-thesaurus.lisp
 *  created:     2019/07/03 17:38:31
 */
public final class html_basic_thesaurus extends SubLTranslatedFile implements V02 {
    // // Constructor
    private html_basic_thesaurus() {
    }

    public static final SubLFile me = new html_basic_thesaurus();


    // // Definitions
    /**
     * Thesaurus status line for the Basic interface. Indicates user, active thesauri,
     * and includes thesaurus choice button.  This is one row of a table!
     */
    public static final SubLObject tm_basic_status_line() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
	    html_utilities.html_char(CHAR_greater, UNPROVIDED);
	    {
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
			SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    html_utilities.html_spaces(ONE_INTEGER);
			    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
			    html_utilities.html_princ($str_alt1$User__);
			    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			    html_utilities.html_spaces(ONE_INTEGER);
			    html_thesaurus.tm_link($USER, tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			    html_utilities.html_spaces(ONE_INTEGER);
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
		    if (true) {
			html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
			html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			html_utilities.html_markup(html_utilities.html_align($BOTTOM));
			html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_utilities.html_char(CHAR_greater, UNPROVIDED);
		    {
			SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    {
				SubLObject active = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
				html_utilities.html_spaces(ONE_INTEGER);
				html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
				html_utilities.html_princ($str_alt5$Active_Thesaurus__);
				html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
				html_utilities.html_spaces(ONE_INTEGER);
				if (NIL != active) {
				    html_thesaurus.tm_link($THESAURUS, active.first(), UNPROVIDED, UNPROVIDED);
				} else {
				    html_utilities.html_princ($$$None);
				}
				html_utilities.html_indent(THREE_INTEGER);
				html_thesaurus.tm_link($CHOOSE_THESAURUS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				html_utilities.html_spaces(ONE_INTEGER);
			    }
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
	    }
	    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
	    html_utilities.html_source_readability_terpri(UNPROVIDED);
	    return NIL;
	}
    }

    /**
     * Heading for the Basic interface.
     */
    public static final SubLObject thesaurus_basic_heading(SubLObject which) {
	if (which == UNPROVIDED) {
	    which = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
	    if (true) {
		html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
		html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		html_utilities.html_markup(html_utilities.html_align($TOP));
		html_utilities.html_char(CHAR_quotation, UNPROVIDED);
	    }
	    if (true) {
		html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
		html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		html_utilities.html_markup(TWO_INTEGER);
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
			SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
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
				SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    if (!which.equalp($str_alt10$tm_basic_home)) {
					html_thesaurus.tm_link($HOME, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				    }
				    html_thesaurus.tm_help_link(which);
				    if (!which.equalp($str_alt12$tm_basic_read_me)) {
					html_thesaurus.tm_link($READ_ME, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				    }
				    html_thesaurus.tm_link($ADVANCED_INTERFACE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    tm_basic_status_line();
		    tm_basic_display_box(UNPROVIDED);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
	    }
	    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
	    return NIL;
	}
    }

    /**
     * Home page to show upon first logging in to Basic Interface.
     */
    public static final SubLObject tm_basic_home(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject title = string_utilities.strcat(list($str_alt15$Welcome_to_, tm_control_vars.$application_name$.getDynamicValue(thread)));
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
			    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
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
					SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
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
						SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ(title);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event(title);
				thesaurus_basic_heading($str_alt10$tm_basic_home);
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
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
     * Home page for the basic interface.  ARGS, if present, is a message to be printed.
     */
    public static final SubLObject tm_basic_home_1(SubLObject args) {
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
		html_utilities.html_princ($$$Home);
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
			    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
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
					SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
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
						SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Home);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Home);
				thesaurus_basic_heading($str_alt10$tm_basic_home);
				if (NIL != args) {
				    html_utilities.html_br();
				    html_utilities.html_princ(args);
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
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

    public static final SubLObject tm_switch_to_advanced(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCHING_ALL, NIL, UNPROVIDED);
	    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE, $ADVANCED, UNPROVIDED);
	    {
		SubLObject new_thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDIT_THESAURI);
		SubLObject thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
		SubLObject browse_thesauri = remove_duplicates(append(new_thesauri, thesauri), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		browse_thesauri = Sort.sort(browse_thesauri, symbol_function(STRING_LESSP), symbol_function(THESAURUS_NAME));
		tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, browse_thesauri, UNPROVIDED);
	    }
	    tm_internals.tm_save_preferences_from_vector(tm_datastructures.$tm_user$.getDynamicValue(thread));
	    return html_thesaurus.tm_first_choices(UNPROVIDED);
	}
    }

    public static final SubLObject tm_switch_to_basic(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE, $BASIC, UNPROVIDED);
	    {
		SubLObject thesaurus = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI).first();
		if (NIL != thesaurus) {
		    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, list(thesaurus), UNPROVIDED);
		}
	    }
	    tm_internals.tm_save_preferences_from_vector(tm_datastructures.$tm_user$.getDynamicValue(thread));
	    return tm_basic_home(UNPROVIDED);
	}
    }

    public static final SubLObject tm_basic_choose_thesaurus(SubLObject args) {
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
		html_utilities.html_princ($$$Choose_Active_Thesaurus);
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
			    SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
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
					SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
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
						SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Choose_Active_Thesaurus);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Choose_Active_Thesaurus);
				thesaurus_basic_heading($str_alt29$tm_basic_choose_thesaurus);
				html_utilities.html_br();
				{
				    SubLObject thesauri = tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
				    SubLObject active = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI).first();
				    if (NIL == thesauri) {
					html_utilities.html_princ($str_alt30$No_thesauri_are_available_for_bro);
				    } else {
					html_utilities.html_princ($str_alt31$Click_on_a_thesaurus_name_to_view);
					html_utilities.html_br();
					html_utilities.html_princ($str_alt32$Click_on_a_button_and_then_click_);
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
					    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
					    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						html_utilities.html_hidden_input($str_alt33$tm_handle_basic_choose_thesaurus, T, UNPROVIDED);
						{
						    SubLObject cdolist_list_var = thesauri;
						    SubLObject thesaurus = NIL;
						    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), thesaurus = cdolist_list_var.first()) {
							{
							    SubLObject id = cb_utilities.cb_fort_identifier(thesaurus);
							    html_utilities.html_radio_input($$$thesaurus, id, eq(thesaurus, active));
							    html_utilities.html_spaces(TWO_INTEGER);
							    html_thesaurus.tm_link($THESAURUS, thesaurus, UNPROVIDED, UNPROVIDED);
							    html_utilities.html_br();
							}
						    }
						}
						html_utilities.html_submit_input($$$Choose, UNPROVIDED, UNPROVIDED);
						html_utilities.html_reset_input(UNPROVIDED);
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					    } finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
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

    public static final SubLObject tm_handle_basic_choose_thesaurus(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject thesaurus_id = html_utilities.html_extract_input($$$thesaurus, args);
		SubLObject thesaurus = NIL;
		if (!thesaurus_id.isString()) {
		    return html_thesaurus.tm_error($str_alt37$You_must_specify_a_thesaurus_to_m, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		thesaurus_id = read_from_string_ignoring_errors(thesaurus_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL == cb_utilities.cb_valid_fort_identifierP(thesaurus_id)) {
		    return html_thesaurus.tm_error($str_alt38$Implementation_error__Could_not_d, thesaurus_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		thesaurus = html_thesaurus.tm_guess_fort(thesaurus_id);
		if (!((NIL != forts.valid_fortP(thesaurus)) && (NIL != tm_internals.thesaurusP(thesaurus)))) {
		    return html_thesaurus.tm_error($str_alt39$Implementation_error__Could_not_d, thesaurus_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, list(thesaurus), UNPROVIDED);
		tm_internals.tm_save_preferences_from_vector(tm_datastructures.$tm_user$.getDynamicValue(thread));
		tm_basic_home_1($str_alt40$The_Active_Thesaurus_has_been_cha);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_basic_read_me(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject title = cconcatenate($str_alt42$Introducing_the_, tm_control_vars.$application_name$.getDynamicValue(thread));
		SubLObject read_me_file = file_utilities.cyc_home_filename($list_alt43, $str_alt44$read_me, $$$html);
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
			    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
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
					SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
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
						SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ(title);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event(title);
				thesaurus_basic_heading($str_alt12$tm_basic_read_me);
				{
				    SubLObject stream = NIL;
				    try {
					stream = compatibility.open_text(read_me_file, $INPUT, NIL);
					if (!stream.isStream()) {
					    Errors.error($str_alt47$Unable_to_open__S, read_me_file);
					}
					{
					    SubLObject stream_18 = stream;
					    SubLObject line = NIL;
					    for (line = read_line(stream_18, NIL, UNPROVIDED, UNPROVIDED); NIL != line; line = read_line(stream_18, NIL, UNPROVIDED, UNPROVIDED)) {
						html_utilities.html_markup(line);
						html_utilities.html_terpri(UNPROVIDED);
					    }
					}
				    } finally {
					{
					    SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
					    try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						if (stream.isStream()) {
						    close(stream, UNPROVIDED);
						}
					    } finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
					    }
					}
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
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
    public static final SubLSymbol $tm_basic_display_submit_map$ = makeSymbol("*TM-BASIC-DISPLAY-SUBMIT-MAP*");

    /**
     * Initialize *TM-BASIC-DISPLAY-SUBMIT-MAP*.  Has to happen after parameters.lisp has loaded.
     */
    public static final SubLObject tm_init_basic_display_submit_map() {
	$tm_basic_display_submit_map$.setDynamicValue(list(format(NIL, $str_alt49$_Atm_basic_multibutton_gif, html_thesaurus.tm_image_directory()), $$$mode, $$$active, $list_alt52));
	return NIL;
    }

    /**
     * a box which appears near the top of Basic Thesaurus-Manager pages; it accepts the input of a term, and, depending on the option selected to the right, searches all thesauri or the active thesaurus, and displays a Hierarchy page of the term if found.  This is one row of a table!
     */
    public static final SubLObject tm_basic_display_box(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject use_imagesP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USE_IMAGES);
		SubLObject v_term = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM);
		SubLObject string_to_show = (NIL != v_term) ? ((SubLObject) (tm_internals.tm_string_for_constant(v_term, NIL, NIL, T))) : $str_alt55$;
		SubLObject length = max($int$40, length(string_to_show));
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
			html_utilities.html_hidden_input($str_alt57$tm_handle_basic_display_box, T, UNPROVIDED);
			html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
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
				    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(html_utilities.html_align($CENTER));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				}
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
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
					    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
								html_utilities.html_princ($str_alt58$Enter_Term_);
								html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
								html_utilities.html_indent(THREE_INTEGER);
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_text_input($$$term, string_to_show, length);
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
						html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								if (NIL != use_imagesP) {
								    html_utilities.html_image_multi_submit($tm_basic_display_submit_map$.getDynamicValue(thread), $TOP);
								} else {
								    html_utilities.html_radio_input($$$mode, $$$active, T);
								    html_utilities.html_princ($str_alt60$_Search_Active_Thesaurus_);
								    html_utilities.html_indent(TWO_INTEGER);
								    html_utilities.html_radio_input($$$mode, $$$all, UNPROVIDED);
								    html_utilities.html_princ($str_alt62$_Search_All_Thesauri_);
								    html_utilities.html_indent(TWO_INTEGER);
								    html_utilities.html_submit_input($$$Show, UNPROVIDED, UNPROVIDED);
								}
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
						html_utilities.html_source_readability_terpri(UNPROVIDED);
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
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

    public static final SubLObject tm_handle_basic_display_box(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject term_string = html_utilities.html_extract_input($$$term, args);
		SubLObject use_imagesP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USE_IMAGES);
		SubLObject mode = html_utilities.html_extract_input($$$mode, args);
		SubLObject browsable = tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
		SubLObject any_thesauriP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
		SubLObject thesauri = NIL;
		tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCHING_ALL, NIL, UNPROVIDED);
		if (NIL == browsable) {
		    return html_thesaurus.tm_error($str_alt64$No_thesauri_are_available_for_you, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (!((NIL == use_imagesP) || (NIL != mode))) {
		    mode = html_utilities.html_extract_multi_submit_input($tm_basic_display_submit_map$.getDynamicValue(thread), args);
		}
		if (mode.equal($$$active)) {
		    thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
		} else if (mode.equal($$$all)) {
		    thesauri = browsable;
		    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCHING_ALL, T, UNPROVIDED);
		    if (NIL == any_thesauriP) {
			tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, browsable, UNPROVIDED);
		    }
		} else {
		    return html_thesaurus.tm_error($str_alt65$You_must_choose_All_Thesauri_or_A, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}

		if (NIL == thesauri) {
		    return html_thesaurus.tm_error($str_alt66$No_thesaurus_is_currently_active_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL != find_if(symbol_function(WHITESPACEP), term_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		    term_string = tm_internals.canonicalize_lexical_term(term_string);
		}
		if (term_string.equalp($str_alt55$) || (NIL == term_string)) {
		    return tm_basic_show_thesaurus_tops(thesauri, format(NIL, $str_alt68$No_term_was_specified_for_display));
		}
		{
		    SubLObject lexpreds = tm_lexical_index.all_lexpreds();
		    SubLObject signs = tm_lexical_index.signs_of_lexpreds_in_thesauri(term_string, lexpreds, thesauri);
		    SubLObject concepts = NIL;
		    tm_datastructures.clear_utility_tables(tm_datastructures.$tm_user$.getDynamicValue(thread));
		    concepts = remove_duplicates(Mapping.mapcar(symbol_function(SIGN_CONCEPT), signs), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    if (((NIL != list_utilities.singletonP(concepts)) && (NIL != tm_internals.concept_in_thesaurusP(concepts.first(), tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI).first())))
			    && (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCHING_ALL))) {
			if (NIL == any_thesauriP) {
			    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, NIL, UNPROVIDED);
			}
			html_tm_browsing.tm_hierarchy_display(concepts.first(), signs);
		    } else if (NIL == concepts) {
			html_tm_browsing.tm_ad_not_present(list(term_string));
		    } else {
			if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCHING_ALL)) {
			    if (NIL == any_thesauriP) {
				tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, NIL, UNPROVIDED);
			    }
			    tm_basic_choose_all_constant(term_string, signs);
			} else {
			    tm_basic_choose_constant(term_string, concepts, signs);
			}
		    }

		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_basic_choose_constant(SubLObject term_string, SubLObject concepts, SubLObject signs) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM, term_string, UNPROVIDED);
	    {
		SubLObject thesaurus = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI).first();
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
			    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
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
					SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
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
						SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Choose_Term);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Choose_Term);
				thesaurus_basic_heading($str_alt72$tm_basic_choose_constant);
				html_utilities.html_br();
				html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
				html_utilities.html_prin1(term_string);
				html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
				html_utilities.html_princ($str_alt73$_matches_these_terms_);
				html_utilities.html_br();
				html_utilities.html_br();
				{
				    SubLObject cdolist_list_var = concepts;
				    SubLObject concept = NIL;
				    for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), concept = cdolist_list_var.first()) {
					{
					    SubLObject concept_signs = tm_internals.extract_signs_matching(signs, $CONCEPT, concept);
					    tm_basic_thesaurus_constant(concept, thesaurus, NIL, NIL);
					    html_utilities.html_br();
					    html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
					    html_tm_browsing.tm_possibly_show_alternate_input_strings(concept_signs, NIL, T);
					    html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
					}
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
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

    public static final SubLObject tm_basic_choose_all_constant(SubLObject term_string, SubLObject signs) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM, term_string, UNPROVIDED);
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
			    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
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
					SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
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
						SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Choose_Term);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Choose_Term);
				thesaurus_basic_heading($str_alt75$tm_basic_choose_all_constant);
				html_utilities.html_br();
				html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
				html_utilities.html_prin1(term_string);
				html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
				html_utilities.html_princ($str_alt73$_matches_these_terms_);
				html_utilities.html_br();
				html_utilities.html_br();
				{
				    SubLObject thesauri = Sort.sort(tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED), symbol_function(STRING_LESSP), symbol_function(THESAURUS_NAME));
				    SubLObject cdolist_list_var = thesauri;
				    SubLObject thesaurus = NIL;
				    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), thesaurus = cdolist_list_var.first()) {
					{
					    SubLObject thesaurus_signs = tm_internals.extract_signs_matching(signs, $THESAURUS, thesaurus);
					    if (NIL != thesaurus_signs) {
						html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
						html_utilities.html_princ($str_alt76$Terms_from_);
						html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
						html_utilities.html_princ($str_alt77$_);
						html_utilities.html_br();
						html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						{
						    SubLObject thesaurus_concepts = remove_duplicates(Mapping.mapcar(symbol_function(SIGN_CONCEPT), thesaurus_signs), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						    {
							SubLObject _prev_bind_0_35 = tm_internals.$tm_sorting_thesaurus$.currentBinding(thread);
							try {
							    tm_internals.$tm_sorting_thesaurus$.bind(thesaurus, thread);
							    thesaurus_concepts = Sort.sort(thesaurus_concepts, symbol_function(STRING_LESSP), symbol_function(TM_STRING_FOR_SORTING_SEARCH_RESULTS));
							    {
								SubLObject cdolist_list_var_36 = thesaurus_concepts;
								SubLObject concept = NIL;
								for (concept = cdolist_list_var_36.first(); NIL != cdolist_list_var_36; cdolist_list_var_36 = cdolist_list_var_36.rest(), concept = cdolist_list_var_36.first()) {
								    {
									SubLObject concept_signs = tm_internals.extract_signs_matching(thesaurus_signs, $CONCEPT, concept);
									html_utilities.html_indent(TWO_INTEGER);
									tm_basic_thesaurus_constant(concept, thesaurus, NIL, NIL);
									html_utilities.html_br();
									html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
									html_tm_browsing.tm_possibly_show_alternate_input_strings(concept_signs, NIL, T);
									html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
								    }
								}
							    }
							} finally {
							    tm_internals.$tm_sorting_thesaurus$.rebind(_prev_bind_0_35, thread);
							}
						    }
						}
						html_utilities.html_br();
					    }
					}
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
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
     * Prints a hierarchical link to the preferred term of CONSTANT in THESAURUS.  If ALPHA? is non-nil, it's preceded by an alpha icon link.  If SHOW-THESAURUS? is non-nil, the thesaurus abbreviation prints after the term name.
     */
    public static final SubLObject tm_basic_thesaurus_constant(SubLObject constant, SubLObject thesaurus, SubLObject show_thesaurusP, SubLObject alphaP) {
	if (show_thesaurusP == UNPROVIDED) {
	    show_thesaurusP = NIL;
	}
	if (alphaP == UNPROVIDED) {
	    alphaP = NIL;
	}
	{
	    SubLObject id = cb_utilities.cb_fort_identifier(constant);
	    SubLObject thesaurus_id = cb_utilities.cb_fort_identifier(thesaurus);
	    SubLObject string_to_use = tm_internals.tm_string_for_constant(function_terms.naut_to_nart(constant), NIL, list(thesaurus), UNPROVIDED);
	    string_to_use = html_tm_browsing.tm_right_case(string_to_use, UNPROVIDED);
	    if (NIL != alphaP) {
		html_thesaurus.tm_link($ALPHABETICAL, string_to_use, UNPROVIDED, UNPROVIDED);
		html_utilities.html_indent(ONE_INTEGER);
	    }
	    html_thesaurus.tm_link($SWITCH_HIERARCHICAL, id, string_to_use, thesaurus_id);
	    if (NIL != show_thesaurusP) {
		html_utilities.html_indent(ONE_INTEGER);
		html_utilities.html_princ($str_alt81$_);
		html_utilities.html_princ(tm_internals.thesaurus_abbreviation(thesaurus));
		html_utilities.html_princ($str_alt82$_);
	    }
	}
	return NIL;
    }

    /**
     * Basic interface page showing just the tops of THESAURI after MESSAGE
     */
    public static final SubLObject tm_basic_show_thesaurus_tops(SubLObject thesauri, SubLObject message) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Major_Categories);
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
			    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
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
					SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
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
						SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Major_Categories);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Major_Categories);
				thesaurus_basic_heading($str_alt84$tm_basic_show_thesaurus_tops);
				html_utilities.html_br();
				if (NIL != message) {
				    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
				    html_utilities.html_princ(message);
				    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
				}
				html_utilities.html_br();
				{
				    SubLObject cdolist_list_var = thesauri;
				    SubLObject thesaurus = NIL;
				    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), thesaurus = cdolist_list_var.first()) {
					{
					    SubLObject tops = html_tm_browsing.get_tops_for_thesaurus(thesaurus);
					    html_utilities.html_br();
					    html_utilities.html_br();
					    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
					    if (NIL != tops) {
						format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt85$Major_Categories_of__a, tm_internals.thesaurus_name(thesaurus));
						{
						    SubLObject cdolist_list_var_40 = tops;
						    SubLObject top = NIL;
						    for (top = cdolist_list_var_40.first(); NIL != cdolist_list_var_40; cdolist_list_var_40 = cdolist_list_var_40.rest(), top = cdolist_list_var_40.first()) {
							html_utilities.html_br();
							tm_basic_thesaurus_constant(top.first(), thesaurus, NIL, NIL);
						    }
						}
					    } else {
						format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt86$No_Major_Categories_for__a, tm_internals.thesaurus_name(thesaurus));
					    }
					    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
					}
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
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
     * Prints out basic information about THESAURUS.
     */
    public static final SubLObject tm_basic_thesaurus_info_section(SubLObject thesaurus) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCHING_ALL, NIL, UNPROVIDED);
	    {
		SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
		SubLObject abbreviation = tm_internals.thesaurus_abbreviation(thesaurus);
		SubLObject comment = kb_accessors.comment(thesaurus, tm_datastructures.$tm_mt$.getGlobalValue());
		SubLObject tops = html_tm_browsing.get_tops_for_thesaurus(thesaurus);
		SubLObject len = length(tops);
		SubLObject creator = bookkeeping_store.creator(thesaurus, UNPROVIDED);
		SubLObject creation_time = bookkeeping_store.creation_time(thesaurus, UNPROVIDED);
		SubLObject load_date = tm_internals.thesaurus_load_date(thesaurus);
		SubLObject loader = tm_internals.thesaurus_loader(thesaurus);
		SubLObject creator_name = NIL;
		SubLObject loader_name = NIL;
		if (NIL != constant_handles.valid_constantP(creator, UNPROVIDED)) {
		    creator_name = tm_internals.user_name(creator);
		}
		if (NIL != constant_handles.valid_constantP(loader, UNPROVIDED)) {
		    loader_name = tm_internals.user_name(loader);
		}
		html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_utilities.html_princ($str_alt87$Information_about_the_thesaurus__);
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
				SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ($str_alt88$Abbreviation_);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ(abbreviation);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			}
			if (NIL != creator) {
			    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ($str_alt89$Created_by_);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ(NIL != creator_name ? ((SubLObject) (creator_name)) : constants_high.constant_name(creator));
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			}
			if (NIL != creation_time) {
			    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ($str_alt90$Creation_time_);
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
					    html_utilities.html_princ(numeric_date_utilities.datestring(creation_time));
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
			}
			if (NIL != loader) {
			    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ($str_alt91$Loaded_by_);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ(NIL != loader_name ? ((SubLObject) (loader_name)) : constants_high.constant_name(loader));
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
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
			if (NIL != load_date) {
			    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ($str_alt92$Load_time_);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ(numeric_date_utilities.datestring(load_date));
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
			}
			html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
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
					SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ($str_alt93$Comment_);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
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
					SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ(comment);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				}
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
		if (NIL != tops) {
		    html_utilities.html_br();
		    html_utilities.html_br();
		    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
		    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt94$_a_known_Major_Categor_a_in_the_t, len, len.numE(ONE_INTEGER) ? ((SubLObject) ($$$y)) : $$$ies);
		    html_utilities.html_princ(thesaurus_name);
		    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		    html_utilities.html_br();
		    tm_basic_thesaurus_constant(caar(tops), thesaurus, UNPROVIDED, UNPROVIDED);
		    html_utilities.html_br();
		    {
			SubLObject cdolist_list_var = tops.rest();
			SubLObject pair = NIL;
			for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), pair = cdolist_list_var.first()) {
			    tm_basic_thesaurus_constant(pair.first(), thesaurus, UNPROVIDED, UNPROVIDED);
			    html_utilities.html_br();
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_basic_print_nodes(SubLObject constant, SubLObject id, SubLObject signs, SubLObject message) {
	if (signs == UNPROVIDED) {
	    signs = NIL;
	}
	if (message == UNPROVIDED) {
	    message = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SEARCHING_ALL, NIL, UNPROVIDED);
	    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_PATHS, NIL, UNPROVIDED);
	    {
		SubLObject thesaurus = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI).first();
		SubLObject preferred = tm_datastructures.concept_term(constant, thesaurus);
		tm_datastructures.clear_utility_tables(tm_datastructures.$tm_user$.getDynamicValue(thread));
		tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM, constant, UNPROVIDED);
		{
		    SubLObject color_value = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_HIERARCHICAL);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ(format(NIL, $str_alt99$Hierarchical_display_of___a_, preferred));
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
				SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
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
					    SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
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
						    SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ(format(NIL, $str_alt99$Hierarchical_display_of___a_, preferred));
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event(format(NIL, $str_alt99$Hierarchical_display_of___a_, preferred));
				    html_tm_browsing.tm_possibly_show_alternate_input_strings(signs, UNPROVIDED, UNPROVIDED);
				    if (message.isString()) {
					html_utilities.html_princ(message);
					html_utilities.html_br();
					html_utilities.html_br();
				    }
				    thesaurus_basic_heading($str_alt100$tm_basic_print_nodes);
				    tm_basic_print_nodes_1(constant);
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
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
	    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_PATHS, NIL, UNPROVIDED);
	    return NIL;
	}
    }

    public static final SubLObject tm_basic_display_tops(SubLObject constant, SubLObject thesauri) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject forms = tm_internals.compute_tops(constant, thesauri, UNPROVIDED);
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
				    SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_utilities.html_br();
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
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
				    SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
					html_utilities.html_princ($str_alt101$Major_Categories_);
					html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
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
			SubLObject cdolist_list_var = forms;
			SubLObject f = NIL;
			for (f = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), f = cdolist_list_var.first()) {
			    {
				SubLObject top = f.first();
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
					    SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						tm_basic_thesaurus_constant(top, thesauri.first(), NIL, NIL);
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
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

    public static final SubLObject tm_basic_display_parent_paths(SubLObject parent_paths, SubLObject thesaurus) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject index = ZERO_INTEGER;
		SubLObject last_items = NIL;
		SubLObject cdolist_list_var = parent_paths;
		SubLObject path = NIL;
		for (path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), path = cdolist_list_var.first()) {
		    index = ONE_INTEGER;
		    {
			SubLObject last = last(path, UNPROVIDED).first();
			SubLObject cdolist_list_var_65 = path;
			SubLObject item = NIL;
			for (item = cdolist_list_var_65.first(); NIL != cdolist_list_var_65; cdolist_list_var_65 = cdolist_list_var_65.rest(), item = cdolist_list_var_65.first()) {
			    if (NIL != misc_kb_utilities.constant_or_natP(item)) {
				{
				    SubLObject indent = index;
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
						    {
							SubLObject item_id = cb_utilities.cb_fort_identifier(item);
							if (item.equal(last)) {
							    {
								SubLObject item_var = item_id;
								if (NIL == member(item_var, last_items, symbol_function(EQUAL), symbol_function(IDENTITY))) {
								    last_items = cons(item_var, last_items);
								}
							    }
							}
							tm_basic_thesaurus_constant(item, thesaurus, NIL, NIL);
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
				index = add(index, ONE_INTEGER);
			    }
			}
		    }
		}
		tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $GRAPH_PATHS, last_items, UNPROVIDED);
		return index;
	    }
	}
    }

    public static final SubLObject tm_basic_display_ancestors(SubLObject constant, SubLObject height, SubLObject thesauri, SubLObject indent) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject index = indent;
		SubLObject output_filter_info = tm_internals.tm_use_filteringP(NIL, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DISPLAY_FILTER), tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI),
			tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE), tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITING_ENABLED), tm_datastructures.$tm_user$.getDynamicValue(thread), $DISPLAY);
		SubLObject bt_symbol = $$$BT;
		SubLObject bt_print_name = (NIL != output_filter_info)
			? ((SubLObject) (bt_symbol.isString() && tm_internals.tm_output_with_print_name_according_to_filter(bt_symbol, output_filter_info).isString() ? ((SubLObject) (tm_internals.tm_output_with_print_name_according_to_filter(bt_symbol, output_filter_info))) : bt_symbol))
			: bt_symbol;
		SubLObject relations_to_use = NIL;
		SubLObject relation_term_indices = NIL;
		SubLObject relation_pairs = NIL;
		if (NIL != output_filter_info) {
		    {
			SubLObject filter_relations = tm_internals.tm_relations_to_output_as_this_according_to_filter($$$BT, output_filter_info, UNPROVIDED);
			SubLObject filtered_relation_constant = NIL;
			relations_to_use = NIL;
			{
			    SubLObject cdolist_list_var = filter_relations;
			    SubLObject filter_relation = NIL;
			    for (filter_relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), filter_relation = cdolist_list_var.first()) {
				filtered_relation_constant = tm_internals.relation_constant_from_abbreviation(filter_relation);
				if ((NIL != filtered_relation_constant) && (NIL != tm_internals.thesaurus_predicateP(filtered_relation_constant))) {
				    {
					SubLObject item_var = cons(filtered_relation_constant, tm_internals.relation_term_arg_from_abbreviation(filter_relation));
					if (NIL == member(item_var, relation_pairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
					    relation_pairs = cons(item_var, relation_pairs);
					}
				    }
				}
			    }
			}
			relations_to_use = Mapping.mapcar(symbol_function(CAR), relation_pairs);
			relation_term_indices = Mapping.mapcar(symbol_function(CDR), relation_pairs);
		    }
		}
		if (!height.equal(ZERO_INTEGER)) {
		    {
			SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
			    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
			    mt_relevance_macros.$relevant_mts$.bind(thesauri, thread);
			    {
				SubLObject parent_paths = (NIL != output_filter_info) ? ((SubLObject) (NIL != relations_to_use ? ((SubLObject) (tm_internals.construct_parent_paths(constant, thesauri, height, $$broaderTerm, relations_to_use, relation_term_indices))) : NIL))
					: tm_internals.construct_parent_paths(constant, thesauri, height, $$broaderTerm, UNPROVIDED, UNPROVIDED);
				if (NIL != parent_paths) {
				    {
					SubLObject indent_67 = ZERO_INTEGER;
					SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_67));
					html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_indent_row_internal(indent_67);
						html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						if (NIL != span) {
						    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(span);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_br();
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
					html_utilities.html_source_readability_terpri(UNPROVIDED);
				    }
				    {
					SubLObject indent_70 = ZERO_INTEGER;
					SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_70));
					html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_indent_row_internal(indent_70);
						html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						if (NIL != span) {
						    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(span);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_utilities.html_princ(
								format(NIL, $str_alt110$_as_a, bt_print_name, NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EXPAND_PARENT_PATHS) ? ((SubLObject) ($str_alt77$_)) : $str_alt112$__compressed_display__));
							html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
							index = tm_basic_display_parent_paths(parent_paths, thesauri.first());
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
					html_utilities.html_source_readability_terpri(UNPROVIDED);
				    }
				} else {
				    {
					SubLObject indent_73 = ZERO_INTEGER;
					SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_73));
					html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_indent_row_internal(indent_73);
						html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						if (NIL != span) {
						    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(span);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_br();
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
					html_utilities.html_source_readability_terpri(UNPROVIDED);
				    }
				    {
					SubLObject indent_76 = ZERO_INTEGER;
					SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_76));
					html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_indent_row_internal(indent_76);
						html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						if (NIL != span) {
						    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(span);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
							format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt113$No__as, bt_print_name);
							html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
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
				}
			    }
			} finally {
			    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
			    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
		    }
		}
		return index;
	    }
	}
    }

    /**
     * Prints out information from the active thesaurus.
     */
    public static final SubLObject tm_basic_elaborate_thesaurus_constant(SubLObject constant, SubLObject indent_level) {
	if (indent_level == UNPROVIDED) {
	    indent_level = ZERO_INTEGER;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
		SubLObject output_filter_info = tm_internals.tm_use_filteringP(NIL, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DISPLAY_FILTER), thesauri, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE),
			tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITING_ENABLED), tm_datastructures.$tm_user$.getDynamicValue(thread), $DISPLAY);
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
				SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
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
					    SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						tm_basic_thesaurus_constant(constant, thesauri.first(), NIL, NIL);
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
				    }
				    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
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
		    for (relation_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), relation_spec = cdolist_list_var.first()) {
			{
			    SubLObject rel_symbol = relation_spec.first();
			    SubLObject output_symbol = (NIL != output_filter_info)
				    ? ((SubLObject) (rel_symbol.isString() && tm_internals.tm_output_with_print_name_according_to_filter(rel_symbol, output_filter_info).isString() ? ((SubLObject) (tm_internals.tm_output_with_print_name_according_to_filter(rel_symbol, output_filter_info)))
					    : rel_symbol))
				    : rel_symbol;
			    SubLObject value_list = second(relation_spec);
			    if (NIL == find(rel_symbol, $list_alt115, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
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
							SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
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
								SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
								    html_macros.$html_safe_print$.bind(T, thread);
								    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
								    html_utilities.html_princ(output_symbol);
								    html_utilities.html_princ($str_alt116$__);
								    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
								    value_list = html_tm_browsing.tm_sort_full_record_value_list(value_list);
								    {
									SubLObject cdolist_list_var_83 = value_list;
									SubLObject value_item = NIL;
									for (value_item = cdolist_list_var_83.first(); NIL != cdolist_list_var_83; cdolist_list_var_83 = cdolist_list_var_83.rest(), value_item = cdolist_list_var_83.first()) {
									    {
										SubLObject value = value_item.first();
										SubLObject indent_84 = add(indent_level, ONE_INTEGER);
										SubLObject span_85 = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_84));
										html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
										html_utilities.html_char(CHAR_greater, UNPROVIDED);
										{
										    SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
										    try {
											html_macros.$html_safe_print$.bind(T, thread);
											html_utilities.html_indent_row_internal(indent_84);
											html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
											if (NIL != span_85) {
											    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
											    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
											    html_utilities.html_markup(span_85);
											    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
											}
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												if (NIL != forts.fort_p(value)) {
												    tm_basic_thesaurus_constant(value, thesauri.first(), NIL, NIL);
												} else {
												    if (NIL != tm_internals.tm_url_predicateP(tm_internals.relation_constant_from_abbreviation(rel_symbol))) {
													html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
													html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
													html_utilities.html_char(CHAR_quotation, UNPROVIDED);
													html_utilities.html_markup(value);
													html_utilities.html_char(CHAR_quotation, UNPROVIDED);
													html_utilities.html_char(CHAR_greater, UNPROVIDED);
													{
													    SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
													    try {
														html_macros.$html_safe_print$.bind(T, thread);
														html_utilities.html_princ(value);
													    } finally {
														html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
													    }
													}
													html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
												    } else {
													html_utilities.html_princ(value);
												    }
												}
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
										    } finally {
											html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
										    }
										}
										html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
										html_utilities.html_source_readability_terpri(UNPROVIDED);
									    }
									}
								    }
								} finally {
								    html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
								}
							    }
							    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
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

    public static final SubLObject tm_basic_hierarchy_display_term(SubLObject constant, SubLObject indent) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL != forts.valid_fortP(constant)) && indent.isInteger()) {
		{
		    SubLObject indent_89 = ZERO_INTEGER;
		    SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_89));
		    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
		    html_utilities.html_char(CHAR_greater, UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    html_utilities.html_indent_row_internal(indent_89);
			    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
			    if (NIL != span) {
				html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(span);
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_br();
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
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
		    SubLObject indent_91 = ZERO_INTEGER;
		    SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_91));
		    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
		    html_utilities.html_char(CHAR_greater, UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    html_utilities.html_indent_row_internal(indent_91);
			    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
			    if (NIL != span) {
				html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(span);
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
				    html_utilities.html_princ($str_alt117$Term_);
				    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
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
		tm_basic_elaborate_thesaurus_constant(constant, indent);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_basic_print_nodes_2(SubLObject constant, SubLObject mts, SubLObject already_seen, SubLObject max, SubLObject depth, SubLObject relations_to_use) {
	if (mts == UNPROVIDED) {
	    mts = NIL;
	}
	if (already_seen == UNPROVIDED) {
	    already_seen = NIL;
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
		format(T, $str_alt118$____Entering__s, TM_BASIC_PRINT_NODES_2);
		format(T, $str_alt120$___________Term___s, constant);
		format(T, $str_alt121$______Max_depth___s, max);
		format(T, $str_alt122$__Current_depth___s, depth);
	    }
	    {
		SubLObject id = cb_utilities.cb_fort_identifier(constant);
		SubLObject relation = $$broaderTerm;
		SubLObject preferred_nodes = NIL;
		SubLObject sorted_nodes = NIL;
		if ((id.isInteger() && (NIL == find(id, already_seen, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && ((NIL == max) || depth.numL(max))) {
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
				    SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					tm_basic_thesaurus_constant(constant, mts.first(), NIL, NIL);
					if (max.isInteger() && depth.numE(subtract(max, ONE_INTEGER))) {
					    preferred_nodes = html_tm_browsing.hd_preferred_nodes(constant, relation, mts, relations_to_use);
					    if (NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) {
						format(T, $str_alt123$_____Next_nodes___s, preferred_nodes);
					    }
					    if (NIL != preferred_nodes) {
						html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
						html_utilities.html_princ($str_alt124$____);
						html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
					    }
					}
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
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
		    if (!(max.isInteger() && depth.numGE(subtract(max, ONE_INTEGER)))) {
			if (NIL == preferred_nodes) {
			    preferred_nodes = html_tm_browsing.hd_preferred_nodes(constant, relation, mts, relations_to_use);
			}
			if ((NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) && ((NIL == max) || depth.numL(subtract(max, ONE_INTEGER)))) {
			    format(T, $str_alt123$_____Next_nodes___s, preferred_nodes);
			}
			if ((NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) && (NIL != preferred_nodes)) {
			    format(T, $str_alt125$____Sorting_nodes_____);
			}
			sorted_nodes = Sort.sort(preferred_nodes, symbol_function(STRING_LESSP), symbol_function(TM_STRING_FOR_CONSTANT));
			if ((NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) && (NIL != preferred_nodes)) {
			    format(T, $str_alt127$done_);
			}
			{
			    SubLObject cdolist_list_var = sorted_nodes;
			    SubLObject node = NIL;
			    for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
				tm_basic_print_nodes_2(node, mts, cons(id, already_seen), max, add(depth, ONE_INTEGER), relations_to_use);
			    }
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_basic_display_descendants(SubLObject constant, SubLObject mts, SubLObject child_depth, SubLObject relation, SubLObject indent) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject relations_to_use = list(relation);
		SubLObject output_filter_info = tm_internals.tm_use_filteringP(NIL, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DISPLAY_FILTER), tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI),
			tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTERFACE), tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITING_ENABLED), tm_datastructures.$tm_user$.getDynamicValue(thread), $DISPLAY);
		SubLObject nt_symbol = $$$NT;
		SubLObject nt_print_name = (NIL != output_filter_info)
			? ((SubLObject) (nt_symbol.isString() && tm_internals.tm_output_with_print_name_according_to_filter(nt_symbol, output_filter_info).isString() ? ((SubLObject) (tm_internals.tm_output_with_print_name_according_to_filter(nt_symbol, output_filter_info))) : nt_symbol))
			: nt_symbol;
		SubLObject nodes = NIL;
		SubLObject relation_pairs = NIL;
		SubLObject relation_term_indices = NIL;
		if (NIL != output_filter_info) {
		    {
			SubLObject filter_relations = tm_internals.tm_relations_to_output_as_this_according_to_filter($$$NT, output_filter_info, UNPROVIDED);
			SubLObject filtered_relation_constant = NIL;
			relations_to_use = NIL;
			{
			    SubLObject cdolist_list_var = filter_relations;
			    SubLObject filter_relation = NIL;
			    for (filter_relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), filter_relation = cdolist_list_var.first()) {
				filtered_relation_constant = tm_internals.relation_constant_from_abbreviation(filter_relation);
				if ((NIL != filtered_relation_constant) && (NIL != tm_internals.thesaurus_predicateP(filtered_relation_constant))) {
				    {
					SubLObject item_var = cons(filtered_relation_constant, tm_internals.relation_term_arg_from_abbreviation(filter_relation));
					if (NIL == member(item_var, relation_pairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
					    relation_pairs = cons(item_var, relation_pairs);
					}
				    }
				}
			    }
			}
			relations_to_use = Mapping.mapcar(symbol_function(CAR), relation_pairs);
			relation_term_indices = Mapping.mapcar(symbol_function(CDR), relation_pairs);
		    }
		}
		if (!((NIL != output_filter_info) && (NIL == relations_to_use))) {
		    nodes = delete(constant, tm_internals.nt(constant, relation, mts, NIL, NIL, relations_to_use, relation_term_indices), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) {
		    format(T, $str_alt129$____Now_inside_scope_of__s____, TM_BASIC_DISPLAY_DESCENDANTS);
		    format(T, $str_alt131$____Term___s, constant);
		    format(T, $str_alt132$____Next_nodes___s, nodes);
		}
		{
		    SubLObject preferred_nodes = list_utilities.delete_if_not(symbol_function(PREFERRED_TERMS), nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    SubLObject sorted_nodes = NIL;
		    SubLObject depth = (child_depth.isInteger()) ? ((SubLObject) (add(indent, child_depth))) : NIL;
		    if ((NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) && (NIL != preferred_nodes)) {
			format(T, $str_alt125$____Sorting_nodes_____);
		    }
		    {
			SubLObject _prev_bind_0 = tm_internals.$tm_sorting_thesaurus$.currentBinding(thread);
			try {
			    tm_internals.$tm_sorting_thesaurus$.bind(mts.first(), thread);
			    sorted_nodes = Sort.sort(preferred_nodes, symbol_function(STRING_LESSP), symbol_function(TM_STRING_FOR_SORTING_SEARCH_RESULTS));
			} finally {
			    tm_internals.$tm_sorting_thesaurus$.rebind(_prev_bind_0, thread);
			}
		    }
		    if ((NIL != tm_datastructures.$tm_debug$.getDynamicValue(thread)) && (NIL != preferred_nodes)) {
			format(T, $str_alt127$done_);
		    }
		    if ((NIL != sorted_nodes) && (!child_depth.equal(ZERO_INTEGER))) {
			if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $kw134$DETAILS_SHOWN_)) {
			    {
				SubLObject indent_94 = ZERO_INTEGER;
				SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_94));
				html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_utilities.html_indent_row_internal(indent_94);
					html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					if (NIL != span) {
					    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(span);
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_br();
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
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
			    SubLObject indent_96 = ZERO_INTEGER;
			    SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_96));
			    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_indent_row_internal(indent_96);
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    if (NIL != span) {
					html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(span);
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
					    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt135$_as_, nt_print_name);
					    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
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
			    SubLObject cdolist_list_var = sorted_nodes;
			    SubLObject node = NIL;
			    for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
				tm_basic_print_nodes_2(node, mts, NIL, depth, indent, relations_to_use);
			    }
			}
		    } else {
			if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $kw134$DETAILS_SHOWN_)) {
			    {
				SubLObject indent_98 = ZERO_INTEGER;
				SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_98));
				html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_utilities.html_indent_row_internal(indent_98);
					html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					if (NIL != span) {
					    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(span);
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_br();
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
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
			    SubLObject indent_100 = ZERO_INTEGER;
			    SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent_100));
			    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_indent_row_internal(indent_100);
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    if (NIL != span) {
					html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(span);
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
					    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt113$No__as, nt_print_name);
					    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
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
	    return NIL;
	}
    }

    /**
     * If non-NIL, the hierarchy display of the Basic Interface shows
     * Major Categories of the displayed term.
     */
    // defparameter
    public static final SubLSymbol $tm_basic_show_major_categoriesP$ = makeSymbol("*TM-BASIC-SHOW-MAJOR-CATEGORIES?*");

    public static final SubLObject tm_basic_print_nodes_1(SubLObject constant) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEPTH_SPACING)) {
		tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEPTH_SPACING, TWO_INTEGER, UNPROVIDED);
	    }
	    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $kw134$DETAILS_SHOWN_, NIL, UNPROVIDED);
	    html_tm_browsing.compute_allowable_depth(constant);
	    {
		SubLObject index = ONE_INTEGER;
		SubLObject mts = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
		SubLObject relation = $$broaderTerm;
		SubLObject parent_depth = ONE_INTEGER;
		SubLObject child_depth = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $COMPUTED_MAX_DEPTH);
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		    try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
			mt_relevance_macros.$relevant_mts$.bind(mts, thread);
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
			    SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
			    SubLObject _prev_bind_1_103 = html_macros.$html_indent_table_max$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_macros.$html_indent_table_max$.bind($int$50, thread);
				if (NIL != $tm_basic_show_major_categoriesP$.getDynamicValue(thread)) {
				    tm_basic_display_tops(constant, mts);
				}
				index = tm_basic_display_ancestors(constant, parent_depth, mts, index);
				tm_basic_hierarchy_display_term(constant, index);
				index = add(index, ONE_INTEGER);
				tm_basic_display_descendants(constant, mts, child_depth, relation, index);
				html_utilities.html_indent_table_internal(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEPTH_SPACING));
			    } finally {
				html_macros.$html_indent_table_max$.rebind(_prev_bind_1_103, thread);
				html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
		    } finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject declare_html_basic_thesaurus_file() {
	declareFunction("tm_basic_status_line", "TM-BASIC-STATUS-LINE", 0, 0, false);
	declareFunction("thesaurus_basic_heading", "THESAURUS-BASIC-HEADING", 0, 1, false);
	declareFunction("tm_basic_home", "TM-BASIC-HOME", 0, 1, false);
	declareFunction("tm_basic_home_1", "TM-BASIC-HOME-1", 0, 1, false);
	declareFunction("tm_switch_to_advanced", "TM-SWITCH-TO-ADVANCED", 0, 1, false);
	declareFunction("tm_switch_to_basic", "TM-SWITCH-TO-BASIC", 0, 1, false);
	declareFunction("tm_basic_choose_thesaurus", "TM-BASIC-CHOOSE-THESAURUS", 0, 1, false);
	declareFunction("tm_handle_basic_choose_thesaurus", "TM-HANDLE-BASIC-CHOOSE-THESAURUS", 1, 0, false);
	declareFunction("tm_basic_read_me", "TM-BASIC-READ-ME", 0, 1, false);
	declareFunction("tm_init_basic_display_submit_map", "TM-INIT-BASIC-DISPLAY-SUBMIT-MAP", 0, 0, false);
	declareFunction("tm_basic_display_box", "TM-BASIC-DISPLAY-BOX", 0, 1, false);
	declareFunction("tm_handle_basic_display_box", "TM-HANDLE-BASIC-DISPLAY-BOX", 1, 0, false);
	declareFunction("tm_basic_choose_constant", "TM-BASIC-CHOOSE-CONSTANT", 3, 0, false);
	declareFunction("tm_basic_choose_all_constant", "TM-BASIC-CHOOSE-ALL-CONSTANT", 2, 0, false);
	declareFunction("tm_basic_thesaurus_constant", "TM-BASIC-THESAURUS-CONSTANT", 2, 2, false);
	declareFunction("tm_basic_show_thesaurus_tops", "TM-BASIC-SHOW-THESAURUS-TOPS", 2, 0, false);
	declareFunction("tm_basic_thesaurus_info_section", "TM-BASIC-THESAURUS-INFO-SECTION", 1, 0, false);
	declareFunction("tm_basic_print_nodes", "TM-BASIC-PRINT-NODES", 2, 2, false);
	declareFunction("tm_basic_display_tops", "TM-BASIC-DISPLAY-TOPS", 2, 0, false);
	declareFunction("tm_basic_display_parent_paths", "TM-BASIC-DISPLAY-PARENT-PATHS", 2, 0, false);
	declareFunction("tm_basic_display_ancestors", "TM-BASIC-DISPLAY-ANCESTORS", 4, 0, false);
	declareFunction("tm_basic_elaborate_thesaurus_constant", "TM-BASIC-ELABORATE-THESAURUS-CONSTANT", 1, 1, false);
	declareFunction("tm_basic_hierarchy_display_term", "TM-BASIC-HIERARCHY-DISPLAY-TERM", 2, 0, false);
	declareFunction("tm_basic_print_nodes_2", "TM-BASIC-PRINT-NODES-2", 1, 5, false);
	declareFunction("tm_basic_display_descendants", "TM-BASIC-DISPLAY-DESCENDANTS", 5, 0, false);
	declareFunction("tm_basic_print_nodes_1", "TM-BASIC-PRINT-NODES-1", 1, 0, false);
	return NIL;
    }

    public static final SubLObject init_html_basic_thesaurus_file() {
	defparameter("*TM-BASIC-DISPLAY-SUBMIT-MAP*", NIL);
	defparameter("*TM-BASIC-SHOW-MAJOR-CATEGORIES?*", T);
	return NIL;
    }

    public static final SubLObject setup_html_basic_thesaurus_file() {
	html_macros.note_html_handler_function(TM_BASIC_HOME);
	html_macros.note_html_handler_function(TM_BASIC_HOME_1);
	html_macros.note_html_handler_function(TM_SWITCH_TO_ADVANCED);
	html_macros.note_html_handler_function(TM_SWITCH_TO_BASIC);
	html_macros.note_html_handler_function(TM_BASIC_CHOOSE_THESAURUS);
	html_macros.note_html_handler_function(TM_HANDLE_BASIC_CHOOSE_THESAURUS);
	html_macros.note_html_handler_function(TM_BASIC_READ_ME);
	html_macros.note_html_handler_function(TM_HANDLE_BASIC_DISPLAY_BOX);
	return NIL;
    }

    static private final SubLString $str_alt1$User__ = makeString("User: ");

    private static final SubLSymbol $THESAURI = makeKeyword("THESAURI");

    static private final SubLString $str_alt5$Active_Thesaurus__ = makeString("Active Thesaurus: ");

    private static final SubLSymbol $THESAURUS = makeKeyword("THESAURUS");

    static private final SubLString $$$None = makeString("None");

    private static final SubLSymbol $CHOOSE_THESAURUS = makeKeyword("CHOOSE-THESAURUS");

    static private final SubLString $str_alt10$tm_basic_home = makeString("tm-basic-home");

    static private final SubLString $str_alt12$tm_basic_read_me = makeString("tm-basic-read-me");

    private static final SubLSymbol $READ_ME = makeKeyword("READ-ME");

    private static final SubLSymbol $ADVANCED_INTERFACE = makeKeyword("ADVANCED-INTERFACE");

    static private final SubLString $str_alt15$Welcome_to_ = makeString("Welcome to ");

    private static final SubLSymbol TM_BASIC_HOME = makeSymbol("TM-BASIC-HOME");

    static private final SubLString $$$Home = makeString("Home");

    private static final SubLSymbol TM_BASIC_HOME_1 = makeSymbol("TM-BASIC-HOME-1");

    private static final SubLSymbol $SEARCHING_ALL = makeKeyword("SEARCHING-ALL");

    private static final SubLSymbol $INTERFACE = makeKeyword("INTERFACE");

    private static final SubLSymbol $ADVANCED = makeKeyword("ADVANCED");

    private static final SubLSymbol $EDIT_THESAURI = makeKeyword("EDIT-THESAURI");

    private static final SubLSymbol TM_SWITCH_TO_ADVANCED = makeSymbol("TM-SWITCH-TO-ADVANCED");

    private static final SubLSymbol $BASIC = makeKeyword("BASIC");

    private static final SubLSymbol TM_SWITCH_TO_BASIC = makeSymbol("TM-SWITCH-TO-BASIC");

    static private final SubLString $$$Choose_Active_Thesaurus = makeString("Choose Active Thesaurus");

    static private final SubLString $str_alt29$tm_basic_choose_thesaurus = makeString("tm-basic-choose-thesaurus");

    static private final SubLString $str_alt30$No_thesauri_are_available_for_bro = makeString("No thesauri are available for browsing.  Please contact your thesaurus administrator.");

    static private final SubLString $str_alt31$Click_on_a_thesaurus_name_to_view = makeString("Click on a thesaurus name to view more information.");

    static private final SubLString $str_alt32$Click_on_a_button_and_then_click_ = makeString("Click on a button and then click ``Choose'' to make that thesaurus active.");

    static private final SubLString $str_alt33$tm_handle_basic_choose_thesaurus = makeString("tm-handle-basic-choose-thesaurus");

    static private final SubLString $$$thesaurus = makeString("thesaurus");

    static private final SubLString $$$Choose = makeString("Choose");

    private static final SubLSymbol TM_BASIC_CHOOSE_THESAURUS = makeSymbol("TM-BASIC-CHOOSE-THESAURUS");

    static private final SubLString $str_alt37$You_must_specify_a_thesaurus_to_m = makeString("You must specify a thesaurus to make active.");

    static private final SubLString $str_alt38$Implementation_error__Could_not_d = makeString("Implementation error: Could not determine a thesaurus ID from ~A");

    static private final SubLString $str_alt39$Implementation_error__Could_not_d = makeString("Implementation error: Could not determine a thesaurus from ~A");

    static private final SubLString $str_alt40$The_Active_Thesaurus_has_been_cha = makeString("The Active Thesaurus has been changed.");

    private static final SubLSymbol TM_HANDLE_BASIC_CHOOSE_THESAURUS = makeSymbol("TM-HANDLE-BASIC-CHOOSE-THESAURUS");

    static private final SubLString $str_alt42$Introducing_the_ = makeString("Introducing the ");

    static private final SubLList $list_alt43 = list(makeString("data"), makeString("thesaurus"));

    static private final SubLString $str_alt44$read_me = makeString("read-me");

    static private final SubLString $$$html = makeString("html");

    static private final SubLString $str_alt47$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol TM_BASIC_READ_ME = makeSymbol("TM-BASIC-READ-ME");

    static private final SubLString $str_alt49$_Atm_basic_multibutton_gif = makeString("~Atm-basic-multibutton.gif");

    static private final SubLString $$$mode = makeString("mode");

    static private final SubLString $$$active = makeString("active");

    static private final SubLList $list_alt52 = list(list(list(ONE_INTEGER, makeInteger(160)), NIL, makeString("active")), list(list(makeInteger(161), makeInteger(290)), NIL, makeString("all")));

    private static final SubLSymbol $USE_IMAGES = makeKeyword("USE-IMAGES");

    static private final SubLString $str_alt55$ = makeString("");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $str_alt57$tm_handle_basic_display_box = makeString("tm-handle-basic-display-box");

    static private final SubLString $str_alt58$Enter_Term_ = makeString("Enter Term:");

    static private final SubLString $$$term = makeString("term");

    static private final SubLString $str_alt60$_Search_Active_Thesaurus_ = makeString("[Search Active Thesaurus]");

    static private final SubLString $$$all = makeString("all");

    static private final SubLString $str_alt62$_Search_All_Thesauri_ = makeString("[Search All Thesauri]");

    static private final SubLString $$$Show = makeString("Show");

    static private final SubLString $str_alt64$No_thesauri_are_available_for_you = makeString("No thesauri are available for you to browse.  Please contact your thesaurus administrator.");

    static private final SubLString $str_alt65$You_must_choose_All_Thesauri_or_A = makeString("You must choose All Thesauri or Active Thesaurus for your search.");

    static private final SubLString $str_alt66$No_thesaurus_is_currently_active_ = makeString("No thesaurus is currently active.  Please click on Change Thesaurus to select an active thesaurus.");

    static private final SubLString $str_alt68$No_term_was_specified_for_display = makeString("No term was specified for display; click on one of the following top terms to browse the hierarchy.");

    private static final SubLSymbol SIGN_CONCEPT = makeSymbol("SIGN-CONCEPT");

    private static final SubLSymbol TM_HANDLE_BASIC_DISPLAY_BOX = makeSymbol("TM-HANDLE-BASIC-DISPLAY-BOX");

    static private final SubLString $$$Choose_Term = makeString("Choose Term");

    static private final SubLString $str_alt72$tm_basic_choose_constant = makeString("tm-basic-choose-constant");

    static private final SubLString $str_alt73$_matches_these_terms_ = makeString(" matches these terms:");

    static private final SubLString $str_alt75$tm_basic_choose_all_constant = makeString("tm-basic-choose-all-constant");

    static private final SubLString $str_alt76$Terms_from_ = makeString("Terms from ");

    static private final SubLString $str_alt77$_ = makeString(":");

    private static final SubLSymbol TM_STRING_FOR_SORTING_SEARCH_RESULTS = makeSymbol("TM-STRING-FOR-SORTING-SEARCH-RESULTS");

    private static final SubLSymbol $SWITCH_HIERARCHICAL = makeKeyword("SWITCH-HIERARCHICAL");

    static private final SubLString $str_alt81$_ = makeString("(");

    static private final SubLString $str_alt82$_ = makeString(")");

    static private final SubLString $$$Major_Categories = makeString("Major Categories");

    static private final SubLString $str_alt84$tm_basic_show_thesaurus_tops = makeString("tm-basic-show-thesaurus-tops");

    static private final SubLString $str_alt85$Major_Categories_of__a = makeString("Major Categories of ~a");

    static private final SubLString $str_alt86$No_Major_Categories_for__a = makeString("No Major Categories for ~a");

    static private final SubLString $str_alt87$Information_about_the_thesaurus__ = makeString("Information about the thesaurus: ");

    static private final SubLString $str_alt88$Abbreviation_ = makeString("Abbreviation:");

    static private final SubLString $str_alt89$Created_by_ = makeString("Created by:");

    static private final SubLString $str_alt90$Creation_time_ = makeString("Creation time:");

    static private final SubLString $str_alt91$Loaded_by_ = makeString("Loaded by:");

    static private final SubLString $str_alt92$Load_time_ = makeString("Load time:");

    static private final SubLString $str_alt93$Comment_ = makeString("Comment:");

    static private final SubLString $str_alt94$_a_known_Major_Categor_a_in_the_t = makeString("~a known Major Categor~a in the thesaurus: ");

    static private final SubLString $$$y = makeString("y");

    static private final SubLString $$$ies = makeString("ies");

    private static final SubLSymbol $GRAPH_PATHS = makeKeyword("GRAPH-PATHS");

    private static final SubLSymbol $BG_COLOR_HIERARCHICAL = makeKeyword("BG-COLOR-HIERARCHICAL");

    static private final SubLString $str_alt99$Hierarchical_display_of___a_ = makeString("Hierarchical display of `~a'");

    static private final SubLString $str_alt100$tm_basic_print_nodes = makeString("tm-basic-print-nodes");

    static private final SubLString $str_alt101$Major_Categories_ = makeString("Major Categories:");

    private static final SubLSymbol $DISPLAY_FILTER = makeKeyword("DISPLAY-FILTER");

    private static final SubLSymbol $EDITING_ENABLED = makeKeyword("EDITING-ENABLED");

    static private final SubLString $$$BT = makeString("BT");

    public static final SubLObject $$broaderTerm = constant_handles.reader_make_constant_shell(makeString("broaderTerm"));

    static private final SubLString $str_alt110$_as_a = makeString("~as~a");

    private static final SubLSymbol $EXPAND_PARENT_PATHS = makeKeyword("EXPAND-PARENT-PATHS");

    static private final SubLString $str_alt112$__compressed_display__ = makeString(" (compressed display):");

    static private final SubLString $str_alt113$No__as = makeString("No ~as");

    static private final SubLList $list_alt115 = list(makeString("LT"), makeString("NT"), makeString("BT"));

    static private final SubLString $str_alt116$__ = makeString(" :");

    static private final SubLString $str_alt117$Term_ = makeString("Term:");

    static private final SubLString $str_alt118$____Entering__s = makeString("~%~%Entering ~s");

    private static final SubLSymbol TM_BASIC_PRINT_NODES_2 = makeSymbol("TM-BASIC-PRINT-NODES-2");

    static private final SubLString $str_alt120$___________Term___s = makeString("~%         Term: ~s");

    static private final SubLString $str_alt121$______Max_depth___s = makeString("~%    Max depth: ~s");

    static private final SubLString $str_alt122$__Current_depth___s = makeString("~%Current depth: ~s");

    static private final SubLString $str_alt123$_____Next_nodes___s = makeString("~%   Next nodes: ~s");

    static private final SubLString $str_alt124$____ = makeString(" ...");

    static private final SubLString $str_alt125$____Sorting_nodes_____ = makeString("~%~%Sorting nodes ... ");

    private static final SubLSymbol TM_STRING_FOR_CONSTANT = makeSymbol("TM-STRING-FOR-CONSTANT");

    static private final SubLString $str_alt127$done_ = makeString("done.");

    static private final SubLString $$$NT = makeString("NT");

    static private final SubLString $str_alt129$____Now_inside_scope_of__s____ = makeString("~%~%Now inside scope of ~s ...");

    private static final SubLSymbol TM_BASIC_DISPLAY_DESCENDANTS = makeSymbol("TM-BASIC-DISPLAY-DESCENDANTS");

    static private final SubLString $str_alt131$____Term___s = makeString("~%~%Term: ~s");

    static private final SubLString $str_alt132$____Next_nodes___s = makeString("~%~%Next nodes: ~s");

    private static final SubLSymbol PREFERRED_TERMS = makeSymbol("PREFERRED-TERMS");

    public static final SubLSymbol $kw134$DETAILS_SHOWN_ = makeKeyword("DETAILS-SHOWN?");

    static private final SubLString $str_alt135$_as_ = makeString("~as:");

    private static final SubLSymbol $DEPTH_SPACING = makeKeyword("DEPTH-SPACING");

    private static final SubLSymbol $COMPUTED_MAX_DEPTH = makeKeyword("COMPUTED-MAX-DEPTH");

    public static final SubLInteger $int$50 = makeInteger(50);

    // // Initializers
    @Override
    public void declareFunctions() {
	declare_html_basic_thesaurus_file();
    }

    @Override
    public void initializeVariables() {
	init_html_basic_thesaurus_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_html_basic_thesaurus_file();
    }
}
