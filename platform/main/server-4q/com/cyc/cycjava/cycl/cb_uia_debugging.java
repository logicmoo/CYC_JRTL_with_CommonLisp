/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.evenp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-UIA-DEBUGGING
 *  source file: /cyc/top/cycl/cb-uia-debugging.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_uia_debugging extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_debugging() {
    }

    public static final SubLFile me = new cb_uia_debugging();


    // // Definitions
    public static final SubLObject html_princ_title_only(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject title = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    title = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(PROGN, listS(HTML_STRONG, list(HTML_PRINC, title), $list_alt4), append(body, $list_alt5));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject html_princ_title_and_object(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject title = NIL;
            SubLObject v_object = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            title = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt6);
            v_object = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(HTML_PRINC_TITLE_ONLY, list(title), list(HTML_PRINC, v_object));
            } else {
                cdestructuring_bind_error(datum, $list_alt6);
            }
        }
        return NIL;
    }

    public static final SubLObject html_prin1_title_and_object(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject title = NIL;
            SubLObject v_object = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            title = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt6);
            v_object = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(HTML_PRINC_TITLE_ONLY, list(title), list(HTML_PRIN1, v_object));
            } else {
                cdestructuring_bind_error(datum, $list_alt6);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_debug_title_and_object(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject title = NIL;
            SubLObject v_object = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            title = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt6);
            v_object = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(HTML_PRINC_TITLE_ONLY, list(title), list(CB_UIA_DEBUG, v_object));
            } else {
                cdestructuring_bind_error(datum, $list_alt6);
            }
        }
        return NIL;
    }

    // deflexical
    public static final SubLSymbol $cb_uia_debug_method_table$ = makeSymbol("*CB-UIA-DEBUG-METHOD-TABLE*");

    public static final SubLObject cb_uia_debug(SubLObject v_object) {
        {
            SubLObject method_function = method_func(v_object, $cb_uia_debug_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, v_object);
            }
            return html_utilities.html_prin1(v_object);
        }
    }

    public static final SubLObject cb_uia_debug_interaction(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                        SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt12$USER_INTERACTION);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        cb_utilities.cb_link($UIA_REJECT_INTERACTION, interaction, $str_alt14$_Reject_this_interaction_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        cb_utilities.cb_link($REPORT_PROBLEM, interaction, $str_alt16$_Report_Problem_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, user_interaction_agenda.ui_id(interaction));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Agenda);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(user_interaction_agenda.ui_agenda(interaction));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Mode);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_prin1(user_interaction_agenda.ui_mode(interaction));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Status);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_prin1(user_interaction_agenda.ui_status(interaction));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Start_time);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject start_time = user_interaction_agenda.ui_start_time(interaction);
                                            html_utilities.html_princ(numeric_date_utilities.timestring(start_time));
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Finish_time);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject finish_time = user_interaction_agenda.ui_finish_time(interaction);
                                            if (NIL == finish_time) {
                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                html_utilities.html_princ($$$none);
                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            } else {
                                                html_utilities.html_princ(numeric_date_utilities.timestring(finish_time));
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Parent);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject parent = user_interaction_agenda.ui_parent_interaction(interaction);
                                            if (NIL == parent) {
                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                html_utilities.html_princ($$$none);
                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            } else {
                                                cb_uia_debug(parent);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Children);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject children = user_interaction_agenda.ui_child_interactions(interaction);
                                            if (NIL == children) {
                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                html_utilities.html_princ($$$none);
                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            } else {
                                                {
                                                    SubLObject cdolist_list_var = children;
                                                    SubLObject child = NIL;
                                                    for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                                        html_utilities.html_indent(TWO_INTEGER);
                                                        cb_uia_debug(child);
                                                    }
                                                }
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Operator);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_prin1(user_interaction_agenda.ui_operator(interaction));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Arguments);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = user_interaction_agenda.ui_args(interaction);
                                            SubLObject arg = NIL;
                                            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(arg);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Result);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(user_interaction_agenda.ui_result(interaction));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$State);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject state = user_interaction_agenda.ui_state(interaction);
                                            if (NIL == state) {
                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                html_utilities.html_princ($$$none);
                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            } else {
                                                {
                                                    SubLObject remainder = NIL;
                                                    for (remainder = state; NIL != remainder; remainder = cddr(remainder)) {
                                                        {
                                                            SubLObject property = remainder.first();
                                                            SubLObject value = cadr(remainder);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            html_utilities.html_prin1(property);
                                                            html_utilities.html_princ($str_alt18$__);
                                                            cb_uia_debug(value);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_interaction(SubLObject v_object, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, USER_INTERACTION_P);
            {
                SubLObject id = user_interaction_agenda.ui_id(v_object);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt35$cb_uia_debug_interaction__A, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != linktext) {
                            html_utilities.html_princ(linktext);
                        } else {
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt36$_UI__A_, id);
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_user_interaction_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_INTERACTION, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_agenda(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject meta_agenda = cb_user_interaction_agenda.cb_current_uima();
                        SubLObject v_agenda = user_interaction_agenda.uima_find_by_id_string(meta_agenda, id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt40$USER_INTERACTION_AGENDA);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, user_interaction_agenda.uia_id(v_agenda));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt41$Meta_Agenda);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(user_interaction_agenda.uia_meta_agenda(v_agenda));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ISG);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(user_interaction_agenda.uia_isg(v_agenda));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Index);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(user_interaction_agenda.uia_index(v_agenda));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$History);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(user_interaction_agenda.uia_history(v_agenda));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Undos);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(user_interaction_agenda.uia_undos(v_agenda));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Messages);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(user_interaction_agenda.uia_messages(v_agenda));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Requirements);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(user_interaction_agenda.uia_requirements(v_agenda));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Relevant_Suggestions);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(user_interaction_agenda.uia_relevant_suggestions(v_agenda));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Possible_Suggestions);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(user_interaction_agenda.uia_possible_suggestions(v_agenda));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Comments);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(user_interaction_agenda.uia_comments(v_agenda));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$State);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject state = user_interaction_agenda.uia_state(v_agenda);
                                            if (NIL == state) {
                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                html_utilities.html_princ($$$none);
                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            } else {
                                                {
                                                    SubLObject remainder = NIL;
                                                    for (remainder = state; NIL != remainder; remainder = cddr(remainder)) {
                                                        {
                                                            SubLObject property = remainder.first();
                                                            SubLObject value = cadr(remainder);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            html_utilities.html_prin1(property);
                                                            html_utilities.html_princ($str_alt18$__);
                                                            cb_uia_debug(value);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_agenda(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
            {
                SubLObject id = user_interaction_agenda.uia_id(v_object);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt53$cb_uia_debug_agenda__A, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt54$_UIA__A_, id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_user_interaction_agenda_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_AGENDA, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_meta_agenda(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject meta_agenda = cb_user_interaction_agenda.cb_current_uima();
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                    cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                }
                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                    html_script_utilities.cb_hoverover_page_init();
                                }
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt58$USER_INTERACTION_META_AGENDA);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($$$ID);
                                html_utilities.html_princ($str_alt18$__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, user_interaction_agenda.uima_id(meta_agenda));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($$$ISG);
                                html_utilities.html_princ($str_alt18$__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(user_interaction_agenda.uima_isg(meta_agenda));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($$$Index);
                                html_utilities.html_princ($str_alt18$__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(user_interaction_agenda.uima_index(meta_agenda));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($$$Open_Agendas);
                                html_utilities.html_princ($str_alt18$__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(user_interaction_agenda.uima_open_agendas(meta_agenda));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($$$Current_Agenda);
                                html_utilities.html_princ($str_alt18$__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(user_interaction_agenda.uima_current_agenda(meta_agenda));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($$$State);
                                html_utilities.html_princ($str_alt18$__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                {
                                    SubLObject state = user_interaction_agenda.uima_state(meta_agenda);
                                    if (NIL == state) {
                                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_utilities.html_princ($$$none);
                                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                    } else {
                                        {
                                            SubLObject remainder = NIL;
                                            for (remainder = state; NIL != remainder; remainder = cddr(remainder)) {
                                                {
                                                    SubLObject property = remainder.first();
                                                    SubLObject value = cadr(remainder);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_utilities.html_prin1(property);
                                                    html_utilities.html_princ($str_alt18$__);
                                                    cb_uia_debug(value);
                                                }
                                            }
                                        }
                                    }
                                }
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
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

    public static final SubLObject cb_link_uia_debug_meta_agenda(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, USER_INTERACTION_META_AGENDA_P);
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt63$cb_uia_debug_meta_agenda);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($str_alt64$_UIMA_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_user_interaction_meta_agenda_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_META_AGENDA, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_sf_state(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject sf_state = rkf_solution_finder.sf_find_state_by_id_string(id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt68$SF_STATE);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, rkf_solution_finder.sf_state_id(sf_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Interaction);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_solution_finder.sf_state_interaction(sf_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Text);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_princ(rkf_solution_finder.sf_state_text(sf_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Query);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_solution_finder.sf_state_query(sf_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Inference_Parameters);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_prin1(rkf_solution_finder.sf_state_inference_params(sf_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Inference);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_solution_finder.sf_state_inference(sf_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Solution_Queue);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_solution_finder.sf_state_solution_queue(sf_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Status);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject status = rkf_solution_finder.sf_state_status(sf_state);
                                            if (NIL == status) {
                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                html_utilities.html_princ($$$none);
                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            } else {
                                                {
                                                    SubLObject remainder = NIL;
                                                    for (remainder = status; NIL != remainder; remainder = cddr(remainder)) {
                                                        {
                                                            SubLObject property = remainder.first();
                                                            SubLObject value = cadr(remainder);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            html_utilities.html_princ(property);
                                                            html_utilities.html_indent(FIVE_INTEGER);
                                                            html_utilities.html_princ(value);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt75$Pros_Cons);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject pros_cons = rkf_solution_finder.sf_state_pros_cons(sf_state);
                                            if (NIL != pros_cons) {
                                                {
                                                    SubLObject datum_5 = pros_cons;
                                                    SubLObject current_6 = datum_5;
                                                    SubLObject pros = NIL;
                                                    SubLObject cons = NIL;
                                                    destructuring_bind_must_consp(current_6, datum_5, $list_alt76);
                                                    pros = current_6.first();
                                                    current_6 = current_6.rest();
                                                    destructuring_bind_must_consp(current_6, datum_5, $list_alt76);
                                                    cons = current_6.first();
                                                    current_6 = current_6.rest();
                                                    if (NIL == current_6) {
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_utilities.html_indent(FIVE_INTEGER);
                                                        html_utilities.html_princ($str_alt77$Pros_);
                                                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = pros;
                                                                    SubLObject pro = NIL;
                                                                    for (pro = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pro = cdolist_list_var.first()) {
                                                                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_princ(pro);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_utilities.html_indent(FIVE_INTEGER);
                                                        html_utilities.html_princ($str_alt78$Cons_);
                                                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = cons;
                                                                    SubLObject con = NIL;
                                                                    for (con = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , con = cdolist_list_var.first()) {
                                                                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_princ(con);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                                                    } else {
                                                        cdestructuring_bind_error(datum_5, $list_alt76);
                                                    }
                                                }
                                            } else {
                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                html_utilities.html_princ($$$none);
                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_sf_state(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, SF_STATE_P);
            {
                SubLObject id = rkf_solution_finder.sf_state_id(v_object);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt81$cb_uia_debug_sf_state__A, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt82$_SF__A_, id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_sf_state_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_SF_STATE, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_qc_state(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject qc_state = rkf_query_constructor.qc_find_state_by_id_string(id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt86$QC_STATE);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, rkf_query_constructor.qc_state_id(qc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Interaction);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_query_constructor.qc_state_interaction(qc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Text);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_princ(rkf_query_constructor.qc_state_text(qc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Candidates);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_query_constructor.qc_state_candidates(qc_state);
                                            SubLObject candidate = NIL;
                                            for (candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(candidate);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Query);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_query_constructor.qc_state_query(qc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Parsing_Mt);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_query_constructor.qc_state_parsing_mt(qc_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Generation_Mt);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_query_constructor.qc_state_generation_mt(qc_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Domain_Mt);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_query_constructor.qc_state_domain_mt(qc_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Interaction_Mt);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_query_constructor.qc_state_domain_interaction_mt(qc_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_qc_state(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, QC_STATE_P);
            {
                SubLObject id = rkf_query_constructor.qc_state_id(v_object);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt94$cb_uia_debug_qc_state__A, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt95$_QC__A_, id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_qc_state_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_QC_STATE, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_qc_query(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject qc_query = rkf_query_constructor.qc_find_query_by_id_string(id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt99$QC_QUERY);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, rkf_query_constructor.qc_query_id(qc_query));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$CycL);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_query_constructor.qc_query_cycl(qc_query), ZERO_INTEGER, T);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Terms);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_query_constructor.qc_query_terms(qc_query);
                                            SubLObject indexical_record = NIL;
                                            for (indexical_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_record = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(indexical_record);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Return_Terms);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_query_constructor.qc_query_return_terms(qc_query);
                                            SubLObject indexical_record = NIL;
                                            for (indexical_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_record = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(indexical_record);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Constraints);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_query_constructor.qc_query_constraints(qc_query);
                                            SubLObject constraint_record = NIL;
                                            for (constraint_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_record = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(constraint_record);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Var_Map);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var = rkf_query_constructor.qc_query_var_map(qc_query);
                                                    SubLObject item = NIL;
                                                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject datum_14 = item;
                                                            SubLObject current_15 = datum_14;
                                                            SubLObject el_var = NIL;
                                                            SubLObject indexical_record = NIL;
                                                            destructuring_bind_must_consp(current_15, datum_14, $list_alt105);
                                                            el_var = current_15.first();
                                                            current_15 = current_15.rest();
                                                            destructuring_bind_must_consp(current_15, datum_14, $list_alt105);
                                                            indexical_record = current_15.first();
                                                            current_15 = current_15.rest();
                                                            if (NIL == current_15) {
                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_princ(el_var);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                cb_uia_debug(indexical_record);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            } else {
                                                                cdestructuring_bind_error(datum_14, $list_alt105);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Scenario);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_query_constructor.qc_query_scenario(qc_query));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Assumed_Terms);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_query_constructor.qc_query_assumed_terms(qc_query);
                                            SubLObject assumed_term = NIL;
                                            for (assumed_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assumed_term = cdolist_list_var.first()) {
                                                cb_uia_debug(assumed_term);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Assumed_Constraints);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_query_constructor.qc_query_assumed_constraints(qc_query);
                                            SubLObject assumed_constraint = NIL;
                                            for (assumed_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assumed_constraint = cdolist_list_var.first()) {
                                                cb_uia_debug(assumed_constraint);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_qc_query(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, QC_QUERY_P);
            {
                SubLObject id = rkf_query_constructor.qc_query_id(v_object);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt111$cb_uia_debug_qc_query__A, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt112$_QC_QUERY__A_, id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_qc_query_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_QC_QUERY, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_sc_state(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject sc_state = rkf_scenario_constructor.sc_find_state_by_id_string(id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt116$SC_STATE);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, rkf_scenario_constructor.sc_state_id(sc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Interaction);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_scenario_constructor.sc_state_interaction(sc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Active_Session);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_scenario_constructor.sc_state_active_session(sc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Construction_Sessions);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_constructor.sc_state_construction_sessions(sc_state);
                                            SubLObject session = NIL;
                                            for (session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , session = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(session);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Browsing_Sessions);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_constructor.sc_state_browsing_sessions(sc_state);
                                            SubLObject session = NIL;
                                            for (session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , session = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(session);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Merge_Info);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_scenario_constructor.sc_state_merge_info(sc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Parsing_Mt);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_scenario_constructor.sc_state_parsing_mt(sc_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Generation_Mt);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_scenario_constructor.sc_state_generation_mt(sc_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Domain_Mt);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_scenario_constructor.sc_state_domain_mt(sc_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Domain_Interaction_Mt);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_scenario_constructor.sc_state_domain_interaction_mt(sc_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Scenario_Interaction_Mt);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_scenario_constructor.sc_state_scenario_interaction_mt(sc_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_sc_state(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, SC_STATE_P);
            {
                SubLObject id = rkf_scenario_constructor.sc_state_id(v_object);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt125$cb_uia_debug_sc_state__A, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt126$_SC__A_, id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_sc_state_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_SC_STATE, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_sc_session(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject sc_session = rkf_scenario_constructor.sc_find_session_by_id_string(id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt130$SC_SESSION);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, rkf_scenario_constructor.sc_session_id(sc_session));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$State);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_scenario_constructor.sc_session_state(sc_session));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Phrase);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_princ(rkf_scenario_constructor.sc_session_phrase(sc_session));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Candidate_Scenarios);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_constructor.sc_session_candidate_scenarios(sc_session);
                                            SubLObject v_scenario = NIL;
                                            for (v_scenario = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_scenario = cdolist_list_var.first()) {
                                                cb_uia_debug(v_scenario);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Permission);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_princ(rkf_scenario_constructor.sc_session_permission(sc_session));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Scenario);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_scenario_constructor.sc_session_scenario(sc_session));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_sc_session(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, SC_SESSION_P);
            {
                SubLObject id = rkf_scenario_constructor.sc_session_id(v_object);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt136$cb_uia_debug_sc_session__A, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt137$_SC_SESSION__A_, id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_sc_session_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_SC_SESSION, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_sm_scenario(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject sm_scenario = rkf_scenario_manipulator.sm_find_scenario_by_id_string(id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt141$SM_SCENARIO);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, rkf_scenario_manipulator.sm_scenario_id(sm_scenario));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Sessions);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_manipulator.sm_scenario_sessions(sm_scenario);
                                            SubLObject session = NIL;
                                            for (session = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , session = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(session);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Phrase);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_princ(rkf_scenario_manipulator.sm_scenario_phrase(sm_scenario));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Candidate_Terms);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_manipulator.sm_scenario_candidate_terms(sm_scenario);
                                            SubLObject indexical_record = NIL;
                                            for (indexical_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_record = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(indexical_record);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Candidate_Constraints);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_manipulator.sm_scenario_candidate_constraints(sm_scenario);
                                            SubLObject constraint_record = NIL;
                                            for (constraint_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_record = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(constraint_record);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Fort);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_scenario_manipulator.sm_scenario_fort(sm_scenario), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Terms);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_manipulator.sm_scenario_terms(sm_scenario);
                                            SubLObject indexical_record = NIL;
                                            for (indexical_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_record = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(indexical_record);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Constraints);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_manipulator.sm_scenario_constraints(sm_scenario);
                                            SubLObject constraint_record = NIL;
                                            for (constraint_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_record = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(constraint_record);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Templates);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_manipulator.sm_scenario_templates(sm_scenario);
                                            SubLObject template = NIL;
                                            for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(template);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_sm_scenario(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, SM_SCENARIO_P);
            {
                SubLObject id = rkf_scenario_manipulator.sm_scenario_id(v_object);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt149$cb_uia_debug_sm_scenario__A, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt150$_SM_SCENARIO__A_, id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_sm_scenario_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_SM_SCENARIO, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_sm_indexical_record(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject sm_indexical_record = rkf_scenario_manipulator.sm_find_indexical_record_by_id_string(id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt154$SM_INDEXICAL_RECORD);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, rkf_scenario_manipulator.sm_indexical_record_id(sm_indexical_record));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Indexical);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_scenario_manipulator.sm_indexical_record_indexical(sm_indexical_record), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Phrases);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_manipulator.sm_indexical_record_phrases(sm_indexical_record);
                                            SubLObject phrase = NIL;
                                            for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                html_utilities.html_princ(phrase);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Var);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_princ(rkf_scenario_manipulator.sm_indexical_record_var(sm_indexical_record));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Explicit_Isas);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_manipulator.sm_indexical_record_explicit_isas(sm_indexical_record);
                                            SubLObject v_isa = NIL;
                                            for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_utilities.cb_form(v_isa, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Explicit_Genls);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_manipulator.sm_indexical_record_explicit_genls(sm_indexical_record);
                                            SubLObject genl = NIL;
                                            for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_utilities.cb_form(genl, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$All_Isas);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_manipulator.sm_indexical_record_isas(sm_indexical_record);
                                            SubLObject v_isa = NIL;
                                            for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_utilities.cb_form(v_isa, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$All_Genls);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_scenario_manipulator.sm_indexical_record_genls(sm_indexical_record);
                                            SubLObject genl = NIL;
                                            for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_utilities.cb_form(genl, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_sm_indexical_record(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, SM_INDEXICAL_RECORD_P);
            {
                SubLObject id = rkf_scenario_manipulator.sm_indexical_record_id(v_object);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt164$cb_uia_debug_sm_indexical_record_, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt165$_SC_IR__A_, id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_sm_indexical_record_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_SM_INDEXICAL_RECORD, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_sm_constraint_record(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject sm_constraint_record = rkf_scenario_manipulator.sm_find_constraint_record_by_id_string(id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt169$SM_CONSTRAINT_RECORD);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, rkf_scenario_manipulator.sm_constraint_record_id(sm_constraint_record));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Sentence);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_scenario_manipulator.sm_constraint_record_sentence(sm_constraint_record), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$NL_Sentence);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_princ(rkf_scenario_manipulator.sm_constraint_record_nl_sentence(sm_constraint_record));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_sm_constraint_record(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, SM_CONSTRAINT_RECORD_P);
            {
                SubLObject id = rkf_scenario_manipulator.sm_constraint_record_id(v_object);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt174$cb_uia_debug_sm_constraint_record, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt175$_SC_CR__A_, id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_sm_constraint_record_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_SM_CONSTRAINT_RECORD, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_sm_merge_info(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject sm_merge_info = rkf_scenario_manipulator.sm_find_merge_info_by_id_string(id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt179$SM_MERGE_INFO);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, rkf_scenario_manipulator.sm_merge_info_id(sm_merge_info));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$From_Scenario);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_scenario_manipulator.sm_merge_info_from_scenario(sm_merge_info));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$To_Scenario);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_scenario_manipulator.sm_merge_info_to_scenario(sm_merge_info));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Align_To);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_scenario_manipulator.sm_merge_info_align_to(sm_merge_info));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Align_From);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_scenario_manipulator.sm_merge_info_align_from(sm_merge_info));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Indexical_Equivalences);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject equivalences = rkf_scenario_manipulator.sm_merge_info_indexical_equivalences(sm_merge_info);
                                            if (NIL == equivalences) {
                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                html_utilities.html_princ($$$none);
                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            } else {
                                                {
                                                    SubLObject list_var = NIL;
                                                    SubLObject equivalence = NIL;
                                                    SubLObject index = NIL;
                                                    for (list_var = equivalences, equivalence = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , equivalence = list_var.first() , index = add(ONE_INTEGER, index)) {
                                                        if (NIL != evenp(index)) {
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            cb_uia_debug(equivalence.first());
                                                        } else {
                                                            cb_uia_debug(second(equivalence));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_sm_merge_info(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, SM_MERGE_INFO_P);
            {
                SubLObject id = rkf_scenario_manipulator.sm_merge_info_id(v_object);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt187$cb_uia_debug_sm_merge_info__A, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt188$_SC_MI__A_, id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_sm_merge_info_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_SM_MERGE_INFO, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_rc_state(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject rc_state = rkf_rule_constructor.rc_find_state_by_id_string(id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt192$RC_STATE);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, rkf_rule_constructor.rc_state_id(rc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Text);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_princ(rkf_rule_constructor.rc_state_text(rc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Interaction);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_rule_constructor.rc_state_interaction(rc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt193$If_Scenario);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_rule_constructor.rc_state_if_scenario(rc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt194$Then_Scenario);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_rule_constructor.rc_state_then_scenario(rc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$LHS);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_rule_constructor.rc_state_lhs(rc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$RHS);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_rule_constructor.rc_state_rhs(rc_state));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Parsing_Mt);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_rule_constructor.rc_state_parsing_mt(rc_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Generation_Mt);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_rule_constructor.rc_state_generation_mt(rc_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Domain_Mt);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_rule_constructor.rc_state_domain_mt(rc_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Interaction_Mt);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_utilities.cb_form(rkf_rule_constructor.rc_state_domain_interaction_mt(rc_state), UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt197$Var_Map);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_rule_constructor.rc_state_var_map(rc_state);
                                            SubLObject var_map_entry = NIL;
                                            for (var_map_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var_map_entry = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum_26 = var_map_entry;
                                                    SubLObject current_27 = datum_26;
                                                    SubLObject el_variable = NIL;
                                                    SubLObject indexical_record = NIL;
                                                    destructuring_bind_must_consp(current_27, datum_26, $list_alt198);
                                                    el_variable = current_27.first();
                                                    current_27 = current_27.rest();
                                                    destructuring_bind_must_consp(current_27, datum_26, $list_alt198);
                                                    indexical_record = current_27.first();
                                                    current_27 = current_27.rest();
                                                    if (NIL == current_27) {
                                                        html_utilities.html_indent(TWO_INTEGER);
                                                        cb_uia_debug(el_variable);
                                                        html_utilities.html_indent(TWO_INTEGER);
                                                        html_utilities.html_princ($str_alt199$__);
                                                        html_utilities.html_indent(TWO_INTEGER);
                                                        cb_uia_debug(indexical_record);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                    } else {
                                                        cdestructuring_bind_error(datum_26, $list_alt198);
                                                    }
                                                }
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Exceptions);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_rule_constructor.rc_state_exceptions(rc_state);
                                            SubLObject exception = NIL;
                                            for (exception = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , exception = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(exception);
                                                html_utilities.html_newline(UNPROVIDED);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_rc_state(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, RC_STATE_P);
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt203$cb_uia_debug_rc_state__A, rkf_rule_constructor.rc_state_id(v_object));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($str_alt204$_RC_);
                        html_utilities.html_princ(rkf_rule_constructor.rc_state_id(v_object));
                        html_utilities.html_princ($str_alt205$_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_rc_state_method(SubLObject v_object) {
        return cb_utilities.cb_link($UIA_DEBUG_RC_STATE, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_uia_debug_rc_lhs(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject rc_lhs = rkf_rule_constructor.rc_find_state_by_id_string(id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt209$RC_LHS);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, rkf_rule_constructor.rc_lhs_id(rc_lhs));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$NL_Sentence);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_princ(rkf_rule_constructor.rc_lhs_nl_sentence(rc_lhs));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Constraints);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_rule_constructor.rc_lhs_constraints(rc_lhs);
                                            SubLObject constraint_record = NIL;
                                            for (constraint_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_record = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(constraint_record);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Terms);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_rule_constructor.rc_lhs_terms(rc_lhs);
                                            SubLObject indexical_record = NIL;
                                            for (indexical_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_record = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(indexical_record);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$CycL);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_utilities.cb_form(rkf_rule_constructor.rc_lhs_cycl(rc_lhs), ZERO_INTEGER, T);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_rc_lhs(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, RC_LHS_P);
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt212$cb_uia_debug_rc_lhs__A, rkf_rule_constructor.rc_lhs_id(v_object));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($str_alt213$_RC_LHS_);
                        html_utilities.html_princ(rkf_rule_constructor.rc_lhs_id(v_object));
                        html_utilities.html_princ($str_alt205$_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_rc_lhs_method(SubLObject v_object) {
        return cb_utilities.cb_link($UIA_DEBUG_RC_LHS, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_uia_debug_rc_rhs(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject rc_rhs = rkf_rule_constructor.rc_find_state_by_id_string(id_string);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                            cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                        }
                                        if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                            html_script_utilities.cb_hoverover_page_init();
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt217$RC_RHS);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$ID);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt19$_D, rkf_rule_constructor.rc_rhs_id(rc_rhs));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$NL_Sentence);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_princ(rkf_rule_constructor.rc_rhs_nl_sentence(rc_rhs));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Constraints);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        {
                                            SubLObject cdolist_list_var = rkf_rule_constructor.rc_rhs_constraints(rc_rhs);
                                            SubLObject constraint_record = NIL;
                                            for (constraint_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_record = cdolist_list_var.first()) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                cb_uia_debug(constraint_record);
                                            }
                                        }
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Existential_Term);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        cb_uia_debug(rkf_rule_constructor.rc_rhs_existential_term(rc_rhs));
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_princ($$$CycL);
                                        html_utilities.html_princ($str_alt18$__);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        cb_utilities.cb_form(rkf_rule_constructor.rc_rhs_cycl(rc_rhs), ZERO_INTEGER, T);
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt11);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_rc_rhs(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_object, RC_RHS_P);
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt221$cb_uia_debug_rc_rhs__A, rkf_rule_constructor.rc_rhs_id(v_object));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($str_alt222$_RC_RHS_);
                        html_utilities.html_princ(rkf_rule_constructor.rc_rhs_id(v_object));
                        html_utilities.html_princ($str_alt205$_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return v_object;
        }
    }

    public static final SubLObject cb_uia_debug_rc_rhs_method(SubLObject v_object) {
        return cb_utilities.cb_link($UIA_DEBUG_RC_RHS, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final class $ar_context_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return cb_uia_debugging.$ar_context_native.structDecl;
        }

        public SubLObject getField2() {
            return $interaction;
        }

        public SubLObject getField3() {
            return $ar_state;
        }

        public SubLObject setField2(SubLObject value) {
            return $interaction = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $ar_state = value;
        }

        public SubLObject $interaction = Lisp.NIL;

        public SubLObject $ar_state = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cb_uia_debugging.$ar_context_native.class, AR_CONTEXT, AR_CONTEXT_P, $list_alt228, $list_alt229, new String[]{ "$interaction", "$ar_state" }, $list_alt230, $list_alt231, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_ar_context$ = makeSymbol("*DTP-AR-CONTEXT*");

    public static final SubLObject ar_context_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ar_context_p(SubLObject v_object) {
        return v_object.getJavaClass() ==cb_uia_debugging.$ar_context_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $ar_context_p$UnaryFunction extends UnaryFunction {
        public $ar_context_p$UnaryFunction() {
            super(extractFunctionNamed("AR-CONTEXT-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return ar_context_p(arg1);
        }
    }

    public static final SubLObject ar_context_interaction(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, AR_CONTEXT_P);
        return v_object.getField2();
    }

    public static final SubLObject ar_context_ar_state(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, AR_CONTEXT_P);
        return v_object.getField3();
    }

    public static final SubLObject _csetf_ar_context_interaction(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, AR_CONTEXT_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ar_context_ar_state(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, AR_CONTEXT_P);
        return v_object.setField3(value);
    }

    public static final SubLObject make_ar_context(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new cb_uia_debugging.$ar_context_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($INTERACTION)) {
                        _csetf_ar_context_interaction(v_new, current_value);
                    } else
                        if (pcase_var.eql($AR_STATE)) {
                            _csetf_ar_context_ar_state(v_new, current_value);
                        } else {
                            Errors.error($str_alt240$Invalid_slot__S_for_construction_, current_arg);
                        }

                }
            }
            return v_new;
        }
    }

    // defparameter
    private static final SubLSymbol $cb_uia_current_ar_state$ = makeSymbol("*CB-UIA-CURRENT-AR-STATE*");

    public static final SubLObject new_ar_context(SubLObject interaction, SubLObject ar_state) {
        {
            SubLObject arctxt = make_ar_context(UNPROVIDED);
            _csetf_ar_context_interaction(arctxt, interaction);
            _csetf_ar_context_ar_state(arctxt, ar_state);
            return arctxt;
        }
    }

    public static final SubLObject cb_uia_debug_ar_context(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject ui_id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt241);
                ui_id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                        SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, ui_id);
                        SubLObject state = cb_uia_debug_interaction_to_ar_state(interaction);
                        {
                            SubLObject _prev_bind_0 = $cb_uia_current_ar_state$.currentBinding(thread);
                            try {
                                $cb_uia_current_ar_state$.bind(state, thread);
                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                {
                                    SubLObject _prev_bind_0_30 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                                    cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                                }
                                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                                    html_script_utilities.cb_hoverover_page_init();
                                                }
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt242$Self__ar_context____);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                cb_uia_debug(new_ar_context(interaction, state));
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt243$Master__UI____);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                cb_uia_debug(interaction);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_string(html_utilities.html_princ($str_alt244$State__ar_state____), UNPROVIDED, UNPROVIDED);
                                                cb_uia_debug(state);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_30, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                $cb_uia_current_ar_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt241);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_ar_context(SubLObject arctxt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(arctxt, AR_CONTEXT_P);
            {
                SubLObject state = ar_context_ar_state(arctxt);
                SubLObject interaction = ar_context_interaction(arctxt);
                SubLObject id = user_interaction_agenda.ui_id(interaction);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt246$cb_uia_debug_ar_context__A, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt247$_AR_Ctxt__A_, id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return arctxt;
        }
    }

    public static final SubLObject cb_uia_debug_ar_context_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_AR_CONTEXT, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_interaction_to_ar_state(SubLObject interaction) {
        {
            SubLObject ar_state = user_interaction_agenda.ui_state_lookup(interaction, $AR_STATE, NIL);
            SubLObject ar_context = user_interaction_agenda.ui_state_lookup(interaction, $AR_CONTEXT, NIL);
            SubLObject state = NIL;
            if (NIL != rkf_assisted_reader.ar_state_p(ar_state)) {
                state = ar_state;
            } else
                if (NIL != ar_context_p(ar_context)) {
                    state = ar_context_ar_state(ar_context);
                }

            if (NIL == state) {
                {
                    SubLObject daddy = user_interaction_agenda.ui_parent_interaction(interaction);
                    if (NIL != daddy) {
                        return cb_uia_debug_interaction_to_ar_state(daddy);
                    }
                }
            } else {
                return state;
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_debug_ar_state(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject ui_id = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt241);
                ui_id = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                        SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, ui_id);
                        SubLObject state = cb_uia_debug_interaction_to_ar_state(interaction);
                        {
                            SubLObject _prev_bind_0 = $cb_uia_current_ar_state$.currentBinding(thread);
                            try {
                                $cb_uia_current_ar_state$.bind(state, thread);
                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                {
                                    SubLObject _prev_bind_0_32 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != cb_user_interaction_agenda.cb_uia_use_menu_based_launchers_p()) {
                                                    cb_user_interaction_agenda.cb_uia_draw_launchers_as_menu(cb_user_interaction_agenda.cb_current_uia());
                                                }
                                                if (NIL != html_script_utilities.$cb_hoverover_enabled$.getDynamicValue(thread)) {
                                                    html_script_utilities.cb_hoverover_page_init();
                                                }
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt252$Self__State____);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                cb_uia_debug(state);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt243$Master__UI____);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                cb_uia_debug(interaction);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt253$ISG___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_princ(rkf_assisted_reader.ar_state_isg(state));
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt254$Source_Sentences___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_source_sentences(state);
                                                    SubLObject sentence = NIL;
                                                    for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                                        cb_uia_debug(sentence);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt255$Focus_Sentence___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                cb_uia_debug(rkf_assisted_reader.ar_state_focus_sentence(state));
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt256$Completed_Sentences___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_completed_sentences(state);
                                                    SubLObject sentence = NIL;
                                                    for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                                        cb_uia_debug(sentence);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt257$Unknown_Phrases___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_unknown_phrases(state);
                                                    SubLObject phrase = NIL;
                                                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                                        cb_uia_debug(phrase);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt258$Rejected_Phrases___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_rejected_phrases(state);
                                                    SubLObject phrase = NIL;
                                                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                                        cb_uia_debug(phrase);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt259$Irrelevant_Phrases___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_irrelevant_phrases(state);
                                                    SubLObject phrase = NIL;
                                                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                                        cb_uia_debug(phrase);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt260$Ambiguous_Phrases___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_ambiguous_phrases(state);
                                                    SubLObject phrase = NIL;
                                                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                                        cb_uia_debug(phrase);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt261$Assumed_Phrases___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_assumed_phrases(state);
                                                    SubLObject phrase = NIL;
                                                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                                        cb_uia_debug(phrase);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt262$Pending_Phrases___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_pending_phrases(state);
                                                    SubLObject phrase = NIL;
                                                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                                        cb_uia_debug(phrase);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt263$Accepted_Phrases___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_accepted_phrases(state);
                                                    SubLObject phrase = NIL;
                                                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                                        cb_uia_debug(phrase);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt264$Pending_Concepts___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_pending_concepts(state);
                                                    SubLObject concept = NIL;
                                                    for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                                                        cb_uia_debug(concept);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt265$Accepted_Concepts___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_accepted_concepts(state);
                                                    SubLObject concept = NIL;
                                                    for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                                                        cb_uia_debug(concept);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt266$Candidate_Assertions_Queries___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_candidate_cycls(state);
                                                    SubLObject concept = NIL;
                                                    for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                                                        cb_uia_debug(concept);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt267$Asserted_Assertions___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_asserted_assertions(state);
                                                    SubLObject concept = NIL;
                                                    for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                                                        cb_uia_debug(concept);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt268$Term_Templates___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_term_templates(state);
                                                    SubLObject template = NIL;
                                                    for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                                                        cb_uia_debug(template);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt269$Assert_Templates___);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                {
                                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_state_assert_templates(state);
                                                    SubLObject template = NIL;
                                                    for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                                                        cb_uia_debug(template);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_32, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                $cb_uia_current_ar_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt241);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_ar_state(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(state, AR_STATE_P);
            {
                SubLObject interaction = cb_uiat_smart.cb_uiat_sr_find_interaction_by_state(state);
                SubLObject id = user_interaction_agenda.ui_id(interaction);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt272$cb_uia_debug_ar_state__A, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt273$_AR__A_, id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return state;
        }
    }

    public static final SubLObject cb_uia_debug_ar_state_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_AR_STATE, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_ar_sentence(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject ui_id = NIL;
                SubLObject sentence_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt277);
                ui_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt277);
                sentence_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, ui_id);
                        SubLObject state = cb_uia_debug_interaction_to_ar_state(interaction);
                        SubLObject sentence_id = parse_integer(sentence_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject sentence = rkf_assisted_reader.find_ar_sentence(state, sentence_id);
                        {
                            SubLObject _prev_bind_0 = $cb_uia_current_ar_state$.currentBinding(thread);
                            try {
                                $cb_uia_current_ar_state$.bind(state, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt278$Self__Sentence____);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(sentence);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt279$Master__State____);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(state);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt280$ID___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_princ(rkf_assisted_reader.ar_sentence_id(sentence));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt281$Plaintext___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_prin1(rkf_assisted_reader.ar_sentence_plaintext(sentence));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt282$Token_vector___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                {
                                    SubLObject vector_var = rkf_assisted_reader.ar_sentence_token_vector(sentence);
                                    SubLObject backwardP_var = NIL;
                                    SubLObject length = length(vector_var);
                                    SubLObject v_iteration = NIL;
                                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        {
                                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                            SubLObject token = aref(vector_var, element_num);
                                            cb_uia_debug(token);
                                            html_utilities.html_indent(UNPROVIDED);
                                        }
                                    }
                                }
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt283$Clarifications___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                {
                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_sentence_clarifications(sentence);
                                    SubLObject clarification = NIL;
                                    for (clarification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clarification = cdolist_list_var.first()) {
                                        cb_uia_debug(clarification);
                                        html_utilities.html_indent(UNPROVIDED);
                                    }
                                }
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt284$Source_Sentence___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(rkf_assisted_reader.ar_sentence_source_sentence(sentence));
                                html_utilities.html_newline(TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt285$Phrases___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                {
                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_sentence_phrases(sentence);
                                    SubLObject phrase = NIL;
                                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                        cb_uia_debug(phrase);
                                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                        html_utilities.html_indent(UNPROVIDED);
                                    }
                                }
                            } finally {
                                $cb_uia_current_ar_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt277);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_ar_sentence(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(sentence, AR_SENTENCE_P);
            {
                SubLObject state = $cb_uia_current_ar_state$.getDynamicValue(thread);
                if (NIL != state) {
                    {
                        SubLObject interaction = cb_uiat_smart.cb_uiat_sr_find_interaction_by_state(state);
                        SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        cb_parameters.cyc_cgi_url_int();
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt288$cb_uia_debug_ar_sentence__A__A, user_interaction_agenda.ui_id(interaction), rkf_assisted_reader.ar_sentence_id(sentence));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ($str_alt289$__);
                                html_utilities.html_princ(rkf_assisted_reader.ar_sentence_plaintext(sentence));
                                html_utilities.html_princ($str_alt290$__);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                } else {
                    html_utilities.html_princ(sentence);
                }
            }
            return sentence;
        }
    }

    public static final SubLObject cb_uia_debug_ar_sentence_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_AR_SENTENCE, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_ar_token(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject ui_id = NIL;
                SubLObject token_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt294);
                ui_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt294);
                token_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, ui_id);
                        SubLObject state = cb_uia_debug_interaction_to_ar_state(interaction);
                        SubLObject token_id = parse_integer(token_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject token = rkf_assisted_reader.find_ar_token(state, token_id);
                        {
                            SubLObject _prev_bind_0 = $cb_uia_current_ar_state$.currentBinding(thread);
                            try {
                                $cb_uia_current_ar_state$.bind(state, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt295$Self__Token____);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(token);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt279$Master__State____);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(state);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt280$ID___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_princ(rkf_assisted_reader.ar_token_id(token));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt296$Text___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_princ(rkf_assisted_reader.ar_token_text(token));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt297$Sentence___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(rkf_assisted_reader.ar_token_sentence(token));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt298$Number___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_princ(rkf_assisted_reader.ar_token_number(token));
                                html_utilities.html_newline(TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt285$Phrases___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                {
                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_token_phrases(token);
                                    SubLObject phrase = NIL;
                                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                        cb_uia_debug(phrase);
                                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                        html_utilities.html_indent(UNPROVIDED);
                                    }
                                }
                            } finally {
                                $cb_uia_current_ar_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt294);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_ar_token(SubLObject token) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(token, AR_TOKEN_P);
            {
                SubLObject state = $cb_uia_current_ar_state$.getDynamicValue(thread);
                if (NIL != state) {
                    {
                        SubLObject interaction = cb_uiat_smart.cb_uiat_sr_find_interaction_by_state(state);
                        SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        cb_parameters.cyc_cgi_url_int();
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt301$cb_uia_debug_ar_token__A__A, user_interaction_agenda.ui_id(interaction), rkf_assisted_reader.ar_token_id(token));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ($str_alt302$_);
                                html_utilities.html_princ(rkf_assisted_reader.ar_token_text(token));
                                html_utilities.html_princ($str_alt205$_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                } else {
                    html_utilities.html_princ(token);
                }
            }
            return token;
        }
    }

    public static final SubLObject cb_uia_debug_ar_token_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_AR_TOKEN, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_ar_phrase(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject ui_id = NIL;
                SubLObject phrase_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt306);
                ui_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt306);
                phrase_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, ui_id);
                        SubLObject state = cb_uia_debug_interaction_to_ar_state(interaction);
                        SubLObject phrase_id = parse_integer(phrase_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject phrase = rkf_assisted_reader.find_ar_phrase(state, phrase_id);
                        {
                            SubLObject _prev_bind_0 = $cb_uia_current_ar_state$.currentBinding(thread);
                            try {
                                $cb_uia_current_ar_state$.bind(state, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt307$Self__Phrase____);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(phrase);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt279$Master__State____);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(state);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt280$ID___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_princ(rkf_assisted_reader.ar_phrase_id(phrase));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt308$Status___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                html_utilities.html_prin1(rkf_assisted_reader.ar_phrase_status(phrase));
                                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt309$Force___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                html_utilities.html_prin1(rkf_assisted_reader.ar_phrase_force(phrase));
                                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt310$Token_List___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                {
                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_phrase_token_list(phrase);
                                    SubLObject token = NIL;
                                    for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                                        cb_uia_debug(token);
                                        html_utilities.html_indent(UNPROVIDED);
                                    }
                                }
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt297$Sentence___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(rkf_assisted_reader.ar_phrase_sentence(phrase));
                                html_utilities.html_newline(TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt311$_Plausible__Concepts___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = rkf_assisted_reader.ar_phrase_concepts(phrase);
                                            SubLObject concept = NIL;
                                            for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uia_debug(concept);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt312$Rejected_Concepts___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = rkf_assisted_reader.ar_phrase_rejected_concepts(phrase);
                                            SubLObject concept = NIL;
                                            for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uia_debug(concept);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt313$Disambiguated_Concept___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_uia_debug(rkf_assisted_reader.ar_phrase_disambiguated_concept(phrase));
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt314$Surrogate___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                                        {
                                                            SubLObject cdolist_list_var = rkf_assisted_reader.ar_phrase_surrogate(phrase);
                                                            SubLObject surrogate = NIL;
                                                            for (surrogate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , surrogate = cdolist_list_var.first()) {
                                                                cb_uia_debug(surrogate);
                                                                html_utilities.html_newline(UNPROVIDED);
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
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
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt315$Constraint___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_utilities.cb_form(rkf_assisted_reader.ar_phrase_constraint(phrase), ZERO_INTEGER, T);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                $cb_uia_current_ar_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt306);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_ar_phrase(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(phrase, AR_PHRASE_P);
            {
                SubLObject state = $cb_uia_current_ar_state$.getDynamicValue(thread);
                if (NIL != state) {
                    {
                        SubLObject interaction = cb_uiat_smart.cb_uiat_sr_find_interaction_by_state(state);
                        SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        cb_parameters.cyc_cgi_url_int();
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt318$cb_uia_debug_ar_phrase__A__A, user_interaction_agenda.ui_id(interaction), rkf_assisted_reader.ar_phrase_id(phrase));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_phrase_token_list(phrase);
                                    SubLObject token = NIL;
                                    for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                                        html_utilities.html_princ(rkf_assisted_reader.ar_token_text(token));
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                } else {
                    html_utilities.html_princ(phrase);
                }
            }
            return phrase;
        }
    }

    public static final SubLObject cb_uia_debug_ar_phrase_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_AR_PHRASE, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_ar_concept(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject ui_id = NIL;
                SubLObject concept_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt322);
                ui_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt322);
                concept_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, ui_id);
                        SubLObject state = cb_uia_debug_interaction_to_ar_state(interaction);
                        SubLObject concept_id = parse_integer(concept_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject concept = rkf_assisted_reader.find_ar_concept(state, concept_id);
                        {
                            SubLObject _prev_bind_0 = $cb_uia_current_ar_state$.currentBinding(thread);
                            try {
                                $cb_uia_current_ar_state$.bind(state, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt323$Self__Concept____);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(concept);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt279$Master__State____);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(state);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt280$ID___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_princ(rkf_assisted_reader.ar_concept_id(concept));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt324$Confidence__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_princ(rkf_assisted_reader.ar_concept_confidence(concept));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt325$Open_Term_Score__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_princ(rkf_assisted_reader.ar_concept_open_term_score(concept));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt326$Force__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_princ(rkf_assisted_reader.ar_concept_force(concept));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt327$CycL___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_utilities.cb_form(rkf_assisted_reader.ar_concept_cycl(concept), ZERO_INTEGER, T);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt328$Disambiguation_Text___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_prin1(rkf_assisted_reader.ar_concept_disambiguation_text(concept));
                                html_utilities.html_newline(TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt285$Phrases___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                {
                                    SubLObject cdolist_list_var = rkf_assisted_reader.ar_concept_phrases(concept);
                                    SubLObject phrase = NIL;
                                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                        cb_uia_debug(phrase);
                                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                        html_utilities.html_indent(UNPROVIDED);
                                    }
                                }
                                html_utilities.html_newline(TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt329$Parts___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = rkf_assisted_reader.ar_concept_parts(concept);
                                            SubLObject part = NIL;
                                            for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uia_debug(part);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt330$Agglomerations___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = rkf_assisted_reader.ar_concept_agglomerations(concept);
                                            SubLObject agglomeration = NIL;
                                            for (agglomeration = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , agglomeration = cdolist_list_var.first()) {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uia_debug(agglomeration);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                $cb_uia_current_ar_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt322);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_ar_concept(SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(concept, AR_CONCEPT_P);
            {
                SubLObject state = $cb_uia_current_ar_state$.getDynamicValue(thread);
                if (NIL != state) {
                    {
                        SubLObject interaction = cb_uiat_smart.cb_uiat_sr_find_interaction_by_state(state);
                        SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        cb_parameters.cyc_cgi_url_int();
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt333$cb_uia_debug_ar_concept__A__A, user_interaction_agenda.ui_id(interaction), rkf_assisted_reader.ar_concept_id(concept));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ_formatted_string(format_cycl_expression.format_cycl_expression_to_string(rkf_assisted_reader.ar_concept_cycl(concept), UNPROVIDED));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                } else {
                    html_utilities.html_princ(concept);
                }
            }
            return concept;
        }
    }

    public static final SubLObject cb_uia_debug_ar_concept_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_AR_CONCEPT, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_ar_template(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject ui_id = NIL;
                SubLObject template_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt337);
                ui_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt337);
                template_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject interaction = user_interaction_agenda.uia_find_by_id_string(v_agenda, ui_id);
                        SubLObject state = cb_uia_debug_interaction_to_ar_state(interaction);
                        SubLObject template_id = parse_integer(template_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject template = rkf_assisted_reader.find_ar_template(state, template_id);
                        {
                            SubLObject _prev_bind_0 = $cb_uia_current_ar_state$.currentBinding(thread);
                            try {
                                $cb_uia_current_ar_state$.bind(state, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt338$Self__Template____);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(template);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt279$Master__State____);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(state);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt280$ID___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_princ(rkf_assisted_reader.ar_template_id(template));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt339$Concept___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_uia_debug(rkf_assisted_reader.ar_template_concept(template));
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt340$Formula___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                cb_utilities.cb_form(rkf_assisted_reader.ar_template_formula(template), ZERO_INTEGER, T);
                                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt341$Prompt___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                cb_utilities.cb_form(rkf_assisted_reader.ar_template_prompt(template), ZERO_INTEGER, T);
                                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt330$Agglomerations___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = rkf_assisted_reader.ar_template_agglomerations(template);
                                            SubLObject agglomeration = NIL;
                                            for (agglomeration = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , agglomeration = cdolist_list_var.first()) {
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_uia_debug(agglomeration);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt342$Choice_Table___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = rkf_assisted_reader.ar_template_choice_table(template);
                                            SubLObject item = NIL;
                                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum_62 = item;
                                                    SubLObject current_63 = datum_62;
                                                    SubLObject parameter = NIL;
                                                    SubLObject choices = NIL;
                                                    destructuring_bind_must_consp(current_63, datum_62, $list_alt343);
                                                    parameter = current_63.first();
                                                    current_63 = current_63.rest();
                                                    destructuring_bind_must_consp(current_63, datum_62, $list_alt343);
                                                    choices = current_63.first();
                                                    current_63 = current_63.rest();
                                                    if (NIL == current_63) {
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                                        html_utilities.html_prin1(parameter);
                                                                        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject cdolist_list_var_67 = choices;
                                                                            SubLObject choice = NIL;
                                                                            for (choice = cdolist_list_var_67.first(); NIL != cdolist_list_var_67; cdolist_list_var_67 = cdolist_list_var_67.rest() , choice = cdolist_list_var_67.first()) {
                                                                                cb_uia_debug(choice);
                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } else {
                                                        cdestructuring_bind_error(datum_62, $list_alt343);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                $cb_uia_current_ar_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt337);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_uia_debug_ar_template(SubLObject template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(template, AR_TEMPLATE_P);
            {
                SubLObject state = $cb_uia_current_ar_state$.getDynamicValue(thread);
                if (NIL != state) {
                    {
                        SubLObject interaction = cb_uiat_smart.cb_uiat_sr_find_interaction_by_state(state);
                        SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        cb_parameters.cyc_cgi_url_int();
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt347$cb_uia_debug_ar_template__A__A, user_interaction_agenda.ui_id(interaction), rkf_assisted_reader.ar_template_id(template));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_princ($str_alt348$_Template___);
                                html_utilities.html_princ(rkf_assisted_reader.ar_concept_cycl(rkf_assisted_reader.ar_template_concept(template)));
                                html_utilities.html_princ($str_alt205$_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                } else {
                    html_utilities.html_princ(template);
                }
            }
            return template;
        }
    }

    public static final SubLObject cb_uia_debug_ar_template_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_AR_TEMPLATE, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_link_uia_debug_rkf_salient_descriptor_prompter(SubLObject prompter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(prompter, RKF_SALIENT_DESCRIPTOR_PROMPTER_P);
            {
                SubLObject interaction = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $INTERACTION, UNPROVIDED);
                SubLObject id = (NIL != user_interaction_agenda.user_interaction_p(interaction)) ? ((SubLObject) (user_interaction_agenda.ui_id(interaction))) : NIL;
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt353$cb_uia_debug_rkf_salient_descript, id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt354$_RKF_SD_PROMPTER__A_, id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return prompter;
        }
    }

    public static final SubLObject cb_uia_debug_rkf_salient_descriptor_prompter_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPTER, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_uia_debug_rkf_salient_descriptor_prompt_method(SubLObject v_object) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link($UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPT, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_link_uia_debug_rkf_salient_descriptor_prompt(SubLObject prompt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(prompt, RKF_SALIENT_DESCRIPTOR_PROMPT_P);
            {
                SubLObject prompter = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_prompter(prompt);
                SubLObject prompt_id = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_id(prompt);
                SubLObject interaction = (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter)) ? ((SubLObject) (rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $INTERACTION, UNPROVIDED))) : NIL;
                SubLObject ui_id = (NIL != user_interaction_agenda.user_interaction_p(interaction)) ? ((SubLObject) (user_interaction_agenda.ui_id(interaction))) : NIL;
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt361$cb_uia_debug_rkf_salient_descript, ui_id, prompt_id);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt362$_RKF_SD_PROMPT__A_, prompt_id);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return prompt;
        }
    }

    public static final SubLObject cb_uia_debug_thinking_task_method(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thinking = v_object;
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
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
                            SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt365$Thinking_Object_);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
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
                            SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt366$Name_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(process_utilities.thinking_name(thinking));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt367$Status_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(process_utilities.thinking_status(thinking));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt368$Progress_Message_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(process_utilities.thinking_progress_message(thinking));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt369$Progress_Sofar_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(process_utilities.thinking_progress_sofar(thinking));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt370$Progress_Total_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(process_utilities.thinking_progress_total(thinking));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
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
                                        html_utilities.html_princ($str_alt371$Result_);
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
                                        html_utilities.html_princ(process_utilities.thinking_result(thinking));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt372$Start_Time_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(process_utilities.thinking_start_time(thinking));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
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
                                        html_utilities.html_princ($str_alt373$Finish_Time_);
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
                                        html_utilities.html_princ(process_utilities.thinking_finish_time(thinking));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt374$Error_Message_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(process_utilities.thinking_error_message(thinking));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt375$Thread_Object_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(process_utilities.thinking_thread(thinking));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ($str_alt376$Properties_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject counter = ZERO_INTEGER;
                                            SubLObject remainder = NIL;
                                            for (remainder = process_utilities.thinking_properties(thinking); NIL != remainder; remainder = cddr(remainder)) {
                                                {
                                                    SubLObject property = remainder.first();
                                                    SubLObject value = cadr(remainder);
                                                    if (counter.isPositive()) {
                                                        html_utilities.html_newline(UNPROVIDED);
                                                    }
                                                    html_utilities.html_prin1(property);
                                                    html_utilities.html_princ($str_alt18$__);
                                                    cb_uia_debug(value);
                                                    counter = add(counter, ONE_INTEGER);
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
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

    public static final SubLObject declare_cb_uia_debugging_file() {
        declareMacro("html_princ_title_only", "HTML-PRINC-TITLE-ONLY");
        declareMacro("html_princ_title_and_object", "HTML-PRINC-TITLE-AND-OBJECT");
        declareMacro("html_prin1_title_and_object", "HTML-PRIN1-TITLE-AND-OBJECT");
        declareMacro("cb_uia_debug_title_and_object", "CB-UIA-DEBUG-TITLE-AND-OBJECT");
        declareFunction("cb_uia_debug", "CB-UIA-DEBUG", 1, 0, false);
        declareFunction("cb_uia_debug_interaction", "CB-UIA-DEBUG-INTERACTION", 1, 0, false);
        declareFunction("cb_link_uia_debug_interaction", "CB-LINK-UIA-DEBUG-INTERACTION", 1, 1, false);
        declareFunction("cb_uia_debug_user_interaction_method", "CB-UIA-DEBUG-USER-INTERACTION-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_agenda", "CB-UIA-DEBUG-AGENDA", 1, 0, false);
        declareFunction("cb_link_uia_debug_agenda", "CB-LINK-UIA-DEBUG-AGENDA", 1, 0, false);
        declareFunction("cb_uia_debug_user_interaction_agenda_method", "CB-UIA-DEBUG-USER-INTERACTION-AGENDA-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_meta_agenda", "CB-UIA-DEBUG-META-AGENDA", 1, 0, false);
        declareFunction("cb_link_uia_debug_meta_agenda", "CB-LINK-UIA-DEBUG-META-AGENDA", 1, 0, false);
        declareFunction("cb_uia_debug_user_interaction_meta_agenda_method", "CB-UIA-DEBUG-USER-INTERACTION-META-AGENDA-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_sf_state", "CB-UIA-DEBUG-SF-STATE", 1, 0, false);
        declareFunction("cb_link_uia_debug_sf_state", "CB-LINK-UIA-DEBUG-SF-STATE", 1, 0, false);
        declareFunction("cb_uia_debug_sf_state_method", "CB-UIA-DEBUG-SF-STATE-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_qc_state", "CB-UIA-DEBUG-QC-STATE", 1, 0, false);
        declareFunction("cb_link_uia_debug_qc_state", "CB-LINK-UIA-DEBUG-QC-STATE", 1, 0, false);
        declareFunction("cb_uia_debug_qc_state_method", "CB-UIA-DEBUG-QC-STATE-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_qc_query", "CB-UIA-DEBUG-QC-QUERY", 1, 0, false);
        declareFunction("cb_link_uia_debug_qc_query", "CB-LINK-UIA-DEBUG-QC-QUERY", 1, 0, false);
        declareFunction("cb_uia_debug_qc_query_method", "CB-UIA-DEBUG-QC-QUERY-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_sc_state", "CB-UIA-DEBUG-SC-STATE", 1, 0, false);
        declareFunction("cb_link_uia_debug_sc_state", "CB-LINK-UIA-DEBUG-SC-STATE", 1, 0, false);
        declareFunction("cb_uia_debug_sc_state_method", "CB-UIA-DEBUG-SC-STATE-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_sc_session", "CB-UIA-DEBUG-SC-SESSION", 1, 0, false);
        declareFunction("cb_link_uia_debug_sc_session", "CB-LINK-UIA-DEBUG-SC-SESSION", 1, 0, false);
        declareFunction("cb_uia_debug_sc_session_method", "CB-UIA-DEBUG-SC-SESSION-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_sm_scenario", "CB-UIA-DEBUG-SM-SCENARIO", 1, 0, false);
        declareFunction("cb_link_uia_debug_sm_scenario", "CB-LINK-UIA-DEBUG-SM-SCENARIO", 1, 0, false);
        declareFunction("cb_uia_debug_sm_scenario_method", "CB-UIA-DEBUG-SM-SCENARIO-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_sm_indexical_record", "CB-UIA-DEBUG-SM-INDEXICAL-RECORD", 1, 0, false);
        declareFunction("cb_link_uia_debug_sm_indexical_record", "CB-LINK-UIA-DEBUG-SM-INDEXICAL-RECORD", 1, 0, false);
        declareFunction("cb_uia_debug_sm_indexical_record_method", "CB-UIA-DEBUG-SM-INDEXICAL-RECORD-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_sm_constraint_record", "CB-UIA-DEBUG-SM-CONSTRAINT-RECORD", 1, 0, false);
        declareFunction("cb_link_uia_debug_sm_constraint_record", "CB-LINK-UIA-DEBUG-SM-CONSTRAINT-RECORD", 1, 0, false);
        declareFunction("cb_uia_debug_sm_constraint_record_method", "CB-UIA-DEBUG-SM-CONSTRAINT-RECORD-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_sm_merge_info", "CB-UIA-DEBUG-SM-MERGE-INFO", 1, 0, false);
        declareFunction("cb_link_uia_debug_sm_merge_info", "CB-LINK-UIA-DEBUG-SM-MERGE-INFO", 1, 0, false);
        declareFunction("cb_uia_debug_sm_merge_info_method", "CB-UIA-DEBUG-SM-MERGE-INFO-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_rc_state", "CB-UIA-DEBUG-RC-STATE", 1, 0, false);
        declareFunction("cb_link_uia_debug_rc_state", "CB-LINK-UIA-DEBUG-RC-STATE", 1, 0, false);
        declareFunction("cb_uia_debug_rc_state_method", "CB-UIA-DEBUG-RC-STATE-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_rc_lhs", "CB-UIA-DEBUG-RC-LHS", 1, 0, false);
        declareFunction("cb_link_uia_debug_rc_lhs", "CB-LINK-UIA-DEBUG-RC-LHS", 1, 0, false);
        declareFunction("cb_uia_debug_rc_lhs_method", "CB-UIA-DEBUG-RC-LHS-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_rc_rhs", "CB-UIA-DEBUG-RC-RHS", 1, 0, false);
        declareFunction("cb_link_uia_debug_rc_rhs", "CB-LINK-UIA-DEBUG-RC-RHS", 1, 0, false);
        declareFunction("cb_uia_debug_rc_rhs_method", "CB-UIA-DEBUG-RC-RHS-METHOD", 1, 0, false);
        declareFunction("ar_context_print_function_trampoline", "AR-CONTEXT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ar_context_p", "AR-CONTEXT-P", 1, 0, false);
        new cb_uia_debugging.$ar_context_p$UnaryFunction();
        declareFunction("ar_context_interaction", "AR-CONTEXT-INTERACTION", 1, 0, false);
        declareFunction("ar_context_ar_state", "AR-CONTEXT-AR-STATE", 1, 0, false);
        declareFunction("_csetf_ar_context_interaction", "_CSETF-AR-CONTEXT-INTERACTION", 2, 0, false);
        declareFunction("_csetf_ar_context_ar_state", "_CSETF-AR-CONTEXT-AR-STATE", 2, 0, false);
        declareFunction("make_ar_context", "MAKE-AR-CONTEXT", 0, 1, false);
        declareFunction("new_ar_context", "NEW-AR-CONTEXT", 2, 0, false);
        declareFunction("cb_uia_debug_ar_context", "CB-UIA-DEBUG-AR-CONTEXT", 1, 0, false);
        declareFunction("cb_link_uia_debug_ar_context", "CB-LINK-UIA-DEBUG-AR-CONTEXT", 1, 0, false);
        declareFunction("cb_uia_debug_ar_context_method", "CB-UIA-DEBUG-AR-CONTEXT-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_interaction_to_ar_state", "CB-UIA-DEBUG-INTERACTION-TO-AR-STATE", 1, 0, false);
        declareFunction("cb_uia_debug_ar_state", "CB-UIA-DEBUG-AR-STATE", 1, 0, false);
        declareFunction("cb_link_uia_debug_ar_state", "CB-LINK-UIA-DEBUG-AR-STATE", 1, 0, false);
        declareFunction("cb_uia_debug_ar_state_method", "CB-UIA-DEBUG-AR-STATE-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_ar_sentence", "CB-UIA-DEBUG-AR-SENTENCE", 1, 0, false);
        declareFunction("cb_link_uia_debug_ar_sentence", "CB-LINK-UIA-DEBUG-AR-SENTENCE", 1, 0, false);
        declareFunction("cb_uia_debug_ar_sentence_method", "CB-UIA-DEBUG-AR-SENTENCE-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_ar_token", "CB-UIA-DEBUG-AR-TOKEN", 1, 0, false);
        declareFunction("cb_link_uia_debug_ar_token", "CB-LINK-UIA-DEBUG-AR-TOKEN", 1, 0, false);
        declareFunction("cb_uia_debug_ar_token_method", "CB-UIA-DEBUG-AR-TOKEN-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_ar_phrase", "CB-UIA-DEBUG-AR-PHRASE", 1, 0, false);
        declareFunction("cb_link_uia_debug_ar_phrase", "CB-LINK-UIA-DEBUG-AR-PHRASE", 1, 0, false);
        declareFunction("cb_uia_debug_ar_phrase_method", "CB-UIA-DEBUG-AR-PHRASE-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_ar_concept", "CB-UIA-DEBUG-AR-CONCEPT", 1, 0, false);
        declareFunction("cb_link_uia_debug_ar_concept", "CB-LINK-UIA-DEBUG-AR-CONCEPT", 1, 0, false);
        declareFunction("cb_uia_debug_ar_concept_method", "CB-UIA-DEBUG-AR-CONCEPT-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_ar_template", "CB-UIA-DEBUG-AR-TEMPLATE", 1, 0, false);
        declareFunction("cb_link_uia_debug_ar_template", "CB-LINK-UIA-DEBUG-AR-TEMPLATE", 1, 0, false);
        declareFunction("cb_uia_debug_ar_template_method", "CB-UIA-DEBUG-AR-TEMPLATE-METHOD", 1, 0, false);
        declareFunction("cb_link_uia_debug_rkf_salient_descriptor_prompter", "CB-LINK-UIA-DEBUG-RKF-SALIENT-DESCRIPTOR-PROMPTER", 1, 0, false);
        declareFunction("cb_uia_debug_rkf_salient_descriptor_prompter_method", "CB-UIA-DEBUG-RKF-SALIENT-DESCRIPTOR-PROMPTER-METHOD", 1, 0, false);
        declareFunction("cb_uia_debug_rkf_salient_descriptor_prompt_method", "CB-UIA-DEBUG-RKF-SALIENT-DESCRIPTOR-PROMPT-METHOD", 1, 0, false);
        declareFunction("cb_link_uia_debug_rkf_salient_descriptor_prompt", "CB-LINK-UIA-DEBUG-RKF-SALIENT-DESCRIPTOR-PROMPT", 1, 0, false);
        declareFunction("cb_uia_debug_thinking_task_method", "CB-UIA-DEBUG-THINKING-TASK-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_debugging_file() {
        deflexical("*CB-UIA-DEBUG-METHOD-TABLE*", make_vector($int$256, NIL));
        defconstant("*DTP-AR-CONTEXT*", AR_CONTEXT);
        defparameter("*CB-UIA-CURRENT-AR-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_debugging_file() {
                html_macros.note_html_handler_function(CB_UIA_DEBUG_INTERACTION);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_INTERACTION, CB_LINK_UIA_DEBUG_INTERACTION, TWO_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), user_interaction_agenda.$dtp_user_interaction$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_USER_INTERACTION_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_AGENDA);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_AGENDA, CB_LINK_UIA_DEBUG_AGENDA, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), user_interaction_agenda.$dtp_user_interaction_agenda$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_USER_INTERACTION_AGENDA_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_META_AGENDA);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_META_AGENDA, CB_LINK_UIA_DEBUG_META_AGENDA, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), user_interaction_agenda.$dtp_user_interaction_meta_agenda$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_USER_INTERACTION_META_AGENDA_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_SF_STATE);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_SF_STATE, CB_LINK_UIA_DEBUG_SF_STATE, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_solution_finder.$dtp_sf_state$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_SF_STATE_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_QC_STATE);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_QC_STATE, CB_LINK_UIA_DEBUG_QC_STATE, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_query_constructor.$dtp_qc_state$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_QC_STATE_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_QC_QUERY);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_QC_QUERY, CB_LINK_UIA_DEBUG_QC_QUERY, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_query_constructor.$dtp_qc_query$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_QC_QUERY_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_SC_STATE);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_SC_STATE, CB_LINK_UIA_DEBUG_SC_STATE, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_scenario_constructor.$dtp_sc_state$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_SC_STATE_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_SC_SESSION);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_SC_SESSION, CB_LINK_UIA_DEBUG_SC_SESSION, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_scenario_constructor.$dtp_sc_session$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_SC_SESSION_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_SM_SCENARIO);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_SM_SCENARIO, CB_LINK_UIA_DEBUG_SM_SCENARIO, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_scenario$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_SM_SCENARIO_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_SM_INDEXICAL_RECORD);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_SM_INDEXICAL_RECORD, CB_LINK_UIA_DEBUG_SM_INDEXICAL_RECORD, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_indexical_record$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_SM_INDEXICAL_RECORD_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_SM_CONSTRAINT_RECORD);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_SM_CONSTRAINT_RECORD, CB_LINK_UIA_DEBUG_SM_CONSTRAINT_RECORD, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_constraint_record$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_SM_CONSTRAINT_RECORD_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_SM_MERGE_INFO);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_SM_MERGE_INFO, CB_LINK_UIA_DEBUG_SM_MERGE_INFO, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_scenario_manipulator.$dtp_sm_merge_info$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_SM_MERGE_INFO_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_RC_STATE);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_RC_STATE, CB_LINK_UIA_DEBUG_RC_STATE, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_rule_constructor.$dtp_rc_state$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_RC_STATE_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_RC_LHS);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_RC_LHS, CB_LINK_UIA_DEBUG_RC_LHS, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_rule_constructor.$dtp_rc_lhs$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_RC_LHS_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_RC_RHS);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_RC_RHS, CB_LINK_UIA_DEBUG_RC_RHS, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_rule_constructor.$dtp_rc_rhs$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_RC_RHS_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ar_context$.getGlobalValue(), symbol_function(AR_CONTEXT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(AR_CONTEXT_INTERACTION, _CSETF_AR_CONTEXT_INTERACTION);
        def_csetf(AR_CONTEXT_AR_STATE, _CSETF_AR_CONTEXT_AR_STATE);
        identity(AR_CONTEXT);
        html_macros.note_html_handler_function(CB_UIA_DEBUG_AR_CONTEXT);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_AR_CONTEXT, CB_LINK_UIA_DEBUG_AR_CONTEXT, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), $dtp_ar_context$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_AR_CONTEXT_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_AR_STATE);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_AR_STATE, CB_LINK_UIA_DEBUG_AR_STATE, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_state$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_AR_STATE_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_AR_SENTENCE);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_AR_SENTENCE, CB_LINK_UIA_DEBUG_AR_SENTENCE, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_sentence$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_AR_SENTENCE_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_AR_TOKEN);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_AR_TOKEN, CB_LINK_UIA_DEBUG_AR_TOKEN, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_token$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_AR_TOKEN_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_AR_PHRASE);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_AR_PHRASE, CB_LINK_UIA_DEBUG_AR_PHRASE, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_phrase$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_AR_PHRASE_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_AR_CONCEPT);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_AR_CONCEPT, CB_LINK_UIA_DEBUG_AR_CONCEPT, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_concept$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_AR_CONCEPT_METHOD));
        html_macros.note_html_handler_function(CB_UIA_DEBUG_AR_TEMPLATE);
        cb_utilities.setup_cb_link_method($UIA_DEBUG_AR_TEMPLATE, CB_LINK_UIA_DEBUG_AR_TEMPLATE, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_template$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_AR_TEMPLATE_METHOD));
        cb_utilities.setup_cb_link_method($UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPTER, CB_LINK_UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPTER, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_salient_descriptor_datastructures.$dtp_rkf_salient_descriptor_prompter$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPTER_METHOD));
        register_method($cb_uia_debug_method_table$.getGlobalValue(), rkf_salient_descriptor_datastructures.$dtp_rkf_salient_descriptor_prompt$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPT_METHOD));
        cb_utilities.setup_cb_link_method($UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPT, CB_LINK_UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPT, ONE_INTEGER);
        register_method($cb_uia_debug_method_table$.getGlobalValue(), process_utilities.$dtp_thinking_task$.getGlobalValue(), symbol_function(CB_UIA_DEBUG_THINKING_TASK_METHOD));
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(list(makeSymbol("TITLE")), makeSymbol("&BODY"), makeSymbol("BODY"));







    static private final SubLList $list_alt4 = list(list(makeSymbol("HTML-PRINC"), makeString(": ")));

    static private final SubLList $list_alt5 = list(list(makeSymbol("HTML-NEWLINE")));

    static private final SubLList $list_alt6 = list(makeSymbol("TITLE"), makeSymbol("OBJECT"));

    private static final SubLSymbol HTML_PRINC_TITLE_ONLY = makeSymbol("HTML-PRINC-TITLE-ONLY");

    private static final SubLSymbol HTML_PRIN1 = makeSymbol("HTML-PRIN1");

    private static final SubLSymbol CB_UIA_DEBUG = makeSymbol("CB-UIA-DEBUG");



    static private final SubLList $list_alt11 = list(makeSymbol("ID-STRING"));

    static private final SubLString $str_alt12$USER_INTERACTION = makeString("USER-INTERACTION");

    private static final SubLSymbol $UIA_REJECT_INTERACTION = makeKeyword("UIA-REJECT-INTERACTION");

    static private final SubLString $str_alt14$_Reject_this_interaction_ = makeString("[Reject this interaction]");

    private static final SubLSymbol $REPORT_PROBLEM = makeKeyword("REPORT-PROBLEM");

    static private final SubLString $str_alt16$_Report_Problem_ = makeString("[Report Problem]");

    static private final SubLString $$$ID = makeString("ID");

    static private final SubLString $str_alt18$__ = makeString(": ");

    static private final SubLString $str_alt19$_D = makeString("~D");

    static private final SubLString $$$Agenda = makeString("Agenda");

    static private final SubLString $$$Mode = makeString("Mode");

    static private final SubLString $$$Status = makeString("Status");

    static private final SubLString $$$Start_time = makeString("Start time");

    static private final SubLString $$$Finish_time = makeString("Finish time");

    static private final SubLString $$$none = makeString("none");

    static private final SubLString $$$Parent = makeString("Parent");

    static private final SubLString $$$Children = makeString("Children");

    static private final SubLString $$$Operator = makeString("Operator");

    static private final SubLString $$$Arguments = makeString("Arguments");

    static private final SubLString $$$Result = makeString("Result");

    static private final SubLString $$$State = makeString("State");

    private static final SubLSymbol CB_UIA_DEBUG_INTERACTION = makeSymbol("CB-UIA-DEBUG-INTERACTION");



    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt35$cb_uia_debug_interaction__A = makeString("cb-uia-debug-interaction&~A");

    static private final SubLString $str_alt36$_UI__A_ = makeString("[UI ~A]");

    private static final SubLSymbol $UIA_DEBUG_INTERACTION = makeKeyword("UIA-DEBUG-INTERACTION");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_INTERACTION = makeSymbol("CB-LINK-UIA-DEBUG-INTERACTION");

    private static final SubLSymbol CB_UIA_DEBUG_USER_INTERACTION_METHOD = makeSymbol("CB-UIA-DEBUG-USER-INTERACTION-METHOD");

    static private final SubLString $str_alt40$USER_INTERACTION_AGENDA = makeString("USER-INTERACTION-AGENDA");

    static private final SubLString $str_alt41$Meta_Agenda = makeString("Meta-Agenda");

    static private final SubLString $$$ISG = makeString("ISG");

    static private final SubLString $$$Index = makeString("Index");

    static private final SubLString $$$History = makeString("History");

    static private final SubLString $$$Undos = makeString("Undos");

    static private final SubLString $$$Messages = makeString("Messages");

    static private final SubLString $$$Requirements = makeString("Requirements");

    static private final SubLString $$$Relevant_Suggestions = makeString("Relevant Suggestions");

    static private final SubLString $$$Possible_Suggestions = makeString("Possible Suggestions");

    static private final SubLString $$$Comments = makeString("Comments");

    private static final SubLSymbol CB_UIA_DEBUG_AGENDA = makeSymbol("CB-UIA-DEBUG-AGENDA");

    private static final SubLSymbol USER_INTERACTION_AGENDA_P = makeSymbol("USER-INTERACTION-AGENDA-P");

    static private final SubLString $str_alt53$cb_uia_debug_agenda__A = makeString("cb-uia-debug-agenda&~A");

    static private final SubLString $str_alt54$_UIA__A_ = makeString("[UIA ~A]");

    private static final SubLSymbol $UIA_DEBUG_AGENDA = makeKeyword("UIA-DEBUG-AGENDA");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_AGENDA = makeSymbol("CB-LINK-UIA-DEBUG-AGENDA");

    private static final SubLSymbol CB_UIA_DEBUG_USER_INTERACTION_AGENDA_METHOD = makeSymbol("CB-UIA-DEBUG-USER-INTERACTION-AGENDA-METHOD");

    static private final SubLString $str_alt58$USER_INTERACTION_META_AGENDA = makeString("USER-INTERACTION-META-AGENDA");

    static private final SubLString $$$Open_Agendas = makeString("Open Agendas");

    static private final SubLString $$$Current_Agenda = makeString("Current Agenda");

    private static final SubLSymbol CB_UIA_DEBUG_META_AGENDA = makeSymbol("CB-UIA-DEBUG-META-AGENDA");

    private static final SubLSymbol USER_INTERACTION_META_AGENDA_P = makeSymbol("USER-INTERACTION-META-AGENDA-P");

    static private final SubLString $str_alt63$cb_uia_debug_meta_agenda = makeString("cb-uia-debug-meta-agenda");

    static private final SubLString $str_alt64$_UIMA_ = makeString("[UIMA]");

    private static final SubLSymbol $UIA_DEBUG_META_AGENDA = makeKeyword("UIA-DEBUG-META-AGENDA");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_META_AGENDA = makeSymbol("CB-LINK-UIA-DEBUG-META-AGENDA");

    private static final SubLSymbol CB_UIA_DEBUG_USER_INTERACTION_META_AGENDA_METHOD = makeSymbol("CB-UIA-DEBUG-USER-INTERACTION-META-AGENDA-METHOD");

    static private final SubLString $str_alt68$SF_STATE = makeString("SF-STATE");

    static private final SubLString $$$Interaction = makeString("Interaction");

    static private final SubLString $$$Text = makeString("Text");

    static private final SubLString $$$Query = makeString("Query");

    static private final SubLString $$$Inference_Parameters = makeString("Inference Parameters");

    static private final SubLString $$$Inference = makeString("Inference");

    static private final SubLString $$$Solution_Queue = makeString("Solution Queue");

    static private final SubLString $str_alt75$Pros_Cons = makeString("Pros-Cons");

    static private final SubLList $list_alt76 = list(makeSymbol("PROS"), makeSymbol("CONS"));

    static private final SubLString $str_alt77$Pros_ = makeString("Pros:");

    static private final SubLString $str_alt78$Cons_ = makeString("Cons:");

    private static final SubLSymbol CB_UIA_DEBUG_SF_STATE = makeSymbol("CB-UIA-DEBUG-SF-STATE");

    private static final SubLSymbol SF_STATE_P = makeSymbol("SF-STATE-P");

    static private final SubLString $str_alt81$cb_uia_debug_sf_state__A = makeString("cb-uia-debug-sf-state&~A");

    static private final SubLString $str_alt82$_SF__A_ = makeString("[SF ~A]");

    private static final SubLSymbol $UIA_DEBUG_SF_STATE = makeKeyword("UIA-DEBUG-SF-STATE");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_SF_STATE = makeSymbol("CB-LINK-UIA-DEBUG-SF-STATE");

    private static final SubLSymbol CB_UIA_DEBUG_SF_STATE_METHOD = makeSymbol("CB-UIA-DEBUG-SF-STATE-METHOD");

    static private final SubLString $str_alt86$QC_STATE = makeString("QC-STATE");

    static private final SubLString $$$Candidates = makeString("Candidates");

    static private final SubLString $$$Parsing_Mt = makeString("Parsing Mt");

    static private final SubLString $$$Generation_Mt = makeString("Generation Mt");

    static private final SubLString $$$Domain_Mt = makeString("Domain Mt");

    static private final SubLString $$$Interaction_Mt = makeString("Interaction Mt");

    private static final SubLSymbol CB_UIA_DEBUG_QC_STATE = makeSymbol("CB-UIA-DEBUG-QC-STATE");

    private static final SubLSymbol QC_STATE_P = makeSymbol("QC-STATE-P");

    static private final SubLString $str_alt94$cb_uia_debug_qc_state__A = makeString("cb-uia-debug-qc-state&~A");

    static private final SubLString $str_alt95$_QC__A_ = makeString("[QC ~A]");

    private static final SubLSymbol $UIA_DEBUG_QC_STATE = makeKeyword("UIA-DEBUG-QC-STATE");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_QC_STATE = makeSymbol("CB-LINK-UIA-DEBUG-QC-STATE");

    private static final SubLSymbol CB_UIA_DEBUG_QC_STATE_METHOD = makeSymbol("CB-UIA-DEBUG-QC-STATE-METHOD");

    static private final SubLString $str_alt99$QC_QUERY = makeString("QC-QUERY");

    static private final SubLString $$$CycL = makeString("CycL");

    static private final SubLString $$$Terms = makeString("Terms");

    static private final SubLString $$$Return_Terms = makeString("Return Terms");

    static private final SubLString $$$Constraints = makeString("Constraints");

    static private final SubLString $$$Var_Map = makeString("Var Map");

    static private final SubLList $list_alt105 = list(makeSymbol("EL-VAR"), makeSymbol("INDEXICAL-RECORD"));

    static private final SubLString $$$Scenario = makeString("Scenario");

    static private final SubLString $$$Assumed_Terms = makeString("Assumed Terms");

    static private final SubLString $$$Assumed_Constraints = makeString("Assumed Constraints");

    private static final SubLSymbol CB_UIA_DEBUG_QC_QUERY = makeSymbol("CB-UIA-DEBUG-QC-QUERY");

    private static final SubLSymbol QC_QUERY_P = makeSymbol("QC-QUERY-P");

    static private final SubLString $str_alt111$cb_uia_debug_qc_query__A = makeString("cb-uia-debug-qc-query&~A");

    static private final SubLString $str_alt112$_QC_QUERY__A_ = makeString("[QC-QUERY ~A]");

    private static final SubLSymbol $UIA_DEBUG_QC_QUERY = makeKeyword("UIA-DEBUG-QC-QUERY");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_QC_QUERY = makeSymbol("CB-LINK-UIA-DEBUG-QC-QUERY");

    private static final SubLSymbol CB_UIA_DEBUG_QC_QUERY_METHOD = makeSymbol("CB-UIA-DEBUG-QC-QUERY-METHOD");

    static private final SubLString $str_alt116$SC_STATE = makeString("SC-STATE");

    static private final SubLString $$$Active_Session = makeString("Active Session");

    static private final SubLString $$$Construction_Sessions = makeString("Construction Sessions");

    static private final SubLString $$$Browsing_Sessions = makeString("Browsing Sessions");

    static private final SubLString $$$Merge_Info = makeString("Merge Info");

    static private final SubLString $$$Domain_Interaction_Mt = makeString("Domain Interaction Mt");

    static private final SubLString $$$Scenario_Interaction_Mt = makeString("Scenario Interaction Mt");

    private static final SubLSymbol CB_UIA_DEBUG_SC_STATE = makeSymbol("CB-UIA-DEBUG-SC-STATE");

    private static final SubLSymbol SC_STATE_P = makeSymbol("SC-STATE-P");

    static private final SubLString $str_alt125$cb_uia_debug_sc_state__A = makeString("cb-uia-debug-sc-state&~A");

    static private final SubLString $str_alt126$_SC__A_ = makeString("[SC ~A]");

    private static final SubLSymbol $UIA_DEBUG_SC_STATE = makeKeyword("UIA-DEBUG-SC-STATE");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_SC_STATE = makeSymbol("CB-LINK-UIA-DEBUG-SC-STATE");

    private static final SubLSymbol CB_UIA_DEBUG_SC_STATE_METHOD = makeSymbol("CB-UIA-DEBUG-SC-STATE-METHOD");

    static private final SubLString $str_alt130$SC_SESSION = makeString("SC-SESSION");

    static private final SubLString $$$Phrase = makeString("Phrase");

    static private final SubLString $$$Candidate_Scenarios = makeString("Candidate Scenarios");

    static private final SubLString $$$Permission = makeString("Permission");

    private static final SubLSymbol CB_UIA_DEBUG_SC_SESSION = makeSymbol("CB-UIA-DEBUG-SC-SESSION");

    private static final SubLSymbol SC_SESSION_P = makeSymbol("SC-SESSION-P");

    static private final SubLString $str_alt136$cb_uia_debug_sc_session__A = makeString("cb-uia-debug-sc-session&~A");

    static private final SubLString $str_alt137$_SC_SESSION__A_ = makeString("[SC-SESSION ~A]");

    private static final SubLSymbol $UIA_DEBUG_SC_SESSION = makeKeyword("UIA-DEBUG-SC-SESSION");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_SC_SESSION = makeSymbol("CB-LINK-UIA-DEBUG-SC-SESSION");

    private static final SubLSymbol CB_UIA_DEBUG_SC_SESSION_METHOD = makeSymbol("CB-UIA-DEBUG-SC-SESSION-METHOD");

    static private final SubLString $str_alt141$SM_SCENARIO = makeString("SM-SCENARIO");

    static private final SubLString $$$Sessions = makeString("Sessions");

    static private final SubLString $$$Candidate_Terms = makeString("Candidate Terms");

    static private final SubLString $$$Candidate_Constraints = makeString("Candidate Constraints");

    static private final SubLString $$$Fort = makeString("Fort");

    static private final SubLString $$$Templates = makeString("Templates");

    private static final SubLSymbol CB_UIA_DEBUG_SM_SCENARIO = makeSymbol("CB-UIA-DEBUG-SM-SCENARIO");

    private static final SubLSymbol SM_SCENARIO_P = makeSymbol("SM-SCENARIO-P");

    static private final SubLString $str_alt149$cb_uia_debug_sm_scenario__A = makeString("cb-uia-debug-sm-scenario&~A");

    static private final SubLString $str_alt150$_SM_SCENARIO__A_ = makeString("[SM-SCENARIO ~A]");

    private static final SubLSymbol $UIA_DEBUG_SM_SCENARIO = makeKeyword("UIA-DEBUG-SM-SCENARIO");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_SM_SCENARIO = makeSymbol("CB-LINK-UIA-DEBUG-SM-SCENARIO");

    private static final SubLSymbol CB_UIA_DEBUG_SM_SCENARIO_METHOD = makeSymbol("CB-UIA-DEBUG-SM-SCENARIO-METHOD");

    static private final SubLString $str_alt154$SM_INDEXICAL_RECORD = makeString("SM-INDEXICAL-RECORD");

    static private final SubLString $$$Indexical = makeString("Indexical");

    static private final SubLString $$$Phrases = makeString("Phrases");

    static private final SubLString $$$Var = makeString("Var");

    static private final SubLString $$$Explicit_Isas = makeString("Explicit Isas");

    static private final SubLString $$$Explicit_Genls = makeString("Explicit Genls");

    static private final SubLString $$$All_Isas = makeString("All Isas");

    static private final SubLString $$$All_Genls = makeString("All Genls");

    private static final SubLSymbol CB_UIA_DEBUG_SM_INDEXICAL_RECORD = makeSymbol("CB-UIA-DEBUG-SM-INDEXICAL-RECORD");

    private static final SubLSymbol SM_INDEXICAL_RECORD_P = makeSymbol("SM-INDEXICAL-RECORD-P");

    static private final SubLString $str_alt164$cb_uia_debug_sm_indexical_record_ = makeString("cb-uia-debug-sm-indexical-record&~A");

    static private final SubLString $str_alt165$_SC_IR__A_ = makeString("[SC-IR ~A]");

    private static final SubLSymbol $UIA_DEBUG_SM_INDEXICAL_RECORD = makeKeyword("UIA-DEBUG-SM-INDEXICAL-RECORD");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_SM_INDEXICAL_RECORD = makeSymbol("CB-LINK-UIA-DEBUG-SM-INDEXICAL-RECORD");

    private static final SubLSymbol CB_UIA_DEBUG_SM_INDEXICAL_RECORD_METHOD = makeSymbol("CB-UIA-DEBUG-SM-INDEXICAL-RECORD-METHOD");

    static private final SubLString $str_alt169$SM_CONSTRAINT_RECORD = makeString("SM-CONSTRAINT-RECORD");

    static private final SubLString $$$Sentence = makeString("Sentence");

    static private final SubLString $$$NL_Sentence = makeString("NL Sentence");

    private static final SubLSymbol CB_UIA_DEBUG_SM_CONSTRAINT_RECORD = makeSymbol("CB-UIA-DEBUG-SM-CONSTRAINT-RECORD");

    private static final SubLSymbol SM_CONSTRAINT_RECORD_P = makeSymbol("SM-CONSTRAINT-RECORD-P");

    static private final SubLString $str_alt174$cb_uia_debug_sm_constraint_record = makeString("cb-uia-debug-sm-constraint-record&~A");

    static private final SubLString $str_alt175$_SC_CR__A_ = makeString("[SC-CR ~A]");

    private static final SubLSymbol $UIA_DEBUG_SM_CONSTRAINT_RECORD = makeKeyword("UIA-DEBUG-SM-CONSTRAINT-RECORD");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_SM_CONSTRAINT_RECORD = makeSymbol("CB-LINK-UIA-DEBUG-SM-CONSTRAINT-RECORD");

    private static final SubLSymbol CB_UIA_DEBUG_SM_CONSTRAINT_RECORD_METHOD = makeSymbol("CB-UIA-DEBUG-SM-CONSTRAINT-RECORD-METHOD");

    static private final SubLString $str_alt179$SM_MERGE_INFO = makeString("SM-MERGE-INFO");

    static private final SubLString $$$From_Scenario = makeString("From Scenario");

    static private final SubLString $$$To_Scenario = makeString("To Scenario");

    static private final SubLString $$$Align_To = makeString("Align To");

    static private final SubLString $$$Align_From = makeString("Align From");

    static private final SubLString $$$Indexical_Equivalences = makeString("Indexical Equivalences");

    private static final SubLSymbol CB_UIA_DEBUG_SM_MERGE_INFO = makeSymbol("CB-UIA-DEBUG-SM-MERGE-INFO");

    private static final SubLSymbol SM_MERGE_INFO_P = makeSymbol("SM-MERGE-INFO-P");

    static private final SubLString $str_alt187$cb_uia_debug_sm_merge_info__A = makeString("cb-uia-debug-sm-merge-info&~A");

    static private final SubLString $str_alt188$_SC_MI__A_ = makeString("[SC-MI ~A]");

    private static final SubLSymbol $UIA_DEBUG_SM_MERGE_INFO = makeKeyword("UIA-DEBUG-SM-MERGE-INFO");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_SM_MERGE_INFO = makeSymbol("CB-LINK-UIA-DEBUG-SM-MERGE-INFO");

    private static final SubLSymbol CB_UIA_DEBUG_SM_MERGE_INFO_METHOD = makeSymbol("CB-UIA-DEBUG-SM-MERGE-INFO-METHOD");

    static private final SubLString $str_alt192$RC_STATE = makeString("RC-STATE");

    static private final SubLString $str_alt193$If_Scenario = makeString("If-Scenario");

    static private final SubLString $str_alt194$Then_Scenario = makeString("Then-Scenario");

    static private final SubLString $$$LHS = makeString("LHS");

    static private final SubLString $$$RHS = makeString("RHS");

    static private final SubLString $str_alt197$Var_Map = makeString("Var-Map");

    static private final SubLList $list_alt198 = list(makeSymbol("EL-VARIABLE"), makeSymbol("INDEXICAL-RECORD"));

    static private final SubLString $str_alt199$__ = makeString("->");

    static private final SubLString $$$Exceptions = makeString("Exceptions");

    private static final SubLSymbol CB_UIA_DEBUG_RC_STATE = makeSymbol("CB-UIA-DEBUG-RC-STATE");

    private static final SubLSymbol RC_STATE_P = makeSymbol("RC-STATE-P");

    static private final SubLString $str_alt203$cb_uia_debug_rc_state__A = makeString("cb-uia-debug-rc-state&~A");

    static private final SubLString $str_alt204$_RC_ = makeString("[RC ");

    static private final SubLString $str_alt205$_ = makeString("]");

    private static final SubLSymbol $UIA_DEBUG_RC_STATE = makeKeyword("UIA-DEBUG-RC-STATE");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_RC_STATE = makeSymbol("CB-LINK-UIA-DEBUG-RC-STATE");

    private static final SubLSymbol CB_UIA_DEBUG_RC_STATE_METHOD = makeSymbol("CB-UIA-DEBUG-RC-STATE-METHOD");

    static private final SubLString $str_alt209$RC_LHS = makeString("RC-LHS");

    private static final SubLSymbol CB_UIA_DEBUG_RC_LHS = makeSymbol("CB-UIA-DEBUG-RC-LHS");

    private static final SubLSymbol RC_LHS_P = makeSymbol("RC-LHS-P");

    static private final SubLString $str_alt212$cb_uia_debug_rc_lhs__A = makeString("cb-uia-debug-rc-lhs&~A");

    static private final SubLString $str_alt213$_RC_LHS_ = makeString("[RC-LHS ");

    private static final SubLSymbol $UIA_DEBUG_RC_LHS = makeKeyword("UIA-DEBUG-RC-LHS");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_RC_LHS = makeSymbol("CB-LINK-UIA-DEBUG-RC-LHS");

    private static final SubLSymbol CB_UIA_DEBUG_RC_LHS_METHOD = makeSymbol("CB-UIA-DEBUG-RC-LHS-METHOD");

    static private final SubLString $str_alt217$RC_RHS = makeString("RC-RHS");

    static private final SubLString $$$Existential_Term = makeString("Existential Term");

    private static final SubLSymbol CB_UIA_DEBUG_RC_RHS = makeSymbol("CB-UIA-DEBUG-RC-RHS");

    private static final SubLSymbol RC_RHS_P = makeSymbol("RC-RHS-P");

    static private final SubLString $str_alt221$cb_uia_debug_rc_rhs__A = makeString("cb-uia-debug-rc-rhs&~A");

    static private final SubLString $str_alt222$_RC_RHS_ = makeString("[RC-RHS ");

    private static final SubLSymbol $UIA_DEBUG_RC_RHS = makeKeyword("UIA-DEBUG-RC-RHS");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_RC_RHS = makeSymbol("CB-LINK-UIA-DEBUG-RC-RHS");

    private static final SubLSymbol CB_UIA_DEBUG_RC_RHS_METHOD = makeSymbol("CB-UIA-DEBUG-RC-RHS-METHOD");

    private static final SubLSymbol AR_CONTEXT = makeSymbol("AR-CONTEXT");

    private static final SubLSymbol AR_CONTEXT_P = makeSymbol("AR-CONTEXT-P");

    static private final SubLList $list_alt228 = list(makeSymbol("INTERACTION"), makeSymbol("AR-STATE"));

    static private final SubLList $list_alt229 = list(makeKeyword("INTERACTION"), makeKeyword("AR-STATE"));

    static private final SubLList $list_alt230 = list(makeSymbol("AR-CONTEXT-INTERACTION"), makeSymbol("AR-CONTEXT-AR-STATE"));

    static private final SubLList $list_alt231 = list(makeSymbol("_CSETF-AR-CONTEXT-INTERACTION"), makeSymbol("_CSETF-AR-CONTEXT-AR-STATE"));



    private static final SubLSymbol AR_CONTEXT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AR-CONTEXT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol AR_CONTEXT_INTERACTION = makeSymbol("AR-CONTEXT-INTERACTION");

    public static final SubLSymbol _CSETF_AR_CONTEXT_INTERACTION = makeSymbol("_CSETF-AR-CONTEXT-INTERACTION");

    private static final SubLSymbol AR_CONTEXT_AR_STATE = makeSymbol("AR-CONTEXT-AR-STATE");

    public static final SubLSymbol _CSETF_AR_CONTEXT_AR_STATE = makeSymbol("_CSETF-AR-CONTEXT-AR-STATE");



    private static final SubLSymbol $AR_STATE = makeKeyword("AR-STATE");

    static private final SubLString $str_alt240$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt241 = list(makeSymbol("UI-ID"));

    static private final SubLString $str_alt242$Self__ar_context____ = makeString("Self (ar-context) : ");

    static private final SubLString $str_alt243$Master__UI____ = makeString("Master (UI) : ");

    static private final SubLString $str_alt244$State__ar_state____ = makeString("State (ar-state) : ");

    private static final SubLSymbol CB_UIA_DEBUG_AR_CONTEXT = makeSymbol("CB-UIA-DEBUG-AR-CONTEXT");

    static private final SubLString $str_alt246$cb_uia_debug_ar_context__A = makeString("cb-uia-debug-ar-context&~A");

    static private final SubLString $str_alt247$_AR_Ctxt__A_ = makeString("[AR-Ctxt ~A]");

    private static final SubLSymbol $UIA_DEBUG_AR_CONTEXT = makeKeyword("UIA-DEBUG-AR-CONTEXT");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_AR_CONTEXT = makeSymbol("CB-LINK-UIA-DEBUG-AR-CONTEXT");

    private static final SubLSymbol CB_UIA_DEBUG_AR_CONTEXT_METHOD = makeSymbol("CB-UIA-DEBUG-AR-CONTEXT-METHOD");

    private static final SubLSymbol $AR_CONTEXT = makeKeyword("AR-CONTEXT");

    static private final SubLString $str_alt252$Self__State____ = makeString("Self (State) : ");

    static private final SubLString $str_alt253$ISG___ = makeString("ISG : ");

    static private final SubLString $str_alt254$Source_Sentences___ = makeString("Source Sentences : ");

    static private final SubLString $str_alt255$Focus_Sentence___ = makeString("Focus Sentence : ");

    static private final SubLString $str_alt256$Completed_Sentences___ = makeString("Completed Sentences : ");

    static private final SubLString $str_alt257$Unknown_Phrases___ = makeString("Unknown Phrases : ");

    static private final SubLString $str_alt258$Rejected_Phrases___ = makeString("Rejected Phrases : ");

    static private final SubLString $str_alt259$Irrelevant_Phrases___ = makeString("Irrelevant Phrases : ");

    static private final SubLString $str_alt260$Ambiguous_Phrases___ = makeString("Ambiguous Phrases : ");

    static private final SubLString $str_alt261$Assumed_Phrases___ = makeString("Assumed Phrases : ");

    static private final SubLString $str_alt262$Pending_Phrases___ = makeString("Pending Phrases : ");

    static private final SubLString $str_alt263$Accepted_Phrases___ = makeString("Accepted Phrases : ");

    static private final SubLString $str_alt264$Pending_Concepts___ = makeString("Pending Concepts : ");

    static private final SubLString $str_alt265$Accepted_Concepts___ = makeString("Accepted Concepts : ");

    static private final SubLString $str_alt266$Candidate_Assertions_Queries___ = makeString("Candidate Assertions/Queries : ");

    static private final SubLString $str_alt267$Asserted_Assertions___ = makeString("Asserted Assertions : ");

    static private final SubLString $str_alt268$Term_Templates___ = makeString("Term Templates : ");

    static private final SubLString $str_alt269$Assert_Templates___ = makeString("Assert Templates : ");

    private static final SubLSymbol CB_UIA_DEBUG_AR_STATE = makeSymbol("CB-UIA-DEBUG-AR-STATE");

    private static final SubLSymbol AR_STATE_P = makeSymbol("AR-STATE-P");

    static private final SubLString $str_alt272$cb_uia_debug_ar_state__A = makeString("cb-uia-debug-ar-state&~A");

    static private final SubLString $str_alt273$_AR__A_ = makeString("[AR ~A]");

    private static final SubLSymbol $UIA_DEBUG_AR_STATE = makeKeyword("UIA-DEBUG-AR-STATE");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_AR_STATE = makeSymbol("CB-LINK-UIA-DEBUG-AR-STATE");

    private static final SubLSymbol CB_UIA_DEBUG_AR_STATE_METHOD = makeSymbol("CB-UIA-DEBUG-AR-STATE-METHOD");

    static private final SubLList $list_alt277 = list(makeSymbol("UI-ID"), makeSymbol("SENTENCE-ID-STRING"));

    static private final SubLString $str_alt278$Self__Sentence____ = makeString("Self (Sentence) : ");

    static private final SubLString $str_alt279$Master__State____ = makeString("Master (State) : ");

    static private final SubLString $str_alt280$ID___ = makeString("ID : ");

    static private final SubLString $str_alt281$Plaintext___ = makeString("Plaintext : ");

    static private final SubLString $str_alt282$Token_vector___ = makeString("Token vector : ");

    static private final SubLString $str_alt283$Clarifications___ = makeString("Clarifications : ");

    static private final SubLString $str_alt284$Source_Sentence___ = makeString("Source Sentence : ");

    static private final SubLString $str_alt285$Phrases___ = makeString("Phrases : ");

    private static final SubLSymbol CB_UIA_DEBUG_AR_SENTENCE = makeSymbol("CB-UIA-DEBUG-AR-SENTENCE");

    private static final SubLSymbol AR_SENTENCE_P = makeSymbol("AR-SENTENCE-P");

    static private final SubLString $str_alt288$cb_uia_debug_ar_sentence__A__A = makeString("cb-uia-debug-ar-sentence&~A&~A");

    static private final SubLString $str_alt289$__ = makeString("[[");

    static private final SubLString $str_alt290$__ = makeString("]]");

    private static final SubLSymbol $UIA_DEBUG_AR_SENTENCE = makeKeyword("UIA-DEBUG-AR-SENTENCE");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_AR_SENTENCE = makeSymbol("CB-LINK-UIA-DEBUG-AR-SENTENCE");

    private static final SubLSymbol CB_UIA_DEBUG_AR_SENTENCE_METHOD = makeSymbol("CB-UIA-DEBUG-AR-SENTENCE-METHOD");

    static private final SubLList $list_alt294 = list(makeSymbol("UI-ID"), makeSymbol("TOKEN-ID-STRING"));

    static private final SubLString $str_alt295$Self__Token____ = makeString("Self (Token) : ");

    static private final SubLString $str_alt296$Text___ = makeString("Text : ");

    static private final SubLString $str_alt297$Sentence___ = makeString("Sentence : ");

    static private final SubLString $str_alt298$Number___ = makeString("Number : ");

    private static final SubLSymbol CB_UIA_DEBUG_AR_TOKEN = makeSymbol("CB-UIA-DEBUG-AR-TOKEN");

    private static final SubLSymbol AR_TOKEN_P = makeSymbol("AR-TOKEN-P");

    static private final SubLString $str_alt301$cb_uia_debug_ar_token__A__A = makeString("cb-uia-debug-ar-token&~A&~A");

    static private final SubLString $str_alt302$_ = makeString("[");

    private static final SubLSymbol $UIA_DEBUG_AR_TOKEN = makeKeyword("UIA-DEBUG-AR-TOKEN");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_AR_TOKEN = makeSymbol("CB-LINK-UIA-DEBUG-AR-TOKEN");

    private static final SubLSymbol CB_UIA_DEBUG_AR_TOKEN_METHOD = makeSymbol("CB-UIA-DEBUG-AR-TOKEN-METHOD");

    static private final SubLList $list_alt306 = list(makeSymbol("UI-ID"), makeSymbol("PHRASE-ID-STRING"));

    static private final SubLString $str_alt307$Self__Phrase____ = makeString("Self (Phrase) : ");

    static private final SubLString $str_alt308$Status___ = makeString("Status : ");

    static private final SubLString $str_alt309$Force___ = makeString("Force : ");

    static private final SubLString $str_alt310$Token_List___ = makeString("Token List : ");

    static private final SubLString $str_alt311$_Plausible__Concepts___ = makeString("(Plausible) Concepts : ");

    static private final SubLString $str_alt312$Rejected_Concepts___ = makeString("Rejected Concepts : ");

    static private final SubLString $str_alt313$Disambiguated_Concept___ = makeString("Disambiguated Concept : ");

    static private final SubLString $str_alt314$Surrogate___ = makeString("Surrogate : ");

    static private final SubLString $str_alt315$Constraint___ = makeString("Constraint : ");

    private static final SubLSymbol CB_UIA_DEBUG_AR_PHRASE = makeSymbol("CB-UIA-DEBUG-AR-PHRASE");

    private static final SubLSymbol AR_PHRASE_P = makeSymbol("AR-PHRASE-P");

    static private final SubLString $str_alt318$cb_uia_debug_ar_phrase__A__A = makeString("cb-uia-debug-ar-phrase&~A&~A");

    private static final SubLSymbol $UIA_DEBUG_AR_PHRASE = makeKeyword("UIA-DEBUG-AR-PHRASE");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_AR_PHRASE = makeSymbol("CB-LINK-UIA-DEBUG-AR-PHRASE");

    private static final SubLSymbol CB_UIA_DEBUG_AR_PHRASE_METHOD = makeSymbol("CB-UIA-DEBUG-AR-PHRASE-METHOD");

    static private final SubLList $list_alt322 = list(makeSymbol("UI-ID"), makeSymbol("CONCEPT-ID-STRING"));

    static private final SubLString $str_alt323$Self__Concept____ = makeString("Self (Concept) : ");

    static private final SubLString $str_alt324$Confidence__ = makeString("Confidence: ");

    static private final SubLString $str_alt325$Open_Term_Score__ = makeString("Open Term Score: ");

    static private final SubLString $str_alt326$Force__ = makeString("Force: ");

    static private final SubLString $str_alt327$CycL___ = makeString("CycL : ");

    static private final SubLString $str_alt328$Disambiguation_Text___ = makeString("Disambiguation Text : ");

    static private final SubLString $str_alt329$Parts___ = makeString("Parts : ");

    static private final SubLString $str_alt330$Agglomerations___ = makeString("Agglomerations : ");

    private static final SubLSymbol CB_UIA_DEBUG_AR_CONCEPT = makeSymbol("CB-UIA-DEBUG-AR-CONCEPT");

    private static final SubLSymbol AR_CONCEPT_P = makeSymbol("AR-CONCEPT-P");

    static private final SubLString $str_alt333$cb_uia_debug_ar_concept__A__A = makeString("cb-uia-debug-ar-concept&~A&~A");

    private static final SubLSymbol $UIA_DEBUG_AR_CONCEPT = makeKeyword("UIA-DEBUG-AR-CONCEPT");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_AR_CONCEPT = makeSymbol("CB-LINK-UIA-DEBUG-AR-CONCEPT");

    private static final SubLSymbol CB_UIA_DEBUG_AR_CONCEPT_METHOD = makeSymbol("CB-UIA-DEBUG-AR-CONCEPT-METHOD");

    static private final SubLList $list_alt337 = list(makeSymbol("UI-ID"), makeSymbol("TEMPLATE-ID-STRING"));

    static private final SubLString $str_alt338$Self__Template____ = makeString("Self (Template) : ");

    static private final SubLString $str_alt339$Concept___ = makeString("Concept : ");

    static private final SubLString $str_alt340$Formula___ = makeString("Formula : ");

    static private final SubLString $str_alt341$Prompt___ = makeString("Prompt : ");

    static private final SubLString $str_alt342$Choice_Table___ = makeString("Choice Table : ");

    static private final SubLList $list_alt343 = list(makeSymbol("PARAMETER"), makeSymbol("CHOICES"));



    private static final SubLSymbol CB_UIA_DEBUG_AR_TEMPLATE = makeSymbol("CB-UIA-DEBUG-AR-TEMPLATE");

    private static final SubLSymbol AR_TEMPLATE_P = makeSymbol("AR-TEMPLATE-P");

    static private final SubLString $str_alt347$cb_uia_debug_ar_template__A__A = makeString("cb-uia-debug-ar-template&~A&~A");

    static private final SubLString $str_alt348$_Template___ = makeString("[Template : ");

    private static final SubLSymbol $UIA_DEBUG_AR_TEMPLATE = makeKeyword("UIA-DEBUG-AR-TEMPLATE");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_AR_TEMPLATE = makeSymbol("CB-LINK-UIA-DEBUG-AR-TEMPLATE");

    private static final SubLSymbol CB_UIA_DEBUG_AR_TEMPLATE_METHOD = makeSymbol("CB-UIA-DEBUG-AR-TEMPLATE-METHOD");

    private static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPTER_P = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-P");

    static private final SubLString $str_alt353$cb_uia_debug_rkf_salient_descript = makeString("cb-uia-debug-rkf-salient-descriptor-prompter&~A");

    static private final SubLString $str_alt354$_RKF_SD_PROMPTER__A_ = makeString("[RKF-SD-PROMPTER ~A]");

    private static final SubLSymbol $UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPTER = makeKeyword("UIA-DEBUG-RKF-SALIENT-DESCRIPTOR-PROMPTER");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPTER = makeSymbol("CB-LINK-UIA-DEBUG-RKF-SALIENT-DESCRIPTOR-PROMPTER");

    private static final SubLSymbol CB_UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPTER_METHOD = makeSymbol("CB-UIA-DEBUG-RKF-SALIENT-DESCRIPTOR-PROMPTER-METHOD");

    private static final SubLSymbol $UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPT = makeKeyword("UIA-DEBUG-RKF-SALIENT-DESCRIPTOR-PROMPT");

    private static final SubLSymbol CB_UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPT_METHOD = makeSymbol("CB-UIA-DEBUG-RKF-SALIENT-DESCRIPTOR-PROMPT-METHOD");

    private static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPT_P = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT-P");

    static private final SubLString $str_alt361$cb_uia_debug_rkf_salient_descript = makeString("cb-uia-debug-rkf-salient-descriptor-prompt&~A&~A");

    static private final SubLString $str_alt362$_RKF_SD_PROMPT__A_ = makeString("[RKF-SD-PROMPT ~A]");

    private static final SubLSymbol CB_LINK_UIA_DEBUG_RKF_SALIENT_DESCRIPTOR_PROMPT = makeSymbol("CB-LINK-UIA-DEBUG-RKF-SALIENT-DESCRIPTOR-PROMPT");



    static private final SubLString $str_alt365$Thinking_Object_ = makeString("Thinking Object:");

    static private final SubLString $str_alt366$Name_ = makeString("Name:");

    static private final SubLString $str_alt367$Status_ = makeString("Status:");

    static private final SubLString $str_alt368$Progress_Message_ = makeString("Progress Message:");

    static private final SubLString $str_alt369$Progress_Sofar_ = makeString("Progress Sofar:");

    static private final SubLString $str_alt370$Progress_Total_ = makeString("Progress Total:");

    static private final SubLString $str_alt371$Result_ = makeString("Result:");

    static private final SubLString $str_alt372$Start_Time_ = makeString("Start Time:");

    static private final SubLString $str_alt373$Finish_Time_ = makeString("Finish Time:");

    static private final SubLString $str_alt374$Error_Message_ = makeString("Error Message:");

    static private final SubLString $str_alt375$Thread_Object_ = makeString("Thread Object:");

    static private final SubLString $str_alt376$Properties_ = makeString("Properties:");

    private static final SubLSymbol CB_UIA_DEBUG_THINKING_TASK_METHOD = makeSymbol("CB-UIA-DEBUG-THINKING-TASK-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_debugging_file();
    }

    public void initializeVariables() {
        init_cb_uia_debugging_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_debugging_file();
    }
}

