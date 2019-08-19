package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cb_assertion_browser;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class cb_show_consequences extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.cb_show_consequences";
	public static String myFingerPrint = "554e1a12a942f08d937484f458a68142c1d93bd4271899122baa9eaae89ad45f";
	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 800L)
	public static SubLSymbol $cb_show_consequences_link_enabledP$;
	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 900L)
	public static SubLSymbol $cb_show_consequences_mt$;
	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 900L)
	private static SubLSymbol $cb_show_consequences_max_time$;
	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 2700L)
	private static SubLSymbol $show_consequences_rules_from_mt_caching_state$;
	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 3000L)
	private static SubLSymbol $biology_practice_rules_caching_state$;
	private static SubLObject $const0$BiologyMt;
	private static SubLInteger $int1$30;
	private static SubLSymbol $kw$ALL;
	private static SubLString $str3$_Show_Consequences_;
	private static SubLSymbol $kw$SELF;
	private static SubLString $str5$cb_show_consequences__a__a;
	private static SubLSymbol $kw$SHOW_CONSEQUENCES;
	private static SubLSymbol $sym7$CB_LINK_SHOW_CONSEQUENCES;
	private static SubLList $list8;
	private static SubLString $str9$Show_Consequences;
	private static SubLString $str10$__DOCTYPE_html_PUBLIC_____W3C__DT;
	private static SubLString $str11$_meta_http_equiv__X_UA_Compatible;
	private static SubLSymbol $kw$UNINITIALIZED;
	private static SubLSymbol $kw$CB_CYC;
	private static SubLSymbol $kw$SAM_AUTOCOMPLETE_CSS;
	private static SubLSymbol $kw$SHA1;
	private static SubLString $str16$yui_skin_sam;
	private static SubLString $str17$reloadFrameButton;
	private static SubLString $str18$button;
	private static SubLString $str19$reload;
	private static SubLString $str20$Refresh_Frames;
	private static SubLString $str21$Generating_consequences_of_;
	private static SubLString $str22$__considering__a_rules___;
	private static SubLString $str23$all;
	private static SubLObject $const24$InferencePSC;
	private static SubLSymbol $kw$MAX_TIME;
	private static SubLString $str26$Timed_out_after__a_second_P_;
	private static SubLSymbol $sym27$CB_SHOW_CONSEQUENCES;
	private static SubLSymbol $kw$HTML_HANDLER;
	private static SubLList $list29;
	private static SubLString $str30$In_Mt__;
	private static SubLSymbol $kw$SENTENCE_QUERY_SIMILAR;
	private static SubLString $str32$_Query_;
	private static SubLString $str33$Justification_;
	private static SubLSymbol $sym34$SHOW_CONSEQUENCES_RULES_FROM_MT;
	private static SubLSymbol $sym35$HLMT_P;
	private static SubLSymbol $kw$MT;
	private static SubLSymbol $kw$BROAD_MT;
	private static SubLString $str38$do_broad_mt_index;
	private static SubLSymbol $sym39$STRINGP;
	private static SubLSymbol $kw$SKIP;
	private static SubLSymbol $sym41$_SHOW_CONSEQUENCES_RULES_FROM_MT_CACHING_STATE_;
	private static SubLSymbol $sym42$BIOLOGY_PRACTICE_RULES;
	private static SubLSymbol $sym43$RELEVANT_MT_IS_EVERYTHING;
	private static SubLObject $const44$EverythingPSC;
	private static SubLObject $const45$queryPracticeRules;
	private static SubLSymbol $kw$GAF;
	private static SubLObject $const47$CytologicalProcessProjectKBConten;
	private static SubLSymbol $sym48$_BIOLOGY_PRACTICE_RULES_CACHING_STATE_;

	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 1000L)
	public static SubLObject cb_link_show_consequences(SubLObject gaf, SubLObject rules, SubLObject linktext) {
		if (rules == UNPROVIDED) {
			rules = $kw$ALL;
		}
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == linktext) {
			linktext = $str3$_Show_Consequences_;
		}
		SubLObject frame_name_var = cb_utilities.cb_frame_name($kw$SELF);
		html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
		cb_parameters.cyc_cgi_url_int();
		PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str5$cb_show_consequences__a__a,
				assertion_handles.assertion_id(gaf), cb_parameters.cb_glob_id(rules));
		html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
			html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
			html_utilities.html_markup(frame_name_var);
			html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
		}
		html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_utilities.html_princ(linktext);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return gaf;
	}

	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 1300L)
	public static SubLObject cb_show_consequences(SubLObject args) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject assertion_id = NIL;
		SubLObject rules_id = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(args, args, $list8);
		assertion_id = args.first();
		SubLObject current = args.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, args, $list8);
		rules_id = current.first();
		current = current.rest();
		if (NIL == current) {
			SubLObject gaf = cb_utilities.cb_guess_assertion(assertion_id);
			SubLObject rules = cb_parameters.cb_glob_lookup_by_string(rules_id);
			SubLObject title_var = $str9$Show_Consequences;
			SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
			try {
				html_macros.$html_id_space_id_generator$.bind((NIL != integer_sequence_generator
						.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)))
								? html_macros.$html_id_space_id_generator$.getDynamicValue(thread)
								: integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED,
										UNPROVIDED),
						thread);
				html_utilities.html_markup($str10$__DOCTYPE_html_PUBLIC_____W3C__DT);
				if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
					html_utilities.html_source_readability_terpri(UNPROVIDED);
					html_utilities.html_markup($str11$_meta_http_equiv__X_UA_Compatible);
				}
				html_utilities.html_source_readability_terpri(UNPROVIDED);
				SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$
						.currentBinding(thread);
				try {
					cyc_file_dependencies.$html_emitted_file_dependencies$
							.bind((cyc_file_dependencies.$html_emitted_file_dependencies$
									.getDynamicValue(thread) == $kw$UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY)
											: cyc_file_dependencies.$html_emitted_file_dependencies$
													.getDynamicValue(thread),
									thread);
					html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
					html_macros.html_head_content_type();
					cb_parameters.cb_head_shortcut_icon();
					html_utilities.html_meta_robot_instructions(
							cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread),
							cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
					cyc_file_dependencies.css($kw$CB_CYC);
					dhtml_macros.html_basic_cb_scripts();
					if (NIL != title_var) {
						html_utilities.html_source_readability_terpri(UNPROVIDED);
						html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
						html_utilities.html_princ(title_var);
						html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
					}
					html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
					html_utilities.html_source_readability_terpri(UNPROVIDED);
					SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
					try {
						html_macros.$html_inside_bodyP$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
						if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
							html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
							html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup(html_utilities
									.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
							html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
						html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup($str16$yui_skin_sam);
						html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
						html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
						SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
							html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
							html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup($str17$reloadFrameButton);
							html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
							html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
							SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
								html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
								html_utilities.html_markup($str18$button);
								html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
								html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
								html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
								html_utilities.html_markup($str19$reload);
								html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
								html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
								html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
								html_utilities.html_princ($str20$Refresh_Frames);
								html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
								if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
									html_utilities
											.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
								}
								html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
							}
							html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
							if (NIL != title_var) {
								html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
								html_utilities.html_markup(TWO_INTEGER);
								html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
								html_utilities.html_princ(title_var);
								html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
								html_utilities.html_markup(TWO_INTEGER);
								html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
							}
							html_utilities.html_princ($str21$Generating_consequences_of_);
							cb_utilities.cb_form(gaf, UNPROVIDED, UNPROVIDED);
							PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread),
									$str22$__considering__a_rules___,
									($kw$ALL == rules) ? $str23$all : Sequences.length(rules));
							html_utilities.html_newline(UNPROVIDED);
							streams_high.force_output(html_macros.$html_stream$.getDynamicValue(thread));
							html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
							thread.resetMultipleValues();
							SubLObject queryables = forward_propagate_assertions.generate_consequences(gaf, rules,
									$const24$InferencePSC, $cb_show_consequences_max_time$.getDynamicValue(thread));
							SubLObject halt_reason = thread.secondMultipleValue();
							thread.resetMultipleValues();
							if ($kw$MAX_TIME == halt_reason) {
								PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread),
										$str26$Timed_out_after__a_second_P_,
										$cb_show_consequences_max_time$.getDynamicValue(thread),
										$cb_show_consequences_max_time$.getDynamicValue(thread));
							} else {
								SubLObject cdolist_list_var = queryables;
								SubLObject queryable = NIL;
								queryable = cdolist_list_var.first();
								while (NIL != cdolist_list_var) {
									cb_display_consequence(queryable);
									html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
									cdolist_list_var = cdolist_list_var.rest();
									queryable = cdolist_list_var.first();
								}
							}
							html_utilities.html_source_readability_terpri(UNPROVIDED);
							html_utilities.html_copyright_notice();
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
						}
						html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
						html_utilities.html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
					}
					html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
				} finally {
					cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
				}
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind.cdestructuring_bind_error(args, $list8);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 2100L)
	public static SubLObject cb_display_consequence(SubLObject queryable) {
		SubLObject query_el_formula = NIL;
		SubLObject mt = NIL;
		SubLObject justification = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(queryable, queryable, $list29);
		query_el_formula = queryable.first();
		SubLObject current = queryable.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, queryable, $list29);
		mt = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, queryable, $list29);
		justification = current.first();
		current = current.rest();
		if (NIL == current) {
			html_utilities.html_princ_strong($str30$In_Mt__);
			cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
			html_utilities.html_newline(ONE_INTEGER);
			SubLObject ist_sentence = el_utilities.make_ist_sentence(mt, query_el_formula);
			html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
			cb_utilities.cb_link($kw$SENTENCE_QUERY_SIMILAR, ist_sentence, $str32$_Query_, UNPROVIDED, UNPROVIDED,
					UNPROVIDED);
			html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			html_utilities.html_indent(UNPROVIDED);
			cb_utilities.cb_form(query_el_formula, UNPROVIDED, UNPROVIDED);
			html_utilities.html_newline(TWO_INTEGER);
			html_utilities.html_princ_strong($str33$Justification_);
			html_utilities.html_newline(UNPROVIDED);
			cb_assertion_browser.cb_show_justification_readably(justification, UNPROVIDED);
		} else {
			cdestructuring_bind.cdestructuring_bind_error(queryable, $list29);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 2700L)
	public static SubLObject clear_show_consequences_rules_from_mt() {
		SubLObject cs = $show_consequences_rules_from_mt_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 2700L)
	public static SubLObject remove_show_consequences_rules_from_mt(SubLObject mt) {
		return memoization_state.caching_state_remove_function_results_with_args(
				$show_consequences_rules_from_mt_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 2700L)
	public static SubLObject show_consequences_rules_from_mt_internal(SubLObject mt) {
		SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != hlmt.hlmt_p(mt) : mt;
		SubLObject rule_set = set.new_set(Symbols.symbol_function(EQL), UNPROVIDED);
		SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
		if (pcase_var.eql($kw$MT)) {
			if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
				SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
				SubLObject final_index_iterator = NIL;
				try {
					final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
					SubLObject done_var = NIL;
					SubLObject token_var = NIL;
					while (NIL == done_var) {
						SubLObject assertion = iteration
								.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
						SubLObject valid = makeBoolean(!token_var.eql(assertion));
						if ((NIL != valid) && (NIL != assertions_high.rule_assertionP(assertion))) {
							set.set_add(assertion, rule_set);
						}
						done_var = makeBoolean(NIL == valid);
					}
				} finally {
					SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						Threads.$is_thread_performing_cleanupP$.bind(T, thread);
						SubLObject _values = Values.getValuesAsVector();
						if (NIL != final_index_iterator) {
							kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
						}
						Values.restoreValuesFromVector(_values);
					} finally {
						Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
					}
				}
			}
		} else if (pcase_var.eql($kw$BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL))) {
			SubLObject idx = assertion_handles.do_assertions_table();
			SubLObject mess = $str38$do_broad_mt_index;
			SubLObject total = id_index.id_index_count(idx);
			SubLObject sofar = ZERO_INTEGER;
			assert NIL != Types.stringp(mess) : mess;
			SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
			SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
			SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
			SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
			try {
				utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
				utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
				utilities_macros.$within_noting_percent_progress$.bind(T, thread);
				utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
				try {
					utilities_macros.noting_percent_progress_preamble(mess);
					SubLObject idx_$5 = idx;
					if (NIL == id_index.id_index_objects_empty_p(idx_$5, $kw$SKIP)) {
						SubLObject idx_$6 = idx_$5;
						if (NIL == id_index.id_index_dense_objects_empty_p(idx_$6, $kw$SKIP)) {
							SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
							SubLObject backwardP_var = NIL;
							SubLObject length;
							SubLObject v_iteration;
							SubLObject a_id;
							SubLObject a_handle;
							SubLObject assertion2;
							for (length = Sequences
									.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration
											.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
								a_id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER)
										: v_iteration);
								a_handle = Vectors.aref(vector_var, a_id);
								if ((NIL == id_index.id_index_tombstone_p(a_handle))
										|| (NIL == id_index.id_index_skip_tombstones_p($kw$SKIP))) {
									if (NIL != id_index.id_index_tombstone_p(a_handle)) {
										a_handle = $kw$SKIP;
									}
									assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
									if ((NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, NIL, NIL))
											&& (NIL != assertions_high.rule_assertionP(assertion2))) {
										set.set_add(assertion2, rule_set);
									}
									sofar = Numbers.add(sofar, ONE_INTEGER);
									utilities_macros.note_percent_progress(sofar, total);
								}
							}
						}
						SubLObject idx_$7 = idx_$5;
						if ((NIL == id_index.id_index_sparse_objects_empty_p(idx_$7))
								|| (NIL == id_index.id_index_skip_tombstones_p($kw$SKIP))) {
							SubLObject sparse = id_index.id_index_sparse_objects(idx_$7);
							SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$7);
							SubLObject end_id = id_index.id_index_next_id(idx_$7);
							SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($kw$SKIP)) ? NIL
									: $kw$SKIP;
							while (a_id2.numL(end_id)) {
								SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
								if ((NIL == id_index.id_index_skip_tombstones_p($kw$SKIP))
										|| (NIL == id_index.id_index_tombstone_p(a_handle2))) {
									SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2,
											a_handle2);
									if ((NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, NIL, NIL))
											&& (NIL != assertions_high.rule_assertionP(assertion3))) {
										set.set_add(assertion3, rule_set);
									}
									sofar = Numbers.add(sofar, ONE_INTEGER);
									utilities_macros.note_percent_progress(sofar, total);
								}
								a_id2 = Numbers.add(a_id2, ONE_INTEGER);
							}
						}
					}
				} finally {
					SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						Threads.$is_thread_performing_cleanupP$.bind(T, thread);
						SubLObject _values2 = Values.getValuesAsVector();
						utilities_macros.noting_percent_progress_postamble();
						Values.restoreValuesFromVector(_values2);
					} finally {
						Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
					}
				}
			} finally {
				utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
				utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
				utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
				utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
			}
		}
		return set.set_element_list(rule_set);
	}

	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 2700L)
	public static SubLObject show_consequences_rules_from_mt(SubLObject mt) {
		SubLObject caching_state = $show_consequences_rules_from_mt_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(
					$sym34$SHOW_CONSEQUENCES_RULES_FROM_MT, $sym41$_SHOW_CONSEQUENCES_RULES_FROM_MT_CACHING_STATE_, NIL,
					EQL, ONE_INTEGER, ZERO_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, mt,
				memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = Values.arg2(Values.resetMultipleValues(),
					Values.multiple_value_list(show_consequences_rules_from_mt_internal(mt)));
			memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 3000L)
	public static SubLObject clear_biology_practice_rules() {
		SubLObject cs = $biology_practice_rules_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 3000L)
	public static SubLObject remove_biology_practice_rules() {
		return memoization_state.caching_state_remove_function_results_with_args(
				$biology_practice_rules_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED,
				UNPROVIDED);
	}

	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 3000L)
	public static SubLObject biology_practice_rules_internal() {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject rule_set = set.new_set(Symbols.symbol_function(EQL), UNPROVIDED);
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind($sym43$RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($const44$EverythingPSC, thread);
			SubLObject pred_var = $const45$queryPracticeRules;
			if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
				SubLObject str = NIL;
				SubLObject _prev_bind_0_$9 = utilities_macros.$progress_start_time$.currentBinding(thread);
				SubLObject _prev_bind_1_$10 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
				SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$
						.currentBinding(thread);
				SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
				SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$
						.currentBinding(thread);
				SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
				SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
				SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
				try {
					utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
					utilities_macros.$progress_last_pacification_time$
							.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
					utilities_macros.$progress_elapsed_seconds_for_notification$.bind(
							utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread),
							thread);
					utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
					utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
					utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
					utilities_macros.$is_noting_progressP$.bind(T, thread);
					utilities_macros.$silent_progressP$.bind(
							(NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
					utilities_macros.noting_progress_preamble(str);
					SubLObject iterator_var = kb_mapping_macros
							.new_predicate_extent_final_index_spec_iterator(pred_var);
					SubLObject done_var = NIL;
					SubLObject token_var = NIL;
					while (NIL == done_var) {
						SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var,
								token_var);
						SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
						if (NIL != valid) {
							utilities_macros.note_progress();
							SubLObject final_index_iterator = NIL;
							try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec,
										$kw$GAF, NIL, NIL);
								SubLObject done_var_$11 = NIL;
								SubLObject token_var_$12 = NIL;
								while (NIL == done_var_$11) {
									SubLObject gaf = iteration.iteration_next_without_values_macro_helper(
											final_index_iterator, token_var_$12);
									SubLObject valid_$13 = makeBoolean(!token_var_$12.eql(gaf));
									if (NIL != valid_$13) {
										SubLObject query = assertions_high.gaf_arg1(gaf);
										SubLObject rule = assertions_high.gaf_arg2(gaf);
										if (NIL != isa.isaP(query, $const47$CytologicalProcessProjectKBConten,
												UNPROVIDED, UNPROVIDED)) {
											set.set_add(rule, rule_set);
										}
									}
									done_var_$11 = makeBoolean(NIL == valid_$13);
								}
							} finally {
								SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$
										.currentBinding(thread);
								try {
									Threads.$is_thread_performing_cleanupP$.bind(T, thread);
									SubLObject _values = Values.getValuesAsVector();
									if (NIL != final_index_iterator) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
									Values.restoreValuesFromVector(_values);
								} finally {
									Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
								}
							}
						}
						done_var = makeBoolean(NIL == valid);
					}
					utilities_macros.noting_progress_postamble();
				} finally {
					utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
					utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
					utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
					utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
					utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
					utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
					utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$10, thread);
					utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$9, thread);
				}
			}
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return set.set_element_list(rule_set);
	}

	@SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 3000L)
	public static SubLObject biology_practice_rules() {
		SubLObject caching_state = $biology_practice_rules_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name($sym42$BIOLOGY_PRACTICE_RULES,
					$sym48$_BIOLOGY_PRACTICE_RULES_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = Values.arg2(Values.resetMultipleValues(),
					Values.multiple_value_list(biology_practice_rules_internal()));
			memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject declare_cb_show_consequences_file() {
		declareFunction(myName, "cb_link_show_consequences", "CB-LINK-SHOW-CONSEQUENCES", 1, 2, false);
		declareFunction(myName, "cb_show_consequences", "CB-SHOW-CONSEQUENCES", 1, 0, false);
		declareFunction(myName, "cb_display_consequence", "CB-DISPLAY-CONSEQUENCE", 1, 0, false);
		declareFunction(myName, "clear_show_consequences_rules_from_mt", "CLEAR-SHOW-CONSEQUENCES-RULES-FROM-MT", 0, 0,
				false);
		declareFunction(myName, "remove_show_consequences_rules_from_mt", "REMOVE-SHOW-CONSEQUENCES-RULES-FROM-MT", 1,
				0, false);
		declareFunction(myName, "show_consequences_rules_from_mt_internal", "SHOW-CONSEQUENCES-RULES-FROM-MT-INTERNAL",
				1, 0, false);
		declareFunction(myName, "show_consequences_rules_from_mt", "SHOW-CONSEQUENCES-RULES-FROM-MT", 1, 0, false);
		declareFunction(myName, "clear_biology_practice_rules", "CLEAR-BIOLOGY-PRACTICE-RULES", 0, 0, false);
		declareFunction(myName, "remove_biology_practice_rules", "REMOVE-BIOLOGY-PRACTICE-RULES", 0, 0, false);
		declareFunction(myName, "biology_practice_rules_internal", "BIOLOGY-PRACTICE-RULES-INTERNAL", 0, 0, false);
		declareFunction(myName, "biology_practice_rules", "BIOLOGY-PRACTICE-RULES", 0, 0, false);
		return NIL;
	}

	public static SubLObject init_cb_show_consequences_file() {
		$cb_show_consequences_link_enabledP$ = defparameter("*CB-SHOW-CONSEQUENCES-LINK-ENABLED?*", NIL);
		$cb_show_consequences_mt$ = defparameter("*CB-SHOW-CONSEQUENCES-MT*", $const0$BiologyMt);
		$cb_show_consequences_max_time$ = defparameter("*CB-SHOW-CONSEQUENCES-MAX-TIME*", $int1$30);
		$show_consequences_rules_from_mt_caching_state$ = SubLFiles
				.deflexical("*SHOW-CONSEQUENCES-RULES-FROM-MT-CACHING-STATE*", NIL);
		$biology_practice_rules_caching_state$ = deflexical("*BIOLOGY-PRACTICE-RULES-CACHING-STATE*", NIL);
		return NIL;
	}

	public static SubLObject setup_cb_show_consequences_file() {
		cb_utilities.setup_cb_link_method($kw$SHOW_CONSEQUENCES, $sym7$CB_LINK_SHOW_CONSEQUENCES, THREE_INTEGER);
		html_macros.note_cgi_handler_function($sym27$CB_SHOW_CONSEQUENCES, $kw$HTML_HANDLER);
		memoization_state.note_globally_cached_function($sym34$SHOW_CONSEQUENCES_RULES_FROM_MT);
		memoization_state.note_globally_cached_function($sym42$BIOLOGY_PRACTICE_RULES);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_cb_show_consequences_file();
	}

	@Override
	public void initializeVariables() {
		init_cb_show_consequences_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_cb_show_consequences_file();
	}

	static {
		me = new cb_show_consequences();
		$cb_show_consequences_link_enabledP$ = null;
		$cb_show_consequences_mt$ = null;
		$cb_show_consequences_max_time$ = null;
		$show_consequences_rules_from_mt_caching_state$ = null;
		$biology_practice_rules_caching_state$ = null;
		$const0$BiologyMt = constant_handles.reader_make_constant_shell(makeString("BiologyMt"));
		$int1$30 = makeInteger(30);
		$kw$ALL = makeKeyword("ALL");
		$str3$_Show_Consequences_ = makeString("[Show Consequences]");
		$kw$SELF = makeKeyword("SELF");
		$str5$cb_show_consequences__a__a = makeString("cb-show-consequences&~a&~a");
		$kw$SHOW_CONSEQUENCES = makeKeyword("SHOW-CONSEQUENCES");
		$sym7$CB_LINK_SHOW_CONSEQUENCES = makeSymbol("CB-LINK-SHOW-CONSEQUENCES");
		$list8 = list(makeSymbol("ASSERTION-ID"), makeSymbol("RULES-ID"));
		$str9$Show_Consequences = makeString("Show Consequences");
		$str10$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString(
				"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
		$str11$_meta_http_equiv__X_UA_Compatible = makeString(
				"<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
		$kw$UNINITIALIZED = makeKeyword("UNINITIALIZED");
		$kw$CB_CYC = makeKeyword("CB-CYC");
		$kw$SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");
		$kw$SHA1 = makeKeyword("SHA1");
		$str16$yui_skin_sam = makeString("yui-skin-sam");
		$str17$reloadFrameButton = makeString("reloadFrameButton");
		$str18$button = makeString("button");
		$str19$reload = makeString("reload");
		$str20$Refresh_Frames = makeString("Refresh Frames");
		$str21$Generating_consequences_of_ = makeString("Generating consequences of ");
		$str22$__considering__a_rules___ = makeString(", considering ~a rules...");
		$str23$all = makeString("all");
		$const24$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
		$kw$MAX_TIME = makeKeyword("MAX-TIME");
		$str26$Timed_out_after__a_second_P_ = makeString("Timed out after ~a second~P.");
		$sym27$CB_SHOW_CONSEQUENCES = makeSymbol("CB-SHOW-CONSEQUENCES");
		$kw$HTML_HANDLER = makeKeyword("HTML-HANDLER");
		$list29 = list(makeSymbol("QUERY-EL-FORMULA"), makeSymbol("MT"), makeSymbol("JUSTIFICATION"));
		$str30$In_Mt__ = makeString("In Mt: ");
		$kw$SENTENCE_QUERY_SIMILAR = makeKeyword("SENTENCE-QUERY-SIMILAR");
		$str32$_Query_ = makeString("[Query]");
		$str33$Justification_ = makeString("Justification:");
		$sym34$SHOW_CONSEQUENCES_RULES_FROM_MT = makeSymbol("SHOW-CONSEQUENCES-RULES-FROM-MT");
		$sym35$HLMT_P = makeSymbol("HLMT-P");
		$kw$MT = makeKeyword("MT");
		$kw$BROAD_MT = makeKeyword("BROAD-MT");
		$str38$do_broad_mt_index = makeString("do-broad-mt-index");
		$sym39$STRINGP = makeSymbol("STRINGP");
		$kw$SKIP = makeKeyword("SKIP");
		$sym41$_SHOW_CONSEQUENCES_RULES_FROM_MT_CACHING_STATE_ = makeSymbol(
				"*SHOW-CONSEQUENCES-RULES-FROM-MT-CACHING-STATE*");
		$sym42$BIOLOGY_PRACTICE_RULES = makeSymbol("BIOLOGY-PRACTICE-RULES");
		$sym43$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
		$const44$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
		$const45$queryPracticeRules = constant_handles.reader_make_constant_shell(makeString("queryPracticeRules"));
		$kw$GAF = makeKeyword("GAF");
		$const47$CytologicalProcessProjectKBConten = constant_handles
				.reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"));
		$sym48$_BIOLOGY_PRACTICE_RULES_CACHING_STATE_ = makeSymbol("*BIOLOGY-PRACTICE-RULES-CACHING-STATE*");
	}
}
/*
 *
 * Total time: 222 ms
 *
 */