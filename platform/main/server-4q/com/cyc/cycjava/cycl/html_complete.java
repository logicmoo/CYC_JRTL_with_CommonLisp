package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cb_parameters.cb_glob_id;
import static com.cyc.cycjava.cycl.cb_parameters.cb_glob_lookup_by_string;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_term;
import static com.cyc.cycjava.cycl.cb_utilities.cb_term_identifier;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.html_utilities.$html_url_princ_escape_spaces$;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_cyclified_sexpr;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_sexpr;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_prin1;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_url_princ;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.constantp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_complete extends SubLTranslatedFile {
	public static final SubLFile me = new html_complete();

	public static final String myName = "com.cyc.cycjava.cycl.html_complete";

	public static final String myFingerPrint = "f202f7e30f10925923ab306fac88cc9184a5f4f2aeac700c734a03736e0210f4";

	// defparameter
	public static final SubLSymbol $cb_enable_constant_completion$ = makeSymbol("*CB-ENABLE-CONSTANT-COMPLETION*");

	// defparameter
	public static final SubLSymbol $cb_pop_up_constant_completion$ = makeSymbol("*CB-POP-UP-CONSTANT-COMPLETION*");

	// defparameter
	public static final SubLSymbol $cb_constant_completion_target$ = makeSymbol("*CB-CONSTANT-COMPLETION-TARGET*");

	// deflexical
	private static final SubLSymbol $html_complete_button_script$ = makeSymbol("*HTML-COMPLETE-BUTTON-SCRIPT*");

	// deflexical
	private static final SubLSymbol $html_cyclify_button_script$ = makeSymbol("*HTML-CYCLIFY-BUTTON-SCRIPT*");

	// deflexical
	private static final SubLSymbol $html_complete_script_parameters$ = makeSymbol("*HTML-COMPLETE-SCRIPT-PARAMETERS*");

	// deflexical
	private static final SubLSymbol $html_intial_focus_script$ = makeSymbol("*HTML-INTIAL-FOCUS-SCRIPT*");

	// deflexical
	private static final SubLSymbol $html_opener_message_on_load_script$ = makeSymbol("*HTML-OPENER-MESSAGE-ON-LOAD-SCRIPT*");

	// deflexical
	private static final SubLSymbol $html_handle_complete_script_parameters$ = makeSymbol("*HTML-HANDLE-COMPLETE-SCRIPT-PARAMETERS*");

	// deflexical
	private static final SubLSymbol $html_handle_complete_script$ = makeSymbol("*HTML-HANDLE-COMPLETE-SCRIPT*");

	// defparameter
	public static final SubLSymbol $html_immediate_complete_extend_script$ = makeSymbol("*HTML-IMMEDIATE-COMPLETE-EXTEND-SCRIPT*");

	// defparameter
	public static final SubLSymbol $html_immediate_complete_choose_script$ = makeSymbol("*HTML-IMMEDIATE-COMPLETE-CHOOSE-SCRIPT*");

	// deflexical
	private static final SubLSymbol $html_complete_insert_choice_script$ = makeSymbol("*HTML-COMPLETE-INSERT-CHOICE-SCRIPT*");

	// defparameter
	public static final SubLSymbol $js_autocomplete_setup$ = makeSymbol("*JS-AUTOCOMPLETE-SETUP*");

	// defparameter
	private static final SubLSymbol $autocomplete_default_limit$ = makeSymbol("*AUTOCOMPLETE-DEFAULT-LIMIT*");

	// defparameter
	private static final SubLSymbol $completion_properties$ = makeSymbol("*COMPLETION-PROPERTIES*");

	// deflexical
	private static final SubLSymbol $autocomplete_isa_cache_lock$ = makeSymbol("*AUTOCOMPLETE-ISA-CACHE-LOCK*");

	// deflexical
	private static final SubLSymbol $autocomplete_genls_cache_lock$ = makeSymbol("*AUTOCOMPLETE-GENLS-CACHE-LOCK*");

	// defparameter
	private static final SubLSymbol $autocomplete_isa_cache$ = makeSymbol("*AUTOCOMPLETE-ISA-CACHE*");

	// defparameter
	private static final SubLSymbol $autocomplete_genls_cache$ = makeSymbol("*AUTOCOMPLETE-GENLS-CACHE*");

	// deflexical
	private static final SubLSymbol $html_handle_cyclify_script_parameters$ = makeSymbol("*HTML-HANDLE-CYCLIFY-SCRIPT-PARAMETERS*");

	// deflexical
	private static final SubLSymbol $html_handle_cyclify_script$ = makeSymbol("*HTML-HANDLE-CYCLIFY-SCRIPT*");

	// deflexical
	private static final SubLSymbol $html_immediate_perform_cyclify_script_prefix$ = makeSymbol("*HTML-IMMEDIATE-PERFORM-CYCLIFY-SCRIPT-PREFIX*");

	// deflexical
	private static final SubLSymbol $html_immediate_perform_cyclify_script_postfix$ = makeSymbol("*HTML-IMMEDIATE-PERFORM-CYCLIFY-SCRIPT-POSTFIX*");

	// Internal Constants
	public static final SubLString $$$completions = makeString("completions");

	public static final SubLString $str1$onClick__constant_complete___A___ = makeString("onClick=\"constant_complete(\'~A\', ~A, \'~A\', ~A, ~A);\"");

	public static final SubLString $$$Complete = makeString("Complete");

	private static final SubLString $str3$ = makeString("");

	private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

	private static final SubLString $$$true = makeString("true");

	private static final SubLString $$$false = makeString("false");

	private static final SubLString $str9$constant_complete__ = makeString("constant_complete('");

	public static final SubLString $str10$___ = makeString("', ");

	private static final SubLString $str11$___ = makeString(", '");

	public static final SubLString $str12$__ = makeString(", ");

	private static final SubLString $str13$__ = makeString(");");

	private static final SubLString $str14$onClick__cyclify___A____ = makeString("onClick=\"cyclify(\'~A\');\"");

	private static final SubLString $$$Cyclify = makeString("Cyclify");

	private static final SubLString $str16$javascript_void____ = makeString("javascript:void('')");

	private static final SubLString $str17$_var_cgi_program_____A___var_comp = makeString("\nvar cgi_program = \'~A\';\nvar completion_frame_name = \'~A\';\n");

	private static final SubLString $str19$_if__window_focus__window_focus__ = makeString("\nif (window.focus) window.focus();");

	private static final SubLString $str20$_if__window_opener__window_opener = makeString("\nif (window.opener) window.opener.status = \'~A\';\n");

	private static final SubLString $str21$_var_form_number____A__var_elemen = makeString("\nvar form_number = ~A;\nvar element_number = ~A;\nvar prefix = \'~A\';\nvar close_window = ~A;\n");

	private static final SubLString $str22$_var_old_length____1___function_c = makeString(
			"\nvar old_length = -1;\n\nfunction complete_error(message) {\n  document.open();\n  document.writeln(\'Error \' + message);\n  document.writeln(\'Completion links only apply to the page which originally generated them.<p>\');\n  document.writeln(\'That page is no longer available.\');\n  document.close();\n  return false;\n}\n\nfunction complete_insert(full_string, submit, chosen) {\n  // defensive programming to prevent script errors\n  if (!window.opener) \n    return complete_error(1);\n  if (!window.opener.document) \n    return complete_error(2);\n  if (!window.opener.document.forms) \n    return complete_error(3);\n  if (!window.opener.document.forms.length) \n    return complete_error(4);\n  if (window.opener.document.forms.length < form_number) \n    return complete_error(5);\n  \n  if (window.opener.focus && chosen) window.opener.focus();\n\n  var form = window.opener.document.forms[form_number];\n\n  if (!form.elements) \n    return complete_error(6);\n  if (!form.elements.length) \n    return complete_error(7);\n  if (form.elements.length < element_number) \n    return complete_error(8);\n\n  var element = form.elements[element_number];\n\n  // @todo remove this\n  //if (!element.value) \n  //  return complete_error(9);\n\n  var old_value = element.value;\n  if (old_length < 0) old_length = old_value.length;\n\n  // now actually do the completion\n  var prefix_length = prefix.length;\n  var full_length = full_string.length;\n  var completion = full_string.substring(prefix_length, full_length);\n  var preamble = old_value.substring(0, (old_length - prefix_length));\n  element.value = preamble + full_string;\n  // if (element.focus) element.focus();\n\n  // submit the form if we are supposed to\n  if (submit)\n    form.submit();\n\n  // close the window if we are supposed to\n  if (close_window)\n    self.close();\n\n  return false;\n}\n\nfunction complete_extend(full_string) {\n  return complete_insert(full_string, false, false);\n}\n\nfunction complete_choose(full_string, submit) {\n  return complete_insert(full_string, submit, true);\n}");

	private static final SubLString $str23$_complete_extend___A____ = makeString("\ncomplete_extend(\'~A\');\n");

	private static final SubLString $str24$_complete_choose___A____A___ = makeString("\ncomplete_choose(\'~A\', ~A);\n");

	private static final SubLString $$$form = makeString("form");

	private static final SubLString $$$input = makeString("input");

	private static final SubLString $$$prefix = makeString("prefix");

	private static final SubLString $$$submit = makeString("submit");

	private static final SubLString $$$filter = makeString("filter");

	private static final SubLString $$$choices = makeString("choices");

	private static final SubLString $str31$case_insensitive = makeString("case-insensitive");

	private static final SubLString $$$lexical = makeString("lexical");

	private static final SubLSymbol CB_COMPLETE = makeSymbol("CB-COMPLETE");

	private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

	private static final SubLInteger $int$50 = makeInteger(50);

	private static final SubLSymbol $sym39$STRING_ = makeSymbol("STRING<");

	private static final SubLSymbol COMPLETION_STRING = makeSymbol("COMPLETION-STRING");

	private static final SubLString $str43$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

	private static final SubLString $str44$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

	private static final SubLString $str46$Exact_match_plus_one_longer_compl = makeString("Exact match plus one longer completion.");

	private static final SubLString $str47$Exact_match_plus__S_longer_comple = makeString("Exact match plus ~S longer completions.");

	private static final SubLString $str48$_S_possible__A_ = makeString("~S possible ~A.");

	private static final SubLString $$$suggestions = makeString("suggestions");

	private static final SubLString $str50$Extension__ = makeString("Extension: ");

	private static final SubLString $str52$_Suggestions_ = makeString(" Suggestions:");

	private static final SubLString $str53$_Completions_ = makeString(" Completions:");

	private static final SubLString $str54$Constants___A__ = makeString("Constants (~A):");

	private static final SubLString $str55$Lexical_Strings___A__ = makeString("Lexical Strings (~A):");

	private static final SubLString $str56$Sole_completion__already_complete = makeString("Sole completion (already completed).");

	public static final SubLString $str57$Sole_completion_ = makeString("Sole completion.");

	private static final SubLString $str58$Already_completed_ = makeString("Already completed.");

	private static final SubLString $str59$Sole_completion_ = makeString("Sole completion:");

	private static final SubLString $str60$No_completions_ = makeString("No completions.");

	private static final SubLString $str61$No_suggestions_ = makeString("No suggestions.");

	private static final SubLString $$$No_completions = makeString("No completions");

	private static final SubLString $$$No_suggestions = makeString("No suggestions");

	private static final SubLString $$$Suggestions = makeString("Suggestions");

	private static final SubLString $$$Completions = makeString("Completions");

	private static final SubLString $str66$Machine__ = makeString("Machine: ");

	private static final SubLString $str67$Prefix__ = makeString("Prefix: ");

	private static final SubLString $str68$Filter__ = makeString("Filter: ");

	private static final SubLString $str69$onClick__complete_choose___A____A = makeString("onClick=\"complete_choose(\'~A\', ~A);\"");

	private static final SubLString $$$complete = makeString("complete");

	private static final SubLString $str71$var_constantCompleteDataSource___ = makeString(
			"var constantCompleteDataSource = new YAHOO.widget.DS_XHR(\'./cg\', [\'Term\', \'cycl\', \'nl\']);\n constantCompleteDataSource.scriptQueryParam = \'xml-complete~A&prefix\';  \n constantCompleteDataSource.responseType = YAHOO.widget.DS_XHR.TYPE_XML;\n var constantComplete = new YAHOO.widget.AutoComplete(\'~A\', \'~A\', constantCompleteDataSource);\n constantComplete.allowBrowserAutocomplete = true;  \n constantComplete.autoHighlight = false;\n constantComplete.minQueryLength = ~A;\n constantComplete.animSpeed = 0.1;\n// constantComplete.delimChar = \' \'; //this would be good if we were working in just CycL (no lexical completions)\n constantComplete.maxResultsDisplayed=~A;\n constantComplete.queryDelay=0.3;\n constantComplete.embeddedInToolbar=~A;\n\n if (constantComplete.embeddedInToolbar) {\n   constantComplete.itemSelectEvent.subscribe(function (sType, aArgs) { document.getElementById(\'inputBox\').form.submit();}); \n}\n \n constantComplete.formatResult = function(oResultItem, sQuery) {\n   var thisConst = oResultItem[0];\n   var string = oResultItem[1];\n   var sMarkup = string + \' <span class=\"autoCompCycL\">\' + thisConst + \'</span>\'; \n   return (sMarkup);\n };\n if (constantComplete.embeddedInToolbar) {\n   constantComplete.containerExpandEvent.subscribe(function() {\n    if (!this.expandedRows) {\n      this.expandedRows=parent.document.body.rows;\n      var rows = parent.document.body.rows;\n      rows = rows.replace(/.*,.*,/, YAHOO.util.Dom.getDocumentHeight() + \',*,\');\n      parent.document.body.rows=rows;\n    }\n   });\n   constantComplete.containerCollapseEvent.subscribe(function() {\n    if (this.expandedRows) { parent.document.body.rows=this.expandedRows; }\n    this.expandedRows = null;\n   });\n }\n");

	private static final SubLSymbol HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT = makeSymbol("HTML-PRINT-JS-AUTOCOMPLETE-SETUP-INT");

	private static final SubLSymbol HTML_PRINT_JS_AUTOCOMPLETE_SETUP = makeSymbol("HTML-PRINT-JS-AUTOCOMPLETE-SETUP");

	private static final SubLString $str74$_filter_ = makeString("&filter=");

	private static final SubLString $str76$text_javascript = makeString("text/javascript");

	private static final SubLSymbol XML_TERM_SEARCH = makeSymbol("XML-TERM-SEARCH");

	private static final SubLString $$$searchString = makeString("searchString");

	private static final SubLString $$$caseSensitive = makeString("caseSensitive");

	private static final SubLString $str80$return_attrs = makeString("return-attrs");

	private static final SubLList $list81 = list(makeKeyword("CYCL"), makeKeyword("NL"), makeKeyword("HL-ID"));

	private static final SubLString $$$timeout = makeString("timeout");

	private static final SubLString $$$count = makeString("count");

	private static final SubLList $list84 = list(makeSymbol("ISA-FILTER"), makeSymbol("GENLS-FILTER"), makeSymbol("ISA-RESTRICTIONS"), makeSymbol("GENLS-RESTRICTIONS"));

	private static final SubLSymbol $sym86$_EXIT = makeSymbol("%EXIT");

	private static final SubLSymbol XML_COMPLETE = makeSymbol("XML-COMPLETE");

	private static final SubLSymbol $kw89$COMPLETE_ON_CONSTANTS_ = makeKeyword("COMPLETE-ON-CONSTANTS?");

	private static final SubLSymbol $kw90$PREFER_HISTORY_TERMS_ = makeKeyword("PREFER-HISTORY-TERMS?");

	private static final SubLString $$$preferHistory = makeString("preferHistory");

	private static final SubLSymbol $kw93$CASE_SENSITIVE_ = makeKeyword("CASE-SENSITIVE?");

	private static final SubLList $list95 = list(makeKeyword("CYCL"), makeKeyword("NL"));

	private static final SubLString $$$mt = makeString("mt");

	private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

	private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

	private static final SubLSymbol $TERM_TO_REPLACE = makeKeyword("TERM-TO-REPLACE");

	private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

	private static final SubLSymbol GET_ISA_RESTRICTIONS_FROM_SENTENCE = makeSymbol("GET-ISA-RESTRICTIONS-FROM-SENTENCE");

	private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

	private static final SubLSymbol $get_isa_restrictions_from_sentence_caching_state$ = makeSymbol("*GET-ISA-RESTRICTIONS-FROM-SENTENCE-CACHING-STATE*");

	private static final SubLInteger $int$1024 = makeInteger(1024);

	private static final SubLSymbol CLEAR_GET_ISA_RESTRICTIONS_FROM_SENTENCE = makeSymbol("CLEAR-GET-ISA-RESTRICTIONS-FROM-SENTENCE");

	private static final SubLSymbol GET_GENLS_RESTRICTIONS_FROM_SENTENCE = makeSymbol("GET-GENLS-RESTRICTIONS-FROM-SENTENCE");

	private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

	private static final SubLSymbol $get_genls_restrictions_from_sentence_caching_state$ = makeSymbol("*GET-GENLS-RESTRICTIONS-FROM-SENTENCE-CACHING-STATE*");

	private static final SubLSymbol CLEAR_GET_GENLS_RESTRICTIONS_FROM_SENTENCE = makeSymbol("CLEAR-GET-GENLS-RESTRICTIONS-FROM-SENTENCE");

	private static final SubLSymbol GET_ARG_CONSTRAINTS_FOR_ARG = makeSymbol("GET-ARG-CONSTRAINTS-FOR-ARG");

	private static final SubLSymbol $get_arg_constraints_for_arg_caching_state$ = makeSymbol("*GET-ARG-CONSTRAINTS-FOR-ARG-CACHING-STATE*");

	private static final SubLSymbol CLEAR_GET_ARG_CONSTRAINTS_FOR_ARG = makeSymbol("CLEAR-GET-ARG-CONSTRAINTS-FOR-ARG");

	private static final SubLSymbol GET_ARG_CONSTRAINTS_FOR_VAR = makeSymbol("GET-ARG-CONSTRAINTS-FOR-VAR");

	private static final SubLSymbol $get_arg_constraints_for_var_caching_state$ = makeSymbol("*GET-ARG-CONSTRAINTS-FOR-VAR-CACHING-STATE*");

	private static final SubLSymbol CLEAR_GET_ARG_CONSTRAINTS_FOR_VAR = makeSymbol("CLEAR-GET-ARG-CONSTRAINTS-FOR-VAR");

	private static final SubLObject $$CollectionIntersectionFn = reader_make_constant_shell(makeString("CollectionIntersectionFn"));

	private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

	private static final SubLString $$$constrainingSentence = makeString("constrainingSentence");

	private static final SubLSymbol $sym129$NON_CYCL_SYMBOL_ = makeSymbol("NON-CYCL-SYMBOL?");

	private static final SubLSymbol CONVERT_TO_KEYWORD = makeSymbol("CONVERT-TO-KEYWORD");

	private static final SubLList $list131 = list(
			new SubLObject[] { makeKeyword("COMPLETE-ON-CONSTANTS?"), makeKeyword("PREFER-HISTORY-TERMS?"), makeKeyword("LEXICON"), makeKeyword("CASE-SENSITIVE?"), makeKeyword("RETURN-ATTRS"), makeKeyword("TIMEOUT"), makeKeyword("LIMIT"), makeKeyword("MT"), makeKeyword("ISA-FILTER"), makeKeyword("GENLS-FILTER"), makeKeyword("ISA-RESTRICTIONS"), makeKeyword("GENLS-RESTRICTIONS") });

	private static final SubLSymbol COMPLETION_PROPERTIES_P = makeSymbol("COMPLETION-PROPERTIES-P");

	private static final SubLList $list133 = list(makeKeyword("MT"), makeKeyword("DEFAULT"));

	private static final SubLString $str134$__ = makeString("#$");

	private static final SubLSymbol COMPLETION_DENOTS_OF_STRING = makeSymbol("COMPLETION-DENOTS-OF-STRING");

	private static final SubLSymbol COMPLETION_LEXICON = makeSymbol("COMPLETION-LEXICON");

	private static final SubLList $list139 = list(makeKeyword("ABBREVS"), makeKeyword("ACRONYMS"));

	private static final SubLSymbol $sym142$NUM_INDEX_ = makeSymbol("NUM-INDEX>");

	private static final SubLString $str143$__xml_version__1_0__encoding__UTF = makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

	private static final SubLList $list144 = list(makeString("xmlns:xsi"), makeString("http://www.w3.org/2001/XMLSchema-instance"), makeString("xsi:schemaLocation"), makeString("http://ws.opencyc.org/xsd/LightWeightResultSet http://ws.opencyc.org/xsd/LightWeightResultSet.xsd"), makeString("xmlns:concepts"), makeString("http://ws.opencyc.org/xsd/CycConcepts"), makeString("xmlns"),
			makeString("http://ws.opencyc.org/xsd/LightWeightResultSet"));

	private static final SubLString $$$ResultSet = makeString("ResultSet");

	private static final SubLList $list146 = cons(makeSymbol("CONSTANT"), makeSymbol("COMPLETION-STRINGS"));

	private static final SubLString $$$cycl = makeString("cycl");

	private static final SubLString $$$nl = makeString("nl");

	private static final SubLString $$$disambigString = makeString("disambigString");

	private static final SubLString $$$hlId = makeString("hlId");

	private static final SubLString $$$Term = makeString("Term");

	private static final SubLSymbol TERM_PASSES_ARG_RESTRICTIONS = makeSymbol("TERM-PASSES-ARG-RESTRICTIONS");

	private static final SubLSymbol $term_passes_arg_restrictions_caching_state$ = makeSymbol("*TERM-PASSES-ARG-RESTRICTIONS-CACHING-STATE*");

	private static final SubLSymbol CLEAR_TERM_PASSES_ARG_RESTRICTIONS = makeSymbol("CLEAR-TERM-PASSES-ARG-RESTRICTIONS");

	private static final SubLString $$$Autocomplete_isa_cache_lock = makeString("Autocomplete isa cache lock");

	private static final SubLString $$$Autocomplete_genls_cache_lock = makeString("Autocomplete genls cache lock");

	private static final SubLInteger $int$128 = makeInteger(128);

	private static final SubLList $list163 = list(makeSymbol("CONSTRAINT"), makeSymbol("MT"));

	private static final SubLSymbol CLEAR_AUTOCOMPLETE_GENLS_CACHE = makeSymbol("CLEAR-AUTOCOMPLETE-GENLS-CACHE");

	private static final SubLSymbol CLEAR_AUTOCOMPLETE_ISA_CACHE = makeSymbol("CLEAR-AUTOCOMPLETE-ISA-CACHE");

	private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

	private static final SubLObject $$PhysiologicalCondition = reader_make_constant_shell(makeString("PhysiologicalCondition"));

	private static final SubLSymbol FI_EVAL = makeSymbol("FI-EVAL");

	private static final SubLSymbol PRECACHE_ISA_CONSTRAINT_GUTS = makeSymbol("PRECACHE-ISA-CONSTRAINT-GUTS");

	private static final SubLSymbol PRECACHE_GENLS_CONSTRAINT_GUTS = makeSymbol("PRECACHE-GENLS-CONSTRAINT-GUTS");

	private static final SubLString $str173$_var_form_number____A__var_elemen = makeString("\nvar form_number = ~A;\nvar element_number = ~A;\nvar close_window = ~A;\n\n");

	private static final SubLString $str174$_function_cyclify_error_message__ = makeString(
			"\nfunction cyclify_error(message) {\n  document.open();\n  document.writeln(\'Unable to cyclify the input field.<p>\');\n  document.writeln(\'Error: \' + message);\n  document.close();\n  return false;\n}\n\nfunction handle_cyclify(new_string) {\n  // defensive programming to prevent script errors\n  if (!window.opener) \n    return cyclify_error(1);\n  if (!window.opener.document) \n    return cyclify_error(2);\n  if (!window.opener.document.forms) \n    return cyclify_error(3);\n  if (!window.opener.document.forms.length) \n    return cyclify_error(4);\n  if (window.opener.document.forms.length < form_number) \n    return cyclify_error(5);\n  \n  if (window.opener.focus) window.opener.focus();\n\n  var form = window.opener.document.forms[form_number];\n\n  if (!form.elements) \n    return cyclify_error(6);\n  if (!form.elements.length) \n    return cyclify_error(7);\n  if (form.elements.length < element_number) \n    return cyclify_error(8);\n\n  var element = form.elements[element_number];\n\n  if (!element.value) \n    return cyclify_error(9);\n\n  element.value = new_string;\n\n  // close the window if we are supposed to\n  if (close_window)\n    self.close();\n\n  return false;\n}\n\n");

	private static final SubLString $str175$_handle_cyclify_unescape__ = makeString("\nhandle_cyclify(unescape(\'");

	private static final SubLString $str176$_____ = makeString("\'));\n");

	private static final SubLString $$$string = makeString("string");

	private static final SubLString $str178$All_valid____references_have_been = makeString("All valid #$ references have been added.");

	private static final SubLString $str179$Invalid_references__ = makeString("Invalid references :");

	private static final SubLString $str180$Added_references__ = makeString("Added references :");

	private static final SubLString $$$No_references_added = makeString("No references added");

	private static final SubLSymbol CB_CYCLIFY = makeSymbol("CB-CYCLIFY");

	private static final SubLString $str183$_Term_ = makeString("<Term ");

	private static final SubLSymbol XML_COMPLETE_RESULT_COUNT_MIN = makeSymbol("XML-COMPLETE-RESULT-COUNT-MIN");

	private static final SubLSymbol $sym186$_ = makeSymbol(">");

	private static final SubLList $list192 = list(list(list(list(list(makeString("constrainingSentence"), makeString("(argIsa COPY_OF_cblSendMessageNamed  2  :term-to-replace)")), list(makeString("caseSensitive"), makeString("nil")), list(makeString("prefix"), makeString("Progra")))), TWENTY_INTEGER),
			list(list(list(list(makeString("constrainingSentence"), makeString("(genlPreds COPY_OF_cblSendMessageNamed :term-to-replace)")), list(makeString("caseSensitive"), makeString("nil")), list(makeString("prefix"), makeString("Progra")))), TWENTY_INTEGER),
			list(list(list(list(makeString("constrainingSentence"), makeString("(isa :term-to-replace GeographicalRegion)")), list(makeString("caseSensitive"), makeString("t")), list(makeString("prefix"), makeString("Canad")))), ONE_INTEGER));

	private static final SubLSymbol XML_COMPLETE_RESULT_COUNT_MAX = makeSymbol("XML-COMPLETE-RESULT-COUNT-MAX");

	private static final SubLSymbol $sym194$__ = makeSymbol("<=");

	private static final SubLList $list195 = list(list(list(list(list(makeString("filter"), makeString("Thing")), list(makeString("constrainingSentence"), makeString("(argIsa COPY_OF_cblSendMessageNamed  2  :term-to-replace)")), list(makeString("caseSensitive"), makeString("nil")), list(makeString("prefix"), makeString("genlI")))), ZERO_INTEGER),
			list(list(list(list(makeString("filter"), makeString("Thing")), list(makeString("constrainingSentence"), makeString("(genlPreds COPY_OF_cblSendMessageNamed :term-to-replace)")), list(makeString("caseSensitive"), makeString("T")), list(makeString("prefix"), makeString("ProgRa")))), ZERO_INTEGER));

	private static final SubLSymbol XML_COMPLETE_INT_RESULT_COUNT_MIN = makeSymbol("XML-COMPLETE-INT-RESULT-COUNT-MIN");

	private static final SubLList $list197 = list(list(
			list(makeString("Canad"), list(
					new SubLObject[] { makeKeyword("RETURN-ATTRS"), list(makeKeyword("CYCL"), makeKeyword("NL"), makeKeyword("HL-ID"), makeKeyword("DISAMBIG-STRING")), makeKeyword("ISA-FILTER"), reader_make_constant_shell(makeString("GeographicalRegion")), makeKeyword("LIMIT"), TWENTY_INTEGER, makeKeyword("TIMEOUT"), TWENTY_INTEGER, makeKeyword("CASE-SENSITIVE?"), NIL, makeKeyword("COMPLETE-ON-CONSTANTS?"), NIL })),
			ONE_INTEGER));

	public static SubLObject html_complete_button(final SubLObject name, SubLObject value, SubLObject filter_type, SubLObject auto_submit, SubLObject include_lexical_stringsP, SubLObject standard_choices, SubLObject v_class) {
		if (value == UNPROVIDED) {
			value = $$$Complete;
		}
		if (filter_type == UNPROVIDED) {
			filter_type = NIL;
		}
		if (auto_submit == UNPROVIDED) {
			auto_submit = NIL;
		}
		if (include_lexical_stringsP == UNPROVIDED) {
			include_lexical_stringsP = NIL;
		}
		if (standard_choices == UNPROVIDED) {
			standard_choices = NIL;
		}
		if (v_class == UNPROVIDED) {
			v_class = $str3$;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
		if (NIL == filter_type) {
			filter_type = $$Thing;
		}
		assert NIL != forts.fort_p(filter_type) : "forts.fort_p(filter_type) " + "CommonSymbols.NIL != forts.fort_p(filter_type) " + filter_type;
		if (NIL != $cb_enable_constant_completion$.getDynamicValue(thread)) {
			final SubLObject choices_id = cb_glob_id(standard_choices);
			html_markup(html_macros.$html_input_head$.getGlobalValue());
			html_markup(html_macros.$html_input_type$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_input_button$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			if (NIL != value) {
				html_markup(html_macros.$html_input_value$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_princ(value);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_space, UNPROVIDED);
			format(html_macros.$html_stream$.getDynamicValue(thread), $html_complete_button_script$.getGlobalValue(), new SubLObject[] { name, NIL != auto_submit ? $$$true : $$$false, cb_fort_identifier(filter_type), choices_id, NIL != include_lexical_stringsP ? $$$true : $$$false });
			if (NIL != v_class) {
				html_markup(html_macros.$html_attribute_class$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(v_class);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
				html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
			}
			html_char(CHAR_greater, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject html_complete_link(final SubLObject name, SubLObject linktext, SubLObject filter_type, SubLObject auto_submit, SubLObject include_lexical_stringsP, SubLObject standard_choices) {
		if (linktext == UNPROVIDED) {
			linktext = $$$Complete;
		}
		if (filter_type == UNPROVIDED) {
			filter_type = NIL;
		}
		if (auto_submit == UNPROVIDED) {
			auto_submit = NIL;
		}
		if (include_lexical_stringsP == UNPROVIDED) {
			include_lexical_stringsP = NIL;
		}
		if (standard_choices == UNPROVIDED) {
			standard_choices = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
		if (NIL == filter_type) {
			filter_type = $$Thing;
		}
		assert NIL != forts.fort_p(filter_type) : "forts.fort_p(filter_type) " + "CommonSymbols.NIL != forts.fort_p(filter_type) " + filter_type;
		if (NIL != $cb_enable_constant_completion$.getDynamicValue(thread)) {
			final SubLObject choices_id = cb_glob_id(standard_choices);
			final SubLObject onclick = cconcatenate($str9$constant_complete__,
					new SubLObject[] { format_nil.format_nil_a_no_copy(name), $str10$___, format_nil.format_nil_a_no_copy(NIL != auto_submit ? $$$true : $$$false), $str11$___, format_nil.format_nil_a_no_copy(cb_fort_identifier(filter_type)), $str10$___, format_nil.format_nil_a_no_copy(choices_id), $str12$__, format_nil.format_nil_a_no_copy(NIL != include_lexical_stringsP ? $$$true : $$$false), $str13$__ });
			final SubLObject url = javascript_void_url();
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(url);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(onclick);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_princ(linktext);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		}
		return NIL;
	}

	public static SubLObject html_cyclify_button(final SubLObject name, SubLObject value, SubLObject v_class) {
		if (value == UNPROVIDED) {
			value = $$$Cyclify;
		}
		if (v_class == UNPROVIDED) {
			v_class = $str3$;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
		if (NIL != $cb_enable_constant_completion$.getDynamicValue(thread)) {
			html_markup(html_macros.$html_input_head$.getGlobalValue());
			html_markup(html_macros.$html_input_type$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_input_button$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			if (NIL != value) {
				html_markup(html_macros.$html_input_value$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_princ(value);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_space, UNPROVIDED);
			format(html_macros.$html_stream$.getDynamicValue(thread), $html_cyclify_button_script$.getGlobalValue(), name);
			if (NIL != v_class) {
				html_markup(html_macros.$html_attribute_class$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(v_class);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
				html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
			}
			html_char(CHAR_greater, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject javascript_void_url() {
		return $str16$javascript_void____;
	}

	public static SubLObject html_complete_script() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_script_head$.getGlobalValue());
		html_markup(html_macros.$html_script_language$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_script_javascript$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			format(html_macros.$html_stream$.getDynamicValue(thread), $html_complete_script_parameters$.getGlobalValue(), system_parameters.$cyc_cgi_program$.getDynamicValue(thread), NIL == $cb_pop_up_constant_completion$.getDynamicValue(thread) ? $cb_constant_completion_target$.getDynamicValue(thread) : $str3$);
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_script_tail$.getGlobalValue());
		cyc_file_dependencies.javascript($CONSTANT_COMPLETION);
		return NIL;
	}

	public static SubLObject html_initial_focus_script() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_script_head$.getGlobalValue());
		html_markup(html_macros.$html_script_language$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_script_javascript$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			format(html_macros.$html_stream$.getDynamicValue(thread), $html_intial_focus_script$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_script_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_opener_message_on_load(final SubLObject message) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_script_head$.getGlobalValue());
		html_markup(html_macros.$html_script_language$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_script_javascript$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			format(html_macros.$html_stream$.getDynamicValue(thread), $html_opener_message_on_load_script$.getGlobalValue(), message);
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_script_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_handle_complete_script(final SubLObject form, final SubLObject input, final SubLObject prefix) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_script_head$.getGlobalValue());
		html_markup(html_macros.$html_script_language$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_script_javascript$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			format(html_macros.$html_stream$.getDynamicValue(thread), $html_handle_complete_script_parameters$.getGlobalValue(), new SubLObject[] { form, input, prefix, NIL != $cb_pop_up_constant_completion$.getDynamicValue(thread) ? $$$true : $$$false });
			html_terpri(UNPROVIDED);
			html_markup($html_handle_complete_script$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_script_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_immediate_complete_extend_script(final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_script_head$.getGlobalValue());
		html_markup(html_macros.$html_script_language$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_script_javascript$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			format(html_macros.$html_stream$.getDynamicValue(thread), $html_immediate_complete_extend_script$.getDynamicValue(thread), string);
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_script_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_immediate_complete_choose_script(final SubLObject string, final SubLObject submit) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_script_head$.getGlobalValue());
		html_markup(html_macros.$html_script_language$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_script_javascript$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			format(html_macros.$html_stream$.getDynamicValue(thread), $html_immediate_complete_choose_script$.getDynamicValue(thread), string, submit);
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_script_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject cb_complete(final SubLObject args) {
		final SubLObject form = html_extract_input($$$form, args);
		final SubLObject input = html_extract_input($$$input, args);
		final SubLObject prefix = html_extract_input($$$prefix, args);
		final SubLObject submit = html_extract_input($$$submit, args);
		SubLObject filter = html_extract_input($$$filter, args);
		SubLObject choices = html_extract_input($$$choices, args);
		final SubLObject case_sensitiveP = makeBoolean(NIL == html_extract_input($str31$case_insensitive, args));
		final SubLObject include_lexical_stringsP = equal($$$true, html_extract_input($$$lexical, args));
		SubLObject completions = NIL;
		if (NIL != filter) {
			filter = cb_guess_fort(filter, UNPROVIDED);
		}
		if (NIL != kb_utilities.kbeq(filter, $$Thing)) {
			filter = NIL;
		}
		if (NIL != choices) {
			choices = cb_glob_lookup_by_string(choices);
		}
		completions = cb_completions(prefix, filter, choices, include_lexical_stringsP, case_sensitiveP, UNPROVIDED);
		if (NIL != completions) {
			if (NIL != list_utilities.singletonP(completions)) {
				cb_complete_one(form, input, prefix, completions.first(), submit, filter);
			} else {
				cb_complete_choose(form, input, prefix, choices, completions, submit, filter);
			}
		} else {
			cb_complete_none(prefix, filter);
		}
		return NIL;
	}

	public static SubLObject cb_completions(final SubLObject string, final SubLObject filter, final SubLObject choices, SubLObject include_lexical_stringsP, SubLObject case_sensitiveP, SubLObject constant_completionsP) {
		if (include_lexical_stringsP == UNPROVIDED) {
			include_lexical_stringsP = NIL;
		}
		if (case_sensitiveP == UNPROVIDED) {
			case_sensitiveP = T;
		}
		if (constant_completionsP == UNPROVIDED) {
			constant_completionsP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject completions = NIL;
		if (NIL != string_utilities.empty_string_p(string)) {
			SubLObject suggestions = NIL;
			final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
				mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
				if (NIL == filter) {
					suggestions = cb_tools.cb_constant_history_items();
				} else if (cardinality_estimates.instance_cardinality(filter).numLE($int$50)) {
					suggestions = list_utilities.delete_if_not(symbol_function(CONSTANT_P), isa.all_fort_instances(filter, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				} else {
					suggestions = isa.all_instances_among_fast(filter, cb_tools.cb_constant_history_items(), UNPROVIDED);
				}

			} finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
			completions = nunion(copy_list(choices), suggestions, symbol_function(EQ), UNPROVIDED);
		} else if (NIL != constant_completionsP) {
			completions = constant_completion_high.constant_complete(string, case_sensitiveP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			if (NIL != filter) {
				final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
					mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
					mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
					completions = isa.all_instances_among_fast(filter, completions, UNPROVIDED);
				} finally {
					mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
				}
			}
		}

		completions = Sort.sort(completions, symbol_function($sym39$STRING_), symbol_function(CONSTANT_NAME));
		if (NIL != choices) {
			completions = list_utilities.stable_sort_via_position(completions, choices, symbol_function(EQ), UNPROVIDED);
		}
		if ((NIL != string_utilities.non_empty_stringP(string)) && (NIL != include_lexical_stringsP)) {
			SubLObject nl_trie_completions = ((NIL != fort_types_interface.collectionP(filter)) && (NIL == kb_utilities.kbeq($$Thing, filter))) ? nl_trie_completion.nl_trie_completions_with_denot_filter_collection(string, filter, case_sensitiveP, UNPROVIDED, UNPROVIDED) : nl_trie_completion.nl_trie_completions(string, case_sensitiveP);
			nl_trie_completions = Sort.sort(nl_trie_completions, symbol_function(STRING_LESSP), UNPROVIDED);
			completions = append(completions, nl_trie_completions);
		}
		return completions;
	}

	public static SubLObject cb_complete_choose(final SubLObject form, final SubLObject input, final SubLObject prefix, final SubLObject choices, final SubLObject completions, final SubLObject submit, final SubLObject filter) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject total = length(completions);
		final SubLObject common_extention = string_utilities.strings_common_prefix(completions, symbol_function(COMPLETION_STRING), length(prefix));
		final SubLObject extended_prefix = cconcatenate(prefix, common_extention);
		final SubLObject exact_matchP = find(extended_prefix, completions, symbol_function(EQUAL), symbol_function(COMPLETION_STRING), UNPROVIDED, UNPROVIDED);
		final SubLObject extensionP = numG(length(common_extention), ZERO_INTEGER);
		html_markup($str43$__DOCTYPE_html_PUBLIC_____W3C__DT);
		if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
			html_source_readability_terpri(UNPROVIDED);
			html_markup($str44$_meta_http_equiv__X_UA_Compatible);
		}
		html_source_readability_terpri(UNPROVIDED);
		final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
		try {
			cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
			html_markup(html_macros.$html_html_head$.getGlobalValue());
			html_markup(html_macros.$html_head_head$.getGlobalValue());
			html_macros.html_head_content_type();
			cb_complete_title(prefix);
			html_handle_complete_script(form, input, prefix);
			if (NIL != extensionP) {
				html_immediate_complete_extend_script(extended_prefix);
			}
			html_initial_focus_script();
			html_opener_message_on_load(NIL != exact_matchP ? total.numE(TWO_INTEGER) ? $str46$Exact_match_plus_one_longer_compl : format(NIL, $str47$Exact_match_plus__S_longer_comple, subtract(total, ONE_INTEGER)) : format(NIL, $str48$_S_possible__A_, total, NIL != string_utilities.empty_string_p(prefix) ? $$$suggestions : $$$completions));
			html_markup(html_macros.$html_head_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
			if ((NIL == $cb_pop_up_constant_completion$.getDynamicValue(thread)) || (NIL == extensionP)) {
				final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_markup(html_macros.$html_body_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_form_head$.getGlobalValue());
						html_markup(html_macros.$html_form_action$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
						final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
						final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_macros.$within_html_form$.bind(T, thread);
							html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
							cb_complete_preamble(prefix, filter);
							html_newline(UNPROVIDED);
							if (NIL != extensionP) {
								html_markup(html_macros.$html_strong_head$.getGlobalValue());
								html_princ($str50$Extension__);
								html_markup(html_macros.$html_strong_tail$.getGlobalValue());
								html_prin1(common_extention);
								html_newline(UNPROVIDED);
							}
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							final SubLObject color_val = $RED;
							html_markup(html_macros.$html_font_head$.getGlobalValue());
							if (NIL != color_val) {
								html_markup(html_macros.$html_font_color$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_color(color_val));
								html_char(CHAR_quotation, UNPROVIDED);
							}
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_princ(total);
								if (NIL != string_utilities.empty_string_p(prefix)) {
									html_princ($str52$_Suggestions_);
								} else {
									html_princ($str53$_Completions_);
								}
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
							}
							html_markup(html_macros.$html_font_tail$.getGlobalValue());
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
							final SubLObject constant_count = count_if(CONSTANT_P, completions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
							final SubLObject string_count = count_if(STRINGP, completions, UNPROVIDED, UNPROVIDED, UNPROVIDED);
							SubLObject seen_constantsP = NIL;
							SubLObject seen_stringsP = NIL;
							SubLObject previous_completion = NIL;
							SubLObject cdolist_list_var = completions;
							SubLObject completion = NIL;
							completion = cdolist_list_var.first();
							while (NIL != cdolist_list_var) {
								if ((NIL != constant_p(completion)) && (NIL == seen_constantsP)) {
									html_hr(UNPROVIDED, UNPROVIDED);
									html_markup(html_macros.$html_strong_head$.getGlobalValue());
									format(html_macros.$html_stream$.getDynamicValue(thread), $str54$Constants___A__, constant_count);
									html_markup(html_macros.$html_strong_tail$.getGlobalValue());
									seen_constantsP = T;
								} else if (completion.isString() && (NIL == seen_stringsP)) {
									html_hr(UNPROVIDED, UNPROVIDED);
									html_markup(html_macros.$html_strong_head$.getGlobalValue());
									format(html_macros.$html_stream$.getDynamicValue(thread), $str55$Lexical_Strings___A__, string_count);
									html_markup(html_macros.$html_strong_tail$.getGlobalValue());
									seen_stringsP = T;
								}

								html_newline(UNPROVIDED);
								if ((((NIL != constant_p(previous_completion)) && (NIL != constant_p(completion))) && (NIL != subl_promotions.memberP(previous_completion, choices, symbol_function(EQ), UNPROVIDED))) && (NIL == subl_promotions.memberP(completion, choices, symbol_function(EQ), UNPROVIDED))) {
									html_hr(UNPROVIDED, UNPROVIDED);
								}
								html_complete_insert_choice(completion, submit);
								previous_completion = completion;
								cdolist_list_var = cdolist_list_var.rest();
								completion = cdolist_list_var.first();
							}
							html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
						} finally {
							html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
							html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
						}
						html_markup(html_macros.$html_form_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
					}
					html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
				}
			}
			html_markup(html_macros.$html_html_tail$.getGlobalValue());
		} finally {
			cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
		}
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static SubLObject completion_string(final SubLObject completion) {
		if (NIL != constant_p(completion)) {
			return constants_high.constant_name(completion);
		}
		if (completion.isString()) {
			return completion;
		}
		return princ_to_string(completion);
	}

	public static SubLObject cb_complete_one(final SubLObject form, final SubLObject input, final SubLObject prefix, final SubLObject completion, final SubLObject submit, final SubLObject filter) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject name = completion_string(completion);
		final SubLObject completeP = equal(prefix, name);
		html_markup($str43$__DOCTYPE_html_PUBLIC_____W3C__DT);
		if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
			html_source_readability_terpri(UNPROVIDED);
			html_markup($str44$_meta_http_equiv__X_UA_Compatible);
		}
		html_source_readability_terpri(UNPROVIDED);
		final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
		try {
			cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
			html_markup(html_macros.$html_html_head$.getGlobalValue());
			html_markup(html_macros.$html_head_head$.getGlobalValue());
			html_macros.html_head_content_type();
			cb_complete_title(prefix);
			html_handle_complete_script(form, input, prefix);
			html_immediate_complete_choose_script(name, submit);
			html_opener_message_on_load(NIL != completeP ? $str56$Sole_completion__already_complete : $str57$Sole_completion_);
			html_markup(html_macros.$html_head_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
			if (NIL == $cb_pop_up_constant_completion$.getDynamicValue(thread)) {
				final SubLObject _prev_bind_0_$5 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_markup(html_macros.$html_body_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_form_head$.getGlobalValue());
						html_markup(html_macros.$html_form_action$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
						final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
						final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_macros.$within_html_form$.bind(T, thread);
							html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
							cb_complete_preamble(prefix, filter);
							html_newline(UNPROVIDED);
							if (NIL != completeP) {
								html_markup(html_macros.$html_strong_head$.getGlobalValue());
								html_princ($str58$Already_completed_);
								html_markup(html_macros.$html_strong_tail$.getGlobalValue());
							} else {
								html_markup(html_macros.$html_strong_head$.getGlobalValue());
								html_princ($str59$Sole_completion_);
								html_markup(html_macros.$html_strong_tail$.getGlobalValue());
								html_newline(UNPROVIDED);
								html_princ(name);
							}
							html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
						} finally {
							html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
							html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
						}
						html_markup(html_macros.$html_form_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
					}
					html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$5, thread);
				}
			}
			html_markup(html_macros.$html_html_tail$.getGlobalValue());
		} finally {
			cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
		}
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_complete_none(final SubLObject prefix, final SubLObject filter) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup($str43$__DOCTYPE_html_PUBLIC_____W3C__DT);
		if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
			html_source_readability_terpri(UNPROVIDED);
			html_markup($str44$_meta_http_equiv__X_UA_Compatible);
		}
		html_source_readability_terpri(UNPROVIDED);
		final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
		try {
			cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
			html_markup(html_macros.$html_html_head$.getGlobalValue());
			html_markup(html_macros.$html_head_head$.getGlobalValue());
			html_macros.html_head_content_type();
			cb_complete_title(prefix);
			if (NIL == string_utilities.empty_string_p(prefix)) {
				html_opener_message_on_load($str60$No_completions_);
			} else {
				html_opener_message_on_load($str61$No_suggestions_);
			}
			html_markup(html_macros.$html_head_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
			if (NIL == $cb_pop_up_constant_completion$.getDynamicValue(thread)) {
				final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_markup(html_macros.$html_body_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_form_head$.getGlobalValue());
						html_markup(html_macros.$html_form_action$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
						final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
						final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_macros.$within_html_form$.bind(T, thread);
							html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
							cb_complete_preamble(prefix, filter);
							html_newline(UNPROVIDED);
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							if (NIL == string_utilities.empty_string_p(prefix)) {
								html_princ($$$No_completions);
							} else {
								html_princ($$$No_suggestions);
							}
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
							html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
						} finally {
							html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
							html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
						}
						html_markup(html_macros.$html_form_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
					}
					html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
				}
			}
			html_markup(html_macros.$html_html_tail$.getGlobalValue());
		} finally {
			cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
		}
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static SubLObject cb_complete_title(final SubLObject prefix) {
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_title_head$.getGlobalValue());
		if (NIL != string_utilities.empty_string_p(prefix)) {
			html_princ($$$Suggestions);
		} else {
			html_princ($$$Completions);
		}
		html_markup(html_macros.$html_title_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject cb_complete_preamble(final SubLObject prefix, final SubLObject filter) {
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		if (NIL != string_utilities.empty_string_p(prefix)) {
			html_princ($$$Suggestions);
		} else {
			html_princ($$$Completions);
		}
		html_indent(TWO_INTEGER);
		html_script_utilities.html_dismiss_button(UNPROVIDED);
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_newline(UNPROVIDED);
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_princ($str66$Machine__);
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_princ(Environment.get_machine_name(UNPROVIDED));
		if (NIL == string_utilities.empty_string_p(prefix)) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_strong_head$.getGlobalValue());
			html_princ($str67$Prefix__);
			html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			html_princ(prefix);
		}
		if (NIL != filter) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_strong_head$.getGlobalValue());
			html_princ($str68$Filter__);
			html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			html_princ(filter);
		}
		return NIL;
	}

	public static SubLObject html_complete_insert_choice(final SubLObject choice, final SubLObject submit) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (((!choice.isString()) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == constant_p(choice))) {
			throw new AssertionError(choice);
		}
		final SubLObject name = completion_string(choice);
		html_markup(html_macros.$html_no_break_head$.getGlobalValue());
		html_markup(html_macros.$html_input_head$.getGlobalValue());
		html_markup(html_macros.$html_input_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_input_radio$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_input_name$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($$$complete);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_space, UNPROVIDED);
		format(html_macros.$html_stream$.getDynamicValue(thread), $html_complete_insert_choice_script$.getGlobalValue(), name, submit);
		if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		html_char(CHAR_greater, UNPROVIDED);
		html_indent(UNPROVIDED);
		html_princ(completion_string(choice));
		html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_print_js_autocomplete_setup_int(final SubLObject input_elt_name, final SubLObject container_elt_name, final SubLObject max_results, final SubLObject min_query_length, final SubLObject embedded_in_toolbar_frameP, SubLObject filter_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == filter_term) {
			filter_term = $$Thing;
		}
		final SubLObject toolbar_value = (NIL != embedded_in_toolbar_frameP) ? $$$true : $$$false;
		final SubLObject filter_term_id = cb_term_identifier(filter_term);
		final SubLObject filter_param = cconcatenate($str74$_filter_, web_utilities.html_url_encode(filter_term_id, UNPROVIDED));
		cyc_file_dependencies.javascript($AUTOCOMPLETE);
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_script_head$.getGlobalValue());
		html_markup(html_macros.$html_script_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str76$text_javascript);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			format(html_macros.$html_stream$.getDynamicValue(thread), $js_autocomplete_setup$.getDynamicValue(thread), new SubLObject[] { filter_param, input_elt_name, container_elt_name, min_query_length, max_results, toolbar_value });
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_script_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject xml_term_search(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject search_string = html_extract_input($$$searchString, args);
		final SubLObject case_sensitiveP = html_extract_sexpr($$$caseSensitive, args, UNPROVIDED);
		final SubLObject return_attrs = html_extract_sexpr($str80$return_attrs, args, $list81);
		final SubLObject timeout = html_extract_sexpr($$$timeout, args, UNPROVIDED);
		final SubLObject limit = html_extract_sexpr($$$count, args, $autocomplete_default_limit$.getDynamicValue(thread));
		final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
		try {
			xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
			SubLObject current;
			final SubLObject datum = current = get_constraint_filters_from_html_args(args);
			SubLObject isa_filter = NIL;
			SubLObject genls_filter = NIL;
			SubLObject isa_restrictions = NIL;
			SubLObject genls_restrictions = NIL;
			destructuring_bind_must_consp(current, datum, $list84);
			isa_filter = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list84);
			genls_filter = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list84);
			isa_restrictions = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list84);
			genls_restrictions = current.first();
			current = current.rest();
			if (NIL == current) {
				final SubLObject terms = cb_frames.terms_for_browsing(search_string, case_sensitiveP, NIL);
				final SubLObject term_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
				SubLObject cdolist_list_var = terms;
				SubLObject v_term = NIL;
				v_term = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if ((NIL != term_passes_arg_filters(v_term, isa_filter, genls_filter, $DEFAULT)) && (NIL != term_passes_arg_restrictions(v_term, isa_restrictions, genls_restrictions, $DEFAULT))) {
						dictionary_utilities.dictionary_pushnew(term_dict, v_term, pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
					}
					cdolist_list_var = cdolist_list_var.rest();
					v_term = cdolist_list_var.first();
				}
				stream_xml_term_result_set(term_dict, return_attrs, UNPROVIDED, UNPROVIDED);
			} else {
				cdestructuring_bind_error(datum, $list84);
			}
			return NIL;
		} finally {
			xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
		}
	}

	public static SubLObject xml_complete(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject prefix = html_extract_input($$$prefix, args);
		final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
		try {
			xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
			SubLObject v_properties = list(new SubLObject[] { $kw89$COMPLETE_ON_CONSTANTS_, T, $kw90$PREFER_HISTORY_TERMS_, html_extract_sexpr($$$preferHistory, args, T), $LEXICON, NIL, $kw93$CASE_SENSITIVE_, html_extract_sexpr($$$caseSensitive, args, NIL), $RETURN_ATTRS, html_extract_sexpr($str80$return_attrs, args, $list95), $TIMEOUT, html_extract_sexpr($$$timeout, args, UNPROVIDED), $LIMIT,
					html_extract_sexpr($$$count, args, $autocomplete_default_limit$.getDynamicValue(thread)), $MT, html_extract_cyclified_sexpr($$$mt, args, $$InferencePSC) });
			SubLObject current;
			final SubLObject datum = current = get_constraint_filters_from_html_args(args);
			SubLObject isa_filter = NIL;
			SubLObject genls_filter = NIL;
			SubLObject isa_restrictions = NIL;
			SubLObject genls_restrictions = NIL;
			destructuring_bind_must_consp(current, datum, $list84);
			isa_filter = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list84);
			genls_filter = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list84);
			isa_restrictions = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list84);
			genls_restrictions = current.first();
			current = current.rest();
			if (NIL == current) {
				v_properties = putf(v_properties, $ISA_FILTER, isa_filter);
				v_properties = putf(v_properties, $GENLS_FILTER, genls_filter);
				v_properties = putf(v_properties, $ISA_RESTRICTIONS, isa_restrictions);
				v_properties = putf(v_properties, $GENLS_RESTRICTIONS, genls_restrictions);
				xml_complete_int(prefix, v_properties);
			} else {
				cdestructuring_bind_error(datum, $list84);
			}
			return NIL;
		} finally {
			xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
		}
	}

	public static SubLObject get_constraint_filters_from_html_args(final SubLObject args) {
		final SubLObject filter_provided = cb_guess_term(html_extract_input($$$filter, args), UNPROVIDED);
		SubLObject isa_filter = (NIL != filter_provided) ? filter_provided : $$Thing;
		SubLObject genls_filter = NIL;
		SubLObject isa_restrictions = NIL;
		SubLObject genls_restrictions = NIL;
		final SubLObject mt = html_extract_cyclified_sexpr($$$mt, args, $$BaseKB);
		final SubLObject constraining_sentence = get_constraining_sentence_from_html_args(args);
		final SubLObject arg_position = cycl_utilities.formula_arg_positions(constraining_sentence, $TERM_TO_REPLACE, UNPROVIDED);
		if (NIL != constraining_sentence) {
			final SubLObject arg_constraints = (NIL != constraining_sentence) ? get_arg_constraints_for_arg(constraining_sentence, arg_position, mt) : NIL;
			isa_filter = get_isa_filter_from_arg_constraints(arg_constraints);
			genls_filter = get_genls_filter_from_arg_constraints(arg_constraints);
			isa_restrictions = get_isa_restrictions_from_sentence(constraining_sentence, mt);
			genls_restrictions = get_genls_restrictions_from_sentence(constraining_sentence, mt);
		} else if (NIL == forts.fort_p(isa_filter)) {
			if (NIL != pph_utilities.specs_fn_natP(isa_filter)) {
				genls_filter = cycl_utilities.nat_arg1(isa_filter, UNPROVIDED);
				isa_filter = $$Thing;
			} else {
				isa_filter = $$Thing;
			}
		}

		return list(isa_filter, genls_filter, isa_restrictions, genls_restrictions);
	}

	public static SubLObject clear_get_isa_restrictions_from_sentence() {
		final SubLObject cs = $get_isa_restrictions_from_sentence_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_isa_restrictions_from_sentence(final SubLObject sentence, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = $$UniversalVocabularyMt;
		}
		return memoization_state.caching_state_remove_function_results_with_args($get_isa_restrictions_from_sentence_caching_state$.getGlobalValue(), list(sentence, mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_isa_restrictions_from_sentence_internal(final SubLObject sentence, final SubLObject mt) {
		if ((cycl_utilities.formula_arg2(sentence, UNPROVIDED) == $TERM_TO_REPLACE) && (NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(sentence), $$isa, mt, UNPROVIDED))) {
			return genls.min_genls(cycl_utilities.formula_arg1(sentence, UNPROVIDED), mt, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject get_isa_restrictions_from_sentence(final SubLObject sentence, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = $$UniversalVocabularyMt;
		}
		SubLObject caching_state = $get_isa_restrictions_from_sentence_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_ISA_RESTRICTIONS_FROM_SENTENCE, $get_isa_restrictions_from_sentence_caching_state$, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
			memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_ISA_RESTRICTIONS_FROM_SENTENCE);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (sentence.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_isa_restrictions_from_sentence_internal(sentence, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject clear_get_genls_restrictions_from_sentence() {
		final SubLObject cs = $get_genls_restrictions_from_sentence_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_genls_restrictions_from_sentence(final SubLObject sentence, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = $$UniversalVocabularyMt;
		}
		return memoization_state.caching_state_remove_function_results_with_args($get_genls_restrictions_from_sentence_caching_state$.getGlobalValue(), list(sentence, mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_genls_restrictions_from_sentence_internal(final SubLObject sentence, final SubLObject mt) {
		if ((cycl_utilities.formula_arg2(sentence, UNPROVIDED) == $TERM_TO_REPLACE) && (NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(sentence), $$isa, mt, UNPROVIDED))) {
			return isa.min_isa(cycl_utilities.formula_arg1(sentence, UNPROVIDED), mt, UNPROVIDED);
		}
		if ((cycl_utilities.formula_arg2(sentence, UNPROVIDED) == $TERM_TO_REPLACE) && (NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(sentence), $$genls, mt, UNPROVIDED))) {
			return genls.min_genls(cycl_utilities.formula_arg1(sentence, UNPROVIDED), mt, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject get_genls_restrictions_from_sentence(final SubLObject sentence, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = $$UniversalVocabularyMt;
		}
		SubLObject caching_state = $get_genls_restrictions_from_sentence_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_GENLS_RESTRICTIONS_FROM_SENTENCE, $get_genls_restrictions_from_sentence_caching_state$, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
			memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_GENLS_RESTRICTIONS_FROM_SENTENCE);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (sentence.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_genls_restrictions_from_sentence_internal(sentence, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject clear_get_arg_constraints_for_arg() {
		final SubLObject cs = $get_arg_constraints_for_arg_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_arg_constraints_for_arg(final SubLObject cycl_sentence, final SubLObject arg_pos, final SubLObject mt) {
		return memoization_state.caching_state_remove_function_results_with_args($get_arg_constraints_for_arg_caching_state$.getGlobalValue(), list(cycl_sentence, arg_pos, mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_arg_constraints_for_arg_internal(final SubLObject cycl_sentence, final SubLObject arg_pos, final SubLObject mt) {
		final SubLObject arg = cycl_utilities.formula_arg_position(cycl_sentence, arg_pos, UNPROVIDED);
		final SubLObject var = (NIL != cycl_grammar.cycl_variable_p(arg)) ? arg : czer_utilities.unique_el_var_wrt_expression(cycl_sentence, UNPROVIDED);
		final SubLObject cycl_sentence_with_var = (NIL != cycl_grammar.cycl_variable_p(arg)) ? cycl_sentence : cycl_utilities.formula_subst(var, arg, cycl_sentence, EQUAL, UNPROVIDED);
		return get_arg_constraints_for_var(cycl_sentence_with_var, var, mt);
	}

	public static SubLObject get_arg_constraints_for_arg(final SubLObject cycl_sentence, final SubLObject arg_pos, final SubLObject mt) {
		SubLObject caching_state = $get_arg_constraints_for_arg_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_ARG_CONSTRAINTS_FOR_ARG, $get_arg_constraints_for_arg_caching_state$, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
			memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_ARG_CONSTRAINTS_FOR_ARG);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(cycl_sentence, arg_pos, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (cycl_sentence.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (arg_pos.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_arg_constraints_for_arg_internal(cycl_sentence, arg_pos, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cycl_sentence, arg_pos, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject clear_get_arg_constraints_for_var() {
		final SubLObject cs = $get_arg_constraints_for_var_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_arg_constraints_for_var(final SubLObject cycl_sentence_with_var, final SubLObject var, final SubLObject mt) {
		return memoization_state.caching_state_remove_function_results_with_args($get_arg_constraints_for_var_caching_state$.getGlobalValue(), list(cycl_sentence_with_var, var, mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_arg_constraints_for_var_internal(final SubLObject cycl_sentence_with_var, final SubLObject var, final SubLObject mt) {
		final SubLObject isa_constraints = at_var_types.formula_variable_isa_constraints(var, cycl_sentence_with_var, mt, UNPROVIDED);
		final SubLObject genls_constraints = at_var_types.formula_variable_genl_constraints(var, cycl_sentence_with_var, mt, UNPROVIDED);
		SubLObject arg_constraints = NIL;
		if (NIL != isa_constraints) {
			arg_constraints = list($ISA, isa_constraints);
		}
		if (NIL != genls_constraints) {
			arg_constraints = putf(arg_constraints, $GENLS, genls_constraints);
		}
		return arg_constraints;
	}

	public static SubLObject get_arg_constraints_for_var(final SubLObject cycl_sentence_with_var, final SubLObject var, final SubLObject mt) {
		SubLObject caching_state = $get_arg_constraints_for_var_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_ARG_CONSTRAINTS_FOR_VAR, $get_arg_constraints_for_var_caching_state$, $int$1024, EQUAL, THREE_INTEGER, ZERO_INTEGER);
			memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_ARG_CONSTRAINTS_FOR_VAR);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(cycl_sentence_with_var, var, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (cycl_sentence_with_var.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (var.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_arg_constraints_for_var_internal(cycl_sentence_with_var, var, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cycl_sentence_with_var, var, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject get_genls_filter_from_arg_constraints(final SubLObject arg_constraints) {
		final SubLObject genls_terms = getf(arg_constraints, $GENLS, UNPROVIDED);
		if (NIL != list_utilities.lengthE(genls_terms, ONE_INTEGER, UNPROVIDED)) {
			return genls_terms.first();
		}
		if (NIL != genls_terms) {
			return make_formula($$CollectionIntersectionFn, list(make_formula($$TheSet, genls_terms, UNPROVIDED)), UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject get_isa_filter_from_arg_constraints(final SubLObject arg_constraints) {
		final SubLObject isa_terms = getf(arg_constraints, $ISA, UNPROVIDED);
		if (NIL != list_utilities.lengthE(isa_terms, ONE_INTEGER, UNPROVIDED)) {
			return isa_terms.first();
		}
		if (NIL != isa_terms) {
			return make_formula($$CollectionIntersectionFn, list(make_formula($$TheSet, isa_terms, UNPROVIDED)), UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject get_constraining_sentence_from_html_args(final SubLObject args) {
		final SubLObject constraining_sentence_string = html_extract_input($$$constrainingSentence, args);
		final SubLObject raw_constraining_sentence = (NIL != constraining_sentence_string) ? read_from_string_ignoring_errors(string_utilities.cyclify_string(constraining_sentence_string), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
		SubLObject constraining_sentence = clean_up_non_constant_symbols(raw_constraining_sentence);
		if (constraining_sentence == $EOF) {
			constraining_sentence = NIL;
		}
		return constraining_sentence;
	}

	public static SubLObject clean_up_non_constant_symbols(final SubLObject sexpr) {
		return cycl_utilities.expression_transform(sexpr, $sym129$NON_CYCL_SYMBOL_, CONVERT_TO_KEYWORD, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject non_cycl_symbolP(final SubLObject obj) {
		return makeBoolean((obj.isSymbol() && (NIL == constantp(obj, UNPROVIDED))) && (NIL == cycl_grammar.cycl_variable_p(obj)));
	}

	public static SubLObject convert_to_keyword(final SubLObject symbol) {
		return make_keyword(string_utilities.to_string(symbol));
	}

	public static SubLObject completion_properties_p(final SubLObject v_properties) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject remainder;
		SubLObject property;
		SubLObject value;
		for (remainder = NIL, remainder = v_properties; NIL != remainder; remainder = cddr(remainder)) {
			property = remainder.first();
			value = cadr(remainder);
			if (NIL == subl_promotions.memberP(property, $completion_properties$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
				return NIL;
			}
		}
		return T;
	}

	public static SubLObject native_complete_int(final SubLObject prefix, SubLObject v_properties) {
		if (v_properties == UNPROVIDED) {
			v_properties = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != completion_properties_p(v_properties) : "html_complete.completion_properties_p(v_properties) " + "CommonSymbols.NIL != html_complete.completion_properties_p(v_properties) " + v_properties;
		thread.resetMultipleValues();
		final SubLObject completion_dictionary = get_xml_completion_data(prefix, v_properties);
		final SubLObject preferred_terms = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return term_result_set_as_list(completion_dictionary, getf(v_properties, $RETURN_ATTRS, UNPROVIDED), $DEFAULT, preferred_terms);
	}

	public static SubLObject xml_complete_int(final SubLObject prefix, SubLObject v_properties) {
		if (v_properties == UNPROVIDED) {
			v_properties = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != completion_properties_p(v_properties) : "html_complete.completion_properties_p(v_properties) " + "CommonSymbols.NIL != html_complete.completion_properties_p(v_properties) " + v_properties;
		thread.resetMultipleValues();
		final SubLObject completion_dictionary = get_xml_completion_data(prefix, v_properties);
		final SubLObject preferred_terms = thread.secondMultipleValue();
		thread.resetMultipleValues();
		stream_xml_term_result_set(completion_dictionary, getf(v_properties, $RETURN_ATTRS, UNPROVIDED), $DEFAULT, preferred_terms);
		return NIL;
	}

	public static SubLObject get_xml_completion_data(final SubLObject prefix, SubLObject v_properties) {
		if (v_properties == UNPROVIDED) {
			v_properties = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		v_properties = list_utilities.augment_plist_with_defaults(v_properties, $list133);
		final SubLObject mt = getf(v_properties, $MT, UNPROVIDED);
		final SubLObject cyc_terms_only = string_utilities.starts_with(prefix, $str134$__);
		final SubLObject clean_prefix = string_utilities.pre_remove(prefix, $str134$__, symbol_function(EQUAL));
		SubLObject completions = cb_completions(clean_prefix, $$Thing, NIL, T, getf(v_properties, $kw93$CASE_SENSITIVE_, UNPROVIDED), getf(v_properties, $kw89$COMPLETE_ON_CONSTANTS_, UNPROVIDED));
		final SubLObject completion_dict = dictionary.new_dictionary(EQUAL, UNPROVIDED);
		final SubLObject preferred_terms = (NIL != getf(v_properties, $kw90$PREFER_HISTORY_TERMS_, UNPROVIDED)) ? cb_tools.cb_current_relevant_terms() : NIL;
		final SubLObject isa_filter = getf(v_properties, $ISA_FILTER, UNPROVIDED);
		final SubLObject genls_filter = getf(v_properties, $GENLS_FILTER, UNPROVIDED);
		final SubLObject isa_restrictions = getf(v_properties, $ISA_RESTRICTIONS, UNPROVIDED);
		final SubLObject genls_restrictions = getf(v_properties, $GENLS_RESTRICTIONS, UNPROVIDED);
		SubLObject term_list = NIL;
		SubLObject current_count = ZERO_INTEGER;
		SubLObject timed_outP = NIL;
		SubLObject doneP = NIL;
		final SubLObject local_state;
		final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
		final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
				final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
				final SubLObject _prev_bind_0_$11 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
				final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
				final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
				try {
					sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
					sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
					sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
					final SubLObject tag = with_timeout_make_tag();
					try {
						thread.throwStack.push(tag);
						final SubLObject _prev_bind_0_$12 = $within_with_timeout$.currentBinding(thread);
						try {
							$within_with_timeout$.bind(T, thread);
							SubLObject timer = NIL;
							try {
								final SubLObject _prev_bind_0_$13 = $with_timeout_nesting_depth$.currentBinding(thread);
								try {
									$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
									timer = with_timeout_start_timer(getf(v_properties, $TIMEOUT, UNPROVIDED), tag);
									if (NIL == getf(v_properties, $kw93$CASE_SENSITIVE_, UNPROVIDED)) {
										completions = delete_duplicates(completions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
									}
									if (NIL == doneP) {
										SubLObject csome_list_var = completions;
										SubLObject completion = NIL;
										completion = csome_list_var.first();
										while ((NIL == doneP) && (NIL != csome_list_var)) {
											if (((NIL != constant_p(completion)) && (NIL != term_passes_arg_filters(completion, isa_filter, genls_filter, mt))) && (NIL != term_passes_arg_restrictions(completion, isa_restrictions, genls_restrictions, mt))) {
												add_completion_to_dict(completion, prefix, constants_high.constant_name(completion), completion_dict);
												current_count = add(current_count, ONE_INTEGER);
											}
											if ((NIL == cyc_terms_only) && (NIL == constant_p(completion))) {
												SubLObject cdolist_list_var = completion_denots_of_string(completion, getf(v_properties, $kw93$CASE_SENSITIVE_, UNPROVIDED), getf(v_properties, $LEXICON, UNPROVIDED));
												SubLObject v_term = NIL;
												v_term = cdolist_list_var.first();
												while (NIL != cdolist_list_var) {
													if ((NIL != term_passes_arg_filters(v_term, isa_filter, genls_filter, mt)) && (NIL != term_passes_arg_restrictions(v_term, isa_restrictions, genls_restrictions, mt))) {
														current_count = add(current_count, ONE_INTEGER);
														term_list = cons(v_term, term_list);
														add_completion_to_dict(v_term, prefix, completion, completion_dict);
													}
													cdolist_list_var = cdolist_list_var.rest();
													v_term = cdolist_list_var.first();
												}
											}
											if (current_count.numG(getf(v_properties, $LIMIT, UNPROVIDED))) {
												doneP = T;
											}
											csome_list_var = csome_list_var.rest();
											completion = csome_list_var.first();
										}
									}
								} finally {
									$with_timeout_nesting_depth$.rebind(_prev_bind_0_$13, thread);
								}
							} finally {
								final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									$is_thread_performing_cleanupP$.bind(T, thread);
									final SubLObject _values = getValuesAsVector();
									with_timeout_stop_timer(timer);
									restoreValuesFromVector(_values);
								} finally {
									$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
								}
							}
						} finally {
							$within_with_timeout$.rebind(_prev_bind_0_$12, thread);
						}
					} catch (final Throwable ccatch_env_var) {
						timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
					} finally {
						thread.throwStack.pop();
					}
					return values(completion_dict, preferred_terms);
				} finally {
					sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
					sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
					sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$11, thread);
				}
			} finally {
				final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values2 = getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
					restoreValuesFromVector(_values2);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
	}

	public static SubLObject add_completion_to_dict(final SubLObject completion, final SubLObject prefix, final SubLObject matched_string, final SubLObject completion_dict) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject display_string = display_string_for_completion(completion, prefix, matched_string);
		final SubLObject preferredP = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != preferredP) {
			dictionary_utilities.dictionary_push(completion_dict, completion, display_string);
		} else {
			dictionary.dictionary_enter(completion_dict, completion, list_utilities.add_to_end(display_string, dictionary.dictionary_lookup_without_values(completion_dict, completion, NIL)));
		}
		return completion_dict;
	}

	public static SubLObject completion_denots_of_string_internal(final SubLObject string, SubLObject case_sensitiveP, SubLObject lexicon) {
		if (case_sensitiveP == UNPROVIDED) {
			case_sensitiveP = NIL;
		}
		if (lexicon == UNPROVIDED) {
			lexicon = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject denots = NIL;
		final SubLObject lexicon_to_use = (NIL != lexicon) ? lexicon : completion_lexicon(case_sensitiveP);
		denots = lexicon_accessors.denots_of_string(string, NIL, $DENOT, T, NIL, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), $NEVER, NIL, lexicon_to_use);
		return denots;
	}

	public static SubLObject completion_denots_of_string(final SubLObject string, SubLObject case_sensitiveP, SubLObject lexicon) {
		if (case_sensitiveP == UNPROVIDED) {
			case_sensitiveP = NIL;
		}
		if (lexicon == UNPROVIDED) {
			lexicon = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return completion_denots_of_string_internal(string, case_sensitiveP, lexicon);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COMPLETION_DENOTS_OF_STRING, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COMPLETION_DENOTS_OF_STRING, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, COMPLETION_DENOTS_OF_STRING, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(string, case_sensitiveP, lexicon);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (string.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (case_sensitiveP.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexicon.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(completion_denots_of_string_internal(string, case_sensitiveP, lexicon)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, case_sensitiveP, lexicon));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject completion_lexicon_internal(final SubLObject case_sensitiveP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return denots_of_string_lexicon.lexicon_for_denots_of_string($list139, $DENOT, T, NIL, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), NIL != case_sensitiveP ? $ON : $OFF);
	}

	public static SubLObject completion_lexicon(final SubLObject case_sensitiveP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return completion_lexicon_internal(case_sensitiveP);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COMPLETION_LEXICON, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COMPLETION_LEXICON, ONE_INTEGER, NIL, EQL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, COMPLETION_LEXICON, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, case_sensitiveP, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(completion_lexicon_internal(case_sensitiveP)));
			memoization_state.caching_state_put(caching_state, case_sensitiveP, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject display_string_for_completion(final SubLObject v_term, final SubLObject prefix, final SubLObject matched_string) {
		if (NIL != forts.fort_p(v_term)) {
			final SubLObject preferred_paraphrase = preferred_paraphrase_for_completion_term(v_term);
			final SubLObject utf_8 = (NIL != preferred_paraphrase) ? cycl_string.cycl_string_to_utf8_string(preferred_paraphrase) : NIL;
			if ((NIL != utf_8) && (NIL != string_utilities.starts_with_by_test(utf_8, prefix, symbol_function(EQUALP)))) {
				return values(utf_8, T);
			}
		}
		final SubLObject preferredP = makeBoolean(((NIL != constant_p(v_term)) && matched_string.equal(constants_high.constant_name(v_term))) || (NIL != subl_promotions.memberP(v_term, completion_denots_of_string(matched_string, T, UNPROVIDED), UNPROVIDED, UNPROVIDED)));
		return values(matched_string, preferredP);
	}

	public static SubLObject select_display_string_for_completion_term(SubLObject strings, final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject pcase_var;
		final SubLObject orig_length = pcase_var = length(strings);
		if (pcase_var.eql(ZERO_INTEGER)) {
			return NIL;
		}
		if (pcase_var.eql(ONE_INTEGER)) {
			return strings.first();
		}
		strings = delete_duplicates(strings, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL != list_utilities.lengthL(strings, orig_length, UNPROVIDED)) {
			return select_display_string_for_completion_term(strings, v_term);
		}
		final SubLObject preferred_paraphrase = preferred_paraphrase_for_completion_term(v_term);
		final SubLObject utf_8 = (NIL != preferred_paraphrase) ? cycl_string.cycl_string_to_utf8_string(preferred_paraphrase) : NIL;
		if (NIL != find(utf_8, strings, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			return utf_8;
		}
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			SubLObject cdolist_list_var = strings;
			SubLObject string = NIL;
			string = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (virtual_indexing.num_overlap_index(list(v_term, string), UNPROVIDED).isPositive()) {
					return string;
				}
				cdolist_list_var = cdolist_list_var.rest();
				string = cdolist_list_var.first();
			}
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return strings.first();
	}

	public static SubLObject preferred_paraphrase_for_completion_term(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == forts.fort_p(v_term)) {
			return NIL;
		}
		thread.resetMultipleValues();
		SubLObject preferred_paraphrase = nl_generation_fort_cache.nl_generation_cache_lookup(v_term, UNPROVIDED, UNPROVIDED);
		SubLObject agr_pred = thread.secondMultipleValue();
		SubLObject demerits = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		if (NIL == preferred_paraphrase) {
			thread.resetMultipleValues();
			final SubLObject preferred_paraphrase_$16 = nl_generation_fort_cache.paraphrase_fort_for_cache(v_term, UNPROVIDED, UNPROVIDED);
			final SubLObject agr_pred_$17 = thread.secondMultipleValue();
			final SubLObject demerits_$18 = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			preferred_paraphrase = preferred_paraphrase_$16;
			agr_pred = agr_pred_$17;
			demerits = demerits_$18;
		}
		if (((NIL != preferred_paraphrase) && demerits.isNumber()) && demerits.numLE(ONE_INTEGER)) {
			return preferred_paraphrase;
		}
		return NIL;
	}

	public static SubLObject stream_xml_term_result_set(final SubLObject term_dictionary, SubLObject return_attrs, SubLObject term_list, SubLObject preferred_terms) {
		if (return_attrs == UNPROVIDED) {
			return_attrs = $list81;
		}
		if (term_list == UNPROVIDED) {
			term_list = $DEFAULT;
		}
		if (preferred_terms == UNPROVIDED) {
			preferred_terms = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject sorted_term_alist_1 = dictionary_utilities.sort_dictionary_by_keys(term_dictionary, $sym142$NUM_INDEX_);
		final SubLObject sorted_term_alist = sort_preferred_completions_to_front(sorted_term_alist_1, set_utilities.construct_set_from_list(preferred_terms, UNPROVIDED, UNPROVIDED));
		if (term_list == $DEFAULT) {
			term_list = dictionary.dictionary_keys(term_dictionary);
		}
		xml_utilities.xml_markup($str143$__xml_version__1_0__encoding__UTF);
		xml_utilities.xml_terpri();
		final SubLObject attrs = $list144;
		try {
			final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
			final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
			try {
				xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
				xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
				xml_utilities.xml_start_tag_internal($$$ResultSet, attrs, NIL, T, $UNINITIALIZED);
				final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding(thread);
				try {
					xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
					SubLObject cdolist_list_var = sorted_term_alist;
					SubLObject cons = NIL;
					cons = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						SubLObject current;
						final SubLObject datum = current = cons;
						SubLObject constant = NIL;
						SubLObject completion_strings = NIL;
						destructuring_bind_must_consp(current, datum, $list146);
						constant = current.first();
						current = completion_strings = current.rest();
						SubLObject attrs_$20 = NIL;
						if (NIL != subl_promotions.memberP($CYCL, return_attrs, UNPROVIDED, UNPROVIDED)) {
							attrs_$20 = cons($$$cycl, cons(format_nil.format_nil_s(cycl_utilities.hl_to_el(constant)), attrs_$20));
						}
						if (NIL != subl_promotions.memberP($NL, return_attrs, UNPROVIDED, UNPROVIDED)) {
							attrs_$20 = cons($$$nl, cons(select_display_string_for_completion_term(completion_strings, constant), attrs_$20));
						}
						if (NIL != subl_promotions.memberP($DISAMBIG_STRING, return_attrs, UNPROVIDED, UNPROVIDED)) {
							final SubLObject disambig_terms = pph_disambiguation.clarification_terms_wrt(constant, term_list, ONE_INTEGER, UNPROVIDED);
							if (NIL != disambig_terms) {
								attrs_$20 = cons($$$disambigString, cons(pph_main.generate_phrase(disambig_terms.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), attrs_$20));
							}
						}
						if (NIL != subl_promotions.memberP($HL_ID, return_attrs, UNPROVIDED, UNPROVIDED)) {
							attrs_$20 = cons($$$hlId, cons(kb_utilities.compact_hl_external_id_string(constant), attrs_$20));
						}
						final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
						final SubLObject _prev_bind_1_$22 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
						try {
							xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
							xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
							xml_utilities.xml_start_tag_internal($$$Term, attrs_$20, T, NIL, $UNINITIALIZED);
							final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
							try {
								xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
							} finally {
								xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
							}
						} finally {
							xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$22, thread);
							xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$20, thread);
						}
						xml_utilities.xml_terpri();
						cdolist_list_var = cdolist_list_var.rest();
						cons = cdolist_list_var.first();
					}
				} finally {
					xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$19, thread);
				}
			} finally {
				xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
				xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
			}
		} finally {
			final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				xml_utilities.xml_terpri();
				xml_utilities.xml_end_tag_internal($$$ResultSet);
				restoreValuesFromVector(_values);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
			}
		}
		return NIL;
	}

	public static SubLObject term_result_set_as_list(final SubLObject term_dictionary, SubLObject return_attrs, SubLObject term_list, SubLObject preferred_terms) {
		if (return_attrs == UNPROVIDED) {
			return_attrs = $list81;
		}
		if (term_list == UNPROVIDED) {
			term_list = $DEFAULT;
		}
		if (preferred_terms == UNPROVIDED) {
			preferred_terms = NIL;
		}
		final SubLObject term_alist = dictionary_utilities.dictionary_to_alist(term_dictionary);
		final SubLObject sorted_term_alist_1 = Sort.sort(term_alist, $sym142$NUM_INDEX_, FIRST);
		final SubLObject sorted_term_alist = sort_preferred_completions_to_front(sorted_term_alist_1, set_utilities.construct_set_from_list(preferred_terms, UNPROVIDED, UNPROVIDED));
		SubLObject result = NIL;
		if (term_list == $DEFAULT) {
			term_list = dictionary.dictionary_keys(term_dictionary);
		}
		SubLObject cdolist_list_var = sorted_term_alist;
		SubLObject cons = NIL;
		cons = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = cons;
			SubLObject constant = NIL;
			SubLObject completion_strings = NIL;
			destructuring_bind_must_consp(current, datum, $list146);
			constant = current.first();
			current = completion_strings = current.rest();
			final SubLObject attrs = NIL;
			SubLObject item = NIL;
			if (NIL != subl_promotions.memberP($CYCL, return_attrs, UNPROVIDED, UNPROVIDED)) {
				item = cons(constant, item);
				item = cons($CYCL, item);
			}
			if (NIL != subl_promotions.memberP($NL, return_attrs, UNPROVIDED, UNPROVIDED)) {
				item = cons(completion_strings.first(), item);
				item = cons($NL, item);
			}
			if (NIL != subl_promotions.memberP($DISAMBIG_STRING, return_attrs, UNPROVIDED, UNPROVIDED)) {
				final SubLObject disambig_terms = pph_disambiguation.clarification_terms_wrt(constant, term_list, ONE_INTEGER, UNPROVIDED);
				if (NIL != disambig_terms) {
					item = cons(pph_main.generate_phrase(disambig_terms.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), item);
					item = cons($DISAMBIG_STRING, item);
				}
			}
			if (NIL != subl_promotions.memberP($HL_ID, return_attrs, UNPROVIDED, UNPROVIDED)) {
				item = cons(kb_utilities.compact_hl_external_id_string(constant), item);
				item = cons($HL_ID, item);
			}
			result = cons(item, result);
			cdolist_list_var = cdolist_list_var.rest();
			cons = cdolist_list_var.first();
		}
		return nreverse(result);
	}

	public static SubLObject sort_preferred_completions_to_front(final SubLObject completion_items, final SubLObject preferred) {
		return list_utilities.sort_preferred_to_front(copy_list(completion_items), preferred, symbol_function(FIRST));
	}

	public static SubLObject clear_term_passes_arg_restrictions() {
		final SubLObject cs = $term_passes_arg_restrictions_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_term_passes_arg_restrictions(final SubLObject v_term, final SubLObject isa_restrictions, final SubLObject genls_restrictions, final SubLObject mt) {
		return memoization_state.caching_state_remove_function_results_with_args($term_passes_arg_restrictions_caching_state$.getGlobalValue(), list(v_term, isa_restrictions, genls_restrictions, mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject term_passes_arg_restrictions_internal(final SubLObject v_term, final SubLObject isa_restrictions, final SubLObject genls_restrictions, SubLObject mt) {
		if (mt == $DEFAULT) {
			mt = $$BaseKB;
		}
		SubLObject cdolist_list_var = isa_restrictions;
		SubLObject isa_restriction = NIL;
		isa_restriction = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != isa.not_isaP(v_term, isa_restriction, mt, UNPROVIDED)) {
				return NIL;
			}
			cdolist_list_var = cdolist_list_var.rest();
			isa_restriction = cdolist_list_var.first();
		}
		cdolist_list_var = genls_restrictions;
		SubLObject genls_restriction = NIL;
		genls_restriction = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cdolist_list_var = cdolist_list_var.rest();
			genls_restriction = cdolist_list_var.first();
		}
		return T;
	}

	public static SubLObject term_passes_arg_restrictions(final SubLObject v_term, final SubLObject isa_restrictions, final SubLObject genls_restrictions, final SubLObject mt) {
		SubLObject caching_state = $term_passes_arg_restrictions_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(TERM_PASSES_ARG_RESTRICTIONS, $term_passes_arg_restrictions_caching_state$, NIL, EQUALP, FOUR_INTEGER, ZERO_INTEGER);
			memoization_state.register_hl_store_cache_clear_callback(CLEAR_TERM_PASSES_ARG_RESTRICTIONS);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_4(v_term, isa_restrictions, genls_restrictions, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (v_term.equalp(cached_args.first())) {
					cached_args = cached_args.rest();
					if (isa_restrictions.equalp(cached_args.first())) {
						cached_args = cached_args.rest();
						if (genls_restrictions.equalp(cached_args.first())) {
							cached_args = cached_args.rest();
							if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equalp(cached_args.first())) {
								return memoization_state.caching_results(results2);
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(term_passes_arg_restrictions_internal(v_term, isa_restrictions, genls_restrictions, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, isa_restrictions, genls_restrictions, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject term_passes_arg_filters(final SubLObject v_term, final SubLObject isa_filter, final SubLObject genls_filter, SubLObject mt) {
		if (mt == $DEFAULT) {
			mt = $$InferencePSC;
		}
		final SubLObject isa_filter_terms = get_constraints_from_filter(isa_filter);
		SubLObject failP = NIL;
		if (NIL == failP) {
			SubLObject csome_list_var;
			SubLObject isa_constraint;
			for (csome_list_var = isa_filter_terms, isa_constraint = NIL, isa_constraint = csome_list_var.first(); (NIL == failP) && (NIL != csome_list_var); failP = makeBoolean(NIL == autocomplete_instance_ofP(v_term, isa_constraint, mt)), csome_list_var = csome_list_var.rest(), isa_constraint = csome_list_var.first()) {
			}
		}
		return makeBoolean((NIL == failP) && (NIL != term_passes_genls_filter(v_term, genls_filter, mt)));
	}

	public static SubLObject term_passes_genls_filter(final SubLObject v_term, final SubLObject genls_filter, final SubLObject mt) {
		final SubLObject genls_filter_terms = get_constraints_from_filter(genls_filter);
		SubLObject failP = NIL;
		if (NIL == failP) {
			SubLObject csome_list_var;
			SubLObject genls_constraint;
			for (csome_list_var = genls_filter_terms, genls_constraint = NIL, genls_constraint = csome_list_var.first(); (NIL == failP) && (NIL != csome_list_var); failP = makeBoolean(NIL == autocomplete_spec_ofP(v_term, genls_constraint, mt)), csome_list_var = csome_list_var.rest(), genls_constraint = csome_list_var.first()) {
			}
		}
		return makeBoolean(NIL == failP);
	}

	public static SubLObject get_constraints_from_filter(final SubLObject filter) {
		if (cycl_utilities.formula_arg0(filter).equal($$CollectionIntersectionFn)) {
			return cycl_utilities.formula_args(cycl_utilities.formula_arg1(filter, UNPROVIDED), UNPROVIDED);
		}
		return NIL != filter ? list(filter) : NIL;
	}

	public static SubLObject clear_autocomplete_isa_cache() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject keys = NIL;
		SubLObject release = NIL;
		try {
			release = seize_lock($autocomplete_isa_cache_lock$.getGlobalValue());
			keys = cache.cache_keys($autocomplete_isa_cache$.getDynamicValue(thread));
			cache.cache_clear($autocomplete_isa_cache$.getDynamicValue(thread));
		} finally {
			if (NIL != release) {
				release_lock($autocomplete_isa_cache_lock$.getGlobalValue());
			}
		}
		SubLObject cdolist_list_var = keys;
		SubLObject key = NIL;
		key = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = key;
			SubLObject constraint = NIL;
			SubLObject mt = NIL;
			destructuring_bind_must_consp(current, datum, $list163);
			constraint = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list163);
			mt = current.first();
			current = current.rest();
			if (NIL != current) {
				cdestructuring_bind_error(datum, $list163);
			}
			cdolist_list_var = cdolist_list_var.rest();
			key = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject clear_autocomplete_genls_cache() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject keys = NIL;
		SubLObject release = NIL;
		try {
			release = seize_lock($autocomplete_genls_cache_lock$.getGlobalValue());
			keys = cache.cache_keys($autocomplete_genls_cache$.getDynamicValue(thread));
			cache.cache_clear($autocomplete_genls_cache$.getDynamicValue(thread));
		} finally {
			if (NIL != release) {
				release_lock($autocomplete_genls_cache_lock$.getGlobalValue());
			}
		}
		SubLObject cdolist_list_var = keys;
		SubLObject key = NIL;
		key = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = key;
			SubLObject constraint = NIL;
			SubLObject mt = NIL;
			destructuring_bind_must_consp(current, datum, $list163);
			constraint = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list163);
			mt = current.first();
			current = current.rest();
			if (NIL != current) {
				cdestructuring_bind_error(datum, $list163);
			}
			cdolist_list_var = cdolist_list_var.rest();
			key = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject instance_of_precachedP(final SubLObject v_term, final SubLObject isa_constraint, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != narts_high.naut_p(v_term)) {
			return values(NIL, NIL);
		}
		SubLObject instance_ofP = NIL;
		SubLObject instance_set = NIL;
		SubLObject cached = NIL;
		SubLObject release = NIL;
		try {
			release = seize_lock($autocomplete_isa_cache_lock$.getGlobalValue());
			thread.resetMultipleValues();
			final SubLObject instance_set_$24 = cache.cache_get($autocomplete_isa_cache$.getDynamicValue(thread), list(isa_constraint, mt));
			final SubLObject cached_$25 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			instance_set = instance_set_$24;
			cached = cached_$25;
		} finally {
			if (NIL != release) {
				release_lock($autocomplete_isa_cache_lock$.getGlobalValue());
			}
		}
		if (NIL != cached) {
			instance_ofP = set.set_memberP(v_term, instance_set);
		}
		return values(instance_ofP, cached);
	}

	public static SubLObject spec_of_precachedP(final SubLObject v_term, final SubLObject genls_constraint, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != narts_high.naut_p(v_term)) {
			return values(NIL, NIL);
		}
		SubLObject spec_ofP = NIL;
		SubLObject spec_set = NIL;
		SubLObject cached = NIL;
		SubLObject release = NIL;
		try {
			release = seize_lock($autocomplete_genls_cache_lock$.getGlobalValue());
			thread.resetMultipleValues();
			final SubLObject spec_set_$26 = cache.cache_get($autocomplete_genls_cache$.getDynamicValue(thread), list(genls_constraint, mt));
			final SubLObject cached_$27 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			spec_set = spec_set_$26;
			cached = cached_$27;
		} finally {
			if (NIL != release) {
				release_lock($autocomplete_genls_cache_lock$.getGlobalValue());
			}
		}
		if (NIL != cached) {
			spec_ofP = set.set_memberP(v_term, spec_set);
		}
		return values(spec_ofP, cached);
	}

	public static SubLObject autocomplete_instance_ofP(final SubLObject v_term, final SubLObject isa_constraint, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject passes_constraint = instance_of_precachedP(v_term, isa_constraint, mt);
		final SubLObject cachedP = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != cachedP) {
			return passes_constraint;
		}
		if (NIL != kb_utilities.kbeq(isa_constraint, $$Thing)) {
			return T;
		}
		if (NIL != kb_utilities.kbeq(isa_constraint, $$Collection)) {
			return fort_types_interface.fort_has_typeP(v_term, isa_constraint, mt);
		}
		if (NIL != narts_high.naut_p(v_term)) {
			return isa.isaP(v_term, isa_constraint, mt, UNPROVIDED);
		}
		if (NIL == cardinality_estimates.generality_estimateL(isa_constraint, $$PhysiologicalCondition)) {
			precache_isa_constraint(isa_constraint, mt);
			return isa.isaP(v_term, isa_constraint, mt, UNPROVIDED);
		}
		precache_isa_constraint_guts(isa_constraint, mt);
		return instance_of_precachedP(v_term, isa_constraint, mt);
	}

	public static SubLObject autocomplete_spec_ofP(final SubLObject v_term, final SubLObject genls_constraint, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject passes_constraint = spec_of_precachedP(v_term, genls_constraint, mt);
		final SubLObject cachedP = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != cachedP) {
			return passes_constraint;
		}
		if (NIL != narts_high.naut_p(v_term)) {
			return genls.genlsP(v_term, genls_constraint, mt, UNPROVIDED);
		}
		if (NIL != kb_utilities.kbeq(genls_constraint, $$Thing)) {
			return fort_types_interface.fort_has_typeP(v_term, $$Collection, mt);
		}
		if (NIL == cardinality_estimates.generality_estimateL(genls_constraint, $$PhysiologicalCondition)) {
			precache_genls_constraint(genls_constraint, mt);
			return genls.genlsP(v_term, genls_constraint, mt, UNPROVIDED);
		}
		precache_genls_constraint_guts(genls_constraint, mt);
		return spec_of_precachedP(v_term, genls_constraint, mt);
	}

	public static SubLObject precache_isa_constraint(final SubLObject constraint, final SubLObject mt) {
		return operation_queues.auxiliary_queue_enqueue(list(FI_EVAL, list(QUOTE, list(PRECACHE_ISA_CONSTRAINT_GUTS, constraint, mt))));
	}

	public static SubLObject precache_genls_constraint(final SubLObject constraint, final SubLObject mt) {
		return fi.fi_local_eval(list(PRECACHE_GENLS_CONSTRAINT_GUTS, constraint, mt));
	}

	public static SubLObject precache_isa_constraint_guts(final SubLObject constraint, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject doneP = NIL;
		final SubLObject key = list(constraint, mt);
		SubLObject release = NIL;
		try {
			release = seize_lock($autocomplete_isa_cache_lock$.getGlobalValue());
			if (NIL != cache.cache_get($autocomplete_isa_cache$.getDynamicValue(thread), key)) {
				doneP = T;
			}
		} finally {
			if (NIL != release) {
				release_lock($autocomplete_isa_cache_lock$.getGlobalValue());
			}
		}
		if (NIL == doneP) {
			final SubLObject instance_set = set_utilities.construct_set_from_list(isa.all_instances(constraint, mt, UNPROVIDED), EQUAL, UNPROVIDED);
			SubLObject release_$28 = NIL;
			try {
				release_$28 = seize_lock($autocomplete_isa_cache_lock$.getGlobalValue());
				cache.cache_set($autocomplete_isa_cache$.getDynamicValue(thread), key, instance_set);
			} finally {
				if (NIL != release_$28) {
					release_lock($autocomplete_isa_cache_lock$.getGlobalValue());
				}
			}
		}
		return NIL;
	}

	public static SubLObject precache_genls_constraint_guts(final SubLObject constraint, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject doneP = NIL;
		final SubLObject key = list(constraint, mt);
		final SubLObject my_id = random.random($int$1000);
		SubLObject release = NIL;
		try {
			release = seize_lock($autocomplete_genls_cache_lock$.getGlobalValue());
			thread.resetMultipleValues();
			final SubLObject value = cache.cache_get($autocomplete_genls_cache$.getDynamicValue(thread), key);
			final SubLObject presentP = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (NIL != presentP) {
				doneP = T;
			}
		} finally {
			if (NIL != release) {
				release_lock($autocomplete_genls_cache_lock$.getGlobalValue());
			}
		}
		if (NIL == doneP) {
			final SubLObject spec_set = set_utilities.construct_set_from_list(genls.all_specs(constraint, mt, UNPROVIDED), EQUAL, UNPROVIDED);
			SubLObject release_$29 = NIL;
			try {
				release_$29 = seize_lock($autocomplete_genls_cache_lock$.getGlobalValue());
				cache.cache_set($autocomplete_genls_cache$.getDynamicValue(thread), key, spec_set);
			} finally {
				if (NIL != release_$29) {
					release_lock($autocomplete_genls_cache_lock$.getGlobalValue());
				}
			}
		}
		return NIL;
	}

	public static SubLObject genlsPX(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (tv == UNPROVIDED) {
			tv = NIL;
		}
		if ((NIL != function_terms.nat_formula_p(genl)) && cycl_utilities.formula_operator(genl).equal($$CollectionIntersectionFn)) {
			SubLObject cdolist_list_var;
			final SubLObject v_genls = cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg1(genl, UNPROVIDED), UNPROVIDED);
			SubLObject sub_genl = NIL;
			sub_genl = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL == genlsPX(spec, sub_genl, mt, tv)) {
					return NIL;
				}
				cdolist_list_var = cdolist_list_var.rest();
				sub_genl = cdolist_list_var.first();
			}
			if (NIL != v_genls) {
				return T;
			}
		}
		return genls.genlsP(spec, genl, mt, tv);
	}

	public static SubLObject num_indexG(final SubLObject a, final SubLObject b) {
		return numG(kb_indexing.num_index(a), kb_indexing.num_index(b));
	}

	public static SubLObject html_handle_cyclify_script(final SubLObject form, final SubLObject input) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_script_head$.getGlobalValue());
		html_markup(html_macros.$html_script_language$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_script_javascript$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			format(html_macros.$html_stream$.getDynamicValue(thread), $html_handle_cyclify_script_parameters$.getGlobalValue(), new SubLObject[] { form, input, NIL != $cb_pop_up_constant_completion$.getDynamicValue(thread) ? $$$true : $$$false });
			html_terpri(UNPROVIDED);
			html_markup($html_handle_cyclify_script$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_script_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_immediate_perform_cyclify_script(final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_script_head$.getGlobalValue());
		html_markup(html_macros.$html_script_language$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_script_javascript$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ($html_immediate_perform_cyclify_script_prefix$.getGlobalValue());
			final SubLObject _prev_bind_0_$30 = $html_url_princ_escape_spaces$.currentBinding(thread);
			try {
				$html_url_princ_escape_spaces$.bind(NIL, thread);
				html_url_princ(string);
			} finally {
				$html_url_princ_escape_spaces$.rebind(_prev_bind_0_$30, thread);
			}
			html_princ($html_immediate_perform_cyclify_script_postfix$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_script_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject cb_cyclify(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject form = html_extract_input($$$form, args);
		final SubLObject input = html_extract_input($$$input, args);
		final SubLObject string = string_utilities.subst_whitespace(html_extract_input($$$string, args));
		thread.resetMultipleValues();
		final SubLObject new_string = string_utilities.cyclify_string(string);
		final SubLObject added_references = thread.secondMultipleValue();
		thread.resetMultipleValues();
		thread.resetMultipleValues();
		final SubLObject valid_references = string_utilities.constant_names_in_string(new_string, UNPROVIDED);
		final SubLObject invalid_references = thread.secondMultipleValue();
		thread.resetMultipleValues();
		html_markup($str43$__DOCTYPE_html_PUBLIC_____W3C__DT);
		if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
			html_source_readability_terpri(UNPROVIDED);
			html_markup($str44$_meta_http_equiv__X_UA_Compatible);
		}
		html_source_readability_terpri(UNPROVIDED);
		final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
		try {
			cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
			html_markup(html_macros.$html_html_head$.getGlobalValue());
			html_markup(html_macros.$html_head_head$.getGlobalValue());
			html_macros.html_head_content_type();
			html_source_readability_terpri(UNPROVIDED);
			html_markup(html_macros.$html_title_head$.getGlobalValue());
			html_princ($$$Cyclify);
			html_markup(html_macros.$html_title_tail$.getGlobalValue());
			html_handle_cyclify_script(form, input);
			html_immediate_perform_cyclify_script(new_string);
			html_opener_message_on_load($str178$All_valid____references_have_been);
			html_markup(html_macros.$html_head_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
			final SubLObject _prev_bind_0_$31 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
				html_macros.$html_inside_bodyP$.bind(T, thread);
				html_markup(html_macros.$html_body_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
					final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
					final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						html_markup(html_macros.$html_strong_head$.getGlobalValue());
						html_princ($$$Cyclify);
						html_indent(TWO_INTEGER);
						html_script_utilities.html_dismiss_button(UNPROVIDED);
						html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						html_newline(UNPROVIDED);
						html_markup(html_macros.$html_strong_head$.getGlobalValue());
						html_princ($str66$Machine__);
						html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						html_princ(Environment.get_machine_name(UNPROVIDED));
						if (NIL != invalid_references) {
							html_newline(UNPROVIDED);
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							final SubLObject color_val = $RED;
							html_markup(html_macros.$html_font_head$.getGlobalValue());
							if (NIL != color_val) {
								html_markup(html_macros.$html_font_color$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(html_color(color_val));
								html_char(CHAR_quotation, UNPROVIDED);
							}
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_princ($str179$Invalid_references__);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
							}
							html_markup(html_macros.$html_font_tail$.getGlobalValue());
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
							SubLObject cdolist_list_var = invalid_references;
							SubLObject invalid_reference = NIL;
							invalid_reference = cdolist_list_var.first();
							while (NIL != cdolist_list_var) {
								html_newline(UNPROVIDED);
								html_indent(TWO_INTEGER);
								html_princ(invalid_reference);
								cdolist_list_var = cdolist_list_var.rest();
								invalid_reference = cdolist_list_var.first();
							}
						}
						html_newline(UNPROVIDED);
						if (NIL != added_references) {
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_princ($str180$Added_references__);
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
							SubLObject cdolist_list_var = added_references;
							SubLObject added_reference = NIL;
							added_reference = cdolist_list_var.first();
							while (NIL != cdolist_list_var) {
								html_newline(UNPROVIDED);
								html_indent(TWO_INTEGER);
								html_princ(added_reference);
								cdolist_list_var = cdolist_list_var.rest();
								added_reference = cdolist_list_var.first();
							}
						} else {
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_princ($$$No_references_added);
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						}
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					} finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
					}
					html_markup(html_macros.$html_form_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
				}
				html_markup(html_macros.$html_body_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$31, thread);
			}
			html_markup(html_macros.$html_html_tail$.getGlobalValue());
		} finally {
			cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
		}
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static SubLObject xml_complete_result_count_min(final SubLObject args) {
		return xml_complete_result_count(args);
	}

	public static SubLObject xml_complete_result_count_max(final SubLObject args) {
		return xml_complete_result_count(args);
	}

	public static SubLObject xml_complete_result_count(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result_string = NIL;
		SubLObject result_count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
		try {
			html_macros.$html_stream$.bind(NIL, thread);
			try {
				html_macros.$html_stream$.setDynamicValue(make_private_string_output_stream(), thread);
				xml_complete(args);
				result_string = get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
			} finally {
				final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					close(html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
				}
			}
		} finally {
			html_macros.$html_stream$.rebind(_prev_bind_0, thread);
		}
		result_count = string_utilities.count_matches($str183$_Term_, result_string, symbol_function(EQUAL), UNPROVIDED);
		return result_count;
	}

	public static SubLObject xml_complete_int_result_count_min(final SubLObject prefix, final SubLObject v_properties) {
		return xml_complete_int_result_count(prefix, v_properties);
	}

	public static SubLObject xml_complete_int_result_count(final SubLObject prefix, final SubLObject v_properties) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result_string = NIL;
		SubLObject result_count = ZERO_INTEGER;
		final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
		try {
			xml_vars.$xml_stream$.bind(NIL, thread);
			try {
				xml_vars.$xml_stream$.setDynamicValue(make_private_string_output_stream(), thread);
				xml_complete_int(prefix, v_properties);
				result_string = get_output_stream_string(xml_vars.$xml_stream$.getDynamicValue(thread));
			} finally {
				final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					close(xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
				}
			}
		} finally {
			xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
		}
		result_count = string_utilities.count_matches($str183$_Term_, result_string, symbol_function(EQUAL), UNPROVIDED);
		return result_count;
	}

	public static SubLObject declare_html_complete_file() {
		declareFunction(me, "html_complete_button", "HTML-COMPLETE-BUTTON", 1, 6, false);
		declareFunction(me, "html_complete_link", "HTML-COMPLETE-LINK", 1, 5, false);
		declareFunction(me, "html_cyclify_button", "HTML-CYCLIFY-BUTTON", 1, 2, false);
		declareFunction(me, "javascript_void_url", "JAVASCRIPT-VOID-URL", 0, 0, false);
		declareFunction(me, "html_complete_script", "HTML-COMPLETE-SCRIPT", 0, 0, false);
		declareFunction(me, "html_initial_focus_script", "HTML-INITIAL-FOCUS-SCRIPT", 0, 0, false);
		declareFunction(me, "html_opener_message_on_load", "HTML-OPENER-MESSAGE-ON-LOAD", 1, 0, false);
		declareFunction(me, "html_handle_complete_script", "HTML-HANDLE-COMPLETE-SCRIPT", 3, 0, false);
		declareFunction(me, "html_immediate_complete_extend_script", "HTML-IMMEDIATE-COMPLETE-EXTEND-SCRIPT", 1, 0, false);
		declareFunction(me, "html_immediate_complete_choose_script", "HTML-IMMEDIATE-COMPLETE-CHOOSE-SCRIPT", 2, 0, false);
		declareFunction(me, "cb_complete", "CB-COMPLETE", 1, 0, false);
		declareFunction(me, "cb_completions", "CB-COMPLETIONS", 3, 3, false);
		declareFunction(me, "cb_complete_choose", "CB-COMPLETE-CHOOSE", 7, 0, false);
		declareFunction(me, "completion_string", "COMPLETION-STRING", 1, 0, false);
		declareFunction(me, "cb_complete_one", "CB-COMPLETE-ONE", 6, 0, false);
		declareFunction(me, "cb_complete_none", "CB-COMPLETE-NONE", 2, 0, false);
		declareFunction(me, "cb_complete_title", "CB-COMPLETE-TITLE", 1, 0, false);
		declareFunction(me, "cb_complete_preamble", "CB-COMPLETE-PREAMBLE", 2, 0, false);
		declareFunction(me, "html_complete_insert_choice", "HTML-COMPLETE-INSERT-CHOICE", 2, 0, false);
		declareFunction(me, "html_print_js_autocomplete_setup_int", "HTML-PRINT-JS-AUTOCOMPLETE-SETUP-INT", 6, 0, false);
		declareFunction(me, "xml_term_search", "XML-TERM-SEARCH", 1, 0, false);
		declareFunction(me, "xml_complete", "XML-COMPLETE", 1, 0, false);
		declareFunction(me, "get_constraint_filters_from_html_args", "GET-CONSTRAINT-FILTERS-FROM-HTML-ARGS", 1, 0, false);
		declareFunction(me, "clear_get_isa_restrictions_from_sentence", "CLEAR-GET-ISA-RESTRICTIONS-FROM-SENTENCE", 0, 0, false);
		declareFunction(me, "remove_get_isa_restrictions_from_sentence", "REMOVE-GET-ISA-RESTRICTIONS-FROM-SENTENCE", 1, 1, false);
		declareFunction(me, "get_isa_restrictions_from_sentence_internal", "GET-ISA-RESTRICTIONS-FROM-SENTENCE-INTERNAL", 2, 0, false);
		declareFunction(me, "get_isa_restrictions_from_sentence", "GET-ISA-RESTRICTIONS-FROM-SENTENCE", 1, 1, false);
		declareFunction(me, "clear_get_genls_restrictions_from_sentence", "CLEAR-GET-GENLS-RESTRICTIONS-FROM-SENTENCE", 0, 0, false);
		declareFunction(me, "remove_get_genls_restrictions_from_sentence", "REMOVE-GET-GENLS-RESTRICTIONS-FROM-SENTENCE", 1, 1, false);
		declareFunction(me, "get_genls_restrictions_from_sentence_internal", "GET-GENLS-RESTRICTIONS-FROM-SENTENCE-INTERNAL", 2, 0, false);
		declareFunction(me, "get_genls_restrictions_from_sentence", "GET-GENLS-RESTRICTIONS-FROM-SENTENCE", 1, 1, false);
		declareFunction(me, "clear_get_arg_constraints_for_arg", "CLEAR-GET-ARG-CONSTRAINTS-FOR-ARG", 0, 0, false);
		declareFunction(me, "remove_get_arg_constraints_for_arg", "REMOVE-GET-ARG-CONSTRAINTS-FOR-ARG", 3, 0, false);
		declareFunction(me, "get_arg_constraints_for_arg_internal", "GET-ARG-CONSTRAINTS-FOR-ARG-INTERNAL", 3, 0, false);
		declareFunction(me, "get_arg_constraints_for_arg", "GET-ARG-CONSTRAINTS-FOR-ARG", 3, 0, false);
		declareFunction(me, "clear_get_arg_constraints_for_var", "CLEAR-GET-ARG-CONSTRAINTS-FOR-VAR", 0, 0, false);
		declareFunction(me, "remove_get_arg_constraints_for_var", "REMOVE-GET-ARG-CONSTRAINTS-FOR-VAR", 3, 0, false);
		declareFunction(me, "get_arg_constraints_for_var_internal", "GET-ARG-CONSTRAINTS-FOR-VAR-INTERNAL", 3, 0, false);
		declareFunction(me, "get_arg_constraints_for_var", "GET-ARG-CONSTRAINTS-FOR-VAR", 3, 0, false);
		declareFunction(me, "get_genls_filter_from_arg_constraints", "GET-GENLS-FILTER-FROM-ARG-CONSTRAINTS", 1, 0, false);
		declareFunction(me, "get_isa_filter_from_arg_constraints", "GET-ISA-FILTER-FROM-ARG-CONSTRAINTS", 1, 0, false);
		declareFunction(me, "get_constraining_sentence_from_html_args", "GET-CONSTRAINING-SENTENCE-FROM-HTML-ARGS", 1, 0, false);
		declareFunction(me, "clean_up_non_constant_symbols", "CLEAN-UP-NON-CONSTANT-SYMBOLS", 1, 0, false);
		declareFunction(me, "non_cycl_symbolP", "NON-CYCL-SYMBOL?", 1, 0, false);
		declareFunction(me, "convert_to_keyword", "CONVERT-TO-KEYWORD", 1, 0, false);
		declareFunction(me, "completion_properties_p", "COMPLETION-PROPERTIES-P", 1, 0, false);
		declareFunction(me, "native_complete_int", "NATIVE-COMPLETE-INT", 1, 1, false);
		declareFunction(me, "xml_complete_int", "XML-COMPLETE-INT", 1, 1, false);
		declareFunction(me, "get_xml_completion_data", "GET-XML-COMPLETION-DATA", 1, 1, false);
		declareFunction(me, "add_completion_to_dict", "ADD-COMPLETION-TO-DICT", 4, 0, false);
		declareFunction(me, "completion_denots_of_string_internal", "COMPLETION-DENOTS-OF-STRING-INTERNAL", 1, 2, false);
		declareFunction(me, "completion_denots_of_string", "COMPLETION-DENOTS-OF-STRING", 1, 2, false);
		declareFunction(me, "completion_lexicon_internal", "COMPLETION-LEXICON-INTERNAL", 1, 0, false);
		declareFunction(me, "completion_lexicon", "COMPLETION-LEXICON", 1, 0, false);
		declareFunction(me, "display_string_for_completion", "DISPLAY-STRING-FOR-COMPLETION", 3, 0, false);
		declareFunction(me, "select_display_string_for_completion_term", "SELECT-DISPLAY-STRING-FOR-COMPLETION-TERM", 2, 0, false);
		declareFunction(me, "preferred_paraphrase_for_completion_term", "PREFERRED-PARAPHRASE-FOR-COMPLETION-TERM", 1, 0, false);
		declareFunction(me, "stream_xml_term_result_set", "STREAM-XML-TERM-RESULT-SET", 1, 3, false);
		declareFunction(me, "term_result_set_as_list", "TERM-RESULT-SET-AS-LIST", 1, 3, false);
		declareFunction(me, "sort_preferred_completions_to_front", "SORT-PREFERRED-COMPLETIONS-TO-FRONT", 2, 0, false);
		declareFunction(me, "clear_term_passes_arg_restrictions", "CLEAR-TERM-PASSES-ARG-RESTRICTIONS", 0, 0, false);
		declareFunction(me, "remove_term_passes_arg_restrictions", "REMOVE-TERM-PASSES-ARG-RESTRICTIONS", 4, 0, false);
		declareFunction(me, "term_passes_arg_restrictions_internal", "TERM-PASSES-ARG-RESTRICTIONS-INTERNAL", 4, 0, false);
		declareFunction(me, "term_passes_arg_restrictions", "TERM-PASSES-ARG-RESTRICTIONS", 4, 0, false);
		declareFunction(me, "term_passes_arg_filters", "TERM-PASSES-ARG-FILTERS", 4, 0, false);
		declareFunction(me, "term_passes_genls_filter", "TERM-PASSES-GENLS-FILTER", 3, 0, false);
		declareFunction(me, "get_constraints_from_filter", "GET-CONSTRAINTS-FROM-FILTER", 1, 0, false);
		declareFunction(me, "clear_autocomplete_isa_cache", "CLEAR-AUTOCOMPLETE-ISA-CACHE", 0, 0, false);
		declareFunction(me, "clear_autocomplete_genls_cache", "CLEAR-AUTOCOMPLETE-GENLS-CACHE", 0, 0, false);
		declareFunction(me, "instance_of_precachedP", "INSTANCE-OF-PRECACHED?", 3, 0, false);
		declareFunction(me, "spec_of_precachedP", "SPEC-OF-PRECACHED?", 3, 0, false);
		declareFunction(me, "autocomplete_instance_ofP", "AUTOCOMPLETE-INSTANCE-OF?", 3, 0, false);
		declareFunction(me, "autocomplete_spec_ofP", "AUTOCOMPLETE-SPEC-OF?", 3, 0, false);
		declareFunction(me, "precache_isa_constraint", "PRECACHE-ISA-CONSTRAINT", 2, 0, false);
		declareFunction(me, "precache_genls_constraint", "PRECACHE-GENLS-CONSTRAINT", 2, 0, false);
		declareFunction(me, "precache_isa_constraint_guts", "PRECACHE-ISA-CONSTRAINT-GUTS", 2, 0, false);
		declareFunction(me, "precache_genls_constraint_guts", "PRECACHE-GENLS-CONSTRAINT-GUTS", 2, 0, false);
		declareFunction(me, "genlsPX", "GENLS?+", 2, 2, false);
		declareFunction(me, "num_indexG", "NUM-INDEX>", 2, 0, false);
		declareFunction(me, "html_handle_cyclify_script", "HTML-HANDLE-CYCLIFY-SCRIPT", 2, 0, false);
		declareFunction(me, "html_immediate_perform_cyclify_script", "HTML-IMMEDIATE-PERFORM-CYCLIFY-SCRIPT", 1, 0, false);
		declareFunction(me, "cb_cyclify", "CB-CYCLIFY", 1, 0, false);
		declareFunction(me, "xml_complete_result_count_min", "XML-COMPLETE-RESULT-COUNT-MIN", 1, 0, false);
		declareFunction(me, "xml_complete_result_count_max", "XML-COMPLETE-RESULT-COUNT-MAX", 1, 0, false);
		declareFunction(me, "xml_complete_result_count", "XML-COMPLETE-RESULT-COUNT", 1, 0, false);
		declareFunction(me, "xml_complete_int_result_count_min", "XML-COMPLETE-INT-RESULT-COUNT-MIN", 2, 0, false);
		declareFunction(me, "xml_complete_int_result_count", "XML-COMPLETE-INT-RESULT-COUNT", 2, 0, false);
		return NIL;
	}

	public static SubLObject init_html_complete_file() {
		defparameter("*CB-ENABLE-CONSTANT-COMPLETION*", T);
		defparameter("*CB-POP-UP-CONSTANT-COMPLETION*", NIL);
		defparameter("*CB-CONSTANT-COMPLETION-TARGET*", $$$completions);
		deflexical("*HTML-COMPLETE-BUTTON-SCRIPT*", $str1$onClick__constant_complete___A___);
		deflexical("*HTML-CYCLIFY-BUTTON-SCRIPT*", $str14$onClick__cyclify___A____);
		deflexical("*HTML-COMPLETE-SCRIPT-PARAMETERS*", $str17$_var_cgi_program_____A___var_comp);
		deflexical("*HTML-INTIAL-FOCUS-SCRIPT*", $str19$_if__window_focus__window_focus__);
		deflexical("*HTML-OPENER-MESSAGE-ON-LOAD-SCRIPT*", $str20$_if__window_opener__window_opener);
		deflexical("*HTML-HANDLE-COMPLETE-SCRIPT-PARAMETERS*", $str21$_var_form_number____A__var_elemen);
		deflexical("*HTML-HANDLE-COMPLETE-SCRIPT*", $str22$_var_old_length____1___function_c);
		defparameter("*HTML-IMMEDIATE-COMPLETE-EXTEND-SCRIPT*", $str23$_complete_extend___A____);
		defparameter("*HTML-IMMEDIATE-COMPLETE-CHOOSE-SCRIPT*", $str24$_complete_choose___A____A___);
		deflexical("*HTML-COMPLETE-INSERT-CHOICE-SCRIPT*", $str69$onClick__complete_choose___A____A);
		defparameter("*JS-AUTOCOMPLETE-SETUP*", $str71$var_constantCompleteDataSource___);
		defparameter("*AUTOCOMPLETE-DEFAULT-LIMIT*", $int$50);
		deflexical("*GET-ISA-RESTRICTIONS-FROM-SENTENCE-CACHING-STATE*", NIL);
		deflexical("*GET-GENLS-RESTRICTIONS-FROM-SENTENCE-CACHING-STATE*", NIL);
		deflexical("*GET-ARG-CONSTRAINTS-FOR-ARG-CACHING-STATE*", NIL);
		deflexical("*GET-ARG-CONSTRAINTS-FOR-VAR-CACHING-STATE*", NIL);
		defparameter("*COMPLETION-PROPERTIES*", $list131);
		deflexical("*TERM-PASSES-ARG-RESTRICTIONS-CACHING-STATE*", NIL);
		deflexical("*AUTOCOMPLETE-ISA-CACHE-LOCK*", make_lock($$$Autocomplete_isa_cache_lock));
		deflexical("*AUTOCOMPLETE-GENLS-CACHE-LOCK*", make_lock($$$Autocomplete_genls_cache_lock));
		defparameter("*AUTOCOMPLETE-ISA-CACHE*", cache.new_cache($int$128, EQUAL));
		defparameter("*AUTOCOMPLETE-GENLS-CACHE*", cache.new_cache($int$128, EQUAL));
		deflexical("*HTML-HANDLE-CYCLIFY-SCRIPT-PARAMETERS*", $str173$_var_form_number____A__var_elemen);
		deflexical("*HTML-HANDLE-CYCLIFY-SCRIPT*", $str174$_function_cyclify_error_message__);
		deflexical("*HTML-IMMEDIATE-PERFORM-CYCLIFY-SCRIPT-PREFIX*", $str175$_handle_cyclify_unescape__);
		deflexical("*HTML-IMMEDIATE-PERFORM-CYCLIFY-SCRIPT-POSTFIX*", $str176$_____);
		return NIL;
	}

	public static SubLObject setup_html_complete_file() {
		html_macros.note_cgi_handler_function(CB_COMPLETE, $HTML_HANDLER);
		register_macro_helper(HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT, HTML_PRINT_JS_AUTOCOMPLETE_SETUP);
		register_external_symbol(XML_TERM_SEARCH);
		html_macros.note_cgi_handler_function(XML_TERM_SEARCH, $XML_HANDLER);
		register_external_symbol(XML_COMPLETE);
		html_macros.note_cgi_handler_function(XML_COMPLETE, $XML_HANDLER);
		memoization_state.note_globally_cached_function(GET_ISA_RESTRICTIONS_FROM_SENTENCE);
		memoization_state.note_globally_cached_function(GET_GENLS_RESTRICTIONS_FROM_SENTENCE);
		memoization_state.note_globally_cached_function(GET_ARG_CONSTRAINTS_FOR_ARG);
		memoization_state.note_globally_cached_function(GET_ARG_CONSTRAINTS_FOR_VAR);
		memoization_state.note_memoized_function(COMPLETION_DENOTS_OF_STRING);
		memoization_state.note_memoized_function(COMPLETION_LEXICON);
		memoization_state.note_globally_cached_function(TERM_PASSES_ARG_RESTRICTIONS);
		memoization_state.register_genls_dependent_cache_clear_callback(CLEAR_AUTOCOMPLETE_GENLS_CACHE);
		memoization_state.register_isa_dependent_cache_clear_callback(CLEAR_AUTOCOMPLETE_ISA_CACHE);
		html_macros.note_cgi_handler_function(CB_CYCLIFY, $HTML_HANDLER);
		define_test_case_table_int(XML_COMPLETE_RESULT_COUNT_MIN, list(new SubLObject[] { $TEST, symbol_function($sym186$_), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list192);
		define_test_case_table_int(XML_COMPLETE_RESULT_COUNT_MAX, list(new SubLObject[] { $TEST, symbol_function($sym194$__), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list195);
		define_test_case_table_int(XML_COMPLETE_INT_RESULT_COUNT_MIN, list(new SubLObject[] { $TEST, symbol_function($sym186$_), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list197);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_html_complete_file();
	}

	@Override
	public void initializeVariables() {
		init_html_complete_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_html_complete_file();
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	public static void html_autocomplete_css() {

	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	public static void html_autocomplete_scripts() {
		// TODO Auto-generated method stub

	}
}

/**
 * Total time: 849 ms synthetic
 */
