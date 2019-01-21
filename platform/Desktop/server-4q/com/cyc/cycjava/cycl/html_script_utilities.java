package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_script_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.html_script_utilities";
    public static final String myFingerPrint = "a9583dbee9627af520ae048f31b82017321fa0f6d2e11c898a34af486be6ee38";
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 603L)
    public static SubLSymbol $cb_script_languages$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 656L)
    public static SubLSymbol $cb_script_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 2083L)
    public static SubLSymbol $html_dismiss_button_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 2361L)
    public static SubLSymbol $html_dismiss_link_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 2580L)
    public static SubLSymbol $html_back_button_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 2812L)
    public static SubLSymbol $html_refresh_button_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 3077L)
    public static SubLSymbol $html_refresh_link_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 3323L)
    public static SubLSymbol $html_refresh_frame_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 3799L)
    public static SubLSymbol $html_clear_input_button_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 4257L)
    private static SubLSymbol $html_insert_input_button_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 4781L)
    private static SubLSymbol $html_completing_input_button_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 5316L)
    public static SubLSymbol $html_clear_radio_input_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 5898L)
    public static SubLSymbol $html_focus_radio_input_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 6445L)
    private static SubLSymbol $html_auto_select_radio_button_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 6852L)
    public static SubLSymbol $html_back_onload_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 7270L)
    private static SubLSymbol $html_multi_submit_script_preamble$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 7433L)
    private static SubLSymbol $html_multi_submit_script_postamble$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 8145L)
    private static SubLSymbol $html_text_input_reset_multi_submit_preamble$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 8232L)
    private static SubLSymbol $html_text_input_reset_multi_submit_postamble$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 8972L)
    private static SubLSymbol $html_set_multi_submit_form_info_first_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 9093L)
    private static SubLSymbol $html_set_multi_submit_form_info_action$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 9185L)
    private static SubLSymbol $html_set_multi_submit_form_info_method$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 9277L)
    private static SubLSymbol $html_set_multi_submit_form_info_target$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 9849L)
    private static SubLSymbol $javascript_start$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 10097L)
    private static SubLSymbol $javascript_end$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 10203L)
    private static SubLSymbol $javascript_line_comment$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 10296L)
    private static SubLSymbol $javascript_comment_begin$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 10352L)
    private static SubLSymbol $javascript_comment_end$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 13295L)
    public static SubLSymbol $cb_hoverover_enabled$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 13543L)
    public static SubLSymbol $cb_hoverover_recursion_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 17179L)
    public static SubLSymbol $javascript_event_remapping_assignments$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 18553L)
    private static SubLSymbol $set_all_radio_buttons_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 20037L)
    private static SubLSymbol $html_popup_script$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$JAVASCRIPT;
    private static final SubLSymbol $sym2$_CB_SCRIPT_MODE_;
    private static final SubLSymbol $sym3$STRINGP;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw7$ARG_1;
    private static final SubLSymbol $kw8$ARG_2;
    private static final SubLSymbol $kw9$CLASS;
    private static final SubLSymbol $sym10$PIF;
    private static final SubLSymbol $sym11$_WITHIN_HTML_FORM_;
    private static final SubLSymbol $sym12$HTML_SCRIPT_BUTTON;
    private static final SubLSymbol $sym13$HTML_FORMAT;
    private static final SubLSymbol $sym14$HTML_DUMMY_FORM;
    private static final SubLString $str15$cb_back;
    private static final SubLString $str16$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str17$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw18$UNINITIALIZED;
    private static final SubLSymbol $sym19$CB_BACK;
    private static final SubLSymbol $kw20$HTML_HANDLER;
    private static final SubLString $str21$onClick__top_close____;
    private static final SubLString $str22$Dismiss;
    private static final SubLString $str23$onClick__top_close____return_fals;
    private static final SubLString $str24$onClick__self_history_back____;
    private static final SubLString $str25$Back;
    private static final SubLString $str26$onClick__self_location___self_doc;
    private static final SubLString $str27$Refresh;
    private static final SubLString $str28$onClick__self_location___self_doc;
    private static final SubLString $str29$_for__var_i___0__i___top_frames_l;
    private static final SubLString $str30$onClick__with__this_form_elements;
    private static final SubLString $str31$Clear;
    private static final SubLString $str32$onClick__with__this_form_elements;
    private static final SubLString $str33$Insert;
    private static final SubLString $str34$onClick__with__this_form_elements;
    private static final SubLString $str35$Paste;
    private static final SubLString $str36$onClick__with__this_form_elements;
    private static final SubLString $str37$onClick__with__this_form_elements;
    private static final SubLSymbol $sym38$_HTML_AUTO_SELECT_RADIO_BUTTON_SCRIPT_;
    private static final SubLString $str39$onkeypress__this_form__A__A__chec;
    private static final SubLString $str40$onLoad__setTimeout__self_history_;
    private static final SubLInteger $int41$2000;
    private static final SubLSymbol $sym42$INTEGERP;
    private static final SubLString $str43$_onClick__;
    private static final SubLString $str44$_this_form_submit____;
    private static final SubLString $str45$_onFocus__;
    private static final SubLString $str46$_;
    private static final SubLString $str47$;
    private static final SubLString $str48$width_;
    private static final SubLString $str49$inputBox;
    private static final SubLString $str50$_this_form_elements_0__name_____A;
    private static final SubLString $str51$_this_form_action_____A__;
    private static final SubLString $str52$_this_form_method_____A__;
    private static final SubLString $str53$_this_form_target_____A__;
    private static final SubLString $str54$_script_language__javascript__;
    private static final SubLString $str55$__script_;
    private static final SubLString $str56$__;
    private static final SubLString $str57$__;
    private static final SubLString $str58$__ = SubLObjectFactory.makeString("\n");
    private static final SubLString $str59$_;
    private static final SubLString $str60$__;
    private static final SubLString $str61$__;
    private static final SubLString $str62$___;
    private static final SubLString $str63$_;
    private static final SubLSymbol $sym64$_CB_HOVEROVER_ENABLED_;
    private static final SubLString $str65$overDiv;
    private static final SubLString $str66$position_absolute__visibility_hid;
    private static final SubLSymbol $kw67$OVERLIB;
    private static final SubLString $str68$__;
    private static final SubLString $str69$_;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$CLET;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLSymbol $kw75$HREF;
    private static final SubLSymbol $kw76$NAME;
    private static final SubLSymbol $kw77$TARGET;
    private static final SubLSymbol $kw78$SCRIPT;
    private static final SubLSymbol $kw79$STYLE;
    private static final SubLSymbol $kw80$HOVEROVER_HTML;
    private static final SubLSymbol $kw81$CAPTION;
    private static final SubLSymbol $kw82$WIDTH;
    private static final SubLSymbol $kw83$STICKY;
    private static final SubLSymbol $sym84$ONMOUSEOVER;
    private static final SubLSymbol $sym85$PWHEN;
    private static final SubLSymbol $sym86$HTML_HOVEROVER_ANCHOR_ONMOUSEOVER;
    private static final SubLSymbol $sym87$HTML_FANCY_ANCHOR;
    private static final SubLSymbol $kw88$ONMOUSEOVER;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$HTML_HOVEROVER_ANCHOR;
    private static final SubLString $str91$return_overlib__;
    private static final SubLString $str92$_CAPTION___A_;
    private static final SubLString $str93$_WIDTH__A;
    private static final SubLString $str94$_STICKY;
    private static final SubLString $str95$_;
    private static final SubLSymbol $sym96$CCONCATENATE;
    private static final SubLList $list97;
    private static final SubLString $str98$Odd_event_handler__S____is_this_a;
    private static final SubLList $list99;
    private static final SubLString $str100$__document_getElementById___A____;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLString $str103$__function_set_all_radio_buttons_;
    private static final SubLString $str104$javascript__void_set_all_radio_bu;
    private static final SubLString $str105$window_focus__;
    private static final SubLString $str106$Close_Window;
    private static final SubLSymbol $kw107$CLOSE_WINDOW;
    private static final SubLString $str108$onClick_javascript_self_close__;
    private static final SubLString $str109$function_positionedPopup_url_winN;
    private static final SubLString $str110$popup;
    private static final SubLInteger $int111$500;
    private static final SubLInteger $int112$300;
    private static final SubLInteger $int113$100;
    private static final SubLString $str114$positionedPopup_this_href___;
    private static final SubLString $str115$____;
    private static final SubLString $str116$yes;
    private static final SubLString $str117$no;
    private static final SubLString $str118$____return_false_;
    private static final SubLString $str119$positionedPopup__;
    private static final SubLSymbol $kw120$HTML_EDITOR_SCRIPTS;
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 822L)
    public static SubLObject html_simple_script_button(final SubLObject value, final SubLObject script, SubLObject arg_1, SubLObject arg_2) {
        if (arg_1 == html_script_utilities.UNPROVIDED) {
            arg_1 = (SubLObject)html_script_utilities.NIL;
        }
        if (arg_2 == html_script_utilities.UNPROVIDED) {
            arg_2 = (SubLObject)html_script_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_script_utilities.NIL != Types.stringp(value) : value;
        assert html_script_utilities.NIL != Types.stringp(script) : script;
        if (html_script_utilities.NIL != html_macros.$within_html_form$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_input_button$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            if (html_script_utilities.NIL != value) {
                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
                html_utilities.html_princ(value);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_script_utilities.UNPROVIDED);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), script, arg_1, arg_2);
            if (html_script_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        else {
            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_script_utilities.T, thread);
                html_macros.$within_html_form$.bind((SubLObject)html_script_utilities.T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_input_button$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
                if (html_script_utilities.NIL != value) {
                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
                    html_utilities.html_princ(value);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_script_utilities.UNPROVIDED);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), script, arg_1, arg_2);
                if (html_script_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            }
            finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        }
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 1258L)
    public static SubLObject html_fancy_script_button(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject value = (SubLObject)html_script_utilities.NIL;
        SubLObject script = (SubLObject)html_script_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_script_utilities.$list4);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_script_utilities.$list4);
        script = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_script_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_script_utilities.NIL;
        SubLObject current_$1 = (SubLObject)html_script_utilities.NIL;
        while (html_script_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_script_utilities.$list4);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_script_utilities.$list4);
            if (html_script_utilities.NIL == conses_high.member(current_$1, (SubLObject)html_script_utilities.$list5, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED)) {
                bad = (SubLObject)html_script_utilities.T;
            }
            if (current_$1 == html_script_utilities.$kw6$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_script_utilities.NIL != bad && html_script_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_script_utilities.$list4);
        }
        final SubLObject arg_1_tail = cdestructuring_bind.property_list_member((SubLObject)html_script_utilities.$kw7$ARG_1, current);
        final SubLObject arg_1 = (SubLObject)((html_script_utilities.NIL != arg_1_tail) ? conses_high.cadr(arg_1_tail) : html_script_utilities.NIL);
        final SubLObject arg_2_tail = cdestructuring_bind.property_list_member((SubLObject)html_script_utilities.$kw8$ARG_2, current);
        final SubLObject arg_2 = (SubLObject)((html_script_utilities.NIL != arg_2_tail) ? conses_high.cadr(arg_2_tail) : html_script_utilities.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_script_utilities.$kw9$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_script_utilities.NIL != class_tail) ? conses_high.cadr(class_tail) : html_script_utilities.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)html_script_utilities.$sym10$PIF, (SubLObject)html_script_utilities.$sym11$_WITHIN_HTML_FORM_, (SubLObject)ConsesLow.list((SubLObject)html_script_utilities.$sym12$HTML_SCRIPT_BUTTON, (SubLObject)ConsesLow.list(value, (SubLObject)html_script_utilities.$kw9$CLASS, v_class), (SubLObject)ConsesLow.list((SubLObject)html_script_utilities.$sym13$HTML_FORMAT, script, arg_1, arg_2)), (SubLObject)ConsesLow.list((SubLObject)html_script_utilities.$sym14$HTML_DUMMY_FORM, (SubLObject)ConsesLow.list((SubLObject)html_script_utilities.$sym12$HTML_SCRIPT_BUTTON, (SubLObject)ConsesLow.list(value, (SubLObject)html_script_utilities.$kw9$CLASS, v_class), (SubLObject)ConsesLow.list((SubLObject)html_script_utilities.$sym13$HTML_FORMAT, script, arg_1, arg_2))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 1576L)
    public static SubLObject html_simple_script_anchor(final SubLObject linktext, final SubLObject script, SubLObject arg_1, SubLObject arg_2) {
        if (arg_1 == html_script_utilities.UNPROVIDED) {
            arg_1 = (SubLObject)html_script_utilities.NIL;
        }
        if (arg_2 == html_script_utilities.UNPROVIDED) {
            arg_2 = (SubLObject)html_script_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_script_utilities.NIL != Types.stringp(linktext) : linktext;
        assert html_script_utilities.NIL != Types.stringp(script) : script;
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        cb_utilities.cb_url((SubLObject)html_script_utilities.$str15$cb_back, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_script_utilities.UNPROVIDED);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), script, arg_1, arg_2);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_script_utilities.T, thread);
            html_utilities.html_markup(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 1822L)
    public static SubLObject cb_back(SubLObject args) {
        if (args == html_script_utilities.UNPROVIDED) {
            args = (SubLObject)html_script_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)html_script_utilities.$str16$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (html_script_utilities.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup((SubLObject)html_script_utilities.$str17$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_script_utilities.$kw18$UNINITIALIZED) ? ConsesLow.list(html_script_utilities.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)html_script_utilities.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_script_utilities.UNPROVIDED);
                html_back_onload_script((SubLObject)html_script_utilities.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_script_utilities.T, thread);
                    html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 2223L)
    public static SubLObject html_dismiss_button(SubLObject value) {
        if (value == html_script_utilities.UNPROVIDED) {
            value = (SubLObject)html_script_utilities.$str22$Dismiss;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return html_simple_script_button(value, html_script_utilities.$html_dismiss_button_script$.getDynamicValue(thread), (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 2447L)
    public static SubLObject html_dismiss_link(SubLObject linktext) {
        if (linktext == html_script_utilities.UNPROVIDED) {
            linktext = (SubLObject)html_script_utilities.$str22$Dismiss;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return html_simple_script_anchor(linktext, html_script_utilities.$html_dismiss_link_script$.getDynamicValue(thread), (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 2690L)
    public static SubLObject html_back_button(SubLObject value) {
        if (value == html_script_utilities.UNPROVIDED) {
            value = (SubLObject)html_script_utilities.$str25$Back;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return html_simple_script_button(value, html_script_utilities.$html_back_button_script$.getDynamicValue(thread), (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 2946L)
    public static SubLObject html_refresh_button(SubLObject value) {
        if (value == html_script_utilities.UNPROVIDED) {
            value = (SubLObject)html_script_utilities.$str27$Refresh;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return html_simple_script_button(value, html_script_utilities.$html_refresh_button_script$.getDynamicValue(thread), (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 3190L)
    public static SubLObject html_refresh_link(SubLObject linktext) {
        if (linktext == html_script_utilities.UNPROVIDED) {
            linktext = (SubLObject)html_script_utilities.$str27$Refresh;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return html_simple_script_anchor(linktext, html_script_utilities.$html_refresh_link_script$.getDynamicValue(thread), (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 3571L)
    public static SubLObject html_refresh_frame_script(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_script_utilities.NIL != Types.stringp(name) : name;
        html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_script_utilities.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_refresh_frame_script$.getDynamicValue(thread), name);
            html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 3950L)
    public static SubLObject html_clear_input_button(final SubLObject input_name, SubLObject value, SubLObject v_class) {
        if (value == html_script_utilities.UNPROVIDED) {
            value = (SubLObject)html_script_utilities.$str31$Clear;
        }
        if (v_class == html_script_utilities.UNPROVIDED) {
            v_class = (SubLObject)html_script_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_script_utilities.NIL != Types.stringp(input_name) : input_name;
        if (html_script_utilities.NIL != html_macros.$within_html_form$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_input_button$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            if (html_script_utilities.NIL != value) {
                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
                html_utilities.html_princ(value);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_script_utilities.UNPROVIDED);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_clear_input_button_script$.getDynamicValue(thread), input_name, (SubLObject)html_script_utilities.NIL);
            if (html_script_utilities.NIL != v_class) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
                html_utilities.html_markup(v_class);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            }
            if (html_script_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        else {
            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_script_utilities.T, thread);
                html_macros.$within_html_form$.bind((SubLObject)html_script_utilities.T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_input_button$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
                if (html_script_utilities.NIL != value) {
                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
                    html_utilities.html_princ(value);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_script_utilities.UNPROVIDED);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_clear_input_button_script$.getDynamicValue(thread), input_name, (SubLObject)html_script_utilities.NIL);
                if (html_script_utilities.NIL != v_class) {
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
                    html_utilities.html_markup(v_class);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
                }
                if (html_script_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            }
            finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        }
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 4402L)
    public static SubLObject html_insert_input_button(final SubLObject input_name, final SubLObject input_value, SubLObject button) {
        if (button == html_script_utilities.UNPROVIDED) {
            button = (SubLObject)html_script_utilities.$str33$Insert;
        }
        assert html_script_utilities.NIL != Types.stringp(input_name) : input_name;
        assert html_script_utilities.NIL != Types.stringp(input_value) : input_value;
        return html_simple_script_button(button, html_script_utilities.$html_insert_input_button_script$.getGlobalValue(), input_name, input_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 4928L)
    public static SubLObject html_completing_input_button(final SubLObject input_name, final SubLObject input_value, SubLObject button) {
        if (button == html_script_utilities.UNPROVIDED) {
            button = (SubLObject)html_script_utilities.$str35$Paste;
        }
        assert html_script_utilities.NIL != Types.stringp(input_name) : input_name;
        assert html_script_utilities.NIL != Types.stringp(input_value) : input_value;
        return html_simple_script_button(button, html_script_utilities.$html_completing_input_button_script$.getGlobalValue(), input_name, input_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 5497L)
    public static SubLObject html_clear_radio_input(final SubLObject name, final SubLObject clear_name, SubLObject value, SubLObject checkedP, SubLObject id) {
        if (value == html_script_utilities.UNPROVIDED) {
            value = (SubLObject)html_script_utilities.NIL;
        }
        if (checkedP == html_script_utilities.UNPROVIDED) {
            checkedP = (SubLObject)html_script_utilities.NIL;
        }
        if (id == html_script_utilities.UNPROVIDED) {
            id = (SubLObject)html_script_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_script_utilities.NIL != Types.stringp(name) : name;
        assert html_script_utilities.NIL != Types.stringp(clear_name) : clear_name;
        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_radio$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        if (html_script_utilities.NIL != id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        if (html_script_utilities.NIL != name) {
            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(name);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        if (html_script_utilities.NIL != value) {
            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_princ(value);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        if (html_script_utilities.NIL != checkedP) {
            html_utilities.html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_script_utilities.UNPROVIDED);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_clear_radio_input_script$.getDynamicValue(thread), clear_name);
        if (html_script_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 6041L)
    public static SubLObject html_focus_radio_input(final SubLObject name, final SubLObject focus_name, SubLObject value, SubLObject checkedP, SubLObject id) {
        if (value == html_script_utilities.UNPROVIDED) {
            value = (SubLObject)html_script_utilities.NIL;
        }
        if (checkedP == html_script_utilities.UNPROVIDED) {
            checkedP = (SubLObject)html_script_utilities.NIL;
        }
        if (id == html_script_utilities.UNPROVIDED) {
            id = (SubLObject)html_script_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_script_utilities.NIL != Types.stringp(name) : name;
        assert html_script_utilities.NIL != Types.stringp(focus_name) : focus_name;
        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_radio$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        if (html_script_utilities.NIL != id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        if (html_script_utilities.NIL != name) {
            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(name);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        if (html_script_utilities.NIL != value) {
            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_princ(value);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        if (html_script_utilities.NIL != checkedP) {
            html_utilities.html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_script_utilities.UNPROVIDED);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_focus_radio_input_script$.getDynamicValue(thread), focus_name);
        if (html_script_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 6584L)
    public static SubLObject html_auto_select_radio_button_script(final SubLObject object_id, final SubLObject radio_button_number) {
        return PrintLow.format((SubLObject)html_script_utilities.NIL, html_script_utilities.$html_auto_select_radio_button_script$.getGlobalValue(), object_id, radio_button_number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 7003L)
    public static SubLObject html_back_onload_script(SubLObject delay) {
        if (delay == html_script_utilities.UNPROVIDED) {
            delay = (SubLObject)html_script_utilities.$int41$2000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_script_utilities.NIL != Types.integerp(delay) : delay;
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_back_onload_script$.getDynamicValue(thread), delay);
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 7518L)
    public static SubLObject html_multi_submit_input(final SubLObject label, SubLObject id, SubLObject first_name, SubLObject action, SubLObject method, SubLObject target, SubLObject style) {
        if (id == html_script_utilities.UNPROVIDED) {
            id = (SubLObject)html_script_utilities.NIL;
        }
        if (first_name == html_script_utilities.UNPROVIDED) {
            first_name = (SubLObject)html_script_utilities.NIL;
        }
        if (action == html_script_utilities.UNPROVIDED) {
            action = (SubLObject)html_script_utilities.NIL;
        }
        if (method == html_script_utilities.UNPROVIDED) {
            method = (SubLObject)html_script_utilities.NIL;
        }
        if (target == html_script_utilities.UNPROVIDED) {
            target = (SubLObject)html_script_utilities.NIL;
        }
        if (style == html_script_utilities.UNPROVIDED) {
            style = (SubLObject)html_script_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_script_utilities.NIL != Types.stringp(label) : label;
        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_submit$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(style);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        if (html_script_utilities.NIL != id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        if (html_script_utilities.NIL != label) {
            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_princ(label);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_script_utilities.UNPROVIDED);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_multi_submit_script_preamble$.getDynamicValue(thread));
        html_set_multi_submit_form_info(first_name, action, method, target);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_multi_submit_script_postamble$.getDynamicValue(thread));
        if (html_script_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 8307L)
    public static SubLObject html_text_input_reset_multi_submit(final SubLObject name, SubLObject v_default, SubLObject width, SubLObject first_name, SubLObject action, SubLObject method, SubLObject target) {
        if (v_default == html_script_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_script_utilities.NIL;
        }
        if (width == html_script_utilities.UNPROVIDED) {
            width = (SubLObject)html_script_utilities.NIL;
        }
        if (first_name == html_script_utilities.UNPROVIDED) {
            first_name = (SubLObject)html_script_utilities.NIL;
        }
        if (action == html_script_utilities.UNPROVIDED) {
            action = (SubLObject)html_script_utilities.NIL;
        }
        if (method == html_script_utilities.UNPROVIDED) {
            method = (SubLObject)html_script_utilities.NIL;
        }
        if (target == html_script_utilities.UNPROVIDED) {
            target = (SubLObject)html_script_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_default.equalp((SubLObject)html_script_utilities.$str47$)) {
            v_default = (SubLObject)html_script_utilities.NIL;
        }
        final SubLObject style_value = Sequences.cconcatenate((SubLObject)html_script_utilities.$str48$width_, format_nil.format_nil_a_no_copy(width));
        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_text$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(style_value);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)html_script_utilities.$str49$inputBox);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        if (html_script_utilities.NIL != name) {
            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(name);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        if (html_script_utilities.NIL != v_default) {
            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_princ(v_default);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_script_utilities.UNPROVIDED);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_text_input_reset_multi_submit_preamble$.getDynamicValue(thread));
        html_set_multi_submit_form_info(first_name, action, method, target);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_text_input_reset_multi_submit_postamble$.getDynamicValue(thread));
        if (html_script_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 9369L)
    public static SubLObject html_set_multi_submit_form_info(final SubLObject first_name, final SubLObject action, final SubLObject method, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (first_name.isString()) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_set_multi_submit_form_info_first_name$.getDynamicValue(thread), first_name);
        }
        if (action.isString()) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_set_multi_submit_form_info_action$.getDynamicValue(thread), action);
        }
        if (method.isString()) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_set_multi_submit_form_info_method$.getDynamicValue(thread), method);
        }
        if (target.isString()) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_set_multi_submit_form_info_target$.getDynamicValue(thread), target);
        }
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 10405L)
    public static SubLObject javascript_comment(SubLObject text, SubLObject spaces) {
        if (text == html_script_utilities.UNPROVIDED) {
            text = (SubLObject)html_script_utilities.NIL;
        }
        if (spaces == html_script_utilities.UNPROVIDED) {
            spaces = (SubLObject)html_script_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_script_utilities.NIL == text) {
            return Sequences.cconcatenate(html_script_utilities.$javascript_comment_begin$.getDynamicValue(thread), html_script_utilities.$javascript_comment_end$.getDynamicValue(thread));
        }
        if (html_script_utilities.NIL != spaces) {
            return Sequences.cconcatenate(html_script_utilities.$javascript_comment_begin$.getDynamicValue(thread), new SubLObject[] { html_script_utilities.$str59$_, text, html_script_utilities.$str59$_, html_script_utilities.$javascript_comment_end$.getDynamicValue(thread) });
        }
        return Sequences.cconcatenate(html_script_utilities.$javascript_comment_begin$.getDynamicValue(thread), new SubLObject[] { text, html_script_utilities.$javascript_comment_end$.getDynamicValue(thread) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 10998L)
    public static SubLObject javascript_comment_line(SubLObject line_of_text, SubLObject spaces) {
        if (line_of_text == html_script_utilities.UNPROVIDED) {
            line_of_text = (SubLObject)html_script_utilities.NIL;
        }
        if (spaces == html_script_utilities.UNPROVIDED) {
            spaces = (SubLObject)html_script_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_script_utilities.NIL == line_of_text) {
            return html_script_utilities.$javascript_line_comment$.getDynamicValue(thread);
        }
        if (html_script_utilities.NIL != spaces) {
            return Sequences.cconcatenate(html_script_utilities.$javascript_line_comment$.getDynamicValue(thread), new SubLObject[] { html_script_utilities.$str59$_, line_of_text });
        }
        return Sequences.cconcatenate(html_script_utilities.$javascript_line_comment$.getDynamicValue(thread), line_of_text);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 11486L)
    public static SubLObject simple_javascript(SubLObject script, SubLObject no_comment) {
        if (script == html_script_utilities.UNPROVIDED) {
            script = (SubLObject)html_script_utilities.NIL;
        }
        if (no_comment == html_script_utilities.UNPROVIDED) {
            no_comment = (SubLObject)html_script_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_script_utilities.NIL == script) {
            return Sequences.cconcatenate(html_script_utilities.$javascript_start$.getDynamicValue(thread), html_script_utilities.$javascript_end$.getDynamicValue(thread));
        }
        if (html_script_utilities.NIL != no_comment) {
            return Sequences.cconcatenate(html_script_utilities.$javascript_start$.getDynamicValue(thread), new SubLObject[] { Strings.string((SubLObject)Characters.CHAR_newline), script, Strings.string((SubLObject)Characters.CHAR_newline), html_script_utilities.$javascript_end$.getDynamicValue(thread) });
        }
        return Sequences.cconcatenate(html_script_utilities.$javascript_start$.getDynamicValue(thread), new SubLObject[] { Strings.string((SubLObject)Characters.CHAR_newline), html_macros.$html_comment_head$.getGlobalValue(), Strings.string((SubLObject)Characters.CHAR_newline), script, Strings.string((SubLObject)Characters.CHAR_newline), javascript_comment_line(html_macros.$html_comment_tail$.getGlobalValue(), (SubLObject)html_script_utilities.UNPROVIDED), Strings.string((SubLObject)Characters.CHAR_newline), html_script_utilities.$javascript_end$.getDynamicValue(thread) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 12479L)
    public static SubLObject javascript_function(final SubLObject name, final SubLObject body, SubLObject p1, SubLObject p2, SubLObject p3, SubLObject p4, SubLObject p5) {
        if (p1 == html_script_utilities.UNPROVIDED) {
            p1 = (SubLObject)html_script_utilities.NIL;
        }
        if (p2 == html_script_utilities.UNPROVIDED) {
            p2 = (SubLObject)html_script_utilities.NIL;
        }
        if (p3 == html_script_utilities.UNPROVIDED) {
            p3 = (SubLObject)html_script_utilities.NIL;
        }
        if (p4 == html_script_utilities.UNPROVIDED) {
            p4 = (SubLObject)html_script_utilities.NIL;
        }
        if (p5 == html_script_utilities.UNPROVIDED) {
            p5 = (SubLObject)html_script_utilities.NIL;
        }
        SubLObject param_list = (SubLObject)html_script_utilities.$str47$;
        if (html_script_utilities.NIL != p1) {
            param_list = p1;
            if (html_script_utilities.NIL != p2) {
                param_list = Sequences.cconcatenate(param_list, new SubLObject[] { html_script_utilities.$str60$__, p2 });
                if (html_script_utilities.NIL != p3) {
                    param_list = Sequences.cconcatenate(param_list, new SubLObject[] { html_script_utilities.$str60$__, p3 });
                    if (html_script_utilities.NIL != p4) {
                        param_list = Sequences.cconcatenate(param_list, new SubLObject[] { html_script_utilities.$str60$__, p4 });
                        if (html_script_utilities.NIL != p5) {
                            param_list = Sequences.cconcatenate(param_list, new SubLObject[] { html_script_utilities.$str60$__, p5 });
                        }
                    }
                }
            }
        }
        return Sequences.cconcatenate(name, new SubLObject[] { html_script_utilities.$str61$__, param_list, html_script_utilities.$str62$___, Strings.string((SubLObject)Characters.CHAR_newline), body, Strings.string((SubLObject)Characters.CHAR_newline), html_script_utilities.$str63$_, Strings.string((SubLObject)Characters.CHAR_newline) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 13785L)
    public static SubLObject cb_hoverover_page_init() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)html_script_utilities.$str65$overDiv);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)html_script_utilities.$str66$position_absolute__visibility_hid);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_script_utilities.T, thread);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        cyc_file_dependencies.javascript((SubLObject)html_script_utilities.$kw67$OVERLIB);
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 13963L)
    public static SubLObject cb_hoverover_clean_html(SubLObject html_text) {
        html_text = Sequences.substitute((SubLObject)Characters.CHAR_quote, (SubLObject)Characters.CHAR_quotation, html_text, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED);
        html_text = Sequences.substitute((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_newline, html_text, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED);
        html_text = string_utilities.string_substitute((SubLObject)html_script_utilities.$str68$__, (SubLObject)html_script_utilities.$str69$_, html_text, (SubLObject)html_script_utilities.UNPROVIDED);
        return html_text;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 14210L)
    public static SubLObject cb_hoverover_recursion_disallowedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(!html_script_utilities.$cb_hoverover_recursion_limit$.getDynamicValue(thread).isInteger() || html_script_utilities.$cb_hoverover_recursion_limit$.getDynamicValue(thread).numL((SubLObject)html_script_utilities.ZERO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 14373L)
    public static SubLObject with_cb_hoverover_recursion_protection(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        if (html_script_utilities.NIL != cb_hoverover_recursion_disallowedP()) {
            return (SubLObject)html_script_utilities.$list70;
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_script_utilities.$sym71$CLET, (SubLObject)html_script_utilities.$list72, ConsesLow.append(body, (SubLObject)html_script_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 14622L)
    public static SubLObject html_hoverover_anchor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_script_utilities.$list73);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_script_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_script_utilities.NIL;
        SubLObject current_$4 = (SubLObject)html_script_utilities.NIL;
        while (html_script_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_script_utilities.$list73);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_script_utilities.$list73);
            if (html_script_utilities.NIL == conses_high.member(current_$4, (SubLObject)html_script_utilities.$list74, (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED)) {
                bad = (SubLObject)html_script_utilities.T;
            }
            if (current_$4 == html_script_utilities.$kw6$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_script_utilities.NIL != bad && html_script_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_script_utilities.$list73);
        }
        final SubLObject href_tail = cdestructuring_bind.property_list_member((SubLObject)html_script_utilities.$kw75$HREF, current);
        final SubLObject href = (SubLObject)((html_script_utilities.NIL != href_tail) ? conses_high.cadr(href_tail) : html_script_utilities.NIL);
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)html_script_utilities.$kw76$NAME, current);
        final SubLObject name = (SubLObject)((html_script_utilities.NIL != name_tail) ? conses_high.cadr(name_tail) : html_script_utilities.NIL);
        final SubLObject target_tail = cdestructuring_bind.property_list_member((SubLObject)html_script_utilities.$kw77$TARGET, current);
        final SubLObject target = (SubLObject)((html_script_utilities.NIL != target_tail) ? conses_high.cadr(target_tail) : html_script_utilities.NIL);
        final SubLObject script_tail = cdestructuring_bind.property_list_member((SubLObject)html_script_utilities.$kw78$SCRIPT, current);
        final SubLObject script = (SubLObject)((html_script_utilities.NIL != script_tail) ? conses_high.cadr(script_tail) : html_script_utilities.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_script_utilities.$kw79$STYLE, current);
        final SubLObject style = (SubLObject)((html_script_utilities.NIL != style_tail) ? conses_high.cadr(style_tail) : html_script_utilities.NIL);
        final SubLObject hoverover_html_tail = cdestructuring_bind.property_list_member((SubLObject)html_script_utilities.$kw80$HOVEROVER_HTML, current);
        final SubLObject hoverover_html = (SubLObject)((html_script_utilities.NIL != hoverover_html_tail) ? conses_high.cadr(hoverover_html_tail) : html_script_utilities.NIL);
        final SubLObject caption_tail = cdestructuring_bind.property_list_member((SubLObject)html_script_utilities.$kw81$CAPTION, current);
        final SubLObject caption = (SubLObject)((html_script_utilities.NIL != caption_tail) ? conses_high.cadr(caption_tail) : html_script_utilities.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)html_script_utilities.$kw82$WIDTH, current);
        final SubLObject width = (SubLObject)((html_script_utilities.NIL != width_tail) ? conses_high.cadr(width_tail) : html_script_utilities.NIL);
        final SubLObject sticky_tail = cdestructuring_bind.property_list_member((SubLObject)html_script_utilities.$kw83$STICKY, current);
        final SubLObject sticky = (SubLObject)((html_script_utilities.NIL != sticky_tail) ? conses_high.cadr(sticky_tail) : html_script_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject onmouseover = (SubLObject)html_script_utilities.$sym84$ONMOUSEOVER;
        return (SubLObject)ConsesLow.list((SubLObject)html_script_utilities.$sym85$PWHEN, (SubLObject)ConsesLow.list((SubLObject)html_script_utilities.$sym3$STRINGP, hoverover_html), (SubLObject)ConsesLow.list((SubLObject)html_script_utilities.$sym71$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(onmouseover, (SubLObject)ConsesLow.list((SubLObject)html_script_utilities.$sym86$HTML_HOVEROVER_ANCHOR_ONMOUSEOVER, hoverover_html, caption, width, sticky))), (SubLObject)ConsesLow.listS((SubLObject)html_script_utilities.$sym87$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.listS((SubLObject)html_script_utilities.$kw75$HREF, new SubLObject[] { href, html_script_utilities.$kw76$NAME, name, html_script_utilities.$kw77$TARGET, target, html_script_utilities.$kw78$SCRIPT, script, html_script_utilities.$kw79$STYLE, style, html_script_utilities.$kw88$ONMOUSEOVER, onmouseover, html_script_utilities.$list89 }), ConsesLow.append(body, (SubLObject)html_script_utilities.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 15224L)
    public static SubLObject html_hoverover_anchor_onmouseover(final SubLObject hoverover_html, final SubLObject caption, final SubLObject width, final SubLObject sticky) {
        SubLObject onmouseover_list = (SubLObject)html_script_utilities.NIL;
        onmouseover_list = (SubLObject)ConsesLow.cons((SubLObject)html_script_utilities.$str91$return_overlib__, onmouseover_list);
        onmouseover_list = (SubLObject)ConsesLow.cons(cb_hoverover_clean_html(hoverover_html), onmouseover_list);
        onmouseover_list = (SubLObject)ConsesLow.cons((SubLObject)html_script_utilities.$str69$_, onmouseover_list);
        if (caption.isString()) {
            onmouseover_list = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)html_script_utilities.NIL, (SubLObject)html_script_utilities.$str92$_CAPTION___A_, cb_hoverover_clean_html(caption)), onmouseover_list);
        }
        if (width.isInteger()) {
            onmouseover_list = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)html_script_utilities.NIL, (SubLObject)html_script_utilities.$str93$_WIDTH__A, width), onmouseover_list);
        }
        if (html_script_utilities.NIL != sticky) {
            onmouseover_list = (SubLObject)ConsesLow.cons((SubLObject)html_script_utilities.$str94$_STICKY, onmouseover_list);
        }
        onmouseover_list = (SubLObject)ConsesLow.cons((SubLObject)html_script_utilities.$str95$_, onmouseover_list);
        return Functions.apply(Symbols.symbol_function((SubLObject)html_script_utilities.$sym96$CCONCATENATE), Sequences.nreverse(onmouseover_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 15986L)
    public static SubLObject instantiate_javascript_template(SubLObject template, final SubLObject substitutions) {
        SubLObject cdolist_list_var = substitutions;
        SubLObject substitution = (SubLObject)html_script_utilities.NIL;
        substitution = cdolist_list_var.first();
        while (html_script_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = substitution;
            SubLObject pattern = (SubLObject)html_script_utilities.NIL;
            SubLObject replacement = (SubLObject)html_script_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_script_utilities.$list97);
            pattern = current.first();
            current = (replacement = current.rest());
            if (replacement.isList()) {
                replacement = replacement.first();
            }
            template = edit_javascript_template(template, pattern, replacement);
            cdolist_list_var = cdolist_list_var.rest();
            substitution = cdolist_list_var.first();
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 16876L)
    public static SubLObject edit_javascript_template(final SubLObject template, final SubLObject pattern, final SubLObject replacement) {
        return string_utilities.string_substitute(replacement, pattern, template, (SubLObject)html_script_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 17297L)
    public static SubLObject javascript_note_event_remapping(final SubLObject id, final SubLObject event, final SubLObject function_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_script_utilities.NIL == html_macros.is_known_dom_event_handlerP(event)) {
            Errors.warn((SubLObject)html_script_utilities.$str98$Odd_event_handler__S____is_this_a, event);
        }
        SubLObject event_name = (SubLObject)html_script_utilities.NIL;
        if (event.isSymbol()) {
            event_name = Strings.string_downcase(Symbols.symbol_name(event), (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        else {
            event_name = Strings.string_downcase(string_utilities.to_string(event_name), (SubLObject)html_script_utilities.UNPROVIDED, (SubLObject)html_script_utilities.UNPROVIDED);
        }
        html_script_utilities.$javascript_event_remapping_assignments$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(id, event_name, function_name), html_script_utilities.$javascript_event_remapping_assignments$.getDynamicValue(thread)), thread);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 17922L)
    public static SubLObject generate_javascript_event_remapping_assignments(final SubLObject assignments) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_script_utilities.T, thread);
            SubLObject cdolist_list_var = assignments;
            SubLObject remapping = (SubLObject)html_script_utilities.NIL;
            remapping = cdolist_list_var.first();
            while (html_script_utilities.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = remapping;
                SubLObject id = (SubLObject)html_script_utilities.NIL;
                SubLObject event_name = (SubLObject)html_script_utilities.NIL;
                SubLObject function_name = (SubLObject)html_script_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_script_utilities.$list99);
                id = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_script_utilities.$list99);
                event_name = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_script_utilities.$list99);
                function_name = current.first();
                current = current.rest();
                if (html_script_utilities.NIL == current) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_script_utilities.$str100$__document_getElementById___A____, new SubLObject[] { id, event_name, function_name });
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_script_utilities.$list99);
                }
                cdolist_list_var = cdolist_list_var.rest();
                remapping = cdolist_list_var.first();
            }
            html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return assignments;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 18270L)
    public static SubLObject with_javascript_event_remapping(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_script_utilities.$sym71$CLET, (SubLObject)html_script_utilities.$list101, ConsesLow.append(body, (SubLObject)html_script_utilities.$list102));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 19017L)
    public static SubLObject html_set_all_radio_buttons_script() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_script_utilities.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$set_all_radio_buttons_script$.getDynamicValue(thread));
            html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 19156L)
    public static SubLObject html_anchor_set_radio_buttons_to_value(final SubLObject label, final SubLObject form, final SubLObject name_pattern, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject href = PrintLow.format((SubLObject)html_script_utilities.NIL, (SubLObject)html_script_utilities.$str104$javascript__void_set_all_radio_bu, new SubLObject[] { form, name_pattern, value });
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(href);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_script_utilities.T, thread);
            html_utilities.html_princ(label);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 19730L)
    public static SubLObject html_js_focus_window() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_script_utilities.T, thread);
            html_utilities.html_princ((SubLObject)html_script_utilities.$str105$window_focus__);
            html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 19861L)
    public static SubLObject html_kill_window_button(SubLObject label, SubLObject name) {
        if (label == html_script_utilities.UNPROVIDED) {
            label = (SubLObject)html_script_utilities.$str106$Close_Window;
        }
        if (name == html_script_utilities.UNPROVIDED) {
            name = (SubLObject)html_script_utilities.$kw107$CLOSE_WINDOW;
        }
        html_utilities.html_submit_input(label, name, (SubLObject)html_script_utilities.$str108$onClick_javascript_self_close__);
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 20292L)
    public static SubLObject html_popup_script() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_script_utilities.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_script_utilities.$html_popup_script$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 20403L)
    public static SubLObject html_popup_onclick(SubLObject window_name, SubLObject width, SubLObject height, SubLObject top_offset, SubLObject left_offset, SubLObject scrollbarsP) {
        if (window_name == html_script_utilities.UNPROVIDED) {
            window_name = (SubLObject)html_script_utilities.$str110$popup;
        }
        if (width == html_script_utilities.UNPROVIDED) {
            width = (SubLObject)html_script_utilities.$int111$500;
        }
        if (height == html_script_utilities.UNPROVIDED) {
            height = (SubLObject)html_script_utilities.$int112$300;
        }
        if (top_offset == html_script_utilities.UNPROVIDED) {
            top_offset = (SubLObject)html_script_utilities.$int113$100;
        }
        if (left_offset == html_script_utilities.UNPROVIDED) {
            left_offset = (SubLObject)html_script_utilities.$int112$300;
        }
        if (scrollbarsP == html_script_utilities.UNPROVIDED) {
            scrollbarsP = (SubLObject)html_script_utilities.NIL;
        }
        return Sequences.cconcatenate((SubLObject)html_script_utilities.$str114$positionedPopup_this_href___, new SubLObject[] { format_nil.format_nil_a_no_copy(window_name), html_script_utilities.$str115$____, format_nil.format_nil_a_no_copy(width), html_script_utilities.$str115$____, format_nil.format_nil_a_no_copy(height), html_script_utilities.$str115$____, format_nil.format_nil_a_no_copy(top_offset), html_script_utilities.$str115$____, format_nil.format_nil_a_no_copy(left_offset), html_script_utilities.$str115$____, format_nil.format_nil_a_no_copy((SubLObject)((html_script_utilities.NIL != scrollbarsP) ? html_script_utilities.$str116$yes : html_script_utilities.$str117$no)), html_script_utilities.$str118$____return_false_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 20738L)
    public static SubLObject html_popup_button_onclick(final SubLObject href, SubLObject window_name, SubLObject width, SubLObject height, SubLObject top_offset, SubLObject left_offset, SubLObject scrollbarsP) {
        if (window_name == html_script_utilities.UNPROVIDED) {
            window_name = (SubLObject)html_script_utilities.$str110$popup;
        }
        if (width == html_script_utilities.UNPROVIDED) {
            width = (SubLObject)html_script_utilities.$int111$500;
        }
        if (height == html_script_utilities.UNPROVIDED) {
            height = (SubLObject)html_script_utilities.$int112$300;
        }
        if (top_offset == html_script_utilities.UNPROVIDED) {
            top_offset = (SubLObject)html_script_utilities.$int113$100;
        }
        if (left_offset == html_script_utilities.UNPROVIDED) {
            left_offset = (SubLObject)html_script_utilities.$int112$300;
        }
        if (scrollbarsP == html_script_utilities.UNPROVIDED) {
            scrollbarsP = (SubLObject)html_script_utilities.NIL;
        }
        return Sequences.cconcatenate((SubLObject)html_script_utilities.$str119$positionedPopup__, new SubLObject[] { format_nil.format_nil_a_no_copy(href), html_script_utilities.$str115$____, format_nil.format_nil_a_no_copy(window_name), html_script_utilities.$str115$____, format_nil.format_nil_a_no_copy(width), html_script_utilities.$str115$____, format_nil.format_nil_a_no_copy(height), html_script_utilities.$str115$____, format_nil.format_nil_a_no_copy(top_offset), html_script_utilities.$str115$____, format_nil.format_nil_a_no_copy(left_offset), html_script_utilities.$str115$____, format_nil.format_nil_a_no_copy((SubLObject)((html_script_utilities.NIL != scrollbarsP) ? html_script_utilities.$str116$yes : html_script_utilities.$str117$no)), html_script_utilities.$str118$____return_false_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 21359L)
    public static SubLObject html_sentence_editor_enable_editors() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_script_utilities.NIL != cb_form_widgets.$cb_use_codemirror_sentence_editorP$.getDynamicValue(thread)) {
            cyc_file_dependencies.web_bundle((SubLObject)html_script_utilities.$kw120$HTML_EDITOR_SCRIPTS);
            html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_script_utilities.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        }
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-script-utilities.lisp", position = 22308L)
    public static SubLObject html_ke_text_editor_enable_editors() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_script_utilities.NIL != cb_form_widgets.$cb_use_ke_text_editorP$.getDynamicValue(thread)) {
            cyc_file_dependencies.web_bundle((SubLObject)html_script_utilities.$kw120$HTML_EDITOR_SCRIPTS);
            html_utilities.html_source_readability_terpri((SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_script_utilities.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_script_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_script_utilities.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        }
        return (SubLObject)html_script_utilities.NIL;
    }
    
    public static SubLObject declare_html_script_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_simple_script_button", "HTML-SIMPLE-SCRIPT-BUTTON", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_script_utilities", "html_fancy_script_button", "HTML-FANCY-SCRIPT-BUTTON");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_simple_script_anchor", "HTML-SIMPLE-SCRIPT-ANCHOR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "cb_back", "CB-BACK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_dismiss_button", "HTML-DISMISS-BUTTON", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_dismiss_link", "HTML-DISMISS-LINK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_back_button", "HTML-BACK-BUTTON", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_refresh_button", "HTML-REFRESH-BUTTON", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_refresh_link", "HTML-REFRESH-LINK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_refresh_frame_script", "HTML-REFRESH-FRAME-SCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_clear_input_button", "HTML-CLEAR-INPUT-BUTTON", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_insert_input_button", "HTML-INSERT-INPUT-BUTTON", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_completing_input_button", "HTML-COMPLETING-INPUT-BUTTON", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_clear_radio_input", "HTML-CLEAR-RADIO-INPUT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_focus_radio_input", "HTML-FOCUS-RADIO-INPUT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_auto_select_radio_button_script", "HTML-AUTO-SELECT-RADIO-BUTTON-SCRIPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_back_onload_script", "HTML-BACK-ONLOAD-SCRIPT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_multi_submit_input", "HTML-MULTI-SUBMIT-INPUT", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_text_input_reset_multi_submit", "HTML-TEXT-INPUT-RESET-MULTI-SUBMIT", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_set_multi_submit_form_info", "HTML-SET-MULTI-SUBMIT-FORM-INFO", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "javascript_comment", "JAVASCRIPT-COMMENT", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "javascript_comment_line", "JAVASCRIPT-COMMENT-LINE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "simple_javascript", "SIMPLE-JAVASCRIPT", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "javascript_function", "JAVASCRIPT-FUNCTION", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "cb_hoverover_page_init", "CB-HOVEROVER-PAGE-INIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "cb_hoverover_clean_html", "CB-HOVEROVER-CLEAN-HTML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "cb_hoverover_recursion_disallowedP", "CB-HOVEROVER-RECURSION-DISALLOWED?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_script_utilities", "with_cb_hoverover_recursion_protection", "WITH-CB-HOVEROVER-RECURSION-PROTECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_script_utilities", "html_hoverover_anchor", "HTML-HOVEROVER-ANCHOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_hoverover_anchor_onmouseover", "HTML-HOVEROVER-ANCHOR-ONMOUSEOVER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "instantiate_javascript_template", "INSTANTIATE-JAVASCRIPT-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "edit_javascript_template", "EDIT-JAVASCRIPT-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "javascript_note_event_remapping", "JAVASCRIPT-NOTE-EVENT-REMAPPING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "generate_javascript_event_remapping_assignments", "GENERATE-JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_script_utilities", "with_javascript_event_remapping", "WITH-JAVASCRIPT-EVENT-REMAPPING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_set_all_radio_buttons_script", "HTML-SET-ALL-RADIO-BUTTONS-SCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_anchor_set_radio_buttons_to_value", "HTML-ANCHOR-SET-RADIO-BUTTONS-TO-VALUE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_js_focus_window", "HTML-JS-FOCUS-WINDOW", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_kill_window_button", "HTML-KILL-WINDOW-BUTTON", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_popup_script", "HTML-POPUP-SCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_popup_onclick", "HTML-POPUP-ONCLICK", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_popup_button_onclick", "HTML-POPUP-BUTTON-ONCLICK", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_sentence_editor_enable_editors", "HTML-SENTENCE-EDITOR-ENABLE-EDITORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_script_utilities", "html_ke_text_editor_enable_editors", "HTML-KE-TEXT-EDITOR-ENABLE-EDITORS", 0, 0, false);
        return (SubLObject)html_script_utilities.NIL;
    }
    
    public static SubLObject init_html_script_utilities_file() {
        html_script_utilities.$cb_script_languages$ = SubLFiles.defparameter("*CB-SCRIPT-LANGUAGES*", (SubLObject)html_script_utilities.$list0);
        html_script_utilities.$cb_script_mode$ = SubLFiles.defparameter("*CB-SCRIPT-MODE*", (SubLObject)html_script_utilities.$kw1$JAVASCRIPT);
        html_script_utilities.$html_dismiss_button_script$ = SubLFiles.defparameter("*HTML-DISMISS-BUTTON-SCRIPT*", (SubLObject)html_script_utilities.$str21$onClick__top_close____);
        html_script_utilities.$html_dismiss_link_script$ = SubLFiles.defparameter("*HTML-DISMISS-LINK-SCRIPT*", (SubLObject)html_script_utilities.$str23$onClick__top_close____return_fals);
        html_script_utilities.$html_back_button_script$ = SubLFiles.defparameter("*HTML-BACK-BUTTON-SCRIPT*", (SubLObject)html_script_utilities.$str24$onClick__self_history_back____);
        html_script_utilities.$html_refresh_button_script$ = SubLFiles.defparameter("*HTML-REFRESH-BUTTON-SCRIPT*", (SubLObject)html_script_utilities.$str26$onClick__self_location___self_doc);
        html_script_utilities.$html_refresh_link_script$ = SubLFiles.defparameter("*HTML-REFRESH-LINK-SCRIPT*", (SubLObject)html_script_utilities.$str28$onClick__self_location___self_doc);
        html_script_utilities.$html_refresh_frame_script$ = SubLFiles.defparameter("*HTML-REFRESH-FRAME-SCRIPT*", (SubLObject)html_script_utilities.$str29$_for__var_i___0__i___top_frames_l);
        html_script_utilities.$html_clear_input_button_script$ = SubLFiles.defparameter("*HTML-CLEAR-INPUT-BUTTON-SCRIPT*", (SubLObject)html_script_utilities.$str30$onClick__with__this_form_elements);
        html_script_utilities.$html_insert_input_button_script$ = SubLFiles.deflexical("*HTML-INSERT-INPUT-BUTTON-SCRIPT*", (SubLObject)html_script_utilities.$str32$onClick__with__this_form_elements);
        html_script_utilities.$html_completing_input_button_script$ = SubLFiles.deflexical("*HTML-COMPLETING-INPUT-BUTTON-SCRIPT*", (SubLObject)html_script_utilities.$str34$onClick__with__this_form_elements);
        html_script_utilities.$html_clear_radio_input_script$ = SubLFiles.defparameter("*HTML-CLEAR-RADIO-INPUT-SCRIPT*", (SubLObject)html_script_utilities.$str36$onClick__with__this_form_elements);
        html_script_utilities.$html_focus_radio_input_script$ = SubLFiles.defparameter("*HTML-FOCUS-RADIO-INPUT-SCRIPT*", (SubLObject)html_script_utilities.$str37$onClick__with__this_form_elements);
        html_script_utilities.$html_auto_select_radio_button_script$ = SubLFiles.deflexical("*HTML-AUTO-SELECT-RADIO-BUTTON-SCRIPT*", (SubLObject)((html_script_utilities.NIL != Symbols.boundp((SubLObject)html_script_utilities.$sym38$_HTML_AUTO_SELECT_RADIO_BUTTON_SCRIPT_)) ? html_script_utilities.$html_auto_select_radio_button_script$.getGlobalValue() : html_script_utilities.$str39$onkeypress__this_form__A__A__chec));
        html_script_utilities.$html_back_onload_script$ = SubLFiles.defparameter("*HTML-BACK-ONLOAD-SCRIPT*", (SubLObject)html_script_utilities.$str40$onLoad__setTimeout__self_history_);
        html_script_utilities.$html_multi_submit_script_preamble$ = SubLFiles.defparameter("*HTML-MULTI-SUBMIT-SCRIPT-PREAMBLE*", (SubLObject)html_script_utilities.$str43$_onClick__);
        html_script_utilities.$html_multi_submit_script_postamble$ = SubLFiles.defparameter("*HTML-MULTI-SUBMIT-SCRIPT-POSTAMBLE*", (SubLObject)html_script_utilities.$str44$_this_form_submit____);
        html_script_utilities.$html_text_input_reset_multi_submit_preamble$ = SubLFiles.defparameter("*HTML-TEXT-INPUT-RESET-MULTI-SUBMIT-PREAMBLE*", (SubLObject)html_script_utilities.$str45$_onFocus__);
        html_script_utilities.$html_text_input_reset_multi_submit_postamble$ = SubLFiles.defparameter("*HTML-TEXT-INPUT-RESET-MULTI-SUBMIT-POSTAMBLE*", (SubLObject)html_script_utilities.$str46$_);
        html_script_utilities.$html_set_multi_submit_form_info_first_name$ = SubLFiles.defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-FIRST-NAME*", (SubLObject)html_script_utilities.$str50$_this_form_elements_0__name_____A);
        html_script_utilities.$html_set_multi_submit_form_info_action$ = SubLFiles.defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-ACTION*", (SubLObject)html_script_utilities.$str51$_this_form_action_____A__);
        html_script_utilities.$html_set_multi_submit_form_info_method$ = SubLFiles.defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-METHOD*", (SubLObject)html_script_utilities.$str52$_this_form_method_____A__);
        html_script_utilities.$html_set_multi_submit_form_info_target$ = SubLFiles.defparameter("*HTML-SET-MULTI-SUBMIT-FORM-INFO-TARGET*", (SubLObject)html_script_utilities.$str53$_this_form_target_____A__);
        html_script_utilities.$javascript_start$ = SubLFiles.defparameter("*JAVASCRIPT-START*", (SubLObject)html_script_utilities.$str54$_script_language__javascript__);
        html_script_utilities.$javascript_end$ = SubLFiles.defparameter("*JAVASCRIPT-END*", (SubLObject)html_script_utilities.$str55$__script_);
        html_script_utilities.$javascript_line_comment$ = SubLFiles.defparameter("*JAVASCRIPT-LINE-COMMENT*", (SubLObject)html_script_utilities.$str56$__);
        html_script_utilities.$javascript_comment_begin$ = SubLFiles.defparameter("*JAVASCRIPT-COMMENT-BEGIN*", (SubLObject)html_script_utilities.$str57$__);
        html_script_utilities.$javascript_comment_end$ = SubLFiles.defparameter("*JAVASCRIPT-COMMENT-END*", (SubLObject)html_script_utilities.$str58$__);
        html_script_utilities.$cb_hoverover_enabled$ = SubLFiles.defparameter("*CB-HOVEROVER-ENABLED*", (SubLObject)html_script_utilities.T);
        html_script_utilities.$cb_hoverover_recursion_limit$ = SubLFiles.defparameter("*CB-HOVEROVER-RECURSION-LIMIT*", (SubLObject)html_script_utilities.ZERO_INTEGER);
        html_script_utilities.$javascript_event_remapping_assignments$ = SubLFiles.defparameter("*JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS*", (SubLObject)html_script_utilities.NIL);
        html_script_utilities.$set_all_radio_buttons_script$ = SubLFiles.defparameter("*SET-ALL-RADIO-BUTTONS-SCRIPT*", (SubLObject)html_script_utilities.$str103$__function_set_all_radio_buttons_);
        html_script_utilities.$html_popup_script$ = SubLFiles.deflexical("*HTML-POPUP-SCRIPT*", (SubLObject)html_script_utilities.$str109$function_positionedPopup_url_winN);
        return (SubLObject)html_script_utilities.NIL;
    }
    
    public static SubLObject setup_html_script_utilities_file() {
        utilities_macros.register_html_state_variable((SubLObject)html_script_utilities.$sym2$_CB_SCRIPT_MODE_);
        utilities_macros.register_html_interface_variable((SubLObject)html_script_utilities.$sym2$_CB_SCRIPT_MODE_);
        html_macros.note_cgi_handler_function((SubLObject)html_script_utilities.$sym19$CB_BACK, (SubLObject)html_script_utilities.$kw20$HTML_HANDLER);
        subl_macro_promotions.declare_defglobal((SubLObject)html_script_utilities.$sym38$_HTML_AUTO_SELECT_RADIO_BUTTON_SCRIPT_);
        utilities_macros.register_html_state_variable((SubLObject)html_script_utilities.$sym64$_CB_HOVEROVER_ENABLED_);
        utilities_macros.register_html_interface_variable((SubLObject)html_script_utilities.$sym64$_CB_HOVEROVER_ENABLED_);
        access_macros.register_macro_helper((SubLObject)html_script_utilities.$sym86$HTML_HOVEROVER_ANCHOR_ONMOUSEOVER, (SubLObject)html_script_utilities.$sym90$HTML_HOVEROVER_ANCHOR);
        return (SubLObject)html_script_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_html_script_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_html_script_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_html_script_utilities_file();
    }
    
    static {
        me = (SubLFile)new html_script_utilities();
        html_script_utilities.$cb_script_languages$ = null;
        html_script_utilities.$cb_script_mode$ = null;
        html_script_utilities.$html_dismiss_button_script$ = null;
        html_script_utilities.$html_dismiss_link_script$ = null;
        html_script_utilities.$html_back_button_script$ = null;
        html_script_utilities.$html_refresh_button_script$ = null;
        html_script_utilities.$html_refresh_link_script$ = null;
        html_script_utilities.$html_refresh_frame_script$ = null;
        html_script_utilities.$html_clear_input_button_script$ = null;
        html_script_utilities.$html_insert_input_button_script$ = null;
        html_script_utilities.$html_completing_input_button_script$ = null;
        html_script_utilities.$html_clear_radio_input_script$ = null;
        html_script_utilities.$html_focus_radio_input_script$ = null;
        html_script_utilities.$html_auto_select_radio_button_script$ = null;
        html_script_utilities.$html_back_onload_script$ = null;
        html_script_utilities.$html_multi_submit_script_preamble$ = null;
        html_script_utilities.$html_multi_submit_script_postamble$ = null;
        html_script_utilities.$html_text_input_reset_multi_submit_preamble$ = null;
        html_script_utilities.$html_text_input_reset_multi_submit_postamble$ = null;
        html_script_utilities.$html_set_multi_submit_form_info_first_name$ = null;
        html_script_utilities.$html_set_multi_submit_form_info_action$ = null;
        html_script_utilities.$html_set_multi_submit_form_info_method$ = null;
        html_script_utilities.$html_set_multi_submit_form_info_target$ = null;
        html_script_utilities.$javascript_start$ = null;
        html_script_utilities.$javascript_end$ = null;
        html_script_utilities.$javascript_line_comment$ = null;
        html_script_utilities.$javascript_comment_begin$ = null;
        html_script_utilities.$javascript_comment_end$ = null;
        html_script_utilities.$cb_hoverover_enabled$ = null;
        html_script_utilities.$cb_hoverover_recursion_limit$ = null;
        html_script_utilities.$javascript_event_remapping_assignments$ = null;
        html_script_utilities.$set_all_radio_buttons_script$ = null;
        html_script_utilities.$html_popup_script$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JAVASCRIPT"));
        $kw1$JAVASCRIPT = SubLObjectFactory.makeKeyword("JAVASCRIPT");
        $sym2$_CB_SCRIPT_MODE_ = SubLObjectFactory.makeSymbol("*CB-SCRIPT-MODE*");
        $sym3$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SCRIPT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-2"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARG-1"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-2"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"));
        $kw6$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw7$ARG_1 = SubLObjectFactory.makeKeyword("ARG-1");
        $kw8$ARG_2 = SubLObjectFactory.makeKeyword("ARG-2");
        $kw9$CLASS = SubLObjectFactory.makeKeyword("CLASS");
        $sym10$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym11$_WITHIN_HTML_FORM_ = SubLObjectFactory.makeSymbol("*WITHIN-HTML-FORM*");
        $sym12$HTML_SCRIPT_BUTTON = SubLObjectFactory.makeSymbol("HTML-SCRIPT-BUTTON");
        $sym13$HTML_FORMAT = SubLObjectFactory.makeSymbol("HTML-FORMAT");
        $sym14$HTML_DUMMY_FORM = SubLObjectFactory.makeSymbol("HTML-DUMMY-FORM");
        $str15$cb_back = SubLObjectFactory.makeString("cb-back");
        $str16$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str17$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw18$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym19$CB_BACK = SubLObjectFactory.makeSymbol("CB-BACK");
        $kw20$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str21$onClick__top_close____ = SubLObjectFactory.makeString("onClick=\"top.close();\"");
        $str22$Dismiss = SubLObjectFactory.makeString("Dismiss");
        $str23$onClick__top_close____return_fals = SubLObjectFactory.makeString("onClick=\"top.close(); return false;\"");
        $str24$onClick__self_history_back____ = SubLObjectFactory.makeString("onClick=\"self.history.back();\"");
        $str25$Back = SubLObjectFactory.makeString("Back");
        $str26$onClick__self_location___self_doc = SubLObjectFactory.makeString("onClick=\"self.location = self.document.location;\"");
        $str27$Refresh = SubLObjectFactory.makeString("Refresh");
        $str28$onClick__self_location___self_doc = SubLObjectFactory.makeString("onClick=\"self.location = self.document.location; return false;\"");
        $str29$_for__var_i___0__i___top_frames_l = SubLObjectFactory.makeString("\nfor (var i = 0; i < top.frames.length; i++) {\n  var frame = top.frames[i];\n  if (frame.name == '~A') {\n    frame.location = frame.document.location;\n    break;\n  }\n}");
        $str30$onClick__with__this_form_elements = SubLObjectFactory.makeString("onClick=\"with (this.form.elements['~A']){value = ''; focus();}\"");
        $str31$Clear = SubLObjectFactory.makeString("Clear");
        $str32$onClick__with__this_form_elements = SubLObjectFactory.makeString("onClick=\"with (this.form.elements['~A']){value = value + ' ' + '~A'; focus();}\"");
        $str33$Insert = SubLObjectFactory.makeString("Insert");
        $str34$onClick__with__this_form_elements = SubLObjectFactory.makeString("onClick=\"with (this.form.elements['~A']){value = '~A';}; this.form.submit();\"");
        $str35$Paste = SubLObjectFactory.makeString("Paste");
        $str36$onClick__with__this_form_elements = SubLObjectFactory.makeString("onClick=\"with (this.form.elements['~A']){value = '';}\"");
        $str37$onClick__with__this_form_elements = SubLObjectFactory.makeString("onClick=\"with (this.form.elements['~A']){focus();}\"");
        $sym38$_HTML_AUTO_SELECT_RADIO_BUTTON_SCRIPT_ = SubLObjectFactory.makeSymbol("*HTML-AUTO-SELECT-RADIO-BUTTON-SCRIPT*");
        $str39$onkeypress__this_form__A__A__chec = SubLObjectFactory.makeString("onkeypress=\"this.form.~A[~A].checked=true\"");
        $str40$onLoad__setTimeout__self_history_ = SubLObjectFactory.makeString("onLoad=\"setTimeout('self.history.back()', ~A);\"");
        $int41$2000 = SubLObjectFactory.makeInteger(2000);
        $sym42$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str43$_onClick__ = SubLObjectFactory.makeString("\nonClick=\"");
        $str44$_this_form_submit____ = SubLObjectFactory.makeString("\nthis.form.submit();\"");
        $str45$_onFocus__ = SubLObjectFactory.makeString("\nonFocus=\"");
        $str46$_ = SubLObjectFactory.makeString("\"");
        $str47$ = SubLObjectFactory.makeString("");
        $str48$width_ = SubLObjectFactory.makeString("width:");
        $str49$inputBox = SubLObjectFactory.makeString("inputBox");
        $str50$_this_form_elements_0__name_____A = SubLObjectFactory.makeString("\nthis.form.elements[0].name = '~A';");
        $str51$_this_form_action_____A__ = SubLObjectFactory.makeString("\nthis.form.action = '~A';");
        $str52$_this_form_method_____A__ = SubLObjectFactory.makeString("\nthis.form.method = '~A';");
        $str53$_this_form_target_____A__ = SubLObjectFactory.makeString("\nthis.form.target = '~A';");
        $str54$_script_language__javascript__ = SubLObjectFactory.makeString("<script language=\"javascript\">");
        $str55$__script_ = SubLObjectFactory.makeString("</script>");
        $str56$__ = SubLObjectFactory.makeString("//");
        $str57$__ = SubLObjectFactory.makeString("");
        $str59$_ = SubLObjectFactory.makeString(" ");
        $str60$__ = SubLObjectFactory.makeString(", ");
        $str61$__ = SubLObjectFactory.makeString(" (");
        $str62$___ = SubLObjectFactory.makeString(") {");
        $str63$_ = SubLObjectFactory.makeString("}");
        $sym64$_CB_HOVEROVER_ENABLED_ = SubLObjectFactory.makeSymbol("*CB-HOVEROVER-ENABLED*");
        $str65$overDiv = SubLObjectFactory.makeString("overDiv");
        $str66$position_absolute__visibility_hid = SubLObjectFactory.makeString("position:absolute; visibility:hidden; z-index:1000;");
        $kw67$OVERLIB = SubLObjectFactory.makeKeyword("OVERLIB");
        $str68$__ = SubLObjectFactory.makeString("\\'");
        $str69$_ = SubLObjectFactory.makeString("'");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
        $sym71$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list72 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CB-HOVEROVER-RECURSION-LIMIT*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("*CB-HOVEROVER-RECURSION-LIMIT*"), (SubLObject)html_script_utilities.ONE_INTEGER)));
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("HREF"), SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("TARGET"), SubLObjectFactory.makeSymbol("SCRIPT"), SubLObjectFactory.makeSymbol("STYLE"), SubLObjectFactory.makeSymbol("HOVEROVER-HTML"), SubLObjectFactory.makeSymbol("CAPTION"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("STICKY") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list74 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("HREF"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("TARGET"), SubLObjectFactory.makeKeyword("SCRIPT"), SubLObjectFactory.makeKeyword("STYLE"), SubLObjectFactory.makeKeyword("HOVEROVER-HTML"), SubLObjectFactory.makeKeyword("CAPTION"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("STICKY") });
        $kw75$HREF = SubLObjectFactory.makeKeyword("HREF");
        $kw76$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw77$TARGET = SubLObjectFactory.makeKeyword("TARGET");
        $kw78$SCRIPT = SubLObjectFactory.makeKeyword("SCRIPT");
        $kw79$STYLE = SubLObjectFactory.makeKeyword("STYLE");
        $kw80$HOVEROVER_HTML = SubLObjectFactory.makeKeyword("HOVEROVER-HTML");
        $kw81$CAPTION = SubLObjectFactory.makeKeyword("CAPTION");
        $kw82$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $kw83$STICKY = SubLObjectFactory.makeKeyword("STICKY");
        $sym84$ONMOUSEOVER = SubLObjectFactory.makeUninternedSymbol("ONMOUSEOVER");
        $sym85$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym86$HTML_HOVEROVER_ANCHOR_ONMOUSEOVER = SubLObjectFactory.makeSymbol("HTML-HOVEROVER-ANCHOR-ONMOUSEOVER");
        $sym87$HTML_FANCY_ANCHOR = SubLObjectFactory.makeSymbol("HTML-FANCY-ANCHOR");
        $kw88$ONMOUSEOVER = SubLObjectFactory.makeKeyword("ONMOUSEOVER");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ONMOUSEOUT"), (SubLObject)SubLObjectFactory.makeString("nd();"));
        $sym90$HTML_HOVEROVER_ANCHOR = SubLObjectFactory.makeSymbol("HTML-HOVEROVER-ANCHOR");
        $str91$return_overlib__ = SubLObjectFactory.makeString("return overlib('");
        $str92$_CAPTION___A_ = SubLObjectFactory.makeString(",CAPTION,'~A'");
        $str93$_WIDTH__A = SubLObjectFactory.makeString(",WIDTH,~A");
        $str94$_STICKY = SubLObjectFactory.makeString(",STICKY");
        $str95$_ = SubLObjectFactory.makeString(")");
        $sym96$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $list97 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("REPLACEMENT"));
        $str98$Odd_event_handler__S____is_this_a = SubLObjectFactory.makeString("Odd event handler ~S -- is this a known DOM event?");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-NAME"));
        $str100$__document_getElementById___A____ = SubLObjectFactory.makeString("~%document.getElementById('~A').~A = ~A;");
        $list101 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS*"), (SubLObject)html_script_utilities.NIL));
        $list102 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("*JAVASCRIPT-EVENT-REMAPPING-ASSIGNMENTS*")));
        $str103$__function_set_all_radio_buttons_ = SubLObjectFactory.makeString("\n\nfunction set_all_radio_buttons(form, pattern, value) {\n  var re = new RegExp(pattern);\n  for (i = 0 ; i < form.elements.length ; i++) {\n    var field = form.elements[i]; \n    if (re.test(field.name)) {\n      if (field.value == value) {\n\tfield.checked = true;\n      } else {\n        field.checked = false;\n      }\n    }\n  } \n}");
        $str104$javascript__void_set_all_radio_bu = SubLObjectFactory.makeString("javascript: void set_all_radio_buttons(~a, '~a', '~a')");
        $str105$window_focus__ = SubLObjectFactory.makeString("window.focus()");
        $str106$Close_Window = SubLObjectFactory.makeString("Close Window");
        $kw107$CLOSE_WINDOW = SubLObjectFactory.makeKeyword("CLOSE-WINDOW");
        $str108$onClick_javascript_self_close__ = SubLObjectFactory.makeString("onClick=javascript:self.close()");
        $str109$function_positionedPopup_url_winN = SubLObjectFactory.makeString("function positionedPopup(url,winName,w,h,t,l,scroll){\n  settings =\n  'height='+h+',width='+w+',top='+t+',left='+l+',scrollbars='+scroll+',resizable=yes,location=no';\n  window.open(url,winName,settings)\n  }");
        $str110$popup = SubLObjectFactory.makeString("popup");
        $int111$500 = SubLObjectFactory.makeInteger(500);
        $int112$300 = SubLObjectFactory.makeInteger(300);
        $int113$100 = SubLObjectFactory.makeInteger(100);
        $str114$positionedPopup_this_href___ = SubLObjectFactory.makeString("positionedPopup(this.href, '");
        $str115$____ = SubLObjectFactory.makeString("', '");
        $str116$yes = SubLObjectFactory.makeString("yes");
        $str117$no = SubLObjectFactory.makeString("no");
        $str118$____return_false_ = SubLObjectFactory.makeString("'); return false;");
        $str119$positionedPopup__ = SubLObjectFactory.makeString("positionedPopup('");
        $kw120$HTML_EDITOR_SCRIPTS = SubLObjectFactory.makeKeyword("HTML-EDITOR-SCRIPTS");
    }
}

/*

	Total time: 347 ms
	");
	$str58$__ = SubLObjectFactory.makeString("
*/