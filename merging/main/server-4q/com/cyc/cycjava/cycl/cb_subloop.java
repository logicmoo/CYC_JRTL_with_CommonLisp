/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-SUBLOOP
 *  source file: /cyc/top/cycl/cb-subloop.lisp
 *  created:     2019/07/03 17:38:08
 */
public final class cb_subloop extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_subloop() {
    }

    public static final SubLFile me = new cb_subloop();

    public static final String myName = "com.cyc.cycjava.cycl.cb_subloop";

    // // Definitions
    // defconstant
    public static final SubLSymbol $cb_object_name_input_width$ = makeSymbol("*CB-OBJECT-NAME-INPUT-WIDTH*");

    // defconstant
    public static final SubLSymbol $cb_method_name_input_width$ = makeSymbol("*CB-METHOD-NAME-INPUT-WIDTH*");

    public static final SubLObject classes_construct_display_object_form() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
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
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input($str_alt1$cb_classes_handle_display_object, T, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt2$Enter_a_class_or_interface_name_);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_text_input($str_alt3$object_name, $str_alt4$, $cb_object_name_input_width$.getGlobalValue());
                        html_utilities.html_indent(ONE_INTEGER);
                        html_script_utilities.html_clear_input_button($str_alt3$object_name, $$$Clear_Object_Name);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_submit_input($$$Display_Object, UNPROVIDED, UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject classes_construct_display_method_form() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
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
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input($str_alt7$cb_subloop_handle_display_method, T, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ($str_alt2$Enter_a_class_or_interface_name_);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_text_input($str_alt8$object_name_for_method_form, $str_alt4$, $cb_object_name_input_width$.getGlobalValue());
                        html_utilities.html_indent(ONE_INTEGER);
                        html_script_utilities.html_clear_input_button($str_alt8$object_name_for_method_form, $$$Clear_Object_Name);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_text_input($str_alt9$method_name, $str_alt4$, $cb_method_name_input_width$.getGlobalValue());
                        html_utilities.html_indent(ONE_INTEGER);
                        html_script_utilities.html_clear_input_button($str_alt9$method_name, $$$Clear_Method_Name);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_submit_input($$$Display_Method_Details, UNPROVIDED, UNPROVIDED);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject classes_display_page_header() {
        cb_utilities.cb_link($SUBLOOP_CLASS_HIERARCHY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_newline(TWO_INTEGER);
        classes_construct_display_object_form();
        return NIL;
    }

    public static final SubLObject get_slot_name_string(SubLObject slot_object) {
        return symbol_name(slots.slot_name(slot_object));
    }

    public static final SubLObject get_method_name_string(SubLObject method_object) {
        return symbol_name(subloop_structures.method_name(method_object));
    }

    public static final SubLObject unique_method_p(SubLObject method, SubLObject method_list) {
        {
            SubLObject method_name = subloop_structures.method_name(method);
            SubLObject cdolist_list_var = method_list;
            SubLObject current_method = NIL;
            for (current_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_method = cdolist_list_var.first()) {
                if (subloop_structures.method_name(current_method) == method_name) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static final SubLObject uniquify_method_list(SubLObject method_list) {
        {
            SubLObject unique_elements = NIL;
            SubLObject cdolist_list_var = method_list;
            SubLObject method_object = NIL;
            for (method_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method_object = cdolist_list_var.first()) {
                if (NIL != unique_method_p(method_object, unique_elements)) {
                    unique_elements = cons(method_object, unique_elements);
                }
            }
            return nreverse(unique_elements);
        }
    }

    public static final SubLObject classes_display_class_in_html(SubLObject base_class_symbolic_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ONE_INTEGER);
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
                        SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    classes_display_page_header();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    classes_construct_display_method_form();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject actual_class = classes.classes_retrieve_class(base_class_symbolic_name);
                                        if (NIL == actual_class) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(format(NIL, $str_alt13$_S_is_not_a_defined_class_, base_class_symbolic_name));
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_newline(ONE_INTEGER);
                                        }
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_princ(format(NIL, $str_alt14$Description_of_class__S_, base_class_symbolic_name));
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(THREE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_princ($str_alt15$Class_Inheritance_Path__);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(THREE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_newline(ONE_INTEGER);
                                        html_utilities.html_indent(FOUR_INTEGER);
                                        {
                                            SubLObject cdolist_list_var = reverse(subloop_structures.class_compiled_inheritance_path(actual_class));
                                            SubLObject super_class = NIL;
                                            for (super_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , super_class = cdolist_list_var.first()) {
                                                if (super_class == actual_class) {
                                                    html_utilities.html_princ(subloop_structures.class_name(super_class));
                                                } else {
                                                    cb_utilities.cb_link($SUBLOOP_CLASS_NAME, subloop_structures.class_name(super_class), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_princ($str_alt17$__);
                                                }
                                            }
                                        }
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_indent(TWO_INTEGER);
                                        {
                                            SubLObject direct_subclasses = subloop_structures.class_subclasses(actual_class);
                                            if (NIL != direct_subclasses) {
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($str_alt18$Direct_Subclasses__);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject cdolist_list_var = Sort.sort(copy_list(direct_subclasses), symbol_function($sym19$STRING_), symbol_function(SYMBOL_NAME));
                                                    SubLObject subclass_name = NIL;
                                                    for (subclass_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclass_name = cdolist_list_var.first()) {
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(FOUR_INTEGER);
                                                        cb_utilities.cb_link($SUBLOOP_CLASS_NAME, subclass_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_indent(TWO_INTEGER);
                                            }
                                        }
                                        {
                                            SubLObject interface_names = interfaces.subloop_all_interfaces_of_class(actual_class);
                                            if (NIL != interface_names) {
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($str_alt21$Implements_Interfaces__);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject cdolist_list_var = Sort.sort(copy_list(interface_names), symbol_function($sym19$STRING_), symbol_function(SYMBOL_NAME));
                                                    SubLObject interface_name = NIL;
                                                    for (interface_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interface_name = cdolist_list_var.first()) {
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(FOUR_INTEGER);
                                                        cb_utilities.cb_link($SUBLOOP_INTERFACE_NAME, interface_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                        html_utilities.html_newline(TWO_INTEGER);
                                        {
                                            SubLObject v_class = actual_class;
                                            SubLObject name = subloop_structures.class_name(v_class);
                                            SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
                                            SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class);
                                            SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
                                            SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
                                            SubLObject compiled_instance_method_access_alist = subloop_structures.class_compiled_instance_method_access_alist(v_class);
                                            SubLObject compiled_class_method_access_alist = subloop_structures.class_compiled_class_method_access_alist(v_class);
                                            if (NIL != compiled_class_boolean_slot_access_alist) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($str_alt23$Class_Slots__boolean__);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_newline(ONE_INTEGER);
                                                {
                                                    SubLObject slot_name = NIL;
                                                    SubLObject protection = NIL;
                                                    SubLObject class_name = NIL;
                                                    SubLObject init_value = NIL;
                                                    SubLObject cdolist_list_var = Sort.sort(copy_list(compiled_class_boolean_slot_access_alist), symbol_function($sym19$STRING_), symbol_function(GET_SLOT_NAME_STRING));
                                                    SubLObject slot = NIL;
                                                    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                                                        slot_name = slots.slot_name(slot);
                                                        protection = slots.slot_protection(slot);
                                                        class_name = slots.slot_class_name(slot);
                                                        init_value = slots.slot_init_value(slot);
                                                        html_utilities.html_indent(FOUR_INTEGER);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ(symbol_name(slot_name));
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(EIGHT_INTEGER);
                                                        html_utilities.html_princ($str_alt24$__Introduced_by_class__);
                                                        cb_utilities.cb_link($SUBLOOP_CLASS_NAME, class_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt25$_);
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(EIGHT_INTEGER);
                                                        html_utilities.html_princ(format(NIL, $str_alt26$__Protection_level___S_, protection));
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(EIGHT_INTEGER);
                                                        html_utilities.html_princ(format(NIL, $str_alt27$__Initial_value___S_, init_value));
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                    }
                                                }
                                            }
                                            if (NIL != compiled_class_slot_access_alist) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($str_alt29$Class_Slots__normal__);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_newline(ONE_INTEGER);
                                                {
                                                    SubLObject slot_name = NIL;
                                                    SubLObject protection = NIL;
                                                    SubLObject class_name = NIL;
                                                    SubLObject init_value = NIL;
                                                    SubLObject cdolist_list_var = Sort.sort(copy_list(compiled_class_slot_access_alist), symbol_function($sym19$STRING_), symbol_function(GET_SLOT_NAME_STRING));
                                                    SubLObject slot = NIL;
                                                    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                                                        slot_name = slots.slot_name(slot);
                                                        protection = slots.slot_protection(slot);
                                                        class_name = slots.slot_class_name(slot);
                                                        init_value = slots.slot_init_value(slot);
                                                        html_utilities.html_indent(FOUR_INTEGER);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ(symbol_name(slot_name));
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(EIGHT_INTEGER);
                                                        html_utilities.html_princ($str_alt24$__Introduced_by_class__);
                                                        cb_utilities.cb_link($SUBLOOP_CLASS_NAME, class_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt25$_);
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(EIGHT_INTEGER);
                                                        html_utilities.html_princ(format(NIL, $str_alt26$__Protection_level___S_, protection));
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(EIGHT_INTEGER);
                                                        html_utilities.html_princ(format(NIL, $str_alt27$__Initial_value___S_, init_value));
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                    }
                                                }
                                            }
                                            if (NIL != compiled_instance_boolean_slot_access_alist) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($str_alt30$Instance_Slots__boolean__);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_newline(ONE_INTEGER);
                                                {
                                                    SubLObject slot_name = NIL;
                                                    SubLObject protection = NIL;
                                                    SubLObject class_name = NIL;
                                                    SubLObject init_value = NIL;
                                                    SubLObject cdolist_list_var = Sort.sort(copy_list(compiled_instance_boolean_slot_access_alist), symbol_function($sym19$STRING_), symbol_function(GET_SLOT_NAME_STRING));
                                                    SubLObject slot = NIL;
                                                    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                                                        slot_name = slots.slot_name(slot);
                                                        protection = slots.slot_protection(slot);
                                                        class_name = slots.slot_class_name(slot);
                                                        init_value = slots.slot_init_value(slot);
                                                        html_utilities.html_indent(FOUR_INTEGER);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ(symbol_name(slot_name));
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(EIGHT_INTEGER);
                                                        html_utilities.html_princ($str_alt24$__Introduced_by_class__);
                                                        cb_utilities.cb_link($SUBLOOP_CLASS_NAME, class_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt25$_);
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(EIGHT_INTEGER);
                                                        html_utilities.html_princ(format(NIL, $str_alt26$__Protection_level___S_, protection));
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(EIGHT_INTEGER);
                                                        html_utilities.html_princ(format(NIL, $str_alt27$__Initial_value___S_, init_value));
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                    }
                                                }
                                            }
                                            if (NIL != compiled_instance_slot_access_alist) {
                                                html_utilities.html_indent(TWO_INTEGER);
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($str_alt31$Instance_Slots__normal__);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_newline(ONE_INTEGER);
                                                {
                                                    SubLObject slot_name = NIL;
                                                    SubLObject protection = NIL;
                                                    SubLObject class_name = NIL;
                                                    SubLObject init_value = NIL;
                                                    SubLObject cdolist_list_var = Sort.sort(copy_list(compiled_instance_slot_access_alist), symbol_function($sym19$STRING_), symbol_function(GET_SLOT_NAME_STRING));
                                                    SubLObject slot = NIL;
                                                    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                                                        slot_name = slots.slot_name(slot);
                                                        protection = slots.slot_protection(slot);
                                                        class_name = slots.slot_class_name(slot);
                                                        init_value = slots.slot_init_value(slot);
                                                        html_utilities.html_indent(FOUR_INTEGER);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ(symbol_name(slot_name));
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(EIGHT_INTEGER);
                                                        html_utilities.html_princ($str_alt24$__Introduced_by_class__);
                                                        cb_utilities.cb_link($SUBLOOP_CLASS_NAME, class_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt25$_);
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(EIGHT_INTEGER);
                                                        html_utilities.html_princ(format(NIL, $str_alt26$__Protection_level___S_, protection));
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(EIGHT_INTEGER);
                                                        html_utilities.html_princ(format(NIL, $str_alt27$__Initial_value___S_, init_value));
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                    }
                                                }
                                            }
                                            if (NIL != compiled_class_method_access_alist) {
                                                html_utilities.html_newline(ONE_INTEGER);
                                                html_utilities.html_indent(TWO_INTEGER);
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($str_alt32$Class_Methods__);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject cdolist_list_var = Sort.sort(uniquify_method_list(compiled_class_method_access_alist), symbol_function($sym19$STRING_), symbol_function(GET_METHOD_NAME_STRING));
                                                    SubLObject method_info = NIL;
                                                    for (method_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method_info = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject method = method_info;
                                                            SubLObject name_7 = subloop_structures.method_name(method);
                                                            SubLObject class_name = subloop_structures.method_class_name(method);
                                                            SubLObject lambda_list = subloop_structures.method_lambda_list(method);
                                                            SubLObject protection = subloop_structures.method_protection(method);
                                                            SubLObject scope = subloop_structures.method_scope(method);
                                                            html_utilities.html_newline(ONE_INTEGER);
                                                            html_utilities.html_indent(FOUR_INTEGER);
                                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                            cb_utilities.cb_link($SUBLOOP_DISPLAY_METHOD, class_name, name_7, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_princ($str_alt34$__);
                                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                            {
                                                                SubLObject cdolist_list_var_8 = lambda_list;
                                                                SubLObject arg = NIL;
                                                                for (arg = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , arg = cdolist_list_var_8.first()) {
                                                                    if (arg.isCons()) {
                                                                        html_utilities.html_princ(cconcatenate($str_alt35$___, new SubLObject[]{ symbol_name(arg.first().isSymbol() ? ((SubLObject) (arg.first())) : $ILL_FORMED_ARG), arg.rest().isCons() ? ((SubLObject) (format(NIL, $str_alt37$__S, cadr(arg)))) : $str_alt4$, $str_alt38$_ }));
                                                                    } else {
                                                                        html_utilities.html_princ(format(NIL, $str_alt39$___S, arg));
                                                                    }
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                            html_utilities.html_newline(ONE_INTEGER);
                                                            html_utilities.html_indent(EIGHT_INTEGER);
                                                            html_utilities.html_princ($str_alt24$__Introduced_by_class__);
                                                            cb_utilities.cb_link($SUBLOOP_CLASS_NAME, class_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_princ($str_alt25$_);
                                                            html_utilities.html_newline(ONE_INTEGER);
                                                            html_utilities.html_indent(EIGHT_INTEGER);
                                                            html_utilities.html_princ(cconcatenate($str_alt40$__Protection_level__, symbol_name(protection)));
                                                            html_utilities.html_newline(ONE_INTEGER);
                                                            html_utilities.html_indent(EIGHT_INTEGER);
                                                            html_utilities.html_princ(cconcatenate($str_alt41$__Scope__, symbol_name(scope)));
                                                        }
                                                    }
                                                }
                                                html_utilities.html_newline(ONE_INTEGER);
                                                html_utilities.html_indent(TWO_INTEGER);
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($str_alt43$Instance_Methods__);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject cdolist_list_var = Sort.sort(uniquify_method_list(compiled_instance_method_access_alist), symbol_function($sym19$STRING_), symbol_function(GET_METHOD_NAME_STRING));
                                                    SubLObject method_info = NIL;
                                                    for (method_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method_info = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject method = method_info;
                                                            SubLObject name_9 = subloop_structures.method_name(method);
                                                            SubLObject class_name = subloop_structures.method_class_name(method);
                                                            SubLObject lambda_list = subloop_structures.method_lambda_list(method);
                                                            SubLObject protection = subloop_structures.method_protection(method);
                                                            SubLObject scope = subloop_structures.method_scope(method);
                                                            html_utilities.html_newline(ONE_INTEGER);
                                                            html_utilities.html_indent(FOUR_INTEGER);
                                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                            cb_utilities.cb_link($SUBLOOP_DISPLAY_METHOD, class_name, name_9, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_princ($str_alt34$__);
                                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                            {
                                                                SubLObject cdolist_list_var_10 = lambda_list;
                                                                SubLObject arg = NIL;
                                                                for (arg = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , arg = cdolist_list_var_10.first()) {
                                                                    if (arg.isCons()) {
                                                                        html_utilities.html_princ(cconcatenate($str_alt35$___, new SubLObject[]{ symbol_name(arg.first().isSymbol() ? ((SubLObject) (arg.first())) : $ILL_FORMED_ARG), arg.rest().isCons() ? ((SubLObject) (format(NIL, $str_alt37$__S, cadr(arg)))) : $str_alt4$, $str_alt38$_ }));
                                                                    } else {
                                                                        html_utilities.html_princ(format(NIL, $str_alt39$___S, arg));
                                                                    }
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                            html_utilities.html_newline(ONE_INTEGER);
                                                            html_utilities.html_indent(EIGHT_INTEGER);
                                                            html_utilities.html_princ($str_alt24$__Introduced_by_class__);
                                                            cb_utilities.cb_link($SUBLOOP_CLASS_NAME, class_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_princ($str_alt25$_);
                                                            html_utilities.html_newline(ONE_INTEGER);
                                                            html_utilities.html_indent(EIGHT_INTEGER);
                                                            html_utilities.html_princ(cconcatenate($str_alt40$__Protection_level__, symbol_name(protection)));
                                                            html_utilities.html_newline(ONE_INTEGER);
                                                            html_utilities.html_indent(EIGHT_INTEGER);
                                                            html_utilities.html_princ(cconcatenate($str_alt41$__Scope__, symbol_name(scope)));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_subloop_class_name_internal(SubLObject arghash) {
        {
            SubLObject class_name = intern(html_arghash.get_arghash_value($CLASS_NAME, arghash), UNPROVIDED);
            return classes_display_class_in_html(class_name);
        }
    }

    public static final SubLObject cb_subloop_class_name(SubLObject args) {
        return cb_subloop_class_name_internal(html_arghash.arglist_to_arghash(args));
    }

    public static final SubLObject cb_link_subloop_class_name(SubLObject class_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject href = format(NIL, $str_alt46$cg_cb_subloop_class_name__class_n, class_name);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(href);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(class_name);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject classes_display_class_name_in_html_at_depth(SubLObject class_name, SubLObject depth) {
        html_utilities.html_indent(depth);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        cb_utilities.cb_link($SUBLOOP_CLASS_NAME, class_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_newline(ONE_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        return class_name;
    }

    public static final SubLObject classes_display_hierarchy_in_html(SubLObject base_class_symbolic_name) {
        {
            SubLObject stack = list(cons(classes.classes_retrieve_class(base_class_symbolic_name), ZERO_INTEGER));
            SubLObject depth = NIL;
            SubLObject stack_element = NIL;
            SubLObject actual_class = NIL;
            SubLObject class_symbolic_name = NIL;
            while (NIL != stack) {
                stack_element = stack.first();
                stack = stack.rest();
                depth = stack_element.rest();
                actual_class = stack_element.first();
                if (NIL != actual_class) {
                    class_symbolic_name = subloop_structures.class_name(actual_class);
                    classes_display_class_name_in_html_at_depth(class_symbolic_name, multiply(depth, TWO_INTEGER));
                    {
                        SubLObject next_depth = add(depth, ONE_INTEGER);
                        SubLObject actual_child = NIL;
                        SubLObject cdolist_list_var = subloop_structures.class_subclasses(actual_class);
                        SubLObject child_class = NIL;
                        for (child_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child_class = cdolist_list_var.first()) {
                            actual_child = classes.classes_retrieve_class(child_class);
                            if (NIL != actual_child) {
                                stack = cons(cons(actual_child, next_depth), stack);
                            }
                        }
                    }
                }
            } 
        }
        return base_class_symbolic_name;
    }

    public static final SubLObject cb_classes_display_hierarchy_in_html(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Display_Class_Hierarchy;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        html_complete.html_autocomplete_css();
                        html_complete.html_autocomplete_scripts();
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_11 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt51$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
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
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                classes_construct_display_object_form();
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
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
                                                                classes_construct_display_method_form();
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                classes_display_hierarchy_in_html(OBJECT);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_11, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_subloop_class_hierarchy() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject href = $str_alt54$cg_cb_classes_display_hierarchy_i;
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(href);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($$$Display_Class_Hierarchy);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_classes_display_object(SubLObject args) {
        classes_construct_display_object_form();
        return NIL;
    }

    public static final SubLObject interfaces_display_interface_in_html(SubLObject base_interface_symbolic_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ONE_INTEGER);
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
                        SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    classes_display_page_header();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    classes_construct_display_method_form();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject actual_interface = interfaces.interfaces_retrieve_interface(base_interface_symbolic_name);
                                        if (NIL == actual_interface) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(format(NIL, $str_alt57$_S_is_not_a_defined_interface, base_interface_symbolic_name));
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_newline(ONE_INTEGER);
                                        }
                                        cb_utilities.cb_link($SUBLOOP_INTERFACE_HIERARCHY, base_interface_symbolic_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_newline(TWO_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_princ(format(NIL, $str_alt59$Description_of_interface__S_, base_interface_symbolic_name));
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject parent_interfaces = subloop_structures.interface_parents(actual_interface);
                                            if (NIL != parent_interfaces) {
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($str_alt60$Parent_Interfaces__);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject cdolist_list_var = Sort.sort(copy_list(parent_interfaces), symbol_function($sym19$STRING_), symbol_function(SYMBOL_NAME));
                                                    SubLObject parent_interface = NIL;
                                                    for (parent_interface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent_interface = cdolist_list_var.first()) {
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(FOUR_INTEGER);
                                                        cb_utilities.cb_link($SUBLOOP_INTERFACE_NAME, parent_interface, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_indent(TWO_INTEGER);
                                            }
                                        }
                                        {
                                            SubLObject subinterfaces = subloop_structures.interface_subinterfaces(actual_interface);
                                            if (NIL != subinterfaces) {
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($str_alt61$Child_Interfaces__);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject cdolist_list_var = Sort.sort(copy_list(subinterfaces), symbol_function($sym19$STRING_), symbol_function(SYMBOL_NAME));
                                                    SubLObject subinterface = NIL;
                                                    for (subinterface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subinterface = cdolist_list_var.first()) {
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(FOUR_INTEGER);
                                                        cb_utilities.cb_link($SUBLOOP_INTERFACE_NAME, subinterface, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_indent(TWO_INTEGER);
                                            }
                                        }
                                        {
                                            SubLObject all_implementing_classes = interfaces.subloop_all_classes_implementing_interface(actual_interface);
                                            if (NIL != all_implementing_classes) {
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($str_alt62$Implementing_Classes__);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(THREE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject cdolist_list_var = Sort.sort(copy_list(all_implementing_classes), symbol_function($sym19$STRING_), symbol_function(GET_CLASS_NAME_STRING));
                                                    SubLObject v_class = NIL;
                                                    for (v_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_class = cdolist_list_var.first()) {
                                                        html_utilities.html_newline(ONE_INTEGER);
                                                        html_utilities.html_indent(FOUR_INTEGER);
                                                        cb_utilities.cb_link($SUBLOOP_CLASS_NAME, subloop_structures.class_name(v_class), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                        interfaces_display_interface_methods_in_html(subloop_structures.interface_name(actual_interface), interfaces.subloop_all_class_method_decls_of_interface(actual_interface), $str_alt64$Interface_Class_Methods__);
                                        interfaces_display_interface_methods_in_html(subloop_structures.interface_name(actual_interface), interfaces.subloop_all_instance_method_decls_of_interface(actual_interface), $str_alt65$Interface_Instance_Methods__);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_classes_handle_display_object(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_name_as_string = html_utilities.html_extract_input($str_alt3$object_name, args);
                SubLObject object_name = (NIL != object_name_as_string) ? ((SubLObject) (intern(Strings.string_upcase(object_name_as_string, UNPROVIDED, UNPROVIDED), UNPROVIDED))) : NIL;
                if (NIL == object_name) {
                    cb_utilities.cb_error($str_alt66$Invalid_object_name_given___A, object_name_as_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                if (NIL != classes.classes_retrieve_class(object_name)) {
                    {
                        SubLObject title_var = $$$Class_Description;
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                            try {
                                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                html_macros.html_head_content_type();
                                cb_parameters.cb_head_shortcut_icon();
                                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                                if (NIL != title_var) {
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                    html_utilities.html_princ(title_var);
                                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                }
                                html_complete.html_complete_script();
                                html_complete.html_autocomplete_css();
                                html_complete.html_autocomplete_scripts();
                                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_26 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt51$yui_skin_sam);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != title_var) {
                                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_utilities.html_markup(TWO_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    html_utilities.html_princ(title_var);
                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_utilities.html_markup(TWO_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                }
                                                classes_display_class_in_html(object_name);
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_copyright_notice();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_26, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else
                    if (NIL != interfaces.interfaces_retrieve_interface(object_name)) {
                        {
                            SubLObject title_var = $$$Interface_Description;
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                                try {
                                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                    html_macros.html_head_content_type();
                                    cb_parameters.cb_head_shortcut_icon();
                                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                                    if (NIL != title_var) {
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                        html_utilities.html_princ(title_var);
                                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                    }
                                    html_complete.html_complete_script();
                                    html_complete.html_autocomplete_css();
                                    html_complete.html_autocomplete_scripts();
                                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_28 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                        try {
                                            html_macros.$html_inside_bodyP$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                            if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($str_alt51$yui_skin_sam);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    if (NIL != title_var) {
                                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                        html_utilities.html_markup(TWO_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        html_utilities.html_princ(title_var);
                                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                        html_utilities.html_markup(TWO_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    }
                                                    interfaces_display_interface_in_html(object_name);
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_copyright_notice();
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_28, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } else {
                        cb_utilities.cb_error($str_alt69$No_such_SubLOOP_object___A, object_name_as_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }

            }
            return NIL;
        }
    }

    public static final SubLObject cb_subloop_display_method_helper(SubLObject class_name, SubLObject method_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != class_name) && class_name.isSymbol())) {
                    Errors.error($str_alt71$CB_SUBLOOP_DISPLAY_METHOD_HELPER_, class_name);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != method_name) && method_name.isSymbol())) {
                    Errors.error($str_alt72$CB_SUBLOOP_DISPLAY_METHOD_HELPER_, method_name);
                }
            }
            {
                SubLObject actual_class = classes.classes_retrieve_class(class_name);
                SubLObject method_object = NIL;
                SubLObject method_type = NIL;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == actual_class) {
                        Errors.error($str_alt73$CB_SUBLOOP_DISPLAY_METHOD_HELPER_, class_name);
                    }
                }
                {
                    SubLObject v_class = actual_class;
                    SubLObject name = subloop_structures.class_name(v_class);
                    SubLObject compiled_instance_method_access_alist = subloop_structures.class_compiled_instance_method_access_alist(v_class);
                    SubLObject compiled_class_method_access_alist = subloop_structures.class_compiled_class_method_access_alist(v_class);
                    method_object = methods.method_assoc(method_name, compiled_class_method_access_alist);
                    if (NIL != method_object) {
                        method_type = $CLASS;
                    } else {
                        method_object = methods.method_assoc(method_name, compiled_instance_method_access_alist);
                        if (NIL != method_object) {
                            method_type = $INSTANCE;
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    html_utilities.html_newline(ONE_INTEGER);
                    html_utilities.html_princ($str_alt76$Method_Details_);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(TWO_INTEGER);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup(THREE_INTEGER);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup(THREE_INTEGER);
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject method = method_object;
                        SubLObject class_name_30 = subloop_structures.method_class_name(method);
                        SubLObject lambda_list = subloop_structures.method_lambda_list(method);
                        SubLObject protection = subloop_structures.method_protection(method);
                        SubLObject scope = subloop_structures.method_scope(method);
                        SubLObject function_name = subloop_structures.method_function_name(method);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup(THREE_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_princ($str_alt77$Method__);
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ(symbol_name(method_name));
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_utilities.html_newline(ONE_INTEGER);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_princ($str_alt78$Introduced_by_Class__);
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        cb_utilities.cb_link($SUBLOOP_CLASS_NAME, class_name_30, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_utilities.html_newline(ONE_INTEGER);
                        html_utilities.html_indent(TWO_INTEGER);
                        {
                            SubLObject pcase_var = method_type;
                            if (pcase_var.eql($CLASS)) {
                                html_utilities.html_newline(ONE_INTEGER);
                                html_utilities.html_indent(TWO_INTEGER);
                                html_utilities.html_princ($str_alt79$Method_Type__);
                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_utilities.html_princ($str_alt80$Class_Method_);
                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            } else
                                if (pcase_var.eql($INSTANCE)) {
                                    html_utilities.html_newline(ONE_INTEGER);
                                    html_utilities.html_indent(TWO_INTEGER);
                                    html_utilities.html_princ($str_alt79$Method_Type__);
                                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                    html_utilities.html_princ($str_alt81$Instance_Method_);
                                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                } else {
                                    Errors.error($str_alt82$CB_SUBLOOP_DISPLAY_METHOD_HELPER_, method_name);
                                }

                        }
                        html_utilities.html_newline(ONE_INTEGER);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_princ(format(NIL, $str_alt83$Method_Lambda_List__));
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ(format(NIL, $str_alt84$_S, lambda_list));
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_utilities.html_newline(ONE_INTEGER);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_princ($str_alt85$Protection_level__);
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ(symbol_name(protection));
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_utilities.html_newline(ONE_INTEGER);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_princ($str_alt86$Scope__);
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ(symbol_name(scope));
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_princ($str_alt87$Implemented_by_SubL_Function__);
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ(symbol_name(function_name));
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_utilities.html_newline(ONE_INTEGER);
                        html_utilities.html_indent(TWO_INTEGER);
                        html_utilities.html_princ($str_alt88$Function_Lambda_List__);
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ(format(NIL, $str_alt84$_S, cons(SELF, lambda_list)));
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup(THREE_INTEGER);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_subloop_display_method_internal(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject class_name = intern(html_arghash.get_arghash_value($CLASS_NAME, arghash), UNPROVIDED);
                SubLObject method_name = intern(html_arghash.get_arghash_value($METHOD_NAME, arghash), UNPROVIDED);
                SubLObject title_var = $$$Display_Method_Details;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        html_complete.html_autocomplete_css();
                        html_complete.html_autocomplete_scripts();
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_31 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt51$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                classes_display_page_header();
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                classes_construct_display_method_form();
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
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
                                                                cb_subloop_display_method_helper(class_name, method_name);
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
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_31, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_subloop_display_method(SubLObject args) {
        return cb_subloop_display_method_internal(html_arghash.arglist_to_arghash(args));
    }

    public static final SubLObject cb_link_subloop_display_method(SubLObject class_name, SubLObject method_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject href = format(NIL, $str_alt92$cg_cb_subloop_display_method__cla, class_name, method_name);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(href);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(method_name);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_subloop_handle_display_method(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_name_as_string = html_utilities.html_extract_input($str_alt8$object_name_for_method_form, args);
                SubLObject object_name = (NIL != object_name_as_string) ? ((SubLObject) (intern(Strings.string_upcase(object_name_as_string, UNPROVIDED, UNPROVIDED), UNPROVIDED))) : NIL;
                SubLObject method_name_as_string = html_utilities.html_extract_input($str_alt9$method_name, args);
                SubLObject method_name = (NIL != method_name_as_string) ? ((SubLObject) (intern(Strings.string_upcase(method_name_as_string, UNPROVIDED, UNPROVIDED), UNPROVIDED))) : NIL;
                if (NIL == object_name) {
                    cb_utilities.cb_error($str_alt66$Invalid_object_name_given___A, object_name_as_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                if (NIL == method_name) {
                    cb_utilities.cb_error($str_alt94$Invalid_method_name_given___A, method_name_as_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != classes.classes_retrieve_class(object_name)) {
                    {
                        SubLObject title_var = $$$Class_Description;
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                            try {
                                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                html_macros.html_head_content_type();
                                cb_parameters.cb_head_shortcut_icon();
                                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                                if (NIL != title_var) {
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                    html_utilities.html_princ(title_var);
                                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                }
                                html_complete.html_complete_script();
                                html_complete.html_autocomplete_css();
                                html_complete.html_autocomplete_scripts();
                                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_40 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt51$yui_skin_sam);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != title_var) {
                                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_utilities.html_markup(TWO_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    html_utilities.html_princ(title_var);
                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_utilities.html_markup(TWO_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                }
                                                cb_subloop_display_method_helper(object_name, method_name);
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_copyright_notice();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_40, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else
                    if (NIL != interfaces.interfaces_retrieve_interface(object_name)) {
                    } else {
                        cb_utilities.cb_error($str_alt69$No_such_SubLOOP_object___A, object_name_as_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }

            }
            return NIL;
        }
    }

    public static final SubLObject get_class_name_string(SubLObject v_class) {
        return symbol_name(subloop_structures.class_name(v_class));
    }

    public static final SubLObject decl_method_name_as_string(SubLObject method_decl) {
        return symbol_name(cadr(method_decl));
    }

    public static final SubLObject interfaces_display_interface_methods_in_html(SubLObject interface_name, SubLObject all_method_decls, SubLObject title) {
        if (NIL != all_method_decls) {
            html_utilities.html_newline(ONE_INTEGER);
            html_utilities.html_indent(TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup(THREE_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            html_utilities.html_princ(title);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup(THREE_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject cdolist_list_var = Sort.sort(all_method_decls, symbol_function($sym19$STRING_), symbol_function(DECL_METHOD_NAME_AS_STRING));
                SubLObject decl = NIL;
                for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , decl = cdolist_list_var.first()) {
                    {
                        SubLObject datum = decl;
                        SubLObject current = datum;
                        SubLObject method_type_tag = NIL;
                        SubLObject method_name = NIL;
                        SubLObject lambda_list = NIL;
                        SubLObject options = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt96);
                        method_type_tag = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt96);
                        method_name = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt96);
                        lambda_list = current.first();
                        current = current.rest();
                        options = current;
                        html_utilities.html_newline(ONE_INTEGER);
                        html_utilities.html_indent(FOUR_INTEGER);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ(method_name);
                        html_utilities.html_princ($str_alt34$__);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        {
                            SubLObject cdolist_list_var_42 = lambda_list;
                            SubLObject arg = NIL;
                            for (arg = cdolist_list_var_42.first(); NIL != cdolist_list_var_42; cdolist_list_var_42 = cdolist_list_var_42.rest() , arg = cdolist_list_var_42.first()) {
                                if (arg.isCons()) {
                                    html_utilities.html_princ(cconcatenate($str_alt35$___, new SubLObject[]{ symbol_name(arg.first().isSymbol() ? ((SubLObject) (arg.first())) : $ILL_FORMED_ARG), arg.rest().isCons() ? ((SubLObject) (format(NIL, $str_alt37$__S, cadr(arg)))) : $str_alt4$, $str_alt38$_ }));
                                } else {
                                    html_utilities.html_princ(format(NIL, $str_alt39$___S, arg));
                                }
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        {
                            SubLObject introduced_by = interfaces.interfaces_who_introduced_method(interface_name, method_name);
                            SubLObject method_protection_level = methods.methods_protection_level_of_method_decl(options);
                            SubLObject method_scope_level = methods.methods_scope_level_of_method_decl(options);
                            html_utilities.html_newline(ONE_INTEGER);
                            html_utilities.html_indent(EIGHT_INTEGER);
                            html_utilities.html_princ($str_alt97$__Introduced_by_interface__);
                            cb_utilities.cb_link($SUBLOOP_INTERFACE_NAME, introduced_by, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_newline(ONE_INTEGER);
                            html_utilities.html_indent(EIGHT_INTEGER);
                            html_utilities.html_princ(cconcatenate($str_alt40$__Protection_level__, symbol_name(method_protection_level)));
                            html_utilities.html_newline(ONE_INTEGER);
                            html_utilities.html_indent(EIGHT_INTEGER);
                            html_utilities.html_princ(cconcatenate($str_alt41$__Scope__, symbol_name(NIL != method_scope_level ? ((SubLObject) (method_scope_level)) : $GLOBAL_SCOPE)));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_subloop_interface_name_internal(SubLObject arghash) {
        {
            SubLObject interface_name = intern(html_arghash.get_arghash_value($INTERFACE_NAME, arghash), UNPROVIDED);
            return interfaces_display_interface_in_html(interface_name);
        }
    }

    public static final SubLObject cb_subloop_interface_name(SubLObject args) {
        return cb_subloop_interface_name_internal(html_arghash.arglist_to_arghash(args));
    }

    public static final SubLObject cb_link_subloop_interface_name(SubLObject interface_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject href = format(NIL, $str_alt102$cg_cb_subloop_interface_name__int, interface_name);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(href);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(interface_name);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject interfaces_display_interface_name_in_html_at_depth(SubLObject interface_name, SubLObject depth) {
        html_utilities.html_indent(depth);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        cb_utilities.cb_link($SUBLOOP_INTERFACE_NAME, interface_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_newline(ONE_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        return interface_name;
    }

    public static final SubLObject interfaces_display_hierarchy_in_html(SubLObject base_interface_symbolic_name, SubLObject base_depth) {
        html_utilities.html_newline(ONE_INTEGER);
        html_utilities.html_indent(base_depth);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($str_alt104$Interface_Ancestor_Hierarchy_for_);
        cb_utilities.cb_link($SUBLOOP_INTERFACE_NAME, base_interface_symbolic_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_princ($str_alt105$_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline(ONE_INTEGER);
        {
            SubLObject queue = list(cons(base_interface_symbolic_name, ZERO_INTEGER));
            SubLObject current_interface = NIL;
            SubLObject interface_symbolic_name = NIL;
            SubLObject depth = NIL;
            SubLObject next_generation = NIL;
            while (NIL != queue) {
                current_interface = queue.first();
                interface_symbolic_name = current_interface.first();
                depth = current_interface.rest();
                queue = queue.rest();
                interfaces_display_interface_name_in_html_at_depth(interface_symbolic_name, add(base_depth, multiply(depth, TWO_INTEGER)));
                final SubLObject interfaces_retrieve_interface = interfaces.interfaces_retrieve_interface(current_interface.first());
		next_generation = copy_list(subloop_structures.interface_parents(interfaces_retrieve_interface));
                {
                    SubLObject processed_next_generation = NIL;
                    SubLObject new_depth = add(depth, ONE_INTEGER);
                    SubLObject list_expression = next_generation;
                    if (NIL == list_expression) {
                        processed_next_generation = NIL;
                    } else
                        if (list_expression.isAtom()) {
                            processed_next_generation = list(list_expression);
                        } else
                            if (NIL == list_expression.rest()) {
                                {
                                    SubLObject interface_name = list_expression.first();
                                    processed_next_generation = list(cons(interface_name, new_depth));
                                }
                            } else {
                                {
                                    SubLObject tail_cons = NIL;
                                    SubLObject result = NIL;
                                    {
                                        SubLObject interface_name = list_expression.first();
                                        processed_next_generation = list(cons(interface_name, new_depth));
                                        tail_cons = processed_next_generation;
                                    }
                                    {
                                        SubLObject cdolist_list_var = list_expression.rest();
                                        SubLObject interface_name = NIL;
                                        for (interface_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interface_name = cdolist_list_var.first()) {
                                            result = list(cons(interface_name, new_depth));
                                            rplacd(tail_cons, result);
                                            tail_cons = result;
                                        }
                                    }
                                }
                            }


                    next_generation = processed_next_generation;
                }
                queue = nconc(next_generation, queue);
            } 
        }
        html_utilities.html_newline(ONE_INTEGER);
        html_utilities.html_indent(base_depth);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($str_alt106$Interface_Descendant_Hierarchy_fo);
        cb_utilities.cb_link($SUBLOOP_INTERFACE_NAME, base_interface_symbolic_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_princ($str_alt105$_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline(ONE_INTEGER);
        {
            SubLObject queue = list(cons(base_interface_symbolic_name, ZERO_INTEGER));
            SubLObject current_interface = NIL;
            SubLObject interface_symbolic_name = NIL;
            SubLObject depth = NIL;
            SubLObject next_generation = NIL;
            while (NIL != queue) {
                current_interface = queue.first();
                interface_symbolic_name = current_interface.first();
                depth = current_interface.rest();
                queue = queue.rest();
                interfaces_display_interface_name_in_html_at_depth(interface_symbolic_name, add(base_depth, multiply(depth, TWO_INTEGER)));
                next_generation = copy_list(subloop_structures.interface_subinterfaces(interfaces.interfaces_retrieve_interface(current_interface.first())));
                {
                    SubLObject processed_next_generation = NIL;
                    SubLObject new_depth = add(depth, ONE_INTEGER);
                    SubLObject list_expression = next_generation;
                    if (NIL == list_expression) {
                        processed_next_generation = NIL;
                    } else
                        if (list_expression.isAtom()) {
                            processed_next_generation = list(list_expression);
                        } else
                            if (NIL == list_expression.rest()) {
                                {
                                    SubLObject interface_name = list_expression.first();
                                    processed_next_generation = list(cons(interface_name, new_depth));
                                }
                            } else {
                                {
                                    SubLObject tail_cons = NIL;
                                    SubLObject result = NIL;
                                    {
                                        SubLObject interface_name = list_expression.first();
                                        processed_next_generation = list(cons(interface_name, new_depth));
                                        tail_cons = processed_next_generation;
                                    }
                                    {
                                        SubLObject cdolist_list_var = list_expression.rest();
                                        SubLObject interface_name = NIL;
                                        for (interface_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interface_name = cdolist_list_var.first()) {
                                            result = list(cons(interface_name, new_depth));
                                            rplacd(tail_cons, result);
                                            tail_cons = result;
                                        }
                                    }
                                }
                            }


                    next_generation = processed_next_generation;
                }
                queue = nconc(next_generation, queue);
            } 
        }
        html_utilities.html_newline(ONE_INTEGER);
        return base_interface_symbolic_name;
    }

    public static final SubLObject cb_interfaces_display_hierarchy_in_html_internal(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interface_name_as_string = html_arghash.get_arghash_value($INTERFACE_NAME, arghash);
                SubLObject interface_name = (NIL != interface_name_as_string) ? ((SubLObject) (intern(Strings.string_upcase(interface_name_as_string, UNPROVIDED, UNPROVIDED), UNPROVIDED))) : NIL;
                SubLObject title_var = $$$Display_Interface_Hierarchy;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        html_complete.html_autocomplete_css();
                        html_complete.html_autocomplete_scripts();
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_43 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt51$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                classes_construct_display_object_form();
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                classes_construct_display_method_form();
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
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
                                                                interfaces_display_hierarchy_in_html(interface_name, ZERO_INTEGER);
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
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_43, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_interfaces_display_hierarchy_in_html(SubLObject args) {
        return cb_interfaces_display_hierarchy_in_html_internal(html_arghash.arglist_to_arghash(args));
    }

    public static final SubLObject cb_link_subloop_interface_hierarchy(SubLObject interface_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject href = cconcatenate($str_alt109$cg_cb_interfaces_display_hierarch, symbol_name(interface_name));
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(href);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ($$$Display_Interface_Hierarchy);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     * Define a cyc browser link method called :subloop-browser.
     */
    public static final SubLObject cb_link_subloop_browser(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Browse_SubLOOP;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt113$cb_classes_display_hierarchy_in_h);
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
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject declare_cb_subloop_file() {
        declareFunction("classes_construct_display_object_form", "CLASSES-CONSTRUCT-DISPLAY-OBJECT-FORM", 0, 0, false);
        declareFunction("classes_construct_display_method_form", "CLASSES-CONSTRUCT-DISPLAY-METHOD-FORM", 0, 0, false);
        declareFunction("classes_display_page_header", "CLASSES-DISPLAY-PAGE-HEADER", 0, 0, false);
        declareFunction("get_slot_name_string", "GET-SLOT-NAME-STRING", 1, 0, false);
        declareFunction("get_method_name_string", "GET-METHOD-NAME-STRING", 1, 0, false);
        declareFunction("unique_method_p", "UNIQUE-METHOD-P", 2, 0, false);
        declareFunction("uniquify_method_list", "UNIQUIFY-METHOD-LIST", 1, 0, false);
        declareFunction("classes_display_class_in_html", "CLASSES-DISPLAY-CLASS-IN-HTML", 1, 0, false);
        declareFunction("cb_subloop_class_name_internal", "CB-SUBLOOP-CLASS-NAME-INTERNAL", 1, 0, false);
        declareFunction("cb_subloop_class_name", "CB-SUBLOOP-CLASS-NAME", 1, 0, false);
        declareFunction("cb_link_subloop_class_name", "CB-LINK-SUBLOOP-CLASS-NAME", 1, 0, false);
        declareFunction("classes_display_class_name_in_html_at_depth", "CLASSES-DISPLAY-CLASS-NAME-IN-HTML-AT-DEPTH", 2, 0, false);
        declareFunction("classes_display_hierarchy_in_html", "CLASSES-DISPLAY-HIERARCHY-IN-HTML", 1, 0, false);
        declareFunction("cb_classes_display_hierarchy_in_html", "CB-CLASSES-DISPLAY-HIERARCHY-IN-HTML", 1, 0, false);
        declareFunction("cb_link_subloop_class_hierarchy", "CB-LINK-SUBLOOP-CLASS-HIERARCHY", 0, 0, false);
        declareFunction("cb_classes_display_object", "CB-CLASSES-DISPLAY-OBJECT", 1, 0, false);
        declareFunction("interfaces_display_interface_in_html", "INTERFACES-DISPLAY-INTERFACE-IN-HTML", 1, 0, false);
        declareFunction("cb_classes_handle_display_object", "CB-CLASSES-HANDLE-DISPLAY-OBJECT", 1, 0, false);
        declareFunction("cb_subloop_display_method_helper", "CB-SUBLOOP-DISPLAY-METHOD-HELPER", 2, 0, false);
        declareFunction("cb_subloop_display_method_internal", "CB-SUBLOOP-DISPLAY-METHOD-INTERNAL", 1, 0, false);
        declareFunction("cb_subloop_display_method", "CB-SUBLOOP-DISPLAY-METHOD", 1, 0, false);
        declareFunction("cb_link_subloop_display_method", "CB-LINK-SUBLOOP-DISPLAY-METHOD", 2, 0, false);
        declareFunction("cb_subloop_handle_display_method", "CB-SUBLOOP-HANDLE-DISPLAY-METHOD", 1, 0, false);
        declareFunction("get_class_name_string", "GET-CLASS-NAME-STRING", 1, 0, false);
        declareFunction("decl_method_name_as_string", "DECL-METHOD-NAME-AS-STRING", 1, 0, false);
        declareFunction("interfaces_display_interface_methods_in_html", "INTERFACES-DISPLAY-INTERFACE-METHODS-IN-HTML", 3, 0, false);
        declareFunction("cb_subloop_interface_name_internal", "CB-SUBLOOP-INTERFACE-NAME-INTERNAL", 1, 0, false);
        declareFunction("cb_subloop_interface_name", "CB-SUBLOOP-INTERFACE-NAME", 1, 0, false);
        declareFunction("cb_link_subloop_interface_name", "CB-LINK-SUBLOOP-INTERFACE-NAME", 1, 0, false);
        declareFunction("interfaces_display_interface_name_in_html_at_depth", "INTERFACES-DISPLAY-INTERFACE-NAME-IN-HTML-AT-DEPTH", 2, 0, false);
        declareFunction("interfaces_display_hierarchy_in_html", "INTERFACES-DISPLAY-HIERARCHY-IN-HTML", 2, 0, false);
        declareFunction("cb_interfaces_display_hierarchy_in_html_internal", "CB-INTERFACES-DISPLAY-HIERARCHY-IN-HTML-INTERNAL", 1, 0, false);
        declareFunction("cb_interfaces_display_hierarchy_in_html", "CB-INTERFACES-DISPLAY-HIERARCHY-IN-HTML", 1, 0, false);
        declareFunction("cb_link_subloop_interface_hierarchy", "CB-LINK-SUBLOOP-INTERFACE-HIERARCHY", 1, 0, false);
        declareFunction("cb_link_subloop_browser", "CB-LINK-SUBLOOP-BROWSER", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_cb_subloop_file() {
        defconstant("*CB-OBJECT-NAME-INPUT-WIDTH*", $int$60);
        defconstant("*CB-METHOD-NAME-INPUT-WIDTH*", $int$60);
        return NIL;
    }

    public static final SubLObject setup_cb_subloop_file() {
                html_macros.note_html_handler_function(CB_SUBLOOP_CLASS_NAME);
        cb_utilities.setup_cb_link_method($SUBLOOP_CLASS_NAME, CB_LINK_SUBLOOP_CLASS_NAME, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_CLASSES_DISPLAY_HIERARCHY_IN_HTML);
        cb_utilities.setup_cb_link_method($SUBLOOP_CLASS_HIERARCHY, CB_LINK_SUBLOOP_CLASS_HIERARCHY, ZERO_INTEGER);
        html_macros.note_html_handler_function(CB_CLASSES_DISPLAY_OBJECT);
        html_macros.note_html_handler_function(CB_CLASSES_HANDLE_DISPLAY_OBJECT);
        html_macros.note_html_handler_function(CB_SUBLOOP_DISPLAY_METHOD);
        cb_utilities.setup_cb_link_method($SUBLOOP_DISPLAY_METHOD, CB_LINK_SUBLOOP_DISPLAY_METHOD, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_SUBLOOP_HANDLE_DISPLAY_METHOD);
        html_macros.note_html_handler_function(CB_SUBLOOP_INTERFACE_NAME);
        cb_utilities.setup_cb_link_method($SUBLOOP_INTERFACE_NAME, CB_LINK_SUBLOOP_INTERFACE_NAME, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_INTERFACES_DISPLAY_HIERARCHY_IN_HTML);
        cb_utilities.setup_cb_link_method($SUBLOOP_INTERFACE_HIERARCHY, CB_LINK_SUBLOOP_INTERFACE_HIERARCHY, ONE_INTEGER);
        cb_utilities.setup_cb_link_method($SUBLOOP_BROWSER, CB_LINK_SUBLOOP_BROWSER, ONE_INTEGER);
        cb_utilities.declare_cb_tool($SUBLOOP_BROWSER, $$$Browse_SubLOOP, $$$SubLOOP, $$$SubLOOP_Browser);
        return NIL;
    }

    // // Internal Constants
    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $str_alt1$cb_classes_handle_display_object = makeString("cb-classes-handle-display-object");

    static private final SubLString $str_alt2$Enter_a_class_or_interface_name_ = makeString("Enter a class or interface name:");

    static private final SubLString $str_alt3$object_name = makeString("object-name");

    static private final SubLString $str_alt4$ = makeString("");

    static private final SubLString $$$Clear_Object_Name = makeString("Clear Object Name");

    static private final SubLString $$$Display_Object = makeString("Display Object");

    static private final SubLString $str_alt7$cb_subloop_handle_display_method = makeString("cb-subloop-handle-display-method");

    static private final SubLString $str_alt8$object_name_for_method_form = makeString("object-name-for-method-form");

    static private final SubLString $str_alt9$method_name = makeString("method-name");

    static private final SubLString $$$Clear_Method_Name = makeString("Clear Method Name");

    static private final SubLString $$$Display_Method_Details = makeString("Display Method Details");

    private static final SubLSymbol $SUBLOOP_CLASS_HIERARCHY = makeKeyword("SUBLOOP-CLASS-HIERARCHY");

    static private final SubLString $str_alt13$_S_is_not_a_defined_class_ = makeString("~S is not a defined class.");

    static private final SubLString $str_alt14$Description_of_class__S_ = makeString("Description of class ~S:");

    static private final SubLString $str_alt15$Class_Inheritance_Path__ = makeString("Class Inheritance Path: ");

    private static final SubLSymbol $SUBLOOP_CLASS_NAME = makeKeyword("SUBLOOP-CLASS-NAME");

    static private final SubLString $str_alt17$__ = makeString(", ");

    static private final SubLString $str_alt18$Direct_Subclasses__ = makeString("Direct Subclasses: ");

    static private final SubLSymbol $sym19$STRING_ = makeSymbol("STRING<");



    static private final SubLString $str_alt21$Implements_Interfaces__ = makeString("Implements Interfaces: ");

    private static final SubLSymbol $SUBLOOP_INTERFACE_NAME = makeKeyword("SUBLOOP-INTERFACE-NAME");

    static private final SubLString $str_alt23$Class_Slots__boolean__ = makeString("Class Slots (boolean):");

    static private final SubLString $str_alt24$__Introduced_by_class__ = makeString("- Introduced by class: ");

    static private final SubLString $str_alt25$_ = makeString(".");

    static private final SubLString $str_alt26$__Protection_level___S_ = makeString("- Protection level: ~S.");

    static private final SubLString $str_alt27$__Initial_value___S_ = makeString("- Initial value: ~S.");

    private static final SubLSymbol GET_SLOT_NAME_STRING = makeSymbol("GET-SLOT-NAME-STRING");

    static private final SubLString $str_alt29$Class_Slots__normal__ = makeString("Class Slots (normal):");

    static private final SubLString $str_alt30$Instance_Slots__boolean__ = makeString("Instance Slots (boolean):");

    static private final SubLString $str_alt31$Instance_Slots__normal__ = makeString("Instance Slots (normal):");

    static private final SubLString $str_alt32$Class_Methods__ = makeString("Class Methods: ");

    private static final SubLSymbol $SUBLOOP_DISPLAY_METHOD = makeKeyword("SUBLOOP-DISPLAY-METHOD");

    static private final SubLString $str_alt34$__ = makeString("  ");

    static private final SubLString $str_alt35$___ = makeString("  (");

    private static final SubLSymbol $ILL_FORMED_ARG = makeKeyword("ILL-FORMED-ARG");

    static private final SubLString $str_alt37$__S = makeString(" ~S");

    static private final SubLString $str_alt38$_ = makeString(")");

    static private final SubLString $str_alt39$___S = makeString("  ~S");

    static private final SubLString $str_alt40$__Protection_level__ = makeString("- Protection level: ");

    static private final SubLString $str_alt41$__Scope__ = makeString("- Scope: ");

    private static final SubLSymbol GET_METHOD_NAME_STRING = makeSymbol("GET-METHOD-NAME-STRING");

    static private final SubLString $str_alt43$Instance_Methods__ = makeString("Instance Methods: ");



    private static final SubLSymbol CB_SUBLOOP_CLASS_NAME = makeSymbol("CB-SUBLOOP-CLASS-NAME");

    static private final SubLString $str_alt46$cg_cb_subloop_class_name__class_n = makeString("cg?cb-subloop-class-name&:class-name=~A");

    private static final SubLSymbol CB_LINK_SUBLOOP_CLASS_NAME = makeSymbol("CB-LINK-SUBLOOP-CLASS-NAME");

    static private final SubLString $$$Display_Class_Hierarchy = makeString("Display Class Hierarchy");



    static private final SubLString $str_alt50$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt51$yui_skin_sam = makeString("yui-skin-sam");



    private static final SubLSymbol CB_CLASSES_DISPLAY_HIERARCHY_IN_HTML = makeSymbol("CB-CLASSES-DISPLAY-HIERARCHY-IN-HTML");

    static private final SubLString $str_alt54$cg_cb_classes_display_hierarchy_i = makeString("cg?cb-classes-display-hierarchy-in-html");

    private static final SubLSymbol CB_LINK_SUBLOOP_CLASS_HIERARCHY = makeSymbol("CB-LINK-SUBLOOP-CLASS-HIERARCHY");

    private static final SubLSymbol CB_CLASSES_DISPLAY_OBJECT = makeSymbol("CB-CLASSES-DISPLAY-OBJECT");

    static private final SubLString $str_alt57$_S_is_not_a_defined_interface = makeString("~S is not a defined interface");

    private static final SubLSymbol $SUBLOOP_INTERFACE_HIERARCHY = makeKeyword("SUBLOOP-INTERFACE-HIERARCHY");

    static private final SubLString $str_alt59$Description_of_interface__S_ = makeString("Description of interface ~S:");

    static private final SubLString $str_alt60$Parent_Interfaces__ = makeString("Parent Interfaces: ");

    static private final SubLString $str_alt61$Child_Interfaces__ = makeString("Child Interfaces: ");

    static private final SubLString $str_alt62$Implementing_Classes__ = makeString("Implementing Classes: ");

    private static final SubLSymbol GET_CLASS_NAME_STRING = makeSymbol("GET-CLASS-NAME-STRING");

    static private final SubLString $str_alt64$Interface_Class_Methods__ = makeString("Interface Class Methods: ");

    static private final SubLString $str_alt65$Interface_Instance_Methods__ = makeString("Interface Instance Methods: ");

    static private final SubLString $str_alt66$Invalid_object_name_given___A = makeString("Invalid object name given: ~A");

    static private final SubLString $$$Class_Description = makeString("Class Description");

    static private final SubLString $$$Interface_Description = makeString("Interface Description");

    static private final SubLString $str_alt69$No_such_SubLOOP_object___A = makeString("No such SubLOOP object: ~A");

    private static final SubLSymbol CB_CLASSES_HANDLE_DISPLAY_OBJECT = makeSymbol("CB-CLASSES-HANDLE-DISPLAY-OBJECT");

    static private final SubLString $str_alt71$CB_SUBLOOP_DISPLAY_METHOD_HELPER_ = makeString("CB-SUBLOOP-DISPLAY-METHOD-HELPER: ~S is not a valid class name.  A symbol was expected.");

    static private final SubLString $str_alt72$CB_SUBLOOP_DISPLAY_METHOD_HELPER_ = makeString("CB-SUBLOOP-DISPLAY-METHOD-HELPER: ~S is not a valid method name.  A symbol was expected.");

    static private final SubLString $str_alt73$CB_SUBLOOP_DISPLAY_METHOD_HELPER_ = makeString("CB-SUBLOOP-DISPLAY-METHOD-HELPER: ~S does not name a defined class.");





    static private final SubLString $str_alt76$Method_Details_ = makeString("Method Details:");

    static private final SubLString $str_alt77$Method__ = makeString("Method: ");

    static private final SubLString $str_alt78$Introduced_by_Class__ = makeString("Introduced by Class: ");

    static private final SubLString $str_alt79$Method_Type__ = makeString("Method Type: ");

    static private final SubLString $str_alt80$Class_Method_ = makeString("Class Method.");

    static private final SubLString $str_alt81$Instance_Method_ = makeString("Instance Method.");

    static private final SubLString $str_alt82$CB_SUBLOOP_DISPLAY_METHOD_HELPER_ = makeString("CB-SUBLOOP-DISPLAY-METHOD-HELPER: Invalid method ~S");

    static private final SubLString $str_alt83$Method_Lambda_List__ = makeString("Method Lambda List: ");

    static private final SubLString $str_alt84$_S = makeString("~S");

    static private final SubLString $str_alt85$Protection_level__ = makeString("Protection level: ");

    static private final SubLString $str_alt86$Scope__ = makeString("Scope: ");

    static private final SubLString $str_alt87$Implemented_by_SubL_Function__ = makeString("Implemented by SubL Function: ");

    static private final SubLString $str_alt88$Function_Lambda_List__ = makeString("Function Lambda List: ");





    private static final SubLSymbol CB_SUBLOOP_DISPLAY_METHOD = makeSymbol("CB-SUBLOOP-DISPLAY-METHOD");

    static private final SubLString $str_alt92$cg_cb_subloop_display_method__cla = makeString("cg?cb-subloop-display-method&:class-name=~A&::method-name=~A");

    private static final SubLSymbol CB_LINK_SUBLOOP_DISPLAY_METHOD = makeSymbol("CB-LINK-SUBLOOP-DISPLAY-METHOD");

    static private final SubLString $str_alt94$Invalid_method_name_given___A = makeString("Invalid method name given: ~A");

    private static final SubLSymbol CB_SUBLOOP_HANDLE_DISPLAY_METHOD = makeSymbol("CB-SUBLOOP-HANDLE-DISPLAY-METHOD");

    static private final SubLList $list_alt96 = listS(makeSymbol("METHOD-TYPE-TAG"), makeSymbol("METHOD-NAME"), makeSymbol("LAMBDA-LIST"), makeSymbol("OPTIONS"));

    static private final SubLString $str_alt97$__Introduced_by_interface__ = makeString("- Introduced by interface: ");



    private static final SubLSymbol DECL_METHOD_NAME_AS_STRING = makeSymbol("DECL-METHOD-NAME-AS-STRING");

    private static final SubLSymbol $INTERFACE_NAME = makeKeyword("INTERFACE-NAME");

    private static final SubLSymbol CB_SUBLOOP_INTERFACE_NAME = makeSymbol("CB-SUBLOOP-INTERFACE-NAME");

    static private final SubLString $str_alt102$cg_cb_subloop_interface_name__int = makeString("cg?cb-subloop-interface-name&:interface-name=~A");

    private static final SubLSymbol CB_LINK_SUBLOOP_INTERFACE_NAME = makeSymbol("CB-LINK-SUBLOOP-INTERFACE-NAME");

    static private final SubLString $str_alt104$Interface_Ancestor_Hierarchy_for_ = makeString("Interface Ancestor Hierarchy for Interface ");

    static private final SubLString $str_alt105$_ = makeString(":");

    static private final SubLString $str_alt106$Interface_Descendant_Hierarchy_fo = makeString("Interface Descendant Hierarchy for Interface ");

    static private final SubLString $$$Display_Interface_Hierarchy = makeString("Display Interface Hierarchy");

    private static final SubLSymbol CB_INTERFACES_DISPLAY_HIERARCHY_IN_HTML = makeSymbol("CB-INTERFACES-DISPLAY-HIERARCHY-IN-HTML");

    static private final SubLString $str_alt109$cg_cb_interfaces_display_hierarch = makeString("cg?cb-interfaces-display-hierarchy-in-html&:interface-name=");

    private static final SubLSymbol CB_LINK_SUBLOOP_INTERFACE_HIERARCHY = makeSymbol("CB-LINK-SUBLOOP-INTERFACE-HIERARCHY");

    static private final SubLString $$$Browse_SubLOOP = makeString("Browse SubLOOP");



    static private final SubLString $str_alt113$cb_classes_display_hierarchy_in_h = makeString("cb-classes-display-hierarchy-in-html");

    private static final SubLSymbol $SUBLOOP_BROWSER = makeKeyword("SUBLOOP-BROWSER");

    private static final SubLSymbol CB_LINK_SUBLOOP_BROWSER = makeSymbol("CB-LINK-SUBLOOP-BROWSER");

    static private final SubLString $$$SubLOOP = makeString("SubLOOP");

    static private final SubLString $$$SubLOOP_Browser = makeString("SubLOOP Browser");

    // // Initializers
    public void declareFunctions() {
        declare_cb_subloop_file();
    }

    public void initializeVariables() {
        init_cb_subloop_file();
    }

    public void runTopLevelForms() {
        setup_cb_subloop_file();
    }
}

