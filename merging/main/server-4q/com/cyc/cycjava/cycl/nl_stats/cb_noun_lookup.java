/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.nl_stats;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.cb_frames;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
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
 *  module:      CB-NOUN-LOOKUP
 *  source file: /cyc/top/cycl/nl-stats/cb-noun-lookup.lisp
 *  created:     2019/07/03 17:39:02
 */
public final class cb_noun_lookup extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_noun_lookup() {
    }

    public static final SubLFile me = new cb_noun_lookup();

    public static final String myName = "com.cyc.cycjava.cycl.nl_stats.cb_noun_lookup";

    // // Definitions
    public static final SubLObject cb_link_noun_lookup(SubLObject linktext) {
	if (linktext == UNPROVIDED) {
	    linktext = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == linktext) {
		linktext = $$$NounLookup;
	    }
	    {
		SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
		html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		cb_parameters.cyc_cgi_url_int();
		html_utilities.html_princ($str_alt2$cb_noun_lookup);
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

    public static final SubLObject cb_noun_lookup(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject title_var = $$$Noun_Lookup_Tool;
		{
		    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
		    try {
			html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread)))
				: integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
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
				    html_utilities.html_markup($str_alt11$yui_skin_sam);
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
						    html_utilities.html_hidden_input($str_alt2$cb_noun_lookup, T, UNPROVIDED);
						    html_utilities.html_newline(UNPROVIDED);
						    html_utilities.html_submit_input($$$Lookup, UNPROVIDED, UNPROVIDED);
						    html_utilities.html_newline(TWO_INTEGER);
						    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
						    html_utilities.html_princ($str_alt13$Noun__);
						    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						    html_utilities.html_princ($str_alt14$_Get_KB_meanings_and_Noun_Learner);
						    html_utilities.html_newline(UNPROVIDED);
						    html_script_utilities.html_clear_input_button($$$noun, UNPROVIDED);
						    html_utilities.html_text_input($$$noun, $str_alt16$, $int$40);
						    html_utilities.html_princ($str_alt18$__Number_of_conjectures__max__20_);
						    html_utilities.html_text_input($$$conjectures, $$$5, THREE_INTEGER);
						    html_utilities.html_newline(TWO_INTEGER);
						    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
						    html_utilities.html_princ($str_alt21$Verb__);
						    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						    html_utilities.html_princ($str_alt22$_Get_the_inferred_typical_subject);
						    html_utilities.html_newline(UNPROVIDED);
						    html_script_utilities.html_clear_input_button($$$verb, UNPROVIDED);
						    html_utilities.html_text_input($$$verb, $str_alt16$, TWENTY_INTEGER);
						    html_utilities.html_newline(UNPROVIDED);
						    html_utilities.html_newline(UNPROVIDED);
						    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
						    html_utilities.html_princ($str_alt24$Are_);
						    html_utilities.html_text_input($$$rel1, $str_alt16$, TWENTY_INTEGER);
						    html_utilities.html_princ($str_alt26$_and_);
						    html_utilities.html_text_input($$$rel2, $str_alt16$, TWENTY_INTEGER);
						    html_utilities.html_princ($str_alt28$_related_via_a_genls_or_isa_relat);
						    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						    if (NIL != args) {
							html_utilities.html_br();
							html_utilities.html_newline(UNPROVIDED);
							{
							    SubLObject noun = html_utilities.html_extract_input($$$noun, args);
							    SubLObject number_of_conjectures = string_utilities.string_to_integer(html_utilities.html_extract_input($$$conjectures, args));
							    SubLObject verb = html_utilities.html_extract_input($$$verb, args);
							    SubLObject noun_denots = cb_frames.terms_for_browsing(noun, UNPROVIDED, UNPROVIDED);
							    SubLObject noun_conjectures = verb_argument_lookups.noun_conjectures(noun, NIL != number_of_conjectures ? ((SubLObject) (number_of_conjectures)) : FIVE_INTEGER);
							    SubLObject typical_subject = verb_argument_lookups.typical_subject(verb, UNPROVIDED);
							    SubLObject typical_object = verb_argument_lookups.typical_object(verb, UNPROVIDED);
							    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
							    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
							    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
							    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							    html_utilities.html_char(CHAR_greater, UNPROVIDED);
							    {
								SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
								SubLObject _prev_bind_1_5 = html_macros.$within_html_form$.currentBinding(thread);
								SubLObject _prev_bind_2_6 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
								try {
								    html_macros.$html_safe_print$.bind(T, thread);
								    html_macros.$within_html_form$.bind(T, thread);
								    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
								    html_utilities.html_newline(UNPROVIDED);
								    if (NIL != string_utilities.non_empty_stringP(noun)) {
									html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
									if (true) {
									    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
									    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
									    html_utilities.html_markup(ONE_INTEGER);
									    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
									}
									html_utilities.html_char(CHAR_greater, UNPROVIDED);
									{
									    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
									    try {
										html_macros.$html_safe_print$.bind(T, thread);
										html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
										html_utilities.html_char(CHAR_greater, UNPROVIDED);
										{
										    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
										    try {
											html_macros.$html_safe_print$.bind(T, thread);
											html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
											html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												html_utilities.html_princ($$$KB_lookup);
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
											html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												html_utilities.html_princ($str_alt30$Noun_Learner_ranked_conjectured_t);
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
										    } finally {
											html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
										    }
										}
										html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
										html_utilities.html_source_readability_terpri(UNPROVIDED);
										html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
										html_utilities.html_char(CHAR_greater, UNPROVIDED);
										{
										    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
										    try {
											html_macros.$html_safe_print$.bind(T, thread);
											html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt31$_S, noun);
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
											html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												if (NIL != list_utilities.empty_list_p(noun_denots)) {
												    html_utilities.html_princ($$$None);
												} else {
												    {
													SubLObject cdolist_list_var = noun_denots;
													SubLObject denot = NIL;
													for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), denot = cdolist_list_var.first()) {
													    cb_utilities.cb_form(denot, UNPROVIDED, UNPROVIDED);
													    html_utilities.html_newline(UNPROVIDED);
													}
												    }
												}
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
											html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												if (NIL != list_utilities.proper_list_p(noun_conjectures)) {
												    {
													SubLObject cdolist_list_var = noun_conjectures;
													SubLObject conjecture = NIL;
													for (conjecture = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), conjecture = cdolist_list_var.first()) {
													    if (NIL != forts.valid_fortP(conjecture)) {
														cb_utilities.cb_form(conjecture, UNPROVIDED, UNPROVIDED);
														html_utilities.html_newline(UNPROVIDED);
													    }
													}
												    }
												} else {
												    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$None___Please_try_entering_the_ve, noun);
												}
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
										    } finally {
											html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
										    }
										}
										html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
										html_utilities.html_source_readability_terpri(UNPROVIDED);
									    } finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
									    }
									}
									html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
									html_utilities.html_newline(UNPROVIDED);
								    }
								    if (NIL != string_utilities.non_empty_stringP(verb)) {
									html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
									format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt34$Typical_subject_for__S, verb);
									html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
									html_utilities.html_newline(UNPROVIDED);
									if (NIL != typical_subject) {
									    {
										SubLObject cdolist_list_var = typical_subject;
										SubLObject subject = NIL;
										for (subject = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), subject = cdolist_list_var.first()) {
										    if (NIL != forts.valid_fortP(subject)) {
											cb_utilities.cb_form(subject, UNPROVIDED, UNPROVIDED);
											html_utilities.html_newline(UNPROVIDED);
										    }
										}
									    }
									} else {
									    html_utilities.html_princ($$$unknown);
									    html_utilities.html_newline(UNPROVIDED);
									}
									html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
									format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt36$Typical_object_for__S, verb);
									html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
									html_utilities.html_newline(UNPROVIDED);
									if (NIL != typical_object) {
									    {
										SubLObject cdolist_list_var = typical_object;
										SubLObject v_object = NIL;
										for (v_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_object = cdolist_list_var.first()) {
										    if (NIL != forts.valid_fortP(v_object)) {
											cb_utilities.cb_form(v_object, UNPROVIDED, UNPROVIDED);
											html_utilities.html_newline(UNPROVIDED);
										    }
										}
									    }
									} else {
									    html_utilities.html_princ($$$unknown);
									    html_utilities.html_newline(UNPROVIDED);
									}
								    }
								    html_utilities.html_newline(UNPROVIDED);
								    {
									SubLObject rel1 = html_utilities.html_extract_input($$$rel1, args);
									SubLObject rel2 = html_utilities.html_extract_input($$$rel2, args);
									if ((NIL != string_utilities.non_empty_stringP(rel1)) && (NIL != string_utilities.non_empty_stringP(rel2))) {
									    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
									    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt37$Taxonomic_relations_between__S_an, rel1, rel2);
									    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
									    html_utilities.html_newline(UNPROVIDED);
									    {
										SubLObject rel1_denots = cb_frames.terms_for_browsing(rel1, UNPROVIDED, UNPROVIDED);
										SubLObject rel2_denots = cb_frames.terms_for_browsing(rel2, UNPROVIDED, UNPROVIDED);
										if (NIL != list_utilities.empty_list_p(rel1_denots)) {
										    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt38$Unable_to_locate_any_meanings_for, rel1);
										    html_utilities.html_newline(UNPROVIDED);
										}
										if (NIL != list_utilities.empty_list_p(rel2_denots)) {
										    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt38$Unable_to_locate_any_meanings_for, rel2);
										    html_utilities.html_newline(UNPROVIDED);
										}
										if ((NIL != rel1_denots) && (NIL != rel2_denots)) {
										    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
										    if (true) {
											html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
											html_utilities.html_char(CHAR_quotation, UNPROVIDED);
											html_utilities.html_markup(ONE_INTEGER);
											html_utilities.html_char(CHAR_quotation, UNPROVIDED);
										    }
										    html_utilities.html_char(CHAR_greater, UNPROVIDED);
										    {
											SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
											try {
											    html_macros.$html_safe_print$.bind(T, thread);
											    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
											    html_utilities.html_char(CHAR_greater, UNPROVIDED);
											    {
												SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
												try {
												    html_macros.$html_safe_print$.bind(T, thread);
												    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
												    html_utilities.html_char(CHAR_greater, UNPROVIDED);
												    {
													SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
													try {
													    html_macros.$html_safe_print$.bind(T, thread);
													} finally {
													    html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
													}
												    }
												    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
												    {
													SubLObject cdolist_list_var = rel2_denots;
													SubLObject rel2_denot = NIL;
													for (rel2_denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rel2_denot = cdolist_list_var.first()) {
													    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
													    html_utilities.html_char(CHAR_greater, UNPROVIDED);
													    {
														SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
														try {
														    html_macros.$html_safe_print$.bind(T, thread);
														    cb_utilities.cb_form(rel2_denot, UNPROVIDED, UNPROVIDED);
														} finally {
														    html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
														}
													    }
													    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
													}
												    }
												} finally {
												    html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
												}
											    }
											    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
											    html_utilities.html_source_readability_terpri(UNPROVIDED);
											    {
												SubLObject cdolist_list_var = rel1_denots;
												SubLObject rel1_denot = NIL;
												for (rel1_denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rel1_denot = cdolist_list_var.first()) {
												    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
												    html_utilities.html_char(CHAR_greater, UNPROVIDED);
												    {
													SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
													try {
													    html_macros.$html_safe_print$.bind(T, thread);
													    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
													    html_utilities.html_char(CHAR_greater, UNPROVIDED);
													    {
														SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
														try {
														    html_macros.$html_safe_print$.bind(T, thread);
														    cb_utilities.cb_form(rel1_denot, UNPROVIDED, UNPROVIDED);
														} finally {
														    html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
														}
													    }
													    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
													    {
														SubLObject cdolist_list_var_22 = rel2_denots;
														SubLObject rel2_denot = NIL;
														for (rel2_denot = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest(), rel2_denot = cdolist_list_var_22.first()) {
														    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
														    html_utilities.html_char(CHAR_greater, UNPROVIDED);
														    {
															SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
															try {
															    html_macros.$html_safe_print$.bind(T, thread);
															    {
																SubLObject datum = taxonomic_relation(rel1_denot, rel2_denot);
																SubLObject current = datum;
																SubLObject pred = NIL;
																SubLObject specific = NIL;
																SubLObject general = NIL;
																destructuring_bind_must_consp(current, datum, $list_alt39);
																pred = current.first();
																current = current.rest();
																destructuring_bind_must_consp(current, datum, $list_alt39);
																specific = current.first();
																current = current.rest();
																destructuring_bind_must_consp(current, datum, $list_alt39);
																general = current.first();
																current = current.rest();
																if (NIL == current) {
																    if (NIL != pred) {
																	cb_utilities.cb_form(specific, UNPROVIDED, UNPROVIDED);
																	html_utilities.html_princ(pred_to_pred_string(pred));
																	cb_utilities.cb_form(general, UNPROVIDED, UNPROVIDED);
																	html_utilities.html_newline(UNPROVIDED);
																	cb_utilities.cb_form(el_utilities.make_el_formula(pred, list(specific, general), UNPROVIDED), UNPROVIDED, UNPROVIDED);
																    }
																} else {
																    cdestructuring_bind_error(datum, $list_alt39);
																}
															    }
															} finally {
															    html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
															}
														    }
														    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
														}
													    }
													} finally {
													    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
													}
												    }
												    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
												    html_utilities.html_source_readability_terpri(UNPROVIDED);
												}
											    }
											} finally {
											    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
											}
										    }
										    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
										}
									    }
									}
								    }
								    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
								} finally {
								    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2_6, thread);
								    html_macros.$within_html_form$.rebind(_prev_bind_1_5, thread);
								    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
								}
							    }
							    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
							}
						    }
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

    public static final SubLObject taxonomic_relation(SubLObject term1, SubLObject term2) {
	if (term1 == term2) {
	    return list($$equals, term1, term2);
	}
	if (NIL != genls.genl_in_any_mtP(term1, term2)) {
	    return list($$genls, term1, term2);
	}
	if (NIL != genls.genl_in_any_mtP(term2, term1)) {
	    return list($$genls, term2, term1);
	}
	if (NIL != isa.isa_in_any_mtP(term1, term2)) {
	    return list($$isa, term1, term2);
	}
	if (NIL != isa.isa_in_any_mtP(term2, term1)) {
	    return list($$isa, term2, term1);
	}
	return list(NIL, term1, term2);
    }

    public static final SubLObject pred_to_pred_string(SubLObject pred) {
	{
	    SubLObject pcase_var = pred;
	    if (pcase_var.eql($$equals)) {
		return $str_alt44$_equals_;
	    } else if (pcase_var.eql($$genls)) {
		return $str_alt45$_is_a_specialization_of_;
	    } else if (pcase_var.eql($$isa)) {
		return $str_alt46$_is_an_instance_of_;
	    } else if (pcase_var.eql(NIL)) {
		return $str_alt47$_is_not_taxonomically_related_to_;
	    } else {
		return NIL;
	    }

	}
    }

    public static final SubLObject declare_cb_noun_lookup_file() {
	declareFunction("cb_link_noun_lookup", "CB-LINK-NOUN-LOOKUP", 0, 1, false);
	declareFunction("cb_noun_lookup", "CB-NOUN-LOOKUP", 0, 1, false);
	declareFunction("taxonomic_relation", "TAXONOMIC-RELATION", 2, 0, false);
	declareFunction("pred_to_pred_string", "PRED-TO-PRED-STRING", 1, 0, false);
	return NIL;
    }

    public static final SubLObject init_cb_noun_lookup_file() {
	return NIL;
    }

    public static final SubLObject setup_cb_noun_lookup_file() {
	cb_utilities.setup_cb_link_method($NOUN_LOOKUP, CB_LINK_NOUN_LOOKUP, ONE_INTEGER);
	cb_utilities.declare_cb_tool($NOUN_LOOKUP, $$$Noun_Lookup, $$$NnLkup, $str_alt7$Noun_lookup_interface_for_StreamS);
	html_macros.note_html_handler_function(CB_NOUN_LOOKUP);
	return NIL;
    }

    // // Internal Constants
    static private final SubLString $$$NounLookup = makeString("NounLookup");

    static private final SubLString $str_alt2$cb_noun_lookup = makeString("cb-noun-lookup");

    private static final SubLSymbol $NOUN_LOOKUP = makeKeyword("NOUN-LOOKUP");

    private static final SubLSymbol CB_LINK_NOUN_LOOKUP = makeSymbol("CB-LINK-NOUN-LOOKUP");

    static private final SubLString $$$Noun_Lookup = makeString("Noun Lookup");

    static private final SubLString $$$NnLkup = makeString("NnLkup");

    static private final SubLString $str_alt7$Noun_lookup_interface_for_StreamS = makeString("Noun lookup interface for StreamSage");

    static private final SubLString $$$Noun_Lookup_Tool = makeString("Noun Lookup Tool");

    static private final SubLString $str_alt10$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt11$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $$$Lookup = makeString("Lookup");

    static private final SubLString $str_alt13$Noun__ = makeString("Noun: ");

    static private final SubLString $str_alt14$_Get_KB_meanings_and_Noun_Learner = makeString("(Get KB meanings and Noun Learner conjectures)");

    static private final SubLString $$$noun = makeString("noun");

    static private final SubLString $str_alt16$ = makeString("");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $str_alt18$__Number_of_conjectures__max__20_ = makeString("  Number of conjectures (max. 20): ");

    static private final SubLString $$$conjectures = makeString("conjectures");

    static private final SubLString $$$5 = makeString("5");

    static private final SubLString $str_alt21$Verb__ = makeString("Verb: ");

    static private final SubLString $str_alt22$_Get_the_inferred_typical_subject = makeString("(Get the inferred typical subject and object)");

    static private final SubLString $$$verb = makeString("verb");

    static private final SubLString $str_alt24$Are_ = makeString("Are ");

    static private final SubLString $$$rel1 = makeString("rel1");

    static private final SubLString $str_alt26$_and_ = makeString(" and ");

    static private final SubLString $$$rel2 = makeString("rel2");

    static private final SubLString $str_alt28$_related_via_a_genls_or_isa_relat = makeString(" related via a genls or isa relationship?");

    static private final SubLString $$$KB_lookup = makeString("KB lookup");

    static private final SubLString $str_alt30$Noun_Learner_ranked_conjectured_t = makeString("Noun Learner ranked conjectured types");

    static private final SubLString $str_alt31$_S = makeString("~S");

    static private final SubLString $$$None = makeString("None");

    static private final SubLString $str_alt33$None___Please_try_entering_the_ve = makeString("None.  Please try entering the verb that ~S occurred with.");

    static private final SubLString $str_alt34$Typical_subject_for__S = makeString("Typical subject for ~S");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $str_alt36$Typical_object_for__S = makeString("Typical object for ~S");

    static private final SubLString $str_alt37$Taxonomic_relations_between__S_an = makeString("Taxonomic relations between ~S and ~S:");

    static private final SubLString $str_alt38$Unable_to_locate_any_meanings_for = makeString("Unable to locate any meanings for ~S in the KB");

    static private final SubLList $list_alt39 = list(makeSymbol("PRED"), makeSymbol("SPECIFIC"), makeSymbol("GENERAL"));

    private static final SubLSymbol CB_NOUN_LOOKUP = makeSymbol("CB-NOUN-LOOKUP");

    public static final SubLObject $$equals = constant_handles.reader_make_constant_shell(makeString("equals"));

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLString $str_alt44$_equals_ = makeString(" equals ");

    static private final SubLString $str_alt45$_is_a_specialization_of_ = makeString(" is a specialization of ");

    static private final SubLString $str_alt46$_is_an_instance_of_ = makeString(" is an instance of ");

    static private final SubLString $str_alt47$_is_not_taxonomically_related_to_ = makeString(" is not taxonomically related to ");

    // // Initializers
    @Override
    public void declareFunctions() {
	declare_cb_noun_lookup_file();
    }

    @Override
    public void initializeVariables() {
	init_cb_noun_lookup_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_cb_noun_lookup_file();
    }
}
