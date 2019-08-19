/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc. All rights reserved. module:
 * KB-ACTION-TO-UIA-TRAMPOLINES source file:
 * /cyc/top/cycl/kb-action-to-uia-trampolines.lisp created: 2019/07/03 17:37:58
 */
public final class kb_action_to_uia_trampolines extends SubLTranslatedFile implements V02 {
	public static final SubLObject defmacro_obsolete_warning_alt(SubLObject v_obsolete, SubLObject replacements) {
		{
			SubLObject string = NIL;
			SubLObject stream = NIL;
			try {
				stream = make_private_string_output_stream();
				format(stream, $str44$_A, v_obsolete);
				if (NIL != replacements) {
					princ($str44$_A, stream);
					{
						SubLObject cdolist_list_var = replacements;
						SubLObject replacement = NIL;
						for (replacement = cdolist_list_var
								.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
										.rest(), replacement = cdolist_list_var.first()) {
							format(stream, $str44$_A, replacement);
						}
					}
					princ($str44$_A, stream);
				}
				string = get_output_stream_string(stream);
			} finally {
				{
					final SubLObject[] bindingsList = SubLProcess.currentSubLThread().bindingsList;
					SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(bindingsList);
					try {
						$is_thread_performing_cleanupP$.bind(T, bindingsList);
						close(stream, UNPROVIDED);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0, bindingsList);
					}
				}
			}
			return Errors.warn($str44$_A, string);
		}
	}

	private static SubLSymbol $str44$_A = makeSymbol("borken");

	public static SubLObject defmacro_obsolete_warning(final SubLObject v_obsolete, final SubLObject replacements) {
		SubLObject string = NIL;
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			format(stream, $str44$_A, v_obsolete);
			if (NIL != replacements) {
				princ($str44$_A, stream);
				SubLObject cdolist_list_var = replacements;
				SubLObject replacement = NIL;
				replacement = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					format(stream, $str44$_A, replacement);
					cdolist_list_var = cdolist_list_var.rest();
					replacement = cdolist_list_var.first();
				}
				princ($str44$_A, stream);
			}
			string = get_output_stream_string(stream);
		} finally {
			final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
				bind($is_thread_performing_cleanupP$, T);
				final SubLObject _values = getValuesAsVector();
				close(stream, UNPROVIDED);
				restoreValuesFromVector(_values);
			} finally {
				rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		}
		return Errors.warn($str44$_A, string);
	}

	// // Constructor
	private kb_action_to_uia_trampolines() {
	}

	public static final SubLFile me = new kb_action_to_uia_trampolines();

	public static final String myName = "com.cyc.cycjava.cycl.kb_action_to_uia_trampolines";

	// // Definitions
	/**
	 * Entry point for a KB action to trigger a UIA salient descriptor on TERM in
	 * the UIA whose current context is INTERACTION-MT.
	 *
	 * @return boolean
	 */
	public static final SubLObject kb_action_to_uia_salient_descriptor(SubLObject v_term, SubLObject interaction_mt) {
		SubLTrampolineFile.checkType(v_term, FORT_P);
		SubLTrampolineFile.checkType(interaction_mt, HLMT_P);
		{
			SubLObject v_agenda = kb_action_derive_uia_from_interaction_mt(interaction_mt);
			if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
				return list_utilities.sublisp_boolean(uia_tools_salient_descriptor
						.uia_act_new_salient_descriptor(v_agenda, $REQUIRED, $str_alt3$, v_term));
			}
		}
		return NIL;
	}

	/**
	 * Entry point for a KB action to trigger a UIA assertion creator on SENTENCE in
	 * the UIA whose current context is INTERACTION-MT.
	 *
	 * @return boolean
	 */
	public static final SubLObject kb_action_to_uia_assertion_creator(SubLObject sentence, SubLObject interaction_mt) {
		SubLTrampolineFile.checkType(sentence, EL_FORMULA_P);
		SubLTrampolineFile.checkType(interaction_mt, HLMT_P);
		{
			SubLObject v_agenda = kb_action_derive_uia_from_interaction_mt(interaction_mt);
			if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
				return list_utilities.sublisp_boolean(uia_tools_introduction.uia_act_new_assertion_creator(v_agenda,
						$REQUIRED, $str_alt3$, sentence, UNPROVIDED));
			}
		}
		return NIL;
	}

	public static final SubLObject kb_action_derive_uia_from_interaction_mt(SubLObject interaction_mt) {
		{
			SubLObject user = bookkeeping_store.creator(interaction_mt, UNPROVIDED);
			if (NIL != forts.fort_p(user)) {
				{
					SubLObject uima = user_interaction_agenda.uimma_find_by_user(user);
					if (NIL != user_interaction_agenda.user_interaction_meta_agenda_p(uima)) {
						{
							SubLObject v_agenda = user_interaction_agenda.uima_current_agenda(uima);
							return v_agenda;
						}
					}
				}
			}
		}
		return NIL;
	}

	public static final SubLObject declare_kb_action_to_uia_trampolines_file() {
		declareFunction("kb_action_to_uia_salient_descriptor", "KB-ACTION-TO-UIA-SALIENT-DESCRIPTOR", 2, 0, false);
		declareFunction("kb_action_to_uia_assertion_creator", "KB-ACTION-TO-UIA-ASSERTION-CREATOR", 2, 0, false);
		declareFunction("kb_action_derive_uia_from_interaction_mt", "KB-ACTION-DERIVE-UIA-FROM-INTERACTION-MT", 1, 0,
				false);
		return NIL;
	}

	public static final SubLObject init_kb_action_to_uia_trampolines_file() {
		return NIL;
	}

	public static final SubLObject setup_kb_action_to_uia_trampolines_file() {
		utilities_macros.register_cyc_api_function(KB_ACTION_TO_UIA_SALIENT_DESCRIPTOR, $list_alt5,
				$str_alt6$Entry_point_for_a_KB_action_to_tr, $list_alt7, NIL);
		utilities_macros.register_cyc_api_function(KB_ACTION_TO_UIA_ASSERTION_CREATOR, $list_alt10,
				$str_alt11$Entry_point_for_a_KB_action_to_tr, $list_alt12, NIL);
		return NIL;
	}

	static private final SubLString $str_alt3$ = makeString("");

	private static final SubLSymbol KB_ACTION_TO_UIA_SALIENT_DESCRIPTOR = makeSymbol(
			"KB-ACTION-TO-UIA-SALIENT-DESCRIPTOR");

	static private final SubLList $list_alt5 = list(makeSymbol("TERM"), makeSymbol("INTERACTION-MT"));

	static private final SubLString $str_alt6$Entry_point_for_a_KB_action_to_tr = makeString(
			"Entry point for a KB action to trigger a UIA salient descriptor on TERM\n   in the UIA whose current context is INTERACTION-MT.\n   @return boolean");

	static private final SubLList $list_alt7 = list(list(makeSymbol("TERM"), makeSymbol("FORT-P")),
			list(makeSymbol("INTERACTION-MT"), makeSymbol("HLMT-P")));

	private static final SubLSymbol KB_ACTION_TO_UIA_ASSERTION_CREATOR = makeSymbol(
			"KB-ACTION-TO-UIA-ASSERTION-CREATOR");

	static private final SubLList $list_alt10 = list(makeSymbol("SENTENCE"), makeSymbol("INTERACTION-MT"));

	static private final SubLString $str_alt11$Entry_point_for_a_KB_action_to_tr = makeString(
			"Entry point for a KB action to trigger a UIA assertion creator on \n   SENTENCE in the UIA whose current context is INTERACTION-MT.\n   @return boolean");

	static private final SubLList $list_alt12 = list(list(makeSymbol("SENTENCE"), makeSymbol("EL-FORMULA-P")),
			list(makeSymbol("INTERACTION-MT"), makeSymbol("HLMT-P")));

	// // Initializers
	@Override
	public void declareFunctions() {
		declare_kb_action_to_uia_trampolines_file();
	}

	@Override
	public void initializeVariables() {
		init_kb_action_to_uia_trampolines_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_kb_action_to_uia_trampolines_file();
	}
}
