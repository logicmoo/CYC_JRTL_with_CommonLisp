/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.defmacro_obsolete_warning;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
//import static com.cyc.cycjava.cycl.cyc_file_dependencies.$javascript_definitions$;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_ampersand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_plus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_return;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_vertical;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alphanumericp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.get;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.put;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_input_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_utilities extends SubLTranslatedFile {
	public static final SubLFile me = new html_utilities();

	public static final String myName = "com.cyc.cycjava.cycl.html_utilities";

	public static final String myFingerPrint = "7f1f08509cd9b640a6d9a125f843de6a12d2c85f77e8d6b17b20f4581064408a";

	// defparameter
	public static final SubLSymbol $use_new_html_princ_cycl_stringP$ = makeSymbol("*USE-NEW-HTML-PRINC-CYCL-STRING?*");

	// defparameter
	/**
	 * The color to use for stale #$ references in documentation strings (or NIL to
	 * disable)
	 */
	private static final SubLSymbol $html_stale_constant_reference_color$ = makeSymbol("*HTML-STALE-CONSTANT-REFERENCE-COLOR*");

	// defparameter
	// Do we convert #Space to #+ when outputting a string via HTML-URL-PRINC?
	public static final SubLSymbol $html_url_princ_escape_spaces$ = makeSymbol("*HTML-URL-PRINC-ESCAPE-SPACES*");

	// defparameter
	private static final SubLSymbol $html_style_background$ = makeSymbol("*HTML-STYLE-BACKGROUND*");

	// defparameter
	public static final SubLSymbol $html_align_map$ = makeSymbol("*HTML-ALIGN-MAP*");

	// defparameter
	public static final SubLSymbol $cycorp_homepage_url$ = makeSymbol("*CYCORP-HOMEPAGE-URL*");

	// defparameter
	public static final SubLSymbol $cycorp_homepage_text$ = makeSymbol("*CYCORP-HOMEPAGE-TEXT*");

	// defparameter
	// Used internally by HTML-EXTRACT-INPUT
	private static final SubLSymbol $html_extract_field_name$ = makeSymbol("*HTML-EXTRACT-FIELD-NAME*");

	// deflexical
	private static final SubLSymbol $url_to_text_replacements$ = makeSymbol("*URL-TO-TEXT-REPLACEMENTS*");

	// deflexical
	private static final SubLSymbol $html_filename_input_prefix$ = makeSymbol("*HTML-FILENAME-INPUT-PREFIX*");

	// deflexical
	/**
	 * Key put onto the arg list to indicate that we are looking at
	 * multipart/formdata.
	 */
	public static final SubLSymbol $html_multipart_form_date$ = makeSymbol("*HTML-MULTIPART-FORM-DATE*");

	// defconstant
	private static final SubLSymbol $html_newline_string$ = makeSymbol("*HTML-NEWLINE-STRING*");

	// deflexical
	private static final SubLSymbol $html_multipart_content_marker$ = makeSymbol("*HTML-MULTIPART-CONTENT-MARKER*");

	// deflexical
	private static final SubLSymbol $html_multipart_content_marker_size$ = makeSymbol("*HTML-MULTIPART-CONTENT-MARKER-SIZE*");

	// defparameter
	private static final SubLSymbol $build_treemap_depth$ = makeSymbol("*BUILD-TREEMAP-DEPTH*");

	// deflexical
	private static final SubLSymbol $build_treemap_max_depth$ = makeSymbol("*BUILD-TREEMAP-MAX-DEPTH*");

	// defconstant
	private static final SubLSymbol $html_utils_test$ = makeSymbol("*HTML-UTILS-TEST*");

	// defconstant
	private static final SubLSymbol $html_utils_test_category$ = makeSymbol("*HTML-UTILS-TEST-CATEGORY*");

	// defconstant
	private static final SubLSymbol $html_utils_test_suite$ = makeSymbol("*HTML-UTILS-TEST-SUITE*");

	// defconstant
	private static final SubLSymbol $html_utils_module$ = makeSymbol("*HTML-UTILS-MODULE*");

	// Internal Constants
	public static final SubLSymbol $cb_use_frames$ = makeSymbol("*CB-USE-FRAMES*");

	public static final SubLSymbol HTML_RESERVED_CHAR_P = makeSymbol("HTML-RESERVED-CHAR-P");

	public static final SubLSymbol NON_ASCII_CHAR_P = makeSymbol("NON-ASCII-CHAR-P");

	private static final SubLInteger $int$38 = makeInteger(38);

	private static final SubLInteger $int$34 = makeInteger(34);

	private static final SubLInteger $int$60 = makeInteger(60);

	private static final SubLInteger $int$62 = makeInteger(62);

	private static final SubLString $str7$__x = makeString("&#x");

	private static final SubLString $str8$_ = makeString(";");

	private static final SubLFloat $float$0_5 = makeDouble(0.5);

	private static final SubLInteger $int$128 = makeInteger(128);

	private static final SubLString $str14$__A_ = makeString("|~A|");

	private static final SubLString $str16$__x_x_ = makeString("&#x~x;");

	private static final SubLString $str17$______i__ = makeString(" ... <i>(");

	private static final SubLString $str18$_characters_total___i_ = makeString(" characters total)</i>");

	private static final SubLSymbol $sym21$EL_VARIABLE_CHAR_ = makeSymbol("EL-VARIABLE-CHAR?");

	private static final SubLSymbol $sym22$STRING_ = makeSymbol("STRING=");

	private static final SubLString $str23$_ = makeString("<");

	private static final SubLString $str24$_ = makeString("/");

	private static final SubLString $str25$_ = makeString(">");

	private static final SubLString $$$code = makeString("code");

	private static final SubLString $$$pre = makeString("pre");

	private static final SubLSymbol HTML_LINK_TO_OWL_URI = makeSymbol("HTML-LINK-TO-OWL-URI");

	private static final SubLSymbol HTML_LINK_TO_OWL_OPENCYC_URI = makeSymbol("HTML-LINK-TO-OWL-OPENCYC-URI");

	private static final SubLSymbol OPENCYC_HTML_CYCL_STRING = makeSymbol("OPENCYC-HTML-CYCL-STRING");

	private static final SubLList $list37 = list(new SubLObject[] { list(list(makeString("#$rdfs:label is")), makeString("<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rdpCjwNu9QdaChuanmVyrQg\" class=\"cyc_term\">rdfs_label</a> is")),
			list(list(makeString("#$rdfs:label is #$owl:NONSENSE http://www.w3.org/2000/01/rdf-schema#label")), makeString("<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rdpCjwNu9QdaChuanmVyrQg\" class=\"cyc_term\">rdfs_label</a> is <font color=\"#ff0000\">#$owl:NONSENSE</font> <a href= \"http://www.w3.org/2000/01/rdf-schema#label\">http://www.w3.org/2000/01/rdf-schema#label</a>")),
			list(list(makeString("This is a <code>META-VARIABLE</code>.")), makeString("This is a <code><b>META-VARIABLE</b></code>.")), list(list(makeString("This is not a META-VARIABLE.")), makeString("This is not a META-VARIABLE.")),
			list(list(makeString("<code>(#$isa #$Emu THING)</code>.")), makeString("<code>(<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rvViBBJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">isa</a> <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a> <b>THING</b>)</code>.")),
			list(list(makeString("Bert is an #$Emu.")), makeString("Bert is an <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a>.")), list(list(makeString("Please link to http://www.cyc.com.")), makeString("Please link to <a href= \"http://www.cyc.com\">http://www.cyc.com</a>.")),
			list(list(makeString("#$Emus are kind and gentle creatures.")), makeString("<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a>s are kind and gentle creatures.")),
			list(list(list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("The #$FamousHuman artist known as &u99AC;&u53CB;&u53CB;."))), makeString("The <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rvVjma5wpEbGdrcN5Y29ycA\" class=\"cyc_term\">FamousHuman</a> artist known as &#x99AC;&#x53CB;&#x53CB;.")),
			list(list(makeString("Blake loves <code>code</code>, but hates <CODE>code</CODE> unless there's a <code>#$Person</code> in it.")), makeString("Blake loves <code>code</code>, but hates <CODE>code</CODE> unless there\'s a <code><a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rvViAkpwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Person</a></code> in it.")), list(list(makeString("S")), makeString("S")) });

	private static final SubLString $str39$_A = makeString("~A");

	private static final SubLString $str40$_ = makeString("(");

	private static final SubLString $$$_ = makeString(" ");

	private static final SubLString $str42$___ = makeString(" . ");

	private static final SubLString $str43$_ = makeString(")");

	private static final SubLString $str44$___ = makeString("-_.");

	private static final SubLString $str45$__C_C = makeString("%~C~C");

	private static final SubLString $str46$_ = makeString("=");

	private static final SubLString $str47$ = makeString("");

	private static final SubLString $str48$background_color_ = makeString("background-color:");

	private static final SubLList $list49 = list(new SubLObject[] { cons(makeKeyword("TOP"), makeString("top")), cons(makeKeyword("MIDDLE"), makeString("middle")), cons(makeKeyword("BOTTOM"), makeString("bottom")), cons(makeKeyword("LEFT"), makeString("left")), cons(makeKeyword("CENTER"), makeString("center")), cons(makeKeyword("RIGHT"), makeString("right")), cons(makeKeyword("TEXTTOP"), makeString("top")),
			cons(makeKeyword("ABSMIDDLE"), makeString("middle")), cons(makeKeyword("BASELINE"), makeString("bottom")), cons(makeKeyword("ABSBOTTOM"), makeString("bottom")) });

	private static final SubLString $str50$http___www_cyc_com = makeString("http://www.cyc.com");

	private static final SubLString $$$Cycorp = makeString("Cycorp");

	public static final SubLSymbol $proprietarity_message$ = makeSymbol("*PROPRIETARITY-MESSAGE*");

	private static final SubLString $$$copyright = makeString("copyright");

	private static final SubLString $str54$Copyright__copy__1995____A_ = makeString("Copyright &copy; 1995 - ~A ");

	private static final SubLString $str55$___All_rights_reserved___ = makeString(".  All rights reserved.  ");

	private static final SubLSymbol $CYC_LOGO_SMALL_VIOLET_FULL_URL = makeKeyword("CYC-LOGO-SMALL-VIOLET-FULL-URL");

	private static final SubLString $str57$cyc_logo_violet_16_gif = makeString("cyc-logo-violet-16.gif");

	private static final SubLSymbol $CYC_LOGO_LARGE_VIOLET_FULL_URL = makeKeyword("CYC-LOGO-LARGE-VIOLET-FULL-URL");

	private static final SubLString $str59$cyc_logo_violet_60_gif = makeString("cyc-logo-violet-60.gif");

	private static final SubLSymbol $CYCORP_SYMBOL_TINY = makeKeyword("CYCORP-SYMBOL-TINY");

	private static final SubLString $str61$cyc_logo_tiny_gif = makeString("cyc-logo-tiny.gif");

	private static final SubLSymbol $CYCORP_SYMBOL_SMALL = makeKeyword("CYCORP-SYMBOL-SMALL");

	private static final SubLString $str63$cyc_logo_sm_gif = makeString("cyc-logo-sm.gif");

	private static final SubLSymbol $CYCORP_SYMBOL_MEDIUM = makeKeyword("CYCORP-SYMBOL-MEDIUM");

	private static final SubLString $str65$cyc_logo_10_t_gif = makeString("cyc-logo-10-t.gif");

	private static final SubLSymbol $CYCORP_LOGO_MEDIUM = makeKeyword("CYCORP-LOGO-MEDIUM");

	private static final SubLString $str67$cyc_logo_25_t_gif = makeString("cyc-logo-25-t.gif");

	private static final SubLSymbol $CYCORP_LOGO_BIG = makeKeyword("CYCORP-LOGO-BIG");

	private static final SubLString $str69$cyc_logo_50_t_gif = makeString("cyc-logo-50-t.gif");

	private static final SubLString $str70$_URL_ = makeString(";URL=");

	private static final SubLString $$$Refresh = makeString("Refresh");

	private static final SubLString $str72$Content_type = makeString("Content-type");

	private static final SubLString $str73$text_html__charset_UTF_8 = makeString("text/html; charset=UTF-8");

	private static final SubLString $$$Expires = makeString("Expires");

	private static final SubLString $str75$Last_Modified = makeString("Last-Modified");

	private static final SubLString $str76$Cache_Control = makeString("Cache-Control");

	private static final SubLString $str77$no_cache = makeString("no-cache");

	private static final SubLList $list78 = list(list(makeSymbol("&KEY"), list(makeSymbol("HH"), ZERO_INTEGER), list(makeSymbol("MM"), ZERO_INTEGER), list(makeSymbol("SS"), ZERO_INTEGER)));

	private static final SubLList $list79 = list(makeKeyword("HH"), makeKeyword("MM"), makeKeyword("SS"));

	private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

	private static final SubLSymbol HTML_WEBPAGE_EXPIRES = makeSymbol("HTML-WEBPAGE-EXPIRES");

	private static final SubLList $list85 = list(makeSymbol("HTML-META-EXPIRES"));

	private static final SubLSymbol HTML_META_EXPIRES = makeSymbol("HTML-META-EXPIRES");

	private static final SubLList $list87 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("UNIV-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME"))));

	private static final SubLSymbol HTML_WEBPAGE_LAST_MODIFIED = makeSymbol("HTML-WEBPAGE-LAST-MODIFIED");

	public static final SubLList $list89 = list(makeSymbol("HTML-META-LAST-MODIFIED"));

	private static final SubLSymbol HTML_META_LAST_MODIFIED = makeSymbol("HTML-META-LAST-MODIFIED");

	private static final SubLSymbol HTML_DONT_CACHE_WEBPAGE = makeSymbol("HTML-DONT-CACHE-WEBPAGE");

	private static final SubLList $list92 = list(makeSymbol("HTML-META-DONT-CACHE"));

	private static final SubLString $$$ROBOTS = makeString("ROBOTS");

	private static final SubLString $str94$NOINDEX__NOFOLLOW = makeString("NOINDEX, NOFOLLOW");

	private static final SubLString $str95$INDEX__FOLLOW = makeString("INDEX, FOLLOW");

	private static final SubLString $str96$NOINDEX__FOLLOW = makeString("NOINDEX, FOLLOW");

	private static final SubLString $str97$INDEX__NOFOLLOW = makeString("INDEX, NOFOLLOW");

	private static final SubLString $str98$Invalid_HTML_meta_select_robot_in = makeString("Invalid HTML meta select robot instruction.");

	private static final SubLString $$$Reset_All_Fields = makeString("Reset All Fields");

	private static final SubLString $str100$autocomplete_ = makeString("autocomplete-");

	private static final SubLString $str101$input_ = makeString("input-");

	private static final SubLString $str102$autocomplete_results_ = makeString("autocomplete-results-");

	private static final SubLString $str103$position_static__width_auto_ = makeString("position:static; width:auto ");

	private static final SubLString $str104$yui_ac = makeString("yui-ac");

	private static final SubLString $str105$yui_ac_input = makeString("yui-ac-input");

	private static final SubLString $str106$yui_ac_container = makeString("yui-ac-container");

	private static final SubLList $list107 = list(makeSymbol("SRC"), makeSymbol("NAME"), makeSymbol("DEFAULT"), makeSymbol("MAP"));

	private static final SubLList $list108 = list(makeSymbol("SRC"), makeSymbol("NAME"), makeSymbol("DEFAULT"), makeSymbol("MAP-ITEMS"));

	private static final SubLString $str109$_x = makeString(".x");

	private static final SubLString $str110$_y = makeString(".y");

	public static final SubLList $list111 = list(makeSymbol("X-RANGE"), makeSymbol("Y-RANGE"), makeSymbol("VALUE"));

	private static final SubLList $list112 = list(makeSymbol("ARG-NAME"), makeSymbol("VALUE"));

	private static final SubLList $list116 = list(makeSymbol("&KEY"), makeSymbol("SOFAR"), makeSymbol("TOTAL"), makeSymbol("WIDTH"), list(makeSymbol("HEIGHT"), TWO_INTEGER), list(makeSymbol("PROGRESS-COLOR"), list(makeSymbol("QUOTE"), makeSymbol("*HTML-COLOR-SAT-GREEN*"))), list(makeSymbol("REMAINING-COLOR"), list(makeSymbol("QUOTE"), makeSymbol("*HTML-COLOR-SAT-RED*"))), list(makeSymbol("BORDER"), ZERO_INTEGER));

	private static final SubLList $list117 = list(makeKeyword("SOFAR"), makeKeyword("TOTAL"), makeKeyword("WIDTH"), makeKeyword("HEIGHT"), makeKeyword("PROGRESS-COLOR"), makeKeyword("REMAINING-COLOR"), makeKeyword("BORDER"));

	private static final SubLSymbol $html_color_sat_green$ = makeSymbol("*HTML-COLOR-SAT-GREEN*");

	private static final SubLSymbol $html_color_sat_red$ = makeSymbol("*HTML-COLOR-SAT-RED*");

	private static final SubLSymbol $sym127$WIDTH1 = makeUninternedSymbol("WIDTH1");

	private static final SubLSymbol $sym128$WIDTH2 = makeUninternedSymbol("WIDTH2");

	private static final SubLSymbol HTML_FANCY_TABLE = makeSymbol("HTML-FANCY-TABLE");

	private static final SubLList $list130 = list(makeKeyword("CELLSPACING"), ZERO_INTEGER, makeKeyword("CELLPADDING"), ZERO_INTEGER);

	private static final SubLSymbol HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS = makeSymbol("HTML-FANCY-PERCENT-PROGRESS-BAR-WIDTHS");

	private static final SubLSymbol HTML_FANCY_TABLE_ROW = makeSymbol("HTML-FANCY-TABLE-ROW");

	private static final SubLSymbol HTML_FANCY_PERCENT_PROGRESS_BAR = makeSymbol("HTML-FANCY-PERCENT-PROGRESS-BAR");

	private static final SubLString $str141$Run_Time__ = makeString("Run Time :");

	private static final SubLString $str142$Elapsed_Time__ = makeString("Elapsed Time :");

	private static final SubLString $str144$Current_Total__ = makeString("Current Total :");

	private static final SubLString $$$_of_ = makeString(" of ");

	private static final SubLString $str147$_D_ = makeString("~D%");

	private static final SubLString $str148$_No_data_to_graph_ = makeString("[No data to graph]");

	private static final SubLString $str151$100_ = makeString("100%");

	private static final SubLString $str152$1_ = makeString("1%");

	private static final SubLString $str153$_ = makeString("%");

	private static final SubLString $str154$5_ = makeString("5%");

	private static final SubLString $str155$95_ = makeString("95%");

	private static final SubLString $str156$__D = makeString("~:D");

	private static final SubLList $list161 = list(list(makeKeyword("ENTRY"), makeSymbol("TRUE"), makeString("Value")));

	private static final SubLList $list164 = list(makeSymbol("TYPE"), makeSymbol("DATUM"), makeSymbol("POSSIBILITY-FANCY-NAME"));

	private static final SubLList $list165 = list(makeKeyword("TEXT"), NIL);

	private static final SubLList $list166 = list(makeSymbol("TYPE"), makeSymbol("SIZE"));

	private static final SubLString $str168$The_value_entered_for__ = makeString("The value entered for '");

	private static final SubLString $str169$__was_not_valid_ = makeString("' was not valid.");

	private static final SubLString $str170$No_value_was_entered_for__ = makeString("No value was entered for '");

	private static final SubLString $str171$__ = makeString("'.");

	private static final SubLString $str172$No_choice_was_made_for__ = makeString("No choice was made for '");

	private static final SubLString $str173$_is_not_a_declared_control_parame = makeString(" is not a declared control parameter");

	private static final SubLString $str176$entry_ = makeString("entry-");

	private static final SubLString $str177$radio_ = makeString("radio-");

	private static final SubLSymbol MATCHING_HTML_FIELD = makeSymbol("MATCHING-HTML-FIELD");

	private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

	private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

	private static final SubLSymbol $sym184$_EXIT = makeSymbol("%EXIT");

	private static final SubLSymbol MATCHING_HTML_BUTTON_FIELD = makeSymbol("MATCHING-HTML-BUTTON-FIELD");

	private static final SubLString $$$en = makeString("en");

	private static final SubLObject $$EnglishLanguage = reader_make_constant_shell(makeString("EnglishLanguage"));

	private static final SubLString $str188$en_gb = makeString("en-gb");

	private static final SubLObject $$BritishEnglishDialect = reader_make_constant_shell(makeString("BritishEnglishDialect"));

	private static final SubLString $$$fr = makeString("fr");

	private static final SubLObject $$FrenchLanguage = reader_make_constant_shell(makeString("FrenchLanguage"));

	private static final SubLString $$$de = makeString("de");

	private static final SubLObject $$GermanLanguage = reader_make_constant_shell(makeString("GermanLanguage"));

	private static final SubLObject $$languageCodeDigraph = reader_make_constant_shell(makeString("languageCodeDigraph"));

	private static final SubLString $str197$_lt_ = makeString("&lt;");

	private static final SubLString $str199$_gt_ = makeString("&gt;");

	private static final SubLString $str201$_amp_ = makeString("&amp;");

	private static final SubLString $str203$_quot_ = makeString("&quot;");

	private static final SubLString $str205$_reg_ = makeString("&reg;");

	private static final SubLString $str207$_copy_ = makeString("&copy;");

	private static final SubLString $str208$_nbsp_ = makeString("&nbsp;");

	private static final SubLString $str210$_emsp_ = makeString("&emsp;");

	private static final SubLString $str212$_ensp_ = makeString("&ensp;");

	private static final SubLString $str214$__X0020_ = makeString("&#X0020;");

	private static final SubLString $str216$__X2003_ = makeString("&#X2003;");

	private static final SubLString $str218$__X2002_ = makeString("&#X2002;");

	private static final SubLSymbol $TWO_PER_EM_SPACE = makeKeyword("TWO-PER-EM-SPACE");

	private static final SubLSymbol $THREE_PER_EM_SPACE = makeKeyword("THREE-PER-EM-SPACE");

	private static final SubLString $str221$__X2004_ = makeString("&#X2004;");

	private static final SubLSymbol $FOUR_PER_EM_SPACE = makeKeyword("FOUR-PER-EM-SPACE");

	private static final SubLString $str223$__X2005_ = makeString("&#X2005;");

	private static final SubLSymbol $SIX_PER_EM_SPACE = makeKeyword("SIX-PER-EM-SPACE");

	private static final SubLString $str225$__X2006_ = makeString("&#X2006;");

	private static final SubLString $str227$__X2009_ = makeString("&#X2009;");

	private static final SubLString $str229$__X200A_ = makeString("&#X200A;");

	private static final SubLString $str231$_iexcl_ = makeString("&iexcl;");

	private static final SubLString $str233$_cent_ = makeString("&cent;");

	private static final SubLString $str235$_pound_ = makeString("&pound;");

	private static final SubLString $str237$_curren_ = makeString("&curren;");

	private static final SubLString $str239$_yen_ = makeString("&yen;");

	private static final SubLString $str241$_brvba_ = makeString("&brvba;");

	private static final SubLString $str243$_sect_ = makeString("&sect;");

	private static final SubLString $str245$_uml_ = makeString("&uml;");

	private static final SubLString $str247$_ordf_ = makeString("&ordf;");

	private static final SubLString $str249$_laquo_ = makeString("&laquo;");

	private static final SubLString $str251$_not_ = makeString("&not;");

	private static final SubLString $str253$_shy_ = makeString("&shy;");

	private static final SubLString $str255$_macr_ = makeString("&macr;");

	private static final SubLString $str257$_deg_ = makeString("&deg;");

	private static final SubLString $str259$_plusmn_ = makeString("&plusmn;");

	private static final SubLString $str261$_sup2_ = makeString("&sup2;");

	private static final SubLString $str263$_sup3_ = makeString("&sup3;");

	private static final SubLString $str265$_acute_ = makeString("&acute;");

	private static final SubLString $str267$_micro_ = makeString("&micro;");

	private static final SubLString $str269$_para_ = makeString("&para;");

	private static final SubLString $str271$_middoy_ = makeString("&middoy;");

	private static final SubLString $str273$_cedil_ = makeString("&cedil;");

	private static final SubLString $str275$_sup1_ = makeString("&sup1;");

	private static final SubLString $str277$_ordm_ = makeString("&ordm;");

	private static final SubLString $str279$_raquo_ = makeString("&raquo;");

	private static final SubLString $str281$_frac14_ = makeString("&frac14;");

	private static final SubLString $str283$_frac12_ = makeString("&frac12;");

	private static final SubLString $str285$_frac34_ = makeString("&frac34;");

	private static final SubLString $str287$_iquest_ = makeString("&iquest;");

	private static final SubLString $str289$_Agrave_ = makeString("&Agrave;");

	private static final SubLString $str291$_Aacute_ = makeString("&Aacute;");

	private static final SubLString $str293$_Acirc_ = makeString("&Acirc;");

	private static final SubLString $str295$_Atilde_ = makeString("&Atilde;");

	private static final SubLString $str297$_Auml_ = makeString("&Auml;");

	private static final SubLString $str299$_Aring_ = makeString("&Aring;");

	private static final SubLString $str301$_AElig_ = makeString("&AElig;");

	private static final SubLString $str303$_Ccedil_ = makeString("&Ccedil;");

	private static final SubLString $str305$_Egrave_ = makeString("&Egrave;");

	private static final SubLString $str307$_Eacute_ = makeString("&Eacute;");

	private static final SubLString $str309$_Ecirc_ = makeString("&Ecirc;");

	private static final SubLString $str311$_Euml_ = makeString("&Euml;");

	private static final SubLString $str313$_Igrave_ = makeString("&Igrave;");

	private static final SubLString $str315$_Iacute_ = makeString("&Iacute;");

	private static final SubLString $str317$_Icirc_ = makeString("&Icirc;");

	private static final SubLString $str319$_Iuml_ = makeString("&Iuml;");

	private static final SubLString $str321$_ETH_ = makeString("&ETH;");

	private static final SubLString $str323$_Ntilde_ = makeString("&Ntilde;");

	private static final SubLString $str325$_Ograve_ = makeString("&Ograve;");

	private static final SubLString $str327$_Oacute_ = makeString("&Oacute;");

	private static final SubLString $str329$_Ocirc_ = makeString("&Ocirc;");

	private static final SubLString $str331$_Otilde_ = makeString("&Otilde;");

	private static final SubLString $str333$_Ouml_ = makeString("&Ouml;");

	private static final SubLString $str335$_times_ = makeString("&times;");

	private static final SubLString $str337$_Oslash_ = makeString("&Oslash;");

	private static final SubLString $str339$_Ugrave_ = makeString("&Ugrave;");

	private static final SubLString $str341$_Uacute_ = makeString("&Uacute;");

	private static final SubLString $str343$_Ucirc_ = makeString("&Ucirc;");

	private static final SubLString $str345$_Uuml_ = makeString("&Uuml;");

	private static final SubLString $str347$_Yacute_ = makeString("&Yacute;");

	private static final SubLString $str349$_THORN_ = makeString("&THORN;");

	private static final SubLString $str351$_szlig_ = makeString("&szlig;");

	private static final SubLString $str353$_agrave_ = makeString("&agrave;");

	private static final SubLString $str355$_aacute_ = makeString("&aacute;");

	private static final SubLString $str357$_acirc_ = makeString("&acirc;");

	private static final SubLString $str359$_atilde_ = makeString("&atilde;");

	private static final SubLString $str361$_auml_ = makeString("&auml;");

	private static final SubLString $str363$_aring_ = makeString("&aring;");

	private static final SubLString $str365$_aelig_ = makeString("&aelig;");

	private static final SubLString $str367$_ccedil_ = makeString("&ccedil;");

	private static final SubLString $str369$_egrave_ = makeString("&egrave;");

	private static final SubLString $str371$_eacute_ = makeString("&eacute;");

	private static final SubLString $str373$_ecirc_ = makeString("&ecirc;");

	private static final SubLString $str375$_euml_ = makeString("&euml;");

	private static final SubLString $str377$_igrave_ = makeString("&igrave;");

	private static final SubLString $str379$_iacute_ = makeString("&iacute;");

	private static final SubLString $str381$_icirc_ = makeString("&icirc;");

	private static final SubLString $str383$_iuml_ = makeString("&iuml;");

	private static final SubLString $str385$_eth_ = makeString("&eth;");

	private static final SubLString $str387$_ntilde_ = makeString("&ntilde;");

	private static final SubLString $str389$_ograve_ = makeString("&ograve;");

	private static final SubLString $str391$_oacute_ = makeString("&oacute;");

	private static final SubLString $str393$_ocirc_ = makeString("&ocirc;");

	private static final SubLString $str395$_otilde_ = makeString("&otilde;");

	private static final SubLString $str397$_ouml_ = makeString("&ouml;");

	private static final SubLString $str399$_divide_ = makeString("&divide;");

	private static final SubLString $str401$_oslash_ = makeString("&oslash;");

	private static final SubLString $str403$_ugrave_ = makeString("&ugrave;");

	private static final SubLString $str405$_uacute_ = makeString("&uacute;");

	private static final SubLString $str407$_ucirc_ = makeString("&ucirc;");

	private static final SubLString $str409$_uuml_ = makeString("&uuml;");

	private static final SubLString $str411$_yacute_ = makeString("&yacute;");

	private static final SubLString $str413$_thorn_ = makeString("&thorn;");

	private static final SubLString $str415$_yuml_ = makeString("&yuml;");

	private static final SubLString $str417$_fnof_ = makeString("&fnof;");

	private static final SubLString $str419$_Alpha_ = makeString("&Alpha;");

	private static final SubLString $str421$_Beta_ = makeString("&Beta;");

	private static final SubLString $str423$_Gamma_ = makeString("&Gamma;");

	private static final SubLString $str425$_Delta_ = makeString("&Delta;");

	private static final SubLString $str427$_Epsilon_ = makeString("&Epsilon;");

	private static final SubLString $str429$_Zeta_ = makeString("&Zeta;");

	private static final SubLString $str431$_Eta_ = makeString("&Eta;");

	private static final SubLString $str433$_Theta_ = makeString("&Theta;");

	private static final SubLString $str435$_Iota_ = makeString("&Iota;");

	private static final SubLString $str437$_Kappa_ = makeString("&Kappa;");

	private static final SubLString $str439$_Lambda_ = makeString("&Lambda;");

	private static final SubLString $str441$_Mu_ = makeString("&Mu;");

	private static final SubLString $str443$_Nu_ = makeString("&Nu;");

	private static final SubLString $str445$_Xi_ = makeString("&Xi;");

	private static final SubLString $str447$_Omicron_ = makeString("&Omicron;");

	private static final SubLString $str449$_Pi_ = makeString("&Pi;");

	private static final SubLString $str451$_Rho_ = makeString("&Rho;");

	private static final SubLString $str453$_Sigma_ = makeString("&Sigma;");

	private static final SubLString $str455$_Tau_ = makeString("&Tau;");

	private static final SubLString $str457$_Upsilon_ = makeString("&Upsilon;");

	private static final SubLString $str459$_Phi_ = makeString("&Phi;");

	private static final SubLString $str461$_Chi_ = makeString("&Chi;");

	private static final SubLString $str463$_Psi_ = makeString("&Psi;");

	private static final SubLString $str465$_Omega_ = makeString("&Omega;");

	private static final SubLString $str467$_alpha_ = makeString("&alpha;");

	private static final SubLString $str469$_beta_ = makeString("&beta;");

	private static final SubLString $str471$_gamma_ = makeString("&gamma;");

	private static final SubLString $str473$_delta_ = makeString("&delta;");

	private static final SubLString $str475$_epsilon_ = makeString("&epsilon;");

	private static final SubLString $str477$_zeta_ = makeString("&zeta;");

	private static final SubLString $str479$_eta_ = makeString("&eta;");

	private static final SubLString $str481$_theta_ = makeString("&theta;");

	private static final SubLString $str483$_iota_ = makeString("&iota;");

	private static final SubLString $str485$_kappa_ = makeString("&kappa;");

	private static final SubLString $str487$_lambda_ = makeString("&lambda;");

	private static final SubLString $str489$_mu_ = makeString("&mu;");

	private static final SubLString $str491$_nu_ = makeString("&nu;");

	private static final SubLString $str493$_xi_ = makeString("&xi;");

	private static final SubLString $str495$_omicron_ = makeString("&omicron;");

	private static final SubLString $str497$_pi_ = makeString("&pi;");

	private static final SubLString $str499$_rho_ = makeString("&rho;");

	private static final SubLString $str501$_sigmaf_ = makeString("&sigmaf;");

	private static final SubLString $str503$_sigma_ = makeString("&sigma;");

	private static final SubLString $str505$_tau_ = makeString("&tau;");

	private static final SubLString $str507$_upsilon_ = makeString("&upsilon;");

	private static final SubLString $str509$_phi_ = makeString("&phi;");

	private static final SubLString $str511$_chi_ = makeString("&chi;");

	private static final SubLString $str513$_psi_ = makeString("&psi;");

	private static final SubLString $str515$_omega_ = makeString("&omega;");

	private static final SubLString $str518$_upsih_ = makeString("&upsih;");

	private static final SubLString $str520$_piv_ = makeString("&piv;");

	private static final SubLString $str522$_bull_ = makeString("&bull;");

	private static final SubLString $str524$_hellip_ = makeString("&hellip;");

	private static final SubLString $str526$_prime_ = makeString("&prime;");

	private static final SubLString $str528$_Prime_ = makeString("&Prime;");

	private static final SubLString $str530$_oline_ = makeString("&oline;");

	private static final SubLString $str532$_frasl_ = makeString("&frasl;");

	private static final SubLString $str534$_weierp_ = makeString("&weierp;");

	private static final SubLString $str536$_image_ = makeString("&image;");

	private static final SubLString $str538$_real_ = makeString("&real;");

	private static final SubLString $str540$_trade_ = makeString("&trade;");

	private static final SubLString $str542$_alefsym_ = makeString("&alefsym;");

	private static final SubLString $str544$_uarr_ = makeString("&uarr;");

	private static final SubLString $str546$_rarr_ = makeString("&rarr;");

	private static final SubLString $str548$_larr_ = makeString("&larr;");

	private static final SubLString $str552$_darr_ = makeString("&darr;");

	private static final SubLString $str554$_harr_ = makeString("&harr;");

	private static final SubLString $str556$_crarr_ = makeString("&crarr;");

	private static final SubLString $str558$_lArr_ = makeString("&lArr;");

	private static final SubLString $str560$_uArr_ = makeString("&uArr;");

	private static final SubLString $str562$_rArr_ = makeString("&rArr;");

	private static final SubLString $str564$_dArr_ = makeString("&dArr;");

	private static final SubLString $str566$_hArr_ = makeString("&hArr;");

	private static final SubLString $str568$_forall_ = makeString("&forall;");

	private static final SubLString $str570$_part_ = makeString("&part;");

	private static final SubLString $str572$_exist_ = makeString("&exist;");

	private static final SubLString $str574$_empty_ = makeString("&empty;");

	private static final SubLString $str576$_nabla_ = makeString("&nabla;");

	private static final SubLString $str578$_isin_ = makeString("&isin;");

	private static final SubLString $str580$_notin_ = makeString("&notin;");

	private static final SubLString $str582$_ni_ = makeString("&ni;");

	private static final SubLString $str584$_prod_ = makeString("&prod;");

	private static final SubLString $str586$_sum_ = makeString("&sum;");

	private static final SubLString $str588$_minus_ = makeString("&minus;");

	private static final SubLString $str590$_lowast_ = makeString("&lowast;");

	private static final SubLString $str592$_radic_ = makeString("&radic;");

	private static final SubLString $str594$_prop_ = makeString("&prop;");

	private static final SubLString $str596$_infin_ = makeString("&infin;");

	private static final SubLString $str598$_ang_ = makeString("&ang;");

	private static final SubLString $str600$_and_ = makeString("&and;");

	private static final SubLString $str602$_or_ = makeString("&or;");

	private static final SubLString $str604$_cap_ = makeString("&cap;");

	private static final SubLString $str606$_cup_ = makeString("&cup;");

	private static final SubLString $str608$_int_ = makeString("&int;");

	private static final SubLString $str610$_there4_ = makeString("&there4;");

	private static final SubLString $str612$_sim_ = makeString("&sim;");

	private static final SubLString $str614$_cong_ = makeString("&cong;");

	private static final SubLString $str616$_asymp_ = makeString("&asymp;");

	private static final SubLString $str618$_ne_ = makeString("&ne;");

	private static final SubLString $str620$_equiv_ = makeString("&equiv;");

	private static final SubLString $str622$_le_ = makeString("&le;");

	private static final SubLString $str624$_ge_ = makeString("&ge;");

	private static final SubLString $str626$_sub_ = makeString("&sub;");

	private static final SubLString $str628$_sup_ = makeString("&sup;");

	private static final SubLString $str630$_nsub_ = makeString("&nsub;");

	private static final SubLString $str632$_sube_ = makeString("&sube;");

	private static final SubLString $str634$_supe_ = makeString("&supe;");

	private static final SubLString $str636$_oplus_ = makeString("&oplus;");

	private static final SubLString $str638$_otimes_ = makeString("&otimes;");

	private static final SubLString $str640$_perp_ = makeString("&perp;");

	private static final SubLString $str642$_sdot_ = makeString("&sdot;");

	private static final SubLString $str644$_lceil_ = makeString("&lceil;");

	private static final SubLString $str646$_rceil_ = makeString("&rceil;");

	private static final SubLString $str648$_lfloor_ = makeString("&lfloor;");

	private static final SubLString $str650$_rfloor_ = makeString("&rfloor;");

	private static final SubLString $str652$_lang_ = makeString("&lang;");

	private static final SubLString $str654$_rang_ = makeString("&rang;");

	private static final SubLString $str656$_loz_ = makeString("&loz;");

	private static final SubLString $str658$_spades_ = makeString("&spades;");

	private static final SubLString $str660$_clubs_ = makeString("&clubs;");

	private static final SubLString $str662$_hearts_ = makeString("&hearts;");

	private static final SubLString $str664$_diams_ = makeString("&diams;");

	private static final SubLString $str666$__9785_ = makeString("&#9785;");

	private static final SubLSymbol HEX_CHAR_STRING_P = makeSymbol("HEX-CHAR-STRING-P");

	private static final SubLString $str668$__ = makeString("&#");

	private static final SubLString $str669$_ = makeString("_");

	private static final SubLString $str670$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

	private static final SubLString $str671$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

	private static final SubLString $$$Echo_of_ARGS = makeString("Echo of ARGS");

	private static final SubLString $$$Back = makeString("Back");

	private static final SubLSymbol HTML_ECHO_ARGS = makeSymbol("HTML-ECHO-ARGS");

	private static final SubLList $list678 = list(makeSymbol("FILENAME"));

	private static final SubLString $str680$Unable_to_open__S = makeString("Unable to open ~S");

	private static final SubLSymbol HTML_ECHO_FILE = makeSymbol("HTML-ECHO-FILE");

	private static final SubLString $str682$_ = makeString("\"");

	private static final SubLString $str683$____ = makeString("<!--");

	private static final SubLString $str684$___ = makeString("-->");

	private static final SubLString $str685$_script = makeString("<script");

	private static final SubLString $str686$__script_ = makeString("</script>");

	private static final SubLString $str687$__script = makeString("</script");

	private static final SubLList $list688 = list(CHAR_backslash);

	private static final SubLList $list689 = list(cons(makeString("&quot;"), makeString("\"")), cons(makeString("&amp;"), makeString("&")), cons(makeString("&nbsp;"), makeString(" ")));

	private static final SubLString $str690$http___ = makeString("http://");

	private static final SubLInteger $int$80 = makeInteger(80);

	private static final SubLString $str693$_style = makeString("<style");

	private static final SubLString $str694$__style_ = makeString("</style>");

	private static final SubLString $str695$_p_ = makeString("<p>");

	private static final SubLString $str696$_file_input_ = makeString("_file_input_");

	private static final SubLString $str697$this_form_ = makeString("this.form.");

	private static final SubLString $str698$_value___this_value_ = makeString(".value = this.value;");

	private static final SubLString $$$TEXT = makeString("TEXT");

	private static final SubLList $list700 = list(list(makeSymbol("HANDLER-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("TARGET")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym701$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

	private static final SubLSymbol CB_FRAME_NAME = makeSymbol("CB-FRAME-NAME");

	private static final SubLSymbol HTML_FANCY_FORM = makeSymbol("HTML-FANCY-FORM");

	private static final SubLSymbol $cyc_cgi_program$ = makeSymbol("*CYC-CGI-PROGRAM*");

	private static final SubLSymbol $html_form_method_post$ = makeSymbol("*HTML-FORM-METHOD-POST*");

	private static final SubLList $list707 = list(NIL, NIL, NIL, makeString("multipart/form-data"));

	private static final SubLSymbol HTML_HIDDEN_INPUT = makeSymbol("HTML-HIDDEN-INPUT");

	private static final SubLList $list709 = list(T);

	private static final SubLString $str710$_multipart_formdata = makeString(" multipart/formdata");

	private static final SubLString $str711$application_octet_stream = makeString("application/octet-stream");

	private static final SubLString $$$T = makeString("T");

	private static final SubLSymbol $sym713$CHAR_ = makeSymbol("CHAR=");

	private static final SubLList $list714 = list(makeSymbol("ITEM"), makeSymbol("VALUE"));

	private static final SubLString $str715$__2__0X = makeString("%~2,'0X");

	private static final SubLString $str716$____________________ = makeString("--------------------");

	private static final SubLInteger $int$200 = makeInteger(200);

	private static final SubLInteger $int$400 = makeInteger(400);

	private static final SubLInteger $int$800 = makeInteger(800);

	private static final SubLString $str730$new_login_id = makeString("new_login_id");

	private static final SubLString $str731$hashed_password = makeString("hashed_password");

	private static final SubLString $$$User_ID = makeString("User ID");

	private static final SubLString $$$Password = makeString("Password");

	private static final SubLString $str734$unhashed_password_ = makeString("unhashed_password_");

	private static final SubLString $str735$var_oldB64Pad___b64pad__b64pad___ = makeString("var oldB64Pad = b64pad; b64pad = '='; var theInput=(this.form.");

	private static final SubLString $str736$_value_this_form_ = makeString(".value+this.form.");

	private static final SubLString $str737$_value___this_form_ = makeString(".value); this.form.");

	private static final SubLString $str738$_value_b64_sha1_theInput___b64pad = makeString(".value=b64_sha1(theInput); b64pad = oldB64Pad");

	private static final SubLInteger $int$30 = makeInteger(30);

	private static final SubLString $$$Submit = makeString("Submit");

	private static final SubLString $$$HTML_Utilities_Test = makeString("HTML Utilities Test");

	private static final SubLString $$$_Category = makeString(" Category");

	private static final SubLString $$$_Suite = makeString(" Suite");

	private static final SubLString $str746$HTML_Utilities = makeString("HTML-Utilities");

	public static SubLObject html_flush() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		force_output(html_macros.$html_stream$.getDynamicValue(thread));
		return NIL;
	}

	public static SubLObject html_char(final SubLObject v_char, SubLObject n) {
		if (n == UNPROVIDED) {
			n = ONE_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject i;
		for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
			write_char(v_char, html_macros.$html_stream$.getDynamicValue(thread));
		}
		return v_char;
	}

	public static SubLObject html_string(final SubLObject string, SubLObject start, SubLObject end) {
		if (start == UNPROVIDED) {
			start = ZERO_INTEGER;
		}
		if (end == UNPROVIDED) {
			end = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == end) {
			end = length(string);
		}
		if (start.numL(end)) {
			if (((NIL != html_macros.$html_safe_print$.getDynamicValue(thread)) && (NIL != find_if(HTML_RESERVED_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != find_if(NON_ASCII_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
				SubLObject end_var_$1;
				SubLObject end_var;
				SubLObject char_num;
				SubLObject v_char;
				SubLObject subst_string;
				for (end_var = end_var_$1 = (NIL != end) ? end : length(string), char_num = NIL, char_num = start; !char_num.numGE(end_var_$1); char_num = number_utilities.f_1X(char_num)) {
					v_char = Strings.sublisp_char(string, char_num);
					subst_string = html_escape_string_for_char(v_char, html_macros.$html_safe_print$.getDynamicValue(thread));
					if (NIL != subst_string) {
						write_string(subst_string, html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
					} else {
						write_char(v_char, html_macros.$html_stream$.getDynamicValue(thread));
					}
				}
			} else {
				write_string(string, html_macros.$html_stream$.getDynamicValue(thread), start, end);
			}
		}
		return NIL;
	}

	public static SubLObject html_reserved_char_p(final SubLObject v_object) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return list_utilities.sublisp_boolean(list_utilities.alist_lookup_without_values(html_macros.$html_escapes_map$.getDynamicValue(thread), v_object, symbol_function(EQ), NIL));
	}

	public static SubLObject html_escape_string_for_char(final SubLObject v_char, final SubLObject escape_reserved_charsP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != unicode_strings.non_ascii_char_p(v_char)) {
			return html_escape_string_for_non_ascii_char(v_char);
		}
		if (NIL != escape_reserved_charsP) {
			return list_utilities.alist_lookup_without_values(html_macros.$html_escapes_map$.getDynamicValue(thread), v_char, symbol_function(EQ), NIL);
		}
		return NIL;
	}

	public static SubLObject string_has_any_escape_charsP(final SubLObject string, final SubLObject escape_reserved_charsP) {
		SubLObject result = NIL;
		final SubLObject end_var = length(string);
		if (NIL == result) {
			SubLObject end_var_$2;
			SubLObject char_num;
			SubLObject v_char;
			for (end_var_$2 = end_var, char_num = NIL, char_num = ZERO_INTEGER; (NIL == result) && (!char_num.numGE(end_var_$2)); char_num = number_utilities.f_1X(char_num)) {
				v_char = Strings.sublisp_char(string, char_num);
				if ((NIL != unicode_strings.non_ascii_char_p(v_char)) || ((NIL != escape_reserved_charsP) && (NIL != html_reserved_character_code_p(char_code(v_char))))) {
					result = T;
				}
			}
		}
		return result;
	}

	public static SubLObject html_reserved_character_code_p(final SubLObject code) {
		if (((code.eql($int$38) || code.eql($int$34)) || code.eql($int$60)) || code.eql($int$62)) {
			return T;
		}
		return NIL;
	}

	public static SubLObject html_escape_string_for_non_ascii_char(final SubLObject v_char) {
		assert NIL != unicode_strings.non_ascii_char_p(v_char) : "unicode_strings.non_ascii_char_p(v_char) " + "CommonSymbols.NIL != unicode_strings.non_ascii_char_p(v_char) " + v_char;
		final SubLObject char_code = char_code(v_char);
		return cconcatenate($str7$__x, new SubLObject[] { format_nil.format_nil_a_no_copy(number_utilities.convert_to_hexadecimal(char_code)), $str8$_ });
	}

	public static SubLObject html_escape(final SubLObject string, final SubLObject escape_reserved_charsP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
		if (NIL == string_has_any_escape_charsP(string, escape_reserved_charsP)) {
			return string;
		}
		SubLObject new_string = NIL;
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(escape_reserved_charsP, thread);
			SubLObject stream = NIL;
			try {
				stream = make_private_string_output_stream();
				final SubLObject _prev_bind_0_$3 = html_macros.$html_stream$.currentBinding(thread);
				try {
					html_macros.$html_stream$.bind(stream, thread);
					html_string(string, UNPROVIDED, UNPROVIDED);
				} finally {
					html_macros.$html_stream$.rebind(_prev_bind_0_$3, thread);
				}
				new_string = get_output_stream_string(stream);
			} finally {
				final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					close(stream, UNPROVIDED);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
				}
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		return new_string;
	}

	public static SubLObject subl_string_to_display_vector_string(final SubLObject subl_string) {
		return unicode_strings.html_escaped_to_display(html_escape(subl_string, T));
	}

	public static SubLObject html_princ(final SubLObject v_object) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != html_macros.$html_safe_print$.getDynamicValue(thread)) {
			if (v_object.isString()) {
				html_string(v_object, UNPROVIDED, UNPROVIDED);
			} else if (NIL != nart_handles.nart_p(v_object)) {
				html_princ(format_nil.format_nil_a(v_object));
			} else if (NIL != constant_p(v_object)) {
				html_markup(constants_high.constant_name(v_object));
			} else if (v_object.isChar()) {
				html_char(v_object, UNPROVIDED);
			} else if (v_object.isNumber()) {
				princ(v_object, html_macros.$html_stream$.getDynamicValue(thread));
			} else if (v_object.isKeyword()) {
				html_string(symbol_name(v_object), UNPROVIDED, UNPROVIDED);
			} else if (v_object.isSymbol()) {
				html_string(symbol_name(v_object), UNPROVIDED, UNPROVIDED);
			} else {
				html_princ(format_nil.format_nil_a(v_object));
			}

		} else {
			princ(v_object, html_macros.$html_stream$.getDynamicValue(thread));
		}
		return NIL;
	}

	public static SubLObject html_princ_strong(final SubLObject v_object) {
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_princ(v_object);
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_princ_possibly_strong(final SubLObject v_object, final SubLObject strongP) {
		if (NIL != strongP) {
			html_princ_strong(v_object);
		} else {
			html_princ(v_object);
		}
		return NIL;
	}

	public static SubLObject html_princ_non_breaking(final SubLObject v_object) {
		html_markup(html_macros.$html_no_break_head$.getGlobalValue());
		html_princ(v_object);
		html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_prin1(final SubLObject v_object) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != html_macros.$html_safe_print$.getDynamicValue(thread)) {
			if (v_object.isString()) {
				html_char(CHAR_quotation, UNPROVIDED);
				final SubLObject _prev_bind_0 = html_macros.$html_escapes_map$.currentBinding(thread);
				try {
					html_macros.$html_escapes_map$.bind(html_macros.$html_prin1_string_escapes_map$.getGlobalValue(), thread);
					html_princ(v_object);
				} finally {
					html_macros.$html_escapes_map$.rebind(_prev_bind_0, thread);
				}
				html_char(CHAR_quotation, UNPROVIDED);
			} else if (v_object.isKeyword()) {
				html_char(CHAR_colon, UNPROVIDED);
				html_princ(v_object);
			} else if (v_object.isNumber()) {
				prin1(v_object, html_macros.$html_stream$.getDynamicValue(thread));
			} else {
				html_princ(format_nil.format_nil_s(v_object));
			}

		} else {
			prin1(v_object, html_macros.$html_stream$.getDynamicValue(thread));
		}
		return NIL;
	}

	public static SubLObject html_princ_formatted_string(final SubLObject string) {
		assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
		if ((NIL == find(CHAR_newline, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find(CHAR_space, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
			html_princ(string);
		} else {
			SubLObject end_var_$5;
			SubLObject end_var;
			SubLObject char_num;
			SubLObject pcase_var;
			SubLObject character;
			for (end_var = end_var_$5 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$5); char_num = number_utilities.f_1X(char_num)) {
				character = pcase_var = Strings.sublisp_char(string, char_num);
				if (pcase_var.eql(CHAR_newline)) {
					html_newline(UNPROVIDED);
				} else if (pcase_var.eql(CHAR_space)) {
					html_glyph($NBSP, UNPROVIDED);
				} else {
					html_char(character, UNPROVIDED);
				}

			}
		}
		return NIL;
	}

	public static SubLObject html_terpri(SubLObject n) {
		if (n == UNPROVIDED) {
			n = ONE_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject i;
		for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
			terpri(html_macros.$html_stream$.getDynamicValue(thread));
		}
		return NIL;
	}

	public static SubLObject html_source_readability_terpri(SubLObject n) {
		if (n == UNPROVIDED) {
			n = ONE_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == html_macros.$within_html_pre$.getDynamicValue(thread)) && (NIL == html_macros.$suppress_html_source_readability_terpriP$.getDynamicValue(thread))) {
			html_terpri(n);
		}
		return NIL;
	}

	public static SubLObject html_tab(SubLObject n) {
		if (n == UNPROVIDED) {
			n = ONE_INTEGER;
		}
		return html_char(CHAR_tab, n);
	}

	public static SubLObject html_spaces(SubLObject n) {
		if (n == UNPROVIDED) {
			n = ONE_INTEGER;
		}
		html_indent(n);
		return NIL;
	}

	public static SubLObject html_indent(SubLObject n) {
		if (n == UNPROVIDED) {
			n = $float$0_5;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (n.numG(ZERO_INTEGER)) {
			if (NIL != html_macros.$within_html_pre$.getDynamicValue(thread)) {
				return html_char(CHAR_space, n);
			}
			SubLObject cdotimes_end_var;
			SubLObject i;
			for (cdotimes_end_var = subtract(multiply(TWO_INTEGER, n), ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
				html_glyph($NBSP, UNPROVIDED);
			}
			html_char(CHAR_space, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject html_markup(final SubLObject thing) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (thing.isString()) {
			write_string(thing, html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
		} else {
			princ(thing, html_macros.$html_stream$.getDynamicValue(thread));
		}
		return thing;
	}

	public static SubLObject html_print_doc_string(final SubLObject string) {
		html_princ(CHAR_quotation);
		html_princ_doc_string(string, UNPROVIDED);
		html_princ(CHAR_quotation);
		return string;
	}

	public static SubLObject html_princ_doc_string(final SubLObject string, SubLObject link_function) {
		if (link_function == UNPROVIDED) {
			link_function = CB_FORM;
		}
		return html_princ_cycl_string(string, link_function, NIL);
	}

	public static SubLObject hide_non_ascii_chars(final SubLObject unicode_string) {
		SubLObject result = NIL;
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			final SubLObject vector_var = unicode_strings.display_to_unicode_vector(cycl_utilities.nat_arg1(unicode_string, UNPROVIDED));
			final SubLObject backwardP_var = NIL;
			SubLObject length;
			SubLObject v_iteration;
			SubLObject element_num;
			SubLObject code;
			for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
				element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
				code = aref(vector_var, element_num);
				if (code.numL($int$128)) {
					princ(code_char(code), stream);
				} else {
					format(stream, $str14$__A_, code);
				}
			}
			result = get_output_stream_string(stream);
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
		return result;
	}

	public static SubLObject html_princ_string_with_hidden_non_ascii_chars(final SubLObject str) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject next_start_idx;
		for (SubLObject last_pipe = next_start_idx = ZERO_INTEGER, next_pipe = position(CHAR_vertical, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED); NIL != next_pipe; next_pipe = position(CHAR_vertical, str, symbol_function(EQL), symbol_function(IDENTITY), next_start_idx, UNPROVIDED)) {
			html_markup(string_utilities.substring(str, next_start_idx, next_pipe));
			last_pipe = next_start_idx = next_pipe;
			next_pipe = position(CHAR_vertical, str, symbol_function(EQL), symbol_function(IDENTITY), number_utilities.f_1X(last_pipe), UNPROVIDED);
			final SubLObject code = read_from_string_ignoring_errors(str, NIL, $EOF, number_utilities.f_1X(last_pipe), next_pipe);
			if (NIL != subl_promotions.positive_integer_p(code)) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str16$__x_x_, code);
				last_pipe = next_pipe;
				next_start_idx = number_utilities.f_1X(last_pipe);
			}
		}
		if (NIL != list_utilities.lengthG(str, next_start_idx, UNPROVIDED)) {
			html_markup(string_utilities.substring(str, next_start_idx, UNPROVIDED));
		}
		return str;
	}

	public static SubLObject html_princ_cycl_string(final SubLObject string, SubLObject link_function, SubLObject require_exactP) {
		if (link_function == UNPROVIDED) {
			link_function = CB_FORM;
		}
		if (require_exactP == UNPROVIDED) {
			require_exactP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != unicode_nauts.unicode_naut_p(string, UNPROVIDED)) {
			SubLObject html = NIL;
			SubLObject stream = NIL;
			try {
				stream = make_private_string_output_stream();
				final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
				try {
					html_macros.$html_stream$.bind(stream, thread);
					html_princ_cycl_string(hide_non_ascii_chars(string), link_function, require_exactP);
				} finally {
					html_macros.$html_stream$.rebind(_prev_bind_0, thread);
				}
				html = get_output_stream_string(stream);
			} finally {
				final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					close(stream, UNPROVIDED);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
				}
			}
			return html_princ_string_with_hidden_non_ascii_chars(html);
		}
		if ((NIL != html_cycl_string_printer.$html_large_string_limit$.getDynamicValue(thread)) && (NIL != list_utilities.lengthG(string, html_cycl_string_printer.$html_large_string_limit$.getDynamicValue(thread), UNPROVIDED))) {
			final SubLObject prefix = string_utilities.substring(string, ZERO_INTEGER, html_cycl_string_printer.$html_large_string_limit$.getDynamicValue(thread));
			final SubLObject truncated_string = cconcatenate(format_nil.format_nil_a_no_copy(prefix), new SubLObject[] { $str17$______i__, format_nil.format_nil_a_no_copy(length(string)), $str18$_characters_total___i_ });
			final SubLObject _prev_bind_0 = html_cycl_string_printer.$html_large_string_limit$.currentBinding(thread);
			try {
				html_cycl_string_printer.$html_large_string_limit$.bind(NIL, thread);
				html_princ_cycl_string(truncated_string, link_function, require_exactP);
			} finally {
				html_cycl_string_printer.$html_large_string_limit$.rebind(_prev_bind_0, thread);
			}
			return truncated_string;
		}
		return NIL != $use_new_html_princ_cycl_stringP$.getDynamicValue(thread) ? html_princ_cycl_string_new(string, link_function, require_exactP) : html_princ_cycl_string_old(string, link_function, require_exactP);
	}

	public static SubLObject html_princ_cycl_string_new(final SubLObject string, final SubLObject link_function, final SubLObject require_exactP) {
		final SubLObject printer = html_cycl_string_printer.new_html_cycl_string_printer(string, link_function, require_exactP);
		while (NIL == html_cycl_string_printer.html_cycl_string_printer_done_p(printer)) {
			html_cycl_string_printer.html_cycl_string_printer_print_next(printer);
		}
		return NIL;
	}

	public static SubLObject html_princ_cycl_string_old(final SubLObject string, final SubLObject link_function, final SubLObject require_exactP) {
		final SubLObject length = length(string);
		SubLObject last_idx = ZERO_INTEGER;
		SubLObject next_char_idx = NIL;
		SubLObject inside_cycl_tagP = NIL;
		SubLObject hash_idx = NIL;
		SubLObject colon_idx = NIL;
		SubLObject lt_idx = NIL;
		SubLObject variable_idx = NIL;
		SubLObject url_idx = NIL;
		SubLObject url_end_idx = NIL;
		hash_idx = position(CHAR_hash, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
		colon_idx = position(CHAR_colon, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
		lt_idx = position(CHAR_less, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
		variable_idx = html_cycl_string_printer.html_cycl_string_variable_index(string, last_idx);
		url_idx = ZERO_INTEGER;
		url_end_idx = ZERO_INTEGER;
		while ((((NIL != colon_idx) || (NIL != hash_idx)) || (NIL != lt_idx)) || (NIL != variable_idx)) {
			next_char_idx = apply(symbol_function(MIN), remove_if(symbol_function(NULL), list(hash_idx, colon_idx, lt_idx, variable_idx), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
			if (colon_idx.eql(next_char_idx)) {
				url_idx = web_utilities.find_url_beginning(string, length, colon_idx);
				if (NIL != url_idx) {
					url_end_idx = web_utilities.find_url_end(string, length, url_idx);
				}
				if ((NIL != url_idx) && (NIL != url_end_idx)) {
					html_string(string, last_idx, url_idx);
					html_cycl_string_printer.print_url_with_tag(subseq(string, url_idx, url_end_idx));
					last_idx = url_end_idx;
				} else {
					html_string(string, last_idx, add(ONE_INTEGER, colon_idx));
					last_idx = add(ONE_INTEGER, colon_idx);
				}
				colon_idx = position(CHAR_colon, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
				hash_idx = position(CHAR_hash, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
				variable_idx = position_if($sym21$EL_VARIABLE_CHAR_, string, symbol_function(IDENTITY), last_idx, UNPROVIDED);
			} else if (hash_idx.eql(next_char_idx)) {
				html_string(string, last_idx, hash_idx);
				final SubLObject dollar_idx = add(hash_idx, ONE_INTEGER);
				if (dollar_idx.numE(length) || (!Strings.sublisp_char(string, dollar_idx).eql(constant_reader.constant_reader_macro_char()))) {
					html_princ(CHAR_hash);
					last_idx = dollar_idx;
				} else {
					last_idx = html_cycl_string_printer.print_embedded_constant(string, length, dollar_idx, link_function, require_exactP);
				}
				hash_idx = position(CHAR_hash, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
				colon_idx = position(CHAR_colon, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
				variable_idx = position_if($sym21$EL_VARIABLE_CHAR_, string, symbol_function(IDENTITY), last_idx, UNPROVIDED);
			} else if (variable_idx.eql(next_char_idx)) {
				html_string(string, last_idx, variable_idx);
				last_idx = variable_idx;
				final SubLObject non_variable_idx = list_utilities.position_if_not($sym21$EL_VARIABLE_CHAR_, string, symbol_function(IDENTITY), variable_idx, UNPROVIDED);
				if ((((NIL != inside_cycl_tagP) && (NIL != non_variable_idx)) && non_variable_idx.numG(variable_idx)) && (NIL == alpha_char_p(Strings.sublisp_char(string, non_variable_idx)))) {
					final SubLObject variable_name = subseq(string, variable_idx, non_variable_idx);
					if (NIL != cycl_variables.valid_el_var_nameP(variable_name)) {
						html_princ(variable_name);
					} else if (NIL != string_utilities.integer_string_p(variable_name)) {
						html_princ(variable_name);
					} else {
						html_markup(html_macros.$html_bold_head$.getGlobalValue());
						html_princ(variable_name);
						html_markup(html_macros.$html_bold_tail$.getGlobalValue());
					}

					last_idx = non_variable_idx;
				}
				if (NIL != non_variable_idx) {
					variable_idx = html_cycl_string_printer.html_cycl_string_variable_index(string, non_variable_idx);
				} else {
					variable_idx = NIL;
				}
			} else if (lt_idx.eql(next_char_idx)) {
				html_string(string, last_idx, lt_idx);
				last_idx = lt_idx;
				final SubLObject gt_idx = position(CHAR_greater, string, symbol_function(EQL), symbol_function(IDENTITY), lt_idx, UNPROVIDED);
				if (NIL != gt_idx) {
					final SubLObject tag_start_idx = (NIL != charE(CHAR_slash, Strings.sublisp_char(string, add(lt_idx, ONE_INTEGER)))) ? TWO_INTEGER : ONE_INTEGER;
					final SubLObject tag = subseq(string, add(lt_idx, tag_start_idx), gt_idx);
					if (NIL != subl_promotions.memberP(Strings.string_downcase(string_utilities.trim_whitespace(tag), UNPROVIDED, UNPROVIDED), html_cycl_string_printer.$cycl_string_allowable_html_tags$.getGlobalValue(), symbol_function($sym22$STRING_), UNPROVIDED)) {
						html_markup($str23$_);
						if (TWO_INTEGER.eql(tag_start_idx)) {
							html_princ($str24$_);
						}
						html_markup(tag);
						html_markup($str25$_);
						if ((NIL != Strings.string_equal(tag, $$$code, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != Strings.string_equal(tag, $$$pre, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
							if (TWO_INTEGER.eql(tag_start_idx)) {
								inside_cycl_tagP = NIL;
							} else {
								inside_cycl_tagP = T;
							}
						}
						last_idx = add(gt_idx, ONE_INTEGER);
					}
				}
				lt_idx = position(CHAR_less, string, symbol_function(EQL), symbol_function(IDENTITY), add(lt_idx, ONE_INTEGER), UNPROVIDED);
			}

			// hash_idx = hash_idx;
			// colon_idx = colon_idx;
			// lt_idx = lt_idx;
			// variable_idx = variable_idx;
			// url_idx = url_idx;
			// url_end_idx = url_end_idx;
		}
		html_string(string, last_idx, NIL);
		return string;
	}

	public static SubLObject html_cycl_string(final SubLObject string, SubLObject link_function, SubLObject require_exactP) {
		if (link_function == UNPROVIDED) {
			link_function = HTML_LINK_TO_OWL_URI;
		}
		if (require_exactP == UNPROVIDED) {
			require_exactP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject html_string = NIL;
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
			try {
				html_macros.$html_stream$.bind(stream, thread);
				html_princ_cycl_string(string, link_function, require_exactP);
			} finally {
				html_macros.$html_stream$.rebind(_prev_bind_0, thread);
			}
			html_string = get_output_stream_string(stream);
		} finally {
			final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				close(stream, UNPROVIDED);
				restoreValuesFromVector(_values);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
			}
		}
		return html_string;
	}

	public static SubLObject opencyc_html_cycl_string(final SubLObject string) {
		return html_cycl_string(string, HTML_LINK_TO_OWL_OPENCYC_URI, UNPROVIDED);
	}

	public static SubLObject cb_form_for_cycl_string(final SubLObject v_cycl_string, SubLObject depth, SubLObject wrap_axiomsP) {
		if (depth == UNPROVIDED) {
			depth = NIL;
		}
		if (wrap_axiomsP == UNPROVIDED) {
			wrap_axiomsP = NIL;
		}
		final SubLObject cycl_list = read_from_string_ignoring_errors(v_cycl_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL != Strings.stringE(format_nil.format_nil_a(cycl_list), v_cycl_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			cb_form(cycl_list, depth, wrap_axiomsP);
		} else {
			cb_form(v_cycl_string, depth, wrap_axiomsP);
		}
		return NIL;
	}

	public static SubLObject html_stale_constant_reference(final SubLObject string, SubLObject start, SubLObject end) {
		if (start == UNPROVIDED) {
			start = ZERO_INTEGER;
		}
		if (end == UNPROVIDED) {
			end = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != $html_stale_constant_reference_color$.getDynamicValue(thread)) {
			final SubLObject color_val = $html_stale_constant_reference_color$.getDynamicValue(thread);
			html_markup(html_macros.$html_font_head$.getGlobalValue());
			if (NIL != color_val) {
				html_markup(html_macros.$html_font_color$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_color(color_val));
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_string(string, start, end);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_font_tail$.getGlobalValue());
		} else {
			html_string(string, start, end);
		}
		return NIL;
	}

	public static SubLObject html_show_string_with_invalid_constants_highlighted(final SubLObject string, SubLObject require_exactP) {
		if (require_exactP == UNPROVIDED) {
			require_exactP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = $html_stale_constant_reference_color$.currentBinding(thread);
		try {
			$html_stale_constant_reference_color$.bind($RED, thread);
			html_princ_cycl_string(string, CB_FORM, require_exactP);
		} finally {
			$html_stale_constant_reference_color$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject html_url_princ(final SubLObject v_object) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (v_object.isString()) {
			SubLObject cdotimes_end_var;
			SubLObject i;
			for (cdotimes_end_var = length(v_object), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
				html_url_princ_char(Strings.sublisp_char(v_object, i));
			}
		} else if (v_object.isSymbol()) {
			html_url_princ(symbol_name(v_object));
		} else if (v_object.isInteger()) {
			html_markup(v_object);
		} else if (NIL != nart_handles.nart_p(v_object)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str39$_A, v_object);
		} else if (NIL != constant_p(v_object)) {
			html_url_princ(constants_high.constant_name(v_object));
		} else if (v_object.isChar()) {
			html_url_princ_char(v_object);
		} else if (v_object.isCons()) {
			html_url_princ($str40$_);
			SubLObject rest = NIL;
			SubLObject item = NIL;
			rest = v_object;
			item = rest.first();
			while (rest.rest().isCons()) {
				if (!rest.eql(v_object)) {
					html_url_princ($$$_);
				}
				html_url_princ(item);
				rest = rest.rest();
				item = rest.first();
			}
			if (!rest.eql(v_object)) {
				html_url_princ($$$_);
			}
			html_url_princ(rest.first());
			if (NIL != rest.rest()) {
				html_url_princ($str42$___);
				html_url_princ(rest.rest());
			}
			html_url_princ($str43$_);
		} else {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str39$_A, v_object);
		}

		return v_object;
	}

	public static SubLObject html_url_princ_char(final SubLObject v_char) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (((NIL != alpha_char_p(v_char)) || (NIL != digit_char_p(v_char, UNPROVIDED))) || (NIL != find(v_char, $str44$___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
			html_char(v_char, UNPROVIDED);
		} else if (v_char.eql(CHAR_space) && (NIL != $html_url_princ_escape_spaces$.getDynamicValue(thread))) {
			html_char(CHAR_plus, UNPROVIDED);
		} else {
			final SubLObject code = char_code(v_char);
			format(html_macros.$html_stream$.getDynamicValue(thread), $str45$__C_C, string_utilities.hex_char(integerDivide(code, SIXTEEN_INTEGER)), string_utilities.hex_char(mod(code, SIXTEEN_INTEGER)));
		}

		return v_char;
	}

	public static SubLObject html_simple_attribute(final SubLObject attribute) {
		html_markup(cconcatenate(format_nil.format_nil_a_no_copy(attribute), new SubLObject[] { $str46$_, format_nil.format_nil_s_no_copy(attribute) }));
		return NIL;
	}

	public static SubLObject html_simple_quoted_attribute(final SubLObject attribute, final SubLObject value) {
		html_markup(attribute);
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(value);
		html_char(CHAR_quotation, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_color(SubLObject color) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (color.isString()) {
			return color;
		}
		color = assoc(color, html_macros.$html_color_map$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
		if (color.isString()) {
			return color;
		}
		return $str47$;
	}

	public static SubLObject html_style_background_color(final SubLObject color) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject color_string = html_color(color);
		html_princ($html_style_background$.getDynamicValue(thread));
		html_princ(color_string);
		html_princ($str8$_);
		return NIL;
	}

	public static SubLObject html_align(SubLObject align) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (align.isString()) {
			return align;
		}
		align = assoc(align, $html_align_map$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
		if (align.isString()) {
			return align;
		}
		return $str47$;
	}

	public static SubLObject html_copyright_notice() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_hr(UNPROVIDED, UNPROVIDED);
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		html_markup(html_macros.$html_attribute_class$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($$$copyright);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_italic_head$.getGlobalValue());
			html_copyright_text();
			html_markup(html_macros.$html_italic_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_copyright_text() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str54$Copyright__copy__1995____A_, numeric_date_utilities.this_year());
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($cycorp_homepage_url$.getDynamicValue(thread));
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ($cycorp_homepage_text$.getDynamicValue(thread));
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		html_princ($str55$___All_rights_reserved___);
		html_princ($proprietarity_message$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_mailto_url(final SubLObject address) {
		assert NIL != stringp(address) : "Types.stringp(address) " + "CommonSymbols.NIL != Types.stringp(address) " + address;
		html_markup(html_macros.$html_protocol_mailto$.getGlobalValue());
		html_princ(address);
		return NIL;
	}

	public static SubLObject html_file_url(final SubLObject filename) {
		assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
		html_markup(html_macros.$html_protocol_file$.getGlobalValue());
		html_princ(filename);
		return NIL;
	}

	public static SubLObject html_refresh(final SubLObject seconds, SubLObject url) {
		if (url == UNPROVIDED) {
			url = NIL;
		}
		if (seconds.isInteger()) {
			final SubLObject content = cconcatenate(format_nil.format_nil_d_no_copy(seconds), format_nil.format_nil_a_no_copy(NIL != url ? cconcatenate($str70$_URL_, format_nil.format_nil_a_no_copy(url)) : $str47$));
			html_source_readability_terpri(UNPROVIDED);
			html_markup(html_macros.$html_meta_head$.getGlobalValue());
			html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($$$Refresh);
			html_char(CHAR_quotation, UNPROVIDED);
			if (NIL != content) {
				html_markup(html_macros.$html_meta_content$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(content);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject html_meta_utf_8_content_type() {
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_meta_head$.getGlobalValue());
		html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str72$Content_type);
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_meta_content$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str73$text_html__charset_UTF_8);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_meta_expires(SubLObject seconds, SubLObject minutes, SubLObject hours) {
		if (seconds == UNPROVIDED) {
			seconds = ZERO_INTEGER;
		}
		if (minutes == UNPROVIDED) {
			minutes = ZERO_INTEGER;
		}
		if (hours == UNPROVIDED) {
			hours = ZERO_INTEGER;
		}
		final SubLObject time = numeric_date_utilities.universal_time_from_now(seconds, minutes, hours);
		final SubLObject date_string = web_utilities.http_date_string(time);
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_meta_head$.getGlobalValue());
		html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($$$Expires);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != date_string) {
			html_markup(html_macros.$html_meta_content$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(date_string);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_meta_last_modified(SubLObject time) {
		if (time == UNPROVIDED) {
			time = get_universal_time();
		}
		final SubLObject date_string = web_utilities.http_date_string(time);
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_meta_head$.getGlobalValue());
		html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str75$Last_Modified);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != date_string) {
			html_markup(html_macros.$html_meta_content$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(date_string);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_meta_dont_cache() {
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_meta_head$.getGlobalValue());
		html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str76$Cache_Control);
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_meta_content$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str77$no_cache);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_webpage_expires(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list78);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$6 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list78);
			current_$6 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list78);
			if (NIL == member(current_$6, $list79, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$6 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list78);
		}
		final SubLObject hh_tail = property_list_member($HH, current);
		final SubLObject hh = (NIL != hh_tail) ? cadr(hh_tail) : ZERO_INTEGER;
		final SubLObject mm_tail = property_list_member($MM, current);
		final SubLObject mm = (NIL != mm_tail) ? cadr(mm_tail) : ZERO_INTEGER;
		final SubLObject ss_tail = property_list_member($SS, current);
		final SubLObject ss = (NIL != ss_tail) ? cadr(ss_tail) : ZERO_INTEGER;
		current = temp;
		if (NIL == current) {
			defmacro_obsolete_warning(HTML_WEBPAGE_EXPIRES, $list85);
			return list(HTML_META_EXPIRES, ss, mm, hh);
		}
		cdestructuring_bind_error(datum, $list78);
		return NIL;
	}

	public static SubLObject html_webpage_last_modified(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		final SubLObject univ_time = (current.isCons()) ? current.first() : get_universal_time();
		destructuring_bind_must_listp(current, datum, $list87);
		current = current.rest();
		if (NIL == current) {
			defmacro_obsolete_warning(HTML_WEBPAGE_LAST_MODIFIED, $list89);
			return list(HTML_META_LAST_MODIFIED, univ_time);
		}
		cdestructuring_bind_error(datum, $list87);
		return NIL;
	}

	public static SubLObject html_dont_cache_webpage(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		if (NIL != datum) {
			cdestructuring_bind_error(datum, NIL);
		}
		defmacro_obsolete_warning(HTML_DONT_CACHE_WEBPAGE, $list92);
		return $list92;
	}

	public static SubLObject html_meta_no_robots() {
		return html_meta_robot_instructions(NIL, NIL);
	}

	public static SubLObject html_meta_robot_instructions(SubLObject index, SubLObject follow) {
		if (index == UNPROVIDED) {
			index = NIL;
		}
		if (follow == UNPROVIDED) {
			follow = NIL;
		}
		final SubLObject robot_instructions = html_meta_select_robot_instructions(index, follow);
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_meta_head$.getGlobalValue());
		html_markup(html_macros.$html_meta_name$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($$$ROBOTS);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != robot_instructions) {
			html_markup(html_macros.$html_meta_content$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(robot_instructions);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_meta_select_robot_instructions(final SubLObject index, final SubLObject follow) {
		if ((NIL == index) && (NIL == follow)) {
			return $str94$NOINDEX__NOFOLLOW;
		}
		if ((NIL != index) && (NIL != follow)) {
			return $str95$INDEX__FOLLOW;
		}
		if ((NIL == index) && (NIL != follow)) {
			return $str96$NOINDEX__FOLLOW;
		}
		if ((NIL != index) && (NIL == follow)) {
			return $str97$INDEX__NOFOLLOW;
		}
		Errors.error($str98$Invalid_HTML_meta_select_robot_in);
		return NIL;
	}

	public static SubLObject html_hr(SubLObject size, SubLObject width) {
		if (size == UNPROVIDED) {
			size = NIL;
		}
		if (width == UNPROVIDED) {
			width = NIL;
		}
		html_markup(html_macros.$html_hr_head$.getGlobalValue());
		if (NIL != size) {
			html_markup(html_macros.$html_hr_size$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(size);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != width) {
			html_markup(html_macros.$html_hr_width$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(width);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_line_break(SubLObject clear) {
		if (clear == UNPROVIDED) {
			clear = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != clear) {
			html_markup(html_macros.$html_line_break$.getGlobalValue());
			html_markup(html_macros.$html_line_break_clear$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(clear);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_line_break_tail$.getGlobalValue());
		} else {
			html_markup(html_macros.$html_line_break_atomic$.getGlobalValue());
		}
		if (NIL == html_macros.$within_html_pre$.getDynamicValue(thread)) {
			html_terpri(UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject html_br() {
		return html_line_break(UNPROVIDED);
	}

	public static SubLObject html_newline(SubLObject n) {
		if (n == UNPROVIDED) {
			n = ONE_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject i;
		for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
			if (NIL != html_macros.$within_html_pre$.getDynamicValue(thread)) {
				html_terpri(UNPROVIDED);
			} else {
				html_br();
			}
		}
		return NIL;
	}

	public static SubLObject html_checkbox_input(final SubLObject name, SubLObject value, SubLObject checkedP, SubLObject script, SubLObject onclick, SubLObject disabledP) {
		if (value == UNPROVIDED) {
			value = NIL;
		}
		if (checkedP == UNPROVIDED) {
			checkedP = NIL;
		}
		if (script == UNPROVIDED) {
			script = NIL;
		}
		if (onclick == UNPROVIDED) {
			onclick = NIL;
		}
		if (disabledP == UNPROVIDED) {
			disabledP = html_macros.$html_input_disabledP$.getDynamicValue();
		}
		html_markup(html_macros.$html_input_head$.getGlobalValue());
		html_markup(html_macros.$html_input_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_input_checkbox$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != name) {
			html_markup(html_macros.$html_input_name$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(name);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != value) {
			html_markup(html_macros.$html_input_value$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_princ(value);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != checkedP) {
			html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
		}
		if (NIL != disabledP) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		if (NIL != script) {
			html_char(CHAR_space, UNPROVIDED);
			html_markup(script);
		}
		if (NIL != onclick) {
			html_markup(html_macros.$html_select_onchange$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(onclick);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_hidden_input(final SubLObject name, final SubLObject value, SubLObject id) {
		if (id == UNPROVIDED) {
			id = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_input_head$.getGlobalValue());
		html_markup(html_macros.$html_input_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_input_hidden$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != name) {
			html_markup(html_macros.$html_input_name$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(name);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != value) {
			html_markup(html_macros.$html_input_value$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_princ(value);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_image_input(final SubLObject name, final SubLObject image_url, SubLObject align, SubLObject border) {
		if (align == UNPROVIDED) {
			align = NIL;
		}
		if (border == UNPROVIDED) {
			border = ZERO_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_input_head$.getGlobalValue());
		html_markup(html_macros.$html_input_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_input_image$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != name) {
			html_markup(html_macros.$html_input_name$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(name);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != image_url) {
			html_markup(html_macros.$html_input_src$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(image_url);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != align) {
			html_markup(html_macros.$html_input_align$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_align(align));
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != border) {
			html_markup(html_macros.$html_input_border$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(border);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_password_input(final SubLObject name, SubLObject v_default, SubLObject size) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		if (size == UNPROVIDED) {
			size = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (v_default.equalp($str47$)) {
			v_default = NIL;
		}
		html_markup(html_macros.$html_input_head$.getGlobalValue());
		html_markup(html_macros.$html_input_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_input_password$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != name) {
			html_markup(html_macros.$html_input_name$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(name);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != v_default) {
			html_markup(html_macros.$html_input_value$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_princ(v_default);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != size) {
			html_markup(html_macros.$html_input_size$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(size);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_radio_input(final SubLObject name, SubLObject value, SubLObject checkedP) {
		return html_radio_input(name, value, checkedP, NIL);
	}

	public static SubLObject html_radio_input(final SubLObject name, SubLObject value, SubLObject checkedP, SubLObject id) {
		if (value == UNPROVIDED) {
			value = NIL;
		}
		if (checkedP == UNPROVIDED) {
			checkedP = NIL;
		}
		if (id == UNPROVIDED) {
			id = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_input_head$.getGlobalValue());
		html_markup(html_macros.$html_input_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_input_radio$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != name) {
			html_markup(html_macros.$html_input_name$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(name);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != value) {
			html_markup(html_macros.$html_input_value$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_princ(value);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != checkedP) {
			html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
		}
		if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_reset_input(SubLObject label) {
		if (label == UNPROVIDED) {
			label = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_input_head$.getGlobalValue());
		html_markup(html_macros.$html_input_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_input_reset$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_input_value$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_princ($$$Reset_All_Fields);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_submit_input(SubLObject label, SubLObject name, SubLObject script) {
		if (label == UNPROVIDED) {
			label = NIL;
		}
		if (name == UNPROVIDED) {
			name = NIL;
		}
		if (script == UNPROVIDED) {
			script = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_input_head$.getGlobalValue());
		html_markup(html_macros.$html_input_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_input_submit$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != name) {
			html_markup(html_macros.$html_input_name$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(name);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != label) {
			html_markup(html_macros.$html_input_value$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_princ(label);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != script) {
			html_char(CHAR_space, UNPROVIDED);
			html_markup(script);
		}
		if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_text_input(final SubLObject name, SubLObject v_default, SubLObject size) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		if (size == UNPROVIDED) {
			size = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (v_default.equalp($str47$)) {
			v_default = NIL;
		}
		html_markup(html_macros.$html_input_head$.getGlobalValue());
		html_markup(html_macros.$html_input_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_input_text$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != name) {
			html_markup(html_macros.$html_input_name$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(name);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != v_default) {
			html_markup(html_macros.$html_input_value$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_princ(v_default);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != size) {
			html_markup(html_macros.$html_input_size$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(size);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_scripted_text_input(final SubLObject name, final SubLObject script, SubLObject v_default, SubLObject size) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		if (size == UNPROVIDED) {
			size = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (v_default.equalp($str47$)) {
			v_default = NIL;
		}
		html_markup(html_macros.$html_input_head$.getGlobalValue());
		html_markup(html_macros.$html_input_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_input_text$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != name) {
			html_markup(html_macros.$html_input_name$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(name);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != v_default) {
			html_markup(html_macros.$html_input_value$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_princ(v_default);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != size) {
			html_markup(html_macros.$html_input_size$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(size);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != script) {
			html_char(CHAR_space, UNPROVIDED);
			html_markup(script);
		}
		if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_disabled_text_input(final SubLObject name, SubLObject v_default, SubLObject size) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		if (size == UNPROVIDED) {
			size = NIL;
		}
		if (v_default.equalp($str47$)) {
			v_default = NIL;
		}
		html_markup(html_macros.$html_input_head$.getGlobalValue());
		html_markup(html_macros.$html_input_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_input_text$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != name) {
			html_markup(html_macros.$html_input_name$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(name);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != v_default) {
			html_markup(html_macros.$html_input_value$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_princ(v_default);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		if (NIL != size) {
			html_markup(html_macros.$html_input_size$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(size);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_format_input(final SubLObject v_default, final SubLObject size, final SubLObject name_format_string, SubLObject arg_1, SubLObject arg_2, SubLObject arg_3, SubLObject arg_4) {
		if (arg_1 == UNPROVIDED) {
			arg_1 = NIL;
		}
		if (arg_2 == UNPROVIDED) {
			arg_2 = NIL;
		}
		if (arg_3 == UNPROVIDED) {
			arg_3 = NIL;
		}
		if (arg_4 == UNPROVIDED) {
			arg_4 = NIL;
		}
		final SubLObject name = format(NIL, name_format_string, new SubLObject[] { arg_1, arg_2, arg_3, arg_4 });
		return html_text_input(name, v_default, size);
	}

	public static SubLObject html_autocomplete_text_input(final SubLObject name, SubLObject v_default, SubLObject size, SubLObject cycl_type, SubLObject style) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		if (size == UNPROVIDED) {
			size = NIL;
		}
		if (cycl_type == UNPROVIDED) {
			cycl_type = NIL;
		}
		if (style == UNPROVIDED) {
			style = $str47$;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != html_macros.next_html_id_definedP(UNPROVIDED)) {
			final SubLObject id_num = html_macros.next_html_id(UNPROVIDED);
			final SubLObject autocomplete_id = cconcatenate($str100$autocomplete_, format_nil.format_nil_a_no_copy(id_num));
			final SubLObject input_id = cconcatenate($str101$input_, format_nil.format_nil_a_no_copy(id_num));
			final SubLObject result_id = cconcatenate($str102$autocomplete_results_, format_nil.format_nil_a_no_copy(id_num));
			final SubLObject complete_style = cconcatenate($str103$position_static__width_auto_, format_nil.format_nil_a_no_copy(style));
			html_markup(html_macros.$html_span_head$.getGlobalValue());
			if (NIL != autocomplete_id) {
				html_markup(html_macros.$html_attribute_id$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(autocomplete_id);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_markup(html_macros.$html_attribute_class$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($str104$yui_ac);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_input_head$.getGlobalValue());
				html_markup(html_macros.$html_input_type$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_input_text$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_input_style$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(complete_style);
				html_char(CHAR_quotation, UNPROVIDED);
				if (NIL != input_id) {
					html_markup(html_macros.$html_attribute_id$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(input_id);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				if (NIL != name) {
					html_markup(html_macros.$html_input_name$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(name);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				if (NIL != v_default) {
					html_markup(html_macros.$html_input_value$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_princ(v_default);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				if (NIL != size) {
					html_markup(html_macros.$html_input_size$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(size);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_markup(html_macros.$html_attribute_class$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($str105$yui_ac_input);
				html_char(CHAR_quotation, UNPROVIDED);
				if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
					html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
				}
				html_char(CHAR_greater, UNPROVIDED);
				html_markup(html_macros.$html_div_head$.getGlobalValue());
				if (NIL != result_id) {
					html_markup(html_macros.$html_attribute_id$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(result_id);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_markup(html_macros.$html_attribute_class$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($str106$yui_ac_container);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
				}
				html_markup(html_macros.$html_div_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_span_tail$.getGlobalValue());
			html_complete.html_print_js_autocomplete_setup_int(input_id, result_id, TWENTY_INTEGER, THREE_INTEGER, NIL, cycl_type);
		} else {
			html_text_input(name, v_default, size);
		}
		return NIL;
	}

	public static SubLObject html_image_multi_submit(final SubLObject template, SubLObject align) {
		if (align == UNPROVIDED) {
			align = NIL;
		}
		SubLObject src = NIL;
		SubLObject name = NIL;
		SubLObject v_default = NIL;
		SubLObject map = NIL;
		destructuring_bind_must_consp(template, template, $list107);
		src = template.first();
		SubLObject current = template.rest();
		destructuring_bind_must_consp(current, template, $list107);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, template, $list107);
		v_default = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, template, $list107);
		map = current.first();
		current = current.rest();
		if (NIL == current) {
			return html_image_input(name, src, align, UNPROVIDED);
		}
		cdestructuring_bind_error(template, $list107);
		return NIL;
	}

	public static SubLObject html_extract_multi_submit_input(final SubLObject template, final SubLObject args) {
		SubLObject src = NIL;
		SubLObject name = NIL;
		SubLObject v_default = NIL;
		SubLObject map_items = NIL;
		destructuring_bind_must_consp(template, template, $list108);
		src = template.first();
		SubLObject current = template.rest();
		destructuring_bind_must_consp(current, template, $list108);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, template, $list108);
		v_default = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, template, $list108);
		map_items = current.first();
		current = current.rest();
		if (NIL == current) {
			SubLObject x_start = html_extract_multi_submit_input_internal(name, $str109$_x, args);
			SubLObject y_start = html_extract_multi_submit_input_internal(name, $str110$_y, args);
			if (x_start.isString() && y_start.isString()) {
				x_start = read_from_string_ignoring_errors(x_start, NIL, NIL, UNPROVIDED, UNPROVIDED);
				y_start = read_from_string_ignoring_errors(y_start, NIL, NIL, UNPROVIDED, UNPROVIDED);
				if (x_start.isInteger() && y_start.isInteger()) {
					SubLObject cdolist_list_var = map_items;
					SubLObject map_item = NIL;
					map_item = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						SubLObject current_$9;
						final SubLObject datum_$8 = current_$9 = map_item;
						SubLObject x_range = NIL;
						SubLObject y_range = NIL;
						SubLObject value = NIL;
						destructuring_bind_must_consp(current_$9, datum_$8, $list111);
						x_range = current_$9.first();
						current_$9 = current_$9.rest();
						destructuring_bind_must_consp(current_$9, datum_$8, $list111);
						y_range = current_$9.first();
						current_$9 = current_$9.rest();
						destructuring_bind_must_consp(current_$9, datum_$8, $list111);
						value = current_$9.first();
						current_$9 = current_$9.rest();
						if (NIL == current_$9) {
							if (((NIL == x_range) || (x_start.numGE(x_range.first()) && x_start.numLE(second(x_range)))) && ((NIL == y_range) || (y_start.numGE(y_range.first()) && y_start.numLE(second(y_range))))) {
								return value;
							}
						} else {
							cdestructuring_bind_error(datum_$8, $list111);
						}
						cdolist_list_var = cdolist_list_var.rest();
						map_item = cdolist_list_var.first();
					}
				}
			}
			return v_default;
		}
		cdestructuring_bind_error(template, $list108);
		return NIL;
	}

	public static SubLObject html_extract_multi_submit_input_internal(final SubLObject name, final SubLObject suffix, final SubLObject args) {
		final SubLObject name_length = length(name);
		final SubLObject suffix_length = length(suffix);
		SubLObject list;
		SubLObject arg;
		SubLObject current;
		SubLObject datum;
		SubLObject arg_name;
		SubLObject value;
		SubLObject arg_name_length;
		for (list = NIL, list = args; NIL != list; list = list.rest()) {
			arg = list.first();
			if (arg.isCons()) {
				datum = current = arg;
				arg_name = NIL;
				value = NIL;
				destructuring_bind_must_consp(current, datum, $list112);
				arg_name = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list112);
				value = current.first();
				current = current.rest();
				if (NIL == current) {
					arg_name_length = length(arg_name);
					if ((arg_name_length.numE(add(length(name), length(suffix))) && (NIL != Strings.string_equal(name, arg_name, ZERO_INTEGER, name_length, ZERO_INTEGER, name_length))) && (NIL != Strings.string_equal(suffix, arg_name, ZERO_INTEGER, suffix_length, name_length, arg_name_length))) {
						return value;
					}
				} else {
					cdestructuring_bind_error(datum, $list112);
				}
			}
		}
		return NIL;
	}

	public static SubLObject html_indent_table_internal(final SubLObject indent_width) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_table_row_head$.getGlobalValue());
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			SubLObject i;
			SubLObject _prev_bind_0_$10;
			SubLObject _prev_bind_0_$11;
			for (i = NIL, i = ZERO_INTEGER; i.numL(html_macros.$html_indent_table_max$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				_prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_macros.verify_not_within_html_pre();
					html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
					_prev_bind_0_$11 = html_macros.$within_html_pre$.currentBinding(thread);
					try {
						html_macros.$within_html_pre$.bind(T, thread);
						html_indent(indent_width);
					} finally {
						html_macros.$within_html_pre$.rebind(_prev_bind_0_$11, thread);
					}
					html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_indent_row_internal(final SubLObject indent_amount) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (indent_amount.numG(ZERO_INTEGER)) {
			html_markup(html_macros.$html_table_data_head$.getGlobalValue());
			if (NIL != indent_amount) {
				html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(indent_amount);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
		}
		return NIL;
	}

	public static SubLObject html_target_definition(final SubLObject name) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		if (NIL != name) {
			html_markup(html_macros.$html_anchor_name$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(name);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		return name;
	}

	public static SubLObject html_basefont(final SubLObject size) {
		if (NIL != size) {
			html_markup(html_macros.$html_basefont_head$.getGlobalValue());
			html_markup(html_macros.$html_basefont_size$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(size);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject html_word_break() {
		html_markup(html_macros.$html_word_break$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_print_lexicon_entry(final SubLObject fort) {
		cb_link($LEXICON, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_print_form(final SubLObject form, SubLObject depth, SubLObject wrap_axiomsP) {
		if (depth == UNPROVIDED) {
			depth = ZERO_INTEGER;
		}
		if (wrap_axiomsP == UNPROVIDED) {
			wrap_axiomsP = NIL;
		}
		final SubLObject nautP = term.hl_ground_nautP(form);
		final SubLObject atomic = (NIL != nautP) ? narts_high.find_nart(form) : NIL;
		if ((NIL != nautP) && (NIL != atomic)) {
			cb_form(atomic, depth, wrap_axiomsP);
		} else {
			cb_form(form, depth, wrap_axiomsP);
		}
		return NIL;
	}

	public static SubLObject html_basic_image(final SubLObject name, SubLObject alt, SubLObject align, SubLObject border) {
		if (alt == UNPROVIDED) {
			alt = name;
		}
		if (align == UNPROVIDED) {
			align = NIL;
		}
		if (border == UNPROVIDED) {
			border = ZERO_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_image_head$.getGlobalValue());
		html_markup(html_macros.$html_image_src$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(system_parameters.$html_image_directory$.getDynamicValue(thread));
		html_markup(name);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != alt) {
			html_markup(html_macros.$html_image_alt$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(alt);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != align) {
			html_markup(html_macros.$html_image_align$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_align(align));
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != border) {
			html_markup(html_macros.$html_image_border$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(border);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_image_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_table_row_list(final SubLObject items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_table_row_head$.getGlobalValue());
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			SubLObject cdolist_list_var = items;
			SubLObject item = NIL;
			item = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_princ(item);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				cdolist_list_var = cdolist_list_var.rest();
				item = cdolist_list_var.first();
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_table_heading_list(final SubLObject items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_table_row_head$.getGlobalValue());
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			SubLObject cdolist_list_var = items;
			SubLObject item = NIL;
			item = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				html_markup(html_macros.$html_table_header_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_princ(item);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
				}
				html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
				cdolist_list_var = cdolist_list_var.rest();
				item = cdolist_list_var.first();
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_percent_progress_bar(final SubLObject sofar, final SubLObject total, SubLObject granularity, SubLObject progress_color, SubLObject remaining_color) {
		if (granularity == UNPROVIDED) {
			granularity = $int$100;
		}
		if (progress_color == UNPROVIDED) {
			progress_color = html_macros.$html_color_sat_green$.getGlobalValue();
		}
		if (remaining_color == UNPROVIDED) {
			remaining_color = html_macros.$html_color_sat_red$.getGlobalValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != integerp(sofar) : "Types.integerp(sofar) " + "CommonSymbols.NIL != Types.integerp(sofar) " + sofar;
		assert NIL != integerp(total) : "Types.integerp(total) " + "CommonSymbols.NIL != Types.integerp(total) " + total;
		assert NIL != integerp(granularity) : "Types.integerp(granularity) " + "CommonSymbols.NIL != Types.integerp(granularity) " + granularity;
		final SubLObject progress_width = truncate(multiply(sofar, granularity), total);
		final SubLObject remaining_width = subtract(granularity, progress_width);
		html_markup(html_macros.$html_table_head$.getGlobalValue());
		html_markup(html_macros.$html_table_border$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(ONE_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(ZERO_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(ZERO_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (!ZERO_INTEGER.numE(progress_width)) {
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				if (NIL != progress_color) {
					html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(progress_color);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					SubLObject i;
					for (i = NIL, i = ZERO_INTEGER; i.numL(progress_width); i = add(i, ONE_INTEGER)) {
						html_glyph($NBSP, UNPROVIDED);
					}
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			}
			if (!ZERO_INTEGER.numE(remaining_width)) {
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				if (NIL != remaining_color) {
					html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(remaining_color);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					SubLObject i;
					for (i = NIL, i = ZERO_INTEGER; i.numL(remaining_width); i = add(i, ONE_INTEGER)) {
						html_glyph($NBSP, UNPROVIDED);
					}
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_fancy_percent_progress_bar(final SubLObject macroform, final SubLObject environment) {
		final SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$16 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list116);
			current_$16 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list116);
			if (NIL == member(current_$16, $list117, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$16 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list116);
		}
		final SubLObject sofar_tail = property_list_member($SOFAR, current);
		final SubLObject sofar = (NIL != sofar_tail) ? cadr(sofar_tail) : NIL;
		final SubLObject total_tail = property_list_member($TOTAL, current);
		final SubLObject total = (NIL != total_tail) ? cadr(total_tail) : NIL;
		final SubLObject width_tail = property_list_member($WIDTH, current);
		final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
		final SubLObject height_tail = property_list_member($HEIGHT, current);
		final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : TWO_INTEGER;
		final SubLObject progress_color_tail = property_list_member($PROGRESS_COLOR, current);
		final SubLObject progress_color = (NIL != progress_color_tail) ? cadr(progress_color_tail) : $html_color_sat_green$;
		final SubLObject remaining_color_tail = property_list_member($REMAINING_COLOR, current);
		final SubLObject remaining_color = (NIL != remaining_color_tail) ? cadr(remaining_color_tail) : $html_color_sat_red$;
		final SubLObject border_tail = property_list_member($BORDER, current);
		final SubLObject border = (NIL != border_tail) ? cadr(border_tail) : ZERO_INTEGER;
		final SubLObject width2 = $sym127$WIDTH1;
		final SubLObject width3 = $sym128$WIDTH2;
		return list(HTML_FANCY_TABLE, append(NIL != width ? list($WIDTH, width) : NIL, NIL != border ? list($BORDER, border) : NIL, $list130),
				list(CMULTIPLE_VALUE_BIND, list(width2, width3), list(HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS, sofar, total, width), list(HTML_FANCY_TABLE_ROW, append(NIL != height ? list($HEIGHT, height) : NIL, NIL), list(HTML_FANCY_TABLE_DATA, list($WIDTH, width2, $BGCOLOR, progress_color)), list(HTML_FANCY_TABLE_DATA, list($WIDTH, width3, $BGCOLOR, remaining_color)))));
	}

	public static SubLObject html_fancy_percent_progress_bar_widths(final SubLObject sofar, final SubLObject total, final SubLObject width) {
		assert NIL != numberp(sofar) : "Types.numberp(sofar) " + "CommonSymbols.NIL != Types.numberp(sofar) " + sofar;
		assert NIL != numberp(total) : "Types.numberp(total) " + "CommonSymbols.NIL != Types.numberp(total) " + total;
		if (sofar.numG(total)) {
			return html_fancy_percent_progress_bar_widths(total, total, width);
		}
		if (sofar.numL(ZERO_INTEGER)) {
			return html_fancy_percent_progress_bar_widths(ZERO_INTEGER, total, width);
		}
		if (total.numLE(ZERO_INTEGER)) {
			return html_fancy_percent_progress_bar_widths(sofar, ONE_INTEGER, width);
		}
		if (width.isInteger() && width.isPositive()) {
			SubLObject sofar_width = truncate(divide(multiply(sofar, width), total), UNPROVIDED);
			if (sofar.isPositive()) {
				sofar_width = max(sofar_width, ONE_INTEGER);
			}
			final SubLObject total_width = subtract(width, sofar_width);
			return values(sofar_width, total_width);
		}
		return html_fancy_percent_progress_bar_widths(sofar, total, $int$1000);
	}

	public static SubLObject html_progress_section(SubLObject message, SubLObject sofar, SubLObject total, SubLObject run_time, SubLObject finish_time) {
		if (message == UNPROVIDED) {
			message = NIL;
		}
		if (sofar == UNPROVIDED) {
			sofar = NIL;
		}
		if (total == UNPROVIDED) {
			total = NIL;
		}
		if (run_time == UNPROVIDED) {
			run_time = NIL;
		}
		if (finish_time == UNPROVIDED) {
			finish_time = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != message) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_strong_head$.getGlobalValue());
			html_princ(message);
			html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		}
		if ((NIL != run_time) || (NIL != sofar)) {
			html_newline(UNPROVIDED);
			html_markup(html_macros.$html_table_head$.getGlobalValue());
			html_markup(html_macros.$html_table_border$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				if (NIL != run_time) {
					html_markup(html_macros.$html_table_row_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($RIGHT));
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($TOP));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							if (NIL != finish_time) {
								html_princ($str141$Run_Time__);
							} else {
								html_princ($str142$Elapsed_Time__);
							}
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_indent(TWO_INTEGER);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($LEFT));
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($TOP));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_princ(numeric_date_utilities.elapsed_seconds_string(run_time));
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
					}
					html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
				if (NIL != sofar) {
					html_markup(html_macros.$html_table_row_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($RIGHT));
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($TOP));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_princ($str144$Current_Total__);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_indent(TWO_INTEGER);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($LEFT));
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($TOP));
						html_char(CHAR_quotation, UNPROVIDED);
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_princ(sofar);
							if (NIL != total) {
								html_princ($$$_of_);
								html_princ(total);
							}
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
					}
					html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_table_tail$.getGlobalValue());
		}
		if ((NIL != sofar) && (NIL != total)) {
			html_markup(html_macros.$html_table_head$.getGlobalValue());
			html_markup(html_macros.$html_table_border$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_table_row_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					html_markup(html_macros.$html_table_data_align$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($RIGHT));
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($CENTER));
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						final SubLObject percent = number_utilities.integer_percent(sofar, total, UNPROVIDED);
						format(html_macros.$html_stream$.getDynamicValue(thread), $str147$_D_, percent);
						html_indent(TWO_INTEGER);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
					}
					html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					html_markup(html_macros.$html_table_data_align$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($LEFT));
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($CENTER));
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_percent_progress_bar(sofar, total, $int$100, UNPROVIDED, UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
					}
					html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
				}
				html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_table_tail$.getGlobalValue());
		}
		return NIL;
	}

	public static SubLObject html_horizontal_bar_graph(final SubLObject label_value_pairs, SubLObject outerborder, SubLObject smallerbars, SubLObject color1, SubLObject color2) {
		if (outerborder == UNPROVIDED) {
			outerborder = TWO_INTEGER;
		}
		if (smallerbars == UNPROVIDED) {
			smallerbars = NIL;
		}
		if (color1 == UNPROVIDED) {
			color1 = html_macros.$html_color_lighter_blue$.getGlobalValue();
		}
		if (color2 == UNPROVIDED) {
			color2 = html_macros.$html_color_lighter_green$.getGlobalValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == label_value_pairs) {
			html_markup(html_macros.$html_strong_head$.getGlobalValue());
			html_princ($str148$_No_data_to_graph_);
			html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			return NIL;
		}
		SubLObject v_switch = NIL;
		SubLObject newpairs = NIL;
		SubLObject adjustfactor = ONE_INTEGER;
		adjustfactor = divide($int$100, max(ONE_INTEGER, apply(symbol_function(MAX), Mapping.mapcar(symbol_function(SECOND), label_value_pairs))));
		SubLObject cdolist_list_var = label_value_pairs;
		SubLObject pair = NIL;
		pair = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			newpairs = cons(list(pair.first(), round(multiply(second(pair), adjustfactor), UNPROVIDED), second(pair)), newpairs);
			cdolist_list_var = cdolist_list_var.rest();
			pair = cdolist_list_var.first();
		}
		final SubLObject workingpairs = nreverse(newpairs);
		html_markup(html_macros.$html_table_head$.getGlobalValue());
		if (NIL != outerborder) {
			html_markup(html_macros.$html_table_border$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(outerborder);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(FOUR_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(FOUR_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_table_width$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str151$100_);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_table_head$.getGlobalValue());
					html_markup(html_macros.$html_table_border$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(ZERO_INTEGER);
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(ZERO_INTEGER);
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(ZERO_INTEGER);
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_width$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str151$100_);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						SubLObject cdolist_list_var2 = workingpairs;
						SubLObject pair2 = NIL;
						pair2 = cdolist_list_var2.first();
						while (NIL != cdolist_list_var2) {
							final SubLObject label_string = pair2.first();
							final SubLObject perc_width = second(pair2);
							final SubLObject actual_width = third(pair2);
							html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								final SubLObject widthstring = (perc_width.isZero()) ? $str152$1_ : cconcatenate(format_nil.format_nil_a_no_copy(perc_width), $str153$_);
								final SubLObject switchedcolor = (NIL != v_switch) ? color1 : color2;
								html_draw_bargraph_label(label_string);
								html_draw_bargraph_colorbar(widthstring, actual_width, switchedcolor, smallerbars);
								v_switch = makeBoolean(NIL == v_switch);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
							}
							html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							html_source_readability_terpri(UNPROVIDED);
							cdolist_list_var2 = cdolist_list_var2.rest();
							pair2 = cdolist_list_var2.first();
						}
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
					}
					html_markup(html_macros.$html_table_tail$.getGlobalValue());
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
			}
			html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_draw_bargraph_label(final SubLObject labelstring) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_table_data_head$.getGlobalValue());
		html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
		html_markup(html_macros.$html_table_data_align$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_align($RIGHT));
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_macros.$html_table_data_width$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str154$5_);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ(labelstring);
			html_indent(TWO_INTEGER);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_draw_bargraph_colorbar(final SubLObject widthstring, final SubLObject actualwidth, final SubLObject bgcolor, final SubLObject smallbars) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_table_data_head$.getGlobalValue());
		html_markup(html_macros.$html_table_data_width$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str155$95_);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_table_head$.getGlobalValue());
			html_markup(html_macros.$html_table_border$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_width$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($str151$100_);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_table_row_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					if (NIL != bgcolor) {
						html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(bgcolor);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					if (NIL != widthstring) {
						html_markup(html_macros.$html_table_data_width$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(widthstring);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						final SubLObject size_val = TWO_INTEGER;
						html_markup(html_macros.$html_font_head$.getGlobalValue());
						if (NIL != size_val) {
							html_markup(html_macros.$html_font_size$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(size_val);
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							format(html_macros.$html_stream$.getDynamicValue(thread), $str156$__D, actualwidth);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
						}
						html_markup(html_macros.$html_font_tail$.getGlobalValue());
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
					}
					html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						if (NIL != smallbars) {
							final SubLObject size_val = TWO_INTEGER;
							html_markup(html_macros.$html_font_head$.getGlobalValue());
							if (NIL != size_val) {
								html_markup(html_macros.$html_font_size$.getGlobalValue());
								html_char(CHAR_quotation, UNPROVIDED);
								html_markup(size_val);
								html_char(CHAR_quotation, UNPROVIDED);
							}
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_glyph($NBSP, UNPROVIDED);
							} finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
							}
							html_markup(html_macros.$html_font_tail$.getGlobalValue());
						} else {
							html_glyph($NBSP, UNPROVIDED);
						}
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
					}
					html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
				}
				html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
			}
			html_markup(html_macros.$html_table_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_control_parameter_chooser(final SubLObject parameter, SubLObject descriptionP) {
		if (descriptionP == UNPROVIDED) {
			descriptionP = NIL;
		}
		assert NIL != symbolp(parameter) : "Types.symbolp(parameter) " + "CommonSymbols.NIL != Types.symbolp(parameter) " + parameter;
		SubLObject fancy_name = get(parameter, $FANCY_NAME, UNPROVIDED);
		final SubLObject description = get(parameter, $DESCRIPTION, UNPROVIDED);
		SubLObject settings_spec = get(parameter, $SETTINGS_SPEC, UNPROVIDED);
		if (NIL != boundp(parameter)) {
			if (NIL == fancy_name) {
				fancy_name = symbol_name(parameter);
			}
			if (NIL == settings_spec) {
				settings_spec = $list161;
			}
			html_markup(html_macros.$html_bold_head$.getGlobalValue());
			html_princ(fancy_name);
			html_markup(html_macros.$html_bold_tail$.getGlobalValue());
			if (NIL != descriptionP) {
				html_newline(UNPROVIDED);
				html_princ_doc_string(description, UNPROVIDED);
			}
			final SubLObject entry_name = html_control_parameter_entry_name(parameter);
			final SubLObject radio_name = html_control_parameter_radio_name(parameter);
			final SubLObject some_entryP = find($ENTRY, settings_spec, symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
			final SubLObject current_value = eval(parameter);
			final SubLObject total_settings = length(settings_spec);
			SubLObject index = ZERO_INTEGER;
			SubLObject cdolist_list_var = settings_spec;
			SubLObject setting_spec = NIL;
			setting_spec = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				html_newline(UNPROVIDED);
				SubLObject current;
				final SubLObject datum = current = setting_spec;
				SubLObject type = NIL;
				SubLObject datum_$38 = NIL;
				SubLObject possibility_fancy_name = NIL;
				destructuring_bind_must_consp(current, datum, $list164);
				type = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list164);
				datum_$38 = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list164);
				possibility_fancy_name = current.first();
				current = current.rest();
				if (NIL == current) {
					SubLObject radio_checkedP = NIL;
					SubLObject entry_default = NIL;
					if (total_settings.numE(ONE_INTEGER)) {
						radio_checkedP = T;
					} else if (type == $ENTRY) {
						radio_checkedP = funcall(datum_$38, current_value);
					} else {
						radio_checkedP = equal(current_value, datum_$38);
					}

					if ((NIL != radio_checkedP) && (type == $ENTRY)) {
						entry_default = princ_to_string(current_value);
					}
					if (total_settings.numE(ONE_INTEGER)) {
						html_hidden_input(radio_name, index, UNPROVIDED);
					} else {
						if (NIL != some_entryP) {
							if (type == $ENTRY) {
								html_script_utilities.html_focus_radio_input(radio_name, entry_name, index, radio_checkedP, UNPROVIDED);
							} else {
								html_script_utilities.html_clear_radio_input(radio_name, entry_name, index, radio_checkedP, UNPROVIDED);
							}
						} else {
							html_radio_input(radio_name, index, radio_checkedP, UNPROVIDED);
						}
						html_indent(UNPROVIDED);
					}
					if (type == $ENTRY) {
						SubLObject entry_format = html_macros.html_parameter_entry_format(parameter);
						if (NIL == entry_format) {
							entry_format = $list165;
						}
						SubLObject current_$40;
						final SubLObject datum_$39 = current_$40 = entry_format;
						SubLObject type_$41 = NIL;
						SubLObject size = NIL;
						destructuring_bind_must_consp(current_$40, datum_$39, $list166);
						type_$41 = current_$40.first();
						current_$40 = current_$40.rest();
						destructuring_bind_must_consp(current_$40, datum_$39, $list166);
						size = current_$40.first();
						current_$40 = current_$40.rest();
						if (NIL == current_$40) {
							final SubLObject pcase_var = type_$41;
							if (pcase_var.eql($TEXT)) {
								html_text_input(entry_name, entry_default, size);
							} else {
								html_text_input(entry_name, entry_default, UNPROVIDED);
							}
						} else {
							cdestructuring_bind_error(datum_$39, $list166);
						}
						html_indent(UNPROVIDED);
					}
					html_princ(possibility_fancy_name);
				} else {
					cdestructuring_bind_error(datum, $list164);
				}
				index = add(index, ONE_INTEGER);
				cdolist_list_var = cdolist_list_var.rest();
				setting_spec = cdolist_list_var.first();
			}
		}
		return NIL;
	}

	public static SubLObject html_extract_control_parameter_value(final SubLObject parameter, final SubLObject args) {
		assert NIL != symbolp(parameter) : "Types.symbolp(parameter) " + "CommonSymbols.NIL != Types.symbolp(parameter) " + parameter;
		final SubLObject fancy_name = get(parameter, $FANCY_NAME, UNPROVIDED);
		final SubLObject settings_spec = get(parameter, $SETTINGS_SPEC, UNPROVIDED);
		SubLObject new_value = NIL;
		SubLObject invalid_explanation = NIL;
		if (((NIL != fancy_name) && (NIL != settings_spec)) && (NIL != boundp(parameter))) {
			final SubLObject radio_name = html_control_parameter_radio_name(parameter);
			final SubLObject radio_choice = html_extract_input(radio_name, args);
			if (NIL != radio_choice) {
				final SubLObject setting_spec = nth(read_from_string_ignoring_errors(radio_choice, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), settings_spec);
				SubLObject current;
				final SubLObject datum = current = setting_spec;
				SubLObject type = NIL;
				SubLObject datum_$42 = NIL;
				SubLObject possibility_fancy_name = NIL;
				destructuring_bind_must_consp(current, datum, $list164);
				type = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list164);
				datum_$42 = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list164);
				possibility_fancy_name = current.first();
				current = current.rest();
				if (NIL == current) {
					if (type == $ENTRY) {
						final SubLObject entry_name = html_control_parameter_entry_name(parameter);
						final SubLObject entry_string = html_extract_input(entry_name, args);
						if (NIL != entry_string) {
							if (NIL != funcall(datum_$42, entry_string)) {
								new_value = entry_string;
							} else {
								final SubLObject value = read_from_string_ignoring_errors(entry_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
								if (NIL != funcall(datum_$42, value)) {
									new_value = value;
								} else {
									invalid_explanation = cconcatenate($str168$The_value_entered_for__, new SubLObject[] { format_nil.format_nil_a_no_copy(fancy_name), $str169$__was_not_valid_ });
								}
							}
						} else {
							invalid_explanation = cconcatenate($str170$No_value_was_entered_for__, new SubLObject[] { format_nil.format_nil_a_no_copy(fancy_name), $str171$__ });
						}
					} else {
						new_value = datum_$42;
					}
				} else {
					cdestructuring_bind_error(datum, $list164);
				}
			} else {
				invalid_explanation = cconcatenate($str172$No_choice_was_made_for__, new SubLObject[] { format_nil.format_nil_a_no_copy(fancy_name), $str171$__ });
			}
		} else {
			invalid_explanation = cconcatenate(format_nil.format_nil_s_no_copy(parameter), $str173$_is_not_a_declared_control_parame);
		}
		return values(new_value, invalid_explanation);
	}

	public static SubLObject html_set_control_parameter(final SubLObject parameter, final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject value = html_extract_control_parameter_value(parameter, args);
		final SubLObject error_message = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != error_message) {
			cb_error(error_message, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			return NIL;
		}
		eval(list(CSETQ, parameter, list(QUOTE, value)));
		return T;
	}

	public static SubLObject html_control_parameter_entry_name(final SubLObject parameter) {
		final SubLObject name = symbol_name(parameter);
		return cconcatenate($str176$entry_, format_nil.format_nil_a_no_copy(name));
	}

	public static SubLObject html_control_parameter_radio_name(final SubLObject parameter) {
		final SubLObject name = symbol_name(parameter);
		return cconcatenate($str177$radio_, format_nil.format_nil_a_no_copy(name));
	}

	public static SubLObject html_select_from_list(final SubLObject name, final SubLObject selected_option_content, final SubLObject option_contents, SubLObject option_values) {
		if (option_values == UNPROVIDED) {
			option_values = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_select_head$.getGlobalValue());
		html_markup(html_macros.$html_select_name$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(name);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			SubLObject option_content = NIL;
			SubLObject option_content_$43 = NIL;
			SubLObject option_value = NIL;
			SubLObject option_value_$44 = NIL;
			option_content = option_contents;
			option_content_$43 = option_content.first();
			option_value = option_values;
			option_value_$44 = option_value.first();
			while ((NIL != option_value) || (NIL != option_content)) {
				final SubLObject selectedP = equal(option_content_$43, selected_option_content);
				html_markup(html_macros.$html_option_head$.getGlobalValue());
				if (NIL != selectedP) {
					html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
				}
				if (NIL != option_value_$44) {
					html_markup(html_macros.$html_option_value$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(option_value_$44);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_princ(option_content_$43);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
				}
				html_markup(html_macros.$html_option_tail$.getGlobalValue());
				option_content = option_content.rest();
				option_content_$43 = option_content.first();
				option_value = option_value.rest();
				option_value_$44 = option_value.first();
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_select_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject matching_html_field(final SubLObject v_object) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean(v_object.isCons() && v_object.first().equalp($html_extract_field_name$.getDynamicValue(thread)));
	}

	public static SubLObject matching_html_button_field(final SubLObject v_object) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean(v_object.isCons() && second(v_object).equalp($html_extract_field_name$.getDynamicValue(thread)));
	}

	public static SubLObject html_extract_input(final SubLObject field_name, final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != stringp(field_name) : "Types.stringp(field_name) " + "CommonSymbols.NIL != Types.stringp(field_name) " + field_name;
		assert NIL != listp(args) : "Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) " + args;
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = $html_extract_field_name$.currentBinding(thread);
		try {
			$html_extract_field_name$.bind(field_name, thread);
			ans = find_if(symbol_function(MATCHING_HTML_FIELD), args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} finally {
			$html_extract_field_name$.rebind(_prev_bind_0, thread);
		}
		return second(ans);
	}

	public static SubLObject html_extract_input_values(final SubLObject field_name, final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != stringp(field_name) : "Types.stringp(field_name) " + "CommonSymbols.NIL != Types.stringp(field_name) " + field_name;
		assert NIL != listp(args) : "Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) " + args;
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = $html_extract_field_name$.currentBinding(thread);
		try {
			$html_extract_field_name$.bind(field_name, thread);
			SubLObject cdolist_list_var = args;
			SubLObject arg = NIL;
			arg = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL != matching_html_field(arg)) {
					ans = cons(second(arg), ans);
				}
				cdolist_list_var = cdolist_list_var.rest();
				arg = cdolist_list_var.first();
			}
		} finally {
			$html_extract_field_name$.rebind(_prev_bind_0, thread);
		}
		return nreverse(ans);
	}

	public static SubLObject html_extract_value(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		SubLObject result = html_extract_input(field_name, html_args);
		if (NIL == result) {
			result = v_default;
		}
		return result;
	}

	public static SubLObject html_extract_integer(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = ZERO_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject str = html_extract_value(field_name, html_args, NIL);
		SubLObject v_int = v_default;
		if (NIL != find_if(DIGIT_CHAR_P, str, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			SubLObject ignore_errors_tag = NIL;
			try {
				thread.throwStack.push($IGNORE_ERRORS_TARGET);
				final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
				try {
					Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
					try {
						v_int = parse_integer(str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					} catch (final Throwable catch_var) {
						Errors.handleThrowable(catch_var, NIL);
					}
				} finally {
					Errors.$error_handler$.rebind(_prev_bind_0, thread);
				}
			} catch (final Throwable ccatch_env_var) {
				ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
			} finally {
				thread.throwStack.pop();
			}
		}
		return v_int;
	}

	public static SubLObject html_extract_date(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject str = html_extract_value(field_name, html_args, v_default);
		SubLObject dates = v_default;
		SubLObject ignore_errors_tag = NIL;
		try {
			thread.throwStack.push($IGNORE_ERRORS_TARGET);
			final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
				Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
				try {
					dates = date_utilities.parse_date_from_string_fast(str, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				} catch (final Throwable catch_var) {
					Errors.handleThrowable(catch_var, NIL);
				}
			} finally {
				Errors.$error_handler$.rebind(_prev_bind_0, thread);
			}
		} catch (final Throwable ccatch_env_var) {
			ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
		} finally {
			thread.throwStack.pop();
		}
		return dates;
	}

	public static SubLObject html_extract_keyword(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = $DEFAULT;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject str = html_extract_value(field_name, html_args, v_default);
		SubLObject kwd = v_default;
		SubLObject ignore_errors_tag = NIL;
		try {
			thread.throwStack.push($IGNORE_ERRORS_TARGET);
			final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
				Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
				try {
					kwd = make_keyword(Strings.string_upcase(str, UNPROVIDED, UNPROVIDED));
				} catch (final Throwable catch_var) {
					Errors.handleThrowable(catch_var, NIL);
				}
			} finally {
				Errors.$error_handler$.rebind(_prev_bind_0, thread);
			}
		} catch (final Throwable ccatch_env_var) {
			ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
		} finally {
			thread.throwStack.pop();
		}
		return kwd;
	}

	public static SubLObject html_extract_string(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = $str47$;
		}
		return html_extract_value(field_name, html_args, v_default);
	}

	public static SubLObject html_extract_boolean(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		return list_utilities.sublisp_boolean(html_extract_value(field_name, html_args, v_default));
	}

	public static SubLObject html_extract_sexpr(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		return html_extract_sexpr_int(field_name, html_args, v_default, NIL);
	}

	public static SubLObject html_extract_cyclified_sexpr(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		if ($str47$.equal(html_extract_input(field_name, html_args))) {
			return v_default;
		}
		return html_extract_sexpr_int(field_name, html_args, v_default, T);
	}

	public static SubLObject html_extract_sexpr_int(final SubLObject field_name, final SubLObject html_args, final SubLObject v_default, final SubLObject cyclifyP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = $read_eval$.currentBinding(thread);
		try {
			$read_eval$.bind(NIL, thread);
			final SubLObject value = html_extract_input(field_name, html_args);
			final SubLObject clean_value = ((NIL != value) && (NIL != cyclifyP)) ? string_utilities.cyclify_string(value) : value;
			final SubLObject sexpr = (NIL != value) ? read_from_string_ignoring_errors(clean_value, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED) : v_default;
			return sexpr;
		} finally {
			$read_eval$.rebind(_prev_bind_0, thread);
		}
	}

	public static SubLObject html_extract_button_value(final SubLObject button_name, final SubLObject html_args, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != stringp(button_name) : "Types.stringp(button_name) " + "CommonSymbols.NIL != Types.stringp(button_name) " + button_name;
		assert NIL != listp(html_args) : "Types.listp(html_args) " + "CommonSymbols.NIL != Types.listp(html_args) " + html_args;
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = $html_extract_field_name$.currentBinding(thread);
		try {
			$html_extract_field_name$.bind(button_name, thread);
			ans = find_if(symbol_function(MATCHING_HTML_BUTTON_FIELD), html_args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} finally {
			$html_extract_field_name$.rebind(_prev_bind_0, thread);
		}
		return ans.first();
	}

	public static SubLObject decode_html_language_abbreviation(final SubLObject lang_value) {
		SubLObject lang = NIL;
		if (lang_value.equalp($$$en)) {
			lang = $$EnglishLanguage;
		} else if (lang_value.equalp($str188$en_gb)) {
			lang = $$BritishEnglishDialect;
		} else if (lang_value.equalp($$$fr)) {
			lang = $$FrenchLanguage;
		} else if (lang_value.equalp($$$de)) {
			lang = $$GermanLanguage;
		} else {
			lang = kb_mapping_utilities.fpred_value_in_any_mt(lang_value, $$languageCodeDigraph, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
		}

		return lang;
	}

	public static SubLObject html_glyph(final SubLObject glyph, SubLObject n) {
		if (n == UNPROVIDED) {
			n = ONE_INTEGER;
		}
		assert NIL != symbolp(glyph) : "Types.symbolp(glyph) " + "CommonSymbols.NIL != Types.symbolp(glyph) " + glyph;
		final SubLObject markup = html_glyph_markup(glyph);
		if (markup.isString()) {
			SubLObject i;
			for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
				html_markup(markup);
			}
		}
		return NIL;
	}

	public static SubLObject html_glyph_markup(final SubLObject glyph) {
		return get(glyph, $HTML_GLYPH, NIL);
	}

	public static SubLObject html_declare_glyph(final SubLObject glyph, final SubLObject markup) {
		assert NIL != symbolp(glyph) : "Types.symbolp(glyph) " + "CommonSymbols.NIL != Types.symbolp(glyph) " + glyph;
		assert NIL != stringp(markup) : "Types.stringp(markup) " + "CommonSymbols.NIL != Types.stringp(markup) " + markup;
		put(glyph, $HTML_GLYPH, markup);
		return glyph;
	}

	public static SubLObject html_unicode_char(final SubLObject unicode_identifier, SubLObject n) {
		if (n == UNPROVIDED) {
			n = ONE_INTEGER;
		}
		assert NIL != string_utilities.hex_char_string_p(unicode_identifier) : "string_utilities.hex_char_string_p(unicode_identifier) " + "CommonSymbols.NIL != string_utilities.hex_char_string_p(unicode_identifier) " + unicode_identifier;
		SubLObject i;
		for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
			html_markup(cconcatenate($str668$__, new SubLObject[] { unicode_identifier, $str8$_ }));
		}
		return NIL;
	}

	public static SubLObject html_create_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset, SubLObject script) {
		if (values == UNPROVIDED) {
			values = NIL;
		}
		if (size == UNPROVIDED) {
			size = NIL;
		}
		if (choice_offset == UNPROVIDED) {
			choice_offset = NIL;
		}
		if (script == UNPROVIDED) {
			script = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_select_head$.getGlobalValue());
		html_markup(html_macros.$html_select_name$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(field_name);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != size) {
			html_markup(html_macros.$html_select_size$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(size);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_space, UNPROVIDED);
		html_markup(script);
		if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			SubLObject list_var = NIL;
			SubLObject item = NIL;
			SubLObject i = NIL;
			list_var = choices;
			item = list_var.first();
			for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), item = list_var.first(), i = add(ONE_INTEGER, i)) {
				final SubLObject is_selectedP = eql(i, choice_offset);
				final SubLObject value = (NIL != list_utilities.lengthG(values, i, UNPROVIDED)) ? elt(values, i) : NIL;
				html_markup(html_macros.$html_option_head$.getGlobalValue());
				if (NIL != is_selectedP) {
					html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
				}
				if (NIL != value) {
					html_markup(html_macros.$html_option_value$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(value);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_princ(item);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
				}
				html_markup(html_macros.$html_option_tail$.getGlobalValue());
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_select_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_create_radiobox_form(final SubLObject form_name, final SubLObject choices, SubLObject values, SubLObject choice_offset, SubLObject same_lineP) {
		if (values == UNPROVIDED) {
			values = NIL;
		}
		if (choice_offset == UNPROVIDED) {
			choice_offset = NIL;
		}
		if (same_lineP == UNPROVIDED) {
			same_lineP = NIL;
		}
		SubLObject list_var = NIL;
		SubLObject item = NIL;
		SubLObject i = NIL;
		list_var = choices;
		item = list_var.first();
		for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), item = list_var.first(), i = add(ONE_INTEGER, i)) {
			final SubLObject is_selectedP = eql(i, choice_offset);
			final SubLObject user_value = elt(values, i);
			final SubLObject form_value = (NIL != user_value) ? user_value : item;
			if (NIL != string_utilities.non_empty_stringP(item)) {
				html_radio_input(form_name, form_value, is_selectedP, UNPROVIDED);
				html_indent(UNPROVIDED);
				html_princ(item);
			}
			if (NIL != same_lineP) {
				html_indent(UNPROVIDED);
			} else {
				html_newline(UNPROVIDED);
			}
		}
		return NIL;
	}

	public static SubLObject html_create_multiple_selection_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offsets) {
		if (values == UNPROVIDED) {
			values = NIL;
		}
		if (size == UNPROVIDED) {
			size = NIL;
		}
		if (choice_offsets == UNPROVIDED) {
			choice_offsets = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup(html_macros.$html_select_head$.getGlobalValue());
		html_markup(html_macros.$html_select_name$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(field_name);
		html_char(CHAR_quotation, UNPROVIDED);
		html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
		if (NIL != size) {
			html_markup(html_macros.$html_select_size$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(size);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			SubLObject list_var = NIL;
			SubLObject item = NIL;
			SubLObject i = NIL;
			list_var = choices;
			item = list_var.first();
			for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), item = list_var.first(), i = add(ONE_INTEGER, i)) {
				final SubLObject is_selectedP = member(i, choice_offsets, symbol_function(EQL), UNPROVIDED);
				final SubLObject value = elt(values, i);
				html_markup(html_macros.$html_option_head$.getGlobalValue());
				if (NIL != is_selectedP) {
					html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
				}
				if (NIL != value) {
					html_markup(html_macros.$html_option_value$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(value);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_princ(item);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
				}
				html_markup(html_macros.$html_option_tail$.getGlobalValue());
			}
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_select_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_create_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset, SubLObject script) {
		if (values == UNPROVIDED) {
			values = NIL;
		}
		if (size == UNPROVIDED) {
			size = NIL;
		}
		if (choice_offset == UNPROVIDED) {
			choice_offset = NIL;
		}
		if (script == UNPROVIDED) {
			script = NIL;
		}
		return html_create_listbox(field_name, choices, values, size, choice_offset, script);
	}

	public static SubLObject html_create_simple_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject default_choice) {
		if (default_choice == UNPROVIDED) {
			default_choice = NIL;
		}
		return html_create_listbox(field_name, choices, NIL, ONE_INTEGER, position(default_choice, choices, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
	}

	public static SubLObject create_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset) {
		if (values == UNPROVIDED) {
			values = NIL;
		}
		if (size == UNPROVIDED) {
			size = NIL;
		}
		if (choice_offset == UNPROVIDED) {
			choice_offset = NIL;
		}
		return html_create_listbox(field_name, choices, values, size, choice_offset, UNPROVIDED);
	}

	public static SubLObject create_multiple_selection_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offsets) {
		if (values == UNPROVIDED) {
			values = NIL;
		}
		if (size == UNPROVIDED) {
			size = NIL;
		}
		if (choice_offsets == UNPROVIDED) {
			choice_offsets = NIL;
		}
		return html_create_multiple_selection_listbox(field_name, choices, values, size, choice_offsets);
	}

	public static SubLObject create_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset) {
		if (values == UNPROVIDED) {
			values = NIL;
		}
		if (size == UNPROVIDED) {
			size = NIL;
		}
		if (choice_offset == UNPROVIDED) {
			choice_offset = NIL;
		}
		return html_create_dropdown_list(field_name, choices, values, size, choice_offset, UNPROVIDED);
	}

	public static SubLObject create_simple_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject default_choice) {
		if (default_choice == UNPROVIDED) {
			default_choice = NIL;
		}
		return html_create_simple_dropdown_list(field_name, choices, default_choice);
	}

	public static SubLObject get_encoded_form_field_name(final SubLObject basic_name) {
		return encode_form_field_name(basic_name);
	}

	public static SubLObject extract_encoded_form_field_value(final SubLObject unencoded_name, final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
		try {
			html_macros.$html_form_field_uniquifier_code$.bind(html_macros.get_form_field_code(args), thread);
			final SubLObject encoded_field_name = get_encoded_form_field_name(unencoded_name);
			ans = html_extract_input(encoded_field_name, args);
		} finally {
			html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject encode_form_field_name(final SubLObject basic_name) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread).isInteger()) {
			return cconcatenate(basic_name, new SubLObject[] { $str669$_, princ_to_string(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread)) });
		}
		return basic_name;
	}

	public static SubLObject html_echo_args(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_markup($str670$__DOCTYPE_html_PUBLIC_____W3C__DT);
		if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
			html_source_readability_terpri(UNPROVIDED);
			html_markup($str671$_meta_http_equiv__X_UA_Compatible);
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
			html_princ($$$Echo_of_ARGS);
			html_markup(html_macros.$html_title_tail$.getGlobalValue());
			html_markup(html_macros.$html_head_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
			final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
			final SubLObject _prev_bind_0_$48 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
				html_macros.$html_inside_bodyP$.bind(T, thread);
				html_markup(html_macros.$html_body_head$.getGlobalValue());
				if (NIL != color_value) {
					html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_color(color_value));
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_heading_head$.getGlobalValue());
					html_markup(TWO_INTEGER);
					html_char(CHAR_greater, UNPROVIDED);
					html_princ($$$Echo_of_ARGS);
					html_markup(html_macros.$html_heading_tail$.getGlobalValue());
					html_markup(TWO_INTEGER);
					html_char(CHAR_greater, UNPROVIDED);
					html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
					final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
					final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						cb_back_button($SELF, $$$Back);
						html_macros.verify_not_within_html_pre();
						html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
						final SubLObject _prev_bind_0_$51 = html_macros.$within_html_pre$.currentBinding(thread);
						try {
							html_macros.$within_html_pre$.bind(T, thread);
							SubLObject cdolist_list_var = args;
							SubLObject arg = NIL;
							arg = cdolist_list_var.first();
							while (NIL != cdolist_list_var) {
								html_prin1(arg);
								html_terpri(UNPROVIDED);
								cdolist_list_var = cdolist_list_var.rest();
								arg = cdolist_list_var.first();
							}
						} finally {
							html_macros.$within_html_pre$.rebind(_prev_bind_0_$51, thread);
						}
						html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					} finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
					}
					html_markup(html_macros.$html_form_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					html_copyright_notice();
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
				}
				html_markup(html_macros.$html_body_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$48, thread);
			}
			html_markup(html_macros.$html_html_tail$.getGlobalValue());
		} finally {
			cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
		}
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static SubLObject html_echo_file(final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject filename = NIL;
		destructuring_bind_must_consp(args, args, $list678);
		filename = args.first();
		final SubLObject current = args.rest();
		if (NIL == current) {
			SubLObject stream = NIL;
			try {
				final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
				try {
					stream_macros.$stream_requires_locking$.bind(NIL, thread);
					stream = compatibility.open_text(filename, $INPUT);
				} finally {
					stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
				}
				if (!stream.isStream()) {
					Errors.error($str680$Unable_to_open__S, filename);
				}
				SubLObject s;
				SubLObject v_char;
				for (s = stream, v_char = NIL, v_char = read_char(s, NIL, $EOF, UNPROVIDED); $EOF != v_char; v_char = read_char(s, NIL, $EOF, UNPROVIDED)) {
					html_char(v_char, UNPROVIDED);
				}
			} finally {
				final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					if (stream.isStream()) {
						close(stream, UNPROVIDED);
					}
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
				}
			}
		} else {
			cdestructuring_bind_error(args, $list678);
		}
		return NIL;
	}

	public static SubLObject remove_html_tags(final SubLObject string, SubLObject separator_string) {
		if (separator_string == UNPROVIDED) {
			separator_string = $$$_;
		}
		final SubLObject open = $str23$_;
		final SubLObject close = $str25$_;
		final SubLObject quote = $str682$_;
		final SubLObject open_comment = $str683$____;
		final SubLObject close_comment = $str684$___;
		final SubLObject open_script = $str685$_script;
		final SubLObject close_script = $str686$__script_;
		final SubLObject html_string1 = string_utilities.string_substitute($str685$_script, $str685$_script, string, symbol_function(EQUALP));
		final SubLObject html_string2 = string_utilities.string_substitute($str687$__script, $str687$__script, html_string1, symbol_function(EQUALP));
		final SubLObject strings = string_utilities.string_tokenize(html_string2, list(open_comment, close_comment, open_script, close_script, open, close, quote), NIL, T, T, $list688, UNPROVIDED);
		SubLObject in_tagP = NIL;
		SubLObject in_commentP = NIL;
		SubLObject in_scriptP = NIL;
		SubLObject in_quoteP = NIL;
		SubLObject tagless_string = NIL;
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			SubLObject cdolist_list_var = strings;
			SubLObject substring = NIL;
			substring = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL != in_commentP) {
					if (substring.equalp(close_comment)) {
						in_commentP = NIL;
					}
				} else if (NIL != in_scriptP) {
					if (substring.equalp(open_comment)) {
						in_commentP = T;
					} else if (substring.equalp(close_script)) {
						in_scriptP = NIL;
					}

				} else if (NIL != in_tagP) {
					if (NIL != in_quoteP) {
						if (substring.equalp(quote)) {
							in_quoteP = NIL;
						}
					} else if (substring.equalp(open_comment)) {
						in_commentP = T;
					} else if (substring.equalp(quote)) {
						in_quoteP = T;
					} else if (substring.equalp(close)) {
						in_tagP = NIL;
					}

				} else if (substring.equalp(open_comment)) {
					in_commentP = T;
				} else if (substring.equalp(open_script)) {
					in_scriptP = T;
					if (NIL == string_utilities.empty_string_p(separator_string)) {
						princ(separator_string, stream);
					}
				} else if (substring.equalp(open)) {
					in_tagP = T;
					if (NIL == string_utilities.empty_string_p(separator_string)) {
						princ(separator_string, stream);
					}
				} else if (NIL == string_utilities.empty_string_p(substring)) {
					princ(substring, stream);
				}

				cdolist_list_var = cdolist_list_var.rest();
				substring = cdolist_list_var.first();
			}
			tagless_string = get_output_stream_string(stream);
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
		return tagless_string;
	}

	public static SubLObject convert_html_to_text(final SubLObject html_text) {
		return remove_html_tags(html_text, UNPROVIDED);
	}

	public static SubLObject url_to_text(SubLObject url) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		SubLObject ignore_errors_tag = NIL;
		try {
			thread.throwStack.push($IGNORE_ERRORS_TARGET);
			final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
				Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
				try {
					if ((NIL == string_utilities.starts_with(Strings.string_downcase(url, UNPROVIDED, UNPROVIDED), $str690$http___)) && (NIL == web_utilities.url_p(url))) {
						url = cconcatenate($str690$http___, url);
					}
					thread.resetMultipleValues();
					SubLObject machine = web_utilities.parse_http_url(url);
					SubLObject port = thread.secondMultipleValue();
					SubLObject path = thread.thirdMultipleValue();
					final SubLObject query = thread.fourthMultipleValue();
					thread.resetMultipleValues();
					if (NIL == machine) {
						machine = url;
					}
					if (NIL == path) {
						path = $str24$_;
					}
					if (!port.isInteger()) {
						port = $int$80;
					}
					SubLObject out_stream = NIL;
					try {
						out_stream = make_private_string_output_stream();
						SubLObject stream = NIL;
						try {
							stream = make_private_string_input_stream(web_utilities.http_retrieve(list(list(query)), path, machine, port, $GET, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), ZERO_INTEGER, NIL);
							SubLObject tokens = xml_parsing_utilities.xml_tokenize(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
							while (NIL != tokens) {
								final SubLObject token = tokens.first();
								if (NIL != xml_parsing_utilities.xml_token_starts_with(token, $str685$_script)) {
									tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, $str686$__script_, UNPROVIDED), UNPROVIDED);
								} else if (NIL != xml_parsing_utilities.xml_token_starts_with(token, $str693$_style)) {
									tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, $str694$__style_, UNPROVIDED), UNPROVIDED);
								} else if (NIL != xml_parsing_utilities.xml_token_starts_with(token, $str695$_p_)) {
									princ($$$_, out_stream);
									tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
								} else if (NIL != xml_parsing_utilities.xml_token_starts_with(token, $str23$_)) {
									tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
								} else {
									format(out_stream, $str39$_A, token);
									tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
								}

							}
						} finally {
							final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								final SubLObject _values = getValuesAsVector();
								close(stream, UNPROVIDED);
								restoreValuesFromVector(_values);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
							}
						}
						result = get_output_stream_string(out_stream);
					} finally {
						final SubLObject _prev_bind_0_$53 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values2 = getValuesAsVector();
							close(out_stream, UNPROVIDED);
							restoreValuesFromVector(_values2);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
						}
					}
				} catch (final Throwable catch_var) {
					Errors.handleThrowable(catch_var, NIL);
				}
			} finally {
				Errors.$error_handler$.rebind(_prev_bind_0, thread);
			}
		} catch (final Throwable ccatch_env_var) {
			ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
		} finally {
			thread.throwStack.pop();
		}
		if (result.isString()) {
			return string_utilities.do_string_substitutions_robust(result, $url_to_text_replacements$.getGlobalValue(), UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject generate_html_filename_input_fieldname(final SubLObject name) {
		return cconcatenate($html_filename_input_prefix$.getGlobalValue(), name);
	}

	public static SubLObject html_filename_input(final SubLObject name, final SubLObject initial_value, final SubLObject size) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject file_input = generate_html_filename_input_fieldname(name);
		final SubLObject update_name_script = cconcatenate($str697$this_form_, new SubLObject[] { name, $str698$_value___this_value_ });
		html_markup(html_macros.$html_input_head$.getGlobalValue());
		html_markup(html_macros.$html_input_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($$$TEXT);
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != file_input) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(file_input);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != file_input) {
			html_markup(html_macros.$html_input_name$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(file_input);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != initial_value) {
			html_markup(html_macros.$html_input_value$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_princ(initial_value);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != size) {
			html_markup(html_macros.$html_input_size$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(size);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != update_name_script) {
			html_markup(html_macros.$html_select_onchange$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(update_name_script);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != update_name_script) {
			html_markup(html_macros.$html_event_attribute_onblur$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(update_name_script);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
			html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
		}
		html_char(CHAR_greater, UNPROVIDED);
		html_hidden_input(name, $str47$, NIL);
		return NIL;
	}

	public static SubLObject html_with_file_transmitting_form(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list700);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject handler_name = NIL;
		destructuring_bind_must_consp(current, datum, $list700);
		handler_name = current.first();
		current = current.rest();
		final SubLObject target = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list700);
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject frame_name_var = $sym701$FRAME_NAME_VAR;
			return list(CLET, list(list(frame_name_var, list(CB_FRAME_NAME, target))), listS(HTML_FANCY_FORM, listS($cyc_cgi_program$, $html_form_method_post$, frame_name_var, $list707), listS(HTML_HIDDEN_INPUT, handler_name, $list709), append(body, NIL)));
		}
		cdestructuring_bind_error(datum, $list700);
		return NIL;
	}

	public static SubLObject html_arguments_contain_multipart_form_dataP(final SubLObject args) {
		return list_utilities.sublisp_boolean(html_extract_input($html_multipart_form_date$.getGlobalValue(), args));
	}

	public static SubLObject html_parse_multipart_form_data(final SubLObject string) {
		SubLObject values = NIL;
		SubLObject s = NIL;
		try {
			s = make_private_string_input_stream(string, ZERO_INTEGER, NIL);
			final SubLObject separator = read_line(s, NIL, $EOF, UNPROVIDED);
			SubLObject eof = NIL;
			while (NIL == eof) {
				final SubLObject content_disposition = read_line(s, NIL, $EOF, UNPROVIDED);
				final SubLObject content_type = read_line(s, NIL, $EOF, UNPROVIDED);
				SubLObject field = NIL;
				SubLObject content = NIL;
				if ($EOF == content_disposition) {
					eof = T;
				} else {
					field = html_parse_data_name_from_content_disposition(content_disposition);
					if (NIL != search($str711$application_octet_stream, content_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
						content = html_parse_multipart_form_line(s, separator);
					} else {
						content = read_line(s, NIL, $EOF, UNPROVIDED);
						html_parse_consume_separator(s, separator);
					}
					values = cons(list(field, delete(CHAR_return, content, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), values);
				}
			}
		} finally {
			final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
				bind($is_thread_performing_cleanupP$, T);
				final SubLObject _values = getValuesAsVector();
				close(s, UNPROVIDED);
				restoreValuesFromVector(_values);
			} finally {
				rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		}
		values = cons(list($html_multipart_form_date$.getGlobalValue(), $$$T), values);
		return nreverse(values);
	}

	public static SubLObject html_parse_consume_separator(final SubLObject stream, final SubLObject separator) {
		return Strings.string_equal(separator, read_line(stream, NIL, $EOF, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject html_parse_data_name_from_content_disposition(final SubLObject content) {
		final SubLObject first_quote = position(CHAR_quotation, content, symbol_function($sym713$CHAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		final SubLObject inside_value = add(ONE_INTEGER, first_quote);
		final SubLObject second_quote = position(CHAR_quotation, content, symbol_function($sym713$CHAR_), symbol_function(IDENTITY), inside_value, UNPROVIDED);
		return string_utilities.substring(content, inside_value, second_quote);
	}

	public static SubLObject html_parse_multipart_form_line(final SubLObject s, final SubLObject separator) {
		read_line(s, NIL, $EOF, UNPROVIDED);
		SubLObject line = read_line(s, NIL, $EOF, UNPROVIDED);
		SubLObject pieces = $str47$;
		while (NIL == Strings.string_equal(separator, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			pieces = cconcatenate(pieces, new SubLObject[] { line, $html_newline_string$.getGlobalValue() });
			line = read_line(s, NIL, separator, UNPROVIDED);
		}
		return delete(CHAR_return, pieces, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject html_construct_message_from_multipart_data(final SubLObject contents) {
		SubLObject result = NIL;
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			SubLObject list_var = NIL;
			SubLObject component = NIL;
			SubLObject index = NIL;
			list_var = contents;
			component = list_var.first();
			for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), component = list_var.first(), index = add(ONE_INTEGER, index)) {
				SubLObject current;
				final SubLObject datum = current = component;
				SubLObject item = NIL;
				SubLObject value = NIL;
				destructuring_bind_must_consp(current, datum, $list714);
				item = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list714);
				value = current.first();
				current = current.rest();
				if (NIL == current) {
					if (index.isPositive()) {
						write_char(CHAR_ampersand, stream);
					}
					write_string(item, stream, UNPROVIDED, UNPROVIDED);
					write_char(CHAR_equal, stream);
					final SubLObject string_var = value;
					SubLObject end_var_$54;
					SubLObject end_var;
					SubLObject char_num;
					SubLObject v_char;
					for (end_var = end_var_$54 = length(string_var), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$54); char_num = number_utilities.f_1X(char_num)) {
						v_char = Strings.sublisp_char(string_var, char_num);
						if (NIL != charE(CHAR_space, v_char)) {
							write_char(CHAR_plus, stream);
						} else if (NIL != alphanumericp(v_char)) {
							write_char(v_char, stream);
						} else {
							format(stream, $str715$__2__0X, char_code(v_char));
						}

					}
				} else {
					cdestructuring_bind_error(datum, $list714);
				}
			}
			result = get_output_stream_string(stream);
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
		return result;
	}

	public static SubLObject html_request_arguments_are_multipart_dataP(final SubLObject v_arguments) {
		return makeBoolean((NIL != list_utilities.lengthG(v_arguments, $html_multipart_content_marker_size$.getGlobalValue(), UNPROVIDED)) && (NIL != Strings.string_equal(v_arguments, $html_multipart_content_marker$.getGlobalValue(), ZERO_INTEGER, $html_multipart_content_marker_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
	}

	public static SubLObject html_treemap_table(final SubLObject treemap, SubLObject width, SubLObject height, SubLObject split_type, SubLObject display_properties) {
		if (width == UNPROVIDED) {
			width = $int$200;
		}
		if (height == UNPROVIDED) {
			height = width;
		}
		if (split_type == UNPROVIDED) {
			split_type = $VERTICAL;
		}
		if (display_properties == UNPROVIDED) {
			display_properties = NIL;
		}
		html_treemap_table_recursive(treemap, width, height, split_type, display_properties);
		return NIL;
	}

	public static SubLObject treemap_size(final SubLObject treemap) {
		if (treemap.first().isList()) {
			SubLObject size = ZERO_INTEGER;
			SubLObject cdolist_list_var = treemap;
			SubLObject subtreemap = NIL;
			subtreemap = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				size = add(size, treemap_size(subtreemap));
				cdolist_list_var = cdolist_list_var.rest();
				subtreemap = cdolist_list_var.first();
			}
			return size;
		}
		return getf(treemap, $SIZE, UNPROVIDED);
	}

	public static SubLObject treemap_class_size(final SubLObject treemap, final SubLObject v_class) {
		if (treemap.first().isList()) {
			SubLObject size = ZERO_INTEGER;
			SubLObject cdolist_list_var = treemap;
			SubLObject subtreemap = NIL;
			subtreemap = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				size = add(size, treemap_class_size(subtreemap, v_class));
				cdolist_list_var = cdolist_list_var.rest();
				subtreemap = cdolist_list_var.first();
			}
			return size;
		}
		if (v_class.equal(getf(treemap, $CLASS, UNPROVIDED))) {
			return getf(treemap, $SIZE, UNPROVIDED);
		}
		return ZERO_INTEGER;
	}

	public static SubLObject build_treemap(final SubLObject root, final SubLObject dtrs_fn, final SubLObject size_fn, final SubLObject name_fn, final SubLObject class_fn) {
		assert NIL != function_spec_p(dtrs_fn) : "Types.function_spec_p(dtrs_fn) " + "CommonSymbols.NIL != Types.function_spec_p(dtrs_fn) " + dtrs_fn;
		assert NIL != function_spec_p(size_fn) : "Types.function_spec_p(size_fn) " + "CommonSymbols.NIL != Types.function_spec_p(size_fn) " + size_fn;
		assert NIL != function_spec_p(name_fn) : "Types.function_spec_p(name_fn) " + "CommonSymbols.NIL != Types.function_spec_p(name_fn) " + name_fn;
		assert NIL != function_spec_p(class_fn) : "Types.function_spec_p(class_fn) " + "CommonSymbols.NIL != Types.function_spec_p(class_fn) " + class_fn;
		return build_treemap_recursive(root, dtrs_fn, size_fn, name_fn, class_fn, set.new_set(symbol_function(EQUAL), UNPROVIDED));
	}

	public static SubLObject html_treemap_table_recursive(final SubLObject treemap, final SubLObject width, final SubLObject height, final SubLObject split_type, final SubLObject display_properties) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (!treemap.first().isList()) {
			final SubLObject size_tail = property_list_member($SIZE, treemap);
			final SubLObject size = (NIL != size_tail) ? cadr(size_tail) : NIL;
			final SubLObject name_tail = property_list_member($NAME, treemap);
			final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
			final SubLObject color_tail = property_list_member($COLOR, treemap);
			final SubLObject color = (NIL != color_tail) ? cadr(color_tail) : NIL;
			final SubLObject class_tail = property_list_member($CLASS, treemap);
			final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
			final SubLObject bgcolor = compute_treemap_color(color, v_class, display_properties);
			final SubLObject font_color = getf(display_properties, $FONT_COLOR, $BLACK);
			final SubLObject border = getf(display_properties, $BORDER, ONE_INTEGER);
			html_markup(html_macros.$html_table_head$.getGlobalValue());
			if (NIL != border) {
				html_markup(html_macros.$html_table_border$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(border);
				html_char(CHAR_quotation, UNPROVIDED);
			}
			html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_table_row_head$.getGlobalValue());
				if (NIL != height) {
					html_markup(html_macros.$html_table_row_height$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(height);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					html_markup(html_macros.$html_table_data_align$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($CENTER));
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($CENTER));
					html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != bgcolor) {
						html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(bgcolor);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					if (NIL != width) {
						html_markup(html_macros.$html_table_data_width$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(width);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						final SubLObject color_val = font_color;
						html_markup(html_macros.$html_font_head$.getGlobalValue());
						if (NIL != color_val) {
							html_markup(html_macros.$html_font_color$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(color_val));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							if (multiply(width, height).numG($int$400)) {
								if (multiply(width, height).numG($int$800)) {
									html_princ(name);
									html_indent(UNPROVIDED);
								}
								html_princ(size);
							}
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
						}
						html_markup(html_macros.$html_font_tail$.getGlobalValue());
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
					}
					html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
				}
				html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
			html_markup(html_macros.$html_table_tail$.getGlobalValue());
		} else if (split_type == $VERTICAL) {
			html_markup(html_macros.$html_table_head$.getGlobalValue());
			html_markup(html_macros.$html_table_border$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				final SubLObject tree_size = treemap_size(treemap);
				SubLObject cdolist_list_var = treemap;
				SubLObject subtreemap = NIL;
				subtreemap = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					final SubLObject subtree_size = treemap_size(subtreemap);
					final SubLObject sub_height = round(multiply(height, divide(subtree_size, tree_size)), UNPROVIDED);
					html_markup(html_macros.$html_table_row_head$.getGlobalValue());
					if (NIL != sub_height) {
						html_markup(html_macros.$html_table_row_height$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(sub_height);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($CENTER));
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($CENTER));
						html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != width) {
							html_markup(html_macros.$html_table_data_width$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(width);
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_treemap_table_recursive(subtreemap, width, sub_height, $HORIZONTAL, display_properties);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
					}
					html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					cdolist_list_var = cdolist_list_var.rest();
					subtreemap = cdolist_list_var.first();
				}
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
			}
			html_markup(html_macros.$html_table_tail$.getGlobalValue());
		} else if (split_type == $HORIZONTAL) {
			html_markup(html_macros.$html_table_head$.getGlobalValue());
			html_markup(html_macros.$html_table_border$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				final SubLObject tree_size = treemap_size(treemap);
				html_markup(html_macros.$html_table_row_head$.getGlobalValue());
				if (NIL != height) {
					html_markup(html_macros.$html_table_row_height$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(height);
					html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					SubLObject cdolist_list_var2 = treemap;
					SubLObject subtreemap2 = NIL;
					subtreemap2 = cdolist_list_var2.first();
					while (NIL != cdolist_list_var2) {
						final SubLObject subtree_size2 = treemap_size(subtreemap2);
						final SubLObject sub_width = round(multiply(width, divide(subtree_size2, tree_size)), UNPROVIDED);
						html_markup(html_macros.$html_table_data_head$.getGlobalValue());
						html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($CENTER));
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_align($CENTER));
						html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != sub_width) {
							html_markup(html_macros.$html_table_data_width$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(sub_width);
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_treemap_table_recursive(subtreemap2, sub_width, height, $VERTICAL, display_properties);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
						}
						html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
						cdolist_list_var2 = cdolist_list_var2.rest();
						subtreemap2 = cdolist_list_var2.first();
					}
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
				}
				html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
			}
			html_markup(html_macros.$html_table_tail$.getGlobalValue());
		}

		return NIL;
	}

	public static SubLObject compute_treemap_color(SubLObject color, final SubLObject v_class, final SubLObject display_properties) {
		if (NIL == color) {
			final SubLObject class_colormap_tail = property_list_member($CLASS_COLORMAP, display_properties);
			final SubLObject class_colormap = (NIL != class_colormap_tail) ? cadr(class_colormap_tail) : NIL;
			if (NIL != class_colormap) {
				color = list_utilities.alist_lookup_without_values(class_colormap, v_class, UNPROVIDED, UNPROVIDED);
			}
		}
		return color;
	}

	public static SubLObject build_treemap_recursive(final SubLObject root, final SubLObject dtrs_fn, final SubLObject size_fn, final SubLObject name_fn, final SubLObject class_fn, final SubLObject done) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject subtreemap_for_root = treemap_entry_for_node(root, size_fn, name_fn, class_fn);
		final SubLObject dtrs = funcall(dtrs_fn, root);
		SubLObject treemap = NIL;
		if (NIL == set.set_memberP(root, done)) {
			if (NIL != dtrs) {
				SubLObject subtreemaps = NIL;
				if (!$build_treemap_depth$.getDynamicValue(thread).numGE($build_treemap_max_depth$.getGlobalValue())) {
					final SubLObject _prev_bind_0 = $build_treemap_depth$.currentBinding(thread);
					try {
						$build_treemap_depth$.bind(number_utilities.f_1X($build_treemap_depth$.getDynamicValue(thread)), thread);
						SubLObject cdolist_list_var = dtrs;
						SubLObject dtr = NIL;
						dtr = cdolist_list_var.first();
						while (NIL != cdolist_list_var) {
							if (NIL == set.set_memberP(dtr, done)) {
								final SubLObject subtreemap = build_treemap_recursive(dtr, dtrs_fn, size_fn, name_fn, class_fn, done);
								if (NIL != number_utilities.positive_number_p(treemap_size(subtreemap))) {
									subtreemaps = cons(subtreemap, subtreemaps);
								}
								set.set_add(dtr, done);
							}
							cdolist_list_var = cdolist_list_var.rest();
							dtr = cdolist_list_var.first();
						}
					} finally {
						$build_treemap_depth$.rebind(_prev_bind_0, thread);
					}
				}
				if (NIL != number_utilities.positive_number_p(treemap_size(subtreemap_for_root))) {
					subtreemaps = cons(subtreemap_for_root, subtreemaps);
				}
				return nreverse(subtreemaps);
			}
			treemap = subtreemap_for_root;
		}
		set.set_add(root, done);
		return treemap;
	}

	public static SubLObject treemap_entry_for_node(final SubLObject root, final SubLObject size_fn, final SubLObject name_fn, final SubLObject class_fn) {
		final SubLObject size = funcall(size_fn, root);
		final SubLObject name = funcall(name_fn, root);
		final SubLObject v_class = funcall(class_fn, root);
		SubLObject entry = NIL;
		if (NIL != number_utilities.positive_number_p(size)) {
			entry = putf(entry, $SIZE, size);
		}
		if (NIL != name) {
			entry = putf(entry, $NAME, name);
		}
		if (NIL != v_class) {
			entry = putf(entry, $CLASS, v_class);
		}
		return entry;
	}

	public static SubLObject html_user_id_and_password(SubLObject user_id_field, SubLObject hashed_password_field, SubLObject user_text, SubLObject password_text, SubLObject user, SubLObject bad_passwordP) {
		if (user_id_field == UNPROVIDED) {
			user_id_field = $str730$new_login_id;
		}
		if (hashed_password_field == UNPROVIDED) {
			hashed_password_field = $str731$hashed_password;
		}
		if (user_text == UNPROVIDED) {
			user_text = $$$User_ID;
		}
		if (password_text == UNPROVIDED) {
			password_text = $$$Password;
		}
		if (user == UNPROVIDED) {
			user = NIL;
		}
		if (bad_passwordP == UNPROVIDED) {
			bad_passwordP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject unhashed_password = cconcatenate($str734$unhashed_password_, user_id_field);
		final SubLObject keyup_event = cconcatenate($str735$var_oldB64Pad___b64pad__b64pad___, new SubLObject[] { format_nil.format_nil_a_no_copy(user_id_field), $str736$_value_this_form_, format_nil.format_nil_a_no_copy(unhashed_password), $str737$_value___this_form_, format_nil.format_nil_a_no_copy(hashed_password_field), $str738$_value_b64_sha1_theInput___b64pad });
		cyc_file_dependencies.javascript($SHA1);
		html_markup(html_macros.$html_table_head$.getGlobalValue());
		html_markup(html_macros.$html_table_border$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(ZERO_INTEGER);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_princ(user_text);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_text_input(user_id_field, user, $int$30);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
			}
			html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
			html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					if (NIL != bad_passwordP) {
						html_markup(html_macros.$html_font_head$.getGlobalValue());
						if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
							html_markup(html_macros.$html_font_color$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
							html_char(CHAR_quotation, UNPROVIDED);
						}
						html_char(CHAR_greater, UNPROVIDED);
						final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_princ(password_text);
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
						}
						html_markup(html_macros.$html_font_tail$.getGlobalValue());
					} else {
						html_princ(password_text);
					}
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_input_head$.getGlobalValue());
					html_markup(html_macros.$html_input_type$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($PASSWORD);
					html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != unhashed_password) {
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(unhashed_password);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					if (NIL != keyup_event) {
						html_markup(html_macros.$html_event_attribute_onkeyup$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(keyup_event);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
						html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
					}
					html_char(CHAR_greater, UNPROVIDED);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
			}
			html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
			html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_reset_input(UNPROVIDED);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_char(CHAR_greater, UNPROVIDED);
				final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
				}
				html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
			}
			html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_table_tail$.getGlobalValue());
		html_hidden_input(hashed_password_field, NIL, $int$80);
		return NIL;
	}

	public static SubLObject declare_html_utilities_file() {
		declareFunction(me, "html_flush", "HTML-FLUSH", 0, 0, false);
		declareFunction(me, "html_char", "HTML-CHAR", 1, 1, false);
		declareFunction(me, "html_string", "HTML-STRING", 1, 2, false);
		declareFunction(me, "html_reserved_char_p", "HTML-RESERVED-CHAR-P", 1, 0, false);
		declareFunction(me, "html_escape_string_for_char", "HTML-ESCAPE-STRING-FOR-CHAR", 2, 0, false);
		declareFunction(me, "string_has_any_escape_charsP", "STRING-HAS-ANY-ESCAPE-CHARS?", 2, 0, false);
		declareFunction(me, "html_reserved_character_code_p", "HTML-RESERVED-CHARACTER-CODE-P", 1, 0, false);
		declareFunction(me, "html_escape_string_for_non_ascii_char", "HTML-ESCAPE-STRING-FOR-NON-ASCII-CHAR", 1, 0, false);
		declareFunction(me, "html_escape", "HTML-ESCAPE", 2, 0, false);
		declareFunction(me, "subl_string_to_display_vector_string", "SUBL-STRING-TO-DISPLAY-VECTOR-STRING", 1, 0, false);
		declareFunction(me, "html_princ", "HTML-PRINC", 1, 0, false);
		declareFunction(me, "html_princ_strong", "HTML-PRINC-STRONG", 1, 0, false);
		declareFunction(me, "html_princ_possibly_strong", "HTML-PRINC-POSSIBLY-STRONG", 2, 0, false);
		declareFunction(me, "html_princ_non_breaking", "HTML-PRINC-NON-BREAKING", 1, 0, false);
		declareFunction(me, "html_prin1", "HTML-PRIN1", 1, 0, false);
		declareFunction(me, "html_princ_formatted_string", "HTML-PRINC-FORMATTED-STRING", 1, 0, false);
		declareFunction(me, "html_terpri", "HTML-TERPRI", 0, 1, false);
		declareFunction(me, "html_source_readability_terpri", "HTML-SOURCE-READABILITY-TERPRI", 0, 1, false);
		declareFunction(me, "html_tab", "HTML-TAB", 0, 1, false);
		declareFunction(me, "html_spaces", "HTML-SPACES", 0, 1, false);
		declareFunction(me, "html_indent", "HTML-INDENT", 0, 1, false);
		declareFunction(me, "html_markup", "HTML-MARKUP", 1, 0, false);
		declareFunction(me, "html_print_doc_string", "HTML-PRINT-DOC-STRING", 1, 0, false);
		declareFunction(me, "html_princ_doc_string", "HTML-PRINC-DOC-STRING", 1, 1, false);
		declareFunction(me, "hide_non_ascii_chars", "HIDE-NON-ASCII-CHARS", 1, 0, false);
		declareFunction(me, "html_princ_string_with_hidden_non_ascii_chars", "HTML-PRINC-STRING-WITH-HIDDEN-NON-ASCII-CHARS", 1, 0, false);
		declareFunction(me, "html_princ_cycl_string", "HTML-PRINC-CYCL-STRING", 1, 2, false);
		declareFunction(me, "html_princ_cycl_string_new", "HTML-PRINC-CYCL-STRING-NEW", 3, 0, false);
		declareFunction(me, "html_princ_cycl_string_old", "HTML-PRINC-CYCL-STRING-OLD", 3, 0, false);
		declareFunction(me, "html_cycl_string", "HTML-CYCL-STRING", 1, 2, false);
		declareFunction(me, "opencyc_html_cycl_string", "OPENCYC-HTML-CYCL-STRING", 1, 0, false);
		declareFunction(me, "cb_form_for_cycl_string", "CB-FORM-FOR-CYCL-STRING", 1, 2, false);
		declareFunction(me, "html_stale_constant_reference", "HTML-STALE-CONSTANT-REFERENCE", 1, 2, false);
		declareFunction(me, "html_show_string_with_invalid_constants_highlighted", "HTML-SHOW-STRING-WITH-INVALID-CONSTANTS-HIGHLIGHTED", 1, 1, false);
		declareFunction(me, "html_url_princ", "HTML-URL-PRINC", 1, 0, false);
		declareFunction(me, "html_url_princ_char", "HTML-URL-PRINC-CHAR", 1, 0, false);
		declareFunction(me, "html_simple_attribute", "HTML-SIMPLE-ATTRIBUTE", 1, 0, false);
		declareFunction(me, "html_simple_quoted_attribute", "HTML-SIMPLE-QUOTED-ATTRIBUTE", 2, 0, false);
		declareFunction(me, "html_color", "HTML-COLOR", 1, 0, false);
		declareFunction(me, "html_style_background_color", "HTML-STYLE-BACKGROUND-COLOR", 1, 0, false);
		declareFunction(me, "html_align", "HTML-ALIGN", 1, 0, false);
		declareFunction(me, "html_copyright_notice", "HTML-COPYRIGHT-NOTICE", 0, 0, false);
		declareFunction(me, "html_copyright_text", "HTML-COPYRIGHT-TEXT", 0, 0, false);
		declareFunction(me, "html_mailto_url", "HTML-MAILTO-URL", 1, 0, false);
		declareFunction(me, "html_file_url", "HTML-FILE-URL", 1, 0, false);
		declareFunction(me, "html_refresh", "HTML-REFRESH", 1, 1, false);
		declareFunction(me, "html_meta_utf_8_content_type", "HTML-META-UTF-8-CONTENT-TYPE", 0, 0, false);
		declareFunction(me, "html_meta_expires", "HTML-META-EXPIRES", 0, 3, false);
		declareFunction(me, "html_meta_last_modified", "HTML-META-LAST-MODIFIED", 0, 1, false);
		declareFunction(me, "html_meta_dont_cache", "HTML-META-DONT-CACHE", 0, 0, false);
		declareMacro(me, "html_webpage_expires", "HTML-WEBPAGE-EXPIRES");
		declareMacro(me, "html_webpage_last_modified", "HTML-WEBPAGE-LAST-MODIFIED");
		declareMacro(me, "html_dont_cache_webpage", "HTML-DONT-CACHE-WEBPAGE");
		declareFunction(me, "html_meta_no_robots", "HTML-META-NO-ROBOTS", 0, 0, false);
		declareFunction(me, "html_meta_robot_instructions", "HTML-META-ROBOT-INSTRUCTIONS", 0, 2, false);
		declareFunction(me, "html_meta_select_robot_instructions", "HTML-META-SELECT-ROBOT-INSTRUCTIONS", 2, 0, false);
		declareFunction(me, "html_hr", "HTML-HR", 0, 2, false);
		declareFunction(me, "html_line_break", "HTML-LINE-BREAK", 0, 1, false);
		declareFunction(me, "html_br", "HTML-BR", 0, 0, false);
		declareFunction(me, "html_newline", "HTML-NEWLINE", 0, 1, false);
		declareFunction(me, "html_checkbox_input", "HTML-CHECKBOX-INPUT", 1, 5, false);
		declareFunction(me, "html_hidden_input", "HTML-HIDDEN-INPUT", 2, 1, false);
		declareFunction(me, "html_image_input", "HTML-IMAGE-INPUT", 2, 2, false);
		declareFunction(me, "html_password_input", "HTML-PASSWORD-INPUT", 1, 2, false);
		declareFunction(me, "html_radio_input", "HTML-RADIO-INPUT", 1, 3, false);
		declareFunction(me, "html_reset_input", "HTML-RESET-INPUT", 0, 1, false);
		declareFunction(me, "html_submit_input", "HTML-SUBMIT-INPUT", 0, 3, false);
		declareFunction(me, "html_text_input", "HTML-TEXT-INPUT", 1, 2, false);
		declareFunction(me, "html_scripted_text_input", "HTML-SCRIPTED-TEXT-INPUT", 2, 2, false);
		declareFunction(me, "html_disabled_text_input", "HTML-DISABLED-TEXT-INPUT", 1, 2, false);
		declareFunction(me, "html_format_input", "HTML-FORMAT-INPUT", 3, 4, false);
		declareFunction(me, "html_autocomplete_text_input", "HTML-AUTOCOMPLETE-TEXT-INPUT", 1, 4, false);
		declareFunction(me, "html_image_multi_submit", "HTML-IMAGE-MULTI-SUBMIT", 1, 1, false);
		declareFunction(me, "html_extract_multi_submit_input", "HTML-EXTRACT-MULTI-SUBMIT-INPUT", 2, 0, false);
		declareFunction(me, "html_extract_multi_submit_input_internal", "HTML-EXTRACT-MULTI-SUBMIT-INPUT-INTERNAL", 3, 0, false);
		declareFunction(me, "html_indent_table_internal", "HTML-INDENT-TABLE-INTERNAL", 1, 0, false);
		declareFunction(me, "html_indent_row_internal", "HTML-INDENT-ROW-INTERNAL", 1, 0, false);
		declareFunction(me, "html_target_definition", "HTML-TARGET-DEFINITION", 1, 0, false);
		declareFunction(me, "html_basefont", "HTML-BASEFONT", 1, 0, false);
		declareFunction(me, "html_word_break", "HTML-WORD-BREAK", 0, 0, false);
		declareFunction(me, "html_print_lexicon_entry", "HTML-PRINT-LEXICON-ENTRY", 1, 0, false);
		declareFunction(me, "html_print_form", "HTML-PRINT-FORM", 1, 2, false);
		declareFunction(me, "html_basic_image", "HTML-BASIC-IMAGE", 1, 3, false);
		declareFunction(me, "html_table_row_list", "HTML-TABLE-ROW-LIST", 1, 0, false);
		declareFunction(me, "html_table_heading_list", "HTML-TABLE-HEADING-LIST", 1, 0, false);
		declareFunction(me, "html_percent_progress_bar", "HTML-PERCENT-PROGRESS-BAR", 2, 3, false);
		declareMacro(me, "html_fancy_percent_progress_bar", "HTML-FANCY-PERCENT-PROGRESS-BAR");
		declareFunction(me, "html_fancy_percent_progress_bar_widths", "HTML-FANCY-PERCENT-PROGRESS-BAR-WIDTHS", 3, 0, false);
		declareFunction(me, "html_progress_section", "HTML-PROGRESS-SECTION", 0, 5, false);
		declareFunction(me, "html_horizontal_bar_graph", "HTML-HORIZONTAL-BAR-GRAPH", 1, 4, false);
		declareFunction(me, "html_draw_bargraph_label", "HTML-DRAW-BARGRAPH-LABEL", 1, 0, false);
		declareFunction(me, "html_draw_bargraph_colorbar", "HTML-DRAW-BARGRAPH-COLORBAR", 4, 0, false);
		declareFunction(me, "html_control_parameter_chooser", "HTML-CONTROL-PARAMETER-CHOOSER", 1, 1, false);
		declareFunction(me, "html_extract_control_parameter_value", "HTML-EXTRACT-CONTROL-PARAMETER-VALUE", 2, 0, false);
		declareFunction(me, "html_set_control_parameter", "HTML-SET-CONTROL-PARAMETER", 2, 0, false);
		declareFunction(me, "html_control_parameter_entry_name", "HTML-CONTROL-PARAMETER-ENTRY-NAME", 1, 0, false);
		declareFunction(me, "html_control_parameter_radio_name", "HTML-CONTROL-PARAMETER-RADIO-NAME", 1, 0, false);
		declareFunction(me, "html_select_from_list", "HTML-SELECT-FROM-LIST", 3, 1, false);
		declareFunction(me, "matching_html_field", "MATCHING-HTML-FIELD", 1, 0, false);
		declareFunction(me, "matching_html_button_field", "MATCHING-HTML-BUTTON-FIELD", 1, 0, false);
		declareFunction(me, "html_extract_input", "HTML-EXTRACT-INPUT", 2, 0, false);
		declareFunction(me, "html_extract_input_values", "HTML-EXTRACT-INPUT-VALUES", 2, 0, false);
		declareFunction(me, "html_extract_value", "HTML-EXTRACT-VALUE", 2, 1, false);
		declareFunction(me, "html_extract_integer", "HTML-EXTRACT-INTEGER", 2, 1, false);
		declareFunction(me, "html_extract_date", "HTML-EXTRACT-DATE", 2, 1, false);
		declareFunction(me, "html_extract_keyword", "HTML-EXTRACT-KEYWORD", 2, 1, false);
		declareFunction(me, "html_extract_string", "HTML-EXTRACT-STRING", 2, 1, false);
		declareFunction(me, "html_extract_boolean", "HTML-EXTRACT-BOOLEAN", 2, 1, false);
		declareFunction(me, "html_extract_sexpr", "HTML-EXTRACT-SEXPR", 2, 1, false);
		declareFunction(me, "html_extract_cyclified_sexpr", "HTML-EXTRACT-CYCLIFIED-SEXPR", 2, 1, false);
		declareFunction(me, "html_extract_sexpr_int", "HTML-EXTRACT-SEXPR-INT", 4, 0, false);
		declareFunction(me, "html_extract_button_value", "HTML-EXTRACT-BUTTON-VALUE", 2, 1, false);
		declareFunction(me, "decode_html_language_abbreviation", "DECODE-HTML-LANGUAGE-ABBREVIATION", 1, 0, false);
		declareFunction(me, "html_glyph", "HTML-GLYPH", 1, 1, false);
		declareFunction(me, "html_glyph_markup", "HTML-GLYPH-MARKUP", 1, 0, false);
		declareFunction(me, "html_declare_glyph", "HTML-DECLARE-GLYPH", 2, 0, false);
		declareFunction(me, "html_unicode_char", "HTML-UNICODE-CHAR", 1, 1, false);
		declareFunction(me, "html_create_listbox", "HTML-CREATE-LISTBOX", 2, 4, false);
		declareFunction(me, "html_create_radiobox_form", "HTML-CREATE-RADIOBOX-FORM", 2, 3, false);
		declareFunction(me, "html_create_multiple_selection_listbox", "HTML-CREATE-MULTIPLE-SELECTION-LISTBOX", 2, 3, false);
		declareFunction(me, "html_create_dropdown_list", "HTML-CREATE-DROPDOWN-LIST", 2, 4, false);
		declareFunction(me, "html_create_simple_dropdown_list", "HTML-CREATE-SIMPLE-DROPDOWN-LIST", 2, 1, false);
		declareFunction(me, "create_listbox", "CREATE-LISTBOX", 2, 3, false);
		declareFunction(me, "create_multiple_selection_listbox", "CREATE-MULTIPLE-SELECTION-LISTBOX", 2, 3, false);
		declareFunction(me, "create_dropdown_list", "CREATE-DROPDOWN-LIST", 2, 3, false);
		declareFunction(me, "create_simple_dropdown_list", "CREATE-SIMPLE-DROPDOWN-LIST", 2, 1, false);
		declareFunction(me, "get_encoded_form_field_name", "GET-ENCODED-FORM-FIELD-NAME", 1, 0, false);
		declareFunction(me, "extract_encoded_form_field_value", "EXTRACT-ENCODED-FORM-FIELD-VALUE", 2, 0, false);
		declareFunction(me, "encode_form_field_name", "ENCODE-FORM-FIELD-NAME", 1, 0, false);
		declareFunction(me, "html_echo_args", "HTML-ECHO-ARGS", 1, 0, false);
		declareFunction(me, "html_echo_file", "HTML-ECHO-FILE", 1, 0, false);
		declareFunction(me, "remove_html_tags", "REMOVE-HTML-TAGS", 1, 1, false);
		declareFunction(me, "convert_html_to_text", "CONVERT-HTML-TO-TEXT", 1, 0, false);
		declareFunction(me, "url_to_text", "URL-TO-TEXT", 1, 0, false);
		declareFunction(me, "generate_html_filename_input_fieldname", "GENERATE-HTML-FILENAME-INPUT-FIELDNAME", 1, 0, false);
		declareFunction(me, "html_filename_input", "HTML-FILENAME-INPUT", 3, 0, false);
		declareMacro(me, "html_with_file_transmitting_form", "HTML-WITH-FILE-TRANSMITTING-FORM");
		declareFunction(me, "html_arguments_contain_multipart_form_dataP", "HTML-ARGUMENTS-CONTAIN-MULTIPART-FORM-DATA?", 1, 0, false);
		declareFunction(me, "html_parse_multipart_form_data", "HTML-PARSE-MULTIPART-FORM-DATA", 1, 0, false);
		declareFunction(me, "html_parse_consume_separator", "HTML-PARSE-CONSUME-SEPARATOR", 2, 0, false);
		declareFunction(me, "html_parse_data_name_from_content_disposition", "HTML-PARSE-DATA-NAME-FROM-CONTENT-DISPOSITION", 1, 0, false);
		declareFunction(me, "html_parse_multipart_form_line", "HTML-PARSE-MULTIPART-FORM-LINE", 2, 0, false);
		declareFunction(me, "html_construct_message_from_multipart_data", "HTML-CONSTRUCT-MESSAGE-FROM-MULTIPART-DATA", 1, 0, false);
		declareFunction(me, "html_request_arguments_are_multipart_dataP", "HTML-REQUEST-ARGUMENTS-ARE-MULTIPART-DATA?", 1, 0, false);
		declareFunction(me, "html_treemap_table", "HTML-TREEMAP-TABLE", 1, 4, false);
		declareFunction(me, "treemap_size", "TREEMAP-SIZE", 1, 0, false);
		declareFunction(me, "treemap_class_size", "TREEMAP-CLASS-SIZE", 2, 0, false);
		declareFunction(me, "build_treemap", "BUILD-TREEMAP", 5, 0, false);
		declareFunction(me, "html_treemap_table_recursive", "HTML-TREEMAP-TABLE-RECURSIVE", 5, 0, false);
		declareFunction(me, "compute_treemap_color", "COMPUTE-TREEMAP-COLOR", 3, 0, false);
		declareFunction(me, "build_treemap_recursive", "BUILD-TREEMAP-RECURSIVE", 6, 0, false);
		declareFunction(me, "treemap_entry_for_node", "TREEMAP-ENTRY-FOR-NODE", 4, 0, false);
		declareFunction(me, "html_user_id_and_password", "HTML-USER-ID-AND-PASSWORD", 0, 6, false);
		return NIL;
	}

	public static SubLObject init_html_utilities_file() {
		defparameter("*CB-USE-FRAMES*", T);
		defparameter("*USE-NEW-HTML-PRINC-CYCL-STRING?*", T);
		defparameter("*HTML-STALE-CONSTANT-REFERENCE-COLOR*", NIL);
		defparameter("*HTML-URL-PRINC-ESCAPE-SPACES*", T);
		defparameter("*HTML-STYLE-BACKGROUND*", $str48$background_color_);
		defparameter("*HTML-ALIGN-MAP*", $list49);
		defparameter("*CYCORP-HOMEPAGE-URL*", $str50$http___www_cyc_com);
		defparameter("*CYCORP-HOMEPAGE-TEXT*", $$$Cycorp);
		deflexical("*PROPRIETARITY-MESSAGE*", SubLTrampolineFile.maybeDefault($proprietarity_message$, $proprietarity_message$, $str47$));
		defparameter("*HTML-EXTRACT-FIELD-NAME*", NIL);
		deflexical("*URL-TO-TEXT-REPLACEMENTS*", $list689);
		deflexical("*HTML-FILENAME-INPUT-PREFIX*", $str696$_file_input_);
		deflexical("*HTML-MULTIPART-FORM-DATE*", $str710$_multipart_formdata);
		defconstant("*HTML-NEWLINE-STRING*", Strings.make_string(ONE_INTEGER, CHAR_newline));
		deflexical("*HTML-MULTIPART-CONTENT-MARKER*", $str716$____________________);
		deflexical("*HTML-MULTIPART-CONTENT-MARKER-SIZE*", length($html_multipart_content_marker$.getGlobalValue()));
		defparameter("*BUILD-TREEMAP-DEPTH*", ZERO_INTEGER);
		deflexical("*BUILD-TREEMAP-MAX-DEPTH*", TEN_INTEGER);
		defconstant("*HTML-UTILS-TEST*", $$$HTML_Utilities_Test);
		defconstant("*HTML-UTILS-TEST-CATEGORY*", cconcatenate($html_utils_test$.getGlobalValue(), $$$_Category));
		defconstant("*HTML-UTILS-TEST-SUITE*", cconcatenate($html_utils_test$.getGlobalValue(), $$$_Suite));
		defconstant("*HTML-UTILS-MODULE*", $str746$HTML_Utilities);
		return NIL;
	}

	public static SubLObject setup_html_utilities_file() {
		register_html_state_variable($cb_use_frames$);
		register_html_interface_variable($cb_use_frames$);
		define_test_case_table_int(OPENCYC_HTML_CYCL_STRING, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list37);
		declare_defglobal($proprietarity_message$);
		sethash($CYC_LOGO_SMALL_VIOLET_FULL_URL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str57$cyc_logo_violet_16_gif, NIL));
		sethash($CYC_LOGO_LARGE_VIOLET_FULL_URL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str59$cyc_logo_violet_60_gif, NIL));
		sethash($CYCORP_SYMBOL_TINY, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str61$cyc_logo_tiny_gif, NIL));
		sethash($CYCORP_SYMBOL_SMALL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str63$cyc_logo_sm_gif, NIL));
		sethash($CYCORP_SYMBOL_MEDIUM, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str65$cyc_logo_10_t_gif, NIL));
		sethash($CYCORP_LOGO_MEDIUM, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str67$cyc_logo_25_t_gif, NIL));
		sethash($CYCORP_LOGO_BIG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str69$cyc_logo_50_t_gif, NIL));
		register_macro_helper(HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS, HTML_FANCY_PERCENT_PROGRESS_BAR);
		html_declare_glyph($LT, $str197$_lt_);
		html_declare_glyph($GT, $str199$_gt_);
		html_declare_glyph($AMP, $str201$_amp_);
		html_declare_glyph($QUOT, $str203$_quot_);
		html_declare_glyph($REG, $str205$_reg_);
		html_declare_glyph($COPY, $str207$_copy_);
		html_declare_glyph($NBSP, $str208$_nbsp_);
		html_declare_glyph($EMSP, $str210$_emsp_);
		html_declare_glyph($ENSP, $str212$_ensp_);
		html_declare_glyph($SPACE, $str214$__X0020_);
		html_declare_glyph($EM_SPACE, $str216$__X2003_);
		html_declare_glyph($EN_SPACE, $str218$__X2002_);
		html_declare_glyph($TWO_PER_EM_SPACE, html_glyph_markup($EN_SPACE));
		html_declare_glyph($THREE_PER_EM_SPACE, $str221$__X2004_);
		html_declare_glyph($FOUR_PER_EM_SPACE, $str223$__X2005_);
		html_declare_glyph($SIX_PER_EM_SPACE, $str225$__X2006_);
		html_declare_glyph($THIN_SPACE, $str227$__X2009_);
		html_declare_glyph($HAIR_SPACE, $str229$__X200A_);
		html_declare_glyph($IEXCL, $str231$_iexcl_);
		html_declare_glyph($CENT, $str233$_cent_);
		html_declare_glyph($POUND, $str235$_pound_);
		html_declare_glyph($CURREN, $str237$_curren_);
		html_declare_glyph($YEN, $str239$_yen_);
		html_declare_glyph($BRVBAR, $str241$_brvba_);
		html_declare_glyph($SECT, $str243$_sect_);
		html_declare_glyph($UML, $str245$_uml_);
		html_declare_glyph($COPY, $str207$_copy_);
		html_declare_glyph($ORDF, $str247$_ordf_);
		html_declare_glyph($LAQUO, $str249$_laquo_);
		html_declare_glyph($NOT, $str251$_not_);
		html_declare_glyph($SHY, $str253$_shy_);
		html_declare_glyph($REG, $str205$_reg_);
		html_declare_glyph($MACR, $str255$_macr_);
		html_declare_glyph($DEG, $str257$_deg_);
		html_declare_glyph($PLUSMN, $str259$_plusmn_);
		html_declare_glyph($SUP2, $str261$_sup2_);
		html_declare_glyph($SUP3, $str263$_sup3_);
		html_declare_glyph($ACUTE, $str265$_acute_);
		html_declare_glyph($MICRO, $str267$_micro_);
		html_declare_glyph($PARA, $str269$_para_);
		html_declare_glyph($MIDDOT, $str271$_middoy_);
		html_declare_glyph($CEDIL, $str273$_cedil_);
		html_declare_glyph($SUP1, $str275$_sup1_);
		html_declare_glyph($ORDM, $str277$_ordm_);
		html_declare_glyph($RAQUO, $str279$_raquo_);
		html_declare_glyph($FRAC14, $str281$_frac14_);
		html_declare_glyph($FRAC12, $str283$_frac12_);
		html_declare_glyph($FRAC34, $str285$_frac34_);
		html_declare_glyph($IQUEST, $str287$_iquest_);
		html_declare_glyph($AGRAVE_CAP, $str289$_Agrave_);
		html_declare_glyph($AACUTE_CAP, $str291$_Aacute_);
		html_declare_glyph($ACIRC_CAP, $str293$_Acirc_);
		html_declare_glyph($ATILDE_CAP, $str295$_Atilde_);
		html_declare_glyph($AUML_CAP, $str297$_Auml_);
		html_declare_glyph($ARING_CAP, $str299$_Aring_);
		html_declare_glyph($AELIG_CAP, $str301$_AElig_);
		html_declare_glyph($CCEDIL_CAP, $str303$_Ccedil_);
		html_declare_glyph($EGRAVE_CAP, $str305$_Egrave_);
		html_declare_glyph($EACUTE_CAP, $str307$_Eacute_);
		html_declare_glyph($ECIRC_CAP, $str309$_Ecirc_);
		html_declare_glyph($EUML_CAP, $str311$_Euml_);
		html_declare_glyph($IGRAVE_CAP, $str313$_Igrave_);
		html_declare_glyph($IACUTE_CAP, $str315$_Iacute_);
		html_declare_glyph($ICIRC_CAP, $str317$_Icirc_);
		html_declare_glyph($IUML_CAP, $str319$_Iuml_);
		html_declare_glyph($ETH_CAP, $str321$_ETH_);
		html_declare_glyph($NTILDE_CAP, $str323$_Ntilde_);
		html_declare_glyph($OGRAVE_CAP, $str325$_Ograve_);
		html_declare_glyph($OACUTE_CAP, $str327$_Oacute_);
		html_declare_glyph($OCIRC_CAP, $str329$_Ocirc_);
		html_declare_glyph($OTILDE_CAP, $str331$_Otilde_);
		html_declare_glyph($OUML_CAP, $str333$_Ouml_);
		html_declare_glyph($TIMES, $str335$_times_);
		html_declare_glyph($OSLASH_CAP, $str337$_Oslash_);
		html_declare_glyph($UGRAVE_CAP, $str339$_Ugrave_);
		html_declare_glyph($UACUTE_CAP, $str341$_Uacute_);
		html_declare_glyph($UCIRC_CAP, $str343$_Ucirc_);
		html_declare_glyph($UUML_CAP, $str345$_Uuml_);
		html_declare_glyph($YACUTE_CAP, $str347$_Yacute_);
		html_declare_glyph($THORN_CAP, $str349$_THORN_);
		html_declare_glyph($SZLIG, $str351$_szlig_);
		html_declare_glyph($AGRAVE, $str353$_agrave_);
		html_declare_glyph($AACUTE, $str355$_aacute_);
		html_declare_glyph($ACIRC, $str357$_acirc_);
		html_declare_glyph($ATILDE, $str359$_atilde_);
		html_declare_glyph($AUML, $str361$_auml_);
		html_declare_glyph($ARING, $str363$_aring_);
		html_declare_glyph($AELIG, $str365$_aelig_);
		html_declare_glyph($CCEDIL, $str367$_ccedil_);
		html_declare_glyph($EGRAVE, $str369$_egrave_);
		html_declare_glyph($EACUTE, $str371$_eacute_);
		html_declare_glyph($ECIRC, $str373$_ecirc_);
		html_declare_glyph($EUML, $str375$_euml_);
		html_declare_glyph($IGRAVE, $str377$_igrave_);
		html_declare_glyph($IACUTE, $str379$_iacute_);
		html_declare_glyph($ICIRC, $str381$_icirc_);
		html_declare_glyph($IUML, $str383$_iuml_);
		html_declare_glyph($ETH, $str385$_eth_);
		html_declare_glyph($NTILDE, $str387$_ntilde_);
		html_declare_glyph($OGRAVE, $str389$_ograve_);
		html_declare_glyph($OACUTE, $str391$_oacute_);
		html_declare_glyph($OCIRC, $str393$_ocirc_);
		html_declare_glyph($OTILDE, $str395$_otilde_);
		html_declare_glyph($OUML, $str397$_ouml_);
		html_declare_glyph($DIVIDE, $str399$_divide_);
		html_declare_glyph($OSLASH, $str401$_oslash_);
		html_declare_glyph($UGRAVE, $str403$_ugrave_);
		html_declare_glyph($UACUTE, $str405$_uacute_);
		html_declare_glyph($UCIRC, $str407$_ucirc_);
		html_declare_glyph($UUML, $str409$_uuml_);
		html_declare_glyph($YACUTE, $str411$_yacute_);
		html_declare_glyph($THORN, $str413$_thorn_);
		html_declare_glyph($YUML, $str415$_yuml_);
		html_declare_glyph($FNOF, $str417$_fnof_);
		html_declare_glyph($ALPHA_CAP, $str419$_Alpha_);
		html_declare_glyph($BETA_CAP, $str421$_Beta_);
		html_declare_glyph($GAMMA_CAP, $str423$_Gamma_);
		html_declare_glyph($DELTA_CAP, $str425$_Delta_);
		html_declare_glyph($EPSILON_CAP, $str427$_Epsilon_);
		html_declare_glyph($ZETA_CAP, $str429$_Zeta_);
		html_declare_glyph($ETA_CAP, $str431$_Eta_);
		html_declare_glyph($THETA_CAP, $str433$_Theta_);
		html_declare_glyph($IOTA_CAP, $str435$_Iota_);
		html_declare_glyph($KAPPA_CAP, $str437$_Kappa_);
		html_declare_glyph($LAMBDA_CAP, $str439$_Lambda_);
		html_declare_glyph($MU_CAP, $str441$_Mu_);
		html_declare_glyph($NU_CAP, $str443$_Nu_);
		html_declare_glyph($XI_CAP, $str445$_Xi_);
		html_declare_glyph($OMICRON_CAP, $str447$_Omicron_);
		html_declare_glyph($PI_CAP, $str449$_Pi_);
		html_declare_glyph($RHO_CAP, $str451$_Rho_);
		html_declare_glyph($SIGMA_CAP, $str453$_Sigma_);
		html_declare_glyph($TAU_CAP, $str455$_Tau_);
		html_declare_glyph($UPSILON_CAP, $str457$_Upsilon_);
		html_declare_glyph($PHI_CAP, $str459$_Phi_);
		html_declare_glyph($CHI_CAP, $str461$_Chi_);
		html_declare_glyph($PSI_CAP, $str463$_Psi_);
		html_declare_glyph($OMEGA_CAP, $str465$_Omega_);
		html_declare_glyph($ALPHA, $str467$_alpha_);
		html_declare_glyph($BETA, $str469$_beta_);
		html_declare_glyph($GAMMA, $str471$_gamma_);
		html_declare_glyph($DELTA, $str473$_delta_);
		html_declare_glyph($EPSILON, $str475$_epsilon_);
		html_declare_glyph($ZETA, $str477$_zeta_);
		html_declare_glyph($ETA, $str479$_eta_);
		html_declare_glyph($THETA, $str481$_theta_);
		html_declare_glyph($IOTA, $str483$_iota_);
		html_declare_glyph($KAPPA, $str485$_kappa_);
		html_declare_glyph($LAMBDA, $str487$_lambda_);
		html_declare_glyph($MU, $str489$_mu_);
		html_declare_glyph($NU, $str491$_nu_);
		html_declare_glyph($XI, $str493$_xi_);
		html_declare_glyph($OMICRON, $str495$_omicron_);
		html_declare_glyph($PI, $str497$_pi_);
		html_declare_glyph($RHO, $str499$_rho_);
		html_declare_glyph($SIGMAF, $str501$_sigmaf_);
		html_declare_glyph($SIGMA, $str503$_sigma_);
		html_declare_glyph($TAU, $str505$_tau_);
		html_declare_glyph($UPSILON, $str507$_upsilon_);
		html_declare_glyph($PHI, $str509$_phi_);
		html_declare_glyph($CHI, $str511$_chi_);
		html_declare_glyph($PSI, $str513$_psi_);
		html_declare_glyph($OMEGA, $str515$_omega_);
		html_declare_glyph($THETASYM, $str481$_theta_);
		html_declare_glyph($UPSIH, $str518$_upsih_);
		html_declare_glyph($PIV, $str520$_piv_);
		html_declare_glyph($BULL, $str522$_bull_);
		html_declare_glyph($HELLIP, $str524$_hellip_);
		html_declare_glyph($PRIME, $str526$_prime_);
		html_declare_glyph($PRIME_DBL, $str528$_Prime_);
		html_declare_glyph($OLINE, $str530$_oline_);
		html_declare_glyph($FRASL, $str532$_frasl_);
		html_declare_glyph($WEIERP, $str534$_weierp_);
		html_declare_glyph($IMAGE, $str536$_image_);
		html_declare_glyph($REAL, $str538$_real_);
		html_declare_glyph($TRADE, $str540$_trade_);
		html_declare_glyph($ALEFSYM, $str542$_alefsym_);
		html_declare_glyph($UPWARDS_ARROW, $str544$_uarr_);
		html_declare_glyph($RIGHTWARDS_ARROW, $str546$_rarr_);
		html_declare_glyph($LARR, $str548$_larr_);
		html_declare_glyph($UARR, $str544$_uarr_);
		html_declare_glyph($RARR, $str546$_rarr_);
		html_declare_glyph($DARR, $str552$_darr_);
		html_declare_glyph($HARR, $str554$_harr_);
		html_declare_glyph($CRARR, $str556$_crarr_);
		html_declare_glyph($LARR_DBL, $str558$_lArr_);
		html_declare_glyph($UARR_DBL, $str560$_uArr_);
		html_declare_glyph($RARR_DBL, $str562$_rArr_);
		html_declare_glyph($DARR_DBL, $str564$_dArr_);
		html_declare_glyph($HARR_DBL, $str566$_hArr_);
		html_declare_glyph($FORALL, $str568$_forall_);
		html_declare_glyph($PART, $str570$_part_);
		html_declare_glyph($EXIST, $str572$_exist_);
		html_declare_glyph($EMPTY, $str574$_empty_);
		html_declare_glyph($NABLA, $str576$_nabla_);
		html_declare_glyph($ISIN, $str578$_isin_);
		html_declare_glyph($NOTIN, $str580$_notin_);
		html_declare_glyph($NI, $str582$_ni_);
		html_declare_glyph($PROD, $str584$_prod_);
		html_declare_glyph($SUM, $str586$_sum_);
		html_declare_glyph($MINUS, $str588$_minus_);
		html_declare_glyph($LOWAST, $str590$_lowast_);
		html_declare_glyph($RADIC, $str592$_radic_);
		html_declare_glyph($PROP, $str594$_prop_);
		html_declare_glyph($INFIN, $str596$_infin_);
		html_declare_glyph($ANG, $str598$_ang_);
		html_declare_glyph($AND, $str600$_and_);
		html_declare_glyph($OR, $str602$_or_);
		html_declare_glyph($CAP, $str604$_cap_);
		html_declare_glyph($CUP, $str606$_cup_);
		html_declare_glyph($INT, $str608$_int_);
		html_declare_glyph($THERE4, $str610$_there4_);
		html_declare_glyph($SIM, $str612$_sim_);
		html_declare_glyph($CONG, $str614$_cong_);
		html_declare_glyph($ASYMP, $str616$_asymp_);
		html_declare_glyph($NE, $str618$_ne_);
		html_declare_glyph($EQUIV, $str620$_equiv_);
		html_declare_glyph($LE, $str622$_le_);
		html_declare_glyph($GE, $str624$_ge_);
		html_declare_glyph($SUB, $str626$_sub_);
		html_declare_glyph($SUP, $str628$_sup_);
		html_declare_glyph($NSUB, $str630$_nsub_);
		html_declare_glyph($SUBE, $str632$_sube_);
		html_declare_glyph($SUPE, $str634$_supe_);
		html_declare_glyph($OPLUS, $str636$_oplus_);
		html_declare_glyph($OTIMES, $str638$_otimes_);
		html_declare_glyph($PERP, $str640$_perp_);
		html_declare_glyph($SDOT, $str642$_sdot_);
		html_declare_glyph($LCEIL, $str644$_lceil_);
		html_declare_glyph($RCEIL, $str646$_rceil_);
		html_declare_glyph($LFLOOR, $str648$_lfloor_);
		html_declare_glyph($RFLOOR, $str650$_rfloor_);
		html_declare_glyph($LANG, $str652$_lang_);
		html_declare_glyph($RANG, $str654$_rang_);
		html_declare_glyph($LOZ, $str656$_loz_);
		html_declare_glyph($SPADES, $str658$_spades_);
		html_declare_glyph($CLUBS, $str660$_clubs_);
		html_declare_glyph($HEARTS, $str662$_hearts_);
		html_declare_glyph($DIAMS, $str664$_diams_);
		html_declare_glyph($FROWNY_FACE, $str666$__9785_);
		html_macros.note_cgi_handler_function(HTML_ECHO_ARGS, $HTML_HANDLER);
		html_macros.note_cgi_handler_function(HTML_ECHO_FILE, $HTML_HANDLER);
		sunit_external.define_test_category($html_utils_test_category$.getGlobalValue(), UNPROVIDED);
		sunit_external.define_test_suite($html_utils_test_suite$.getGlobalValue(), list($html_utils_test_category$.getGlobalValue()), UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_html_utilities_file();
	}

	@Override
	public void initializeVariables() {
		init_html_utilities_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_html_utilities_file();
	}

	
}

/**
 * Total time: 2858 ms
 */
