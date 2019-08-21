package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;

public final class cyc_file_dependencies extends SubLTranslatedFile {
	public static final SubLFile me = new cyc_file_dependencies();

	public static final String myName = "com.cyc.cycjava.cycl.cyc_file_dependencies";

	public static final String myFingerPrint = "c94368c3693b993a2d27cc91c79752e6b2254374653110a2fc6fc8cd82fb7237";

	// defparameter
	public static final SubLSymbol $html_emitted_file_dependencies$ = makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*");

	// deflexical
	// The default directory on the web server to look for the java files.
	private static final SubLSymbol $java_default_directory$ = makeSymbol("*JAVA-DEFAULT-DIRECTORY*");

	// deflexical
	// The default directory on the web server to look for the icon image files.
	private static final SubLSymbol $html_icon_default_directory$ = makeSymbol("*HTML-ICON-DEFAULT-DIRECTORY*");

	// deflexical
	/**
	 * The default icon filename when an html-icon is not found. May or may not
	 * actually exist on the web server.
	 */
	private static final SubLSymbol $html_missing_icon$ = makeSymbol("*HTML-MISSING-ICON*");

	// deflexical
	// The default directory on the web server to look for the help files.
	private static final SubLSymbol $cb_help_default_directory$ = makeSymbol("*CB-HELP-DEFAULT-DIRECTORY*");

	// deflexical
	// The default directory on the web server to look for the icon image files.
	private static final SubLSymbol $cb_icon_default_directory$ = makeSymbol("*CB-ICON-DEFAULT-DIRECTORY*");

	// deflexical
	/**
	 * The default icon filename when a cb-icon is not found. May or may not
	 * actually exist on the web server.
	 */
	private static final SubLSymbol $cb_missing_icon$ = makeSymbol("*CB-MISSING-ICON*");

	public static final SubLSymbol $external_file_definitions$ = makeSymbol("*EXTERNAL-FILE-DEFINITIONS*");

	private static final SubLList $list4 = list(list(makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*"), list(makeSymbol("LIST"))));

	private static final SubLList $list5 = list(list(makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*"), list(makeSymbol("FIF"), list(EQ, makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*"), makeKeyword("UNINITIALIZED")), list(makeSymbol("LIST")), makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*"))));

	public static final SubLList $list6 = list(makeSymbol("FILE-KEYWORD"), makeSymbol("DEPENDENCIES"));

	private static final SubLSymbol DEF_EXTERNAL_FILE = makeSymbol("DEF-EXTERNAL-FILE");

	private static final SubLList $list10 = list(makeSymbol("FILE-KEYWORD"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("PATH"), makeString("js")), makeSymbol("DEPENDENCIES"));

	private static final SubLList $list11 = list(makeKeyword("PATH"), makeKeyword("DEPENDENCIES"));

	private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

	private static final SubLString $$$js = makeString("js");

	private static final SubLSymbol EXT_DEP_ENDS_WITH = makeSymbol("EXT-DEP-ENDS-WITH");

	public static final SubLList $list18 = list(makeString(".js"));

	private static final SubLString $str20$Defining_javascript_file__S_witho = makeString("Defining javascript file ~S without '.js' as the suffix.");

	private static final SubLList $list22 = list(makeSymbol("FILE-KEYWORD"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("PATH"), makeString("css")), makeSymbol("DEPENDENCIES"));

	private static final SubLString $$$css = makeString("css");

	private static final SubLList $list24 = list(makeString(".css"));

	private static final SubLString $str25$Defining_CSS_file__S_without___cs = makeString("Defining CSS file ~S without '.css' as the suffix.");

	private static final SubLList $list27 = list(makeSymbol("FILE-KEYWORD"), makeSymbol("PATH"), makeSymbol("FILENAME"), makeSymbol("FILE-TYPE"), makeSymbol("&KEY"), makeSymbol("DEPENDENCIES"));

	private static final SubLList $list28 = list(makeKeyword("DEPENDENCIES"));

	private static final SubLSymbol CHECK_EXTERNAL_FILE_DEFINITION = makeSymbol("CHECK-EXTERNAL-FILE-DEFINITION");

	private static final SubLString $str34$Unable_to_define__S_because_of_un = makeString("Unable to define ~S because of undefined dependencies ~S");

	private static final SubLString $str35$Redefinition_of_external_file__S_ = makeString("Redefinition of external file ~S from ~S to ~S (in ~S) of type ~S with dependencies ~S");

	private static final SubLString $str36$Emitting__S_with_no_html_file_dep = makeString("Emitting ~S with no html-file-dependency-space.");

	private static final SubLString $str37$text_javascript = makeString("text/javascript");

	private static final SubLString $$$stylesheet = makeString("stylesheet");

	private static final SubLString $str39$text_css = makeString("text/css");

	private static final SubLString $str40$Unable_to_emit_file__S___S__of_ty = makeString("Unable to emit file ~S (~S) of type ~S");

	private static final SubLSymbol UNDEFINED_EXTERNAL_DEPENDENCIES = makeSymbol("UNDEFINED-EXTERNAL-DEPENDENCIES");

	private static final SubLSymbol $sym42$REDUNDANT_DEPENDENCY_ = makeSymbol("REDUNDANT-DEPENDENCY?");

	private static final SubLList $list43 = list(makeSymbol("DEF-CSS-2"), makeSymbol("DEF-JAVASCRIPT-2"));

	private static final SubLString $str44$java_ = makeString("java/");

	private static final SubLString $str45$_ = makeString("/");

	private static final SubLString $str46$_lib_ = makeString("/lib/");

	private static final SubLString $$$jar = makeString("jar");

	private static final SubLString $str48$lib_ = makeString("lib/");

	public static final SubLSymbol $html_icon_definitions$ = makeSymbol("*HTML-ICON-DEFINITIONS*");
	public static final SubLSymbol $javascript_definitions$ = makeSymbol("*JAVASCRIPT-DEFINITIONS*");

	private static final SubLList $list51 = list(makeSymbol("ICON-KEYWORD"), makeSymbol("FILENAME"), makeSymbol("&OPTIONAL"), makeSymbol("ALT-STRING"));

	private static final SubLString $str52$ = makeString("");

	private static final SubLString $str53$missing_gif = makeString("missing.gif");

	private static final SubLList $list54 = list(new SubLObject[] { makeSymbol("ICON-KEYWORD"), makeSymbol("&KEY"), makeSymbol("ID"), makeSymbol("NAME"), makeSymbol("ISMAP"), makeSymbol("HEIGHT"), makeSymbol("WIDTH"), makeSymbol("ALT-OVERRIDE"), makeSymbol("ALIGN-OVERRIDE"), makeSymbol("BORDER-OVERRIDE") });

	public static final SubLList $list55 = list(makeKeyword("ID"), makeKeyword("NAME"), makeKeyword("ISMAP"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"), makeKeyword("ALT-OVERRIDE"), makeKeyword("ALIGN-OVERRIDE"), makeKeyword("BORDER-OVERRIDE"));

	private static final SubLSymbol $sym64$IMAGE_SRC = makeUninternedSymbol("IMAGE-SRC");

	private static final SubLSymbol $sym65$ALIGN = makeUninternedSymbol("ALIGN");

	private static final SubLSymbol $sym66$ALT = makeUninternedSymbol("ALT");

	private static final SubLSymbol $sym67$BORDER = makeUninternedSymbol("BORDER");

	private static final SubLSymbol $html_image_directory$ = makeSymbol("*HTML-IMAGE-DIRECTORY*");

	private static final SubLSymbol HTML_ICON_SRC = makeSymbol("HTML-ICON-SRC");

	private static final SubLList $list72 = list(makeKeyword("CENTER"));

	private static final SubLSymbol GET_HTML_ICON_ALT_STRING = makeSymbol("GET-HTML-ICON-ALT-STRING");

	private static final SubLList $list74 = list(ZERO_INTEGER);

	private static final SubLSymbol HTML_FANCY_IMAGE = makeSymbol("HTML-FANCY-IMAGE");

	public static final SubLSymbol $cb_help_definitions$ = makeSymbol("*CB-HELP-DEFINITIONS*");

	private static final SubLList $list80 = list(makeSymbol("HELP-KEYWORD"), makeSymbol("FILENAME"), makeSymbol("&OPTIONAL"), makeSymbol("DESC-STRING"));

	private static final SubLString $str81$help_ = makeString("help/");

	private static final SubLString $str82$Help_file_not_found_for__A = makeString("Help file not found for ~A");

	public static final SubLSymbol $cb_icon_definitions$ = makeSymbol("*CB-ICON-DEFINITIONS*");

	private static final SubLString $str84$cb_ = makeString("cb/");

	private static final SubLList $list85 = list(new SubLObject[] { makeSymbol("ICON-KEYWORD"), makeSymbol("&KEY"), makeSymbol("NAME"), makeSymbol("ISMAP"), makeSymbol("HEIGHT"), makeSymbol("WIDTH"), makeSymbol("ALT-OVERRIDE"), makeSymbol("ALIGN-OVERRIDE"), makeSymbol("BORDER-OVERRIDE") });

	private static final SubLList $list86 = list(makeKeyword("NAME"), makeKeyword("ISMAP"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"), makeKeyword("ALT-OVERRIDE"), makeKeyword("ALIGN-OVERRIDE"), makeKeyword("BORDER-OVERRIDE"));

	private static final SubLSymbol $sym87$IMAGE_SRC = makeUninternedSymbol("IMAGE-SRC");

	private static final SubLSymbol $sym88$ALIGN = makeUninternedSymbol("ALIGN");

	private static final SubLSymbol $sym89$ALT = makeUninternedSymbol("ALT");

	private static final SubLSymbol $sym90$BORDER = makeUninternedSymbol("BORDER");

	private static final SubLSymbol CB_ICON_FILE_PATH = makeSymbol("CB-ICON-FILE-PATH");

	private static final SubLList $list92 = list(makeKeyword("TOP"));

	private static final SubLSymbol CB_GET_ICON_ALT_STRING = makeSymbol("CB-GET-ICON-ALT-STRING");

	private static final SubLSymbol COMPILE_CB_BROWSER_DEPENDENCIES = makeSymbol("COMPILE-CB-BROWSER-DEPENDENCIES");

	private static final SubLList $list95 = list(makeSymbol("KEYWORD-PRODUCER"), makeSymbol("KEYWORD-MAPPING-FN"));

	private static final SubLSymbol JAVASCRIPT_KEYWORDS = makeSymbol("JAVASCRIPT-KEYWORDS");

	private static final SubLSymbol JAVASCRIPT_FILE_PATH = makeSymbol("JAVASCRIPT-FILE-PATH");

	private static final SubLSymbol HTML_ICON_KEYWORDS = makeSymbol("HTML-ICON-KEYWORDS");

	private static final SubLSymbol HTML_ICON_FILE_PATH = makeSymbol("HTML-ICON-FILE-PATH");

	private static final SubLSymbol CB_HELP_KEYWORDS = makeSymbol("CB-HELP-KEYWORDS");

	private static final SubLSymbol CB_HELP_FILE_PATH = makeSymbol("CB-HELP-FILE-PATH");

	private static final SubLSymbol CB_ICON_KEYWORDS = makeSymbol("CB-ICON-KEYWORDS");

	private static final SubLSymbol CSS_KEYWORDS = makeSymbol("CSS-KEYWORDS");

	private static final SubLSymbol CSS_FILE_PATH = makeSymbol("CSS-FILE-PATH");

	private static final SubLSymbol CB_BROWSER_DEPENDENCY_MANIFEST = makeSymbol("CB-BROWSER-DEPENDENCY-MANIFEST");

	public static SubLObject with_new_html_file_dependency_space(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(CLET, $list4, append(body, NIL));
	}

	public static SubLObject with_possibly_new_html_file_dependency_space(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(CLET, $list5, append(body, NIL));
	}

	public static SubLObject web_bundle(final SubLObject keyword) {
		return emit_external_file_with_dependencies(keyword);
	}

	public static SubLObject def_web_bundle(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject file_keyword = NIL;
		SubLObject dependencies = NIL;
		destructuring_bind_must_consp(current, datum, $list6);
		file_keyword = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list6);
		dependencies = current.first();
		current = current.rest();
		if (NIL == current) {
			return list(DEF_EXTERNAL_FILE, file_keyword, NIL, NIL, $BUNDLE, $DEPENDENCIES, dependencies);
		}
		cdestructuring_bind_error(datum, $list6);
		return NIL;
	}

	public static SubLObject javascript(final SubLObject keyword) {
		return emit_external_file_with_dependencies(keyword);
	}

	public static SubLObject def_javascript(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject file_keyword = NIL;
		SubLObject filename = NIL;
		destructuring_bind_must_consp(current, datum, $list10);
		file_keyword = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list10);
		filename = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$1 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list10);
			current_$1 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list10);
			if (NIL == member(current_$1, $list11, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$1 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list10);
		}
		final SubLObject path_tail = property_list_member($PATH, current);
		final SubLObject path = (NIL != path_tail) ? cadr(path_tail) : $$$js;
		final SubLObject dependencies_tail = property_list_member($DEPENDENCIES, current);
		final SubLObject dependencies = (NIL != dependencies_tail) ? cadr(dependencies_tail) : NIL;
		return list(PROGN, list(PUNLESS, listS(EXT_DEP_ENDS_WITH, filename, $list18), list(WARN, $str20$Defining_javascript_file__S_witho, filename)), list(DEF_EXTERNAL_FILE, file_keyword, path, filename, $JS, $DEPENDENCIES, dependencies));
	}

	public static SubLObject javascript_keywords() {
		return external_dependencies_of_type($JS);
	}

	public static SubLObject get_javascript_filename(final SubLObject keyword) {
		return get_external_dependency_filename(keyword);
	}

	public static SubLObject javascript_file_path(final SubLObject keyword) {
		return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), get_external_dependency_data(keyword));
	}

	public static SubLObject css(final SubLObject keyword) {
		return emit_external_file_with_dependencies(keyword);
	}

	public static SubLObject def_css(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject file_keyword = NIL;
		SubLObject filename = NIL;
		destructuring_bind_must_consp(current, datum, $list22);
		file_keyword = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list22);
		filename = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$2 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list22);
			current_$2 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list22);
			if (NIL == member(current_$2, $list11, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$2 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list22);
		}
		final SubLObject path_tail = property_list_member($PATH, current);
		final SubLObject path = (NIL != path_tail) ? cadr(path_tail) : $$$css;
		final SubLObject dependencies_tail = property_list_member($DEPENDENCIES, current);
		final SubLObject dependencies = (NIL != dependencies_tail) ? cadr(dependencies_tail) : NIL;
		return list(PROGN, list(PUNLESS, listS(EXT_DEP_ENDS_WITH, filename, $list24), list(WARN, $str25$Defining_CSS_file__S_without___cs, filename)), list(DEF_EXTERNAL_FILE, file_keyword, path, filename, $CSS, $DEPENDENCIES, dependencies));
	}

	public static SubLObject css_keywords() {
		return external_dependencies_of_type($CSS);
	}

	public static SubLObject get_css_filename(final SubLObject keyword) {
		return get_external_dependency_filename(keyword);
	}

	public static SubLObject css_file_path(final SubLObject keyword) {
		return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), get_external_dependency_data(keyword));
	}

	public static SubLObject def_external_file(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject file_keyword = NIL;
		SubLObject path = NIL;
		SubLObject filename = NIL;
		SubLObject file_type = NIL;
		destructuring_bind_must_consp(current, datum, $list27);
		file_keyword = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list27);
		path = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list27);
		filename = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list27);
		file_type = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$3 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list27);
			current_$3 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list27);
			if (NIL == member(current_$3, $list28, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$3 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list27);
		}
		final SubLObject dependencies_tail = property_list_member($DEPENDENCIES, current);
		final SubLObject dependencies = (NIL != dependencies_tail) ? cadr(dependencies_tail) : NIL;
		return list(PROGN, list(CHECK_EXTERNAL_FILE_DEFINITION, file_keyword, path, filename, file_type, dependencies), list(SETHASH, file_keyword, $external_file_definitions$, list(new SubLObject[] { LIST, $PATH, path, $FILENAME, filename, $DEPENDENCIES, dependencies, $TYPE, file_type })));
	}

	public static SubLObject check_external_file_definition(final SubLObject file_keyword, final SubLObject path, final SubLObject filename, final SubLObject file_type, final SubLObject dependencies) {
		if (NIL != undefined_external_dependencies(dependencies)) {
			Errors.error($str34$Unable_to_define__S_because_of_un, file_keyword, undefined_external_dependencies(dependencies));
		} else if ((NIL != gethash(file_keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED)) && (NIL == redundant_dependencyP(path, filename, dependencies, gethash(file_keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED)))) {
			Errors.warn($str35$Redefinition_of_external_file__S_, new SubLObject[] { file_keyword, gethash(file_keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED), filename, path, file_type, dependencies });
		}

		return NIL;
	}

	public static SubLObject emit_external_file_with_dependencies(final SubLObject keyword) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (($html_emitted_file_dependencies$.getDynamicValue(thread) != $UNINITIALIZED) && (NIL != subl_promotions.memberP(keyword, $html_emitted_file_dependencies$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED))) {
			return NIL;
		}
		if ($html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) {
			Errors.warn($str36$Emitting__S_with_no_html_file_dep, keyword);
		}
		thread.resetMultipleValues();
		final SubLObject file_path = get_external_dependency_data(keyword);
		final SubLObject file_type = thread.secondMultipleValue();
		final SubLObject dependencies = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		SubLObject cdolist_list_var = dependencies;
		SubLObject d = NIL;
		d = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			emit_external_file_with_dependencies(d);
			cdolist_list_var = cdolist_list_var.rest();
			d = cdolist_list_var.first();
		}
		final SubLObject _prev_bind_0 = html_macros.$suppress_html_source_readability_terpriP$.currentBinding(thread);
		try {
			html_macros.$suppress_html_source_readability_terpriP$.bind(T, thread);
			final SubLObject pcase_var = file_type;
			if (pcase_var.eql($JS)) {
				html_source_readability_terpri(UNPROVIDED);
				html_markup(html_macros.$html_script_head$.getGlobalValue());
				html_markup(html_macros.$html_script_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(file_path);
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_script_type$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($str37$text_javascript);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
				}
				html_markup(html_macros.$html_script_tail$.getGlobalValue());
			} else if (pcase_var.eql($CSS)) {
				html_source_readability_terpri(UNPROVIDED);
				html_markup(html_macros.$html_link_head$.getGlobalValue());
				html_markup(html_macros.$html_link_rel$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($$$stylesheet);
				html_char(CHAR_quotation, UNPROVIDED);
				if (NIL != file_path) {
					html_markup(html_macros.$html_link_href$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(file_path);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_markup(html_macros.$html_link_type$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($str39$text_css);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
			} else if (!pcase_var.eql($BUNDLE)) {
				Errors.error($str40$Unable_to_emit_file__S___S__of_ty, keyword, file_path, file_type);
			}

		} finally {
			html_macros.$suppress_html_source_readability_terpriP$.rebind(_prev_bind_0, thread);
		}
		if ($html_emitted_file_dependencies$.getDynamicValue(thread) != $UNINITIALIZED) {
			$html_emitted_file_dependencies$.setDynamicValue(cons(keyword, $html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
		}
		return NIL;
	}

	public static SubLObject external_dependencies_of_type(final SubLObject type) {
		SubLObject keywords = NIL;
		SubLObject key = NIL;
		SubLObject val = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator($external_file_definitions$.getGlobalValue());
		try {
			while (iteratorHasNext(cdohash_iterator)) {
				final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
				key = getEntryKey(cdohash_entry);
				val = getEntryValue(cdohash_entry);
				if (getf(val, $TYPE, UNPROVIDED).eql(type)) {
					keywords = cons(key, keywords);
				}
			}
		} finally {
			releaseEntrySetIterator(cdohash_iterator);
		}
		return keywords;
	}

	public static SubLObject get_external_dependency_filename(final SubLObject keyword) {
		return getf(gethash(keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED), $FILENAME, UNPROVIDED);
	}

	public static SubLObject undefined_external_dependencies(final SubLObject dependency_list) {
		SubLObject undefined = NIL;
		SubLObject cdolist_list_var = dependency_list;
		SubLObject dependency_keyword = NIL;
		dependency_keyword = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL == external_dependency_definedP(dependency_keyword)) {
				undefined = cons(dependency_keyword, undefined);
			}
			cdolist_list_var = cdolist_list_var.rest();
			dependency_keyword = cdolist_list_var.first();
		}
		return undefined;
	}

	public static SubLObject external_dependency_definedP(final SubLObject keyword) {
		return gethash(keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED);
	}

	public static SubLObject redundant_dependencyP(final SubLObject path, final SubLObject filename, final SubLObject dependencies, final SubLObject existing_definition) {
		return makeBoolean((getf(existing_definition, $FILENAME, UNPROVIDED).equal(filename) && getf(existing_definition, $PATH, UNPROVIDED).equal(path)) && getf(existing_definition, $DEPENDENCIES, UNPROVIDED).equal(dependencies));
	}

	public static SubLObject get_external_dependency_data(final SubLObject keyword) {
		final SubLObject file_def = gethash(keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED);
		final SubLObject path = getf(file_def, $PATH, UNPROVIDED);
		final SubLObject filename = getf(file_def, $FILENAME, UNPROVIDED);
		final SubLObject type = getf(file_def, $TYPE, UNPROVIDED);
		final SubLObject dependencies = getf(file_def, $DEPENDENCIES, UNPROVIDED);
		return values(doc_filepath(path, filename), type, dependencies);
	}

	public static SubLObject doc_filepath(final SubLObject relative_path, final SubLObject filename) {
		if ((!relative_path.isString()) || (!filename.isString())) {
			return NIL;
		}
		return file_utilities.relative_filename(cconcatenate(file_utilities.possibly_append_path_separator_char(system_parameters.cyc_documentation_url()), file_utilities.possibly_append_path_separator_char(relative_path)), filename, UNPROVIDED);
	}

	public static SubLObject ext_dep_ends_with(final SubLObject string, final SubLObject suffix) {
		final SubLObject str_length = length(string);
		final SubLObject suff_length = length(suffix);
		return makeBoolean(str_length.numGE(suff_length) && subseq(string, subtract(str_length, suff_length), UNPROVIDED).equal(suffix));
	}

	public static SubLObject java_applet_lib_file_path(final SubLObject java_applet_name) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return cconcatenate(system_parameters.$http_htdocs_directory$.getDynamicValue(thread), new SubLObject[] { $str45$_, $java_default_directory$.getGlobalValue(), java_applet_name, $str46$_lib_ });
	}

	public static SubLObject java_applet_archive_string(final SubLObject java_applet_name) {
		final SubLObject jar_directory = java_applet_lib_file_path(java_applet_name);
		final SubLObject filenames = Filesys.directory(jar_directory, UNPROVIDED);
		SubLObject lib_filenames = NIL;
		SubLObject cdolist_list_var = filenames;
		SubLObject filename = NIL;
		filename = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != string_utilities.ends_with(filename, $$$jar, UNPROVIDED)) {
				lib_filenames = cons(cconcatenate($str48$lib_, filename), lib_filenames);
			}
			cdolist_list_var = cdolist_list_var.rest();
			filename = cdolist_list_var.first();
		}
		return string_utilities.bunge(lib_filenames, CHAR_comma);
	}

	public static SubLObject html_icon_keywords() {
		return hash_table_utilities.hash_table_keys($html_icon_definitions$.getGlobalValue());
	}

	public static SubLObject def_html_icon(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject icon_keyword = NIL;
		SubLObject filename = NIL;
		destructuring_bind_must_consp(current, datum, $list51);
		icon_keyword = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list51);
		filename = current.first();
		current = current.rest();
		final SubLObject alt_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list51);
		current = current.rest();
		if (NIL == current) {
			return list(SETHASH, icon_keyword, $html_icon_definitions$, list(LIST, filename, alt_string));
		}
		cdestructuring_bind_error(datum, $list51);
		return NIL;
	}

	public static SubLObject get_html_icon_filename(final SubLObject icon_keyword) {
		return gethash(icon_keyword, $html_icon_definitions$.getGlobalValue(), UNPROVIDED).first();
	}

	public static SubLObject get_html_icon_alt_string(final SubLObject icon_keyword) {
		return second(gethash(icon_keyword, $html_icon_definitions$.getGlobalValue(), UNPROVIDED));
	}

	public static SubLObject html_icon_existsP(final SubLObject icon_keyword) {
		return string_utilities.non_empty_stringP(get_html_icon_filename(icon_keyword));
	}

	public static SubLObject html_missing_icon() {
		return $html_missing_icon$.getGlobalValue();
	}

	public static SubLObject html_icon_file_path(final SubLObject icon_keyword) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject icon_filename = get_html_icon_filename(icon_keyword);
		return cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), new SubLObject[] { $html_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : html_missing_icon() });
	}

	public static SubLObject html_icon_src(final SubLObject icon_keyword) {
		final SubLObject icon_filename = get_html_icon_filename(icon_keyword);
		return cconcatenate($html_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : html_missing_icon());
	}

	public static SubLObject html_icon(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject icon_keyword = NIL;
		destructuring_bind_must_consp(current, datum, $list54);
		icon_keyword = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$5 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list54);
			current_$5 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list54);
			if (NIL == member(current_$5, $list55, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$5 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list54);
		}
		final SubLObject id_tail = property_list_member($ID, current);
		final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
		final SubLObject name_tail = property_list_member($NAME, current);
		final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
		final SubLObject ismap_tail = property_list_member($ISMAP, current);
		final SubLObject ismap = (NIL != ismap_tail) ? cadr(ismap_tail) : NIL;
		final SubLObject height_tail = property_list_member($HEIGHT, current);
		final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
		final SubLObject width_tail = property_list_member($WIDTH, current);
		final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
		final SubLObject alt_override_tail = property_list_member($ALT_OVERRIDE, current);
		final SubLObject alt_override = (NIL != alt_override_tail) ? cadr(alt_override_tail) : NIL;
		final SubLObject align_override_tail = property_list_member($ALIGN_OVERRIDE, current);
		final SubLObject align_override = (NIL != align_override_tail) ? cadr(align_override_tail) : NIL;
		final SubLObject border_override_tail = property_list_member($BORDER_OVERRIDE, current);
		final SubLObject border_override = (NIL != border_override_tail) ? cadr(border_override_tail) : NIL;
		final SubLObject image_src = $sym64$IMAGE_SRC;
		final SubLObject align = $sym65$ALIGN;
		final SubLObject alt = $sym66$ALT;
		final SubLObject border = $sym67$BORDER;
		return list(CLET, list(list(image_src, list(CCONCATENATE, $html_image_directory$, list(HTML_ICON_SRC, icon_keyword))), list(align, listS(FIF, align_override, align_override, $list72)), list(alt, list(FIF, alt_override, alt_override, list(GET_HTML_ICON_ALT_STRING, icon_keyword))), list(border, listS(FIF, border_override, border_override, $list74))),
				list(new SubLObject[] { HTML_FANCY_IMAGE, image_src, $ID, id, $NAME, name, $ISMAP, ismap, $HEIGHT, height, $WIDTH, width, $ALT, alt, $ALIGN, align, $BORDER, border }));
	}

	public static SubLObject cb_help_keywords() {
		return hash_table_utilities.hash_table_keys($cb_help_definitions$.getGlobalValue());
	}

	public static SubLObject def_cb_help(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject help_keyword = NIL;
		SubLObject filename = NIL;
		destructuring_bind_must_consp(current, datum, $list80);
		help_keyword = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list80);
		filename = current.first();
		current = current.rest();
		final SubLObject desc_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list80);
		current = current.rest();
		if (NIL == current) {
			return list(SETHASH, help_keyword, $cb_help_definitions$, list(LIST, filename, desc_string));
		}
		cdestructuring_bind_error(datum, $list80);
		return NIL;
	}

	public static SubLObject cb_get_help_filename(final SubLObject help_keyword) {
		return gethash(help_keyword, $cb_help_definitions$.getGlobalValue(), UNPROVIDED).first();
	}

	public static SubLObject cb_get_help_desc_string(final SubLObject help_keyword) {
		return second(gethash(help_keyword, $cb_help_definitions$.getGlobalValue(), UNPROVIDED));
	}

	public static SubLObject cb_help_existsP(final SubLObject help_keyword) {
		return string_utilities.non_empty_stringP(cb_get_help_filename(help_keyword));
	}

	public static SubLObject cb_help_file_path(final SubLObject help_keyword) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject help_filename = cb_get_help_filename(help_keyword);
		if (!help_filename.isString()) {
			Errors.warn($str82$Help_file_not_found_for__A, help_keyword);
		}
		return cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), new SubLObject[] { $str81$help_, format_nil.format_nil_a_no_copy(help_filename) });
	}

	public static SubLObject cb_icon_keywords() {
		return hash_table_utilities.hash_table_keys($cb_icon_definitions$.getGlobalValue());
	}

	public static SubLObject def_cb_icon(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject icon_keyword = NIL;
		SubLObject filename = NIL;
		destructuring_bind_must_consp(current, datum, $list51);
		icon_keyword = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list51);
		filename = current.first();
		current = current.rest();
		final SubLObject alt_string = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list51);
		current = current.rest();
		if (NIL == current) {
			return list(SETHASH, icon_keyword, $cb_icon_definitions$, list(LIST, filename, alt_string));
		}
		cdestructuring_bind_error(datum, $list51);
		return NIL;
	}

	public static SubLObject cb_get_icon_filename(final SubLObject icon_keyword) {
		return gethash(icon_keyword, $cb_icon_definitions$.getGlobalValue(), UNPROVIDED).first();
	}

	public static SubLObject cb_get_icon_alt_string(final SubLObject icon_keyword) {
		return second(gethash(icon_keyword, $cb_icon_definitions$.getGlobalValue(), UNPROVIDED));
	}

	public static SubLObject cb_icon_existsP(final SubLObject icon_keyword) {
		return string_utilities.non_empty_stringP(cb_get_icon_filename(icon_keyword));
	}

	public static SubLObject cb_missing_icon() {
		return $cb_missing_icon$.getGlobalValue();
	}

	public static SubLObject cb_icon_file_path(final SubLObject icon_keyword) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject icon_filename = cb_get_icon_filename(icon_keyword);
		return cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), new SubLObject[] { $cb_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : $cb_missing_icon$.getGlobalValue() });
	}

	public static SubLObject cb_icon_src(final SubLObject icon_keyword) {
		final SubLObject icon_filename = cb_get_icon_filename(icon_keyword);
		return cconcatenate($cb_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : $cb_missing_icon$.getGlobalValue());
	}

	public static SubLObject cb_icon(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject icon_keyword = NIL;
		destructuring_bind_must_consp(current, datum, $list85);
		icon_keyword = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$6 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list85);
			current_$6 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list85);
			if (NIL == member(current_$6, $list86, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$6 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list85);
		}
		final SubLObject name_tail = property_list_member($NAME, current);
		final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
		final SubLObject ismap_tail = property_list_member($ISMAP, current);
		final SubLObject ismap = (NIL != ismap_tail) ? cadr(ismap_tail) : NIL;
		final SubLObject height_tail = property_list_member($HEIGHT, current);
		final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
		final SubLObject width_tail = property_list_member($WIDTH, current);
		final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
		final SubLObject alt_override_tail = property_list_member($ALT_OVERRIDE, current);
		final SubLObject alt_override = (NIL != alt_override_tail) ? cadr(alt_override_tail) : NIL;
		final SubLObject align_override_tail = property_list_member($ALIGN_OVERRIDE, current);
		final SubLObject align_override = (NIL != align_override_tail) ? cadr(align_override_tail) : NIL;
		final SubLObject border_override_tail = property_list_member($BORDER_OVERRIDE, current);
		final SubLObject border_override = (NIL != border_override_tail) ? cadr(border_override_tail) : NIL;
		final SubLObject image_src = $sym87$IMAGE_SRC;
		final SubLObject align = $sym88$ALIGN;
		final SubLObject alt = $sym89$ALT;
		final SubLObject border = $sym90$BORDER;
		return list(CLET, list(list(image_src, list(CB_ICON_FILE_PATH, icon_keyword)), list(align, listS(FIF, align_override, align_override, $list92)), list(alt, list(FIF, alt_override, alt_override, list(CB_GET_ICON_ALT_STRING, icon_keyword))), list(border, listS(FIF, border_override, border_override, $list74))),
				list(new SubLObject[] { HTML_FANCY_IMAGE, image_src, $NAME, name, $ISMAP, ismap, $HEIGHT, height, $WIDTH, width, $ALT, alt, $ALIGN, align, $BORDER, border }));
	}

	public static SubLObject compile_cb_browser_dependencies(SubLObject justify) {
		if (justify == UNPROVIDED) {
			justify = NIL;
		}
		final SubLObject keyword_definitions = compile_cb_browser_dependency_definitions();
		SubLObject paths = NIL;
		SubLObject cdolist_list_var = keyword_definitions;
		SubLObject keyword_definition = NIL;
		keyword_definition = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = keyword_definition;
			SubLObject keyword_producer = NIL;
			SubLObject keyword_mapping_fn = NIL;
			destructuring_bind_must_consp(current, datum, $list95);
			keyword_producer = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list95);
			keyword_mapping_fn = current.first();
			current = current.rest();
			if (NIL == current) {
				SubLObject cdolist_list_var_$7;
				final SubLObject keywords = cdolist_list_var_$7 = funcall(keyword_producer);
				SubLObject keyword = NIL;
				keyword = cdolist_list_var_$7.first();
				while (NIL != cdolist_list_var_$7) {
					final SubLObject file_path = cb_browser_dependency_map_keyword_to_path(keyword, keyword_mapping_fn);
					final SubLObject datum_$8 = (NIL != justify) ? list(file_path, keyword, keyword_producer) : file_path;
					paths = cons(datum_$8, paths);
					cdolist_list_var_$7 = cdolist_list_var_$7.rest();
					keyword = cdolist_list_var_$7.first();
				}
			} else {
				cdestructuring_bind_error(datum, $list95);
			}
			cdolist_list_var = cdolist_list_var.rest();
			keyword_definition = cdolist_list_var.first();
		}
		return nreverse(paths);
	}

	public static SubLObject compile_cb_browser_dependency_definitions() {
		SubLObject keyword_definitions = NIL;
		keyword_definitions = cons(list(JAVASCRIPT_KEYWORDS, JAVASCRIPT_FILE_PATH), keyword_definitions);
		keyword_definitions = cons(list(HTML_ICON_KEYWORDS, HTML_ICON_FILE_PATH), keyword_definitions);
		keyword_definitions = cons(list(CB_HELP_KEYWORDS, CB_HELP_FILE_PATH), keyword_definitions);
		keyword_definitions = cons(list(CB_ICON_KEYWORDS, CB_ICON_FILE_PATH), keyword_definitions);
		keyword_definitions = cons(list(CSS_KEYWORDS, CSS_FILE_PATH), keyword_definitions);
		return nreverse(keyword_definitions);
	}

	public static SubLObject cb_browser_dependency_map_keyword_to_path(final SubLObject keyword, final SubLObject mapping_fn) {
		SubLObject file_path = funcall(mapping_fn, keyword);
		if (NIL != charE(CHAR_slash, string_utilities.first_char(file_path))) {
			file_path = string_utilities.strip_first(file_path);
		}
		return file_path;
	}

	public static SubLObject cb_browser_dependency_manifest(SubLObject stream) {
		if (stream == UNPROVIDED) {
			stream = StreamsLow.$standard_output$.getDynamicValue();
		}
		SubLObject cdolist_list_var = compile_cb_browser_dependencies(UNPROVIDED);
		SubLObject path = NIL;
		path = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			write_string(path, stream, UNPROVIDED, UNPROVIDED);
			terpri(stream);
			cdolist_list_var = cdolist_list_var.rest();
			path = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject declare_cyc_file_dependencies_file() {
		declareMacro(me, "with_new_html_file_dependency_space", "WITH-NEW-HTML-FILE-DEPENDENCY-SPACE");
		declareMacro(me, "with_possibly_new_html_file_dependency_space", "WITH-POSSIBLY-NEW-HTML-FILE-DEPENDENCY-SPACE");
		declareFunction(me, "web_bundle", "WEB-BUNDLE", 1, 0, false);
		declareMacro(me, "def_web_bundle", "DEF-WEB-BUNDLE");
		declareFunction(me, "javascript", "JAVASCRIPT", 1, 0, false);
		declareMacro(me, "def_javascript", "DEF-JAVASCRIPT");
		declareFunction(me, "javascript_keywords", "JAVASCRIPT-KEYWORDS", 0, 0, false);
		declareFunction(me, "get_javascript_filename", "GET-JAVASCRIPT-FILENAME", 1, 0, false);
		declareFunction(me, "javascript_file_path", "JAVASCRIPT-FILE-PATH", 1, 0, false);
		declareFunction(me, "css", "CSS", 1, 0, false);
		declareMacro(me, "def_css", "DEF-CSS");
		declareFunction(me, "css_keywords", "CSS-KEYWORDS", 0, 0, false);
		declareFunction(me, "get_css_filename", "GET-CSS-FILENAME", 1, 0, false);
		declareFunction(me, "css_file_path", "CSS-FILE-PATH", 1, 0, false);
		declareMacro(me, "def_external_file", "DEF-EXTERNAL-FILE");
		declareFunction(me, "check_external_file_definition", "CHECK-EXTERNAL-FILE-DEFINITION", 5, 0, false);
		declareFunction(me, "emit_external_file_with_dependencies", "EMIT-EXTERNAL-FILE-WITH-DEPENDENCIES", 1, 0, false);
		declareFunction(me, "external_dependencies_of_type", "EXTERNAL-DEPENDENCIES-OF-TYPE", 1, 0, false);
		declareFunction(me, "get_external_dependency_filename", "GET-EXTERNAL-DEPENDENCY-FILENAME", 1, 0, false);
		declareFunction(me, "undefined_external_dependencies", "UNDEFINED-EXTERNAL-DEPENDENCIES", 1, 0, false);
		declareFunction(me, "external_dependency_definedP", "EXTERNAL-DEPENDENCY-DEFINED?", 1, 0, false);
		declareFunction(me, "redundant_dependencyP", "REDUNDANT-DEPENDENCY?", 4, 0, false);
		declareFunction(me, "get_external_dependency_data", "GET-EXTERNAL-DEPENDENCY-DATA", 1, 0, false);
		declareFunction(me, "doc_filepath", "DOC-FILEPATH", 2, 0, false);
		declareFunction(me, "ext_dep_ends_with", "EXT-DEP-ENDS-WITH", 2, 0, false);
		declareFunction(me, "java_applet_lib_file_path", "JAVA-APPLET-LIB-FILE-PATH", 1, 0, false);
		declareFunction(me, "java_applet_archive_string", "JAVA-APPLET-ARCHIVE-STRING", 1, 0, false);
		declareFunction(me, "html_icon_keywords", "HTML-ICON-KEYWORDS", 0, 0, false);
		declareMacro(me, "def_html_icon", "DEF-HTML-ICON");
		declareFunction(me, "get_html_icon_filename", "GET-HTML-ICON-FILENAME", 1, 0, false);
		declareFunction(me, "get_html_icon_alt_string", "GET-HTML-ICON-ALT-STRING", 1, 0, false);
		declareFunction(me, "html_icon_existsP", "HTML-ICON-EXISTS?", 1, 0, false);
		declareFunction(me, "html_missing_icon", "HTML-MISSING-ICON", 0, 0, false);
		declareFunction(me, "html_icon_file_path", "HTML-ICON-FILE-PATH", 1, 0, false);
		declareFunction(me, "html_icon_src", "HTML-ICON-SRC", 1, 0, false);
		declareMacro(me, "html_icon", "HTML-ICON");
		declareFunction(me, "cb_help_keywords", "CB-HELP-KEYWORDS", 0, 0, false);
		declareMacro(me, "def_cb_help", "DEF-CB-HELP");
		declareFunction(me, "cb_get_help_filename", "CB-GET-HELP-FILENAME", 1, 0, false);
		declareFunction(me, "cb_get_help_desc_string", "CB-GET-HELP-DESC-STRING", 1, 0, false);
		declareFunction(me, "cb_help_existsP", "CB-HELP-EXISTS?", 1, 0, false);
		declareFunction(me, "cb_help_file_path", "CB-HELP-FILE-PATH", 1, 0, false);
		declareFunction(me, "cb_icon_keywords", "CB-ICON-KEYWORDS", 0, 0, false);
		declareMacro(me, "def_cb_icon", "DEF-CB-ICON");
		declareFunction(me, "cb_get_icon_filename", "CB-GET-ICON-FILENAME", 1, 0, false);
		declareFunction(me, "cb_get_icon_alt_string", "CB-GET-ICON-ALT-STRING", 1, 0, false);
		declareFunction(me, "cb_icon_existsP", "CB-ICON-EXISTS?", 1, 0, false);
		declareFunction(me, "cb_missing_icon", "CB-MISSING-ICON", 0, 0, false);
		declareFunction(me, "cb_icon_file_path", "CB-ICON-FILE-PATH", 1, 0, false);
		declareFunction(me, "cb_icon_src", "CB-ICON-SRC", 1, 0, false);
		declareMacro(me, "cb_icon", "CB-ICON");
		declareFunction(me, "compile_cb_browser_dependencies", "COMPILE-CB-BROWSER-DEPENDENCIES", 0, 1, false);
		declareFunction(me, "compile_cb_browser_dependency_definitions", "COMPILE-CB-BROWSER-DEPENDENCY-DEFINITIONS", 0, 0, false);
		declareFunction(me, "cb_browser_dependency_map_keyword_to_path", "CB-BROWSER-DEPENDENCY-MAP-KEYWORD-TO-PATH", 2, 0, false);
		declareFunction(me, "cb_browser_dependency_manifest", "CB-BROWSER-DEPENDENCY-MANIFEST", 0, 1, false);
		return NIL;
	}

	public static SubLObject init_cyc_file_dependencies_file() {
		deflexical("*EXTERNAL-FILE-DEFINITIONS*", SubLTrampolineFile.maybeDefault($external_file_definitions$, $external_file_definitions$, () -> make_hash_table($int$64, UNPROVIDED, UNPROVIDED)));
		defparameter("*HTML-EMITTED-FILE-DEPENDENCIES*", $UNINITIALIZED);
		deflexical("*JAVA-DEFAULT-DIRECTORY*", $str44$java_);
		deflexical("*HTML-ICON-DEFINITIONS*", SubLTrampolineFile.maybeDefault($html_icon_definitions$, $html_icon_definitions$, () -> make_hash_table($int$32, UNPROVIDED, UNPROVIDED)));
		deflexical("*HTML-ICON-DEFAULT-DIRECTORY*", $str52$);
		deflexical("*HTML-MISSING-ICON*", $str53$missing_gif);
		deflexical("*CB-HELP-DEFINITIONS*", SubLTrampolineFile.maybeDefault($cb_help_definitions$, $cb_help_definitions$, () -> make_hash_table($int$32, UNPROVIDED, UNPROVIDED)));
		deflexical("*CB-HELP-DEFAULT-DIRECTORY*", $str81$help_);
		deflexical($javascript_definitions$, make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
		deflexical("*CB-ICON-DEFINITIONS*", SubLTrampolineFile.maybeDefault($cb_icon_definitions$, $cb_icon_definitions$, () -> make_hash_table($int$32, UNPROVIDED, UNPROVIDED)));
		deflexical("*CB-ICON-DEFAULT-DIRECTORY*", $str84$cb_);
		deflexical("*CB-MISSING-ICON*", $str53$missing_gif);
		return NIL;
	}

	public static SubLObject setup_cyc_file_dependencies_file() {
		declare_defglobal($external_file_definitions$);
		register_macro_helper(CHECK_EXTERNAL_FILE_DEFINITION, DEF_EXTERNAL_FILE);
		register_macro_helper(UNDEFINED_EXTERNAL_DEPENDENCIES, DEF_EXTERNAL_FILE);
		register_macro_helper($sym42$REDUNDANT_DEPENDENCY_, DEF_EXTERNAL_FILE);
		register_macro_helper(EXT_DEP_ENDS_WITH, $list43);
		declare_defglobal($javascript_definitions$);
		declare_defglobal($html_icon_definitions$);
		declare_defglobal($cb_help_definitions$);
		declare_defglobal($cb_icon_definitions$);
		register_external_symbol(COMPILE_CB_BROWSER_DEPENDENCIES);
		register_external_symbol(CB_BROWSER_DEPENDENCY_MANIFEST);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_cyc_file_dependencies_file();
	}

	@Override
	public void initializeVariables() {
		init_cyc_file_dependencies_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_cyc_file_dependencies_file();
	}

	static {

	}
}

/**
 * Total time: 256 ms
 */
