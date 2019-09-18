/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cb_utilities.cb_term_identifier;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$html_icon_definitions$;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$javascript_definitions$;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.get_html_icon_alt_string;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.html_icon_src;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.javascript_file_path;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_terpri;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      DHTML-MACROS
 * source file: /cyc/top/cycl/dhtml-macros.lisp
 * created:     2019/07/03 17:37:06
 */
public final class dhtml_macros extends SubLTranslatedFile implements V12 {
	//private static SubLSymbol $javascript_definitions$;

	public static final SubLObject with_dhtml_devedge_menues(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return list(PROGN, $list_alt174, $list_alt175, bq_cons(PROGN, append(body, NIL)));
		}
	}

	public static final SubLObject dhtml_header_stylesheet_links_for_devedge_menu() {
		com.cyc.cycjava.cycl.dhtml_macros.dhtml_emit_devedge_menus_header_links();
		com.cyc.cycjava.cycl.dhtml_macros.dhtml_emit_devedge_menus_scripts();
		return NIL;
	}

	public static final SubLObject dhtml_emit_devedge_menus_scripts() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject type = $str_alt66$text_javascript;
				SubLObject language = $$$javascript;
				html_source_readability_terpri(UNPROVIDED);
				html_markup(html_macros.$html_script_head$.getGlobalValue());
				html_markup(html_macros.$html_script_language$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(language);
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_script_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($dhtml_devedge_scripts_dhtml$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_script_type$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(type);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				{
					SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
					}
				}
				html_markup(html_macros.$html_script_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				html_markup(html_macros.$html_script_head$.getGlobalValue());
				html_markup(html_macros.$html_script_language$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(language);
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_script_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($dhtml_devedge_scripts_cssjsmenu$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_script_type$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(type);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				{
					SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
					}
				}
				html_markup(html_macros.$html_script_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
				html_markup(html_macros.$html_script_head$.getGlobalValue());
				html_markup(html_macros.$html_script_language$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(language);
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_script_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($dhtml_devedge_scripts_config_js$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_script_type$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(type);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				{
					SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
					}
				}
				html_markup(html_macros.$html_script_tail$.getGlobalValue());
			}
			return NIL;
		}
	}

	public static final SubLObject dhtml_emit_devedge_menus_header_links() {
		html_macros.html_stylesheet_link($dhtml_devedge_menus_dhtml$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		html_macros.html_stylesheet_link($dhtml_devedge_menus_hover$.getGlobalValue(), $$$hoverJS, UNPROVIDED, UNPROVIDED);
		html_macros.html_stylesheet_link($dhtml_devedge_menus_preso$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static final SubLObject dhtml_devedge_submenu_item(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return bq_cons(HTML_LIST_ITEM, append(body, NIL));
		}
	}

	public static final SubLObject dhtml_devedge_submenu(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject title_form = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt182);
			title_form = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				return list(HTML_FANCY_LIST_ITEM, $list_alt184, list(PROGN, list(PROGN, title_form), list(PROGN, bq_cons(HTML_UNORDERED_LIST, append(body, NIL)))));
			}
		}
	}

	public static final SubLObject dhtml_devedge_menu(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return list(HTML_FANCY_DIV, $list_alt179, listS(HTML_FANCY_UNORDERED_LIST, $list_alt181, append(body, NIL)));
		}
	}

	static private final SubLString $str_alt97$ = makeString("");

	// deflexical
	@LispMethod(comment = "deflexical")
	public static final SubLSymbol $dhtml_devedge_submenu_class$ = makeSymbol("*DHTML-DEVEDGE-SUBMENU-CLASS*");

	// deflexical
	@LispMethod(comment = "deflexical")
	public static final SubLSymbol $dhtml_devedge_menu_system_class$ = makeSymbol("*DHTML-DEVEDGE-MENU-SYSTEM-CLASS*");

	// deflexical
	@LispMethod(comment = "deflexical")
	public static final SubLSymbol $dhtml_devedge_menu_class$ = makeSymbol("*DHTML-DEVEDGE-MENU-CLASS*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $dhtml_devedge_scripts_config_js$ = makeSymbol("*DHTML-DEVEDGE-SCRIPTS-CONFIG-JS*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $dhtml_devedge_scripts_cssjsmenu$ = makeSymbol("*DHTML-DEVEDGE-SCRIPTS-CSSJSMENU*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $dhtml_devedge_scripts_dhtml$ = makeSymbol("*DHTML-DEVEDGE-SCRIPTS-DHTML*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $dhtml_devedge_menus_preso$ = makeSymbol("*DHTML-DEVEDGE-MENUS-PRESO*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $dhtml_devedge_menus_hover$ = makeSymbol("*DHTML-DEVEDGE-MENUS-HOVER*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $dhtml_devedge_menus_dhtml$ = makeSymbol("*DHTML-DEVEDGE-MENUS-DHTML*");

	// deflexical
	@LispMethod(comment = "deflexical")
	public static final SubLSymbol $dhtml_toggle_visibility_js$ = makeSymbol("*DHTML-TOGGLE-VISIBILITY-JS*");

	// deflexical
	@LispMethod(comment = "deflexical")
	public static final SubLSymbol $dhtml_find_dom_js$ = makeSymbol("*DHTML-FIND-DOM-JS*");

	public static final SubLFile me = new dhtml_macros();

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_css_head$ = makeSymbol("*DHTML-CSS-HEAD*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_css_type$ = makeSymbol("*DHTML-CSS-TYPE*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_css_media$ = makeSymbol("*DHTML-CSS-MEDIA*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_css_tail$ = makeSymbol("*DHTML-CSS-TAIL*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_dom_position$ = makeSymbol("*DHTML-DOM-POSITION*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_dom_top$ = makeSymbol("*DHTML-DOM-TOP*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_dom_bottom$ = makeSymbol("*DHTML-DOM-BOTTOM*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_dom_right$ = makeSymbol("*DHTML-DOM-RIGHT*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_dom_left$ = makeSymbol("*DHTML-DOM-LEFT*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_dom_visibility$ = makeSymbol("*DHTML-DOM-VISIBILITY*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_dom_display$ = makeSymbol("*DHTML-DOM-DISPLAY*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_dom_height$ = makeSymbol("*DHTML-DOM-HEIGHT*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_dom_width$ = makeSymbol("*DHTML-DOM-WIDTH*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dhtml_blank_href_js$ = makeSymbol("*DHTML-BLANK-HREF-JS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $html_element_id$ = makeSymbol("*HTML-ELEMENT-ID*");

	// deflexical
	@LispMethod(comment = "deflexical")
	public static final SubLSymbol $js_load_later$ = makeSymbol("*JS-LOAD-LATER*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $kea_set_focal_tool$ = makeSymbol("*KEA-SET-FOCAL-TOOL*");

	// Internal Constants
	@LispMethod(comment = "Internal Constants")
	static private final SubLString $str0$_style = makeString("<style");

	static private final SubLString $str1$_type_ = makeString(" type=");

	static private final SubLString $str2$_media_ = makeString(" media=");

	static private final SubLString $str3$__style_ = makeString("</style>");

	static private final SubLList $list4 = list(list(makeSymbol("&OPTIONAL"), list(makeSymbol("TYPE"), makeString("text/css")), list(makeSymbol("MEDIA"), makeString("screen"))), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLString $str5$text_css = makeString("text/css");

	static private final SubLString $$$screen = makeString("screen");

	private static final SubLSymbol HTML_QUOTED_ATTRIBUTE = makeSymbol("HTML-QUOTED-ATTRIBUTE");

	static private final SubLList $list8 = list(makeSymbol("*DHTML-CSS-TYPE*"));

	static private final SubLList $list10 = list(makeSymbol("*DHTML-CSS-MEDIA*"));

	private static final SubLSymbol HTML_MARKUP_WRAPPER = makeSymbol("HTML-MARKUP-WRAPPER");

	static private final SubLList $list13 = list(makeSymbol("*DHTML-CSS-HEAD*"), makeSymbol("*DHTML-CSS-TAIL*"));

	private static final SubLSymbol HTML_MARKUP_BODY = makeSymbol("HTML-MARKUP-BODY");

	static private final SubLList $list15 = list(list(makeSymbol("HTML-TERPRI")));

	static private final SubLString $$$position = makeString("position");

	static private final SubLString $$$top = makeString("top");

	static private final SubLString $$$bottom = makeString("bottom");

	static private final SubLString $$$right = makeString("right");

	static private final SubLString $$$left = makeString("left");

	static private final SubLString $$$visibility = makeString("visibility");

	static private final SubLString $$$display = makeString("display");

	static private final SubLString $$$height = makeString("height");

	static private final SubLString $$$width = makeString("width");

	static private final SubLList $list25 = list(list(makeSymbol("OBJECT-ID")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol DHTML_DOM_WRAPPER_PREAMBLE = makeSymbol("DHTML-DOM-WRAPPER-PREAMBLE");

	static private final SubLList $list27 = list(list(makeSymbol("DHTML-DOM-WRAPPER-POSTAMBLE")));

	private static final SubLSymbol DHTML_DOM_WRAPPER = makeSymbol("DHTML-DOM-WRAPPER");

	static private final SubLString $str29$__A__ = makeString("#~A {");

	private static final SubLSymbol DHTML_DOM_WRAPPER_POSTAMBLE = makeSymbol("DHTML-DOM-WRAPPER-POSTAMBLE");

	static private final SubLString $str31$__ = makeString(" }");

	static private final SubLList $list32 = list(list(makeSymbol("ATTRIBUTE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol DHTML_DOM_ATTRIBUTE_PREAMBLE = makeSymbol("DHTML-DOM-ATTRIBUTE-PREAMBLE");

	static private final SubLList $list34 = list(list(makeSymbol("DHTML-DOM-ATTRIBUTE-POSTAMBLE")));

	private static final SubLSymbol DHTML_DOM_ATTRIBUTE = makeSymbol("DHTML-DOM-ATTRIBUTE");

	static private final SubLString $str36$__A_ = makeString(" ~A:");

	private static final SubLSymbol DHTML_DOM_ATTRIBUTE_POSTAMBLE = makeSymbol("DHTML-DOM-ATTRIBUTE-POSTAMBLE");

	static private final SubLString $str38$_ = makeString(";");

	static private final SubLList $list39 = list(list(makeSymbol("OBJECT-ID"), list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("TOP"), makeSymbol("BOTTOM"), makeSymbol("RIGHT"), makeSymbol("LEFT"), makeSymbol("HEIGHT"), makeSymbol("WIDTH"), makeSymbol("POSITION"), makeSymbol("VISIBILITY"), makeSymbol("DISPLAY") }), makeSymbol("&BODY"), makeSymbol("BODY")));

	static private final SubLList $list40 = list(new SubLObject[] { makeKeyword("TOP"), makeKeyword("BOTTOM"), makeKeyword("RIGHT"), $LEFT, makeKeyword("HEIGHT"), makeKeyword("WIDTH"), makeKeyword("POSITION"), makeKeyword("VISIBILITY"), makeKeyword("DISPLAY") });

	private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

	static private final SubLList $list51 = list(makeSymbol("*DHTML-DOM-POSITION*"));

	static private final SubLList $list52 = list(makeSymbol("*DHTML-DOM-TOP*"));

	static private final SubLList $list53 = list(makeSymbol("*DHTML-DOM-BOTTOM*"));

	static private final SubLList $list54 = list(makeSymbol("*DHTML-DOM-LEFT*"));

	static private final SubLList $list55 = list(makeSymbol("*DHTML-DOM-RIGHT*"));

	static private final SubLList $list56 = list(makeSymbol("*DHTML-DOM-VISIBILITY*"));

	static private final SubLList $list57 = list(makeSymbol("*DHTML-DOM-DISPLAY*"));

	static private final SubLList $list58 = list(makeSymbol("*DHTML-DOM-HEIGHT*"));

	static private final SubLList $list59 = list(makeSymbol("*DHTML-DOM-WIDTH*"));

	static private final SubLList $list60 = list(makeSymbol("HTML-TERPRI"));

	private static final SubLString $str61$javascript_void____ = makeString("javascript:void('')");

	private static final SubLList $list65 = list(makeKeyword("PARAGRAPH"), $TEXT);

	private static final SubLList $list66 = list(makeKeyword("VISIBLE"), makeKeyword("INVISIBLE"));

	private static final SubLString $str69$_S_was_not_a_known_visibility_p = makeString("~S was not a known visibility-p");

	private static final SubLSymbol VISIBILITY_P = makeSymbol("VISIBILITY-P");

	private static final SubLSymbol FLOW_TYPE_P = makeSymbol("FLOW-TYPE-P");

	private static final SubLString $$$none = makeString("none");

	private static final SubLString $$$block = makeString("block");

	private static final SubLString $$$inline = makeString("inline");

	private static final SubLString $str77$setVisibility__ = makeString("setVisibility('");

	private static final SubLString $str78$___ = makeString("','");

	private static final SubLString $str79$___ = makeString("');");

	private static final SubLString $str81$_show_button = makeString("_show_button");

	private static final SubLString $str82$_hide_button = makeString("_hide_button");

	private static final SubLList $list84 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&KEY"), list(makeSymbol("INITIAL-VISIBILITY"), makeKeyword("VISIBLE")), list(makeSymbol("FLOW-TYPE"), $TEXT)), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list85 = list(makeKeyword("INITIAL-VISIBILITY"), makeKeyword("FLOW-TYPE"));

	private static final SubLSymbol DHTML_SET_VISIBILITY = makeSymbol("DHTML-SET-VISIBILITY");

	private static final SubLSymbol HTML_FANCY_DIV = makeSymbol("HTML-FANCY-DIV");

	private static final SubLList $list91 = list(list(makeSymbol("HTML-SOURCE-READABILITY-TERPRI")));

	private static final SubLSymbol DHTML_SET_SWITCHED_VISIBILITY = makeSymbol("DHTML-SET-SWITCHED-VISIBILITY");

	private static final SubLList $list93 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&KEY"), list(makeSymbol("STYLE"), makeString(""))), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list94 = list(makeKeyword("STYLE"));

	private static final SubLString $str96$ = makeString("");

	private static final SubLSymbol HTML_FANCY_SPAN = makeSymbol("HTML-FANCY-SPAN");

	private static final SubLSymbol DHTML_POTENTIALLY_SHOW_SWITCHED = makeSymbol("DHTML-POTENTIALLY-SHOW-SWITCHED");

	private static final SubLList $list99 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("VISIBILITY"), makeSymbol("&KEY"), makeSymbol("LINK-TEXT"), list(makeSymbol("FLOW-TYPE"), $TEXT)), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list100 = list(makeKeyword("LINK-TEXT"), makeKeyword("FLOW-TYPE"));

	private static final SubLSymbol $sym102$HREF = makeUninternedSymbol("HREF");

	private static final SubLSymbol $sym103$CLICK_ACTION = makeUninternedSymbol("CLICK-ACTION");

	private static final SubLList $list105 = list(makeSymbol("*DHTML-BLANK-HREF-JS*"));

	private static final SubLSymbol DHTML_GENERATE_VISIBILITY_SETTER = makeSymbol("DHTML-GENERATE-VISIBILITY-SETTER");

	private static final SubLList $list112 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&KEY"), makeSymbol("LINK-TEXT")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list113 = list(makeKeyword("LINK-TEXT"));

	private static final SubLSymbol $sym114$HREF = makeUninternedSymbol("HREF");

	private static final SubLSymbol $sym115$CLICK_ACTION = makeUninternedSymbol("CLICK-ACTION");

	private static final SubLSymbol DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE = makeSymbol("DHTML-VISIBILITY-GENERATE-JS-FOR-TOGGLE");

	private static final SubLList $list117 = list(list(makeSymbol("CLASS"), makeSymbol("&KEY"), makeSymbol("LINK-TEXT")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym118$HREF = makeUninternedSymbol("HREF");

	private static final SubLSymbol $sym119$CLICK_ACTION = makeUninternedSymbol("CLICK-ACTION");

	private static final SubLSymbol DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE = makeSymbol("DHTML-VISIBILITY-GENERATE-JS-FOR-CLASS-TOGGLE");

	private static final SubLSymbol DHTML_TOGGLE_VISIBILITY_LINK = makeSymbol("DHTML-TOGGLE-VISIBILITY-LINK");

	private static final SubLString $str123$toggleVisibility__ = makeString("toggleVisibility('");

	private static final SubLString $str125$__true = makeString(", true");

	private static final SubLString $str127$__false = makeString(", false");

	private static final SubLString $str128$toggleClassVisibility__ = makeString("toggleClassVisibility('");

	private static final SubLString $str129$_ = makeString("'");

	private static final SubLString $str130$__ = makeString(");");

	static private final SubLList $list131 = list(makeSymbol("OBJECT-ID"), makeSymbol("SHOW-LINK-CODE"), makeSymbol("HIDE-LINK-CODE"));

	private static final SubLSymbol $sym132$SHOW_ID = makeUninternedSymbol("SHOW-ID");

	private static final SubLSymbol $sym133$SHOW_ACTION = makeUninternedSymbol("SHOW-ACTION");

	private static final SubLSymbol $sym134$HIDE_ID = makeUninternedSymbol("HIDE-ID");

	private static final SubLSymbol $sym135$HIDE_ACTION = makeUninternedSymbol("HIDE-ACTION");

	private static final SubLSymbol DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS = makeSymbol("DHTML-VISIBILITY-GENERATE-IDS-AND-ACTIONS");

	private static final SubLSymbol DHTML_SWITCH_VISIBLITY_LINK = makeSymbol("DHTML-SWITCH-VISIBLITY-LINK");

	private static final SubLList $list139 = list(makeSymbol("OBJECT-CLASS"), makeSymbol("SHOW-LINK-CODE"), makeSymbol("HIDE-LINK-CODE"), makeSymbol("&OPTIONAL"), list(makeSymbol("INITIALLY-HIDDEN?"), T));

	private static final SubLSymbol $sym140$SHOW_ID = makeUninternedSymbol("SHOW-ID");

	private static final SubLSymbol $sym141$SHOW_ACTION = makeUninternedSymbol("SHOW-ACTION");

	private static final SubLSymbol $sym142$HIDE_ID = makeUninternedSymbol("HIDE-ID");

	private static final SubLSymbol $sym143$HIDE_ACTION = makeUninternedSymbol("HIDE-ACTION");

	private static final SubLSymbol $sym144$SHOW_STYLE = makeUninternedSymbol("SHOW-STYLE");

	private static final SubLSymbol $sym145$HIDE_STYLE = makeUninternedSymbol("HIDE-STYLE");

	private static final SubLSymbol DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS = makeSymbol("DHTML-CLASS-VISIBILITY-GENERATE-IDS-AND-ACTIONS");

	private static final SubLList $list148 = list(makeString("display:inline"), makeString("display:none"));

	private static final SubLList $list149 = list(makeString("display:none"), makeString("display:inline"));

	private static final SubLSymbol DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE = makeSymbol("DHTML-SWITCH-VISIBILITY-LINKS-WITH-CODE");

	private static final SubLList $list151 = list(makeSymbol("OBJECT-ID"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol DHTML_SWITCH_CLASS_VISIBILITY_LINKS_WITH_CODE = makeSymbol("DHTML-SWITCH-CLASS-VISIBILITY-LINKS-WITH-CODE");

	private static final SubLSymbol DHTML_VISIBILITY_DECLARE_DOM_OBJECTS = makeSymbol("DHTML-VISIBILITY-DECLARE-DOM-OBJECTS");

	private static final SubLList $list154 = list(makeSymbol("OBJECT-ID"), makeSymbol("ONCLICK-ACTION"), makeSymbol("LINK-CODE"), makeSymbol("&OPTIONAL"), list(makeSymbol("STYLE"), makeString("")));

	private static final SubLSymbol $sym155$HREF = makeUninternedSymbol("HREF");

	private static final SubLSymbol DHTML_POTENTIALLY_SHOW_TEXT = makeSymbol("DHTML-POTENTIALLY-SHOW-TEXT");

	private static final SubLSymbol HTML_SMALL = makeSymbol("HTML-SMALL");

	private static final SubLList $list158 = list(list(makeSymbol("&KEY"), makeSymbol("SHOW"), makeSymbol("HIDE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list159 = list($SHOW, $HIDE);

	private static final SubLList $list160 = list(makeSymbol("HTML-MARKUP"), list(makeSymbol("JAVASCRIPT-VOID-URL")));

	private static final SubLSymbol DHTML_CHANGE_VISIBLE_SECTION_ONCLICK = makeSymbol("DHTML-CHANGE-VISIBLE-SECTION-ONCLICK");

	private static final SubLSymbol DHTML_CHANGE_VISIBILE_SECTION = makeSymbol("DHTML-CHANGE-VISIBILE-SECTION");

	private static final SubLString $str163$___block___setVisibility__ = makeString("','block');setVisibility('");

	private static final SubLString $str164$___none___ = makeString("','none');");

	private static final SubLSymbol $RIGHT_TRIANGLE_V = makeKeyword("RIGHT-TRIANGLE-V");

	private static final SubLString $str166$cyc_right_triangle_violet_gif = makeString("cyc-right-triangle-violet.gif");

	private static final SubLString $str167$_Show_ = makeString("[Show]");

	private static final SubLSymbol $LEFT_TRIANGLE_V = makeKeyword("LEFT-TRIANGLE-V");

	private static final SubLString $str169$cyc_left_triangle_violet_gif = makeString("cyc-left-triangle-violet.gif");

	private static final SubLSymbol $DOWN_TRIANGLE_V = makeKeyword("DOWN-TRIANGLE-V");

	private static final SubLString $str171$cyc_down_triangle_violet_gif = makeString("cyc-down-triangle-violet.gif");

	private static final SubLString $str172$_Hide_ = makeString("[Hide]");

	private static final SubLSymbol $UP_TRIANGLE_V = makeKeyword("UP-TRIANGLE-V");

	private static final SubLString $str174$cyc_up_triangle_violet_gif = makeString("cyc-up-triangle-violet.gif");

	private static final SubLString $str176$cyc_no_triangle_violet_gif = makeString("cyc-no-triangle-violet.gif");

	private static final SubLString $$$__ = makeString("  ");

	private static final SubLString $str179$square_minus_gif = makeString("square-minus.gif");

	private static final SubLString $str181$square_plus_gif = makeString("square-plus.gif");

	private static final SubLString $str183$square_blank_gif = makeString("square-blank.gif");

	private static final SubLString $str185$display_inline = makeString("display:inline");

	private static final SubLString $str186$display_none = makeString("display:none");

	private static final SubLList $list189 = list(list(makeSymbol("*HTML-ELEMENT-ID*"), ZERO_INTEGER));

	private static final SubLList $list190 = list(makeSymbol("BASIC-AJAX-SCRIPTS"));

	private static final SubLList $list191 = list(makeSymbol("HTML-MARKUP"), makeSymbol("*JS-LOAD-LATER*"));

	private static final SubLString $str192$_script_type__text_javascript__fu = makeString(
			"<script type=\'text/javascript\'>function loadLater(url, id) {\n  var callback = {success: handleDelayedLoad, \n                  failure: handleFailedDelayedLoad,\n                  argument: {eltId: id}};\n  YAHOO.util.Connect.asyncRequest(\'get\', url, callback);\n}\nfunction handleDelayedLoad(o) {\n  document.getElementById(o.argument.eltId).innerHTML=o.responseText;\n}\nfunction handleFailedDelayedLoad(o) {\n  document.getElementById(o.argument.eltId).innerHTML=\'Unable to load\';\n}\n</script>\n");

	static private final SubLList $list193 = list(makeSymbol("HANDLER"), makeSymbol("ARGS"), makeSymbol("&KEY"), list(makeSymbol("MESSAGE"), makeString("")), list(makeSymbol("TAG"), makeString("span")), list(makeSymbol("DELAY"), makeInteger(50)));

	static private final SubLList $list194 = list(makeKeyword("MESSAGE"), makeKeyword("TAG"), makeKeyword("DELAY"));

	private static final SubLString $$$span = makeString("span");

	private static final SubLInteger $int$50 = makeInteger(50);

	private static final SubLSymbol JS_DELAYED_LOAD_INT = makeSymbol("JS-DELAYED-LOAD-INT");

	private static final SubLSymbol JS_DELAYED_LOAD = makeSymbol("JS-DELAYED-LOAD");

	private static final SubLString $str205$cyc_elt_ = makeString("cyc-elt-");

	private static final SubLString $str206$__A_id___A___A___A_ = makeString("<~A id='~A'>~A</~A>");

	private static final SubLString $str207$_script_type__text_javascript__tr = makeString("<script type=\'text/javascript\'>try {YAHOO.util.Event.addListener(window, \'load\', setTimeout(\"loadLater(\'~A\', \'~A\')\", ~A));} catch(err) {document.getElementById(\'~a\').innerHTML=\'Error ~A\';}</script>");

	private static final SubLString $str208$_ = makeString("?");

	private static final SubLList $list209 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

	private static final SubLString $str210$_ = makeString("&");

	private static final SubLString $str211$_ = makeString("=");

	private static final SubLString $str212$_if__isKeaHosted________var_keaBu = makeString("\nif (isKeaHosted()) {\n  var keaBus = new KEASessionBus();\n  YAHOO.util.Event.onDOMReady(function() {\n    window.onfocus = function() {\n      keaBus.setFocalTool(\'\');\n      keaBus.setFocalTool(\'legacyToolFocus\');\n    }; \n  });\n}");

	private static final SubLSymbol $CB_INLINE_EDIT = makeKeyword("CB-INLINE-EDIT");

	private static final SubLSymbol $CYCJS_KEA_SESSION_BUS = makeKeyword("CYCJS-KEA-SESSION-BUS");

	private static final SubLString $str223$__yui_skin_sam__editContainer__yu = makeString(" .yui-skin-sam .editContainer .yui-ac-input { position:relative; width:10em; }");

	public static final SubLObject dhtml_with_cascading_style_sheet_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt4);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject type = (current.isCons()) ? ((SubLObject) (current.first())) : $str_alt5$text_css;
					destructuring_bind_must_listp(current, datum, $list_alt4);
					current = current.rest();
					{
						SubLObject media = (current.isCons()) ? ((SubLObject) (current.first())) : $$$screen;
						destructuring_bind_must_listp(current, datum, $list_alt4);
						current = current.rest();
						if (NIL == current) {
							current = temp;
							{
								SubLObject body = current;
								SubLObject attributes = NIL;
								if (NIL != type) {
									attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list_alt8, type.isAtom() ? ((SubLObject) (list(HTML_MARKUP, type))) : type), attributes);
								}
								if (NIL != media) {
									attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list_alt10, type.isAtom() ? ((SubLObject) (list(HTML_MARKUP, media))) : media), attributes);
								}
								if (NIL != attributes) {
									attributes = nreverse(attributes);
								}
								return listS(PROGN, listS(HTML_MARKUP_WRAPPER, $list_alt13, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL))))), $list_alt15);
							}
						} else {
							cdestructuring_bind_error(datum, $list_alt4);
						}
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject dhtml_with_cascading_style_sheet(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list4);
		final SubLObject temp = current.rest();
		current = current.first();
		final SubLObject type = (current.isCons()) ? current.first() : $str5$text_css;
		destructuring_bind_must_listp(current, datum, $list4);
		current = current.rest();
		final SubLObject media = (current.isCons()) ? current.first() : $$$screen;
		destructuring_bind_must_listp(current, datum, $list4);
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			SubLObject attributes = NIL;
			if (NIL != type) {
				attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list8, type.isAtom() ? list(HTML_MARKUP, type) : type), attributes);
			}
			if (NIL != media) {
				attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list10, type.isAtom() ? list(HTML_MARKUP, media) : media), attributes);
			}
			if (NIL != attributes) {
				attributes = nreverse(attributes);
			}
			return listS(PROGN, listS(HTML_MARKUP_WRAPPER, $list13, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL))))), $list15);
		}
		cdestructuring_bind_error(datum, $list4);
		return NIL;
	}

	public static final SubLObject dhtml_dom_wrapper_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt25);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject object_id = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt25);
					object_id = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							return listS(PROGN, list(DHTML_DOM_WRAPPER_PREAMBLE, object_id), append(body, $list_alt27));
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt25);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject dhtml_dom_wrapper(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list25);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject object_id = NIL;
		destructuring_bind_must_consp(current, datum, $list25);
		object_id = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(PROGN, list(DHTML_DOM_WRAPPER_PREAMBLE, object_id), append(body, $list27));
		}
		cdestructuring_bind_error(datum, $list25);
		return NIL;
	}

	public static final SubLObject dhtml_dom_wrapper_preamble_alt(SubLObject object_id) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt29$__A__, object_id);
		}
	}

	public static SubLObject dhtml_dom_wrapper_preamble(final SubLObject object_id) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return format(html_macros.$html_stream$.getDynamicValue(thread), $str29$__A__, object_id);
	}

	public static final SubLObject dhtml_dom_wrapper_postamble_alt() {
		return html_markup($str_alt31$__);
	}

	public static SubLObject dhtml_dom_wrapper_postamble() {
		return html_markup($str31$__);
	}

	/**
	 * Emit a DOM attribute.
	 */
	@LispMethod(comment = "Emit a DOM attribute.")
	public static final SubLObject dhtml_dom_attribute_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt32);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject attribute = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt32);
					attribute = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							return listS(PROGN, list(DHTML_DOM_ATTRIBUTE_PREAMBLE, attribute), append(body, $list_alt34));
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt32);
					}
				}
			}
		}
		return NIL;
	}

	/**
	 * Emit a DOM attribute.
	 */
	@LispMethod(comment = "Emit a DOM attribute.")
	public static SubLObject dhtml_dom_attribute(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list32);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject attribute = NIL;
		destructuring_bind_must_consp(current, datum, $list32);
		attribute = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(PROGN, list(DHTML_DOM_ATTRIBUTE_PREAMBLE, attribute), append(body, $list34));
		}
		cdestructuring_bind_error(datum, $list32);
		return NIL;
	}

	public static final SubLObject dhtml_dom_attribute_preamble_alt(SubLObject attribute) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt36$__A_, attribute);
		}
	}

	public static SubLObject dhtml_dom_attribute_preamble(final SubLObject attribute) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return format(html_macros.$html_stream$.getDynamicValue(thread), $str36$__A_, attribute);
	}

	public static final SubLObject dhtml_dom_attribute_postamble_alt() {
		return html_markup($str_alt38$_);
	}

	public static SubLObject dhtml_dom_attribute_postamble() {
		return html_markup($str38$_);
	}

	/**
	 * Declare a DOM Object. The Key list is probably insufficient, so feel free to add
	 * to it as you see fit.
	 */
	@LispMethod(comment = "Declare a DOM Object. The Key list is probably insufficient, so feel free to add\r\nto it as you see fit.\nDeclare a DOM Object. The Key list is probably insufficient, so feel free to add\nto it as you see fit.")
	public static final SubLObject dhtml_declare_dom_object_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt39);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject object_id = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt39);
					object_id = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt39);
					{
						SubLObject temp_1 = current.rest();
						current = current.first();
						{
							SubLObject allow_other_keys_p = NIL;
							SubLObject rest = current;
							SubLObject bad = NIL;
							SubLObject current_2 = NIL;
							for (; NIL != rest;) {
								destructuring_bind_must_consp(rest, datum, $list_alt39);
								current_2 = rest.first();
								rest = rest.rest();
								destructuring_bind_must_consp(rest, datum, $list_alt39);
								if (NIL == member(current_2, $list_alt40, UNPROVIDED, UNPROVIDED)) {
									bad = T;
								}
								if (current_2 == $ALLOW_OTHER_KEYS) {
									allow_other_keys_p = rest.first();
								}
								rest = rest.rest();
							}
							if ((NIL != bad) && (NIL == allow_other_keys_p)) {
								cdestructuring_bind_error(datum, $list_alt39);
							}
							{
								SubLObject top_tail = property_list_member($TOP, current);
								SubLObject top = (NIL != top_tail) ? ((SubLObject) (cadr(top_tail))) : NIL;
								SubLObject bottom_tail = property_list_member($BOTTOM, current);
								SubLObject bottom = (NIL != bottom_tail) ? ((SubLObject) (cadr(bottom_tail))) : NIL;
								SubLObject right_tail = property_list_member($RIGHT, current);
								SubLObject right = (NIL != right_tail) ? ((SubLObject) (cadr(right_tail))) : NIL;
								SubLObject left_tail = property_list_member($LEFT, current);
								SubLObject left = (NIL != left_tail) ? ((SubLObject) (cadr(left_tail))) : NIL;
								SubLObject height_tail = property_list_member($HEIGHT, current);
								SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : NIL;
								SubLObject width_tail = property_list_member($WIDTH, current);
								SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : NIL;
								SubLObject position_tail = property_list_member($POSITION, current);
								SubLObject position = (NIL != position_tail) ? ((SubLObject) (cadr(position_tail))) : NIL;
								SubLObject visibility_tail = property_list_member($VISIBILITY, current);
								SubLObject visibility = (NIL != visibility_tail) ? ((SubLObject) (cadr(visibility_tail))) : NIL;
								SubLObject display_tail = property_list_member($DISPLAY, current);
								SubLObject display = (NIL != display_tail) ? ((SubLObject) (cadr(display_tail))) : NIL;
								current = temp_1;
								{
									SubLObject body = current;
									current = temp;
									if (NIL == current) {
										{
											SubLObject attributes = NIL;
											if (NIL != position) {
												attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list_alt51, position.isAtom() ? ((SubLObject) (list(HTML_MARKUP, position))) : position), attributes);
											}
											if (NIL != top) {
												attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list_alt52, top.isAtom() ? ((SubLObject) (list(HTML_MARKUP, top))) : top), attributes);
											}
											if (NIL != bottom) {
												attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list_alt53, bottom.isAtom() ? ((SubLObject) (list(HTML_MARKUP, bottom))) : bottom), attributes);
											}
											if (NIL != left) {
												attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list_alt54, left.isAtom() ? ((SubLObject) (list(HTML_MARKUP, left))) : left), attributes);
											}
											if (NIL != right) {
												attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list_alt55, right.isAtom() ? ((SubLObject) (list(HTML_MARKUP, right))) : right), attributes);
											}
											if (NIL != visibility) {
												attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list_alt56, visibility.isAtom() ? ((SubLObject) (list(HTML_MARKUP, visibility))) : visibility), attributes);
											}
											if (NIL != display) {
												attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list_alt57, display.isAtom() ? ((SubLObject) (list(HTML_MARKUP, display))) : display), attributes);
											}
											if (NIL != height) {
												attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list_alt58, height.isAtom() ? ((SubLObject) (list(HTML_MARKUP, height))) : height), attributes);
											}
											if (NIL != width) {
												attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list_alt59, width.isAtom() ? ((SubLObject) (list(HTML_MARKUP, width))) : width), attributes);
											}
											if (NIL != attributes) {
												attributes = nreverse(attributes);
											}
											return listS(PROGN, $list_alt60, listS(DHTML_DOM_WRAPPER, list(object_id), append(attributes, body, NIL)), $list_alt15);
										}
									} else {
										cdestructuring_bind_error(datum, $list_alt39);
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

	/**
	 * Declare a DOM Object. The Key list is probably insufficient, so feel free to add
	 * to it as you see fit.
	 */
	@LispMethod(comment = "Declare a DOM Object. The Key list is probably insufficient, so feel free to add\r\nto it as you see fit.\nDeclare a DOM Object. The Key list is probably insufficient, so feel free to add\nto it as you see fit.")
	public static SubLObject dhtml_declare_dom_object(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list39);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject object_id = NIL;
		destructuring_bind_must_consp(current, datum, $list39);
		object_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list39);
		final SubLObject temp_$1 = current.rest();
		current = current.first();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$2 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list39);
			current_$2 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list39);
			if (NIL == member(current_$2, $list40, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$2 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list39);
		}
		final SubLObject top_tail = property_list_member($TOP, current);
		final SubLObject top = (NIL != top_tail) ? cadr(top_tail) : NIL;
		final SubLObject bottom_tail = property_list_member($BOTTOM, current);
		final SubLObject bottom = (NIL != bottom_tail) ? cadr(bottom_tail) : NIL;
		final SubLObject right_tail = property_list_member($RIGHT, current);
		final SubLObject right = (NIL != right_tail) ? cadr(right_tail) : NIL;
		final SubLObject left_tail = property_list_member($LEFT, current);
		final SubLObject left = (NIL != left_tail) ? cadr(left_tail) : NIL;
		final SubLObject height_tail = property_list_member($HEIGHT, current);
		final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
		final SubLObject width_tail = property_list_member($WIDTH, current);
		final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
		final SubLObject position_tail = property_list_member($POSITION, current);
		final SubLObject position = (NIL != position_tail) ? cadr(position_tail) : NIL;
		final SubLObject visibility_tail = property_list_member($VISIBILITY, current);
		final SubLObject visibility = (NIL != visibility_tail) ? cadr(visibility_tail) : NIL;
		final SubLObject display_tail = property_list_member($DISPLAY, current);
		final SubLObject display = (NIL != display_tail) ? cadr(display_tail) : NIL;
		final SubLObject body;
		current = body = temp_$1;
		current = temp;
		if (NIL == current) {
			SubLObject attributes = NIL;
			if (NIL != position) {
				attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list51, position.isAtom() ? list(HTML_MARKUP, position) : position), attributes);
			}
			if (NIL != top) {
				attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list52, top.isAtom() ? list(HTML_MARKUP, top) : top), attributes);
			}
			if (NIL != bottom) {
				attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list53, bottom.isAtom() ? list(HTML_MARKUP, bottom) : bottom), attributes);
			}
			if (NIL != left) {
				attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list54, left.isAtom() ? list(HTML_MARKUP, left) : left), attributes);
			}
			if (NIL != right) {
				attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list55, right.isAtom() ? list(HTML_MARKUP, right) : right), attributes);
			}
			if (NIL != visibility) {
				attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list56, visibility.isAtom() ? list(HTML_MARKUP, visibility) : visibility), attributes);
			}
			if (NIL != display) {
				attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list57, display.isAtom() ? list(HTML_MARKUP, display) : display), attributes);
			}
			if (NIL != height) {
				attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list58, height.isAtom() ? list(HTML_MARKUP, height) : height), attributes);
			}
			if (NIL != width) {
				attributes = cons(list(DHTML_DOM_ATTRIBUTE, $list59, width.isAtom() ? list(HTML_MARKUP, width) : width), attributes);
			}
			if (NIL != attributes) {
				attributes = nreverse(attributes);
			}
			return listS(PROGN, $list60, listS(DHTML_DOM_WRAPPER, list(object_id), append(attributes, body, NIL)), $list15);
		}
		cdestructuring_bind_error(datum, $list39);
		return NIL;
	}

	public static final SubLObject dhtml_with_dom_script_alt() {
		return html_markup($dhtml_find_dom_js$.getGlobalValue());
	}

	public static SubLObject dhtml_with_dom_script() {
		cyc_file_dependencies.javascript($FINDDOM);
		return html_source_readability_terpri(UNPROVIDED);
	}

	public static final SubLObject dhtml_creation_scripts_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject javascript_src = javascript_file_path($CONSTANT_CREATION);
				html_source_readability_terpri(UNPROVIDED);
				html_markup(html_macros.$html_script_head$.getGlobalValue());
				html_markup(html_macros.$html_script_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(javascript_src);
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_script_type$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($str_alt66$text_javascript);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				{
					SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
					}
				}
				html_markup(html_macros.$html_script_tail$.getGlobalValue());
			}
			html_source_readability_terpri(UNPROVIDED);
			return NIL;
		}
	}

	public static SubLObject dhtml_creation_scripts() {
		cyc_file_dependencies.javascript($CONSTANT_CREATION);
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static SubLObject dhtml_lexical_scripts() {
		cyc_file_dependencies.javascript($LEXICAL);
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static final SubLObject dhtml_with_toggle_visibility_support_alt() {
		return html_markup($dhtml_toggle_visibility_js$.getGlobalValue());
	}

	public static SubLObject dhtml_with_toggle_visibility_support() {
		cyc_file_dependencies.javascript($VISIBILITY);
		return html_source_readability_terpri(UNPROVIDED);
	}

	/**
	 * Return T iff OBJECT is a valid DHTML flow-type.
	 */
	@LispMethod(comment = "Return T iff OBJECT is a valid DHTML flow-type.")
	public static final SubLObject flow_type_p_alt(SubLObject v_object) {
		return subl_promotions.memberP(v_object, $list_alt67, UNPROVIDED, UNPROVIDED);
	}

	/**
	 * Return T iff OBJECT is a valid DHTML flow-type.
	 */
	@LispMethod(comment = "Return T iff OBJECT is a valid DHTML flow-type.")
	public static SubLObject flow_type_p(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, $list65, UNPROVIDED, UNPROVIDED);
	}

	/**
	 * Return T iff OBJECT is a valid DHTML visibility.
	 */
	@LispMethod(comment = "Return T iff OBJECT is a valid DHTML visibility.")
	public static final SubLObject visibility_p_alt(SubLObject v_object) {
		return subl_promotions.memberP(v_object, $list_alt68, UNPROVIDED, UNPROVIDED);
	}

	/**
	 * Return T iff OBJECT is a valid DHTML visibility.
	 */
	@LispMethod(comment = "Return T iff OBJECT is a valid DHTML visibility.")
	public static SubLObject visibility_p(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, $list66, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject invert_visibility_alt(SubLObject visibility) {
		{
			SubLObject pcase_var = visibility;
			if (pcase_var.eql($VISIBLE)) {
				return $INVISIBLE;
			} else {
				if (pcase_var.eql($INVISIBLE)) {
					return $VISIBLE;
				} else {
					return Errors.error($str_alt71$_S_was_not_a_known_visibility_p, visibility);
				}
			}
		}
	}

	public static SubLObject invert_visibility(final SubLObject visibility) {
		if (visibility.eql($VISIBLE)) {
			return $INVISIBLE;
		}
		if (visibility.eql($INVISIBLE)) {
			return $VISIBLE;
		}
		return Errors.error($str69$_S_was_not_a_known_visibility_p, visibility);
	}

	/**
	 * Return the DHTML encoding of the VISIBILITY / FLOW-TYPE combination.
	 */
	@LispMethod(comment = "Return the DHTML encoding of the VISIBILITY / FLOW-TYPE combination.")
	public static final SubLObject dhtml_encode_visibility_alt(SubLObject visibility, SubLObject flow_type) {
		SubLSystemTrampolineFile.checkType(visibility, VISIBILITY_P);
		SubLSystemTrampolineFile.checkType(flow_type, FLOW_TYPE_P);
		if ($INVISIBLE == visibility) {
			return $$$none;
		} else {
			if ($PARAGRAPH == flow_type) {
				return $$$block;
			} else {
				return $$$inline;
			}
		}
	}

	/**
	 * Return the DHTML encoding of the VISIBILITY / FLOW-TYPE combination.
	 */
	@LispMethod(comment = "Return the DHTML encoding of the VISIBILITY / FLOW-TYPE combination.")
	public static SubLObject dhtml_encode_visibility(final SubLObject visibility, final SubLObject flow_type) {
		assert NIL != visibility_p(visibility) : "! dhtml_macros.visibility_p(visibility) " + ("dhtml_macros.visibility_p(visibility) " + "CommonSymbols.NIL != dhtml_macros.visibility_p(visibility) ") + visibility;
		assert NIL != flow_type_p(flow_type) : "! dhtml_macros.flow_type_p(flow_type) " + ("dhtml_macros.flow_type_p(flow_type) " + "CommonSymbols.NIL != dhtml_macros.flow_type_p(flow_type) ") + flow_type;
		if ($INVISIBLE == visibility) {
			return $$$none;
		}
		if ($PARAGRAPH == flow_type) {
			return $$$block;
		}
		return $$$inline;
	}

	public static final SubLObject dhtml_generate_visibility_setter_alt(SubLObject object_id, SubLObject visibility, SubLObject flow_type) {
		if (flow_type == UNPROVIDED) {
			flow_type = $TEXT;
		}
		{
			SubLObject visibility_encoding = com.cyc.cycjava.cycl.dhtml_macros.dhtml_encode_visibility(visibility, flow_type);
			return cconcatenate($str_alt79$setVisibility__, new SubLObject[] { format_nil.format_nil_a_no_copy(object_id), $str_alt80$___, format_nil.format_nil_a_no_copy(visibility_encoding), $str_alt81$___ });
		}
	}

	public static SubLObject dhtml_generate_visibility_setter(final SubLObject object_id, final SubLObject visibility, SubLObject flow_type) {
		if (flow_type == UNPROVIDED) {
			flow_type = $TEXT;
		}
		final SubLObject visibility_encoding = dhtml_encode_visibility(visibility, flow_type);
		return cconcatenate($str77$setVisibility__, new SubLObject[] { format_nil.format_nil_a_no_copy(object_id), $str78$___, format_nil.format_nil_a_no_copy(visibility_encoding), $str79$___ });
	}

	public static SubLObject dhtml_generate_class_visibility_toggle(final SubLObject object_class, SubLObject show_or_hide) {
		if (show_or_hide == UNPROVIDED) {
			show_or_hide = NIL;
		}
		return dhtml_visibility_generate_js_for_class_toggle(object_class, show_or_hide);
	}

	/**
	 * This emits the DOM style sheets to forcibly set the visibility of the object with OBJECT-ID to VISIBILITY.
	 */
	@LispMethod(comment = "This emits the DOM style sheets to forcibly set the visibility of the object with OBJECT-ID to VISIBILITY.")
	public static final SubLObject dhtml_set_visibility_alt(SubLObject object_id, SubLObject visibility, SubLObject flow_type) {
		if (flow_type == UNPROVIDED) {
			flow_type = $TEXT;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject visibility_encoding = com.cyc.cycjava.cycl.dhtml_macros.dhtml_encode_visibility(visibility, flow_type);
				html_markup($dhtml_css_head$.getGlobalValue());
				html_markup($dhtml_css_type$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($str_alt5$text_css);
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($dhtml_css_media$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($$$screen);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				{
					SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_terpri(UNPROVIDED);
						com.cyc.cycjava.cycl.dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
						com.cyc.cycjava.cycl.dhtml_macros.dhtml_dom_attribute_preamble($dhtml_dom_display$.getGlobalValue());
						html_markup(visibility_encoding);
						com.cyc.cycjava.cycl.dhtml_macros.dhtml_dom_attribute_postamble();
						com.cyc.cycjava.cycl.dhtml_macros.dhtml_dom_wrapper_postamble();
						html_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
					}
				}
				html_markup($dhtml_css_tail$.getGlobalValue());
				html_terpri(UNPROVIDED);
				return NIL;
			}
		}
	}

	/**
	 * This emits the DOM style sheets to forcibly set the visibility of the object with OBJECT-ID to VISIBILITY.
	 */
	@LispMethod(comment = "This emits the DOM style sheets to forcibly set the visibility of the object with OBJECT-ID to VISIBILITY.")
	public static SubLObject dhtml_set_visibility(final SubLObject object_id, final SubLObject visibility, SubLObject flow_type) {
		if (flow_type == UNPROVIDED) {
			flow_type = $TEXT;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject visibility_encoding = dhtml_encode_visibility(visibility, flow_type);
		html_markup($dhtml_css_head$.getGlobalValue());
		html_markup($dhtml_css_type$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str5$text_css);
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($dhtml_css_media$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($$$screen);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_terpri(UNPROVIDED);
			dhtml_dom_wrapper_preamble(object_id);
			dhtml_dom_attribute_preamble($dhtml_dom_display$.getGlobalValue());
			html_markup(visibility_encoding);
			dhtml_dom_attribute_postamble();
			dhtml_dom_wrapper_postamble();
			html_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup($dhtml_css_tail$.getGlobalValue());
		html_terpri(UNPROVIDED);
		return NIL;
	}

	/**
	 * Returns the show & hide IDS for switching the visibility of the object with OBJECT-ID
	 */
	@LispMethod(comment = "Returns the show & hide IDS for switching the visibility of the object with OBJECT-ID")
	public static final SubLObject dhtml_visibility_generate_switch_ids_alt(SubLObject object_id) {
		{
			SubLObject show_id = com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_generate_show_object_id(object_id);
			SubLObject hide_id = com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_generate_hide_object_id(object_id);
			return values(show_id, hide_id);
		}
	}

	/**
	 * Returns the show & hide IDS for switching the visibility of the object with OBJECT-ID
	 */
	@LispMethod(comment = "Returns the show & hide IDS for switching the visibility of the object with OBJECT-ID")
	public static SubLObject dhtml_visibility_generate_switch_ids(final SubLObject object_id) {
		final SubLObject show_id = dhtml_visibility_generate_show_object_id(object_id);
		final SubLObject hide_id = dhtml_visibility_generate_hide_object_id(object_id);
		return values(show_id, hide_id);
	}

	public static SubLObject dhtml_class_visibility_generate_switch_ids(final SubLObject object_class) {
		final SubLObject show_id = dhtml_class_visibility_generate_show_object_id(object_class);
		final SubLObject hide_id = dhtml_class_visibility_generate_hide_object_id(object_class);
		return values(show_id, hide_id);
	}

	/**
	 * Returns the ID for showing the object with OBJECT-ID
	 */
	@LispMethod(comment = "Returns the ID for showing the object with OBJECT-ID")
	public static final SubLObject dhtml_visibility_generate_show_object_id_alt(SubLObject object_id) {
		SubLSystemTrampolineFile.checkType(object_id, STRINGP);
		return cconcatenate(object_id, $str_alt83$_show_button);
	}

	/**
	 * Returns the ID for showing the object with OBJECT-ID
	 */
	@LispMethod(comment = "Returns the ID for showing the object with OBJECT-ID")
	public static SubLObject dhtml_visibility_generate_show_object_id(final SubLObject object_id) {
		assert NIL != stringp(object_id) : "! stringp(object_id) " + ("Types.stringp(object_id) " + "CommonSymbols.NIL != Types.stringp(object_id) ") + object_id;
		return cconcatenate(object_id, $str81$_show_button);
	}

	/**
	 * Returns the ID for hiding the object with OBJECT-ID
	 */
	@LispMethod(comment = "Returns the ID for hiding the object with OBJECT-ID")
	public static final SubLObject dhtml_visibility_generate_hide_object_id_alt(SubLObject object_id) {
		SubLSystemTrampolineFile.checkType(object_id, STRINGP);
		return cconcatenate(object_id, $str_alt84$_hide_button);
	}

	/**
	 * Returns the ID for hiding the object with OBJECT-ID
	 */
	@LispMethod(comment = "Returns the ID for hiding the object with OBJECT-ID")
	public static SubLObject dhtml_visibility_generate_hide_object_id(final SubLObject object_id) {
		assert NIL != stringp(object_id) : "! stringp(object_id) " + ("Types.stringp(object_id) " + "CommonSymbols.NIL != Types.stringp(object_id) ") + object_id;
		return cconcatenate(object_id, $str82$_hide_button);
	}

	public static SubLObject dhtml_class_visibility_generate_show_object_id(final SubLObject object_class) {
		assert NIL != stringp(object_class) : "! stringp(object_class) " + ("Types.stringp(object_class) " + "CommonSymbols.NIL != Types.stringp(object_class) ") + object_class;
		return cconcatenate(remove_if(WHITESPACEP, object_class, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str81$_show_button);
	}

	public static SubLObject dhtml_class_visibility_generate_hide_object_id(final SubLObject object_class) {
		assert NIL != stringp(object_class) : "! stringp(object_class) " + ("Types.stringp(object_class) " + "CommonSymbols.NIL != Types.stringp(object_class) ") + object_class;
		return cconcatenate(remove_if(WHITESPACEP, object_class, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str82$_hide_button);
	}

	public static final SubLObject dhtml_potentially_show_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt85);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject object_id = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt85);
					object_id = current.first();
					current = current.rest();
					{
						SubLObject allow_other_keys_p = NIL;
						SubLObject rest = current;
						SubLObject bad = NIL;
						SubLObject current_3 = NIL;
						for (; NIL != rest;) {
							destructuring_bind_must_consp(rest, datum, $list_alt85);
							current_3 = rest.first();
							rest = rest.rest();
							destructuring_bind_must_consp(rest, datum, $list_alt85);
							if (NIL == member(current_3, $list_alt86, UNPROVIDED, UNPROVIDED)) {
								bad = T;
							}
							if (current_3 == $ALLOW_OTHER_KEYS) {
								allow_other_keys_p = rest.first();
							}
							rest = rest.rest();
						}
						if ((NIL != bad) && (NIL == allow_other_keys_p)) {
							cdestructuring_bind_error(datum, $list_alt85);
						}
						{
							SubLObject initial_visibility_tail = property_list_member($INITIAL_VISIBILITY, current);
							SubLObject initial_visibility = (NIL != initial_visibility_tail) ? ((SubLObject) (cadr(initial_visibility_tail))) : $VISIBLE;
							SubLObject flow_type_tail = property_list_member($FLOW_TYPE, current);
							SubLObject flow_type = (NIL != flow_type_tail) ? ((SubLObject) (cadr(flow_type_tail))) : $TEXT;
							current = temp;
							{
								SubLObject body = current;
								return listS(PROGN, list(DHTML_SET_VISIBILITY, object_id, initial_visibility, flow_type), listS(HTML_FANCY_DIV, list($ID, object_id), append(body, NIL)), $list_alt92);
							}
						}
					}
				}
			}
		}
	}

	public static SubLObject dhtml_potentially_show(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list84);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject object_id = NIL;
		destructuring_bind_must_consp(current, datum, $list84);
		object_id = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$3 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list84);
			current_$3 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list84);
			if (NIL == member(current_$3, $list85, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$3 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list84);
		}
		final SubLObject initial_visibility_tail = property_list_member($INITIAL_VISIBILITY, current);
		final SubLObject initial_visibility = (NIL != initial_visibility_tail) ? cadr(initial_visibility_tail) : $VISIBLE;
		final SubLObject flow_type_tail = property_list_member($FLOW_TYPE, current);
		final SubLObject flow_type = (NIL != flow_type_tail) ? cadr(flow_type_tail) : $TEXT;
		final SubLObject body;
		current = body = temp;
		return listS(PROGN, list(DHTML_SET_VISIBILITY, object_id, initial_visibility, flow_type), listS(HTML_FANCY_DIV, list($ID, object_id), append(body, NIL)), $list91);
	}

	public static final SubLObject dhtml_potentially_show_switched_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt85);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject object_id = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt85);
					object_id = current.first();
					current = current.rest();
					{
						SubLObject allow_other_keys_p = NIL;
						SubLObject rest = current;
						SubLObject bad = NIL;
						SubLObject current_4 = NIL;
						for (; NIL != rest;) {
							destructuring_bind_must_consp(rest, datum, $list_alt85);
							current_4 = rest.first();
							rest = rest.rest();
							destructuring_bind_must_consp(rest, datum, $list_alt85);
							if (NIL == member(current_4, $list_alt86, UNPROVIDED, UNPROVIDED)) {
								bad = T;
							}
							if (current_4 == $ALLOW_OTHER_KEYS) {
								allow_other_keys_p = rest.first();
							}
							rest = rest.rest();
						}
						if ((NIL != bad) && (NIL == allow_other_keys_p)) {
							cdestructuring_bind_error(datum, $list_alt85);
						}
						{
							SubLObject initial_visibility_tail = property_list_member($INITIAL_VISIBILITY, current);
							SubLObject initial_visibility = (NIL != initial_visibility_tail) ? ((SubLObject) (cadr(initial_visibility_tail))) : $VISIBLE;
							SubLObject flow_type_tail = property_list_member($FLOW_TYPE, current);
							SubLObject flow_type = (NIL != flow_type_tail) ? ((SubLObject) (cadr(flow_type_tail))) : $TEXT;
							current = temp;
							{
								SubLObject body = current;
								return listS(PROGN, list(DHTML_SET_SWITCHED_VISIBILITY, object_id, initial_visibility, flow_type), listS(HTML_FANCY_DIV, list($ID, object_id), append(body, NIL)), $list_alt92);
							}
						}
					}
				}
			}
		}
	}

	public static SubLObject dhtml_potentially_show_switched(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list84);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject object_id = NIL;
		destructuring_bind_must_consp(current, datum, $list84);
		object_id = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$4 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list84);
			current_$4 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list84);
			if (NIL == member(current_$4, $list85, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$4 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list84);
		}
		final SubLObject initial_visibility_tail = property_list_member($INITIAL_VISIBILITY, current);
		final SubLObject initial_visibility = (NIL != initial_visibility_tail) ? cadr(initial_visibility_tail) : $VISIBLE;
		final SubLObject flow_type_tail = property_list_member($FLOW_TYPE, current);
		final SubLObject flow_type = (NIL != flow_type_tail) ? cadr(flow_type_tail) : $TEXT;
		final SubLObject body;
		current = body = temp;
		return listS(PROGN, list(DHTML_SET_SWITCHED_VISIBILITY, object_id, initial_visibility, flow_type), listS(HTML_FANCY_DIV, list($ID, object_id), append(body, NIL)), $list91);
	}

	public static final SubLObject dhtml_potentially_show_text_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt94);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject object_id = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt94);
					object_id = current.first();
					current = current.rest();
					{
						SubLObject allow_other_keys_p = NIL;
						SubLObject rest = current;
						SubLObject bad = NIL;
						SubLObject current_5 = NIL;
						for (; NIL != rest;) {
							destructuring_bind_must_consp(rest, datum, $list_alt94);
							current_5 = rest.first();
							rest = rest.rest();
							destructuring_bind_must_consp(rest, datum, $list_alt94);
							if (NIL == member(current_5, $list_alt95, UNPROVIDED, UNPROVIDED)) {
								bad = T;
							}
							if (current_5 == $ALLOW_OTHER_KEYS) {
								allow_other_keys_p = rest.first();
							}
							rest = rest.rest();
						}
						if ((NIL != bad) && (NIL == allow_other_keys_p)) {
							cdestructuring_bind_error(datum, $list_alt94);
						}
						{
							SubLObject style_tail = property_list_member($STYLE, current);
							SubLObject style = (NIL != style_tail) ? ((SubLObject) (cadr(style_tail))) : $str_alt97$;
							current = temp;
							{
								SubLObject body = current;
								return listS(PROGN, listS(HTML_FANCY_SPAN, list($ID, object_id, $STYLE, style), append(body, NIL)), $list_alt92);
							}
						}
					}
				}
			}
		}
	}

	public static SubLObject dhtml_potentially_show_text(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list93);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject object_id = NIL;
		destructuring_bind_must_consp(current, datum, $list93);
		object_id = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$5 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list93);
			current_$5 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list93);
			if (NIL == member(current_$5, $list94, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$5 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list93);
		}
		final SubLObject style_tail = property_list_member($STYLE, current);
		final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : $str96$;
		final SubLObject body;
		current = body = temp;
		return listS(PROGN, listS(HTML_FANCY_SPAN, list($ID, object_id, $STYLE, style), append(body, NIL)), $list91);
	}

	/**
	 * This emits the DOM style sheets to
	 * (a) forcibly set the visibility of the object with OBJECT-ID to VISIBILITY.
	 * (b) forcibly set the visibility of the associated 'show' & 'hide' objects appropriately.
	 */
	@LispMethod(comment = "This emits the DOM style sheets to\r\n(a) forcibly set the visibility of the object with OBJECT-ID to VISIBILITY.\r\n(b) forcibly set the visibility of the associated \'show\' & \'hide\' objects appropriately.\nThis emits the DOM style sheets to\n(a) forcibly set the visibility of the object with OBJECT-ID to VISIBILITY.\n(b) forcibly set the visibility of the associated \'show\' & \'hide\' objects appropriately.")
	public static final SubLObject dhtml_set_switched_visibility_alt(SubLObject object_id, SubLObject visibility, SubLObject flow_type) {
		if (flow_type == UNPROVIDED) {
			flow_type = $TEXT;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject show_id = com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_generate_switch_ids(object_id);
				SubLObject hide_id = thread.secondMultipleValue();
				thread.resetMultipleValues();
				com.cyc.cycjava.cycl.dhtml_macros.dhtml_set_visibility(object_id, visibility, flow_type);
				com.cyc.cycjava.cycl.dhtml_macros.dhtml_set_visibility(show_id, com.cyc.cycjava.cycl.dhtml_macros.invert_visibility(visibility), $TEXT);
				com.cyc.cycjava.cycl.dhtml_macros.dhtml_set_visibility(hide_id, visibility, $TEXT);
			}
			return NIL;
		}
	}

	/**
	 * This emits the DOM style sheets to
	 * (a) forcibly set the visibility of the object with OBJECT-ID to VISIBILITY.
	 * (b) forcibly set the visibility of the associated 'show' & 'hide' objects appropriately.
	 */
	@LispMethod(comment = "This emits the DOM style sheets to\r\n(a) forcibly set the visibility of the object with OBJECT-ID to VISIBILITY.\r\n(b) forcibly set the visibility of the associated \'show\' & \'hide\' objects appropriately.\nThis emits the DOM style sheets to\n(a) forcibly set the visibility of the object with OBJECT-ID to VISIBILITY.\n(b) forcibly set the visibility of the associated \'show\' & \'hide\' objects appropriately.")
	public static SubLObject dhtml_set_switched_visibility(final SubLObject object_id, final SubLObject visibility, SubLObject flow_type) {
		if (flow_type == UNPROVIDED) {
			flow_type = $TEXT;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject show_id = dhtml_visibility_generate_switch_ids(object_id);
		final SubLObject hide_id = thread.secondMultipleValue();
		thread.resetMultipleValues();
		dhtml_set_visibility(object_id, visibility, flow_type);
		dhtml_set_visibility(show_id, invert_visibility(visibility), $TEXT);
		dhtml_set_visibility(hide_id, visibility, $TEXT);
		return NIL;
	}

	public static final SubLObject dhtml_set_visibility_link_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt100);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject object_id = NIL;
					SubLObject visibility = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt100);
					object_id = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt100);
					visibility = current.first();
					current = current.rest();
					{
						SubLObject allow_other_keys_p = NIL;
						SubLObject rest = current;
						SubLObject bad = NIL;
						SubLObject current_6 = NIL;
						for (; NIL != rest;) {
							destructuring_bind_must_consp(rest, datum, $list_alt100);
							current_6 = rest.first();
							rest = rest.rest();
							destructuring_bind_must_consp(rest, datum, $list_alt100);
							if (NIL == member(current_6, $list_alt101, UNPROVIDED, UNPROVIDED)) {
								bad = T;
							}
							if (current_6 == $ALLOW_OTHER_KEYS) {
								allow_other_keys_p = rest.first();
							}
							rest = rest.rest();
						}
						if ((NIL != bad) && (NIL == allow_other_keys_p)) {
							cdestructuring_bind_error(datum, $list_alt100);
						}
						{
							SubLObject link_text_tail = property_list_member($LINK_TEXT, current);
							SubLObject link_text = (NIL != link_text_tail) ? ((SubLObject) (cadr(link_text_tail))) : NIL;
							SubLObject flow_type_tail = property_list_member($FLOW_TYPE, current);
							SubLObject flow_type = (NIL != flow_type_tail) ? ((SubLObject) (cadr(flow_type_tail))) : $TEXT;
							current = temp;
							{
								SubLObject body = current;
								SubLObject href = $sym103$HREF;
								SubLObject click_action = $sym104$CLICK_ACTION;
								return listS(CLET, list(bq_cons(href, $list_alt106), list(click_action, list(DHTML_GENERATE_VISIBILITY_SETTER, object_id, visibility, flow_type))), listS(HTML_FANCY_ANCHOR, list($HREF, href, $ONCLICK, click_action), list(PWHEN, link_text, list(HTML_PRINC, link_text)), append(body, NIL)), $list_alt92);
							}
						}
					}
				}
			}
		}
	}

	public static SubLObject dhtml_set_visibility_link(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list99);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject object_id = NIL;
		SubLObject visibility = NIL;
		destructuring_bind_must_consp(current, datum, $list99);
		object_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list99);
		visibility = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$6 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list99);
			current_$6 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list99);
			if (NIL == member(current_$6, $list100, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$6 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list99);
		}
		final SubLObject link_text_tail = property_list_member($LINK_TEXT, current);
		final SubLObject link_text = (NIL != link_text_tail) ? cadr(link_text_tail) : NIL;
		final SubLObject flow_type_tail = property_list_member($FLOW_TYPE, current);
		final SubLObject flow_type = (NIL != flow_type_tail) ? cadr(flow_type_tail) : $TEXT;
		final SubLObject body;
		current = body = temp;
		final SubLObject href = $sym102$HREF;
		final SubLObject click_action = $sym103$CLICK_ACTION;
		return listS(CLET, list(bq_cons(href, $list105), list(click_action, list(DHTML_GENERATE_VISIBILITY_SETTER, object_id, visibility, flow_type))), listS(HTML_FANCY_ANCHOR, list($HREF, href, $ONCLICK, click_action), list(PWHEN, link_text, list(HTML_PRINC, link_text)), append(body, NIL)), $list91);
	}

	/**
	 * Emit a link that will allow toggling the visibility -- should be inside of
	 * a visibility support macro.
	 */
	@LispMethod(comment = "Emit a link that will allow toggling the visibility -- should be inside of\r\na visibility support macro.\nEmit a link that will allow toggling the visibility -- should be inside of\na visibility support macro.")
	public static final SubLObject dhtml_toggle_visibility_link_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt113);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject object_id = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt113);
					object_id = current.first();
					current = current.rest();
					{
						SubLObject allow_other_keys_p = NIL;
						SubLObject rest = current;
						SubLObject bad = NIL;
						SubLObject current_7 = NIL;
						for (; NIL != rest;) {
							destructuring_bind_must_consp(rest, datum, $list_alt113);
							current_7 = rest.first();
							rest = rest.rest();
							destructuring_bind_must_consp(rest, datum, $list_alt113);
							if (NIL == member(current_7, $list_alt114, UNPROVIDED, UNPROVIDED)) {
								bad = T;
							}
							if (current_7 == $ALLOW_OTHER_KEYS) {
								allow_other_keys_p = rest.first();
							}
							rest = rest.rest();
						}
						if ((NIL != bad) && (NIL == allow_other_keys_p)) {
							cdestructuring_bind_error(datum, $list_alt113);
						}
						{
							SubLObject link_text_tail = property_list_member($LINK_TEXT, current);
							SubLObject link_text = (NIL != link_text_tail) ? ((SubLObject) (cadr(link_text_tail))) : NIL;
							current = temp;
							{
								SubLObject body = current;
								SubLObject href = $sym115$HREF;
								SubLObject click_action = $sym116$CLICK_ACTION;
								return listS(CLET, list(bq_cons(href, $list_alt106), list(click_action, list(DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE, object_id))), listS(HTML_FANCY_ANCHOR, list($HREF, href, $ONCLICK, click_action), list(PWHEN, link_text, list(HTML_PRINC, link_text)), append(body, NIL)), $list_alt92);
							}
						}
					}
				}
			}
		}
	}

	/**
	 * Emit a link that will allow toggling the visibility -- should be inside of
	 * a visibility support macro.
	 */
	@LispMethod(comment = "Emit a link that will allow toggling the visibility -- should be inside of\r\na visibility support macro.\nEmit a link that will allow toggling the visibility -- should be inside of\na visibility support macro.")
	public static SubLObject dhtml_toggle_visibility_link(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list112);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject object_id = NIL;
		destructuring_bind_must_consp(current, datum, $list112);
		object_id = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$7 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list112);
			current_$7 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list112);
			if (NIL == member(current_$7, $list113, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$7 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list112);
		}
		final SubLObject link_text_tail = property_list_member($LINK_TEXT, current);
		final SubLObject link_text = (NIL != link_text_tail) ? cadr(link_text_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		final SubLObject href = $sym114$HREF;
		final SubLObject click_action = $sym115$CLICK_ACTION;
		return listS(CLET, list(bq_cons(href, $list105), list(click_action, list(DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE, object_id))), listS(HTML_FANCY_ANCHOR, list($HREF, href, $ONCLICK, click_action), list(PWHEN, link_text, list(HTML_PRINC, link_text)), append(body, NIL)), $list91);
	}

	public static SubLObject dhtml_toggle_class_visibility_link(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list117);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject v_class = NIL;
		destructuring_bind_must_consp(current, datum, $list117);
		v_class = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$8 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list117);
			current_$8 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list117);
			if (NIL == member(current_$8, $list113, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$8 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list117);
		}
		final SubLObject link_text_tail = property_list_member($LINK_TEXT, current);
		final SubLObject link_text = (NIL != link_text_tail) ? cadr(link_text_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		final SubLObject href = $sym118$HREF;
		final SubLObject click_action = $sym119$CLICK_ACTION;
		return listS(CLET, list(bq_cons(href, $list105), list(click_action, list(DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE, v_class))), listS(HTML_FANCY_ANCHOR, list($HREF, href, $ONCLICK, click_action), list(PWHEN, link_text, list(HTML_PRINC, link_text)), append(body, NIL)), $list91);
	}

	public static final SubLObject dhtml_visibility_generate_js_for_toggle_alt(SubLObject object_id) {
		SubLSystemTrampolineFile.checkType(object_id, STRING);
		return cconcatenate($str_alt120$toggleVisibility__, new SubLObject[] { object_id, $str_alt81$___ });
	}

	public static SubLObject dhtml_visibility_generate_js_for_toggle(final SubLObject object_id) {
		assert NIL != Strings.string(object_id) : "! Strings.string(object_id) " + ("Strings.string(object_id) " + "CommonSymbols.NIL != Strings.string(object_id) ") + object_id;
		return cconcatenate($str123$toggleVisibility__, new SubLObject[] { object_id, $str79$___ });
	}

	public static SubLObject dhtml_visibility_generate_js_for_class_toggle(final SubLObject v_class, SubLObject show_or_hide) {
		if (show_or_hide == UNPROVIDED) {
			show_or_hide = NIL;
		}
		assert NIL != Strings.string(v_class) : "! Strings.string(v_class) " + ("Strings.string(v_class) " + "CommonSymbols.NIL != Strings.string(v_class) ") + v_class;
		final SubLObject visibility_arg = (show_or_hide == $SHOW) ? $str125$__true : show_or_hide == $HIDE ? $str127$__false : $str96$;
		return cconcatenate($str128$toggleClassVisibility__, new SubLObject[] { v_class, $str129$_, visibility_arg, $str130$__ });
	}

	/**
	 * Emit a link that will allow toggling the visibility of the object with OBJECT-ID.
	 * This should be inside of a visibility support macro.
	 *
	 * @param SHOW-LINK-CODE;
	 * 		code that will print out the show link (need not be text)
	 * @param HIDE-LINK-CODE;
	 * 		code that will print out the hide link (need not be text)
	 */
	@LispMethod(comment = "Emit a link that will allow toggling the visibility of the object with OBJECT-ID.\r\nThis should be inside of a visibility support macro.\r\n\r\n@param SHOW-LINK-CODE;\r\n\t\tcode that will print out the show link (need not be text)\r\n@param HIDE-LINK-CODE;\r\n\t\tcode that will print out the hide link (need not be text)\nEmit a link that will allow toggling the visibility of the object with OBJECT-ID.\nThis should be inside of a visibility support macro.")
	public static final SubLObject dhtml_switch_visibility_links_with_code_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject object_id = NIL;
			SubLObject show_link_code = NIL;
			SubLObject hide_link_code = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt121);
			object_id = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt121);
			show_link_code = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt121);
			hide_link_code = current.first();
			current = current.rest();
			if (NIL == current) {
				{
					SubLObject show_id = $sym122$SHOW_ID;
					SubLObject show_action = $sym123$SHOW_ACTION;
					SubLObject hide_id = $sym124$HIDE_ID;
					SubLObject hide_action = $sym125$HIDE_ACTION;
					return list(CMULTIPLE_VALUE_BIND, list(show_id, show_action, hide_id, hide_action), list(DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS, object_id), list(DHTML_VISIBILITY_DECLARE_DOM_OBJECTS, show_id, hide_id), list(DHTML_SWITCH_VISIBLITY_LINK, show_id, show_action, show_link_code), list(DHTML_SWITCH_VISIBLITY_LINK, hide_id, hide_action, hide_link_code));
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt121);
			}
		}
		return NIL;
	}

	/**
	 * Emit a link that will allow toggling the visibility of the object with OBJECT-ID.
	 * This should be inside of a visibility support macro.
	 *
	 * @param SHOW-LINK-CODE;
	 * 		code that will print out the show link (need not be text)
	 * @param HIDE-LINK-CODE;
	 * 		code that will print out the hide link (need not be text)
	 */
	@LispMethod(comment = "Emit a link that will allow toggling the visibility of the object with OBJECT-ID.\r\nThis should be inside of a visibility support macro.\r\n\r\n@param SHOW-LINK-CODE;\r\n\t\tcode that will print out the show link (need not be text)\r\n@param HIDE-LINK-CODE;\r\n\t\tcode that will print out the hide link (need not be text)\nEmit a link that will allow toggling the visibility of the object with OBJECT-ID.\nThis should be inside of a visibility support macro.")
	public static SubLObject dhtml_switch_visibility_links_with_code(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject object_id = NIL;
		SubLObject show_link_code = NIL;
		SubLObject hide_link_code = NIL;
		destructuring_bind_must_consp(current, datum, $list131);
		object_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list131);
		show_link_code = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list131);
		hide_link_code = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject show_id = $sym132$SHOW_ID;
			final SubLObject show_action = $sym133$SHOW_ACTION;
			final SubLObject hide_id = $sym134$HIDE_ID;
			final SubLObject hide_action = $sym135$HIDE_ACTION;
			return list(CMULTIPLE_VALUE_BIND, list(show_id, show_action, hide_id, hide_action), list(DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS, object_id), list(DHTML_SWITCH_VISIBLITY_LINK, show_id, show_action, show_link_code), list(DHTML_SWITCH_VISIBLITY_LINK, hide_id, hide_action, hide_link_code));
		}
		cdestructuring_bind_error(datum, $list131);
		return NIL;
	}

	public static SubLObject dhtml_switch_class_visibility_links_with_code(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject object_class = NIL;
		SubLObject show_link_code = NIL;
		SubLObject hide_link_code = NIL;
		destructuring_bind_must_consp(current, datum, $list139);
		object_class = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list139);
		show_link_code = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list139);
		hide_link_code = current.first();
		current = current.rest();
		final SubLObject initially_hiddenP = (current.isCons()) ? current.first() : T;
		destructuring_bind_must_listp(current, datum, $list139);
		current = current.rest();
		if (NIL == current) {
			final SubLObject show_id = $sym140$SHOW_ID;
			final SubLObject show_action = $sym141$SHOW_ACTION;
			final SubLObject hide_id = $sym142$HIDE_ID;
			final SubLObject hide_action = $sym143$HIDE_ACTION;
			final SubLObject show_style = $sym144$SHOW_STYLE;
			final SubLObject hide_style = $sym145$HIDE_STYLE;
			return list(CMULTIPLE_VALUE_BIND, list(show_id, show_action, hide_id, hide_action), list(DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS, object_class),
					list(CLET, list(list(show_style, listS(FIF, initially_hiddenP, $list148)), list(hide_style, listS(FIF, initially_hiddenP, $list149))), list(DHTML_SWITCH_VISIBLITY_LINK, show_id, show_action, show_link_code, show_style), list(DHTML_SWITCH_VISIBLITY_LINK, hide_id, hide_action, hide_link_code, hide_style)));
		}
		cdestructuring_bind_error(datum, $list139);
		return NIL;
	}

	public static final SubLObject dhtml_visibility_generate_ids_and_actions_alt(SubLObject object_id) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject show_id = com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_generate_switch_ids(object_id);
				SubLObject hide_id = thread.secondMultipleValue();
				thread.resetMultipleValues();
				{
					SubLObject show_action = com.cyc.cycjava.cycl.dhtml_macros.dhtml_switch_visibility_generate_show_action(object_id, show_id, hide_id);
					SubLObject hide_action = com.cyc.cycjava.cycl.dhtml_macros.dhtml_switch_visibility_generate_hide_action(object_id, show_id, hide_id);
					return values(show_id, show_action, hide_id, hide_action);
				}
			}
		}
	}

	public static SubLObject dhtml_visibility_generate_ids_and_actions(final SubLObject object_id) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject show_id = dhtml_visibility_generate_switch_ids(object_id);
		final SubLObject hide_id = thread.secondMultipleValue();
		thread.resetMultipleValues();
		final SubLObject show_action = dhtml_switch_visibility_generate_show_action(object_id, show_id, hide_id);
		final SubLObject hide_action = dhtml_switch_visibility_generate_hide_action(object_id, show_id, hide_id);
		return values(show_id, show_action, hide_id, hide_action);
	}

	public static SubLObject dhtml_class_visibility_generate_ids_and_actions(final SubLObject object_class) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject show_id = dhtml_class_visibility_generate_switch_ids(object_class);
		final SubLObject hide_id = thread.secondMultipleValue();
		thread.resetMultipleValues();
		final SubLObject show_action = dhtml_switch_class_visibility_generate_show_action(object_class, show_id, hide_id);
		final SubLObject hide_action = dhtml_switch_class_visibility_generate_hide_action(object_class, show_id, hide_id);
		return values(show_id, show_action, hide_id, hide_action);
	}

	public static final SubLObject dhtml_visibility_declare_dom_objects_alt(SubLObject show_id, SubLObject hide_id) {
		com.cyc.cycjava.cycl.dhtml_macros.dhtml_set_visibility(show_id, $VISIBLE, $TEXT);
		com.cyc.cycjava.cycl.dhtml_macros.dhtml_set_visibility(hide_id, $INVISIBLE, $TEXT);
		return NIL;
	}

	public static SubLObject dhtml_visibility_declare_dom_objects(final SubLObject show_id, final SubLObject hide_id) {
		dhtml_set_visibility(show_id, $VISIBLE, $TEXT);
		dhtml_set_visibility(hide_id, $INVISIBLE, $TEXT);
		return NIL;
	}

	public static final SubLObject dhtml_switch_visiblity_link_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject object_id = NIL;
			SubLObject onclick_action = NIL;
			SubLObject link_code = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt132);
			object_id = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt132);
			onclick_action = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt132);
			link_code = current.first();
			current = current.rest();
			if (NIL == current) {
				{
					SubLObject href = $sym133$HREF;
					return list(CLET, list(bq_cons(href, $list_alt106)), list(DHTML_POTENTIALLY_SHOW_TEXT, list(object_id), list(HTML_SMALL, list(HTML_FANCY_ANCHOR, list($HREF, href, $ONCLICK, onclick_action), link_code))));
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt132);
			}
		}
		return NIL;
	}

	public static SubLObject dhtml_switch_visiblity_link(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject object_id = NIL;
		SubLObject onclick_action = NIL;
		SubLObject link_code = NIL;
		destructuring_bind_must_consp(current, datum, $list154);
		object_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list154);
		onclick_action = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list154);
		link_code = current.first();
		current = current.rest();
		final SubLObject style = (current.isCons()) ? current.first() : $str96$;
		destructuring_bind_must_listp(current, datum, $list154);
		current = current.rest();
		if (NIL == current) {
			final SubLObject href = $sym155$HREF;
			return list(CLET, list(bq_cons(href, $list105)), list(DHTML_POTENTIALLY_SHOW_TEXT, list(object_id, $STYLE, style), list(HTML_SMALL, list(HTML_FANCY_ANCHOR, list($HREF, href, $ONCLICK, onclick_action), link_code))));
		}
		cdestructuring_bind_error(datum, $list154);
		return NIL;
	}

	public static final SubLObject dhtml_switch_visibility_generate_show_action_alt(SubLObject object_id, SubLObject show_id, SubLObject hide_id) {
		return cconcatenate(com.cyc.cycjava.cycl.dhtml_macros.dhtml_generate_visibility_setter(object_id, $VISIBLE, $PARAGRAPH), new SubLObject[] { com.cyc.cycjava.cycl.dhtml_macros.dhtml_generate_visibility_setter(show_id, $INVISIBLE, $TEXT), com.cyc.cycjava.cycl.dhtml_macros.dhtml_generate_visibility_setter(hide_id, $VISIBLE, $TEXT) });
	}

	public static SubLObject dhtml_switch_visibility_generate_show_action(final SubLObject object_id, final SubLObject show_id, final SubLObject hide_id) {
		return cconcatenate(dhtml_generate_visibility_setter(object_id, $VISIBLE, $PARAGRAPH), new SubLObject[] { dhtml_generate_visibility_setter(show_id, $INVISIBLE, $TEXT), dhtml_generate_visibility_setter(hide_id, $VISIBLE, $TEXT) });
	}

	public static final SubLObject dhtml_switch_visibility_generate_hide_action_alt(SubLObject object_id, SubLObject show_id, SubLObject hide_id) {
		return cconcatenate(com.cyc.cycjava.cycl.dhtml_macros.dhtml_generate_visibility_setter(object_id, $INVISIBLE, $PARAGRAPH), new SubLObject[] { com.cyc.cycjava.cycl.dhtml_macros.dhtml_generate_visibility_setter(show_id, $VISIBLE, $TEXT), com.cyc.cycjava.cycl.dhtml_macros.dhtml_generate_visibility_setter(hide_id, $INVISIBLE, $TEXT) });
	}

	public static SubLObject dhtml_switch_visibility_generate_hide_action(final SubLObject object_id, final SubLObject show_id, final SubLObject hide_id) {
		return cconcatenate(dhtml_generate_visibility_setter(object_id, $INVISIBLE, $PARAGRAPH), new SubLObject[] { dhtml_generate_visibility_setter(show_id, $VISIBLE, $TEXT), dhtml_generate_visibility_setter(hide_id, $INVISIBLE, $TEXT) });
	}

	public static SubLObject dhtml_switch_class_visibility_generate_show_action(final SubLObject object_class, final SubLObject show_id, final SubLObject hide_id) {
		return cconcatenate(dhtml_generate_class_visibility_toggle(object_class, $SHOW), new SubLObject[] { dhtml_generate_visibility_setter(show_id, $INVISIBLE, $TEXT), dhtml_generate_visibility_setter(hide_id, $VISIBLE, $TEXT) });
	}

	public static SubLObject dhtml_switch_class_visibility_generate_hide_action(final SubLObject object_class, final SubLObject show_id, final SubLObject hide_id) {
		return cconcatenate(dhtml_generate_class_visibility_toggle(object_class, $HIDE), new SubLObject[] { dhtml_generate_visibility_setter(show_id, $VISIBLE, $TEXT), dhtml_generate_visibility_setter(hide_id, $INVISIBLE, $TEXT) });
	}

	public static final SubLObject dhtml_change_visibile_section_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt136);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject allow_other_keys_p = NIL;
					SubLObject rest = current;
					SubLObject bad = NIL;
					SubLObject current_8 = NIL;
					for (; NIL != rest;) {
						destructuring_bind_must_consp(rest, datum, $list_alt136);
						current_8 = rest.first();
						rest = rest.rest();
						destructuring_bind_must_consp(rest, datum, $list_alt136);
						if (NIL == member(current_8, $list_alt137, UNPROVIDED, UNPROVIDED)) {
							bad = T;
						}
						if (current_8 == $ALLOW_OTHER_KEYS) {
							allow_other_keys_p = rest.first();
						}
						rest = rest.rest();
					}
					if ((NIL != bad) && (NIL == allow_other_keys_p)) {
						cdestructuring_bind_error(datum, $list_alt136);
					}
					{
						SubLObject show_tail = property_list_member($SHOW, current);
						SubLObject show = (NIL != show_tail) ? ((SubLObject) (cadr(show_tail))) : NIL;
						SubLObject hide_tail = property_list_member($HIDE, current);
						SubLObject hide = (NIL != hide_tail) ? ((SubLObject) (cadr(hide_tail))) : NIL;
						current = temp;
						{
							SubLObject body = current;
							return listS(HTML_FANCY_ANCHOR, list($HREF, $list_alt140, $ONCLICK, list(HTML_MARKUP, list(DHTML_CHANGE_VISIBLE_SECTION_ONCLICK, show, hide))), append(body, NIL));
						}
					}
				}
			}
		}
	}

	public static SubLObject dhtml_change_visibile_section(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list158);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$9 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list158);
			current_$9 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list158);
			if (NIL == member(current_$9, $list159, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$9 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list158);
		}
		final SubLObject show_tail = property_list_member($SHOW, current);
		final SubLObject show = (NIL != show_tail) ? cadr(show_tail) : NIL;
		final SubLObject hide_tail = property_list_member($HIDE, current);
		final SubLObject hide = (NIL != hide_tail) ? cadr(hide_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		return listS(HTML_FANCY_ANCHOR, list($HREF, $list160, $ONCLICK, list(HTML_MARKUP, list(DHTML_CHANGE_VISIBLE_SECTION_ONCLICK, show, hide))), append(body, NIL));
	}

	public static final SubLObject dhtml_change_visible_section_onclick_alt(SubLObject show, SubLObject hide) {
		return cconcatenate($str_alt79$setVisibility__, new SubLObject[] { format_nil.format_nil_a_no_copy(show), $str_alt143$___block___setVisibility__, format_nil.format_nil_a_no_copy(hide), $str_alt144$___none___ });
	}

	public static SubLObject dhtml_change_visible_section_onclick(final SubLObject show, final SubLObject hide) {
		return cconcatenate($str77$setVisibility__, new SubLObject[] { format_nil.format_nil_a_no_copy(show), $str163$___block___setVisibility__, format_nil.format_nil_a_no_copy(hide), $str164$___none___ });
	}

	public static final SubLObject dhtml_switch_visibility_links_alt(SubLObject object_id, SubLObject show_link_text, SubLObject hide_link_text) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject show_id = com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_generate_ids_and_actions(object_id);
				SubLObject show_action = thread.secondMultipleValue();
				SubLObject hide_id = thread.thirdMultipleValue();
				SubLObject hide_action = thread.fourthMultipleValue();
				thread.resetMultipleValues();
				com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_declare_dom_objects(show_id, hide_id);
				{
					SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
					html_markup(html_macros.$html_span_head$.getGlobalValue());
					if (NIL != show_id) {
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(show_id);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_span_style$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str_alt97$);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					{
						SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_small_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_href$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(href);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(show_action);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							{
								SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_princ(show_link_text);
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
								}
							}
							html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
							html_markup(html_macros.$html_small_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
						}
					}
					html_markup(html_macros.$html_span_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
				{
					SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
					html_markup(html_macros.$html_span_head$.getGlobalValue());
					if (NIL != hide_id) {
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(hide_id);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_span_style$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str_alt97$);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					{
						SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_small_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_href$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(href);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(hide_action);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							{
								SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_princ(hide_link_text);
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
								}
							}
							html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
							html_markup(html_macros.$html_small_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
						}
					}
					html_markup(html_macros.$html_span_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
			}
			return NIL;
		}
	}

	public static SubLObject dhtml_switch_visibility_links(final SubLObject object_id, final SubLObject show_link_text, final SubLObject hide_link_text) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
		final SubLObject show_action = thread.secondMultipleValue();
		final SubLObject hide_id = thread.thirdMultipleValue();
		final SubLObject hide_action = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != show_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(show_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_span_style$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str96$);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(href);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(show_action);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_princ(show_link_text);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		href = $dhtml_blank_href_js$.getGlobalValue();
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != hide_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(hide_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_span_style$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str96$);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		_prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(href);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(hide_action);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_princ(hide_link_text);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static final SubLObject dhtml_switch_visibility_links_plus_minus_alt(SubLObject object_id, SubLObject text) {
		return com.cyc.cycjava.cycl.dhtml_macros.dhtml_switch_visibility_links_icons(object_id, text, $SQUARE_MINUS, $SQUARE_PLUS);
	}

	public static SubLObject dhtml_switch_visibility_links_plus_minus(final SubLObject object_id, final SubLObject text) {
		return dhtml_switch_visibility_links_icons(object_id, text, $SQUARE_MINUS, $SQUARE_PLUS);
	}

	public static final SubLObject dhtml_switch_visibility_links_arrows_alt(SubLObject object_id, SubLObject text) {
		return com.cyc.cycjava.cycl.dhtml_macros.dhtml_switch_visibility_links_icons(object_id, text, $RIGHT_TRIANGLE_V, $DOWN_TRIANGLE_V);
	}

	public static SubLObject dhtml_switch_visibility_links_arrows(final SubLObject object_id, final SubLObject text) {
		return dhtml_switch_visibility_links_icons(object_id, text, $RIGHT_TRIANGLE_V, $DOWN_TRIANGLE_V);
	}

	public static SubLObject dhtml_switch_class_visibility_links_arrows(final SubLObject object_class, final SubLObject text, SubLObject initially_hiddenP) {
		if (initially_hiddenP == UNPROVIDED) {
			initially_hiddenP = T;
		}
		return dhtml_switch_class_visibility_links_icons(object_class, text, $RIGHT_TRIANGLE_V, $DOWN_TRIANGLE_V, initially_hiddenP);
	}

	public static final SubLObject dhtml_switch_visibility_links_icons_alt(SubLObject object_id, SubLObject text, SubLObject show_icon, SubLObject hide_icon) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject show_id = com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_generate_ids_and_actions(object_id);
				SubLObject show_action = thread.secondMultipleValue();
				SubLObject hide_id = thread.thirdMultipleValue();
				SubLObject hide_action = thread.fourthMultipleValue();
				thread.resetMultipleValues();
				com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_declare_dom_objects(show_id, hide_id);
				{
					SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
					html_markup(html_macros.$html_span_head$.getGlobalValue());
					if (NIL != show_id) {
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(show_id);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_span_style$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str_alt97$);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					{
						SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_small_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_href$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(href);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(show_action);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							{
								SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									{
										SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src(show_icon));
										SubLObject align = (true) ? ((SubLObject) ($TOP)) : $CENTER;
										SubLObject alt = get_html_icon_alt_string(show_icon);
										SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
										html_markup(html_macros.$html_image_head$.getGlobalValue());
										html_markup(html_macros.$html_image_src$.getGlobalValue());
										html_char(CHAR_quotation, UNPROVIDED);
										html_markup(image_src);
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
										{
											SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
											try {
												html_macros.$html_safe_print$.bind(T, thread);
											} finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
											}
										}
										html_markup(html_macros.$html_image_tail$.getGlobalValue());
									}
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
								}
							}
							html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
							html_markup(html_macros.$html_small_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
						}
					}
					html_markup(html_macros.$html_span_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
				{
					SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
					html_markup(html_macros.$html_span_head$.getGlobalValue());
					if (NIL != hide_id) {
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(hide_id);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_span_style$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str_alt97$);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					{
						SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_small_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_href$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(href);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(hide_action);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							{
								SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									{
										SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src(hide_icon));
										SubLObject align = (true) ? ((SubLObject) ($TOP)) : $CENTER;
										SubLObject alt = get_html_icon_alt_string(hide_icon);
										SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
										html_markup(html_macros.$html_image_head$.getGlobalValue());
										html_markup(html_macros.$html_image_src$.getGlobalValue());
										html_char(CHAR_quotation, UNPROVIDED);
										html_markup(image_src);
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
										{
											SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
											try {
												html_macros.$html_safe_print$.bind(T, thread);
											} finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
											}
										}
										html_markup(html_macros.$html_image_tail$.getGlobalValue());
									}
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
								}
							}
							html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
							html_markup(html_macros.$html_small_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
						}
					}
					html_markup(html_macros.$html_span_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
			}
			html_princ(text);
			return NIL;
		}
	}

	public static SubLObject dhtml_switch_visibility_links_icons(final SubLObject object_id, final SubLObject text, final SubLObject show_icon, final SubLObject hide_icon) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
		final SubLObject show_action = thread.secondMultipleValue();
		final SubLObject hide_id = thread.thirdMultipleValue();
		final SubLObject hide_action = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != show_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(show_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_span_style$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str96$);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(href);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(show_action);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(show_icon));
				final SubLObject align = $TOP;
				final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(show_icon);
				final SubLObject border = ZERO_INTEGER;
				html_markup(html_macros.$html_image_head$.getGlobalValue());
				html_markup(html_macros.$html_image_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(image_src);
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
				final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
				}
				html_markup(html_macros.$html_image_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		href = $dhtml_blank_href_js$.getGlobalValue();
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != hide_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(hide_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_span_style$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str96$);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		_prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(href);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(hide_action);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(hide_icon));
				final SubLObject align = $TOP;
				final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(hide_icon);
				final SubLObject border = ZERO_INTEGER;
				html_markup(html_macros.$html_image_head$.getGlobalValue());
				html_markup(html_macros.$html_image_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(image_src);
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
				final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
				}
				html_markup(html_macros.$html_image_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		html_princ(text);
		return NIL;
	}

	public static SubLObject dhtml_switch_class_visibility_links_icons(final SubLObject object_class, final SubLObject text, final SubLObject show_icon, final SubLObject hide_icon, SubLObject initially_hiddenP) {
		if (initially_hiddenP == UNPROVIDED) {
			initially_hiddenP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject show_id = dhtml_class_visibility_generate_ids_and_actions(object_class);
		final SubLObject show_action = thread.secondMultipleValue();
		final SubLObject hide_id = thread.thirdMultipleValue();
		final SubLObject hide_action = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		final SubLObject show_style = (NIL != initially_hiddenP) ? $str185$display_inline : $str186$display_none;
		final SubLObject hide_style = (NIL != initially_hiddenP) ? $str186$display_none : $str185$display_inline;
		SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != show_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(show_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_span_style$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(show_style);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(href);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(show_action);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(show_icon));
				final SubLObject align = $TOP;
				final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(show_icon);
				final SubLObject border = ZERO_INTEGER;
				html_markup(html_macros.$html_image_head$.getGlobalValue());
				html_markup(html_macros.$html_image_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(image_src);
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
				final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
				}
				html_markup(html_macros.$html_image_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		href = $dhtml_blank_href_js$.getGlobalValue();
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != hide_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(hide_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_span_style$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(hide_style);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		_prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(href);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(hide_action);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(hide_icon));
				final SubLObject align = $TOP;
				final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(hide_icon);
				final SubLObject border = ZERO_INTEGER;
				html_markup(html_macros.$html_image_head$.getGlobalValue());
				html_markup(html_macros.$html_image_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(image_src);
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
				final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
				}
				html_markup(html_macros.$html_image_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		html_princ(text);
		return NIL;
	}

	public static final SubLObject dhtml_switch_visibility_links_arrows_and_text_alt(SubLObject object_id, SubLObject text) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject show_id = com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_generate_ids_and_actions(object_id);
				SubLObject show_action = thread.secondMultipleValue();
				SubLObject hide_id = thread.thirdMultipleValue();
				SubLObject hide_action = thread.fourthMultipleValue();
				thread.resetMultipleValues();
				com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_declare_dom_objects(show_id, hide_id);
				{
					SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
					html_markup(html_macros.$html_span_head$.getGlobalValue());
					if (NIL != show_id) {
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(show_id);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_span_style$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str_alt97$);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					{
						SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_small_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_href$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(href);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(show_action);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							{
								SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									{
										SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src($RIGHT_TRIANGLE_V));
										SubLObject align = (true) ? ((SubLObject) ($TOP)) : $CENTER;
										SubLObject alt = get_html_icon_alt_string($RIGHT_TRIANGLE_V);
										SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
										html_markup(html_macros.$html_image_head$.getGlobalValue());
										html_markup(html_macros.$html_image_src$.getGlobalValue());
										html_char(CHAR_quotation, UNPROVIDED);
										html_markup(image_src);
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
										{
											SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
											try {
												html_macros.$html_safe_print$.bind(T, thread);
											} finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
											}
										}
										html_markup(html_macros.$html_image_tail$.getGlobalValue());
										html_princ(text);
									}
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
								}
							}
							html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
							html_markup(html_macros.$html_small_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
						}
					}
					html_markup(html_macros.$html_span_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
				{
					SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
					html_markup(html_macros.$html_span_head$.getGlobalValue());
					if (NIL != hide_id) {
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(hide_id);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_span_style$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str_alt97$);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					{
						SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_small_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_href$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(href);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(hide_action);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							{
								SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									{
										SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src($DOWN_TRIANGLE_V));
										SubLObject align = (true) ? ((SubLObject) ($TOP)) : $CENTER;
										SubLObject alt = get_html_icon_alt_string($DOWN_TRIANGLE_V);
										SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
										html_markup(html_macros.$html_image_head$.getGlobalValue());
										html_markup(html_macros.$html_image_src$.getGlobalValue());
										html_char(CHAR_quotation, UNPROVIDED);
										html_markup(image_src);
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
										{
											SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
											try {
												html_macros.$html_safe_print$.bind(T, thread);
											} finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
											}
										}
										html_markup(html_macros.$html_image_tail$.getGlobalValue());
										html_princ(text);
									}
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
								}
							}
							html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
							html_markup(html_macros.$html_small_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
						}
					}
					html_markup(html_macros.$html_span_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
			}
			return NIL;
		}
	}

	public static SubLObject dhtml_switch_visibility_links_arrows_and_text(final SubLObject object_id, final SubLObject text) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
		final SubLObject show_action = thread.secondMultipleValue();
		final SubLObject hide_id = thread.thirdMultipleValue();
		final SubLObject hide_action = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != show_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(show_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_span_style$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str96$);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(href);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(show_action);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($RIGHT_TRIANGLE_V));
				final SubLObject align = $TOP;
				final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($RIGHT_TRIANGLE_V);
				final SubLObject border = ZERO_INTEGER;
				html_markup(html_macros.$html_image_head$.getGlobalValue());
				html_markup(html_macros.$html_image_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(image_src);
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
				final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
				}
				html_markup(html_macros.$html_image_tail$.getGlobalValue());
				html_princ(text);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		href = $dhtml_blank_href_js$.getGlobalValue();
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != hide_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(hide_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_span_style$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str96$);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		_prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(href);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(hide_action);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($DOWN_TRIANGLE_V));
				final SubLObject align = $TOP;
				final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($DOWN_TRIANGLE_V);
				final SubLObject border = ZERO_INTEGER;
				html_markup(html_macros.$html_image_head$.getGlobalValue());
				html_markup(html_macros.$html_image_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(image_src);
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
				final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
				}
				html_markup(html_macros.$html_image_tail$.getGlobalValue());
				html_princ(text);
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static final SubLObject dhtml_switch_visibility_links_left_arrows_alt(SubLObject object_id, SubLObject text) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			html_princ(text);
			thread.resetMultipleValues();
			{
				SubLObject show_id = com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_generate_ids_and_actions(object_id);
				SubLObject show_action = thread.secondMultipleValue();
				SubLObject hide_id = thread.thirdMultipleValue();
				SubLObject hide_action = thread.fourthMultipleValue();
				thread.resetMultipleValues();
				com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_declare_dom_objects(show_id, hide_id);
				{
					SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
					html_markup(html_macros.$html_span_head$.getGlobalValue());
					if (NIL != show_id) {
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(show_id);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_span_style$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str_alt97$);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					{
						SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_small_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_href$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(href);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(show_action);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							{
								SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									{
										SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src($LEFT_TRIANGLE_V));
										SubLObject align = $CENTER;
										SubLObject alt = get_html_icon_alt_string($LEFT_TRIANGLE_V);
										SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
										html_markup(html_macros.$html_image_head$.getGlobalValue());
										html_markup(html_macros.$html_image_src$.getGlobalValue());
										html_char(CHAR_quotation, UNPROVIDED);
										html_markup(image_src);
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
										{
											SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
											try {
												html_macros.$html_safe_print$.bind(T, thread);
											} finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
											}
										}
										html_markup(html_macros.$html_image_tail$.getGlobalValue());
									}
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
								}
							}
							html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
							html_markup(html_macros.$html_small_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
						}
					}
					html_markup(html_macros.$html_span_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
				{
					SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
					html_markup(html_macros.$html_span_head$.getGlobalValue());
					if (NIL != hide_id) {
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(hide_id);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_span_style$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str_alt97$);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					{
						SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_small_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_href$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(href);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(hide_action);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							{
								SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									{
										SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src($DOWN_TRIANGLE_V));
										SubLObject align = $CENTER;
										SubLObject alt = get_html_icon_alt_string($DOWN_TRIANGLE_V);
										SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
										html_markup(html_macros.$html_image_head$.getGlobalValue());
										html_markup(html_macros.$html_image_src$.getGlobalValue());
										html_char(CHAR_quotation, UNPROVIDED);
										html_markup(image_src);
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
										{
											SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
											try {
												html_macros.$html_safe_print$.bind(T, thread);
											} finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
											}
										}
										html_markup(html_macros.$html_image_tail$.getGlobalValue());
									}
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
								}
							}
							html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
							html_markup(html_macros.$html_small_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
						}
					}
					html_markup(html_macros.$html_span_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
			}
			return NIL;
		}
	}

	public static SubLObject dhtml_switch_visibility_links_left_arrows(final SubLObject object_id, final SubLObject text) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		html_princ(text);
		thread.resetMultipleValues();
		final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
		final SubLObject show_action = thread.secondMultipleValue();
		final SubLObject hide_id = thread.thirdMultipleValue();
		final SubLObject hide_action = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != show_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(show_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_span_style$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str96$);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(href);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(show_action);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($LEFT_TRIANGLE_V));
				final SubLObject align = $CENTER;
				final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($LEFT_TRIANGLE_V);
				final SubLObject border = ZERO_INTEGER;
				html_markup(html_macros.$html_image_head$.getGlobalValue());
				html_markup(html_macros.$html_image_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(image_src);
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
				final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
				}
				html_markup(html_macros.$html_image_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		href = $dhtml_blank_href_js$.getGlobalValue();
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != hide_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(hide_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_span_style$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str96$);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		_prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(href);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(hide_action);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($DOWN_TRIANGLE_V));
				final SubLObject align = $CENTER;
				final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($DOWN_TRIANGLE_V);
				final SubLObject border = ZERO_INTEGER;
				html_markup(html_macros.$html_image_head$.getGlobalValue());
				html_markup(html_macros.$html_image_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(image_src);
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
				final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
				}
				html_markup(html_macros.$html_image_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static final SubLObject dhtml_switch_visibility_links_up_arrows_alt(SubLObject object_id) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject show_id = com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_generate_ids_and_actions(object_id);
				SubLObject show_action = thread.secondMultipleValue();
				SubLObject hide_id = thread.thirdMultipleValue();
				SubLObject hide_action = thread.fourthMultipleValue();
				thread.resetMultipleValues();
				com.cyc.cycjava.cycl.dhtml_macros.dhtml_visibility_declare_dom_objects(show_id, hide_id);
				{
					SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
					html_markup(html_macros.$html_span_head$.getGlobalValue());
					if (NIL != show_id) {
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(show_id);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_span_style$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str_alt97$);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					{
						SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_small_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_href$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(href);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(show_action);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							{
								SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									{
										SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src($RIGHT_TRIANGLE_V));
										SubLObject align = $CENTER;
										SubLObject alt = get_html_icon_alt_string($RIGHT_TRIANGLE_V);
										SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
										html_markup(html_macros.$html_image_head$.getGlobalValue());
										html_markup(html_macros.$html_image_src$.getGlobalValue());
										html_char(CHAR_quotation, UNPROVIDED);
										html_markup(image_src);
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
										{
											SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
											try {
												html_macros.$html_safe_print$.bind(T, thread);
											} finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
											}
										}
										html_markup(html_macros.$html_image_tail$.getGlobalValue());
									}
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
								}
							}
							html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
							html_markup(html_macros.$html_small_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
						}
					}
					html_markup(html_macros.$html_span_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
				{
					SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
					html_markup(html_macros.$html_span_head$.getGlobalValue());
					if (NIL != hide_id) {
						html_markup(html_macros.$html_attribute_id$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(hide_id);
						html_char(CHAR_quotation, UNPROVIDED);
					}
					html_markup(html_macros.$html_span_style$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup($str_alt97$);
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					{
						SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_small_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_head$.getGlobalValue());
							html_markup(html_macros.$html_anchor_href$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(href);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(hide_action);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							{
								SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
									html_macros.$html_safe_print$.bind(T, thread);
									{
										SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src($UP_TRIANGLE_V));
										SubLObject align = $CENTER;
										SubLObject alt = get_html_icon_alt_string($UP_TRIANGLE_V);
										SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
										html_markup(html_macros.$html_image_head$.getGlobalValue());
										html_markup(html_macros.$html_image_src$.getGlobalValue());
										html_char(CHAR_quotation, UNPROVIDED);
										html_markup(image_src);
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
										{
											SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
											try {
												html_macros.$html_safe_print$.bind(T, thread);
											} finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
											}
										}
										html_markup(html_macros.$html_image_tail$.getGlobalValue());
									}
								} finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
								}
							}
							html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
							html_markup(html_macros.$html_small_tail$.getGlobalValue());
						} finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
						}
					}
					html_markup(html_macros.$html_span_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
				}
			}
			return NIL;
		}
	}

	public static SubLObject dhtml_switch_visibility_links_up_arrows(final SubLObject object_id) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject show_id = dhtml_visibility_generate_ids_and_actions(object_id);
		final SubLObject show_action = thread.secondMultipleValue();
		final SubLObject hide_id = thread.thirdMultipleValue();
		final SubLObject hide_action = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != show_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(show_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_span_style$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str96$);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(href);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(show_action);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($RIGHT_TRIANGLE_V));
				final SubLObject align = $CENTER;
				final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($RIGHT_TRIANGLE_V);
				final SubLObject border = ZERO_INTEGER;
				html_markup(html_macros.$html_image_head$.getGlobalValue());
				html_markup(html_macros.$html_image_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(image_src);
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
				final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
				}
				html_markup(html_macros.$html_image_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		href = $dhtml_blank_href_js$.getGlobalValue();
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != hide_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(hide_id);
			html_char(CHAR_quotation, UNPROVIDED);
		}
		html_markup(html_macros.$html_span_style$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($str96$);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		_prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(href);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(hide_action);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
				html_macros.$html_safe_print$.bind(T, thread);
				final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($UP_TRIANGLE_V));
				final SubLObject align = $CENTER;
				final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($UP_TRIANGLE_V);
				final SubLObject border = ZERO_INTEGER;
				html_markup(html_macros.$html_image_head$.getGlobalValue());
				html_markup(html_macros.$html_image_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(image_src);
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
				final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
					html_macros.$html_safe_print$.bind(T, thread);
				} finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
				}
				html_markup(html_macros.$html_image_tail$.getGlobalValue());
			} finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
			}
			html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	/**
	 * Show a blank image that is the same size as the arrows for better layout.
	 */
	@LispMethod(comment = "Show a blank image that is the same size as the arrows for better layout.")
	public static final SubLObject dhtml_switch_visibility_no_arrow_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src($BLANK_TRIANGLE));
				SubLObject align = (true) ? ((SubLObject) ($TOP)) : $CENTER;
				SubLObject alt = get_html_icon_alt_string($BLANK_TRIANGLE);
				SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
				html_markup(html_macros.$html_image_head$.getGlobalValue());
				html_markup(html_macros.$html_image_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(image_src);
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
				{
					SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
					}
				}
				html_markup(html_macros.$html_image_tail$.getGlobalValue());
			}
			html_glyph($NBSP, UNPROVIDED);
			return NIL;
		}
	}

	/**
	 * Show a blank image that is the same size as the arrows for better layout.
	 */
	@LispMethod(comment = "Show a blank image that is the same size as the arrows for better layout.")
	public static SubLObject dhtml_switch_visibility_no_arrow() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($BLANK_TRIANGLE));
		final SubLObject align = $TOP;
		final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($BLANK_TRIANGLE);
		final SubLObject border = ZERO_INTEGER;
		html_markup(html_macros.$html_image_head$.getGlobalValue());
		html_markup(html_macros.$html_image_src$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(image_src);
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
		html_glyph($NBSP, UNPROVIDED);
		return NIL;
	}

	public static final SubLObject get_next_html_element_id_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject id = $html_element_id$.getDynamicValue(thread);
				$html_element_id$.setDynamicValue(add($html_element_id$.getDynamicValue(thread), ONE_INTEGER), thread);
				return id;
			}
		}
	}

	public static SubLObject get_next_html_element_id() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject id = $html_element_id$.getDynamicValue(thread);
		$html_element_id$.setDynamicValue(add($html_element_id$.getDynamicValue(thread), ONE_INTEGER), thread);
		return id;
	}

	public static final SubLObject basic_ajax_scripts_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject javascript_src = javascript_file_path($YAHOO_MIN);
				html_source_readability_terpri(UNPROVIDED);
				html_markup(html_macros.$html_script_head$.getGlobalValue());
				html_markup(html_macros.$html_script_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(javascript_src);
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_script_type$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($str_alt66$text_javascript);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				{
					SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
					}
				}
				html_markup(html_macros.$html_script_tail$.getGlobalValue());
			}
			html_source_readability_terpri(UNPROVIDED);
			{
				SubLObject javascript_src = javascript_file_path($EVENT_MIN);
				html_source_readability_terpri(UNPROVIDED);
				html_markup(html_macros.$html_script_head$.getGlobalValue());
				html_markup(html_macros.$html_script_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(javascript_src);
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_script_type$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($str_alt66$text_javascript);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				{
					SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
					}
				}
				html_markup(html_macros.$html_script_tail$.getGlobalValue());
			}
			html_source_readability_terpri(UNPROVIDED);
			{
				SubLObject javascript_src = javascript_file_path($CONNECTION);
				html_source_readability_terpri(UNPROVIDED);
				html_markup(html_macros.$html_script_head$.getGlobalValue());
				html_markup(html_macros.$html_script_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(javascript_src);
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_macros.$html_script_type$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup($str_alt66$text_javascript);
				html_char(CHAR_quotation, UNPROVIDED);
				html_char(CHAR_greater, UNPROVIDED);
				{
					SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_source_readability_terpri(UNPROVIDED);
					} finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
					}
				}
				html_markup(html_macros.$html_script_tail$.getGlobalValue());
			}
			html_source_readability_terpri(UNPROVIDED);
			return NIL;
		}
	}

	public static SubLObject basic_ajax_scripts() {
		cyc_file_dependencies.javascript($CONNECTION);
		html_source_readability_terpri(UNPROVIDED);
		return NIL;
	}

	public static final SubLObject with_delayed_html_load_support_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(CLET, $list_alt193, $list_alt194, $list_alt195, append(body, NIL));
		}
	}

	public static SubLObject with_delayed_html_load_support(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(CLET, $list189, $list190, $list191, append(body, NIL));
	}

	/**
	 * Emit javascript that will cause the contents of a page using HANDLER and ARGS (an alist)
	 * (@see MAKE-URL-FROM-HANDLER-AND-ARGS) to be inserted into an HTML element of type TAG.  First,
	 * however, it will display MESSAGE for at least DELAY (msec) after the DOM for the containing page
	 * has loaded.
	 *
	 * @unknown because each delayed-load causes another round trip to the Cyc server, programmers should try to get
	relatively large chunks (of HTML or of Cyc processing) with each call.
	 */
	@LispMethod(comment = "Emit javascript that will cause the contents of a page using HANDLER and ARGS (an alist)\r\n(@see MAKE-URL-FROM-HANDLER-AND-ARGS) to be inserted into an HTML element of type TAG.  First,\r\nhowever, it will display MESSAGE for at least DELAY (msec) after the DOM for the containing page\r\nhas loaded.\r\n\r\n@unknown because each delayed-load causes another round trip to the Cyc server, programmers should try to get\r\nrelatively large chunks (of HTML or of Cyc processing) with each call.\nEmit javascript that will cause the contents of a page using HANDLER and ARGS (an alist)\n(@see MAKE-URL-FROM-HANDLER-AND-ARGS) to be inserted into an HTML element of type TAG.  First,\nhowever, it will display MESSAGE for at least DELAY (msec) after the DOM for the containing page\nhas loaded.")
	public static final SubLObject js_delayed_load_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject handler = NIL;
			SubLObject args = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt197);
			handler = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt197);
			args = current.first();
			current = current.rest();
			{
				SubLObject allow_other_keys_p = NIL;
				SubLObject rest = current;
				SubLObject bad = NIL;
				SubLObject current_27 = NIL;
				for (; NIL != rest;) {
					destructuring_bind_must_consp(rest, datum, $list_alt197);
					current_27 = rest.first();
					rest = rest.rest();
					destructuring_bind_must_consp(rest, datum, $list_alt197);
					if (NIL == member(current_27, $list_alt198, UNPROVIDED, UNPROVIDED)) {
						bad = T;
					}
					if (current_27 == $ALLOW_OTHER_KEYS) {
						allow_other_keys_p = rest.first();
					}
					rest = rest.rest();
				}
				if ((NIL != bad) && (NIL == allow_other_keys_p)) {
					cdestructuring_bind_error(datum, $list_alt197);
				}
				{
					SubLObject message_tail = property_list_member($MESSAGE, current);
					SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : $str_alt97$;
					SubLObject tag_tail = property_list_member($TAG, current);
					SubLObject tag = (NIL != tag_tail) ? ((SubLObject) (cadr(tag_tail))) : $$$span;
					SubLObject delay_tail = property_list_member($DELAY, current);
					SubLObject delay = (NIL != delay_tail) ? ((SubLObject) (cadr(delay_tail))) : $int$50;
					return list(JS_DELAYED_LOAD_INT, listS(LIST, $HANDLER, handler, $ARGS, args, append(NIL != message ? ((SubLObject) (list($MESSAGE, message))) : NIL, NIL != tag ? ((SubLObject) (list($TAG, tag))) : NIL, NIL != delay ? ((SubLObject) (list($DELAY, delay))) : NIL, NIL)));
				}
			}
		}
	}

	/**
	 * Emit javascript that will cause the contents of a page using HANDLER and ARGS (an alist)
	 * (@see MAKE-URL-FROM-HANDLER-AND-ARGS) to be inserted into an HTML element of type TAG.  First,
	 * however, it will display MESSAGE for at least DELAY (msec) after the DOM for the containing page
	 * has loaded.
	 *
	 * @unknown because each delayed-load causes another round trip to the Cyc server, programmers should try to get
	relatively large chunks (of HTML or of Cyc processing) with each call.
	 */
	@LispMethod(comment = "Emit javascript that will cause the contents of a page using HANDLER and ARGS (an alist)\r\n(@see MAKE-URL-FROM-HANDLER-AND-ARGS) to be inserted into an HTML element of type TAG.  First,\r\nhowever, it will display MESSAGE for at least DELAY (msec) after the DOM for the containing page\r\nhas loaded.\r\n\r\n@unknown because each delayed-load causes another round trip to the Cyc server, programmers should try to get\r\nrelatively large chunks (of HTML or of Cyc processing) with each call.\nEmit javascript that will cause the contents of a page using HANDLER and ARGS (an alist)\n(@see MAKE-URL-FROM-HANDLER-AND-ARGS) to be inserted into an HTML element of type TAG.  First,\nhowever, it will display MESSAGE for at least DELAY (msec) after the DOM for the containing page\nhas loaded.")
	public static SubLObject js_delayed_load(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject handler = NIL;
		SubLObject args = NIL;
		destructuring_bind_must_consp(current, datum, $list193);
		handler = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list193);
		args = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$32 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list193);
			current_$32 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list193);
			if (NIL == member(current_$32, $list194, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$32 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list193);
		}
		final SubLObject message_tail = property_list_member($MESSAGE, current);
		final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : $str96$;
		final SubLObject tag_tail = property_list_member($TAG, current);
		final SubLObject tag = (NIL != tag_tail) ? cadr(tag_tail) : $$$span;
		final SubLObject delay_tail = property_list_member($DELAY, current);
		final SubLObject delay = (NIL != delay_tail) ? cadr(delay_tail) : $int$50;
		return list(JS_DELAYED_LOAD_INT, listS(LIST, $HANDLER, handler, $ARGS, args, append(NIL != message ? list($MESSAGE, message) : NIL, NIL != tag ? list($TAG, tag) : NIL, NIL != delay ? list($DELAY, delay) : NIL, NIL)));
	}

	/**
	* Emit javascript that will cause the contents of a page using HANDLER and ARGS (an alist)
	* (@see MAKE-URL-FROM-HANDLER-AND-ARGS) to be inserted into an HTML element of type TAG.  First,
	* however, it will display MESSAGE for at least DELAY (msec) after the DOM for the containing page
	* has loaded.
	*
	* @unknown because each delayed-load causes another round trip to the Cyc server, programmers should try to get
	relatively large chunks (of HTML or of Cyc processing) with each call.
	*/

	public static final SubLObject js_delayed_load_int_alt(SubLObject plist) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = plist;
				SubLObject current = datum;
				SubLObject handler_tail = property_list_member($HANDLER, current);
				SubLObject handler = (NIL != handler_tail) ? ((SubLObject) (cadr(handler_tail))) : NIL;
				SubLObject args_tail = property_list_member($ARGS, current);
				SubLObject args = (NIL != args_tail) ? ((SubLObject) (cadr(args_tail))) : NIL;
				SubLObject message_tail = property_list_member($MESSAGE, current);
				SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : NIL;
				SubLObject tag_tail = property_list_member($TAG, current);
				SubLObject tag = (NIL != tag_tail) ? ((SubLObject) (cadr(tag_tail))) : NIL;
				SubLObject delay_tail = property_list_member($DELAY, current);
				SubLObject delay = (NIL != delay_tail) ? ((SubLObject) (cadr(delay_tail))) : NIL;
				SubLObject url = com.cyc.cycjava.cycl.dhtml_macros.make_url_from_handler_and_args(handler, args);
				SubLObject elt_id = cconcatenate($str_alt209$cyc_elt_, format_nil.format_nil_a_no_copy($html_element_id$.getDynamicValue(thread)));
				format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt210$__A_id___A___A___A_, new SubLObject[] { tag, elt_id, message, tag });
				format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt211$_script_type__text_javascript__tr, new SubLObject[] { url, elt_id, delay, elt_id, message });
				$html_element_id$.setDynamicValue(add($html_element_id$.getDynamicValue(thread), ONE_INTEGER), thread);
				return NIL;
			}
		}
	}

	public static SubLObject js_delayed_load_int(final SubLObject plist) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject handler_tail = property_list_member($HANDLER, plist);
		final SubLObject handler = (NIL != handler_tail) ? cadr(handler_tail) : NIL;
		final SubLObject args_tail = property_list_member($ARGS, plist);
		final SubLObject args = (NIL != args_tail) ? cadr(args_tail) : NIL;
		final SubLObject message_tail = property_list_member($MESSAGE, plist);
		final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : NIL;
		final SubLObject tag_tail = property_list_member($TAG, plist);
		final SubLObject tag = (NIL != tag_tail) ? cadr(tag_tail) : NIL;
		final SubLObject delay_tail = property_list_member($DELAY, plist);
		final SubLObject delay = (NIL != delay_tail) ? cadr(delay_tail) : NIL;
		final SubLObject url = make_url_from_handler_and_args(handler, args);
		final SubLObject elt_id = cconcatenate($str205$cyc_elt_, format_nil.format_nil_a_no_copy($html_element_id$.getDynamicValue(thread)));
		format(html_macros.$html_stream$.getDynamicValue(thread), $str206$__A_id___A___A___A_, new SubLObject[] { tag, elt_id, message, tag });
		format(html_macros.$html_stream$.getDynamicValue(thread), $str207$_script_type__text_javascript__tr, new SubLObject[] { url, elt_id, delay, elt_id, message });
		$html_element_id$.setDynamicValue(add($html_element_id$.getDynamicValue(thread), ONE_INTEGER), thread);
		return NIL;
	}

	public static final SubLObject make_url_from_handler_and_args_alt(SubLObject handler, SubLObject arg_alist) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject output_string = cconcatenate(system_parameters.$cyc_cgi_program$.getDynamicValue(thread), new SubLObject[] { $str_alt212$_, string_utilities.to_string(handler) });
				SubLObject cdolist_list_var = arg_alist;
				SubLObject cons = NIL;
				for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
					{
						SubLObject datum = cons;
						SubLObject current = datum;
						SubLObject key = NIL;
						SubLObject value = NIL;
						destructuring_bind_must_consp(current, datum, $list_alt213);
						key = current.first();
						current = current.rest();
						value = current;
						output_string = cconcatenate(output_string, new SubLObject[] { $str_alt214$_, key, $str_alt215$_, cb_term_identifier(value) });
					}
				}
				return output_string;
			}
		}
	}

	public static SubLObject make_url_from_handler_and_args(final SubLObject handler, final SubLObject arg_alist) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject output_string = cconcatenate(system_parameters.$cyc_cgi_program$.getDynamicValue(thread), new SubLObject[] { $str208$_, string_utilities.to_string(handler) });
		SubLObject cdolist_list_var = arg_alist;
		SubLObject cons = NIL;
		cons = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = cons;
			SubLObject key = NIL;
			SubLObject value = NIL;
			destructuring_bind_must_consp(current, datum, $list209);
			key = current.first();
			current = value = current.rest();
			output_string = cconcatenate(output_string, new SubLObject[] { $str210$_, key, $str211$_, cb_term_identifier(value) });
			cdolist_list_var = cdolist_list_var.rest();
			cons = cdolist_list_var.first();
		}
		return output_string;
	}

	public static SubLObject init_kea_support() {
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
			format(html_macros.$html_stream$.getDynamicValue(thread), $kea_set_focal_tool$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		} finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_script_tail$.getGlobalValue());
		return NIL;
	}

	public static SubLObject html_basic_cb_scripts() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		cyc_file_dependencies.css($MENU_CSS);
		cyc_file_dependencies.css($CB_CYC);
		cyc_file_dependencies.javascript($SELECTOR);
		cyc_file_dependencies.javascript($EVENT_DELEGATION);
		cyc_file_dependencies.javascript($CONTAINER_CORE);
		cyc_file_dependencies.javascript($MENU);
		cyc_file_dependencies.javascript($OVERLIB);
		cyc_file_dependencies.javascript($CB);
		cyc_file_dependencies.javascript($CB_INLINE_EDIT);
		cyc_file_dependencies.javascript($CYCJS_KEA_SESSION_BUS);
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_style_head$.getGlobalValue());
		format(html_macros.$html_stream$.getDynamicValue(thread), $str223$__yui_skin_sam__editContainer__yu);
		html_markup(html_macros.$html_style_tail$.getGlobalValue());
		init_kea_support();
		return NIL;
	}

	public static final SubLObject declare_dhtml_macros_file_alt() {
		declareMacro("dhtml_with_cascading_style_sheet", "DHTML-WITH-CASCADING-STYLE-SHEET");
		declareMacro("dhtml_dom_wrapper", "DHTML-DOM-WRAPPER");
		declareFunction("dhtml_dom_wrapper_preamble", "DHTML-DOM-WRAPPER-PREAMBLE", 1, 0, false);
		declareFunction("dhtml_dom_wrapper_postamble", "DHTML-DOM-WRAPPER-POSTAMBLE", 0, 0, false);
		declareMacro("dhtml_dom_attribute", "DHTML-DOM-ATTRIBUTE");
		declareFunction("dhtml_dom_attribute_preamble", "DHTML-DOM-ATTRIBUTE-PREAMBLE", 1, 0, false);
		declareFunction("dhtml_dom_attribute_postamble", "DHTML-DOM-ATTRIBUTE-POSTAMBLE", 0, 0, false);
		declareMacro("dhtml_declare_dom_object", "DHTML-DECLARE-DOM-OBJECT");
		declareFunction("dhtml_with_dom_script", "DHTML-WITH-DOM-SCRIPT", 0, 0, false);
		declareFunction("dhtml_creation_scripts", "DHTML-CREATION-SCRIPTS", 0, 0, false);
		declareFunction("dhtml_with_toggle_visibility_support", "DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT", 0, 0, false);
		declareFunction("flow_type_p", "FLOW-TYPE-P", 1, 0, false);
		declareFunction("visibility_p", "VISIBILITY-P", 1, 0, false);
		declareFunction("invert_visibility", "INVERT-VISIBILITY", 1, 0, false);
		declareFunction("dhtml_encode_visibility", "DHTML-ENCODE-VISIBILITY", 2, 0, false);
		declareFunction("dhtml_generate_visibility_setter", "DHTML-GENERATE-VISIBILITY-SETTER", 2, 1, false);
		declareFunction("dhtml_set_visibility", "DHTML-SET-VISIBILITY", 2, 1, false);
		declareFunction("dhtml_visibility_generate_switch_ids", "DHTML-VISIBILITY-GENERATE-SWITCH-IDS", 1, 0, false);
		declareFunction("dhtml_visibility_generate_show_object_id", "DHTML-VISIBILITY-GENERATE-SHOW-OBJECT-ID", 1, 0, false);
		declareFunction("dhtml_visibility_generate_hide_object_id", "DHTML-VISIBILITY-GENERATE-HIDE-OBJECT-ID", 1, 0, false);
		declareMacro("dhtml_potentially_show", "DHTML-POTENTIALLY-SHOW");
		declareMacro("dhtml_potentially_show_switched", "DHTML-POTENTIALLY-SHOW-SWITCHED");
		declareMacro("dhtml_potentially_show_text", "DHTML-POTENTIALLY-SHOW-TEXT");
		declareFunction("dhtml_set_switched_visibility", "DHTML-SET-SWITCHED-VISIBILITY", 2, 1, false);
		declareMacro("dhtml_set_visibility_link", "DHTML-SET-VISIBILITY-LINK");
		declareMacro("dhtml_toggle_visibility_link", "DHTML-TOGGLE-VISIBILITY-LINK");
		declareFunction("dhtml_visibility_generate_js_for_toggle", "DHTML-VISIBILITY-GENERATE-JS-FOR-TOGGLE", 1, 0, false);
		declareMacro("dhtml_switch_visibility_links_with_code", "DHTML-SWITCH-VISIBILITY-LINKS-WITH-CODE");
		declareFunction("dhtml_visibility_generate_ids_and_actions", "DHTML-VISIBILITY-GENERATE-IDS-AND-ACTIONS", 1, 0, false);
		declareFunction("dhtml_visibility_declare_dom_objects", "DHTML-VISIBILITY-DECLARE-DOM-OBJECTS", 2, 0, false);
		declareMacro("dhtml_switch_visiblity_link", "DHTML-SWITCH-VISIBLITY-LINK");
		declareFunction("dhtml_switch_visibility_generate_show_action", "DHTML-SWITCH-VISIBILITY-GENERATE-SHOW-ACTION", 3, 0, false);
		declareFunction("dhtml_switch_visibility_generate_hide_action", "DHTML-SWITCH-VISIBILITY-GENERATE-HIDE-ACTION", 3, 0, false);
		declareMacro("dhtml_change_visibile_section", "DHTML-CHANGE-VISIBILE-SECTION");
		declareFunction("dhtml_change_visible_section_onclick", "DHTML-CHANGE-VISIBLE-SECTION-ONCLICK", 2, 0, false);
		declareFunction("dhtml_switch_visibility_links", "DHTML-SWITCH-VISIBILITY-LINKS", 3, 0, false);
		declareFunction("dhtml_switch_visibility_links_plus_minus", "DHTML-SWITCH-VISIBILITY-LINKS-PLUS-MINUS", 2, 0, false);
		declareFunction("dhtml_switch_visibility_links_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS", 2, 0, false);
		declareFunction("dhtml_switch_visibility_links_icons", "DHTML-SWITCH-VISIBILITY-LINKS-ICONS", 4, 0, false);
		declareFunction("dhtml_switch_visibility_links_arrows_and_text", "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS-AND-TEXT", 2, 0, false);
		declareFunction("dhtml_switch_visibility_links_left_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS", 2, 0, false);
		declareFunction("dhtml_switch_visibility_links_up_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-UP-ARROWS", 1, 0, false);
		declareFunction("dhtml_switch_visibility_no_arrow", "DHTML-SWITCH-VISIBILITY-NO-ARROW", 0, 0, false);
		declareFunction("dhtml_header_stylesheet_links_for_devedge_menu", "DHTML-HEADER-STYLESHEET-LINKS-FOR-DEVEDGE-MENU", 0, 0, false);
		declareFunction("dhtml_emit_devedge_menus_header_links", "DHTML-EMIT-DEVEDGE-MENUS-HEADER-LINKS", 0, 0, false);
		declareFunction("dhtml_emit_devedge_menus_scripts", "DHTML-EMIT-DEVEDGE-MENUS-SCRIPTS", 0, 0, false);
		declareMacro("with_dhtml_devedge_menues", "WITH-DHTML-DEVEDGE-MENUES");
		declareMacro("dhtml_devedge_menu", "DHTML-DEVEDGE-MENU");
		declareMacro("dhtml_devedge_submenu", "DHTML-DEVEDGE-SUBMENU");
		declareMacro("dhtml_devedge_submenu_item", "DHTML-DEVEDGE-SUBMENU-ITEM");
		declareFunction("get_next_html_element_id", "GET-NEXT-HTML-ELEMENT-ID", 0, 0, false);
		declareFunction("basic_ajax_scripts", "BASIC-AJAX-SCRIPTS", 0, 0, false);
		declareMacro("with_delayed_html_load_support", "WITH-DELAYED-HTML-LOAD-SUPPORT");
		declareMacro("js_delayed_load", "JS-DELAYED-LOAD");
		declareFunction("js_delayed_load_int", "JS-DELAYED-LOAD-INT", 1, 0, false);
		declareFunction("make_url_from_handler_and_args", "MAKE-URL-FROM-HANDLER-AND-ARGS", 2, 0, false);
		return NIL;
	}

	public static SubLObject declare_dhtml_macros_file() {
		if (SubLFiles.USE_V1) {
			declareMacro("dhtml_with_cascading_style_sheet", "DHTML-WITH-CASCADING-STYLE-SHEET");
			declareMacro("dhtml_dom_wrapper", "DHTML-DOM-WRAPPER");
			declareFunction("dhtml_dom_wrapper_preamble", "DHTML-DOM-WRAPPER-PREAMBLE", 1, 0, false);
			declareFunction("dhtml_dom_wrapper_postamble", "DHTML-DOM-WRAPPER-POSTAMBLE", 0, 0, false);
			declareMacro("dhtml_dom_attribute", "DHTML-DOM-ATTRIBUTE");
			declareFunction("dhtml_dom_attribute_preamble", "DHTML-DOM-ATTRIBUTE-PREAMBLE", 1, 0, false);
			declareFunction("dhtml_dom_attribute_postamble", "DHTML-DOM-ATTRIBUTE-POSTAMBLE", 0, 0, false);
			declareMacro("dhtml_declare_dom_object", "DHTML-DECLARE-DOM-OBJECT");
			declareFunction("dhtml_with_dom_script", "DHTML-WITH-DOM-SCRIPT", 0, 0, false);
			declareFunction("dhtml_creation_scripts", "DHTML-CREATION-SCRIPTS", 0, 0, false);
			declareFunction("dhtml_lexical_scripts", "DHTML-LEXICAL-SCRIPTS", 0, 0, false);
			declareFunction("dhtml_with_toggle_visibility_support", "DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT", 0, 0, false);
			declareFunction("flow_type_p", "FLOW-TYPE-P", 1, 0, false);
			declareFunction("visibility_p", "VISIBILITY-P", 1, 0, false);
			declareFunction("invert_visibility", "INVERT-VISIBILITY", 1, 0, false);
			declareFunction("dhtml_encode_visibility", "DHTML-ENCODE-VISIBILITY", 2, 0, false);
			declareFunction("dhtml_generate_visibility_setter", "DHTML-GENERATE-VISIBILITY-SETTER", 2, 1, false);
			declareFunction("dhtml_generate_class_visibility_toggle", "DHTML-GENERATE-CLASS-VISIBILITY-TOGGLE", 1, 1, false);
			declareFunction("dhtml_set_visibility", "DHTML-SET-VISIBILITY", 2, 1, false);
			declareFunction("dhtml_visibility_generate_switch_ids", "DHTML-VISIBILITY-GENERATE-SWITCH-IDS", 1, 0, false);
			declareFunction("dhtml_class_visibility_generate_switch_ids", "DHTML-CLASS-VISIBILITY-GENERATE-SWITCH-IDS", 1, 0, false);
			declareFunction("dhtml_visibility_generate_show_object_id", "DHTML-VISIBILITY-GENERATE-SHOW-OBJECT-ID", 1, 0, false);
			declareFunction("dhtml_visibility_generate_hide_object_id", "DHTML-VISIBILITY-GENERATE-HIDE-OBJECT-ID", 1, 0, false);
			declareFunction("dhtml_class_visibility_generate_show_object_id", "DHTML-CLASS-VISIBILITY-GENERATE-SHOW-OBJECT-ID", 1, 0, false);
			declareFunction("dhtml_class_visibility_generate_hide_object_id", "DHTML-CLASS-VISIBILITY-GENERATE-HIDE-OBJECT-ID", 1, 0, false);
			declareMacro("dhtml_potentially_show", "DHTML-POTENTIALLY-SHOW");
			declareMacro("dhtml_potentially_show_switched", "DHTML-POTENTIALLY-SHOW-SWITCHED");
			declareMacro("dhtml_potentially_show_text", "DHTML-POTENTIALLY-SHOW-TEXT");
			declareFunction("dhtml_set_switched_visibility", "DHTML-SET-SWITCHED-VISIBILITY", 2, 1, false);
			declareMacro("dhtml_set_visibility_link", "DHTML-SET-VISIBILITY-LINK");
			declareMacro("dhtml_toggle_visibility_link", "DHTML-TOGGLE-VISIBILITY-LINK");
			declareMacro("dhtml_toggle_class_visibility_link", "DHTML-TOGGLE-CLASS-VISIBILITY-LINK");
			declareFunction("dhtml_visibility_generate_js_for_toggle", "DHTML-VISIBILITY-GENERATE-JS-FOR-TOGGLE", 1, 0, false);
			declareFunction("dhtml_visibility_generate_js_for_class_toggle", "DHTML-VISIBILITY-GENERATE-JS-FOR-CLASS-TOGGLE", 1, 1, false);
			declareMacro("dhtml_switch_visibility_links_with_code", "DHTML-SWITCH-VISIBILITY-LINKS-WITH-CODE");
			declareMacro("dhtml_switch_class_visibility_links_with_code", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-WITH-CODE");
			declareFunction("dhtml_visibility_generate_ids_and_actions", "DHTML-VISIBILITY-GENERATE-IDS-AND-ACTIONS", 1, 0, false);
			declareFunction("dhtml_class_visibility_generate_ids_and_actions", "DHTML-CLASS-VISIBILITY-GENERATE-IDS-AND-ACTIONS", 1, 0, false);
			declareFunction("dhtml_visibility_declare_dom_objects", "DHTML-VISIBILITY-DECLARE-DOM-OBJECTS", 2, 0, false);
			declareMacro("dhtml_switch_visiblity_link", "DHTML-SWITCH-VISIBLITY-LINK");
			declareFunction("dhtml_switch_visibility_generate_show_action", "DHTML-SWITCH-VISIBILITY-GENERATE-SHOW-ACTION", 3, 0, false);
			declareFunction("dhtml_switch_visibility_generate_hide_action", "DHTML-SWITCH-VISIBILITY-GENERATE-HIDE-ACTION", 3, 0, false);
			declareFunction("dhtml_switch_class_visibility_generate_show_action", "DHTML-SWITCH-CLASS-VISIBILITY-GENERATE-SHOW-ACTION", 3, 0, false);
			declareFunction("dhtml_switch_class_visibility_generate_hide_action", "DHTML-SWITCH-CLASS-VISIBILITY-GENERATE-HIDE-ACTION", 3, 0, false);
			declareMacro("dhtml_change_visibile_section", "DHTML-CHANGE-VISIBILE-SECTION");
			declareFunction("dhtml_change_visible_section_onclick", "DHTML-CHANGE-VISIBLE-SECTION-ONCLICK", 2, 0, false);
			declareFunction("dhtml_switch_visibility_links", "DHTML-SWITCH-VISIBILITY-LINKS", 3, 0, false);
			declareFunction("dhtml_switch_visibility_links_plus_minus", "DHTML-SWITCH-VISIBILITY-LINKS-PLUS-MINUS", 2, 0, false);
			declareFunction("dhtml_switch_visibility_links_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS", 2, 0, false);
			declareFunction("dhtml_switch_class_visibility_links_arrows", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-ARROWS", 2, 1, false);
			declareFunction("dhtml_switch_visibility_links_icons", "DHTML-SWITCH-VISIBILITY-LINKS-ICONS", 4, 0, false);
			declareFunction("dhtml_switch_class_visibility_links_icons", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-ICONS", 4, 1, false);
			declareFunction("dhtml_switch_visibility_links_arrows_and_text", "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS-AND-TEXT", 2, 0, false);
			declareFunction("dhtml_switch_visibility_links_left_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS", 2, 0, false);
			declareFunction("dhtml_switch_visibility_links_up_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-UP-ARROWS", 1, 0, false);
			declareFunction("dhtml_switch_visibility_no_arrow", "DHTML-SWITCH-VISIBILITY-NO-ARROW", 0, 0, false);
			declareFunction("get_next_html_element_id", "GET-NEXT-HTML-ELEMENT-ID", 0, 0, false);
			declareFunction("basic_ajax_scripts", "BASIC-AJAX-SCRIPTS", 0, 0, false);
			declareMacro("with_delayed_html_load_support", "WITH-DELAYED-HTML-LOAD-SUPPORT");
			declareMacro("js_delayed_load", "JS-DELAYED-LOAD");
			declareFunction("js_delayed_load_int", "JS-DELAYED-LOAD-INT", 1, 0, false);
			declareFunction("make_url_from_handler_and_args", "MAKE-URL-FROM-HANDLER-AND-ARGS", 2, 0, false);
			declareFunction("init_kea_support", "INIT-KEA-SUPPORT", 0, 0, false);
			declareFunction("html_basic_cb_scripts", "HTML-BASIC-CB-SCRIPTS", 0, 0, false);
		}
		if (SubLFiles.USE_V2) {
			declareFunction("dhtml_header_stylesheet_links_for_devedge_menu", "DHTML-HEADER-STYLESHEET-LINKS-FOR-DEVEDGE-MENU", 0, 0, false);
			declareFunction("dhtml_emit_devedge_menus_header_links", "DHTML-EMIT-DEVEDGE-MENUS-HEADER-LINKS", 0, 0, false);
			declareFunction("dhtml_emit_devedge_menus_scripts", "DHTML-EMIT-DEVEDGE-MENUS-SCRIPTS", 0, 0, false);
			declareMacro("with_dhtml_devedge_menues", "WITH-DHTML-DEVEDGE-MENUES");
			declareMacro("dhtml_devedge_menu", "DHTML-DEVEDGE-MENU");
			declareMacro("dhtml_devedge_submenu", "DHTML-DEVEDGE-SUBMENU");
			declareMacro("dhtml_devedge_submenu_item", "DHTML-DEVEDGE-SUBMENU-ITEM");
		}
		return NIL;
	}

	public static SubLObject declare_dhtml_macros_file_Previous() {
		declareMacro("dhtml_with_cascading_style_sheet", "DHTML-WITH-CASCADING-STYLE-SHEET");
		declareMacro("dhtml_dom_wrapper", "DHTML-DOM-WRAPPER");
		declareFunction("dhtml_dom_wrapper_preamble", "DHTML-DOM-WRAPPER-PREAMBLE", 1, 0, false);
		declareFunction("dhtml_dom_wrapper_postamble", "DHTML-DOM-WRAPPER-POSTAMBLE", 0, 0, false);
		declareMacro("dhtml_dom_attribute", "DHTML-DOM-ATTRIBUTE");
		declareFunction("dhtml_dom_attribute_preamble", "DHTML-DOM-ATTRIBUTE-PREAMBLE", 1, 0, false);
		declareFunction("dhtml_dom_attribute_postamble", "DHTML-DOM-ATTRIBUTE-POSTAMBLE", 0, 0, false);
		declareMacro("dhtml_declare_dom_object", "DHTML-DECLARE-DOM-OBJECT");
		declareFunction("dhtml_with_dom_script", "DHTML-WITH-DOM-SCRIPT", 0, 0, false);
		declareFunction("dhtml_creation_scripts", "DHTML-CREATION-SCRIPTS", 0, 0, false);
		declareFunction("dhtml_lexical_scripts", "DHTML-LEXICAL-SCRIPTS", 0, 0, false);
		declareFunction("dhtml_with_toggle_visibility_support", "DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT", 0, 0, false);
		declareFunction("flow_type_p", "FLOW-TYPE-P", 1, 0, false);
		declareFunction("visibility_p", "VISIBILITY-P", 1, 0, false);
		declareFunction("invert_visibility", "INVERT-VISIBILITY", 1, 0, false);
		declareFunction("dhtml_encode_visibility", "DHTML-ENCODE-VISIBILITY", 2, 0, false);
		declareFunction("dhtml_generate_visibility_setter", "DHTML-GENERATE-VISIBILITY-SETTER", 2, 1, false);
		declareFunction("dhtml_generate_class_visibility_toggle", "DHTML-GENERATE-CLASS-VISIBILITY-TOGGLE", 1, 1, false);
		declareFunction("dhtml_set_visibility", "DHTML-SET-VISIBILITY", 2, 1, false);
		declareFunction("dhtml_visibility_generate_switch_ids", "DHTML-VISIBILITY-GENERATE-SWITCH-IDS", 1, 0, false);
		declareFunction("dhtml_class_visibility_generate_switch_ids", "DHTML-CLASS-VISIBILITY-GENERATE-SWITCH-IDS", 1, 0, false);
		declareFunction("dhtml_visibility_generate_show_object_id", "DHTML-VISIBILITY-GENERATE-SHOW-OBJECT-ID", 1, 0, false);
		declareFunction("dhtml_visibility_generate_hide_object_id", "DHTML-VISIBILITY-GENERATE-HIDE-OBJECT-ID", 1, 0, false);
		declareFunction("dhtml_class_visibility_generate_show_object_id", "DHTML-CLASS-VISIBILITY-GENERATE-SHOW-OBJECT-ID", 1, 0, false);
		declareFunction("dhtml_class_visibility_generate_hide_object_id", "DHTML-CLASS-VISIBILITY-GENERATE-HIDE-OBJECT-ID", 1, 0, false);
		declareMacro("dhtml_potentially_show", "DHTML-POTENTIALLY-SHOW");
		declareMacro("dhtml_potentially_show_switched", "DHTML-POTENTIALLY-SHOW-SWITCHED");
		declareMacro("dhtml_potentially_show_text", "DHTML-POTENTIALLY-SHOW-TEXT");
		declareFunction("dhtml_set_switched_visibility", "DHTML-SET-SWITCHED-VISIBILITY", 2, 1, false);
		declareMacro("dhtml_set_visibility_link", "DHTML-SET-VISIBILITY-LINK");
		declareMacro("dhtml_toggle_visibility_link", "DHTML-TOGGLE-VISIBILITY-LINK");
		declareMacro("dhtml_toggle_class_visibility_link", "DHTML-TOGGLE-CLASS-VISIBILITY-LINK");
		declareFunction("dhtml_visibility_generate_js_for_toggle", "DHTML-VISIBILITY-GENERATE-JS-FOR-TOGGLE", 1, 0, false);
		declareFunction("dhtml_visibility_generate_js_for_class_toggle", "DHTML-VISIBILITY-GENERATE-JS-FOR-CLASS-TOGGLE", 1, 1, false);
		declareMacro("dhtml_switch_visibility_links_with_code", "DHTML-SWITCH-VISIBILITY-LINKS-WITH-CODE");
		declareMacro("dhtml_switch_class_visibility_links_with_code", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-WITH-CODE");
		declareFunction("dhtml_visibility_generate_ids_and_actions", "DHTML-VISIBILITY-GENERATE-IDS-AND-ACTIONS", 1, 0, false);
		declareFunction("dhtml_class_visibility_generate_ids_and_actions", "DHTML-CLASS-VISIBILITY-GENERATE-IDS-AND-ACTIONS", 1, 0, false);
		declareFunction("dhtml_visibility_declare_dom_objects", "DHTML-VISIBILITY-DECLARE-DOM-OBJECTS", 2, 0, false);
		declareMacro("dhtml_switch_visiblity_link", "DHTML-SWITCH-VISIBLITY-LINK");
		declareFunction("dhtml_switch_visibility_generate_show_action", "DHTML-SWITCH-VISIBILITY-GENERATE-SHOW-ACTION", 3, 0, false);
		declareFunction("dhtml_switch_visibility_generate_hide_action", "DHTML-SWITCH-VISIBILITY-GENERATE-HIDE-ACTION", 3, 0, false);
		declareFunction("dhtml_switch_class_visibility_generate_show_action", "DHTML-SWITCH-CLASS-VISIBILITY-GENERATE-SHOW-ACTION", 3, 0, false);
		declareFunction("dhtml_switch_class_visibility_generate_hide_action", "DHTML-SWITCH-CLASS-VISIBILITY-GENERATE-HIDE-ACTION", 3, 0, false);
		declareMacro("dhtml_change_visibile_section", "DHTML-CHANGE-VISIBILE-SECTION");
		declareFunction("dhtml_change_visible_section_onclick", "DHTML-CHANGE-VISIBLE-SECTION-ONCLICK", 2, 0, false);
		declareFunction("dhtml_switch_visibility_links", "DHTML-SWITCH-VISIBILITY-LINKS", 3, 0, false);
		declareFunction("dhtml_switch_visibility_links_plus_minus", "DHTML-SWITCH-VISIBILITY-LINKS-PLUS-MINUS", 2, 0, false);
		declareFunction("dhtml_switch_visibility_links_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS", 2, 0, false);
		declareFunction("dhtml_switch_class_visibility_links_arrows", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-ARROWS", 2, 1, false);
		declareFunction("dhtml_switch_visibility_links_icons", "DHTML-SWITCH-VISIBILITY-LINKS-ICONS", 4, 0, false);
		declareFunction("dhtml_switch_class_visibility_links_icons", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-ICONS", 4, 1, false);
		declareFunction("dhtml_switch_visibility_links_arrows_and_text", "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS-AND-TEXT", 2, 0, false);
		declareFunction("dhtml_switch_visibility_links_left_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS", 2, 0, false);
		declareFunction("dhtml_switch_visibility_links_up_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-UP-ARROWS", 1, 0, false);
		declareFunction("dhtml_switch_visibility_no_arrow", "DHTML-SWITCH-VISIBILITY-NO-ARROW", 0, 0, false);
		declareFunction("get_next_html_element_id", "GET-NEXT-HTML-ELEMENT-ID", 0, 0, false);
		declareFunction("basic_ajax_scripts", "BASIC-AJAX-SCRIPTS", 0, 0, false);
		declareMacro("with_delayed_html_load_support", "WITH-DELAYED-HTML-LOAD-SUPPORT");
		declareMacro("js_delayed_load", "JS-DELAYED-LOAD");
		declareFunction("js_delayed_load_int", "JS-DELAYED-LOAD-INT", 1, 0, false);
		declareFunction("make_url_from_handler_and_args", "MAKE-URL-FROM-HANDLER-AND-ARGS", 2, 0, false);
		declareFunction("init_kea_support", "INIT-KEA-SUPPORT", 0, 0, false);
		declareFunction("html_basic_cb_scripts", "HTML-BASIC-CB-SCRIPTS", 0, 0, false);
		return NIL;
	}

	public static final SubLObject init_dhtml_macros_file_alt() {
		defconstant("*DHTML-CSS-HEAD*", $str_alt0$_style);
		defconstant("*DHTML-CSS-TYPE*", $str_alt1$_type_);
		defconstant("*DHTML-CSS-MEDIA*", $str_alt2$_media_);
		defconstant("*DHTML-CSS-TAIL*", $str_alt3$__style_);
		defconstant("*DHTML-DOM-POSITION*", $$$position);
		defconstant("*DHTML-DOM-TOP*", $$$top);
		defconstant("*DHTML-DOM-BOTTOM*", $$$bottom);
		defconstant("*DHTML-DOM-RIGHT*", $$$right);
		defconstant("*DHTML-DOM-LEFT*", $$$left);
		defconstant("*DHTML-DOM-VISIBILITY*", $$$visibility);
		defconstant("*DHTML-DOM-DISPLAY*", $$$display);
		defconstant("*DHTML-DOM-HEIGHT*", $$$height);
		defconstant("*DHTML-DOM-WIDTH*", $$$width);
		deflexical("*DHTML-FIND-DOM-JS*", $str_alt61$__script_language__JavaScript__sr);
		deflexical("*DHTML-TOGGLE-VISIBILITY-JS*", $str_alt62$__script_language__JavaScript__sr);
		defconstant("*DHTML-BLANK-HREF-JS*", $str_alt63$javascript_void____);
		deflexical("*DHTML-DEVEDGE-MENUS-DHTML*", $str_alt166$_javascript_cssjsmenudhtml_css);
		deflexical("*DHTML-DEVEDGE-MENUS-HOVER*", $str_alt167$_javascript_cssjsmenuhover_css);
		deflexical("*DHTML-DEVEDGE-MENUS-PRESO*", $str_alt168$_javascript_cssjsmenupreso_css);
		deflexical("*DHTML-DEVEDGE-SCRIPTS-DHTML*", $str_alt170$_javascript_dhtml_js);
		deflexical("*DHTML-DEVEDGE-SCRIPTS-CSSJSMENU*", $str_alt171$_javascript_cssjsmenu_js);
		deflexical("*DHTML-DEVEDGE-SCRIPTS-CONFIG-JS*", $str_alt172$_javascript_config_js);
		deflexical("*DHTML-DEVEDGE-MENU-CLASS*", $$$navbar);
		deflexical("*DHTML-DEVEDGE-MENU-SYSTEM-CLASS*", $str_alt177$nde_menu_system);
		deflexical("*DHTML-DEVEDGE-SUBMENU-CLASS*", $$$submenu);
		defparameter("*HTML-ELEMENT-ID*", ZERO_INTEGER);
		deflexical("*JS-LOAD-LATER*", $str_alt196$_script_type__text_javascript__fu);
		return NIL;
	}

	public static SubLObject init_dhtml_macros_file() {
		if (SubLFiles.USE_V1) {
			defconstant("*DHTML-CSS-HEAD*", $str0$_style);
			defconstant("*DHTML-CSS-TYPE*", $str1$_type_);
			defconstant("*DHTML-CSS-MEDIA*", $str2$_media_);
			defconstant("*DHTML-CSS-TAIL*", $str3$__style_);
			defconstant("*DHTML-DOM-POSITION*", $$$position);
			defconstant("*DHTML-DOM-TOP*", $$$top);
			defconstant("*DHTML-DOM-BOTTOM*", $$$bottom);
			defconstant("*DHTML-DOM-RIGHT*", $$$right);
			defconstant("*DHTML-DOM-LEFT*", $$$left);
			defconstant("*DHTML-DOM-VISIBILITY*", $$$visibility);
			defconstant("*DHTML-DOM-DISPLAY*", $$$display);
			defconstant("*DHTML-DOM-HEIGHT*", $$$height);
			defconstant("*DHTML-DOM-WIDTH*", $$$width);
			defconstant("*DHTML-BLANK-HREF-JS*", $str61$javascript_void____);
			defparameter("*HTML-ELEMENT-ID*", ZERO_INTEGER);
			deflexical("*JS-LOAD-LATER*", $str192$_script_type__text_javascript__fu);
			deflexical("*KEA-SET-FOCAL-TOOL*", $str212$_if__isKeaHosted________var_keaBu);
		}
		if (SubLFiles.USE_V2) {
			deflexical("*DHTML-FIND-DOM-JS*", $str_alt61$__script_language__JavaScript__sr);
			deflexical("*DHTML-TOGGLE-VISIBILITY-JS*", $str_alt62$__script_language__JavaScript__sr);
			defconstant("*DHTML-BLANK-HREF-JS*", $str_alt63$javascript_void____);
			deflexical("*DHTML-DEVEDGE-MENUS-DHTML*", $str_alt166$_javascript_cssjsmenudhtml_css);
			deflexical("*DHTML-DEVEDGE-MENUS-HOVER*", $str_alt167$_javascript_cssjsmenuhover_css);
			deflexical("*DHTML-DEVEDGE-MENUS-PRESO*", $str_alt168$_javascript_cssjsmenupreso_css);
			deflexical("*DHTML-DEVEDGE-SCRIPTS-DHTML*", $str_alt170$_javascript_dhtml_js);
			deflexical("*DHTML-DEVEDGE-SCRIPTS-CSSJSMENU*", $str_alt171$_javascript_cssjsmenu_js);
			deflexical("*DHTML-DEVEDGE-SCRIPTS-CONFIG-JS*", $str_alt172$_javascript_config_js);
			deflexical("*DHTML-DEVEDGE-MENU-CLASS*", $$$navbar);
			deflexical("*DHTML-DEVEDGE-MENU-SYSTEM-CLASS*", $str_alt177$nde_menu_system);
			deflexical("*DHTML-DEVEDGE-SUBMENU-CLASS*", $$$submenu);
			deflexical("*JS-LOAD-LATER*", $str_alt196$_script_type__text_javascript__fu);
		}
		return NIL;
	}

	public static SubLObject init_dhtml_macros_file_Previous() {
		defconstant("*DHTML-CSS-HEAD*", $str0$_style);
		defconstant("*DHTML-CSS-TYPE*", $str1$_type_);
		defconstant("*DHTML-CSS-MEDIA*", $str2$_media_);
		defconstant("*DHTML-CSS-TAIL*", $str3$__style_);
		defconstant("*DHTML-DOM-POSITION*", $$$position);
		defconstant("*DHTML-DOM-TOP*", $$$top);
		defconstant("*DHTML-DOM-BOTTOM*", $$$bottom);
		defconstant("*DHTML-DOM-RIGHT*", $$$right);
		defconstant("*DHTML-DOM-LEFT*", $$$left);
		defconstant("*DHTML-DOM-VISIBILITY*", $$$visibility);
		defconstant("*DHTML-DOM-DISPLAY*", $$$display);
		defconstant("*DHTML-DOM-HEIGHT*", $$$height);
		defconstant("*DHTML-DOM-WIDTH*", $$$width);
		defconstant("*DHTML-BLANK-HREF-JS*", $str61$javascript_void____);
		defparameter("*HTML-ELEMENT-ID*", ZERO_INTEGER);
		deflexical("*JS-LOAD-LATER*", $str192$_script_type__text_javascript__fu);
		deflexical("*KEA-SET-FOCAL-TOOL*", $str212$_if__isKeaHosted________var_keaBu);
		return NIL;
	}

	public static final SubLObject setup_dhtml_macros_file_alt() {
		register_macro_helper(DHTML_DOM_WRAPPER_PREAMBLE, DHTML_DOM_WRAPPER);
		register_macro_helper(DHTML_DOM_WRAPPER_POSTAMBLE, DHTML_DOM_WRAPPER);
		register_macro_helper(DHTML_DOM_ATTRIBUTE_PREAMBLE, DHTML_DOM_ATTRIBUTE);
		register_macro_helper(DHTML_DOM_ATTRIBUTE_POSTAMBLE, DHTML_DOM_ATTRIBUTE);
		sethash($CONSTANT_CREATION, $javascript_definitions$.getGlobalValue(), list($str_alt65$constant_creation_js, NIL));
		register_macro_helper(DHTML_SET_SWITCHED_VISIBILITY, DHTML_POTENTIALLY_SHOW_SWITCHED);
		register_macro_helper(DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE, DHTML_TOGGLE_VISIBILITY_LINK);
		meta_macros.declare_indention_pattern(DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE, $list_alt131);
		register_macro_helper(DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS, DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
		register_macro_helper(DHTML_VISIBILITY_DECLARE_DOM_OBJECTS, DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
		register_macro_helper(DHTML_SWITCH_VISIBLITY_LINK, DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
		register_macro_helper(DHTML_CHANGE_VISIBLE_SECTION_ONCLICK, DHTML_CHANGE_VISIBILE_SECTION);
		sethash($RIGHT_TRIANGLE_V, $html_icon_definitions$.getGlobalValue(), list($str_alt146$cyc_right_triangle_violet_gif, $str_alt147$_Show_));
		sethash($LEFT_TRIANGLE_V, $html_icon_definitions$.getGlobalValue(), list($str_alt149$cyc_left_triangle_violet_gif, $str_alt147$_Show_));
		sethash($DOWN_TRIANGLE_V, $html_icon_definitions$.getGlobalValue(), list($str_alt151$cyc_down_triangle_violet_gif, $str_alt152$_Hide_));
		sethash($UP_TRIANGLE_V, $html_icon_definitions$.getGlobalValue(), list($str_alt154$cyc_up_triangle_violet_gif, $str_alt152$_Hide_));
		sethash($BLANK_TRIANGLE, $html_icon_definitions$.getGlobalValue(), list($str_alt156$cyc_no_triangle_violet_gif, $str_alt157$__));
		sethash($SQUARE_MINUS, $html_icon_definitions$.getGlobalValue(), list($str_alt159$square_minus_gif, $str_alt147$_Show_));
		sethash($SQUARE_PLUS, $html_icon_definitions$.getGlobalValue(), list($str_alt161$square_plus_gif, $str_alt152$_Hide_));
		sethash($SQUARE_BLANK, $html_icon_definitions$.getGlobalValue(), list($str_alt163$square_blank_gif, $str_alt157$__));
		sethash($YAHOO_MIN, $javascript_definitions$.getGlobalValue(), list($str_alt188$yahoo_min_js, NIL));
		sethash($EVENT_MIN, $javascript_definitions$.getGlobalValue(), list($str_alt190$event_min_js, NIL));
		sethash($CONNECTION, $javascript_definitions$.getGlobalValue(), list($str_alt192$connection_min_js, NIL));
		register_macro_helper(JS_DELAYED_LOAD_INT, JS_DELAYED_LOAD);
		return NIL;
	}

	public static SubLObject setup_dhtml_macros_file() {
		if (SubLFiles.USE_V1) {
			register_macro_helper(DHTML_DOM_WRAPPER_PREAMBLE, DHTML_DOM_WRAPPER);
			register_macro_helper(DHTML_DOM_WRAPPER_POSTAMBLE, DHTML_DOM_WRAPPER);
			register_macro_helper(DHTML_DOM_ATTRIBUTE_PREAMBLE, DHTML_DOM_ATTRIBUTE);
			register_macro_helper(DHTML_DOM_ATTRIBUTE_POSTAMBLE, DHTML_DOM_ATTRIBUTE);
			register_macro_helper(DHTML_SET_SWITCHED_VISIBILITY, DHTML_POTENTIALLY_SHOW_SWITCHED);
			register_macro_helper(DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE, DHTML_TOGGLE_VISIBILITY_LINK);
			register_macro_helper(DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE, DHTML_TOGGLE_VISIBILITY_LINK);
			meta_macros.declare_indention_pattern(DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE, $list151);
			register_macro_helper(DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS, DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
			register_macro_helper(DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS, DHTML_SWITCH_CLASS_VISIBILITY_LINKS_WITH_CODE);
			register_macro_helper(DHTML_VISIBILITY_DECLARE_DOM_OBJECTS, DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
			register_macro_helper(DHTML_SWITCH_VISIBLITY_LINK, DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
			register_macro_helper(DHTML_CHANGE_VISIBLE_SECTION_ONCLICK, DHTML_CHANGE_VISIBILE_SECTION);
			sethash($RIGHT_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str166$cyc_right_triangle_violet_gif, $str167$_Show_));
			sethash($LEFT_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str169$cyc_left_triangle_violet_gif, $str167$_Show_));
			sethash($DOWN_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str171$cyc_down_triangle_violet_gif, $str172$_Hide_));
			sethash($UP_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str174$cyc_up_triangle_violet_gif, $str172$_Hide_));
			sethash($BLANK_TRIANGLE, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str176$cyc_no_triangle_violet_gif, $$$__));
			sethash($SQUARE_MINUS, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str179$square_minus_gif, $str167$_Show_));
			sethash($SQUARE_PLUS, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str181$square_plus_gif, $str172$_Hide_));
			sethash($SQUARE_BLANK, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str183$square_blank_gif, $$$__));
			register_macro_helper(JS_DELAYED_LOAD_INT, JS_DELAYED_LOAD);
		}
		if (SubLFiles.USE_V2) {
			sethash($CONSTANT_CREATION, $javascript_definitions$.getGlobalValue(), list($str_alt65$constant_creation_js, NIL));
			meta_macros.declare_indention_pattern(DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE, $list_alt131);
			sethash($RIGHT_TRIANGLE_V, $html_icon_definitions$.getGlobalValue(), list($str_alt146$cyc_right_triangle_violet_gif, $str_alt147$_Show_));
			sethash($LEFT_TRIANGLE_V, $html_icon_definitions$.getGlobalValue(), list($str_alt149$cyc_left_triangle_violet_gif, $str_alt147$_Show_));
			sethash($DOWN_TRIANGLE_V, $html_icon_definitions$.getGlobalValue(), list($str_alt151$cyc_down_triangle_violet_gif, $str_alt152$_Hide_));
			sethash($UP_TRIANGLE_V, $html_icon_definitions$.getGlobalValue(), list($str_alt154$cyc_up_triangle_violet_gif, $str_alt152$_Hide_));
			sethash($BLANK_TRIANGLE, $html_icon_definitions$.getGlobalValue(), list($str_alt156$cyc_no_triangle_violet_gif, $str_alt157$__));
			sethash($SQUARE_MINUS, $html_icon_definitions$.getGlobalValue(), list($str_alt159$square_minus_gif, $str_alt147$_Show_));
			sethash($SQUARE_PLUS, $html_icon_definitions$.getGlobalValue(), list($str_alt161$square_plus_gif, $str_alt152$_Hide_));
			sethash($SQUARE_BLANK, $html_icon_definitions$.getGlobalValue(), list($str_alt163$square_blank_gif, $str_alt157$__));
			sethash($YAHOO_MIN, $javascript_definitions$.getGlobalValue(), list($str_alt188$yahoo_min_js, NIL));
			sethash($EVENT_MIN, $javascript_definitions$.getGlobalValue(), list($str_alt190$event_min_js, NIL));
			sethash($CONNECTION, $javascript_definitions$.getGlobalValue(), list($str_alt192$connection_min_js, NIL));
		}
		return NIL;
	}

	public static SubLObject setup_dhtml_macros_file_Previous() {
		register_macro_helper(DHTML_DOM_WRAPPER_PREAMBLE, DHTML_DOM_WRAPPER);
		register_macro_helper(DHTML_DOM_WRAPPER_POSTAMBLE, DHTML_DOM_WRAPPER);
		register_macro_helper(DHTML_DOM_ATTRIBUTE_PREAMBLE, DHTML_DOM_ATTRIBUTE);
		register_macro_helper(DHTML_DOM_ATTRIBUTE_POSTAMBLE, DHTML_DOM_ATTRIBUTE);
		register_macro_helper(DHTML_SET_SWITCHED_VISIBILITY, DHTML_POTENTIALLY_SHOW_SWITCHED);
		register_macro_helper(DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE, DHTML_TOGGLE_VISIBILITY_LINK);
		register_macro_helper(DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE, DHTML_TOGGLE_VISIBILITY_LINK);
		meta_macros.declare_indention_pattern(DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE, $list151);
		register_macro_helper(DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS, DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
		register_macro_helper(DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS, DHTML_SWITCH_CLASS_VISIBILITY_LINKS_WITH_CODE);
		register_macro_helper(DHTML_VISIBILITY_DECLARE_DOM_OBJECTS, DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
		register_macro_helper(DHTML_SWITCH_VISIBLITY_LINK, DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE);
		register_macro_helper(DHTML_CHANGE_VISIBLE_SECTION_ONCLICK, DHTML_CHANGE_VISIBILE_SECTION);
		sethash($RIGHT_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str166$cyc_right_triangle_violet_gif, $str167$_Show_));
		sethash($LEFT_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str169$cyc_left_triangle_violet_gif, $str167$_Show_));
		sethash($DOWN_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str171$cyc_down_triangle_violet_gif, $str172$_Hide_));
		sethash($UP_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str174$cyc_up_triangle_violet_gif, $str172$_Hide_));
		sethash($BLANK_TRIANGLE, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str176$cyc_no_triangle_violet_gif, $$$__));
		sethash($SQUARE_MINUS, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str179$square_minus_gif, $str167$_Show_));
		sethash($SQUARE_PLUS, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str181$square_plus_gif, $str172$_Hide_));
		sethash($SQUARE_BLANK, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str183$square_blank_gif, $$$__));
		register_macro_helper(JS_DELAYED_LOAD_INT, JS_DELAYED_LOAD);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_dhtml_macros_file();
	}

	@Override
	public void initializeVariables() {
		init_dhtml_macros_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_dhtml_macros_file();
	}

	

	// Internal Constants
	@LispMethod(comment = "Internal Constants")
	static private final SubLString $str_alt0$_style = makeString("<style");

	static private final SubLString $str_alt1$_type_ = makeString(" type=");

	static private final SubLString $str_alt2$_media_ = makeString(" media=");

	static private final SubLString $str_alt3$__style_ = makeString("</style>");

	static private final SubLList $list_alt4 = list(list(makeSymbol("&OPTIONAL"), list(makeSymbol("TYPE"), makeString("text/css")), list(makeSymbol("MEDIA"), makeString("screen"))), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLString $str_alt5$text_css = makeString("text/css");

	static private final SubLList $list_alt8 = list(makeSymbol("*DHTML-CSS-TYPE*"));

	static private final SubLList $list_alt10 = list(makeSymbol("*DHTML-CSS-MEDIA*"));

	static private final SubLList $list_alt13 = list(makeSymbol("*DHTML-CSS-HEAD*"), makeSymbol("*DHTML-CSS-TAIL*"));

	static private final SubLList $list_alt15 = list(list(makeSymbol("HTML-TERPRI")));

	static private final SubLList $list_alt25 = list(list(makeSymbol("OBJECT-ID")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list_alt27 = list(list(makeSymbol("DHTML-DOM-WRAPPER-POSTAMBLE")));

	static private final SubLString $str_alt29$__A__ = makeString("#~A {");

	static private final SubLString $str_alt31$__ = makeString(" }");

	static private final SubLList $list_alt32 = list(list(makeSymbol("ATTRIBUTE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list_alt34 = list(list(makeSymbol("DHTML-DOM-ATTRIBUTE-POSTAMBLE")));

	static private final SubLString $str_alt36$__A_ = makeString(" ~A:");

	static private final SubLString $str_alt38$_ = makeString(";");

	static private final SubLList $list_alt39 = list(list(makeSymbol("OBJECT-ID"), list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("TOP"), makeSymbol("BOTTOM"), makeSymbol("RIGHT"), makeSymbol("LEFT"), makeSymbol("HEIGHT"), makeSymbol("WIDTH"), makeSymbol("POSITION"), makeSymbol("VISIBILITY"), makeSymbol("DISPLAY") }), makeSymbol("&BODY"), makeSymbol("BODY")));

	static private final SubLList $list_alt40 = list(new SubLObject[] { makeKeyword("TOP"), makeKeyword("BOTTOM"), makeKeyword("RIGHT"), $LEFT, makeKeyword("HEIGHT"), makeKeyword("WIDTH"), makeKeyword("POSITION"), makeKeyword("VISIBILITY"), makeKeyword("DISPLAY") });

	static private final SubLList $list_alt51 = list(makeSymbol("*DHTML-DOM-POSITION*"));

	static private final SubLList $list_alt52 = list(makeSymbol("*DHTML-DOM-TOP*"));

	static private final SubLList $list_alt53 = list(makeSymbol("*DHTML-DOM-BOTTOM*"));

	static private final SubLList $list_alt54 = list(makeSymbol("*DHTML-DOM-LEFT*"));

	static private final SubLList $list_alt55 = list(makeSymbol("*DHTML-DOM-RIGHT*"));

	static private final SubLList $list_alt56 = list(makeSymbol("*DHTML-DOM-VISIBILITY*"));

	static private final SubLList $list_alt57 = list(makeSymbol("*DHTML-DOM-DISPLAY*"));

	static private final SubLList $list_alt58 = list(makeSymbol("*DHTML-DOM-HEIGHT*"));

	static private final SubLList $list_alt59 = list(makeSymbol("*DHTML-DOM-WIDTH*"));

	static private final SubLList $list_alt60 = list(makeSymbol("HTML-TERPRI"));

	static private final SubLString $str_alt61$__script_language__JavaScript__sr = makeString(" <script language=\"JavaScript\" src=\"/javascript/findDOM.js\"></script>");

	static private final SubLString $str_alt62$__script_language__JavaScript__sr = makeString(" <script language=\"JavaScript\" src=\"/javascript/visibility.js\"></script>");

	static private final SubLString $str_alt63$javascript_void____ = makeString("javascript:void('')");

	static private final SubLString $str_alt65$constant_creation_js = makeString("constant-creation.js");

	static private final SubLString $str_alt66$text_javascript = makeString("text/javascript");

	static private final SubLList $list_alt67 = list(makeKeyword("PARAGRAPH"), $TEXT);

	static private final SubLList $list_alt68 = list(makeKeyword("VISIBLE"), makeKeyword("INVISIBLE"));

	static private final SubLString $str_alt71$_S_was_not_a_known_visibility_p = makeString("~S was not a known visibility-p");

	static private final SubLString $str_alt79$setVisibility__ = makeString("setVisibility('");

	static private final SubLString $str_alt80$___ = makeString("','");

	static private final SubLString $str_alt81$___ = makeString("');");

	static private final SubLString $str_alt83$_show_button = makeString("_show_button");

	static private final SubLString $str_alt84$_hide_button = makeString("_hide_button");

	static private final SubLList $list_alt85 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&KEY"), list(makeSymbol("INITIAL-VISIBILITY"), makeKeyword("VISIBLE")), list(makeSymbol("FLOW-TYPE"), $TEXT)), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list_alt86 = list(makeKeyword("INITIAL-VISIBILITY"), makeKeyword("FLOW-TYPE"));

	static private final SubLList $list_alt92 = list(list(makeSymbol("HTML-SOURCE-READABILITY-TERPRI")));

	static private final SubLList $list_alt94 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&KEY"), list(makeSymbol("STYLE"), makeString(""))), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list_alt95 = list(makeKeyword("STYLE"));

	static private final SubLList $list_alt100 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("VISIBILITY"), makeSymbol("&KEY"), makeSymbol("LINK-TEXT"), list(makeSymbol("FLOW-TYPE"), $TEXT)), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list_alt101 = list(makeKeyword("LINK-TEXT"), makeKeyword("FLOW-TYPE"));

	static private final SubLSymbol $sym103$HREF = makeUninternedSymbol("HREF");

	static private final SubLSymbol $sym104$CLICK_ACTION = makeUninternedSymbol("CLICK-ACTION");

	static private final SubLList $list_alt106 = list(makeSymbol("*DHTML-BLANK-HREF-JS*"));

	static private final SubLList $list_alt113 = list(list(makeSymbol("OBJECT-ID"), makeSymbol("&KEY"), makeSymbol("LINK-TEXT")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list_alt114 = list(makeKeyword("LINK-TEXT"));

	static private final SubLSymbol $sym115$HREF = makeUninternedSymbol("HREF");

	static private final SubLSymbol $sym116$CLICK_ACTION = makeUninternedSymbol("CLICK-ACTION");

	static private final SubLString $str_alt120$toggleVisibility__ = makeString("toggleVisibility('");

	static private final SubLList $list_alt121 = list(makeSymbol("OBJECT-ID"), makeSymbol("SHOW-LINK-CODE"), makeSymbol("HIDE-LINK-CODE"));

	static private final SubLSymbol $sym122$SHOW_ID = makeUninternedSymbol("SHOW-ID");

	static private final SubLSymbol $sym123$SHOW_ACTION = makeUninternedSymbol("SHOW-ACTION");

	static private final SubLSymbol $sym124$HIDE_ID = makeUninternedSymbol("HIDE-ID");

	static private final SubLSymbol $sym125$HIDE_ACTION = makeUninternedSymbol("HIDE-ACTION");

	static private final SubLList $list_alt131 = list(makeSymbol("OBJECT-ID"), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list_alt132 = list(makeSymbol("OBJECT-ID"), makeSymbol("ONCLICK-ACTION"), makeSymbol("LINK-CODE"));

	static private final SubLSymbol $sym133$HREF = makeUninternedSymbol("HREF");

	static private final SubLList $list_alt136 = list(list(makeSymbol("&KEY"), makeSymbol("SHOW"), makeSymbol("HIDE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list_alt137 = list($SHOW, $HIDE);

	static private final SubLList $list_alt140 = list(makeSymbol("HTML-MARKUP"), list(makeSymbol("JAVASCRIPT-VOID-URL")));

	static private final SubLString $str_alt143$___block___setVisibility__ = makeString("','block');setVisibility('");

	static private final SubLString $str_alt144$___none___ = makeString("','none');");

	static private final SubLString $str_alt146$cyc_right_triangle_violet_gif = makeString("cyc-right-triangle-violet.gif");

	static private final SubLString $str_alt147$_Show_ = makeString("[Show]");

	static private final SubLString $str_alt149$cyc_left_triangle_violet_gif = makeString("cyc-left-triangle-violet.gif");

	static private final SubLString $str_alt151$cyc_down_triangle_violet_gif = makeString("cyc-down-triangle-violet.gif");

	static private final SubLString $str_alt152$_Hide_ = makeString("[Hide]");

	static private final SubLString $str_alt154$cyc_up_triangle_violet_gif = makeString("cyc-up-triangle-violet.gif");

	static private final SubLString $str_alt156$cyc_no_triangle_violet_gif = makeString("cyc-no-triangle-violet.gif");

	static private final SubLString $str_alt157$__ = makeString("  ");

	static private final SubLString $str_alt159$square_minus_gif = makeString("square-minus.gif");

	static private final SubLString $str_alt161$square_plus_gif = makeString("square-plus.gif");

	static private final SubLString $str_alt163$square_blank_gif = makeString("square-blank.gif");

	static private final SubLString $str_alt166$_javascript_cssjsmenudhtml_css = makeString("/javascript/cssjsmenudhtml.css");

	static private final SubLString $str_alt167$_javascript_cssjsmenuhover_css = makeString("/javascript/cssjsmenuhover.css");

	static private final SubLString $str_alt168$_javascript_cssjsmenupreso_css = makeString("/javascript/cssjsmenupreso.css");

	static private final SubLString $$$hoverJS = makeString("hoverJS");

	static private final SubLString $str_alt170$_javascript_dhtml_js = makeString("/javascript/dhtml.js");

	static private final SubLString $str_alt171$_javascript_cssjsmenu_js = makeString("/javascript/cssjsmenu.js");

	static private final SubLString $str_alt172$_javascript_config_js = makeString("/javascript/config.js");

	static private final SubLString $$$javascript = makeString("javascript");

	static private final SubLList $list_alt174 = list(makeSymbol("DHTML-HEADER-STYLESHEET-LINKS-FOR-DEVEDGE-MENU"));

	static private final SubLList $list_alt175 = list(makeSymbol("HTML-JAVASCRIPT"), list(makeSymbol("HTML-PRINC"), makeString("init(); ")));

	static private final SubLString $$$navbar = makeString("navbar");

	static private final SubLString $str_alt177$nde_menu_system = makeString("nde-menu-system");

	static private final SubLString $$$submenu = makeString("submenu");

	static private final SubLList $list_alt179 = list(makeKeyword("CLASS"), makeSymbol("*DHTML-DEVEDGE-MENU-CLASS*"));

	private static final SubLSymbol HTML_FANCY_UNORDERED_LIST = makeSymbol("HTML-FANCY-UNORDERED-LIST");

	static private final SubLList $list_alt181 = list(makeKeyword("CLASS"), makeSymbol("*DHTML-DEVEDGE-MENU-SYSTEM-CLASS*"));

	static private final SubLList $list_alt182 = list(makeSymbol("TITLE-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol HTML_FANCY_LIST_ITEM = makeSymbol("HTML-FANCY-LIST-ITEM");

	static private final SubLList $list_alt184 = list(makeKeyword("CLASS"), makeSymbol("*DHTML-DEVEDGE-SUBMENU-CLASS*"));

	private static final SubLSymbol HTML_UNORDERED_LIST = makeSymbol("HTML-UNORDERED-LIST");

	private static final SubLSymbol HTML_LIST_ITEM = makeSymbol("HTML-LIST-ITEM");

	private static final SubLSymbol $YAHOO_MIN = makeKeyword("YAHOO-MIN");

	static private final SubLString $str_alt188$yahoo_min_js = makeString("yahoo-min.js");

	private static final SubLSymbol $EVENT_MIN = makeKeyword("EVENT-MIN");

	static private final SubLString $str_alt190$event_min_js = makeString("event-min.js");

	static private final SubLString $str_alt192$connection_min_js = makeString("connection-min.js");

	static private final SubLList $list_alt193 = list(list(makeSymbol("*HTML-ELEMENT-ID*"), ZERO_INTEGER));

	static private final SubLList $list_alt194 = list(makeSymbol("BASIC-AJAX-SCRIPTS"));

	static private final SubLList $list_alt195 = list(makeSymbol("HTML-MARKUP"), makeSymbol("*JS-LOAD-LATER*"));

	static private final SubLString $str_alt196$_script_type__text_javascript__fu = makeString(
			"<script type=\'text/javascript\'>function loadLater(url, id) {\n  var callback = {success: handleDelayedLoad, \n                  failure: handleFailedDelayedLoad,\n                  argument: {eltId: id}};\n  YAHOO.util.Connect.asyncRequest(\'get\', url, callback);\n}\nfunction handleDelayedLoad(o) {\n  document.getElementById(o.argument.eltId).innerHTML=o.responseText;\n}\nfunction handleFailedDelayedLoad(o) {\n  document.getElementById(o.argument.eltId).innerHTML=\'Unable to load\';\n}\n</script>\n");

	static private final SubLList $list_alt197 = list(makeSymbol("HANDLER"), makeSymbol("ARGS"), makeSymbol("&KEY"), list(makeSymbol("MESSAGE"), makeString("")), list(makeSymbol("TAG"), makeString("span")), list(makeSymbol("DELAY"), makeInteger(50)));

	static private final SubLList $list_alt198 = list(makeKeyword("MESSAGE"), makeKeyword("TAG"), makeKeyword("DELAY"));

	static private final SubLString $str_alt209$cyc_elt_ = makeString("cyc-elt-");

	static private final SubLString $str_alt210$__A_id___A___A___A_ = makeString("<~A id='~A'>~A</~A>");

	static private final SubLString $str_alt211$_script_type__text_javascript__tr = makeString("<script type=\'text/javascript\'>try {YAHOO.util.Event.addListener(window, \'load\', setTimeout(\"loadLater(\'~A\', \'~A\')\", ~A));} catch(err) {document.getElementById(\'~a\').innerHTML=\'Error ~A\';}</script>");

	static private final SubLString $str_alt212$_ = makeString("?");

	static private final SubLList $list_alt213 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

	static private final SubLString $str_alt214$_ = makeString("&");

	static private final SubLString $str_alt215$_ = makeString("=");
}

/**
 * Total time: 726 ms
 */
