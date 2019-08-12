/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      HTML-SCRIPT-UTILITIES
 * source file: /cyc/top/cycl/html-script-utilities.lisp
 * created:     2019/07/03 17:38:02
 */
public final class html_script_utilities extends SubLTranslatedFile implements V12 {
    /**
     * Return a string suitable for the onSubmit method of a form given the applets
     * listed in APPLET-NAMES are proving simple input functionality.
     */
    @LispMethod(comment = "Return a string suitable for the onSubmit method of a form given the applets\r\nlisted in APPLET-NAMES are proving simple input functionality.\nReturn a string suitable for the onSubmit method of a form given the applets\nlisted in APPLET-NAMES are proving simple input functionality.")
    public static final SubLObject html_simple_applet_input_onsubmit_script(SubLObject applet_names) {
        {
            SubLObject result = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                format(stream, $str_alt103$onSubmit__return_simple_applet_fo);
                {
                    SubLObject cdolist_list_var = applet_names;
                    SubLObject applet_name = NIL;
                    for (applet_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , applet_name = cdolist_list_var.first()) {
                        if (applet_name != applet_names.first()) {
                            princ($str_alt104$__, stream);
                        }
                        format(stream, $str_alt105$__A_, applet_name);
                    }
                }
                princ($str_alt106$___, stream);
                result = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    /**
     * Initializes a hidden parameter that can be uniquely
     * determined to be associated with a particular applet
     * so that a piece of javascript can be sure that it gets
     * set to the result of calling toString() on the applet
     * when the form containing the applet is submitted.
     *
     * @return the unique ending that the applet should attach
    to its own name.
     */
    @LispMethod(comment = "Initializes a hidden parameter that can be uniquely\r\ndetermined to be associated with a particular applet\r\nso that a piece of javascript can be sure that it gets\r\nset to the result of calling toString() on the applet\r\nwhen the form containing the applet is submitted.\r\n\r\n@return the unique ending that the applet should attach\r\nto its own name.\nInitializes a hidden parameter that can be uniquely\ndetermined to be associated with a particular applet\nso that a piece of javascript can be sure that it gets\nset to the result of calling toString() on the applet\nwhen the form containing the applet is submitted.")
    public static final SubLObject html_simple_applet_input_initialization(SubLObject form_input_name, SubLObject applet_name) {
        if (applet_name == UNPROVIDED) {
            applet_name = $$$APPLET;
        }
        {
            SubLObject ending = cconcatenate($str_alt98$_, new SubLObject[]{ applet_name, $str_alt98$_, string_utilities.to_string(get_universal_time()), $str_alt98$_, string_utilities.to_string(random.random($int$30000)) });
            SubLObject previous_name = cconcatenate(form_input_name, new SubLObject[]{ ending, $str_alt100$_previous_value });
            html_markup(html_macros.$html_input_head$.getGlobalValue());
            html_markup(html_macros.$html_input_type$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_input_hidden$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != form_input_name) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(form_input_name);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != form_input_name) {
                html_markup(html_macros.$html_input_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(form_input_name);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != ending) {
                html_markup(html_macros.$html_input_alt$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ending);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_input_value$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_princ($str_alt32$);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            html_markup(html_macros.$html_input_head$.getGlobalValue());
            html_markup(html_macros.$html_input_type$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_input_text$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != previous_name) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(previous_name);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != previous_name) {
                html_markup(html_macros.$html_input_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(previous_name);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_input_value$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_princ($str_alt101$_______UNSET_______);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_input_size$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            dhtml_macros.dhtml_set_visibility(previous_name, $INVISIBLE, UNPROVIDED);
            return ending;
        }
    }

    public static final SubLObject html_simple_applet_input_definition_script() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup($simple_applet_input_js$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_script_tail$.getGlobalValue());
            return NIL;
        }
    }

    static private final SubLString $str_alt32$ = makeString("");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_sentence_input_simple_applets$ = makeSymbol("*DEFAULT-SENTENCE-INPUT-SIMPLE-APPLETS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $gke_applet_name$ = makeSymbol("*GKE-APPLET-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $simple_applet_input_js$ = makeSymbol("*SIMPLE-APPLET-INPUT-JS*");

    /**
     * The location of the hoverover javascript code.
     */
    // defparameter
    @LispMethod(comment = "The location of the hoverover javascript code.\ndefparameter")
    public static final SubLSymbol $cb_hoverover_script$ = makeSymbol("*CB-HOVEROVER-SCRIPT*");

    public static final SubLFile me = new html_script_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.html_script_utilities";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_script_languages$ = makeSymbol("*CB-SCRIPT-LANGUAGES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $html_dismiss_button_script$ = makeSymbol("*HTML-DISMISS-BUTTON-SCRIPT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $html_dismiss_link_script$ = makeSymbol("*HTML-DISMISS-LINK-SCRIPT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $html_back_button_script$ = makeSymbol("*HTML-BACK-BUTTON-SCRIPT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $html_refresh_button_script$ = makeSymbol("*HTML-REFRESH-BUTTON-SCRIPT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $html_refresh_link_script$ = makeSymbol("*HTML-REFRESH-LINK-SCRIPT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $html_refresh_frame_script$ = makeSymbol("*HTML-REFRESH-FRAME-SCRIPT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $html_clear_input_button_script$ = makeSymbol("*HTML-CLEAR-INPUT-BUTTON-SCRIPT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $html_insert_input_button_script$ = makeSymbol("*HTML-INSERT-INPUT-BUTTON-SCRIPT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $html_completing_input_button_script$ = makeSymbol("*HTML-COMPLETING-INPUT-BUTTON-SCRIPT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $html_clear_radio_input_script$ = makeSymbol("*HTML-CLEAR-RADIO-INPUT-SCRIPT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $html_focus_radio_input_script$ = makeSymbol("*HTML-FOCUS-RADIO-INPUT-SCRIPT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $html_back_onload_script$ = makeSymbol("*HTML-BACK-ONLOAD-SCRIPT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $html_multi_submit_script_preamble$ = makeSymbol("*HTML-MULTI-SUBMIT-SCRIPT-PREAMBLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $html_multi_submit_script_postamble$ = makeSymbol("*HTML-MULTI-SUBMIT-SCRIPT-POSTAMBLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $html_text_input_reset_multi_submit_preamble$ = makeSymbol("*HTML-TEXT-INPUT-RESET-MULTI-SUBMIT-PREAMBLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $html_text_input_reset_multi_submit_postamble$ = makeSymbol("*HTML-TEXT-INPUT-RESET-MULTI-SUBMIT-POSTAMBLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $html_set_multi_submit_form_info_first_name$ = makeSymbol("*HTML-SET-MULTI-SUBMIT-FORM-INFO-FIRST-NAME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $html_set_multi_submit_form_info_action$ = makeSymbol("*HTML-SET-MULTI-SUBMIT-FORM-INFO-ACTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $html_set_multi_submit_form_info_method$ = makeSymbol("*HTML-SET-MULTI-SUBMIT-FORM-INFO-METHOD*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $html_set_multi_submit_form_info_target$ = makeSymbol("*HTML-SET-MULTI-SUBMIT-FORM-INFO-TARGET*");

    // defparameter
    // Text to mark the beginning of a java script section in an HTML page.
    /**
     * Text to mark the beginning of a java script section in an HTML page.
     */
    @LispMethod(comment = "Text to mark the beginning of a java script section in an HTML page.\ndefparameter")
    private static final SubLSymbol $javascript_start$ = makeSymbol("*JAVASCRIPT-START*");

    // defparameter
    // Text demarking the end of a java script section.
    /**
     * Text demarking the end of a java script section.
     */
    @LispMethod(comment = "Text demarking the end of a java script section.\ndefparameter")
    private static final SubLSymbol $javascript_end$ = makeSymbol("*JAVASCRIPT-END*");

    // defparameter
    // Begins a javascript line comment.
    /**
     * Begins a javascript line comment.
     */
    @LispMethod(comment = "Begins a javascript line comment.\ndefparameter")
    private static final SubLSymbol $javascript_line_comment$ = makeSymbol("*JAVASCRIPT-LINE-COMMENT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $javascript_comment_begin$ = makeSymbol("*JAVASCRIPT-COMMENT-BEGIN*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $javascript_comment_end$ = makeSymbol("*JAVASCRIPT-COMMENT-END*");

    // defparameter
    /**
     * Since the hoverover box may use objects that trigger a hoverover script, we
     * need to keep track of how much hoverover nesting we allow. A value of 0 means
     * no nesting is allowed.
     */
    @LispMethod(comment = "Since the hoverover box may use objects that trigger a hoverover script, we\r\nneed to keep track of how much hoverover nesting we allow. A value of 0 means\r\nno nesting is allowed.\ndefparameter\nSince the hoverover box may use objects that trigger a hoverover script, we\nneed to keep track of how much hoverover nesting we allow. A value of 0 means\nno nesting is allowed.")
    public static final SubLSymbol $cb_hoverover_recursion_limit$ = makeSymbol("*CB-HOVEROVER-RECURSION-LIMIT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $javascript_event_remapping_assignments$ = makeSymbol("*JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $set_all_radio_buttons_script$ = makeSymbol("*SET-ALL-RADIO-BUTTONS-SCRIPT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $html_popup_script$ = makeSymbol("*HTML-POPUP-SCRIPT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeKeyword("JAVASCRIPT"));

    public static final SubLSymbol $cb_script_mode$ = makeSymbol("*CB-SCRIPT-MODE*");

    private static final SubLList $list4 = list(makeSymbol("VALUE"), makeSymbol("SCRIPT"), makeSymbol("&KEY"), makeSymbol("ARG-1"), makeSymbol("ARG-2"), makeSymbol("CLASS"));

    private static final SubLList $list5 = list(makeKeyword("ARG-1"), makeKeyword("ARG-2"), makeKeyword("CLASS"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $within_html_form$ = makeSymbol("*WITHIN-HTML-FORM*");

    private static final SubLSymbol HTML_SCRIPT_BUTTON = makeSymbol("HTML-SCRIPT-BUTTON");

    private static final SubLSymbol HTML_DUMMY_FORM = makeSymbol("HTML-DUMMY-FORM");

    private static final SubLString $str15$cb_back = makeString("cb-back");

    private static final SubLString $str16$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str17$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol CB_BACK = makeSymbol("CB-BACK");

    private static final SubLString $str21$onClick__top_close____ = makeString("onClick=\"top.close();\"");

    private static final SubLString $$$Dismiss = makeString("Dismiss");

    private static final SubLString $str23$onClick__top_close____return_fals = makeString("onClick=\"top.close(); return false;\"");

    private static final SubLString $str24$onClick__self_history_back____ = makeString("onClick=\"self.history.back();\"");

    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $str26$onClick__self_location___self_doc = makeString("onClick=\"self.location = self.document.location;\"");

    private static final SubLString $$$Refresh = makeString("Refresh");

    private static final SubLString $str28$onClick__self_location___self_doc = makeString("onClick=\"self.location = self.document.location; return false;\"");

    private static final SubLString $str29$_for__var_i___0__i___top_frames_l = makeString("\nfor (var i = 0; i < top.frames.length; i++) {\n  var frame = top.frames[i];\n  if (frame.name == \'~A\') {\n    frame.location = frame.document.location;\n    break;\n  }\n}");

    private static final SubLString $str30$onClick__with__this_form_elements = makeString("onClick=\"with (this.form.elements[\'~A\']){value = \'\'; focus();}\"");

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $str32$onClick__with__this_form_elements = makeString("onClick=\"with (this.form.elements[\'~A\']){value = value + \' \' + \'~A\'; focus();}\"");

    private static final SubLString $$$Insert = makeString("Insert");

    private static final SubLString $str34$onClick__with__this_form_elements = makeString("onClick=\"with (this.form.elements[\'~A\']){value = \'~A\';}; this.form.submit();\"");

    private static final SubLString $$$Paste = makeString("Paste");

    private static final SubLString $str36$onClick__with__this_form_elements = makeString("onClick=\"with (this.form.elements[\'~A\']){value = \'\';}\"");

    private static final SubLString $str37$onClick__with__this_form_elements = makeString("onClick=\"with (this.form.elements[\'~A\']){focus();}\"");

    private static final SubLSymbol $html_auto_select_radio_button_script$ = makeSymbol("*HTML-AUTO-SELECT-RADIO-BUTTON-SCRIPT*");

    private static final SubLString $str39$onkeypress__this_form__A__A__chec = makeString("onkeypress=\"this.form.~A[~A].checked=true\"");

    private static final SubLString $str40$onLoad__setTimeout__self_history_ = makeString("onLoad=\"setTimeout(\'self.history.back()\', ~A);\"");

    private static final SubLInteger $int$2000 = makeInteger(2000);

    private static final SubLString $str43$_onClick__ = makeString("\nonClick=\"");

    private static final SubLString $str44$_this_form_submit____ = makeString("\nthis.form.submit();\"");

    private static final SubLString $str45$_onFocus__ = makeString("\nonFocus=\"");

    private static final SubLString $str46$_ = makeString("\"");

    private static final SubLString $str47$ = makeString("");

    private static final SubLString $str48$width_ = makeString("width:");

    private static final SubLString $$$inputBox = makeString("inputBox");

    private static final SubLString $str50$_this_form_elements_0__name_____A = makeString("\nthis.form.elements[0].name = \'~A\';");

    private static final SubLString $str51$_this_form_action_____A__ = makeString("\nthis.form.action = \'~A\';");

    private static final SubLString $str52$_this_form_method_____A__ = makeString("\nthis.form.method = \'~A\';");

    private static final SubLString $str53$_this_form_target_____A__ = makeString("\nthis.form.target = \'~A\';");

    private static final SubLString $str54$_script_language__javascript__ = makeString("<script language=\"javascript\">");

    private static final SubLString $str55$__script_ = makeString("</script>");

    private static final SubLString $str56$__ = makeString("//");

    private static final SubLString $str57$__ = makeString("");

    private static final SubLString $str58$__ = makeString("\n");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str60$__ = makeString(", ");

    private static final SubLString $str61$__ = makeString(" (");

    private static final SubLString $str62$___ = makeString(") {");

    private static final SubLString $str63$_ = makeString("}");

    public static final SubLSymbol $cb_hoverover_enabled$ = makeSymbol("*CB-HOVEROVER-ENABLED*");

    private static final SubLString $$$overDiv = makeString("overDiv");

    private static final SubLString $str66$position_absolute__visibility_hid = makeString("position:absolute; visibility:hidden; z-index:1000;");

    private static final SubLString $str68$__ = makeString("\\\'");

    private static final SubLString $str69$_ = makeString("'");

    private static final SubLList $list70 = list(makeSymbol("PROGN"));

    private static final SubLList $list72 = list(list(makeSymbol("*CB-HOVEROVER-RECURSION-LIMIT*"), list(makeSymbol("-"), makeSymbol("*CB-HOVEROVER-RECURSION-LIMIT*"), ONE_INTEGER)));

    private static final SubLList $list73 = list(list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("HREF"), makeSymbol("NAME"), makeSymbol("TARGET"), makeSymbol("SCRIPT"), makeSymbol("STYLE"), makeSymbol("HOVEROVER-HTML"), makeSymbol("CAPTION"), makeSymbol("WIDTH"), makeSymbol("STICKY") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list74 = list(new SubLObject[]{ $HREF, $NAME, makeKeyword("TARGET"), makeKeyword("SCRIPT"), makeKeyword("STYLE"), makeKeyword("HOVEROVER-HTML"), makeKeyword("CAPTION"), makeKeyword("WIDTH"), makeKeyword("STICKY") });

    private static final SubLSymbol $sym84$ONMOUSEOVER = makeUninternedSymbol("ONMOUSEOVER");

    private static final SubLSymbol HTML_HOVEROVER_ANCHOR_ONMOUSEOVER = makeSymbol("HTML-HOVEROVER-ANCHOR-ONMOUSEOVER");

    static private final SubLList $list89 = list(makeKeyword("ONMOUSEOUT"), makeString("nd();"));

    private static final SubLSymbol HTML_HOVEROVER_ANCHOR = makeSymbol("HTML-HOVEROVER-ANCHOR");

    private static final SubLString $str91$return_overlib__ = makeString("return overlib('");

    private static final SubLString $str92$_CAPTION___A_ = makeString(",CAPTION,'~A'");

    private static final SubLString $str93$_WIDTH__A = makeString(",WIDTH,~A");

    private static final SubLString $str94$_STICKY = makeString(",STICKY");

    private static final SubLString $str95$_ = makeString(")");

    private static final SubLList $list97 = cons(makeSymbol("PATTERN"), makeSymbol("REPLACEMENT"));

    private static final SubLString $str98$Odd_event_handler__S____is_this_a = makeString("Odd event handler ~S -- is this a known DOM event?");

    private static final SubLList $list99 = list(makeSymbol("ID"), makeSymbol("EVENT-NAME"), makeSymbol("FUNCTION-NAME"));

    private static final SubLString $str100$__document_getElementById___A____ = makeString("~%document.getElementById('~A').~A = ~A;");

    private static final SubLList $list101 = list(list(makeSymbol("*JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS*"), NIL));

    private static final SubLList $list102 = list(list(makeSymbol("GENERATE-JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS"), makeSymbol("*JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS*")));

    private static final SubLString $str103$__function_set_all_radio_buttons_ = makeString("\n\nfunction set_all_radio_buttons(form, pattern, value) {\n  var re = new RegExp(pattern);\n  for (i = 0 ; i < form.elements.length ; i++) {\n    var field = form.elements[i]; \n    if (re.test(field.name)) {\n      if (field.value == value) {\n\tfield.checked = true;\n      } else {\n        field.checked = false;\n      }\n    }\n  } \n}");

    private static final SubLString $str104$javascript__void_set_all_radio_bu = makeString("javascript: void set_all_radio_buttons(~a, '~a', '~a')");

    private static final SubLString $str105$window_focus__ = makeString("window.focus()");

    private static final SubLString $$$Close_Window = makeString("Close Window");

    private static final SubLString $str108$onClick_javascript_self_close__ = makeString("onClick=javascript:self.close()");

    private static final SubLString $str109$function_positionedPopup_url_winN = makeString("function positionedPopup(url,winName,w,h,t,l,scroll){\n  settings =\n  \'height=\'+h+\',width=\'+w+\',top=\'+t+\',left=\'+l+\',scrollbars=\'+scroll+\',resizable=yes,location=no\';\n  window.open(url,winName,settings)\n  }");

    private static final SubLString $$$popup = makeString("popup");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLInteger $int$300 = makeInteger(300);

    private static final SubLString $str114$positionedPopup_this_href___ = makeString("positionedPopup(this.href, '");

    private static final SubLString $str115$____ = makeString("', '");

    private static final SubLString $$$yes = makeString("yes");

    private static final SubLString $$$no = makeString("no");

    private static final SubLString $str118$____return_false_ = makeString("'); return false;");

    private static final SubLString $str119$positionedPopup__ = makeString("positionedPopup('");

    private static final SubLSymbol $HTML_EDITOR_SCRIPTS = makeKeyword("HTML-EDITOR-SCRIPTS");

    public static final SubLObject html_simple_script_button_alt(SubLObject value, SubLObject script, SubLObject arg_1, SubLObject arg_2) {
        if (arg_1 == UNPROVIDED) {
            arg_1 = NIL;
        }
        if (arg_2 == UNPROVIDED) {
            arg_2 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(value, STRINGP);
            SubLTrampolineFile.checkType(script, STRINGP);
            if (NIL != html_macros.$within_html_form$.getDynamicValue(thread)) {
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
                html_indent(ONE_INTEGER);
                format(html_macros.$html_stream$.getDynamicValue(thread), script, arg_1, arg_2);
                html_char(CHAR_greater, UNPROVIDED);
            } else {
                html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
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
                        html_indent(ONE_INTEGER);
                        format(html_macros.$html_stream$.getDynamicValue(thread), script, arg_1, arg_2);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject html_simple_script_button(final SubLObject value, final SubLObject script, SubLObject arg_1, SubLObject arg_2) {
        if (arg_1 == UNPROVIDED) {
            arg_1 = NIL;
        }
        if (arg_2 == UNPROVIDED) {
            arg_2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(value) : "! stringp(value) " + ("Types.stringp(value) " + "CommonSymbols.NIL != Types.stringp(value) ") + value;
        assert NIL != stringp(script) : "! stringp(script) " + ("Types.stringp(script) " + "CommonSymbols.NIL != Types.stringp(script) ") + script;
        if (NIL != html_macros.$within_html_form$.getDynamicValue(thread)) {
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
            format(html_macros.$html_stream$.getDynamicValue(thread), script, arg_1, arg_2);
            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
            }
            html_char(CHAR_greater, UNPROVIDED);
        } else {
            html_markup(html_macros.$html_form_head$.getGlobalValue());
            html_markup(html_macros.$html_form_action$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_macros.$within_html_form$.bind(T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
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
                format(html_macros.$html_stream$.getDynamicValue(thread), script, arg_1, arg_2);
                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                }
                html_char(CHAR_greater, UNPROVIDED);
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            } finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_form_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject html_fancy_script_button(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject value = NIL;
        SubLObject script = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        script = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list4);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list4);
            if (NIL == member(current_$1, $list5, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list4);
        }
        final SubLObject arg_1_tail = property_list_member($ARG_1, current);
        final SubLObject arg_1 = (NIL != arg_1_tail) ? cadr(arg_1_tail) : NIL;
        final SubLObject arg_2_tail = property_list_member($ARG_2, current);
        final SubLObject arg_2 = (NIL != arg_2_tail) ? cadr(arg_2_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        return list(PIF, $within_html_form$, list(HTML_SCRIPT_BUTTON, list(value, $CLASS, v_class), list(HTML_FORMAT, script, arg_1, arg_2)), list(HTML_DUMMY_FORM, list(HTML_SCRIPT_BUTTON, list(value, $CLASS, v_class), list(HTML_FORMAT, script, arg_1, arg_2))));
    }

    public static final SubLObject html_simple_script_anchor_alt(SubLObject linktext, SubLObject script, SubLObject arg_1, SubLObject arg_2) {
        if (arg_1 == UNPROVIDED) {
            arg_1 = NIL;
        }
        if (arg_2 == UNPROVIDED) {
            arg_2 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(linktext, STRINGP);
            SubLTrampolineFile.checkType(script, STRINGP);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cb_url($str_alt4$cb_back, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_char(CHAR_quotation, UNPROVIDED);
            html_indent(ONE_INTEGER);
            format(html_macros.$html_stream$.getDynamicValue(thread), script, arg_1, arg_2);
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(linktext);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject html_simple_script_anchor(final SubLObject linktext, final SubLObject script, SubLObject arg_1, SubLObject arg_2) {
        if (arg_1 == UNPROVIDED) {
            arg_1 = NIL;
        }
        if (arg_2 == UNPROVIDED) {
            arg_2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(linktext) : "! stringp(linktext) " + ("Types.stringp(linktext) " + "CommonSymbols.NIL != Types.stringp(linktext) ") + linktext;
        assert NIL != stringp(script) : "! stringp(script) " + ("Types.stringp(script) " + "CommonSymbols.NIL != Types.stringp(script) ") + script;
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cb_url($str15$cb_back, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_space, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), script, arg_1, arg_2);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * A workaround for browsers which always follow JavaScript links
     */
    @LispMethod(comment = "A workaround for browsers which always follow JavaScript links")
    public static final SubLObject cb_back_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_indent(ONE_INTEGER);
                    com.cyc.cycjava.cycl.html_script_utilities.html_back_onload_script(ZERO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
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

    /**
     * A workaround for browsers which always follow JavaScript links
     */
    @LispMethod(comment = "A workaround for browsers which always follow JavaScript links")
    public static SubLObject cb_back(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str16$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str17$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_space, UNPROVIDED);
                html_back_onload_script(ZERO_INTEGER);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_source_readability_terpri(UNPROVIDED);
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

    public static final SubLObject html_dismiss_button_alt(SubLObject value) {
        if (value == UNPROVIDED) {
            value = $$$Dismiss;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.html_script_utilities.html_simple_script_button(value, $html_dismiss_button_script$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject html_dismiss_button(SubLObject value) {
        if (value == UNPROVIDED) {
            value = $$$Dismiss;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return html_simple_script_button(value, $html_dismiss_button_script$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject html_dismiss_link_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = $$$Dismiss;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.html_script_utilities.html_simple_script_anchor(linktext, $html_dismiss_link_script$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject html_dismiss_link(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = $$$Dismiss;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return html_simple_script_anchor(linktext, $html_dismiss_link_script$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject html_back_button_alt(SubLObject value) {
        if (value == UNPROVIDED) {
            value = $$$Back;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.html_script_utilities.html_simple_script_button(value, $html_back_button_script$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject html_back_button(SubLObject value) {
        if (value == UNPROVIDED) {
            value = $$$Back;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return html_simple_script_button(value, $html_back_button_script$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject html_refresh_button_alt(SubLObject value) {
        if (value == UNPROVIDED) {
            value = $$$Refresh;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.html_script_utilities.html_simple_script_button(value, $html_refresh_button_script$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject html_refresh_button(SubLObject value) {
        if (value == UNPROVIDED) {
            value = $$$Refresh;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return html_simple_script_button(value, $html_refresh_button_script$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject html_refresh_link_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = $$$Refresh;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.html_script_utilities.html_simple_script_anchor(linktext, $html_refresh_link_script$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject html_refresh_link(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = $$$Refresh;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return html_simple_script_anchor(linktext, $html_refresh_link_script$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Generate script which will refresh a frame called NAME, if it exists.
     */
    @LispMethod(comment = "Generate script which will refresh a frame called NAME, if it exists.")
    public static final SubLObject html_refresh_frame_script_alt(SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(name, STRINGP);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $html_refresh_frame_script$.getDynamicValue(thread), name);
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_script_tail$.getGlobalValue());
            return NIL;
        }
    }

    /**
     * Generate script which will refresh a frame called NAME, if it exists.
     */
    @LispMethod(comment = "Generate script which will refresh a frame called NAME, if it exists.")
    public static SubLObject html_refresh_frame_script(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
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
            format(html_macros.$html_stream$.getDynamicValue(thread), $html_refresh_frame_script$.getDynamicValue(thread), name);
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * Generate a button which will clear a text input or text area called INPUT-NAME
     */
    @LispMethod(comment = "Generate a button which will clear a text input or text area called INPUT-NAME")
    public static final SubLObject html_clear_input_button(SubLObject input_name, SubLObject value) {
        if (value == UNPROVIDED) {
            value = $$$Clear;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(input_name, STRINGP);
            return com.cyc.cycjava.cycl.html_script_utilities.html_simple_script_button(value, $html_clear_input_button_script$.getDynamicValue(thread), input_name, UNPROVIDED);
        }
    }

    public static SubLObject html_clear_input_button(final SubLObject input_name, SubLObject value, SubLObject v_class) {
        if (value == UNPROVIDED) {
            value = $$$Clear;
        }
        if (v_class == UNPROVIDED) {
            v_class = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(input_name) : "! stringp(input_name) " + ("Types.stringp(input_name) " + "CommonSymbols.NIL != Types.stringp(input_name) ") + input_name;
        if (NIL != html_macros.$within_html_form$.getDynamicValue(thread)) {
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
            format(html_macros.$html_stream$.getDynamicValue(thread), $html_clear_input_button_script$.getDynamicValue(thread), input_name, NIL);
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
        } else {
            html_markup(html_macros.$html_form_head$.getGlobalValue());
            html_markup(html_macros.$html_form_action$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_macros.$within_html_form$.bind(T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
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
                format(html_macros.$html_stream$.getDynamicValue(thread), $html_clear_input_button_script$.getDynamicValue(thread), input_name, NIL);
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
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            } finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_form_tail$.getGlobalValue());
        }
        return NIL;
    }

    /**
     * Generate a button which will insert the INPUT-VALUE automatically into the
     * INPUT-NAME text area.
     */
    @LispMethod(comment = "Generate a button which will insert the INPUT-VALUE automatically into the\r\nINPUT-NAME text area.\nGenerate a button which will insert the INPUT-VALUE automatically into the\nINPUT-NAME text area.")
    public static final SubLObject html_insert_input_button_alt(SubLObject input_name, SubLObject input_value, SubLObject button) {
        if (button == UNPROVIDED) {
            button = $$$Insert;
        }
        SubLTrampolineFile.checkType(input_name, STRINGP);
        SubLTrampolineFile.checkType(input_value, STRINGP);
        return com.cyc.cycjava.cycl.html_script_utilities.html_simple_script_button(button, $html_insert_input_button_script$.getGlobalValue(), input_name, input_value);
    }

    /**
     * Generate a button which will insert the INPUT-VALUE automatically into the
     * INPUT-NAME text area.
     */
    @LispMethod(comment = "Generate a button which will insert the INPUT-VALUE automatically into the\r\nINPUT-NAME text area.\nGenerate a button which will insert the INPUT-VALUE automatically into the\nINPUT-NAME text area.")
    public static SubLObject html_insert_input_button(final SubLObject input_name, final SubLObject input_value, SubLObject button) {
        if (button == UNPROVIDED) {
            button = $$$Insert;
        }
        assert NIL != stringp(input_name) : "! stringp(input_name) " + ("Types.stringp(input_name) " + "CommonSymbols.NIL != Types.stringp(input_name) ") + input_name;
        assert NIL != stringp(input_value) : "! stringp(input_value) " + ("Types.stringp(input_value) " + "CommonSymbols.NIL != Types.stringp(input_value) ") + input_value;
        return html_simple_script_button(button, $html_insert_input_button_script$.getGlobalValue(), input_name, input_value);
    }

    /**
     * Generate a button which will insert a known string INPUT-VALUE into the form and then submit the form.
     */
    @LispMethod(comment = "Generate a button which will insert a known string INPUT-VALUE into the form and then submit the form.")
    public static final SubLObject html_completing_input_button_alt(SubLObject input_name, SubLObject input_value, SubLObject button) {
        if (button == UNPROVIDED) {
            button = $$$Paste;
        }
        SubLTrampolineFile.checkType(input_name, STRINGP);
        SubLTrampolineFile.checkType(input_value, STRINGP);
        return com.cyc.cycjava.cycl.html_script_utilities.html_simple_script_button(button, $html_completing_input_button_script$.getGlobalValue(), input_name, input_value);
    }

    /**
     * Generate a button which will insert a known string INPUT-VALUE into the form and then submit the form.
     */
    @LispMethod(comment = "Generate a button which will insert a known string INPUT-VALUE into the form and then submit the form.")
    public static SubLObject html_completing_input_button(final SubLObject input_name, final SubLObject input_value, SubLObject button) {
        if (button == UNPROVIDED) {
            button = $$$Paste;
        }
        assert NIL != stringp(input_name) : "! stringp(input_name) " + ("Types.stringp(input_name) " + "CommonSymbols.NIL != Types.stringp(input_name) ") + input_name;
        assert NIL != stringp(input_value) : "! stringp(input_value) " + ("Types.stringp(input_value) " + "CommonSymbols.NIL != Types.stringp(input_value) ") + input_value;
        return html_simple_script_button(button, $html_completing_input_button_script$.getGlobalValue(), input_name, input_value);
    }

    /**
     * Generate a radio button which will clear CLEAR-NAME input field when checked.
     */
    @LispMethod(comment = "Generate a radio button which will clear CLEAR-NAME input field when checked.")
    public static final SubLObject html_clear_radio_input(SubLObject name, SubLObject clear_name, SubLObject value, SubLObject checkedP) {
        if (value == UNPROVIDED) {
            value = NIL;
        }
        if (checkedP == UNPROVIDED) {
            checkedP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(name, STRINGP);
            SubLTrampolineFile.checkType(clear_name, STRINGP);
            html_markup(html_macros.$html_input_head$.getGlobalValue());
            html_markup(html_macros.$html_input_type$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_input_radio$.getGlobalValue());
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
            html_indent(ONE_INTEGER);
            format(html_macros.$html_stream$.getDynamicValue(thread), $html_clear_radio_input_script$.getDynamicValue(thread), clear_name);
            html_char(CHAR_greater, UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject html_clear_radio_input(final SubLObject name, final SubLObject clear_name, SubLObject value, SubLObject checkedP, SubLObject id) {
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
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != stringp(clear_name) : "! stringp(clear_name) " + ("Types.stringp(clear_name) " + "CommonSymbols.NIL != Types.stringp(clear_name) ") + clear_name;
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
        html_char(CHAR_space, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $html_clear_radio_input_script$.getDynamicValue(thread), clear_name);
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    /**
     * Generate a radio button which will focus on FOCUS-NAME input field when checked.
     */
    @LispMethod(comment = "Generate a radio button which will focus on FOCUS-NAME input field when checked.")
    public static final SubLObject html_focus_radio_input(SubLObject name, SubLObject focus_name, SubLObject value, SubLObject checkedP) {
        if (value == UNPROVIDED) {
            value = NIL;
        }
        if (checkedP == UNPROVIDED) {
            checkedP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(name, STRINGP);
            SubLTrampolineFile.checkType(focus_name, STRINGP);
            html_markup(html_macros.$html_input_head$.getGlobalValue());
            html_markup(html_macros.$html_input_type$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_input_radio$.getGlobalValue());
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
            html_indent(ONE_INTEGER);
            format(html_macros.$html_stream$.getDynamicValue(thread), $html_focus_radio_input_script$.getDynamicValue(thread), focus_name);
            html_char(CHAR_greater, UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject html_focus_radio_input(final SubLObject name, final SubLObject focus_name, SubLObject value, SubLObject checkedP, SubLObject id) {
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
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != stringp(focus_name) : "! stringp(focus_name) " + ("Types.stringp(focus_name) " + "CommonSymbols.NIL != Types.stringp(focus_name) ") + focus_name;
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
        html_char(CHAR_space, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $html_focus_radio_input_script$.getDynamicValue(thread), focus_name);
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    /**
     * generate a script that will auto select a particular radio button when a key is pressed
     */
    @LispMethod(comment = "generate a script that will auto select a particular radio button when a key is pressed")
    public static final SubLObject html_auto_select_radio_button_script_alt(SubLObject object_id, SubLObject radio_button_number) {
        return format(NIL, $html_auto_select_radio_button_script$.getGlobalValue(), object_id, radio_button_number);
    }

    /**
     * generate a script that will auto select a particular radio button when a key is pressed
     */
    @LispMethod(comment = "generate a script that will auto select a particular radio button when a key is pressed")
    public static SubLObject html_auto_select_radio_button_script(final SubLObject object_id, final SubLObject radio_button_number) {
        return format(NIL, $html_auto_select_radio_button_script$.getGlobalValue(), object_id, radio_button_number);
    }

    /**
     * Generate script to automatically go back on loading.
     * Delay is the time in milliseconds we wait before going back.
     */
    @LispMethod(comment = "Generate script to automatically go back on loading.\r\nDelay is the time in milliseconds we wait before going back.\nGenerate script to automatically go back on loading.\nDelay is the time in milliseconds we wait before going back.")
    public static final SubLObject html_back_onload_script_alt(SubLObject delay) {
        if (delay == UNPROVIDED) {
            delay = $int$2000;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(delay, INTEGERP);
            format(html_macros.$html_stream$.getDynamicValue(thread), $html_back_onload_script$.getDynamicValue(thread), delay);
            return NIL;
        }
    }

    /**
     * Generate script to automatically go back on loading.
     * Delay is the time in milliseconds we wait before going back.
     */
    @LispMethod(comment = "Generate script to automatically go back on loading.\r\nDelay is the time in milliseconds we wait before going back.\nGenerate script to automatically go back on loading.\nDelay is the time in milliseconds we wait before going back.")
    public static SubLObject html_back_onload_script(SubLObject delay) {
        if (delay == UNPROVIDED) {
            delay = $int$2000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(delay) : "! integerp(delay) " + ("Types.integerp(delay) " + "CommonSymbols.NIL != Types.integerp(delay) ") + delay;
        format(html_macros.$html_stream$.getDynamicValue(thread), $html_back_onload_script$.getDynamicValue(thread), delay);
        return NIL;
    }

    /**
     * Generate a submit button with LABEL (and ID).
     * If FIRST-NAME is present, then the name of the first input item is changed to FIRST-NAME on submit.
     * If any of ACTION, METHOD or TARGET are present, then the enclosing form's value
     * for these are changed on submit.
     */
    @LispMethod(comment = "Generate a submit button with LABEL (and ID).\r\nIf FIRST-NAME is present, then the name of the first input item is changed to FIRST-NAME on submit.\r\nIf any of ACTION, METHOD or TARGET are present, then the enclosing form\'s value\r\nfor these are changed on submit.\nGenerate a submit button with LABEL (and ID).\nIf FIRST-NAME is present, then the name of the first input item is changed to FIRST-NAME on submit.\nIf any of ACTION, METHOD or TARGET are present, then the enclosing form\'s value\nfor these are changed on submit.")
    public static final SubLObject html_multi_submit_input_alt(SubLObject label, SubLObject id, SubLObject first_name, SubLObject action, SubLObject method, SubLObject target, SubLObject style) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        if (first_name == UNPROVIDED) {
            first_name = NIL;
        }
        if (action == UNPROVIDED) {
            action = NIL;
        }
        if (method == UNPROVIDED) {
            method = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (style == UNPROVIDED) {
            style = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(label, STRINGP);
            html_markup(html_macros.$html_input_head$.getGlobalValue());
            html_markup(html_macros.$html_input_type$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_input_submit$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_input_style$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(style);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != label) {
                html_markup(html_macros.$html_input_value$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_princ(label);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_indent(ONE_INTEGER);
            format(html_macros.$html_stream$.getDynamicValue(thread), $html_multi_submit_script_preamble$.getDynamicValue(thread));
            com.cyc.cycjava.cycl.html_script_utilities.html_set_multi_submit_form_info(first_name, action, method, target);
            format(html_macros.$html_stream$.getDynamicValue(thread), $html_multi_submit_script_postamble$.getDynamicValue(thread));
            html_char(CHAR_greater, UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Generate a submit button with LABEL (and ID).
     * If FIRST-NAME is present, then the name of the first input item is changed to FIRST-NAME on submit.
     * If any of ACTION, METHOD or TARGET are present, then the enclosing form's value
     * for these are changed on submit.
     */
    @LispMethod(comment = "Generate a submit button with LABEL (and ID).\r\nIf FIRST-NAME is present, then the name of the first input item is changed to FIRST-NAME on submit.\r\nIf any of ACTION, METHOD or TARGET are present, then the enclosing form\'s value\r\nfor these are changed on submit.\nGenerate a submit button with LABEL (and ID).\nIf FIRST-NAME is present, then the name of the first input item is changed to FIRST-NAME on submit.\nIf any of ACTION, METHOD or TARGET are present, then the enclosing form\'s value\nfor these are changed on submit.")
    public static SubLObject html_multi_submit_input(final SubLObject label, SubLObject id, SubLObject first_name, SubLObject action, SubLObject method, SubLObject target, SubLObject style) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        if (first_name == UNPROVIDED) {
            first_name = NIL;
        }
        if (action == UNPROVIDED) {
            action = NIL;
        }
        if (method == UNPROVIDED) {
            method = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (style == UNPROVIDED) {
            style = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(label) : "! stringp(label) " + ("Types.stringp(label) " + "CommonSymbols.NIL != Types.stringp(label) ") + label;
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_submit$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(style);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != label) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(label);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_space, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $html_multi_submit_script_preamble$.getDynamicValue(thread));
        html_set_multi_submit_form_info(first_name, action, method, target);
        format(html_macros.$html_stream$.getDynamicValue(thread), $html_multi_submit_script_postamble$.getDynamicValue(thread));
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @param WIDTH
     * 		stringp; the width of the input box (with units specified in the string (e.g. 100%)
     */
    @LispMethod(comment = "@param WIDTH\r\n\t\tstringp; the width of the input box (with units specified in the string (e.g. 100%)")
    public static final SubLObject html_text_input_reset_multi_submit_alt(SubLObject name, SubLObject v_default, SubLObject width, SubLObject first_name, SubLObject action, SubLObject method, SubLObject target) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        if (first_name == UNPROVIDED) {
            first_name = NIL;
        }
        if (action == UNPROVIDED) {
            action = NIL;
        }
        if (method == UNPROVIDED) {
            method = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (v_default.equalp($str_alt32$)) {
                v_default = NIL;
            }
            {
                SubLObject style_value = cconcatenate($str_alt33$width_, format_nil.format_nil_a_no_copy(width));
                html_markup(html_macros.$html_input_head$.getGlobalValue());
                html_markup(html_macros.$html_input_type$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_input_text$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_input_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(style_value);
                html_char(CHAR_quotation, UNPROVIDED);
                if (true) {
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$inputBox);
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
                html_indent(ONE_INTEGER);
                format(html_macros.$html_stream$.getDynamicValue(thread), $html_text_input_reset_multi_submit_preamble$.getDynamicValue(thread));
                com.cyc.cycjava.cycl.html_script_utilities.html_set_multi_submit_form_info(first_name, action, method, target);
                format(html_macros.$html_stream$.getDynamicValue(thread), $html_text_input_reset_multi_submit_postamble$.getDynamicValue(thread));
                html_char(CHAR_greater, UNPROVIDED);
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @param WIDTH
     * 		stringp; the width of the input box (with units specified in the string (e.g. 100%)
     */
    @LispMethod(comment = "@param WIDTH\r\n\t\tstringp; the width of the input box (with units specified in the string (e.g. 100%)")
    public static SubLObject html_text_input_reset_multi_submit(final SubLObject name, SubLObject v_default, SubLObject width, SubLObject first_name, SubLObject action, SubLObject method, SubLObject target) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        if (first_name == UNPROVIDED) {
            first_name = NIL;
        }
        if (action == UNPROVIDED) {
            action = NIL;
        }
        if (method == UNPROVIDED) {
            method = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_default.equalp($str47$)) {
            v_default = NIL;
        }
        final SubLObject style_value = cconcatenate($str48$width_, format_nil.format_nil_a_no_copy(width));
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_text$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(style_value);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$inputBox);
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
        html_char(CHAR_space, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $html_text_input_reset_multi_submit_preamble$.getDynamicValue(thread));
        html_set_multi_submit_form_info(first_name, action, method, target);
        format(html_macros.$html_stream$.getDynamicValue(thread), $html_text_input_reset_multi_submit_postamble$.getDynamicValue(thread));
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_set_multi_submit_form_info_alt(SubLObject first_name, SubLObject action, SubLObject method, SubLObject target) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (first_name.isString()) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $html_set_multi_submit_form_info_first_name$.getDynamicValue(thread), first_name);
            }
            if (action.isString()) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $html_set_multi_submit_form_info_action$.getDynamicValue(thread), action);
            }
            if (method.isString()) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $html_set_multi_submit_form_info_method$.getDynamicValue(thread), method);
            }
            if (target.isString()) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $html_set_multi_submit_form_info_target$.getDynamicValue(thread), target);
            }
            return NIL;
        }
    }

    public static SubLObject html_set_multi_submit_form_info(final SubLObject first_name, final SubLObject action, final SubLObject method, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (first_name.isString()) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $html_set_multi_submit_form_info_first_name$.getDynamicValue(thread), first_name);
        }
        if (action.isString()) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $html_set_multi_submit_form_info_action$.getDynamicValue(thread), action);
        }
        if (method.isString()) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $html_set_multi_submit_form_info_method$.getDynamicValue(thread), method);
        }
        if (target.isString()) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $html_set_multi_submit_form_info_target$.getDynamicValue(thread), target);
        }
        return NIL;
    }

    /**
     * Inserts the given text within java style open/close comments and returns that string.  If the spaces param is given, then spaces will be added between the comment symbols and the supplied text.
     */
    @LispMethod(comment = "Inserts the given text within java style open/close comments and returns that string.  If the spaces param is given, then spaces will be added between the comment symbols and the supplied text.")
    public static final SubLObject javascript_comment_alt(SubLObject text, SubLObject spaces) {
        if (text == UNPROVIDED) {
            text = NIL;
        }
        if (spaces == UNPROVIDED) {
            spaces = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != text) {
                if (NIL != spaces) {
                    return cconcatenate($javascript_comment_begin$.getDynamicValue(thread), new SubLObject[]{ $str_alt44$_, text, $str_alt44$_, $javascript_comment_end$.getDynamicValue(thread) });
                } else {
                    return cconcatenate($javascript_comment_begin$.getDynamicValue(thread), new SubLObject[]{ text, $javascript_comment_end$.getDynamicValue(thread) });
                }
            } else {
                return cconcatenate($javascript_comment_begin$.getDynamicValue(thread), $javascript_comment_end$.getDynamicValue(thread));
            }
        }
    }

    /**
     * Inserts the given text within java style open/close comments and returns that string.  If the spaces param is given, then spaces will be added between the comment symbols and the supplied text.
     */
    @LispMethod(comment = "Inserts the given text within java style open/close comments and returns that string.  If the spaces param is given, then spaces will be added between the comment symbols and the supplied text.")
    public static SubLObject javascript_comment(SubLObject text, SubLObject spaces) {
        if (text == UNPROVIDED) {
            text = NIL;
        }
        if (spaces == UNPROVIDED) {
            spaces = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == text) {
            return cconcatenate($javascript_comment_begin$.getDynamicValue(thread), $javascript_comment_end$.getDynamicValue(thread));
        }
        if (NIL != spaces) {
            return cconcatenate($javascript_comment_begin$.getDynamicValue(thread), new SubLObject[]{ $$$_, text, $$$_, $javascript_comment_end$.getDynamicValue(thread) });
        }
        return cconcatenate($javascript_comment_begin$.getDynamicValue(thread), new SubLObject[]{ text, $javascript_comment_end$.getDynamicValue(thread) });
    }

    /**
     * Inserts a comment character at the beginning of the given text and returns that new string. Again the spaces when true indicates to add a space between the comment symbol and the text.
     */
    @LispMethod(comment = "Inserts a comment character at the beginning of the given text and returns that new string. Again the spaces when true indicates to add a space between the comment symbol and the text.")
    public static final SubLObject javascript_comment_line_alt(SubLObject line_of_text, SubLObject spaces) {
        if (line_of_text == UNPROVIDED) {
            line_of_text = NIL;
        }
        if (spaces == UNPROVIDED) {
            spaces = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != line_of_text) {
                if (NIL != spaces) {
                    return cconcatenate($javascript_line_comment$.getDynamicValue(thread), new SubLObject[]{ $str_alt44$_, line_of_text });
                } else {
                    return cconcatenate($javascript_line_comment$.getDynamicValue(thread), line_of_text);
                }
            } else {
                return $javascript_line_comment$.getDynamicValue(thread);
            }
        }
    }

    /**
     * Inserts a comment character at the beginning of the given text and returns that new string. Again the spaces when true indicates to add a space between the comment symbol and the text.
     */
    @LispMethod(comment = "Inserts a comment character at the beginning of the given text and returns that new string. Again the spaces when true indicates to add a space between the comment symbol and the text.")
    public static SubLObject javascript_comment_line(SubLObject line_of_text, SubLObject spaces) {
        if (line_of_text == UNPROVIDED) {
            line_of_text = NIL;
        }
        if (spaces == UNPROVIDED) {
            spaces = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == line_of_text) {
            return $javascript_line_comment$.getDynamicValue(thread);
        }
        if (NIL != spaces) {
            return cconcatenate($javascript_line_comment$.getDynamicValue(thread), new SubLObject[]{ $$$_, line_of_text });
        }
        return cconcatenate($javascript_line_comment$.getDynamicValue(thread), line_of_text);
    }

    /**
     * Inserts the given script within the java script markers.  If the no-comment param is supplied (ie non nil) then the typical html-comments that hide java script from non java script browsers will be omitted.  The result will be returned as a string. Note that newlines are inserted at the typical places for you (necessary to make sure that the line comments work correctly).
     */
    @LispMethod(comment = "Inserts the given script within the java script markers.  If the no-comment param is supplied (ie non nil) then the typical html-comments that hide java script from non java script browsers will be omitted.  The result will be returned as a string. Note that newlines are inserted at the typical places for you (necessary to make sure that the line comments work correctly).")
    public static final SubLObject simple_javascript_alt(SubLObject script, SubLObject no_comment) {
        if (script == UNPROVIDED) {
            script = NIL;
        }
        if (no_comment == UNPROVIDED) {
            no_comment = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != script) {
                if (NIL != no_comment) {
                    return cconcatenate($javascript_start$.getDynamicValue(thread), new SubLObject[]{ Strings.string(CHAR_newline), script, Strings.string(CHAR_newline), $javascript_end$.getDynamicValue(thread) });
                } else {
                    return cconcatenate($javascript_start$.getDynamicValue(thread), new SubLObject[]{ Strings.string(CHAR_newline), html_macros.$html_comment_head$.getGlobalValue(), Strings.string(CHAR_newline), script, Strings.string(CHAR_newline), com.cyc.cycjava.cycl.html_script_utilities.javascript_comment_line(html_macros.$html_comment_tail$.getGlobalValue(), UNPROVIDED), Strings.string(CHAR_newline), $javascript_end$.getDynamicValue(thread) });
                }
            } else {
                return cconcatenate($javascript_start$.getDynamicValue(thread), $javascript_end$.getDynamicValue(thread));
            }
        }
    }

    /**
     * Inserts the given script within the java script markers.  If the no-comment param is supplied (ie non nil) then the typical html-comments that hide java script from non java script browsers will be omitted.  The result will be returned as a string. Note that newlines are inserted at the typical places for you (necessary to make sure that the line comments work correctly).
     */
    @LispMethod(comment = "Inserts the given script within the java script markers.  If the no-comment param is supplied (ie non nil) then the typical html-comments that hide java script from non java script browsers will be omitted.  The result will be returned as a string. Note that newlines are inserted at the typical places for you (necessary to make sure that the line comments work correctly).")
    public static SubLObject simple_javascript(SubLObject script, SubLObject no_comment) {
        if (script == UNPROVIDED) {
            script = NIL;
        }
        if (no_comment == UNPROVIDED) {
            no_comment = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == script) {
            return cconcatenate($javascript_start$.getDynamicValue(thread), $javascript_end$.getDynamicValue(thread));
        }
        if (NIL != no_comment) {
            return cconcatenate($javascript_start$.getDynamicValue(thread), new SubLObject[]{ Strings.string(CHAR_newline), script, Strings.string(CHAR_newline), $javascript_end$.getDynamicValue(thread) });
        }
        return cconcatenate($javascript_start$.getDynamicValue(thread), new SubLObject[]{ Strings.string(CHAR_newline), html_macros.$html_comment_head$.getGlobalValue(), Strings.string(CHAR_newline), script, Strings.string(CHAR_newline), javascript_comment_line(html_macros.$html_comment_tail$.getGlobalValue(), UNPROVIDED), Strings.string(CHAR_newline), $javascript_end$.getDynamicValue(thread) });
    }

    /**
     * Returns a string of the given function suitable for putting in a javascript section.  Name is the function name, body is of course the body (brackets are not needed), and the optional params are parameters for the function.
     */
    @LispMethod(comment = "Returns a string of the given function suitable for putting in a javascript section.  Name is the function name, body is of course the body (brackets are not needed), and the optional params are parameters for the function.")
    public static final SubLObject javascript_function_alt(SubLObject name, SubLObject body, SubLObject p1, SubLObject p2, SubLObject p3, SubLObject p4, SubLObject p5) {
        if (p1 == UNPROVIDED) {
            p1 = NIL;
        }
        if (p2 == UNPROVIDED) {
            p2 = NIL;
        }
        if (p3 == UNPROVIDED) {
            p3 = NIL;
        }
        if (p4 == UNPROVIDED) {
            p4 = NIL;
        }
        if (p5 == UNPROVIDED) {
            p5 = NIL;
        }
        {
            SubLObject param_list = $str_alt32$;
            if (NIL != p1) {
                param_list = p1;
                if (NIL != p2) {
                    param_list = cconcatenate(param_list, new SubLObject[]{ $str_alt45$__, p2 });
                    if (NIL != p3) {
                        param_list = cconcatenate(param_list, new SubLObject[]{ $str_alt45$__, p3 });
                        if (NIL != p4) {
                            param_list = cconcatenate(param_list, new SubLObject[]{ $str_alt45$__, p4 });
                            if (NIL != p5) {
                                param_list = cconcatenate(param_list, new SubLObject[]{ $str_alt45$__, p5 });
                            }
                        }
                    }
                }
            }
            return cconcatenate(name, new SubLObject[]{ $str_alt46$__, param_list, $str_alt47$___, Strings.string(CHAR_newline), body, Strings.string(CHAR_newline), $str_alt48$_, Strings.string(CHAR_newline) });
        }
    }

    /**
     * Returns a string of the given function suitable for putting in a javascript section.  Name is the function name, body is of course the body (brackets are not needed), and the optional params are parameters for the function.
     */
    @LispMethod(comment = "Returns a string of the given function suitable for putting in a javascript section.  Name is the function name, body is of course the body (brackets are not needed), and the optional params are parameters for the function.")
    public static SubLObject javascript_function(final SubLObject name, final SubLObject body, SubLObject p1, SubLObject p2, SubLObject p3, SubLObject p4, SubLObject p5) {
        if (p1 == UNPROVIDED) {
            p1 = NIL;
        }
        if (p2 == UNPROVIDED) {
            p2 = NIL;
        }
        if (p3 == UNPROVIDED) {
            p3 = NIL;
        }
        if (p4 == UNPROVIDED) {
            p4 = NIL;
        }
        if (p5 == UNPROVIDED) {
            p5 = NIL;
        }
        SubLObject param_list = $str47$;
        if (NIL != p1) {
            param_list = p1;
            if (NIL != p2) {
                param_list = cconcatenate(param_list, new SubLObject[]{ $str60$__, p2 });
                if (NIL != p3) {
                    param_list = cconcatenate(param_list, new SubLObject[]{ $str60$__, p3 });
                    if (NIL != p4) {
                        param_list = cconcatenate(param_list, new SubLObject[]{ $str60$__, p4 });
                        if (NIL != p5) {
                            param_list = cconcatenate(param_list, new SubLObject[]{ $str60$__, p5 });
                        }
                    }
                }
            }
        }
        return cconcatenate(name, new SubLObject[]{ $str61$__, param_list, $str62$___, Strings.string(CHAR_newline), body, Strings.string(CHAR_newline), $str63$_, Strings.string(CHAR_newline) });
    }

    public static final SubLObject cb_hoverover_page_init_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$overDiv);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_div_style$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str_alt52$position_absolute__visibility_hid);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$JavaScript);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_script_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($cb_hoverover_script$.getDynamicValue(thread));
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
            return NIL;
        }
    }

    public static SubLObject cb_hoverover_page_init() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$overDiv);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str66$position_absolute__visibility_hid);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        cyc_file_dependencies.javascript($OVERLIB);
        return NIL;
    }

    public static final SubLObject cb_hoverover_clean_html_alt(SubLObject html_text) {
        html_text = substitute(CHAR_quote, CHAR_quotation, html_text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_text = substitute(CHAR_space, CHAR_newline, html_text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_text = string_utilities.string_substitute($str_alt54$__, $str_alt55$_, html_text, UNPROVIDED);
        return html_text;
    }

    public static SubLObject cb_hoverover_clean_html(SubLObject html_text) {
        html_text = substitute(CHAR_quote, CHAR_quotation, html_text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_text = substitute(CHAR_space, CHAR_newline, html_text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_text = string_utilities.string_substitute($str68$__, $str69$_, html_text, UNPROVIDED);
        return html_text;
    }

    public static final SubLObject cb_hoverover_recursion_disallowedP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((!$cb_hoverover_recursion_limit$.getDynamicValue(thread).isInteger()) || $cb_hoverover_recursion_limit$.getDynamicValue(thread).numL(ZERO_INTEGER));
        }
    }

    public static SubLObject cb_hoverover_recursion_disallowedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((!$cb_hoverover_recursion_limit$.getDynamicValue(thread).isInteger()) || $cb_hoverover_recursion_limit$.getDynamicValue(thread).numL(ZERO_INTEGER));
    }

    public static final SubLObject with_cb_hoverover_recursion_protection_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            if (NIL != com.cyc.cycjava.cycl.html_script_utilities.cb_hoverover_recursion_disallowedP()) {
                return $list_alt56;
            } else {
                return listS(CLET, $list_alt58, append(body, NIL));
            }
        }
    }

    public static SubLObject with_cb_hoverover_recursion_protection(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        if (NIL != cb_hoverover_recursion_disallowedP()) {
            return $list70;
        }
        return listS(CLET, $list72, append(body, NIL));
    }

    /**
     * Wrapper around html-fancy-anchor to prevent unbounded hoverover recursion.
     */
    @LispMethod(comment = "Wrapper around html-fancy-anchor to prevent unbounded hoverover recursion.")
    public static final SubLObject html_hoverover_anchor_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt59);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_2 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt59);
                        current_2 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt59);
                        if (NIL == member(current_2, $list_alt60, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_2 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt59);
                    }
                    {
                        SubLObject href_tail = property_list_member($HREF, current);
                        SubLObject href = (NIL != href_tail) ? ((SubLObject) (cadr(href_tail))) : NIL;
                        SubLObject name_tail = property_list_member($NAME, current);
                        SubLObject name = (NIL != name_tail) ? ((SubLObject) (cadr(name_tail))) : NIL;
                        SubLObject target_tail = property_list_member($TARGET, current);
                        SubLObject target = (NIL != target_tail) ? ((SubLObject) (cadr(target_tail))) : NIL;
                        SubLObject script_tail = property_list_member($SCRIPT, current);
                        SubLObject script = (NIL != script_tail) ? ((SubLObject) (cadr(script_tail))) : NIL;
                        SubLObject style_tail = property_list_member($STYLE, current);
                        SubLObject style = (NIL != style_tail) ? ((SubLObject) (cadr(style_tail))) : NIL;
                        SubLObject hoverover_html_tail = property_list_member($HOVEROVER_HTML, current);
                        SubLObject hoverover_html = (NIL != hoverover_html_tail) ? ((SubLObject) (cadr(hoverover_html_tail))) : NIL;
                        SubLObject caption_tail = property_list_member($CAPTION, current);
                        SubLObject caption = (NIL != caption_tail) ? ((SubLObject) (cadr(caption_tail))) : NIL;
                        SubLObject width_tail = property_list_member($WIDTH, current);
                        SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : NIL;
                        SubLObject sticky_tail = property_list_member($STICKY, current);
                        SubLObject sticky = (NIL != sticky_tail) ? ((SubLObject) (cadr(sticky_tail))) : NIL;
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject onmouseover = $sym71$ONMOUSEOVER;
                            return list(PWHEN, list(STRINGP, hoverover_html), list(CLET, list(list(onmouseover, list(HTML_HOVEROVER_ANCHOR_ONMOUSEOVER, hoverover_html, caption, width, sticky))), listS(HTML_FANCY_ANCHOR, listS($HREF, new SubLObject[]{ href, $NAME, name, $TARGET, target, $SCRIPT, script, $STYLE, style, $ONMOUSEOVER, onmouseover, $list_alt76 }), append(body, NIL))));
                        }
                    }
                }
            }
        }
    }

    /**
     * Wrapper around html-fancy-anchor to prevent unbounded hoverover recursion.
     */
    @LispMethod(comment = "Wrapper around html-fancy-anchor to prevent unbounded hoverover recursion.")
    public static SubLObject html_hoverover_anchor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list73);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list73);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list73);
            if (NIL == member(current_$4, $list74, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list73);
        }
        final SubLObject href_tail = property_list_member($HREF, current);
        final SubLObject href = (NIL != href_tail) ? cadr(href_tail) : NIL;
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject target_tail = property_list_member($TARGET, current);
        final SubLObject target = (NIL != target_tail) ? cadr(target_tail) : NIL;
        final SubLObject script_tail = property_list_member($SCRIPT, current);
        final SubLObject script = (NIL != script_tail) ? cadr(script_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject hoverover_html_tail = property_list_member($HOVEROVER_HTML, current);
        final SubLObject hoverover_html = (NIL != hoverover_html_tail) ? cadr(hoverover_html_tail) : NIL;
        final SubLObject caption_tail = property_list_member($CAPTION, current);
        final SubLObject caption = (NIL != caption_tail) ? cadr(caption_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
        final SubLObject sticky_tail = property_list_member($STICKY, current);
        final SubLObject sticky = (NIL != sticky_tail) ? cadr(sticky_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject onmouseover = $sym84$ONMOUSEOVER;
        return list(PWHEN, list(STRINGP, hoverover_html), list(CLET, list(list(onmouseover, list(HTML_HOVEROVER_ANCHOR_ONMOUSEOVER, hoverover_html, caption, width, sticky))), listS(HTML_FANCY_ANCHOR, listS($HREF, new SubLObject[]{ href, $NAME, name, $TARGET, target, $SCRIPT, script, $STYLE, style, $ONMOUSEOVER, onmouseover, $list89 }), append(body, NIL))));
    }

    /**
     * Compute the onMouseOver method for a hoverover link
     */
    @LispMethod(comment = "Compute the onMouseOver method for a hoverover link")
    public static final SubLObject html_hoverover_anchor_onmouseover_alt(SubLObject hoverover_html, SubLObject caption, SubLObject width, SubLObject sticky) {
        {
            SubLObject onmouseover_list = NIL;
            onmouseover_list = cons($str_alt78$return_overlib__, onmouseover_list);
            onmouseover_list = cons(com.cyc.cycjava.cycl.html_script_utilities.cb_hoverover_clean_html(hoverover_html), onmouseover_list);
            onmouseover_list = cons($str_alt55$_, onmouseover_list);
            if (caption.isString()) {
                onmouseover_list = cons(format(NIL, $str_alt79$_CAPTION___A_, com.cyc.cycjava.cycl.html_script_utilities.cb_hoverover_clean_html(caption)), onmouseover_list);
            }
            if (width.isInteger()) {
                onmouseover_list = cons(format(NIL, $str_alt80$_WIDTH__A, width), onmouseover_list);
            }
            if (NIL != sticky) {
                onmouseover_list = cons($str_alt81$_STICKY, onmouseover_list);
            }
            onmouseover_list = cons($str_alt82$_, onmouseover_list);
            return apply(symbol_function(CCONCATENATE), nreverse(onmouseover_list));
        }
    }

    /**
     * Compute the onMouseOver method for a hoverover link
     */
    @LispMethod(comment = "Compute the onMouseOver method for a hoverover link")
    public static SubLObject html_hoverover_anchor_onmouseover(final SubLObject hoverover_html, final SubLObject caption, final SubLObject width, final SubLObject sticky) {
        SubLObject onmouseover_list = NIL;
        onmouseover_list = cons($str91$return_overlib__, onmouseover_list);
        onmouseover_list = cons(cb_hoverover_clean_html(hoverover_html), onmouseover_list);
        onmouseover_list = cons($str69$_, onmouseover_list);
        if (caption.isString()) {
            onmouseover_list = cons(format(NIL, $str92$_CAPTION___A_, cb_hoverover_clean_html(caption)), onmouseover_list);
        }
        if (width.isInteger()) {
            onmouseover_list = cons(format(NIL, $str93$_WIDTH__A, width), onmouseover_list);
        }
        if (NIL != sticky) {
            onmouseover_list = cons($str94$_STICKY, onmouseover_list);
        }
        onmouseover_list = cons($str95$_, onmouseover_list);
        return apply(symbol_function(CCONCATENATE), nreverse(onmouseover_list));
    }

    /**
     *
     *
     * @param template
    STRINGP
     * 		
     * @param substitutions
     * 		LISTP of pattern replacement tuples,
     * 		both of which are STRINGP
     * @return STRINGP
    Substitute all occurrences of the pattern in the template with the
    replacement, in order of definition, and return the result.
     */
    @LispMethod(comment = "@param template\nSTRINGP\r\n\t\t\r\n@param substitutions\r\n\t\tLISTP of pattern replacement tuples,\r\n\t\tboth of which are STRINGP\r\n@return STRINGP\r\nSubstitute all occurrences of the pattern in the template with the\r\nreplacement, in order of definition, and return the result.")
    public static final SubLObject instantiate_javascript_template_alt(SubLObject template, SubLObject substitutions) {
        {
            SubLObject cdolist_list_var = substitutions;
            SubLObject substitution = NIL;
            for (substitution = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , substitution = cdolist_list_var.first()) {
                {
                    SubLObject datum = substitution;
                    SubLObject current = datum;
                    SubLObject pattern = NIL;
                    SubLObject replacement = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt84);
                    pattern = current.first();
                    current = current.rest();
                    replacement = current;
                    if (replacement.isList()) {
                        replacement = replacement.first();
                    }
                    template = com.cyc.cycjava.cycl.html_script_utilities.edit_javascript_template(template, pattern, replacement);
                }
            }
        }
        return template;
    }

    /**
     *
     *
     * @param template
    STRINGP
     * 		
     * @param substitutions
     * 		LISTP of pattern replacement tuples,
     * 		both of which are STRINGP
     * @return STRINGP
    Substitute all occurrences of the pattern in the template with the
    replacement, in order of definition, and return the result.
     */
    @LispMethod(comment = "@param template\nSTRINGP\r\n\t\t\r\n@param substitutions\r\n\t\tLISTP of pattern replacement tuples,\r\n\t\tboth of which are STRINGP\r\n@return STRINGP\r\nSubstitute all occurrences of the pattern in the template with the\r\nreplacement, in order of definition, and return the result.")
    public static SubLObject instantiate_javascript_template(SubLObject template, final SubLObject substitutions) {
        SubLObject cdolist_list_var = substitutions;
        SubLObject substitution = NIL;
        substitution = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = substitution;
            SubLObject pattern = NIL;
            SubLObject replacement = NIL;
            destructuring_bind_must_consp(current, datum, $list97);
            pattern = current.first();
            current = replacement = current.rest();
            if (replacement.isList()) {
                replacement = replacement.first();
            }
            template = edit_javascript_template(template, pattern, replacement);
            cdolist_list_var = cdolist_list_var.rest();
            substitution = cdolist_list_var.first();
        } 
        return template;
    }

    /**
     *
     *
     * @param template
    STRINGP
     * 		
     * @param pattern
    STRINGP
     * 		
     * @param replacement
     * 		STRINGP
     * 		Substitute destructively all occurrences of pattern in template
     * 		with replacement.
     */
    @LispMethod(comment = "@param template\nSTRINGP\r\n\t\t\r\n@param pattern\nSTRINGP\r\n\t\t\r\n@param replacement\r\n\t\tSTRINGP\r\n\t\tSubstitute destructively all occurrences of pattern in template\r\n\t\twith replacement.")
    public static final SubLObject edit_javascript_template_alt(SubLObject template, SubLObject pattern, SubLObject replacement) {
        return string_utilities.string_substitute(replacement, pattern, template, UNPROVIDED);
    }

    /**
     *
     *
     * @param template
    STRINGP
     * 		
     * @param pattern
    STRINGP
     * 		
     * @param replacement
     * 		STRINGP
     * 		Substitute destructively all occurrences of pattern in template
     * 		with replacement.
     */
    @LispMethod(comment = "@param template\nSTRINGP\r\n\t\t\r\n@param pattern\nSTRINGP\r\n\t\t\r\n@param replacement\r\n\t\tSTRINGP\r\n\t\tSubstitute destructively all occurrences of pattern in template\r\n\t\twith replacement.")
    public static SubLObject edit_javascript_template(final SubLObject template, final SubLObject pattern, final SubLObject replacement) {
        return string_utilities.string_substitute(replacement, pattern, template, UNPROVIDED);
    }

    /**
     * Note the fact that the JavaScript event handler for this DOM-id
     * needs to be remapped to something else.
     */
    @LispMethod(comment = "Note the fact that the JavaScript event handler for this DOM-id\r\nneeds to be remapped to something else.\nNote the fact that the JavaScript event handler for this DOM-id\nneeds to be remapped to something else.")
    public static final SubLObject javascript_note_event_remapping_alt(SubLObject id, SubLObject event, SubLObject function_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == html_macros.is_known_dom_event_handlerP(event)) {
                Errors.warn($str_alt85$Odd_event_handler__S____is_this_a, event);
            }
            {
                SubLObject event_name = NIL;
                if (event.isSymbol()) {
                    event_name = Strings.string_downcase(symbol_name(event), UNPROVIDED, UNPROVIDED);
                } else {
                    event_name = Strings.string_downcase(string_utilities.to_string(event_name), UNPROVIDED, UNPROVIDED);
                }
                $javascript_event_remapping_assignments$.setDynamicValue(cons(list(id, event_name, function_name), $javascript_event_remapping_assignments$.getDynamicValue(thread)), thread);
            }
            return id;
        }
    }

    /**
     * Note the fact that the JavaScript event handler for this DOM-id
     * needs to be remapped to something else.
     */
    @LispMethod(comment = "Note the fact that the JavaScript event handler for this DOM-id\r\nneeds to be remapped to something else.\nNote the fact that the JavaScript event handler for this DOM-id\nneeds to be remapped to something else.")
    public static SubLObject javascript_note_event_remapping(final SubLObject id, final SubLObject event, final SubLObject function_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == html_macros.is_known_dom_event_handlerP(event)) {
            Errors.warn($str98$Odd_event_handler__S____is_this_a, event);
        }
        SubLObject event_name = NIL;
        if (event.isSymbol()) {
            event_name = Strings.string_downcase(symbol_name(event), UNPROVIDED, UNPROVIDED);
        } else {
            event_name = Strings.string_downcase(string_utilities.to_string(event_name), UNPROVIDED, UNPROVIDED);
        }
        $javascript_event_remapping_assignments$.setDynamicValue(cons(list(id, event_name, function_name), $javascript_event_remapping_assignments$.getDynamicValue(thread)), thread);
        return id;
    }

    public static final SubLObject generate_javascript_event_remapping_assignments_alt(SubLObject assignments) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject cdolist_list_var = assignments;
                        SubLObject remapping = NIL;
                        for (remapping = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , remapping = cdolist_list_var.first()) {
                            {
                                SubLObject datum = remapping;
                                SubLObject current = datum;
                                SubLObject id = NIL;
                                SubLObject event_name = NIL;
                                SubLObject function_name = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt86);
                                id = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt86);
                                event_name = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt86);
                                function_name = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt87$__document_getElementById___A____, new SubLObject[]{ id, event_name, function_name });
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt86);
                                }
                            }
                        }
                        html_source_readability_terpri(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_script_tail$.getGlobalValue());
            return assignments;
        }
    }

    public static SubLObject generate_javascript_event_remapping_assignments(final SubLObject assignments) {
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
            SubLObject cdolist_list_var = assignments;
            SubLObject remapping = NIL;
            remapping = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = remapping;
                SubLObject id = NIL;
                SubLObject event_name = NIL;
                SubLObject function_name = NIL;
                destructuring_bind_must_consp(current, datum, $list99);
                id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list99);
                event_name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list99);
                function_name = current.first();
                current = current.rest();
                if (NIL == current) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str100$__document_getElementById___A____, new SubLObject[]{ id, event_name, function_name });
                } else {
                    cdestructuring_bind_error(datum, $list99);
                }
                cdolist_list_var = cdolist_list_var.rest();
                remapping = cdolist_list_var.first();
            } 
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return assignments;
    }

    public static final SubLObject with_javascript_event_remapping_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt88, append(body, $list_alt89));
        }
    }

    public static SubLObject with_javascript_event_remapping(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list101, append(body, $list102));
    }

    public static final SubLObject html_set_all_radio_buttons_script_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $set_all_radio_buttons_script$.getDynamicValue(thread));
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_script_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject html_set_all_radio_buttons_script() {
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
            format(html_macros.$html_stream$.getDynamicValue(thread), $set_all_radio_buttons_script$.getDynamicValue(thread));
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    /**
     *
     *
     * @param LABEL
    stringp
     * 		
     * @param FORM
     * 		stringp ;; the JS form object that contains the radio buttons
     * @param NAME-PATTERN
     * 		stringp ;; a regular expression describing the names of the radio buttons in the set
     * @param VALUE
     * 		stringp ;; the value that each radio button should be set to.
     */
    @LispMethod(comment = "@param LABEL\nstringp\r\n\t\t\r\n@param FORM\r\n\t\tstringp ;; the JS form object that contains the radio buttons\r\n@param NAME-PATTERN\r\n\t\tstringp ;; a regular expression describing the names of the radio buttons in the set\r\n@param VALUE\r\n\t\tstringp ;; the value that each radio button should be set to.")
    public static final SubLObject html_anchor_set_radio_buttons_to_value_alt(SubLObject label, SubLObject form, SubLObject name_pattern, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject href = format(NIL, $str_alt91$javascript__void_set_all_radio_bu, new SubLObject[]{ form, name_pattern, value });
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(href);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(label);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param LABEL
    stringp
     * 		
     * @param FORM
     * 		stringp ;; the JS form object that contains the radio buttons
     * @param NAME-PATTERN
     * 		stringp ;; a regular expression describing the names of the radio buttons in the set
     * @param VALUE
     * 		stringp ;; the value that each radio button should be set to.
     */
    @LispMethod(comment = "@param LABEL\nstringp\r\n\t\t\r\n@param FORM\r\n\t\tstringp ;; the JS form object that contains the radio buttons\r\n@param NAME-PATTERN\r\n\t\tstringp ;; a regular expression describing the names of the radio buttons in the set\r\n@param VALUE\r\n\t\tstringp ;; the value that each radio button should be set to.")
    public static SubLObject html_anchor_set_radio_buttons_to_value(final SubLObject label, final SubLObject form, final SubLObject name_pattern, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject href = format(NIL, $str104$javascript__void_set_all_radio_bu, new SubLObject[]{ form, name_pattern, value });
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(href);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(label);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject html_js_focus_window_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str_alt92$window_focus__);
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_script_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject html_js_focus_window() {
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
            html_princ($str105$window_focus__);
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject html_kill_window_button_alt(SubLObject label, SubLObject name) {
        if (label == UNPROVIDED) {
            label = $$$Close_Window;
        }
        if (name == UNPROVIDED) {
            name = $CLOSE_WINDOW;
        }
        html_submit_input(label, name, $str_alt95$onClick_javascript_self_close__);
        return NIL;
    }

    public static SubLObject html_kill_window_button(SubLObject label, SubLObject name) {
        if (label == UNPROVIDED) {
            label = $$$Close_Window;
        }
        if (name == UNPROVIDED) {
            name = $CLOSE_WINDOW;
        }
        html_submit_input(label, name, $str108$onClick_javascript_self_close__);
        return NIL;
    }

    public static SubLObject html_popup_script() {
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
            format(html_macros.$html_stream$.getDynamicValue(thread), $html_popup_script$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject html_popup_onclick(SubLObject window_name, SubLObject width, SubLObject height, SubLObject top_offset, SubLObject left_offset, SubLObject scrollbarsP) {
        if (window_name == UNPROVIDED) {
            window_name = $$$popup;
        }
        if (width == UNPROVIDED) {
            width = $int$500;
        }
        if (height == UNPROVIDED) {
            height = $int$300;
        }
        if (top_offset == UNPROVIDED) {
            top_offset = $int$100;
        }
        if (left_offset == UNPROVIDED) {
            left_offset = $int$300;
        }
        if (scrollbarsP == UNPROVIDED) {
            scrollbarsP = NIL;
        }
        return cconcatenate($str114$positionedPopup_this_href___, new SubLObject[]{ format_nil.format_nil_a_no_copy(window_name), $str115$____, format_nil.format_nil_a_no_copy(width), $str115$____, format_nil.format_nil_a_no_copy(height), $str115$____, format_nil.format_nil_a_no_copy(top_offset), $str115$____, format_nil.format_nil_a_no_copy(left_offset), $str115$____, format_nil.format_nil_a_no_copy(NIL != scrollbarsP ? $$$yes : $$$no), $str118$____return_false_ });
    }

    public static SubLObject html_popup_button_onclick(final SubLObject href, SubLObject window_name, SubLObject width, SubLObject height, SubLObject top_offset, SubLObject left_offset, SubLObject scrollbarsP) {
        if (window_name == UNPROVIDED) {
            window_name = $$$popup;
        }
        if (width == UNPROVIDED) {
            width = $int$500;
        }
        if (height == UNPROVIDED) {
            height = $int$300;
        }
        if (top_offset == UNPROVIDED) {
            top_offset = $int$100;
        }
        if (left_offset == UNPROVIDED) {
            left_offset = $int$300;
        }
        if (scrollbarsP == UNPROVIDED) {
            scrollbarsP = NIL;
        }
        return cconcatenate($str119$positionedPopup__, new SubLObject[]{ format_nil.format_nil_a_no_copy(href), $str115$____, format_nil.format_nil_a_no_copy(window_name), $str115$____, format_nil.format_nil_a_no_copy(width), $str115$____, format_nil.format_nil_a_no_copy(height), $str115$____, format_nil.format_nil_a_no_copy(top_offset), $str115$____, format_nil.format_nil_a_no_copy(left_offset), $str115$____, format_nil.format_nil_a_no_copy(NIL != scrollbarsP ? $$$yes : $$$no), $str118$____return_false_ });
    }

    public static SubLObject html_sentence_editor_enable_editors() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cb_form_widgets.$cb_use_codemirror_sentence_editorP$.getDynamicValue(thread)) {
            cyc_file_dependencies.web_bundle($HTML_EDITOR_SCRIPTS);
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
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_script_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject html_ke_text_editor_enable_editors() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cb_form_widgets.$cb_use_ke_text_editorP$.getDynamicValue(thread)) {
            cyc_file_dependencies.web_bundle($HTML_EDITOR_SCRIPTS);
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
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_script_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject declare_html_script_utilities_file_alt() {
        declareFunction("html_simple_script_button", "HTML-SIMPLE-SCRIPT-BUTTON", 2, 2, false);
        declareFunction("html_simple_script_anchor", "HTML-SIMPLE-SCRIPT-ANCHOR", 2, 2, false);
        declareFunction("cb_back", "CB-BACK", 0, 1, false);
        declareFunction("html_dismiss_button", "HTML-DISMISS-BUTTON", 0, 1, false);
        declareFunction("html_dismiss_link", "HTML-DISMISS-LINK", 0, 1, false);
        declareFunction("html_back_button", "HTML-BACK-BUTTON", 0, 1, false);
        declareFunction("html_refresh_button", "HTML-REFRESH-BUTTON", 0, 1, false);
        declareFunction("html_refresh_link", "HTML-REFRESH-LINK", 0, 1, false);
        declareFunction("html_refresh_frame_script", "HTML-REFRESH-FRAME-SCRIPT", 1, 0, false);
        declareFunction("html_clear_input_button", "HTML-CLEAR-INPUT-BUTTON", 1, 1, false);
        declareFunction("html_insert_input_button", "HTML-INSERT-INPUT-BUTTON", 2, 1, false);
        declareFunction("html_completing_input_button", "HTML-COMPLETING-INPUT-BUTTON", 2, 1, false);
        declareFunction("html_clear_radio_input", "HTML-CLEAR-RADIO-INPUT", 2, 2, false);
        declareFunction("html_focus_radio_input", "HTML-FOCUS-RADIO-INPUT", 2, 2, false);
        declareFunction("html_auto_select_radio_button_script", "HTML-AUTO-SELECT-RADIO-BUTTON-SCRIPT", 2, 0, false);
        declareFunction("html_back_onload_script", "HTML-BACK-ONLOAD-SCRIPT", 0, 1, false);
        declareFunction("html_multi_submit_input", "HTML-MULTI-SUBMIT-INPUT", 1, 6, false);
        declareFunction("html_text_input_reset_multi_submit", "HTML-TEXT-INPUT-RESET-MULTI-SUBMIT", 1, 6, false);
        declareFunction("html_set_multi_submit_form_info", "HTML-SET-MULTI-SUBMIT-FORM-INFO", 4, 0, false);
        declareFunction("javascript_comment", "JAVASCRIPT-COMMENT", 0, 2, false);
        declareFunction("javascript_comment_line", "JAVASCRIPT-COMMENT-LINE", 0, 2, false);
        declareFunction("simple_javascript", "SIMPLE-JAVASCRIPT", 0, 2, false);
        declareFunction("javascript_function", "JAVASCRIPT-FUNCTION", 2, 5, false);
        declareFunction("cb_hoverover_page_init", "CB-HOVEROVER-PAGE-INIT", 0, 0, false);
        declareFunction("cb_hoverover_clean_html", "CB-HOVEROVER-CLEAN-HTML", 1, 0, false);
        declareFunction("cb_hoverover_recursion_disallowedP", "CB-HOVEROVER-RECURSION-DISALLOWED?", 0, 0, false);
        declareMacro("with_cb_hoverover_recursion_protection", "WITH-CB-HOVEROVER-RECURSION-PROTECTION");
        declareMacro("html_hoverover_anchor", "HTML-HOVEROVER-ANCHOR");
        declareFunction("html_hoverover_anchor_onmouseover", "HTML-HOVEROVER-ANCHOR-ONMOUSEOVER", 4, 0, false);
        declareFunction("instantiate_javascript_template", "INSTANTIATE-JAVASCRIPT-TEMPLATE", 2, 0, false);
        declareFunction("edit_javascript_template", "EDIT-JAVASCRIPT-TEMPLATE", 3, 0, false);
        declareFunction("javascript_note_event_remapping", "JAVASCRIPT-NOTE-EVENT-REMAPPING", 3, 0, false);
        declareFunction("generate_javascript_event_remapping_assignments", "GENERATE-JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS", 1, 0, false);
        declareMacro("with_javascript_event_remapping", "WITH-JAVASCRIPT-EVENT-REMAPPING");
        declareFunction("html_set_all_radio_buttons_script", "HTML-SET-ALL-RADIO-BUTTONS-SCRIPT", 0, 0, false);
        declareFunction("html_anchor_set_radio_buttons_to_value", "HTML-ANCHOR-SET-RADIO-BUTTONS-TO-VALUE", 4, 0, false);
        declareFunction("html_js_focus_window", "HTML-JS-FOCUS-WINDOW", 0, 0, false);
        declareFunction("html_kill_window_button", "HTML-KILL-WINDOW-BUTTON", 0, 2, false);
        declareFunction("html_simple_applet_input_initialization", "HTML-SIMPLE-APPLET-INPUT-INITIALIZATION", 1, 1, false);
        declareFunction("html_simple_applet_input_definition_script", "HTML-SIMPLE-APPLET-INPUT-DEFINITION-SCRIPT", 0, 0, false);
        declareFunction("html_simple_applet_input_onsubmit_script", "HTML-SIMPLE-APPLET-INPUT-ONSUBMIT-SCRIPT", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_html_script_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("html_simple_script_button", "HTML-SIMPLE-SCRIPT-BUTTON", 2, 2, false);
            declareMacro("html_fancy_script_button", "HTML-FANCY-SCRIPT-BUTTON");
            declareFunction("html_simple_script_anchor", "HTML-SIMPLE-SCRIPT-ANCHOR", 2, 2, false);
            declareFunction("cb_back", "CB-BACK", 0, 1, false);
            declareFunction("html_dismiss_button", "HTML-DISMISS-BUTTON", 0, 1, false);
            declareFunction("html_dismiss_link", "HTML-DISMISS-LINK", 0, 1, false);
            declareFunction("html_back_button", "HTML-BACK-BUTTON", 0, 1, false);
            declareFunction("html_refresh_button", "HTML-REFRESH-BUTTON", 0, 1, false);
            declareFunction("html_refresh_link", "HTML-REFRESH-LINK", 0, 1, false);
            declareFunction("html_refresh_frame_script", "HTML-REFRESH-FRAME-SCRIPT", 1, 0, false);
            declareFunction("html_clear_input_button", "HTML-CLEAR-INPUT-BUTTON", 1, 2, false);
            declareFunction("html_insert_input_button", "HTML-INSERT-INPUT-BUTTON", 2, 1, false);
            declareFunction("html_completing_input_button", "HTML-COMPLETING-INPUT-BUTTON", 2, 1, false);
            declareFunction("html_clear_radio_input", "HTML-CLEAR-RADIO-INPUT", 2, 3, false);
            declareFunction("html_focus_radio_input", "HTML-FOCUS-RADIO-INPUT", 2, 3, false);
            declareFunction("html_auto_select_radio_button_script", "HTML-AUTO-SELECT-RADIO-BUTTON-SCRIPT", 2, 0, false);
            declareFunction("html_back_onload_script", "HTML-BACK-ONLOAD-SCRIPT", 0, 1, false);
            declareFunction("html_multi_submit_input", "HTML-MULTI-SUBMIT-INPUT", 1, 6, false);
            declareFunction("html_text_input_reset_multi_submit", "HTML-TEXT-INPUT-RESET-MULTI-SUBMIT", 1, 6, false);
            declareFunction("html_set_multi_submit_form_info", "HTML-SET-MULTI-SUBMIT-FORM-INFO", 4, 0, false);
            declareFunction("javascript_comment", "JAVASCRIPT-COMMENT", 0, 2, false);
            declareFunction("javascript_comment_line", "JAVASCRIPT-COMMENT-LINE", 0, 2, false);
            declareFunction("simple_javascript", "SIMPLE-JAVASCRIPT", 0, 2, false);
            declareFunction("javascript_function", "JAVASCRIPT-FUNCTION", 2, 5, false);
            declareFunction("cb_hoverover_page_init", "CB-HOVEROVER-PAGE-INIT", 0, 0, false);
            declareFunction("cb_hoverover_clean_html", "CB-HOVEROVER-CLEAN-HTML", 1, 0, false);
            declareFunction("cb_hoverover_recursion_disallowedP", "CB-HOVEROVER-RECURSION-DISALLOWED?", 0, 0, false);
            declareMacro("with_cb_hoverover_recursion_protection", "WITH-CB-HOVEROVER-RECURSION-PROTECTION");
            declareMacro("html_hoverover_anchor", "HTML-HOVEROVER-ANCHOR");
            declareFunction("html_hoverover_anchor_onmouseover", "HTML-HOVEROVER-ANCHOR-ONMOUSEOVER", 4, 0, false);
            declareFunction("instantiate_javascript_template", "INSTANTIATE-JAVASCRIPT-TEMPLATE", 2, 0, false);
            declareFunction("edit_javascript_template", "EDIT-JAVASCRIPT-TEMPLATE", 3, 0, false);
            declareFunction("javascript_note_event_remapping", "JAVASCRIPT-NOTE-EVENT-REMAPPING", 3, 0, false);
            declareFunction("generate_javascript_event_remapping_assignments", "GENERATE-JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS", 1, 0, false);
            declareMacro("with_javascript_event_remapping", "WITH-JAVASCRIPT-EVENT-REMAPPING");
            declareFunction("html_set_all_radio_buttons_script", "HTML-SET-ALL-RADIO-BUTTONS-SCRIPT", 0, 0, false);
            declareFunction("html_anchor_set_radio_buttons_to_value", "HTML-ANCHOR-SET-RADIO-BUTTONS-TO-VALUE", 4, 0, false);
            declareFunction("html_js_focus_window", "HTML-JS-FOCUS-WINDOW", 0, 0, false);
            declareFunction("html_kill_window_button", "HTML-KILL-WINDOW-BUTTON", 0, 2, false);
            declareFunction("html_popup_script", "HTML-POPUP-SCRIPT", 0, 0, false);
            declareFunction("html_popup_onclick", "HTML-POPUP-ONCLICK", 0, 6, false);
            declareFunction("html_popup_button_onclick", "HTML-POPUP-BUTTON-ONCLICK", 1, 6, false);
            declareFunction("html_sentence_editor_enable_editors", "HTML-SENTENCE-EDITOR-ENABLE-EDITORS", 0, 0, false);
            declareFunction("html_ke_text_editor_enable_editors", "HTML-KE-TEXT-EDITOR-ENABLE-EDITORS", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("html_clear_input_button", "HTML-CLEAR-INPUT-BUTTON", 1, 1, false);
            declareFunction("html_clear_radio_input", "HTML-CLEAR-RADIO-INPUT", 2, 2, false);
            declareFunction("html_focus_radio_input", "HTML-FOCUS-RADIO-INPUT", 2, 2, false);
            declareFunction("html_simple_applet_input_initialization", "HTML-SIMPLE-APPLET-INPUT-INITIALIZATION", 1, 1, false);
            declareFunction("html_simple_applet_input_definition_script", "HTML-SIMPLE-APPLET-INPUT-DEFINITION-SCRIPT", 0, 0, false);
            declareFunction("html_simple_applet_input_onsubmit_script", "HTML-SIMPLE-APPLET-INPUT-ONSUBMIT-SCRIPT", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_html_script_utilities_file_Previous() {
        declareFunction("html_simple_script_button", "HTML-SIMPLE-SCRIPT-BUTTON", 2, 2, false);
        declareMacro("html_fancy_script_button", "HTML-FANCY-SCRIPT-BUTTON");
        declareFunction("html_simple_script_anchor", "HTML-SIMPLE-SCRIPT-ANCHOR", 2, 2, false);
        declareFunction("cb_back", "CB-BACK", 0, 1, false);
        declareFunction("html_dismiss_button", "HTML-DISMISS-BUTTON", 0, 1, false);
        declareFunction("html_dismiss_link", "HTML-DISMISS-LINK", 0, 1, false);
        declareFunction("html_back_button", "HTML-BACK-BUTTON", 0, 1, false);
        declareFunction("html_refresh_button", "HTML-REFRESH-BUTTON", 0, 1, false);
        declareFunction("html_refresh_link", "HTML-REFRESH-LINK", 0, 1, false);
        declareFunction("html_refresh_frame_script", "HTML-REFRESH-FRAME-SCRIPT", 1, 0, false);
        declareFunction("html_clear_input_button", "HTML-CLEAR-INPUT-BUTTON", 1, 2, false);
        declareFunction("html_insert_input_button", "HTML-INSERT-INPUT-BUTTON", 2, 1, false);
        declareFunction("html_completing_input_button", "HTML-COMPLETING-INPUT-BUTTON", 2, 1, false);
        declareFunction("html_clear_radio_input", "HTML-CLEAR-RADIO-INPUT", 2, 3, false);
        declareFunction("html_focus_radio_input", "HTML-FOCUS-RADIO-INPUT", 2, 3, false);
        declareFunction("html_auto_select_radio_button_script", "HTML-AUTO-SELECT-RADIO-BUTTON-SCRIPT", 2, 0, false);
        declareFunction("html_back_onload_script", "HTML-BACK-ONLOAD-SCRIPT", 0, 1, false);
        declareFunction("html_multi_submit_input", "HTML-MULTI-SUBMIT-INPUT", 1, 6, false);
        declareFunction("html_text_input_reset_multi_submit", "HTML-TEXT-INPUT-RESET-MULTI-SUBMIT", 1, 6, false);
        declareFunction("html_set_multi_submit_form_info", "HTML-SET-MULTI-SUBMIT-FORM-INFO", 4, 0, false);
        declareFunction("javascript_comment", "JAVASCRIPT-COMMENT", 0, 2, false);
        declareFunction("javascript_comment_line", "JAVASCRIPT-COMMENT-LINE", 0, 2, false);
        declareFunction("simple_javascript", "SIMPLE-JAVASCRIPT", 0, 2, false);
        declareFunction("javascript_function", "JAVASCRIPT-FUNCTION", 2, 5, false);
        declareFunction("cb_hoverover_page_init", "CB-HOVEROVER-PAGE-INIT", 0, 0, false);
        declareFunction("cb_hoverover_clean_html", "CB-HOVEROVER-CLEAN-HTML", 1, 0, false);
        declareFunction("cb_hoverover_recursion_disallowedP", "CB-HOVEROVER-RECURSION-DISALLOWED?", 0, 0, false);
        declareMacro("with_cb_hoverover_recursion_protection", "WITH-CB-HOVEROVER-RECURSION-PROTECTION");
        declareMacro("html_hoverover_anchor", "HTML-HOVEROVER-ANCHOR");
        declareFunction("html_hoverover_anchor_onmouseover", "HTML-HOVEROVER-ANCHOR-ONMOUSEOVER", 4, 0, false);
        declareFunction("instantiate_javascript_template", "INSTANTIATE-JAVASCRIPT-TEMPLATE", 2, 0, false);
        declareFunction("edit_javascript_template", "EDIT-JAVASCRIPT-TEMPLATE", 3, 0, false);
        declareFunction("javascript_note_event_remapping", "JAVASCRIPT-NOTE-EVENT-REMAPPING", 3, 0, false);
        declareFunction("generate_javascript_event_remapping_assignments", "GENERATE-JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS", 1, 0, false);
        declareMacro("with_javascript_event_remapping", "WITH-JAVASCRIPT-EVENT-REMAPPING");
        declareFunction("html_set_all_radio_buttons_script", "HTML-SET-ALL-RADIO-BUTTONS-SCRIPT", 0, 0, false);
        declareFunction("html_anchor_set_radio_buttons_to_value", "HTML-ANCHOR-SET-RADIO-BUTTONS-TO-VALUE", 4, 0, false);
        declareFunction("html_js_focus_window", "HTML-JS-FOCUS-WINDOW", 0, 0, false);
        declareFunction("html_kill_window_button", "HTML-KILL-WINDOW-BUTTON", 0, 2, false);
        declareFunction("html_popup_script", "HTML-POPUP-SCRIPT", 0, 0, false);
        declareFunction("html_popup_onclick", "HTML-POPUP-ONCLICK", 0, 6, false);
        declareFunction("html_popup_button_onclick", "HTML-POPUP-BUTTON-ONCLICK", 1, 6, false);
        declareFunction("html_sentence_editor_enable_editors", "HTML-SENTENCE-EDITOR-ENABLE-EDITORS", 0, 0, false);
        declareFunction("html_ke_text_editor_enable_editors", "HTML-KE-TEXT-EDITOR-ENABLE-EDITORS", 0, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeKeyword("JAVASCRIPT"));

    static private final SubLString $str_alt4$cb_back = makeString("cb-back");

    static private final SubLString $str_alt6$onClick__top_close____ = makeString("onClick=\"top.close();\"");

    static private final SubLString $str_alt8$onClick__top_close____return_fals = makeString("onClick=\"top.close(); return false;\"");

    static private final SubLString $str_alt9$onClick__self_history_back____ = makeString("onClick=\"self.history.back();\"");

    static private final SubLString $str_alt11$onClick__self_location___self_doc = makeString("onClick=\"self.location = self.document.location;\"");

    static private final SubLString $str_alt13$onClick__self_location___self_doc = makeString("onClick=\"self.location = self.document.location; return false;\"");

    static private final SubLString $str_alt14$_for__var_i___0__i___top_frames_l = makeString("\nfor (var i = 0; i < top.frames.length; i++) {\n  var frame = top.frames[i];\n  if (frame.name == \'~A\') {\n    frame.location = frame.document.location;\n    break;\n  }\n}");

    public static final SubLObject init_html_script_utilities_file_alt() {
        defparameter("*CB-SCRIPT-LANGUAGES*", $list_alt0);
        defparameter("*CB-SCRIPT-MODE*", $JAVASCRIPT);
        defparameter("*HTML-DISMISS-BUTTON-SCRIPT*", $str_alt6$onClick__top_close____);
        defparameter("*HTML-DISMISS-LINK-SCRIPT*", $str_alt8$onClick__top_close____return_fals);
        defparameter("*HTML-BACK-BUTTON-SCRIPT*", $str_alt9$onClick__self_history_back____);
        defparameter("*HTML-REFRESH-BUTTON-SCRIPT*", $str_alt11$onClick__self_location___self_doc);
        defparameter("*HTML-REFRESH-LINK-SCRIPT*", $str_alt13$onClick__self_location___self_doc);
        defparameter("*HTML-REFRESH-FRAME-SCRIPT*", $str_alt14$_for__var_i___0__i___top_frames_l);
        defparameter("*HTML-CLEAR-INPUT-BUTTON-SCRIPT*", $str_alt15$onClick__with__this_form_elements);
        deflexical("*HTML-INSERT-INPUT-BUTTON-SCRIPT*", $str_alt17$onClick__with__this_form_elements);
        deflexical("*HTML-COMPLETING-INPUT-BUTTON-SCRIPT*", $str_alt19$onClick__with__this_form_elements);
        defparameter("*HTML-CLEAR-RADIO-INPUT-SCRIPT*", $str_alt21$onClick__with__this_form_elements);
        defparameter("*HTML-FOCUS-RADIO-INPUT-SCRIPT*", $str_alt22$onClick__with__this_form_elements);
        deflexical("*HTML-AUTO-SELECT-RADIO-BUTTON-SCRIPT*", NIL != boundp($html_auto_select_radio_button_script$) ? ((SubLObject) ($html_auto_select_radio_button_script$.getGlobalValue())) : $str_alt24$onkeypress__this_form__A__A__chec);
        defparameter("*HTML-BACK-ONLOAD-SCRIPT*", $str_alt25$onLoad__setTimeout__self_history_);
        defparameter("*HTML-MULTI-SUBMIT-SCRIPT-PREAMBLE*", $str_alt28$_onClick__);
        defparameter("*HTML-MULTI-SUBMIT-SCRIPT-POSTAMBLE*", $str_alt29$_this_form_submit____);
        defparameter("*HTML-TEXT-INPUT-RESET-MULTI-SUBMIT-PREAMBLE*", $str_alt30$_onFocus__);
        defparameter("*HTML-TEXT-INPUT-RESET-MULTI-SUBMIT-POSTAMBLE*", $str_alt31$_);
        defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-FIRST-NAME*", $str_alt35$_this_form_elements_0__name_____A);
        defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-ACTION*", $str_alt36$_this_form_action_____A__);
        defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-METHOD*", $str_alt37$_this_form_method_____A__);
        defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-TARGET*", $str_alt38$_this_form_target_____A__);
        defparameter("*JAVASCRIPT-START*", $str_alt39$_script_language__javascript__);
        defparameter("*JAVASCRIPT-END*", $str_alt40$__script_);
        defparameter("*JAVASCRIPT-LINE-COMMENT*", $str_alt41$__);
        defparameter("*JAVASCRIPT-COMMENT-BEGIN*", $str_alt42$__);
        defparameter("*JAVASCRIPT-COMMENT-END*", $str_alt43$__);
        defparameter("*CB-HOVEROVER-ENABLED*", T);
        defparameter("*CB-HOVEROVER-SCRIPT*", $str_alt50$_javascript_overlib_js);
        defparameter("*CB-HOVEROVER-RECURSION-LIMIT*", ZERO_INTEGER);
        defparameter("*JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS*", NIL);
        defparameter("*SET-ALL-RADIO-BUTTONS-SCRIPT*", $str_alt90$__function_set_all_radio_buttons_);
        deflexical("*SIMPLE-APPLET-INPUT-JS*", $str_alt96$_function_load_simple_applet_para);
        deflexical("*GKE-APPLET-NAME*", $str_alt107$GKE_APPLET);
        deflexical("*DEFAULT-SENTENCE-INPUT-SIMPLE-APPLETS*", list($gke_applet_name$.getGlobalValue()));
        return NIL;
    }

    public static SubLObject init_html_script_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*CB-SCRIPT-LANGUAGES*", $list0);
            defparameter("*CB-SCRIPT-MODE*", $JAVASCRIPT);
            defparameter("*HTML-DISMISS-BUTTON-SCRIPT*", $str21$onClick__top_close____);
            defparameter("*HTML-DISMISS-LINK-SCRIPT*", $str23$onClick__top_close____return_fals);
            defparameter("*HTML-BACK-BUTTON-SCRIPT*", $str24$onClick__self_history_back____);
            defparameter("*HTML-REFRESH-BUTTON-SCRIPT*", $str26$onClick__self_location___self_doc);
            defparameter("*HTML-REFRESH-LINK-SCRIPT*", $str28$onClick__self_location___self_doc);
            defparameter("*HTML-REFRESH-FRAME-SCRIPT*", $str29$_for__var_i___0__i___top_frames_l);
            defparameter("*HTML-CLEAR-INPUT-BUTTON-SCRIPT*", $str30$onClick__with__this_form_elements);
            deflexical("*HTML-INSERT-INPUT-BUTTON-SCRIPT*", $str32$onClick__with__this_form_elements);
            deflexical("*HTML-COMPLETING-INPUT-BUTTON-SCRIPT*", $str34$onClick__with__this_form_elements);
            defparameter("*HTML-CLEAR-RADIO-INPUT-SCRIPT*", $str36$onClick__with__this_form_elements);
            defparameter("*HTML-FOCUS-RADIO-INPUT-SCRIPT*", $str37$onClick__with__this_form_elements);
            deflexical("*HTML-AUTO-SELECT-RADIO-BUTTON-SCRIPT*", SubLTrampolineFile.maybeDefault($html_auto_select_radio_button_script$, $html_auto_select_radio_button_script$, $str39$onkeypress__this_form__A__A__chec));
            defparameter("*HTML-BACK-ONLOAD-SCRIPT*", $str40$onLoad__setTimeout__self_history_);
            defparameter("*HTML-MULTI-SUBMIT-SCRIPT-PREAMBLE*", $str43$_onClick__);
            defparameter("*HTML-MULTI-SUBMIT-SCRIPT-POSTAMBLE*", $str44$_this_form_submit____);
            defparameter("*HTML-TEXT-INPUT-RESET-MULTI-SUBMIT-PREAMBLE*", $str45$_onFocus__);
            defparameter("*HTML-TEXT-INPUT-RESET-MULTI-SUBMIT-POSTAMBLE*", $str46$_);
            defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-FIRST-NAME*", $str50$_this_form_elements_0__name_____A);
            defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-ACTION*", $str51$_this_form_action_____A__);
            defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-METHOD*", $str52$_this_form_method_____A__);
            defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-TARGET*", $str53$_this_form_target_____A__);
            defparameter("*JAVASCRIPT-START*", $str54$_script_language__javascript__);
            defparameter("*JAVASCRIPT-END*", $str55$__script_);
            defparameter("*JAVASCRIPT-LINE-COMMENT*", $str56$__);
            defparameter("*JAVASCRIPT-COMMENT-BEGIN*", $str57$__);
            defparameter("*JAVASCRIPT-COMMENT-END*", $str58$__);
            defparameter("*CB-HOVEROVER-ENABLED*", T);
            defparameter("*CB-HOVEROVER-RECURSION-LIMIT*", ZERO_INTEGER);
            defparameter("*JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS*", NIL);
            defparameter("*SET-ALL-RADIO-BUTTONS-SCRIPT*", $str103$__function_set_all_radio_buttons_);
            deflexical("*HTML-POPUP-SCRIPT*", $str109$function_positionedPopup_url_winN);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*HTML-DISMISS-BUTTON-SCRIPT*", $str_alt6$onClick__top_close____);
            defparameter("*HTML-DISMISS-LINK-SCRIPT*", $str_alt8$onClick__top_close____return_fals);
            defparameter("*HTML-BACK-BUTTON-SCRIPT*", $str_alt9$onClick__self_history_back____);
            defparameter("*HTML-REFRESH-BUTTON-SCRIPT*", $str_alt11$onClick__self_location___self_doc);
            defparameter("*HTML-REFRESH-LINK-SCRIPT*", $str_alt13$onClick__self_location___self_doc);
            defparameter("*HTML-REFRESH-FRAME-SCRIPT*", $str_alt14$_for__var_i___0__i___top_frames_l);
            defparameter("*HTML-CLEAR-INPUT-BUTTON-SCRIPT*", $str_alt15$onClick__with__this_form_elements);
            deflexical("*HTML-INSERT-INPUT-BUTTON-SCRIPT*", $str_alt17$onClick__with__this_form_elements);
            deflexical("*HTML-COMPLETING-INPUT-BUTTON-SCRIPT*", $str_alt19$onClick__with__this_form_elements);
            defparameter("*HTML-CLEAR-RADIO-INPUT-SCRIPT*", $str_alt21$onClick__with__this_form_elements);
            defparameter("*HTML-FOCUS-RADIO-INPUT-SCRIPT*", $str_alt22$onClick__with__this_form_elements);
            deflexical("*HTML-AUTO-SELECT-RADIO-BUTTON-SCRIPT*", NIL != boundp($html_auto_select_radio_button_script$) ? ((SubLObject) ($html_auto_select_radio_button_script$.getGlobalValue())) : $str_alt24$onkeypress__this_form__A__A__chec);
            defparameter("*HTML-BACK-ONLOAD-SCRIPT*", $str_alt25$onLoad__setTimeout__self_history_);
            defparameter("*HTML-MULTI-SUBMIT-SCRIPT-PREAMBLE*", $str_alt28$_onClick__);
            defparameter("*HTML-MULTI-SUBMIT-SCRIPT-POSTAMBLE*", $str_alt29$_this_form_submit____);
            defparameter("*HTML-TEXT-INPUT-RESET-MULTI-SUBMIT-PREAMBLE*", $str_alt30$_onFocus__);
            defparameter("*HTML-TEXT-INPUT-RESET-MULTI-SUBMIT-POSTAMBLE*", $str_alt31$_);
            defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-FIRST-NAME*", $str_alt35$_this_form_elements_0__name_____A);
            defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-ACTION*", $str_alt36$_this_form_action_____A__);
            defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-METHOD*", $str_alt37$_this_form_method_____A__);
            defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-TARGET*", $str_alt38$_this_form_target_____A__);
            defparameter("*JAVASCRIPT-START*", $str_alt39$_script_language__javascript__);
            defparameter("*JAVASCRIPT-END*", $str_alt40$__script_);
            defparameter("*JAVASCRIPT-LINE-COMMENT*", $str_alt41$__);
            defparameter("*JAVASCRIPT-COMMENT-BEGIN*", $str_alt42$__);
            defparameter("*JAVASCRIPT-COMMENT-END*", $str_alt43$__);
            defparameter("*CB-HOVEROVER-SCRIPT*", $str_alt50$_javascript_overlib_js);
            defparameter("*SET-ALL-RADIO-BUTTONS-SCRIPT*", $str_alt90$__function_set_all_radio_buttons_);
            deflexical("*SIMPLE-APPLET-INPUT-JS*", $str_alt96$_function_load_simple_applet_para);
            deflexical("*GKE-APPLET-NAME*", $str_alt107$GKE_APPLET);
            deflexical("*DEFAULT-SENTENCE-INPUT-SIMPLE-APPLETS*", list($gke_applet_name$.getGlobalValue()));
        }
        return NIL;
    }

    public static SubLObject init_html_script_utilities_file_Previous() {
        defparameter("*CB-SCRIPT-LANGUAGES*", $list0);
        defparameter("*CB-SCRIPT-MODE*", $JAVASCRIPT);
        defparameter("*HTML-DISMISS-BUTTON-SCRIPT*", $str21$onClick__top_close____);
        defparameter("*HTML-DISMISS-LINK-SCRIPT*", $str23$onClick__top_close____return_fals);
        defparameter("*HTML-BACK-BUTTON-SCRIPT*", $str24$onClick__self_history_back____);
        defparameter("*HTML-REFRESH-BUTTON-SCRIPT*", $str26$onClick__self_location___self_doc);
        defparameter("*HTML-REFRESH-LINK-SCRIPT*", $str28$onClick__self_location___self_doc);
        defparameter("*HTML-REFRESH-FRAME-SCRIPT*", $str29$_for__var_i___0__i___top_frames_l);
        defparameter("*HTML-CLEAR-INPUT-BUTTON-SCRIPT*", $str30$onClick__with__this_form_elements);
        deflexical("*HTML-INSERT-INPUT-BUTTON-SCRIPT*", $str32$onClick__with__this_form_elements);
        deflexical("*HTML-COMPLETING-INPUT-BUTTON-SCRIPT*", $str34$onClick__with__this_form_elements);
        defparameter("*HTML-CLEAR-RADIO-INPUT-SCRIPT*", $str36$onClick__with__this_form_elements);
        defparameter("*HTML-FOCUS-RADIO-INPUT-SCRIPT*", $str37$onClick__with__this_form_elements);
        deflexical("*HTML-AUTO-SELECT-RADIO-BUTTON-SCRIPT*", SubLTrampolineFile.maybeDefault($html_auto_select_radio_button_script$, $html_auto_select_radio_button_script$, $str39$onkeypress__this_form__A__A__chec));
        defparameter("*HTML-BACK-ONLOAD-SCRIPT*", $str40$onLoad__setTimeout__self_history_);
        defparameter("*HTML-MULTI-SUBMIT-SCRIPT-PREAMBLE*", $str43$_onClick__);
        defparameter("*HTML-MULTI-SUBMIT-SCRIPT-POSTAMBLE*", $str44$_this_form_submit____);
        defparameter("*HTML-TEXT-INPUT-RESET-MULTI-SUBMIT-PREAMBLE*", $str45$_onFocus__);
        defparameter("*HTML-TEXT-INPUT-RESET-MULTI-SUBMIT-POSTAMBLE*", $str46$_);
        defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-FIRST-NAME*", $str50$_this_form_elements_0__name_____A);
        defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-ACTION*", $str51$_this_form_action_____A__);
        defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-METHOD*", $str52$_this_form_method_____A__);
        defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-TARGET*", $str53$_this_form_target_____A__);
        defparameter("*JAVASCRIPT-START*", $str54$_script_language__javascript__);
        defparameter("*JAVASCRIPT-END*", $str55$__script_);
        defparameter("*JAVASCRIPT-LINE-COMMENT*", $str56$__);
        defparameter("*JAVASCRIPT-COMMENT-BEGIN*", $str57$__);
        defparameter("*JAVASCRIPT-COMMENT-END*", $str58$__);
        defparameter("*CB-HOVEROVER-ENABLED*", T);
        defparameter("*CB-HOVEROVER-RECURSION-LIMIT*", ZERO_INTEGER);
        defparameter("*JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS*", NIL);
        defparameter("*SET-ALL-RADIO-BUTTONS-SCRIPT*", $str103$__function_set_all_radio_buttons_);
        deflexical("*HTML-POPUP-SCRIPT*", $str109$function_positionedPopup_url_winN);
        return NIL;
    }

    static private final SubLString $str_alt15$onClick__with__this_form_elements = makeString("onClick=\"with (this.form.elements[\'~A\']){value = \'\'; focus();}\"");

    static private final SubLString $str_alt17$onClick__with__this_form_elements = makeString("onClick=\"with (this.form.elements[\'~A\']){value = value + \' \' + \'~A\'; focus();}\"");

    static private final SubLString $str_alt19$onClick__with__this_form_elements = makeString("onClick=\"with (this.form.elements[\'~A\']){value = \'~A\';}; this.form.submit();\"");

    static private final SubLString $str_alt21$onClick__with__this_form_elements = makeString("onClick=\"with (this.form.elements[\'~A\']){value = \'\';}\"");

    static private final SubLString $str_alt22$onClick__with__this_form_elements = makeString("onClick=\"with (this.form.elements[\'~A\']){focus();}\"");

    static private final SubLString $str_alt24$onkeypress__this_form__A__A__chec = makeString("onkeypress=\"this.form.~A[~A].checked=true\"");

    static private final SubLString $str_alt25$onLoad__setTimeout__self_history_ = makeString("onLoad=\"setTimeout(\'self.history.back()\', ~A);\"");

    static private final SubLString $str_alt28$_onClick__ = makeString("\nonClick=\"");

    static private final SubLString $str_alt29$_this_form_submit____ = makeString("\nthis.form.submit();\"");

    static private final SubLString $str_alt30$_onFocus__ = makeString("\nonFocus=\"");

    static private final SubLString $str_alt31$_ = makeString("\"");

    static private final SubLString $str_alt33$width_ = makeString("width:");

    static private final SubLString $str_alt35$_this_form_elements_0__name_____A = makeString("\nthis.form.elements[0].name = \'~A\';");

    static private final SubLString $str_alt36$_this_form_action_____A__ = makeString("\nthis.form.action = \'~A\';");

    static private final SubLString $str_alt37$_this_form_method_____A__ = makeString("\nthis.form.method = \'~A\';");

    static private final SubLString $str_alt38$_this_form_target_____A__ = makeString("\nthis.form.target = \'~A\';");

    static private final SubLString $str_alt39$_script_language__javascript__ = makeString("<script language=\"javascript\">");

    static private final SubLString $str_alt40$__script_ = makeString("</script>");

    static private final SubLString $str_alt41$__ = makeString("//");

    static private final SubLString $str_alt42$__ = makeString("/*");

    public static final SubLObject setup_html_script_utilities_file_alt() {
        register_html_state_variable($cb_script_mode$);
        register_html_interface_variable($cb_script_mode$);
        html_macros.note_html_handler_function(CB_BACK);
        declare_defglobal($html_auto_select_radio_button_script$);
        register_html_state_variable($cb_hoverover_enabled$);
        register_html_interface_variable($cb_hoverover_enabled$);
        register_macro_helper(HTML_HOVEROVER_ANCHOR_ONMOUSEOVER, HTML_HOVEROVER_ANCHOR);
        return NIL;
    }

    public static SubLObject setup_html_script_utilities_file() {
        if (SubLFiles.USE_V1) {
            register_html_state_variable($cb_script_mode$);
            register_html_interface_variable($cb_script_mode$);
            html_macros.note_cgi_handler_function(CB_BACK, $HTML_HANDLER);
            declare_defglobal($html_auto_select_radio_button_script$);
            register_html_state_variable($cb_hoverover_enabled$);
            register_html_interface_variable($cb_hoverover_enabled$);
            register_macro_helper(HTML_HOVEROVER_ANCHOR_ONMOUSEOVER, HTML_HOVEROVER_ANCHOR);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_BACK);
        }
        return NIL;
    }

    public static SubLObject setup_html_script_utilities_file_Previous() {
        register_html_state_variable($cb_script_mode$);
        register_html_interface_variable($cb_script_mode$);
        html_macros.note_cgi_handler_function(CB_BACK, $HTML_HANDLER);
        declare_defglobal($html_auto_select_radio_button_script$);
        register_html_state_variable($cb_hoverover_enabled$);
        register_html_interface_variable($cb_hoverover_enabled$);
        register_macro_helper(HTML_HOVEROVER_ANCHOR_ONMOUSEOVER, HTML_HOVEROVER_ANCHOR);
        return NIL;
    }

    static private final SubLString $str_alt43$__ = makeString("*/");

    static private final SubLString $str_alt44$_ = makeString(" ");

    static private final SubLString $str_alt45$__ = makeString(", ");

    static private final SubLString $str_alt46$__ = makeString(" (");

    static private final SubLString $str_alt47$___ = makeString(") {");

    static private final SubLString $str_alt48$_ = makeString("}");

    @Override
    public void declareFunctions() {
        declare_html_script_utilities_file();
    }

    static private final SubLString $str_alt50$_javascript_overlib_js = makeString("/javascript/overlib.js");

    @Override
    public void initializeVariables() {
        init_html_script_utilities_file();
    }

    static private final SubLString $str_alt52$position_absolute__visibility_hid = makeString("position:absolute; visibility:hidden; z-index:1000;");

    @Override
    public void runTopLevelForms() {
        setup_html_script_utilities_file();
    }

    static {
    }

    static private final SubLString $$$JavaScript = makeString("JavaScript");

    static private final SubLString $str_alt54$__ = makeString("\\\'");

    static private final SubLString $str_alt55$_ = makeString("'");

    static private final SubLList $list_alt56 = list(makeSymbol("PROGN"));

    static private final SubLList $list_alt58 = list(list(makeSymbol("*CB-HOVEROVER-RECURSION-LIMIT*"), list(makeSymbol("-"), makeSymbol("*CB-HOVEROVER-RECURSION-LIMIT*"), ONE_INTEGER)));

    static private final SubLList $list_alt59 = list(list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("HREF"), makeSymbol("NAME"), makeSymbol("TARGET"), makeSymbol("SCRIPT"), makeSymbol("STYLE"), makeSymbol("HOVEROVER-HTML"), makeSymbol("CAPTION"), makeSymbol("WIDTH"), makeSymbol("STICKY") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt60 = list(new SubLObject[]{ $HREF, $NAME, makeKeyword("TARGET"), makeKeyword("SCRIPT"), makeKeyword("STYLE"), makeKeyword("HOVEROVER-HTML"), makeKeyword("CAPTION"), makeKeyword("WIDTH"), makeKeyword("STICKY") });

    static private final SubLSymbol $sym71$ONMOUSEOVER = makeUninternedSymbol("ONMOUSEOVER");

    static private final SubLList $list_alt76 = list(makeKeyword("ONMOUSEOUT"), makeString("nd();"));

    static private final SubLString $str_alt78$return_overlib__ = makeString("return overlib('");

    static private final SubLString $str_alt79$_CAPTION___A_ = makeString(",CAPTION,'~A'");

    static private final SubLString $str_alt80$_WIDTH__A = makeString(",WIDTH,~A");

    static private final SubLString $str_alt81$_STICKY = makeString(",STICKY");

    static private final SubLString $str_alt82$_ = makeString(")");

    static private final SubLList $list_alt84 = cons(makeSymbol("PATTERN"), makeSymbol("REPLACEMENT"));

    static private final SubLString $str_alt85$Odd_event_handler__S____is_this_a = makeString("Odd event handler ~S -- is this a known DOM event?");

    static private final SubLList $list_alt86 = list(makeSymbol("ID"), makeSymbol("EVENT-NAME"), makeSymbol("FUNCTION-NAME"));

    static private final SubLString $str_alt87$__document_getElementById___A____ = makeString("~%document.getElementById('~A').~A = ~A;");

    static private final SubLList $list_alt88 = list(list(makeSymbol("*JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS*"), NIL));

    static private final SubLList $list_alt89 = list(list(makeSymbol("GENERATE-JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS"), makeSymbol("*JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS*")));

    static private final SubLString $str_alt90$__function_set_all_radio_buttons_ = makeString("\n\nfunction set_all_radio_buttons(form, pattern, value) {\n  var re = new RegExp(pattern);\n  for (i = 0 ; i < form.elements.length ; i++) {\n    var field = form.elements[i]; \n    if (re.test(field.name)) {\n      if (field.value == value) {\n\tfield.checked = true;\n      } else {\n        field.checked = false;\n      }\n    }\n  } \n}");

    static private final SubLString $str_alt91$javascript__void_set_all_radio_bu = makeString("javascript: void set_all_radio_buttons(~a, '~a', '~a')");

    static private final SubLString $str_alt92$window_focus__ = makeString("window.focus()");

    static private final SubLString $str_alt95$onClick_javascript_self_close__ = makeString("onClick=javascript:self.close()");

    static private final SubLString $str_alt96$_function_load_simple_applet_para = makeString("\nfunction load_simple_applet_parameters (applet_name) {\n  applets=document.getElementsByTagName(\'applet\');\n  size = applets.length; \n  for (j=0; j < size; j++) {\n    curApplet = applets.item(j);\n    name = curApplet.getAttribute(\'name\');\n    loc = name.lastIndexOf(\'-\' + applet_name + \'-\');\n    if (loc >= 0) {\n      prefix = name.substring(0, loc);\n      input = document.getElementById(prefix);\n      if (input == null) { continue; }\n      previousInput = document.getElementById(name + \'-previous-value\');\n      appletValue = \'\';\n      is_active = false;\n      try { is_active = curApplet.isActive(); } catch (e) {}\n      if (!is_active) {\n        updateDom();\n        try { is_active = curApplet.isActive(); } catch (e) {}\n      }\n      if (is_active) {\n        input.value = appletValue = curApplet.toString();\n      }\n      if (previousInput != null) {\n        previousInput.value = appletValue;\n      }\n    }\n  }\n}\n\nfunction simple_applet_form_submit_method (applet_names) {\n  for (i=0; i < applet_names.length; i++) {\n    applet_name = applet_names[i];\n    load_simple_applet_parameters(applet_name);\n  }\n  return true;\n}\n\nfunction updateDom() {\n  window.resizeBy(0, -1);\n  window.resizeBy(0, 1);\n}\n\nfunction loadPreviousGKEAppletParameter() {\n  applets=document.getElementsByTagName(\'applet\');\n  size = applets.length; \n  shouldJiggle = true;\n  for (j=0; j < size; j++) {\n    curApplet = applets.item(j);\n    name = curApplet.getAttribute(\'name\');\n    previousInput = document.getElementById(name + \'-previous-value\');\n    loc = name.lastIndexOf(\'-GKE-APPLET-\');\n    if (loc < 0) { continue; }\n    value = previousInput.value;\n    if (value == \'>>>>>>>UNSET<<<<<<<\') { continue; }\n    loadPreviousValue(name, value, shouldJiggle, 16, 250);\n    shouldJiggle = false;\n  }\n}\n\nfunction loadPreviousValue(appletId, prevValue, shouldUpdateDom, count, delay) { \n  if (count <= 0) { return; }\n  curApplet = document.getElementById(appletId);\n  value = curApplet.toString();\n  if (curApplet == null) { return; }\n  if (value == \'[object HTMLAppletElement]\') {\n    if (shouldUpdateDom) { updateDom(); }\n    self.setTimeout(\'loadPreviousValue(\"\' + appletId + \n                    \'\", \' + \'\"\' + prevValue + \'\"\' + \n                    \', false, \' + (count-1) + \', \' + delay + \')\', delay);\n    return;\n  }\n  try {\n    //alert(\'Trying to set previous value: \' + prevValue);\n    curApplet.showStatus(\'PREVIOUS VALUE: \' + prevValue);\n  } catch (e) {\n    self.setTimeout(\'loadPreviousValue(\"\' + appletId + \n                    \'\", \' + \'\"\' + prevValue + \'\"\' + \n                    \', false, \' + (count-1) + \', \' + delay + \')\', delay);\n  }\n}\n\nwindow.onload = loadPreviousGKEAppletParameter;\n\n");

    static private final SubLString $$$APPLET = makeString("APPLET");

    static private final SubLString $str_alt98$_ = makeString("-");

    public static final SubLInteger $int$30000 = makeInteger(30000);

    static private final SubLString $str_alt100$_previous_value = makeString("-previous-value");

    static private final SubLString $str_alt101$_______UNSET_______ = makeString(">>>>>>>UNSET<<<<<<<");

    static private final SubLString $str_alt103$onSubmit__return_simple_applet_fo = makeString("onSubmit=\"return simple_applet_form_submit_method(new Array(");

    static private final SubLString $str_alt104$__ = makeString(" ,");

    static private final SubLString $str_alt105$__A_ = makeString("'~A'");

    static private final SubLString $str_alt106$___ = makeString("))\"");

    static private final SubLString $str_alt107$GKE_APPLET = makeString("GKE-APPLET");
}

/**
 * Total time: 347 ms "); $str58$__ = makeString("
 */
