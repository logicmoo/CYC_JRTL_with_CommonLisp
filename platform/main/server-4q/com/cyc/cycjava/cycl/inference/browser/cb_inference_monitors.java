package com.cyc.cycjava.cycl.inference.browser;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_tools;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.web_services;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class cb_inference_monitors extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.browser.cb_inference_monitors";
	public static String myFingerPrint = "f255ee92e65aeb74cccab2deb9c5c1a2a5c1f0ac5d25bd43b2e751e5664138bf";
	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 3300L)
	private static SubLSymbol $cb_inference_monitor_style$;
	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 8300L)
	public static SubLSymbol $inference_monitors_debug_level$;
	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 10200L)
	private static SubLSymbol $inference_monitor_focal_object_html_caching_state$;
	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 11700L)
	private static SubLSymbol $inference_monitor_focal_object_paraphrase_caching_state$;
	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 12100L)
	private static SubLSymbol $cb_inference_monitor_inference_id_param$;
	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 12200L)
	private static SubLSymbol $cb_inference_monitor_store_id_param$;
	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 12200L)
	private static SubLSymbol $cb_inference_monitor_mode_param$;
	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 12300L)
	private static SubLSymbol $cb_inference_monitor_param$;
	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 12400L)
	private static SubLSymbol $cb_monitor_latest_inference_refresh_timeout_param$;
	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 12400L)
	private static SubLSymbol $cb_monitor_latest_inference_refresh_timeout$;
	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 12500L)
	private static SubLSymbol $cb_latest_inference_refresh_template$;
	private static SubLList $list0;
	private static SubLString $str1$_A_did_not_specify_an_inference;
	private static SubLSymbol $kw$INFERENCE;
	private static SubLSymbol $sym3$CB_MONITOR_INFERENCE;
	private static SubLSymbol $kw$HTML_HANDLER;
	private static SubLList $list5;
	private static SubLString $str6$_A_did_not_specify_a_problem_stor;
	private static SubLSymbol $kw$PROBLEM_STORE;
	private static SubLSymbol $sym8$CB_MONITOR_PROBLEM_STORE;
	private static SubLSymbol $kw$LATEST_INFERENCE;
	private static SubLSymbol $sym10$CB_MONITOR_ALL_INFERENCES;
	private static SubLSymbol $kw$MONITOR_ALL_INFERENCES;
	private static SubLSymbol $kw$TEXT;
	private static SubLList $list13;
	private static SubLString $str14$cb_monitor_all_inferences;
	private static SubLSymbol $kw$BLANK;
	private static SubLString $str16$Monitor_All_Inferences;
	private static SubLString $str17$_Monitor_;
	private static SubLString $str18$_Re_run_and_Monitor_;
	private static SubLSymbol $kw$NEW;
	private static SubLSymbol $kw$SELF;
	private static SubLString $str21$cb_monitor_inference__A__A;
	private static SubLSymbol $kw$MONITOR_INFERENCE;
	private static SubLSymbol $sym23$CB_LINK_MONITOR_INFERENCE;
	private static SubLSymbol $kw$TICK_INDEXED_PROGRESS_DATA;
	private static SubLSymbol $kw$INFERENCE_MONITOR_HEAD;
	private static SubLSymbol $kw$INFERENCE_MONITOR_TAIL;
	private static SubLSymbol $kw$INFERENCE_MONITOR_TREE;
	private static SubLSymbol $kw$INFERENCE_MONITOR_USER_TABLE;
	private static SubLString $str29$______selection___background_tran;
	private static SubLSymbol $kw$METRICS;
	private static SubLString $str31$__DOCTYPE_html_PUBLIC_____W3C__DT;
	private static SubLString $str32$_meta_http_equiv__X_UA_Compatible;
	private static SubLSymbol $kw$UNINITIALIZED;
	private static SubLSymbol $kw$CB_CYC;
	private static SubLString $str35$Inference_Monitor;
	private static SubLString $str36$Cannot_have_a_FRAMESET_tag_inside;
	private static SubLString $str37$__0;
	private static SubLSymbol $kw$INFMON;
	private static SubLString $str39$infmon;
	private static SubLString $str40$cb_inference_monitor_frame;
	private static SubLString $str41$__a__a__s;
	private static SubLSymbol $kw$INFMONREFRESH;
	private static SubLString $str43$infmonrefresh;
	private static SubLString $str44$cb_inference_monitor_refresh_fram;
	private static SubLSymbol $kw$OFF;
	private static SubLSymbol $kw$INFO;
	private static SubLList $list47;
	private static SubLString $str48$CB_INFERENCE_MONITOR_FRAME_args__;
	private static SubLList $list49;
	private static SubLString $str50$spacerdiv;
	private static SubLString $str51$height_1400px_box_shadow_none_;
	private static SubLString $str52$focalobjlabel;
	private static SubLString $str53$box_shadow_none__font_size_large_;
	private static SubLString $str54$Monitoring__S;
	private static SubLSymbol $sym55$CB_INFERENCE_MONITOR_FRAME;
	private static SubLSymbol $sym56$INFERENCE_MONITOR_FOCAL_OBJECT_HTML;
	private static SubLString $str57$New_label___S_;
	private static SubLSymbol $sym58$_INFERENCE_MONITOR_FOCAL_OBJECT_HTML_CACHING_STATE_;
	private static SubLString $str59$Deducing_new_facts;
	private static SubLString $str60$_from;
	private static SubLString $str61$_;
	private static SubLSymbol $kw$INTERROGATIVE;
	private static SubLSymbol $sym63$INFERENCE_MONITOR_FOCAL_OBJECT_PARAPHRASE;
	private static SubLSymbol $kw$HTML;
	private static SubLSymbol $kw$NONE;
	private static SubLSymbol $sym66$_EXIT;
	private static SubLSymbol $sym67$_INFERENCE_MONITOR_FOCAL_OBJECT_PARAPHRASE_CACHING_STATE_;
	private static SubLString $str68$_INFID_;
	private static SubLString $str69$_STOREID_;
	private static SubLString $str70$_MODE_;
	private static SubLString $str71$_INFMON_;
	private static SubLString $str72$_TIMEOUT_;
	private static SubLInteger $int73$1000;
	private static SubLString $str74$_function_perform_refresh_inferen;
	private static SubLString $str75$null;
	private static SubLSymbol $kw$LATEST_PROBLEM_STORE;
	private static SubLString $str77$Updating_stale_inference_monitor_;
	private static SubLString $str78$10__URL_cg_cb_inference_monitor_r;
	private static SubLString $str79$_;
	private static SubLString $str80$Refresh;
	private static SubLSymbol $sym81$CB_INFERENCE_MONITOR_REFRESH_FRAME;
	private static SubLList $list82;
	private static SubLSymbol $sym83$START;
	private static SubLSymbol $sym84$I;
	private static SubLSymbol $sym$CLET;
	private static SubLList $list86;
	private static SubLSymbol $sym87$DO_NUMBERS;
	private static SubLSymbol $kw$START;
	private static SubLList $list89;
	private static SubLSymbol $sym90$FIND_PROBLEM_STORE_BY_ID;
	private static SubLSymbol $sym91$PWHEN;
	private static SubLSymbol $sym92$CATCH_ERROR_MESSAGE_HANDLER;
	private static SubLSymbol $kw$SKIP;
	private static SubLList $list94;
	private static SubLSymbol $kw$DO_HASH_TABLE;
	private static SubLSymbol $kw$IGNORE_ERRORS_TARGET;
	private static SubLSymbol $sym97$IGNORE_ERRORS_HANDLER;
	private static SubLString $str98$text_javascript;
	private static SubLString $str99$var_problemStoreId_____A___var_in;
	private static SubLList $list100;
	private static SubLString $str101$inference_monitor;
	private static SubLString $str102$html;

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 800L)
	public static SubLObject cb_monitor_inference(SubLObject args) {
		SubLObject store_id_string = NIL;
		SubLObject inference_id_string = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(args, args, $list0);
		store_id_string = args.first();
		SubLObject current = args.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, args, $list0);
		inference_id_string = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind.cdestructuring_bind_error(args, $list0);
			return NIL;
		}
		SubLObject inference = cb_query.cb_guess_inference(store_id_string, inference_id_string);
		if (NIL == inference_datastructures_inference.inference_p(inference))
			return cb_utilities.cb_error($str1$_A_did_not_specify_an_inference, args, UNPROVIDED, UNPROVIDED,
					UNPROVIDED, UNPROVIDED);
		return cb_monitor_inference_guts(inference, $kw$INFERENCE);
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 1200L)
	public static SubLObject cb_monitor_problem_store(SubLObject args) {
		SubLObject store_id_string = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(args, args, $list5);
		store_id_string = args.first();
		SubLObject current = args.rest();
		if (NIL != current) {
			cdestructuring_bind.cdestructuring_bind_error(args, $list5);
			return NIL;
		}
		SubLObject store = cb_inference_browser.cb_guess_problem_store(store_id_string);
		if (NIL == inference_datastructures_problem_store.problem_store_p(store))
			return cb_utilities.cb_error($str6$_A_did_not_specify_a_problem_stor, args, UNPROVIDED, UNPROVIDED,
					UNPROVIDED, UNPROVIDED);
		return cb_monitor_inference_guts(store, $kw$PROBLEM_STORE);
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 1500L)
	public static SubLObject cb_monitor_all_inferences(SubLObject args) {
		inference_metrics.$force_inference_tick_indexed_progress_data_collectionP$.setDynamicValue(T);
		return cb_monitor_inference_guts(NIL, $kw$LATEST_INFERENCE);
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 1900L)
	public static SubLObject cb_link_monitor_inference(SubLObject inference, SubLObject linktext) {
		if (linktext == UNPROVIDED) {
			linktext = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == inference_datastructures_inference.valid_inference_p(inference))
			return html_utilities.html_princ(print_high.princ_to_string(inference));
		SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
		SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
		SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
		SubLObject monitorableP = inference_monitorableP(inference);
		if (NIL == linktext) {
			linktext = (NIL != monitorableP) ? $str17$_Monitor_ : $str18$_Re_run_and_Monitor_;
		}
		SubLObject frame_name_var = cb_utilities.cb_frame_name((NIL != monitorableP) ? $kw$NEW : $kw$SELF);
		html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
		cb_parameters.cyc_cgi_url_int();
		PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str21$cb_monitor_inference__A__A, store_id,
				inference_id);
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
			html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			html_utilities.html_princ(linktext);
			html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 2600L)
	public static SubLObject inference_monitorableP(SubLObject inference) {
		return makeBoolean((NIL != inference_datastructures_inference.inference_computes_metricP(inference,
				$kw$TICK_INDEXED_PROGRESS_DATA))
				|| (NIL != inference_metrics.inference_has_tick_indexed_progress_dataP(inference)));
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 2800L)
	public static SubLObject inference_monitor_head_script() {
		cyc_file_dependencies.javascript($kw$INFERENCE_MONITOR_HEAD);
		return html_utilities.html_source_readability_terpri(UNPROVIDED);
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 2900L)
	public static SubLObject inference_monitor_tail_script() {
		cyc_file_dependencies.javascript($kw$INFERENCE_MONITOR_TAIL);
		return html_utilities.html_source_readability_terpri(UNPROVIDED);
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 3100L)
	public static SubLObject inference_monitor_tree_script() {
		cyc_file_dependencies.javascript($kw$INFERENCE_MONITOR_TREE);
		return html_utilities.html_source_readability_terpri(UNPROVIDED);
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 3200L)
	public static SubLObject inference_monitor_user_table_script() {
		cyc_file_dependencies.javascript($kw$INFERENCE_MONITOR_USER_TABLE);
		return html_utilities.html_source_readability_terpri(UNPROVIDED);
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 7000L)
	public static SubLObject cb_monitor_inference_guts(SubLObject inference_or_store, SubLObject mode) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL != inference_or_store)
				&& (NIL == inference_datastructures_problem_store.problem_store_p(inference_or_store))
				&& (NIL == inference_monitorableP(inference_or_store))) {
			SubLObject new_properties = conses_high.putf(
					inference_datastructures_enumerated_types
							.inference_input_non_default_query_properties(inference_or_store),
					$kw$METRICS, cons($kw$TICK_INDEXED_PROGRESS_DATA,
							inference_datastructures_inference.inference_metrics_template(inference_or_store)));
			return cb_query.cb_similar_query(
					inference_datastructures_inference.inference_input_el_query(inference_or_store),
					inference_datastructures_inference.inference_input_mt(inference_or_store), new_properties);
		}
		html_utilities.html_markup($str31$__DOCTYPE_html_PUBLIC_____W3C__DT);
		if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
			html_utilities.html_source_readability_terpri(UNPROVIDED);
			html_utilities.html_markup($str32$_meta_http_equiv__X_UA_Compatible);
		}
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
		try {
			cyc_file_dependencies.$html_emitted_file_dependencies$.bind(
					(cyc_file_dependencies.$html_emitted_file_dependencies$
							.getDynamicValue(thread) == $kw$UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY)
									: cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread),
					thread);
			html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
			html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
			html_macros.html_head_content_type();
			cb_parameters.cb_head_shortcut_icon();
			html_utilities.html_meta_robot_instructions(
					cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread),
					cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
			cyc_file_dependencies.css($kw$CB_CYC);
			html_utilities.html_source_readability_terpri(UNPROVIDED);
			html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
			html_utilities.html_princ($str35$Inference_Monitor);
			html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
			html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
			if (NIL != html_macros.html_inside_body_p()) {
				Errors.error($str36$Cannot_have_a_FRAMESET_tag_inside);
			}
			html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
			html_utilities.html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
			html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
			html_utilities.html_markup($str37$__0);
			html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
			html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
			SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				SubLObject inference = (NIL != inference_datastructures_inference.inference_p(inference_or_store))
						? inference_or_store
						: NIL;
				SubLObject inference_id = (NIL != inference)
						? inference_datastructures_inference.inference_suid(inference)
						: MINUS_ONE_INTEGER;
				SubLObject store = (NIL != inference)
						? inference_datastructures_inference.inference_problem_store(inference)
						: ((NIL != inference_datastructures_problem_store.problem_store_p(inference_or_store))
								? inference_or_store
								: NIL);
				SubLObject store_id = (NIL != store) ? inference_datastructures_problem_store.problem_store_suid(store)
						: MINUS_ONE_INTEGER;
				cb_utilities.cb_frame($kw$INFMON, store_id, inference_id, mode, UNPROVIDED);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
			}
			html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
			html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		} finally {
			cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
		}
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 8400L)
	public static SubLObject inference_monitor_info(SubLObject format_string, SubLObject arg1, SubLObject arg2,
			SubLObject arg3, SubLObject arg4) {
		if (arg1 == UNPROVIDED) {
			arg1 = NIL;
		}
		if (arg2 == UNPROVIDED) {
			arg2 = NIL;
		}
		if (arg3 == UNPROVIDED) {
			arg3 = NIL;
		}
		if (arg4 == UNPROVIDED) {
			arg4 = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		if ($inference_monitors_debug_level$.getDynamicValue(thread).eql($kw$INFO)) {
			format_nil.force_format(T, format_string, arg1, arg2, arg3, arg4, UNPROVIDED, UNPROVIDED, UNPROVIDED,
					UNPROVIDED);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 8600L)
	public static SubLObject inference_monitor_warn(SubLObject format_string, SubLObject arg1, SubLObject arg2,
			SubLObject arg3, SubLObject arg4) {
		if (arg1 == UNPROVIDED) {
			arg1 = NIL;
		}
		if (arg2 == UNPROVIDED) {
			arg2 = NIL;
		}
		if (arg3 == UNPROVIDED) {
			arg3 = NIL;
		}
		if (arg4 == UNPROVIDED) {
			arg4 = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != conses_high.member($inference_monitors_debug_level$.getDynamicValue(thread), $list47, UNPROVIDED,
				UNPROVIDED)) {
			Errors.warn(format_string, new SubLObject[] { arg1, arg2, arg3, arg4 });
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 8800L)
	public static SubLObject cb_inference_monitor_frame(SubLObject args) {
		SubLThread thread = SubLProcess.currentSubLThread();
		inference_monitor_info($str48$CB_INFERENCE_MONITOR_FRAME_args__, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		web_services.reset_last_monitored_inference();
		SubLObject store_id_string = NIL;
		SubLObject inference_id_string = NIL;
		SubLObject mode_string = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(args, args, $list49);
		store_id_string = args.first();
		SubLObject current = args.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, args, $list49);
		inference_id_string = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, args, $list49);
		mode_string = current.first();
		current = current.rest();
		if (NIL == current) {
			SubLObject mode = reader.read_from_string_ignoring_errors(mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED,
					UNPROVIDED);
			SubLObject inference = mode.eql($kw$LATEST_INFERENCE) ? NIL
					: cb_query.cb_guess_inference(store_id_string, inference_id_string);
			SubLObject store = (NIL != inference)
					? inference_datastructures_inference.inference_problem_store(inference)
					: NIL;
			html_utilities.html_markup($str31$__DOCTYPE_html_PUBLIC_____W3C__DT);
			if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
				html_utilities.html_source_readability_terpri(UNPROVIDED);
				html_utilities.html_markup($str32$_meta_http_equiv__X_UA_Compatible);
			}
			html_utilities.html_source_readability_terpri(UNPROVIDED);
			SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
				html_utilities.html_source_readability_terpri(UNPROVIDED);
				html_utilities.html_markup(html_macros.$html_style_head$.getGlobalValue());
				html_utilities.html_markup($cb_inference_monitor_style$.getGlobalValue());
				html_utilities.html_markup(html_macros.$html_style_tail$.getGlobalValue());
				write_inference_monitor_args((NIL != inference) ? inference : store, mode);
				inference_monitor_head_script();
				html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_utilities.html_source_readability_terpri(UNPROVIDED);
				SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
					html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
					SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup($str50$spacerdiv);
						html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
						html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup($str51$height_1400px_box_shadow_none_);
						html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
						html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
						SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_markup(get_inference_monitor_html());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
						}
						html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup($str52$focalobjlabel);
						html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
						html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup($str53$box_shadow_none__font_size_large_);
						html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
						html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
						SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							if (NIL != store) {
								inference_monitor_info($str54$Monitoring__S, store, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								html_output_inference_monitor_focal_object(inference, store);
							}
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
						}
						html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
						html_utilities.html_source_readability_terpri(UNPROVIDED);
						inference_monitor_user_table_script();
						inference_monitor_tail_script();
						inference_monitor_tree_script();
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
				cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
			}
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		} else {
			cdestructuring_bind.cdestructuring_bind_error(args, $list49);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 10100L)
	public static SubLObject html_output_inference_monitor_focal_object(SubLObject inference, SubLObject store) {
		html_utilities.html_markup(inference_monitor_focal_object_html(inference, store));
		return (NIL != inference) ? inference : store;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 10200L)
	public static SubLObject clear_inference_monitor_focal_object_html() {
		SubLObject cs = $inference_monitor_focal_object_html_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 10200L)
	public static SubLObject remove_inference_monitor_focal_object_html(SubLObject inference, SubLObject store) {
		return memoization_state.caching_state_remove_function_results_with_args(
				$inference_monitor_focal_object_html_caching_state$.getGlobalValue(), list(inference, store),
				UNPROVIDED, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 10200L)
	public static SubLObject inference_monitor_focal_object_html_internal(SubLObject inference, SubLObject store) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject html = NIL;
		SubLObject stream = NIL;
		try {
			stream = streams_high.make_private_string_output_stream();
			SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
			try {
				html_macros.$html_stream$.bind(stream, thread);
				html_output_inference_monitor_focal_object_internal(inference, store);
			} finally {
				html_macros.$html_stream$.rebind(_prev_bind_0, thread);
			}
			html = streams_high.get_output_stream_string(stream);
		} finally {
			SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				Threads.$is_thread_performing_cleanupP$.bind(T, thread);
				SubLObject _values = Values.getValuesAsVector();
				streams_high.close(stream, UNPROVIDED);
				Values.restoreValuesFromVector(_values);
			} finally {
				Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
			}
		}
		inference_monitor_info($str57$New_label___S_, html, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return html;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 10200L)
	public static SubLObject inference_monitor_focal_object_html(SubLObject inference, SubLObject store) {
		SubLObject caching_state = $inference_monitor_focal_object_html_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(
					$sym56$INFERENCE_MONITOR_FOCAL_OBJECT_HTML,
					$sym58$_INFERENCE_MONITOR_FOCAL_OBJECT_HTML_CACHING_STATE_, SIXTEEN_INTEGER, EQL, TWO_INTEGER,
					ZERO_INTEGER);
		}
		SubLObject sxhash = memoization_state.sxhash_calc_2(inference, store);
		SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				SubLObject results2 = conses_high.second(collision);
				if (inference.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if ((NIL != cached_args) && (NIL == cached_args.rest()) && store.eql(cached_args.first()))
						return memoization_state.caching_results(results2);
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		SubLObject results3 = Values.arg2(Values.resetMultipleValues(),
				Values.multiple_value_list(inference_monitor_focal_object_html_internal(inference, store)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3,
				list(inference, store));
		return memoization_state.caching_results(results3);
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 10500L)
	public static SubLObject html_output_inference_monitor_focal_object_internal(SubLObject inference,
			SubLObject store) {
		if ((NIL != inference_datastructures_problem_store.problem_store_p(store))
				&& (NIL != inference_datastructures_problem_store.problem_store_forwardP(store))) {
			html_utilities.html_princ($str59$Deducing_new_facts);
			SubLObject now_propagating = forward.all_currently_forward_propagating_assertions();
			if (NIL != list_utilities.singletonP(now_propagating)) {
				SubLObject focal_as = list_utilities.only_one(now_propagating);
				html_utilities.html_princ($str60$_from);
				html_utilities.html_newline(UNPROVIDED);
				cb_utilities.cb_form(uncanonicalizer.assertion_el_formula(focal_as), ZERO_INTEGER, T);
			} else {
				html_utilities.html_princ($str61$_);
			}
		} else if (NIL != inference) {
			SubLObject query_sentence = inference_datastructures_inference.inference_input_el_query(inference);
			if ((NIL != cycl_grammar.cycl_expression_p(query_sentence))
					&& (NIL == show_inference_monitor_focal_object_paraphrase(query_sentence, $kw$INTERROGATIVE))) {
				cb_utilities.cb_form(query_sentence, ZERO_INTEGER, T);
			}
		} else {
			cb_utilities.cb_form(store, UNPROVIDED, UNPROVIDED);
		}
		return (NIL != inference) ? inference : store;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 11400L)
	public static SubLObject show_inference_monitor_focal_object_paraphrase(SubLObject v_object, SubLObject force) {
		SubLObject displayedP = NIL;
		SubLObject paraphrase = inference_monitor_focal_object_paraphrase(v_object, force);
		if (NIL != list_utilities.lengthG(paraphrase, ZERO_INTEGER, UNPROVIDED)) {
			html_utilities.html_markup(cycl_string.cycl_string_to_utf8_string(paraphrase));
			displayedP = T;
		}
		return displayedP;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 11700L)
	public static SubLObject clear_inference_monitor_focal_object_paraphrase() {
		SubLObject cs = $inference_monitor_focal_object_paraphrase_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 11700L)
	public static SubLObject remove_inference_monitor_focal_object_paraphrase(SubLObject v_object, SubLObject force) {
		return memoization_state.caching_state_remove_function_results_with_args(
				$inference_monitor_focal_object_paraphrase_caching_state$.getGlobalValue(), list(v_object, force),
				UNPROVIDED, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 11700L)
	public static SubLObject inference_monitor_focal_object_paraphrase_internal(SubLObject v_object, SubLObject force) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			SubLObject _prev_bind_0_$6 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(),
						thread);
				SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					SubLObject _prev_bind_0_$7 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(),
								thread);
						SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						SubLObject _prev_bind_0_$8 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$
									.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							SubLObject _prev_bind_0_$9 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								SubLObject original_memoization_process = memoization_state
										.memoization_state_original_process(local_state);
								try {
									SubLObject _prev_bind_0_$10 = pph_vars.$pph_language_mt$.currentBinding(thread);
									SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
									SubLObject _prev_bind_3 = pph_vars.$constant_link_function$.currentBinding(thread);
									SubLObject _prev_bind_4 = pph_vars.$pph_introduce_anaphorsP$.currentBinding(thread);
									SubLObject _prev_bind_5 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
										pph_vars.$paraphrase_mode$.bind($kw$HTML, thread);
										pph_vars.$constant_link_function$.bind($kw$NONE, thread);
										pph_vars.$pph_introduce_anaphorsP$.bind(NIL, thread);
										pph_vars.$pph_demerit_cutoff$.bind(ONE_INTEGER, thread);
										return pph_main.generate_text_wXsentential_force(v_object, force, UNPROVIDED,
												UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									} finally {
										pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_5, thread);
										pph_vars.$pph_introduce_anaphorsP$.rebind(_prev_bind_4, thread);
										pph_vars.$constant_link_function$.rebind(_prev_bind_3, thread);
										pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$10, thread);
									}
								} finally {
									SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$
											.currentBinding(thread);
									try {
										Threads.$is_thread_performing_cleanupP$.bind(T, thread);
										SubLObject _values = Values.getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state,
												original_memoization_process);
										Values.restoreValuesFromVector(_values);
									} finally {
										Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$9, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$8, thread);
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$7, thread);
					}
				} finally {
					SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						Threads.$is_thread_performing_cleanupP$.bind(T, thread);
						SubLObject _values2 = Values.getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(
									pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						Values.restoreValuesFromVector(_values2);
					} finally {
						Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$6, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 11700L)
	public static SubLObject inference_monitor_focal_object_paraphrase(SubLObject v_object, SubLObject force) {
		SubLObject caching_state = $inference_monitor_focal_object_paraphrase_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(
					$sym63$INFERENCE_MONITOR_FOCAL_OBJECT_PARAPHRASE,
					$sym67$_INFERENCE_MONITOR_FOCAL_OBJECT_PARAPHRASE_CACHING_STATE_, SIXTEEN_INTEGER, EQUAL,
					TWO_INTEGER, ZERO_INTEGER);
		}
		SubLObject sxhash = memoization_state.sxhash_calc_2(v_object, force);
		SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				SubLObject results2 = conses_high.second(collision);
				if (v_object.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if ((NIL != cached_args) && (NIL == cached_args.rest()) && force.equal(cached_args.first()))
						return memoization_state.caching_results(results2);
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		SubLObject results3 = Values.arg2(Values.resetMultipleValues(),
				Values.multiple_value_list(inference_monitor_focal_object_paraphrase_internal(v_object, force)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3,
				list(v_object, force));
		return memoization_state.caching_results(results3);
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 12900L)
	public static SubLObject construct_cb_monitor_refresh_template(SubLObject inference_or_store, SubLObject mode) {
		SubLObject inference_id_string = (NIL != inference_datastructures_inference.inference_p(inference_or_store))
				? format_nil.format_nil_a(inference_datastructures_inference.inference_suid(inference_or_store))
				: $str75$null;
		SubLObject problem_store = (NIL != inference_datastructures_problem_store.problem_store_p(inference_or_store))
				? inference_or_store
				: ((NIL != inference_datastructures_inference.inference_p(inference_or_store))
						? inference_datastructures_inference.inference_problem_store(inference_or_store)
						: NIL);
		SubLObject problem_store_id_string = (NIL != problem_store)
				? format_nil.format_nil_a(inference_datastructures_problem_store.problem_store_suid(problem_store))
				: $str75$null;
		SubLObject substitutions = list(cons($cb_inference_monitor_param$.getGlobalValue(), $str39$infmon),
				cons($cb_inference_monitor_mode_param$.getGlobalValue(), format_nil.format_nil_s(mode)),
				cons($cb_inference_monitor_store_id_param$.getGlobalValue(), problem_store_id_string),
				cons($cb_inference_monitor_inference_id_param$.getGlobalValue(), inference_id_string),
				cons($cb_monitor_latest_inference_refresh_timeout_param$.getGlobalValue(),
						string_utilities.to_string($cb_monitor_latest_inference_refresh_timeout$.getGlobalValue())));
		return html_script_utilities.instantiate_javascript_template(
				$cb_latest_inference_refresh_template$.getGlobalValue(), substitutions);
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 14000L)
	public static SubLObject update_cb_monitor_latest_frame(SubLObject inference_or_store, SubLObject mode) {
		SubLThread thread = SubLProcess.currentSubLThread();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
		html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
		html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
		html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_utilities.html_markup(construct_cb_monitor_refresh_template(inference_or_store, mode));
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 14200L)
	public static SubLObject cb_inference_monitor_refresh_frame(SubLObject args) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject store_id_string = NIL;
		SubLObject inference_id_string = NIL;
		SubLObject mode_string = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(args, args, $list49);
		store_id_string = args.first();
		SubLObject current = args.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, args, $list49);
		inference_id_string = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, args, $list49);
		mode_string = current.first();
		current = current.rest();
		if (NIL == current) {
			SubLObject problem_store = cb_inference_browser.cb_guess_problem_store(store_id_string);
			SubLObject inference = cb_query.cb_guess_inference(store_id_string, inference_id_string);
			SubLObject mode = reader.read_from_string_ignoring_errors(mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED,
					UNPROVIDED);
			SubLObject latest = mode.eql($kw$LATEST_INFERENCE) ? latest_monitorable_inference()
					: (mode.eql($kw$LATEST_PROBLEM_STORE) ? latest_monitorable_problem_store() : NIL);
			SubLObject staleP = mode.eql($kw$LATEST_INFERENCE) ? makeBoolean(!inference.eql(latest))
					: (mode.eql($kw$LATEST_PROBLEM_STORE) ? makeBoolean(!problem_store.eql(latest)) : NIL);
			html_utilities.html_markup($str31$__DOCTYPE_html_PUBLIC_____W3C__DT);
			if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
				html_utilities.html_source_readability_terpri(UNPROVIDED);
				html_utilities.html_markup($str32$_meta_http_equiv__X_UA_Compatible);
			}
			html_utilities.html_source_readability_terpri(UNPROVIDED);
			SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
				if (NIL != staleP) {
					inference_monitor_info($str77$Updating_stale_inference_monitor_, latest,
							(NIL != inference) ? inference : problem_store, UNPROVIDED, UNPROVIDED);
					update_cb_monitor_latest_frame(latest, mode);
					SubLObject pcase_var = mode;
					if (pcase_var.eql($kw$LATEST_INFERENCE)) {
						inference_id_string = print_high
								.princ_to_string(inference_datastructures_inference.inference_suid(latest));
						store_id_string = print_high
								.princ_to_string(inference_datastructures_problem_store.problem_store_suid(
										inference_datastructures_inference.inference_problem_store(latest)));
					} else if (pcase_var.eql($kw$LATEST_PROBLEM_STORE)) {
						store_id_string = print_high
								.princ_to_string(inference_datastructures_problem_store.problem_store_suid(latest));
					}
				}
				SubLObject content = Sequences.cconcatenate($str78$10__URL_cg_cb_inference_monitor_r,
						new SubLObject[] { format_nil.format_nil_a_no_copy(store_id_string), $str79$_,
								format_nil.format_nil_a_no_copy(inference_id_string), $str79$_,
								format_nil.format_nil_s_no_copy(mode) });
				html_utilities.html_source_readability_terpri(UNPROVIDED);
				html_utilities.html_markup(html_macros.$html_meta_head$.getGlobalValue());
				html_utilities.html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
				html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup($str80$Refresh);
				html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
				if (NIL != content) {
					html_utilities.html_markup(html_macros.$html_meta_content$.getGlobalValue());
					html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(content);
					html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
				}
				html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
				html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_utilities.html_source_readability_terpri(UNPROVIDED);
				SubLObject _prev_bind_0_$13 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
					html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
					SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_source_readability_terpri(UNPROVIDED);
						html_utilities.html_copyright_notice();
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
					}
					html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$13, thread);
				}
				html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
			} finally {
				cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
			}
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		} else {
			cdestructuring_bind.cdestructuring_bind_error(args, $list49);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 15900L)
	public static SubLObject do_problem_stores_descending(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list82);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject store = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list82);
		store = current.first();
		current = current.rest();
		if (NIL == current) {
			SubLObject body;
			current = (body = temp);
			SubLObject start = $sym83$START;
			SubLObject i = $sym84$I;
			return list($sym$CLET, list(reader.bq_cons(start, $list86)),
					list($sym87$DO_NUMBERS, listS(i, $kw$START, start, $list89),
							list($sym$CLET, list(list(store, list($sym90$FIND_PROBLEM_STORE_BY_ID, i))),
									listS($sym91$PWHEN, store, append(body, NIL)))));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, $list82);
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 16300L)
	public static SubLObject latest_monitorable_problem_store() {
		SubLObject start = id_index.id_index_next_id(inference_datastructures_problem_store.problem_store_id_index());
		SubLObject end_var;
		SubLObject i;
		SubLObject store;
		for (end_var = MINUS_ONE_INTEGER, i = NIL, i = start; !i.numLE(end_var); i = Numbers.add(i,
				MINUS_ONE_INTEGER)) {
			store = inference_datastructures_problem_store.find_problem_store_by_id(i);
			if ((NIL != store) && (NIL != problem_store_monitorableP(store)))
				return store;
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 16500L)
	public static SubLObject problem_store_monitorableP(SubLObject store) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject badP = Equality.eql(ZERO_INTEGER,
				inference_datastructures_problem_store.problem_store_inference_count(store));
		SubLObject err_msg = NIL;
		try {
			thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
			SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
				Errors.$error_handler$.bind($sym92$CATCH_ERROR_MESSAGE_HANDLER, thread);
				try {
					SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
					if (NIL == id_index.id_index_objects_empty_p(idx, $kw$SKIP)) {
						SubLObject idx_$15 = idx;
						if (NIL == id_index.id_index_dense_objects_empty_p(idx_$15, $kw$SKIP)) {
							SubLObject vector_var = id_index.id_index_dense_objects(idx_$15);
							SubLObject backwardP_var = NIL;
							SubLObject length = Sequences.length(vector_var);
							SubLObject current;
							SubLObject datum = current = (NIL != backwardP_var)
									? list(Numbers.subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER)
									: list(ZERO_INTEGER, length, ONE_INTEGER);
							SubLObject start = NIL;
							SubLObject end = NIL;
							SubLObject delta = NIL;
							cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list94);
							start = current.first();
							current = current.rest();
							cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list94);
							end = current.first();
							current = current.rest();
							cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list94);
							delta = current.first();
							current = current.rest();
							if (NIL == current) {
								if (NIL == badP) {
									SubLObject end_var;
									SubLObject id;
									SubLObject inference;
									for (end_var = end, id = NIL, id = start; (NIL == badP)
											&& (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = Numbers
													.add(id, delta)) {
										inference = Vectors.aref(vector_var, id);
										if ((NIL == id_index.id_index_tombstone_p(inference))
												|| (NIL == id_index.id_index_skip_tombstones_p($kw$SKIP))) {
											if (NIL != id_index.id_index_tombstone_p(inference)) {
												inference = $kw$SKIP;
											}
											if (NIL == inference_monitorableP(inference)) {
												badP = T;
											}
										}
									}
								}
							} else {
								cdestructuring_bind.cdestructuring_bind_error(datum, $list94);
							}
						}
						SubLObject idx_$16 = idx;
						if ((NIL == id_index.id_index_sparse_objects_empty_p(idx_$16)) && (NIL == badP)) {
							SubLObject catch_var = NIL;
							try {
								thread.throwStack.push($kw$DO_HASH_TABLE);
								SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$16);
								SubLObject id2 = NIL;
								SubLObject inference2 = NIL;
								Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
								try {
									while (Hashtables.iteratorHasNext(cdohash_iterator)) {
										Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
										id2 = Hashtables.getEntryKey(cdohash_entry);
										inference2 = Hashtables.getEntryValue(cdohash_entry);
										subl_macros.do_hash_table_done_check(badP);
										if (NIL == inference_monitorableP(inference2)) {
											badP = T;
										}
									}
								} finally {
									Hashtables.releaseEntrySetIterator(cdohash_iterator);
								}
							} catch (Throwable ccatch_env_var) {
								catch_var = Errors.handleThrowable(ccatch_env_var, $kw$DO_HASH_TABLE);
							} finally {
								thread.throwStack.pop();
							}
						}
					}
				} catch (Throwable catch_var2) {
					Errors.handleThrowable(catch_var2, NIL);
				}
			} finally {
				Errors.$error_handler$.rebind(_prev_bind_0, thread);
			}
		} catch (Throwable ccatch_env_var2) {
			err_msg = Errors.handleThrowable(ccatch_env_var2,
					subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
		} finally {
			thread.throwStack.pop();
		}
		return makeBoolean((NIL == err_msg) && (NIL == badP));
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 16800L)
	public static SubLObject latest_monitorable_inference() {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ignore_errors_tag = NIL;
		try {
			thread.throwStack.push($kw$IGNORE_ERRORS_TARGET);
			SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
				Errors.$error_handler$.bind(Symbols.symbol_function($sym97$IGNORE_ERRORS_HANDLER), thread);
				try {
					SubLObject start = id_index
							.id_index_next_id(inference_datastructures_problem_store.problem_store_id_index());
					SubLObject end_var;
					SubLObject i;
					SubLObject store;
					SubLObject ignore_errors_tag_$17;
					SubLObject _prev_bind_0_$18;
					SubLObject latest_id;
					SubLObject latest_inference;
					SubLObject idx;
					SubLObject idx_$19;
					SubLObject vector_var;
					SubLObject backwardP_var;
					SubLObject length;
					SubLObject v_iteration;
					SubLObject id;
					SubLObject inference;
					SubLObject ignore_errors_tag_$18;
					SubLObject _prev_bind_0_$19;
					SubLObject id_$22;
					SubLObject idx_$20;
					SubLObject cdohash_table;
					SubLObject id2;
					SubLObject inference2;
					Iterator cdohash_iterator;
					Map.Entry cdohash_entry;
					SubLObject ignore_errors_tag_$19;
					SubLObject _prev_bind_0_$20;
					SubLObject id_$23;
					for (end_var = MINUS_ONE_INTEGER, i = NIL, i = start; !i.numLE(end_var); i = Numbers.add(i,
							MINUS_ONE_INTEGER)) {
						store = inference_datastructures_problem_store.find_problem_store_by_id(i);
						if (NIL != store) {
							ignore_errors_tag_$17 = NIL;
							try {
								thread.throwStack.push($kw$IGNORE_ERRORS_TARGET);
								_prev_bind_0_$18 = Errors.$error_handler$.currentBinding(thread);
								try {
									Errors.$error_handler$.bind(Symbols.symbol_function($sym97$IGNORE_ERRORS_HANDLER),
											thread);
									try {
										latest_id = MINUS_ONE_INTEGER;
										latest_inference = NIL;
										idx = inference_datastructures_problem_store
												.problem_store_inference_id_index(store);
										if (NIL == id_index.id_index_objects_empty_p(idx, $kw$SKIP)) {
											idx_$19 = idx;
											if (NIL == id_index.id_index_dense_objects_empty_p(idx_$19, $kw$SKIP)) {
												vector_var = id_index.id_index_dense_objects(idx_$19);
												backwardP_var = NIL;
												for (length = Sequences.length(
														vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration
																.numL(length); v_iteration = Numbers.add(v_iteration,
																		ONE_INTEGER)) {
													id = ((NIL != backwardP_var)
															? Numbers.subtract(length, v_iteration, ONE_INTEGER)
															: v_iteration);
													inference = Vectors.aref(vector_var, id);
													if ((NIL == id_index.id_index_tombstone_p(inference))
															|| (NIL == id_index.id_index_skip_tombstones_p($kw$SKIP))) {
														if (NIL != id_index.id_index_tombstone_p(inference)) {
															inference = $kw$SKIP;
														}
														ignore_errors_tag_$18 = NIL;
														try {
															thread.throwStack.push($kw$IGNORE_ERRORS_TARGET);
															_prev_bind_0_$19 = Errors.$error_handler$
																	.currentBinding(thread);
															try {
																Errors.$error_handler$.bind(Symbols.symbol_function(
																		$sym97$IGNORE_ERRORS_HANDLER), thread);
																try {
																	if (NIL != inference_monitorableP(inference)) {
																		id_$22 = inference_datastructures_inference
																				.inference_suid(inference);
																		if (id_$22.numG(latest_id)) {
																			latest_inference = inference;
																			latest_id = id_$22;
																		}
																	}
																} catch (Throwable catch_var) {
																	Errors.handleThrowable(catch_var, NIL);
																}
															} finally {
																Errors.$error_handler$.rebind(_prev_bind_0_$19, thread);
															}
														} catch (Throwable ccatch_env_var) {
															ignore_errors_tag_$18 = Errors.handleThrowable(
																	ccatch_env_var, $kw$IGNORE_ERRORS_TARGET);
														} finally {
															thread.throwStack.pop();
														}
													}
												}
											}
											idx_$20 = idx;
											if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$20)) {
												cdohash_table = id_index.id_index_sparse_objects(idx_$20);
												id2 = NIL;
												inference2 = NIL;
												cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
												try {
													while (Hashtables.iteratorHasNext(cdohash_iterator)) {
														cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
														id2 = Hashtables.getEntryKey(cdohash_entry);
														inference2 = Hashtables.getEntryValue(cdohash_entry);
														ignore_errors_tag_$19 = NIL;
														try {
															thread.throwStack.push($kw$IGNORE_ERRORS_TARGET);
															_prev_bind_0_$20 = Errors.$error_handler$
																	.currentBinding(thread);
															try {
																Errors.$error_handler$.bind(Symbols.symbol_function(
																		$sym97$IGNORE_ERRORS_HANDLER), thread);
																try {
																	if (NIL == inference_monitorableP(inference2)) {
																		continue;
																	}
																	id_$23 = inference_datastructures_inference
																			.inference_suid(inference2);
																	if (!id_$23.numG(latest_id)) {
																		continue;
																	}
																	latest_inference = inference2;
																	latest_id = id_$23;
																} catch (Throwable catch_var2) {
																	Errors.handleThrowable(catch_var2, NIL);
																}
															} finally {
																Errors.$error_handler$.rebind(_prev_bind_0_$20, thread);
															}
														} catch (Throwable ccatch_env_var2) {
															ignore_errors_tag_$19 = Errors.handleThrowable(
																	ccatch_env_var2, $kw$IGNORE_ERRORS_TARGET);
														} finally {
															thread.throwStack.pop();
														}
													}
												} finally {
													Hashtables.releaseEntrySetIterator(cdohash_iterator);
												}
											}
										}
										if (NIL != latest_inference)
											return latest_inference;
									} catch (Throwable catch_var3) {
										Errors.handleThrowable(catch_var3, NIL);
									}
								} finally {
									Errors.$error_handler$.rebind(_prev_bind_0_$18, thread);
								}
							} catch (Throwable ccatch_env_var3) {
								ignore_errors_tag_$17 = Errors.handleThrowable(ccatch_env_var3,
										$kw$IGNORE_ERRORS_TARGET);
							} finally {
								thread.throwStack.pop();
							}
						}
					}
				} catch (Throwable catch_var4) {
					Errors.handleThrowable(catch_var4, NIL);
				}
			} finally {
				Errors.$error_handler$.rebind(_prev_bind_0, thread);
			}
		} catch (Throwable ccatch_env_var4) {
			ignore_errors_tag = Errors.handleThrowable(ccatch_env_var4, $kw$IGNORE_ERRORS_TARGET);
		} finally {
			thread.throwStack.pop();
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 17300L)
	public static SubLObject write_inference_monitor_args(SubLObject store_or_inference, SubLObject mode) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject inference = (NIL != inference_datastructures_inference.inference_p(store_or_inference))
				? store_or_inference
				: NIL;
		SubLObject store = (NIL != inference) ? inference_datastructures_inference.inference_problem_store(inference)
				: ((NIL != inference_datastructures_problem_store.problem_store_p(store_or_inference))
						? store_or_inference
						: NIL);
		SubLObject maxloc = (NIL != inference) ? inference_metrics.inference_tick_count(inference)
				: ((NIL != store) ? problem_store_tick_count_total(store) : $str75$null);
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_script_type$.getGlobalValue());
		html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
		html_utilities.html_markup($str98$text_javascript);
		html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
		html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str99$var_problemStoreId_____A___var_in,
					new SubLObject[] {
							(NIL != store) ? inference_datastructures_problem_store.problem_store_suid(store)
									: $str75$null,
							(NIL != inference) ? inference_datastructures_inference.inference_suid(inference)
									: $str75$null,
							maxloc, mode });
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
		return store_or_inference;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 18100L)
	public static SubLObject problem_store_tick_count_total(SubLObject store) {
		SubLObject count = ZERO_INTEGER;
		SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
		if (NIL == id_index.id_index_objects_empty_p(idx, $kw$SKIP)) {
			SubLObject idx_$27 = idx;
			if (NIL == id_index.id_index_dense_objects_empty_p(idx_$27, $kw$SKIP)) {
				SubLObject vector_var = id_index.id_index_dense_objects(idx_$27);
				SubLObject backwardP_var = NIL;
				SubLObject length;
				SubLObject v_iteration;
				SubLObject id;
				SubLObject inference;
				for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration
						.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
					id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
					inference = Vectors.aref(vector_var, id);
					if ((NIL == id_index.id_index_tombstone_p(inference))
							|| (NIL == id_index.id_index_skip_tombstones_p($kw$SKIP))) {
						if (NIL != id_index.id_index_tombstone_p(inference)) {
							inference = $kw$SKIP;
						}
						count = Numbers.add(count, inference_metrics.inference_tick_count(inference));
					}
				}
			}
			SubLObject idx_$28 = idx;
			if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$28)) {
				SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$28);
				SubLObject id2 = NIL;
				SubLObject inference2 = NIL;
				Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
				try {
					while (Hashtables.iteratorHasNext(cdohash_iterator)) {
						Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
						id2 = Hashtables.getEntryKey(cdohash_entry);
						inference2 = Hashtables.getEntryValue(cdohash_entry);
						count = Numbers.add(count, inference_metrics.inference_tick_count(inference2));
					}
				} finally {
					Hashtables.releaseEntrySetIterator(cdohash_iterator);
				}
			}
		}
		return count;
	}

	@SubL(source = "cycl/inference/browser/cb-inference-monitors.lisp", position = 18300L)
	public static SubLObject get_inference_monitor_html() {
		return string_utilities.read_string_from_file(
				file_utilities.cyc_home_filename($list100, $str101$inference_monitor, $str102$html), UNPROVIDED,
				UNPROVIDED);
	}

	public static SubLObject declare_cb_inference_monitors_file() {
		declareFunction(myName, "cb_monitor_inference", "CB-MONITOR-INFERENCE", 1, 0, false);
		declareFunction(myName, "cb_monitor_problem_store", "CB-MONITOR-PROBLEM-STORE", 1, 0, false);
		declareFunction(myName, "cb_monitor_all_inferences", "CB-MONITOR-ALL-INFERENCES", 1, 0, false);
		declareFunction(myName, "cb_link_monitor_inference", "CB-LINK-MONITOR-INFERENCE", 1, 1, false);
		declareFunction(myName, "inference_monitorableP", "INFERENCE-MONITORABLE?", 1, 0, false);
		declareFunction(myName, "inference_monitor_head_script", "INFERENCE-MONITOR-HEAD-SCRIPT", 0, 0, false);
		declareFunction(myName, "inference_monitor_tail_script", "INFERENCE-MONITOR-TAIL-SCRIPT", 0, 0, false);
		declareFunction(myName, "inference_monitor_tree_script", "INFERENCE-MONITOR-TREE-SCRIPT", 0, 0, false);
		declareFunction(myName, "inference_monitor_user_table_script", "INFERENCE-MONITOR-USER-TABLE-SCRIPT", 0, 0,
				false);
		declareFunction(myName, "cb_monitor_inference_guts", "CB-MONITOR-INFERENCE-GUTS", 2, 0, false);
		declareFunction(myName, "inference_monitor_info", "INFERENCE-MONITOR-INFO", 1, 4, false);
		declareFunction(myName, "inference_monitor_warn", "INFERENCE-MONITOR-WARN", 1, 4, false);
		declareFunction(myName, "cb_inference_monitor_frame", "CB-INFERENCE-MONITOR-FRAME", 1, 0, false);
		declareFunction(myName, "html_output_inference_monitor_focal_object",
				"HTML-OUTPUT-INFERENCE-MONITOR-FOCAL-OBJECT", 2, 0, false);
		declareFunction(myName, "clear_inference_monitor_focal_object_html",
				"CLEAR-INFERENCE-MONITOR-FOCAL-OBJECT-HTML", 0, 0, false);
		declareFunction(myName, "remove_inference_monitor_focal_object_html",
				"REMOVE-INFERENCE-MONITOR-FOCAL-OBJECT-HTML", 2, 0, false);
		declareFunction(myName, "inference_monitor_focal_object_html_internal",
				"INFERENCE-MONITOR-FOCAL-OBJECT-HTML-INTERNAL", 2, 0, false);
		declareFunction(myName, "inference_monitor_focal_object_html", "INFERENCE-MONITOR-FOCAL-OBJECT-HTML", 2, 0,
				false);
		declareFunction(myName, "html_output_inference_monitor_focal_object_internal",
				"HTML-OUTPUT-INFERENCE-MONITOR-FOCAL-OBJECT-INTERNAL", 2, 0, false);
		declareFunction(myName, "show_inference_monitor_focal_object_paraphrase",
				"SHOW-INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE", 2, 0, false);
		declareFunction(myName, "clear_inference_monitor_focal_object_paraphrase",
				"CLEAR-INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE", 0, 0, false);
		declareFunction(myName, "remove_inference_monitor_focal_object_paraphrase",
				"REMOVE-INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE", 2, 0, false);
		declareFunction(myName, "inference_monitor_focal_object_paraphrase_internal",
				"INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE-INTERNAL", 2, 0, false);
		declareFunction(myName, "inference_monitor_focal_object_paraphrase",
				"INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE", 2, 0, false);
		declareFunction(myName, "construct_cb_monitor_refresh_template", "CONSTRUCT-CB-MONITOR-REFRESH-TEMPLATE", 2, 0,
				false);
		declareFunction(myName, "update_cb_monitor_latest_frame", "UPDATE-CB-MONITOR-LATEST-FRAME", 2, 0, false);
		declareFunction(myName, "cb_inference_monitor_refresh_frame", "CB-INFERENCE-MONITOR-REFRESH-FRAME", 1, 0,
				false);
		declareMacro(me, "do_problem_stores_descending", "DO-PROBLEM-STORES-DESCENDING");
		declareFunction(myName, "latest_monitorable_problem_store", "LATEST-MONITORABLE-PROBLEM-STORE", 0, 0, false);
		declareFunction(myName, "problem_store_monitorableP", "PROBLEM-STORE-MONITORABLE?", 1, 0, false);
		declareFunction(myName, "latest_monitorable_inference", "LATEST-MONITORABLE-INFERENCE", 0, 0, false);
		declareFunction(myName, "write_inference_monitor_args", "WRITE-INFERENCE-MONITOR-ARGS", 2, 0, false);
		declareFunction(myName, "problem_store_tick_count_total", "PROBLEM-STORE-TICK-COUNT-TOTAL", 1, 0, false);
		declareFunction(myName, "get_inference_monitor_html", "GET-INFERENCE-MONITOR-HTML", 0, 0, false);
		return NIL;
	}

	public static SubLObject init_cb_inference_monitors_file() {
		$cb_inference_monitor_style$ = deflexical("*CB-INFERENCE-MONITOR-STYLE*",
				$str29$______selection___background_tran);
		$inference_monitors_debug_level$ = defparameter("*INFERENCE-MONITORS-DEBUG-LEVEL*", $kw$OFF);
		$inference_monitor_focal_object_html_caching_state$ = SubLFiles
				.deflexical("*INFERENCE-MONITOR-FOCAL-OBJECT-HTML-CACHING-STATE*", NIL);
		$inference_monitor_focal_object_paraphrase_caching_state$ = SubLFiles
				.deflexical("*INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE-CACHING-STATE*", NIL);
		$cb_inference_monitor_inference_id_param$ = deflexical("*CB-INFERENCE-MONITOR-INFERENCE-ID-PARAM*",
				$str68$_INFID_);
		$cb_inference_monitor_store_id_param$ = deflexical("*CB-INFERENCE-MONITOR-STORE-ID-PARAM*", $str69$_STOREID_);
		$cb_inference_monitor_mode_param$ = deflexical("*CB-INFERENCE-MONITOR-MODE-PARAM*", $str70$_MODE_);
		$cb_inference_monitor_param$ = deflexical("*CB-INFERENCE-MONITOR-PARAM*", $str71$_INFMON_);
		$cb_monitor_latest_inference_refresh_timeout_param$ = SubLFiles
				.deflexical("*CB-MONITOR-LATEST-INFERENCE-REFRESH-TIMEOUT-PARAM*", $str72$_TIMEOUT_);
		$cb_monitor_latest_inference_refresh_timeout$ = SubLFiles
				.deflexical("*CB-MONITOR-LATEST-INFERENCE-REFRESH-TIMEOUT*", $int73$1000);
		$cb_latest_inference_refresh_template$ = deflexical("*CB-LATEST-INFERENCE-REFRESH-TEMPLATE*",
				$str74$_function_perform_refresh_inferen);
		return NIL;
	}

	public static SubLObject setup_cb_inference_monitors_file() {
		html_macros.note_cgi_handler_function($sym3$CB_MONITOR_INFERENCE, $kw$HTML_HANDLER);
		html_macros.note_cgi_handler_function($sym8$CB_MONITOR_PROBLEM_STORE, $kw$HTML_HANDLER);
		html_macros.note_cgi_handler_function($sym10$CB_MONITOR_ALL_INFERENCES, $kw$HTML_HANDLER);
		cyc_navigator_internals.def_navigator_link($kw$MONITOR_ALL_INFERENCES, $kw$TEXT, $list13,
				$str14$cb_monitor_all_inferences, ZERO_INTEGER, $kw$BLANK, $str16$Monitor_All_Inferences, UNPROVIDED,
				UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		cb_utilities.setup_cb_link_method($kw$MONITOR_INFERENCE, $sym23$CB_LINK_MONITOR_INFERENCE, TWO_INTEGER);
		cb_utilities.register_cb_frame($kw$INFMON, $str39$infmon, $str40$cb_inference_monitor_frame, $str41$__a__a__s,
				UNPROVIDED, UNPROVIDED);
		cb_utilities.register_cb_frame($kw$INFMONREFRESH, $str43$infmonrefresh,
				$str44$cb_inference_monitor_refresh_fram, $str41$__a__a__s, UNPROVIDED, UNPROVIDED);
		html_macros.note_cgi_handler_function($sym55$CB_INFERENCE_MONITOR_FRAME, $kw$HTML_HANDLER);
		memoization_state.note_globally_cached_function($sym56$INFERENCE_MONITOR_FOCAL_OBJECT_HTML);
		memoization_state.note_globally_cached_function($sym63$INFERENCE_MONITOR_FOCAL_OBJECT_PARAPHRASE);
		html_macros.note_cgi_handler_function($sym81$CB_INFERENCE_MONITOR_REFRESH_FRAME, $kw$HTML_HANDLER);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_cb_inference_monitors_file();
	}

	@Override
	public void initializeVariables() {
		init_cb_inference_monitors_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_cb_inference_monitors_file();
	}

	static {
		me = new cb_inference_monitors();
		$cb_inference_monitor_style$ = null;
		$inference_monitors_debug_level$ = null;
		$inference_monitor_focal_object_html_caching_state$ = null;
		$inference_monitor_focal_object_paraphrase_caching_state$ = null;
		$cb_inference_monitor_inference_id_param$ = null;
		$cb_inference_monitor_store_id_param$ = null;
		$cb_inference_monitor_mode_param$ = null;
		$cb_inference_monitor_param$ = null;
		$cb_monitor_latest_inference_refresh_timeout_param$ = null;
		$cb_monitor_latest_inference_refresh_timeout$ = null;
		$cb_latest_inference_refresh_template$ = null;
		$list0 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"));
		$str1$_A_did_not_specify_an_inference = makeString("~A did not specify an inference");
		$kw$INFERENCE = makeKeyword("INFERENCE");
		$sym3$CB_MONITOR_INFERENCE = makeSymbol("CB-MONITOR-INFERENCE");
		$kw$HTML_HANDLER = makeKeyword("HTML-HANDLER");
		$list5 = list(makeSymbol("STORE-ID-STRING"));
		$str6$_A_did_not_specify_a_problem_stor = makeString("~A did not specify a problem store");
		$kw$PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
		$sym8$CB_MONITOR_PROBLEM_STORE = makeSymbol("CB-MONITOR-PROBLEM-STORE");
		$kw$LATEST_INFERENCE = makeKeyword("LATEST-INFERENCE");
		$sym10$CB_MONITOR_ALL_INFERENCES = makeSymbol("CB-MONITOR-ALL-INFERENCES");
		$kw$MONITOR_ALL_INFERENCES = makeKeyword("MONITOR-ALL-INFERENCES");
		$kw$TEXT = makeKeyword("TEXT");
		$list13 = list(makeKeyword("INFERENCE"));
		$str14$cb_monitor_all_inferences = makeString("cb-monitor-all-inferences");
		$kw$BLANK = makeKeyword("BLANK");
		$str16$Monitor_All_Inferences = makeString("Monitor All Inferences");
		$str17$_Monitor_ = makeString("[Monitor]");
		$str18$_Re_run_and_Monitor_ = makeString("[Re-run and Monitor]");
		$kw$NEW = makeKeyword("NEW");
		$kw$SELF = makeKeyword("SELF");
		$str21$cb_monitor_inference__A__A = makeString("cb-monitor-inference&~A&~A");
		$kw$MONITOR_INFERENCE = makeKeyword("MONITOR-INFERENCE");
		$sym23$CB_LINK_MONITOR_INFERENCE = makeSymbol("CB-LINK-MONITOR-INFERENCE");
		$kw$TICK_INDEXED_PROGRESS_DATA = makeKeyword("TICK-INDEXED-PROGRESS-DATA");
		$kw$INFERENCE_MONITOR_HEAD = makeKeyword("INFERENCE-MONITOR-HEAD");
		$kw$INFERENCE_MONITOR_TAIL = makeKeyword("INFERENCE-MONITOR-TAIL");
		$kw$INFERENCE_MONITOR_TREE = makeKeyword("INFERENCE-MONITOR-TREE");
		$kw$INFERENCE_MONITOR_USER_TABLE = makeKeyword("INFERENCE-MONITOR-USER-TABLE");
		$str29$______selection___background_tran = makeString(
				"\n\n *::selection { background:transparent; }\n  *::-moz-selection { background:transparent; }\n  *::-webkit-selection { background:transparent; }\n  font {\n    -moz-transition: width .25s, top .75s, left .75s, background-color .125s; \n    -webkit-transition: width .25s, top .75s, left .75s, background-color .125s; \n    -o-transition: width .25s, top .75s, left .75s, background-color .125s; \n    -moz-border-radius: 5px; border-radius: 5px;\n  }\n  .hoverclass:hover { background-color:#999999; } \n  .bluhoverclass { color:#9999ff }\n  .bluhoverclass:hover { background-color:#999999; } \n  .hilite { padding:3; color:white; background-color:orange; border:outset red 3px; z-index:200; font-size:8pt; opacity:0.9; }\n  .nolite { padding:3; color:white; background-color:#003000; border:solid purple 1px; z-index:101; font-size:8pt; opacity:0.4; }\n  .outfamilynolite { padding:3; color:gray; background-color:#dddddd; border:solid purple 1px; z-index:101; font-size:8pt; opacity:0.4; }\n  .newnode { padding:3; color:white; background-color:darkblue; border:solid black 1px; opacity:0.6; \n    -moz-transition: width 0s, top 0s, left 0s, background-color 0s; \n    -webkit-transition: width 0s, top 0s, left 0s, background-color 0s; \n    -o-transition: width 0s, top 0s, left 0s, background-color 0s; \n  }\n  .hideme { padding:3; color:#ffffff; background-color:#c0c0c0; border:solid black 1px; opacity:0.6; }\n  .beadhilite { height: 0; width 0; padding:0; color:#000000; background-color:#000000; border:solid orange 3px; font-size:0pt; }\n  .beadnolite { height: 0; width 0; padding:0; color:#000000; background-color:#000000; border:solid black 3px; font-size:0pt; }\n  .outfamilybeadnolite { height: 0; width 0; padding:0; color:#000000; background-color:#dddddd; border:solid #dddddd 3px; font-size:0pt; }\n  .newbeadnode { height: 0; width 0; padding:3; color:white; background-color:darkblue; border:solid black 1px; \n    -moz-transition: width 0s, top 0s, left 0s, background-color 0s; \n    -webkit-transition: width 0s, top 0s, left 0s, background-color 0s; \n    -o-transition: width 0s, top 0s, left 0s, background-color 0s; \n  }\n  .rootbead { height: 0; width 0; padding:3; color:white; background-color:white; border:solid gray 5px; }\n  .rootnode { padding:3; color:white; background-color:gray; border:solid black 5px; opacity:0.6; font-size:7pt;\n    -moz-transition: width 0s, top 0s, left 0s, background-color 0s; \n    -webkit-transition: width 0s, top 0s, left 0s, background-color 0s; \n    -o-transition: width 0s, top 0s, left 0s, background-color 0s; \n  }\n  .showfamily { padding:3; color:purple; background-color:white; border:solid green 1px; }\n  div { \n    box-shadow: 5px 5px 5px #888888; font-size:8pt;\n    -moz-border-radius: 15px; border-radius: 5px;\n  }\n  textarea { \n    box-shadow: 5px 5px 5px #888888; font-size:8pt; border: solid black 1px;\n    -moz-border-radius: 15px; border-radius: 5px;\n  }\n  input { font-size:8pt }\n  .buttclass { background-color: #bbbbbb }\n  .onbuttonmode { background-color:#ffffff; } \n  td { font-size:8pt }\n  canvas { \n    box-shadow: 5px 5px 5px #888888; \n    -moz-border-radius: 15px; border-radius: 5px;\n  }\n\n  .disabled .animationControl {visibility: hidden; }\n\n  .showadvanced .advanced { visibility: inherit; }\n  .advanced               { visibility: hidden; }\n  #debug                  { visibility: hidden; }\n  .showbulbsandlines#bulbsandlines { visibility: inherit; }\n  #bulbsandlines                   { visibility: hidden; }\n  .counter.focal          { background: beige; }\n  .counter                { background: #EEEEEE; cursor: default; }");
		$kw$METRICS = makeKeyword("METRICS");
		$str31$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString(
				"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
		$str32$_meta_http_equiv__X_UA_Compatible = makeString(
				"<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
		$kw$UNINITIALIZED = makeKeyword("UNINITIALIZED");
		$kw$CB_CYC = makeKeyword("CB-CYC");
		$str35$Inference_Monitor = makeString("Inference Monitor");
		$str36$Cannot_have_a_FRAMESET_tag_inside = makeString("Cannot have a FRAMESET tag inside a BODY tag.");
		$str37$__0 = makeString("*,0");
		$kw$INFMON = makeKeyword("INFMON");
		$str39$infmon = makeString("infmon");
		$str40$cb_inference_monitor_frame = makeString("cb-inference-monitor-frame");
		$str41$__a__a__s = makeString("&~a&~a&~s");
		$kw$INFMONREFRESH = makeKeyword("INFMONREFRESH");
		$str43$infmonrefresh = makeString("infmonrefresh");
		$str44$cb_inference_monitor_refresh_fram = makeString("cb-inference-monitor-refresh-frame");
		$kw$OFF = makeKeyword("OFF");
		$kw$INFO = makeKeyword("INFO");
		$list47 = list(makeKeyword("INFO"), makeKeyword("WARN"));
		$str48$CB_INFERENCE_MONITOR_FRAME_args__ = makeString("CB-INFERENCE-MONITOR-FRAME args: ~S");
		$list49 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"), makeSymbol("MODE-STRING"));
		$str50$spacerdiv = makeString("spacerdiv");
		$str51$height_1400px_box_shadow_none_ = makeString("height:1400px;box-shadow:none;");
		$str52$focalobjlabel = makeString("focalobjlabel");
		$str53$box_shadow_none__font_size_large_ = makeString("box-shadow:none; font-size:large;");
		$str54$Monitoring__S = makeString("Monitoring ~S");
		$sym55$CB_INFERENCE_MONITOR_FRAME = makeSymbol("CB-INFERENCE-MONITOR-FRAME");
		$sym56$INFERENCE_MONITOR_FOCAL_OBJECT_HTML = makeSymbol("INFERENCE-MONITOR-FOCAL-OBJECT-HTML");
		$str57$New_label___S_ = makeString("New label: ~S ");
		$sym58$_INFERENCE_MONITOR_FOCAL_OBJECT_HTML_CACHING_STATE_ = makeSymbol(
				"*INFERENCE-MONITOR-FOCAL-OBJECT-HTML-CACHING-STATE*");
		$str59$Deducing_new_facts = makeString("Deducing new facts");
		$str60$_from = makeString(" from");
		$str61$_ = makeString(".");
		$kw$INTERROGATIVE = makeKeyword("INTERROGATIVE");
		$sym63$INFERENCE_MONITOR_FOCAL_OBJECT_PARAPHRASE = makeSymbol("INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE");
		$kw$HTML = makeKeyword("HTML");
		$kw$NONE = makeKeyword("NONE");
		$sym66$_EXIT = makeSymbol("%EXIT");
		$sym67$_INFERENCE_MONITOR_FOCAL_OBJECT_PARAPHRASE_CACHING_STATE_ = makeSymbol(
				"*INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE-CACHING-STATE*");
		$str68$_INFID_ = makeString("%INFID%");
		$str69$_STOREID_ = makeString("%STOREID%");
		$str70$_MODE_ = makeString("%MODE%");
		$str71$_INFMON_ = makeString("%INFMON%");
		$str72$_TIMEOUT_ = makeString("%TIMEOUT%");
		$int73$1000 = makeInteger(1000);
		$str74$_function_perform_refresh_inferen = makeString(
				"\nfunction perform_refresh_inference_monitor() {\n   //alert('refreshing inference monitor based on '+ %STOREID% + ' ' + %INFID%);\n   self.parent.frames['%INFMON%'].location.search \n    = 'cb-inference-monitor-frame&' + %STOREID% + '&' + %INFID% + '&%MODE%';\n  }\n\nwindow.setTimeout( 'perform_refresh_inference_monitor();', %TIMEOUT%);\n\n");
		$str75$null = makeString("null");
		$kw$LATEST_PROBLEM_STORE = makeKeyword("LATEST-PROBLEM-STORE");
		$str77$Updating_stale_inference_monitor_ = makeString("Updating stale inference monitor to ~S~% from ~S");
		$str78$10__URL_cg_cb_inference_monitor_r = makeString("10; URL=cg?cb-inference-monitor-refresh-frame&");
		$str79$_ = makeString("&");
		$str80$Refresh = makeString("Refresh");
		$sym81$CB_INFERENCE_MONITOR_REFRESH_FRAME = makeSymbol("CB-INFERENCE-MONITOR-REFRESH-FRAME");
		$list82 = list(list(makeSymbol("STORE")), makeSymbol("&BODY"), makeSymbol("BODY"));
		$sym83$START = makeUninternedSymbol("START");
		$sym84$I = makeUninternedSymbol("I");
		$sym$CLET = makeSymbol("CLET");
		$list86 = list(list(makeSymbol("ID-INDEX-NEXT-ID"), list(makeSymbol("PROBLEM-STORE-ID-INDEX"))));
		$sym87$DO_NUMBERS = makeSymbol("DO-NUMBERS");
		$kw$START = makeKeyword("START");
		$list89 = list(makeKeyword("END"), MINUS_ONE_INTEGER, makeKeyword("DELTA"), MINUS_ONE_INTEGER);
		$sym90$FIND_PROBLEM_STORE_BY_ID = makeSymbol("FIND-PROBLEM-STORE-BY-ID");
		$sym91$PWHEN = makeSymbol("PWHEN");
		$sym92$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
		$kw$SKIP = makeKeyword("SKIP");
		$list94 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));
		$kw$DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");
		$kw$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
		$sym97$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
		$str98$text_javascript = makeString("text/javascript");
		$str99$var_problemStoreId_____A___var_in = makeString(
				"var problemStoreId = '~A';\nvar inferenceID = '~A';\nmaxloc = ~A;\nmode = '~S';");
		$list100 = list(makeString("httpd"), makeString("htdocs"), makeString("cycdoc"));
		$str101$inference_monitor = makeString("inference-monitor");
		$str102$html = makeString("html");
	}
}
/*
 *
 * Total time: 531 ms
 *
 */