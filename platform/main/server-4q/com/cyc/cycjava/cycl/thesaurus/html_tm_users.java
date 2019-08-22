/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      HTML-TM-USERS
 *  source file: /cyc/top/cycl/thesaurus/html-tm-users.lisp
 *  created:     2019/07/03 17:38:31
 */
public final class html_tm_users extends SubLTranslatedFile implements V02 {
    // // Constructor
    private html_tm_users() {
    }

    public static final SubLFile me = new html_tm_users();


    // // Definitions
    public static final SubLObject tm_manage_users(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title = (NIL != args.first()) ? ((SubLObject) (args.first())) : $$$Manage_Users;
                SubLObject user_constant = second(args);
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(title);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(title);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(title);
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                    html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt3$tm_manage_users);
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    if (NIL != user_constant) {
                                        tm_manage_users_guts(user_constant);
                                    } else {
                                        tm_manage_users_guts(UNPROVIDED);
                                    }
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_manage_users_guts(SubLObject user_constant) {
        if (user_constant == UNPROVIDED) {
            user_constant = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != user_constant) {
                tm_show_user_info(user_constant);
            }
            {
                SubLObject show_by_idP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_BY_ID);
                SubLObject show_by_nameP = makeBoolean(NIL == show_by_idP);
                SubLObject name_func = (NIL != show_by_idP) ? ((SubLObject) (symbol_function(USER_NAME))) : symbol_function(PERSONAL_NAME);
                SubLObject all_active_users = remove_if(symbol_function(NULL), tm_internals.all_active_users(), name_func, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject all_inactive_users = remove_if(symbol_function(NULL), tm_internals.all_inactive_users(), name_func, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt9$tm_manage_users_display_type, T, UNPROVIDED);
                                        html_utilities.html_princ($str_alt10$Display_Users_By____);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt11$display_type);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                if (NIL != show_by_idP) {
                                                    html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($$$ID);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($$$ID);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                if (NIL != show_by_nameP) {
                                                    html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($$$Name);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($$$Name);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                        html_utilities.html_submit_input($$$Redisplay, UNPROVIDED, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        if (NIL != tm_internals.editing_allowedP()) {
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt15$tm_add_user, T, UNPROVIDED);
                                            html_utilities.html_princ($str_alt16$Add_New_User_);
                                            html_utilities.html_br();
                                            html_utilities.html_princ($str_alt17$User_IDs_must_be_alphanumeric__wi);
                                            html_utilities.html_br();
                                            html_utilities.html_princ($str_alt18$Enter_ID_your_external_authentica);
                                            html_utilities.html_br();
                                            html_utilities.html_text_input($str_alt19$new_user, $str_alt20$, TWENTY_INTEGER);
                                            html_utilities.html_submit_input($$$Add, UNPROVIDED, UNPROVIDED);
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        }
                        all_active_users = Sort.sort(all_active_users, symbol_function(STRING_LESSP), name_func);
                        all_inactive_users = Sort.sort(all_inactive_users, symbol_function(STRING_LESSP), name_func);
                        if (NIL != all_active_users) {
                            if (NIL != tm_internals.editing_allowedP()) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt23$Inactivate_User_);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt24$tm_inactivate_user, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt25$inactivate_user);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = remove(tm_datastructures.$tm_user$.getDynamicValue(thread), all_active_users, symbol_function(EQUAL), symbol_function(USER_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            SubLObject user = NIL;
                                                            for (user = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , user = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject user_id = cb_utilities.cb_fort_identifier(user);
                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                    if (NIL != user_id) {
                                                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(user_id);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ(funcall(name_func, user));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                html_utilities.html_submit_input($$$Inactivate, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                        }
                        if (NIL != all_inactive_users) {
                            if (NIL != tm_internals.editing_allowedP()) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt27$Reactivate_User_);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt28$tm_reactivate_user, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt29$reactivate_user);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = remove(tm_datastructures.$tm_user$.getDynamicValue(thread), all_inactive_users, symbol_function(EQUAL), symbol_function(USER_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            SubLObject user = NIL;
                                                            for (user = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , user = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject user_id = cb_utilities.cb_fort_identifier(user);
                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                    if (NIL != user_id) {
                                                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(user_id);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ(funcall(name_func, user));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                html_utilities.html_submit_input($$$Reactivate, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                        }
                        if (NIL != all_active_users) {
                            if (NIL != tm_internals.editing_allowedP()) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt31$Delete_User_);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt32$tm_delete_user, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt33$delete_user);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = remove(tm_datastructures.$tm_user$.getDynamicValue(thread), all_active_users, symbol_function(EQUAL), symbol_function(USER_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            SubLObject user = NIL;
                                                            for (user = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , user = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject user_id = cb_utilities.cb_fort_identifier(user);
                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                    if (NIL != user_id) {
                                                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(user_id);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ(funcall(name_func, user));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                html_utilities.html_submit_input($$$Delete, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt35$Edit_User_);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt36$tm_edit_user, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt37$edit_user);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = all_active_users;
                                                            SubLObject user = NIL;
                                                            for (user = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , user = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject user_id = cb_utilities.cb_fort_identifier(user);
                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                    if (NIL != user_id) {
                                                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(user_id);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ(funcall(name_func, user));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                html_utilities.html_submit_input($$$Edit, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($str_alt39$Show_User_Permissions_);
                                    html_utilities.html_br();
                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt40$tm_show_user, T, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt41$show_user);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject cdolist_list_var = all_active_users;
                                                        SubLObject user = NIL;
                                                        for (user = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , user = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject user_id = cb_utilities.cb_fort_identifier(user);
                                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                if (NIL != user_id) {
                                                                    html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(user_id);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ(funcall(name_func, user));
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                            html_utilities.html_submit_input($$$Show, UNPROVIDED, UNPROVIDED);
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ($str_alt43$Show_User_Permissions_With_Respec);
                                html_utilities.html_br();
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt44$tm_show_users_for_thesaurus, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt45$thesaurus_name);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var = tm_internals.all_thesauri();
                                                    SubLObject thesaurus = NIL;
                                                    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                            if (NIL != thesaurus_name) {
                                                                html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(thesaurus_name);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ(thesaurus_name);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                        }
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                        html_utilities.html_submit_input($$$Show, UNPROVIDED, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject tm_manage_users_display_type(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject display_type = html_utilities.html_extract_input($str_alt11$display_type, args);
                if (display_type.equalp($$$ID)) {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_BY_ID, T, UNPROVIDED);
                }
                if (display_type.equalp($$$Name)) {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_BY_ID, NIL, UNPROVIDED);
                }
                tm_manage_users(list(format(NIL, $str_alt46$Manage_Users__Displaying_users_by, display_type)));
            }
            return NIL;
        }
    }

    public static final SubLObject tm_add_user(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_name = html_utilities.html_extract_input($str_alt19$new_user, args);
                if (user_name.equalp($str_alt20$)) {
                    return html_thesaurus.tm_error($str_alt48$You_must_give_a_non_empty_user_na, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != tm_internals.tm_user_constant_from_user_name(user_name)) {
                    return html_thesaurus.tm_error($str_alt49$The_user_ID__S_is_already_in_use_, user_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(format(NIL, $str_alt50$Define_User_Permissions_for__S, user_name));
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(format(NIL, $str_alt50$Define_User_Permissions_for__S, user_name));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(format(NIL, $str_alt50$Define_User_Permissions_for__S, user_name));
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.tm_help_link($str_alt15$tm_add_user);
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt51$tm_handle_add_user, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt19$new_user, user_name, UNPROVIDED);
                                                html_utilities.html_submit_input($$$Add_User, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_reset_input(UNPROVIDED);
                                                html_utilities.html_br();
                                                html_utilities.html_princ($str_alt53$Enter_the_user_s_name__);
                                                html_utilities.html_text_input($$$name, $str_alt20$, $int$30);
                                                html_utilities.html_br();
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt56$Please_choose_a_permission_level_, user_name);
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_radio_input($$$level, $str_alt58$advanced_user, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($$$Advanced_User);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt60$Advanced_users_may_browse_all_rel);
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_princ($str_alt61$Choose_Browse_Thesauri_);
                                                html_utilities.html_br();
                                                html_thesaurus.tm_thesaurus_selection(tm_internals.all_thesauri(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                html_utilities.html_radio_input($$$level, $str_alt62$limited_editor, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($$$Limited_Editor);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt64$Limited_Editors_have_the_same_per);
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt61$Choose_Browse_Thesauri_);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt65$____);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt66$Choose_Edit_Thesauri_);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_thesaurus.tm_thesaurus_selection(tm_internals.all_thesauri(), NIL, $str_alt67$browse_thesauri, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_thesaurus.tm_thesaurus_selection(tm_internals.all_thesauri(), NIL, $str_alt68$edit_thesauri, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                html_utilities.html_radio_input($$$level, $str_alt69$full_editor, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($$$Full_Editor);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt71$Full_Editors_have_full_browsing_a);
                                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                html_utilities.html_radio_input($$$level, $$$administrator, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($$$Administrator);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt73$Administrators_may_update_users__);
                                                html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_add_user(SubLObject args) {
        {
            SubLObject user_name = html_utilities.html_extract_input($str_alt19$new_user, args);
            SubLObject personal_name = html_utilities.html_extract_input($$$name, args);
            SubLObject level = html_utilities.html_extract_input($$$level, args);
            SubLObject adv_thesaurus_names = html_utilities.html_extract_input_values($$$thesauri, args);
            SubLObject browse_thesaurus_names = html_utilities.html_extract_input_values($str_alt67$browse_thesauri, args);
            SubLObject edit_thesaurus_names = html_utilities.html_extract_input_values($str_alt68$edit_thesauri, args);
            SubLObject result = NIL;
            if (NIL == assoc(level, tm_datastructures.$tm_user_levels$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)) {
                return html_thesaurus.tm_error($str_alt76$_S_is_not_a_known_level_of_user_, level, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != tm_internals.tm_user_constant_from_user_name(user_name)) {
                return html_thesaurus.tm_error($str_alt77$The_name__S_is_already_taken_, user_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (level.equalp($str_alt58$advanced_user)) {
                browse_thesaurus_names = adv_thesaurus_names;
            }
            if (!level.equalp($str_alt62$limited_editor)) {
                edit_thesaurus_names = NIL;
            }
            if (!(level.equalp($str_alt62$limited_editor) || level.equalp($str_alt58$advanced_user))) {
                browse_thesaurus_names = NIL;
            }
            if (personal_name.equalp($str_alt20$)) {
                personal_name = NIL;
            }
            result = tm_internals.do_add_user(user_name, level, browse_thesaurus_names, edit_thesaurus_names, personal_name);
            if (NIL != constant_handles.valid_constantP(result, UNPROVIDED)) {
                return tm_manage_users(list(format(NIL, $str_alt78$User__S_Added, user_name)));
            } else
                if (result == $INVALID_THESAURUS) {
                    return html_thesaurus.tm_error($str_alt80$Add_User__S_Failed__Some_thesauru, user_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    return html_thesaurus.tm_error($str_alt81$Add_User__S_Failed_, user_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }

        }
    }

    public static final SubLObject tm_inactivate_user(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_id = html_utilities.html_extract_input($str_alt25$inactivate_user, args);
                SubLObject user = html_thesaurus.tm_guess_fort(user_id);
                SubLObject show_by_idP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_BY_ID);
                SubLObject user_name = NIL;
                if (NIL == constant_handles.valid_constantP(user, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt83$No_user_found_for__S_, user_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != show_by_idP) {
                    user_name = tm_internals.user_name(user);
                } else {
                    user_name = tm_internals.personal_name(user);
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$Confirm_Inactivate_User);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($$$Confirm_Inactivate_User);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($$$Confirm_Inactivate_User);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.tm_help_link($str_alt24$tm_inactivate_user);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt85$Please_confirm__Inactivate_thesau, user_name);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt86$tm_really_inactivate_user, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt25$inactivate_user, user_id, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt87$user_name, user_name, UNPROVIDED);
                                                html_utilities.html_submit_input($$$Do_it, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_really_inactivate_user(SubLObject args) {
        {
            SubLObject user_id = html_utilities.html_extract_input($str_alt25$inactivate_user, args);
            SubLObject user_name = html_utilities.html_extract_input($str_alt87$user_name, args);
            SubLObject user = html_thesaurus.tm_guess_fort(user_id);
            if (NIL == constant_handles.valid_constantP(user, UNPROVIDED)) {
                return html_thesaurus.tm_error($str_alt83$No_user_found_for__S_, user_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            tm_internals.do_inactivate_user(user);
            tm_manage_users(list(format(NIL, $str_alt90$User__S_inactivated_, user_name)));
        }
        return NIL;
    }

    public static final SubLObject tm_reactivate_user(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_id = html_utilities.html_extract_input($str_alt29$reactivate_user, args);
                SubLObject user = html_thesaurus.tm_guess_fort(user_id);
                SubLObject show_by_idP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_BY_ID);
                SubLObject user_name = NIL;
                if (NIL == constant_handles.valid_constantP(user, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt83$No_user_found_for__S_, user_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != show_by_idP) {
                    user_name = tm_internals.user_name(user);
                } else {
                    user_name = tm_internals.personal_name(user);
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$Confirm_Reactivate_User);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($$$Confirm_Reactivate_User);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($$$Confirm_Reactivate_User);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.tm_help_link($str_alt28$tm_reactivate_user);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt93$Please_confirm__Reactivate_thesau, user_name);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt94$tm_really_reactivate_user, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt29$reactivate_user, user_id, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt87$user_name, user_name, UNPROVIDED);
                                                html_utilities.html_submit_input($$$Do_it, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_really_reactivate_user(SubLObject args) {
        {
            SubLObject user_id = html_utilities.html_extract_input($str_alt29$reactivate_user, args);
            SubLObject user_name = html_utilities.html_extract_input($str_alt87$user_name, args);
            SubLObject user = html_thesaurus.tm_guess_fort(user_id);
            if (NIL == constant_handles.valid_constantP(user, UNPROVIDED)) {
                return html_thesaurus.tm_error($str_alt83$No_user_found_for__S_, user_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            tm_internals.do_reactivate_user(user);
            tm_manage_users(list(format(NIL, $str_alt96$User__S_reactivated_, user_name)));
        }
        return NIL;
    }

    public static final SubLObject tm_delete_user(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_id = html_utilities.html_extract_input($str_alt33$delete_user, args);
                SubLObject user = html_thesaurus.tm_guess_fort(user_id);
                SubLObject show_by_idP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_BY_ID);
                SubLObject user_name = NIL;
                if (NIL == constant_handles.valid_constantP(user, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt83$No_user_found_for__S_, user_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != show_by_idP) {
                    user_name = tm_internals.user_name(user);
                } else {
                    user_name = tm_internals.personal_name(user);
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$Confirm_Delete_User);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($$$Confirm_Delete_User);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($$$Confirm_Delete_User);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.tm_help_link($str_alt32$tm_delete_user);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt99$Warning__This_will_completely_rem, user_name);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt100$Do_you_really_want_to_delete_thes, user_name);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt101$tm_really_delete_user, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt33$delete_user, user_id, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt87$user_name, user_name, UNPROVIDED);
                                                html_utilities.html_submit_input($$$Do_it, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_really_delete_user(SubLObject args) {
        {
            SubLObject user_id = html_utilities.html_extract_input($str_alt33$delete_user, args);
            SubLObject user_name = html_utilities.html_extract_input($str_alt87$user_name, args);
            SubLObject user = html_thesaurus.tm_guess_fort(user_id);
            if (NIL == constant_handles.valid_constantP(user, UNPROVIDED)) {
                return html_thesaurus.tm_error($str_alt83$No_user_found_for__S_, user_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            tm_internals.do_delete_user(user);
            tm_manage_users(list(format(NIL, $str_alt90$User__S_inactivated_, user_name)));
        }
        return NIL;
    }

    public static final SubLObject tm_edit_user(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_id = html_utilities.html_extract_input($str_alt37$edit_user, args);
                SubLObject user_constant = html_thesaurus.tm_guess_fort(user_id);
                SubLObject show_by_idP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_BY_ID);
                SubLObject user_print_name = NIL;
                SubLObject user_name = NIL;
                if (NIL == constant_handles.valid_constantP(user_constant, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt83$No_user_found_for__S_, user_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != show_by_idP) {
                    user_print_name = tm_internals.user_name(user_constant);
                } else {
                    user_print_name = tm_internals.personal_name(user_constant);
                }
                user_name = tm_internals.user_name(user_constant);
                {
                    SubLObject level = tm_internals.user_level(user_constant);
                    SubLObject editable_thesauri = tm_internals.declarative_editable_thesauri(user_constant);
                    SubLObject browsable_thesauri = tm_internals.browsable_thesauri(user_name, UNPROVIDED);
                    SubLObject personal_name = tm_internals.personal_name(user_constant);
                    SubLObject all_thesauri = tm_internals.all_thesauri();
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(format(NIL, $str_alt104$Edit_User__S, user_print_name));
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(format(NIL, $str_alt104$Edit_User__S, user_print_name));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(format(NIL, $str_alt104$Edit_User__S, user_print_name));
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.tm_help_link($str_alt36$tm_edit_user);
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt105$tm_handle_edit_user, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt37$edit_user, user_id, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt106$user_print_name, user_print_name, UNPROVIDED);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt107$Current_settings_for__S_are_highl, user_print_name);
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt108$User_ID_);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ(user_name);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt109$Name_of_user_);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ(NIL != personal_name ? ((SubLObject) (personal_name)) : $$$Unknown);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt111$Enter_new_user_name___);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_text_input($str_alt112$new_name, NIL != personal_name ? ((SubLObject) (personal_name)) : $str_alt20$, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_princ($str_alt113$Choose_level_and_parameters_);
                                                html_utilities.html_br();
                                                html_utilities.html_radio_input($$$level, $str_alt58$advanced_user, equalp(level, $str_alt58$advanced_user));
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($$$Advanced_User);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_75 = html_macros.$html_indent_table_max$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                                                        {
                                                            SubLObject indent = ONE_INTEGER;
                                                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent_row_internal(indent);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (NIL != span) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(span);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt61$Choose_Browse_Thesauri_);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                        {
                                                            SubLObject indent = ONE_INTEGER;
                                                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent_row_internal(indent);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (NIL != span) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(span);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_thesaurus.tm_thesaurus_selection(all_thesauri, browsable_thesauri, $str_alt114$ad_browse_thesauri, UNPROVIDED);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                        html_utilities.html_indent_table_internal(ZERO_INTEGER);
                                                    } finally {
                                                        html_macros.$html_indent_table_max$.rebind(_prev_bind_1_75, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_radio_input($$$level, $str_alt62$limited_editor, equalp(level, $str_alt62$limited_editor));
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($$$Limited_Editor);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_83 = html_macros.$html_indent_table_max$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                                                        {
                                                            SubLObject indent = ONE_INTEGER;
                                                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent_row_internal(indent);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (NIL != span) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(span);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt61$Choose_Browse_Thesauri_);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_macros.verify_not_within_html_pre();
                                                                                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                                                    {
                                                                                        SubLObject _prev_bind_0_88 = html_macros.$within_html_pre$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$within_html_pre$.bind(T, thread);
                                                                                            html_utilities.html_princ($str_alt65$____);
                                                                                        } finally {
                                                                                            html_macros.$within_html_pre$.rebind(_prev_bind_0_88, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt66$Choose_Edit_Thesauri_);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                        {
                                                            SubLObject indent = ONE_INTEGER;
                                                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent_row_internal(indent);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (NIL != span) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(span);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_thesaurus.tm_thesaurus_selection(all_thesauri, browsable_thesauri, $str_alt67$browse_thesauri, UNPROVIDED);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_thesaurus.tm_thesaurus_selection(all_thesauri, editable_thesauri, $str_alt68$edit_thesauri, UNPROVIDED);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                        html_utilities.html_indent_table_internal(ZERO_INTEGER);
                                                    } finally {
                                                        html_macros.$html_indent_table_max$.rebind(_prev_bind_1_83, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_radio_input($$$level, $str_alt69$full_editor, equalp(level, $str_alt69$full_editor));
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($$$Full_Editor);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_radio_input($$$level, $$$administrator, equalp(level, $$$administrator));
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($$$Administrator);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_submit_input($$$Make_Changes, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_reset_input(UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_edit_user(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_id = html_utilities.html_extract_input($str_alt37$edit_user, args);
                SubLObject user_print_name = html_utilities.html_extract_input($str_alt106$user_print_name, args);
                SubLObject new_name = html_utilities.html_extract_input($str_alt112$new_name, args);
                SubLObject new_level = html_utilities.html_extract_input($$$level, args);
                SubLObject new_ad_thesaurus_names = html_utilities.html_extract_input_values($str_alt114$ad_browse_thesauri, args);
                SubLObject new_browse_thesaurus_names = html_utilities.html_extract_input_values($str_alt67$browse_thesauri, args);
                SubLObject new_edit_thesaurus_names = html_utilities.html_extract_input_values($str_alt68$edit_thesauri, args);
                SubLObject user_constant = html_thesaurus.tm_guess_fort(user_id);
                SubLObject ops = NIL;
                if (new_name.equal($str_alt20$)) {
                    new_name = NIL;
                }
                if (NIL == constant_handles.valid_constantP(user_constant, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt83$No_user_found_for__S_, user_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject current_level = tm_internals.user_level(user_constant);
                    SubLObject current_browse_thesauri = tm_internals.declarative_browsable_thesauri(user_constant);
                    SubLObject current_edit_thesauri = tm_internals.declarative_editable_thesauri(user_constant);
                    SubLObject current_name = tm_internals.personal_name(user_constant);
                    if (((current_level.equalp(new_level) && (!new_level.equalp($str_alt58$advanced_user))) && (!new_level.equalp($str_alt62$limited_editor))) && new_name.equalp(current_name)) {
                        return tm_manage_users(list(format(NIL, $str_alt117$Edit_User__S__No_changes_need_to_, user_print_name)));
                    }
                    if (new_level.equalp($str_alt58$advanced_user)) {
                        new_browse_thesaurus_names = new_ad_thesaurus_names;
                    }
                    if (!new_name.equalp(current_name)) {
                        {
                            SubLObject opcode = NIL;
                            SubLObject args_95 = NIL;
                            if ((NIL == new_name) && current_name.isString()) {
                                opcode = $DELETE;
                                args_95 = list(user_constant, current_name);
                            } else
                                if ((NIL == current_name) && new_name.isString()) {
                                    opcode = $ADD;
                                    args_95 = list(user_constant, new_name);
                                } else
                                    if (current_name.isString() && new_name.isString()) {
                                        opcode = $REPLACE;
                                        args_95 = list(user_constant, current_name, new_name);
                                    }


                            {
                                SubLObject op = tm_datastructures.get_tm_op();
                                SubLObject op_96 = op;
                                tm_datastructures._csetf_tm_op_opcode(op_96, opcode);
                                tm_datastructures._csetf_tm_op_relation(op_96, $$nameString);
                                tm_datastructures._csetf_tm_op_inverseP(op_96, NIL);
                                tm_datastructures._csetf_tm_op_args(op_96, args_95);
                                tm_datastructures._csetf_tm_op_thesaurus(op_96, tm_datastructures.$tm_mt$.getGlobalValue());
                                tm_datastructures._csetf_tm_op_status(op_96, NIL);
                                tm_datastructures._csetf_tm_op_verifyP(op_96, NIL);
                                tm_datastructures._csetf_tm_op_hiddenP(op_96, T);
                                tm_datastructures._csetf_tm_op_description(op_96, NIL);
                                tm_datastructures._csetf_tm_op_description_args(op_96, NIL);
                                if (NIL.isString()) {
                                    html_tm_editing.set_op_english(op_96, NIL);
                                } else {
                                    html_tm_editing.set_op_english(op_96, UNPROVIDED);
                                }
                                ops = cons(op, ops);
                            }
                        }
                    }
                    if (!current_level.equalp(new_level)) {
                        {
                            SubLObject op = tm_datastructures.get_tm_op();
                            SubLObject op_97 = op;
                            tm_datastructures._csetf_tm_op_opcode(op_97, $REPLACE);
                            tm_datastructures._csetf_tm_op_relation(op_97, $$tmUserType);
                            tm_datastructures._csetf_tm_op_inverseP(op_97, NIL);
                            tm_datastructures._csetf_tm_op_args(op_97, list(user_constant, current_level, new_level));
                            tm_datastructures._csetf_tm_op_thesaurus(op_97, tm_datastructures.$tm_mt$.getGlobalValue());
                            tm_datastructures._csetf_tm_op_status(op_97, NIL);
                            tm_datastructures._csetf_tm_op_verifyP(op_97, NIL);
                            tm_datastructures._csetf_tm_op_hiddenP(op_97, T);
                            tm_datastructures._csetf_tm_op_description(op_97, NIL);
                            tm_datastructures._csetf_tm_op_description_args(op_97, NIL);
                            if (NIL.isString()) {
                                html_tm_editing.set_op_english(op_97, NIL);
                            } else {
                                html_tm_editing.set_op_english(op_97, UNPROVIDED);
                            }
                            ops = cons(op, ops);
                        }
                    }
                    if (new_level.equalp($str_alt62$limited_editor) || new_level.equalp($str_alt58$advanced_user)) {
                        {
                            SubLObject new_browse_thesauri = NIL;
                            {
                                SubLObject cdolist_list_var = new_browse_thesaurus_names;
                                SubLObject thesaurus_name = NIL;
                                for (thesaurus_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_name = cdolist_list_var.first()) {
                                    {
                                        SubLObject new_thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
                                        if (NIL != new_thesaurus) {
                                            new_browse_thesauri = cons(new_thesaurus, new_browse_thesauri);
                                        } else {
                                            return html_thesaurus.tm_error($str_alt123$_S_is_not_a_known_thesaurus_, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject add_browse_thesauri = set_difference(set_difference(new_browse_thesauri, current_browse_thesauri, UNPROVIDED, UNPROVIDED), tm_internals.released_thesauri(), UNPROVIDED, UNPROVIDED);
                                SubLObject delete_browse_thesauri = set_difference(set_difference(current_browse_thesauri, new_browse_thesauri, UNPROVIDED, UNPROVIDED), tm_internals.released_thesauri(), UNPROVIDED, UNPROVIDED);
                                {
                                    SubLObject cdolist_list_var = add_browse_thesauri;
                                    SubLObject thesaurus = NIL;
                                    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                        {
                                            SubLObject op = tm_datastructures.get_tm_op();
                                            SubLObject op_98 = op;
                                            tm_datastructures._csetf_tm_op_opcode(op_98, $ADD);
                                            tm_datastructures._csetf_tm_op_relation(op_98, $$tmBrowsableThesauri);
                                            tm_datastructures._csetf_tm_op_inverseP(op_98, NIL);
                                            tm_datastructures._csetf_tm_op_args(op_98, list(user_constant, thesaurus));
                                            tm_datastructures._csetf_tm_op_thesaurus(op_98, tm_datastructures.$tm_mt$.getGlobalValue());
                                            tm_datastructures._csetf_tm_op_status(op_98, NIL);
                                            tm_datastructures._csetf_tm_op_verifyP(op_98, NIL);
                                            tm_datastructures._csetf_tm_op_hiddenP(op_98, T);
                                            tm_datastructures._csetf_tm_op_description(op_98, NIL);
                                            tm_datastructures._csetf_tm_op_description_args(op_98, NIL);
                                            if (NIL.isString()) {
                                                html_tm_editing.set_op_english(op_98, NIL);
                                            } else {
                                                html_tm_editing.set_op_english(op_98, UNPROVIDED);
                                            }
                                            ops = cons(op, ops);
                                        }
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var = delete_browse_thesauri;
                                    SubLObject thesaurus = NIL;
                                    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                        {
                                            SubLObject op = tm_datastructures.get_tm_op();
                                            SubLObject op_99 = op;
                                            tm_datastructures._csetf_tm_op_opcode(op_99, $DELETE);
                                            tm_datastructures._csetf_tm_op_relation(op_99, $$tmBrowsableThesauri);
                                            tm_datastructures._csetf_tm_op_inverseP(op_99, NIL);
                                            tm_datastructures._csetf_tm_op_args(op_99, list(user_constant, thesaurus));
                                            tm_datastructures._csetf_tm_op_thesaurus(op_99, tm_datastructures.$tm_mt$.getGlobalValue());
                                            tm_datastructures._csetf_tm_op_status(op_99, NIL);
                                            tm_datastructures._csetf_tm_op_verifyP(op_99, NIL);
                                            tm_datastructures._csetf_tm_op_hiddenP(op_99, T);
                                            tm_datastructures._csetf_tm_op_description(op_99, NIL);
                                            tm_datastructures._csetf_tm_op_description_args(op_99, NIL);
                                            if (NIL.isString()) {
                                                html_tm_editing.set_op_english(op_99, NIL);
                                            } else {
                                                html_tm_editing.set_op_english(op_99, UNPROVIDED);
                                            }
                                            ops = cons(op, ops);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (new_level.equalp($str_alt62$limited_editor)) {
                        {
                            SubLObject new_edit_thesauri = NIL;
                            {
                                SubLObject cdolist_list_var = new_edit_thesaurus_names;
                                SubLObject thesaurus_name = NIL;
                                for (thesaurus_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_name = cdolist_list_var.first()) {
                                    {
                                        SubLObject new_thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
                                        if (NIL != new_thesaurus) {
                                            new_edit_thesauri = cons(new_thesaurus, new_edit_thesauri);
                                        } else {
                                            return html_thesaurus.tm_error($str_alt123$_S_is_not_a_known_thesaurus_, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject add_edit_thesauri = set_difference(new_edit_thesauri, current_edit_thesauri, UNPROVIDED, UNPROVIDED);
                                SubLObject delete_edit_thesauri = set_difference(current_edit_thesauri, new_edit_thesauri, UNPROVIDED, UNPROVIDED);
                                {
                                    SubLObject cdolist_list_var = add_edit_thesauri;
                                    SubLObject thesaurus = NIL;
                                    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                        {
                                            SubLObject op = tm_datastructures.get_tm_op();
                                            SubLObject op_100 = op;
                                            tm_datastructures._csetf_tm_op_opcode(op_100, $ADD);
                                            tm_datastructures._csetf_tm_op_relation(op_100, $$tmEditorFor);
                                            tm_datastructures._csetf_tm_op_inverseP(op_100, NIL);
                                            tm_datastructures._csetf_tm_op_args(op_100, list(user_constant, thesaurus));
                                            tm_datastructures._csetf_tm_op_thesaurus(op_100, tm_datastructures.$tm_mt$.getGlobalValue());
                                            tm_datastructures._csetf_tm_op_status(op_100, NIL);
                                            tm_datastructures._csetf_tm_op_verifyP(op_100, NIL);
                                            tm_datastructures._csetf_tm_op_hiddenP(op_100, T);
                                            tm_datastructures._csetf_tm_op_description(op_100, NIL);
                                            tm_datastructures._csetf_tm_op_description_args(op_100, NIL);
                                            if (NIL.isString()) {
                                                html_tm_editing.set_op_english(op_100, NIL);
                                            } else {
                                                html_tm_editing.set_op_english(op_100, UNPROVIDED);
                                            }
                                            ops = cons(op, ops);
                                        }
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var = delete_edit_thesauri;
                                    SubLObject thesaurus = NIL;
                                    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                        {
                                            SubLObject op = tm_datastructures.get_tm_op();
                                            SubLObject op_101 = op;
                                            tm_datastructures._csetf_tm_op_opcode(op_101, $DELETE);
                                            tm_datastructures._csetf_tm_op_relation(op_101, $$tmEditorFor);
                                            tm_datastructures._csetf_tm_op_inverseP(op_101, NIL);
                                            tm_datastructures._csetf_tm_op_args(op_101, list(user_constant, thesaurus));
                                            tm_datastructures._csetf_tm_op_thesaurus(op_101, tm_datastructures.$tm_mt$.getGlobalValue());
                                            tm_datastructures._csetf_tm_op_status(op_101, NIL);
                                            tm_datastructures._csetf_tm_op_verifyP(op_101, NIL);
                                            tm_datastructures._csetf_tm_op_hiddenP(op_101, T);
                                            tm_datastructures._csetf_tm_op_description(op_101, NIL);
                                            tm_datastructures._csetf_tm_op_description_args(op_101, NIL);
                                            if (NIL.isString()) {
                                                html_tm_editing.set_op_english(op_101, NIL);
                                            } else {
                                                html_tm_editing.set_op_english(op_101, UNPROVIDED);
                                            }
                                            ops = cons(op, ops);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == ops) {
                    return tm_manage_users(list(format(NIL, $str_alt117$Edit_User__S__No_changes_need_to_, user_print_name)));
                }
                ops = nreverse(ops);
                thread.resetMultipleValues();
                {
                    SubLObject bad = tm_internals.check_operations(ops);
                    SubLObject good = thread.secondMultipleValue();
                    SubLObject verifyP = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == good) {
                        html_tm_editing.html_show_bad_ops_page(bad);
                    } else {
                        html_tm_editing.do_good_ops_results(bad, good, symbol_function(TM_MANAGE_USERS_GUTS), list(user_constant), format(NIL, $str_alt104$Edit_User__S, user_print_name), UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_show_user(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_id = html_utilities.html_extract_input($str_alt41$show_user, args);
                SubLObject user_constant = html_thesaurus.tm_guess_fort(user_id);
                SubLObject show_by_idP = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_BY_ID);
                SubLObject user_name = NIL;
                if (NIL == constant_handles.valid_constantP(user_constant, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt83$No_user_found_for__S_, user_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != show_by_idP) {
                    user_name = tm_internals.user_name(user_constant);
                } else {
                    user_name = tm_internals.personal_name(user_constant);
                }
                return tm_manage_users(list(format(NIL, $str_alt128$Manage_Users__Info_for__S, user_name), user_constant));
            }
        }
    }

    public static final SubLObject tm_show_user_info(SubLObject user_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject current_level = tm_internals.user_level(user_constant);
                SubLObject editable_thesauri = tm_internals.editable_thesauri(user_constant, UNPROVIDED);
                SubLObject browsable_thesauri = tm_internals.browsable_thesauri(tm_internals.user_name(user_constant), T);
                SubLObject personal_name = tm_internals.personal_name(user_constant);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt108$User_ID_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(tm_internals.user_name(user_constant));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_104, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_106 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt109$Name_of_user_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_106, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_107 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(NIL != personal_name ? ((SubLObject) (personal_name)) : $$$Unknown);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_107, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_105, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_108 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_109 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt130$Level_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_109, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_110 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(string_utilities.space_dont_uncapitalize(string_utilities.string_subst($str_alt20$, $str_alt131$_, Strings.string_capitalize(current_level, UNPROVIDED, UNPROVIDED), UNPROVIDED)));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_110, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_108, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_111 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_112 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt133$Browse_Thesauri_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_112, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_113 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (length(browsable_thesauri).eql(length(tm_internals.all_thesauri()))) {
                                            html_utilities.html_princ($$$All_Thesauri);
                                        } else
                                            if (NIL != browsable_thesauri) {
                                                {
                                                    SubLObject cdolist_list_var = browsable_thesauri;
                                                    SubLObject thesaurus = NIL;
                                                    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                        html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                                        html_utilities.html_br();
                                                    }
                                                }
                                            } else {
                                                html_utilities.html_princ($str_alt135$_None_);
                                                html_utilities.html_br();
                                            }

                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_113, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_111, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_114 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_115 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt136$Edit_Thesauri_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_115, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_116 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (editable_thesauri == $ALL) {
                                            html_utilities.html_princ($$$All_Thesauri);
                                        } else
                                            if (NIL == editable_thesauri) {
                                                html_utilities.html_princ($str_alt135$_None_);
                                            } else {
                                                {
                                                    SubLObject cdolist_list_var = editable_thesauri;
                                                    SubLObject thesaurus = NIL;
                                                    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                        html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                                        html_utilities.html_br();
                                                    }
                                                }
                                            }

                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_116, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_114, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_show_users_for_thesaurus(SubLObject args) {
        {
            SubLObject thesaurus_name = html_utilities.html_extract_input($str_alt45$thesaurus_name, args);
            SubLObject thesaurus_constant = tm_internals.thesaurus_constant_from_name(thesaurus_name);
            if (NIL == constant_handles.valid_constantP(thesaurus_constant, UNPROVIDED)) {
                return html_thesaurus.tm_error($str_alt123$_S_is_not_a_known_thesaurus_, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return tm_thesaurus_users_page(thesaurus_constant);
        }
    }

    public static final SubLObject tm_thesaurus_users_info(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                SubLObject released = tm_internals.released_thesaurusP(thesaurus);
                SubLObject browsers = tm_internals.thesaurus_browsers(thesaurus, $CYCLIST);
                SubLObject editors = tm_internals.thesaurus_editors(thesaurus, $CYCLIST);
                SubLObject name_func = NIL;
                if (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_BY_ID)) {
                    name_func = symbol_function(USER_NAME);
                } else {
                    name_func = symbol_function(PERSONAL_NAME);
                }
                browsers = Sort.sort(remove_if(symbol_function(NULL), browsers, name_func, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(STRING_LESSP), name_func);
                editors = Sort.sort(remove_if(symbol_function(NULL), editors, name_func, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(STRING_LESSP), name_func);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_117 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_118 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt140$Thesaurus_name__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_118, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_119 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(thesaurus_name);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_119, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_117, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_120 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_121 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt141$Released___);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_121, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_122 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != released) {
                                            html_utilities.html_princ($$$Yes);
                                        } else {
                                            html_utilities.html_princ($$$No);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_122, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_120, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_123 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_124 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt144$Browsers__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_124, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_125 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != released) {
                                            html_utilities.html_princ($$$All_Users);
                                        } else {
                                            if (NIL == browsers) {
                                                html_utilities.html_princ($$$No_Users);
                                            } else {
                                                {
                                                    SubLObject cdolist_list_var = browsers;
                                                    SubLObject v_browser = NIL;
                                                    for (v_browser = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_browser = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject user_name = (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_BY_ID)) ? ((SubLObject) (tm_internals.user_name(v_browser))) : tm_internals.personal_name(v_browser);
                                                            html_utilities.html_princ(NIL != user_name ? ((SubLObject) (user_name)) : $$$Unknown);
                                                            if (NIL == tm_internals.active_entityP(v_browser)) {
                                                                html_utilities.html_princ($str_alt147$__inactive_);
                                                            }
                                                            html_utilities.html_br();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_125, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_123, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_126 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_127 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt148$Editors__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_127, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_128 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL == editors) {
                                            html_utilities.html_princ($$$No_Users);
                                        } else {
                                            {
                                                SubLObject cdolist_list_var = editors;
                                                SubLObject editor = NIL;
                                                for (editor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , editor = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject user_name = (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $SHOW_BY_ID)) ? ((SubLObject) (tm_internals.user_name(editor))) : tm_internals.personal_name(editor);
                                                        html_utilities.html_princ(NIL != user_name ? ((SubLObject) (user_name)) : $$$Unknown);
                                                        if (NIL == tm_internals.active_entityP(editor)) {
                                                            html_utilities.html_princ($str_alt147$__inactive_);
                                                        }
                                                        html_utilities.html_br();
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_128, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_126, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject tm_thesaurus_users_page(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title = format(NIL, $str_alt149$User_permissions_with_respect_to_, tm_internals.thesaurus_name(thesaurus));
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(title);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_129 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_130 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_131 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_131, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_130, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(title);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(title);
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                    html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt150$tm_thesaurus_users_page);
                                    tm_thesaurus_users_info(thesaurus);
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_129, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_manage_apps(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title = (NIL != args.first()) ? ((SubLObject) (args.first())) : $$$Manage_Applications;
                SubLObject app_constant = second(args);
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(title);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_132 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_133 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_134 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_134, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_133, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(title);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(title);
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                    html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt152$tm_manage_apps);
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    if (NIL != app_constant) {
                                        tm_manage_apps_guts(app_constant);
                                    } else {
                                        tm_manage_apps_guts(UNPROVIDED);
                                    }
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_132, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_manage_apps_guts(SubLObject app_constant) {
        if (app_constant == UNPROVIDED) {
            app_constant = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != app_constant) {
                tm_show_app_info(app_constant);
            }
            {
                SubLObject all_active_apps = remove_if(symbol_function(NULL), tm_internals.all_active_apps(), symbol_function(APPLICATION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject all_inactive_apps = remove_if(symbol_function(NULL), tm_internals.all_inactive_apps(), symbol_function(APPLICATION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != tm_internals.editing_allowedP()) {
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_135 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_136 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt155$tm_add_app, T, UNPROVIDED);
                                            html_utilities.html_princ($str_alt156$Register_New_Application_);
                                            html_utilities.html_br();
                                            html_utilities.html_princ($str_alt157$Application_IDs_must_be_alphanume);
                                            html_utilities.html_br();
                                            html_utilities.html_text_input($str_alt158$new_app, $str_alt20$, TWENTY_INTEGER);
                                            html_utilities.html_submit_input($$$Add, UNPROVIDED, UNPROVIDED);
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_136, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_135, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        }
                        all_active_apps = Sort.sort(all_active_apps, symbol_function(STRING_LESSP), symbol_function(APPLICATION_NAME));
                        all_inactive_apps = Sort.sort(all_inactive_apps, symbol_function(STRING_LESSP), symbol_function(APPLICATION_NAME));
                        if (NIL != all_active_apps) {
                            if (NIL != tm_internals.editing_allowedP()) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_137 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt159$Inactivate_Application_);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_138 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt160$tm_inactivate_app, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt161$inactivate_app);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_139 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = all_active_apps;
                                                            SubLObject app = NIL;
                                                            for (app = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , app = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject app_id = cb_utilities.cb_fort_identifier(app);
                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                    if (NIL != app_id) {
                                                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(app_id);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_140 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ(tm_internals.application_name(app));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_140, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_139, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                html_utilities.html_submit_input($$$Inactivate, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_138, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_137, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                        }
                        if (NIL != all_inactive_apps) {
                            if (NIL != tm_internals.editing_allowedP()) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_141 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt162$Reactivate_Application_);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_142 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt163$tm_reactivate_app, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt164$reactivate_app);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_143 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = all_inactive_apps;
                                                            SubLObject app = NIL;
                                                            for (app = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , app = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject app_id = cb_utilities.cb_fort_identifier(app);
                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                    if (NIL != app_id) {
                                                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(app_id);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_144 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ(tm_internals.application_name(app));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_144, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_143, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                html_utilities.html_submit_input($$$Reactivate, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_142, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_141, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                        }
                        if (NIL != all_active_apps) {
                            if (NIL != tm_internals.editing_allowedP()) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_145 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt165$Delete_Application_);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_146 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt166$tm_delete_app, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt167$delete_app);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_147 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = all_active_apps;
                                                            SubLObject app = NIL;
                                                            for (app = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , app = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject app_id = cb_utilities.cb_fort_identifier(app);
                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                    if (NIL != app_id) {
                                                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(app_id);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_148 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ(tm_internals.application_name(app));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_148, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_147, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                html_utilities.html_submit_input($$$Delete, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_146, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_145, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_149 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt168$Edit_Application_);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_150 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt169$tm_edit_app, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt170$edit_app);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_151 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = all_active_apps;
                                                            SubLObject app = NIL;
                                                            for (app = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , app = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject app_id = cb_utilities.cb_fort_identifier(app);
                                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                    if (NIL != app_id) {
                                                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(app_id);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_152 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ(tm_internals.application_name(app));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_152, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_151, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                html_utilities.html_submit_input($$$Edit, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_150, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_149, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_153 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_princ($str_alt171$Show_Application_Permissions_);
                                    html_utilities.html_br();
                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_154 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt172$tm_show_app, T, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt173$show_app);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_155 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject cdolist_list_var = all_active_apps;
                                                        SubLObject app = NIL;
                                                        for (app = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , app = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject app_id = cb_utilities.cb_fort_identifier(app);
                                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                if (NIL != app_id) {
                                                                    html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(app_id);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_156 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ(tm_internals.application_name(app));
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_156, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_155, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                            html_utilities.html_submit_input($$$Show, UNPROVIDED, UNPROVIDED);
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_154, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_153, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_157 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ($str_alt174$Show_Application_Permissions_With);
                                html_utilities.html_br();
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_158 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input($str_alt175$tm_show_apps_for_thesaurus, T, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt45$thesaurus_name);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_159 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var = tm_internals.all_thesauri();
                                                    SubLObject thesaurus = NIL;
                                                    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                            if (NIL != thesaurus_name) {
                                                                html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(thesaurus_name);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_160 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_princ(thesaurus_name);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_160, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                        }
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_159, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                        html_utilities.html_submit_input($$$Show, UNPROVIDED, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_158, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_157, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject tm_add_app(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application_name = html_utilities.html_extract_input($str_alt158$new_app, args);
                if (application_name.equalp($str_alt20$)) {
                    return html_thesaurus.tm_error($str_alt176$You_must_give_a_non_empty_ID_for_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != tm_internals.tm_app_constant_from_app_name(application_name)) {
                    return html_thesaurus.tm_error($str_alt177$The_application_ID__S_is_already_, application_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(format(NIL, $str_alt178$Define_Application_Permissions_fo, application_name));
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_161 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_162 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_163 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_163, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_162, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(format(NIL, $str_alt178$Define_Application_Permissions_fo, application_name));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(format(NIL, $str_alt178$Define_Application_Permissions_fo, application_name));
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.tm_help_link($str_alt155$tm_add_app);
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_164 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt179$tm_handle_add_app, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt158$new_app, application_name, UNPROVIDED);
                                                html_utilities.html_submit_input($$$Add_Application, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_reset_input(UNPROVIDED);
                                                html_utilities.html_br();
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt181$Please_select_the_thesauri__S_sho, application_name);
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_165 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_166 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_167 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt182$Choose_Query_Thesauri_);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_167, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_168 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt65$____);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_168, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_169 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt183$Choose_Update_Thesauri_);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_169, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_166, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_170 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_171 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_thesaurus.tm_thesaurus_selection(tm_internals.all_thesauri(), NIL, $str_alt67$browse_thesauri, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_171, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_172 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_172, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_173 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_thesaurus.tm_thesaurus_selection(tm_internals.all_thesauri(), NIL, $str_alt68$edit_thesauri, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_173, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_170, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_165, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_164, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_161, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_add_app(SubLObject args) {
        {
            SubLObject application_name = html_utilities.html_extract_input($str_alt158$new_app, args);
            SubLObject browse_thesaurus_names = html_utilities.html_extract_input_values($str_alt67$browse_thesauri, args);
            SubLObject edit_thesaurus_names = html_utilities.html_extract_input_values($str_alt68$edit_thesauri, args);
            SubLObject result = NIL;
            if (NIL != tm_internals.tm_app_constant_from_app_name(application_name)) {
                return html_thesaurus.tm_error($str_alt77$The_name__S_is_already_taken_, application_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            result = tm_internals.do_add_app(application_name, browse_thesaurus_names, edit_thesaurus_names);
            if (NIL != constant_handles.valid_constantP(result, UNPROVIDED)) {
                return tm_manage_apps(list(format(NIL, $str_alt185$Application__S_Added, application_name)));
            } else
                if (result == $INVALID_THESAURUS) {
                    return html_thesaurus.tm_error($str_alt186$Add_Application__S_Failed__Some_t, application_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    return html_thesaurus.tm_error($str_alt187$Add_Application__S_Failed_, application_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }

        }
    }

    public static final SubLObject tm_inactivate_app(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject app_id = html_utilities.html_extract_input($str_alt161$inactivate_app, args);
                SubLObject app = html_thesaurus.tm_guess_fort(app_id);
                SubLObject application_name = NIL;
                if (NIL == constant_handles.valid_constantP(app, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt189$No_application_found_for__S_, app_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                application_name = tm_internals.application_name(app);
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$Confirm_Inactivate_Application);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_174 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_175 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_176 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_176, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_175, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($$$Confirm_Inactivate_Application);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($$$Confirm_Inactivate_Application);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.tm_help_link($str_alt160$tm_inactivate_app);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt191$Please_confirm__Inactivate_thesau, application_name);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_177 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt192$tm_really_inactivate_app, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt193$Inactivate_app, app_id, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt194$application_name, application_name, UNPROVIDED);
                                                html_utilities.html_submit_input($$$Do_it, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_177, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_174, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_really_inactivate_app(SubLObject args) {
        {
            SubLObject app_id = html_utilities.html_extract_input($str_alt161$inactivate_app, args);
            SubLObject application_name = html_utilities.html_extract_input($str_alt194$application_name, args);
            SubLObject app = html_thesaurus.tm_guess_fort(app_id);
            if (NIL == constant_handles.valid_constantP(app, UNPROVIDED)) {
                return html_thesaurus.tm_error($str_alt189$No_application_found_for__S_, app_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            tm_internals.do_inactivate_app(app);
            tm_manage_apps(list(format(NIL, $str_alt196$App__S_inactivated_, application_name)));
        }
        return NIL;
    }

    public static final SubLObject tm_reactivate_app(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject app_id = html_utilities.html_extract_input($str_alt164$reactivate_app, args);
                SubLObject app = html_thesaurus.tm_guess_fort(app_id);
                SubLObject application_name = NIL;
                if (NIL == constant_handles.valid_constantP(app, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt189$No_application_found_for__S_, app_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                application_name = tm_internals.application_name(app);
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$Confirm_Reactivate_Application);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_178 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_179 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_180 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_180, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_179, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($$$Confirm_Reactivate_Application);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($$$Confirm_Reactivate_Application);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.tm_help_link($str_alt163$tm_reactivate_app);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt199$Please_confirm__Reactivate_thesau, application_name);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_181 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt200$tm_really_reactivate_app, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt164$reactivate_app, app_id, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt194$application_name, application_name, UNPROVIDED);
                                                html_utilities.html_submit_input($$$Do_it, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_181, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_178, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_really_reactivate_app(SubLObject args) {
        {
            SubLObject app_id = html_utilities.html_extract_input($str_alt164$reactivate_app, args);
            SubLObject application_name = html_utilities.html_extract_input($str_alt194$application_name, args);
            SubLObject app = html_thesaurus.tm_guess_fort(app_id);
            if (NIL == constant_handles.valid_constantP(app, UNPROVIDED)) {
                return html_thesaurus.tm_error($str_alt189$No_application_found_for__S_, app_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            tm_internals.do_reactivate_app(app);
            tm_manage_apps(list(format(NIL, $str_alt202$Application__S_reactivated_, application_name)));
        }
        return NIL;
    }

    public static final SubLObject tm_delete_app(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject app_id = html_utilities.html_extract_input($str_alt167$delete_app, args);
                SubLObject app = html_thesaurus.tm_guess_fort(app_id);
                SubLObject application_name = NIL;
                if (NIL == constant_handles.valid_constantP(app, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt189$No_application_found_for__S_, app_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                application_name = tm_internals.application_name(app);
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$Confirm_Delete_Application);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_182 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_183 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_184 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_184, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_183, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($$$Confirm_Delete_Application);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($$$Confirm_Delete_Application);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.tm_help_link($str_alt166$tm_delete_app);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt205$Warning__This_will_completely_rem, application_name);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt206$Do_you_really_want_to_delete_thes, application_name);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_185 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt207$tm_really_delete_app, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt167$delete_app, app_id, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt194$application_name, application_name, UNPROVIDED);
                                                html_utilities.html_submit_input($$$Do_it, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_185, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_182, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_really_delete_app(SubLObject args) {
        {
            SubLObject app_id = html_utilities.html_extract_input($str_alt167$delete_app, args);
            SubLObject application_name = html_utilities.html_extract_input($str_alt194$application_name, args);
            SubLObject app = html_thesaurus.tm_guess_fort(app_id);
            if (NIL == constant_handles.valid_constantP(app, UNPROVIDED)) {
                return html_thesaurus.tm_error($str_alt189$No_application_found_for__S_, app_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            tm_internals.do_delete_app(app);
            tm_manage_apps(list(format(NIL, $str_alt209$Application__S_inactivated_, application_name)));
        }
        return NIL;
    }

    public static final SubLObject tm_edit_app(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject app_id = html_utilities.html_extract_input($str_alt170$edit_app, args);
                SubLObject app_constant = html_thesaurus.tm_guess_fort(app_id);
                SubLObject application_name = NIL;
                if (NIL == constant_handles.valid_constantP(app_constant, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt189$No_application_found_for__S_, app_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                application_name = tm_internals.application_name(app_constant);
                {
                    SubLObject editable_thesauri = tm_internals.declarative_editable_thesauri(app_constant);
                    SubLObject browsable_thesauri = tm_internals.declarative_browsable_thesauri(app_constant);
                    SubLObject all_thesauri = tm_internals.all_thesauri();
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(format(NIL, $str_alt211$Edit_Application__S, application_name));
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_186 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_187 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_188 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_188, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_187, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(format(NIL, $str_alt211$Edit_Application__S, application_name));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(format(NIL, $str_alt211$Edit_Application__S, application_name));
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.tm_help_link($str_alt169$tm_edit_app);
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_189 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt212$tm_handle_edit_app, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt170$edit_app, app_id, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt194$application_name, application_name, UNPROVIDED);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt107$Current_settings_for__S_are_highl, application_name);
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_190 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_191 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_192 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt213$Application_ID_);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_192, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_193 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ(application_name);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_193, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_191, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_190, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_princ($str_alt214$Choose_new_Query_or_Update_thesau);
                                                html_utilities.html_br();
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_194 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_195 = html_macros.$html_indent_table_max$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                                                        {
                                                            SubLObject indent = ONE_INTEGER;
                                                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_196 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent_row_internal(indent);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (NIL != span) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(span);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_197 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_198 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt182$Choose_Query_Thesauri_);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_198, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_199 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_macros.verify_not_within_html_pre();
                                                                                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                                                    {
                                                                                        SubLObject _prev_bind_0_200 = html_macros.$within_html_pre$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$within_html_pre$.bind(T, thread);
                                                                                            html_utilities.html_princ($str_alt65$____);
                                                                                        } finally {
                                                                                            html_macros.$within_html_pre$.rebind(_prev_bind_0_200, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_199, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_201 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt183$Choose_Update_Thesauri_);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_201, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_197, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_196, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                        {
                                                            SubLObject indent = ONE_INTEGER;
                                                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_202 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_indent_row_internal(indent);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (NIL != span) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(span);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_203 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_204 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_thesaurus.tm_thesaurus_selection(all_thesauri, browsable_thesauri, $str_alt67$browse_thesauri, UNPROVIDED);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_204, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_205 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_205, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_206 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_thesaurus.tm_thesaurus_selection(all_thesauri, editable_thesauri, $str_alt68$edit_thesauri, UNPROVIDED);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_206, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_203, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_202, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                        html_utilities.html_indent_table_internal(ZERO_INTEGER);
                                                    } finally {
                                                        html_macros.$html_indent_table_max$.rebind(_prev_bind_1_195, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_194, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_submit_input($$$Make_Changes, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_reset_input(UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_189, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_186, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_edit_app(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject app_id = html_utilities.html_extract_input($str_alt170$edit_app, args);
                SubLObject application_name = html_utilities.html_extract_input($str_alt194$application_name, args);
                SubLObject new_browse_thesaurus_names = html_utilities.html_extract_input_values($str_alt67$browse_thesauri, args);
                SubLObject new_edit_thesaurus_names = html_utilities.html_extract_input_values($str_alt68$edit_thesauri, args);
                SubLObject app_constant = html_thesaurus.tm_guess_fort(app_id);
                SubLObject ops = NIL;
                if (NIL == constant_handles.valid_constantP(app_constant, UNPROVIDED)) {
                    return html_thesaurus.tm_error($str_alt189$No_application_found_for__S_, app_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject current_browse_thesauri = tm_internals.declarative_browsable_thesauri(app_constant);
                    SubLObject current_edit_thesauri = tm_internals.declarative_editable_thesauri(app_constant);
                    SubLObject new_browse_thesauri = NIL;
                    {
                        SubLObject cdolist_list_var = new_browse_thesaurus_names;
                        SubLObject thesaurus_name = NIL;
                        for (thesaurus_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_name = cdolist_list_var.first()) {
                            {
                                SubLObject new_thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
                                if (NIL != new_thesaurus) {
                                    new_browse_thesauri = cons(new_thesaurus, new_browse_thesauri);
                                } else {
                                    return html_thesaurus.tm_error($str_alt123$_S_is_not_a_known_thesaurus_, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                    {
                        SubLObject add_browse_thesauri = set_difference(set_difference(new_browse_thesauri, current_browse_thesauri, UNPROVIDED, UNPROVIDED), tm_internals.released_thesauri(), UNPROVIDED, UNPROVIDED);
                        SubLObject delete_browse_thesauri = set_difference(set_difference(current_browse_thesauri, new_browse_thesauri, UNPROVIDED, UNPROVIDED), tm_internals.released_thesauri(), UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = add_browse_thesauri;
                            SubLObject thesaurus = NIL;
                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                {
                                    SubLObject op = tm_datastructures.get_tm_op();
                                    SubLObject op_207 = op;
                                    tm_datastructures._csetf_tm_op_opcode(op_207, $ADD);
                                    tm_datastructures._csetf_tm_op_relation(op_207, $$tmBrowsableThesauri);
                                    tm_datastructures._csetf_tm_op_inverseP(op_207, NIL);
                                    tm_datastructures._csetf_tm_op_args(op_207, list(app_constant, thesaurus));
                                    tm_datastructures._csetf_tm_op_thesaurus(op_207, tm_datastructures.$tm_mt$.getGlobalValue());
                                    tm_datastructures._csetf_tm_op_status(op_207, NIL);
                                    tm_datastructures._csetf_tm_op_verifyP(op_207, NIL);
                                    tm_datastructures._csetf_tm_op_hiddenP(op_207, T);
                                    tm_datastructures._csetf_tm_op_description(op_207, NIL);
                                    tm_datastructures._csetf_tm_op_description_args(op_207, NIL);
                                    if (NIL.isString()) {
                                        html_tm_editing.set_op_english(op_207, NIL);
                                    } else {
                                        html_tm_editing.set_op_english(op_207, UNPROVIDED);
                                    }
                                    ops = cons(op, ops);
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = delete_browse_thesauri;
                            SubLObject thesaurus = NIL;
                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                {
                                    SubLObject op = tm_datastructures.get_tm_op();
                                    SubLObject op_208 = op;
                                    tm_datastructures._csetf_tm_op_opcode(op_208, $DELETE);
                                    tm_datastructures._csetf_tm_op_relation(op_208, $$tmBrowsableThesauri);
                                    tm_datastructures._csetf_tm_op_inverseP(op_208, NIL);
                                    tm_datastructures._csetf_tm_op_args(op_208, list(app_constant, thesaurus));
                                    tm_datastructures._csetf_tm_op_thesaurus(op_208, tm_datastructures.$tm_mt$.getGlobalValue());
                                    tm_datastructures._csetf_tm_op_status(op_208, NIL);
                                    tm_datastructures._csetf_tm_op_verifyP(op_208, NIL);
                                    tm_datastructures._csetf_tm_op_hiddenP(op_208, T);
                                    tm_datastructures._csetf_tm_op_description(op_208, NIL);
                                    tm_datastructures._csetf_tm_op_description_args(op_208, NIL);
                                    if (NIL.isString()) {
                                        html_tm_editing.set_op_english(op_208, NIL);
                                    } else {
                                        html_tm_editing.set_op_english(op_208, UNPROVIDED);
                                    }
                                    ops = cons(op, ops);
                                }
                            }
                        }
                    }
                    {
                        SubLObject new_edit_thesauri = NIL;
                        {
                            SubLObject cdolist_list_var = new_edit_thesaurus_names;
                            SubLObject thesaurus_name = NIL;
                            for (thesaurus_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_name = cdolist_list_var.first()) {
                                {
                                    SubLObject new_thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
                                    if (NIL != new_thesaurus) {
                                        new_edit_thesauri = cons(new_thesaurus, new_edit_thesauri);
                                    } else {
                                        return html_thesaurus.tm_error($str_alt123$_S_is_not_a_known_thesaurus_, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                        }
                        {
                            SubLObject add_edit_thesauri = set_difference(new_edit_thesauri, current_edit_thesauri, UNPROVIDED, UNPROVIDED);
                            SubLObject delete_edit_thesauri = set_difference(current_edit_thesauri, new_edit_thesauri, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = add_edit_thesauri;
                                SubLObject thesaurus = NIL;
                                for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                    {
                                        SubLObject op = tm_datastructures.get_tm_op();
                                        SubLObject op_209 = op;
                                        tm_datastructures._csetf_tm_op_opcode(op_209, $ADD);
                                        tm_datastructures._csetf_tm_op_relation(op_209, $$tmEditorFor);
                                        tm_datastructures._csetf_tm_op_inverseP(op_209, NIL);
                                        tm_datastructures._csetf_tm_op_args(op_209, list(app_constant, thesaurus));
                                        tm_datastructures._csetf_tm_op_thesaurus(op_209, tm_datastructures.$tm_mt$.getGlobalValue());
                                        tm_datastructures._csetf_tm_op_status(op_209, NIL);
                                        tm_datastructures._csetf_tm_op_verifyP(op_209, NIL);
                                        tm_datastructures._csetf_tm_op_hiddenP(op_209, T);
                                        tm_datastructures._csetf_tm_op_description(op_209, NIL);
                                        tm_datastructures._csetf_tm_op_description_args(op_209, NIL);
                                        if (NIL.isString()) {
                                            html_tm_editing.set_op_english(op_209, NIL);
                                        } else {
                                            html_tm_editing.set_op_english(op_209, UNPROVIDED);
                                        }
                                        ops = cons(op, ops);
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = delete_edit_thesauri;
                                SubLObject thesaurus = NIL;
                                for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                    {
                                        SubLObject op = tm_datastructures.get_tm_op();
                                        SubLObject op_210 = op;
                                        tm_datastructures._csetf_tm_op_opcode(op_210, $DELETE);
                                        tm_datastructures._csetf_tm_op_relation(op_210, $$tmEditorFor);
                                        tm_datastructures._csetf_tm_op_inverseP(op_210, NIL);
                                        tm_datastructures._csetf_tm_op_args(op_210, list(app_constant, thesaurus));
                                        tm_datastructures._csetf_tm_op_thesaurus(op_210, tm_datastructures.$tm_mt$.getGlobalValue());
                                        tm_datastructures._csetf_tm_op_status(op_210, NIL);
                                        tm_datastructures._csetf_tm_op_verifyP(op_210, NIL);
                                        tm_datastructures._csetf_tm_op_hiddenP(op_210, T);
                                        tm_datastructures._csetf_tm_op_description(op_210, NIL);
                                        tm_datastructures._csetf_tm_op_description_args(op_210, NIL);
                                        if (NIL.isString()) {
                                            html_tm_editing.set_op_english(op_210, NIL);
                                        } else {
                                            html_tm_editing.set_op_english(op_210, UNPROVIDED);
                                        }
                                        ops = cons(op, ops);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == ops) {
                    return tm_manage_apps(list(format(NIL, $str_alt216$Edit_Application__S__No_changes_n, application_name)));
                }
                ops = nreverse(ops);
                thread.resetMultipleValues();
                {
                    SubLObject bad = tm_internals.check_operations(ops);
                    SubLObject good = thread.secondMultipleValue();
                    SubLObject verifyP = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == good) {
                        html_tm_editing.html_show_bad_ops_page(bad);
                    } else {
                        html_tm_editing.do_good_ops_results(bad, good, symbol_function(TM_MANAGE_APPS_GUTS), list(app_constant), format(NIL, $str_alt211$Edit_Application__S, application_name), UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_show_app(SubLObject args) {
        {
            SubLObject app_id = html_utilities.html_extract_input($str_alt173$show_app, args);
            SubLObject app_constant = html_thesaurus.tm_guess_fort(app_id);
            SubLObject application_name = NIL;
            if (NIL == constant_handles.valid_constantP(app_constant, UNPROVIDED)) {
                return html_thesaurus.tm_error($str_alt189$No_application_found_for__S_, app_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            application_name = tm_internals.application_name(app_constant);
            return tm_manage_apps(list(format(NIL, $str_alt219$Manage_Applications__Info_for__S, application_name), app_constant));
        }
    }

    public static final SubLObject tm_show_app_info(SubLObject app_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject editable_thesauri = tm_internals.declarative_editable_thesauri(app_constant);
                SubLObject browsable_thesauri = tm_internals.declarative_browsable_thesauri(app_constant);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_211 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_212 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt213$Application_ID_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_212, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_213 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(tm_internals.application_name(app_constant));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_213, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_211, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_214 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_215 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt221$Query_Thesauri_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_215, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_216 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (length(browsable_thesauri).eql(length(tm_internals.all_thesauri()))) {
                                            html_utilities.html_princ($$$All_Thesauri);
                                        } else
                                            if (NIL != browsable_thesauri) {
                                                {
                                                    SubLObject cdolist_list_var = browsable_thesauri;
                                                    SubLObject thesaurus = NIL;
                                                    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                        html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                                        html_utilities.html_br();
                                                    }
                                                }
                                            } else {
                                                html_utilities.html_princ($str_alt135$_None_);
                                                html_utilities.html_br();
                                            }

                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_216, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_214, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_217 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_218 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt222$Update_Thesauri_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_218, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_219 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (length(editable_thesauri).eql(length(tm_internals.all_thesauri()))) {
                                            html_utilities.html_princ($$$All_Thesauri);
                                        } else
                                            if (NIL == editable_thesauri) {
                                                html_utilities.html_princ($str_alt135$_None_);
                                            } else {
                                                {
                                                    SubLObject cdolist_list_var = editable_thesauri;
                                                    SubLObject thesaurus = NIL;
                                                    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                        html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
                                                        html_utilities.html_br();
                                                    }
                                                }
                                            }

                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_219, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_217, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_show_apps_for_thesaurus(SubLObject args) {
        {
            SubLObject thesaurus_name = html_utilities.html_extract_input($str_alt45$thesaurus_name, args);
            SubLObject thesaurus_constant = tm_internals.thesaurus_constant_from_name(thesaurus_name);
            if (NIL == constant_handles.valid_constantP(thesaurus_constant, UNPROVIDED)) {
                return html_thesaurus.tm_error($str_alt123$_S_is_not_a_known_thesaurus_, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return tm_thesaurus_apps_page(thesaurus_constant);
        }
    }

    public static final SubLObject tm_thesaurus_apps_info(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                SubLObject released = tm_internals.released_thesaurusP(thesaurus);
                SubLObject browsers = tm_internals.thesaurus_browsers(thesaurus, $APPLICATION);
                SubLObject editors = tm_internals.thesaurus_editors(thesaurus, $APPLICATION);
                browsers = Sort.sort(remove_if(symbol_function(NULL), browsers, symbol_function(APPLICATION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(STRING_LESSP), symbol_function(APPLICATION_NAME));
                editors = Sort.sort(remove_if(symbol_function(NULL), editors, symbol_function(APPLICATION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(STRING_LESSP), symbol_function(APPLICATION_NAME));
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_220 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_221 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt140$Thesaurus_name__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_221, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_222 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(thesaurus_name);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_222, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_220, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_223 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_224 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt141$Released___);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_224, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_225 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != released) {
                                            html_utilities.html_princ($$$Yes);
                                        } else {
                                            html_utilities.html_princ($$$No);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_225, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_223, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_226 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_227 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt225$Query_Permission__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_227, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_228 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL == browsers) {
                                            html_utilities.html_princ($$$No_Applications);
                                        }
                                        {
                                            SubLObject cdolist_list_var = browsers;
                                            SubLObject v_browser = NIL;
                                            for (v_browser = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_browser = cdolist_list_var.first()) {
                                                {
                                                    SubLObject application_name = tm_internals.application_name(v_browser);
                                                    html_utilities.html_princ(application_name);
                                                    if (NIL == tm_internals.active_entityP(v_browser)) {
                                                        html_utilities.html_princ($str_alt147$__inactive_);
                                                    }
                                                    html_utilities.html_br();
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_228, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_226, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_229 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_230 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt227$Update_Permission__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_230, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_231 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL == editors) {
                                            html_utilities.html_princ($$$No_Applications);
                                        }
                                        {
                                            SubLObject cdolist_list_var = editors;
                                            SubLObject editor = NIL;
                                            for (editor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , editor = cdolist_list_var.first()) {
                                                {
                                                    SubLObject application_name = tm_internals.application_name(editor);
                                                    html_utilities.html_princ(application_name);
                                                    if (NIL == tm_internals.active_entityP(editor)) {
                                                        html_utilities.html_princ($str_alt147$__inactive_);
                                                    }
                                                    html_utilities.html_br();
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_231, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_229, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject tm_thesaurus_apps_page(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title = format(NIL, $str_alt228$Application_permissions_with_resp, tm_internals.thesaurus_name(thesaurus));
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(title);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_232 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_233 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_234 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_234, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_233, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(title);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(title);
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                    html_utilities.html_princ($str_alt2$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt229$tm_thesaurus_apps_page);
                                    tm_thesaurus_apps_info(thesaurus);
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_232, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject declare_html_tm_users_file() {
        declareFunction("tm_manage_users", "TM-MANAGE-USERS", 0, 1, false);
        declareFunction("tm_manage_users_guts", "TM-MANAGE-USERS-GUTS", 0, 1, false);
        declareFunction("tm_manage_users_display_type", "TM-MANAGE-USERS-DISPLAY-TYPE", 1, 0, false);
        declareFunction("tm_add_user", "TM-ADD-USER", 1, 0, false);
        declareFunction("tm_handle_add_user", "TM-HANDLE-ADD-USER", 1, 0, false);
        declareFunction("tm_inactivate_user", "TM-INACTIVATE-USER", 1, 0, false);
        declareFunction("tm_really_inactivate_user", "TM-REALLY-INACTIVATE-USER", 1, 0, false);
        declareFunction("tm_reactivate_user", "TM-REACTIVATE-USER", 1, 0, false);
        declareFunction("tm_really_reactivate_user", "TM-REALLY-REACTIVATE-USER", 1, 0, false);
        declareFunction("tm_delete_user", "TM-DELETE-USER", 1, 0, false);
        declareFunction("tm_really_delete_user", "TM-REALLY-DELETE-USER", 1, 0, false);
        declareFunction("tm_edit_user", "TM-EDIT-USER", 1, 0, false);
        declareFunction("tm_handle_edit_user", "TM-HANDLE-EDIT-USER", 1, 0, false);
        declareFunction("tm_show_user", "TM-SHOW-USER", 1, 0, false);
        declareFunction("tm_show_user_info", "TM-SHOW-USER-INFO", 1, 0, false);
        declareFunction("tm_show_users_for_thesaurus", "TM-SHOW-USERS-FOR-THESAURUS", 1, 0, false);
        declareFunction("tm_thesaurus_users_info", "TM-THESAURUS-USERS-INFO", 1, 0, false);
        declareFunction("tm_thesaurus_users_page", "TM-THESAURUS-USERS-PAGE", 1, 0, false);
        declareFunction("tm_manage_apps", "TM-MANAGE-APPS", 0, 1, false);
        declareFunction("tm_manage_apps_guts", "TM-MANAGE-APPS-GUTS", 0, 1, false);
        declareFunction("tm_add_app", "TM-ADD-APP", 1, 0, false);
        declareFunction("tm_handle_add_app", "TM-HANDLE-ADD-APP", 1, 0, false);
        declareFunction("tm_inactivate_app", "TM-INACTIVATE-APP", 1, 0, false);
        declareFunction("tm_really_inactivate_app", "TM-REALLY-INACTIVATE-APP", 1, 0, false);
        declareFunction("tm_reactivate_app", "TM-REACTIVATE-APP", 1, 0, false);
        declareFunction("tm_really_reactivate_app", "TM-REALLY-REACTIVATE-APP", 1, 0, false);
        declareFunction("tm_delete_app", "TM-DELETE-APP", 1, 0, false);
        declareFunction("tm_really_delete_app", "TM-REALLY-DELETE-APP", 1, 0, false);
        declareFunction("tm_edit_app", "TM-EDIT-APP", 1, 0, false);
        declareFunction("tm_handle_edit_app", "TM-HANDLE-EDIT-APP", 1, 0, false);
        declareFunction("tm_show_app", "TM-SHOW-APP", 1, 0, false);
        declareFunction("tm_show_app_info", "TM-SHOW-APP-INFO", 1, 0, false);
        declareFunction("tm_show_apps_for_thesaurus", "TM-SHOW-APPS-FOR-THESAURUS", 1, 0, false);
        declareFunction("tm_thesaurus_apps_info", "TM-THESAURUS-APPS-INFO", 1, 0, false);
        declareFunction("tm_thesaurus_apps_page", "TM-THESAURUS-APPS-PAGE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_html_tm_users_file() {
        return NIL;
    }

    public static final SubLObject setup_html_tm_users_file() {
                html_macros.note_html_handler_function(TM_MANAGE_USERS);
        html_macros.note_html_handler_function(TM_MANAGE_USERS_DISPLAY_TYPE);
        html_macros.note_html_handler_function(TM_ADD_USER);
        html_macros.note_html_handler_function(TM_HANDLE_ADD_USER);
        html_macros.note_html_handler_function(TM_INACTIVATE_USER);
        html_macros.note_html_handler_function(TM_REALLY_INACTIVATE_USER);
        html_macros.note_html_handler_function(TM_REACTIVATE_USER);
        html_macros.note_html_handler_function(TM_REALLY_REACTIVATE_USER);
        html_macros.note_html_handler_function(TM_DELETE_USER);
        html_macros.note_html_handler_function(TM_REALLY_DELETE_USER);
        html_macros.note_html_handler_function(TM_EDIT_USER);
        html_macros.note_html_handler_function(TM_HANDLE_EDIT_USER);
        html_macros.note_html_handler_function(TM_SHOW_USER);
        html_macros.note_html_handler_function(TM_SHOW_USERS_FOR_THESAURUS);
        html_macros.note_html_handler_function(TM_MANAGE_APPS);
        html_macros.note_html_handler_function(TM_ADD_APP);
        html_macros.note_html_handler_function(TM_HANDLE_ADD_APP);
        html_macros.note_html_handler_function(TM_INACTIVATE_APP);
        html_macros.note_html_handler_function(TM_REALLY_INACTIVATE_APP);
        html_macros.note_html_handler_function(TM_REACTIVATE_APP);
        html_macros.note_html_handler_function(TM_REALLY_REACTIVATE_APP);
        html_macros.note_html_handler_function(TM_DELETE_APP);
        html_macros.note_html_handler_function(TM_REALLY_DELETE_APP);
        html_macros.note_html_handler_function(TM_EDIT_APP);
        html_macros.note_html_handler_function(TM_HANDLE_EDIT_APP);
        html_macros.note_html_handler_function(TM_SHOW_APP);
        html_macros.note_html_handler_function(TM_SHOW_APPS_FOR_THESAURUS);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $$$Manage_Users = makeString("Manage Users");

    static private final SubLString $$$administrator = makeString("administrator");

    static private final SubLString $str_alt2$Sorry__you_do_not_have_permission = makeString("Sorry, you do not have permission to access this page.");

    static private final SubLString $str_alt3$tm_manage_users = makeString("tm-manage-users");

    private static final SubLSymbol TM_MANAGE_USERS = makeSymbol("TM-MANAGE-USERS");

    private static final SubLSymbol $SHOW_BY_ID = makeKeyword("SHOW-BY-ID");

    private static final SubLSymbol USER_NAME = makeSymbol("USER-NAME");

    private static final SubLSymbol PERSONAL_NAME = makeSymbol("PERSONAL-NAME");



    static private final SubLString $str_alt9$tm_manage_users_display_type = makeString("tm-manage-users-display-type");

    static private final SubLString $str_alt10$Display_Users_By____ = makeString("Display Users By ...");

    static private final SubLString $str_alt11$display_type = makeString("display-type");

    static private final SubLString $$$ID = makeString("ID");

    static private final SubLString $$$Name = makeString("Name");

    static private final SubLString $$$Redisplay = makeString("Redisplay");

    static private final SubLString $str_alt15$tm_add_user = makeString("tm-add-user");

    static private final SubLString $str_alt16$Add_New_User_ = makeString("Add New User:");

    static private final SubLString $str_alt17$User_IDs_must_be_alphanumeric__wi = makeString("User IDs must be alphanumeric, without spaces.");

    static private final SubLString $str_alt18$Enter_ID_your_external_authentica = makeString("Enter ID your external authentication system will provide:");

    static private final SubLString $str_alt19$new_user = makeString("new-user");

    static private final SubLString $str_alt20$ = makeString("");

    static private final SubLString $$$Add = makeString("Add");



    static private final SubLString $str_alt23$Inactivate_User_ = makeString("Inactivate User:");

    static private final SubLString $str_alt24$tm_inactivate_user = makeString("tm-inactivate-user");

    static private final SubLString $str_alt25$inactivate_user = makeString("inactivate-user");

    static private final SubLString $$$Inactivate = makeString("Inactivate");

    static private final SubLString $str_alt27$Reactivate_User_ = makeString("Reactivate User:");

    static private final SubLString $str_alt28$tm_reactivate_user = makeString("tm-reactivate-user");

    static private final SubLString $str_alt29$reactivate_user = makeString("reactivate-user");

    static private final SubLString $$$Reactivate = makeString("Reactivate");

    static private final SubLString $str_alt31$Delete_User_ = makeString("Delete User:");

    static private final SubLString $str_alt32$tm_delete_user = makeString("tm-delete-user");

    static private final SubLString $str_alt33$delete_user = makeString("delete-user");

    static private final SubLString $$$Delete = makeString("Delete");

    static private final SubLString $str_alt35$Edit_User_ = makeString("Edit User:");

    static private final SubLString $str_alt36$tm_edit_user = makeString("tm-edit-user");

    static private final SubLString $str_alt37$edit_user = makeString("edit-user");

    static private final SubLString $$$Edit = makeString("Edit");

    static private final SubLString $str_alt39$Show_User_Permissions_ = makeString("Show User Permissions:");

    static private final SubLString $str_alt40$tm_show_user = makeString("tm-show-user");

    static private final SubLString $str_alt41$show_user = makeString("show-user");

    static private final SubLString $$$Show = makeString("Show");

    static private final SubLString $str_alt43$Show_User_Permissions_With_Respec = makeString("Show User Permissions With Respect to Thesaurus:");

    static private final SubLString $str_alt44$tm_show_users_for_thesaurus = makeString("tm-show-users-for-thesaurus");

    static private final SubLString $str_alt45$thesaurus_name = makeString("thesaurus-name");

    static private final SubLString $str_alt46$Manage_Users__Displaying_users_by = makeString("Manage Users: Displaying users by ~a");

    private static final SubLSymbol TM_MANAGE_USERS_DISPLAY_TYPE = makeSymbol("TM-MANAGE-USERS-DISPLAY-TYPE");

    static private final SubLString $str_alt48$You_must_give_a_non_empty_user_na = makeString("You must give a non-empty user name.");

    static private final SubLString $str_alt49$The_user_ID__S_is_already_in_use_ = makeString("The user ID ~S is already in use.");

    static private final SubLString $str_alt50$Define_User_Permissions_for__S = makeString("Define User Permissions for ~S");

    static private final SubLString $str_alt51$tm_handle_add_user = makeString("tm-handle-add-user");

    static private final SubLString $$$Add_User = makeString("Add User");

    static private final SubLString $str_alt53$Enter_the_user_s_name__ = makeString("Enter the user's name: ");

    static private final SubLString $$$name = makeString("name");

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLString $str_alt56$Please_choose_a_permission_level_ = makeString("Please choose a permission level and parameters for ~S, then click on Add User.");

    static private final SubLString $$$level = makeString("level");

    static private final SubLString $str_alt58$advanced_user = makeString("advanced-user");

    static private final SubLString $$$Advanced_User = makeString("Advanced User");

    static private final SubLString $str_alt60$Advanced_users_may_browse_all_rel = makeString("Advanced users may browse all released thesauri and specified unreleased thesauri.\n           They may view thesaurus and user statistics.  They may output browsable thesauri.");

    static private final SubLString $str_alt61$Choose_Browse_Thesauri_ = makeString("Choose Browse Thesauri:");

    static private final SubLString $str_alt62$limited_editor = makeString("limited-editor");

    static private final SubLString $$$Limited_Editor = makeString("Limited Editor");

    static private final SubLString $str_alt64$Limited_Editors_have_the_same_per = makeString("Limited Editors have the same permissions as Advanced Users, however, \n           they may also add, delete, \n           and rename terms, and edit relations among them, in the thesauri they have \n           edit access to.");

    static private final SubLString $str_alt65$____ = makeString("    ");

    static private final SubLString $str_alt66$Choose_Edit_Thesauri_ = makeString("Choose Edit Thesauri:");

    static private final SubLString $str_alt67$browse_thesauri = makeString("browse-thesauri");

    static private final SubLString $str_alt68$edit_thesauri = makeString("edit-thesauri");

    static private final SubLString $str_alt69$full_editor = makeString("full-editor");

    static private final SubLString $$$Full_Editor = makeString("Full Editor");

    static private final SubLString $str_alt71$Full_Editors_have_full_browsing_a = makeString("Full Editors have full browsing and editing capability (including\n           Advanced Editing features) for all thesauri.");

    static private final SubLString $$$Administrator = makeString("Administrator");

    static private final SubLString $str_alt73$Administrators_may_update_users__ = makeString("Administrators may update users, generate reports, edit the \n           stoplist, save state, etc., in addition to the permissions allowed Full Editors.");

    private static final SubLSymbol TM_ADD_USER = makeSymbol("TM-ADD-USER");

    static private final SubLString $$$thesauri = makeString("thesauri");

    static private final SubLString $str_alt76$_S_is_not_a_known_level_of_user_ = makeString("~S is not a known level of user.");

    static private final SubLString $str_alt77$The_name__S_is_already_taken_ = makeString("The name ~S is already taken.");

    static private final SubLString $str_alt78$User__S_Added = makeString("User ~S Added");

    private static final SubLSymbol $INVALID_THESAURUS = makeKeyword("INVALID-THESAURUS");

    static private final SubLString $str_alt80$Add_User__S_Failed__Some_thesauru = makeString("Add User ~S Failed: Some thesaurus was invalid.");

    static private final SubLString $str_alt81$Add_User__S_Failed_ = makeString("Add User ~S Failed.");

    private static final SubLSymbol TM_HANDLE_ADD_USER = makeSymbol("TM-HANDLE-ADD-USER");

    static private final SubLString $str_alt83$No_user_found_for__S_ = makeString("No user found for ~S.");

    static private final SubLString $$$Confirm_Inactivate_User = makeString("Confirm Inactivate User");

    static private final SubLString $str_alt85$Please_confirm__Inactivate_thesau = makeString("Please confirm: Inactivate thesaurus user ~S?");

    static private final SubLString $str_alt86$tm_really_inactivate_user = makeString("tm-really-inactivate-user");

    static private final SubLString $str_alt87$user_name = makeString("user-name");

    static private final SubLString $$$Do_it = makeString("Do it");

    private static final SubLSymbol TM_INACTIVATE_USER = makeSymbol("TM-INACTIVATE-USER");

    static private final SubLString $str_alt90$User__S_inactivated_ = makeString("User ~S inactivated.");

    private static final SubLSymbol TM_REALLY_INACTIVATE_USER = makeSymbol("TM-REALLY-INACTIVATE-USER");

    static private final SubLString $$$Confirm_Reactivate_User = makeString("Confirm Reactivate User");

    static private final SubLString $str_alt93$Please_confirm__Reactivate_thesau = makeString("Please confirm: Reactivate thesaurus user ~S?");

    static private final SubLString $str_alt94$tm_really_reactivate_user = makeString("tm-really-reactivate-user");

    private static final SubLSymbol TM_REACTIVATE_USER = makeSymbol("TM-REACTIVATE-USER");

    static private final SubLString $str_alt96$User__S_reactivated_ = makeString("User ~S reactivated.");

    private static final SubLSymbol TM_REALLY_REACTIVATE_USER = makeSymbol("TM-REALLY-REACTIVATE-USER");

    static private final SubLString $$$Confirm_Delete_User = makeString("Confirm Delete User");

    static private final SubLString $str_alt99$Warning__This_will_completely_rem = makeString("Warning: This will completely remove the user from the system.  If ~S has ever had editing priveleges, it is recommended that you use Inactive instead.");

    static private final SubLString $str_alt100$Do_you_really_want_to_delete_thes = makeString("Do you really want to delete thesaurus user ~S?");

    static private final SubLString $str_alt101$tm_really_delete_user = makeString("tm-really-delete-user");

    private static final SubLSymbol TM_DELETE_USER = makeSymbol("TM-DELETE-USER");

    private static final SubLSymbol TM_REALLY_DELETE_USER = makeSymbol("TM-REALLY-DELETE-USER");

    static private final SubLString $str_alt104$Edit_User__S = makeString("Edit User ~S");

    static private final SubLString $str_alt105$tm_handle_edit_user = makeString("tm-handle-edit-user");

    static private final SubLString $str_alt106$user_print_name = makeString("user-print-name");

    static private final SubLString $str_alt107$Current_settings_for__S_are_highl = makeString("Current settings for ~S are highlighted when this page first appears.");

    static private final SubLString $str_alt108$User_ID_ = makeString("User ID:");

    static private final SubLString $str_alt109$Name_of_user_ = makeString("Name of user:");

    static private final SubLString $$$Unknown = makeString("Unknown");

    static private final SubLString $str_alt111$Enter_new_user_name___ = makeString("Enter new user name:  ");

    static private final SubLString $str_alt112$new_name = makeString("new-name");

    static private final SubLString $str_alt113$Choose_level_and_parameters_ = makeString("Choose level and parameters:");

    static private final SubLString $str_alt114$ad_browse_thesauri = makeString("ad-browse-thesauri");

    static private final SubLString $$$Make_Changes = makeString("Make Changes");

    private static final SubLSymbol TM_EDIT_USER = makeSymbol("TM-EDIT-USER");

    static private final SubLString $str_alt117$Edit_User__S__No_changes_need_to_ = makeString("Edit User ~S: No changes need to be saved.");







    public static final SubLObject $$nameString = constant_handles.reader_make_constant_shell(makeString("nameString"));

    public static final SubLObject $$tmUserType = constant_handles.reader_make_constant_shell(makeString("tmUserType"));

    static private final SubLString $str_alt123$_S_is_not_a_known_thesaurus_ = makeString("~S is not a known thesaurus.");

    public static final SubLObject $$tmBrowsableThesauri = constant_handles.reader_make_constant_shell(makeString("tmBrowsableThesauri"));

    public static final SubLObject $$tmEditorFor = constant_handles.reader_make_constant_shell(makeString("tmEditorFor"));

    private static final SubLSymbol TM_MANAGE_USERS_GUTS = makeSymbol("TM-MANAGE-USERS-GUTS");

    private static final SubLSymbol TM_HANDLE_EDIT_USER = makeSymbol("TM-HANDLE-EDIT-USER");

    static private final SubLString $str_alt128$Manage_Users__Info_for__S = makeString("Manage Users: Info for ~S");

    private static final SubLSymbol TM_SHOW_USER = makeSymbol("TM-SHOW-USER");

    static private final SubLString $str_alt130$Level_ = makeString("Level:");

    static private final SubLString $str_alt131$_ = makeString("-");



    static private final SubLString $str_alt133$Browse_Thesauri_ = makeString("Browse Thesauri:");

    static private final SubLString $$$All_Thesauri = makeString("All Thesauri");

    static private final SubLString $str_alt135$_None_ = makeString("(None)");

    static private final SubLString $str_alt136$Edit_Thesauri_ = makeString("Edit Thesauri:");



    private static final SubLSymbol TM_SHOW_USERS_FOR_THESAURUS = makeSymbol("TM-SHOW-USERS-FOR-THESAURUS");



    static private final SubLString $str_alt140$Thesaurus_name__ = makeString("Thesaurus name: ");

    static private final SubLString $str_alt141$Released___ = makeString("Released?: ");

    static private final SubLString $$$Yes = makeString("Yes");

    static private final SubLString $$$No = makeString("No");

    static private final SubLString $str_alt144$Browsers__ = makeString("Browsers: ");

    static private final SubLString $$$All_Users = makeString("All Users");

    static private final SubLString $$$No_Users = makeString("No Users");

    static private final SubLString $str_alt147$__inactive_ = makeString(" (inactive)");

    static private final SubLString $str_alt148$Editors__ = makeString("Editors: ");

    static private final SubLString $str_alt149$User_permissions_with_respect_to_ = makeString("User permissions with respect to ~A");

    static private final SubLString $str_alt150$tm_thesaurus_users_page = makeString("tm-thesaurus-users-page");

    static private final SubLString $$$Manage_Applications = makeString("Manage Applications");

    static private final SubLString $str_alt152$tm_manage_apps = makeString("tm-manage-apps");

    private static final SubLSymbol TM_MANAGE_APPS = makeSymbol("TM-MANAGE-APPS");



    static private final SubLString $str_alt155$tm_add_app = makeString("tm-add-app");

    static private final SubLString $str_alt156$Register_New_Application_ = makeString("Register New Application:");

    static private final SubLString $str_alt157$Application_IDs_must_be_alphanume = makeString("Application IDs must be alphanumeric, without spaces.");

    static private final SubLString $str_alt158$new_app = makeString("new-app");

    static private final SubLString $str_alt159$Inactivate_Application_ = makeString("Inactivate Application:");

    static private final SubLString $str_alt160$tm_inactivate_app = makeString("tm-inactivate-app");

    static private final SubLString $str_alt161$inactivate_app = makeString("inactivate-app");

    static private final SubLString $str_alt162$Reactivate_Application_ = makeString("Reactivate Application:");

    static private final SubLString $str_alt163$tm_reactivate_app = makeString("tm-reactivate-app");

    static private final SubLString $str_alt164$reactivate_app = makeString("reactivate-app");

    static private final SubLString $str_alt165$Delete_Application_ = makeString("Delete Application:");

    static private final SubLString $str_alt166$tm_delete_app = makeString("tm-delete-app");

    static private final SubLString $str_alt167$delete_app = makeString("delete-app");

    static private final SubLString $str_alt168$Edit_Application_ = makeString("Edit Application:");

    static private final SubLString $str_alt169$tm_edit_app = makeString("tm-edit-app");

    static private final SubLString $str_alt170$edit_app = makeString("edit-app");

    static private final SubLString $str_alt171$Show_Application_Permissions_ = makeString("Show Application Permissions:");

    static private final SubLString $str_alt172$tm_show_app = makeString("tm-show-app");

    static private final SubLString $str_alt173$show_app = makeString("show-app");

    static private final SubLString $str_alt174$Show_Application_Permissions_With = makeString("Show Application Permissions With Respect to Thesaurus:");

    static private final SubLString $str_alt175$tm_show_apps_for_thesaurus = makeString("tm-show-apps-for-thesaurus");

    static private final SubLString $str_alt176$You_must_give_a_non_empty_ID_for_ = makeString("You must give a non-empty ID for the application.");

    static private final SubLString $str_alt177$The_application_ID__S_is_already_ = makeString("The application ID ~S is already in use.");

    static private final SubLString $str_alt178$Define_Application_Permissions_fo = makeString("Define Application Permissions for ~S");

    static private final SubLString $str_alt179$tm_handle_add_app = makeString("tm-handle-add-app");

    static private final SubLString $$$Add_Application = makeString("Add Application");

    static private final SubLString $str_alt181$Please_select_the_thesauri__S_sho = makeString("Please select the thesauri ~S should be able to access; then click on Add Application.");

    static private final SubLString $str_alt182$Choose_Query_Thesauri_ = makeString("Choose Query Thesauri:");

    static private final SubLString $str_alt183$Choose_Update_Thesauri_ = makeString("Choose Update Thesauri:");

    private static final SubLSymbol TM_ADD_APP = makeSymbol("TM-ADD-APP");

    static private final SubLString $str_alt185$Application__S_Added = makeString("Application ~S Added");

    static private final SubLString $str_alt186$Add_Application__S_Failed__Some_t = makeString("Add Application ~S Failed: Some thesaurus was invalid.");

    static private final SubLString $str_alt187$Add_Application__S_Failed_ = makeString("Add Application ~S Failed.");

    private static final SubLSymbol TM_HANDLE_ADD_APP = makeSymbol("TM-HANDLE-ADD-APP");

    static private final SubLString $str_alt189$No_application_found_for__S_ = makeString("No application found for ~S.");

    static private final SubLString $$$Confirm_Inactivate_Application = makeString("Confirm Inactivate Application");

    static private final SubLString $str_alt191$Please_confirm__Inactivate_thesau = makeString("Please confirm: Inactivate thesaurus application ~S?");

    static private final SubLString $str_alt192$tm_really_inactivate_app = makeString("tm-really-inactivate-app");

    static private final SubLString $str_alt193$Inactivate_app = makeString("Inactivate-app");

    static private final SubLString $str_alt194$application_name = makeString("application-name");

    private static final SubLSymbol TM_INACTIVATE_APP = makeSymbol("TM-INACTIVATE-APP");

    static private final SubLString $str_alt196$App__S_inactivated_ = makeString("App ~S inactivated.");

    private static final SubLSymbol TM_REALLY_INACTIVATE_APP = makeSymbol("TM-REALLY-INACTIVATE-APP");

    static private final SubLString $$$Confirm_Reactivate_Application = makeString("Confirm Reactivate Application");

    static private final SubLString $str_alt199$Please_confirm__Reactivate_thesau = makeString("Please confirm: Reactivate thesaurus application ~S?");

    static private final SubLString $str_alt200$tm_really_reactivate_app = makeString("tm-really-reactivate-app");

    private static final SubLSymbol TM_REACTIVATE_APP = makeSymbol("TM-REACTIVATE-APP");

    static private final SubLString $str_alt202$Application__S_reactivated_ = makeString("Application ~S reactivated.");

    private static final SubLSymbol TM_REALLY_REACTIVATE_APP = makeSymbol("TM-REALLY-REACTIVATE-APP");

    static private final SubLString $$$Confirm_Delete_Application = makeString("Confirm Delete Application");

    static private final SubLString $str_alt205$Warning__This_will_completely_rem = makeString("Warning: This will completely remove the application from the system.  If ~S has ever had Update priveleges, it is recommended that you use Inactive instead.");

    static private final SubLString $str_alt206$Do_you_really_want_to_delete_thes = makeString("Do you really want to delete thesaurus application ~S?");

    static private final SubLString $str_alt207$tm_really_delete_app = makeString("tm-really-delete-app");

    private static final SubLSymbol TM_DELETE_APP = makeSymbol("TM-DELETE-APP");

    static private final SubLString $str_alt209$Application__S_inactivated_ = makeString("Application ~S inactivated.");

    private static final SubLSymbol TM_REALLY_DELETE_APP = makeSymbol("TM-REALLY-DELETE-APP");

    static private final SubLString $str_alt211$Edit_Application__S = makeString("Edit Application ~S");

    static private final SubLString $str_alt212$tm_handle_edit_app = makeString("tm-handle-edit-app");

    static private final SubLString $str_alt213$Application_ID_ = makeString("Application ID:");

    static private final SubLString $str_alt214$Choose_new_Query_or_Update_thesau = makeString("Choose new Query or Update thesauri.");

    private static final SubLSymbol TM_EDIT_APP = makeSymbol("TM-EDIT-APP");

    static private final SubLString $str_alt216$Edit_Application__S__No_changes_n = makeString("Edit Application ~S: No changes need to be saved.");

    private static final SubLSymbol TM_MANAGE_APPS_GUTS = makeSymbol("TM-MANAGE-APPS-GUTS");

    private static final SubLSymbol TM_HANDLE_EDIT_APP = makeSymbol("TM-HANDLE-EDIT-APP");

    static private final SubLString $str_alt219$Manage_Applications__Info_for__S = makeString("Manage Applications: Info for ~S");

    private static final SubLSymbol TM_SHOW_APP = makeSymbol("TM-SHOW-APP");

    static private final SubLString $str_alt221$Query_Thesauri_ = makeString("Query Thesauri:");

    static private final SubLString $str_alt222$Update_Thesauri_ = makeString("Update Thesauri:");

    private static final SubLSymbol TM_SHOW_APPS_FOR_THESAURUS = makeSymbol("TM-SHOW-APPS-FOR-THESAURUS");



    static private final SubLString $str_alt225$Query_Permission__ = makeString("Query Permission: ");

    static private final SubLString $$$No_Applications = makeString("No Applications");

    static private final SubLString $str_alt227$Update_Permission__ = makeString("Update Permission: ");

    static private final SubLString $str_alt228$Application_permissions_with_resp = makeString("Application permissions with respect to ~A");

    static private final SubLString $str_alt229$tm_thesaurus_apps_page = makeString("tm-thesaurus-apps-page");

    // // Initializers
    public void declareFunctions() {
        declare_html_tm_users_file();
    }

    public void initializeVariables() {
        init_html_tm_users_file();
    }

    public void runTopLevelForms() {
        setup_html_tm_users_file();
    }
}

