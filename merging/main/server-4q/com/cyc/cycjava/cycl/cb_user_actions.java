/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_show_enhanced_tables$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.decode_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-USER-ACTIONS
 * source file: /cyc/top/cycl/cb-user-actions.lisp
 * created:     2019/07/03 17:38:12
 */
public final class cb_user_actions extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cb_user_actions();

 public static final String myName = "com.cyc.cycjava.cycl.cb_user_actions";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$_User_Actions_ = makeString("[User Actions]");

    static private final SubLString $str2$cb_show_actions = makeString("cb-show-actions");

    private static final SubLSymbol CB_LINK_USER_ACTIONS = makeSymbol("CB-LINK-USER-ACTIONS");

    private static final SubLSymbol CB_SHOW_ACTIONS = makeSymbol("CB-SHOW-ACTIONS");

    private static final SubLString $$$User_Actions = makeString("User Actions");

    private static final SubLString $str8$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str9$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str14$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $str19$No_user_actions_ = makeString("No user actions.");

    private static final SubLString $str20$100_ = makeString("100%");

    private static final SubLString $$$Date = makeString("Date");

    private static final SubLString $$$User = makeString("User");

    private static final SubLString $$$Action_Description = makeString("Action Description");

    private static final SubLString $$$Options = makeString("Options");

    private static final SubLString $str27$_dddddd = makeString("#dddddd");

    private static final SubLString $str28$_cccccc = makeString("#cccccc");

    private static final SubLString $str29$___4__0D__2__0D__2__0D__2__0D__2_ = makeString("~&~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D");

    private static final SubLString $str30$No_summary_fn_for_user_action_of_ = makeString("No summary-fn for user action of type ");

    private static final SubLString $str31$_View_ = makeString("[View]");

    private static final SubLString $str32$cg__A__A = makeString("cg?~A&~A");

    private static final SubLString $str34$cg_cb_delete_user_action__A = makeString("cg?cb-delete-user-action&~A");

    private static final SubLString $str35$_Abort_ = makeString("[Abort]");

    private static final SubLSymbol $USER_ACTION_ID_STRING = makeKeyword("USER-ACTION-ID-STRING");

    private static final SubLSymbol CB_DELETE_USER_ACTION = makeSymbol("CB-DELETE-USER-ACTION");

    private static final SubLString $$$Fatal_Error = makeString("Fatal Error");

    private static final SubLString $str40$could_not_find_a_user_action_matc = makeString("could not find a user-action matching the user-action-id-string");

    private static final SubLString $str41$could_not_find_a_valid_user_actio = makeString("could not find a valid user-action-id-string");

    // Definitions
    public static final SubLObject cb_link_user_actions_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt0$_User_Actions_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt2$cb_show_actions);
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

    // Definitions
    public static SubLObject cb_link_user_actions(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str0$_User_Actions_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str2$cb_show_actions);
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

    /**
     * Show the user-actions defined in the system.
     *
     * @return boolean ;; nil
     * @param ARGS
     * 		list ;; not currently used
     * @unknown In the future we could show the user-actions for only the current cyclist.
     */
    @LispMethod(comment = "Show the user-actions defined in the system.\r\n\r\n@return boolean ;; nil\r\n@param ARGS\r\n\t\tlist ;; not currently used\r\n@unknown In the future we could show the user-actions for only the current cyclist.")
    public static final SubLObject cb_show_actions_alt(SubLObject args) {
        return com.cyc.cycjava.cycl.cb_user_actions.cb_show_actions_internal(UNPROVIDED);
    }

    /**
     * Show the user-actions defined in the system.
     *
     * @return boolean ;; nil
     * @param ARGS
     * 		list ;; not currently used
     * @unknown In the future we could show the user-actions for only the current cyclist.
     */
    @LispMethod(comment = "Show the user-actions defined in the system.\r\n\r\n@return boolean ;; nil\r\n@param ARGS\r\n\t\tlist ;; not currently used\r\n@unknown In the future we could show the user-actions for only the current cyclist.")
    public static SubLObject cb_show_actions(final SubLObject args) {
        return cb_show_actions_internal(UNPROVIDED);
    }

    /**
     * The internal implementation of cb-show-actions.
     *
     * @return boolean ;; nil
     */
    @LispMethod(comment = "The internal implementation of cb-show-actions.\r\n\r\n@return boolean ;; nil")
    public static final SubLObject cb_show_actions_internal_alt(SubLObject user_action_type_key) {
        if (user_action_type_key == UNPROVIDED) {
            user_action_type_key = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$User_Actions;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt9$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            html_princ(title_var);
                                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        if (NIL == user_actions.$user_actions$.getDynamicValue(thread)) {
                                            html_princ($str_alt10$No_user_actions_);
                                        } else {
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
                                                html_markup(THREE_INTEGER);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(TWO_INTEGER);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($str_alt11$100_);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
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
                                                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_princ($$$Date);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_princ($$$User);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_princ($$$Action_Description);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_princ($$$Options);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    {
                                                        SubLObject bgcolor = NIL;
                                                        if (NIL == $cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                                            bgcolor = $str_alt18$_cccccc;
                                                        }
                                                        {
                                                            SubLObject color_toggle = NIL;
                                                            SubLObject list_var = NIL;
                                                            SubLObject user_action = NIL;
                                                            SubLObject ignore_me = NIL;
                                                            for (list_var = user_actions.$user_actions$.getDynamicValue(thread), user_action = list_var.first(), ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , user_action = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                                                if (NIL != $cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                                                    if (NIL != color_toggle) {
                                                                        color_toggle = NIL;
                                                                    } else {
                                                                        color_toggle = T;
                                                                    }
                                                                    bgcolor = (NIL != color_toggle) ? ((SubLObject) ($str_alt19$_dddddd)) : $str_alt18$_cccccc;
                                                                }
                                                                if (!((NIL != user_action_type_key) && (user_actions.user_action_type_key(user_action) != user_action_type_key))) {
                                                                    {
                                                                        SubLObject user_action_id_string = user_actions.user_action_id_string(user_action);
                                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        if (NIL != bgcolor) {
                                                                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(bgcolor);
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
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
                                                                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        {
                                                                                            SubLObject creation_time = user_actions.user_action_creation_time(user_action);
                                                                                            if (creation_time.isNumber()) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject second = decode_universal_time(creation_time, UNPROVIDED);
                                                                                                    SubLObject minute = thread.secondMultipleValue();
                                                                                                    SubLObject hour = thread.thirdMultipleValue();
                                                                                                    SubLObject date = thread.fourthMultipleValue();
                                                                                                    SubLObject month = thread.fifthMultipleValue();
                                                                                                    SubLObject year = thread.sixthMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    html_princ(format(NIL, $str_alt20$___4__0D__2__0D__2__0D__2__0D__2_, new SubLObject[]{ year, month, date, hour, minute, second }));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
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
                                                                                    SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        {
                                                                                            SubLObject cyclist = user_actions.user_action_cyclist(user_action);
                                                                                            if (NIL != cyclist) {
                                                                                                cb_form(cyclist, UNPROVIDED, UNPROVIDED);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
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
                                                                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        {
                                                                                            SubLObject user_action_summary_fn = user_actions.user_action_summary_fn(user_action);
                                                                                            if ((NIL != user_action_summary_fn) && user_action_summary_fn.isFunctionSpec()) {
                                                                                                funcall(user_action_summary_fn, user_action_id_string);
                                                                                            } else {
                                                                                                html_princ($str_alt21$No_summary_fn_for_user_action_of_);
                                                                                                html_princ(user_actions.user_action_type_key(user_action));
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
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
                                                                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        {
                                                                                            SubLObject user_action_display_fn = user_actions.user_action_display_fn(user_action);
                                                                                            if (NIL == user_action_display_fn) {
                                                                                                html_princ($str_alt22$_View_);
                                                                                            } else {
                                                                                                {
                                                                                                    SubLObject href = format(NIL, $str_alt23$cg__A__A, user_action_display_fn, user_action_id_string);
                                                                                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_markup(href);
                                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                        try {
                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                            html_princ($str_alt22$_View_);
                                                                                                        } finally {
                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                                }
                                                                                            }
                                                                                            html_glyph($NBSP, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject href = format(NIL, $str_alt25$cg_cb_delete_user_action__A, user_action_id_string);
                                                                                                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                                                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_markup(href);
                                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                    try {
                                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                                        html_princ($str_alt26$_Abort_);
                                                                                                    } finally {
                                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                                                                    }
                                                                                                }
                                                                                                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_source_readability_terpri(UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        }
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * The internal implementation of cb-show-actions.
     *
     * @return boolean ;; nil
     */
    @LispMethod(comment = "The internal implementation of cb-show-actions.\r\n\r\n@return boolean ;; nil")
    public static SubLObject cb_show_actions_internal(SubLObject user_action_type_key) {
        if (user_action_type_key == UNPROVIDED) {
            user_action_type_key = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$User_Actions;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str8$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str9$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str14$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        if (NIL == user_actions.$user_actions$.getDynamicValue(thread)) {
                            html_princ($str19$No_user_actions_);
                        } else {
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(THREE_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_width$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str20$100_);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($LEFT);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$Date);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                    }
                                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$User);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                    }
                                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$Action_Description);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                    }
                                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$Options);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                    }
                                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                SubLObject bgcolor = NIL;
                                SubLObject color_toggle = NIL;
                                SubLObject list_var = NIL;
                                SubLObject user_action = NIL;
                                SubLObject ignore_me = NIL;
                                list_var = user_actions.$user_actions$.getDynamicValue(thread);
                                user_action = list_var.first();
                                for (ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , user_action = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                    if (NIL != color_toggle) {
                                        color_toggle = NIL;
                                    } else {
                                        color_toggle = T;
                                    }
                                    bgcolor = (NIL != color_toggle) ? $str27$_dddddd : $str28$_cccccc;
                                    if ((NIL == user_action_type_key) || user_actions.user_action_type_key(user_action).eql(user_action_type_key)) {
                                        final SubLObject user_action_id_string = user_actions.user_action_id_string(user_action);
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (NIL != bgcolor) {
                                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(bgcolor);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($LEFT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                final SubLObject creation_time = user_actions.user_action_creation_time(user_action);
                                                if (creation_time.isNumber()) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject second = decode_universal_time(creation_time, UNPROVIDED);
                                                    final SubLObject minute = thread.secondMultipleValue();
                                                    final SubLObject hour = thread.thirdMultipleValue();
                                                    final SubLObject date = thread.fourthMultipleValue();
                                                    final SubLObject month = thread.fifthMultipleValue();
                                                    final SubLObject year = thread.sixthMultipleValue();
                                                    thread.resetMultipleValues();
                                                    html_princ(format(NIL, $str29$___4__0D__2__0D__2__0D__2__0D__2_, new SubLObject[]{ year, month, date, hour, minute, second }));
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                final SubLObject cyclist = user_actions.user_action_cyclist(user_action);
                                                if (NIL != cyclist) {
                                                    cb_form(cyclist, UNPROVIDED, UNPROVIDED);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
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
                                            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                final SubLObject user_action_summary_fn = user_actions.user_action_summary_fn(user_action);
                                                if ((NIL != user_action_summary_fn) && user_action_summary_fn.isFunctionSpec()) {
                                                    funcall(user_action_summary_fn, user_action_id_string);
                                                } else {
                                                    html_princ($str30$No_summary_fn_for_user_action_of_);
                                                    html_princ(user_actions.user_action_type_key(user_action));
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                final SubLObject user_action_display_fn = user_actions.user_action_display_fn(user_action);
                                                if (NIL == user_action_display_fn) {
                                                    html_princ($str31$_View_);
                                                } else {
                                                    final SubLObject href = format(NIL, $str32$cg__A__A, user_action_display_fn, user_action_id_string);
                                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(href);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_princ($str31$_View_);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                                    }
                                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                }
                                                html_glyph($NBSP, UNPROVIDED);
                                                final SubLObject href = format(NIL, $str34$cg_cb_delete_user_action__A, user_action_id_string);
                                                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(href);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ($str35$_Abort_);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                                }
                                                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
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
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Delete a user-action and return to the cb-show-actions page.
     *
     * @return boolean ;; nil
     * @param ARGS
    list
     * 		
     */
    @LispMethod(comment = "Delete a user-action and return to the cb-show-actions page.\r\n\r\n@return boolean ;; nil\r\n@param ARGS\nlist")
    public static final SubLObject cb_delete_user_action_alt(SubLObject args) {
        {
            SubLObject arghash = html_arghash.arglist_to_arghash(args);
            SubLObject user_action_id_string = gethash($USER_ACTION_ID_STRING, arghash, UNPROVIDED).first();
            if (NIL == user_action_id_string) {
                user_action_id_string = gethash($JUST_STRING, arghash, UNPROVIDED).first();
            }
            {
                SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
                if (NIL != user_action) {
                    user_actions.delete_user_action(user_action);
                }
                com.cyc.cycjava.cycl.cb_user_actions.cb_show_actions_internal(UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Delete a user-action and return to the cb-show-actions page.
     *
     * @return boolean ;; nil
     * @param ARGS
    		list
     * 		
     */
    @LispMethod(comment = "Delete a user-action and return to the cb-show-actions page.\r\n\r\n@return boolean ;; nil\r\n@param ARGS\n\t\tlist")
    public static SubLObject cb_delete_user_action(final SubLObject args) {
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        SubLObject user_action_id_string = gethash($USER_ACTION_ID_STRING, arghash, UNPROVIDED).first();
        if (NIL == user_action_id_string) {
            user_action_id_string = gethash($JUST_STRING, arghash, UNPROVIDED).first();
        }
        final SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
        if (NIL != user_action) {
            user_actions.delete_user_action(user_action);
        }
        cb_show_actions_internal(UNPROVIDED);
        return NIL;
    }/**
     * Delete a user-action and return to the cb-show-actions page.
     *
     * @return boolean ;; nil
     * @param ARGS
    		list
     * 		
     */


    public static final SubLObject get_user_action_from_arghash_alt(SubLObject arghash) {
        {
            SubLObject user_action_id_string = hash_table_utilities.gethash_first($USER_ACTION_ID_STRING, arghash, UNPROVIDED);
            if (NIL != user_action_id_string) {
                {
                    SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
                    if (NIL != user_actions.user_action_p(user_action)) {
                        return user_action;
                    } else {
                        cyc_navigator_internals.generic_message_page($$$Fatal_Error, format(NIL, $str_alt31$could_not_find_a_user_action_matc));
                    }
                }
            } else {
                cyc_navigator_internals.generic_message_page($$$Fatal_Error, format(NIL, $str_alt32$could_not_find_a_valid_user_actio));
            }
        }
        return NIL;
    }

    public static SubLObject get_user_action_from_arghash(final SubLObject arghash) {
        final SubLObject user_action_id_string = hash_table_utilities.gethash_first($USER_ACTION_ID_STRING, arghash, UNPROVIDED);
        if (NIL != user_action_id_string) {
            final SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
            if (NIL != user_actions.user_action_p(user_action)) {
                return user_action;
            }
            cyc_navigator_internals.generic_message_page($$$Fatal_Error, format(NIL, $str40$could_not_find_a_user_action_matc));
        } else {
            cyc_navigator_internals.generic_message_page($$$Fatal_Error, format(NIL, $str41$could_not_find_a_valid_user_actio));
        }
        return NIL;
    }

    public static SubLObject declare_cb_user_actions_file() {
        declareFunction("cb_link_user_actions", "CB-LINK-USER-ACTIONS", 0, 1, false);
        declareFunction("cb_show_actions", "CB-SHOW-ACTIONS", 1, 0, false);
        declareFunction("cb_show_actions_internal", "CB-SHOW-ACTIONS-INTERNAL", 0, 1, false);
        declareFunction("cb_delete_user_action", "CB-DELETE-USER-ACTION", 1, 0, false);
        declareFunction("get_user_action_from_arghash", "GET-USER-ACTION-FROM-ARGHASH", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_user_actions_file() {
        return NIL;
    }

    public static final SubLObject setup_cb_user_actions_file_alt() {
        setup_cb_link_method($USER_ACTIONS, CB_LINK_USER_ACTIONS, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_SHOW_ACTIONS);
        html_macros.note_html_handler_function(CB_DELETE_USER_ACTION);
        return NIL;
    }

    public static SubLObject setup_cb_user_actions_file() {
        if (SubLFiles.USE_V1) {
            setup_cb_link_method($USER_ACTIONS, CB_LINK_USER_ACTIONS, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_SHOW_ACTIONS, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_DELETE_USER_ACTION, $HTML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_SHOW_ACTIONS);
            html_macros.note_html_handler_function(CB_DELETE_USER_ACTION);
        }
        return NIL;
    }

    public static SubLObject setup_cb_user_actions_file_Previous() {
        setup_cb_link_method($USER_ACTIONS, CB_LINK_USER_ACTIONS, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_SHOW_ACTIONS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_DELETE_USER_ACTION, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_user_actions_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_user_actions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_user_actions_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$_User_Actions_ = makeString("[User Actions]");

    static private final SubLString $str_alt2$cb_show_actions = makeString("cb-show-actions");

    static private final SubLString $str_alt8$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt9$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt10$No_user_actions_ = makeString("No user actions.");

    static private final SubLString $str_alt11$100_ = makeString("100%");

    static private final SubLString $str_alt18$_cccccc = makeString("#cccccc");

    static private final SubLString $str_alt19$_dddddd = makeString("#dddddd");

    static private final SubLString $str_alt20$___4__0D__2__0D__2__0D__2__0D__2_ = makeString("~&~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D");

    static private final SubLString $str_alt21$No_summary_fn_for_user_action_of_ = makeString("No summary-fn for user action of type ");

    static private final SubLString $str_alt22$_View_ = makeString("[View]");

    static private final SubLString $str_alt23$cg__A__A = makeString("cg?~A&~A");

    static private final SubLString $str_alt25$cg_cb_delete_user_action__A = makeString("cg?cb-delete-user-action&~A");

    static private final SubLString $str_alt26$_Abort_ = makeString("[Abort]");

    static private final SubLString $str_alt31$could_not_find_a_user_action_matc = makeString("could not find a user-action matching the user-action-id-string");

    static private final SubLString $str_alt32$could_not_find_a_valid_user_actio = makeString("could not find a valid user-action-id-string");
}

/**
 * Total time: 324 ms
 */
