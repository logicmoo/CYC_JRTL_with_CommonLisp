/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_style_background_color;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.html_utilities.html_url_princ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.package_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.package_nicknames;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.packagep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-TRANSLATION-BROWSER
 * source file: /cyc/top/cycl/cb-translation-browser.lisp
 * created:     2019/07/03 17:39:08
 */
public final class cb_translation_browser extends SubLTranslatedFile implements V12 {
    public static final SubLObject cb_td_show_module_cvsweb(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject url = translator_utilities.td_module_cvsweb_url(module);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(url);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                        html_princ(module);
                        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLFile me = new cb_translation_browser();

 public static final String myName = "com.cyc.cycjava.cycl.cb_translation_browser";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_td_access_color_map$ = makeSymbol("*CB-TD-ACCESS-COLOR-MAP*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $prin1_symbol_to_string_caching_state$ = makeSymbol("*PRIN1-SYMBOL-TO-STRING-CACHING-STATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("&KEY"), makeSymbol("TITLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list(makeKeyword("TITLE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol CB_HEAD = makeSymbol("CB-HEAD");

    private static final SubLSymbol HTML_TITLE = makeSymbol("HTML-TITLE");

    static private final SubLList $list9 = list(makeKeyword("SHOW-COPYRIGHT"), T);

    static private final SubLList $list14 = list(list(makeSymbol("PRIVATE"), makeString("FF7F7F")), list(makeSymbol("PROTECTED"), makeString("FFFF7F")), list(makeSymbol("PUBLIC"), makeString("7FFF7F")));

    private static final SubLSymbol CB_TD_TOOL = makeSymbol("CB-TD-TOOL");

    private static final SubLString $str18$cb_td_tool = makeString("cb-td-tool");

    private static final SubLSymbol CB_LINK_TD_TOOL = makeSymbol("CB-LINK-TD-TOOL");

    private static final SubLSymbol CB_TD_SEARCH = makeSymbol("CB-TD-SEARCH");

    private static final SubLString $str22$_Translation_Database_Browser_ = makeString("[Translation Database Browser]");

    private static final SubLString $str24$cb_td_search = makeString("cb-td-search");

    private static final SubLSymbol CB_LINK_TD_SEARCH = makeSymbol("CB-LINK-TD-SEARCH");

    private static final SubLString $str27$There_is_no_current_SubL_translat = makeString("There is no current SubL translation state.");

    private static final SubLString $str28$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str29$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLString $$$Translation_Database_Browser = makeString("Translation Database Browser");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str34$cb_td_handle_search = makeString("cb-td-handle-search");

    private static final SubLString $str36$_Current_Translation_Summary_ = makeString("[Current Translation Summary]");

    private static final SubLString $$$Find_a_ = makeString("Find a ");

    private static final SubLString $$$kind = makeString("kind");

    private static final SubLString $$$method = makeString("method");

    private static final SubLString $$$function_or_macro = makeString("function or macro");

    private static final SubLString $$$global = makeString("global");

    private static final SubLString $$$global_variable = makeString("global variable");

    private static final SubLString $$$module = makeString("module");

    private static final SubLString $$$source_file = makeString("source file");

    private static final SubLString $$$_called = makeString(" called");

    private static final SubLString $$$name = makeString("name");



    private static final SubLString $$$Find_now = makeString("Find now");

    private static final SubLString $$$Clear_Input = makeString("Clear Input");

    private static final SubLSymbol CB_TD_HANDLE_SEARCH = makeSymbol("CB-TD-HANDLE-SEARCH");

    private static final SubLSymbol CB_TD_SUMMARY = makeSymbol("CB-TD-SUMMARY");

    private static final SubLString $str54$_Summary_ = makeString("[Summary]");

    private static final SubLString $str55$cb_td_summary = makeString("cb-td-summary");

    private static final SubLSymbol CB_LINK_TD_SUMMARY = makeSymbol("CB-LINK-TD-SUMMARY");

    private static final SubLString $$$Translation_Summary = makeString("Translation Summary");

    private static final SubLString $str58$_Search_Page_ = makeString("[Search Page]");

    private static final SubLString $str59$Features___ = makeString("Features : ");

    private static final SubLString $$$Module = makeString("Module");

    private static final SubLString $$$Features = makeString("Features");

    static private final SubLList $list63 = cons(makeSymbol("OPERATOR"), makeSymbol("SUB-EXPRESSIONS"));

    private static final SubLString $str64$_ = makeString("(");

    private static final SubLString $str65$_ = makeString(")");

    private static final SubLList $list66 = list(makeSymbol("MODULE"));

    private static final SubLSymbol CB_TD_MODULE = makeSymbol("CB-TD-MODULE");

    private static final SubLSymbol TD_MODULE_P = makeSymbol("TD-MODULE-P");

    private static final SubLString $str69$cb_td_module_ = makeString("cb-td-module|");

    private static final SubLSymbol CB_LINK_TD_MODULE = makeSymbol("CB-LINK-TD-MODULE");

    private static final SubLString $str71$Module____A = makeString("Module : ~A");

    private static final SubLString $str72$Module___ = makeString("Module : ");

    private static final SubLString $$$Properties = makeString("Properties");

    private static final SubLString $$$Definitions = makeString("Definitions");

    private static final SubLString $$$Globals_defined_in_this_module = makeString("Globals defined in this module");

    private static final SubLString $$$Attributes = makeString("Attributes");

    private static final SubLSymbol CB_TD_SHOW_GLOBAL_DEFINITION_ATTRIBUTES = makeSymbol("CB-TD-SHOW-GLOBAL-DEFINITION-ATTRIBUTES");

    private static final SubLString $$$Methods_defined_in_this_module = makeString("Methods defined in this module");

    private static final SubLSymbol CB_TD_SHOW_METHOD_DEFINITION_ATTRIBUTES = makeSymbol("CB-TD-SHOW-METHOD-DEFINITION-ATTRIBUTES");

    private static final SubLString $str80$Top_Level_References = makeString("Top-Level References");

    private static final SubLString $str81$Methods_called_by_top_level_forms = makeString("Methods called by top-level forms in this module");

    private static final SubLString $str82$Globals_called_by_top_level_forms = makeString("Globals called by top-level forms in this module");

    private static final SubLString $$$Methods = makeString("Methods");

    private static final SubLString $$$File_positions = makeString("File positions");

    private static final SubLString $$$Globals = makeString("Globals");

    private static final SubLString $str86$Callers__ = makeString("Callers :");

    private static final SubLString $str87$__ = makeString(", ");

    private static final SubLString $str88$Calls__ = makeString("Calls :");

    private static final SubLList $list89 = list(makeSymbol("PACKAGE-STRING"), makeSymbol("SYMBOL-STRING"));

    private static final SubLSymbol CB_TD_GLOBAL = makeSymbol("CB-TD-GLOBAL");

    private static final SubLString $str92$cb_td_global_ = makeString("cb-td-global|");

    private static final SubLString $str93$_ = makeString("|");

    private static final SubLSymbol CB_LINK_TD_GLOBAL = makeSymbol("CB-LINK-TD-GLOBAL");

    private static final SubLString $str95$Global____S = makeString("Global : ~S");

    private static final SubLString $str96$Global_Variable___ = makeString("Global Variable : ");

    private static final SubLString $str97$Access___ = makeString("Access : ");

    private static final SubLString $$$Definition = makeString("Definition");

    private static final SubLString $$$Internal_variable = makeString("Internal variable");

    private static final SubLString $$$Undefined_variable = makeString("Undefined variable");

    private static final SubLString $str101$Methods_that_reference_this_globa = makeString("Methods that reference this global");

    private static final SubLSymbol CB_TD_SHOW_METHOD_DEFINING_MODULE = makeSymbol("CB-TD-SHOW-METHOD-DEFINING-MODULE");

    private static final SubLString $str103$Globals_whose_initialization_refe = makeString("Globals whose initialization references this global");

    private static final SubLSymbol CB_TD_SHOW_GLOBAL_DEFINING_MODULE = makeSymbol("CB-TD-SHOW-GLOBAL-DEFINING-MODULE");

    private static final SubLString $str105$Modules_that_reference_this_globa = makeString("Modules that reference this global from top-level forms");

    private static final SubLString $str106$Methods_called_in_the_initializat = makeString("Methods called in the initialization of this global");

    private static final SubLString $str107$Globals_referenced_in_the_initial = makeString("Globals referenced in the initialization of this global");

    private static final SubLSymbol CB_TD_METHOD = makeSymbol("CB-TD-METHOD");

    private static final SubLString $str109$cb_td_method_ = makeString("cb-td-method|");

    private static final SubLSymbol CB_LINK_TD_METHOD = makeSymbol("CB-LINK-TD-METHOD");

    private static final SubLString $str111$Method____S = makeString("Method : ~S");

    private static final SubLString $str112$Method___ = makeString("Method : ");

    private static final SubLString $str113$Arglist___ = makeString("Arglist : ");

    private static final SubLString $$$Internal_method = makeString("Internal method");

    private static final SubLString $$$Undefined_method = makeString("Undefined method");

    private static final SubLString $$$Methods_that_call_this_method = makeString("Methods that call this method");

    private static final SubLString $str117$Globals_whose_initialization_call = makeString("Globals whose initialization calls this method");

    private static final SubLString $str118$Modules_that_call_this_method_fro = makeString("Modules that call this method from top-level forms");

    private static final SubLString $$$Methods_called_by_this_method = makeString("Methods called by this method");

    private static final SubLString $$$Globals_referenced_by_this_method = makeString("Globals referenced by this method");

    private static final SubLSymbol PACKAGE_TERSE_NAME = makeSymbol("PACKAGE-TERSE-NAME");

    private static final SubLSymbol $package_terse_name_caching_state$ = makeSymbol("*PACKAGE-TERSE-NAME-CACHING-STATE*");

    private static final SubLSymbol PRIN1_SYMBOL_TO_STRING = makeSymbol("PRIN1-SYMBOL-TO-STRING");

    private static final SubLString $str125$___A = makeString("#:~A");

    private static final SubLString $str126$_A___A = makeString("~A::~A");

    private static final SubLSymbol $sym127$_PRIN1_SYMBOL_TO_STRING_CACHING_STATE_ = makeSymbol("*PRIN1-SYMBOL-TO-STRING-CACHING-STATE*");

    private static final SubLString $str128$Position___ = makeString("Position : ");

    private static final SubLString $str129$Pathname___ = makeString("Pathname : ");

    private static final SubLString $$$macro = makeString("macro");

    private static final SubLString $$$no_callers = makeString("no callers");

    private static final SubLString $$$no_external_callers = makeString("no external callers");

    private static final SubLString $$$constant = makeString("constant");

    private static final SubLString $$$lexical = makeString("lexical");

    private static final SubLString $$$special = makeString("special");

    // Definitions
    public static final SubLObject cb_td_document_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_1 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt0);
                        current_1 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt0);
                        if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_1 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                    {
                        SubLObject title_tail = property_list_member($TITLE, current);
                        SubLObject title = (NIL != title_tail) ? ((SubLObject) (cadr(title_tail))) : NIL;
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(HTML_DOCUMENT, bq_cons(CB_HEAD, append(NIL != title ? ((SubLObject) (list(list(HTML_TITLE, list(HTML_PRINC, title))))) : NIL, NIL)), listS(HTML_FANCY_BODY, $list_alt9, append(body, NIL)));
                        }
                    }
                }
            }
        }
    }

    // Definitions
    public static SubLObject cb_td_document(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject title_tail = property_list_member($TITLE, current);
        final SubLObject title = (NIL != title_tail) ? cadr(title_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(HTML_DOCUMENT, bq_cons(CB_HEAD, append(NIL != title ? list(list(HTML_TITLE, list(HTML_PRINC, title))) : NIL, NIL)), listS(HTML_FANCY_BODY, $list9, append(body, NIL)));
    }

    public static final SubLObject cb_td_show_method_alt(SubLObject symbol) {
        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        cb_link($TD_METHOD, symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return symbol;
    }

    public static SubLObject cb_td_show_method(final SubLObject symbol) {
        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        cb_link($TD_METHOD, symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return symbol;
    }

    public static final SubLObject cb_td_show_global_alt(SubLObject symbol) {
        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        cb_link($TD_GLOBAL, symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return symbol;
    }

    public static SubLObject cb_td_show_global(final SubLObject symbol) {
        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        cb_link($TD_GLOBAL, symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return symbol;
    }

    public static final SubLObject cb_td_show_module_alt(SubLObject module) {
        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        cb_link($TD_MODULE, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return module;
    }

    public static SubLObject cb_td_show_module(final SubLObject module) {
        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        cb_link($TD_MODULE, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return module;
    }

    public static final SubLObject cb_td_show_faccess_alt(SubLObject symbol) {
        {
            SubLObject access_level = form_translation.faccess_level(symbol);
            html_princ(access_level);
        }
        return symbol;
    }

    public static SubLObject cb_td_show_faccess(final SubLObject symbol) {
        final SubLObject access_level = form_translation.faccess_level(symbol);
        html_princ(access_level);
        return symbol;
    }

    public static final SubLObject cb_td_show_vaccess_alt(SubLObject symbol) {
        {
            SubLObject access_level = form_translation.vaccess_level(symbol);
            html_princ(access_level);
        }
        return symbol;
    }

    public static SubLObject cb_td_show_vaccess(final SubLObject symbol) {
        final SubLObject access_level = form_translation.vaccess_level(symbol);
        html_princ(access_level);
        return symbol;
    }

    public static final SubLObject cb_td_show_faccess_hint_alt(SubLObject symbol) {
        return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_access_hint(form_translation.faccess_level(symbol));
    }

    public static SubLObject cb_td_show_faccess_hint(final SubLObject symbol) {
        return cb_td_show_access_hint(form_translation.faccess_level(symbol));
    }

    public static final SubLObject cb_td_show_vaccess_hint_alt(SubLObject symbol) {
        return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_access_hint(form_translation.vaccess_level(symbol));
    }

    public static SubLObject cb_td_show_vaccess_hint(final SubLObject symbol) {
        return cb_td_show_access_hint(form_translation.vaccess_level(symbol));
    }

    public static final SubLObject cb_td_show_access_hint_alt(SubLObject access) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color = com.cyc.cycjava.cycl.cb_translation_browser.cb_td_access_color(access);
                html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_markup(html_macros.$html_span_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_style_background_color(color);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_glyph($NBSP, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
            return access;
        }
    }

    public static SubLObject cb_td_show_access_hint(final SubLObject access) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject color = cb_td_access_color(access);
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_style_background_color(color);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_glyph($NBSP, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        return access;
    }

    public static final SubLObject cb_td_access_color_alt(SubLObject access) {
        return second(assoc(access, $cb_td_access_color_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cb_td_access_color(final SubLObject access) {
        return second(assoc(access, $cb_td_access_color_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_td_show_module_pathname_alt(SubLObject pathname) {
        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        html_princ(pathname);
        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_td_show_module_pathname(final SubLObject pathname) {
        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        html_princ(pathname);
        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_td_tool_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_search_guts();
    }

    public static SubLObject cb_td_tool(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_td_search_guts();
    }

    public static final SubLObject cb_link_td_tool_alt(SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt17$cb_td_tool);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_link_td_tool(final SubLObject linktext) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str18$cb_td_tool);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_td_search_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_search_guts();
    }

    public static SubLObject cb_td_search(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_td_search_guts();
    }

    public static final SubLObject cb_link_td_search_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt24$_Translation_Database_Browser_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt26$cb_td_search);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_link_td_search(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str22$_Translation_Database_Browser_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str24$cb_td_search);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_td_search_guts_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == translator_utilities.td_current_translation()) {
                return cb_error($str_alt29$There_is_no_current_SubL_translat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Translation_Database_Browser);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject frame_name_var = cb_frame_name(NIL);
                                html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != frame_name_var) {
                                    html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(frame_name_var);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_hidden_input($str_alt31$cb_td_handle_search, T, UNPROVIDED);
                                        html_princ_strong($$$Translation_Database_Browser);
                                        html_newline(TWO_INTEGER);
                                        cb_link($TD_SUMMARY, $str_alt33$_Current_Translation_Summary_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_newline(TWO_INTEGER);
                                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($LEFT));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($CENTER));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_princ($str_alt36$Find_a_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($LEFT));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($CENTER));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                                html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup($$$kind);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                        html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup($$$method);
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_princ($$$function_or_macro);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup($$$global);
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_princ($$$global_variable);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup($$$module);
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_princ($$$source_file);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($LEFT));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($CENTER));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_princ($str_alt44$_called);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_text_input($$$name, NIL, $int$40);
                                        html_newline(TWO_INTEGER);
                                        html_submit_input($$$Find_now, UNPROVIDED, UNPROVIDED);
                                        html_indent(UNPROVIDED);
                                        html_script_utilities.html_clear_input_button($$$name, $$$Clear_Input);
                                        html_indent(UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                        }
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject cb_td_search_guts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == translator_utilities.td_current_translation()) {
            return cb_error($str27$There_is_no_current_SubL_translat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_markup($str28$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str29$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Translation_Database_Browser);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject frame_name_var = cb_frame_name(NIL);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$post);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var) {
                        html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str34$cb_td_handle_search, T, UNPROVIDED);
                        html_princ_strong($$$Translation_Database_Browser);
                        html_newline(TWO_INTEGER);
                        cb_link($TD_SUMMARY, $str36$_Current_Translation_Summary_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_newline(TWO_INTEGER);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
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
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$Find_a_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
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
                                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                                    html_markup(html_macros.$html_select_name$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$kind);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_option_head$.getGlobalValue());
                                        html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($$$method);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($$$function_or_macro);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                        }
                                        html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_option_head$.getGlobalValue());
                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($$$global);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($$$global_variable);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                        }
                                        html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_option_head$.getGlobalValue());
                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($$$module);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($$$source_file);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                        }
                                        html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                    }
                                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
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
                                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$_called);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_text_input($$$name, NIL, $int$40);
                        html_newline(TWO_INTEGER);
                        html_submit_input($$$Find_now, UNPROVIDED, UNPROVIDED);
                        html_indent(UNPROVIDED);
                        html_script_utilities.html_clear_input_button($$$name, $$$Clear_Input, UNPROVIDED);
                        html_indent(UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_td_handle_search_alt(SubLObject args) {
        {
            SubLObject kind = html_extract_input($$$kind, args);
            SubLObject name = html_extract_input($$$name, args);
            if ($$$method.equal(kind)) {
                return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_method_guts(read_from_string_ignoring_errors(name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else {
                if ($$$global.equal(kind)) {
                    return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_global_guts(read_from_string_ignoring_errors(name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                } else {
                    if ($$$module.equal(kind)) {
                        return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_module_guts(Strings.string_upcase(name, UNPROVIDED, UNPROVIDED));
                    } else {
                        return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_search(UNPROVIDED);
                    }
                }
            }
        }
    }

    public static SubLObject cb_td_handle_search(final SubLObject args) {
        final SubLObject kind = html_extract_input($$$kind, args);
        final SubLObject name = html_extract_input($$$name, args);
        if ($$$method.equal(kind)) {
            return cb_td_method_guts(read_from_string_ignoring_errors(name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        if ($$$global.equal(kind)) {
            return cb_td_global_guts(read_from_string_ignoring_errors(name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        if ($$$module.equal(kind)) {
            return cb_td_module_guts(Strings.string_upcase(name, UNPROVIDED, UNPROVIDED));
        }
        return cb_td_search(UNPROVIDED);
    }

    public static final SubLObject cb_td_summary_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_summary_guts();
    }

    public static SubLObject cb_td_summary(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_td_summary_guts();
    }

    public static final SubLObject cb_link_td_summary_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt51$_Summary_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt52$cb_td_summary);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_link_td_summary(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str54$_Summary_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str55$cb_td_summary);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_td_summary_guts_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == translator_utilities.td_current_translation()) {
                return cb_error($str_alt29$There_is_no_current_SubL_translat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Translation_Summary);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_link($TD_SUMMARY, $$$Translation_Summary, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_indent(FOUR_INTEGER);
                            cb_link($TD_SEARCH, $str_alt55$_Search_Page_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_princ($str_alt56$Features___);
                            html_newline(UNPROVIDED);
                            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_translation_features();
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ZERO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ONE_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ONE_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($LEFT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ($$$Module);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($LEFT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ($$$Features);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    {
                                        SubLObject cdolist_list_var = translator_utilities.td_translation_modules();
                                        SubLObject module = NIL;
                                        for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align($LEFT));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align($TOP));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module(module);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align($LEFT));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align($TOP));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module_features(module);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                        }
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject cb_td_summary_guts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == translator_utilities.td_current_translation()) {
            return cb_error($str27$There_is_no_current_SubL_translat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_markup($str28$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str29$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Translation_Summary);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$14 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    cb_link($TD_SUMMARY, $$$Translation_Summary, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_indent(FOUR_INTEGER);
                    cb_link($TD_SEARCH, $str58$_Search_Page_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_newline(TWO_INTEGER);
                    html_princ($str59$Features___);
                    html_newline(UNPROVIDED);
                    cb_td_show_translation_features();
                    html_hr(UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ($$$Module);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ($$$Features);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        SubLObject cdolist_list_var = translator_utilities.td_translation_modules();
                        SubLObject module = NIL;
                        module = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
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
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_td_show_module(module);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
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
                                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_td_show_module_features(module);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            module = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$14, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_td_show_translation_features_alt() {
        {
            SubLObject translation_features = translator_utilities.td_translation_features();
            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            {
                SubLObject cdolist_list_var = translation_features;
                SubLObject feature = NIL;
                for (feature = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , feature = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_feature_expression(feature);
                    html_indent(UNPROVIDED);
                }
            }
            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_td_show_translation_features() {
        final SubLObject translation_features = translator_utilities.td_translation_features();
        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        SubLObject cdolist_list_var = translation_features;
        SubLObject feature = NIL;
        feature = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cb_td_show_feature_expression(feature);
            html_indent(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            feature = cdolist_list_var.first();
        } 
        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_td_show_module_features_alt(SubLObject module) {
        {
            SubLObject module_features = translator_utilities.td_module_features(module);
            if (T != module_features) {
                html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_feature_expression(module_features);
                html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject cb_td_show_module_features(final SubLObject module) {
        final SubLObject module_features = translator_utilities.td_module_features(module);
        if (T != module_features) {
            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            cb_td_show_feature_expression(module_features);
            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject cb_td_show_feature_expression_alt(SubLObject feature_expression) {
        if (feature_expression.isAtom()) {
            html_princ(symbol_name(feature_expression));
        } else {
            {
                SubLObject datum = feature_expression;
                SubLObject current = datum;
                SubLObject operator = NIL;
                SubLObject sub_expressions = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt60);
                operator = current.first();
                current = current.rest();
                sub_expressions = current;
                html_princ($str_alt61$_);
                html_princ(symbol_name(operator));
                {
                    SubLObject cdolist_list_var = sub_expressions;
                    SubLObject sub_expression = NIL;
                    for (sub_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_expression = cdolist_list_var.first()) {
                        html_indent(UNPROVIDED);
                        com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_feature_expression(sub_expression);
                    }
                }
                html_princ($str_alt62$_);
            }
        }
        return NIL;
    }

    public static SubLObject cb_td_show_feature_expression(final SubLObject feature_expression) {
        if (feature_expression.isAtom()) {
            html_princ(symbol_name(feature_expression));
        } else {
            SubLObject operator = NIL;
            SubLObject sub_expressions = NIL;
            destructuring_bind_must_consp(feature_expression, feature_expression, $list63);
            operator = feature_expression.first();
            final SubLObject current = sub_expressions = feature_expression.rest();
            html_princ($str64$_);
            html_princ(symbol_name(operator));
            SubLObject cdolist_list_var = sub_expressions;
            SubLObject sub_expression = NIL;
            sub_expression = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_indent(UNPROVIDED);
                cb_td_show_feature_expression(sub_expression);
                cdolist_list_var = cdolist_list_var.rest();
                sub_expression = cdolist_list_var.first();
            } 
            html_princ($str65$_);
        }
        return NIL;
    }

    public static final SubLObject cb_td_module_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt63);
            module = current.first();
            current = current.rest();
            if (NIL == current) {
                return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_module_guts(module);
            } else {
                cdestructuring_bind_error(datum, $list_alt63);
            }
        }
        return NIL;
    }

    public static SubLObject cb_td_module(final SubLObject args) {
        SubLObject module = NIL;
        destructuring_bind_must_consp(args, args, $list66);
        module = args.first();
        final SubLObject current = args.rest();
        if (NIL == current) {
            return cb_td_module_guts(module);
        }
        cdestructuring_bind_error(args, $list66);
        return NIL;
    }

    public static final SubLObject cb_link_td_module_alt(SubLObject module, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, TD_MODULE_P);
            if (NIL == linktext) {
                linktext = module;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt66$cb_td_module_);
                html_url_princ(module);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return module;
        }
    }

    public static SubLObject cb_link_td_module(final SubLObject module, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != translator_utilities.td_module_p(module) : "! translator_utilities.td_module_p(module) " + ("translator_utilities.td_module_p(module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(module) ") + module;
        if (NIL == linktext) {
            linktext = module;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str69$cb_td_module_);
        html_url_princ(module);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return module;
    }

    public static final SubLObject cb_td_module_guts_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == translator_utilities.td_current_translation()) {
                return cb_error($str_alt29$There_is_no_current_SubL_translat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject title = format(NIL, $str_alt68$Module____A, module);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ(title);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ_strong($str_alt69$Module___);
                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module(module);
                                html_indent(FOUR_INTEGER);
                                cb_link($TD_SEARCH, $str_alt55$_Search_Page_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                html_princ_strong($$$Properties);
                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module_properties(module);
                                {
                                    SubLObject references_modules = translator_utilities.td_modules_referenced_by_module(module);
                                    html_newline(UNPROVIDED);
                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_references_module_section(module, references_modules);
                                    {
                                        SubLObject referenced_by_modules = translator_utilities.td_modules_referencing_module(module);
                                        html_newline(UNPROVIDED);
                                        com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_referenced_by_module_section(module, referenced_by_modules);
                                    }
                                }
                                {
                                    SubLObject globals = translator_utilities.td_globals_defined_by_module(module);
                                    SubLObject v_methods = translator_utilities.td_methods_defined_by_module(module);
                                    if ((NIL != globals) || (NIL != v_methods)) {
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                        html_princ_strong($$$Definitions);
                                        html_newline(UNPROVIDED);
                                        if (NIL != globals) {
                                            html_newline(UNPROVIDED);
                                            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_globals_table(globals, $$$Globals_defined_in_this_module, $$$Attributes, CB_TD_SHOW_GLOBAL_DEFINITION_ATTRIBUTES);
                                        }
                                        if (NIL != v_methods) {
                                            html_newline(UNPROVIDED);
                                            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_methods_table(v_methods, $$$Methods_defined_in_this_module, $$$Attributes, CB_TD_SHOW_METHOD_DEFINITION_ATTRIBUTES);
                                        }
                                    }
                                }
                                {
                                    SubLObject v_methods = translator_utilities.td_methods_called_by_module(module);
                                    SubLObject globals = translator_utilities.td_globals_called_by_module(module);
                                    if ((NIL != v_methods) || (NIL != globals)) {
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                        html_princ_strong($str_alt77$Top_Level_References);
                                        if (NIL != v_methods) {
                                            v_methods = xref_database.xref_sort_called_methods(v_methods);
                                            html_newline(TWO_INTEGER);
                                            html_princ($str_alt78$Methods_called_by_top_level_forms);
                                            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_top_level_methods_table(module, v_methods);
                                        }
                                        if (NIL != globals) {
                                            globals = xref_database.xref_sort_called_globals(globals);
                                            html_newline(TWO_INTEGER);
                                            html_princ($str_alt79$Globals_called_by_top_level_forms);
                                            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_top_level_globals_table(module, globals);
                                        }
                                    }
                                }
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                            }
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_td_module_guts(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == translator_utilities.td_current_translation()) {
            return cb_error($str27$There_is_no_current_SubL_translat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject title = format(NIL, $str71$Module____A, module);
        html_markup($str28$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str29$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ(title);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$23 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($str72$Module___);
                    cb_td_show_module(module);
                    html_indent(FOUR_INTEGER);
                    cb_link($TD_SEARCH, $str58$_Search_Page_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_newline(TWO_INTEGER);
                    html_princ_strong($$$Properties);
                    cb_td_show_module_properties(module);
                    final SubLObject references_modules = translator_utilities.td_modules_referenced_by_module(module);
                    html_newline(UNPROVIDED);
                    cb_td_show_references_module_section(module, references_modules);
                    final SubLObject referenced_by_modules = translator_utilities.td_modules_referencing_module(module);
                    html_newline(UNPROVIDED);
                    cb_td_show_referenced_by_module_section(module, referenced_by_modules);
                    final SubLObject globals = translator_utilities.td_globals_defined_by_module(module);
                    final SubLObject v_methods = translator_utilities.td_methods_defined_by_module(module);
                    if ((NIL != globals) || (NIL != v_methods)) {
                        html_hr(UNPROVIDED, UNPROVIDED);
                        html_princ_strong($$$Definitions);
                        html_newline(UNPROVIDED);
                        if (NIL != globals) {
                            html_newline(UNPROVIDED);
                            cb_td_show_globals_table(globals, $$$Globals_defined_in_this_module, $$$Attributes, CB_TD_SHOW_GLOBAL_DEFINITION_ATTRIBUTES);
                        }
                        if (NIL != v_methods) {
                            html_newline(UNPROVIDED);
                            cb_td_show_methods_table(v_methods, $$$Methods_defined_in_this_module, $$$Attributes, CB_TD_SHOW_METHOD_DEFINITION_ATTRIBUTES);
                        }
                    }
                    SubLObject v_methods2 = translator_utilities.td_methods_called_by_module(module);
                    SubLObject globals2 = translator_utilities.td_globals_called_by_module(module);
                    if ((NIL != v_methods2) || (NIL != globals2)) {
                        html_hr(UNPROVIDED, UNPROVIDED);
                        html_princ_strong($str80$Top_Level_References);
                        if (NIL != v_methods2) {
                            v_methods2 = xref_database.xref_sort_called_methods(v_methods2);
                            html_newline(TWO_INTEGER);
                            html_princ($str81$Methods_called_by_top_level_forms);
                            cb_td_show_top_level_methods_table(module, v_methods2);
                        }
                        if (NIL != globals2) {
                            globals2 = xref_database.xref_sort_called_globals(globals2);
                            html_newline(TWO_INTEGER);
                            html_princ($str82$Globals_called_by_top_level_forms);
                            cb_td_show_top_level_globals_table(module, globals2);
                        }
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$23, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_td_show_top_level_methods_table_alt(SubLObject module, SubLObject v_methods) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    html_princ($$$Methods);
                                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_indent(TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    html_princ($$$File_positions);
                                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = v_methods;
                        SubLObject method = NIL;
                        for (method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method = cdolist_list_var.first()) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_method(method);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject positions = translator_utilities.td_module_positions_calling_method(module, method);
                                                SubLObject cdolist_list_var_30 = reverse(positions);
                                                SubLObject position = NIL;
                                                for (position = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest() , position = cdolist_list_var_30.first()) {
                                                    html_princ(position);
                                                    html_indent(UNPROVIDED);
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_td_show_top_level_methods_table(final SubLObject module, final SubLObject v_methods) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
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
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_princ($$$Methods);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(TWO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_princ($$$File_positions);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            SubLObject cdolist_list_var = v_methods;
            SubLObject method = NIL;
            method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_td_show_method(method);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject positions = translator_utilities.td_module_positions_calling_method(module, method);
                        SubLObject cdolist_list_var_$33 = reverse(positions);
                        SubLObject position = NIL;
                        position = cdolist_list_var_$33.first();
                        while (NIL != cdolist_list_var_$33) {
                            html_princ(position);
                            html_indent(UNPROVIDED);
                            cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                            position = cdolist_list_var_$33.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                method = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_td_show_top_level_globals_table_alt(SubLObject module, SubLObject globals) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    html_princ($$$Globals);
                                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_indent(TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    html_princ($$$File_positions);
                                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = globals;
                        SubLObject global = NIL;
                        for (global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , global = cdolist_list_var.first()) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_global(global);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject positions = translator_utilities.td_module_positions_calling_global(module, global);
                                                SubLObject cdolist_list_var_39 = reverse(positions);
                                                SubLObject position = NIL;
                                                for (position = cdolist_list_var_39.first(); NIL != cdolist_list_var_39; cdolist_list_var_39 = cdolist_list_var_39.rest() , position = cdolist_list_var_39.first()) {
                                                    html_princ(position);
                                                    html_indent(UNPROVIDED);
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_td_show_top_level_globals_table(final SubLObject module, final SubLObject globals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_princ($$$Globals);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(TWO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_princ($$$File_positions);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            SubLObject cdolist_list_var = globals;
            SubLObject global = NIL;
            global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_td_show_global(global);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject positions = translator_utilities.td_module_positions_calling_global(module, global);
                        SubLObject cdolist_list_var_$42 = reverse(positions);
                        SubLObject position = NIL;
                        position = cdolist_list_var_$42.first();
                        while (NIL != cdolist_list_var_$42) {
                            html_princ(position);
                            html_indent(UNPROVIDED);
                            cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                            position = cdolist_list_var_$42.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                global = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_td_show_referenced_by_module_section_alt(SubLObject module, SubLObject referenced_by_modules) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            referenced_by_modules = translator_utilities.td_sort_modules_by_load_order(referenced_by_modules);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    html_princ_strong($str_alt83$Callers__);
                                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_indent(TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject cdolist_list_var = referenced_by_modules;
                                        SubLObject other_module = NIL;
                                        for (other_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_module = cdolist_list_var.first()) {
                                            if (other_module != referenced_by_modules.first()) {
                                                html_princ($str_alt84$__);
                                            }
                                            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module_referenced_by_module(module, other_module);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_td_show_referenced_by_module_section(final SubLObject module, SubLObject referenced_by_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        referenced_by_modules = translator_utilities.td_sort_modules_by_load_order(referenced_by_modules);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_princ_strong($str86$Callers__);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(TWO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject cdolist_list_var = referenced_by_modules;
                    SubLObject other_module = NIL;
                    other_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (!other_module.eql(referenced_by_modules.first())) {
                            html_princ($str87$__);
                        }
                        cb_td_show_module_referenced_by_module(module, other_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        other_module = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_td_show_module_referenced_by_module_alt(SubLObject server_module, SubLObject client_module) {
        if (client_module.equal(server_module)) {
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module(client_module);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
        } else {
            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module(client_module);
        }
        return NIL;
    }

    public static SubLObject cb_td_show_module_referenced_by_module(final SubLObject server_module, final SubLObject client_module) {
        if (client_module.equal(server_module)) {
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_td_show_module(client_module);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
        } else {
            cb_td_show_module(client_module);
        }
        return NIL;
    }

    public static final SubLObject cb_td_show_references_module_section_alt(SubLObject module, SubLObject references_modules) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            references_modules = translator_utilities.td_sort_modules_by_load_order(references_modules);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    html_princ_strong($str_alt85$Calls__);
                                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_indent(TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject cdolist_list_var = references_modules;
                                        SubLObject other_module = NIL;
                                        for (other_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_module = cdolist_list_var.first()) {
                                            if (other_module != references_modules.first()) {
                                                html_princ($str_alt84$__);
                                            }
                                            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module_references_module(module, other_module);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_td_show_references_module_section(final SubLObject module, SubLObject references_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        references_modules = translator_utilities.td_sort_modules_by_load_order(references_modules);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_princ_strong($str88$Calls__);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(TWO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject cdolist_list_var = references_modules;
                    SubLObject other_module = NIL;
                    other_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (!other_module.eql(references_modules.first())) {
                            html_princ($str87$__);
                        }
                        cb_td_show_module_references_module(module, other_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        other_module = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_td_show_module_references_module_alt(SubLObject client_module, SubLObject server_module) {
        if (client_module.equal(server_module)) {
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module(server_module);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
        } else {
            com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module(server_module);
        }
        return NIL;
    }

    public static SubLObject cb_td_show_module_references_module(final SubLObject client_module, final SubLObject server_module) {
        if (client_module.equal(server_module)) {
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_td_show_module(server_module);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
        } else {
            cb_td_show_module(server_module);
        }
        return NIL;
    }

    public static final SubLObject cb_td_global_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject package_string = NIL;
            SubLObject symbol_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt86);
            package_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt86);
            symbol_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_package = find_package(package_string);
                    SubLObject symbol = find_symbol(symbol_string, v_package);
                    return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_global_guts(symbol);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt86);
            }
        }
        return NIL;
    }

    public static SubLObject cb_td_global(final SubLObject args) {
        SubLObject package_string = NIL;
        SubLObject symbol_string = NIL;
        destructuring_bind_must_consp(args, args, $list89);
        package_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list89);
        symbol_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject v_package = find_package(package_string);
            final SubLObject symbol = find_symbol(symbol_string, v_package);
            return cb_td_global_guts(symbol);
        }
        cdestructuring_bind_error(args, $list89);
        return NIL;
    }

    public static final SubLObject cb_link_td_global_alt(SubLObject symbol, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(symbol, SYMBOLP);
            if (NIL == linktext) {
                linktext = com.cyc.cycjava.cycl.cb_translation_browser.prin1_symbol_to_string(symbol);
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt89$cb_td_global_);
                html_url_princ(com.cyc.cycjava.cycl.cb_translation_browser.package_terse_name(symbol_package(symbol)));
                html_princ($str_alt90$_);
                html_url_princ(symbol_name(symbol));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return symbol;
        }
    }

    public static SubLObject cb_link_td_global(final SubLObject symbol, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(symbol) : "! symbolp(symbol) " + ("Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) ") + symbol;
        if (NIL == linktext) {
            linktext = prin1_symbol_to_string(symbol);
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str92$cb_td_global_);
        html_url_princ(package_terse_name(symbol_package(symbol)));
        html_princ($str93$_);
        html_url_princ(symbol_name(symbol));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return symbol;
    }

    public static final SubLObject cb_td_global_guts_alt(SubLObject symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == translator_utilities.td_current_translation()) {
                return cb_error($str_alt29$There_is_no_current_SubL_translat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject title = format(NIL, $str_alt92$Global____S, symbol);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ(title);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ_strong($str_alt93$Global_Variable___);
                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_global(symbol);
                                html_indent(FOUR_INTEGER);
                                html_princ($str_alt94$Access___);
                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_vaccess(symbol);
                                html_indent(FOUR_INTEGER);
                                cb_link($TD_SEARCH, $str_alt55$_Search_Page_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                {
                                    SubLObject module = translator_utilities.td_global_defining_module(symbol);
                                    SubLObject position = translator_utilities.td_global_definition_position(symbol);
                                    html_newline(TWO_INTEGER);
                                    html_princ_strong($$$Definition);
                                    html_newline(UNPROVIDED);
                                    if (NIL != module) {
                                        com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module_section(module, position);
                                    } else {
                                        if (NIL != boundp(symbol)) {
                                            html_princ($$$Internal_variable);
                                        } else {
                                            html_princ($$$Undefined_variable);
                                        }
                                    }
                                    {
                                        SubLObject v_methods = translator_utilities.td_methods_calling_global(symbol);
                                        SubLObject globals = translator_utilities.td_globals_calling_global(symbol);
                                        SubLObject v_modules = translator_utilities.td_modules_calling_global(symbol);
                                        if (((NIL != v_methods) || (NIL != globals)) || (NIL != v_modules)) {
                                            {
                                                SubLObject referenced_by_modules = translator_utilities.td_modules_referencing_global(symbol);
                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_referenced_by_module_section(module, referenced_by_modules);
                                                if (NIL != v_methods) {
                                                    v_methods = xref_database.xref_sort_calling_methods(v_methods);
                                                    html_newline(UNPROVIDED);
                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_methods_table(v_methods, $str_alt98$Methods_that_reference_this_globa, $$$Module, CB_TD_SHOW_METHOD_DEFINING_MODULE);
                                                }
                                                if (NIL != globals) {
                                                    globals = xref_database.xref_sort_calling_globals(globals);
                                                    html_newline(UNPROVIDED);
                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_globals_table(globals, $str_alt100$Globals_whose_initialization_refe, $$$Module, CB_TD_SHOW_GLOBAL_DEFINING_MODULE);
                                                }
                                                if (NIL != v_modules) {
                                                    v_modules = xref_database.xref_sort_calling_modules(globals);
                                                    html_newline(UNPROVIDED);
                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_modules_table(v_modules, $str_alt102$Modules_that_reference_this_globa);
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject v_methods = translator_utilities.td_methods_called_by_global(symbol);
                                        SubLObject globals = translator_utilities.td_globals_called_by_global(symbol);
                                        if ((NIL != v_methods) || (NIL != globals)) {
                                            {
                                                SubLObject references_modules = translator_utilities.td_modules_referenced_by_global(symbol);
                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_references_module_section(module, references_modules);
                                                if (NIL != v_methods) {
                                                    v_methods = xref_database.xref_sort_called_methods(v_methods);
                                                    html_newline(UNPROVIDED);
                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_methods_table(v_methods, $str_alt103$Methods_called_in_the_initializat, $$$Module, CB_TD_SHOW_METHOD_DEFINING_MODULE);
                                                }
                                                if (NIL != globals) {
                                                    globals = xref_database.xref_sort_called_globals(globals);
                                                    html_newline(UNPROVIDED);
                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_globals_table(globals, $str_alt104$Globals_referenced_in_the_initial, $$$Module, CB_TD_SHOW_GLOBAL_DEFINING_MODULE);
                                                }
                                            }
                                        }
                                    }
                                }
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                            }
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_td_global_guts(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == translator_utilities.td_current_translation()) {
            return cb_error($str27$There_is_no_current_SubL_translat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject title = format(NIL, $str95$Global____S, symbol);
        html_markup($str28$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str29$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ(title);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$51 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($str96$Global_Variable___);
                    cb_td_show_global(symbol);
                    html_indent(FOUR_INTEGER);
                    html_princ($str97$Access___);
                    cb_td_show_vaccess(symbol);
                    html_indent(FOUR_INTEGER);
                    cb_link($TD_SEARCH, $str58$_Search_Page_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject module = translator_utilities.td_global_defining_module(symbol);
                    final SubLObject position = translator_utilities.td_global_definition_position(symbol);
                    html_newline(TWO_INTEGER);
                    html_princ_strong($$$Definition);
                    html_newline(UNPROVIDED);
                    if (NIL != module) {
                        cb_td_show_module_section(module, position);
                    } else
                        if (NIL != boundp(symbol)) {
                            html_princ($$$Internal_variable);
                        } else {
                            html_princ($$$Undefined_variable);
                        }

                    SubLObject v_methods = translator_utilities.td_methods_calling_global(symbol);
                    SubLObject globals = translator_utilities.td_globals_calling_global(symbol);
                    SubLObject v_modules = translator_utilities.td_modules_calling_global(symbol);
                    if (((NIL != v_methods) || (NIL != globals)) || (NIL != v_modules)) {
                        final SubLObject referenced_by_modules = translator_utilities.td_modules_referencing_global(symbol);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_td_show_referenced_by_module_section(module, referenced_by_modules);
                        if (NIL != v_methods) {
                            v_methods = xref_database.xref_sort_calling_methods(v_methods);
                            html_newline(UNPROVIDED);
                            cb_td_show_methods_table(v_methods, $str101$Methods_that_reference_this_globa, $$$Module, CB_TD_SHOW_METHOD_DEFINING_MODULE);
                        }
                        if (NIL != globals) {
                            globals = xref_database.xref_sort_calling_globals(globals);
                            html_newline(UNPROVIDED);
                            cb_td_show_globals_table(globals, $str103$Globals_whose_initialization_refe, $$$Module, CB_TD_SHOW_GLOBAL_DEFINING_MODULE);
                        }
                        if (NIL != v_modules) {
                            v_modules = xref_database.xref_sort_calling_modules(globals);
                            html_newline(UNPROVIDED);
                            cb_td_show_modules_table(v_modules, $str105$Modules_that_reference_this_globa);
                        }
                    }
                    v_methods = translator_utilities.td_methods_called_by_global(symbol);
                    globals = translator_utilities.td_globals_called_by_global(symbol);
                    if ((NIL != v_methods) || (NIL != globals)) {
                        final SubLObject references_modules = translator_utilities.td_modules_referenced_by_global(symbol);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_td_show_references_module_section(module, references_modules);
                        if (NIL != v_methods) {
                            v_methods = xref_database.xref_sort_called_methods(v_methods);
                            html_newline(UNPROVIDED);
                            cb_td_show_methods_table(v_methods, $str106$Methods_called_in_the_initializat, $$$Module, CB_TD_SHOW_METHOD_DEFINING_MODULE);
                        }
                        if (NIL != globals) {
                            globals = xref_database.xref_sort_called_globals(globals);
                            html_newline(UNPROVIDED);
                            cb_td_show_globals_table(globals, $str107$Globals_referenced_in_the_initial, $$$Module, CB_TD_SHOW_GLOBAL_DEFINING_MODULE);
                        }
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$51, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_td_method_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject package_string = NIL;
            SubLObject symbol_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt86);
            package_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt86);
            symbol_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_package = find_package(package_string);
                    SubLObject symbol = find_symbol(symbol_string, v_package);
                    return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_method_guts(symbol);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt86);
            }
        }
        return NIL;
    }

    public static SubLObject cb_td_method(final SubLObject args) {
        SubLObject package_string = NIL;
        SubLObject symbol_string = NIL;
        destructuring_bind_must_consp(args, args, $list89);
        package_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list89);
        symbol_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject v_package = find_package(package_string);
            final SubLObject symbol = find_symbol(symbol_string, v_package);
            return cb_td_method_guts(symbol);
        }
        cdestructuring_bind_error(args, $list89);
        return NIL;
    }

    public static final SubLObject cb_link_td_method_alt(SubLObject symbol, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(symbol, SYMBOLP);
            if (NIL == linktext) {
                linktext = com.cyc.cycjava.cycl.cb_translation_browser.prin1_symbol_to_string(symbol);
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt106$cb_td_method_);
                html_url_princ(com.cyc.cycjava.cycl.cb_translation_browser.package_terse_name(symbol_package(symbol)));
                html_princ($str_alt90$_);
                html_url_princ(symbol_name(symbol));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return symbol;
        }
    }

    public static SubLObject cb_link_td_method(final SubLObject symbol, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(symbol) : "! symbolp(symbol) " + ("Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) ") + symbol;
        if (NIL == linktext) {
            linktext = prin1_symbol_to_string(symbol);
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str109$cb_td_method_);
        html_url_princ(package_terse_name(symbol_package(symbol)));
        html_princ($str93$_);
        html_url_princ(symbol_name(symbol));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return symbol;
    }

    public static final SubLObject cb_td_method_guts_alt(SubLObject symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == translator_utilities.td_current_translation()) {
                return cb_error($str_alt29$There_is_no_current_SubL_translat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject title = format(NIL, $str_alt108$Method____S, symbol);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ(title);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ_strong($str_alt109$Method___);
                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_method(symbol);
                                html_indent(FOUR_INTEGER);
                                html_princ($str_alt94$Access___);
                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_faccess(symbol);
                                html_indent(FOUR_INTEGER);
                                cb_link($TD_SEARCH, $str_alt55$_Search_Page_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                html_glyph($NBSP, UNPROVIDED);
                                html_princ($str_alt110$Arglist___);
                                html_markup(html_macros.$html_code_head$.getGlobalValue());
                                cb_form(translator_utilities.td_method_formal_arglist(symbol), UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                {
                                    SubLObject module = translator_utilities.td_method_defining_module(symbol);
                                    SubLObject position = translator_utilities.td_method_definition_position(symbol);
                                    html_newline(TWO_INTEGER);
                                    html_princ_strong($$$Definition);
                                    html_newline(UNPROVIDED);
                                    if (NIL != module) {
                                        com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module_section(module, position);
                                    } else {
                                        if (NIL != fboundp(symbol)) {
                                            html_princ($$$Internal_method);
                                        } else {
                                            html_princ($$$Undefined_method);
                                        }
                                    }
                                    {
                                        SubLObject v_methods = translator_utilities.td_methods_calling_method(symbol);
                                        SubLObject globals = translator_utilities.td_globals_calling_method(symbol);
                                        SubLObject v_modules = translator_utilities.td_modules_calling_method(symbol);
                                        if (((NIL != v_methods) || (NIL != globals)) || (NIL != v_modules)) {
                                            {
                                                SubLObject referenced_by_modules = translator_utilities.td_modules_referencing_method(symbol);
                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_referenced_by_module_section(module, referenced_by_modules);
                                                if (NIL != v_methods) {
                                                    v_methods = xref_database.xref_sort_calling_methods(v_methods);
                                                    html_newline(UNPROVIDED);
                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_methods_table(v_methods, $$$Methods_that_call_this_method, $$$Module, CB_TD_SHOW_METHOD_DEFINING_MODULE);
                                                }
                                                if (NIL != globals) {
                                                    globals = xref_database.xref_sort_calling_globals(globals);
                                                    html_newline(UNPROVIDED);
                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_globals_table(globals, $str_alt114$Globals_whose_initialization_call, $$$Module, CB_TD_SHOW_GLOBAL_DEFINING_MODULE);
                                                }
                                                if (NIL != v_modules) {
                                                    v_modules = xref_database.xref_sort_calling_modules(v_modules);
                                                    html_newline(UNPROVIDED);
                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_modules_table(v_modules, $str_alt115$Modules_that_call_this_method_fro);
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject v_methods = translator_utilities.td_methods_called_by_method(symbol);
                                        SubLObject globals = translator_utilities.td_globals_called_by_method(symbol);
                                        if ((NIL != v_methods) || (NIL != globals)) {
                                            {
                                                SubLObject references_modules = translator_utilities.td_modules_referenced_by_method(symbol);
                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_references_module_section(module, references_modules);
                                                if (NIL != v_methods) {
                                                    v_methods = xref_database.xref_sort_called_methods(v_methods);
                                                    html_newline(UNPROVIDED);
                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_methods_table(v_methods, $$$Methods_called_by_this_method, $$$Module, CB_TD_SHOW_METHOD_DEFINING_MODULE);
                                                }
                                                if (NIL != globals) {
                                                    globals = xref_database.xref_sort_called_globals(globals);
                                                    html_newline(UNPROVIDED);
                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_globals_table(globals, $$$Globals_referenced_by_this_method, $$$Module, CB_TD_SHOW_GLOBAL_DEFINING_MODULE);
                                                }
                                            }
                                        }
                                    }
                                }
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                            }
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_td_method_guts(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == translator_utilities.td_current_translation()) {
            return cb_error($str27$There_is_no_current_SubL_translat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject title = format(NIL, $str111$Method____S, symbol);
        html_markup($str28$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str29$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ(title);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$53 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($str112$Method___);
                    cb_td_show_method(symbol);
                    html_indent(FOUR_INTEGER);
                    html_princ($str97$Access___);
                    cb_td_show_faccess(symbol);
                    html_indent(FOUR_INTEGER);
                    cb_link($TD_SEARCH, $str58$_Search_Page_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_newline(UNPROVIDED);
                    html_glyph($NBSP, UNPROVIDED);
                    html_princ($str113$Arglist___);
                    html_markup(html_macros.$html_code_head$.getGlobalValue());
                    cb_form(translator_utilities.td_method_formal_arglist(symbol), UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_code_tail$.getGlobalValue());
                    final SubLObject module = translator_utilities.td_method_defining_module(symbol);
                    final SubLObject position = translator_utilities.td_method_definition_position(symbol);
                    html_newline(TWO_INTEGER);
                    html_princ_strong($$$Definition);
                    html_newline(UNPROVIDED);
                    if (NIL != module) {
                        cb_td_show_module_section(module, position);
                    } else
                        if (NIL != fboundp(symbol)) {
                            html_princ($$$Internal_method);
                        } else {
                            html_princ($$$Undefined_method);
                        }

                    SubLObject v_methods = translator_utilities.td_methods_calling_method(symbol);
                    SubLObject globals = translator_utilities.td_globals_calling_method(symbol);
                    SubLObject v_modules = translator_utilities.td_modules_calling_method(symbol);
                    if (((NIL != v_methods) || (NIL != globals)) || (NIL != v_modules)) {
                        final SubLObject referenced_by_modules = translator_utilities.td_modules_referencing_method(symbol);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_td_show_referenced_by_module_section(module, referenced_by_modules);
                        if (NIL != v_methods) {
                            v_methods = xref_database.xref_sort_calling_methods(v_methods);
                            html_newline(UNPROVIDED);
                            cb_td_show_methods_table(v_methods, $$$Methods_that_call_this_method, $$$Module, CB_TD_SHOW_METHOD_DEFINING_MODULE);
                        }
                        if (NIL != globals) {
                            globals = xref_database.xref_sort_calling_globals(globals);
                            html_newline(UNPROVIDED);
                            cb_td_show_globals_table(globals, $str117$Globals_whose_initialization_call, $$$Module, CB_TD_SHOW_GLOBAL_DEFINING_MODULE);
                        }
                        if (NIL != v_modules) {
                            v_modules = xref_database.xref_sort_calling_modules(v_modules);
                            html_newline(UNPROVIDED);
                            cb_td_show_modules_table(v_modules, $str118$Modules_that_call_this_method_fro);
                        }
                    }
                    v_methods = translator_utilities.td_methods_called_by_method(symbol);
                    globals = translator_utilities.td_globals_called_by_method(symbol);
                    if ((NIL != v_methods) || (NIL != globals)) {
                        final SubLObject references_modules = translator_utilities.td_modules_referenced_by_method(symbol);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_td_show_references_module_section(module, references_modules);
                        if (NIL != v_methods) {
                            v_methods = xref_database.xref_sort_called_methods(v_methods);
                            html_newline(UNPROVIDED);
                            cb_td_show_methods_table(v_methods, $$$Methods_called_by_this_method, $$$Module, CB_TD_SHOW_METHOD_DEFINING_MODULE);
                        }
                        if (NIL != globals) {
                            globals = xref_database.xref_sort_called_globals(globals);
                            html_newline(UNPROVIDED);
                            cb_td_show_globals_table(globals, $$$Globals_referenced_by_this_method, $$$Module, CB_TD_SHOW_GLOBAL_DEFINING_MODULE);
                        }
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$53, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject clear_package_terse_name_alt() {
        {
            SubLObject cs = $package_terse_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_package_terse_name() {
        final SubLObject cs = $package_terse_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_package_terse_name_alt(SubLObject v_package) {
        return memoization_state.caching_state_remove_function_results_with_args($package_terse_name_caching_state$.getGlobalValue(), list(v_package), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_package_terse_name(final SubLObject v_package) {
        return memoization_state.caching_state_remove_function_results_with_args($package_terse_name_caching_state$.getGlobalValue(), list(v_package), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject package_terse_name_internal_alt(SubLObject v_package) {
        SubLTrampolineFile.checkType(v_package, PACKAGEP);
        {
            SubLObject nicknames = package_nicknames(v_package);
            if (NIL != nicknames) {
                return nicknames.first();
            } else {
                return package_name(v_package);
            }
        }
    }

    public static SubLObject package_terse_name_internal(final SubLObject v_package) {
        assert NIL != packagep(v_package) : "! packagep(v_package) " + ("Types.packagep(v_package) " + "CommonSymbols.NIL != Types.packagep(v_package) ") + v_package;
        final SubLObject nicknames = package_nicknames(v_package);
        if (NIL != nicknames) {
            return nicknames.first();
        }
        return package_name(v_package);
    }

    public static final SubLObject package_terse_name_alt(SubLObject v_package) {
        {
            SubLObject caching_state = $package_terse_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PACKAGE_TERSE_NAME, $package_terse_name_caching_state$, NIL, EQ, ONE_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_package, $kw121$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw121$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.cb_translation_browser.package_terse_name_internal(v_package)));
                    memoization_state.caching_state_put(caching_state, v_package, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject package_terse_name(final SubLObject v_package) {
        SubLObject caching_state = $package_terse_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PACKAGE_TERSE_NAME, $package_terse_name_caching_state$, NIL, EQ, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_package, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(package_terse_name_internal(v_package)));
            memoization_state.caching_state_put(caching_state, v_package, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_prin1_symbol_to_string_alt() {
        {
            SubLObject cs = $prin1_symbol_to_string_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_prin1_symbol_to_string() {
        final SubLObject cs = $prin1_symbol_to_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_prin1_symbol_to_string_alt(SubLObject symbol) {
        return memoization_state.caching_state_remove_function_results_with_args($prin1_symbol_to_string_caching_state$.getGlobalValue(), list(symbol), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_prin1_symbol_to_string(final SubLObject symbol) {
        return memoization_state.caching_state_remove_function_results_with_args($prin1_symbol_to_string_caching_state$.getGlobalValue(), list(symbol), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject prin1_symbol_to_string_internal_alt(SubLObject symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(symbol, SYMBOLP);
            if (symbol == find_symbol(symbol_name(symbol), $package$.getDynamicValue(thread))) {
                return prin1_to_string(symbol);
            }
            {
                SubLObject v_package = symbol_package(symbol);
                if (NIL == v_package) {
                    return format(NIL, $str_alt123$___A, symbol_name(symbol));
                } else {
                    return format(NIL, $str_alt124$_A___A, com.cyc.cycjava.cycl.cb_translation_browser.package_terse_name(v_package), symbol_name(symbol));
                }
            }
        }
    }

    public static SubLObject prin1_symbol_to_string_internal(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(symbol) : "! symbolp(symbol) " + ("Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) ") + symbol;
        if (symbol.eql(find_symbol(symbol_name(symbol), $package$.getDynamicValue(thread)))) {
            return prin1_to_string(symbol);
        }
        final SubLObject v_package = symbol_package(symbol);
        if (NIL == v_package) {
            return format(NIL, $str125$___A, symbol_name(symbol));
        }
        return format(NIL, $str126$_A___A, package_terse_name(v_package), symbol_name(symbol));
    }

    public static final SubLObject prin1_symbol_to_string_alt(SubLObject symbol) {
        {
            SubLObject caching_state = $prin1_symbol_to_string_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PRIN1_SYMBOL_TO_STRING, $sym125$_PRIN1_SYMBOL_TO_STRING_CACHING_STATE_, NIL, EQ, ONE_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, symbol, $kw121$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw121$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.cb_translation_browser.prin1_symbol_to_string_internal(symbol)));
                    memoization_state.caching_state_put(caching_state, symbol, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject prin1_symbol_to_string(final SubLObject symbol) {
        SubLObject caching_state = $prin1_symbol_to_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PRIN1_SYMBOL_TO_STRING, $sym127$_PRIN1_SYMBOL_TO_STRING_CACHING_STATE_, NIL, EQ, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, symbol, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(prin1_symbol_to_string_internal(symbol)));
            memoization_state.caching_state_put(caching_state, symbol, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject cb_td_show_module_section_alt(SubLObject module, SubLObject position) {
        if (position == UNPROVIDED) {
            position = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != module) {
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str_alt69$Module___);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module(module);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        if (NIL != position) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str_alt126$Position___);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ(position);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                        {
                            SubLObject pathname = translator_utilities.td_module_pathname(module);
                            if (NIL != pathname) {
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str_alt127$Pathname___);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module_pathname(pathname);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str_alt128$CVSWeb___);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module_cvsweb(module);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str_alt56$Features___);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module_features(module);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_td_show_module_section(final SubLObject module, SubLObject position) {
        if (position == UNPROVIDED) {
            position = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != module) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
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
                    final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str72$Module___);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
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
                    final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_td_show_module(module);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                if (NIL != position) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
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
                        final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($str128$Position___);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
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
                        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(position);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
                final SubLObject pathname = translator_utilities.td_module_pathname(module);
                if (NIL != pathname) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
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
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($str129$Pathname___);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
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
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_td_show_module_pathname(pathname);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
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
                        final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($str59$Features___);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
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
                        final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_td_show_module_features(module);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject cb_td_show_module_properties_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != module) {
                {
                    SubLObject pathname = translator_utilities.td_module_pathname(module);
                    if (NIL != pathname) {
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str_alt127$Pathname___);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module_pathname(pathname);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str_alt128$CVSWeb___);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module_cvsweb(module);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str_alt56$Features___);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module_features(module);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_td_show_module_properties(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != module) {
            final SubLObject pathname = translator_utilities.td_module_pathname(module);
            if (NIL != pathname) {
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
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
                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($str129$Pathname___);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
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
                        final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_td_show_module_pathname(pathname);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
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
                        final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($str59$Features___);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
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
                        final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_td_show_module_features(module);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject cb_td_show_methods_table_alt(SubLObject v_methods, SubLObject method_title, SubLObject value_title, SubLObject value_function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(method_title);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(value_title);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = v_methods;
                        SubLObject method = NIL;
                        for (method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method = cdolist_list_var.first()) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(ZERO_INTEGER);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(ZERO_INTEGER);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_faccess_hint(method);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_glyph($NBSP, TWO_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_method(method);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            funcall(value_function, method);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_td_show_methods_table(final SubLObject v_methods, final SubLObject method_title, final SubLObject value_title, final SubLObject value_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
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
                final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(method_title);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, TWO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
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
                final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(value_title);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            SubLObject cdolist_list_var = v_methods;
            SubLObject method = NIL;
            method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
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
                    final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_td_show_faccess_hint(method);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_td_show_method(method);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
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
                    final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        funcall(value_function, method);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                method = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_td_show_globals_table_alt(SubLObject globals, SubLObject global_title, SubLObject value_title, SubLObject value_function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(global_title);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(value_title);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = globals;
                        SubLObject global = NIL;
                        for (global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , global = cdolist_list_var.first()) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(ZERO_INTEGER);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(ZERO_INTEGER);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_vaccess_hint(global);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_glyph($NBSP, TWO_INTEGER);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_global(global);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            funcall(value_function, global);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_td_show_globals_table(final SubLObject globals, final SubLObject global_title, final SubLObject value_title, final SubLObject value_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
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
                final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(global_title);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, TWO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
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
                final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(value_title);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            SubLObject cdolist_list_var = globals;
            SubLObject global = NIL;
            global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
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
                    final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_td_show_vaccess_hint(global);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_td_show_global(global);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
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
                    final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        funcall(value_function, global);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                global = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_td_show_modules_table_alt(SubLObject v_modules, SubLObject title) {
        html_princ(title);
        {
            SubLObject cdolist_list_var = v_modules;
            SubLObject module = NIL;
            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                html_newline(UNPROVIDED);
                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module(module);
            }
        }
        return NIL;
    }

    public static SubLObject cb_td_show_modules_table(final SubLObject v_modules, final SubLObject title) {
        html_princ(title);
        SubLObject cdolist_list_var = v_modules;
        SubLObject module = NIL;
        module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            html_newline(UNPROVIDED);
            cb_td_show_module(module);
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject cb_td_show_method_defining_module_alt(SubLObject method) {
        {
            SubLObject module = translator_utilities.td_method_defining_module(method);
            if (NIL != module) {
                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module(module);
            }
        }
        return NIL;
    }

    public static SubLObject cb_td_show_method_defining_module(final SubLObject method) {
        final SubLObject module = translator_utilities.td_method_defining_module(method);
        if (NIL != module) {
            cb_td_show_module(module);
        }
        return NIL;
    }

    public static final SubLObject cb_td_show_global_defining_module_alt(SubLObject global) {
        {
            SubLObject module = translator_utilities.td_global_defining_module(global);
            if (NIL != module) {
                com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_module(module);
            }
        }
        return NIL;
    }

    public static SubLObject cb_td_show_global_defining_module(final SubLObject global) {
        final SubLObject module = translator_utilities.td_global_defining_module(global);
        if (NIL != module) {
            cb_td_show_module(module);
        }
        return NIL;
    }

    public static final SubLObject cb_td_show_method_definition_attributes_alt(SubLObject method) {
        {
            SubLObject attributes = NIL;
            if (NIL != translator_utilities.td_method_macro_p(method)) {
                attributes = cons($$$macro, attributes);
            }
            if (NIL != translator_utilities.td_method_unused_p(method)) {
                attributes = cons($$$no_callers, attributes);
            } else {
                if (NIL != translator_utilities.td_method_potentially_private_p(method)) {
                    attributes = cons($$$no_external_callers, attributes);
                }
            }
            attributes = nreverse(attributes);
            return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_attribute_list(attributes);
        }
    }

    public static SubLObject cb_td_show_method_definition_attributes(final SubLObject method) {
        SubLObject attributes = NIL;
        if (NIL != translator_utilities.td_method_macro_p(method)) {
            attributes = cons($$$macro, attributes);
        }
        if (NIL != translator_utilities.td_method_unused_p(method)) {
            attributes = cons($$$no_callers, attributes);
        } else
            if (NIL != translator_utilities.td_method_potentially_private_p(method)) {
                attributes = cons($$$no_external_callers, attributes);
            }

        attributes = nreverse(attributes);
        return cb_td_show_attribute_list(attributes);
    }

    public static final SubLObject cb_td_show_global_definition_attributes_alt(SubLObject global) {
        {
            SubLObject attributes = NIL;
            SubLObject pcase_var = translator_utilities.td_global_binding_type(global);
            if (pcase_var.eql($CONSTANT)) {
                attributes = cons($$$constant, attributes);
            } else {
                if (pcase_var.eql($LEXICAL)) {
                    attributes = cons($$$lexical, attributes);
                } else {
                    if (pcase_var.eql($SPECIAL)) {
                        attributes = cons($$$special, attributes);
                    }
                }
            }
            if (NIL != translator_utilities.td_global_unused_p(global)) {
                attributes = cons($$$no_callers, attributes);
            } else {
                if (NIL != translator_utilities.td_global_potentially_private_p(global)) {
                    attributes = cons($$$no_external_callers, attributes);
                }
            }
            attributes = nreverse(attributes);
            return com.cyc.cycjava.cycl.cb_translation_browser.cb_td_show_attribute_list(attributes);
        }
    }

    public static SubLObject cb_td_show_global_definition_attributes(final SubLObject global) {
        SubLObject attributes = NIL;
        final SubLObject pcase_var = translator_utilities.td_global_binding_type(global);
        if (pcase_var.eql($CONSTANT)) {
            attributes = cons($$$constant, attributes);
        } else
            if (pcase_var.eql($LEXICAL)) {
                attributes = cons($$$lexical, attributes);
            } else
                if (pcase_var.eql($SPECIAL)) {
                    attributes = cons($$$special, attributes);
                }


        if (NIL != translator_utilities.td_global_unused_p(global)) {
            attributes = cons($$$no_callers, attributes);
        } else
            if (NIL != translator_utilities.td_global_potentially_private_p(global)) {
                attributes = cons($$$no_external_callers, attributes);
            }

        attributes = nreverse(attributes);
        return cb_td_show_attribute_list(attributes);
    }

    public static final SubLObject cb_td_show_attribute_list_alt(SubLObject attributes) {
        if (NIL != attributes) {
            {
                SubLObject cdolist_list_var = attributes;
                SubLObject attribute = NIL;
                for (attribute = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , attribute = cdolist_list_var.first()) {
                    if (attribute != attributes.first()) {
                        html_princ($str_alt84$__);
                    }
                    html_princ(attribute);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_td_show_attribute_list(final SubLObject attributes) {
        if (NIL != attributes) {
            SubLObject cdolist_list_var = attributes;
            SubLObject attribute = NIL;
            attribute = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!attribute.eql(attributes.first())) {
                    html_princ($str87$__);
                }
                html_princ(attribute);
                cdolist_list_var = cdolist_list_var.rest();
                attribute = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject declare_cb_translation_browser_file_alt() {
        declareMacro("cb_td_document", "CB-TD-DOCUMENT");
        declareFunction("cb_td_show_method", "CB-TD-SHOW-METHOD", 1, 0, false);
        declareFunction("cb_td_show_global", "CB-TD-SHOW-GLOBAL", 1, 0, false);
        declareFunction("cb_td_show_module", "CB-TD-SHOW-MODULE", 1, 0, false);
        declareFunction("cb_td_show_faccess", "CB-TD-SHOW-FACCESS", 1, 0, false);
        declareFunction("cb_td_show_vaccess", "CB-TD-SHOW-VACCESS", 1, 0, false);
        declareFunction("cb_td_show_faccess_hint", "CB-TD-SHOW-FACCESS-HINT", 1, 0, false);
        declareFunction("cb_td_show_vaccess_hint", "CB-TD-SHOW-VACCESS-HINT", 1, 0, false);
        declareFunction("cb_td_show_access_hint", "CB-TD-SHOW-ACCESS-HINT", 1, 0, false);
        declareFunction("cb_td_access_color", "CB-TD-ACCESS-COLOR", 1, 0, false);
        declareFunction("cb_td_show_module_pathname", "CB-TD-SHOW-MODULE-PATHNAME", 1, 0, false);
        declareFunction("cb_td_show_module_cvsweb", "CB-TD-SHOW-MODULE-CVSWEB", 1, 0, false);
        declareFunction("cb_td_tool", "CB-TD-TOOL", 0, 1, false);
        declareFunction("cb_link_td_tool", "CB-LINK-TD-TOOL", 1, 0, false);
        declareFunction("cb_td_search", "CB-TD-SEARCH", 0, 1, false);
        declareFunction("cb_link_td_search", "CB-LINK-TD-SEARCH", 0, 1, false);
        declareFunction("cb_td_search_guts", "CB-TD-SEARCH-GUTS", 0, 0, false);
        declareFunction("cb_td_handle_search", "CB-TD-HANDLE-SEARCH", 1, 0, false);
        declareFunction("cb_td_summary", "CB-TD-SUMMARY", 0, 1, false);
        declareFunction("cb_link_td_summary", "CB-LINK-TD-SUMMARY", 0, 1, false);
        declareFunction("cb_td_summary_guts", "CB-TD-SUMMARY-GUTS", 0, 0, false);
        declareFunction("cb_td_show_translation_features", "CB-TD-SHOW-TRANSLATION-FEATURES", 0, 0, false);
        declareFunction("cb_td_show_module_features", "CB-TD-SHOW-MODULE-FEATURES", 1, 0, false);
        declareFunction("cb_td_show_feature_expression", "CB-TD-SHOW-FEATURE-EXPRESSION", 1, 0, false);
        declareFunction("cb_td_module", "CB-TD-MODULE", 1, 0, false);
        declareFunction("cb_link_td_module", "CB-LINK-TD-MODULE", 1, 1, false);
        declareFunction("cb_td_module_guts", "CB-TD-MODULE-GUTS", 1, 0, false);
        declareFunction("cb_td_show_top_level_methods_table", "CB-TD-SHOW-TOP-LEVEL-METHODS-TABLE", 2, 0, false);
        declareFunction("cb_td_show_top_level_globals_table", "CB-TD-SHOW-TOP-LEVEL-GLOBALS-TABLE", 2, 0, false);
        declareFunction("cb_td_show_referenced_by_module_section", "CB-TD-SHOW-REFERENCED-BY-MODULE-SECTION", 2, 0, false);
        declareFunction("cb_td_show_module_referenced_by_module", "CB-TD-SHOW-MODULE-REFERENCED-BY-MODULE", 2, 0, false);
        declareFunction("cb_td_show_references_module_section", "CB-TD-SHOW-REFERENCES-MODULE-SECTION", 2, 0, false);
        declareFunction("cb_td_show_module_references_module", "CB-TD-SHOW-MODULE-REFERENCES-MODULE", 2, 0, false);
        declareFunction("cb_td_global", "CB-TD-GLOBAL", 1, 0, false);
        declareFunction("cb_link_td_global", "CB-LINK-TD-GLOBAL", 1, 1, false);
        declareFunction("cb_td_global_guts", "CB-TD-GLOBAL-GUTS", 1, 0, false);
        declareFunction("cb_td_method", "CB-TD-METHOD", 1, 0, false);
        declareFunction("cb_link_td_method", "CB-LINK-TD-METHOD", 1, 1, false);
        declareFunction("cb_td_method_guts", "CB-TD-METHOD-GUTS", 1, 0, false);
        declareFunction("clear_package_terse_name", "CLEAR-PACKAGE-TERSE-NAME", 0, 0, false);
        declareFunction("remove_package_terse_name", "REMOVE-PACKAGE-TERSE-NAME", 1, 0, false);
        declareFunction("package_terse_name_internal", "PACKAGE-TERSE-NAME-INTERNAL", 1, 0, false);
        declareFunction("package_terse_name", "PACKAGE-TERSE-NAME", 1, 0, false);
        declareFunction("clear_prin1_symbol_to_string", "CLEAR-PRIN1-SYMBOL-TO-STRING", 0, 0, false);
        declareFunction("remove_prin1_symbol_to_string", "REMOVE-PRIN1-SYMBOL-TO-STRING", 1, 0, false);
        declareFunction("prin1_symbol_to_string_internal", "PRIN1-SYMBOL-TO-STRING-INTERNAL", 1, 0, false);
        declareFunction("prin1_symbol_to_string", "PRIN1-SYMBOL-TO-STRING", 1, 0, false);
        declareFunction("cb_td_show_module_section", "CB-TD-SHOW-MODULE-SECTION", 1, 1, false);
        declareFunction("cb_td_show_module_properties", "CB-TD-SHOW-MODULE-PROPERTIES", 1, 0, false);
        declareFunction("cb_td_show_methods_table", "CB-TD-SHOW-METHODS-TABLE", 4, 0, false);
        declareFunction("cb_td_show_globals_table", "CB-TD-SHOW-GLOBALS-TABLE", 4, 0, false);
        declareFunction("cb_td_show_modules_table", "CB-TD-SHOW-MODULES-TABLE", 2, 0, false);
        declareFunction("cb_td_show_method_defining_module", "CB-TD-SHOW-METHOD-DEFINING-MODULE", 1, 0, false);
        declareFunction("cb_td_show_global_defining_module", "CB-TD-SHOW-GLOBAL-DEFINING-MODULE", 1, 0, false);
        declareFunction("cb_td_show_method_definition_attributes", "CB-TD-SHOW-METHOD-DEFINITION-ATTRIBUTES", 1, 0, false);
        declareFunction("cb_td_show_global_definition_attributes", "CB-TD-SHOW-GLOBAL-DEFINITION-ATTRIBUTES", 1, 0, false);
        declareFunction("cb_td_show_attribute_list", "CB-TD-SHOW-ATTRIBUTE-LIST", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_cb_translation_browser_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("cb_td_document", "CB-TD-DOCUMENT");
            declareFunction("cb_td_show_method", "CB-TD-SHOW-METHOD", 1, 0, false);
            declareFunction("cb_td_show_global", "CB-TD-SHOW-GLOBAL", 1, 0, false);
            declareFunction("cb_td_show_module", "CB-TD-SHOW-MODULE", 1, 0, false);
            declareFunction("cb_td_show_faccess", "CB-TD-SHOW-FACCESS", 1, 0, false);
            declareFunction("cb_td_show_vaccess", "CB-TD-SHOW-VACCESS", 1, 0, false);
            declareFunction("cb_td_show_faccess_hint", "CB-TD-SHOW-FACCESS-HINT", 1, 0, false);
            declareFunction("cb_td_show_vaccess_hint", "CB-TD-SHOW-VACCESS-HINT", 1, 0, false);
            declareFunction("cb_td_show_access_hint", "CB-TD-SHOW-ACCESS-HINT", 1, 0, false);
            declareFunction("cb_td_access_color", "CB-TD-ACCESS-COLOR", 1, 0, false);
            declareFunction("cb_td_show_module_pathname", "CB-TD-SHOW-MODULE-PATHNAME", 1, 0, false);
            declareFunction("cb_td_tool", "CB-TD-TOOL", 0, 1, false);
            declareFunction("cb_link_td_tool", "CB-LINK-TD-TOOL", 1, 0, false);
            declareFunction("cb_td_search", "CB-TD-SEARCH", 0, 1, false);
            declareFunction("cb_link_td_search", "CB-LINK-TD-SEARCH", 0, 1, false);
            declareFunction("cb_td_search_guts", "CB-TD-SEARCH-GUTS", 0, 0, false);
            declareFunction("cb_td_handle_search", "CB-TD-HANDLE-SEARCH", 1, 0, false);
            declareFunction("cb_td_summary", "CB-TD-SUMMARY", 0, 1, false);
            declareFunction("cb_link_td_summary", "CB-LINK-TD-SUMMARY", 0, 1, false);
            declareFunction("cb_td_summary_guts", "CB-TD-SUMMARY-GUTS", 0, 0, false);
            declareFunction("cb_td_show_translation_features", "CB-TD-SHOW-TRANSLATION-FEATURES", 0, 0, false);
            declareFunction("cb_td_show_module_features", "CB-TD-SHOW-MODULE-FEATURES", 1, 0, false);
            declareFunction("cb_td_show_feature_expression", "CB-TD-SHOW-FEATURE-EXPRESSION", 1, 0, false);
            declareFunction("cb_td_module", "CB-TD-MODULE", 1, 0, false);
            declareFunction("cb_link_td_module", "CB-LINK-TD-MODULE", 1, 1, false);
            declareFunction("cb_td_module_guts", "CB-TD-MODULE-GUTS", 1, 0, false);
            declareFunction("cb_td_show_top_level_methods_table", "CB-TD-SHOW-TOP-LEVEL-METHODS-TABLE", 2, 0, false);
            declareFunction("cb_td_show_top_level_globals_table", "CB-TD-SHOW-TOP-LEVEL-GLOBALS-TABLE", 2, 0, false);
            declareFunction("cb_td_show_referenced_by_module_section", "CB-TD-SHOW-REFERENCED-BY-MODULE-SECTION", 2, 0, false);
            declareFunction("cb_td_show_module_referenced_by_module", "CB-TD-SHOW-MODULE-REFERENCED-BY-MODULE", 2, 0, false);
            declareFunction("cb_td_show_references_module_section", "CB-TD-SHOW-REFERENCES-MODULE-SECTION", 2, 0, false);
            declareFunction("cb_td_show_module_references_module", "CB-TD-SHOW-MODULE-REFERENCES-MODULE", 2, 0, false);
            declareFunction("cb_td_global", "CB-TD-GLOBAL", 1, 0, false);
            declareFunction("cb_link_td_global", "CB-LINK-TD-GLOBAL", 1, 1, false);
            declareFunction("cb_td_global_guts", "CB-TD-GLOBAL-GUTS", 1, 0, false);
            declareFunction("cb_td_method", "CB-TD-METHOD", 1, 0, false);
            declareFunction("cb_link_td_method", "CB-LINK-TD-METHOD", 1, 1, false);
            declareFunction("cb_td_method_guts", "CB-TD-METHOD-GUTS", 1, 0, false);
            declareFunction("clear_package_terse_name", "CLEAR-PACKAGE-TERSE-NAME", 0, 0, false);
            declareFunction("remove_package_terse_name", "REMOVE-PACKAGE-TERSE-NAME", 1, 0, false);
            declareFunction("package_terse_name_internal", "PACKAGE-TERSE-NAME-INTERNAL", 1, 0, false);
            declareFunction("package_terse_name", "PACKAGE-TERSE-NAME", 1, 0, false);
            declareFunction("clear_prin1_symbol_to_string", "CLEAR-PRIN1-SYMBOL-TO-STRING", 0, 0, false);
            declareFunction("remove_prin1_symbol_to_string", "REMOVE-PRIN1-SYMBOL-TO-STRING", 1, 0, false);
            declareFunction("prin1_symbol_to_string_internal", "PRIN1-SYMBOL-TO-STRING-INTERNAL", 1, 0, false);
            declareFunction("prin1_symbol_to_string", "PRIN1-SYMBOL-TO-STRING", 1, 0, false);
            declareFunction("cb_td_show_module_section", "CB-TD-SHOW-MODULE-SECTION", 1, 1, false);
            declareFunction("cb_td_show_module_properties", "CB-TD-SHOW-MODULE-PROPERTIES", 1, 0, false);
            declareFunction("cb_td_show_methods_table", "CB-TD-SHOW-METHODS-TABLE", 4, 0, false);
            declareFunction("cb_td_show_globals_table", "CB-TD-SHOW-GLOBALS-TABLE", 4, 0, false);
            declareFunction("cb_td_show_modules_table", "CB-TD-SHOW-MODULES-TABLE", 2, 0, false);
            declareFunction("cb_td_show_method_defining_module", "CB-TD-SHOW-METHOD-DEFINING-MODULE", 1, 0, false);
            declareFunction("cb_td_show_global_defining_module", "CB-TD-SHOW-GLOBAL-DEFINING-MODULE", 1, 0, false);
            declareFunction("cb_td_show_method_definition_attributes", "CB-TD-SHOW-METHOD-DEFINITION-ATTRIBUTES", 1, 0, false);
            declareFunction("cb_td_show_global_definition_attributes", "CB-TD-SHOW-GLOBAL-DEFINITION-ATTRIBUTES", 1, 0, false);
            declareFunction("cb_td_show_attribute_list", "CB-TD-SHOW-ATTRIBUTE-LIST", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("cb_td_show_module_cvsweb", "CB-TD-SHOW-MODULE-CVSWEB", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_cb_translation_browser_file_Previous() {
        declareMacro("cb_td_document", "CB-TD-DOCUMENT");
        declareFunction("cb_td_show_method", "CB-TD-SHOW-METHOD", 1, 0, false);
        declareFunction("cb_td_show_global", "CB-TD-SHOW-GLOBAL", 1, 0, false);
        declareFunction("cb_td_show_module", "CB-TD-SHOW-MODULE", 1, 0, false);
        declareFunction("cb_td_show_faccess", "CB-TD-SHOW-FACCESS", 1, 0, false);
        declareFunction("cb_td_show_vaccess", "CB-TD-SHOW-VACCESS", 1, 0, false);
        declareFunction("cb_td_show_faccess_hint", "CB-TD-SHOW-FACCESS-HINT", 1, 0, false);
        declareFunction("cb_td_show_vaccess_hint", "CB-TD-SHOW-VACCESS-HINT", 1, 0, false);
        declareFunction("cb_td_show_access_hint", "CB-TD-SHOW-ACCESS-HINT", 1, 0, false);
        declareFunction("cb_td_access_color", "CB-TD-ACCESS-COLOR", 1, 0, false);
        declareFunction("cb_td_show_module_pathname", "CB-TD-SHOW-MODULE-PATHNAME", 1, 0, false);
        declareFunction("cb_td_tool", "CB-TD-TOOL", 0, 1, false);
        declareFunction("cb_link_td_tool", "CB-LINK-TD-TOOL", 1, 0, false);
        declareFunction("cb_td_search", "CB-TD-SEARCH", 0, 1, false);
        declareFunction("cb_link_td_search", "CB-LINK-TD-SEARCH", 0, 1, false);
        declareFunction("cb_td_search_guts", "CB-TD-SEARCH-GUTS", 0, 0, false);
        declareFunction("cb_td_handle_search", "CB-TD-HANDLE-SEARCH", 1, 0, false);
        declareFunction("cb_td_summary", "CB-TD-SUMMARY", 0, 1, false);
        declareFunction("cb_link_td_summary", "CB-LINK-TD-SUMMARY", 0, 1, false);
        declareFunction("cb_td_summary_guts", "CB-TD-SUMMARY-GUTS", 0, 0, false);
        declareFunction("cb_td_show_translation_features", "CB-TD-SHOW-TRANSLATION-FEATURES", 0, 0, false);
        declareFunction("cb_td_show_module_features", "CB-TD-SHOW-MODULE-FEATURES", 1, 0, false);
        declareFunction("cb_td_show_feature_expression", "CB-TD-SHOW-FEATURE-EXPRESSION", 1, 0, false);
        declareFunction("cb_td_module", "CB-TD-MODULE", 1, 0, false);
        declareFunction("cb_link_td_module", "CB-LINK-TD-MODULE", 1, 1, false);
        declareFunction("cb_td_module_guts", "CB-TD-MODULE-GUTS", 1, 0, false);
        declareFunction("cb_td_show_top_level_methods_table", "CB-TD-SHOW-TOP-LEVEL-METHODS-TABLE", 2, 0, false);
        declareFunction("cb_td_show_top_level_globals_table", "CB-TD-SHOW-TOP-LEVEL-GLOBALS-TABLE", 2, 0, false);
        declareFunction("cb_td_show_referenced_by_module_section", "CB-TD-SHOW-REFERENCED-BY-MODULE-SECTION", 2, 0, false);
        declareFunction("cb_td_show_module_referenced_by_module", "CB-TD-SHOW-MODULE-REFERENCED-BY-MODULE", 2, 0, false);
        declareFunction("cb_td_show_references_module_section", "CB-TD-SHOW-REFERENCES-MODULE-SECTION", 2, 0, false);
        declareFunction("cb_td_show_module_references_module", "CB-TD-SHOW-MODULE-REFERENCES-MODULE", 2, 0, false);
        declareFunction("cb_td_global", "CB-TD-GLOBAL", 1, 0, false);
        declareFunction("cb_link_td_global", "CB-LINK-TD-GLOBAL", 1, 1, false);
        declareFunction("cb_td_global_guts", "CB-TD-GLOBAL-GUTS", 1, 0, false);
        declareFunction("cb_td_method", "CB-TD-METHOD", 1, 0, false);
        declareFunction("cb_link_td_method", "CB-LINK-TD-METHOD", 1, 1, false);
        declareFunction("cb_td_method_guts", "CB-TD-METHOD-GUTS", 1, 0, false);
        declareFunction("clear_package_terse_name", "CLEAR-PACKAGE-TERSE-NAME", 0, 0, false);
        declareFunction("remove_package_terse_name", "REMOVE-PACKAGE-TERSE-NAME", 1, 0, false);
        declareFunction("package_terse_name_internal", "PACKAGE-TERSE-NAME-INTERNAL", 1, 0, false);
        declareFunction("package_terse_name", "PACKAGE-TERSE-NAME", 1, 0, false);
        declareFunction("clear_prin1_symbol_to_string", "CLEAR-PRIN1-SYMBOL-TO-STRING", 0, 0, false);
        declareFunction("remove_prin1_symbol_to_string", "REMOVE-PRIN1-SYMBOL-TO-STRING", 1, 0, false);
        declareFunction("prin1_symbol_to_string_internal", "PRIN1-SYMBOL-TO-STRING-INTERNAL", 1, 0, false);
        declareFunction("prin1_symbol_to_string", "PRIN1-SYMBOL-TO-STRING", 1, 0, false);
        declareFunction("cb_td_show_module_section", "CB-TD-SHOW-MODULE-SECTION", 1, 1, false);
        declareFunction("cb_td_show_module_properties", "CB-TD-SHOW-MODULE-PROPERTIES", 1, 0, false);
        declareFunction("cb_td_show_methods_table", "CB-TD-SHOW-METHODS-TABLE", 4, 0, false);
        declareFunction("cb_td_show_globals_table", "CB-TD-SHOW-GLOBALS-TABLE", 4, 0, false);
        declareFunction("cb_td_show_modules_table", "CB-TD-SHOW-MODULES-TABLE", 2, 0, false);
        declareFunction("cb_td_show_method_defining_module", "CB-TD-SHOW-METHOD-DEFINING-MODULE", 1, 0, false);
        declareFunction("cb_td_show_global_defining_module", "CB-TD-SHOW-GLOBAL-DEFINING-MODULE", 1, 0, false);
        declareFunction("cb_td_show_method_definition_attributes", "CB-TD-SHOW-METHOD-DEFINITION-ATTRIBUTES", 1, 0, false);
        declareFunction("cb_td_show_global_definition_attributes", "CB-TD-SHOW-GLOBAL-DEFINITION-ATTRIBUTES", 1, 0, false);
        declareFunction("cb_td_show_attribute_list", "CB-TD-SHOW-ATTRIBUTE-LIST", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_translation_browser_file() {
        deflexical("*CB-TD-ACCESS-COLOR-MAP*", $list14);
        deflexical("*PACKAGE-TERSE-NAME-CACHING-STATE*", NIL);
        deflexical("*PRIN1-SYMBOL-TO-STRING-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_translation_browser_file_alt() {
        html_macros.note_html_handler_function(CB_TD_TOOL);
        setup_cb_link_method($TD_TOOL, CB_LINK_TD_TOOL, ONE_INTEGER);
        declare_cb_tool($TD_TOOL, $$$SL2C_Browser, $$$SL2C, $str_alt22$Browse_the_current_translation_da);
        html_macros.note_html_handler_function(CB_TD_SEARCH);
        setup_cb_link_method($TD_SEARCH, CB_LINK_TD_SEARCH, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_TD_HANDLE_SEARCH);
        html_macros.note_html_handler_function(CB_TD_SUMMARY);
        setup_cb_link_method($TD_SUMMARY, CB_LINK_TD_SUMMARY, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_TD_MODULE);
        setup_cb_link_method($TD_MODULE, CB_LINK_TD_MODULE, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_TD_GLOBAL);
        setup_cb_link_method($TD_GLOBAL, CB_LINK_TD_GLOBAL, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_TD_METHOD);
        setup_cb_link_method($TD_METHOD, CB_LINK_TD_METHOD, TWO_INTEGER);
        memoization_state.note_globally_cached_function(PACKAGE_TERSE_NAME);
        memoization_state.note_globally_cached_function(PRIN1_SYMBOL_TO_STRING);
        return NIL;
    }

    public static SubLObject setup_cb_translation_browser_file() {
        if (SubLFiles.USE_V1) {
            html_macros.note_cgi_handler_function(CB_TD_TOOL, $HTML_HANDLER);
            setup_cb_link_method($TD_TOOL, CB_LINK_TD_TOOL, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_TD_SEARCH, $HTML_HANDLER);
            setup_cb_link_method($TD_SEARCH, CB_LINK_TD_SEARCH, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_TD_HANDLE_SEARCH, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_TD_SUMMARY, $HTML_HANDLER);
            setup_cb_link_method($TD_SUMMARY, CB_LINK_TD_SUMMARY, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_TD_MODULE, $HTML_HANDLER);
            setup_cb_link_method($TD_MODULE, CB_LINK_TD_MODULE, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_TD_GLOBAL, $HTML_HANDLER);
            setup_cb_link_method($TD_GLOBAL, CB_LINK_TD_GLOBAL, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_TD_METHOD, $HTML_HANDLER);
            setup_cb_link_method($TD_METHOD, CB_LINK_TD_METHOD, TWO_INTEGER);
            memoization_state.note_globally_cached_function(PACKAGE_TERSE_NAME);
            memoization_state.note_globally_cached_function(PRIN1_SYMBOL_TO_STRING);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_TD_TOOL);
            declare_cb_tool($TD_TOOL, $$$SL2C_Browser, $$$SL2C, $str_alt22$Browse_the_current_translation_da);
            html_macros.note_html_handler_function(CB_TD_SEARCH);
            html_macros.note_html_handler_function(CB_TD_HANDLE_SEARCH);
            html_macros.note_html_handler_function(CB_TD_SUMMARY);
            html_macros.note_html_handler_function(CB_TD_MODULE);
            html_macros.note_html_handler_function(CB_TD_GLOBAL);
            html_macros.note_html_handler_function(CB_TD_METHOD);
        }
        return NIL;
    }

    public static SubLObject setup_cb_translation_browser_file_Previous() {
        html_macros.note_cgi_handler_function(CB_TD_TOOL, $HTML_HANDLER);
        setup_cb_link_method($TD_TOOL, CB_LINK_TD_TOOL, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_TD_SEARCH, $HTML_HANDLER);
        setup_cb_link_method($TD_SEARCH, CB_LINK_TD_SEARCH, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_TD_HANDLE_SEARCH, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TD_SUMMARY, $HTML_HANDLER);
        setup_cb_link_method($TD_SUMMARY, CB_LINK_TD_SUMMARY, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_TD_MODULE, $HTML_HANDLER);
        setup_cb_link_method($TD_MODULE, CB_LINK_TD_MODULE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_TD_GLOBAL, $HTML_HANDLER);
        setup_cb_link_method($TD_GLOBAL, CB_LINK_TD_GLOBAL, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_TD_METHOD, $HTML_HANDLER);
        setup_cb_link_method($TD_METHOD, CB_LINK_TD_METHOD, TWO_INTEGER);
        memoization_state.note_globally_cached_function(PACKAGE_TERSE_NAME);
        memoization_state.note_globally_cached_function(PRIN1_SYMBOL_TO_STRING);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_translation_browser_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_translation_browser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_translation_browser_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("&KEY"), makeSymbol("TITLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt1 = list(makeKeyword("TITLE"));

    static private final SubLList $list_alt9 = list(makeKeyword("SHOW-COPYRIGHT"), T);

    static private final SubLList $list_alt14 = list(list(makeSymbol("PRIVATE"), makeString("FF7F7F")), list(makeSymbol("PROTECTED"), makeString("FFFF7F")), list(makeSymbol("PUBLIC"), makeString("7FFF7F")));

    static private final SubLString $str_alt17$cb_td_tool = makeString("cb-td-tool");

    static private final SubLString $$$SL2C_Browser = makeString("SL2C Browser");

    static private final SubLString $$$SL2C = makeString("SL2C");

    static private final SubLString $str_alt22$Browse_the_current_translation_da = makeString("Browse the current translation database");

    static private final SubLString $str_alt24$_Translation_Database_Browser_ = makeString("[Translation Database Browser]");

    static private final SubLString $str_alt26$cb_td_search = makeString("cb-td-search");

    static private final SubLString $str_alt29$There_is_no_current_SubL_translat = makeString("There is no current SubL translation state.");

    static private final SubLString $str_alt31$cb_td_handle_search = makeString("cb-td-handle-search");

    static private final SubLString $str_alt33$_Current_Translation_Summary_ = makeString("[Current Translation Summary]");

    static private final SubLString $str_alt36$Find_a_ = makeString("Find a ");

    static private final SubLString $str_alt44$_called = makeString(" called");

    static private final SubLString $str_alt51$_Summary_ = makeString("[Summary]");

    static private final SubLString $str_alt52$cb_td_summary = makeString("cb-td-summary");

    static private final SubLString $str_alt55$_Search_Page_ = makeString("[Search Page]");

    static private final SubLString $str_alt56$Features___ = makeString("Features : ");

    static private final SubLList $list_alt60 = cons(makeSymbol("OPERATOR"), makeSymbol("SUB-EXPRESSIONS"));

    static private final SubLString $str_alt61$_ = makeString("(");

    static private final SubLString $str_alt62$_ = makeString(")");

    static private final SubLList $list_alt63 = list(makeSymbol("MODULE"));

    static private final SubLString $str_alt66$cb_td_module_ = makeString("cb-td-module|");

    static private final SubLString $str_alt68$Module____A = makeString("Module : ~A");

    static private final SubLString $str_alt69$Module___ = makeString("Module : ");

    static private final SubLString $str_alt77$Top_Level_References = makeString("Top-Level References");

    static private final SubLString $str_alt78$Methods_called_by_top_level_forms = makeString("Methods called by top-level forms in this module");

    static private final SubLString $str_alt79$Globals_called_by_top_level_forms = makeString("Globals called by top-level forms in this module");

    static private final SubLString $str_alt83$Callers__ = makeString("Callers :");

    static private final SubLString $str_alt84$__ = makeString(", ");

    static private final SubLString $str_alt85$Calls__ = makeString("Calls :");

    static private final SubLList $list_alt86 = list(makeSymbol("PACKAGE-STRING"), makeSymbol("SYMBOL-STRING"));

    static private final SubLString $str_alt89$cb_td_global_ = makeString("cb-td-global|");

    static private final SubLString $str_alt90$_ = makeString("|");

    static private final SubLString $str_alt92$Global____S = makeString("Global : ~S");

    static private final SubLString $str_alt93$Global_Variable___ = makeString("Global Variable : ");

    static private final SubLString $str_alt94$Access___ = makeString("Access : ");

    static private final SubLString $str_alt98$Methods_that_reference_this_globa = makeString("Methods that reference this global");

    static private final SubLString $str_alt100$Globals_whose_initialization_refe = makeString("Globals whose initialization references this global");

    static private final SubLString $str_alt102$Modules_that_reference_this_globa = makeString("Modules that reference this global from top-level forms");

    static private final SubLString $str_alt103$Methods_called_in_the_initializat = makeString("Methods called in the initialization of this global");

    static private final SubLString $str_alt104$Globals_referenced_in_the_initial = makeString("Globals referenced in the initialization of this global");

    static private final SubLString $str_alt106$cb_td_method_ = makeString("cb-td-method|");

    static private final SubLString $str_alt108$Method____S = makeString("Method : ~S");

    static private final SubLString $str_alt109$Method___ = makeString("Method : ");

    static private final SubLString $str_alt110$Arglist___ = makeString("Arglist : ");

    static private final SubLString $str_alt114$Globals_whose_initialization_call = makeString("Globals whose initialization calls this method");

    static private final SubLString $str_alt115$Modules_that_call_this_method_fro = makeString("Modules that call this method from top-level forms");

    public static final SubLSymbol $kw121$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt123$___A = makeString("#:~A");

    static private final SubLString $str_alt124$_A___A = makeString("~A::~A");

    static private final SubLSymbol $sym125$_PRIN1_SYMBOL_TO_STRING_CACHING_STATE_ = makeSymbol("*PRIN1-SYMBOL-TO-STRING-CACHING-STATE*");

    static private final SubLString $str_alt126$Position___ = makeString("Position : ");

    static private final SubLString $str_alt127$Pathname___ = makeString("Pathname : ");

    static private final SubLString $str_alt128$CVSWeb___ = makeString("CVSWeb : ");
}

/**
 * Total time: 1221 ms
 */
